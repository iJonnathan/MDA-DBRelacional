/**
 */
package dBRelacional.util;

import dBRelacional.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see dBRelacional.DBRelacionalPackage
 * @generated
 */
public class DBRelacionalValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DBRelacionalValidator INSTANCE = new DBRelacionalValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "dBRelacional";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBRelacionalValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DBRelacionalPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DBRelacionalPackage.ESQUEMA:
				return validateEsquema((Esquema)value, diagnostics, context);
			case DBRelacionalPackage.TABLA:
				return validateTabla((Tabla)value, diagnostics, context);
			case DBRelacionalPackage.FK:
				return validateFK((FK)value, diagnostics, context);
			case DBRelacionalPackage.COLUMNA:
				return validateColumna((Columna)value, diagnostics, context);
			case DBRelacionalPackage.TIPO_DATO:
				return validateTipoDato((TipoDato)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEsquema(Esquema esquema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esquema, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tabla, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validateTabla_columnaUnica(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validateTabla_tablaSinColumnas(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validateTabla_tablaReferenciaFK(tabla, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the columnaUnica constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLA__COLUMNA_UNICA__EEXPRESSION = "\n" +
		"\t\t\t\tcolumna->isUnique(nombre)";

	/**
	 * Validates the columnaUnica constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla_columnaUnica(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DBRelacionalPackage.Literals.TABLA,
				 tabla,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "columnaUnica",
				 TABLA__COLUMNA_UNICA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the tablaSinColumnas constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLA__TABLA_SIN_COLUMNAS__EEXPRESSION = "\n" +
		"\t\t\t\tcolumna-> size() > 0 ";

	/**
	 * Validates the tablaSinColumnas constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla_tablaSinColumnas(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DBRelacionalPackage.Literals.TABLA,
				 tabla,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "tablaSinColumnas",
				 TABLA__TABLA_SIN_COLUMNAS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the tablaReferenciaFK constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLA__TABLA_REFERENCIA_FK__EEXPRESSION = "\n" +
		"\t\t\t\tfks.referencia -> excludes(self)";

	/**
	 * Validates the tablaReferenciaFK constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla_tablaReferenciaFK(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DBRelacionalPackage.Literals.TABLA,
				 tabla,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "tablaReferenciaFK",
				 TABLA__TABLA_REFERENCIA_FK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFK(FK fk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fk, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumna(Columna columna, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columna, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipoDato(TipoDato tipoDato, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DBRelacionalValidator
