/**
 */
package dmss_pa_01.tests;

import dmss_pa_01.Dmss_pa_01Factory;
import dmss_pa_01.GrupoTrabajo;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Grupo Trabajo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrupoTrabajoTest extends TestCase {

	/**
	 * The fixture for this Grupo Trabajo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrupoTrabajo fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GrupoTrabajoTest.class);
	}

	/**
	 * Constructs a new Grupo Trabajo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrupoTrabajoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Grupo Trabajo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GrupoTrabajo fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Grupo Trabajo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrupoTrabajo getFixture() {
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
		setFixture(Dmss_pa_01Factory.eINSTANCE.createGrupoTrabajo());
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

} //GrupoTrabajoTest
