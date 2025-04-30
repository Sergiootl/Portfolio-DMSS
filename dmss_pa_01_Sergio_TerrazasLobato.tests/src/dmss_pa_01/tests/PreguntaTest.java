/**
 */
package dmss_pa_01.tests;

import dmss_pa_01.Dmss_pa_01Factory;
import dmss_pa_01.Pregunta;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pregunta</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreguntaTest extends TestCase {

	/**
	 * The fixture for this Pregunta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pregunta fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PreguntaTest.class);
	}

	/**
	 * Constructs a new Pregunta test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreguntaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Pregunta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Pregunta fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pregunta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pregunta getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dmss_pa_01Factory.eINSTANCE.createPregunta());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PreguntaTest
