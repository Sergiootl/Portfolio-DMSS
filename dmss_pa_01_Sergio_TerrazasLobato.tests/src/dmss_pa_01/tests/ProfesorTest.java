/**
 */
package dmss_pa_01.tests;

import dmss_pa_01.Dmss_pa_01Factory;
import dmss_pa_01.Profesor;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfesorTest extends TestCase {

	/**
	 * The fixture for this Profesor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Profesor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProfesorTest.class);
	}

	/**
	 * Constructs a new Profesor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfesorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Profesor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Profesor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Profesor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Profesor getFixture() {
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
		setFixture(Dmss_pa_01Factory.eINSTANCE.createProfesor());
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

} //ProfesorTest
