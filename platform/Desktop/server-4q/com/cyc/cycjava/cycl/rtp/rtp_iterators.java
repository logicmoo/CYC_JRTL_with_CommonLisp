package com.cyc.cycjava.cycl.rtp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.cycjava.cycl.rkf_text_processors;
import com.cyc.cycjava.cycl.rkf_formula_optimizer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rtp_iterators extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_iterators";
    public static final String myFingerPrint = "4775715ee1182f9b7818218cd244b5c984c02da7195afa9511c15b5a43c1602a";
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLSymbol $dtp_itp_result_iterator$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLSymbol $dtp_itp_section_iterator$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
    public static SubLSymbol $dtp_itp_child_iterator$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLSymbol $dtp_rtp_iterator$;
    private static final SubLSymbol $sym0$ITP_RESULT_ITERATOR;
    private static final SubLSymbol $sym1$ITP_RESULT_ITERATOR_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$ITP_RESULT_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$ITP_RESULT_ITERATOR_STYLE;
    private static final SubLSymbol $sym10$_CSETF_ITP_RESULT_ITERATOR_STYLE;
    private static final SubLSymbol $sym11$ITP_RESULT_ITERATOR_PARSES;
    private static final SubLSymbol $sym12$_CSETF_ITP_RESULT_ITERATOR_PARSES;
    private static final SubLSymbol $sym13$ITP_RESULT_ITERATOR_SPAN;
    private static final SubLSymbol $sym14$_CSETF_ITP_RESULT_ITERATOR_SPAN;
    private static final SubLSymbol $sym15$ITP_RESULT_ITERATOR_SECTION_ITERATOR;
    private static final SubLSymbol $sym16$_CSETF_ITP_RESULT_ITERATOR_SECTION_ITERATOR;
    private static final SubLSymbol $kw17$STYLE;
    private static final SubLSymbol $kw18$PARSES;
    private static final SubLSymbol $kw19$SPAN;
    private static final SubLSymbol $kw20$SECTION_ITERATOR;
    private static final SubLString $str21$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw22$BEGIN;
    private static final SubLSymbol $sym23$MAKE_ITP_RESULT_ITERATOR;
    private static final SubLSymbol $kw24$SLOT;
    private static final SubLSymbol $kw25$END;
    private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_ITP_RESULT_ITERATOR_METHOD;
    private static final SubLSymbol $sym27$ITP_SECTION_ITERATOR;
    private static final SubLSymbol $sym28$ITP_SECTION_ITERATOR_P;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$ITP_PRINT_SECTION_ITERATOR;
    private static final SubLSymbol $sym34$ITP_SECTION_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$ITP_SECTION_ITERATOR_PARENT;
    private static final SubLSymbol $sym37$_CSETF_ITP_SECTION_ITERATOR_PARENT;
    private static final SubLSymbol $sym38$ITP_SECTION_ITERATOR_SPAN;
    private static final SubLSymbol $sym39$_CSETF_ITP_SECTION_ITERATOR_SPAN;
    private static final SubLSymbol $sym40$ITP_SECTION_ITERATOR_SECTION;
    private static final SubLSymbol $sym41$_CSETF_ITP_SECTION_ITERATOR_SECTION;
    private static final SubLSymbol $sym42$ITP_SECTION_ITERATOR_CURRENT;
    private static final SubLSymbol $sym43$_CSETF_ITP_SECTION_ITERATOR_CURRENT;
    private static final SubLSymbol $kw44$PARENT;
    private static final SubLSymbol $kw45$SECTION;
    private static final SubLSymbol $kw46$CURRENT;
    private static final SubLSymbol $sym47$MAKE_ITP_SECTION_ITERATOR;
    private static final SubLSymbol $sym48$VISIT_DEFSTRUCT_OBJECT_ITP_SECTION_ITERATOR_METHOD;
    private static final SubLString $str49$_ITP_SECTION___S_;
    private static final SubLSymbol $sym50$ITP_CHILD_ITERATOR;
    private static final SubLSymbol $sym51$ITP_CHILD_ITERATOR_P;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$ITP_PRINT_CHILD_ITERATOR;
    private static final SubLSymbol $sym57$ITP_CHILD_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$ITP_CHILD_ITERATOR_PARENT;
    private static final SubLSymbol $sym60$_CSETF_ITP_CHILD_ITERATOR_PARENT;
    private static final SubLSymbol $sym61$ITP_CHILD_ITERATOR_ROP_FORMULA;
    private static final SubLSymbol $sym62$_CSETF_ITP_CHILD_ITERATOR_ROP_FORMULA;
    private static final SubLSymbol $sym63$ITP_CHILD_ITERATOR_SECTION;
    private static final SubLSymbol $sym64$_CSETF_ITP_CHILD_ITERATOR_SECTION;
    private static final SubLSymbol $kw65$ROP_FORMULA;
    private static final SubLSymbol $sym66$MAKE_ITP_CHILD_ITERATOR;
    private static final SubLSymbol $sym67$VISIT_DEFSTRUCT_OBJECT_ITP_CHILD_ITERATOR_METHOD;
    private static final SubLString $str68$_ITP_CHILD___S_;
    private static final SubLSymbol $kw69$SIMPLE;
    private static final SubLSymbol $sym70$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const71$EverythingPSC;
    private static final SubLSymbol $kw72$RANKED;
    private static final SubLSymbol $kw73$ASSERTION;
    private static final SubLSymbol $kw74$UNAVAILABLE;
    private static final SubLSymbol $sym75$RTP_ITERATOR;
    private static final SubLSymbol $sym76$RTP_ITERATOR_P;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$RTP_ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$RTP_ITERATOR_STRING;
    private static final SubLSymbol $sym84$_CSETF_RTP_ITERATOR_STRING;
    private static final SubLSymbol $sym85$RTP_ITERATOR_PARSING_MT;
    private static final SubLSymbol $sym86$_CSETF_RTP_ITERATOR_PARSING_MT;
    private static final SubLSymbol $sym87$RTP_ITERATOR_SEMANTIC_MT;
    private static final SubLSymbol $sym88$_CSETF_RTP_ITERATOR_SEMANTIC_MT;
    private static final SubLSymbol $sym89$RTP_ITERATOR_STRENGTHEN_;
    private static final SubLSymbol $sym90$_CSETF_RTP_ITERATOR_STRENGTHEN_;
    private static final SubLSymbol $sym91$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_;
    private static final SubLSymbol $sym92$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_;
    private static final SubLSymbol $sym93$RTP_ITERATOR_WFF_CHECK_;
    private static final SubLSymbol $sym94$_CSETF_RTP_ITERATOR_WFF_CHECK_;
    private static final SubLSymbol $sym95$RTP_ITERATOR_FORCE;
    private static final SubLSymbol $sym96$_CSETF_RTP_ITERATOR_FORCE;
    private static final SubLSymbol $sym97$RTP_ITERATOR_RAW_PARSES;
    private static final SubLSymbol $sym98$_CSETF_RTP_ITERATOR_RAW_PARSES;
    private static final SubLSymbol $sym99$RTP_ITERATOR_RESULT_QUEUE;
    private static final SubLSymbol $sym100$_CSETF_RTP_ITERATOR_RESULT_QUEUE;
    private static final SubLSymbol $sym101$RTP_ITERATOR_INITIALIZED;
    private static final SubLSymbol $sym102$_CSETF_RTP_ITERATOR_INITIALIZED;
    private static final SubLSymbol $sym103$RTP_ITERATOR_TEMPLATE_CATEGORY;
    private static final SubLSymbol $sym104$_CSETF_RTP_ITERATOR_TEMPLATE_CATEGORY;
    private static final SubLSymbol $sym105$RTP_ITERATOR_MEMOIZATION_STATE;
    private static final SubLSymbol $sym106$_CSETF_RTP_ITERATOR_MEMOIZATION_STATE;
    private static final SubLSymbol $sym107$RTP_ITERATOR_SBHL_RESOURCE;
    private static final SubLSymbol $sym108$_CSETF_RTP_ITERATOR_SBHL_RESOURCE;
    private static final SubLSymbol $kw109$STRING;
    private static final SubLSymbol $kw110$PARSING_MT;
    private static final SubLSymbol $kw111$SEMANTIC_MT;
    private static final SubLSymbol $kw112$STRENGTHEN_;
    private static final SubLSymbol $kw113$MULTIPLE_QUANTIFICATIONS_;
    private static final SubLSymbol $kw114$WFF_CHECK_;
    private static final SubLSymbol $kw115$FORCE;
    private static final SubLSymbol $kw116$RAW_PARSES;
    private static final SubLSymbol $kw117$RESULT_QUEUE;
    private static final SubLSymbol $kw118$INITIALIZED;
    private static final SubLSymbol $kw119$TEMPLATE_CATEGORY;
    private static final SubLSymbol $kw120$MEMOIZATION_STATE;
    private static final SubLSymbol $kw121$SBHL_RESOURCE;
    private static final SubLSymbol $sym122$MAKE_RTP_ITERATOR;
    private static final SubLSymbol $sym123$VISIT_DEFSTRUCT_OBJECT_RTP_ITERATOR_METHOD;
    private static final SubLSymbol $sym124$RTP_ITERATOR_DONE;
    private static final SubLSymbol $sym125$RTP_ITERATOR_NEXT;
    private static final SubLObject $const126$RKFParsingMt;
    private static final SubLSymbol $kw127$DECLARATIVE;
    private static final SubLObject $const128$STemplate;
    private static final SubLSymbol $kw129$QUERY;
    private static final SubLObject $const130$QuestionTemplate;
    private static final SubLSymbol $kw131$QUESTION;
    private static final SubLSymbol $sym132$EL_WFF_;
    private static final SubLSymbol $kw133$FAILURE;
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject itp_result_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rtp_iterators.ZERO_INTEGER);
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject itp_result_iterator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $itp_result_iterator_native.class) ? rtp_iterators.T : rtp_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject itp_result_iterator_style(final SubLObject v_object) {
        assert rtp_iterators.NIL != itp_result_iterator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject itp_result_iterator_parses(final SubLObject v_object) {
        assert rtp_iterators.NIL != itp_result_iterator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject itp_result_iterator_span(final SubLObject v_object) {
        assert rtp_iterators.NIL != itp_result_iterator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject itp_result_iterator_section_iterator(final SubLObject v_object) {
        assert rtp_iterators.NIL != itp_result_iterator_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject _csetf_itp_result_iterator_style(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != itp_result_iterator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject _csetf_itp_result_iterator_parses(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != itp_result_iterator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject _csetf_itp_result_iterator_span(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != itp_result_iterator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject _csetf_itp_result_iterator_section_iterator(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != itp_result_iterator_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject make_itp_result_iterator(SubLObject arglist) {
        if (arglist == rtp_iterators.UNPROVIDED) {
            arglist = (SubLObject)rtp_iterators.NIL;
        }
        final SubLObject v_new = (SubLObject)new $itp_result_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rtp_iterators.NIL, next = arglist; rtp_iterators.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rtp_iterators.$kw17$STYLE)) {
                _csetf_itp_result_iterator_style(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw18$PARSES)) {
                _csetf_itp_result_iterator_parses(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw19$SPAN)) {
                _csetf_itp_result_iterator_span(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw20$SECTION_ITERATOR)) {
                _csetf_itp_result_iterator_section_iterator(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rtp_iterators.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject visit_defstruct_itp_result_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw22$BEGIN, (SubLObject)rtp_iterators.$sym23$MAKE_ITP_RESULT_ITERATOR, (SubLObject)rtp_iterators.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw17$STYLE, itp_result_iterator_style(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw18$PARSES, itp_result_iterator_parses(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw19$SPAN, itp_result_iterator_span(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw20$SECTION_ITERATOR, itp_result_iterator_section_iterator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw25$END, (SubLObject)rtp_iterators.$sym23$MAKE_ITP_RESULT_ITERATOR, (SubLObject)rtp_iterators.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1577L)
    public static SubLObject visit_defstruct_object_itp_result_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_itp_result_iterator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject itp_section_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        itp_print_section_iterator(v_object, stream, (SubLObject)rtp_iterators.ZERO_INTEGER);
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject itp_section_iterator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $itp_section_iterator_native.class) ? rtp_iterators.T : rtp_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject itp_section_iterator_parent(final SubLObject v_object) {
        assert rtp_iterators.NIL != itp_section_iterator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject itp_section_iterator_span(final SubLObject v_object) {
        assert rtp_iterators.NIL != itp_section_iterator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject itp_section_iterator_section(final SubLObject v_object) {
        assert rtp_iterators.NIL != itp_section_iterator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject itp_section_iterator_current(final SubLObject v_object) {
        assert rtp_iterators.NIL != itp_section_iterator_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject _csetf_itp_section_iterator_parent(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != itp_section_iterator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject _csetf_itp_section_iterator_span(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != itp_section_iterator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject _csetf_itp_section_iterator_section(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != itp_section_iterator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject _csetf_itp_section_iterator_current(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != itp_section_iterator_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject make_itp_section_iterator(SubLObject arglist) {
        if (arglist == rtp_iterators.UNPROVIDED) {
            arglist = (SubLObject)rtp_iterators.NIL;
        }
        final SubLObject v_new = (SubLObject)new $itp_section_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rtp_iterators.NIL, next = arglist; rtp_iterators.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rtp_iterators.$kw44$PARENT)) {
                _csetf_itp_section_iterator_parent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw19$SPAN)) {
                _csetf_itp_section_iterator_span(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw45$SECTION)) {
                _csetf_itp_section_iterator_section(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw46$CURRENT)) {
                _csetf_itp_section_iterator_current(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rtp_iterators.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject visit_defstruct_itp_section_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw22$BEGIN, (SubLObject)rtp_iterators.$sym47$MAKE_ITP_SECTION_ITERATOR, (SubLObject)rtp_iterators.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw44$PARENT, itp_section_iterator_parent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw19$SPAN, itp_section_iterator_span(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw45$SECTION, itp_section_iterator_section(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw46$CURRENT, itp_section_iterator_current(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw25$END, (SubLObject)rtp_iterators.$sym47$MAKE_ITP_SECTION_ITERATOR, (SubLObject)rtp_iterators.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 1861L)
    public static SubLObject visit_defstruct_object_itp_section_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_itp_section_iterator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2200L)
    public static SubLObject itp_print_section_iterator(final SubLObject entry, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)rtp_iterators.$str49$_ITP_SECTION___S_, itp_section_iterator_span(entry));
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
    public static SubLObject itp_child_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        itp_print_child_iterator(v_object, stream, (SubLObject)rtp_iterators.ZERO_INTEGER);
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
    public static SubLObject itp_child_iterator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $itp_child_iterator_native.class) ? rtp_iterators.T : rtp_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
    public static SubLObject itp_child_iterator_parent(final SubLObject v_object) {
        assert rtp_iterators.NIL != itp_child_iterator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
    public static SubLObject itp_child_iterator_rop_formula(final SubLObject v_object) {
        assert rtp_iterators.NIL != itp_child_iterator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
    public static SubLObject itp_child_iterator_section(final SubLObject v_object) {
        assert rtp_iterators.NIL != itp_child_iterator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
    public static SubLObject _csetf_itp_child_iterator_parent(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != itp_child_iterator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
    public static SubLObject _csetf_itp_child_iterator_rop_formula(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != itp_child_iterator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
    public static SubLObject _csetf_itp_child_iterator_section(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != itp_child_iterator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
    public static SubLObject make_itp_child_iterator(SubLObject arglist) {
        if (arglist == rtp_iterators.UNPROVIDED) {
            arglist = (SubLObject)rtp_iterators.NIL;
        }
        final SubLObject v_new = (SubLObject)new $itp_child_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rtp_iterators.NIL, next = arglist; rtp_iterators.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rtp_iterators.$kw44$PARENT)) {
                _csetf_itp_child_iterator_parent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw65$ROP_FORMULA)) {
                _csetf_itp_child_iterator_rop_formula(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw45$SECTION)) {
                _csetf_itp_child_iterator_section(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rtp_iterators.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
    public static SubLObject visit_defstruct_itp_child_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw22$BEGIN, (SubLObject)rtp_iterators.$sym66$MAKE_ITP_CHILD_ITERATOR, (SubLObject)rtp_iterators.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw44$PARENT, itp_child_iterator_parent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw65$ROP_FORMULA, itp_child_iterator_rop_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw45$SECTION, itp_child_iterator_section(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw25$END, (SubLObject)rtp_iterators.$sym66$MAKE_ITP_CHILD_ITERATOR, (SubLObject)rtp_iterators.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2372L)
    public static SubLObject visit_defstruct_object_itp_child_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_itp_child_iterator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2707L)
    public static SubLObject itp_print_child_iterator(final SubLObject entry, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)rtp_iterators.$str68$_ITP_CHILD___S_, itp_child_iterator_rop_formula(entry));
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 2889L)
    public static SubLObject new_itp_result_iterator(final SubLObject parses, SubLObject style, SubLObject string) {
        if (style == rtp_iterators.UNPROVIDED) {
            style = (SubLObject)rtp_iterators.NIL;
        }
        if (string == rtp_iterators.UNPROVIDED) {
            string = (SubLObject)rtp_iterators.NIL;
        }
        final SubLObject iterator = make_itp_result_iterator((SubLObject)rtp_iterators.UNPROVIDED);
        if (rtp_iterators.NIL == style) {
            style = determine_parse_result_style(parses);
        }
        _csetf_itp_result_iterator_style(iterator, style);
        _csetf_itp_result_iterator_parses(iterator, parses);
        itp_result_iterator_reset(iterator);
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 3305L)
    public static SubLObject determine_parse_result_style(final SubLObject parses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject first_span_set = conses_high.second(parses.first());
        final SubLObject first_parse = first_span_set.first();
        SubLObject result = (SubLObject)rtp_iterators.$kw69$SIMPLE;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rtp_iterators.$sym70$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rtp_iterators.$const71$EverythingPSC, thread);
            if (rtp_iterators.NIL != rtp_constituent_weeders.itp_semantics_p(first_parse)) {
                result = (SubLObject)rtp_iterators.$kw72$RANKED;
            }
            else if (first_parse.isList() && rtp_iterators.NIL != assertion_handles.assertion_p(conses_high.second(first_parse))) {
                result = (SubLObject)rtp_iterators.$kw73$ASSERTION;
            }
            else if (first_parse.isList() && conses_high.second(first_parse).isList() && rtp_iterators.NIL != assertion_handles.assertion_p(conses_high.second(first_parse).first())) {
                result = (SubLObject)rtp_iterators.$kw73$ASSERTION;
            }
            else {
                result = (SubLObject)rtp_iterators.$kw69$SIMPLE;
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 3882L)
    public static SubLObject copy_itp_result_iterator(final SubLObject result_iterator) {
        final SubLObject result = make_itp_result_iterator((SubLObject)rtp_iterators.UNPROVIDED);
        _csetf_itp_result_iterator_style(result, itp_result_iterator_style(result_iterator));
        _csetf_itp_result_iterator_parses(result, itp_result_iterator_parses(result_iterator));
        _csetf_itp_result_iterator_span(result, itp_result_iterator_span(result_iterator));
        _csetf_itp_result_iterator_section_iterator(result, itp_result_iterator_section_iterator(result_iterator));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 4412L)
    public static SubLObject new_itp_section_iterator(final SubLObject parent, final SubLObject span) {
        final SubLObject iterator = make_itp_section_iterator((SubLObject)rtp_iterators.UNPROVIDED);
        _csetf_itp_section_iterator_parent(iterator, parent);
        final SubLObject the_span = span.first();
        final SubLObject the_section = conses_high.second(span);
        _csetf_itp_section_iterator_span(iterator, the_span);
        _csetf_itp_section_iterator_section(iterator, the_section);
        itp_section_iterator_reset(iterator);
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 4847L)
    public static SubLObject new_itp_child_iterator(final SubLObject parent, final SubLObject rop_formula) {
        final SubLObject iterator = make_itp_child_iterator((SubLObject)rtp_iterators.UNPROVIDED);
        _csetf_itp_child_iterator_parent(iterator, parent);
        _csetf_itp_child_iterator_rop_formula(iterator, rop_formula);
        final SubLObject span = parsing_utilities.result_of_parsing_span_wXo_thelist(rop_formula);
        _csetf_itp_child_iterator_section(iterator, find_itp_section_iterator(parent, span));
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 5273L)
    public static SubLObject new_itp_root_children_iterator(final SubLObject parent) {
        final SubLObject iterator = make_itp_child_iterator((SubLObject)rtp_iterators.UNPROVIDED);
        _csetf_itp_child_iterator_parent(iterator, parent);
        _csetf_itp_child_iterator_section(iterator, itp_result_iterator_curr(parent));
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 5548L)
    public static SubLObject is_itp_root_children_iteratorP(final SubLObject iterator) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_iterators.NIL != itp_child_iterator_p(iterator) && rtp_iterators.NIL == itp_child_iterator_rop_formula(iterator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 5717L)
    public static SubLObject is_equivalent_rtp_child_iteratorP(final SubLObject iterator_1, final SubLObject iterator_2) {
        return Equality.equalp(itp_child_iterator_rop_formula(iterator_1), itp_child_iterator_rop_formula(iterator_2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 5970L)
    public static SubLObject itp_result_iterator_reset(final SubLObject iterator) {
        final SubLObject span = itp_result_iterator_parses(iterator);
        _csetf_itp_result_iterator_span(iterator, span);
        return update_itp_result_section_iterator(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 6234L)
    public static SubLObject itp_result_iterator_curr(final SubLObject iterator) {
        return itp_result_iterator_section_iterator(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 6343L)
    public static SubLObject itp_section_iterator_reset(final SubLObject iterator) {
        final SubLObject current = itp_section_iterator_section(iterator);
        _csetf_itp_section_iterator_current(iterator, current);
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 6539L)
    public static SubLObject itp_section_iterator_curr(final SubLObject iterator) {
        return itp_section_iterator_current(iterator).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 6735L)
    public static SubLObject itp_section_iterator_set_curr(final SubLObject iterator, final SubLObject element) {
        ConsesLow.rplaca(itp_section_iterator_current(iterator), element);
        return element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 6876L)
    public static SubLObject itp_section_iterator_curr_span(final SubLObject iterator) {
        return itp_section_iterator_span(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 6980L)
    public static SubLObject itp_section_iterator_curr_cycl(final SubLObject iterator) {
        final SubLObject pcase_var = itp_result_iterator_style(itp_section_iterator_parent(iterator));
        if (pcase_var.eql((SubLObject)rtp_iterators.$kw69$SIMPLE)) {
            return itp_section_iterator_curr(iterator);
        }
        if (pcase_var.eql((SubLObject)rtp_iterators.$kw73$ASSERTION)) {
            return itp_section_iterator_curr(iterator).first();
        }
        if (pcase_var.eql((SubLObject)rtp_iterators.$kw72$RANKED)) {
            return rtp_constituent_weeders.itp_semantics_cycl(itp_section_iterator_curr(iterator));
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 7338L)
    public static SubLObject itp_section_iterator_curr_assertion(final SubLObject iterator) {
        final SubLObject pcase_var = itp_result_iterator_style(itp_section_iterator_parent(iterator));
        if (pcase_var.eql((SubLObject)rtp_iterators.$kw73$ASSERTION)) {
            return conses_high.second(itp_section_iterator_curr(iterator));
        }
        if (pcase_var.eql((SubLObject)rtp_iterators.$kw72$RANKED)) {
            return rtp_constituent_weeders.itp_semantics_supports(itp_section_iterator_curr(iterator));
        }
        return (SubLObject)rtp_iterators.$kw74$UNAVAILABLE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 7671L)
    public static SubLObject itp_section_iterator_curr_pred(final SubLObject iterator) {
        final SubLObject pcase_var = itp_result_iterator_style(itp_section_iterator_parent(iterator));
        if (pcase_var.eql((SubLObject)rtp_iterators.$kw69$SIMPLE)) {
            return (SubLObject)rtp_iterators.$kw74$UNAVAILABLE;
        }
        if (pcase_var.eql((SubLObject)rtp_iterators.$kw73$ASSERTION)) {
            return args_from_assertions((SubLObject)rtp_iterators.ZERO_INTEGER, itp_section_iterator_curr_assertion(iterator));
        }
        if (pcase_var.eql((SubLObject)rtp_iterators.$kw72$RANKED)) {
            return rtp_constituent_weeders.itp_semantics_force(itp_section_iterator_curr(iterator));
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 8028L)
    public static SubLObject itp_section_iterator_curr_cat(final SubLObject iterator) {
        final SubLObject pcase_var = itp_result_iterator_style(itp_section_iterator_parent(iterator));
        if (pcase_var.eql((SubLObject)rtp_iterators.$kw69$SIMPLE)) {
            return (SubLObject)rtp_iterators.$kw74$UNAVAILABLE;
        }
        if (pcase_var.eql((SubLObject)rtp_iterators.$kw73$ASSERTION)) {
            return args_from_assertions((SubLObject)rtp_iterators.ONE_INTEGER, itp_section_iterator_curr_assertion(iterator));
        }
        if (pcase_var.eql((SubLObject)rtp_iterators.$kw72$RANKED)) {
            return rtp_constituent_weeders.itp_semantics_category(itp_section_iterator_curr(iterator));
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 8387L)
    public static SubLObject itp_section_iterator_curr_confidence(final SubLObject iterator) {
        final SubLObject pcase_var = itp_result_iterator_style(itp_section_iterator_parent(iterator));
        if (pcase_var.eql((SubLObject)rtp_iterators.$kw72$RANKED)) {
            return rtp_constituent_weeders.itp_semantics_confidence(itp_section_iterator_curr(iterator));
        }
        return (SubLObject)rtp_iterators.$kw74$UNAVAILABLE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 8654L)
    public static SubLObject args_from_assertions(final SubLObject arg_num, final SubLObject asserts) {
        SubLObject result = (SubLObject)rtp_iterators.NIL;
        SubLObject cdolist_list_var = asserts;
        SubLObject v_assert = (SubLObject)rtp_iterators.NIL;
        v_assert = cdolist_list_var.first();
        while (rtp_iterators.NIL != cdolist_list_var) {
            if (rtp_iterators.NIL != assertion_handles.assertion_p(v_assert)) {
                result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(v_assert, arg_num), result);
            }
            else {
                result = (SubLObject)ConsesLow.cons(v_assert, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_assert = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 8904L)
    public static SubLObject find_itp_section_iterator(final SubLObject result_iterator, final SubLObject span) {
        final SubLObject iterator = copy_itp_result_iterator(result_iterator);
        SubLObject section_iterator = (SubLObject)rtp_iterators.NIL;
        itp_result_iterator_reset(iterator);
        while (rtp_iterators.NIL == itp_result_iterator_doneP(iterator)) {
            section_iterator = itp_result_iterator_curr(iterator);
            if (span.equal(itp_section_iterator_span(section_iterator))) {
                return section_iterator;
            }
            itp_result_iterator_next(iterator);
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 9441L)
    public static SubLObject itp_child_iterator_reset(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (rtp_iterators.NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_reset(section_iterator);
        }
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 9693L)
    public static SubLObject itp_child_iterator_curr(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (rtp_iterators.NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr(section_iterator);
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 9936L)
    public static SubLObject itp_child_iterator_curr_span(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (rtp_iterators.NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr_span(section_iterator);
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 10190L)
    public static SubLObject itp_child_iterator_curr_cycl(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (rtp_iterators.NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr_cycl(section_iterator);
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 10443L)
    public static SubLObject itp_child_iterator_curr_assertion(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (rtp_iterators.NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr_assertion(section_iterator);
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 10706L)
    public static SubLObject itp_child_iterator_curr_pred(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (rtp_iterators.NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr_pred(section_iterator);
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 10962L)
    public static SubLObject itp_child_iterator_curr_cat(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (rtp_iterators.NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr_cat(section_iterator);
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 11216L)
    public static SubLObject itp_child_iterator_curr_confidence(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (rtp_iterators.NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_curr_confidence(section_iterator);
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 11483L)
    public static SubLObject itp_result_iterator_doneP(final SubLObject iterator) {
        return Types.sublisp_null(itp_result_iterator_span(iterator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 11625L)
    public static SubLObject itp_result_iterator_next(final SubLObject iterator) {
        if (rtp_iterators.NIL == itp_result_iterator_doneP(iterator)) {
            final SubLObject span = itp_result_iterator_span(iterator);
            _csetf_itp_result_iterator_span(iterator, span.rest());
            update_itp_result_section_iterator(iterator);
        }
        return itp_result_iterator_curr(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 11941L)
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
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 12360L)
    public static SubLObject itp_section_iterator_next(final SubLObject iterator) {
        if (rtp_iterators.NIL == itp_section_iterator_doneP(iterator)) {
            final SubLObject current = itp_section_iterator_current(iterator);
            _csetf_itp_section_iterator_current(iterator, current.rest());
        }
        return itp_section_iterator_current(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 12647L)
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
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 13039L)
    public static SubLObject itp_section_iterator_doneP(final SubLObject iterator) {
        return Types.sublisp_null(itp_section_iterator_current(iterator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 13149L)
    public static SubLObject itp_child_iterator_next(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (rtp_iterators.NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_next(section_iterator);
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 13396L)
    public static SubLObject itp_child_iterator_prev(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (rtp_iterators.NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_prev(section_iterator);
        }
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 13641L)
    public static SubLObject itp_child_iterator_doneP(final SubLObject iterator) {
        final SubLObject section_iterator = itp_child_iterator_section(iterator);
        if (rtp_iterators.NIL != itp_section_iterator_p(section_iterator)) {
            return itp_section_iterator_doneP(section_iterator);
        }
        return (SubLObject)rtp_iterators.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 13931L)
    public static SubLObject itp_longest_parse_cycls(final SubLObject parses) {
        final SubLObject result_iterator = new_itp_result_iterator(parses, (SubLObject)rtp_iterators.UNPROVIDED, (SubLObject)rtp_iterators.UNPROVIDED);
        SubLObject max_span_length = (SubLObject)rtp_iterators.ZERO_INTEGER;
        SubLObject max_span = (SubLObject)rtp_iterators.NIL;
        SubLObject output_cycls = (SubLObject)rtp_iterators.NIL;
        while (rtp_iterators.NIL == itp_result_iterator_doneP(result_iterator)) {
            final SubLObject section_iterator = itp_result_iterator_curr(result_iterator);
            final SubLObject span = itp_section_iterator_curr_span(section_iterator);
            if (rtp_iterators.NIL != list_utilities.lengthG(span, max_span_length, (SubLObject)rtp_iterators.UNPROVIDED)) {
                max_span_length = Sequences.length(span);
                max_span = span;
                output_cycls = (SubLObject)rtp_iterators.NIL;
                while (rtp_iterators.NIL == itp_section_iterator_doneP(section_iterator)) {
                    output_cycls = (SubLObject)ConsesLow.cons(itp_section_iterator_curr_cycl(section_iterator), output_cycls);
                    itp_section_iterator_next(section_iterator);
                }
            }
            itp_result_iterator_next(result_iterator);
        }
        return Values.values(Sequences.nreverse(output_cycls), max_span);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 14920L)
    public static SubLObject update_itp_result_section_iterator(final SubLObject iterator) {
        final SubLObject span = itp_result_iterator_span(iterator);
        SubLObject section_iterator = (SubLObject)rtp_iterators.NIL;
        section_iterator = new_itp_section_iterator(iterator, span.first());
        _csetf_itp_result_iterator_section_iterator(iterator, section_iterator);
        return section_iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rtp_iterators.ZERO_INTEGER);
        return (SubLObject)rtp_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rtp_iterator_native.class) ? rtp_iterators.T : rtp_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_string(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_parsing_mt(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_semantic_mt(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_strengthenP(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_multiple_quantificationsP(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_wff_checkP(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_force(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_raw_parses(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_result_queue(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_initialized(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_template_category(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_memoization_state(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject rtp_iterator_sbhl_resource(final SubLObject v_object) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_string(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_parsing_mt(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_semantic_mt(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_strengthenP(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_multiple_quantificationsP(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_wff_checkP(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_force(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_raw_parses(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_result_queue(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_initialized(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_template_category(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_memoization_state(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject _csetf_rtp_iterator_sbhl_resource(final SubLObject v_object, final SubLObject value) {
        assert rtp_iterators.NIL != rtp_iterator_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject make_rtp_iterator(SubLObject arglist) {
        if (arglist == rtp_iterators.UNPROVIDED) {
            arglist = (SubLObject)rtp_iterators.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rtp_iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rtp_iterators.NIL, next = arglist; rtp_iterators.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rtp_iterators.$kw109$STRING)) {
                _csetf_rtp_iterator_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw110$PARSING_MT)) {
                _csetf_rtp_iterator_parsing_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw111$SEMANTIC_MT)) {
                _csetf_rtp_iterator_semantic_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw112$STRENGTHEN_)) {
                _csetf_rtp_iterator_strengthenP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw113$MULTIPLE_QUANTIFICATIONS_)) {
                _csetf_rtp_iterator_multiple_quantificationsP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw114$WFF_CHECK_)) {
                _csetf_rtp_iterator_wff_checkP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw115$FORCE)) {
                _csetf_rtp_iterator_force(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw116$RAW_PARSES)) {
                _csetf_rtp_iterator_raw_parses(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw117$RESULT_QUEUE)) {
                _csetf_rtp_iterator_result_queue(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw118$INITIALIZED)) {
                _csetf_rtp_iterator_initialized(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw119$TEMPLATE_CATEGORY)) {
                _csetf_rtp_iterator_template_category(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw120$MEMOIZATION_STATE)) {
                _csetf_rtp_iterator_memoization_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rtp_iterators.$kw121$SBHL_RESOURCE)) {
                _csetf_rtp_iterator_sbhl_resource(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rtp_iterators.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject visit_defstruct_rtp_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw22$BEGIN, (SubLObject)rtp_iterators.$sym122$MAKE_RTP_ITERATOR, (SubLObject)rtp_iterators.THIRTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw109$STRING, rtp_iterator_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw110$PARSING_MT, rtp_iterator_parsing_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw111$SEMANTIC_MT, rtp_iterator_semantic_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw112$STRENGTHEN_, rtp_iterator_strengthenP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw113$MULTIPLE_QUANTIFICATIONS_, rtp_iterator_multiple_quantificationsP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw114$WFF_CHECK_, rtp_iterator_wff_checkP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw115$FORCE, rtp_iterator_force(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw116$RAW_PARSES, rtp_iterator_raw_parses(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw117$RESULT_QUEUE, rtp_iterator_result_queue(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw118$INITIALIZED, rtp_iterator_initialized(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw119$TEMPLATE_CATEGORY, rtp_iterator_template_category(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw120$MEMOIZATION_STATE, rtp_iterator_memoization_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw24$SLOT, (SubLObject)rtp_iterators.$kw121$SBHL_RESOURCE, rtp_iterator_sbhl_resource(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rtp_iterators.$kw25$END, (SubLObject)rtp_iterators.$sym122$MAKE_RTP_ITERATOR, (SubLObject)rtp_iterators.THIRTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15298L)
    public static SubLObject visit_defstruct_object_rtp_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rtp_iterator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 15774L)
    public static SubLObject new_rtp_iterator(final SubLObject string, SubLObject v_properties) {
        if (v_properties == rtp_iterators.UNPROVIDED) {
            v_properties = (SubLObject)rtp_iterators.NIL;
        }
        return iteration.new_iterator(new_rtp_iterator_state(string, v_properties), (SubLObject)rtp_iterators.$sym124$RTP_ITERATOR_DONE, (SubLObject)rtp_iterators.$sym125$RTP_ITERATOR_NEXT, (SubLObject)rtp_iterators.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 16008L)
    public static SubLObject new_rtp_iterator_state(final SubLObject string, SubLObject v_properties) {
        if (v_properties == rtp_iterators.UNPROVIDED) {
            v_properties = (SubLObject)rtp_iterators.NIL;
        }
        final SubLObject iter = make_rtp_iterator((SubLObject)rtp_iterators.UNPROVIDED);
        final SubLObject parsing_mt = conses_high.getf(v_properties, (SubLObject)rtp_iterators.$kw110$PARSING_MT, rtp_iterators.$const126$RKFParsingMt);
        final SubLObject semantic_mt = conses_high.getf(v_properties, (SubLObject)rtp_iterators.$kw111$SEMANTIC_MT, parsing_mt);
        final SubLObject strengthenP = conses_high.getf(v_properties, (SubLObject)rtp_iterators.$kw112$STRENGTHEN_, (SubLObject)rtp_iterators.T);
        final SubLObject multiple_quantificationsP = conses_high.getf(v_properties, (SubLObject)rtp_iterators.$kw113$MULTIPLE_QUANTIFICATIONS_, (SubLObject)rtp_iterators.NIL);
        final SubLObject force = conses_high.getf(v_properties, (SubLObject)rtp_iterators.$kw115$FORCE, (SubLObject)rtp_iterators.$kw127$DECLARATIVE);
        final SubLObject wff_checkP = conses_high.getf(v_properties, (SubLObject)rtp_iterators.$kw114$WFF_CHECK_, (SubLObject)rtp_iterators.T);
        _csetf_rtp_iterator_string(iter, string);
        _csetf_rtp_iterator_parsing_mt(iter, parsing_mt);
        _csetf_rtp_iterator_semantic_mt(iter, semantic_mt);
        _csetf_rtp_iterator_strengthenP(iter, strengthenP);
        _csetf_rtp_iterator_multiple_quantificationsP(iter, multiple_quantificationsP);
        _csetf_rtp_iterator_force(iter, force);
        _csetf_rtp_iterator_template_category(iter, rtp_iter_cat_for_force(force));
        _csetf_rtp_iterator_wff_checkP(iter, wff_checkP);
        _csetf_rtp_iterator_initialized(iter, (SubLObject)rtp_iterators.NIL);
        _csetf_rtp_iterator_result_queue(iter, queues.create_queue((SubLObject)rtp_iterators.UNPROVIDED));
        _csetf_rtp_iterator_memoization_state(iter, memoization_state.new_memoization_state((SubLObject)rtp_iterators.UNPROVIDED, (SubLObject)rtp_iterators.UNPROVIDED, (SubLObject)rtp_iterators.UNPROVIDED, (SubLObject)rtp_iterators.UNPROVIDED));
        _csetf_rtp_iterator_sbhl_resource(iter, sbhl_marking_vars.new_sbhl_marking_space_resource((SubLObject)rtp_iterators.FOUR_INTEGER));
        return iter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 17215L)
    public static SubLObject rtp_iter_cat_for_force(final SubLObject force) {
        if (force.eql((SubLObject)rtp_iterators.$kw127$DECLARATIVE)) {
            return rtp_iterators.$const128$STemplate;
        }
        if (force.eql((SubLObject)rtp_iterators.$kw129$QUERY)) {
            return rtp_iterators.$const130$QuestionTemplate;
        }
        if (force.eql((SubLObject)rtp_iterators.$kw131$QUESTION)) {
            return rtp_iterators.$const130$QuestionTemplate;
        }
        return rtp_iterators.$const128$STemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 17442L)
    public static SubLObject rtp_iterator_done(final SubLObject iter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rtp_iterators.NIL == queues.queue_empty_p(rtp_iterator_result_queue(iter))) {
            return (SubLObject)rtp_iterators.NIL;
        }
        SubLObject result = (SubLObject)rtp_iterators.NIL;
        final SubLObject local_state = rtp_iterator_memoization_state(iter);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (rtp_iterators.NIL == rtp_iterator_initialized(iter)) {
                    rtp_iterator_add_raw_parse(iter);
                }
                if (rtp_iterators.NIL == rtp_iterator_raw_parses(iter) && rtp_iterators.NIL != queues.queue_empty_p(rtp_iterator_result_queue(iter))) {
                    result = (SubLObject)rtp_iterators.T;
                }
                while (rtp_iterators.NIL != queues.queue_empty_p(rtp_iterator_result_queue(iter)) && rtp_iterators.NIL != rtp_iterator_raw_parses(iter) && rtp_iterators.NIL == result) {
                    rtp_iterator_reformulate_one_parse(iter);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rtp_iterators.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (rtp_iterators.NIL == result) {
            result = queues.queue_empty_p(rtp_iterator_result_queue(iter));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 18141L)
    public static SubLObject rtp_iterator_reformulate_one_parse(final SubLObject iter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sbhl_resource = rtp_iterator_sbhl_resource(iter);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)rtp_iterators.T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                final SubLObject raw_parses = rtp_iterator_raw_parses(iter);
                final SubLObject first_parse = raw_parses.first();
                final SubLObject semantic_mt = rtp_iterator_semantic_mt(iter);
                final SubLObject strengthenP = rtp_iterator_strengthenP(iter);
                final SubLObject reformulated_parses = rkf_formula_optimizer.rkf_reformulate_into_many(first_parse, semantic_mt, strengthenP, (SubLObject)rtp_iterators.UNPROVIDED, (SubLObject)rtp_iterators.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(semantic_mt, thread);
                    final SubLObject wff_parses = (rtp_iterators.NIL != rtp_iterator_wff_checkP(iter)) ? list_utilities.remove_if_not((SubLObject)rtp_iterators.$sym132$EL_WFF_, reformulated_parses, (SubLObject)rtp_iterators.UNPROVIDED, (SubLObject)rtp_iterators.UNPROVIDED, (SubLObject)rtp_iterators.UNPROVIDED, (SubLObject)rtp_iterators.UNPROVIDED) : reformulated_parses;
                    _csetf_rtp_iterator_raw_parses(iter, raw_parses.rest());
                    SubLObject cdolist_list_var = wff_parses;
                    SubLObject reformulated_parse = (SubLObject)rtp_iterators.NIL;
                    reformulated_parse = cdolist_list_var.first();
                    while (rtp_iterators.NIL != cdolist_list_var) {
                        queues.enqueue(reformulated_parse, rtp_iterator_result_queue(iter));
                        cdolist_list_var = cdolist_list_var.rest();
                        reformulated_parse = cdolist_list_var.first();
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$2, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rtp_iterators.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return iter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 19080L)
    public static SubLObject rtp_iterator_add_raw_parse(final SubLObject iter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = rkf_text_processors.$rkf_text_proc_resolve_parses$.currentBinding(thread);
        try {
            rkf_text_processors.$rkf_text_proc_resolve_parses$.bind((SubLObject)rtp_iterators.T, thread);
            final SubLObject rkf_return_multiple_quantifications = rtp_iterator_multiple_quantificationsP(iter);
            final SubLObject _prev_bind_0_$4 = parsing_vars.$rkf_template_wff_filter_level$.currentBinding(thread);
            try {
                parsing_vars.$rkf_template_wff_filter_level$.bind((SubLObject)((rtp_iterators.NIL != rtp_iterator_wff_checkP(iter)) ? rtp_iterators.TWO_INTEGER : rtp_iterators.ZERO_INTEGER), thread);
                final SubLObject parsing_mt = rtp_iterator_parsing_mt(iter);
                final SubLObject semantic_mt = rtp_iterator_semantic_mt(iter);
                final SubLObject string = rtp_iterator_string(iter);
                final SubLObject template_category = rtp_iterator_template_category(iter);
                final SubLObject raw_parser_output = rkf_text_processors.rkf_utterance_reader(string, template_category, parsing_mt, semantic_mt);
                final SubLObject top_level_parses = rkf_text_processors.top_level_parses(raw_parser_output);
                _csetf_rtp_iterator_raw_parses(iter, top_level_parses);
                _csetf_rtp_iterator_initialized(iter, (SubLObject)rtp_iterators.T);
            }
            finally {
                parsing_vars.$rkf_template_wff_filter_level$.rebind(_prev_bind_0_$4, thread);
            }
        }
        finally {
            rkf_text_processors.$rkf_text_proc_resolve_parses$.rebind(_prev_bind_0, thread);
        }
        return iter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/rtp-iterators.lisp", position = 20069L)
    public static SubLObject rtp_iterator_next(final SubLObject iter) {
        if (rtp_iterators.NIL != rtp_iterator_done(iter)) {
            return Values.values((SubLObject)rtp_iterators.$kw133$FAILURE, iter, (SubLObject)rtp_iterators.NIL);
        }
        final SubLObject result = queues.dequeue(rtp_iterator_result_queue(iter));
        return Values.values(result, iter, (SubLObject)rtp_iterators.NIL);
    }
    
    public static SubLObject declare_rtp_iterators_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_result_iterator_print_function_trampoline", "ITP-RESULT-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_result_iterator_p", "ITP-RESULT-ITERATOR-P", 1, 0, false);
        new $itp_result_iterator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_result_iterator_style", "ITP-RESULT-ITERATOR-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_result_iterator_parses", "ITP-RESULT-ITERATOR-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_result_iterator_span", "ITP-RESULT-ITERATOR-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_result_iterator_section_iterator", "ITP-RESULT-ITERATOR-SECTION-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_itp_result_iterator_style", "_CSETF-ITP-RESULT-ITERATOR-STYLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_itp_result_iterator_parses", "_CSETF-ITP-RESULT-ITERATOR-PARSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_itp_result_iterator_span", "_CSETF-ITP-RESULT-ITERATOR-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_itp_result_iterator_section_iterator", "_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "make_itp_result_iterator", "MAKE-ITP-RESULT-ITERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "visit_defstruct_itp_result_iterator", "VISIT-DEFSTRUCT-ITP-RESULT-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "visit_defstruct_object_itp_result_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITP-RESULT-ITERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_print_function_trampoline", "ITP-SECTION-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_p", "ITP-SECTION-ITERATOR-P", 1, 0, false);
        new $itp_section_iterator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_parent", "ITP-SECTION-ITERATOR-PARENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_span", "ITP-SECTION-ITERATOR-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_section", "ITP-SECTION-ITERATOR-SECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_current", "ITP-SECTION-ITERATOR-CURRENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_itp_section_iterator_parent", "_CSETF-ITP-SECTION-ITERATOR-PARENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_itp_section_iterator_span", "_CSETF-ITP-SECTION-ITERATOR-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_itp_section_iterator_section", "_CSETF-ITP-SECTION-ITERATOR-SECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_itp_section_iterator_current", "_CSETF-ITP-SECTION-ITERATOR-CURRENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "make_itp_section_iterator", "MAKE-ITP-SECTION-ITERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "visit_defstruct_itp_section_iterator", "VISIT-DEFSTRUCT-ITP-SECTION-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "visit_defstruct_object_itp_section_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITP-SECTION-ITERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_print_section_iterator", "ITP-PRINT-SECTION-ITERATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_print_function_trampoline", "ITP-CHILD-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_p", "ITP-CHILD-ITERATOR-P", 1, 0, false);
        new $itp_child_iterator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_parent", "ITP-CHILD-ITERATOR-PARENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_rop_formula", "ITP-CHILD-ITERATOR-ROP-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_section", "ITP-CHILD-ITERATOR-SECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_itp_child_iterator_parent", "_CSETF-ITP-CHILD-ITERATOR-PARENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_itp_child_iterator_rop_formula", "_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_itp_child_iterator_section", "_CSETF-ITP-CHILD-ITERATOR-SECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "make_itp_child_iterator", "MAKE-ITP-CHILD-ITERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "visit_defstruct_itp_child_iterator", "VISIT-DEFSTRUCT-ITP-CHILD-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "visit_defstruct_object_itp_child_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITP-CHILD-ITERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_print_child_iterator", "ITP-PRINT-CHILD-ITERATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "new_itp_result_iterator", "NEW-ITP-RESULT-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "determine_parse_result_style", "DETERMINE-PARSE-RESULT-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "copy_itp_result_iterator", "COPY-ITP-RESULT-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "new_itp_section_iterator", "NEW-ITP-SECTION-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "new_itp_child_iterator", "NEW-ITP-CHILD-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "new_itp_root_children_iterator", "NEW-ITP-ROOT-CHILDREN-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "is_itp_root_children_iteratorP", "IS-ITP-ROOT-CHILDREN-ITERATOR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "is_equivalent_rtp_child_iteratorP", "IS-EQUIVALENT-RTP-CHILD-ITERATOR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_result_iterator_reset", "ITP-RESULT-ITERATOR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_result_iterator_curr", "ITP-RESULT-ITERATOR-CURR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_reset", "ITP-SECTION-ITERATOR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_curr", "ITP-SECTION-ITERATOR-CURR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_set_curr", "ITP-SECTION-ITERATOR-SET-CURR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_curr_span", "ITP-SECTION-ITERATOR-CURR-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_curr_cycl", "ITP-SECTION-ITERATOR-CURR-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_curr_assertion", "ITP-SECTION-ITERATOR-CURR-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_curr_pred", "ITP-SECTION-ITERATOR-CURR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_curr_cat", "ITP-SECTION-ITERATOR-CURR-CAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_curr_confidence", "ITP-SECTION-ITERATOR-CURR-CONFIDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "args_from_assertions", "ARGS-FROM-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "find_itp_section_iterator", "FIND-ITP-SECTION-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_reset", "ITP-CHILD-ITERATOR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_curr", "ITP-CHILD-ITERATOR-CURR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_curr_span", "ITP-CHILD-ITERATOR-CURR-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_curr_cycl", "ITP-CHILD-ITERATOR-CURR-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_curr_assertion", "ITP-CHILD-ITERATOR-CURR-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_curr_pred", "ITP-CHILD-ITERATOR-CURR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_curr_cat", "ITP-CHILD-ITERATOR-CURR-CAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_curr_confidence", "ITP-CHILD-ITERATOR-CURR-CONFIDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_result_iterator_doneP", "ITP-RESULT-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_result_iterator_next", "ITP-RESULT-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_result_iterator_prev", "ITP-RESULT-ITERATOR-PREV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_next", "ITP-SECTION-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_prev", "ITP-SECTION-ITERATOR-PREV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_section_iterator_doneP", "ITP-SECTION-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_next", "ITP-CHILD-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_prev", "ITP-CHILD-ITERATOR-PREV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_child_iterator_doneP", "ITP-CHILD-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "itp_longest_parse_cycls", "ITP-LONGEST-PARSE-CYCLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "update_itp_result_section_iterator", "UPDATE-ITP-RESULT-SECTION-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_print_function_trampoline", "RTP-ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_p", "RTP-ITERATOR-P", 1, 0, false);
        new $rtp_iterator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_string", "RTP-ITERATOR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_parsing_mt", "RTP-ITERATOR-PARSING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_semantic_mt", "RTP-ITERATOR-SEMANTIC-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_strengthenP", "RTP-ITERATOR-STRENGTHEN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_multiple_quantificationsP", "RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_wff_checkP", "RTP-ITERATOR-WFF-CHECK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_force", "RTP-ITERATOR-FORCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_raw_parses", "RTP-ITERATOR-RAW-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_result_queue", "RTP-ITERATOR-RESULT-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_initialized", "RTP-ITERATOR-INITIALIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_template_category", "RTP-ITERATOR-TEMPLATE-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_memoization_state", "RTP-ITERATOR-MEMOIZATION-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_sbhl_resource", "RTP-ITERATOR-SBHL-RESOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_string", "_CSETF-RTP-ITERATOR-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_parsing_mt", "_CSETF-RTP-ITERATOR-PARSING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_semantic_mt", "_CSETF-RTP-ITERATOR-SEMANTIC-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_strengthenP", "_CSETF-RTP-ITERATOR-STRENGTHEN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_multiple_quantificationsP", "_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_wff_checkP", "_CSETF-RTP-ITERATOR-WFF-CHECK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_force", "_CSETF-RTP-ITERATOR-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_raw_parses", "_CSETF-RTP-ITERATOR-RAW-PARSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_result_queue", "_CSETF-RTP-ITERATOR-RESULT-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_initialized", "_CSETF-RTP-ITERATOR-INITIALIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_template_category", "_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_memoization_state", "_CSETF-RTP-ITERATOR-MEMOIZATION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "_csetf_rtp_iterator_sbhl_resource", "_CSETF-RTP-ITERATOR-SBHL-RESOURCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "make_rtp_iterator", "MAKE-RTP-ITERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "visit_defstruct_rtp_iterator", "VISIT-DEFSTRUCT-RTP-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "visit_defstruct_object_rtp_iterator_method", "VISIT-DEFSTRUCT-OBJECT-RTP-ITERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "new_rtp_iterator", "NEW-RTP-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "new_rtp_iterator_state", "NEW-RTP-ITERATOR-STATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iter_cat_for_force", "RTP-ITER-CAT-FOR-FORCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_done", "RTP-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_reformulate_one_parse", "RTP-ITERATOR-REFORMULATE-ONE-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_add_raw_parse", "RTP-ITERATOR-ADD-RAW-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.rtp_iterators", "rtp_iterator_next", "RTP-ITERATOR-NEXT", 1, 0, false);
        return (SubLObject)rtp_iterators.NIL;
    }
    
    public static SubLObject init_rtp_iterators_file() {
        rtp_iterators.$dtp_itp_result_iterator$ = SubLFiles.defconstant("*DTP-ITP-RESULT-ITERATOR*", (SubLObject)rtp_iterators.$sym0$ITP_RESULT_ITERATOR);
        rtp_iterators.$dtp_itp_section_iterator$ = SubLFiles.defconstant("*DTP-ITP-SECTION-ITERATOR*", (SubLObject)rtp_iterators.$sym27$ITP_SECTION_ITERATOR);
        rtp_iterators.$dtp_itp_child_iterator$ = SubLFiles.defconstant("*DTP-ITP-CHILD-ITERATOR*", (SubLObject)rtp_iterators.$sym50$ITP_CHILD_ITERATOR);
        rtp_iterators.$dtp_rtp_iterator$ = SubLFiles.defconstant("*DTP-RTP-ITERATOR*", (SubLObject)rtp_iterators.$sym75$RTP_ITERATOR);
        return (SubLObject)rtp_iterators.NIL;
    }
    
    public static SubLObject setup_rtp_iterators_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_result_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)rtp_iterators.$sym7$ITP_RESULT_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rtp_iterators.$list8);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym9$ITP_RESULT_ITERATOR_STYLE, (SubLObject)rtp_iterators.$sym10$_CSETF_ITP_RESULT_ITERATOR_STYLE);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym11$ITP_RESULT_ITERATOR_PARSES, (SubLObject)rtp_iterators.$sym12$_CSETF_ITP_RESULT_ITERATOR_PARSES);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym13$ITP_RESULT_ITERATOR_SPAN, (SubLObject)rtp_iterators.$sym14$_CSETF_ITP_RESULT_ITERATOR_SPAN);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym15$ITP_RESULT_ITERATOR_SECTION_ITERATOR, (SubLObject)rtp_iterators.$sym16$_CSETF_ITP_RESULT_ITERATOR_SECTION_ITERATOR);
        Equality.identity((SubLObject)rtp_iterators.$sym0$ITP_RESULT_ITERATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_result_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)rtp_iterators.$sym26$VISIT_DEFSTRUCT_OBJECT_ITP_RESULT_ITERATOR_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_section_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)rtp_iterators.$sym34$ITP_SECTION_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rtp_iterators.$list35);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym36$ITP_SECTION_ITERATOR_PARENT, (SubLObject)rtp_iterators.$sym37$_CSETF_ITP_SECTION_ITERATOR_PARENT);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym38$ITP_SECTION_ITERATOR_SPAN, (SubLObject)rtp_iterators.$sym39$_CSETF_ITP_SECTION_ITERATOR_SPAN);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym40$ITP_SECTION_ITERATOR_SECTION, (SubLObject)rtp_iterators.$sym41$_CSETF_ITP_SECTION_ITERATOR_SECTION);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym42$ITP_SECTION_ITERATOR_CURRENT, (SubLObject)rtp_iterators.$sym43$_CSETF_ITP_SECTION_ITERATOR_CURRENT);
        Equality.identity((SubLObject)rtp_iterators.$sym27$ITP_SECTION_ITERATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_section_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)rtp_iterators.$sym48$VISIT_DEFSTRUCT_OBJECT_ITP_SECTION_ITERATOR_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_child_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)rtp_iterators.$sym57$ITP_CHILD_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rtp_iterators.$list58);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym59$ITP_CHILD_ITERATOR_PARENT, (SubLObject)rtp_iterators.$sym60$_CSETF_ITP_CHILD_ITERATOR_PARENT);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym61$ITP_CHILD_ITERATOR_ROP_FORMULA, (SubLObject)rtp_iterators.$sym62$_CSETF_ITP_CHILD_ITERATOR_ROP_FORMULA);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym63$ITP_CHILD_ITERATOR_SECTION, (SubLObject)rtp_iterators.$sym64$_CSETF_ITP_CHILD_ITERATOR_SECTION);
        Equality.identity((SubLObject)rtp_iterators.$sym50$ITP_CHILD_ITERATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_itp_child_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)rtp_iterators.$sym67$VISIT_DEFSTRUCT_OBJECT_ITP_CHILD_ITERATOR_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_rtp_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)rtp_iterators.$sym81$RTP_ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rtp_iterators.$list82);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym83$RTP_ITERATOR_STRING, (SubLObject)rtp_iterators.$sym84$_CSETF_RTP_ITERATOR_STRING);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym85$RTP_ITERATOR_PARSING_MT, (SubLObject)rtp_iterators.$sym86$_CSETF_RTP_ITERATOR_PARSING_MT);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym87$RTP_ITERATOR_SEMANTIC_MT, (SubLObject)rtp_iterators.$sym88$_CSETF_RTP_ITERATOR_SEMANTIC_MT);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym89$RTP_ITERATOR_STRENGTHEN_, (SubLObject)rtp_iterators.$sym90$_CSETF_RTP_ITERATOR_STRENGTHEN_);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym91$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_, (SubLObject)rtp_iterators.$sym92$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym93$RTP_ITERATOR_WFF_CHECK_, (SubLObject)rtp_iterators.$sym94$_CSETF_RTP_ITERATOR_WFF_CHECK_);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym95$RTP_ITERATOR_FORCE, (SubLObject)rtp_iterators.$sym96$_CSETF_RTP_ITERATOR_FORCE);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym97$RTP_ITERATOR_RAW_PARSES, (SubLObject)rtp_iterators.$sym98$_CSETF_RTP_ITERATOR_RAW_PARSES);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym99$RTP_ITERATOR_RESULT_QUEUE, (SubLObject)rtp_iterators.$sym100$_CSETF_RTP_ITERATOR_RESULT_QUEUE);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym101$RTP_ITERATOR_INITIALIZED, (SubLObject)rtp_iterators.$sym102$_CSETF_RTP_ITERATOR_INITIALIZED);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym103$RTP_ITERATOR_TEMPLATE_CATEGORY, (SubLObject)rtp_iterators.$sym104$_CSETF_RTP_ITERATOR_TEMPLATE_CATEGORY);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym105$RTP_ITERATOR_MEMOIZATION_STATE, (SubLObject)rtp_iterators.$sym106$_CSETF_RTP_ITERATOR_MEMOIZATION_STATE);
        Structures.def_csetf((SubLObject)rtp_iterators.$sym107$RTP_ITERATOR_SBHL_RESOURCE, (SubLObject)rtp_iterators.$sym108$_CSETF_RTP_ITERATOR_SBHL_RESOURCE);
        Equality.identity((SubLObject)rtp_iterators.$sym75$RTP_ITERATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_iterators.$dtp_rtp_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)rtp_iterators.$sym123$VISIT_DEFSTRUCT_OBJECT_RTP_ITERATOR_METHOD));
        return (SubLObject)rtp_iterators.NIL;
    }
    
    public void declareFunctions() {
        declare_rtp_iterators_file();
    }
    
    public void initializeVariables() {
        init_rtp_iterators_file();
    }
    
    public void runTopLevelForms() {
        setup_rtp_iterators_file();
    }
    
    static {
        me = (SubLFile)new rtp_iterators();
        rtp_iterators.$dtp_itp_result_iterator$ = null;
        rtp_iterators.$dtp_itp_section_iterator$ = null;
        rtp_iterators.$dtp_itp_child_iterator$ = null;
        rtp_iterators.$dtp_rtp_iterator$ = null;
        $sym0$ITP_RESULT_ITERATOR = SubLObjectFactory.makeSymbol("ITP-RESULT-ITERATOR");
        $sym1$ITP_RESULT_ITERATOR_P = SubLObjectFactory.makeSymbol("ITP-RESULT-ITERATOR-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSES"), (SubLObject)SubLObjectFactory.makeSymbol("SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("SECTION-ITERATOR"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STYLE"), (SubLObject)SubLObjectFactory.makeKeyword("PARSES"), (SubLObject)SubLObjectFactory.makeKeyword("SPAN"), (SubLObject)SubLObjectFactory.makeKeyword("SECTION-ITERATOR"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITP-RESULT-ITERATOR-STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-RESULT-ITERATOR-PARSES"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-RESULT-ITERATOR-SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-RESULT-ITERATOR-SECTION-ITERATOR"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ITP-RESULT-ITERATOR-STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ITP-RESULT-ITERATOR-PARSES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$ITP_RESULT_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ITP-RESULT-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-RESULT-ITERATOR-P"));
        $sym9$ITP_RESULT_ITERATOR_STYLE = SubLObjectFactory.makeSymbol("ITP-RESULT-ITERATOR-STYLE");
        $sym10$_CSETF_ITP_RESULT_ITERATOR_STYLE = SubLObjectFactory.makeSymbol("_CSETF-ITP-RESULT-ITERATOR-STYLE");
        $sym11$ITP_RESULT_ITERATOR_PARSES = SubLObjectFactory.makeSymbol("ITP-RESULT-ITERATOR-PARSES");
        $sym12$_CSETF_ITP_RESULT_ITERATOR_PARSES = SubLObjectFactory.makeSymbol("_CSETF-ITP-RESULT-ITERATOR-PARSES");
        $sym13$ITP_RESULT_ITERATOR_SPAN = SubLObjectFactory.makeSymbol("ITP-RESULT-ITERATOR-SPAN");
        $sym14$_CSETF_ITP_RESULT_ITERATOR_SPAN = SubLObjectFactory.makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SPAN");
        $sym15$ITP_RESULT_ITERATOR_SECTION_ITERATOR = SubLObjectFactory.makeSymbol("ITP-RESULT-ITERATOR-SECTION-ITERATOR");
        $sym16$_CSETF_ITP_RESULT_ITERATOR_SECTION_ITERATOR = SubLObjectFactory.makeSymbol("_CSETF-ITP-RESULT-ITERATOR-SECTION-ITERATOR");
        $kw17$STYLE = SubLObjectFactory.makeKeyword("STYLE");
        $kw18$PARSES = SubLObjectFactory.makeKeyword("PARSES");
        $kw19$SPAN = SubLObjectFactory.makeKeyword("SPAN");
        $kw20$SECTION_ITERATOR = SubLObjectFactory.makeKeyword("SECTION-ITERATOR");
        $str21$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw22$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym23$MAKE_ITP_RESULT_ITERATOR = SubLObjectFactory.makeSymbol("MAKE-ITP-RESULT-ITERATOR");
        $kw24$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw25$END = SubLObjectFactory.makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_ITP_RESULT_ITERATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-RESULT-ITERATOR-METHOD");
        $sym27$ITP_SECTION_ITERATOR = SubLObjectFactory.makeSymbol("ITP-SECTION-ITERATOR");
        $sym28$ITP_SECTION_ITERATOR_P = SubLObjectFactory.makeSymbol("ITP-SECTION-ITERATOR-P");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("SECTION"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARENT"), (SubLObject)SubLObjectFactory.makeKeyword("SPAN"), (SubLObject)SubLObjectFactory.makeKeyword("SECTION"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITP-SECTION-ITERATOR-PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-SECTION-ITERATOR-SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-SECTION-ITERATOR-SECTION"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-SECTION-ITERATOR-CURRENT"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ITP-SECTION-ITERATOR-PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SECTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ITP-SECTION-ITERATOR-CURRENT"));
        $sym33$ITP_PRINT_SECTION_ITERATOR = SubLObjectFactory.makeSymbol("ITP-PRINT-SECTION-ITERATOR");
        $sym34$ITP_SECTION_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ITP-SECTION-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-SECTION-ITERATOR-P"));
        $sym36$ITP_SECTION_ITERATOR_PARENT = SubLObjectFactory.makeSymbol("ITP-SECTION-ITERATOR-PARENT");
        $sym37$_CSETF_ITP_SECTION_ITERATOR_PARENT = SubLObjectFactory.makeSymbol("_CSETF-ITP-SECTION-ITERATOR-PARENT");
        $sym38$ITP_SECTION_ITERATOR_SPAN = SubLObjectFactory.makeSymbol("ITP-SECTION-ITERATOR-SPAN");
        $sym39$_CSETF_ITP_SECTION_ITERATOR_SPAN = SubLObjectFactory.makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SPAN");
        $sym40$ITP_SECTION_ITERATOR_SECTION = SubLObjectFactory.makeSymbol("ITP-SECTION-ITERATOR-SECTION");
        $sym41$_CSETF_ITP_SECTION_ITERATOR_SECTION = SubLObjectFactory.makeSymbol("_CSETF-ITP-SECTION-ITERATOR-SECTION");
        $sym42$ITP_SECTION_ITERATOR_CURRENT = SubLObjectFactory.makeSymbol("ITP-SECTION-ITERATOR-CURRENT");
        $sym43$_CSETF_ITP_SECTION_ITERATOR_CURRENT = SubLObjectFactory.makeSymbol("_CSETF-ITP-SECTION-ITERATOR-CURRENT");
        $kw44$PARENT = SubLObjectFactory.makeKeyword("PARENT");
        $kw45$SECTION = SubLObjectFactory.makeKeyword("SECTION");
        $kw46$CURRENT = SubLObjectFactory.makeKeyword("CURRENT");
        $sym47$MAKE_ITP_SECTION_ITERATOR = SubLObjectFactory.makeSymbol("MAKE-ITP-SECTION-ITERATOR");
        $sym48$VISIT_DEFSTRUCT_OBJECT_ITP_SECTION_ITERATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-SECTION-ITERATOR-METHOD");
        $str49$_ITP_SECTION___S_ = SubLObjectFactory.makeString("<ITP-SECTION: ~S>");
        $sym50$ITP_CHILD_ITERATOR = SubLObjectFactory.makeSymbol("ITP-CHILD-ITERATOR");
        $sym51$ITP_CHILD_ITERATOR_P = SubLObjectFactory.makeSymbol("ITP-CHILD-ITERATOR-P");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("ROP-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("SECTION"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARENT"), (SubLObject)SubLObjectFactory.makeKeyword("ROP-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("SECTION"));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITP-CHILD-ITERATOR-PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-CHILD-ITERATOR-ROP-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-CHILD-ITERATOR-SECTION"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ITP-CHILD-ITERATOR-PARENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ITP-CHILD-ITERATOR-SECTION"));
        $sym56$ITP_PRINT_CHILD_ITERATOR = SubLObjectFactory.makeSymbol("ITP-PRINT-CHILD-ITERATOR");
        $sym57$ITP_CHILD_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ITP-CHILD-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ITP-CHILD-ITERATOR-P"));
        $sym59$ITP_CHILD_ITERATOR_PARENT = SubLObjectFactory.makeSymbol("ITP-CHILD-ITERATOR-PARENT");
        $sym60$_CSETF_ITP_CHILD_ITERATOR_PARENT = SubLObjectFactory.makeSymbol("_CSETF-ITP-CHILD-ITERATOR-PARENT");
        $sym61$ITP_CHILD_ITERATOR_ROP_FORMULA = SubLObjectFactory.makeSymbol("ITP-CHILD-ITERATOR-ROP-FORMULA");
        $sym62$_CSETF_ITP_CHILD_ITERATOR_ROP_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-ITP-CHILD-ITERATOR-ROP-FORMULA");
        $sym63$ITP_CHILD_ITERATOR_SECTION = SubLObjectFactory.makeSymbol("ITP-CHILD-ITERATOR-SECTION");
        $sym64$_CSETF_ITP_CHILD_ITERATOR_SECTION = SubLObjectFactory.makeSymbol("_CSETF-ITP-CHILD-ITERATOR-SECTION");
        $kw65$ROP_FORMULA = SubLObjectFactory.makeKeyword("ROP-FORMULA");
        $sym66$MAKE_ITP_CHILD_ITERATOR = SubLObjectFactory.makeSymbol("MAKE-ITP-CHILD-ITERATOR");
        $sym67$VISIT_DEFSTRUCT_OBJECT_ITP_CHILD_ITERATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-CHILD-ITERATOR-METHOD");
        $str68$_ITP_CHILD___S_ = SubLObjectFactory.makeString("<ITP-CHILD: ~S>");
        $kw69$SIMPLE = SubLObjectFactory.makeKeyword("SIMPLE");
        $sym70$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const71$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw72$RANKED = SubLObjectFactory.makeKeyword("RANKED");
        $kw73$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw74$UNAVAILABLE = SubLObjectFactory.makeKeyword("UNAVAILABLE");
        $sym75$RTP_ITERATOR = SubLObjectFactory.makeSymbol("RTP-ITERATOR");
        $sym76$RTP_ITERATOR_P = SubLObjectFactory.makeSymbol("RTP-ITERATOR-P");
        $list77 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("PARSING-MT"), SubLObjectFactory.makeSymbol("SEMANTIC-MT"), SubLObjectFactory.makeSymbol("STRENGTHEN?"), SubLObjectFactory.makeSymbol("MULTIPLE-QUANTIFICATIONS?"), SubLObjectFactory.makeSymbol("WFF-CHECK?"), SubLObjectFactory.makeSymbol("FORCE"), SubLObjectFactory.makeSymbol("RAW-PARSES"), SubLObjectFactory.makeSymbol("RESULT-QUEUE"), SubLObjectFactory.makeSymbol("INITIALIZED"), SubLObjectFactory.makeSymbol("TEMPLATE-CATEGORY"), SubLObjectFactory.makeSymbol("MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("SBHL-RESOURCE") });
        $list78 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("STRING"), SubLObjectFactory.makeKeyword("PARSING-MT"), SubLObjectFactory.makeKeyword("SEMANTIC-MT"), SubLObjectFactory.makeKeyword("STRENGTHEN?"), SubLObjectFactory.makeKeyword("MULTIPLE-QUANTIFICATIONS?"), SubLObjectFactory.makeKeyword("WFF-CHECK?"), SubLObjectFactory.makeKeyword("FORCE"), SubLObjectFactory.makeKeyword("RAW-PARSES"), SubLObjectFactory.makeKeyword("RESULT-QUEUE"), SubLObjectFactory.makeKeyword("INITIALIZED"), SubLObjectFactory.makeKeyword("TEMPLATE-CATEGORY"), SubLObjectFactory.makeKeyword("MEMOIZATION-STATE"), SubLObjectFactory.makeKeyword("SBHL-RESOURCE") });
        $list79 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("RTP-ITERATOR-STRING"), SubLObjectFactory.makeSymbol("RTP-ITERATOR-PARSING-MT"), SubLObjectFactory.makeSymbol("RTP-ITERATOR-SEMANTIC-MT"), SubLObjectFactory.makeSymbol("RTP-ITERATOR-STRENGTHEN?"), SubLObjectFactory.makeSymbol("RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?"), SubLObjectFactory.makeSymbol("RTP-ITERATOR-WFF-CHECK?"), SubLObjectFactory.makeSymbol("RTP-ITERATOR-FORCE"), SubLObjectFactory.makeSymbol("RTP-ITERATOR-RAW-PARSES"), SubLObjectFactory.makeSymbol("RTP-ITERATOR-RESULT-QUEUE"), SubLObjectFactory.makeSymbol("RTP-ITERATOR-INITIALIZED"), SubLObjectFactory.makeSymbol("RTP-ITERATOR-TEMPLATE-CATEGORY"), SubLObjectFactory.makeSymbol("RTP-ITERATOR-MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("RTP-ITERATOR-SBHL-RESOURCE") });
        $list80 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-STRING"), SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-PARSING-MT"), SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-SEMANTIC-MT"), SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-STRENGTHEN?"), SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?"), SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-WFF-CHECK?"), SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-FORCE"), SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-RAW-PARSES"), SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-RESULT-QUEUE"), SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-INITIALIZED"), SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY"), SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-SBHL-RESOURCE") });
        $sym81$RTP_ITERATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RTP-ITERATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RTP-ITERATOR-P"));
        $sym83$RTP_ITERATOR_STRING = SubLObjectFactory.makeSymbol("RTP-ITERATOR-STRING");
        $sym84$_CSETF_RTP_ITERATOR_STRING = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-STRING");
        $sym85$RTP_ITERATOR_PARSING_MT = SubLObjectFactory.makeSymbol("RTP-ITERATOR-PARSING-MT");
        $sym86$_CSETF_RTP_ITERATOR_PARSING_MT = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-PARSING-MT");
        $sym87$RTP_ITERATOR_SEMANTIC_MT = SubLObjectFactory.makeSymbol("RTP-ITERATOR-SEMANTIC-MT");
        $sym88$_CSETF_RTP_ITERATOR_SEMANTIC_MT = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-SEMANTIC-MT");
        $sym89$RTP_ITERATOR_STRENGTHEN_ = SubLObjectFactory.makeSymbol("RTP-ITERATOR-STRENGTHEN?");
        $sym90$_CSETF_RTP_ITERATOR_STRENGTHEN_ = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-STRENGTHEN?");
        $sym91$RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_ = SubLObjectFactory.makeSymbol("RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?");
        $sym92$_CSETF_RTP_ITERATOR_MULTIPLE_QUANTIFICATIONS_ = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-MULTIPLE-QUANTIFICATIONS?");
        $sym93$RTP_ITERATOR_WFF_CHECK_ = SubLObjectFactory.makeSymbol("RTP-ITERATOR-WFF-CHECK?");
        $sym94$_CSETF_RTP_ITERATOR_WFF_CHECK_ = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-WFF-CHECK?");
        $sym95$RTP_ITERATOR_FORCE = SubLObjectFactory.makeSymbol("RTP-ITERATOR-FORCE");
        $sym96$_CSETF_RTP_ITERATOR_FORCE = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-FORCE");
        $sym97$RTP_ITERATOR_RAW_PARSES = SubLObjectFactory.makeSymbol("RTP-ITERATOR-RAW-PARSES");
        $sym98$_CSETF_RTP_ITERATOR_RAW_PARSES = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-RAW-PARSES");
        $sym99$RTP_ITERATOR_RESULT_QUEUE = SubLObjectFactory.makeSymbol("RTP-ITERATOR-RESULT-QUEUE");
        $sym100$_CSETF_RTP_ITERATOR_RESULT_QUEUE = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-RESULT-QUEUE");
        $sym101$RTP_ITERATOR_INITIALIZED = SubLObjectFactory.makeSymbol("RTP-ITERATOR-INITIALIZED");
        $sym102$_CSETF_RTP_ITERATOR_INITIALIZED = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-INITIALIZED");
        $sym103$RTP_ITERATOR_TEMPLATE_CATEGORY = SubLObjectFactory.makeSymbol("RTP-ITERATOR-TEMPLATE-CATEGORY");
        $sym104$_CSETF_RTP_ITERATOR_TEMPLATE_CATEGORY = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-TEMPLATE-CATEGORY");
        $sym105$RTP_ITERATOR_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("RTP-ITERATOR-MEMOIZATION-STATE");
        $sym106$_CSETF_RTP_ITERATOR_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-MEMOIZATION-STATE");
        $sym107$RTP_ITERATOR_SBHL_RESOURCE = SubLObjectFactory.makeSymbol("RTP-ITERATOR-SBHL-RESOURCE");
        $sym108$_CSETF_RTP_ITERATOR_SBHL_RESOURCE = SubLObjectFactory.makeSymbol("_CSETF-RTP-ITERATOR-SBHL-RESOURCE");
        $kw109$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw110$PARSING_MT = SubLObjectFactory.makeKeyword("PARSING-MT");
        $kw111$SEMANTIC_MT = SubLObjectFactory.makeKeyword("SEMANTIC-MT");
        $kw112$STRENGTHEN_ = SubLObjectFactory.makeKeyword("STRENGTHEN?");
        $kw113$MULTIPLE_QUANTIFICATIONS_ = SubLObjectFactory.makeKeyword("MULTIPLE-QUANTIFICATIONS?");
        $kw114$WFF_CHECK_ = SubLObjectFactory.makeKeyword("WFF-CHECK?");
        $kw115$FORCE = SubLObjectFactory.makeKeyword("FORCE");
        $kw116$RAW_PARSES = SubLObjectFactory.makeKeyword("RAW-PARSES");
        $kw117$RESULT_QUEUE = SubLObjectFactory.makeKeyword("RESULT-QUEUE");
        $kw118$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $kw119$TEMPLATE_CATEGORY = SubLObjectFactory.makeKeyword("TEMPLATE-CATEGORY");
        $kw120$MEMOIZATION_STATE = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE");
        $kw121$SBHL_RESOURCE = SubLObjectFactory.makeKeyword("SBHL-RESOURCE");
        $sym122$MAKE_RTP_ITERATOR = SubLObjectFactory.makeSymbol("MAKE-RTP-ITERATOR");
        $sym123$VISIT_DEFSTRUCT_OBJECT_RTP_ITERATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RTP-ITERATOR-METHOD");
        $sym124$RTP_ITERATOR_DONE = SubLObjectFactory.makeSymbol("RTP-ITERATOR-DONE");
        $sym125$RTP_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("RTP-ITERATOR-NEXT");
        $const126$RKFParsingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFParsingMt"));
        $kw127$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $const128$STemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate"));
        $kw129$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $const130$QuestionTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuestionTemplate"));
        $kw131$QUESTION = SubLObjectFactory.makeKeyword("QUESTION");
        $sym132$EL_WFF_ = SubLObjectFactory.makeSymbol("EL-WFF?");
        $kw133$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
    }
    
    public static final class $itp_result_iterator_native extends SubLStructNative
    {
        public SubLObject $style;
        public SubLObject $parses;
        public SubLObject $span;
        public SubLObject $section_iterator;
        private static final SubLStructDeclNative structDecl;
        
        public $itp_result_iterator_native() {
            this.$style = (SubLObject)CommonSymbols.NIL;
            this.$parses = (SubLObject)CommonSymbols.NIL;
            this.$span = (SubLObject)CommonSymbols.NIL;
            this.$section_iterator = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$itp_result_iterator_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$style;
        }
        
        public SubLObject getField3() {
            return this.$parses;
        }
        
        public SubLObject getField4() {
            return this.$span;
        }
        
        public SubLObject getField5() {
            return this.$section_iterator;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$style = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$parses = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$span = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$section_iterator = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$itp_result_iterator_native.class, rtp_iterators.$sym0$ITP_RESULT_ITERATOR, rtp_iterators.$sym1$ITP_RESULT_ITERATOR_P, rtp_iterators.$list2, rtp_iterators.$list3, new String[] { "$style", "$parses", "$span", "$section_iterator" }, rtp_iterators.$list4, rtp_iterators.$list5, rtp_iterators.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $itp_result_iterator_p$UnaryFunction extends UnaryFunction
    {
        public $itp_result_iterator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITP-RESULT-ITERATOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_iterators.itp_result_iterator_p(arg1);
        }
    }
    
    public static final class $itp_section_iterator_native extends SubLStructNative
    {
        public SubLObject $parent;
        public SubLObject $span;
        public SubLObject $section;
        public SubLObject $current;
        private static final SubLStructDeclNative structDecl;
        
        public $itp_section_iterator_native() {
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$span = (SubLObject)CommonSymbols.NIL;
            this.$section = (SubLObject)CommonSymbols.NIL;
            this.$current = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$itp_section_iterator_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$parent;
        }
        
        public SubLObject getField3() {
            return this.$span;
        }
        
        public SubLObject getField4() {
            return this.$section;
        }
        
        public SubLObject getField5() {
            return this.$current;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$parent = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$span = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$section = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$current = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$itp_section_iterator_native.class, rtp_iterators.$sym27$ITP_SECTION_ITERATOR, rtp_iterators.$sym28$ITP_SECTION_ITERATOR_P, rtp_iterators.$list29, rtp_iterators.$list30, new String[] { "$parent", "$span", "$section", "$current" }, rtp_iterators.$list31, rtp_iterators.$list32, rtp_iterators.$sym33$ITP_PRINT_SECTION_ITERATOR);
        }
    }
    
    public static final class $itp_section_iterator_p$UnaryFunction extends UnaryFunction
    {
        public $itp_section_iterator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITP-SECTION-ITERATOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_iterators.itp_section_iterator_p(arg1);
        }
    }
    
    public static final class $itp_child_iterator_native extends SubLStructNative
    {
        public SubLObject $parent;
        public SubLObject $rop_formula;
        public SubLObject $section;
        private static final SubLStructDeclNative structDecl;
        
        public $itp_child_iterator_native() {
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$rop_formula = (SubLObject)CommonSymbols.NIL;
            this.$section = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$itp_child_iterator_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$parent;
        }
        
        public SubLObject getField3() {
            return this.$rop_formula;
        }
        
        public SubLObject getField4() {
            return this.$section;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$parent = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$rop_formula = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$section = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$itp_child_iterator_native.class, rtp_iterators.$sym50$ITP_CHILD_ITERATOR, rtp_iterators.$sym51$ITP_CHILD_ITERATOR_P, rtp_iterators.$list52, rtp_iterators.$list53, new String[] { "$parent", "$rop_formula", "$section" }, rtp_iterators.$list54, rtp_iterators.$list55, rtp_iterators.$sym56$ITP_PRINT_CHILD_ITERATOR);
        }
    }
    
    public static final class $itp_child_iterator_p$UnaryFunction extends UnaryFunction
    {
        public $itp_child_iterator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITP-CHILD-ITERATOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_iterators.itp_child_iterator_p(arg1);
        }
    }
    
    public static final class $rtp_iterator_native extends SubLStructNative
    {
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
        
        public $rtp_iterator_native() {
            this.$string = (SubLObject)CommonSymbols.NIL;
            this.$parsing_mt = (SubLObject)CommonSymbols.NIL;
            this.$semantic_mt = (SubLObject)CommonSymbols.NIL;
            this.$strengthenP = (SubLObject)CommonSymbols.NIL;
            this.$multiple_quantificationsP = (SubLObject)CommonSymbols.NIL;
            this.$wff_checkP = (SubLObject)CommonSymbols.NIL;
            this.$force = (SubLObject)CommonSymbols.NIL;
            this.$raw_parses = (SubLObject)CommonSymbols.NIL;
            this.$result_queue = (SubLObject)CommonSymbols.NIL;
            this.$initialized = (SubLObject)CommonSymbols.NIL;
            this.$template_category = (SubLObject)CommonSymbols.NIL;
            this.$memoization_state = (SubLObject)CommonSymbols.NIL;
            this.$sbhl_resource = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rtp_iterator_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$string;
        }
        
        public SubLObject getField3() {
            return this.$parsing_mt;
        }
        
        public SubLObject getField4() {
            return this.$semantic_mt;
        }
        
        public SubLObject getField5() {
            return this.$strengthenP;
        }
        
        public SubLObject getField6() {
            return this.$multiple_quantificationsP;
        }
        
        public SubLObject getField7() {
            return this.$wff_checkP;
        }
        
        public SubLObject getField8() {
            return this.$force;
        }
        
        public SubLObject getField9() {
            return this.$raw_parses;
        }
        
        public SubLObject getField10() {
            return this.$result_queue;
        }
        
        public SubLObject getField11() {
            return this.$initialized;
        }
        
        public SubLObject getField12() {
            return this.$template_category;
        }
        
        public SubLObject getField13() {
            return this.$memoization_state;
        }
        
        public SubLObject getField14() {
            return this.$sbhl_resource;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$string = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$parsing_mt = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$semantic_mt = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$strengthenP = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$multiple_quantificationsP = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$wff_checkP = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$force = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$raw_parses = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$result_queue = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$initialized = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$template_category = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$memoization_state = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$sbhl_resource = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rtp_iterator_native.class, rtp_iterators.$sym75$RTP_ITERATOR, rtp_iterators.$sym76$RTP_ITERATOR_P, rtp_iterators.$list77, rtp_iterators.$list78, new String[] { "$string", "$parsing_mt", "$semantic_mt", "$strengthenP", "$multiple_quantificationsP", "$wff_checkP", "$force", "$raw_parses", "$result_queue", "$initialized", "$template_category", "$memoization_state", "$sbhl_resource" }, rtp_iterators.$list79, rtp_iterators.$list80, rtp_iterators.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $rtp_iterator_p$UnaryFunction extends UnaryFunction
    {
        public $rtp_iterator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RTP-ITERATOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_iterators.rtp_iterator_p(arg1);
        }
    }
}

/*

	Total time: 317 ms
	
*/