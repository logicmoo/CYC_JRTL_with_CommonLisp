package jasko.tim.lisp.editors.actions;

import org.eclipse.swt.widgets.Display;

import jasko.tim.lisp.editors.LispEditor;
import jasko.tim.lisp.util.LispUtil;

public class EvalFileAction extends LispAction {
    
    public EvalFileAction() {
    }
    
    public EvalFileAction (LispEditor editor) {
        super(editor);
    }
    
    public void run() {
        if (!(editor.getDocument().getLength() > 0 && LispUtil.doParensBalance(editor.getDocument()))) {
            Display.getCurrent().beep();
            return;
        }
        
        getCusp().sendEval(editor.getDocument().get(), null);
        /*new CuspRunnable() {
            public void run() {
                LispNode res = this.result.getf(":return").getf(":ok").getf(":present");
                //  this used to display the result of the evaluation -- that already goes to the repl now,
                // and this value is always an empty string -- maybe a cusp api change?
                String display = "";
                for (LispNode kid: res.params) {
                    display += kid.get(0).value + "\n";
                }
                display = display.trim();
                editor.showPopupInfo("=> " + display);
                
            }
        });*/
        
    }

}
