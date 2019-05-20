package jasko.tim.lisp.views;

import jasko.tim.lisp.*;
import jasko.tim.lisp.cusp.*;

import org.eclipse.jface.action.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.part.ViewPart;

public class ThreadView extends ViewPart {
	public static final String ID = "jasko.tim.lisp.views.ThreadView";
	
	private Tree threadTree;

	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(1, false);
		layout.marginLeft = 1;
		layout.marginTop = 1;
		layout.marginRight = 1;
		layout.marginBottom = 1;
		parent.setLayout(layout);
		
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.verticalAlignment = GridData.FILL;
 		gd.grabExcessHorizontalSpace = true;
 		gd.grabExcessVerticalSpace = true;
 		
 		threadTree = new Tree(parent, SWT.BORDER | SWT.FULL_SELECTION);
 		threadTree.setLayoutData(gd);
 		threadTree.setHeaderVisible(true);
 		
 		TreeColumn col0 = new TreeColumn(threadTree, SWT.LEFT);
 		col0.setText("Num");
 		col0.setWidth(50);
 		TreeColumn col1 = new TreeColumn(threadTree, SWT.LEFT);
 		col1.setText("Thread");
 		col1.setWidth(200);
 		TreeColumn col2 = new TreeColumn(threadTree, SWT.LEFT);
 		col2.setText("Status");
 		col2.setWidth(200);
 		TreeColumn col3 = new TreeColumn(threadTree, SWT.LEFT);
 		col3.setText("Location");
 		col3.setWidth(200);
 		
 		fillToolBar(parent);
	}
	private Action killBtn;
	private Action debugBtn;
	private Action refreshBtn;
	
	private String getSelectedThread() {
		TreeItem[] sel = threadTree.getSelection();
		if (sel.length > 0) {
			if (sel[0].getData() != null) {
				return sel[0].getData().toString();
			}
		}
		return null;
	}
	
	protected void fillToolBar(Composite parent) {
		IToolBarManager tbm = this.getViewSite().getActionBars().getToolBarManager();
		
		debugBtn = new Action("Debug thread") {
			public void run() {
				String thread = getSelectedThread();
				if (thread != null) {
					CuspInterface cusp = LispPlugin.getDefault().getCusp();
					cusp.sendDebugThread(thread, new CuspRunnable() {
						public void run() {
							ReplView.switchToRepl();
						}
					});
				}
			}
		};
		debugBtn.setImageDescriptor(CuspResources.getImageDescriptor(CuspResources.THREAD_DEBUG));
		debugBtn.setToolTipText("Debug thread");
		
		tbm.add(debugBtn);
		
		
		killBtn = new Action("Kill thread") {
			public void run() {
				String thread = getSelectedThread();
				if (thread != null) {
					CuspInterface cusp = LispPlugin.getDefault().getCusp();
					cusp.sendKillThread(thread, new CuspRunnable() {
						public void run() {
							refreshThreads();
						}
					});
				}
			}
		};
		killBtn.setImageDescriptor(CuspResources.getImageDescriptor(CuspResources.THREAD_KILL));
		killBtn.setToolTipText("Kill thread");
		
		tbm.add(killBtn);
		
		
		refreshBtn = new Action("Refresh") {
			public void run() {
				refreshThreads();
			}
		};
		refreshBtn.setImageDescriptor(CuspResources.getImageDescriptor(CuspResources.REFRESH));
		refreshBtn.setToolTipText("Refresh");
		
		tbm.add(refreshBtn);
	}

	public void setFocus() {
		refreshThreads();
	}
	
	private void refreshThreads() {
		CuspInterface cusp = LispPlugin.getDefault().getCusp();
		
		if ( !cusp.implementation.hasThreads() ){
			threadTree.removeAll();
			TreeItem item = new TreeItem(threadTree,0);
			item.setText(new String[] {"","This CL implementation does not support threads",""});
			item.setData(0);
			return;
		}
		
		cusp.sendListThreads(new CuspRunnable() {
			public void run() {
				threadTree.removeAll();
				LispNode threads = this.getReturn();
				for (int i=0; i < threads.params.size(); ++i) {
					LispNode thread = threads.get(i);
					
					String num = thread.get(0).value;
					String name = thread.get(1).value;
					String status = thread.get(2).value;
					String location = thread.get(3).value;
					
					TreeItem item = new TreeItem(threadTree, 0);
					item.setText(new String[] {num, name, status, location});
					item.setData(i);
				}
			}
		});
	}

}
