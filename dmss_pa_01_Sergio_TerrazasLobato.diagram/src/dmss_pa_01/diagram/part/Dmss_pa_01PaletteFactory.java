
/*
 * 
 */
package dmss_pa_01.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class Dmss_pa_01PaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(dmss_pa_01.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAlumno1CreationTool());
		paletteContainer.add(createAsignatura2CreationTool());
		paletteContainer.add(createBloque3CreationTool());
		paletteContainer.add(createConsulta4CreationTool());
		paletteContainer.add(createENLACEURL5CreationTool());
		paletteContainer.add(createEncuesta6CreationTool());
		paletteContainer.add(createForo7CreationTool());
		paletteContainer.add(createGrupoTrabajo8CreationTool());
		paletteContainer.add(createPregunta9CreationTool());
		paletteContainer.add(createProfesor10CreationTool());
		paletteContainer.add(createRecurso11CreationTool());
		paletteContainer.add(createRespuesta12CreationTool());
		paletteContainer.add(createTarea13CreationTool());
		paletteContainer.add(createTituloUniversitario14CreationTool());
		paletteContainer.add(createUniversidad15CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(dmss_pa_01.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createActividadobligatoria1CreationTool());
		paletteContainer.add(createAlumnosGT2CreationTool());
		paletteContainer.add(createAsignaturas3CreationTool());
		paletteContainer.add(createEscoordinada4CreationTool());
		paletteContainer.add(createEscoordinador5CreationTool());
		paletteContainer.add(createGruposdetrabajo6CreationTool());
		paletteContainer.add(createMatriculadoenASIG7CreationTool());
		paletteContainer.add(createMatriculadoenTU8CreationTool());
		paletteContainer.add(createProfesores9CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAlumno1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.Alumno1CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Alumno1CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Alumno_3014));
		entry.setId("createAlumno1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Alumno_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAsignatura2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.Asignatura2CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Asignatura2CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Asignatura_3002));
		entry.setId("createAsignatura2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Asignatura_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBloque3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.Bloque3CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Bloque3CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Bloque_3003));
		entry.setId("createBloque3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Bloque_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConsulta4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.Consulta4CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Consulta4CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Consulta_3005));
		entry.setId("createConsulta4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Consulta_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createENLACEURL5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.ENLACEURL5CreationTool_title,
				dmss_pa_01.diagram.part.Messages.ENLACEURL5CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ENLACEURL_3007));
		entry.setId("createENLACEURL5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ENLACEURL_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEncuesta6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.Encuesta6CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Encuesta6CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Encuesta_3004));
		entry.setId("createEncuesta6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Encuesta_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createForo7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(dmss_pa_01.diagram.part.Messages.Foro7CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Foro7CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Foro_3008));
		entry.setId("createForo7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Foro_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGrupoTrabajo8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.GrupoTrabajo8CreationTool_title,
				dmss_pa_01.diagram.part.Messages.GrupoTrabajo8CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajo_3013));
		entry.setId("createGrupoTrabajo8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajo_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPregunta9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.Pregunta9CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Pregunta9CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Pregunta_3009));
		entry.setId("createPregunta9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Pregunta_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProfesor10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.Profesor10CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Profesor10CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Profesor_3015));
		entry.setId("createProfesor10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Profesor_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRecurso11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.Recurso11CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Recurso11CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Recurso_3012));
		entry.setId("createRecurso11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Recurso_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRespuesta12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Respuesta_3010);
		types.add(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Respuesta_3011);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.Respuesta12CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Respuesta12CreationTool_desc, types);
		entry.setId("createRespuesta12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Respuesta_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTarea13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.Tarea13CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Tarea13CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Tarea_3006));
		entry.setId("createTarea13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Tarea_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTituloUniversitario14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.TituloUniversitario14CreationTool_title,
				dmss_pa_01.diagram.part.Messages.TituloUniversitario14CreationTool_desc, Collections
						.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.TituloUniversitario_3001));
		entry.setId("createTituloUniversitario14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.TituloUniversitario_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUniversidad15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dmss_pa_01.diagram.part.Messages.Universidad15CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Universidad15CreationTool_desc,
				Collections.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Universidad_2001));
		entry.setId("createUniversidad15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.Universidad_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActividadobligatoria1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dmss_pa_01.diagram.part.Messages.Actividadobligatoria1CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Actividadobligatoria1CreationTool_desc, Collections.singletonList(
						dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017));
		entry.setId("createActividadobligatoria1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.getImageDescriptor(
				dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoActividadobligatoria_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAlumnosGT2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dmss_pa_01.diagram.part.Messages.AlumnosGT2CreationTool_title,
				dmss_pa_01.diagram.part.Messages.AlumnosGT2CreationTool_desc, Collections
						.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016));
		entry.setId("createAlumnosGT2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.GrupoTrabajoAlumnosGT_4016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAsignaturas3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dmss_pa_01.diagram.part.Messages.Asignaturas3CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Asignaturas3CreationTool_desc, Collections
						.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009));
		entry.setId("createAsignaturas3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorAsignaturas_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEscoordinada4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dmss_pa_01.diagram.part.Messages.Escoordinada4CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Escoordinada4CreationTool_desc, Collections.singletonList(
						dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008));
		entry.setId("createEscoordinada4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaEscoordinada_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEscoordinador5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dmss_pa_01.diagram.part.Messages.Escoordinador5CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Escoordinador5CreationTool_desc, Collections
						.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010));
		entry.setId("createEscoordinador5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.ProfesorEscoordinador_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGruposdetrabajo6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dmss_pa_01.diagram.part.Messages.Gruposdetrabajo6CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Gruposdetrabajo6CreationTool_desc, Collections
						.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013));
		entry.setId("createGruposdetrabajo6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoGruposdetrabajo_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMatriculadoenASIG7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dmss_pa_01.diagram.part.Messages.MatriculadoenASIG7CreationTool_title,
				dmss_pa_01.diagram.part.Messages.MatriculadoenASIG7CreationTool_desc, Collections.singletonList(
						dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012));
		entry.setId("createMatriculadoenASIG7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenASIG_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMatriculadoenTU8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dmss_pa_01.diagram.part.Messages.MatriculadoenTU8CreationTool_title,
				dmss_pa_01.diagram.part.Messages.MatriculadoenTU8CreationTool_desc, Collections
						.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenTU_4011));
		entry.setId("createMatriculadoenTU8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AlumnoMatriculadoenTU_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProfesores9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dmss_pa_01.diagram.part.Messages.Profesores9CreationTool_title,
				dmss_pa_01.diagram.part.Messages.Profesores9CreationTool_desc, Collections
						.singletonList(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006));
		entry.setId("createProfesores9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes
				.getImageDescriptor(dmss_pa_01.diagram.providers.Dmss_pa_01ElementTypes.AsignaturaProfesores_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
