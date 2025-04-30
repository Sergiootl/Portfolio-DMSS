/*
* 
*/
package dmss_pa_01.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PreguntaPreguntaRespuestasCompartmentItemSemanticEditPolicy
		extends dmss_pa_01.diagram.edit.policies.Dmss_pa_01BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PreguntaPreguntaRespuestasCompartmentItemSemanticEditPolicy() {
		super(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Pregunta_3009);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Respuesta_3010 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.RespuestaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
