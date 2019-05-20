package jasko.tim.lisp.views;

import jasko.tim.lisp.*;
import jasko.tim.lisp.cusp.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.part.*;

public class AproposView extends ViewPart implements KeyListener {
	public static final String ID = "jasko.tim.lisp.views.AproposView";
	
	private Text input;
	private StyledText output;

	
	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(1, false);
		layout.marginLeft = 1;
		layout.marginTop = 1;
		layout.marginRight = 1;
		layout.marginBottom = 1;
		parent.setLayout(layout);
		
		GridData gd;
 		
 		
 		input = new Text(parent, SWT.BORDER | SWT.SINGLE);
 		gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
 		gd.grabExcessHorizontalSpace = true;
 		gd.grabExcessVerticalSpace = false;
 		input.setLayoutData(gd);
 		
 		input.addKeyListener(this);
 		
 		output = new StyledText(parent, SWT.WRAP | SWT.V_SCROLL | SWT.BORDER | SWT.MULTI);
 		gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.verticalAlignment = GridData.FILL;
 		gd.grabExcessHorizontalSpace = true;
 		gd.grabExcessVerticalSpace = true;
 		output.setLayoutData(gd);
 		output.setEditable(false);
	}

	@Override
	public void setFocus() {
		input.setFocus();
		input.selectAll();
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
		if (e.character == '\r') {
			e.doit = false;
			LispPlugin.getDefault().getCusp().sendApropos(
					input.getText(), new AproposRunnable());
			input.selectAll();
		}
	}
	
	private class AproposRunnable extends CuspRunnable {

		private void showProp(LispNode n, String key, String display) {
			String val = n.getf(key).value;
			if (!val.equals("")) {
				output.append("  ");
				int offset = output.getText().length();
				
				StyleRange style = new StyleRange();
				style.fontStyle = SWT.ITALIC;
				style.start = offset;
				style.length = display.length();
				output.append(display + ": ");
				output.setStyleRange(style);
				
				
				
				if (val.equalsIgnoreCase(":not-documented")) {
					output.append("(Not documented)");
				} else {
					output.append(val);
				}
				output.append("\n");
			}
		}
		
		public void run() {
			output.setRedraw(false);
			LispNode contents = result.getf(":return").getf(":ok");
			output.setText("");
			for (LispNode n: contents.params) {
				String name = n.getf(":designator").value;
				int offset = output.getText().length();
				StyleRange style = new StyleRange();
				style.fontStyle = SWT.BOLD;
				style.start = offset;
				style.length = name.length();
				output.append(name);
				output.setStyleRange(style);

				output.append("\n");
				
				showProp(n, ":variable", "Variable");
				showProp(n, ":function", "Function");
				showProp(n, ":macro", "Macro");
				showProp(n, ":setf", "Setf");
				showProp(n, ":generic-function", "Generic Function");
			}
			
			if( contents.params.size() == 0 ){
				output.append("No results for " + input.getText() + "\n");
			}
			
			output.setRedraw(true);
		}
	}

}
