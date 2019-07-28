package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.accumulation;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.accumulation.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_b;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class accumulation extends SubLTranslatedFile {
    public static final SubLFile me = new accumulation();

    public static final String myName = "com.cyc.cycjava.cycl.accumulation";

    public static final String myFingerPrint = "24193a3ce01f2505c1aed685a57879fef666331f8ea92cdfa65043fb4cbe792b";

    // defconstant
    public static final SubLSymbol $dtp_accumulator$ = makeSymbol("*DTP-ACCUMULATOR*");



    public static final SubLSymbol ACCUMULATOR_P = makeSymbol("ACCUMULATOR-P");

    public static final SubLList $list2 = list(makeSymbol("STATE"), makeSymbol("RESET-FN"), makeSymbol("ADD-FN"), makeSymbol("ADD-ALL-FN"), makeSymbol("SIZE-FN"), makeSymbol("CONTENTS-FN"), makeSymbol("ITERATOR-FN"));

    public static final SubLList $list3 = list(makeKeyword("STATE"), makeKeyword("RESET-FN"), makeKeyword("ADD-FN"), makeKeyword("ADD-ALL-FN"), makeKeyword("SIZE-FN"), makeKeyword("CONTENTS-FN"), makeKeyword("ITERATOR-FN"));

    public static final SubLList $list4 = list(makeSymbol("ACC-STATE"), makeSymbol("ACC-RESET-FN"), makeSymbol("ACC-ADD-FN"), makeSymbol("ACC-ADD-ALL-FN"), makeSymbol("ACC-SIZE-FN"), makeSymbol("ACC-CONTENTS-FN"), makeSymbol("ACC-ITERATOR-FN"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-ACC-STATE"), makeSymbol("_CSETF-ACC-RESET-FN"), makeSymbol("_CSETF-ACC-ADD-FN"), makeSymbol("_CSETF-ACC-ADD-ALL-FN"), makeSymbol("_CSETF-ACC-SIZE-FN"), makeSymbol("_CSETF-ACC-CONTENTS-FN"), makeSymbol("_CSETF-ACC-ITERATOR-FN"));

    public static final SubLSymbol PRINT_ACCUMULATOR = makeSymbol("PRINT-ACCUMULATOR");

    public static final SubLSymbol ACCUMULATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ACCUMULATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ACCUMULATOR-P"));

    private static final SubLSymbol ACC_STATE = makeSymbol("ACC-STATE");

    private static final SubLSymbol _CSETF_ACC_STATE = makeSymbol("_CSETF-ACC-STATE");

    private static final SubLSymbol ACC_RESET_FN = makeSymbol("ACC-RESET-FN");

    private static final SubLSymbol _CSETF_ACC_RESET_FN = makeSymbol("_CSETF-ACC-RESET-FN");

    private static final SubLSymbol ACC_ADD_FN = makeSymbol("ACC-ADD-FN");

    private static final SubLSymbol _CSETF_ACC_ADD_FN = makeSymbol("_CSETF-ACC-ADD-FN");

    private static final SubLSymbol ACC_ADD_ALL_FN = makeSymbol("ACC-ADD-ALL-FN");

    private static final SubLSymbol _CSETF_ACC_ADD_ALL_FN = makeSymbol("_CSETF-ACC-ADD-ALL-FN");

    private static final SubLSymbol ACC_SIZE_FN = makeSymbol("ACC-SIZE-FN");

    private static final SubLSymbol _CSETF_ACC_SIZE_FN = makeSymbol("_CSETF-ACC-SIZE-FN");

    private static final SubLSymbol ACC_CONTENTS_FN = makeSymbol("ACC-CONTENTS-FN");

    private static final SubLSymbol _CSETF_ACC_CONTENTS_FN = makeSymbol("_CSETF-ACC-CONTENTS-FN");

    private static final SubLSymbol ACC_ITERATOR_FN = makeSymbol("ACC-ITERATOR-FN");

    private static final SubLSymbol _CSETF_ACC_ITERATOR_FN = makeSymbol("_CSETF-ACC-ITERATOR-FN");







    private static final SubLSymbol $ADD_ALL_FN = makeKeyword("ADD-ALL-FN");







    private static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_ACCUMULATOR = makeSymbol("MAKE-ACCUMULATOR");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ACCUMULATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ACCUMULATOR-METHOD");

    private static final SubLString $$$empty = makeString("empty");

    private static final SubLString $str37$_A_elems = makeString("~A elems");

    private static final SubLSymbol DEFAULT_ACCUMULATION_ADD_ALL = makeSymbol("DEFAULT-ACCUMULATION-ADD-ALL");



    private static final SubLString $str40$Implementation_Error__Accumulator = makeString("Implementation Error: Accumulator ~A has an invalid size function.");

    public static final SubLList $list41 = list(list(makeSymbol("VALUE"), makeSymbol("ACCUMULATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list42 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLSymbol $sym45$ITERATOR_VAR = makeUninternedSymbol("ITERATOR-VAR");



    public static final SubLSymbol ACCUMULATION_ITERATOR = makeSymbol("ACCUMULATION-ITERATOR");



    public static final SubLSymbol LIST_ACCUMULATOR_RESET = makeSymbol("LIST-ACCUMULATOR-RESET");

    public static final SubLSymbol LIST_ACCUMULATOR_ADD = makeSymbol("LIST-ACCUMULATOR-ADD");

    public static final SubLSymbol LIST_ACCUMULATOR_SIZE = makeSymbol("LIST-ACCUMULATOR-SIZE");

    public static final SubLSymbol LIST_ACCUMULATOR_CONTENTS = makeSymbol("LIST-ACCUMULATOR-CONTENTS");

    public static final SubLSymbol LIST_ACCUMULATOR_ITERATOR = makeSymbol("LIST-ACCUMULATOR-ITERATOR");

    public static final SubLString $str54$New_list_accumulator__A_is_not_em = makeString("New list accumulator ~A is not empty?");

    public static final SubLString $str55$Accumulator_should_have__A_elemen = makeString("Accumulator should have ~A elements but has ~A.~%");

    public static final SubLString $str56$Mismatch_between_iterator_content = makeString("Mismatch between iterator contents of ~A and input list!");

    public static final SubLString $str57$Accumulator__A_contains_less_item = makeString("Accumulator ~A contains less items than the input iterator has!");

    public static final SubLString $str58$Destructively_emptied_accumulator = makeString("Destructively emptied accumulator ~A is not empty?");

    public static final SubLSymbol SET_ACCUMULATOR_RESET = makeSymbol("SET-ACCUMULATOR-RESET");

    public static final SubLSymbol SET_ACCUMULATOR_ADD = makeSymbol("SET-ACCUMULATOR-ADD");

    public static final SubLSymbol SET_ACCUMULATOR_SIZE = makeSymbol("SET-ACCUMULATOR-SIZE");

    public static final SubLSymbol SET_ACCUMULATOR_CONTENTS = makeSymbol("SET-ACCUMULATOR-CONTENTS");

    public static final SubLSymbol SET_ACCUMULATOR_ITERATOR = makeSymbol("SET-ACCUMULATOR-ITERATOR");

    public static final SubLString $str64$New_set_accumulator__A_is_not_emp = makeString("New set accumulator ~A is not empty?");

    public static final SubLSymbol DICTIONARY_ACCUMULATOR_RESET = makeSymbol("DICTIONARY-ACCUMULATOR-RESET");

    public static final SubLSymbol DICTIONARY_ACCUMULATOR_ADD = makeSymbol("DICTIONARY-ACCUMULATOR-ADD");

    public static final SubLSymbol DICTIONARY_ACCUMULATOR_SIZE = makeSymbol("DICTIONARY-ACCUMULATOR-SIZE");

    public static final SubLSymbol DICTIONARY_ACCUMULATOR_CONTENTS = makeSymbol("DICTIONARY-ACCUMULATOR-CONTENTS");

    public static final SubLSymbol DICTIONARY_ACCUMULATOR_ITERATOR = makeSymbol("DICTIONARY-ACCUMULATOR-ITERATOR");

    public static final SubLString $str70$Dictionary_accumulator_expects_tu = makeString("Dictionary accumulator expects tuples of (KEY . VALUE), not ~A.~%");

    public static final SubLList $list71 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    public static final SubLString $str72$New_dictionary_accumulator__A_is_ = makeString("New dictionary accumulator ~A is not empty?");





    public static final SubLSymbol ZERO = makeSymbol("ZERO");

    public static final SubLSymbol NEW_NULL_ITERATOR_DUMMY = makeSymbol("NEW-NULL-ITERATOR-DUMMY");

    public static final SubLString $str77$New_null_accumulator__A_is_not_em = makeString("New null accumulator ~A is not empty");

    public static final SubLString $str78$New_null_accumulator__A_is_no_lon = makeString("New null accumulator ~A is no longer empty");

    public static final SubLString $str79$Expected_iterator__a_to_be_empty = makeString("Expected iterator ~a to be empty");

    public static final SubLString $str80$Destructively_emptied_accumulator = makeString("Destructively emptied accumulator ~A is not empty");

    public static final SubLString $str81$Contents_were__a_instead_of_null = makeString("Contents were ~a instead of null");

    public static final SubLSymbol NUMERIC_ACCUMULATOR_SIZE_FN = makeSymbol("NUMERIC-ACCUMULATOR-SIZE-FN");

    public static final SubLSymbol NUMERIC_ACCUMULATION_ITERATOR = makeSymbol("NUMERIC-ACCUMULATION-ITERATOR");

    public static final SubLSymbol NUMERIC_CONTENTS_FN_DEFAULT_ZERO = makeSymbol("NUMERIC-CONTENTS-FN-DEFAULT-ZERO");

    public static final SubLSymbol NUMERIC_CONTENTS_FN_DEFAULT_ONE = makeSymbol("NUMERIC-CONTENTS-FN-DEFAULT-ONE");

    public static final SubLSymbol DWIMMED_SUM = makeSymbol("DWIMMED-SUM");

    public static final SubLString $str87$New_sum_accumulator__A_is_not_emp = makeString("New sum accumulator ~A is not empty");

    public static final SubLString $str88$Accumulator_should_have_1_element = makeString("Accumulator should have 1 element but has ~A.~%");

    public static final SubLString $str89$Expected_iterator__a_to_have_only = makeString("Expected iterator ~a to have only 1 value");

    public static final SubLString $str90$Contents_did_not_sum_to__a = makeString("Contents did not sum to ~a");

    public static final SubLString $str91$Iterator_contained__a_instead_of_ = makeString("Iterator contained ~a instead of ~a");

    public static final SubLSymbol DWIMMED_INCREMENT = makeSymbol("DWIMMED-INCREMENT");

    public static final SubLString $str93$New_count_accumulator__A_is_not_e = makeString("New count accumulator ~A is not empty");

    public static final SubLString $str94$Contents_did_not_count_to__a = makeString("Contents did not count to ~a");

    public static final SubLSymbol DWIMMED_PRODUCT = makeSymbol("DWIMMED-PRODUCT");

    public static final SubLString $str96$New_product_accumulator__A_is_not = makeString("New product accumulator ~A is not empty");

    public static final SubLSymbol $sym97$_ = makeSymbol("*");

    public static final SubLString $str98$Contents_did_not_multiply_to__a = makeString("Contents did not multiply to ~a");

    private static final SubLSymbol XFORM_ACCUMULATOR_RESET = makeSymbol("XFORM-ACCUMULATOR-RESET");

    private static final SubLSymbol XFORM_ACCUMULATOR_ADD = makeSymbol("XFORM-ACCUMULATOR-ADD");

    private static final SubLSymbol XFORM_ACCUMULATOR_SIZE = makeSymbol("XFORM-ACCUMULATOR-SIZE");

    private static final SubLSymbol XFORM_ACCUMULATOR_CONTENTS = makeSymbol("XFORM-ACCUMULATOR-CONTENTS");

    private static final SubLSymbol XFORM_ACCUMULATOR_ITERATOR = makeSymbol("XFORM-ACCUMULATOR-ITERATOR");

    private static final SubLList $list104 = list(makeSymbol("ACC"), makeSymbol("XFORM-FN"), makeSymbol("PARAM"));

    private static final SubLSymbol XFORM_ACCUMULATOR_ITORATOR = makeSymbol("XFORM-ACCUMULATOR-ITORATOR");

    private static final SubLSymbol TEST_LIST_ACCUMULATOR = makeSymbol("TEST-LIST-ACCUMULATOR");













    private static final SubLList $list113 = list(list(list(list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, ZERO_INTEGER })), T));

    private static final SubLSymbol TEST_SET_ACCUMULATOR = makeSymbol("TEST-SET-ACCUMULATOR");

    private static final SubLList $list115 = list(list(list(list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, ZERO_INTEGER }), EQUAL), T));

    private static final SubLSymbol TEST_DICTIONARY_ACCUMULATOR = makeSymbol("TEST-DICTIONARY-ACCUMULATOR");

    private static final SubLList $list117 = list(list(list(list(new SubLObject[]{ list(ONE_INTEGER, makeString("Eins")), list(TWO_INTEGER, makeString("Zwei")), list(THREE_INTEGER, makeString("Drei")), list(FOUR_INTEGER, makeString("Vier")), list(FIVE_INTEGER, makeString("F&uuml;nf")), list(SIX_INTEGER, makeString("Sechs")), list(SEVEN_INTEGER, makeString("Sieben")), list(EIGHT_INTEGER, makeString("Acht")), list(NINE_INTEGER, makeString("Neun")), list(TEN_INTEGER, makeString("Zehn")) }), EQUAL), T));

    private static final SubLSymbol TEST_NULL_ACCUMULATOR = makeSymbol("TEST-NULL-ACCUMULATOR");

    public static final SubLList $list119 = list(list(list(list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })), T), list(list(list(makeString("a"), CHAR_b, THREE_INTEGER, list(makeSymbol("FUNCTION"), makeSymbol("FOURTH")))), T));

    private static final SubLSymbol TEST_SUM_ACCUMULATOR = makeSymbol("TEST-SUM-ACCUMULATOR");

    private static final SubLList $list121 = list(list(list(list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })), T), list(list(list(ONE_INTEGER, ONE_INTEGER, ONE_INTEGER, makeInteger(-3))), T));

    private static final SubLSymbol TEST_COUNT_ACCUMULATOR = makeSymbol("TEST-COUNT-ACCUMULATOR");

    private static final SubLSymbol TEST_PRODUCT_ACCUMULATOR = makeSymbol("TEST-PRODUCT-ACCUMULATOR");

    private static final SubLList $list124 = list(list(list(list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })), T), list(list(list(TWO_INTEGER, makeDouble(0.5))), T));

    public static SubLObject accumulator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_accumulator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject accumulator_p(final SubLObject v_object) {
        return v_object.getClass() == accumulation.$accumulator_native.class ? T : NIL;
    }

    public static SubLObject acc_state(final SubLObject v_object) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject acc_reset_fn(final SubLObject v_object) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject acc_add_fn(final SubLObject v_object) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject acc_add_all_fn(final SubLObject v_object) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject acc_size_fn(final SubLObject v_object) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject acc_contents_fn(final SubLObject v_object) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject acc_iterator_fn(final SubLObject v_object) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_acc_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_acc_reset_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_acc_add_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_acc_add_all_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_acc_size_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_acc_contents_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_acc_iterator_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != accumulator_p(v_object) : "accumulation.accumulator_p(v_object) " + "CommonSymbols.NIL != accumulation.accumulator_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_accumulator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new accumulation.$accumulator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STATE)) {
                _csetf_acc_state(v_new, current_value);
            } else
                if (pcase_var.eql($RESET_FN)) {
                    _csetf_acc_reset_fn(v_new, current_value);
                } else
                    if (pcase_var.eql($ADD_FN)) {
                        _csetf_acc_add_fn(v_new, current_value);
                    } else
                        if (pcase_var.eql($ADD_ALL_FN)) {
                            _csetf_acc_add_all_fn(v_new, current_value);
                        } else
                            if (pcase_var.eql($SIZE_FN)) {
                                _csetf_acc_size_fn(v_new, current_value);
                            } else
                                if (pcase_var.eql($CONTENTS_FN)) {
                                    _csetf_acc_contents_fn(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ITERATOR_FN)) {
                                        _csetf_acc_iterator_fn(v_new, current_value);
                                    } else {
                                        Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_accumulator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ACCUMULATOR, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STATE, acc_state(obj));
        funcall(visitor_fn, obj, $SLOT, $RESET_FN, acc_reset_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ADD_FN, acc_add_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ADD_ALL_FN, acc_add_all_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $SIZE_FN, acc_size_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $CONTENTS_FN, acc_contents_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ITERATOR_FN, acc_iterator_fn(obj));
        funcall(visitor_fn, obj, $END, MAKE_ACCUMULATOR, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_accumulator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_accumulator(obj, visitor_fn);
    }

    public static SubLObject print_accumulator(final SubLObject acc, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(acc, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, acc, T, T);
            if (NIL != accumulation_empty_p(acc)) {
                write_string($$$empty, stream, UNPROVIDED, UNPROVIDED);
            } else {
                format(stream, $str37$_A_elems, accumulation_size(acc));
            }
            print_macros.print_unreadable_object_postamble(stream, acc, T, T);
        }
        return acc;
    }

    public static SubLObject new_accumulator(final SubLObject state, final SubLObject reset_fn, final SubLObject add_fn, final SubLObject size_fn, final SubLObject contents_fn, final SubLObject iterator_fn, SubLObject add_all_fn) {
        if (add_all_fn == UNPROVIDED) {
            add_all_fn = DEFAULT_ACCUMULATION_ADD_ALL;
        }
        final SubLObject acc = make_accumulator(UNPROVIDED);
        _csetf_acc_state(acc, state);
        _csetf_acc_reset_fn(acc, reset_fn);
        _csetf_acc_add_fn(acc, add_fn);
        _csetf_acc_add_all_fn(acc, add_all_fn);
        _csetf_acc_size_fn(acc, size_fn);
        _csetf_acc_contents_fn(acc, contents_fn);
        _csetf_acc_iterator_fn(acc, iterator_fn);
        return acc;
    }

    public static SubLObject accumulation_reset(final SubLObject acc) {
        assert NIL != accumulator_p(acc) : "accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) " + acc;
        final SubLObject state = acc_state(acc);
        final SubLObject reset_fn = acc_reset_fn(acc);
        final SubLObject new_state = funcall(reset_fn, state);
        _csetf_acc_state(acc, new_state);
        return acc;
    }

    public static SubLObject accumulation_add(final SubLObject acc, final SubLObject element) {
        assert NIL != accumulator_p(acc) : "accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) " + acc;
        final SubLObject state = acc_state(acc);
        final SubLObject add_fn = acc_add_fn(acc);
        final SubLObject new_state = funcall(add_fn, state, element);
        _csetf_acc_state(acc, new_state);
        return acc;
    }

    public static SubLObject accumulation_add_all(final SubLObject acc, final SubLObject elements) {
        assert NIL != accumulator_p(acc) : "accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) " + acc;
        assert NIL != listp(elements) : "Types.listp(elements) " + "CommonSymbols.NIL != Types.listp(elements) " + elements;
        final SubLObject add_all_fn = acc_add_all_fn(acc);
        funcall(add_all_fn, acc, elements);
        return acc;
    }

    public static SubLObject accumulation_size(final SubLObject acc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != accumulator_p(acc) : "accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) " + acc;
        final SubLObject state = acc_state(acc);
        final SubLObject size_fn = acc_size_fn(acc);
        final SubLObject size = funcall(size_fn, state);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == number_utilities.non_negative_number_p(size))) {
            Errors.error($str40$Implementation_Error__Accumulator, acc);
        }
        return size;
    }

    public static SubLObject accumulation_empty_p(final SubLObject acc) {
        return zerop(accumulation_size(acc));
    }

    public static SubLObject accumulation_contents(final SubLObject acc, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != accumulator_p(acc) : "accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) " + acc;
        final SubLObject state = acc_state(acc);
        final SubLObject contents_fn = acc_contents_fn(acc);
        thread.resetMultipleValues();
        final SubLObject contents = funcall(contents_fn, state, resetP);
        final SubLObject new_state = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != resetP) {
            _csetf_acc_state(acc, new_state);
        }
        return contents;
    }

    public static SubLObject accumulation_contents_destructively(final SubLObject acc) {
        return accumulation_contents(acc, T);
    }

    public static SubLObject accumulation_iterator(final SubLObject acc) {
        assert NIL != accumulator_p(acc) : "accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) " + acc;
        final SubLObject state = acc_state(acc);
        final SubLObject iterator_fn = acc_iterator_fn(acc);
        final SubLObject iterator = funcall(iterator_fn, state);
        return iterator;
    }

    public static SubLObject do_accumulator_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = NIL;
        SubLObject accumulator = NIL;
        destructuring_bind_must_consp(current, datum, $list41);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        accumulator = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list41);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list41);
            if (NIL == member(current_$1, $list42, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list41);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator_var = $sym45$ITERATOR_VAR;
        return list(CLET, list(list(iterator_var, list(ACCUMULATION_ITERATOR, accumulator))), listS(DO_ITERATOR, list(value, iterator_var, $DONE, done), append(body, NIL)));
    }

    public static SubLObject map_accumulator_contents(final SubLObject function, final SubLObject accumulator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator_var = accumulation_iterator(accumulator);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject item = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                funcall(function, item);
            }
        }
        return accumulator;
    }

    public static SubLObject default_accumulation_add_all(final SubLObject acc, final SubLObject items) {
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            accumulation_add(acc, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return acc;
    }

    public static SubLObject accumulation_peek_state(final SubLObject acc) {
        return acc_state(acc);
    }

    public static SubLObject accumulation_add_items(final SubLObject acc, final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject item = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                accumulation_add(acc, item);
            }
        }
        return acc;
    }

    public static SubLObject new_list_accumulator(SubLObject initial_contents) {
        if (initial_contents == UNPROVIDED) {
            initial_contents = NIL;
        }
        return new_accumulator(initial_contents, LIST_ACCUMULATOR_RESET, LIST_ACCUMULATOR_ADD, LIST_ACCUMULATOR_SIZE, LIST_ACCUMULATOR_CONTENTS, LIST_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    public static SubLObject list_accumulator_reset(final SubLObject old_state) {
        return NIL;
    }

    public static SubLObject list_accumulator_add(final SubLObject state, final SubLObject element) {
        return cons(element, state);
    }

    public static SubLObject list_accumulator_size(final SubLObject state) {
        return length(state);
    }

    public static SubLObject list_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        if (NIL != resetP) {
            return values(nreverse(state), NIL);
        }
        return values(reverse(state), state);
    }

    public static SubLObject list_accumulator_iterator(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject contents = list_accumulator_contents(state, NIL);
        final SubLObject new_state = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return iteration.new_list_iterator(contents);
    }

    public static SubLObject test_list_accumulator(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject acc = new_list_accumulator(UNPROVIDED);
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str54$New_list_accumulator__A_is_not_em);
        }
        SubLObject cdolist_list_var = list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            accumulation_add(acc, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        if (!length(list).numE(accumulation_size(acc))) {
            Errors.error($str55$Accumulator_should_have__A_elemen, length(list), accumulation_size(acc));
        }
        final SubLObject iterator = accumulation_iterator(acc);
        SubLObject index = list;
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                final SubLObject item2 = index.first();
                if (!item2.equal(current)) {
                    Errors.error($str56$Mismatch_between_iterator_content, acc);
                }
                index = index.rest();
            }
        }
        if (NIL != index) {
            Errors.error($str57$Accumulator__A_contains_less_item, acc);
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str58$Destructively_emptied_accumulator, acc);
        }
        return equal(list, contents);
    }

    public static SubLObject new_set_accumulator(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return new_accumulator(set.new_set(test, UNPROVIDED), SET_ACCUMULATOR_RESET, SET_ACCUMULATOR_ADD, SET_ACCUMULATOR_SIZE, SET_ACCUMULATOR_CONTENTS, SET_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    public static SubLObject set_accumulator_reset(final SubLObject old_state) {
        set.clear_set(old_state);
        return old_state;
    }

    public static SubLObject set_accumulator_add(final SubLObject state, final SubLObject element) {
        set.set_add(element, state);
        return state;
    }

    public static SubLObject set_accumulator_size(final SubLObject state) {
        return set.set_size(state);
    }

    public static SubLObject set_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        if (NIL != resetP) {
            return values(state, set.new_set(set.set_test(state), UNPROVIDED));
        }
        return values(set.copy_set(state), state);
    }

    public static SubLObject set_accumulator_iterator(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject contents = set_accumulator_contents(state, NIL);
        final SubLObject new_state = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return set.new_set_iterator(contents);
    }

    public static SubLObject test_set_accumulator(final SubLObject v_set_contents, final SubLObject test_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = set_utilities.construct_set_from_list(v_set_contents, test_fn, UNPROVIDED);
        final SubLObject acc = new_set_accumulator(set.set_test(v_set));
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str64$New_set_accumulator__A_is_not_emp);
        }
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject item;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            item = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
                accumulation_add(acc, item);
            }
        }
        if (!set.set_size(v_set).numE(accumulation_size(acc))) {
            Errors.error($str55$Accumulator_should_have__A_elemen, set.set_size(v_set), accumulation_size(acc));
        }
        final SubLObject iterator = accumulation_iterator(acc);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != valid) && (NIL == set.set_memberP(current, v_set))) {
                Errors.error($str56$Mismatch_between_iterator_content, acc);
            }
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str58$Destructively_emptied_accumulator, acc);
        }
        return set_utilities.sets_coextensionalP(v_set, contents);
    }

    public static SubLObject new_dictionary_accumulator(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return new_accumulator(dictionary.new_dictionary(test, UNPROVIDED), DICTIONARY_ACCUMULATOR_RESET, DICTIONARY_ACCUMULATOR_ADD, DICTIONARY_ACCUMULATOR_SIZE, DICTIONARY_ACCUMULATOR_CONTENTS, DICTIONARY_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    public static SubLObject new_dictionary_accumulator_tuple(final SubLObject key, final SubLObject value) {
        return cons(key, value);
    }

    public static SubLObject dictionary_accumulator_tuple_key(final SubLObject tuple) {
        return tuple.first();
    }

    public static SubLObject dictionary_accumulator_tuple_value(final SubLObject tuple) {
        return tuple.rest();
    }

    public static SubLObject dictionary_accumulator_reset(final SubLObject old_state) {
        dictionary.clear_dictionary(old_state);
        return old_state;
    }

    public static SubLObject dictionary_accumulator_add(final SubLObject state, final SubLObject tuple) {
        if (!tuple.isCons()) {
            Errors.error($str70$Dictionary_accumulator_expects_tu, tuple);
        }
        SubLObject key = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list71);
        key = tuple.first();
        final SubLObject current = value = tuple.rest();
        dictionary.dictionary_enter(state, key, value);
        return state;
    }

    public static SubLObject dictionary_accumulator_size(final SubLObject state) {
        return dictionary.dictionary_length(state);
    }

    public static SubLObject dictionary_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        if (NIL != resetP) {
            return values(state, dictionary.new_dictionary(dictionary.dictionary_test(state), UNPROVIDED));
        }
        return values(dictionary_utilities.copy_dictionary(state), state);
    }

    public static SubLObject dictionary_accumulator_iterator(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tuples = new_list_accumulator(UNPROVIDED);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(state)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            accumulation_add(tuples, cons(key, value));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return accumulation_iterator(tuples);
    }

    public static SubLObject test_dictionary_accumulator(final SubLObject tuple_list, final SubLObject test_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary_utilities.add_tuple_list_to_dictionary(tuple_list, dictionary.new_dictionary(test_fn, UNPROVIDED));
        final SubLObject acc = new_dictionary_accumulator(test_fn);
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str72$New_dictionary_accumulator__A_is_);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            accumulation_add(acc, new_dictionary_accumulator_tuple(key, value));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (!dictionary.dictionary_length(dict).numE(accumulation_size(acc))) {
            Errors.error($str55$Accumulator_should_have__A_elemen, dictionary.dictionary_length(dict), accumulation_size(acc));
        }
        final SubLObject iterator = accumulation_iterator(acc);
        final SubLObject not_found = gensym(UNPROVIDED);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                final SubLObject key2 = dictionary_accumulator_tuple_key(current);
                final SubLObject value2 = dictionary_accumulator_tuple_value(current);
                if (NIL == funcall(test_fn, value2, dictionary.dictionary_lookup(dict, key2, not_found))) {
                    Errors.error($str56$Mismatch_between_iterator_content, acc);
                }
            }
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str58$Destructively_emptied_accumulator, acc);
        }
        return dictionary_utilities.dictionaries_coextensionalP(dict, contents, UNPROVIDED);
    }

    public static SubLObject new_null_accumulator() {
        return new_accumulator(NIL, NULL, FALSE, ZERO, FALSE, NEW_NULL_ITERATOR_DUMMY, UNPROVIDED);
    }

    public static SubLObject new_null_iterator_dummy(final SubLObject dummy) {
        return iteration.new_null_iterator();
    }

    public static SubLObject test_null_accumulator(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject acc = new_null_accumulator();
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str77$New_null_accumulator__A_is_not_em);
        }
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            accumulation_add(acc, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str78$New_null_accumulator__A_is_no_lon);
        }
        final SubLObject iterator = accumulation_iterator(acc);
        SubLObject iterator_values = NIL;
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                iterator_values = cons(current, iterator_values);
            }
        }
        if (NIL != iterator_values) {
            Errors.error($str79$Expected_iterator__a_to_be_empty, iterator);
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str80$Destructively_emptied_accumulator, acc);
        }
        if (NIL != contents) {
            Errors.error($str81$Contents_were__a_instead_of_null, contents);
        }
        return T;
    }

    public static SubLObject new_numeric_accumulator(final SubLObject add_fn, final SubLObject contents_fn) {
        return new_accumulator(NIL, NULL, add_fn, NUMERIC_ACCUMULATOR_SIZE_FN, contents_fn, NUMERIC_ACCUMULATION_ITERATOR, UNPROVIDED);
    }

    public static SubLObject numeric_accumulation_iterator(final SubLObject state) {
        if (NIL != state) {
            return iteration.new_singleton_iterator(state);
        }
        return iteration.new_null_iterator();
    }

    public static SubLObject numeric_accumulator_size_fn(final SubLObject state) {
        if (NIL != state) {
            return ONE_INTEGER;
        }
        return ZERO_INTEGER;
    }

    public static SubLObject numeric_contents_fn_default_zero(SubLObject state, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        SubLObject result = state;
        if (NIL == result) {
            result = ZERO_INTEGER;
        }
        if (NIL != resetP) {
            state = NIL;
        }
        return values(result, state);
    }

    public static SubLObject numeric_contents_fn_default_one(SubLObject state, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        SubLObject result = state;
        if (NIL == result) {
            result = ONE_INTEGER;
        }
        if (NIL != resetP) {
            state = NIL;
        }
        return values(result, state);
    }

    public static SubLObject new_sum_accumulator() {
        return new_numeric_accumulator(DWIMMED_SUM, NUMERIC_CONTENTS_FN_DEFAULT_ZERO);
    }

    public static SubLObject dwimmed_sum(SubLObject obj1, SubLObject obj2) {
        if (!obj1.isNumber()) {
            obj1 = ZERO_INTEGER;
        }
        if (!obj2.isNumber()) {
            obj2 = ZERO_INTEGER;
        }
        return add(obj1, obj2);
    }

    public static SubLObject test_sum_accumulator(final SubLObject numbers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject acc = new_sum_accumulator();
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str87$New_sum_accumulator__A_is_not_emp);
        }
        SubLObject cdolist_list_var = numbers;
        SubLObject num = NIL;
        num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            accumulation_add(acc, num);
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        } 
        if (NIL == number_utilities.onep(accumulation_size(acc))) {
            Errors.error($str88$Accumulator_should_have_1_element, accumulation_size(acc));
        }
        final SubLObject iterator = accumulation_iterator(acc);
        SubLObject iterator_values = NIL;
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                iterator_values = cons(current, iterator_values);
            }
        }
        if (NIL == list_utilities.singletonP(iterator_values)) {
            Errors.error($str89$Expected_iterator__a_to_have_only, iterator);
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str80$Destructively_emptied_accumulator, acc);
        }
        if (!contents.numE(number_utilities.summation(numbers))) {
            Errors.error($str90$Contents_did_not_sum_to__a, number_utilities.summation(numbers));
        }
        if (!list_utilities.only_one(iterator_values).numE(contents)) {
            Errors.error($str91$Iterator_contained__a_instead_of_, list_utilities.only_one(iterator_values), contents);
        }
        return T;
    }

    public static SubLObject new_count_accumulator() {
        return new_numeric_accumulator(DWIMMED_INCREMENT, NUMERIC_CONTENTS_FN_DEFAULT_ZERO);
    }

    public static SubLObject dwimmed_increment(SubLObject partial_sum, final SubLObject dummy) {
        if (!partial_sum.isNumber()) {
            partial_sum = ZERO_INTEGER;
        }
        return number_utilities.f_1X(partial_sum);
    }

    public static SubLObject test_count_accumulator(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject acc = new_count_accumulator();
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str93$New_count_accumulator__A_is_not_e);
        }
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            accumulation_add(acc, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        if (NIL == number_utilities.onep(accumulation_size(acc))) {
            Errors.error($str88$Accumulator_should_have_1_element, accumulation_size(acc));
        }
        final SubLObject iterator = accumulation_iterator(acc);
        SubLObject iterator_values = NIL;
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                iterator_values = cons(current, iterator_values);
            }
        }
        if (NIL == list_utilities.singletonP(iterator_values)) {
            Errors.error($str89$Expected_iterator__a_to_have_only, iterator);
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str80$Destructively_emptied_accumulator, acc);
        }
        if (!contents.numE(length(items))) {
            Errors.error($str94$Contents_did_not_count_to__a, length(items));
        }
        if (!list_utilities.only_one(iterator_values).numE(contents)) {
            Errors.error($str91$Iterator_contained__a_instead_of_, list_utilities.only_one(iterator_values), contents);
        }
        return T;
    }

    public static SubLObject new_product_accumulator() {
        return new_numeric_accumulator(DWIMMED_PRODUCT, NUMERIC_CONTENTS_FN_DEFAULT_ONE);
    }

    public static SubLObject dwimmed_product(SubLObject obj1, SubLObject obj2) {
        if (!obj1.isNumber()) {
            obj1 = ONE_INTEGER;
        }
        if (!obj2.isNumber()) {
            obj2 = ONE_INTEGER;
        }
        return multiply(obj1, obj2);
    }

    public static SubLObject test_product_accumulator(final SubLObject numbers) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject acc = new_product_accumulator();
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str96$New_product_accumulator__A_is_not);
        }
        SubLObject cdolist_list_var = numbers;
        SubLObject num = NIL;
        num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            accumulation_add(acc, num);
            cdolist_list_var = cdolist_list_var.rest();
            num = cdolist_list_var.first();
        } 
        if (NIL == number_utilities.onep(accumulation_size(acc))) {
            Errors.error($str88$Accumulator_should_have_1_element, accumulation_size(acc));
        }
        final SubLObject iterator = accumulation_iterator(acc);
        SubLObject iterator_values = NIL;
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject current = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                iterator_values = cons(current, iterator_values);
            }
        }
        if (NIL == list_utilities.singletonP(iterator_values)) {
            Errors.error($str89$Expected_iterator__a_to_have_only, iterator);
        }
        final SubLObject contents = accumulation_contents_destructively(acc);
        if (NIL == accumulation_empty_p(acc)) {
            Errors.error($str80$Destructively_emptied_accumulator, acc);
        }
        if (!contents.numE(apply($sym97$_, numbers))) {
            Errors.error($str98$Contents_did_not_multiply_to__a, apply($sym97$_, numbers));
        }
        if (!list_utilities.only_one(iterator_values).numE(contents)) {
            Errors.error($str91$Iterator_contained__a_instead_of_, list_utilities.only_one(iterator_values), contents);
        }
        return T;
    }

    public static SubLObject new_transform_accumulator(final SubLObject accumulator, final SubLObject xform_fn, SubLObject param) {
        if (param == UNPROVIDED) {
            param = iteration.$xform_fn_param_do_not_pass$.getGlobalValue();
        }
        return new_accumulator(make_xform_accumulator_state(accumulator, xform_fn, param), XFORM_ACCUMULATOR_RESET, XFORM_ACCUMULATOR_ADD, XFORM_ACCUMULATOR_SIZE, XFORM_ACCUMULATOR_CONTENTS, XFORM_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    public static SubLObject make_xform_accumulator_state(final SubLObject acc, final SubLObject xform_fn, final SubLObject param) {
        return list(acc, xform_fn, param);
    }

    public static SubLObject xform_accumulator_reset(final SubLObject state) {
        final SubLObject acc = state.first();
        accumulation_reset(acc);
        return state;
    }

    public static SubLObject xform_accumulator_add(final SubLObject state, final SubLObject item) {
        SubLObject acc = NIL;
        SubLObject xform_fn = NIL;
        SubLObject param = NIL;
        destructuring_bind_must_consp(state, state, $list104);
        acc = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list104);
        xform_fn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list104);
        param = current.first();
        current = current.rest();
        if (NIL == current) {
            if (iteration.$xform_fn_param_do_not_pass$.getGlobalValue().eql(param)) {
                accumulation_add(acc, funcall(xform_fn, item));
            } else {
                accumulation_add(acc, funcall(xform_fn, item, param));
            }
        } else {
            cdestructuring_bind_error(state, $list104);
        }
        return state;
    }

    public static SubLObject xform_accumulator_size(final SubLObject state) {
        return accumulation_size(state.first());
    }

    public static SubLObject xform_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        return accumulation_contents(state.first(), resetP);
    }

    public static SubLObject xform_accumulator_itorator(final SubLObject state) {
        return accumulation_iterator(state.first());
    }

    public static SubLObject declare_accumulation_file() {
        declareFunction(me, "accumulator_print_function_trampoline", "ACCUMULATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "accumulator_p", "ACCUMULATOR-P", 1, 0, false);
        new accumulation.$accumulator_p$UnaryFunction();
        declareFunction(me, "acc_state", "ACC-STATE", 1, 0, false);
        declareFunction(me, "acc_reset_fn", "ACC-RESET-FN", 1, 0, false);
        declareFunction(me, "acc_add_fn", "ACC-ADD-FN", 1, 0, false);
        declareFunction(me, "acc_add_all_fn", "ACC-ADD-ALL-FN", 1, 0, false);
        declareFunction(me, "acc_size_fn", "ACC-SIZE-FN", 1, 0, false);
        declareFunction(me, "acc_contents_fn", "ACC-CONTENTS-FN", 1, 0, false);
        declareFunction(me, "acc_iterator_fn", "ACC-ITERATOR-FN", 1, 0, false);
        declareFunction(me, "_csetf_acc_state", "_CSETF-ACC-STATE", 2, 0, false);
        declareFunction(me, "_csetf_acc_reset_fn", "_CSETF-ACC-RESET-FN", 2, 0, false);
        declareFunction(me, "_csetf_acc_add_fn", "_CSETF-ACC-ADD-FN", 2, 0, false);
        declareFunction(me, "_csetf_acc_add_all_fn", "_CSETF-ACC-ADD-ALL-FN", 2, 0, false);
        declareFunction(me, "_csetf_acc_size_fn", "_CSETF-ACC-SIZE-FN", 2, 0, false);
        declareFunction(me, "_csetf_acc_contents_fn", "_CSETF-ACC-CONTENTS-FN", 2, 0, false);
        declareFunction(me, "_csetf_acc_iterator_fn", "_CSETF-ACC-ITERATOR-FN", 2, 0, false);
        declareFunction(me, "make_accumulator", "MAKE-ACCUMULATOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_accumulator", "VISIT-DEFSTRUCT-ACCUMULATOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_accumulator_method", "VISIT-DEFSTRUCT-OBJECT-ACCUMULATOR-METHOD", 2, 0, false);
        declareFunction(me, "print_accumulator", "PRINT-ACCUMULATOR", 3, 0, false);
        declareFunction(me, "new_accumulator", "NEW-ACCUMULATOR", 6, 1, false);
        declareFunction(me, "accumulation_reset", "ACCUMULATION-RESET", 1, 0, false);
        declareFunction(me, "accumulation_add", "ACCUMULATION-ADD", 2, 0, false);
        declareFunction(me, "accumulation_add_all", "ACCUMULATION-ADD-ALL", 2, 0, false);
        declareFunction(me, "accumulation_size", "ACCUMULATION-SIZE", 1, 0, false);
        declareFunction(me, "accumulation_empty_p", "ACCUMULATION-EMPTY-P", 1, 0, false);
        declareFunction(me, "accumulation_contents", "ACCUMULATION-CONTENTS", 1, 1, false);
        declareFunction(me, "accumulation_contents_destructively", "ACCUMULATION-CONTENTS-DESTRUCTIVELY", 1, 0, false);
        declareFunction(me, "accumulation_iterator", "ACCUMULATION-ITERATOR", 1, 0, false);
        declareMacro(me, "do_accumulator_contents", "DO-ACCUMULATOR-CONTENTS");
        declareFunction(me, "map_accumulator_contents", "MAP-ACCUMULATOR-CONTENTS", 2, 0, false);
        declareFunction(me, "default_accumulation_add_all", "DEFAULT-ACCUMULATION-ADD-ALL", 2, 0, false);
        declareFunction(me, "accumulation_peek_state", "ACCUMULATION-PEEK-STATE", 1, 0, false);
        declareFunction(me, "accumulation_add_items", "ACCUMULATION-ADD-ITEMS", 2, 0, false);
        declareFunction(me, "new_list_accumulator", "NEW-LIST-ACCUMULATOR", 0, 1, false);
        declareFunction(me, "list_accumulator_reset", "LIST-ACCUMULATOR-RESET", 1, 0, false);
        declareFunction(me, "list_accumulator_add", "LIST-ACCUMULATOR-ADD", 2, 0, false);
        declareFunction(me, "list_accumulator_size", "LIST-ACCUMULATOR-SIZE", 1, 0, false);
        declareFunction(me, "list_accumulator_contents", "LIST-ACCUMULATOR-CONTENTS", 1, 1, false);
        declareFunction(me, "list_accumulator_iterator", "LIST-ACCUMULATOR-ITERATOR", 1, 0, false);
        declareFunction(me, "test_list_accumulator", "TEST-LIST-ACCUMULATOR", 1, 0, false);
        declareFunction(me, "new_set_accumulator", "NEW-SET-ACCUMULATOR", 0, 1, false);
        declareFunction(me, "set_accumulator_reset", "SET-ACCUMULATOR-RESET", 1, 0, false);
        declareFunction(me, "set_accumulator_add", "SET-ACCUMULATOR-ADD", 2, 0, false);
        declareFunction(me, "set_accumulator_size", "SET-ACCUMULATOR-SIZE", 1, 0, false);
        declareFunction(me, "set_accumulator_contents", "SET-ACCUMULATOR-CONTENTS", 1, 1, false);
        declareFunction(me, "set_accumulator_iterator", "SET-ACCUMULATOR-ITERATOR", 1, 0, false);
        declareFunction(me, "test_set_accumulator", "TEST-SET-ACCUMULATOR", 2, 0, false);
        declareFunction(me, "new_dictionary_accumulator", "NEW-DICTIONARY-ACCUMULATOR", 0, 1, false);
        declareFunction(me, "new_dictionary_accumulator_tuple", "NEW-DICTIONARY-ACCUMULATOR-TUPLE", 2, 0, false);
        declareFunction(me, "dictionary_accumulator_tuple_key", "DICTIONARY-ACCUMULATOR-TUPLE-KEY", 1, 0, false);
        declareFunction(me, "dictionary_accumulator_tuple_value", "DICTIONARY-ACCUMULATOR-TUPLE-VALUE", 1, 0, false);
        declareFunction(me, "dictionary_accumulator_reset", "DICTIONARY-ACCUMULATOR-RESET", 1, 0, false);
        declareFunction(me, "dictionary_accumulator_add", "DICTIONARY-ACCUMULATOR-ADD", 2, 0, false);
        declareFunction(me, "dictionary_accumulator_size", "DICTIONARY-ACCUMULATOR-SIZE", 1, 0, false);
        declareFunction(me, "dictionary_accumulator_contents", "DICTIONARY-ACCUMULATOR-CONTENTS", 1, 1, false);
        declareFunction(me, "dictionary_accumulator_iterator", "DICTIONARY-ACCUMULATOR-ITERATOR", 1, 0, false);
        declareFunction(me, "test_dictionary_accumulator", "TEST-DICTIONARY-ACCUMULATOR", 2, 0, false);
        declareFunction(me, "new_null_accumulator", "NEW-NULL-ACCUMULATOR", 0, 0, false);
        declareFunction(me, "new_null_iterator_dummy", "NEW-NULL-ITERATOR-DUMMY", 1, 0, false);
        declareFunction(me, "test_null_accumulator", "TEST-NULL-ACCUMULATOR", 1, 0, false);
        declareFunction(me, "new_numeric_accumulator", "NEW-NUMERIC-ACCUMULATOR", 2, 0, false);
        declareFunction(me, "numeric_accumulation_iterator", "NUMERIC-ACCUMULATION-ITERATOR", 1, 0, false);
        declareFunction(me, "numeric_accumulator_size_fn", "NUMERIC-ACCUMULATOR-SIZE-FN", 1, 0, false);
        declareFunction(me, "numeric_contents_fn_default_zero", "NUMERIC-CONTENTS-FN-DEFAULT-ZERO", 1, 1, false);
        declareFunction(me, "numeric_contents_fn_default_one", "NUMERIC-CONTENTS-FN-DEFAULT-ONE", 1, 1, false);
        declareFunction(me, "new_sum_accumulator", "NEW-SUM-ACCUMULATOR", 0, 0, false);
        declareFunction(me, "dwimmed_sum", "DWIMMED-SUM", 2, 0, false);
        declareFunction(me, "test_sum_accumulator", "TEST-SUM-ACCUMULATOR", 1, 0, false);
        declareFunction(me, "new_count_accumulator", "NEW-COUNT-ACCUMULATOR", 0, 0, false);
        declareFunction(me, "dwimmed_increment", "DWIMMED-INCREMENT", 2, 0, false);
        declareFunction(me, "test_count_accumulator", "TEST-COUNT-ACCUMULATOR", 1, 0, false);
        declareFunction(me, "new_product_accumulator", "NEW-PRODUCT-ACCUMULATOR", 0, 0, false);
        declareFunction(me, "dwimmed_product", "DWIMMED-PRODUCT", 2, 0, false);
        declareFunction(me, "test_product_accumulator", "TEST-PRODUCT-ACCUMULATOR", 1, 0, false);
        declareFunction(me, "new_transform_accumulator", "NEW-TRANSFORM-ACCUMULATOR", 2, 1, false);
        declareFunction(me, "make_xform_accumulator_state", "MAKE-XFORM-ACCUMULATOR-STATE", 3, 0, false);
        declareFunction(me, "xform_accumulator_reset", "XFORM-ACCUMULATOR-RESET", 1, 0, false);
        declareFunction(me, "xform_accumulator_add", "XFORM-ACCUMULATOR-ADD", 2, 0, false);
        declareFunction(me, "xform_accumulator_size", "XFORM-ACCUMULATOR-SIZE", 1, 0, false);
        declareFunction(me, "xform_accumulator_contents", "XFORM-ACCUMULATOR-CONTENTS", 1, 1, false);
        declareFunction(me, "xform_accumulator_itorator", "XFORM-ACCUMULATOR-ITORATOR", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_accumulation_file() {
        defconstant("*DTP-ACCUMULATOR*", ACCUMULATOR);
        return NIL;
    }

    public static SubLObject setup_accumulation_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_accumulator$.getGlobalValue(), symbol_function(ACCUMULATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(ACC_STATE, _CSETF_ACC_STATE);
        def_csetf(ACC_RESET_FN, _CSETF_ACC_RESET_FN);
        def_csetf(ACC_ADD_FN, _CSETF_ACC_ADD_FN);
        def_csetf(ACC_ADD_ALL_FN, _CSETF_ACC_ADD_ALL_FN);
        def_csetf(ACC_SIZE_FN, _CSETF_ACC_SIZE_FN);
        def_csetf(ACC_CONTENTS_FN, _CSETF_ACC_CONTENTS_FN);
        def_csetf(ACC_ITERATOR_FN, _CSETF_ACC_ITERATOR_FN);
        identity(ACCUMULATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_accumulator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ACCUMULATOR_METHOD));
        note_funcall_helper_function(NUMERIC_ACCUMULATION_ITERATOR);
        note_funcall_helper_function(NUMERIC_ACCUMULATOR_SIZE_FN);
        note_funcall_helper_function(NUMERIC_CONTENTS_FN_DEFAULT_ZERO);
        note_funcall_helper_function(NUMERIC_CONTENTS_FN_DEFAULT_ONE);
        note_funcall_helper_function(XFORM_ACCUMULATOR_RESET);
        note_funcall_helper_function(XFORM_ACCUMULATOR_ADD);
        note_funcall_helper_function(XFORM_ACCUMULATOR_SIZE);
        note_funcall_helper_function(XFORM_ACCUMULATOR_CONTENTS);
        note_funcall_helper_function(XFORM_ACCUMULATOR_ITORATOR);
        define_test_case_table_int(TEST_LIST_ACCUMULATOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list113);
        define_test_case_table_int(TEST_SET_ACCUMULATOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list115);
        define_test_case_table_int(TEST_DICTIONARY_ACCUMULATOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list117);
        define_test_case_table_int(TEST_NULL_ACCUMULATOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list119);
        define_test_case_table_int(TEST_SUM_ACCUMULATOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list121);
        define_test_case_table_int(TEST_COUNT_ACCUMULATOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list119);
        define_test_case_table_int(TEST_PRODUCT_ACCUMULATOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list124);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_accumulation_file();
    }

    @Override
    public void initializeVariables() {
        init_accumulation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_accumulation_file();
    }

    static {































































































































    }

    public static final class $accumulator_native extends SubLStructNative {
        public SubLObject $state;

        public SubLObject $reset_fn;

        public SubLObject $add_fn;

        public SubLObject $add_all_fn;

        public SubLObject $size_fn;

        public SubLObject $contents_fn;

        public SubLObject $iterator_fn;

        private static final SubLStructDeclNative structDecl;

        public $accumulator_native() {
            this.$state = Lisp.NIL;
            this.$reset_fn = Lisp.NIL;
            this.$add_fn = Lisp.NIL;
            this.$add_all_fn = Lisp.NIL;
            this.$size_fn = Lisp.NIL;
            this.$contents_fn = Lisp.NIL;
            this.$iterator_fn = Lisp.NIL;
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
            return this.$reset_fn;
        }

        @Override
        public SubLObject getField4() {
            return this.$add_fn;
        }

        @Override
        public SubLObject getField5() {
            return this.$add_all_fn;
        }

        @Override
        public SubLObject getField6() {
            return this.$size_fn;
        }

        @Override
        public SubLObject getField7() {
            return this.$contents_fn;
        }

        @Override
        public SubLObject getField8() {
            return this.$iterator_fn;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$state = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$reset_fn = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$add_fn = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$add_all_fn = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$size_fn = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$contents_fn = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$iterator_fn = value;
        }

        static {
            structDecl = makeStructDeclNative(accumulation.$accumulator_native.class, ACCUMULATOR, ACCUMULATOR_P, $list2, $list3, new String[]{ "$state", "$reset_fn", "$add_fn", "$add_all_fn", "$size_fn", "$contents_fn", "$iterator_fn" }, $list4, $list5, PRINT_ACCUMULATOR);
        }
    }

    public static final class $accumulator_p$UnaryFunction extends UnaryFunction {
        public $accumulator_p$UnaryFunction() {
            super(extractFunctionNamed("ACCUMULATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return accumulator_p(arg1);
        }
    }
}

/**
 * Total time: 297 ms
 */
