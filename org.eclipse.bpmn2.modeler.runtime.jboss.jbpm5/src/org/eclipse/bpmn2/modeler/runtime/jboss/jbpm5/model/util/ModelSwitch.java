/*******************************************************************************
 * Copyright (c) 2011, 2012 Red Hat, Inc. 
 * All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 *
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *******************************************************************************/
package org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.model.util;

import java.util.List;

import org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn2.modeler.runtime.jboss.jbpm5.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.BETA_DISTRIBUTION_TYPE: {
				BetaDistributionType betaDistributionType = (BetaDistributionType)theEObject;
				T result = caseBetaDistributionType(betaDistributionType);
				if (result == null) result = caseDistributionParameter(betaDistributionType);
				if (result == null) result = caseParameterValue(betaDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BINOMIAL_DISTRIBUTION_TYPE: {
				BinomialDistributionType binomialDistributionType = (BinomialDistributionType)theEObject;
				T result = caseBinomialDistributionType(binomialDistributionType);
				if (result == null) result = caseDistributionParameter(binomialDistributionType);
				if (result == null) result = caseParameterValue(binomialDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOOLEAN_PARAMETER_TYPE: {
				BooleanParameterType booleanParameterType = (BooleanParameterType)theEObject;
				T result = caseBooleanParameterType(booleanParameterType);
				if (result == null) result = caseConstantParameter(booleanParameterType);
				if (result == null) result = caseParameterValue(booleanParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CALENDAR: {
				Calendar calendar = (Calendar)theEObject;
				T result = caseCalendar(calendar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = caseBpmn2_DocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GLOBAL_TYPE: {
				GlobalType globalType = (GlobalType)theEObject;
				T result = caseGlobalType(globalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONTROL_PARAMETERS: {
				ControlParameters controlParameters = (ControlParameters)theEObject;
				T result = caseControlParameters(controlParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONSTANT_PARAMETER: {
				ConstantParameter constantParameter = (ConstantParameter)theEObject;
				T result = caseConstantParameter(constantParameter);
				if (result == null) result = caseParameterValue(constantParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COST_PARAMETERS: {
				CostParameters costParameters = (CostParameters)theEObject;
				T result = caseCostParameters(costParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMPORT_TYPE: {
				ImportType importType = (ImportType)theEObject;
				T result = caseImportType(importType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATE_TIME_PARAMETER_TYPE: {
				DateTimeParameterType dateTimeParameterType = (DateTimeParameterType)theEObject;
				T result = caseDateTimeParameterType(dateTimeParameterType);
				if (result == null) result = caseConstantParameter(dateTimeParameterType);
				if (result == null) result = caseParameterValue(dateTimeParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DECIMAL_PARAMETER_TYPE: {
				DecimalParameterType decimalParameterType = (DecimalParameterType)theEObject;
				T result = caseDecimalParameterType(decimalParameterType);
				if (result == null) result = caseConstantParameter(decimalParameterType);
				if (result == null) result = caseParameterValue(decimalParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ON_ENTRY_SCRIPT_TYPE: {
				OnEntryScriptType onEntryScriptType = (OnEntryScriptType)theEObject;
				T result = caseOnEntryScriptType(onEntryScriptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ELEMENT_PARAMETERS: {
				ElementParameters elementParameters = (ElementParameters)theEObject;
				T result = caseElementParameters(elementParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ON_EXIT_SCRIPT_TYPE: {
				OnExitScriptType onExitScriptType = (OnExitScriptType)theEObject;
				T result = caseOnExitScriptType(onExitScriptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DURATION_PARAMETER_TYPE: {
				DurationParameterType durationParameterType = (DurationParameterType)theEObject;
				T result = caseDurationParameterType(durationParameterType);
				if (result == null) result = caseConstantParameter(durationParameterType);
				if (result == null) result = caseParameterValue(durationParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENUM_PARAMETER_TYPE: {
				EnumParameterType enumParameterType = (EnumParameterType)theEObject;
				T result = caseEnumParameterType(enumParameterType);
				if (result == null) result = caseParameterValue(enumParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ERLANG_DISTRIBUTION_TYPE: {
				ErlangDistributionType erlangDistributionType = (ErlangDistributionType)theEObject;
				T result = caseErlangDistributionType(erlangDistributionType);
				if (result == null) result = caseDistributionParameter(erlangDistributionType);
				if (result == null) result = caseParameterValue(erlangDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EXPRESSION_PARAMETER_TYPE: {
				ExpressionParameterType expressionParameterType = (ExpressionParameterType)theEObject;
				T result = caseExpressionParameterType(expressionParameterType);
				if (result == null) result = caseParameterValue(expressionParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FLOATING_PARAMETER_TYPE: {
				FloatingParameterType floatingParameterType = (FloatingParameterType)theEObject;
				T result = caseFloatingParameterType(floatingParameterType);
				if (result == null) result = caseConstantParameter(floatingParameterType);
				if (result == null) result = caseParameterValue(floatingParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GAMMA_DISTRIBUTION_TYPE: {
				GammaDistributionType gammaDistributionType = (GammaDistributionType)theEObject;
				T result = caseGammaDistributionType(gammaDistributionType);
				if (result == null) result = caseDistributionParameter(gammaDistributionType);
				if (result == null) result = caseParameterValue(gammaDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LOG_NORMAL_DISTRIBUTION_TYPE: {
				LogNormalDistributionType logNormalDistributionType = (LogNormalDistributionType)theEObject;
				T result = caseLogNormalDistributionType(logNormalDistributionType);
				if (result == null) result = caseDistributionParameter(logNormalDistributionType);
				if (result == null) result = caseParameterValue(logNormalDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.METADATA_TYPE: {
				MetadataType metadataType = (MetadataType)theEObject;
				T result = caseMetadataType(metadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NEGATIVE_EXPONENTIAL_DISTRIBUTION_TYPE: {
				NegativeExponentialDistributionType negativeExponentialDistributionType = (NegativeExponentialDistributionType)theEObject;
				T result = caseNegativeExponentialDistributionType(negativeExponentialDistributionType);
				if (result == null) result = caseDistributionParameter(negativeExponentialDistributionType);
				if (result == null) result = caseParameterValue(negativeExponentialDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NORMAL_DISTRIBUTION_TYPE: {
				NormalDistributionType normalDistributionType = (NormalDistributionType)theEObject;
				T result = caseNormalDistributionType(normalDistributionType);
				if (result == null) result = caseDistributionParameter(normalDistributionType);
				if (result == null) result = caseParameterValue(normalDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NUMERIC_PARAMETER_TYPE: {
				NumericParameterType numericParameterType = (NumericParameterType)theEObject;
				T result = caseNumericParameterType(numericParameterType);
				if (result == null) result = caseConstantParameter(numericParameterType);
				if (result == null) result = caseParameterValue(numericParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.METAENTRY_TYPE: {
				MetaentryType metaentryType = (MetaentryType)theEObject;
				T result = caseMetaentryType(metaentryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DISTRIBUTION_PARAMETER: {
				DistributionParameter distributionParameter = (DistributionParameter)theEObject;
				T result = caseDistributionParameter(distributionParameter);
				if (result == null) result = caseParameterValue(distributionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROCESS_ANALYSIS_DATA_TYPE: {
				ProcessAnalysisDataType processAnalysisDataType = (ProcessAnalysisDataType)theEObject;
				T result = caseProcessAnalysisDataType(processAnalysisDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROPERTY_PARAMETERS: {
				PropertyParameters propertyParameters = (PropertyParameters)theEObject;
				T result = casePropertyParameters(propertyParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RANDOM_DISTRIBUTION_TYPE: {
				RandomDistributionType randomDistributionType = (RandomDistributionType)theEObject;
				T result = caseRandomDistributionType(randomDistributionType);
				if (result == null) result = caseDistributionParameter(randomDistributionType);
				if (result == null) result = caseParameterValue(randomDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PARAMETER_VALUE: {
				ParameterValue parameterValue = (ParameterValue)theEObject;
				T result = caseParameterValue(parameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POISSON_DISTRIBUTION_TYPE: {
				PoissonDistributionType poissonDistributionType = (PoissonDistributionType)theEObject;
				T result = casePoissonDistributionType(poissonDistributionType);
				if (result == null) result = caseDistributionParameter(poissonDistributionType);
				if (result == null) result = caseParameterValue(poissonDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = caseParameter(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRIORITY_PARAMETERS: {
				PriorityParameters priorityParameters = (PriorityParameters)theEObject;
				T result = casePriorityParameters(priorityParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TIME_PARAMETERS: {
				TimeParameters timeParameters = (TimeParameters)theEObject;
				T result = caseTimeParameters(timeParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STRING_PARAMETER_TYPE: {
				StringParameterType stringParameterType = (StringParameterType)theEObject;
				T result = caseStringParameterType(stringParameterType);
				if (result == null) result = caseConstantParameter(stringParameterType);
				if (result == null) result = caseParameterValue(stringParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RESOURCE_PARAMETERS: {
				ResourceParameters resourceParameters = (ResourceParameters)theEObject;
				T result = caseResourceParameters(resourceParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SCENARIO_PARAMETERS: {
				ScenarioParameters scenarioParameters = (ScenarioParameters)theEObject;
				T result = caseScenarioParameters(scenarioParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VENDOR_EXTENSION: {
				VendorExtension vendorExtension = (VendorExtension)theEObject;
				T result = caseVendorExtension(vendorExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TRIANGULAR_DISTRIBUTION_TYPE: {
				TriangularDistributionType triangularDistributionType = (TriangularDistributionType)theEObject;
				T result = caseTriangularDistributionType(triangularDistributionType);
				if (result == null) result = caseDistributionParameter(triangularDistributionType);
				if (result == null) result = caseParameterValue(triangularDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TRUNCATED_NORMAL_DISTRIBUTION_TYPE: {
				TruncatedNormalDistributionType truncatedNormalDistributionType = (TruncatedNormalDistributionType)theEObject;
				T result = caseTruncatedNormalDistributionType(truncatedNormalDistributionType);
				if (result == null) result = caseDistributionParameter(truncatedNormalDistributionType);
				if (result == null) result = caseParameterValue(truncatedNormalDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.UNIFORM_DISTRIBUTION_TYPE: {
				UniformDistributionType uniformDistributionType = (UniformDistributionType)theEObject;
				T result = caseUniformDistributionType(uniformDistributionType);
				if (result == null) result = caseDistributionParameter(uniformDistributionType);
				if (result == null) result = caseParameterValue(uniformDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.USER_DISTRIBUTION_DATA_POINT_TYPE: {
				UserDistributionDataPointType userDistributionDataPointType = (UserDistributionDataPointType)theEObject;
				T result = caseUserDistributionDataPointType(userDistributionDataPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.USER_DISTRIBUTION_TYPE: {
				UserDistributionType userDistributionType = (UserDistributionType)theEObject;
				T result = caseUserDistributionType(userDistributionType);
				if (result == null) result = caseDistributionParameter(userDistributionType);
				if (result == null) result = caseParameterValue(userDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WEIBULL_DISTRIBUTION_TYPE: {
				WeibullDistributionType weibullDistributionType = (WeibullDistributionType)theEObject;
				T result = caseWeibullDistributionType(weibullDistributionType);
				if (result == null) result = caseDistributionParameter(weibullDistributionType);
				if (result == null) result = caseParameterValue(weibullDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beta Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beta Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBetaDistributionType(BetaDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binomial Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binomial Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinomialDistributionType(BinomialDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanParameterType(BooleanParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendar(Calendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalType(GlobalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlParameters(ControlParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantParameter(ConstantParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostParameters(CostParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportType(ImportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeParameterType(DateTimeParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalParameterType(DecimalParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Entry Script Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Entry Script Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnEntryScriptType(OnEntryScriptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementParameters(ElementParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Exit Script Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Exit Script Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnExitScriptType(OnExitScriptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationParameterType(DurationParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumParameterType(EnumParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erlang Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erlang Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErlangDistributionType(ErlangDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionParameterType(ExpressionParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floating Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floating Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatingParameterType(FloatingParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gamma Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gamma Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGammaDistributionType(GammaDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Normal Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Normal Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogNormalDistributionType(LogNormalDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataType(MetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Exponential Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Exponential Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeExponentialDistributionType(NegativeExponentialDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalDistributionType(NormalDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericParameterType(NumericParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metaentry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metaentry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaentryType(MetaentryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribution Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribution Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistributionParameter(DistributionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Analysis Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Analysis Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessAnalysisDataType(ProcessAnalysisDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyParameters(PropertyParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomDistributionType(RandomDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValue(ParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poisson Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poisson Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoissonDistributionType(PoissonDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorityParameters(PriorityParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeParameters(TimeParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringParameterType(StringParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceParameters(ResourceParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioParameters(ScenarioParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vendor Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vendor Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVendorExtension(VendorExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangular Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangular Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriangularDistributionType(TriangularDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Truncated Normal Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Truncated Normal Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTruncatedNormalDistributionType(TruncatedNormalDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniform Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniform Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniformDistributionType(UniformDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Distribution Data Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Distribution Data Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDistributionDataPointType(UserDistributionDataPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDistributionType(UserDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weibull Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weibull Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeibullDistributionType(WeibullDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBpmn2_DocumentRoot(org.eclipse.bpmn2.DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
