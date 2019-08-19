/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.dmiles;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$readtable$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader._csetf_readtable_case;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.copy_readtable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.readtable_case;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.cycjava.cycl.V02;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      SWI-PROLOG-LINK
 *  source file: /cyc/top/cycl/inference/dmiles/swi-prolog-link.lisp
 *  created:     2019/07/03 17:39:05
 */
public final class swi_prolog_link extends SubLTranslatedFile implements V02 {
    // // Constructor
    private swi_prolog_link() {
    }

    public static final SubLFile me = new swi_prolog_link();

    public static final String myName = "com.cyc.cycjava.cycl.inference.dmiles.swi_prolog_link";

    // // Definitions
    public static final SubLObject swi_initialize(SubLObject size, SubLObject runs) {
	if (size == UNPROVIDED) {
	    size = $int$100000;
	}
	if (runs == UNPROVIDED) {
	    runs = TEN_INTEGER;
	}
	return values(EMPTY_SUBL_OBJECT_ARRAY);
    }

    public static final SubLObject swi_unify(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject arg1 = NIL;
	    SubLObject arg2 = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt1);
	    arg1 = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list_alt1);
	    arg2 = current.first();
	    current = current.rest();
	    if (NIL == current) {
		return list(VALUES, list(EQUALP, arg1, arg2));
	    } else {
		cdestructuring_bind_error(datum, $list_alt1);
	    }
	}
	return NIL;
    }

    public static final SubLObject swi_call(SubLObject input, SubLObject output) {
	if (output == UNPROVIDED) {
	    output = NIL;
	}
	return values(output);
    }

    // defconstant
    public static final SubLSymbol $swi_readtable$ = makeSymbol("*SWI-READTABLE*");

    public static final SubLObject read_from_string_preserve(SubLObject str) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $readtable$.currentBinding(thread);
		try {
		    $readtable$.bind($swi_readtable$.getGlobalValue(), thread);
		    return read_from_string(str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} finally {
		    $readtable$.rebind(_prev_bind_0, thread);
		}
	    }
	}
    }

    public static final SubLObject read_from_string_sensitive(SubLObject str) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject prev_case = readtable_case($readtable$.getDynamicValue(thread));
		try {
		    _csetf_readtable_case($readtable$.getDynamicValue(thread), $PRESERVE);
		    str = read_from_string(str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} finally {
		    {
			SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
			    $is_thread_performing_cleanupP$.bind(T, thread);
			    _csetf_readtable_case($readtable$.getDynamicValue(thread), prev_case);
			} finally {
			    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
			}
		    }
		}
	    }
	    return str;
	}
    }

    public static final SubLObject declare_swi_prolog_link_file() {
	declareFunction("swi_initialize", "SWI-INITIALIZE", 0, 2, false);
	declareMacro("swi_unify", "SWI-UNIFY");
	declareFunction("swi_call", "SWI-CALL", 1, 1, false);
	declareFunction("read_from_string_preserve", "READ-FROM-STRING-PRESERVE", 1, 0, false);
	declareFunction("read_from_string_sensitive", "READ-FROM-STRING-SENSITIVE", 1, 0, false);
	return NIL;
    }

    public static final SubLObject init_swi_prolog_link_file() {
	defconstant("*SWI-READTABLE*", copy_readtable(NIL, UNPROVIDED));
	return NIL;
    }

    public static final SubLObject setup_swi_prolog_link_file() {
	_csetf_readtable_case($swi_readtable$.getGlobalValue(), $PRESERVE);
	return NIL;
    }

    // // Internal Constants
    public static final SubLInteger $int$100000 = makeInteger(100000);

    static private final SubLList $list_alt1 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLSymbol $sym4$_EXIT = makeSymbol("%EXIT");

    // // Initializers
    @Override
    public void declareFunctions() {
	declare_swi_prolog_link_file();
    }

    @Override
    public void initializeVariables() {
	init_swi_prolog_link_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_swi_prolog_link_file();
    }
}
