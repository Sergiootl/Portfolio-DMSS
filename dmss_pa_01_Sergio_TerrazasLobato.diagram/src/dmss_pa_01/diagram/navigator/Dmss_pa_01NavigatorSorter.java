/*
* 
*/
package dmss_pa_01.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class Dmss_pa_01NavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7013;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7012;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem) {
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem item = (dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
