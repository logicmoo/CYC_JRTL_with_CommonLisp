package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.cusp.*;

import java.util.*;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

public class FindDefinitionAction extends LispAction {
	
	private Shell shell;
	
	public FindDefinitionAction(){}
	
	public FindDefinitionAction(ILispEditor editor) {
		super(editor);
	}

	
	public void run() {
		String symbol = getSymbol();
		
		if (!symbol.equals("")) {
			getCusp().sendFindDefinitions(symbol, getPackage(), new OpenDefinitionRunnable(symbol));
		}
		
	}

    public void setActiveEditor(IAction action, IEditorPart targetEditor) {
        editor = (ILispEditor)targetEditor;
		shell = null;
		if( editor == null ){
			//shell = editor.getTextWidget().getShell();
		} else {
			shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		}
    }
    
	
	private class OpenDefinitionRunnable extends CuspRunnable {
		private String symbol;
		
		public OpenDefinitionRunnable(String symbol) {
			this.symbol = symbol;
		}
		public void run() {
			LispNode guts = result.getf(":return").getf(":ok");
			ArrayList<String> names = new ArrayList<String>(guts.params.size());
			ArrayList<LispNode> data = new ArrayList<LispNode>(guts.params.size());
			ArrayList<String> tips = new ArrayList<String>(guts.params.size());
			for (LispNode possibility: guts.params) {
				String name = possibility.get(0).value;
				names.add(name);
				data.add(possibility);
				if (possibility.get(1).get(0).value.equalsIgnoreCase(":error")) {
					tips.add(possibility.get(1).get(1).value);
				} else {
					tips.add(possibility.get(1).getf(":file").value);
				}
			}
			
			LispNode chosen;
			
			if (names.size() <= 0) {
				showMessage("Unable to find definitions");
				return;
			} else if (names.size() == 1) {
				chosen = data.get(0);
			} else {
				ListDialog<LispNode> win = new ListDialog<LispNode>(shell,
						names, data, tips);
				win.create();
				win.setTitle("Definitions");
				
				if (names.get(0).startsWith("(DEFGENERIC")) {
					win.setSelection(1);
				} else {
					win.setSelection(0);
				}
				
				if (win.open() == Dialog.OK) {
					chosen = win.getData();
				} else {
					return;
				}
			}
			System.out.println("*chosen: " +  chosen);
			LispNode location = chosen.get(1);
			System.out.println(location);
			if (location.get(0).value.equalsIgnoreCase(":error")) {
				editor.showMessage(location.getf(":error").value);
				return;
			}
			String path = location.getf(":file").value;
			if (path.equals("")) {
				path = location.getf(":buffer").value;
			}
			int position = location.getf(":position").asInt();
			String snippet = location.getf(":snippet").value;
			
			path = getCusp().translateRemoteFilePath(path);
			
			LispEditor.jumpToDefinition(path, position, snippet, symbol);
			
		}
	}
	
	public void showMessage(String msg) {
		if( editor == null ){
			MessageBox mb = new MessageBox(shell, SWT.OK);
		    mb.setText("Find definitions:");
		    mb.setMessage(msg);
		    mb.open();
		} else {
			editor.showMessage(msg);
		}
	}


}
