/**
 */
package dmss_pa_01.impl;

import dmss_pa_01.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dmss_pa_01FactoryImpl extends EFactoryImpl implements Dmss_pa_01Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Dmss_pa_01Factory init() {
		try {
			Dmss_pa_01Factory theDmss_pa_01Factory = (Dmss_pa_01Factory)EPackage.Registry.INSTANCE.getEFactory(Dmss_pa_01Package.eNS_URI);
			if (theDmss_pa_01Factory != null) {
				return theDmss_pa_01Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Dmss_pa_01FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dmss_pa_01FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Dmss_pa_01Package.UNIVERSIDAD: return createUniversidad();
			case Dmss_pa_01Package.TITULO_UNIVERSITARIO: return createTituloUniversitario();
			case Dmss_pa_01Package.ASIGNATURA: return createAsignatura();
			case Dmss_pa_01Package.PROFESOR: return createProfesor();
			case Dmss_pa_01Package.ALUMNO: return createAlumno();
			case Dmss_pa_01Package.BLOQUE: return createBloque();
			case Dmss_pa_01Package.ENCUESTA: return createEncuesta();
			case Dmss_pa_01Package.CONSULTA: return createConsulta();
			case Dmss_pa_01Package.TAREA: return createTarea();
			case Dmss_pa_01Package.ENLACEURL: return createENLACEURL();
			case Dmss_pa_01Package.FORO: return createForo();
			case Dmss_pa_01Package.RECURSO: return createRecurso();
			case Dmss_pa_01Package.GRUPO_TRABAJO: return createGrupoTrabajo();
			case Dmss_pa_01Package.PREGUNTA: return createPregunta();
			case Dmss_pa_01Package.RESPUESTA: return createRespuesta();
			case Dmss_pa_01Package.ROOT: return createRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Dmss_pa_01Package.NOTA:
				return createNOTAFromString(eDataType, initialValue);
			case Dmss_pa_01Package.TIPO:
				return createTIPOFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Dmss_pa_01Package.NOTA:
				return convertNOTAToString(eDataType, instanceValue);
			case Dmss_pa_01Package.TIPO:
				return convertTIPOToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Universidad createUniversidad() {
		UniversidadImpl universidad = new UniversidadImpl();
		return universidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TituloUniversitario createTituloUniversitario() {
		TituloUniversitarioImpl tituloUniversitario = new TituloUniversitarioImpl();
		return tituloUniversitario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asignatura createAsignatura() {
		AsignaturaImpl asignatura = new AsignaturaImpl();
		return asignatura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Profesor createProfesor() {
		ProfesorImpl profesor = new ProfesorImpl();
		return profesor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alumno createAlumno() {
		AlumnoImpl alumno = new AlumnoImpl();
		return alumno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bloque createBloque() {
		BloqueImpl bloque = new BloqueImpl();
		return bloque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Encuesta createEncuesta() {
		EncuestaImpl encuesta = new EncuestaImpl();
		return encuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consulta createConsulta() {
		ConsultaImpl consulta = new ConsultaImpl();
		return consulta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tarea createTarea() {
		TareaImpl tarea = new TareaImpl();
		return tarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENLACEURL createENLACEURL() {
		ENLACEURLImpl enlaceurl = new ENLACEURLImpl();
		return enlaceurl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Foro createForo() {
		ForoImpl foro = new ForoImpl();
		return foro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Recurso createRecurso() {
		RecursoImpl recurso = new RecursoImpl();
		return recurso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrupoTrabajo createGrupoTrabajo() {
		GrupoTrabajoImpl grupoTrabajo = new GrupoTrabajoImpl();
		return grupoTrabajo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pregunta createPregunta() {
		PreguntaImpl pregunta = new PreguntaImpl();
		return pregunta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Respuesta createRespuesta() {
		RespuestaImpl respuesta = new RespuestaImpl();
		return respuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NOTA createNOTAFromString(EDataType eDataType, String initialValue) {
		NOTA result = NOTA.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNOTAToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIPO createTIPOFromString(EDataType eDataType, String initialValue) {
		TIPO result = TIPO.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTIPOToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dmss_pa_01Package getDmss_pa_01Package() {
		return (Dmss_pa_01Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Dmss_pa_01Package getPackage() {
		return Dmss_pa_01Package.eINSTANCE;
	}

} //Dmss_pa_01FactoryImpl
