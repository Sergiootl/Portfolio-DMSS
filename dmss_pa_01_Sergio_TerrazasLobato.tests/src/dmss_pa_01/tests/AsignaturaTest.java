/**
 */
package dmss_pa_01.tests;

import dmss_pa_01.Asignatura;
import dmss_pa_01.Dmss_pa_01Factory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asignatura</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsignaturaTest extends TestCase {

	/**
	 * The fixture for this Asignatura test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Asignatura fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AsignaturaTest.class);
	}

	/**
	 * Constructs a new Asignatura test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsignaturaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Asignatura test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Asignatura fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Asignatura test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Asignatura getFixture() {
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
		setFixture(Dmss_pa_01Factory.eINSTANCE.createAsignatura());
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

} //AsignaturaTest
