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
public class AlumnoGruposdetrabajoReorientCommand extends EditElementCommand {

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
	public AlumnoGruposdetrabajoReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof dmss_pa_01.Alumno) {
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
		if (!(oldEnd instanceof dmss_pa_01.GrupoTrabajo && newEnd instanceof dmss_pa_01.Alumno)) {
			return false;
		}
		return dmss_pa_01.diagram.edit.policies.Dmss_pa_01BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAlumnoGruposdetrabajo_4013(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof dmss_pa_01.GrupoTrabajo && newEnd instanceof dmss_pa_01.GrupoTrabajo)) {
			return false;
		}
		return dmss_pa_01.diagram.edit.policies.Dmss_pa_01BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAlumnoGruposdetrabajo_4013(getOldSource(), getNewTarget());
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
		getOldSource().getGruposdetrabajo().remove(getOldTarget());
		getNewSource().getGruposdetrabajo().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getGruposdetrabajo().remove(getOldTarget());
		getOldSource().getGruposdetrabajo().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected dmss_pa_01.Alumno getOldSource() {
		return (dmss_pa_01.Alumno) referenceOwner;
	}

	/**
	* @generated
	*/
	protected dmss_pa_01.Alumno getNewSource() {
		return (dmss_pa_01.Alumno) newEnd;
	}

	/**
	* @generated
	*/
	protected dmss_pa_01.GrupoTrabajo getOldTarget() {
		return (dmss_pa_01.GrupoTrabajo) oldEnd;
	}

	/**
	* @generated
	*/
	protected dmss_pa_01.GrupoTrabajo getNewTarget() {
		return (dmss_pa_01.GrupoTrabajo) newEnd;
	}
}
