package jasko.tim.lisp.editors.actions;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.editors.LispSelectionMixin;
import jasko.tim.lisp.editors.LispSelectionMixin.SelectionPosition;
import jasko.tim.lisp.util.LispUtil;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.*;
import org.eclipse.ui.IEditorPart;

public class ExpandSelectionAction extends LispAction {

	private ILispEditor editor;
	public ExpandSelectionAction () {}

	public ExpandSelectionAction (ILispEditor editor) {
		this.editor = editor;
	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		editor = (ILispEditor)targetEditor;
	}



	public void run () {
		ITextSelection ts = (ITextSelection) editor.getSelectionProvider().getSelection();
		int offset = ts.getOffset();
		IDocument doc = editor.getDocument();
		int[] range = null;

		if (ts.getLength() == 0) {
			try {
				if (doc.getChar(offset) == '(' || doc.getChar(offset - 1) == ')') {
					range = LispUtil.getCurrentExpressionRange(doc, offset);
				} else {
					range = LispUtil.getCurrentFullWordRange(doc, offset, false);
				}
			} catch (BadLocationException ex) {
				ex.printStackTrace();
			}

			if (range != null) {
				editor.addHistory(new SelectionPosition(range,ts.getOffset(),ts.getLength()));
				editor.getSelectionProvider().setSelection(new TextSelection(doc, range[0], range[1]));
		
				editor.flagSelectionAction();
				return;
			} else {
				// attempt to select current full s-expression below -- this will happen if the cursor is in a
				// block of whitespace that is within an s-expression, for example
			}
		}

		range = LispUtil.getCurrentFullExpressionRange(doc, offset, ts.getLength());
		if (range != null) {
			editor.addHistory(new SelectionPosition(range,ts.getOffset(),ts.getLength()));
			editor.getSelectionProvider().setSelection(new TextSelection(doc, range[0], range[1]));
		}
		editor.flagSelectionAction(); //TODO: Gorsal - why does it always change highlighting?
	}
}


