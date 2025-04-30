/*
 * 
 */
package dmss_pa_01.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class GrupoTrabajoActividadobligatoriaReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public GrupoTrabajoActividadobligatoriaReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof dmss_pa_01.GrupoTrabajo) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof dmss_pa_01.Actividad && newEnd instanceof dmss_pa_01.GrupoTrabajo)) {
			return false;
		}
		return dmss_pa_01.diagram.edit.policies.Dmss_pa_01BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistGrupoTrabajoActividadobligatoria_4017(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof dmss_pa_01.Actividad && newEnd instanceof dmss_pa_01.Actividad)) {
			return false;
		}
		return dmss_pa_01.diagram.edit.policies.Dmss_pa_01BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistGrupoTrabajoActividadobligatoria_4017(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getActividadobligatoria().remove(getOldTarget());
		getNewSource().getActividadobligatoria().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getActividadobligatoria().remove(getOldTarget());
		getOldSource().getActividadobligatoria().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected dmss_pa_01.GrupoTrabajo getOldSource() {
		return (dmss_pa_01.GrupoTrabajo) referenceOwner;
	}

	/**
	* @generated
	*/
	protected dmss_pa_01.GrupoTrabajo getNewSource() {
		return (dmss_pa_01.GrupoTrabajo) newEnd;
	}

	/**
	* @generated
	*/
	protected dmss_pa_01.Actividad getOldTarget() {
		return (dmss_pa_01.Actividad) oldEnd;
	}

	/**
	* @generated
	*/
	protected dmss_pa_01.Actividad getNewTarget() {
		return (dmss_pa_01.Actividad) newEnd;
	}
}
