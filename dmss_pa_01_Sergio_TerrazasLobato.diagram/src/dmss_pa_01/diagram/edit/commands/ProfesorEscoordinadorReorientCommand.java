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
public class ProfesorEscoordinadorReorientCommand extends EditElementCommand {

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
	public ProfesorEscoordinadorReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof dmss_pa_01.Profesor) {
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
		if (!(oldEnd instanceof dmss_pa_01.Asignatura && newEnd instanceof dmss_pa_01.Profesor)) {
			return false;
		}
		return dmss_pa_01.diagram.edit.policies.Dmss_pa_01BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistProfesorEscoordinador_4010(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof dmss_pa_01.Asignatura && newEnd instanceof dmss_pa_01.Asignatura)) {
			return false;
		}
		return dmss_pa_01.diagram.edit.policies.Dmss_pa_01BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistProfesorEscoordinador_4010(getOldSource(), getNewTarget());
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
		getOldSource().setEscoordinador(null);
		getNewSource().setEscoordinador(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setEscoordinador(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected dmss_pa_01.Profesor getOldSource() {
		return (dmss_pa_01.Profesor) referenceOwner;
	}

	/**
	* @generated
	*/
	protected dmss_pa_01.Profesor getNewSource() {
		return (dmss_pa_01.Profesor) newEnd;
	}

	/**
	* @generated
	*/
	protected dmss_pa_01.Asignatura getOldTarget() {
		return (dmss_pa_01.Asignatura) oldEnd;
	}

	/**
	* @generated
	*/
	protected dmss_pa_01.Asignatura getNewTarget() {
		return (dmss_pa_01.Asignatura) newEnd;
	}
}
