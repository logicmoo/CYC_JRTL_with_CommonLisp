package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.util.*;
import jasko.tim.lisp.views.ReplView;
import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.builder.*;

import org.eclipse.jface.text.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.*;

public class FileCompiler {

	public static void compileString(ILispEditor editor, boolean switchToRepl) {
		IDocument doc = editor.getDocument();

		if (LispUtil.doParensBalance(doc)||!LispPlugin.getStore().getBoolean(PreferenceConstants.SHOW_ECLIPSE_COMPILE_WARNING_DIALOG)) {

			ITextSelection ts = (ITextSelection) editor.getSelectionProvider().getSelection();
			int offset = ts.getOffset();

			String exp = LispUtil.getTopLevelExpression(doc, offset);
			int topLevelOffset = LispUtil.getTopLevelOffset(doc, offset);

			LispBuilder.compileFilePart(editor.getIFile(), exp, topLevelOffset);
			if (switchToRepl) {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					page.showView(ReplView.ID);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		} else {
			/*MessageBox mbox = new MessageBox(editor.getTextWidget().getShell(),
					SWT.CANCEL | SWT.ICON_ERROR | SWT.APPLICATION_MODAL);
			mbox.setText(")Mismatch(");
			mbox.setMessage("Your parentheses are not balanced");
			mbox.open();*/
			FileCompileDialog dialog = new FileCompileDialog(LispPlugin.getActiveShell(),"Your parentheses are not balanced");
			dialog.open();
			boolean ignore = dialog.ignoreIt;	
			if (!ignore) return;
		}
	}


	public static void compileFile(ILispEditor editor, boolean switchToRepl) {
		if(editor instanceof LispEditor)
		{
			((LispEditor)editor).doSaveNoCompile();
		}
		boolean cancompile = LispBuilder.checkLisp(editor.getIFile());

		if(!cancompile&&LispPlugin.getStore().getBoolean(PreferenceConstants.SHOW_ECLIPSE_COMPILE_WARNING_DIALOG)){
			FileCompileDialog dialog = new FileCompileDialog(LispPlugin.getActiveShell(),"Project Errors");
			dialog.open();
			boolean ignore = dialog.ignoreIt;
			if (!ignore) return;
		}

		LispBuilder.compileFile(editor.getIFile(),true);
		if (switchToRepl) {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			try {
				page.showView(ReplView.ID);
			} catch (PartInitException e) {
				e.printStackTrace();
			}		
		}
	}
}
