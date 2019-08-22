package com.netbreeze.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.Customizer;
import java.beans.PropertyChangeListener;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;

import org.logicmoo.bb.BeansContext;

import com.netbreeze.util.Utility;

/**
 * A panel containing a complete GUI for a bean, including properties, methods,
 * etc.
 * <p>
 *
 * @author Henrik Kniberg
 */
public class LargeBeanView extends BeanView implements Customizer {
	protected BeansContext context;
	protected JTabbedPane tabs;

	public LargeBeanView(BeansContext context, Object bean) {
		super(bean);
		this.context = context;
		initGUI();
	}

	public LargeBeanView(Object bean) {
		this(SwingEnvironment.getBeansContext(), bean);
	}

	public LargeBeanView() {
		this(null);
	}

	@Override
	public Dimension getPreferredSize() {
		/*
		 * Dimension dim = super.getPreferredSize(); int w,h; w =
		 * Math.min(dim.width + 30, 350); h = Math.min(dim.height + 30, 500);
		 */
		return Utility.getConstrainedDimension(getMinimumSize(), super.getPreferredSize(), getMaximumSize());
	}

	@Override
	public Dimension getMinimumSize() {
		return new Dimension(400, 350);
	}

	@Override
	public Dimension getMaximumSize() {
		return new Dimension(800, 600); // Toolkit.getDefaultToolkit().getScreenSize();
	}

	/**
	 * Delegates directly to setBean(...). This method is needed to conform to
	 * the Customizer interface.
	 */
	@Override
	public void setObject(Object o) {
		setBean(o);
	}

	/**
	 * This method is needed to conform to the Customizer interface. It doesn't
	 * do anything yet.
	 */
	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
	}

	/**
	 * This method is needed to conform to the Customizer interface. It doesn't
	 * do anything yet.
	 */
	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
	}

	@Override
	protected void beanChanged(Object oldBean, Object newBean) {
		removeAll();
		initGUI();
	}

	protected void initGUI() {
		tabs = new JTabbedPane();

		Object bean = getBean();

		if (bean != null) {
			PropertiesPanel props = new PropertiesPanel(context, bean);
			tabs.addTab("Properties", props);

			try {
				MethodsPanel methods = new MethodsPanel(context, bean);
				tabs.addTab("Methods", methods);
			} catch (Exception err) {
				tabs.addTab("Methods", new ErrorPanel("Could not show methods", err));
			}

			setLayout(new BorderLayout());
			add("Center", tabs);
		} else {
			add(new JLabel("null"));
		}
	}
}