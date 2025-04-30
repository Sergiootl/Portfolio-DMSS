/*
 * 
 */
package dmss_pa_01.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Dmss_pa_01EditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(view)) {

			case dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.RootEditPart(view);

			case dmss_pa_01.diagram.edit.parts.UniversidadEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.UniversidadEditPart(view);

			case dmss_pa_01.diagram.edit.parts.UniversidadNombreEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.UniversidadNombreEditPart(view);

			case dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart(view);

			case dmss_pa_01.diagram.edit.parts.TituloUniversitarioNombreEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.TituloUniversitarioNombreEditPart(view);

			case dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.AsignaturaEditPart(view);

			case dmss_pa_01.diagram.edit.parts.AsignaturaNombreEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.AsignaturaNombreEditPart(view);

			case dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.BloqueEditPart(view);

			case dmss_pa_01.diagram.edit.parts.BloqueNombreEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.BloqueNombreEditPart(view);

			case dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.EncuestaEditPart(view);

			case dmss_pa_01.diagram.edit.parts.EncuestaDescripcionEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.EncuestaDescripcionEditPart(view);

			case dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.ConsultaEditPart(view);

			case dmss_pa_01.diagram.edit.parts.ConsultaDescripcionEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.ConsultaDescripcionEditPart(view);

			case dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.TareaEditPart(view);

			case dmss_pa_01.diagram.edit.parts.TareaDescripcionEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.TareaDescripcionEditPart(view);

			case dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart(view);

			case dmss_pa_01.diagram.edit.parts.ENLACEURLDescripcionEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.ENLACEURLDescripcionEditPart(view);

			case dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.ForoEditPart(view);

			case dmss_pa_01.diagram.edit.parts.ForoDescripcionEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.ForoDescripcionEditPart(view);

			case dmss_pa_01.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.PreguntaEditPart(view);

			case dmss_pa_01.diagram.edit.parts.PreguntaTextoEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.PreguntaTextoEditPart(view);

			case dmss_pa_01.diagram.edit.parts.RespuestaEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.RespuestaEditPart(view);

			case dmss_pa_01.diagram.edit.parts.RespuestaTextoEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.RespuestaTextoEditPart(view);

			case dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.Respuesta2EditPart(view);

			case dmss_pa_01.diagram.edit.parts.RespuestaTexto2EditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.RespuestaTexto2EditPart(view);

			case dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.RecursoEditPart(view);

			case dmss_pa_01.diagram.edit.parts.RecursoExtensionEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.RecursoExtensionEditPart(view);

			case dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart(view);

			case dmss_pa_01.diagram.edit.parts.GrupoTrabajoDescripcionEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.GrupoTrabajoDescripcionEditPart(view);

			case dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.AlumnoEditPart(view);

			case dmss_pa_01.diagram.edit.parts.AlumnoNombreEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.AlumnoNombreEditPart(view);

			case dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.ProfesorEditPart(view);

			case dmss_pa_01.diagram.edit.parts.ProfesorNombreEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.ProfesorNombreEditPart(view);

			case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadTitulosuniversitariosCompartmentEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.UniversidadUniversidadTitulosuniversitariosCompartmentEditPart(
						view);

			case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadAlumnosCompartmentEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.UniversidadUniversidadAlumnosCompartmentEditPart(view);

			case dmss_pa_01.diagram.edit.parts.UniversidadUniversidadProfesoresCompartmentEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.UniversidadUniversidadProfesoresCompartmentEditPart(view);

			case dmss_pa_01.diagram.edit.parts.TituloUniversitarioTituloUniversitarioAsignaturasCompartmentEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.TituloUniversitarioTituloUniversitarioAsignaturasCompartmentEditPart(
						view);

			case dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart(view);

			case dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart(view);

			case dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart(view);

			case dmss_pa_01.diagram.edit.parts.ForoForoPreguntasCompartmentEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.ForoForoPreguntasCompartmentEditPart(view);

			case dmss_pa_01.diagram.edit.parts.PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.PreguntaPreguntaRespuestasCompartmentEditPart(view);

			case dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartmentEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartmentEditPart(view);

			case dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartment2EditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartment2EditPart(view);

			case dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart(view);

			case dmss_pa_01.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.WrappingLabelEditPart(view);

			case dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart(view);

			case dmss_pa_01.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.WrappingLabel2EditPart(view);

			case dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart(view);

			case dmss_pa_01.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.WrappingLabel3EditPart(view);

			case dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart(view);

			case dmss_pa_01.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.WrappingLabel4EditPart(view);

			case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart(view);

			case dmss_pa_01.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.WrappingLabel5EditPart(view);

			case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart(view);

			case dmss_pa_01.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.WrappingLabel6EditPart(view);

			case dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart(view);

			case dmss_pa_01.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.WrappingLabel7EditPart(view);

			case dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart(view);

			case dmss_pa_01.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.WrappingLabel8EditPart(view);

			case dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart(view);

			case dmss_pa_01.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new dmss_pa_01.diagram.edit.parts.WrappingLabel9EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
