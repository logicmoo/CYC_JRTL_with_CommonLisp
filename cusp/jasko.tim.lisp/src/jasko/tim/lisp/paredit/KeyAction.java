package jasko.tim.lisp.paredit;


import java.util.Map;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IParameterValues;



class KeyParameters implements IParameterValues {
	public Map getParameterValues() {
		// TODO Auto-generated method stub
	return null;
}	
}

public class KeyAction extends AbstractHandler {
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		/*
	String key = event.getParameter("jasko.tim.lisp.commandKeyParameter");
	IEditorPart ed = LispPlugin.getActiveEditor();
	if (ed instanceof LispEditor) {
		LispEditor editor = (LispEditor)ed;
		Paredit paredit = new Paredit(editor);
		int offset = editor.getOffset();
		try {
			///////////////////////
			///////////////////////
			if (key.equals ("(")) {
				offset = paredit.pareditOpenRound();
			} else if (key.equals(")")) {
				offset = paredit.pareditCloseRound();
			} else if (key.equals("[")) {
				offset = paredit.pareditOpenBracket();
			} else if (key.equals("]")) {
				offset = paredit.pareditCloseBracket();
			} else if (key.equals("\"")) {
				offset = paredit.pareditDoubleQuote();
			} else if (key.equals("Alt+\"")) {
				offset = paredit.pareditMetaDoubleQuote();
			}
			editor.setOffset(offset);
			int i=3;
			///////////////////////
			///////////////////////
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
		
	}*/
	return null;
	}
	
	
}
