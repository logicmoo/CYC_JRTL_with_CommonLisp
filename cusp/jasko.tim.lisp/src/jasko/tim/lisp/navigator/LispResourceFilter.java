package jasko.tim.lisp.navigator;

import org.eclipse.core.resources.*;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.views.navigator.ResourcePatternFilter;
import jasko.tim.lisp.cusp.LispImplementation;


public class LispResourceFilter extends ResourcePatternFilter {
	
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (element instanceof IFile) {
			IFile file = (IFile) element;
			String fileName = file.getName();
		
			if (fileName.equals(".project")
					|| fileName.equals(".DS_Store")
					|| fileName.endsWith("~")
					|| LispImplementation.isCompilerOutput(fileName)) {
				return false;
			}
		} else if (element instanceof IResource) {
			IResource res = (IResource) element;
			String name = res.getName();
			if (name.equals(".svn")) {
				return false;
			}
		}
		
		return true;
	}

}
