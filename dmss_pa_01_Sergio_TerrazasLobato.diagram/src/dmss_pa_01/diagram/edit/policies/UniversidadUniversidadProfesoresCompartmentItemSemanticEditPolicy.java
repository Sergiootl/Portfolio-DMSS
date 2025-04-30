/*
* 
*/
package dmss_pa_01.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class UniversidadUniversidadProfesoresCompartmentItemSemanticEditPolicy
		extends dmss_pa_01.diagram.edit.policies.Dmss_pa_01BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UniversidadUniversidadProfesoresCompartmentItemSemanticEditPolicy() {
		super(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Universidad_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Profesor_3015 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.ProfesorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
