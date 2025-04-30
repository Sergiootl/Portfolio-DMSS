/*
* 
*/
package dmss_pa_01.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AsignaturaAsignaturaBloquesCompartmentItemSemanticEditPolicy
		extends dmss_pa_01.diagram.edit.policies.Dmss_pa_01BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AsignaturaAsignaturaBloquesCompartmentItemSemanticEditPolicy() {
		super(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Asignatura_3002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Bloque_3003 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.BloqueCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
