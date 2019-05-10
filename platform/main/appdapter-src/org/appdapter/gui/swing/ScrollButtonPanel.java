package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class ScrollButtonPanel extends JJPanel implements ActionListener {

	public final static int INCREMENT = ActionEvent.ACTION_FIRST;
	public final static int DECREMENT = INCREMENT + 1;

	public static final int VERTICAL = 0;
	public static final int HORIZONTAL = 1;

	Vector listeners = new Vector();

	ArrowButton incButton;
	ArrowButton decButton;
	Component target;
	int width;
	int height;
	int orientation;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		frame.getContentPane().setLayout(new BorderLayout());
		JTextField text = new JTextField(10);
		frame.getContentPane().add("Center", text);
		frame.getContentPane().add("East", new ScrollButtonPanel(text));
		frame.pack();
		frame.show();
	}

	public ScrollButtonPanel() {
		this(null);
	}

	public ScrollButtonPanel(Component target) {
		this(target, 15, VERTICAL);
	}

	public ScrollButtonPanel(Component target, int width, int orientation) {
		this.target = target;
		this.height = 10;
		this.width = width;
		this.orientation = orientation;
		initGUI(orientation);
	}

	public void addActionListener(ActionListener l) {
		listeners.addElement(l);
	}

	public void removeActionListener(ActionListener l) {
		listeners.removeElement(l);
	}

	@Override public void actionPerformed(ActionEvent evt) {
		ActionEvent evt2 = null;
		if (evt.getSource() == incButton) {
			evt2 = new ActionEvent(this, INCREMENT, "increment");
		} else if (evt.getSource() == decButton) {
			evt2 = new ActionEvent(this, DECREMENT, "decrement");
		}
		if (evt2 != null) {
			Enumeration enum0 = listeners.elements();
			while (enum0.hasMoreElements()) {
				((ActionListener) enum0.nextElement()).actionPerformed(evt2);
			}
		}
	}

	public JButton getIncButton() {
		return incButton;
	}

	public JButton getDecButton() {
		return decButton;
	}

	@Override public Dimension getPreferredSize() {
		int w, h;
		w = width;
		if (target == null)
			h = height;
		else
			h = target.getSize().height;
		return new Dimension(w, h);
	}

	@Override public Dimension getMinimumSize() {
		return getPreferredSize();
	}

	void initGUI(int orientation) {
		if (orientation == VERTICAL) {
			this.incButton = new ArrowButton(Color.black, Color.blue, ArrowButton.UP);
			this.decButton = new ArrowButton(Color.black, Color.blue, ArrowButton.DOWN);
			setLayout(new GridLayout(2, 1));
		} else {
			this.incButton = new ArrowButton(Color.black, Color.blue, ArrowButton.RIGHT);
			this.decButton = new ArrowButton(Color.black, Color.blue, ArrowButton.LEFT);
			setLayout(new GridLayout(1, 2));
		}
		add(incButton);
		add(decButton);
		incButton.addActionListener(this);
		decButton.addActionListener(this);
	}
}