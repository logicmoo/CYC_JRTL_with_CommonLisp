/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.hash_table_utilities.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class iteration extends SubLTranslatedFile implements V12 {
    public static final SubLObject cons_to_tuple(SubLObject cons) {
        {
            SubLObject datum = cons;
            SubLObject current = datum;
            SubLObject car = NIL;
            SubLObject cdr = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt80);
            car = current.first();
            current = current.rest();
            cdr = current;
            return list(car, cdr);
        }
    }

    static private final SubLString $str_alt114$ = makeString("");

    // Definitions
    public static final class $iterator_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.iteration.$iterator_native.this.$state;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.iteration.$iterator_native.this.$done;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.iteration.$iterator_native.this.$next;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.iteration.$iterator_native.this.$finalize;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.iteration.$iterator_native.this.$state = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.iteration.$iterator_native.this.$done = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.iteration.$iterator_native.this.$next = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.iteration.$iterator_native.this.$finalize = value;
        }

        public SubLObject $state = Lisp.NIL;

        public SubLObject $done = Lisp.NIL;

        public SubLObject $next = Lisp.NIL;

        public SubLObject $finalize = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.iteration.$iterator_native.class, ITERATOR, ITERATOR_P, $list_alt2, $list_alt3, new String[]{ "$state", "$done", "$next", "$finalize" }, $list_alt4, $list_alt5, PRINT_ITERATOR);
    }

    public static final SubLFile me = new iteration();

 public static final String myName = "com.cyc.cycjava.cycl.iteration";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_iterator$ = makeSymbol("*DTP-ITERATOR*");

    // defparameter
    // used to suppress initializing the lazy iterator while merely printing it
    /**
     * used to suppress initializing the lazy iterator while merely printing it
     */
    @LispMethod(comment = "used to suppress initializing the lazy iterator while merely printing it\ndefparameter")
    private static final SubLSymbol $within_print_iterator$ = makeSymbol("*WITHIN-PRINT-ITERATOR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $xform_fn_param_do_not_pass$ = makeSymbol("*XFORM-FN-PARAM-DO-NOT-PASS*");

    private static final SubLSymbol ITERATOR_P = makeSymbol("ITERATOR-P");

    static private final SubLList $list2 = list(makeSymbol("STATE"), makeSymbol("DONE"), makeSymbol("NEXT"), makeSymbol("FINALIZE"));

    static private final SubLList $list3 = list(makeKeyword("STATE"), $DONE, $NEXT, makeKeyword("FINALIZE"));

    static private final SubLList $list4 = list(makeSymbol("IT-STATE"), makeSymbol("IT-DONE"), makeSymbol("IT-NEXT"), makeSymbol("IT-FINALIZE"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-IT-STATE"), makeSymbol("_CSETF-IT-DONE"), makeSymbol("_CSETF-IT-NEXT"), makeSymbol("_CSETF-IT-FINALIZE"));

    private static final SubLSymbol PRINT_ITERATOR = makeSymbol("PRINT-ITERATOR");

    private static final SubLSymbol ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ITERATOR-P"));

    private static final SubLSymbol IT_STATE = makeSymbol("IT-STATE");

    private static final SubLSymbol _CSETF_IT_STATE = makeSymbol("_CSETF-IT-STATE");

    private static final SubLSymbol IT_DONE = makeSymbol("IT-DONE");

    private static final SubLSymbol _CSETF_IT_DONE = makeSymbol("_CSETF-IT-DONE");

    private static final SubLSymbol IT_NEXT = makeSymbol("IT-NEXT");

    private static final SubLSymbol _CSETF_IT_NEXT = makeSymbol("_CSETF-IT-NEXT");

    private static final SubLSymbol IT_FINALIZE = makeSymbol("IT-FINALIZE");

    private static final SubLSymbol _CSETF_IT_FINALIZE = makeSymbol("_CSETF-IT-FINALIZE");

    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_ITERATOR = makeSymbol("MAKE-ITERATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ITERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITERATOR-METHOD");

    private static final SubLString $$$_DONE_ = makeString(" DONE ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol HL_STORE_ITERATOR_NEXT = makeSymbol("HL-STORE-ITERATOR-NEXT");

    private static final SubLSymbol FILTER_ITERATOR_NEXT = makeSymbol("FILTER-ITERATOR-NEXT");

    private static final SubLSymbol FILTER_ITERATOR_WITHOUT_VALUES_NEXT = makeSymbol("FILTER-ITERATOR-WITHOUT-VALUES-NEXT");

    private static final SubLSymbol ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER = makeSymbol("ITERATION-NEXT-WITHOUT-VALUES-MACRO-HELPER");

    private static final SubLSymbol DO_ITERATOR_WITHOUT_VALUES_INTERNAL = makeSymbol("DO-ITERATOR-WITHOUT-VALUES-INTERNAL");

    private static final SubLString $str35$_NEXT = makeString("-NEXT");

    private static final SubLList $list36 = list(list(makeSymbol("VAR"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list37 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym39$ITERATOR_VAR = makeUninternedSymbol("ITERATOR-VAR");

    private static final SubLSymbol $sym42$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    private static final SubLSymbol $sym43$VALID = makeUninternedSymbol("VALID");

    private static final SubLSymbol ITERATION_NEXT = makeSymbol("ITERATION-NEXT");

    static private final SubLList $list51 = list(list(makeSymbol("VAR"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("INVALID-TOKEN"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list52 = list(makeKeyword("INVALID-TOKEN"), $DONE, makeKeyword("PROGRESS-MESSAGE"));

    private static final SubLSymbol NOTING_PROGRESS = makeSymbol("NOTING-PROGRESS");

    static private final SubLList $list56 = list(makeSymbol("NOTE-PROGRESS"));

    private static final SubLList $list57 = list(list(makeSymbol("VAR"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("INVALID-TOKEN"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list58 = list(makeKeyword("INVALID-TOKEN"), $DONE);

    static private final SubLList $list59 = list(new SubLObject[]{ makeSymbol("DO-ITERATOR-WITHOUT-VALUES"), makeSymbol("DO-FINAL-INDEX-FROM-SPEC"), makeSymbol("DO-ITERATOR-WITHOUT-VALUES-PROGRESS"), makeSymbol("DO-GAF-ARG-INDEX"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"), makeSymbol("DO-NART-ARG-INDEX"), makeSymbol("DO-FUNCTION-EXTENT-INDEX"), makeSymbol("DO-PREDICATE-RULE-INDEX"), makeSymbol("DO-ISA-RULE-INDEX"), makeSymbol("DO-QUOTED-ISA-RULE-INDEX"), makeSymbol("DO-GENLS-RULE-INDEX"), makeSymbol("DO-GENL-MT-RULE-INDEX"), makeSymbol("DO-EXCEPTION-RULE-INDEX"), makeSymbol("DO-PRAGMA-RULE-INDEX"), makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX"), makeSymbol("DO-MT-INDEX"), makeSymbol("DO-OTHER-INDEX"), makeSymbol("DO-TERM-INDEX") });

    private static final SubLSymbol $sym60$ITERATOR_VAR = makeUninternedSymbol("ITERATOR-VAR");

    private static final SubLSymbol $sym61$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    private static final SubLSymbol $sym62$TOKEN_VAR = makeUninternedSymbol("TOKEN-VAR");

    private static final SubLSymbol $sym63$VALID = makeUninternedSymbol("VALID");

    private static final SubLList $list64 = list(list(makeSymbol("VAR"), makeSymbol("N"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym65$COUNT = makeUninternedSymbol("COUNT");

    private static final SubLSymbol $sym66$NEW_DONE = makeUninternedSymbol("NEW-DONE");

    private static final SubLList $list67 = list(ZERO_INTEGER);

    private static final SubLSymbol $sym68$__ = makeSymbol(">=");

    private static final SubLList $list71 = list(T);

    private static final SubLSymbol ITERATE_NON_NULL_SINGLETON_NEXT = makeSymbol("ITERATE-NON-NULL-SINGLETON-NEXT");

    private static final SubLSymbol ITERATE_NUMBER_DONE = makeSymbol("ITERATE-NUMBER-DONE");

    private static final SubLSymbol ITERATE_NUMBER_NEXT = makeSymbol("ITERATE-NUMBER-NEXT");

    private static final SubLList $list81 = list(makeSymbol("CURRENT"), makeSymbol("DELTA"), makeSymbol("END"));

    private static final SubLSymbol ITERATE_LIST_NEXT = makeSymbol("ITERATE-LIST-NEXT");

    private static final SubLSymbol ITERATE_LIST_DONE = makeSymbol("ITERATE-LIST-DONE");

    private static final SubLSymbol LIST_ITERATOR_P = makeSymbol("LIST-ITERATOR-P");

    private static final SubLSymbol ITERATE_INFERENCE_LIST_NEXT = makeSymbol("ITERATE-INFERENCE-LIST-NEXT");

    private static final SubLSymbol ITERATE_INFERENCE_LIST_DONE = makeSymbol("ITERATE-INFERENCE-LIST-DONE");

    private static final SubLSymbol INFERENCE_LIST_ITERATOR_P = makeSymbol("INFERENCE-LIST-ITERATOR-P");

    private static final SubLSymbol $sym89$EXPRESSION_HAS_INFERENCE_EXCEPTED_ASSERTION__ITERATION_HELPER = makeSymbol("EXPRESSION-HAS-INFERENCE-EXCEPTED-ASSERTION?-ITERATION-HELPER");

    private static final SubLSymbol CONS_TO_TUPLE = makeSymbol("CONS-TO-TUPLE");

    private static final SubLSymbol DEFAULT_ITERATOR_DONE_P = makeSymbol("DEFAULT-ITERATOR-DONE-P");

    private static final SubLSymbol ITERATE_VECTOR_NEXT = makeSymbol("ITERATE-VECTOR-NEXT");

    private static final SubLList $list95 = list(makeSymbol("CURRENT"), makeSymbol("VECTOR"));

    private static final SubLSymbol ITERATE_VECTOR_INDEX_NEXT = makeSymbol("ITERATE-VECTOR-INDEX-NEXT");

    private static final SubLString $str100$_S_was_not_a_sequence = makeString("~S was not a sequence");

    private static final SubLSymbol ITERATOR_HASH_TABLE_DONE = makeSymbol("ITERATOR-HASH-TABLE-DONE");

    private static final SubLSymbol ITERATOR_HASH_TABLE_NEXT = makeSymbol("ITERATOR-HASH-TABLE-NEXT");

    static private final SubLList $list106 = list(makeSymbol("CURRENT"), makeSymbol("&REST"), makeSymbol("REST"));

    private static final SubLList $list107 = list(makeSymbol("CURRENT"), makeSymbol("HASH-TABLE"), makeSymbol("KEY-VALUE-TUPLE"));

    private static final SubLList $list108 = cons(makeSymbol("NEXT-KEY"), makeSymbol("REST-KEYS"));

    private static final SubLSymbol $sym110$FILE_FORM_ITERATOR_DONE_ = makeSymbol("FILE-FORM-ITERATOR-DONE?");

    private static final SubLSymbol FILE_FORM_ITERATOR_NEXT = makeSymbol("FILE-FORM-ITERATOR-NEXT");

    private static final SubLSymbol FILE_FORM_ITERATOR_FINALIZE = makeSymbol("FILE-FORM-ITERATOR-FINALIZE");

    private static final SubLList $list115 = list(makeSymbol("STREAM"), makeSymbol("INDEX"), makeSymbol("END"), makeSymbol("DONE?"));

    static private final SubLList $list117 = list(makeSymbol("STREAM"), makeSymbol("&REST"), makeSymbol("REST"));

    private static final SubLSymbol LAZY_ITERATOR_DONE = makeSymbol("LAZY-ITERATOR-DONE");

    private static final SubLSymbol LAZY_ITERATOR_NEXT = makeSymbol("LAZY-ITERATOR-NEXT");

    private static final SubLList $list120 = list(makeSymbol("LAZY-ITERATOR"), makeSymbol("CONSTRUCTOR"), makeSymbol("ARG-FORMS"));

    private static final SubLString $str121$_A_is_not_a_well_formed_uninitial = makeString("~A is not a well formed uninitialized lazy iterator");

    private static final SubLSymbol CYC_API_EVAL = makeSymbol("CYC-API-EVAL");

    private static final SubLSymbol ITERATE_INDIRECT_FINALIZE = makeSymbol("ITERATE-INDIRECT-FINALIZE");

    private static final SubLSymbol ITERATE_INDIRECT_NEXT = makeSymbol("ITERATE-INDIRECT-NEXT");

    private static final SubLList $list126 = list(makeSymbol("CURRENT"), makeSymbol("TRANSFORM"));

    private static final SubLSymbol ITERATE_FACTORY_FINALIZE = makeSymbol("ITERATE-FACTORY-FINALIZE");

    private static final SubLSymbol ITERATE_FACTORY_NEXT = makeSymbol("ITERATE-FACTORY-NEXT");

    private static final SubLList $list130 = list(makeSymbol("CURRENT"), makeSymbol("MODE"), makeSymbol("CONSTRUCTORS"), makeSymbol("DATA"));

    private static final SubLList $list132 = cons(makeSymbol("NEXT-CONSTRUCTOR"), makeSymbol("REST-CONSTRUCTORS"));

    private static final SubLSymbol META_ITERATOR_ITERATOR_DONE = makeSymbol("META-ITERATOR-ITERATOR-DONE");

    private static final SubLSymbol META_ITERATOR_ITERATOR_NEXT = makeSymbol("META-ITERATOR-ITERATOR-NEXT");

    private static final SubLSymbol META_ITERATOR_ITERATOR_FINALIZE = makeSymbol("META-ITERATOR-ITERATOR-FINALIZE");

    static private final SubLList $list138 = list(makeSymbol("OBJECT-ITERATOR"), makeSymbol("META-ITERATOR"));

    private static final SubLSymbol ITERATOR_ITERATOR_DONE = makeSymbol("ITERATOR-ITERATOR-DONE");

    private static final SubLSymbol ITERATOR_ITERATOR_NEXT = makeSymbol("ITERATOR-ITERATOR-NEXT");

    private static final SubLSymbol ITERATOR_ITERATOR_FINALIZE = makeSymbol("ITERATOR-ITERATOR-FINALIZE");

    private static final SubLSymbol ROTATING_ITERATOR_ITERATOR_DONE = makeSymbol("ROTATING-ITERATOR-ITERATOR-DONE");

    private static final SubLSymbol ROTATING_ITERATOR_ITERATOR_NEXT = makeSymbol("ROTATING-ITERATOR-ITERATOR-NEXT");

    private static final SubLSymbol ROTATING_ITERATOR_ITERATOR_FINALIZE = makeSymbol("ROTATING-ITERATOR-ITERATOR-FINALIZE");

    private static final SubLString $str145$ = makeString("");

    private static final SubLString $str146$invalid_lazy_iterator_found_in_me = makeString("invalid lazy iterator found in meta-iterator ~A ~A");

    private static final SubLString $str147$in_make_rotating_iterator_iterato = makeString("in make-rotating-iterator-iterator-state");

    private static final SubLList $list148 = list(makeSymbol("INDEX"), makeSymbol("ITERATORS"));

    private static final SubLSymbol REUSABLE_ITERATOR_DONE = makeSymbol("REUSABLE-ITERATOR-DONE");

    private static final SubLSymbol REUSABLE_ITERATOR_NEXT = makeSymbol("REUSABLE-ITERATOR-NEXT");

    private static final SubLSymbol REUSABLE_ITERATOR_FINALIZE = makeSymbol("REUSABLE-ITERATOR-FINALIZE");

    private static final SubLList $list153 = list(makeSymbol("REAL-STATE"), makeSymbol("QUEUE"), makeSymbol("MODE"), makeSymbol("DONE"), makeSymbol("NEXT"), makeSymbol("FINALIZE"));

    private static final SubLString $str155$Unknown_mode___a_ = makeString("Unknown mode: ~a.");

    private static final SubLSymbol REUSABLE_ITERATOR_FROM_ITERATOR_DONE = makeSymbol("REUSABLE-ITERATOR-FROM-ITERATOR-DONE");

    private static final SubLSymbol REUSABLE_ITERATOR_FROM_ITERATOR_NEXT = makeSymbol("REUSABLE-ITERATOR-FROM-ITERATOR-NEXT");

    private static final SubLSymbol REUSABLE_ITERATOR_FROM_ITERATOR_FINALIZE = makeSymbol("REUSABLE-ITERATOR-FROM-ITERATOR-FINALIZE");

    private static final SubLList $list159 = list(list(makeSymbol("VAR"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("RESET"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list160 = list($DONE, makeKeyword("RESET"));

    private static final SubLSymbol RESET_REUSABLE_ITERATOR = makeSymbol("RESET-REUSABLE-ITERATOR");

    private static final SubLSymbol REUSABLE_ITERATOR_CARTESIAN_ITERATOR_DONE = makeSymbol("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE");

    private static final SubLSymbol REUSABLE_ITERATOR_CARTESIAN_ITERATOR_NEXT = makeSymbol("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT");

    private static final SubLSymbol REUSABLE_ITERATOR_CARTESIAN_ITERATOR_FINALIZE = makeSymbol("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-FINALIZE");

    private static final SubLList $list166 = list(makeSymbol("REVERSE-ITERATORS"), makeSymbol("REVERSE-RESULT"));

    private static final SubLSymbol FILTER_ITERATOR_FINALIZE = makeSymbol("FILTER-ITERATOR-FINALIZE");

    private static final SubLSymbol FILTER_AND_TRANSFORM_ITERATOR_NEXT = makeSymbol("FILTER-AND-TRANSFORM-ITERATOR-NEXT");

    private static final SubLList $list169 = list(makeSymbol("CURRENT"), makeSymbol("FILTER-METHOD"), makeSymbol("FILTER-ARGS"));

    private static final SubLList $list170 = list(makeSymbol("CURRENT"), makeSymbol("FILTER-METHOD"), makeSymbol("FILTER-ARGS"), makeSymbol("INVALID-TOKEN"));

    private static final SubLString $$$YOU_SHALL_NOT_PASS = makeString("YOU SHALL NOT PASS");

    private static final SubLSymbol XFORM_ITERATOR_DONE = makeSymbol("XFORM-ITERATOR-DONE");

    private static final SubLSymbol XFORM_ITERATOR_NEXT = makeSymbol("XFORM-ITERATOR-NEXT");

    private static final SubLSymbol XFORM_ITERATOR_FINALIZE = makeSymbol("XFORM-ITERATOR-FINALIZE");

    private static final SubLList $list175 = list(makeSymbol("ITERATOR"), makeSymbol("XFORM-FN"), makeSymbol("PARAM"));

    private static final SubLSymbol ITERATE_XML_TOKEN_NEXT = makeSymbol("ITERATE-XML-TOKEN-NEXT");

    private static final SubLSymbol XML_TOKEN_ITERATOR_P = makeSymbol("XML-TOKEN-ITERATOR-P");

    static final boolean assertionsDisabledSynth = true;

    public static final SubLObject iterator_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_iterator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_iterator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject iterator_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.iteration.$iterator_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject iterator_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.iteration.$iterator_native.class ? T : NIL;
    }

    public static final SubLObject it_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITERATOR_P);
        return v_object.getField2();
    }

    public static SubLObject it_state(final SubLObject v_object) {
        assert NIL != iterator_p(v_object) : "! iteration.iterator_p(v_object) " + "iteration.iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject it_done_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITERATOR_P);
        return v_object.getField3();
    }

    public static SubLObject it_done(final SubLObject v_object) {
        assert NIL != iterator_p(v_object) : "! iteration.iterator_p(v_object) " + "iteration.iterator_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject it_next_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITERATOR_P);
        return v_object.getField4();
    }

    public static SubLObject it_next(final SubLObject v_object) {
        assert NIL != iterator_p(v_object) : "! iteration.iterator_p(v_object) " + "iteration.iterator_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject it_finalize_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITERATOR_P);
        return v_object.getField5();
    }

    public static SubLObject it_finalize(final SubLObject v_object) {
        assert NIL != iterator_p(v_object) : "! iteration.iterator_p(v_object) " + "iteration.iterator_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_it_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITERATOR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_it_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterator_p(v_object) : "! iteration.iterator_p(v_object) " + "iteration.iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_it_done_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITERATOR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_it_done(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterator_p(v_object) : "! iteration.iterator_p(v_object) " + "iteration.iterator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_it_next_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITERATOR_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_it_next(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterator_p(v_object) : "! iteration.iterator_p(v_object) " + "iteration.iterator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_it_finalize_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITERATOR_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_it_finalize(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterator_p(v_object) : "! iteration.iterator_p(v_object) " + "iteration.iterator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_iterator_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.iteration.$iterator_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($STATE)) {
                        _csetf_it_state(v_new, current_value);
                    } else {
                        if (pcase_var.eql($DONE)) {
                            _csetf_it_done(v_new, current_value);
                        } else {
                            if (pcase_var.eql($NEXT)) {
                                _csetf_it_next(v_new, current_value);
                            } else {
                                if (pcase_var.eql($FINALIZE)) {
                                    _csetf_it_finalize(v_new, current_value);
                                } else {
                                    Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.iteration.$iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STATE)) {
                _csetf_it_state(v_new, current_value);
            } else
                if (pcase_var.eql($DONE)) {
                    _csetf_it_done(v_new, current_value);
                } else
                    if (pcase_var.eql($NEXT)) {
                        _csetf_it_next(v_new, current_value);
                    } else
                        if (pcase_var.eql($FINALIZE)) {
                            _csetf_it_finalize(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ITERATOR, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STATE, it_state(obj));
        funcall(visitor_fn, obj, $SLOT, $DONE, it_done(obj));
        funcall(visitor_fn, obj, $SLOT, $NEXT, it_next(obj));
        funcall(visitor_fn, obj, $SLOT, $FINALIZE, it_finalize(obj));
        funcall(visitor_fn, obj, $END, MAKE_ITERATOR, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_iterator(obj, visitor_fn);
    }

    public static final SubLObject print_iterator_alt(SubLObject iterator, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(iterator, stream);
            } else {
                {
                    SubLObject v_object = iterator;
                    SubLObject stream_1 = stream;
                    write_string($str_alt21$__, stream_1, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_1 });
                    write_char(CHAR_space, stream_1);
                    {
                        SubLObject _prev_bind_0 = $within_print_iterator$.currentBinding(thread);
                        try {
                            $within_print_iterator$.bind(T, thread);
                            if (((NIL != it_done(iterator)) && (NIL == lazy_iterator_uninitializedP(iterator))) && (NIL != iteration_done(iterator))) {
                                write_string($str_alt23$_DONE_, stream, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            $within_print_iterator$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != it_next(iterator)) {
                        write_string(iterator_type_name(iterator), stream, UNPROVIDED, UNPROVIDED);
                        write_string($str_alt24$_, stream, UNPROVIDED, UNPROVIDED);
                    }
                    write_char(CHAR_space, stream_1);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_1, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_1);
                }
            }
            return iterator;
        }
    }

    public static SubLObject print_iterator(final SubLObject iterator, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(iterator, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, iterator, T, T);
            final SubLObject _prev_bind_0 = $within_print_iterator$.currentBinding(thread);
            try {
                $within_print_iterator$.bind(T, thread);
                if (((NIL != it_done(iterator)) && (NIL == lazy_iterator_uninitializedP(iterator))) && (NIL != iteration_done(iterator))) {
                    write_string($$$_DONE_, stream, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                $within_print_iterator$.rebind(_prev_bind_0, thread);
            }
            if (NIL != it_next(iterator)) {
                write_string(iterator_type_name(iterator), stream, UNPROVIDED, UNPROVIDED);
                write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            }
            print_macros.print_unreadable_object_postamble(stream, iterator, T, T);
        }
        return iterator;
    }

    /**
     * Return a new iterator for incrementally iterating over objects in STATE.
     *
     * STATE is a datastructure which is the initial state of the iteration.
     *
     * DONE must be a unary function which when called on STATE returns non-nil
     * iff the iteration is complete.
     *
     * NEXT must be a unary function which when called on STATE returns three values :
     * [1] The next raw iteration item from the state
     * [2] The resulting updated state
     * [3] A non-nil value if the iteration halted prematurely (and we are thus done)
     *
     * FINALIZE is a unary function which is applied to STATE when the iterator is
     * destroyed.  While it is not strictly necessary, by convention the output should
     * be non-NIL if and only if the finalization was successful.  NB: this function
     * should be robust about finalizing an already-finalized iterator.
     */
    @LispMethod(comment = "Return a new iterator for incrementally iterating over objects in STATE.\r\n\r\nSTATE is a datastructure which is the initial state of the iteration.\r\n\r\nDONE must be a unary function which when called on STATE returns non-nil\r\niff the iteration is complete.\r\n\r\nNEXT must be a unary function which when called on STATE returns three values :\r\n[1] The next raw iteration item from the state\r\n[2] The resulting updated state\r\n[3] A non-nil value if the iteration halted prematurely (and we are thus done)\r\n\r\nFINALIZE is a unary function which is applied to STATE when the iterator is\r\ndestroyed.  While it is not strictly necessary, by convention the output should\r\nbe non-NIL if and only if the finalization was successful.  NB: this function\r\nshould be robust about finalizing an already-finalized iterator.\nReturn a new iterator for incrementally iterating over objects in STATE.\n\nSTATE is a datastructure which is the initial state of the iteration.\n\nDONE must be a unary function which when called on STATE returns non-nil\niff the iteration is complete.\n\nNEXT must be a unary function which when called on STATE returns three values :\n[1] The next raw iteration item from the state\n[2] The resulting updated state\n[3] A non-nil value if the iteration halted prematurely (and we are thus done)\n\nFINALIZE is a unary function which is applied to STATE when the iterator is\ndestroyed.  While it is not strictly necessary, by convention the output should\nbe non-NIL if and only if the finalization was successful.  NB: this function\nshould be robust about finalizing an already-finalized iterator.")
    public static final SubLObject new_iterator_alt(SubLObject state, SubLObject done, SubLObject next, SubLObject finalize) {
        if (finalize == UNPROVIDED) {
            finalize = symbol_function(TRUE);
        }
        {
            SubLObject iterator = make_iterator(UNPROVIDED);
            _csetf_it_state(iterator, state);
            _csetf_it_done(iterator, done);
            _csetf_it_next(iterator, next);
            _csetf_it_finalize(iterator, finalize);
            return iterator;
        }
    }

    /**
     * Return a new iterator for incrementally iterating over objects in STATE.
     *
     * STATE is a datastructure which is the initial state of the iteration.
     *
     * DONE must be a unary function which when called on STATE returns non-nil
     * iff the iteration is complete.
     *
     * NEXT must be a unary function which when called on STATE returns three values :
     * [1] The next raw iteration item from the state
     * [2] The resulting updated state
     * [3] A non-nil value if the iteration halted prematurely (and we are thus done)
     *
     * FINALIZE is a unary function which is applied to STATE when the iterator is
     * destroyed.  While it is not strictly necessary, by convention the output should
     * be non-NIL if and only if the finalization was successful.  NB: this function
     * should be robust about finalizing an already-finalized iterator.
     */
    @LispMethod(comment = "Return a new iterator for incrementally iterating over objects in STATE.\r\n\r\nSTATE is a datastructure which is the initial state of the iteration.\r\n\r\nDONE must be a unary function which when called on STATE returns non-nil\r\niff the iteration is complete.\r\n\r\nNEXT must be a unary function which when called on STATE returns three values :\r\n[1] The next raw iteration item from the state\r\n[2] The resulting updated state\r\n[3] A non-nil value if the iteration halted prematurely (and we are thus done)\r\n\r\nFINALIZE is a unary function which is applied to STATE when the iterator is\r\ndestroyed.  While it is not strictly necessary, by convention the output should\r\nbe non-NIL if and only if the finalization was successful.  NB: this function\r\nshould be robust about finalizing an already-finalized iterator.\nReturn a new iterator for incrementally iterating over objects in STATE.\n\nSTATE is a datastructure which is the initial state of the iteration.\n\nDONE must be a unary function which when called on STATE returns non-nil\niff the iteration is complete.\n\nNEXT must be a unary function which when called on STATE returns three values :\n[1] The next raw iteration item from the state\n[2] The resulting updated state\n[3] A non-nil value if the iteration halted prematurely (and we are thus done)\n\nFINALIZE is a unary function which is applied to STATE when the iterator is\ndestroyed.  While it is not strictly necessary, by convention the output should\nbe non-NIL if and only if the finalization was successful.  NB: this function\nshould be robust about finalizing an already-finalized iterator.")
    public static SubLObject new_iterator(final SubLObject state, final SubLObject done, final SubLObject next, SubLObject finalize) {
        if (finalize == UNPROVIDED) {
            finalize = symbol_function(TRUE);
        }
        final SubLObject iterator = make_iterator(UNPROVIDED);
        _csetf_it_state(iterator, state);
        _csetf_it_done(iterator, done);
        _csetf_it_next(iterator, next);
        _csetf_it_finalize(iterator, finalize);
        return iterator;
    }

    /**
     * Return NIL iff ITERATOR has not yet been exhausted.
     */
    @LispMethod(comment = "Return NIL iff ITERATOR has not yet been exhausted.")
    public static final SubLObject iteration_done_alt(SubLObject iterator) {
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        return funcall(it_done(iterator), it_state(iterator));
    }

    /**
     * Return NIL iff ITERATOR has not yet been exhausted.
     */
    @LispMethod(comment = "Return NIL iff ITERATOR has not yet been exhausted.")
    public static SubLObject iteration_done(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        return funcall(it_done(iterator), it_state(iterator));
    }

    public static final SubLObject iteration_next_funcall_alt(SubLObject next_func, SubLObject next_state) {
        {
            SubLObject pcase_var = next_func;
            if (pcase_var.eql(HL_STORE_ITERATOR_NEXT)) {
                return hl_interface_infrastructure.hl_store_iterator_next(next_state);
            } else {
                if (pcase_var.eql(FILTER_ITERATOR_NEXT)) {
                    return filter_iterator_next(next_state);
                } else {
                    if (pcase_var.eql(FILTER_ITERATOR_WITHOUT_VALUES_NEXT)) {
                        return filter_iterator_without_values_next(next_state);
                    } else {
                        return funcall(next_func, next_state);
                    }
                }
            }
        }
    }

    public static SubLObject iteration_next_funcall(final SubLObject next_func, final SubLObject next_state) {
        if (next_func.eql(HL_STORE_ITERATOR_NEXT)) {
            return hl_interface_infrastructure.hl_store_iterator_next(next_state);
        }
        if (next_func.eql(FILTER_ITERATOR_NEXT)) {
            return filter_iterator_next(next_state);
        }
        if (next_func.eql(FILTER_ITERATOR_WITHOUT_VALUES_NEXT)) {
            return filter_iterator_without_values_next(next_state);
        }
        return funcall(next_func, next_state);
    }

    /**
     * Return the next item in the iteration of ITERATOR.
     * The second value returned is non-nil iff the value returned is valid.
     */
    @LispMethod(comment = "Return the next item in the iteration of ITERATOR.\r\nThe second value returned is non-nil iff the value returned is valid.\nReturn the next item in the iteration of ITERATOR.\nThe second value returned is non-nil iff the value returned is valid.")
    public static final SubLObject iteration_next_alt(SubLObject iterator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(iterator, ITERATOR_P);
            {
                SubLObject quitP = funcall(it_done(iterator), it_state(iterator));
                SubLObject next_state = it_state(iterator);
                SubLObject next_item = NIL;
                SubLObject validP = NIL;
                if (NIL == quitP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject raw_item = iteration_next_funcall(it_next(iterator), next_state);
                        SubLObject raw_state = thread.secondMultipleValue();
                        SubLObject halted_prematurely = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        next_state = raw_state;
                        if (NIL == halted_prematurely) {
                            next_item = raw_item;
                            validP = T;
                        }
                    }
                }
                if (next_state != it_state(iterator)) {
                    _csetf_it_state(iterator, next_state);
                }
                return values(next_item, validP);
            }
        }
    }

    /**
     * Return the next item in the iteration of ITERATOR.
     * The second value returned is non-nil iff the value returned is valid.
     */
    @LispMethod(comment = "Return the next item in the iteration of ITERATOR.\r\nThe second value returned is non-nil iff the value returned is valid.\nReturn the next item in the iteration of ITERATOR.\nThe second value returned is non-nil iff the value returned is valid.")
    public static SubLObject iteration_next(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        final SubLObject quitP = funcall(it_done(iterator), it_state(iterator));
        SubLObject next_state = it_state(iterator);
        SubLObject next_item = NIL;
        SubLObject validP = NIL;
        if (NIL == quitP) {
            thread.resetMultipleValues();
            final SubLObject raw_item = iteration_next_funcall(it_next(iterator), next_state);
            final SubLObject raw_state = thread.secondMultipleValue();
            final SubLObject halted_prematurely = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            next_state = raw_state;
            if (NIL == halted_prematurely) {
                next_item = raw_item;
                validP = T;
            }
        }
        if (!next_state.eql(it_state(iterator))) {
            _csetf_it_state(iterator, next_state);
        }
        return subl_promotions.values2(next_item, validP);
    }

    /**
     * Return the next item in the iteration of ITERATOR
     * or INVALID-TOKEN if the return value is invalid.
     * Unlike ITERATION-NEXT, only 1 value is returned.
     */
    @LispMethod(comment = "Return the next item in the iteration of ITERATOR\r\nor INVALID-TOKEN if the return value is invalid.\r\nUnlike ITERATION-NEXT, only 1 value is returned.\nReturn the next item in the iteration of ITERATOR\nor INVALID-TOKEN if the return value is invalid.\nUnlike ITERATION-NEXT, only 1 value is returned.")
    public static final SubLObject iteration_next_without_values_alt(SubLObject iterator, SubLObject invalid_token) {
        if (invalid_token == UNPROVIDED) {
            invalid_token = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(iterator, ITERATOR_P);
            {
                SubLObject quitP = funcall(it_done(iterator), it_state(iterator));
                SubLObject next_state = it_state(iterator);
                SubLObject next_item = NIL;
                SubLObject validP = NIL;
                if (NIL == quitP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject raw_item = iteration_next_funcall(it_next(iterator), next_state);
                        SubLObject raw_state = thread.secondMultipleValue();
                        SubLObject halted_prematurely = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        next_state = raw_state;
                        if (NIL == halted_prematurely) {
                            next_item = raw_item;
                            validP = T;
                        }
                    }
                }
                if (next_state != it_state(iterator)) {
                    _csetf_it_state(iterator, next_state);
                }
                return NIL != validP ? ((SubLObject) (next_item)) : invalid_token;
            }
        }
    }

    /**
     * Return the next item in the iteration of ITERATOR
     * or INVALID-TOKEN if the return value is invalid.
     * Unlike ITERATION-NEXT, only 1 value is returned.
     */
    @LispMethod(comment = "Return the next item in the iteration of ITERATOR\r\nor INVALID-TOKEN if the return value is invalid.\r\nUnlike ITERATION-NEXT, only 1 value is returned.\nReturn the next item in the iteration of ITERATOR\nor INVALID-TOKEN if the return value is invalid.\nUnlike ITERATION-NEXT, only 1 value is returned.")
    public static SubLObject iteration_next_without_values(final SubLObject iterator, SubLObject invalid_token) {
        if (invalid_token == UNPROVIDED) {
            invalid_token = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        final SubLObject quitP = funcall(it_done(iterator), it_state(iterator));
        SubLObject next_state = it_state(iterator);
        SubLObject next_item = NIL;
        SubLObject validP = NIL;
        if (NIL == quitP) {
            thread.resetMultipleValues();
            final SubLObject raw_item = iteration_next_funcall(it_next(iterator), next_state);
            final SubLObject raw_state = thread.secondMultipleValue();
            final SubLObject halted_prematurely = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            next_state = raw_state;
            if (NIL == halted_prematurely) {
                next_item = raw_item;
                validP = T;
            }
        }
        if (!next_state.eql(it_state(iterator))) {
            _csetf_it_state(iterator, next_state);
        }
        return NIL != validP ? next_item : invalid_token;
    }

    public static final SubLObject iteration_next_without_values_macro_helper_alt(SubLObject iterator, SubLObject invalid_token) {
        if (invalid_token == UNPROVIDED) {
            invalid_token = NIL;
        }
        return iteration_next_without_values(iterator, invalid_token);
    }

    public static SubLObject iteration_next_without_values_macro_helper(final SubLObject iterator, SubLObject invalid_token) {
        if (invalid_token == UNPROVIDED) {
            invalid_token = NIL;
        }
        return iteration_next_without_values(iterator, invalid_token);
    }

    public static final SubLObject iteration_finalize_alt(SubLObject iterator) {
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        return funcall(it_finalize(iterator), it_state(iterator));
    }

    public static SubLObject iteration_finalize(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        return funcall(it_finalize(iterator), it_state(iterator));
    }

    /**
     * Returns the type of the given ITERATOR, provided it follows the naming convention in this module,
     * otherwise returns the name of the function yielding the next iteration in ITERATOR.
     */
    @LispMethod(comment = "Returns the type of the given ITERATOR, provided it follows the naming convention in this module,\r\notherwise returns the name of the function yielding the next iteration in ITERATOR.\nReturns the type of the given ITERATOR, provided it follows the naming convention in this module,\notherwise returns the name of the function yielding the next iteration in ITERATOR.")
    public static final SubLObject iterator_type_name_alt(SubLObject iterator) {
        return string_utilities.post_remove(string_utilities.function_to_string(it_next(iterator)), $str_alt32$_NEXT, UNPROVIDED);
    }

    /**
     * Returns the type of the given ITERATOR, provided it follows the naming convention in this module,
     * otherwise returns the name of the function yielding the next iteration in ITERATOR.
     */
    @LispMethod(comment = "Returns the type of the given ITERATOR, provided it follows the naming convention in this module,\r\notherwise returns the name of the function yielding the next iteration in ITERATOR.\nReturns the type of the given ITERATOR, provided it follows the naming convention in this module,\notherwise returns the name of the function yielding the next iteration in ITERATOR.")
    public static SubLObject iterator_type_name(final SubLObject iterator) {
        return string_utilities.post_remove(string_utilities.function_to_string(it_next(iterator)), $str35$_NEXT, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown -- support peeking at the state for meta-reasoning about the iterator.
     */
    @LispMethod(comment = "@unknown -- support peeking at the state for meta-reasoning about the iterator.")
    public static final SubLObject iteration_state_peek_alt(SubLObject iterator) {
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        return it_state(iterator);
    }

    /**
     *
     *
     * @unknown -- support peeking at the state for meta-reasoning about the iterator.
     */
    @LispMethod(comment = "@unknown -- support peeking at the state for meta-reasoning about the iterator.")
    public static SubLObject iteration_state_peek(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        return it_state(iterator);
    }

    /**
     *
     *
     * @unknown -- support peeking at the next method for meta-reasoning about the iterator.
     */
    @LispMethod(comment = "@unknown -- support peeking at the next method for meta-reasoning about the iterator.")
    public static final SubLObject iteration_next_peek_alt(SubLObject iterator) {
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        return it_next(iterator);
    }

    /**
     *
     *
     * @unknown -- support peeking at the next method for meta-reasoning about the iterator.
     */
    @LispMethod(comment = "@unknown -- support peeking at the next method for meta-reasoning about the iterator.")
    public static SubLObject iteration_next_peek(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        return it_next(iterator);
    }

    /**
     * Execute BODY within the scope of VAR for each object in the iteration of ITERATOR.
     * Execution will stop if DONE becomes non-nil.
     */
    @LispMethod(comment = "Execute BODY within the scope of VAR for each object in the iteration of ITERATOR.\r\nExecution will stop if DONE becomes non-nil.\nExecute BODY within the scope of VAR for each object in the iteration of ITERATOR.\nExecution will stop if DONE becomes non-nil.")
    public static final SubLObject do_iterator_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt33);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject iterator = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt33);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt33);
                    iterator = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt33);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt33);
                            if (NIL == member(current_2, $list_alt34, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt33);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (!iterator.isSymbol()) {
                                    {
                                        SubLObject iterator_var = $sym36$ITERATOR_VAR;
                                        return list(CLET, list(list(iterator_var, iterator)), listS(DO_ITERATOR, list(var, iterator_var, $DONE, done), append(body, NIL)));
                                    }
                                } else {
                                    {
                                        SubLObject done_var = $sym39$DONE_VAR;
                                        SubLObject valid = $sym40$VALID;
                                        return list(CLET, list(list(done_var, done)), list(UNTIL, done_var, list(CMULTIPLE_VALUE_BIND, list(var, valid), list(ITERATION_NEXT, iterator), listS(PWHEN, valid, append(body, NIL)), list(CSETQ, done_var, NIL != done ? ((SubLObject) (list(COR, list(CNOT, valid), done))) : list(CNOT, valid)))));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Execute BODY within the scope of VAR for each object in the iteration of ITERATOR.
     * Execution will stop if DONE becomes non-nil.
     */
    @LispMethod(comment = "Execute BODY within the scope of VAR for each object in the iteration of ITERATOR.\r\nExecution will stop if DONE becomes non-nil.\nExecute BODY within the scope of VAR for each object in the iteration of ITERATOR.\nExecution will stop if DONE becomes non-nil.")
    public static SubLObject do_iterator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject iterator = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list36);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list36);
            if (NIL == member(current_$1, $list37, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list36);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (!iterator.isSymbol()) {
            final SubLObject iterator_var = $sym39$ITERATOR_VAR;
            return list(CLET, list(list(iterator_var, iterator)), listS(DO_ITERATOR, list(var, iterator_var, $DONE, done), append(body, NIL)));
        }
        final SubLObject done_var = $sym42$DONE_VAR;
        final SubLObject valid = $sym43$VALID;
        return list(CLET, list(list(done_var, done)), list(UNTIL, done_var, list(CMULTIPLE_VALUE_BIND, list(var, valid), list(ITERATION_NEXT, iterator), listS(PWHEN, valid, append(body, NIL)), list(CSETQ, done_var, NIL != done ? list(COR, list(CNOT, valid), done) : list(CNOT, valid)))));
    }

    public static SubLObject do_iterator_without_values_progress(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list51);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject iterator = NIL;
        destructuring_bind_must_consp(current, datum, $list51);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list51);
        iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list51);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list51);
            if (NIL == member(current_$2, $list52, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list51);
        }
        final SubLObject invalid_token_tail = property_list_member($INVALID_TOKEN, current);
        final SubLObject invalid_token = (NIL != invalid_token_tail) ? cadr(invalid_token_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(NOTING_PROGRESS, progress_message, listS(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(var, iterator, $INVALID_TOKEN, invalid_token, $DONE, done), $list56, append(body, NIL)));
    }

    /**
     * Execute BODY within the scope of VAR for each object in the iteration of ITERATOR.
     * Execution will stop if DONE becomes non-nil.
     */
    @LispMethod(comment = "Execute BODY within the scope of VAR for each object in the iteration of ITERATOR.\r\nExecution will stop if DONE becomes non-nil.\nExecute BODY within the scope of VAR for each object in the iteration of ITERATOR.\nExecution will stop if DONE becomes non-nil.")
    public static final SubLObject do_iterator_without_values_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt48);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject iterator = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt48);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt48);
                    iterator = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt48);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt48);
                            if (NIL == member(current_3, $list_alt49, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt48);
                        }
                        {
                            SubLObject invalid_token_tail = property_list_member($INVALID_TOKEN, current);
                            SubLObject invalid_token = (NIL != invalid_token_tail) ? ((SubLObject) (cadr(invalid_token_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(var, iterator, $INVALID_TOKEN, invalid_token, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Execute BODY within the scope of VAR for each object in the iteration of ITERATOR.
     * Execution will stop if DONE becomes non-nil.
     */
    @LispMethod(comment = "Execute BODY within the scope of VAR for each object in the iteration of ITERATOR.\r\nExecution will stop if DONE becomes non-nil.\nExecute BODY within the scope of VAR for each object in the iteration of ITERATOR.\nExecution will stop if DONE becomes non-nil.")
    public static SubLObject do_iterator_without_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject iterator = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list57);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list57);
            if (NIL == member(current_$3, $list58, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list57);
        }
        final SubLObject invalid_token_tail = property_list_member($INVALID_TOKEN, current);
        final SubLObject invalid_token = (NIL != invalid_token_tail) ? cadr(invalid_token_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(var, iterator, $INVALID_TOKEN, invalid_token, $DONE, done), append(body, NIL));
    }

    public static final SubLObject do_iterator_without_values_internal_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt48);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject iterator = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt48);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt48);
                    iterator = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt48);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt48);
                            if (NIL == member(current_4, $list_alt49, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt48);
                        }
                        {
                            SubLObject invalid_token_tail = property_list_member($INVALID_TOKEN, current);
                            SubLObject invalid_token = (NIL != invalid_token_tail) ? ((SubLObject) (cadr(invalid_token_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (!iterator.isSymbol()) {
                                    {
                                        SubLObject iterator_var = $sym52$ITERATOR_VAR;
                                        return list(CLET, list(list(iterator_var, iterator)), listS(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(var, iterator_var, $INVALID_TOKEN, invalid_token, $DONE, done), append(body, NIL)));
                                    }
                                } else {
                                    {
                                        SubLObject done_var = $sym53$DONE_VAR;
                                        SubLObject token_var = $sym54$TOKEN_VAR;
                                        SubLObject valid = $sym55$VALID;
                                        return list(CLET, list(list(done_var, done), list(token_var, invalid_token)), list(UNTIL, done_var, list(CLET, list(list(var, list(ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER, iterator, token_var)), list(valid, list(CNOT, list(EQ, token_var, var)))), listS(PWHEN, valid, append(body, NIL)), list(CSETQ, done_var, NIL != done ? ((SubLObject) (list(COR, list(CNOT, valid), done))) : list(CNOT, valid)))));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_iterator_without_values_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject iterator = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list57);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list57);
            if (NIL == member(current_$4, $list58, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list57);
        }
        final SubLObject invalid_token_tail = property_list_member($INVALID_TOKEN, current);
        final SubLObject invalid_token = (NIL != invalid_token_tail) ? cadr(invalid_token_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (!iterator.isSymbol()) {
            final SubLObject iterator_var = $sym60$ITERATOR_VAR;
            return list(CLET, list(list(iterator_var, iterator)), listS(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, list(var, iterator_var, $INVALID_TOKEN, invalid_token, $DONE, done), append(body, NIL)));
        }
        final SubLObject done_var = $sym61$DONE_VAR;
        final SubLObject token_var = $sym62$TOKEN_VAR;
        final SubLObject valid = $sym63$VALID;
        return list(CLET, list(list(done_var, done), list(token_var, invalid_token)), list(UNTIL, done_var, list(CLET, list(list(var, list(ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER, iterator, token_var)), list(valid, list(CNOT, list(EQ, token_var, var)))), listS(PWHEN, valid, append(body, NIL)), list(CSETQ, done_var, NIL != done ? list(COR, list(CNOT, valid), done) : list(CNOT, valid)))));
    }

    /**
     * Execute BODY within the scope of VAR for each of the first N objects in the
     * iteration of ITERATOR.  Execution will stop if DONE becomes non-nil.
     */
    @LispMethod(comment = "Execute BODY within the scope of VAR for each of the first N objects in the\r\niteration of ITERATOR.  Execution will stop if DONE becomes non-nil.\nExecute BODY within the scope of VAR for each of the first N objects in the\niteration of ITERATOR.  Execution will stop if DONE becomes non-nil.")
    public static final SubLObject do_n_iterator_objects_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject n = NIL;
                    SubLObject iterator = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt56);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt56);
                    n = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt56);
                    iterator = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt56);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt56);
                            if (NIL == member(current_5, $list_alt34, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt56);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject count = $sym57$COUNT;
                                SubLObject new_done = $sym58$NEW_DONE;
                                return list(CLET, list(bq_cons(count, $list_alt59), list(new_done, list(COR, done, list($sym60$__, count, n)))), list(DO_ITERATOR, list(var, iterator, $DONE, new_done), bq_cons(PROGN, append(body, list(list(CINC, count), list(PWHEN, list(COR, done, list($sym60$__, count, n)), listS(CSETQ, new_done, $list_alt63)))))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Execute BODY within the scope of VAR for each of the first N objects in the
     * iteration of ITERATOR.  Execution will stop if DONE becomes non-nil.
     */
    @LispMethod(comment = "Execute BODY within the scope of VAR for each of the first N objects in the\r\niteration of ITERATOR.  Execution will stop if DONE becomes non-nil.\nExecute BODY within the scope of VAR for each of the first N objects in the\niteration of ITERATOR.  Execution will stop if DONE becomes non-nil.")
    public static SubLObject do_n_iterator_objects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject n = NIL;
        SubLObject iterator = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        n = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list64);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list64);
            if (NIL == member(current_$5, $list37, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list64);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject count = $sym65$COUNT;
        final SubLObject new_done = $sym66$NEW_DONE;
        return list(CLET, list(bq_cons(count, $list67), list(new_done, list(COR, done, list($sym68$__, count, n)))), list(DO_ITERATOR, list(var, iterator, $DONE, new_done), bq_cons(PROGN, append(body, list(list(CINC, count), list(PWHEN, list(COR, done, list($sym68$__, count, n)), listS(CSETQ, new_done, $list71)))))));
    }

    /**
     * Apply FUNCTION to each object in the iteration of ITERATOR.
     */
    @LispMethod(comment = "Apply FUNCTION to each object in the iteration of ITERATOR.")
    public static final SubLObject map_iterator_alt(SubLObject function, SubLObject iterator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject item = iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            funcall(function, item);
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
            }
            return NIL;
        }
    }

    /**
     * Apply FUNCTION to each object in the iteration of ITERATOR.
     */
    @LispMethod(comment = "Apply FUNCTION to each object in the iteration of ITERATOR.")
    public static SubLObject map_iterator(final SubLObject function, final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject item = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                funcall(function, item);
            }
        }
        return NIL;
    }

    /**
     * Copy ITERATOR using COPY-FUNCTION to copy the state.
     */
    @LispMethod(comment = "Copy ITERATOR using COPY-FUNCTION to copy the state.")
    public static final SubLObject copy_iterator_alt(SubLObject iterator, SubLObject copy_function) {
        if (copy_function == UNPROVIDED) {
            copy_function = COPY_TREE;
        }
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        SubLTrampolineFile.checkType(copy_function, FUNCTION_SPEC_P);
        {
            SubLObject state = it_state(iterator);
            SubLObject done = it_done(iterator);
            SubLObject next = it_next(iterator);
            SubLObject finalize = it_finalize(iterator);
            SubLObject new_state = funcall(copy_function, state);
            return new_iterator(new_state, done, next, finalize);
        }
    }

    /**
     * Copy ITERATOR using COPY-FUNCTION to copy the state.
     */
    @LispMethod(comment = "Copy ITERATOR using COPY-FUNCTION to copy the state.")
    public static SubLObject copy_iterator(final SubLObject iterator, SubLObject copy_function) {
        if (copy_function == UNPROVIDED) {
            copy_function = COPY_TREE;
        }
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        assert NIL != function_spec_p(copy_function) : "! function_spec_p(copy_function) " + ("Types.function_spec_p(copy_function) " + "CommonSymbols.NIL != Types.function_spec_p(copy_function) ") + copy_function;
        final SubLObject state = it_state(iterator);
        final SubLObject done = it_done(iterator);
        final SubLObject next = it_next(iterator);
        final SubLObject finalize = it_finalize(iterator);
        final SubLObject new_state = funcall(copy_function, state);
        return new_iterator(new_state, done, next, finalize);
    }

    public static final SubLObject iterator_value_list_alt(SubLObject iterator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject value = iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            result = cons(value, result);
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
                return nreverse(result);
            }
        }
    }

    public static SubLObject iterator_value_list(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject value = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                result = cons(value, result);
            }
        }
        return nreverse(result);
    }

    /**
     * GENERIC-PRODUCER iterates over ITERATOR calling the function ACTION on each item.
     * SUSPEND, if provided, must be a function of no arguments which is repeatedly
     * called before each item of the iteration until it returns NIL.
     */
    @LispMethod(comment = "GENERIC-PRODUCER iterates over ITERATOR calling the function ACTION on each item.\r\nSUSPEND, if provided, must be a function of no arguments which is repeatedly\r\ncalled before each item of the iteration until it returns NIL.\nGENERIC-PRODUCER iterates over ITERATOR calling the function ACTION on each item.\nSUSPEND, if provided, must be a function of no arguments which is repeatedly\ncalled before each item of the iteration until it returns NIL.")
    public static final SubLObject generic_producer_alt(SubLObject iterator, SubLObject action, SubLObject suspend) {
        if (suspend == UNPROVIDED) {
            suspend = symbol_function(FALSE);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(iterator, ITERATOR_P);
            if (NIL != suspend) {
                if (suspend != symbol_function(FALSE)) {
                    while (NIL != funcall(suspend)) {
                    } 
                }
            }
            {
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject item = iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            funcall(action, item);
                            if (NIL != suspend) {
                                if (suspend != symbol_function(FALSE)) {
                                    while (NIL != funcall(suspend)) {
                                    } 
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
            }
            return NIL;
        }
    }

    /**
     * GENERIC-PRODUCER iterates over ITERATOR calling the function ACTION on each item.
     * SUSPEND, if provided, must be a function of no arguments which is repeatedly
     * called before each item of the iteration until it returns NIL.
     */
    @LispMethod(comment = "GENERIC-PRODUCER iterates over ITERATOR calling the function ACTION on each item.\r\nSUSPEND, if provided, must be a function of no arguments which is repeatedly\r\ncalled before each item of the iteration until it returns NIL.\nGENERIC-PRODUCER iterates over ITERATOR calling the function ACTION on each item.\nSUSPEND, if provided, must be a function of no arguments which is repeatedly\ncalled before each item of the iteration until it returns NIL.")
    public static SubLObject generic_producer(final SubLObject iterator, final SubLObject action, SubLObject suspend) {
        if (suspend == UNPROVIDED) {
            suspend = symbol_function(FALSE);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        if ((NIL != suspend) && (!suspend.eql(symbol_function(FALSE)))) {
            while (NIL != funcall(suspend)) {
            } 
        }
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject item = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                funcall(action, item);
                if ((NIL != suspend) && (!suspend.eql(symbol_function(FALSE)))) {
                    while (NIL != funcall(suspend)) {
                    } 
                }
            }
        }
        return NIL;
    }

    /**
     * Return a NO-OP iterator
     */
    @LispMethod(comment = "Return a NO-OP iterator")
    public static final SubLObject new_null_iterator_alt() {
        return new_list_iterator(NIL);
    }

    /**
     * Return a NO-OP iterator
     */
    @LispMethod(comment = "Return a NO-OP iterator")
    public static SubLObject new_null_iterator() {
        return new_list_iterator(NIL);
    }

    /**
     * Return an iterator that will just return ITEM and halt.
     */
    @LispMethod(comment = "Return an iterator that will just return ITEM and halt.")
    public static final SubLObject new_singleton_iterator_alt(SubLObject item) {
        if (NIL == item) {
            return new_list_iterator(list(item));
        } else {
            return new_iterator(item, NULL, ITERATE_NON_NULL_SINGLETON_NEXT, UNPROVIDED);
        }
    }

    /**
     * Return an iterator that will just return ITEM and halt.
     */
    @LispMethod(comment = "Return an iterator that will just return ITEM and halt.")
    public static SubLObject new_singleton_iterator(final SubLObject item) {
        if (NIL == item) {
            return new_list_iterator(list(item));
        }
        return new_iterator(item, NULL, ITERATE_NON_NULL_SINGLETON_NEXT, UNPROVIDED);
    }

    public static final SubLObject iterate_non_null_singleton_next_alt(SubLObject state) {
        return values(state, NIL);
    }

    public static SubLObject iterate_non_null_singleton_next(final SubLObject state) {
        return subl_promotions.values3(state, NIL, NIL);
    }

    /**
     * Returns an iterator for integers starting at START.
     * Integers are presented in sequence, in increments of DELTA.
     * If END is nil, the iterator will never exhaust.
     * If non-nil, END is an integer threshold (exclusive) at which the iteration should end.
     */
    @LispMethod(comment = "Returns an iterator for integers starting at START.\r\nIntegers are presented in sequence, in increments of DELTA.\r\nIf END is nil, the iterator will never exhaust.\r\nIf non-nil, END is an integer threshold (exclusive) at which the iteration should end.\nReturns an iterator for integers starting at START.\nIntegers are presented in sequence, in increments of DELTA.\nIf END is nil, the iterator will never exhaust.\nIf non-nil, END is an integer threshold (exclusive) at which the iteration should end.")
    public static final SubLObject new_integer_iterator_alt(SubLObject start, SubLObject end, SubLObject delta) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        SubLTrampolineFile.checkType(start, INTEGERP);
        SubLTrampolineFile.checkType(delta, INTEGERP);
        return new_number_iterator(start, end, delta);
    }

    /**
     * Returns an iterator for integers starting at START.
     * Integers are presented in sequence, in increments of DELTA.
     * If END is nil, the iterator will never exhaust.
     * If non-nil, END is an integer threshold (exclusive) at which the iteration should end.
     */
    @LispMethod(comment = "Returns an iterator for integers starting at START.\r\nIntegers are presented in sequence, in increments of DELTA.\r\nIf END is nil, the iterator will never exhaust.\r\nIf non-nil, END is an integer threshold (exclusive) at which the iteration should end.\nReturns an iterator for integers starting at START.\nIntegers are presented in sequence, in increments of DELTA.\nIf END is nil, the iterator will never exhaust.\nIf non-nil, END is an integer threshold (exclusive) at which the iteration should end.")
    public static SubLObject new_integer_iterator(SubLObject start, SubLObject end, SubLObject delta) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        assert NIL != integerp(start) : "! integerp(start) " + ("Types.integerp(start) " + "CommonSymbols.NIL != Types.integerp(start) ") + start;
        assert NIL != integerp(delta) : "! integerp(delta) " + ("Types.integerp(delta) " + "CommonSymbols.NIL != Types.integerp(delta) ") + delta;
        return new_number_iterator(start, end, delta);
    }

    /**
     * Returns an iterator for numbers starting at START.
     * Numbers are presented in sequence, in increments of DELTA.
     * If END is nil, the iterator will never exhaust.
     * If non-nil, END is an number threshold (exclusive) at which the iteration should end.
     */
    @LispMethod(comment = "Returns an iterator for numbers starting at START.\r\nNumbers are presented in sequence, in increments of DELTA.\r\nIf END is nil, the iterator will never exhaust.\r\nIf non-nil, END is an number threshold (exclusive) at which the iteration should end.\nReturns an iterator for numbers starting at START.\nNumbers are presented in sequence, in increments of DELTA.\nIf END is nil, the iterator will never exhaust.\nIf non-nil, END is an number threshold (exclusive) at which the iteration should end.")
    public static final SubLObject new_number_iterator_alt(SubLObject start, SubLObject end, SubLObject delta) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        SubLTrampolineFile.checkType(start, NUMBERP);
        SubLTrampolineFile.checkType(delta, NUMBERP);
        if (NIL != end) {
            SubLTrampolineFile.checkType(end, NUMBERP);
        }
        return new_iterator(make_iterator_number_state(start, end, delta), ITERATE_NUMBER_DONE, ITERATE_NUMBER_NEXT, UNPROVIDED);
    }

    /**
     * Returns an iterator for numbers starting at START.
     * Numbers are presented in sequence, in increments of DELTA.
     * If END is nil, the iterator will never exhaust.
     * If non-nil, END is an number threshold (exclusive) at which the iteration should end.
     */
    @LispMethod(comment = "Returns an iterator for numbers starting at START.\r\nNumbers are presented in sequence, in increments of DELTA.\r\nIf END is nil, the iterator will never exhaust.\r\nIf non-nil, END is an number threshold (exclusive) at which the iteration should end.\nReturns an iterator for numbers starting at START.\nNumbers are presented in sequence, in increments of DELTA.\nIf END is nil, the iterator will never exhaust.\nIf non-nil, END is an number threshold (exclusive) at which the iteration should end.")
    public static SubLObject new_number_iterator(SubLObject start, SubLObject end, SubLObject delta) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        assert NIL != numberp(start) : "! numberp(start) " + ("Types.numberp(start) " + "CommonSymbols.NIL != Types.numberp(start) ") + start;
        assert NIL != numberp(delta) : "! numberp(delta) " + ("Types.numberp(delta) " + "CommonSymbols.NIL != Types.numberp(delta) ") + delta;
        if (((NIL != end) && (!assertionsDisabledSynth)) && (NIL == numberp(end))) {
            throw new AssertionError(end);
        }
        return new_iterator(make_iterator_number_state(start, end, delta), ITERATE_NUMBER_DONE, ITERATE_NUMBER_NEXT, UNPROVIDED);
    }

    public static final SubLObject make_iterator_number_state_alt(SubLObject start, SubLObject end, SubLObject delta) {
        {
            SubLObject current = start;
            return list(current, delta, end);
        }
    }

    public static SubLObject make_iterator_number_state(final SubLObject start, final SubLObject end, final SubLObject delta) {
        return list(start, delta, end);
    }

    public static final SubLObject iterate_number_done_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_6 = NIL;
            SubLObject delta = NIL;
            SubLObject end = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt73);
            current_6 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt73);
            delta = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt73);
            end = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == end) {
                    return NIL;
                }
                if (delta.isPositive()) {
                    return numGE(current_6, end);
                } else {
                    if (delta.isNegative()) {
                        return numLE(current_6, end);
                    } else {
                        return numE(current_6, end);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt73);
            }
        }
        return NIL;
    }

    public static SubLObject iterate_number_done(final SubLObject state) {
        SubLObject current_$6 = NIL;
        SubLObject delta = NIL;
        SubLObject end = NIL;
        destructuring_bind_must_consp(state, state, $list81);
        current_$6 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list81);
        delta = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list81);
        end = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list81);
            return NIL;
        }
        if (NIL == end) {
            return NIL;
        }
        if (delta.isPositive()) {
            return numGE(current_$6, end);
        }
        if (delta.isNegative()) {
            return numLE(current_$6, end);
        }
        return numE(current_$6, end);
    }

    public static final SubLObject iterate_number_next_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_7 = NIL;
            SubLObject delta = NIL;
            SubLObject end = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt73);
            current_7 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt73);
            delta = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt73);
            end = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject next = current_7;
                    SubLObject update = add(current_7, delta);
                    rplaca(state, update);
                    return values(next, state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt73);
            }
        }
        return NIL;
    }

    public static SubLObject iterate_number_next(final SubLObject state) {
        SubLObject current_$7 = NIL;
        SubLObject delta = NIL;
        SubLObject end = NIL;
        destructuring_bind_must_consp(state, state, $list81);
        current_$7 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list81);
        delta = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list81);
        end = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject next = current_$7;
            final SubLObject update = add(current_$7, delta);
            rplaca(state, update);
            return subl_promotions.values3(next, state, NIL);
        }
        cdestructuring_bind_error(state, $list81);
        return NIL;
    }

    /**
     * Return T iff OBJECT is a list iterator
     */
    @LispMethod(comment = "Return T iff OBJECT is a list iterator")
    public static final SubLObject list_iterator_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != iterator_p(v_object)) && (it_next(v_object) == ITERATE_LIST_NEXT));
    }

    /**
     * Return T iff OBJECT is a list iterator
     */
    @LispMethod(comment = "Return T iff OBJECT is a list iterator")
    public static SubLObject list_iterator_p(final SubLObject v_object) {
        return makeBoolean((NIL != iterator_p(v_object)) && (it_next(v_object) == ITERATE_LIST_NEXT));
    }

    /**
     * Returns an iterator for the elements of LIST.
     */
    @LispMethod(comment = "Returns an iterator for the elements of LIST.")
    public static final SubLObject new_list_iterator_alt(SubLObject list) {
        SubLTrampolineFile.checkType(list, LISTP);
        return new_iterator(make_iterator_list_state(list), ITERATE_LIST_DONE, ITERATE_LIST_NEXT, UNPROVIDED);
    }

    /**
     * Returns an iterator for the elements of LIST.
     */
    @LispMethod(comment = "Returns an iterator for the elements of LIST.")
    public static SubLObject new_list_iterator(final SubLObject list) {
        assert NIL != listp(list) : "! listp(list) " + ("Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) ") + list;
        return new_iterator(make_iterator_list_state(list), ITERATE_LIST_DONE, ITERATE_LIST_NEXT, UNPROVIDED);
    }

    /**
     * Returns the list of elements that are sequenced through by ITERATOR.
     */
    @LispMethod(comment = "Returns the list of elements that are sequenced through by ITERATOR.")
    public static final SubLObject get_list_iterator_list_alt(SubLObject iterator) {
        SubLTrampolineFile.checkType(iterator, LIST_ITERATOR_P);
        return it_state(iterator);
    }

    /**
     * Returns the list of elements that are sequenced through by ITERATOR.
     */
    @LispMethod(comment = "Returns the list of elements that are sequenced through by ITERATOR.")
    public static SubLObject get_list_iterator_list(final SubLObject iterator) {
        assert NIL != list_iterator_p(iterator) : "! iteration.list_iterator_p(iterator) " + ("iteration.list_iterator_p(iterator) " + "CommonSymbols.NIL != iteration.list_iterator_p(iterator) ") + iterator;
        return it_state(iterator);
    }

    /**
     * Return the remaining number of objects to iterate in LIST-ITERATOR
     */
    @LispMethod(comment = "Return the remaining number of objects to iterate in LIST-ITERATOR")
    public static final SubLObject list_iterator_size_alt(SubLObject list_iterator) {
        return length(get_list_iterator_list(list_iterator));
    }

    /**
     * Return the remaining number of objects to iterate in LIST-ITERATOR
     */
    @LispMethod(comment = "Return the remaining number of objects to iterate in LIST-ITERATOR")
    public static SubLObject list_iterator_size(final SubLObject list_iterator) {
        return length(get_list_iterator_list(list_iterator));
    }

    public static final SubLObject make_iterator_list_state_alt(SubLObject list) {
        return list;
    }

    public static SubLObject make_iterator_list_state(final SubLObject list) {
        return list;
    }

    public static final SubLObject iterate_list_done_alt(SubLObject state) {
        return sublisp_null(state);
    }

    public static SubLObject iterate_list_done(final SubLObject state) {
        return sublisp_null(state);
    }

    public static final SubLObject iterate_list_next_alt(SubLObject state) {
        {
            SubLObject next = state.first();
            SubLObject update = state.rest();
            return values(next, update);
        }
    }

    public static SubLObject iterate_list_next(final SubLObject state) {
        final SubLObject next = state.first();
        final SubLObject update = state.rest();
        return subl_promotions.values3(next, update, NIL);
    }

    public static SubLObject inference_list_iterator_p(final SubLObject v_object) {
        return makeBoolean((NIL != iterator_p(v_object)) && (it_next(v_object) == ITERATE_INFERENCE_LIST_NEXT));
    }

    public static SubLObject new_inference_list_iterator(final SubLObject list) {
        assert NIL != listp(list) : "! listp(list) " + ("Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) ") + list;
        return new_iterator(make_inference_iterator_list_state(list), ITERATE_INFERENCE_LIST_DONE, ITERATE_INFERENCE_LIST_NEXT, UNPROVIDED);
    }

    public static SubLObject get_inference_list_iterator_list(final SubLObject iterator) {
        assert NIL != inference_list_iterator_p(iterator) : "! iteration.inference_list_iterator_p(iterator) " + ("iteration.inference_list_iterator_p(iterator) " + "CommonSymbols.NIL != iteration.inference_list_iterator_p(iterator) ") + iterator;
        return it_state(iterator);
    }

    public static SubLObject inference_list_iterator_size(final SubLObject list_iterator) {
        return length(get_inference_list_iterator_list(list_iterator));
    }

    public static SubLObject make_inference_iterator_list_state(final SubLObject list) {
        if (NIL != inference_trampolines.expression_has_inference_excepted_assertionP_iteration_helper(list)) {
        }
        return remove_if($sym89$EXPRESSION_HAS_INFERENCE_EXCEPTED_ASSERTION__ITERATION_HELPER, list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject iterate_inference_list_done(final SubLObject state) {
        return sublisp_null(state);
    }

    public static SubLObject iterate_inference_list_next(final SubLObject state) {
        final SubLObject next = state.first();
        final SubLObject update = state.rest();
        return subl_promotions.values3(next, update, NIL);
    }

    /**
     * Returns an iterator for ALIST.
     * Values returned are tuples of the form (<key> <value>).
     */
    @LispMethod(comment = "Returns an iterator for ALIST.\r\nValues returned are tuples of the form (<key> <value>).\nReturns an iterator for ALIST.\nValues returned are tuples of the form (<key> <value>).")
    public static final SubLObject new_alist_iterator_alt(SubLObject alist) {
        SubLTrampolineFile.checkType(alist, ALIST_P);
        return new_indirect_iterator(new_list_iterator(alist), CONS_TO_TUPLE, UNPROVIDED);
    }

    /**
     * Returns an iterator for ALIST.
     * Values returned are tuples of the form (<key> <value>).
     */
    @LispMethod(comment = "Returns an iterator for ALIST.\r\nValues returned are tuples of the form (<key> <value>).\nReturns an iterator for ALIST.\nValues returned are tuples of the form (<key> <value>).")
    public static SubLObject new_alist_iterator(final SubLObject alist) {
        assert NIL != list_utilities.alist_p(alist) : "! list_utilities.alist_p(alist) " + ("list_utilities.alist_p(alist) " + "CommonSymbols.NIL != list_utilities.alist_p(alist) ") + alist;
        return new_indirect_iterator(new_list_iterator(alist), CONS_TO_TUPLE, UNPROVIDED);
    }

    /**
     * Returns an iterator for the elements of VECTOR.
     */
    @LispMethod(comment = "Returns an iterator for the elements of VECTOR.")
    public static final SubLObject new_vector_iterator_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, VECTORP);
        return new_iterator(make_iterator_vector_state(vector), DEFAULT_ITERATOR_DONE_P, ITERATE_VECTOR_NEXT, UNPROVIDED);
    }

    /**
     * Returns an iterator for the elements of VECTOR.
     */
    @LispMethod(comment = "Returns an iterator for the elements of VECTOR.")
    public static SubLObject new_vector_iterator(final SubLObject vector) {
        assert NIL != vectorp(vector) : "! vectorp(vector) " + ("Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) ") + vector;
        return new_iterator(make_iterator_vector_state(vector), DEFAULT_ITERATOR_DONE_P, ITERATE_VECTOR_NEXT, UNPROVIDED);
    }

    public static final SubLObject make_iterator_vector_state_alt(SubLObject vector) {
        {
            SubLObject current = ZERO_INTEGER;
            return list(current, vector);
        }
    }

    public static SubLObject make_iterator_vector_state(final SubLObject vector) {
        final SubLObject current = ZERO_INTEGER;
        return list(current, vector);
    }

    public static final SubLObject iterate_vector_next_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_8 = NIL;
            SubLObject vector = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            current_8 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt84);
            vector = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject next = aref(vector, current_8);
                    SubLObject update = add(ONE_INTEGER, current_8);
                    if (update.numE(length(vector))) {
                        update = $DONE;
                        set_nth(ONE_INTEGER, state, $UNINITIALIZED);
                    }
                    rplaca(state, update);
                    return values(next, state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt84);
            }
        }
        return NIL;
    }

    public static SubLObject iterate_vector_next(final SubLObject state) {
        SubLObject current_$8 = NIL;
        SubLObject vector = NIL;
        destructuring_bind_must_consp(state, state, $list95);
        current_$8 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list95);
        vector = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject next = aref(vector, current_$8);
            SubLObject update = add(ONE_INTEGER, current_$8);
            if (update.numE(length(vector))) {
                update = $DONE;
                set_nth(ONE_INTEGER, state, $UNINITIALIZED);
            }
            rplaca(state, update);
            return subl_promotions.values2(next, state);
        }
        cdestructuring_bind_error(state, $list95);
        return NIL;
    }

    /**
     * Returns an iterator for VECTOR.
     * Values returned are tuples of the form (<index> <value>).
     */
    @LispMethod(comment = "Returns an iterator for VECTOR.\r\nValues returned are tuples of the form (<index> <value>).\nReturns an iterator for VECTOR.\nValues returned are tuples of the form (<index> <value>).")
    public static final SubLObject new_vector_index_iterator_alt(SubLObject vector) {
        SubLTrampolineFile.checkType(vector, VECTORP);
        return new_iterator(make_iterator_vector_index_state(vector), DEFAULT_ITERATOR_DONE_P, ITERATE_VECTOR_INDEX_NEXT, UNPROVIDED);
    }

    /**
     * Returns an iterator for VECTOR.
     * Values returned are tuples of the form (<index> <value>).
     */
    @LispMethod(comment = "Returns an iterator for VECTOR.\r\nValues returned are tuples of the form (<index> <value>).\nReturns an iterator for VECTOR.\nValues returned are tuples of the form (<index> <value>).")
    public static SubLObject new_vector_index_iterator(final SubLObject vector) {
        assert NIL != vectorp(vector) : "! vectorp(vector) " + ("Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) ") + vector;
        return new_iterator(make_iterator_vector_index_state(vector), DEFAULT_ITERATOR_DONE_P, ITERATE_VECTOR_INDEX_NEXT, UNPROVIDED);
    }

    public static final SubLObject make_iterator_vector_index_state_alt(SubLObject vector) {
        {
            SubLObject current = ZERO_INTEGER;
            return list(current, vector);
        }
    }

    public static SubLObject make_iterator_vector_index_state(final SubLObject vector) {
        final SubLObject current = ZERO_INTEGER;
        return list(current, vector);
    }

    public static final SubLObject iterate_vector_index_next_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_9 = NIL;
            SubLObject vector = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            current_9 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt84);
            vector = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject next_id = current_9;
                    SubLObject next_value = aref(vector, current_9);
                    SubLObject next = list(next_id, next_value);
                    SubLObject update = add(ONE_INTEGER, current_9);
                    if (update.numE(length(vector))) {
                        update = $DONE;
                        set_nth(ONE_INTEGER, state, $UNINITIALIZED);
                    }
                    rplaca(state, update);
                    return values(next, state);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt84);
            }
        }
        return NIL;
    }

    public static SubLObject iterate_vector_index_next(final SubLObject state) {
        SubLObject current_$9 = NIL;
        SubLObject vector = NIL;
        destructuring_bind_must_consp(state, state, $list95);
        current_$9 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list95);
        vector = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject next_id = current_$9;
            final SubLObject next_value = aref(vector, current_$9);
            final SubLObject next = list(next_id, next_value);
            SubLObject update = add(ONE_INTEGER, current_$9);
            if (update.numE(length(vector))) {
                update = $DONE;
                set_nth(ONE_INTEGER, state, $UNINITIALIZED);
            }
            rplaca(state, update);
            return subl_promotions.values2(next, state);
        }
        cdestructuring_bind_error(state, $list95);
        return NIL;
    }

    public static SubLObject new_string_iterator(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        return new_list_iterator(string_utilities.string_to_char_list(string));
    }

    public static SubLObject new_sequence_iterator(SubLObject sequence, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != sequencep(sequence) : "! sequencep(sequence) " + ("Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) ") + sequence;
        if ((!start.numE(ZERO_INTEGER)) || (NIL != end)) {
            sequence = subseq(sequence, start, end);
        }
        if (sequence.isList()) {
            return new_list_iterator(sequence);
        }
        if (sequence.isVector()) {
            return new_vector_iterator(sequence);
        }
        if (sequence.isString()) {
            return new_string_iterator(sequence);
        }
        return Errors.error($str100$_S_was_not_a_sequence, sequence);
    }

    /**
     * Returns an iterator for HASH-TABLE.
     * Values returned are tuples of the form (<key> <value>).
     */
    @LispMethod(comment = "Returns an iterator for HASH-TABLE.\r\nValues returned are tuples of the form (<key> <value>).\nReturns an iterator for HASH-TABLE.\nValues returned are tuples of the form (<key> <value>).")
    public static final SubLObject new_hash_table_iterator_alt(SubLObject hash_table) {
        SubLTrampolineFile.checkType(hash_table, HASH_TABLE_P);
        return new_iterator(make_iterator_hash_table_state(hash_table), ITERATOR_HASH_TABLE_DONE, ITERATOR_HASH_TABLE_NEXT, UNPROVIDED);
    }

    /**
     * Returns an iterator for HASH-TABLE.
     * Values returned are tuples of the form (<key> <value>).
     */
    @LispMethod(comment = "Returns an iterator for HASH-TABLE.\r\nValues returned are tuples of the form (<key> <value>).\nReturns an iterator for HASH-TABLE.\nValues returned are tuples of the form (<key> <value>).")
    public static SubLObject new_hash_table_iterator(final SubLObject hash_table) {
        assert NIL != hash_table_p(hash_table) : "! hash_table_p(hash_table) " + ("Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) ") + hash_table;
        return new_iterator(make_iterator_hash_table_state(hash_table), ITERATOR_HASH_TABLE_DONE, ITERATOR_HASH_TABLE_NEXT, UNPROVIDED);
    }

    public static SubLObject new_hash_table_keys_iterator(final SubLObject hash_table) {
        assert NIL != hash_table_p(hash_table) : "! hash_table_p(hash_table) " + ("Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) ") + hash_table;
        return new_list_iterator(hash_table_utilities.hash_table_keys(hash_table));
    }

    /**
     * Returns an iterator for the values in HASH-TABLE.
     */
    @LispMethod(comment = "Returns an iterator for the values in HASH-TABLE.")
    public static final SubLObject new_hash_table_values_iterator_alt(SubLObject hash_table) {
        SubLTrampolineFile.checkType(hash_table, HASH_TABLE_P);
        return new_list_iterator(hash_table_values(hash_table));
    }

    /**
     * Returns an iterator for the values in HASH-TABLE.
     */
    @LispMethod(comment = "Returns an iterator for the values in HASH-TABLE.")
    public static SubLObject new_hash_table_values_iterator(final SubLObject hash_table) {
        assert NIL != hash_table_p(hash_table) : "! hash_table_p(hash_table) " + ("Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) ") + hash_table;
        return new_list_iterator(hash_table_utilities.hash_table_values(hash_table));
    }

    public static final SubLObject make_iterator_hash_table_state_alt(SubLObject hash_table) {
        {
            SubLObject current = hash_table_keys(hash_table);
            return list(current, hash_table);
        }
    }

    public static SubLObject make_iterator_hash_table_state(final SubLObject hash_table) {
        final SubLObject current = hash_table_utilities.hash_table_keys(hash_table);
        final SubLObject key_value_tuple = list($KEY, $VALUE);
        return list(current, hash_table, key_value_tuple);
    }

    public static final SubLObject iterator_hash_table_done_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_10 = NIL;
            SubLObject hash_table = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt90);
            current_10 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt90);
            hash_table = current.first();
            current = current.rest();
            if (NIL == current) {
                return sublisp_null(current_10);
            } else {
                cdestructuring_bind_error(datum, $list_alt90);
            }
        }
        return NIL;
    }

    public static SubLObject iterator_hash_table_done(final SubLObject state) {
        SubLObject current_$10 = NIL;
        destructuring_bind_must_consp(state, state, $list106);
        current_$10 = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        return sublisp_null(current_$10);
    }

    public static final SubLObject iterator_hash_table_next_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_11 = NIL;
            SubLObject hash_table = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt90);
            current_11 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt90);
            hash_table = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject datum_12 = current_11;
                    SubLObject current_13 = datum_12;
                    SubLObject next_key = NIL;
                    SubLObject rest_keys = NIL;
                    destructuring_bind_must_consp(current_13, datum_12, $list_alt91);
                    next_key = current_13.first();
                    current_13 = current_13.rest();
                    rest_keys = current_13;
                    {
                        SubLObject next_value = gethash(next_key, hash_table, UNPROVIDED);
                        SubLObject next = list(next_key, next_value);
                        SubLObject update = rest_keys;
                        if (NIL == update) {
                            set_nth(ONE_INTEGER, state, $UNINITIALIZED);
                        }
                        rplaca(state, update);
                        return values(next, state);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt90);
            }
        }
        return NIL;
    }

    public static SubLObject iterator_hash_table_next(final SubLObject state) {
        SubLObject current_$11 = NIL;
        SubLObject hash_table = NIL;
        SubLObject key_value_tuple = NIL;
        destructuring_bind_must_consp(state, state, $list107);
        current_$11 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list107);
        hash_table = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list107);
        key_value_tuple = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$12;
            final SubLObject datum_$12 = current_$12 = current_$11;
            SubLObject next_key = NIL;
            SubLObject rest_keys = NIL;
            destructuring_bind_must_consp(current_$12, datum_$12, $list108);
            next_key = current_$12.first();
            current_$12 = rest_keys = current_$12.rest();
            final SubLObject next_value = gethash(next_key, hash_table, UNPROVIDED);
            final SubLObject update = rest_keys;
            set_nth(ZERO_INTEGER, key_value_tuple, next_key);
            set_nth(ONE_INTEGER, key_value_tuple, next_value);
            if (NIL == update) {
                set_nth(ONE_INTEGER, state, $UNINITIALIZED);
            }
            rplaca(state, update);
            return subl_promotions.values3(key_value_tuple, state, NIL);
        }
        cdestructuring_bind_error(state, $list107);
        return NIL;
    }

    public static SubLObject new_file_form_iterator(final SubLObject filename, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        assert NIL != subl_promotions.non_negative_integer_p(start) : "! subl_promotions.non_negative_integer_p(start) " + ("subl_promotions.non_negative_integer_p(start) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(start) ") + start;
        if (((NIL != end) && (!assertionsDisabledSynth)) && (NIL == subl_promotions.non_negative_integer_p(end))) {
            throw new AssertionError(end);
        }
        return new_iterator(make_file_form_iterator_state(filename, start, end), $sym110$FILE_FORM_ITERATOR_DONE_, FILE_FORM_ITERATOR_NEXT, FILE_FORM_ITERATOR_FINALIZE);
    }

    public static SubLObject make_file_form_iterator_state(final SubLObject filename, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
        try {
            stream_macros.$stream_requires_locking$.bind(NIL, thread);
            stream = compatibility.open_text(filename, $INPUT);
        } finally {
            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
        }
        SubLObject i;
        SubLObject form;
        for (i = NIL, i = ZERO_INTEGER; i.numL(start); i = add(i, ONE_INTEGER)) {
            form = read(stream, NIL, $EOF, UNPROVIDED);
            if (form == $EOF) {
                doneP = T;
            } else {
                index = add(index, ONE_INTEGER);
            }
        }
        final SubLObject state = list(stream, index, end, doneP);
        return state;
    }

    public static SubLObject file_form_iterator_doneP(final SubLObject state) {
        SubLObject stream = NIL;
        SubLObject index = NIL;
        SubLObject end = NIL;
        SubLObject doneP = NIL;
        destructuring_bind_must_consp(state, state, $list115);
        stream = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list115);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list115);
        end = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list115);
        doneP = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((((NIL != doneP) || ((NIL != end) && index.numGE(end))) || (!stream.isStream())) || (NIL == open_stream_p(stream)));
        }
        cdestructuring_bind_error(state, $list115);
        return NIL;
    }

    public static SubLObject file_form_iterator_next(final SubLObject state) {
        SubLObject stream = NIL;
        SubLObject index = NIL;
        SubLObject end = NIL;
        SubLObject doneP = NIL;
        destructuring_bind_must_consp(state, state, $list115);
        stream = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list115);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list115);
        end = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list115);
        doneP = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list115);
            return NIL;
        }
        final SubLObject form = read(stream, NIL, $EOF, UNPROVIDED);
        if (form == $EOF) {
            close(stream, UNPROVIDED);
            stream = $CLOSED;
            doneP = T;
            set_nth(ZERO_INTEGER, state, stream);
            set_nth(THREE_INTEGER, state, doneP);
            return subl_promotions.values3(NIL, state, T);
        }
        index = add(index, ONE_INTEGER);
        set_nth(ONE_INTEGER, state, index);
        return subl_promotions.values3(form, state, NIL);
    }

    public static SubLObject file_form_iterator_finalize(final SubLObject state) {
        SubLObject stream = NIL;
        destructuring_bind_must_consp(state, state, $list117);
        stream = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        if (stream.isStream() && (NIL != open_stream_p(stream))) {
            close(stream, UNPROVIDED);
            stream = $CLOSED;
            set_nth(ZERO_INTEGER, state, stream);
            set_nth(THREE_INTEGER, state, T);
            return T;
        }
        return NIL;
    }

    /**
     * Returns an iterator that lazily initializes itself from CONSTRUCTOR and evaluatable ARG-FORMS.
     * This iterator is useful when a set of expensive-to-make iterators (each wrapped in a lazy iterator)
     * is involved in one of the other meta iterators (e.g. new-iterator-iterator or
     * new-rotating-iterator-iterator).
     */
    @LispMethod(comment = "Returns an iterator that lazily initializes itself from CONSTRUCTOR and evaluatable ARG-FORMS.\r\nThis iterator is useful when a set of expensive-to-make iterators (each wrapped in a lazy iterator)\r\nis involved in one of the other meta iterators (e.g. new-iterator-iterator or\r\nnew-rotating-iterator-iterator).\nReturns an iterator that lazily initializes itself from CONSTRUCTOR and evaluatable ARG-FORMS.\nThis iterator is useful when a set of expensive-to-make iterators (each wrapped in a lazy iterator)\nis involved in one of the other meta iterators (e.g. new-iterator-iterator or\nnew-rotating-iterator-iterator).")
    public static final SubLObject new_lazy_iterator_alt(SubLObject constructor, SubLObject arg_forms) {
        SubLTrampolineFile.checkType(constructor, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(arg_forms, LISTP);
        {
            SubLObject lazy_iterator = new_iterator(NIL, symbol_function(LAZY_ITERATOR_DONE), symbol_function(LAZY_ITERATOR_NEXT), UNPROVIDED);
            _csetf_it_state(lazy_iterator, list(lazy_iterator, constructor, arg_forms));
            return lazy_iterator;
        }
    }

    /**
     * Returns an iterator that lazily initializes itself from CONSTRUCTOR and evaluatable ARG-FORMS.
     * This iterator is useful when a set of expensive-to-make iterators (each wrapped in a lazy iterator)
     * is involved in one of the other meta iterators (e.g. new-iterator-iterator or
     * new-rotating-iterator-iterator).
     */
    @LispMethod(comment = "Returns an iterator that lazily initializes itself from CONSTRUCTOR and evaluatable ARG-FORMS.\r\nThis iterator is useful when a set of expensive-to-make iterators (each wrapped in a lazy iterator)\r\nis involved in one of the other meta iterators (e.g. new-iterator-iterator or\r\nnew-rotating-iterator-iterator).\nReturns an iterator that lazily initializes itself from CONSTRUCTOR and evaluatable ARG-FORMS.\nThis iterator is useful when a set of expensive-to-make iterators (each wrapped in a lazy iterator)\nis involved in one of the other meta iterators (e.g. new-iterator-iterator or\nnew-rotating-iterator-iterator).")
    public static SubLObject new_lazy_iterator(final SubLObject constructor, final SubLObject arg_forms) {
        assert NIL != function_spec_p(constructor) : "! function_spec_p(constructor) " + ("Types.function_spec_p(constructor) " + "CommonSymbols.NIL != Types.function_spec_p(constructor) ") + constructor;
        assert NIL != listp(arg_forms) : "! listp(arg_forms) " + ("Types.listp(arg_forms) " + "CommonSymbols.NIL != Types.listp(arg_forms) ") + arg_forms;
        final SubLObject lazy_iterator = new_iterator(NIL, symbol_function(LAZY_ITERATOR_DONE), symbol_function(LAZY_ITERATOR_NEXT), UNPROVIDED);
        _csetf_it_state(lazy_iterator, list(lazy_iterator, constructor, arg_forms));
        return lazy_iterator;
    }

    /**
     * Returns T IFF the given iterator is an uninitialized lazy iterator.
     */
    @LispMethod(comment = "Returns T IFF the given iterator is an uninitialized lazy iterator.")
    public static final SubLObject lazy_iterator_uninitializedP_alt(SubLObject iterator) {
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        return eq(it_done(iterator), symbol_function(LAZY_ITERATOR_DONE));
    }

    /**
     * Returns T IFF the given iterator is an uninitialized lazy iterator.
     */
    @LispMethod(comment = "Returns T IFF the given iterator is an uninitialized lazy iterator.")
    public static SubLObject lazy_iterator_uninitializedP(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        return eq(it_done(iterator), symbol_function(LAZY_ITERATOR_DONE));
    }

    /**
     * Returns T IFF the given iterator is a valid uninitialized lazy iterator.
     */
    @LispMethod(comment = "Returns T IFF the given iterator is a valid uninitialized lazy iterator.")
    public static final SubLObject lazy_iterator_valid_uninitializedP_alt(SubLObject iterator) {
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        if (!((it_state(iterator).isCons() && (it_done(iterator) == symbol_function(LAZY_ITERATOR_DONE))) && (it_next(iterator) == symbol_function(LAZY_ITERATOR_NEXT)))) {
            return NIL;
        }
        if (iterator == it_state(iterator).first()) {
            return T;
        } else {
            return NIL;
        }
    }

    /**
     * Returns T IFF the given iterator is a valid uninitialized lazy iterator.
     */
    @LispMethod(comment = "Returns T IFF the given iterator is a valid uninitialized lazy iterator.")
    public static SubLObject lazy_iterator_valid_uninitializedP(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        if (((!it_state(iterator).isCons()) || (!it_done(iterator).eql(symbol_function(LAZY_ITERATOR_DONE)))) || (!it_next(iterator).eql(symbol_function(LAZY_ITERATOR_NEXT)))) {
            return NIL;
        }
        if (iterator.eql(it_state(iterator).first())) {
            return T;
        }
        return NIL;
    }

    /**
     * Returns the lazily initialized iterator constructed from the given uninitialized STATE.
     */
    @LispMethod(comment = "Returns the lazily initialized iterator constructed from the given uninitialized STATE.")
    public static final SubLObject initialize_lazy_iterator_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject lazy_iterator = NIL;
                SubLObject constructor = NIL;
                SubLObject arg_forms = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt94);
                lazy_iterator = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt94);
                constructor = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt94);
                arg_forms = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == $within_print_iterator$.getDynamicValue(thread)) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == lazy_iterator_valid_uninitializedP(lazy_iterator)) {
                                Errors.error($str_alt95$_A_is_not_a_well_formed_uninitial, lazy_iterator);
                            }
                        }
                    }
                    {
                        SubLObject args = Mapping.mapcar(CYC_API_EVAL, arg_forms);
                        SubLObject iterator = apply(constructor, args);
                        SubLObject doneP = NIL;
                        while (NIL == doneP) {
                            if (NIL != lazy_iterator_valid_uninitializedP(iterator)) {
                                iterator = initialize_lazy_iterator(it_state(iterator));
                            } else {
                                doneP = T;
                            }
                        } 
                        _csetf_it_state(lazy_iterator, it_state(iterator));
                        _csetf_it_done(lazy_iterator, it_done(iterator));
                        _csetf_it_next(lazy_iterator, it_next(iterator));
                        _csetf_it_finalize(lazy_iterator, it_finalize(iterator));
                    }
                    return lazy_iterator;
                } else {
                    cdestructuring_bind_error(datum, $list_alt94);
                }
            }
            return NIL;
        }
    }

    /**
     * Returns the lazily initialized iterator constructed from the given uninitialized STATE.
     */
    @LispMethod(comment = "Returns the lazily initialized iterator constructed from the given uninitialized STATE.")
    public static SubLObject initialize_lazy_iterator(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lazy_iterator = NIL;
        SubLObject constructor = NIL;
        SubLObject arg_forms = NIL;
        destructuring_bind_must_consp(state, state, $list120);
        lazy_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list120);
        constructor = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list120);
        arg_forms = current.first();
        current = current.rest();
        if (NIL == current) {
            if (((NIL == $within_print_iterator$.getDynamicValue(thread)) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == lazy_iterator_valid_uninitializedP(lazy_iterator))) {
                Errors.error($str121$_A_is_not_a_well_formed_uninitial, lazy_iterator);
            }
            final SubLObject args = Mapping.mapcar(CYC_API_EVAL, arg_forms);
            SubLObject iterator = apply(constructor, args);
            SubLObject doneP = NIL;
            while (NIL == doneP) {
                if (NIL != lazy_iterator_valid_uninitializedP(iterator)) {
                    iterator = initialize_lazy_iterator(it_state(iterator));
                } else {
                    doneP = T;
                }
            } 
            _csetf_it_state(lazy_iterator, it_state(iterator));
            _csetf_it_done(lazy_iterator, it_done(iterator));
            _csetf_it_next(lazy_iterator, it_next(iterator));
            _csetf_it_finalize(lazy_iterator, it_finalize(iterator));
            return lazy_iterator;
        }
        cdestructuring_bind_error(state, $list120);
        return NIL;
    }

    /**
     * Returns T IFF the iteration is done by initializing the iterator from STATE and trampolining to it.
     */
    @LispMethod(comment = "Returns T IFF the iteration is done by initializing the iterator from STATE and trampolining to it.")
    public static final SubLObject lazy_iterator_done_alt(SubLObject state) {
        SubLTrampolineFile.checkType(state, CONSP);
        return iteration_done(initialize_lazy_iterator(state));
    }

    /**
     * Returns T IFF the iteration is done by initializing the iterator from STATE and trampolining to it.
     */
    @LispMethod(comment = "Returns T IFF the iteration is done by initializing the iterator from STATE and trampolining to it.")
    public static SubLObject lazy_iterator_done(final SubLObject state) {
        assert NIL != consp(state) : "! consp(state) " + ("Types.consp(state) " + "CommonSymbols.NIL != Types.consp(state) ") + state;
        return iteration_done(initialize_lazy_iterator(state));
    }

    /**
     * Returns the next item from the iteration by initializing the iterator from STATE and trampolining to it.
     */
    @LispMethod(comment = "Returns the next item from the iteration by initializing the iterator from STATE and trampolining to it.")
    public static final SubLObject lazy_iterator_next_alt(SubLObject state) {
        SubLTrampolineFile.checkType(state, CONSP);
        return iteration_next(initialize_lazy_iterator(state));
    }

    /**
     * Returns the next item from the iteration by initializing the iterator from STATE and trampolining to it.
     */
    @LispMethod(comment = "Returns the next item from the iteration by initializing the iterator from STATE and trampolining to it.")
    public static SubLObject lazy_iterator_next(final SubLObject state) {
        assert NIL != consp(state) : "! consp(state) " + ("Types.consp(state) " + "CommonSymbols.NIL != Types.consp(state) ") + state;
        return iteration_next(initialize_lazy_iterator(state));
    }

    /**
     * Return an iterator that transforms the values from another ITERATOR.
     * TRANSFORM is funcalled on each result from ITERATOR.
     */
    @LispMethod(comment = "Return an iterator that transforms the values from another ITERATOR.\r\nTRANSFORM is funcalled on each result from ITERATOR.\nReturn an iterator that transforms the values from another ITERATOR.\nTRANSFORM is funcalled on each result from ITERATOR.")
    public static final SubLObject new_indirect_iterator_alt(SubLObject iterator, SubLObject transform, SubLObject finalize) {
        if (transform == UNPROVIDED) {
            transform = symbol_function(IDENTITY);
        }
        if (finalize == UNPROVIDED) {
            finalize = ITERATE_INDIRECT_FINALIZE;
        }
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        SubLTrampolineFile.checkType(transform, FUNCTION_SPEC_P);
        return new_iterator(make_iterator_indirect_state(iterator, transform), DEFAULT_ITERATOR_DONE_P, ITERATE_INDIRECT_NEXT, finalize);
    }

    /**
     * Return an iterator that transforms the values from another ITERATOR.
     * TRANSFORM is funcalled on each result from ITERATOR.
     */
    @LispMethod(comment = "Return an iterator that transforms the values from another ITERATOR.\r\nTRANSFORM is funcalled on each result from ITERATOR.\nReturn an iterator that transforms the values from another ITERATOR.\nTRANSFORM is funcalled on each result from ITERATOR.")
    public static SubLObject new_indirect_iterator(final SubLObject iterator, SubLObject transform, SubLObject finalize) {
        if (transform == UNPROVIDED) {
            transform = symbol_function(IDENTITY);
        }
        if (finalize == UNPROVIDED) {
            finalize = ITERATE_INDIRECT_FINALIZE;
        }
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        assert NIL != function_spec_p(transform) : "! function_spec_p(transform) " + ("Types.function_spec_p(transform) " + "CommonSymbols.NIL != Types.function_spec_p(transform) ") + transform;
        return new_iterator(make_iterator_indirect_state(iterator, transform), DEFAULT_ITERATOR_DONE_P, ITERATE_INDIRECT_NEXT, finalize);
    }

    public static final SubLObject make_iterator_indirect_state_alt(SubLObject iterator, SubLObject transform) {
        {
            SubLObject current = iterator;
            return list(current, transform);
        }
    }

    public static SubLObject make_iterator_indirect_state(final SubLObject iterator, final SubLObject transform) {
        return list(iterator, misc_utilities.function_spec_function(transform));
    }

    public static final SubLObject iterate_indirect_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject current_14 = NIL;
                SubLObject transform = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt100);
                current_14 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt100);
                transform = current.first();
                current = current.rest();
                if (NIL == current) {
                    thread.resetMultipleValues();
                    {
                        SubLObject next = iteration_next(current_14);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == valid) {
                            {
                                SubLObject update = $DONE;
                                rplaca(state, update);
                                rplacd(state, NIL);
                                return values(NIL, state, T);
                            }
                        }
                        if (symbol_function(IDENTITY) != transform) {
                            next = funcall(transform, next);
                        }
                        return values(next, state, NIL);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt100);
                }
            }
            return NIL;
        }
    }

    public static SubLObject iterate_indirect_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_$14 = NIL;
        SubLObject transform = NIL;
        destructuring_bind_must_consp(state, state, $list126);
        current_$14 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list126);
        transform = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list126);
            return NIL;
        }
        thread.resetMultipleValues();
        SubLObject next = iteration_next(current_$14);
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == valid) {
            final SubLObject update = $DONE;
            rplaca(state, update);
            rplacd(state, NIL);
            return subl_promotions.values3(NIL, state, T);
        }
        if (!symbol_function(IDENTITY).eql(transform)) {
            next = funcall(transform, next);
        }
        return subl_promotions.values3(next, state, NIL);
    }

    public static final SubLObject iterate_indirect_finalize_alt(SubLObject state) {
        {
            SubLObject current = state.first();
            return NIL != iterator_p(current) ? ((SubLObject) (iteration_finalize(current))) : T;
        }
    }

    public static SubLObject iterate_indirect_finalize(final SubLObject state) {
        final SubLObject current = state.first();
        return NIL != iterator_p(current) ? iteration_finalize(current) : T;
    }

    /**
     * Returns an iterator that sequences through the iterators generated by
     * applying each constructor in CONSTRUCTORS to DATA.
     */
    @LispMethod(comment = "Returns an iterator that sequences through the iterators generated by\r\napplying each constructor in CONSTRUCTORS to DATA.\nReturns an iterator that sequences through the iterators generated by\napplying each constructor in CONSTRUCTORS to DATA.")
    public static final SubLObject new_factory_iterator_alt(SubLObject constructors, SubLObject data, SubLObject finalize) {
        if (data == UNPROVIDED) {
            data = NIL;
        }
        if (finalize == UNPROVIDED) {
            finalize = ITERATE_FACTORY_FINALIZE;
        }
        SubLTrampolineFile.checkType(constructors, LISTP);
        return new_iterator(make_iterator_factory_state(constructors, data), DEFAULT_ITERATOR_DONE_P, ITERATE_FACTORY_NEXT, finalize);
    }

    /**
     * Returns an iterator that sequences through the iterators generated by
     * applying each constructor in CONSTRUCTORS to DATA.
     */
    @LispMethod(comment = "Returns an iterator that sequences through the iterators generated by\r\napplying each constructor in CONSTRUCTORS to DATA.\nReturns an iterator that sequences through the iterators generated by\napplying each constructor in CONSTRUCTORS to DATA.")
    public static SubLObject new_factory_iterator(final SubLObject constructors, SubLObject data, SubLObject finalize) {
        if (data == UNPROVIDED) {
            data = NIL;
        }
        if (finalize == UNPROVIDED) {
            finalize = ITERATE_FACTORY_FINALIZE;
        }
        assert NIL != listp(constructors) : "! listp(constructors) " + ("Types.listp(constructors) " + "CommonSymbols.NIL != Types.listp(constructors) ") + constructors;
        return new_iterator(make_iterator_factory_state(constructors, data), DEFAULT_ITERATOR_DONE_P, ITERATE_FACTORY_NEXT, finalize);
    }

    public static final SubLObject make_iterator_factory_state_alt(SubLObject constructors, SubLObject data) {
        {
            SubLObject current = $UNINITIALIZED;
            SubLObject mode = $START;
            return list(current, mode, constructors, data);
        }
    }

    public static SubLObject make_iterator_factory_state(final SubLObject constructors, final SubLObject data) {
        final SubLObject current = $UNINITIALIZED;
        final SubLObject mode = $START;
        return list(current, mode, constructors, data);
    }

    public static final SubLObject iterate_factory_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            while (true) {
                {
                    SubLObject datum = state;
                    SubLObject current = datum;
                    SubLObject current_15 = NIL;
                    SubLObject mode = NIL;
                    SubLObject constructors = NIL;
                    SubLObject data = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    current_15 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    mode = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    constructors = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    data = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = mode;
                            if (pcase_var.eql($START)) {
                                {
                                    SubLObject update = $UNINITIALIZED;
                                    SubLObject new_mode = $CONSTRUCT;
                                    set_nth(ZERO_INTEGER, state, update);
                                    set_nth(ONE_INTEGER, state, new_mode);
                                }
                            } else {
                                if (pcase_var.eql($CONSTRUCT)) {
                                    if (NIL == constructors) {
                                        {
                                            SubLObject update = $UNINITIALIZED;
                                            SubLObject new_mode = $DONE;
                                            set_nth(ZERO_INTEGER, state, update);
                                            set_nth(ONE_INTEGER, state, new_mode);
                                            set_nth(THREE_INTEGER, state, $UNINITIALIZED);
                                        }
                                    } else {
                                        {
                                            SubLObject datum_16 = constructors;
                                            SubLObject current_17 = datum_16;
                                            SubLObject next_constructor = NIL;
                                            SubLObject rest_constructors = NIL;
                                            destructuring_bind_must_consp(current_17, datum_16, $list_alt106);
                                            next_constructor = current_17.first();
                                            current_17 = current_17.rest();
                                            rest_constructors = current_17;
                                            {
                                                SubLObject update = apply(next_constructor, data);
                                                SubLObject new_mode = $SUBITERATE;
                                                set_nth(ZERO_INTEGER, state, update);
                                                set_nth(ONE_INTEGER, state, new_mode);
                                                set_nth(TWO_INTEGER, state, rest_constructors);
                                            }
                                        }
                                    }
                                } else {
                                    if (pcase_var.eql($DONE)) {
                                        return values(NIL, state, T);
                                    } else {
                                        SubLTrampolineFile.checkType(current_15, ITERATOR_P);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject next = iteration_next(current_15);
                                            SubLObject valid = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != valid) {
                                                return values(next, state, NIL);
                                            }
                                            {
                                                SubLObject update = $UNINITIALIZED;
                                                SubLObject new_mode = $CONSTRUCT;
                                                set_nth(ZERO_INTEGER, state, update);
                                                set_nth(ONE_INTEGER, state, new_mode);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt104);
                    }
                }
            } 
        }
    }

    public static SubLObject iterate_factory_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (true) {
            SubLObject current_$15 = NIL;
            SubLObject mode = NIL;
            SubLObject constructors = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(state, state, $list130);
            current_$15 = state.first();
            SubLObject current = state.rest();
            destructuring_bind_must_consp(current, state, $list130);
            mode = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, state, $list130);
            constructors = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, state, $list130);
            data = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = mode;
                if (pcase_var.eql($START)) {
                    final SubLObject update = $UNINITIALIZED;
                    final SubLObject new_mode = $CONSTRUCT;
                    set_nth(ZERO_INTEGER, state, update);
                    set_nth(ONE_INTEGER, state, new_mode);
                } else
                    if (pcase_var.eql($CONSTRUCT)) {
                        if (NIL == constructors) {
                            final SubLObject update = $UNINITIALIZED;
                            final SubLObject new_mode = $DONE;
                            set_nth(ZERO_INTEGER, state, update);
                            set_nth(ONE_INTEGER, state, new_mode);
                            set_nth(THREE_INTEGER, state, $UNINITIALIZED);
                        } else {
                            SubLObject current_$16;
                            final SubLObject datum_$16 = current_$16 = constructors;
                            SubLObject next_constructor = NIL;
                            SubLObject rest_constructors = NIL;
                            destructuring_bind_must_consp(current_$16, datum_$16, $list132);
                            next_constructor = current_$16.first();
                            current_$16 = rest_constructors = current_$16.rest();
                            final SubLObject update2 = apply(next_constructor, data);
                            final SubLObject new_mode2 = $SUBITERATE;
                            set_nth(ZERO_INTEGER, state, update2);
                            set_nth(ONE_INTEGER, state, new_mode2);
                            set_nth(TWO_INTEGER, state, rest_constructors);
                        }
                    } else {
                        if (pcase_var.eql($DONE)) {
                            return subl_promotions.values3(NIL, state, T);
                        }
                        assert NIL != iterator_p(current_$15) : "! iteration.iterator_p(current_$15) " + ("iteration.iterator_p(current_$15) " + "CommonSymbols.NIL != iteration.iterator_p(current_$15) ") + current_$15;
                        thread.resetMultipleValues();
                        final SubLObject next = iteration_next(current_$15);
                        final SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            return subl_promotions.values3(next, state, NIL);
                        }
                        final SubLObject update3 = $UNINITIALIZED;
                        final SubLObject new_mode3 = $CONSTRUCT;
                        set_nth(ZERO_INTEGER, state, update3);
                        set_nth(ONE_INTEGER, state, new_mode3);
                    }

            } else {
                cdestructuring_bind_error(state, $list130);
            }
        } 
    }

    public static final SubLObject iterate_factory_finalize_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_18 = NIL;
            SubLObject mode = NIL;
            SubLObject constructors = NIL;
            SubLObject data = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt104);
            current_18 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt104);
            mode = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt104);
            constructors = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt104);
            data = current.first();
            current = current.rest();
            if (NIL == current) {
                return NIL != iterator_p(current_18) ? ((SubLObject) (iteration_finalize(current_18))) : T;
            } else {
                cdestructuring_bind_error(datum, $list_alt104);
            }
        }
        return NIL;
    }

    public static SubLObject iterate_factory_finalize(final SubLObject state) {
        SubLObject current_$18 = NIL;
        SubLObject mode = NIL;
        SubLObject constructors = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(state, state, $list130);
        current_$18 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list130);
        mode = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list130);
        constructors = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list130);
        data = current.first();
        current = current.rest();
        if (NIL == current) {
            return NIL != iterator_p(current_$18) ? iteration_finalize(current_$18) : T;
        }
        cdestructuring_bind_error(state, $list130);
        return NIL;
    }

    public static SubLObject new_meta_iterator_iterator(final SubLObject meta_iterator) {
        assert NIL != iterator_p(meta_iterator) : "! iteration.iterator_p(meta_iterator) " + ("iteration.iterator_p(meta_iterator) " + "CommonSymbols.NIL != iteration.iterator_p(meta_iterator) ") + meta_iterator;
        final SubLObject state = make_meta_iterator_iterator_state(meta_iterator);
        return new_iterator(state, META_ITERATOR_ITERATOR_DONE, META_ITERATOR_ITERATOR_NEXT, META_ITERATOR_ITERATOR_FINALIZE);
    }

    public static SubLObject make_meta_iterator_iterator_state(final SubLObject meta_iterator) {
        final SubLObject state = list($EXHAUSTED, meta_iterator);
        return state;
    }

    public static SubLObject meta_iterator_iterator_done(final SubLObject state) {
        SubLObject object_iterator = NIL;
        SubLObject meta_iterator = NIL;
        destructuring_bind_must_consp(state, state, $list138);
        object_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list138);
        meta_iterator = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(((object_iterator == $EXHAUSTED) || (NIL != iteration_done(object_iterator))) && ((meta_iterator == $EXHAUSTED) || (NIL != iteration_done(meta_iterator))));
        }
        cdestructuring_bind_error(state, $list138);
        return NIL;
    }

    public static SubLObject meta_iterator_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject object_iterator = NIL;
        SubLObject meta_iterator = NIL;
        destructuring_bind_must_consp(state, state, $list138);
        object_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list138);
        meta_iterator = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list138);
            return NIL;
        }
        if (NIL != iterator_p(object_iterator)) {
            thread.resetMultipleValues();
            final SubLObject next_item = iteration_next(object_iterator);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != validP) {
                return subl_promotions.values3(next_item, state, NIL);
            }
            set_nth(ZERO_INTEGER, state, $EXHAUSTED);
            return meta_iterator_iterator_next(state);
        } else {
            if (NIL == iterator_p(meta_iterator)) {
                return subl_promotions.values3(NIL, state, T);
            }
            thread.resetMultipleValues();
            final SubLObject next_object_iterator = iteration_next(meta_iterator);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != validP) {
                set_nth(ZERO_INTEGER, state, next_object_iterator);
                return meta_iterator_iterator_next(state);
            }
            set_nth(ONE_INTEGER, state, $EXHAUSTED);
            return subl_promotions.values3(NIL, state, T);
        }
    }

    public static SubLObject meta_iterator_iterator_finalize(final SubLObject state) {
        SubLObject object_iterator = NIL;
        SubLObject meta_iterator = NIL;
        destructuring_bind_must_consp(state, state, $list138);
        object_iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list138);
        meta_iterator = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != iterator_p(object_iterator)) {
                return iteration_finalize(object_iterator);
            }
            if (NIL != iterator_p(meta_iterator)) {
                return iteration_finalize(meta_iterator);
            }
        } else {
            cdestructuring_bind_error(state, $list138);
        }
        return T;
    }

    /**
     * Returns an iterator that sequences through the iterators in ITERATORS.
     */
    @LispMethod(comment = "Returns an iterator that sequences through the iterators in ITERATORS.")
    public static final SubLObject new_iterator_iterator_alt(SubLObject iterators) {
        SubLTrampolineFile.checkType(iterators, LISTP);
        if (NIL == iterators) {
            return new_null_iterator();
        } else {
            if (NIL != singletonP(iterators)) {
                return iterators.first();
            } else {
                {
                    SubLObject state = make_iterator_iterator_state(iterators);
                    return new_iterator(state, ITERATOR_ITERATOR_DONE, ITERATOR_ITERATOR_NEXT, ITERATOR_ITERATOR_FINALIZE);
                }
            }
        }
    }

    /**
     * Returns an iterator that sequences through the iterators in ITERATORS.
     */
    @LispMethod(comment = "Returns an iterator that sequences through the iterators in ITERATORS.")
    public static SubLObject new_iterator_iterator(final SubLObject iterators) {
        assert NIL != listp(iterators) : "! listp(iterators) " + ("Types.listp(iterators) " + "CommonSymbols.NIL != Types.listp(iterators) ") + iterators;
        if (NIL == iterators) {
            return new_null_iterator();
        }
        if (NIL != list_utilities.singletonP(iterators)) {
            return iterators.first();
        }
        final SubLObject state = make_iterator_iterator_state(iterators);
        return new_iterator(state, ITERATOR_ITERATOR_DONE, ITERATOR_ITERATOR_NEXT, ITERATOR_ITERATOR_FINALIZE);
    }

    /**
     * Returns the list of iterators that are sequenced through by ITERATOR.
     */
    @LispMethod(comment = "Returns the list of iterators that are sequenced through by ITERATOR.")
    public static final SubLObject get_iterator_iterator_iterators_alt(SubLObject iterator) {
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        {
            SubLObject state = it_state(iterator);
            if (NIL != singletonP(state)) {
                return list(state);
            } else {
                return state;
            }
        }
    }

    /**
     * Returns the list of iterators that are sequenced through by ITERATOR.
     */
    @LispMethod(comment = "Returns the list of iterators that are sequenced through by ITERATOR.")
    public static SubLObject get_iterator_iterator_iterators(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        final SubLObject state = it_state(iterator);
        if (NIL != list_utilities.singletonP(state)) {
            return list(state);
        }
        return state;
    }

    public static final SubLObject make_iterator_iterator_state_alt(SubLObject iterators) {
        {
            SubLObject cdolist_list_var = iterators;
            SubLObject iterator = NIL;
            for (iterator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , iterator = cdolist_list_var.first()) {
                SubLTrampolineFile.checkType(iterator, ITERATOR_P);
            }
        }
        return iterators;
    }

    public static SubLObject make_iterator_iterator_state(final SubLObject iterators) {
        SubLObject cdolist_list_var = iterators;
        SubLObject iterator = NIL;
        iterator = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
            cdolist_list_var = cdolist_list_var.rest();
            iterator = cdolist_list_var.first();
        } 
        return iterators;
    }

    /**
     * Returns T IFF the iterators are exhausted.  STATE can be NIL when all
     * of the iterators have been processed, or can be a singleton or can be a list
     * of iterators.
     */
    @LispMethod(comment = "Returns T IFF the iterators are exhausted.  STATE can be NIL when all\r\nof the iterators have been processed, or can be a singleton or can be a list\r\nof iterators.\nReturns T IFF the iterators are exhausted.  STATE can be NIL when all\nof the iterators have been processed, or can be a singleton or can be a list\nof iterators.")
    public static final SubLObject iterator_iterator_done_alt(SubLObject state) {
        if (NIL == state) {
            return T;
        } else {
            if (state.isCons()) {
                {
                    SubLObject cdolist_list_var = state;
                    SubLObject iterator = NIL;
                    for (iterator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , iterator = cdolist_list_var.first()) {
                        if (NIL == iteration_done(iterator)) {
                            return NIL;
                        }
                    }
                }
                return T;
            } else {
                return iteration_done(state);
            }
        }
    }

    /**
     * Returns T IFF the iterators are exhausted.  STATE can be NIL when all
     * of the iterators have been processed, or can be a singleton or can be a list
     * of iterators.
     */
    @LispMethod(comment = "Returns T IFF the iterators are exhausted.  STATE can be NIL when all\r\nof the iterators have been processed, or can be a singleton or can be a list\r\nof iterators.\nReturns T IFF the iterators are exhausted.  STATE can be NIL when all\nof the iterators have been processed, or can be a singleton or can be a list\nof iterators.")
    public static SubLObject iterator_iterator_done(final SubLObject state) {
        if (NIL == state) {
            return T;
        }
        if (state.isCons()) {
            SubLObject cdolist_list_var = state;
            SubLObject iterator = NIL;
            iterator = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == iteration_done(iterator)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                iterator = cdolist_list_var.first();
            } 
            return T;
        }
        return iteration_done(state);
    }

    public static final SubLObject iterator_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject working_state = state;
                SubLObject next = NIL;
                SubLObject valid_nextP = NIL;
                SubLObject premature_endP = NIL;
                while (!((NIL != valid_nextP) || (NIL != premature_endP))) {
                    {
                        SubLObject current = working_state.first();
                        if (NIL != iteration_done(current)) {
                            working_state = working_state.rest();
                            premature_endP = sublisp_null(working_state);
                        } else {
                            thread.resetMultipleValues();
                            {
                                SubLObject value = iteration_next(current);
                                SubLObject validP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != validP) {
                                    next = value;
                                    valid_nextP = T;
                                }
                            }
                        }
                    }
                } 
                return values(next, working_state, premature_endP);
            }
        }
    }

    public static SubLObject iterator_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject working_state = state;
        SubLObject next = NIL;
        SubLObject valid_nextP = NIL;
        SubLObject premature_endP = NIL;
        while ((NIL == valid_nextP) && (NIL == premature_endP)) {
            final SubLObject current = working_state.first();
            if (NIL != iteration_done(current)) {
                working_state = working_state.rest();
                premature_endP = sublisp_null(working_state);
            } else {
                thread.resetMultipleValues();
                final SubLObject value = iteration_next(current);
                final SubLObject validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == validP) {
                    continue;
                }
                next = value;
                valid_nextP = T;
            }
        } 
        return subl_promotions.values3(next, working_state, premature_endP);
    }

    public static final SubLObject iterator_iterator_finalize_alt(SubLObject state) {
        {
            SubLObject cdolist_list_var = state;
            SubLObject iterator = NIL;
            for (iterator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , iterator = cdolist_list_var.first()) {
                iteration_finalize(iterator);
            }
        }
        return T;
    }

    public static SubLObject iterator_iterator_finalize(final SubLObject state) {
        SubLObject cdolist_list_var = state;
        SubLObject iterator = NIL;
        iterator = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            iteration_finalize(iterator);
            cdolist_list_var = cdolist_list_var.rest();
            iterator = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     * Returns an iterator that sequences through the iterators in ITERATORS,
     * returning one item from each in rotation until they are exhausted.
     */
    @LispMethod(comment = "Returns an iterator that sequences through the iterators in ITERATORS,\r\nreturning one item from each in rotation until they are exhausted.\nReturns an iterator that sequences through the iterators in ITERATORS,\nreturning one item from each in rotation until they are exhausted.")
    public static final SubLObject new_rotating_iterator_iterator_alt(SubLObject iterators) {
        SubLTrampolineFile.checkType(iterators, LISTP);
        if (NIL == iterators) {
            return new_null_iterator();
        } else {
            if (NIL != singletonP(iterators)) {
                return iterators.first();
            } else {
                return new_iterator(make_rotating_iterator_iterator_state(iterators), ROTATING_ITERATOR_ITERATOR_DONE, ROTATING_ITERATOR_ITERATOR_NEXT, ROTATING_ITERATOR_ITERATOR_FINALIZE);
            }
        }
    }

    /**
     * Returns an iterator that sequences through the iterators in ITERATORS,
     * returning one item from each in rotation until they are exhausted.
     */
    @LispMethod(comment = "Returns an iterator that sequences through the iterators in ITERATORS,\r\nreturning one item from each in rotation until they are exhausted.\nReturns an iterator that sequences through the iterators in ITERATORS,\nreturning one item from each in rotation until they are exhausted.")
    public static SubLObject new_rotating_iterator_iterator(final SubLObject iterators) {
        assert NIL != listp(iterators) : "! listp(iterators) " + ("Types.listp(iterators) " + "CommonSymbols.NIL != Types.listp(iterators) ") + iterators;
        if (NIL == iterators) {
            return new_null_iterator();
        }
        if (NIL != list_utilities.singletonP(iterators)) {
            return iterators.first();
        }
        return new_iterator(make_rotating_iterator_iterator_state(iterators), ROTATING_ITERATOR_ITERATOR_DONE, ROTATING_ITERATOR_ITERATOR_NEXT, ROTATING_ITERATOR_ITERATOR_FINALIZE);
    }

    /**
     * Validates the given ITERATORS.
     */
    @LispMethod(comment = "Validates the given ITERATORS.")
    public static final SubLObject validate_iterators_alt(SubLObject iterators, SubLObject where_message) {
        if (where_message == UNPROVIDED) {
            where_message = $str_alt114$;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(iterators, LISTP);
            {
                SubLObject cdolist_list_var = iterators;
                SubLObject iterator = NIL;
                for (iterator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , iterator = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(iterator, ITERATOR_P);
                    if (NIL == $within_print_iterator$.getDynamicValue(thread)) {
                        if (NIL != lazy_iterator_uninitializedP(iterator)) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == lazy_iterator_valid_uninitializedP(iterator)) {
                                    Errors.error($str_alt115$invalid_lazy_iterator_found_in_me, where_message, iterator);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Validates the given ITERATORS.
     */
    @LispMethod(comment = "Validates the given ITERATORS.")
    public static SubLObject validate_iterators(final SubLObject iterators, SubLObject where_message) {
        if (where_message == UNPROVIDED) {
            where_message = $str145$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(iterators) : "! listp(iterators) " + ("Types.listp(iterators) " + "CommonSymbols.NIL != Types.listp(iterators) ") + iterators;
        SubLObject cdolist_list_var = iterators;
        SubLObject iterator = NIL;
        iterator = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
            if ((((NIL == $within_print_iterator$.getDynamicValue(thread)) && (NIL != lazy_iterator_uninitializedP(iterator))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == lazy_iterator_valid_uninitializedP(iterator))) {
                Errors.error($str146$invalid_lazy_iterator_found_in_me, where_message, iterator);
            }
            cdolist_list_var = cdolist_list_var.rest();
            iterator = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Returns the list of iterators that are sequenced through in rotation by ITERATOR.
     */
    @LispMethod(comment = "Returns the list of iterators that are sequenced through in rotation by ITERATOR.")
    public static final SubLObject get_rotating_iterator_iterator_iterators_alt(SubLObject iterator) {
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        return second(it_state(iterator));
    }

    /**
     * Returns the list of iterators that are sequenced through in rotation by ITERATOR.
     */
    @LispMethod(comment = "Returns the list of iterators that are sequenced through in rotation by ITERATOR.")
    public static SubLObject get_rotating_iterator_iterator_iterators(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        return second(it_state(iterator));
    }

    public static final SubLObject make_rotating_iterator_iterator_state_alt(SubLObject iterators) {
        validate_iterators(iterators, $str_alt116$in_make_rotating_iterator_iterato);
        return list(ZERO_INTEGER, iterators);
    }

    public static SubLObject make_rotating_iterator_iterator_state(final SubLObject iterators) {
        validate_iterators(iterators, $str147$in_make_rotating_iterator_iterato);
        return list(ZERO_INTEGER, iterators);
    }

    public static final SubLObject rotating_iterator_iterator_done_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject index = NIL;
                SubLObject iterators = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt117);
                index = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt117);
                iterators = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == iterators) {
                        return T;
                    }
                    if (NIL != $within_print_iterator$.getDynamicValue(thread)) {
                        return NIL;
                    }
                    {
                        SubLObject cdolist_list_var = iterators;
                        SubLObject iterator = NIL;
                        for (iterator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , iterator = cdolist_list_var.first()) {
                            if (NIL == iteration_done(iterator)) {
                                return NIL;
                            }
                        }
                    }
                    return T;
                } else {
                    cdestructuring_bind_error(datum, $list_alt117);
                }
            }
            return NIL;
        }
    }

    public static SubLObject rotating_iterator_iterator_done(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = NIL;
        SubLObject iterators = NIL;
        destructuring_bind_must_consp(state, state, $list148);
        index = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list148);
        iterators = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list148);
            return NIL;
        }
        if (NIL == iterators) {
            return T;
        }
        if (NIL != $within_print_iterator$.getDynamicValue(thread)) {
            return NIL;
        }
        SubLObject cdolist_list_var = iterators;
        SubLObject iterator = NIL;
        iterator = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == iteration_done(iterator)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            iterator = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject rotating_iterator_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject index = NIL;
                SubLObject iterators = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt117);
                index = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt117);
                iterators = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject premature_endP = sublisp_null(iterators);
                        SubLObject next = NIL;
                        if (NIL != lengthLE(iterators, index, UNPROVIDED)) {
                            index = ZERO_INTEGER;
                        }
                        while (!((NIL != next) || (NIL != premature_endP))) {
                            {
                                SubLObject current_19 = nth(index, iterators);
                                if (NIL != iteration_done(current_19)) {
                                    iteration_finalize(current_19);
                                    iterators = delete(current_19, iterators, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if (NIL == iterators) {
                                        premature_endP = T;
                                    } else {
                                        if (NIL != lengthLE(iterators, index, UNPROVIDED)) {
                                            index = ZERO_INTEGER;
                                        }
                                    }
                                } else {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject value = iteration_next(current_19);
                                        SubLObject validP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != validP) {
                                            next = value;
                                            index = add(index, ONE_INTEGER);
                                        }
                                    }
                                }
                            }
                        } 
                        set_nth(ZERO_INTEGER, state, index);
                        set_nth(ONE_INTEGER, state, iterators);
                        return values(next, state, premature_endP);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt117);
                }
            }
            return NIL;
        }
    }

    public static SubLObject rotating_iterator_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = NIL;
        SubLObject iterators = NIL;
        destructuring_bind_must_consp(state, state, $list148);
        index = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list148);
        iterators = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject premature_endP = sublisp_null(iterators);
            SubLObject next = NIL;
            if (NIL != list_utilities.lengthLE(iterators, index, UNPROVIDED)) {
                index = ZERO_INTEGER;
            }
            while ((NIL == next) && (NIL == premature_endP)) {
                final SubLObject current_$19 = nth(index, iterators);
                if (NIL != iteration_done(current_$19)) {
                    iteration_finalize(current_$19);
                    iterators = delete(current_$19, iterators, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == iterators) {
                        premature_endP = T;
                    } else {
                        if (NIL == list_utilities.lengthLE(iterators, index, UNPROVIDED)) {
                            continue;
                        }
                        index = ZERO_INTEGER;
                    }
                } else {
                    thread.resetMultipleValues();
                    final SubLObject value = iteration_next(current_$19);
                    final SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == validP) {
                        continue;
                    }
                    next = value;
                    index = add(index, ONE_INTEGER);
                }
            } 
            set_nth(ZERO_INTEGER, state, index);
            set_nth(ONE_INTEGER, state, iterators);
            return subl_promotions.values3(next, state, premature_endP);
        }
        cdestructuring_bind_error(state, $list148);
        return NIL;
    }

    public static final SubLObject rotating_iterator_iterator_finalize_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject index = NIL;
            SubLObject iterators = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt117);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt117);
            iterators = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject cdolist_list_var = iterators;
                    SubLObject iterator = NIL;
                    for (iterator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , iterator = cdolist_list_var.first()) {
                        iteration_finalize(iterator);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt117);
            }
        }
        return T;
    }

    public static SubLObject rotating_iterator_iterator_finalize(final SubLObject state) {
        SubLObject index = NIL;
        SubLObject iterators = NIL;
        destructuring_bind_must_consp(state, state, $list148);
        index = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list148);
        iterators = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var = iterators;
            SubLObject iterator = NIL;
            iterator = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                iteration_finalize(iterator);
                cdolist_list_var = cdolist_list_var.rest();
                iterator = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(state, $list148);
        }
        return T;
    }

    /**
     * A reusable iterator is an iterator which may be iterated over multiple times.  This is
     * accomplished by storing the values produced the first time through.  All subsequent iterations
     * work directly from this store.  Thus, subsequent iterations are potentially faster since there
     * is no need to process or filter raw values.  When a reusable iterator is done, it may be reset
     * using RESET-REUSABLE-ITERATOR and iterated through again.  NB: FINALIZE is applied to STATE
     * when RESET-REUSABLE-ITERATOR is applied to the iterator for the first time.
     */
    @LispMethod(comment = "A reusable iterator is an iterator which may be iterated over multiple times.  This is\r\naccomplished by storing the values produced the first time through.  All subsequent iterations\r\nwork directly from this store.  Thus, subsequent iterations are potentially faster since there\r\nis no need to process or filter raw values.  When a reusable iterator is done, it may be reset\r\nusing RESET-REUSABLE-ITERATOR and iterated through again.  NB: FINALIZE is applied to STATE\r\nwhen RESET-REUSABLE-ITERATOR is applied to the iterator for the first time.\nA reusable iterator is an iterator which may be iterated over multiple times.  This is\naccomplished by storing the values produced the first time through.  All subsequent iterations\nwork directly from this store.  Thus, subsequent iterations are potentially faster since there\nis no need to process or filter raw values.  When a reusable iterator is done, it may be reset\nusing RESET-REUSABLE-ITERATOR and iterated through again.  NB: FINALIZE is applied to STATE\nwhen RESET-REUSABLE-ITERATOR is applied to the iterator for the first time.")
    public static final SubLObject new_reusable_iterator_alt(SubLObject state, SubLObject done, SubLObject next, SubLObject finalize) {
        if (finalize == UNPROVIDED) {
            finalize = symbol_function(TRUE);
        }
        {
            SubLObject new_state = list(state, NIL, $INITIAL, done, next, finalize);
            return new_iterator(new_state, REUSABLE_ITERATOR_DONE, REUSABLE_ITERATOR_NEXT, REUSABLE_ITERATOR_FINALIZE);
        }
    }

    /**
     * A reusable iterator is an iterator which may be iterated over multiple times.  This is
     * accomplished by storing the values produced the first time through.  All subsequent iterations
     * work directly from this store.  Thus, subsequent iterations are potentially faster since there
     * is no need to process or filter raw values.  When a reusable iterator is done, it may be reset
     * using RESET-REUSABLE-ITERATOR and iterated through again.  NB: FINALIZE is applied to STATE
     * when RESET-REUSABLE-ITERATOR is applied to the iterator for the first time.
     */
    @LispMethod(comment = "A reusable iterator is an iterator which may be iterated over multiple times.  This is\r\naccomplished by storing the values produced the first time through.  All subsequent iterations\r\nwork directly from this store.  Thus, subsequent iterations are potentially faster since there\r\nis no need to process or filter raw values.  When a reusable iterator is done, it may be reset\r\nusing RESET-REUSABLE-ITERATOR and iterated through again.  NB: FINALIZE is applied to STATE\r\nwhen RESET-REUSABLE-ITERATOR is applied to the iterator for the first time.\nA reusable iterator is an iterator which may be iterated over multiple times.  This is\naccomplished by storing the values produced the first time through.  All subsequent iterations\nwork directly from this store.  Thus, subsequent iterations are potentially faster since there\nis no need to process or filter raw values.  When a reusable iterator is done, it may be reset\nusing RESET-REUSABLE-ITERATOR and iterated through again.  NB: FINALIZE is applied to STATE\nwhen RESET-REUSABLE-ITERATOR is applied to the iterator for the first time.")
    public static SubLObject new_reusable_iterator(final SubLObject state, final SubLObject done, final SubLObject next, SubLObject finalize) {
        if (finalize == UNPROVIDED) {
            finalize = symbol_function(TRUE);
        }
        final SubLObject new_state = list(state, NIL, $INITIAL, done, next, finalize);
        return new_iterator(new_state, REUSABLE_ITERATOR_DONE, REUSABLE_ITERATOR_NEXT, REUSABLE_ITERATOR_FINALIZE);
    }

    public static final SubLObject reusable_iterator_done_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject real_state = NIL;
            SubLObject queue = NIL;
            SubLObject mode = NIL;
            SubLObject done = NIL;
            SubLObject next = NIL;
            SubLObject finalize = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt122);
            real_state = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt122);
            queue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt122);
            mode = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt122);
            done = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt122);
            next = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt122);
            finalize = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = mode;
                    if (pcase_var.eql($INITIAL)) {
                        return funcall(done, real_state);
                    } else {
                        if (pcase_var.eql($REUSE)) {
                            return sublisp_null(real_state);
                        } else {
                            Errors.warn($str_alt124$Unknown_mode___a_, mode);
                            return T;
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt122);
            }
        }
        return NIL;
    }

    public static SubLObject reusable_iterator_done(final SubLObject state) {
        SubLObject real_state = NIL;
        SubLObject queue = NIL;
        SubLObject mode = NIL;
        SubLObject done = NIL;
        SubLObject next = NIL;
        SubLObject finalize = NIL;
        destructuring_bind_must_consp(state, state, $list153);
        real_state = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list153);
        queue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list153);
        mode = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list153);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list153);
        next = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list153);
        finalize = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list153);
            return NIL;
        }
        final SubLObject pcase_var = mode;
        if (pcase_var.eql($INITIAL)) {
            return funcall(done, real_state);
        }
        if (pcase_var.eql($REUSE)) {
            return sublisp_null(real_state);
        }
        Errors.warn($str155$Unknown_mode___a_, mode);
        return T;
    }

    public static final SubLObject reusable_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject real_state = NIL;
                SubLObject queue = NIL;
                SubLObject mode = NIL;
                SubLObject done = NIL;
                SubLObject next = NIL;
                SubLObject finalize = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt122);
                real_state = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt122);
                queue = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt122);
                mode = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt122);
                done = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt122);
                next = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt122);
                finalize = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($INITIAL)) {
                            {
                                SubLObject working_state = real_state;
                                SubLObject value = NIL;
                                SubLObject valid_nextP = NIL;
                                SubLObject premature_endP = NIL;
                                while (!((NIL != valid_nextP) || (NIL != premature_endP))) {
                                    if (NIL != funcall(done, working_state)) {
                                        premature_endP = T;
                                    } else {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject next_value = funcall(next, working_state);
                                            SubLObject new_real_state = thread.secondMultipleValue();
                                            SubLObject doneP = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            working_state = new_real_state;
                                            if (NIL != doneP) {
                                                premature_endP = T;
                                            } else {
                                                valid_nextP = T;
                                                value = next_value;
                                            }
                                        }
                                    }
                                } 
                                set_nth(ZERO_INTEGER, state, working_state);
                                if (NIL != valid_nextP) {
                                    set_nth(ONE_INTEGER, state, nconc(queue, list(value)));
                                }
                                return values(value, state, premature_endP);
                            }
                        } else {
                            if (pcase_var.eql($REUSE)) {
                                set_nth(ZERO_INTEGER, state, real_state.rest());
                                return values(real_state.first(), state);
                            } else {
                                Errors.warn($str_alt124$Unknown_mode___a_, mode);
                                return values(NIL, NIL, T);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt122);
                }
            }
            return NIL;
        }
    }

    public static SubLObject reusable_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject real_state = NIL;
        SubLObject queue = NIL;
        SubLObject mode = NIL;
        SubLObject done = NIL;
        SubLObject next = NIL;
        SubLObject finalize = NIL;
        destructuring_bind_must_consp(state, state, $list153);
        real_state = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list153);
        queue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list153);
        mode = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list153);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list153);
        next = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list153);
        finalize = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list153);
            return NIL;
        }
        final SubLObject pcase_var = mode;
        if (pcase_var.eql($INITIAL)) {
            SubLObject working_state = real_state;
            SubLObject value = NIL;
            SubLObject valid_nextP = NIL;
            SubLObject premature_endP = NIL;
            while ((NIL == valid_nextP) && (NIL == premature_endP)) {
                if (NIL != funcall(done, working_state)) {
                    premature_endP = T;
                } else {
                    thread.resetMultipleValues();
                    final SubLObject next_value = funcall(next, working_state);
                    final SubLObject new_real_state = thread.secondMultipleValue();
                    final SubLObject doneP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    working_state = new_real_state;
                    if (NIL != doneP) {
                        premature_endP = T;
                    } else {
                        valid_nextP = T;
                        value = next_value;
                    }
                }
            } 
            set_nth(ZERO_INTEGER, state, working_state);
            if (NIL != valid_nextP) {
                set_nth(ONE_INTEGER, state, nconc(queue, list(value)));
            }
            return subl_promotions.values3(value, state, premature_endP);
        }
        if (pcase_var.eql($REUSE)) {
            set_nth(ZERO_INTEGER, state, real_state.rest());
            return subl_promotions.values3(real_state.first(), state, NIL);
        }
        Errors.warn($str155$Unknown_mode___a_, mode);
        return subl_promotions.values3(NIL, NIL, T);
    }

    public static final SubLObject reusable_iterator_finalize_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject real_state = NIL;
            SubLObject queue = NIL;
            SubLObject mode = NIL;
            SubLObject done = NIL;
            SubLObject next = NIL;
            SubLObject finalize = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt122);
            real_state = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt122);
            queue = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt122);
            mode = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt122);
            done = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt122);
            next = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt122);
            finalize = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = mode;
                    if (pcase_var.eql($INITIAL)) {
                        return funcall(finalize, real_state);
                    } else {
                        if (pcase_var.eql($REUSE)) {
                            return T;
                        } else {
                            Errors.warn($str_alt124$Unknown_mode___a_, mode);
                            return NIL;
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt122);
            }
        }
        return NIL;
    }

    public static SubLObject reusable_iterator_finalize(final SubLObject state) {
        SubLObject real_state = NIL;
        SubLObject queue = NIL;
        SubLObject mode = NIL;
        SubLObject done = NIL;
        SubLObject next = NIL;
        SubLObject finalize = NIL;
        destructuring_bind_must_consp(state, state, $list153);
        real_state = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list153);
        queue = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list153);
        mode = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list153);
        done = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list153);
        next = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list153);
        finalize = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list153);
            return NIL;
        }
        final SubLObject pcase_var = mode;
        if (pcase_var.eql($INITIAL)) {
            return funcall(finalize, real_state);
        }
        if (pcase_var.eql($REUSE)) {
            return T;
        }
        Errors.warn($str155$Unknown_mode___a_, mode);
        return NIL;
    }

    public static final SubLObject new_reusable_iterator_from_iterator_alt(SubLObject iterator) {
        return new_reusable_iterator(iterator, REUSABLE_ITERATOR_FROM_ITERATOR_DONE, REUSABLE_ITERATOR_FROM_ITERATOR_NEXT, REUSABLE_ITERATOR_FROM_ITERATOR_FINALIZE);
    }

    public static SubLObject new_reusable_iterator_from_iterator(final SubLObject iterator) {
        return new_reusable_iterator(iterator, REUSABLE_ITERATOR_FROM_ITERATOR_DONE, REUSABLE_ITERATOR_FROM_ITERATOR_NEXT, REUSABLE_ITERATOR_FROM_ITERATOR_FINALIZE);
    }

    public static final SubLObject reusable_iterator_from_iterator_done_alt(SubLObject state) {
        return iteration_done(state);
    }

    public static SubLObject reusable_iterator_from_iterator_done(final SubLObject state) {
        return iteration_done(state);
    }

    public static final SubLObject reusable_iterator_from_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject next = iteration_next(state);
                SubLObject validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(next, state, makeBoolean(NIL == validP));
            }
        }
    }

    public static SubLObject reusable_iterator_from_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject next = iteration_next(state);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values3(next, state, makeBoolean(NIL == validP));
    }

    public static final SubLObject reusable_iterator_from_iterator_finalize_alt(SubLObject state) {
        return iteration_finalize(state);
    }

    public static SubLObject reusable_iterator_from_iterator_finalize(final SubLObject state) {
        return iteration_finalize(state);
    }

    public static final SubLObject new_reusable_list_iterator_alt(SubLObject list) {
        return new_reusable_iterator(list, ITERATE_LIST_DONE, ITERATE_LIST_NEXT, UNPROVIDED);
    }

    public static SubLObject new_reusable_list_iterator(final SubLObject list) {
        return new_reusable_iterator(list, ITERATE_LIST_DONE, ITERATE_LIST_NEXT, UNPROVIDED);
    }

    public static final SubLObject reset_reusable_iterator_alt(SubLObject iterator) {
        SubLTrampolineFile.checkType(iterator, ITERATOR_P);
        {
            SubLObject state = it_state(iterator);
            SubLObject mode = nth(TWO_INTEGER, state);
            SubLObject pcase_var = mode;
            if (pcase_var.eql($INITIAL)) {
                finish_reusable_iterator(iterator);
                {
                    SubLObject queue = nth(ONE_INTEGER, state);
                    set_nth(ZERO_INTEGER, state, queue);
                    set_nth(TWO_INTEGER, state, $REUSE);
                }
            } else {
                if (pcase_var.eql($REUSE)) {
                    {
                        SubLObject queue = nth(ONE_INTEGER, state);
                        set_nth(ZERO_INTEGER, state, queue);
                    }
                } else {
                    Errors.warn($str_alt124$Unknown_mode___a_, mode);
                }
            }
        }
        return iterator;
    }

    public static SubLObject reset_reusable_iterator(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "! iteration.iterator_p(iterator) " + ("iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) ") + iterator;
        final SubLObject state = it_state(iterator);
        final SubLObject pcase_var;
        final SubLObject mode = pcase_var = nth(TWO_INTEGER, state);
        if (pcase_var.eql($INITIAL)) {
            finish_reusable_iterator(iterator);
            final SubLObject queue = nth(ONE_INTEGER, state);
            set_nth(ZERO_INTEGER, state, queue);
            set_nth(TWO_INTEGER, state, $REUSE);
        } else
            if (pcase_var.eql($REUSE)) {
                final SubLObject queue = nth(ONE_INTEGER, state);
                set_nth(ZERO_INTEGER, state, queue);
            } else {
                Errors.warn($str155$Unknown_mode___a_, mode);
            }

        return iterator;
    }

    public static final SubLObject finish_reusable_iterator_alt(SubLObject iterator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject dummy = iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
            }
            iteration_finalize(iterator);
            return NIL;
        }
    }

    public static SubLObject finish_reusable_iterator(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject dummy = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
            }
        }
        iteration_finalize(iterator);
        return NIL;
    }

    public static final SubLObject do_reusable_iterator_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt128);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject iterator = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt128);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt128);
                    iterator = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_20 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt128);
                            current_20 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt128);
                            if (NIL == member(current_20, $list_alt129, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_20 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt128);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            SubLObject reset_tail = property_list_member($RESET, current);
                            SubLObject reset = (NIL != reset_tail) ? ((SubLObject) (cadr(reset_tail))) : T;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(PROGN, listS(DO_ITERATOR, list(var, iterator, $DONE, done), append(body, NIL)), list(PWHEN, reset, list(RESET_REUSABLE_ITERATOR, iterator)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_reusable_iterator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list159);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject iterator = NIL;
        destructuring_bind_must_consp(current, datum, $list159);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list159);
        iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$20 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list159);
            current_$20 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list159);
            if (NIL == member(current_$20, $list160, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$20 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list159);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject reset_tail = property_list_member($RESET, current);
        final SubLObject reset = (NIL != reset_tail) ? cadr(reset_tail) : T;
        final SubLObject body;
        current = body = temp;
        return list(PROGN, listS(DO_ITERATOR, list(var, iterator, $DONE, done), append(body, NIL)), list(PWHEN, reset, list(RESET_REUSABLE_ITERATOR, iterator)));
    }

    public static final SubLObject map_reusable_iterator_alt(SubLObject function, SubLObject iterator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject item = iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            funcall(function, item);
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
                reset_reusable_iterator(iterator);
            }
            return NIL;
        }
    }

    public static SubLObject map_reusable_iterator(final SubLObject function, final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject item = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                funcall(function, item);
            }
        }
        reset_reusable_iterator(iterator);
        return NIL;
    }

    public static final SubLObject new_reusable_iterator_cartesian_iterator_alt(SubLObject reusable_iterators) {
        {
            SubLObject state = reusable_iterator_cartesian_iterator_state(reusable_iterators);
            return NIL != state ? ((SubLObject) (new_iterator(state, REUSABLE_ITERATOR_CARTESIAN_ITERATOR_DONE, REUSABLE_ITERATOR_CARTESIAN_ITERATOR_NEXT, REUSABLE_ITERATOR_CARTESIAN_ITERATOR_FINALIZE))) : new_null_iterator();
        }
    }

    public static SubLObject new_reusable_iterator_cartesian_iterator(final SubLObject reusable_iterators) {
        final SubLObject state = reusable_iterator_cartesian_iterator_state(reusable_iterators);
        return NIL != state ? new_iterator(state, REUSABLE_ITERATOR_CARTESIAN_ITERATOR_DONE, REUSABLE_ITERATOR_CARTESIAN_ITERATOR_NEXT, REUSABLE_ITERATOR_CARTESIAN_ITERATOR_FINALIZE) : new_null_iterator();
    }

    public static final SubLObject reusable_iterator_cartesian_iterator_state_alt(SubLObject iterators) {
        {
            SubLObject nullP = NIL;
            if (NIL == nullP) {
                {
                    SubLObject csome_list_var = iterators;
                    SubLObject iterator = NIL;
                    for (iterator = csome_list_var.first(); !((NIL != nullP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , iterator = csome_list_var.first()) {
                        if (NIL != iteration_done(iterator)) {
                            reset_reusable_iterator(iterator);
                            nullP = iteration_done(iterator);
                        }
                    }
                }
            }
            return NIL != nullP ? ((SubLObject) (NIL)) : list(reverse(iterators), NIL);
        }
    }

    public static SubLObject reusable_iterator_cartesian_iterator_state(final SubLObject iterators) {
        SubLObject nullP = NIL;
        if (NIL == nullP) {
            SubLObject csome_list_var = iterators;
            SubLObject iterator = NIL;
            iterator = csome_list_var.first();
            while ((NIL == nullP) && (NIL != csome_list_var)) {
                if (NIL != iteration_done(iterator)) {
                    reset_reusable_iterator(iterator);
                    nullP = iteration_done(iterator);
                }
                csome_list_var = csome_list_var.rest();
                iterator = csome_list_var.first();
            } 
        }
        return NIL != nullP ? NIL : list(reverse(iterators), NIL);
    }

    public static final SubLObject reusable_iterator_cartesian_iterator_done_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject reverse_iterators = NIL;
            SubLObject reverse_result = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt135);
            reverse_iterators = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt135);
            reverse_result = current.first();
            current = current.rest();
            if (NIL == current) {
                return all_iterators_doneP(reverse_iterators);
            } else {
                cdestructuring_bind_error(datum, $list_alt135);
            }
        }
        return NIL;
    }

    public static SubLObject reusable_iterator_cartesian_iterator_done(final SubLObject state) {
        SubLObject reverse_iterators = NIL;
        SubLObject reverse_result = NIL;
        destructuring_bind_must_consp(state, state, $list166);
        reverse_iterators = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list166);
        reverse_result = current.first();
        current = current.rest();
        if (NIL == current) {
            return all_iterators_doneP(reverse_iterators);
        }
        cdestructuring_bind_error(state, $list166);
        return NIL;
    }

    public static final SubLObject all_iterators_doneP_alt(SubLObject iterators) {
        {
            SubLObject not_doneP = NIL;
            if (NIL == not_doneP) {
                {
                    SubLObject csome_list_var = iterators;
                    SubLObject iterator = NIL;
                    for (iterator = csome_list_var.first(); !((NIL != not_doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , iterator = csome_list_var.first()) {
                        if (NIL == iteration_done(iterator)) {
                            not_doneP = T;
                        }
                    }
                }
            }
            return makeBoolean(NIL == not_doneP);
        }
    }

    public static SubLObject all_iterators_doneP(final SubLObject iterators) {
        SubLObject not_doneP = NIL;
        if (NIL == not_doneP) {
            SubLObject csome_list_var = iterators;
            SubLObject iterator = NIL;
            iterator = csome_list_var.first();
            while ((NIL == not_doneP) && (NIL != csome_list_var)) {
                if (NIL == iteration_done(iterator)) {
                    not_doneP = T;
                }
                csome_list_var = csome_list_var.rest();
                iterator = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == not_doneP);
    }

    public static final SubLObject reusable_iterator_cartesian_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject reverse_iterators = NIL;
                SubLObject reverse_result = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt135);
                reverse_iterators = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt135);
                reverse_result = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == reverse_result) {
                        reverse_result = make_list(length(reverse_iterators), UNPROVIDED);
                        {
                            SubLObject list_var = NIL;
                            SubLObject iterator = NIL;
                            SubLObject num = NIL;
                            for (list_var = reverse_iterators, iterator = list_var.first(), num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , iterator = list_var.first() , num = add(ONE_INTEGER, num)) {
                                set_nth(num, reverse_result, iteration_next_without_values(iterator, UNPROVIDED));
                            }
                        }
                        set_nth(ONE_INTEGER, state, reverse_result);
                        return values(reverse(reverse_result), state, NIL);
                    } else {
                        {
                            SubLObject update_finishedP = NIL;
                            SubLObject list_var = NIL;
                            SubLObject iterator = NIL;
                            SubLObject num = NIL;
                            for (list_var = reverse_iterators, iterator = list_var.first(), num = ZERO_INTEGER; !((NIL != update_finishedP) || (NIL == list_var)); list_var = list_var.rest() , iterator = list_var.first() , num = add(ONE_INTEGER, num)) {
                                if (NIL != iteration_done(iterator)) {
                                    reset_reusable_iterator(iterator);
                                } else {
                                    update_finishedP = T;
                                }
                                thread.resetMultipleValues();
                                {
                                    SubLObject next = iteration_next(iterator);
                                    SubLObject validP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == validP) {
                                        reset_reusable_iterator(iterator);
                                        next = iteration_next_without_values(iterator, UNPROVIDED);
                                        update_finishedP = NIL;
                                    }
                                    set_nth(num, reverse_result, next);
                                }
                            }
                        }
                        set_nth(ONE_INTEGER, state, reverse_result);
                        return values(reverse(reverse_result), state, NIL);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt135);
                }
            }
            return NIL;
        }
    }

    public static SubLObject reusable_iterator_cartesian_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reverse_iterators = NIL;
        SubLObject reverse_result = NIL;
        destructuring_bind_must_consp(state, state, $list166);
        reverse_iterators = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list166);
        reverse_result = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list166);
            return NIL;
        }
        if (NIL == reverse_result) {
            reverse_result = make_list(length(reverse_iterators), UNPROVIDED);
            SubLObject list_var = NIL;
            SubLObject iterator = NIL;
            SubLObject num = NIL;
            list_var = reverse_iterators;
            iterator = list_var.first();
            for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , iterator = list_var.first() , num = add(ONE_INTEGER, num)) {
                set_nth(num, reverse_result, iteration_next_without_values(iterator, UNPROVIDED));
            }
            set_nth(ONE_INTEGER, state, reverse_result);
            return subl_promotions.values3(reverse(reverse_result), state, NIL);
        }
        SubLObject update_finishedP = NIL;
        SubLObject list_var2 = NIL;
        SubLObject iterator2 = NIL;
        SubLObject num2 = NIL;
        list_var2 = reverse_iterators;
        iterator2 = list_var2.first();
        for (num2 = ZERO_INTEGER; (NIL == update_finishedP) && (NIL != list_var2); list_var2 = list_var2.rest() , iterator2 = list_var2.first() , num2 = add(ONE_INTEGER, num2)) {
            if (NIL != iteration_done(iterator2)) {
                reset_reusable_iterator(iterator2);
            } else {
                update_finishedP = T;
            }
            thread.resetMultipleValues();
            SubLObject next = iteration_next(iterator2);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == validP) {
                reset_reusable_iterator(iterator2);
                next = iteration_next_without_values(iterator2, UNPROVIDED);
                update_finishedP = NIL;
            }
            set_nth(num2, reverse_result, next);
        }
        set_nth(ONE_INTEGER, state, reverse_result);
        return subl_promotions.values3(reverse(reverse_result), state, NIL);
    }

    public static final SubLObject reusable_iterator_cartesian_iterator_finalize_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject reverse_iterators = NIL;
            SubLObject reverse_result = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt135);
            reverse_iterators = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt135);
            reverse_result = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject cdolist_list_var = reverse_iterators;
                    SubLObject iterator = NIL;
                    for (iterator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , iterator = cdolist_list_var.first()) {
                        iteration_finalize(iterator);
                    }
                }
                return T;
            } else {
                cdestructuring_bind_error(datum, $list_alt135);
            }
        }
        return NIL;
    }

    public static SubLObject reusable_iterator_cartesian_iterator_finalize(final SubLObject state) {
        SubLObject reverse_iterators = NIL;
        SubLObject reverse_result = NIL;
        destructuring_bind_must_consp(state, state, $list166);
        reverse_iterators = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list166);
        reverse_result = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var = reverse_iterators;
            SubLObject iterator = NIL;
            iterator = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                iteration_finalize(iterator);
                cdolist_list_var = cdolist_list_var.rest();
                iterator = cdolist_list_var.first();
            } 
            return T;
        }
        cdestructuring_bind_error(state, $list166);
        return NIL;
    }

    /**
     * Return an iterator that filters each raw-value from another ITERATOR.
     * RAW-VALUE is returned iff (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) is non-nil.
     */
    @LispMethod(comment = "Return an iterator that filters each raw-value from another ITERATOR.\r\nRAW-VALUE is returned iff (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) is non-nil.\nReturn an iterator that filters each raw-value from another ITERATOR.\nRAW-VALUE is returned iff (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) is non-nil.")
    public static final SubLObject new_filter_iterator_alt(SubLObject input_iterator, SubLObject filter_method, SubLObject filter_args) {
        if (filter_args == UNPROVIDED) {
            filter_args = NIL;
        }
        SubLTrampolineFile.checkType(input_iterator, ITERATOR_P);
        SubLTrampolineFile.checkType(filter_method, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(filter_args, LISTP);
        return new_iterator(make_filter_iterator_state(input_iterator, filter_method, filter_args), DEFAULT_ITERATOR_DONE_P, FILTER_ITERATOR_NEXT, UNPROVIDED);
    }

    @LispMethod(comment = "Return an iterator that filters each raw-value from another ITERATOR.\r\nRAW-VALUE is returned iff (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) is non-nil.\nReturn an iterator that filters each raw-value from another ITERATOR.\nRAW-VALUE is returned iff (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) is non-nil.")
    public static SubLObject new_filter_iterator(final SubLObject input_iterator, final SubLObject filter_method, SubLObject filter_args) {
        if (filter_args == UNPROVIDED) {
            filter_args = NIL;
        }
        assert NIL != iterator_p(input_iterator) : "! iteration.iterator_p(input_iterator) " + ("iteration.iterator_p(input_iterator) " + "CommonSymbols.NIL != iteration.iterator_p(input_iterator) ") + input_iterator;
        assert NIL != function_spec_p(filter_method) : "! function_spec_p(filter_method) " + ("Types.function_spec_p(filter_method) " + "CommonSymbols.NIL != Types.function_spec_p(filter_method) ") + filter_method;
        assert NIL != listp(filter_args) : "! listp(filter_args) " + ("Types.listp(filter_args) " + "CommonSymbols.NIL != Types.listp(filter_args) ") + filter_args;
        return new_iterator(make_filter_iterator_state(input_iterator, filter_method, filter_args), DEFAULT_ITERATOR_DONE_P, FILTER_ITERATOR_NEXT, FILTER_ITERATOR_FINALIZE);
    }

    /**
     * Return an iterator that filters each raw-value from another ITERATOR.
     * RAW-VALUE is returned iff (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) is non-nil.
     * Unlike NEW-FILTER-ITERATOR, the INPUT-ITERATOR is iterated under the assumption that INVALID-TOKEN
     * is used to indicated an invalid value rather than a second value.
     */
    @LispMethod(comment = "Return an iterator that filters each raw-value from another ITERATOR.\r\nRAW-VALUE is returned iff (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) is non-nil.\r\nUnlike NEW-FILTER-ITERATOR, the INPUT-ITERATOR is iterated under the assumption that INVALID-TOKEN\r\nis used to indicated an invalid value rather than a second value.\nReturn an iterator that filters each raw-value from another ITERATOR.\nRAW-VALUE is returned iff (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) is non-nil.\nUnlike NEW-FILTER-ITERATOR, the INPUT-ITERATOR is iterated under the assumption that INVALID-TOKEN\nis used to indicated an invalid value rather than a second value.")
    public static final SubLObject new_filter_iterator_without_values_alt(SubLObject input_iterator, SubLObject filter_method, SubLObject filter_args, SubLObject invalid_token) {
        if (filter_args == UNPROVIDED) {
            filter_args = NIL;
        }
        if (invalid_token == UNPROVIDED) {
            invalid_token = NIL;
        }
        SubLTrampolineFile.checkType(input_iterator, ITERATOR_P);
        SubLTrampolineFile.checkType(filter_method, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(filter_args, LISTP);
        return new_iterator(make_filter_iterator_without_values_state(input_iterator, filter_method, filter_args, invalid_token), DEFAULT_ITERATOR_DONE_P, FILTER_ITERATOR_WITHOUT_VALUES_NEXT, UNPROVIDED);
    }

    @LispMethod(comment = "Return an iterator that filters each raw-value from another ITERATOR.\r\nRAW-VALUE is returned iff (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) is non-nil.\r\nUnlike NEW-FILTER-ITERATOR, the INPUT-ITERATOR is iterated under the assumption that INVALID-TOKEN\r\nis used to indicated an invalid value rather than a second value.\nReturn an iterator that filters each raw-value from another ITERATOR.\nRAW-VALUE is returned iff (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) is non-nil.\nUnlike NEW-FILTER-ITERATOR, the INPUT-ITERATOR is iterated under the assumption that INVALID-TOKEN\nis used to indicated an invalid value rather than a second value.")
    public static SubLObject new_filter_iterator_without_values(final SubLObject input_iterator, final SubLObject filter_method, SubLObject filter_args, SubLObject invalid_token) {
        if (filter_args == UNPROVIDED) {
            filter_args = NIL;
        }
        if (invalid_token == UNPROVIDED) {
            invalid_token = NIL;
        }
        assert NIL != iterator_p(input_iterator) : "! iteration.iterator_p(input_iterator) " + ("iteration.iterator_p(input_iterator) " + "CommonSymbols.NIL != iteration.iterator_p(input_iterator) ") + input_iterator;
        assert NIL != function_spec_p(filter_method) : "! function_spec_p(filter_method) " + ("Types.function_spec_p(filter_method) " + "CommonSymbols.NIL != Types.function_spec_p(filter_method) ") + filter_method;
        assert NIL != listp(filter_args) : "! listp(filter_args) " + ("Types.listp(filter_args) " + "CommonSymbols.NIL != Types.listp(filter_args) ") + filter_args;
        return new_iterator(make_filter_iterator_without_values_state(input_iterator, filter_method, filter_args, invalid_token), DEFAULT_ITERATOR_DONE_P, FILTER_ITERATOR_WITHOUT_VALUES_NEXT, FILTER_ITERATOR_FINALIZE);
    }

    /**
     * Return an iterator that filters and transforms each raw-value from another ITERATOR.
     * The first result of (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) if the second result is non-null.
     */
    @LispMethod(comment = "Return an iterator that filters and transforms each raw-value from another ITERATOR.\r\nThe first result of (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) if the second result is non-null.\nReturn an iterator that filters and transforms each raw-value from another ITERATOR.\nThe first result of (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) if the second result is non-null.")
    public static final SubLObject new_filter_and_transform_iterator_alt(SubLObject input_iterator, SubLObject filter_and_transform_method, SubLObject filter_and_transform_args) {
        if (filter_and_transform_args == UNPROVIDED) {
            filter_and_transform_args = NIL;
        }
        SubLTrampolineFile.checkType(input_iterator, ITERATOR_P);
        SubLTrampolineFile.checkType(filter_and_transform_method, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(filter_and_transform_args, LISTP);
        return new_iterator(make_filter_and_tranform_iterator_state(input_iterator, filter_and_transform_method, filter_and_transform_args), DEFAULT_ITERATOR_DONE_P, FILTER_AND_TRANSFORM_ITERATOR_NEXT, UNPROVIDED);
    }

    @LispMethod(comment = "Return an iterator that filters and transforms each raw-value from another ITERATOR.\r\nThe first result of (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) if the second result is non-null.\nReturn an iterator that filters and transforms each raw-value from another ITERATOR.\nThe first result of (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) if the second result is non-null.")
    public static SubLObject new_filter_and_transform_iterator(final SubLObject input_iterator, final SubLObject filter_and_transform_method, SubLObject filter_and_transform_args) {
        if (filter_and_transform_args == UNPROVIDED) {
            filter_and_transform_args = NIL;
        }
        assert NIL != iterator_p(input_iterator) : "! iteration.iterator_p(input_iterator) " + ("iteration.iterator_p(input_iterator) " + "CommonSymbols.NIL != iteration.iterator_p(input_iterator) ") + input_iterator;
        assert NIL != function_spec_p(filter_and_transform_method) : "! function_spec_p(filter_and_transform_method) " + ("Types.function_spec_p(filter_and_transform_method) " + "CommonSymbols.NIL != Types.function_spec_p(filter_and_transform_method) ") + filter_and_transform_method;
        assert NIL != listp(filter_and_transform_args) : "! listp(filter_and_transform_args) " + ("Types.listp(filter_and_transform_args) " + "CommonSymbols.NIL != Types.listp(filter_and_transform_args) ") + filter_and_transform_args;
        return new_iterator(make_filter_and_tranform_iterator_state(input_iterator, filter_and_transform_method, filter_and_transform_args), DEFAULT_ITERATOR_DONE_P, FILTER_AND_TRANSFORM_ITERATOR_NEXT, FILTER_ITERATOR_FINALIZE);
    }

    public static final SubLObject make_filter_iterator_state_alt(SubLObject input_iterator, SubLObject filter_method, SubLObject filter_args) {
        {
            SubLObject current = input_iterator;
            return list(current, filter_method, filter_args);
        }
    }

    public static SubLObject make_filter_iterator_state(final SubLObject input_iterator, final SubLObject filter_method, final SubLObject filter_args) {
        return list(input_iterator, filter_method, filter_args);
    }

    public static final SubLObject make_filter_iterator_without_values_state_alt(SubLObject input_iterator, SubLObject filter_method, SubLObject filter_args, SubLObject invalid_token) {
        {
            SubLObject current = input_iterator;
            return list(current, filter_method, filter_args, invalid_token);
        }
    }

    public static SubLObject make_filter_iterator_without_values_state(final SubLObject input_iterator, final SubLObject filter_method, final SubLObject filter_args, final SubLObject invalid_token) {
        return list(input_iterator, filter_method, filter_args, invalid_token);
    }

    public static final SubLObject make_filter_and_tranform_iterator_state_alt(SubLObject input_iterator, SubLObject filter_method, SubLObject filter_args) {
        {
            SubLObject current = input_iterator;
            return list(current, filter_method, filter_args);
        }
    }

    public static SubLObject make_filter_and_tranform_iterator_state(final SubLObject input_iterator, final SubLObject filter_method, final SubLObject filter_args) {
        return list(input_iterator, filter_method, filter_args);
    }

    public static SubLObject filter_iterator_finalize(final SubLObject state) {
        SubLObject current_$21 = NIL;
        destructuring_bind_must_consp(state, state, $list106);
        current_$21 = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        if (NIL != iterator_p(current_$21)) {
            iteration_finalize(current_$21);
            return T;
        }
        return NIL;
    }

    public static final SubLObject filter_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject current_21 = NIL;
                SubLObject filter_method = NIL;
                SubLObject filter_args = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt137);
                current_21 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt137);
                filter_method = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt137);
                filter_args = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_answer = NIL;
                        SubLObject done = NIL;
                        SubLObject invalid = NIL;
                        while (NIL == done) {
                            thread.resetMultipleValues();
                            {
                                SubLObject next = iteration_next(current_21);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    if (NIL != apply(filter_method, next, filter_args)) {
                                        v_answer = next;
                                        done = T;
                                    }
                                } else {
                                    {
                                        SubLObject update = $DONE;
                                        rplaca(state, update);
                                        rplacd(state, NIL);
                                        done = T;
                                        invalid = T;
                                    }
                                }
                            }
                        } 
                        return values(v_answer, state, invalid);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt137);
                }
            }
            return NIL;
        }
    }

    public static SubLObject filter_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_$22 = NIL;
        SubLObject filter_method = NIL;
        SubLObject filter_args = NIL;
        destructuring_bind_must_consp(state, state, $list169);
        current_$22 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list169);
        filter_method = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list169);
        filter_args = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject v_answer = NIL;
            SubLObject done = NIL;
            SubLObject invalid = NIL;
            while (NIL == done) {
                thread.resetMultipleValues();
                final SubLObject next = iteration_next(current_$22);
                final SubLObject valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    if (NIL == apply(filter_method, next, filter_args)) {
                        continue;
                    }
                    v_answer = next;
                    done = T;
                } else {
                    final SubLObject update = $DONE;
                    iteration_finalize(current_$22);
                    rplaca(state, update);
                    rplacd(state, NIL);
                    done = T;
                    invalid = T;
                }
            } 
            return subl_promotions.values3(v_answer, state, invalid);
        }
        cdestructuring_bind_error(state, $list169);
        return NIL;
    }

    public static final SubLObject filter_iterator_without_values_next_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_22 = NIL;
            SubLObject filter_method = NIL;
            SubLObject filter_args = NIL;
            SubLObject invalid_token = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt138);
            current_22 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt138);
            filter_method = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt138);
            filter_args = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt138);
            invalid_token = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_answer = NIL;
                    SubLObject done = NIL;
                    SubLObject invalid = NIL;
                    while (NIL == done) {
                        {
                            SubLObject next = iteration_next_without_values(current_22, invalid_token);
                            SubLObject valid = makeBoolean(next != invalid_token);
                            if (NIL != valid) {
                                if (NIL != apply(filter_method, next, filter_args)) {
                                    v_answer = next;
                                    done = T;
                                }
                            } else {
                                {
                                    SubLObject update = $DONE;
                                    rplaca(state, update);
                                    rplacd(state, NIL);
                                    done = T;
                                    invalid = T;
                                }
                            }
                        }
                    } 
                    return values(v_answer, state, invalid);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt138);
            }
        }
        return NIL;
    }

    public static SubLObject filter_iterator_without_values_next(final SubLObject state) {
        SubLObject current_$23 = NIL;
        SubLObject filter_method = NIL;
        SubLObject filter_args = NIL;
        SubLObject invalid_token = NIL;
        destructuring_bind_must_consp(state, state, $list170);
        current_$23 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list170);
        filter_method = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list170);
        filter_args = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list170);
        invalid_token = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject v_answer = NIL;
            SubLObject done = NIL;
            SubLObject invalid = NIL;
            while (NIL == done) {
                final SubLObject next = iteration_next_without_values(current_$23, invalid_token);
                final SubLObject valid = makeBoolean(!next.eql(invalid_token));
                if (NIL != valid) {
                    if (NIL == apply(filter_method, next, filter_args)) {
                        continue;
                    }
                    v_answer = next;
                    done = T;
                } else {
                    final SubLObject update = $DONE;
                    iteration_finalize(current_$23);
                    rplaca(state, update);
                    rplacd(state, NIL);
                    done = T;
                    invalid = T;
                }
            } 
            return subl_promotions.values3(v_answer, state, invalid);
        }
        cdestructuring_bind_error(state, $list170);
        return NIL;
    }

    public static final SubLObject filter_and_transform_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject current_23 = NIL;
                SubLObject filter_method = NIL;
                SubLObject filter_args = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt137);
                current_23 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt137);
                filter_method = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt137);
                filter_args = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_answer = NIL;
                        SubLObject done = NIL;
                        SubLObject invalid = NIL;
                        while (NIL == done) {
                            thread.resetMultipleValues();
                            {
                                SubLObject next = iteration_next(current_23);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject transformed_next = apply(filter_method, next, filter_args);
                                        SubLObject passed_filterP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != passed_filterP) {
                                            v_answer = transformed_next;
                                            done = T;
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject update = $DONE;
                                        rplaca(state, update);
                                        rplacd(state, NIL);
                                        done = T;
                                        invalid = T;
                                    }
                                }
                            }
                        } 
                        return values(v_answer, state, invalid);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt137);
                }
            }
            return NIL;
        }
    }

    public static SubLObject filter_and_transform_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_$24 = NIL;
        SubLObject filter_method = NIL;
        SubLObject filter_args = NIL;
        destructuring_bind_must_consp(state, state, $list169);
        current_$24 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list169);
        filter_method = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list169);
        filter_args = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject v_answer = NIL;
            SubLObject done = NIL;
            SubLObject invalid = NIL;
            while (NIL == done) {
                thread.resetMultipleValues();
                final SubLObject next = iteration_next(current_$24);
                final SubLObject valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    thread.resetMultipleValues();
                    final SubLObject transformed_next = apply(filter_method, next, filter_args);
                    final SubLObject passed_filterP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == passed_filterP) {
                        continue;
                    }
                    v_answer = transformed_next;
                    done = T;
                } else {
                    final SubLObject update = $DONE;
                    iteration_finalize(current_$24);
                    rplaca(state, update);
                    rplacd(state, NIL);
                    done = T;
                    invalid = T;
                }
            } 
            return subl_promotions.values3(v_answer, state, invalid);
        }
        cdestructuring_bind_error(state, $list169);
        return NIL;
    }

    public static final SubLObject default_iterator_done_p_alt(SubLObject state) {
        return eq($DONE, elt(state, ZERO_INTEGER));
    }

    public static SubLObject default_iterator_done_p(final SubLObject state) {
        return eq($DONE, elt(state, ZERO_INTEGER));
    }

    public static final SubLObject test_iterate_once_alt(SubLObject iterator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                SubLObject v_answer = NIL;
                SubLObject done_var = doneP;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject obj = iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            v_answer = obj;
                            doneP = T;
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                    }
                } 
                return v_answer;
            }
        }
    }

    public static SubLObject test_iterate_once(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject v_answer = NIL;
        SubLObject valid;
        for (SubLObject done_var = doneP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != doneP))) {
            thread.resetMultipleValues();
            final SubLObject obj = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                v_answer = obj;
                doneP = T;
            }
        }
        return v_answer;
    }

    public static final SubLObject test_iterate_all_alt(SubLObject iterator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                SubLObject total = ZERO_INTEGER;
                SubLObject done_var = doneP;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject obj = iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            total = add(total, ONE_INTEGER);
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                    }
                } 
                return total;
            }
        }
    }

    public static SubLObject test_iterate_all(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doneP = NIL;
        SubLObject total = ZERO_INTEGER;
        SubLObject valid;
        for (SubLObject done_var = doneP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != doneP))) {
            thread.resetMultipleValues();
            final SubLObject obj = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                total = add(total, ONE_INTEGER);
            }
        }
        return total;
    }

    public static SubLObject new_transform_iterator(final SubLObject iterator, final SubLObject xform_fn, SubLObject param) {
        if (param == UNPROVIDED) {
            param = $xform_fn_param_do_not_pass$.getGlobalValue();
        }
        return new_iterator(make_xform_iterator_state(iterator, xform_fn, param), XFORM_ITERATOR_DONE, XFORM_ITERATOR_NEXT, XFORM_ITERATOR_FINALIZE);
    }

    public static SubLObject make_xform_iterator_state(final SubLObject iterator, final SubLObject xform_fn, final SubLObject param) {
        return list(iterator, xform_fn, param);
    }

    public static SubLObject xform_iterator_done(final SubLObject state) {
        final SubLObject iterator = state.first();
        return iteration_done(iterator);
    }

    public static SubLObject xform_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iterator = NIL;
        SubLObject xform_fn = NIL;
        SubLObject param = NIL;
        destructuring_bind_must_consp(state, state, $list175);
        iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list175);
        xform_fn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list175);
        param = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            SubLObject value = iteration_next(iterator);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != validP) {
                if ($xform_fn_param_do_not_pass$.getGlobalValue().eql(param)) {
                    value = funcall(xform_fn, value);
                } else {
                    value = funcall(xform_fn, value, param);
                }
            }
            return subl_promotions.values3(value, state, makeBoolean(NIL == validP));
        }
        cdestructuring_bind_error(state, $list175);
        return NIL;
    }

    /**
     * Return T iff OBJECT is a xml-token iterator
     */
    @LispMethod(comment = "Return T iff OBJECT is a xml-token iterator")
    public static final SubLObject xml_token_iterator_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != iterator_p(v_object)) && (it_next(v_object) == ITERATE_XML_TOKEN_NEXT));
    }

    @LispMethod(comment = "Return T iff OBJECT is a xml-token iterator")
    public static SubLObject xml_token_iterator_p(final SubLObject v_object) {
        return makeBoolean((NIL != iterator_p(v_object)) && (it_next(v_object) == ITERATE_XML_TOKEN_NEXT));
    }

    /**
     *
     *
     * @return STRINGP; the text token that TOKEN-ITERATOR will return. NIL if none.
     */
    @LispMethod(comment = "@return STRINGP; the text token that TOKEN-ITERATOR will return. NIL if none.")
    public static final SubLObject xml_token_iterator_peek_alt(SubLObject token_iterator) {
        SubLTrampolineFile.checkType(token_iterator, XML_TOKEN_ITERATOR_P);
        {
            SubLObject state = it_state(token_iterator);
            return web_utilities.xml_token_iterator_state_peek(state);
        }
    }

    /**
     *
     *
     * @return STRINGP; the text token that TOKEN-ITERATOR will return. NIL if none.
     */
    @LispMethod(comment = "@return STRINGP; the text token that TOKEN-ITERATOR will return. NIL if none.")
    public static SubLObject xml_token_iterator_peek(final SubLObject token_iterator) {
        assert NIL != xml_token_iterator_p(token_iterator) : "! iteration.xml_token_iterator_p(token_iterator) " + ("iteration.xml_token_iterator_p(token_iterator) " + "CommonSymbols.NIL != iteration.xml_token_iterator_p(token_iterator) ") + token_iterator;
        final SubLObject state = it_state(token_iterator);
        return xml_parsing_utilities.xml_token_iterator_state_peek(state);
    }

    public static SubLObject iterator_size_exhaustive(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static final SubLObject declare_iteration_file_alt() {
        declareFunction("iterator_print_function_trampoline", "ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("iterator_p", "ITERATOR-P", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$iterator_p$UnaryFunction();
        declareFunction("it_state", "IT-STATE", 1, 0, false);
        declareFunction("it_done", "IT-DONE", 1, 0, false);
        declareFunction("it_next", "IT-NEXT", 1, 0, false);
        declareFunction("it_finalize", "IT-FINALIZE", 1, 0, false);
        declareFunction("_csetf_it_state", "_CSETF-IT-STATE", 2, 0, false);
        declareFunction("_csetf_it_done", "_CSETF-IT-DONE", 2, 0, false);
        declareFunction("_csetf_it_next", "_CSETF-IT-NEXT", 2, 0, false);
        declareFunction("_csetf_it_finalize", "_CSETF-IT-FINALIZE", 2, 0, false);
        declareFunction("make_iterator", "MAKE-ITERATOR", 0, 1, false);
        declareFunction("print_iterator", "PRINT-ITERATOR", 3, 0, false);
        declareFunction("new_iterator", "NEW-ITERATOR", 3, 1, false);
        declareFunction("iteration_done", "ITERATION-DONE", 1, 0, false);
        declareFunction("iteration_next_funcall", "ITERATION-NEXT-FUNCALL", 2, 0, false);
        declareFunction("iteration_next", "ITERATION-NEXT", 1, 0, false);
        declareFunction("iteration_next_without_values", "ITERATION-NEXT-WITHOUT-VALUES", 1, 1, false);
        declareFunction("iteration_next_without_values_macro_helper", "ITERATION-NEXT-WITHOUT-VALUES-MACRO-HELPER", 1, 1, false);
        declareFunction("iteration_finalize", "ITERATION-FINALIZE", 1, 0, false);
        declareFunction("iterator_type_name", "ITERATOR-TYPE-NAME", 1, 0, false);
        declareFunction("iteration_state_peek", "ITERATION-STATE-PEEK", 1, 0, false);
        declareFunction("iteration_next_peek", "ITERATION-NEXT-PEEK", 1, 0, false);
        declareMacro("do_iterator", "DO-ITERATOR");
        declareMacro("do_iterator_without_values", "DO-ITERATOR-WITHOUT-VALUES");
        declareMacro("do_iterator_without_values_internal", "DO-ITERATOR-WITHOUT-VALUES-INTERNAL");
        declareMacro("do_n_iterator_objects", "DO-N-ITERATOR-OBJECTS");
        declareFunction("map_iterator", "MAP-ITERATOR", 2, 0, false);
        declareFunction("copy_iterator", "COPY-ITERATOR", 1, 1, false);
        declareFunction("iterator_value_list", "ITERATOR-VALUE-LIST", 1, 0, false);
        declareFunction("generic_producer", "GENERIC-PRODUCER", 2, 1, false);
        declareFunction("new_null_iterator", "NEW-NULL-ITERATOR", 0, 0, false);
        declareFunction("new_singleton_iterator", "NEW-SINGLETON-ITERATOR", 1, 0, false);
        declareFunction("iterate_non_null_singleton_next", "ITERATE-NON-NULL-SINGLETON-NEXT", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$iterate_non_null_singleton_next$UnaryFunction();
        declareFunction("new_integer_iterator", "NEW-INTEGER-ITERATOR", 0, 3, false);
        declareFunction("new_number_iterator", "NEW-NUMBER-ITERATOR", 0, 3, false);
        declareFunction("make_iterator_number_state", "MAKE-ITERATOR-NUMBER-STATE", 3, 0, false);
        declareFunction("iterate_number_done", "ITERATE-NUMBER-DONE", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$iterate_number_done$UnaryFunction();
        declareFunction("iterate_number_next", "ITERATE-NUMBER-NEXT", 1, 0, false);
        declareFunction("list_iterator_p", "LIST-ITERATOR-P", 1, 0, false);
        declareFunction("new_list_iterator", "NEW-LIST-ITERATOR", 1, 0, false);
        declareFunction("get_list_iterator_list", "GET-LIST-ITERATOR-LIST", 1, 0, false);
        declareFunction("list_iterator_size", "LIST-ITERATOR-SIZE", 1, 0, false);
        declareFunction("make_iterator_list_state", "MAKE-ITERATOR-LIST-STATE", 1, 0, false);
        declareFunction("iterate_list_done", "ITERATE-LIST-DONE", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$iterate_list_done$UnaryFunction();
        declareFunction("iterate_list_next", "ITERATE-LIST-NEXT", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$iterate_list_next$UnaryFunction();
        declareFunction("new_alist_iterator", "NEW-ALIST-ITERATOR", 1, 0, false);
        declareFunction("cons_to_tuple", "CONS-TO-TUPLE", 1, 0, false);
        declareFunction("new_vector_iterator", "NEW-VECTOR-ITERATOR", 1, 0, false);
        declareFunction("make_iterator_vector_state", "MAKE-ITERATOR-VECTOR-STATE", 1, 0, false);
        declareFunction("iterate_vector_next", "ITERATE-VECTOR-NEXT", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$iterate_vector_next$UnaryFunction();
        declareFunction("new_vector_index_iterator", "NEW-VECTOR-INDEX-ITERATOR", 1, 0, false);
        declareFunction("make_iterator_vector_index_state", "MAKE-ITERATOR-VECTOR-INDEX-STATE", 1, 0, false);
        declareFunction("iterate_vector_index_next", "ITERATE-VECTOR-INDEX-NEXT", 1, 0, false);
        declareFunction("new_hash_table_iterator", "NEW-HASH-TABLE-ITERATOR", 1, 0, false);
        declareFunction("new_hash_table_values_iterator", "NEW-HASH-TABLE-VALUES-ITERATOR", 1, 0, false);
        declareFunction("make_iterator_hash_table_state", "MAKE-ITERATOR-HASH-TABLE-STATE", 1, 0, false);
        declareFunction("iterator_hash_table_done", "ITERATOR-HASH-TABLE-DONE", 1, 0, false);
        declareFunction("iterator_hash_table_next", "ITERATOR-HASH-TABLE-NEXT", 1, 0, false);
        declareFunction("new_lazy_iterator", "NEW-LAZY-ITERATOR", 2, 0, false);
        declareFunction("lazy_iterator_uninitializedP", "LAZY-ITERATOR-UNINITIALIZED?", 1, 0, false);
        declareFunction("lazy_iterator_valid_uninitializedP", "LAZY-ITERATOR-VALID-UNINITIALIZED?", 1, 0, false);
        declareFunction("initialize_lazy_iterator", "INITIALIZE-LAZY-ITERATOR", 1, 0, false);
        declareFunction("lazy_iterator_done", "LAZY-ITERATOR-DONE", 1, 0, false);
        declareFunction("lazy_iterator_next", "LAZY-ITERATOR-NEXT", 1, 0, false);
        declareFunction("new_indirect_iterator", "NEW-INDIRECT-ITERATOR", 1, 2, false);
        declareFunction("make_iterator_indirect_state", "MAKE-ITERATOR-INDIRECT-STATE", 2, 0, false);
        declareFunction("iterate_indirect_next", "ITERATE-INDIRECT-NEXT", 1, 0, false);
        declareFunction("iterate_indirect_finalize", "ITERATE-INDIRECT-FINALIZE", 1, 0, false);
        declareFunction("new_factory_iterator", "NEW-FACTORY-ITERATOR", 1, 2, false);
        declareFunction("make_iterator_factory_state", "MAKE-ITERATOR-FACTORY-STATE", 2, 0, false);
        declareFunction("iterate_factory_next", "ITERATE-FACTORY-NEXT", 1, 0, false);
        declareFunction("iterate_factory_finalize", "ITERATE-FACTORY-FINALIZE", 1, 0, false);
        declareFunction("new_iterator_iterator", "NEW-ITERATOR-ITERATOR", 1, 0, false);
        declareFunction("get_iterator_iterator_iterators", "GET-ITERATOR-ITERATOR-ITERATORS", 1, 0, false);
        declareFunction("make_iterator_iterator_state", "MAKE-ITERATOR-ITERATOR-STATE", 1, 0, false);
        declareFunction("iterator_iterator_done", "ITERATOR-ITERATOR-DONE", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$iterator_iterator_done$UnaryFunction();
        declareFunction("iterator_iterator_next", "ITERATOR-ITERATOR-NEXT", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$iterator_iterator_next$UnaryFunction();
        declareFunction("iterator_iterator_finalize", "ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_rotating_iterator_iterator", "NEW-ROTATING-ITERATOR-ITERATOR", 1, 0, false);
        declareFunction("validate_iterators", "VALIDATE-ITERATORS", 1, 1, false);
        declareFunction("get_rotating_iterator_iterator_iterators", "GET-ROTATING-ITERATOR-ITERATOR-ITERATORS", 1, 0, false);
        declareFunction("make_rotating_iterator_iterator_state", "MAKE-ROTATING-ITERATOR-ITERATOR-STATE", 1, 0, false);
        declareFunction("rotating_iterator_iterator_done", "ROTATING-ITERATOR-ITERATOR-DONE", 1, 0, false);
        declareFunction("rotating_iterator_iterator_next", "ROTATING-ITERATOR-ITERATOR-NEXT", 1, 0, false);
        declareFunction("rotating_iterator_iterator_finalize", "ROTATING-ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_reusable_iterator", "NEW-REUSABLE-ITERATOR", 3, 1, false);
        declareFunction("reusable_iterator_done", "REUSABLE-ITERATOR-DONE", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$reusable_iterator_done$UnaryFunction();
        declareFunction("reusable_iterator_next", "REUSABLE-ITERATOR-NEXT", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$reusable_iterator_next$UnaryFunction();
        declareFunction("reusable_iterator_finalize", "REUSABLE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_reusable_iterator_from_iterator", "NEW-REUSABLE-ITERATOR-FROM-ITERATOR", 1, 0, false);
        declareFunction("reusable_iterator_from_iterator_done", "REUSABLE-ITERATOR-FROM-ITERATOR-DONE", 1, 0, false);
        declareFunction("reusable_iterator_from_iterator_next", "REUSABLE-ITERATOR-FROM-ITERATOR-NEXT", 1, 0, false);
        declareFunction("reusable_iterator_from_iterator_finalize", "REUSABLE-ITERATOR-FROM-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_reusable_list_iterator", "NEW-REUSABLE-LIST-ITERATOR", 1, 0, false);
        declareFunction("reset_reusable_iterator", "RESET-REUSABLE-ITERATOR", 1, 0, false);
        declareFunction("finish_reusable_iterator", "FINISH-REUSABLE-ITERATOR", 1, 0, false);
        declareMacro("do_reusable_iterator", "DO-REUSABLE-ITERATOR");
        declareFunction("map_reusable_iterator", "MAP-REUSABLE-ITERATOR", 2, 0, false);
        declareFunction("new_reusable_iterator_cartesian_iterator", "NEW-REUSABLE-ITERATOR-CARTESIAN-ITERATOR", 1, 0, false);
        declareFunction("reusable_iterator_cartesian_iterator_state", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-STATE", 1, 0, false);
        declareFunction("reusable_iterator_cartesian_iterator_done", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$reusable_iterator_cartesian_iterator_done$UnaryFunction();
        declareFunction("all_iterators_doneP", "ALL-ITERATORS-DONE?", 1, 0, false);
        declareFunction("reusable_iterator_cartesian_iterator_next", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$reusable_iterator_cartesian_iterator_next$UnaryFunction();
        declareFunction("reusable_iterator_cartesian_iterator_finalize", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_filter_iterator", "NEW-FILTER-ITERATOR", 2, 1, false);
        declareFunction("new_filter_iterator_without_values", "NEW-FILTER-ITERATOR-WITHOUT-VALUES", 2, 2, false);
        declareFunction("new_filter_and_transform_iterator", "NEW-FILTER-AND-TRANSFORM-ITERATOR", 2, 1, false);
        declareFunction("make_filter_iterator_state", "MAKE-FILTER-ITERATOR-STATE", 3, 0, false);
        declareFunction("make_filter_iterator_without_values_state", "MAKE-FILTER-ITERATOR-WITHOUT-VALUES-STATE", 4, 0, false);
        declareFunction("make_filter_and_tranform_iterator_state", "MAKE-FILTER-AND-TRANFORM-ITERATOR-STATE", 3, 0, false);
        declareFunction("filter_iterator_next", "FILTER-ITERATOR-NEXT", 1, 0, false);
        declareFunction("filter_iterator_without_values_next", "FILTER-ITERATOR-WITHOUT-VALUES-NEXT", 1, 0, false);
        declareFunction("filter_and_transform_iterator_next", "FILTER-AND-TRANSFORM-ITERATOR-NEXT", 1, 0, false);
        declareFunction("default_iterator_done_p", "DEFAULT-ITERATOR-DONE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.iteration.$default_iterator_done_p$UnaryFunction();
        declareFunction("test_iterate_once", "TEST-ITERATE-ONCE", 1, 0, false);
        declareFunction("test_iterate_all", "TEST-ITERATE-ALL", 1, 0, false);
        declareFunction("xml_token_iterator_p", "XML-TOKEN-ITERATOR-P", 1, 0, false);
        declareFunction("xml_token_iterator_peek", "XML-TOKEN-ITERATOR-PEEK", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_iteration_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("iterator_print_function_trampoline", "ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("iterator_p", "ITERATOR-P", 1, 0, false);
            new iteration.$iterator_p$UnaryFunction();
            declareFunction("it_state", "IT-STATE", 1, 0, false);
            declareFunction("it_done", "IT-DONE", 1, 0, false);
            declareFunction("it_next", "IT-NEXT", 1, 0, false);
            declareFunction("it_finalize", "IT-FINALIZE", 1, 0, false);
            declareFunction("_csetf_it_state", "_CSETF-IT-STATE", 2, 0, false);
            declareFunction("_csetf_it_done", "_CSETF-IT-DONE", 2, 0, false);
            declareFunction("_csetf_it_next", "_CSETF-IT-NEXT", 2, 0, false);
            declareFunction("_csetf_it_finalize", "_CSETF-IT-FINALIZE", 2, 0, false);
            declareFunction("make_iterator", "MAKE-ITERATOR", 0, 1, false);
            declareFunction("visit_defstruct_iterator", "VISIT-DEFSTRUCT-ITERATOR", 2, 0, false);
            declareFunction("visit_defstruct_object_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITERATOR-METHOD", 2, 0, false);
            declareFunction("print_iterator", "PRINT-ITERATOR", 3, 0, false);
            declareFunction("new_iterator", "NEW-ITERATOR", 3, 1, false);
            declareFunction("iteration_done", "ITERATION-DONE", 1, 0, false);
            declareFunction("iteration_next_funcall", "ITERATION-NEXT-FUNCALL", 2, 0, false);
            declareFunction("iteration_next", "ITERATION-NEXT", 1, 0, false);
            declareFunction("iteration_next_without_values", "ITERATION-NEXT-WITHOUT-VALUES", 1, 1, false);
            declareFunction("iteration_next_without_values_macro_helper", "ITERATION-NEXT-WITHOUT-VALUES-MACRO-HELPER", 1, 1, false);
            declareFunction("iteration_finalize", "ITERATION-FINALIZE", 1, 0, false);
            declareFunction("iterator_type_name", "ITERATOR-TYPE-NAME", 1, 0, false);
            declareFunction("iteration_state_peek", "ITERATION-STATE-PEEK", 1, 0, false);
            declareFunction("iteration_next_peek", "ITERATION-NEXT-PEEK", 1, 0, false);
            declareMacro("do_iterator", "DO-ITERATOR");
            declareMacro("do_iterator_without_values_progress", "DO-ITERATOR-WITHOUT-VALUES-PROGRESS");
            declareMacro("do_iterator_without_values", "DO-ITERATOR-WITHOUT-VALUES");
            declareMacro("do_iterator_without_values_internal", "DO-ITERATOR-WITHOUT-VALUES-INTERNAL");
            declareMacro("do_n_iterator_objects", "DO-N-ITERATOR-OBJECTS");
            declareFunction("map_iterator", "MAP-ITERATOR", 2, 0, false);
            declareFunction("copy_iterator", "COPY-ITERATOR", 1, 1, false);
            declareFunction("iterator_value_list", "ITERATOR-VALUE-LIST", 1, 0, false);
            declareFunction("generic_producer", "GENERIC-PRODUCER", 2, 1, false);
            declareFunction("new_null_iterator", "NEW-NULL-ITERATOR", 0, 0, false);
            declareFunction("new_singleton_iterator", "NEW-SINGLETON-ITERATOR", 1, 0, false);
            declareFunction("iterate_non_null_singleton_next", "ITERATE-NON-NULL-SINGLETON-NEXT", 1, 0, false);
            new iteration.$iterate_non_null_singleton_next$UnaryFunction();
            declareFunction("new_integer_iterator", "NEW-INTEGER-ITERATOR", 0, 3, false);
            declareFunction("new_number_iterator", "NEW-NUMBER-ITERATOR", 0, 3, false);
            declareFunction("make_iterator_number_state", "MAKE-ITERATOR-NUMBER-STATE", 3, 0, false);
            declareFunction("iterate_number_done", "ITERATE-NUMBER-DONE", 1, 0, false);
            new iteration.$iterate_number_done$UnaryFunction();
            declareFunction("iterate_number_next", "ITERATE-NUMBER-NEXT", 1, 0, false);
            declareFunction("list_iterator_p", "LIST-ITERATOR-P", 1, 0, false);
            declareFunction("new_list_iterator", "NEW-LIST-ITERATOR", 1, 0, false);
            declareFunction("get_list_iterator_list", "GET-LIST-ITERATOR-LIST", 1, 0, false);
            declareFunction("list_iterator_size", "LIST-ITERATOR-SIZE", 1, 0, false);
            declareFunction("make_iterator_list_state", "MAKE-ITERATOR-LIST-STATE", 1, 0, false);
            declareFunction("iterate_list_done", "ITERATE-LIST-DONE", 1, 0, false);
            new iteration.$iterate_list_done$UnaryFunction();
            declareFunction("iterate_list_next", "ITERATE-LIST-NEXT", 1, 0, false);
            new iteration.$iterate_list_next$UnaryFunction();
            declareFunction("inference_list_iterator_p", "INFERENCE-LIST-ITERATOR-P", 1, 0, false);
            declareFunction("new_inference_list_iterator", "NEW-INFERENCE-LIST-ITERATOR", 1, 0, false);
            declareFunction("get_inference_list_iterator_list", "GET-INFERENCE-LIST-ITERATOR-LIST", 1, 0, false);
            declareFunction("inference_list_iterator_size", "INFERENCE-LIST-ITERATOR-SIZE", 1, 0, false);
            declareFunction("make_inference_iterator_list_state", "MAKE-INFERENCE-ITERATOR-LIST-STATE", 1, 0, false);
            declareFunction("iterate_inference_list_done", "ITERATE-INFERENCE-LIST-DONE", 1, 0, false);
            declareFunction("iterate_inference_list_next", "ITERATE-INFERENCE-LIST-NEXT", 1, 0, false);
            declareFunction("new_alist_iterator", "NEW-ALIST-ITERATOR", 1, 0, false);
            declareFunction("new_vector_iterator", "NEW-VECTOR-ITERATOR", 1, 0, false);
            declareFunction("make_iterator_vector_state", "MAKE-ITERATOR-VECTOR-STATE", 1, 0, false);
            declareFunction("iterate_vector_next", "ITERATE-VECTOR-NEXT", 1, 0, false);
            new iteration.$iterate_vector_next$UnaryFunction();
            declareFunction("new_vector_index_iterator", "NEW-VECTOR-INDEX-ITERATOR", 1, 0, false);
            declareFunction("make_iterator_vector_index_state", "MAKE-ITERATOR-VECTOR-INDEX-STATE", 1, 0, false);
            declareFunction("iterate_vector_index_next", "ITERATE-VECTOR-INDEX-NEXT", 1, 0, false);
            declareFunction("new_string_iterator", "NEW-STRING-ITERATOR", 1, 0, false);
            declareFunction("new_sequence_iterator", "NEW-SEQUENCE-ITERATOR", 1, 2, false);
            declareFunction("new_hash_table_iterator", "NEW-HASH-TABLE-ITERATOR", 1, 0, false);
            declareFunction("new_hash_table_keys_iterator", "NEW-HASH-TABLE-KEYS-ITERATOR", 1, 0, false);
            declareFunction("new_hash_table_values_iterator", "NEW-HASH-TABLE-VALUES-ITERATOR", 1, 0, false);
            declareFunction("make_iterator_hash_table_state", "MAKE-ITERATOR-HASH-TABLE-STATE", 1, 0, false);
            declareFunction("iterator_hash_table_done", "ITERATOR-HASH-TABLE-DONE", 1, 0, false);
            declareFunction("iterator_hash_table_next", "ITERATOR-HASH-TABLE-NEXT", 1, 0, false);
            declareFunction("new_file_form_iterator", "NEW-FILE-FORM-ITERATOR", 1, 2, false);
            declareFunction("make_file_form_iterator_state", "MAKE-FILE-FORM-ITERATOR-STATE", 1, 2, false);
            declareFunction("file_form_iterator_doneP", "FILE-FORM-ITERATOR-DONE?", 1, 0, false);
            declareFunction("file_form_iterator_next", "FILE-FORM-ITERATOR-NEXT", 1, 0, false);
            declareFunction("file_form_iterator_finalize", "FILE-FORM-ITERATOR-FINALIZE", 1, 0, false);
            declareFunction("new_lazy_iterator", "NEW-LAZY-ITERATOR", 2, 0, false);
            declareFunction("lazy_iterator_uninitializedP", "LAZY-ITERATOR-UNINITIALIZED?", 1, 0, false);
            declareFunction("lazy_iterator_valid_uninitializedP", "LAZY-ITERATOR-VALID-UNINITIALIZED?", 1, 0, false);
            declareFunction("initialize_lazy_iterator", "INITIALIZE-LAZY-ITERATOR", 1, 0, false);
            declareFunction("lazy_iterator_done", "LAZY-ITERATOR-DONE", 1, 0, false);
            declareFunction("lazy_iterator_next", "LAZY-ITERATOR-NEXT", 1, 0, false);
            declareFunction("new_indirect_iterator", "NEW-INDIRECT-ITERATOR", 1, 2, false);
            declareFunction("make_iterator_indirect_state", "MAKE-ITERATOR-INDIRECT-STATE", 2, 0, false);
            declareFunction("iterate_indirect_next", "ITERATE-INDIRECT-NEXT", 1, 0, false);
            declareFunction("iterate_indirect_finalize", "ITERATE-INDIRECT-FINALIZE", 1, 0, false);
            declareFunction("new_factory_iterator", "NEW-FACTORY-ITERATOR", 1, 2, false);
            declareFunction("make_iterator_factory_state", "MAKE-ITERATOR-FACTORY-STATE", 2, 0, false);
            declareFunction("iterate_factory_next", "ITERATE-FACTORY-NEXT", 1, 0, false);
            declareFunction("iterate_factory_finalize", "ITERATE-FACTORY-FINALIZE", 1, 0, false);
            declareFunction("new_meta_iterator_iterator", "NEW-META-ITERATOR-ITERATOR", 1, 0, false);
            declareFunction("make_meta_iterator_iterator_state", "MAKE-META-ITERATOR-ITERATOR-STATE", 1, 0, false);
            declareFunction("meta_iterator_iterator_done", "META-ITERATOR-ITERATOR-DONE", 1, 0, false);
            declareFunction("meta_iterator_iterator_next", "META-ITERATOR-ITERATOR-NEXT", 1, 0, false);
            declareFunction("meta_iterator_iterator_finalize", "META-ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
            declareFunction("new_iterator_iterator", "NEW-ITERATOR-ITERATOR", 1, 0, false);
            declareFunction("get_iterator_iterator_iterators", "GET-ITERATOR-ITERATOR-ITERATORS", 1, 0, false);
            declareFunction("make_iterator_iterator_state", "MAKE-ITERATOR-ITERATOR-STATE", 1, 0, false);
            declareFunction("iterator_iterator_done", "ITERATOR-ITERATOR-DONE", 1, 0, false);
            new iteration.$iterator_iterator_done$UnaryFunction();
            declareFunction("iterator_iterator_next", "ITERATOR-ITERATOR-NEXT", 1, 0, false);
            new iteration.$iterator_iterator_next$UnaryFunction();
            declareFunction("iterator_iterator_finalize", "ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
            declareFunction("new_rotating_iterator_iterator", "NEW-ROTATING-ITERATOR-ITERATOR", 1, 0, false);
            declareFunction("validate_iterators", "VALIDATE-ITERATORS", 1, 1, false);
            declareFunction("get_rotating_iterator_iterator_iterators", "GET-ROTATING-ITERATOR-ITERATOR-ITERATORS", 1, 0, false);
            declareFunction("make_rotating_iterator_iterator_state", "MAKE-ROTATING-ITERATOR-ITERATOR-STATE", 1, 0, false);
            declareFunction("rotating_iterator_iterator_done", "ROTATING-ITERATOR-ITERATOR-DONE", 1, 0, false);
            declareFunction("rotating_iterator_iterator_next", "ROTATING-ITERATOR-ITERATOR-NEXT", 1, 0, false);
            declareFunction("rotating_iterator_iterator_finalize", "ROTATING-ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
            declareFunction("new_reusable_iterator", "NEW-REUSABLE-ITERATOR", 3, 1, false);
            declareFunction("reusable_iterator_done", "REUSABLE-ITERATOR-DONE", 1, 0, false);
            new iteration.$reusable_iterator_done$UnaryFunction();
            declareFunction("reusable_iterator_next", "REUSABLE-ITERATOR-NEXT", 1, 0, false);
            new iteration.$reusable_iterator_next$UnaryFunction();
            declareFunction("reusable_iterator_finalize", "REUSABLE-ITERATOR-FINALIZE", 1, 0, false);
            declareFunction("new_reusable_iterator_from_iterator", "NEW-REUSABLE-ITERATOR-FROM-ITERATOR", 1, 0, false);
            declareFunction("reusable_iterator_from_iterator_done", "REUSABLE-ITERATOR-FROM-ITERATOR-DONE", 1, 0, false);
            declareFunction("reusable_iterator_from_iterator_next", "REUSABLE-ITERATOR-FROM-ITERATOR-NEXT", 1, 0, false);
            declareFunction("reusable_iterator_from_iterator_finalize", "REUSABLE-ITERATOR-FROM-ITERATOR-FINALIZE", 1, 0, false);
            declareFunction("new_reusable_list_iterator", "NEW-REUSABLE-LIST-ITERATOR", 1, 0, false);
            declareFunction("reset_reusable_iterator", "RESET-REUSABLE-ITERATOR", 1, 0, false);
            declareFunction("finish_reusable_iterator", "FINISH-REUSABLE-ITERATOR", 1, 0, false);
            declareMacro("do_reusable_iterator", "DO-REUSABLE-ITERATOR");
            declareFunction("map_reusable_iterator", "MAP-REUSABLE-ITERATOR", 2, 0, false);
            declareFunction("new_reusable_iterator_cartesian_iterator", "NEW-REUSABLE-ITERATOR-CARTESIAN-ITERATOR", 1, 0, false);
            declareFunction("reusable_iterator_cartesian_iterator_state", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-STATE", 1, 0, false);
            declareFunction("reusable_iterator_cartesian_iterator_done", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE", 1, 0, false);
            new iteration.$reusable_iterator_cartesian_iterator_done$UnaryFunction();
            declareFunction("all_iterators_doneP", "ALL-ITERATORS-DONE?", 1, 0, false);
            declareFunction("reusable_iterator_cartesian_iterator_next", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT", 1, 0, false);
            new iteration.$reusable_iterator_cartesian_iterator_next$UnaryFunction();
            declareFunction("reusable_iterator_cartesian_iterator_finalize", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-FINALIZE", 1, 0, false);
            declareFunction("new_filter_iterator", "NEW-FILTER-ITERATOR", 2, 1, false);
            declareFunction("new_filter_iterator_without_values", "NEW-FILTER-ITERATOR-WITHOUT-VALUES", 2, 2, false);
            declareFunction("new_filter_and_transform_iterator", "NEW-FILTER-AND-TRANSFORM-ITERATOR", 2, 1, false);
            declareFunction("make_filter_iterator_state", "MAKE-FILTER-ITERATOR-STATE", 3, 0, false);
            declareFunction("make_filter_iterator_without_values_state", "MAKE-FILTER-ITERATOR-WITHOUT-VALUES-STATE", 4, 0, false);
            declareFunction("make_filter_and_tranform_iterator_state", "MAKE-FILTER-AND-TRANFORM-ITERATOR-STATE", 3, 0, false);
            declareFunction("filter_iterator_finalize", "FILTER-ITERATOR-FINALIZE", 1, 0, false);
            declareFunction("filter_iterator_next", "FILTER-ITERATOR-NEXT", 1, 0, false);
            declareFunction("filter_iterator_without_values_next", "FILTER-ITERATOR-WITHOUT-VALUES-NEXT", 1, 0, false);
            declareFunction("filter_and_transform_iterator_next", "FILTER-AND-TRANSFORM-ITERATOR-NEXT", 1, 0, false);
            declareFunction("default_iterator_done_p", "DEFAULT-ITERATOR-DONE-P", 1, 0, false);
            new iteration.$default_iterator_done_p$UnaryFunction();
            declareFunction("test_iterate_once", "TEST-ITERATE-ONCE", 1, 0, false);
            declareFunction("test_iterate_all", "TEST-ITERATE-ALL", 1, 0, false);
            declareFunction("new_transform_iterator", "NEW-TRANSFORM-ITERATOR", 2, 1, false);
            declareFunction("make_xform_iterator_state", "MAKE-XFORM-ITERATOR-STATE", 3, 0, false);
            declareFunction("xform_iterator_done", "XFORM-ITERATOR-DONE", 1, 0, false);
            declareFunction("xform_iterator_next", "XFORM-ITERATOR-NEXT", 1, 0, false);
            declareFunction("xml_token_iterator_p", "XML-TOKEN-ITERATOR-P", 1, 0, false);
            declareFunction("xml_token_iterator_peek", "XML-TOKEN-ITERATOR-PEEK", 1, 0, false);
            declareFunction("iterator_size_exhaustive", "ITERATOR-SIZE-EXHAUSTIVE", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("cons_to_tuple", "CONS-TO-TUPLE", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_iteration_file_Previous() {
        declareFunction("iterator_print_function_trampoline", "ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("iterator_p", "ITERATOR-P", 1, 0, false);
        new iteration.$iterator_p$UnaryFunction();
        declareFunction("it_state", "IT-STATE", 1, 0, false);
        declareFunction("it_done", "IT-DONE", 1, 0, false);
        declareFunction("it_next", "IT-NEXT", 1, 0, false);
        declareFunction("it_finalize", "IT-FINALIZE", 1, 0, false);
        declareFunction("_csetf_it_state", "_CSETF-IT-STATE", 2, 0, false);
        declareFunction("_csetf_it_done", "_CSETF-IT-DONE", 2, 0, false);
        declareFunction("_csetf_it_next", "_CSETF-IT-NEXT", 2, 0, false);
        declareFunction("_csetf_it_finalize", "_CSETF-IT-FINALIZE", 2, 0, false);
        declareFunction("make_iterator", "MAKE-ITERATOR", 0, 1, false);
        declareFunction("visit_defstruct_iterator", "VISIT-DEFSTRUCT-ITERATOR", 2, 0, false);
        declareFunction("visit_defstruct_object_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITERATOR-METHOD", 2, 0, false);
        declareFunction("print_iterator", "PRINT-ITERATOR", 3, 0, false);
        declareFunction("new_iterator", "NEW-ITERATOR", 3, 1, false);
        declareFunction("iteration_done", "ITERATION-DONE", 1, 0, false);
        declareFunction("iteration_next_funcall", "ITERATION-NEXT-FUNCALL", 2, 0, false);
        declareFunction("iteration_next", "ITERATION-NEXT", 1, 0, false);
        declareFunction("iteration_next_without_values", "ITERATION-NEXT-WITHOUT-VALUES", 1, 1, false);
        declareFunction("iteration_next_without_values_macro_helper", "ITERATION-NEXT-WITHOUT-VALUES-MACRO-HELPER", 1, 1, false);
        declareFunction("iteration_finalize", "ITERATION-FINALIZE", 1, 0, false);
        declareFunction("iterator_type_name", "ITERATOR-TYPE-NAME", 1, 0, false);
        declareFunction("iteration_state_peek", "ITERATION-STATE-PEEK", 1, 0, false);
        declareFunction("iteration_next_peek", "ITERATION-NEXT-PEEK", 1, 0, false);
        declareMacro("do_iterator", "DO-ITERATOR");
        declareMacro("do_iterator_without_values_progress", "DO-ITERATOR-WITHOUT-VALUES-PROGRESS");
        declareMacro("do_iterator_without_values", "DO-ITERATOR-WITHOUT-VALUES");
        declareMacro("do_iterator_without_values_internal", "DO-ITERATOR-WITHOUT-VALUES-INTERNAL");
        declareMacro("do_n_iterator_objects", "DO-N-ITERATOR-OBJECTS");
        declareFunction("map_iterator", "MAP-ITERATOR", 2, 0, false);
        declareFunction("copy_iterator", "COPY-ITERATOR", 1, 1, false);
        declareFunction("iterator_value_list", "ITERATOR-VALUE-LIST", 1, 0, false);
        declareFunction("generic_producer", "GENERIC-PRODUCER", 2, 1, false);
        declareFunction("new_null_iterator", "NEW-NULL-ITERATOR", 0, 0, false);
        declareFunction("new_singleton_iterator", "NEW-SINGLETON-ITERATOR", 1, 0, false);
        declareFunction("iterate_non_null_singleton_next", "ITERATE-NON-NULL-SINGLETON-NEXT", 1, 0, false);
        new iteration.$iterate_non_null_singleton_next$UnaryFunction();
        declareFunction("new_integer_iterator", "NEW-INTEGER-ITERATOR", 0, 3, false);
        declareFunction("new_number_iterator", "NEW-NUMBER-ITERATOR", 0, 3, false);
        declareFunction("make_iterator_number_state", "MAKE-ITERATOR-NUMBER-STATE", 3, 0, false);
        declareFunction("iterate_number_done", "ITERATE-NUMBER-DONE", 1, 0, false);
        new iteration.$iterate_number_done$UnaryFunction();
        declareFunction("iterate_number_next", "ITERATE-NUMBER-NEXT", 1, 0, false);
        declareFunction("list_iterator_p", "LIST-ITERATOR-P", 1, 0, false);
        declareFunction("new_list_iterator", "NEW-LIST-ITERATOR", 1, 0, false);
        declareFunction("get_list_iterator_list", "GET-LIST-ITERATOR-LIST", 1, 0, false);
        declareFunction("list_iterator_size", "LIST-ITERATOR-SIZE", 1, 0, false);
        declareFunction("make_iterator_list_state", "MAKE-ITERATOR-LIST-STATE", 1, 0, false);
        declareFunction("iterate_list_done", "ITERATE-LIST-DONE", 1, 0, false);
        new iteration.$iterate_list_done$UnaryFunction();
        declareFunction("iterate_list_next", "ITERATE-LIST-NEXT", 1, 0, false);
        new iteration.$iterate_list_next$UnaryFunction();
        declareFunction("inference_list_iterator_p", "INFERENCE-LIST-ITERATOR-P", 1, 0, false);
        declareFunction("new_inference_list_iterator", "NEW-INFERENCE-LIST-ITERATOR", 1, 0, false);
        declareFunction("get_inference_list_iterator_list", "GET-INFERENCE-LIST-ITERATOR-LIST", 1, 0, false);
        declareFunction("inference_list_iterator_size", "INFERENCE-LIST-ITERATOR-SIZE", 1, 0, false);
        declareFunction("make_inference_iterator_list_state", "MAKE-INFERENCE-ITERATOR-LIST-STATE", 1, 0, false);
        declareFunction("iterate_inference_list_done", "ITERATE-INFERENCE-LIST-DONE", 1, 0, false);
        declareFunction("iterate_inference_list_next", "ITERATE-INFERENCE-LIST-NEXT", 1, 0, false);
        declareFunction("new_alist_iterator", "NEW-ALIST-ITERATOR", 1, 0, false);
        declareFunction("new_vector_iterator", "NEW-VECTOR-ITERATOR", 1, 0, false);
        declareFunction("make_iterator_vector_state", "MAKE-ITERATOR-VECTOR-STATE", 1, 0, false);
        declareFunction("iterate_vector_next", "ITERATE-VECTOR-NEXT", 1, 0, false);
        new iteration.$iterate_vector_next$UnaryFunction();
        declareFunction("new_vector_index_iterator", "NEW-VECTOR-INDEX-ITERATOR", 1, 0, false);
        declareFunction("make_iterator_vector_index_state", "MAKE-ITERATOR-VECTOR-INDEX-STATE", 1, 0, false);
        declareFunction("iterate_vector_index_next", "ITERATE-VECTOR-INDEX-NEXT", 1, 0, false);
        declareFunction("new_string_iterator", "NEW-STRING-ITERATOR", 1, 0, false);
        declareFunction("new_sequence_iterator", "NEW-SEQUENCE-ITERATOR", 1, 2, false);
        declareFunction("new_hash_table_iterator", "NEW-HASH-TABLE-ITERATOR", 1, 0, false);
        declareFunction("new_hash_table_keys_iterator", "NEW-HASH-TABLE-KEYS-ITERATOR", 1, 0, false);
        declareFunction("new_hash_table_values_iterator", "NEW-HASH-TABLE-VALUES-ITERATOR", 1, 0, false);
        declareFunction("make_iterator_hash_table_state", "MAKE-ITERATOR-HASH-TABLE-STATE", 1, 0, false);
        declareFunction("iterator_hash_table_done", "ITERATOR-HASH-TABLE-DONE", 1, 0, false);
        declareFunction("iterator_hash_table_next", "ITERATOR-HASH-TABLE-NEXT", 1, 0, false);
        declareFunction("new_file_form_iterator", "NEW-FILE-FORM-ITERATOR", 1, 2, false);
        declareFunction("make_file_form_iterator_state", "MAKE-FILE-FORM-ITERATOR-STATE", 1, 2, false);
        declareFunction("file_form_iterator_doneP", "FILE-FORM-ITERATOR-DONE?", 1, 0, false);
        declareFunction("file_form_iterator_next", "FILE-FORM-ITERATOR-NEXT", 1, 0, false);
        declareFunction("file_form_iterator_finalize", "FILE-FORM-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_lazy_iterator", "NEW-LAZY-ITERATOR", 2, 0, false);
        declareFunction("lazy_iterator_uninitializedP", "LAZY-ITERATOR-UNINITIALIZED?", 1, 0, false);
        declareFunction("lazy_iterator_valid_uninitializedP", "LAZY-ITERATOR-VALID-UNINITIALIZED?", 1, 0, false);
        declareFunction("initialize_lazy_iterator", "INITIALIZE-LAZY-ITERATOR", 1, 0, false);
        declareFunction("lazy_iterator_done", "LAZY-ITERATOR-DONE", 1, 0, false);
        declareFunction("lazy_iterator_next", "LAZY-ITERATOR-NEXT", 1, 0, false);
        declareFunction("new_indirect_iterator", "NEW-INDIRECT-ITERATOR", 1, 2, false);
        declareFunction("make_iterator_indirect_state", "MAKE-ITERATOR-INDIRECT-STATE", 2, 0, false);
        declareFunction("iterate_indirect_next", "ITERATE-INDIRECT-NEXT", 1, 0, false);
        declareFunction("iterate_indirect_finalize", "ITERATE-INDIRECT-FINALIZE", 1, 0, false);
        declareFunction("new_factory_iterator", "NEW-FACTORY-ITERATOR", 1, 2, false);
        declareFunction("make_iterator_factory_state", "MAKE-ITERATOR-FACTORY-STATE", 2, 0, false);
        declareFunction("iterate_factory_next", "ITERATE-FACTORY-NEXT", 1, 0, false);
        declareFunction("iterate_factory_finalize", "ITERATE-FACTORY-FINALIZE", 1, 0, false);
        declareFunction("new_meta_iterator_iterator", "NEW-META-ITERATOR-ITERATOR", 1, 0, false);
        declareFunction("make_meta_iterator_iterator_state", "MAKE-META-ITERATOR-ITERATOR-STATE", 1, 0, false);
        declareFunction("meta_iterator_iterator_done", "META-ITERATOR-ITERATOR-DONE", 1, 0, false);
        declareFunction("meta_iterator_iterator_next", "META-ITERATOR-ITERATOR-NEXT", 1, 0, false);
        declareFunction("meta_iterator_iterator_finalize", "META-ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_iterator_iterator", "NEW-ITERATOR-ITERATOR", 1, 0, false);
        declareFunction("get_iterator_iterator_iterators", "GET-ITERATOR-ITERATOR-ITERATORS", 1, 0, false);
        declareFunction("make_iterator_iterator_state", "MAKE-ITERATOR-ITERATOR-STATE", 1, 0, false);
        declareFunction("iterator_iterator_done", "ITERATOR-ITERATOR-DONE", 1, 0, false);
        new iteration.$iterator_iterator_done$UnaryFunction();
        declareFunction("iterator_iterator_next", "ITERATOR-ITERATOR-NEXT", 1, 0, false);
        new iteration.$iterator_iterator_next$UnaryFunction();
        declareFunction("iterator_iterator_finalize", "ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_rotating_iterator_iterator", "NEW-ROTATING-ITERATOR-ITERATOR", 1, 0, false);
        declareFunction("validate_iterators", "VALIDATE-ITERATORS", 1, 1, false);
        declareFunction("get_rotating_iterator_iterator_iterators", "GET-ROTATING-ITERATOR-ITERATOR-ITERATORS", 1, 0, false);
        declareFunction("make_rotating_iterator_iterator_state", "MAKE-ROTATING-ITERATOR-ITERATOR-STATE", 1, 0, false);
        declareFunction("rotating_iterator_iterator_done", "ROTATING-ITERATOR-ITERATOR-DONE", 1, 0, false);
        declareFunction("rotating_iterator_iterator_next", "ROTATING-ITERATOR-ITERATOR-NEXT", 1, 0, false);
        declareFunction("rotating_iterator_iterator_finalize", "ROTATING-ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_reusable_iterator", "NEW-REUSABLE-ITERATOR", 3, 1, false);
        declareFunction("reusable_iterator_done", "REUSABLE-ITERATOR-DONE", 1, 0, false);
        new iteration.$reusable_iterator_done$UnaryFunction();
        declareFunction("reusable_iterator_next", "REUSABLE-ITERATOR-NEXT", 1, 0, false);
        new iteration.$reusable_iterator_next$UnaryFunction();
        declareFunction("reusable_iterator_finalize", "REUSABLE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_reusable_iterator_from_iterator", "NEW-REUSABLE-ITERATOR-FROM-ITERATOR", 1, 0, false);
        declareFunction("reusable_iterator_from_iterator_done", "REUSABLE-ITERATOR-FROM-ITERATOR-DONE", 1, 0, false);
        declareFunction("reusable_iterator_from_iterator_next", "REUSABLE-ITERATOR-FROM-ITERATOR-NEXT", 1, 0, false);
        declareFunction("reusable_iterator_from_iterator_finalize", "REUSABLE-ITERATOR-FROM-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_reusable_list_iterator", "NEW-REUSABLE-LIST-ITERATOR", 1, 0, false);
        declareFunction("reset_reusable_iterator", "RESET-REUSABLE-ITERATOR", 1, 0, false);
        declareFunction("finish_reusable_iterator", "FINISH-REUSABLE-ITERATOR", 1, 0, false);
        declareMacro("do_reusable_iterator", "DO-REUSABLE-ITERATOR");
        declareFunction("map_reusable_iterator", "MAP-REUSABLE-ITERATOR", 2, 0, false);
        declareFunction("new_reusable_iterator_cartesian_iterator", "NEW-REUSABLE-ITERATOR-CARTESIAN-ITERATOR", 1, 0, false);
        declareFunction("reusable_iterator_cartesian_iterator_state", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-STATE", 1, 0, false);
        declareFunction("reusable_iterator_cartesian_iterator_done", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE", 1, 0, false);
        new iteration.$reusable_iterator_cartesian_iterator_done$UnaryFunction();
        declareFunction("all_iterators_doneP", "ALL-ITERATORS-DONE?", 1, 0, false);
        declareFunction("reusable_iterator_cartesian_iterator_next", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT", 1, 0, false);
        new iteration.$reusable_iterator_cartesian_iterator_next$UnaryFunction();
        declareFunction("reusable_iterator_cartesian_iterator_finalize", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_filter_iterator", "NEW-FILTER-ITERATOR", 2, 1, false);
        declareFunction("new_filter_iterator_without_values", "NEW-FILTER-ITERATOR-WITHOUT-VALUES", 2, 2, false);
        declareFunction("new_filter_and_transform_iterator", "NEW-FILTER-AND-TRANSFORM-ITERATOR", 2, 1, false);
        declareFunction("make_filter_iterator_state", "MAKE-FILTER-ITERATOR-STATE", 3, 0, false);
        declareFunction("make_filter_iterator_without_values_state", "MAKE-FILTER-ITERATOR-WITHOUT-VALUES-STATE", 4, 0, false);
        declareFunction("make_filter_and_tranform_iterator_state", "MAKE-FILTER-AND-TRANFORM-ITERATOR-STATE", 3, 0, false);
        declareFunction("filter_iterator_finalize", "FILTER-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("filter_iterator_next", "FILTER-ITERATOR-NEXT", 1, 0, false);
        declareFunction("filter_iterator_without_values_next", "FILTER-ITERATOR-WITHOUT-VALUES-NEXT", 1, 0, false);
        declareFunction("filter_and_transform_iterator_next", "FILTER-AND-TRANSFORM-ITERATOR-NEXT", 1, 0, false);
        declareFunction("default_iterator_done_p", "DEFAULT-ITERATOR-DONE-P", 1, 0, false);
        new iteration.$default_iterator_done_p$UnaryFunction();
        declareFunction("test_iterate_once", "TEST-ITERATE-ONCE", 1, 0, false);
        declareFunction("test_iterate_all", "TEST-ITERATE-ALL", 1, 0, false);
        declareFunction("new_transform_iterator", "NEW-TRANSFORM-ITERATOR", 2, 1, false);
        declareFunction("make_xform_iterator_state", "MAKE-XFORM-ITERATOR-STATE", 3, 0, false);
        declareFunction("xform_iterator_done", "XFORM-ITERATOR-DONE", 1, 0, false);
        declareFunction("xform_iterator_next", "XFORM-ITERATOR-NEXT", 1, 0, false);
        declareFunction("xml_token_iterator_p", "XML-TOKEN-ITERATOR-P", 1, 0, false);
        declareFunction("xml_token_iterator_peek", "XML-TOKEN-ITERATOR-PEEK", 1, 0, false);
        declareFunction("iterator_size_exhaustive", "ITERATOR-SIZE-EXHAUSTIVE", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("STATE"), makeSymbol("DONE"), makeSymbol("NEXT"), makeSymbol("FINALIZE"));

    static private final SubLList $list_alt3 = list(makeKeyword("STATE"), $DONE, $NEXT, makeKeyword("FINALIZE"));

    static private final SubLList $list_alt4 = list(makeSymbol("IT-STATE"), makeSymbol("IT-DONE"), makeSymbol("IT-NEXT"), makeSymbol("IT-FINALIZE"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-IT-STATE"), makeSymbol("_CSETF-IT-DONE"), makeSymbol("_CSETF-IT-NEXT"), makeSymbol("_CSETF-IT-FINALIZE"));

    static private final SubLString $str_alt20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt21$__ = makeString("#<");

    static private final SubLString $str_alt23$_DONE_ = makeString(" DONE ");

    static private final SubLString $str_alt24$_ = makeString(" ");

    static private final SubLString $str_alt32$_NEXT = makeString("-NEXT");

    static private final SubLList $list_alt33 = list(list(makeSymbol("VAR"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt34 = list($DONE);

    static private final SubLSymbol $sym36$ITERATOR_VAR = makeUninternedSymbol("ITERATOR-VAR");

    static private final SubLSymbol $sym39$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    static private final SubLSymbol $sym40$VALID = makeUninternedSymbol("VALID");

    static private final SubLList $list_alt48 = list(list(makeSymbol("VAR"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("INVALID-TOKEN"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt49 = list(makeKeyword("INVALID-TOKEN"), $DONE);

    static private final SubLList $list_alt51 = list(new SubLObject[]{ makeSymbol("DO-ITERATOR-WITHOUT-VALUES"), makeSymbol("DO-FINAL-INDEX-FROM-SPEC"), makeSymbol("DO-GAF-ARG-INDEX"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"), makeSymbol("DO-NART-ARG-INDEX"), makeSymbol("DO-FUNCTION-EXTENT-INDEX"), makeSymbol("DO-PREDICATE-RULE-INDEX"), makeSymbol("DO-ISA-RULE-INDEX"), makeSymbol("DO-QUOTED-ISA-RULE-INDEX"), makeSymbol("DO-GENLS-RULE-INDEX"), makeSymbol("DO-GENL-MT-RULE-INDEX"), makeSymbol("DO-EXCEPTION-RULE-INDEX"), makeSymbol("DO-PRAGMA-RULE-INDEX"), makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX"), makeSymbol("DO-MT-INDEX"), makeSymbol("DO-OTHER-INDEX"), makeSymbol("DO-TERM-INDEX") });

    public static SubLObject init_iteration_file() {
        defconstant("*DTP-ITERATOR*", ITERATOR);
        defparameter("*WITHIN-PRINT-ITERATOR*", NIL);
        defconstant("*XFORM-FN-PARAM-DO-NOT-PASS*", make_symbol($$$YOU_SHALL_NOT_PASS));
        return NIL;
    }

    static private final SubLSymbol $sym52$ITERATOR_VAR = makeUninternedSymbol("ITERATOR-VAR");

    static private final SubLSymbol $sym53$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    static private final SubLSymbol $sym54$TOKEN_VAR = makeUninternedSymbol("TOKEN-VAR");

    public static final SubLObject setup_iteration_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_iterator$.getGlobalValue(), symbol_function(ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(IT_STATE, _CSETF_IT_STATE);
        def_csetf(IT_DONE, _CSETF_IT_DONE);
        def_csetf(IT_NEXT, _CSETF_IT_NEXT);
        def_csetf(IT_FINALIZE, _CSETF_IT_FINALIZE);
        identity(ITERATOR);
        register_macro_helper(ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER, DO_ITERATOR_WITHOUT_VALUES_INTERNAL);
        register_macro_helper(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, $list_alt51);
        return NIL;
    }

    public static SubLObject setup_iteration_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_iterator$.getGlobalValue(), symbol_function(ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(IT_STATE, _CSETF_IT_STATE);
            def_csetf(IT_DONE, _CSETF_IT_DONE);
            def_csetf(IT_NEXT, _CSETF_IT_NEXT);
            def_csetf(IT_FINALIZE, _CSETF_IT_FINALIZE);
            identity(ITERATOR);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_iterator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ITERATOR_METHOD));
            register_macro_helper(ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER, DO_ITERATOR_WITHOUT_VALUES_INTERNAL);
            register_macro_helper(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, $list59);
            note_funcall_helper_function($sym110$FILE_FORM_ITERATOR_DONE_);
            note_funcall_helper_function(FILE_FORM_ITERATOR_NEXT);
            note_funcall_helper_function(FILE_FORM_ITERATOR_FINALIZE);
            note_funcall_helper_function(META_ITERATOR_ITERATOR_DONE);
            note_funcall_helper_function(META_ITERATOR_ITERATOR_NEXT);
            note_funcall_helper_function(META_ITERATOR_ITERATOR_FINALIZE);
            note_funcall_helper_function(XFORM_ITERATOR_DONE);
            note_funcall_helper_function(XFORM_ITERATOR_NEXT);
        }
        if (SubLFiles.USE_V2) {
            register_macro_helper(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, $list_alt51);
        }
        return NIL;
    }

    public static SubLObject setup_iteration_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_iterator$.getGlobalValue(), symbol_function(ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(IT_STATE, _CSETF_IT_STATE);
        def_csetf(IT_DONE, _CSETF_IT_DONE);
        def_csetf(IT_NEXT, _CSETF_IT_NEXT);
        def_csetf(IT_FINALIZE, _CSETF_IT_FINALIZE);
        identity(ITERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_iterator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ITERATOR_METHOD));
        register_macro_helper(ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER, DO_ITERATOR_WITHOUT_VALUES_INTERNAL);
        register_macro_helper(DO_ITERATOR_WITHOUT_VALUES_INTERNAL, $list59);
        note_funcall_helper_function($sym110$FILE_FORM_ITERATOR_DONE_);
        note_funcall_helper_function(FILE_FORM_ITERATOR_NEXT);
        note_funcall_helper_function(FILE_FORM_ITERATOR_FINALIZE);
        note_funcall_helper_function(META_ITERATOR_ITERATOR_DONE);
        note_funcall_helper_function(META_ITERATOR_ITERATOR_NEXT);
        note_funcall_helper_function(META_ITERATOR_ITERATOR_FINALIZE);
        note_funcall_helper_function(XFORM_ITERATOR_DONE);
        note_funcall_helper_function(XFORM_ITERATOR_NEXT);
        return NIL;
    }

    static private final SubLSymbol $sym55$VALID = makeUninternedSymbol("VALID");

    static private final SubLList $list_alt56 = list(list(makeSymbol("VAR"), makeSymbol("N"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym57$COUNT = makeUninternedSymbol("COUNT");

    static private final SubLSymbol $sym58$NEW_DONE = makeUninternedSymbol("NEW-DONE");

    static private final SubLList $list_alt59 = list(ZERO_INTEGER);

    static private final SubLSymbol $sym60$__ = makeSymbol(">=");

    static private final SubLList $list_alt63 = list(T);

    static private final SubLList $list_alt73 = list(makeSymbol("CURRENT"), makeSymbol("DELTA"), makeSymbol("END"));

    @Override
    public void declareFunctions() {
        declare_iteration_file();
    }

    static private final SubLList $list_alt80 = cons(makeSymbol("CAR"), makeSymbol("CDR"));

    @Override
    public void initializeVariables() {
        init_iteration_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_iteration_file();
    }

    static {
    }

    static private final SubLList $list_alt84 = list(makeSymbol("CURRENT"), makeSymbol("VECTOR"));

    static private final SubLList $list_alt90 = list(makeSymbol("CURRENT"), makeSymbol("HASH-TABLE"));

    static private final SubLList $list_alt91 = cons(makeSymbol("NEXT-KEY"), makeSymbol("REST-KEYS"));

    static private final SubLList $list_alt94 = list(makeSymbol("LAZY-ITERATOR"), makeSymbol("CONSTRUCTOR"), makeSymbol("ARG-FORMS"));

    static private final SubLString $str_alt95$_A_is_not_a_well_formed_uninitial = makeString("~A is not a well formed uninitialized lazy iterator");

    static private final SubLList $list_alt100 = list(makeSymbol("CURRENT"), makeSymbol("TRANSFORM"));

    static private final SubLList $list_alt104 = list(makeSymbol("CURRENT"), makeSymbol("MODE"), makeSymbol("CONSTRUCTORS"), makeSymbol("DATA"));

    static private final SubLList $list_alt106 = cons(makeSymbol("NEXT-CONSTRUCTOR"), makeSymbol("REST-CONSTRUCTORS"));

    public static final class $iterator_p$UnaryFunction extends UnaryFunction {
        public $iterator_p$UnaryFunction() {
            super(extractFunctionNamed("ITERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return iterator_p(arg1);
        }
    }

    public static final class $iterate_non_null_singleton_next$UnaryFunction extends UnaryFunction {
        public $iterate_non_null_singleton_next$UnaryFunction() {
            super(extractFunctionNamed("ITERATE-NON-NULL-SINGLETON-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return iterate_non_null_singleton_next(arg1);
        }
    }

    static private final SubLString $str_alt115$invalid_lazy_iterator_found_in_me = makeString("invalid lazy iterator found in meta-iterator ~A ~A");

    static private final SubLString $str_alt116$in_make_rotating_iterator_iterato = makeString("in make-rotating-iterator-iterator-state");

    public static final class $iterate_number_done$UnaryFunction extends UnaryFunction {
        public $iterate_number_done$UnaryFunction() {
            super(extractFunctionNamed("ITERATE-NUMBER-DONE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return iterate_number_done(arg1);
        }
    }

    static private final SubLList $list_alt117 = list(makeSymbol("INDEX"), makeSymbol("ITERATORS"));

    public static final class $iterate_list_done$UnaryFunction extends UnaryFunction {
        public $iterate_list_done$UnaryFunction() {
            super(extractFunctionNamed("ITERATE-LIST-DONE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return iterate_list_done(arg1);
        }
    }

    static private final SubLList $list_alt122 = list(makeSymbol("REAL-STATE"), makeSymbol("QUEUE"), makeSymbol("MODE"), makeSymbol("DONE"), makeSymbol("NEXT"), makeSymbol("FINALIZE"));

    static private final SubLString $str_alt124$Unknown_mode___a_ = makeString("Unknown mode: ~a.");

    public static final class $iterate_list_next$UnaryFunction extends UnaryFunction {
        public $iterate_list_next$UnaryFunction() {
            super(extractFunctionNamed("ITERATE-LIST-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return iterate_list_next(arg1);
        }
    }

    public static final class $iterate_vector_next$UnaryFunction extends UnaryFunction {
        public $iterate_vector_next$UnaryFunction() {
            super(extractFunctionNamed("ITERATE-VECTOR-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return iterate_vector_next(arg1);
        }
    }

    static private final SubLList $list_alt128 = list(list(makeSymbol("VAR"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("RESET"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt129 = list($DONE, makeKeyword("RESET"));

    public static final class $iterator_iterator_done$UnaryFunction extends UnaryFunction {
        public $iterator_iterator_done$UnaryFunction() {
            super(extractFunctionNamed("ITERATOR-ITERATOR-DONE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return iterator_iterator_done(arg1);
        }
    }

    public static final class $iterator_iterator_next$UnaryFunction extends UnaryFunction {
        public $iterator_iterator_next$UnaryFunction() {
            super(extractFunctionNamed("ITERATOR-ITERATOR-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return iterator_iterator_next(arg1);
        }
    }

    static private final SubLList $list_alt135 = list(makeSymbol("REVERSE-ITERATORS"), makeSymbol("REVERSE-RESULT"));

    public static final class $reusable_iterator_done$UnaryFunction extends UnaryFunction {
        public $reusable_iterator_done$UnaryFunction() {
            super(extractFunctionNamed("REUSABLE-ITERATOR-DONE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return reusable_iterator_done(arg1);
        }
    }

    static private final SubLList $list_alt137 = list(makeSymbol("CURRENT"), makeSymbol("FILTER-METHOD"), makeSymbol("FILTER-ARGS"));

    static private final SubLList $list_alt138 = list(makeSymbol("CURRENT"), makeSymbol("FILTER-METHOD"), makeSymbol("FILTER-ARGS"), makeSymbol("INVALID-TOKEN"));

    public static final class $reusable_iterator_next$UnaryFunction extends UnaryFunction {
        public $reusable_iterator_next$UnaryFunction() {
            super(extractFunctionNamed("REUSABLE-ITERATOR-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return reusable_iterator_next(arg1);
        }
    }

    public static final class $reusable_iterator_cartesian_iterator_done$UnaryFunction extends UnaryFunction {
        public $reusable_iterator_cartesian_iterator_done$UnaryFunction() {
            super(extractFunctionNamed("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return reusable_iterator_cartesian_iterator_done(arg1);
        }
    }

    public static final class $reusable_iterator_cartesian_iterator_next$UnaryFunction extends UnaryFunction {
        public $reusable_iterator_cartesian_iterator_next$UnaryFunction() {
            super(extractFunctionNamed("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return reusable_iterator_cartesian_iterator_next(arg1);
        }
    }

    public static final class $default_iterator_done_p$UnaryFunction extends UnaryFunction {
        public $default_iterator_done_p$UnaryFunction() {
            super(extractFunctionNamed("DEFAULT-ITERATOR-DONE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return default_iterator_done_p(arg1);
        }
    }
}

/**
 * Total time: 643 ms synthetic
 */
