package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.editors.ILispEditor;
import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.cusp.CuspInterface;
import jasko.tim.lisp.util.LispUtil;
import jasko.tim.lisp.views.ReplView;

import org.eclipse.jface.action.*;
import org.eclipse.jface.text.*;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.*;

public abstract class LispAction extends Action implements IEditorActionDelegate {
	protected ILispEditor editor;

	public LispAction() {
	}

	public LispAction(ILispEditor editor) {
		this.editor = editor;
	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		editor = (LispEditor) targetEditor;
	}

	public void run(IAction action) {
		run();
	}
	




	public void selectionChanged(IAction action, ISelection selection) {

	}

	// Handy util functions

	protected static CuspInterface getCusp() {
		return LispPlugin.getDefault().getCusp();
	}

	protected int getOffset() {
		if (editor==null) { 
			IEditorPart ed = LispPlugin.getActiveEditor();
			if (ed!=null) {
				editor = (LispEditor)ed;
			}
		}
		ITextSelection ts = (ITextSelection) editor.getSelectionProvider().getSelection();
		int offset = ts.getOffset();
		//TODO: Gorsal - why do i have to change getOffset()?
		return (editor.getDocument().getLength()==offset?offset-1:offset);
	}

	protected String getPackage(){
		IDocument doc = editor.getDocument();
		return LispUtil.getPackage(doc.get(), getOffset());
	}

	protected String getSymbol() {
		IDocument doc = editor.getDocument();

		String symbol = LispUtil.getCurrentFullWord(doc, getOffset());
		symbol = symbol.replace("'", "");
		symbol = symbol.replace("`", "");

		return symbol;
	}

	protected String getTopLevel() {
		IDocument doc = editor.getDocument();

		return LispUtil.getTopLevelExpression(doc, getOffset());
	}

	protected String getCurrentExpression () {
		ITextSelection ts = (ITextSelection) editor.getSelectionProvider().getSelection();
		IDocument doc = editor.getDocument();

		return LispUtil.getCurrentExpression(doc, ts.getOffset(), ts.getLength());
	}

	protected void evalExpInCurrentPackageIf (String exp) {
		evalExpInCurrentPackageIf(exp,null);
	}
	protected void evalExpInCurrentPackageIf (String exp,ReplView.ReturnHandler ret) {
		LispUtil.evalExpInCurrentPackageIf(getCusp(),exp,editor.getDocument(),getOffset(),ret);
	}
	
	protected String getTopLevelExpression ()
	{
		IDocument doc = editor.getDocument();
		
		return LispUtil.getTopLevelExpression(doc,getOffset());
	}

	protected String getExpression() {
		IDocument doc = editor.getDocument();
		return LispUtil.getCurrentFullExpression(doc, getOffset());
	}
}