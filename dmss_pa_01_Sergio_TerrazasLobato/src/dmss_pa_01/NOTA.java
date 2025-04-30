/**
 */
package dmss_pa_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>NOTA</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dmss_pa_01.Dmss_pa_01Package#getNOTA()
 * @model
 * @generated
 */
public enum NOTA implements Enumerator {
	/**
	 * The '<em><b>ESCALA5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESCALA5_VALUE
	 * @generated
	 * @ordered
	 */
	ESCALA5(1, "ESCALA5", "ESCALA5"),

	/**
	 * The '<em><b>ESCALA2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESCALA2_VALUE
	 * @generated
	 * @ordered
	 */
	ESCALA2(2, "ESCALA2", "ESCALA2");

	/**
	 * The '<em><b>ESCALA5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESCALA5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESCALA5_VALUE = 1;

	/**
	 * The '<em><b>ESCALA2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESCALA2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESCALA2_VALUE = 2;

	/**
	 * An array of all the '<em><b>NOTA</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NOTA[] VALUES_ARRAY =
		new NOTA[] {
			ESCALA5,
			ESCALA2,
		};

	/**
	 * A public read-only list of all the '<em><b>NOTA</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NOTA> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>NOTA</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NOTA get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NOTA result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>NOTA</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NOTA getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NOTA result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>NOTA</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NOTA get(int value) {
		switch (value) {
			case ESCALA5_VALUE: return ESCALA5;
			case ESCALA2_VALUE: return ESCALA2;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NOTA(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NOTA
