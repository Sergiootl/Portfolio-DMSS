/*
* 
*/
package dmss_pa_01.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class Dmss_pa_01NavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem
				&& !isOwnView(((dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup) {
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup group = (dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup) element;
			return dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem) {
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem navigatorItem = (dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(view)) {
		case dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.example.org/dmss_pa_01?Root", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Root_1000);
		case dmss_pa_01.diagram.edit.parts.UniversidadEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dmss_pa_01?Universidad", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Universidad_2001);
		case dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?TituloUniversitario", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.TituloUniversitario_3001);
		case dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?Asignatura", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Asignatura_3002);
		case dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?Bloque", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Bloque_3003);
		case dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?Encuesta", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Encuesta_3004);
		case dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?Consulta", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Consulta_3005);
		case dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?Tarea", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Tarea_3006);
		case dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?ENLACEURL", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ENLACEURL_3007);
		case dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?Foro", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Foro_3008);
		case dmss_pa_01.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?Pregunta", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Pregunta_3009);
		case dmss_pa_01.diagram.edit.parts.RespuestaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?Respuesta", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Respuesta_3010);
		case dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?Respuesta", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Respuesta_3011);
		case dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?Recurso", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Recurso_3012);
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?GrupoTrabajo", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajo_3013);
		case dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?Alumno", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Alumno_3014);
		case dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dmss_pa_01?Profesor", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Profesor_3015);
		case dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dmss_pa_01?Asignatura?profesores", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006);
		case dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dmss_pa_01?Asignatura?escoordinada", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008);
		case dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dmss_pa_01?Profesor?asignaturas", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009);
		case dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dmss_pa_01?Profesor?escoordinador", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010);
		case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dmss_pa_01?Alumno?matriculadoenTU", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenTU_4011);
		case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dmss_pa_01?Alumno?matriculadoenASIG", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012);
		case dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dmss_pa_01?Alumno?gruposdetrabajo", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013);
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dmss_pa_01?GrupoTrabajo?alumnosGT", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016);
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dmss_pa_01?GrupoTrabajo?actividadobligatoria", //$NON-NLS-1$
					dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.isKnownElementType(elementType)) {
			image = dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup) {
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup group = (dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem) {
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem navigatorItem = (dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(view)) {
		case dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID:
			return getRoot_1000Text(view);
		case dmss_pa_01.diagram.edit.parts.UniversidadEditPart.VISUAL_ID:
			return getUniversidad_2001Text(view);
		case dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID:
			return getTituloUniversitario_3001Text(view);
		case dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID:
			return getAsignatura_3002Text(view);
		case dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID:
			return getBloque_3003Text(view);
		case dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID:
			return getEncuesta_3004Text(view);
		case dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID:
			return getConsulta_3005Text(view);
		case dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID:
			return getTarea_3006Text(view);
		case dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID:
			return getENLACEURL_3007Text(view);
		case dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID:
			return getForo_3008Text(view);
		case dmss_pa_01.diagram.edit.parts.PreguntaEditPart.VISUAL_ID:
			return getPregunta_3009Text(view);
		case dmss_pa_01.diagram.edit.parts.RespuestaEditPart.VISUAL_ID:
			return getRespuesta_3010Text(view);
		case dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID:
			return getRespuesta_3011Text(view);
		case dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID:
			return getRecurso_3012Text(view);
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID:
			return getGrupoTrabajo_3013Text(view);
		case dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID:
			return getAlumno_3014Text(view);
		case dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID:
			return getProfesor_3015Text(view);
		case dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart.VISUAL_ID:
			return getAsignaturaProfesores_4006Text(view);
		case dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart.VISUAL_ID:
			return getAsignaturaEscoordinada_4008Text(view);
		case dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart.VISUAL_ID:
			return getProfesorAsignaturas_4009Text(view);
		case dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart.VISUAL_ID:
			return getProfesorEscoordinador_4010Text(view);
		case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart.VISUAL_ID:
			return getAlumnoMatriculadoenTU_4011Text(view);
		case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID:
			return getAlumnoMatriculadoenASIG_4012Text(view);
		case dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID:
			return getAlumnoGruposdetrabajo_4013Text(view);
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID:
			return getGrupoTrabajoAlumnosGT_4016Text(view);
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID:
			return getGrupoTrabajoActividadobligatoria_4017Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getRoot_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUniversidad_2001Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Universidad_2001,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.UniversidadNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTituloUniversitario_3001Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.TituloUniversitario_3001,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.TituloUniversitarioNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAsignatura_3002Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Asignatura_3002,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.AsignaturaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBloque_3003Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Bloque_3003,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.BloqueNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEncuesta_3004Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Encuesta_3004,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.EncuestaDescripcionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConsulta_3005Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Consulta_3005,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.ConsultaDescripcionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTarea_3006Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Tarea_3006,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.TareaDescripcionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getENLACEURL_3007Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ENLACEURL_3007,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.ENLACEURLDescripcionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getForo_3008Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Foro_3008,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.ForoDescripcionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPregunta_3009Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Pregunta_3009,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.PreguntaTextoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRespuesta_3010Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Respuesta_3010,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.RespuestaTextoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRespuesta_3011Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Respuesta_3011,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.RespuestaTexto2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRecurso_3012Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Recurso_3012,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.RecursoExtensionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGrupoTrabajo_3013Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajo_3013,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoDescripcionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAlumno_3014Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Alumno_3014,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.AlumnoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProfesor_3015Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Profesor_3015,
				view.getElement() != null ? view.getElement() : view, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
						.getType(dmss_pa_01.diagram.edit.parts.ProfesorNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAsignaturaProfesores_4006Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAsignaturaEscoordinada_4008Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProfesorAsignaturas_4009Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProfesorEscoordinador_4010Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAlumnoMatriculadoenTU_4011Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenTU_4011,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAlumnoMatriculadoenASIG_4012Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAlumnoGruposdetrabajo_4013Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGrupoTrabajoAlumnosGT_4016Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGrupoTrabajoActividadobligatoria_4017Text(View view) {
		IParser parser = dmss_pa_01.diagram.providers.Dmss_pa_01ParserProvider.getParser(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return dmss_pa_01.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getModelID(view));
	}

}
