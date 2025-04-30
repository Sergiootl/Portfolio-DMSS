/**
 */
package dmss_pa_01.util;

import dmss_pa_01.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dmss_pa_01.Dmss_pa_01Package
 * @generated
 */
public class Dmss_pa_01AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dmss_pa_01Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dmss_pa_01AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Dmss_pa_01Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dmss_pa_01Switch<Adapter> modelSwitch =
		new Dmss_pa_01Switch<Adapter>() {
			@Override
			public Adapter caseUniversidad(Universidad object) {
				return createUniversidadAdapter();
			}
			@Override
			public Adapter caseTituloUniversitario(TituloUniversitario object) {
				return createTituloUniversitarioAdapter();
			}
			@Override
			public Adapter caseAsignatura(Asignatura object) {
				return createAsignaturaAdapter();
			}
			@Override
			public Adapter caseProfesor(Profesor object) {
				return createProfesorAdapter();
			}
			@Override
			public Adapter caseAlumno(Alumno object) {
				return createAlumnoAdapter();
			}
			@Override
			public Adapter caseBloque(Bloque object) {
				return createBloqueAdapter();
			}
			@Override
			public Adapter caseActividad(Actividad object) {
				return createActividadAdapter();
			}
			@Override
			public Adapter caseEncuesta(Encuesta object) {
				return createEncuestaAdapter();
			}
			@Override
			public Adapter caseConsulta(Consulta object) {
				return createConsultaAdapter();
			}
			@Override
			public Adapter caseTarea(Tarea object) {
				return createTareaAdapter();
			}
			@Override
			public Adapter caseENLACEURL(ENLACEURL object) {
				return createENLACEURLAdapter();
			}
			@Override
			public Adapter caseForo(Foro object) {
				return createForoAdapter();
			}
			@Override
			public Adapter caseRecurso(Recurso object) {
				return createRecursoAdapter();
			}
			@Override
			public Adapter caseGrupoTrabajo(GrupoTrabajo object) {
				return createGrupoTrabajoAdapter();
			}
			@Override
			public Adapter casePregunta(Pregunta object) {
				return createPreguntaAdapter();
			}
			@Override
			public Adapter caseRespuesta(Respuesta object) {
				return createRespuestaAdapter();
			}
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Universidad <em>Universidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Universidad
	 * @generated
	 */
	public Adapter createUniversidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.TituloUniversitario <em>Titulo Universitario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.TituloUniversitario
	 * @generated
	 */
	public Adapter createTituloUniversitarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Asignatura <em>Asignatura</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Asignatura
	 * @generated
	 */
	public Adapter createAsignaturaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Profesor <em>Profesor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Profesor
	 * @generated
	 */
	public Adapter createProfesorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Alumno <em>Alumno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Alumno
	 * @generated
	 */
	public Adapter createAlumnoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Bloque <em>Bloque</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Bloque
	 * @generated
	 */
	public Adapter createBloqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Actividad <em>Actividad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Actividad
	 * @generated
	 */
	public Adapter createActividadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Encuesta <em>Encuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Encuesta
	 * @generated
	 */
	public Adapter createEncuestaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Consulta <em>Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Consulta
	 * @generated
	 */
	public Adapter createConsultaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Tarea
	 * @generated
	 */
	public Adapter createTareaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.ENLACEURL <em>ENLACEURL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.ENLACEURL
	 * @generated
	 */
	public Adapter createENLACEURLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Foro <em>Foro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Foro
	 * @generated
	 */
	public Adapter createForoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Recurso <em>Recurso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Recurso
	 * @generated
	 */
	public Adapter createRecursoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.GrupoTrabajo <em>Grupo Trabajo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.GrupoTrabajo
	 * @generated
	 */
	public Adapter createGrupoTrabajoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Pregunta <em>Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Pregunta
	 * @generated
	 */
	public Adapter createPreguntaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Respuesta <em>Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Respuesta
	 * @generated
	 */
	public Adapter createRespuestaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dmss_pa_01.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dmss_pa_01.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Dmss_pa_01AdapterFactory
