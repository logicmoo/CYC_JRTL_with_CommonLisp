package jasko.tim.lisp.views.repl;

import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.Display;

public interface State {
	public boolean handle(String command, String cleanCommand);
	
	public void activate();
	
	public Color getColor(Display display);
}
