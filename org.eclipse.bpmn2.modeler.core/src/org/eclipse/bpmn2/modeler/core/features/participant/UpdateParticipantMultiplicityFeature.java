/******************************************************************************* 
 * Copyright (c) 2011, 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author Ivar Meikas
 ******************************************************************************/
package org.eclipse.bpmn2.modeler.core.features.participant;

import org.eclipse.bpmn2.ChoreographyActivity;
import org.eclipse.bpmn2.Participant;
import org.eclipse.bpmn2.ParticipantMultiplicity;
import org.eclipse.bpmn2.modeler.core.features.ContextConstants;
import org.eclipse.bpmn2.modeler.core.utils.BusinessObjectUtil;
import org.eclipse.bpmn2.modeler.core.utils.FeatureSupport;
import org.eclipse.bpmn2.modeler.core.utils.StyleUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeService;

public class UpdateParticipantMultiplicityFeature extends AbstractUpdateFeature {

	public static final String MULTIPLICITY_MARKER = "multiplicity.marker"; //$NON-NLS-1$

	public UpdateParticipantMultiplicityFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		EObject container = context.getPictogramElement().eContainer();
		if (container instanceof PictogramElement) {
			PictogramElement containerElem = (PictogramElement) container;
			if (BusinessObjectUtil.containsElementOfType(containerElem, ChoreographyActivity.class)) {
				return false;
			}
		}
		return BusinessObjectUtil.containsElementOfType(context.getPictogramElement(), Participant.class)
				&& context.getPictogramElement() instanceof ContainerShape;
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		Object value = context.getProperty(ContextConstants.BUSINESS_OBJECT);
		if (value instanceof EObject) {
			// if the UpdateContext has a "businessObject" property, then this update is needed
			// as part of the the CreateFeature ("businessObject" is only set in the CreateFeature)
			return Reason.createTrueReason("Initial update");
		}
		EObject container = context.getPictogramElement().eContainer();
		if (container instanceof PictogramElement) {
			PictogramElement containerElem = (PictogramElement) container;
			if (BusinessObjectUtil.containsElementOfType(containerElem, ChoreographyActivity.class)) {
				return Reason.createFalseReason();
			}
		}
		if (!(context.getPictogramElement() instanceof ContainerShape)) {
			return Reason.createFalseReason();
		}
		IPeService peService = Graphiti.getPeService();
		Participant participant = (Participant) BusinessObjectUtil.getFirstElementOfType(context.getPictogramElement(),
				Participant.class);
		ContainerShape containerShape = (ContainerShape) context.getPictogramElement();

		boolean multiplicityProperty = new Boolean(peService.getPropertyValue(containerShape,
				AddParticipantFeature.MULTIPLICITY));

		boolean hasMultiplicity = false;
		ParticipantMultiplicity pm = participant.getParticipantMultiplicity();
		if (pm!=null && pm.getMaximum()>1) {
			hasMultiplicity = true;
		}

		return multiplicityProperty != hasMultiplicity ? Reason.createTrueReason() : Reason.createFalseReason();
	}

	@Override
	public boolean update(IUpdateContext context) {
		IPeService peService = Graphiti.getPeService();
		IGaService gaService = Graphiti.getGaService();

		Participant participant = (Participant) BusinessObjectUtil.getFirstElementOfType(context.getPictogramElement(),
				Participant.class);
		ContainerShape containerShape = (ContainerShape) context.getPictogramElement();

		boolean hasMultiplicity = false;
		ParticipantMultiplicity pm = participant.getParticipantMultiplicity();
		if (pm!=null && pm.getMaximum()>1) {
			Shape shape = peService.createShape(containerShape, false);
			peService.setPropertyValue(shape, MULTIPLICITY_MARKER, Boolean.toString(true));
			Rectangle invisibleRectangle = gaService.createInvisibleRectangle(shape);
			GraphicsAlgorithm parentGa = containerShape.getGraphicsAlgorithm();
			int x = (parentGa.getWidth() / 2) - 10;
			int y = parentGa.getHeight() - 20;
			gaService.setLocationAndSize(invisibleRectangle, x, y, 20, 20);

			Polyline line1 = gaService.createPolyline(invisibleRectangle, new int[] { 0, 0, 0, 15 });
			line1.setLineWidth(2);
			line1.setForeground(manageColor(StyleUtil.CLASS_FOREGROUND));
			Polyline line2 = gaService.createPolyline(invisibleRectangle, new int[] { 5, 0, 5, 15 });
			line2.setForeground(manageColor(StyleUtil.CLASS_FOREGROUND));
			line2.setLineWidth(2);
			Polyline line3 = gaService.createPolyline(invisibleRectangle, new int[] { 10, 0, 10, 15 });
			line3.setForeground(manageColor(StyleUtil.CLASS_FOREGROUND));
			line3.setLineWidth(2);
			hasMultiplicity = true;
		} else {
			Shape shape = FeatureSupport.getShape(containerShape, MULTIPLICITY_MARKER, Boolean.toString(true));
			if (shape != null) {
				peService.deletePictogramElement(shape);
			}
		}

		peService.setPropertyValue(containerShape, AddParticipantFeature.MULTIPLICITY, 
				hasMultiplicity ? Boolean.toString(true) : Boolean.toString(false));
		return true;
	}
}