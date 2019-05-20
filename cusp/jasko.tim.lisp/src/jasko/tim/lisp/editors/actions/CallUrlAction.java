/**
 * Created on Mar 27, 2006
 * 
 * Paragent Confidential
 *
 * (C) Copyright Paragent, LLC Mar 27, 2006
 *
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright office.
 *
 * All Rights Reserved. Use, duplication or disclosure restricted unless
 * granted by formal written contract with Paragent, LLC.
 *
 * @author tjasko
 *
 */
package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.*;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.*;

public class CallUrlAction extends LispAction {
	private String url;
	private ILispEditor editor;
	
	public CallUrlAction() {
	}
	
	public CallUrlAction(ILispEditor editor, String url) {
		this.editor = editor;
		this.url = url;
	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
         editor = (ILispEditor)targetEditor;
     }
	
	public void run() {
		editor.callUrl(url);
	}
}
