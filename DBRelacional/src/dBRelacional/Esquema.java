/**
 */
package dBRelacional;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Esquema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dBRelacional.Esquema#getTablas <em>Tablas</em>}</li>
 *   <li>{@link dBRelacional.Esquema#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see dBRelacional.DBRelacionalPackage#getEsquema()
 * @model
 * @generated
 */
public interface Esquema extends EObject {
	/**
	 * Returns the value of the '<em><b>Tablas</b></em>' containment reference list.
	 * The list contents are of type {@link dBRelacional.Tabla}.
	 * It is bidirectional and its opposite is '{@link dBRelacional.Tabla#getEsquema <em>Esquema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tablas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablas</em>' containment reference list.
	 * @see dBRelacional.DBRelacionalPackage#getEsquema_Tablas()
	 * @see dBRelacional.Tabla#getEsquema
	 * @model opposite="esquema" containment="true"
	 * @generated
	 */
	EList<Tabla> getTablas();

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
	 * @see dBRelacional.DBRelacionalPackage#getEsquema_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dBRelacional.Esquema#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Esquema
