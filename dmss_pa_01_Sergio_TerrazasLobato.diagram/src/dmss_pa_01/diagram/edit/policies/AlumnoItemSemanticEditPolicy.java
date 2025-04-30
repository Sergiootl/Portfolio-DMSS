/*
* 
*/
package dmss_pa_01.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AlumnoItemSemanticEditPolicy
		extends dmss_pa_01.diagram.edit.policies.Dmss_pa_01BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AlumnoItemSemanticEditPolicy() {
		super(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Alumno_3014);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(
					incomingLink) == dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(
					outgoingLink) == dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(
					outgoingLink) == dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(
					outgoingLink) == dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenTU_4011 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.AlumnoMatriculadoenTUCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.AlumnoMatriculadoenASIGCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.AlumnoGruposdetrabajoCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenTU_4011 == req.getElementType()) {
			return null;
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012 == req.getElementType()) {
			return null;
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013 == req.getElementType()) {
			return null;
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.GrupoTrabajoAlumnosGTCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart.VISUAL_ID:
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.AlumnoMatriculadoenTUReorientCommand(req));
		case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID:
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.AlumnoMatriculadoenASIGReorientCommand(req));
		case dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID:
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.AlumnoGruposdetrabajoReorientCommand(req));
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID:
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.GrupoTrabajoAlumnosGTReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
