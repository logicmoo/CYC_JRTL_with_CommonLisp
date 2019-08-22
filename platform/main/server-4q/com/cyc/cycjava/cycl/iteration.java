package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class iteration extends SubLTranslatedFile {
    public static final SubLFile me = new iteration();

    public static final String myName = "com.cyc.cycjava.cycl.iteration";

    public static final String myFingerPrint = "a88134f42506e1e7401358fb69407f82e18bc51c973877839ceeac2afa576248";

    // defconstant
    public static final SubLSymbol $dtp_iterator$ = makeSymbol("*DTP-ITERATOR*");

    // defparameter
    // used to suppress initializing the lazy iterator while merely printing it
    private static final SubLSymbol $within_print_iterator$ = makeSymbol("*WITHIN-PRINT-ITERATOR*");

    // defconstant
    public static final SubLSymbol $xform_fn_param_do_not_pass$ = makeSymbol("*XFORM-FN-PARAM-DO-NOT-PASS*");



    public static final SubLSymbol ITERATOR_P = makeSymbol("ITERATOR-P");

    public static final SubLList $list2 = list(makeSymbol("STATE"), makeSymbol("DONE"), makeSymbol("NEXT"), makeSymbol("FINALIZE"));

    public static final SubLList $list3 = list(makeKeyword("STATE"), makeKeyword("DONE"), makeKeyword("NEXT"), makeKeyword("FINALIZE"));

    public static final SubLList $list4 = list(makeSymbol("IT-STATE"), makeSymbol("IT-DONE"), makeSymbol("IT-NEXT"), makeSymbol("IT-FINALIZE"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-IT-STATE"), makeSymbol("_CSETF-IT-DONE"), makeSymbol("_CSETF-IT-NEXT"), makeSymbol("_CSETF-IT-FINALIZE"));

    public static final SubLSymbol PRINT_ITERATOR = makeSymbol("PRINT-ITERATOR");

    public static final SubLSymbol ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

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

    private static final SubLList $list37 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym39$ITERATOR_VAR = makeUninternedSymbol("ITERATOR-VAR");





    private static final SubLSymbol $sym42$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    private static final SubLSymbol $sym43$VALID = makeUninternedSymbol("VALID");





    private static final SubLSymbol ITERATION_NEXT = makeSymbol("ITERATION-NEXT");









    public static final SubLList $list51 = list(list(makeSymbol("VAR"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("INVALID-TOKEN"), makeSymbol("DONE"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list52 = list(makeKeyword("INVALID-TOKEN"), makeKeyword("DONE"), makeKeyword("PROGRESS-MESSAGE"));





    private static final SubLSymbol NOTING_PROGRESS = makeSymbol("NOTING-PROGRESS");

    public static final SubLList $list56 = list(makeSymbol("NOTE-PROGRESS"));

    private static final SubLList $list57 = list(list(makeSymbol("VAR"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("INVALID-TOKEN"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list58 = list(makeKeyword("INVALID-TOKEN"), makeKeyword("DONE"));

    public static final SubLList $list59 = list(new SubLObject[]{ makeSymbol("DO-ITERATOR-WITHOUT-VALUES"), makeSymbol("DO-FINAL-INDEX-FROM-SPEC"), makeSymbol("DO-ITERATOR-WITHOUT-VALUES-PROGRESS"), makeSymbol("DO-GAF-ARG-INDEX"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"), makeSymbol("DO-NART-ARG-INDEX"), makeSymbol("DO-FUNCTION-EXTENT-INDEX"), makeSymbol("DO-PREDICATE-RULE-INDEX"), makeSymbol("DO-ISA-RULE-INDEX"), makeSymbol("DO-QUOTED-ISA-RULE-INDEX"), makeSymbol("DO-GENLS-RULE-INDEX"), makeSymbol("DO-GENL-MT-RULE-INDEX"), makeSymbol("DO-EXCEPTION-RULE-INDEX"), makeSymbol("DO-PRAGMA-RULE-INDEX"), makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX"), makeSymbol("DO-MT-INDEX"), makeSymbol("DO-OTHER-INDEX"), makeSymbol("DO-TERM-INDEX") });

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





    public static final SubLList $list106 = list(makeSymbol("CURRENT"), makeSymbol("&REST"), makeSymbol("REST"));

    private static final SubLList $list107 = list(makeSymbol("CURRENT"), makeSymbol("HASH-TABLE"), makeSymbol("KEY-VALUE-TUPLE"));

    private static final SubLList $list108 = cons(makeSymbol("NEXT-KEY"), makeSymbol("REST-KEYS"));



    private static final SubLSymbol $sym110$FILE_FORM_ITERATOR_DONE_ = makeSymbol("FILE-FORM-ITERATOR-DONE?");

    private static final SubLSymbol FILE_FORM_ITERATOR_NEXT = makeSymbol("FILE-FORM-ITERATOR-NEXT");

    private static final SubLSymbol FILE_FORM_ITERATOR_FINALIZE = makeSymbol("FILE-FORM-ITERATOR-FINALIZE");





    private static final SubLList $list115 = list(makeSymbol("STREAM"), makeSymbol("INDEX"), makeSymbol("END"), makeSymbol("DONE?"));



    public static final SubLList $list117 = list(makeSymbol("STREAM"), makeSymbol("&REST"), makeSymbol("REST"));

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



    public static final SubLList $list138 = list(makeSymbol("OBJECT-ITERATOR"), makeSymbol("META-ITERATOR"));

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

    private static final SubLList $list160 = list(makeKeyword("DONE"), makeKeyword("RESET"));



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

    public static SubLObject iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_iterator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject iterator_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$iterator_native.class ? T : NIL;
    }

    public static SubLObject it_state(final SubLObject v_object) {
        assert NIL != iterator_p(v_object) : "iteration.iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject it_done(final SubLObject v_object) {
        assert NIL != iterator_p(v_object) : "iteration.iterator_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject it_next(final SubLObject v_object) {
        assert NIL != iterator_p(v_object) : "iteration.iterator_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject it_finalize(final SubLObject v_object) {
        assert NIL != iterator_p(v_object) : "iteration.iterator_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_it_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterator_p(v_object) : "iteration.iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_it_done(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterator_p(v_object) : "iteration.iterator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_it_next(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterator_p(v_object) : "iteration.iterator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_it_finalize(final SubLObject v_object, final SubLObject value) {
        assert NIL != iterator_p(v_object) : "iteration.iterator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $iterator_native();
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

    public static SubLObject iteration_done(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
        return funcall(it_done(iterator), it_state(iterator));
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

    public static SubLObject iteration_next(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
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

    public static SubLObject iteration_next_without_values(final SubLObject iterator, SubLObject invalid_token) {
        if (invalid_token == UNPROVIDED) {
            invalid_token = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
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

    public static SubLObject iteration_next_without_values_macro_helper(final SubLObject iterator, SubLObject invalid_token) {
        if (invalid_token == UNPROVIDED) {
            invalid_token = NIL;
        }
        return iteration_next_without_values(iterator, invalid_token);
    }

    public static SubLObject iteration_finalize(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
        return funcall(it_finalize(iterator), it_state(iterator));
    }

    public static SubLObject iterator_type_name(final SubLObject iterator) {
        return string_utilities.post_remove(string_utilities.function_to_string(it_next(iterator)), $str35$_NEXT, UNPROVIDED);
    }

    public static SubLObject iteration_state_peek(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
        return it_state(iterator);
    }

    public static SubLObject iteration_next_peek(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
        return it_next(iterator);
    }

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

    public static SubLObject copy_iterator(final SubLObject iterator, SubLObject copy_function) {
        if (copy_function == UNPROVIDED) {
            copy_function = COPY_TREE;
        }
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
        assert NIL != function_spec_p(copy_function) : "Types.function_spec_p(copy_function) " + "CommonSymbols.NIL != Types.function_spec_p(copy_function) " + copy_function;
        final SubLObject state = it_state(iterator);
        final SubLObject done = it_done(iterator);
        final SubLObject next = it_next(iterator);
        final SubLObject finalize = it_finalize(iterator);
        final SubLObject new_state = funcall(copy_function, state);
        return new_iterator(new_state, done, next, finalize);
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

    public static SubLObject generic_producer(final SubLObject iterator, final SubLObject action, SubLObject suspend) {
        if (suspend == UNPROVIDED) {
            suspend = symbol_function(FALSE);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
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

    public static SubLObject new_null_iterator() {
        return new_list_iterator(NIL);
    }

    public static SubLObject new_singleton_iterator(final SubLObject item) {
        if (NIL == item) {
            return new_list_iterator(list(item));
        }
        return new_iterator(item, NULL, ITERATE_NON_NULL_SINGLETON_NEXT, UNPROVIDED);
    }

    public static SubLObject iterate_non_null_singleton_next(final SubLObject state) {
        return subl_promotions.values3(state, NIL, NIL);
    }

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
        assert NIL != integerp(start) : "Types.integerp(start) " + "CommonSymbols.NIL != Types.integerp(start) " + start;
        assert NIL != integerp(delta) : "Types.integerp(delta) " + "CommonSymbols.NIL != Types.integerp(delta) " + delta;
        return new_number_iterator(start, end, delta);
    }

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
        assert NIL != numberp(start) : "Types.numberp(start) " + "CommonSymbols.NIL != Types.numberp(start) " + start;
        assert NIL != numberp(delta) : "Types.numberp(delta) " + "CommonSymbols.NIL != Types.numberp(delta) " + delta;
        if (((NIL != end) && (!assertionsDisabledSynth)) && (NIL == numberp(end))) {
            throw new AssertionError(end);
        }
        return new_iterator(make_iterator_number_state(start, end, delta), ITERATE_NUMBER_DONE, ITERATE_NUMBER_NEXT, UNPROVIDED);
    }

    public static SubLObject make_iterator_number_state(final SubLObject start, final SubLObject end, final SubLObject delta) {
        return list(start, delta, end);
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

    public static SubLObject list_iterator_p(final SubLObject v_object) {
        return makeBoolean((NIL != iterator_p(v_object)) && (it_next(v_object) == ITERATE_LIST_NEXT));
    }

    public static SubLObject new_list_iterator(final SubLObject list) {
        assert NIL != listp(list) : "Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) " + list;
        return new_iterator(make_iterator_list_state(list), ITERATE_LIST_DONE, ITERATE_LIST_NEXT, UNPROVIDED);
    }

    public static SubLObject get_list_iterator_list(final SubLObject iterator) {
        assert NIL != list_iterator_p(iterator) : "iteration.list_iterator_p(iterator) " + "CommonSymbols.NIL != iteration.list_iterator_p(iterator) " + iterator;
        return it_state(iterator);
    }

    public static SubLObject list_iterator_size(final SubLObject list_iterator) {
        return length(get_list_iterator_list(list_iterator));
    }

    public static SubLObject make_iterator_list_state(final SubLObject list) {
        return list;
    }

    public static SubLObject iterate_list_done(final SubLObject state) {
        return sublisp_null(state);
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
        assert NIL != listp(list) : "Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) " + list;
        return new_iterator(make_inference_iterator_list_state(list), ITERATE_INFERENCE_LIST_DONE, ITERATE_INFERENCE_LIST_NEXT, UNPROVIDED);
    }

    public static SubLObject get_inference_list_iterator_list(final SubLObject iterator) {
        assert NIL != inference_list_iterator_p(iterator) : "iteration.inference_list_iterator_p(iterator) " + "CommonSymbols.NIL != iteration.inference_list_iterator_p(iterator) " + iterator;
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

    public static SubLObject new_alist_iterator(final SubLObject alist) {
        assert NIL != list_utilities.alist_p(alist) : "list_utilities.alist_p(alist) " + "CommonSymbols.NIL != list_utilities.alist_p(alist) " + alist;
        return new_indirect_iterator(new_list_iterator(alist), CONS_TO_TUPLE, UNPROVIDED);
    }

    public static SubLObject new_vector_iterator(final SubLObject vector) {
        assert NIL != vectorp(vector) : "Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) " + vector;
        return new_iterator(make_iterator_vector_state(vector), DEFAULT_ITERATOR_DONE_P, ITERATE_VECTOR_NEXT, UNPROVIDED);
    }

    public static SubLObject make_iterator_vector_state(final SubLObject vector) {
        final SubLObject current = ZERO_INTEGER;
        return list(current, vector);
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

    public static SubLObject new_vector_index_iterator(final SubLObject vector) {
        assert NIL != vectorp(vector) : "Types.vectorp(vector) " + "CommonSymbols.NIL != Types.vectorp(vector) " + vector;
        return new_iterator(make_iterator_vector_index_state(vector), DEFAULT_ITERATOR_DONE_P, ITERATE_VECTOR_INDEX_NEXT, UNPROVIDED);
    }

    public static SubLObject make_iterator_vector_index_state(final SubLObject vector) {
        final SubLObject current = ZERO_INTEGER;
        return list(current, vector);
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
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return new_list_iterator(string_utilities.string_to_char_list(string));
    }

    public static SubLObject new_sequence_iterator(SubLObject sequence, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != sequencep(sequence) : "Types.sequencep(sequence) " + "CommonSymbols.NIL != Types.sequencep(sequence) " + sequence;
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

    public static SubLObject new_hash_table_iterator(final SubLObject hash_table) {
        assert NIL != hash_table_p(hash_table) : "Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) " + hash_table;
        return new_iterator(make_iterator_hash_table_state(hash_table), ITERATOR_HASH_TABLE_DONE, ITERATOR_HASH_TABLE_NEXT, UNPROVIDED);
    }

    public static SubLObject new_hash_table_keys_iterator(final SubLObject hash_table) {
        assert NIL != hash_table_p(hash_table) : "Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) " + hash_table;
        return new_list_iterator(hash_table_utilities.hash_table_keys(hash_table));
    }

    public static SubLObject new_hash_table_values_iterator(final SubLObject hash_table) {
        assert NIL != hash_table_p(hash_table) : "Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) " + hash_table;
        return new_list_iterator(hash_table_utilities.hash_table_values(hash_table));
    }

    public static SubLObject make_iterator_hash_table_state(final SubLObject hash_table) {
        final SubLObject current = hash_table_utilities.hash_table_keys(hash_table);
        final SubLObject key_value_tuple = list($KEY, $VALUE);
        return list(current, hash_table, key_value_tuple);
    }

    public static SubLObject iterator_hash_table_done(final SubLObject state) {
        SubLObject current_$10 = NIL;
        destructuring_bind_must_consp(state, state, $list106);
        current_$10 = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        return sublisp_null(current_$10);
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
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        assert NIL != subl_promotions.non_negative_integer_p(start) : "subl_promotions.non_negative_integer_p(start) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(start) " + start;
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

    public static SubLObject new_lazy_iterator(final SubLObject constructor, final SubLObject arg_forms) {
        assert NIL != function_spec_p(constructor) : "Types.function_spec_p(constructor) " + "CommonSymbols.NIL != Types.function_spec_p(constructor) " + constructor;
        assert NIL != listp(arg_forms) : "Types.listp(arg_forms) " + "CommonSymbols.NIL != Types.listp(arg_forms) " + arg_forms;
        final SubLObject lazy_iterator = new_iterator(NIL, symbol_function(LAZY_ITERATOR_DONE), symbol_function(LAZY_ITERATOR_NEXT), UNPROVIDED);
        _csetf_it_state(lazy_iterator, list(lazy_iterator, constructor, arg_forms));
        return lazy_iterator;
    }

    public static SubLObject lazy_iterator_uninitializedP(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
        return eq(it_done(iterator), symbol_function(LAZY_ITERATOR_DONE));
    }

    public static SubLObject lazy_iterator_valid_uninitializedP(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
        if (((!it_state(iterator).isCons()) || (!it_done(iterator).eql(symbol_function(LAZY_ITERATOR_DONE)))) || (!it_next(iterator).eql(symbol_function(LAZY_ITERATOR_NEXT)))) {
            return NIL;
        }
        if (iterator.eql(it_state(iterator).first())) {
            return T;
        }
        return NIL;
    }

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

    public static SubLObject lazy_iterator_done(final SubLObject state) {
        assert NIL != consp(state) : "Types.consp(state) " + "CommonSymbols.NIL != Types.consp(state) " + state;
        return iteration_done(initialize_lazy_iterator(state));
    }

    public static SubLObject lazy_iterator_next(final SubLObject state) {
        assert NIL != consp(state) : "Types.consp(state) " + "CommonSymbols.NIL != Types.consp(state) " + state;
        return iteration_next(initialize_lazy_iterator(state));
    }

    public static SubLObject new_indirect_iterator(final SubLObject iterator, SubLObject transform, SubLObject finalize) {
        if (transform == UNPROVIDED) {
            transform = symbol_function(IDENTITY);
        }
        if (finalize == UNPROVIDED) {
            finalize = ITERATE_INDIRECT_FINALIZE;
        }
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
        assert NIL != function_spec_p(transform) : "Types.function_spec_p(transform) " + "CommonSymbols.NIL != Types.function_spec_p(transform) " + transform;
        return new_iterator(make_iterator_indirect_state(iterator, transform), DEFAULT_ITERATOR_DONE_P, ITERATE_INDIRECT_NEXT, finalize);
    }

    public static SubLObject make_iterator_indirect_state(final SubLObject iterator, final SubLObject transform) {
        return list(iterator, misc_utilities.function_spec_function(transform));
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

    public static SubLObject iterate_indirect_finalize(final SubLObject state) {
        final SubLObject current = state.first();
        return NIL != iterator_p(current) ? iteration_finalize(current) : T;
    }

    public static SubLObject new_factory_iterator(final SubLObject constructors, SubLObject data, SubLObject finalize) {
        if (data == UNPROVIDED) {
            data = NIL;
        }
        if (finalize == UNPROVIDED) {
            finalize = ITERATE_FACTORY_FINALIZE;
        }
        assert NIL != listp(constructors) : "Types.listp(constructors) " + "CommonSymbols.NIL != Types.listp(constructors) " + constructors;
        return new_iterator(make_iterator_factory_state(constructors, data), DEFAULT_ITERATOR_DONE_P, ITERATE_FACTORY_NEXT, finalize);
    }

    public static SubLObject make_iterator_factory_state(final SubLObject constructors, final SubLObject data) {
        final SubLObject current = $UNINITIALIZED;
        final SubLObject mode = $START;
        return list(current, mode, constructors, data);
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
                        assert NIL != iterator_p(current_$15) : "iteration.iterator_p(current_$15) " + "CommonSymbols.NIL != iteration.iterator_p(current_$15) " + current_$15;
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
        assert NIL != iterator_p(meta_iterator) : "iteration.iterator_p(meta_iterator) " + "CommonSymbols.NIL != iteration.iterator_p(meta_iterator) " + meta_iterator;
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

    public static SubLObject new_iterator_iterator(final SubLObject iterators) {
        assert NIL != listp(iterators) : "Types.listp(iterators) " + "CommonSymbols.NIL != Types.listp(iterators) " + iterators;
        if (NIL == iterators) {
            return new_null_iterator();
        }
        if (NIL != list_utilities.singletonP(iterators)) {
            return iterators.first();
        }
        final SubLObject state = make_iterator_iterator_state(iterators);
        return new_iterator(state, ITERATOR_ITERATOR_DONE, ITERATOR_ITERATOR_NEXT, ITERATOR_ITERATOR_FINALIZE);
    }

    public static SubLObject get_iterator_iterator_iterators(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
        final SubLObject state = it_state(iterator);
        if (NIL != list_utilities.singletonP(state)) {
            return list(state);
        }
        return state;
    }

    public static SubLObject make_iterator_iterator_state(final SubLObject iterators) {
        SubLObject cdolist_list_var = iterators;
        SubLObject iterator = NIL;
        iterator = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
            cdolist_list_var = cdolist_list_var.rest();
            iterator = cdolist_list_var.first();
        } 
        return iterators;
    }

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

    public static SubLObject new_rotating_iterator_iterator(final SubLObject iterators) {
        assert NIL != listp(iterators) : "Types.listp(iterators) " + "CommonSymbols.NIL != Types.listp(iterators) " + iterators;
        if (NIL == iterators) {
            return new_null_iterator();
        }
        if (NIL != list_utilities.singletonP(iterators)) {
            return iterators.first();
        }
        return new_iterator(make_rotating_iterator_iterator_state(iterators), ROTATING_ITERATOR_ITERATOR_DONE, ROTATING_ITERATOR_ITERATOR_NEXT, ROTATING_ITERATOR_ITERATOR_FINALIZE);
    }

    public static SubLObject validate_iterators(final SubLObject iterators, SubLObject where_message) {
        if (where_message == UNPROVIDED) {
            where_message = $str145$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(iterators) : "Types.listp(iterators) " + "CommonSymbols.NIL != Types.listp(iterators) " + iterators;
        SubLObject cdolist_list_var = iterators;
        SubLObject iterator = NIL;
        iterator = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
            if ((((NIL == $within_print_iterator$.getDynamicValue(thread)) && (NIL != lazy_iterator_uninitializedP(iterator))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == lazy_iterator_valid_uninitializedP(iterator))) {
                Errors.error($str146$invalid_lazy_iterator_found_in_me, where_message, iterator);
            }
            cdolist_list_var = cdolist_list_var.rest();
            iterator = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject get_rotating_iterator_iterator_iterators(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
        return second(it_state(iterator));
    }

    public static SubLObject make_rotating_iterator_iterator_state(final SubLObject iterators) {
        validate_iterators(iterators, $str147$in_make_rotating_iterator_iterato);
        return list(ZERO_INTEGER, iterators);
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

    public static SubLObject new_reusable_iterator(final SubLObject state, final SubLObject done, final SubLObject next, SubLObject finalize) {
        if (finalize == UNPROVIDED) {
            finalize = symbol_function(TRUE);
        }
        final SubLObject new_state = list(state, NIL, $INITIAL, done, next, finalize);
        return new_iterator(new_state, REUSABLE_ITERATOR_DONE, REUSABLE_ITERATOR_NEXT, REUSABLE_ITERATOR_FINALIZE);
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

    public static SubLObject new_reusable_iterator_from_iterator(final SubLObject iterator) {
        return new_reusable_iterator(iterator, REUSABLE_ITERATOR_FROM_ITERATOR_DONE, REUSABLE_ITERATOR_FROM_ITERATOR_NEXT, REUSABLE_ITERATOR_FROM_ITERATOR_FINALIZE);
    }

    public static SubLObject reusable_iterator_from_iterator_done(final SubLObject state) {
        return iteration_done(state);
    }

    public static SubLObject reusable_iterator_from_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject next = iteration_next(state);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values3(next, state, makeBoolean(NIL == validP));
    }

    public static SubLObject reusable_iterator_from_iterator_finalize(final SubLObject state) {
        return iteration_finalize(state);
    }

    public static SubLObject new_reusable_list_iterator(final SubLObject list) {
        return new_reusable_iterator(list, ITERATE_LIST_DONE, ITERATE_LIST_NEXT, UNPROVIDED);
    }

    public static SubLObject reset_reusable_iterator(final SubLObject iterator) {
        assert NIL != iterator_p(iterator) : "iteration.iterator_p(iterator) " + "CommonSymbols.NIL != iteration.iterator_p(iterator) " + iterator;
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

    public static SubLObject new_reusable_iterator_cartesian_iterator(final SubLObject reusable_iterators) {
        final SubLObject state = reusable_iterator_cartesian_iterator_state(reusable_iterators);
        return NIL != state ? new_iterator(state, REUSABLE_ITERATOR_CARTESIAN_ITERATOR_DONE, REUSABLE_ITERATOR_CARTESIAN_ITERATOR_NEXT, REUSABLE_ITERATOR_CARTESIAN_ITERATOR_FINALIZE) : new_null_iterator();
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

    public static SubLObject new_filter_iterator(final SubLObject input_iterator, final SubLObject filter_method, SubLObject filter_args) {
        if (filter_args == UNPROVIDED) {
            filter_args = NIL;
        }
        assert NIL != iterator_p(input_iterator) : "iteration.iterator_p(input_iterator) " + "CommonSymbols.NIL != iteration.iterator_p(input_iterator) " + input_iterator;
        assert NIL != function_spec_p(filter_method) : "Types.function_spec_p(filter_method) " + "CommonSymbols.NIL != Types.function_spec_p(filter_method) " + filter_method;
        assert NIL != listp(filter_args) : "Types.listp(filter_args) " + "CommonSymbols.NIL != Types.listp(filter_args) " + filter_args;
        return new_iterator(make_filter_iterator_state(input_iterator, filter_method, filter_args), DEFAULT_ITERATOR_DONE_P, FILTER_ITERATOR_NEXT, FILTER_ITERATOR_FINALIZE);
    }

    public static SubLObject new_filter_iterator_without_values(final SubLObject input_iterator, final SubLObject filter_method, SubLObject filter_args, SubLObject invalid_token) {
        if (filter_args == UNPROVIDED) {
            filter_args = NIL;
        }
        if (invalid_token == UNPROVIDED) {
            invalid_token = NIL;
        }
        assert NIL != iterator_p(input_iterator) : "iteration.iterator_p(input_iterator) " + "CommonSymbols.NIL != iteration.iterator_p(input_iterator) " + input_iterator;
        assert NIL != function_spec_p(filter_method) : "Types.function_spec_p(filter_method) " + "CommonSymbols.NIL != Types.function_spec_p(filter_method) " + filter_method;
        assert NIL != listp(filter_args) : "Types.listp(filter_args) " + "CommonSymbols.NIL != Types.listp(filter_args) " + filter_args;
        return new_iterator(make_filter_iterator_without_values_state(input_iterator, filter_method, filter_args, invalid_token), DEFAULT_ITERATOR_DONE_P, FILTER_ITERATOR_WITHOUT_VALUES_NEXT, FILTER_ITERATOR_FINALIZE);
    }

    public static SubLObject new_filter_and_transform_iterator(final SubLObject input_iterator, final SubLObject filter_and_transform_method, SubLObject filter_and_transform_args) {
        if (filter_and_transform_args == UNPROVIDED) {
            filter_and_transform_args = NIL;
        }
        assert NIL != iterator_p(input_iterator) : "iteration.iterator_p(input_iterator) " + "CommonSymbols.NIL != iteration.iterator_p(input_iterator) " + input_iterator;
        assert NIL != function_spec_p(filter_and_transform_method) : "Types.function_spec_p(filter_and_transform_method) " + "CommonSymbols.NIL != Types.function_spec_p(filter_and_transform_method) " + filter_and_transform_method;
        assert NIL != listp(filter_and_transform_args) : "Types.listp(filter_and_transform_args) " + "CommonSymbols.NIL != Types.listp(filter_and_transform_args) " + filter_and_transform_args;
        return new_iterator(make_filter_and_tranform_iterator_state(input_iterator, filter_and_transform_method, filter_and_transform_args), DEFAULT_ITERATOR_DONE_P, FILTER_AND_TRANSFORM_ITERATOR_NEXT, FILTER_ITERATOR_FINALIZE);
    }

    public static SubLObject make_filter_iterator_state(final SubLObject input_iterator, final SubLObject filter_method, final SubLObject filter_args) {
        return list(input_iterator, filter_method, filter_args);
    }

    public static SubLObject make_filter_iterator_without_values_state(final SubLObject input_iterator, final SubLObject filter_method, final SubLObject filter_args, final SubLObject invalid_token) {
        return list(input_iterator, filter_method, filter_args, invalid_token);
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

    public static SubLObject default_iterator_done_p(final SubLObject state) {
        return eq($DONE, elt(state, ZERO_INTEGER));
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

    public static SubLObject xml_token_iterator_p(final SubLObject v_object) {
        return makeBoolean((NIL != iterator_p(v_object)) && (it_next(v_object) == ITERATE_XML_TOKEN_NEXT));
    }

    public static SubLObject xml_token_iterator_peek(final SubLObject token_iterator) {
        assert NIL != xml_token_iterator_p(token_iterator) : "iteration.xml_token_iterator_p(token_iterator) " + "CommonSymbols.NIL != iteration.xml_token_iterator_p(token_iterator) " + token_iterator;
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

    public static SubLObject declare_iteration_file() {
        declareFunction(me, "iterator_print_function_trampoline", "ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "iterator_p", "ITERATOR-P", 1, 0, false);
        new iteration.$iterator_p$UnaryFunction();
        declareFunction(me, "it_state", "IT-STATE", 1, 0, false);
        declareFunction(me, "it_done", "IT-DONE", 1, 0, false);
        declareFunction(me, "it_next", "IT-NEXT", 1, 0, false);
        declareFunction(me, "it_finalize", "IT-FINALIZE", 1, 0, false);
        declareFunction(me, "_csetf_it_state", "_CSETF-IT-STATE", 2, 0, false);
        declareFunction(me, "_csetf_it_done", "_CSETF-IT-DONE", 2, 0, false);
        declareFunction(me, "_csetf_it_next", "_CSETF-IT-NEXT", 2, 0, false);
        declareFunction(me, "_csetf_it_finalize", "_CSETF-IT-FINALIZE", 2, 0, false);
        declareFunction(me, "make_iterator", "MAKE-ITERATOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_iterator", "VISIT-DEFSTRUCT-ITERATOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITERATOR-METHOD", 2, 0, false);
        declareFunction(me, "print_iterator", "PRINT-ITERATOR", 3, 0, false);
        declareFunction(me, "new_iterator", "NEW-ITERATOR", 3, 1, false);
        declareFunction(me, "iteration_done", "ITERATION-DONE", 1, 0, false);
        declareFunction(me, "iteration_next_funcall", "ITERATION-NEXT-FUNCALL", 2, 0, false);
        declareFunction(me, "iteration_next", "ITERATION-NEXT", 1, 0, false);
        declareFunction(me, "iteration_next_without_values", "ITERATION-NEXT-WITHOUT-VALUES", 1, 1, false);
        declareFunction(me, "iteration_next_without_values_macro_helper", "ITERATION-NEXT-WITHOUT-VALUES-MACRO-HELPER", 1, 1, false);
        declareFunction(me, "iteration_finalize", "ITERATION-FINALIZE", 1, 0, false);
        declareFunction(me, "iterator_type_name", "ITERATOR-TYPE-NAME", 1, 0, false);
        declareFunction(me, "iteration_state_peek", "ITERATION-STATE-PEEK", 1, 0, false);
        declareFunction(me, "iteration_next_peek", "ITERATION-NEXT-PEEK", 1, 0, false);
        declareMacro(me, "do_iterator", "DO-ITERATOR");
        declareMacro(me, "do_iterator_without_values_progress", "DO-ITERATOR-WITHOUT-VALUES-PROGRESS");
        declareMacro(me, "do_iterator_without_values", "DO-ITERATOR-WITHOUT-VALUES");
        declareMacro(me, "do_iterator_without_values_internal", "DO-ITERATOR-WITHOUT-VALUES-INTERNAL");
        declareMacro(me, "do_n_iterator_objects", "DO-N-ITERATOR-OBJECTS");
        declareFunction(me, "map_iterator", "MAP-ITERATOR", 2, 0, false);
        declareFunction(me, "copy_iterator", "COPY-ITERATOR", 1, 1, false);
        declareFunction(me, "iterator_value_list", "ITERATOR-VALUE-LIST", 1, 0, false);
        declareFunction(me, "generic_producer", "GENERIC-PRODUCER", 2, 1, false);
        declareFunction(me, "new_null_iterator", "NEW-NULL-ITERATOR", 0, 0, false);
        declareFunction(me, "new_singleton_iterator", "NEW-SINGLETON-ITERATOR", 1, 0, false);
        declareFunction(me, "iterate_non_null_singleton_next", "ITERATE-NON-NULL-SINGLETON-NEXT", 1, 0, false);
        new iteration.$iterate_non_null_singleton_next$UnaryFunction();
        declareFunction(me, "new_integer_iterator", "NEW-INTEGER-ITERATOR", 0, 3, false);
        declareFunction(me, "new_number_iterator", "NEW-NUMBER-ITERATOR", 0, 3, false);
        declareFunction(me, "make_iterator_number_state", "MAKE-ITERATOR-NUMBER-STATE", 3, 0, false);
        declareFunction(me, "iterate_number_done", "ITERATE-NUMBER-DONE", 1, 0, false);
        new iteration.$iterate_number_done$UnaryFunction();
        declareFunction(me, "iterate_number_next", "ITERATE-NUMBER-NEXT", 1, 0, false);
        declareFunction(me, "list_iterator_p", "LIST-ITERATOR-P", 1, 0, false);
        declareFunction(me, "new_list_iterator", "NEW-LIST-ITERATOR", 1, 0, false);
        declareFunction(me, "get_list_iterator_list", "GET-LIST-ITERATOR-LIST", 1, 0, false);
        declareFunction(me, "list_iterator_size", "LIST-ITERATOR-SIZE", 1, 0, false);
        declareFunction(me, "make_iterator_list_state", "MAKE-ITERATOR-LIST-STATE", 1, 0, false);
        declareFunction(me, "iterate_list_done", "ITERATE-LIST-DONE", 1, 0, false);
        new iteration.$iterate_list_done$UnaryFunction();
        declareFunction(me, "iterate_list_next", "ITERATE-LIST-NEXT", 1, 0, false);
        new iteration.$iterate_list_next$UnaryFunction();
        declareFunction(me, "inference_list_iterator_p", "INFERENCE-LIST-ITERATOR-P", 1, 0, false);
        declareFunction(me, "new_inference_list_iterator", "NEW-INFERENCE-LIST-ITERATOR", 1, 0, false);
        declareFunction(me, "get_inference_list_iterator_list", "GET-INFERENCE-LIST-ITERATOR-LIST", 1, 0, false);
        declareFunction(me, "inference_list_iterator_size", "INFERENCE-LIST-ITERATOR-SIZE", 1, 0, false);
        declareFunction(me, "make_inference_iterator_list_state", "MAKE-INFERENCE-ITERATOR-LIST-STATE", 1, 0, false);
        declareFunction(me, "iterate_inference_list_done", "ITERATE-INFERENCE-LIST-DONE", 1, 0, false);
        declareFunction(me, "iterate_inference_list_next", "ITERATE-INFERENCE-LIST-NEXT", 1, 0, false);
        declareFunction(me, "new_alist_iterator", "NEW-ALIST-ITERATOR", 1, 0, false);
        declareFunction(me, "new_vector_iterator", "NEW-VECTOR-ITERATOR", 1, 0, false);
        declareFunction(me, "make_iterator_vector_state", "MAKE-ITERATOR-VECTOR-STATE", 1, 0, false);
        declareFunction(me, "iterate_vector_next", "ITERATE-VECTOR-NEXT", 1, 0, false);
        new iteration.$iterate_vector_next$UnaryFunction();
        declareFunction(me, "new_vector_index_iterator", "NEW-VECTOR-INDEX-ITERATOR", 1, 0, false);
        declareFunction(me, "make_iterator_vector_index_state", "MAKE-ITERATOR-VECTOR-INDEX-STATE", 1, 0, false);
        declareFunction(me, "iterate_vector_index_next", "ITERATE-VECTOR-INDEX-NEXT", 1, 0, false);
        declareFunction(me, "new_string_iterator", "NEW-STRING-ITERATOR", 1, 0, false);
        declareFunction(me, "new_sequence_iterator", "NEW-SEQUENCE-ITERATOR", 1, 2, false);
        declareFunction(me, "new_hash_table_iterator", "NEW-HASH-TABLE-ITERATOR", 1, 0, false);
        declareFunction(me, "new_hash_table_keys_iterator", "NEW-HASH-TABLE-KEYS-ITERATOR", 1, 0, false);
        declareFunction(me, "new_hash_table_values_iterator", "NEW-HASH-TABLE-VALUES-ITERATOR", 1, 0, false);
        declareFunction(me, "make_iterator_hash_table_state", "MAKE-ITERATOR-HASH-TABLE-STATE", 1, 0, false);
        declareFunction(me, "iterator_hash_table_done", "ITERATOR-HASH-TABLE-DONE", 1, 0, false);
        declareFunction(me, "iterator_hash_table_next", "ITERATOR-HASH-TABLE-NEXT", 1, 0, false);
        declareFunction(me, "new_file_form_iterator", "NEW-FILE-FORM-ITERATOR", 1, 2, false);
        declareFunction(me, "make_file_form_iterator_state", "MAKE-FILE-FORM-ITERATOR-STATE", 1, 2, false);
        declareFunction(me, "file_form_iterator_doneP", "FILE-FORM-ITERATOR-DONE?", 1, 0, false);
        declareFunction(me, "file_form_iterator_next", "FILE-FORM-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "file_form_iterator_finalize", "FILE-FORM-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "new_lazy_iterator", "NEW-LAZY-ITERATOR", 2, 0, false);
        declareFunction(me, "lazy_iterator_uninitializedP", "LAZY-ITERATOR-UNINITIALIZED?", 1, 0, false);
        declareFunction(me, "lazy_iterator_valid_uninitializedP", "LAZY-ITERATOR-VALID-UNINITIALIZED?", 1, 0, false);
        declareFunction(me, "initialize_lazy_iterator", "INITIALIZE-LAZY-ITERATOR", 1, 0, false);
        declareFunction(me, "lazy_iterator_done", "LAZY-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "lazy_iterator_next", "LAZY-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "new_indirect_iterator", "NEW-INDIRECT-ITERATOR", 1, 2, false);
        declareFunction(me, "make_iterator_indirect_state", "MAKE-ITERATOR-INDIRECT-STATE", 2, 0, false);
        declareFunction(me, "iterate_indirect_next", "ITERATE-INDIRECT-NEXT", 1, 0, false);
        declareFunction(me, "iterate_indirect_finalize", "ITERATE-INDIRECT-FINALIZE", 1, 0, false);
        declareFunction(me, "new_factory_iterator", "NEW-FACTORY-ITERATOR", 1, 2, false);
        declareFunction(me, "make_iterator_factory_state", "MAKE-ITERATOR-FACTORY-STATE", 2, 0, false);
        declareFunction(me, "iterate_factory_next", "ITERATE-FACTORY-NEXT", 1, 0, false);
        declareFunction(me, "iterate_factory_finalize", "ITERATE-FACTORY-FINALIZE", 1, 0, false);
        declareFunction(me, "new_meta_iterator_iterator", "NEW-META-ITERATOR-ITERATOR", 1, 0, false);
        declareFunction(me, "make_meta_iterator_iterator_state", "MAKE-META-ITERATOR-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "meta_iterator_iterator_done", "META-ITERATOR-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "meta_iterator_iterator_next", "META-ITERATOR-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "meta_iterator_iterator_finalize", "META-ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "new_iterator_iterator", "NEW-ITERATOR-ITERATOR", 1, 0, false);
        declareFunction(me, "get_iterator_iterator_iterators", "GET-ITERATOR-ITERATOR-ITERATORS", 1, 0, false);
        declareFunction(me, "make_iterator_iterator_state", "MAKE-ITERATOR-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "iterator_iterator_done", "ITERATOR-ITERATOR-DONE", 1, 0, false);
        new iteration.$iterator_iterator_done$UnaryFunction();
        declareFunction(me, "iterator_iterator_next", "ITERATOR-ITERATOR-NEXT", 1, 0, false);
        new iteration.$iterator_iterator_next$UnaryFunction();
        declareFunction(me, "iterator_iterator_finalize", "ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "new_rotating_iterator_iterator", "NEW-ROTATING-ITERATOR-ITERATOR", 1, 0, false);
        declareFunction(me, "validate_iterators", "VALIDATE-ITERATORS", 1, 1, false);
        declareFunction(me, "get_rotating_iterator_iterator_iterators", "GET-ROTATING-ITERATOR-ITERATOR-ITERATORS", 1, 0, false);
        declareFunction(me, "make_rotating_iterator_iterator_state", "MAKE-ROTATING-ITERATOR-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "rotating_iterator_iterator_done", "ROTATING-ITERATOR-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "rotating_iterator_iterator_next", "ROTATING-ITERATOR-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "rotating_iterator_iterator_finalize", "ROTATING-ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "new_reusable_iterator", "NEW-REUSABLE-ITERATOR", 3, 1, false);
        declareFunction(me, "reusable_iterator_done", "REUSABLE-ITERATOR-DONE", 1, 0, false);
        new iteration.$reusable_iterator_done$UnaryFunction();
        declareFunction(me, "reusable_iterator_next", "REUSABLE-ITERATOR-NEXT", 1, 0, false);
        new iteration.$reusable_iterator_next$UnaryFunction();
        declareFunction(me, "reusable_iterator_finalize", "REUSABLE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "new_reusable_iterator_from_iterator", "NEW-REUSABLE-ITERATOR-FROM-ITERATOR", 1, 0, false);
        declareFunction(me, "reusable_iterator_from_iterator_done", "REUSABLE-ITERATOR-FROM-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "reusable_iterator_from_iterator_next", "REUSABLE-ITERATOR-FROM-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "reusable_iterator_from_iterator_finalize", "REUSABLE-ITERATOR-FROM-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "new_reusable_list_iterator", "NEW-REUSABLE-LIST-ITERATOR", 1, 0, false);
        declareFunction(me, "reset_reusable_iterator", "RESET-REUSABLE-ITERATOR", 1, 0, false);
        declareFunction(me, "finish_reusable_iterator", "FINISH-REUSABLE-ITERATOR", 1, 0, false);
        declareMacro(me, "do_reusable_iterator", "DO-REUSABLE-ITERATOR");
        declareFunction(me, "map_reusable_iterator", "MAP-REUSABLE-ITERATOR", 2, 0, false);
        declareFunction(me, "new_reusable_iterator_cartesian_iterator", "NEW-REUSABLE-ITERATOR-CARTESIAN-ITERATOR", 1, 0, false);
        declareFunction(me, "reusable_iterator_cartesian_iterator_state", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "reusable_iterator_cartesian_iterator_done", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE", 1, 0, false);
        new iteration.$reusable_iterator_cartesian_iterator_done$UnaryFunction();
        declareFunction(me, "all_iterators_doneP", "ALL-ITERATORS-DONE?", 1, 0, false);
        declareFunction(me, "reusable_iterator_cartesian_iterator_next", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT", 1, 0, false);
        new iteration.$reusable_iterator_cartesian_iterator_next$UnaryFunction();
        declareFunction(me, "reusable_iterator_cartesian_iterator_finalize", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "new_filter_iterator", "NEW-FILTER-ITERATOR", 2, 1, false);
        declareFunction(me, "new_filter_iterator_without_values", "NEW-FILTER-ITERATOR-WITHOUT-VALUES", 2, 2, false);
        declareFunction(me, "new_filter_and_transform_iterator", "NEW-FILTER-AND-TRANSFORM-ITERATOR", 2, 1, false);
        declareFunction(me, "make_filter_iterator_state", "MAKE-FILTER-ITERATOR-STATE", 3, 0, false);
        declareFunction(me, "make_filter_iterator_without_values_state", "MAKE-FILTER-ITERATOR-WITHOUT-VALUES-STATE", 4, 0, false);
        declareFunction(me, "make_filter_and_tranform_iterator_state", "MAKE-FILTER-AND-TRANFORM-ITERATOR-STATE", 3, 0, false);
        declareFunction(me, "filter_iterator_finalize", "FILTER-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "filter_iterator_next", "FILTER-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "filter_iterator_without_values_next", "FILTER-ITERATOR-WITHOUT-VALUES-NEXT", 1, 0, false);
        declareFunction(me, "filter_and_transform_iterator_next", "FILTER-AND-TRANSFORM-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "default_iterator_done_p", "DEFAULT-ITERATOR-DONE-P", 1, 0, false);
        new iteration.$default_iterator_done_p$UnaryFunction();
        declareFunction(me, "test_iterate_once", "TEST-ITERATE-ONCE", 1, 0, false);
        declareFunction(me, "test_iterate_all", "TEST-ITERATE-ALL", 1, 0, false);
        declareFunction(me, "new_transform_iterator", "NEW-TRANSFORM-ITERATOR", 2, 1, false);
        declareFunction(me, "make_xform_iterator_state", "MAKE-XFORM-ITERATOR-STATE", 3, 0, false);
        declareFunction(me, "xform_iterator_done", "XFORM-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "xform_iterator_next", "XFORM-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "xml_token_iterator_p", "XML-TOKEN-ITERATOR-P", 1, 0, false);
        declareFunction(me, "xml_token_iterator_peek", "XML-TOKEN-ITERATOR-PEEK", 1, 0, false);
        declareFunction(me, "iterator_size_exhaustive", "ITERATOR-SIZE-EXHAUSTIVE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_iteration_file() {
        defconstant("*DTP-ITERATOR*", ITERATOR);
        defparameter("*WITHIN-PRINT-ITERATOR*", NIL);
        defconstant("*XFORM-FN-PARAM-DO-NOT-PASS*", make_symbol($$$YOU_SHALL_NOT_PASS));
        return NIL;
    }

    public static SubLObject setup_iteration_file() {
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

    @Override
    public void declareFunctions() {
        declare_iteration_file();
    }

    @Override
    public void initializeVariables() {
        init_iteration_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_iteration_file();
    }

    

    public static final class $iterator_native extends SubLStructNative {
        public SubLObject $state;

        public SubLObject $done;

        public SubLObject $next;

        public SubLObject $finalize;

        private static final SubLStructDeclNative structDecl;

        private $iterator_native() {
            this.$state = Lisp.NIL;
            this.$done = Lisp.NIL;
            this.$next = Lisp.NIL;
            this.$finalize = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$state;
        }

        @Override
        public SubLObject getField3() {
            return this.$done;
        }

        @Override
        public SubLObject getField4() {
            return this.$next;
        }

        @Override
        public SubLObject getField5() {
            return this.$finalize;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$state = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$done = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$next = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$finalize = value;
        }

        static {
            structDecl = makeStructDeclNative($iterator_native.class, ITERATOR, ITERATOR_P, $list2, $list3, new String[]{ "$state", "$done", "$next", "$finalize" }, $list4, $list5, PRINT_ITERATOR);
        }
    }

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

    public static final class $iterate_number_done$UnaryFunction extends UnaryFunction {
        public $iterate_number_done$UnaryFunction() {
            super(extractFunctionNamed("ITERATE-NUMBER-DONE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return iterate_number_done(arg1);
        }
    }

    public static final class $iterate_list_done$UnaryFunction extends UnaryFunction {
        public $iterate_list_done$UnaryFunction() {
            super(extractFunctionNamed("ITERATE-LIST-DONE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return iterate_list_done(arg1);
        }
    }

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

    public static final class $reusable_iterator_done$UnaryFunction extends UnaryFunction {
        public $reusable_iterator_done$UnaryFunction() {
            super(extractFunctionNamed("REUSABLE-ITERATOR-DONE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return reusable_iterator_done(arg1);
        }
    }

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
