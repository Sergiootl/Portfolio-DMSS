/**
 */
package dmss_pa_01.impl;

import dmss_pa_01.Actividad;
import dmss_pa_01.Alumno;
import dmss_pa_01.Asignatura;
import dmss_pa_01.Bloque;
import dmss_pa_01.Consulta;
import dmss_pa_01.Dmss_pa_01Factory;
import dmss_pa_01.Dmss_pa_01Package;
import dmss_pa_01.Encuesta;
import dmss_pa_01.Foro;
import dmss_pa_01.GrupoTrabajo;
import dmss_pa_01.Pregunta;
import dmss_pa_01.Profesor;
import dmss_pa_01.Recurso;
import dmss_pa_01.Respuesta;
import dmss_pa_01.Root;
import dmss_pa_01.Tarea;
import dmss_pa_01.TituloUniversitario;
import dmss_pa_01.Universidad;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dmss_pa_01PackageImpl extends EPackageImpl implements Dmss_pa_01Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tituloUniversitarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asignaturaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profesorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alumnoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bloqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actividadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encuestaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consultaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enlaceurlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recursoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grupoTrabajoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preguntaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respuestaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dmss_pa_01.Dmss_pa_01Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Dmss_pa_01PackageImpl() {
		super(eNS_URI, Dmss_pa_01Factory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Dmss_pa_01Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Dmss_pa_01Package init() {
		if (isInited) return (Dmss_pa_01Package)EPackage.Registry.INSTANCE.getEPackage(Dmss_pa_01Package.eNS_URI);

		// Obtain or create and register package
		Object registeredDmss_pa_01Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Dmss_pa_01PackageImpl theDmss_pa_01Package = registeredDmss_pa_01Package instanceof Dmss_pa_01PackageImpl ? (Dmss_pa_01PackageImpl)registeredDmss_pa_01Package : new Dmss_pa_01PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDmss_pa_01Package.createPackageContents();

		// Initialize created meta-data
		theDmss_pa_01Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDmss_pa_01Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Dmss_pa_01Package.eNS_URI, theDmss_pa_01Package);
		return theDmss_pa_01Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversidad() {
		return universidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversidad_Titulosuniversitarios() {
		return (EReference)universidadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversidad_Nombre() {
		return (EAttribute)universidadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversidad_Alumnos() {
		return (EReference)universidadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversidad_Profesores() {
		return (EReference)universidadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTituloUniversitario() {
		return tituloUniversitarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTituloUniversitario_Asignaturas() {
		return (EReference)tituloUniversitarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTituloUniversitario_Nombre() {
		return (EAttribute)tituloUniversitarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsignatura() {
		return asignaturaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsignatura_Nombre() {
		return (EAttribute)asignaturaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsignatura_Codigo() {
		return (EAttribute)asignaturaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsignatura_Bloques() {
		return (EReference)asignaturaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsignatura_Profesores() {
		return (EReference)asignaturaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsignatura_Ficha12a() {
		return (EAttribute)asignaturaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsignatura_Grupostrabajo() {
		return (EReference)asignaturaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsignatura_Escoordinada() {
		return (EReference)asignaturaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProfesor() {
		return profesorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfesor_Nombre() {
		return (EAttribute)profesorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfesor_Asignaturas() {
		return (EReference)profesorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProfesor_Escoordinador() {
		return (EReference)profesorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlumno() {
		return alumnoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlumno_Nombre() {
		return (EAttribute)alumnoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlumno_MatriculadoenTU() {
		return (EReference)alumnoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlumno_MatriculadoenASIG() {
		return (EReference)alumnoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlumno_Gruposdetrabajo() {
		return (EReference)alumnoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBloque() {
		return bloqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBloque_Actividades() {
		return (EReference)bloqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBloque_Nombre() {
		return (EAttribute)bloqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActividad() {
		return actividadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActividad_ID() {
		return (EAttribute)actividadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActividad_Descripcion() {
		return (EAttribute)actividadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActividad_Visible() {
		return (EAttribute)actividadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncuesta() {
		return encuestaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsulta() {
		return consultaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTarea() {
		return tareaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTarea_NumMax() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTarea_FechaLimite() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTarea_Calificacion() {
		return (EAttribute)tareaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getENLACEURL() {
		return enlaceurlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENLACEURL_Url() {
		return (EAttribute)enlaceurlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForo() {
		return foroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForo_Preguntas() {
		return (EReference)foroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecurso() {
		return recursoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecurso_Extension() {
		return (EAttribute)recursoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGrupoTrabajo() {
		return grupoTrabajoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrupoTrabajo_ID() {
		return (EAttribute)grupoTrabajoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrupoTrabajo_Descripcion() {
		return (EAttribute)grupoTrabajoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrupoTrabajo_Numgrupos() {
		return (EAttribute)grupoTrabajoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrupoTrabajo_NumMinEstu() {
		return (EAttribute)grupoTrabajoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrupoTrabajo_NumMaxEstu() {
		return (EAttribute)grupoTrabajoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGrupoTrabajo_AlumnosGT() {
		return (EReference)grupoTrabajoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGrupoTrabajo_Actividadobligatoria() {
		return (EReference)grupoTrabajoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPregunta() {
		return preguntaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPregunta_Respuestas() {
		return (EReference)preguntaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPregunta_Texto() {
		return (EAttribute)preguntaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRespuesta() {
		return respuestaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRespuesta_Respuestaanidada() {
		return (EReference)respuestaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRespuesta_Texto() {
		return (EAttribute)respuestaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoot_Universidad() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNOTA() {
		return notaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTIPO() {
		return tipoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dmss_pa_01Factory getDmss_pa_01Factory() {
		return (Dmss_pa_01Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		universidadEClass = createEClass(UNIVERSIDAD);
		createEReference(universidadEClass, UNIVERSIDAD__TITULOSUNIVERSITARIOS);
		createEAttribute(universidadEClass, UNIVERSIDAD__NOMBRE);
		createEReference(universidadEClass, UNIVERSIDAD__ALUMNOS);
		createEReference(universidadEClass, UNIVERSIDAD__PROFESORES);

		tituloUniversitarioEClass = createEClass(TITULO_UNIVERSITARIO);
		createEReference(tituloUniversitarioEClass, TITULO_UNIVERSITARIO__ASIGNATURAS);
		createEAttribute(tituloUniversitarioEClass, TITULO_UNIVERSITARIO__NOMBRE);

		asignaturaEClass = createEClass(ASIGNATURA);
		createEAttribute(asignaturaEClass, ASIGNATURA__NOMBRE);
		createEAttribute(asignaturaEClass, ASIGNATURA__CODIGO);
		createEReference(asignaturaEClass, ASIGNATURA__BLOQUES);
		createEReference(asignaturaEClass, ASIGNATURA__PROFESORES);
		createEAttribute(asignaturaEClass, ASIGNATURA__FICHA12A);
		createEReference(asignaturaEClass, ASIGNATURA__GRUPOSTRABAJO);
		createEReference(asignaturaEClass, ASIGNATURA__ESCOORDINADA);

		profesorEClass = createEClass(PROFESOR);
		createEAttribute(profesorEClass, PROFESOR__NOMBRE);
		createEReference(profesorEClass, PROFESOR__ASIGNATURAS);
		createEReference(profesorEClass, PROFESOR__ESCOORDINADOR);

		alumnoEClass = createEClass(ALUMNO);
		createEAttribute(alumnoEClass, ALUMNO__NOMBRE);
		createEReference(alumnoEClass, ALUMNO__MATRICULADOEN_TU);
		createEReference(alumnoEClass, ALUMNO__MATRICULADOEN_ASIG);
		createEReference(alumnoEClass, ALUMNO__GRUPOSDETRABAJO);

		bloqueEClass = createEClass(BLOQUE);
		createEReference(bloqueEClass, BLOQUE__ACTIVIDADES);
		createEAttribute(bloqueEClass, BLOQUE__NOMBRE);

		actividadEClass = createEClass(ACTIVIDAD);
		createEAttribute(actividadEClass, ACTIVIDAD__ID);
		createEAttribute(actividadEClass, ACTIVIDAD__DESCRIPCION);
		createEAttribute(actividadEClass, ACTIVIDAD__VISIBLE);

		encuestaEClass = createEClass(ENCUESTA);

		consultaEClass = createEClass(CONSULTA);

		tareaEClass = createEClass(TAREA);
		createEAttribute(tareaEClass, TAREA__NUM_MAX);
		createEAttribute(tareaEClass, TAREA__FECHA_LIMITE);
		createEAttribute(tareaEClass, TAREA__CALIFICACION);

		enlaceurlEClass = createEClass(ENLACEURL);
		createEAttribute(enlaceurlEClass, ENLACEURL__URL);

		foroEClass = createEClass(FORO);
		createEReference(foroEClass, FORO__PREGUNTAS);

		recursoEClass = createEClass(RECURSO);
		createEAttribute(recursoEClass, RECURSO__EXTENSION);

		grupoTrabajoEClass = createEClass(GRUPO_TRABAJO);
		createEAttribute(grupoTrabajoEClass, GRUPO_TRABAJO__ID);
		createEAttribute(grupoTrabajoEClass, GRUPO_TRABAJO__DESCRIPCION);
		createEAttribute(grupoTrabajoEClass, GRUPO_TRABAJO__NUMGRUPOS);
		createEAttribute(grupoTrabajoEClass, GRUPO_TRABAJO__NUM_MIN_ESTU);
		createEAttribute(grupoTrabajoEClass, GRUPO_TRABAJO__NUM_MAX_ESTU);
		createEReference(grupoTrabajoEClass, GRUPO_TRABAJO__ALUMNOS_GT);
		createEReference(grupoTrabajoEClass, GRUPO_TRABAJO__ACTIVIDADOBLIGATORIA);

		preguntaEClass = createEClass(PREGUNTA);
		createEReference(preguntaEClass, PREGUNTA__RESPUESTAS);
		createEAttribute(preguntaEClass, PREGUNTA__TEXTO);

		respuestaEClass = createEClass(RESPUESTA);
		createEReference(respuestaEClass, RESPUESTA__RESPUESTAANIDADA);
		createEAttribute(respuestaEClass, RESPUESTA__TEXTO);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__UNIVERSIDAD);

		// Create enums
		notaEEnum = createEEnum(NOTA);
		tipoEEnum = createEEnum(TIPO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		encuestaEClass.getESuperTypes().add(this.getActividad());
		consultaEClass.getESuperTypes().add(this.getActividad());
		tareaEClass.getESuperTypes().add(this.getActividad());
		enlaceurlEClass.getESuperTypes().add(this.getActividad());
		foroEClass.getESuperTypes().add(this.getActividad());
		recursoEClass.getESuperTypes().add(this.getActividad());

		// Initialize classes, features, and operations; add parameters
		initEClass(universidadEClass, Universidad.class, "Universidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversidad_Titulosuniversitarios(), this.getTituloUniversitario(), null, "titulosuniversitarios", null, 1, -1, Universidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniversidad_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Universidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversidad_Alumnos(), this.getAlumno(), null, "alumnos", null, 1, -1, Universidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversidad_Profesores(), this.getProfesor(), null, "profesores", null, 1, -1, Universidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tituloUniversitarioEClass, TituloUniversitario.class, "TituloUniversitario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTituloUniversitario_Asignaturas(), this.getAsignatura(), null, "asignaturas", null, 1, -1, TituloUniversitario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTituloUniversitario_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, TituloUniversitario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asignaturaEClass, Asignatura.class, "Asignatura", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsignatura_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Asignatura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsignatura_Codigo(), ecorePackage.getEString(), "Codigo", null, 0, 1, Asignatura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsignatura_Bloques(), this.getBloque(), null, "bloques", null, 1, -1, Asignatura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsignatura_Profesores(), this.getProfesor(), this.getProfesor_Asignaturas(), "profesores", null, 1, -1, Asignatura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsignatura_Ficha12a(), ecorePackage.getEString(), "Ficha12a", null, 0, 1, Asignatura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsignatura_Grupostrabajo(), this.getGrupoTrabajo(), null, "grupostrabajo", null, 0, -1, Asignatura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsignatura_Escoordinada(), this.getProfesor(), this.getProfesor_Escoordinador(), "escoordinada", null, 0, 1, Asignatura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profesorEClass, Profesor.class, "Profesor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfesor_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfesor_Asignaturas(), this.getAsignatura(), this.getAsignatura_Profesores(), "asignaturas", null, 0, -1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfesor_Escoordinador(), this.getAsignatura(), this.getAsignatura_Escoordinada(), "escoordinador", null, 0, 1, Profesor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alumnoEClass, Alumno.class, "Alumno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlumno_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Alumno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlumno_MatriculadoenTU(), this.getTituloUniversitario(), null, "matriculadoenTU", null, 1, -1, Alumno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlumno_MatriculadoenASIG(), this.getAsignatura(), null, "matriculadoenASIG", null, 0, -1, Alumno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlumno_Gruposdetrabajo(), this.getGrupoTrabajo(), this.getGrupoTrabajo_AlumnosGT(), "gruposdetrabajo", null, 0, -1, Alumno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bloqueEClass, Bloque.class, "Bloque", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBloque_Actividades(), this.getActividad(), null, "actividades", null, 1, -1, Bloque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBloque_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Bloque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actividadEClass, Actividad.class, "Actividad", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActividad_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActividad_Descripcion(), ecorePackage.getEString(), "Descripcion", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActividad_Visible(), ecorePackage.getEBoolean(), "Visible", null, 0, 1, Actividad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encuestaEClass, Encuesta.class, "Encuesta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(consultaEClass, Consulta.class, "Consulta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tareaEClass, Tarea.class, "Tarea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarea_NumMax(), ecorePackage.getEInt(), "NumMax", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarea_FechaLimite(), ecorePackage.getEString(), "FechaLimite", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarea_Calificacion(), this.getNOTA(), "Calificacion", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enlaceurlEClass, dmss_pa_01.ENLACEURL.class, "ENLACEURL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENLACEURL_Url(), ecorePackage.getEString(), "url", null, 0, 1, dmss_pa_01.ENLACEURL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foroEClass, Foro.class, "Foro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForo_Preguntas(), this.getPregunta(), null, "preguntas", null, 0, -1, Foro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recursoEClass, Recurso.class, "Recurso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecurso_Extension(), this.getTIPO(), "Extension", null, 0, 1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grupoTrabajoEClass, GrupoTrabajo.class, "GrupoTrabajo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrupoTrabajo_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, GrupoTrabajo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrupoTrabajo_Descripcion(), ecorePackage.getEString(), "Descripcion", null, 0, 1, GrupoTrabajo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrupoTrabajo_Numgrupos(), ecorePackage.getEInt(), "Numgrupos", null, 0, 1, GrupoTrabajo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrupoTrabajo_NumMinEstu(), ecorePackage.getEInt(), "NumMinEstu", null, 0, 1, GrupoTrabajo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrupoTrabajo_NumMaxEstu(), ecorePackage.getEInt(), "NumMaxEstu", null, 0, 1, GrupoTrabajo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrupoTrabajo_AlumnosGT(), this.getAlumno(), this.getAlumno_Gruposdetrabajo(), "alumnosGT", null, 1, -1, GrupoTrabajo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrupoTrabajo_Actividadobligatoria(), this.getActividad(), null, "actividadobligatoria", null, 0, -1, GrupoTrabajo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preguntaEClass, Pregunta.class, "Pregunta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPregunta_Respuestas(), this.getRespuesta(), null, "respuestas", null, 0, -1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPregunta_Texto(), ecorePackage.getEString(), "Texto", null, 0, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(respuestaEClass, Respuesta.class, "Respuesta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRespuesta_Respuestaanidada(), this.getRespuesta(), null, "respuestaanidada", null, 0, -1, Respuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespuesta_Texto(), ecorePackage.getEString(), "Texto", null, 0, 1, Respuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Universidad(), this.getUniversidad(), null, "universidad", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(notaEEnum, dmss_pa_01.NOTA.class, "NOTA");
		addEEnumLiteral(notaEEnum, dmss_pa_01.NOTA.ESCALA5);
		addEEnumLiteral(notaEEnum, dmss_pa_01.NOTA.ESCALA2);

		initEEnum(tipoEEnum, dmss_pa_01.TIPO.class, "TIPO");
		addEEnumLiteral(tipoEEnum, dmss_pa_01.TIPO.PDF);
		addEEnumLiteral(tipoEEnum, dmss_pa_01.TIPO.WORD);
		addEEnumLiteral(tipoEEnum, dmss_pa_01.TIPO.ODT);
		addEEnumLiteral(tipoEEnum, dmss_pa_01.TIPO.ODP);
		addEEnumLiteral(tipoEEnum, dmss_pa_01.TIPO.AVI);
		addEEnumLiteral(tipoEEnum, dmss_pa_01.TIPO.MP4);
		addEEnumLiteral(tipoEEnum, dmss_pa_01.TIPO.PPT);
		addEEnumLiteral(tipoEEnum, dmss_pa_01.TIPO.UNDEFINED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
		// gmf.diagram
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (universidadEClass,
		   source,
		   new String[] {
			   "label", "Nombre"
		   });
		addAnnotation
		  (tituloUniversitarioEClass,
		   source,
		   new String[] {
			   "label", "Nombre"
		   });
		addAnnotation
		  (asignaturaEClass,
		   source,
		   new String[] {
			   "label", "Nombre"
		   });
		addAnnotation
		  (profesorEClass,
		   source,
		   new String[] {
			   "label", "Nombre"
		   });
		addAnnotation
		  (alumnoEClass,
		   source,
		   new String[] {
			   "label", "Nombre"
		   });
		addAnnotation
		  (bloqueEClass,
		   source,
		   new String[] {
			   "label", "Nombre"
		   });
		addAnnotation
		  (encuestaEClass,
		   source,
		   new String[] {
			   "label", "Descripcion"
		   });
		addAnnotation
		  (consultaEClass,
		   source,
		   new String[] {
			   "label", "Descripcion"
		   });
		addAnnotation
		  (tareaEClass,
		   source,
		   new String[] {
			   "label", "Descripcion"
		   });
		addAnnotation
		  (enlaceurlEClass,
		   source,
		   new String[] {
			   "label", "Descripcion"
		   });
		addAnnotation
		  (foroEClass,
		   source,
		   new String[] {
			   "label", "Descripcion"
		   });
		addAnnotation
		  (recursoEClass,
		   source,
		   new String[] {
			   "label", "Extension"
		   });
		addAnnotation
		  (grupoTrabajoEClass,
		   source,
		   new String[] {
			   "label", "Descripcion"
		   });
		addAnnotation
		  (preguntaEClass,
		   source,
		   new String[] {
			   "label", "Texto"
		   });
		addAnnotation
		  (respuestaEClass,
		   source,
		   new String[] {
			   "label", "Texto"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getUniversidad_Titulosuniversitarios(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUniversidad_Alumnos(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUniversidad_Profesores(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTituloUniversitario_Asignaturas(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAsignatura_Bloques(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAsignatura_Grupostrabajo(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getBloque_Actividades(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getForo_Preguntas(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPregunta_Respuestas(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRespuesta_Respuestaanidada(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRoot_Universidad(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (getAsignatura_Profesores(),
		   source,
		   new String[] {
			   "source", "Asignatura",
			   "target", "Profesor"
		   });
		addAnnotation
		  (getAsignatura_Escoordinada(),
		   source,
		   new String[] {
			   "source", "Asignatura",
			   "target", "Profesor"
		   });
		addAnnotation
		  (getProfesor_Asignaturas(),
		   source,
		   new String[] {
			   "source", "Profesor",
			   "target", "Asignatura"
		   });
		addAnnotation
		  (getProfesor_Escoordinador(),
		   source,
		   new String[] {
			   "source", "Profesor",
			   "target", "Asignatura"
		   });
		addAnnotation
		  (getAlumno_MatriculadoenTU(),
		   source,
		   new String[] {
			   "source", "Alumno",
			   "target", "TituloUniversitario"
		   });
		addAnnotation
		  (getAlumno_MatriculadoenASIG(),
		   source,
		   new String[] {
			   "source", "Alumno",
			   "target", "Asignatura"
		   });
		addAnnotation
		  (getAlumno_Gruposdetrabajo(),
		   source,
		   new String[] {
			   "source", "Alumno",
			   "target", "GrupoTrabajo"
		   });
		addAnnotation
		  (getGrupoTrabajo_AlumnosGT(),
		   source,
		   new String[] {
			   "source", "GrupoTrabajo",
			   "target", "Alumno"
		   });
		addAnnotation
		  (getGrupoTrabajo_Actividadobligatoria(),
		   source,
		   new String[] {
			   "source", "GrupoTrabajo",
			   "target", "Actividad"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (rootEClass,
		   source,
		   new String[] {
		   });
	}

} //Dmss_pa_01PackageImpl
