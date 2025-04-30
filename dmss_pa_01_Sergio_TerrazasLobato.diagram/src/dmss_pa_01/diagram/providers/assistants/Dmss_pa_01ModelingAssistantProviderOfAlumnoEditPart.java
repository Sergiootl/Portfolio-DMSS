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
public class Dmss_pa_01ModelingAssistantProviderOfAlumnoEditPart
		extends dmss_pa_01.diagram.providers.Dmss_pa_01ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((dmss_pa_01.diagram.edit.parts.AlumnoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(dmss_pa_01.diagram.edit.parts.AlumnoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenTU_4011);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((dmss_pa_01.diagram.edit.parts.AlumnoEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(dmss_pa_01.diagram.edit.parts.AlumnoEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenTU_4011);
		}
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.AsignaturaEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012);
		}
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((dmss_pa_01.diagram.edit.parts.AlumnoEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(dmss_pa_01.diagram.edit.parts.AlumnoEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenTU_4011) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.TituloUniversitario_3001);
		} else if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Asignatura_3002);
		} else if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajo_3013);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((dmss_pa_01.diagram.edit.parts.AlumnoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(dmss_pa_01.diagram.edit.parts.AlumnoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((dmss_pa_01.diagram.edit.parts.AlumnoEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(dmss_pa_01.diagram.edit.parts.AlumnoEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajo_3013);
		}
		return types;
	}

}
