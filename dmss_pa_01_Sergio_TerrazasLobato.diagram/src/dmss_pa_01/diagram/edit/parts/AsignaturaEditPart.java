/*
 * 
 */
package dmss_pa_01.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class AsignaturaEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3002;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public AsignaturaEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new dmss_pa_01.diagram.edit.policies.AsignaturaItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new dmss_pa_01.diagram.edit.policies.OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new AsignaturaFigure();
	}

	/**
	* @generated
	*/
	public AsignaturaFigure getPrimaryShape() {
		return (AsignaturaFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof dmss_pa_01.diagram.edit.parts.AsignaturaNombreEditPart) {
			((dmss_pa_01.diagram.edit.parts.AsignaturaNombreEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureAsignaturaLabelFigure());
			return true;
		}
		if (childEditPart instanceof dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAsignaturaBloquesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAsignaturaGrupostrabajoCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof dmss_pa_01.diagram.edit.parts.AsignaturaNombreEditPart) {
			return true;
		}
		if (childEditPart instanceof dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAsignaturaBloquesCompartmentFigure();
			pane.remove(((dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getAsignaturaGrupostrabajoCompartmentFigure();
			pane.remove(
					((dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaBloquesCompartmentEditPart) {
			return getPrimaryShape().getAsignaturaBloquesCompartmentFigure();
		}
		if (editPart instanceof dmss_pa_01.diagram.edit.parts.AsignaturaAsignaturaGrupostrabajoCompartmentEditPart) {
			return getPrimaryShape().getAsignaturaGrupostrabajoCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry
				.getType(dmss_pa_01.diagram.edit.parts.AsignaturaNombreEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class AsignaturaFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAsignaturaLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAsignaturaBloquesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAsignaturaGrupostrabajoCompartmentFigure;

		/**
		 * @generated
		 */
		public AsignaturaFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAsignaturaLabelFigure = new WrappingLabel();

			fFigureAsignaturaLabelFigure.setText("Asignatura");
			fFigureAsignaturaLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureAsignaturaLabelFigure);

			fAsignaturaBloquesCompartmentFigure = new RectangleFigure();

			fAsignaturaBloquesCompartmentFigure.setOutline(false);

			this.add(fAsignaturaBloquesCompartmentFigure);

			fAsignaturaGrupostrabajoCompartmentFigure = new RectangleFigure();

			fAsignaturaGrupostrabajoCompartmentFigure.setOutline(false);

			this.add(fAsignaturaGrupostrabajoCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAsignaturaLabelFigure() {
			return fFigureAsignaturaLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAsignaturaBloquesCompartmentFigure() {
			return fAsignaturaBloquesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAsignaturaGrupostrabajoCompartmentFigure() {
			return fAsignaturaGrupostrabajoCompartmentFigure;
		}

	}

}
