package jasko.tim.lisp.views;

import jasko.tim.lisp.CuspResources;
import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.cusp.*;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.*;

public class TestsView extends ViewPart {
	public static final String ID = "jasko.tim.lisp.views.TestsView";

	private StyledText output;
	private Action runTestsButton;
	
	public static TestsView getTestsView() {
		IWorkbenchPage page = PlatformUI.getWorkbench()
		    .getActiveWorkbenchWindow().getActivePage();
		try {
			IViewPart view = page.showView(TestsView.ID);
			if (view != null && view instanceof TestsView) {
				TestsView me = (TestsView) view;
				return me;
			} else {
				return null;
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void showTestsView(LispNode contents) {
		IWorkbenchPage page = PlatformUI.getWorkbench()
		    .getActiveWorkbenchWindow().getActivePage();
		try {
			IViewPart view = page.showView(TestsView.ID);
			if (view != null && view instanceof TestsView) {
				TestsView me = (TestsView) view;
				me.populate(contents);
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
	
	private void populate(LispNode contents){
		output.setRedraw(false);
		String str = /*contents.get(1).value*/contents.toString();
		output.setText(str);
		int ind = 0;
		int len = "failed".length();
		Display display = TestsView.this.getSite().getShell().getDisplay();
		while( ind >= 0 ){ //failed
			ind = str.indexOf("failed",ind);
			if( ind >= 0 ){
				StyleRange style = new StyleRange();
				style.start = ind;
				style.length = len;
				style.foreground = display.getSystemColor(SWT.COLOR_RED);
				style.fontStyle = SWT.BOLD;
				output.setStyleRange(style);
				ind += len;
			}
		}
		ind = 0;
		len = "passed".length();
		while( ind >= 0 ){ //failed
			ind = str.indexOf("passed",ind);
			if( ind >= 0 ){
				StyleRange style = new StyleRange();
				style.start = ind;
				style.length = len;
				style.foreground = display.getSystemColor(SWT.COLOR_GREEN);
				style.fontStyle = SWT.BOLD;
				output.setStyleRange(style);
				ind += len;
			}
		}
		output.setRedraw(true);
	}

	protected void fillNormalToolBar() {
		if (runTestsButton != null) {
			IToolBarManager tbm = 
				this.getViewSite().getActionBars().getToolBarManager();
			
			tbm.removeAll();
			tbm.add(runTestsButton);
			tbm.update(true);
			CuspInterface cusp = LispPlugin.getDefault().getCusp();
			if ( cusp != null ){
			//	runTestsButton.setEnabled(cusp.useUnitTest);
			}
		}
	}
	
	protected void fillToolBar(Composite parent) {
		
		runTestsButton = new TestAction(getSite().getShell()); 
		runTestsButton.setImageDescriptor(
				CuspResources.getImageDescriptor(CuspResources.RUN_TESTS));
		runTestsButton.setToolTipText("Run tests");
		
		this.fillNormalToolBar();
	}

	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(1, false);
		layout.marginLeft = 1;
		layout.marginTop = 1;
		layout.marginRight = 1;
		layout.marginBottom = 1;
		parent.setLayout(layout);
		
		GridData gd;
 		
 		output = new StyledText(parent, SWT.WRAP | SWT.V_SCROLL | SWT.BORDER | SWT.MULTI);
 		gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.verticalAlignment = GridData.FILL;
 		gd.grabExcessHorizontalSpace = true;
 		gd.grabExcessVerticalSpace = true;
 		output.setLayoutData(gd);
 		output.setEditable(false);

 		fillToolBar(parent);
 	}

	@Override
	public void setFocus() {
	}

}
