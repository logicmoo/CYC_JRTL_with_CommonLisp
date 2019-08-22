package org.logicmoo.translate;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

public class PreInitLoader {

	/**
	 * ABCL = only loads the classes but not the system 
	 * SubL = inits SubL the
	 * classes but not the system Only calls
	 */
	public static void readySubLisp() {
		Lisp.initLisp();
		Interpreter.createBasicInstance();
		BeanShellCntrl.init_subl();
		BeanShellCntrl.init_cyc_classes();
	}

}
