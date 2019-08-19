/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_corpus_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      REMOVAL-MODULES-IR-INDEX-STRING
 *  source file: /cyc/top/cycl/inference/modules/removal/removal-modules-ir-index-string.lisp
 *  created:     2019/07/03 17:37:47
 */
public final class removal_modules_ir_index_string extends SubLTranslatedFile implements V02 {
    // // Constructor
    private removal_modules_ir_index_string() {
    }

    public static final SubLFile me = new removal_modules_ir_index_string();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ir_index_string";

    // // Definitions
    // defconstant
    private static final SubLSymbol $default_removal_ir_index_string_cost$ = makeSymbol("*DEFAULT-REMOVAL-IR-INDEX-STRING-COST*");

    public static final SubLObject removal_ir_index_string_check(SubLObject string, SubLObject fort) {
        if (string.isString() && (NIL != forts.fort_p(fort))) {
            {
                SubLObject error = NIL;
                SubLObject hits = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                            try {
                                hits = cyc_corpus_utilities.cyc_corpus_read_hits(string, UNPROVIDED);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                if (NIL == error) {
                    return subl_promotions.memberP(fort, hits, symbol_function(EQ), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    // defparameter
    private static final SubLSymbol $perform_ir_index_support_verification$ = makeSymbol("*PERFORM-IR-INDEX-SUPPORT-VERIFICATION*");

    public static final SubLObject hl_verify_cyc_ir_index(SubLObject support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $perform_ir_index_support_verification$.getDynamicValue(thread)) {
                return T;
            }
            {
                SubLObject datum = support;
                SubLObject current = datum;
                SubLObject hl_module = NIL;
                SubLObject literal = NIL;
                SubLObject mt = NIL;
                SubLObject tv = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt6);
                hl_module = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt6);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt6);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt6);
                tv = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_answer = NIL;
                        {
                            SubLObject _prev_bind_0 = $perform_ir_index_support_verification$.currentBinding(thread);
                            try {
                                $perform_ir_index_support_verification$.bind(NIL, thread);
                                v_answer = ask_utilities.inference_literal_ask(literal, mt);
                            } finally {
                                $perform_ir_index_support_verification$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return list_utilities.sublisp_boolean(v_answer);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt6);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_removal_modules_ir_index_string_file() {
        declareFunction("removal_ir_index_string_check", "REMOVAL-IR-INDEX-STRING-CHECK", 2, 0, false);
        declareFunction("hl_verify_cyc_ir_index", "HL-VERIFY-CYC-IR-INDEX", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_removal_modules_ir_index_string_file() {
        defconstant("*DEFAULT-REMOVAL-IR-INDEX-STRING-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        defparameter("*PERFORM-IR-INDEX-SUPPORT-VERIFICATION*", NIL);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_ir_index_string_file() {
                inference_modules.register_solely_specific_removal_module_predicate($$wordIndexesCycTerm);
        inference_modules.inference_removal_module($REMOVAL_IR_INDEX_STRING_SEARCH, $list_alt2);
        inference_modules.inference_removal_module($REMOVAL_IR_INDEX_STRING_CHECK, $list_alt4);
        hl_supports.setup_hl_support_module($CYC_IR_INDEX, $list_alt8);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$wordIndexesCycTerm = constant_handles.reader_make_constant_shell(makeString("wordIndexesCycTerm"));

    private static final SubLSymbol $REMOVAL_IR_INDEX_STRING_SEARCH = makeKeyword("REMOVAL-IR-INDEX-STRING-SEARCH");

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-IR-INDEX-STRING-COST*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CYC-IR-INDEX"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("wordIndexesCycTerm")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("wordIndexesCycTerm")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("wordIndexesCycTerm")), list($BIND, makeSymbol("STRING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("CYC-CORPUS-READ-HITS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("wordIndexesCycTerm")), list(makeKeyword("VALUE"), makeSymbol("STRING")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("interface to the Lucene CycIndexServer"), makeKeyword("EXAMPLE"), makeString("(#$wordIndexesCycTerm \"happiness\" ?TERM)") });

    private static final SubLSymbol $REMOVAL_IR_INDEX_STRING_CHECK = makeKeyword("REMOVAL-IR-INDEX-STRING-CHECK");

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REMOVAL-IR-INDEX-STRING-COST*"), makeKeyword("SUPPORT-MODULE"), makeKeyword("CYC-IR-INDEX"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("wordIndexesCycTerm")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("wordIndexesCycTerm")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("wordIndexesCycTerm")), list($BIND, makeSymbol("STRING")), list($BIND, makeSymbol("FORT"))), list(list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("FORT")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("STRING"), makeSymbol("FORT")), list($CALL, makeSymbol("REMOVAL-IR-INDEX-STRING-CHECK"), list(makeKeyword("VALUE"), makeSymbol("STRING")), list(makeKeyword("VALUE"), makeSymbol("FORT")))), makeKeyword("DOCUMENTATION"), makeString("interface to the Lucene CycIndexServer"), makeKeyword("EXAMPLE"), makeString("(#$wordIndexesCycTerm \"bertolo\" #$Bertolo)") });



    static private final SubLList $list_alt6 = list(makeSymbol("HL-MODULE"), makeSymbol("LITERAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLSymbol $CYC_IR_INDEX = makeKeyword("CYC-IR-INDEX");

    static private final SubLList $list_alt8 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-CYC-IR-INDEX"));

    // // Initializers
    public void declareFunctions() {
        declare_removal_modules_ir_index_string_file();
    }

    public void initializeVariables() {
        init_removal_modules_ir_index_string_file();
    }

    public void runTopLevelForms() {
        setup_removal_modules_ir_index_string_file();
    }
}

