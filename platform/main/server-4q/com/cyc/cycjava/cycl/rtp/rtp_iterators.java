package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.rkf_formula_optimizer;
import com.cyc.cycjava.cycl.rkf_text_processors;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rtp_iterators extends SubLTranslatedFile {
    public static final SubLFile me = new rtp_iterators();

    public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_iterators";

    public static final String myFingerPrint = "4775715ee1182f9b7818218cd244b5c984c02da7195afa9511c15b5a43c1602a";

    // defconstant
    public static final SubLSymbol $dtp_itp_result_iterator$ = makeSymbol("*DTP-ITP-RESULT-ITERATOR*");

    // defconstant
    public static final SubLSymbol $dtp_itp_section_iterator$ = makeSymbol("*DTP-ITP-SECTION-ITERATOR*");

    // defconstant
    public static final SubLSymbol $dtp_itp_child_iterator$ = makeSymbol("*DTP-ITP-CHILD-ITERATOR*");

    // defconstant
    public static final SubLSymbol $dtp_rtp_iterator$ = makeSymbol("*DTP-RTP-ITERATOR*");

    // Internal Constants
    public static final SubLSymbol ITP_RESULT_ITERATOR = makeSymbol("ITP-RESULT-ITERATOR");

    public static final SubLSymbol ITP_RESULT_ITERATOR_P = makeSymbol("ITP-RESULT-ITERATOR-P");

    public static final SubLList $list2 = list(makeSymbol("STYLE"), makeSymbol("PARSES"), makeSymbol("SPAN"), makeSymbol("SECTION-ITERATOR"));

    public static final SubLList $list3 = list(makeKeyword("STYLE"), makeKeyword("PARSES"), makeKeyword("SPAN"), makeKeyword("SECTION-ITERATOR"));

    public static final SubLList $list4 = list(makeSymbol("ITP-RESULT-ITERATOR-STYLE"), makeSymbol("ITP-RESULT-ITERATOR-PARSES"), makeSymbol("ITP-RESULT-ITERATOR-SPAN"), makeSymbol("ITP-RESULT-ITERATOR-SECTION-ITERATOR"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-ITP-RESULT-ITERATOR-STYLE"), makeSymbol("_CSETF-ITP-RESULT-ITERATOR-PARSES"), makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SPAN"), makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR"));



    public static final SubLSymbol ITP_RESULT_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITP-RESULT-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ITP-RESULT-ITERATOR-P"));

    private static final SubLSymbol ITP_RESULT_ITERATOR_STYLE = makeSymbol("ITP-RESULT-ITERATOR-STYLE");

    private static final SubLSymbol _CSETF_ITP_RESULT_ITERATOR_STYLE = makeSymbol("_CSETF-ITP-RESULT-ITERATOR-STYLE");

    private static final SubLSymbol ITP_RESULT_ITERATOR_PARSES = makeSymbol("ITP-RESULT-ITERATOR-PARSES");

    private static final SubLSymbol _CSETF_ITP_RESULT_ITERATOR_PARSES = makeSymbol("_CSETF-ITP-RESULT-ITERATOR-PARSES");

    private static final SubLSymbol ITP_RESULT_ITERATOR_SPAN = makeSymbol("ITP-RESULT-ITERATOR-SPAN");

    private static final SubLSymbol _CSETF_ITP_RESULT_ITERATOR_SPAN = makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SPAN");

    private static final SubLSymbol ITP_RESULT_ITERATOR_SECTION_ITERATOR = makeSymbol("ITP-RESULT-ITERATOR-SECTION-ITERATOR");

    private static final SubLSymbol _CSETF_ITP_RESULT_ITERATOR_SECTION_ITERATOR = makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR");









    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_ITP_RESULT_ITERATOR = makeSymbol("MAKE-ITP-RESULT-ITERATOR");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ITP_RESULT_ITERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-RESULT-ITERATOR-METHOD");

    private static final SubLSymbol ITP_SECTION_ITERATOR = makeSymbol("ITP-SECTION-ITERATOR");

    private static final SubLSymbol ITP_SECTION_ITERATOR_P = makeSymbol("ITP-SECTION-ITERATOR-P");

    private static final SubLList $list29 = list(makeSymbol("PARENT"), makeSymbol("SPAN"), makeSymbol("SECTION"), makeSymbol("CURRENT"));

    private static final SubLList $list30 = list(makeKeyword("PARENT"), makeKeyword("SPAN"), makeKeyword("SECTION"), makeKeyword("CURRENT"));

    private static final SubLList $list31 = list(makeSymbol("ITP-SECTION-ITERATOR-PARENT"), makeSymbol("ITP-SECTION-ITERATOR-SPAN"), makeSymbol("ITP-SECTION-ITERATOR-SECTION"), makeSymbol("ITP-SECTION-ITERATOR-CURRENT"));

    private static final SubLList $list32 = list(makeSymbol("_CSETF-ITP-SECTION-ITERATOR-PARENT"), makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SPAN"), makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SECTION"), makeSymbol("_CSETF-ITP-SECTION-ITERATOR-CURRENT"));

    private static final SubLSymbol ITP_PRINT_SECTION_ITERATOR = makeSymbol("ITP-PRINT-SECTION-ITERATOR");

    private static final SubLSymbol ITP_SECTION_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITP-SECTION-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list35 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ITP-SECTION-ITERATOR-P"));

    private static final SubLSymbol ITP_SECTION_ITERATOR_PARENT = makeSymbol("ITP-SECTION-ITERATOR-PARENT");

    private static final SubLSymbol _CSETF_ITP_SECTION_ITERATOR_PARENT = makeSymbol("_CSETF-ITP-SECTION-ITERATOR-PARENT");

    private static final SubLSymbol ITP_SECTION_ITERATOR_SPAN = makeSymbol("ITP-SECTION-ITERATOR-SPAN");

    private static final SubLSymbol _CSETF_ITP_SECTION_ITERATOR_SPAN = makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SPAN");

    private static final SubLSymbol ITP_SECTION_ITERATOR_SECTION = makeSymbol("ITP-SECTION-ITERATOR-SECTION");

    private static final SubLSymbol _CSETF_ITP_SECTION_ITERATOR_SECTION = makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SECTION");

    private static final SubLSymbol ITP_SECTION_ITERATOR_CURRENT = makeSymbol("ITP-SECTION-ITERATOR-CURRENT");

    private static final SubLSymbol _CSETF_ITP_SECTION_ITERATOR_CURRENT = makeSymbol("_CSETF-ITP-SECTION-ITERATOR-CURRENT");







    private static final SubLSymbol MAKE_ITP_SECTION_ITERATOR = makeSymbol("MAKE-ITP-SECTION-ITERATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ITP_SECTION_ITERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-SECTION-ITERATOR-METHOD");

    private static final SubLString $str49$_ITP_SECTION___S_ = makeString("<ITP-SECTION: ~S>");

    private static final SubLSymbol ITP_CHILD_ITERATOR = makeSymbol("ITP-CHILD-ITERATOR");

    private static final SubLSymbol ITP_CHILD_ITERATOR_P = makeSymbol("ITP-CHILD-ITERATOR-P");

    private static final SubLList $list52 = list(makeSymbol("PARENT"), makeSymbol("ROP-FORMULA"), makeSymbol("SECTION"));

    private static final SubLList $list53 = list(makeKeyword("PARENT"), makeKeyword("ROP-FORMULA"), makeKeyword("SECTION"));

    private static final SubLList $list54 = list(makeSymbol("ITP-CHILD-ITERATOR-PARENT"), makeSymbol("ITP-CHILD-ITERATOR-ROP-FORMULA"), makeSymbol("ITP-CHILD-ITERATOR-SECTION"));

    private static final SubLList $list55 = list(makeSymbol("_CSETF-ITP-CHILD-ITERATOR-PARENT"), makeSymbol("_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA"), makeSymbol("_CSETF-ITP-CHILD-ITERATOR-SECTION"));

    private static final SubLSymbol ITP_PRINT_CHILD_ITERATOR = makeSymbol("ITP-PRINT-CHILD-ITERATOR");

    private static final SubLSymbol ITP_CHILD_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITP-CHILD-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list58 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ITP-CHILD-ITERATOR-P"));

    private static final SubLSymbol ITP_CHILD_ITERATOR_PARENT = makeSymbol("ITP-CHILD-ITERATOR-PARENT");

    private static final SubLSymbol _CSETF_ITP_CHILD_ITERATOR_PARENT = makeSymbol("_CSETF-ITP-CHILD-ITERATOR-PARENT");

    private static final SubLSymbol ITP_CHILD_ITERATOR_ROP_FORMULA = makeSymbol("ITP-CHILD-ITERATOR-ROP-FORMULA");

    private static final SubLSymbol _CSETF_ITP_CHILD_ITERATOR_ROP_FORMULA = makeSymbol("_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA");

    private static final SubLSymbol ITP_CHILD_ITERATOR_SECTION = makeSymbol("ITP-CHILD-ITERATOR-SECTION");

    private static final SubLSymbol _CSETF_ITP_CHILD_ITERATOR_SECTION = makeSymbol("_CSETF-ITP-CHILD-ITERATOR-SECTION");



    private static final SubLSymbol MAKE_ITP_CHILD_ITERATOR = makeSymbol("MAKE-ITP-CHILD-ITERATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ITP_CHILD_ITERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-CHILD-ITERATOR-METHOD");

    private static final SubLString $str68$_ITP_CHILD___S_ = makeString("<ITP-CHILD: ~S>");





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));







    private static final SubLSymbol RTP_ITERATOR = makeSymbol("RTP-ITERATOR");

    private static final SubLSymbol RTP_ITERATOR_P = makeSymbol("RTP-ITERATOR-P");

    private static final SubLList $list77 = list(new SubLObject[]{ makeSymbol("STRING"), makeSymbol("PARSING-MT"), makeSymbol("SEMANTIC-MT"), makeSymbol("STRENGTHEN?"), makeSymbol("MULTIPLE-QUANTIFICATIONS?"), makeSymbol("WFF-CHECK?"), makeSymbol("FORCE"), makeSymbol("RAW-PARSES"), makeSymbol("RESULT-QUEUE"), makeSymbol("INITIALIZED"), makeSymbol("TEMPLATE-CATEGORY"), makeSymbol("MEMOIZATION-STATE"), makeSymbol("SBHL-RESOURCE") });

    private static final SubLList $list78 = list(new SubLObject[]{ makeKeyword("STRING"), makeKeyword("PARSING-MT"), makeKeyword("SEMANTIC-MT"), makeKeyword("STRENGTHEN?"), makeKeyword("MULTIPLE-QUANTIFICATIONS?"), makeKeyword("WFF-CHECK?"), makeKeyword("FORCE"), makeKeyword("RAW-PARSES"), makeKeyword("RESULT-QUEUE"), makeKeyword("INITIALIZED"), makeKeyword("TEMPLATE-CATEGORY"), makeKeyword("MEMOIZATION-STATE"), makeKeyword("SBHL-RESOURCE") });

    private static final SubLList $list79 = list(new SubLObject[]{ makeSymbol("RTP-ITERATOR-STRING"), makeSymbol("RTP-ITERATOR-PARSING-MT"), makeSymbol("RTP-ITERATOR-SEMANTIC-MT"), makeSymbol("RTP-ITERATOR-STRENGTHEN?"), makeSymbol("RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?"), makeSymbol("RTP-ITERATOR-WFF-CHECK?"), makeSymbol("RTP-ITERATOR-FORCE"), makeSymbol("RTP-ITERATOR-RAW-PARSES"), makeSymbol("RTP-ITERATOR-RESULT-QUEUE"), makeSymbol("RTP-ITERATOR-INITIALIZED"), makeSymbol("RTP-ITERATOR-TEMPLATE-CATEGORY"), makeSymbol("RTP-ITERATOR-MEMOIZATION-STATE"), makeSymbol("RTP-ITERATOR-SBHL-RESOURCE") });

    private static final SubLList $list80 = list(new SubLObject[]{ makeSymbol("_CSETF-RTP-ITERATOR-STRING"), makeSymbol("_CSETF-RTP-ITERATOR-PARSING-MT"), makeSymbol("_CSETF-RTP-ITERATOR-SEMANTIC-MT"), makeSymbol("_CSETF-RTP-ITERATOR-STRENGTHEN?"), makeSymbol("_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?"), makeSymbol("_CSETF-RTP-ITERATOR-WFF-CHECK?"), makeSymbol("_CSETF-RTP-ITERATOR-FORCE"), makeSymbol("_CSETF-RTP-ITERATOR-RAW-PARSES"), makeSymbol("_CSETF-RTP-ITERATOR-RESULT-QUEUE"), makeSymbol("_CSETF-RTP-ITERATOR-INITIALIZED"), makeSymbol("_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY"), makeSymbol("_CSETF-RTP-ITERATOR-MEMOIZATION-STATE"), makeSymbol("_CSETF-RTP-ITERATOR-SBHL-RESOURCE") });

    private static final SubLSymbol RTP_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RTP-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list82 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RTP-ITERATOR-P"));

    private static final SubLSymbol RTP_ITERATOR_STRING = makeSymbol("RTP-ITERATOR-STRING");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_STRING = makeSymbol("_CSETF-RTP-ITERATOR-STRING");

    private static final SubLSymbol RTP_ITERATOR_PARSING_MT = makeSymbol("RTP-ITERATOR-PARSING-MT");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_PARSING_MT = makeSymbol("_CSETF-RTP-ITERATOR-PARSING-MT");

    private static final SubLSymbol RTP_ITERATOR_SEMANTIC_MT = makeSymbol("RTP-ITERATOR-SEMANTIC-MT");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_SEMANTIC_MT = makeSymbol("_CSETF-RTP-ITERATOR-SEMANTIC-MT");

    private static final SubLSymbol $sym89$RTP_ITERATOR_STRENGTHEN_ = makeSymbol("RTP-ITERATOR-STRENGTHEN?");

    private static final SubLSymbol $sym90$_CSETF_RTP_ITERATOR_STRENGTHEN_ = makeSymbol("_CSETF-RTP-ITERATOR-STRENGTHEN?");

    private static final SubLSymbol $sym91$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_ = makeSymbol("RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?");

    private static final SubLSymbol $sym92$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_ = makeSymbol("_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?");

    private static final SubLSymbol $sym93$RTP_ITERATOR_WFF_CHECK_ = makeSymbol("RTP-ITERATOR-WFF-CHECK?");

    private static final SubLSymbol $sym94$_CSETF_RTP_ITERATOR_WFF_CHECK_ = makeSymbol("_CSETF-RTP-ITERATOR-WFF-CHECK?");

    private static final SubLSymbol RTP_ITERATOR_FORCE = makeSymbol("RTP-ITERATOR-FORCE");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_FORCE = makeSymbol("_CSETF-RTP-ITERATOR-FORCE");

    private static final SubLSymbol RTP_ITERATOR_RAW_PARSES = makeSymbol("RTP-ITERATOR-RAW-PARSES");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_RAW_PARSES = makeSymbol("_CSETF-RTP-ITERATOR-RAW-PARSES");

    private static final SubLSymbol RTP_ITERATOR_RESULT_QUEUE = makeSymbol("RTP-ITERATOR-RESULT-QUEUE");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_RESULT_QUEUE = makeSymbol("_CSETF-RTP-ITERATOR-RESULT-QUEUE");

    private static final SubLSymbol RTP_ITERATOR_INITIALIZED = makeSymbol("RTP-ITERATOR-INITIALIZED");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_INITIALIZED = makeSymbol("_CSETF-RTP-ITERATOR-INITIALIZED");

    private static final SubLSymbol RTP_ITERATOR_TEMPLATE_CATEGORY = makeSymbol("RTP-ITERATOR-TEMPLATE-CATEGORY");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_TEMPLATE_CATEGORY = makeSymbol("_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY");

    private static final SubLSymbol RTP_ITERATOR_MEMOIZATION_STATE = makeSymbol("RTP-ITERATOR-MEMOIZATION-STATE");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_MEMOIZATION_STATE = makeSymbol("_CSETF-RTP-ITERATOR-MEMOIZATION-STATE");

    private static final SubLSymbol RTP_ITERATOR_SBHL_RESOURCE = makeSymbol("RTP-ITERATOR-SBHL-RESOURCE");

    private static final SubLSymbol _CSETF_RTP_ITERATOR_SBHL_RESOURCE = makeSymbol("_CSETF-RTP-ITERATOR-SBHL-RESOURCE");









    private static final SubLSymbol $kw113$MULTIPLE_QUANTIFICATIONS_ = makeKeyword("MULTIPLE-QUANTIFICATIONS?");

    private static final SubLSymbol $kw114$WFF_CHECK_ = makeKeyword("WFF-CHECK?");















    private static final SubLSymbol MAKE_RTP_ITERATOR = makeSymbol("MAKE-RTP-ITERATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RTP_ITERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RTP-ITERATOR-METHOD");

    private static final SubLSymbol RTP_ITERATOR_DONE = makeSymbol("RTP-ITERATOR-DONE");

    private static final SubLSymbol RTP_ITERATOR_NEXT = makeSymbol("RTP-ITERATOR-NEXT");

    private static final SubLObject $$RKFParsingMt = reader_make_constant_shell(makeString("RKFParsingMt"));



    private static final SubLObject $$STemplate = reader_make_constant_shell(makeString("STemplate"));



    private static final SubLObject $$QuestionTemplate = reader_make_constant_shell(makeString("QuestionTemplate"));



    private static final SubLSymbol $sym132$EL_WFF_ = makeSymbol("EL-WFF?");



    public static SubLObject itp_result_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject itp_result_iterator_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$itp_result_iterator_native.class ? T : NIL;
    }

    public static SubLObject itp_result_iterator_style(final SubLObject v_object) {
        assert NIL != itp_result_iterator_p(v_object) : "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject itp_result_iterator_parses(final SubLObject v_object) {
        assert NIL != itp_result_iterator_p(v_object) : "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject itp_result_iterator_span(final SubLObject v_object) {
        assert NIL != itp_result_iterator_p(v_object) : "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject itp_result_iterator_section_iterator(final SubLObject v_object) {
        assert NIL != itp_result_iterator_p(v_object) : "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_itp_result_iterator_style(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_result_iterator_p(v_object) : "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_itp_result_iterator_parses(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_result_iterator_p(v_object) : "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_itp_result_iterator_span(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_result_iterator_p(v_object) : "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_itp_result_iterator_section_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_result_iterator_p(v_object) : "rtp_iterators.itp_result_iterator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_itp_result_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $itp_result_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STYLE)) {
                _csetf_itp_result_iterator_style(v_new, current_value);
            } else
                if (pcase_var.eql($PARSES)) {
                    _csetf_itp_result_iterator_parses(v_new, current_value);
                } else
                    if (pcase_var.eql($SPAN)) {
                        _csetf_itp_result_iterator_span(v_new, current_value);
                    } else
                        if (pcase_var.eql($SECTION_ITERATOR)) {
                            _csetf_itp_result_iterator_section_iterator(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_itp_result_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ITP_RESULT_ITERATOR, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STYLE, itp_result_iterator_style(obj));
        funcall(visitor_fn, obj, $SLOT, $PARSES, itp_result_iterator_parses(obj));
        funcall(visitor_fn, obj, $SLOT, $SPAN, itp_result_iterator_span(obj));
        funcall(visitor_fn, obj, $SLOT, $SECTION_ITERATOR, itp_result_iterator_section_iterator(obj));
        funcall(visitor_fn, obj, $END, MAKE_ITP_RESULT_ITERATOR, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_itp_result_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_itp_result_iterator(obj, visitor_fn);
    }

    public static SubLObject itp_section_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        itp_print_section_iterator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject itp_section_iterator_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$itp_section_iterator_native.class ? T : NIL;
    }

    public static SubLObject itp_section_iterator_parent(final SubLObject v_object) {
        assert NIL != itp_section_iterator_p(v_object) : "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject itp_section_iterator_span(final SubLObject v_object) {
        assert NIL != itp_section_iterator_p(v_object) : "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject itp_section_iterator_section(final SubLObject v_object) {
        assert NIL != itp_section_iterator_p(v_object) : "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject itp_section_iterator_current(final SubLObject v_object) {
        assert NIL != itp_section_iterator_p(v_object) : "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_itp_section_iterator_parent(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_section_iterator_p(v_object) : "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_itp_section_iterator_span(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_section_iterator_p(v_object) : "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_itp_section_iterator_section(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_section_iterator_p(v_object) : "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_itp_section_iterator_current(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_section_iterator_p(v_object) : "rtp_iterators.itp_section_iterator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_itp_section_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $itp_section_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PARENT)) {
                _csetf_itp_section_iterator_parent(v_new, current_value);
            } else
                if (pcase_var.eql($SPAN)) {
                    _csetf_itp_section_iterator_span(v_new, current_value);
                } else
                    if (pcase_var.eql($SECTION)) {
                        _csetf_itp_section_iterator_section(v_new, current_value);
                    } else
                        if (pcase_var.eql($CURRENT)) {
                            _csetf_itp_section_iterator_current(v_new, current_value);
                        } else {
                            Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_itp_section_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ITP_SECTION_ITERATOR, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PARENT, itp_section_iterator_parent(obj));
        funcall(visitor_fn, obj, $SLOT, $SPAN, itp_section_iterator_span(obj));
        funcall(visitor_fn, obj, $SLOT, $SECTION, itp_section_iterator_section(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT, itp_section_iterator_current(obj));
        funcall(visitor_fn, obj, $END, MAKE_ITP_SECTION_ITERATOR, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_itp_section_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_itp_section_iterator(obj, visitor_fn);
    }

    public static SubLObject itp_print_section_iterator(final SubLObject entry, final SubLObject stream, final SubLObject depth) {
        format(stream, $str49$_ITP_SECTION___S_, itp_section_iterator_span(entry));
        return entry;
    }

    public static SubLObject itp_child_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        itp_print_child_iterator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject itp_child_iterator_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$itp_child_iterator_native.class ? T : NIL;
    }

    public static SubLObject itp_child_iterator_parent(final SubLObject v_object) {
        assert NIL != itp_child_iterator_p(v_object) : "rtp_iterators.itp_child_iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject itp_child_iterator_rop_formula(final SubLObject v_object) {
        assert NIL != itp_child_iterator_p(v_object) : "rtp_iterators.itp_child_iterator_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject itp_child_iterator_section(final SubLObject v_object) {
        assert NIL != itp_child_iterator_p(v_object) : "rtp_iterators.itp_child_iterator_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_itp_child_iterator_parent(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_child_iterator_p(v_object) : "rtp_iterators.itp_child_iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_itp_child_iterator_rop_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_child_iterator_p(v_object) : "rtp_iterators.itp_child_iterator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_itp_child_iterator_section(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_child_iterator_p(v_object) : "rtp_iterators.itp_child_iterator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_itp_child_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $itp_child_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PARENT)) {
                _csetf_itp_child_iterator_parent(v_new, current_value);
            } else
                if (pcase_var.eql($ROP_FORMULA)) {
                    _csetf_itp_child_iterator_rop_formula(v_new, current_value);
                } else
                    if (pcase_var.eql($SECTION)) {
                        _csetf_itp_child_iterator_section(v_new, current_value);
                    } else {
                        Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_itp_child_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ITP_CHILD_ITERATOR, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PARENT, itp_child_iterator_parent(obj));
        funcall(visitor_fn, obj, $SLOT, $ROP_FORMULA, itp_child_iterator_rop_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $SECTION, itp_child_iterator_section(obj));
        funcall(visitor_fn, obj, $END, MAKE_ITP_CHILD_ITERATOR, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_itp_child_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_itp_child_iterator(obj, visitor_fn);
    }

    public static SubLObject itp_print_child_iterator(final SubLObject entry, final SubLObject stream, final SubLObject depth) {
        format(stream, $str68$_ITP_CHILD___S_, itp_child_iterator_rop_formula(entry));
        return entry;
    }

    public static SubLObject new_itp_result_iterator(final SubLObject parses, SubLObject style, SubLObject string) {
        if (style == UNPROVIDED) {
            style = NIL;
        }
        if (string == UNPROVIDED) {
            string = NIL;
        }
        final SubLObject iterator = make_itp_result_iterator(UNPROVIDED);
        if (NIL == style) {
            style = determine_parse_result_style(parses);
        }
        _csetf_itp_result_iterator_style(iterator, style);
        _csetf_itp_result_iterator_parses(iterator, parses);
        itp_result_iterator_reset(iterator);
        return iterator;
    }

    public static SubLObject determine_parse_result_style(final SubLObject parses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject first_span_set = second(parses.first());
        final SubLObject first_parse = first_span_set.first();
        SubLObject result = $SIMPLE;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != rtp_constituent_weeders.itp_semantics_p(first_parse)) {
                result = $RANKED;
            } else
                if (first_parse.isList() && (NIL != assertion_handles.assertion_p(second(first_parse)))) {
                    result = $ASSERTION;
                } else
                    if ((first_parse.isList() && second(first_parse).isList()) && (NIL != assertion_handles.assertion_p(second(first_parse).first()))) {
                        result = $ASSERTION;
                    } else {
                        result = $SIMPLE;
                    }


        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject copy_itp_result_iterator(final SubLObject result_iterator) {
        final SubLObject result = make_itp_result_iterator(UNPROVIDED);
        _csetf_itp_result_iterator_style(result, itp_result_iterator_style(result_iterator));
        _csetf_itp_result_iterator_parses(result, itp_result_iterator_parses(result_iterator));
        _csetf_itp_result_iterator_span(result, itp_result_iterator_span(result_iterator));
        _csetf_itp_result_iterator_section_iterator(result, itp_result_iterator_section_iterator(result_iterator));
        return result;
    }

    public static SubLObject new_itp_section_iterator(final SubLObject parent, final SubLObject span) {
        final SubLObject iterator = make_itp_section_iterator(UNPROVIDED);
        _csetf_itp_section_iterator_parent(iterator, parent);
        final SubLObject the_span = span.first();
        final SubLObject the_section = second(span);
        _csetf_itp_section_iterator_span(iterator, the_span);
        _csetf_itp_section_iterator_section(iterator, the_section);
        itp_section_iterator_reset(iterator);
        return iterator;
    }

    public static SubLObject new_itp_child_iterator(final SubLObject parent, final SubLObject rop_formula) {
        final SubLObject iterator = make_itp_child_iterator(UNPROVIDED);
        _csetf_itp_child_iterator_parent(iterator, parent);
        _csetf_itp_child_iterator_rop_formula(iterator, rop_formula);
        final SubLObject span = parsing_utilities.result_of_parsing_span_wXo_thelist(rop_formula);
        _csetf_itp_child_iterator_section(iterator, find_itp_section_iterator(parent, span));
        return iterator;
    }

    public static SubLObject new_itp_root_children_iterator(final SubLObject parent) {
        final SubLObject iterator = make_itp_child_iterator(UNPROVIDED);
        _csetf_itp_child_iterator_parent(iterator, parent);
        _csetf_itp_child_iterator_section(iterator, itp_result_iterator_curr(parent));
        return iterator;
    }

    public static SubLObject is_itp_root_children_iteratorP(final SubLObject iterator) {
        return makeBoolean((NIL != itp_child_iterator_p(iterator)) && (NIL == itp_child_iterator_rop_formula(iterator)));
    }

    public static SubLObject is_equivalent_rtp_child_iteratorP(final SubLObject iterator_1, final SubLObject iterator_2) {
        return equalp(itp_child_iterator_rop_formula(iterator_1), itp_child_iterator_rop_formula(iterator_2));
    }

    public static SubLObject itp_result_iterator_reset(final SubLObject iterator) {
        final SubLObject span = itp_result_iterator_parses(iterator);
        _csetf_itp_result_iterator_span(iterator, span);
        return update_itp_result_section_iterator(iterator);
    }

    public static SubLObject itp_result_iterator_curr(final SubLObject iterator) {
        return itp_result_iterator_section_iterator(iterator);
    }

    public static SubLObject itp_section_iterator_reset(final SubLObject iterator) {
        final SubLObject current = itp_section_iterator_section(iterator);
        _csetf_itp_section_iterator_current(iterator, current);
        return iterator;
    }

    public static SubLObject itp_section_iterator_curr(final SubLObject iterator) {
        return itp_section_iterator_current(iterator).first();
    }

    public static SubLObject itp_section_iterator_set_curr(final SubLObject iterator, final SubLObject element) {
        rplaca(itp_section_iterator_current(iterator), element);
        return element;
    }

    public static SubLObject itp_section_iterator_curr_span(final SubLObject iterator) {
        return itp_section_iterator_span(iterator);
    }

    public static SubLObject itp_section_iterator_curr_cycl(final SubLObject iterator) {
        final SubLObject pcase_var = itp_result_iterator_style(itp_section_iterator_parent(iterator));
        if (pcase_var.eql($SIMPLE)) {
            return itp_section_iterator_curr(iterator);
        }
        if (pcase_var.eql($ASSERTION)) {
            return itp_section_iterator_curr(iterator).first();
        }
        if (pcase_var.eql($RANKED)) {
            return rtp_constituent_weeders.itp_semantics_cycl(itp_section_iterator_curr(iterator));
        }
        return NIL;
    }

    public static SubLObject itp_section_iterator_curr_assertion(final SubLObject iterator) {
        final SubLObject pcase_var = itp_result_iterator_style(itp_section_iterator_parent(iterator));
        if (pcase_var.eql($ASSERTION)) {
            return second(itp_section_iterator_curr(iterator));
        }
        if (pcase_var.eql($RANKED)) {
            return rtp_constituent_weeders.itp_semantics_supports(itp_section_iterator_curr(iterator));
        }
        return $UNAVAILABLE;
    }

    public static SubLObject itp_section_iterator_curr_pred(final SubLObject iterator) {
        final SubLObject pcase_var = itp_result_iterator_style(itp_section_iterator_parent(iterator));
        if (pcase_var.eql($SIMPLE)) {
            return $UNAVAILABLE;
        }
        if (pcase_var.eql($ASSERTION)) {
            return args_from_assertions(ZERO_INTEGER, itp_section_iterator_curr_assertion(iterator));
        }
        if (pcase_var.eql($RANKED)) {
            return rtp_constituent_weeders.itp_semantics_force(itp_section_iterator_curr(iterator));
        }
        return NIL;
    }

    public static SubLObject itp_section_iterator_curr_cat(final SubLObject iterator) {
        final SubLObject pcase_var = itp_result_iterator_style(itp_section_iterator_parent(iterator));
        if (pcase_var.eql($SIMPLE)) {
            return $UNAVAILABLE;
        }
        if (pcase_var.eql($ASSERTION)) {
            return args_from_assertions(ONE_INTEGER, itp_section_iterator_curr_assertion(iterator));
        }
        if (pcase_var.eql($RANKED)) {
            return rtp_constituent_weeders.itp_semantics_category(itp_section_iterator_curr(iterator));
        }
        return NIL;
    }

    public static SubLObject itp_section_iterator_curr_confidence(final SubLObject iterator) {
        final SubLObject pcase_var = itp_result_iterator_style(itp_section_iterator_parent(iterator));
        if (pcase_var.eql($RANKED)) {
            return rtp_constituent_weeders.itp_semantics_confidence(itp_section_iterator_curr(iterator));
        }
        return $UNAVAILABLE;
    }

    public static SubLObject args_from_assertions(final SubLObject arg_num, final SubLObject asserts) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = asserts;
        SubLObject v_assert = NIL;
        v_assert = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.assertion_p(v_assert)) {
                result = cons(assertions_high.gaf_arg(v_assert, arg_num), result);
            } else {
                result = cons(v_assert, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_assert = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject find_itp_section_iterator(final SubLObject result_iterator, final SubLObject span) {
        final SubLObject iterator = copy_itp_result_iterator(result_iterator);
        SubLObject section_iterator = NIL;
        itp_result_iterator_reset(iterator);
        while (NIL == itp_result_iterator_doneP(iterator)) {
            section_iterator = itp_result_iterator_curr(iterator);
            if (span.equal(itp_section_iterator_span(section_iterator))) {
                return section_iterator;
            }
            itp_result_iterator_next(iterator);
        } 
        return NIL;
    }

    public static SubLObject itp_child_iterator_reset(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_reset(section_iterator);
        }
        return iterator;
    }

    public static SubLObject itp_child_iterator_curr(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr(section_iterator);
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr_span(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr_span(section_iterator);
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr_cycl(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr_cycl(section_iterator);
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr_assertion(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr_assertion(section_iterator);
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr_pred(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr_pred(section_iterator);
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr_cat(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr_cat(section_iterator);
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_curr_confidence(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr_confidence(section_iterator);
        }
        return NIL;
    }

    public static SubLObject itp_result_iterator_doneP(final SubLObject iterator) {
        return sublisp_null(itp_result_iterator_span(iterator));
    }

    public static SubLObject itp_result_iterator_next(final SubLObject iterator) {
        if (NIL == itp_result_iterator_doneP(iterator)) {
            final SubLObject span = itp_result_iterator_span(iterator);
            _csetf_itp_result_iterator_span(iterator, span.rest());
            update_itp_result_section_iterator(iterator);
        }
        return itp_result_iterator_curr(iterator);
    }

    public static SubLObject itp_result_iterator_prev(final SubLObject iterator) {
        final SubLObject span = itp_result_iterator_span(iterator);
        SubLObject start = itp_result_iterator_parses(iterator);
        if (!span.eql(start)) {
            while (!start.rest().eql(span)) {
                start = start.rest();
            } 
            _csetf_itp_result_iterator_span(iterator, start);
        }
        update_itp_result_section_iterator(iterator);
        return itp_result_iterator_curr(iterator);
    }

    public static SubLObject itp_section_iterator_next(final SubLObject iterator) {
        if (NIL == itp_section_iterator_doneP(iterator)) {
            final SubLObject current = itp_section_iterator_current(iterator);
            _csetf_itp_section_iterator_current(iterator, current.rest());
        }
        return itp_section_iterator_current(iterator);
    }

    public static SubLObject itp_section_iterator_prev(final SubLObject iterator) {
        final SubLObject current = itp_section_iterator_current(iterator);
        SubLObject start = itp_section_iterator_section(iterator);
        if (!current.eql(start)) {
            while (!start.rest().eql(current)) {
                start = start.rest();
            } 
            _csetf_itp_section_iterator_current(iterator, start);
        }
        return itp_section_iterator_curr(iterator);
    }

    public static SubLObject itp_section_iterator_doneP(final SubLObject iterator) {
        return sublisp_null(itp_section_iterator_current(iterator));
    }

    public static SubLObject itp_child_iterator_next(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_next(section_iterator);
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_prev(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_prev(section_iterator);
        }
        return NIL;
    }

    public static SubLObject itp_child_iterator_doneP(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_doneP(section_iterator);
        }
        return T;
    }

    public static SubLObject itp_longest_parse_cycls(final SubLObject parses) {
        final SubLObject result_iterator = new_itp_result_iterator(parses, UNPROVIDED, UNPROVIDED);
        SubLObject max_span_length = ZERO_INTEGER;
        SubLObject max_span = NIL;
        SubLObject output_cycls = NIL;
        while (NIL == itp_result_iterator_doneP(result_iterator)) {
            final SubLObject section_iterator = itp_result_iterator_curr(result_iterator);
            final SubLObject span = itp_section_iterator_curr_span(section_iterator);
            if (NIL != list_utilities.lengthG(span, max_span_length, UNPROVIDED)) {
                max_span_length = length(span);
                max_span = span;
                output_cycls = NIL;
                while (NIL == itp_section_iterator_doneP(section_iterator)) {
                    output_cycls = cons(itp_section_iterator_curr_cycl(section_iterator), output_cycls);
                    itp_section_iterator_next(section_iterator);
                } 
            }
            itp_result_iterator_next(result_iterator);
        } 
        return values(nreverse(output_cycls), max_span);
    }

    public static SubLObject update_itp_result_section_iterator(final SubLObject iterator) {
        final SubLObject span = itp_result_iterator_span(iterator);
        SubLObject section_iterator = NIL;
        section_iterator = new_itp_section_iterator(iterator, span.first());
        _csetf_itp_result_iterator_section_iterator(iterator, section_iterator);
        return section_iterator;
    }

    public static SubLObject rtp_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rtp_iterator_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$rtp_iterator_native.class ? T : NIL;
    }

    public static SubLObject rtp_iterator_string(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rtp_iterator_parsing_mt(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rtp_iterator_semantic_mt(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rtp_iterator_strengthenP(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject rtp_iterator_multiple_quantificationsP(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject rtp_iterator_wff_checkP(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject rtp_iterator_force(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject rtp_iterator_raw_parses(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject rtp_iterator_result_queue(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject rtp_iterator_initialized(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject rtp_iterator_template_category(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject rtp_iterator_memoization_state(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject rtp_iterator_sbhl_resource(final SubLObject v_object) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.getField14();
    }

    public static SubLObject _csetf_rtp_iterator_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rtp_iterator_parsing_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rtp_iterator_semantic_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rtp_iterator_strengthenP(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rtp_iterator_multiple_quantificationsP(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rtp_iterator_wff_checkP(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rtp_iterator_force(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rtp_iterator_raw_parses(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_rtp_iterator_result_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_rtp_iterator_initialized(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_rtp_iterator_template_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_rtp_iterator_memoization_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_rtp_iterator_sbhl_resource(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_iterator_p(v_object) : "rtp_iterators.rtp_iterator_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject make_rtp_iterator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $rtp_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STRING)) {
                _csetf_rtp_iterator_string(v_new, current_value);
            } else
                if (pcase_var.eql($PARSING_MT)) {
                    _csetf_rtp_iterator_parsing_mt(v_new, current_value);
                } else
                    if (pcase_var.eql($SEMANTIC_MT)) {
                        _csetf_rtp_iterator_semantic_mt(v_new, current_value);
                    } else
                        if (pcase_var.eql($STRENGTHEN_)) {
                            _csetf_rtp_iterator_strengthenP(v_new, current_value);
                        } else
                            if (pcase_var.eql($kw113$MULTIPLE_QUANTIFICATIONS_)) {
                                _csetf_rtp_iterator_multiple_quantificationsP(v_new, current_value);
                            } else
                                if (pcase_var.eql($kw114$WFF_CHECK_)) {
                                    _csetf_rtp_iterator_wff_checkP(v_new, current_value);
                                } else
                                    if (pcase_var.eql($FORCE)) {
                                        _csetf_rtp_iterator_force(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($RAW_PARSES)) {
                                            _csetf_rtp_iterator_raw_parses(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($RESULT_QUEUE)) {
                                                _csetf_rtp_iterator_result_queue(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($INITIALIZED)) {
                                                    _csetf_rtp_iterator_initialized(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($TEMPLATE_CATEGORY)) {
                                                        _csetf_rtp_iterator_template_category(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($MEMOIZATION_STATE)) {
                                                            _csetf_rtp_iterator_memoization_state(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($SBHL_RESOURCE)) {
                                                                _csetf_rtp_iterator_sbhl_resource(v_new, current_value);
                                                            } else {
                                                                Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                                                            }












        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rtp_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RTP_ITERATOR, THIRTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STRING, rtp_iterator_string(obj));
        funcall(visitor_fn, obj, $SLOT, $PARSING_MT, rtp_iterator_parsing_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMANTIC_MT, rtp_iterator_semantic_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $STRENGTHEN_, rtp_iterator_strengthenP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw113$MULTIPLE_QUANTIFICATIONS_, rtp_iterator_multiple_quantificationsP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw114$WFF_CHECK_, rtp_iterator_wff_checkP(obj));
        funcall(visitor_fn, obj, $SLOT, $FORCE, rtp_iterator_force(obj));
        funcall(visitor_fn, obj, $SLOT, $RAW_PARSES, rtp_iterator_raw_parses(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULT_QUEUE, rtp_iterator_result_queue(obj));
        funcall(visitor_fn, obj, $SLOT, $INITIALIZED, rtp_iterator_initialized(obj));
        funcall(visitor_fn, obj, $SLOT, $TEMPLATE_CATEGORY, rtp_iterator_template_category(obj));
        funcall(visitor_fn, obj, $SLOT, $MEMOIZATION_STATE, rtp_iterator_memoization_state(obj));
        funcall(visitor_fn, obj, $SLOT, $SBHL_RESOURCE, rtp_iterator_sbhl_resource(obj));
        funcall(visitor_fn, obj, $END, MAKE_RTP_ITERATOR, THIRTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rtp_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rtp_iterator(obj, visitor_fn);
    }

    public static SubLObject new_rtp_iterator(final SubLObject string, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return iteration.new_iterator(new_rtp_iterator_state(string, v_properties), RTP_ITERATOR_DONE, RTP_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject new_rtp_iterator_state(final SubLObject string, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject iter = make_rtp_iterator(UNPROVIDED);
        final SubLObject parsing_mt = getf(v_properties, $PARSING_MT, $$RKFParsingMt);
        final SubLObject semantic_mt = getf(v_properties, $SEMANTIC_MT, parsing_mt);
        final SubLObject strengthenP = getf(v_properties, $STRENGTHEN_, T);
        final SubLObject multiple_quantificationsP = getf(v_properties, $kw113$MULTIPLE_QUANTIFICATIONS_, NIL);
        final SubLObject force = getf(v_properties, $FORCE, $DECLARATIVE);
        final SubLObject wff_checkP = getf(v_properties, $kw114$WFF_CHECK_, T);
        _csetf_rtp_iterator_string(iter, string);
        _csetf_rtp_iterator_parsing_mt(iter, parsing_mt);
        _csetf_rtp_iterator_semantic_mt(iter, semantic_mt);
        _csetf_rtp_iterator_strengthenP(iter, strengthenP);
        _csetf_rtp_iterator_multiple_quantificationsP(iter, multiple_quantificationsP);
        _csetf_rtp_iterator_force(iter, force);
        _csetf_rtp_iterator_template_category(iter, rtp_iter_cat_for_force(force));
        _csetf_rtp_iterator_wff_checkP(iter, wff_checkP);
        _csetf_rtp_iterator_initialized(iter, NIL);
        _csetf_rtp_iterator_result_queue(iter, queues.create_queue(UNPROVIDED));
        _csetf_rtp_iterator_memoization_state(iter, memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        _csetf_rtp_iterator_sbhl_resource(iter, sbhl_marking_vars.new_sbhl_marking_space_resource(FOUR_INTEGER));
        return iter;
    }

    public static SubLObject rtp_iter_cat_for_force(final SubLObject force) {
        if (force.eql($DECLARATIVE)) {
            return $$STemplate;
        }
        if (force.eql($QUERY)) {
            return $$QuestionTemplate;
        }
        if (force.eql($QUESTION)) {
            return $$QuestionTemplate;
        }
        return $$STemplate;
    }

    public static SubLObject rtp_iterator_done(final SubLObject iter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == queues.queue_empty_p(rtp_iterator_result_queue(iter))) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject local_state = rtp_iterator_memoization_state(iter);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (NIL == rtp_iterator_initialized(iter)) {
                    rtp_iterator_add_raw_parse(iter);
                }
                if ((NIL == rtp_iterator_raw_parses(iter)) && (NIL != queues.queue_empty_p(rtp_iterator_result_queue(iter)))) {
                    result = T;
                }
                while (((NIL != queues.queue_empty_p(rtp_iterator_result_queue(iter))) && (NIL != rtp_iterator_raw_parses(iter))) && (NIL == result)) {
                    rtp_iterator_reformulate_one_parse(iter);
                } 
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (NIL == result) {
            result = queues.queue_empty_p(rtp_iterator_result_queue(iter));
        }
        return result;
    }

    public static SubLObject rtp_iterator_reformulate_one_parse(final SubLObject iter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sbhl_resource = rtp_iterator_sbhl_resource(iter);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                final SubLObject raw_parses = rtp_iterator_raw_parses(iter);
                final SubLObject first_parse = raw_parses.first();
                final SubLObject semantic_mt = rtp_iterator_semantic_mt(iter);
                final SubLObject strengthenP = rtp_iterator_strengthenP(iter);
                final SubLObject reformulated_parses = rkf_formula_optimizer.rkf_reformulate_into_many(first_parse, semantic_mt, strengthenP, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(semantic_mt, thread);
                    final SubLObject wff_parses = (NIL != rtp_iterator_wff_checkP(iter)) ? list_utilities.remove_if_not($sym132$EL_WFF_, reformulated_parses, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : reformulated_parses;
                    _csetf_rtp_iterator_raw_parses(iter, raw_parses.rest());
                    SubLObject cdolist_list_var = wff_parses;
                    SubLObject reformulated_parse = NIL;
                    reformulated_parse = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        queues.enqueue(reformulated_parse, rtp_iterator_result_queue(iter));
                        cdolist_list_var = cdolist_list_var.rest();
                        reformulated_parse = cdolist_list_var.first();
                    } 
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$2, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return iter;
    }

    public static SubLObject rtp_iterator_add_raw_parse(final SubLObject iter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = rkf_text_processors.$rkf_text_proc_resolve_parses$.currentBinding(thread);
        try {
            rkf_text_processors.$rkf_text_proc_resolve_parses$.bind(T, thread);
            final SubLObject rkf_return_multiple_quantifications = rtp_iterator_multiple_quantificationsP(iter);
            final SubLObject _prev_bind_0_$4 = parsing_vars.$rkf_template_wff_filter_level$.currentBinding(thread);
            try {
                parsing_vars.$rkf_template_wff_filter_level$.bind(NIL != rtp_iterator_wff_checkP(iter) ? TWO_INTEGER : ZERO_INTEGER, thread);
                final SubLObject parsing_mt = rtp_iterator_parsing_mt(iter);
                final SubLObject semantic_mt = rtp_iterator_semantic_mt(iter);
                final SubLObject string = rtp_iterator_string(iter);
                final SubLObject template_category = rtp_iterator_template_category(iter);
                final SubLObject raw_parser_output = rkf_text_processors.rkf_utterance_reader(string, template_category, parsing_mt, semantic_mt);
                final SubLObject top_level_parses = rkf_text_processors.top_level_parses(raw_parser_output);
                _csetf_rtp_iterator_raw_parses(iter, top_level_parses);
                _csetf_rtp_iterator_initialized(iter, T);
            } finally {
                parsing_vars.$rkf_template_wff_filter_level$.rebind(_prev_bind_0_$4, thread);
            }
        } finally {
            rkf_text_processors.$rkf_text_proc_resolve_parses$.rebind(_prev_bind_0, thread);
        }
        return iter;
    }

    public static SubLObject rtp_iterator_next(final SubLObject iter) {
        if (NIL != rtp_iterator_done(iter)) {
            return values($FAILURE, iter, NIL);
        }
        final SubLObject result = queues.dequeue(rtp_iterator_result_queue(iter));
        return values(result, iter, NIL);
    }

    public static SubLObject declare_rtp_iterators_file() {
        declareFunction(me, "itp_result_iterator_print_function_trampoline", "ITP-RESULT-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "itp_result_iterator_p", "ITP-RESULT-ITERATOR-P", 1, 0, false);
        new rtp_iterators.$itp_result_iterator_p$UnaryFunction();
        declareFunction(me, "itp_result_iterator_style", "ITP-RESULT-ITERATOR-STYLE", 1, 0, false);
        declareFunction(me, "itp_result_iterator_parses", "ITP-RESULT-ITERATOR-PARSES", 1, 0, false);
        declareFunction(me, "itp_result_iterator_span", "ITP-RESULT-ITERATOR-SPAN", 1, 0, false);
        declareFunction(me, "itp_result_iterator_section_iterator", "ITP-RESULT-ITERATOR-SECTION-ITERATOR", 1, 0, false);
        declareFunction(me, "_csetf_itp_result_iterator_style", "_CSETF-ITP-RESULT-ITERATOR-STYLE", 2, 0, false);
        declareFunction(me, "_csetf_itp_result_iterator_parses", "_CSETF-ITP-RESULT-ITERATOR-PARSES", 2, 0, false);
        declareFunction(me, "_csetf_itp_result_iterator_span", "_CSETF-ITP-RESULT-ITERATOR-SPAN", 2, 0, false);
        declareFunction(me, "_csetf_itp_result_iterator_section_iterator", "_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR", 2, 0, false);
        declareFunction(me, "make_itp_result_iterator", "MAKE-ITP-RESULT-ITERATOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_itp_result_iterator", "VISIT-DEFSTRUCT-ITP-RESULT-ITERATOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_itp_result_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITP-RESULT-ITERATOR-METHOD", 2, 0, false);
        declareFunction(me, "itp_section_iterator_print_function_trampoline", "ITP-SECTION-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "itp_section_iterator_p", "ITP-SECTION-ITERATOR-P", 1, 0, false);
        new rtp_iterators.$itp_section_iterator_p$UnaryFunction();
        declareFunction(me, "itp_section_iterator_parent", "ITP-SECTION-ITERATOR-PARENT", 1, 0, false);
        declareFunction(me, "itp_section_iterator_span", "ITP-SECTION-ITERATOR-SPAN", 1, 0, false);
        declareFunction(me, "itp_section_iterator_section", "ITP-SECTION-ITERATOR-SECTION", 1, 0, false);
        declareFunction(me, "itp_section_iterator_current", "ITP-SECTION-ITERATOR-CURRENT", 1, 0, false);
        declareFunction(me, "_csetf_itp_section_iterator_parent", "_CSETF-ITP-SECTION-ITERATOR-PARENT", 2, 0, false);
        declareFunction(me, "_csetf_itp_section_iterator_span", "_CSETF-ITP-SECTION-ITERATOR-SPAN", 2, 0, false);
        declareFunction(me, "_csetf_itp_section_iterator_section", "_CSETF-ITP-SECTION-ITERATOR-SECTION", 2, 0, false);
        declareFunction(me, "_csetf_itp_section_iterator_current", "_CSETF-ITP-SECTION-ITERATOR-CURRENT", 2, 0, false);
        declareFunction(me, "make_itp_section_iterator", "MAKE-ITP-SECTION-ITERATOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_itp_section_iterator", "VISIT-DEFSTRUCT-ITP-SECTION-ITERATOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_itp_section_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITP-SECTION-ITERATOR-METHOD", 2, 0, false);
        declareFunction(me, "itp_print_section_iterator", "ITP-PRINT-SECTION-ITERATOR", 3, 0, false);
        declareFunction(me, "itp_child_iterator_print_function_trampoline", "ITP-CHILD-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "itp_child_iterator_p", "ITP-CHILD-ITERATOR-P", 1, 0, false);
        new rtp_iterators.$itp_child_iterator_p$UnaryFunction();
        declareFunction(me, "itp_child_iterator_parent", "ITP-CHILD-ITERATOR-PARENT", 1, 0, false);
        declareFunction(me, "itp_child_iterator_rop_formula", "ITP-CHILD-ITERATOR-ROP-FORMULA", 1, 0, false);
        declareFunction(me, "itp_child_iterator_section", "ITP-CHILD-ITERATOR-SECTION", 1, 0, false);
        declareFunction(me, "_csetf_itp_child_iterator_parent", "_CSETF-ITP-CHILD-ITERATOR-PARENT", 2, 0, false);
        declareFunction(me, "_csetf_itp_child_iterator_rop_formula", "_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA", 2, 0, false);
        declareFunction(me, "_csetf_itp_child_iterator_section", "_CSETF-ITP-CHILD-ITERATOR-SECTION", 2, 0, false);
        declareFunction(me, "make_itp_child_iterator", "MAKE-ITP-CHILD-ITERATOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_itp_child_iterator", "VISIT-DEFSTRUCT-ITP-CHILD-ITERATOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_itp_child_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITP-CHILD-ITERATOR-METHOD", 2, 0, false);
        declareFunction(me, "itp_print_child_iterator", "ITP-PRINT-CHILD-ITERATOR", 3, 0, false);
        declareFunction(me, "new_itp_result_iterator", "NEW-ITP-RESULT-ITERATOR", 1, 2, false);
        declareFunction(me, "determine_parse_result_style", "DETERMINE-PARSE-RESULT-STYLE", 1, 0, false);
        declareFunction(me, "copy_itp_result_iterator", "COPY-ITP-RESULT-ITERATOR", 1, 0, false);
        declareFunction(me, "new_itp_section_iterator", "NEW-ITP-SECTION-ITERATOR", 2, 0, false);
        declareFunction(me, "new_itp_child_iterator", "NEW-ITP-CHILD-ITERATOR", 2, 0, false);
        declareFunction(me, "new_itp_root_children_iterator", "NEW-ITP-ROOT-CHILDREN-ITERATOR", 1, 0, false);
        declareFunction(me, "is_itp_root_children_iteratorP", "IS-ITP-ROOT-CHILDREN-ITERATOR?", 1, 0, false);
        declareFunction(me, "is_equivalent_rtp_child_iteratorP", "IS-EQUIVALENT-RTP-CHILD-ITERATOR?", 2, 0, false);
        declareFunction(me, "itp_result_iterator_reset", "ITP-RESULT-ITERATOR-RESET", 1, 0, false);
        declareFunction(me, "itp_result_iterator_curr", "ITP-RESULT-ITERATOR-CURR", 1, 0, false);
        declareFunction(me, "itp_section_iterator_reset", "ITP-SECTION-ITERATOR-RESET", 1, 0, false);
        declareFunction(me, "itp_section_iterator_curr", "ITP-SECTION-ITERATOR-CURR", 1, 0, false);
        declareFunction(me, "itp_section_iterator_set_curr", "ITP-SECTION-ITERATOR-SET-CURR", 2, 0, false);
        declareFunction(me, "itp_section_iterator_curr_span", "ITP-SECTION-ITERATOR-CURR-SPAN", 1, 0, false);
        declareFunction(me, "itp_section_iterator_curr_cycl", "ITP-SECTION-ITERATOR-CURR-CYCL", 1, 0, false);
        declareFunction(me, "itp_section_iterator_curr_assertion", "ITP-SECTION-ITERATOR-CURR-ASSERTION", 1, 0, false);
        declareFunction(me, "itp_section_iterator_curr_pred", "ITP-SECTION-ITERATOR-CURR-PRED", 1, 0, false);
        declareFunction(me, "itp_section_iterator_curr_cat", "ITP-SECTION-ITERATOR-CURR-CAT", 1, 0, false);
        declareFunction(me, "itp_section_iterator_curr_confidence", "ITP-SECTION-ITERATOR-CURR-CONFIDENCE", 1, 0, false);
        declareFunction(me, "args_from_assertions", "ARGS-FROM-ASSERTIONS", 2, 0, false);
        declareFunction(me, "find_itp_section_iterator", "FIND-ITP-SECTION-ITERATOR", 2, 0, false);
        declareFunction(me, "itp_child_iterator_reset", "ITP-CHILD-ITERATOR-RESET", 1, 0, false);
        declareFunction(me, "itp_child_iterator_curr", "ITP-CHILD-ITERATOR-CURR", 1, 0, false);
        declareFunction(me, "itp_child_iterator_curr_span", "ITP-CHILD-ITERATOR-CURR-SPAN", 1, 0, false);
        declareFunction(me, "itp_child_iterator_curr_cycl", "ITP-CHILD-ITERATOR-CURR-CYCL", 1, 0, false);
        declareFunction(me, "itp_child_iterator_curr_assertion", "ITP-CHILD-ITERATOR-CURR-ASSERTION", 1, 0, false);
        declareFunction(me, "itp_child_iterator_curr_pred", "ITP-CHILD-ITERATOR-CURR-PRED", 1, 0, false);
        declareFunction(me, "itp_child_iterator_curr_cat", "ITP-CHILD-ITERATOR-CURR-CAT", 1, 0, false);
        declareFunction(me, "itp_child_iterator_curr_confidence", "ITP-CHILD-ITERATOR-CURR-CONFIDENCE", 1, 0, false);
        declareFunction(me, "itp_result_iterator_doneP", "ITP-RESULT-ITERATOR-DONE?", 1, 0, false);
        declareFunction(me, "itp_result_iterator_next", "ITP-RESULT-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "itp_result_iterator_prev", "ITP-RESULT-ITERATOR-PREV", 1, 0, false);
        declareFunction(me, "itp_section_iterator_next", "ITP-SECTION-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "itp_section_iterator_prev", "ITP-SECTION-ITERATOR-PREV", 1, 0, false);
        declareFunction(me, "itp_section_iterator_doneP", "ITP-SECTION-ITERATOR-DONE?", 1, 0, false);
        declareFunction(me, "itp_child_iterator_next", "ITP-CHILD-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "itp_child_iterator_prev", "ITP-CHILD-ITERATOR-PREV", 1, 0, false);
        declareFunction(me, "itp_child_iterator_doneP", "ITP-CHILD-ITERATOR-DONE?", 1, 0, false);
        declareFunction(me, "itp_longest_parse_cycls", "ITP-LONGEST-PARSE-CYCLS", 1, 0, false);
        declareFunction(me, "update_itp_result_section_iterator", "UPDATE-ITP-RESULT-SECTION-ITERATOR", 1, 0, false);
        declareFunction(me, "rtp_iterator_print_function_trampoline", "RTP-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rtp_iterator_p", "RTP-ITERATOR-P", 1, 0, false);
        new rtp_iterators.$rtp_iterator_p$UnaryFunction();
        declareFunction(me, "rtp_iterator_string", "RTP-ITERATOR-STRING", 1, 0, false);
        declareFunction(me, "rtp_iterator_parsing_mt", "RTP-ITERATOR-PARSING-MT", 1, 0, false);
        declareFunction(me, "rtp_iterator_semantic_mt", "RTP-ITERATOR-SEMANTIC-MT", 1, 0, false);
        declareFunction(me, "rtp_iterator_strengthenP", "RTP-ITERATOR-STRENGTHEN?", 1, 0, false);
        declareFunction(me, "rtp_iterator_multiple_quantificationsP", "RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?", 1, 0, false);
        declareFunction(me, "rtp_iterator_wff_checkP", "RTP-ITERATOR-WFF-CHECK?", 1, 0, false);
        declareFunction(me, "rtp_iterator_force", "RTP-ITERATOR-FORCE", 1, 0, false);
        declareFunction(me, "rtp_iterator_raw_parses", "RTP-ITERATOR-RAW-PARSES", 1, 0, false);
        declareFunction(me, "rtp_iterator_result_queue", "RTP-ITERATOR-RESULT-QUEUE", 1, 0, false);
        declareFunction(me, "rtp_iterator_initialized", "RTP-ITERATOR-INITIALIZED", 1, 0, false);
        declareFunction(me, "rtp_iterator_template_category", "RTP-ITERATOR-TEMPLATE-CATEGORY", 1, 0, false);
        declareFunction(me, "rtp_iterator_memoization_state", "RTP-ITERATOR-MEMOIZATION-STATE", 1, 0, false);
        declareFunction(me, "rtp_iterator_sbhl_resource", "RTP-ITERATOR-SBHL-RESOURCE", 1, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_string", "_CSETF-RTP-ITERATOR-STRING", 2, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_parsing_mt", "_CSETF-RTP-ITERATOR-PARSING-MT", 2, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_semantic_mt", "_CSETF-RTP-ITERATOR-SEMANTIC-MT", 2, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_strengthenP", "_CSETF-RTP-ITERATOR-STRENGTHEN?", 2, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_multiple_quantificationsP", "_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?", 2, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_wff_checkP", "_CSETF-RTP-ITERATOR-WFF-CHECK?", 2, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_force", "_CSETF-RTP-ITERATOR-FORCE", 2, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_raw_parses", "_CSETF-RTP-ITERATOR-RAW-PARSES", 2, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_result_queue", "_CSETF-RTP-ITERATOR-RESULT-QUEUE", 2, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_initialized", "_CSETF-RTP-ITERATOR-INITIALIZED", 2, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_template_category", "_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY", 2, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_memoization_state", "_CSETF-RTP-ITERATOR-MEMOIZATION-STATE", 2, 0, false);
        declareFunction(me, "_csetf_rtp_iterator_sbhl_resource", "_CSETF-RTP-ITERATOR-SBHL-RESOURCE", 2, 0, false);
        declareFunction(me, "make_rtp_iterator", "MAKE-RTP-ITERATOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_rtp_iterator", "VISIT-DEFSTRUCT-RTP-ITERATOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rtp_iterator_method", "VISIT-DEFSTRUCT-OBJECT-RTP-ITERATOR-METHOD", 2, 0, false);
        declareFunction(me, "new_rtp_iterator", "NEW-RTP-ITERATOR", 1, 1, false);
        declareFunction(me, "new_rtp_iterator_state", "NEW-RTP-ITERATOR-STATE", 1, 1, false);
        declareFunction(me, "rtp_iter_cat_for_force", "RTP-ITER-CAT-FOR-FORCE", 1, 0, false);
        declareFunction(me, "rtp_iterator_done", "RTP-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "rtp_iterator_reformulate_one_parse", "RTP-ITERATOR-REFORMULATE-ONE-PARSE", 1, 0, false);
        declareFunction(me, "rtp_iterator_add_raw_parse", "RTP-ITERATOR-ADD-RAW-PARSE", 1, 0, false);
        declareFunction(me, "rtp_iterator_next", "RTP-ITERATOR-NEXT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rtp_iterators_file() {
        defconstant("*DTP-ITP-RESULT-ITERATOR*", ITP_RESULT_ITERATOR);
        defconstant("*DTP-ITP-SECTION-ITERATOR*", ITP_SECTION_ITERATOR);
        defconstant("*DTP-ITP-CHILD-ITERATOR*", ITP_CHILD_ITERATOR);
        defconstant("*DTP-RTP-ITERATOR*", RTP_ITERATOR);
        return NIL;
    }

    public static SubLObject setup_rtp_iterators_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_itp_result_iterator$.getGlobalValue(), symbol_function(ITP_RESULT_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(ITP_RESULT_ITERATOR_STYLE, _CSETF_ITP_RESULT_ITERATOR_STYLE);
        def_csetf(ITP_RESULT_ITERATOR_PARSES, _CSETF_ITP_RESULT_ITERATOR_PARSES);
        def_csetf(ITP_RESULT_ITERATOR_SPAN, _CSETF_ITP_RESULT_ITERATOR_SPAN);
        def_csetf(ITP_RESULT_ITERATOR_SECTION_ITERATOR, _CSETF_ITP_RESULT_ITERATOR_SECTION_ITERATOR);
        identity(ITP_RESULT_ITERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_itp_result_iterator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ITP_RESULT_ITERATOR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_itp_section_iterator$.getGlobalValue(), symbol_function(ITP_SECTION_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list35);
        def_csetf(ITP_SECTION_ITERATOR_PARENT, _CSETF_ITP_SECTION_ITERATOR_PARENT);
        def_csetf(ITP_SECTION_ITERATOR_SPAN, _CSETF_ITP_SECTION_ITERATOR_SPAN);
        def_csetf(ITP_SECTION_ITERATOR_SECTION, _CSETF_ITP_SECTION_ITERATOR_SECTION);
        def_csetf(ITP_SECTION_ITERATOR_CURRENT, _CSETF_ITP_SECTION_ITERATOR_CURRENT);
        identity(ITP_SECTION_ITERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_itp_section_iterator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ITP_SECTION_ITERATOR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_itp_child_iterator$.getGlobalValue(), symbol_function(ITP_CHILD_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list58);
        def_csetf(ITP_CHILD_ITERATOR_PARENT, _CSETF_ITP_CHILD_ITERATOR_PARENT);
        def_csetf(ITP_CHILD_ITERATOR_ROP_FORMULA, _CSETF_ITP_CHILD_ITERATOR_ROP_FORMULA);
        def_csetf(ITP_CHILD_ITERATOR_SECTION, _CSETF_ITP_CHILD_ITERATOR_SECTION);
        identity(ITP_CHILD_ITERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_itp_child_iterator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ITP_CHILD_ITERATOR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rtp_iterator$.getGlobalValue(), symbol_function(RTP_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list82);
        def_csetf(RTP_ITERATOR_STRING, _CSETF_RTP_ITERATOR_STRING);
        def_csetf(RTP_ITERATOR_PARSING_MT, _CSETF_RTP_ITERATOR_PARSING_MT);
        def_csetf(RTP_ITERATOR_SEMANTIC_MT, _CSETF_RTP_ITERATOR_SEMANTIC_MT);
        def_csetf($sym89$RTP_ITERATOR_STRENGTHEN_, $sym90$_CSETF_RTP_ITERATOR_STRENGTHEN_);
        def_csetf($sym91$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_, $sym92$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_);
        def_csetf($sym93$RTP_ITERATOR_WFF_CHECK_, $sym94$_CSETF_RTP_ITERATOR_WFF_CHECK_);
        def_csetf(RTP_ITERATOR_FORCE, _CSETF_RTP_ITERATOR_FORCE);
        def_csetf(RTP_ITERATOR_RAW_PARSES, _CSETF_RTP_ITERATOR_RAW_PARSES);
        def_csetf(RTP_ITERATOR_RESULT_QUEUE, _CSETF_RTP_ITERATOR_RESULT_QUEUE);
        def_csetf(RTP_ITERATOR_INITIALIZED, _CSETF_RTP_ITERATOR_INITIALIZED);
        def_csetf(RTP_ITERATOR_TEMPLATE_CATEGORY, _CSETF_RTP_ITERATOR_TEMPLATE_CATEGORY);
        def_csetf(RTP_ITERATOR_MEMOIZATION_STATE, _CSETF_RTP_ITERATOR_MEMOIZATION_STATE);
        def_csetf(RTP_ITERATOR_SBHL_RESOURCE, _CSETF_RTP_ITERATOR_SBHL_RESOURCE);
        identity(RTP_ITERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rtp_iterator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RTP_ITERATOR_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rtp_iterators_file();
    }

    @Override
    public void initializeVariables() {
        init_rtp_iterators_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rtp_iterators_file();
    }

    

    public static final class $itp_result_iterator_native extends SubLStructNative {
        public SubLObject $style;

        public SubLObject $parses;

        public SubLObject $span;

        public SubLObject $section_iterator;

        private static final SubLStructDeclNative structDecl;

        private $itp_result_iterator_native() {
            this.$style = Lisp.NIL;
            this.$parses = Lisp.NIL;
            this.$span = Lisp.NIL;
            this.$section_iterator = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$style;
        }

        @Override
        public SubLObject getField3() {
            return this.$parses;
        }

        @Override
        public SubLObject getField4() {
            return this.$span;
        }

        @Override
        public SubLObject getField5() {
            return this.$section_iterator;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$style = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$parses = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$span = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$section_iterator = value;
        }

        static {
            structDecl = makeStructDeclNative($itp_result_iterator_native.class, ITP_RESULT_ITERATOR, ITP_RESULT_ITERATOR_P, $list2, $list3, new String[]{ "$style", "$parses", "$span", "$section_iterator" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $itp_result_iterator_p$UnaryFunction extends UnaryFunction {
        public $itp_result_iterator_p$UnaryFunction() {
            super(extractFunctionNamed("ITP-RESULT-ITERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return itp_result_iterator_p(arg1);
        }
    }

    public static final class $itp_section_iterator_native extends SubLStructNative {
        public SubLObject $parent;

        public SubLObject $span;

        public SubLObject $section;

        public SubLObject $current;

        private static final SubLStructDeclNative structDecl;

        private $itp_section_iterator_native() {
            this.$parent = Lisp.NIL;
            this.$span = Lisp.NIL;
            this.$section = Lisp.NIL;
            this.$current = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$parent;
        }

        @Override
        public SubLObject getField3() {
            return this.$span;
        }

        @Override
        public SubLObject getField4() {
            return this.$section;
        }

        @Override
        public SubLObject getField5() {
            return this.$current;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$parent = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$span = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$section = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$current = value;
        }

        static {
            structDecl = makeStructDeclNative($itp_section_iterator_native.class, ITP_SECTION_ITERATOR, ITP_SECTION_ITERATOR_P, $list29, $list30, new String[]{ "$parent", "$span", "$section", "$current" }, $list31, $list32, ITP_PRINT_SECTION_ITERATOR);
        }
    }

    public static final class $itp_section_iterator_p$UnaryFunction extends UnaryFunction {
        public $itp_section_iterator_p$UnaryFunction() {
            super(extractFunctionNamed("ITP-SECTION-ITERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return itp_section_iterator_p(arg1);
        }
    }

    public static final class $itp_child_iterator_native extends SubLStructNative {
        public SubLObject $parent;

        public SubLObject $rop_formula;

        public SubLObject $section;

        private static final SubLStructDeclNative structDecl;

        private $itp_child_iterator_native() {
            this.$parent = Lisp.NIL;
            this.$rop_formula = Lisp.NIL;
            this.$section = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$parent;
        }

        @Override
        public SubLObject getField3() {
            return this.$rop_formula;
        }

        @Override
        public SubLObject getField4() {
            return this.$section;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$parent = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$rop_formula = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$section = value;
        }

        static {
            structDecl = makeStructDeclNative($itp_child_iterator_native.class, ITP_CHILD_ITERATOR, ITP_CHILD_ITERATOR_P, $list52, $list53, new String[]{ "$parent", "$rop_formula", "$section" }, $list54, $list55, ITP_PRINT_CHILD_ITERATOR);
        }
    }

    public static final class $itp_child_iterator_p$UnaryFunction extends UnaryFunction {
        public $itp_child_iterator_p$UnaryFunction() {
            super(extractFunctionNamed("ITP-CHILD-ITERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return itp_child_iterator_p(arg1);
        }
    }

    public static final class $rtp_iterator_native extends SubLStructNative {
        public SubLObject $string;

        public SubLObject $parsing_mt;

        public SubLObject $semantic_mt;

        public SubLObject $strengthenP;

        public SubLObject $multiple_quantificationsP;

        public SubLObject $wff_checkP;

        public SubLObject $force;

        public SubLObject $raw_parses;

        public SubLObject $result_queue;

        public SubLObject $initialized;

        public SubLObject $template_category;

        public SubLObject $memoization_state;

        public SubLObject $sbhl_resource;

        private static final SubLStructDeclNative structDecl;

        private $rtp_iterator_native() {
            this.$string = Lisp.NIL;
            this.$parsing_mt = Lisp.NIL;
            this.$semantic_mt = Lisp.NIL;
            this.$strengthenP = Lisp.NIL;
            this.$multiple_quantificationsP = Lisp.NIL;
            this.$wff_checkP = Lisp.NIL;
            this.$force = Lisp.NIL;
            this.$raw_parses = Lisp.NIL;
            this.$result_queue = Lisp.NIL;
            this.$initialized = Lisp.NIL;
            this.$template_category = Lisp.NIL;
            this.$memoization_state = Lisp.NIL;
            this.$sbhl_resource = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$string;
        }

        @Override
        public SubLObject getField3() {
            return this.$parsing_mt;
        }

        @Override
        public SubLObject getField4() {
            return this.$semantic_mt;
        }

        @Override
        public SubLObject getField5() {
            return this.$strengthenP;
        }

        @Override
        public SubLObject getField6() {
            return this.$multiple_quantificationsP;
        }

        @Override
        public SubLObject getField7() {
            return this.$wff_checkP;
        }

        @Override
        public SubLObject getField8() {
            return this.$force;
        }

        @Override
        public SubLObject getField9() {
            return this.$raw_parses;
        }

        @Override
        public SubLObject getField10() {
            return this.$result_queue;
        }

        @Override
        public SubLObject getField11() {
            return this.$initialized;
        }

        @Override
        public SubLObject getField12() {
            return this.$template_category;
        }

        @Override
        public SubLObject getField13() {
            return this.$memoization_state;
        }

        @Override
        public SubLObject getField14() {
            return this.$sbhl_resource;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$string = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$parsing_mt = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$semantic_mt = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$strengthenP = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$multiple_quantificationsP = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$wff_checkP = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$force = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$raw_parses = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$result_queue = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$initialized = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$template_category = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$memoization_state = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$sbhl_resource = value;
        }

        static {
            structDecl = makeStructDeclNative($rtp_iterator_native.class, RTP_ITERATOR, RTP_ITERATOR_P, $list77, $list78, new String[]{ "$string", "$parsing_mt", "$semantic_mt", "$strengthenP", "$multiple_quantificationsP", "$wff_checkP", "$force", "$raw_parses", "$result_queue", "$initialized", "$template_category", "$memoization_state", "$sbhl_resource" }, $list79, $list80, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $rtp_iterator_p$UnaryFunction extends UnaryFunction {
        public $rtp_iterator_p$UnaryFunction() {
            super(extractFunctionNamed("RTP-ITERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_iterator_p(arg1);
        }
    }
}

/**
 * Total time: 317 ms
 */
