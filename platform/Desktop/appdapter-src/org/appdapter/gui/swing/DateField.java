package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.appdapter.core.convert.NoSuchConversionException;
import org.appdapter.gui.browse.Utility;

/**
* A textfield for handling dates.  Displays date in short format according to
* local settings, and makes sure a valid date is entered.  This component takes
* care of all the "dirty details" - just use getDate() to find out the current
* date represented. <BR>
*<BR>
* The up and down arrow keys can be used to increment or decrement the day, and
* PageUp/PageDown can be used to increment or decrement the month.
*
* @author Henrik
* @version 1.0
*/
public class DateField extends JVPanel implements KeyListener, ActionListener, FocusListener {

	static public Class TYPE = Date.class;

	@Override public Date getValue() {
		return getDate();
	}

	@Override public void setObject(Object obj) throws InvocationTargetException, NoSuchConversionException {
		setDate(Utility.recast(obj, Date.class));
	}

	/**
	* Property constant (used in PropertyChangeEvents)
	*/
	public static final String PROP_DATE = "date";

	JTextField textfield;
	Calendar calendar;
	ScrollButtonPanel scrollPanel;

	Date defaultDate;
	Date date;
	DateFormat dateFormat;

	PropertyChangeSupport propSupport = new PropertyChangeSupport(this);

	boolean scroller;
	boolean mandatory = false;
	boolean validate = false;

	/**
	* Creates a DateField with no default value and no scroller buttons
	*/
	public DateField() {
		this(null, true);
	}

	/**
	* Creates a DateField with the given date and no scroller buttons
	*/
	public DateField(Date d) {
		this(d, true);
	}

	/**
	* Creates a DateField with scroller buttons but no default date
	*/
	public DateField(boolean scroller) {
		this(null, scroller);
	}

	/**
	* Creates a DateField with the given default date.
	* @param date the default date
	* @scroller true if you want +/- scroller buttons
	*/
	public DateField(Date date, boolean scroller) {
		this.scroller = scroller;
		init();
		defaultDate = date;
		restoreDefault();
		updateLayout();
	}

	/**
	* All PropertyChangeListeners will receive property change events
	* when the date changes.
	*/
	@Override public void addPropertyChangeListener(PropertyChangeListener p) {
		propSupport.addPropertyChangeListener(p);
	}

	@Override public void removePropertyChangeListener(PropertyChangeListener p) {
		propSupport.removePropertyChangeListener(p);
	}

	/**
	* Restores the date to the default value
	*/
	public void restoreDefault() {
		setDate(defaultDate);
	}

	/**
	* Sets a new date
	*/
	public void setDate(Date newValue) {
		Date oldValue = date;
		date = newValue;
		displayDate();
		propSupport.firePropertyChange(PROP_DATE, oldValue, newValue);
	}

	/**
	* Gets the current date.  Returns null if the date is invalid or
	* the field empty.
	*/
	public Date getDate() {
		return date;
	}

	/**
	* True if a scroller is currently displayed
	*/
	public boolean getScroller() {
		return scroller;
	}

	/**
	* Event handling routine
	*/
	@Override public void actionPerformed(ActionEvent e) {
		if (textfield.isEditable() && e.getSource() == scrollPanel) {
			if (e.getID() == ScrollButtonPanel.DECREMENT)
				prevDay();
			else if (e.getID() == ScrollButtonPanel.INCREMENT)
				nextDay();
		}
	}

	/**
	* Event handling routine
	*/
	@Override public void focusGained(FocusEvent evt) {
	}

	/**
	* Event handling routine
	*/
	@Override public void focusLost(FocusEvent evt) {
		String entry = textfield.getText();
		if (entry.equals("") || entry == null) {
			setDate(null);
		} else {
			try {
				Date newDate = dateFormat.parse(entry);
				if (newDate == null)
					displayDate();
				else
					setDate(newDate);
			} catch (Exception err) {
				displayDate();
			}
		}
	}

	/**
	* Event handling routine
	*/
	@Override public void keyPressed(KeyEvent e) {
		if (textfield.isEditable()) {
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				nextDay();
				e.consume();
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				prevDay();
				e.consume();
			} else if (e.getKeyCode() == KeyEvent.VK_PAGE_UP) {
				nextMonth();
				e.consume();
			} else if (e.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
				prevMonth();
				e.consume();
			} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				displayDate();
				e.consume();
			} else if (Character.isLetter(e.getKeyChar())) {
				e.consume();
			}
		}
	}

	/**
	* Event handling routine
	*/
	@Override public void keyReleased(KeyEvent e) {
	}

	/**
	* Event handling routine
	*/
	@Override public void keyTyped(KeyEvent e) {
	}

	/**
	* Sets whether this DateField should be editable or not.
	*/
	public void setEditable(boolean b) {
		textfield.setEditable(b);
		scrollPanel.setEnabled(b);
	}

	void prevDay() {
		if (date != null) {
			calendar.setTime(date);
			calendar.add(Calendar.DATE, -1);
			setDate(calendar.getTime());
		} else {
			setDate(new Date());
		}
	}

	void nextDay() {
		if (date != null) {
			calendar.setTime(date);
			calendar.add(Calendar.DATE, 1);
			setDate(calendar.getTime());
		} else {
			setDate(new Date());
		}
	}

	void prevMonth() {
		if (date != null) {
			calendar.setTime(date);
			calendar.add(Calendar.MONTH, -1);
			setDate(calendar.getTime());
		} else {
			setDate(new Date());
		}
	}

	void nextMonth() {
		if (date != null) {
			calendar.setTime(date);
			calendar.add(Calendar.MONTH, 1);
			setDate(calendar.getTime());
		} else {
			setDate(new Date());
		}
	}

	void displayDate() {
		if (date == null) {
			textfield.setText("");
		} else {
			textfield.setText(dateFormat.format(date));
		}
	}

	void init() {
		calendar = new GregorianCalendar();
		dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		dateFormat.setLenient(true);

		textfield = new JTextField(10);
		scrollPanel = new ScrollButtonPanel(textfield);
		displayDate();

		scrollPanel.addActionListener(this);
		scrollPanel.getDecButton().addKeyListener(this);
		scrollPanel.getIncButton().addKeyListener(this);
		textfield.addKeyListener(this);
		textfield.addFocusListener(this);
	}

	void updateLayout() {
		removeAll();
		setLayout(new BorderLayout());
		add("Center", textfield);

		if (scroller) {
			add("East", scrollPanel);
		}
	}

	public static void main(String args[]) {
		JFrame f = new JFrame();
		f.getContentPane().setLayout(new FlowLayout());
		f.getContentPane().setBackground(SystemColor.control);
		DateField field = new DateField(new Date(), true);
		Font font = new Font("SansSerif", Font.PLAIN, 24);
		field.setFont(font);
		f.getContentPane().add(field);
		f.getContentPane().add(new JButton("OK"));
		f.pack();
		f.show();
		field.setEditable(true);
		/*Date d = new Date();
		Calendar c = new GregorianCalendar();
		c.setTime(d);
		System.out.println(c.get(Calendar.YEAR) + "/" +  c.get(Calendar.MONTH) + "/" + c.get(Calendar.DAY_OF_MONTH));*/
	}

}
