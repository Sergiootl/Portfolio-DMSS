/*
* 
*/
package dmss_pa_01.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Dmss_pa_01DiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getSemanticChildren(View view) {
		switch (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(view)) {
		case dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return getRoot_1000SemanticChildren(view);
		case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadTitulosuniversitariosCompartmentEditPart.VISUAL_ID:
			return getUniversidadUniversidadTitulosuniversitariosCompartment_7001SemanticChildren(view);
		case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadAlumnosCompartmentEditPart.VISUAL_ID:
			return getUniversidadUniversidadAlumnosCompartment_7002SemanticChildren(view);
		case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadProfesoresCompartmentEditPart.VISUAL_ID:
			return getUniversidadUniversidadProfesoresCompartment_7003SemanticChildren(view);
		case dmss_pa_01.diagram.edit.parts.TituloUniversitarioTituloUniversitarioAsignaturasCompartmentEditPart.VISUAL_ID:
			return getTituloUniversitarioTituloUniversitarioAsignaturasCompartment_7004SemanticChildren(view);
		case dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart.VISUAL_ID:
			return getAsignaturaAsignaturaBloquesCompartment_7005SemanticChildren(view);
		case dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart.VISUAL_ID:
			return getAsignaturaAsignaturaGrupostrabajoCompartment_7006SemanticChildren(view);
		case dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart.VISUAL_ID:
			return getBloqueBloqueActividadesCompartment_7007SemanticChildren(view);
		case dmss_pa_01.diagram.edit.parts.ForoForoPreguntasCompartmentEditPart.VISUAL_ID:
			return getForoForoPreguntasCompartment_7008SemanticChildren(view);
		case dmss_pa_01.diagram.edit.parts.PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID:
			return getPreguntaPreguntaRespuestasCompartment_7009SemanticChildren(view);
		case dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartmentEditPart.VISUAL_ID:
			return getRespuestaRespuestaRespuestaanidadaCompartment_7010SemanticChildren(view);
		case dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartment2EditPart.VISUAL_ID:
			return getRespuestaRespuestaRespuestaanidadaCompartment_7011SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getRoot_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		dmss_pa_01.Root modelElement = (dmss_pa_01.Root) view.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor>();
		for (Iterator<?> it = modelElement.getUniversidad().iterator(); it.hasNext();) {
			dmss_pa_01.Universidad childElement = (dmss_pa_01.Universidad) it.next();
			int visualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dmss_pa_01.diagram.edit.parts.UniversidadEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getUniversidadUniversidadTitulosuniversitariosCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dmss_pa_01.Universidad modelElement = (dmss_pa_01.Universidad) containerView.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor>();
		for (Iterator<?> it = modelElement.getTitulosuniversitarios().iterator(); it.hasNext();) {
			dmss_pa_01.TituloUniversitario childElement = (dmss_pa_01.TituloUniversitario) it.next();
			int visualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getUniversidadUniversidadAlumnosCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dmss_pa_01.Universidad modelElement = (dmss_pa_01.Universidad) containerView.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor>();
		for (Iterator<?> it = modelElement.getAlumnos().iterator(); it.hasNext();) {
			dmss_pa_01.Alumno childElement = (dmss_pa_01.Alumno) it.next();
			int visualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getUniversidadUniversidadProfesoresCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dmss_pa_01.Universidad modelElement = (dmss_pa_01.Universidad) containerView.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor>();
		for (Iterator<?> it = modelElement.getProfesores().iterator(); it.hasNext();) {
			dmss_pa_01.Profesor childElement = (dmss_pa_01.Profesor) it.next();
			int visualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getTituloUniversitarioTituloUniversitarioAsignaturasCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dmss_pa_01.TituloUniversitario modelElement = (dmss_pa_01.TituloUniversitario) containerView.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor>();
		for (Iterator<?> it = modelElement.getAsignaturas().iterator(); it.hasNext();) {
			dmss_pa_01.Asignatura childElement = (dmss_pa_01.Asignatura) it.next();
			int visualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getAsignaturaAsignaturaBloquesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dmss_pa_01.Asignatura modelElement = (dmss_pa_01.Asignatura) containerView.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor>();
		for (Iterator<?> it = modelElement.getBloques().iterator(); it.hasNext();) {
			dmss_pa_01.Bloque childElement = (dmss_pa_01.Bloque) it.next();
			int visualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getAsignaturaAsignaturaGrupostrabajoCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dmss_pa_01.Asignatura modelElement = (dmss_pa_01.Asignatura) containerView.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor>();
		for (Iterator<?> it = modelElement.getGrupostrabajo().iterator(); it.hasNext();) {
			dmss_pa_01.GrupoTrabajo childElement = (dmss_pa_01.GrupoTrabajo) it.next();
			int visualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getBloqueBloqueActividadesCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dmss_pa_01.Bloque modelElement = (dmss_pa_01.Bloque) containerView.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor>();
		for (Iterator<?> it = modelElement.getActividades().iterator(); it.hasNext();) {
			dmss_pa_01.Actividad childElement = (dmss_pa_01.Actividad) it.next();
			int visualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getForoForoPreguntasCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dmss_pa_01.Foro modelElement = (dmss_pa_01.Foro) containerView.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor>();
		for (Iterator<?> it = modelElement.getPreguntas().iterator(); it.hasNext();) {
			dmss_pa_01.Pregunta childElement = (dmss_pa_01.Pregunta) it.next();
			int visualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dmss_pa_01.diagram.edit.parts.PreguntaEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getPreguntaPreguntaRespuestasCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dmss_pa_01.Pregunta modelElement = (dmss_pa_01.Pregunta) containerView.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor>();
		for (Iterator<?> it = modelElement.getRespuestas().iterator(); it.hasNext();) {
			dmss_pa_01.Respuesta childElement = (dmss_pa_01.Respuesta) it.next();
			int visualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dmss_pa_01.diagram.edit.parts.RespuestaEditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getRespuestaRespuestaRespuestaanidadaCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dmss_pa_01.Respuesta modelElement = (dmss_pa_01.Respuesta) containerView.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor>();
		for (Iterator<?> it = modelElement.getRespuestaanidada().iterator(); it.hasNext();) {
			dmss_pa_01.Respuesta childElement = (dmss_pa_01.Respuesta) it.next();
			int visualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getRespuestaRespuestaRespuestaanidadaCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dmss_pa_01.Respuesta modelElement = (dmss_pa_01.Respuesta) containerView.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor>();
		for (Iterator<?> it = modelElement.getRespuestaanidada().iterator(); it.hasNext();) {
			dmss_pa_01.Respuesta childElement = (dmss_pa_01.Respuesta) it.next();
			int visualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getContainedLinks(View view) {
		switch (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(view)) {
		case dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return getRoot_1000ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.UniversidadEditPart.VISUAL_ID:
			return getUniversidad_2001ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID:
			return getTituloUniversitario_3001ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID:
			return getAsignatura_3002ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID:
			return getBloque_3003ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID:
			return getEncuesta_3004ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID:
			return getConsulta_3005ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID:
			return getTarea_3006ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID:
			return getENLACEURL_3007ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID:
			return getForo_3008ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
			return getPregunta_3009ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.RespuestaEditPart.VISUAL_ID:
			return getRespuesta_3010ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID:
			return getRespuesta_3011ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID:
			return getRecurso_3012ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID:
			return getGrupoTrabajo_3013ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID:
			return getAlumno_3014ContainedLinks(view);
		case dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID:
			return getProfesor_3015ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getIncomingLinks(View view) {
		switch (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(view)) {
		case dmss_pa_01.diagram.edit.parts.UniversidadEditPart.VISUAL_ID:
			return getUniversidad_2001IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID:
			return getTituloUniversitario_3001IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID:
			return getAsignatura_3002IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID:
			return getBloque_3003IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID:
			return getEncuesta_3004IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID:
			return getConsulta_3005IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID:
			return getTarea_3006IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID:
			return getENLACEURL_3007IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID:
			return getForo_3008IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
			return getPregunta_3009IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.RespuestaEditPart.VISUAL_ID:
			return getRespuesta_3010IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID:
			return getRespuesta_3011IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID:
			return getRecurso_3012IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID:
			return getGrupoTrabajo_3013IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID:
			return getAlumno_3014IncomingLinks(view);
		case dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID:
			return getProfesor_3015IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getOutgoingLinks(View view) {
		switch (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(view)) {
		case dmss_pa_01.diagram.edit.parts.UniversidadEditPart.VISUAL_ID:
			return getUniversidad_2001OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID:
			return getTituloUniversitario_3001OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID:
			return getAsignatura_3002OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID:
			return getBloque_3003OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID:
			return getEncuesta_3004OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID:
			return getConsulta_3005OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID:
			return getTarea_3006OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID:
			return getENLACEURL_3007OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID:
			return getForo_3008OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
			return getPregunta_3009OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.RespuestaEditPart.VISUAL_ID:
			return getRespuesta_3010OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID:
			return getRespuesta_3011OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID:
			return getRecurso_3012OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID:
			return getGrupoTrabajo_3013OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID:
			return getAlumno_3014OutgoingLinks(view);
		case dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID:
			return getProfesor_3015OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getRoot_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getUniversidad_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getTituloUniversitario_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getAsignatura_3002ContainedLinks(View view) {
		dmss_pa_01.Asignatura modelElement = (dmss_pa_01.Asignatura) view.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Asignatura_Profesores_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Asignatura_Escoordinada_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getBloque_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getEncuesta_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getConsulta_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getTarea_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getENLACEURL_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getForo_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getPregunta_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getRespuesta_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getRespuesta_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getRecurso_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getGrupoTrabajo_3013ContainedLinks(View view) {
		dmss_pa_01.GrupoTrabajo modelElement = (dmss_pa_01.GrupoTrabajo) view.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_GrupoTrabajo_AlumnosGT_4016(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_GrupoTrabajo_Actividadobligatoria_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getAlumno_3014ContainedLinks(View view) {
		dmss_pa_01.Alumno modelElement = (dmss_pa_01.Alumno) view.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Alumno_MatriculadoenTU_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Alumno_MatriculadoenASIG_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Alumno_Gruposdetrabajo_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getProfesor_3015ContainedLinks(View view) {
		dmss_pa_01.Profesor modelElement = (dmss_pa_01.Profesor) view.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Profesor_Asignaturas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Profesor_Escoordinador_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getUniversidad_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getTituloUniversitario_3001IncomingLinks(
			View view) {
		dmss_pa_01.TituloUniversitario modelElement = (dmss_pa_01.TituloUniversitario) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Alumno_MatriculadoenTU_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getAsignatura_3002IncomingLinks(View view) {
		dmss_pa_01.Asignatura modelElement = (dmss_pa_01.Asignatura) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Profesor_Asignaturas_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Profesor_Escoordinador_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Alumno_MatriculadoenASIG_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getBloque_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getEncuesta_3004IncomingLinks(View view) {
		dmss_pa_01.Encuesta modelElement = (dmss_pa_01.Encuesta) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_GrupoTrabajo_Actividadobligatoria_4017(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getConsulta_3005IncomingLinks(View view) {
		dmss_pa_01.Consulta modelElement = (dmss_pa_01.Consulta) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_GrupoTrabajo_Actividadobligatoria_4017(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getTarea_3006IncomingLinks(View view) {
		dmss_pa_01.Tarea modelElement = (dmss_pa_01.Tarea) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_GrupoTrabajo_Actividadobligatoria_4017(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getENLACEURL_3007IncomingLinks(View view) {
		dmss_pa_01.ENLACEURL modelElement = (dmss_pa_01.ENLACEURL) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_GrupoTrabajo_Actividadobligatoria_4017(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getForo_3008IncomingLinks(View view) {
		dmss_pa_01.Foro modelElement = (dmss_pa_01.Foro) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_GrupoTrabajo_Actividadobligatoria_4017(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getPregunta_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getRespuesta_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getRespuesta_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getRecurso_3012IncomingLinks(View view) {
		dmss_pa_01.Recurso modelElement = (dmss_pa_01.Recurso) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_GrupoTrabajo_Actividadobligatoria_4017(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getGrupoTrabajo_3013IncomingLinks(View view) {
		dmss_pa_01.GrupoTrabajo modelElement = (dmss_pa_01.GrupoTrabajo) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Alumno_Gruposdetrabajo_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getAlumno_3014IncomingLinks(View view) {
		dmss_pa_01.Alumno modelElement = (dmss_pa_01.Alumno) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_GrupoTrabajo_AlumnosGT_4016(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getProfesor_3015IncomingLinks(View view) {
		dmss_pa_01.Profesor modelElement = (dmss_pa_01.Profesor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Asignatura_Profesores_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Asignatura_Escoordinada_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getUniversidad_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getTituloUniversitario_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getAsignatura_3002OutgoingLinks(View view) {
		dmss_pa_01.Asignatura modelElement = (dmss_pa_01.Asignatura) view.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Asignatura_Profesores_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Asignatura_Escoordinada_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getBloque_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getEncuesta_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getConsulta_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getTarea_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getENLACEURL_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getForo_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getPregunta_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getRespuesta_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getRespuesta_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getRecurso_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getGrupoTrabajo_3013OutgoingLinks(View view) {
		dmss_pa_01.GrupoTrabajo modelElement = (dmss_pa_01.GrupoTrabajo) view.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_GrupoTrabajo_AlumnosGT_4016(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_GrupoTrabajo_Actividadobligatoria_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getAlumno_3014OutgoingLinks(View view) {
		dmss_pa_01.Alumno modelElement = (dmss_pa_01.Alumno) view.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Alumno_MatriculadoenTU_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Alumno_MatriculadoenASIG_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Alumno_Gruposdetrabajo_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getProfesor_3015OutgoingLinks(View view) {
		dmss_pa_01.Profesor modelElement = (dmss_pa_01.Profesor) view.getElement();
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Profesor_Asignaturas_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Profesor_Escoordinador_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getIncomingFeatureModelFacetLinks_Asignatura_Profesores_4006(
			dmss_pa_01.Profesor target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getAsignatura_Profesores()) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(setting.getEObject(), target,
						dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006,
						dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getIncomingFeatureModelFacetLinks_Asignatura_Escoordinada_4008(
			dmss_pa_01.Profesor target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dmss_pa_01.Dmss_pa_01Package.eINSTANCE
					.getAsignatura_Escoordinada()) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(setting.getEObject(), target,
						dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008,
						dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getIncomingFeatureModelFacetLinks_Profesor_Asignaturas_4009(
			dmss_pa_01.Asignatura target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getProfesor_Asignaturas()) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(setting.getEObject(), target,
						dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009,
						dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getIncomingFeatureModelFacetLinks_Profesor_Escoordinador_4010(
			dmss_pa_01.Asignatura target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getProfesor_Escoordinador()) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(setting.getEObject(), target,
						dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010,
						dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getIncomingFeatureModelFacetLinks_Alumno_MatriculadoenTU_4011(
			dmss_pa_01.TituloUniversitario target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getAlumno_MatriculadoenTU()) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(setting.getEObject(), target,
						dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenTU_4011,
						dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getIncomingFeatureModelFacetLinks_Alumno_MatriculadoenASIG_4012(
			dmss_pa_01.Asignatura target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dmss_pa_01.Dmss_pa_01Package.eINSTANCE
					.getAlumno_MatriculadoenASIG()) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(setting.getEObject(), target,
						dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012,
						dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getIncomingFeatureModelFacetLinks_Alumno_Gruposdetrabajo_4013(
			dmss_pa_01.GrupoTrabajo target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getAlumno_Gruposdetrabajo()) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(setting.getEObject(), target,
						dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013,
						dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getIncomingFeatureModelFacetLinks_GrupoTrabajo_AlumnosGT_4016(
			dmss_pa_01.Alumno target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getGrupoTrabajo_AlumnosGT()) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(setting.getEObject(), target,
						dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016,
						dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getIncomingFeatureModelFacetLinks_GrupoTrabajo_Actividadobligatoria_4017(
			dmss_pa_01.Actividad target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dmss_pa_01.Dmss_pa_01Package.eINSTANCE
					.getGrupoTrabajo_Actividadobligatoria()) {
				result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(setting.getEObject(), target,
						dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017,
						dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getOutgoingFeatureModelFacetLinks_Asignatura_Profesores_4006(
			dmss_pa_01.Asignatura source) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		for (Iterator<?> destinations = source.getProfesores().iterator(); destinations.hasNext();) {
			dmss_pa_01.Profesor destination = (dmss_pa_01.Profesor) destinations.next();
			result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(source, destination,
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006,
					dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getOutgoingFeatureModelFacetLinks_Asignatura_Escoordinada_4008(
			dmss_pa_01.Asignatura source) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		dmss_pa_01.Profesor destination = source.getEscoordinada();
		if (destination == null) {
			return result;
		}
		result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(source, destination,
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008,
				dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getOutgoingFeatureModelFacetLinks_Profesor_Asignaturas_4009(
			dmss_pa_01.Profesor source) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		for (Iterator<?> destinations = source.getAsignaturas().iterator(); destinations.hasNext();) {
			dmss_pa_01.Asignatura destination = (dmss_pa_01.Asignatura) destinations.next();
			result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(source, destination,
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009,
					dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getOutgoingFeatureModelFacetLinks_Profesor_Escoordinador_4010(
			dmss_pa_01.Profesor source) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		dmss_pa_01.Asignatura destination = source.getEscoordinador();
		if (destination == null) {
			return result;
		}
		result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(source, destination,
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010,
				dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getOutgoingFeatureModelFacetLinks_Alumno_MatriculadoenTU_4011(
			dmss_pa_01.Alumno source) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		for (Iterator<?> destinations = source.getMatriculadoenTU().iterator(); destinations.hasNext();) {
			dmss_pa_01.TituloUniversitario destination = (dmss_pa_01.TituloUniversitario) destinations.next();
			result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(source, destination,
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenTU_4011,
					dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getOutgoingFeatureModelFacetLinks_Alumno_MatriculadoenASIG_4012(
			dmss_pa_01.Alumno source) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		for (Iterator<?> destinations = source.getMatriculadoenASIG().iterator(); destinations.hasNext();) {
			dmss_pa_01.Asignatura destination = (dmss_pa_01.Asignatura) destinations.next();
			result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(source, destination,
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012,
					dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getOutgoingFeatureModelFacetLinks_Alumno_Gruposdetrabajo_4013(
			dmss_pa_01.Alumno source) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		for (Iterator<?> destinations = source.getGruposdetrabajo().iterator(); destinations.hasNext();) {
			dmss_pa_01.GrupoTrabajo destination = (dmss_pa_01.GrupoTrabajo) destinations.next();
			result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(source, destination,
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013,
					dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getOutgoingFeatureModelFacetLinks_GrupoTrabajo_AlumnosGT_4016(
			dmss_pa_01.GrupoTrabajo source) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		for (Iterator<?> destinations = source.getAlumnosGT().iterator(); destinations.hasNext();) {
			dmss_pa_01.Alumno destination = (dmss_pa_01.Alumno) destinations.next();
			result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(source, destination,
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016,
					dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getOutgoingFeatureModelFacetLinks_GrupoTrabajo_Actividadobligatoria_4017(
			dmss_pa_01.GrupoTrabajo source) {
		LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> result = new LinkedList<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor>();
		for (Iterator<?> destinations = source.getActividadobligatoria().iterator(); destinations.hasNext();) {
			dmss_pa_01.Actividad destination = (dmss_pa_01.Actividad) destinations.next();
			result.add(new dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor(source, destination,
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017,
					dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<dmss_pa_01.diagram.part.Dmss_pa_01NodeDescriptor> getSemanticChildren(View view) {
			return Dmss_pa_01DiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getContainedLinks(View view) {
			return Dmss_pa_01DiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getIncomingLinks(View view) {
			return Dmss_pa_01DiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<dmss_pa_01.diagram.part.Dmss_pa_01LinkDescriptor> getOutgoingLinks(View view) {
			return Dmss_pa_01DiagramUpdater.getOutgoingLinks(view);
		}
	};

}
