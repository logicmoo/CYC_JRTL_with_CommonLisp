package abcl_ae;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Load;

public final class AbclInit {
	static private Object lock = new Object();
	static private boolean initialized = false;

	// package access level
	static void init() {
		if (initialized)
			return;
			
		synchronized (lock) {
			if (initialized)
				return;
				
			Interpreter.initializeLisp();
			Load.load("fasls/first-servlet.abcl");
			
			initialized = true;
		}
	}

}