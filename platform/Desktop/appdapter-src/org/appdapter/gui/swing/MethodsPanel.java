package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.browse.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A GUI component showing all the methods of a given object and controls
 * for providing parameters, executing the methods, and manipulating the result
 *
 * 
 */
public class MethodsPanel extends JJPanel implements ActionListener, ListSelectionListener {
	private static Logger theLogger = LoggerFactory.getLogger(MethodsPanel.class);

	DisplayContext context;
	Object object;
	Class objectClass;

	MethodList methodList;
	MethodParametersPanel paramPanel;
	JButton executeButton;
	JSplitPane splitter;
	MethodResultPanel resultPanel;

	private JJPanel buttonPanel;

	public MethodsPanel(Object object) throws Exception {
		this(object, false);
	}

	public MethodsPanel(Object object, boolean asClass) throws Exception {
		this(Utility.getCurrentContext(), object, asClass ? (Class) object : null);
	}

	public MethodsPanel(DisplayContext context, Object object, Class objClass) throws Exception {
		this.context = context;
		this.object = object;
		this.objectClass = objClass;
		if (object instanceof Class) {
			objectClass = (Class) object;
			object = null;
		}
		initGUI();
	}

	@Override public void valueChanged(ListSelectionEvent e) {
		Method current = methodList.getSelectedMethod();

		paramPanel.setMethod(current);
		resultPanel.setVisible(current != null);
		if (current != null)
			resultPanel.setResultType(current.getReturnType());
	}

	/**
	 * Executes the given method now
	 */
	private void executeMethod(Method method) throws Exception {
		if (method != null) {
			Object[] params = paramPanel.getValues();
			theLogger.debug("Invoking " + method + " on " + object + " with args " + params);

			Object returnValue = ReflectUtils.invoke(object, method, params);
			resultPanel.setResultValue(returnValue);
		}
	}

	protected void reload() {
		methodList.reload();
	}

	protected void initSubclassGUI() {

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
						return methodList.showNonStatic;
					}

					@Override public void setSelected(boolean b) {
						if (isSelected() == b)
							return;
						methodList.showNonStatic = b;
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
						return methodList.showStatic;
					}

					@Override public void setSelected(boolean b) {
						if (isSelected() == b)
							return;
						methodList.showStatic = b;
						super.setSelected(b);
						reload();
					}
				});
			}
		});

		buttonPanel.add(new JCheckBox("Show Non Public") {
			{
				setModel(new JToggleButton.ToggleButtonModel() {
					@Override public boolean isSelected() {
						return methodList.showNonPublic;
					}

					@Override public void setSelected(boolean b) {
						if (isSelected() == b)
							return;
						methodList.showNonPublic = b;
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
						return methodList.basicBeanInfo;
					}

					@Override public void setSelected(boolean b) {
						if (isSelected() == b)
							return;
						methodList.basicBeanInfo = b;
						super.setSelected(b);
						reload();
					}
				});
				setToolTipText("Only Show non-Enhanced by Appdapter(tm) BeanInfo");

			}
		});
		buttonPanel.add(new SmallObjectView(null, null, object) {
			@Override public boolean isRemovable(Object value) {
				return false;
			}
		});
		removeAll();
		setLayout(new BorderLayout());
		add(BorderLayout.NORTH, buttonPanel);
	}

	private void initGUI() throws Exception {
		paramPanel = new MethodParametersPanel();
		methodList = new MethodList(object, object instanceof Class);
		resultPanel = new MethodResultPanel(context);

		executeButton = new JButton("Execute method");
		executeButton.addActionListener(this);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BorderLayout(10, 10));
		bottomPanel.add("West", executeButton);
		bottomPanel.add("Center", resultPanel);

		JScrollPane scroller = new JScrollPane(methodList);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		splitter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, scroller, paramPanel);

		initSubclassGUI();
		add("Center", splitter);
		add("South", bottomPanel);
		methodList.addListSelectionListener(this);
	}

	@Override public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == executeButton) {
			Method method = methodList.getSelectedMethod();
			if (method != null) {
				try {
					executeMethod(method);
				} catch (InvocationTargetException err) {
					Utility.showError(context, null, err.getTargetException());
				} catch (Throwable err) {
					Utility.showError(context, null, err);
				}
			}
		}
	}
}
