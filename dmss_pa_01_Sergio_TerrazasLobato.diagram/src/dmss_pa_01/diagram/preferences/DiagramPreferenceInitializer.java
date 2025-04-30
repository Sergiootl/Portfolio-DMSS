/*
 * 
 */
package dmss_pa_01.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		dmss_pa_01.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		dmss_pa_01.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		dmss_pa_01.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		dmss_pa_01.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		dmss_pa_01.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
