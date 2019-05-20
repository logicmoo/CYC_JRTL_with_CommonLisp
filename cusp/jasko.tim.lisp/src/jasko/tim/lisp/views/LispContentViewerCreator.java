package jasko.tim.lisp.views;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.IViewerCreator;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;


public class LispContentViewerCreator implements IViewerCreator {
	public Viewer createViewer(final Composite parent, final CompareConfiguration mp) {
		return new LispMergeViewer(parent, SWT.NULL, mp);
	}	
}
