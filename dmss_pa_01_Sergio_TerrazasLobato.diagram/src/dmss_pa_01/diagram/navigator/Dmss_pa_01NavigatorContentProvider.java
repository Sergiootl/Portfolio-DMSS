/*
* 
*/
package dmss_pa_01.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class Dmss_pa_01NavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public Dmss_pa_01NavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem> result = new ArrayList<dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, dmss_pa_01.diagram.edit.parts.RootEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup) {
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup group = (dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem) {
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem navigatorItem = (dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(view)) {

		case dmss_pa_01.diagram.edit.parts.RootEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup links = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_Root_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.UniversidadEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.UniversidadEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.UniversidadUniversidadTitulosuniversitariosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.UniversidadUniversidadAlumnosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.UniversidadUniversidadProfesoresCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup incominglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_TituloUniversitario_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.TituloUniversitarioTituloUniversitarioAsignaturasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup outgoinglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_Asignatura_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup incominglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_Asignatura_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.BloqueEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.BloqueBloqueActividadesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup incominglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_Encuesta_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup incominglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_Consulta_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup incominglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_Tarea_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup incominglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_ENLACEURL_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup incominglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_Foro_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ForoForoPreguntasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.PreguntaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.PreguntaEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.PreguntaPreguntaRespuestasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.RespuestaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.RespuestaEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getType(
							dmss_pa_01.diagram.edit.parts.RespuestaRespuestaRespuestaanidadaCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
					.getType(dmss_pa_01.diagram.edit.parts.Respuesta2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup incominglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_Recurso_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup incominglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_GrupoTrabajo_3013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup outgoinglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_GrupoTrabajo_3013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup outgoinglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_Alumno_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup incominglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_Alumno_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Node sv = (Node) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup incominglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_Profesor_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup outgoinglinks = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_Profesor_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.AsignaturaProfesoresEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup target = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_AsignaturaProfesores_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup source = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_AsignaturaProfesores_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.AsignaturaEscoordinadaEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup target = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_AsignaturaEscoordinada_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup source = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_AsignaturaEscoordinada_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.ProfesorAsignaturasEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup target = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_ProfesorAsignaturas_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup source = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_ProfesorAsignaturas_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.ProfesorEscoordinadorEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup target = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_ProfesorEscoordinador_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup source = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_ProfesorEscoordinador_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ProfesorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenTUEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup target = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_AlumnoMatriculadoenTU_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup source = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_AlumnoMatriculadoenTU_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.TituloUniversitarioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.AlumnoMatriculadoenASIGEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup target = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_AlumnoMatriculadoenASIG_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup source = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_AlumnoMatriculadoenASIG_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AsignaturaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.AlumnoGruposdetrabajoEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup target = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_AlumnoGruposdetrabajo_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup source = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_AlumnoGruposdetrabajo_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoAlumnosGTEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup target = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_GrupoTrabajoAlumnosGT_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup source = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_GrupoTrabajoAlumnosGT_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.AlumnoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoActividadobligatoriaEditPart.VISUAL_ID: {
			LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem> result = new LinkedList<dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup target = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_GrupoTrabajoActividadobligatoria_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup source = new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorGroup(
					dmss_pa_01.diagram.part.Messages.NavigatorGroupName_GrupoTrabajoActividadobligatoria_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.EncuestaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ConsultaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.TareaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ENLACEURLEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.ForoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.RecursoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
							.getType(dmss_pa_01.diagram.edit.parts.GrupoTrabajoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return dmss_pa_01.diagram.edit.parts.RootEditPart.MODEL_ID
				.equals(dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem> result = new ArrayList<dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<dmss_pa_01.diagram.navigator.Dmss_pa_01NavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem) {
			dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem abstractNavigatorItem = (dmss_pa_01.diagram.navigator.Dmss_pa_01AbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
