/*
 * 
 */
package dmss_pa_01.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Dmss_pa_01ModelingAssistantProviderOfTareaEditPart
		extends dmss_pa_01.diagram.providers.Dmss_pa_01ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((dmss_pa_01.diagram.edit.parts.TareaEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(dmss_pa_01.diagram.edit.parts.TareaEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((dmss_pa_01.diagram.edit.parts.TareaEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(dmss_pa_01.diagram.edit.parts.TareaEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajo_3013);
		}
		return types;
	}

}
