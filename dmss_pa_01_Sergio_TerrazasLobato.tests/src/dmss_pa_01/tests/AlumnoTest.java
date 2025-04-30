/**
 */
package dmss_pa_01.tests;

import dmss_pa_01.Alumno;
import dmss_pa_01.Dmss_pa_01Factory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alumno</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlumnoTest extends TestCase {

	/**
	 * The fixture for this Alumno test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Alumno fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlumnoTest.class);
	}

	/**
	 * Constructs a new Alumno test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlumnoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Alumno test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Alumno fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Alumno test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Alumno getFixture() {
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
		setFixture(Dmss_pa_01Factory.eINSTANCE.createAlumno());
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

} //AlumnoTest
