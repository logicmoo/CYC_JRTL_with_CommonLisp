package jasko.tim.lisp.navigator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jasko.tim.lisp.LispPlugin;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IActionFilter;
import org.eclipse.ui.IWorkbench;

public class UnlinkFileAction  implements IActionDelegate {
	IStructuredSelection selection;

	public void selectionChanged(IAction action, ISelection selection) {
		if(selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		}
	}

	public void run(IAction action) {
		if (selection != null && selection.isEmpty() == false 
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IFile) {
				IFile file = (IFile) obj;
				if(file.getResourceAttributes().isSymbolicLink() ){
					file.getResourceAttributes().setSymbolicLink(false );
				}
			}
		}
	}

	 static class AdaptableFile extends File implements IAdaptable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public AdaptableFile(String arg0) {
			super(arg0);
			// TODO Auto-generated constructor stub
		}

		
		public Object getAdapter(Class adapter) {
			// TODO Auto-generated method stub
			if (adapter==IActionFilter.class) {
				return UnlinkActionFilter.getSingleton();
			}
			return null;
		}

		
}

	
	
	public static class UnlinkActionFilter implements IActionFilter {

		public static final String NAME = "name";        
		private static UnlinkActionFilter singleton;

		public static UnlinkActionFilter getSingleton() {
			if (singleton == null)
				singleton = new UnlinkActionFilter();
			return singleton;
		}

		/**
		 * @see IActionFilter#testAttribute(Object, String, String)
		 */
		public boolean testAttribute(Object target, String name, String value) {
			IFile le = (IFile)target;
			if (le.getRawLocation().equals(le.getFullPath()))
				return true;      
			return false;
		}
	}
	
}


