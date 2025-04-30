/**
 */
package dmss_pa_01.util;

import dmss_pa_01.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dmss_pa_01.Dmss_pa_01Package
 * @generated
 */
public class Dmss_pa_01Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dmss_pa_01Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dmss_pa_01Switch() {
		if (modelPackage == null) {
			modelPackage = Dmss_pa_01Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Dmss_pa_01Package.UNIVERSIDAD: {
				Universidad universidad = (Universidad)theEObject;
				T result = caseUniversidad(universidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.TITULO_UNIVERSITARIO: {
				TituloUniversitario tituloUniversitario = (TituloUniversitario)theEObject;
				T result = caseTituloUniversitario(tituloUniversitario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.ASIGNATURA: {
				Asignatura asignatura = (Asignatura)theEObject;
				T result = caseAsignatura(asignatura);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.PROFESOR: {
				Profesor profesor = (Profesor)theEObject;
				T result = caseProfesor(profesor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.ALUMNO: {
				Alumno alumno = (Alumno)theEObject;
				T result = caseAlumno(alumno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.BLOQUE: {
				Bloque bloque = (Bloque)theEObject;
				T result = caseBloque(bloque);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.ACTIVIDAD: {
				Actividad actividad = (Actividad)theEObject;
				T result = caseActividad(actividad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.ENCUESTA: {
				Encuesta encuesta = (Encuesta)theEObject;
				T result = caseEncuesta(encuesta);
				if (result == null) result = caseActividad(encuesta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.CONSULTA: {
				Consulta consulta = (Consulta)theEObject;
				T result = caseConsulta(consulta);
				if (result == null) result = caseActividad(consulta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.TAREA: {
				Tarea tarea = (Tarea)theEObject;
				T result = caseTarea(tarea);
				if (result == null) result = caseActividad(tarea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.ENLACEURL: {
				ENLACEURL enlaceurl = (ENLACEURL)theEObject;
				T result = caseENLACEURL(enlaceurl);
				if (result == null) result = caseActividad(enlaceurl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.FORO: {
				Foro foro = (Foro)theEObject;
				T result = caseForo(foro);
				if (result == null) result = caseActividad(foro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.RECURSO: {
				Recurso recurso = (Recurso)theEObject;
				T result = caseRecurso(recurso);
				if (result == null) result = caseActividad(recurso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.GRUPO_TRABAJO: {
				GrupoTrabajo grupoTrabajo = (GrupoTrabajo)theEObject;
				T result = caseGrupoTrabajo(grupoTrabajo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.PREGUNTA: {
				Pregunta pregunta = (Pregunta)theEObject;
				T result = casePregunta(pregunta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.RESPUESTA: {
				Respuesta respuesta = (Respuesta)theEObject;
				T result = caseRespuesta(respuesta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dmss_pa_01Package.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversidad(Universidad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titulo Universitario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titulo Universitario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTituloUniversitario(TituloUniversitario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asignatura</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asignatura</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsignatura(Asignatura object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profesor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profesor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfesor(Profesor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alumno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alumno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlumno(Alumno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloque</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloque</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloque(Bloque object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actividad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actividad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActividad(Actividad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encuesta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encuesta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncuesta(Encuesta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consulta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consulta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsulta(Consulta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarea(Tarea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENLACEURL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENLACEURL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENLACEURL(ENLACEURL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForo(Foro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recurso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recurso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecurso(Recurso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grupo Trabajo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grupo Trabajo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrupoTrabajo(GrupoTrabajo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pregunta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pregunta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePregunta(Pregunta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Respuesta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespuesta(Respuesta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Dmss_pa_01Switch
