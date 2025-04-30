/*
* 
*/
package dmss_pa_01.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Dmss_pa_01VisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "dmss_pa_01_Sergio_TerrazasLobato.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (dmss_pa_01.diagram.edit.parts.RootEditPart.MODEL_ID.equals(view.getType())) {
				return dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getRoot().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((dmss_pa_01.Root) domainElement)) {
			return dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getModelID(containerView);
		if (!dmss_pa_01.diagram.edit.parts.RootEditPart.MODEL_ID.equals(containerModelID)
				&& !"dmss_pa_01".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (dmss_pa_01.diagram.edit.parts.RootEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID:
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getUniversidad().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.UniversidadEditPart.VISUAL_ID;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadTitulosuniversitariosCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getTituloUniversitario().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadAlumnosCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getAlumno().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadProfesoresCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getProfesor().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.TituloUniversitarioTituloUniversitarioAsignaturasCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getAsignatura().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getBloque().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getGrupoTrabajo().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getEncuesta().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID;
			}
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getConsulta().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID;
			}
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getTarea().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID;
			}
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getENLACEURL().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID;
			}
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getForo().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID;
			}
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getRecurso().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.ForoForoPreguntasCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getPregunta().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.PreguntaEditPart.VISUAL_ID;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getRespuesta().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.RespuestaEditPart.VISUAL_ID;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getRespuesta().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartment2EditPart.VISUAL_ID:
			if (dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getRespuesta().isSuperTypeOf(domainElement.eClass())) {
				return dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getModelID(containerView);
		if (!dmss_pa_01.diagram.edit.parts.RootEditPart.MODEL_ID.equals(containerModelID)
				&& !"dmss_pa_01".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (dmss_pa_01.diagram.edit.parts.RootEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.UniversidadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.UniversidadEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.UniversidadNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.UniversidadUniversidadTitulosuniversitariosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.UniversidadUniversidadAlumnosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.UniversidadUniversidadProfesoresCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.TituloUniversitarioNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.TituloUniversitarioTituloUniversitarioAsignaturasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.AsignaturaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.BloqueNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.EncuestaDescripcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.ConsultaDescripcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.TareaDescripcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.ENLACEURLDescripcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.ForoDescripcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.ForoForoPreguntasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.PreguntaTextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.RespuestaEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.RespuestaTextoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.RespuestaTexto2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.RecursoExtensionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.GrupoTrabajoDescripcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.AlumnoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.ProfesorNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadTitulosuniversitariosCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadAlumnosCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadProfesoresCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.TituloUniversitarioTituloUniversitarioAsignaturasCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.ForoForoPreguntasCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.PreguntaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.RespuestaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartmentEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartment2EditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID:
			if (dmss_pa_01.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(dmss_pa_01.Root element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadTitulosuniversitariosCompartmentEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadAlumnosCompartmentEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadProfesoresCompartmentEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.TituloUniversitarioTituloUniversitarioAsignaturasCompartmentEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.ForoForoPreguntasCompartmentEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartmentEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return false;
		case dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID:
		case dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
