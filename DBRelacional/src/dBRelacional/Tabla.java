/**
 */
package dBRelacional;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dBRelacional.Tabla#getEsquema <em>Esquema</em>}</li>
 *   <li>{@link dBRelacional.Tabla#getColumna <em>Columna</em>}</li>
 *   <li>{@link dBRelacional.Tabla#getFks <em>Fks</em>}</li>
 *   <li>{@link dBRelacional.Tabla#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see dBRelacional.DBRelacionalPackage#getTabla()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='columnaUnica tablaSinColumnas tablaReferenciaFK'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot columnaUnica='\n\t\t\t\tcolumna->isUnique(nombre)' tablaSinColumnas='\n\t\t\t\tcolumna-> size() > 0 ' tablaReferenciaFK='\n\t\t\t\tfks.referencia -> excludes(self)'"
 * @generated
 */
public interface Tabla extends EObject {
	/**
	 * Returns the value of the '<em><b>Esquema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dBRelacional.Esquema#getTablas <em>Tablas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Esquema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esquema</em>' container reference.
	 * @see #setEsquema(Esquema)
	 * @see dBRelacional.DBRelacionalPackage#getTabla_Esquema()
	 * @see dBRelacional.Esquema#getTablas
	 * @model opposite="tablas" required="true" transient="false"
	 * @generated
	 */
	Esquema getEsquema();

	/**
	 * Sets the value of the '{@link dBRelacional.Tabla#getEsquema <em>Esquema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Esquema</em>' container reference.
	 * @see #getEsquema()
	 * @generated
	 */
	void setEsquema(Esquema value);

	/**
	 * Returns the value of the '<em><b>Columna</b></em>' containment reference list.
	 * The list contents are of type {@link dBRelacional.Columna}.
	 * It is bidirectional and its opposite is '{@link dBRelacional.Columna#getTabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columna</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columna</em>' containment reference list.
	 * @see dBRelacional.DBRelacionalPackage#getTabla_Columna()
	 * @see dBRelacional.Columna#getTabla
	 * @model opposite="tabla" containment="true"
	 * @generated
	 */
	EList<Columna> getColumna();

	/**
	 * Returns the value of the '<em><b>Fks</b></em>' containment reference list.
	 * The list contents are of type {@link dBRelacional.FK}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fks</em>' containment reference list.
	 * @see dBRelacional.DBRelacionalPackage#getTabla_Fks()
	 * @model containment="true"
	 * @generated
	 */
	EList<FK> getFks();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dBRelacional.DBRelacionalPackage#getTabla_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dBRelacional.Tabla#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Tabla
