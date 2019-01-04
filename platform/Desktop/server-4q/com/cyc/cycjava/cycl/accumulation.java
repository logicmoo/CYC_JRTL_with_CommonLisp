package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
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

public final class accumulation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.accumulation";
    public static final String myFingerPrint = "24193a3ce01f2505c1aed685a57879fef666331f8ea92cdfa65043fb4cbe792b";
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLSymbol $dtp_accumulator$;
    private static final SubLSymbol $sym0$ACCUMULATOR;
    private static final SubLSymbol $sym1$ACCUMULATOR_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_ACCUMULATOR;
    private static final SubLSymbol $sym7$ACCUMULATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$ACC_STATE;
    private static final SubLSymbol $sym10$_CSETF_ACC_STATE;
    private static final SubLSymbol $sym11$ACC_RESET_FN;
    private static final SubLSymbol $sym12$_CSETF_ACC_RESET_FN;
    private static final SubLSymbol $sym13$ACC_ADD_FN;
    private static final SubLSymbol $sym14$_CSETF_ACC_ADD_FN;
    private static final SubLSymbol $sym15$ACC_ADD_ALL_FN;
    private static final SubLSymbol $sym16$_CSETF_ACC_ADD_ALL_FN;
    private static final SubLSymbol $sym17$ACC_SIZE_FN;
    private static final SubLSymbol $sym18$_CSETF_ACC_SIZE_FN;
    private static final SubLSymbol $sym19$ACC_CONTENTS_FN;
    private static final SubLSymbol $sym20$_CSETF_ACC_CONTENTS_FN;
    private static final SubLSymbol $sym21$ACC_ITERATOR_FN;
    private static final SubLSymbol $sym22$_CSETF_ACC_ITERATOR_FN;
    private static final SubLSymbol $kw23$STATE;
    private static final SubLSymbol $kw24$RESET_FN;
    private static final SubLSymbol $kw25$ADD_FN;
    private static final SubLSymbol $kw26$ADD_ALL_FN;
    private static final SubLSymbol $kw27$SIZE_FN;
    private static final SubLSymbol $kw28$CONTENTS_FN;
    private static final SubLSymbol $kw29$ITERATOR_FN;
    private static final SubLString $str30$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw31$BEGIN;
    private static final SubLSymbol $sym32$MAKE_ACCUMULATOR;
    private static final SubLSymbol $kw33$SLOT;
    private static final SubLSymbol $kw34$END;
    private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_ACCUMULATOR_METHOD;
    private static final SubLString $str36$empty;
    private static final SubLString $str37$_A_elems;
    private static final SubLSymbol $sym38$DEFAULT_ACCUMULATION_ADD_ALL;
    private static final SubLSymbol $sym39$LISTP;
    private static final SubLString $str40$Implementation_Error__Accumulator;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLSymbol $kw43$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw44$DONE;
    private static final SubLSymbol $sym45$ITERATOR_VAR;
    private static final SubLSymbol $sym46$CLET;
    private static final SubLSymbol $sym47$ACCUMULATION_ITERATOR;
    private static final SubLSymbol $sym48$DO_ITERATOR;
    private static final SubLSymbol $sym49$LIST_ACCUMULATOR_RESET;
    private static final SubLSymbol $sym50$LIST_ACCUMULATOR_ADD;
    private static final SubLSymbol $sym51$LIST_ACCUMULATOR_SIZE;
    private static final SubLSymbol $sym52$LIST_ACCUMULATOR_CONTENTS;
    private static final SubLSymbol $sym53$LIST_ACCUMULATOR_ITERATOR;
    private static final SubLString $str54$New_list_accumulator__A_is_not_em;
    private static final SubLString $str55$Accumulator_should_have__A_elemen;
    private static final SubLString $str56$Mismatch_between_iterator_content;
    private static final SubLString $str57$Accumulator__A_contains_less_item;
    private static final SubLString $str58$Destructively_emptied_accumulator;
    private static final SubLSymbol $sym59$SET_ACCUMULATOR_RESET;
    private static final SubLSymbol $sym60$SET_ACCUMULATOR_ADD;
    private static final SubLSymbol $sym61$SET_ACCUMULATOR_SIZE;
    private static final SubLSymbol $sym62$SET_ACCUMULATOR_CONTENTS;
    private static final SubLSymbol $sym63$SET_ACCUMULATOR_ITERATOR;
    private static final SubLString $str64$New_set_accumulator__A_is_not_emp;
    private static final SubLSymbol $sym65$DICTIONARY_ACCUMULATOR_RESET;
    private static final SubLSymbol $sym66$DICTIONARY_ACCUMULATOR_ADD;
    private static final SubLSymbol $sym67$DICTIONARY_ACCUMULATOR_SIZE;
    private static final SubLSymbol $sym68$DICTIONARY_ACCUMULATOR_CONTENTS;
    private static final SubLSymbol $sym69$DICTIONARY_ACCUMULATOR_ITERATOR;
    private static final SubLString $str70$Dictionary_accumulator_expects_tu;
    private static final SubLList $list71;
    private static final SubLString $str72$New_dictionary_accumulator__A_is_;
    private static final SubLSymbol $sym73$NULL;
    private static final SubLSymbol $sym74$FALSE;
    private static final SubLSymbol $sym75$ZERO;
    private static final SubLSymbol $sym76$NEW_NULL_ITERATOR_DUMMY;
    private static final SubLString $str77$New_null_accumulator__A_is_not_em;
    private static final SubLString $str78$New_null_accumulator__A_is_no_lon;
    private static final SubLString $str79$Expected_iterator__a_to_be_empty;
    private static final SubLString $str80$Destructively_emptied_accumulator;
    private static final SubLString $str81$Contents_were__a_instead_of_null;
    private static final SubLSymbol $sym82$NUMERIC_ACCUMULATOR_SIZE_FN;
    private static final SubLSymbol $sym83$NUMERIC_ACCUMULATION_ITERATOR;
    private static final SubLSymbol $sym84$NUMERIC_CONTENTS_FN_DEFAULT_ZERO;
    private static final SubLSymbol $sym85$NUMERIC_CONTENTS_FN_DEFAULT_ONE;
    private static final SubLSymbol $sym86$DWIMMED_SUM;
    private static final SubLString $str87$New_sum_accumulator__A_is_not_emp;
    private static final SubLString $str88$Accumulator_should_have_1_element;
    private static final SubLString $str89$Expected_iterator__a_to_have_only;
    private static final SubLString $str90$Contents_did_not_sum_to__a;
    private static final SubLString $str91$Iterator_contained__a_instead_of_;
    private static final SubLSymbol $sym92$DWIMMED_INCREMENT;
    private static final SubLString $str93$New_count_accumulator__A_is_not_e;
    private static final SubLString $str94$Contents_did_not_count_to__a;
    private static final SubLSymbol $sym95$DWIMMED_PRODUCT;
    private static final SubLString $str96$New_product_accumulator__A_is_not;
    private static final SubLSymbol $sym97$_;
    private static final SubLString $str98$Contents_did_not_multiply_to__a;
    private static final SubLSymbol $sym99$XFORM_ACCUMULATOR_RESET;
    private static final SubLSymbol $sym100$XFORM_ACCUMULATOR_ADD;
    private static final SubLSymbol $sym101$XFORM_ACCUMULATOR_SIZE;
    private static final SubLSymbol $sym102$XFORM_ACCUMULATOR_CONTENTS;
    private static final SubLSymbol $sym103$XFORM_ACCUMULATOR_ITERATOR;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$XFORM_ACCUMULATOR_ITORATOR;
    private static final SubLSymbol $sym106$TEST_LIST_ACCUMULATOR;
    private static final SubLSymbol $kw107$TEST;
    private static final SubLSymbol $kw108$OWNER;
    private static final SubLSymbol $kw109$CLASSES;
    private static final SubLSymbol $kw110$KB;
    private static final SubLSymbol $kw111$TINY;
    private static final SubLSymbol $kw112$WORKING_;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$TEST_SET_ACCUMULATOR;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$TEST_DICTIONARY_ACCUMULATOR;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$TEST_NULL_ACCUMULATOR;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$TEST_SUM_ACCUMULATOR;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$TEST_COUNT_ACCUMULATOR;
    private static final SubLSymbol $sym123$TEST_PRODUCT_ACCUMULATOR;
    private static final SubLList $list124;
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject accumulator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_accumulator(v_object, stream, (SubLObject)accumulation.ZERO_INTEGER);
        return (SubLObject)accumulation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject accumulator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $accumulator_native.class) ? accumulation.T : accumulation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject acc_state(final SubLObject v_object) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject acc_reset_fn(final SubLObject v_object) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject acc_add_fn(final SubLObject v_object) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject acc_add_all_fn(final SubLObject v_object) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject acc_size_fn(final SubLObject v_object) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject acc_contents_fn(final SubLObject v_object) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject acc_iterator_fn(final SubLObject v_object) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject _csetf_acc_state(final SubLObject v_object, final SubLObject value) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject _csetf_acc_reset_fn(final SubLObject v_object, final SubLObject value) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject _csetf_acc_add_fn(final SubLObject v_object, final SubLObject value) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject _csetf_acc_add_all_fn(final SubLObject v_object, final SubLObject value) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject _csetf_acc_size_fn(final SubLObject v_object, final SubLObject value) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject _csetf_acc_contents_fn(final SubLObject v_object, final SubLObject value) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject _csetf_acc_iterator_fn(final SubLObject v_object, final SubLObject value) {
        assert accumulation.NIL != accumulator_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject make_accumulator(SubLObject arglist) {
        if (arglist == accumulation.UNPROVIDED) {
            arglist = (SubLObject)accumulation.NIL;
        }
        final SubLObject v_new = (SubLObject)new $accumulator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)accumulation.NIL, next = arglist; accumulation.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)accumulation.$kw23$STATE)) {
                _csetf_acc_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)accumulation.$kw24$RESET_FN)) {
                _csetf_acc_reset_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)accumulation.$kw25$ADD_FN)) {
                _csetf_acc_add_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)accumulation.$kw26$ADD_ALL_FN)) {
                _csetf_acc_add_all_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)accumulation.$kw27$SIZE_FN)) {
                _csetf_acc_size_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)accumulation.$kw28$CONTENTS_FN)) {
                _csetf_acc_contents_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)accumulation.$kw29$ITERATOR_FN)) {
                _csetf_acc_iterator_fn(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)accumulation.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject visit_defstruct_accumulator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)accumulation.$kw31$BEGIN, (SubLObject)accumulation.$sym32$MAKE_ACCUMULATOR, (SubLObject)accumulation.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)accumulation.$kw33$SLOT, (SubLObject)accumulation.$kw23$STATE, acc_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)accumulation.$kw33$SLOT, (SubLObject)accumulation.$kw24$RESET_FN, acc_reset_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)accumulation.$kw33$SLOT, (SubLObject)accumulation.$kw25$ADD_FN, acc_add_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)accumulation.$kw33$SLOT, (SubLObject)accumulation.$kw26$ADD_ALL_FN, acc_add_all_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)accumulation.$kw33$SLOT, (SubLObject)accumulation.$kw27$SIZE_FN, acc_size_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)accumulation.$kw33$SLOT, (SubLObject)accumulation.$kw28$CONTENTS_FN, acc_contents_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)accumulation.$kw33$SLOT, (SubLObject)accumulation.$kw29$ITERATOR_FN, acc_iterator_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)accumulation.$kw34$END, (SubLObject)accumulation.$sym32$MAKE_ACCUMULATOR, (SubLObject)accumulation.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1712L)
    public static SubLObject visit_defstruct_object_accumulator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_accumulator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 1975L)
    public static SubLObject print_accumulator(final SubLObject acc, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (accumulation.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(acc, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, acc, (SubLObject)accumulation.T, (SubLObject)accumulation.T);
            if (accumulation.NIL != accumulation_empty_p(acc)) {
                streams_high.write_string((SubLObject)accumulation.$str36$empty, stream, (SubLObject)accumulation.UNPROVIDED, (SubLObject)accumulation.UNPROVIDED);
            }
            else {
                PrintLow.format(stream, (SubLObject)accumulation.$str37$_A_elems, accumulation_size(acc));
            }
            print_macros.print_unreadable_object_postamble(stream, acc, (SubLObject)accumulation.T, (SubLObject)accumulation.T);
        }
        return acc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 2258L)
    public static SubLObject new_accumulator(final SubLObject state, final SubLObject reset_fn, final SubLObject add_fn, final SubLObject size_fn, final SubLObject contents_fn, final SubLObject iterator_fn, SubLObject add_all_fn) {
        if (add_all_fn == accumulation.UNPROVIDED) {
            add_all_fn = (SubLObject)accumulation.$sym38$DEFAULT_ACCUMULATION_ADD_ALL;
        }
        final SubLObject acc = make_accumulator((SubLObject)accumulation.UNPROVIDED);
        _csetf_acc_state(acc, state);
        _csetf_acc_reset_fn(acc, reset_fn);
        _csetf_acc_add_fn(acc, add_fn);
        _csetf_acc_add_all_fn(acc, add_all_fn);
        _csetf_acc_size_fn(acc, size_fn);
        _csetf_acc_contents_fn(acc, contents_fn);
        _csetf_acc_iterator_fn(acc, iterator_fn);
        return acc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 4610L)
    public static SubLObject accumulation_reset(final SubLObject acc) {
        assert accumulation.NIL != accumulator_p(acc) : acc;
        final SubLObject state = acc_state(acc);
        final SubLObject reset_fn = acc_reset_fn(acc);
        final SubLObject new_state = Functions.funcall(reset_fn, state);
        _csetf_acc_state(acc, new_state);
        return acc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 4995L)
    public static SubLObject accumulation_add(final SubLObject acc, final SubLObject element) {
        assert accumulation.NIL != accumulator_p(acc) : acc;
        final SubLObject state = acc_state(acc);
        final SubLObject add_fn = acc_add_fn(acc);
        final SubLObject new_state = Functions.funcall(add_fn, state, element);
        _csetf_acc_state(acc, new_state);
        return acc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 5439L)
    public static SubLObject accumulation_add_all(final SubLObject acc, final SubLObject elements) {
        assert accumulation.NIL != accumulator_p(acc) : acc;
        assert accumulation.NIL != Types.listp(elements) : elements;
        final SubLObject add_all_fn = acc_add_all_fn(acc);
        Functions.funcall(add_all_fn, acc, elements);
        return acc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 5854L)
    public static SubLObject accumulation_size(final SubLObject acc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert accumulation.NIL != accumulator_p(acc) : acc;
        final SubLObject state = acc_state(acc);
        final SubLObject size_fn = acc_size_fn(acc);
        final SubLObject size = Functions.funcall(size_fn, state);
        if (accumulation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && accumulation.NIL == number_utilities.non_negative_number_p(size)) {
            Errors.error((SubLObject)accumulation.$str40$Implementation_Error__Accumulator, acc);
        }
        return size;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 6508L)
    public static SubLObject accumulation_empty_p(final SubLObject acc) {
        return Numbers.zerop(accumulation_size(acc));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 6697L)
    public static SubLObject accumulation_contents(final SubLObject acc, SubLObject resetP) {
        if (resetP == accumulation.UNPROVIDED) {
            resetP = (SubLObject)accumulation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert accumulation.NIL != accumulator_p(acc) : acc;
        final SubLObject state = acc_state(acc);
        final SubLObject contents_fn = acc_contents_fn(acc);
        thread.resetMultipleValues();
        final SubLObject contents = Functions.funcall(contents_fn, state, resetP);
        final SubLObject new_state = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (accumulation.NIL != resetP) {
            _csetf_acc_state(acc, new_state);
        }
        return contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 7937L)
    public static SubLObject accumulation_contents_destructively(final SubLObject acc) {
        return accumulation_contents(acc, (SubLObject)accumulation.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 8112L)
    public static SubLObject accumulation_iterator(final SubLObject acc) {
        assert accumulation.NIL != accumulator_p(acc) : acc;
        final SubLObject state = acc_state(acc);
        final SubLObject iterator_fn = acc_iterator_fn(acc);
        final SubLObject iterator = Functions.funcall(iterator_fn, state);
        return iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 8842L)
    public static SubLObject do_accumulator_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)accumulation.$list41);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = (SubLObject)accumulation.NIL;
        SubLObject accumulator = (SubLObject)accumulation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)accumulation.$list41);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)accumulation.$list41);
        accumulator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)accumulation.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)accumulation.NIL;
        SubLObject current_$1 = (SubLObject)accumulation.NIL;
        while (accumulation.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)accumulation.$list41);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)accumulation.$list41);
            if (accumulation.NIL == conses_high.member(current_$1, (SubLObject)accumulation.$list42, (SubLObject)accumulation.UNPROVIDED, (SubLObject)accumulation.UNPROVIDED)) {
                bad = (SubLObject)accumulation.T;
            }
            if (current_$1 == accumulation.$kw43$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (accumulation.NIL != bad && accumulation.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)accumulation.$list41);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)accumulation.$kw44$DONE, current);
        final SubLObject done = (SubLObject)((accumulation.NIL != done_tail) ? conses_high.cadr(done_tail) : accumulation.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject iterator_var = (SubLObject)accumulation.$sym45$ITERATOR_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)accumulation.$sym46$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator_var, (SubLObject)ConsesLow.list((SubLObject)accumulation.$sym47$ACCUMULATION_ITERATOR, accumulator))), (SubLObject)ConsesLow.listS((SubLObject)accumulation.$sym48$DO_ITERATOR, (SubLObject)ConsesLow.list(value, iterator_var, (SubLObject)accumulation.$kw44$DONE, done), ConsesLow.append(body, (SubLObject)accumulation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 9310L)
    public static SubLObject map_accumulator_contents(final SubLObject function, final SubLObject accumulator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator_var = accumulation_iterator(accumulator);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)accumulation.NIL; accumulation.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(accumulation.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject item = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (accumulation.NIL != valid) {
                Functions.funcall(function, item);
            }
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 9581L)
    public static SubLObject default_accumulation_add_all(final SubLObject acc, final SubLObject items) {
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)accumulation.NIL;
        item = cdolist_list_var.first();
        while (accumulation.NIL != cdolist_list_var) {
            accumulation_add(acc, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return acc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 9963L)
    public static SubLObject accumulation_peek_state(final SubLObject acc) {
        return acc_state(acc);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 10158L)
    public static SubLObject accumulation_add_items(final SubLObject acc, final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)accumulation.NIL; accumulation.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(accumulation.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject item = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (accumulation.NIL != valid) {
                accumulation_add(acc, item);
            }
        }
        return acc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 10535L)
    public static SubLObject new_list_accumulator(SubLObject initial_contents) {
        if (initial_contents == accumulation.UNPROVIDED) {
            initial_contents = (SubLObject)accumulation.NIL;
        }
        return new_accumulator(initial_contents, (SubLObject)accumulation.$sym49$LIST_ACCUMULATOR_RESET, (SubLObject)accumulation.$sym50$LIST_ACCUMULATOR_ADD, (SubLObject)accumulation.$sym51$LIST_ACCUMULATOR_SIZE, (SubLObject)accumulation.$sym52$LIST_ACCUMULATOR_CONTENTS, (SubLObject)accumulation.$sym53$LIST_ACCUMULATOR_ITERATOR, (SubLObject)accumulation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 11085L)
    public static SubLObject list_accumulator_reset(final SubLObject old_state) {
        return (SubLObject)accumulation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 11206L)
    public static SubLObject list_accumulator_add(final SubLObject state, final SubLObject element) {
        return (SubLObject)ConsesLow.cons(element, state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 11326L)
    public static SubLObject list_accumulator_size(final SubLObject state) {
        return Sequences.length(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 11397L)
    public static SubLObject list_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == accumulation.UNPROVIDED) {
            resetP = (SubLObject)accumulation.NIL;
        }
        if (accumulation.NIL != resetP) {
            return Values.values(Sequences.nreverse(state), (SubLObject)accumulation.NIL);
        }
        return Values.values(Sequences.reverse(state), state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 11568L)
    public static SubLObject list_accumulator_iterator(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject contents = list_accumulator_contents(state, (SubLObject)accumulation.NIL);
        final SubLObject new_state = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return iteration.new_list_iterator(contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 11773L)
    public static SubLObject test_list_accumulator(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject acc = new_list_accumulator((SubLObject)accumulation.UNPROVIDED);
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str54$New_list_accumulator__A_is_not_em);
        }
        SubLObject cdolist_list_var = list;
        SubLObject item = (SubLObject)accumulation.NIL;
        item = cdolist_list_var.first();
        while (accumulation.NIL != cdolist_list_var) {
            accumulation_add(acc, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        if (!Sequences.length(list).numE(accumulation_size(acc))) {
            Errors.error((SubLObject)accumulation.$str55$Accumulator_should_have__A_elemen, Sequences.length(list), accumulation_size(acc));
        }
        final SubLObject iterator = accumulation_iterator(acc);
        SubLObject index = list;
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)accumulation.NIL; accumulation.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(accumulation.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (accumulation.NIL != valid) {
                final SubLObject item2 = index.first();
                if (!item2.equal(current)) {
                    Errors.error((SubLObject)accumulation.$str56$Mismatch_between_iterator_content, acc);
                }
                index = index.rest();
            }
        }
        if (accumulation.NIL != index) {
            Errors.error((SubLObject)accumulation.$str57$Accumulator__A_contains_less_item, acc);
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str58$Destructively_emptied_accumulator, acc);
        }
        return Equality.equal(list, contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 12837L)
    public static SubLObject new_set_accumulator(SubLObject test) {
        if (test == accumulation.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)accumulation.EQL);
        }
        return new_accumulator(set.new_set(test, (SubLObject)accumulation.UNPROVIDED), (SubLObject)accumulation.$sym59$SET_ACCUMULATOR_RESET, (SubLObject)accumulation.$sym60$SET_ACCUMULATOR_ADD, (SubLObject)accumulation.$sym61$SET_ACCUMULATOR_SIZE, (SubLObject)accumulation.$sym62$SET_ACCUMULATOR_CONTENTS, (SubLObject)accumulation.$sym63$SET_ACCUMULATOR_ITERATOR, (SubLObject)accumulation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 13283L)
    public static SubLObject set_accumulator_reset(final SubLObject old_state) {
        set.clear_set(old_state);
        return old_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 13442L)
    public static SubLObject set_accumulator_add(final SubLObject state, final SubLObject element) {
        set.set_add(element, state);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 13591L)
    public static SubLObject set_accumulator_size(final SubLObject state) {
        return set.set_size(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 13739L)
    public static SubLObject set_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == accumulation.UNPROVIDED) {
            resetP = (SubLObject)accumulation.NIL;
        }
        if (accumulation.NIL != resetP) {
            return Values.values(state, set.new_set(set.set_test(state), (SubLObject)accumulation.UNPROVIDED));
        }
        return Values.values(set.copy_set(state), state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 14068L)
    public static SubLObject set_accumulator_iterator(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject contents = set_accumulator_contents(state, (SubLObject)accumulation.NIL);
        final SubLObject new_state = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return set.new_set_iterator(contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 14269L)
    public static SubLObject test_set_accumulator(final SubLObject v_set_contents, final SubLObject test_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = set_utilities.construct_set_from_list(v_set_contents, test_fn, (SubLObject)accumulation.UNPROVIDED);
        final SubLObject acc = new_set_accumulator(set.set_test(v_set));
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str64$New_set_accumulator__A_is_not_emp);
        }
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject item;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)accumulation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); accumulation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            item = set_contents.do_set_contents_next(basis_object, state);
            if (accumulation.NIL != set_contents.do_set_contents_element_validP(state, item)) {
                accumulation_add(acc, item);
            }
        }
        if (!set.set_size(v_set).numE(accumulation_size(acc))) {
            Errors.error((SubLObject)accumulation.$str55$Accumulator_should_have__A_elemen, set.set_size(v_set), accumulation_size(acc));
        }
        final SubLObject iterator = accumulation_iterator(acc);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)accumulation.NIL; accumulation.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(accumulation.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (accumulation.NIL != valid && accumulation.NIL == set.set_memberP(current, v_set)) {
                Errors.error((SubLObject)accumulation.$str56$Mismatch_between_iterator_content, acc);
            }
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str58$Destructively_emptied_accumulator, acc);
        }
        return set_utilities.sets_coextensionalP(v_set, contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 15222L)
    public static SubLObject new_dictionary_accumulator(SubLObject test) {
        if (test == accumulation.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)accumulation.EQL);
        }
        return new_accumulator(dictionary.new_dictionary(test, (SubLObject)accumulation.UNPROVIDED), (SubLObject)accumulation.$sym65$DICTIONARY_ACCUMULATOR_RESET, (SubLObject)accumulation.$sym66$DICTIONARY_ACCUMULATOR_ADD, (SubLObject)accumulation.$sym67$DICTIONARY_ACCUMULATOR_SIZE, (SubLObject)accumulation.$sym68$DICTIONARY_ACCUMULATOR_CONTENTS, (SubLObject)accumulation.$sym69$DICTIONARY_ACCUMULATOR_ITERATOR, (SubLObject)accumulation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 15695L)
    public static SubLObject new_dictionary_accumulator_tuple(final SubLObject key, final SubLObject value) {
        return (SubLObject)ConsesLow.cons(key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 15846L)
    public static SubLObject dictionary_accumulator_tuple_key(final SubLObject tuple) {
        return tuple.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 15975L)
    public static SubLObject dictionary_accumulator_tuple_value(final SubLObject tuple) {
        return tuple.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 16106L)
    public static SubLObject dictionary_accumulator_reset(final SubLObject old_state) {
        dictionary.clear_dictionary(old_state);
        return old_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 16288L)
    public static SubLObject dictionary_accumulator_add(final SubLObject state, final SubLObject tuple) {
        if (!tuple.isCons()) {
            Errors.error((SubLObject)accumulation.$str70$Dictionary_accumulator_expects_tu, tuple);
        }
        SubLObject key = (SubLObject)accumulation.NIL;
        SubLObject value = (SubLObject)accumulation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)accumulation.$list71);
        key = tuple.first();
        final SubLObject current = value = tuple.rest();
        dictionary.dictionary_enter(state, key, value);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 16670L)
    public static SubLObject dictionary_accumulator_size(final SubLObject state) {
        return dictionary.dictionary_length(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 16831L)
    public static SubLObject dictionary_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == accumulation.UNPROVIDED) {
            resetP = (SubLObject)accumulation.NIL;
        }
        if (accumulation.NIL != resetP) {
            return Values.values(state, dictionary.new_dictionary(dictionary.dictionary_test(state), (SubLObject)accumulation.UNPROVIDED));
        }
        return Values.values(dictionary_utilities.copy_dictionary(state), state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 17169L)
    public static SubLObject dictionary_accumulator_iterator(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tuples = new_list_accumulator((SubLObject)accumulation.UNPROVIDED);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(state)); accumulation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            accumulation_add(tuples, (SubLObject)ConsesLow.cons(key, value));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return accumulation_iterator(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 17745L)
    public static SubLObject test_dictionary_accumulator(final SubLObject tuple_list, final SubLObject test_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary_utilities.add_tuple_list_to_dictionary(tuple_list, dictionary.new_dictionary(test_fn, (SubLObject)accumulation.UNPROVIDED));
        final SubLObject acc = new_dictionary_accumulator(test_fn);
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str72$New_dictionary_accumulator__A_is_);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); accumulation.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            accumulation_add(acc, new_dictionary_accumulator_tuple(key, value));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (!dictionary.dictionary_length(dict).numE(accumulation_size(acc))) {
            Errors.error((SubLObject)accumulation.$str55$Accumulator_should_have__A_elemen, dictionary.dictionary_length(dict), accumulation_size(acc));
        }
        final SubLObject iterator = accumulation_iterator(acc);
        final SubLObject not_found = Symbols.gensym((SubLObject)accumulation.UNPROVIDED);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)accumulation.NIL; accumulation.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(accumulation.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (accumulation.NIL != valid) {
                final SubLObject key2 = dictionary_accumulator_tuple_key(current);
                final SubLObject value2 = dictionary_accumulator_tuple_value(current);
                if (accumulation.NIL == Functions.funcall(test_fn, value2, dictionary.dictionary_lookup(dict, key2, not_found))) {
                    Errors.error((SubLObject)accumulation.$str56$Mismatch_between_iterator_content, acc);
                }
            }
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str58$Destructively_emptied_accumulator, acc);
        }
        return dictionary_utilities.dictionaries_coextensionalP(dict, contents, (SubLObject)accumulation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 19021L)
    public static SubLObject new_null_accumulator() {
        return new_accumulator((SubLObject)accumulation.NIL, (SubLObject)accumulation.$sym73$NULL, (SubLObject)accumulation.$sym74$FALSE, (SubLObject)accumulation.$sym75$ZERO, (SubLObject)accumulation.$sym74$FALSE, (SubLObject)accumulation.$sym76$NEW_NULL_ITERATOR_DUMMY, (SubLObject)accumulation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 19244L)
    public static SubLObject new_null_iterator_dummy(final SubLObject dummy) {
        return iteration.new_null_iterator();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 19339L)
    public static SubLObject test_null_accumulator(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject acc = new_null_accumulator();
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str77$New_null_accumulator__A_is_not_em);
        }
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)accumulation.NIL;
        item = cdolist_list_var.first();
        while (accumulation.NIL != cdolist_list_var) {
            accumulation_add(acc, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str78$New_null_accumulator__A_is_no_lon);
        }
        final SubLObject iterator = accumulation_iterator(acc);
        SubLObject iterator_values = (SubLObject)accumulation.NIL;
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)accumulation.NIL; accumulation.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(accumulation.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (accumulation.NIL != valid) {
                iterator_values = (SubLObject)ConsesLow.cons(current, iterator_values);
            }
        }
        if (accumulation.NIL != iterator_values) {
            Errors.error((SubLObject)accumulation.$str79$Expected_iterator__a_to_be_empty, iterator);
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str80$Destructively_emptied_accumulator, acc);
        }
        if (accumulation.NIL != contents) {
            Errors.error((SubLObject)accumulation.$str81$Contents_were__a_instead_of_null, contents);
        }
        return (SubLObject)accumulation.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 20187L)
    public static SubLObject new_numeric_accumulator(final SubLObject add_fn, final SubLObject contents_fn) {
        return new_accumulator((SubLObject)accumulation.NIL, (SubLObject)accumulation.$sym73$NULL, add_fn, (SubLObject)accumulation.$sym82$NUMERIC_ACCUMULATOR_SIZE_FN, contents_fn, (SubLObject)accumulation.$sym83$NUMERIC_ACCUMULATION_ITERATOR, (SubLObject)accumulation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 20575L)
    public static SubLObject numeric_accumulation_iterator(final SubLObject state) {
        if (accumulation.NIL != state) {
            return iteration.new_singleton_iterator(state);
        }
        return iteration.new_null_iterator();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 20730L)
    public static SubLObject numeric_accumulator_size_fn(final SubLObject state) {
        if (accumulation.NIL != state) {
            return (SubLObject)accumulation.ONE_INTEGER;
        }
        return (SubLObject)accumulation.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 20836L)
    public static SubLObject numeric_contents_fn_default_zero(SubLObject state, SubLObject resetP) {
        if (resetP == accumulation.UNPROVIDED) {
            resetP = (SubLObject)accumulation.NIL;
        }
        SubLObject result = state;
        if (accumulation.NIL == result) {
            result = (SubLObject)accumulation.ZERO_INTEGER;
        }
        if (accumulation.NIL != resetP) {
            state = (SubLObject)accumulation.NIL;
        }
        return Values.values(result, state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 21065L)
    public static SubLObject numeric_contents_fn_default_one(SubLObject state, SubLObject resetP) {
        if (resetP == accumulation.UNPROVIDED) {
            resetP = (SubLObject)accumulation.NIL;
        }
        SubLObject result = state;
        if (accumulation.NIL == result) {
            result = (SubLObject)accumulation.ONE_INTEGER;
        }
        if (accumulation.NIL != resetP) {
            state = (SubLObject)accumulation.NIL;
        }
        return Values.values(result, state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 21293L)
    public static SubLObject new_sum_accumulator() {
        return new_numeric_accumulator((SubLObject)accumulation.$sym86$DWIMMED_SUM, (SubLObject)accumulation.$sym84$NUMERIC_CONTENTS_FN_DEFAULT_ZERO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 21565L)
    public static SubLObject dwimmed_sum(SubLObject obj1, SubLObject obj2) {
        if (!obj1.isNumber()) {
            obj1 = (SubLObject)accumulation.ZERO_INTEGER;
        }
        if (!obj2.isNumber()) {
            obj2 = (SubLObject)accumulation.ZERO_INTEGER;
        }
        return Numbers.add(obj1, obj2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 21759L)
    public static SubLObject test_sum_accumulator(final SubLObject numbers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject acc = new_sum_accumulator();
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str87$New_sum_accumulator__A_is_not_emp);
        }
        SubLObject cdolist_list_var = numbers;
        SubLObject num = (SubLObject)accumulation.NIL;
        num = cdolist_list_var.first();
        while (accumulation.NIL != cdolist_list_var) {
            accumulation_add(acc, num);
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        }
        if (accumulation.NIL == number_utilities.onep(accumulation_size(acc))) {
            Errors.error((SubLObject)accumulation.$str88$Accumulator_should_have_1_element, accumulation_size(acc));
        }
        final SubLObject iterator = accumulation_iterator(acc);
        SubLObject iterator_values = (SubLObject)accumulation.NIL;
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)accumulation.NIL; accumulation.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(accumulation.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (accumulation.NIL != valid) {
                iterator_values = (SubLObject)ConsesLow.cons(current, iterator_values);
            }
        }
        if (accumulation.NIL == list_utilities.singletonP(iterator_values)) {
            Errors.error((SubLObject)accumulation.$str89$Expected_iterator__a_to_have_only, iterator);
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str80$Destructively_emptied_accumulator, acc);
        }
        if (!contents.numE(number_utilities.summation(numbers))) {
            Errors.error((SubLObject)accumulation.$str90$Contents_did_not_sum_to__a, number_utilities.summation(numbers));
        }
        if (!list_utilities.only_one(iterator_values).numE(contents)) {
            Errors.error((SubLObject)accumulation.$str91$Iterator_contained__a_instead_of_, list_utilities.only_one(iterator_values), contents);
        }
        return (SubLObject)accumulation.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 22812L)
    public static SubLObject new_count_accumulator() {
        return new_numeric_accumulator((SubLObject)accumulation.$sym92$DWIMMED_INCREMENT, (SubLObject)accumulation.$sym84$NUMERIC_CONTENTS_FN_DEFAULT_ZERO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 23087L)
    public static SubLObject dwimmed_increment(SubLObject partial_sum, final SubLObject dummy) {
        if (!partial_sum.isNumber()) {
            partial_sum = (SubLObject)accumulation.ZERO_INTEGER;
        }
        return number_utilities.f_1X(partial_sum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 23284L)
    public static SubLObject test_count_accumulator(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject acc = new_count_accumulator();
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str93$New_count_accumulator__A_is_not_e);
        }
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)accumulation.NIL;
        item = cdolist_list_var.first();
        while (accumulation.NIL != cdolist_list_var) {
            accumulation_add(acc, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        if (accumulation.NIL == number_utilities.onep(accumulation_size(acc))) {
            Errors.error((SubLObject)accumulation.$str88$Accumulator_should_have_1_element, accumulation_size(acc));
        }
        final SubLObject iterator = accumulation_iterator(acc);
        SubLObject iterator_values = (SubLObject)accumulation.NIL;
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)accumulation.NIL; accumulation.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(accumulation.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (accumulation.NIL != valid) {
                iterator_values = (SubLObject)ConsesLow.cons(current, iterator_values);
            }
        }
        if (accumulation.NIL == list_utilities.singletonP(iterator_values)) {
            Errors.error((SubLObject)accumulation.$str89$Expected_iterator__a_to_have_only, iterator);
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str80$Destructively_emptied_accumulator, acc);
        }
        if (!contents.numE(Sequences.length(items))) {
            Errors.error((SubLObject)accumulation.$str94$Contents_did_not_count_to__a, Sequences.length(items));
        }
        if (!list_utilities.only_one(iterator_values).numE(contents)) {
            Errors.error((SubLObject)accumulation.$str91$Iterator_contained__a_instead_of_, list_utilities.only_one(iterator_values), contents);
        }
        return (SubLObject)accumulation.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 24333L)
    public static SubLObject new_product_accumulator() {
        return new_numeric_accumulator((SubLObject)accumulation.$sym95$DWIMMED_PRODUCT, (SubLObject)accumulation.$sym85$NUMERIC_CONTENTS_FN_DEFAULT_ONE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 24614L)
    public static SubLObject dwimmed_product(SubLObject obj1, SubLObject obj2) {
        if (!obj1.isNumber()) {
            obj1 = (SubLObject)accumulation.ONE_INTEGER;
        }
        if (!obj2.isNumber()) {
            obj2 = (SubLObject)accumulation.ONE_INTEGER;
        }
        return Numbers.multiply(obj1, obj2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 24811L)
    public static SubLObject test_product_accumulator(final SubLObject numbers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject acc = new_product_accumulator();
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str96$New_product_accumulator__A_is_not);
        }
        SubLObject cdolist_list_var = numbers;
        SubLObject num = (SubLObject)accumulation.NIL;
        num = cdolist_list_var.first();
        while (accumulation.NIL != cdolist_list_var) {
            accumulation_add(acc, num);
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        }
        if (accumulation.NIL == number_utilities.onep(accumulation_size(acc))) {
            Errors.error((SubLObject)accumulation.$str88$Accumulator_should_have_1_element, accumulation_size(acc));
        }
        final SubLObject iterator = accumulation_iterator(acc);
        SubLObject iterator_values = (SubLObject)accumulation.NIL;
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)accumulation.NIL; accumulation.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(accumulation.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (accumulation.NIL != valid) {
                iterator_values = (SubLObject)ConsesLow.cons(current, iterator_values);
            }
        }
        if (accumulation.NIL == list_utilities.singletonP(iterator_values)) {
            Errors.error((SubLObject)accumulation.$str89$Expected_iterator__a_to_have_only, iterator);
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (accumulation.NIL == accumulation_empty_p(acc)) {
            Errors.error((SubLObject)accumulation.$str80$Destructively_emptied_accumulator, acc);
        }
        if (!contents.numE(Functions.apply((SubLObject)accumulation.$sym97$_, numbers))) {
            Errors.error((SubLObject)accumulation.$str98$Contents_did_not_multiply_to__a, Functions.apply((SubLObject)accumulation.$sym97$_, numbers));
        }
        if (!list_utilities.only_one(iterator_values).numE(contents)) {
            Errors.error((SubLObject)accumulation.$str91$Iterator_contained__a_instead_of_, list_utilities.only_one(iterator_values), contents);
        }
        return (SubLObject)accumulation.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 25879L)
    public static SubLObject new_transform_accumulator(final SubLObject accumulator, final SubLObject xform_fn, SubLObject param) {
        if (param == accumulation.UNPROVIDED) {
            param = iteration.$xform_fn_param_do_not_pass$.getGlobalValue();
        }
        return new_accumulator(make_xform_accumulator_state(accumulator, xform_fn, param), (SubLObject)accumulation.$sym99$XFORM_ACCUMULATOR_RESET, (SubLObject)accumulation.$sym100$XFORM_ACCUMULATOR_ADD, (SubLObject)accumulation.$sym101$XFORM_ACCUMULATOR_SIZE, (SubLObject)accumulation.$sym102$XFORM_ACCUMULATOR_CONTENTS, (SubLObject)accumulation.$sym103$XFORM_ACCUMULATOR_ITERATOR, (SubLObject)accumulation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 26660L)
    public static SubLObject make_xform_accumulator_state(final SubLObject acc, final SubLObject xform_fn, final SubLObject param) {
        return (SubLObject)ConsesLow.list(acc, xform_fn, param);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 26787L)
    public static SubLObject xform_accumulator_reset(final SubLObject state) {
        final SubLObject acc = state.first();
        accumulation_reset(acc);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 26920L)
    public static SubLObject xform_accumulator_add(final SubLObject state, final SubLObject item) {
        SubLObject acc = (SubLObject)accumulation.NIL;
        SubLObject xform_fn = (SubLObject)accumulation.NIL;
        SubLObject param = (SubLObject)accumulation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)accumulation.$list104);
        acc = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)accumulation.$list104);
        xform_fn = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)accumulation.$list104);
        param = current.first();
        current = current.rest();
        if (accumulation.NIL == current) {
            if (iteration.$xform_fn_param_do_not_pass$.getGlobalValue().eql(param)) {
                accumulation_add(acc, Functions.funcall(xform_fn, item));
            }
            else {
                accumulation_add(acc, Functions.funcall(xform_fn, item, param));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)accumulation.$list104);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 27233L)
    public static SubLObject xform_accumulator_size(final SubLObject state) {
        return accumulation_size(state.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 27332L)
    public static SubLObject xform_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == accumulation.UNPROVIDED) {
            resetP = (SubLObject)accumulation.NIL;
        }
        return accumulation_contents(state.first(), resetP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/accumulation.lisp", position = 27463L)
    public static SubLObject xform_accumulator_itorator(final SubLObject state) {
        return accumulation_iterator(state.first());
    }
    
    public static SubLObject declare_accumulation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "accumulator_print_function_trampoline", "ACCUMULATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "accumulator_p", "ACCUMULATOR-P", 1, 0, false);
        new $accumulator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "acc_state", "ACC-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "acc_reset_fn", "ACC-RESET-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "acc_add_fn", "ACC-ADD-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "acc_add_all_fn", "ACC-ADD-ALL-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "acc_size_fn", "ACC-SIZE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "acc_contents_fn", "ACC-CONTENTS-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "acc_iterator_fn", "ACC-ITERATOR-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "_csetf_acc_state", "_CSETF-ACC-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "_csetf_acc_reset_fn", "_CSETF-ACC-RESET-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "_csetf_acc_add_fn", "_CSETF-ACC-ADD-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "_csetf_acc_add_all_fn", "_CSETF-ACC-ADD-ALL-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "_csetf_acc_size_fn", "_CSETF-ACC-SIZE-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "_csetf_acc_contents_fn", "_CSETF-ACC-CONTENTS-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "_csetf_acc_iterator_fn", "_CSETF-ACC-ITERATOR-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "make_accumulator", "MAKE-ACCUMULATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "visit_defstruct_accumulator", "VISIT-DEFSTRUCT-ACCUMULATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "visit_defstruct_object_accumulator_method", "VISIT-DEFSTRUCT-OBJECT-ACCUMULATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "print_accumulator", "PRINT-ACCUMULATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "new_accumulator", "NEW-ACCUMULATOR", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "accumulation_reset", "ACCUMULATION-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "accumulation_add", "ACCUMULATION-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "accumulation_add_all", "ACCUMULATION-ADD-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "accumulation_size", "ACCUMULATION-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "accumulation_empty_p", "ACCUMULATION-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "accumulation_contents", "ACCUMULATION-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "accumulation_contents_destructively", "ACCUMULATION-CONTENTS-DESTRUCTIVELY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "accumulation_iterator", "ACCUMULATION-ITERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.accumulation", "do_accumulator_contents", "DO-ACCUMULATOR-CONTENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "map_accumulator_contents", "MAP-ACCUMULATOR-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "default_accumulation_add_all", "DEFAULT-ACCUMULATION-ADD-ALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "accumulation_peek_state", "ACCUMULATION-PEEK-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "accumulation_add_items", "ACCUMULATION-ADD-ITEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "new_list_accumulator", "NEW-LIST-ACCUMULATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "list_accumulator_reset", "LIST-ACCUMULATOR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "list_accumulator_add", "LIST-ACCUMULATOR-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "list_accumulator_size", "LIST-ACCUMULATOR-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "list_accumulator_contents", "LIST-ACCUMULATOR-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "list_accumulator_iterator", "LIST-ACCUMULATOR-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "test_list_accumulator", "TEST-LIST-ACCUMULATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "new_set_accumulator", "NEW-SET-ACCUMULATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "set_accumulator_reset", "SET-ACCUMULATOR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "set_accumulator_add", "SET-ACCUMULATOR-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "set_accumulator_size", "SET-ACCUMULATOR-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "set_accumulator_contents", "SET-ACCUMULATOR-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "set_accumulator_iterator", "SET-ACCUMULATOR-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "test_set_accumulator", "TEST-SET-ACCUMULATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "new_dictionary_accumulator", "NEW-DICTIONARY-ACCUMULATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "new_dictionary_accumulator_tuple", "NEW-DICTIONARY-ACCUMULATOR-TUPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "dictionary_accumulator_tuple_key", "DICTIONARY-ACCUMULATOR-TUPLE-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "dictionary_accumulator_tuple_value", "DICTIONARY-ACCUMULATOR-TUPLE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "dictionary_accumulator_reset", "DICTIONARY-ACCUMULATOR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "dictionary_accumulator_add", "DICTIONARY-ACCUMULATOR-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "dictionary_accumulator_size", "DICTIONARY-ACCUMULATOR-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "dictionary_accumulator_contents", "DICTIONARY-ACCUMULATOR-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "dictionary_accumulator_iterator", "DICTIONARY-ACCUMULATOR-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "test_dictionary_accumulator", "TEST-DICTIONARY-ACCUMULATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "new_null_accumulator", "NEW-NULL-ACCUMULATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "new_null_iterator_dummy", "NEW-NULL-ITERATOR-DUMMY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "test_null_accumulator", "TEST-NULL-ACCUMULATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "new_numeric_accumulator", "NEW-NUMERIC-ACCUMULATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "numeric_accumulation_iterator", "NUMERIC-ACCUMULATION-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "numeric_accumulator_size_fn", "NUMERIC-ACCUMULATOR-SIZE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "numeric_contents_fn_default_zero", "NUMERIC-CONTENTS-FN-DEFAULT-ZERO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "numeric_contents_fn_default_one", "NUMERIC-CONTENTS-FN-DEFAULT-ONE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "new_sum_accumulator", "NEW-SUM-ACCUMULATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "dwimmed_sum", "DWIMMED-SUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "test_sum_accumulator", "TEST-SUM-ACCUMULATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "new_count_accumulator", "NEW-COUNT-ACCUMULATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "dwimmed_increment", "DWIMMED-INCREMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "test_count_accumulator", "TEST-COUNT-ACCUMULATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "new_product_accumulator", "NEW-PRODUCT-ACCUMULATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "dwimmed_product", "DWIMMED-PRODUCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "test_product_accumulator", "TEST-PRODUCT-ACCUMULATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "new_transform_accumulator", "NEW-TRANSFORM-ACCUMULATOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "make_xform_accumulator_state", "MAKE-XFORM-ACCUMULATOR-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "xform_accumulator_reset", "XFORM-ACCUMULATOR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "xform_accumulator_add", "XFORM-ACCUMULATOR-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "xform_accumulator_size", "XFORM-ACCUMULATOR-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "xform_accumulator_contents", "XFORM-ACCUMULATOR-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.accumulation", "xform_accumulator_itorator", "XFORM-ACCUMULATOR-ITORATOR", 1, 0, false);
        return (SubLObject)accumulation.NIL;
    }
    
    public static SubLObject init_accumulation_file() {
        accumulation.$dtp_accumulator$ = SubLFiles.defconstant("*DTP-ACCUMULATOR*", (SubLObject)accumulation.$sym0$ACCUMULATOR);
        return (SubLObject)accumulation.NIL;
    }
    
    public static SubLObject setup_accumulation_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), accumulation.$dtp_accumulator$.getGlobalValue(), Symbols.symbol_function((SubLObject)accumulation.$sym7$ACCUMULATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)accumulation.$list8);
        Structures.def_csetf((SubLObject)accumulation.$sym9$ACC_STATE, (SubLObject)accumulation.$sym10$_CSETF_ACC_STATE);
        Structures.def_csetf((SubLObject)accumulation.$sym11$ACC_RESET_FN, (SubLObject)accumulation.$sym12$_CSETF_ACC_RESET_FN);
        Structures.def_csetf((SubLObject)accumulation.$sym13$ACC_ADD_FN, (SubLObject)accumulation.$sym14$_CSETF_ACC_ADD_FN);
        Structures.def_csetf((SubLObject)accumulation.$sym15$ACC_ADD_ALL_FN, (SubLObject)accumulation.$sym16$_CSETF_ACC_ADD_ALL_FN);
        Structures.def_csetf((SubLObject)accumulation.$sym17$ACC_SIZE_FN, (SubLObject)accumulation.$sym18$_CSETF_ACC_SIZE_FN);
        Structures.def_csetf((SubLObject)accumulation.$sym19$ACC_CONTENTS_FN, (SubLObject)accumulation.$sym20$_CSETF_ACC_CONTENTS_FN);
        Structures.def_csetf((SubLObject)accumulation.$sym21$ACC_ITERATOR_FN, (SubLObject)accumulation.$sym22$_CSETF_ACC_ITERATOR_FN);
        Equality.identity((SubLObject)accumulation.$sym0$ACCUMULATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), accumulation.$dtp_accumulator$.getGlobalValue(), Symbols.symbol_function((SubLObject)accumulation.$sym35$VISIT_DEFSTRUCT_OBJECT_ACCUMULATOR_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)accumulation.$sym83$NUMERIC_ACCUMULATION_ITERATOR);
        utilities_macros.note_funcall_helper_function((SubLObject)accumulation.$sym82$NUMERIC_ACCUMULATOR_SIZE_FN);
        utilities_macros.note_funcall_helper_function((SubLObject)accumulation.$sym84$NUMERIC_CONTENTS_FN_DEFAULT_ZERO);
        utilities_macros.note_funcall_helper_function((SubLObject)accumulation.$sym85$NUMERIC_CONTENTS_FN_DEFAULT_ONE);
        utilities_macros.note_funcall_helper_function((SubLObject)accumulation.$sym99$XFORM_ACCUMULATOR_RESET);
        utilities_macros.note_funcall_helper_function((SubLObject)accumulation.$sym100$XFORM_ACCUMULATOR_ADD);
        utilities_macros.note_funcall_helper_function((SubLObject)accumulation.$sym101$XFORM_ACCUMULATOR_SIZE);
        utilities_macros.note_funcall_helper_function((SubLObject)accumulation.$sym102$XFORM_ACCUMULATOR_CONTENTS);
        utilities_macros.note_funcall_helper_function((SubLObject)accumulation.$sym105$XFORM_ACCUMULATOR_ITORATOR);
        generic_testing.define_test_case_table_int((SubLObject)accumulation.$sym106$TEST_LIST_ACCUMULATOR, (SubLObject)ConsesLow.list(new SubLObject[] { accumulation.$kw107$TEST, accumulation.NIL, accumulation.$kw108$OWNER, accumulation.NIL, accumulation.$kw109$CLASSES, accumulation.NIL, accumulation.$kw110$KB, accumulation.$kw111$TINY, accumulation.$kw112$WORKING_, accumulation.T }), (SubLObject)accumulation.$list113);
        generic_testing.define_test_case_table_int((SubLObject)accumulation.$sym114$TEST_SET_ACCUMULATOR, (SubLObject)ConsesLow.list(new SubLObject[] { accumulation.$kw107$TEST, accumulation.NIL, accumulation.$kw108$OWNER, accumulation.NIL, accumulation.$kw109$CLASSES, accumulation.NIL, accumulation.$kw110$KB, accumulation.$kw111$TINY, accumulation.$kw112$WORKING_, accumulation.T }), (SubLObject)accumulation.$list115);
        generic_testing.define_test_case_table_int((SubLObject)accumulation.$sym116$TEST_DICTIONARY_ACCUMULATOR, (SubLObject)ConsesLow.list(new SubLObject[] { accumulation.$kw107$TEST, accumulation.NIL, accumulation.$kw108$OWNER, accumulation.NIL, accumulation.$kw109$CLASSES, accumulation.NIL, accumulation.$kw110$KB, accumulation.$kw111$TINY, accumulation.$kw112$WORKING_, accumulation.T }), (SubLObject)accumulation.$list117);
        generic_testing.define_test_case_table_int((SubLObject)accumulation.$sym118$TEST_NULL_ACCUMULATOR, (SubLObject)ConsesLow.list(new SubLObject[] { accumulation.$kw107$TEST, accumulation.NIL, accumulation.$kw108$OWNER, accumulation.NIL, accumulation.$kw109$CLASSES, accumulation.NIL, accumulation.$kw110$KB, accumulation.$kw111$TINY, accumulation.$kw112$WORKING_, accumulation.T }), (SubLObject)accumulation.$list119);
        generic_testing.define_test_case_table_int((SubLObject)accumulation.$sym120$TEST_SUM_ACCUMULATOR, (SubLObject)ConsesLow.list(new SubLObject[] { accumulation.$kw107$TEST, accumulation.NIL, accumulation.$kw108$OWNER, accumulation.NIL, accumulation.$kw109$CLASSES, accumulation.NIL, accumulation.$kw110$KB, accumulation.$kw111$TINY, accumulation.$kw112$WORKING_, accumulation.T }), (SubLObject)accumulation.$list121);
        generic_testing.define_test_case_table_int((SubLObject)accumulation.$sym122$TEST_COUNT_ACCUMULATOR, (SubLObject)ConsesLow.list(new SubLObject[] { accumulation.$kw107$TEST, accumulation.NIL, accumulation.$kw108$OWNER, accumulation.NIL, accumulation.$kw109$CLASSES, accumulation.NIL, accumulation.$kw110$KB, accumulation.$kw111$TINY, accumulation.$kw112$WORKING_, accumulation.T }), (SubLObject)accumulation.$list119);
        generic_testing.define_test_case_table_int((SubLObject)accumulation.$sym123$TEST_PRODUCT_ACCUMULATOR, (SubLObject)ConsesLow.list(new SubLObject[] { accumulation.$kw107$TEST, accumulation.NIL, accumulation.$kw108$OWNER, accumulation.NIL, accumulation.$kw109$CLASSES, accumulation.NIL, accumulation.$kw110$KB, accumulation.$kw111$TINY, accumulation.$kw112$WORKING_, accumulation.T }), (SubLObject)accumulation.$list124);
        return (SubLObject)accumulation.NIL;
    }
    
    public void declareFunctions() {
        declare_accumulation_file();
    }
    
    public void initializeVariables() {
        init_accumulation_file();
    }
    
    public void runTopLevelForms() {
        setup_accumulation_file();
    }
    
    static {
        me = (SubLFile)new accumulation();
        accumulation.$dtp_accumulator$ = null;
        $sym0$ACCUMULATOR = SubLObjectFactory.makeSymbol("ACCUMULATOR");
        $sym1$ACCUMULATOR_P = SubLObjectFactory.makeSymbol("ACCUMULATOR-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("RESET-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-ALL-FN"), (SubLObject)SubLObjectFactory.makeSymbol("SIZE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR-FN"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STATE"), (SubLObject)SubLObjectFactory.makeKeyword("RESET-FN"), (SubLObject)SubLObjectFactory.makeKeyword("ADD-FN"), (SubLObject)SubLObjectFactory.makeKeyword("ADD-ALL-FN"), (SubLObject)SubLObjectFactory.makeKeyword("SIZE-FN"), (SubLObject)SubLObjectFactory.makeKeyword("CONTENTS-FN"), (SubLObject)SubLObjectFactory.makeKeyword("ITERATOR-FN"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACC-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("ACC-RESET-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ACC-ADD-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ACC-ADD-ALL-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ACC-SIZE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ACC-CONTENTS-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ACC-ITERATOR-FN"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ACC-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ACC-RESET-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ACC-ADD-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ACC-ADD-ALL-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ACC-SIZE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ACC-CONTENTS-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ACC-ITERATOR-FN"));
        $sym6$PRINT_ACCUMULATOR = SubLObjectFactory.makeSymbol("PRINT-ACCUMULATOR");
        $sym7$ACCUMULATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ACCUMULATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATOR-P"));
        $sym9$ACC_STATE = SubLObjectFactory.makeSymbol("ACC-STATE");
        $sym10$_CSETF_ACC_STATE = SubLObjectFactory.makeSymbol("_CSETF-ACC-STATE");
        $sym11$ACC_RESET_FN = SubLObjectFactory.makeSymbol("ACC-RESET-FN");
        $sym12$_CSETF_ACC_RESET_FN = SubLObjectFactory.makeSymbol("_CSETF-ACC-RESET-FN");
        $sym13$ACC_ADD_FN = SubLObjectFactory.makeSymbol("ACC-ADD-FN");
        $sym14$_CSETF_ACC_ADD_FN = SubLObjectFactory.makeSymbol("_CSETF-ACC-ADD-FN");
        $sym15$ACC_ADD_ALL_FN = SubLObjectFactory.makeSymbol("ACC-ADD-ALL-FN");
        $sym16$_CSETF_ACC_ADD_ALL_FN = SubLObjectFactory.makeSymbol("_CSETF-ACC-ADD-ALL-FN");
        $sym17$ACC_SIZE_FN = SubLObjectFactory.makeSymbol("ACC-SIZE-FN");
        $sym18$_CSETF_ACC_SIZE_FN = SubLObjectFactory.makeSymbol("_CSETF-ACC-SIZE-FN");
        $sym19$ACC_CONTENTS_FN = SubLObjectFactory.makeSymbol("ACC-CONTENTS-FN");
        $sym20$_CSETF_ACC_CONTENTS_FN = SubLObjectFactory.makeSymbol("_CSETF-ACC-CONTENTS-FN");
        $sym21$ACC_ITERATOR_FN = SubLObjectFactory.makeSymbol("ACC-ITERATOR-FN");
        $sym22$_CSETF_ACC_ITERATOR_FN = SubLObjectFactory.makeSymbol("_CSETF-ACC-ITERATOR-FN");
        $kw23$STATE = SubLObjectFactory.makeKeyword("STATE");
        $kw24$RESET_FN = SubLObjectFactory.makeKeyword("RESET-FN");
        $kw25$ADD_FN = SubLObjectFactory.makeKeyword("ADD-FN");
        $kw26$ADD_ALL_FN = SubLObjectFactory.makeKeyword("ADD-ALL-FN");
        $kw27$SIZE_FN = SubLObjectFactory.makeKeyword("SIZE-FN");
        $kw28$CONTENTS_FN = SubLObjectFactory.makeKeyword("CONTENTS-FN");
        $kw29$ITERATOR_FN = SubLObjectFactory.makeKeyword("ITERATOR-FN");
        $str30$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw31$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym32$MAKE_ACCUMULATOR = SubLObjectFactory.makeSymbol("MAKE-ACCUMULATOR");
        $kw33$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw34$END = SubLObjectFactory.makeKeyword("END");
        $sym35$VISIT_DEFSTRUCT_OBJECT_ACCUMULATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ACCUMULATOR-METHOD");
        $str36$empty = SubLObjectFactory.makeString("empty");
        $str37$_A_elems = SubLObjectFactory.makeString("~A elems");
        $sym38$DEFAULT_ACCUMULATION_ADD_ALL = SubLObjectFactory.makeSymbol("DEFAULT-ACCUMULATION-ADD-ALL");
        $sym39$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str40$Implementation_Error__Accumulator = SubLObjectFactory.makeString("Implementation Error: Accumulator ~A has an invalid size function.");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ACCUMULATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw43$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw44$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym45$ITERATOR_VAR = SubLObjectFactory.makeUninternedSymbol("ITERATOR-VAR");
        $sym46$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym47$ACCUMULATION_ITERATOR = SubLObjectFactory.makeSymbol("ACCUMULATION-ITERATOR");
        $sym48$DO_ITERATOR = SubLObjectFactory.makeSymbol("DO-ITERATOR");
        $sym49$LIST_ACCUMULATOR_RESET = SubLObjectFactory.makeSymbol("LIST-ACCUMULATOR-RESET");
        $sym50$LIST_ACCUMULATOR_ADD = SubLObjectFactory.makeSymbol("LIST-ACCUMULATOR-ADD");
        $sym51$LIST_ACCUMULATOR_SIZE = SubLObjectFactory.makeSymbol("LIST-ACCUMULATOR-SIZE");
        $sym52$LIST_ACCUMULATOR_CONTENTS = SubLObjectFactory.makeSymbol("LIST-ACCUMULATOR-CONTENTS");
        $sym53$LIST_ACCUMULATOR_ITERATOR = SubLObjectFactory.makeSymbol("LIST-ACCUMULATOR-ITERATOR");
        $str54$New_list_accumulator__A_is_not_em = SubLObjectFactory.makeString("New list accumulator ~A is not empty?");
        $str55$Accumulator_should_have__A_elemen = SubLObjectFactory.makeString("Accumulator should have ~A elements but has ~A.~%");
        $str56$Mismatch_between_iterator_content = SubLObjectFactory.makeString("Mismatch between iterator contents of ~A and input list!");
        $str57$Accumulator__A_contains_less_item = SubLObjectFactory.makeString("Accumulator ~A contains less items than the input iterator has!");
        $str58$Destructively_emptied_accumulator = SubLObjectFactory.makeString("Destructively emptied accumulator ~A is not empty?");
        $sym59$SET_ACCUMULATOR_RESET = SubLObjectFactory.makeSymbol("SET-ACCUMULATOR-RESET");
        $sym60$SET_ACCUMULATOR_ADD = SubLObjectFactory.makeSymbol("SET-ACCUMULATOR-ADD");
        $sym61$SET_ACCUMULATOR_SIZE = SubLObjectFactory.makeSymbol("SET-ACCUMULATOR-SIZE");
        $sym62$SET_ACCUMULATOR_CONTENTS = SubLObjectFactory.makeSymbol("SET-ACCUMULATOR-CONTENTS");
        $sym63$SET_ACCUMULATOR_ITERATOR = SubLObjectFactory.makeSymbol("SET-ACCUMULATOR-ITERATOR");
        $str64$New_set_accumulator__A_is_not_emp = SubLObjectFactory.makeString("New set accumulator ~A is not empty?");
        $sym65$DICTIONARY_ACCUMULATOR_RESET = SubLObjectFactory.makeSymbol("DICTIONARY-ACCUMULATOR-RESET");
        $sym66$DICTIONARY_ACCUMULATOR_ADD = SubLObjectFactory.makeSymbol("DICTIONARY-ACCUMULATOR-ADD");
        $sym67$DICTIONARY_ACCUMULATOR_SIZE = SubLObjectFactory.makeSymbol("DICTIONARY-ACCUMULATOR-SIZE");
        $sym68$DICTIONARY_ACCUMULATOR_CONTENTS = SubLObjectFactory.makeSymbol("DICTIONARY-ACCUMULATOR-CONTENTS");
        $sym69$DICTIONARY_ACCUMULATOR_ITERATOR = SubLObjectFactory.makeSymbol("DICTIONARY-ACCUMULATOR-ITERATOR");
        $str70$Dictionary_accumulator_expects_tu = SubLObjectFactory.makeString("Dictionary accumulator expects tuples of (KEY . VALUE), not ~A.~%");
        $list71 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str72$New_dictionary_accumulator__A_is_ = SubLObjectFactory.makeString("New dictionary accumulator ~A is not empty?");
        $sym73$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym74$FALSE = SubLObjectFactory.makeSymbol("FALSE");
        $sym75$ZERO = SubLObjectFactory.makeSymbol("ZERO");
        $sym76$NEW_NULL_ITERATOR_DUMMY = SubLObjectFactory.makeSymbol("NEW-NULL-ITERATOR-DUMMY");
        $str77$New_null_accumulator__A_is_not_em = SubLObjectFactory.makeString("New null accumulator ~A is not empty");
        $str78$New_null_accumulator__A_is_no_lon = SubLObjectFactory.makeString("New null accumulator ~A is no longer empty");
        $str79$Expected_iterator__a_to_be_empty = SubLObjectFactory.makeString("Expected iterator ~a to be empty");
        $str80$Destructively_emptied_accumulator = SubLObjectFactory.makeString("Destructively emptied accumulator ~A is not empty");
        $str81$Contents_were__a_instead_of_null = SubLObjectFactory.makeString("Contents were ~a instead of null");
        $sym82$NUMERIC_ACCUMULATOR_SIZE_FN = SubLObjectFactory.makeSymbol("NUMERIC-ACCUMULATOR-SIZE-FN");
        $sym83$NUMERIC_ACCUMULATION_ITERATOR = SubLObjectFactory.makeSymbol("NUMERIC-ACCUMULATION-ITERATOR");
        $sym84$NUMERIC_CONTENTS_FN_DEFAULT_ZERO = SubLObjectFactory.makeSymbol("NUMERIC-CONTENTS-FN-DEFAULT-ZERO");
        $sym85$NUMERIC_CONTENTS_FN_DEFAULT_ONE = SubLObjectFactory.makeSymbol("NUMERIC-CONTENTS-FN-DEFAULT-ONE");
        $sym86$DWIMMED_SUM = SubLObjectFactory.makeSymbol("DWIMMED-SUM");
        $str87$New_sum_accumulator__A_is_not_emp = SubLObjectFactory.makeString("New sum accumulator ~A is not empty");
        $str88$Accumulator_should_have_1_element = SubLObjectFactory.makeString("Accumulator should have 1 element but has ~A.~%");
        $str89$Expected_iterator__a_to_have_only = SubLObjectFactory.makeString("Expected iterator ~a to have only 1 value");
        $str90$Contents_did_not_sum_to__a = SubLObjectFactory.makeString("Contents did not sum to ~a");
        $str91$Iterator_contained__a_instead_of_ = SubLObjectFactory.makeString("Iterator contained ~a instead of ~a");
        $sym92$DWIMMED_INCREMENT = SubLObjectFactory.makeSymbol("DWIMMED-INCREMENT");
        $str93$New_count_accumulator__A_is_not_e = SubLObjectFactory.makeString("New count accumulator ~A is not empty");
        $str94$Contents_did_not_count_to__a = SubLObjectFactory.makeString("Contents did not count to ~a");
        $sym95$DWIMMED_PRODUCT = SubLObjectFactory.makeSymbol("DWIMMED-PRODUCT");
        $str96$New_product_accumulator__A_is_not = SubLObjectFactory.makeString("New product accumulator ~A is not empty");
        $sym97$_ = SubLObjectFactory.makeSymbol("*");
        $str98$Contents_did_not_multiply_to__a = SubLObjectFactory.makeString("Contents did not multiply to ~a");
        $sym99$XFORM_ACCUMULATOR_RESET = SubLObjectFactory.makeSymbol("XFORM-ACCUMULATOR-RESET");
        $sym100$XFORM_ACCUMULATOR_ADD = SubLObjectFactory.makeSymbol("XFORM-ACCUMULATOR-ADD");
        $sym101$XFORM_ACCUMULATOR_SIZE = SubLObjectFactory.makeSymbol("XFORM-ACCUMULATOR-SIZE");
        $sym102$XFORM_ACCUMULATOR_CONTENTS = SubLObjectFactory.makeSymbol("XFORM-ACCUMULATOR-CONTENTS");
        $sym103$XFORM_ACCUMULATOR_ITERATOR = SubLObjectFactory.makeSymbol("XFORM-ACCUMULATOR-ITERATOR");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACC"), (SubLObject)SubLObjectFactory.makeSymbol("XFORM-FN"), (SubLObject)SubLObjectFactory.makeSymbol("PARAM"));
        $sym105$XFORM_ACCUMULATOR_ITORATOR = SubLObjectFactory.makeSymbol("XFORM-ACCUMULATOR-ITORATOR");
        $sym106$TEST_LIST_ACCUMULATOR = SubLObjectFactory.makeSymbol("TEST-LIST-ACCUMULATOR");
        $kw107$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw108$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw109$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw110$KB = SubLObjectFactory.makeKeyword("KB");
        $kw111$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw112$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list113 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { accumulation.ONE_INTEGER, accumulation.TWO_INTEGER, accumulation.THREE_INTEGER, accumulation.FOUR_INTEGER, accumulation.FIVE_INTEGER, accumulation.SIX_INTEGER, accumulation.SEVEN_INTEGER, accumulation.EIGHT_INTEGER, accumulation.NINE_INTEGER, accumulation.ZERO_INTEGER })), (SubLObject)accumulation.T));
        $sym114$TEST_SET_ACCUMULATOR = SubLObjectFactory.makeSymbol("TEST-SET-ACCUMULATOR");
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { accumulation.ONE_INTEGER, accumulation.TWO_INTEGER, accumulation.THREE_INTEGER, accumulation.FOUR_INTEGER, accumulation.FIVE_INTEGER, accumulation.SIX_INTEGER, accumulation.SEVEN_INTEGER, accumulation.EIGHT_INTEGER, accumulation.NINE_INTEGER, accumulation.ZERO_INTEGER }), (SubLObject)accumulation.EQUAL), (SubLObject)accumulation.T));
        $sym116$TEST_DICTIONARY_ACCUMULATOR = SubLObjectFactory.makeSymbol("TEST-DICTIONARY-ACCUMULATOR");
        $list117 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)accumulation.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Eins")), ConsesLow.list((SubLObject)accumulation.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Zwei")), ConsesLow.list((SubLObject)accumulation.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Drei")), ConsesLow.list((SubLObject)accumulation.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeString("Vier")), ConsesLow.list((SubLObject)accumulation.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeString("F&uuml;nf")), ConsesLow.list((SubLObject)accumulation.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeString("Sechs")), ConsesLow.list((SubLObject)accumulation.SEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("Sieben")), ConsesLow.list((SubLObject)accumulation.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeString("Acht")), ConsesLow.list((SubLObject)accumulation.NINE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Neun")), ConsesLow.list((SubLObject)accumulation.TEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("Zehn")) }), (SubLObject)accumulation.EQUAL), (SubLObject)accumulation.T));
        $sym118$TEST_NULL_ACCUMULATOR = SubLObjectFactory.makeSymbol("TEST-NULL-ACCUMULATOR");
        $list119 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { accumulation.ONE_INTEGER, accumulation.TWO_INTEGER, accumulation.THREE_INTEGER, accumulation.FOUR_INTEGER, accumulation.FIVE_INTEGER, accumulation.SIX_INTEGER, accumulation.SEVEN_INTEGER, accumulation.EIGHT_INTEGER, accumulation.NINE_INTEGER, accumulation.TEN_INTEGER })), (SubLObject)accumulation.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)Characters.CHAR_b, (SubLObject)accumulation.THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FOURTH")))), (SubLObject)accumulation.T));
        $sym120$TEST_SUM_ACCUMULATOR = SubLObjectFactory.makeSymbol("TEST-SUM-ACCUMULATOR");
        $list121 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { accumulation.ONE_INTEGER, accumulation.TWO_INTEGER, accumulation.THREE_INTEGER, accumulation.FOUR_INTEGER, accumulation.FIVE_INTEGER, accumulation.SIX_INTEGER, accumulation.SEVEN_INTEGER, accumulation.EIGHT_INTEGER, accumulation.NINE_INTEGER, accumulation.TEN_INTEGER })), (SubLObject)accumulation.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)accumulation.ONE_INTEGER, (SubLObject)accumulation.ONE_INTEGER, (SubLObject)accumulation.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(-3))), (SubLObject)accumulation.T));
        $sym122$TEST_COUNT_ACCUMULATOR = SubLObjectFactory.makeSymbol("TEST-COUNT-ACCUMULATOR");
        $sym123$TEST_PRODUCT_ACCUMULATOR = SubLObjectFactory.makeSymbol("TEST-PRODUCT-ACCUMULATOR");
        $list124 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { accumulation.ONE_INTEGER, accumulation.TWO_INTEGER, accumulation.THREE_INTEGER, accumulation.FOUR_INTEGER, accumulation.FIVE_INTEGER, accumulation.SIX_INTEGER, accumulation.SEVEN_INTEGER, accumulation.EIGHT_INTEGER, accumulation.NINE_INTEGER, accumulation.TEN_INTEGER })), (SubLObject)accumulation.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)accumulation.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeDouble(0.5))), (SubLObject)accumulation.T));
    }
    
    public static final class $accumulator_native extends SubLStructNative
    {
        public SubLObject $state;
        public SubLObject $reset_fn;
        public SubLObject $add_fn;
        public SubLObject $add_all_fn;
        public SubLObject $size_fn;
        public SubLObject $contents_fn;
        public SubLObject $iterator_fn;
        private static final SubLStructDeclNative structDecl;
        
        public $accumulator_native() {
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$reset_fn = (SubLObject)CommonSymbols.NIL;
            this.$add_fn = (SubLObject)CommonSymbols.NIL;
            this.$add_all_fn = (SubLObject)CommonSymbols.NIL;
            this.$size_fn = (SubLObject)CommonSymbols.NIL;
            this.$contents_fn = (SubLObject)CommonSymbols.NIL;
            this.$iterator_fn = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$accumulator_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$state;
        }
        
        public SubLObject getField3() {
            return this.$reset_fn;
        }
        
        public SubLObject getField4() {
            return this.$add_fn;
        }
        
        public SubLObject getField5() {
            return this.$add_all_fn;
        }
        
        public SubLObject getField6() {
            return this.$size_fn;
        }
        
        public SubLObject getField7() {
            return this.$contents_fn;
        }
        
        public SubLObject getField8() {
            return this.$iterator_fn;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$state = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$reset_fn = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$add_fn = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$add_all_fn = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$size_fn = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$contents_fn = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$iterator_fn = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$accumulator_native.class, accumulation.$sym0$ACCUMULATOR, accumulation.$sym1$ACCUMULATOR_P, accumulation.$list2, accumulation.$list3, new String[] { "$state", "$reset_fn", "$add_fn", "$add_all_fn", "$size_fn", "$contents_fn", "$iterator_fn" }, accumulation.$list4, accumulation.$list5, accumulation.$sym6$PRINT_ACCUMULATOR);
        }
    }
    
    public static final class $accumulator_p$UnaryFunction extends UnaryFunction
    {
        public $accumulator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ACCUMULATOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return accumulation.accumulator_p(arg1);
        }
    }
}

/*

	Total time: 297 ms
	
*/