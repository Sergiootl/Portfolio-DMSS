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
public class Dmss_pa_01ModelingAssistantProviderOfAsignaturaEditPart
		extends dmss_pa_01.diagram.providers.Dmss_pa_01ModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((dmss_pa_01.diagram.edit.parts.AsignaturaEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(dmss_pa_01.diagram.edit.parts.AsignaturaEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((dmss_pa_01.diagram.edit.parts.AsignaturaEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(dmss_pa_01.diagram.edit.parts.AsignaturaEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.ProfesorEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006);
		}
		if (targetEditPart instanceof dmss_pa_01.diagram.edit.parts.ProfesorEditPart) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((dmss_pa_01.diagram.edit.parts.AsignaturaEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(dmss_pa_01.diagram.edit.parts.AsignaturaEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Profesor_3015);
		} else if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Profesor_3015);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((dmss_pa_01.diagram.edit.parts.AsignaturaEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(dmss_pa_01.diagram.edit.parts.AsignaturaEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((dmss_pa_01.diagram.edit.parts.AsignaturaEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(dmss_pa_01.diagram.edit.parts.AsignaturaEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Profesor_3015);
		} else if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Profesor_3015);
		} else if (relationshipType == dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012) {
			types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Alumno_3014);
		}
		return types;
	}

}
