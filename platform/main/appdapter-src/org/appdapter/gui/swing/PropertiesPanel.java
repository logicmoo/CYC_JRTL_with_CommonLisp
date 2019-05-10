package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

import org.appdapter.api.trigger.Box;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.GetSetObject;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.trigger.TriggerMouseAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertiesPanel<BoxType extends Box> extends ScreenBoxPanel<BoxType> implements GetSetObject {
	static Logger theLogger = LoggerFactory.getLogger(PropertiesPanel.class);

	public static Class EDITTYPE = Object.class;

	//DisplayContext context = new EmptyPOJOCollectionContext();
	//Object objectValue = null;
	Class objClass;

	private PropertyComparator propertyComparator = new PropertyComparator();

	private DisplayContext context;
	boolean showFields = false;
	boolean showInstanceProps = true;
	boolean showStaticProps = true;

	private PropertySheet sheet;

	private JJPanel buttonPanel;

	protected boolean basicBeanInfo = true;

	private int countInstFields;

	private int countStaticFields;

	private int countInstanceProps;

	private int countStaticProps;

	// private LessString lessString = new LessString();
	public PropertiesPanel() {
		this(Utility.getDisplayContext(), null, null, true, true, true);
	}

	public PropertiesPanel(DisplayContext context, Object val, Class objClass, boolean showNonStatics, boolean showStatics, boolean showFields) {
		this.context = context;
		this.objClass = objClass;
		showInstanceProps = showNonStatics;
		showStaticProps = showStatics;
		this.showFields = showFields;
		final Object val0 = val;
		if(val instanceof Singleton) {
			this.showStaticProps = true;
			this.showFields = true;
		}
		setObject(val0);
		TriggerMouseAdapter.installMouseAdapter(this);

	}

	@Override public Object getValue() {
		return objectValue;
	}

	@Override public Class<? extends Object> getClassOfBox() {
		//if(objClass!=null)  {
			//return objClass;
		//}
		return Object.class;
	}

	/*private JComponent createRow(PropertyDescriptor descriptor) {
	  JPanel panel = new JPanel();
	  BorderLayout layout = new BorderLayout(10, 5);
	  panel.setLayout(layout);
	  panel.add("West", new JLabel(descriptor.getDisplayName() + ":"));
	  panel.add("Center", new PropertyValueControl(context, val, descriptor));
	  return panel;
	} */

	/* class DougysTableModel extends AbstractTableModel {
	   public int getRowCount() {
	   }
	   public int getColumnCount() {
	   }
	   public Object getValueAt(int row, int column) {
	   }
	 }*/

	class PropertyComparator implements Comparator {
		@Override public int compare(Object first, Object second) {
			PropertyDescriptor a = (PropertyDescriptor) first;
			PropertyDescriptor b = (PropertyDescriptor) second;
			String nameA = a.getName();
			String nameB = b.getName();
			return nameA.compareToIgnoreCase(nameB);
		}

		@Override public boolean equals(Object o) {
			return (o instanceof PropertiesPanel.PropertyComparator);
		}
	}

	@Override protected void initSubclassGUI() {

		this.buttonPanel = new JJPanel(new FlowLayout(FlowLayout.LEFT));
		JButton reloadButton = new JButton("Refresh Properties");
		reloadButton.addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent event) {
				reload();
			}
		});
		buttonPanel.add(reloadButton);
		buttonPanel.add(new JCheckBox("Show Instance") {
			{
				setModel(new JToggleButton.ToggleButtonModel() {
					@Override public boolean isSelected() {
						return PropertiesPanel.this.showInstanceProps;
					}

					@Override public void setSelected(boolean b) {
						if (isSelected() == b)
							return;
						PropertiesPanel.this.showInstanceProps = b;
						super.setSelected(b);
						reload();
					}
				});
			}
		});
		buttonPanel.add(new JCheckBox("Show Static") {
			{
				setModel(new JToggleButton.ToggleButtonModel() {
					@Override public boolean isSelected() {
						return PropertiesPanel.this.showStaticProps;
					}

					@Override public void setSelected(boolean b) {
						if (isSelected() == b)
							return;
						PropertiesPanel.this.showStaticProps = b;
						super.setSelected(b);
						reload();
					}
				});
			}
		});

		buttonPanel.add(new JCheckBox("Show Fields") {
			{
				setModel(new JToggleButton.ToggleButtonModel() {
					@Override public boolean isSelected() {
						return PropertiesPanel.this.showFields;
					}

					@Override public void setSelected(boolean b) {
						if (isSelected() == b)
							return;
						PropertiesPanel.this.showFields = b;
						super.setSelected(b);
						reload();
					}
				});
			}
		});

		buttonPanel.add(new JCheckBox("Basic Info") {
			{
				setModel(new JToggleButton.ToggleButtonModel() {
					@Override public boolean isSelected() {
						return PropertiesPanel.this.basicBeanInfo;
					}

					@Override public void setSelected(boolean b) {
						if (isSelected() == b)
							return;
						PropertiesPanel.this.basicBeanInfo = b;
						super.setSelected(b);
						reload();
					}
				});
				setToolTipText("Only Show non-Enhanced by Appdapter(tm) BeanInfo");

			}
		});
		buttonPanel.add(new JLabel("Object Class") {
			@Override public String getText() {
				if (objClass != null)
					return "" + objClass;
				return super.getText();
			}
		});
		TriggerMouseAdapter.installMouseAdapter(buttonPanel, objectValue);
		removeAll();
		setLayout(new BorderLayout());
		add(BorderLayout.NORTH, buttonPanel);
	}

	protected void reload() {
		Utility.invokeLater(new Runnable() {
			@Override public void run() {
				completeSubClassGUI();
			}
		});
	}

	@Override protected void completeSubClassGUI() {
		cj.attempt();
	}

	CantankerousJob cj = new CantankerousJob("completeSubClassGUI", this, false) {
		@Override public void run() {
				reloadContents00();

		}
	};

	public void reloadContents00() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {

		}
		final Object source = getValue();
		if (source != null) {
			try {
				this.sheet = new PropertySheet();

				//sheet.setLayout(new BoxLayout(sheet, BoxLayout.Y_AXIS));
				if (objClass == null) {
					objClass = source.getClass();
				}
				BeanInfo info;
				if (basicBeanInfo) {
					info = Introspector.getBeanInfo(objClass);
				} else {
					info = Utility.getBeanInfo(objClass, source);
				}

				java.util.List props = ReflectUtils.asList(info.getPropertyDescriptors());
				Collections.sort(props, propertyComparator);

				Iterator it = props.iterator();
				HashSet<String> propsShown = new HashSet<String>();
				countStaticProps = 0;
				countStaticFields = 0;
				countInstFields = 0;
				countInstanceProps = 0;

				sheet.add("this: ", "" + source, new SmallObjectView(context, null, source));

				while (it.hasNext()) {
					PropertyDescriptor p = (PropertyDescriptor) it.next();
					String attributeName = p.getDisplayName();
					propsShown.add(attributeName);
					Class type = p.getPropertyType();
					Method m = p.getReadMethod();
					if (m == null) {
						m = p.getWriteMethod();
					}
					boolean isStatic = false;
					if (m != null) {
						isStatic = ReflectUtils.isStatic(m);
					}
					String si;
					if (isStatic) {
						countStaticProps++;
						if (!showStaticProps)
							continue;
						si = "(S)";
					} else {
						countInstanceProps++;
						if (!showInstanceProps)
							continue;
						si = "";
					}
					Utility.checkSource(source);
					PropertyValueControl pvc = new PropertyValueControl(context, attributeName, source, p);
					String tip = type + ":" + p.getReadMethod() + "/" + p.getWriteMethod();
					pvc.setToolTipText(tip);
					sheet.add(attributeName + ": " + si, tip, pvc);
				}
				if (propsShown.size() == 0)
					showFields = true;

				for (Field f : ReflectUtils.getAllFields(objClass)) {
					String attributeName = f.getName();
					for (String s : propsShown) {
						if (ReflectUtils.matchesName(attributeName, s))
							f = null;
						break;
					}
					if (f == null)
						continue;
					boolean isStatic = ReflectUtils.isStatic(f);
					String si;
					if (isStatic) {
						countStaticFields++;
						if (!showStaticProps)
							continue;
						si = "(Sf)";
					} else {
						countInstFields++;
						if (!showInstanceProps)
							continue;
						si = "(f)";
					}
					if (showFields) {
						propsShown.add(attributeName);
						PropertyValueControl pvc = new PropertyValueControl(context, attributeName, source, f);
						String tip = "" + f;
						pvc.setToolTipText(tip);
						sheet.add(attributeName + ": " + si, tip, pvc);
					}
				}

				removeAll();
				setLayout(new BorderLayout());
				add(BorderLayout.NORTH, buttonPanel);
				add(BorderLayout.CENTER, sheet);
				Utility.invokeLater(new Runnable() {
					@Override public void run() {
						validate();
					}
				});
			} catch (Exception err) {
				theLogger.error("An error occurred", err);
			}
		}

	}

	@Override protected boolean reloadObjectGUI(Object val) {
		if (val == this) {
			return true;
		}
		objectValue = val;
		if (objClass == null && objectValue != null) {
			objClass = val.getClass();
		}

		Utility.replaceRunnable(this, new Runnable() {
			@Override public void run() {
				if (objectValue != null) {
					initSubclassGUI();
					completeSubClassGUI();
				} else {
					initSubclassGUI();
				}
			};
		});
		return true;
	}

}
