package jasko.tim.lisp.inspector;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.views.repl.ReplHistory;

/**
 * So named because it's funnier than InspectorWidget.
 */
public class InspectorGadget extends ReplHistory {

	public InspectorGadget(Composite parent) {
		super(parent);
	}
	
	protected void sendInspect(String id) {
		LispPlugin.getDefault().getCusp().sendInspectInspectedPart(id, new InspectorRunnable());
	}
	
	protected void showInspectableMenu(final InspectableRegion region) {
		Menu menu = new Menu (this.getControl());
		MenuItem inspect = new MenuItem(menu, SWT.PUSH);
		inspect.setText("Inspect");
		inspect.addSelectionListener(new SelectionListener () {
			public void widgetDefaultSelected(SelectionEvent e) {

			}
			public void widgetSelected(SelectionEvent e) {
				sendInspect(region.id);
			}
		});
		menu.setVisible(true);
	}
	
}
