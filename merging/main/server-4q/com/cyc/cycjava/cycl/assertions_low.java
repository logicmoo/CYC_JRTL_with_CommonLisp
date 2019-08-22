/**
 *
 */
/**
 *
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_input_to_static_area$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.assertion_indexing_store_get;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.assertion_indexing_store_remove;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.assertion_indexing_store_set;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.index_installed_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.new_simple_index;
import static com.cyc.cycjava.cycl.list_utilities.delete_first;
import static com.cyc.cycjava.cycl.list_utilities.every_in_list;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.oddp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$suspend_type_checkingP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ASSERTIONS-LOW
 * source file: /cyc/top/cycl/assertions-low.lisp
 * created:     2019/07/03 17:37:21
 */
public final class assertions_low extends SubLTranslatedFile implements V12 {
    public static final SubLObject load_assertion_content_from_fht(SubLObject assertion, SubLObject fht) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = assertion_handles.assertion_id(assertion);
                SubLObject bundle = NIL;
                {
                    SubLObject _prev_bind_0 = $cfasl_input_to_static_area$.currentBinding(thread);
                    try {
                        $cfasl_input_to_static_area$.bind(NIL, thread);
                        bundle = file_hash_table.get_file_hash_table(id, fht, $NOT_FOUND);
                    } finally {
                        $cfasl_input_to_static_area$.rebind(_prev_bind_0, thread);
                    }
                }
                if (bundle.isList()) {
                    {
                        SubLObject datum = bundle;
                        SubLObject current = datum;
                        SubLObject formula_data = NIL;
                        SubLObject mt = NIL;
                        SubLObject flags = NIL;
                        SubLObject v_arguments = NIL;
                        SubLObject plist = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt3);
                        formula_data = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt3);
                        mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt3);
                        flags = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt3);
                        v_arguments = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt3);
                        plist = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            return load_assertion_content_int(id, formula_data, mt, flags, v_arguments, plist);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt3);
                        }
                    }
                } else {
                    return NIL;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject load_assertion_content_as_bundle(SubLObject id, SubLObject stream) {
        {
            SubLObject formula_data = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject mt = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject flags = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject v_arguments = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject plist = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            return bundle_assertion_content(formula_data, mt, flags, v_arguments, plist);
        }
    }

    public static final SubLObject dump_assertion_content_to_fht(SubLObject assertion, SubLObject fht, SubLObject id) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        if (NIL == id) {
            id = assertion_handles.assertion_id(assertion);
        }
        {
            SubLObject bundle = bundle_assertion_content_for_dumping(assertion);
            dump_assertion_content_bundle_to_fht(id, bundle, fht);
            return assertion;
        }
    }

    public static final SubLObject dump_assertion_content_bundle_to_fht(SubLObject id, SubLObject bundle, SubLObject fht) {
        file_hash_table.fast_put_file_hash_table(id, fht, bundle);
        return id;
    }

    public static final SubLObject bundle_assertion_content_for_dumping(SubLObject assertion) {
        return bundle_assertion_content(assertion_formula_data(assertion), assertions_high.assertion_mt(assertion), assertion_flags(assertion), assertions_high.assertion_arguments(assertion), assertion_plist(assertion));
    }

    public static final SubLObject bundle_assertion_content(SubLObject formula_data, SubLObject mt, SubLObject flags, SubLObject v_arguments, SubLObject plist) {
        return list(formula_data, mt, flags, v_arguments, plist);
    }

    public static final class $assertion_content_p$UnaryFunction extends UnaryFunction {
        public $assertion_content_p$UnaryFunction() {
            super(extractFunctionNamed("ASSERTION-CONTENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return assertion_content_p(arg1);
        }
    }

    public static final SubLFile me = new assertions_low();

 public static final String myName = "com.cyc.cycjava.cycl.assertions_low";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_assertion_content$ = makeSymbol("*DTP-ASSERTION-CONTENT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_assertion_flags$ = makeSymbol("*DEFAULT-ASSERTION-FLAGS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $assertion_flags_gaf_byte$ = makeSymbol("*ASSERTION-FLAGS-GAF-BYTE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $assertion_flags_direction_byte$ = makeSymbol("*ASSERTION-FLAGS-DIRECTION-BYTE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $assertion_flags_tv_byte$ = makeSymbol("*ASSERTION-FLAGS-TV-BYTE*");



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $estimated_assertions_per_rule$ = makeSymbol("*ESTIMATED-ASSERTIONS-PER-RULE*");



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $estimated_assertions_per_non_true$ = makeSymbol("*ESTIMATED-ASSERTIONS-PER-NON-TRUE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $dependent_deduction_table$ = makeSymbol("*DEPENDENT-DEDUCTION-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $dependent_assertion_table$ = makeSymbol("*DEPENDENT-ASSERTION-TABLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol ASSERTION_CONTENT = makeSymbol("ASSERTION-CONTENT");

    private static final SubLSymbol ASSERTION_CONTENT_P = makeSymbol("ASSERTION-CONTENT-P");

    private static final SubLInteger $int$148 = makeInteger(148);

    private static final SubLSymbol ASSERTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ASSERTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ASSERTION-CONTENT-P"));

    private static final SubLSymbol AS_CONTENT_FORMULA_DATA = makeSymbol("AS-CONTENT-FORMULA-DATA");

    private static final SubLSymbol _CSETF_AS_CONTENT_FORMULA_DATA = makeSymbol("_CSETF-AS-CONTENT-FORMULA-DATA");

    private static final SubLSymbol AS_CONTENT_MT = makeSymbol("AS-CONTENT-MT");

    private static final SubLSymbol _CSETF_AS_CONTENT_MT = makeSymbol("_CSETF-AS-CONTENT-MT");

    private static final SubLSymbol AS_CONTENT_FLAGS = makeSymbol("AS-CONTENT-FLAGS");

    private static final SubLSymbol _CSETF_AS_CONTENT_FLAGS = makeSymbol("_CSETF-AS-CONTENT-FLAGS");

    private static final SubLSymbol AS_CONTENT_ARGUMENTS = makeSymbol("AS-CONTENT-ARGUMENTS");

    private static final SubLSymbol _CSETF_AS_CONTENT_ARGUMENTS = makeSymbol("_CSETF-AS-CONTENT-ARGUMENTS");

    private static final SubLSymbol AS_CONTENT_PLIST = makeSymbol("AS-CONTENT-PLIST");

    private static final SubLSymbol _CSETF_AS_CONTENT_PLIST = makeSymbol("_CSETF-AS-CONTENT-PLIST");

    private static final SubLString $str25$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_ASSERTION_CONTENT = makeSymbol("MAKE-ASSERTION-CONTENT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ASSERTION_CONTENT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ASSERTION-CONTENT-METHOD");

    private static final SubLString $str35$_a__assertion___a__has_null_flags = makeString("~a (assertion #~a) has null flags");

    private static final SubLString $str38$Unexpected_formula_data_type___S = makeString("Unexpected formula-data type: ~S");

    private static final SubLSymbol $rule_set$ = makeSymbol("*RULE-SET*");

    private static final SubLSymbol $prefer_rule_set_over_flagsP$ = makeSymbol("*PREFER-RULE-SET-OVER-FLAGS?*");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $$$mapping_Cyc_assertions = makeString("mapping Cyc assertions");

    private static final SubLSymbol KEYHASH_P = makeSymbol("KEYHASH-P");

    private static final SubLString $$$Rebuilding_the_Rule_Set = makeString("Rebuilding the Rule Set");

    private static final SubLSymbol $append_stack_traces_to_error_messagesP$ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list50 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);

    private static final SubLString $str53$_A = makeString("~A");

    private static final SubLSymbol $non_true_assertion_tv_cache$ = makeSymbol("*NON-TRUE-ASSERTION-TV-CACHE*");

    private static final SubLSymbol $prefer_non_true_set_over_flagsP$ = makeSymbol("*PREFER-NON-TRUE-SET-OVER-FLAGS?*");

    private static final SubLInteger $int$1983 = makeInteger(1983);

    private static final SubLList $list57 = list(makeKeyword("WEAK-KEYS"), T);

    private static final SubLString $str58$Rebuilding_the_non_true_assertion = makeString("Rebuilding the non-true assertion cache");

    private static final SubLList $list61 = list(list(makeSymbol("WHO"), makeSymbol("WHEN"), makeSymbol("WHY"), makeSymbol("SECOND")), makeSymbol("ASSERT-INFO"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym63$_OPTIONAL = makeSymbol("&OPTIONAL");

    private static final SubLList $list65 = list(makeSymbol("&OPTIONAL"), makeSymbol("WHO"), makeSymbol("WHEN"), makeSymbol("WHY"), makeSymbol("SECOND"));

    private static final SubLSymbol VALID_ARGUMENT = makeSymbol("VALID-ARGUMENT");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str70$Unexpected_formula_data_hook___S = makeString("Unexpected formula data hook: ~S");

    private static final SubLSymbol SET_CONTENTS_P = makeSymbol("SET-CONTENTS-P");

    private static final SubLSymbol $sym75$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    private static final SubLSymbol $sym76$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    public static final SubLObject assertion_content_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject assertion_content_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject assertion_content_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.assertions_low.$assertion_content_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject assertion_content_p(final SubLObject v_object) {
        return assertion_content_holder.isInstance(v_object);
    }

    public static final SubLObject as_content_formula_data_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ASSERTION_CONTENT_P);
        return v_object.getField2();
    }

    public static SubLObject as_content_formula_data(final SubLObject v_object) {
        assert NIL != assertion_content_p(v_object) : "! assertions_low.assertion_content_p(v_object) " + "assertions_low.assertion_content_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject as_content_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ASSERTION_CONTENT_P);
        return v_object.getField3();
    }

    public static SubLObject as_content_mt(final SubLObject v_object) {
        assert NIL != assertion_content_p(v_object) : "! assertions_low.assertion_content_p(v_object) " + "assertions_low.assertion_content_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject as_content_flags_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ASSERTION_CONTENT_P);
        return v_object.getField4();
    }

    public static SubLObject as_content_flags(final SubLObject v_object) {
        assert NIL != assertion_content_p(v_object) : "! assertions_low.assertion_content_p(v_object) " + "assertions_low.assertion_content_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject as_content_arguments_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ASSERTION_CONTENT_P);
        return v_object.getField5();
    }

    public static SubLObject as_content_arguments(final SubLObject v_object) {
        assert NIL != assertion_content_p(v_object) : "! assertions_low.assertion_content_p(v_object) " + "assertions_low.assertion_content_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject as_content_plist_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ASSERTION_CONTENT_P);
        return v_object.getField6();
    }

    public static SubLObject as_content_plist(final SubLObject v_object) {
        assert NIL != assertion_content_p(v_object) : "! assertions_low.assertion_content_p(v_object) " + "assertions_low.assertion_content_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_as_content_formula_data_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ASSERTION_CONTENT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_as_content_formula_data(final SubLObject v_object, final SubLObject value) {
        assert NIL != assertion_content_p(v_object) : "! assertions_low.assertion_content_p(v_object) " + "assertions_low.assertion_content_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_as_content_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ASSERTION_CONTENT_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_as_content_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != assertion_content_p(v_object) : "! assertions_low.assertion_content_p(v_object) " + "assertions_low.assertion_content_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_as_content_flags_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ASSERTION_CONTENT_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_as_content_flags(final SubLObject v_object, final SubLObject value) {
        assert NIL != assertion_content_p(v_object) : "! assertions_low.assertion_content_p(v_object) " + "assertions_low.assertion_content_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_as_content_arguments_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ASSERTION_CONTENT_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_as_content_arguments(final SubLObject v_object, final SubLObject value) {
        assert NIL != assertion_content_p(v_object) : "! assertions_low.assertion_content_p(v_object) " + "assertions_low.assertion_content_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_as_content_plist_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ASSERTION_CONTENT_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_as_content_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != assertion_content_p(v_object) : "! assertions_low.assertion_content_p(v_object) " + "assertions_low.assertion_content_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_assertion_content_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.assertions_low.$assertion_content_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($FORMULA_DATA)) {
                        _csetf_as_content_formula_data(v_new, current_value);
                    } else {
                        if (pcase_var.eql($MT)) {
                            _csetf_as_content_mt(v_new, current_value);
                        } else {
                            if (pcase_var.eql($FLAGS)) {
                                _csetf_as_content_flags(v_new, current_value);
                            } else {
                                if (pcase_var.eql($ARGUMENTS)) {
                                    _csetf_as_content_arguments(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PLIST)) {
                                        _csetf_as_content_plist(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt24$Invalid_slot__S_for_construction_, current_arg);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_assertion_content(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLStruct v_new = assertion_content_holder.makeNewInstance();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FORMULA_DATA)) {
                _csetf_as_content_formula_data(v_new, current_value);
            } else
                if (pcase_var.eql($MT)) {
                    _csetf_as_content_mt(v_new, current_value);
                } else
                    if (pcase_var.eql($FLAGS)) {
                        _csetf_as_content_flags(v_new, current_value);
                    } else
                        if (pcase_var.eql($ARGUMENTS)) {
                            _csetf_as_content_arguments(v_new, current_value);
                        } else
                            if (pcase_var.eql($PLIST)) {
                                _csetf_as_content_plist(v_new, current_value);
                            } else {
                                Errors.error($str25$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_assertion_content(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ASSERTION_CONTENT, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FORMULA_DATA, as_content_formula_data(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, as_content_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $FLAGS, as_content_flags(obj));
        funcall(visitor_fn, obj, $SLOT, $ARGUMENTS, as_content_arguments(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, as_content_plist(obj));
        funcall(visitor_fn, obj, $END, MAKE_ASSERTION_CONTENT, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_assertion_content_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_assertion_content(obj, visitor_fn);
    }

    public static final SubLObject create_assertion_content_alt(SubLObject mt) {
        {
            SubLObject assertion_content = NIL;
            assertion_content = make_assertion_content(UNPROVIDED);
            _csetf_as_content_formula_data(assertion_content, NIL);
            _csetf_as_content_mt(assertion_content, mt);
            _csetf_as_content_flags(assertion_content, $default_assertion_flags$.getGlobalValue());
            _csetf_as_content_arguments(assertion_content, NIL);
            _csetf_as_content_plist(assertion_content, NIL);
            return assertion_content;
        }
    }

    public static SubLObject create_assertion_content(final SubLObject mt) {
        SubLObject assertion_content = NIL;
        assertion_content = make_assertion_content(UNPROVIDED);
        _csetf_as_content_formula_data(assertion_content, NIL);
        _csetf_as_content_mt(assertion_content, mt);
        _csetf_as_content_flags(assertion_content, $default_assertion_flags$.getGlobalValue());
        _csetf_as_content_arguments(assertion_content, NIL);
        _csetf_as_content_plist(assertion_content, NIL);
        return assertion_content;
    }

    public static final SubLObject destroy_assertion_content_alt(SubLObject id) {
        {
            SubLObject assertion_content = assertion_manager.lookup_assertion_content(id);
            if (NIL != assertion_content_p(assertion_content)) {
                assertion_manager.deregister_assertion_content(id);
                _csetf_as_content_formula_data(assertion_content, NIL);
                _csetf_as_content_mt(assertion_content, NIL);
                _csetf_as_content_flags(assertion_content, NIL);
                _csetf_as_content_arguments(assertion_content, NIL);
                _csetf_as_content_plist(assertion_content, NIL);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject destroy_assertion_content(final SubLObject id) {
        final SubLObject assertion_content = assertion_manager.lookup_assertion_content(id);
        if (NIL != assertion_content_p(assertion_content)) {
            assertion_manager.deregister_assertion_content(id);
            _csetf_as_content_formula_data(assertion_content, NIL);
            _csetf_as_content_mt(assertion_content, NIL);
            _csetf_as_content_flags(assertion_content, NIL);
            _csetf_as_content_arguments(assertion_content, NIL);
            _csetf_as_content_plist(assertion_content, NIL);
            return T;
        }
        return NIL;
    }

    public static final SubLObject lookup_assertion_formula_data_alt(SubLObject id) {
        {
            SubLObject contents = assertion_manager.lookup_assertion_content(id);
            return NIL != contents ? ((SubLObject) (as_content_formula_data(contents))) : NIL;
        }
    }

    public static SubLObject lookup_assertion_formula_data(final SubLObject id) {
        final SubLObject contents = assertion_manager.lookup_assertion_content(id);
        return NIL != contents ? as_content_formula_data(contents) : NIL;
    }

    public static final SubLObject lookup_assertion_mt_alt(SubLObject id) {
        {
            SubLObject contents = assertion_manager.lookup_assertion_content(id);
            return NIL != contents ? ((SubLObject) (as_content_mt(contents))) : NIL;
        }
    }

    public static SubLObject lookup_assertion_mt(final SubLObject id) {
        final SubLObject contents = assertion_manager.lookup_assertion_content(id);
        return NIL != contents ? as_content_mt(contents) : NIL;
    }

    public static final SubLObject lookup_assertion_flags_alt(SubLObject id) {
        {
            SubLObject contents = assertion_manager.lookup_assertion_content(id);
            return NIL != contents ? ((SubLObject) (as_content_flags(contents))) : NIL;
        }
    }

    public static SubLObject lookup_assertion_flags(final SubLObject id) {
        final SubLObject contents = assertion_manager.lookup_assertion_content(id);
        return NIL != contents ? as_content_flags(contents) : NIL;
    }

    public static final SubLObject lookup_assertion_arguments_alt(SubLObject id) {
        {
            SubLObject contents = assertion_manager.lookup_assertion_content(id);
            return NIL != contents ? ((SubLObject) (as_content_arguments(contents))) : NIL;
        }
    }

    public static SubLObject lookup_assertion_arguments(final SubLObject id) {
        final SubLObject contents = assertion_manager.lookup_assertion_content(id);
        return NIL != contents ? as_content_arguments(contents) : NIL;
    }

    public static final SubLObject lookup_assertion_plist_alt(SubLObject id) {
        {
            SubLObject contents = assertion_manager.lookup_assertion_content(id);
            return NIL != contents ? ((SubLObject) (as_content_plist(contents))) : NIL;
        }
    }

    public static SubLObject lookup_assertion_plist(final SubLObject id) {
        final SubLObject contents = assertion_manager.lookup_assertion_content(id);
        return NIL != contents ? as_content_plist(contents) : NIL;
    }

    public static final SubLObject set_assertion_formula_data_alt(SubLObject id, SubLObject new_formula_data) {
        _csetf_as_content_formula_data(assertion_manager.lookup_assertion_content(id), new_formula_data);
        assertion_manager.mark_assertion_content_as_muted(id);
        return id;
    }

    public static SubLObject set_assertion_formula_data(final SubLObject id, final SubLObject new_formula_data) {
        _csetf_as_content_formula_data(assertion_manager.lookup_assertion_content(id), new_formula_data);
        assertion_manager.mark_assertion_content_as_muted(id);
        return id;
    }

    public static final SubLObject set_assertion_flags_alt(SubLObject id, SubLObject new_flags) {
        _csetf_as_content_flags(assertion_manager.lookup_assertion_content(id), new_flags);
        assertion_manager.mark_assertion_content_as_muted(id);
        return id;
    }

    public static SubLObject set_assertion_flags(final SubLObject id, final SubLObject new_flags) {
        _csetf_as_content_flags(assertion_manager.lookup_assertion_content(id), new_flags);
        assertion_manager.mark_assertion_content_as_muted(id);
        return id;
    }

    public static final SubLObject set_assertion_arguments_alt(SubLObject id, SubLObject new_arguments) {
        _csetf_as_content_arguments(assertion_manager.lookup_assertion_content(id), new_arguments);
        assertion_manager.mark_assertion_content_as_muted(id);
        return id;
    }

    public static SubLObject set_assertion_arguments(final SubLObject id, final SubLObject new_arguments) {
        _csetf_as_content_arguments(assertion_manager.lookup_assertion_content(id), new_arguments);
        assertion_manager.mark_assertion_content_as_muted(id);
        return id;
    }

    public static final SubLObject set_assertion_plist_alt(SubLObject id, SubLObject new_plist) {
        _csetf_as_content_plist(assertion_manager.lookup_assertion_content(id), new_plist);
        assertion_manager.mark_assertion_content_as_muted(id);
        return id;
    }

    public static SubLObject set_assertion_plist(final SubLObject id, final SubLObject new_plist) {
        _csetf_as_content_plist(assertion_manager.lookup_assertion_content(id), new_plist);
        assertion_manager.mark_assertion_content_as_muted(id);
        return id;
    }

    public static final SubLObject dump_assertion_content_alt(SubLObject assertion, SubLObject stream) {
        cfasl_output(assertion_formula_data(assertion), stream);
        cfasl_output(assertions_high.assertion_mt(assertion), stream);
        cfasl_output(assertion_flags(assertion), stream);
        cfasl_output(assertions_high.assertion_arguments(assertion), stream);
        cfasl_output(assertion_plist(assertion), stream);
        return assertion;
    }

    public static SubLObject dump_assertion_content(final SubLObject assertion, final SubLObject stream) {
        cfasl_output(assertion_formula_data(assertion), stream);
        cfasl_output(assertions_high.assertion_mt(assertion), stream);
        cfasl_output(assertion_flags(assertion), stream);
        cfasl_output(assertions_high.assertion_arguments(assertion), stream);
        cfasl_output(assertion_plist_for_dumping(assertion), stream);
        return assertion;
    }

    public static SubLObject assertion_plist_for_dumping(final SubLObject assertion) {
        SubLObject result_plist = NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = assertion_plist(assertion); NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            if (property == $DEPENDENTS) {
                result_plist = putf(result_plist, property, set_contents.set_contents_element_list(value));
            } else
                if (property != $INDEX) {
                    result_plist = putf(result_plist, property, value);
                }

        }
        return result_plist;
    }

    public static final SubLObject load_assertion_content_alt(SubLObject assertion, SubLObject stream) {
        {
            SubLObject id = assertion_handles.assertion_id(assertion);
            SubLObject formula_data = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject mt = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject flags = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject v_arguments = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject plist = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            load_assertion_content_int(id, formula_data, mt, flags, v_arguments, plist);
        }
        return assertion;
    }

    public static SubLObject load_assertion_content(final SubLObject assertion, final SubLObject stream) {
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject formula_data = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject mt = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject flags = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject v_arguments = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject plist = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        load_assertion_content_int(id, formula_data, mt, flags, v_arguments, plist);
        return assertion;
    }

    public static final SubLObject load_assertion_content_int_alt(SubLObject id, SubLObject formula_data, SubLObject mt, SubLObject flags, SubLObject v_arguments, SubLObject plist) {
        {
            SubLObject assertion_content = create_assertion_content(mt);
            _csetf_as_content_formula_data(assertion_content, formula_data);
            _csetf_as_content_flags(assertion_content, flags);
            _csetf_as_content_arguments(assertion_content, v_arguments);
            _csetf_as_content_plist(assertion_content, plist);
            assertion_manager.register_assertion_content(id, assertion_content);
        }
        return id;
    }

    public static SubLObject load_assertion_content_int(final SubLObject id, final SubLObject formula_data, final SubLObject mt, final SubLObject flags, final SubLObject v_arguments, final SubLObject plist) {
        final SubLObject assertion_content = create_assertion_content(mt);
        _csetf_as_content_formula_data(assertion_content, formula_data);
        _csetf_as_content_flags(assertion_content, flags);
        _csetf_as_content_arguments(assertion_content, v_arguments);
        _csetf_as_content_plist(assertion_content, plist);
        assertion_manager.register_assertion_content(id, assertion_content);
        return id;
    }

    public static final SubLObject assertion_cnf_internal_alt(SubLObject assertion) {
        {
            SubLObject hl_cnf = assertion_hl_cnf(assertion);
            if (NIL != clause_strucs.clause_struc_p(hl_cnf)) {
                return clause_strucs.clause_struc_cnf(hl_cnf);
            } else {
                return hl_cnf;
            }
        }
    }

    public static SubLObject assertion_cnf_internal(final SubLObject assertion) {
        final SubLObject hl_cnf = assertion_hl_cnf(assertion);
        if (NIL != clause_strucs.clause_struc_p(hl_cnf)) {
            return clause_strucs.clause_struc_cnf(hl_cnf);
        }
        return hl_cnf;
    }

    public static final SubLObject possibly_assertion_cnf_internal_alt(SubLObject assertion) {
        return NIL != valid_assertion_with_contentP(assertion) ? ((SubLObject) (assertion_cnf_internal(assertion))) : NIL;
    }

    public static SubLObject possibly_assertion_cnf_internal(final SubLObject assertion) {
        return NIL != valid_assertion_with_contentP(assertion) ? assertion_cnf_internal(assertion) : NIL;
    }

    public static final SubLObject assertion_mt_internal_alt(SubLObject assertion) {
        return lookup_assertion_mt(assertion_handles.assertion_id(assertion));
    }

    public static SubLObject assertion_mt_internal(final SubLObject assertion) {
        return lookup_assertion_mt(assertion_handles.assertion_id(assertion));
    }

    public static final SubLObject assertion_gaf_hl_formula_internal_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != assertion_gaf_p(assertion))) {
                {
                    SubLObject formula_data = assertion_formula_data(assertion);
                    if (NIL != clause_strucs.clause_struc_p(formula_data)) {
                        return cnf_to_gaf_formula(clause_strucs.clause_struc_cnf(formula_data));
                    } else {
                        return formula_data;
                    }
                }
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject assertion_gaf_hl_formula_internal(final SubLObject assertion) {
        if (NIL == assertion_gaf_p(assertion)) {
            return NIL;
        }
        final SubLObject formula_data = assertion_formula_data(assertion);
        if (NIL != clause_strucs.clause_struc_p(formula_data)) {
            return cnf_to_gaf_formula(clause_strucs.clause_struc_cnf(formula_data));
        }
        return formula_data;
    }

    public static final SubLObject assertion_cons_internal_alt(SubLObject assertion) {
        return NIL != assertion_gaf_p(assertion) ? ((SubLObject) (assertions_high.assertion_gaf_hl_formula(assertion))) : assertion_cnf_internal(assertion);
    }

    public static SubLObject assertion_cons_internal(final SubLObject assertion) {
        return NIL != assertion_gaf_p(assertion) ? assertions_high.assertion_gaf_hl_formula(assertion) : assertion_cnf_internal(assertion);
    }

    public static final SubLObject assertion_direction_internal_alt(SubLObject assertion) {
        return enumeration_types.decode_direction(assertion_flags_direction_code(assertion_flags(assertion)));
    }

    public static SubLObject assertion_direction_internal(final SubLObject assertion) {
        return enumeration_types.decode_direction(assertion_flags_direction_code(assertion_flags(assertion)));
    }

    public static final SubLObject assertion_truth_internal_alt(SubLObject assertion) {
        return enumeration_types.tv_truth(assertion_tv(assertion));
    }

    public static SubLObject assertion_truth_internal(final SubLObject assertion) {
        if (NIL == use_non_true_assertion_tv_cacheP()) {
            return enumeration_types.tv_truth(assertion_tv_internal(assertion));
        }
        final SubLObject possible_non_true_tv = assertion_non_true_tv(assertion);
        if (NIL != possible_non_true_tv) {
            return enumeration_types.tv_truth(possible_non_true_tv);
        }
        return $TRUE;
    }

    public static final SubLObject assertion_strength_internal_alt(SubLObject assertion) {
        return enumeration_types.tv_strength(assertion_tv(assertion));
    }

    public static SubLObject assertion_strength_internal(final SubLObject assertion) {
        return enumeration_types.tv_strength(assertion_tv(assertion));
    }

    /**
     * Return the hl tv of ASSERTION.
     */
    @LispMethod(comment = "Return the hl tv of ASSERTION.")
    public static final SubLObject assertion_tv_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return enumeration_types.decode_tv(assertion_flags_tv_code(assertion_flags(assertion)));
    }

    /**
     * Return the hl tv of ASSERTION.
     */
    @LispMethod(comment = "Return the hl tv of ASSERTION.")
    public static SubLObject assertion_tv(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != use_non_true_assertion_tv_cacheP()) {
            final SubLObject possible_non_true_tv = assertion_non_true_tv(assertion);
            if (NIL != possible_non_true_tv) {
                return possible_non_true_tv;
            }
        }
        return assertion_tv_internal(assertion);
    }

    public static SubLObject assertion_tv_internal(final SubLObject assertion) {
        final SubLObject flags = assertion_flags(assertion);
        if (NIL == flags) {
            Errors.error($str35$_a__assertion___a__has_null_flags, assertion, assertion_handles.assertion_id(assertion));
        }
        return enumeration_types.decode_tv(assertion_flags_tv_code(flags));
    }

    /**
     * Return the list of names for the variables in ASSERTION.
     */
    @LispMethod(comment = "Return the list of names for the variables in ASSERTION.")
    public static final SubLObject assertion_variable_names_internal_alt(SubLObject assertion) {
        return get_assertion_prop(assertion, $VARIABLE_NAMES, UNPROVIDED);
    }

    /**
     * Return the list of names for the variables in ASSERTION.
     */
    @LispMethod(comment = "Return the list of names for the variables in ASSERTION.")
    public static SubLObject assertion_variable_names_internal(final SubLObject assertion) {
        return get_assertion_prop(assertion, $VARIABLE_NAMES, UNPROVIDED);
    }

    public static final SubLObject asserted_by_internal_alt(SubLObject assertion) {
        return NIL != assertions_high.asserted_assertionP(assertion) ? ((SubLObject) (assert_info_who(assertion_assert_info(assertion)))) : NIL;
    }

    public static SubLObject asserted_by_internal(final SubLObject assertion) {
        return NIL != assertions_high.asserted_assertionP(assertion) ? assert_info_who(assertion_assert_info(assertion)) : NIL;
    }

    public static final SubLObject asserted_when_internal_alt(SubLObject assertion) {
        return NIL != assertions_high.asserted_assertionP(assertion) ? ((SubLObject) (assert_info_when(assertion_assert_info(assertion)))) : NIL;
    }

    public static SubLObject asserted_when_internal(final SubLObject assertion) {
        return NIL != assertions_high.asserted_assertionP(assertion) ? assert_info_when(assertion_assert_info(assertion)) : NIL;
    }

    public static final SubLObject asserted_why_internal_alt(SubLObject assertion) {
        return NIL != assertions_high.asserted_assertionP(assertion) ? ((SubLObject) (assert_info_why(assertion_assert_info(assertion)))) : NIL;
    }

    public static SubLObject asserted_why_internal(final SubLObject assertion) {
        return NIL != assertions_high.asserted_assertionP(assertion) ? assert_info_why(assertion_assert_info(assertion)) : NIL;
    }

    public static final SubLObject asserted_second_internal_alt(SubLObject assertion) {
        return NIL != assertions_high.asserted_assertionP(assertion) ? ((SubLObject) (assert_info_second(assertion_assert_info(assertion)))) : NIL;
    }

    public static SubLObject asserted_second_internal(final SubLObject assertion) {
        return NIL != assertions_high.asserted_assertionP(assertion) ? assert_info_second(assertion_assert_info(assertion)) : NIL;
    }

    public static final SubLObject assertion_arguments_internal_alt(SubLObject assertion) {
        return lookup_assertion_arguments(assertion_handles.assertion_id(assertion));
    }

    public static SubLObject assertion_arguments_internal(final SubLObject assertion) {
        return lookup_assertion_arguments(assertion_handles.assertion_id(assertion));
    }

    public static final SubLObject assertion_dependents_internal_alt(SubLObject assertion) {
        return get_assertion_prop(assertion, $DEPENDENTS, UNPROVIDED);
    }

    public static SubLObject assertion_dependents_internal(final SubLObject assertion) {
        SubLObject dependents = get_assertion_prop(assertion, $DEPENDENTS, UNPROVIDED);
        if (dependents.isList() && (NIL != list_utilities.lengthG(dependents, $int$256, UNPROVIDED))) {
            dependents = keyhash_utilities.keyhash_list_elements(set_contents.set_contents_element_list(dependents), EQL, UNPROVIDED);
            set_assertion_prop(assertion, $DEPENDENTS, dependents);
        }
        return dependents;
    }

    public static SubLObject assertion_dependent_count_internal(final SubLObject assertion) {
        return set_contents.set_contents_size(get_assertion_prop(assertion, $DEPENDENTS, UNPROVIDED));
    }

    public static SubLObject assertion_has_dependents_p_internal(final SubLObject assertion) {
        return makeBoolean(NIL == set_contents.set_contents_emptyP(get_assertion_prop(assertion, $DEPENDENTS, UNPROVIDED)));
    }

    /**
     * Return the HL structure used to implement the formula for ASSERTION.
     * This will either be a clause struc containing a cnf, a cnf, or a gaf formula.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Return the HL structure used to implement the formula for ASSERTION.\r\nThis will either be a clause struc containing a cnf, a cnf, or a gaf formula.\r\n\r\n@unknown pace\nReturn the HL structure used to implement the formula for ASSERTION.\nThis will either be a clause struc containing a cnf, a cnf, or a gaf formula.")
    public static final SubLObject assertion_formula_data_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return lookup_assertion_formula_data(assertion_handles.assertion_id(assertion));
    }

    /**
     * Return the HL structure used to implement the formula for ASSERTION.
     * This will either be a clause struc containing a cnf, a cnf, or a gaf formula.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Return the HL structure used to implement the formula for ASSERTION.\r\nThis will either be a clause struc containing a cnf, a cnf, or a gaf formula.\r\n\r\n@unknown pace\nReturn the HL structure used to implement the formula for ASSERTION.\nThis will either be a clause struc containing a cnf, a cnf, or a gaf formula.")
    public static SubLObject assertion_formula_data(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return lookup_assertion_formula_data(assertion_handles.assertion_id(assertion));
    }

    /**
     * Primitively sets the HL structure used to implement the formula for ASSERTION.
     * This should either be a clause struc containing a cnf, a cnf, or a gaf formula.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Primitively sets the HL structure used to implement the formula for ASSERTION.\r\nThis should either be a clause struc containing a cnf, a cnf, or a gaf formula.\r\n\r\n@unknown pace\nPrimitively sets the HL structure used to implement the formula for ASSERTION.\nThis should either be a clause struc containing a cnf, a cnf, or a gaf formula.")
    public static final SubLObject reset_assertion_formula_data_alt(SubLObject assertion, SubLObject new_formula_data) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        set_assertion_formula_data(assertion_handles.assertion_id(assertion), new_formula_data);
        return assertion;
    }

    /**
     * Primitively sets the HL structure used to implement the formula for ASSERTION.
     * This should either be a clause struc containing a cnf, a cnf, or a gaf formula.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Primitively sets the HL structure used to implement the formula for ASSERTION.\r\nThis should either be a clause struc containing a cnf, a cnf, or a gaf formula.\r\n\r\n@unknown pace\nPrimitively sets the HL structure used to implement the formula for ASSERTION.\nThis should either be a clause struc containing a cnf, a cnf, or a gaf formula.")
    public static SubLObject reset_assertion_formula_data(final SubLObject assertion, final SubLObject new_formula_data) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        set_assertion_formula_data(assertion_handles.assertion_id(assertion), new_formula_data);
        return assertion;
    }

    /**
     * Return the HL structure used to implement the CNF clause for ASSERTION.
     * This will either be a clause struc containing a cnf, or a cnf.
     * gaf formulas are expanded into CNFs.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Return the HL structure used to implement the CNF clause for ASSERTION.\r\nThis will either be a clause struc containing a cnf, or a cnf.\r\ngaf formulas are expanded into CNFs.\r\n\r\n@unknown pace\nReturn the HL structure used to implement the CNF clause for ASSERTION.\nThis will either be a clause struc containing a cnf, or a cnf.\ngaf formulas are expanded into CNFs.")
    public static final SubLObject assertion_hl_cnf_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject formula_data = assertion_formula_data(assertion);
            if (NIL != clause_strucs.clause_struc_p(formula_data)) {
                return formula_data;
            } else {
                if (NIL == formula_data) {
                    return formula_data;
                } else {
                    if (NIL == assertion_gaf_p(assertion)) {
                        return formula_data;
                    } else {
                        return gaf_formula_to_cnf(formula_data);
                    }
                }
            }
        }
    }

    /**
     * Return the HL structure used to implement the CNF clause for ASSERTION.
     * This will either be a clause struc containing a cnf, or a cnf.
     * gaf formulas are expanded into CNFs.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Return the HL structure used to implement the CNF clause for ASSERTION.\r\nThis will either be a clause struc containing a cnf, or a cnf.\r\ngaf formulas are expanded into CNFs.\r\n\r\n@unknown pace\nReturn the HL structure used to implement the CNF clause for ASSERTION.\nThis will either be a clause struc containing a cnf, or a cnf.\ngaf formulas are expanded into CNFs.")
    public static SubLObject assertion_hl_cnf(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject formula_data = assertion_formula_data(assertion);
        if (NIL != clause_strucs.clause_struc_p(formula_data)) {
            return formula_data;
        }
        if (NIL == formula_data) {
            return formula_data;
        }
        if (NIL == assertion_gaf_p(assertion)) {
            return formula_data;
        }
        return gaf_formula_to_cnf(formula_data);
    }

    /**
     * Primitively change the formula data of ASSERTION to NEW-FORMULA-DATA,
     * and update the GAF flag.  Assumes that NEW-FORMULA-DATA is either a CNF clause, a gaf formula, a clause-struc, or NIL.
     *
     * @unknown pace
     * @unknown robustify against @xref cnf-impostor? formulas
     */
    @LispMethod(comment = "Primitively change the formula data of ASSERTION to NEW-FORMULA-DATA,\r\nand update the GAF flag.  Assumes that NEW-FORMULA-DATA is either a CNF clause, a gaf formula, a clause-struc, or NIL.\r\n\r\n@unknown pace\r\n@unknown robustify against @xref cnf-impostor? formulas\nPrimitively change the formula data of ASSERTION to NEW-FORMULA-DATA,\nand update the GAF flag.  Assumes that NEW-FORMULA-DATA is either a CNF clause, a gaf formula, a clause-struc, or NIL.")
    public static final SubLObject update_assertion_formula_data_alt(SubLObject assertion, SubLObject new_formula_data) {
        if (NIL != clause_strucs.clause_struc_p(new_formula_data)) {
            reset_assertion_clause_struc(assertion, new_formula_data);
        } else {
            if (NIL == new_formula_data) {
                annihilate_assertion_formula_data(assertion);
            } else {
                if (NIL != clauses.cnf_p(new_formula_data)) {
                    reset_assertion_cnf(assertion, new_formula_data);
                } else {
                    if (NIL != el_formula_p(new_formula_data)) {
                        reset_assertion_gaf_formula(assertion, new_formula_data);
                    } else {
                        Errors.error($str_alt29$Unexpected_formula_data_type___S, new_formula_data);
                        return NIL;
                    }
                }
            }
        }
        return assertion;
    }

    /**
     * Primitively change the formula data of ASSERTION to NEW-FORMULA-DATA,
     * and update the GAF flag.  Assumes that NEW-FORMULA-DATA is either a CNF clause, a gaf formula, a clause-struc, or NIL.
     *
     * @unknown pace
     * @unknown robustify against @xref cnf-impostor? formulas
     */
    @LispMethod(comment = "Primitively change the formula data of ASSERTION to NEW-FORMULA-DATA,\r\nand update the GAF flag.  Assumes that NEW-FORMULA-DATA is either a CNF clause, a gaf formula, a clause-struc, or NIL.\r\n\r\n@unknown pace\r\n@unknown robustify against @xref cnf-impostor? formulas\nPrimitively change the formula data of ASSERTION to NEW-FORMULA-DATA,\nand update the GAF flag.  Assumes that NEW-FORMULA-DATA is either a CNF clause, a gaf formula, a clause-struc, or NIL.")
    public static SubLObject update_assertion_formula_data(final SubLObject assertion, final SubLObject new_formula_data) {
        if (NIL != clause_strucs.clause_struc_p(new_formula_data)) {
            reset_assertion_clause_struc(assertion, new_formula_data);
        } else
            if (NIL == new_formula_data) {
                annihilate_assertion_formula_data(assertion);
            } else
                if (NIL != clauses.cnf_p(new_formula_data)) {
                    reset_assertion_cnf(assertion, new_formula_data);
                } else {
                    if (NIL == el_formula_p(new_formula_data)) {
                        Errors.error($str38$Unexpected_formula_data_type___S, new_formula_data);
                        return NIL;
                    }
                    reset_assertion_gaf_formula(assertion, new_formula_data);
                }


        return assertion;
    }

    /**
     * If ASSERTION has a clause struc as its HL CNF implementation, return it.
     * Otherwise, return NIL.
     */
    @LispMethod(comment = "If ASSERTION has a clause struc as its HL CNF implementation, return it.\r\nOtherwise, return NIL.\nIf ASSERTION has a clause struc as its HL CNF implementation, return it.\nOtherwise, return NIL.")
    public static final SubLObject assertion_clause_struc_alt(SubLObject assertion) {
        {
            SubLObject formula_data = assertion_formula_data(assertion);
            return NIL != clause_strucs.clause_struc_p(formula_data) ? ((SubLObject) (formula_data)) : NIL;
        }
    }

    /**
     * If ASSERTION has a clause struc as its HL CNF implementation, return it.
     * Otherwise, return NIL.
     */
    @LispMethod(comment = "If ASSERTION has a clause struc as its HL CNF implementation, return it.\r\nOtherwise, return NIL.\nIf ASSERTION has a clause struc as its HL CNF implementation, return it.\nOtherwise, return NIL.")
    public static SubLObject assertion_clause_struc(final SubLObject assertion) {
        final SubLObject formula_data = assertion_formula_data(assertion);
        return NIL != clause_strucs.clause_struc_p(formula_data) ? formula_data : NIL;
    }

    /**
     * Primitively change the formula data of ASSERTION to NEW-CNF,
     * and update the GAF flag.  Shrinks NEW-CNF to a gaf formula if possible.
     *
     * @param NEW-CNF
    cnf-p
     * 		
     * @unknown pace
     */
    @LispMethod(comment = "Primitively change the formula data of ASSERTION to NEW-CNF,\r\nand update the GAF flag.  Shrinks NEW-CNF to a gaf formula if possible.\r\n\r\n@param NEW-CNF\ncnf-p\r\n\t\t\r\n@unknown pace\nPrimitively change the formula data of ASSERTION to NEW-CNF,\nand update the GAF flag.  Shrinks NEW-CNF to a gaf formula if possible.")
    public static final SubLObject reset_assertion_cnf_alt(SubLObject assertion, SubLObject new_cnf) {
        {
            SubLObject gafP = determine_cnf_gaf_p(new_cnf);
            reset_assertion_formula_data(assertion, NIL != gafP ? ((SubLObject) (cnf_to_gaf_formula(new_cnf))) : new_cnf);
            set_assertion_gaf_p(assertion, gafP);
            return assertion;
        }
    }

    /**
     * Primitively change the formula data of ASSERTION to NEW-CNF,
     * and update the GAF flag.  Shrinks NEW-CNF to a gaf formula if possible.
     *
     * @param NEW-CNF
    		cnf-p
     * 		
     * @unknown pace
     */
    @LispMethod(comment = "Primitively change the formula data of ASSERTION to NEW-CNF,\r\nand update the GAF flag.  Shrinks NEW-CNF to a gaf formula if possible.\r\n\r\n@param NEW-CNF\n\t\tcnf-p\r\n\t\t\r\n@unknown pace\nPrimitively change the formula data of ASSERTION to NEW-CNF,\nand update the GAF flag.  Shrinks NEW-CNF to a gaf formula if possible.")
    public static SubLObject reset_assertion_cnf(final SubLObject assertion, final SubLObject new_cnf) {
        final SubLObject gafP = determine_cnf_gaf_p(new_cnf);
        reset_assertion_formula_data(assertion, NIL != gafP ? cnf_to_gaf_formula(new_cnf) : new_cnf);
        set_assertion_gaf_p(assertion, gafP);
        return assertion;
    }

    /**
     * Primitively change the formula data of ASSERTION to NEW-CLAUSE-STRUC,
     * and update the GAF flag.  Assumes that NEW-CLAUSE-STRUC is a clause-struc-p.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Primitively change the formula data of ASSERTION to NEW-CLAUSE-STRUC,\r\nand update the GAF flag.  Assumes that NEW-CLAUSE-STRUC is a clause-struc-p.\r\n\r\n@unknown pace\nPrimitively change the formula data of ASSERTION to NEW-CLAUSE-STRUC,\nand update the GAF flag.  Assumes that NEW-CLAUSE-STRUC is a clause-struc-p.")
    public static final SubLObject reset_assertion_clause_struc_alt(SubLObject assertion, SubLObject new_clause_struc) {
        {
            SubLObject new_hl_cnf = clause_strucs.clause_struc_cnf(new_clause_struc);
            reset_assertion_formula_data(assertion, new_clause_struc);
            if (NIL == new_hl_cnf) {
                return annihilate_assertion_formula_data(assertion);
            }
            recompute_assertion_gaf_p(assertion);
            return assertion;
        }
    }

    /**
     * Primitively change the formula data of ASSERTION to NEW-CLAUSE-STRUC,
     * and update the GAF flag.  Assumes that NEW-CLAUSE-STRUC is a clause-struc-p.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Primitively change the formula data of ASSERTION to NEW-CLAUSE-STRUC,\r\nand update the GAF flag.  Assumes that NEW-CLAUSE-STRUC is a clause-struc-p.\r\n\r\n@unknown pace\nPrimitively change the formula data of ASSERTION to NEW-CLAUSE-STRUC,\nand update the GAF flag.  Assumes that NEW-CLAUSE-STRUC is a clause-struc-p.")
    public static SubLObject reset_assertion_clause_struc(final SubLObject assertion, final SubLObject new_clause_struc) {
        final SubLObject new_hl_cnf = clause_strucs.clause_struc_cnf(new_clause_struc);
        reset_assertion_formula_data(assertion, new_clause_struc);
        if (NIL == new_hl_cnf) {
            return annihilate_assertion_formula_data(assertion);
        }
        recompute_assertion_gaf_p(assertion);
        return assertion;
    }

    /**
     * Primitively change the formula data of ASSERTION to NEW-GAF-FORMULA,
     * and set the GAF flag to t.  Assumes that NEW-GAF-FORMULA is a valid gaf formula.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Primitively change the formula data of ASSERTION to NEW-GAF-FORMULA,\r\nand set the GAF flag to t.  Assumes that NEW-GAF-FORMULA is a valid gaf formula.\r\n\r\n@unknown pace\nPrimitively change the formula data of ASSERTION to NEW-GAF-FORMULA,\nand set the GAF flag to t.  Assumes that NEW-GAF-FORMULA is a valid gaf formula.")
    public static final SubLObject reset_assertion_gaf_formula_alt(SubLObject assertion, SubLObject new_gaf_formula) {
        reset_assertion_formula_data(assertion, new_gaf_formula);
        set_assertion_gaf_p(assertion, T);
        return assertion;
    }

    /**
     * Primitively change the formula data of ASSERTION to NEW-GAF-FORMULA,
     * and set the GAF flag to t.  Assumes that NEW-GAF-FORMULA is a valid gaf formula.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Primitively change the formula data of ASSERTION to NEW-GAF-FORMULA,\r\nand set the GAF flag to t.  Assumes that NEW-GAF-FORMULA is a valid gaf formula.\r\n\r\n@unknown pace\nPrimitively change the formula data of ASSERTION to NEW-GAF-FORMULA,\nand set the GAF flag to t.  Assumes that NEW-GAF-FORMULA is a valid gaf formula.")
    public static SubLObject reset_assertion_gaf_formula(final SubLObject assertion, final SubLObject new_gaf_formula) {
        reset_assertion_formula_data(assertion, new_gaf_formula);
        set_assertion_gaf_p(assertion, T);
        return assertion;
    }

    /**
     * Primitively change the formula data of ASSERTION to nil,
     * and update the GAF flag to t (why not?)
     *
     * @unknown pace
     */
    @LispMethod(comment = "Primitively change the formula data of ASSERTION to nil,\r\nand update the GAF flag to t (why not?)\r\n\r\n@unknown pace\nPrimitively change the formula data of ASSERTION to nil,\nand update the GAF flag to t (why not?)")
    public static final SubLObject annihilate_assertion_formula_data_alt(SubLObject assertion) {
        reset_assertion_formula_data(assertion, NIL);
        set_assertion_gaf_p(assertion, T);
        return assertion;
    }

    /**
     * Primitively change the formula data of ASSERTION to nil,
     * and update the GAF flag to t (why not?)
     *
     * @unknown pace
     */
    @LispMethod(comment = "Primitively change the formula data of ASSERTION to nil,\r\nand update the GAF flag to t (why not?)\r\n\r\n@unknown pace\nPrimitively change the formula data of ASSERTION to nil,\nand update the GAF flag to t (why not?)")
    public static SubLObject annihilate_assertion_formula_data(final SubLObject assertion) {
        reset_assertion_formula_data(assertion, NIL);
        set_assertion_gaf_p(assertion, T);
        return assertion;
    }

    /**
     * Return the bit-flags for ASSERTION
     */
    @LispMethod(comment = "Return the bit-flags for ASSERTION")
    public static final SubLObject assertion_flags_alt(SubLObject assertion) {
        {
            SubLObject flags = lookup_assertion_flags(assertion_handles.assertion_id(assertion));
            return flags;
        }
    }

    /**
     * Return the bit-flags for ASSERTION
     */
    @LispMethod(comment = "Return the bit-flags for ASSERTION")
    public static SubLObject assertion_flags(final SubLObject assertion) {
        final SubLObject flags = lookup_assertion_flags(assertion_handles.assertion_id(assertion));
        return flags;
    }

    public static final SubLObject reset_assertion_flags_alt(SubLObject assertion, SubLObject new_flags) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject flags = assertion_flags(assertion);
            if (!flags.eql(new_flags)) {
                set_assertion_flags(assertion_handles.assertion_id(assertion), new_flags);
            }
        }
        return assertion;
    }

    public static SubLObject reset_assertion_flags(final SubLObject assertion, final SubLObject new_flags) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject flags = assertion_flags(assertion);
        if (!flags.eql(new_flags)) {
            set_assertion_flags(assertion_handles.assertion_id(assertion), new_flags);
        }
        return assertion;
    }

    public static final SubLObject assertion_flags_gaf_code_alt(SubLObject flags) {
        return bytes.ldb($assertion_flags_gaf_byte$.getGlobalValue(), flags);
    }

    public static SubLObject assertion_flags_gaf_code(final SubLObject flags) {
        return bytes.ldb($assertion_flags_gaf_byte$.getGlobalValue(), flags);
    }

    public static final SubLObject set_assertion_flags_gaf_code_alt(SubLObject flags, SubLObject code) {
        return bytes.dpb(code, $assertion_flags_gaf_byte$.getGlobalValue(), flags);
    }

    public static SubLObject set_assertion_flags_gaf_code(final SubLObject flags, final SubLObject code) {
        return bytes.dpb(code, $assertion_flags_gaf_byte$.getGlobalValue(), flags);
    }

    public static final SubLObject assertion_flags_direction_code_alt(SubLObject flags) {
        return bytes.ldb($assertion_flags_direction_byte$.getGlobalValue(), flags);
    }

    public static SubLObject assertion_flags_direction_code(final SubLObject flags) {
        return bytes.ldb($assertion_flags_direction_byte$.getGlobalValue(), flags);
    }

    public static final SubLObject set_assertion_flags_direction_code_alt(SubLObject flags, SubLObject code) {
        return bytes.dpb(code, $assertion_flags_direction_byte$.getGlobalValue(), flags);
    }

    public static SubLObject set_assertion_flags_direction_code(final SubLObject flags, final SubLObject code) {
        return bytes.dpb(code, $assertion_flags_direction_byte$.getGlobalValue(), flags);
    }

    public static final SubLObject assertion_flags_tv_code_alt(SubLObject flags) {
        return bytes.ldb($assertion_flags_tv_byte$.getGlobalValue(), flags);
    }

    public static SubLObject assertion_flags_tv_code(final SubLObject flags) {
        return bytes.ldb($assertion_flags_tv_byte$.getGlobalValue(), flags);
    }

    public static final SubLObject set_assertion_flags_tv_code_alt(SubLObject flags, SubLObject code) {
        return bytes.dpb(code, $assertion_flags_tv_byte$.getGlobalValue(), flags);
    }

    public static SubLObject set_assertion_flags_tv_code(final SubLObject flags, final SubLObject code) {
        return bytes.dpb(code, $assertion_flags_tv_byte$.getGlobalValue(), flags);
    }

    /**
     * Return T iff ASSERTION is a GAF according to its internal flag bits.
     */
    @LispMethod(comment = "Return T iff ASSERTION is a GAF according to its internal flag bits.")
    public static final SubLObject assertion_flags_gaf_p_alt(SubLObject assertion) {
        return oddp(assertion_flags(assertion));
    }

    @LispMethod(comment = "Return T iff ASSERTION is a GAF according to its internal flag bits.")
    public static SubLObject assertion_flags_gaf_p(final SubLObject assertion) {
        return oddp(assertion_flags(assertion));
    }

    /**
     * Primitively set the gaf flag of ASSERTION
     *
     * @unknown pace
     */
    @LispMethod(comment = "Primitively set the gaf flag of ASSERTION\r\n\r\n@unknown pace")
    public static final SubLObject set_assertion_flags_gaf_p_alt(SubLObject assertion, SubLObject gafP) {
        {
            SubLObject gaf_code = number_utilities.encode_boolean(gafP);
            if (NIL != gaf_code) {
                reset_assertion_flags(assertion, set_assertion_flags_gaf_code(assertion_flags(assertion), gaf_code));
            }
        }
        return assertion;
    }

    @LispMethod(comment = "Primitively set the gaf flag of ASSERTION\r\n\r\n@unknown pace")
    public static SubLObject set_assertion_flags_gaf_p(final SubLObject assertion, final SubLObject gafP) {
        final SubLObject gaf_code = number_utilities.encode_boolean(gafP);
        if (NIL != gaf_code) {
            reset_assertion_flags(assertion, set_assertion_flags_gaf_code(assertion_flags(assertion), gaf_code));
        }
        return assertion;
    }

    public static SubLObject use_rule_setP() {
        return makeBoolean((NIL != $prefer_rule_set_over_flagsP$.getGlobalValue()) && (NIL != $rule_set$.getGlobalValue()));
    }

    public static final SubLObject setup_rule_set_alt(SubLObject estimated_assertion_size) {
        SubLTrampolineFile.checkType(estimated_assertion_size, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject estimated_rule_count = ceiling(divide(estimated_assertion_size, $estimated_assertions_per_rule$.getGlobalValue()), UNPROVIDED);
            $rule_set$.setGlobalValue(keyhash.new_keyhash(estimated_rule_count, symbol_function(EQ)));
            return T;
        }
    }

    public static SubLObject setup_rule_set(final SubLObject estimated_assertion_size) {
        assert NIL != subl_promotions.non_negative_integer_p(estimated_assertion_size) : "! subl_promotions.non_negative_integer_p(estimated_assertion_size) " + ("subl_promotions.non_negative_integer_p(estimated_assertion_size) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(estimated_assertion_size) ") + estimated_assertion_size;
        final SubLObject estimated_rule_count = ceiling(divide(estimated_assertion_size, $estimated_assertions_per_rule$.getGlobalValue()), UNPROVIDED);
        $rule_set$.setGlobalValue(keyhash.new_keyhash(estimated_rule_count, symbol_function(EQL)));
        return T;
    }

    public static final SubLObject kb_rule_set_alt() {
        return $rule_set$.getGlobalValue();
    }

    public static SubLObject kb_rule_set() {
        return $rule_set$.getGlobalValue();
    }

    public static final SubLObject assertion_gaf_p_alt(SubLObject assertion) {
        if (NIL != $prefer_rule_set_over_flagsP$.getGlobalValue()) {
            if (NIL != $rule_set$.getGlobalValue()) {
                return makeBoolean(NIL == keyhash.getkeyhash(assertion, $rule_set$.getGlobalValue()));
            }
        }
        return assertion_flags_gaf_p(assertion);
    }

    public static SubLObject assertion_gaf_p(final SubLObject assertion) {
        if ((NIL != use_rule_setP()) && (NIL != assertion_manager.assertion_content_cachable_p(assertion))) {
            if ($rule_set$.getGlobalValue().isHashtable()) {
                return makeBoolean(NIL == gethash_without_values(assertion, $rule_set$.getGlobalValue(), NIL));
            }
            return makeBoolean(NIL == keyhash.getkeyhash(assertion, $rule_set$.getGlobalValue()));
        } else {
            if (NIL != assertion_handles.assertion_has_contentP(assertion)) {
                return assertion_flags_gaf_p(assertion);
            }
            return NIL;
        }
    }

    public static final SubLObject assertion_rule_p_alt(SubLObject assertion) {
        return makeBoolean(NIL == assertion_gaf_p(assertion));
    }

    public static SubLObject assertion_rule_p(final SubLObject assertion) {
        if ((NIL != use_rule_setP()) && (NIL != assertion_manager.assertion_content_cachable_p(assertion))) {
            if ($rule_set$.getGlobalValue().isHashtable()) {
                return gethash_without_values(assertion, $rule_set$.getGlobalValue(), NIL);
            }
            return keyhash.getkeyhash(assertion, $rule_set$.getGlobalValue());
        } else {
            if (NIL != assertion_handles.assertion_has_contentP(assertion)) {
                return makeBoolean(NIL == assertion_flags_gaf_p(assertion));
            }
            return NIL;
        }
    }

    public static final SubLObject rule_count_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $rule_set$.getGlobalValue()) {
                return keyhash.keyhash_count($rule_set$.getGlobalValue());
            }
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$mapping_Cyc_assertions, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_Cyc_assertions);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject ass = NIL;
                                while (NIL != id) {
                                    ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != assertion_rule_p(ass)) {
                                            count = add(count, ONE_INTEGER);
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject rule_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != keyhash.keyhash_p($rule_set$.getGlobalValue())) {
            return keyhash.keyhash_count($rule_set$.getGlobalValue());
        }
        if ($rule_set$.getGlobalValue().isHashtable()) {
            return hash_table_count($rule_set$.getGlobalValue());
        }
        SubLObject count = ZERO_INTEGER;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$mapping_Cyc_assertions;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$1 = idx;
                if (NIL == id_index_objects_empty_p(idx_$1, $SKIP)) {
                    final SubLObject idx_$2 = idx_$1;
                    if (NIL == id_index_dense_objects_empty_p(idx_$2, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$2);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertion_rule_p(ass)) {
                                    count = add(count, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$3 = idx_$1;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$3)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$3);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$3);
                        final SubLObject end_id = id_index_next_id(idx_$3);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertion_rule_p(ass2)) {
                                    count = add(count, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject gaf_count_alt() {
        return subtract(assertion_handles.assertion_count(), rule_count());
    }

    public static SubLObject gaf_count() {
        return subtract(assertion_handles.assertion_count(), rule_count());
    }

    /**
     * Primitively set the gaf flag of ASSERTION
     *
     * @unknown pace
     */
    @LispMethod(comment = "Primitively set the gaf flag of ASSERTION\r\n\r\n@unknown pace")
    public static final SubLObject set_assertion_gaf_p_alt(SubLObject assertion, SubLObject gafP) {
        if (NIL != $rule_set$.getGlobalValue()) {
            if (NIL != gafP) {
                keyhash.remkeyhash(assertion, $rule_set$.getGlobalValue());
            } else {
                keyhash.setkeyhash(assertion, $rule_set$.getGlobalValue());
            }
        }
        return set_assertion_flags_gaf_p(assertion, gafP);
    }

    /**
     * Primitively set the gaf flag of ASSERTION
     *
     * @unknown pace
     */
    @LispMethod(comment = "Primitively set the gaf flag of ASSERTION\r\n\r\n@unknown pace")
    public static SubLObject set_assertion_gaf_p(final SubLObject assertion, final SubLObject gafP) {
        if (NIL != keyhash.keyhash_p($rule_set$.getGlobalValue())) {
            if (NIL != gafP) {
                keyhash.remkeyhash(assertion, $rule_set$.getGlobalValue());
            } else {
                keyhash.setkeyhash(assertion, $rule_set$.getGlobalValue());
            }
        } else
            if ($rule_set$.getGlobalValue().isHashtable()) {
                if (NIL != gafP) {
                    remhash(assertion, $rule_set$.getGlobalValue());
                } else {
                    sethash(assertion, $rule_set$.getGlobalValue(), T);
                }
            }

        return set_assertion_flags_gaf_p(assertion, gafP);
    }

    public static final SubLObject possibly_rule_set_delete_alt(SubLObject assertion) {
        if (NIL != $rule_set$.getGlobalValue()) {
            if (NIL != assertion_rule_p(assertion)) {
                return keyhash.remkeyhash(assertion, $rule_set$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject possibly_rule_set_delete(final SubLObject assertion) {
        if (NIL != keyhash.keyhash_p($rule_set$.getGlobalValue())) {
            if (NIL != assertion_rule_p(assertion)) {
                return keyhash.remkeyhash(assertion, $rule_set$.getGlobalValue());
            }
        } else
            if ($rule_set$.getGlobalValue().isHashtable() && (NIL != assertion_rule_p(assertion))) {
                return remhash(assertion, $rule_set$.getGlobalValue());
            }

        return NIL;
    }

    /**
     * Primitively recompute the gaf flag of ASSERTION
     *
     * @unknown pace
     * @unknown handle strange gafs that look like cnfs
     */
    @LispMethod(comment = "Primitively recompute the gaf flag of ASSERTION\r\n\r\n@unknown pace\r\n@unknown handle strange gafs that look like cnfs")
    public static final SubLObject recompute_assertion_gaf_p_alt(SubLObject assertion) {
        {
            SubLObject formula_data = assertion_formula_data(assertion);
            SubLObject gafP = NIL;
            if (NIL != clause_strucs.clause_struc_p(formula_data)) {
                gafP = determine_cnf_gaf_p(clause_strucs.clause_struc_cnf(formula_data));
            } else {
                if (NIL != clauses.cnf_p(formula_data)) {
                    gafP = determine_cnf_gaf_p(formula_data);
                } else {
                    gafP = T;
                }
            }
            return set_assertion_gaf_p(assertion, gafP);
        }
    }

    /**
     * Primitively recompute the gaf flag of ASSERTION
     *
     * @unknown pace
     * @unknown handle strange gafs that look like cnfs
     */
    @LispMethod(comment = "Primitively recompute the gaf flag of ASSERTION\r\n\r\n@unknown pace\r\n@unknown handle strange gafs that look like cnfs")
    public static SubLObject recompute_assertion_gaf_p(final SubLObject assertion) {
        final SubLObject formula_data = assertion_formula_data(assertion);
        SubLObject gafP = NIL;
        if (NIL != clause_strucs.clause_struc_p(formula_data)) {
            gafP = determine_cnf_gaf_p(clause_strucs.clause_struc_cnf(formula_data));
        } else
            if (NIL != clauses.cnf_p(formula_data)) {
                gafP = determine_cnf_gaf_p(formula_data);
            } else {
                gafP = T;
            }

        return set_assertion_gaf_p(assertion, gafP);
    }

    /**
     *
     *
     * @return boolean; the recomputed value for the gaf flag of ASSERTION
     * @param CNF
    cnf-p
     * 		
     * @unknown pace
     */
    @LispMethod(comment = "@return boolean; the recomputed value for the gaf flag of ASSERTION\r\n@param CNF\ncnf-p\r\n\t\t\r\n@unknown pace")
    public static final SubLObject determine_cnf_gaf_p_alt(SubLObject cnf) {
        SubLTrampolineFile.checkType(cnf, CNF_P);
        return clauses.gaf_cnfP(cnf);
    }

    /**
     *
     *
     * @return boolean; the recomputed value for the gaf flag of ASSERTION
     * @param CNF
    cnf-p
     * 		
     * @unknown pace
     */
    @LispMethod(comment = "@return boolean; the recomputed value for the gaf flag of ASSERTION\r\n@param CNF\ncnf-p\r\n\t\t\r\n@unknown pace")
    public static SubLObject determine_cnf_gaf_p(final SubLObject cnf) {
        assert NIL != clauses.cnf_p(cnf) : "! clauses.cnf_p(cnf) " + ("clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) ") + cnf;
        return clauses.gaf_cnfP(cnf);
    }

    public static final SubLObject dump_rule_set_to_stream_alt(SubLObject stream) {
        return cfasl_output($rule_set$.getGlobalValue(), stream);
    }

    public static SubLObject dump_rule_set_to_stream(final SubLObject stream) {
        SubLObject rule_set = $rule_set$.getGlobalValue();
        if (rule_set.isHashtable()) {
            rule_set = keyhash_utilities.hashtable_to_keyhash(rule_set);
        }
        assert NIL != keyhash.keyhash_p(rule_set) : "! keyhash.keyhash_p(rule_set) " + ("keyhash.keyhash_p(rule_set) " + "CommonSymbols.NIL != keyhash.keyhash_p(rule_set) ") + rule_set;
        return cfasl_output(rule_set, stream);
    }

    public static final SubLObject load_rule_set_from_stream_alt(SubLObject stream) {
        $rule_set$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return keyhash.keyhash_count($rule_set$.getGlobalValue());
    }

    public static SubLObject load_rule_set_from_stream(final SubLObject stream) {
        final SubLObject rule_set = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != keyhash.keyhash_p(rule_set) : "! keyhash.keyhash_p(rule_set) " + ("keyhash.keyhash_p(rule_set) " + "CommonSymbols.NIL != keyhash.keyhash_p(rule_set) ") + rule_set;
        $rule_set$.setGlobalValue(rule_set);
        return rule_count();
    }

    public static final SubLObject rebuild_rule_set_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            setup_rule_set(assertion_handles.assertion_count());
            {
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$Rebuilding_the_Rule_Set, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$Rebuilding_the_Rule_Set);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject rule = NIL;
                                while (NIL != id) {
                                    rule = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, rule, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != assertion_handles.assertion_handle_validP(rule)) {
                                            if (NIL == assertion_flags_gaf_p(rule)) {
                                                keyhash.setkeyhash(rule, $rule_set$.getGlobalValue());
                                            }
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return keyhash.keyhash_count($rule_set$.getGlobalValue());
        }
    }

    public static SubLObject rebuild_rule_set() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        setup_rule_set(assertion_handles.assertion_count());
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$Rebuilding_the_Rule_Set;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$5 = idx;
                if (NIL == id_index_objects_empty_p(idx_$5, $SKIP)) {
                    final SubLObject idx_$6 = idx_$5;
                    if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$6);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject rule;
                        SubLObject message_var;
                        SubLObject was_appendingP;
                        SubLObject _prev_bind_0_$7;
                        SubLObject _prev_bind_0_$8;
                        SubLObject _values;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                rule = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                message_var = NIL;
                                was_appendingP = eval($append_stack_traces_to_error_messagesP$);
                                eval($list50);
                                try {
                                    try {
                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                        _prev_bind_0_$7 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                if ((NIL != assertion_handles.assertion_handle_validP(rule)) && (NIL == assertion_flags_gaf_p(rule))) {
                                                    if ($rule_set$.getGlobalValue().isHashtable()) {
                                                        sethash(rule, $rule_set$.getGlobalValue(), T);
                                                    } else {
                                                        keyhash.setkeyhash(rule, $rule_set$.getGlobalValue());
                                                    }
                                                }
                                            } catch (final Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var) {
                                        message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                } finally {
                                    _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        _values = getValuesAsVector();
                                        eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                    }
                                }
                                if (message_var.isString()) {
                                    Errors.warn($str53$_A, message_var);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$7 = idx_$5;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$7)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$7);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$7);
                        final SubLObject end_id = id_index_next_id(idx_$7);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject rule2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                SubLObject message_var2 = NIL;
                                final SubLObject was_appendingP2 = eval($append_stack_traces_to_error_messagesP$);
                                eval($list50);
                                try {
                                    try {
                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                        final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                if ((NIL != assertion_handles.assertion_handle_validP(rule2)) && (NIL == assertion_flags_gaf_p(rule2))) {
                                                    if ($rule_set$.getGlobalValue().isHashtable()) {
                                                        sethash(rule2, $rule_set$.getGlobalValue(), T);
                                                    } else {
                                                        keyhash.setkeyhash(rule2, $rule_set$.getGlobalValue());
                                                    }
                                                }
                                            } catch (final Throwable catch_var2) {
                                                Errors.handleThrowable(catch_var2, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var2) {
                                        message_var2 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP2));
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                    }
                                }
                                if (message_var2.isString()) {
                                    Errors.warn($str53$_A, message_var2);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return rule_count();
    }

    /**
     * Converts a gaf formula to a CNF clause.
     *
     * @param gaf
    el-formula-p
     * 		
     * @return cnf-p
     */
    @LispMethod(comment = "Converts a gaf formula to a CNF clause.\r\n\r\n@param gaf\nel-formula-p\r\n\t\t\r\n@return cnf-p")
    public static final SubLObject gaf_formula_to_cnf_alt(SubLObject gaf) {
        return clause_utilities.make_gaf_cnf(gaf);
    }

    /**
     * Converts a gaf formula to a CNF clause.
     *
     * @param gaf
    		el-formula-p
     * 		
     * @return cnf-p
     */
    @LispMethod(comment = "Converts a gaf formula to a CNF clause.\r\n\r\n@param gaf\n\t\tel-formula-p\r\n\t\t\r\n@return cnf-p")
    public static SubLObject gaf_formula_to_cnf(final SubLObject gaf) {
        return clause_utilities.make_gaf_cnf(gaf);
    }

    /**
     * Converts a CNF representation of a gaf formula to a gaf formula.
     *
     * @param cnf
    cnf-p
     * 		
     * @return el-formula-p
     */
    @LispMethod(comment = "Converts a CNF representation of a gaf formula to a gaf formula.\r\n\r\n@param cnf\ncnf-p\r\n\t\t\r\n@return el-formula-p")
    public static final SubLObject cnf_to_gaf_formula_alt(SubLObject cnf) {
        return clause_utilities.gaf_cnf_literal(cnf);
    }

    /**
     * Converts a CNF representation of a gaf formula to a gaf formula.
     *
     * @param cnf
    		cnf-p
     * 		
     * @return el-formula-p
     */
    @LispMethod(comment = "Converts a CNF representation of a gaf formula to a gaf formula.\r\n\r\n@param cnf\n\t\tcnf-p\r\n\t\t\r\n@return el-formula-p")
    public static SubLObject cnf_to_gaf_formula(final SubLObject cnf) {
        return clause_utilities.gaf_cnf_literal(cnf);
    }

    public static final SubLObject kb_set_assertion_direction_internal_alt(SubLObject assertion, SubLObject new_direction) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            reset_assertion_direction(assertion, new_direction);
        } else {
            kb_indexing.remove_assertion_indices(assertion, UNPROVIDED);
            reset_assertion_direction(assertion, new_direction);
            kb_indexing.add_assertion_indices(assertion, UNPROVIDED);
        }
        return assertion;
    }

    public static SubLObject kb_set_assertion_direction_internal(final SubLObject assertion, final SubLObject new_direction) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            reset_assertion_direction(assertion, new_direction);
        } else {
            kb_indexing.remove_assertion_indices(assertion, UNPROVIDED);
            reset_assertion_direction(assertion, new_direction);
            kb_indexing.add_assertion_indices(assertion, UNPROVIDED);
        }
        return assertion;
    }

    /**
     * Primitively change direction of ASSERTION to NEW-DIRECTION.
     */
    @LispMethod(comment = "Primitively change direction of ASSERTION to NEW-DIRECTION.")
    public static final SubLObject reset_assertion_direction_alt(SubLObject assertion, SubLObject new_direction) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject direction_code = enumeration_types.encode_direction(new_direction);
            if (NIL != direction_code) {
                reset_assertion_flags(assertion, set_assertion_flags_direction_code(assertion_flags(assertion), direction_code));
            }
        }
        return assertion;
    }

    /**
     * Primitively change direction of ASSERTION to NEW-DIRECTION.
     */
    @LispMethod(comment = "Primitively change direction of ASSERTION to NEW-DIRECTION.")
    public static SubLObject reset_assertion_direction(final SubLObject assertion, final SubLObject new_direction) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject direction_code = enumeration_types.encode_direction(new_direction);
        if (NIL != direction_code) {
            reset_assertion_flags(assertion, set_assertion_flags_direction_code(assertion_flags(assertion), direction_code));
        }
        return assertion;
    }

    /**
     * Primitively change the hl tv of ASSERTION to NEW-TV.
     */
    @LispMethod(comment = "Primitively change the hl tv of ASSERTION to NEW-TV.")
    public static final SubLObject reset_assertion_tv_alt(SubLObject assertion, SubLObject new_tv) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject tv_code = enumeration_types.encode_tv(new_tv);
            if (NIL != tv_code) {
                reset_assertion_flags(assertion, set_assertion_flags_tv_code(assertion_flags(assertion), tv_code));
            }
        }
        return assertion;
    }

    /**
     * Primitively change the hl tv of ASSERTION to NEW-TV.
     */
    @LispMethod(comment = "Primitively change the hl tv of ASSERTION to NEW-TV.")
    public static SubLObject reset_assertion_tv(final SubLObject assertion, final SubLObject new_tv) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject tv_code = enumeration_types.encode_tv(new_tv);
        if (NIL != tv_code) {
            reset_assertion_flags(assertion, set_assertion_flags_tv_code(assertion_flags(assertion), tv_code));
        }
        set_assertion_non_true_cache_tv(assertion, new_tv);
        return assertion;
    }

    public static final SubLObject reset_assertion_truth_alt(SubLObject assertion, SubLObject new_truth) {
        {
            SubLObject existing_strength = assertions_high.assertion_strength(assertion);
            SubLObject new_tv = enumeration_types.tv_from_truth_strength(new_truth, existing_strength);
            return reset_assertion_tv(assertion, new_tv);
        }
    }

    public static SubLObject reset_assertion_truth(final SubLObject assertion, final SubLObject new_truth) {
        final SubLObject existing_strength = assertions_high.assertion_strength(assertion);
        final SubLObject new_tv = enumeration_types.tv_from_truth_strength(new_truth, existing_strength);
        return reset_assertion_tv(assertion, new_tv);
    }

    public static final SubLObject reset_assertion_strength_alt(SubLObject assertion, SubLObject new_strength) {
        {
            SubLObject existing_truth = assertions_high.assertion_truth(assertion);
            SubLObject new_tv = enumeration_types.tv_from_truth_strength(existing_truth, new_strength);
            return reset_assertion_tv(assertion, new_tv);
        }
    }

    public static SubLObject reset_assertion_strength(final SubLObject assertion, final SubLObject new_strength) {
        final SubLObject existing_truth = assertions_high.assertion_truth(assertion);
        final SubLObject new_tv = enumeration_types.tv_from_truth_strength(existing_truth, new_strength);
        return reset_assertion_tv(assertion, new_tv);
    }

    public static SubLObject use_non_true_assertion_tv_cacheP() {
        return makeBoolean((NIL != $prefer_non_true_set_over_flagsP$.getGlobalValue()) && (NIL != $non_true_assertion_tv_cache$.getGlobalValue()));
    }

    public static SubLObject setup_non_true_assertion_tv_cache(final SubLObject estimated_assertion_size) {
        assert NIL != subl_promotions.non_negative_integer_p(estimated_assertion_size) : "! subl_promotions.non_negative_integer_p(estimated_assertion_size) " + ("subl_promotions.non_negative_integer_p(estimated_assertion_size) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(estimated_assertion_size) ") + estimated_assertion_size;
        final SubLObject estimated_non_true_count = ceiling(divide(estimated_assertion_size, $estimated_assertions_per_non_true$.getGlobalValue()), UNPROVIDED);
        $non_true_assertion_tv_cache$.setGlobalValue(make_hash_table(estimated_non_true_count, symbol_function(EQL), $list57));
        return T;
    }

    public static SubLObject kb_non_true_assertion_tv_cache() {
        return $non_true_assertion_tv_cache$.getGlobalValue();
    }

    public static SubLObject assertion_true_p(final SubLObject assertion) {
        if ((NIL != use_non_true_assertion_tv_cacheP()) && (NIL != assertion_manager.assertion_content_cachable_p(assertion))) {
            return makeBoolean(NIL == gethash_without_values(assertion, $non_true_assertion_tv_cache$.getGlobalValue(), UNPROVIDED));
        }
        if (NIL != assertion_handles.assertion_has_contentP(assertion)) {
            return eq($TRUE, enumeration_types.tv_truth(assertion_tv_internal(assertion)));
        }
        return NIL;
    }

    public static SubLObject assertion_non_true_tv(final SubLObject assertion) {
        if ((NIL != use_non_true_assertion_tv_cacheP()) && (NIL != assertion_manager.assertion_content_cachable_p(assertion))) {
            return gethash(assertion, $non_true_assertion_tv_cache$.getGlobalValue(), UNPROVIDED);
        }
        if (NIL != assertion_handles.assertion_has_contentP(assertion)) {
            final SubLObject tv = assertion_tv_internal(assertion);
            return $TRUE == enumeration_types.tv_truth(tv) ? NIL : tv;
        }
        return NIL;
    }

    public static SubLObject non_true_assertion_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($non_true_assertion_tv_cache$.getGlobalValue().isHashtable()) {
            return hash_table_count($non_true_assertion_tv_cache$.getGlobalValue());
        }
        SubLObject count = ZERO_INTEGER;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$mapping_Cyc_assertions;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$13 = idx;
                if (NIL == id_index_objects_empty_p(idx_$13, $SKIP)) {
                    final SubLObject idx_$14 = idx_$13;
                    if (NIL == id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$14);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertion_non_true_tv(ass)) {
                                    count = add(count, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$15 = idx_$13;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$15)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$15);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$15);
                        final SubLObject end_id = id_index_next_id(idx_$15);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertion_non_true_tv(ass2)) {
                                    count = add(count, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject true_assertion_count() {
        return subtract(assertion_handles.assertion_count(), non_true_assertion_count());
    }

    public static SubLObject set_assertion_non_true_cache_tv(final SubLObject assertion, final SubLObject tv) {
        if (NIL != use_non_true_assertion_tv_cacheP()) {
            if (NIL != enumeration_types.tv_trueP(tv)) {
                remhash(assertion, $non_true_assertion_tv_cache$.getGlobalValue());
            } else {
                sethash(assertion, $non_true_assertion_tv_cache$.getGlobalValue(), tv);
            }
        }
        return tv;
    }

    public static SubLObject possibly_non_true_assertion_tv_cache_delete(final SubLObject assertion) {
        if (NIL != assertion_non_true_tv(assertion)) {
            return remhash(assertion, $non_true_assertion_tv_cache$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject dump_non_true_assertion_tv_cache_to_stream(final SubLObject stream) {
        return cfasl_output($non_true_assertion_tv_cache$.getGlobalValue(), stream);
    }

    public static SubLObject load_non_true_assertion_tv_cache_from_stream(final SubLObject stream) {
        final SubLObject non_true_assertion_tv_cache = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (non_true_assertion_tv_cache.isHashtable()) {
            $non_true_assertion_tv_cache$.setGlobalValue(non_true_assertion_tv_cache);
            return non_true_assertion_count();
        }
        return NIL;
    }

    public static SubLObject rebuild_non_true_assertion_tv_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        setup_non_true_assertion_tv_cache(assertion_handles.assertion_count());
        final SubLObject old_prefer_non_true_set_over_flagsP = $prefer_non_true_set_over_flagsP$.getGlobalValue();
        try {
            $prefer_non_true_set_over_flagsP$.setGlobalValue(NIL);
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = $str58$Rebuilding_the_non_true_assertion;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$17 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$17, $SKIP)) {
                        final SubLObject idx_$18 = idx_$17;
                        if (NIL == id_index_dense_objects_empty_p(idx_$18, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$18);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject a;
                            SubLObject message_var;
                            SubLObject was_appendingP;
                            SubLObject _prev_bind_0_$19;
                            SubLObject _prev_bind_0_$20;
                            SubLObject _values;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                a_handle = aref(vector_var, a_id);
                                if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(a_handle)) {
                                        a_handle = $SKIP;
                                    }
                                    a = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    message_var = NIL;
                                    was_appendingP = eval($append_stack_traces_to_error_messagesP$);
                                    eval($list50);
                                    try {
                                        try {
                                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                            _prev_bind_0_$19 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    if ((NIL != assertion_handles.assertion_handle_validP(a)) && (NIL == assertion_utilities.true_assertionP(a))) {
                                                        sethash(a, $non_true_assertion_tv_cache$.getGlobalValue(), assertion_tv_internal(a));
                                                    }
                                                } catch (final Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$19, thread);
                                            }
                                        } catch (final Throwable ccatch_env_var) {
                                            message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                        } finally {
                                            thread.throwStack.pop();
                                        }
                                    } finally {
                                        _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            _values = getValuesAsVector();
                                            eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                        }
                                    }
                                    if (message_var.isString()) {
                                        Errors.warn($str53$_A, message_var);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$19 = idx_$17;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$19)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$19);
                            SubLObject a_id2 = id_index_sparse_id_threshold(idx_$19);
                            final SubLObject end_id = id_index_next_id(idx_$19);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                    final SubLObject a2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    SubLObject message_var2 = NIL;
                                    final SubLObject was_appendingP2 = eval($append_stack_traces_to_error_messagesP$);
                                    eval($list50);
                                    try {
                                        try {
                                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                            final SubLObject _prev_bind_0_$21 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    if ((NIL != assertion_handles.assertion_handle_validP(a2)) && (NIL == assertion_utilities.true_assertionP(a2))) {
                                                        sethash(a2, $non_true_assertion_tv_cache$.getGlobalValue(), assertion_tv_internal(a2));
                                                    }
                                                } catch (final Throwable catch_var2) {
                                                    Errors.handleThrowable(catch_var2, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$21, thread);
                                            }
                                        } catch (final Throwable ccatch_env_var2) {
                                            message_var2 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                                        } finally {
                                            thread.throwStack.pop();
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP2));
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                        }
                                    }
                                    if (message_var2.isString()) {
                                        Errors.warn($str53$_A, message_var2);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                a_id2 = add(a_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                $prefer_non_true_set_over_flagsP$.setGlobalValue(old_prefer_non_true_set_over_flagsP);
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return rule_count();
    }

    /**
     * Return the plist for ASSERTION.
     */
    @LispMethod(comment = "Return the plist for ASSERTION.")
    public static final SubLObject assertion_plist_alt(SubLObject assertion) {
        return lookup_assertion_plist(assertion_handles.assertion_id(assertion));
    }

    /**
     * Return the plist for ASSERTION.
     */
    @LispMethod(comment = "Return the plist for ASSERTION.")
    public static SubLObject assertion_plist(final SubLObject assertion) {
        return lookup_assertion_plist(assertion_handles.assertion_id(assertion));
    }

    /**
     * Primitively set the plist of ASSERTION to PLIST.
     */
    @LispMethod(comment = "Primitively set the plist of ASSERTION to PLIST.")
    public static final SubLObject reset_assertion_plist_alt(SubLObject assertion, SubLObject plist) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(plist, LISTP);
        set_assertion_plist(assertion_handles.assertion_id(assertion), plist);
        return assertion;
    }

    /**
     * Primitively set the plist of ASSERTION to PLIST.
     */
    @LispMethod(comment = "Primitively set the plist of ASSERTION to PLIST.")
    public static SubLObject reset_assertion_plist(final SubLObject assertion, final SubLObject plist) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != listp(plist) : "! listp(plist) " + ("Types.listp(plist) " + "CommonSymbols.NIL != Types.listp(plist) ") + plist;
        set_assertion_plist(assertion_handles.assertion_id(assertion), plist);
        return assertion;
    }

    public static final SubLObject get_assertion_prop_alt(SubLObject assertion, SubLObject indicator, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(assertion_plist(assertion), indicator, v_default);
    }

    public static SubLObject get_assertion_prop(final SubLObject assertion, final SubLObject indicator, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(assertion_plist(assertion), indicator, v_default);
    }

    public static final SubLObject set_assertion_prop_alt(SubLObject assertion, SubLObject indicator, SubLObject value) {
        {
            SubLObject old_plist = assertion_plist(assertion);
            SubLObject new_plist = putf(old_plist, indicator, value);
            reset_assertion_plist(assertion, new_plist);
        }
        return assertion;
    }

    public static SubLObject set_assertion_prop(final SubLObject assertion, final SubLObject indicator, final SubLObject value) {
        final SubLObject old_plist = assertion_plist(assertion);
        final SubLObject new_plist = putf(old_plist, indicator, value);
        reset_assertion_plist(assertion, new_plist);
        return assertion;
    }

    public static final SubLObject rem_assertion_prop_alt(SubLObject assertion, SubLObject indicator) {
        {
            SubLObject old_plist = assertion_plist(assertion);
            SubLObject new_plist = remf(old_plist, indicator);
            reset_assertion_plist(assertion, new_plist);
        }
        return assertion;
    }

    public static SubLObject rem_assertion_prop(final SubLObject assertion, final SubLObject indicator) {
        final SubLObject old_plist = assertion_plist(assertion);
        final SubLObject new_plist = remf(old_plist, indicator);
        reset_assertion_plist(assertion, new_plist);
        return assertion;
    }

    /**
     * Primitively change the variable names for ASSERTION to NEW-VARIABLE-NAMES.
     */
    @LispMethod(comment = "Primitively change the variable names for ASSERTION to NEW-VARIABLE-NAMES.")
    public static final SubLObject reset_assertion_variable_names_alt(SubLObject assertion, SubLObject new_variable_names) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject list_var = new_variable_names;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, STRINGP);
                }
            }
        }
        if (NIL != new_variable_names) {
            set_assertion_prop(assertion, $VARIABLE_NAMES, new_variable_names);
        } else {
            rem_assertion_prop(assertion, $VARIABLE_NAMES);
        }
        return assertion;
    }

    /**
     * Primitively change the variable names for ASSERTION to NEW-VARIABLE-NAMES.
     */
    @LispMethod(comment = "Primitively change the variable names for ASSERTION to NEW-VARIABLE-NAMES.")
    public static SubLObject reset_assertion_variable_names(final SubLObject assertion, final SubLObject new_variable_names) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != list_utilities.non_dotted_list_p(new_variable_names) : "! list_utilities.non_dotted_list_p(new_variable_names) " + ("list_utilities.non_dotted_list_p(new_variable_names) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(new_variable_names) ") + new_variable_names;
        SubLObject cdolist_list_var = new_variable_names;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "! stringp(elem) " + ("Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (NIL != new_variable_names) {
            set_assertion_prop(assertion, $VARIABLE_NAMES, new_variable_names);
        } else {
            rem_assertion_prop(assertion, $VARIABLE_NAMES);
        }
        return assertion;
    }

    public static SubLObject does_assertion_have_meta_assertionsP(final SubLObject assertion) {
        return NIL;
    }

    public static SubLObject all_meta_assertions_for_assertion(final SubLObject assertion) {
        return NIL;
    }

    /**
     * Return the indexing structure for ASSERTION.
     */
    @LispMethod(comment = "Return the indexing structure for ASSERTION.")
    public static final SubLObject assertion_index_alt(SubLObject assertion) {
        return assertion_indexing_store_get(assertion);
    }

    /**
     * Return the indexing structure for ASSERTION.
     */
    @LispMethod(comment = "Return the indexing structure for ASSERTION.")
    public static SubLObject assertion_index(final SubLObject assertion) {
        return assertion_indexing_store_get(assertion);
    }

    public static SubLObject assertion_index_swapped_inP(final SubLObject assertion) {
        return T;
    }

    /**
     * Primitively change the indexing structure for ASSERTION to NEW-INDEX.
     */
    @LispMethod(comment = "Primitively change the indexing structure for ASSERTION to NEW-INDEX.")
    public static final SubLObject reset_assertion_index_alt(SubLObject assertion, SubLObject new_index) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (new_index == new_simple_index()) {
            assertion_indexing_store_remove(assertion);
        } else {
            assertion_indexing_store_set(assertion, new_index);
        }
        return assertion;
    }

    /**
     * Primitively change the indexing structure for ASSERTION to NEW-INDEX.
     */
    @LispMethod(comment = "Primitively change the indexing structure for ASSERTION to NEW-INDEX.")
    public static SubLObject reset_assertion_index(final SubLObject assertion, final SubLObject new_index) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (new_index.eql(new_simple_index())) {
            assertion_indexing_store_remove(assertion);
        } else {
            assertion_indexing_store_set(assertion, new_index);
        }
        return assertion;
    }

    /**
     * Primitively clear the indexing structure for ASSERTION.
     */
    @LispMethod(comment = "Primitively clear the indexing structure for ASSERTION.")
    public static final SubLObject clear_assertion_index_alt(SubLObject assertion) {
        return reset_assertion_index(assertion, new_simple_index());
    }

    /**
     * Primitively clear the indexing structure for ASSERTION.
     */
    @LispMethod(comment = "Primitively clear the indexing structure for ASSERTION.")
    public static SubLObject clear_assertion_index(final SubLObject assertion) {
        return reset_assertion_index(assertion, new_simple_index());
    }

    public static final SubLObject destructure_assert_info_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject who = NIL;
                    SubLObject when = NIL;
                    SubLObject why = NIL;
                    SubLObject second = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    who = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    when = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    why = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    second = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject assert_info = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt43);
                            assert_info = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return listS(CDESTRUCTURING_BIND, list($sym45$_OPTIONAL, who, when, why, second), assert_info, append(body, NIL));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt43);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject destructure_assert_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject who = NIL;
        SubLObject when = NIL;
        SubLObject why = NIL;
        SubLObject second = NIL;
        destructuring_bind_must_consp(current, datum, $list61);
        who = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        when = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        why = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        second = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject assert_info = NIL;
            destructuring_bind_must_consp(current, datum, $list61);
            assert_info = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CDESTRUCTURING_BIND, list($sym63$_OPTIONAL, who, when, why, second), assert_info, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list61);
        return NIL;
    }

    /**
     * Return the assert timestamping info for ASSERTION.
     */
    @LispMethod(comment = "Return the assert timestamping info for ASSERTION.")
    public static final SubLObject assertion_assert_info_alt(SubLObject assertion) {
        {
            SubLObject assert_info = get_assertion_prop(assertion, $ASSERT_INFO, UNPROVIDED);
            if (NIL != assert_info) {
                return assert_info;
            }
        }
        return NIL;
    }

    /**
     * Return the assert timestamping info for ASSERTION.
     */
    @LispMethod(comment = "Return the assert timestamping info for ASSERTION.")
    public static SubLObject assertion_assert_info(final SubLObject assertion) {
        final SubLObject assert_info = get_assertion_prop(assertion, $ASSERT_INFO, UNPROVIDED);
        if (NIL != assert_info) {
            return assert_info;
        }
        return NIL;
    }

    /**
     * Primitively change the assert timestamping info for ASSERTION to NEW-INFO.
     */
    @LispMethod(comment = "Primitively change the assert timestamping info for ASSERTION to NEW-INFO.")
    public static final SubLObject reset_assertion_assert_info_alt(SubLObject assertion, SubLObject new_info) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != new_info) {
            set_assertion_prop(assertion, $ASSERT_INFO, new_info);
        } else {
            rem_assertion_prop(assertion, $ASSERT_INFO);
        }
        return assertion;
    }

    /**
     * Primitively change the assert timestamping info for ASSERTION to NEW-INFO.
     */
    @LispMethod(comment = "Primitively change the assert timestamping info for ASSERTION to NEW-INFO.")
    public static SubLObject reset_assertion_assert_info(final SubLObject assertion, final SubLObject new_info) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != new_info) {
            set_assertion_prop(assertion, $ASSERT_INFO, new_info);
        } else {
            rem_assertion_prop(assertion, $ASSERT_INFO);
        }
        return assertion;
    }

    public static final SubLObject asserted_assertion_timestampedP_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            return sublisp_boolean(assertion_assert_info(assertion));
        }
        return NIL;
    }

    public static SubLObject asserted_assertion_timestampedP(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL != assertions_high.asserted_assertionP(assertion)) {
            return list_utilities.sublisp_boolean(assertion_assert_info(assertion));
        }
        return NIL;
    }

    public static final SubLObject make_assert_info_alt(SubLObject who, SubLObject when, SubLObject why, SubLObject second) {
        if (who == UNPROVIDED) {
            who = NIL;
        }
        if (when == UNPROVIDED) {
            when = NIL;
        }
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (second == UNPROVIDED) {
            second = NIL;
        }
        if (NIL != second) {
            return list(who, when, why, second);
        }
        if (NIL != why) {
            return list(who, when, why);
        }
        if (NIL != when) {
            return list(who, when);
        }
        if (NIL != who) {
            return list(who);
        }
        return NIL;
    }

    public static SubLObject make_assert_info(SubLObject who, SubLObject when, SubLObject why, SubLObject second) {
        if (who == UNPROVIDED) {
            who = NIL;
        }
        if (when == UNPROVIDED) {
            when = NIL;
        }
        if (why == UNPROVIDED) {
            why = NIL;
        }
        if (second == UNPROVIDED) {
            second = NIL;
        }
        if (NIL != second) {
            return list(who, when, why, second);
        }
        if (NIL != why) {
            return list(who, when, why);
        }
        if (NIL != when) {
            return list(who, when);
        }
        if (NIL != who) {
            return list(who);
        }
        return NIL;
    }

    public static final SubLObject assert_info_who_alt(SubLObject assert_info) {
        return assert_info.first();
    }

    public static SubLObject assert_info_who(final SubLObject assert_info) {
        return assert_info.first();
    }

    public static final SubLObject assert_info_when_alt(SubLObject assert_info) {
        return second(assert_info);
    }

    public static SubLObject assert_info_when(final SubLObject assert_info) {
        return second(assert_info);
    }

    public static final SubLObject assert_info_why_alt(SubLObject assert_info) {
        return third(assert_info);
    }

    public static SubLObject assert_info_why(final SubLObject assert_info) {
        return third(assert_info);
    }

    public static final SubLObject assert_info_second_alt(SubLObject assert_info) {
        return fourth(assert_info);
    }

    public static SubLObject assert_info_second(final SubLObject assert_info) {
        return fourth(assert_info);
    }

    public static final SubLObject set_assertion_asserted_by_alt(SubLObject assertion, SubLObject assertor) {
        {
            SubLObject datum = assertion_assert_info(assertion);
            SubLObject current = datum;
            SubLObject who = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
            destructuring_bind_must_listp(current, datum, $list_alt47);
            current = current.rest();
            {
                SubLObject when = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt47);
                current = current.rest();
                {
                    SubLObject why = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt47);
                    current = current.rest();
                    {
                        SubLObject second = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt47);
                        current = current.rest();
                        if (NIL == current) {
                            who = assertor;
                            return reset_assertion_assert_info(assertion, make_assert_info(who, when, why, second));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt47);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject set_assertion_asserted_by(final SubLObject assertion, final SubLObject assertor) {
        SubLObject current;
        final SubLObject datum = current = assertion_assert_info(assertion);
        final SubLObject who = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        final SubLObject when = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        final SubLObject why = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        final SubLObject second = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        if (NIL == current) {
            return reset_assertion_assert_info(assertion, make_assert_info(assertor, when, why, second));
        }
        cdestructuring_bind_error(datum, $list65);
        return NIL;
    }

    public static final SubLObject set_assertion_asserted_when_alt(SubLObject assertion, SubLObject universal_date) {
        {
            SubLObject datum = assertion_assert_info(assertion);
            SubLObject current = datum;
            SubLObject who = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
            destructuring_bind_must_listp(current, datum, $list_alt47);
            current = current.rest();
            {
                SubLObject when = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt47);
                current = current.rest();
                {
                    SubLObject why = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt47);
                    current = current.rest();
                    {
                        SubLObject second = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt47);
                        current = current.rest();
                        if (NIL == current) {
                            when = universal_date;
                            return reset_assertion_assert_info(assertion, make_assert_info(who, when, why, second));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt47);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject set_assertion_asserted_when(final SubLObject assertion, final SubLObject universal_date) {
        SubLObject current;
        final SubLObject datum = current = assertion_assert_info(assertion);
        final SubLObject who = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        final SubLObject when = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        final SubLObject why = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        final SubLObject second = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        if (NIL == current) {
            return reset_assertion_assert_info(assertion, make_assert_info(who, universal_date, why, second));
        }
        cdestructuring_bind_error(datum, $list65);
        return NIL;
    }

    public static final SubLObject set_assertion_asserted_why_alt(SubLObject assertion, SubLObject reason) {
        {
            SubLObject datum = assertion_assert_info(assertion);
            SubLObject current = datum;
            SubLObject who = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
            destructuring_bind_must_listp(current, datum, $list_alt47);
            current = current.rest();
            {
                SubLObject when = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt47);
                current = current.rest();
                {
                    SubLObject why = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt47);
                    current = current.rest();
                    {
                        SubLObject second = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt47);
                        current = current.rest();
                        if (NIL == current) {
                            why = reason;
                            return reset_assertion_assert_info(assertion, make_assert_info(who, when, why, second));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt47);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject set_assertion_asserted_why(final SubLObject assertion, final SubLObject reason) {
        SubLObject current;
        final SubLObject datum = current = assertion_assert_info(assertion);
        final SubLObject who = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        final SubLObject when = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        final SubLObject why = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        final SubLObject second = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        if (NIL == current) {
            return reset_assertion_assert_info(assertion, make_assert_info(who, when, reason, second));
        }
        cdestructuring_bind_error(datum, $list65);
        return NIL;
    }

    static private final SubLList $list_alt3 = list(makeSymbol("FORMULA-DATA"), makeSymbol("MT"), makeSymbol("FLAGS"), makeSymbol("ARGUMENTS"), makeSymbol("PLIST"));

    static private final SubLList $list_alt4 = list(makeKeyword("FORMULA-DATA"), makeKeyword("MT"), makeKeyword("FLAGS"), makeKeyword("ARGUMENTS"), makeKeyword("PLIST"));

    static private final SubLList $list_alt5 = list(makeSymbol("AS-CONTENT-FORMULA-DATA"), makeSymbol("AS-CONTENT-MT"), makeSymbol("AS-CONTENT-FLAGS"), makeSymbol("AS-CONTENT-ARGUMENTS"), makeSymbol("AS-CONTENT-PLIST"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-AS-CONTENT-FORMULA-DATA"), makeSymbol("_CSETF-AS-CONTENT-MT"), makeSymbol("_CSETF-AS-CONTENT-FLAGS"), makeSymbol("_CSETF-AS-CONTENT-ARGUMENTS"), makeSymbol("_CSETF-AS-CONTENT-PLIST"));

    public static final SubLObject set_assertion_asserted_second_alt(SubLObject assertion, SubLObject universal_second) {
        {
            SubLObject datum = assertion_assert_info(assertion);
            SubLObject current = datum;
            SubLObject who = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
            destructuring_bind_must_listp(current, datum, $list_alt47);
            current = current.rest();
            {
                SubLObject when = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt47);
                current = current.rest();
                {
                    SubLObject why = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt47);
                    current = current.rest();
                    {
                        SubLObject second = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt47);
                        current = current.rest();
                        if (NIL == current) {
                            second = universal_second;
                            return reset_assertion_assert_info(assertion, make_assert_info(who, when, why, second));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt47);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject set_assertion_asserted_second(final SubLObject assertion, final SubLObject universal_second) {
        SubLObject current;
        final SubLObject datum = current = assertion_assert_info(assertion);
        final SubLObject who = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        final SubLObject when = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        final SubLObject why = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        final SubLObject second = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        if (NIL == current) {
            return reset_assertion_assert_info(assertion, make_assert_info(who, when, why, universal_second));
        }
        cdestructuring_bind_error(datum, $list65);
        return NIL;
    }

    /**
     * Robustly determines whether ASSERTION is a valid assertion.
     */
    @LispMethod(comment = "Robustly determines whether ASSERTION is a valid assertion.")
    public static final SubLObject valid_assertion_robustP_alt(SubLObject assertion) {
        {
            SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
            SubLObject dependents = assertions_high.assertion_dependents(assertion);
            SubLObject vnames = assertion_variable_names_internal(assertion);
            SubLObject index = assertion_index(assertion);
            return makeBoolean((((((((((NIL != hlmt.valid_hlmt_p(assertion_mt_internal(assertion), UNPROVIDED)) && (NIL != enumeration_types.tv_p(assertion_tv(assertion)))) && v_arguments.isCons()) && (NIL != every_in_list(symbol_function(VALID_ARGUMENT), v_arguments, UNPROVIDED))) && dependents.isList()) && (NIL != every_in_list(symbol_function(VALID_ARGUMENT), dependents, UNPROVIDED))) && vnames.isList()) && (NIL != every_in_list(symbol_function(STRINGP), vnames, UNPROVIDED))) && (NIL != enumeration_types.direction_p(assertions_high.assertion_direction(assertion)))) && (NIL != index_installed_p(index)));
        }
    }

    /**
     * Robustly determines whether ASSERTION is a valid assertion.
     */
    @LispMethod(comment = "Robustly determines whether ASSERTION is a valid assertion.")
    public static SubLObject valid_assertion_robustP(final SubLObject assertion) {
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED))) {
            final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
            final SubLObject dependents = assertions_high.assertion_dependents(assertion);
            final SubLObject vnames = assertion_variable_names_internal(assertion);
            final SubLObject index = assertion_index(assertion);
            return makeBoolean((((((((((NIL != hlmt.valid_hlmt_p(assertion_mt_internal(assertion), UNPROVIDED)) && (NIL != enumeration_types.tv_p(assertion_tv(assertion)))) && v_arguments.isCons()) && (NIL != list_utilities.every_in_list(symbol_function(VALID_ARGUMENT), v_arguments, UNPROVIDED))) && (NIL != set_contents.set_contents_p(dependents))) && (NIL != list_utilities.every_in_list(symbol_function(VALID_ARGUMENT), set_contents.set_contents_element_list(dependents), UNPROVIDED))) && vnames.isList()) && (NIL != list_utilities.every_in_list(symbol_function(STRINGP), vnames, UNPROVIDED))) && (NIL != enumeration_types.direction_p(assertions_high.assertion_direction(assertion)))) && (NIL != index_installed_p(index)));
        }
        return NIL;
    }

    static private final SubLString $str_alt24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt29$Unexpected_formula_data_type___S = makeString("Unexpected formula-data type: ~S");

    private static final SubLSymbol KB_RULE_SET = makeSymbol("KB-RULE-SET");

    private static final SubLSymbol DO_RULES = makeSymbol("DO-RULES");

    static private final SubLList $list_alt43 = list(list(makeSymbol("WHO"), makeSymbol("WHEN"), makeSymbol("WHY"), makeSymbol("SECOND")), makeSymbol("ASSERT-INFO"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym45$_OPTIONAL = makeSymbol("&OPTIONAL");

    /**
     * Does ASSERTION have content?
     */
    @LispMethod(comment = "Does ASSERTION have content?")
    public static final SubLObject valid_assertion_with_contentP_alt(SubLObject assertion) {
        {
            SubLObject id = assertion_handles.assertion_id(assertion);
            SubLObject content = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            content = assertion_manager.lookup_assertion_content(id);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            return sublisp_boolean(content);
        }
    }

    /**
     * Does ASSERTION have content?
     */
    @LispMethod(comment = "Does ASSERTION have content?")
    public static SubLObject valid_assertion_with_contentP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = assertion_handles.assertion_id(assertion);
        SubLObject content = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    content = assertion_manager.lookup_assertion_content(id);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return list_utilities.sublisp_boolean(content);
    }

    static private final SubLList $list_alt47 = list(makeSymbol("&OPTIONAL"), makeSymbol("WHO"), makeSymbol("WHEN"), makeSymbol("WHY"), makeSymbol("SECOND"));

    static private final SubLString $str_alt52$Unexpected_formula_data_hook___S = makeString("Unexpected formula data hook: ~S");

    public static final SubLObject kb_create_assertion_kb_store(SubLObject cnf, SubLObject mt) {
        {
            SubLObject assertion = kb_indexing.find_assertion_internal(cnf, mt);
            if (NIL != assertion) {
                return assertion_handles.assertion_id(assertion);
            } else {
                {
                    SubLObject internal_id = assertion_handles.make_assertion_id();
                    assertion = assertion_handles.make_assertion_shell(internal_id);
                    kb_create_assertion_int(assertion, internal_id, cnf, mt);
                    return internal_id;
                }
            }
        }
    }

    public static SubLObject kb_create_assertion_kb_store(final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength, final SubLObject asserted_argument) {
        SubLObject assertion = kb_indexing.find_assertion_internal(cnf, mt);
        if (NIL != assertion) {
            return assertion_handles.assertion_id(assertion);
        }
        final SubLObject internal_id = assertion_handles.make_assertion_id();
        assertion = assertion_handles.make_assertion_shell(internal_id);
        kb_create_assertion_int(assertion, internal_id, cnf, mt, variable_names, direction, truth, strength, asserted_argument);
        return internal_id;
    }

    public static final SubLObject kb_create_assertion_int(SubLObject assertion, SubLObject internal_id, SubLObject cnf, SubLObject mt) {
        {
            SubLObject assertion_content = create_assertion_content(mt);
            assertion_manager.register_assertion_content(internal_id, assertion_content);
            reset_assertion_tv(assertion, $UNKNOWN);
            {
                SubLObject formula_data_hook = find_cnf_formula_data_hook(cnf);
                connect_assertion(assertion, formula_data_hook);
                return NIL;
            }
        }
    }

    public static SubLObject kb_create_assertion_int(final SubLObject assertion, final SubLObject internal_id, final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength, final SubLObject asserted_argument) {
        final SubLObject assertion_content = create_assertion_content(mt);
        assertion_manager.register_assertion_content(internal_id, assertion_content);
        reset_assertion_variable_names(assertion, variable_names);
        reset_assertion_tv(assertion, enumeration_types.tv_from_truth_strength(truth, strength));
        final SubLObject formula_data_hook = find_cnf_formula_data_hook(cnf);
        connect_assertion(assertion, formula_data_hook);
        kb_set_assertion_direction_internal(assertion, direction);
        if (NIL != asserted_argument) {
            add_new_assertion_argument(assertion, asserted_argument);
        }
        if (direction == $FORWARD) {
            forward.queue_forward_assertion(assertion);
        }
        return NIL;
    }

    public static final SubLObject kb_create_assertion_cyc_alt(SubLObject internal_id) {
        {
            SubLObject assertion = assertion_handles.find_assertion_by_id(internal_id);
            return NIL != assertion ? ((SubLObject) (assertion)) : assertion_handles.make_assertion_shell(internal_id);
        }
    }

    public static SubLObject kb_create_assertion_cyc(final SubLObject internal_id) {
        final SubLObject assertion = assertion_handles.find_assertion_by_id(internal_id);
        return NIL != assertion ? assertion : assertion_handles.make_assertion_shell(internal_id);
    }

    public static final SubLObject find_cnf_formula_data_hook_alt(SubLObject cnf) {
        if (NIL != clauses.gaf_cnfP(cnf)) {
            return find_gaf_formula_hook(clause_utilities.gaf_cnf_literal(cnf));
        } else {
            return find_hl_cnf_hook(cnf);
        }
    }

    public static SubLObject find_cnf_formula_data_hook(final SubLObject cnf) {
        if (NIL != clauses.gaf_cnfP(cnf)) {
            return find_gaf_formula_hook(clause_utilities.gaf_cnf_literal(cnf));
        }
        return find_hl_cnf_hook(cnf);
    }

    public static final SubLObject find_hl_cnf_hook_alt(SubLObject cnf) {
        {
            SubLObject assertion = kb_indexing.find_assertion_any_mt(cnf);
            if (NIL != assertion) {
                {
                    SubLObject clause_struc = assertion_clause_struc(assertion);
                    return NIL != clause_struc ? ((SubLObject) (clause_struc)) : assertion;
                }
            } else {
                return cnf;
            }
        }
    }

    public static SubLObject find_hl_cnf_hook(final SubLObject cnf) {
        final SubLObject assertion = kb_indexing.find_assertion_any_mt(cnf);
        if (NIL != assertion) {
            final SubLObject clause_struc = assertion_clause_struc(assertion);
            return NIL != clause_struc ? clause_struc : assertion;
        }
        return cnf;
    }

    public static final SubLObject find_gaf_formula_hook_alt(SubLObject gaf) {
        {
            SubLObject assertion = kb_indexing.find_gaf_any_mt(gaf);
            if (NIL != assertion) {
                {
                    SubLObject clause_struc = assertion_clause_struc(assertion);
                    return NIL != clause_struc ? ((SubLObject) (clause_struc)) : assertion;
                }
            } else {
                return gaf;
            }
        }
    }

    public static SubLObject find_gaf_formula_hook(final SubLObject gaf) {
        final SubLObject assertion = kb_indexing.find_gaf_any_mt(gaf);
        if (NIL != assertion) {
            final SubLObject clause_struc = assertion_clause_struc(assertion);
            return NIL != clause_struc ? clause_struc : assertion;
        }
        return gaf;
    }

    /**
     * Connect ASSERTION to FORMULA-DATA-HOOK and all its relevant indexes
     */
    @LispMethod(comment = "Connect ASSERTION to FORMULA-DATA-HOOK and all its relevant indexes")
    public static final SubLObject connect_assertion_alt(SubLObject assertion, SubLObject formula_data_hook) {
        connect_assertion_formula_data(assertion, formula_data_hook);
        kb_indexing.add_assertion_indices(assertion, UNPROVIDED);
        return assertion;
    }

    /**
     * Connect ASSERTION to FORMULA-DATA-HOOK and all its relevant indexes
     */
    @LispMethod(comment = "Connect ASSERTION to FORMULA-DATA-HOOK and all its relevant indexes")
    public static SubLObject connect_assertion(final SubLObject assertion, final SubLObject formula_data_hook) {
        connect_assertion_formula_data(assertion, formula_data_hook);
        kb_indexing.add_assertion_indices(assertion, UNPROVIDED);
        return assertion;
    }

    public static final SubLObject connect_assertion_formula_data_alt(SubLObject assertion, SubLObject formula_data_hook) {
        {
            SubLObject formula_data = formula_data_hook;
            if (NIL != clause_strucs.clause_struc_p(formula_data_hook)) {
                clause_strucs.add_clause_struc_assertion(formula_data_hook, assertion);
            } else {
                if (NIL != assertion_handles.assertion_p(formula_data_hook)) {
                    {
                        SubLObject cnf = assertions_high.assertion_cnf(formula_data_hook);
                        SubLObject new_clause_struc = clause_strucs.create_clause_struc(cnf);
                        clause_strucs.add_clause_struc_assertion(new_clause_struc, formula_data_hook);
                        clause_strucs.add_clause_struc_assertion(new_clause_struc, assertion);
                        formula_data = new_clause_struc;
                        reset_assertion_clause_struc(formula_data_hook, formula_data);
                    }
                } else {
                    if (NIL != clauses.cnf_p(formula_data_hook)) {
                    } else {
                        if (NIL != el_formula_p(formula_data_hook)) {
                        } else {
                            Errors.error($str_alt52$Unexpected_formula_data_hook___S, formula_data_hook);
                            return NIL;
                        }
                    }
                }
            }
            update_assertion_formula_data(assertion, formula_data);
        }
        return assertion;
    }

    public static SubLObject connect_assertion_formula_data(final SubLObject assertion, final SubLObject formula_data_hook) {
        SubLObject formula_data = formula_data_hook;
        if (NIL != clause_strucs.clause_struc_p(formula_data_hook)) {
            clause_strucs.add_clause_struc_assertion(formula_data_hook, assertion);
        } else
            if (NIL != assertion_handles.assertion_p(formula_data_hook)) {
                final SubLObject cnf = assertions_high.assertion_cnf(formula_data_hook);
                final SubLObject new_clause_struc = clause_strucs.create_clause_struc(cnf);
                clause_strucs.add_clause_struc_assertion(new_clause_struc, formula_data_hook);
                clause_strucs.add_clause_struc_assertion(new_clause_struc, assertion);
                formula_data = new_clause_struc;
                reset_assertion_clause_struc(formula_data_hook, formula_data);
            } else
                if (NIL == clauses.cnf_p(formula_data_hook)) {
                    if (NIL == el_formula_p(formula_data_hook)) {
                        Errors.error($str70$Unexpected_formula_data_hook___S, formula_data_hook);
                        return NIL;
                    }
                }


        update_assertion_formula_data(assertion, formula_data);
        return assertion;
    }

    public static final SubLObject kb_remove_assertion_internal_alt(SubLObject assertion) {
        {
            SubLObject id = assertion_handles.assertion_id(assertion);
            disconnect_assertion(assertion);
            destroy_assertion_content(id);
            assertion_handles.deregister_assertion_id(id);
        }
        assertion_handles.free_assertion(assertion);
        return NIL;
    }

    public static SubLObject kb_remove_assertion_internal(final SubLObject assertion) {
        final SubLObject id = assertion_handles.assertion_id(assertion);
        disconnect_assertion(assertion);
        destroy_assertion_content(id);
        assertion_handles.deregister_assertion_id(id);
        assertion_handles.free_assertion(assertion);
        return NIL;
    }

    public static final SubLObject reconnect_assertion_alt(SubLObject assertion, SubLObject new_cnf) {
        disconnect_assertion(assertion);
        {
            SubLObject hl_cnf_hook = find_hl_cnf_hook(new_cnf);
            connect_assertion(assertion, hl_cnf_hook);
        }
        return NIL;
    }

    public static SubLObject reconnect_assertion(final SubLObject assertion, final SubLObject new_cnf) {
        disconnect_assertion(assertion);
        final SubLObject hl_cnf_hook = find_hl_cnf_hook(new_cnf);
        connect_assertion(assertion, hl_cnf_hook);
        return NIL;
    }

    /**
     * Disconnect ASSERTION from all its connections.
     */
    @LispMethod(comment = "Disconnect ASSERTION from all its connections.")
    public static final SubLObject disconnect_assertion_alt(SubLObject assertion) {
        kb_indexing.remove_assertion_indices(assertion, UNPROVIDED);
        disconnect_assertion_formula_data(assertion);
        return assertion;
    }

    /**
     * Disconnect ASSERTION from all its connections.
     */
    @LispMethod(comment = "Disconnect ASSERTION from all its connections.")
    public static SubLObject disconnect_assertion(final SubLObject assertion) {
        kb_indexing.remove_assertion_indices(assertion, UNPROVIDED);
        disconnect_assertion_formula_data(assertion);
        return assertion;
    }

    public static final SubLObject disconnect_assertion_formula_data_alt(SubLObject assertion) {
        {
            SubLObject clause_struc = assertion_clause_struc(assertion);
            if (NIL != clause_struc) {
                clause_strucs.remove_clause_struc_assertion(clause_struc, assertion);
            }
        }
        annihilate_assertion_formula_data(assertion);
        return assertion;
    }

    public static SubLObject disconnect_assertion_formula_data(final SubLObject assertion) {
        final SubLObject clause_struc = assertion_clause_struc(assertion);
        if (NIL != clause_struc) {
            clause_strucs.remove_clause_struc_assertion(clause_struc, assertion);
        }
        annihilate_assertion_formula_data(assertion);
        return assertion;
    }

    public static final SubLObject add_new_assertion_argument_alt(SubLObject assertion, SubLObject new_argument) {
        set_assertion_arguments(assertion_handles.assertion_id(assertion), cons(new_argument, assertions_high.assertion_arguments(assertion)));
        return assertion;
    }

    public static SubLObject add_new_assertion_argument(final SubLObject assertion, final SubLObject new_argument) {
        set_assertion_arguments(assertion_handles.assertion_id(assertion), cons(new_argument, assertions_high.assertion_arguments(assertion)));
        return assertion;
    }

    public static final SubLObject remove_assertion_argument_alt(SubLObject assertion, SubLObject argument) {
        set_assertion_arguments(assertion_handles.assertion_id(assertion), delete_first(argument, assertions_high.assertion_arguments(assertion), UNPROVIDED));
        return assertion;
    }

    public static SubLObject remove_assertion_argument(final SubLObject assertion, final SubLObject argument) {
        set_assertion_arguments(assertion_handles.assertion_id(assertion), list_utilities.delete_first(argument, assertions_high.assertion_arguments(assertion), UNPROVIDED));
        return assertion;
    }

    /**
     * Primitively set the dependent arguments of ASSERTION to NEW-DEPENDENTS.
     */
    @LispMethod(comment = "Primitively set the dependent arguments of ASSERTION to NEW-DEPENDENTS.")
    public static final SubLObject reset_assertion_dependents_alt(SubLObject assertion, SubLObject new_dependents) {
        SubLTrampolineFile.checkType(new_dependents, LISTP);
        if (NIL != new_dependents) {
            set_assertion_prop(assertion, $DEPENDENTS, new_dependents);
        } else {
            rem_assertion_prop(assertion, $DEPENDENTS);
        }
        return assertion;
    }

    /**
     * Primitively set the dependent arguments of ASSERTION to NEW-DEPENDENTS.
     */
    @LispMethod(comment = "Primitively set the dependent arguments of ASSERTION to NEW-DEPENDENTS.")
    public static SubLObject reset_assertion_dependents(final SubLObject assertion, final SubLObject new_dependents) {
        assert NIL != set_contents.set_contents_p(new_dependents) : "! set_contents.set_contents_p(new_dependents) " + ("set_contents.set_contents_p(new_dependents) " + "CommonSymbols.NIL != set_contents.set_contents_p(new_dependents) ") + new_dependents;
        if (NIL != new_dependents) {
            set_assertion_prop(assertion, $DEPENDENTS, new_dependents);
        } else {
            rem_assertion_prop(assertion, $DEPENDENTS);
        }
        return assertion;
    }

    /**
     * Add ARGUMENT as an argument depending on ASSERTION.  Return ASSERTION.
     */
    @LispMethod(comment = "Add ARGUMENT as an argument depending on ASSERTION.  Return ASSERTION.")
    public static final SubLObject add_assertion_dependent_alt(SubLObject assertion, SubLObject argument) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(argument, ARGUMENT_P);
        reset_assertion_dependents(assertion, cons(argument, assertions_high.assertion_dependents(assertion)));
        return assertion;
    }

    /**
     * Add ARGUMENT as an argument depending on ASSERTION.  Return ASSERTION.
     */
    @LispMethod(comment = "Add ARGUMENT as an argument depending on ASSERTION.  Return ASSERTION.")
    public static SubLObject add_assertion_dependent(final SubLObject assertion, final SubLObject argument) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != arguments.argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        reset_assertion_dependents(assertion, set_contents.set_contents_add(argument, assertion_dependents_internal(assertion), UNPROVIDED));
        return assertion;
    }

    /**
     * Remove ARGUMENT as an argument depending on ASSERTION.  Return ASSERTION.
     */
    @LispMethod(comment = "Remove ARGUMENT as an argument depending on ASSERTION.  Return ASSERTION.")
    public static final SubLObject remove_assertion_dependent_alt(SubLObject assertion, SubLObject argument) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(argument, ARGUMENT_P);
        reset_assertion_dependents(assertion, delete_first(argument, assertions_high.assertion_dependents(assertion), UNPROVIDED));
        return assertion;
    }

    /**
     * Remove ARGUMENT as an argument depending on ASSERTION.  Return ASSERTION.
     */
    @LispMethod(comment = "Remove ARGUMENT as an argument depending on ASSERTION.  Return ASSERTION.")
    public static SubLObject remove_assertion_dependent(final SubLObject assertion, final SubLObject argument) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != arguments.argument_p(argument) : "! arguments.argument_p(argument) " + ("arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) ") + argument;
        reset_assertion_dependents(assertion, set_contents.set_contents_delete(argument, assertion_dependents_internal(assertion), UNPROVIDED));
        return assertion;
    }

    /**
     * Return two values :
     * A hash-table of all dependent assertions.
     * A hash-table of all dependent deductions.
     */
    @LispMethod(comment = "Return two values :\r\nA hash-table of all dependent assertions.\r\nA hash-table of all dependent deductions.\nReturn two values :\nA hash-table of all dependent assertions.\nA hash-table of all dependent deductions.")
    public static final SubLObject assertion_dependencies_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            {
                SubLObject assertions = NIL;
                SubLObject deductions = NIL;
                SubLObject dependent_count = length(assertions_high.assertion_dependents(assertion));
                {
                    SubLObject _prev_bind_0 = $dependent_assertion_table$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $dependent_deduction_table$.currentBinding(thread);
                    try {
                        $dependent_assertion_table$.bind(make_hash_table(integerDivide(dependent_count, TWO_INTEGER), UNPROVIDED, UNPROVIDED), thread);
                        $dependent_deduction_table$.bind(make_hash_table(dependent_count, UNPROVIDED, UNPROVIDED), thread);
                        mark_dependent_assertion(assertion);
                        assertions = $dependent_assertion_table$.getDynamicValue(thread);
                        deductions = $dependent_deduction_table$.getDynamicValue(thread);
                    } finally {
                        $dependent_deduction_table$.rebind(_prev_bind_1, thread);
                        $dependent_assertion_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(assertions, deductions);
            }
        }
    }

    /**
     * Return two values :
     * A hash-table of all dependent assertions.
     * A hash-table of all dependent deductions.
     */
    @LispMethod(comment = "Return two values :\r\nA hash-table of all dependent assertions.\r\nA hash-table of all dependent deductions.\nReturn two values :\nA hash-table of all dependent assertions.\nA hash-table of all dependent deductions.")
    public static SubLObject assertion_dependencies(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        SubLObject assertions = NIL;
        SubLObject deductions = NIL;
        final SubLObject dependent_count = set_contents.set_contents_size(assertion_dependents_internal(assertion));
        final SubLObject _prev_bind_0 = $dependent_assertion_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $dependent_deduction_table$.currentBinding(thread);
        try {
            $dependent_assertion_table$.bind(make_hash_table(integerDivide(dependent_count, TWO_INTEGER), UNPROVIDED, UNPROVIDED), thread);
            $dependent_deduction_table$.bind(make_hash_table(dependent_count, UNPROVIDED, UNPROVIDED), thread);
            mark_dependent_assertion(assertion);
            assertions = $dependent_assertion_table$.getDynamicValue(thread);
            deductions = $dependent_deduction_table$.getDynamicValue(thread);
        } finally {
            $dependent_deduction_table$.rebind(_prev_bind_2, thread);
            $dependent_assertion_table$.rebind(_prev_bind_0, thread);
        }
        return values(assertions, deductions);
    }

    public static final SubLObject mark_dependent_assertion_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == gethash(assertion, $dependent_assertion_table$.getDynamicValue(thread), UNPROVIDED)) {
                sethash(assertion, $dependent_assertion_table$.getDynamicValue(thread), T);
                {
                    SubLObject cdolist_list_var = assertion_dependents_internal(assertion);
                    SubLObject deduction = NIL;
                    for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                        mark_dependent_deduction(deduction);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_dependent_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == gethash(assertion, $dependent_assertion_table$.getDynamicValue(thread), UNPROVIDED)) {
            sethash(assertion, $dependent_assertion_table$.getDynamicValue(thread), T);
            final SubLObject set_contents_var = assertion_dependents_internal(assertion);
            SubLObject basis_object;
            SubLObject state;
            SubLObject deduction;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                deduction = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                    mark_dependent_deduction(deduction);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject mark_dependent_deduction_alt(SubLObject deduction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
            if (NIL == gethash(deduction, $dependent_deduction_table$.getDynamicValue(thread), UNPROVIDED)) {
                sethash(deduction, $dependent_deduction_table$.getDynamicValue(thread), T);
                {
                    SubLObject assertion = deductions_high.deduction_assertion(deduction);
                    if (NIL != assertion_handles.assertion_p(assertion)) {
                        {
                            SubLObject cdolist_list_var = assertion_arguments_internal(assertion);
                            SubLObject argument = NIL;
                            for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                if ((NIL == deduction_handles.deduction_p(argument)) || (NIL == gethash(deduction, $dependent_deduction_table$.getDynamicValue(thread), UNPROVIDED))) {
                                    return NIL;
                                }
                                mark_dependent_assertion(assertion);
                            }
                        }
                    } else {
                        if (NIL != kb_hl_supports.kb_hl_support_p(assertion)) {
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_dependent_deduction(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        if (NIL == gethash(deduction, $dependent_deduction_table$.getDynamicValue(thread), UNPROVIDED)) {
            sethash(deduction, $dependent_deduction_table$.getDynamicValue(thread), T);
            final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
            if (NIL != assertion_handles.assertion_p(supported_object)) {
                SubLObject witness = NIL;
                if (NIL == witness) {
                    SubLObject csome_list_var = assertion_arguments_internal(supported_object);
                    SubLObject argument = NIL;
                    argument = csome_list_var.first();
                    while ((NIL == witness) && (NIL != csome_list_var)) {
                        if ((NIL != arguments.belief_p(argument)) || (NIL == gethash(deduction, $dependent_deduction_table$.getDynamicValue(thread), UNPROVIDED))) {
                            witness = argument;
                        }
                        csome_list_var = csome_list_var.rest();
                        argument = csome_list_var.first();
                    } 
                }
                if (NIL == witness) {
                    mark_dependent_assertion(supported_object);
                }
            } else
                if (NIL != kb_hl_support_handles.kb_hl_support_p(supported_object)) {
                }

        }
        return NIL;
    }

    public static final SubLObject verify_assertion_content_table_alt(SubLObject repairP) {
        if (repairP == UNPROVIDED) {
            repairP = NIL;
        }
        return assertion_manager.verify_assertion_content_table_int(ASSERTION_CONTENT_P, repairP);
    }

    public static SubLObject verify_assertion_content_table(SubLObject repairP) {
        if (repairP == UNPROVIDED) {
            repairP = NIL;
        }
        return assertion_manager.verify_assertion_content_table_int(ASSERTION_CONTENT_P, repairP);
    }

    public static SubLObject random_assertion_internal(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        if (assertion_handles.assertion_count().numG(ZERO_INTEGER)) {
            final SubLObject max_id = assertion_handles.next_assertion_id();
            SubLObject v_answer;
            SubLObject candidate;
            for (v_answer = NIL; NIL == v_answer; v_answer = candidate) {
                candidate = assertion_handles.find_assertion_by_id(random.random(max_id));
                if ((NIL != candidate) && (NIL != funcall(test, candidate))) {
                }
            }
            return v_answer;
        }
        return NIL;
    }

    public static SubLObject random_rule_internal() {
        final SubLObject rule_set = kb_rule_set();
        if (NIL != keyhash.keyhash_p(rule_set)) {
            return keyhash.keyhash_random_key(rule_set);
        }
        return assertions_high.random_assertion(symbol_function($sym75$RULE_ASSERTION_));
    }

    public static SubLObject random_gaf_internal() {
        return assertions_high.random_assertion(symbol_function($sym76$GAF_ASSERTION_));
    }

    public static final SubLObject declare_assertions_low_file_alt() {
        declareFunction("assertion_content_print_function_trampoline", "ASSERTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("assertion_content_p", "ASSERTION-CONTENT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.assertions_low.$assertion_content_p$UnaryFunction();
        declareFunction("as_content_formula_data", "AS-CONTENT-FORMULA-DATA", 1, 0, false);
        declareFunction("as_content_mt", "AS-CONTENT-MT", 1, 0, false);
        declareFunction("as_content_flags", "AS-CONTENT-FLAGS", 1, 0, false);
        declareFunction("as_content_arguments", "AS-CONTENT-ARGUMENTS", 1, 0, false);
        declareFunction("as_content_plist", "AS-CONTENT-PLIST", 1, 0, false);
        declareFunction("_csetf_as_content_formula_data", "_CSETF-AS-CONTENT-FORMULA-DATA", 2, 0, false);
        declareFunction("_csetf_as_content_mt", "_CSETF-AS-CONTENT-MT", 2, 0, false);
        declareFunction("_csetf_as_content_flags", "_CSETF-AS-CONTENT-FLAGS", 2, 0, false);
        declareFunction("_csetf_as_content_arguments", "_CSETF-AS-CONTENT-ARGUMENTS", 2, 0, false);
        declareFunction("_csetf_as_content_plist", "_CSETF-AS-CONTENT-PLIST", 2, 0, false);
        declareFunction("make_assertion_content", "MAKE-ASSERTION-CONTENT", 0, 1, false);
        declareFunction("create_assertion_content", "CREATE-ASSERTION-CONTENT", 1, 0, false);
        declareFunction("destroy_assertion_content", "DESTROY-ASSERTION-CONTENT", 1, 0, false);
        declareFunction("lookup_assertion_formula_data", "LOOKUP-ASSERTION-FORMULA-DATA", 1, 0, false);
        declareFunction("lookup_assertion_mt", "LOOKUP-ASSERTION-MT", 1, 0, false);
        declareFunction("lookup_assertion_flags", "LOOKUP-ASSERTION-FLAGS", 1, 0, false);
        declareFunction("lookup_assertion_arguments", "LOOKUP-ASSERTION-ARGUMENTS", 1, 0, false);
        declareFunction("lookup_assertion_plist", "LOOKUP-ASSERTION-PLIST", 1, 0, false);
        declareFunction("set_assertion_formula_data", "SET-ASSERTION-FORMULA-DATA", 2, 0, false);
        declareFunction("set_assertion_flags", "SET-ASSERTION-FLAGS", 2, 0, false);
        declareFunction("set_assertion_arguments", "SET-ASSERTION-ARGUMENTS", 2, 0, false);
        declareFunction("set_assertion_plist", "SET-ASSERTION-PLIST", 2, 0, false);
        declareFunction("dump_assertion_content", "DUMP-ASSERTION-CONTENT", 2, 0, false);
        declareFunction("bundle_assertion_content_for_dumping", "BUNDLE-ASSERTION-CONTENT-FOR-DUMPING", 1, 0, false);
        declareFunction("bundle_assertion_content", "BUNDLE-ASSERTION-CONTENT", 5, 0, false);
        declareFunction("dump_assertion_content_to_fht", "DUMP-ASSERTION-CONTENT-TO-FHT", 2, 1, false);
        declareFunction("dump_assertion_content_bundle_to_fht", "DUMP-ASSERTION-CONTENT-BUNDLE-TO-FHT", 3, 0, false);
        declareFunction("load_assertion_content", "LOAD-ASSERTION-CONTENT", 2, 0, false);
        declareFunction("load_assertion_content_as_bundle", "LOAD-ASSERTION-CONTENT-AS-BUNDLE", 2, 0, false);
        declareFunction("load_assertion_content_from_fht", "LOAD-ASSERTION-CONTENT-FROM-FHT", 2, 0, false);
        declareFunction("load_assertion_content_int", "LOAD-ASSERTION-CONTENT-INT", 6, 0, false);
        declareFunction("assertion_cnf_internal", "ASSERTION-CNF-INTERNAL", 1, 0, false);
        declareFunction("possibly_assertion_cnf_internal", "POSSIBLY-ASSERTION-CNF-INTERNAL", 1, 0, false);
        declareFunction("assertion_mt_internal", "ASSERTION-MT-INTERNAL", 1, 0, false);
        declareFunction("assertion_gaf_hl_formula_internal", "ASSERTION-GAF-HL-FORMULA-INTERNAL", 1, 0, false);
        declareFunction("assertion_cons_internal", "ASSERTION-CONS-INTERNAL", 1, 0, false);
        declareFunction("assertion_direction_internal", "ASSERTION-DIRECTION-INTERNAL", 1, 0, false);
        declareFunction("assertion_truth_internal", "ASSERTION-TRUTH-INTERNAL", 1, 0, false);
        declareFunction("assertion_strength_internal", "ASSERTION-STRENGTH-INTERNAL", 1, 0, false);
        declareFunction("assertion_tv", "ASSERTION-TV", 1, 0, false);
        declareFunction("assertion_variable_names_internal", "ASSERTION-VARIABLE-NAMES-INTERNAL", 1, 0, false);
        declareFunction("asserted_by_internal", "ASSERTED-BY-INTERNAL", 1, 0, false);
        declareFunction("asserted_when_internal", "ASSERTED-WHEN-INTERNAL", 1, 0, false);
        declareFunction("asserted_why_internal", "ASSERTED-WHY-INTERNAL", 1, 0, false);
        declareFunction("asserted_second_internal", "ASSERTED-SECOND-INTERNAL", 1, 0, false);
        declareFunction("assertion_arguments_internal", "ASSERTION-ARGUMENTS-INTERNAL", 1, 0, false);
        declareFunction("assertion_dependents_internal", "ASSERTION-DEPENDENTS-INTERNAL", 1, 0, false);
        declareFunction("assertion_formula_data", "ASSERTION-FORMULA-DATA", 1, 0, false);
        declareFunction("reset_assertion_formula_data", "RESET-ASSERTION-FORMULA-DATA", 2, 0, false);
        declareFunction("assertion_hl_cnf", "ASSERTION-HL-CNF", 1, 0, false);
        declareFunction("update_assertion_formula_data", "UPDATE-ASSERTION-FORMULA-DATA", 2, 0, false);
        declareFunction("assertion_clause_struc", "ASSERTION-CLAUSE-STRUC", 1, 0, false);
        declareFunction("reset_assertion_cnf", "RESET-ASSERTION-CNF", 2, 0, false);
        declareFunction("reset_assertion_clause_struc", "RESET-ASSERTION-CLAUSE-STRUC", 2, 0, false);
        declareFunction("reset_assertion_gaf_formula", "RESET-ASSERTION-GAF-FORMULA", 2, 0, false);
        declareFunction("annihilate_assertion_formula_data", "ANNIHILATE-ASSERTION-FORMULA-DATA", 1, 0, false);
        declareFunction("assertion_flags", "ASSERTION-FLAGS", 1, 0, false);
        declareFunction("reset_assertion_flags", "RESET-ASSERTION-FLAGS", 2, 0, false);
        declareFunction("assertion_flags_gaf_code", "ASSERTION-FLAGS-GAF-CODE", 1, 0, false);
        declareFunction("set_assertion_flags_gaf_code", "SET-ASSERTION-FLAGS-GAF-CODE", 2, 0, false);
        declareFunction("assertion_flags_direction_code", "ASSERTION-FLAGS-DIRECTION-CODE", 1, 0, false);
        declareFunction("set_assertion_flags_direction_code", "SET-ASSERTION-FLAGS-DIRECTION-CODE", 2, 0, false);
        declareFunction("assertion_flags_tv_code", "ASSERTION-FLAGS-TV-CODE", 1, 0, false);
        declareFunction("set_assertion_flags_tv_code", "SET-ASSERTION-FLAGS-TV-CODE", 2, 0, false);
        declareFunction("assertion_flags_gaf_p", "ASSERTION-FLAGS-GAF-P", 1, 0, false);
        declareFunction("set_assertion_flags_gaf_p", "SET-ASSERTION-FLAGS-GAF-P", 2, 0, false);
        declareFunction("setup_rule_set", "SETUP-RULE-SET", 1, 0, false);
        declareFunction("kb_rule_set", "KB-RULE-SET", 0, 0, false);
        declareFunction("assertion_gaf_p", "ASSERTION-GAF-P", 1, 0, false);
        declareFunction("assertion_rule_p", "ASSERTION-RULE-P", 1, 0, false);
        declareFunction("rule_count", "RULE-COUNT", 0, 0, false);
        declareFunction("gaf_count", "GAF-COUNT", 0, 0, false);
        declareFunction("set_assertion_gaf_p", "SET-ASSERTION-GAF-P", 2, 0, false);
        declareFunction("possibly_rule_set_delete", "POSSIBLY-RULE-SET-DELETE", 1, 0, false);
        declareFunction("recompute_assertion_gaf_p", "RECOMPUTE-ASSERTION-GAF-P", 1, 0, false);
        declareFunction("determine_cnf_gaf_p", "DETERMINE-CNF-GAF-P", 1, 0, false);
        declareFunction("dump_rule_set_to_stream", "DUMP-RULE-SET-TO-STREAM", 1, 0, false);
        declareFunction("load_rule_set_from_stream", "LOAD-RULE-SET-FROM-STREAM", 1, 0, false);
        declareFunction("rebuild_rule_set", "REBUILD-RULE-SET", 0, 0, false);
        declareFunction("gaf_formula_to_cnf", "GAF-FORMULA-TO-CNF", 1, 0, false);
        declareFunction("cnf_to_gaf_formula", "CNF-TO-GAF-FORMULA", 1, 0, false);
        declareFunction("kb_set_assertion_direction_internal", "KB-SET-ASSERTION-DIRECTION-INTERNAL", 2, 0, false);
        declareFunction("reset_assertion_direction", "RESET-ASSERTION-DIRECTION", 2, 0, false);
        declareFunction("reset_assertion_tv", "RESET-ASSERTION-TV", 2, 0, false);
        declareFunction("reset_assertion_truth", "RESET-ASSERTION-TRUTH", 2, 0, false);
        declareFunction("reset_assertion_strength", "RESET-ASSERTION-STRENGTH", 2, 0, false);
        declareFunction("assertion_plist", "ASSERTION-PLIST", 1, 0, false);
        declareFunction("reset_assertion_plist", "RESET-ASSERTION-PLIST", 2, 0, false);
        declareFunction("get_assertion_prop", "GET-ASSERTION-PROP", 2, 1, false);
        declareFunction("set_assertion_prop", "SET-ASSERTION-PROP", 3, 0, false);
        declareFunction("rem_assertion_prop", "REM-ASSERTION-PROP", 2, 0, false);
        declareFunction("reset_assertion_variable_names", "RESET-ASSERTION-VARIABLE-NAMES", 2, 0, false);
        declareFunction("assertion_index", "ASSERTION-INDEX", 1, 0, false);
        declareFunction("reset_assertion_index", "RESET-ASSERTION-INDEX", 2, 0, false);
        declareFunction("clear_assertion_index", "CLEAR-ASSERTION-INDEX", 1, 0, false);
        declareMacro("destructure_assert_info", "DESTRUCTURE-ASSERT-INFO");
        declareFunction("assertion_assert_info", "ASSERTION-ASSERT-INFO", 1, 0, false);
        declareFunction("reset_assertion_assert_info", "RESET-ASSERTION-ASSERT-INFO", 2, 0, false);
        declareFunction("asserted_assertion_timestampedP", "ASSERTED-ASSERTION-TIMESTAMPED?", 1, 0, false);
        declareFunction("make_assert_info", "MAKE-ASSERT-INFO", 0, 4, false);
        declareFunction("assert_info_who", "ASSERT-INFO-WHO", 1, 0, false);
        declareFunction("assert_info_when", "ASSERT-INFO-WHEN", 1, 0, false);
        declareFunction("assert_info_why", "ASSERT-INFO-WHY", 1, 0, false);
        declareFunction("assert_info_second", "ASSERT-INFO-SECOND", 1, 0, false);
        declareFunction("set_assertion_asserted_by", "SET-ASSERTION-ASSERTED-BY", 2, 0, false);
        declareFunction("set_assertion_asserted_when", "SET-ASSERTION-ASSERTED-WHEN", 2, 0, false);
        declareFunction("set_assertion_asserted_why", "SET-ASSERTION-ASSERTED-WHY", 2, 0, false);
        declareFunction("set_assertion_asserted_second", "SET-ASSERTION-ASSERTED-SECOND", 2, 0, false);
        declareFunction("valid_assertion_robustP", "VALID-ASSERTION-ROBUST?", 1, 0, false);
        declareFunction("valid_assertion_with_contentP", "VALID-ASSERTION-WITH-CONTENT?", 1, 0, false);
        declareFunction("kb_create_assertion_kb_store", "KB-CREATE-ASSERTION-KB-STORE", 2, 0, false);
        declareFunction("kb_create_assertion_int", "KB-CREATE-ASSERTION-INT", 4, 0, false);
        declareFunction("kb_create_assertion_cyc", "KB-CREATE-ASSERTION-CYC", 1, 0, false);
        declareFunction("find_cnf_formula_data_hook", "FIND-CNF-FORMULA-DATA-HOOK", 1, 0, false);
        declareFunction("find_hl_cnf_hook", "FIND-HL-CNF-HOOK", 1, 0, false);
        declareFunction("find_gaf_formula_hook", "FIND-GAF-FORMULA-HOOK", 1, 0, false);
        declareFunction("connect_assertion", "CONNECT-ASSERTION", 2, 0, false);
        declareFunction("connect_assertion_formula_data", "CONNECT-ASSERTION-FORMULA-DATA", 2, 0, false);
        declareFunction("kb_remove_assertion_internal", "KB-REMOVE-ASSERTION-INTERNAL", 1, 0, false);
        declareFunction("reconnect_assertion", "RECONNECT-ASSERTION", 2, 0, false);
        declareFunction("disconnect_assertion", "DISCONNECT-ASSERTION", 1, 0, false);
        declareFunction("disconnect_assertion_formula_data", "DISCONNECT-ASSERTION-FORMULA-DATA", 1, 0, false);
        declareFunction("add_new_assertion_argument", "ADD-NEW-ASSERTION-ARGUMENT", 2, 0, false);
        declareFunction("remove_assertion_argument", "REMOVE-ASSERTION-ARGUMENT", 2, 0, false);
        declareFunction("reset_assertion_dependents", "RESET-ASSERTION-DEPENDENTS", 2, 0, false);
        declareFunction("add_assertion_dependent", "ADD-ASSERTION-DEPENDENT", 2, 0, false);
        declareFunction("remove_assertion_dependent", "REMOVE-ASSERTION-DEPENDENT", 2, 0, false);
        declareFunction("assertion_dependencies", "ASSERTION-DEPENDENCIES", 1, 0, false);
        declareFunction("mark_dependent_assertion", "MARK-DEPENDENT-ASSERTION", 1, 0, false);
        declareFunction("mark_dependent_deduction", "MARK-DEPENDENT-DEDUCTION", 1, 0, false);
        declareFunction("verify_assertion_content_table", "VERIFY-ASSERTION-CONTENT-TABLE", 0, 1, false);
        return NIL;
    }

    public static SubLObject declare_assertions_low_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("assertion_content_print_function_trampoline", "ASSERTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("assertion_content_p", "ASSERTION-CONTENT-P", 1, 0, false);
            new assertions_low.$assertion_content_p$UnaryFunction();
            declareFunction("as_content_formula_data", "AS-CONTENT-FORMULA-DATA", 1, 0, false);
            declareFunction("as_content_mt", "AS-CONTENT-MT", 1, 0, false);
            declareFunction("as_content_flags", "AS-CONTENT-FLAGS", 1, 0, false);
            declareFunction("as_content_arguments", "AS-CONTENT-ARGUMENTS", 1, 0, false);
            declareFunction("as_content_plist", "AS-CONTENT-PLIST", 1, 0, false);
            declareFunction("_csetf_as_content_formula_data", "_CSETF-AS-CONTENT-FORMULA-DATA", 2, 0, false);
            declareFunction("_csetf_as_content_mt", "_CSETF-AS-CONTENT-MT", 2, 0, false);
            declareFunction("_csetf_as_content_flags", "_CSETF-AS-CONTENT-FLAGS", 2, 0, false);
            declareFunction("_csetf_as_content_arguments", "_CSETF-AS-CONTENT-ARGUMENTS", 2, 0, false);
            declareFunction("_csetf_as_content_plist", "_CSETF-AS-CONTENT-PLIST", 2, 0, false);
            declareFunction("make_assertion_content", "MAKE-ASSERTION-CONTENT", 0, 1, false);
            declareFunction("visit_defstruct_assertion_content", "VISIT-DEFSTRUCT-ASSERTION-CONTENT", 2, 0, false);
            declareFunction("visit_defstruct_object_assertion_content_method", "VISIT-DEFSTRUCT-OBJECT-ASSERTION-CONTENT-METHOD", 2, 0, false);
            declareFunction("create_assertion_content", "CREATE-ASSERTION-CONTENT", 1, 0, false);
            declareFunction("destroy_assertion_content", "DESTROY-ASSERTION-CONTENT", 1, 0, false);
            declareFunction("lookup_assertion_formula_data", "LOOKUP-ASSERTION-FORMULA-DATA", 1, 0, false);
            declareFunction("lookup_assertion_mt", "LOOKUP-ASSERTION-MT", 1, 0, false);
            declareFunction("lookup_assertion_flags", "LOOKUP-ASSERTION-FLAGS", 1, 0, false);
            declareFunction("lookup_assertion_arguments", "LOOKUP-ASSERTION-ARGUMENTS", 1, 0, false);
            declareFunction("lookup_assertion_plist", "LOOKUP-ASSERTION-PLIST", 1, 0, false);
            declareFunction("set_assertion_formula_data", "SET-ASSERTION-FORMULA-DATA", 2, 0, false);
            declareFunction("set_assertion_flags", "SET-ASSERTION-FLAGS", 2, 0, false);
            declareFunction("set_assertion_arguments", "SET-ASSERTION-ARGUMENTS", 2, 0, false);
            declareFunction("set_assertion_plist", "SET-ASSERTION-PLIST", 2, 0, false);
            declareFunction("dump_assertion_content", "DUMP-ASSERTION-CONTENT", 2, 0, false);
            declareFunction("assertion_plist_for_dumping", "ASSERTION-PLIST-FOR-DUMPING", 1, 0, false);
            declareFunction("load_assertion_content", "LOAD-ASSERTION-CONTENT", 2, 0, false);
            declareFunction("load_assertion_content_int", "LOAD-ASSERTION-CONTENT-INT", 6, 0, false);
            declareFunction("assertion_cnf_internal", "ASSERTION-CNF-INTERNAL", 1, 0, false);
            declareFunction("possibly_assertion_cnf_internal", "POSSIBLY-ASSERTION-CNF-INTERNAL", 1, 0, false);
            declareFunction("assertion_mt_internal", "ASSERTION-MT-INTERNAL", 1, 0, false);
            declareFunction("assertion_gaf_hl_formula_internal", "ASSERTION-GAF-HL-FORMULA-INTERNAL", 1, 0, false);
            declareFunction("assertion_cons_internal", "ASSERTION-CONS-INTERNAL", 1, 0, false);
            declareFunction("assertion_direction_internal", "ASSERTION-DIRECTION-INTERNAL", 1, 0, false);
            declareFunction("assertion_truth_internal", "ASSERTION-TRUTH-INTERNAL", 1, 0, false);
            declareFunction("assertion_strength_internal", "ASSERTION-STRENGTH-INTERNAL", 1, 0, false);
            declareFunction("assertion_tv", "ASSERTION-TV", 1, 0, false);
            declareFunction("assertion_tv_internal", "ASSERTION-TV-INTERNAL", 1, 0, false);
            declareFunction("assertion_variable_names_internal", "ASSERTION-VARIABLE-NAMES-INTERNAL", 1, 0, false);
            declareFunction("asserted_by_internal", "ASSERTED-BY-INTERNAL", 1, 0, false);
            declareFunction("asserted_when_internal", "ASSERTED-WHEN-INTERNAL", 1, 0, false);
            declareFunction("asserted_why_internal", "ASSERTED-WHY-INTERNAL", 1, 0, false);
            declareFunction("asserted_second_internal", "ASSERTED-SECOND-INTERNAL", 1, 0, false);
            declareFunction("assertion_arguments_internal", "ASSERTION-ARGUMENTS-INTERNAL", 1, 0, false);
            declareFunction("assertion_dependents_internal", "ASSERTION-DEPENDENTS-INTERNAL", 1, 0, false);
            declareFunction("assertion_dependent_count_internal", "ASSERTION-DEPENDENT-COUNT-INTERNAL", 1, 0, false);
            declareFunction("assertion_has_dependents_p_internal", "ASSERTION-HAS-DEPENDENTS-P-INTERNAL", 1, 0, false);
            declareFunction("assertion_formula_data", "ASSERTION-FORMULA-DATA", 1, 0, false);
            declareFunction("reset_assertion_formula_data", "RESET-ASSERTION-FORMULA-DATA", 2, 0, false);
            declareFunction("assertion_hl_cnf", "ASSERTION-HL-CNF", 1, 0, false);
            declareFunction("update_assertion_formula_data", "UPDATE-ASSERTION-FORMULA-DATA", 2, 0, false);
            declareFunction("assertion_clause_struc", "ASSERTION-CLAUSE-STRUC", 1, 0, false);
            declareFunction("reset_assertion_cnf", "RESET-ASSERTION-CNF", 2, 0, false);
            declareFunction("reset_assertion_clause_struc", "RESET-ASSERTION-CLAUSE-STRUC", 2, 0, false);
            declareFunction("reset_assertion_gaf_formula", "RESET-ASSERTION-GAF-FORMULA", 2, 0, false);
            declareFunction("annihilate_assertion_formula_data", "ANNIHILATE-ASSERTION-FORMULA-DATA", 1, 0, false);
            declareFunction("assertion_flags", "ASSERTION-FLAGS", 1, 0, false);
            declareFunction("reset_assertion_flags", "RESET-ASSERTION-FLAGS", 2, 0, false);
            declareFunction("assertion_flags_gaf_code", "ASSERTION-FLAGS-GAF-CODE", 1, 0, false);
            declareFunction("set_assertion_flags_gaf_code", "SET-ASSERTION-FLAGS-GAF-CODE", 2, 0, false);
            declareFunction("assertion_flags_direction_code", "ASSERTION-FLAGS-DIRECTION-CODE", 1, 0, false);
            declareFunction("set_assertion_flags_direction_code", "SET-ASSERTION-FLAGS-DIRECTION-CODE", 2, 0, false);
            declareFunction("assertion_flags_tv_code", "ASSERTION-FLAGS-TV-CODE", 1, 0, false);
            declareFunction("set_assertion_flags_tv_code", "SET-ASSERTION-FLAGS-TV-CODE", 2, 0, false);
            declareFunction("assertion_flags_gaf_p", "ASSERTION-FLAGS-GAF-P", 1, 0, false);
            declareFunction("set_assertion_flags_gaf_p", "SET-ASSERTION-FLAGS-GAF-P", 2, 0, false);
            declareFunction("use_rule_setP", "USE-RULE-SET?", 0, 0, false);
            declareFunction("setup_rule_set", "SETUP-RULE-SET", 1, 0, false);
            declareFunction("kb_rule_set", "KB-RULE-SET", 0, 0, false);
            declareFunction("assertion_gaf_p", "ASSERTION-GAF-P", 1, 0, false);
            declareFunction("assertion_rule_p", "ASSERTION-RULE-P", 1, 0, false);
            declareFunction("rule_count", "RULE-COUNT", 0, 0, false);
            declareFunction("gaf_count", "GAF-COUNT", 0, 0, false);
            declareFunction("set_assertion_gaf_p", "SET-ASSERTION-GAF-P", 2, 0, false);
            declareFunction("possibly_rule_set_delete", "POSSIBLY-RULE-SET-DELETE", 1, 0, false);
            declareFunction("recompute_assertion_gaf_p", "RECOMPUTE-ASSERTION-GAF-P", 1, 0, false);
            declareFunction("determine_cnf_gaf_p", "DETERMINE-CNF-GAF-P", 1, 0, false);
            declareFunction("dump_rule_set_to_stream", "DUMP-RULE-SET-TO-STREAM", 1, 0, false);
            declareFunction("load_rule_set_from_stream", "LOAD-RULE-SET-FROM-STREAM", 1, 0, false);
            declareFunction("rebuild_rule_set", "REBUILD-RULE-SET", 0, 0, false);
            declareFunction("gaf_formula_to_cnf", "GAF-FORMULA-TO-CNF", 1, 0, false);
            declareFunction("cnf_to_gaf_formula", "CNF-TO-GAF-FORMULA", 1, 0, false);
            declareFunction("kb_set_assertion_direction_internal", "KB-SET-ASSERTION-DIRECTION-INTERNAL", 2, 0, false);
            declareFunction("reset_assertion_direction", "RESET-ASSERTION-DIRECTION", 2, 0, false);
            declareFunction("reset_assertion_tv", "RESET-ASSERTION-TV", 2, 0, false);
            declareFunction("reset_assertion_truth", "RESET-ASSERTION-TRUTH", 2, 0, false);
            declareFunction("reset_assertion_strength", "RESET-ASSERTION-STRENGTH", 2, 0, false);
            declareFunction("use_non_true_assertion_tv_cacheP", "USE-NON-TRUE-ASSERTION-TV-CACHE?", 0, 0, false);
            declareFunction("setup_non_true_assertion_tv_cache", "SETUP-NON-TRUE-ASSERTION-TV-CACHE", 1, 0, false);
            declareFunction("kb_non_true_assertion_tv_cache", "KB-NON-TRUE-ASSERTION-TV-CACHE", 0, 0, false);
            declareFunction("assertion_true_p", "ASSERTION-TRUE-P", 1, 0, false);
            declareFunction("assertion_non_true_tv", "ASSERTION-NON-TRUE-TV", 1, 0, false);
            declareFunction("non_true_assertion_count", "NON-TRUE-ASSERTION-COUNT", 0, 0, false);
            declareFunction("true_assertion_count", "TRUE-ASSERTION-COUNT", 0, 0, false);
            declareFunction("set_assertion_non_true_cache_tv", "SET-ASSERTION-NON-TRUE-CACHE-TV", 2, 0, false);
            declareFunction("possibly_non_true_assertion_tv_cache_delete", "POSSIBLY-NON-TRUE-ASSERTION-TV-CACHE-DELETE", 1, 0, false);
            declareFunction("dump_non_true_assertion_tv_cache_to_stream", "DUMP-NON-TRUE-ASSERTION-TV-CACHE-TO-STREAM", 1, 0, false);
            declareFunction("load_non_true_assertion_tv_cache_from_stream", "LOAD-NON-TRUE-ASSERTION-TV-CACHE-FROM-STREAM", 1, 0, false);
            declareFunction("rebuild_non_true_assertion_tv_cache", "REBUILD-NON-TRUE-ASSERTION-TV-CACHE", 0, 0, false);
            declareFunction("assertion_plist", "ASSERTION-PLIST", 1, 0, false);
            declareFunction("reset_assertion_plist", "RESET-ASSERTION-PLIST", 2, 0, false);
            declareFunction("get_assertion_prop", "GET-ASSERTION-PROP", 2, 1, false);
            declareFunction("set_assertion_prop", "SET-ASSERTION-PROP", 3, 0, false);
            declareFunction("rem_assertion_prop", "REM-ASSERTION-PROP", 2, 0, false);
            declareFunction("reset_assertion_variable_names", "RESET-ASSERTION-VARIABLE-NAMES", 2, 0, false);
            declareFunction("does_assertion_have_meta_assertionsP", "DOES-ASSERTION-HAVE-META-ASSERTIONS?", 1, 0, false);
            declareFunction("all_meta_assertions_for_assertion", "ALL-META-ASSERTIONS-FOR-ASSERTION", 1, 0, false);
            declareFunction("assertion_index", "ASSERTION-INDEX", 1, 0, false);
            declareFunction("assertion_index_swapped_inP", "ASSERTION-INDEX-SWAPPED-IN?", 1, 0, false);
            declareFunction("reset_assertion_index", "RESET-ASSERTION-INDEX", 2, 0, false);
            declareFunction("clear_assertion_index", "CLEAR-ASSERTION-INDEX", 1, 0, false);
            declareMacro("destructure_assert_info", "DESTRUCTURE-ASSERT-INFO");
            declareFunction("assertion_assert_info", "ASSERTION-ASSERT-INFO", 1, 0, false);
            declareFunction("reset_assertion_assert_info", "RESET-ASSERTION-ASSERT-INFO", 2, 0, false);
            declareFunction("asserted_assertion_timestampedP", "ASSERTED-ASSERTION-TIMESTAMPED?", 1, 0, false);
            declareFunction("make_assert_info", "MAKE-ASSERT-INFO", 0, 4, false);
            declareFunction("assert_info_who", "ASSERT-INFO-WHO", 1, 0, false);
            declareFunction("assert_info_when", "ASSERT-INFO-WHEN", 1, 0, false);
            declareFunction("assert_info_why", "ASSERT-INFO-WHY", 1, 0, false);
            declareFunction("assert_info_second", "ASSERT-INFO-SECOND", 1, 0, false);
            declareFunction("set_assertion_asserted_by", "SET-ASSERTION-ASSERTED-BY", 2, 0, false);
            declareFunction("set_assertion_asserted_when", "SET-ASSERTION-ASSERTED-WHEN", 2, 0, false);
            declareFunction("set_assertion_asserted_why", "SET-ASSERTION-ASSERTED-WHY", 2, 0, false);
            declareFunction("set_assertion_asserted_second", "SET-ASSERTION-ASSERTED-SECOND", 2, 0, false);
            declareFunction("valid_assertion_robustP", "VALID-ASSERTION-ROBUST?", 1, 0, false);
            declareFunction("valid_assertion_with_contentP", "VALID-ASSERTION-WITH-CONTENT?", 1, 0, false);
            declareFunction("kb_create_assertion_kb_store", "KB-CREATE-ASSERTION-KB-STORE", 7, 0, false);
            declareFunction("kb_create_assertion_int", "KB-CREATE-ASSERTION-INT", 9, 0, false);
            declareFunction("kb_create_assertion_cyc", "KB-CREATE-ASSERTION-CYC", 1, 0, false);
            declareFunction("find_cnf_formula_data_hook", "FIND-CNF-FORMULA-DATA-HOOK", 1, 0, false);
            declareFunction("find_hl_cnf_hook", "FIND-HL-CNF-HOOK", 1, 0, false);
            declareFunction("find_gaf_formula_hook", "FIND-GAF-FORMULA-HOOK", 1, 0, false);
            declareFunction("connect_assertion", "CONNECT-ASSERTION", 2, 0, false);
            declareFunction("connect_assertion_formula_data", "CONNECT-ASSERTION-FORMULA-DATA", 2, 0, false);
            declareFunction("kb_remove_assertion_internal", "KB-REMOVE-ASSERTION-INTERNAL", 1, 0, false);
            declareFunction("reconnect_assertion", "RECONNECT-ASSERTION", 2, 0, false);
            declareFunction("disconnect_assertion", "DISCONNECT-ASSERTION", 1, 0, false);
            declareFunction("disconnect_assertion_formula_data", "DISCONNECT-ASSERTION-FORMULA-DATA", 1, 0, false);
            declareFunction("add_new_assertion_argument", "ADD-NEW-ASSERTION-ARGUMENT", 2, 0, false);
            declareFunction("remove_assertion_argument", "REMOVE-ASSERTION-ARGUMENT", 2, 0, false);
            declareFunction("reset_assertion_dependents", "RESET-ASSERTION-DEPENDENTS", 2, 0, false);
            declareFunction("add_assertion_dependent", "ADD-ASSERTION-DEPENDENT", 2, 0, false);
            declareFunction("remove_assertion_dependent", "REMOVE-ASSERTION-DEPENDENT", 2, 0, false);
            declareFunction("assertion_dependencies", "ASSERTION-DEPENDENCIES", 1, 0, false);
            declareFunction("mark_dependent_assertion", "MARK-DEPENDENT-ASSERTION", 1, 0, false);
            declareFunction("mark_dependent_deduction", "MARK-DEPENDENT-DEDUCTION", 1, 0, false);
            declareFunction("verify_assertion_content_table", "VERIFY-ASSERTION-CONTENT-TABLE", 0, 1, false);
            declareFunction("random_assertion_internal", "RANDOM-ASSERTION-INTERNAL", 0, 1, false);
            declareFunction("random_rule_internal", "RANDOM-RULE-INTERNAL", 0, 0, false);
            declareFunction("random_gaf_internal", "RANDOM-GAF-INTERNAL", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("bundle_assertion_content_for_dumping", "BUNDLE-ASSERTION-CONTENT-FOR-DUMPING", 1, 0, false);
            declareFunction("bundle_assertion_content", "BUNDLE-ASSERTION-CONTENT", 5, 0, false);
            declareFunction("dump_assertion_content_to_fht", "DUMP-ASSERTION-CONTENT-TO-FHT", 2, 1, false);
            declareFunction("dump_assertion_content_bundle_to_fht", "DUMP-ASSERTION-CONTENT-BUNDLE-TO-FHT", 3, 0, false);
            declareFunction("load_assertion_content_as_bundle", "LOAD-ASSERTION-CONTENT-AS-BUNDLE", 2, 0, false);
            declareFunction("load_assertion_content_from_fht", "LOAD-ASSERTION-CONTENT-FROM-FHT", 2, 0, false);
            declareFunction("kb_create_assertion_kb_store", "KB-CREATE-ASSERTION-KB-STORE", 2, 0, false);
            declareFunction("kb_create_assertion_int", "KB-CREATE-ASSERTION-INT", 4, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_assertions_low_file_Previous() {
        declareFunction("assertion_content_print_function_trampoline", "ASSERTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("assertion_content_p", "ASSERTION-CONTENT-P", 1, 0, false);
        new assertions_low.$assertion_content_p$UnaryFunction();
        declareFunction("as_content_formula_data", "AS-CONTENT-FORMULA-DATA", 1, 0, false);
        declareFunction("as_content_mt", "AS-CONTENT-MT", 1, 0, false);
        declareFunction("as_content_flags", "AS-CONTENT-FLAGS", 1, 0, false);
        declareFunction("as_content_arguments", "AS-CONTENT-ARGUMENTS", 1, 0, false);
        declareFunction("as_content_plist", "AS-CONTENT-PLIST", 1, 0, false);
        declareFunction("_csetf_as_content_formula_data", "_CSETF-AS-CONTENT-FORMULA-DATA", 2, 0, false);
        declareFunction("_csetf_as_content_mt", "_CSETF-AS-CONTENT-MT", 2, 0, false);
        declareFunction("_csetf_as_content_flags", "_CSETF-AS-CONTENT-FLAGS", 2, 0, false);
        declareFunction("_csetf_as_content_arguments", "_CSETF-AS-CONTENT-ARGUMENTS", 2, 0, false);
        declareFunction("_csetf_as_content_plist", "_CSETF-AS-CONTENT-PLIST", 2, 0, false);
        declareFunction("make_assertion_content", "MAKE-ASSERTION-CONTENT", 0, 1, false);
        declareFunction("visit_defstruct_assertion_content", "VISIT-DEFSTRUCT-ASSERTION-CONTENT", 2, 0, false);
        declareFunction("visit_defstruct_object_assertion_content_method", "VISIT-DEFSTRUCT-OBJECT-ASSERTION-CONTENT-METHOD", 2, 0, false);
        declareFunction("create_assertion_content", "CREATE-ASSERTION-CONTENT", 1, 0, false);
        declareFunction("destroy_assertion_content", "DESTROY-ASSERTION-CONTENT", 1, 0, false);
        declareFunction("lookup_assertion_formula_data", "LOOKUP-ASSERTION-FORMULA-DATA", 1, 0, false);
        declareFunction("lookup_assertion_mt", "LOOKUP-ASSERTION-MT", 1, 0, false);
        declareFunction("lookup_assertion_flags", "LOOKUP-ASSERTION-FLAGS", 1, 0, false);
        declareFunction("lookup_assertion_arguments", "LOOKUP-ASSERTION-ARGUMENTS", 1, 0, false);
        declareFunction("lookup_assertion_plist", "LOOKUP-ASSERTION-PLIST", 1, 0, false);
        declareFunction("set_assertion_formula_data", "SET-ASSERTION-FORMULA-DATA", 2, 0, false);
        declareFunction("set_assertion_flags", "SET-ASSERTION-FLAGS", 2, 0, false);
        declareFunction("set_assertion_arguments", "SET-ASSERTION-ARGUMENTS", 2, 0, false);
        declareFunction("set_assertion_plist", "SET-ASSERTION-PLIST", 2, 0, false);
        declareFunction("dump_assertion_content", "DUMP-ASSERTION-CONTENT", 2, 0, false);
        declareFunction("assertion_plist_for_dumping", "ASSERTION-PLIST-FOR-DUMPING", 1, 0, false);
        declareFunction("load_assertion_content", "LOAD-ASSERTION-CONTENT", 2, 0, false);
        declareFunction("load_assertion_content_int", "LOAD-ASSERTION-CONTENT-INT", 6, 0, false);
        declareFunction("assertion_cnf_internal", "ASSERTION-CNF-INTERNAL", 1, 0, false);
        declareFunction("possibly_assertion_cnf_internal", "POSSIBLY-ASSERTION-CNF-INTERNAL", 1, 0, false);
        declareFunction("assertion_mt_internal", "ASSERTION-MT-INTERNAL", 1, 0, false);
        declareFunction("assertion_gaf_hl_formula_internal", "ASSERTION-GAF-HL-FORMULA-INTERNAL", 1, 0, false);
        declareFunction("assertion_cons_internal", "ASSERTION-CONS-INTERNAL", 1, 0, false);
        declareFunction("assertion_direction_internal", "ASSERTION-DIRECTION-INTERNAL", 1, 0, false);
        declareFunction("assertion_truth_internal", "ASSERTION-TRUTH-INTERNAL", 1, 0, false);
        declareFunction("assertion_strength_internal", "ASSERTION-STRENGTH-INTERNAL", 1, 0, false);
        declareFunction("assertion_tv", "ASSERTION-TV", 1, 0, false);
        declareFunction("assertion_tv_internal", "ASSERTION-TV-INTERNAL", 1, 0, false);
        declareFunction("assertion_variable_names_internal", "ASSERTION-VARIABLE-NAMES-INTERNAL", 1, 0, false);
        declareFunction("asserted_by_internal", "ASSERTED-BY-INTERNAL", 1, 0, false);
        declareFunction("asserted_when_internal", "ASSERTED-WHEN-INTERNAL", 1, 0, false);
        declareFunction("asserted_why_internal", "ASSERTED-WHY-INTERNAL", 1, 0, false);
        declareFunction("asserted_second_internal", "ASSERTED-SECOND-INTERNAL", 1, 0, false);
        declareFunction("assertion_arguments_internal", "ASSERTION-ARGUMENTS-INTERNAL", 1, 0, false);
        declareFunction("assertion_dependents_internal", "ASSERTION-DEPENDENTS-INTERNAL", 1, 0, false);
        declareFunction("assertion_dependent_count_internal", "ASSERTION-DEPENDENT-COUNT-INTERNAL", 1, 0, false);
        declareFunction("assertion_has_dependents_p_internal", "ASSERTION-HAS-DEPENDENTS-P-INTERNAL", 1, 0, false);
        declareFunction("assertion_formula_data", "ASSERTION-FORMULA-DATA", 1, 0, false);
        declareFunction("reset_assertion_formula_data", "RESET-ASSERTION-FORMULA-DATA", 2, 0, false);
        declareFunction("assertion_hl_cnf", "ASSERTION-HL-CNF", 1, 0, false);
        declareFunction("update_assertion_formula_data", "UPDATE-ASSERTION-FORMULA-DATA", 2, 0, false);
        declareFunction("assertion_clause_struc", "ASSERTION-CLAUSE-STRUC", 1, 0, false);
        declareFunction("reset_assertion_cnf", "RESET-ASSERTION-CNF", 2, 0, false);
        declareFunction("reset_assertion_clause_struc", "RESET-ASSERTION-CLAUSE-STRUC", 2, 0, false);
        declareFunction("reset_assertion_gaf_formula", "RESET-ASSERTION-GAF-FORMULA", 2, 0, false);
        declareFunction("annihilate_assertion_formula_data", "ANNIHILATE-ASSERTION-FORMULA-DATA", 1, 0, false);
        declareFunction("assertion_flags", "ASSERTION-FLAGS", 1, 0, false);
        declareFunction("reset_assertion_flags", "RESET-ASSERTION-FLAGS", 2, 0, false);
        declareFunction("assertion_flags_gaf_code", "ASSERTION-FLAGS-GAF-CODE", 1, 0, false);
        declareFunction("set_assertion_flags_gaf_code", "SET-ASSERTION-FLAGS-GAF-CODE", 2, 0, false);
        declareFunction("assertion_flags_direction_code", "ASSERTION-FLAGS-DIRECTION-CODE", 1, 0, false);
        declareFunction("set_assertion_flags_direction_code", "SET-ASSERTION-FLAGS-DIRECTION-CODE", 2, 0, false);
        declareFunction("assertion_flags_tv_code", "ASSERTION-FLAGS-TV-CODE", 1, 0, false);
        declareFunction("set_assertion_flags_tv_code", "SET-ASSERTION-FLAGS-TV-CODE", 2, 0, false);
        declareFunction("assertion_flags_gaf_p", "ASSERTION-FLAGS-GAF-P", 1, 0, false);
        declareFunction("set_assertion_flags_gaf_p", "SET-ASSERTION-FLAGS-GAF-P", 2, 0, false);
        declareFunction("use_rule_setP", "USE-RULE-SET?", 0, 0, false);
        declareFunction("setup_rule_set", "SETUP-RULE-SET", 1, 0, false);
        declareFunction("kb_rule_set", "KB-RULE-SET", 0, 0, false);
        declareFunction("assertion_gaf_p", "ASSERTION-GAF-P", 1, 0, false);
        declareFunction("assertion_rule_p", "ASSERTION-RULE-P", 1, 0, false);
        declareFunction("rule_count", "RULE-COUNT", 0, 0, false);
        declareFunction("gaf_count", "GAF-COUNT", 0, 0, false);
        declareFunction("set_assertion_gaf_p", "SET-ASSERTION-GAF-P", 2, 0, false);
        declareFunction("possibly_rule_set_delete", "POSSIBLY-RULE-SET-DELETE", 1, 0, false);
        declareFunction("recompute_assertion_gaf_p", "RECOMPUTE-ASSERTION-GAF-P", 1, 0, false);
        declareFunction("determine_cnf_gaf_p", "DETERMINE-CNF-GAF-P", 1, 0, false);
        declareFunction("dump_rule_set_to_stream", "DUMP-RULE-SET-TO-STREAM", 1, 0, false);
        declareFunction("load_rule_set_from_stream", "LOAD-RULE-SET-FROM-STREAM", 1, 0, false);
        declareFunction("rebuild_rule_set", "REBUILD-RULE-SET", 0, 0, false);
        declareFunction("gaf_formula_to_cnf", "GAF-FORMULA-TO-CNF", 1, 0, false);
        declareFunction("cnf_to_gaf_formula", "CNF-TO-GAF-FORMULA", 1, 0, false);
        declareFunction("kb_set_assertion_direction_internal", "KB-SET-ASSERTION-DIRECTION-INTERNAL", 2, 0, false);
        declareFunction("reset_assertion_direction", "RESET-ASSERTION-DIRECTION", 2, 0, false);
        declareFunction("reset_assertion_tv", "RESET-ASSERTION-TV", 2, 0, false);
        declareFunction("reset_assertion_truth", "RESET-ASSERTION-TRUTH", 2, 0, false);
        declareFunction("reset_assertion_strength", "RESET-ASSERTION-STRENGTH", 2, 0, false);
        declareFunction("use_non_true_assertion_tv_cacheP", "USE-NON-TRUE-ASSERTION-TV-CACHE?", 0, 0, false);
        declareFunction("setup_non_true_assertion_tv_cache", "SETUP-NON-TRUE-ASSERTION-TV-CACHE", 1, 0, false);
        declareFunction("kb_non_true_assertion_tv_cache", "KB-NON-TRUE-ASSERTION-TV-CACHE", 0, 0, false);
        declareFunction("assertion_true_p", "ASSERTION-TRUE-P", 1, 0, false);
        declareFunction("assertion_non_true_tv", "ASSERTION-NON-TRUE-TV", 1, 0, false);
        declareFunction("non_true_assertion_count", "NON-TRUE-ASSERTION-COUNT", 0, 0, false);
        declareFunction("true_assertion_count", "TRUE-ASSERTION-COUNT", 0, 0, false);
        declareFunction("set_assertion_non_true_cache_tv", "SET-ASSERTION-NON-TRUE-CACHE-TV", 2, 0, false);
        declareFunction("possibly_non_true_assertion_tv_cache_delete", "POSSIBLY-NON-TRUE-ASSERTION-TV-CACHE-DELETE", 1, 0, false);
        declareFunction("dump_non_true_assertion_tv_cache_to_stream", "DUMP-NON-TRUE-ASSERTION-TV-CACHE-TO-STREAM", 1, 0, false);
        declareFunction("load_non_true_assertion_tv_cache_from_stream", "LOAD-NON-TRUE-ASSERTION-TV-CACHE-FROM-STREAM", 1, 0, false);
        declareFunction("rebuild_non_true_assertion_tv_cache", "REBUILD-NON-TRUE-ASSERTION-TV-CACHE", 0, 0, false);
        declareFunction("assertion_plist", "ASSERTION-PLIST", 1, 0, false);
        declareFunction("reset_assertion_plist", "RESET-ASSERTION-PLIST", 2, 0, false);
        declareFunction("get_assertion_prop", "GET-ASSERTION-PROP", 2, 1, false);
        declareFunction("set_assertion_prop", "SET-ASSERTION-PROP", 3, 0, false);
        declareFunction("rem_assertion_prop", "REM-ASSERTION-PROP", 2, 0, false);
        declareFunction("reset_assertion_variable_names", "RESET-ASSERTION-VARIABLE-NAMES", 2, 0, false);
        declareFunction("does_assertion_have_meta_assertionsP", "DOES-ASSERTION-HAVE-META-ASSERTIONS?", 1, 0, false);
        declareFunction("all_meta_assertions_for_assertion", "ALL-META-ASSERTIONS-FOR-ASSERTION", 1, 0, false);
        declareFunction("assertion_index", "ASSERTION-INDEX", 1, 0, false);
        declareFunction("assertion_index_swapped_inP", "ASSERTION-INDEX-SWAPPED-IN?", 1, 0, false);
        declareFunction("reset_assertion_index", "RESET-ASSERTION-INDEX", 2, 0, false);
        declareFunction("clear_assertion_index", "CLEAR-ASSERTION-INDEX", 1, 0, false);
        declareMacro("destructure_assert_info", "DESTRUCTURE-ASSERT-INFO");
        declareFunction("assertion_assert_info", "ASSERTION-ASSERT-INFO", 1, 0, false);
        declareFunction("reset_assertion_assert_info", "RESET-ASSERTION-ASSERT-INFO", 2, 0, false);
        declareFunction("asserted_assertion_timestampedP", "ASSERTED-ASSERTION-TIMESTAMPED?", 1, 0, false);
        declareFunction("make_assert_info", "MAKE-ASSERT-INFO", 0, 4, false);
        declareFunction("assert_info_who", "ASSERT-INFO-WHO", 1, 0, false);
        declareFunction("assert_info_when", "ASSERT-INFO-WHEN", 1, 0, false);
        declareFunction("assert_info_why", "ASSERT-INFO-WHY", 1, 0, false);
        declareFunction("assert_info_second", "ASSERT-INFO-SECOND", 1, 0, false);
        declareFunction("set_assertion_asserted_by", "SET-ASSERTION-ASSERTED-BY", 2, 0, false);
        declareFunction("set_assertion_asserted_when", "SET-ASSERTION-ASSERTED-WHEN", 2, 0, false);
        declareFunction("set_assertion_asserted_why", "SET-ASSERTION-ASSERTED-WHY", 2, 0, false);
        declareFunction("set_assertion_asserted_second", "SET-ASSERTION-ASSERTED-SECOND", 2, 0, false);
        declareFunction("valid_assertion_robustP", "VALID-ASSERTION-ROBUST?", 1, 0, false);
        declareFunction("valid_assertion_with_contentP", "VALID-ASSERTION-WITH-CONTENT?", 1, 0, false);
        declareFunction("kb_create_assertion_kb_store", "KB-CREATE-ASSERTION-KB-STORE", 7, 0, false);
        declareFunction("kb_create_assertion_int", "KB-CREATE-ASSERTION-INT", 9, 0, false);
        declareFunction("kb_create_assertion_cyc", "KB-CREATE-ASSERTION-CYC", 1, 0, false);
        declareFunction("find_cnf_formula_data_hook", "FIND-CNF-FORMULA-DATA-HOOK", 1, 0, false);
        declareFunction("find_hl_cnf_hook", "FIND-HL-CNF-HOOK", 1, 0, false);
        declareFunction("find_gaf_formula_hook", "FIND-GAF-FORMULA-HOOK", 1, 0, false);
        declareFunction("connect_assertion", "CONNECT-ASSERTION", 2, 0, false);
        declareFunction("connect_assertion_formula_data", "CONNECT-ASSERTION-FORMULA-DATA", 2, 0, false);
        declareFunction("kb_remove_assertion_internal", "KB-REMOVE-ASSERTION-INTERNAL", 1, 0, false);
        declareFunction("reconnect_assertion", "RECONNECT-ASSERTION", 2, 0, false);
        declareFunction("disconnect_assertion", "DISCONNECT-ASSERTION", 1, 0, false);
        declareFunction("disconnect_assertion_formula_data", "DISCONNECT-ASSERTION-FORMULA-DATA", 1, 0, false);
        declareFunction("add_new_assertion_argument", "ADD-NEW-ASSERTION-ARGUMENT", 2, 0, false);
        declareFunction("remove_assertion_argument", "REMOVE-ASSERTION-ARGUMENT", 2, 0, false);
        declareFunction("reset_assertion_dependents", "RESET-ASSERTION-DEPENDENTS", 2, 0, false);
        declareFunction("add_assertion_dependent", "ADD-ASSERTION-DEPENDENT", 2, 0, false);
        declareFunction("remove_assertion_dependent", "REMOVE-ASSERTION-DEPENDENT", 2, 0, false);
        declareFunction("assertion_dependencies", "ASSERTION-DEPENDENCIES", 1, 0, false);
        declareFunction("mark_dependent_assertion", "MARK-DEPENDENT-ASSERTION", 1, 0, false);
        declareFunction("mark_dependent_deduction", "MARK-DEPENDENT-DEDUCTION", 1, 0, false);
        declareFunction("verify_assertion_content_table", "VERIFY-ASSERTION-CONTENT-TABLE", 0, 1, false);
        declareFunction("random_assertion_internal", "RANDOM-ASSERTION-INTERNAL", 0, 1, false);
        declareFunction("random_rule_internal", "RANDOM-RULE-INTERNAL", 0, 0, false);
        declareFunction("random_gaf_internal", "RANDOM-GAF-INTERNAL", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_assertions_low_file_alt() {
        defconstant("*DTP-ASSERTION-CONTENT*", ASSERTION_CONTENT);
        deflexical("*DEFAULT-ASSERTION-FLAGS*", ZERO_INTEGER);
        defconstant("*ASSERTION-FLAGS-GAF-BYTE*", bytes.sublisp_byte(ONE_INTEGER, ZERO_INTEGER));
        defconstant("*ASSERTION-FLAGS-DIRECTION-BYTE*", bytes.sublisp_byte(TWO_INTEGER, ONE_INTEGER));
        defconstant("*ASSERTION-FLAGS-TV-BYTE*", bytes.sublisp_byte(THREE_INTEGER, THREE_INTEGER));
        deflexical("*RULE-SET*", NIL != boundp($rule_set$) ? ((SubLObject) ($rule_set$.getGlobalValue())) : NIL);
        deflexical("*PREFER-RULE-SET-OVER-FLAGS?*", NIL != boundp($prefer_rule_set_over_flagsP$) ? ((SubLObject) ($prefer_rule_set_over_flagsP$.getGlobalValue())) : NIL);
        deflexical("*ESTIMATED-ASSERTIONS-PER-RULE*", $int$60);
        defparameter("*DEPENDENT-DEDUCTION-TABLE*", NIL);
        defparameter("*DEPENDENT-ASSERTION-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject init_assertions_low_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-ASSERTION-CONTENT*", ASSERTION_CONTENT);
            deflexical("*DEFAULT-ASSERTION-FLAGS*", ZERO_INTEGER);
            defconstant("*ASSERTION-FLAGS-GAF-BYTE*", bytes.sublisp_byte(ONE_INTEGER, ZERO_INTEGER));
            defconstant("*ASSERTION-FLAGS-DIRECTION-BYTE*", bytes.sublisp_byte(TWO_INTEGER, ONE_INTEGER));
            defconstant("*ASSERTION-FLAGS-TV-BYTE*", bytes.sublisp_byte(THREE_INTEGER, THREE_INTEGER));
            deflexical("*RULE-SET*", NIL != boundp($rule_set$) ? $rule_set$.getGlobalValue() : NIL);
            deflexical("*PREFER-RULE-SET-OVER-FLAGS?*", NIL != boundp($prefer_rule_set_over_flagsP$) ? $prefer_rule_set_over_flagsP$.getGlobalValue() : T);
            deflexical("*ESTIMATED-ASSERTIONS-PER-RULE*", $int$60);
            deflexical("*NON-TRUE-ASSERTION-TV-CACHE*", NIL != boundp($non_true_assertion_tv_cache$) ? $non_true_assertion_tv_cache$.getGlobalValue() : NIL);
            deflexical("*PREFER-NON-TRUE-SET-OVER-FLAGS?*", NIL != boundp($prefer_non_true_set_over_flagsP$) ? $prefer_non_true_set_over_flagsP$.getGlobalValue() : T);
            deflexical("*ESTIMATED-ASSERTIONS-PER-NON-TRUE*", $int$1983);
            defparameter("*DEPENDENT-DEDUCTION-TABLE*", NIL);
            defparameter("*DEPENDENT-ASSERTION-TABLE*", NIL);
            $append_stack_traces_to_error_messagesP$.setValue(T);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RULE-SET*", NIL != boundp($rule_set$) ? ((SubLObject) ($rule_set$.getGlobalValue())) : NIL);
            deflexical("*PREFER-RULE-SET-OVER-FLAGS?*", NIL != boundp($prefer_rule_set_over_flagsP$) ? ((SubLObject) ($prefer_rule_set_over_flagsP$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_assertions_low_file_Previous() {
        defconstant("*DTP-ASSERTION-CONTENT*", ASSERTION_CONTENT);
        deflexical("*DEFAULT-ASSERTION-FLAGS*", ZERO_INTEGER);
        defconstant("*ASSERTION-FLAGS-GAF-BYTE*", bytes.sublisp_byte(ONE_INTEGER, ZERO_INTEGER));
        defconstant("*ASSERTION-FLAGS-DIRECTION-BYTE*", bytes.sublisp_byte(TWO_INTEGER, ONE_INTEGER));
        defconstant("*ASSERTION-FLAGS-TV-BYTE*", bytes.sublisp_byte(THREE_INTEGER, THREE_INTEGER));
        deflexical("*RULE-SET*", NIL != boundp($rule_set$) ? $rule_set$.getGlobalValue() : NIL);
        deflexical("*PREFER-RULE-SET-OVER-FLAGS?*", NIL != boundp($prefer_rule_set_over_flagsP$) ? $prefer_rule_set_over_flagsP$.getGlobalValue() : T);
        deflexical("*ESTIMATED-ASSERTIONS-PER-RULE*", $int$60);
        deflexical("*NON-TRUE-ASSERTION-TV-CACHE*", NIL != boundp($non_true_assertion_tv_cache$) ? $non_true_assertion_tv_cache$.getGlobalValue() : NIL);
        deflexical("*PREFER-NON-TRUE-SET-OVER-FLAGS?*", NIL != boundp($prefer_non_true_set_over_flagsP$) ? $prefer_non_true_set_over_flagsP$.getGlobalValue() : T);
        deflexical("*ESTIMATED-ASSERTIONS-PER-NON-TRUE*", $int$1983);
        defparameter("*DEPENDENT-DEDUCTION-TABLE*", NIL);
        defparameter("*DEPENDENT-ASSERTION-TABLE*", NIL);
        $append_stack_traces_to_error_messagesP$.setValue(T);
        return NIL;
    }

    public static final SubLObject setup_assertions_low_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_assertion_content$.getGlobalValue(), symbol_function(ASSERTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(AS_CONTENT_FORMULA_DATA, _CSETF_AS_CONTENT_FORMULA_DATA);
        def_csetf(AS_CONTENT_MT, _CSETF_AS_CONTENT_MT);
        def_csetf(AS_CONTENT_FLAGS, _CSETF_AS_CONTENT_FLAGS);
        def_csetf(AS_CONTENT_ARGUMENTS, _CSETF_AS_CONTENT_ARGUMENTS);
        def_csetf(AS_CONTENT_PLIST, _CSETF_AS_CONTENT_PLIST);
        identity(ASSERTION_CONTENT);
        declare_defglobal($rule_set$);
        declare_defglobal($prefer_rule_set_over_flagsP$);
        register_macro_helper(KB_RULE_SET, DO_RULES);
        return NIL;
    }

    public static SubLObject setup_assertions_low_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_assertion_content$.getGlobalValue(), symbol_function(ASSERTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list9);
            def_csetf(AS_CONTENT_FORMULA_DATA, _CSETF_AS_CONTENT_FORMULA_DATA);
            def_csetf(AS_CONTENT_MT, _CSETF_AS_CONTENT_MT);
            def_csetf(AS_CONTENT_FLAGS, _CSETF_AS_CONTENT_FLAGS);
            def_csetf(AS_CONTENT_ARGUMENTS, _CSETF_AS_CONTENT_ARGUMENTS);
            def_csetf(AS_CONTENT_PLIST, _CSETF_AS_CONTENT_PLIST);
            identity(ASSERTION_CONTENT);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_assertion_content$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ASSERTION_CONTENT_METHOD));
            declare_defglobal($rule_set$);
            declare_defglobal($prefer_rule_set_over_flagsP$);
            declare_defglobal($non_true_assertion_tv_cache$);
            declare_defglobal($prefer_non_true_set_over_flagsP$);
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($prefer_rule_set_over_flagsP$);
            register_macro_helper(KB_RULE_SET, DO_RULES);
        }
        return NIL;
    }

    public static SubLObject setup_assertions_low_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_assertion_content$.getGlobalValue(), symbol_function(ASSERTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(AS_CONTENT_FORMULA_DATA, _CSETF_AS_CONTENT_FORMULA_DATA);
        def_csetf(AS_CONTENT_MT, _CSETF_AS_CONTENT_MT);
        def_csetf(AS_CONTENT_FLAGS, _CSETF_AS_CONTENT_FLAGS);
        def_csetf(AS_CONTENT_ARGUMENTS, _CSETF_AS_CONTENT_ARGUMENTS);
        def_csetf(AS_CONTENT_PLIST, _CSETF_AS_CONTENT_PLIST);
        identity(ASSERTION_CONTENT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_assertion_content$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ASSERTION_CONTENT_METHOD));
        declare_defglobal($rule_set$);
        declare_defglobal($prefer_rule_set_over_flagsP$);
        declare_defglobal($non_true_assertion_tv_cache$);
        declare_defglobal($prefer_non_true_set_over_flagsP$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_assertions_low_file();
    }

    @Override
    public void initializeVariables() {
        init_assertions_low_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_assertions_low_file();
    }

    

    public static final class $assertion_content_native extends SubLStructNative implements SubLStruct {
        public static SubLStructDecl structDecl;

        static {
            // 
            // 
            if (false)
                structDecl = SubLStructDecl.makeStructDeclInterpreted(new String[]{ "$formula_data", "$mt", "$flags", "$arguments", "$plist" }, ASSERTION_CONTENT, "AS-CONTENT", "_CSETF-");
            else
                structDecl = SubLStructDeclNative.makeStructDeclNative(com.cyc.cycjava.cycl.assertions_low.$assertion_content_native.class, ASSERTION_CONTENT, "AS-CONTENT", "_CSETF-");

            // structDecl.setTrackStructInstance(true, -1);
        }

        public SubLObject $formula_data;

        public SubLObject $mt;

        public SubLObject $flags;

        public SubLObject $arguments;

        public SubLObject $plist;

        public $assertion_content_native() {
            assertions_low.$assertion_content_native.this.$formula_data = Lisp.NIL;
            assertions_low.$assertion_content_native.this.$mt = Lisp.NIL;
            assertions_low.$assertion_content_native.this.$flags = Lisp.NIL;
            assertions_low.$assertion_content_native.this.$arguments = Lisp.NIL;
            assertions_low.$assertion_content_native.this.$plist = Lisp.NIL;
            assertions_low.$assertion_content_native.this.layout = structDecl;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return assertions_low.$assertion_content_native.this.$formula_data;
        }

        @Override
        public SubLObject getField3() {
            return assertions_low.$assertion_content_native.this.$mt;
        }

        @Override
        public SubLObject getField4() {
            return assertions_low.$assertion_content_native.this.$flags;
        }

        @Override
        public SubLObject getField5() {
            return assertions_low.$assertion_content_native.this.$arguments;
        }

        @Override
        public SubLObject getField6() {
            return assertions_low.$assertion_content_native.this.$plist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return assertions_low.$assertion_content_native.this.$formula_data = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return assertions_low.$assertion_content_native.this.$mt = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return assertions_low.$assertion_content_native.this.$flags = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return assertions_low.$assertion_content_native.this.$arguments = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return assertions_low.$assertion_content_native.this.$plist = value;
        }

        @Override
        public String toString() {
            try {
                return princ_to_string(assertions_low.$assertion_content_native.this).getStringValue();
            } catch (final Exception e) {
                return super.princToString();
                // "#<" + toTypeName() + " " + getName() + " @ " +
                // System.identityHashCode(this) + ">";
            }
        }
    }
}

