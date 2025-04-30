/**
 */
package dmss_pa_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TIPO</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dmss_pa_01.Dmss_pa_01Package#getTIPO()
 * @model
 * @generated
 */
public enum TIPO implements Enumerator {
	/**
	 * The '<em><b>PDF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDF_VALUE
	 * @generated
	 * @ordered
	 */
	PDF(0, "PDF", "PDF"),

	/**
	 * The '<em><b>WORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORD_VALUE
	 * @generated
	 * @ordered
	 */
	WORD(1, "WORD", "WORD"),

	/**
	 * The '<em><b>ODT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODT_VALUE
	 * @generated
	 * @ordered
	 */
	ODT(2, "ODT", "ODT"),

	/**
	 * The '<em><b>ODP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODP_VALUE
	 * @generated
	 * @ordered
	 */
	ODP(3, "ODP", "ODP"),

	/**
	 * The '<em><b>AVI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVI_VALUE
	 * @generated
	 * @ordered
	 */
	AVI(4, "AVI", "AVI"),

	/**
	 * The '<em><b>MP4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MP4_VALUE
	 * @generated
	 * @ordered
	 */
	MP4(5, "MP4", "MP4"),

	/**
	 * The '<em><b>PPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPT_VALUE
	 * @generated
	 * @ordered
	 */
	PPT(6, "PPT", "PPT"),

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(7, "UNDEFINED", "UNDEFINED");

	/**
	 * The '<em><b>PDF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PDF_VALUE = 0;

	/**
	 * The '<em><b>WORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORD_VALUE = 1;

	/**
	 * The '<em><b>ODT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ODT_VALUE = 2;

	/**
	 * The '<em><b>ODP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ODP_VALUE = 3;

	/**
	 * The '<em><b>AVI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVI_VALUE = 4;

	/**
	 * The '<em><b>MP4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MP4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MP4_VALUE = 5;

	/**
	 * The '<em><b>PPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PPT_VALUE = 6;

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 7;

	/**
	 * An array of all the '<em><b>TIPO</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TIPO[] VALUES_ARRAY =
		new TIPO[] {
			PDF,
			WORD,
			ODT,
			ODP,
			AVI,
			MP4,
			PPT,
			UNDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>TIPO</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TIPO> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TIPO</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TIPO get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TIPO result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TIPO</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TIPO getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TIPO result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TIPO</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TIPO get(int value) {
		switch (value) {
			case PDF_VALUE: return PDF;
			case WORD_VALUE: return WORD;
			case ODT_VALUE: return ODT;
			case ODP_VALUE: return ODP;
			case AVI_VALUE: return AVI;
			case MP4_VALUE: return MP4;
			case PPT_VALUE: return PPT;
			case UNDEFINED_VALUE: return UNDEFINED;
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
	private TIPO(int value, String name, String literal) {
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
	
} //TIPO
