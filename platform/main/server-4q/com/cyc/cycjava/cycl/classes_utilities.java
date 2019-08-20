/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CLASSES-UTILITIES
 * source file: /cyc/top/cycl/classes-utilities.lisp
 * created:     2019/07/03 17:37:07
 */
public final class classes_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new classes_utilities();



    // defconstant
    @LispMethod(comment = "defconstant")
    // Definitions
    public static final SubLSymbol $classes_utilities_undefined_class_method_message$ = makeSymbol("*CLASSES-UTILITIES-UNDEFINED-CLASS-METHOD-MESSAGE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $classes_utilities_undefined_class_super_method_message$ = makeSymbol("*CLASSES-UTILITIES-UNDEFINED-CLASS-SUPER-METHOD-MESSAGE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $classes_utilities_illegal_access_message$ = makeSymbol("*CLASSES-UTILITIES-ILLEGAL-ACCESS-MESSAGE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $method_call_stack$ = makeSymbol("*METHOD-CALL-STACK*");

    // defconstant
    // Enumerated values of type SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE.
    /**
     * Enumerated values of type SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE.
     */
    @LispMethod(comment = "Enumerated values of type SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE.\ndefconstant")
    private static final SubLSymbol $valid_subloop_safe_funcaller_error_values$ = makeSymbol("*VALID-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$Attempt_to_invoke_the_undefined_m = makeString("Attempt to invoke the undefined method ~S on class ~S failed.");

    static private final SubLString $str1$Attempt_to_invoke_the_undefined_s = makeString("Attempt to invoke the undefined super method ~S on class ~S failed.");

    static private final SubLString $str2$Method__S_cannot_be_called_within = makeString("Method ~S cannot be called within the scope of class ~S.");

    static private final SubLList $list3 = list(makeSymbol("NAME-TEMPLATE"), makeSymbol("MAX-ARGS"));

    static private final SubLList $list8 = list(list(makeSymbol("CLASS"), list(makeSymbol("FIF"), list(makeSymbol("SYMBOLP"), makeSymbol("CLASS-NAME-OR-CLASS")), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("CLASS-NAME-OR-CLASS")), list(makeSymbol("FIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("CLASS-NAME-OR-CLASS")), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("CLASS-NAME-OR-CLASS")), makeSymbol("CLASS-NAME-OR-CLASS")))));

    static private final SubLList $list9 = list(makeSymbol("MUST"), list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), makeString("FUNCALL-CLASS-METHOD: ~S is not a defined class."), makeSymbol("CLASS-NAME-OR-CLASS"));

    static private final SubLList $list10 = list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("METHOD-NAME"), list(makeSymbol("SYMBOLP"), makeSymbol("METHOD-NAME"))), makeString("FUNCALL-CLASS-METHOD: ~S is not a method of class ~S."), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")));

    static private final SubLList $list11 = list(list(makeSymbol("METHOD"), list(makeSymbol("METHOD-ASSOC"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("CLASS")))));

    static private final SubLList $list12 = list(makeSymbol("MUST"), makeSymbol("METHOD"), makeSymbol("*CLASSES-UTILITIES-UNDEFINED-CLASS-METHOD-MESSAGE*"), makeSymbol("METHOD-NAME"), makeSymbol("CLASS"));

    static private final SubLList $list13 = list(makeSymbol("MUST"), list(makeSymbol("INSTANCES-ACCESS-CHECK-METHOD"), makeSymbol("CLASS"), makeSymbol("METHOD")), makeSymbol("*CLASSES-UTILITIES-ILLEGAL-ACCESS-MESSAGE*"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")));

    static private final SubLList $list16 = list(makeSymbol("METHOD-FUNCTION-NAME"), makeSymbol("METHOD"));

    static private final SubLList $list18 = list(list(RET, NIL));

    static private final SubLString $str19$ARG_S = makeString("ARG~S");

    static private final SubLList $list21 = list(makeSymbol("MUST"), list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), makeString("FUNCALL-CLASS-SUPER-METHOD: ~S is not a defined class."), makeSymbol("CLASS-NAME-OR-CLASS"));

    static private final SubLList $list22 = list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("METHOD-NAME"), list(makeSymbol("SYMBOLP"), makeSymbol("METHOD-NAME"))), makeString("FUNCALL-CLASS-SUPER-METHOD: ~S is not a method of class ~S."), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")));

    static private final SubLList $list23 = list(list(makeSymbol("METHOD"), list(makeSymbol("METHOD-SHADOWED-ASSOC"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("CLASS")))));

    static private final SubLList $list24 = list(makeSymbol("MUST"), makeSymbol("METHOD"), makeSymbol("*CLASSES-UTILITIES-UNDEFINED-CLASS-SUPER-METHOD-MESSAGE*"), makeSymbol("METHOD-NAME"), makeSymbol("CLASS"));

    static private final SubLList $list25 = list(makeSymbol("NAME-TEMPLATE"), makeSymbol("CLASS-NAME-TEMPLATE"), makeSymbol("MAX-ARGS"));

    static private final SubLList $list27 = list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INSTANCE-P"), makeSymbol("INSTANCE")), list(makeSymbol("SYMBOLP"), makeSymbol("METHOD-NAME"))), makeString("~%FUNCALL-INSTANCE-METHOD: either instance ~S or method ~S are invalid."), makeSymbol("INSTANCE"), makeSymbol("METHOD-NAME"));

    static private final SubLList $list28 = list(list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("INSTANCE"))), list(makeSymbol("METHOD"), list(makeSymbol("GETHASH"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-TABLIFIED-INSTANCE-METHODS"), makeSymbol("CLASS")))));

    static private final SubLList $list31 = list(list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("INSTANCE"))), list(makeSymbol("METHOD"), list(makeSymbol("METHOD-SHADOWED-ASSOC"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), makeSymbol("CLASS")))));

    static private final SubLList $list33 = list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("METHOD-NAME"), list(makeSymbol("SYMBOLP"), makeSymbol("METHOD-NAME"))), makeString("~%FUNCALL-CLASS-OR-INSTANCE-METHOD: Method ~S is invalid."), makeSymbol("METHOD-NAME"));

    static private final SubLList $list34 = list(makeSymbol("INSTANCE-P"), makeSymbol("CLASS-OR-INSTANCE"));

    static private final SubLList $list35 = list(list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("CLASS-OR-INSTANCE"))), list(makeSymbol("METHOD"), list(makeSymbol("GETHASH"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-TABLIFIED-INSTANCE-METHODS"), makeSymbol("CLASS")))));

    static private final SubLList $list36 = list(list(makeSymbol("PROGN"), list(makeSymbol("ERROR"), makeString("~%FUNCALL-CLASS-OR-INSTANCE-METHOD: Method ~S is invalid."), makeSymbol("METHOD-NAME")), list(RET, NIL)));

    static private final SubLList $list37 = list(list(makeSymbol("CLASS"), list(makeSymbol("FIF"), list(makeSymbol("CLASS-P"), makeSymbol("CLASS-OR-INSTANCE")), makeSymbol("CLASS-OR-INSTANCE"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("CLASS-OR-INSTANCE")))), list(makeSymbol("METHOD"), list(makeSymbol("FIF"), makeSymbol("CLASS"), list(makeSymbol("METHOD-ASSOC"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("CLASS"))), NIL)));

    static private final SubLList $list38 = list(makeSymbol("MUST"), makeSymbol("CLASS"), makeString("FUNCALL-CLASS-OR-INSTANCE-METHOD: ~S is not a valid class."), makeSymbol("CLASS"));

    static private final SubLList $list39 = list(makeSymbol("CLASS"), makeSymbol("METHOD-NAME"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_0_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-0-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_1_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-1-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_2_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-2-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_3_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-3-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_4_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-4-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_5_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-5-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_6_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-6-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_7_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-7-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_8_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-8-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_9_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-9-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_10_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-10-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_11_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-11-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_12_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-12-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_13_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-13-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_14_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-14-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_15_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-15-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_16_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-16-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_17_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-17-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_18_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-18-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_19_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-19-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_METHOD_WITH_20_ARGS = makeSymbol("FUNCALL-CLASS-METHOD-WITH-20-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-0-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-1-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-2-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-3-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-4-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-5-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-6-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-7-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-8-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-9-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-10-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-11-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-12-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-13-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-14-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-15-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-16-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-17-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-18-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-19-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS = makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-20-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_SUPER_METHOD = makeSymbol("FUNCALL-CLASS-SUPER-METHOD");

    static private final SubLList $list84 = list(makeSymbol("INSTANCE"), makeSymbol("METHOD-NAME"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_0_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-0-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_1_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-1-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_2_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-2-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_3_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-3-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_4_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-4-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_5_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-5-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_6_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-6-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_7_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-7-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_8_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-8-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_9_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-9-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_10_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-10-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_11_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-11-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_12_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-12-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_13_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-13-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_14_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-14-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_15_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-15-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_16_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-16-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_17_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-17-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_18_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-18-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_19_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-19-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_METHOD_WITH_20_ARGS = makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-20-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-0-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-1-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-2-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-3-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-4-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-5-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-6-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-7-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-8-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-9-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-10-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-11-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-12-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-13-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-14-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-15-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-16-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-17-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-18-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-19-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-20-ARGS");

    private static final SubLSymbol FUNCALL_INSTANCE_SUPER_METHOD = makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-0-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-1-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-2-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-3-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-4-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-5-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-6-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-7-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-8-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-9-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-10-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-11-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-12-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-13-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-14-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-15-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-16-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-17-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-18-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-19-ARGS");

    private static final SubLSymbol FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS = makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-20-ARGS");

    static private final SubLString $str150$APPLY_INSTANCE_METHOD__either_ins = makeString("APPLY-INSTANCE-METHOD: either instance ~S or method ~S are invalid.");

    static private final SubLString $str151$APPLY_INSTANCE_METHOD__No__S_meth = makeString("APPLY-INSTANCE-METHOD: No ~S method is associated with the class ~S of instance ~S.");

    static private final SubLSymbol $sym152$FUNCALL_INSTANCE_METHOD_W_O_RECURSION = makeSymbol("FUNCALL-INSTANCE-METHOD-W/O-RECURSION");

    static private final SubLSymbol $sym154$_ = makeSymbol("=");

    static private final SubLList $list156 = list(list(makeSymbol("SETTABLE-MATCH-LOC"), makeSymbol("SETTABLE-NO-MATCH-LOC")), makeSymbol("ITEM"), makeSymbol("SEQUENCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("KEY"), list(QUOTE, IDENTITY)), list(makeSymbol("TEST"), list(QUOTE, EQ)));

    static private final SubLString $$$item = makeString("item");

    static private final SubLString $str158$match_list = makeString("match-list");

    static private final SubLString $str159$not_match_list = makeString("not-match-list");

    static private final SubLString $$$element = makeString("element");

    static private final SubLString $$$sublist = makeString("sublist");

    static private final SubLList $list162 = list(NIL);

    private static final SubLSymbol CDOLIST_AND_SUBLISTS_CAREFULLY = makeSymbol("CDOLIST-AND-SUBLISTS-CAREFULLY");

    static private final SubLString $str168$DO_CLASSES_IN_ORDER___S_is_not_a_ = makeString("DO-CLASSES-IN-ORDER: ~S is not a legal variable.  A non nil symbol was expected.");

    static private final SubLString $str169$DO_CLASSES_IN_ORDER___S_is_not_a_ = makeString("DO-CLASSES-IN-ORDER: ~S is not a legal optional extension for a listed depth var.~%~\n     A listed non null symbol or nil was expected.");

    static private final SubLString $str170$DO_CLASSES_IN_ORDER___S_is_not_a_ = makeString("DO-CLASSES-IN-ORDER: ~S is not a legal body.");

    static private final SubLString $str171$Class__A_not_recognized_ = makeString("Class ~A not recognized.");

    static private final SubLList $list172 = list(makeKeyword("TARGET-NOT-A-CLASS"), makeKeyword("TARGET-NOT-AN-INSTANCE"), makeKeyword("TARGET-METHOD-CONFLICT"), makeKeyword("ACCESS-LEVEL-CONFLICT"), makeKeyword("INVALID-METHOD-NAME"), makeKeyword("UNDECLARED-METHOD"), makeKeyword("UNDEFINED-METHOD"));

    private static final SubLSymbol SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE = makeSymbol("SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE");

    static private final SubLString $str174$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE = makeSymbol("ENCODE-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE");

    static private final SubLString $str176$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE = makeSymbol("DECODE-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE");

    static private final SubLString $str178$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P = makeSymbol("SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE-P");

    static private final SubLList $list180 = list(makeSymbol("PUNLESS"), list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("TARGET-NOT-A-CLASS"))));

    static private final SubLList $list181 = list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), makeSymbol("METHOD-NAME"), list(makeSymbol("SYMBOLP"), makeSymbol("METHOD-NAME"))), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("INVALID-METHOD-NAME"))));

    static private final SubLList $list182 = list(makeSymbol("PUNLESS"), makeSymbol("METHOD"), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("UNDECLARED-METHOD"))));

    static private final SubLList $list183 = list(makeSymbol("PUNLESS"), list(makeSymbol("INSTANCES-ACCESS-CHECK-METHOD"), makeSymbol("CLASS"), makeSymbol("METHOD")), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("ACCESS-LEVEL-CONFLICT"))));

    static private final SubLList $list184 = list(list(makeSymbol("FUNCTION-REF"), list(makeSymbol("METHOD-FUNCTION-NAME"), makeSymbol("METHOD"))));

    static private final SubLList $list185 = list(makeSymbol("PUNLESS"), list(makeSymbol("FBOUNDP"), makeSymbol("FUNCTION-REF")), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("UNDEFINED-METHOD"))));

    private static final SubLSymbol FUNCTION_REF = makeSymbol("FUNCTION-REF");

    static private final SubLList $list188 = list(makeSymbol("PUNLESS"), list(makeSymbol("INSTANCE-P"), makeSymbol("INSTANCE")), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("TARGET-NOT-AN-INSTANCE"))));

    static private final SubLList $list189 = list(makeSymbol("PUNLESS"), list(makeSymbol("SYMBOLP"), makeSymbol("METHOD-NAME")), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("INVALID-METHOD-NAME"))));

    static private final SubLList $list190 = list(list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("UNDECLARED-METHOD"))));

    static private final SubLList $list191 = list(makeSymbol("PUNLESS"), makeSymbol("METHOD"), list(makeSymbol("VALUES"), NIL, makeKeyword("UNDECLARED-METHOD")));

    static private final SubLList $list192 = list(makeSymbol("PUNLESS"), list(makeSymbol("INSTANCES-ACCESS-CHECK-METHOD"), makeSymbol("CLASS"), makeSymbol("METHOD")), list(makeSymbol("VALUES"), NIL, makeKeyword("ACCESS-LEVEL-CONFLICT")));

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_0_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-0-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_1_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-1-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_2_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-2-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_3_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-3-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_4_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-4-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_5_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-5-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_6_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-6-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_7_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-7-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_8_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-8-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_9_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-9-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_10_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-10-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_11_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-11-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_12_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-12-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_13_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-13-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_14_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-14-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_15_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-15-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_16_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-16-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_17_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-17-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_18_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-18-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_19_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-19-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD_WITH_20_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-20-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_METHOD = makeSymbol("SAFE-FUNCALL-CLASS-METHOD");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-0-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-1-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-2-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-3-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-4-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-5-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-6-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-7-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-8-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-9-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-10-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-11-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-12-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-13-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-14-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-15-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-16-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-17-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-18-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-19-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-20-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_SUPER_METHOD = makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_0_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-0-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_1_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-1-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_2_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-2-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_3_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-3-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_4_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-4-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_5_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-5-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_6_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-6-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_7_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-7-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_8_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-8-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_9_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-9-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_10_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-10-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_11_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-11-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_12_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-12-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_13_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-13-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_14_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-14-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_15_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-15-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_16_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-16-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_17_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-17-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_18_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-18-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_19_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-19-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD_WITH_20_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-20-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_METHOD = makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-0-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-1-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-2-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-3-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-4-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-5-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-6-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-7-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-8-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-9-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-10-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-11-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-12-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-13-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-14-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-15-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-16-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-17-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-18-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-19-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-20-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_INSTANCE_SUPER_METHOD = makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-0-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-1-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-2-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-3-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-4-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-5-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-6-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-7-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-8-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-9-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-10-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-11-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-12-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-13-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-14-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-15-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-16-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-17-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-18-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-19-ARGS");

    private static final SubLSymbol SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS = makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-20-ARGS");

    public static final SubLObject define_class_method_funcallers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name_template = NIL;
            SubLObject max_args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            max_args = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject function_defs = NIL;
                    SubLObject arg_list = NIL;
                    SubLObject function_name = NIL;
                    SubLObject function_def = NIL;
                    SubLObject cdotimes_end_var = add(max_args, ONE_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                        function_def = copy_tree(listS(DEFINE_PUBLIC, function_name, listS(CLASS_NAME_OR_CLASS, METHOD_NAME, arg_list), list(CLET, $list_alt8, $list_alt9, $list_alt10, list(CLET, $list_alt11, $list_alt12, $list_alt13, list(RET, listS(FUNCALL, $list_alt16, CLASS, arg_list)))), $list_alt18));
                        function_defs = cons(function_def, function_defs);
                        arg_list = nreverse(cons(intern(format(NIL, $str_alt19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
                    }
                    return bq_cons(PROGN, nreverse(function_defs));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt3);
            }
        }
        return NIL;
    }

    public static SubLObject define_class_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = NIL;
        SubLObject max_args = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        max_args = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject function_defs = NIL;
            SubLObject arg_list = NIL;
            SubLObject function_name = NIL;
            SubLObject function_def = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = add(max_args, ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                function_def = copy_tree(listS(DEFINE_PUBLIC, function_name, listS(CLASS_NAME_OR_CLASS, METHOD_NAME, arg_list), list(CLET, $list8, $list9, $list10, list(CLET, $list11, $list12, $list13, list(RET, listS(FUNCALL, $list16, CLASS, arg_list)))), $list18));
                function_defs = cons(function_def, function_defs);
                arg_list = nreverse(cons(intern(format(NIL, $str19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
            }
            return bq_cons(PROGN, nreverse(function_defs));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static final SubLObject define_class_super_method_funcallers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name_template = NIL;
            SubLObject max_args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            max_args = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject function_defs = NIL;
                    SubLObject arg_list = NIL;
                    SubLObject function_name = NIL;
                    SubLObject function_def = NIL;
                    SubLObject cdotimes_end_var = add(max_args, ONE_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                        function_def = copy_tree(listS(DEFINE_PUBLIC, function_name, listS(CLASS_NAME_OR_CLASS, METHOD_NAME, arg_list), list(CLET, $list_alt8, $list_alt21, $list_alt22, list(CLET, $list_alt23, $list_alt24, $list_alt13, list(RET, listS(FUNCALL, $list_alt16, CLASS, arg_list)))), $list_alt18));
                        function_defs = cons(function_def, function_defs);
                        arg_list = nreverse(cons(intern(format(NIL, $str_alt19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
                    }
                    return bq_cons(PROGN, nreverse(function_defs));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt3);
            }
        }
        return NIL;
    }

    public static SubLObject define_class_super_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = NIL;
        SubLObject max_args = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        max_args = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject function_defs = NIL;
            SubLObject arg_list = NIL;
            SubLObject function_name = NIL;
            SubLObject function_def = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = add(max_args, ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                function_def = copy_tree(listS(DEFINE_PUBLIC, function_name, listS(CLASS_NAME_OR_CLASS, METHOD_NAME, arg_list), list(CLET, $list8, $list21, $list22, list(CLET, $list23, $list24, $list13, list(RET, listS(FUNCALL, $list16, CLASS, arg_list)))), $list18));
                function_defs = cons(function_def, function_defs);
                arg_list = nreverse(cons(intern(format(NIL, $str19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
            }
            return bq_cons(PROGN, nreverse(function_defs));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static final SubLObject define_instance_method_funcallers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name_template = NIL;
            SubLObject class_name_template = NIL;
            SubLObject max_args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            class_name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            max_args = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject function_defs = NIL;
                    SubLObject arg_list = NIL;
                    SubLObject function_name = NIL;
                    SubLObject class_function_name = NIL;
                    SubLObject function_def = NIL;
                    SubLObject cdotimes_end_var = add(max_args, ONE_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                        class_function_name = intern(format(NIL, class_name_template, i), UNPROVIDED);
                        function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(INSTANCE, METHOD_NAME, arg_list), $list_alt27, list(CLET, $list_alt28, list(PIF, METHOD, list(PROGN, $list_alt13, list(RET, listS(FUNCALL, $list_alt16, INSTANCE, arg_list))), list(RET, listS(class_function_name, CLASS, METHOD_NAME, arg_list))))));
                        function_defs = cons(function_def, function_defs);
                        arg_list = nreverse(cons(intern(format(NIL, $str_alt19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
                    }
                    return bq_cons(PROGN, nreverse(function_defs));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt25);
            }
        }
        return NIL;
    }

    public static SubLObject define_instance_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = NIL;
        SubLObject class_name_template = NIL;
        SubLObject max_args = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        class_name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        max_args = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject function_defs = NIL;
            SubLObject arg_list = NIL;
            SubLObject function_name = NIL;
            SubLObject class_function_name = NIL;
            SubLObject function_def = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = add(max_args, ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                class_function_name = intern(format(NIL, class_name_template, i), UNPROVIDED);
                function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(INSTANCE, METHOD_NAME, arg_list), $list27, list(CLET, $list28, list(PIF, METHOD, list(PROGN, $list13, list(RET, listS(FUNCALL, $list16, INSTANCE, arg_list))), list(RET, listS(class_function_name, CLASS, METHOD_NAME, arg_list))))));
                function_defs = cons(function_def, function_defs);
                arg_list = nreverse(cons(intern(format(NIL, $str19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
            }
            return bq_cons(PROGN, nreverse(function_defs));
        }
        cdestructuring_bind_error(datum, $list25);
        return NIL;
    }

    public static final SubLObject define_instance_super_method_funcallers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name_template = NIL;
            SubLObject class_name_template = NIL;
            SubLObject max_args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            class_name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            max_args = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject function_defs = NIL;
                    SubLObject arg_list = NIL;
                    SubLObject function_name = NIL;
                    SubLObject class_function_name = NIL;
                    SubLObject function_def = NIL;
                    SubLObject cdotimes_end_var = add(max_args, ONE_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                        class_function_name = intern(format(NIL, class_name_template, i), UNPROVIDED);
                        function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(INSTANCE, METHOD_NAME, arg_list), $list_alt27, list(CLET, $list_alt31, list(PIF, METHOD, list(PROGN, $list_alt13, list(RET, listS(FUNCALL, $list_alt16, INSTANCE, arg_list))), list(RET, listS(class_function_name, CLASS, METHOD_NAME, arg_list))))));
                        function_defs = cons(function_def, function_defs);
                        arg_list = nreverse(cons(intern(format(NIL, $str_alt19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
                    }
                    return bq_cons(PROGN, nreverse(function_defs));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt25);
            }
        }
        return NIL;
    }

    public static SubLObject define_instance_super_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = NIL;
        SubLObject class_name_template = NIL;
        SubLObject max_args = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        class_name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        max_args = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject function_defs = NIL;
            SubLObject arg_list = NIL;
            SubLObject function_name = NIL;
            SubLObject class_function_name = NIL;
            SubLObject function_def = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = add(max_args, ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                class_function_name = intern(format(NIL, class_name_template, i), UNPROVIDED);
                function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(INSTANCE, METHOD_NAME, arg_list), $list27, list(CLET, $list31, list(PIF, METHOD, list(PROGN, $list13, list(RET, listS(FUNCALL, $list16, INSTANCE, arg_list))), list(RET, listS(class_function_name, CLASS, METHOD_NAME, arg_list))))));
                function_defs = cons(function_def, function_defs);
                arg_list = nreverse(cons(intern(format(NIL, $str19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
            }
            return bq_cons(PROGN, nreverse(function_defs));
        }
        cdestructuring_bind_error(datum, $list25);
        return NIL;
    }

    public static final SubLObject define_class_or_instance_method_funcallers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name_template = NIL;
            SubLObject max_args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            max_args = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject function_defs = NIL;
                    SubLObject arg_list = NIL;
                    SubLObject function_name = NIL;
                    SubLObject function_def = NIL;
                    SubLObject cdotimes_end_var = add(max_args, ONE_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                        function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(CLASS_OR_INSTANCE, METHOD_NAME, arg_list), $list_alt33, list(PIF, $list_alt34, list(CLET, $list_alt35, listS(PIF, METHOD, list(PROGN, $list_alt13, list(RET, listS(FUNCALL, $list_alt16, CLASS_OR_INSTANCE, arg_list))), $list_alt36)), list(CLET, $list_alt37, $list_alt38, $list_alt12, $list_alt13, list(RET, listS(FUNCALL, $list_alt16, CLASS, arg_list))))));
                        function_defs = cons(function_def, function_defs);
                        arg_list = nreverse(cons(intern(format(NIL, $str_alt19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
                    }
                    return bq_cons(PROGN, nreverse(function_defs));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt3);
            }
        }
        return NIL;
    }

    public static SubLObject define_class_or_instance_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = NIL;
        SubLObject max_args = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        max_args = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject function_defs = NIL;
            SubLObject arg_list = NIL;
            SubLObject function_name = NIL;
            SubLObject function_def = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = add(max_args, ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(CLASS_OR_INSTANCE, METHOD_NAME, arg_list), $list33, list(PIF, $list34, list(CLET, $list35, listS(PIF, METHOD, list(PROGN, $list13, list(RET, listS(FUNCALL, $list16, CLASS_OR_INSTANCE, arg_list))), $list36)), list(CLET, $list37, $list38, $list12, $list13, list(RET, listS(FUNCALL, $list16, CLASS, arg_list))))));
                function_defs = cons(function_def, function_defs);
                arg_list = nreverse(cons(intern(format(NIL, $str19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
            }
            return bq_cons(PROGN, nreverse(function_defs));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static final SubLObject funcall_class_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject arg_count = length(args);
                SubLObject pcase_var = arg_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    return list(FUNCALL_CLASS_METHOD_WITH_0_ARGS, v_class, method_name);
                } else {
                    if (pcase_var.eql(ONE_INTEGER)) {
                        return listS(FUNCALL_CLASS_METHOD_WITH_1_ARGS, v_class, method_name, args);
                    } else {
                        if (pcase_var.eql(TWO_INTEGER)) {
                            return listS(FUNCALL_CLASS_METHOD_WITH_2_ARGS, v_class, method_name, args);
                        } else {
                            if (pcase_var.eql(THREE_INTEGER)) {
                                return listS(FUNCALL_CLASS_METHOD_WITH_3_ARGS, v_class, method_name, args);
                            } else {
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    return listS(FUNCALL_CLASS_METHOD_WITH_4_ARGS, v_class, method_name, args);
                                } else {
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        return listS(FUNCALL_CLASS_METHOD_WITH_5_ARGS, v_class, method_name, args);
                                    } else {
                                        if (pcase_var.eql(SIX_INTEGER)) {
                                            return listS(FUNCALL_CLASS_METHOD_WITH_6_ARGS, v_class, method_name, args);
                                        } else {
                                            if (pcase_var.eql(SEVEN_INTEGER)) {
                                                return listS(FUNCALL_CLASS_METHOD_WITH_7_ARGS, v_class, method_name, args);
                                            } else {
                                                if (pcase_var.eql(EIGHT_INTEGER)) {
                                                    return listS(FUNCALL_CLASS_METHOD_WITH_8_ARGS, v_class, method_name, args);
                                                } else {
                                                    if (pcase_var.eql(NINE_INTEGER)) {
                                                        return listS(FUNCALL_CLASS_METHOD_WITH_9_ARGS, v_class, method_name, args);
                                                    } else {
                                                        if (pcase_var.eql(TEN_INTEGER)) {
                                                            return listS(FUNCALL_CLASS_METHOD_WITH_10_ARGS, v_class, method_name, args);
                                                        } else {
                                                            if (pcase_var.eql(ELEVEN_INTEGER)) {
                                                                return listS(FUNCALL_CLASS_METHOD_WITH_11_ARGS, v_class, method_name, args);
                                                            } else {
                                                                if (pcase_var.eql(TWELVE_INTEGER)) {
                                                                    return listS(FUNCALL_CLASS_METHOD_WITH_12_ARGS, v_class, method_name, args);
                                                                } else {
                                                                    if (pcase_var.eql(THIRTEEN_INTEGER)) {
                                                                        return listS(FUNCALL_CLASS_METHOD_WITH_13_ARGS, v_class, method_name, args);
                                                                    } else {
                                                                        if (pcase_var.eql(FOURTEEN_INTEGER)) {
                                                                            return listS(FUNCALL_CLASS_METHOD_WITH_14_ARGS, v_class, method_name, args);
                                                                        } else {
                                                                            if (pcase_var.eql(FIFTEEN_INTEGER)) {
                                                                                return listS(FUNCALL_CLASS_METHOD_WITH_15_ARGS, v_class, method_name, args);
                                                                            } else {
                                                                                if (pcase_var.eql(SIXTEEN_INTEGER)) {
                                                                                    return listS(FUNCALL_CLASS_METHOD_WITH_16_ARGS, v_class, method_name, args);
                                                                                } else {
                                                                                    if (pcase_var.eql(SEVENTEEN_INTEGER)) {
                                                                                        return listS(FUNCALL_CLASS_METHOD_WITH_17_ARGS, v_class, method_name, args);
                                                                                    } else {
                                                                                        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
                                                                                            return listS(FUNCALL_CLASS_METHOD_WITH_18_ARGS, v_class, method_name, args);
                                                                                        } else {
                                                                                            if (pcase_var.eql(NINETEEN_INTEGER)) {
                                                                                                return listS(FUNCALL_CLASS_METHOD_WITH_19_ARGS, v_class, method_name, args);
                                                                                            } else {
                                                                                                if (pcase_var.eql(TWENTY_INTEGER)) {
                                                                                                    return listS(FUNCALL_CLASS_METHOD_WITH_20_ARGS, v_class, method_name, args);
                                                                                                } else {
                                                                                                    return NIL;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject funcall_class_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = length(args);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return list(FUNCALL_CLASS_METHOD_WITH_0_ARGS, v_class, method_name);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_1_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_2_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_3_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FOUR_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_4_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FIVE_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_5_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SIX_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_6_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SEVEN_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_7_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(EIGHT_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_8_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(NINE_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_9_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TEN_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_10_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(ELEVEN_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_11_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TWELVE_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_12_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(THIRTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_13_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FOURTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_14_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FIFTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_15_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SIXTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_16_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SEVENTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_17_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_18_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(NINETEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_19_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TWENTY_INTEGER)) {
            return listS(FUNCALL_CLASS_METHOD_WITH_20_ARGS, v_class, method_name, args);
        }
        return NIL;
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static final SubLObject fcm_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(FUNCALL_CLASS_METHOD, v_class, method_name, args);
            }
        }
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static SubLObject fcm(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(FUNCALL_CLASS_METHOD, v_class, method_name, args);
    }

    public static final SubLObject funcall_class_super_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject arg_count = length(args);
                SubLObject pcase_var = arg_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    return list(FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS, v_class, method_name);
                } else {
                    if (pcase_var.eql(ONE_INTEGER)) {
                        return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS, v_class, method_name, args);
                    } else {
                        if (pcase_var.eql(TWO_INTEGER)) {
                            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS, v_class, method_name, args);
                        } else {
                            if (pcase_var.eql(THREE_INTEGER)) {
                                return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS, v_class, method_name, args);
                            } else {
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS, v_class, method_name, args);
                                } else {
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS, v_class, method_name, args);
                                    } else {
                                        if (pcase_var.eql(SIX_INTEGER)) {
                                            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS, v_class, method_name, args);
                                        } else {
                                            if (pcase_var.eql(SEVEN_INTEGER)) {
                                                return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS, v_class, method_name, args);
                                            } else {
                                                if (pcase_var.eql(EIGHT_INTEGER)) {
                                                    return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS, v_class, method_name, args);
                                                } else {
                                                    if (pcase_var.eql(NINE_INTEGER)) {
                                                        return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS, v_class, method_name, args);
                                                    } else {
                                                        if (pcase_var.eql(TEN_INTEGER)) {
                                                            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS, v_class, method_name, args);
                                                        } else {
                                                            if (pcase_var.eql(ELEVEN_INTEGER)) {
                                                                return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS, v_class, method_name, args);
                                                            } else {
                                                                if (pcase_var.eql(TWELVE_INTEGER)) {
                                                                    return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS, v_class, method_name, args);
                                                                } else {
                                                                    if (pcase_var.eql(THIRTEEN_INTEGER)) {
                                                                        return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS, v_class, method_name, args);
                                                                    } else {
                                                                        if (pcase_var.eql(FOURTEEN_INTEGER)) {
                                                                            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS, v_class, method_name, args);
                                                                        } else {
                                                                            if (pcase_var.eql(FIFTEEN_INTEGER)) {
                                                                                return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS, v_class, method_name, args);
                                                                            } else {
                                                                                if (pcase_var.eql(SIXTEEN_INTEGER)) {
                                                                                    return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS, v_class, method_name, args);
                                                                                } else {
                                                                                    if (pcase_var.eql(SEVENTEEN_INTEGER)) {
                                                                                        return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS, v_class, method_name, args);
                                                                                    } else {
                                                                                        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
                                                                                            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS, v_class, method_name, args);
                                                                                        } else {
                                                                                            if (pcase_var.eql(NINETEEN_INTEGER)) {
                                                                                                return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS, v_class, method_name, args);
                                                                                            } else {
                                                                                                if (pcase_var.eql(TWENTY_INTEGER)) {
                                                                                                    return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS, v_class, method_name, args);
                                                                                                } else {
                                                                                                    return NIL;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject funcall_class_super_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = length(args);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return list(FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS, v_class, method_name);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FOUR_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FIVE_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SIX_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SEVEN_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(EIGHT_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(NINE_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TEN_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(ELEVEN_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TWELVE_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(THIRTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FOURTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FIFTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SIXTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SEVENTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(NINETEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TWENTY_INTEGER)) {
            return listS(FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS, v_class, method_name, args);
        }
        return NIL;
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static final SubLObject fcsm_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(FUNCALL_CLASS_SUPER_METHOD, v_class, method_name, args);
            }
        }
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static SubLObject fcsm(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(FUNCALL_CLASS_SUPER_METHOD, v_class, method_name, args);
    }

    public static final SubLObject funcall_instance_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject instance = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            instance = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt84);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject arg_count = length(args);
                SubLObject pcase_var = arg_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    return list(FUNCALL_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name);
                } else {
                    if (pcase_var.eql(ONE_INTEGER)) {
                        return listS(FUNCALL_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args);
                    } else {
                        if (pcase_var.eql(TWO_INTEGER)) {
                            return listS(FUNCALL_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args);
                        } else {
                            if (pcase_var.eql(THREE_INTEGER)) {
                                return listS(FUNCALL_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args);
                            } else {
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    return listS(FUNCALL_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args);
                                } else {
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        return listS(FUNCALL_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args);
                                    } else {
                                        if (pcase_var.eql(SIX_INTEGER)) {
                                            return listS(FUNCALL_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args);
                                        } else {
                                            if (pcase_var.eql(SEVEN_INTEGER)) {
                                                return listS(FUNCALL_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args);
                                            } else {
                                                if (pcase_var.eql(EIGHT_INTEGER)) {
                                                    return listS(FUNCALL_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args);
                                                } else {
                                                    if (pcase_var.eql(NINE_INTEGER)) {
                                                        return listS(FUNCALL_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args);
                                                    } else {
                                                        if (pcase_var.eql(TEN_INTEGER)) {
                                                            return listS(FUNCALL_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args);
                                                        } else {
                                                            if (pcase_var.eql(ELEVEN_INTEGER)) {
                                                                return listS(FUNCALL_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args);
                                                            } else {
                                                                if (pcase_var.eql(TWELVE_INTEGER)) {
                                                                    return listS(FUNCALL_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args);
                                                                } else {
                                                                    if (pcase_var.eql(THIRTEEN_INTEGER)) {
                                                                        return listS(FUNCALL_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args);
                                                                    } else {
                                                                        if (pcase_var.eql(FOURTEEN_INTEGER)) {
                                                                            return listS(FUNCALL_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args);
                                                                        } else {
                                                                            if (pcase_var.eql(FIFTEEN_INTEGER)) {
                                                                                return listS(FUNCALL_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args);
                                                                            } else {
                                                                                if (pcase_var.eql(SIXTEEN_INTEGER)) {
                                                                                    return listS(FUNCALL_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args);
                                                                                } else {
                                                                                    if (pcase_var.eql(SEVENTEEN_INTEGER)) {
                                                                                        return listS(FUNCALL_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args);
                                                                                    } else {
                                                                                        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
                                                                                            return listS(FUNCALL_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args);
                                                                                        } else {
                                                                                            if (pcase_var.eql(NINETEEN_INTEGER)) {
                                                                                                return listS(FUNCALL_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args);
                                                                                            } else {
                                                                                                if (pcase_var.eql(TWENTY_INTEGER)) {
                                                                                                    return listS(FUNCALL_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args);
                                                                                                } else {
                                                                                                    return NIL;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject funcall_instance_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        instance = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = length(args);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return list(FUNCALL_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FOUR_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FIVE_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SIX_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SEVEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(EIGHT_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(NINE_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(ELEVEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWELVE_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(THIRTEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FOURTEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FIFTEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SIXTEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SEVENTEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(NINETEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWENTY_INTEGER)) {
            return listS(FUNCALL_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args);
        }
        return NIL;
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static final SubLObject fim_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(FUNCALL_INSTANCE_METHOD, v_class, method_name, args);
            }
        }
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static SubLObject fim(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(FUNCALL_INSTANCE_METHOD, v_class, method_name, args);
    }

    public static final SubLObject funcall_instance_super_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject instance = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            instance = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt84);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject arg_count = length(args);
                SubLObject pcase_var = arg_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    return list(FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS, instance, method_name);
                } else {
                    if (pcase_var.eql(ONE_INTEGER)) {
                        return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS, instance, method_name, args);
                    } else {
                        if (pcase_var.eql(TWO_INTEGER)) {
                            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS, instance, method_name, args);
                        } else {
                            if (pcase_var.eql(THREE_INTEGER)) {
                                return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS, instance, method_name, args);
                            } else {
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS, instance, method_name, args);
                                } else {
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS, instance, method_name, args);
                                    } else {
                                        if (pcase_var.eql(SIX_INTEGER)) {
                                            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS, instance, method_name, args);
                                        } else {
                                            if (pcase_var.eql(SEVEN_INTEGER)) {
                                                return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS, instance, method_name, args);
                                            } else {
                                                if (pcase_var.eql(EIGHT_INTEGER)) {
                                                    return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS, instance, method_name, args);
                                                } else {
                                                    if (pcase_var.eql(NINE_INTEGER)) {
                                                        return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS, instance, method_name, args);
                                                    } else {
                                                        if (pcase_var.eql(TEN_INTEGER)) {
                                                            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS, instance, method_name, args);
                                                        } else {
                                                            if (pcase_var.eql(ELEVEN_INTEGER)) {
                                                                return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS, instance, method_name, args);
                                                            } else {
                                                                if (pcase_var.eql(TWELVE_INTEGER)) {
                                                                    return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS, instance, method_name, args);
                                                                } else {
                                                                    if (pcase_var.eql(THIRTEEN_INTEGER)) {
                                                                        return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS, instance, method_name, args);
                                                                    } else {
                                                                        if (pcase_var.eql(FOURTEEN_INTEGER)) {
                                                                            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS, instance, method_name, args);
                                                                        } else {
                                                                            if (pcase_var.eql(FIFTEEN_INTEGER)) {
                                                                                return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS, instance, method_name, args);
                                                                            } else {
                                                                                if (pcase_var.eql(SIXTEEN_INTEGER)) {
                                                                                    return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS, instance, method_name, args);
                                                                                } else {
                                                                                    if (pcase_var.eql(SEVENTEEN_INTEGER)) {
                                                                                        return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS, instance, method_name, args);
                                                                                    } else {
                                                                                        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
                                                                                            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS, instance, method_name, args);
                                                                                        } else {
                                                                                            if (pcase_var.eql(NINETEEN_INTEGER)) {
                                                                                                return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS, instance, method_name, args);
                                                                                            } else {
                                                                                                if (pcase_var.eql(TWENTY_INTEGER)) {
                                                                                                    return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS, instance, method_name, args);
                                                                                                } else {
                                                                                                    return NIL;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject funcall_instance_super_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        instance = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = length(args);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return list(FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS, instance, method_name);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FOUR_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FIVE_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SIX_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SEVEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(EIGHT_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(NINE_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(ELEVEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWELVE_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(THIRTEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FOURTEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FIFTEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SIXTEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SEVENTEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(NINETEEN_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWENTY_INTEGER)) {
            return listS(FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS, instance, method_name, args);
        }
        return NIL;
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static final SubLObject fism_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(FUNCALL_INSTANCE_SUPER_METHOD, v_class, method_name, args);
            }
        }
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static SubLObject fism(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(FUNCALL_INSTANCE_SUPER_METHOD, v_class, method_name, args);
    }

    public static final SubLObject funcall_class_or_instance_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject instance = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            instance = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt84);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject arg_count = length(args);
                SubLObject pcase_var = arg_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    return list(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name);
                } else {
                    if (pcase_var.eql(ONE_INTEGER)) {
                        return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args);
                    } else {
                        if (pcase_var.eql(TWO_INTEGER)) {
                            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args);
                        } else {
                            if (pcase_var.eql(THREE_INTEGER)) {
                                return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args);
                            } else {
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args);
                                } else {
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args);
                                    } else {
                                        if (pcase_var.eql(SIX_INTEGER)) {
                                            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args);
                                        } else {
                                            if (pcase_var.eql(SEVEN_INTEGER)) {
                                                return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args);
                                            } else {
                                                if (pcase_var.eql(EIGHT_INTEGER)) {
                                                    return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args);
                                                } else {
                                                    if (pcase_var.eql(NINE_INTEGER)) {
                                                        return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args);
                                                    } else {
                                                        if (pcase_var.eql(TEN_INTEGER)) {
                                                            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args);
                                                        } else {
                                                            if (pcase_var.eql(ELEVEN_INTEGER)) {
                                                                return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args);
                                                            } else {
                                                                if (pcase_var.eql(TWELVE_INTEGER)) {
                                                                    return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args);
                                                                } else {
                                                                    if (pcase_var.eql(THIRTEEN_INTEGER)) {
                                                                        return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args);
                                                                    } else {
                                                                        if (pcase_var.eql(FOURTEEN_INTEGER)) {
                                                                            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args);
                                                                        } else {
                                                                            if (pcase_var.eql(FIFTEEN_INTEGER)) {
                                                                                return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args);
                                                                            } else {
                                                                                if (pcase_var.eql(SIXTEEN_INTEGER)) {
                                                                                    return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args);
                                                                                } else {
                                                                                    if (pcase_var.eql(SEVENTEEN_INTEGER)) {
                                                                                        return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args);
                                                                                    } else {
                                                                                        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
                                                                                            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args);
                                                                                        } else {
                                                                                            if (pcase_var.eql(NINETEEN_INTEGER)) {
                                                                                                return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args);
                                                                                            } else {
                                                                                                if (pcase_var.eql(TWENTY_INTEGER)) {
                                                                                                    return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args);
                                                                                                } else {
                                                                                                    return NIL;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject funcall_class_or_instance_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        instance = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = length(args);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return list(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FOUR_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FIVE_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SIX_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SEVEN_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(EIGHT_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(NINE_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TEN_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(ELEVEN_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWELVE_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(THIRTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FOURTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FIFTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SIXTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SEVENTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(NINETEEN_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWENTY_INTEGER)) {
            return listS(FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args);
        }
        return NIL;
    }

    public static final SubLObject apply_instance_method_alt(SubLObject instance, SubLObject method_name, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != subloop_structures.instance_p(instance)) && method_name.isSymbol())) {
                    Errors.error($str_alt150$APPLY_INSTANCE_METHOD__either_ins, instance, method_name);
                }
            }
            {
                SubLObject v_class = subloop_structures.instance_class(instance);
                SubLObject method = gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == method) {
                        Errors.error($str_alt151$APPLY_INSTANCE_METHOD__No__S_meth, method_name, subloop_structures.class_name(v_class), instance);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == instances.instances_access_check_method(v_class, method)) {
                        Errors.error($classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
                    }
                }
                return apply(subloop_structures.method_function_name(method), instance, args);
            }
        }
    }

    public static SubLObject apply_instance_method(final SubLObject instance, final SubLObject method_name, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == subloop_structures.instance_p(instance)) || (!method_name.isSymbol()))) {
            Errors.error($str150$APPLY_INSTANCE_METHOD__either_ins, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == method)) {
            Errors.error($str151$APPLY_INSTANCE_METHOD__No__S_meth, method_name, subloop_structures.class_name(v_class), instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == instances.instances_access_check_method(v_class, method))) {
            Errors.error($classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return apply(subloop_structures.method_function_name(method), instance, args);
    }

    public static final SubLObject fim_nr_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject instance = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            instance = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt84);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list($sym152$FUNCALL_INSTANCE_METHOD_W_O_RECURSION, instance, method_name, args);
            }
        }
    }

    public static SubLObject fim_nr(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        instance = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list($sym152$FUNCALL_INSTANCE_METHOD_W_O_RECURSION, instance, method_name, args);
    }

    public static final SubLObject funcall_instance_method_wXo_recursion_alt(SubLObject instance, SubLObject method_name, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject key = list(instance, method_name, args);
                {
                    SubLObject _prev_bind_0 = $method_call_stack$.currentBinding(thread);
                    try {
                        $method_call_stack$.bind(NIL != $method_call_stack$.getDynamicValue(thread) ? ((SubLObject) ($method_call_stack$.getDynamicValue(thread))) : make_hash_table(TWENTY_INTEGER, EQUAL, UNPROVIDED), thread);
                        if (NIL == gethash(key, $method_call_stack$.getDynamicValue(thread), UNPROVIDED)) {
                            try {
                                sethash(key, $method_call_stack$.getDynamicValue(thread), T);
                                result = com.cyc.cycjava.cycl.classes_utilities.apply_instance_method(instance, method_name, args);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        remhash(key, $method_call_stack$.getDynamicValue(thread));
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $method_call_stack$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject funcall_instance_method_wXo_recursion(final SubLObject instance, final SubLObject method_name, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject key = list(instance, method_name, args);
        final SubLObject _prev_bind_0 = $method_call_stack$.currentBinding(thread);
        try {
            $method_call_stack$.bind(NIL != $method_call_stack$.getDynamicValue(thread) ? $method_call_stack$.getDynamicValue(thread) : make_hash_table(TWENTY_INTEGER, EQUAL, UNPROVIDED), thread);
            if (NIL == gethash(key, $method_call_stack$.getDynamicValue(thread), UNPROVIDED)) {
                try {
                    sethash(key, $method_call_stack$.getDynamicValue(thread), T);
                    result = apply_instance_method(instance, method_name, args);
                } finally {
                    final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        remhash(key, $method_call_stack$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            }
        } finally {
            $method_call_stack$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject classes_symbol_list_p_alt(SubLObject v_object) {
        if (NIL == v_object) {
            return T;
        } else {
            if (v_object.isCons()) {
                {
                    SubLObject cdolist_list_var = v_object;
                    SubLObject element = NIL;
                    for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                        if (!element.isSymbol()) {
                            return NIL;
                        }
                    }
                }
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject classes_symbol_list_p(final SubLObject v_object) {
        if (NIL == v_object) {
            return T;
        }
        if (v_object.isCons()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject element = NIL;
            element = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!element.isSymbol()) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject classes_npartition_list_alt(SubLObject item, SubLObject sequence, SubLObject key, SubLObject test) {
        if (key == UNPROVIDED) {
            key = IDENTITY;
        }
        if (test == UNPROVIDED) {
            test = EQ;
        }
        {
            SubLObject match_list = NIL;
            SubLObject not_match_list = NIL;
            SubLObject element_dekeyed = NIL;
            SubLObject match = NIL;
            SubLObject next_cons_var = NIL;
            SubLObject sublist = NIL;
            SubLObject element = NIL;
            for (sublist = sequence, element = sublist.first(); NIL != sublist; sublist = next_cons_var , element = sublist.first()) {
                next_cons_var = sublist.rest();
                {
                    SubLObject pcase_var = key;
                    if (pcase_var.eql(IDENTITY)) {
                        element_dekeyed = identity(element);
                    } else {
                        if (pcase_var.eql(CAR)) {
                            element_dekeyed = element.first();
                        } else {
                            element_dekeyed = funcall(key, element);
                        }
                    }
                }
                {
                    SubLObject pcase_var = test;
                    if (pcase_var.eql(EQ)) {
                        match = eq(item, element_dekeyed);
                    } else {
                        if (pcase_var.eql(EQL)) {
                            match = eql(item, element_dekeyed);
                        } else {
                            if (pcase_var.eql(EQUAL)) {
                                match = equal(item, element_dekeyed);
                            } else {
                                if (pcase_var.eql($sym154$_)) {
                                    match = numE(item, element_dekeyed);
                                } else {
                                    if (pcase_var.eql(STRING_EQUAL)) {
                                        match = Strings.string_equal(item, element_dekeyed, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        match = funcall(test, item, element_dekeyed);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL != match) {
                    rplacd(sublist, match_list);
                    match_list = sublist;
                } else {
                    rplacd(sublist, not_match_list);
                    not_match_list = sublist;
                }
            }
            return values(nreverse(match_list), nreverse(not_match_list));
        }
    }

    public static SubLObject classes_npartition_list(final SubLObject item, final SubLObject sequence, SubLObject key, SubLObject test) {
        if (key == UNPROVIDED) {
            key = IDENTITY;
        }
        if (test == UNPROVIDED) {
            test = EQ;
        }
        SubLObject match_list = NIL;
        SubLObject not_match_list = NIL;
        SubLObject element_dekeyed = NIL;
        SubLObject match = NIL;
        SubLObject next_cons_var = NIL;
        SubLObject sublist = NIL;
        SubLObject element = NIL;
        sublist = sequence;
        element = sublist.first();
        while (NIL != sublist) {
            next_cons_var = sublist.rest();
            SubLObject pcase_var = key;
            if (pcase_var.eql(IDENTITY)) {
                element_dekeyed = identity(element);
            } else
                if (pcase_var.eql(CAR)) {
                    element_dekeyed = element.first();
                } else {
                    element_dekeyed = funcall(key, element);
                }

            pcase_var = test;
            if (pcase_var.eql(EQ)) {
                match = eq(item, element_dekeyed);
            } else
                if (pcase_var.eql(EQL)) {
                    match = eql(item, element_dekeyed);
                } else
                    if (pcase_var.eql(EQUAL)) {
                        match = equal(item, element_dekeyed);
                    } else
                        if (pcase_var.eql($sym154$_)) {
                            match = numE(item, element_dekeyed);
                        } else
                            if (pcase_var.eql(STRING_EQUAL)) {
                                match = Strings.string_equal(item, element_dekeyed, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                match = funcall(test, item, element_dekeyed);
                            }




            if (NIL != match) {
                rplacd(sublist, match_list);
                match_list = sublist;
            } else {
                rplacd(sublist, not_match_list);
                not_match_list = sublist;
            }
            sublist = next_cons_var;
            element = sublist.first();
        } 
        return values(nreverse(match_list), nreverse(not_match_list));
    }

    public static final SubLObject classes_npartition_list_macro_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt156);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject settable_match_loc = NIL;
                    SubLObject settable_no_match_loc = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt156);
                    settable_match_loc = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt156);
                    settable_no_match_loc = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject item = NIL;
                            SubLObject sequence = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt156);
                            item = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt156);
                            sequence = current.first();
                            current = current.rest();
                            {
                                SubLObject key = (current.isCons()) ? ((SubLObject) (current.first())) : IDENTITY;
                                destructuring_bind_must_listp(current, datum, $list_alt156);
                                current = current.rest();
                                {
                                    SubLObject test = (current.isCons()) ? ((SubLObject) (current.first())) : EQ;
                                    destructuring_bind_must_listp(current, datum, $list_alt156);
                                    current = current.rest();
                                    if (NIL == current) {
                                        {
                                            SubLObject item_var = make_symbol($$$item);
                                            SubLObject match_list_var = make_symbol($str_alt158$match_list);
                                            SubLObject not_match_list_var = make_symbol($str_alt159$not_match_list);
                                            SubLObject element_var = make_symbol($$$element);
                                            SubLObject sublist_var = make_symbol($$$sublist);
                                            return list(CLET, list(list(item_var, item), bq_cons(match_list_var, $list_alt162), bq_cons(not_match_list_var, $list_alt162)), list(CDOLIST_AND_SUBLISTS_CAREFULLY, list(element_var, sublist_var, sequence), list(PIF, list(test, list(key, element_var), item_var), list(PROGN, list(RPLACD, sublist_var, match_list_var), list(CSETQ, match_list_var, sublist_var)), list(PROGN, list(RPLACD, sublist_var, not_match_list_var), list(CSETQ, not_match_list_var, sublist_var)))), list(CSETF, settable_match_loc, list(NREVERSE, match_list_var)), list(CSETF, settable_no_match_loc, list(NREVERSE, not_match_list_var)));
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt156);
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt156);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject classes_npartition_list_macro(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject settable_match_loc = NIL;
        SubLObject settable_no_match_loc = NIL;
        destructuring_bind_must_consp(current, datum, $list156);
        settable_match_loc = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list156);
        settable_no_match_loc = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject item = NIL;
            SubLObject sequence = NIL;
            destructuring_bind_must_consp(current, datum, $list156);
            item = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list156);
            sequence = current.first();
            current = current.rest();
            final SubLObject key = (current.isCons()) ? current.first() : IDENTITY;
            destructuring_bind_must_listp(current, datum, $list156);
            current = current.rest();
            final SubLObject test = (current.isCons()) ? current.first() : EQ;
            destructuring_bind_must_listp(current, datum, $list156);
            current = current.rest();
            if (NIL == current) {
                final SubLObject item_var = make_symbol($$$item);
                final SubLObject match_list_var = make_symbol($str158$match_list);
                final SubLObject not_match_list_var = make_symbol($str159$not_match_list);
                final SubLObject element_var = make_symbol($$$element);
                final SubLObject sublist_var = make_symbol($$$sublist);
                return list(CLET, list(list(item_var, item), bq_cons(match_list_var, $list162), bq_cons(not_match_list_var, $list162)), list(CDOLIST_AND_SUBLISTS_CAREFULLY, list(element_var, sublist_var, sequence), list(PIF, list(test, list(key, element_var), item_var), list(PROGN, list(RPLACD, sublist_var, match_list_var), list(CSETQ, match_list_var, sublist_var)), list(PROGN, list(RPLACD, sublist_var, not_match_list_var), list(CSETQ, not_match_list_var, sublist_var)))), list(CSETF, settable_match_loc, list(NREVERSE, match_list_var)), list(CSETF, settable_no_match_loc, list(NREVERSE, not_match_list_var)));
            }
            cdestructuring_bind_error(datum, $list156);
        } else {
            cdestructuring_bind_error(datum, $list156);
        }
        return NIL;
    }

    public static final SubLObject classes_check_do_classes_in_order_parameters_alt(SubLObject var, SubLObject base_class, SubLObject listed_optional_depth_var, SubLObject forms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(var.isSymbol() && (NIL != var))) {
                    Errors.error($str_alt168$DO_CLASSES_IN_ORDER___S_is_not_a_, var);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == listed_optional_depth_var) || (((listed_optional_depth_var.isCons() && listed_optional_depth_var.first().isSymbol()) && (NIL != listed_optional_depth_var.first())) && (NIL == listed_optional_depth_var.rest())))) {
                    Errors.error($str_alt169$DO_CLASSES_IN_ORDER___S_is_not_a_, listed_optional_depth_var);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!forms.isList()) {
                    Errors.error($str_alt170$DO_CLASSES_IN_ORDER___S_is_not_a_, forms);
                }
            }
            return T;
        }
    }

    public static SubLObject classes_check_do_classes_in_order_parameters(final SubLObject var, final SubLObject base_class, final SubLObject listed_optional_depth_var, final SubLObject forms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!var.isSymbol()) || (NIL == var))) {
            Errors.error($str168$DO_CLASSES_IN_ORDER___S_is_not_a_, var);
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != listed_optional_depth_var)) && ((((!listed_optional_depth_var.isCons()) || (!listed_optional_depth_var.first().isSymbol())) || (NIL == listed_optional_depth_var.first())) || (NIL != listed_optional_depth_var.rest()))) {
            Errors.error($str169$DO_CLASSES_IN_ORDER___S_is_not_a_, listed_optional_depth_var);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!forms.isList())) {
            Errors.error($str170$DO_CLASSES_IN_ORDER___S_is_not_a_, forms);
        }
        return T;
    }

    /**
     * Returns a function object IFF the function implementing the method identified
     * by METHOD-SYMBOL of the class CLASS-OR-CLASS-SYMBOL is known and is FBOUNDP,
     * and NIL otherwise.
     */
    @LispMethod(comment = "Returns a function object IFF the function implementing the method identified\r\nby METHOD-SYMBOL of the class CLASS-OR-CLASS-SYMBOL is known and is FBOUNDP,\r\nand NIL otherwise.\nReturns a function object IFF the function implementing the method identified\nby METHOD-SYMBOL of the class CLASS-OR-CLASS-SYMBOL is known and is FBOUNDP,\nand NIL otherwise.")
    public static final SubLObject method_bound_p_alt(SubLObject class_or_class_symbol, SubLObject method_symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_class = class_or_class_symbol;
                if (v_class.isSymbol()) {
                    v_class = classes.classes_retrieve_class(v_class);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == subloop_structures.class_p(v_class)) {
                        Errors.error($str_alt171$Class__A_not_recognized_, class_or_class_symbol);
                    }
                }
                {
                    SubLObject method = gethash(method_symbol, subloop_structures.class_tablified_instance_methods(v_class), UNPROVIDED);
                    if (NIL == subloop_structures.method_p(method)) {
                        return NIL;
                    }
                    {
                        SubLObject method_function = subloop_structures.method_function_name(method);
                        return fboundp(method_function);
                    }
                }
            }
        }
    }

    /**
     * Returns a function object IFF the function implementing the method identified
     * by METHOD-SYMBOL of the class CLASS-OR-CLASS-SYMBOL is known and is FBOUNDP,
     * and NIL otherwise.
     */
    @LispMethod(comment = "Returns a function object IFF the function implementing the method identified\r\nby METHOD-SYMBOL of the class CLASS-OR-CLASS-SYMBOL is known and is FBOUNDP,\r\nand NIL otherwise.\nReturns a function object IFF the function implementing the method identified\nby METHOD-SYMBOL of the class CLASS-OR-CLASS-SYMBOL is known and is FBOUNDP,\nand NIL otherwise.")
    public static SubLObject method_bound_p(final SubLObject class_or_class_symbol, final SubLObject method_symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_class = class_or_class_symbol;
        if (v_class.isSymbol()) {
            v_class = classes.classes_retrieve_class(v_class);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.class_p(v_class))) {
            Errors.error($str171$Class__A_not_recognized_, class_or_class_symbol);
        }
        final SubLObject method = gethash(method_symbol, subloop_structures.class_tablified_instance_methods(v_class), UNPROVIDED);
        if (NIL == subloop_structures.method_p(method)) {
            return NIL;
        }
        final SubLObject method_function = subloop_structures.method_function_name(method);
        return fboundp(method_function);
    }

    /**
     * Returns a list of all valid members of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.
     */
    @LispMethod(comment = "Returns a list of all valid members of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.")
    public static final SubLObject valid_subloop_safe_funcaller_error_values_alt() {
        return $valid_subloop_safe_funcaller_error_values$.getGlobalValue();
    }

    /**
     * Returns a list of all valid members of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.
     */
    @LispMethod(comment = "Returns a list of all valid members of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.")
    public static SubLObject valid_subloop_safe_funcaller_error_values() {
        return $valid_subloop_safe_funcaller_error_values$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.
     */
    @LispMethod(comment = "Return T iff OBJECT is a member of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.")
    public static final SubLObject subloop_safe_funcaller_error_value_p_alt(SubLObject v_object) {
        return NIL != member(v_object, $valid_subloop_safe_funcaller_error_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Return T iff OBJECT is a member of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.
     */
    @LispMethod(comment = "Return T iff OBJECT is a member of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.")
    public static SubLObject subloop_safe_funcaller_error_value_p(final SubLObject v_object) {
        return NIL != member(v_object, $valid_subloop_safe_funcaller_error_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    /**
     * Maps a member of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration to an integer encoding.
     */
    @LispMethod(comment = "Maps a member of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration to an integer encoding.")
    public static final SubLObject encode_subloop_safe_funcaller_error_value_alt(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_subloop_safe_funcaller_error_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt174$_S___S_is_not_a_member_of_the__S_, ENCODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE, value, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps a member of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration to an integer encoding.
     */
    @LispMethod(comment = "Maps a member of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration to an integer encoding.")
    public static SubLObject encode_subloop_safe_funcaller_error_value(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos = position(value, $valid_subloop_safe_funcaller_error_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == pos)) {
            Errors.error($str174$_S___S_is_not_a_member_of_the__S_, ENCODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE, value, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
        }
        return pos;
    }

    /**
     * Maps an encoded value to a member of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.
     */
    @LispMethod(comment = "Maps an encoded value to a member of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.")
    public static final SubLObject decode_subloop_safe_funcaller_error_value_alt(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_subloop_safe_funcaller_error_values$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt176$_S___S_is_not_a_valid_encoding_of, DECODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE, value, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.
     */
    @LispMethod(comment = "Maps an encoded value to a member of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.")
    public static SubLObject decode_subloop_safe_funcaller_error_value(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject element = nth(value, $valid_subloop_safe_funcaller_error_values$.getGlobalValue());
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == element)) {
            Errors.error($str176$_S___S_is_not_a_valid_encoding_of, DECODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE, value, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
        }
        return element;
    }

    /**
     * Provides a LESSP predicate for members of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.
     */
    @LispMethod(comment = "Provides a LESSP predicate for members of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.")
    public static final SubLObject subloop_safe_funcaller_error_value_less_p_alt(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.classes_utilities.subloop_safe_funcaller_error_value_p(value1)) {
                    Errors.error($str_alt178$_S___S_was_expected_to_be_a_membe, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value1, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.classes_utilities.subloop_safe_funcaller_error_value_p(value2)) {
                    Errors.error($str_alt178$_S___S_was_expected_to_be_a_membe, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value2, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_subloop_safe_funcaller_error_values$.getGlobalValue();
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (value == value1) {
                        return makeBoolean(value != value2);
                    } else {
                        if (value == value2) {
                            return NIL;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Provides a LESSP predicate for members of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.
     */
    @LispMethod(comment = "Provides a LESSP predicate for members of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.")
    public static SubLObject subloop_safe_funcaller_error_value_less_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_safe_funcaller_error_value_p(value1))) {
            Errors.error($str178$_S___S_was_expected_to_be_a_membe, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value1, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_safe_funcaller_error_value_p(value2))) {
            Errors.error($str178$_S___S_was_expected_to_be_a_membe, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value2, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
        }
        SubLObject cdolist_list_var = $valid_subloop_safe_funcaller_error_values$.getGlobalValue();
        SubLObject value3 = NIL;
        value3 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (value3.eql(value1)) {
                return makeBoolean(!value3.eql(value2));
            }
            if (value3.eql(value2)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Provides a GREATERP predicate for members of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.
     */
    @LispMethod(comment = "Provides a GREATERP predicate for members of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.")
    public static final SubLObject subloop_safe_funcaller_error_value_greater_p_alt(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.classes_utilities.subloop_safe_funcaller_error_value_p(value1)) {
                    Errors.error($str_alt178$_S___S_was_expected_to_be_a_membe, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value1, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.classes_utilities.subloop_safe_funcaller_error_value_p(value2)) {
                    Errors.error($str_alt178$_S___S_was_expected_to_be_a_membe, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value2, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_subloop_safe_funcaller_error_values$.getGlobalValue();
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (value == value2) {
                        return makeBoolean(value != value1);
                    } else {
                        if (value == value1) {
                            return NIL;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Provides a GREATERP predicate for members of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.
     */
    @LispMethod(comment = "Provides a GREATERP predicate for members of the SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE enumeration.")
    public static SubLObject subloop_safe_funcaller_error_value_greater_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_safe_funcaller_error_value_p(value1))) {
            Errors.error($str178$_S___S_was_expected_to_be_a_membe, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value1, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_safe_funcaller_error_value_p(value2))) {
            Errors.error($str178$_S___S_was_expected_to_be_a_membe, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value2, SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
        }
        SubLObject cdolist_list_var = $valid_subloop_safe_funcaller_error_values$.getGlobalValue();
        SubLObject value3 = NIL;
        value3 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (value3.eql(value2)) {
                return makeBoolean(!value3.eql(value1));
            }
            if (value3.eql(value1)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject define_safe_class_method_funcallers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name_template = NIL;
            SubLObject max_args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            max_args = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject function_defs = NIL;
                    SubLObject arg_list = NIL;
                    SubLObject function_name = NIL;
                    SubLObject function_def = NIL;
                    SubLObject cdotimes_end_var = add(max_args, ONE_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                        function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(CLASS_NAME_OR_CLASS, METHOD_NAME, arg_list), list(CLET, $list_alt8, $list_alt180, $list_alt181, list(CLET, $list_alt11, $list_alt182, $list_alt183, list(CLET, $list_alt184, $list_alt185, list(RET, listS(VALUES, listS(FUNCALL, FUNCTION_REF, CLASS, arg_list), $list_alt162)))))));
                        function_defs = cons(function_def, function_defs);
                        arg_list = nreverse(cons(intern(format(NIL, $str_alt19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
                    }
                    return bq_cons(PROGN, nreverse(function_defs));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt3);
            }
        }
        return NIL;
    }

    public static SubLObject define_safe_class_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = NIL;
        SubLObject max_args = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        max_args = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject function_defs = NIL;
            SubLObject arg_list = NIL;
            SubLObject function_name = NIL;
            SubLObject function_def = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = add(max_args, ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(CLASS_NAME_OR_CLASS, METHOD_NAME, arg_list), list(CLET, $list8, $list180, $list181, list(CLET, $list11, $list182, $list183, list(CLET, $list184, $list185, list(RET, listS(VALUES, listS(FUNCALL, FUNCTION_REF, CLASS, arg_list), $list162)))))));
                function_defs = cons(function_def, function_defs);
                arg_list = nreverse(cons(intern(format(NIL, $str19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
            }
            return bq_cons(PROGN, nreverse(function_defs));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static final SubLObject define_safe_class_super_method_funcallers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name_template = NIL;
            SubLObject max_args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            max_args = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject function_defs = NIL;
                    SubLObject arg_list = NIL;
                    SubLObject function_name = NIL;
                    SubLObject function_def = NIL;
                    SubLObject cdotimes_end_var = add(max_args, ONE_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                        function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(CLASS_NAME_OR_CLASS, METHOD_NAME, arg_list), list(CLET, $list_alt8, $list_alt180, $list_alt181, list(CLET, $list_alt23, $list_alt182, $list_alt183, list(CLET, $list_alt184, $list_alt185, list(RET, listS(VALUES, listS(FUNCALL, FUNCTION_REF, CLASS, arg_list), $list_alt162)))))));
                        function_defs = cons(function_def, function_defs);
                        arg_list = nreverse(cons(intern(format(NIL, $str_alt19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
                    }
                    return bq_cons(PROGN, nreverse(function_defs));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt3);
            }
        }
        return NIL;
    }

    public static SubLObject define_safe_class_super_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = NIL;
        SubLObject max_args = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        max_args = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject function_defs = NIL;
            SubLObject arg_list = NIL;
            SubLObject function_name = NIL;
            SubLObject function_def = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = add(max_args, ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(CLASS_NAME_OR_CLASS, METHOD_NAME, arg_list), list(CLET, $list8, $list180, $list181, list(CLET, $list23, $list182, $list183, list(CLET, $list184, $list185, list(RET, listS(VALUES, listS(FUNCALL, FUNCTION_REF, CLASS, arg_list), $list162)))))));
                function_defs = cons(function_def, function_defs);
                arg_list = nreverse(cons(intern(format(NIL, $str19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
            }
            return bq_cons(PROGN, nreverse(function_defs));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static final SubLObject define_safe_instance_method_funcallers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name_template = NIL;
            SubLObject class_name_template = NIL;
            SubLObject max_args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            class_name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            max_args = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject function_defs = NIL;
                    SubLObject arg_list = NIL;
                    SubLObject function_name = NIL;
                    SubLObject class_function_name = NIL;
                    SubLObject function_def = NIL;
                    SubLObject cdotimes_end_var = add(max_args, ONE_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                        class_function_name = intern(format(NIL, class_name_template, i), UNPROVIDED);
                        function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(INSTANCE, METHOD_NAME, arg_list), $list_alt188, $list_alt181, list(CLET, $list_alt28, list(PIF, METHOD, list(PROGN, $list_alt183, list(CLET, $list_alt184, $list_alt185, list(RET, listS(VALUES, listS(FUNCALL, FUNCTION_REF, INSTANCE, arg_list), $list_alt162)))), list(RET, listS(class_function_name, CLASS, METHOD_NAME, arg_list))))));
                        function_defs = cons(function_def, function_defs);
                        arg_list = nreverse(cons(intern(format(NIL, $str_alt19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
                    }
                    return bq_cons(PROGN, nreverse(function_defs));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt25);
            }
        }
        return NIL;
    }

    public static SubLObject define_safe_instance_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = NIL;
        SubLObject class_name_template = NIL;
        SubLObject max_args = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        class_name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        max_args = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject function_defs = NIL;
            SubLObject arg_list = NIL;
            SubLObject function_name = NIL;
            SubLObject class_function_name = NIL;
            SubLObject function_def = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = add(max_args, ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                class_function_name = intern(format(NIL, class_name_template, i), UNPROVIDED);
                function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(INSTANCE, METHOD_NAME, arg_list), $list188, $list181, list(CLET, $list28, list(PIF, METHOD, list(PROGN, $list183, list(CLET, $list184, $list185, list(RET, listS(VALUES, listS(FUNCALL, FUNCTION_REF, INSTANCE, arg_list), $list162)))), list(RET, listS(class_function_name, CLASS, METHOD_NAME, arg_list))))));
                function_defs = cons(function_def, function_defs);
                arg_list = nreverse(cons(intern(format(NIL, $str19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
            }
            return bq_cons(PROGN, nreverse(function_defs));
        }
        cdestructuring_bind_error(datum, $list25);
        return NIL;
    }

    public static final SubLObject define_safe_instance_super_method_funcallers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name_template = NIL;
            SubLObject class_name_template = NIL;
            SubLObject max_args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            class_name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            max_args = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject function_defs = NIL;
                    SubLObject arg_list = NIL;
                    SubLObject function_name = NIL;
                    SubLObject class_function_name = NIL;
                    SubLObject function_def = NIL;
                    SubLObject cdotimes_end_var = add(max_args, ONE_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                        class_function_name = intern(format(NIL, class_name_template, i), UNPROVIDED);
                        function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(INSTANCE, METHOD_NAME, arg_list), $list_alt188, $list_alt189, list(CLET, $list_alt31, list(PIF, METHOD, list(PROGN, $list_alt183, list(CLET, $list_alt184, $list_alt185, list(RET, listS(VALUES, listS(FUNCALL, FUNCTION_REF, INSTANCE, arg_list), $list_alt162)))), list(RET, listS(class_function_name, CLASS, METHOD_NAME, arg_list))))));
                        function_defs = cons(function_def, function_defs);
                        arg_list = nreverse(cons(intern(format(NIL, $str_alt19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
                    }
                    return bq_cons(PROGN, nreverse(function_defs));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt25);
            }
        }
        return NIL;
    }

    public static SubLObject define_safe_instance_super_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = NIL;
        SubLObject class_name_template = NIL;
        SubLObject max_args = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        class_name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        max_args = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject function_defs = NIL;
            SubLObject arg_list = NIL;
            SubLObject function_name = NIL;
            SubLObject class_function_name = NIL;
            SubLObject function_def = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = add(max_args, ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                class_function_name = intern(format(NIL, class_name_template, i), UNPROVIDED);
                function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(INSTANCE, METHOD_NAME, arg_list), $list188, $list189, list(CLET, $list31, list(PIF, METHOD, list(PROGN, $list183, list(CLET, $list184, $list185, list(RET, listS(VALUES, listS(FUNCALL, FUNCTION_REF, INSTANCE, arg_list), $list162)))), list(RET, listS(class_function_name, CLASS, METHOD_NAME, arg_list))))));
                function_defs = cons(function_def, function_defs);
                arg_list = nreverse(cons(intern(format(NIL, $str19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
            }
            return bq_cons(PROGN, nreverse(function_defs));
        }
        cdestructuring_bind_error(datum, $list25);
        return NIL;
    }

    public static final SubLObject define_safe_class_or_instance_method_funcallers_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name_template = NIL;
            SubLObject max_args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            name_template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            max_args = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject function_defs = NIL;
                    SubLObject arg_list = NIL;
                    SubLObject function_name = NIL;
                    SubLObject function_def = NIL;
                    SubLObject cdotimes_end_var = add(max_args, ONE_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                        function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(CLASS_OR_INSTANCE, METHOD_NAME, arg_list), $list_alt181, list(PIF, $list_alt34, list(CLET, $list_alt35, listS(PIF, METHOD, list(PROGN, $list_alt183, list(CLET, $list_alt184, $list_alt185, list(RET, listS(VALUES, listS(FUNCALL, FUNCTION_REF, CLASS_OR_INSTANCE, arg_list), $list_alt162)))), $list_alt190)), list(CLET, $list_alt37, $list_alt180, $list_alt191, $list_alt192, list(CLET, $list_alt184, $list_alt185, list(RET, listS(VALUES, listS(FUNCALL, FUNCTION_REF, CLASS, arg_list), $list_alt162)))))));
                        function_defs = cons(function_def, function_defs);
                        arg_list = nreverse(cons(intern(format(NIL, $str_alt19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
                    }
                    return bq_cons(PROGN, nreverse(function_defs));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt3);
            }
        }
        return NIL;
    }

    public static SubLObject define_safe_class_or_instance_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = NIL;
        SubLObject max_args = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        name_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        max_args = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject function_defs = NIL;
            SubLObject arg_list = NIL;
            SubLObject function_name = NIL;
            SubLObject function_def = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = add(max_args, ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                function_name = intern(format(NIL, name_template, i), UNPROVIDED);
                function_def = copy_tree(list(DEFINE_PUBLIC, function_name, listS(CLASS_OR_INSTANCE, METHOD_NAME, arg_list), $list181, list(PIF, $list34, list(CLET, $list35, listS(PIF, METHOD, list(PROGN, $list183, list(CLET, $list184, $list185, list(RET, listS(VALUES, listS(FUNCALL, FUNCTION_REF, CLASS_OR_INSTANCE, arg_list), $list162)))), $list190)), list(CLET, $list37, $list180, $list191, $list192, list(CLET, $list184, $list185, list(RET, listS(VALUES, listS(FUNCALL, FUNCTION_REF, CLASS, arg_list), $list162)))))));
                function_defs = cons(function_def, function_defs);
                arg_list = nreverse(cons(intern(format(NIL, $str19$ARG_S, i), UNPROVIDED), nreverse(arg_list)));
            }
            return bq_cons(PROGN, nreverse(function_defs));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static final SubLObject safe_funcall_class_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject arg_count = length(args);
                SubLObject pcase_var = arg_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    return list(SAFE_FUNCALL_CLASS_METHOD_WITH_0_ARGS, v_class, method_name);
                } else {
                    if (pcase_var.eql(ONE_INTEGER)) {
                        return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_1_ARGS, v_class, method_name, args);
                    } else {
                        if (pcase_var.eql(TWO_INTEGER)) {
                            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_2_ARGS, v_class, method_name, args);
                        } else {
                            if (pcase_var.eql(THREE_INTEGER)) {
                                return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_3_ARGS, v_class, method_name, args);
                            } else {
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_4_ARGS, v_class, method_name, args);
                                } else {
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_5_ARGS, v_class, method_name, args);
                                    } else {
                                        if (pcase_var.eql(SIX_INTEGER)) {
                                            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_6_ARGS, v_class, method_name, args);
                                        } else {
                                            if (pcase_var.eql(SEVEN_INTEGER)) {
                                                return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_7_ARGS, v_class, method_name, args);
                                            } else {
                                                if (pcase_var.eql(EIGHT_INTEGER)) {
                                                    return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_8_ARGS, v_class, method_name, args);
                                                } else {
                                                    if (pcase_var.eql(NINE_INTEGER)) {
                                                        return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_9_ARGS, v_class, method_name, args);
                                                    } else {
                                                        if (pcase_var.eql(TEN_INTEGER)) {
                                                            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_10_ARGS, v_class, method_name, args);
                                                        } else {
                                                            if (pcase_var.eql(ELEVEN_INTEGER)) {
                                                                return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_11_ARGS, v_class, method_name, args);
                                                            } else {
                                                                if (pcase_var.eql(TWELVE_INTEGER)) {
                                                                    return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_12_ARGS, v_class, method_name, args);
                                                                } else {
                                                                    if (pcase_var.eql(THIRTEEN_INTEGER)) {
                                                                        return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_13_ARGS, v_class, method_name, args);
                                                                    } else {
                                                                        if (pcase_var.eql(FOURTEEN_INTEGER)) {
                                                                            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_14_ARGS, v_class, method_name, args);
                                                                        } else {
                                                                            if (pcase_var.eql(FIFTEEN_INTEGER)) {
                                                                                return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_15_ARGS, v_class, method_name, args);
                                                                            } else {
                                                                                if (pcase_var.eql(SIXTEEN_INTEGER)) {
                                                                                    return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_16_ARGS, v_class, method_name, args);
                                                                                } else {
                                                                                    if (pcase_var.eql(SEVENTEEN_INTEGER)) {
                                                                                        return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_17_ARGS, v_class, method_name, args);
                                                                                    } else {
                                                                                        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
                                                                                            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_18_ARGS, v_class, method_name, args);
                                                                                        } else {
                                                                                            if (pcase_var.eql(NINETEEN_INTEGER)) {
                                                                                                return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_19_ARGS, v_class, method_name, args);
                                                                                            } else {
                                                                                                if (pcase_var.eql(TWENTY_INTEGER)) {
                                                                                                    return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_20_ARGS, v_class, method_name, args);
                                                                                                } else {
                                                                                                    return NIL;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject safe_funcall_class_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = length(args);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return list(SAFE_FUNCALL_CLASS_METHOD_WITH_0_ARGS, v_class, method_name);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_1_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_2_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_3_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FOUR_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_4_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FIVE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_5_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SIX_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_6_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SEVEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_7_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(EIGHT_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_8_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(NINE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_9_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_10_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(ELEVEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_11_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TWELVE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_12_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(THIRTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_13_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FOURTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_14_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FIFTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_15_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SIXTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_16_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SEVENTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_17_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_18_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(NINETEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_19_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TWENTY_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_METHOD_WITH_20_ARGS, v_class, method_name, args);
        }
        return NIL;
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static final SubLObject sfcm_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(SAFE_FUNCALL_CLASS_METHOD, v_class, method_name, args);
            }
        }
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static SubLObject sfcm(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(SAFE_FUNCALL_CLASS_METHOD, v_class, method_name, args);
    }

    public static final SubLObject safe_funcall_class_super_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject arg_count = length(args);
                SubLObject pcase_var = arg_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    return list(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS, v_class, method_name);
                } else {
                    if (pcase_var.eql(ONE_INTEGER)) {
                        return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS, v_class, method_name, args);
                    } else {
                        if (pcase_var.eql(TWO_INTEGER)) {
                            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS, v_class, method_name, args);
                        } else {
                            if (pcase_var.eql(THREE_INTEGER)) {
                                return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS, v_class, method_name, args);
                            } else {
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS, v_class, method_name, args);
                                } else {
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS, v_class, method_name, args);
                                    } else {
                                        if (pcase_var.eql(SIX_INTEGER)) {
                                            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS, v_class, method_name, args);
                                        } else {
                                            if (pcase_var.eql(SEVEN_INTEGER)) {
                                                return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS, v_class, method_name, args);
                                            } else {
                                                if (pcase_var.eql(EIGHT_INTEGER)) {
                                                    return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS, v_class, method_name, args);
                                                } else {
                                                    if (pcase_var.eql(NINE_INTEGER)) {
                                                        return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS, v_class, method_name, args);
                                                    } else {
                                                        if (pcase_var.eql(TEN_INTEGER)) {
                                                            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS, v_class, method_name, args);
                                                        } else {
                                                            if (pcase_var.eql(ELEVEN_INTEGER)) {
                                                                return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS, v_class, method_name, args);
                                                            } else {
                                                                if (pcase_var.eql(TWELVE_INTEGER)) {
                                                                    return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS, v_class, method_name, args);
                                                                } else {
                                                                    if (pcase_var.eql(THIRTEEN_INTEGER)) {
                                                                        return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS, v_class, method_name, args);
                                                                    } else {
                                                                        if (pcase_var.eql(FOURTEEN_INTEGER)) {
                                                                            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS, v_class, method_name, args);
                                                                        } else {
                                                                            if (pcase_var.eql(FIFTEEN_INTEGER)) {
                                                                                return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS, v_class, method_name, args);
                                                                            } else {
                                                                                if (pcase_var.eql(SIXTEEN_INTEGER)) {
                                                                                    return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS, v_class, method_name, args);
                                                                                } else {
                                                                                    if (pcase_var.eql(SEVENTEEN_INTEGER)) {
                                                                                        return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS, v_class, method_name, args);
                                                                                    } else {
                                                                                        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
                                                                                            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS, v_class, method_name, args);
                                                                                        } else {
                                                                                            if (pcase_var.eql(NINETEEN_INTEGER)) {
                                                                                                return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS, v_class, method_name, args);
                                                                                            } else {
                                                                                                if (pcase_var.eql(TWENTY_INTEGER)) {
                                                                                                    return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS, v_class, method_name, args);
                                                                                                } else {
                                                                                                    return NIL;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject safe_funcall_class_super_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = length(args);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return list(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS, v_class, method_name);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FOUR_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FIVE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SIX_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SEVEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(EIGHT_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(NINE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(ELEVEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TWELVE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(THIRTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FOURTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(FIFTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SIXTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(SEVENTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(NINETEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql(TWENTY_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS, v_class, method_name, args);
        }
        return NIL;
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static final SubLObject sfcsm_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD, v_class, method_name, args);
            }
        }
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static SubLObject sfcsm(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(SAFE_FUNCALL_CLASS_SUPER_METHOD, v_class, method_name, args);
    }

    public static final SubLObject safe_funcall_instance_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject instance = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            instance = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt84);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject arg_count = length(args);
                SubLObject pcase_var = arg_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    return list(SAFE_FUNCALL_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name);
                } else {
                    if (pcase_var.eql(ONE_INTEGER)) {
                        return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args);
                    } else {
                        if (pcase_var.eql(TWO_INTEGER)) {
                            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args);
                        } else {
                            if (pcase_var.eql(THREE_INTEGER)) {
                                return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args);
                            } else {
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args);
                                } else {
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args);
                                    } else {
                                        if (pcase_var.eql(SIX_INTEGER)) {
                                            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args);
                                        } else {
                                            if (pcase_var.eql(SEVEN_INTEGER)) {
                                                return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args);
                                            } else {
                                                if (pcase_var.eql(EIGHT_INTEGER)) {
                                                    return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args);
                                                } else {
                                                    if (pcase_var.eql(NINE_INTEGER)) {
                                                        return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args);
                                                    } else {
                                                        if (pcase_var.eql(TEN_INTEGER)) {
                                                            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args);
                                                        } else {
                                                            if (pcase_var.eql(ELEVEN_INTEGER)) {
                                                                return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args);
                                                            } else {
                                                                if (pcase_var.eql(TWELVE_INTEGER)) {
                                                                    return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args);
                                                                } else {
                                                                    if (pcase_var.eql(THIRTEEN_INTEGER)) {
                                                                        return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args);
                                                                    } else {
                                                                        if (pcase_var.eql(FOURTEEN_INTEGER)) {
                                                                            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args);
                                                                        } else {
                                                                            if (pcase_var.eql(FIFTEEN_INTEGER)) {
                                                                                return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args);
                                                                            } else {
                                                                                if (pcase_var.eql(SIXTEEN_INTEGER)) {
                                                                                    return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args);
                                                                                } else {
                                                                                    if (pcase_var.eql(SEVENTEEN_INTEGER)) {
                                                                                        return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args);
                                                                                    } else {
                                                                                        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
                                                                                            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args);
                                                                                        } else {
                                                                                            if (pcase_var.eql(NINETEEN_INTEGER)) {
                                                                                                return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args);
                                                                                            } else {
                                                                                                if (pcase_var.eql(TWENTY_INTEGER)) {
                                                                                                    return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args);
                                                                                                } else {
                                                                                                    return NIL;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject safe_funcall_instance_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        instance = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = length(args);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return list(SAFE_FUNCALL_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FOUR_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FIVE_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SIX_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SEVEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(EIGHT_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(NINE_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(ELEVEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWELVE_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(THIRTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FOURTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FIFTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SIXTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SEVENTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(NINETEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWENTY_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args);
        }
        return NIL;
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static final SubLObject sfim_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(SAFE_FUNCALL_INSTANCE_METHOD, v_class, method_name, args);
            }
        }
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static SubLObject sfim(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(SAFE_FUNCALL_INSTANCE_METHOD, v_class, method_name, args);
    }

    public static final SubLObject safe_funcall_instance_super_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject instance = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            instance = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt84);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject arg_count = length(args);
                SubLObject pcase_var = arg_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    return list(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS, instance, method_name);
                } else {
                    if (pcase_var.eql(ONE_INTEGER)) {
                        return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS, instance, method_name, args);
                    } else {
                        if (pcase_var.eql(TWO_INTEGER)) {
                            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS, instance, method_name, args);
                        } else {
                            if (pcase_var.eql(THREE_INTEGER)) {
                                return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS, instance, method_name, args);
                            } else {
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS, instance, method_name, args);
                                } else {
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS, instance, method_name, args);
                                    } else {
                                        if (pcase_var.eql(SIX_INTEGER)) {
                                            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS, instance, method_name, args);
                                        } else {
                                            if (pcase_var.eql(SEVEN_INTEGER)) {
                                                return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS, instance, method_name, args);
                                            } else {
                                                if (pcase_var.eql(EIGHT_INTEGER)) {
                                                    return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS, instance, method_name, args);
                                                } else {
                                                    if (pcase_var.eql(NINE_INTEGER)) {
                                                        return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS, instance, method_name, args);
                                                    } else {
                                                        if (pcase_var.eql(TEN_INTEGER)) {
                                                            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS, instance, method_name, args);
                                                        } else {
                                                            if (pcase_var.eql(ELEVEN_INTEGER)) {
                                                                return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS, instance, method_name, args);
                                                            } else {
                                                                if (pcase_var.eql(TWELVE_INTEGER)) {
                                                                    return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS, instance, method_name, args);
                                                                } else {
                                                                    if (pcase_var.eql(THIRTEEN_INTEGER)) {
                                                                        return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS, instance, method_name, args);
                                                                    } else {
                                                                        if (pcase_var.eql(FOURTEEN_INTEGER)) {
                                                                            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS, instance, method_name, args);
                                                                        } else {
                                                                            if (pcase_var.eql(FIFTEEN_INTEGER)) {
                                                                                return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS, instance, method_name, args);
                                                                            } else {
                                                                                if (pcase_var.eql(SIXTEEN_INTEGER)) {
                                                                                    return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS, instance, method_name, args);
                                                                                } else {
                                                                                    if (pcase_var.eql(SEVENTEEN_INTEGER)) {
                                                                                        return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS, instance, method_name, args);
                                                                                    } else {
                                                                                        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
                                                                                            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS, instance, method_name, args);
                                                                                        } else {
                                                                                            if (pcase_var.eql(NINETEEN_INTEGER)) {
                                                                                                return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS, instance, method_name, args);
                                                                                            } else {
                                                                                                if (pcase_var.eql(TWENTY_INTEGER)) {
                                                                                                    return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS, instance, method_name, args);
                                                                                                } else {
                                                                                                    return NIL;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject safe_funcall_instance_super_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        instance = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = length(args);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return list(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS, instance, method_name);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FOUR_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FIVE_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SIX_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SEVEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(EIGHT_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(NINE_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(ELEVEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWELVE_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(THIRTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FOURTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FIFTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SIXTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SEVENTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(NINETEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWENTY_INTEGER)) {
            return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS, instance, method_name, args);
        }
        return NIL;
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static final SubLObject sfism_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt39);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD, v_class, method_name, args);
            }
        }
    }

    /**
     * This method is not to be used in code.  It is provided as a short-cut
     * for those interacting directly with LISP at the read-eval-print loop.
     */
    @LispMethod(comment = "This method is not to be used in code.  It is provided as a short-cut\r\nfor those interacting directly with LISP at the read-eval-print loop.\nThis method is not to be used in code.  It is provided as a short-cut\nfor those interacting directly with LISP at the read-eval-print loop.")
    public static SubLObject sfism(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(SAFE_FUNCALL_INSTANCE_SUPER_METHOD, v_class, method_name, args);
    }

    public static final SubLObject safe_funcall_class_or_instance_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject instance = NIL;
            SubLObject method_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            instance = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt84);
            method_name = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject arg_count = length(args);
                SubLObject pcase_var = arg_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    return list(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name);
                } else {
                    if (pcase_var.eql(ONE_INTEGER)) {
                        return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args);
                    } else {
                        if (pcase_var.eql(TWO_INTEGER)) {
                            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args);
                        } else {
                            if (pcase_var.eql(THREE_INTEGER)) {
                                return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args);
                            } else {
                                if (pcase_var.eql(FOUR_INTEGER)) {
                                    return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args);
                                } else {
                                    if (pcase_var.eql(FIVE_INTEGER)) {
                                        return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args);
                                    } else {
                                        if (pcase_var.eql(SIX_INTEGER)) {
                                            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args);
                                        } else {
                                            if (pcase_var.eql(SEVEN_INTEGER)) {
                                                return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args);
                                            } else {
                                                if (pcase_var.eql(EIGHT_INTEGER)) {
                                                    return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args);
                                                } else {
                                                    if (pcase_var.eql(NINE_INTEGER)) {
                                                        return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args);
                                                    } else {
                                                        if (pcase_var.eql(TEN_INTEGER)) {
                                                            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args);
                                                        } else {
                                                            if (pcase_var.eql(ELEVEN_INTEGER)) {
                                                                return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args);
                                                            } else {
                                                                if (pcase_var.eql(TWELVE_INTEGER)) {
                                                                    return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args);
                                                                } else {
                                                                    if (pcase_var.eql(THIRTEEN_INTEGER)) {
                                                                        return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args);
                                                                    } else {
                                                                        if (pcase_var.eql(FOURTEEN_INTEGER)) {
                                                                            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args);
                                                                        } else {
                                                                            if (pcase_var.eql(FIFTEEN_INTEGER)) {
                                                                                return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args);
                                                                            } else {
                                                                                if (pcase_var.eql(SIXTEEN_INTEGER)) {
                                                                                    return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args);
                                                                                } else {
                                                                                    if (pcase_var.eql(SEVENTEEN_INTEGER)) {
                                                                                        return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args);
                                                                                    } else {
                                                                                        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
                                                                                            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args);
                                                                                        } else {
                                                                                            if (pcase_var.eql(NINETEEN_INTEGER)) {
                                                                                                return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args);
                                                                                            } else {
                                                                                                if (pcase_var.eql(TWENTY_INTEGER)) {
                                                                                                    return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args);
                                                                                                } else {
                                                                                                    return NIL;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject safe_funcall_class_or_instance_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = NIL;
        SubLObject method_name = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        instance = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list84);
        method_name = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = length(args);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return list(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name);
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FOUR_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FIVE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SIX_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SEVEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(EIGHT_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(NINE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(ELEVEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWELVE_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(THIRTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FOURTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(FIFTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SIXTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(SEVENTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(EIGHTEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(NINETEEN_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql(TWENTY_INTEGER)) {
            return listS(SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args);
        }
        return NIL;
    }

    public static SubLObject declare_classes_utilities_file() {
        declareMacro("define_class_method_funcallers", "DEFINE-CLASS-METHOD-FUNCALLERS");
        declareMacro("define_class_super_method_funcallers", "DEFINE-CLASS-SUPER-METHOD-FUNCALLERS");
        declareMacro("define_instance_method_funcallers", "DEFINE-INSTANCE-METHOD-FUNCALLERS");
        declareMacro("define_instance_super_method_funcallers", "DEFINE-INSTANCE-SUPER-METHOD-FUNCALLERS");
        declareMacro("define_class_or_instance_method_funcallers", "DEFINE-CLASS-OR-INSTANCE-METHOD-FUNCALLERS");
        declareMacro("funcall_class_method", "FUNCALL-CLASS-METHOD");
        declareMacro("fcm", "FCM");
        declareMacro("funcall_class_super_method", "FUNCALL-CLASS-SUPER-METHOD");
        declareMacro("fcsm", "FCSM");
        declareMacro("funcall_instance_method", "FUNCALL-INSTANCE-METHOD");
        declareMacro("fim", "FIM");
        declareMacro("funcall_instance_super_method", "FUNCALL-INSTANCE-SUPER-METHOD");
        declareMacro("fism", "FISM");
        declareMacro("funcall_class_or_instance_method", "FUNCALL-CLASS-OR-INSTANCE-METHOD");
        declareFunction("apply_instance_method", "APPLY-INSTANCE-METHOD", 3, 0, false);
        declareMacro("fim_nr", "FIM-NR");
        declareFunction("funcall_instance_method_wXo_recursion", "FUNCALL-INSTANCE-METHOD-W/O-RECURSION", 3, 0, false);
        declareFunction("classes_symbol_list_p", "CLASSES-SYMBOL-LIST-P", 1, 0, false);
        declareFunction("classes_npartition_list", "CLASSES-NPARTITION-LIST", 2, 2, false);
        declareMacro("classes_npartition_list_macro", "CLASSES-NPARTITION-LIST-MACRO");
        declareFunction("classes_check_do_classes_in_order_parameters", "CLASSES-CHECK-DO-CLASSES-IN-ORDER-PARAMETERS", 4, 0, false);
        declareFunction("method_bound_p", "METHOD-BOUND-P", 2, 0, false);
        declareFunction("valid_subloop_safe_funcaller_error_values", "VALID-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUES", 0, 0, false);
        declareFunction("subloop_safe_funcaller_error_value_p", "SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE-P", 1, 0, false);
        declareFunction("encode_subloop_safe_funcaller_error_value", "ENCODE-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE", 1, 0, false);
        declareFunction("decode_subloop_safe_funcaller_error_value", "DECODE-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE", 1, 0, false);
        declareFunction("subloop_safe_funcaller_error_value_less_p", "SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE-LESS-P", 2, 0, false);
        declareFunction("subloop_safe_funcaller_error_value_greater_p", "SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE-GREATER-P", 2, 0, false);
        declareMacro("define_safe_class_method_funcallers", "DEFINE-SAFE-CLASS-METHOD-FUNCALLERS");
        declareMacro("define_safe_class_super_method_funcallers", "DEFINE-SAFE-CLASS-SUPER-METHOD-FUNCALLERS");
        declareMacro("define_safe_instance_method_funcallers", "DEFINE-SAFE-INSTANCE-METHOD-FUNCALLERS");
        declareMacro("define_safe_instance_super_method_funcallers", "DEFINE-SAFE-INSTANCE-SUPER-METHOD-FUNCALLERS");
        declareMacro("define_safe_class_or_instance_method_funcallers", "DEFINE-SAFE-CLASS-OR-INSTANCE-METHOD-FUNCALLERS");
        declareMacro("safe_funcall_class_method", "SAFE-FUNCALL-CLASS-METHOD");
        declareMacro("sfcm", "SFCM");
        declareMacro("safe_funcall_class_super_method", "SAFE-FUNCALL-CLASS-SUPER-METHOD");
        declareMacro("sfcsm", "SFCSM");
        declareMacro("safe_funcall_instance_method", "SAFE-FUNCALL-INSTANCE-METHOD");
        declareMacro("sfim", "SFIM");
        declareMacro("safe_funcall_instance_super_method", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD");
        declareMacro("sfism", "SFISM");
        declareMacro("safe_funcall_class_or_instance_method", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD");
        return NIL;
    }

    public static SubLObject init_classes_utilities_file() {
        defconstant("*CLASSES-UTILITIES-UNDEFINED-CLASS-METHOD-MESSAGE*", $str0$Attempt_to_invoke_the_undefined_m);
        defconstant("*CLASSES-UTILITIES-UNDEFINED-CLASS-SUPER-METHOD-MESSAGE*", $str1$Attempt_to_invoke_the_undefined_s);
        defconstant("*CLASSES-UTILITIES-ILLEGAL-ACCESS-MESSAGE*", $str2$Method__S_cannot_be_called_within);
        defparameter("*METHOD-CALL-STACK*", NIL);
        defconstant("*VALID-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUES*", $list172);
        return NIL;
    }

    public static SubLObject setup_classes_utilities_file() {
        enumerations.enumerations_incorporate_definition(SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE, $list172);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_classes_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_classes_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_classes_utilities_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$Attempt_to_invoke_the_undefined_m = makeString("Attempt to invoke the undefined method ~S on class ~S failed.");

    static private final SubLString $str_alt1$Attempt_to_invoke_the_undefined_s = makeString("Attempt to invoke the undefined super method ~S on class ~S failed.");

    static private final SubLString $str_alt2$Method__S_cannot_be_called_within = makeString("Method ~S cannot be called within the scope of class ~S.");

    static private final SubLList $list_alt3 = list(makeSymbol("NAME-TEMPLATE"), makeSymbol("MAX-ARGS"));

    static private final SubLList $list_alt8 = list(list(makeSymbol("CLASS"), list(makeSymbol("FIF"), list(makeSymbol("SYMBOLP"), makeSymbol("CLASS-NAME-OR-CLASS")), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("CLASS-NAME-OR-CLASS")), list(makeSymbol("FIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("CLASS-NAME-OR-CLASS")), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("CLASS-NAME-OR-CLASS")), makeSymbol("CLASS-NAME-OR-CLASS")))));

    static private final SubLList $list_alt9 = list(makeSymbol("MUST"), list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), makeString("FUNCALL-CLASS-METHOD: ~S is not a defined class."), makeSymbol("CLASS-NAME-OR-CLASS"));

    static private final SubLList $list_alt10 = list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("METHOD-NAME"), list(makeSymbol("SYMBOLP"), makeSymbol("METHOD-NAME"))), makeString("FUNCALL-CLASS-METHOD: ~S is not a method of class ~S."), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")));

    static private final SubLList $list_alt11 = list(list(makeSymbol("METHOD"), list(makeSymbol("METHOD-ASSOC"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("CLASS")))));

    static private final SubLList $list_alt12 = list(makeSymbol("MUST"), makeSymbol("METHOD"), makeSymbol("*CLASSES-UTILITIES-UNDEFINED-CLASS-METHOD-MESSAGE*"), makeSymbol("METHOD-NAME"), makeSymbol("CLASS"));

    static private final SubLList $list_alt13 = list(makeSymbol("MUST"), list(makeSymbol("INSTANCES-ACCESS-CHECK-METHOD"), makeSymbol("CLASS"), makeSymbol("METHOD")), makeSymbol("*CLASSES-UTILITIES-ILLEGAL-ACCESS-MESSAGE*"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")));

    static private final SubLList $list_alt16 = list(makeSymbol("METHOD-FUNCTION-NAME"), makeSymbol("METHOD"));

    static private final SubLList $list_alt18 = list(list(RET, NIL));

    static private final SubLString $str_alt19$ARG_S = makeString("ARG~S");

    static private final SubLList $list_alt21 = list(makeSymbol("MUST"), list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), makeString("FUNCALL-CLASS-SUPER-METHOD: ~S is not a defined class."), makeSymbol("CLASS-NAME-OR-CLASS"));

    static private final SubLList $list_alt22 = list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("METHOD-NAME"), list(makeSymbol("SYMBOLP"), makeSymbol("METHOD-NAME"))), makeString("FUNCALL-CLASS-SUPER-METHOD: ~S is not a method of class ~S."), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS")));

    static private final SubLList $list_alt23 = list(list(makeSymbol("METHOD"), list(makeSymbol("METHOD-SHADOWED-ASSOC"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("CLASS")))));

    static private final SubLList $list_alt24 = list(makeSymbol("MUST"), makeSymbol("METHOD"), makeSymbol("*CLASSES-UTILITIES-UNDEFINED-CLASS-SUPER-METHOD-MESSAGE*"), makeSymbol("METHOD-NAME"), makeSymbol("CLASS"));

    static private final SubLList $list_alt25 = list(makeSymbol("NAME-TEMPLATE"), makeSymbol("CLASS-NAME-TEMPLATE"), makeSymbol("MAX-ARGS"));

    static private final SubLList $list_alt27 = list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INSTANCE-P"), makeSymbol("INSTANCE")), list(makeSymbol("SYMBOLP"), makeSymbol("METHOD-NAME"))), makeString("~%FUNCALL-INSTANCE-METHOD: either instance ~S or method ~S are invalid."), makeSymbol("INSTANCE"), makeSymbol("METHOD-NAME"));

    static private final SubLList $list_alt28 = list(list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("INSTANCE"))), list(makeSymbol("METHOD"), list(makeSymbol("GETHASH"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-TABLIFIED-INSTANCE-METHODS"), makeSymbol("CLASS")))));

    static private final SubLList $list_alt31 = list(list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("INSTANCE"))), list(makeSymbol("METHOD"), list(makeSymbol("METHOD-SHADOWED-ASSOC"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), makeSymbol("CLASS")))));

    static private final SubLList $list_alt33 = list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("METHOD-NAME"), list(makeSymbol("SYMBOLP"), makeSymbol("METHOD-NAME"))), makeString("~%FUNCALL-CLASS-OR-INSTANCE-METHOD: Method ~S is invalid."), makeSymbol("METHOD-NAME"));

    static private final SubLList $list_alt34 = list(makeSymbol("INSTANCE-P"), makeSymbol("CLASS-OR-INSTANCE"));

    static private final SubLList $list_alt35 = list(list(makeSymbol("CLASS"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("CLASS-OR-INSTANCE"))), list(makeSymbol("METHOD"), list(makeSymbol("GETHASH"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-TABLIFIED-INSTANCE-METHODS"), makeSymbol("CLASS")))));

    static private final SubLList $list_alt36 = list(list(makeSymbol("PROGN"), list(makeSymbol("ERROR"), makeString("~%FUNCALL-CLASS-OR-INSTANCE-METHOD: Method ~S is invalid."), makeSymbol("METHOD-NAME")), list(RET, NIL)));

    static private final SubLList $list_alt37 = list(list(makeSymbol("CLASS"), list(makeSymbol("FIF"), list(makeSymbol("CLASS-P"), makeSymbol("CLASS-OR-INSTANCE")), makeSymbol("CLASS-OR-INSTANCE"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("CLASS-OR-INSTANCE")))), list(makeSymbol("METHOD"), list(makeSymbol("FIF"), makeSymbol("CLASS"), list(makeSymbol("METHOD-ASSOC"), makeSymbol("METHOD-NAME"), list(makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), makeSymbol("CLASS"))), NIL)));

    static private final SubLList $list_alt38 = list(makeSymbol("MUST"), makeSymbol("CLASS"), makeString("FUNCALL-CLASS-OR-INSTANCE-METHOD: ~S is not a valid class."), makeSymbol("CLASS"));

    static private final SubLList $list_alt39 = list(makeSymbol("CLASS"), makeSymbol("METHOD-NAME"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list_alt84 = list(makeSymbol("INSTANCE"), makeSymbol("METHOD-NAME"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLString $str_alt150$APPLY_INSTANCE_METHOD__either_ins = makeString("APPLY-INSTANCE-METHOD: either instance ~S or method ~S are invalid.");

    static private final SubLString $str_alt151$APPLY_INSTANCE_METHOD__No__S_meth = makeString("APPLY-INSTANCE-METHOD: No ~S method is associated with the class ~S of instance ~S.");

    static private final SubLList $list_alt156 = list(list(makeSymbol("SETTABLE-MATCH-LOC"), makeSymbol("SETTABLE-NO-MATCH-LOC")), makeSymbol("ITEM"), makeSymbol("SEQUENCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("KEY"), list(QUOTE, IDENTITY)), list(makeSymbol("TEST"), list(QUOTE, EQ)));

    static private final SubLString $str_alt158$match_list = makeString("match-list");

    static private final SubLString $str_alt159$not_match_list = makeString("not-match-list");

    static private final SubLList $list_alt162 = list(NIL);

    static private final SubLString $str_alt168$DO_CLASSES_IN_ORDER___S_is_not_a_ = makeString("DO-CLASSES-IN-ORDER: ~S is not a legal variable.  A non nil symbol was expected.");

    static private final SubLString $str_alt169$DO_CLASSES_IN_ORDER___S_is_not_a_ = makeString("DO-CLASSES-IN-ORDER: ~S is not a legal optional extension for a listed depth var.~%~\n     A listed non null symbol or nil was expected.");

    static private final SubLString $str_alt170$DO_CLASSES_IN_ORDER___S_is_not_a_ = makeString("DO-CLASSES-IN-ORDER: ~S is not a legal body.");

    static private final SubLString $str_alt171$Class__A_not_recognized_ = makeString("Class ~A not recognized.");

    static private final SubLList $list_alt172 = list(makeKeyword("TARGET-NOT-A-CLASS"), makeKeyword("TARGET-NOT-AN-INSTANCE"), makeKeyword("TARGET-METHOD-CONFLICT"), makeKeyword("ACCESS-LEVEL-CONFLICT"), makeKeyword("INVALID-METHOD-NAME"), makeKeyword("UNDECLARED-METHOD"), makeKeyword("UNDEFINED-METHOD"));

    static private final SubLString $str_alt174$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    static private final SubLString $str_alt176$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    static private final SubLString $str_alt178$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    static private final SubLList $list_alt180 = list(makeSymbol("PUNLESS"), list(makeSymbol("CLASS-P"), makeSymbol("CLASS")), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("TARGET-NOT-A-CLASS"))));

    static private final SubLList $list_alt181 = list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), makeSymbol("METHOD-NAME"), list(makeSymbol("SYMBOLP"), makeSymbol("METHOD-NAME"))), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("INVALID-METHOD-NAME"))));

    static private final SubLList $list_alt182 = list(makeSymbol("PUNLESS"), makeSymbol("METHOD"), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("UNDECLARED-METHOD"))));

    static private final SubLList $list_alt183 = list(makeSymbol("PUNLESS"), list(makeSymbol("INSTANCES-ACCESS-CHECK-METHOD"), makeSymbol("CLASS"), makeSymbol("METHOD")), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("ACCESS-LEVEL-CONFLICT"))));

    static private final SubLList $list_alt184 = list(list(makeSymbol("FUNCTION-REF"), list(makeSymbol("METHOD-FUNCTION-NAME"), makeSymbol("METHOD"))));

    static private final SubLList $list_alt185 = list(makeSymbol("PUNLESS"), list(makeSymbol("FBOUNDP"), makeSymbol("FUNCTION-REF")), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("UNDEFINED-METHOD"))));

    static private final SubLList $list_alt188 = list(makeSymbol("PUNLESS"), list(makeSymbol("INSTANCE-P"), makeSymbol("INSTANCE")), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("TARGET-NOT-AN-INSTANCE"))));

    static private final SubLList $list_alt189 = list(makeSymbol("PUNLESS"), list(makeSymbol("SYMBOLP"), makeSymbol("METHOD-NAME")), list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("INVALID-METHOD-NAME"))));

    static private final SubLList $list_alt190 = list(list(RET, list(makeSymbol("VALUES"), NIL, makeKeyword("UNDECLARED-METHOD"))));

    static private final SubLList $list_alt191 = list(makeSymbol("PUNLESS"), makeSymbol("METHOD"), list(makeSymbol("VALUES"), NIL, makeKeyword("UNDECLARED-METHOD")));

    static private final SubLList $list_alt192 = list(makeSymbol("PUNLESS"), list(makeSymbol("INSTANCES-ACCESS-CHECK-METHOD"), makeSymbol("CLASS"), makeSymbol("METHOD")), list(makeSymbol("VALUES"), NIL, makeKeyword("ACCESS-LEVEL-CONFLICT")));
}

/**
 * Total time: 552 ms
 */
