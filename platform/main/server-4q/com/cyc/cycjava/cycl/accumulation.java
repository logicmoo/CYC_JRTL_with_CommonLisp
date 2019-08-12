/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ACCUMULATION
 * source file: /cyc/top/cycl/accumulation.lisp
 * created:     2019/07/03 17:37:15
 */
public final class accumulation extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final class $accumulator_native extends SubLStructNative {
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	public SubLObject getField2() {
	    return $state;
	}

	public SubLObject getField3() {
	    return $reset_fn;
	}

	public SubLObject getField4() {
	    return $add_fn;
	}

	public SubLObject getField5() {
	    return $add_all_fn;
	}

	public SubLObject getField6() {
	    return $size_fn;
	}

	public SubLObject getField7() {
	    return $contents_fn;
	}

	public SubLObject getField8() {
	    return $iterator_fn;
	}

	public SubLObject setField2(SubLObject value) {
	    return $state = value;
	}

	public SubLObject setField3(SubLObject value) {
	    return $reset_fn = value;
	}

	public SubLObject setField4(SubLObject value) {
	    return $add_fn = value;
	}

	public SubLObject setField5(SubLObject value) {
	    return $add_all_fn = value;
	}

	public SubLObject setField6(SubLObject value) {
	    return $size_fn = value;
	}

	public SubLObject setField7(SubLObject value) {
	    return $contents_fn = value;
	}

	public SubLObject setField8(SubLObject value) {
	    return $iterator_fn = value;
	}

	public SubLObject $state = Lisp.NIL;

	public SubLObject $reset_fn = Lisp.NIL;

	public SubLObject $add_fn = Lisp.NIL;

	public SubLObject $add_all_fn = Lisp.NIL;

	public SubLObject $size_fn = Lisp.NIL;

	public SubLObject $contents_fn = Lisp.NIL;

	public SubLObject $iterator_fn = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative($accumulator_native.class, ACCUMULATOR, ACCUMULATOR_P, $list_alt2, $list_alt3, new String[] { "$state", "$reset_fn", "$add_fn", "$add_all_fn", "$size_fn", "$contents_fn", "$iterator_fn" }, $list_alt4, $list_alt5,
		PRINT_ACCUMULATOR);
    }

    public static final SubLFile me = new accumulation();

    public static final String myName = "com.cyc.cycjava.cycl.accumulation";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_accumulator$ = makeSymbol("*DTP-ACCUMULATOR*");

    private static final SubLSymbol ACCUMULATOR_P = makeSymbol("ACCUMULATOR-P");

    static private final SubLList $list2 = list(makeSymbol("STATE"), makeSymbol("RESET-FN"), makeSymbol("ADD-FN"), makeSymbol("ADD-ALL-FN"), makeSymbol("SIZE-FN"), makeSymbol("CONTENTS-FN"), makeSymbol("ITERATOR-FN"));

    static private final SubLList $list3 = list(makeKeyword("STATE"), makeKeyword("RESET-FN"), makeKeyword("ADD-FN"), makeKeyword("ADD-ALL-FN"), makeKeyword("SIZE-FN"), makeKeyword("CONTENTS-FN"), makeKeyword("ITERATOR-FN"));

    static private final SubLList $list4 = list(makeSymbol("ACC-STATE"), makeSymbol("ACC-RESET-FN"), makeSymbol("ACC-ADD-FN"), makeSymbol("ACC-ADD-ALL-FN"), makeSymbol("ACC-SIZE-FN"), makeSymbol("ACC-CONTENTS-FN"), makeSymbol("ACC-ITERATOR-FN"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-ACC-STATE"), makeSymbol("_CSETF-ACC-RESET-FN"), makeSymbol("_CSETF-ACC-ADD-FN"), makeSymbol("_CSETF-ACC-ADD-ALL-FN"), makeSymbol("_CSETF-ACC-SIZE-FN"), makeSymbol("_CSETF-ACC-CONTENTS-FN"), makeSymbol("_CSETF-ACC-ITERATOR-FN"));

    private static final SubLSymbol PRINT_ACCUMULATOR = makeSymbol("PRINT-ACCUMULATOR");

    private static final SubLSymbol ACCUMULATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ACCUMULATOR-PRINT-FUNCTION-TRAMPOLINE");

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

    static private final SubLList $list41 = list(list(makeSymbol("VALUE"), makeSymbol("ACCUMULATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list42 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym45$ITERATOR_VAR = makeUninternedSymbol("ITERATOR-VAR");

    private static final SubLSymbol ACCUMULATION_ITERATOR = makeSymbol("ACCUMULATION-ITERATOR");

    private static final SubLSymbol LIST_ACCUMULATOR_RESET = makeSymbol("LIST-ACCUMULATOR-RESET");

    private static final SubLSymbol LIST_ACCUMULATOR_ADD = makeSymbol("LIST-ACCUMULATOR-ADD");

    private static final SubLSymbol LIST_ACCUMULATOR_SIZE = makeSymbol("LIST-ACCUMULATOR-SIZE");

    private static final SubLSymbol LIST_ACCUMULATOR_CONTENTS = makeSymbol("LIST-ACCUMULATOR-CONTENTS");

    private static final SubLSymbol LIST_ACCUMULATOR_ITERATOR = makeSymbol("LIST-ACCUMULATOR-ITERATOR");

    static private final SubLString $str54$New_list_accumulator__A_is_not_em = makeString("New list accumulator ~A is not empty?");

    static private final SubLString $str55$Accumulator_should_have__A_elemen = makeString("Accumulator should have ~A elements but has ~A.~%");

    static private final SubLString $str56$Mismatch_between_iterator_content = makeString("Mismatch between iterator contents of ~A and input list!");

    static private final SubLString $str57$Accumulator__A_contains_less_item = makeString("Accumulator ~A contains less items than the input iterator has!");

    static private final SubLString $str58$Destructively_emptied_accumulator = makeString("Destructively emptied accumulator ~A is not empty?");

    private static final SubLSymbol SET_ACCUMULATOR_RESET = makeSymbol("SET-ACCUMULATOR-RESET");

    private static final SubLSymbol SET_ACCUMULATOR_ADD = makeSymbol("SET-ACCUMULATOR-ADD");

    private static final SubLSymbol SET_ACCUMULATOR_SIZE = makeSymbol("SET-ACCUMULATOR-SIZE");

    private static final SubLSymbol SET_ACCUMULATOR_CONTENTS = makeSymbol("SET-ACCUMULATOR-CONTENTS");

    private static final SubLSymbol SET_ACCUMULATOR_ITERATOR = makeSymbol("SET-ACCUMULATOR-ITERATOR");

    static private final SubLString $str64$New_set_accumulator__A_is_not_emp = makeString("New set accumulator ~A is not empty?");

    private static final SubLSymbol DICTIONARY_ACCUMULATOR_RESET = makeSymbol("DICTIONARY-ACCUMULATOR-RESET");

    private static final SubLSymbol DICTIONARY_ACCUMULATOR_ADD = makeSymbol("DICTIONARY-ACCUMULATOR-ADD");

    private static final SubLSymbol DICTIONARY_ACCUMULATOR_SIZE = makeSymbol("DICTIONARY-ACCUMULATOR-SIZE");

    private static final SubLSymbol DICTIONARY_ACCUMULATOR_CONTENTS = makeSymbol("DICTIONARY-ACCUMULATOR-CONTENTS");

    private static final SubLSymbol DICTIONARY_ACCUMULATOR_ITERATOR = makeSymbol("DICTIONARY-ACCUMULATOR-ITERATOR");

    static private final SubLString $str70$Dictionary_accumulator_expects_tu = makeString("Dictionary accumulator expects tuples of (KEY . VALUE), not ~A.~%");

    static private final SubLList $list71 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLString $str72$New_dictionary_accumulator__A_is_ = makeString("New dictionary accumulator ~A is not empty?");

    private static final SubLSymbol ZERO = makeSymbol("ZERO");

    private static final SubLSymbol NEW_NULL_ITERATOR_DUMMY = makeSymbol("NEW-NULL-ITERATOR-DUMMY");

    static private final SubLString $str77$New_null_accumulator__A_is_not_em = makeString("New null accumulator ~A is not empty");

    static private final SubLString $str78$New_null_accumulator__A_is_no_lon = makeString("New null accumulator ~A is no longer empty");

    static private final SubLString $str79$Expected_iterator__a_to_be_empty = makeString("Expected iterator ~a to be empty");

    static private final SubLString $str80$Destructively_emptied_accumulator = makeString("Destructively emptied accumulator ~A is not empty");

    static private final SubLString $str81$Contents_were__a_instead_of_null = makeString("Contents were ~a instead of null");

    private static final SubLSymbol NUMERIC_ACCUMULATOR_SIZE_FN = makeSymbol("NUMERIC-ACCUMULATOR-SIZE-FN");

    private static final SubLSymbol NUMERIC_ACCUMULATION_ITERATOR = makeSymbol("NUMERIC-ACCUMULATION-ITERATOR");

    private static final SubLSymbol NUMERIC_CONTENTS_FN_DEFAULT_ZERO = makeSymbol("NUMERIC-CONTENTS-FN-DEFAULT-ZERO");

    private static final SubLSymbol NUMERIC_CONTENTS_FN_DEFAULT_ONE = makeSymbol("NUMERIC-CONTENTS-FN-DEFAULT-ONE");

    private static final SubLSymbol DWIMMED_SUM = makeSymbol("DWIMMED-SUM");

    static private final SubLString $str87$New_sum_accumulator__A_is_not_emp = makeString("New sum accumulator ~A is not empty");

    static private final SubLString $str88$Accumulator_should_have_1_element = makeString("Accumulator should have 1 element but has ~A.~%");

    static private final SubLString $str89$Expected_iterator__a_to_have_only = makeString("Expected iterator ~a to have only 1 value");

    static private final SubLString $str90$Contents_did_not_sum_to__a = makeString("Contents did not sum to ~a");

    static private final SubLString $str91$Iterator_contained__a_instead_of_ = makeString("Iterator contained ~a instead of ~a");

    private static final SubLSymbol DWIMMED_INCREMENT = makeSymbol("DWIMMED-INCREMENT");

    static private final SubLString $str93$New_count_accumulator__A_is_not_e = makeString("New count accumulator ~A is not empty");

    static private final SubLString $str94$Contents_did_not_count_to__a = makeString("Contents did not count to ~a");

    private static final SubLSymbol DWIMMED_PRODUCT = makeSymbol("DWIMMED-PRODUCT");

    static private final SubLString $str96$New_product_accumulator__A_is_not = makeString("New product accumulator ~A is not empty");

    static private final SubLSymbol $sym97$_ = makeSymbol("*");

    static private final SubLString $str98$Contents_did_not_multiply_to__a = makeString("Contents did not multiply to ~a");

    private static final SubLSymbol XFORM_ACCUMULATOR_RESET = makeSymbol("XFORM-ACCUMULATOR-RESET");

    private static final SubLSymbol XFORM_ACCUMULATOR_ADD = makeSymbol("XFORM-ACCUMULATOR-ADD");

    private static final SubLSymbol XFORM_ACCUMULATOR_SIZE = makeSymbol("XFORM-ACCUMULATOR-SIZE");

    private static final SubLSymbol XFORM_ACCUMULATOR_CONTENTS = makeSymbol("XFORM-ACCUMULATOR-CONTENTS");

    private static final SubLSymbol XFORM_ACCUMULATOR_ITERATOR = makeSymbol("XFORM-ACCUMULATOR-ITERATOR");

    private static final SubLList $list104 = list(makeSymbol("ACC"), makeSymbol("XFORM-FN"), makeSymbol("PARAM"));

    private static final SubLSymbol XFORM_ACCUMULATOR_ITORATOR = makeSymbol("XFORM-ACCUMULATOR-ITORATOR");

    private static final SubLSymbol TEST_LIST_ACCUMULATOR = makeSymbol("TEST-LIST-ACCUMULATOR");

    private static final SubLList $list113 = list(list(list(list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, ZERO_INTEGER })), T));

    private static final SubLSymbol TEST_SET_ACCUMULATOR = makeSymbol("TEST-SET-ACCUMULATOR");

    private static final SubLList $list115 = list(list(list(list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, ZERO_INTEGER }), EQUAL), T));

    private static final SubLSymbol TEST_DICTIONARY_ACCUMULATOR = makeSymbol("TEST-DICTIONARY-ACCUMULATOR");

    private static final SubLList $list117 = list(list(list(list(new SubLObject[] { list(ONE_INTEGER, makeString("Eins")), list(TWO_INTEGER, makeString("Zwei")), list(THREE_INTEGER, makeString("Drei")), list(FOUR_INTEGER, makeString("Vier")), list(FIVE_INTEGER, makeString("F&uuml;nf")),
	    list(SIX_INTEGER, makeString("Sechs")), list(SEVEN_INTEGER, makeString("Sieben")), list(EIGHT_INTEGER, makeString("Acht")), list(NINE_INTEGER, makeString("Neun")), list(TEN_INTEGER, makeString("Zehn")) }), EQUAL), T));

    private static final SubLSymbol TEST_NULL_ACCUMULATOR = makeSymbol("TEST-NULL-ACCUMULATOR");

    static private final SubLList $list119 = list(list(list(list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })), T),
	    list(list(list(makeString("a"), CHAR_b, THREE_INTEGER, list(makeSymbol("FUNCTION"), makeSymbol("FOURTH")))), T));

    private static final SubLSymbol TEST_SUM_ACCUMULATOR = makeSymbol("TEST-SUM-ACCUMULATOR");

    private static final SubLList $list121 = list(list(list(list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })), T),
	    list(list(list(ONE_INTEGER, ONE_INTEGER, ONE_INTEGER, makeInteger(-3))), T));

    private static final SubLSymbol TEST_COUNT_ACCUMULATOR = makeSymbol("TEST-COUNT-ACCUMULATOR");

    private static final SubLSymbol TEST_PRODUCT_ACCUMULATOR = makeSymbol("TEST-PRODUCT-ACCUMULATOR");

    private static final SubLList $list124 = list(list(list(list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })), T), list(list(list(TWO_INTEGER, makeDouble(0.5))), T));

    public static final SubLObject accumulator_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	print_accumulator(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject accumulator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	print_accumulator(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject accumulator_p_alt(SubLObject v_object) {
	return v_object.getClass() == $accumulator_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject accumulator_p(final SubLObject v_object) {
	return v_object.getClass() == $accumulator_native.class ? T : NIL;
    }

    public static final SubLObject acc_state_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.getField2();
    }

    public static SubLObject acc_state(final SubLObject v_object) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject acc_reset_fn_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.getField3();
    }

    public static SubLObject acc_reset_fn(final SubLObject v_object) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject acc_add_fn_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.getField4();
    }

    public static SubLObject acc_add_fn(final SubLObject v_object) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.getField4();
    }

    public static final SubLObject acc_add_all_fn_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.getField5();
    }

    public static SubLObject acc_add_all_fn(final SubLObject v_object) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.getField5();
    }

    public static final SubLObject acc_size_fn_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.getField6();
    }

    public static SubLObject acc_size_fn(final SubLObject v_object) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.getField6();
    }

    public static final SubLObject acc_contents_fn_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.getField7();
    }

    public static SubLObject acc_contents_fn(final SubLObject v_object) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.getField7();
    }

    public static final SubLObject acc_iterator_fn_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.getField8();
    }

    public static SubLObject acc_iterator_fn(final SubLObject v_object) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.getField8();
    }

    public static final SubLObject _csetf_acc_state_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_acc_state(final SubLObject v_object, final SubLObject value) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_acc_reset_fn_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_acc_reset_fn(final SubLObject v_object, final SubLObject value) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_acc_add_fn_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_acc_add_fn(final SubLObject v_object, final SubLObject value) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_acc_add_all_fn_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_acc_add_all_fn(final SubLObject v_object, final SubLObject value) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_acc_size_fn_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_acc_size_fn(final SubLObject v_object, final SubLObject value) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static final SubLObject _csetf_acc_contents_fn_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_acc_contents_fn(final SubLObject v_object, final SubLObject value) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static final SubLObject _csetf_acc_iterator_fn_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ACCUMULATOR_P);
	return v_object.setField8(value);
    }

    public static SubLObject _csetf_acc_iterator_fn(final SubLObject v_object, final SubLObject value) {
	assert NIL != accumulator_p(v_object) : "! accumulation.accumulator_p(v_object) " + "accumulation.accumulator_p error :" + v_object;
	return v_object.setField8(value);
    }

    public static final SubLObject make_accumulator_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new $accumulator_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($STATE)) {
			_csetf_acc_state(v_new, current_value);
		    } else {
			if (pcase_var.eql($RESET_FN)) {
			    _csetf_acc_reset_fn(v_new, current_value);
			} else {
			    if (pcase_var.eql($ADD_FN)) {
				_csetf_acc_add_fn(v_new, current_value);
			    } else {
				if (pcase_var.eql($ADD_ALL_FN)) {
				    _csetf_acc_add_all_fn(v_new, current_value);
				} else {
				    if (pcase_var.eql($SIZE_FN)) {
					_csetf_acc_size_fn(v_new, current_value);
				    } else {
					if (pcase_var.eql($CONTENTS_FN)) {
					    _csetf_acc_contents_fn(v_new, current_value);
					} else {
					    if (pcase_var.eql($ITERATOR_FN)) {
						_csetf_acc_iterator_fn(v_new, current_value);
					    } else {
						Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
					    }
					}
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

    public static SubLObject make_accumulator(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $accumulator_native();
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
	    } else if (pcase_var.eql($RESET_FN)) {
		_csetf_acc_reset_fn(v_new, current_value);
	    } else if (pcase_var.eql($ADD_FN)) {
		_csetf_acc_add_fn(v_new, current_value);
	    } else if (pcase_var.eql($ADD_ALL_FN)) {
		_csetf_acc_add_all_fn(v_new, current_value);
	    } else if (pcase_var.eql($SIZE_FN)) {
		_csetf_acc_size_fn(v_new, current_value);
	    } else if (pcase_var.eql($CONTENTS_FN)) {
		_csetf_acc_contents_fn(v_new, current_value);
	    } else if (pcase_var.eql($ITERATOR_FN)) {
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

    public static final SubLObject print_accumulator_alt(SubLObject acc, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $print_readably$.getDynamicValue(thread)) {
		print_not_readable(acc, stream);
	    } else {
		{
		    SubLObject v_object = acc;
		    SubLObject stream_1 = stream;
		    write_string($str_alt30$__, stream_1, UNPROVIDED, UNPROVIDED);
		    write(type_of(v_object), new SubLObject[] { $STREAM, stream_1 });
		    write_char(CHAR_space, stream_1);
		    if (NIL != accumulation_empty_p(acc)) {
			write_string($$$empty, stream, UNPROVIDED, UNPROVIDED);
		    } else {
			format(stream, $str_alt33$_A_elems, accumulation_size(acc));
		    }
		    write_char(CHAR_space, stream_1);
		    write(pointer(v_object), new SubLObject[] { $STREAM, stream_1, $BASE, SIXTEEN_INTEGER });
		    write_char(CHAR_greater, stream_1);
		}
	    }
	    return acc;
	}
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

    /**
     * Creates a new accumulator that has initial state STATE.
     *
     * @param RESET-FN
     * 		the function to be called in order to reset the
     * 		accumulator to its initial state; the function takes a single
     * 		argument, the old state, as its input and returns the new state
     * @param ADD-FN
     * 		the function to be called when a new element
     * 		is added to the accumulator; the function takes the state
     * 		as its first argument and the item to be added as the second,
     * 		and returns the new state
     * @param SIZE-FN
     * 		the function to be called to determine the number
     * 		of elements the accumulator contains at this point; the function
     * 		takes the state as its only argument and returns a FIXNUM-P or
     * 		0 if the accumulator is empty
     * @param CONTENTS-FN
     * 		the function to be called to extract a contents of
     * 		the appropriate data type from the accumulator; the function
     * 		takes the state as its first argument, and an optional boolean
     * 		of whether the contents extraction is destructive or non-destructive
     * 		of the contents of the accumulator; it returns two values,
     * 		the contents data structure and the new state of the accumulator
     * @param ITERATOR-FN
     * 		the function to be called to extract an ITERATOR
     * 		for the accumulated elements from the current accumulator state;
     * 		the function takes the current state as its argument and returns
     * 		a new ITERATOR-P appropriate for iterating over the elements of
     * 		the accumulator. The behavior of the ITERATOR-FN method should be
     * 		equivalent to calling CONTENTS-FN with the RESET? parameter bound to
     * 		NIL
     * @param ADD-ALL-FN
     * 		the function to be called to add multiple elements
     * 		to the accumulator. This function is optional, because its default
     * 		implementation is to iterate over the elements to be added, calling
     * 		ADD-FN for each.
     * @return an ACCUMULATOR-P
     */
    @LispMethod(comment = "Creates a new accumulator that has initial state STATE.\r\n\r\n@param RESET-FN\r\n\t\tthe function to be called in order to reset the\r\n\t\taccumulator to its initial state; the function takes a single\r\n\t\targument, the old state, as its input and returns the new state\r\n@param ADD-FN\r\n\t\tthe function to be called when a new element\r\n\t\tis added to the accumulator; the function takes the state\r\n\t\tas its first argument and the item to be added as the second,\r\n\t\tand returns the new state\r\n@param SIZE-FN\r\n\t\tthe function to be called to determine the number\r\n\t\tof elements the accumulator contains at this point; the function\r\n\t\ttakes the state as its only argument and returns a FIXNUM-P or\r\n\t\t0 if the accumulator is empty\r\n@param CONTENTS-FN\r\n\t\tthe function to be called to extract a contents of\r\n\t\tthe appropriate data type from the accumulator; the function\r\n\t\ttakes the state as its first argument, and an optional boolean\r\n\t\tof whether the contents extraction is destructive or non-destructive\r\n\t\tof the contents of the accumulator; it returns two values,\r\n\t\tthe contents data structure and the new state of the accumulator\r\n@param ITERATOR-FN\r\n\t\tthe function to be called to extract an ITERATOR\r\n\t\tfor the accumulated elements from the current accumulator state;\r\n\t\tthe function takes the current state as its argument and returns\r\n\t\ta new ITERATOR-P appropriate for iterating over the elements of\r\n\t\tthe accumulator. The behavior of the ITERATOR-FN method should be\r\n\t\tequivalent to calling CONTENTS-FN with the RESET? parameter bound to\r\n\t\tNIL\r\n@param ADD-ALL-FN\r\n\t\tthe function to be called to add multiple elements\r\n\t\tto the accumulator. This function is optional, because its default\r\n\t\timplementation is to iterate over the elements to be added, calling\r\n\t\tADD-FN for each.\r\n@return an ACCUMULATOR-P")
    public static final SubLObject new_accumulator_alt(SubLObject state, SubLObject reset_fn, SubLObject add_fn, SubLObject size_fn, SubLObject contents_fn, SubLObject iterator_fn, SubLObject add_all_fn) {
	if (add_all_fn == UNPROVIDED) {
	    add_all_fn = DEFAULT_ACCUMULATION_ADD_ALL;
	}
	{
	    SubLObject acc = make_accumulator(UNPROVIDED);
	    _csetf_acc_state(acc, state);
	    _csetf_acc_reset_fn(acc, reset_fn);
	    _csetf_acc_add_fn(acc, add_fn);
	    _csetf_acc_add_all_fn(acc, add_all_fn);
	    _csetf_acc_size_fn(acc, size_fn);
	    _csetf_acc_contents_fn(acc, contents_fn);
	    _csetf_acc_iterator_fn(acc, iterator_fn);
	    return acc;
	}
    }

    /**
     * Creates a new accumulator that has initial state STATE.
     *
     * @param RESET-FN
     * 		the function to be called in order to reset the
     * 		accumulator to its initial state; the function takes a single
     * 		argument, the old state, as its input and returns the new state
     * @param ADD-FN
     * 		the function to be called when a new element
     * 		is added to the accumulator; the function takes the state
     * 		as its first argument and the item to be added as the second,
     * 		and returns the new state
     * @param SIZE-FN
     * 		the function to be called to determine the number
     * 		of elements the accumulator contains at this point; the function
     * 		takes the state as its only argument and returns a FIXNUM-P or
     * 		0 if the accumulator is empty
     * @param CONTENTS-FN
     * 		the function to be called to extract a contents of
     * 		the appropriate data type from the accumulator; the function
     * 		takes the state as its first argument, and an optional boolean
     * 		of whether the contents extraction is destructive or non-destructive
     * 		of the contents of the accumulator; it returns two values,
     * 		the contents data structure and the new state of the accumulator
     * @param ITERATOR-FN
     * 		the function to be called to extract an ITERATOR
     * 		for the accumulated elements from the current accumulator state;
     * 		the function takes the current state as its argument and returns
     * 		a new ITERATOR-P appropriate for iterating over the elements of
     * 		the accumulator. The behavior of the ITERATOR-FN method should be
     * 		equivalent to calling CONTENTS-FN with the RESET? parameter bound to
     * 		NIL
     * @param ADD-ALL-FN
     * 		the function to be called to add multiple elements
     * 		to the accumulator. This function is optional, because its default
     * 		implementation is to iterate over the elements to be added, calling
     * 		ADD-FN for each.
     * @return an ACCUMULATOR-P
     */
    @LispMethod(comment = "Creates a new accumulator that has initial state STATE.\r\n\r\n@param RESET-FN\r\n\t\tthe function to be called in order to reset the\r\n\t\taccumulator to its initial state; the function takes a single\r\n\t\targument, the old state, as its input and returns the new state\r\n@param ADD-FN\r\n\t\tthe function to be called when a new element\r\n\t\tis added to the accumulator; the function takes the state\r\n\t\tas its first argument and the item to be added as the second,\r\n\t\tand returns the new state\r\n@param SIZE-FN\r\n\t\tthe function to be called to determine the number\r\n\t\tof elements the accumulator contains at this point; the function\r\n\t\ttakes the state as its only argument and returns a FIXNUM-P or\r\n\t\t0 if the accumulator is empty\r\n@param CONTENTS-FN\r\n\t\tthe function to be called to extract a contents of\r\n\t\tthe appropriate data type from the accumulator; the function\r\n\t\ttakes the state as its first argument, and an optional boolean\r\n\t\tof whether the contents extraction is destructive or non-destructive\r\n\t\tof the contents of the accumulator; it returns two values,\r\n\t\tthe contents data structure and the new state of the accumulator\r\n@param ITERATOR-FN\r\n\t\tthe function to be called to extract an ITERATOR\r\n\t\tfor the accumulated elements from the current accumulator state;\r\n\t\tthe function takes the current state as its argument and returns\r\n\t\ta new ITERATOR-P appropriate for iterating over the elements of\r\n\t\tthe accumulator. The behavior of the ITERATOR-FN method should be\r\n\t\tequivalent to calling CONTENTS-FN with the RESET? parameter bound to\r\n\t\tNIL\r\n@param ADD-ALL-FN\r\n\t\tthe function to be called to add multiple elements\r\n\t\tto the accumulator. This function is optional, because its default\r\n\t\timplementation is to iterate over the elements to be added, calling\r\n\t\tADD-FN for each.\r\n@return an ACCUMULATOR-P")
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

    /**
     * Resets the accumulator by invoking the RESET-FN on the state
     * and storing the new state in the accumulator.
     *
     * @return ACCUMULATOR-P
     */
    @LispMethod(comment = "Resets the accumulator by invoking the RESET-FN on the state\r\nand storing the new state in the accumulator.\r\n\r\n@return ACCUMULATOR-P\nResets the accumulator by invoking the RESET-FN on the state\nand storing the new state in the accumulator.")
    public static final SubLObject accumulation_reset_alt(SubLObject acc) {
	SubLTrampolineFile.checkType(acc, ACCUMULATOR_P);
	{
	    SubLObject state = acc_state(acc);
	    SubLObject reset_fn = acc_reset_fn(acc);
	    SubLObject new_state = funcall(reset_fn, state);
	    _csetf_acc_state(acc, new_state);
	}
	return acc;
    }

    /**
     * Resets the accumulator by invoking the RESET-FN on the state
     * and storing the new state in the accumulator.
     *
     * @return ACCUMULATOR-P
     */
    @LispMethod(comment = "Resets the accumulator by invoking the RESET-FN on the state\r\nand storing the new state in the accumulator.\r\n\r\n@return ACCUMULATOR-P\nResets the accumulator by invoking the RESET-FN on the state\nand storing the new state in the accumulator.")
    public static SubLObject accumulation_reset(final SubLObject acc) {
	assert NIL != accumulator_p(acc) : "! accumulation.accumulator_p(acc) " + ("accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) ") + acc;
	final SubLObject state = acc_state(acc);
	final SubLObject reset_fn = acc_reset_fn(acc);
	final SubLObject new_state = funcall(reset_fn, state);
	_csetf_acc_state(acc, new_state);
	return acc;
    }

    /**
     * Adds the element to the accumulator by invoking the ADD-FN on
     * the old state and the element and capturing the new state
     * for the accumulator's state slot.
     *
     * @return ACCUMULATOR-P
     */
    @LispMethod(comment = "Adds the element to the accumulator by invoking the ADD-FN on\r\nthe old state and the element and capturing the new state\r\nfor the accumulator\'s state slot.\r\n\r\n@return ACCUMULATOR-P\nAdds the element to the accumulator by invoking the ADD-FN on\nthe old state and the element and capturing the new state\nfor the accumulator\'s state slot.")
    public static final SubLObject accumulation_add_alt(SubLObject acc, SubLObject element) {
	SubLTrampolineFile.checkType(acc, ACCUMULATOR_P);
	{
	    SubLObject state = acc_state(acc);
	    SubLObject add_fn = acc_add_fn(acc);
	    SubLObject new_state = funcall(add_fn, state, element);
	    _csetf_acc_state(acc, new_state);
	}
	return acc;
    }

    /**
     * Adds the element to the accumulator by invoking the ADD-FN on
     * the old state and the element and capturing the new state
     * for the accumulator's state slot.
     *
     * @return ACCUMULATOR-P
     */
    @LispMethod(comment = "Adds the element to the accumulator by invoking the ADD-FN on\r\nthe old state and the element and capturing the new state\r\nfor the accumulator\'s state slot.\r\n\r\n@return ACCUMULATOR-P\nAdds the element to the accumulator by invoking the ADD-FN on\nthe old state and the element and capturing the new state\nfor the accumulator\'s state slot.")
    public static SubLObject accumulation_add(final SubLObject acc, final SubLObject element) {
	assert NIL != accumulator_p(acc) : "! accumulation.accumulator_p(acc) " + ("accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) ") + acc;
	final SubLObject state = acc_state(acc);
	final SubLObject add_fn = acc_add_fn(acc);
	final SubLObject new_state = funcall(add_fn, state, element);
	_csetf_acc_state(acc, new_state);
	return acc;
    }

    /**
     * Adds all of the elements to the accumulator by invoking
     * the ADD-ALL-FN on the old state and the element and
     * capturing the new state for the accumulator's state slot.
     *
     * @return ACCUMULATOR-P
     */
    @LispMethod(comment = "Adds all of the elements to the accumulator by invoking\r\nthe ADD-ALL-FN on the old state and the element and\r\ncapturing the new state for the accumulator\'s state slot.\r\n\r\n@return ACCUMULATOR-P\nAdds all of the elements to the accumulator by invoking\nthe ADD-ALL-FN on the old state and the element and\ncapturing the new state for the accumulator\'s state slot.")
    public static final SubLObject accumulation_add_all_alt(SubLObject acc, SubLObject elements) {
	SubLTrampolineFile.checkType(acc, ACCUMULATOR_P);
	SubLTrampolineFile.checkType(elements, LISTP);
	{
	    SubLObject add_all_fn = acc_add_all_fn(acc);
	    funcall(add_all_fn, acc, elements);
	}
	return acc;
    }

    /**
     * Adds all of the elements to the accumulator by invoking
     * the ADD-ALL-FN on the old state and the element and
     * capturing the new state for the accumulator's state slot.
     *
     * @return ACCUMULATOR-P
     */
    @LispMethod(comment = "Adds all of the elements to the accumulator by invoking\r\nthe ADD-ALL-FN on the old state and the element and\r\ncapturing the new state for the accumulator\'s state slot.\r\n\r\n@return ACCUMULATOR-P\nAdds all of the elements to the accumulator by invoking\nthe ADD-ALL-FN on the old state and the element and\ncapturing the new state for the accumulator\'s state slot.")
    public static SubLObject accumulation_add_all(final SubLObject acc, final SubLObject elements) {
	assert NIL != accumulator_p(acc) : "! accumulation.accumulator_p(acc) " + ("accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) ") + acc;
	assert NIL != listp(elements) : "! listp(elements) " + ("Types.listp(elements) " + "CommonSymbols.NIL != Types.listp(elements) ") + elements;
	final SubLObject add_all_fn = acc_add_all_fn(acc);
	funcall(add_all_fn, acc, elements);
	return acc;
    }

    /**
     * Computes the number of elements stored in the accumulator
     * by invoking the SIZE-FN on the STATE of the accumulator.
     *
     * @return NON-NEGATIVE-NUMBER-P the number of elements in the
    accumulator or 0 if the accumulator contains no elements,
    i.e.:
    (must (zerop (accumulation-size (accumulation-reset acc))) ...)
     */
    @LispMethod(comment = "Computes the number of elements stored in the accumulator\r\nby invoking the SIZE-FN on the STATE of the accumulator.\r\n\r\n@return NON-NEGATIVE-NUMBER-P the number of elements in the\r\naccumulator or 0 if the accumulator contains no elements,\r\ni.e.:\r\n(must (zerop (accumulation-size (accumulation-reset acc))) ...)\nComputes the number of elements stored in the accumulator\nby invoking the SIZE-FN on the STATE of the accumulator.")
    public static final SubLObject accumulation_size_alt(SubLObject acc) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(acc, ACCUMULATOR_P);
	    {
		SubLObject state = acc_state(acc);
		SubLObject size_fn = acc_size_fn(acc);
		SubLObject size = funcall(size_fn, state);
		if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		    if (NIL == number_utilities.non_negative_number_p(size)) {
			Errors.error($str_alt37$Implementation_Error__Accumulator, acc);
		    }
		}
		return size;
	    }
	}
    }

    /**
     * Computes the number of elements stored in the accumulator
     * by invoking the SIZE-FN on the STATE of the accumulator.
     *
     * @return NON-NEGATIVE-NUMBER-P the number of elements in the
    accumulator or 0 if the accumulator contains no elements,
    i.e.:
    (must (zerop (accumulation-size (accumulation-reset acc))) ...)
     */
    @LispMethod(comment = "Computes the number of elements stored in the accumulator\r\nby invoking the SIZE-FN on the STATE of the accumulator.\r\n\r\n@return NON-NEGATIVE-NUMBER-P the number of elements in the\r\naccumulator or 0 if the accumulator contains no elements,\r\ni.e.:\r\n(must (zerop (accumulation-size (accumulation-reset acc))) ...)\nComputes the number of elements stored in the accumulator\nby invoking the SIZE-FN on the STATE of the accumulator.")
    public static SubLObject accumulation_size(final SubLObject acc) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != accumulator_p(acc) : "! accumulation.accumulator_p(acc) " + ("accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) ") + acc;
	final SubLObject state = acc_state(acc);
	final SubLObject size_fn = acc_size_fn(acc);
	final SubLObject size = funcall(size_fn, state);
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == number_utilities.non_negative_number_p(size))) {
	    Errors.error($str40$Implementation_Error__Accumulator, acc);
	}
	return size;
    }

    /**
     * Convenience method for testing whether an accumulator has elements.
     *
     * @see ACCUMULATION-SIZE (acc)
     */
    @LispMethod(comment = "Convenience method for testing whether an accumulator has elements.\r\n\r\n@see ACCUMULATION-SIZE (acc)")
    public static final SubLObject accumulation_empty_p_alt(SubLObject acc) {
	return zerop(accumulation_size(acc));
    }

    /**
     * Convenience method for testing whether an accumulator has elements.
     *
     * @see ACCUMULATION-SIZE (acc)
     */
    @LispMethod(comment = "Convenience method for testing whether an accumulator has elements.\r\n\r\n@see ACCUMULATION-SIZE (acc)")
    public static SubLObject accumulation_empty_p(final SubLObject acc) {
	return zerop(accumulation_size(acc));
    }

    /**
     * Extracts the contents of the accumulator as a datastructure appropriate to
     * that accumulator. If the parameter RESET? is T, then the accumulator
     * will be empty after this operation. If RESET? is NIL, then the accumulator
     * should be fine afterwards.
     *
     * @return the accumulated contents in whatever object form is appropriate to
    the accumulator implementation
     */
    @LispMethod(comment = "Extracts the contents of the accumulator as a datastructure appropriate to\r\nthat accumulator. If the parameter RESET? is T, then the accumulator\r\nwill be empty after this operation. If RESET? is NIL, then the accumulator\r\nshould be fine afterwards.\r\n\r\n@return the accumulated contents in whatever object form is appropriate to\r\nthe accumulator implementation\nExtracts the contents of the accumulator as a datastructure appropriate to\nthat accumulator. If the parameter RESET? is T, then the accumulator\nwill be empty after this operation. If RESET? is NIL, then the accumulator\nshould be fine afterwards.")
    public static final SubLObject accumulation_contents_alt(SubLObject acc, SubLObject resetP) {
	if (resetP == UNPROVIDED) {
	    resetP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(acc, ACCUMULATOR_P);
	    {
		SubLObject state = acc_state(acc);
		SubLObject size = accumulation_size(acc);
		SubLObject contents_fn = acc_contents_fn(acc);
		thread.resetMultipleValues();
		{
		    SubLObject contents = funcall(contents_fn, state, resetP);
		    SubLObject new_state = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if (NIL != resetP) {
			_csetf_acc_state(acc, new_state);
		    }
		    if (NIL != resetP) {
			if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
			    if (NIL == accumulation_empty_p(acc)) {
				Errors.error($str_alt38$Destructively_extracting_the_cont, acc);
			    }
			}
		    } else {
			if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
			    if (!size.numE(accumulation_size(acc))) {
				Errors.error($str_alt39$Non_destructively_extracting_the_, acc);
			    }
			}
		    }
		    return contents;
		}
	    }
	}
    }

    /**
     * Extracts the contents of the accumulator as a datastructure appropriate to
     * that accumulator. If the parameter RESET? is T, then the accumulator
     * will be empty after this operation. If RESET? is NIL, then the accumulator
     * should be fine afterwards.
     *
     * @return the accumulated contents in whatever object form is appropriate to
    the accumulator implementation
     */
    @LispMethod(comment = "Extracts the contents of the accumulator as a datastructure appropriate to\r\nthat accumulator. If the parameter RESET? is T, then the accumulator\r\nwill be empty after this operation. If RESET? is NIL, then the accumulator\r\nshould be fine afterwards.\r\n\r\n@return the accumulated contents in whatever object form is appropriate to\r\nthe accumulator implementation\nExtracts the contents of the accumulator as a datastructure appropriate to\nthat accumulator. If the parameter RESET? is T, then the accumulator\nwill be empty after this operation. If RESET? is NIL, then the accumulator\nshould be fine afterwards.")
    public static SubLObject accumulation_contents(final SubLObject acc, SubLObject resetP) {
	if (resetP == UNPROVIDED) {
	    resetP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != accumulator_p(acc) : "! accumulation.accumulator_p(acc) " + ("accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) ") + acc;
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

    /**
     * Convenience method for ensuring that the reset happens after unpacking.
     */
    @LispMethod(comment = "Convenience method for ensuring that the reset happens after unpacking.")
    public static final SubLObject accumulation_contents_destructively_alt(SubLObject acc) {
	return accumulation_contents(acc, T);
    }

    /**
     * Convenience method for ensuring that the reset happens after unpacking.
     */
    @LispMethod(comment = "Convenience method for ensuring that the reset happens after unpacking.")
    public static SubLObject accumulation_contents_destructively(final SubLObject acc) {
	return accumulation_contents(acc, T);
    }

    /**
     * Gets the contents of the accumulator in a non-destructive fashion,
     * wraps it with an iterator object, and returns that to the caller.
     *
     * @return ITERATOR-P
     */
    @LispMethod(comment = "Gets the contents of the accumulator in a non-destructive fashion,\r\nwraps it with an iterator object, and returns that to the caller.\r\n\r\n@return ITERATOR-P\nGets the contents of the accumulator in a non-destructive fashion,\nwraps it with an iterator object, and returns that to the caller.")
    public static final SubLObject accumulation_iterator_alt(SubLObject acc) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(acc, ACCUMULATOR_P);
	    {
		SubLObject state = acc_state(acc);
		SubLObject size = accumulation_size(acc);
		SubLObject iterator_fn = acc_iterator_fn(acc);
		SubLObject iterator = funcall(iterator_fn, state);
		if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		    if (!size.numE(accumulation_size(acc))) {
			Errors.error($str_alt40$Creating_an_iterator_from_the_con, acc);
		    }
		}
		return iterator;
	    }
	}
    }

    /**
     * Gets the contents of the accumulator in a non-destructive fashion,
     * wraps it with an iterator object, and returns that to the caller.
     *
     * @return ITERATOR-P
     */
    @LispMethod(comment = "Gets the contents of the accumulator in a non-destructive fashion,\r\nwraps it with an iterator object, and returns that to the caller.\r\n\r\n@return ITERATOR-P\nGets the contents of the accumulator in a non-destructive fashion,\nwraps it with an iterator object, and returns that to the caller.")
    public static SubLObject accumulation_iterator(final SubLObject acc) {
	assert NIL != accumulator_p(acc) : "! accumulation.accumulator_p(acc) " + ("accumulation.accumulator_p(acc) " + "CommonSymbols.NIL != accumulation.accumulator_p(acc) ") + acc;
	final SubLObject state = acc_state(acc);
	final SubLObject iterator_fn = acc_iterator_fn(acc);
	final SubLObject iterator = funcall(iterator_fn, state);
	return iterator;
    }

    /**
     * Iterates over the current contents of the ACCUMULATOR, binding VALUE
     * to each of the elements of the contents in succession, until DONE is
     * true or the contents has been exhausted.
     */
    @LispMethod(comment = "Iterates over the current contents of the ACCUMULATOR, binding VALUE\r\nto each of the elements of the contents in succession, until DONE is\r\ntrue or the contents has been exhausted.\nIterates over the current contents of the ACCUMULATOR, binding VALUE\nto each of the elements of the contents in succession, until DONE is\ntrue or the contents has been exhausted.")
    public static final SubLObject do_accumulator_contents_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt41);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject value = NIL;
		    SubLObject accumulator = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt41);
		    value = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt41);
		    accumulator = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_2 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt41);
			    current_2 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt41);
			    if (NIL == member(current_2, $list_alt42, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_2 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt41);
			}
			{
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject iterator_var = $sym45$ITERATOR_VAR;
				return list(CLET, list(list(iterator_var, list(ACCUMULATION_ITERATOR, accumulator))), listS(DO_ITERATOR, list(value, iterator_var, $DONE, done), append(body, NIL)));
			    }
			}
		    }
		}
	    }
	}
    }

    /**
     * Iterates over the current contents of the ACCUMULATOR, binding VALUE
     * to each of the elements of the contents in succession, until DONE is
     * true or the contents has been exhausted.
     */
    @LispMethod(comment = "Iterates over the current contents of the ACCUMULATOR, binding VALUE\r\nto each of the elements of the contents in succession, until DONE is\r\ntrue or the contents has been exhausted.\nIterates over the current contents of the ACCUMULATOR, binding VALUE\nto each of the elements of the contents in succession, until DONE is\ntrue or the contents has been exhausted.")
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

    /**
     * Move over the contents of the accumulator, invoking function on each
     * element.
     *
     * @return ACCUMULATOR-P
     */
    @LispMethod(comment = "Move over the contents of the accumulator, invoking function on each\r\nelement.\r\n\r\n@return ACCUMULATOR-P\nMove over the contents of the accumulator, invoking function on each\nelement.")
    public static final SubLObject map_accumulator_contents_alt(SubLObject function, SubLObject accumulator) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject iterator_var = accumulation_iterator(accumulator);
		SubLObject done_var = NIL;
		while (NIL == done_var) {
		    thread.resetMultipleValues();
		    {
			SubLObject item = iteration.iteration_next(iterator_var);
			SubLObject valid = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL != valid) {
			    funcall(function, item);
			}
			done_var = makeBoolean(NIL == valid);
		    }
		}
	    }
	    return accumulator;
	}
    }

    /**
     * Move over the contents of the accumulator, invoking function on each
     * element.
     *
     * @return ACCUMULATOR-P
     */
    @LispMethod(comment = "Move over the contents of the accumulator, invoking function on each\r\nelement.\r\n\r\n@return ACCUMULATOR-P\nMove over the contents of the accumulator, invoking function on each\nelement.")
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

    /**
     * Iterates over the list of items, calling ADD for each of the individual
     * items. This method is a default for the ADD-ALL-FN argument to the
     * constructor to simplify the implementation of accumulations where
     * that approach works well enough.
     */
    @LispMethod(comment = "Iterates over the list of items, calling ADD for each of the individual\r\nitems. This method is a default for the ADD-ALL-FN argument to the\r\nconstructor to simplify the implementation of accumulations where\r\nthat approach works well enough.\nIterates over the list of items, calling ADD for each of the individual\nitems. This method is a default for the ADD-ALL-FN argument to the\nconstructor to simplify the implementation of accumulations where\nthat approach works well enough.")
    public static final SubLObject default_accumulation_add_all_alt(SubLObject acc, SubLObject items) {
	{
	    SubLObject cdolist_list_var = items;
	    SubLObject item = NIL;
	    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
		accumulation_add(acc, item);
	    }
	}
	return acc;
    }

    @LispMethod(comment = "Iterates over the list of items, calling ADD for each of the individual\r\nitems. This method is a default for the ADD-ALL-FN argument to the\r\nconstructor to simplify the implementation of accumulations where\r\nthat approach works well enough.\nIterates over the list of items, calling ADD for each of the individual\nitems. This method is a default for the ADD-ALL-FN argument to the\nconstructor to simplify the implementation of accumulations where\nthat approach works well enough.")
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

    /**
     * This method is strictly defined for the accumulation implementors.
     * As all powerful tools, beware the sharp edge.
     */
    @LispMethod(comment = "This method is strictly defined for the accumulation implementors.\r\nAs all powerful tools, beware the sharp edge.\nThis method is strictly defined for the accumulation implementors.\nAs all powerful tools, beware the sharp edge.")
    public static final SubLObject accumulation_peek_state_alt(SubLObject acc) {
	return acc_state(acc);
    }

    @LispMethod(comment = "This method is strictly defined for the accumulation implementors.\r\nAs all powerful tools, beware the sharp edge.\nThis method is strictly defined for the accumulation implementors.\nAs all powerful tools, beware the sharp edge.")
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

    /**
     *
     *
     * @return a new accumulator whose contents will be a list
     */
    @LispMethod(comment = "@return a new accumulator whose contents will be a list")
    public static final SubLObject new_list_accumulator_alt(SubLObject initial_contents) {
	if (initial_contents == UNPROVIDED) {
	    initial_contents = NIL;
	}
	return new_accumulator(initial_contents, LIST_ACCUMULATOR_RESET, LIST_ACCUMULATOR_ADD, LIST_ACCUMULATOR_SIZE, LIST_ACCUMULATOR_CONTENTS, LIST_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    /**
     *
     *
     * @return a new accumulator whose contents will be a list
     */
    @LispMethod(comment = "@return a new accumulator whose contents will be a list")
    public static SubLObject new_list_accumulator(SubLObject initial_contents) {
	if (initial_contents == UNPROVIDED) {
	    initial_contents = NIL;
	}
	return new_accumulator(initial_contents, LIST_ACCUMULATOR_RESET, LIST_ACCUMULATOR_ADD, LIST_ACCUMULATOR_SIZE, LIST_ACCUMULATOR_CONTENTS, LIST_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    /**
     * Clear the state by tossing it.
     */
    @LispMethod(comment = "Clear the state by tossing it.")
    public static final SubLObject list_accumulator_reset_alt(SubLObject old_state) {
	return NIL;
    }

    @LispMethod(comment = "Clear the state by tossing it.")
    public static SubLObject list_accumulator_reset(final SubLObject old_state) {
	return NIL;
    }

    /**
     * Cons the element onto the list.
     */
    @LispMethod(comment = "Cons the element onto the list.")
    public static final SubLObject list_accumulator_add_alt(SubLObject state, SubLObject element) {
	return cons(element, state);
    }

    @LispMethod(comment = "Cons the element onto the list.")
    public static SubLObject list_accumulator_add(final SubLObject state, final SubLObject element) {
	return cons(element, state);
    }

    public static final SubLObject list_accumulator_size_alt(SubLObject state) {
	return length(state);
    }

    public static SubLObject list_accumulator_size(final SubLObject state) {
	return length(state);
    }

    public static final SubLObject list_accumulator_contents_alt(SubLObject state, SubLObject resetP) {
	if (resetP == UNPROVIDED) {
	    resetP = NIL;
	}
	if (NIL != resetP) {
	    return values(nreverse(state), NIL);
	} else {
	    return values(reverse(state), state);
	}
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

    public static final SubLObject list_accumulator_iterator_alt(SubLObject state) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject contents = list_accumulator_contents(state, NIL);
		SubLObject new_state = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return iteration.new_list_iterator(contents);
	    }
	}
    }

    public static SubLObject list_accumulator_iterator(final SubLObject state) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	thread.resetMultipleValues();
	final SubLObject contents = list_accumulator_contents(state, NIL);
	final SubLObject new_state = thread.secondMultipleValue();
	thread.resetMultipleValues();
	return iteration.new_list_iterator(contents);
    }

    public static final SubLObject test_list_accumulator_alt(SubLObject list) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject acc = new_list_accumulator(UNPROVIDED);
		if (NIL == accumulation_empty_p(acc)) {
		    Errors.error($str_alt54$New_list_accumulator__A_is_not_em);
		}
		{
		    SubLObject cdolist_list_var = list;
		    SubLObject item = NIL;
		    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
			accumulation_add(acc, item);
		    }
		}
		if (!length(list).numE(accumulation_size(acc))) {
		    Errors.error($str_alt55$Accumulator_should_have__A_elemen, length(list), accumulation_size(acc));
		}
		{
		    SubLObject iterator = accumulation_iterator(acc);
		    SubLObject index = list;
		    SubLObject done_var = NIL;
		    while (NIL == done_var) {
			thread.resetMultipleValues();
			{
			    SubLObject current = iteration.iteration_next(iterator);
			    SubLObject valid = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    if (NIL != valid) {
				{
				    SubLObject item = index.first();
				    if (!item.equal(current)) {
					Errors.error($str_alt56$Mismatch_between_iterator_content, acc);
				    }
				}
				index = index.rest();
			    }
			    done_var = makeBoolean(NIL == valid);
			}
		    }
		    if (NIL != index) {
			Errors.error($str_alt57$Accumulator__A_contains_less_item, acc);
		    }
		}
		{
		    SubLObject contents = accumulation_contents_destructively(acc);
		    if (NIL == accumulation_empty_p(acc)) {
			Errors.error($str_alt58$Destructively_emptied_accumulator, acc);
		    }
		    return equal(list, contents);
		}
	    }
	}
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

    /**
     *
     *
     * @return a new accumulator whose contents will be a SET with the equality
    condition of TEST.
     */
    @LispMethod(comment = "@return a new accumulator whose contents will be a SET with the equality\r\ncondition of TEST.")
    public static final SubLObject new_set_accumulator_alt(SubLObject test) {
	if (test == UNPROVIDED) {
	    test = symbol_function(EQL);
	}
	return new_accumulator(set.new_set(test, UNPROVIDED), SET_ACCUMULATOR_RESET, SET_ACCUMULATOR_ADD, SET_ACCUMULATOR_SIZE, SET_ACCUMULATOR_CONTENTS, SET_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    /**
     *
     *
     * @return a new accumulator whose contents will be a SET with the equality
    condition of TEST.
     */
    @LispMethod(comment = "@return a new accumulator whose contents will be a SET with the equality\r\ncondition of TEST.")
    public static SubLObject new_set_accumulator(SubLObject test) {
	if (test == UNPROVIDED) {
	    test = symbol_function(EQL);
	}
	return new_accumulator(set.new_set(test, UNPROVIDED), SET_ACCUMULATOR_RESET, SET_ACCUMULATOR_ADD, SET_ACCUMULATOR_SIZE, SET_ACCUMULATOR_CONTENTS, SET_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    /**
     * Clear the state by clearing the set.
     */
    @LispMethod(comment = "Clear the state by clearing the set.")
    public static final SubLObject set_accumulator_reset_alt(SubLObject old_state) {
	{
	    SubLObject v_set = old_state;
	    set.clear_set(v_set);
	}
	return old_state;
    }

    @LispMethod(comment = "Clear the state by clearing the set.")
    public static SubLObject set_accumulator_reset(final SubLObject old_state) {
	set.clear_set(old_state);
	return old_state;
    }

    /**
     * Add an element to the set.
     */
    @LispMethod(comment = "Add an element to the set.")
    public static final SubLObject set_accumulator_add_alt(SubLObject state, SubLObject element) {
	{
	    SubLObject v_set = state;
	    set.set_add(element, v_set);
	}
	return state;
    }

    @LispMethod(comment = "Add an element to the set.")
    public static SubLObject set_accumulator_add(final SubLObject state, final SubLObject element) {
	set.set_add(element, state);
	return state;
    }

    /**
     * Compute the accumulated size by asking the set.
     */
    @LispMethod(comment = "Compute the accumulated size by asking the set.")
    public static final SubLObject set_accumulator_size_alt(SubLObject state) {
	{
	    SubLObject v_set = state;
	    return set.set_size(v_set);
	}
    }

    @LispMethod(comment = "Compute the accumulated size by asking the set.")
    public static SubLObject set_accumulator_size(final SubLObject state) {
	return set.set_size(state);
    }

    /**
     * Either copy the set or return the current and replace with a new set of
     * same equality test.
     */
    @LispMethod(comment = "Either copy the set or return the current and replace with a new set of\r\nsame equality test.\nEither copy the set or return the current and replace with a new set of\nsame equality test.")
    public static final SubLObject set_accumulator_contents_alt(SubLObject state, SubLObject resetP) {
	if (resetP == UNPROVIDED) {
	    resetP = NIL;
	}
	{
	    SubLObject curr_set = state;
	    if (NIL != resetP) {
		return values(curr_set, set.new_set(set.set_test(curr_set), UNPROVIDED));
	    } else {
		return values(set.copy_set(curr_set), curr_set);
	    }
	}
    }

    @LispMethod(comment = "Either copy the set or return the current and replace with a new set of\r\nsame equality test.\nEither copy the set or return the current and replace with a new set of\nsame equality test.")
    public static SubLObject set_accumulator_contents(final SubLObject state, SubLObject resetP) {
	if (resetP == UNPROVIDED) {
	    resetP = NIL;
	}
	if (NIL != resetP) {
	    return values(state, set.new_set(set.set_test(state), UNPROVIDED));
	}
	return values(set.copy_set(state), state);
    }

    public static final SubLObject set_accumulator_iterator_alt(SubLObject state) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject contents = set_accumulator_contents(state, NIL);
		SubLObject new_state = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return set.new_set_iterator(contents);
	    }
	}
    }

    public static SubLObject set_accumulator_iterator(final SubLObject state) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	thread.resetMultipleValues();
	final SubLObject contents = set_accumulator_contents(state, NIL);
	final SubLObject new_state = thread.secondMultipleValue();
	thread.resetMultipleValues();
	return set.new_set_iterator(contents);
    }

    public static final SubLObject test_set_accumulator_alt(SubLObject v_set_contents, SubLObject test_fn) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_set = set_utilities.construct_set_from_list(v_set_contents, test_fn, UNPROVIDED);
		SubLObject acc = new_set_accumulator(set.set_test(v_set));
		if (NIL == accumulation_empty_p(acc)) {
		    Errors.error($str_alt64$New_set_accumulator__A_is_not_emp);
		}
		{
		    SubLObject set_contents_var = set.do_set_internal(v_set);
		    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
		    SubLObject state = NIL;
		    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
			{
			    SubLObject item = set_contents.do_set_contents_next(basis_object, state);
			    if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
				accumulation_add(acc, item);
			    }
			}
		    }
		}
		if (!set.set_size(v_set).numE(accumulation_size(acc))) {
		    Errors.error($str_alt55$Accumulator_should_have__A_elemen, set.set_size(v_set), accumulation_size(acc));
		}
		{
		    SubLObject iterator = accumulation_iterator(acc);
		    SubLObject done_var = NIL;
		    while (NIL == done_var) {
			thread.resetMultipleValues();
			{
			    SubLObject current = iteration.iteration_next(iterator);
			    SubLObject valid = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    if (NIL != valid) {
				if (NIL == set.set_memberP(current, v_set)) {
				    Errors.error($str_alt56$Mismatch_between_iterator_content, acc);
				}
			    }
			    done_var = makeBoolean(NIL == valid);
			}
		    }
		}
		{
		    SubLObject contents = accumulation_contents_destructively(acc);
		    if (NIL == accumulation_empty_p(acc)) {
			Errors.error($str_alt58$Destructively_emptied_accumulator, acc);
		    }
		    return set_utilities.sets_coextensionalP(v_set, contents);
		}
	    }
	}
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
	for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		state); state = set_contents.do_set_contents_update_state(state)) {
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

    public static final SubLObject new_dictionary_accumulator_alt(SubLObject test) {
	if (test == UNPROVIDED) {
	    test = symbol_function(EQL);
	}
	return new_accumulator(dictionary.new_dictionary(test, UNPROVIDED), DICTIONARY_ACCUMULATOR_RESET, DICTIONARY_ACCUMULATOR_ADD, DICTIONARY_ACCUMULATOR_SIZE, DICTIONARY_ACCUMULATOR_CONTENTS, DICTIONARY_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    public static SubLObject new_dictionary_accumulator(SubLObject test) {
	if (test == UNPROVIDED) {
	    test = symbol_function(EQL);
	}
	return new_accumulator(dictionary.new_dictionary(test, UNPROVIDED), DICTIONARY_ACCUMULATOR_RESET, DICTIONARY_ACCUMULATOR_ADD, DICTIONARY_ACCUMULATOR_SIZE, DICTIONARY_ACCUMULATOR_CONTENTS, DICTIONARY_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    /**
     * A utility method to construct up a dictionary accumulator.
     */
    @LispMethod(comment = "A utility method to construct up a dictionary accumulator.")
    public static final SubLObject new_dictionary_accumulator_tuple_alt(SubLObject key, SubLObject value) {
	return cons(key, value);
    }

    @LispMethod(comment = "A utility method to construct up a dictionary accumulator.")
    public static SubLObject new_dictionary_accumulator_tuple(final SubLObject key, final SubLObject value) {
	return cons(key, value);
    }

    /**
     * Deconstructs the tuple into just the key bit.
     */
    @LispMethod(comment = "Deconstructs the tuple into just the key bit.")
    public static final SubLObject dictionary_accumulator_tuple_key_alt(SubLObject tuple) {
	return tuple.first();
    }

    @LispMethod(comment = "Deconstructs the tuple into just the key bit.")
    public static SubLObject dictionary_accumulator_tuple_key(final SubLObject tuple) {
	return tuple.first();
    }

    /**
     * Deconstructs the tuple into just the key bit.
     */
    @LispMethod(comment = "Deconstructs the tuple into just the key bit.")
    public static final SubLObject dictionary_accumulator_tuple_value_alt(SubLObject tuple) {
	return tuple.rest();
    }

    @LispMethod(comment = "Deconstructs the tuple into just the key bit.")
    public static SubLObject dictionary_accumulator_tuple_value(final SubLObject tuple) {
	return tuple.rest();
    }

    /**
     * Clear the state by clearing the dictionary.
     */
    @LispMethod(comment = "Clear the state by clearing the dictionary.")
    public static final SubLObject dictionary_accumulator_reset_alt(SubLObject old_state) {
	{
	    SubLObject dict = old_state;
	    dictionary.clear_dictionary(dict);
	}
	return old_state;
    }

    @LispMethod(comment = "Clear the state by clearing the dictionary.")
    public static SubLObject dictionary_accumulator_reset(final SubLObject old_state) {
	dictionary.clear_dictionary(old_state);
	return old_state;
    }

    /**
     * Add the tuple, which must be a CONSP of KEY and VALUE, to the dictionary.
     */
    @LispMethod(comment = "Add the tuple, which must be a CONSP of KEY and VALUE, to the dictionary.")
    public static final SubLObject dictionary_accumulator_add_alt(SubLObject state, SubLObject tuple) {
	if (!tuple.isCons()) {
	    Errors.error($str_alt70$Dictionary_accumulator_expects_tu, tuple);
	}
	{
	    SubLObject dict = state;
	    SubLObject datum = tuple;
	    SubLObject current = datum;
	    SubLObject key = NIL;
	    SubLObject value = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt71);
	    key = current.first();
	    current = current.rest();
	    value = current;
	    dictionary.dictionary_enter(dict, key, value);
	}
	return state;
    }

    @LispMethod(comment = "Add the tuple, which must be a CONSP of KEY and VALUE, to the dictionary.")
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

    /**
     * Get the size of the underlying dictionary.
     */
    @LispMethod(comment = "Get the size of the underlying dictionary.")
    public static final SubLObject dictionary_accumulator_size_alt(SubLObject state) {
	{
	    SubLObject dict = state;
	    return dictionary.dictionary_length(dict);
	}
    }

    @LispMethod(comment = "Get the size of the underlying dictionary.")
    public static SubLObject dictionary_accumulator_size(final SubLObject state) {
	return dictionary.dictionary_length(state);
    }

    /**
     * Either clone a dictionary object or replace the current dictionary with a new
     * and clean one.
     */
    @LispMethod(comment = "Either clone a dictionary object or replace the current dictionary with a new\r\nand clean one.\nEither clone a dictionary object or replace the current dictionary with a new\nand clean one.")
    public static final SubLObject dictionary_accumulator_contents_alt(SubLObject state, SubLObject resetP) {
	if (resetP == UNPROVIDED) {
	    resetP = NIL;
	}
	{
	    SubLObject dict = state;
	    if (NIL != resetP) {
		return values(dict, dictionary.new_dictionary(dictionary.dictionary_test(dict), UNPROVIDED));
	    } else {
		return values(dictionary_utilities.copy_dictionary(dict), dict);
	    }
	}
    }

    @LispMethod(comment = "Either clone a dictionary object or replace the current dictionary with a new\r\nand clean one.\nEither clone a dictionary object or replace the current dictionary with a new\nand clean one.")
    public static SubLObject dictionary_accumulator_contents(final SubLObject state, SubLObject resetP) {
	if (resetP == UNPROVIDED) {
	    resetP = NIL;
	}
	if (NIL != resetP) {
	    return values(state, dictionary.new_dictionary(dictionary.dictionary_test(state), UNPROVIDED));
	}
	return values(dictionary_utilities.copy_dictionary(state), state);
    }

    /**
     *
     *
     * @unknown This is somewhat counter-intuitive. While we still get a dictionary at the
    end, we cannot return a true dictionary iterator; we have to return something
    that iterates over the CONS pairs. So we first build up a temporary list
    of CONS pairs via a LIST-ACCUMULATOR and then return an ITERATOR for that one.
     */
    @LispMethod(comment = "@unknown This is somewhat counter-intuitive. While we still get a dictionary at the\r\nend, we cannot return a true dictionary iterator; we have to return something\r\nthat iterates over the CONS pairs. So we first build up a temporary list\r\nof CONS pairs via a LIST-ACCUMULATOR and then return an ITERATOR for that one.")
    public static final SubLObject dictionary_accumulator_iterator_alt(SubLObject state) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject dict = state;
		SubLObject tuples = new_list_accumulator(UNPROVIDED);
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict));
		while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
		    thread.resetMultipleValues();
		    {
			SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject value = thread.secondMultipleValue();
			thread.resetMultipleValues();
			accumulation_add(tuples, cons(key, value));
			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return accumulation_iterator(tuples);
	    }
	}
    }

    /**
     *
     *
     * @unknown This is somewhat counter-intuitive. While we still get a dictionary at the
    end, we cannot return a true dictionary iterator; we have to return something
    that iterates over the CONS pairs. So we first build up a temporary list
    of CONS pairs via a LIST-ACCUMULATOR and then return an ITERATOR for that one.
     */
    @LispMethod(comment = "@unknown This is somewhat counter-intuitive. While we still get a dictionary at the\r\nend, we cannot return a true dictionary iterator; we have to return something\r\nthat iterates over the CONS pairs. So we first build up a temporary list\r\nof CONS pairs via a LIST-ACCUMULATOR and then return an ITERATOR for that one.")
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

    public static final SubLObject test_dictionary_accumulator_alt(SubLObject tuple_list, SubLObject test_fn) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject dict = dictionary_utilities.add_tuple_list_to_dictionary(tuple_list, dictionary.new_dictionary(test_fn, UNPROVIDED));
		SubLObject acc = new_dictionary_accumulator(test_fn);
		if (NIL == accumulation_empty_p(acc)) {
		    Errors.error($str_alt72$New_dictionary_accumulator__A_is_);
		}
		{
		    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict));
		    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
			thread.resetMultipleValues();
			{
			    SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			    SubLObject value = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    accumulation_add(acc, new_dictionary_accumulator_tuple(key, value));
			    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
			}
		    }
		    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		}
		if (!dictionary.dictionary_length(dict).numE(accumulation_size(acc))) {
		    Errors.error($str_alt55$Accumulator_should_have__A_elemen, dictionary.dictionary_length(dict), accumulation_size(acc));
		}
		{
		    SubLObject iterator = accumulation_iterator(acc);
		    SubLObject not_found = gensym(UNPROVIDED);
		    SubLObject done_var = NIL;
		    while (NIL == done_var) {
			thread.resetMultipleValues();
			{
			    SubLObject current = iteration.iteration_next(iterator);
			    SubLObject valid = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    if (NIL != valid) {
				{
				    SubLObject key = dictionary_accumulator_tuple_key(current);
				    SubLObject value = dictionary_accumulator_tuple_value(current);
				    if (NIL == funcall(test_fn, value, dictionary.dictionary_lookup(dict, key, not_found))) {
					Errors.error($str_alt56$Mismatch_between_iterator_content, acc);
				    }
				}
			    }
			    done_var = makeBoolean(NIL == valid);
			}
		    }
		}
		{
		    SubLObject contents = accumulation_contents_destructively(acc);
		    if (NIL == accumulation_empty_p(acc)) {
			Errors.error($str_alt58$Destructively_emptied_accumulator, acc);
		    }
		    return dictionary_utilities.dictionaries_coextensionalP(dict, contents, UNPROVIDED);
		}
	    }
	}
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

    public static final SubLObject new_null_accumulator_alt() {
	return new_accumulator(NIL, NULL, FALSE, ZERO, FALSE, NEW_NULL_ITERATOR_DUMMY, UNPROVIDED);
    }

    public static SubLObject new_null_accumulator() {
	return new_accumulator(NIL, NULL, FALSE, ZERO, FALSE, NEW_NULL_ITERATOR_DUMMY, UNPROVIDED);
    }

    public static final SubLObject new_null_iterator_dummy_alt(SubLObject dummy) {
	return iteration.new_null_iterator();
    }

    public static SubLObject new_null_iterator_dummy(final SubLObject dummy) {
	return iteration.new_null_iterator();
    }

    public static final SubLObject test_null_accumulator_alt(SubLObject items) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject acc = new_null_accumulator();
		if (NIL == accumulation_empty_p(acc)) {
		    Errors.error($str_alt77$New_null_accumulator__A_is_not_em);
		}
		{
		    SubLObject cdolist_list_var = items;
		    SubLObject item = NIL;
		    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
			accumulation_add(acc, item);
		    }
		}
		if (NIL == accumulation_empty_p(acc)) {
		    Errors.error($str_alt78$New_null_accumulator__A_is_no_lon);
		}
		{
		    SubLObject iterator = accumulation_iterator(acc);
		    SubLObject iterator_values = NIL;
		    SubLObject done_var = NIL;
		    while (NIL == done_var) {
			thread.resetMultipleValues();
			{
			    SubLObject current = iteration.iteration_next(iterator);
			    SubLObject valid = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    if (NIL != valid) {
				iterator_values = cons(current, iterator_values);
			    }
			    done_var = makeBoolean(NIL == valid);
			}
		    }
		    if (NIL != iterator_values) {
			Errors.error($str_alt79$Expected_iterator__a_to_be_empty, iterator);
		    }
		    {
			SubLObject contents = accumulation_contents_destructively(acc);
			if (NIL == accumulation_empty_p(acc)) {
			    Errors.error($str_alt80$Destructively_emptied_accumulator, acc);
			}
			if (NIL != contents) {
			    Errors.error($str_alt81$Contents_were__a_instead_of_null, contents);
			}
			return T;
		    }
		}
	    }
	}
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

    /**
     *
     *
     * @return a new accumulator that will accumulate numbers by applying the binary ACCUMULATION-FN to them.
    It will always be of size 1.
     */
    @LispMethod(comment = "@return a new accumulator that will accumulate numbers by applying the binary ACCUMULATION-FN to them.\r\nIt will always be of size 1.")
    public static final SubLObject new_numeric_accumulator_alt(SubLObject add_fn, SubLObject contents_fn) {
	return new_accumulator(NIL, NULL, add_fn, NUMERIC_ACCUMULATOR_SIZE_FN, contents_fn, NUMERIC_ACCUMULATION_ITERATOR, UNPROVIDED);
    }

    /**
     *
     *
     * @return a new accumulator that will accumulate numbers by applying the binary ACCUMULATION-FN to them.
    It will always be of size 1.
     */
    @LispMethod(comment = "@return a new accumulator that will accumulate numbers by applying the binary ACCUMULATION-FN to them.\r\nIt will always be of size 1.")
    public static SubLObject new_numeric_accumulator(final SubLObject add_fn, final SubLObject contents_fn) {
	return new_accumulator(NIL, NULL, add_fn, NUMERIC_ACCUMULATOR_SIZE_FN, contents_fn, NUMERIC_ACCUMULATION_ITERATOR, UNPROVIDED);
    }

    public static final SubLObject numeric_accumulation_iterator_alt(SubLObject state) {
	if (NIL != state) {
	    return iteration.new_singleton_iterator(state);
	} else {
	    return iteration.new_null_iterator();
	}
    }

    public static SubLObject numeric_accumulation_iterator(final SubLObject state) {
	if (NIL != state) {
	    return iteration.new_singleton_iterator(state);
	}
	return iteration.new_null_iterator();
    }

    public static final SubLObject numeric_accumulator_size_fn_alt(SubLObject state) {
	if (NIL != state) {
	    return ONE_INTEGER;
	} else {
	    return ZERO_INTEGER;
	}
    }

    public static SubLObject numeric_accumulator_size_fn(final SubLObject state) {
	if (NIL != state) {
	    return ONE_INTEGER;
	}
	return ZERO_INTEGER;
    }

    public static final SubLObject numeric_contents_fn_default_zero_alt(SubLObject state, SubLObject resetP) {
	if (resetP == UNPROVIDED) {
	    resetP = NIL;
	}
	{
	    SubLObject result = state;
	    if (NIL == result) {
		result = ZERO_INTEGER;
	    }
	    if (NIL != resetP) {
		state = NIL;
	    }
	    return values(result, state);
	}
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

    public static final SubLObject numeric_contents_fn_default_one_alt(SubLObject state, SubLObject resetP) {
	if (resetP == UNPROVIDED) {
	    resetP = NIL;
	}
	{
	    SubLObject result = state;
	    if (NIL == result) {
		result = ONE_INTEGER;
	    }
	    if (NIL != resetP) {
		state = NIL;
	    }
	    return values(result, state);
	}
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

    /**
     *
     *
     * @return a new numeric accumulator for which adding an element numerically sums it with the existing sum so far (starts at 0).
     */
    @LispMethod(comment = "@return a new numeric accumulator for which adding an element numerically sums it with the existing sum so far (starts at 0).")
    public static final SubLObject new_sum_accumulator_alt() {
	return new_numeric_accumulator(DWIMMED_SUM, NUMERIC_CONTENTS_FN_DEFAULT_ZERO);
    }

    /**
     *
     *
     * @return a new numeric accumulator for which adding an element numerically sums it with the existing sum so far (starts at 0).
     */
    @LispMethod(comment = "@return a new numeric accumulator for which adding an element numerically sums it with the existing sum so far (starts at 0).")
    public static SubLObject new_sum_accumulator() {
	return new_numeric_accumulator(DWIMMED_SUM, NUMERIC_CONTENTS_FN_DEFAULT_ZERO);
    }

    /**
     * Treats non-numberp objects as zero
     */
    @LispMethod(comment = "Treats non-numberp objects as zero")
    public static final SubLObject dwimmed_sum_alt(SubLObject obj1, SubLObject obj2) {
	if (!obj1.isNumber()) {
	    obj1 = ZERO_INTEGER;
	}
	if (!obj2.isNumber()) {
	    obj2 = ZERO_INTEGER;
	}
	return add(obj1, obj2);
    }

    @LispMethod(comment = "Treats non-numberp objects as zero")
    public static SubLObject dwimmed_sum(SubLObject obj1, SubLObject obj2) {
	if (!obj1.isNumber()) {
	    obj1 = ZERO_INTEGER;
	}
	if (!obj2.isNumber()) {
	    obj2 = ZERO_INTEGER;
	}
	return add(obj1, obj2);
    }

    /**
    * Treats non-numberp objects as zero
    */

    public static final SubLObject test_sum_accumulator_alt(SubLObject numbers) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject acc = new_sum_accumulator();
		if (NIL == accumulation_empty_p(acc)) {
		    Errors.error($str_alt87$New_sum_accumulator__A_is_not_emp);
		}
		{
		    SubLObject cdolist_list_var = numbers;
		    SubLObject num = NIL;
		    for (num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), num = cdolist_list_var.first()) {
			accumulation_add(acc, num);
		    }
		}
		if (NIL == number_utilities.onep(accumulation_size(acc))) {
		    Errors.error($str_alt88$Accumulator_should_have_1_element, accumulation_size(acc));
		}
		{
		    SubLObject iterator = accumulation_iterator(acc);
		    SubLObject iterator_values = NIL;
		    SubLObject done_var = NIL;
		    while (NIL == done_var) {
			thread.resetMultipleValues();
			{
			    SubLObject current = iteration.iteration_next(iterator);
			    SubLObject valid = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    if (NIL != valid) {
				iterator_values = cons(current, iterator_values);
			    }
			    done_var = makeBoolean(NIL == valid);
			}
		    }
		    if (NIL == list_utilities.singletonP(iterator_values)) {
			Errors.error($str_alt89$Expected_iterator__a_to_have_only, iterator);
		    }
		    {
			SubLObject contents = accumulation_contents_destructively(acc);
			if (NIL == accumulation_empty_p(acc)) {
			    Errors.error($str_alt80$Destructively_emptied_accumulator, acc);
			}
			if (!contents.numE(number_utilities.summation(numbers))) {
			    Errors.error($str_alt90$Contents_did_not_sum_to__a, number_utilities.summation(numbers));
			}
			if (!list_utilities.only_one(iterator_values).numE(contents)) {
			    Errors.error($str_alt91$Iterator_contained__a_instead_of_, list_utilities.only_one(iterator_values), contents);
			}
			return T;
		    }
		}
	    }
	}
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

    /**
     *
     *
     * @return a new numeric accumulator for which each call to the add function increments the counter by one (starts at 0).
     */
    @LispMethod(comment = "@return a new numeric accumulator for which each call to the add function increments the counter by one (starts at 0).")
    public static final SubLObject new_count_accumulator_alt() {
	return new_numeric_accumulator(DWIMMED_INCREMENT, NUMERIC_CONTENTS_FN_DEFAULT_ZERO);
    }

    /**
     *
     *
     * @return a new numeric accumulator for which each call to the add function increments the counter by one (starts at 0).
     */
    @LispMethod(comment = "@return a new numeric accumulator for which each call to the add function increments the counter by one (starts at 0).")
    public static SubLObject new_count_accumulator() {
	return new_numeric_accumulator(DWIMMED_INCREMENT, NUMERIC_CONTENTS_FN_DEFAULT_ZERO);
    }

    /**
     * Treats non-numberp objects as zero
     */
    @LispMethod(comment = "Treats non-numberp objects as zero")
    public static final SubLObject dwimmed_increment_alt(SubLObject partial_sum, SubLObject dummy) {
	if (!partial_sum.isNumber()) {
	    partial_sum = ZERO_INTEGER;
	}
	return number_utilities.f_1X(partial_sum);
    }

    @LispMethod(comment = "Treats non-numberp objects as zero")
    public static SubLObject dwimmed_increment(SubLObject partial_sum, final SubLObject dummy) {
	if (!partial_sum.isNumber()) {
	    partial_sum = ZERO_INTEGER;
	}
	return number_utilities.f_1X(partial_sum);
    }

    /**
    * Treats non-numberp objects as zero
    */

    public static final SubLObject test_count_accumulator_alt(SubLObject items) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject acc = new_count_accumulator();
		if (NIL == accumulation_empty_p(acc)) {
		    Errors.error($str_alt93$New_count_accumulator__A_is_not_e);
		}
		{
		    SubLObject cdolist_list_var = items;
		    SubLObject item = NIL;
		    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
			accumulation_add(acc, item);
		    }
		}
		if (NIL == number_utilities.onep(accumulation_size(acc))) {
		    Errors.error($str_alt88$Accumulator_should_have_1_element, accumulation_size(acc));
		}
		{
		    SubLObject iterator = accumulation_iterator(acc);
		    SubLObject iterator_values = NIL;
		    SubLObject done_var = NIL;
		    while (NIL == done_var) {
			thread.resetMultipleValues();
			{
			    SubLObject current = iteration.iteration_next(iterator);
			    SubLObject valid = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    if (NIL != valid) {
				iterator_values = cons(current, iterator_values);
			    }
			    done_var = makeBoolean(NIL == valid);
			}
		    }
		    if (NIL == list_utilities.singletonP(iterator_values)) {
			Errors.error($str_alt89$Expected_iterator__a_to_have_only, iterator);
		    }
		    {
			SubLObject contents = accumulation_contents_destructively(acc);
			if (NIL == accumulation_empty_p(acc)) {
			    Errors.error($str_alt80$Destructively_emptied_accumulator, acc);
			}
			if (!contents.numE(length(items))) {
			    Errors.error($str_alt94$Contents_did_not_count_to__a, length(items));
			}
			if (!list_utilities.only_one(iterator_values).numE(contents)) {
			    Errors.error($str_alt91$Iterator_contained__a_instead_of_, list_utilities.only_one(iterator_values), contents);
			}
			return T;
		    }
		}
	    }
	}
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

    /**
     *
     *
     * @return a new numeric accumulator for which adding an element multiplies it with the existing product so far (starts at 1).
     */
    @LispMethod(comment = "@return a new numeric accumulator for which adding an element multiplies it with the existing product so far (starts at 1).")
    public static final SubLObject new_product_accumulator_alt() {
	return new_numeric_accumulator(DWIMMED_PRODUCT, NUMERIC_CONTENTS_FN_DEFAULT_ONE);
    }

    /**
     *
     *
     * @return a new numeric accumulator for which adding an element multiplies it with the existing product so far (starts at 1).
     */
    @LispMethod(comment = "@return a new numeric accumulator for which adding an element multiplies it with the existing product so far (starts at 1).")
    public static SubLObject new_product_accumulator() {
	return new_numeric_accumulator(DWIMMED_PRODUCT, NUMERIC_CONTENTS_FN_DEFAULT_ONE);
    }

    /**
     * Treats non-numberp objects as one
     */
    @LispMethod(comment = "Treats non-numberp objects as one")
    public static final SubLObject dwimmed_product_alt(SubLObject obj1, SubLObject obj2) {
	if (!obj1.isNumber()) {
	    obj1 = ONE_INTEGER;
	}
	if (!obj2.isNumber()) {
	    obj2 = ONE_INTEGER;
	}
	return multiply(obj1, obj2);
    }

    @LispMethod(comment = "Treats non-numberp objects as one")
    public static SubLObject dwimmed_product(SubLObject obj1, SubLObject obj2) {
	if (!obj1.isNumber()) {
	    obj1 = ONE_INTEGER;
	}
	if (!obj2.isNumber()) {
	    obj2 = ONE_INTEGER;
	}
	return multiply(obj1, obj2);
    }

    /**
    * Treats non-numberp objects as one
    */

    public static final SubLObject test_product_accumulator_alt(SubLObject numbers) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject acc = new_product_accumulator();
		if (NIL == accumulation_empty_p(acc)) {
		    Errors.error($str_alt96$New_product_accumulator__A_is_not);
		}
		{
		    SubLObject cdolist_list_var = numbers;
		    SubLObject num = NIL;
		    for (num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), num = cdolist_list_var.first()) {
			accumulation_add(acc, num);
		    }
		}
		if (NIL == number_utilities.onep(accumulation_size(acc))) {
		    Errors.error($str_alt88$Accumulator_should_have_1_element, accumulation_size(acc));
		}
		{
		    SubLObject iterator = accumulation_iterator(acc);
		    SubLObject iterator_values = NIL;
		    SubLObject done_var = NIL;
		    while (NIL == done_var) {
			thread.resetMultipleValues();
			{
			    SubLObject current = iteration.iteration_next(iterator);
			    SubLObject valid = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    if (NIL != valid) {
				iterator_values = cons(current, iterator_values);
			    }
			    done_var = makeBoolean(NIL == valid);
			}
		    }
		    if (NIL == list_utilities.singletonP(iterator_values)) {
			Errors.error($str_alt89$Expected_iterator__a_to_have_only, iterator);
		    }
		    {
			SubLObject contents = accumulation_contents_destructively(acc);
			if (NIL == accumulation_empty_p(acc)) {
			    Errors.error($str_alt80$Destructively_emptied_accumulator, acc);
			}
			if (!contents.numE(apply($sym97$_, numbers))) {
			    Errors.error($str_alt98$Contents_did_not_multiply_to__a, apply($sym97$_, numbers));
			}
			if (!list_utilities.only_one(iterator_values).numE(contents)) {
			    Errors.error($str_alt91$Iterator_contained__a_instead_of_, list_utilities.only_one(iterator_values), contents);
			}
			return T;
		    }
		}
	    }
	}
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
	declareFunction("accumulator_print_function_trampoline", "ACCUMULATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("accumulator_p", "ACCUMULATOR-P", 1, 0, false);
	new accumulation.$accumulator_p$UnaryFunction();
	declareFunction("acc_state", "ACC-STATE", 1, 0, false);
	declareFunction("acc_reset_fn", "ACC-RESET-FN", 1, 0, false);
	declareFunction("acc_add_fn", "ACC-ADD-FN", 1, 0, false);
	declareFunction("acc_add_all_fn", "ACC-ADD-ALL-FN", 1, 0, false);
	declareFunction("acc_size_fn", "ACC-SIZE-FN", 1, 0, false);
	declareFunction("acc_contents_fn", "ACC-CONTENTS-FN", 1, 0, false);
	declareFunction("acc_iterator_fn", "ACC-ITERATOR-FN", 1, 0, false);
	declareFunction("_csetf_acc_state", "_CSETF-ACC-STATE", 2, 0, false);
	declareFunction("_csetf_acc_reset_fn", "_CSETF-ACC-RESET-FN", 2, 0, false);
	declareFunction("_csetf_acc_add_fn", "_CSETF-ACC-ADD-FN", 2, 0, false);
	declareFunction("_csetf_acc_add_all_fn", "_CSETF-ACC-ADD-ALL-FN", 2, 0, false);
	declareFunction("_csetf_acc_size_fn", "_CSETF-ACC-SIZE-FN", 2, 0, false);
	declareFunction("_csetf_acc_contents_fn", "_CSETF-ACC-CONTENTS-FN", 2, 0, false);
	declareFunction("_csetf_acc_iterator_fn", "_CSETF-ACC-ITERATOR-FN", 2, 0, false);
	declareFunction("make_accumulator", "MAKE-ACCUMULATOR", 0, 1, false);
	declareFunction("visit_defstruct_accumulator", "VISIT-DEFSTRUCT-ACCUMULATOR", 2, 0, false);
	declareFunction("visit_defstruct_object_accumulator_method", "VISIT-DEFSTRUCT-OBJECT-ACCUMULATOR-METHOD", 2, 0, false);
	declareFunction("print_accumulator", "PRINT-ACCUMULATOR", 3, 0, false);
	declareFunction("new_accumulator", "NEW-ACCUMULATOR", 6, 1, false);
	declareFunction("accumulation_reset", "ACCUMULATION-RESET", 1, 0, false);
	declareFunction("accumulation_add", "ACCUMULATION-ADD", 2, 0, false);
	declareFunction("accumulation_add_all", "ACCUMULATION-ADD-ALL", 2, 0, false);
	declareFunction("accumulation_size", "ACCUMULATION-SIZE", 1, 0, false);
	declareFunction("accumulation_empty_p", "ACCUMULATION-EMPTY-P", 1, 0, false);
	declareFunction("accumulation_contents", "ACCUMULATION-CONTENTS", 1, 1, false);
	declareFunction("accumulation_contents_destructively", "ACCUMULATION-CONTENTS-DESTRUCTIVELY", 1, 0, false);
	declareFunction("accumulation_iterator", "ACCUMULATION-ITERATOR", 1, 0, false);
	declareMacro("do_accumulator_contents", "DO-ACCUMULATOR-CONTENTS");
	declareFunction("map_accumulator_contents", "MAP-ACCUMULATOR-CONTENTS", 2, 0, false);
	declareFunction("default_accumulation_add_all", "DEFAULT-ACCUMULATION-ADD-ALL", 2, 0, false);
	declareFunction("accumulation_peek_state", "ACCUMULATION-PEEK-STATE", 1, 0, false);
	declareFunction("accumulation_add_items", "ACCUMULATION-ADD-ITEMS", 2, 0, false);
	declareFunction("new_list_accumulator", "NEW-LIST-ACCUMULATOR", 0, 1, false);
	declareFunction("list_accumulator_reset", "LIST-ACCUMULATOR-RESET", 1, 0, false);
	declareFunction("list_accumulator_add", "LIST-ACCUMULATOR-ADD", 2, 0, false);
	declareFunction("list_accumulator_size", "LIST-ACCUMULATOR-SIZE", 1, 0, false);
	declareFunction("list_accumulator_contents", "LIST-ACCUMULATOR-CONTENTS", 1, 1, false);
	declareFunction("list_accumulator_iterator", "LIST-ACCUMULATOR-ITERATOR", 1, 0, false);
	declareFunction("test_list_accumulator", "TEST-LIST-ACCUMULATOR", 1, 0, false);
	declareFunction("new_set_accumulator", "NEW-SET-ACCUMULATOR", 0, 1, false);
	declareFunction("set_accumulator_reset", "SET-ACCUMULATOR-RESET", 1, 0, false);
	declareFunction("set_accumulator_add", "SET-ACCUMULATOR-ADD", 2, 0, false);
	declareFunction("set_accumulator_size", "SET-ACCUMULATOR-SIZE", 1, 0, false);
	declareFunction("set_accumulator_contents", "SET-ACCUMULATOR-CONTENTS", 1, 1, false);
	declareFunction("set_accumulator_iterator", "SET-ACCUMULATOR-ITERATOR", 1, 0, false);
	declareFunction("test_set_accumulator", "TEST-SET-ACCUMULATOR", 2, 0, false);
	declareFunction("new_dictionary_accumulator", "NEW-DICTIONARY-ACCUMULATOR", 0, 1, false);
	declareFunction("new_dictionary_accumulator_tuple", "NEW-DICTIONARY-ACCUMULATOR-TUPLE", 2, 0, false);
	declareFunction("dictionary_accumulator_tuple_key", "DICTIONARY-ACCUMULATOR-TUPLE-KEY", 1, 0, false);
	declareFunction("dictionary_accumulator_tuple_value", "DICTIONARY-ACCUMULATOR-TUPLE-VALUE", 1, 0, false);
	declareFunction("dictionary_accumulator_reset", "DICTIONARY-ACCUMULATOR-RESET", 1, 0, false);
	declareFunction("dictionary_accumulator_add", "DICTIONARY-ACCUMULATOR-ADD", 2, 0, false);
	declareFunction("dictionary_accumulator_size", "DICTIONARY-ACCUMULATOR-SIZE", 1, 0, false);
	declareFunction("dictionary_accumulator_contents", "DICTIONARY-ACCUMULATOR-CONTENTS", 1, 1, false);
	declareFunction("dictionary_accumulator_iterator", "DICTIONARY-ACCUMULATOR-ITERATOR", 1, 0, false);
	declareFunction("test_dictionary_accumulator", "TEST-DICTIONARY-ACCUMULATOR", 2, 0, false);
	declareFunction("new_null_accumulator", "NEW-NULL-ACCUMULATOR", 0, 0, false);
	declareFunction("new_null_iterator_dummy", "NEW-NULL-ITERATOR-DUMMY", 1, 0, false);
	declareFunction("test_null_accumulator", "TEST-NULL-ACCUMULATOR", 1, 0, false);
	declareFunction("new_numeric_accumulator", "NEW-NUMERIC-ACCUMULATOR", 2, 0, false);
	declareFunction("numeric_accumulation_iterator", "NUMERIC-ACCUMULATION-ITERATOR", 1, 0, false);
	declareFunction("numeric_accumulator_size_fn", "NUMERIC-ACCUMULATOR-SIZE-FN", 1, 0, false);
	declareFunction("numeric_contents_fn_default_zero", "NUMERIC-CONTENTS-FN-DEFAULT-ZERO", 1, 1, false);
	declareFunction("numeric_contents_fn_default_one", "NUMERIC-CONTENTS-FN-DEFAULT-ONE", 1, 1, false);
	declareFunction("new_sum_accumulator", "NEW-SUM-ACCUMULATOR", 0, 0, false);
	declareFunction("dwimmed_sum", "DWIMMED-SUM", 2, 0, false);
	declareFunction("test_sum_accumulator", "TEST-SUM-ACCUMULATOR", 1, 0, false);
	declareFunction("new_count_accumulator", "NEW-COUNT-ACCUMULATOR", 0, 0, false);
	declareFunction("dwimmed_increment", "DWIMMED-INCREMENT", 2, 0, false);
	declareFunction("test_count_accumulator", "TEST-COUNT-ACCUMULATOR", 1, 0, false);
	declareFunction("new_product_accumulator", "NEW-PRODUCT-ACCUMULATOR", 0, 0, false);
	declareFunction("dwimmed_product", "DWIMMED-PRODUCT", 2, 0, false);
	declareFunction("test_product_accumulator", "TEST-PRODUCT-ACCUMULATOR", 1, 0, false);
	declareFunction("new_transform_accumulator", "NEW-TRANSFORM-ACCUMULATOR", 2, 1, false);
	declareFunction("make_xform_accumulator_state", "MAKE-XFORM-ACCUMULATOR-STATE", 3, 0, false);
	declareFunction("xform_accumulator_reset", "XFORM-ACCUMULATOR-RESET", 1, 0, false);
	declareFunction("xform_accumulator_add", "XFORM-ACCUMULATOR-ADD", 2, 0, false);
	declareFunction("xform_accumulator_size", "XFORM-ACCUMULATOR-SIZE", 1, 0, false);
	declareFunction("xform_accumulator_contents", "XFORM-ACCUMULATOR-CONTENTS", 1, 1, false);
	declareFunction("xform_accumulator_itorator", "XFORM-ACCUMULATOR-ITORATOR", 1, 0, false);
	return NIL;
    }

    public static SubLObject init_accumulation_file() {
	defconstant("*DTP-ACCUMULATOR*", ACCUMULATOR);
	return NIL;
    }

    public static final SubLObject setup_accumulation_file_alt() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_accumulator$.getGlobalValue(), symbol_function(ACCUMULATOR_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(ACC_STATE, _CSETF_ACC_STATE);
	def_csetf(ACC_RESET_FN, _CSETF_ACC_RESET_FN);
	def_csetf(ACC_ADD_FN, _CSETF_ACC_ADD_FN);
	def_csetf(ACC_ADD_ALL_FN, _CSETF_ACC_ADD_ALL_FN);
	def_csetf(ACC_SIZE_FN, _CSETF_ACC_SIZE_FN);
	def_csetf(ACC_CONTENTS_FN, _CSETF_ACC_CONTENTS_FN);
	def_csetf(ACC_ITERATOR_FN, _CSETF_ACC_ITERATOR_FN);
	identity(ACCUMULATOR);
	note_funcall_helper_function(NUMERIC_ACCUMULATION_ITERATOR);
	note_funcall_helper_function(NUMERIC_ACCUMULATOR_SIZE_FN);
	note_funcall_helper_function(NUMERIC_CONTENTS_FN_DEFAULT_ZERO);
	note_funcall_helper_function(NUMERIC_CONTENTS_FN_DEFAULT_ONE);
	define_test_case_table_int(TEST_LIST_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt107);
	define_test_case_table_int(TEST_SET_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt109);
	define_test_case_table_int(TEST_DICTIONARY_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt111);
	define_test_case_table_int(TEST_NULL_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt114);
	define_test_case_table_int(TEST_SUM_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt116);
	define_test_case_table_int(TEST_COUNT_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt114);
	define_test_case_table_int(TEST_PRODUCT_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt119);
	return NIL;
    }

    public static SubLObject setup_accumulation_file() {
	if (SubLFiles.USE_V1) {
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
	    define_test_case_table_int(TEST_LIST_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list113);
	    define_test_case_table_int(TEST_SET_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list115);
	    define_test_case_table_int(TEST_DICTIONARY_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list117);
	    define_test_case_table_int(TEST_NULL_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list119);
	    define_test_case_table_int(TEST_SUM_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list121);
	    define_test_case_table_int(TEST_COUNT_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list119);
	    define_test_case_table_int(TEST_PRODUCT_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list124);
	}
	if (SubLFiles.USE_V2) {
	    define_test_case_table_int(TEST_LIST_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt107);
	    define_test_case_table_int(TEST_SET_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt109);
	    define_test_case_table_int(TEST_DICTIONARY_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt111);
	    define_test_case_table_int(TEST_NULL_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt114);
	    define_test_case_table_int(TEST_SUM_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt116);
	    define_test_case_table_int(TEST_COUNT_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt114);
	    define_test_case_table_int(TEST_PRODUCT_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt119);
	}
	return NIL;
    }

    public static SubLObject setup_accumulation_file_Previous() {
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
	define_test_case_table_int(TEST_LIST_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list113);
	define_test_case_table_int(TEST_SET_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list115);
	define_test_case_table_int(TEST_DICTIONARY_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list117);
	define_test_case_table_int(TEST_NULL_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list119);
	define_test_case_table_int(TEST_SUM_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list121);
	define_test_case_table_int(TEST_COUNT_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list119);
	define_test_case_table_int(TEST_PRODUCT_ACCUMULATOR, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list124);
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

    static private final SubLList $list_alt2 = list(makeSymbol("STATE"), makeSymbol("RESET-FN"), makeSymbol("ADD-FN"), makeSymbol("ADD-ALL-FN"), makeSymbol("SIZE-FN"), makeSymbol("CONTENTS-FN"), makeSymbol("ITERATOR-FN"));

    static private final SubLList $list_alt3 = list(makeKeyword("STATE"), makeKeyword("RESET-FN"), makeKeyword("ADD-FN"), makeKeyword("ADD-ALL-FN"), makeKeyword("SIZE-FN"), makeKeyword("CONTENTS-FN"), makeKeyword("ITERATOR-FN"));

    static private final SubLList $list_alt4 = list(makeSymbol("ACC-STATE"), makeSymbol("ACC-RESET-FN"), makeSymbol("ACC-ADD-FN"), makeSymbol("ACC-ADD-ALL-FN"), makeSymbol("ACC-SIZE-FN"), makeSymbol("ACC-CONTENTS-FN"), makeSymbol("ACC-ITERATOR-FN"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-ACC-STATE"), makeSymbol("_CSETF-ACC-RESET-FN"), makeSymbol("_CSETF-ACC-ADD-FN"), makeSymbol("_CSETF-ACC-ADD-ALL-FN"), makeSymbol("_CSETF-ACC-SIZE-FN"), makeSymbol("_CSETF-ACC-CONTENTS-FN"), makeSymbol("_CSETF-ACC-ITERATOR-FN"));

    static private final SubLString $str_alt29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt30$__ = makeString("#<");

    static private final SubLString $str_alt33$_A_elems = makeString("~A elems");

    public static final class $accumulator_p$UnaryFunction extends UnaryFunction {
	public $accumulator_p$UnaryFunction() {
	    super(extractFunctionNamed("ACCUMULATOR-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return accumulator_p(arg1);
	}
    }

    static private final SubLString $str_alt37$Implementation_Error__Accumulator = makeString("Implementation Error: Accumulator ~A has an invalid size function.");

    static private final SubLString $str_alt38$Destructively_extracting_the_cont = makeString("Destructively extracting the contents of accumulator ~A did not reset it.");

    static private final SubLString $str_alt39$Non_destructively_extracting_the_ = makeString("Non-destructively extracting the contents of accumulator ~A changed its size.");

    static private final SubLString $str_alt40$Creating_an_iterator_from_the_con = makeString("Creating an iterator from the contents of accumulator ~A changed its size.");

    static private final SubLList $list_alt41 = list(list(makeSymbol("VALUE"), makeSymbol("ACCUMULATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt42 = list($DONE);

    static private final SubLString $str_alt54$New_list_accumulator__A_is_not_em = makeString("New list accumulator ~A is not empty?");

    static private final SubLString $str_alt55$Accumulator_should_have__A_elemen = makeString("Accumulator should have ~A elements but has ~A.~%");

    static private final SubLString $str_alt56$Mismatch_between_iterator_content = makeString("Mismatch between iterator contents of ~A and input list!");

    static private final SubLString $str_alt57$Accumulator__A_contains_less_item = makeString("Accumulator ~A contains less items than the input iterator has!");

    static private final SubLString $str_alt58$Destructively_emptied_accumulator = makeString("Destructively emptied accumulator ~A is not empty?");

    static private final SubLString $str_alt64$New_set_accumulator__A_is_not_emp = makeString("New set accumulator ~A is not empty?");

    static private final SubLString $str_alt70$Dictionary_accumulator_expects_tu = makeString("Dictionary accumulator expects tuples of (KEY . VALUE), not ~A.~%");

    static private final SubLList $list_alt71 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLString $str_alt72$New_dictionary_accumulator__A_is_ = makeString("New dictionary accumulator ~A is not empty?");

    static private final SubLString $str_alt77$New_null_accumulator__A_is_not_em = makeString("New null accumulator ~A is not empty");

    static private final SubLString $str_alt78$New_null_accumulator__A_is_no_lon = makeString("New null accumulator ~A is no longer empty");

    static private final SubLString $str_alt79$Expected_iterator__a_to_be_empty = makeString("Expected iterator ~a to be empty");

    static private final SubLString $str_alt80$Destructively_emptied_accumulator = makeString("Destructively emptied accumulator ~A is not empty");

    static private final SubLString $str_alt81$Contents_were__a_instead_of_null = makeString("Contents were ~a instead of null");

    static private final SubLString $str_alt87$New_sum_accumulator__A_is_not_emp = makeString("New sum accumulator ~A is not empty");

    static private final SubLString $str_alt88$Accumulator_should_have_1_element = makeString("Accumulator should have 1 element but has ~A.~%");

    static private final SubLString $str_alt89$Expected_iterator__a_to_have_only = makeString("Expected iterator ~a to have only 1 value");

    static private final SubLString $str_alt90$Contents_did_not_sum_to__a = makeString("Contents did not sum to ~a");

    static private final SubLString $str_alt91$Iterator_contained__a_instead_of_ = makeString("Iterator contained ~a instead of ~a");

    static private final SubLString $str_alt93$New_count_accumulator__A_is_not_e = makeString("New count accumulator ~A is not empty");

    static private final SubLString $str_alt94$Contents_did_not_count_to__a = makeString("Contents did not count to ~a");

    static private final SubLString $str_alt96$New_product_accumulator__A_is_not = makeString("New product accumulator ~A is not empty");

    static private final SubLString $str_alt98$Contents_did_not_multiply_to__a = makeString("Contents did not multiply to ~a");

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt107 = list(list(list(list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, ZERO_INTEGER })), T));

    static private final SubLList $list_alt109 = list(list(list(list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, ZERO_INTEGER }), EQUAL), T));

    static private final SubLList $list_alt111 = list(list(list(list(new SubLObject[] { list(ONE_INTEGER, makeString("Eins")), list(TWO_INTEGER, makeString("Zwei")), list(THREE_INTEGER, makeString("Drei")), list(FOUR_INTEGER, makeString("Vier")), list(FIVE_INTEGER, makeString("F&uuml;nf")),
	    list(SIX_INTEGER, makeString("Sechs")), list(SEVEN_INTEGER, makeString("Sieben")), list(EIGHT_INTEGER, makeString("Acht")), list(NINE_INTEGER, makeString("Neun")), list(TEN_INTEGER, makeString("Zehn")) }), EQUAL), T));

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt114 = list(list(list(list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })), T),
	    list(list(list(makeString("a"), CHAR_b, THREE_INTEGER, list(makeSymbol("FUNCTION"), makeSymbol("FOURTH")))), T));

    static private final SubLList $list_alt116 = list(list(list(list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })), T),
	    list(list(list(ONE_INTEGER, ONE_INTEGER, ONE_INTEGER, makeInteger(-3))), T));

    static private final SubLList $list_alt119 = list(list(list(list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })), T), list(list(list(TWO_INTEGER, makeDouble(0.5))), T));
}
