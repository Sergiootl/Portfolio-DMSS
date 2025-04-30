/**
 */
package dmss_pa_01;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dmss_pa_01.Dmss_pa_01Factory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface Dmss_pa_01Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dmss_pa_01";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dmss_pa_01";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dmss_pa_01";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dmss_pa_01Package eINSTANCE = dmss_pa_01.impl.Dmss_pa_01PackageImpl.init();

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.UniversidadImpl <em>Universidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.UniversidadImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getUniversidad()
	 * @generated
	 */
	int UNIVERSIDAD = 0;

	/**
	 * The feature id for the '<em><b>Titulosuniversitarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD__TITULOSUNIVERSITARIOS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Alumnos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD__ALUMNOS = 2;

	/**
	 * The feature id for the '<em><b>Profesores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD__PROFESORES = 3;

	/**
	 * The number of structural features of the '<em>Universidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Universidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.TituloUniversitarioImpl <em>Titulo Universitario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.TituloUniversitarioImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getTituloUniversitario()
	 * @generated
	 */
	int TITULO_UNIVERSITARIO = 1;

	/**
	 * The feature id for the '<em><b>Asignaturas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITULO_UNIVERSITARIO__ASIGNATURAS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITULO_UNIVERSITARIO__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Titulo Universitario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITULO_UNIVERSITARIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Titulo Universitario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITULO_UNIVERSITARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.AsignaturaImpl <em>Asignatura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.AsignaturaImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getAsignatura()
	 * @generated
	 */
	int ASIGNATURA = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNATURA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNATURA__CODIGO = 1;

	/**
	 * The feature id for the '<em><b>Bloques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNATURA__BLOQUES = 2;

	/**
	 * The feature id for the '<em><b>Profesores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNATURA__PROFESORES = 3;

	/**
	 * The feature id for the '<em><b>Ficha12a</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNATURA__FICHA12A = 4;

	/**
	 * The feature id for the '<em><b>Grupostrabajo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNATURA__GRUPOSTRABAJO = 5;

	/**
	 * The feature id for the '<em><b>Escoordinada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNATURA__ESCOORDINADA = 6;

	/**
	 * The number of structural features of the '<em>Asignatura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNATURA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Asignatura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNATURA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.ProfesorImpl <em>Profesor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.ProfesorImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getProfesor()
	 * @generated
	 */
	int PROFESOR = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESOR__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Asignaturas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESOR__ASIGNATURAS = 1;

	/**
	 * The feature id for the '<em><b>Escoordinador</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESOR__ESCOORDINADOR = 2;

	/**
	 * The number of structural features of the '<em>Profesor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Profesor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.AlumnoImpl <em>Alumno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.AlumnoImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getAlumno()
	 * @generated
	 */
	int ALUMNO = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Matriculadoen TU</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO__MATRICULADOEN_TU = 1;

	/**
	 * The feature id for the '<em><b>Matriculadoen ASIG</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO__MATRICULADOEN_ASIG = 2;

	/**
	 * The feature id for the '<em><b>Gruposdetrabajo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO__GRUPOSDETRABAJO = 3;

	/**
	 * The number of structural features of the '<em>Alumno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Alumno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUMNO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.BloqueImpl <em>Bloque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.BloqueImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getBloque()
	 * @generated
	 */
	int BLOQUE = 5;

	/**
	 * The feature id for the '<em><b>Actividades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUE__ACTIVIDADES = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUE__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Bloque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bloque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.ActividadImpl <em>Actividad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.ActividadImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getActividad()
	 * @generated
	 */
	int ACTIVIDAD = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__ID = 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__DESCRIPCION = 1;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD__VISIBLE = 2;

	/**
	 * The number of structural features of the '<em>Actividad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Actividad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.EncuestaImpl <em>Encuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.EncuestaImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getEncuesta()
	 * @generated
	 */
	int ENCUESTA = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA__ID = ACTIVIDAD__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA__DESCRIPCION = ACTIVIDAD__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA__VISIBLE = ACTIVIDAD__VISIBLE;

	/**
	 * The number of structural features of the '<em>Encuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA_FEATURE_COUNT = ACTIVIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Encuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA_OPERATION_COUNT = ACTIVIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.ConsultaImpl <em>Consulta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.ConsultaImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getConsulta()
	 * @generated
	 */
	int CONSULTA = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTA__ID = ACTIVIDAD__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTA__DESCRIPCION = ACTIVIDAD__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTA__VISIBLE = ACTIVIDAD__VISIBLE;

	/**
	 * The number of structural features of the '<em>Consulta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTA_FEATURE_COUNT = ACTIVIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Consulta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTA_OPERATION_COUNT = ACTIVIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.TareaImpl <em>Tarea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.TareaImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getTarea()
	 * @generated
	 */
	int TAREA = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__ID = ACTIVIDAD__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__DESCRIPCION = ACTIVIDAD__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__VISIBLE = ACTIVIDAD__VISIBLE;

	/**
	 * The feature id for the '<em><b>Num Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__NUM_MAX = ACTIVIDAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fecha Limite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__FECHA_LIMITE = ACTIVIDAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Calificacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__CALIFICACION = ACTIVIDAD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FEATURE_COUNT = ACTIVIDAD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_OPERATION_COUNT = ACTIVIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.ENLACEURLImpl <em>ENLACEURL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.ENLACEURLImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getENLACEURL()
	 * @generated
	 */
	int ENLACEURL = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACEURL__ID = ACTIVIDAD__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACEURL__DESCRIPCION = ACTIVIDAD__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACEURL__VISIBLE = ACTIVIDAD__VISIBLE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACEURL__URL = ACTIVIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ENLACEURL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACEURL_FEATURE_COUNT = ACTIVIDAD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ENLACEURL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENLACEURL_OPERATION_COUNT = ACTIVIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.ForoImpl <em>Foro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.ForoImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getForo()
	 * @generated
	 */
	int FORO = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORO__ID = ACTIVIDAD__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORO__DESCRIPCION = ACTIVIDAD__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORO__VISIBLE = ACTIVIDAD__VISIBLE;

	/**
	 * The feature id for the '<em><b>Preguntas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORO__PREGUNTAS = ACTIVIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Foro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORO_FEATURE_COUNT = ACTIVIDAD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Foro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORO_OPERATION_COUNT = ACTIVIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.RecursoImpl <em>Recurso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.RecursoImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getRecurso()
	 * @generated
	 */
	int RECURSO = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__ID = ACTIVIDAD__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__DESCRIPCION = ACTIVIDAD__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__VISIBLE = ACTIVIDAD__VISIBLE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__EXTENSION = ACTIVIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Recurso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO_FEATURE_COUNT = ACTIVIDAD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Recurso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO_OPERATION_COUNT = ACTIVIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.GrupoTrabajoImpl <em>Grupo Trabajo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.GrupoTrabajoImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getGrupoTrabajo()
	 * @generated
	 */
	int GRUPO_TRABAJO = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_TRABAJO__ID = 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_TRABAJO__DESCRIPCION = 1;

	/**
	 * The feature id for the '<em><b>Numgrupos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_TRABAJO__NUMGRUPOS = 2;

	/**
	 * The feature id for the '<em><b>Num Min Estu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_TRABAJO__NUM_MIN_ESTU = 3;

	/**
	 * The feature id for the '<em><b>Num Max Estu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_TRABAJO__NUM_MAX_ESTU = 4;

	/**
	 * The feature id for the '<em><b>Alumnos GT</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_TRABAJO__ALUMNOS_GT = 5;

	/**
	 * The feature id for the '<em><b>Actividadobligatoria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_TRABAJO__ACTIVIDADOBLIGATORIA = 6;

	/**
	 * The number of structural features of the '<em>Grupo Trabajo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_TRABAJO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Grupo Trabajo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_TRABAJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.PreguntaImpl <em>Pregunta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.PreguntaImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getPregunta()
	 * @generated
	 */
	int PREGUNTA = 14;

	/**
	 * The feature id for the '<em><b>Respuestas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__RESPUESTAS = 0;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__TEXTO = 1;

	/**
	 * The number of structural features of the '<em>Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.RespuestaImpl <em>Respuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.RespuestaImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getRespuesta()
	 * @generated
	 */
	int RESPUESTA = 15;

	/**
	 * The feature id for the '<em><b>Respuestaanidada</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA__RESPUESTAANIDADA = 0;

	/**
	 * The feature id for the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA__TEXTO = 1;

	/**
	 * The number of structural features of the '<em>Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.impl.RootImpl
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 16;

	/**
	 * The feature id for the '<em><b>Universidad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__UNIVERSIDAD = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dmss_pa_01.NOTA <em>NOTA</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.NOTA
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getNOTA()
	 * @generated
	 */
	int NOTA = 17;

	/**
	 * The meta object id for the '{@link dmss_pa_01.TIPO <em>TIPO</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmss_pa_01.TIPO
	 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getTIPO()
	 * @generated
	 */
	int TIPO = 18;


	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Universidad <em>Universidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universidad</em>'.
	 * @see dmss_pa_01.Universidad
	 * @generated
	 */
	EClass getUniversidad();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss_pa_01.Universidad#getTitulosuniversitarios <em>Titulosuniversitarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Titulosuniversitarios</em>'.
	 * @see dmss_pa_01.Universidad#getTitulosuniversitarios()
	 * @see #getUniversidad()
	 * @generated
	 */
	EReference getUniversidad_Titulosuniversitarios();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Universidad#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dmss_pa_01.Universidad#getNombre()
	 * @see #getUniversidad()
	 * @generated
	 */
	EAttribute getUniversidad_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss_pa_01.Universidad#getAlumnos <em>Alumnos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alumnos</em>'.
	 * @see dmss_pa_01.Universidad#getAlumnos()
	 * @see #getUniversidad()
	 * @generated
	 */
	EReference getUniversidad_Alumnos();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss_pa_01.Universidad#getProfesores <em>Profesores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profesores</em>'.
	 * @see dmss_pa_01.Universidad#getProfesores()
	 * @see #getUniversidad()
	 * @generated
	 */
	EReference getUniversidad_Profesores();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.TituloUniversitario <em>Titulo Universitario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titulo Universitario</em>'.
	 * @see dmss_pa_01.TituloUniversitario
	 * @generated
	 */
	EClass getTituloUniversitario();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss_pa_01.TituloUniversitario#getAsignaturas <em>Asignaturas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asignaturas</em>'.
	 * @see dmss_pa_01.TituloUniversitario#getAsignaturas()
	 * @see #getTituloUniversitario()
	 * @generated
	 */
	EReference getTituloUniversitario_Asignaturas();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.TituloUniversitario#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dmss_pa_01.TituloUniversitario#getNombre()
	 * @see #getTituloUniversitario()
	 * @generated
	 */
	EAttribute getTituloUniversitario_Nombre();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Asignatura <em>Asignatura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asignatura</em>'.
	 * @see dmss_pa_01.Asignatura
	 * @generated
	 */
	EClass getAsignatura();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Asignatura#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dmss_pa_01.Asignatura#getNombre()
	 * @see #getAsignatura()
	 * @generated
	 */
	EAttribute getAsignatura_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Asignatura#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see dmss_pa_01.Asignatura#getCodigo()
	 * @see #getAsignatura()
	 * @generated
	 */
	EAttribute getAsignatura_Codigo();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss_pa_01.Asignatura#getBloques <em>Bloques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bloques</em>'.
	 * @see dmss_pa_01.Asignatura#getBloques()
	 * @see #getAsignatura()
	 * @generated
	 */
	EReference getAsignatura_Bloques();

	/**
	 * Returns the meta object for the reference list '{@link dmss_pa_01.Asignatura#getProfesores <em>Profesores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Profesores</em>'.
	 * @see dmss_pa_01.Asignatura#getProfesores()
	 * @see #getAsignatura()
	 * @generated
	 */
	EReference getAsignatura_Profesores();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Asignatura#getFicha12a <em>Ficha12a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ficha12a</em>'.
	 * @see dmss_pa_01.Asignatura#getFicha12a()
	 * @see #getAsignatura()
	 * @generated
	 */
	EAttribute getAsignatura_Ficha12a();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss_pa_01.Asignatura#getGrupostrabajo <em>Grupostrabajo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grupostrabajo</em>'.
	 * @see dmss_pa_01.Asignatura#getGrupostrabajo()
	 * @see #getAsignatura()
	 * @generated
	 */
	EReference getAsignatura_Grupostrabajo();

	/**
	 * Returns the meta object for the reference '{@link dmss_pa_01.Asignatura#getEscoordinada <em>Escoordinada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Escoordinada</em>'.
	 * @see dmss_pa_01.Asignatura#getEscoordinada()
	 * @see #getAsignatura()
	 * @generated
	 */
	EReference getAsignatura_Escoordinada();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Profesor <em>Profesor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profesor</em>'.
	 * @see dmss_pa_01.Profesor
	 * @generated
	 */
	EClass getProfesor();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Profesor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dmss_pa_01.Profesor#getNombre()
	 * @see #getProfesor()
	 * @generated
	 */
	EAttribute getProfesor_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link dmss_pa_01.Profesor#getAsignaturas <em>Asignaturas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asignaturas</em>'.
	 * @see dmss_pa_01.Profesor#getAsignaturas()
	 * @see #getProfesor()
	 * @generated
	 */
	EReference getProfesor_Asignaturas();

	/**
	 * Returns the meta object for the reference '{@link dmss_pa_01.Profesor#getEscoordinador <em>Escoordinador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Escoordinador</em>'.
	 * @see dmss_pa_01.Profesor#getEscoordinador()
	 * @see #getProfesor()
	 * @generated
	 */
	EReference getProfesor_Escoordinador();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Alumno <em>Alumno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alumno</em>'.
	 * @see dmss_pa_01.Alumno
	 * @generated
	 */
	EClass getAlumno();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Alumno#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dmss_pa_01.Alumno#getNombre()
	 * @see #getAlumno()
	 * @generated
	 */
	EAttribute getAlumno_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link dmss_pa_01.Alumno#getMatriculadoenTU <em>Matriculadoen TU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matriculadoen TU</em>'.
	 * @see dmss_pa_01.Alumno#getMatriculadoenTU()
	 * @see #getAlumno()
	 * @generated
	 */
	EReference getAlumno_MatriculadoenTU();

	/**
	 * Returns the meta object for the reference list '{@link dmss_pa_01.Alumno#getMatriculadoenASIG <em>Matriculadoen ASIG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matriculadoen ASIG</em>'.
	 * @see dmss_pa_01.Alumno#getMatriculadoenASIG()
	 * @see #getAlumno()
	 * @generated
	 */
	EReference getAlumno_MatriculadoenASIG();

	/**
	 * Returns the meta object for the reference list '{@link dmss_pa_01.Alumno#getGruposdetrabajo <em>Gruposdetrabajo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gruposdetrabajo</em>'.
	 * @see dmss_pa_01.Alumno#getGruposdetrabajo()
	 * @see #getAlumno()
	 * @generated
	 */
	EReference getAlumno_Gruposdetrabajo();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Bloque <em>Bloque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloque</em>'.
	 * @see dmss_pa_01.Bloque
	 * @generated
	 */
	EClass getBloque();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss_pa_01.Bloque#getActividades <em>Actividades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actividades</em>'.
	 * @see dmss_pa_01.Bloque#getActividades()
	 * @see #getBloque()
	 * @generated
	 */
	EReference getBloque_Actividades();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Bloque#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see dmss_pa_01.Bloque#getNombre()
	 * @see #getBloque()
	 * @generated
	 */
	EAttribute getBloque_Nombre();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Actividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actividad</em>'.
	 * @see dmss_pa_01.Actividad
	 * @generated
	 */
	EClass getActividad();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Actividad#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see dmss_pa_01.Actividad#getID()
	 * @see #getActividad()
	 * @generated
	 */
	EAttribute getActividad_ID();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Actividad#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see dmss_pa_01.Actividad#getDescripcion()
	 * @see #getActividad()
	 * @generated
	 */
	EAttribute getActividad_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Actividad#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see dmss_pa_01.Actividad#isVisible()
	 * @see #getActividad()
	 * @generated
	 */
	EAttribute getActividad_Visible();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Encuesta <em>Encuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encuesta</em>'.
	 * @see dmss_pa_01.Encuesta
	 * @generated
	 */
	EClass getEncuesta();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Consulta <em>Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consulta</em>'.
	 * @see dmss_pa_01.Consulta
	 * @generated
	 */
	EClass getConsulta();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea</em>'.
	 * @see dmss_pa_01.Tarea
	 * @generated
	 */
	EClass getTarea();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Tarea#getNumMax <em>Num Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Max</em>'.
	 * @see dmss_pa_01.Tarea#getNumMax()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_NumMax();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Tarea#getFechaLimite <em>Fecha Limite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Limite</em>'.
	 * @see dmss_pa_01.Tarea#getFechaLimite()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_FechaLimite();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Tarea#getCalificacion <em>Calificacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calificacion</em>'.
	 * @see dmss_pa_01.Tarea#getCalificacion()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_Calificacion();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.ENLACEURL <em>ENLACEURL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENLACEURL</em>'.
	 * @see dmss_pa_01.ENLACEURL
	 * @generated
	 */
	EClass getENLACEURL();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.ENLACEURL#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see dmss_pa_01.ENLACEURL#getUrl()
	 * @see #getENLACEURL()
	 * @generated
	 */
	EAttribute getENLACEURL_Url();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Foro <em>Foro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foro</em>'.
	 * @see dmss_pa_01.Foro
	 * @generated
	 */
	EClass getForo();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss_pa_01.Foro#getPreguntas <em>Preguntas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preguntas</em>'.
	 * @see dmss_pa_01.Foro#getPreguntas()
	 * @see #getForo()
	 * @generated
	 */
	EReference getForo_Preguntas();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Recurso <em>Recurso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurso</em>'.
	 * @see dmss_pa_01.Recurso
	 * @generated
	 */
	EClass getRecurso();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Recurso#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see dmss_pa_01.Recurso#getExtension()
	 * @see #getRecurso()
	 * @generated
	 */
	EAttribute getRecurso_Extension();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.GrupoTrabajo <em>Grupo Trabajo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grupo Trabajo</em>'.
	 * @see dmss_pa_01.GrupoTrabajo
	 * @generated
	 */
	EClass getGrupoTrabajo();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.GrupoTrabajo#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see dmss_pa_01.GrupoTrabajo#getID()
	 * @see #getGrupoTrabajo()
	 * @generated
	 */
	EAttribute getGrupoTrabajo_ID();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.GrupoTrabajo#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see dmss_pa_01.GrupoTrabajo#getDescripcion()
	 * @see #getGrupoTrabajo()
	 * @generated
	 */
	EAttribute getGrupoTrabajo_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.GrupoTrabajo#getNumgrupos <em>Numgrupos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numgrupos</em>'.
	 * @see dmss_pa_01.GrupoTrabajo#getNumgrupos()
	 * @see #getGrupoTrabajo()
	 * @generated
	 */
	EAttribute getGrupoTrabajo_Numgrupos();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.GrupoTrabajo#getNumMinEstu <em>Num Min Estu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Min Estu</em>'.
	 * @see dmss_pa_01.GrupoTrabajo#getNumMinEstu()
	 * @see #getGrupoTrabajo()
	 * @generated
	 */
	EAttribute getGrupoTrabajo_NumMinEstu();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.GrupoTrabajo#getNumMaxEstu <em>Num Max Estu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Max Estu</em>'.
	 * @see dmss_pa_01.GrupoTrabajo#getNumMaxEstu()
	 * @see #getGrupoTrabajo()
	 * @generated
	 */
	EAttribute getGrupoTrabajo_NumMaxEstu();

	/**
	 * Returns the meta object for the reference list '{@link dmss_pa_01.GrupoTrabajo#getAlumnosGT <em>Alumnos GT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alumnos GT</em>'.
	 * @see dmss_pa_01.GrupoTrabajo#getAlumnosGT()
	 * @see #getGrupoTrabajo()
	 * @generated
	 */
	EReference getGrupoTrabajo_AlumnosGT();

	/**
	 * Returns the meta object for the reference list '{@link dmss_pa_01.GrupoTrabajo#getActividadobligatoria <em>Actividadobligatoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actividadobligatoria</em>'.
	 * @see dmss_pa_01.GrupoTrabajo#getActividadobligatoria()
	 * @see #getGrupoTrabajo()
	 * @generated
	 */
	EReference getGrupoTrabajo_Actividadobligatoria();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Pregunta <em>Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pregunta</em>'.
	 * @see dmss_pa_01.Pregunta
	 * @generated
	 */
	EClass getPregunta();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss_pa_01.Pregunta#getRespuestas <em>Respuestas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Respuestas</em>'.
	 * @see dmss_pa_01.Pregunta#getRespuestas()
	 * @see #getPregunta()
	 * @generated
	 */
	EReference getPregunta_Respuestas();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Pregunta#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see dmss_pa_01.Pregunta#getTexto()
	 * @see #getPregunta()
	 * @generated
	 */
	EAttribute getPregunta_Texto();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Respuesta <em>Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Respuesta</em>'.
	 * @see dmss_pa_01.Respuesta
	 * @generated
	 */
	EClass getRespuesta();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss_pa_01.Respuesta#getRespuestaanidada <em>Respuestaanidada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Respuestaanidada</em>'.
	 * @see dmss_pa_01.Respuesta#getRespuestaanidada()
	 * @see #getRespuesta()
	 * @generated
	 */
	EReference getRespuesta_Respuestaanidada();

	/**
	 * Returns the meta object for the attribute '{@link dmss_pa_01.Respuesta#getTexto <em>Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texto</em>'.
	 * @see dmss_pa_01.Respuesta#getTexto()
	 * @see #getRespuesta()
	 * @generated
	 */
	EAttribute getRespuesta_Texto();

	/**
	 * Returns the meta object for class '{@link dmss_pa_01.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see dmss_pa_01.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link dmss_pa_01.Root#getUniversidad <em>Universidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Universidad</em>'.
	 * @see dmss_pa_01.Root#getUniversidad()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Universidad();

	/**
	 * Returns the meta object for enum '{@link dmss_pa_01.NOTA <em>NOTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>NOTA</em>'.
	 * @see dmss_pa_01.NOTA
	 * @generated
	 */
	EEnum getNOTA();

	/**
	 * Returns the meta object for enum '{@link dmss_pa_01.TIPO <em>TIPO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TIPO</em>'.
	 * @see dmss_pa_01.TIPO
	 * @generated
	 */
	EEnum getTIPO();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Dmss_pa_01Factory getDmss_pa_01Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.UniversidadImpl <em>Universidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.UniversidadImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getUniversidad()
		 * @generated
		 */
		EClass UNIVERSIDAD = eINSTANCE.getUniversidad();

		/**
		 * The meta object literal for the '<em><b>Titulosuniversitarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSIDAD__TITULOSUNIVERSITARIOS = eINSTANCE.getUniversidad_Titulosuniversitarios();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSIDAD__NOMBRE = eINSTANCE.getUniversidad_Nombre();

		/**
		 * The meta object literal for the '<em><b>Alumnos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSIDAD__ALUMNOS = eINSTANCE.getUniversidad_Alumnos();

		/**
		 * The meta object literal for the '<em><b>Profesores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSIDAD__PROFESORES = eINSTANCE.getUniversidad_Profesores();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.TituloUniversitarioImpl <em>Titulo Universitario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.TituloUniversitarioImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getTituloUniversitario()
		 * @generated
		 */
		EClass TITULO_UNIVERSITARIO = eINSTANCE.getTituloUniversitario();

		/**
		 * The meta object literal for the '<em><b>Asignaturas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITULO_UNIVERSITARIO__ASIGNATURAS = eINSTANCE.getTituloUniversitario_Asignaturas();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITULO_UNIVERSITARIO__NOMBRE = eINSTANCE.getTituloUniversitario_Nombre();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.AsignaturaImpl <em>Asignatura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.AsignaturaImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getAsignatura()
		 * @generated
		 */
		EClass ASIGNATURA = eINSTANCE.getAsignatura();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNATURA__NOMBRE = eINSTANCE.getAsignatura_Nombre();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNATURA__CODIGO = eINSTANCE.getAsignatura_Codigo();

		/**
		 * The meta object literal for the '<em><b>Bloques</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASIGNATURA__BLOQUES = eINSTANCE.getAsignatura_Bloques();

		/**
		 * The meta object literal for the '<em><b>Profesores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASIGNATURA__PROFESORES = eINSTANCE.getAsignatura_Profesores();

		/**
		 * The meta object literal for the '<em><b>Ficha12a</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNATURA__FICHA12A = eINSTANCE.getAsignatura_Ficha12a();

		/**
		 * The meta object literal for the '<em><b>Grupostrabajo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASIGNATURA__GRUPOSTRABAJO = eINSTANCE.getAsignatura_Grupostrabajo();

		/**
		 * The meta object literal for the '<em><b>Escoordinada</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASIGNATURA__ESCOORDINADA = eINSTANCE.getAsignatura_Escoordinada();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.ProfesorImpl <em>Profesor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.ProfesorImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getProfesor()
		 * @generated
		 */
		EClass PROFESOR = eINSTANCE.getProfesor();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESOR__NOMBRE = eINSTANCE.getProfesor_Nombre();

		/**
		 * The meta object literal for the '<em><b>Asignaturas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESOR__ASIGNATURAS = eINSTANCE.getProfesor_Asignaturas();

		/**
		 * The meta object literal for the '<em><b>Escoordinador</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESOR__ESCOORDINADOR = eINSTANCE.getProfesor_Escoordinador();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.AlumnoImpl <em>Alumno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.AlumnoImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getAlumno()
		 * @generated
		 */
		EClass ALUMNO = eINSTANCE.getAlumno();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUMNO__NOMBRE = eINSTANCE.getAlumno_Nombre();

		/**
		 * The meta object literal for the '<em><b>Matriculadoen TU</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALUMNO__MATRICULADOEN_TU = eINSTANCE.getAlumno_MatriculadoenTU();

		/**
		 * The meta object literal for the '<em><b>Matriculadoen ASIG</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALUMNO__MATRICULADOEN_ASIG = eINSTANCE.getAlumno_MatriculadoenASIG();

		/**
		 * The meta object literal for the '<em><b>Gruposdetrabajo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALUMNO__GRUPOSDETRABAJO = eINSTANCE.getAlumno_Gruposdetrabajo();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.BloqueImpl <em>Bloque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.BloqueImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getBloque()
		 * @generated
		 */
		EClass BLOQUE = eINSTANCE.getBloque();

		/**
		 * The meta object literal for the '<em><b>Actividades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOQUE__ACTIVIDADES = eINSTANCE.getBloque_Actividades();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOQUE__NOMBRE = eINSTANCE.getBloque_Nombre();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.ActividadImpl <em>Actividad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.ActividadImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getActividad()
		 * @generated
		 */
		EClass ACTIVIDAD = eINSTANCE.getActividad();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD__ID = eINSTANCE.getActividad_ID();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD__DESCRIPCION = eINSTANCE.getActividad_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVIDAD__VISIBLE = eINSTANCE.getActividad_Visible();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.EncuestaImpl <em>Encuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.EncuestaImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getEncuesta()
		 * @generated
		 */
		EClass ENCUESTA = eINSTANCE.getEncuesta();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.ConsultaImpl <em>Consulta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.ConsultaImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getConsulta()
		 * @generated
		 */
		EClass CONSULTA = eINSTANCE.getConsulta();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.TareaImpl <em>Tarea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.TareaImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getTarea()
		 * @generated
		 */
		EClass TAREA = eINSTANCE.getTarea();

		/**
		 * The meta object literal for the '<em><b>Num Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__NUM_MAX = eINSTANCE.getTarea_NumMax();

		/**
		 * The meta object literal for the '<em><b>Fecha Limite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__FECHA_LIMITE = eINSTANCE.getTarea_FechaLimite();

		/**
		 * The meta object literal for the '<em><b>Calificacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__CALIFICACION = eINSTANCE.getTarea_Calificacion();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.ENLACEURLImpl <em>ENLACEURL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.ENLACEURLImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getENLACEURL()
		 * @generated
		 */
		EClass ENLACEURL = eINSTANCE.getENLACEURL();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENLACEURL__URL = eINSTANCE.getENLACEURL_Url();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.ForoImpl <em>Foro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.ForoImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getForo()
		 * @generated
		 */
		EClass FORO = eINSTANCE.getForo();

		/**
		 * The meta object literal for the '<em><b>Preguntas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORO__PREGUNTAS = eINSTANCE.getForo_Preguntas();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.RecursoImpl <em>Recurso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.RecursoImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getRecurso()
		 * @generated
		 */
		EClass RECURSO = eINSTANCE.getRecurso();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURSO__EXTENSION = eINSTANCE.getRecurso_Extension();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.GrupoTrabajoImpl <em>Grupo Trabajo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.GrupoTrabajoImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getGrupoTrabajo()
		 * @generated
		 */
		EClass GRUPO_TRABAJO = eINSTANCE.getGrupoTrabajo();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUPO_TRABAJO__ID = eINSTANCE.getGrupoTrabajo_ID();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUPO_TRABAJO__DESCRIPCION = eINSTANCE.getGrupoTrabajo_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Numgrupos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUPO_TRABAJO__NUMGRUPOS = eINSTANCE.getGrupoTrabajo_Numgrupos();

		/**
		 * The meta object literal for the '<em><b>Num Min Estu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUPO_TRABAJO__NUM_MIN_ESTU = eINSTANCE.getGrupoTrabajo_NumMinEstu();

		/**
		 * The meta object literal for the '<em><b>Num Max Estu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUPO_TRABAJO__NUM_MAX_ESTU = eINSTANCE.getGrupoTrabajo_NumMaxEstu();

		/**
		 * The meta object literal for the '<em><b>Alumnos GT</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRUPO_TRABAJO__ALUMNOS_GT = eINSTANCE.getGrupoTrabajo_AlumnosGT();

		/**
		 * The meta object literal for the '<em><b>Actividadobligatoria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRUPO_TRABAJO__ACTIVIDADOBLIGATORIA = eINSTANCE.getGrupoTrabajo_Actividadobligatoria();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.PreguntaImpl <em>Pregunta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.PreguntaImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getPregunta()
		 * @generated
		 */
		EClass PREGUNTA = eINSTANCE.getPregunta();

		/**
		 * The meta object literal for the '<em><b>Respuestas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA__RESPUESTAS = eINSTANCE.getPregunta_Respuestas();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREGUNTA__TEXTO = eINSTANCE.getPregunta_Texto();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.RespuestaImpl <em>Respuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.RespuestaImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getRespuesta()
		 * @generated
		 */
		EClass RESPUESTA = eINSTANCE.getRespuesta();

		/**
		 * The meta object literal for the '<em><b>Respuestaanidada</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPUESTA__RESPUESTAANIDADA = eINSTANCE.getRespuesta_Respuestaanidada();

		/**
		 * The meta object literal for the '<em><b>Texto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPUESTA__TEXTO = eINSTANCE.getRespuesta_Texto();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.impl.RootImpl
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Universidad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__UNIVERSIDAD = eINSTANCE.getRoot_Universidad();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.NOTA <em>NOTA</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.NOTA
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getNOTA()
		 * @generated
		 */
		EEnum NOTA = eINSTANCE.getNOTA();

		/**
		 * The meta object literal for the '{@link dmss_pa_01.TIPO <em>TIPO</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmss_pa_01.TIPO
		 * @see dmss_pa_01.impl.Dmss_pa_01PackageImpl#getTIPO()
		 * @generated
		 */
		EEnum TIPO = eINSTANCE.getTIPO();

	}

} //Dmss_pa_01Package
