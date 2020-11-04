/**
 */
package dBRelacional.impl;

import dBRelacional.Columna;
import dBRelacional.DBRelacionalPackage;
import dBRelacional.Tabla;
import dBRelacional.TipoDato;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Columna</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dBRelacional.impl.ColumnaImpl#getTabla <em>Tabla</em>}</li>
 *   <li>{@link dBRelacional.impl.ColumnaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dBRelacional.impl.ColumnaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link dBRelacional.impl.ColumnaImpl#isEsPK <em>Es PK</em>}</li>
 *   <li>{@link dBRelacional.impl.ColumnaImpl#isPermiteNulos <em>Permite Nulos</em>}</li>
 *   <li>{@link dBRelacional.impl.ColumnaImpl#getLargo <em>Largo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnaImpl extends MinimalEObjectImpl.Container implements Columna {
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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoDato TIPO_EDEFAULT = TipoDato.ENTERO;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsPK() <em>Es PK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsPK()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_PK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsPK() <em>Es PK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsPK()
	 * @generated
	 * @ordered
	 */
	protected boolean esPK = ES_PK_EDEFAULT;

	/**
	 * The default value of the '{@link #isPermiteNulos() <em>Permite Nulos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPermiteNulos()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERMITE_NULOS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPermiteNulos() <em>Permite Nulos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPermiteNulos()
	 * @generated
	 * @ordered
	 */
	protected boolean permiteNulos = PERMITE_NULOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargo() <em>Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargo()
	 * @generated
	 * @ordered
	 */
	protected static final int LARGO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLargo() <em>Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargo()
	 * @generated
	 * @ordered
	 */
	protected int largo = LARGO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DBRelacionalPackage.Literals.COLUMNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla getTabla() {
		if (eContainerFeatureID() != DBRelacionalPackage.COLUMNA__TABLA) return null;
		return (Tabla)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTabla(Tabla newTabla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTabla, DBRelacionalPackage.COLUMNA__TABLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabla(Tabla newTabla) {
		if (newTabla != eInternalContainer() || (eContainerFeatureID() != DBRelacionalPackage.COLUMNA__TABLA && newTabla != null)) {
			if (EcoreUtil.isAncestor(this, newTabla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTabla != null)
				msgs = ((InternalEObject)newTabla).eInverseAdd(this, DBRelacionalPackage.TABLA__COLUMNA, Tabla.class, msgs);
			msgs = basicSetTabla(newTabla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBRelacionalPackage.COLUMNA__TABLA, newTabla, newTabla));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DBRelacionalPackage.COLUMNA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoDato newTipo) {
		TipoDato oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBRelacionalPackage.COLUMNA__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsPK() {
		return esPK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsPK(boolean newEsPK) {
		boolean oldEsPK = esPK;
		esPK = newEsPK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBRelacionalPackage.COLUMNA__ES_PK, oldEsPK, esPK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPermiteNulos() {
		return permiteNulos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermiteNulos(boolean newPermiteNulos) {
		boolean oldPermiteNulos = permiteNulos;
		permiteNulos = newPermiteNulos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBRelacionalPackage.COLUMNA__PERMITE_NULOS, oldPermiteNulos, permiteNulos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLargo() {
		return largo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargo(int newLargo) {
		int oldLargo = largo;
		largo = newLargo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBRelacionalPackage.COLUMNA__LARGO, oldLargo, largo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DBRelacionalPackage.COLUMNA__TABLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTabla((Tabla)otherEnd, msgs);
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
			case DBRelacionalPackage.COLUMNA__TABLA:
				return basicSetTabla(null, msgs);
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
			case DBRelacionalPackage.COLUMNA__TABLA:
				return eInternalContainer().eInverseRemove(this, DBRelacionalPackage.TABLA__COLUMNA, Tabla.class, msgs);
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
			case DBRelacionalPackage.COLUMNA__TABLA:
				return getTabla();
			case DBRelacionalPackage.COLUMNA__NOMBRE:
				return getNombre();
			case DBRelacionalPackage.COLUMNA__TIPO:
				return getTipo();
			case DBRelacionalPackage.COLUMNA__ES_PK:
				return isEsPK();
			case DBRelacionalPackage.COLUMNA__PERMITE_NULOS:
				return isPermiteNulos();
			case DBRelacionalPackage.COLUMNA__LARGO:
				return getLargo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DBRelacionalPackage.COLUMNA__TABLA:
				setTabla((Tabla)newValue);
				return;
			case DBRelacionalPackage.COLUMNA__NOMBRE:
				setNombre((String)newValue);
				return;
			case DBRelacionalPackage.COLUMNA__TIPO:
				setTipo((TipoDato)newValue);
				return;
			case DBRelacionalPackage.COLUMNA__ES_PK:
				setEsPK((Boolean)newValue);
				return;
			case DBRelacionalPackage.COLUMNA__PERMITE_NULOS:
				setPermiteNulos((Boolean)newValue);
				return;
			case DBRelacionalPackage.COLUMNA__LARGO:
				setLargo((Integer)newValue);
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
			case DBRelacionalPackage.COLUMNA__TABLA:
				setTabla((Tabla)null);
				return;
			case DBRelacionalPackage.COLUMNA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DBRelacionalPackage.COLUMNA__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case DBRelacionalPackage.COLUMNA__ES_PK:
				setEsPK(ES_PK_EDEFAULT);
				return;
			case DBRelacionalPackage.COLUMNA__PERMITE_NULOS:
				setPermiteNulos(PERMITE_NULOS_EDEFAULT);
				return;
			case DBRelacionalPackage.COLUMNA__LARGO:
				setLargo(LARGO_EDEFAULT);
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
			case DBRelacionalPackage.COLUMNA__TABLA:
				return getTabla() != null;
			case DBRelacionalPackage.COLUMNA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DBRelacionalPackage.COLUMNA__TIPO:
				return tipo != TIPO_EDEFAULT;
			case DBRelacionalPackage.COLUMNA__ES_PK:
				return esPK != ES_PK_EDEFAULT;
			case DBRelacionalPackage.COLUMNA__PERMITE_NULOS:
				return permiteNulos != PERMITE_NULOS_EDEFAULT;
			case DBRelacionalPackage.COLUMNA__LARGO:
				return largo != LARGO_EDEFAULT;
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
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", esPK: ");
		result.append(esPK);
		result.append(", permiteNulos: ");
		result.append(permiteNulos);
		result.append(", largo: ");
		result.append(largo);
		result.append(')');
		return result.toString();
	}

} //ColumnaImpl
