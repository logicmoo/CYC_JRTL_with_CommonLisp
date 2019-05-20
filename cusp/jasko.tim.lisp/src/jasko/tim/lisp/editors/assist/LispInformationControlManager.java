package jasko.tim.lisp.editors.assist;

import jasko.tim.lisp.editors.*;

import org.eclipse.jface.text.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.Shell;

/**
 * This class exists for the purposes of rendering that yellow information box we 
 *  pop up for macro expansions and similar fun.
 * @author Tim Jasko
 *
 */
public class LispInformationControlManager extends AbstractInformationControlManager {
	LispEditor editor;

	public LispInformationControlManager(LispEditor editor) {
		super(new LispInformationControlCreator());
		this.takesFocusWhenVisible(true);
		this.editor = editor;
		//EDIT: originally, this.setCloser(new InfoControlCloser()) was called. However, the
		//DefaultInformationControl created by the class LispInformationControlCreator
		//includes a default IInformationControlCloser implementation!
	}
	
	private String text;
	public void setText(String txt) {
		text = txt;
	}
	
	private Point location;
	public void setLocation(Point loc) {
		location = loc;
	}
	
	@Override
	protected void computeInformation() {
		
		setInformation(text, new Rectangle(location.x, location.y, 10, 10));

	}

	
	
	/**
	 * Closes the Tooltip when it loses focus,
	 *  and returns that focus back to the editor
	 * @author Tim Jasko
	 *
	 */
	/*
	//NOTICE:Below class is redundant for reason above but is included for reference
	//(even though it does nothing!!!
	public static class InfoControlCloser implements IInformationControlCloser,
		DisposeListener, FocusListener {
		
		IInformationControl control;
		Control parent;

		public void setSubjectControl(Control subject) {
			parent = subject;
		}

		public void setInformationControl(IInformationControl control) {
			this.control = control;
		}

		public void start(Rectangle subjectArea) {
			control.addDisposeListener(this);
			control.addFocusListener(this);
		}

		public void stop() {
		}
		
		public void widgetDisposed(DisposeEvent e) {
			parent.setFocus();
		}

		public void focusGained(FocusEvent e) {
		}
		

		public void focusLost(FocusEvent e) {
			//EDIT: control.dispose() was causing error!
			//The DefaultInformationControl takes care of closing itself, not this!
			//control.dispose();
		}
	}
	
	*/
	/**
	 * Creates the InformationControl.
	 *  I don't know why the interface calls for this class, but it does.
	 * @author Tim Jasko
	 *
	 */
	public static class LispInformationControlCreator implements IInformationControlCreator {
		public IInformationControl createInformationControl(Shell parent) {
			return new DefaultInformationControl(parent);
		}

	}
}
