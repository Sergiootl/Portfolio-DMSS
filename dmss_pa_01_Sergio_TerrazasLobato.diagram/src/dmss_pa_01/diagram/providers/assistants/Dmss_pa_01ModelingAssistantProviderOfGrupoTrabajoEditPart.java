/*
 * 
 */
package dmss_pa_01.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Dmss_pa_01ModelingAssistantProviderOfGrupoTrabajoEditPart
		extends dmss_pa_01.diagram.providers.Dmss_pa_01ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.AlumnoEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016);
		}
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.EncuestaEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017);
		}
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.ConsultaEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017);
		}
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.TareaEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017);
		}
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017);
		}
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.ForoEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017);
		}
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.RecursoEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Alumno_3014);
		} else if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Encuesta_3004);
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Consulta_3005);
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Tarea_3006);
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ENLACEURL_3007);
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Foro_3008);
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Recurso_3012);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Alumno_3014);
		}
		return types;
	}

}
