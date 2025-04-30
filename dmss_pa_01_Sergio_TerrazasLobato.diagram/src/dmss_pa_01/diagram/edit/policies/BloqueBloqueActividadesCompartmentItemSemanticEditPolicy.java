/*
* 
*/
package dmss_pa_01.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class BloqueBloqueActividadesCompartmentItemSemanticEditPolicy
		extends dmss_pa_01.diagram.edit.policies.Dmss_pa_01BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public BloqueBloqueActividadesCompartmentItemSemanticEditPolicy() {
		super(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Bloque_3003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Encuesta_3004 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.EncuestaCreateCommand(req));
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Consulta_3005 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.ConsultaCreateCommand(req));
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Tarea_3006 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.TareaCreateCommand(req));
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ENLACEURL_3007 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.ENLACEURLCreateCommand(req));
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Foro_3008 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.ForoCreateCommand(req));
		}
		if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Recurso_3012 == req.getElementType()) {
			return getGEFWrapper(new dmss_pa_01.diagram.edit.commands.RecursoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
