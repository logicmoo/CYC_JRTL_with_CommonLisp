/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
*/
package org.logicmoo.translate.roaster;

import java.util.Arrays;
import java.util.List;

import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

/**
 * Main class to handle the command line access to roaster
 *
 */
public class Bootstrap {
    /**
    * Handles the command line access
    * 
    * @param args the command line arguments (musn't be null)
    */
    // "G:\\opt\\CYC_JRTL_with_CommonLisp\\platform\\main\\logicmoo-main\\org\\logicmoo\\translate\\spoon\\spoon_test.java"
    public static void main(String[] args) {
	Lisp.initLisp();
	Interpreter.createBasicInstance();
	BeanShellCntrl.init_subl();
	BeanShellCntrl.init_cyc();

	if (args.length == 0)
	    args = new String[] { "main/server-input/com/cyc/cycjava_2/cycl/arity.java",// "main/server-4q/com/cyc/cycjava/cycl/arity.java",
	    };

	List<String> arguments = Arrays.asList(args);

	if (arguments.isEmpty() || arguments.contains("--help") || arguments.contains("-h")) {
	    new HelpCommand().run(arguments);
	} else {
	    new MergeClassesCommand().run(arguments);
	}
    }
}