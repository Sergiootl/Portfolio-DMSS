/**
 */
package dmss_pa_01.tests;

import dmss_pa_01.Dmss_pa_01Factory;
import dmss_pa_01.TituloUniversitario;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Titulo Universitario</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TituloUniversitarioTest extends TestCase {

	/**
	 * The fixture for this Titulo Universitario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TituloUniversitario fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TituloUniversitarioTest.class);
	}

	/**
	 * Constructs a new Titulo Universitario test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TituloUniversitarioTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Titulo Universitario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TituloUniversitario fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Titulo Universitario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TituloUniversitario getFixture() {
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
		setFixture(Dmss_pa_01Factory.eINSTANCE.createTituloUniversitario());
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

} //TituloUniversitarioTest
