package jasko.tim.lisp.navigator;


import jasko.tim.lisp.LispPlugin;

import org.eclipse.core.resources.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.views.navigator.*;
import org.eclipse.core.resources.IProject;


/**
 * Displays Resources in a Lispy way.
 *  Currently, that just means filtering out certain files.
 * @author Tim
 *
 */
public class LispNavigator extends ResourceNavigator implements IResourceChangeListener {
	public static final String ID = "jasko.tim.lisp.navigator.LispNavigator";
	
	
	public LispNavigator() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this,
				IResourceChangeEvent.POST_BUILD);
		
	}
	
	public IContainer getSelectedContainer ()  {
		ISelection s  = getSite().getWorkbenchWindow()
						.getSelectionService().getSelection();
		if (s instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection)s;
			if (selection!=null) {
				Object sel = selection.getFirstElement();
				if (sel instanceof IContainer)
					return (IContainer)sel;
			}
		}
		return null;
	}
	
	public void resourceChanged(IResourceChangeEvent event) {
		if (event.getType() == IResourceChangeEvent.POST_BUILD) {
			Display.getDefault().asyncExec( new Runnable() {
					@SuppressWarnings("deprecation")
					public void run() {
						try {
						TreeViewer viewer = getViewer();
						viewer.refresh(true);
						} catch (Exception e) { //if it is blocked during startup?, getViewer() returns null 
							e.printStackTrace();
						}
					}
			});		
		} 
	}
	
	protected void initFilters(TreeViewer viewer) {
		viewer.addFilter(new LispResourceFilter());
	}
	
	@SuppressWarnings("deprecation")
	protected void initLabelProvider(TreeViewer viewer) {
		super.initLabelProvider(viewer);
	}
}
