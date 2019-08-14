/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_encoding_stream_encoding;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_raw_write_byte;
import static com.cyc.cycjava.cycl.cfasl.close_cfasl_decoding_stream;
import static com.cyc.cycjava.cycl.cfasl.close_cfasl_encoding_stream;
import static com.cyc.cycjava.cycl.cfasl.new_cfasl_decoding_stream;
import static com.cyc.cycjava.cycl.cfasl.new_cfasl_encoding_stream;
import static com.cyc.cycjava.cycl.cfasl.register_cfasl_input_function;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      BAG
 * source file: /cyc/top/cycl/bag.lisp
 * created:     2019/07/03 17:37:14
 */
public final class bag extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final class $bag_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.bag.$bag_native.this.$unique_contents;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.bag.$bag_native.this.$repeat_contents;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.bag.$bag_native.this.$repeat_size;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.bag.$bag_native.this.$test;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.bag.$bag_native.this.$unique_contents = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.bag.$bag_native.this.$repeat_contents = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.bag.$bag_native.this.$repeat_size = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.bag.$bag_native.this.$test = value;
        }

        public SubLObject $unique_contents = Lisp.NIL;

        public SubLObject $repeat_contents = Lisp.NIL;

        public SubLObject $repeat_size = Lisp.NIL;

        public SubLObject $test = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.bag.$bag_native.class, BAG, BAG_P, $list_alt3, $list_alt4, new String[]{ "$unique_contents", "$repeat_contents", "$repeat_size", "$test" }, $list_alt5, $list_alt6, PRINT_BAG);
    }

    public static final SubLFile me = new bag();

 public static final String myName = "com.cyc.cycjava.cycl.bag";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_bag$ = makeSymbol("*DTP-BAG*");

    // deflexical
    /**
     *
     *
     * @unknown there is no empirical evidence for this number yet,
    this is based on back of the envelope math
     */
    @LispMethod(comment = "@unknown there is no empirical evidence for this number yet,\r\nthis is based on back of the envelope math\ndeflexical")
    private static final SubLSymbol $bag_repeat_contents_iterator_watermark$ = makeSymbol("*BAG-REPEAT-CONTENTS-ITERATOR-WATERMARK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $new_bag_default_test_function$ = makeSymbol("*NEW-BAG-DEFAULT-TEST-FUNCTION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_opcode_bag$ = makeSymbol("*CFASL-OPCODE-BAG*");

    private static final SubLSymbol BAG_P = makeSymbol("BAG-P");

    private static final SubLInteger $int$138 = makeInteger(138);

    static private final SubLList $list3 = list(makeSymbol("UNIQUE-CONTENTS"), makeSymbol("REPEAT-CONTENTS"), makeSymbol("REPEAT-SIZE"), makeSymbol("TEST"));

    static private final SubLList $list4 = list(makeKeyword("UNIQUE-CONTENTS"), makeKeyword("REPEAT-CONTENTS"), makeKeyword("REPEAT-SIZE"), $TEST);

    static private final SubLList $list5 = list(makeSymbol("BAG-STRUCT-UNIQUE-CONTENTS"), makeSymbol("BAG-STRUCT-REPEAT-CONTENTS"), makeSymbol("BAG-STRUCT-REPEAT-SIZE"), makeSymbol("BAG-STRUCT-TEST"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-BAG-STRUCT-UNIQUE-CONTENTS"), makeSymbol("_CSETF-BAG-STRUCT-REPEAT-CONTENTS"), makeSymbol("_CSETF-BAG-STRUCT-REPEAT-SIZE"), makeSymbol("_CSETF-BAG-STRUCT-TEST"));

    private static final SubLSymbol PRINT_BAG = makeSymbol("PRINT-BAG");

    private static final SubLSymbol BAG_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BAG-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("BAG-P"));

    private static final SubLSymbol BAG_STRUCT_UNIQUE_CONTENTS = makeSymbol("BAG-STRUCT-UNIQUE-CONTENTS");

    private static final SubLSymbol _CSETF_BAG_STRUCT_UNIQUE_CONTENTS = makeSymbol("_CSETF-BAG-STRUCT-UNIQUE-CONTENTS");

    private static final SubLSymbol BAG_STRUCT_REPEAT_CONTENTS = makeSymbol("BAG-STRUCT-REPEAT-CONTENTS");

    private static final SubLSymbol _CSETF_BAG_STRUCT_REPEAT_CONTENTS = makeSymbol("_CSETF-BAG-STRUCT-REPEAT-CONTENTS");

    private static final SubLSymbol BAG_STRUCT_REPEAT_SIZE = makeSymbol("BAG-STRUCT-REPEAT-SIZE");

    private static final SubLSymbol _CSETF_BAG_STRUCT_REPEAT_SIZE = makeSymbol("_CSETF-BAG-STRUCT-REPEAT-SIZE");

    private static final SubLSymbol BAG_STRUCT_TEST = makeSymbol("BAG-STRUCT-TEST");

    private static final SubLSymbol _CSETF_BAG_STRUCT_TEST = makeSymbol("_CSETF-BAG-STRUCT-TEST");

    private static final SubLString $str22$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_BAG = makeSymbol("MAKE-BAG");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_BAG_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-BAG-METHOD");

    private static final SubLString $str28$_ = makeString("(");

    private static final SubLString $$$_impl_ = makeString(" impl ");

    private static final SubLString $str30$__ = makeString("//");

    private static final SubLString $str31$_ = makeString(")");

    private static final SubLString $str32$_size_ = makeString(" size=");

    private static final SubLList $list33 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("ELEMENT-COUNT"), makeSymbol("BAG-REPEAT-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list34 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DO_DICTIONARY_CONTENTS = makeSymbol("DO-DICTIONARY-CONTENTS");

    private static final SubLList $list38 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("BAG-REPEAT-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym39$CURR_ELEMENT = makeUninternedSymbol("CURR-ELEMENT");

    private static final SubLSymbol $sym40$ELEMENT_COUNT = makeUninternedSymbol("ELEMENT-COUNT");

    private static final SubLSymbol $sym41$INDEX = makeUninternedSymbol("INDEX");

    private static final SubLSymbol DO_BAG_REPEAT_CONTENTS_UNIQUE = makeSymbol("DO-BAG-REPEAT-CONTENTS-UNIQUE");

    private static final SubLList $list45 = list(makeSymbol("TIMES"), makeSymbol("ELEMENT"), makeSymbol("CONTENTS-ITERATOR"));

    static private final SubLList $list47 = list(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLSymbol ITERATE_BAG_NEXT = makeSymbol("ITERATE-BAG-NEXT");

    private static final SubLSymbol ITERATE_BAG_DONE = makeSymbol("ITERATE-BAG-DONE");

    private static final SubLList $list50 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("BAG-UNIQUE-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list55 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("ELEMENT-COUNT"), makeSymbol("BAG"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_BAG_REPEAT_INTERNAL = makeSymbol("DO-BAG-REPEAT-INTERNAL");

    static private final SubLList $list59 = list(ONE_INTEGER);

    private static final SubLSymbol DO_BAG_UNIQUE_CONTENTS = makeSymbol("DO-BAG-UNIQUE-CONTENTS");

    private static final SubLSymbol DO_BAG_UNIQUE_INTERNAL = makeSymbol("DO-BAG-UNIQUE-INTERNAL");

    private static final SubLList $list62 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("BAG"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym63$CURRENT_ELEMENT = makeUninternedSymbol("CURRENT-ELEMENT");

    private static final SubLSymbol $sym64$INDEX = makeUninternedSymbol("INDEX");

    private static final SubLSymbol $sym65$ELEMENT_COUNT = makeUninternedSymbol("ELEMENT-COUNT");

    private static final SubLSymbol DO_BAG_UNIQUE = makeSymbol("DO-BAG-UNIQUE");

    private static final SubLInteger $int$62 = makeInteger(62);

    private static final SubLSymbol CFASL_INPUT_BAG = makeSymbol("CFASL-INPUT-BAG");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_BAG_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-BAG-METHOD");

    private static final SubLString $str70$CFASL_loaded_bag__A_does_not_have = makeString("CFASL-loaded bag ~A does not have the needed number of unique elements ~A.");

    private static final SubLString $str71$CFASL_loaded_bag__A_has_more_than = makeString("CFASL-loaded bag ~A has more than the expected unumber of unique elements ~A.");

    private static final SubLString $str72$CFASL_loaded_bag__A_does_not_repr = makeString("CFASL-loaded bag ~A does not represent the expected number of total elements ~A.");

    private static final SubLSymbol BAG_UNIT_TEST_KITCHEN_SINK = makeSymbol("BAG-UNIT-TEST-KITCHEN-SINK");

    private static final SubLList $list79 = list(list(list(list(makeKeyword("RED"), $BLUE, makeKeyword("GREEN"), makeKeyword("YELLOW"), makeKeyword("WHITE"), makeKeyword("BROWN"), makeKeyword("BLACK")), TEN_INTEGER), makeKeyword("SUCCESS")), list(list(list(makeKeyword("RED"), $BLUE, makeKeyword("GREEN"), makeKeyword("YELLOW"), makeKeyword("WHITE"), makeKeyword("BROWN"), makeKeyword("BLACK")), ONE_INTEGER), makeKeyword("SUCCESS")));

    private static final SubLString $$$bag_not_empty = makeString("bag not empty");

    private static final SubLString $str81$bag_size____item_count = makeString("bag size != item count");

    private static final SubLString $str82$bag_member_count_out_of_whack = makeString("bag member-count out of whack");

    private static final SubLString $$$added_bag_members_not_findable = makeString("added bag members not findable");

    private static final SubLString $$$cannot_find_existing_member_again = makeString("cannot find existing member again");

    private static final SubLString $str85$do_bag_existing_element_not_there = makeString("do-bag existing element not there often enough");

    private static final SubLString $str86$do_list_existing_element_not_ther = makeString("do-list existing element not there often enough");

    private static final SubLString $str87$iterator_existing_element_not_the = makeString("iterator existing element not there often enough");

    private static final SubLString $$$unique_element_list_wrong = makeString("unique element list wrong");

    private static final SubLList $list89 = cons(makeSymbol("ELEMENT"), makeSymbol("ELEMENT-COUNT"));

    private static final SubLString $str90$bag_element_count_tuple_contains_ = makeString("bag-element-count tuple contains bad element");

    private static final SubLString $str91$bag_element_count_tuple_contains_ = makeString("bag-element-count tuple contains bad count");

    private static final SubLString $$$list_of_elements_has_bogus_length = makeString("list of elements has bogus length");

    private static final SubLString $str93$CFASLed_bag_has_different_size_ = makeString("CFASLed bag has different size.");

    private static final SubLString $str94$CFASLed_bag_has_different_unique_ = makeString("CFASLed bag has different unique size.");

    private static final SubLString $str95$CFASLed_bag_does_not_contain_elem = makeString("CFASLed bag does not contain element.");

    private static final SubLString $str96$CFASLed_bag_does_not_contain_elem = makeString("CFASLed bag does not contain element as often.");

    private static final SubLString $str97$removing_items_whacks_bag_size = makeString("removing items whacks bag-size");

    private static final SubLString $str98$removing_items_whacks_member_coun = makeString("removing items whacks member count");

    private static final SubLString $$$emptied_bag_is_not_empty = makeString("emptied bag is not empty");

    public static final SubLObject bag_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_bag(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject bag_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_bag(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject bag_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.bag.$bag_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject bag_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.bag.$bag_native.class ? T : NIL;
    }

    public static final SubLObject bag_struct_unique_contents_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BAG_P);
        return v_object.getField2();
    }

    public static SubLObject bag_struct_unique_contents(final SubLObject v_object) {
        assert NIL != bag_p(v_object) : "! bag.bag_p(v_object) " + "bag.bag_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject bag_struct_repeat_contents_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BAG_P);
        return v_object.getField3();
    }

    public static SubLObject bag_struct_repeat_contents(final SubLObject v_object) {
        assert NIL != bag_p(v_object) : "! bag.bag_p(v_object) " + "bag.bag_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject bag_struct_repeat_size_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BAG_P);
        return v_object.getField4();
    }

    public static SubLObject bag_struct_repeat_size(final SubLObject v_object) {
        assert NIL != bag_p(v_object) : "! bag.bag_p(v_object) " + "bag.bag_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject bag_struct_test_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BAG_P);
        return v_object.getField5();
    }

    public static SubLObject bag_struct_test(final SubLObject v_object) {
        assert NIL != bag_p(v_object) : "! bag.bag_p(v_object) " + "bag.bag_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_bag_struct_unique_contents_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BAG_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_bag_struct_unique_contents(final SubLObject v_object, final SubLObject value) {
        assert NIL != bag_p(v_object) : "! bag.bag_p(v_object) " + "bag.bag_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_bag_struct_repeat_contents_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BAG_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_bag_struct_repeat_contents(final SubLObject v_object, final SubLObject value) {
        assert NIL != bag_p(v_object) : "! bag.bag_p(v_object) " + "bag.bag_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_bag_struct_repeat_size_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BAG_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_bag_struct_repeat_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != bag_p(v_object) : "! bag.bag_p(v_object) " + "bag.bag_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_bag_struct_test_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BAG_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_bag_struct_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != bag_p(v_object) : "! bag.bag_p(v_object) " + "bag.bag_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_bag_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.bag.$bag_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($UNIQUE_CONTENTS)) {
                        _csetf_bag_struct_unique_contents(v_new, current_value);
                    } else {
                        if (pcase_var.eql($REPEAT_CONTENTS)) {
                            _csetf_bag_struct_repeat_contents(v_new, current_value);
                        } else {
                            if (pcase_var.eql($REPEAT_SIZE)) {
                                _csetf_bag_struct_repeat_size(v_new, current_value);
                            } else {
                                if (pcase_var.eql($TEST)) {
                                    _csetf_bag_struct_test(v_new, current_value);
                                } else {
                                    Errors.error($str_alt21$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_bag(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.bag.$bag_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($UNIQUE_CONTENTS)) {
                _csetf_bag_struct_unique_contents(v_new, current_value);
            } else
                if (pcase_var.eql($REPEAT_CONTENTS)) {
                    _csetf_bag_struct_repeat_contents(v_new, current_value);
                } else
                    if (pcase_var.eql($REPEAT_SIZE)) {
                        _csetf_bag_struct_repeat_size(v_new, current_value);
                    } else
                        if (pcase_var.eql($TEST)) {
                            _csetf_bag_struct_test(v_new, current_value);
                        } else {
                            Errors.error($str22$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_bag(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_BAG, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $UNIQUE_CONTENTS, bag_struct_unique_contents(obj));
        funcall(visitor_fn, obj, $SLOT, $REPEAT_CONTENTS, bag_struct_repeat_contents(obj));
        funcall(visitor_fn, obj, $SLOT, $REPEAT_SIZE, bag_struct_repeat_size(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST, bag_struct_test(obj));
        funcall(visitor_fn, obj, $END, MAKE_BAG, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_bag_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_bag(obj, visitor_fn);
    }

    public static final SubLObject print_bag_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt22$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    write_string($str_alt24$_, stream, UNPROVIDED, UNPROVIDED);
                    princ(hash_table_utilities.hash_test_to_symbol(bag_struct_test(v_object)), stream);
                    write_string($str_alt25$_impl_, stream, UNPROVIDED, UNPROVIDED);
                    princ(set_contents.set_contents_style(bag_struct_unique_contents(v_object)), stream);
                    write_string($str_alt26$__, stream, UNPROVIDED, UNPROVIDED);
                    princ(dictionary_contents.dictionary_contents_style(bag_struct_repeat_contents(v_object)), stream);
                    write_string($str_alt27$_, stream, UNPROVIDED, UNPROVIDED);
                    write_string($str_alt28$_size_, stream, UNPROVIDED, UNPROVIDED);
                    princ(bag_size(v_object), stream);
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_bag(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($str28$_, stream, UNPROVIDED, UNPROVIDED);
            princ(hash_table_utilities.hash_test_to_symbol(bag_struct_test(v_object)), stream);
            write_string($$$_impl_, stream, UNPROVIDED, UNPROVIDED);
            princ(set_contents.set_contents_style(bag_struct_unique_contents(v_object)), stream);
            write_string($str30$__, stream, UNPROVIDED, UNPROVIDED);
            princ(dictionary_contents.dictionary_contents_style(bag_struct_repeat_contents(v_object)), stream);
            write_string($str31$_, stream, UNPROVIDED, UNPROVIDED);
            write_string($str32$_size_, stream, UNPROVIDED, UNPROVIDED);
            princ(bag_size(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    /**
     * Allocate a new bag with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     *
     * @return bag-p
     */
    @LispMethod(comment = "Allocate a new bag with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\n\r\n@return bag-p\nAllocate a new bag with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.")
    public static final SubLObject make_new_bag_alt(SubLObject test, SubLObject repeat_size, SubLObject unique_contents, SubLObject repeat_contents) {
        {
            SubLObject v_bag = make_bag(UNPROVIDED);
            _csetf_bag_struct_test(v_bag, test);
            _csetf_bag_struct_repeat_size(v_bag, repeat_size);
            _csetf_bag_struct_repeat_contents(v_bag, repeat_contents);
            _csetf_bag_struct_unique_contents(v_bag, unique_contents);
            return v_bag;
        }
    }

    /**
     * Allocate a new bag with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     *
     * @return bag-p
     */
    @LispMethod(comment = "Allocate a new bag with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\n\r\n@return bag-p\nAllocate a new bag with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.")
    public static SubLObject make_new_bag(final SubLObject test, final SubLObject repeat_size, final SubLObject unique_contents, final SubLObject repeat_contents) {
        final SubLObject v_bag = make_bag(UNPROVIDED);
        _csetf_bag_struct_test(v_bag, test);
        _csetf_bag_struct_repeat_size(v_bag, repeat_size);
        _csetf_bag_struct_repeat_contents(v_bag, repeat_contents);
        _csetf_bag_struct_unique_contents(v_bag, unique_contents);
        return v_bag;
    }

    public static final SubLObject new_bag_repeat_contents_alt(SubLObject size, SubLObject test) {
        return dictionary_contents.new_dictionary_contents(size, test);
    }

    public static SubLObject new_bag_repeat_contents(final SubLObject size, final SubLObject test) {
        return dictionary_contents.new_dictionary_contents(size, test);
    }

    public static final SubLObject copy_bag_repeat_contents_alt(SubLObject bag_repeat_contents) {
        return dictionary_contents.copy_dictionary_contents(bag_repeat_contents);
    }

    public static SubLObject copy_bag_repeat_contents(final SubLObject bag_repeat_contents) {
        return dictionary_contents.copy_dictionary_contents(bag_repeat_contents);
    }

    public static final SubLObject bag_repeat_contents_unique_size_alt(SubLObject bag_repeat_contents) {
        return dictionary_contents.dictionary_contents_size(bag_repeat_contents);
    }

    public static SubLObject bag_repeat_contents_unique_size(final SubLObject bag_repeat_contents) {
        return dictionary_contents.dictionary_contents_size(bag_repeat_contents);
    }

    public static final SubLObject bag_repeat_contents_emptyP_alt(SubLObject bag_repeat_contents) {
        return dictionary_contents.dictionary_contents_empty_p(bag_repeat_contents);
    }

    public static SubLObject bag_repeat_contents_emptyP(final SubLObject bag_repeat_contents) {
        return dictionary_contents.dictionary_contents_empty_p(bag_repeat_contents);
    }

    public static final SubLObject bag_repeat_contents_member_count_alt(SubLObject element, SubLObject bag_repeat_contents, SubLObject test) {
        return dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, ZERO_INTEGER);
    }

    public static SubLObject bag_repeat_contents_member_count(final SubLObject element, final SubLObject bag_repeat_contents, final SubLObject test) {
        return dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, ZERO_INTEGER);
    }

    public static final SubLObject bag_repeat_contents_memberP_alt(SubLObject element, SubLObject bag_repeat_contents, SubLObject test) {
        return plusp(bag_repeat_contents_member_count(element, bag_repeat_contents, test));
    }

    public static SubLObject bag_repeat_contents_memberP(final SubLObject element, final SubLObject bag_repeat_contents, final SubLObject test) {
        return plusp(bag_repeat_contents_member_count(element, bag_repeat_contents, test));
    }

    public static final SubLObject bag_repeat_contents_matching_element_alt(SubLObject element, SubLObject bag_repeat_contents, SubLObject test) {
        return NIL != bag_repeat_contents_memberP(element, bag_repeat_contents, test) ? ((SubLObject) (element)) : NIL;
    }

    public static SubLObject bag_repeat_contents_matching_element(final SubLObject element, final SubLObject bag_repeat_contents, final SubLObject test) {
        return NIL != bag_repeat_contents_memberP(element, bag_repeat_contents, test) ? element : NIL;
    }

    public static final SubLObject bag_repeat_contents_random_element_alt(SubLObject bag_repeat_contents) {
        return dictionary_contents.dictionary_contents_random_key(bag_repeat_contents);
    }

    public static SubLObject bag_repeat_contents_random_element(final SubLObject bag_repeat_contents) {
        return dictionary_contents.dictionary_contents_random_key(bag_repeat_contents);
    }

    /**
     * if ELEMENT is not there, then this is a transfer operation, so we need
     * to count the ELEMENT twice
     */
    @LispMethod(comment = "if ELEMENT is not there, then this is a transfer operation, so we need\r\nto count the ELEMENT twice\nif ELEMENT is not there, then this is a transfer operation, so we need\nto count the ELEMENT twice")
    public static final SubLObject bag_repeat_contents_add_alt(SubLObject element, SubLObject bag_repeat_contents, SubLObject test) {
        {
            SubLObject times = dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, ONE_INTEGER);
            times = add(times, ONE_INTEGER);
            return dictionary_contents.dictionary_contents_enter(bag_repeat_contents, element, times, test);
        }
    }

    /**
     * if ELEMENT is not there, then this is a transfer operation, so we need
     * to count the ELEMENT twice
     */
    @LispMethod(comment = "if ELEMENT is not there, then this is a transfer operation, so we need\r\nto count the ELEMENT twice\nif ELEMENT is not there, then this is a transfer operation, so we need\nto count the ELEMENT twice")
    public static SubLObject bag_repeat_contents_add(final SubLObject element, final SubLObject bag_repeat_contents, final SubLObject test) {
        SubLObject times = dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, ONE_INTEGER);
        times = add(times, ONE_INTEGER);
        return dictionary_contents.dictionary_contents_enter(bag_repeat_contents, element, times, test);
    }

    /**
     * on going to 1, we eliminate the element because we dont need the count
     */
    @LispMethod(comment = "on going to 1, we eliminate the element because we dont need the count")
    public static final SubLObject bag_repeat_contents_delete_alt(SubLObject element, SubLObject bag_repeat_contents, SubLObject test) {
        {
            SubLObject times = dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, ZERO_INTEGER);
            if (times.isPositive()) {
                times = subtract(times, ONE_INTEGER);
                if (ONE_INTEGER.numL(times)) {
                    return dictionary_contents.dictionary_contents_enter(bag_repeat_contents, element, times, test);
                } else {
                    return dictionary_contents.dictionary_contents_delete(bag_repeat_contents, element, test);
                }
            }
        }
        return NIL;
    }

    /**
     * on going to 1, we eliminate the element because we dont need the count
     */
    @LispMethod(comment = "on going to 1, we eliminate the element because we dont need the count")
    public static SubLObject bag_repeat_contents_delete(final SubLObject element, final SubLObject bag_repeat_contents, final SubLObject test) {
        SubLObject times = dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, ZERO_INTEGER);
        if (!times.isPositive()) {
            return NIL;
        }
        times = subtract(times, ONE_INTEGER);
        if (ONE_INTEGER.numL(times)) {
            return dictionary_contents.dictionary_contents_enter(bag_repeat_contents, element, times, test);
        }
        return dictionary_contents.dictionary_contents_delete(bag_repeat_contents, element, test);
    }

    public static final SubLObject bag_repeat_contents_delete_all_alt(SubLObject element, SubLObject bag_repeat_contents, SubLObject test) {
        {
            SubLObject times = bag_repeat_contents_member_count(element, bag_repeat_contents, test);
            return values(dictionary_contents.dictionary_contents_delete(bag_repeat_contents, element, test), times);
        }
    }

    public static SubLObject bag_repeat_contents_delete_all(final SubLObject element, final SubLObject bag_repeat_contents, final SubLObject test) {
        final SubLObject times = bag_repeat_contents_member_count(element, bag_repeat_contents, test);
        return values(dictionary_contents.dictionary_contents_delete(bag_repeat_contents, element, test), times);
    }

    public static final SubLObject clear_bag_repeat_contents_alt(SubLObject bag_repeat_contents) {
        return dictionary_contents.clear_dictionary_contents(bag_repeat_contents);
    }

    public static SubLObject clear_bag_repeat_contents(final SubLObject bag_repeat_contents) {
        return dictionary_contents.clear_dictionary_contents(bag_repeat_contents);
    }

    public static final SubLObject do_bag_repeat_contents_unique_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject element_var = NIL;
                    SubLObject element_count = NIL;
                    SubLObject bag_repeat_contents = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    element_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    element_count = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    bag_repeat_contents = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt30);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt30);
                            if (NIL == member(current_3, $list_alt31, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt30);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_DICTIONARY_CONTENTS, list(element_var, element_count, bag_repeat_contents, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_bag_repeat_contents_unique(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = NIL;
        SubLObject element_count = NIL;
        SubLObject bag_repeat_contents = NIL;
        destructuring_bind_must_consp(current, datum, $list33);
        element_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        element_count = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        bag_repeat_contents = current.first();
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
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_DICTIONARY_CONTENTS, list(element_var, element_count, bag_repeat_contents, $DONE, done), append(body, NIL));
    }

    public static final SubLObject do_bag_repeat_contents_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt35);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject element_var = NIL;
                    SubLObject bag_repeat_contents = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    element_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    bag_repeat_contents = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt35);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt35);
                            if (NIL == member(current_4, $list_alt31, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt35);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject curr_element = $sym36$CURR_ELEMENT;
                                SubLObject element_count = $sym37$ELEMENT_COUNT;
                                SubLObject index = $sym38$INDEX;
                                return list(DO_BAG_REPEAT_CONTENTS_UNIQUE, list(curr_element, element_count, bag_repeat_contents, $DONE, done), list(CDOTIMES, list(index, element_count), listS(CLET, list(list(element_var, curr_element)), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_bag_repeat_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = NIL;
        SubLObject bag_repeat_contents = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        element_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        bag_repeat_contents = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list38);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list38);
            if (NIL == member(current_$2, $list34, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list38);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject curr_element = $sym39$CURR_ELEMENT;
        final SubLObject element_count = $sym40$ELEMENT_COUNT;
        final SubLObject index = $sym41$INDEX;
        return list(DO_BAG_REPEAT_CONTENTS_UNIQUE, list(curr_element, element_count, bag_repeat_contents, $DONE, done), list(CDOTIMES, list(index, element_count), listS(CLET, list(list(element_var, curr_element)), append(body, NIL))));
    }

    public static final SubLObject map_bag_repeat_contents_alt(SubLObject function, SubLObject bag_repeat_contents, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(bag_repeat_contents);
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject curr_element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject element_count = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject index = NIL;
                            for (index = ZERO_INTEGER; index.numL(element_count); index = add(index, ONE_INTEGER)) {
                                {
                                    SubLObject element_var = curr_element;
                                    apply(function, element_var, args);
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    public static SubLObject map_bag_repeat_contents(final SubLObject function, final SubLObject bag_repeat_contents, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(bag_repeat_contents); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject curr_element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject element_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject index;
            SubLObject element_var;
            for (index = NIL, index = ZERO_INTEGER; index.numL(element_count); index = add(index, ONE_INTEGER)) {
                element_var = curr_element;
                apply(function, element_var, args);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    public static final SubLObject bag_repeat_contents_element_list_alt(SubLObject bag_repeat_contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject values = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(bag_repeat_contents);
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject curr_element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject element_count = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject index = NIL;
                            for (index = ZERO_INTEGER; index.numL(element_count); index = add(index, ONE_INTEGER)) {
                                {
                                    SubLObject element_var = curr_element;
                                    values = cons(element_var, values);
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return values;
            }
        }
    }

    public static SubLObject bag_repeat_contents_element_list(final SubLObject bag_repeat_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject values = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(bag_repeat_contents); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject curr_element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject element_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject index;
            SubLObject element_var;
            for (index = NIL, index = ZERO_INTEGER; index.numL(element_count); index = add(index, ONE_INTEGER)) {
                element_var = curr_element;
                values = cons(element_var, values);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return values;
    }

    public static final SubLObject bag_repeat_contents_unique_element_list_alt(SubLObject bag_repeat_contents) {
        return dictionary_contents.dictionary_contents_keys(bag_repeat_contents);
    }

    public static SubLObject bag_repeat_contents_unique_element_list(final SubLObject bag_repeat_contents) {
        return dictionary_contents.dictionary_contents_keys(bag_repeat_contents);
    }

    public static final SubLObject make_bag_iterator_state_alt(SubLObject bag_repeat_contents) {
        {
            SubLObject contents_iterator = dictionary_contents.new_dictionary_contents_iterator(bag_repeat_contents);
            return list(ZERO_INTEGER, NIL, contents_iterator);
        }
    }

    public static SubLObject make_bag_iterator_state(final SubLObject bag_repeat_contents) {
        final SubLObject contents_iterator = dictionary_contents.new_dictionary_contents_iterator(bag_repeat_contents);
        return list(ZERO_INTEGER, NIL, contents_iterator);
    }

    public static final SubLObject iterate_bag_done_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject times = NIL;
            SubLObject element = NIL;
            SubLObject contents_iterator = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            times = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            element = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            contents_iterator = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean(times.isZero() && (($UNINITIALIZED == contents_iterator) || (NIL != iteration.iteration_done(contents_iterator))));
            } else {
                cdestructuring_bind_error(datum, $list_alt42);
            }
        }
        return NIL;
    }

    public static SubLObject iterate_bag_done(final SubLObject state) {
        SubLObject times = NIL;
        SubLObject element = NIL;
        SubLObject contents_iterator = NIL;
        destructuring_bind_must_consp(state, state, $list45);
        times = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list45);
        element = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list45);
        contents_iterator = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(times.isZero() && (($UNINITIALIZED == contents_iterator) || (NIL != iteration.iteration_done(contents_iterator))));
        }
        cdestructuring_bind_error(state, $list45);
        return NIL;
    }

    public static final SubLObject iterate_bag_next_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject times = NIL;
            SubLObject element = NIL;
            SubLObject contents_iterator = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            times = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            element = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            contents_iterator = current.first();
            current = current.rest();
            if (NIL == current) {
                if (times.isZero()) {
                    {
                        SubLObject entry = iteration.iteration_next(contents_iterator);
                        SubLObject datum_5 = entry;
                        SubLObject current_6 = datum_5;
                        SubLObject key = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current_6, datum_5, $list_alt44);
                        key = current_6.first();
                        current_6 = current_6.rest();
                        destructuring_bind_must_consp(current_6, datum_5, $list_alt44);
                        value = current_6.first();
                        current_6 = current_6.rest();
                        if (NIL == current_6) {
                            element = key;
                            times = value;
                            set_nth(ONE_INTEGER, state, element);
                        } else {
                            cdestructuring_bind_error(datum_5, $list_alt44);
                        }
                        if (NIL != iteration.iteration_done(contents_iterator)) {
                            set_nth(TWO_INTEGER, state, $UNINITIALIZED);
                        }
                    }
                }
                if (times.isPositive()) {
                    times = subtract(times, ONE_INTEGER);
                    set_nth(ZERO_INTEGER, state, times);
                }
                return values(element, state);
            } else {
                cdestructuring_bind_error(datum, $list_alt42);
            }
        }
        return NIL;
    }

    public static SubLObject iterate_bag_next(final SubLObject state) {
        SubLObject times = NIL;
        SubLObject element = NIL;
        SubLObject contents_iterator = NIL;
        destructuring_bind_must_consp(state, state, $list45);
        times = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list45);
        element = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list45);
        contents_iterator = current.first();
        current = current.rest();
        if (NIL == current) {
            if (times.isZero()) {
                final SubLObject entry = iteration.iteration_next(contents_iterator);
                SubLObject current_$4;
                final SubLObject datum_$3 = current_$4 = entry;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current_$4, datum_$3, $list47);
                key = current_$4.first();
                current_$4 = current_$4.rest();
                destructuring_bind_must_consp(current_$4, datum_$3, $list47);
                value = current_$4.first();
                current_$4 = current_$4.rest();
                if (NIL == current_$4) {
                    element = key;
                    times = value;
                    set_nth(ONE_INTEGER, state, element);
                } else {
                    cdestructuring_bind_error(datum_$3, $list47);
                }
                if (NIL != iteration.iteration_done(contents_iterator)) {
                    set_nth(TWO_INTEGER, state, $UNINITIALIZED);
                }
            }
            if (times.isPositive()) {
                times = subtract(times, ONE_INTEGER);
                set_nth(ZERO_INTEGER, state, times);
            }
            return values(element, state);
        }
        cdestructuring_bind_error(state, $list45);
        return NIL;
    }

    public static final SubLObject new_bag_repeat_contents_iterator_alt(SubLObject bag_repeat_contents) {
        if (NIL != dictionary_contents.dictionary_contents_empty_p(bag_repeat_contents)) {
            return iteration.new_null_iterator();
        } else {
            if (dictionary_contents.dictionary_contents_size(bag_repeat_contents).numL($bag_repeat_contents_iterator_watermark$.getGlobalValue())) {
                return iteration.new_list_iterator(bag_repeat_contents_element_list(bag_repeat_contents));
            } else {
                return iteration.new_iterator(make_bag_iterator_state(bag_repeat_contents), ITERATE_BAG_NEXT, ITERATE_BAG_DONE, UNPROVIDED);
            }
        }
    }

    public static SubLObject new_bag_repeat_contents_iterator(final SubLObject bag_repeat_contents) {
        if (NIL != dictionary_contents.dictionary_contents_empty_p(bag_repeat_contents)) {
            return iteration.new_null_iterator();
        }
        if (dictionary_contents.dictionary_contents_size(bag_repeat_contents).numL($bag_repeat_contents_iterator_watermark$.getGlobalValue())) {
            return iteration.new_list_iterator(bag_repeat_contents_element_list(bag_repeat_contents));
        }
        return iteration.new_iterator(make_bag_iterator_state(bag_repeat_contents), ITERATE_BAG_NEXT, ITERATE_BAG_DONE, UNPROVIDED);
    }

    public static final SubLObject new_bag_unique_contents_alt(SubLObject size, SubLObject test) {
        return set_contents.new_set_contents(size, test);
    }

    public static SubLObject new_bag_unique_contents(final SubLObject size, final SubLObject test) {
        return set_contents.new_set_contents(size, test);
    }

    public static final SubLObject copy_bag_unique_contents_alt(SubLObject bag_unique_contents) {
        return set_contents.copy_set_contents(bag_unique_contents);
    }

    public static SubLObject copy_bag_unique_contents(final SubLObject bag_unique_contents) {
        return set_contents.copy_set_contents(bag_unique_contents);
    }

    public static final SubLObject bag_unique_contents_unique_size_alt(SubLObject bag_unique_contents) {
        return set_contents.set_contents_size(bag_unique_contents);
    }

    public static SubLObject bag_unique_contents_unique_size(final SubLObject bag_unique_contents) {
        return set_contents.set_contents_size(bag_unique_contents);
    }

    public static final SubLObject bag_unique_contents_emptyP_alt(SubLObject bag_unique_contents) {
        return set_contents.set_contents_emptyP(bag_unique_contents);
    }

    public static SubLObject bag_unique_contents_emptyP(final SubLObject bag_unique_contents) {
        return set_contents.set_contents_emptyP(bag_unique_contents);
    }

    public static final SubLObject bag_unique_contents_memberP_alt(SubLObject element, SubLObject bag_unique_contents, SubLObject test) {
        return set_contents.set_contents_memberP(element, bag_unique_contents, test);
    }

    public static SubLObject bag_unique_contents_memberP(final SubLObject element, final SubLObject bag_unique_contents, final SubLObject test) {
        return set_contents.set_contents_memberP(element, bag_unique_contents, test);
    }

    public static final SubLObject bag_unique_contents_member_count_alt(SubLObject element, SubLObject bag_unique_contents, SubLObject test) {
        return NIL != bag_unique_contents_memberP(element, bag_unique_contents, test) ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER;
    }

    public static SubLObject bag_unique_contents_member_count(final SubLObject element, final SubLObject bag_unique_contents, final SubLObject test) {
        return NIL != bag_unique_contents_memberP(element, bag_unique_contents, test) ? ONE_INTEGER : ZERO_INTEGER;
    }

    public static final SubLObject bag_unique_contents_matching_element_alt(SubLObject element, SubLObject bag_unique_contents, SubLObject test) {
        return set_contents.set_contents_matching_element(element, bag_unique_contents, test);
    }

    public static SubLObject bag_unique_contents_matching_element(final SubLObject element, final SubLObject bag_unique_contents, final SubLObject test) {
        return set_contents.set_contents_matching_element(element, bag_unique_contents, test);
    }

    public static final SubLObject bag_unique_contents_random_element_alt(SubLObject bag_unique_contents) {
        return set_contents.set_contents_random_element(bag_unique_contents);
    }

    public static SubLObject bag_unique_contents_random_element(final SubLObject bag_unique_contents) {
        return set_contents.set_contents_random_element(bag_unique_contents);
    }

    public static final SubLObject bag_unique_contents_add_alt(SubLObject element, SubLObject bag_unique_contents, SubLObject test) {
        return set_contents.set_contents_add(element, bag_unique_contents, test);
    }

    public static SubLObject bag_unique_contents_add(final SubLObject element, final SubLObject bag_unique_contents, final SubLObject test) {
        return set_contents.set_contents_add(element, bag_unique_contents, test);
    }

    public static final SubLObject bag_unique_contents_delete_alt(SubLObject element, SubLObject bag_unique_contents, SubLObject test) {
        return set_contents.set_contents_delete(element, bag_unique_contents, test);
    }

    public static SubLObject bag_unique_contents_delete(final SubLObject element, final SubLObject bag_unique_contents, final SubLObject test) {
        return set_contents.set_contents_delete(element, bag_unique_contents, test);
    }

    public static final SubLObject bag_unique_contents_delete_all_alt(SubLObject element, SubLObject bag_unique_contents, SubLObject test) {
        return set_contents.set_contents_delete(element, bag_unique_contents, test);
    }

    public static SubLObject bag_unique_contents_delete_all(final SubLObject element, final SubLObject bag_unique_contents, final SubLObject test) {
        return set_contents.set_contents_delete(element, bag_unique_contents, test);
    }

    public static final SubLObject clear_bag_unique_contents_alt(SubLObject bag_unique_contents) {
        return set_contents.clear_set_contents(bag_unique_contents);
    }

    public static SubLObject clear_bag_unique_contents(final SubLObject bag_unique_contents) {
        return set_contents.clear_set_contents(bag_unique_contents);
    }

    public static final SubLObject do_bag_unique_contents_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt47);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject element_var = NIL;
                    SubLObject bag_unique_contents = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    element_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    bag_unique_contents = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_7 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt47);
                            current_7 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt47);
                            if (NIL == member(current_7, $list_alt31, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_7 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt47);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_SET_CONTENTS, list(element_var, bag_unique_contents, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_bag_unique_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = NIL;
        SubLObject bag_unique_contents = NIL;
        destructuring_bind_must_consp(current, datum, $list50);
        element_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list50);
        bag_unique_contents = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list50);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list50);
            if (NIL == member(current_$5, $list34, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list50);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET_CONTENTS, list(element_var, bag_unique_contents, $DONE, done), append(body, NIL));
    }

    public static final SubLObject map_bag_unique_contents_alt(SubLObject function, SubLObject bag_unique_contents, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject set_contents_var = bag_unique_contents;
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element_var = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element_var)) {
                        apply(function, element_var, args);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject map_bag_unique_contents(final SubLObject function, final SubLObject bag_unique_contents, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLObject basis_object;
        SubLObject state;
        SubLObject element_var;
        for (basis_object = set_contents.do_set_contents_basis_object(bag_unique_contents), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, bag_unique_contents); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element_var = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element_var)) {
                apply(function, element_var, args);
            }
        }
        return NIL;
    }

    public static final SubLObject bag_unique_contents_element_list_alt(SubLObject bag_unique_contents) {
        {
            SubLObject values = NIL;
            SubLObject set_contents_var = bag_unique_contents;
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element_var = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element_var)) {
                        values = cons(element_var, values);
                    }
                }
            }
            return values;
        }
    }

    public static SubLObject bag_unique_contents_element_list(final SubLObject bag_unique_contents) {
        SubLObject values = NIL;
        SubLObject basis_object;
        SubLObject state;
        SubLObject element_var;
        for (basis_object = set_contents.do_set_contents_basis_object(bag_unique_contents), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, bag_unique_contents); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element_var = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element_var)) {
                values = cons(element_var, values);
            }
        }
        return values;
    }

    public static final SubLObject bag_unique_contents_unique_element_list_alt(SubLObject bag_unique_contents) {
        return set_contents.set_contents_element_list(bag_unique_contents);
    }

    public static SubLObject bag_unique_contents_unique_element_list(final SubLObject bag_unique_contents) {
        return set_contents.set_contents_element_list(bag_unique_contents);
    }

    public static final SubLObject new_bag_unique_contents_iterator_alt(SubLObject bag_unique_contents) {
        if (NIL != bag_unique_contents_emptyP(bag_unique_contents)) {
            return iteration.new_null_iterator();
        } else {
            return set_contents.new_set_contents_iterator(bag_unique_contents);
        }
    }

    public static SubLObject new_bag_unique_contents_iterator(final SubLObject bag_unique_contents) {
        if (NIL != bag_unique_contents_emptyP(bag_unique_contents)) {
            return iteration.new_null_iterator();
        }
        return set_contents.new_set_contents_iterator(bag_unique_contents);
    }

    public static final SubLObject new_bag_contents_iterator_alt(SubLObject bag_unique_contents, SubLObject bag_repeat_contents) {
        if (NIL != bag_unique_contents_emptyP(bag_unique_contents)) {
            return new_bag_repeat_contents_iterator(bag_repeat_contents);
        } else {
            if (NIL != bag_repeat_contents_emptyP(bag_repeat_contents)) {
                return new_bag_unique_contents_iterator(bag_unique_contents);
            } else {
                return iteration.new_iterator_iterator(list(new_bag_unique_contents_iterator(bag_unique_contents), new_bag_repeat_contents_iterator(bag_repeat_contents)));
            }
        }
    }

    public static SubLObject new_bag_contents_iterator(final SubLObject bag_unique_contents, final SubLObject bag_repeat_contents) {
        if (NIL != bag_unique_contents_emptyP(bag_unique_contents)) {
            return new_bag_repeat_contents_iterator(bag_repeat_contents);
        }
        if (NIL != bag_repeat_contents_emptyP(bag_repeat_contents)) {
            return new_bag_unique_contents_iterator(bag_unique_contents);
        }
        return iteration.new_iterator_iterator(list(new_bag_unique_contents_iterator(bag_unique_contents), new_bag_repeat_contents_iterator(bag_repeat_contents)));
    }

    /**
     * Allocate a new bag with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     * Assume that they will distribute evenly (1/2 singletons, 1/2 doubles).
     *
     * @return bag-p
     */
    @LispMethod(comment = "Allocate a new bag with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\nAssume that they will distribute evenly (1/2 singletons, 1/2 doubles).\r\n\r\n@return bag-p\nAllocate a new bag with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.\nAssume that they will distribute evenly (1/2 singletons, 1/2 doubles).")
    public static final SubLObject new_bag_alt(SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = $new_bag_default_test_function$.getGlobalValue();
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
            SubLObject unique_size = integerDivide(size, TWO_INTEGER);
            SubLObject repeat_size = integerDivide(unique_size, TWO_INTEGER);
            return make_new_bag(test, ZERO_INTEGER, new_bag_unique_contents(unique_size, test), new_bag_repeat_contents(repeat_size, test));
        }
    }

    /**
     * Allocate a new bag with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     * Assume that they will distribute evenly (1/2 singletons, 1/2 doubles).
     *
     * @return bag-p
     */
    @LispMethod(comment = "Allocate a new bag with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\nAssume that they will distribute evenly (1/2 singletons, 1/2 doubles).\r\n\r\n@return bag-p\nAllocate a new bag with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.\nAssume that they will distribute evenly (1/2 singletons, 1/2 doubles).")
    public static SubLObject new_bag(SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = $new_bag_default_test_function$.getGlobalValue();
        }
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "! hash_table_utilities.valid_hash_test_p(test) " + ("hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) ") + test;
        assert NIL != integerp(size) : "! integerp(size) " + ("Types.integerp(size) " + "CommonSymbols.NIL != Types.integerp(size) ") + size;
        if (test.isSymbol()) {
            test = symbol_function(test);
        }
        final SubLObject unique_size = integerDivide(size, TWO_INTEGER);
        final SubLObject repeat_size = integerDivide(unique_size, TWO_INTEGER);
        return make_new_bag(test, ZERO_INTEGER, new_bag_unique_contents(unique_size, test), new_bag_repeat_contents(repeat_size, test));
    }

    /**
     * Return a new copy of BAG.
     *
     * @return bag-p
     */
    @LispMethod(comment = "Return a new copy of BAG.\r\n\r\n@return bag-p")
    public static final SubLObject copy_bag_alt(SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        {
            SubLObject new_bag_repeat_contents = copy_bag_repeat_contents(bag_struct_repeat_contents(v_bag));
            SubLObject new_bag_unique_contents = copy_bag_unique_contents(bag_struct_unique_contents(v_bag));
            return make_new_bag(bag_test(v_bag), bag_struct_repeat_size(v_bag), new_bag_unique_contents, new_bag_repeat_contents);
        }
    }

    /**
     * Return a new copy of BAG.
     *
     * @return bag-p
     */
    @LispMethod(comment = "Return a new copy of BAG.\r\n\r\n@return bag-p")
    public static SubLObject copy_bag(final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        final SubLObject new_bag_repeat_contents = copy_bag_repeat_contents(bag_struct_repeat_contents(v_bag));
        final SubLObject new_bag_unique_contents = copy_bag_unique_contents(bag_struct_unique_contents(v_bag));
        return make_new_bag(bag_test(v_bag), bag_struct_repeat_size(v_bag), new_bag_unique_contents, new_bag_repeat_contents);
    }

    /**
     * Allocate a new bag with TEST as the equality test,
     * then fill it with ELEMENTS (estimated to have SIZE items).
     *
     * @unknown This could be in BAG-UTILITIES, but helps with writing unit tests.
     * @return bag-p
     */
    @LispMethod(comment = "Allocate a new bag with TEST as the equality test,\r\nthen fill it with ELEMENTS (estimated to have SIZE items).\r\n\r\n@unknown This could be in BAG-UTILITIES, but helps with writing unit tests.\r\n@return bag-p\nAllocate a new bag with TEST as the equality test,\nthen fill it with ELEMENTS (estimated to have SIZE items).")
    public static final SubLObject new_bag_from_elements_alt(SubLObject elements, SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = $new_bag_default_test_function$.getGlobalValue();
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        SubLTrampolineFile.checkType(elements, LISTP);
        if (NIL == size) {
            size = length(elements);
        }
        {
            SubLObject v_bag = new_bag(test, size);
            SubLObject cdolist_list_var = elements;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                bag_add(element, v_bag);
            }
            return v_bag;
        }
    }

    /**
     * Allocate a new bag with TEST as the equality test,
     * then fill it with ELEMENTS (estimated to have SIZE items).
     *
     * @unknown This could be in BAG-UTILITIES, but helps with writing unit tests.
     * @return bag-p
     */
    @LispMethod(comment = "Allocate a new bag with TEST as the equality test,\r\nthen fill it with ELEMENTS (estimated to have SIZE items).\r\n\r\n@unknown This could be in BAG-UTILITIES, but helps with writing unit tests.\r\n@return bag-p\nAllocate a new bag with TEST as the equality test,\nthen fill it with ELEMENTS (estimated to have SIZE items).")
    public static SubLObject new_bag_from_elements(final SubLObject elements, SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = $new_bag_default_test_function$.getGlobalValue();
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        assert NIL != listp(elements) : "! listp(elements) " + ("Types.listp(elements) " + "CommonSymbols.NIL != Types.listp(elements) ") + elements;
        if (NIL == size) {
            size = length(elements);
        }
        final SubLObject v_bag = new_bag(test, size);
        SubLObject cdolist_list_var = elements;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            bag_add(element, v_bag);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return v_bag;
    }

    /**
     * Return the equality test function used in BAG.
     *
     * @return function-spec-p.
     */
    @LispMethod(comment = "Return the equality test function used in BAG.\r\n\r\n@return function-spec-p.")
    public static final SubLObject bag_test_alt(SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        return bag_struct_test(v_bag);
    }

    /**
     * Return the equality test function used in BAG.
     *
     * @return function-spec-p.
     */
    @LispMethod(comment = "Return the equality test function used in BAG.\r\n\r\n@return function-spec-p.")
    public static SubLObject bag_test(final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        return bag_struct_test(v_bag);
    }

    /**
     * Return the number of items currently entered in BAG.
     *
     * @return integerp.
     */
    @LispMethod(comment = "Return the number of items currently entered in BAG.\r\n\r\n@return integerp.")
    public static final SubLObject bag_size_alt(SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        return add(bag_unique_contents_unique_size(bag_struct_unique_contents(v_bag)), bag_struct_repeat_size(v_bag));
    }

    @LispMethod(comment = "Return the number of items currently entered in BAG.\r\n\r\n@return integerp.")
    public static SubLObject bag_size(final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        return add(bag_unique_contents_unique_size(bag_struct_unique_contents(v_bag)), bag_struct_repeat_size(v_bag));
    }

    /**
     * Return the size of the single-set projection of BAG.
     */
    @LispMethod(comment = "Return the size of the single-set projection of BAG.")
    public static final SubLObject bag_unique_size_alt(SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        return add(bag_unique_contents_unique_size(bag_struct_unique_contents(v_bag)), bag_repeat_contents_unique_size(bag_struct_repeat_contents(v_bag)));
    }

    @LispMethod(comment = "Return the size of the single-set projection of BAG.")
    public static SubLObject bag_unique_size(final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        return add(bag_unique_contents_unique_size(bag_struct_unique_contents(v_bag)), bag_repeat_contents_unique_size(bag_struct_repeat_contents(v_bag)));
    }

    /**
     *
     *
     * @return boolean; non-nil iff BAG is empty, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil iff BAG is empty, nil otherwise")
    public static final SubLObject bag_emptyP_alt(SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        return makeBoolean((NIL != bag_repeat_contents_emptyP(bag_struct_repeat_contents(v_bag))) && (NIL != bag_unique_contents_emptyP(bag_struct_unique_contents(v_bag))));
    }

    /**
     *
     *
     * @return boolean; non-nil iff BAG is empty, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil iff BAG is empty, nil otherwise")
    public static SubLObject bag_emptyP(final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        return makeBoolean((NIL != bag_repeat_contents_emptyP(bag_struct_repeat_contents(v_bag))) && (NIL != bag_unique_contents_emptyP(bag_struct_unique_contents(v_bag))));
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ an empty bag?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ an empty bag?")
    public static final SubLObject empty_bag_p_alt(SubLObject obj) {
        return makeBoolean((NIL != bag_p(obj)) && (NIL != bag_emptyP(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ an empty bag?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ an empty bag?")
    public static SubLObject empty_bag_p(final SubLObject obj) {
        return makeBoolean((NIL != bag_p(obj)) && (NIL != bag_emptyP(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a non-empty bag?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a non-empty bag?")
    public static final SubLObject non_empty_bag_p_alt(SubLObject obj) {
        return makeBoolean((NIL != bag_p(obj)) && (NIL == bag_emptyP(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a non-empty bag?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a non-empty bag?")
    public static SubLObject non_empty_bag_p(final SubLObject obj) {
        return makeBoolean((NIL != bag_p(obj)) && (NIL == bag_emptyP(obj)));
    }

    /**
     *
     *
     * @return boolean; t iff ELEMENT is in BAG.
     */
    @LispMethod(comment = "@return boolean; t iff ELEMENT is in BAG.")
    public static final SubLObject bag_memberP_alt(SubLObject element, SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        {
            SubLObject test = bag_struct_test(v_bag);
            return makeBoolean((NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) || (NIL != bag_repeat_contents_memberP(element, bag_struct_repeat_contents(v_bag), test)));
        }
    }

    /**
     *
     *
     * @return boolean; t iff ELEMENT is in BAG.
     */
    @LispMethod(comment = "@return boolean; t iff ELEMENT is in BAG.")
    public static SubLObject bag_memberP(final SubLObject element, final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        final SubLObject test = bag_struct_test(v_bag);
        return makeBoolean((NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) || (NIL != bag_repeat_contents_memberP(element, bag_struct_repeat_contents(v_bag), test)));
    }

    /**
     *
     *
     * @return integerp; plusp if ELEMENT is in BAG, zerop otherwise.
     */
    @LispMethod(comment = "@return integerp; plusp if ELEMENT is in BAG, zerop otherwise.")
    public static final SubLObject bag_member_count_alt(SubLObject element, SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        {
            SubLObject test = bag_struct_test(v_bag);
            if (NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) {
                return ONE_INTEGER;
            } else {
                return bag_repeat_contents_member_count(element, bag_struct_repeat_contents(v_bag), test);
            }
        }
    }

    /**
     *
     *
     * @return integerp; plusp if ELEMENT is in BAG, zerop otherwise.
     */
    @LispMethod(comment = "@return integerp; plusp if ELEMENT is in BAG, zerop otherwise.")
    public static SubLObject bag_member_count(final SubLObject element, final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        final SubLObject test = bag_struct_test(v_bag);
        if (NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) {
            return ONE_INTEGER;
        }
        return bag_repeat_contents_member_count(element, bag_struct_repeat_contents(v_bag), test);
    }

    /**
     * If there is an element in BAG that matches ELEMENT, then return it.
     * Otherwise return NIL.
     * Similar to @xref SET-FIND, except more efficient and does not allow TEST or KEY parameters.
     */
    @LispMethod(comment = "If there is an element in BAG that matches ELEMENT, then return it.\r\nOtherwise return NIL.\r\nSimilar to @xref SET-FIND, except more efficient and does not allow TEST or KEY parameters.\nIf there is an element in BAG that matches ELEMENT, then return it.\nOtherwise return NIL.\nSimilar to @xref SET-FIND, except more efficient and does not allow TEST or KEY parameters.")
    public static final SubLObject bag_matching_element_alt(SubLObject element, SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        {
            SubLObject test = bag_struct_test(v_bag);
            SubLObject result = bag_unique_contents_matching_element(element, bag_struct_unique_contents(v_bag), test);
            if (NIL != funcall(test, element, result)) {
                return result;
            } else {
                return bag_repeat_contents_matching_element(element, bag_struct_repeat_contents(v_bag), test);
            }
        }
    }

    @LispMethod(comment = "If there is an element in BAG that matches ELEMENT, then return it.\r\nOtherwise return NIL.\r\nSimilar to @xref SET-FIND, except more efficient and does not allow TEST or KEY parameters.\nIf there is an element in BAG that matches ELEMENT, then return it.\nOtherwise return NIL.\nSimilar to @xref SET-FIND, except more efficient and does not allow TEST or KEY parameters.")
    public static SubLObject bag_matching_element(final SubLObject element, final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        final SubLObject test = bag_struct_test(v_bag);
        final SubLObject result = bag_unique_contents_matching_element(element, bag_struct_unique_contents(v_bag), test);
        if (NIL != funcall(test, element, result)) {
            return result;
        }
        return bag_repeat_contents_matching_element(element, bag_struct_repeat_contents(v_bag), test);
    }

    /**
     * Return a randomly chosen element of BAG, if any.
     */
    @LispMethod(comment = "Return a randomly chosen element of BAG, if any.")
    public static final SubLObject bag_random_element_alt(SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        if (NIL != bag_unique_contents_emptyP(bag_struct_unique_contents(v_bag))) {
            return bag_repeat_contents_random_element(bag_struct_repeat_contents(v_bag));
        } else {
            return bag_unique_contents_random_element(bag_struct_unique_contents(v_bag));
        }
    }

    @LispMethod(comment = "Return a randomly chosen element of BAG, if any.")
    public static SubLObject bag_random_element(final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        if (NIL != bag_unique_contents_emptyP(bag_struct_unique_contents(v_bag))) {
            return bag_repeat_contents_random_element(bag_struct_repeat_contents(v_bag));
        }
        return bag_unique_contents_random_element(bag_struct_unique_contents(v_bag));
    }

    /**
     * Add this ELEMENT into the BAG.
     *
     * @return boolean, t iff ELEMENT was not already there.
     */
    @LispMethod(comment = "Add this ELEMENT into the BAG.\r\n\r\n@return boolean, t iff ELEMENT was not already there.")
    public static final SubLObject bag_add_alt(SubLObject element, SubLObject v_bag) {
        {
            SubLObject test = bag_struct_test(v_bag);
            SubLObject presentP = NIL;
            if (NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) {
                presentP = T;
                _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_delete(element, bag_struct_unique_contents(v_bag), test));
                _csetf_bag_struct_repeat_contents(v_bag, bag_repeat_contents_add(element, bag_struct_repeat_contents(v_bag), test));
                _csetf_bag_struct_repeat_size(v_bag, add(bag_struct_repeat_size(v_bag), TWO_INTEGER));
            } else {
                if (NIL != bag_repeat_contents_memberP(element, bag_struct_repeat_contents(v_bag), test)) {
                    presentP = T;
                    _csetf_bag_struct_repeat_contents(v_bag, bag_repeat_contents_add(element, bag_struct_repeat_contents(v_bag), test));
                    _csetf_bag_struct_repeat_size(v_bag, add(bag_struct_repeat_size(v_bag), ONE_INTEGER));
                } else {
                    _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_add(element, bag_struct_unique_contents(v_bag), test));
                }
            }
            return presentP;
        }
    }

    @LispMethod(comment = "Add this ELEMENT into the BAG.\r\n\r\n@return boolean, t iff ELEMENT was not already there.")
    public static SubLObject bag_add(final SubLObject element, final SubLObject v_bag) {
        final SubLObject test = bag_struct_test(v_bag);
        SubLObject presentP = NIL;
        if (NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) {
            presentP = T;
            _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_delete(element, bag_struct_unique_contents(v_bag), test));
            _csetf_bag_struct_repeat_contents(v_bag, bag_repeat_contents_add(element, bag_struct_repeat_contents(v_bag), test));
            _csetf_bag_struct_repeat_size(v_bag, add(bag_struct_repeat_size(v_bag), TWO_INTEGER));
        } else
            if (NIL != bag_repeat_contents_memberP(element, bag_struct_repeat_contents(v_bag), test)) {
                presentP = T;
                _csetf_bag_struct_repeat_contents(v_bag, bag_repeat_contents_add(element, bag_struct_repeat_contents(v_bag), test));
                _csetf_bag_struct_repeat_size(v_bag, add(bag_struct_repeat_size(v_bag), ONE_INTEGER));
            } else {
                _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_add(element, bag_struct_unique_contents(v_bag), test));
            }

        return presentP;
    }

    /**
     * If ELEMENT is present in BAG, then take it out of BAG.
     *
     * @return boolean; t iff ELEMENT was in BAG to begin with.
     */
    @LispMethod(comment = "If ELEMENT is present in BAG, then take it out of BAG.\r\n\r\n@return boolean; t iff ELEMENT was in BAG to begin with.")
    public static final SubLObject bag_remove_alt(SubLObject element, SubLObject v_bag) {
        {
            SubLObject test = bag_struct_test(v_bag);
            SubLObject repeat_member_count = bag_repeat_contents_member_count(element, bag_struct_repeat_contents(v_bag), test);
            SubLObject presentP = NIL;
            if (TWO_INTEGER.numE(repeat_member_count)) {
                _csetf_bag_struct_repeat_contents(v_bag, bag_repeat_contents_delete(element, bag_struct_repeat_contents(v_bag), test));
                _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_add(element, bag_struct_unique_contents(v_bag), test));
                _csetf_bag_struct_repeat_size(v_bag, subtract(bag_struct_repeat_size(v_bag), TWO_INTEGER));
                presentP = T;
            } else {
                if (repeat_member_count.isPositive()) {
                    _csetf_bag_struct_repeat_contents(v_bag, bag_repeat_contents_delete(element, bag_struct_repeat_contents(v_bag), test));
                    _csetf_bag_struct_repeat_size(v_bag, subtract(bag_struct_repeat_size(v_bag), ONE_INTEGER));
                    presentP = T;
                } else {
                    if (NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) {
                        _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_delete(element, bag_struct_unique_contents(v_bag), test));
                        presentP = T;
                    }
                }
            }
            return presentP;
        }
    }

    @LispMethod(comment = "If ELEMENT is present in BAG, then take it out of BAG.\r\n\r\n@return boolean; t iff ELEMENT was in BAG to begin with.")
    public static SubLObject bag_remove(final SubLObject element, final SubLObject v_bag) {
        final SubLObject test = bag_struct_test(v_bag);
        final SubLObject repeat_member_count = bag_repeat_contents_member_count(element, bag_struct_repeat_contents(v_bag), test);
        SubLObject presentP = NIL;
        if (TWO_INTEGER.numE(repeat_member_count)) {
            _csetf_bag_struct_repeat_contents(v_bag, bag_repeat_contents_delete(element, bag_struct_repeat_contents(v_bag), test));
            _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_add(element, bag_struct_unique_contents(v_bag), test));
            _csetf_bag_struct_repeat_size(v_bag, subtract(bag_struct_repeat_size(v_bag), TWO_INTEGER));
            presentP = T;
        } else
            if (repeat_member_count.isPositive()) {
                _csetf_bag_struct_repeat_contents(v_bag, bag_repeat_contents_delete(element, bag_struct_repeat_contents(v_bag), test));
                _csetf_bag_struct_repeat_size(v_bag, subtract(bag_struct_repeat_size(v_bag), ONE_INTEGER));
                presentP = T;
            } else
                if (NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) {
                    _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_delete(element, bag_struct_unique_contents(v_bag), test));
                    presentP = T;
                }


        return presentP;
    }

    /**
     * If ELEMENT is present in BAG one or more times, then take
     * it out of BAG as many times as it is in there. Conceptually,
     * this is equivalent to
     * (WHILE (BAG-MEMBER? ELEMENT BAG)
     * (BAG-REMOVE ELMENT BAG))
     *
     * @return boolean; t iff ELEMENT was in BAG to begin with.
     */
    @LispMethod(comment = "If ELEMENT is present in BAG one or more times, then take\r\nit out of BAG as many times as it is in there. Conceptually,\r\nthis is equivalent to\r\n(WHILE (BAG-MEMBER? ELEMENT BAG)\r\n(BAG-REMOVE ELMENT BAG))\r\n\r\n@return boolean; t iff ELEMENT was in BAG to begin with.\nIf ELEMENT is present in BAG one or more times, then take\nit out of BAG as many times as it is in there. Conceptually,\nthis is equivalent to\n(WHILE (BAG-MEMBER? ELEMENT BAG)\n(BAG-REMOVE ELMENT BAG))")
    public static final SubLObject bag_remove_all_alt(SubLObject element, SubLObject v_bag) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test = bag_struct_test(v_bag);
                thread.resetMultipleValues();
                {
                    SubLObject changed_bag_contents = bag_repeat_contents_delete_all(element, bag_struct_repeat_contents(v_bag), test);
                    SubLObject times = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (times.isPositive()) {
                        _csetf_bag_struct_repeat_contents(v_bag, changed_bag_contents);
                        _csetf_bag_struct_repeat_size(v_bag, subtract(bag_struct_repeat_size(v_bag), times));
                        return T;
                    }
                }
                if (NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) {
                    _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_delete_all(element, bag_struct_unique_contents(v_bag), test));
                    return T;
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "If ELEMENT is present in BAG one or more times, then take\r\nit out of BAG as many times as it is in there. Conceptually,\r\nthis is equivalent to\r\n(WHILE (BAG-MEMBER? ELEMENT BAG)\r\n(BAG-REMOVE ELMENT BAG))\r\n\r\n@return boolean; t iff ELEMENT was in BAG to begin with.\nIf ELEMENT is present in BAG one or more times, then take\nit out of BAG as many times as it is in there. Conceptually,\nthis is equivalent to\n(WHILE (BAG-MEMBER? ELEMENT BAG)\n(BAG-REMOVE ELMENT BAG))")
    public static SubLObject bag_remove_all(final SubLObject element, final SubLObject v_bag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test = bag_struct_test(v_bag);
        thread.resetMultipleValues();
        final SubLObject changed_bag_contents = bag_repeat_contents_delete_all(element, bag_struct_repeat_contents(v_bag), test);
        final SubLObject times = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (times.isPositive()) {
            _csetf_bag_struct_repeat_contents(v_bag, changed_bag_contents);
            _csetf_bag_struct_repeat_size(v_bag, subtract(bag_struct_repeat_size(v_bag), times));
            return T;
        }
        if (NIL != bag_unique_contents_memberP(element, bag_struct_unique_contents(v_bag), test)) {
            _csetf_bag_struct_unique_contents(v_bag, bag_unique_contents_delete_all(element, bag_struct_unique_contents(v_bag), test));
            return T;
        }
        return NIL;
    }

    /**
     * Rebag BAG to the status of being just allocated.
     *
     * @return bag
     */
    @LispMethod(comment = "Rebag BAG to the status of being just allocated.\r\n\r\n@return bag")
    public static final SubLObject clear_bag_alt(SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        _csetf_bag_struct_repeat_contents(v_bag, clear_bag_repeat_contents(bag_struct_repeat_contents(v_bag)));
        _csetf_bag_struct_unique_contents(v_bag, clear_bag_unique_contents(bag_struct_unique_contents(v_bag)));
        _csetf_bag_struct_repeat_size(v_bag, ZERO_INTEGER);
        return v_bag;
    }

    @LispMethod(comment = "Rebag BAG to the status of being just allocated.\r\n\r\n@return bag")
    public static SubLObject clear_bag(final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        _csetf_bag_struct_repeat_contents(v_bag, clear_bag_repeat_contents(bag_struct_repeat_contents(v_bag)));
        _csetf_bag_struct_unique_contents(v_bag, clear_bag_unique_contents(bag_struct_unique_contents(v_bag)));
        _csetf_bag_struct_repeat_size(v_bag, ZERO_INTEGER);
        return v_bag;
    }

    public static SubLObject bag_intersection(final SubLObject bag1, final SubLObject bag2) {
        final SubLObject bag1_unique_elements = bag_unique_element_list(bag1);
        final SubLObject bag2_unique_elements = bag_unique_element_list(bag2);
        final SubLObject unique_elem_intersection = intersection(bag1_unique_elements, bag2_unique_elements, UNPROVIDED, UNPROVIDED);
        final SubLObject intersection_bag = new_bag_from_elements(unique_elem_intersection, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = unique_elem_intersection;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject bag1_elem_count = bag_member_count(elem, bag1);
            final SubLObject bag2_elem_count = bag_member_count(elem, bag2);
            SubLObject elem_min_count;
            SubLObject i;
            for (elem_min_count = subtract(min(bag1_elem_count, bag2_elem_count), ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(elem_min_count); i = add(i, ONE_INTEGER)) {
                bag_add(elem, intersection_bag);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return intersection_bag;
    }

    public static SubLObject bag_union(final SubLObject bag1, final SubLObject bag2) {
        final SubLObject bag1_unique_elements = bag_unique_element_list(bag1);
        final SubLObject bag2_unique_elements = bag_unique_element_list(bag2);
        final SubLObject unique_elem_union = union(bag1_unique_elements, bag2_unique_elements, UNPROVIDED, UNPROVIDED);
        final SubLObject union_bag = new_bag_from_elements(unique_elem_union, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = unique_elem_union;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject bag1_elem_count = bag_member_count(elem, bag1);
            final SubLObject bag2_elem_count = bag_member_count(elem, bag2);
            SubLObject elem_max_count;
            SubLObject i;
            for (elem_max_count = subtract(max(bag1_elem_count, bag2_elem_count), ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(elem_max_count); i = add(i, ONE_INTEGER)) {
                bag_add(elem, union_bag);
            }
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return union_bag;
    }

    /**
     * Returns an iterator for the elements of BAG.
     */
    @LispMethod(comment = "Returns an iterator for the elements of BAG.")
    public static final SubLObject new_bag_iterator_alt(SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        return new_bag_contents_iterator(bag_struct_unique_contents(v_bag), bag_struct_repeat_contents(v_bag));
    }

    @LispMethod(comment = "Returns an iterator for the elements of BAG.")
    public static SubLObject new_bag_iterator(final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        return new_bag_contents_iterator(bag_struct_unique_contents(v_bag), bag_struct_repeat_contents(v_bag));
    }

    /**
     * Iterate over BAG, binding ELEMENT-VAR to each unique element indexed,
     * and ELEMENT-COUNT to the number of times that ELEMENT-VAR occurs in BAG.
     * BODY is executed once within the scope of each binding of ELEMENT-VAR
     * and ELEMENT-COUNT. Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over BAG, binding ELEMENT-VAR to each unique element indexed,\r\nand ELEMENT-COUNT to the number of times that ELEMENT-VAR occurs in BAG.\r\nBODY is executed once within the scope of each binding of ELEMENT-VAR\r\nand ELEMENT-COUNT. Iteration halts as soon as DONE becomes non-nil.\nIterate over BAG, binding ELEMENT-VAR to each unique element indexed,\nand ELEMENT-COUNT to the number of times that ELEMENT-VAR occurs in BAG.\nBODY is executed once within the scope of each binding of ELEMENT-VAR\nand ELEMENT-COUNT. Iteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_bag_unique_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject element_var = NIL;
                    SubLObject element_count = NIL;
                    SubLObject v_bag = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt52);
                    element_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt52);
                    element_count = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt52);
                    v_bag = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_8 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt52);
                            current_8 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt52);
                            if (NIL == member(current_8, $list_alt31, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_8 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt52);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(PROGN, listS(DO_BAG_REPEAT_CONTENTS_UNIQUE, list(element_var, element_count, list(DO_BAG_REPEAT_INTERNAL, v_bag), $DONE, done), append(body, NIL)), list(PUNLESS, done, list(CLET, list(bq_cons(element_count, $list_alt56)), listS(DO_BAG_UNIQUE_CONTENTS, list(element_var, list(DO_BAG_UNIQUE_INTERNAL, v_bag), $DONE, done), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Iterate over BAG, binding ELEMENT-VAR to each unique element indexed,\r\nand ELEMENT-COUNT to the number of times that ELEMENT-VAR occurs in BAG.\r\nBODY is executed once within the scope of each binding of ELEMENT-VAR\r\nand ELEMENT-COUNT. Iteration halts as soon as DONE becomes non-nil.\nIterate over BAG, binding ELEMENT-VAR to each unique element indexed,\nand ELEMENT-COUNT to the number of times that ELEMENT-VAR occurs in BAG.\nBODY is executed once within the scope of each binding of ELEMENT-VAR\nand ELEMENT-COUNT. Iteration halts as soon as DONE becomes non-nil.")
    public static SubLObject do_bag_unique(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = NIL;
        SubLObject element_count = NIL;
        SubLObject v_bag = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        element_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        element_count = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        v_bag = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list55);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list55);
            if (NIL == member(current_$6, $list34, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
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
        return list(PROGN, listS(DO_BAG_REPEAT_CONTENTS_UNIQUE, list(element_var, element_count, list(DO_BAG_REPEAT_INTERNAL, v_bag), $DONE, done), append(body, NIL)), list(PUNLESS, done, list(CLET, list(bq_cons(element_count, $list59)), listS(DO_BAG_UNIQUE_CONTENTS, list(element_var, list(DO_BAG_UNIQUE_INTERNAL, v_bag), $DONE, done), append(body, NIL)))));
    }

    /**
     * Iterate over BAG, binding ELEMENT-VAR to each element indexed.
     * BODY is executed once within the scope of each binding of ELEMENT-VAR.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over BAG, binding ELEMENT-VAR to each element indexed.\r\nBODY is executed once within the scope of each binding of ELEMENT-VAR.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over BAG, binding ELEMENT-VAR to each element indexed.\nBODY is executed once within the scope of each binding of ELEMENT-VAR.\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_bag_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt59);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject element_var = NIL;
                    SubLObject v_bag = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    element_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    v_bag = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_9 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt59);
                            current_9 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt59);
                            if (NIL == member(current_9, $list_alt31, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_9 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt59);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject current_element = $sym60$CURRENT_ELEMENT;
                                SubLObject index = $sym61$INDEX;
                                SubLObject element_count = $sym62$ELEMENT_COUNT;
                                return list(DO_BAG_UNIQUE, list(current_element, element_count, v_bag, $DONE, done), list(CDOTIMES, list(index, element_count), listS(CLET, list(list(element_var, current_element)), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Iterate over BAG, binding ELEMENT-VAR to each element indexed.\r\nBODY is executed once within the scope of each binding of ELEMENT-VAR.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over BAG, binding ELEMENT-VAR to each element indexed.\nBODY is executed once within the scope of each binding of ELEMENT-VAR.\nIteration halts as soon as DONE becomes non-nil.")
    public static SubLObject do_bag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = NIL;
        SubLObject v_bag = NIL;
        destructuring_bind_must_consp(current, datum, $list62);
        element_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        v_bag = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list62);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list62);
            if (NIL == member(current_$7, $list34, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list62);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject current_element = $sym63$CURRENT_ELEMENT;
        final SubLObject index = $sym64$INDEX;
        final SubLObject element_count = $sym65$ELEMENT_COUNT;
        return list(DO_BAG_UNIQUE, list(current_element, element_count, v_bag, $DONE, done), list(CDOTIMES, list(index, element_count), listS(CLET, list(list(element_var, current_element)), append(body, NIL))));
    }

    public static final SubLObject do_bag_repeat_internal_alt(SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        return bag_struct_repeat_contents(v_bag);
    }

    public static SubLObject do_bag_repeat_internal(final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        return bag_struct_repeat_contents(v_bag);
    }

    public static final SubLObject do_bag_unique_internal_alt(SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        return bag_struct_unique_contents(v_bag);
    }

    public static SubLObject do_bag_unique_internal(final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        return bag_struct_unique_contents(v_bag);
    }

    /**
     * Map across BAG, applying FUNCTION to each element and ARGS
     * FUNCTION should have a formal parameter list of at least (element).
     *
     * @return NIL
     */
    @LispMethod(comment = "Map across BAG, applying FUNCTION to each element and ARGS\r\nFUNCTION should have a formal parameter list of at least (element).\r\n\r\n@return NIL\nMap across BAG, applying FUNCTION to each element and ARGS\nFUNCTION should have a formal parameter list of at least (element).")
    public static final SubLObject map_bag_alt(SubLObject function, SubLObject v_bag, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        map_bag_repeat_contents(function, bag_struct_repeat_contents(v_bag), args);
        map_bag_unique_contents(function, bag_struct_unique_contents(v_bag), args);
        return NIL;
    }

    @LispMethod(comment = "Map across BAG, applying FUNCTION to each element and ARGS\r\nFUNCTION should have a formal parameter list of at least (element).\r\n\r\n@return NIL\nMap across BAG, applying FUNCTION to each element and ARGS\nFUNCTION should have a formal parameter list of at least (element).")
    public static SubLObject map_bag(final SubLObject function, final SubLObject v_bag, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        map_bag_repeat_contents(function, bag_struct_repeat_contents(v_bag), args);
        map_bag_unique_contents(function, bag_struct_unique_contents(v_bag), args);
        return NIL;
    }

    /**
     * Return a list of all the elements of BAG.
     */
    @LispMethod(comment = "Return a list of all the elements of BAG.")
    public static final SubLObject bag_element_list_alt(SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        return nconc(bag_repeat_contents_element_list(bag_struct_repeat_contents(v_bag)), bag_unique_contents_element_list(bag_struct_unique_contents(v_bag)));
    }

    @LispMethod(comment = "Return a list of all the elements of BAG.")
    public static SubLObject bag_element_list(final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        return nconc(bag_repeat_contents_element_list(bag_struct_repeat_contents(v_bag)), bag_unique_contents_element_list(bag_struct_unique_contents(v_bag)));
    }

    /**
     * Return a list version of the single-set projection of the BAG.
     * This is equivalent to (REMOVE-DUPLICATES (BAG-ELEMENT-LIST BAG))
     */
    @LispMethod(comment = "Return a list version of the single-set projection of the BAG.\r\nThis is equivalent to (REMOVE-DUPLICATES (BAG-ELEMENT-LIST BAG))\nReturn a list version of the single-set projection of the BAG.\nThis is equivalent to (REMOVE-DUPLICATES (BAG-ELEMENT-LIST BAG))")
    public static final SubLObject bag_unique_element_list_alt(SubLObject v_bag) {
        SubLTrampolineFile.checkType(v_bag, BAG_P);
        return nconc(bag_repeat_contents_unique_element_list(bag_struct_repeat_contents(v_bag)), bag_unique_contents_unique_element_list(bag_struct_unique_contents(v_bag)));
    }

    @LispMethod(comment = "Return a list version of the single-set projection of the BAG.\r\nThis is equivalent to (REMOVE-DUPLICATES (BAG-ELEMENT-LIST BAG))\nReturn a list version of the single-set projection of the BAG.\nThis is equivalent to (REMOVE-DUPLICATES (BAG-ELEMENT-LIST BAG))")
    public static SubLObject bag_unique_element_list(final SubLObject v_bag) {
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        return nconc(bag_repeat_contents_unique_element_list(bag_struct_repeat_contents(v_bag)), bag_unique_contents_unique_element_list(bag_struct_unique_contents(v_bag)));
    }

    /**
     * Return a list of (ELEMENT . COUNT) tuples for the unique elements
     * in the BAG.
     */
    @LispMethod(comment = "Return a list of (ELEMENT . COUNT) tuples for the unique elements\r\nin the BAG.\nReturn a list of (ELEMENT . COUNT) tuples for the unique elements\nin the BAG.")
    public static final SubLObject bag_element_count_list_alt(SubLObject v_bag) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_bag, BAG_P);
            {
                SubLObject element_count_list = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(do_bag_repeat_internal(v_bag));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject count = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        element_count_list = cons(cons(element, count), element_count_list);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                {
                    SubLObject count = ONE_INTEGER;
                    SubLObject set_contents_var = do_bag_unique_internal(v_bag);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                                element_count_list = cons(cons(element, count), element_count_list);
                            }
                        }
                    }
                }
                return element_count_list;
            }
        }
    }

    @LispMethod(comment = "Return a list of (ELEMENT . COUNT) tuples for the unique elements\r\nin the BAG.\nReturn a list of (ELEMENT . COUNT) tuples for the unique elements\nin the BAG.")
    public static SubLObject bag_element_count_list(final SubLObject v_bag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != bag_p(v_bag) : "! bag.bag_p(v_bag) " + ("bag.bag_p(v_bag) " + "CommonSymbols.NIL != bag.bag_p(v_bag) ") + v_bag;
        SubLObject element_count_list = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(do_bag_repeat_internal(v_bag)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            element_count_list = cons(cons(element, count), element_count_list);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject count2 = ONE_INTEGER;
        final SubLObject set_contents_var = do_bag_unique_internal(v_bag);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element2 = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element2)) {
                element_count_list = cons(cons(element2, count2), element_count_list);
            }
        }
        return element_count_list;
    }

    public static final SubLObject cfasl_output_object_bag_method_alt(SubLObject v_object, SubLObject stream) {
        return cfasl_output_bag(v_object, stream);
    }

    public static SubLObject cfasl_output_object_bag_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_bag(v_object, stream);
    }

    public static final SubLObject cfasl_output_bag_alt(SubLObject v_object, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cfasl_raw_write_byte($cfasl_opcode_bag$.getGlobalValue(), stream);
            {
                SubLObject test = hash_table_utilities.hash_test_to_symbol(bag_test(v_object));
                SubLObject size = bag_size(v_object);
                cfasl_output(test, stream);
                cfasl_output(size, stream);
                cfasl_output(bag_unique_size(v_object), stream);
                {
                    SubLObject singletons = bag_unique_contents_unique_size(bag_struct_unique_contents(v_object));
                    SubLObject multis = bag_repeat_contents_unique_size(bag_struct_repeat_contents(v_object));
                    cfasl_output(singletons, stream);
                    {
                        SubLObject set_contents_var = bag_struct_unique_contents(v_object);
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
                    cfasl_output(multis, stream);
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(bag_struct_repeat_contents(v_object));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject count = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                cfasl_output(element, stream);
                                cfasl_output(count, stream);
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
            }
            return v_object;
        }
    }

    public static SubLObject cfasl_output_bag(final SubLObject v_object, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_raw_write_byte($cfasl_opcode_bag$.getGlobalValue(), stream);
        final SubLObject test = hash_table_utilities.hash_test_to_symbol(bag_test(v_object));
        final SubLObject size = bag_size(v_object);
        cfasl_output(test, stream);
        cfasl_output(size, stream);
        cfasl_output(bag_unique_size(v_object), stream);
        final SubLObject singletons = bag_unique_contents_unique_size(bag_struct_unique_contents(v_object));
        final SubLObject multis = bag_repeat_contents_unique_size(bag_struct_repeat_contents(v_object));
        cfasl_output(singletons, stream);
        final SubLObject set_contents_var = bag_struct_unique_contents(v_object);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                cfasl_output(element, stream);
            }
        }
        cfasl_output(multis, stream);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(bag_struct_repeat_contents(v_object)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject element2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            cfasl_output(element2, stream);
            cfasl_output(count, stream);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return v_object;
    }

    public static final SubLObject cfasl_input_bag_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject unique_element_count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                SubLObject singletons = NIL;
                SubLObject multis = NIL;
                SubLObject unique_collisions = NIL;
                SubLObject v_bag = NIL;
                SubLObject bag_unique_contents = NIL;
                SubLObject bag_repeat_contents = NIL;
                SubLObject pcase_var = test;
                if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
                    test = symbol_function(test);
                }
                singletons = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                bag_unique_contents = set_contents.new_set_contents(singletons, test);
                unique_collisions = dictionary_contents.new_dictionary_contents(ZERO_INTEGER, test);
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(singletons); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject element = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                            if (NIL != dictionary_contents.dictionary_contents_lookup_without_values(unique_collisions, element, test, NIL)) {
                                {
                                    SubLObject old_count = dictionary_contents.dictionary_contents_lookup_without_values(unique_collisions, element, test, ZERO_INTEGER);
                                    unique_collisions = dictionary_contents.dictionary_contents_enter(unique_collisions, element, add(old_count, ONE_INTEGER), test);
                                }
                            } else {
                                if (NIL != set_contents.set_contents_memberP(element, bag_unique_contents, test)) {
                                    bag_unique_contents = set_contents.set_contents_delete(element, bag_unique_contents, test);
                                    unique_collisions = dictionary_contents.dictionary_contents_enter(unique_collisions, element, TWO_INTEGER, test);
                                } else {
                                    bag_unique_contents = set_contents.set_contents_add(element, bag_unique_contents, test);
                                }
                            }
                        }
                    }
                }
                multis = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject repeats_from_unique_collisions = dictionary_contents.dictionary_contents_size(unique_collisions);
                    SubLObject repeat_contents_size = add(multis, repeats_from_unique_collisions);
                    bag_repeat_contents = dictionary_contents.new_dictionary_contents(repeat_contents_size, test);
                }
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(multis); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject element = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                            SubLObject count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                            SubLObject old_count = dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, ZERO_INTEGER);
                            bag_repeat_contents = dictionary_contents.dictionary_contents_enter(bag_repeat_contents, element, add(old_count, count), test);
                        }
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(unique_collisions);
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject count = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject old_count = dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, ZERO_INTEGER);
                                bag_repeat_contents = dictionary_contents.dictionary_contents_enter(bag_repeat_contents, element, add(old_count, count), test);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject repeat_size = subtract(size, set_contents.set_contents_size(bag_unique_contents));
                    v_bag = make_new_bag(test, repeat_size, bag_unique_contents, bag_repeat_contents);
                }
                {
                    SubLObject actual_unique_element_count = add(bag_unique_contents_unique_size(bag_unique_contents), bag_repeat_contents_unique_size(bag_repeat_contents));
                    if (NIL != dictionary_contents.dictionary_contents_empty_p(unique_collisions)) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!unique_element_count.numE(actual_unique_element_count)) {
                                Errors.error($str_alt67$CFASL_loaded_bag__A_does_not_have, v_bag, unique_element_count);
                            }
                        }
                    } else {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!unique_element_count.numGE(actual_unique_element_count)) {
                                Errors.error($str_alt68$CFASL_loaded_bag__A_has_more_than, v_bag, unique_element_count);
                            }
                        }
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!size.numE(bag_size(v_bag))) {
                            Errors.error($str_alt69$CFASL_loaded_bag__A_does_not_repr, v_bag, size);
                        }
                    }
                }
                return v_bag;
            }
        }
    }

    public static SubLObject cfasl_input_bag(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject unique_element_count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject singletons = NIL;
        SubLObject multis = NIL;
        SubLObject unique_collisions = NIL;
        SubLObject v_bag = NIL;
        SubLObject bag_unique_contents = NIL;
        SubLObject bag_repeat_contents = NIL;
        final SubLObject pcase_var = test;
        if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
            test = symbol_function(test);
        }
        singletons = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        bag_unique_contents = set_contents.new_set_contents(singletons, test);
        unique_collisions = dictionary_contents.new_dictionary_contents(ZERO_INTEGER, test);
        SubLObject i;
        SubLObject element;
        SubLObject old_count;
        for (i = NIL, i = ZERO_INTEGER; i.numL(singletons); i = add(i, ONE_INTEGER)) {
            element = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            if (NIL != dictionary_contents.dictionary_contents_lookup_without_values(unique_collisions, element, test, NIL)) {
                old_count = dictionary_contents.dictionary_contents_lookup_without_values(unique_collisions, element, test, ZERO_INTEGER);
                unique_collisions = dictionary_contents.dictionary_contents_enter(unique_collisions, element, add(old_count, ONE_INTEGER), test);
            } else
                if (NIL != set_contents.set_contents_memberP(element, bag_unique_contents, test)) {
                    bag_unique_contents = set_contents.set_contents_delete(element, bag_unique_contents, test);
                    unique_collisions = dictionary_contents.dictionary_contents_enter(unique_collisions, element, TWO_INTEGER, test);
                } else {
                    bag_unique_contents = set_contents.set_contents_add(element, bag_unique_contents, test);
                }

        }
        multis = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject repeats_from_unique_collisions = dictionary_contents.dictionary_contents_size(unique_collisions);
        final SubLObject repeat_contents_size = add(multis, repeats_from_unique_collisions);
        bag_repeat_contents = dictionary_contents.new_dictionary_contents(repeat_contents_size, test);
        SubLObject count;
        SubLObject old_count2;
        for (i = NIL, i = ZERO_INTEGER; i.numL(multis); i = add(i, ONE_INTEGER)) {
            element = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            old_count2 = dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, ZERO_INTEGER);
            bag_repeat_contents = dictionary_contents.dictionary_contents_enter(bag_repeat_contents, element, add(old_count2, count), test);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(unique_collisions); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            old_count2 = dictionary_contents.dictionary_contents_lookup_without_values(bag_repeat_contents, element, test, ZERO_INTEGER);
            bag_repeat_contents = dictionary_contents.dictionary_contents_enter(bag_repeat_contents, element, add(old_count2, count), test);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject repeat_size = subtract(size, set_contents.set_contents_size(bag_unique_contents));
        v_bag = make_new_bag(test, repeat_size, bag_unique_contents, bag_repeat_contents);
        final SubLObject actual_unique_element_count = add(bag_unique_contents_unique_size(bag_unique_contents), bag_repeat_contents_unique_size(bag_repeat_contents));
        if (NIL != dictionary_contents.dictionary_contents_empty_p(unique_collisions)) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!unique_element_count.numE(actual_unique_element_count))) {
                Errors.error($str70$CFASL_loaded_bag__A_does_not_have, v_bag, unique_element_count);
            }
        } else
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!unique_element_count.numGE(actual_unique_element_count))) {
                Errors.error($str71$CFASL_loaded_bag__A_has_more_than, v_bag, unique_element_count);
            }

        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!size.numE(bag_size(v_bag)))) {
            Errors.error($str72$CFASL_loaded_bag__A_does_not_repr, v_bag, size);
        }
        return v_bag;
    }

    public static final SubLObject bag_unit_test_kitchen_sink_alt(SubLObject test_keys, SubLObject test_counts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bag = new_bag(UNPROVIDED, UNPROVIDED);
                SubLObject items = ZERO_INTEGER;
                if (NIL == bag_emptyP(v_bag)) {
                    return $$$bag_not_empty;
                }
                {
                    SubLObject cdolist_list_var = test_keys;
                    SubLObject key = NIL;
                    for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(test_counts); i = add(i, ONE_INTEGER)) {
                                if (!items.numE(bag_size(v_bag))) {
                                    return $str_alt79$bag_size____item_count;
                                }
                                if (!i.numE(bag_member_count(key, v_bag))) {
                                    return $str_alt80$bag_member_count_out_of_whack;
                                }
                                bag_add(key, v_bag);
                                if (NIL == bag_memberP(key, v_bag)) {
                                    return $$$added_bag_members_not_findable;
                                }
                                items = add(items, ONE_INTEGER);
                            }
                        }
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(do_bag_repeat_internal(v_bag));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject element_count = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == subl_promotions.memberP(element, test_keys, UNPROVIDED, UNPROVIDED)) {
                                return $$$cannot_find_existing_member_again;
                            }
                            if (!element_count.numE(test_counts)) {
                                return $str_alt83$do_bag_existing_element_not_there;
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    {
                        SubLObject element_count = ONE_INTEGER;
                        SubLObject set_contents_var = do_bag_unique_internal(v_bag);
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                                    if (NIL == subl_promotions.memberP(element, test_keys, UNPROVIDED, UNPROVIDED)) {
                                        return $$$cannot_find_existing_member_again;
                                    }
                                    if (!element_count.numE(test_counts)) {
                                        return $str_alt83$do_bag_existing_element_not_there;
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = test_keys;
                    SubLObject key = NIL;
                    for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                        if (!bag_member_count(key, v_bag).numE(test_counts)) {
                            return $str_alt84$do_list_existing_element_not_ther;
                        }
                    }
                }
                {
                    SubLObject iterator_var = new_bag_iterator(v_bag);
                    SubLObject done_var = NIL;
                    while (NIL == done_var) {
                        thread.resetMultipleValues();
                        {
                            SubLObject key = iteration.iteration_next(iterator_var);
                            SubLObject valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                if (!bag_member_count(key, v_bag).numE(test_counts)) {
                                    return $str_alt85$iterator_existing_element_not_the;
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
                {
                    SubLObject bag_keys = bag_unique_element_list(v_bag);
                    if (NIL != list_utilities.set_differenceP(bag_keys, test_keys, UNPROVIDED, UNPROVIDED)) {
                        return $$$unique_element_list_wrong;
                    }
                }
                {
                    SubLObject bag_element_counts = bag_element_count_list(v_bag);
                    SubLObject cdolist_list_var = bag_element_counts;
                    SubLObject element_and_count = NIL;
                    for (element_and_count = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element_and_count = cdolist_list_var.first()) {
                        {
                            SubLObject datum = element_and_count;
                            SubLObject current = datum;
                            SubLObject element = NIL;
                            SubLObject element_count = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt87);
                            element = current.first();
                            current = current.rest();
                            element_count = current;
                            if (NIL == subl_promotions.memberP(element, test_keys, UNPROVIDED, UNPROVIDED)) {
                                return $str_alt88$bag_element_count_tuple_contains_;
                            }
                            if (!element_count.numE(test_counts)) {
                                return $str_alt89$bag_element_count_tuple_contains_;
                            }
                        }
                    }
                }
                if (NIL == list_utilities.lengthE(bag_element_list(v_bag), multiply(length(test_keys), test_counts), UNPROVIDED)) {
                    return $$$list_of_elements_has_bogus_length;
                }
                {
                    SubLObject byte_vector = NIL;
                    SubLObject duplicate_bag = NIL;
                    {
                        SubLObject stream = new_cfasl_encoding_stream();
                        try {
                            cfasl_output(v_bag, stream);
                            byte_vector = cfasl_encoding_stream_encoding(stream);
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    close_cfasl_encoding_stream(stream);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                    {
                        SubLObject stream = new_cfasl_decoding_stream(byte_vector);
                        try {
                            duplicate_bag = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    close_cfasl_decoding_stream(stream);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                    if (!bag_size(v_bag).numE(bag_size(duplicate_bag))) {
                        return $str_alt91$CFASLed_bag_has_different_size_;
                    }
                    if (!bag_unique_size(v_bag).numE(bag_unique_size(duplicate_bag))) {
                        return $str_alt92$CFASLed_bag_has_different_unique_;
                    }
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(do_bag_repeat_internal(duplicate_bag));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject times = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL == bag_memberP(element, v_bag)) {
                                    return $str_alt93$CFASLed_bag_does_not_contain_elem;
                                }
                                if (!times.numE(bag_member_count(element, v_bag))) {
                                    return $str_alt94$CFASLed_bag_does_not_contain_elem;
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        {
                            SubLObject times = ONE_INTEGER;
                            SubLObject set_contents_var = do_bag_unique_internal(duplicate_bag);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                                        if (NIL == bag_memberP(element, v_bag)) {
                                            return $str_alt93$CFASLed_bag_does_not_contain_elem;
                                        }
                                        if (!times.numE(bag_member_count(element, v_bag))) {
                                            return $str_alt94$CFASLed_bag_does_not_contain_elem;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = test_keys;
                    SubLObject key = NIL;
                    for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(test_counts); i = add(i, ONE_INTEGER)) {
                                if (!items.numE(bag_size(v_bag))) {
                                    return $str_alt95$removing_items_whacks_bag_size;
                                }
                                if (!subtract(test_counts, i).numE(bag_member_count(key, v_bag))) {
                                    return $str_alt96$removing_items_whacks_member_coun;
                                }
                                bag_remove(key, v_bag);
                                items = subtract(items, ONE_INTEGER);
                            }
                        }
                    }
                }
                if (NIL == bag_emptyP(v_bag)) {
                    return $$$emptied_bag_is_not_empty;
                }
                return $SUCCESS;
            }
        }
    }

    public static SubLObject bag_unit_test_kitchen_sink(final SubLObject test_keys, final SubLObject test_counts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_bag = new_bag(UNPROVIDED, UNPROVIDED);
        SubLObject items = ZERO_INTEGER;
        if (NIL == bag_emptyP(v_bag)) {
            return $$$bag_not_empty;
        }
        SubLObject cdolist_list_var = test_keys;
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(test_counts); i = add(i, ONE_INTEGER)) {
                if (!items.numE(bag_size(v_bag))) {
                    return $str81$bag_size____item_count;
                }
                if (!i.numE(bag_member_count(key, v_bag))) {
                    return $str82$bag_member_count_out_of_whack;
                }
                bag_add(key, v_bag);
                if (NIL == bag_memberP(key, v_bag)) {
                    return $$$added_bag_members_not_findable;
                }
                items = add(items, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(do_bag_repeat_internal(v_bag)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject element = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject element_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == subl_promotions.memberP(element, test_keys, UNPROVIDED, UNPROVIDED)) {
                return $$$cannot_find_existing_member_again;
            }
            if (!element_count.numE(test_counts)) {
                return $str85$do_bag_existing_element_not_there;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject element_count2 = ONE_INTEGER;
        final SubLObject set_contents_var = do_bag_unique_internal(v_bag);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element2 = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element2)) {
                if (NIL == subl_promotions.memberP(element2, test_keys, UNPROVIDED, UNPROVIDED)) {
                    return $$$cannot_find_existing_member_again;
                }
                if (!element_count2.numE(test_counts)) {
                    return $str85$do_bag_existing_element_not_there;
                }
            }
        }
        cdolist_list_var = test_keys;
        key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!bag_member_count(key, v_bag).numE(test_counts)) {
                return $str86$do_list_existing_element_not_ther;
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        final SubLObject iterator_var = new_bag_iterator(v_bag);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject key2 = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != valid) && (!bag_member_count(key2, v_bag).numE(test_counts))) {
                return $str87$iterator_existing_element_not_the;
            }
        }
        final SubLObject bag_keys = bag_unique_element_list(v_bag);
        if (NIL != list_utilities.set_differenceP(bag_keys, test_keys, UNPROVIDED, UNPROVIDED)) {
            return $$$unique_element_list_wrong;
        }
        SubLObject cdolist_list_var2;
        final SubLObject bag_element_counts = cdolist_list_var2 = bag_element_count_list(v_bag);
        SubLObject element_and_count = NIL;
        element_and_count = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = element_and_count;
            element2 = NIL;
            SubLObject element_count3 = NIL;
            destructuring_bind_must_consp(current, datum, $list89);
            element2 = current.first();
            current = element_count3 = current.rest();
            if (NIL == subl_promotions.memberP(element2, test_keys, UNPROVIDED, UNPROVIDED)) {
                return $str90$bag_element_count_tuple_contains_;
            }
            if (!element_count3.numE(test_counts)) {
                return $str91$bag_element_count_tuple_contains_;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            element_and_count = cdolist_list_var2.first();
        } 
        if (NIL == list_utilities.lengthE(bag_element_list(v_bag), multiply(length(test_keys), test_counts), UNPROVIDED)) {
            return $$$list_of_elements_has_bogus_length;
        }
        SubLObject byte_vector = NIL;
        SubLObject duplicate_bag = NIL;
        SubLObject stream = new_cfasl_encoding_stream();
        try {
            cfasl_output(v_bag, stream);
            byte_vector = cfasl_encoding_stream_encoding(stream);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close_cfasl_encoding_stream(stream);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        stream = new_cfasl_decoding_stream(byte_vector);
        try {
            duplicate_bag = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close_cfasl_decoding_stream(stream);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (!bag_size(v_bag).numE(bag_size(duplicate_bag))) {
            return $str93$CFASLed_bag_has_different_size_;
        }
        if (!bag_unique_size(v_bag).numE(bag_unique_size(duplicate_bag))) {
            return $str94$CFASLed_bag_has_different_unique_;
        }
        SubLObject iteration_state2;
        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(do_bag_repeat_internal(duplicate_bag)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
            thread.resetMultipleValues();
            final SubLObject element3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
            final SubLObject times = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == bag_memberP(element3, v_bag)) {
                return $str95$CFASLed_bag_does_not_contain_elem;
            }
            if (!times.numE(bag_member_count(element3, v_bag))) {
                return $str96$CFASLed_bag_does_not_contain_elem;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
        final SubLObject times2 = ONE_INTEGER;
        final SubLObject set_contents_var2 = do_bag_unique_internal(duplicate_bag);
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject element4;
        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
            element4 = set_contents.do_set_contents_next(basis_object2, state2);
            if (NIL != set_contents.do_set_contents_element_validP(state2, element4)) {
                if (NIL == bag_memberP(element4, v_bag)) {
                    return $str95$CFASLed_bag_does_not_contain_elem;
                }
                if (!times2.numE(bag_member_count(element4, v_bag))) {
                    return $str96$CFASLed_bag_does_not_contain_elem;
                }
            }
        }
        cdolist_list_var = test_keys;
        key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(test_counts); i = add(i, ONE_INTEGER)) {
                if (!items.numE(bag_size(v_bag))) {
                    return $str97$removing_items_whacks_bag_size;
                }
                if (!subtract(test_counts, i).numE(bag_member_count(key, v_bag))) {
                    return $str98$removing_items_whacks_member_coun;
                }
                bag_remove(key, v_bag);
                items = subtract(items, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        if (NIL == bag_emptyP(v_bag)) {
            return $$$emptied_bag_is_not_empty;
        }
        return $SUCCESS;
    }

    public static SubLObject declare_bag_file() {
        declareFunction("bag_print_function_trampoline", "BAG-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("bag_p", "BAG-P", 1, 0, false);
        new bag.$bag_p$UnaryFunction();
        declareFunction("bag_struct_unique_contents", "BAG-STRUCT-UNIQUE-CONTENTS", 1, 0, false);
        declareFunction("bag_struct_repeat_contents", "BAG-STRUCT-REPEAT-CONTENTS", 1, 0, false);
        declareFunction("bag_struct_repeat_size", "BAG-STRUCT-REPEAT-SIZE", 1, 0, false);
        declareFunction("bag_struct_test", "BAG-STRUCT-TEST", 1, 0, false);
        declareFunction("_csetf_bag_struct_unique_contents", "_CSETF-BAG-STRUCT-UNIQUE-CONTENTS", 2, 0, false);
        declareFunction("_csetf_bag_struct_repeat_contents", "_CSETF-BAG-STRUCT-REPEAT-CONTENTS", 2, 0, false);
        declareFunction("_csetf_bag_struct_repeat_size", "_CSETF-BAG-STRUCT-REPEAT-SIZE", 2, 0, false);
        declareFunction("_csetf_bag_struct_test", "_CSETF-BAG-STRUCT-TEST", 2, 0, false);
        declareFunction("make_bag", "MAKE-BAG", 0, 1, false);
        declareFunction("visit_defstruct_bag", "VISIT-DEFSTRUCT-BAG", 2, 0, false);
        declareFunction("visit_defstruct_object_bag_method", "VISIT-DEFSTRUCT-OBJECT-BAG-METHOD", 2, 0, false);
        declareFunction("print_bag", "PRINT-BAG", 3, 0, false);
        declareFunction("make_new_bag", "MAKE-NEW-BAG", 4, 0, false);
        declareFunction("new_bag_repeat_contents", "NEW-BAG-REPEAT-CONTENTS", 2, 0, false);
        declareFunction("copy_bag_repeat_contents", "COPY-BAG-REPEAT-CONTENTS", 1, 0, false);
        declareFunction("bag_repeat_contents_unique_size", "BAG-REPEAT-CONTENTS-UNIQUE-SIZE", 1, 0, false);
        declareFunction("bag_repeat_contents_emptyP", "BAG-REPEAT-CONTENTS-EMPTY?", 1, 0, false);
        declareFunction("bag_repeat_contents_member_count", "BAG-REPEAT-CONTENTS-MEMBER-COUNT", 3, 0, false);
        declareFunction("bag_repeat_contents_memberP", "BAG-REPEAT-CONTENTS-MEMBER?", 3, 0, false);
        declareFunction("bag_repeat_contents_matching_element", "BAG-REPEAT-CONTENTS-MATCHING-ELEMENT", 3, 0, false);
        declareFunction("bag_repeat_contents_random_element", "BAG-REPEAT-CONTENTS-RANDOM-ELEMENT", 1, 0, false);
        declareFunction("bag_repeat_contents_add", "BAG-REPEAT-CONTENTS-ADD", 3, 0, false);
        declareFunction("bag_repeat_contents_delete", "BAG-REPEAT-CONTENTS-DELETE", 3, 0, false);
        declareFunction("bag_repeat_contents_delete_all", "BAG-REPEAT-CONTENTS-DELETE-ALL", 3, 0, false);
        declareFunction("clear_bag_repeat_contents", "CLEAR-BAG-REPEAT-CONTENTS", 1, 0, false);
        declareMacro("do_bag_repeat_contents_unique", "DO-BAG-REPEAT-CONTENTS-UNIQUE");
        declareMacro("do_bag_repeat_contents", "DO-BAG-REPEAT-CONTENTS");
        declareFunction("map_bag_repeat_contents", "MAP-BAG-REPEAT-CONTENTS", 2, 1, false);
        declareFunction("bag_repeat_contents_element_list", "BAG-REPEAT-CONTENTS-ELEMENT-LIST", 1, 0, false);
        declareFunction("bag_repeat_contents_unique_element_list", "BAG-REPEAT-CONTENTS-UNIQUE-ELEMENT-LIST", 1, 0, false);
        declareFunction("make_bag_iterator_state", "MAKE-BAG-ITERATOR-STATE", 1, 0, false);
        declareFunction("iterate_bag_done", "ITERATE-BAG-DONE", 1, 0, false);
        declareFunction("iterate_bag_next", "ITERATE-BAG-NEXT", 1, 0, false);
        declareFunction("new_bag_repeat_contents_iterator", "NEW-BAG-REPEAT-CONTENTS-ITERATOR", 1, 0, false);
        declareFunction("new_bag_unique_contents", "NEW-BAG-UNIQUE-CONTENTS", 2, 0, false);
        declareFunction("copy_bag_unique_contents", "COPY-BAG-UNIQUE-CONTENTS", 1, 0, false);
        declareFunction("bag_unique_contents_unique_size", "BAG-UNIQUE-CONTENTS-UNIQUE-SIZE", 1, 0, false);
        declareFunction("bag_unique_contents_emptyP", "BAG-UNIQUE-CONTENTS-EMPTY?", 1, 0, false);
        declareFunction("bag_unique_contents_memberP", "BAG-UNIQUE-CONTENTS-MEMBER?", 3, 0, false);
        declareFunction("bag_unique_contents_member_count", "BAG-UNIQUE-CONTENTS-MEMBER-COUNT", 3, 0, false);
        declareFunction("bag_unique_contents_matching_element", "BAG-UNIQUE-CONTENTS-MATCHING-ELEMENT", 3, 0, false);
        declareFunction("bag_unique_contents_random_element", "BAG-UNIQUE-CONTENTS-RANDOM-ELEMENT", 1, 0, false);
        declareFunction("bag_unique_contents_add", "BAG-UNIQUE-CONTENTS-ADD", 3, 0, false);
        declareFunction("bag_unique_contents_delete", "BAG-UNIQUE-CONTENTS-DELETE", 3, 0, false);
        declareFunction("bag_unique_contents_delete_all", "BAG-UNIQUE-CONTENTS-DELETE-ALL", 3, 0, false);
        declareFunction("clear_bag_unique_contents", "CLEAR-BAG-UNIQUE-CONTENTS", 1, 0, false);
        declareMacro("do_bag_unique_contents", "DO-BAG-UNIQUE-CONTENTS");
        declareFunction("map_bag_unique_contents", "MAP-BAG-UNIQUE-CONTENTS", 2, 1, false);
        declareFunction("bag_unique_contents_element_list", "BAG-UNIQUE-CONTENTS-ELEMENT-LIST", 1, 0, false);
        declareFunction("bag_unique_contents_unique_element_list", "BAG-UNIQUE-CONTENTS-UNIQUE-ELEMENT-LIST", 1, 0, false);
        declareFunction("new_bag_unique_contents_iterator", "NEW-BAG-UNIQUE-CONTENTS-ITERATOR", 1, 0, false);
        declareFunction("new_bag_contents_iterator", "NEW-BAG-CONTENTS-ITERATOR", 2, 0, false);
        declareFunction("new_bag", "NEW-BAG", 0, 2, false);
        declareFunction("copy_bag", "COPY-BAG", 1, 0, false);
        declareFunction("new_bag_from_elements", "NEW-BAG-FROM-ELEMENTS", 1, 2, false);
        declareFunction("bag_test", "BAG-TEST", 1, 0, false);
        declareFunction("bag_size", "BAG-SIZE", 1, 0, false);
        declareFunction("bag_unique_size", "BAG-UNIQUE-SIZE", 1, 0, false);
        declareFunction("bag_emptyP", "BAG-EMPTY?", 1, 0, false);
        declareFunction("empty_bag_p", "EMPTY-BAG-P", 1, 0, false);
        declareFunction("non_empty_bag_p", "NON-EMPTY-BAG-P", 1, 0, false);
        declareFunction("bag_memberP", "BAG-MEMBER?", 2, 0, false);
        declareFunction("bag_member_count", "BAG-MEMBER-COUNT", 2, 0, false);
        declareFunction("bag_matching_element", "BAG-MATCHING-ELEMENT", 2, 0, false);
        declareFunction("bag_random_element", "BAG-RANDOM-ELEMENT", 1, 0, false);
        declareFunction("bag_add", "BAG-ADD", 2, 0, false);
        declareFunction("bag_remove", "BAG-REMOVE", 2, 0, false);
        declareFunction("bag_remove_all", "BAG-REMOVE-ALL", 2, 0, false);
        declareFunction("clear_bag", "CLEAR-BAG", 1, 0, false);
        declareFunction("bag_intersection", "BAG-INTERSECTION", 2, 0, false);
        declareFunction("bag_union", "BAG-UNION", 2, 0, false);
        declareFunction("new_bag_iterator", "NEW-BAG-ITERATOR", 1, 0, false);
        declareMacro("do_bag_unique", "DO-BAG-UNIQUE");
        declareMacro("do_bag", "DO-BAG");
        declareFunction("do_bag_repeat_internal", "DO-BAG-REPEAT-INTERNAL", 1, 0, false);
        declareFunction("do_bag_unique_internal", "DO-BAG-UNIQUE-INTERNAL", 1, 0, false);
        declareFunction("map_bag", "MAP-BAG", 2, 1, false);
        declareFunction("bag_element_list", "BAG-ELEMENT-LIST", 1, 0, false);
        declareFunction("bag_unique_element_list", "BAG-UNIQUE-ELEMENT-LIST", 1, 0, false);
        declareFunction("bag_element_count_list", "BAG-ELEMENT-COUNT-LIST", 1, 0, false);
        declareFunction("cfasl_output_object_bag_method", "CFASL-OUTPUT-OBJECT-BAG-METHOD", 2, 0, false);
        declareFunction("cfasl_output_bag", "CFASL-OUTPUT-BAG", 2, 0, false);
        declareFunction("cfasl_input_bag", "CFASL-INPUT-BAG", 1, 0, false);
        declareFunction("bag_unit_test_kitchen_sink", "BAG-UNIT-TEST-KITCHEN-SINK", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_bag_file() {
        defconstant("*DTP-BAG*", BAG);
        deflexical("*BAG-REPEAT-CONTENTS-ITERATOR-WATERMARK*", EIGHT_INTEGER);
        deflexical("*NEW-BAG-DEFAULT-TEST-FUNCTION*", symbol_function(EQL));
        defconstant("*CFASL-OPCODE-BAG*", $int$62);
        return NIL;
    }

    public static final SubLObject setup_bag_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_bag$.getGlobalValue(), symbol_function(BAG_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(BAG_STRUCT_UNIQUE_CONTENTS, _CSETF_BAG_STRUCT_UNIQUE_CONTENTS);
        def_csetf(BAG_STRUCT_REPEAT_CONTENTS, _CSETF_BAG_STRUCT_REPEAT_CONTENTS);
        def_csetf(BAG_STRUCT_REPEAT_SIZE, _CSETF_BAG_STRUCT_REPEAT_SIZE);
        def_csetf(BAG_STRUCT_TEST, _CSETF_BAG_STRUCT_TEST);
        identity(BAG);
        register_macro_helper(DO_BAG_REPEAT_INTERNAL, DO_BAG_UNIQUE);
        register_macro_helper(DO_BAG_UNIQUE_INTERNAL, DO_BAG_UNIQUE);
        register_cfasl_input_function($cfasl_opcode_bag$.getGlobalValue(), CFASL_INPUT_BAG);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_bag$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_BAG_METHOD));
        define_test_case_table_int(BAG_UNIT_TEST_KITCHEN_SINK, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt77);
        return NIL;
    }

    public static SubLObject setup_bag_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_bag$.getGlobalValue(), symbol_function(BAG_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list9);
            def_csetf(BAG_STRUCT_UNIQUE_CONTENTS, _CSETF_BAG_STRUCT_UNIQUE_CONTENTS);
            def_csetf(BAG_STRUCT_REPEAT_CONTENTS, _CSETF_BAG_STRUCT_REPEAT_CONTENTS);
            def_csetf(BAG_STRUCT_REPEAT_SIZE, _CSETF_BAG_STRUCT_REPEAT_SIZE);
            def_csetf(BAG_STRUCT_TEST, _CSETF_BAG_STRUCT_TEST);
            identity(BAG);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_bag$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_BAG_METHOD));
            register_macro_helper(DO_BAG_REPEAT_INTERNAL, DO_BAG_UNIQUE);
            register_macro_helper(DO_BAG_UNIQUE_INTERNAL, DO_BAG_UNIQUE);
            register_cfasl_input_function($cfasl_opcode_bag$.getGlobalValue(), CFASL_INPUT_BAG);
            register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_bag$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_BAG_METHOD));
            define_test_case_table_int(BAG_UNIT_TEST_KITCHEN_SINK, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list79);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(BAG_UNIT_TEST_KITCHEN_SINK, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt77);
        }
        return NIL;
    }

    public static SubLObject setup_bag_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_bag$.getGlobalValue(), symbol_function(BAG_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(BAG_STRUCT_UNIQUE_CONTENTS, _CSETF_BAG_STRUCT_UNIQUE_CONTENTS);
        def_csetf(BAG_STRUCT_REPEAT_CONTENTS, _CSETF_BAG_STRUCT_REPEAT_CONTENTS);
        def_csetf(BAG_STRUCT_REPEAT_SIZE, _CSETF_BAG_STRUCT_REPEAT_SIZE);
        def_csetf(BAG_STRUCT_TEST, _CSETF_BAG_STRUCT_TEST);
        identity(BAG);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_bag$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_BAG_METHOD));
        register_macro_helper(DO_BAG_REPEAT_INTERNAL, DO_BAG_UNIQUE);
        register_macro_helper(DO_BAG_UNIQUE_INTERNAL, DO_BAG_UNIQUE);
        register_cfasl_input_function($cfasl_opcode_bag$.getGlobalValue(), CFASL_INPUT_BAG);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_bag$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_BAG_METHOD));
        define_test_case_table_int(BAG_UNIT_TEST_KITCHEN_SINK, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list79);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_bag_file();
    }

    @Override
    public void initializeVariables() {
        init_bag_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_bag_file();
    }

    static {
    }

    public static final class $bag_p$UnaryFunction extends UnaryFunction {
        public $bag_p$UnaryFunction() {
            super(extractFunctionNamed("BAG-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return bag_p(arg1);
        }
    }

    static private final SubLList $list_alt3 = list(makeSymbol("UNIQUE-CONTENTS"), makeSymbol("REPEAT-CONTENTS"), makeSymbol("REPEAT-SIZE"), makeSymbol("TEST"));

    static private final SubLList $list_alt4 = list(makeKeyword("UNIQUE-CONTENTS"), makeKeyword("REPEAT-CONTENTS"), makeKeyword("REPEAT-SIZE"), $TEST);

    static private final SubLList $list_alt5 = list(makeSymbol("BAG-STRUCT-UNIQUE-CONTENTS"), makeSymbol("BAG-STRUCT-REPEAT-CONTENTS"), makeSymbol("BAG-STRUCT-REPEAT-SIZE"), makeSymbol("BAG-STRUCT-TEST"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-BAG-STRUCT-UNIQUE-CONTENTS"), makeSymbol("_CSETF-BAG-STRUCT-REPEAT-CONTENTS"), makeSymbol("_CSETF-BAG-STRUCT-REPEAT-SIZE"), makeSymbol("_CSETF-BAG-STRUCT-TEST"));

    static private final SubLString $str_alt21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt22$__ = makeString("#<");

    static private final SubLString $str_alt24$_ = makeString("(");

    static private final SubLString $str_alt25$_impl_ = makeString(" impl ");

    static private final SubLString $str_alt26$__ = makeString("//");

    static private final SubLString $str_alt27$_ = makeString(")");

    static private final SubLString $str_alt28$_size_ = makeString(" size=");

    static private final SubLList $list_alt30 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("ELEMENT-COUNT"), makeSymbol("BAG-REPEAT-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt31 = list($DONE);

    static private final SubLList $list_alt35 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("BAG-REPEAT-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym36$CURR_ELEMENT = makeUninternedSymbol("CURR-ELEMENT");

    static private final SubLSymbol $sym37$ELEMENT_COUNT = makeUninternedSymbol("ELEMENT-COUNT");

    static private final SubLSymbol $sym38$INDEX = makeUninternedSymbol("INDEX");

    static private final SubLList $list_alt42 = list(makeSymbol("TIMES"), makeSymbol("ELEMENT"), makeSymbol("CONTENTS-ITERATOR"));

    static private final SubLList $list_alt44 = list(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLList $list_alt47 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("BAG-UNIQUE-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt52 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("ELEMENT-COUNT"), makeSymbol("BAG"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt56 = list(ONE_INTEGER);

    static private final SubLList $list_alt59 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("BAG"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym60$CURRENT_ELEMENT = makeUninternedSymbol("CURRENT-ELEMENT");

    static private final SubLSymbol $sym61$INDEX = makeUninternedSymbol("INDEX");

    static private final SubLSymbol $sym62$ELEMENT_COUNT = makeUninternedSymbol("ELEMENT-COUNT");

    static private final SubLString $str_alt67$CFASL_loaded_bag__A_does_not_have = makeString("CFASL-loaded bag ~A does not have the needed number of unique elements ~A.");

    static private final SubLString $str_alt68$CFASL_loaded_bag__A_has_more_than = makeString("CFASL-loaded bag ~A has more than the expected unumber of unique elements ~A.");

    static private final SubLString $str_alt69$CFASL_loaded_bag__A_does_not_repr = makeString("CFASL-loaded bag ~A does not represent the expected number of total elements ~A.");

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt77 = list(list(list(list(makeKeyword("RED"), $BLUE, makeKeyword("GREEN"), makeKeyword("YELLOW"), makeKeyword("WHITE"), makeKeyword("BROWN"), makeKeyword("BLACK")), TEN_INTEGER), makeKeyword("SUCCESS")), list(list(list(makeKeyword("RED"), $BLUE, makeKeyword("GREEN"), makeKeyword("YELLOW"), makeKeyword("WHITE"), makeKeyword("BROWN"), makeKeyword("BLACK")), ONE_INTEGER), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt79$bag_size____item_count = makeString("bag size != item count");

    static private final SubLString $str_alt80$bag_member_count_out_of_whack = makeString("bag member-count out of whack");

    static private final SubLString $str_alt83$do_bag_existing_element_not_there = makeString("do-bag existing element not there often enough");

    static private final SubLString $str_alt84$do_list_existing_element_not_ther = makeString("do-list existing element not there often enough");

    static private final SubLString $str_alt85$iterator_existing_element_not_the = makeString("iterator existing element not there often enough");

    static private final SubLList $list_alt87 = cons(makeSymbol("ELEMENT"), makeSymbol("ELEMENT-COUNT"));

    static private final SubLString $str_alt88$bag_element_count_tuple_contains_ = makeString("bag-element-count tuple contains bad element");

    static private final SubLString $str_alt89$bag_element_count_tuple_contains_ = makeString("bag-element-count tuple contains bad count");

    static private final SubLString $str_alt91$CFASLed_bag_has_different_size_ = makeString("CFASLed bag has different size.");

    static private final SubLString $str_alt92$CFASLed_bag_has_different_unique_ = makeString("CFASLed bag has different unique size.");

    static private final SubLString $str_alt93$CFASLed_bag_does_not_contain_elem = makeString("CFASLed bag does not contain element.");

    static private final SubLString $str_alt94$CFASLed_bag_does_not_contain_elem = makeString("CFASLed bag does not contain element as often.");

    static private final SubLString $str_alt95$removing_items_whacks_bag_size = makeString("removing items whacks bag-size");

    static private final SubLString $str_alt96$removing_items_whacks_member_coun = makeString("removing items whacks member count");
}

/**
 * Total time: 425 ms
 */
