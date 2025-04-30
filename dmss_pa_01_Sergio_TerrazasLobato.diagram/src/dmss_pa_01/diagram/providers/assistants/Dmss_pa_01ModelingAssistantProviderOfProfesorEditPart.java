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
public class Dmss_pa_01ModelingAssistantProviderOfProfesorEditPart
		extends dmss_pa_01.diagram.providers.Dmss_pa_01ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((dmss_pa_01.diagram.edit.parts.ProfesorEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(dmss_pa_01.diagram.edit.parts.ProfesorEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((dmss_pa_01.diagram.edit.parts.ProfesorEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(dmss_pa_01.diagram.edit.parts.ProfesorEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.AsignaturaEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009);
		}
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.AsignaturaEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((dmss_pa_01.diagram.edit.parts.ProfesorEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(dmss_pa_01.diagram.edit.parts.ProfesorEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Asignatura_3002);
		} else if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Asignatura_3002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((dmss_pa_01.diagram.edit.parts.ProfesorEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(dmss_pa_01.diagram.edit.parts.ProfesorEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((dmss_pa_01.diagram.edit.parts.ProfesorEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(dmss_pa_01.diagram.edit.parts.ProfesorEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Asignatura_3002);
		} else if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Asignatura_3002);
		}
		return types;
	}

}
