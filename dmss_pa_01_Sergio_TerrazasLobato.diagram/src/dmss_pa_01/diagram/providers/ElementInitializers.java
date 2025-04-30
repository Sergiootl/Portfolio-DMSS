/*
 * 
 */
package dmss_pa_01.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
