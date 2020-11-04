/**
 */
package dBRelacional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dBRelacional.DBRelacionalFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DBRelacionalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dBRelacional";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dBRelacional";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dBRelacional";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DBRelacionalPackage eINSTANCE = dBRelacional.impl.DBRelacionalPackageImpl.init();

	/**
	 * The meta object id for the '{@link dBRelacional.impl.EsquemaImpl <em>Esquema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dBRelacional.impl.EsquemaImpl
	 * @see dBRelacional.impl.DBRelacionalPackageImpl#getEsquema()
	 * @generated
	 */
	int ESQUEMA = 0;

	/**
	 * The feature id for the '<em><b>Tablas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA__TABLAS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Esquema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Esquema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESQUEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dBRelacional.impl.TablaImpl <em>Tabla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dBRelacional.impl.TablaImpl
	 * @see dBRelacional.impl.DBRelacionalPackageImpl#getTabla()
	 * @generated
	 */
	int TABLA = 1;

	/**
	 * The feature id for the '<em><b>Esquema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__ESQUEMA = 0;

	/**
	 * The feature id for the '<em><b>Columna</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__COLUMNA = 1;

	/**
	 * The feature id for the '<em><b>Fks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__FKS = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__NOMBRE = 3;

	/**
	 * The number of structural features of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dBRelacional.impl.FKImpl <em>FK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dBRelacional.impl.FKImpl
	 * @see dBRelacional.impl.DBRelacionalPackageImpl#getFK()
	 * @generated
	 */
	int FK = 2;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK__REFERENCIA = 0;

	/**
	 * The feature id for the '<em><b>Columna</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK__COLUMNA = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK__NOMBRE = 2;

	/**
	 * The number of structural features of the '<em>FK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>FK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dBRelacional.impl.ColumnaImpl <em>Columna</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dBRelacional.impl.ColumnaImpl
	 * @see dBRelacional.impl.DBRelacionalPackageImpl#getColumna()
	 * @generated
	 */
	int COLUMNA = 3;

	/**
	 * The feature id for the '<em><b>Tabla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__TABLA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__TIPO = 2;

	/**
	 * The feature id for the '<em><b>Es PK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__ES_PK = 3;

	/**
	 * The feature id for the '<em><b>Permite Nulos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__PERMITE_NULOS = 4;

	/**
	 * The feature id for the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA__LARGO = 5;

	/**
	 * The number of structural features of the '<em>Columna</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Columna</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dBRelacional.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dBRelacional.TipoDato
	 * @see dBRelacional.impl.DBRelacionalPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 4;


	/**
	 * Returns the meta object for class '{@link dBRelacional.Esquema <em>Esquema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Esquema</em>'.
	 * @see dBRelacional.Esquema
	 * @generated
	 */
	EClass getEsquema();

	/**
	 * Returns the meta object for the containment reference list '{@link dBRelacional.Esquema#getTablas <em>Tablas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablas</em>'.
	 * @see dBRelacional.Esquema#getTablas()
	 * @see #getEsquema()
	 * @generated
	 */
	EReference getEsquema_Tablas();

	/**
	 * Returns the meta object for the attribute '{@link dBRelacional.Esquema#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dBRelacional.Esquema#getNombre()
	 * @see #getEsquema()
	 * @generated
	 */
	EAttribute getEsquema_Nombre();

	/**
	 * Returns the meta object for class '{@link dBRelacional.Tabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabla</em>'.
	 * @see dBRelacional.Tabla
	 * @generated
	 */
	EClass getTabla();

	/**
	 * Returns the meta object for the container reference '{@link dBRelacional.Tabla#getEsquema <em>Esquema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Esquema</em>'.
	 * @see dBRelacional.Tabla#getEsquema()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_Esquema();

	/**
	 * Returns the meta object for the containment reference list '{@link dBRelacional.Tabla#getColumna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columna</em>'.
	 * @see dBRelacional.Tabla#getColumna()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_Columna();

	/**
	 * Returns the meta object for the containment reference list '{@link dBRelacional.Tabla#getFks <em>Fks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fks</em>'.
	 * @see dBRelacional.Tabla#getFks()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_Fks();

	/**
	 * Returns the meta object for the attribute '{@link dBRelacional.Tabla#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dBRelacional.Tabla#getNombre()
	 * @see #getTabla()
	 * @generated
	 */
	EAttribute getTabla_Nombre();

	/**
	 * Returns the meta object for class '{@link dBRelacional.FK <em>FK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FK</em>'.
	 * @see dBRelacional.FK
	 * @generated
	 */
	EClass getFK();

	/**
	 * Returns the meta object for the reference '{@link dBRelacional.FK#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencia</em>'.
	 * @see dBRelacional.FK#getReferencia()
	 * @see #getFK()
	 * @generated
	 */
	EReference getFK_Referencia();

	/**
	 * Returns the meta object for the reference '{@link dBRelacional.FK#getColumna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Columna</em>'.
	 * @see dBRelacional.FK#getColumna()
	 * @see #getFK()
	 * @generated
	 */
	EReference getFK_Columna();

	/**
	 * Returns the meta object for the attribute '{@link dBRelacional.FK#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dBRelacional.FK#getNombre()
	 * @see #getFK()
	 * @generated
	 */
	EAttribute getFK_Nombre();

	/**
	 * Returns the meta object for class '{@link dBRelacional.Columna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Columna</em>'.
	 * @see dBRelacional.Columna
	 * @generated
	 */
	EClass getColumna();

	/**
	 * Returns the meta object for the container reference '{@link dBRelacional.Columna#getTabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tabla</em>'.
	 * @see dBRelacional.Columna#getTabla()
	 * @see #getColumna()
	 * @generated
	 */
	EReference getColumna_Tabla();

	/**
	 * Returns the meta object for the attribute '{@link dBRelacional.Columna#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dBRelacional.Columna#getNombre()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link dBRelacional.Columna#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see dBRelacional.Columna#getTipo()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link dBRelacional.Columna#isEsPK <em>Es PK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es PK</em>'.
	 * @see dBRelacional.Columna#isEsPK()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_EsPK();

	/**
	 * Returns the meta object for the attribute '{@link dBRelacional.Columna#isPermiteNulos <em>Permite Nulos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permite Nulos</em>'.
	 * @see dBRelacional.Columna#isPermiteNulos()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_PermiteNulos();

	/**
	 * Returns the meta object for the attribute '{@link dBRelacional.Columna#getLargo <em>Largo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Largo</em>'.
	 * @see dBRelacional.Columna#getLargo()
	 * @see #getColumna()
	 * @generated
	 */
	EAttribute getColumna_Largo();

	/**
	 * Returns the meta object for enum '{@link dBRelacional.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see dBRelacional.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DBRelacionalFactory getDBRelacionalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dBRelacional.impl.EsquemaImpl <em>Esquema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dBRelacional.impl.EsquemaImpl
		 * @see dBRelacional.impl.DBRelacionalPackageImpl#getEsquema()
		 * @generated
		 */
		EClass ESQUEMA = eINSTANCE.getEsquema();

		/**
		 * The meta object literal for the '<em><b>Tablas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESQUEMA__TABLAS = eINSTANCE.getEsquema_Tablas();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESQUEMA__NOMBRE = eINSTANCE.getEsquema_Nombre();

		/**
		 * The meta object literal for the '{@link dBRelacional.impl.TablaImpl <em>Tabla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dBRelacional.impl.TablaImpl
		 * @see dBRelacional.impl.DBRelacionalPackageImpl#getTabla()
		 * @generated
		 */
		EClass TABLA = eINSTANCE.getTabla();

		/**
		 * The meta object literal for the '<em><b>Esquema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__ESQUEMA = eINSTANCE.getTabla_Esquema();

		/**
		 * The meta object literal for the '<em><b>Columna</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__COLUMNA = eINSTANCE.getTabla_Columna();

		/**
		 * The meta object literal for the '<em><b>Fks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__FKS = eINSTANCE.getTabla_Fks();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLA__NOMBRE = eINSTANCE.getTabla_Nombre();

		/**
		 * The meta object literal for the '{@link dBRelacional.impl.FKImpl <em>FK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dBRelacional.impl.FKImpl
		 * @see dBRelacional.impl.DBRelacionalPackageImpl#getFK()
		 * @generated
		 */
		EClass FK = eINSTANCE.getFK();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FK__REFERENCIA = eINSTANCE.getFK_Referencia();

		/**
		 * The meta object literal for the '<em><b>Columna</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FK__COLUMNA = eINSTANCE.getFK_Columna();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FK__NOMBRE = eINSTANCE.getFK_Nombre();

		/**
		 * The meta object literal for the '{@link dBRelacional.impl.ColumnaImpl <em>Columna</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dBRelacional.impl.ColumnaImpl
		 * @see dBRelacional.impl.DBRelacionalPackageImpl#getColumna()
		 * @generated
		 */
		EClass COLUMNA = eINSTANCE.getColumna();

		/**
		 * The meta object literal for the '<em><b>Tabla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNA__TABLA = eINSTANCE.getColumna_Tabla();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__NOMBRE = eINSTANCE.getColumna_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__TIPO = eINSTANCE.getColumna_Tipo();

		/**
		 * The meta object literal for the '<em><b>Es PK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__ES_PK = eINSTANCE.getColumna_EsPK();

		/**
		 * The meta object literal for the '<em><b>Permite Nulos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__PERMITE_NULOS = eINSTANCE.getColumna_PermiteNulos();

		/**
		 * The meta object literal for the '<em><b>Largo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNA__LARGO = eINSTANCE.getColumna_Largo();

		/**
		 * The meta object literal for the '{@link dBRelacional.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dBRelacional.TipoDato
		 * @see dBRelacional.impl.DBRelacionalPackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

	}

} //DBRelacionalPackage
