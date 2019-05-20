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

import jasko.tim.lisp.editors.ILispEditor;


public class HyperSpecAction extends CallUrlAction {
	
	public HyperSpecAction() {
		super(null, "http://www.xach.com/clhs?q=%s");
	}
	
	public HyperSpecAction(ILispEditor editor) {
		super(editor, "http://www.xach.com/clhs?q=%s");
	}

}
