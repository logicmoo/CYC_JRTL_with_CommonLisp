/**
 * 
 */
package jasko.tim.lisp.views;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.cusp.CuspInterface;
import jasko.tim.lisp.views.repl.PackageDialog;

import java.util.ArrayList;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Shell;

/**
 * @author sk
 *
 */
public class TestAction extends Action {
	private Shell shell;
	public TestAction(Shell shell){
		super("Run Tests");
		this.shell = shell;
	}

	public void run() {
		CuspInterface cusp = LispPlugin.getDefault().getCusp();
		String hasunit = cusp.sendEvalAndGrab("(some #'(lambda (x) " +
				"(equal \"LISP-UNIT\" (package-name x))) (list-all-packages))", 1000);
		if( cusp != null && "T".equalsIgnoreCase(hasunit) && cusp.getUseUnitTest() ){
			PackageDialog pd = 
				new PackageDialog(shell,
						cusp.getPackagesWithTests(1000), 
						cusp.getlastTestPackage(),true);
			if (pd.open() == Dialog.OK) {
				cusp.sendRunTests(pd.getPackage(), new TestsRunnable());
			}					
		} else {
			ArrayList<String> strings = new ArrayList<String>(2);
			strings.add("Cannot run tests,");
		}
	}
}
