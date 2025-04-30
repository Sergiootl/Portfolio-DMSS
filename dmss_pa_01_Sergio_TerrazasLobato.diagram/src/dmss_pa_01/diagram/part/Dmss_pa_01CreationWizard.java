/*
 * 
 */
package dmss_pa_01.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class Dmss_pa_01CreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected dmss_pa_01.diagram.part.Dmss_pa_01CreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected dmss_pa_01.diagram.part.Dmss_pa_01CreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(dmss_pa_01.diagram.part.Messages.Dmss_pa_01CreationWizardTitle);
		setDefaultPageImageDescriptor(dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewDmss_pa_01Wizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new dmss_pa_01.diagram.part.Dmss_pa_01CreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "dmss_pa_01_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(dmss_pa_01.diagram.part.Messages.Dmss_pa_01CreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				dmss_pa_01.diagram.part.Messages.Dmss_pa_01CreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new dmss_pa_01.diagram.part.Dmss_pa_01CreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "dmss_pa_01") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".dmss_pa_01_diagram".length()); //$NON-NLS-1$
					setFileName(dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "dmss_pa_01")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(dmss_pa_01.diagram.part.Messages.Dmss_pa_01CreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				dmss_pa_01.diagram.part.Messages.Dmss_pa_01CreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								dmss_pa_01.diagram.part.Messages.Dmss_pa_01CreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						dmss_pa_01.diagram.part.Messages.Dmss_pa_01CreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				dmss_pa_01.diagram.part.Dmss_pa_01DiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
