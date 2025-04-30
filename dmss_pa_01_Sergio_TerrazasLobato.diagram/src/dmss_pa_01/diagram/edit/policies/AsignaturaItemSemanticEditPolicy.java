/*
* 
*/
package dmss_pa_01.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AsignaturaItemSemanticEditPolicy
		extends dmss_pa_01.diagram.edit.policies.Dmss_pa_01BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AsignaturaItemSemanticEditPolicy() {
		super(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Asignatura_3002);
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
			if (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getVisualID(incomingLink) == dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(
					incomingLink) == dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(
					incomingLink) == dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID) {
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
					outgoingLink) == dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(
					outgoingLink) == dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart.VISUAL_ID) {
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
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(node)) {
			case dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(cnode)) {
					case dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(cnode)) {
					case dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(
									incomingLink) == dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(), null,
										incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(
									outgoingLink) == dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(), null,
										outgoingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
								continue;
							}
							if (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(
									outgoingLink) == dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(), null,
										outgoingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.AsignaturaProfesoresCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.AsignaturaEscoordinadaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009 == req.getElementType()) {
			return null;
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010 == req.getElementType()) {
			return null;
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006 == req.getElementType()) {
			return null;
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008 == req.getElementType()) {
			return null;
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.ProfesorAsignaturasCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.ProfesorEscoordinadorCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.AlumnoMatriculadoenASIGCreateCommand(req,
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
		case dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart.VISUAL_ID:
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.AsignaturaProfesoresReorientCommand(req));
		case dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart.VISUAL_ID:
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.AsignaturaEscoordinadaReorientCommand(req));
		case dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart.VISUAL_ID:
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.ProfesorAsignaturasReorientCommand(req));
		case dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart.VISUAL_ID:
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.ProfesorEscoordinadorReorientCommand(req));
		case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID:
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.AlumnoMatriculadoenASIGReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
