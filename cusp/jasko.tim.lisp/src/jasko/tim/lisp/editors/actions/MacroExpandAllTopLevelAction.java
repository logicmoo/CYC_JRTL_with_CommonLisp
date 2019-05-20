package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.LispEditor;

public class MacroExpandAllTopLevelAction extends MacroExpandAction {
	  public MacroExpandAllTopLevelAction () {
		  super();
		  super.topLevel = true;
		  super.all = true;
	  }
	  
	  public MacroExpandAllTopLevelAction (LispEditor editor)
	  {
		  super(editor);
		  super.topLevel = true;
		  super.all = true;
	  }
}
