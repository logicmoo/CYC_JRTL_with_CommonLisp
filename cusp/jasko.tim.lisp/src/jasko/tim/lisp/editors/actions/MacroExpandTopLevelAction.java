package jasko.tim.lisp.editors.actions;

import jasko.tim.lisp.editors.LispEditor;

public class MacroExpandTopLevelAction extends MacroExpandAction {
  public MacroExpandTopLevelAction () {
	  super();
	  super.topLevel = true;
  }
  
  public MacroExpandTopLevelAction (LispEditor editor)
  {
	  super(editor);
	  super.topLevel = true;
  }
}
