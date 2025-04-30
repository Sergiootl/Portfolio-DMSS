/*
 * 
 */
package dmss_pa_01.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

/**
 * @generated
 */
public class Dmss_pa_01ParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser universidadNombre_5001Parser;

	/**
	* @generated
	*/
	private IParser getUniversidadNombre_5001Parser() {
		if (universidadNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getUniversidad_Nombre() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			universidadNombre_5001Parser = parser;
		}
		return universidadNombre_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser tituloUniversitarioNombre_5014Parser;

	/**
	* @generated
	*/
	private IParser getTituloUniversitarioNombre_5014Parser() {
		if (tituloUniversitarioNombre_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getTituloUniversitario_Nombre() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			tituloUniversitarioNombre_5014Parser = parser;
		}
		return tituloUniversitarioNombre_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser asignaturaNombre_5013Parser;

	/**
	* @generated
	*/
	private IParser getAsignaturaNombre_5013Parser() {
		if (asignaturaNombre_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getAsignatura_Nombre() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			asignaturaNombre_5013Parser = parser;
		}
		return asignaturaNombre_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser bloqueNombre_5011Parser;

	/**
	* @generated
	*/
	private IParser getBloqueNombre_5011Parser() {
		if (bloqueNombre_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getBloque_Nombre() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			bloqueNombre_5011Parser = parser;
		}
		return bloqueNombre_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser encuestaDescripcion_5002Parser;

	/**
	* @generated
	*/
	private IParser getEncuestaDescripcion_5002Parser() {
		if (encuestaDescripcion_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getActividad_Descripcion() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			encuestaDescripcion_5002Parser = parser;
		}
		return encuestaDescripcion_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser consultaDescripcion_5003Parser;

	/**
	* @generated
	*/
	private IParser getConsultaDescripcion_5003Parser() {
		if (consultaDescripcion_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getActividad_Descripcion() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			consultaDescripcion_5003Parser = parser;
		}
		return consultaDescripcion_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser tareaDescripcion_5004Parser;

	/**
	* @generated
	*/
	private IParser getTareaDescripcion_5004Parser() {
		if (tareaDescripcion_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getActividad_Descripcion() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			tareaDescripcion_5004Parser = parser;
		}
		return tareaDescripcion_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser eNLACEURLDescripcion_5005Parser;

	/**
	* @generated
	*/
	private IParser getENLACEURLDescripcion_5005Parser() {
		if (eNLACEURLDescripcion_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getActividad_Descripcion() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			eNLACEURLDescripcion_5005Parser = parser;
		}
		return eNLACEURLDescripcion_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser foroDescripcion_5009Parser;

	/**
	* @generated
	*/
	private IParser getForoDescripcion_5009Parser() {
		if (foroDescripcion_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getActividad_Descripcion() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			foroDescripcion_5009Parser = parser;
		}
		return foroDescripcion_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser preguntaTexto_5008Parser;

	/**
	* @generated
	*/
	private IParser getPreguntaTexto_5008Parser() {
		if (preguntaTexto_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getPregunta_Texto() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			preguntaTexto_5008Parser = parser;
		}
		return preguntaTexto_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser respuestaTexto_5007Parser;

	/**
	* @generated
	*/
	private IParser getRespuestaTexto_5007Parser() {
		if (respuestaTexto_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getRespuesta_Texto() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			respuestaTexto_5007Parser = parser;
		}
		return respuestaTexto_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser respuestaTexto_5006Parser;

	/**
	* @generated
	*/
	private IParser getRespuestaTexto_5006Parser() {
		if (respuestaTexto_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getRespuesta_Texto() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			respuestaTexto_5006Parser = parser;
		}
		return respuestaTexto_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser recursoExtension_5010Parser;

	/**
	* @generated
	*/
	private IParser getRecursoExtension_5010Parser() {
		if (recursoExtension_5010Parser == null) {
			EAttribute editableFeature = dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getRecurso_Extension();
			EnumParser parser = new EnumParser(editableFeature);
			recursoExtension_5010Parser = parser;
		}
		return recursoExtension_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser grupoTrabajoDescripcion_5012Parser;

	/**
	* @generated
	*/
	private IParser getGrupoTrabajoDescripcion_5012Parser() {
		if (grupoTrabajoDescripcion_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getGrupoTrabajo_Descripcion() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			grupoTrabajoDescripcion_5012Parser = parser;
		}
		return grupoTrabajoDescripcion_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser alumnoNombre_5015Parser;

	/**
	* @generated
	*/
	private IParser getAlumnoNombre_5015Parser() {
		if (alumnoNombre_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getAlumno_Nombre() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			alumnoNombre_5015Parser = parser;
		}
		return alumnoNombre_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser profesorNombre_5016Parser;

	/**
	* @generated
	*/
	private IParser getProfesorNombre_5016Parser() {
		if (profesorNombre_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { dmss_pa_01.Dmss_pa_01Package.eINSTANCE.getProfesor_Nombre() };
			dmss_pa_01.diagram.parsers.MessageFormatParser parser = new dmss_pa_01.diagram.parsers.MessageFormatParser(
					features);
			profesorNombre_5016Parser = parser;
		}
		return profesorNombre_5016Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case dmss_pa_01.diagram.edit.parts.UniversidadNombreEditPart.VISUAL_ID:
			return getUniversidadNombre_5001Parser();
		case dmss_pa_01.diagram.edit.parts.TituloUniversitarioNombreEditPart.VISUAL_ID:
			return getTituloUniversitarioNombre_5014Parser();
		case dmss_pa_01.diagram.edit.parts.AsignaturaNombreEditPart.VISUAL_ID:
			return getAsignaturaNombre_5013Parser();
		case dmss_pa_01.diagram.edit.parts.BloqueNombreEditPart.VISUAL_ID:
			return getBloqueNombre_5011Parser();
		case dmss_pa_01.diagram.edit.parts.EncuestaDescripcionEditPart.VISUAL_ID:
			return getEncuestaDescripcion_5002Parser();
		case dmss_pa_01.diagram.edit.parts.ConsultaDescripcionEditPart.VISUAL_ID:
			return getConsultaDescripcion_5003Parser();
		case dmss_pa_01.diagram.edit.parts.TareaDescripcionEditPart.VISUAL_ID:
			return getTareaDescripcion_5004Parser();
		case dmss_pa_01.diagram.edit.parts.ENLACEURLDescripcionEditPart.VISUAL_ID:
			return getENLACEURLDescripcion_5005Parser();
		case dmss_pa_01.diagram.edit.parts.ForoDescripcionEditPart.VISUAL_ID:
			return getForoDescripcion_5009Parser();
		case dmss_pa_01.diagram.edit.parts.PreguntaTextoEditPart.VISUAL_ID:
			return getPreguntaTexto_5008Parser();
		case dmss_pa_01.diagram.edit.parts.RespuestaTextoEditPart.VISUAL_ID:
			return getRespuestaTexto_5007Parser();
		case dmss_pa_01.diagram.edit.parts.RespuestaTexto2EditPart.VISUAL_ID:
			return getRespuestaTexto_5006Parser();

		case dmss_pa_01.diagram.edit.parts.RecursoExtensionEditPart.VISUAL_ID:
			return getRecursoExtension_5010Parser();
		case dmss_pa_01.diagram.edit.parts.GrupoTrabajoDescripcionEditPart.VISUAL_ID:
			return getGrupoTrabajoDescripcion_5012Parser();
		case dmss_pa_01.diagram.edit.parts.AlumnoNombreEditPart.VISUAL_ID:
			return getAlumnoNombre_5015Parser();
		case dmss_pa_01.diagram.edit.parts.ProfesorNombreEditPart.VISUAL_ID:
			return getProfesorNombre_5016Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(dmss_pa_01.diagram.part.Dmss_pa_01VisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
