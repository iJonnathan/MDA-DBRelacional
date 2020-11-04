/**
 */
package dBRelacional.impl;

import dBRelacional.Columna;
import dBRelacional.DBRelacionalPackage;
import dBRelacional.Esquema;
import dBRelacional.FK;
import dBRelacional.Tabla;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dBRelacional.impl.TablaImpl#getEsquema <em>Esquema</em>}</li>
 *   <li>{@link dBRelacional.impl.TablaImpl#getColumna <em>Columna</em>}</li>
 *   <li>{@link dBRelacional.impl.TablaImpl#getFks <em>Fks</em>}</li>
 *   <li>{@link dBRelacional.impl.TablaImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TablaImpl extends MinimalEObjectImpl.Container implements Tabla {
	/**
	 * The cached value of the '{@link #getColumna() <em>Columna</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumna()
	 * @generated
	 * @ordered
	 */
	protected EList<Columna> columna;

	/**
	 * The cached value of the '{@link #getFks() <em>Fks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFks()
	 * @generated
	 * @ordered
	 */
	protected EList<FK> fks;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TablaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DBRelacionalPackage.Literals.TABLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Esquema getEsquema() {
		if (eContainerFeatureID() != DBRelacionalPackage.TABLA__ESQUEMA) return null;
		return (Esquema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEsquema(Esquema newEsquema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEsquema, DBRelacionalPackage.TABLA__ESQUEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsquema(Esquema newEsquema) {
		if (newEsquema != eInternalContainer() || (eContainerFeatureID() != DBRelacionalPackage.TABLA__ESQUEMA && newEsquema != null)) {
			if (EcoreUtil.isAncestor(this, newEsquema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEsquema != null)
				msgs = ((InternalEObject)newEsquema).eInverseAdd(this, DBRelacionalPackage.ESQUEMA__TABLAS, Esquema.class, msgs);
			msgs = basicSetEsquema(newEsquema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBRelacionalPackage.TABLA__ESQUEMA, newEsquema, newEsquema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Columna> getColumna() {
		if (columna == null) {
			columna = new EObjectContainmentWithInverseEList<Columna>(Columna.class, this, DBRelacionalPackage.TABLA__COLUMNA, DBRelacionalPackage.COLUMNA__TABLA);
		}
		return columna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FK> getFks() {
		if (fks == null) {
			fks = new EObjectContainmentEList<FK>(FK.class, this, DBRelacionalPackage.TABLA__FKS);
		}
		return fks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBRelacionalPackage.TABLA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DBRelacionalPackage.TABLA__ESQUEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEsquema((Esquema)otherEnd, msgs);
			case DBRelacionalPackage.TABLA__COLUMNA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumna()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DBRelacionalPackage.TABLA__ESQUEMA:
				return basicSetEsquema(null, msgs);
			case DBRelacionalPackage.TABLA__COLUMNA:
				return ((InternalEList<?>)getColumna()).basicRemove(otherEnd, msgs);
			case DBRelacionalPackage.TABLA__FKS:
				return ((InternalEList<?>)getFks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DBRelacionalPackage.TABLA__ESQUEMA:
				return eInternalContainer().eInverseRemove(this, DBRelacionalPackage.ESQUEMA__TABLAS, Esquema.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DBRelacionalPackage.TABLA__ESQUEMA:
				return getEsquema();
			case DBRelacionalPackage.TABLA__COLUMNA:
				return getColumna();
			case DBRelacionalPackage.TABLA__FKS:
				return getFks();
			case DBRelacionalPackage.TABLA__NOMBRE:
				return getNombre();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DBRelacionalPackage.TABLA__ESQUEMA:
				setEsquema((Esquema)newValue);
				return;
			case DBRelacionalPackage.TABLA__COLUMNA:
				getColumna().clear();
				getColumna().addAll((Collection<? extends Columna>)newValue);
				return;
			case DBRelacionalPackage.TABLA__FKS:
				getFks().clear();
				getFks().addAll((Collection<? extends FK>)newValue);
				return;
			case DBRelacionalPackage.TABLA__NOMBRE:
				setNombre((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DBRelacionalPackage.TABLA__ESQUEMA:
				setEsquema((Esquema)null);
				return;
			case DBRelacionalPackage.TABLA__COLUMNA:
				getColumna().clear();
				return;
			case DBRelacionalPackage.TABLA__FKS:
				getFks().clear();
				return;
			case DBRelacionalPackage.TABLA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DBRelacionalPackage.TABLA__ESQUEMA:
				return getEsquema() != null;
			case DBRelacionalPackage.TABLA__COLUMNA:
				return columna != null && !columna.isEmpty();
			case DBRelacionalPackage.TABLA__FKS:
				return fks != null && !fks.isEmpty();
			case DBRelacionalPackage.TABLA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //TablaImpl
