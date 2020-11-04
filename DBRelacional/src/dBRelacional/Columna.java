/**
 */
package dBRelacional;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columna</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dBRelacional.Columna#getTabla <em>Tabla</em>}</li>
 *   <li>{@link dBRelacional.Columna#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dBRelacional.Columna#getTipo <em>Tipo</em>}</li>
 *   <li>{@link dBRelacional.Columna#isEsPK <em>Es PK</em>}</li>
 *   <li>{@link dBRelacional.Columna#isPermiteNulos <em>Permite Nulos</em>}</li>
 *   <li>{@link dBRelacional.Columna#getLargo <em>Largo</em>}</li>
 * </ul>
 *
 * @see dBRelacional.DBRelacionalPackage#getColumna()
 * @model
 * @generated
 */
public interface Columna extends EObject {
	/**
	 * Returns the value of the '<em><b>Tabla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dBRelacional.Tabla#getColumna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabla</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla</em>' container reference.
	 * @see #setTabla(Tabla)
	 * @see dBRelacional.DBRelacionalPackage#getColumna_Tabla()
	 * @see dBRelacional.Tabla#getColumna
	 * @model opposite="columna" required="true" transient="false"
	 * @generated
	 */
	Tabla getTabla();

	/**
	 * Sets the value of the '{@link dBRelacional.Columna#getTabla <em>Tabla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla</em>' container reference.
	 * @see #getTabla()
	 * @generated
	 */
	void setTabla(Tabla value);

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
	 * @see dBRelacional.DBRelacionalPackage#getColumna_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dBRelacional.Columna#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link dBRelacional.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see dBRelacional.TipoDato
	 * @see #setTipo(TipoDato)
	 * @see dBRelacional.DBRelacionalPackage#getColumna_Tipo()
	 * @model
	 * @generated
	 */
	TipoDato getTipo();

	/**
	 * Sets the value of the '{@link dBRelacional.Columna#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see dBRelacional.TipoDato
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Es PK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es PK</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es PK</em>' attribute.
	 * @see #setEsPK(boolean)
	 * @see dBRelacional.DBRelacionalPackage#getColumna_EsPK()
	 * @model
	 * @generated
	 */
	boolean isEsPK();

	/**
	 * Sets the value of the '{@link dBRelacional.Columna#isEsPK <em>Es PK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es PK</em>' attribute.
	 * @see #isEsPK()
	 * @generated
	 */
	void setEsPK(boolean value);

	/**
	 * Returns the value of the '<em><b>Permite Nulos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permite Nulos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permite Nulos</em>' attribute.
	 * @see #setPermiteNulos(boolean)
	 * @see dBRelacional.DBRelacionalPackage#getColumna_PermiteNulos()
	 * @model
	 * @generated
	 */
	boolean isPermiteNulos();

	/**
	 * Sets the value of the '{@link dBRelacional.Columna#isPermiteNulos <em>Permite Nulos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permite Nulos</em>' attribute.
	 * @see #isPermiteNulos()
	 * @generated
	 */
	void setPermiteNulos(boolean value);

	/**
	 * Returns the value of the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largo</em>' attribute.
	 * @see #setLargo(int)
	 * @see dBRelacional.DBRelacionalPackage#getColumna_Largo()
	 * @model
	 * @generated
	 */
	int getLargo();

	/**
	 * Sets the value of the '{@link dBRelacional.Columna#getLargo <em>Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largo</em>' attribute.
	 * @see #getLargo()
	 * @generated
	 */
	void setLargo(int value);

} // Columna
