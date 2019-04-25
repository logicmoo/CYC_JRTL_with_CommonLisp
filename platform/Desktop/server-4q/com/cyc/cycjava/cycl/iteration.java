package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class iteration extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.iteration";
    public static final String myFingerPrint = "a88134f42506e1e7401358fb69407f82e18bc51c973877839ceeac2afa576248";
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLSymbol $dtp_iterator$;
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1961L)
    private static SubLSymbol $within_print_iterator$;
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 54087L)
    public static SubLSymbol $xform_fn_param_do_not_pass$;
    private static final SubLSymbol $sym0$ITERATOR;
    private static final SubLSymbol $sym1$ITERATOR_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_ITERATOR;
    private static final SubLSymbol $sym7$ITERATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$IT_STATE;
    private static final SubLSymbol $sym10$_CSETF_IT_STATE;
    private static final SubLSymbol $sym11$IT_DONE;
    private static final SubLSymbol $sym12$_CSETF_IT_DONE;
    private static final SubLSymbol $sym13$IT_NEXT;
    private static final SubLSymbol $sym14$_CSETF_IT_NEXT;
    private static final SubLSymbol $sym15$IT_FINALIZE;
    private static final SubLSymbol $sym16$_CSETF_IT_FINALIZE;
    private static final SubLSymbol $kw17$STATE;
    private static final SubLSymbol $kw18$DONE;
    private static final SubLSymbol $kw19$NEXT;
    private static final SubLSymbol $kw20$FINALIZE;
    private static final SubLString $str21$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw22$BEGIN;
    private static final SubLSymbol $sym23$MAKE_ITERATOR;
    private static final SubLSymbol $kw24$SLOT;
    private static final SubLSymbol $kw25$END;
    private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_ITERATOR_METHOD;
    private static final SubLString $str27$_DONE_;
    private static final SubLString $str28$_;
    private static final SubLSymbol $sym29$TRUE;
    private static final SubLSymbol $sym30$HL_STORE_ITERATOR_NEXT;
    private static final SubLSymbol $sym31$FILTER_ITERATOR_NEXT;
    private static final SubLSymbol $sym32$FILTER_ITERATOR_WITHOUT_VALUES_NEXT;
    private static final SubLSymbol $sym33$ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER;
    private static final SubLSymbol $sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL;
    private static final SubLString $str35$_NEXT;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $kw38$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $sym39$ITERATOR_VAR;
    private static final SubLSymbol $sym40$CLET;
    private static final SubLSymbol $sym41$DO_ITERATOR;
    private static final SubLSymbol $sym42$DONE_VAR;
    private static final SubLSymbol $sym43$VALID;
    private static final SubLSymbol $sym44$UNTIL;
    private static final SubLSymbol $sym45$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym46$ITERATION_NEXT;
    private static final SubLSymbol $sym47$PWHEN;
    private static final SubLSymbol $sym48$CSETQ;
    private static final SubLSymbol $sym49$COR;
    private static final SubLSymbol $sym50$CNOT;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$INVALID_TOKEN;
    private static final SubLSymbol $kw54$PROGRESS_MESSAGE;
    private static final SubLSymbol $sym55$NOTING_PROGRESS;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$ITERATOR_VAR;
    private static final SubLSymbol $sym61$DONE_VAR;
    private static final SubLSymbol $sym62$TOKEN_VAR;
    private static final SubLSymbol $sym63$VALID;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$COUNT;
    private static final SubLSymbol $sym66$NEW_DONE;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$__;
    private static final SubLSymbol $sym69$PROGN;
    private static final SubLSymbol $sym70$CINC;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$COPY_TREE;
    private static final SubLSymbol $sym73$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym74$FALSE;
    private static final SubLSymbol $sym75$NULL;
    private static final SubLSymbol $sym76$ITERATE_NON_NULL_SINGLETON_NEXT;
    private static final SubLSymbol $sym77$INTEGERP;
    private static final SubLSymbol $sym78$NUMBERP;
    private static final SubLSymbol $sym79$ITERATE_NUMBER_DONE;
    private static final SubLSymbol $sym80$ITERATE_NUMBER_NEXT;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$ITERATE_LIST_NEXT;
    private static final SubLSymbol $sym83$LISTP;
    private static final SubLSymbol $sym84$ITERATE_LIST_DONE;
    private static final SubLSymbol $sym85$LIST_ITERATOR_P;
    private static final SubLSymbol $sym86$ITERATE_INFERENCE_LIST_NEXT;
    private static final SubLSymbol $sym87$ITERATE_INFERENCE_LIST_DONE;
    private static final SubLSymbol $sym88$INFERENCE_LIST_ITERATOR_P;
    private static final SubLSymbol $sym89$EXPRESSION_HAS_INFERENCE_EXCEPTED_ASSERTION__ITERATION_HELPER;
    private static final SubLSymbol $sym90$ALIST_P;
    private static final SubLSymbol $sym91$CONS_TO_TUPLE;
    private static final SubLSymbol $sym92$VECTORP;
    private static final SubLSymbol $sym93$DEFAULT_ITERATOR_DONE_P;
    private static final SubLSymbol $sym94$ITERATE_VECTOR_NEXT;
    private static final SubLList $list95;
    private static final SubLSymbol $kw96$UNINITIALIZED;
    private static final SubLSymbol $sym97$ITERATE_VECTOR_INDEX_NEXT;
    private static final SubLSymbol $sym98$STRINGP;
    private static final SubLSymbol $sym99$SEQUENCEP;
    private static final SubLString $str100$_S_was_not_a_sequence;
    private static final SubLSymbol $sym101$HASH_TABLE_P;
    private static final SubLSymbol $sym102$ITERATOR_HASH_TABLE_DONE;
    private static final SubLSymbol $sym103$ITERATOR_HASH_TABLE_NEXT;
    private static final SubLSymbol $kw104$KEY;
    private static final SubLSymbol $kw105$VALUE;
    private static final SubLList $list106;
    private static final SubLList $list107;
    private static final SubLList $list108;
    private static final SubLSymbol $sym109$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym110$FILE_FORM_ITERATOR_DONE_;
    private static final SubLSymbol $sym111$FILE_FORM_ITERATOR_NEXT;
    private static final SubLSymbol $sym112$FILE_FORM_ITERATOR_FINALIZE;
    private static final SubLSymbol $kw113$INPUT;
    private static final SubLSymbol $kw114$EOF;
    private static final SubLList $list115;
    private static final SubLSymbol $kw116$CLOSED;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$LAZY_ITERATOR_DONE;
    private static final SubLSymbol $sym119$LAZY_ITERATOR_NEXT;
    private static final SubLList $list120;
    private static final SubLString $str121$_A_is_not_a_well_formed_uninitial;
    private static final SubLSymbol $sym122$CYC_API_EVAL;
    private static final SubLSymbol $sym123$CONSP;
    private static final SubLSymbol $sym124$ITERATE_INDIRECT_FINALIZE;
    private static final SubLSymbol $sym125$ITERATE_INDIRECT_NEXT;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$ITERATE_FACTORY_FINALIZE;
    private static final SubLSymbol $sym128$ITERATE_FACTORY_NEXT;
    private static final SubLSymbol $kw129$START;
    private static final SubLList $list130;
    private static final SubLSymbol $kw131$CONSTRUCT;
    private static final SubLList $list132;
    private static final SubLSymbol $kw133$SUBITERATE;
    private static final SubLSymbol $sym134$META_ITERATOR_ITERATOR_DONE;
    private static final SubLSymbol $sym135$META_ITERATOR_ITERATOR_NEXT;
    private static final SubLSymbol $sym136$META_ITERATOR_ITERATOR_FINALIZE;
    private static final SubLSymbol $kw137$EXHAUSTED;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$ITERATOR_ITERATOR_DONE;
    private static final SubLSymbol $sym140$ITERATOR_ITERATOR_NEXT;
    private static final SubLSymbol $sym141$ITERATOR_ITERATOR_FINALIZE;
    private static final SubLSymbol $sym142$ROTATING_ITERATOR_ITERATOR_DONE;
    private static final SubLSymbol $sym143$ROTATING_ITERATOR_ITERATOR_NEXT;
    private static final SubLSymbol $sym144$ROTATING_ITERATOR_ITERATOR_FINALIZE;
    private static final SubLString $str145$;
    private static final SubLString $str146$invalid_lazy_iterator_found_in_me;
    private static final SubLString $str147$in_make_rotating_iterator_iterato;
    private static final SubLList $list148;
    private static final SubLSymbol $kw149$INITIAL;
    private static final SubLSymbol $sym150$REUSABLE_ITERATOR_DONE;
    private static final SubLSymbol $sym151$REUSABLE_ITERATOR_NEXT;
    private static final SubLSymbol $sym152$REUSABLE_ITERATOR_FINALIZE;
    private static final SubLList $list153;
    private static final SubLSymbol $kw154$REUSE;
    private static final SubLString $str155$Unknown_mode___a_;
    private static final SubLSymbol $sym156$REUSABLE_ITERATOR_FROM_ITERATOR_DONE;
    private static final SubLSymbol $sym157$REUSABLE_ITERATOR_FROM_ITERATOR_NEXT;
    private static final SubLSymbol $sym158$REUSABLE_ITERATOR_FROM_ITERATOR_FINALIZE;
    private static final SubLList $list159;
    private static final SubLList $list160;
    private static final SubLSymbol $kw161$RESET;
    private static final SubLSymbol $sym162$RESET_REUSABLE_ITERATOR;
    private static final SubLSymbol $sym163$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_DONE;
    private static final SubLSymbol $sym164$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_NEXT;
    private static final SubLSymbol $sym165$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_FINALIZE;
    private static final SubLList $list166;
    private static final SubLSymbol $sym167$FILTER_ITERATOR_FINALIZE;
    private static final SubLSymbol $sym168$FILTER_AND_TRANSFORM_ITERATOR_NEXT;
    private static final SubLList $list169;
    private static final SubLList $list170;
    private static final SubLString $str171$YOU_SHALL_NOT_PASS;
    private static final SubLSymbol $sym172$XFORM_ITERATOR_DONE;
    private static final SubLSymbol $sym173$XFORM_ITERATOR_NEXT;
    private static final SubLSymbol $sym174$XFORM_ITERATOR_FINALIZE;
    private static final SubLList $list175;
    private static final SubLSymbol $sym176$ITERATE_XML_TOKEN_NEXT;
    private static final SubLSymbol $sym177$XML_TOKEN_ITERATOR_P;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject iterator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_iterator(v_object, stream, (SubLObject)iteration.ZERO_INTEGER);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject iterator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $iterator_native.class) ? iteration.T : iteration.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject it_state(final SubLObject v_object) {
        assert iteration.NIL != iterator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject it_done(final SubLObject v_object) {
        assert iteration.NIL != iterator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject it_next(final SubLObject v_object) {
        assert iteration.NIL != iterator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject it_finalize(final SubLObject v_object) {
        assert iteration.NIL != iterator_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject _csetf_it_state(final SubLObject v_object, final SubLObject value) {
        assert iteration.NIL != iterator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject _csetf_it_done(final SubLObject v_object, final SubLObject value) {
        assert iteration.NIL != iterator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject _csetf_it_next(final SubLObject v_object, final SubLObject value) {
        assert iteration.NIL != iterator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject _csetf_it_finalize(final SubLObject v_object, final SubLObject value) {
        assert iteration.NIL != iterator_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject make_iterator(SubLObject arglist) {
        if (arglist == iteration.UNPROVIDED) {
            arglist = (SubLObject)iteration.NIL;
        }
        final SubLObject v_new = (SubLObject)new $iterator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)iteration.NIL, next = arglist; iteration.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)iteration.$kw17$STATE)) {
                _csetf_it_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iteration.$kw18$DONE)) {
                _csetf_it_done(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iteration.$kw19$NEXT)) {
                _csetf_it_next(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)iteration.$kw20$FINALIZE)) {
                _csetf_it_finalize(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)iteration.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject visit_defstruct_iterator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)iteration.$kw22$BEGIN, (SubLObject)iteration.$sym23$MAKE_ITERATOR, (SubLObject)iteration.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)iteration.$kw24$SLOT, (SubLObject)iteration.$kw17$STATE, it_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iteration.$kw24$SLOT, (SubLObject)iteration.$kw18$DONE, it_done(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iteration.$kw24$SLOT, (SubLObject)iteration.$kw19$NEXT, it_next(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iteration.$kw24$SLOT, (SubLObject)iteration.$kw20$FINALIZE, it_finalize(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)iteration.$kw25$END, (SubLObject)iteration.$sym23$MAKE_ITERATOR, (SubLObject)iteration.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 1840L)
    public static SubLObject visit_defstruct_object_iterator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_iterator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 2090L)
    public static SubLObject print_iterator(final SubLObject iterator, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (iteration.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(iterator, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, iterator, (SubLObject)iteration.T, (SubLObject)iteration.T);
            final SubLObject _prev_bind_0 = iteration.$within_print_iterator$.currentBinding(thread);
            try {
                iteration.$within_print_iterator$.bind((SubLObject)iteration.T, thread);
                if (iteration.NIL != it_done(iterator) && iteration.NIL == lazy_iterator_uninitializedP(iterator) && iteration.NIL != iteration_done(iterator)) {
                    streams_high.write_string((SubLObject)iteration.$str27$_DONE_, stream, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED);
                }
            }
            finally {
                iteration.$within_print_iterator$.rebind(_prev_bind_0, thread);
            }
            if (iteration.NIL != it_next(iterator)) {
                streams_high.write_string(iterator_type_name(iterator), stream, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED);
                streams_high.write_string((SubLObject)iteration.$str28$_, stream, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED);
            }
            print_macros.print_unreadable_object_postamble(stream, iterator, (SubLObject)iteration.T, (SubLObject)iteration.T);
        }
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 2564L)
    public static SubLObject new_iterator(final SubLObject state, final SubLObject done, final SubLObject next, SubLObject finalize) {
        if (finalize == iteration.UNPROVIDED) {
            finalize = Symbols.symbol_function((SubLObject)iteration.$sym29$TRUE);
        }
        final SubLObject iterator = make_iterator((SubLObject)iteration.UNPROVIDED);
        _csetf_it_state(iterator, state);
        _csetf_it_done(iterator, done);
        _csetf_it_next(iterator, next);
        _csetf_it_finalize(iterator, finalize);
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 3925L)
    public static SubLObject iteration_done(final SubLObject iterator) {
        assert iteration.NIL != iterator_p(iterator) : iterator;
        return Functions.funcall(it_done(iterator), it_state(iterator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 4116L)
    public static SubLObject iteration_next_funcall(final SubLObject next_func, final SubLObject next_state) {
        if (next_func.eql((SubLObject)iteration.$sym30$HL_STORE_ITERATOR_NEXT)) {
            return hl_interface_infrastructure.hl_store_iterator_next(next_state);
        }
        if (next_func.eql((SubLObject)iteration.$sym31$FILTER_ITERATOR_NEXT)) {
            return filter_iterator_next(next_state);
        }
        if (next_func.eql((SubLObject)iteration.$sym32$FILTER_ITERATOR_WITHOUT_VALUES_NEXT)) {
            return filter_iterator_without_values_next(next_state);
        }
        return Functions.funcall(next_func, next_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 4508L)
    public static SubLObject iteration_next(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert iteration.NIL != iterator_p(iterator) : iterator;
        final SubLObject quitP = Functions.funcall(it_done(iterator), it_state(iterator));
        SubLObject next_state = it_state(iterator);
        SubLObject next_item = (SubLObject)iteration.NIL;
        SubLObject validP = (SubLObject)iteration.NIL;
        if (iteration.NIL == quitP) {
            thread.resetMultipleValues();
            final SubLObject raw_item = iteration_next_funcall(it_next(iterator), next_state);
            final SubLObject raw_state = thread.secondMultipleValue();
            final SubLObject halted_prematurely = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            next_state = raw_state;
            if (iteration.NIL == halted_prematurely) {
                next_item = raw_item;
                validP = (SubLObject)iteration.T;
            }
        }
        if (!next_state.eql(it_state(iterator))) {
            _csetf_it_state(iterator, next_state);
        }
        return subl_promotions.values2(next_item, validP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 5219L)
    public static SubLObject iteration_next_without_values(final SubLObject iterator, SubLObject invalid_token) {
        if (invalid_token == iteration.UNPROVIDED) {
            invalid_token = (SubLObject)iteration.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert iteration.NIL != iterator_p(iterator) : iterator;
        final SubLObject quitP = Functions.funcall(it_done(iterator), it_state(iterator));
        SubLObject next_state = it_state(iterator);
        SubLObject next_item = (SubLObject)iteration.NIL;
        SubLObject validP = (SubLObject)iteration.NIL;
        if (iteration.NIL == quitP) {
            thread.resetMultipleValues();
            final SubLObject raw_item = iteration_next_funcall(it_next(iterator), next_state);
            final SubLObject raw_state = thread.secondMultipleValue();
            final SubLObject halted_prematurely = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            next_state = raw_state;
            if (iteration.NIL == halted_prematurely) {
                next_item = raw_item;
                validP = (SubLObject)iteration.T;
            }
        }
        if (!next_state.eql(it_state(iterator))) {
            _csetf_it_state(iterator, next_state);
        }
        return (iteration.NIL != validP) ? next_item : invalid_token;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 6007L)
    public static SubLObject iteration_next_without_values_macro_helper(final SubLObject iterator, SubLObject invalid_token) {
        if (invalid_token == iteration.UNPROVIDED) {
            invalid_token = (SubLObject)iteration.NIL;
        }
        return iteration_next_without_values(iterator, invalid_token);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 6218L)
    public static SubLObject iteration_finalize(final SubLObject iterator) {
        assert iteration.NIL != iterator_p(iterator) : iterator;
        return Functions.funcall(it_finalize(iterator), it_state(iterator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 6361L)
    public static SubLObject iterator_type_name(final SubLObject iterator) {
        return string_utilities.post_remove(string_utilities.function_to_string(it_next(iterator)), (SubLObject)iteration.$str35$_NEXT, (SubLObject)iteration.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 6716L)
    public static SubLObject iteration_state_peek(final SubLObject iterator) {
        assert iteration.NIL != iterator_p(iterator) : iterator;
        return it_state(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 6985L)
    public static SubLObject iteration_next_peek(final SubLObject iterator) {
        assert iteration.NIL != iterator_p(iterator) : iterator;
        return it_next(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 7255L)
    public static SubLObject do_iterator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)iteration.NIL;
        SubLObject iterator = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list36);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list36);
        iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)iteration.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)iteration.NIL;
        SubLObject current_$1 = (SubLObject)iteration.NIL;
        while (iteration.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iteration.$list36);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iteration.$list36);
            if (iteration.NIL == conses_high.member(current_$1, (SubLObject)iteration.$list37, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED)) {
                bad = (SubLObject)iteration.T;
            }
            if (current_$1 == iteration.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (iteration.NIL != bad && iteration.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)iteration.$list36);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)iteration.$kw18$DONE, current);
        final SubLObject done = (SubLObject)((iteration.NIL != done_tail) ? conses_high.cadr(done_tail) : iteration.NIL);
        final SubLObject body;
        current = (body = temp);
        if (!iterator.isSymbol()) {
            final SubLObject iterator_var = (SubLObject)iteration.$sym39$ITERATOR_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)iteration.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator_var, iterator)), (SubLObject)ConsesLow.listS((SubLObject)iteration.$sym41$DO_ITERATOR, (SubLObject)ConsesLow.list(var, iterator_var, (SubLObject)iteration.$kw18$DONE, done), ConsesLow.append(body, (SubLObject)iteration.NIL)));
        }
        final SubLObject done_var = (SubLObject)iteration.$sym42$DONE_VAR;
        final SubLObject valid = (SubLObject)iteration.$sym43$VALID;
        return (SubLObject)ConsesLow.list((SubLObject)iteration.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(done_var, done)), (SubLObject)ConsesLow.list((SubLObject)iteration.$sym44$UNTIL, done_var, (SubLObject)ConsesLow.list((SubLObject)iteration.$sym45$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(var, valid), (SubLObject)ConsesLow.list((SubLObject)iteration.$sym46$ITERATION_NEXT, iterator), (SubLObject)ConsesLow.listS((SubLObject)iteration.$sym47$PWHEN, valid, ConsesLow.append(body, (SubLObject)iteration.NIL)), (SubLObject)ConsesLow.list((SubLObject)iteration.$sym48$CSETQ, done_var, (SubLObject)((iteration.NIL != done) ? ConsesLow.list((SubLObject)iteration.$sym49$COR, (SubLObject)ConsesLow.list((SubLObject)iteration.$sym50$CNOT, valid), done) : ConsesLow.list((SubLObject)iteration.$sym50$CNOT, valid))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 8032L)
    public static SubLObject do_iterator_without_values_progress(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list51);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)iteration.NIL;
        SubLObject iterator = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list51);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list51);
        iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)iteration.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)iteration.NIL;
        SubLObject current_$2 = (SubLObject)iteration.NIL;
        while (iteration.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iteration.$list51);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iteration.$list51);
            if (iteration.NIL == conses_high.member(current_$2, (SubLObject)iteration.$list52, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED)) {
                bad = (SubLObject)iteration.T;
            }
            if (current_$2 == iteration.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (iteration.NIL != bad && iteration.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)iteration.$list51);
        }
        final SubLObject invalid_token_tail = cdestructuring_bind.property_list_member((SubLObject)iteration.$kw53$INVALID_TOKEN, current);
        final SubLObject invalid_token = (SubLObject)((iteration.NIL != invalid_token_tail) ? conses_high.cadr(invalid_token_tail) : iteration.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)iteration.$kw18$DONE, current);
        final SubLObject done = (SubLObject)((iteration.NIL != done_tail) ? conses_high.cadr(done_tail) : iteration.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)iteration.$kw54$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((iteration.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : iteration.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)iteration.$sym55$NOTING_PROGRESS, progress_message, (SubLObject)ConsesLow.listS((SubLObject)iteration.$sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(var, iterator, (SubLObject)iteration.$kw53$INVALID_TOKEN, invalid_token, (SubLObject)iteration.$kw18$DONE, done), (SubLObject)iteration.$list56, ConsesLow.append(body, (SubLObject)iteration.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 8530L)
    public static SubLObject do_iterator_without_values(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)iteration.NIL;
        SubLObject iterator = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list57);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list57);
        iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)iteration.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)iteration.NIL;
        SubLObject current_$3 = (SubLObject)iteration.NIL;
        while (iteration.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iteration.$list57);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iteration.$list57);
            if (iteration.NIL == conses_high.member(current_$3, (SubLObject)iteration.$list58, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED)) {
                bad = (SubLObject)iteration.T;
            }
            if (current_$3 == iteration.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (iteration.NIL != bad && iteration.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)iteration.$list57);
        }
        final SubLObject invalid_token_tail = cdestructuring_bind.property_list_member((SubLObject)iteration.$kw53$INVALID_TOKEN, current);
        final SubLObject invalid_token = (SubLObject)((iteration.NIL != invalid_token_tail) ? conses_high.cadr(invalid_token_tail) : iteration.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)iteration.$kw18$DONE, current);
        final SubLObject done = (SubLObject)((iteration.NIL != done_tail) ? conses_high.cadr(done_tail) : iteration.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)iteration.$sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(var, iterator, (SubLObject)iteration.$kw53$INVALID_TOKEN, invalid_token, (SubLObject)iteration.$kw18$DONE, done), ConsesLow.append(body, (SubLObject)iteration.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 8913L)
    public static SubLObject do_iterator_without_values_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)iteration.NIL;
        SubLObject iterator = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list57);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list57);
        iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)iteration.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)iteration.NIL;
        SubLObject current_$4 = (SubLObject)iteration.NIL;
        while (iteration.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iteration.$list57);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iteration.$list57);
            if (iteration.NIL == conses_high.member(current_$4, (SubLObject)iteration.$list58, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED)) {
                bad = (SubLObject)iteration.T;
            }
            if (current_$4 == iteration.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (iteration.NIL != bad && iteration.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)iteration.$list57);
        }
        final SubLObject invalid_token_tail = cdestructuring_bind.property_list_member((SubLObject)iteration.$kw53$INVALID_TOKEN, current);
        final SubLObject invalid_token = (SubLObject)((iteration.NIL != invalid_token_tail) ? conses_high.cadr(invalid_token_tail) : iteration.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)iteration.$kw18$DONE, current);
        final SubLObject done = (SubLObject)((iteration.NIL != done_tail) ? conses_high.cadr(done_tail) : iteration.NIL);
        final SubLObject body;
        current = (body = temp);
        if (!iterator.isSymbol()) {
            final SubLObject iterator_var = (SubLObject)iteration.$sym60$ITERATOR_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)iteration.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator_var, iterator)), (SubLObject)ConsesLow.listS((SubLObject)iteration.$sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)ConsesLow.list(var, iterator_var, (SubLObject)iteration.$kw53$INVALID_TOKEN, invalid_token, (SubLObject)iteration.$kw18$DONE, done), ConsesLow.append(body, (SubLObject)iteration.NIL)));
        }
        final SubLObject done_var = (SubLObject)iteration.$sym61$DONE_VAR;
        final SubLObject token_var = (SubLObject)iteration.$sym62$TOKEN_VAR;
        final SubLObject valid = (SubLObject)iteration.$sym63$VALID;
        return (SubLObject)ConsesLow.list((SubLObject)iteration.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(done_var, done), (SubLObject)ConsesLow.list(token_var, invalid_token)), (SubLObject)ConsesLow.list((SubLObject)iteration.$sym44$UNTIL, done_var, (SubLObject)ConsesLow.list((SubLObject)iteration.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)iteration.$sym33$ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER, iterator, token_var)), (SubLObject)ConsesLow.list(valid, (SubLObject)ConsesLow.list((SubLObject)iteration.$sym50$CNOT, (SubLObject)ConsesLow.list((SubLObject)iteration.EQ, token_var, var)))), (SubLObject)ConsesLow.listS((SubLObject)iteration.$sym47$PWHEN, valid, ConsesLow.append(body, (SubLObject)iteration.NIL)), (SubLObject)ConsesLow.list((SubLObject)iteration.$sym48$CSETQ, done_var, (SubLObject)((iteration.NIL != done) ? ConsesLow.list((SubLObject)iteration.$sym49$COR, (SubLObject)ConsesLow.list((SubLObject)iteration.$sym50$CNOT, valid), done) : ConsesLow.list((SubLObject)iteration.$sym50$CNOT, valid))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 10097L)
    public static SubLObject do_n_iterator_objects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)iteration.NIL;
        SubLObject n = (SubLObject)iteration.NIL;
        SubLObject iterator = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list64);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list64);
        n = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list64);
        iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)iteration.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)iteration.NIL;
        SubLObject current_$5 = (SubLObject)iteration.NIL;
        while (iteration.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iteration.$list64);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iteration.$list64);
            if (iteration.NIL == conses_high.member(current_$5, (SubLObject)iteration.$list37, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED)) {
                bad = (SubLObject)iteration.T;
            }
            if (current_$5 == iteration.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (iteration.NIL != bad && iteration.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)iteration.$list64);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)iteration.$kw18$DONE, current);
        final SubLObject done = (SubLObject)((iteration.NIL != done_tail) ? conses_high.cadr(done_tail) : iteration.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject count = (SubLObject)iteration.$sym65$COUNT;
        final SubLObject new_done = (SubLObject)iteration.$sym66$NEW_DONE;
        return (SubLObject)ConsesLow.list((SubLObject)iteration.$sym40$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(count, (SubLObject)iteration.$list67), (SubLObject)ConsesLow.list(new_done, (SubLObject)ConsesLow.list((SubLObject)iteration.$sym49$COR, done, (SubLObject)ConsesLow.list((SubLObject)iteration.$sym68$__, count, n)))), (SubLObject)ConsesLow.list((SubLObject)iteration.$sym41$DO_ITERATOR, (SubLObject)ConsesLow.list(var, iterator, (SubLObject)iteration.$kw18$DONE, new_done), reader.bq_cons((SubLObject)iteration.$sym69$PROGN, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)iteration.$sym70$CINC, count), (SubLObject)ConsesLow.list((SubLObject)iteration.$sym47$PWHEN, (SubLObject)ConsesLow.list((SubLObject)iteration.$sym49$COR, done, (SubLObject)ConsesLow.list((SubLObject)iteration.$sym68$__, count, n)), (SubLObject)ConsesLow.listS((SubLObject)iteration.$sym48$CSETQ, new_done, (SubLObject)iteration.$list71)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 10607L)
    public static SubLObject map_iterator(final SubLObject function, final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)iteration.NIL; iteration.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject item = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iteration.NIL != valid) {
                Functions.funcall(function, item);
            }
        }
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 10793L)
    public static SubLObject copy_iterator(final SubLObject iterator, SubLObject copy_function) {
        if (copy_function == iteration.UNPROVIDED) {
            copy_function = (SubLObject)iteration.$sym72$COPY_TREE;
        }
        assert iteration.NIL != iterator_p(iterator) : iterator;
        assert iteration.NIL != Types.function_spec_p(copy_function) : copy_function;
        final SubLObject state = it_state(iterator);
        final SubLObject done = it_done(iterator);
        final SubLObject next = it_next(iterator);
        final SubLObject finalize = it_finalize(iterator);
        final SubLObject new_state = Functions.funcall(copy_function, state);
        return new_iterator(new_state, done, next, finalize);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 11258L)
    public static SubLObject iterator_value_list(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)iteration.NIL;
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)iteration.NIL; iteration.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject value = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iteration.NIL != valid) {
                result = (SubLObject)ConsesLow.cons(value, result);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 11464L)
    public static SubLObject generic_producer(final SubLObject iterator, final SubLObject action, SubLObject suspend) {
        if (suspend == iteration.UNPROVIDED) {
            suspend = Symbols.symbol_function((SubLObject)iteration.$sym74$FALSE);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert iteration.NIL != iterator_p(iterator) : iterator;
        if (iteration.NIL != suspend && !suspend.eql(Symbols.symbol_function((SubLObject)iteration.$sym74$FALSE))) {
            while (iteration.NIL != Functions.funcall(suspend)) {}
        }
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)iteration.NIL; iteration.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject item = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iteration.NIL != valid) {
                Functions.funcall(action, item);
                if (iteration.NIL != suspend && !suspend.eql(Symbols.symbol_function((SubLObject)iteration.$sym74$FALSE))) {
                    while (iteration.NIL != Functions.funcall(suspend)) {}
                }
            }
        }
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 12121L)
    public static SubLObject new_null_iterator() {
        return new_list_iterator((SubLObject)iteration.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 12470L)
    public static SubLObject new_singleton_iterator(final SubLObject item) {
        if (iteration.NIL == item) {
            return new_list_iterator((SubLObject)ConsesLow.list(item));
        }
        return new_iterator(item, (SubLObject)iteration.$sym75$NULL, (SubLObject)iteration.$sym76$ITERATE_NON_NULL_SINGLETON_NEXT, (SubLObject)iteration.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 12878L)
    public static SubLObject iterate_non_null_singleton_next(final SubLObject state) {
        return subl_promotions.values3(state, (SubLObject)iteration.NIL, (SubLObject)iteration.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 12982L)
    public static SubLObject new_integer_iterator(SubLObject start, SubLObject end, SubLObject delta) {
        if (start == iteration.UNPROVIDED) {
            start = (SubLObject)iteration.ZERO_INTEGER;
        }
        if (end == iteration.UNPROVIDED) {
            end = (SubLObject)iteration.NIL;
        }
        if (delta == iteration.UNPROVIDED) {
            delta = (SubLObject)iteration.ONE_INTEGER;
        }
        assert iteration.NIL != Types.integerp(start) : start;
        assert iteration.NIL != Types.integerp(delta) : delta;
        return new_number_iterator(start, end, delta);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 13495L)
    public static SubLObject new_number_iterator(SubLObject start, SubLObject end, SubLObject delta) {
        if (start == iteration.UNPROVIDED) {
            start = (SubLObject)iteration.ZERO_INTEGER;
        }
        if (end == iteration.UNPROVIDED) {
            end = (SubLObject)iteration.NIL;
        }
        if (delta == iteration.UNPROVIDED) {
            delta = (SubLObject)iteration.ONE_INTEGER;
        }
        assert iteration.NIL != Types.numberp(start) : start;
        assert iteration.NIL != Types.numberp(delta) : delta;
        if (iteration.NIL != end && !iteration.assertionsDisabledSynth && iteration.NIL == Types.numberp(end)) {
            throw new AssertionError(end);
        }
        return new_iterator(make_iterator_number_state(start, end, delta), (SubLObject)iteration.$sym79$ITERATE_NUMBER_DONE, (SubLObject)iteration.$sym80$ITERATE_NUMBER_NEXT, (SubLObject)iteration.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 14228L)
    public static SubLObject make_iterator_number_state(final SubLObject start, final SubLObject end, final SubLObject delta) {
        return (SubLObject)ConsesLow.list(start, delta, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 14526L)
    public static SubLObject iterate_number_done(final SubLObject state) {
        SubLObject current_$6 = (SubLObject)iteration.NIL;
        SubLObject delta = (SubLObject)iteration.NIL;
        SubLObject end = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list81);
        current_$6 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list81);
        delta = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list81);
        end = current.first();
        current = current.rest();
        if (iteration.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list81);
            return (SubLObject)iteration.NIL;
        }
        if (iteration.NIL == end) {
            return (SubLObject)iteration.NIL;
        }
        if (delta.isPositive()) {
            return Numbers.numGE(current_$6, end);
        }
        if (delta.isNegative()) {
            return Numbers.numLE(current_$6, end);
        }
        return Numbers.numE(current_$6, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 14789L)
    public static SubLObject iterate_number_next(final SubLObject state) {
        SubLObject current_$7 = (SubLObject)iteration.NIL;
        SubLObject delta = (SubLObject)iteration.NIL;
        SubLObject end = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list81);
        current_$7 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list81);
        delta = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list81);
        end = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            final SubLObject next = current_$7;
            final SubLObject update = Numbers.add(current_$7, delta);
            ConsesLow.rplaca(state, update);
            return subl_promotions.values3(next, state, (SubLObject)iteration.NIL);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list81);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 15026L)
    public static SubLObject list_iterator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL != iterator_p(v_object) && it_next(v_object) == iteration.$sym82$ITERATE_LIST_NEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 15257L)
    public static SubLObject new_list_iterator(final SubLObject list) {
        assert iteration.NIL != Types.listp(list) : list;
        return new_iterator(make_iterator_list_state(list), (SubLObject)iteration.$sym84$ITERATE_LIST_DONE, (SubLObject)iteration.$sym82$ITERATE_LIST_NEXT, (SubLObject)iteration.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 15482L)
    public static SubLObject get_list_iterator_list(final SubLObject iterator) {
        assert iteration.NIL != list_iterator_p(iterator) : iterator;
        return it_state(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 15674L)
    public static SubLObject list_iterator_size(final SubLObject list_iterator) {
        return Sequences.length(get_list_iterator_list(list_iterator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 15856L)
    public static SubLObject make_iterator_list_state(final SubLObject list) {
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 16040L)
    public static SubLObject iterate_list_done(final SubLObject state) {
        return Types.sublisp_null(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 16107L)
    public static SubLObject iterate_list_next(final SubLObject state) {
        final SubLObject next = state.first();
        final SubLObject update = state.rest();
        return subl_promotions.values3(next, update, (SubLObject)iteration.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 16244L)
    public static SubLObject inference_list_iterator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL != iterator_p(v_object) && it_next(v_object) == iteration.$sym86$ITERATE_INFERENCE_LIST_NEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 16668L)
    public static SubLObject new_inference_list_iterator(final SubLObject list) {
        assert iteration.NIL != Types.listp(list) : list;
        return new_iterator(make_inference_iterator_list_state(list), (SubLObject)iteration.$sym87$ITERATE_INFERENCE_LIST_DONE, (SubLObject)iteration.$sym86$ITERATE_INFERENCE_LIST_NEXT, (SubLObject)iteration.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 16933L)
    public static SubLObject get_inference_list_iterator_list(final SubLObject iterator) {
        assert iteration.NIL != inference_list_iterator_p(iterator) : iterator;
        return it_state(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 17145L)
    public static SubLObject inference_list_iterator_size(final SubLObject list_iterator) {
        return Sequences.length(get_inference_list_iterator_list(list_iterator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 17347L)
    public static SubLObject make_inference_iterator_list_state(final SubLObject list) {
        if (iteration.NIL != inference_trampolines.expression_has_inference_excepted_assertionP_iteration_helper(list)) {}
        return Sequences.remove_if((SubLObject)iteration.$sym89$EXPRESSION_HAS_INFERENCE_EXCEPTED_ASSERTION__ITERATION_HELPER, list, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 18124L)
    public static SubLObject iterate_inference_list_done(final SubLObject state) {
        return Types.sublisp_null(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 18201L)
    public static SubLObject iterate_inference_list_next(final SubLObject state) {
        final SubLObject next = state.first();
        final SubLObject update = state.rest();
        return subl_promotions.values3(next, update, (SubLObject)iteration.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 18348L)
    public static SubLObject new_alist_iterator(final SubLObject alist) {
        assert iteration.NIL != list_utilities.alist_p(alist) : alist;
        return new_indirect_iterator(new_list_iterator(alist), (SubLObject)iteration.$sym91$CONS_TO_TUPLE, (SubLObject)iteration.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 18727L)
    public static SubLObject new_vector_iterator(final SubLObject vector) {
        assert iteration.NIL != Types.vectorp(vector) : vector;
        return new_iterator(make_iterator_vector_state(vector), (SubLObject)iteration.$sym93$DEFAULT_ITERATOR_DONE_P, (SubLObject)iteration.$sym94$ITERATE_VECTOR_NEXT, (SubLObject)iteration.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 19214L)
    public static SubLObject make_iterator_vector_state(final SubLObject vector) {
        final SubLObject current = (SubLObject)iteration.ZERO_INTEGER;
        return (SubLObject)ConsesLow.list(current, vector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 19450L)
    public static SubLObject iterate_vector_next(final SubLObject state) {
        SubLObject current_$8 = (SubLObject)iteration.NIL;
        SubLObject vector = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list95);
        current_$8 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list95);
        vector = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            final SubLObject next = Vectors.aref(vector, current_$8);
            SubLObject update = Numbers.add((SubLObject)iteration.ONE_INTEGER, current_$8);
            if (update.numE(Sequences.length(vector))) {
                update = (SubLObject)iteration.$kw18$DONE;
                ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, (SubLObject)iteration.$kw96$UNINITIALIZED);
            }
            ConsesLow.rplaca(state, update);
            return subl_promotions.values2(next, state);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list95);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 19805L)
    public static SubLObject new_vector_index_iterator(final SubLObject vector) {
        assert iteration.NIL != Types.vectorp(vector) : vector;
        return new_iterator(make_iterator_vector_index_state(vector), (SubLObject)iteration.$sym93$DEFAULT_ITERATOR_DONE_P, (SubLObject)iteration.$sym97$ITERATE_VECTOR_INDEX_NEXT, (SubLObject)iteration.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 20205L)
    public static SubLObject make_iterator_vector_index_state(final SubLObject vector) {
        final SubLObject current = (SubLObject)iteration.ZERO_INTEGER;
        return (SubLObject)ConsesLow.list(current, vector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 20521L)
    public static SubLObject iterate_vector_index_next(final SubLObject state) {
        SubLObject current_$9 = (SubLObject)iteration.NIL;
        SubLObject vector = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list95);
        current_$9 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list95);
        vector = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            final SubLObject next_id = current_$9;
            final SubLObject next_value = Vectors.aref(vector, current_$9);
            final SubLObject next = (SubLObject)ConsesLow.list(next_id, next_value);
            SubLObject update = Numbers.add((SubLObject)iteration.ONE_INTEGER, current_$9);
            if (update.numE(Sequences.length(vector))) {
                update = (SubLObject)iteration.$kw18$DONE;
                ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, (SubLObject)iteration.$kw96$UNINITIALIZED);
            }
            ConsesLow.rplaca(state, update);
            return subl_promotions.values2(next, state);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list95);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 20975L)
    public static SubLObject new_string_iterator(final SubLObject string) {
        assert iteration.NIL != Types.stringp(string) : string;
        return new_list_iterator(string_utilities.string_to_char_list(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 21329L)
    public static SubLObject new_sequence_iterator(SubLObject sequence, SubLObject start, SubLObject end) {
        if (start == iteration.UNPROVIDED) {
            start = (SubLObject)iteration.ZERO_INTEGER;
        }
        if (end == iteration.UNPROVIDED) {
            end = (SubLObject)iteration.NIL;
        }
        assert iteration.NIL != Types.sequencep(sequence) : sequence;
        if (!start.numE((SubLObject)iteration.ZERO_INTEGER) || iteration.NIL != end) {
            sequence = Sequences.subseq(sequence, start, end);
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
        return Errors.error((SubLObject)iteration.$str100$_S_was_not_a_sequence, sequence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 21986L)
    public static SubLObject new_hash_table_iterator(final SubLObject hash_table) {
        assert iteration.NIL != Types.hash_table_p(hash_table) : hash_table;
        return new_iterator(make_iterator_hash_table_state(hash_table), (SubLObject)iteration.$sym102$ITERATOR_HASH_TABLE_DONE, (SubLObject)iteration.$sym103$ITERATOR_HASH_TABLE_NEXT, (SubLObject)iteration.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 22393L)
    public static SubLObject new_hash_table_keys_iterator(final SubLObject hash_table) {
        assert iteration.NIL != Types.hash_table_p(hash_table) : hash_table;
        return new_list_iterator(hash_table_utilities.hash_table_keys(hash_table));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 22600L)
    public static SubLObject new_hash_table_values_iterator(final SubLObject hash_table) {
        assert iteration.NIL != Types.hash_table_p(hash_table) : hash_table;
        return new_list_iterator(hash_table_utilities.hash_table_values(hash_table));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 22813L)
    public static SubLObject make_iterator_hash_table_state(final SubLObject hash_table) {
        final SubLObject current = hash_table_utilities.hash_table_keys(hash_table);
        final SubLObject key_value_tuple = (SubLObject)ConsesLow.list((SubLObject)iteration.$kw104$KEY, (SubLObject)iteration.$kw105$VALUE);
        return (SubLObject)ConsesLow.list(current, hash_table, key_value_tuple);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 23341L)
    public static SubLObject iterator_hash_table_done(final SubLObject state) {
        SubLObject current_$10 = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list106);
        current_$10 = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        return Types.sublisp_null(current_$10);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 23486L)
    public static SubLObject iterator_hash_table_next(final SubLObject state) {
        SubLObject current_$11 = (SubLObject)iteration.NIL;
        SubLObject hash_table = (SubLObject)iteration.NIL;
        SubLObject key_value_tuple = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list107);
        current_$11 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list107);
        hash_table = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list107);
        key_value_tuple = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            SubLObject current_$12;
            final SubLObject datum_$12 = current_$12 = current_$11;
            SubLObject next_key = (SubLObject)iteration.NIL;
            SubLObject rest_keys = (SubLObject)iteration.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$12, datum_$12, (SubLObject)iteration.$list108);
            next_key = current_$12.first();
            current_$12 = (rest_keys = current_$12.rest());
            final SubLObject next_value = Hashtables.gethash(next_key, hash_table, (SubLObject)iteration.UNPROVIDED);
            final SubLObject update = rest_keys;
            ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, key_value_tuple, next_key);
            ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, key_value_tuple, next_value);
            if (iteration.NIL == update) {
                ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, (SubLObject)iteration.$kw96$UNINITIALIZED);
            }
            ConsesLow.rplaca(state, update);
            return subl_promotions.values3(key_value_tuple, state, (SubLObject)iteration.NIL);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list107);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 23996L)
    public static SubLObject new_file_form_iterator(final SubLObject filename, SubLObject start, SubLObject end) {
        if (start == iteration.UNPROVIDED) {
            start = (SubLObject)iteration.ZERO_INTEGER;
        }
        if (end == iteration.UNPROVIDED) {
            end = (SubLObject)iteration.NIL;
        }
        assert iteration.NIL != Types.stringp(filename) : filename;
        assert iteration.NIL != subl_promotions.non_negative_integer_p(start) : start;
        if (iteration.NIL != end && !iteration.assertionsDisabledSynth && iteration.NIL == subl_promotions.non_negative_integer_p(end)) {
            throw new AssertionError(end);
        }
        return new_iterator(make_file_form_iterator_state(filename, start, end), (SubLObject)iteration.$sym110$FILE_FORM_ITERATOR_DONE_, (SubLObject)iteration.$sym111$FILE_FORM_ITERATOR_NEXT, (SubLObject)iteration.$sym112$FILE_FORM_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 24608L)
    public static SubLObject make_file_form_iterator_state(final SubLObject filename, SubLObject start, SubLObject end) {
        if (start == iteration.UNPROVIDED) {
            start = (SubLObject)iteration.ZERO_INTEGER;
        }
        if (end == iteration.UNPROVIDED) {
            end = (SubLObject)iteration.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)iteration.NIL;
        SubLObject index = (SubLObject)iteration.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)iteration.NIL;
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
        try {
            stream_macros.$stream_requires_locking$.bind((SubLObject)iteration.NIL, thread);
            stream = compatibility.open_text(filename, (SubLObject)iteration.$kw113$INPUT);
        }
        finally {
            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
        }
        SubLObject i;
        SubLObject form;
        for (i = (SubLObject)iteration.NIL, i = (SubLObject)iteration.ZERO_INTEGER; i.numL(start); i = Numbers.add(i, (SubLObject)iteration.ONE_INTEGER)) {
            form = reader.read(stream, (SubLObject)iteration.NIL, (SubLObject)iteration.$kw114$EOF, (SubLObject)iteration.UNPROVIDED);
            if (form == iteration.$kw114$EOF) {
                doneP = (SubLObject)iteration.T;
            }
            else {
                index = Numbers.add(index, (SubLObject)iteration.ONE_INTEGER);
            }
        }
        final SubLObject state = (SubLObject)ConsesLow.list(stream, index, end, doneP);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 25052L)
    public static SubLObject file_form_iterator_doneP(final SubLObject state) {
        SubLObject stream = (SubLObject)iteration.NIL;
        SubLObject index = (SubLObject)iteration.NIL;
        SubLObject end = (SubLObject)iteration.NIL;
        SubLObject doneP = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list115);
        stream = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list115);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list115);
        end = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list115);
        doneP = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL != doneP || (iteration.NIL != end && index.numGE(end)) || !stream.isStream() || iteration.NIL == streams_high.open_stream_p(stream));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list115);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 25287L)
    public static SubLObject file_form_iterator_next(final SubLObject state) {
        SubLObject stream = (SubLObject)iteration.NIL;
        SubLObject index = (SubLObject)iteration.NIL;
        SubLObject end = (SubLObject)iteration.NIL;
        SubLObject doneP = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list115);
        stream = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list115);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list115);
        end = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list115);
        doneP = current.first();
        current = current.rest();
        if (iteration.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list115);
            return (SubLObject)iteration.NIL;
        }
        final SubLObject form = reader.read(stream, (SubLObject)iteration.NIL, (SubLObject)iteration.$kw114$EOF, (SubLObject)iteration.UNPROVIDED);
        if (form == iteration.$kw114$EOF) {
            streams_high.close(stream, (SubLObject)iteration.UNPROVIDED);
            stream = (SubLObject)iteration.$kw116$CLOSED;
            doneP = (SubLObject)iteration.T;
            ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, stream);
            ConsesLow.set_nth((SubLObject)iteration.THREE_INTEGER, state, doneP);
            return subl_promotions.values3((SubLObject)iteration.NIL, state, (SubLObject)iteration.T);
        }
        index = Numbers.add(index, (SubLObject)iteration.ONE_INTEGER);
        ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, index);
        return subl_promotions.values3(form, state, (SubLObject)iteration.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 25742L)
    public static SubLObject file_form_iterator_finalize(final SubLObject state) {
        SubLObject stream = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list117);
        stream = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        if (stream.isStream() && iteration.NIL != streams_high.open_stream_p(stream)) {
            streams_high.close(stream, (SubLObject)iteration.UNPROVIDED);
            stream = (SubLObject)iteration.$kw116$CLOSED;
            ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, stream);
            ConsesLow.set_nth((SubLObject)iteration.THREE_INTEGER, state, (SubLObject)iteration.T);
            return (SubLObject)iteration.T;
        }
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 26082L)
    public static SubLObject new_lazy_iterator(final SubLObject constructor, final SubLObject arg_forms) {
        assert iteration.NIL != Types.function_spec_p(constructor) : constructor;
        assert iteration.NIL != Types.listp(arg_forms) : arg_forms;
        final SubLObject lazy_iterator = new_iterator((SubLObject)iteration.NIL, Symbols.symbol_function((SubLObject)iteration.$sym118$LAZY_ITERATOR_DONE), Symbols.symbol_function((SubLObject)iteration.$sym119$LAZY_ITERATOR_NEXT), (SubLObject)iteration.UNPROVIDED);
        _csetf_it_state(lazy_iterator, (SubLObject)ConsesLow.list(lazy_iterator, constructor, arg_forms));
        return lazy_iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 27110L)
    public static SubLObject lazy_iterator_uninitializedP(final SubLObject iterator) {
        assert iteration.NIL != iterator_p(iterator) : iterator;
        return Equality.eq(it_done(iterator), Symbols.symbol_function((SubLObject)iteration.$sym118$LAZY_ITERATOR_DONE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 27327L)
    public static SubLObject lazy_iterator_valid_uninitializedP(final SubLObject iterator) {
        assert iteration.NIL != iterator_p(iterator) : iterator;
        if (!it_state(iterator).isCons() || !it_done(iterator).eql(Symbols.symbol_function((SubLObject)iteration.$sym118$LAZY_ITERATOR_DONE)) || !it_next(iterator).eql(Symbols.symbol_function((SubLObject)iteration.$sym119$LAZY_ITERATOR_NEXT))) {
            return (SubLObject)iteration.NIL;
        }
        if (iterator.eql(it_state(iterator).first())) {
            return (SubLObject)iteration.T;
        }
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 27755L)
    public static SubLObject initialize_lazy_iterator(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lazy_iterator = (SubLObject)iteration.NIL;
        SubLObject constructor = (SubLObject)iteration.NIL;
        SubLObject arg_forms = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list120);
        lazy_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list120);
        constructor = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list120);
        arg_forms = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            if (iteration.NIL == iteration.$within_print_iterator$.getDynamicValue(thread) && iteration.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && iteration.NIL == lazy_iterator_valid_uninitializedP(lazy_iterator)) {
                Errors.error((SubLObject)iteration.$str121$_A_is_not_a_well_formed_uninitial, lazy_iterator);
            }
            final SubLObject args = Mapping.mapcar((SubLObject)iteration.$sym122$CYC_API_EVAL, arg_forms);
            SubLObject iterator = Functions.apply(constructor, args);
            SubLObject doneP = (SubLObject)iteration.NIL;
            while (iteration.NIL == doneP) {
                if (iteration.NIL != lazy_iterator_valid_uninitializedP(iterator)) {
                    iterator = initialize_lazy_iterator(it_state(iterator));
                }
                else {
                    doneP = (SubLObject)iteration.T;
                }
            }
            _csetf_it_state(lazy_iterator, it_state(iterator));
            _csetf_it_done(lazy_iterator, it_done(iterator));
            _csetf_it_next(lazy_iterator, it_next(iterator));
            _csetf_it_finalize(lazy_iterator, it_finalize(iterator));
            return lazy_iterator;
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list120);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 28762L)
    public static SubLObject lazy_iterator_done(final SubLObject state) {
        assert iteration.NIL != Types.consp(state) : state;
        return iteration_done(initialize_lazy_iterator(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 28996L)
    public static SubLObject lazy_iterator_next(final SubLObject state) {
        assert iteration.NIL != Types.consp(state) : state;
        return iteration_next(initialize_lazy_iterator(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 29235L)
    public static SubLObject new_indirect_iterator(final SubLObject iterator, SubLObject transform, SubLObject finalize) {
        if (transform == iteration.UNPROVIDED) {
            transform = Symbols.symbol_function((SubLObject)iteration.IDENTITY);
        }
        if (finalize == iteration.UNPROVIDED) {
            finalize = (SubLObject)iteration.$sym124$ITERATE_INDIRECT_FINALIZE;
        }
        assert iteration.NIL != iterator_p(iterator) : iterator;
        assert iteration.NIL != Types.function_spec_p(transform) : transform;
        return new_iterator(make_iterator_indirect_state(iterator, transform), (SubLObject)iteration.$sym93$DEFAULT_ITERATOR_DONE_P, (SubLObject)iteration.$sym125$ITERATE_INDIRECT_NEXT, finalize);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 29798L)
    public static SubLObject make_iterator_indirect_state(final SubLObject iterator, final SubLObject transform) {
        return (SubLObject)ConsesLow.list(iterator, misc_utilities.function_spec_function(transform));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 30090L)
    public static SubLObject iterate_indirect_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_$14 = (SubLObject)iteration.NIL;
        SubLObject transform = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list126);
        current_$14 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list126);
        transform = current.first();
        current = current.rest();
        if (iteration.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list126);
            return (SubLObject)iteration.NIL;
        }
        thread.resetMultipleValues();
        SubLObject next = iteration_next(current_$14);
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (iteration.NIL == valid) {
            final SubLObject update = (SubLObject)iteration.$kw18$DONE;
            ConsesLow.rplaca(state, update);
            ConsesLow.rplacd(state, (SubLObject)iteration.NIL);
            return subl_promotions.values3((SubLObject)iteration.NIL, state, (SubLObject)iteration.T);
        }
        if (!Symbols.symbol_function((SubLObject)iteration.IDENTITY).eql(transform)) {
            next = Functions.funcall(transform, next);
        }
        return subl_promotions.values3(next, state, (SubLObject)iteration.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 30569L)
    public static SubLObject iterate_indirect_finalize(final SubLObject state) {
        final SubLObject current = state.first();
        return (SubLObject)((iteration.NIL != iterator_p(current)) ? iteration_finalize(current) : iteration.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 30738L)
    public static SubLObject new_factory_iterator(final SubLObject constructors, SubLObject data, SubLObject finalize) {
        if (data == iteration.UNPROVIDED) {
            data = (SubLObject)iteration.NIL;
        }
        if (finalize == iteration.UNPROVIDED) {
            finalize = (SubLObject)iteration.$sym127$ITERATE_FACTORY_FINALIZE;
        }
        assert iteration.NIL != Types.listp(constructors) : constructors;
        return new_iterator(make_iterator_factory_state(constructors, data), (SubLObject)iteration.$sym93$DEFAULT_ITERATOR_DONE_P, (SubLObject)iteration.$sym128$ITERATE_FACTORY_NEXT, finalize);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 31235L)
    public static SubLObject make_iterator_factory_state(final SubLObject constructors, final SubLObject data) {
        final SubLObject current = (SubLObject)iteration.$kw96$UNINITIALIZED;
        final SubLObject mode = (SubLObject)iteration.$kw129$START;
        return (SubLObject)ConsesLow.list(current, mode, constructors, data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 31610L)
    public static SubLObject iterate_factory_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (true) {
            SubLObject current_$15 = (SubLObject)iteration.NIL;
            SubLObject mode = (SubLObject)iteration.NIL;
            SubLObject constructors = (SubLObject)iteration.NIL;
            SubLObject data = (SubLObject)iteration.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list130);
            current_$15 = state.first();
            SubLObject current = state.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list130);
            mode = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list130);
            constructors = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list130);
            data = current.first();
            current = current.rest();
            if (iteration.NIL == current) {
                final SubLObject pcase_var = mode;
                if (pcase_var.eql((SubLObject)iteration.$kw129$START)) {
                    final SubLObject update = (SubLObject)iteration.$kw96$UNINITIALIZED;
                    final SubLObject new_mode = (SubLObject)iteration.$kw131$CONSTRUCT;
                    ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, update);
                    ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, new_mode);
                }
                else if (pcase_var.eql((SubLObject)iteration.$kw131$CONSTRUCT)) {
                    if (iteration.NIL == constructors) {
                        final SubLObject update = (SubLObject)iteration.$kw96$UNINITIALIZED;
                        final SubLObject new_mode = (SubLObject)iteration.$kw18$DONE;
                        ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, update);
                        ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, new_mode);
                        ConsesLow.set_nth((SubLObject)iteration.THREE_INTEGER, state, (SubLObject)iteration.$kw96$UNINITIALIZED);
                    }
                    else {
                        SubLObject current_$16;
                        final SubLObject datum_$16 = current_$16 = constructors;
                        SubLObject next_constructor = (SubLObject)iteration.NIL;
                        SubLObject rest_constructors = (SubLObject)iteration.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$16, datum_$16, (SubLObject)iteration.$list132);
                        next_constructor = current_$16.first();
                        current_$16 = (rest_constructors = current_$16.rest());
                        final SubLObject update2 = Functions.apply(next_constructor, data);
                        final SubLObject new_mode2 = (SubLObject)iteration.$kw133$SUBITERATE;
                        ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, update2);
                        ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, new_mode2);
                        ConsesLow.set_nth((SubLObject)iteration.TWO_INTEGER, state, rest_constructors);
                    }
                }
                else {
                    if (pcase_var.eql((SubLObject)iteration.$kw18$DONE)) {
                        return subl_promotions.values3((SubLObject)iteration.NIL, state, (SubLObject)iteration.T);
                    }
                    assert iteration.NIL != iterator_p(current_$15) : current_$15;
                    thread.resetMultipleValues();
                    final SubLObject next = iteration_next(current_$15);
                    final SubLObject valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (iteration.NIL != valid) {
                        return subl_promotions.values3(next, state, (SubLObject)iteration.NIL);
                    }
                    final SubLObject update3 = (SubLObject)iteration.$kw96$UNINITIALIZED;
                    final SubLObject new_mode3 = (SubLObject)iteration.$kw131$CONSTRUCT;
                    ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, update3);
                    ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, new_mode3);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list130);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 32979L)
    public static SubLObject iterate_factory_finalize(final SubLObject state) {
        SubLObject current_$18 = (SubLObject)iteration.NIL;
        SubLObject mode = (SubLObject)iteration.NIL;
        SubLObject constructors = (SubLObject)iteration.NIL;
        SubLObject data = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list130);
        current_$18 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list130);
        mode = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list130);
        constructors = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list130);
        data = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            return (SubLObject)((iteration.NIL != iterator_p(current_$18)) ? iteration_finalize(current_$18) : iteration.T);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list130);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 33211L)
    public static SubLObject new_meta_iterator_iterator(final SubLObject meta_iterator) {
        assert iteration.NIL != iterator_p(meta_iterator) : meta_iterator;
        final SubLObject state = make_meta_iterator_iterator_state(meta_iterator);
        return new_iterator(state, (SubLObject)iteration.$sym134$META_ITERATOR_ITERATOR_DONE, (SubLObject)iteration.$sym135$META_ITERATOR_ITERATOR_NEXT, (SubLObject)iteration.$sym136$META_ITERATOR_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 33735L)
    public static SubLObject make_meta_iterator_iterator_state(final SubLObject meta_iterator) {
        final SubLObject state = (SubLObject)ConsesLow.list((SubLObject)iteration.$kw137$EXHAUSTED, meta_iterator);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 33884L)
    public static SubLObject meta_iterator_iterator_done(final SubLObject state) {
        SubLObject object_iterator = (SubLObject)iteration.NIL;
        SubLObject meta_iterator = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list138);
        object_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list138);
        meta_iterator = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean((object_iterator == iteration.$kw137$EXHAUSTED || iteration.NIL != iteration_done(object_iterator)) && (meta_iterator == iteration.$kw137$EXHAUSTED || iteration.NIL != iteration_done(meta_iterator)));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list138);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 34183L)
    public static SubLObject meta_iterator_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject object_iterator = (SubLObject)iteration.NIL;
        SubLObject meta_iterator = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list138);
        object_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list138);
        meta_iterator = current.first();
        current = current.rest();
        if (iteration.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list138);
            return (SubLObject)iteration.NIL;
        }
        if (iteration.NIL != iterator_p(object_iterator)) {
            thread.resetMultipleValues();
            final SubLObject next_item = iteration_next(object_iterator);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iteration.NIL != validP) {
                return subl_promotions.values3(next_item, state, (SubLObject)iteration.NIL);
            }
            ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, (SubLObject)iteration.$kw137$EXHAUSTED);
            return meta_iterator_iterator_next(state);
        }
        else {
            if (iteration.NIL == iterator_p(meta_iterator)) {
                return subl_promotions.values3((SubLObject)iteration.NIL, state, (SubLObject)iteration.T);
            }
            thread.resetMultipleValues();
            final SubLObject next_object_iterator = iteration_next(meta_iterator);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iteration.NIL != validP) {
                ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, next_object_iterator);
                return meta_iterator_iterator_next(state);
            }
            ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, (SubLObject)iteration.$kw137$EXHAUSTED);
            return subl_promotions.values3((SubLObject)iteration.NIL, state, (SubLObject)iteration.T);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 35253L)
    public static SubLObject meta_iterator_iterator_finalize(final SubLObject state) {
        SubLObject object_iterator = (SubLObject)iteration.NIL;
        SubLObject meta_iterator = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list138);
        object_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list138);
        meta_iterator = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            if (iteration.NIL != iterator_p(object_iterator)) {
                return iteration_finalize(object_iterator);
            }
            if (iteration.NIL != iterator_p(meta_iterator)) {
                return iteration_finalize(meta_iterator);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list138);
        }
        return (SubLObject)iteration.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 35557L)
    public static SubLObject new_iterator_iterator(final SubLObject iterators) {
        assert iteration.NIL != Types.listp(iterators) : iterators;
        if (iteration.NIL == iterators) {
            return new_null_iterator();
        }
        if (iteration.NIL != list_utilities.singletonP(iterators)) {
            return iterators.first();
        }
        final SubLObject state = make_iterator_iterator_state(iterators);
        return new_iterator(state, (SubLObject)iteration.$sym139$ITERATOR_ITERATOR_DONE, (SubLObject)iteration.$sym140$ITERATOR_ITERATOR_NEXT, (SubLObject)iteration.$sym141$ITERATOR_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 36107L)
    public static SubLObject get_iterator_iterator_iterators(final SubLObject iterator) {
        assert iteration.NIL != iterator_p(iterator) : iterator;
        final SubLObject state = it_state(iterator);
        if (iteration.NIL != list_utilities.singletonP(state)) {
            return (SubLObject)ConsesLow.list(state);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 36388L)
    public static SubLObject make_iterator_iterator_state(final SubLObject iterators) {
        SubLObject cdolist_list_var = iterators;
        SubLObject iterator = (SubLObject)iteration.NIL;
        iterator = cdolist_list_var.first();
        while (iteration.NIL != cdolist_list_var) {
            assert iteration.NIL != iterator_p(iterator) : iterator;
            cdolist_list_var = cdolist_list_var.rest();
            iterator = cdolist_list_var.first();
        }
        return iterators;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 36535L)
    public static SubLObject iterator_iterator_done(final SubLObject state) {
        if (iteration.NIL == state) {
            return (SubLObject)iteration.T;
        }
        if (state.isCons()) {
            SubLObject cdolist_list_var = state;
            SubLObject iterator = (SubLObject)iteration.NIL;
            iterator = cdolist_list_var.first();
            while (iteration.NIL != cdolist_list_var) {
                if (iteration.NIL == iteration_done(iterator)) {
                    return (SubLObject)iteration.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                iterator = cdolist_list_var.first();
            }
            return (SubLObject)iteration.T;
        }
        return iteration_done(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 36947L)
    public static SubLObject iterator_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject working_state = state;
        SubLObject next = (SubLObject)iteration.NIL;
        SubLObject valid_nextP = (SubLObject)iteration.NIL;
        SubLObject premature_endP = (SubLObject)iteration.NIL;
        while (iteration.NIL == valid_nextP && iteration.NIL == premature_endP) {
            final SubLObject current = working_state.first();
            if (iteration.NIL != iteration_done(current)) {
                working_state = working_state.rest();
                premature_endP = Types.sublisp_null(working_state);
            }
            else {
                thread.resetMultipleValues();
                final SubLObject value = iteration_next(current);
                final SubLObject validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (iteration.NIL == validP) {
                    continue;
                }
                next = value;
                valid_nextP = (SubLObject)iteration.T;
            }
        }
        return subl_promotions.values3(next, working_state, premature_endP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 37517L)
    public static SubLObject iterator_iterator_finalize(final SubLObject state) {
        SubLObject cdolist_list_var = state;
        SubLObject iterator = (SubLObject)iteration.NIL;
        iterator = cdolist_list_var.first();
        while (iteration.NIL != cdolist_list_var) {
            iteration_finalize(iterator);
            cdolist_list_var = cdolist_list_var.rest();
            iterator = cdolist_list_var.first();
        }
        return (SubLObject)iteration.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 37643L)
    public static SubLObject new_rotating_iterator_iterator(final SubLObject iterators) {
        assert iteration.NIL != Types.listp(iterators) : iterators;
        if (iteration.NIL == iterators) {
            return new_null_iterator();
        }
        if (iteration.NIL != list_utilities.singletonP(iterators)) {
            return iterators.first();
        }
        return new_iterator(make_rotating_iterator_iterator_state(iterators), (SubLObject)iteration.$sym142$ROTATING_ITERATOR_ITERATOR_DONE, (SubLObject)iteration.$sym143$ROTATING_ITERATOR_ITERATOR_NEXT, (SubLObject)iteration.$sym144$ROTATING_ITERATOR_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 38308L)
    public static SubLObject validate_iterators(final SubLObject iterators, SubLObject where_message) {
        if (where_message == iteration.UNPROVIDED) {
            where_message = (SubLObject)iteration.$str145$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert iteration.NIL != Types.listp(iterators) : iterators;
        SubLObject cdolist_list_var = iterators;
        SubLObject iterator = (SubLObject)iteration.NIL;
        iterator = cdolist_list_var.first();
        while (iteration.NIL != cdolist_list_var) {
            assert iteration.NIL != iterator_p(iterator) : iterator;
            if (iteration.NIL == iteration.$within_print_iterator$.getDynamicValue(thread) && iteration.NIL != lazy_iterator_uninitializedP(iterator) && iteration.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && iteration.NIL == lazy_iterator_valid_uninitializedP(iterator)) {
                Errors.error((SubLObject)iteration.$str146$invalid_lazy_iterator_found_in_me, where_message, iterator);
            }
            cdolist_list_var = cdolist_list_var.rest();
            iterator = cdolist_list_var.first();
        }
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 38760L)
    public static SubLObject get_rotating_iterator_iterator_iterators(final SubLObject iterator) {
        assert iteration.NIL != iterator_p(iterator) : iterator;
        return conses_high.second(it_state(iterator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 38992L)
    public static SubLObject make_rotating_iterator_iterator_state(final SubLObject iterators) {
        validate_iterators(iterators, (SubLObject)iteration.$str147$in_make_rotating_iterator_iterato);
        return (SubLObject)ConsesLow.list((SubLObject)iteration.ZERO_INTEGER, iterators);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 39163L)
    public static SubLObject rotating_iterator_iterator_done(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = (SubLObject)iteration.NIL;
        SubLObject iterators = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list148);
        index = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list148);
        iterators = current.first();
        current = current.rest();
        if (iteration.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list148);
            return (SubLObject)iteration.NIL;
        }
        if (iteration.NIL == iterators) {
            return (SubLObject)iteration.T;
        }
        if (iteration.NIL != iteration.$within_print_iterator$.getDynamicValue(thread)) {
            return (SubLObject)iteration.NIL;
        }
        SubLObject cdolist_list_var = iterators;
        SubLObject iterator = (SubLObject)iteration.NIL;
        iterator = cdolist_list_var.first();
        while (iteration.NIL != cdolist_list_var) {
            if (iteration.NIL == iteration_done(iterator)) {
                return (SubLObject)iteration.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            iterator = cdolist_list_var.first();
        }
        return (SubLObject)iteration.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 39489L)
    public static SubLObject rotating_iterator_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = (SubLObject)iteration.NIL;
        SubLObject iterators = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list148);
        index = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list148);
        iterators = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            SubLObject premature_endP = Types.sublisp_null(iterators);
            SubLObject next = (SubLObject)iteration.NIL;
            if (iteration.NIL != list_utilities.lengthLE(iterators, index, (SubLObject)iteration.UNPROVIDED)) {
                index = (SubLObject)iteration.ZERO_INTEGER;
            }
            while (iteration.NIL == next && iteration.NIL == premature_endP) {
                final SubLObject current_$19 = ConsesLow.nth(index, iterators);
                if (iteration.NIL != iteration_done(current_$19)) {
                    iteration_finalize(current_$19);
                    iterators = Sequences.delete(current_$19, iterators, Symbols.symbol_function((SubLObject)iteration.EQ), (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED);
                    if (iteration.NIL == iterators) {
                        premature_endP = (SubLObject)iteration.T;
                    }
                    else {
                        if (iteration.NIL == list_utilities.lengthLE(iterators, index, (SubLObject)iteration.UNPROVIDED)) {
                            continue;
                        }
                        index = (SubLObject)iteration.ZERO_INTEGER;
                    }
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject value = iteration_next(current_$19);
                    final SubLObject validP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (iteration.NIL == validP) {
                        continue;
                    }
                    next = value;
                    index = Numbers.add(index, (SubLObject)iteration.ONE_INTEGER);
                }
            }
            ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, index);
            ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, iterators);
            return subl_promotions.values3(next, state, premature_endP);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list148);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 40308L)
    public static SubLObject rotating_iterator_iterator_finalize(final SubLObject state) {
        SubLObject index = (SubLObject)iteration.NIL;
        SubLObject iterators = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list148);
        index = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list148);
        iterators = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            SubLObject cdolist_list_var = iterators;
            SubLObject iterator = (SubLObject)iteration.NIL;
            iterator = cdolist_list_var.first();
            while (iteration.NIL != cdolist_list_var) {
                iteration_finalize(iterator);
                cdolist_list_var = cdolist_list_var.rest();
                iterator = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list148);
        }
        return (SubLObject)iteration.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 40520L)
    public static SubLObject new_reusable_iterator(final SubLObject state, final SubLObject done, final SubLObject next, SubLObject finalize) {
        if (finalize == iteration.UNPROVIDED) {
            finalize = Symbols.symbol_function((SubLObject)iteration.$sym29$TRUE);
        }
        final SubLObject new_state = (SubLObject)ConsesLow.list(state, (SubLObject)iteration.NIL, (SubLObject)iteration.$kw149$INITIAL, done, next, finalize);
        return new_iterator(new_state, (SubLObject)iteration.$sym150$REUSABLE_ITERATOR_DONE, (SubLObject)iteration.$sym151$REUSABLE_ITERATOR_NEXT, (SubLObject)iteration.$sym152$REUSABLE_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 41603L)
    public static SubLObject reusable_iterator_done(final SubLObject state) {
        SubLObject real_state = (SubLObject)iteration.NIL;
        SubLObject queue = (SubLObject)iteration.NIL;
        SubLObject mode = (SubLObject)iteration.NIL;
        SubLObject done = (SubLObject)iteration.NIL;
        SubLObject next = (SubLObject)iteration.NIL;
        SubLObject finalize = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list153);
        real_state = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        queue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        mode = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        next = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        finalize = current.first();
        current = current.rest();
        if (iteration.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list153);
            return (SubLObject)iteration.NIL;
        }
        final SubLObject pcase_var = mode;
        if (pcase_var.eql((SubLObject)iteration.$kw149$INITIAL)) {
            return Functions.funcall(done, real_state);
        }
        if (pcase_var.eql((SubLObject)iteration.$kw154$REUSE)) {
            return Types.sublisp_null(real_state);
        }
        Errors.warn((SubLObject)iteration.$str155$Unknown_mode___a_, mode);
        return (SubLObject)iteration.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 41949L)
    public static SubLObject reusable_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject real_state = (SubLObject)iteration.NIL;
        SubLObject queue = (SubLObject)iteration.NIL;
        SubLObject mode = (SubLObject)iteration.NIL;
        SubLObject done = (SubLObject)iteration.NIL;
        SubLObject next = (SubLObject)iteration.NIL;
        SubLObject finalize = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list153);
        real_state = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        queue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        mode = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        next = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        finalize = current.first();
        current = current.rest();
        if (iteration.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list153);
            return (SubLObject)iteration.NIL;
        }
        final SubLObject pcase_var = mode;
        if (pcase_var.eql((SubLObject)iteration.$kw149$INITIAL)) {
            SubLObject working_state = real_state;
            SubLObject value = (SubLObject)iteration.NIL;
            SubLObject valid_nextP = (SubLObject)iteration.NIL;
            SubLObject premature_endP = (SubLObject)iteration.NIL;
            while (iteration.NIL == valid_nextP && iteration.NIL == premature_endP) {
                if (iteration.NIL != Functions.funcall(done, working_state)) {
                    premature_endP = (SubLObject)iteration.T;
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject next_value = Functions.funcall(next, working_state);
                    final SubLObject new_real_state = thread.secondMultipleValue();
                    final SubLObject doneP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    working_state = new_real_state;
                    if (iteration.NIL != doneP) {
                        premature_endP = (SubLObject)iteration.T;
                    }
                    else {
                        valid_nextP = (SubLObject)iteration.T;
                        value = next_value;
                    }
                }
            }
            ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, working_state);
            if (iteration.NIL != valid_nextP) {
                ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, ConsesLow.nconc(queue, (SubLObject)ConsesLow.list(value)));
            }
            return subl_promotions.values3(value, state, premature_endP);
        }
        if (pcase_var.eql((SubLObject)iteration.$kw154$REUSE)) {
            ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, real_state.rest());
            return subl_promotions.values3(real_state.first(), state, (SubLObject)iteration.NIL);
        }
        Errors.warn((SubLObject)iteration.$str155$Unknown_mode___a_, mode);
        return subl_promotions.values3((SubLObject)iteration.NIL, (SubLObject)iteration.NIL, (SubLObject)iteration.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 42944L)
    public static SubLObject reusable_iterator_finalize(final SubLObject state) {
        SubLObject real_state = (SubLObject)iteration.NIL;
        SubLObject queue = (SubLObject)iteration.NIL;
        SubLObject mode = (SubLObject)iteration.NIL;
        SubLObject done = (SubLObject)iteration.NIL;
        SubLObject next = (SubLObject)iteration.NIL;
        SubLObject finalize = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list153);
        real_state = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        queue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        mode = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        done = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        next = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list153);
        finalize = current.first();
        current = current.rest();
        if (iteration.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list153);
            return (SubLObject)iteration.NIL;
        }
        final SubLObject pcase_var = mode;
        if (pcase_var.eql((SubLObject)iteration.$kw149$INITIAL)) {
            return Functions.funcall(finalize, real_state);
        }
        if (pcase_var.eql((SubLObject)iteration.$kw154$REUSE)) {
            return (SubLObject)iteration.T;
        }
        Errors.warn((SubLObject)iteration.$str155$Unknown_mode___a_, mode);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 43282L)
    public static SubLObject new_reusable_iterator_from_iterator(final SubLObject iterator) {
        return new_reusable_iterator(iterator, (SubLObject)iteration.$sym156$REUSABLE_ITERATOR_FROM_ITERATOR_DONE, (SubLObject)iteration.$sym157$REUSABLE_ITERATOR_FROM_ITERATOR_NEXT, (SubLObject)iteration.$sym158$REUSABLE_ITERATOR_FROM_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 43532L)
    public static SubLObject reusable_iterator_from_iterator_done(final SubLObject state) {
        return iteration_done(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 43628L)
    public static SubLObject reusable_iterator_from_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject next = iteration_next(state);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values3(next, state, (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL == validP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 43806L)
    public static SubLObject reusable_iterator_from_iterator_finalize(final SubLObject state) {
        return iteration_finalize(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 43910L)
    public static SubLObject new_reusable_list_iterator(final SubLObject list) {
        return new_reusable_iterator(list, (SubLObject)iteration.$sym84$ITERATE_LIST_DONE, (SubLObject)iteration.$sym82$ITERATE_LIST_NEXT, (SubLObject)iteration.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 44054L)
    public static SubLObject reset_reusable_iterator(final SubLObject iterator) {
        assert iteration.NIL != iterator_p(iterator) : iterator;
        final SubLObject state = it_state(iterator);
        final SubLObject pcase_var;
        final SubLObject mode = pcase_var = ConsesLow.nth((SubLObject)iteration.TWO_INTEGER, state);
        if (pcase_var.eql((SubLObject)iteration.$kw149$INITIAL)) {
            finish_reusable_iterator(iterator);
            final SubLObject queue = ConsesLow.nth((SubLObject)iteration.ONE_INTEGER, state);
            ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, queue);
            ConsesLow.set_nth((SubLObject)iteration.TWO_INTEGER, state, (SubLObject)iteration.$kw154$REUSE);
        }
        else if (pcase_var.eql((SubLObject)iteration.$kw154$REUSE)) {
            final SubLObject queue = ConsesLow.nth((SubLObject)iteration.ONE_INTEGER, state);
            ConsesLow.set_nth((SubLObject)iteration.ZERO_INTEGER, state, queue);
        }
        else {
            Errors.warn((SubLObject)iteration.$str155$Unknown_mode___a_, mode);
        }
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 44656L)
    public static SubLObject finish_reusable_iterator(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)iteration.NIL; iteration.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject dummy = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iteration.NIL != valid) {}
        }
        iteration_finalize(iterator);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 44847L)
    public static SubLObject do_reusable_iterator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list159);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)iteration.NIL;
        SubLObject iterator = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list159);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)iteration.$list159);
        iterator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)iteration.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)iteration.NIL;
        SubLObject current_$20 = (SubLObject)iteration.NIL;
        while (iteration.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iteration.$list159);
            current_$20 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)iteration.$list159);
            if (iteration.NIL == conses_high.member(current_$20, (SubLObject)iteration.$list160, (SubLObject)iteration.UNPROVIDED, (SubLObject)iteration.UNPROVIDED)) {
                bad = (SubLObject)iteration.T;
            }
            if (current_$20 == iteration.$kw38$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (iteration.NIL != bad && iteration.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)iteration.$list159);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)iteration.$kw18$DONE, current);
        final SubLObject done = (SubLObject)((iteration.NIL != done_tail) ? conses_high.cadr(done_tail) : iteration.NIL);
        final SubLObject reset_tail = cdestructuring_bind.property_list_member((SubLObject)iteration.$kw161$RESET, current);
        final SubLObject reset = (SubLObject)((iteration.NIL != reset_tail) ? conses_high.cadr(reset_tail) : iteration.T);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)iteration.$sym69$PROGN, (SubLObject)ConsesLow.listS((SubLObject)iteration.$sym41$DO_ITERATOR, (SubLObject)ConsesLow.list(var, iterator, (SubLObject)iteration.$kw18$DONE, done), ConsesLow.append(body, (SubLObject)iteration.NIL)), (SubLObject)ConsesLow.list((SubLObject)iteration.$sym47$PWHEN, reset, (SubLObject)ConsesLow.list((SubLObject)iteration.$sym162$RESET_REUSABLE_ITERATOR, iterator)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 45069L)
    public static SubLObject map_reusable_iterator(final SubLObject function, final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)iteration.NIL; iteration.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject item = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iteration.NIL != valid) {
                Functions.funcall(function, item);
            }
        }
        reset_reusable_iterator(iterator);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 45209L)
    public static SubLObject new_reusable_iterator_cartesian_iterator(final SubLObject reusable_iterators) {
        final SubLObject state = reusable_iterator_cartesian_iterator_state(reusable_iterators);
        return (iteration.NIL != state) ? new_iterator(state, (SubLObject)iteration.$sym163$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_DONE, (SubLObject)iteration.$sym164$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_NEXT, (SubLObject)iteration.$sym165$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_FINALIZE) : new_null_iterator();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 45735L)
    public static SubLObject reusable_iterator_cartesian_iterator_state(final SubLObject iterators) {
        SubLObject nullP = (SubLObject)iteration.NIL;
        if (iteration.NIL == nullP) {
            SubLObject csome_list_var = iterators;
            SubLObject iterator = (SubLObject)iteration.NIL;
            iterator = csome_list_var.first();
            while (iteration.NIL == nullP && iteration.NIL != csome_list_var) {
                if (iteration.NIL != iteration_done(iterator)) {
                    reset_reusable_iterator(iterator);
                    nullP = iteration_done(iterator);
                }
                csome_list_var = csome_list_var.rest();
                iterator = csome_list_var.first();
            }
        }
        return (SubLObject)((iteration.NIL != nullP) ? iteration.NIL : ConsesLow.list(Sequences.reverse(iterators), (SubLObject)iteration.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 46127L)
    public static SubLObject reusable_iterator_cartesian_iterator_done(final SubLObject state) {
        SubLObject reverse_iterators = (SubLObject)iteration.NIL;
        SubLObject reverse_result = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list166);
        reverse_iterators = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list166);
        reverse_result = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            return all_iterators_doneP(reverse_iterators);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list166);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 46337L)
    public static SubLObject all_iterators_doneP(final SubLObject iterators) {
        SubLObject not_doneP = (SubLObject)iteration.NIL;
        if (iteration.NIL == not_doneP) {
            SubLObject csome_list_var = iterators;
            SubLObject iterator = (SubLObject)iteration.NIL;
            iterator = csome_list_var.first();
            while (iteration.NIL == not_doneP && iteration.NIL != csome_list_var) {
                if (iteration.NIL == iteration_done(iterator)) {
                    not_doneP = (SubLObject)iteration.T;
                }
                csome_list_var = csome_list_var.rest();
                iterator = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL == not_doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 46541L)
    public static SubLObject reusable_iterator_cartesian_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reverse_iterators = (SubLObject)iteration.NIL;
        SubLObject reverse_result = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list166);
        reverse_iterators = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list166);
        reverse_result = current.first();
        current = current.rest();
        if (iteration.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list166);
            return (SubLObject)iteration.NIL;
        }
        if (iteration.NIL == reverse_result) {
            reverse_result = (SubLObject)ConsesLow.make_list(Sequences.length(reverse_iterators), (SubLObject)iteration.UNPROVIDED);
            SubLObject list_var = (SubLObject)iteration.NIL;
            SubLObject iterator = (SubLObject)iteration.NIL;
            SubLObject num = (SubLObject)iteration.NIL;
            list_var = reverse_iterators;
            iterator = list_var.first();
            for (num = (SubLObject)iteration.ZERO_INTEGER; iteration.NIL != list_var; list_var = list_var.rest(), iterator = list_var.first(), num = Numbers.add((SubLObject)iteration.ONE_INTEGER, num)) {
                ConsesLow.set_nth(num, reverse_result, iteration_next_without_values(iterator, (SubLObject)iteration.UNPROVIDED));
            }
            ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, reverse_result);
            return subl_promotions.values3(Sequences.reverse(reverse_result), state, (SubLObject)iteration.NIL);
        }
        SubLObject update_finishedP = (SubLObject)iteration.NIL;
        SubLObject list_var2 = (SubLObject)iteration.NIL;
        SubLObject iterator2 = (SubLObject)iteration.NIL;
        SubLObject num2 = (SubLObject)iteration.NIL;
        list_var2 = reverse_iterators;
        iterator2 = list_var2.first();
        for (num2 = (SubLObject)iteration.ZERO_INTEGER; iteration.NIL == update_finishedP && iteration.NIL != list_var2; list_var2 = list_var2.rest(), iterator2 = list_var2.first(), num2 = Numbers.add((SubLObject)iteration.ONE_INTEGER, num2)) {
            if (iteration.NIL != iteration_done(iterator2)) {
                reset_reusable_iterator(iterator2);
            }
            else {
                update_finishedP = (SubLObject)iteration.T;
            }
            thread.resetMultipleValues();
            SubLObject next = iteration_next(iterator2);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iteration.NIL == validP) {
                reset_reusable_iterator(iterator2);
                next = iteration_next_without_values(iterator2, (SubLObject)iteration.UNPROVIDED);
                update_finishedP = (SubLObject)iteration.NIL;
            }
            ConsesLow.set_nth(num2, reverse_result, next);
        }
        ConsesLow.set_nth((SubLObject)iteration.ONE_INTEGER, state, reverse_result);
        return subl_promotions.values3(Sequences.reverse(reverse_result), state, (SubLObject)iteration.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 47679L)
    public static SubLObject reusable_iterator_cartesian_iterator_finalize(final SubLObject state) {
        SubLObject reverse_iterators = (SubLObject)iteration.NIL;
        SubLObject reverse_result = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list166);
        reverse_iterators = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list166);
        reverse_result = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            SubLObject cdolist_list_var = reverse_iterators;
            SubLObject iterator = (SubLObject)iteration.NIL;
            iterator = cdolist_list_var.first();
            while (iteration.NIL != cdolist_list_var) {
                iteration_finalize(iterator);
                cdolist_list_var = cdolist_list_var.rest();
                iterator = cdolist_list_var.first();
            }
            return (SubLObject)iteration.T;
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list166);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 47934L)
    public static SubLObject new_filter_iterator(final SubLObject input_iterator, final SubLObject filter_method, SubLObject filter_args) {
        if (filter_args == iteration.UNPROVIDED) {
            filter_args = (SubLObject)iteration.NIL;
        }
        assert iteration.NIL != iterator_p(input_iterator) : input_iterator;
        assert iteration.NIL != Types.function_spec_p(filter_method) : filter_method;
        assert iteration.NIL != Types.listp(filter_args) : filter_args;
        return new_iterator(make_filter_iterator_state(input_iterator, filter_method, filter_args), (SubLObject)iteration.$sym93$DEFAULT_ITERATOR_DONE_P, (SubLObject)iteration.$sym31$FILTER_ITERATOR_NEXT, (SubLObject)iteration.$sym167$FILTER_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 48628L)
    public static SubLObject new_filter_iterator_without_values(final SubLObject input_iterator, final SubLObject filter_method, SubLObject filter_args, SubLObject invalid_token) {
        if (filter_args == iteration.UNPROVIDED) {
            filter_args = (SubLObject)iteration.NIL;
        }
        if (invalid_token == iteration.UNPROVIDED) {
            invalid_token = (SubLObject)iteration.NIL;
        }
        assert iteration.NIL != iterator_p(input_iterator) : input_iterator;
        assert iteration.NIL != Types.function_spec_p(filter_method) : filter_method;
        assert iteration.NIL != Types.listp(filter_args) : filter_args;
        return new_iterator(make_filter_iterator_without_values_state(input_iterator, filter_method, filter_args, invalid_token), (SubLObject)iteration.$sym93$DEFAULT_ITERATOR_DONE_P, (SubLObject)iteration.$sym32$FILTER_ITERATOR_WITHOUT_VALUES_NEXT, (SubLObject)iteration.$sym167$FILTER_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 49427L)
    public static SubLObject new_filter_and_transform_iterator(final SubLObject input_iterator, final SubLObject filter_and_transform_method, SubLObject filter_and_transform_args) {
        if (filter_and_transform_args == iteration.UNPROVIDED) {
            filter_and_transform_args = (SubLObject)iteration.NIL;
        }
        assert iteration.NIL != iterator_p(input_iterator) : input_iterator;
        assert iteration.NIL != Types.function_spec_p(filter_and_transform_method) : filter_and_transform_method;
        assert iteration.NIL != Types.listp(filter_and_transform_args) : filter_and_transform_args;
        return new_iterator(make_filter_and_tranform_iterator_state(input_iterator, filter_and_transform_method, filter_and_transform_args), (SubLObject)iteration.$sym93$DEFAULT_ITERATOR_DONE_P, (SubLObject)iteration.$sym168$FILTER_AND_TRANSFORM_ITERATOR_NEXT, (SubLObject)iteration.$sym167$FILTER_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 50138L)
    public static SubLObject make_filter_iterator_state(final SubLObject input_iterator, final SubLObject filter_method, final SubLObject filter_args) {
        return (SubLObject)ConsesLow.list(input_iterator, filter_method, filter_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 50468L)
    public static SubLObject make_filter_iterator_without_values_state(final SubLObject input_iterator, final SubLObject filter_method, final SubLObject filter_args, final SubLObject invalid_token) {
        return (SubLObject)ConsesLow.list(input_iterator, filter_method, filter_args, invalid_token);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 50686L)
    public static SubLObject make_filter_and_tranform_iterator_state(final SubLObject input_iterator, final SubLObject filter_method, final SubLObject filter_args) {
        return (SubLObject)ConsesLow.list(input_iterator, filter_method, filter_args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 50874L)
    public static SubLObject filter_iterator_finalize(final SubLObject state) {
        SubLObject current_$21 = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list106);
        current_$21 = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        if (iteration.NIL != iterator_p(current_$21)) {
            iteration_finalize(current_$21);
            return (SubLObject)iteration.T;
        }
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 51076L)
    public static SubLObject filter_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_$22 = (SubLObject)iteration.NIL;
        SubLObject filter_method = (SubLObject)iteration.NIL;
        SubLObject filter_args = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list169);
        current_$22 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list169);
        filter_method = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list169);
        filter_args = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            SubLObject v_answer = (SubLObject)iteration.NIL;
            SubLObject done = (SubLObject)iteration.NIL;
            SubLObject invalid = (SubLObject)iteration.NIL;
            while (iteration.NIL == done) {
                thread.resetMultipleValues();
                final SubLObject next = iteration_next(current_$22);
                final SubLObject valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (iteration.NIL != valid) {
                    if (iteration.NIL == Functions.apply(filter_method, next, filter_args)) {
                        continue;
                    }
                    v_answer = next;
                    done = (SubLObject)iteration.T;
                }
                else {
                    final SubLObject update = (SubLObject)iteration.$kw18$DONE;
                    iteration_finalize(current_$22);
                    ConsesLow.rplaca(state, update);
                    ConsesLow.rplacd(state, (SubLObject)iteration.NIL);
                    done = (SubLObject)iteration.T;
                    invalid = (SubLObject)iteration.T;
                }
            }
            return subl_promotions.values3(v_answer, state, invalid);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list169);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 51821L)
    public static SubLObject filter_iterator_without_values_next(final SubLObject state) {
        SubLObject current_$23 = (SubLObject)iteration.NIL;
        SubLObject filter_method = (SubLObject)iteration.NIL;
        SubLObject filter_args = (SubLObject)iteration.NIL;
        SubLObject invalid_token = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list170);
        current_$23 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list170);
        filter_method = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list170);
        filter_args = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list170);
        invalid_token = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            SubLObject v_answer = (SubLObject)iteration.NIL;
            SubLObject done = (SubLObject)iteration.NIL;
            SubLObject invalid = (SubLObject)iteration.NIL;
            while (iteration.NIL == done) {
                final SubLObject next = iteration_next_without_values(current_$23, invalid_token);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!next.eql(invalid_token));
                if (iteration.NIL != valid) {
                    if (iteration.NIL == Functions.apply(filter_method, next, filter_args)) {
                        continue;
                    }
                    v_answer = next;
                    done = (SubLObject)iteration.T;
                }
                else {
                    final SubLObject update = (SubLObject)iteration.$kw18$DONE;
                    iteration_finalize(current_$23);
                    ConsesLow.rplaca(state, update);
                    ConsesLow.rplacd(state, (SubLObject)iteration.NIL);
                    done = (SubLObject)iteration.T;
                    invalid = (SubLObject)iteration.T;
                }
            }
            return subl_promotions.values3(v_answer, state, invalid);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list170);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 52647L)
    public static SubLObject filter_and_transform_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_$24 = (SubLObject)iteration.NIL;
        SubLObject filter_method = (SubLObject)iteration.NIL;
        SubLObject filter_args = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list169);
        current_$24 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list169);
        filter_method = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list169);
        filter_args = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            SubLObject v_answer = (SubLObject)iteration.NIL;
            SubLObject done = (SubLObject)iteration.NIL;
            SubLObject invalid = (SubLObject)iteration.NIL;
            while (iteration.NIL == done) {
                thread.resetMultipleValues();
                final SubLObject next = iteration_next(current_$24);
                final SubLObject valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (iteration.NIL != valid) {
                    thread.resetMultipleValues();
                    final SubLObject transformed_next = Functions.apply(filter_method, next, filter_args);
                    final SubLObject passed_filterP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (iteration.NIL == passed_filterP) {
                        continue;
                    }
                    v_answer = transformed_next;
                    done = (SubLObject)iteration.T;
                }
                else {
                    final SubLObject update = (SubLObject)iteration.$kw18$DONE;
                    iteration_finalize(current_$24);
                    ConsesLow.rplaca(state, update);
                    ConsesLow.rplacd(state, (SubLObject)iteration.NIL);
                    done = (SubLObject)iteration.T;
                    invalid = (SubLObject)iteration.T;
                }
            }
            return subl_promotions.values3(v_answer, state, invalid);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list169);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 53497L)
    public static SubLObject default_iterator_done_p(final SubLObject state) {
        return Equality.eq((SubLObject)iteration.$kw18$DONE, Sequences.elt(state, (SubLObject)iteration.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 53647L)
    public static SubLObject test_iterate_once(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = (SubLObject)iteration.NIL;
        SubLObject v_answer = (SubLObject)iteration.NIL;
        SubLObject valid;
        for (SubLObject done_var = doneP; iteration.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL == valid || iteration.NIL != doneP)) {
            thread.resetMultipleValues();
            final SubLObject obj = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iteration.NIL != valid) {
                v_answer = obj;
                doneP = (SubLObject)iteration.T;
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 53871L)
    public static SubLObject test_iterate_all(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doneP = (SubLObject)iteration.NIL;
        SubLObject total = (SubLObject)iteration.ZERO_INTEGER;
        SubLObject valid;
        for (SubLObject done_var = doneP; iteration.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL == valid || iteration.NIL != doneP)) {
            thread.resetMultipleValues();
            final SubLObject obj = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iteration.NIL != valid) {
                total = Numbers.add(total, (SubLObject)iteration.ONE_INTEGER);
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 54349L)
    public static SubLObject new_transform_iterator(final SubLObject iterator, final SubLObject xform_fn, SubLObject param) {
        if (param == iteration.UNPROVIDED) {
            param = iteration.$xform_fn_param_do_not_pass$.getGlobalValue();
        }
        return new_iterator(make_xform_iterator_state(iterator, xform_fn, param), (SubLObject)iteration.$sym172$XFORM_ITERATOR_DONE, (SubLObject)iteration.$sym173$XFORM_ITERATOR_NEXT, (SubLObject)iteration.$sym174$XFORM_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 54745L)
    public static SubLObject make_xform_iterator_state(final SubLObject iterator, final SubLObject xform_fn, final SubLObject param) {
        return (SubLObject)ConsesLow.list(iterator, xform_fn, param);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 54855L)
    public static SubLObject xform_iterator_done(final SubLObject state) {
        final SubLObject iterator = state.first();
        return iteration_done(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 54982L)
    public static SubLObject xform_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iterator = (SubLObject)iteration.NIL;
        SubLObject xform_fn = (SubLObject)iteration.NIL;
        SubLObject param = (SubLObject)iteration.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)iteration.$list175);
        iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list175);
        xform_fn = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)iteration.$list175);
        param = current.first();
        current = current.rest();
        if (iteration.NIL == current) {
            thread.resetMultipleValues();
            SubLObject value = iteration_next(iterator);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iteration.NIL != validP) {
                if (iteration.$xform_fn_param_do_not_pass$.getGlobalValue().eql(param)) {
                    value = Functions.funcall(xform_fn, value);
                }
                else {
                    value = Functions.funcall(xform_fn, value, param);
                }
            }
            return subl_promotions.values3(value, state, (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL == validP));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)iteration.$list175);
        return (SubLObject)iteration.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 55408L)
    public static SubLObject xml_token_iterator_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL != iterator_p(v_object) && it_next(v_object) == iteration.$sym176$ITERATE_XML_TOKEN_NEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 55659L)
    public static SubLObject xml_token_iterator_peek(final SubLObject token_iterator) {
        assert iteration.NIL != xml_token_iterator_p(token_iterator) : token_iterator;
        final SubLObject state = it_state(token_iterator);
        return xml_parsing_utilities.xml_token_iterator_state_peek(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/iteration.lisp", position = 55943L)
    public static SubLObject iterator_size_exhaustive(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)iteration.ZERO_INTEGER;
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)iteration.NIL; iteration.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(iteration.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (iteration.NIL != valid) {
                count = Numbers.add(count, (SubLObject)iteration.ONE_INTEGER);
            }
        }
        return count;
    }
    
    public static SubLObject declare_iteration_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterator_print_function_trampoline", "ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterator_p", "ITERATOR-P", 1, 0, false);
        new $iterator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "it_state", "IT-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "it_done", "IT-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "it_next", "IT-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "it_finalize", "IT-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "_csetf_it_state", "_CSETF-IT-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "_csetf_it_done", "_CSETF-IT-DONE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "_csetf_it_next", "_CSETF-IT-NEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "_csetf_it_finalize", "_CSETF-IT-FINALIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_iterator", "MAKE-ITERATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "visit_defstruct_iterator", "VISIT-DEFSTRUCT-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "visit_defstruct_object_iterator_method", "VISIT-DEFSTRUCT-OBJECT-ITERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "print_iterator", "PRINT-ITERATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_iterator", "NEW-ITERATOR", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iteration_done", "ITERATION-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iteration_next_funcall", "ITERATION-NEXT-FUNCALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iteration_next", "ITERATION-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iteration_next_without_values", "ITERATION-NEXT-WITHOUT-VALUES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iteration_next_without_values_macro_helper", "ITERATION-NEXT-WITHOUT-VALUES-MACRO-HELPER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iteration_finalize", "ITERATION-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterator_type_name", "ITERATOR-TYPE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iteration_state_peek", "ITERATION-STATE-PEEK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iteration_next_peek", "ITERATION-NEXT-PEEK", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.iteration", "do_iterator", "DO-ITERATOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.iteration", "do_iterator_without_values_progress", "DO-ITERATOR-WITHOUT-VALUES-PROGRESS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.iteration", "do_iterator_without_values", "DO-ITERATOR-WITHOUT-VALUES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.iteration", "do_iterator_without_values_internal", "DO-ITERATOR-WITHOUT-VALUES-INTERNAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.iteration", "do_n_iterator_objects", "DO-N-ITERATOR-OBJECTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "map_iterator", "MAP-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "copy_iterator", "COPY-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterator_value_list", "ITERATOR-VALUE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "generic_producer", "GENERIC-PRODUCER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_null_iterator", "NEW-NULL-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_singleton_iterator", "NEW-SINGLETON-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_non_null_singleton_next", "ITERATE-NON-NULL-SINGLETON-NEXT", 1, 0, false);
        new $iterate_non_null_singleton_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_integer_iterator", "NEW-INTEGER-ITERATOR", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_number_iterator", "NEW-NUMBER-ITERATOR", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_iterator_number_state", "MAKE-ITERATOR-NUMBER-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_number_done", "ITERATE-NUMBER-DONE", 1, 0, false);
        new $iterate_number_done$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_number_next", "ITERATE-NUMBER-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "list_iterator_p", "LIST-ITERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_list_iterator", "NEW-LIST-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "get_list_iterator_list", "GET-LIST-ITERATOR-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "list_iterator_size", "LIST-ITERATOR-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_iterator_list_state", "MAKE-ITERATOR-LIST-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_list_done", "ITERATE-LIST-DONE", 1, 0, false);
        new $iterate_list_done$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_list_next", "ITERATE-LIST-NEXT", 1, 0, false);
        new $iterate_list_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "inference_list_iterator_p", "INFERENCE-LIST-ITERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_inference_list_iterator", "NEW-INFERENCE-LIST-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "get_inference_list_iterator_list", "GET-INFERENCE-LIST-ITERATOR-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "inference_list_iterator_size", "INFERENCE-LIST-ITERATOR-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_inference_iterator_list_state", "MAKE-INFERENCE-ITERATOR-LIST-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_inference_list_done", "ITERATE-INFERENCE-LIST-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_inference_list_next", "ITERATE-INFERENCE-LIST-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_alist_iterator", "NEW-ALIST-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_vector_iterator", "NEW-VECTOR-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_iterator_vector_state", "MAKE-ITERATOR-VECTOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_vector_next", "ITERATE-VECTOR-NEXT", 1, 0, false);
        new $iterate_vector_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_vector_index_iterator", "NEW-VECTOR-INDEX-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_iterator_vector_index_state", "MAKE-ITERATOR-VECTOR-INDEX-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_vector_index_next", "ITERATE-VECTOR-INDEX-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_string_iterator", "NEW-STRING-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_sequence_iterator", "NEW-SEQUENCE-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_hash_table_iterator", "NEW-HASH-TABLE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_hash_table_keys_iterator", "NEW-HASH-TABLE-KEYS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_hash_table_values_iterator", "NEW-HASH-TABLE-VALUES-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_iterator_hash_table_state", "MAKE-ITERATOR-HASH-TABLE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterator_hash_table_done", "ITERATOR-HASH-TABLE-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterator_hash_table_next", "ITERATOR-HASH-TABLE-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_file_form_iterator", "NEW-FILE-FORM-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_file_form_iterator_state", "MAKE-FILE-FORM-ITERATOR-STATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "file_form_iterator_doneP", "FILE-FORM-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "file_form_iterator_next", "FILE-FORM-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "file_form_iterator_finalize", "FILE-FORM-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_lazy_iterator", "NEW-LAZY-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "lazy_iterator_uninitializedP", "LAZY-ITERATOR-UNINITIALIZED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "lazy_iterator_valid_uninitializedP", "LAZY-ITERATOR-VALID-UNINITIALIZED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "initialize_lazy_iterator", "INITIALIZE-LAZY-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "lazy_iterator_done", "LAZY-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "lazy_iterator_next", "LAZY-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_indirect_iterator", "NEW-INDIRECT-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_iterator_indirect_state", "MAKE-ITERATOR-INDIRECT-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_indirect_next", "ITERATE-INDIRECT-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_indirect_finalize", "ITERATE-INDIRECT-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_factory_iterator", "NEW-FACTORY-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_iterator_factory_state", "MAKE-ITERATOR-FACTORY-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_factory_next", "ITERATE-FACTORY-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterate_factory_finalize", "ITERATE-FACTORY-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_meta_iterator_iterator", "NEW-META-ITERATOR-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_meta_iterator_iterator_state", "MAKE-META-ITERATOR-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "meta_iterator_iterator_done", "META-ITERATOR-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "meta_iterator_iterator_next", "META-ITERATOR-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "meta_iterator_iterator_finalize", "META-ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_iterator_iterator", "NEW-ITERATOR-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "get_iterator_iterator_iterators", "GET-ITERATOR-ITERATOR-ITERATORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_iterator_iterator_state", "MAKE-ITERATOR-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterator_iterator_done", "ITERATOR-ITERATOR-DONE", 1, 0, false);
        new $iterator_iterator_done$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterator_iterator_next", "ITERATOR-ITERATOR-NEXT", 1, 0, false);
        new $iterator_iterator_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterator_iterator_finalize", "ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_rotating_iterator_iterator", "NEW-ROTATING-ITERATOR-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "validate_iterators", "VALIDATE-ITERATORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "get_rotating_iterator_iterator_iterators", "GET-ROTATING-ITERATOR-ITERATOR-ITERATORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_rotating_iterator_iterator_state", "MAKE-ROTATING-ITERATOR-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "rotating_iterator_iterator_done", "ROTATING-ITERATOR-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "rotating_iterator_iterator_next", "ROTATING-ITERATOR-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "rotating_iterator_iterator_finalize", "ROTATING-ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_reusable_iterator", "NEW-REUSABLE-ITERATOR", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "reusable_iterator_done", "REUSABLE-ITERATOR-DONE", 1, 0, false);
        new $reusable_iterator_done$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "reusable_iterator_next", "REUSABLE-ITERATOR-NEXT", 1, 0, false);
        new $reusable_iterator_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "reusable_iterator_finalize", "REUSABLE-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_reusable_iterator_from_iterator", "NEW-REUSABLE-ITERATOR-FROM-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "reusable_iterator_from_iterator_done", "REUSABLE-ITERATOR-FROM-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "reusable_iterator_from_iterator_next", "REUSABLE-ITERATOR-FROM-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "reusable_iterator_from_iterator_finalize", "REUSABLE-ITERATOR-FROM-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_reusable_list_iterator", "NEW-REUSABLE-LIST-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "reset_reusable_iterator", "RESET-REUSABLE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "finish_reusable_iterator", "FINISH-REUSABLE-ITERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.iteration", "do_reusable_iterator", "DO-REUSABLE-ITERATOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "map_reusable_iterator", "MAP-REUSABLE-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_reusable_iterator_cartesian_iterator", "NEW-REUSABLE-ITERATOR-CARTESIAN-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "reusable_iterator_cartesian_iterator_state", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "reusable_iterator_cartesian_iterator_done", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE", 1, 0, false);
        new $reusable_iterator_cartesian_iterator_done$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "all_iterators_doneP", "ALL-ITERATORS-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "reusable_iterator_cartesian_iterator_next", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT", 1, 0, false);
        new $reusable_iterator_cartesian_iterator_next$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "reusable_iterator_cartesian_iterator_finalize", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_filter_iterator", "NEW-FILTER-ITERATOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_filter_iterator_without_values", "NEW-FILTER-ITERATOR-WITHOUT-VALUES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_filter_and_transform_iterator", "NEW-FILTER-AND-TRANSFORM-ITERATOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_filter_iterator_state", "MAKE-FILTER-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_filter_iterator_without_values_state", "MAKE-FILTER-ITERATOR-WITHOUT-VALUES-STATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_filter_and_tranform_iterator_state", "MAKE-FILTER-AND-TRANFORM-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "filter_iterator_finalize", "FILTER-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "filter_iterator_next", "FILTER-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "filter_iterator_without_values_next", "FILTER-ITERATOR-WITHOUT-VALUES-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "filter_and_transform_iterator_next", "FILTER-AND-TRANSFORM-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "default_iterator_done_p", "DEFAULT-ITERATOR-DONE-P", 1, 0, false);
        new $default_iterator_done_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "test_iterate_once", "TEST-ITERATE-ONCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "test_iterate_all", "TEST-ITERATE-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "new_transform_iterator", "NEW-TRANSFORM-ITERATOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "make_xform_iterator_state", "MAKE-XFORM-ITERATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "xform_iterator_done", "XFORM-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "xform_iterator_next", "XFORM-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "xml_token_iterator_p", "XML-TOKEN-ITERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "xml_token_iterator_peek", "XML-TOKEN-ITERATOR-PEEK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.iteration", "iterator_size_exhaustive", "ITERATOR-SIZE-EXHAUSTIVE", 1, 0, false);
        return (SubLObject)iteration.NIL;
    }
    
    public static SubLObject init_iteration_file() {
        iteration.$dtp_iterator$ = SubLFiles.defconstant("*DTP-ITERATOR*", (SubLObject)iteration.$sym0$ITERATOR);
        iteration.$within_print_iterator$ = SubLFiles.defparameter("*WITHIN-PRINT-ITERATOR*", (SubLObject)iteration.NIL);
        iteration.$xform_fn_param_do_not_pass$ = SubLFiles.defconstant("*XFORM-FN-PARAM-DO-NOT-PASS*", Symbols.make_symbol((SubLObject)iteration.$str171$YOU_SHALL_NOT_PASS));
        return (SubLObject)iteration.NIL;
    }
    
    public static SubLObject setup_iteration_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), iteration.$dtp_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)iteration.$sym7$ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)iteration.$list8);
        Structures.def_csetf((SubLObject)iteration.$sym9$IT_STATE, (SubLObject)iteration.$sym10$_CSETF_IT_STATE);
        Structures.def_csetf((SubLObject)iteration.$sym11$IT_DONE, (SubLObject)iteration.$sym12$_CSETF_IT_DONE);
        Structures.def_csetf((SubLObject)iteration.$sym13$IT_NEXT, (SubLObject)iteration.$sym14$_CSETF_IT_NEXT);
        Structures.def_csetf((SubLObject)iteration.$sym15$IT_FINALIZE, (SubLObject)iteration.$sym16$_CSETF_IT_FINALIZE);
        Equality.identity((SubLObject)iteration.$sym0$ITERATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), iteration.$dtp_iterator$.getGlobalValue(), Symbols.symbol_function((SubLObject)iteration.$sym26$VISIT_DEFSTRUCT_OBJECT_ITERATOR_METHOD));
        access_macros.register_macro_helper((SubLObject)iteration.$sym33$ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER, (SubLObject)iteration.$sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL);
        access_macros.register_macro_helper((SubLObject)iteration.$sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, (SubLObject)iteration.$list59);
        utilities_macros.note_funcall_helper_function((SubLObject)iteration.$sym110$FILE_FORM_ITERATOR_DONE_);
        utilities_macros.note_funcall_helper_function((SubLObject)iteration.$sym111$FILE_FORM_ITERATOR_NEXT);
        utilities_macros.note_funcall_helper_function((SubLObject)iteration.$sym112$FILE_FORM_ITERATOR_FINALIZE);
        utilities_macros.note_funcall_helper_function((SubLObject)iteration.$sym134$META_ITERATOR_ITERATOR_DONE);
        utilities_macros.note_funcall_helper_function((SubLObject)iteration.$sym135$META_ITERATOR_ITERATOR_NEXT);
        utilities_macros.note_funcall_helper_function((SubLObject)iteration.$sym136$META_ITERATOR_ITERATOR_FINALIZE);
        utilities_macros.note_funcall_helper_function((SubLObject)iteration.$sym172$XFORM_ITERATOR_DONE);
        utilities_macros.note_funcall_helper_function((SubLObject)iteration.$sym173$XFORM_ITERATOR_NEXT);
        return (SubLObject)iteration.NIL;
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
    
    static {
        me = (SubLFile)new iteration();
        iteration.$dtp_iterator$ = null;
        iteration.$within_print_iterator$ = null;
        iteration.$xform_fn_param_do_not_pass$ = null;
        $sym0$ITERATOR = SubLObjectFactory.makeSymbol("ITERATOR");
        $sym1$ITERATOR_P = SubLObjectFactory.makeSymbol("ITERATOR-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("FINALIZE"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STATE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("NEXT"), (SubLObject)SubLObjectFactory.makeKeyword("FINALIZE"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IT-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("IT-DONE"), (SubLObject)SubLObjectFactory.makeSymbol("IT-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("IT-FINALIZE"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-IT-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-IT-DONE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-IT-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-IT-FINALIZE"));
        $sym6$PRINT_ITERATOR = SubLObjectFactory.makeSymbol("PRINT-ITERATOR");
        $sym7$ITERATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ITERATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR-P"));
        $sym9$IT_STATE = SubLObjectFactory.makeSymbol("IT-STATE");
        $sym10$_CSETF_IT_STATE = SubLObjectFactory.makeSymbol("_CSETF-IT-STATE");
        $sym11$IT_DONE = SubLObjectFactory.makeSymbol("IT-DONE");
        $sym12$_CSETF_IT_DONE = SubLObjectFactory.makeSymbol("_CSETF-IT-DONE");
        $sym13$IT_NEXT = SubLObjectFactory.makeSymbol("IT-NEXT");
        $sym14$_CSETF_IT_NEXT = SubLObjectFactory.makeSymbol("_CSETF-IT-NEXT");
        $sym15$IT_FINALIZE = SubLObjectFactory.makeSymbol("IT-FINALIZE");
        $sym16$_CSETF_IT_FINALIZE = SubLObjectFactory.makeSymbol("_CSETF-IT-FINALIZE");
        $kw17$STATE = SubLObjectFactory.makeKeyword("STATE");
        $kw18$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw19$NEXT = SubLObjectFactory.makeKeyword("NEXT");
        $kw20$FINALIZE = SubLObjectFactory.makeKeyword("FINALIZE");
        $str21$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw22$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym23$MAKE_ITERATOR = SubLObjectFactory.makeSymbol("MAKE-ITERATOR");
        $kw24$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw25$END = SubLObjectFactory.makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_ITERATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITERATOR-METHOD");
        $str27$_DONE_ = SubLObjectFactory.makeString(" DONE ");
        $str28$_ = SubLObjectFactory.makeString(" ");
        $sym29$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $sym30$HL_STORE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("HL-STORE-ITERATOR-NEXT");
        $sym31$FILTER_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("FILTER-ITERATOR-NEXT");
        $sym32$FILTER_ITERATOR_WITHOUT_VALUES_NEXT = SubLObjectFactory.makeSymbol("FILTER-ITERATOR-WITHOUT-VALUES-NEXT");
        $sym33$ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER = SubLObjectFactory.makeSymbol("ITERATION-NEXT-WITHOUT-VALUES-MACRO-HELPER");
        $sym34$DO_ITERATOR_WITHOUT_VALUES_INTERNAL = SubLObjectFactory.makeSymbol("DO-ITERATOR-WITHOUT-VALUES-INTERNAL");
        $str35$_NEXT = SubLObjectFactory.makeString("-NEXT");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw38$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $sym39$ITERATOR_VAR = SubLObjectFactory.makeUninternedSymbol("ITERATOR-VAR");
        $sym40$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym41$DO_ITERATOR = SubLObjectFactory.makeSymbol("DO-ITERATOR");
        $sym42$DONE_VAR = SubLObjectFactory.makeUninternedSymbol("DONE-VAR");
        $sym43$VALID = SubLObjectFactory.makeUninternedSymbol("VALID");
        $sym44$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym45$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym46$ITERATION_NEXT = SubLObjectFactory.makeSymbol("ITERATION-NEXT");
        $sym47$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym48$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym49$COR = SubLObjectFactory.makeSymbol("COR");
        $sym50$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INVALID-TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-TOKEN"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $kw53$INVALID_TOKEN = SubLObjectFactory.makeKeyword("INVALID-TOKEN");
        $kw54$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $sym55$NOTING_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PROGRESS");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTE-PROGRESS"));
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INVALID-TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-TOKEN"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $list59 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("DO-ITERATOR-WITHOUT-VALUES"), SubLObjectFactory.makeSymbol("DO-FINAL-INDEX-FROM-SPEC"), SubLObjectFactory.makeSymbol("DO-ITERATOR-WITHOUT-VALUES-PROGRESS"), SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX"), SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX"), SubLObjectFactory.makeSymbol("DO-NART-ARG-INDEX"), SubLObjectFactory.makeSymbol("DO-FUNCTION-EXTENT-INDEX"), SubLObjectFactory.makeSymbol("DO-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-ISA-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-QUOTED-ISA-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-GENLS-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-GENL-MT-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-EXCEPTION-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-PRAGMA-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX"), SubLObjectFactory.makeSymbol("DO-MT-INDEX"), SubLObjectFactory.makeSymbol("DO-OTHER-INDEX"), SubLObjectFactory.makeSymbol("DO-TERM-INDEX") });
        $sym60$ITERATOR_VAR = SubLObjectFactory.makeUninternedSymbol("ITERATOR-VAR");
        $sym61$DONE_VAR = SubLObjectFactory.makeUninternedSymbol("DONE-VAR");
        $sym62$TOKEN_VAR = SubLObjectFactory.makeUninternedSymbol("TOKEN-VAR");
        $sym63$VALID = SubLObjectFactory.makeUninternedSymbol("VALID");
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym65$COUNT = SubLObjectFactory.makeUninternedSymbol("COUNT");
        $sym66$NEW_DONE = SubLObjectFactory.makeUninternedSymbol("NEW-DONE");
        $list67 = ConsesLow.list((SubLObject)iteration.ZERO_INTEGER);
        $sym68$__ = SubLObjectFactory.makeSymbol(">=");
        $sym69$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym70$CINC = SubLObjectFactory.makeSymbol("CINC");
        $list71 = ConsesLow.list((SubLObject)iteration.T);
        $sym72$COPY_TREE = SubLObjectFactory.makeSymbol("COPY-TREE");
        $sym73$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym74$FALSE = SubLObjectFactory.makeSymbol("FALSE");
        $sym75$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym76$ITERATE_NON_NULL_SINGLETON_NEXT = SubLObjectFactory.makeSymbol("ITERATE-NON-NULL-SINGLETON-NEXT");
        $sym77$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym78$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $sym79$ITERATE_NUMBER_DONE = SubLObjectFactory.makeSymbol("ITERATE-NUMBER-DONE");
        $sym80$ITERATE_NUMBER_NEXT = SubLObjectFactory.makeSymbol("ITERATE-NUMBER-NEXT");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("DELTA"), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $sym82$ITERATE_LIST_NEXT = SubLObjectFactory.makeSymbol("ITERATE-LIST-NEXT");
        $sym83$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym84$ITERATE_LIST_DONE = SubLObjectFactory.makeSymbol("ITERATE-LIST-DONE");
        $sym85$LIST_ITERATOR_P = SubLObjectFactory.makeSymbol("LIST-ITERATOR-P");
        $sym86$ITERATE_INFERENCE_LIST_NEXT = SubLObjectFactory.makeSymbol("ITERATE-INFERENCE-LIST-NEXT");
        $sym87$ITERATE_INFERENCE_LIST_DONE = SubLObjectFactory.makeSymbol("ITERATE-INFERENCE-LIST-DONE");
        $sym88$INFERENCE_LIST_ITERATOR_P = SubLObjectFactory.makeSymbol("INFERENCE-LIST-ITERATOR-P");
        $sym89$EXPRESSION_HAS_INFERENCE_EXCEPTED_ASSERTION__ITERATION_HELPER = SubLObjectFactory.makeSymbol("EXPRESSION-HAS-INFERENCE-EXCEPTED-ASSERTION?-ITERATION-HELPER");
        $sym90$ALIST_P = SubLObjectFactory.makeSymbol("ALIST-P");
        $sym91$CONS_TO_TUPLE = SubLObjectFactory.makeSymbol("CONS-TO-TUPLE");
        $sym92$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $sym93$DEFAULT_ITERATOR_DONE_P = SubLObjectFactory.makeSymbol("DEFAULT-ITERATOR-DONE-P");
        $sym94$ITERATE_VECTOR_NEXT = SubLObjectFactory.makeSymbol("ITERATE-VECTOR-NEXT");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR"));
        $kw96$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym97$ITERATE_VECTOR_INDEX_NEXT = SubLObjectFactory.makeSymbol("ITERATE-VECTOR-INDEX-NEXT");
        $sym98$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym99$SEQUENCEP = SubLObjectFactory.makeSymbol("SEQUENCEP");
        $str100$_S_was_not_a_sequence = SubLObjectFactory.makeString("~S was not a sequence");
        $sym101$HASH_TABLE_P = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $sym102$ITERATOR_HASH_TABLE_DONE = SubLObjectFactory.makeSymbol("ITERATOR-HASH-TABLE-DONE");
        $sym103$ITERATOR_HASH_TABLE_NEXT = SubLObjectFactory.makeSymbol("ITERATOR-HASH-TABLE-NEXT");
        $kw104$KEY = SubLObjectFactory.makeKeyword("KEY");
        $kw105$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE-TUPLE"));
        $list108 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NEXT-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("REST-KEYS"));
        $sym109$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym110$FILE_FORM_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("FILE-FORM-ITERATOR-DONE?");
        $sym111$FILE_FORM_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("FILE-FORM-ITERATOR-NEXT");
        $sym112$FILE_FORM_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("FILE-FORM-ITERATOR-FINALIZE");
        $kw113$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw114$EOF = SubLObjectFactory.makeKeyword("EOF");
        $list115 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("END"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?"));
        $kw116$CLOSED = SubLObjectFactory.makeKeyword("CLOSED");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $sym118$LAZY_ITERATOR_DONE = SubLObjectFactory.makeSymbol("LAZY-ITERATOR-DONE");
        $sym119$LAZY_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("LAZY-ITERATOR-NEXT");
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAZY-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRUCTOR"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-FORMS"));
        $str121$_A_is_not_a_well_formed_uninitial = SubLObjectFactory.makeString("~A is not a well formed uninitialized lazy iterator");
        $sym122$CYC_API_EVAL = SubLObjectFactory.makeSymbol("CYC-API-EVAL");
        $sym123$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $sym124$ITERATE_INDIRECT_FINALIZE = SubLObjectFactory.makeSymbol("ITERATE-INDIRECT-FINALIZE");
        $sym125$ITERATE_INDIRECT_NEXT = SubLObjectFactory.makeSymbol("ITERATE-INDIRECT-NEXT");
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFORM"));
        $sym127$ITERATE_FACTORY_FINALIZE = SubLObjectFactory.makeSymbol("ITERATE-FACTORY-FINALIZE");
        $sym128$ITERATE_FACTORY_NEXT = SubLObjectFactory.makeSymbol("ITERATE-FACTORY-NEXT");
        $kw129$START = SubLObjectFactory.makeKeyword("START");
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("MODE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRUCTORS"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"));
        $kw131$CONSTRUCT = SubLObjectFactory.makeKeyword("CONSTRUCT");
        $list132 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NEXT-CONSTRUCTOR"), (SubLObject)SubLObjectFactory.makeSymbol("REST-CONSTRUCTORS"));
        $kw133$SUBITERATE = SubLObjectFactory.makeKeyword("SUBITERATE");
        $sym134$META_ITERATOR_ITERATOR_DONE = SubLObjectFactory.makeSymbol("META-ITERATOR-ITERATOR-DONE");
        $sym135$META_ITERATOR_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("META-ITERATOR-ITERATOR-NEXT");
        $sym136$META_ITERATOR_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("META-ITERATOR-ITERATOR-FINALIZE");
        $kw137$EXHAUSTED = SubLObjectFactory.makeKeyword("EXHAUSTED");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("META-ITERATOR"));
        $sym139$ITERATOR_ITERATOR_DONE = SubLObjectFactory.makeSymbol("ITERATOR-ITERATOR-DONE");
        $sym140$ITERATOR_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("ITERATOR-ITERATOR-NEXT");
        $sym141$ITERATOR_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("ITERATOR-ITERATOR-FINALIZE");
        $sym142$ROTATING_ITERATOR_ITERATOR_DONE = SubLObjectFactory.makeSymbol("ROTATING-ITERATOR-ITERATOR-DONE");
        $sym143$ROTATING_ITERATOR_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("ROTATING-ITERATOR-ITERATOR-NEXT");
        $sym144$ROTATING_ITERATOR_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("ROTATING-ITERATOR-ITERATOR-FINALIZE");
        $str145$ = SubLObjectFactory.makeString("");
        $str146$invalid_lazy_iterator_found_in_me = SubLObjectFactory.makeString("invalid lazy iterator found in meta-iterator ~A ~A");
        $str147$in_make_rotating_iterator_iterato = SubLObjectFactory.makeString("in make-rotating-iterator-iterator-state");
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATORS"));
        $kw149$INITIAL = SubLObjectFactory.makeKeyword("INITIAL");
        $sym150$REUSABLE_ITERATOR_DONE = SubLObjectFactory.makeSymbol("REUSABLE-ITERATOR-DONE");
        $sym151$REUSABLE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("REUSABLE-ITERATOR-NEXT");
        $sym152$REUSABLE_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("REUSABLE-ITERATOR-FINALIZE");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REAL-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("MODE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("FINALIZE"));
        $kw154$REUSE = SubLObjectFactory.makeKeyword("REUSE");
        $str155$Unknown_mode___a_ = SubLObjectFactory.makeString("Unknown mode: ~a.");
        $sym156$REUSABLE_ITERATOR_FROM_ITERATOR_DONE = SubLObjectFactory.makeSymbol("REUSABLE-ITERATOR-FROM-ITERATOR-DONE");
        $sym157$REUSABLE_ITERATOR_FROM_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("REUSABLE-ITERATOR-FROM-ITERATOR-NEXT");
        $sym158$REUSABLE_ITERATOR_FROM_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("REUSABLE-ITERATOR-FROM-ITERATOR-FINALIZE");
        $list159 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESET"), (SubLObject)iteration.T)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("RESET"));
        $kw161$RESET = SubLObjectFactory.makeKeyword("RESET");
        $sym162$RESET_REUSABLE_ITERATOR = SubLObjectFactory.makeSymbol("RESET-REUSABLE-ITERATOR");
        $sym163$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_DONE = SubLObjectFactory.makeSymbol("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE");
        $sym164$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT");
        $sym165$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-FINALIZE");
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE-ITERATORS"), (SubLObject)SubLObjectFactory.makeSymbol("REVERSE-RESULT"));
        $sym167$FILTER_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("FILTER-ITERATOR-FINALIZE");
        $sym168$FILTER_AND_TRANSFORM_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("FILTER-AND-TRANSFORM-ITERATOR-NEXT");
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("FILTER-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FILTER-ARGS"));
        $list170 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("FILTER-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FILTER-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("INVALID-TOKEN"));
        $str171$YOU_SHALL_NOT_PASS = SubLObjectFactory.makeString("YOU SHALL NOT PASS");
        $sym172$XFORM_ITERATOR_DONE = SubLObjectFactory.makeSymbol("XFORM-ITERATOR-DONE");
        $sym173$XFORM_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("XFORM-ITERATOR-NEXT");
        $sym174$XFORM_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("XFORM-ITERATOR-FINALIZE");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("XFORM-FN"), (SubLObject)SubLObjectFactory.makeSymbol("PARAM"));
        $sym176$ITERATE_XML_TOKEN_NEXT = SubLObjectFactory.makeSymbol("ITERATE-XML-TOKEN-NEXT");
        $sym177$XML_TOKEN_ITERATOR_P = SubLObjectFactory.makeSymbol("XML-TOKEN-ITERATOR-P");
    }
    
    public static final class $iterator_native extends SubLStructNative
    {
        public SubLObject $state;
        public SubLObject $done;
        public SubLObject $next;
        public SubLObject $finalize;
        private static final SubLStructDeclNative structDecl;
        
        public $iterator_native() {
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$done = (SubLObject)CommonSymbols.NIL;
            this.$next = (SubLObject)CommonSymbols.NIL;
            this.$finalize = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$iterator_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$iterator_native.class, iteration.$sym0$ITERATOR, iteration.$sym1$ITERATOR_P, iteration.$list2, iteration.$list3, new String[] { "$state", "$done", "$next", "$finalize" }, iteration.$list4, iteration.$list5, iteration.$sym6$PRINT_ITERATOR);
        }
    }
    
    public static final class $iterator_p$UnaryFunction extends UnaryFunction
    {
        public $iterator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITERATOR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.iterator_p(arg1);
        }
    }
    
    public static final class $iterate_non_null_singleton_next$UnaryFunction extends UnaryFunction
    {
        public $iterate_non_null_singleton_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITERATE-NON-NULL-SINGLETON-NEXT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.iterate_non_null_singleton_next(arg1);
        }
    }
    
    public static final class $iterate_number_done$UnaryFunction extends UnaryFunction
    {
        public $iterate_number_done$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITERATE-NUMBER-DONE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.iterate_number_done(arg1);
        }
    }
    
    public static final class $iterate_list_done$UnaryFunction extends UnaryFunction
    {
        public $iterate_list_done$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITERATE-LIST-DONE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.iterate_list_done(arg1);
        }
    }
    
    public static final class $iterate_list_next$UnaryFunction extends UnaryFunction
    {
        public $iterate_list_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITERATE-LIST-NEXT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.iterate_list_next(arg1);
        }
    }
    
    public static final class $iterate_vector_next$UnaryFunction extends UnaryFunction
    {
        public $iterate_vector_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITERATE-VECTOR-NEXT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.iterate_vector_next(arg1);
        }
    }
    
    public static final class $iterator_iterator_done$UnaryFunction extends UnaryFunction
    {
        public $iterator_iterator_done$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITERATOR-ITERATOR-DONE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.iterator_iterator_done(arg1);
        }
    }
    
    public static final class $iterator_iterator_next$UnaryFunction extends UnaryFunction
    {
        public $iterator_iterator_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ITERATOR-ITERATOR-NEXT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.iterator_iterator_next(arg1);
        }
    }
    
    public static final class $reusable_iterator_done$UnaryFunction extends UnaryFunction
    {
        public $reusable_iterator_done$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REUSABLE-ITERATOR-DONE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.reusable_iterator_done(arg1);
        }
    }
    
    public static final class $reusable_iterator_next$UnaryFunction extends UnaryFunction
    {
        public $reusable_iterator_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REUSABLE-ITERATOR-NEXT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.reusable_iterator_next(arg1);
        }
    }
    
    public static final class $reusable_iterator_cartesian_iterator_done$UnaryFunction extends UnaryFunction
    {
        public $reusable_iterator_cartesian_iterator_done$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.reusable_iterator_cartesian_iterator_done(arg1);
        }
    }
    
    public static final class $reusable_iterator_cartesian_iterator_next$UnaryFunction extends UnaryFunction
    {
        public $reusable_iterator_cartesian_iterator_next$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.reusable_iterator_cartesian_iterator_next(arg1);
        }
    }
    
    public static final class $default_iterator_done_p$UnaryFunction extends UnaryFunction
    {
        public $default_iterator_done_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DEFAULT-ITERATOR-DONE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return iteration.default_iterator_done_p(arg1);
        }
    }
}

/*

	Total time: 643 ms
	 synthetic 
*/