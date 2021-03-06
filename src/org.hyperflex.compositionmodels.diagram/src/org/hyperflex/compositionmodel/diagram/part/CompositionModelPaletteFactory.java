package org.hyperflex.compositionmodel.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.hyperflex.compositionmodel.diagram.providers.CompositionModelElementTypes;

/**
 * @generated
 */
public class CompositionModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createEntities1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Entities" palette tool group
	 * @generated
	 */
	private PaletteContainer createEntities1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Entities1Group_title);
		paletteContainer.setId("createEntities1Group"); //$NON-NLS-1$
		paletteContainer.add(createImportROSComposite1CreationTool());
		paletteContainer.add(createChannel2CreationTool());
		paletteContainer.add(createComposite3CreationTool());
		paletteContainer.add(createProvidedInterface4CreationTool());
		paletteContainer.add(createRequiredInterface5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createInterfaceconnection1CreationTool());
		paletteContainer.add(createPromoteconnection2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImportROSComposite1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ImportROSComposite1CreationTool_title,
				Messages.ImportROSComposite1CreationTool_desc,
				Collections
						.singletonList(CompositionModelElementTypes.ROSComposite_3006));
		entry.setId("createImportROSComposite1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CompositionModelDiagramEditorPlugin
				.findImageDescriptor("icons/Composite.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChannel2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Channel2CreationTool_title,
				Messages.Channel2CreationTool_desc, null, null) {
		};
		entry.setId("createChannel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CompositionModelDiagramEditorPlugin
				.findImageDescriptor("icons/Channel.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComposite3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CompositionModelElementTypes.System_2001);
		types.add(CompositionModelElementTypes.SystemComposite_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Composite3CreationTool_title, null, types);
		entry.setId("createComposite3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CompositionModelElementTypes
				.getImageDescriptor(CompositionModelElementTypes.System_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProvidedInterface4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CompositionModelElementTypes.SystemProvidedInterf_3001);
		types.add(CompositionModelElementTypes.SystemCompositeProvidedInterf_3004);
		types.add(CompositionModelElementTypes.ROSMsgProducer_3007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ProvidedInterface4CreationTool_title, null, types);
		entry.setId("createProvidedInterface4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CompositionModelElementTypes
				.getImageDescriptor(CompositionModelElementTypes.SystemProvidedInterf_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRequiredInterface5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CompositionModelElementTypes.SystemRequiredInterf_3002);
		types.add(CompositionModelElementTypes.SystemCompositeRequiredInterf_3005);
		types.add(CompositionModelElementTypes.ROSMsgConsumer_3008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RequiredInterface5CreationTool_title, null, types);
		entry.setId("createRequiredInterface5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CompositionModelElementTypes
				.getImageDescriptor(CompositionModelElementTypes.SystemRequiredInterf_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterfaceconnection1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Interfaceconnection1CreationTool_title,
				Messages.Interfaceconnection1CreationTool_desc,
				Collections
						.singletonList(CompositionModelElementTypes.Connection_4001));
		entry.setId("createInterfaceconnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CompositionModelDiagramEditorPlugin
				.findImageDescriptor("icons/InterfaceConnection.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPromoteconnection2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CompositionModelElementTypes.SystemRequiredInterfExposed_4002);
		types.add(CompositionModelElementTypes.SystemProvidedInterfExposed_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Promoteconnection2CreationTool_title,
				Messages.Promoteconnection2CreationTool_desc, types);
		entry.setId("createPromoteconnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CompositionModelDiagramEditorPlugin
				.findImageDescriptor("icons/PromoteConnection.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
