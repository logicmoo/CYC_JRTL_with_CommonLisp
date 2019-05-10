package org.appdapter.gui.editors;

import java.awt.Component;
import java.util.Collection;
import java.util.Map;

import org.appdapter.core.jvm.SetObject;
import org.appdapter.core.convert.OptionalArg;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.gui.api.AddTabFrames.SetTabTo;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.browse.Utility.UtilityConverter;
import org.appdapter.gui.browse.Utility.UtilityOptionalArgs;
import org.appdapter.gui.editors.LargeObjectView.TabPanelMaker;
import org.appdapter.gui.swing.CollectionContentsPanel;
import org.appdapter.gui.swing.CollectionContentsPanelUsingTable;
import org.appdapter.gui.swing.ConstructorsListPanel;
import org.appdapter.gui.swing.ErrorPanel;
import org.appdapter.gui.swing.LargeObjectChooser;
import org.appdapter.gui.swing.MethodsPanel;
import org.appdapter.gui.swing.PropertiesPanel;
import org.appdapter.gui.swing.ScreenBoxPanel;
import org.appdapter.gui.swing.StaticMethodsPanel;
import org.appdapter.gui.table.MapContentsPanel;

public class SpecificObjectCustomizers extends TabPanelMaker {

	@Override public void setTabs(BoxPanelSwitchableView tabs, DisplayContext context, Object object, Class objClass, SetTabTo cmd) {
		setTabs0(tabs, context, object, objClass, cmd);
	}

	public void setTabs0(BoxPanelSwitchableView tabs, DisplayContext context, Object object, Class objClass, SetTabTo cmd) {

		for (Class comp : Utility.findPanelClasses(objClass)) {
			if (comp == null) {
				return;
			}
			if (!ReflectUtils.isCreatable(comp))
				continue;
			String prefix = ReflectUtils.getCanonicalSimpleName(comp);

			if (ObjectPanelHost.class.isAssignableFrom(comp))
				continue;
			boolean declaredGood = false;
			if (ScreenBoxPanel.class.isAssignableFrom(comp) || ObjectPanel.class.isAssignableFrom(comp)) {
				declaredGood = true;
			}

			if (tabs.containsComponentOfClass(comp).size() > 0)
				continue;

			if (!Utility.getEditsObject(object, objClass, comp)) {
				Utility.warn("Wont use " + planInfo(object, objClass, comp));
				continue;
			}
			if (cmd == SetTabTo.ADD) {
				Component cp = null;
				try {
					if (!Component.class.isAssignableFrom(comp))
						continue;
					Throwable why = null;
					Utility.warn("Creating " + planInfo(object, objClass, comp));
					try {
						cp = (Component) comp.newInstance();
					} catch (Throwable e1) {
						why = e1;
					}
					if (cp == null) {
						try {
							cp = (Component) ReflectUtils.invokeConstructorOptional(new UtilityConverter(), new UtilityOptionalArgs(OptionalArg.OPTIONAL_FROM_DEFAULTS), comp, object);

						} catch (Throwable e) {
							why = e;
						}
					}
					if (cp == null) {
						Utility.error("Did not create " + planInfo(object, objClass, comp), why);
						continue;
					}
					if (cp instanceof SetObject) {
						try {
							((SetObject) cp).setObject(object);
						} catch (Throwable e) {
							why = e;
							throw e;
						}
					}
					tabs.addTab(prefix, cp);

				} catch (Throwable e) {
					e.printStackTrace();
					Utility.error("Did not add to " + planInfo(object, objClass, comp), e);
				}

			}
			if (cmd == SetTabTo.REMOVE) {
				tabs.removeTab(prefix, null);
			}
		}
	}

	private String planInfo(Object object, Class objClass, Class comp) {
		String planinfo = ("instanceof " + comp + " for (" + objClass.getName() + ")" + object);
		return planinfo;
	}

	static public class BasicObjectCustomizer extends TabPanelMaker {

		@Override public void setTabs(BoxPanelSwitchableView tabs, DisplayContext context, Object object, Class objClass, SetTabTo cmd) {
			setTabs0(tabs, context, object, objClass, cmd);
		}

		public void setTabs0(BoxPanelSwitchableView tabs, DisplayContext context, Object object, Class objClass, SetTabTo cmd) {
			String prefix = "";
			if (object instanceof Class) {
				prefix = "Class ";
			}
			if (cmd == SetTabTo.ADD) {
				PropertiesPanel props = new PropertiesPanel(context, object, objClass, true, false, true);
				tabs.addTab(prefix + "Properties", props);
			}
			if (cmd == SetTabTo.REMOVE) {
				tabs.removeTab(prefix + "Properties", null);
			}
			String ms = prefix + "Methods";
			try {
				if (cmd == SetTabTo.ADD) {
					MethodsPanel view = new MethodsPanel(context, object, objClass);
					tabs.addTab(ms, view);
				}
				if (cmd == SetTabTo.REMOVE) {
					tabs.removeTab(ms, null);
				}
			} catch (Exception err) {
				if (cmd == SetTabTo.ADD)
					tabs.addTab(ms, new ErrorPanel("Could not show view", err));
				if (cmd == SetTabTo.REMOVE) {
					tabs.removeTab(ms, null);
				}
			}
		}

	}

	static public class ClassCustomizer extends TabPanelMaker {
		@Override public void setTabs(BoxPanelSwitchableView tabs, DisplayContext context, Object object, Class objClass, SetTabTo cmds) {
			if (!(object instanceof Class)) {
				return;
			}
			Class clazz = (Class) object;
			if (cmds != SetTabTo.ADD)
				return;
			try {
				ConstructorsListPanel constructors = new ConstructorsListPanel(clazz);
				tabs.insertTab("Constructors", null, constructors, null, 0);
			} catch (Exception err) {
				tabs.insertTab("Constructors", null, new ErrorPanel("Could not show constructors", err), null, 0);
			}

			try {
				StaticMethodsPanel statics = new StaticMethodsPanel(clazz);
				tabs.insertTab("Static methods", null, statics, null, 1);
			} catch (Exception err) {
				tabs.insertTab("Static methods", null, new ErrorPanel("Could not show static methods", err), null, 1);
			}
			try {
				PropertiesPanel statics = new PropertiesPanel(context, null, clazz, false, true, true);
				tabs.insertTab("Static Properties", null, statics, null, 1);
			} catch (Exception err) {
				tabs.insertTab("Static Properties", null, new ErrorPanel("Could not show static Properties", err), null, 1);
			}
			try {
				NamedObjectCollection noc = context.getLocalBoxedChildren();
				LargeObjectChooser instances = new LargeObjectChooser(clazz, noc);
				tabs.insertTab("InstancesOf", null, instances, null, 0);
			} catch (Exception err) {
				tabs.insertTab("InstancesOf", null, new ErrorPanel("Could not show Instances", err), null, 0);
			}
		}
	}

	static public class CollectionCustomizer extends TabPanelMaker {

		@Override public void setTabs(BoxPanelSwitchableView tabs, DisplayContext context, Object object, Class objClass, SetTabTo cmds) {
			if (!(object instanceof Collection)) {
				return;
			}
			String title = "The contents of " + object;
			if (cmds != SetTabTo.ADD)
				return;
			try {
				CollectionContentsPanel cc = new CollectionContentsPanel(context, title, null, (Collection) object, null, tabs, true);
				tabs.insertTab("Contents", null, cc, null, 0);
				tabs.addChangeListener(cc);
			} catch (Exception err) {
				tabs.insertTab("Contents", null, new ErrorPanel(title + " could not be shown", err), null, 0);
			}
			if (true)
				return;
			try {
				CollectionContentsPanelUsingTable cc = new CollectionContentsPanelUsingTable(context, title, (Collection) object, tabs);
				tabs.insertTab("Contents using JTable", null, cc, null, 0);
				tabs.addChangeListener(cc);
			} catch (Exception err) {
				tabs.insertTab("Contents using JTable", null, new ErrorPanel(title + " could not be shown", err), null, 0);
			}
		}
	}

	static public class ThrowableCustomizer extends TabPanelMaker {

		@Override public void setTabs(BoxPanelSwitchableView tabs, DisplayContext context, Object objct, Class objClass, SetTabTo cmds) {
			if (!(objct instanceof Throwable)) {
				return;
			}
			if (cmds != SetTabTo.ADD)
				return;
			Throwable object = (Throwable) objct;

			String name;
			if (object instanceof Error) {
				name = "Error";
			} else if (object instanceof RuntimeException) {
				name = "RuntimeException";
			} else if (object instanceof Exception) {
				name = "Exception";
			} else {
				name = "Throwable";
			}

			try {
				ErrorPanel errorPanel = new ErrorPanel(object);
				tabs.insertTab(name, null, errorPanel, null, 0);
			} catch (Exception err) {
				tabs.insertTab(name, null, new ErrorPanel("Could not show error info for " + object, err), null, 0);
			}
		}
	}

}