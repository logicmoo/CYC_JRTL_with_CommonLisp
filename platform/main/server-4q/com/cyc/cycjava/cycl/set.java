/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input_object;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_raw_write_byte;
import static com.cyc.cycjava.cycl.cfasl.register_cfasl_input_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class set extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_set_map_test_case_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, SET_MAP_TEST_CASE, SET, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_set_map_test_case_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_set_kitchen_sink_test_case_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, SET_KITCHEN_SINK_TEST_CASE, SET, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_set_kitchen_sink_test_case_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_set_iterator_test_case_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, SET_ITERATOR_TEST_CASE, SET, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_set_iterator_test_case_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_set_info_test_case_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, SET_INFO_TEST_CASE, SET, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_set_info_test_case_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_set_change_op_test_case_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, SET_CHANGE_OP_TEST_CASE, SET, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_set_change_op_test_case_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject set_set_map_test_case_set(SubLObject set_map_test_case, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(set_map_test_case, value, THREE_INTEGER, SET);
    }

    public static final SubLObject set_set_kitchen_sink_test_case_set(SubLObject set_kitchen_sink_test_case, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(set_kitchen_sink_test_case, value, THREE_INTEGER, SET);
    }

    public static final SubLObject set_set_iterator_test_case_set(SubLObject set_iterator_test_case, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(set_iterator_test_case, value, THREE_INTEGER, SET);
    }

    public static final SubLObject set_set_info_test_case_set(SubLObject set_info_test_case, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(set_info_test_case, value, THREE_INTEGER, SET);
    }

    public static final SubLObject set_set_change_op_test_case_set(SubLObject set_change_op_test_case, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(set_change_op_test_case, value, THREE_INTEGER, SET);
    }

    public static final SubLObject set_map_test_case_p(SubLObject set_map_test_case) {
	return classes.subloop_instanceof_class(set_map_test_case, SET_MAP_TEST_CASE);
    }

    public static final SubLObject set_kitchen_sink_test_case_p(SubLObject set_kitchen_sink_test_case) {
	return classes.subloop_instanceof_class(set_kitchen_sink_test_case, SET_KITCHEN_SINK_TEST_CASE);
    }

    public static final SubLObject set_iterator_test_case_p(SubLObject set_iterator_test_case) {
	return classes.subloop_instanceof_class(set_iterator_test_case, SET_ITERATOR_TEST_CASE);
    }

    public static final SubLObject set_info_test_case_p(SubLObject set_info_test_case) {
	return classes.subloop_instanceof_class(set_info_test_case, SET_INFO_TEST_CASE);
    }

    public static final SubLObject set_change_op_test_case_p(SubLObject set_change_op_test_case) {
	return classes.subloop_instanceof_class(set_change_op_test_case, SET_CHANGE_OP_TEST_CASE);
    }

    public static final SubLObject get_set_map_test_case_set(SubLObject set_map_test_case) {
	return classes.subloop_get_access_protected_instance_slot(set_map_test_case, THREE_INTEGER, SET);
    }

    public static final SubLObject get_set_kitchen_sink_test_case_set(SubLObject set_kitchen_sink_test_case) {
	return classes.subloop_get_access_protected_instance_slot(set_kitchen_sink_test_case, THREE_INTEGER, SET);
    }

    public static final SubLObject get_set_iterator_test_case_set(SubLObject set_iterator_test_case) {
	return classes.subloop_get_access_protected_instance_slot(set_iterator_test_case, THREE_INTEGER, SET);
    }

    public static final SubLObject get_set_info_test_case_set(SubLObject set_info_test_case) {
	return classes.subloop_get_access_protected_instance_slot(set_info_test_case, THREE_INTEGER, SET);
    }

    public static final SubLObject get_set_change_op_test_case_set(SubLObject set_change_op_test_case) {
	return classes.subloop_get_access_protected_instance_slot(set_change_op_test_case, THREE_INTEGER, SET);
    }

    // Definitions
    public static final class $set_native extends SubLStructNative {
	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return com.cyc.cycjava.cycl.set.$set_native.this.$contents;
	}

	@Override
	public SubLObject getField3() {
	    return com.cyc.cycjava.cycl.set.$set_native.this.$test;
	}

	@Override
	public SubLObject setField2(SubLObject value) {
	    return com.cyc.cycjava.cycl.set.$set_native.this.$contents = value;
	}

	@Override
	public SubLObject setField3(SubLObject value) {
	    return com.cyc.cycjava.cycl.set.$set_native.this.$test = value;
	}

	public SubLObject $contents = Lisp.NIL;

	public SubLObject $test = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.set.$set_native.class, SET, SET_P, $list_alt3, $list_alt4, new String[] { "$contents", "$test" }, $list_alt5, $list_alt6, PRINT_SET);
    }

    public static final SubLFile me = new set();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_set$ = makeSymbol("*DTP-SET*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $new_set_default_test_function$ = makeSymbol("*NEW-SET-DEFAULT-TEST-FUNCTION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_opcode_set$ = makeSymbol("*CFASL-OPCODE-SET*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_opcode_legacy_set$ = makeSymbol("*CFASL-OPCODE-LEGACY-SET*");

    private static final SubLInteger $int$136 = makeInteger(136);

    static private final SubLList $list3 = list(makeSymbol("CONTENTS"), makeSymbol("TEST"));

    static private final SubLList $list4 = list(makeKeyword("CONTENTS"), $TEST);

    static private final SubLList $list5 = list(makeSymbol("SET-STRUCT-CONTENTS"), makeSymbol("SET-STRUCT-TEST"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-SET-STRUCT-CONTENTS"), makeSymbol("_CSETF-SET-STRUCT-TEST"));

    private static final SubLSymbol PRINT_SET = makeSymbol("PRINT-SET");

    private static final SubLSymbol SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SET-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SET-P"));

    private static final SubLSymbol SET_STRUCT_CONTENTS = makeSymbol("SET-STRUCT-CONTENTS");

    private static final SubLSymbol _CSETF_SET_STRUCT_CONTENTS = makeSymbol("_CSETF-SET-STRUCT-CONTENTS");

    private static final SubLSymbol SET_STRUCT_TEST = makeSymbol("SET-STRUCT-TEST");

    private static final SubLSymbol _CSETF_SET_STRUCT_TEST = makeSymbol("_CSETF-SET-STRUCT-TEST");

    private static final SubLString $str16$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SET = makeSymbol("MAKE-SET");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SET-METHOD");

    private static final SubLString $str22$_ = makeString("(");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str24$_ = makeString(")");

    private static final SubLString $str25$_size_ = makeString(" size=");

    private static final SubLString $str26$_elements___S = makeString(" elements: ~S");

    private static final SubLString $str32$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLList $list33 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SET"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list34 = list(makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym38$SET_VAR = makeUninternedSymbol("SET-VAR");

    private static final SubLSymbol $sym41$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    private static final SubLSymbol $sym42$SOFAR_VAR = makeUninternedSymbol("SOFAR-VAR");

    private static final SubLSymbol $sym43$TOTAL_VAR = makeUninternedSymbol("TOTAL-VAR");

    private static final SubLList $list44 = list(ZERO_INTEGER);

    private static final SubLSymbol SET_SIZE = makeSymbol("SET-SIZE");

    private static final SubLSymbol DO_SET_INTERNAL = makeSymbol("DO-SET-INTERNAL");

    private static final SubLList $list51 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SET"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list52 = list($DONE);

    private static final SubLSymbol $sym53$SOS = makeUninternedSymbol("SOS");

    private static final SubLList $list55 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SET-OR-LIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym56$SOL = makeUninternedSymbol("SOL");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLSymbol CFASL_INPUT_SET = makeSymbol("CFASL-INPUT-SET");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_SET_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-SET-METHOD");

    private static final SubLInteger $int$67 = makeInteger(67);

    private static final SubLSymbol CFASL_INPUT_LEGACY_SET = makeSymbol("CFASL-INPUT-LEGACY-SET");

    private static final SubLString $$$Set_Module_Supercategory = makeString("Set Module Supercategory");

    private static final SubLString $str67$Set_Module_Change_Operation_Subca = makeString("Set Module Change Operation Subcategory");

    private static final SubLString $str68$Set_Module_Information_Subcategor = makeString("Set Module Information Subcategory");

    private static final SubLString $$$Set_Module_Iterator_Subcategory = makeString("Set Module Iterator Subcategory");

    private static final SubLString $$$Set_Module_Mapping_Subcategory = makeString("Set Module Mapping Subcategory");

    private static final SubLString $str71$Set_Module_Kitchen_Sink_Subcatego = makeString("Set Module Kitchen Sink Subcategory");

    private static final SubLString $$$Set_Module_Testing_Suite = makeString("Set Module Testing Suite");

    public static final SubLObject set_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	print_set(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	print_set(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject set_p_alt(SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.set.$set_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject set_p(final SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.set.$set_native.class ? T : NIL;
    }

    public static final SubLObject set_struct_contents_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SET_P);
	return v_object.getField2();
    }

    public static SubLObject set_struct_contents(final SubLObject v_object) {
	if (SubLMain.BOOTY_HACKZ && v_object == NIL)
	    return NIL;

	assert NIL != set_p(v_object) : "! set.set_p(v_object) " + "set.set_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject set_struct_test_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SET_P);
	return v_object.getField3();
    }

    public static SubLObject set_struct_test(final SubLObject v_object) {
	assert NIL != set_p(v_object) : "! set.set_p(v_object) " + "set.set_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject _csetf_set_struct_contents_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SET_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_set_struct_contents(final SubLObject v_object, final SubLObject value) {
	assert NIL != set_p(v_object) : "! set.set_p(v_object) " + "set.set_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_set_struct_test_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SET_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_set_struct_test(final SubLObject v_object, final SubLObject value) {
	assert NIL != set_p(v_object) : "! set.set_p(v_object) " + "set.set_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject make_set_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new com.cyc.cycjava.cycl.set.$set_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($CONTENTS)) {
			_csetf_set_struct_contents(v_new, current_value);
		    } else {
			if (pcase_var.eql($TEST)) {
			    _csetf_set_struct_test(v_new, current_value);
			} else {
			    Errors.error($str_alt15$Invalid_slot__S_for_construction_, current_arg);
			}
		    }
		}
	    }
	    return v_new;
	}
    }

    public static SubLObject make_set(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new com.cyc.cycjava.cycl.set.$set_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($CONTENTS)) {
		_csetf_set_struct_contents(v_new, current_value);
	    } else if (pcase_var.eql($TEST)) {
		_csetf_set_struct_test(v_new, current_value);
	    } else {
		Errors.error($str16$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_set(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_SET, TWO_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $CONTENTS, set_struct_contents(obj));
	funcall(visitor_fn, obj, $SLOT, $TEST, set_struct_test(obj));
	funcall(visitor_fn, obj, $END, MAKE_SET, TWO_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_set_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_set(obj, visitor_fn);
    }

    public static final SubLObject print_set_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $print_readably$.getDynamicValue(thread)) {
		print_not_readable(v_object, stream);
	    } else {
		{
		    SubLObject v_object_1 = v_object;
		    SubLObject stream_2 = stream;
		    write_string($str_alt16$__, stream_2, UNPROVIDED, UNPROVIDED);
		    write(type_of(v_object_1), new SubLObject[] { $STREAM, stream_2 });
		    write_char(CHAR_space, stream_2);
		    write_string($str_alt18$_, stream, UNPROVIDED, UNPROVIDED);
		    princ(hash_table_utilities.hash_test_to_symbol(set_struct_test(v_object)), stream);
		    write_string($str_alt19$_, stream, UNPROVIDED, UNPROVIDED);
		    write_string(symbol_name(set_style(v_object)), stream, UNPROVIDED, UNPROVIDED);
		    write_string($str_alt20$_, stream, UNPROVIDED, UNPROVIDED);
		    write_string($str_alt21$_size_, stream, UNPROVIDED, UNPROVIDED);
		    princ(set_size(v_object), stream);
		    write_char(CHAR_space, stream_2);
		    write(pointer(v_object_1), new SubLObject[] { $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
		    write_char(CHAR_greater, stream_2);
		}
	    }
	    return v_object;
	}
    }

    public static SubLObject print_set(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $print_readably$.getDynamicValue(thread)) {
	    print_not_readable(v_object, stream);
	} else {
	    print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
	    write_string($str22$_, stream, UNPROVIDED, UNPROVIDED);
	    princ(hash_table_utilities.hash_test_to_symbol(set_struct_test(v_object)), stream);
	    write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
	    write_string(symbol_name(set_style(v_object)), stream, UNPROVIDED, UNPROVIDED);
	    write_string($str24$_, stream, UNPROVIDED, UNPROVIDED);
	    write_string($str25$_size_, stream, UNPROVIDED, UNPROVIDED);
	    princ(set_size(v_object), stream);
	    if (set_size(v_object).numL(TWENTY_INTEGER)) {
		format(stream, $str26$_elements___S, set_element_list(v_object));
	    }
	    print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
	}
	return v_object;
    }

    /**
     * Return the current style of SET
     *
     * @return type-symbol.
     */
    @LispMethod(comment = "Return the current style of SET\r\n\r\n@return type-symbol.")
    public static final SubLObject set_style_alt(SubLObject v_set) {
	{
	    SubLObject contents = set_struct_contents(v_set);
	    if (contents.isList()) {
		return $LIST;
	    } else {
		if (NIL != keyhash.keyhash_p(contents)) {
		    return $KEYHASH;
		} else {
		    return $SINGLETON;
		}
	    }
	}
    }

    /**
     * Return the current style of SET
     *
     * @return type-symbol.
     */
    @LispMethod(comment = "Return the current style of SET\r\n\r\n@return type-symbol.")
    public static SubLObject set_style(final SubLObject v_set) {
	final SubLObject contents = set_struct_contents(v_set);
	if (contents.isList()) {
	    return $LIST;
	}
	if (NIL != keyhash.keyhash_p(contents)) {
	    return $KEYHASH;
	}
	return $SINGLETON;
    }

    /**
     * Allocate a new set with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     *
     * @return set-p
     */
    @LispMethod(comment = "Allocate a new set with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\n\r\n@return set-p\nAllocate a new set with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.")
    public static final SubLObject new_set_alt(SubLObject test, SubLObject size) {
	if (test == UNPROVIDED) {
	    test = $new_set_default_test_function$.getGlobalValue();
	}
	if (size == UNPROVIDED) {
	    size = ZERO_INTEGER;
	}
	SubLTrampolineFile.checkType(test, VALID_HASH_TEST_P);
	SubLTrampolineFile.checkType(size, INTEGERP);
	if (test.isSymbol()) {
	    test = symbol_function(test);
	}
	{
	    SubLObject v_set = make_set(UNPROVIDED);
	    _csetf_set_struct_test(v_set, test);
	    _csetf_set_struct_contents(v_set, set_contents.new_set_contents(size, test));
	    return v_set;
	}
    }

    /**
     * Allocate a new set with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     *
     * @return set-p
     */
    @LispMethod(comment = "Allocate a new set with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\n\r\n@return set-p\nAllocate a new set with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.")
    public static SubLObject new_set(SubLObject test, SubLObject size) {
	if (test == UNPROVIDED) {
	    test = $new_set_default_test_function$.getGlobalValue();
	}
	if (size == UNPROVIDED) {
	    size = ZERO_INTEGER;
	}
	assert NIL != hash_table_utilities.valid_hash_test_p(test) : "! hash_table_utilities.valid_hash_test_p(test) " + ("hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) ") + test;
	assert NIL != integerp(size) : "! integerp(size) " + ("Types.integerp(size) " + "CommonSymbols.NIL != Types.integerp(size) ") + size;
	if (test.isSymbol()) {
	    test = symbol_function(test);
	}
	final SubLObject v_set = make_set(UNPROVIDED);
	_csetf_set_struct_test(v_set, test);
	_csetf_set_struct_contents(v_set, set_contents.new_set_contents(size, test));
	return v_set;
    }

    /**
     * Return a new copy of SET.
     *
     * @return set-p
     */
    @LispMethod(comment = "Return a new copy of SET.\r\n\r\n@return set-p")
    public static final SubLObject copy_set_alt(SubLObject v_set) {
	SubLTrampolineFile.checkType(v_set, SET_P);
	{
	    SubLObject new_set = new_set(set_test(v_set), ZERO_INTEGER);
	    _csetf_set_struct_contents(new_set, set_contents.copy_set_contents(set_struct_contents(v_set)));
	    return new_set;
	}
    }

    /**
     * Return a new copy of SET.
     *
     * @return set-p
     */
    @LispMethod(comment = "Return a new copy of SET.\r\n\r\n@return set-p")
    public static SubLObject copy_set(final SubLObject v_set) {
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	final SubLObject new_set = new_set(set_test(v_set), ZERO_INTEGER);
	_csetf_set_struct_contents(new_set, set_contents.copy_set_contents(set_struct_contents(v_set)));
	return new_set;
    }

    /**
     * Return the equality test function used in SET.
     *
     * @return function-spec-p.
     */
    @LispMethod(comment = "Return the equality test function used in SET.\r\n\r\n@return function-spec-p.")
    public static final SubLObject set_test_alt(SubLObject v_set) {
	SubLTrampolineFile.checkType(v_set, SET_P);
	return set_struct_test(v_set);
    }

    /**
     * Return the equality test function used in SET.
     *
     * @return function-spec-p.
     */
    @LispMethod(comment = "Return the equality test function used in SET.\r\n\r\n@return function-spec-p.")
    public static SubLObject set_test(final SubLObject v_set) {
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	return set_struct_test(v_set);
    }

    /**
     * Return the number of items currently entered in SET.
     *
     * @return integerp.
     */
    @LispMethod(comment = "Return the number of items currently entered in SET.\r\n\r\n@return integerp.")
    public static final SubLObject set_size_alt(SubLObject v_set) {
	SubLTrampolineFile.checkType(v_set, SET_P);
	return set_contents.set_contents_size(set_struct_contents(v_set));
    }

    /**
     * Return the number of items currently entered in SET.
     *
     * @return integerp.
     */
    @LispMethod(comment = "Return the number of items currently entered in SET.\r\n\r\n@return integerp.")
    public static SubLObject set_size(final SubLObject v_set) {
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	return set_contents.set_contents_size(set_struct_contents(v_set));
    }

    /**
     *
     *
     * @return boolean; non-nil iff SET is empty, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil iff SET is empty, nil otherwise")
    public static final SubLObject set_emptyP_alt(SubLObject v_set) {
	SubLTrampolineFile.checkType(v_set, SET_P);
	return set_contents.set_contents_emptyP(set_struct_contents(v_set));
    }

    /**
     *
     *
     * @return boolean; non-nil iff SET is empty, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil iff SET is empty, nil otherwise")
    public static SubLObject set_emptyP(final SubLObject v_set) {
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	return set_contents.set_contents_emptyP(set_struct_contents(v_set));
    }

    public static SubLObject set_or_list_emptyP(final SubLObject set_or_list) {
	if (NIL != set_p(set_or_list)) {
	    return set_contents.set_contents_emptyP(set_struct_contents(set_or_list));
	}
	if (set_or_list.isList()) {
	    return sublisp_null(set_or_list);
	}
	Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_);
	return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ an empty set?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ an empty set?")
    public static final SubLObject empty_set_p_alt(SubLObject obj) {
	return makeBoolean((NIL != set_p(obj)) && (NIL != set_emptyP(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ an empty set?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ an empty set?")
    public static SubLObject empty_set_p(final SubLObject obj) {
	return makeBoolean((NIL != set_p(obj)) && (NIL != set_emptyP(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a non-empty set?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a non-empty set?")
    public static final SubLObject non_empty_set_p_alt(SubLObject obj) {
	return makeBoolean((NIL != set_p(obj)) && (NIL == set_emptyP(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a non-empty set?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a non-empty set?")
    public static SubLObject non_empty_set_p(final SubLObject obj) {
	return makeBoolean((NIL != set_p(obj)) && (NIL == set_emptyP(obj)));
    }

    /**
     *
     *
     * @return boolean; t iff ELEMENT is in SET.
     */
    @LispMethod(comment = "@return boolean; t iff ELEMENT is in SET.")
    public static final SubLObject set_memberP_alt(SubLObject element, SubLObject v_set) {
	SubLTrampolineFile.checkType(v_set, SET_P);
	return set_contents.set_contents_memberP(element, set_struct_contents(v_set), set_struct_test(v_set));
    }

    /**
     *
     *
     * @return boolean; t iff ELEMENT is in SET.
     */
    @LispMethod(comment = "@return boolean; t iff ELEMENT is in SET.")
    public static SubLObject set_memberP(final SubLObject element, final SubLObject v_set) {
	if (SubLMain.BOOTY_HACKZ && v_set == NIL)
	    return NIL;
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	return set_contents.set_contents_memberP(element, set_struct_contents(v_set), set_struct_test(v_set));
    }

    public static SubLObject set_member_permissiveP(final SubLObject element, final SubLObject v_set) {
	if (NIL == set_p(v_set)) {
	    return NIL;
	}
	return set_member_permissiveP(element, v_set);
    }

    public static SubLObject set_or_list_memberP(final SubLObject element, final SubLObject set_or_list) {
	if (NIL != set_p(set_or_list)) {
	    return set_memberP(element, set_or_list);
	}
	if (set_or_list.isList()) {
	    return subl_promotions.memberP(element, set_or_list, UNPROVIDED, UNPROVIDED);
	}
	Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_);
	return NIL;
    }

    public static SubLObject set_or_list_to_list(final SubLObject set_or_list) {
	if (NIL != set_p(set_or_list)) {
	    return set_element_list(set_or_list);
	}
	if (set_or_list.isList()) {
	    return set_or_list;
	}
	Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_);
	return NIL;
    }

    /**
     * If there is an element in SET that matches ELEMENT, then return it.
     * Otherwise return NIL.
     * Similar to @xref SET-FIND, except more efficient and does not allow TEST or KEY parameters.
     */
    @LispMethod(comment = "If there is an element in SET that matches ELEMENT, then return it.\r\nOtherwise return NIL.\r\nSimilar to @xref SET-FIND, except more efficient and does not allow TEST or KEY parameters.\nIf there is an element in SET that matches ELEMENT, then return it.\nOtherwise return NIL.\nSimilar to @xref SET-FIND, except more efficient and does not allow TEST or KEY parameters.")
    public static final SubLObject set_matching_element_alt(SubLObject element, SubLObject v_set) {
	SubLTrampolineFile.checkType(v_set, SET_P);
	return set_contents.set_contents_matching_element(element, set_struct_contents(v_set), set_struct_test(v_set));
    }

    /**
     * If there is an element in SET that matches ELEMENT, then return it.
     * Otherwise return NIL.
     * Similar to @xref SET-FIND, except more efficient and does not allow TEST or KEY parameters.
     */
    @LispMethod(comment = "If there is an element in SET that matches ELEMENT, then return it.\r\nOtherwise return NIL.\r\nSimilar to @xref SET-FIND, except more efficient and does not allow TEST or KEY parameters.\nIf there is an element in SET that matches ELEMENT, then return it.\nOtherwise return NIL.\nSimilar to @xref SET-FIND, except more efficient and does not allow TEST or KEY parameters.")
    public static SubLObject set_matching_element(final SubLObject element, final SubLObject v_set) {
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	return set_contents.set_contents_matching_element(element, set_struct_contents(v_set), set_struct_test(v_set));
    }

    /**
     * Return a randomly chosen element of SET, if any.
     */
    @LispMethod(comment = "Return a randomly chosen element of SET, if any.")
    public static final SubLObject set_random_element_alt(SubLObject v_set) {
	SubLTrampolineFile.checkType(v_set, SET_P);
	return set_contents.set_contents_random_element(set_struct_contents(v_set));
    }

    /**
     * Return a randomly chosen element of SET, if any.
     */
    @LispMethod(comment = "Return a randomly chosen element of SET, if any.")
    public static SubLObject set_random_element(final SubLObject v_set) {
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	return set_contents.set_contents_random_element(set_struct_contents(v_set));
    }

    /**
     * Add this ELEMENT into the SET.
     *
     * @return boolean, t iff ELEMENT was not already there.
     */
    @LispMethod(comment = "Add this ELEMENT into the SET.\r\n\r\n@return boolean, t iff ELEMENT was not already there.")
    public static final SubLObject set_add_alt(SubLObject element, SubLObject v_set) {
	if (NIL == set_memberP(element, v_set)) {
	    _csetf_set_struct_contents(v_set, set_contents.set_contents_add(element, set_struct_contents(v_set), set_struct_test(v_set)));
	    return T;
	}
	return NIL;
    }

    /**
     * Add this ELEMENT into the SET.
     *
     * @return boolean, t iff ELEMENT was not already there.
     */
    @LispMethod(comment = "Add this ELEMENT into the SET.\r\n\r\n@return boolean, t iff ELEMENT was not already there.")
    public static SubLObject set_add(final SubLObject element, final SubLObject v_set) {
	if (NIL == set_memberP(element, v_set)) {
	    _csetf_set_struct_contents(v_set, set_contents.set_contents_add(element, set_struct_contents(v_set), set_struct_test(v_set)));
	    return T;
	}
	return NIL;
    }

    /**
     * If ELEMENT is present in SET, then take it out of SET.
     *
     * @return boolean; t iff ELEMENT was in SET to begin with.
     */
    @LispMethod(comment = "If ELEMENT is present in SET, then take it out of SET.\r\n\r\n@return boolean; t iff ELEMENT was in SET to begin with.")
    public static final SubLObject set_remove_alt(SubLObject element, SubLObject v_set) {
	if (NIL != set_memberP(element, v_set)) {
	    _csetf_set_struct_contents(v_set, set_contents.set_contents_delete(element, set_struct_contents(v_set), set_struct_test(v_set)));
	    return T;
	}
	return NIL;
    }

    /**
     * If ELEMENT is present in SET, then take it out of SET.
     *
     * @return boolean; t iff ELEMENT was in SET to begin with.
     */
    @LispMethod(comment = "If ELEMENT is present in SET, then take it out of SET.\r\n\r\n@return boolean; t iff ELEMENT was in SET to begin with.")
    public static SubLObject set_remove(final SubLObject element, final SubLObject v_set) {
	if (NIL != set_memberP(element, v_set)) {
	    _csetf_set_struct_contents(v_set, set_contents.set_contents_delete(element, set_struct_contents(v_set), set_struct_test(v_set)));
	    return T;
	}
	return NIL;
    }

    /**
     * Reset SET to the status of being just allocated.
     *
     * @return set
     */
    @LispMethod(comment = "Reset SET to the status of being just allocated.\r\n\r\n@return set")
    public static final SubLObject clear_set_alt(SubLObject v_set) {
	SubLTrampolineFile.checkType(v_set, SET_P);
	_csetf_set_struct_contents(v_set, set_contents.clear_set_contents(set_struct_contents(v_set)));
	return v_set;
    }

    /**
     * Reset SET to the status of being just allocated.
     *
     * @return set
     */
    @LispMethod(comment = "Reset SET to the status of being just allocated.\r\n\r\n@return set")
    public static SubLObject clear_set(final SubLObject v_set) {
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	_csetf_set_struct_contents(v_set, set_contents.clear_set_contents(set_struct_contents(v_set)));
	return v_set;
    }

    /**
     * Returns an iterator for the elements of SET.
     */
    @LispMethod(comment = "Returns an iterator for the elements of SET.")
    public static final SubLObject new_set_iterator_alt(SubLObject v_set) {
	SubLTrampolineFile.checkType(v_set, SET_P);
	return set_contents.new_set_contents_iterator(set_struct_contents(v_set));
    }

    /**
     * Returns an iterator for the elements of SET.
     */
    @LispMethod(comment = "Returns an iterator for the elements of SET.")
    public static SubLObject new_set_iterator(final SubLObject v_set) {
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	return set_contents.new_set_contents_iterator(set_struct_contents(v_set));
    }

    /**
     * Iterate over SET, binding ELEMENT-VAR to each element indexed.
     * BODY is executed once within the scope of each binding of ELEMENT-VAR.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over SET, binding ELEMENT-VAR to each element indexed.\r\nBODY is executed once within the scope of each binding of ELEMENT-VAR.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over SET, binding ELEMENT-VAR to each element indexed.\nBODY is executed once within the scope of each binding of ELEMENT-VAR.\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_set_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt28);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject element_var = NIL;
		    SubLObject v_set = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt28);
		    element_var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt28);
		    v_set = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_3 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt28);
			    current_3 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt28);
			    if (NIL == member(current_3, $list_alt29, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_3 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt28);
			}
			{
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				return listS(DO_SET_CONTENTS, list(element_var, list(DO_SET_INTERNAL, v_set), $DONE, done), append(body, NIL));
			    }
			}
		    }
		}
	    }
	}
    }

    /**
     * Iterate over SET, binding ELEMENT-VAR to each element indexed.
     * BODY is executed once within the scope of each binding of ELEMENT-VAR.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over SET, binding ELEMENT-VAR to each element indexed.\r\nBODY is executed once within the scope of each binding of ELEMENT-VAR.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over SET, binding ELEMENT-VAR to each element indexed.\nBODY is executed once within the scope of each binding of ELEMENT-VAR.\nIteration halts as soon as DONE becomes non-nil.")
    public static SubLObject do_set(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list33);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject element_var = NIL;
	SubLObject v_set = NIL;
	destructuring_bind_must_consp(current, datum, $list33);
	element_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list33);
	v_set = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$1 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list33);
	    current_$1 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list33);
	    if (NIL == member(current_$1, $list34, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$1 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list33);
	}
	final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
	final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	if (!v_set.isAtom()) {
	    final SubLObject set_var = $sym38$SET_VAR;
	    return list(CLET, list(list(set_var, v_set)), listS(DO_SET, list(element_var, set_var, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
	}
	if (!progress_message.isAtom()) {
	    final SubLObject message_var = $sym41$MESSAGE_VAR;
	    return list(CLET, list(list(message_var, progress_message)), listS(DO_SET, list(element_var, v_set, $PROGRESS_MESSAGE, message_var, $DONE, done), append(body, NIL)));
	}
	if (NIL != progress_message) {
	    final SubLObject sofar_var = $sym42$SOFAR_VAR;
	    final SubLObject total_var = $sym43$TOTAL_VAR;
	    return list(CLET, list(bq_cons(sofar_var, $list44), list(total_var, list(SET_SIZE, v_set))),
		    list(NOTING_PERCENT_PROGRESS, progress_message, listS(DO_SET, list(element_var, v_set, $DONE, done), list(CINC, sofar_var), list(NOTE_PERCENT_PROGRESS, sofar_var, total_var), append(body, NIL))));
	}
	return listS(DO_SET_CONTENTS, list(element_var, list(DO_SET_INTERNAL, v_set), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_set_permissive(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list51);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject element_var = NIL;
	SubLObject v_set = NIL;
	destructuring_bind_must_consp(current, datum, $list51);
	element_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list51);
	v_set = current.first();
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
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject sos = $sym53$SOS;
	return list(CLET, list(list(sos, v_set)), list(PWHEN, list(SET_P, sos), listS(DO_SET_CONTENTS, list(element_var, list(DO_SET_INTERNAL, sos), $DONE, done), append(body, NIL))));
    }

    public static SubLObject do_set_or_list(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list55);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject element_var = NIL;
	SubLObject set_or_list = NIL;
	destructuring_bind_must_consp(current, datum, $list55);
	element_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list55);
	set_or_list = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$3 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list55);
	    current_$3 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list55);
	    if (NIL == member(current_$3, $list52, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$3 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list55);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject sol = $sym56$SOL;
	return list(CLET, list(list(sol, set_or_list)),
		list(PIF, list(SET_P, sol), listS(DO_SET_CONTENTS, list(element_var, list(DO_SET_INTERNAL, sol), $DONE, done), append(body, NIL)), list(PIF, list(LISTP, sol), listS(CSOME, list(element_var, sol, done), append(body, NIL)), list(ERROR, $str32$_A_is_neither_SET_P_nor_LISTP_, sol))));
    }

    public static final SubLObject do_set_internal_alt(SubLObject v_set) {
	SubLTrampolineFile.checkType(v_set, SET_P);
	return set_struct_contents(v_set);
    }

    public static SubLObject do_set_internal(final SubLObject v_set) {
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	return set_struct_contents(v_set);
    }

    /**
     * Map across SET, applying FUNCTION to each element and ARGS
     * FUNCTION should have a formal parameter list of at least (element).
     *
     * @return NIL
     */
    @LispMethod(comment = "Map across SET, applying FUNCTION to each element and ARGS\r\nFUNCTION should have a formal parameter list of at least (element).\r\n\r\n@return NIL\nMap across SET, applying FUNCTION to each element and ARGS\nFUNCTION should have a formal parameter list of at least (element).")
    public static final SubLObject map_set_alt(SubLObject function, SubLObject v_set, SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	SubLTrampolineFile.checkType(v_set, SET_P);
	set_contents.map_set_contents(function, set_struct_contents(v_set), args);
	return NIL;
    }

    /**
     * Map across SET, applying FUNCTION to each element and ARGS
     * FUNCTION should have a formal parameter list of at least (element).
     *
     * @return NIL
     */
    @LispMethod(comment = "Map across SET, applying FUNCTION to each element and ARGS\r\nFUNCTION should have a formal parameter list of at least (element).\r\n\r\n@return NIL\nMap across SET, applying FUNCTION to each element and ARGS\nFUNCTION should have a formal parameter list of at least (element).")
    public static SubLObject map_set(final SubLObject function, final SubLObject v_set, SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	set_contents.map_set_contents(function, set_struct_contents(v_set), args);
	return NIL;
    }

    public static final SubLObject cfasl_output_object_set_method_alt(SubLObject v_object, SubLObject stream) {
	return cfasl_output_set(v_object, stream);
    }

    public static SubLObject cfasl_output_object_set_method(final SubLObject v_object, final SubLObject stream) {
	return cfasl_output_set(v_object, stream);
    }

    public static final SubLObject cfasl_output_set_alt(SubLObject v_object, SubLObject stream) {
	cfasl_raw_write_byte($cfasl_opcode_set$.getGlobalValue(), stream);
	{
	    SubLObject test = hash_table_utilities.hash_test_to_symbol(set_test(v_object));
	    SubLObject size = set_size(v_object);
	    cfasl_output(test, stream);
	    cfasl_output(size, stream);
	    {
		SubLObject set_contents_var = do_set_internal(v_object);
		SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
		SubLObject state = NIL;
		for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
		    {
			SubLObject element = set_contents.do_set_contents_next(basis_object, state);
			if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
			    cfasl_output(element, stream);
			}
		    }
		}
	    }
	}
	return v_object;
    }

    public static SubLObject cfasl_output_set(final SubLObject v_object, final SubLObject stream) {
	cfasl_raw_write_byte($cfasl_opcode_set$.getGlobalValue(), stream);
	final SubLObject test = hash_table_utilities.hash_test_to_symbol(set_test(v_object));
	final SubLObject size = set_size(v_object);
	cfasl_output(test, stream);
	cfasl_output(size, stream);
	final SubLObject set_contents_var = do_set_internal(v_object);
	SubLObject basis_object;
	SubLObject state;
	SubLObject element;
	for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
		state); state = set_contents.do_set_contents_update_state(state)) {
	    element = set_contents.do_set_contents_next(basis_object, state);
	    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
		cfasl_output(element, stream);
	    }
	}
	return v_object;
    }

    public static final SubLObject cfasl_input_set_alt(SubLObject stream) {
	{
	    SubLObject test = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	    SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	    SubLObject v_set = NIL;
	    SubLObject pcase_var = test;
	    if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
		test = symbol_function(test);
	    }
	    v_set = new_set(test, size);
	    _csetf_set_struct_contents(v_set, set_contents.cfasl_input_set_contents(stream, set_struct_contents(v_set), size, test));
	    return v_set;
	}
    }

    public static SubLObject cfasl_input_set(final SubLObject stream) {
	SubLObject test = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	final SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	SubLObject v_set = NIL;
	final SubLObject pcase_var = test;
	if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
	    test = symbol_function(test);
	}
	v_set = new_set(test, size);
	_csetf_set_struct_contents(v_set, set_contents.cfasl_input_set_contents(stream, set_struct_contents(v_set), size, test));
	return v_set;
    }

    public static final SubLObject cfasl_input_legacy_set_alt(SubLObject stream) {
	{
	    SubLObject v_set = NIL;
	    v_set = new_set(UNPROVIDED, UNPROVIDED);
	    cfasl_input_object(stream);
	    _csetf_set_struct_contents(v_set, cfasl_input_object(stream));
	    _csetf_set_struct_test(v_set, symbol_function(cfasl_input_object(stream)));
	    return v_set;
	}
    }

    public static SubLObject cfasl_input_legacy_set(final SubLObject stream) {
	SubLObject v_set = NIL;
	v_set = new_set(UNPROVIDED, UNPROVIDED);
	cfasl_input_object(stream);
	_csetf_set_struct_contents(v_set, cfasl_input_object(stream));
	_csetf_set_struct_test(v_set, symbol_function(cfasl_input_object(stream)));
	return v_set;
    }

    /**
     *
     *
     * @return list; a list of the elements of SET.
     */
    @LispMethod(comment = "@return list; a list of the elements of SET.")
    public static final SubLObject set_element_list_alt(SubLObject v_set) {
	SubLTrampolineFile.checkType(v_set, SET_P);
	return set_contents.set_contents_element_list(set_struct_contents(v_set));
    }

    /**
     *
     *
     * @return list; a list of the elements of SET.
     */
    @LispMethod(comment = "@return list; a list of the elements of SET.")
    public static SubLObject set_element_list(final SubLObject v_set) {
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	return set_contents.set_contents_element_list(set_struct_contents(v_set));
    }

    /**
     * Rehashes a set if its contents is keyhash style
     */
    @LispMethod(comment = "Rehashes a set if its contents is keyhash style")
    public static final SubLObject set_rebuild_alt(SubLObject v_set) {
	SubLTrampolineFile.checkType(v_set, SET_P);
	_csetf_set_struct_contents(v_set, set_contents.set_contents_rebuild(set_struct_contents(v_set)));
	return v_set;
    }

    /**
     * Rehashes a set if its contents is keyhash style
     */
    @LispMethod(comment = "Rehashes a set if its contents is keyhash style")
    public static SubLObject set_rebuild(final SubLObject v_set) {
	assert NIL != set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
	_csetf_set_struct_contents(v_set, set_contents.set_contents_rebuild(set_struct_contents(v_set)));
	return v_set;
    }

    public static final SubLObject declare_set_file_alt() {
	declareFunction("set_print_function_trampoline", "SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("set_p", "SET-P", 1, 0, false);
	new com.cyc.cycjava.cycl.set.$set_p$UnaryFunction();
	declareFunction("set_struct_contents", "SET-STRUCT-CONTENTS", 1, 0, false);
	declareFunction("set_struct_test", "SET-STRUCT-TEST", 1, 0, false);
	declareFunction("_csetf_set_struct_contents", "_CSETF-SET-STRUCT-CONTENTS", 2, 0, false);
	declareFunction("_csetf_set_struct_test", "_CSETF-SET-STRUCT-TEST", 2, 0, false);
	declareFunction("make_set", "MAKE-SET", 0, 1, false);
	declareFunction("print_set", "PRINT-SET", 3, 0, false);
	declareFunction("set_style", "SET-STYLE", 1, 0, false);
	declareFunction("new_set", "NEW-SET", 0, 2, false);
	declareFunction("copy_set", "COPY-SET", 1, 0, false);
	declareFunction("set_test", "SET-TEST", 1, 0, false);
	declareFunction("set_size", "SET-SIZE", 1, 0, false);
	declareFunction("set_emptyP", "SET-EMPTY?", 1, 0, false);
	declareFunction("empty_set_p", "EMPTY-SET-P", 1, 0, false);
	declareFunction("non_empty_set_p", "NON-EMPTY-SET-P", 1, 0, false);
	declareFunction("set_memberP", "SET-MEMBER?", 2, 0, false);
	declareFunction("set_matching_element", "SET-MATCHING-ELEMENT", 2, 0, false);
	declareFunction("set_random_element", "SET-RANDOM-ELEMENT", 1, 0, false);
	declareFunction("set_add", "SET-ADD", 2, 0, false);
	declareFunction("set_remove", "SET-REMOVE", 2, 0, false);
	declareFunction("clear_set", "CLEAR-SET", 1, 0, false);
	declareFunction("new_set_iterator", "NEW-SET-ITERATOR", 1, 0, false);
	declareMacro("do_set", "DO-SET");
	declareFunction("do_set_internal", "DO-SET-INTERNAL", 1, 0, false);
	declareFunction("map_set", "MAP-SET", 2, 1, false);
	declareFunction("cfasl_output_object_set_method", "CFASL-OUTPUT-OBJECT-SET-METHOD", 2, 0, false);
	declareFunction("cfasl_output_set", "CFASL-OUTPUT-SET", 2, 0, false);
	declareFunction("cfasl_input_set", "CFASL-INPUT-SET", 1, 0, false);
	new com.cyc.cycjava.cycl.set.$cfasl_input_set$UnaryFunction();
	declareFunction("cfasl_input_legacy_set", "CFASL-INPUT-LEGACY-SET", 1, 0, false);
	declareFunction("set_element_list", "SET-ELEMENT-LIST", 1, 0, false);
	declareFunction("set_rebuild", "SET-REBUILD", 1, 0, false);
	declareFunction("get_set_change_op_test_case_set", "GET-SET-CHANGE-OP-TEST-CASE-SET", 1, 0, false);
	declareFunction("set_set_change_op_test_case_set", "SET-SET-CHANGE-OP-TEST-CASE-SET", 2, 0, false);
	declareFunction("subloop_reserved_initialize_set_change_op_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SET-CHANGE-OP-TEST-CASE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_set_change_op_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SET-CHANGE-OP-TEST-CASE-INSTANCE", 1, 0, false);
	declareFunction("set_change_op_test_case_p", "SET-CHANGE-OP-TEST-CASE-P", 1, 0, false);
	declareFunction("get_set_info_test_case_set", "GET-SET-INFO-TEST-CASE-SET", 1, 0, false);
	declareFunction("set_set_info_test_case_set", "SET-SET-INFO-TEST-CASE-SET", 2, 0, false);
	declareFunction("subloop_reserved_initialize_set_info_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SET-INFO-TEST-CASE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_set_info_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SET-INFO-TEST-CASE-INSTANCE", 1, 0, false);
	declareFunction("set_info_test_case_p", "SET-INFO-TEST-CASE-P", 1, 0, false);
	declareFunction("get_set_iterator_test_case_set", "GET-SET-ITERATOR-TEST-CASE-SET", 1, 0, false);
	declareFunction("set_set_iterator_test_case_set", "SET-SET-ITERATOR-TEST-CASE-SET", 2, 0, false);
	declareFunction("subloop_reserved_initialize_set_iterator_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SET-ITERATOR-TEST-CASE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_set_iterator_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SET-ITERATOR-TEST-CASE-INSTANCE", 1, 0, false);
	declareFunction("set_iterator_test_case_p", "SET-ITERATOR-TEST-CASE-P", 1, 0, false);
	declareFunction("get_set_map_test_case_set", "GET-SET-MAP-TEST-CASE-SET", 1, 0, false);
	declareFunction("set_set_map_test_case_set", "SET-SET-MAP-TEST-CASE-SET", 2, 0, false);
	declareFunction("subloop_reserved_initialize_set_map_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SET-MAP-TEST-CASE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_set_map_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SET-MAP-TEST-CASE-INSTANCE", 1, 0, false);
	declareFunction("set_map_test_case_p", "SET-MAP-TEST-CASE-P", 1, 0, false);
	declareFunction("get_set_kitchen_sink_test_case_set", "GET-SET-KITCHEN-SINK-TEST-CASE-SET", 1, 0, false);
	declareFunction("set_set_kitchen_sink_test_case_set", "SET-SET-KITCHEN-SINK-TEST-CASE-SET", 2, 0, false);
	declareFunction("subloop_reserved_initialize_set_kitchen_sink_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SET-KITCHEN-SINK-TEST-CASE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_set_kitchen_sink_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SET-KITCHEN-SINK-TEST-CASE-INSTANCE", 1, 0, false);
	declareFunction("set_kitchen_sink_test_case_p", "SET-KITCHEN-SINK-TEST-CASE-P", 1, 0, false);
	return NIL;
    }

    public static SubLObject declare_set_file() {
	if (SubLFiles.USE_V1) {
	    declareFunction("set_print_function_trampoline", "SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("set_p", "SET-P", 1, 0, false);
	    new set.$set_p$UnaryFunction();
	    declareFunction("set_struct_contents", "SET-STRUCT-CONTENTS", 1, 0, false);
	    declareFunction("set_struct_test", "SET-STRUCT-TEST", 1, 0, false);
	    declareFunction("_csetf_set_struct_contents", "_CSETF-SET-STRUCT-CONTENTS", 2, 0, false);
	    declareFunction("_csetf_set_struct_test", "_CSETF-SET-STRUCT-TEST", 2, 0, false);
	    declareFunction("make_set", "MAKE-SET", 0, 1, false);
	    declareFunction("visit_defstruct_set", "VISIT-DEFSTRUCT-SET", 2, 0, false);
	    declareFunction("visit_defstruct_object_set_method", "VISIT-DEFSTRUCT-OBJECT-SET-METHOD", 2, 0, false);
	    declareFunction("print_set", "PRINT-SET", 3, 0, false);
	    declareFunction("set_style", "SET-STYLE", 1, 0, false);
	    declareFunction("new_set", "NEW-SET", 0, 2, false);
	    declareFunction("copy_set", "COPY-SET", 1, 0, false);
	    declareFunction("set_test", "SET-TEST", 1, 0, false);
	    declareFunction("set_size", "SET-SIZE", 1, 0, false);
	    declareFunction("set_emptyP", "SET-EMPTY?", 1, 0, false);
	    declareFunction("set_or_list_emptyP", "SET-OR-LIST-EMPTY?", 1, 0, false);
	    declareFunction("empty_set_p", "EMPTY-SET-P", 1, 0, false);
	    declareFunction("non_empty_set_p", "NON-EMPTY-SET-P", 1, 0, false);
	    declareFunction("set_memberP", "SET-MEMBER?", 2, 0, false);
	    declareFunction("set_member_permissiveP", "SET-MEMBER-PERMISSIVE?", 2, 0, false);
	    declareFunction("set_or_list_memberP", "SET-OR-LIST-MEMBER?", 2, 0, false);
	    declareFunction("set_or_list_to_list", "SET-OR-LIST-TO-LIST", 1, 0, false);
	    declareFunction("set_matching_element", "SET-MATCHING-ELEMENT", 2, 0, false);
	    declareFunction("set_random_element", "SET-RANDOM-ELEMENT", 1, 0, false);
	    declareFunction("set_add", "SET-ADD", 2, 0, false);
	    declareFunction("set_remove", "SET-REMOVE", 2, 0, false);
	    declareFunction("clear_set", "CLEAR-SET", 1, 0, false);
	    declareFunction("new_set_iterator", "NEW-SET-ITERATOR", 1, 0, false);
	    declareMacro("do_set", "DO-SET");
	    declareMacro("do_set_permissive", "DO-SET-PERMISSIVE");
	    declareMacro("do_set_or_list", "DO-SET-OR-LIST");
	    declareFunction("do_set_internal", "DO-SET-INTERNAL", 1, 0, false);
	    declareFunction("map_set", "MAP-SET", 2, 1, false);
	    declareFunction("cfasl_output_object_set_method", "CFASL-OUTPUT-OBJECT-SET-METHOD", 2, 0, false);
	    declareFunction("cfasl_output_set", "CFASL-OUTPUT-SET", 2, 0, false);
	    declareFunction("cfasl_input_set", "CFASL-INPUT-SET", 1, 0, false);
	    new set.$cfasl_input_set$UnaryFunction();
	    declareFunction("cfasl_input_legacy_set", "CFASL-INPUT-LEGACY-SET", 1, 0, false);
	    declareFunction("set_element_list", "SET-ELEMENT-LIST", 1, 0, false);
	    declareFunction("set_rebuild", "SET-REBUILD", 1, 0, false);
	}
	if (SubLFiles.USE_V2) {
	    declareFunction("get_set_change_op_test_case_set", "GET-SET-CHANGE-OP-TEST-CASE-SET", 1, 0, false);
	    declareFunction("set_set_change_op_test_case_set", "SET-SET-CHANGE-OP-TEST-CASE-SET", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_set_change_op_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SET-CHANGE-OP-TEST-CASE-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_set_change_op_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SET-CHANGE-OP-TEST-CASE-INSTANCE", 1, 0, false);
	    declareFunction("set_change_op_test_case_p", "SET-CHANGE-OP-TEST-CASE-P", 1, 0, false);
	    declareFunction("get_set_info_test_case_set", "GET-SET-INFO-TEST-CASE-SET", 1, 0, false);
	    declareFunction("set_set_info_test_case_set", "SET-SET-INFO-TEST-CASE-SET", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_set_info_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SET-INFO-TEST-CASE-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_set_info_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SET-INFO-TEST-CASE-INSTANCE", 1, 0, false);
	    declareFunction("set_info_test_case_p", "SET-INFO-TEST-CASE-P", 1, 0, false);
	    declareFunction("get_set_iterator_test_case_set", "GET-SET-ITERATOR-TEST-CASE-SET", 1, 0, false);
	    declareFunction("set_set_iterator_test_case_set", "SET-SET-ITERATOR-TEST-CASE-SET", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_set_iterator_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SET-ITERATOR-TEST-CASE-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_set_iterator_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SET-ITERATOR-TEST-CASE-INSTANCE", 1, 0, false);
	    declareFunction("set_iterator_test_case_p", "SET-ITERATOR-TEST-CASE-P", 1, 0, false);
	    declareFunction("get_set_map_test_case_set", "GET-SET-MAP-TEST-CASE-SET", 1, 0, false);
	    declareFunction("set_set_map_test_case_set", "SET-SET-MAP-TEST-CASE-SET", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_set_map_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SET-MAP-TEST-CASE-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_set_map_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SET-MAP-TEST-CASE-INSTANCE", 1, 0, false);
	    declareFunction("set_map_test_case_p", "SET-MAP-TEST-CASE-P", 1, 0, false);
	    declareFunction("get_set_kitchen_sink_test_case_set", "GET-SET-KITCHEN-SINK-TEST-CASE-SET", 1, 0, false);
	    declareFunction("set_set_kitchen_sink_test_case_set", "SET-SET-KITCHEN-SINK-TEST-CASE-SET", 2, 0, false);
	    declareFunction("subloop_reserved_initialize_set_kitchen_sink_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SET-KITCHEN-SINK-TEST-CASE-CLASS", 1, 0, false);
	    declareFunction("subloop_reserved_initialize_set_kitchen_sink_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SET-KITCHEN-SINK-TEST-CASE-INSTANCE", 1, 0, false);
	    declareFunction("set_kitchen_sink_test_case_p", "SET-KITCHEN-SINK-TEST-CASE-P", 1, 0, false);
	}
	return NIL;
    }

    public static SubLObject declare_set_file_Previous() {
	declareFunction("set_print_function_trampoline", "SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("set_p", "SET-P", 1, 0, false);
	new set.$set_p$UnaryFunction();
	declareFunction("set_struct_contents", "SET-STRUCT-CONTENTS", 1, 0, false);
	declareFunction("set_struct_test", "SET-STRUCT-TEST", 1, 0, false);
	declareFunction("_csetf_set_struct_contents", "_CSETF-SET-STRUCT-CONTENTS", 2, 0, false);
	declareFunction("_csetf_set_struct_test", "_CSETF-SET-STRUCT-TEST", 2, 0, false);
	declareFunction("make_set", "MAKE-SET", 0, 1, false);
	declareFunction("visit_defstruct_set", "VISIT-DEFSTRUCT-SET", 2, 0, false);
	declareFunction("visit_defstruct_object_set_method", "VISIT-DEFSTRUCT-OBJECT-SET-METHOD", 2, 0, false);
	declareFunction("print_set", "PRINT-SET", 3, 0, false);
	declareFunction("set_style", "SET-STYLE", 1, 0, false);
	declareFunction("new_set", "NEW-SET", 0, 2, false);
	declareFunction("copy_set", "COPY-SET", 1, 0, false);
	declareFunction("set_test", "SET-TEST", 1, 0, false);
	declareFunction("set_size", "SET-SIZE", 1, 0, false);
	declareFunction("set_emptyP", "SET-EMPTY?", 1, 0, false);
	declareFunction("set_or_list_emptyP", "SET-OR-LIST-EMPTY?", 1, 0, false);
	declareFunction("empty_set_p", "EMPTY-SET-P", 1, 0, false);
	declareFunction("non_empty_set_p", "NON-EMPTY-SET-P", 1, 0, false);
	declareFunction("set_memberP", "SET-MEMBER?", 2, 0, false);
	declareFunction("set_member_permissiveP", "SET-MEMBER-PERMISSIVE?", 2, 0, false);
	declareFunction("set_or_list_memberP", "SET-OR-LIST-MEMBER?", 2, 0, false);
	declareFunction("set_or_list_to_list", "SET-OR-LIST-TO-LIST", 1, 0, false);
	declareFunction("set_matching_element", "SET-MATCHING-ELEMENT", 2, 0, false);
	declareFunction("set_random_element", "SET-RANDOM-ELEMENT", 1, 0, false);
	declareFunction("set_add", "SET-ADD", 2, 0, false);
	declareFunction("set_remove", "SET-REMOVE", 2, 0, false);
	declareFunction("clear_set", "CLEAR-SET", 1, 0, false);
	declareFunction("new_set_iterator", "NEW-SET-ITERATOR", 1, 0, false);
	declareMacro("do_set", "DO-SET");
	declareMacro("do_set_permissive", "DO-SET-PERMISSIVE");
	declareMacro("do_set_or_list", "DO-SET-OR-LIST");
	declareFunction("do_set_internal", "DO-SET-INTERNAL", 1, 0, false);
	declareFunction("map_set", "MAP-SET", 2, 1, false);
	declareFunction("cfasl_output_object_set_method", "CFASL-OUTPUT-OBJECT-SET-METHOD", 2, 0, false);
	declareFunction("cfasl_output_set", "CFASL-OUTPUT-SET", 2, 0, false);
	declareFunction("cfasl_input_set", "CFASL-INPUT-SET", 1, 0, false);
	new set.$cfasl_input_set$UnaryFunction();
	declareFunction("cfasl_input_legacy_set", "CFASL-INPUT-LEGACY-SET", 1, 0, false);
	declareFunction("set_element_list", "SET-ELEMENT-LIST", 1, 0, false);
	declareFunction("set_rebuild", "SET-REBUILD", 1, 0, false);
	return NIL;
    }

    public static SubLObject init_set_file() {
	defconstant("*DTP-SET*", SET);
	deflexical("*NEW-SET-DEFAULT-TEST-FUNCTION*", symbol_function(EQL));
	defconstant("*CFASL-OPCODE-SET*", $int$60);
	defconstant("*CFASL-OPCODE-LEGACY-SET*", $int$67);
	return NIL;
    }

    public static final SubLObject setup_set_file_alt() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), symbol_function(SET_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(SET_STRUCT_CONTENTS, _CSETF_SET_STRUCT_CONTENTS);
	def_csetf(SET_STRUCT_TEST, _CSETF_SET_STRUCT_TEST);
	identity(SET);
	register_macro_helper(DO_SET_INTERNAL, DO_SET);
	register_cfasl_input_function($cfasl_opcode_set$.getGlobalValue(), CFASL_INPUT_SET);
	register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_SET_METHOD));
	register_cfasl_input_function($cfasl_opcode_legacy_set$.getGlobalValue(), CFASL_INPUT_LEGACY_SET);
	sunit_external.define_test_category($$$Set_Module_Supercategory, UNPROVIDED);
	sunit_external.define_test_category($str_alt41$Set_Module_Change_Operation_Subca, list($$$Set_Module_Supercategory));
	sunit_external.define_test_category($str_alt42$Set_Module_Information_Subcategor, list($$$Set_Module_Supercategory));
	sunit_external.define_test_category($$$Set_Module_Iterator_Subcategory, list($$$Set_Module_Supercategory));
	sunit_external.define_test_category($$$Set_Module_Mapping_Subcategory, list($$$Set_Module_Supercategory));
	sunit_external.define_test_category($str_alt45$Set_Module_Kitchen_Sink_Subcatego, list($$$Set_Module_Supercategory));
	sunit_external.define_test_suite($$$Set_Module_Testing_Suite, list($$$Set_Module_Supercategory), UNPROVIDED, UNPROVIDED);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SET_CHANGE_OP_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(SET_CHANGE_OP_TEST_CASE);
	classes.subloop_new_class(SET_CHANGE_OP_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt49);
	classes.class_set_implements_slot_listeners(SET_CHANGE_OP_TEST_CASE, NIL);
	classes.subloop_note_class_initialization_function(SET_CHANGE_OP_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_CHANGE_OP_TEST_CASE_CLASS);
	classes.subloop_note_instance_initialization_function(SET_CHANGE_OP_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_CHANGE_OP_TEST_CASE_INSTANCE);
	subloop_reserved_initialize_set_change_op_test_case_class(SET_CHANGE_OP_TEST_CASE);
	sunit_macros.define_test_case_postamble(SET_CHANGE_OP_TEST_CASE, $$$set, $$$cycl, $list_alt66);
	sunit_macros.def_test_method_register(SET_CHANGE_OP_TEST_CASE, SET_TEST_SETUP_TEST);
	sunit_macros.def_test_method_register(SET_CHANGE_OP_TEST_CASE, NEW_SET_TEST);
	sunit_macros.def_test_method_register(SET_CHANGE_OP_TEST_CASE, SET_ADD_TEST);
	sunit_macros.def_test_method_register(SET_CHANGE_OP_TEST_CASE, SET_REMOVE_TEST);
	sunit_macros.def_test_method_register(SET_CHANGE_OP_TEST_CASE, CLEAR_SET_TEST);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SET_INFO_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(SET_INFO_TEST_CASE);
	classes.subloop_new_class(SET_INFO_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt73);
	classes.class_set_implements_slot_listeners(SET_INFO_TEST_CASE, NIL);
	classes.subloop_note_class_initialization_function(SET_INFO_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_INFO_TEST_CASE_CLASS);
	classes.subloop_note_instance_initialization_function(SET_INFO_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_INFO_TEST_CASE_INSTANCE);
	subloop_reserved_initialize_set_info_test_case_class(SET_INFO_TEST_CASE);
	sunit_macros.define_test_case_postamble(SET_INFO_TEST_CASE, $$$set, $$$cycl, $list_alt76);
	sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, SET_TEST_TEST);
	sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, SET_SIZE_TEST);
	sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, SET_EMPTY_TEST);
	sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, EMPTY_SET_P_TEST);
	sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, NON_EMPTY_SET_P_TEST);
	sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, SET_MEMBER_TEST);
	sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, SET_MATCHING_ELEMENT_TEST);
	sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, SET_ELEMENT_LIST_TEST);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SET_ITERATOR_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(SET_ITERATOR_TEST_CASE);
	classes.subloop_new_class(SET_ITERATOR_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt86);
	classes.class_set_implements_slot_listeners(SET_ITERATOR_TEST_CASE, NIL);
	classes.subloop_note_class_initialization_function(SET_ITERATOR_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_ITERATOR_TEST_CASE_CLASS);
	classes.subloop_note_instance_initialization_function(SET_ITERATOR_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_ITERATOR_TEST_CASE_INSTANCE);
	subloop_reserved_initialize_set_iterator_test_case_class(SET_ITERATOR_TEST_CASE);
	sunit_macros.define_test_case_postamble(SET_ITERATOR_TEST_CASE, $$$set, $$$cycl, $list_alt89);
	sunit_macros.def_test_method_register(SET_ITERATOR_TEST_CASE, NEW_SET_ITERATOR_TEST);
	sunit_macros.def_test_method_register(SET_ITERATOR_TEST_CASE, DO_SET_TEST);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SET_MAP_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(SET_MAP_TEST_CASE);
	classes.subloop_new_class(SET_MAP_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt93);
	classes.class_set_implements_slot_listeners(SET_MAP_TEST_CASE, NIL);
	classes.subloop_note_class_initialization_function(SET_MAP_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_MAP_TEST_CASE_CLASS);
	classes.subloop_note_instance_initialization_function(SET_MAP_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_MAP_TEST_CASE_INSTANCE);
	subloop_reserved_initialize_set_map_test_case_class(SET_MAP_TEST_CASE);
	sunit_macros.define_test_case_postamble(SET_MAP_TEST_CASE, $$$set, $$$cycl, $list_alt96);
	sunit_macros.def_test_method_register(SET_MAP_TEST_CASE, TEST);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SET_KITCHEN_SINK_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(SET_KITCHEN_SINK_TEST_CASE);
	classes.subloop_new_class(SET_KITCHEN_SINK_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt99);
	classes.class_set_implements_slot_listeners(SET_KITCHEN_SINK_TEST_CASE, NIL);
	classes.subloop_note_class_initialization_function(SET_KITCHEN_SINK_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_KITCHEN_SINK_TEST_CASE_CLASS);
	classes.subloop_note_instance_initialization_function(SET_KITCHEN_SINK_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_KITCHEN_SINK_TEST_CASE_INSTANCE);
	subloop_reserved_initialize_set_kitchen_sink_test_case_class(SET_KITCHEN_SINK_TEST_CASE);
	sunit_macros.define_test_case_postamble(SET_KITCHEN_SINK_TEST_CASE, $$$set, $$$cycl, $list_alt102);
	sunit_macros.def_test_method_register(SET_KITCHEN_SINK_TEST_CASE, KITCHEN_SINK_TEST);
	return NIL;
    }

    public static SubLObject setup_set_file() {
	if (SubLFiles.USE_V1) {
	    register_method($print_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), symbol_function(SET_PRINT_FUNCTION_TRAMPOLINE));
	    SubLSpecialOperatorDeclarations.proclaim($list9);
	    def_csetf(SET_STRUCT_CONTENTS, _CSETF_SET_STRUCT_CONTENTS);
	    def_csetf(SET_STRUCT_TEST, _CSETF_SET_STRUCT_TEST);
	    identity(SET);
	    register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SET_METHOD));
	    register_macro_helper(DO_SET_INTERNAL, DO_SET);
	    register_cfasl_input_function($cfasl_opcode_set$.getGlobalValue(), CFASL_INPUT_SET);
	    register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_SET_METHOD));
	    register_cfasl_input_function($cfasl_opcode_legacy_set$.getGlobalValue(), CFASL_INPUT_LEGACY_SET);
	    sunit_external.define_test_category($$$Set_Module_Supercategory, UNPROVIDED);
	    sunit_external.define_test_category($str67$Set_Module_Change_Operation_Subca, list($$$Set_Module_Supercategory));
	    sunit_external.define_test_category($str68$Set_Module_Information_Subcategor, list($$$Set_Module_Supercategory));
	    sunit_external.define_test_category($$$Set_Module_Iterator_Subcategory, list($$$Set_Module_Supercategory));
	    sunit_external.define_test_category($$$Set_Module_Mapping_Subcategory, list($$$Set_Module_Supercategory));
	    sunit_external.define_test_category($str71$Set_Module_Kitchen_Sink_Subcatego, list($$$Set_Module_Supercategory));
	    sunit_external.define_test_suite($$$Set_Module_Testing_Suite, list($$$Set_Module_Supercategory), UNPROVIDED, UNPROVIDED);
	}
	if (SubLFiles.USE_V2) {
	    sunit_external.define_test_category($str_alt41$Set_Module_Change_Operation_Subca, list($$$Set_Module_Supercategory));
	    sunit_external.define_test_category($str_alt42$Set_Module_Information_Subcategor, list($$$Set_Module_Supercategory));
	    sunit_external.define_test_category($str_alt45$Set_Module_Kitchen_Sink_Subcatego, list($$$Set_Module_Supercategory));
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SET_CHANGE_OP_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(SET_CHANGE_OP_TEST_CASE);
	    classes.subloop_new_class(SET_CHANGE_OP_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt49);
	    classes.class_set_implements_slot_listeners(SET_CHANGE_OP_TEST_CASE, NIL);
	    classes.subloop_note_class_initialization_function(SET_CHANGE_OP_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_CHANGE_OP_TEST_CASE_CLASS);
	    classes.subloop_note_instance_initialization_function(SET_CHANGE_OP_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_CHANGE_OP_TEST_CASE_INSTANCE);
	    subloop_reserved_initialize_set_change_op_test_case_class(SET_CHANGE_OP_TEST_CASE);
	    sunit_macros.define_test_case_postamble(SET_CHANGE_OP_TEST_CASE, $$$set, $$$cycl, $list_alt66);
	    sunit_macros.def_test_method_register(SET_CHANGE_OP_TEST_CASE, SET_TEST_SETUP_TEST);
	    sunit_macros.def_test_method_register(SET_CHANGE_OP_TEST_CASE, NEW_SET_TEST);
	    sunit_macros.def_test_method_register(SET_CHANGE_OP_TEST_CASE, SET_ADD_TEST);
	    sunit_macros.def_test_method_register(SET_CHANGE_OP_TEST_CASE, SET_REMOVE_TEST);
	    sunit_macros.def_test_method_register(SET_CHANGE_OP_TEST_CASE, CLEAR_SET_TEST);
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SET_INFO_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(SET_INFO_TEST_CASE);
	    classes.subloop_new_class(SET_INFO_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt73);
	    classes.class_set_implements_slot_listeners(SET_INFO_TEST_CASE, NIL);
	    classes.subloop_note_class_initialization_function(SET_INFO_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_INFO_TEST_CASE_CLASS);
	    classes.subloop_note_instance_initialization_function(SET_INFO_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_INFO_TEST_CASE_INSTANCE);
	    subloop_reserved_initialize_set_info_test_case_class(SET_INFO_TEST_CASE);
	    sunit_macros.define_test_case_postamble(SET_INFO_TEST_CASE, $$$set, $$$cycl, $list_alt76);
	    sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, SET_TEST_TEST);
	    sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, SET_SIZE_TEST);
	    sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, SET_EMPTY_TEST);
	    sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, EMPTY_SET_P_TEST);
	    sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, NON_EMPTY_SET_P_TEST);
	    sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, SET_MEMBER_TEST);
	    sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, SET_MATCHING_ELEMENT_TEST);
	    sunit_macros.def_test_method_register(SET_INFO_TEST_CASE, SET_ELEMENT_LIST_TEST);
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SET_ITERATOR_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(SET_ITERATOR_TEST_CASE);
	    classes.subloop_new_class(SET_ITERATOR_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt86);
	    classes.class_set_implements_slot_listeners(SET_ITERATOR_TEST_CASE, NIL);
	    classes.subloop_note_class_initialization_function(SET_ITERATOR_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_ITERATOR_TEST_CASE_CLASS);
	    classes.subloop_note_instance_initialization_function(SET_ITERATOR_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_ITERATOR_TEST_CASE_INSTANCE);
	    subloop_reserved_initialize_set_iterator_test_case_class(SET_ITERATOR_TEST_CASE);
	    sunit_macros.define_test_case_postamble(SET_ITERATOR_TEST_CASE, $$$set, $$$cycl, $list_alt89);
	    sunit_macros.def_test_method_register(SET_ITERATOR_TEST_CASE, NEW_SET_ITERATOR_TEST);
	    sunit_macros.def_test_method_register(SET_ITERATOR_TEST_CASE, DO_SET_TEST);
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SET_MAP_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(SET_MAP_TEST_CASE);
	    classes.subloop_new_class(SET_MAP_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt93);
	    classes.class_set_implements_slot_listeners(SET_MAP_TEST_CASE, NIL);
	    classes.subloop_note_class_initialization_function(SET_MAP_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_MAP_TEST_CASE_CLASS);
	    classes.subloop_note_instance_initialization_function(SET_MAP_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_MAP_TEST_CASE_INSTANCE);
	    subloop_reserved_initialize_set_map_test_case_class(SET_MAP_TEST_CASE);
	    sunit_macros.define_test_case_postamble(SET_MAP_TEST_CASE, $$$set, $$$cycl, $list_alt96);
	    sunit_macros.def_test_method_register(SET_MAP_TEST_CASE, TEST);
	    sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SET_KITCHEN_SINK_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	    sunit_macros.define_test_case_preamble(SET_KITCHEN_SINK_TEST_CASE);
	    classes.subloop_new_class(SET_KITCHEN_SINK_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt99);
	    classes.class_set_implements_slot_listeners(SET_KITCHEN_SINK_TEST_CASE, NIL);
	    classes.subloop_note_class_initialization_function(SET_KITCHEN_SINK_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_KITCHEN_SINK_TEST_CASE_CLASS);
	    classes.subloop_note_instance_initialization_function(SET_KITCHEN_SINK_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SET_KITCHEN_SINK_TEST_CASE_INSTANCE);
	    subloop_reserved_initialize_set_kitchen_sink_test_case_class(SET_KITCHEN_SINK_TEST_CASE);
	    sunit_macros.define_test_case_postamble(SET_KITCHEN_SINK_TEST_CASE, $$$set, $$$cycl, $list_alt102);
	    sunit_macros.def_test_method_register(SET_KITCHEN_SINK_TEST_CASE, KITCHEN_SINK_TEST);
	}
	return NIL;
    }

    public static SubLObject setup_set_file_Previous() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), symbol_function(SET_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list9);
	def_csetf(SET_STRUCT_CONTENTS, _CSETF_SET_STRUCT_CONTENTS);
	def_csetf(SET_STRUCT_TEST, _CSETF_SET_STRUCT_TEST);
	identity(SET);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SET_METHOD));
	register_macro_helper(DO_SET_INTERNAL, DO_SET);
	register_cfasl_input_function($cfasl_opcode_set$.getGlobalValue(), CFASL_INPUT_SET);
	register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_SET_METHOD));
	register_cfasl_input_function($cfasl_opcode_legacy_set$.getGlobalValue(), CFASL_INPUT_LEGACY_SET);
	sunit_external.define_test_category($$$Set_Module_Supercategory, UNPROVIDED);
	sunit_external.define_test_category($str67$Set_Module_Change_Operation_Subca, list($$$Set_Module_Supercategory));
	sunit_external.define_test_category($str68$Set_Module_Information_Subcategor, list($$$Set_Module_Supercategory));
	sunit_external.define_test_category($$$Set_Module_Iterator_Subcategory, list($$$Set_Module_Supercategory));
	sunit_external.define_test_category($$$Set_Module_Mapping_Subcategory, list($$$Set_Module_Supercategory));
	sunit_external.define_test_category($str71$Set_Module_Kitchen_Sink_Subcatego, list($$$Set_Module_Supercategory));
	sunit_external.define_test_suite($$$Set_Module_Testing_Suite, list($$$Set_Module_Supercategory), UNPROVIDED, UNPROVIDED);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_set_file();
    }

    @Override
    public void initializeVariables() {
	init_set_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_set_file();
    }

    static {
    }

    public static final class $set_p$UnaryFunction extends UnaryFunction {
	public $set_p$UnaryFunction() {
	    super(extractFunctionNamed("SET-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return set_p(arg1);
	}
    }

    public static final class $cfasl_input_set$UnaryFunction extends UnaryFunction {
	public $cfasl_input_set$UnaryFunction() {
	    super(extractFunctionNamed("CFASL-INPUT-SET"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return cfasl_input_set(arg1);
	}
    }

    static private final SubLList $list_alt3 = list(makeSymbol("CONTENTS"), makeSymbol("TEST"));

    static private final SubLList $list_alt4 = list(makeKeyword("CONTENTS"), $TEST);

    static private final SubLList $list_alt5 = list(makeSymbol("SET-STRUCT-CONTENTS"), makeSymbol("SET-STRUCT-TEST"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-SET-STRUCT-CONTENTS"), makeSymbol("_CSETF-SET-STRUCT-TEST"));

    static private final SubLString $str_alt15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt16$__ = makeString("#<");

    static private final SubLString $str_alt18$_ = makeString("(");

    static private final SubLString $str_alt19$_ = makeString(" ");

    static private final SubLString $str_alt20$_ = makeString(")");

    static private final SubLString $str_alt21$_size_ = makeString(" size=");

    static private final SubLList $list_alt28 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SET"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt29 = list($DONE);

    static private final SubLString $str_alt41$Set_Module_Change_Operation_Subca = makeString("Set Module Change Operation Subcategory");

    static private final SubLString $str_alt42$Set_Module_Information_Subcategor = makeString("Set Module Information Subcategory");

    static private final SubLString $str_alt45$Set_Module_Kitchen_Sink_Subcatego = makeString("Set Module Kitchen Sink Subcategory");

    private static final SubLSymbol SET_CHANGE_OP_TEST_CASE = makeSymbol("SET-CHANGE-OP-TEST-CASE");

    static private final SubLList $list_alt49 = list(list(makeSymbol("SET"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TEST-SETUP-TEST"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-SET-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ADD-TEST"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REMOVE-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-SET-TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SET_CHANGE_OP_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SET-CHANGE-OP-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SET_CHANGE_OP_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SET-CHANGE-OP-TEST-CASE-INSTANCE");

    static private final SubLString $$$set = makeString("set");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt66 = list(makeString("Set Module Change Operation Subcategory"));

    private static final SubLSymbol SET_TEST_SETUP_TEST = makeSymbol("SET-TEST-SETUP-TEST");

    private static final SubLSymbol NEW_SET_TEST = makeSymbol("NEW-SET-TEST");

    private static final SubLSymbol SET_ADD_TEST = makeSymbol("SET-ADD-TEST");

    private static final SubLSymbol SET_REMOVE_TEST = makeSymbol("SET-REMOVE-TEST");

    private static final SubLSymbol CLEAR_SET_TEST = makeSymbol("CLEAR-SET-TEST");

    private static final SubLSymbol SET_INFO_TEST_CASE = makeSymbol("SET-INFO-TEST-CASE");

    static private final SubLList $list_alt73 = list(
	    new SubLObject[] { list(makeSymbol("SET"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")),
		    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TEST-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SIZE-TEST"), NIL, makeKeyword("PROTECTED")),
		    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EMPTY-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-SET-P-TEST"), NIL, makeKeyword("PROTECTED")),
		    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NON-EMPTY-SET-P-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MEMBER-TEST"), NIL, makeKeyword("PROTECTED")),
		    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MATCHING-ELEMENT-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-LIST-TEST"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SET_INFO_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SET-INFO-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SET_INFO_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SET-INFO-TEST-CASE-INSTANCE");

    static private final SubLList $list_alt76 = list(makeString("Set Module Information Subcategory"));

    private static final SubLSymbol SET_TEST_TEST = makeSymbol("SET-TEST-TEST");

    private static final SubLSymbol SET_SIZE_TEST = makeSymbol("SET-SIZE-TEST");

    private static final SubLSymbol SET_EMPTY_TEST = makeSymbol("SET-EMPTY-TEST");

    private static final SubLSymbol EMPTY_SET_P_TEST = makeSymbol("EMPTY-SET-P-TEST");

    private static final SubLSymbol NON_EMPTY_SET_P_TEST = makeSymbol("NON-EMPTY-SET-P-TEST");

    private static final SubLSymbol SET_MEMBER_TEST = makeSymbol("SET-MEMBER-TEST");

    private static final SubLSymbol SET_MATCHING_ELEMENT_TEST = makeSymbol("SET-MATCHING-ELEMENT-TEST");

    private static final SubLSymbol SET_ELEMENT_LIST_TEST = makeSymbol("SET-ELEMENT-LIST-TEST");

    private static final SubLSymbol SET_ITERATOR_TEST_CASE = makeSymbol("SET-ITERATOR-TEST-CASE");

    static private final SubLList $list_alt86 = list(list(makeSymbol("SET"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-SET-ITERATOR-TEST"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DO-SET-TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SET_ITERATOR_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SET-ITERATOR-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SET_ITERATOR_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SET-ITERATOR-TEST-CASE-INSTANCE");

    static private final SubLList $list_alt89 = list(makeString("Set Module Iterator Subcategory"));

    private static final SubLSymbol NEW_SET_ITERATOR_TEST = makeSymbol("NEW-SET-ITERATOR-TEST");

    private static final SubLSymbol DO_SET_TEST = makeSymbol("DO-SET-TEST");

    private static final SubLSymbol SET_MAP_TEST_CASE = makeSymbol("SET-MAP-TEST-CASE");

    static private final SubLList $list_alt93 = list(list(makeSymbol("SET"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SET_MAP_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SET-MAP-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SET_MAP_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SET-MAP-TEST-CASE-INSTANCE");

    static private final SubLList $list_alt96 = list(makeString("Set Module Mapping Subcategory"));

    private static final SubLSymbol SET_KITCHEN_SINK_TEST_CASE = makeSymbol("SET-KITCHEN-SINK-TEST-CASE");

    static private final SubLList $list_alt99 = list(list(makeSymbol("SET"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KITCHEN-SINK-TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SET_KITCHEN_SINK_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SET-KITCHEN-SINK-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SET_KITCHEN_SINK_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SET-KITCHEN-SINK-TEST-CASE-INSTANCE");

    static private final SubLList $list_alt102 = list(makeString("Set Module Kitchen Sink Subcategory"));

    private static final SubLSymbol KITCHEN_SINK_TEST = makeSymbol("KITCHEN-SINK-TEST");
}

/**
 * Total time: 207 ms
 */
