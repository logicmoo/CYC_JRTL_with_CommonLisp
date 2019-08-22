/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_constant_input_width$;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_radio_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_a;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_dollar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbrace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      HTML-ARGHASH
 * source file: /cyc/top/cycl/html-arghash.lisp
 * created:     2019/07/03 17:38:04
 */
public final class html_arghash extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt55$ = makeString("");

    public static final class $arghash_type_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$name;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$keyword;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$character;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$string_validator;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$string_to_object_fn;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$object_detector;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$object_to_string_fn;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$priority;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$keyword = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$character = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$string_validator = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$string_to_object_fn = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$object_detector = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$object_to_string_fn = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.this.$priority = value;
        }

        public SubLObject $name = Lisp.NIL;

        public SubLObject $keyword = Lisp.NIL;

        public SubLObject $character = Lisp.NIL;

        public SubLObject $string_validator = Lisp.NIL;

        public SubLObject $string_to_object_fn = Lisp.NIL;

        public SubLObject $object_detector = Lisp.NIL;

        public SubLObject $object_to_string_fn = Lisp.NIL;

        public SubLObject $priority = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.class, ARGHASH_TYPE, ARGHASH_TYPE_P, $list_alt6, $list_alt7, new String[]{ "$name", "$keyword", "$character", "$string_validator", "$string_to_object_fn", "$object_detector", "$object_to_string_fn", "$priority" }, $list_alt8, $list_alt9, PRINT_ARGHASH_TYPE);
    }

    public static final SubLFile me = new html_arghash();

 public static final String myName = "com.cyc.cycjava.cycl.html_arghash";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_arghash_type$ = makeSymbol("*DTP-ARGHASH-TYPE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$_ = makeString("#");

    private static final SubLSymbol ARGHASH_TYPE = makeSymbol("ARGHASH-TYPE");

    private static final SubLSymbol ARGHASH_TYPE_P = makeSymbol("ARGHASH-TYPE-P");

    private static final SubLList $list3 = list(makeSymbol("NAME"), makeSymbol("KEYWORD"), makeSymbol("CHARACTER"), makeSymbol("STRING-VALIDATOR"), makeSymbol("STRING-TO-OBJECT-FN"), makeSymbol("OBJECT-DETECTOR"), makeSymbol("OBJECT-TO-STRING-FN"), makeSymbol("PRIORITY"));

    private static final SubLList $list4 = list($NAME, makeKeyword("KEYWORD"), makeKeyword("CHARACTER"), makeKeyword("STRING-VALIDATOR"), makeKeyword("STRING-TO-OBJECT-FN"), makeKeyword("OBJECT-DETECTOR"), makeKeyword("OBJECT-TO-STRING-FN"), makeKeyword("PRIORITY"));

    private static final SubLList $list5 = list(makeSymbol("ARGHASH-TYPE-NAME"), makeSymbol("ARGHASH-TYPE-KEYWORD"), makeSymbol("ARGHASH-TYPE-CHARACTER"), makeSymbol("ARGHASH-TYPE-STRING-VALIDATOR"), makeSymbol("ARGHASH-TYPE-STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-TYPE-OBJECT-DETECTOR"), makeSymbol("ARGHASH-TYPE-OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-TYPE-PRIORITY"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-ARGHASH-TYPE-NAME"), makeSymbol("_CSETF-ARGHASH-TYPE-KEYWORD"), makeSymbol("_CSETF-ARGHASH-TYPE-CHARACTER"), makeSymbol("_CSETF-ARGHASH-TYPE-STRING-VALIDATOR"), makeSymbol("_CSETF-ARGHASH-TYPE-STRING-TO-OBJECT-FN"), makeSymbol("_CSETF-ARGHASH-TYPE-OBJECT-DETECTOR"), makeSymbol("_CSETF-ARGHASH-TYPE-OBJECT-TO-STRING-FN"), makeSymbol("_CSETF-ARGHASH-TYPE-PRIORITY"));

    private static final SubLSymbol PRINT_ARGHASH_TYPE = makeSymbol("PRINT-ARGHASH-TYPE");

    private static final SubLSymbol ARGHASH_TYPE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ARGHASH-TYPE-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ARGHASH-TYPE-P"));

    private static final SubLSymbol ARGHASH_TYPE_NAME = makeSymbol("ARGHASH-TYPE-NAME");

    private static final SubLSymbol _CSETF_ARGHASH_TYPE_NAME = makeSymbol("_CSETF-ARGHASH-TYPE-NAME");

    private static final SubLSymbol ARGHASH_TYPE_KEYWORD = makeSymbol("ARGHASH-TYPE-KEYWORD");

    private static final SubLSymbol _CSETF_ARGHASH_TYPE_KEYWORD = makeSymbol("_CSETF-ARGHASH-TYPE-KEYWORD");

    private static final SubLSymbol ARGHASH_TYPE_CHARACTER = makeSymbol("ARGHASH-TYPE-CHARACTER");

    private static final SubLSymbol _CSETF_ARGHASH_TYPE_CHARACTER = makeSymbol("_CSETF-ARGHASH-TYPE-CHARACTER");

    private static final SubLSymbol ARGHASH_TYPE_STRING_VALIDATOR = makeSymbol("ARGHASH-TYPE-STRING-VALIDATOR");

    private static final SubLSymbol _CSETF_ARGHASH_TYPE_STRING_VALIDATOR = makeSymbol("_CSETF-ARGHASH-TYPE-STRING-VALIDATOR");

    private static final SubLSymbol ARGHASH_TYPE_STRING_TO_OBJECT_FN = makeSymbol("ARGHASH-TYPE-STRING-TO-OBJECT-FN");

    private static final SubLSymbol _CSETF_ARGHASH_TYPE_STRING_TO_OBJECT_FN = makeSymbol("_CSETF-ARGHASH-TYPE-STRING-TO-OBJECT-FN");

    private static final SubLSymbol ARGHASH_TYPE_OBJECT_DETECTOR = makeSymbol("ARGHASH-TYPE-OBJECT-DETECTOR");

    private static final SubLSymbol _CSETF_ARGHASH_TYPE_OBJECT_DETECTOR = makeSymbol("_CSETF-ARGHASH-TYPE-OBJECT-DETECTOR");

    private static final SubLSymbol ARGHASH_TYPE_OBJECT_TO_STRING_FN = makeSymbol("ARGHASH-TYPE-OBJECT-TO-STRING-FN");

    private static final SubLSymbol _CSETF_ARGHASH_TYPE_OBJECT_TO_STRING_FN = makeSymbol("_CSETF-ARGHASH-TYPE-OBJECT-TO-STRING-FN");

    private static final SubLSymbol ARGHASH_TYPE_PRIORITY = makeSymbol("ARGHASH-TYPE-PRIORITY");

    private static final SubLSymbol _CSETF_ARGHASH_TYPE_PRIORITY = makeSymbol("_CSETF-ARGHASH-TYPE-PRIORITY");

    private static final SubLSymbol $STRING_TO_OBJECT_FN = makeKeyword("STRING-TO-OBJECT-FN");

    private static final SubLSymbol $OBJECT_TO_STRING_FN = makeKeyword("OBJECT-TO-STRING-FN");

    private static final SubLString $str34$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_ARGHASH_TYPE = makeSymbol("MAKE-ARGHASH-TYPE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ARGHASH_TYPE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ARGHASH-TYPE-METHOD");

    private static final SubLList $list40 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));

    private static final SubLSymbol $sym41$NEW_ARGHASH_TYPE = makeUninternedSymbol("NEW-ARGHASH-TYPE");

    private static final SubLSymbol $arghash_types_by_keyword$ = makeSymbol("*ARGHASH-TYPES-BY-KEYWORD*");

    private static final SubLSymbol $arghash_types_by_character$ = makeSymbol("*ARGHASH-TYPES-BY-CHARACTER*");

    private static final SubLSymbol $arghash_types$ = makeSymbol("*ARGHASH-TYPES*");

    static private final SubLList $list52 = list(makeSymbol("*ARGHASH-TYPES*"), list(makeSymbol("FUNCTION"), EQUAL), list(QUOTE, makeSymbol("ARGHASH-TYPE-NAME")));

    private static final SubLSymbol $sym53$_ = makeSymbol("<");

    private static final SubLList $list54 = list(new SubLObject[]{ $NAME, makeString("keyword"), makeKeyword("KEYWORD"), makeKeyword("KEYWORD"), makeKeyword("CHARACTER"), CHAR_colon, makeKeyword("STRING-VALIDATOR"), makeSymbol("STRINGP"), makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-STRING-TO-KEYWORD"), makeKeyword("OBJECT-DETECTOR"), makeSymbol("KEYWORDP"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-KEYWORD-TO-STRING"), makeKeyword("PRIORITY"), ONE_INTEGER });

    private static final SubLString $str56$_A = makeString("~A");

    private static final SubLString $str57$ = makeString("");

    static private final SubLList $list58 = list(new SubLObject[]{ $NAME, makeString("fort"), makeKeyword("KEYWORD"), $FORT, makeKeyword("CHARACTER"), CHAR_dollar, makeKeyword("STRING-VALIDATOR"), makeSymbol("STRINGP"), makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-STRING-TO-FORT"), makeKeyword("OBJECT-DETECTOR"), makeSymbol("FORT-P"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-FORT-TO-STRING"), makeKeyword("PRIORITY"), TWO_INTEGER });

    static private final SubLList $list60 = list(new SubLObject[]{ $NAME, makeString("assertion"), makeKeyword("KEYWORD"), makeKeyword("ASSERTION"), makeKeyword("CHARACTER"), CHAR_a, makeKeyword("STRING-VALIDATOR"), makeSymbol("NUMBER-STRING-P"), makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-STRING-TO-ASSERTION"), makeKeyword("OBJECT-DETECTOR"), makeSymbol("ASSERTION-P"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-ASSERTION-TO-STRING"), makeKeyword("PRIORITY"), TWO_INTEGER });

    static private final SubLList $list62 = list(new SubLObject[]{ $NAME, makeString("integer"), makeKeyword("KEYWORD"), makeKeyword("INTEGER"), makeKeyword("CHARACTER"), CHAR_period, makeKeyword("STRING-VALIDATOR"), makeSymbol("NUMBER-STRING-P"), makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-STRING-TO-INTEGER"), makeKeyword("OBJECT-DETECTOR"), makeSymbol("INTEGERP"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-INTEGER-TO-STRING"), makeKeyword("PRIORITY"), THREE_INTEGER });

    private static final SubLList $list64 = list(new SubLObject[]{ $NAME, makeString("boolean"), makeKeyword("KEYWORD"), makeKeyword("BOOLEAN"), makeKeyword("CHARACTER"), CHAR_question, makeKeyword("STRING-VALIDATOR"), NIL, makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-BOOLEAN-STRING-TO-BOOLEAN"), makeKeyword("OBJECT-DETECTOR"), makeSymbol("ARGHASH-BOOLEAN-DETECTOR"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-BOOLEAN-TO-BOOLEAN-STRING"), makeKeyword("PRIORITY"), FOUR_INTEGER });

    private static final SubLString $$$NIL = makeString("NIL");

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLString $$$t = makeString("t");

    private static final SubLList $list69 = list(new SubLObject[]{ $NAME, makeString("list"), makeKeyword("KEYWORD"), $LIST, makeKeyword("CHARACTER"), CHAR_lparen, makeKeyword("STRING-VALIDATOR"), NIL, makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-STRING-TO-LIST"), makeKeyword("OBJECT-DETECTOR"), makeSymbol("CONSP"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-LIST-TO-STRING"), makeKeyword("PRIORITY"), FIVE_INTEGER });

    static private final SubLString $$$_ = makeString(" ");

    private static final SubLString $str72$_20 = makeString("%20");

    private static final SubLString $str73$_ = makeString("+");

    private static final SubLSymbol ARGHASH_PREFIXED_STRING_TO_OBJECT = makeSymbol("ARGHASH-PREFIXED-STRING-TO-OBJECT");

    static private final SubLString $str76$_ = makeString("(");

    private static final SubLString $str77$_ = makeString("_");

    private static final SubLString $str78$_ = makeString(")");

    static private final SubLList $list80 = list(new SubLObject[]{ $NAME, makeString("el-formula"), makeKeyword("KEYWORD"), makeKeyword("EL-FORMULA"), makeKeyword("CHARACTER"), CHAR_lbrace, makeKeyword("STRING-VALIDATOR"), NIL, makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-STRING-TO-EL-FORMULA"), makeKeyword("OBJECT-DETECTOR"), NIL, makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-EL-FORMULA-TO-STRING"), makeKeyword("PRIORITY"), makeInteger(888) });

    private static final SubLList $list82 = list(new SubLObject[]{ $NAME, makeString("default"), makeKeyword("KEYWORD"), makeKeyword("DEFAULT"), makeKeyword("CHARACTER"), CHAR_underbar, makeKeyword("STRING-VALIDATOR"), makeSymbol("TRUE"), makeKeyword("STRING-TO-OBJECT-FN"), IDENTITY, makeKeyword("OBJECT-DETECTOR"), makeSymbol("TRUE"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-DEFAULT-TO-STRING"), makeKeyword("PRIORITY"), makeInteger(999) });

    private static final SubLString $str85$___A = makeString("--~A");

    private static final SubLString $str89$_ = makeString("&");

    private static final SubLString $str90$_ = makeString("=");

    private static final SubLList $list91 = list(list(makeSymbol("ARGHASH"), makeSymbol("HTML-HANDLER-NAME"), makeSymbol("&KEY"), makeSymbol("NAME"), makeSymbol("TARGET"), makeSymbol("SCRIPT"), makeSymbol("STYLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list92 = list($NAME, makeKeyword("TARGET"), makeKeyword("SCRIPT"), makeKeyword("STYLE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym97$HREF = makeUninternedSymbol("HREF");

    private static final SubLString $str99$_A__A = makeString("~A?~A");

    private static final SubLSymbol $cyc_cgi_program$ = makeSymbol("*CYC-CGI-PROGRAM*");

    private static final SubLSymbol HTML_ARGHASH_HREF = makeSymbol("HTML-ARGHASH-HREF");

    static private final SubLList $list104 = list(NIL);

    private static final SubLList $list105 = list(list(makeSymbol("KEY"), makeSymbol("VALUE-TYPE"), makeSymbol("&KEY"), makeSymbol("MULTIPLE"), makeSymbol("SIZE"), makeSymbol("SCRIPT"), makeSymbol("ONCHANGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list106 = list(makeKeyword("MULTIPLE"), $SIZE, makeKeyword("SCRIPT"), makeKeyword("ONCHANGE"));

    private static final SubLSymbol $sym110$KEY_STRING = makeUninternedSymbol("KEY-STRING");

    private static final SubLSymbol ARGHASH_MAKE_KEY_STRING = makeSymbol("ARGHASH-MAKE-KEY-STRING");

    private static final SubLSymbol HTML_FANCY_SELECT = makeSymbol("HTML-FANCY-SELECT");

    private static final SubLList $list113 = list(list(makeSymbol("ARGHASH"), makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("VALUE-TYPE"), makeKeyword("DEFAULT"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym114$VALUE_STRING = makeUninternedSymbol("VALUE-STRING");

    private static final SubLSymbol $sym115$SELECTED = makeUninternedSymbol("SELECTED");

    private static final SubLSymbol $sym116$MEMBER_EQUAL_ = makeSymbol("MEMBER-EQUAL?");

    private static final SubLSymbol GET_ARGHASH_VALUE_LIST = makeSymbol("GET-ARGHASH-VALUE-LIST");

    private static final SubLSymbol ARGHASH_GET_STRING = makeSymbol("ARGHASH-GET-STRING");

    private static final SubLSymbol HTML_FANCY_OPTION = makeSymbol("HTML-FANCY-OPTION");

    private static final SubLList $list122 = list(new SubLObject[]{ makeSymbol("ARGHASH"), makeSymbol("KEY"), makeSymbol("VALUE-TYPE"), makeSymbol("VALUES"), makeSymbol("VALUE-STRINGS"), makeSymbol("&KEY"), makeSymbol("MULTIPLE"), makeSymbol("SIZE"), makeSymbol("SCRIPT"), makeSymbol("ONCHANGE") });

    private static final SubLSymbol $sym123$VALUE = makeUninternedSymbol("VALUE");

    private static final SubLSymbol $sym124$VALUE_STRING = makeUninternedSymbol("VALUE-STRING");

    private static final SubLSymbol HTML_ARGHASH_FANCY_SELECT = makeSymbol("HTML-ARGHASH-FANCY-SELECT");

    private static final SubLSymbol CDOLIST_MULTIPLE = makeSymbol("CDOLIST-MULTIPLE");

    private static final SubLSymbol HTML_ARGHASH_FANCY_OPTION = makeSymbol("HTML-ARGHASH-FANCY-OPTION");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLString $$$virtual = makeString("virtual");

    private static final SubLString $$$Cyclify = makeString("Cyclify");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $str144$_NEW_FORT = makeString("_NEW_FORT");

    private static final SubLString $str145$_STRING = makeString("_STRING");

    private static final SubLString $str146$_NEW_STRING = makeString("_NEW_STRING");

    private static final SubLString $str147$_UNDO = makeString("_UNDO");

    private static final SubLString $str148$_CANDIDATES = makeString("_CANDIDATES");

    private static final SubLString $str149$_DONE = makeString("_DONE");

    private static final SubLString $str150$_ERROR = makeString("_ERROR");

    private static final SubLString $str151$_2 = makeString("+2");

    private static final SubLString $str152$_ = makeString("*");

    private static final SubLString $str153$onChange_javascript_this_form_sub = makeString("onChange=javascript:this.form.submit();");

    private static final SubLString $str154$___ = makeString("???");

    private static final SubLString $$$Undo = makeString("Undo");

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLString $str159$_nl_fort_input_force_default_if_u = makeString("(nl-fort-input-force-default-if-unset ");

    private static final SubLString $str160$___setting_to_ = makeString("): setting to ");

    private static final SubLSymbol TERMS_FOR_BROWSING = makeSymbol("TERMS-FOR-BROWSING");

    private static final SubLString $str162$_nl_fort_input_validate_ = makeString("(nl-fort-input-validate ");

    private static final SubLString $str163$___ = makeString("): ");

    private static final SubLString $str164$Case_1__clicked_undo_button = makeString("Case 1: clicked undo button");

    private static final SubLString $str165$Case_2__chose_fort_from_pulldown = makeString("Case 2: chose fort from pulldown");

    private static final SubLString $str166$Case_3__text_typed_in__ = makeString("Case 3: text typed in, ");



    private static final SubLString $str169$Case_3a__No_parse_for___A_ = makeString("Case 3a: No parse for \"~A\"");

    private static final SubLString $str170$_called__ = makeString(" called \"");

    private static final SubLString $str171$__not_found_ = makeString("\" not found.");

    private static final SubLString $str172$_ = makeString("\"");

    private static final SubLString $str173$Case_3b__One_parse_for___A_____A = makeString("Case 3b: One parse for \"~A\" = ~A");

    private static final SubLString $str174$Case_3c__Many_parses_for___A_____ = makeString("Case 3c: Many parses for \"~A\" = ~A");

    private static final SubLString $str175$Case_4__no_text_typed_in = makeString("Case 4: no text typed in");

    private static final SubLString $str176$Case_5__fort_set__so_use_fort_as_ = makeString("Case 5: fort set, so use fort as 'new-fort'");

    private static final SubLString $str177$Case_6__fallthrough_ = makeString("Case 6: fallthrough!");

    private static final SubLString $str178$_REMOVE = makeString("_REMOVE");

    private static final SubLString $$$Remove = makeString("Remove");

    private static final SubLString $str180$_max_reached_ = makeString("(max reached)");

    private static final SubLString $str181$_max_exceeded_ = makeString("(max exceeded)");

    private static final SubLString $str182$_more_required_ = makeString(" more required)");

    private static final SubLString $str184$_key_list_length_reached_ = makeString("(key list length reached)");

    private static final SubLString $$$X = makeString("X");

    public static final SubLObject print_arghash_type_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
                princ($str_alt0$_, stream);
            } else {
                if (NIL != $print_readably$.getDynamicValue(thread)) {
                    print_not_readable(v_object, stream);
                } else {
                    {
                        SubLObject v_object_1 = v_object;
                        SubLObject stream_2 = stream;
                        write_string($str_alt1$__, stream_2, UNPROVIDED, UNPROVIDED);
                        write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                        write_char(CHAR_space, stream_2);
                        princ(arghash_type_name(v_object), stream);
                        write_char(CHAR_greater, stream_2);
                    }
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_arghash_type(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
            princ($str0$_, stream);
        } else
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
                princ(arghash_type_name(v_object), stream);
                print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
            }

        return v_object;
    }

    public static final SubLObject arghash_type_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_arghash_type(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject arghash_type_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_arghash_type(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject arghash_type_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject arghash_type_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.html_arghash.$arghash_type_native.class ? T : NIL;
    }

    public static final SubLObject arghash_type_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.getField2();
    }

    public static SubLObject arghash_type_name(final SubLObject v_object) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject arghash_type_keyword_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.getField3();
    }

    public static SubLObject arghash_type_keyword(final SubLObject v_object) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject arghash_type_character_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.getField4();
    }

    public static SubLObject arghash_type_character(final SubLObject v_object) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject arghash_type_string_validator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.getField5();
    }

    public static SubLObject arghash_type_string_validator(final SubLObject v_object) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject arghash_type_string_to_object_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.getField6();
    }

    public static SubLObject arghash_type_string_to_object_fn(final SubLObject v_object) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject arghash_type_object_detector_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.getField7();
    }

    public static SubLObject arghash_type_object_detector(final SubLObject v_object) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject arghash_type_object_to_string_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.getField8();
    }

    public static SubLObject arghash_type_object_to_string_fn(final SubLObject v_object) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject arghash_type_priority_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.getField9();
    }

    public static SubLObject arghash_type_priority(final SubLObject v_object) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject _csetf_arghash_type_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_arghash_type_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_arghash_type_keyword_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_arghash_type_keyword(final SubLObject v_object, final SubLObject value) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_arghash_type_character_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_arghash_type_character(final SubLObject v_object, final SubLObject value) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_arghash_type_string_validator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_arghash_type_string_validator(final SubLObject v_object, final SubLObject value) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_arghash_type_string_to_object_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_arghash_type_string_to_object_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_arghash_type_object_detector_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_arghash_type_object_detector(final SubLObject v_object, final SubLObject value) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_arghash_type_object_to_string_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_arghash_type_object_to_string_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_arghash_type_priority_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ARGHASH_TYPE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_arghash_type_priority(final SubLObject v_object, final SubLObject value) {
        assert NIL != arghash_type_p(v_object) : "! html_arghash.arghash_type_p(v_object) " + "html_arghash.arghash_type_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject make_arghash_type_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.html_arghash.$arghash_type_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_arghash_type_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($KEYWORD)) {
                            _csetf_arghash_type_keyword(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CHARACTER)) {
                                _csetf_arghash_type_character(v_new, current_value);
                            } else {
                                if (pcase_var.eql($STRING_VALIDATOR)) {
                                    _csetf_arghash_type_string_validator(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($STRING_TO_OBJECT_FN)) {
                                        _csetf_arghash_type_string_to_object_fn(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($OBJECT_DETECTOR)) {
                                            _csetf_arghash_type_object_detector(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($OBJECT_TO_STRING_FN)) {
                                                _csetf_arghash_type_object_to_string_fn(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($PRIORITY)) {
                                                    _csetf_arghash_type_priority(v_new, current_value);
                                                } else {
                                                    Errors.error($str_alt36$Invalid_slot__S_for_construction_, current_arg);
                                                }
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

    public static SubLObject make_arghash_type(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.html_arghash.$arghash_type_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_arghash_type_name(v_new, current_value);
            } else
                if (pcase_var.eql($KEYWORD)) {
                    _csetf_arghash_type_keyword(v_new, current_value);
                } else
                    if (pcase_var.eql($CHARACTER)) {
                        _csetf_arghash_type_character(v_new, current_value);
                    } else
                        if (pcase_var.eql($STRING_VALIDATOR)) {
                            _csetf_arghash_type_string_validator(v_new, current_value);
                        } else
                            if (pcase_var.eql($STRING_TO_OBJECT_FN)) {
                                _csetf_arghash_type_string_to_object_fn(v_new, current_value);
                            } else
                                if (pcase_var.eql($OBJECT_DETECTOR)) {
                                    _csetf_arghash_type_object_detector(v_new, current_value);
                                } else
                                    if (pcase_var.eql($OBJECT_TO_STRING_FN)) {
                                        _csetf_arghash_type_object_to_string_fn(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($PRIORITY)) {
                                            _csetf_arghash_type_priority(v_new, current_value);
                                        } else {
                                            Errors.error($str34$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_arghash_type(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ARGHASH_TYPE, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, arghash_type_name(obj));
        funcall(visitor_fn, obj, $SLOT, $KEYWORD, arghash_type_keyword(obj));
        funcall(visitor_fn, obj, $SLOT, $CHARACTER, arghash_type_character(obj));
        funcall(visitor_fn, obj, $SLOT, $STRING_VALIDATOR, arghash_type_string_validator(obj));
        funcall(visitor_fn, obj, $SLOT, $STRING_TO_OBJECT_FN, arghash_type_string_to_object_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $OBJECT_DETECTOR, arghash_type_object_detector(obj));
        funcall(visitor_fn, obj, $SLOT, $OBJECT_TO_STRING_FN, arghash_type_object_to_string_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $PRIORITY, arghash_type_priority(obj));
        funcall(visitor_fn, obj, $END, MAKE_ARGHASH_TYPE, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_arghash_type_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_arghash_type(obj, visitor_fn);
    }

    /**
     * Define a new arghash-type
     */
    @LispMethod(comment = "Define a new arghash-type")
    public static final SubLObject defarghash_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt37);
            name = current.first();
            current = current.rest();
            {
                SubLObject arglist = current;
                SubLObject new_arghash_type = $sym38$NEW_ARGHASH_TYPE;
                return list(CLET, list(list(new_arghash_type, list(MAKE_ARGHASH_TYPE, list(QUOTE, arglist)))), list(CSETF, list(ARGHASH_TYPE_NAME, new_arghash_type), list(QUOTE, name)), list(SETHASH, list(ARGHASH_TYPE_KEYWORD, new_arghash_type), $arghash_types_by_keyword$, new_arghash_type), list(SETHASH, list(ARGHASH_TYPE_CHARACTER, new_arghash_type), $arghash_types_by_character$, new_arghash_type), list(CSETQ, $arghash_types$, list(CONS, new_arghash_type, listS(DELETE, list(QUOTE, name), $list_alt50))));
            }
        }
    }

    /**
     * Define a new arghash-type
     */
    @LispMethod(comment = "Define a new arghash-type")
    public static SubLObject defarghash_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list40);
        name = current.first();
        final SubLObject arglist;
        current = arglist = current.rest();
        final SubLObject new_arghash_type = $sym41$NEW_ARGHASH_TYPE;
        return list(CLET, list(list(new_arghash_type, list(MAKE_ARGHASH_TYPE, list(QUOTE, arglist)))), list(CSETF, list(ARGHASH_TYPE_NAME, new_arghash_type), list(QUOTE, name)), list(SETHASH, list(ARGHASH_TYPE_KEYWORD, new_arghash_type), $arghash_types_by_keyword$, new_arghash_type), list(SETHASH, list(ARGHASH_TYPE_CHARACTER, new_arghash_type), $arghash_types_by_character$, new_arghash_type), list(CSETQ, $arghash_types$, list(CONS, new_arghash_type, listS(DELETE, list(QUOTE, name), $list52))));
    }

    public static final SubLObject arghash_keyword_to_arghash_type_alt(SubLObject keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(keyword, $arghash_types_by_keyword$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject arghash_keyword_to_arghash_type(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(keyword, $arghash_types_by_keyword$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject arghash_character_to_arghash_type_alt(SubLObject v_char) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(v_char, $arghash_types_by_character$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject arghash_character_to_arghash_type(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(v_char, $arghash_types_by_character$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject arghash_keywordP_alt(SubLObject keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gethash(keyword, $arghash_types_by_keyword$.getDynamicValue(thread), UNPROVIDED)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject arghash_keywordP(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gethash(keyword, $arghash_types_by_keyword$.getDynamicValue(thread), UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject arghash_types_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return Sort.sort(copy_list($arghash_types$.getDynamicValue(thread)), symbol_function($sym51$_), ARGHASH_TYPE_PRIORITY);
        }
    }

    public static SubLObject arghash_types() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sort.sort(copy_list($arghash_types$.getDynamicValue(thread)), symbol_function($sym53$_), ARGHASH_TYPE_PRIORITY);
    }

    public static final SubLObject arghash_string_to_keyword_alt(SubLObject string) {
        return string_utilities.keyword_from_string(Strings.string_upcase(string, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject arghash_string_to_keyword(final SubLObject string) {
        return string_utilities.keyword_from_string(Strings.string_upcase(string, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject arghash_keyword_to_string_alt(SubLObject keyword) {
        return Strings.string_downcase(string_utilities.string_from_keyword(keyword), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject arghash_keyword_to_string(final SubLObject keyword) {
        return Strings.string_downcase(string_utilities.string_from_keyword(keyword), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject arghash_fort_to_string_alt(SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return format(NIL, $str_alt54$_A, constants_high.constant_internal_id(fort));
        } else {
            if (NIL != nart_handles.nart_p(fort)) {
                return format(NIL, $str_alt54$_A, minus(nart_handles.nart_id(fort)));
            } else {
                return $str_alt55$;
            }
        }
    }

    public static SubLObject arghash_fort_to_string(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return format(NIL, $str56$_A, constants_high.constant_internal_id(fort));
        }
        if (NIL != nart_handles.nart_p(fort)) {
            return format(NIL, $str56$_A, minus(nart_handles.nart_id(fort)));
        }
        return $str57$;
    }

    public static final SubLObject arghash_string_to_fort_alt(SubLObject string) {
        {
            SubLObject result = NIL;
            if (NIL != number_utilities.number_string_p(string)) {
                {
                    SubLObject v_int = parse_integer(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (v_int.numGE(ZERO_INTEGER)) {
                        result = constants_high.find_constant_by_internal_id(v_int);
                    } else {
                        if (v_int.numL(ZERO_INTEGER)) {
                            result = nart_handles.find_nart_by_id(minus(v_int));
                        }
                    }
                }
            } else {
                result = cb_guess_fort(string, UNPROVIDED);
            }
            return result;
        }
    }

    public static SubLObject arghash_string_to_fort(final SubLObject string) {
        SubLObject result = NIL;
        if (NIL != number_utilities.number_string_p(string)) {
            final SubLObject v_int = parse_integer(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (v_int.numGE(ZERO_INTEGER)) {
                result = constants_high.find_constant_by_internal_id(v_int);
            } else
                if (v_int.numL(ZERO_INTEGER)) {
                    result = nart_handles.find_nart_by_id(minus(v_int));
                }

        } else {
            result = cb_guess_fort(string, UNPROVIDED);
        }
        return result;
    }

    public static final SubLObject arghash_assertion_to_string_alt(SubLObject assertion) {
        return format(NIL, $str_alt54$_A, assertion_handles.assertion_id(assertion));
    }

    public static SubLObject arghash_assertion_to_string(final SubLObject assertion) {
        return format(NIL, $str56$_A, assertion_handles.assertion_id(assertion));
    }

    public static final SubLObject arghash_string_to_assertion_alt(SubLObject string) {
        {
            SubLObject result = NIL;
            if (NIL != number_utilities.number_string_p(string)) {
                {
                    SubLObject v_int = parse_integer(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    result = assertion_handles.find_assertion_by_id(v_int);
                }
            }
            return result;
        }
    }

    public static SubLObject arghash_string_to_assertion(final SubLObject string) {
        SubLObject result = NIL;
        if (NIL != number_utilities.number_string_p(string)) {
            final SubLObject v_int = parse_integer(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            result = assertion_handles.find_assertion_by_id(v_int);
        }
        return result;
    }

    public static final SubLObject arghash_string_to_integer_alt(SubLObject string) {
        return parse_integer(string, ZERO_INTEGER, NIL, TEN_INTEGER, T);
    }

    public static SubLObject arghash_string_to_integer(final SubLObject string) {
        return parse_integer(string, ZERO_INTEGER, NIL, TEN_INTEGER, T);
    }

    public static final SubLObject arghash_integer_to_string_alt(SubLObject integer) {
        return format(NIL, $str_alt54$_A, integer);
    }

    public static SubLObject arghash_integer_to_string(final SubLObject integer) {
        return format(NIL, $str56$_A, integer);
    }

    public static final SubLObject arghash_boolean_string_to_boolean_alt(SubLObject string) {
        if ((((NIL == string) || $$$NIL.equal(Strings.string_upcase(string, UNPROVIDED, UNPROVIDED))) || (ZERO_INTEGER == parse_integer(string, ZERO_INTEGER, NIL, TEN_INTEGER, T))) || (NIL != string_utilities.null_stringP(string))) {
            return NIL;
        } else {
            return T;
        }
    }

    public static SubLObject arghash_boolean_string_to_boolean(final SubLObject string) {
        if ((((NIL == string) || $$$NIL.equal(Strings.string_upcase(string, UNPROVIDED, UNPROVIDED))) || ZERO_INTEGER.eql(parse_integer(string, ZERO_INTEGER, NIL, TEN_INTEGER, T))) || (NIL != string_utilities.null_stringP(string))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject arghash_boolean_detector_alt(SubLObject v_object) {
        if ((v_object == T) || (v_object == NIL)) {
            return T;
        } else {
            return NIL;
        }
    }

    public static SubLObject arghash_boolean_detector(final SubLObject v_object) {
        if ((v_object == T) || (v_object == NIL)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject arghash_boolean_to_boolean_string_alt(SubLObject v_boolean) {
        if (NIL == v_boolean) {
            return $$$nil;
        } else {
            return $$$t;
        }
    }

    public static SubLObject arghash_boolean_to_boolean_string(final SubLObject v_boolean) {
        if (NIL == v_boolean) {
            return $$$nil;
        }
        return $$$t;
    }

    public static final SubLObject arghash_prefixed_string_to_object_alt(SubLObject prefixed_string) {
        {
            SubLObject arghash_type = arghash_character_to_arghash_type(Strings.sublisp_char(prefixed_string, ZERO_INTEGER));
            SubLObject string = string_utilities.substring(prefixed_string, ONE_INTEGER, UNPROVIDED);
            string = string_utilities.string_substitute($str_alt69$_, $str_alt70$_20, string, UNPROVIDED);
            return arghash_handle_string(string, arghash_type);
        }
    }

    public static SubLObject arghash_prefixed_string_to_object(final SubLObject prefixed_string) {
        final SubLObject arghash_type = arghash_character_to_arghash_type(Strings.sublisp_char(prefixed_string, ZERO_INTEGER));
        SubLObject string = string_utilities.substring(prefixed_string, ONE_INTEGER, UNPROVIDED);
        string = string_utilities.string_substitute($$$_, $str72$_20, string, UNPROVIDED);
        return arghash_handle_string(string, arghash_type);
    }

    public static final SubLObject arghash_string_to_list_alt(SubLObject string) {
        string = string_utilities.string_substitute($str_alt70$_20, $str_alt69$_, string, UNPROVIDED);
        string = string_utilities.string_substitute($str_alt69$_, $str_alt71$_, string, UNPROVIDED);
        {
            SubLObject string_list = string_utilities.listify_string(string, UNPROVIDED).first();
            return list_utilities.tree_gather_transformations(ARGHASH_PREFIXED_STRING_TO_OBJECT, string_list, symbol_function(STRINGP), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject arghash_string_to_list(SubLObject string) {
        string = string_utilities.string_substitute($str72$_20, $$$_, string, UNPROVIDED);
        string = string_utilities.string_substitute($$$_, $str73$_, string, UNPROVIDED);
        final SubLObject string_list = string_utilities.listify_string(string, UNPROVIDED).first();
        return list_utilities.tree_gather_transformations(ARGHASH_PREFIXED_STRING_TO_OBJECT, string_list, symbol_function(STRINGP), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject arghash_list_to_string_alt(SubLObject list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == list) {
                return $str_alt55$;
            }
            {
                SubLObject result_list = NIL;
                result_list = cons($str_alt74$_, result_list);
                {
                    SubLObject cdolist_list_var = list;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        if (elem.isList()) {
                            result_list = cons(arghash_list_to_string(elem), result_list);
                        } else {
                            thread.resetMultipleValues();
                            {
                                SubLObject elem_type_char = arghash_get_handler_char_and_string(elem, UNPROVIDED);
                                SubLObject elem_string = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != elem_type_char) {
                                    result_list = cons(cconcatenate(Strings.make_string(ONE_INTEGER, elem_type_char), elem_string), result_list);
                                } else {
                                    result_list = cons(cconcatenate($str_alt75$_, elem_string), result_list);
                                }
                            }
                        }
                        result_list = cons($str_alt71$_, result_list);
                    }
                }
                result_list = cons($str_alt76$_, result_list);
                return apply(symbol_function(CCONCATENATE), nreverse(result_list));
            }
        }
    }

    public static SubLObject arghash_list_to_string(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == list) {
            return $str57$;
        }
        SubLObject result_list = NIL;
        result_list = cons($str76$_, result_list);
        SubLObject cdolist_list_var = list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (elem.isList()) {
                result_list = cons(arghash_list_to_string(elem), result_list);
            } else {
                thread.resetMultipleValues();
                final SubLObject elem_type_char = arghash_get_handler_char_and_string(elem, UNPROVIDED);
                final SubLObject elem_string = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != elem_type_char) {
                    result_list = cons(cconcatenate(Strings.make_string(ONE_INTEGER, elem_type_char), elem_string), result_list);
                } else {
                    result_list = cons(cconcatenate($str77$_, elem_string), result_list);
                }
            }
            result_list = cons($str73$_, result_list);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        result_list = cons($str78$_, result_list);
        return apply(symbol_function(CCONCATENATE), nreverse(result_list));
    }

    public static final SubLObject arghash_string_to_el_formula_alt(SubLObject string) {
        return cb_form_widgets.cb_determine_el_sentence(cb_form_widgets.cb_normalize_formula_string(string), NIL);
    }

    public static SubLObject arghash_string_to_el_formula(final SubLObject string) {
        return cb_form_widgets.cb_determine_el_sentence(cb_form_widgets.cb_normalize_formula_string(string), NIL);
    }

    public static final SubLObject arghash_el_formula_to_string_alt(SubLObject el_formula) {
        return format_cycl_expression.format_cycl_expression_to_string(el_formula, ZERO_INTEGER);
    }

    public static SubLObject arghash_el_formula_to_string(final SubLObject el_formula) {
        return format_cycl_expression.format_cycl_expression_to_string(el_formula, ZERO_INTEGER);
    }

    public static final SubLObject arghash_default_to_string_alt(SubLObject v_object) {
        if (NIL == v_object) {
            return $str_alt55$;
        } else {
            return string_utilities.to_lisp_string(v_object);
        }
    }

    public static SubLObject arghash_default_to_string(final SubLObject v_object) {
        if (NIL == v_object) {
            return $str57$;
        }
        return string_utilities.to_lisp_string(v_object);
    }

    /**
     * Given a STRING and an ARGHASH-TYPE representing the datatype the string should represent, convert the string to that datatype and return it.
     */
    @LispMethod(comment = "Given a STRING and an ARGHASH-TYPE representing the datatype the string should represent, convert the string to that datatype and return it.")
    public static final SubLObject arghash_handle_string_alt(SubLObject string, SubLObject arghash_type) {
        if (string.isString()) {
            if (NIL != arghash_type_p(arghash_type)) {
                if (arghash_type_string_validator(arghash_type).isFunctionSpec()) {
                    if (NIL == funcall(arghash_type_string_validator(arghash_type), string)) {
                        return values(string, NIL);
                    }
                }
                return funcall(arghash_type_string_to_object_fn(arghash_type), string);
            }
            return values(string, NIL);
        }
        return values(NIL, NIL);
    }

    /**
     * Given a STRING and an ARGHASH-TYPE representing the datatype the string should represent, convert the string to that datatype and return it.
     */
    @LispMethod(comment = "Given a STRING and an ARGHASH-TYPE representing the datatype the string should represent, convert the string to that datatype and return it.")
    public static SubLObject arghash_handle_string(final SubLObject string, final SubLObject arghash_type) {
        if (!string.isString()) {
            return values(NIL, NIL);
        }
        if (NIL == arghash_type_p(arghash_type)) {
            return values(string, NIL);
        }
        if (arghash_type_string_validator(arghash_type).isFunctionSpec() && (NIL == funcall(arghash_type_string_validator(arghash_type), string))) {
            return values(string, NIL);
        }
        return funcall(arghash_type_string_to_object_fn(arghash_type), string);
    }

    /**
     * Given a KEY-STRING and a VALUE-STRING as resulting from args retud from a cgi form, possibly with handler chars at the beginning of the KEY-STRING, transform KEY-STRING and VALUE-STRING using @xref arghash-handle-string and return them both.
     */
    @LispMethod(comment = "Given a KEY-STRING and a VALUE-STRING as resulting from args retud from a cgi form, possibly with handler chars at the beginning of the KEY-STRING, transform KEY-STRING and VALUE-STRING using @xref arghash-handle-string and return them both.")
    public static final SubLObject arghash_parse_key_and_value_alt(SubLObject key_string, SubLObject value_string) {
        if (value_string == UNPROVIDED) {
            value_string = NIL;
        }
        {
            SubLObject key_length = length(key_string);
            SubLObject key_handler_char = (ZERO_INTEGER.numL(key_length)) ? ((SubLObject) (elt(key_string, ZERO_INTEGER))) : NIL;
            SubLObject value_handler_char = (ONE_INTEGER.numL(key_length)) ? ((SubLObject) (elt(key_string, ONE_INTEGER))) : NIL;
            SubLObject key_arghash_type = arghash_character_to_arghash_type(key_handler_char);
            SubLObject value_arghash_type = arghash_character_to_arghash_type(value_handler_char);
            SubLObject key = key_string;
            SubLObject value = value_string;
            if (NIL != arghash_type_p(key_arghash_type)) {
                if (NIL != arghash_type_p(value_arghash_type)) {
                    key_string = subseq(key_string, TWO_INTEGER, UNPROVIDED);
                } else {
                    key_string = subseq(key_string, ONE_INTEGER, UNPROVIDED);
                }
            }
            if (NIL != arghash_type_p(key_arghash_type)) {
                key = arghash_handle_string(key_string, key_arghash_type);
            }
            if (NIL != arghash_type_p(value_arghash_type)) {
                value = arghash_handle_string(value_string, value_arghash_type);
            }
            return values(key, value);
        }
    }

    /**
     * Given a KEY-STRING and a VALUE-STRING as resulting from args retud from a cgi form, possibly with handler chars at the beginning of the KEY-STRING, transform KEY-STRING and VALUE-STRING using @xref arghash-handle-string and return them both.
     */
    @LispMethod(comment = "Given a KEY-STRING and a VALUE-STRING as resulting from args retud from a cgi form, possibly with handler chars at the beginning of the KEY-STRING, transform KEY-STRING and VALUE-STRING using @xref arghash-handle-string and return them both.")
    public static SubLObject arghash_parse_key_and_value(SubLObject key_string, SubLObject value_string) {
        if (value_string == UNPROVIDED) {
            value_string = NIL;
        }
        final SubLObject key_length = length(key_string);
        final SubLObject key_handler_char = (ZERO_INTEGER.numL(key_length)) ? elt(key_string, ZERO_INTEGER) : NIL;
        final SubLObject value_handler_char = (ONE_INTEGER.numL(key_length)) ? elt(key_string, ONE_INTEGER) : NIL;
        final SubLObject key_arghash_type = arghash_character_to_arghash_type(key_handler_char);
        final SubLObject value_arghash_type = arghash_character_to_arghash_type(value_handler_char);
        SubLObject key = key_string;
        SubLObject value = value_string;
        if (NIL != arghash_type_p(key_arghash_type)) {
            if (NIL != arghash_type_p(value_arghash_type)) {
                key_string = subseq(key_string, TWO_INTEGER, UNPROVIDED);
            } else {
                key_string = subseq(key_string, ONE_INTEGER, UNPROVIDED);
            }
        }
        if (NIL != arghash_type_p(key_arghash_type)) {
            key = arghash_handle_string(key_string, key_arghash_type);
        }
        if (NIL != arghash_type_p(value_arghash_type)) {
            value = arghash_handle_string(value_string, value_arghash_type);
        }
        return values(key, value);
    }

    /**
     * Given an OBJECT, return the handler character and string that it can be represented by in an html form.
     */
    @LispMethod(comment = "Given an OBJECT, return the handler character and string that it can be represented by in an html form.")
    public static final SubLObject arghash_get_handler_char_and_string_alt(SubLObject v_object, SubLObject object_type) {
        if (object_type == UNPROVIDED) {
            object_type = NIL;
        }
        if ((NIL != object_type) && (object_type != $DEFAULT)) {
            {
                SubLObject arghash_type = arghash_keyword_to_arghash_type(object_type);
                if (NIL != arghash_type_p(arghash_type)) {
                    return values(arghash_type_character(arghash_type), funcall(arghash_type_object_to_string_fn(arghash_type), v_object));
                }
            }
        }
        {
            SubLObject cdolist_list_var = arghash_types();
            SubLObject arghash_type = NIL;
            for (arghash_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arghash_type = cdolist_list_var.first()) {
                if (arghash_type_object_detector(arghash_type).isFunctionSpec()) {
                    if (NIL != funcall(arghash_type_object_detector(arghash_type), v_object)) {
                        if (arghash_type_object_to_string_fn(arghash_type).isFunctionSpec()) {
                            return values(arghash_type_character(arghash_type), funcall(arghash_type_object_to_string_fn(arghash_type), v_object));
                        }
                    }
                }
            }
        }
        return values(CHAR_underbar, format(NIL, $str_alt83$___A, v_object));
    }

    /**
     * Given an OBJECT, return the handler character and string that it can be represented by in an html form.
     */
    @LispMethod(comment = "Given an OBJECT, return the handler character and string that it can be represented by in an html form.")
    public static SubLObject arghash_get_handler_char_and_string(final SubLObject v_object, SubLObject object_type) {
        if (object_type == UNPROVIDED) {
            object_type = NIL;
        }
        if ((NIL != object_type) && (object_type != $DEFAULT)) {
            final SubLObject arghash_type = arghash_keyword_to_arghash_type(object_type);
            if (NIL != arghash_type_p(arghash_type)) {
                return values(arghash_type_character(arghash_type), funcall(arghash_type_object_to_string_fn(arghash_type), v_object));
            }
        }
        SubLObject cdolist_list_var = arghash_types();
        SubLObject arghash_type2 = NIL;
        arghash_type2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((arghash_type_object_detector(arghash_type2).isFunctionSpec() && (NIL != funcall(arghash_type_object_detector(arghash_type2), v_object))) && arghash_type_object_to_string_fn(arghash_type2).isFunctionSpec()) {
                return values(arghash_type_character(arghash_type2), funcall(arghash_type_object_to_string_fn(arghash_type2), v_object));
            }
            cdolist_list_var = cdolist_list_var.rest();
            arghash_type2 = cdolist_list_var.first();
        } 
        return values(CHAR_underbar, format(NIL, $str85$___A, v_object));
    }

    public static final SubLObject arghash_get_string_alt(SubLObject v_object, SubLObject object_type) {
        if (object_type == UNPROVIDED) {
            object_type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject handler_char = arghash_get_handler_char_and_string(v_object, object_type);
                SubLObject string = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return string;
            }
        }
    }

    public static SubLObject arghash_get_string(final SubLObject v_object, SubLObject object_type) {
        if (object_type == UNPROVIDED) {
            object_type = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject handler_char = arghash_get_handler_char_and_string(v_object, object_type);
        final SubLObject string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return string;
    }

    public static final SubLObject arghash_make_key_and_value_strings_alt(SubLObject key, SubLObject value, SubLObject value_type) {
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject key_type_char = arghash_get_handler_char_and_string(key, UNPROVIDED);
                SubLObject key_string = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject value_type_char = arghash_get_handler_char_and_string(value, value_type);
                    SubLObject value_string = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != key_type_char) {
                        if (NIL == value_type_char) {
                            key_string = cconcatenate(Strings.make_string(ONE_INTEGER, key_type_char), key_string);
                        } else {
                            key_string = cconcatenate(Strings.make_string(ONE_INTEGER, key_type_char), new SubLObject[]{ Strings.make_string(ONE_INTEGER, value_type_char), key_string });
                        }
                    }
                    return values(key_string, value_string);
                }
            }
        }
    }

    public static SubLObject arghash_make_key_and_value_strings(final SubLObject key, final SubLObject value, SubLObject value_type) {
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject key_type_char = arghash_get_handler_char_and_string(key, UNPROVIDED);
        SubLObject key_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject value_type_char = arghash_get_handler_char_and_string(value, value_type);
        final SubLObject value_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != key_type_char) {
            if (NIL == value_type_char) {
                key_string = cconcatenate(Strings.make_string(ONE_INTEGER, key_type_char), key_string);
            } else {
                key_string = cconcatenate(Strings.make_string(ONE_INTEGER, key_type_char), new SubLObject[]{ Strings.make_string(ONE_INTEGER, value_type_char), key_string });
            }
        }
        return values(key_string, value_string);
    }

    public static final SubLObject arghash_make_key_string_alt(SubLObject key, SubLObject value_type) {
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject key_type_char = arghash_get_handler_char_and_string(key, UNPROVIDED);
                SubLObject key_string = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject value_arghash_type = arghash_keyword_to_arghash_type(value_type);
                    SubLObject value_type_char = NIL;
                    if (NIL != arghash_type_p(value_arghash_type)) {
                        value_type_char = arghash_type_character(value_arghash_type);
                    }
                    if (NIL != key_type_char) {
                        if (NIL == value_type_char) {
                            key_string = cconcatenate(Strings.make_string(ONE_INTEGER, key_type_char), new SubLObject[]{ Strings.make_string(ONE_INTEGER, CHAR_underbar), key_string });
                        } else {
                            key_string = cconcatenate(Strings.make_string(ONE_INTEGER, key_type_char), new SubLObject[]{ Strings.make_string(ONE_INTEGER, value_type_char), key_string });
                        }
                    }
                    return key_string;
                }
            }
        }
    }

    public static SubLObject arghash_make_key_string(final SubLObject key, SubLObject value_type) {
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject key_type_char = arghash_get_handler_char_and_string(key, UNPROVIDED);
        SubLObject key_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject value_arghash_type = arghash_keyword_to_arghash_type(value_type);
        SubLObject value_type_char = NIL;
        if (NIL != arghash_type_p(value_arghash_type)) {
            value_type_char = arghash_type_character(value_arghash_type);
        }
        if (NIL != key_type_char) {
            if (NIL == value_type_char) {
                key_string = cconcatenate(Strings.make_string(ONE_INTEGER, key_type_char), new SubLObject[]{ Strings.make_string(ONE_INTEGER, CHAR_underbar), key_string });
            } else {
                key_string = cconcatenate(Strings.make_string(ONE_INTEGER, key_type_char), new SubLObject[]{ Strings.make_string(ONE_INTEGER, value_type_char), key_string });
            }
        }
        return key_string;
    }

    public static final SubLObject exists_arghash_valueP_alt(SubLObject key, SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject value = gethash(key, arghash, UNPROVIDED);
                SubLObject existsP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return existsP;
            }
        }
    }

    public static SubLObject exists_arghash_valueP(final SubLObject key, final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = gethash(key, arghash, UNPROVIDED);
        final SubLObject existsP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return existsP;
    }

    public static final SubLObject get_arghash_value_alt(SubLObject key, SubLObject arghash) {
        return hash_table_utilities.gethash_first(key, arghash, UNPROVIDED);
    }

    public static SubLObject get_arghash_value(final SubLObject key, final SubLObject arghash) {
        return hash_table_utilities.gethash_first(key, arghash, UNPROVIDED);
    }

    public static final SubLObject get_arghash_value_list_alt(SubLObject key, SubLObject arghash) {
        return gethash(key, arghash, UNPROVIDED);
    }

    public static SubLObject get_arghash_value_list(final SubLObject key, final SubLObject arghash) {
        return gethash(key, arghash, UNPROVIDED);
    }

    public static final SubLObject set_arghash_value_alt(SubLObject key, SubLObject arghash, SubLObject value) {
        return hash_table_utilities.sethash_first(key, arghash, value);
    }

    public static SubLObject set_arghash_value(final SubLObject key, final SubLObject arghash, final SubLObject value) {
        return hash_table_utilities.sethash_first(key, arghash, value);
    }

    public static final SubLObject set_arghash_value_list_alt(SubLObject key, SubLObject arghash, SubLObject value) {
        return sethash(key, arghash, value);
    }

    public static SubLObject set_arghash_value_list(final SubLObject key, final SubLObject arghash, final SubLObject value) {
        return sethash(key, arghash, value);
    }

    public static final SubLObject push_arghash_value_alt(SubLObject key, SubLObject value, SubLObject arghash) {
        return hash_table_utilities.push_to_end_hash(key, value, arghash);
    }

    public static SubLObject push_arghash_value(final SubLObject key, final SubLObject value, final SubLObject arghash) {
        return hash_table_utilities.push_to_end_hash(key, value, arghash);
    }

    public static final SubLObject pushnew_arghash_value_alt(SubLObject key, SubLObject value, SubLObject arghash) {
        return hash_table_utilities.pushnew_hash(key, value, arghash, UNPROVIDED);
    }

    public static SubLObject pushnew_arghash_value(final SubLObject key, final SubLObject value, final SubLObject arghash) {
        return hash_table_utilities.pushnew_hash(key, value, arghash, UNPROVIDED);
    }

    public static final SubLObject rem_arghash_value_alt(SubLObject key, SubLObject arghash) {
        return remhash(key, arghash);
    }

    public static SubLObject rem_arghash_value(final SubLObject key, final SubLObject arghash) {
        return remhash(key, arghash);
    }

    public static final SubLObject rem_arghash_values_alt(SubLObject key_list, SubLObject arghash) {
        {
            SubLObject cdolist_list_var = key_list;
            SubLObject key = NIL;
            for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                remhash(key, arghash);
            }
        }
        return NIL;
    }

    public static SubLObject rem_arghash_values(final SubLObject key_list, final SubLObject arghash) {
        SubLObject cdolist_list_var = key_list;
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            remhash(key, arghash);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject rem_arghash_values_inverse_alt(SubLObject neg_key_list, SubLObject arghash) {
        {
            SubLObject k = NIL;
            SubLObject v = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(arghash);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        k = getEntryKey(cdohash_entry);
                        v = getEntryValue(cdohash_entry);
                        if (NIL == subl_promotions.memberP(k, neg_key_list, UNPROVIDED, UNPROVIDED)) {
                            remhash(k, arghash);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject rem_arghash_values_inverse(final SubLObject neg_key_list, final SubLObject arghash) {
        SubLObject k = NIL;
        SubLObject v = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(arghash);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                k = getEntryKey(cdohash_entry);
                v = getEntryValue(cdohash_entry);
                if (NIL == subl_promotions.memberP(k, neg_key_list, UNPROVIDED, UNPROVIDED)) {
                    remhash(k, arghash);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static final SubLObject new_arghash_alt(SubLObject size) {
        if (size == UNPROVIDED) {
            size = $int$32;
        }
        return make_hash_table(size, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject new_arghash(SubLObject size) {
        if (size == UNPROVIDED) {
            size = $int$32;
        }
        return make_hash_table(size, symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject arghash_p_alt(SubLObject v_object) {
        return hash_table_p(v_object);
    }

    public static SubLObject arghash_p(final SubLObject v_object) {
        return hash_table_p(v_object);
    }

    public static final SubLObject copy_arghash_alt(SubLObject arghash) {
        {
            SubLObject new_arghash = new_arghash(UNPROVIDED);
            hash_table_utilities.copy_hash_table_values_into(arghash, new_arghash);
            return new_arghash;
        }
    }

    public static SubLObject copy_arghash(final SubLObject arghash) {
        final SubLObject new_arghash = new_arghash(UNPROVIDED);
        hash_table_utilities.copy_hash_table_values_into(arghash, new_arghash);
        return new_arghash;
    }

    public static final SubLObject get_arghash_keys_alt(SubLObject arghash) {
        return hash_table_utilities.hash_table_keys(arghash);
    }

    public static SubLObject get_arghash_keys(final SubLObject arghash) {
        return hash_table_utilities.hash_table_keys(arghash);
    }

    /**
     * Make a hash table from an argument list.  The values in the hash table are all lists so that if a key has more than one value it is handled well.  keys can be prefixed with special characters: ':' or ';' means that the key string (without the ':' or ';') should be converted to a keyword.  ',' or ';' means that the value should be converted to a fort if possible.  Special keys :JUST-STRING and :JUST-FORT are used when an argument is just a string (not a list pair). ;; todo: old comment!
     *
     * @unknown jantos
     */
    @LispMethod(comment = "Make a hash table from an argument list.  The values in the hash table are all lists so that if a key has more than one value it is handled well.  keys can be prefixed with special characters: \':\' or \';\' means that the key string (without the \':\' or \';\') should be converted to a keyword.  \',\' or \';\' means that the value should be converted to a fort if possible.  Special keys :JUST-STRING and :JUST-FORT are used when an argument is just a string (not a list pair). ;; todo: old comment!\r\n\r\n@unknown jantos")
    public static final SubLObject arglist_to_arghash_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arg_hash = new_arghash($int$32);
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    if (arg.isString()) {
                        {
                            SubLObject possible_fort = cb_guess_fort(arg, UNPROVIDED);
                            if (NIL != possible_fort) {
                                hash_table_utilities.push_to_end_hash($JUST_FORT, possible_fort, arg_hash);
                            } else {
                                hash_table_utilities.push_to_end_hash($JUST_STRING, arg, arg_hash);
                            }
                        }
                    }
                    if (arg.isList()) {
                        {
                            SubLObject key_string = arg.first();
                            SubLObject value_string = second(arg);
                            thread.resetMultipleValues();
                            {
                                SubLObject key = arghash_parse_key_and_value(key_string, value_string);
                                SubLObject value = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                hash_table_utilities.push_to_end_hash(key, value, arg_hash);
                            }
                        }
                    }
                }
                return arg_hash;
            }
        }
    }

    /**
     * Make a hash table from an argument list.  The values in the hash table are all lists so that if a key has more than one value it is handled well.  keys can be prefixed with special characters: ':' or ';' means that the key string (without the ':' or ';') should be converted to a keyword.  ',' or ';' means that the value should be converted to a fort if possible.  Special keys :JUST-STRING and :JUST-FORT are used when an argument is just a string (not a list pair). ;; todo: old comment!
     *
     * @unknown jantos
     */
    @LispMethod(comment = "Make a hash table from an argument list.  The values in the hash table are all lists so that if a key has more than one value it is handled well.  keys can be prefixed with special characters: \':\' or \';\' means that the key string (without the \':\' or \';\') should be converted to a keyword.  \',\' or \';\' means that the value should be converted to a fort if possible.  Special keys :JUST-STRING and :JUST-FORT are used when an argument is just a string (not a list pair). ;; todo: old comment!\r\n\r\n@unknown jantos")
    public static SubLObject arglist_to_arghash(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_hash = new_arghash($int$32);
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isString()) {
                final SubLObject possible_fort = cb_guess_fort(arg, UNPROVIDED);
                if (NIL != possible_fort) {
                    hash_table_utilities.push_to_end_hash($JUST_FORT, possible_fort, arg_hash);
                } else {
                    hash_table_utilities.push_to_end_hash($JUST_STRING, arg, arg_hash);
                }
            }
            if (arg.isList()) {
                final SubLObject key_string = arg.first();
                final SubLObject value_string = second(arg);
                thread.resetMultipleValues();
                final SubLObject key = arghash_parse_key_and_value(key_string, value_string);
                final SubLObject value = thread.secondMultipleValue();
                thread.resetMultipleValues();
                hash_table_utilities.push_to_end_hash(key, value, arg_hash);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return arg_hash;
    }

    public static final SubLObject argassoc_to_arghash_alt(SubLObject argassoc) {
        {
            SubLObject arghash = new_arghash($int$32);
            SubLObject cdolist_list_var = argassoc;
            SubLObject argpair = NIL;
            for (argpair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argpair = cdolist_list_var.first()) {
                if (NIL != forts.fort_p(argpair)) {
                    push_arghash_value($JUST_FORT, argpair, arghash);
                } else {
                    if (argpair.isString()) {
                        push_arghash_value($JUST_STRING, argpair, arghash);
                    } else {
                        if (NIL != list_utilities.lengthE(argpair, TWO_INTEGER, UNPROVIDED)) {
                            push_arghash_value(argpair.first(), second(argpair), arghash);
                        }
                    }
                }
            }
            return arghash;
        }
    }

    public static SubLObject argassoc_to_arghash(final SubLObject argassoc) {
        final SubLObject arghash = new_arghash($int$32);
        SubLObject cdolist_list_var = argassoc;
        SubLObject argpair = NIL;
        argpair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != forts.fort_p(argpair)) {
                push_arghash_value($JUST_FORT, argpair, arghash);
            } else
                if (argpair.isString()) {
                    push_arghash_value($JUST_STRING, argpair, arghash);
                } else
                    if (NIL != list_utilities.lengthE(argpair, TWO_INTEGER, UNPROVIDED)) {
                        push_arghash_value(argpair.first(), second(argpair), arghash);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            argpair = cdolist_list_var.first();
        } 
        return arghash;
    }

    public static final SubLObject html_arghash_href_alt(SubLObject arghash, SubLObject html_handler_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject href = NIL;
                SubLObject href_list = NIL;
                href_list = cons(html_handler_name, href_list);
                {
                    SubLObject key = NIL;
                    SubLObject value_list = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(arghash);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                key = getEntryKey(cdohash_entry);
                                value_list = getEntryValue(cdohash_entry);
                                {
                                    SubLObject cdolist_list_var = value_list;
                                    SubLObject value = NIL;
                                    for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject key_string = arghash_make_key_and_value_strings(key, value, UNPROVIDED);
                                            SubLObject value_string = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            href_list = cons($str_alt87$_, href_list);
                                            href_list = cons(web_utilities.html_url_encode(key_string, UNPROVIDED), href_list);
                                            href_list = cons($str_alt88$_, href_list);
                                            href_list = cons(web_utilities.html_url_encode(value_string, UNPROVIDED), href_list);
                                        }
                                    }
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                href = apply(symbol_function(CCONCATENATE), nreverse(href_list));
                return href;
            }
        }
    }

    public static SubLObject html_arghash_href(final SubLObject arghash, final SubLObject html_handler_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject href = NIL;
        SubLObject href_list = NIL;
        href_list = cons(html_handler_name, href_list);
        SubLObject key = NIL;
        SubLObject value_list = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(arghash);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                SubLObject cdolist_list_var;
                value_list = cdolist_list_var = getEntryValue(cdohash_entry);
                SubLObject value = NIL;
                value = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject key_string = arghash_make_key_and_value_strings(key, value, UNPROVIDED);
                    final SubLObject value_string = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    href_list = cons($str89$_, href_list);
                    href_list = cons(web_utilities.html_url_encode(key_string, UNPROVIDED), href_list);
                    href_list = cons($str90$_, href_list);
                    href_list = cons(web_utilities.html_url_encode(value_string, UNPROVIDED), href_list);
                    cdolist_list_var = cdolist_list_var.rest();
                    value = cdolist_list_var.first();
                } 
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        href = apply(symbol_function(CCONCATENATE), nreverse(href_list));
        return href;
    }

    public static final SubLObject html_arghash_fancy_anchor_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt89);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject arghash = NIL;
                    SubLObject html_handler_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt89);
                    arghash = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt89);
                    html_handler_name = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt89);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt89);
                            if (NIL == member(current_3, $list_alt90, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt89);
                        }
                        {
                            SubLObject name_tail = property_list_member($NAME, current);
                            SubLObject name = (NIL != name_tail) ? ((SubLObject) (cadr(name_tail))) : NIL;
                            SubLObject target_tail = property_list_member($TARGET, current);
                            SubLObject target = (NIL != target_tail) ? ((SubLObject) (cadr(target_tail))) : NIL;
                            SubLObject script_tail = property_list_member($SCRIPT, current);
                            SubLObject script = (NIL != script_tail) ? ((SubLObject) (cadr(script_tail))) : NIL;
                            SubLObject style_tail = property_list_member($STYLE, current);
                            SubLObject style = (NIL != style_tail) ? ((SubLObject) (cadr(style_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject href = $sym95$HREF;
                                return list(CLET, list(list(href, list(FORMAT, NIL, $str_alt97$_A__A, $cyc_cgi_program$, list(HTML_ARGHASH_HREF, arghash, html_handler_name)))), listS(HTML_FANCY_ANCHOR, list(new SubLObject[]{ $HREF, href, $NAME, name, $TARGET, target, $SCRIPT, script, $STYLE, style }), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject html_arghash_fancy_anchor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list91);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arghash = NIL;
        SubLObject html_handler_name = NIL;
        destructuring_bind_must_consp(current, datum, $list91);
        arghash = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list91);
        html_handler_name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list91);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list91);
            if (NIL == member(current_$1, $list92, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list91);
        }
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject target_tail = property_list_member($TARGET, current);
        final SubLObject target = (NIL != target_tail) ? cadr(target_tail) : NIL;
        final SubLObject script_tail = property_list_member($SCRIPT, current);
        final SubLObject script = (NIL != script_tail) ? cadr(script_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject href = $sym97$HREF;
        return list(CLET, list(list(href, list(FORMAT, NIL, $str99$_A__A, $cyc_cgi_program$, list(HTML_ARGHASH_HREF, arghash, html_handler_name)))), listS(HTML_FANCY_ANCHOR, list(new SubLObject[]{ $HREF, href, $NAME, name, $TARGET, target, $SCRIPT, script, $STYLE, style }), append(body, NIL)));
    }

    /**
     * Output a checkbox input form element and make it checked iff KEY is not null in ARGHASH.
     */
    @LispMethod(comment = "Output a checkbox input form element and make it checked iff KEY is not null in ARGHASH.")
    public static final SubLObject html_arghash_checkbox_input_alt(SubLObject arghash, SubLObject key, SubLObject value, SubLObject script, SubLObject onclick) {
        if (script == UNPROVIDED) {
            script = NIL;
        }
        if (onclick == UNPROVIDED) {
            onclick = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject values = get_arghash_value_list(key, arghash);
                thread.resetMultipleValues();
                {
                    SubLObject key_string = arghash_make_key_and_value_strings(key, value, UNPROVIDED);
                    SubLObject value_string = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject checkedP = list_utilities.member_equalP(value, values);
                        html_checkbox_input(key_string, value_string, checkedP, script, onclick, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Output a checkbox input form element and make it checked iff KEY is not null in ARGHASH.
     */
    @LispMethod(comment = "Output a checkbox input form element and make it checked iff KEY is not null in ARGHASH.")
    public static SubLObject html_arghash_checkbox_input(final SubLObject arghash, final SubLObject key, final SubLObject value, SubLObject script, SubLObject onclick) {
        if (script == UNPROVIDED) {
            script = NIL;
        }
        if (onclick == UNPROVIDED) {
            onclick = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject values = get_arghash_value_list(key, arghash);
        thread.resetMultipleValues();
        final SubLObject key_string = arghash_make_key_and_value_strings(key, value, UNPROVIDED);
        final SubLObject value_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject checkedP = list_utilities.member_equalP(value, values);
        html_checkbox_input(key_string, value_string, checkedP, script, onclick, UNPROVIDED);
        return NIL;
    }

    /**
     * Output a radio button input form element and make it checked iff KEY is not null in ARGHASH.
     */
    @LispMethod(comment = "Output a radio button input form element and make it checked iff KEY is not null in ARGHASH.")
    public static final SubLObject html_arghash_radio_input_alt(SubLObject arghash, SubLObject key, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject values = get_arghash_value_list(key, arghash);
                thread.resetMultipleValues();
                {
                    SubLObject key_string = arghash_make_key_and_value_strings(key, value, UNPROVIDED);
                    SubLObject value_string = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject checkedP = list_utilities.member_equalP(value, values);
                        html_radio_input(key_string, value_string, checkedP);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Output a radio button input form element and make it checked iff KEY is not null in ARGHASH.
     */
    @LispMethod(comment = "Output a radio button input form element and make it checked iff KEY is not null in ARGHASH.")
    public static SubLObject html_arghash_radio_input(final SubLObject arghash, final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject values = get_arghash_value_list(key, arghash);
        thread.resetMultipleValues();
        final SubLObject key_string = arghash_make_key_and_value_strings(key, value, UNPROVIDED);
        final SubLObject value_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject checkedP = list_utilities.member_equalP(value, values);
        html_radio_input(key_string, value_string, checkedP, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_arghash_focus_radio_input_alt(SubLObject arghash, SubLObject key, SubLObject focus_key, SubLObject focus_value_type, SubLObject value, SubLObject value_type) {
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject values = get_arghash_value_list(key, arghash);
                SubLObject focus = arghash_make_key_string(focus_key, focus_value_type);
                thread.resetMultipleValues();
                {
                    SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
                    SubLObject value_string = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject checkedP = list_utilities.member_equalP(value, values);
                        html_script_utilities.html_focus_radio_input(key_string, focus, value_string, checkedP);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject html_arghash_focus_radio_input(final SubLObject arghash, final SubLObject key, final SubLObject focus_key, final SubLObject focus_value_type, final SubLObject value, SubLObject value_type) {
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject values = get_arghash_value_list(key, arghash);
        final SubLObject focus = arghash_make_key_string(focus_key, focus_value_type);
        thread.resetMultipleValues();
        final SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
        final SubLObject value_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject checkedP = list_utilities.member_equalP(value, values);
        html_script_utilities.html_focus_radio_input(key_string, focus, value_string, checkedP, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject html_arghash_clear_radio_input_alt(SubLObject arghash, SubLObject key, SubLObject clear_key, SubLObject clear_value_type, SubLObject value, SubLObject value_type) {
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject values = get_arghash_value_list(key, arghash);
                SubLObject clear = arghash_make_key_string(clear_key, clear_value_type);
                thread.resetMultipleValues();
                {
                    SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
                    SubLObject value_string = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject checkedP = list_utilities.member_equalP(value, values);
                        html_script_utilities.html_clear_radio_input(key_string, clear, value_string, checkedP);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject html_arghash_clear_radio_input(final SubLObject arghash, final SubLObject key, final SubLObject clear_key, final SubLObject clear_value_type, final SubLObject value, SubLObject value_type) {
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject values = get_arghash_value_list(key, arghash);
        final SubLObject clear = arghash_make_key_string(clear_key, clear_value_type);
        thread.resetMultipleValues();
        final SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
        final SubLObject value_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject checkedP = list_utilities.member_equalP(value, values);
        html_script_utilities.html_clear_radio_input(key_string, clear, value_string, checkedP, UNPROVIDED);
        return NIL;
    }

    /**
     * Output a hidden input form element with value for KEY initialized from ARGHASH (o/w use DEFAULT-VALUE)
     */
    @LispMethod(comment = "Output a hidden input form element with value for KEY initialized from ARGHASH (o/w use DEFAULT-VALUE)")
    public static final SubLObject html_arghash_hidden_input_alt(SubLObject arghash, SubLObject key, SubLObject default_value, SubLObject id) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        if (id == UNPROVIDED) {
            id = NIL;
        }
        {
            SubLObject poss_values = get_arghash_value_list(key, arghash);
            if (poss_values.equal($list_alt102)) {
                poss_values = NIL;
            }
            if (NIL == poss_values) {
                if (NIL != default_value) {
                    poss_values = list(default_value);
                }
            }
            {
                SubLObject cdolist_list_var = poss_values;
                SubLObject poss_value = NIL;
                for (poss_value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , poss_value = cdolist_list_var.first()) {
                    html_arghash_hidden_input_force(arghash, key, poss_value, id, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     * Output a hidden input form element with value for KEY initialized from ARGHASH (o/w use DEFAULT-VALUE)
     */
    @LispMethod(comment = "Output a hidden input form element with value for KEY initialized from ARGHASH (o/w use DEFAULT-VALUE)")
    public static SubLObject html_arghash_hidden_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject id) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        if (id == UNPROVIDED) {
            id = NIL;
        }
        SubLObject poss_values = get_arghash_value_list(key, arghash);
        if (poss_values.equal($list104)) {
            poss_values = NIL;
        }
        if ((NIL == poss_values) && (NIL != default_value)) {
            poss_values = list(default_value);
        }
        SubLObject cdolist_list_var = poss_values;
        SubLObject poss_value = NIL;
        poss_value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            html_arghash_hidden_input_force(arghash, key, poss_value, id, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            poss_value = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Output a hidden input form element with VALUE forced for KEY. (ARGHASH is ignored)
     */
    @LispMethod(comment = "Output a hidden input form element with VALUE forced for KEY. (ARGHASH is ignored)")
    public static final SubLObject html_arghash_hidden_input_force_alt(SubLObject arghash, SubLObject key, SubLObject value, SubLObject value_type, SubLObject id) {
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        if (id == UNPROVIDED) {
            id = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
                SubLObject value_string = thread.secondMultipleValue();
                thread.resetMultipleValues();
                html_hidden_input(key_string, value_string, id);
            }
            return NIL;
        }
    }

    /**
     * Output a hidden input form element with VALUE forced for KEY. (ARGHASH is ignored)
     */
    @LispMethod(comment = "Output a hidden input form element with VALUE forced for KEY. (ARGHASH is ignored)")
    public static SubLObject html_arghash_hidden_input_force(final SubLObject arghash, final SubLObject key, final SubLObject value, SubLObject value_type, SubLObject id) {
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        if (id == UNPROVIDED) {
            id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
        final SubLObject value_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        html_hidden_input(key_string, value_string, id);
        return NIL;
    }

    /**
     * Output a <select> block for KEY where values are of type VALUE-TYPE.
     */
    @LispMethod(comment = "Output a <select> block for KEY where values are of type VALUE-TYPE.")
    public static final SubLObject html_arghash_fancy_select_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt103);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt103);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt103);
                    value_type = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt103);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt103);
                            if (NIL == member(current_4, $list_alt104, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt103);
                        }
                        {
                            SubLObject multiple_tail = property_list_member($MULTIPLE, current);
                            SubLObject multiple = (NIL != multiple_tail) ? ((SubLObject) (cadr(multiple_tail))) : NIL;
                            SubLObject size_tail = property_list_member($SIZE, current);
                            SubLObject size = (NIL != size_tail) ? ((SubLObject) (cadr(size_tail))) : NIL;
                            SubLObject script_tail = property_list_member($SCRIPT, current);
                            SubLObject script = (NIL != script_tail) ? ((SubLObject) (cadr(script_tail))) : NIL;
                            SubLObject onchange_tail = property_list_member($ONCHANGE, current);
                            SubLObject onchange = (NIL != onchange_tail) ? ((SubLObject) (cadr(onchange_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject key_string = $sym108$KEY_STRING;
                                return list(CLET, list(list(key_string, list(ARGHASH_MAKE_KEY_STRING, key, value_type))), listS(HTML_FANCY_SELECT, list(new SubLObject[]{ key_string, $MULTIPLE, multiple, $SIZE, size, $SCRIPT, script, $ONCHANGE, onchange }), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Output a <select> block for KEY where values are of type VALUE-TYPE.
     */
    @LispMethod(comment = "Output a <select> block for KEY where values are of type VALUE-TYPE.")
    public static SubLObject html_arghash_fancy_select(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list105);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value_type = NIL;
        destructuring_bind_must_consp(current, datum, $list105);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list105);
        value_type = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list105);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list105);
            if (NIL == member(current_$2, $list106, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list105);
        }
        final SubLObject multiple_tail = property_list_member($MULTIPLE, current);
        final SubLObject multiple = (NIL != multiple_tail) ? cadr(multiple_tail) : NIL;
        final SubLObject size_tail = property_list_member($SIZE, current);
        final SubLObject size = (NIL != size_tail) ? cadr(size_tail) : NIL;
        final SubLObject script_tail = property_list_member($SCRIPT, current);
        final SubLObject script = (NIL != script_tail) ? cadr(script_tail) : NIL;
        final SubLObject onchange_tail = property_list_member($ONCHANGE, current);
        final SubLObject onchange = (NIL != onchange_tail) ? cadr(onchange_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject key_string = $sym110$KEY_STRING;
        return list(CLET, list(list(key_string, list(ARGHASH_MAKE_KEY_STRING, key, value_type))), listS(HTML_FANCY_SELECT, list(new SubLObject[]{ key_string, $MULTIPLE, multiple, $SIZE, size, $SCRIPT, script, $ONCHANGE, onchange }), append(body, NIL)));
    }

    /**
     * Output an <option> element and make it selected iff KEY is not null in ARGHASH.
     */
    @LispMethod(comment = "Output an <option> element and make it selected iff KEY is not null in ARGHASH.")
    public static final SubLObject html_arghash_fancy_option_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt111);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject arghash = NIL;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt111);
                    arghash = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt111);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt111);
                    value = current.first();
                    current = current.rest();
                    {
                        SubLObject value_type = (current.isCons()) ? ((SubLObject) (current.first())) : $DEFAULT;
                        destructuring_bind_must_listp(current, datum, $list_alt111);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject value_string = $sym112$VALUE_STRING;
                                SubLObject selected = $sym113$SELECTED;
                                return list(CLET, list(list(selected, list($sym114$MEMBER_EQUAL_, value, list(GET_ARGHASH_VALUE_LIST, key, arghash))), list(value_string, list(ARGHASH_GET_STRING, value, value_type))), listS(HTML_FANCY_OPTION, list($SELECTED, selected, $VALUE, value_string), append(body, NIL)));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt111);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Output an <option> element and make it selected iff KEY is not null in ARGHASH.
     */
    @LispMethod(comment = "Output an <option> element and make it selected iff KEY is not null in ARGHASH.")
    public static SubLObject html_arghash_fancy_option(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list113);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arghash = NIL;
        SubLObject key = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list113);
        arghash = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list113);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list113);
        value = current.first();
        current = current.rest();
        final SubLObject value_type = (current.isCons()) ? current.first() : $DEFAULT;
        destructuring_bind_must_listp(current, datum, $list113);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject value_string = $sym114$VALUE_STRING;
            final SubLObject selected = $sym115$SELECTED;
            return list(CLET, list(list(selected, list($sym116$MEMBER_EQUAL_, value, list(GET_ARGHASH_VALUE_LIST, key, arghash))), list(value_string, list(ARGHASH_GET_STRING, value, value_type))), listS(HTML_FANCY_OPTION, list($SELECTED, selected, $VALUE, value_string), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list113);
        return NIL;
    }

    /**
     * Output a <select> block with <options> for KEY where values are of type VALUE-TYPE and VALUES and VALUE-STRINGS are provided.
     */
    @LispMethod(comment = "Output a <select> block with <options> for KEY where values are of type VALUE-TYPE and VALUES and VALUE-STRINGS are provided.")
    public static final SubLObject html_arghash_fancy_select_with_options_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject arghash = NIL;
            SubLObject key = NIL;
            SubLObject value_type = NIL;
            SubLObject values = NIL;
            SubLObject value_strings = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt120);
            arghash = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt120);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt120);
            value_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt120);
            values = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt120);
            value_strings = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_5 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt120);
                    current_5 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt120);
                    if (NIL == member(current_5, $list_alt104, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_5 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt120);
                }
                {
                    SubLObject multiple_tail = property_list_member($MULTIPLE, current);
                    SubLObject multiple = (NIL != multiple_tail) ? ((SubLObject) (cadr(multiple_tail))) : NIL;
                    SubLObject size_tail = property_list_member($SIZE, current);
                    SubLObject size = (NIL != size_tail) ? ((SubLObject) (cadr(size_tail))) : NIL;
                    SubLObject script_tail = property_list_member($SCRIPT, current);
                    SubLObject script = (NIL != script_tail) ? ((SubLObject) (cadr(script_tail))) : NIL;
                    SubLObject onchange_tail = property_list_member($ONCHANGE, current);
                    SubLObject onchange = (NIL != onchange_tail) ? ((SubLObject) (cadr(onchange_tail))) : NIL;
                    SubLObject value = $sym121$VALUE;
                    SubLObject value_string = $sym122$VALUE_STRING;
                    return list(HTML_ARGHASH_FANCY_SELECT, list(new SubLObject[]{ key, value_type, $MULTIPLE, multiple, $SIZE, size, $SCRIPT, script, $ONCHANGE, onchange }), list(CDOLIST_MULTIPLE, list(list(value, values), list(value_string, value_strings)), list(HTML_ARGHASH_FANCY_OPTION, list(arghash, key, value, value_type), list(HTML_PRINC, value_string))));
                }
            }
        }
    }

    /**
     * Output a <select> block with <options> for KEY where values are of type VALUE-TYPE and VALUES and VALUE-STRINGS are provided.
     */
    @LispMethod(comment = "Output a <select> block with <options> for KEY where values are of type VALUE-TYPE and VALUES and VALUE-STRINGS are provided.")
    public static SubLObject html_arghash_fancy_select_with_options(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject arghash = NIL;
        SubLObject key = NIL;
        SubLObject value_type = NIL;
        SubLObject values = NIL;
        SubLObject value_strings = NIL;
        destructuring_bind_must_consp(current, datum, $list122);
        arghash = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        value_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        values = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list122);
        value_strings = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list122);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list122);
            if (NIL == member(current_$3, $list106, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list122);
        }
        final SubLObject multiple_tail = property_list_member($MULTIPLE, current);
        final SubLObject multiple = (NIL != multiple_tail) ? cadr(multiple_tail) : NIL;
        final SubLObject size_tail = property_list_member($SIZE, current);
        final SubLObject size = (NIL != size_tail) ? cadr(size_tail) : NIL;
        final SubLObject script_tail = property_list_member($SCRIPT, current);
        final SubLObject script = (NIL != script_tail) ? cadr(script_tail) : NIL;
        final SubLObject onchange_tail = property_list_member($ONCHANGE, current);
        final SubLObject onchange = (NIL != onchange_tail) ? cadr(onchange_tail) : NIL;
        final SubLObject value = $sym123$VALUE;
        final SubLObject value_string = $sym124$VALUE_STRING;
        return list(HTML_ARGHASH_FANCY_SELECT, list(new SubLObject[]{ key, value_type, $MULTIPLE, multiple, $SIZE, size, $SCRIPT, script, $ONCHANGE, onchange }), list(CDOLIST_MULTIPLE, list(list(value, values), list(value_string, value_strings)), list(HTML_ARGHASH_FANCY_OPTION, list(arghash, key, value, value_type), list(HTML_PRINC, value_string))));
    }

    /**
     * Output a button where the button name is determined from KEY. (ARGHASH is ignored)
     */
    @LispMethod(comment = "Output a button where the button name is determined from KEY. (ARGHASH is ignored)")
    public static final SubLObject html_arghash_submit_input_alt(SubLObject arghash, SubLObject label, SubLObject key, SubLObject script) {
        if (script == UNPROVIDED) {
            script = NIL;
        }
        {
            SubLObject key_string = arghash_make_key_string(key, $BOOLEAN);
            return html_submit_input(label, key_string, script);
        }
    }

    /**
     * Output a button where the button name is determined from KEY. (ARGHASH is ignored)
     */
    @LispMethod(comment = "Output a button where the button name is determined from KEY. (ARGHASH is ignored)")
    public static SubLObject html_arghash_submit_input(final SubLObject arghash, final SubLObject label, final SubLObject key, SubLObject script) {
        if (script == UNPROVIDED) {
            script = NIL;
        }
        final SubLObject key_string = arghash_make_key_string(key, $BOOLEAN);
        return html_submit_input(label, key_string, script);
    }

    /**
     * Output a clear button where the button name is determined from KEY and VALUE-TYPE. (ARGHASH is ignored)
     */
    @LispMethod(comment = "Output a clear button where the button name is determined from KEY and VALUE-TYPE. (ARGHASH is ignored)")
    public static final SubLObject html_arghash_clear_input_button_alt(SubLObject arghash, SubLObject key, SubLObject value_type, SubLObject value) {
        if (value == UNPROVIDED) {
            value = NIL;
        }
        {
            SubLObject key_string = arghash_make_key_string(key, value_type);
            return html_script_utilities.html_clear_input_button(key_string, value);
        }
    }

    /**
     * Output a clear button where the button name is determined from KEY and VALUE-TYPE. (ARGHASH is ignored)
     */
    @LispMethod(comment = "Output a clear button where the button name is determined from KEY and VALUE-TYPE. (ARGHASH is ignored)")
    public static SubLObject html_arghash_clear_input_button(final SubLObject arghash, final SubLObject key, final SubLObject value_type, SubLObject value) {
        if (value == UNPROVIDED) {
            value = NIL;
        }
        final SubLObject key_string = arghash_make_key_string(key, value_type);
        return html_script_utilities.html_clear_input_button(key_string, value, UNPROVIDED);
    }

    /**
     * Output a complete button where the button name is determined from KEY. (ARGHASH is ignored)
     */
    @LispMethod(comment = "Output a complete button where the button name is determined from KEY. (ARGHASH is ignored)")
    public static final SubLObject html_arghash_complete_button_alt(SubLObject arghash, SubLObject key, SubLObject value_type, SubLObject filter_type, SubLObject label, SubLObject auto_submit) {
        if (filter_type == UNPROVIDED) {
            filter_type = NIL;
        }
        if (label == UNPROVIDED) {
            label = $$$Complete;
        }
        if (auto_submit == UNPROVIDED) {
            auto_submit = NIL;
        }
        {
            SubLObject key_string = arghash_make_key_string(key, value_type);
            return html_complete.html_complete_button(key_string, label, filter_type, auto_submit, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Output a complete button where the button name is determined from KEY. (ARGHASH is ignored)
     */
    @LispMethod(comment = "Output a complete button where the button name is determined from KEY. (ARGHASH is ignored)")
    public static SubLObject html_arghash_complete_button(final SubLObject arghash, final SubLObject key, final SubLObject value_type, SubLObject filter_type, SubLObject label, SubLObject auto_submit) {
        if (filter_type == UNPROVIDED) {
            filter_type = NIL;
        }
        if (label == UNPROVIDED) {
            label = $$$Complete;
        }
        if (auto_submit == UNPROVIDED) {
            auto_submit = NIL;
        }
        final SubLObject key_string = arghash_make_key_string(key, value_type);
        return html_complete.html_complete_button(key_string, label, filter_type, auto_submit, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Output a text input form element where value for KEY initialized from ARGHASH.
     */
    @LispMethod(comment = "Output a text input form element where value for KEY initialized from ARGHASH.")
    public static final SubLObject html_arghash_text_input_alt(SubLObject arghash, SubLObject key, SubLObject default_value, SubLObject size, SubLObject value_type) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject value = get_arghash_value(key, arghash);
                if (NIL == value) {
                    value = default_value;
                }
                if (NIL != value) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
                        SubLObject value_string = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        html_text_input(key_string, value_string, size);
                    }
                } else {
                    {
                        SubLObject key_string = arghash_make_key_string(key, value_type);
                        html_text_input(key_string, $str_alt55$, size);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Output a text input form element where value for KEY initialized from ARGHASH.
     */
    @LispMethod(comment = "Output a text input form element where value for KEY initialized from ARGHASH.")
    public static SubLObject html_arghash_text_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject size, SubLObject value_type) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject value = get_arghash_value(key, arghash);
        if (NIL == value) {
            value = default_value;
        }
        if (NIL != value) {
            thread.resetMultipleValues();
            final SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
            final SubLObject value_string = thread.secondMultipleValue();
            thread.resetMultipleValues();
            html_text_input(key_string, value_string, size);
        } else {
            final SubLObject key_string = arghash_make_key_string(key, value_type);
            html_text_input(key_string, $str57$, size);
        }
        return NIL;
    }

    /**
     * Output a text input form element where value for KEY initialized from ARGHASH.
     */
    @LispMethod(comment = "Output a text input form element where value for KEY initialized from ARGHASH.")
    public static final SubLObject html_arghash_textarea_input_alt(SubLObject arghash, SubLObject key, SubLObject default_value, SubLObject cols, SubLObject rows, SubLObject wrap, SubLObject value_type) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        if (cols == UNPROVIDED) {
            cols = NIL;
        }
        if (rows == UNPROVIDED) {
            rows = NIL;
        }
        if (wrap == UNPROVIDED) {
            wrap = NIL;
        }
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject value = get_arghash_value(key, arghash);
                if (NIL == value) {
                    value = default_value;
                }
                if (NIL != value) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
                        SubLObject value_string = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(key_string);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != cols) {
                            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(cols);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != rows) {
                            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(rows);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != wrap) {
                            html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$virtual);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(value_string);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                    }
                } else {
                    {
                        SubLObject key_string = arghash_make_key_string(key, value_type);
                        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(key_string);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != cols) {
                            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(cols);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != rows) {
                            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(rows);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != wrap) {
                            html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$virtual);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Output a text input form element where value for KEY initialized from ARGHASH.
     */
    @LispMethod(comment = "Output a text input form element where value for KEY initialized from ARGHASH.")
    public static SubLObject html_arghash_textarea_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject cols, SubLObject rows, SubLObject wrap, SubLObject value_type) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        if (cols == UNPROVIDED) {
            cols = NIL;
        }
        if (rows == UNPROVIDED) {
            rows = NIL;
        }
        if (wrap == UNPROVIDED) {
            wrap = NIL;
        }
        if (value_type == UNPROVIDED) {
            value_type = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject value = get_arghash_value(key, arghash);
        if (NIL == value) {
            value = default_value;
        }
        if (NIL != value) {
            thread.resetMultipleValues();
            final SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
            final SubLObject value_string = thread.secondMultipleValue();
            thread.resetMultipleValues();
            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(key_string);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != cols) {
                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(cols);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != rows) {
                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(rows);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != wrap) {
                html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$virtual);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(value_string);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        } else {
            final SubLObject key_string = arghash_make_key_string(key, value_type);
            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(key_string);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != cols) {
                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(cols);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != rows) {
                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(rows);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != wrap) {
                html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$virtual);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        }
        return NIL;
    }

    /**
     * Output a text input form element where the value-type of the field is :fort, the value is initialized from ARGHASH by KEY o/w the DEFAULT-VALUE is used.  COMPLETE-TEXT is the test on the complete button and FILTER-COL is the type of fort requested.
     */
    @LispMethod(comment = "Output a text input form element where the value-type of the field is :fort, the value is initialized from ARGHASH by KEY o/w the DEFAULT-VALUE is used.  COMPLETE-TEXT is the test on the complete button and FILTER-COL is the type of fort requested.")
    public static final SubLObject html_arghash_fort_input_alt(SubLObject arghash, SubLObject key, SubLObject default_value, SubLObject size, SubLObject complete_text, SubLObject filter_col) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (complete_text == UNPROVIDED) {
            complete_text = $$$Complete;
        }
        if (filter_col == UNPROVIDED) {
            filter_col = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = get_arghash_value(key, arghash);
                SubLObject fort_name = kb_paths.fort_name(fort);
                if (NIL != forts.fort_p(fort)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key_string = arghash_make_key_and_value_strings(key, fort, UNPROVIDED);
                        SubLObject value_string = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        html_complete.html_complete_button(key_string, complete_text, filter_col, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_glyph($NBSP, UNPROVIDED);
                        html_text_input(key_string, fort_name, size);
                    }
                } else {
                    {
                        SubLObject key_string = arghash_make_key_string(key, $FORT);
                        html_complete.html_complete_button(key_string, complete_text, filter_col, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_glyph($NBSP, UNPROVIDED);
                        html_text_input(key_string, default_value, size);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Output a text input form element where the value-type of the field is :fort, the value is initialized from ARGHASH by KEY o/w the DEFAULT-VALUE is used.  COMPLETE-TEXT is the test on the complete button and FILTER-COL is the type of fort requested.
     */
    @LispMethod(comment = "Output a text input form element where the value-type of the field is :fort, the value is initialized from ARGHASH by KEY o/w the DEFAULT-VALUE is used.  COMPLETE-TEXT is the test on the complete button and FILTER-COL is the type of fort requested.")
    public static SubLObject html_arghash_fort_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject size, SubLObject complete_text, SubLObject filter_col) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (complete_text == UNPROVIDED) {
            complete_text = $$$Complete;
        }
        if (filter_col == UNPROVIDED) {
            filter_col = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = get_arghash_value(key, arghash);
        final SubLObject fort_name = kb_paths.fort_name(fort);
        if (NIL != forts.fort_p(fort)) {
            thread.resetMultipleValues();
            final SubLObject key_string = arghash_make_key_and_value_strings(key, fort, UNPROVIDED);
            final SubLObject value_string = thread.secondMultipleValue();
            thread.resetMultipleValues();
            html_complete.html_complete_button(key_string, complete_text, filter_col, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_glyph($NBSP, UNPROVIDED);
            html_text_input(key_string, fort_name, size);
        } else {
            final SubLObject key_string = arghash_make_key_string(key, $FORT);
            html_complete.html_complete_button(key_string, complete_text, filter_col, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_glyph($NBSP, UNPROVIDED);
            html_text_input(key_string, default_value, size);
        }
        return NIL;
    }

    public static final SubLObject html_arghash_sentence_input_alt(SubLObject arghash, SubLObject key, SubLObject default_value, SubLObject rows, SubLObject cols, SubLObject complete_text, SubLObject cyclify_text, SubLObject clear_text) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        if (rows == UNPROVIDED) {
            rows = NIL;
        }
        if (cols == UNPROVIDED) {
            cols = NIL;
        }
        if (complete_text == UNPROVIDED) {
            complete_text = $$$Complete;
        }
        if (cyclify_text == UNPROVIDED) {
            cyclify_text = $$$Cyclify;
        }
        if (clear_text == UNPROVIDED) {
            clear_text = $$$Clear;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence_object = get_arghash_value(key, arghash);
                SubLObject sentence = (NIL != assertion_handles.assertion_p(sentence_object)) ? ((SubLObject) (uncanonicalizer.assertion_el_formula(sentence_object))) : uncanonicalizer.el_version(sentence_object, UNPROVIDED);
                if (NIL != el_grammar.el_sentence_p(sentence)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key_string = arghash_make_key_and_value_strings(key, sentence, $EL_FORMULA);
                        SubLObject value_string = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        cb_form_widgets.cb_el_sentence_input_section(sentence, list(new SubLObject[]{ $INPUT_NAME, key_string, $COMPLETE_LABEL, complete_text, $CYCLIFY_LABEL, cyclify_text, $CLEAR_LABEL, clear_text, $HEIGHT, rows, $WIDTH, cols }));
                    }
                } else {
                    {
                        SubLObject key_string = arghash_make_key_string(key, $EL_FORMULA);
                        SubLObject sentence_6 = (NIL != assertion_handles.assertion_p(default_value)) ? ((SubLObject) (uncanonicalizer.assertion_el_formula(default_value))) : uncanonicalizer.el_version(default_value, UNPROVIDED);
                        cb_form_widgets.cb_el_sentence_input_section(sentence_6, list(new SubLObject[]{ $INPUT_NAME, key_string, $COMPLETE_LABEL, complete_text, $CYCLIFY_LABEL, cyclify_text, $CLEAR_LABEL, clear_text, $HEIGHT, rows, $WIDTH, cols }));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject html_arghash_sentence_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject rows, SubLObject cols, SubLObject complete_text, SubLObject cyclify_text, SubLObject clear_text) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        if (rows == UNPROVIDED) {
            rows = NIL;
        }
        if (cols == UNPROVIDED) {
            cols = NIL;
        }
        if (complete_text == UNPROVIDED) {
            complete_text = $$$Complete;
        }
        if (cyclify_text == UNPROVIDED) {
            cyclify_text = $$$Cyclify;
        }
        if (clear_text == UNPROVIDED) {
            clear_text = $$$Clear;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_object = get_arghash_value(key, arghash);
        final SubLObject sentence = (NIL != assertion_handles.assertion_p(sentence_object)) ? uncanonicalizer.assertion_el_formula(sentence_object) : uncanonicalizer.el_version(sentence_object, UNPROVIDED);
        if (NIL != el_grammar.el_sentence_p(sentence)) {
            thread.resetMultipleValues();
            final SubLObject key_string = arghash_make_key_and_value_strings(key, sentence, $EL_FORMULA);
            final SubLObject value_string = thread.secondMultipleValue();
            thread.resetMultipleValues();
            cb_form_widgets.cb_el_sentence_input_section(sentence, list(new SubLObject[]{ $INPUT_NAME, key_string, $COMPLETE_LABEL, complete_text, $CYCLIFY_LABEL, cyclify_text, $CLEAR_LABEL, clear_text, $HEIGHT, rows, $WIDTH, cols }));
        } else {
            final SubLObject key_string = arghash_make_key_string(key, $EL_FORMULA);
            final SubLObject sentence_$4 = (NIL != assertion_handles.assertion_p(default_value)) ? uncanonicalizer.assertion_el_formula(default_value) : uncanonicalizer.el_version(default_value, UNPROVIDED);
            cb_form_widgets.cb_el_sentence_input_section(sentence_$4, list(new SubLObject[]{ $INPUT_NAME, key_string, $COMPLETE_LABEL, complete_text, $CYCLIFY_LABEL, cyclify_text, $CLEAR_LABEL, clear_text, $HEIGHT, rows, $WIDTH, cols }));
        }
        return NIL;
    }

    /**
     * Given an ARGHASH and FORT-KEY, output form elements to start continue a 'dialog' with the user so they choose a fort.
     */
    @LispMethod(comment = "Given an ARGHASH and FORT-KEY, output form elements to start continue a \'dialog\' with the user so they choose a fort.")
    public static final SubLObject html_arghash_nl_fort_input_alt(SubLObject arghash, SubLObject fort_key, SubLObject debug, SubLObject generation_fn, SubLObject requiredP, SubLObject complete_buttonP, SubLObject filter_col) {
        if (debug == UNPROVIDED) {
            debug = NIL;
        }
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        if (requiredP == UNPROVIDED) {
            requiredP = T;
        }
        if (complete_buttonP == UNPROVIDED) {
            complete_buttonP = NIL;
        }
        if (filter_col == UNPROVIDED) {
            filter_col = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
                SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt142$_NEW_FORT));
                SubLObject string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt143$_STRING));
                SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt144$_NEW_STRING));
                SubLObject undo_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt145$_UNDO));
                SubLObject candidates_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt146$_CANDIDATES));
                SubLObject done_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt147$_DONE));
                SubLObject error_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt148$_ERROR));
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str_alt149$_2);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != requiredP) {
                            if (NIL != get_arghash_value(done_key, arghash)) {
                                html_princ($str_alt150$_);
                            } else {
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != html_macros.$html_color_sat_red$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_color_sat_red$.getDynamicValue(thread)));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str_alt150$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                        } else {
                            html_glyph($NBSP, TWO_INTEGER);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                if (NIL != get_arghash_value_list(candidates_key, arghash)) {
                    {
                        SubLObject key_string = arghash_make_key_string(new_fort_key, $FORT);
                        html_markup(html_macros.$html_select_head$.getGlobalValue());
                        html_markup(html_macros.$html_select_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(key_string);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_indent(ONE_INTEGER);
                        html_markup($str_alt151$onChange_javascript_this_form_sub);
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject selected = list_utilities.member_equalP(NIL, get_arghash_value_list(new_fort_key, arghash));
                                    SubLObject value_string = arghash_get_string(NIL, $DEFAULT);
                                    html_markup(html_macros.$html_option_head$.getGlobalValue());
                                    if (NIL != selected) {
                                        html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    if (NIL != value_string) {
                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(value_string);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str_alt152$___);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                }
                                {
                                    SubLObject cdolist_list_var = get_arghash_value_list(candidates_key, arghash);
                                    SubLObject term1_candidate = NIL;
                                    for (term1_candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term1_candidate = cdolist_list_var.first()) {
                                        {
                                            SubLObject selected = list_utilities.member_equalP(term1_candidate, get_arghash_value_list(new_fort_key, arghash));
                                            SubLObject value_string = arghash_get_string(term1_candidate, $DEFAULT);
                                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            if (NIL != selected) {
                                                html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            }
                                            if (NIL != value_string) {
                                                html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(value_string);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ(funcall(generation_fn, term1_candidate));
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_markup(html_macros.$html_select_tail$.getGlobalValue());
                        html_arghash_submit_input(arghash, $$$Undo, undo_key, UNPROVIDED);
                        set_arghash_value(string_key, arghash, get_arghash_value(new_string_key, arghash));
                        rem_arghash_value(new_string_key, arghash);
                        html_arghash_hidden_input(arghash, string_key, UNPROVIDED, UNPROVIDED);
                        html_arghash_hidden_input(arghash, candidates_key, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    html_arghash_text_input(arghash, new_string_key, $str_alt55$, $cb_constant_input_width$.getDynamicValue(thread), UNPROVIDED);
                    html_glyph($NBSP, UNPROVIDED);
                    html_arghash_submit_input(arghash, $$$Submit, $SUBMIT, UNPROVIDED);
                    if ((NIL == get_arghash_value(done_key, arghash)) && (NIL != complete_buttonP)) {
                        html_glyph($NBSP, UNPROVIDED);
                        html_arghash_complete_button(arghash, new_string_key, $STRING, filter_col, UNPROVIDED, UNPROVIDED);
                    }
                    html_arghash_hidden_input(arghash, string_key, UNPROVIDED, UNPROVIDED);
                }
                html_arghash_hidden_input(arghash, fort_key, UNPROVIDED, UNPROVIDED);
                if (NIL != get_arghash_value(error_key, arghash)) {
                    html_glyph($NBSP, UNPROVIDED);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != html_macros.$html_color_sat_red$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_color_sat_red$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(get_arghash_value(error_key, arghash));
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                html_terpri(UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     * Given an ARGHASH and FORT-KEY, output form elements to start continue a 'dialog' with the user so they choose a fort.
     */
    @LispMethod(comment = "Given an ARGHASH and FORT-KEY, output form elements to start continue a \'dialog\' with the user so they choose a fort.")
    public static SubLObject html_arghash_nl_fort_input(final SubLObject arghash, final SubLObject fort_key, SubLObject debug, SubLObject generation_fn, SubLObject requiredP, SubLObject complete_buttonP, SubLObject filter_col) {
        if (debug == UNPROVIDED) {
            debug = NIL;
        }
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        if (requiredP == UNPROVIDED) {
            requiredP = T;
        }
        if (complete_buttonP == UNPROVIDED) {
            complete_buttonP = NIL;
        }
        if (filter_col == UNPROVIDED) {
            filter_col = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str144$_NEW_FORT));
        final SubLObject string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str145$_STRING));
        final SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str146$_NEW_STRING));
        final SubLObject undo_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str147$_UNDO));
        final SubLObject candidates_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str148$_CANDIDATES));
        final SubLObject done_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str149$_DONE));
        final SubLObject error_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str150$_ERROR));
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        html_markup(html_macros.$html_font_size$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str151$_2);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != requiredP) {
                if (NIL != get_arghash_value(done_key, arghash)) {
                    html_princ($str152$_);
                } else {
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str152$_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
            } else {
                html_glyph($NBSP, TWO_INTEGER);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        if (NIL != get_arghash_value_list(candidates_key, arghash)) {
            final SubLObject key_string = arghash_make_key_string(new_fort_key, $FORT);
            html_markup(html_macros.$html_select_head$.getGlobalValue());
            html_markup(html_macros.$html_select_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(key_string);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_space, UNPROVIDED);
            html_markup($str153$onChange_javascript_this_form_sub);
            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject selected = list_utilities.member_equalP(NIL, get_arghash_value_list(new_fort_key, arghash));
                final SubLObject value_string = arghash_get_string(NIL, $DEFAULT);
                html_markup(html_macros.$html_option_head$.getGlobalValue());
                if (NIL != selected) {
                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                }
                if (NIL != value_string) {
                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(value_string);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str154$___);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                SubLObject cdolist_list_var = get_arghash_value_list(candidates_key, arghash);
                SubLObject term1_candidate = NIL;
                term1_candidate = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject selected2 = list_utilities.member_equalP(term1_candidate, get_arghash_value_list(new_fort_key, arghash));
                    final SubLObject value_string2 = arghash_get_string(term1_candidate, $DEFAULT);
                    html_markup(html_macros.$html_option_head$.getGlobalValue());
                    if (NIL != selected2) {
                        html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                    }
                    if (NIL != value_string2) {
                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(value_string2);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(funcall(generation_fn, term1_candidate));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    cdolist_list_var = cdolist_list_var.rest();
                    term1_candidate = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_select_tail$.getGlobalValue());
            html_arghash_submit_input(arghash, $$$Undo, undo_key, UNPROVIDED);
            set_arghash_value(string_key, arghash, get_arghash_value(new_string_key, arghash));
            rem_arghash_value(new_string_key, arghash);
            html_arghash_hidden_input(arghash, string_key, UNPROVIDED, UNPROVIDED);
            html_arghash_hidden_input(arghash, candidates_key, UNPROVIDED, UNPROVIDED);
        } else {
            html_arghash_text_input(arghash, new_string_key, $str57$, $cb_constant_input_width$.getDynamicValue(thread), UNPROVIDED);
            html_glyph($NBSP, UNPROVIDED);
            html_arghash_submit_input(arghash, $$$Submit, $SUBMIT, UNPROVIDED);
            if ((NIL == get_arghash_value(done_key, arghash)) && (NIL != complete_buttonP)) {
                html_glyph($NBSP, UNPROVIDED);
                html_arghash_complete_button(arghash, new_string_key, $STRING, filter_col, UNPROVIDED, UNPROVIDED);
            }
            html_arghash_hidden_input(arghash, string_key, UNPROVIDED, UNPROVIDED);
        }
        html_arghash_hidden_input(arghash, fort_key, UNPROVIDED, UNPROVIDED);
        if (NIL != get_arghash_value(error_key, arghash)) {
            html_glyph($NBSP, UNPROVIDED);
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(get_arghash_value(error_key, arghash));
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        html_terpri(UNPROVIDED);
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject html_arghash_nl_fort_input_invisible_alt(SubLObject arghash, SubLObject fort_key) {
        {
            SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
            SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt142$_NEW_FORT));
            SubLObject string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt143$_STRING));
            SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt144$_NEW_STRING));
            SubLObject candidates_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt146$_CANDIDATES));
            SubLObject done_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt147$_DONE));
            SubLObject error_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt148$_ERROR));
            if (NIL == get_arghash_value(new_fort_key, arghash)) {
                set_arghash_value(new_fort_key, arghash, get_arghash_value(fort_key, arghash));
            }
            html_arghash_hidden_input(arghash, fort_key, UNPROVIDED, UNPROVIDED);
            html_arghash_hidden_input(arghash, string_key, UNPROVIDED, UNPROVIDED);
            html_arghash_hidden_input(arghash, new_fort_key, UNPROVIDED, UNPROVIDED);
            html_arghash_hidden_input(arghash, new_string_key, UNPROVIDED, UNPROVIDED);
            html_arghash_hidden_input(arghash, candidates_key, UNPROVIDED, UNPROVIDED);
            html_arghash_hidden_input(arghash, done_key, UNPROVIDED, UNPROVIDED);
            html_arghash_hidden_input(arghash, error_key, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject html_arghash_nl_fort_input_invisible(final SubLObject arghash, final SubLObject fort_key) {
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str144$_NEW_FORT));
        final SubLObject string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str145$_STRING));
        final SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str146$_NEW_STRING));
        final SubLObject candidates_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str148$_CANDIDATES));
        final SubLObject done_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str149$_DONE));
        final SubLObject error_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str150$_ERROR));
        if (NIL == get_arghash_value(new_fort_key, arghash)) {
            set_arghash_value(new_fort_key, arghash, get_arghash_value(fort_key, arghash));
        }
        html_arghash_hidden_input(arghash, fort_key, UNPROVIDED, UNPROVIDED);
        html_arghash_hidden_input(arghash, string_key, UNPROVIDED, UNPROVIDED);
        html_arghash_hidden_input(arghash, new_fort_key, UNPROVIDED, UNPROVIDED);
        html_arghash_hidden_input(arghash, new_string_key, UNPROVIDED, UNPROVIDED);
        html_arghash_hidden_input(arghash, candidates_key, UNPROVIDED, UNPROVIDED);
        html_arghash_hidden_input(arghash, done_key, UNPROVIDED, UNPROVIDED);
        html_arghash_hidden_input(arghash, error_key, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * Test whether an nl-fort-input field is 'active' i.e. has a fort value or is being worked on the user i.e. is not empty.
     */
    @LispMethod(comment = "Test whether an nl-fort-input field is \'active\' i.e. has a fort value or is being worked on the user i.e. is not empty.")
    public static final SubLObject html_arghash_nl_fort_input_activeP_alt(SubLObject arghash, SubLObject fort_key) {
        {
            SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
            SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt142$_NEW_FORT));
            SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt144$_NEW_STRING));
            SubLObject candidates_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt146$_CANDIDATES));
            if (((NIL != forts.fort_p(get_arghash_value(new_fort_key, arghash))) || (NIL != string_utilities.non_empty_stringP(get_arghash_value(new_string_key, arghash)))) || (NIL != get_arghash_value(candidates_key, arghash))) {
                return T;
            }
        }
        return NIL;
    }

    /**
     * Test whether an nl-fort-input field is 'active' i.e. has a fort value or is being worked on the user i.e. is not empty.
     */
    @LispMethod(comment = "Test whether an nl-fort-input field is \'active\' i.e. has a fort value or is being worked on the user i.e. is not empty.")
    public static SubLObject html_arghash_nl_fort_input_activeP(final SubLObject arghash, final SubLObject fort_key) {
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str144$_NEW_FORT));
        final SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str146$_NEW_STRING));
        final SubLObject candidates_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str148$_CANDIDATES));
        if (((NIL != forts.fort_p(get_arghash_value(new_fort_key, arghash))) || (NIL != string_utilities.non_empty_stringP(get_arghash_value(new_string_key, arghash)))) || (NIL != get_arghash_value(candidates_key, arghash))) {
            return T;
        }
        return NIL;
    }

    /**
     * Test whether an nl-fort-input field is 'done' i.e. has a fort value.
     */
    @LispMethod(comment = "Test whether an nl-fort-input field is \'done\' i.e. has a fort value.")
    public static final SubLObject html_arghash_nl_fort_input_doneP_alt(SubLObject arghash, SubLObject fort_key) {
        {
            SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
            SubLObject done_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt147$_DONE));
            if (NIL != get_arghash_value(done_key, arghash)) {
                return T;
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Test whether an nl-fort-input field is \'done\' i.e. has a fort value.")
    public static SubLObject html_arghash_nl_fort_input_doneP(final SubLObject arghash, final SubLObject fort_key) {
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject done_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str149$_DONE));
        if (NIL != get_arghash_value(done_key, arghash)) {
            return T;
        }
        return NIL;
    }/**
     * Test whether an nl-fort-input field is 'done' i.e. has a fort value.
     */


    /**
     * Clear the nl-fort-input value.
     */
    @LispMethod(comment = "Clear the nl-fort-input value.")
    public static final SubLObject html_arghash_nl_fort_input_clear_alt(SubLObject arghash, SubLObject fort_key) {
        {
            SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
            SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt142$_NEW_FORT));
            SubLObject string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt143$_STRING));
            SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt144$_NEW_STRING));
            SubLObject candidates_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt146$_CANDIDATES));
            rem_arghash_value(new_fort_key, arghash);
            rem_arghash_value(new_string_key, arghash);
            rem_arghash_value(fort_key, arghash);
            rem_arghash_value(string_key, arghash);
            rem_arghash_value(candidates_key, arghash);
        }
        return arghash;
    }

    /**
     * Clear the nl-fort-input value.
     */
    @LispMethod(comment = "Clear the nl-fort-input value.")
    public static SubLObject html_arghash_nl_fort_input_clear(final SubLObject arghash, final SubLObject fort_key) {
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str144$_NEW_FORT));
        final SubLObject string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str145$_STRING));
        final SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str146$_NEW_STRING));
        final SubLObject candidates_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str148$_CANDIDATES));
        rem_arghash_value(new_fort_key, arghash);
        rem_arghash_value(new_string_key, arghash);
        rem_arghash_value(fort_key, arghash);
        rem_arghash_value(string_key, arghash);
        rem_arghash_value(candidates_key, arghash);
        return arghash;
    }

    public static final SubLObject html_arghash_nl_fort_input_force_default_if_unset_alt(SubLObject arghash, SubLObject fort_key, SubLObject default_value, SubLObject generation_fn, SubLObject debug) {
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        if (debug == UNPROVIDED) {
            debug = NIL;
        }
        {
            SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
            SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt144$_NEW_STRING));
            SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt142$_NEW_FORT));
            SubLObject candidates_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt146$_CANDIDATES));
            SubLObject done_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt147$_DONE));
            if (((NIL == get_arghash_value(done_key, arghash)) && (NIL != string_utilities.empty_string_p(get_arghash_value(new_string_key, arghash)))) && (NIL == get_arghash_value(candidates_key, arghash))) {
                if (NIL != debug) {
                    html_princ($str_alt157$_nl_fort_input_force_default_if_u);
                    html_princ(fort_key);
                    html_princ($str_alt158$___setting_to_);
                    html_princ(default_value);
                    html_newline(UNPROVIDED);
                }
                set_arghash_value(new_fort_key, arghash, default_value);
                set_arghash_value(done_key, arghash, T);
                set_arghash_value(new_string_key, arghash, funcall(generation_fn, get_arghash_value(fort_key, arghash)));
            }
        }
        return arghash;
    }

    public static SubLObject html_arghash_nl_fort_input_force_default_if_unset(final SubLObject arghash, final SubLObject fort_key, final SubLObject default_value, SubLObject generation_fn, SubLObject debug) {
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        if (debug == UNPROVIDED) {
            debug = NIL;
        }
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str146$_NEW_STRING));
        final SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str144$_NEW_FORT));
        final SubLObject candidates_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str148$_CANDIDATES));
        final SubLObject done_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str149$_DONE));
        if (((NIL == get_arghash_value(done_key, arghash)) && (NIL != string_utilities.empty_string_p(get_arghash_value(new_string_key, arghash)))) && (NIL == get_arghash_value(candidates_key, arghash))) {
            if (NIL != debug) {
                html_princ($str159$_nl_fort_input_force_default_if_u);
                html_princ(fort_key);
                html_princ($str160$___setting_to_);
                html_princ(default_value);
                html_newline(UNPROVIDED);
            }
            set_arghash_value(new_fort_key, arghash, default_value);
            set_arghash_value(done_key, arghash, T);
            set_arghash_value(new_string_key, arghash, funcall(generation_fn, get_arghash_value(fort_key, arghash)));
        }
        return arghash;
    }

    public static SubLObject html_arghash_nl_fort_list_input_set_forts(final SubLObject arghash, final SubLObject fort_list_key, final SubLObject fort_key_list, final SubLObject v_forts, SubLObject generation_fn) {
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        SubLObject fort = NIL;
        SubLObject fort_$8 = NIL;
        SubLObject fort_key = NIL;
        SubLObject fort_key_$9 = NIL;
        fort = v_forts;
        fort_$8 = fort.first();
        fort_key = fort_key_list;
        fort_key_$9 = fort_key.first();
        while ((NIL != fort_key) || (NIL != fort)) {
            html_arghash_nl_fort_input_set_fort(arghash, fort_key_$9, fort_$8, generation_fn);
            fort = fort.rest();
            fort_$8 = fort.first();
            fort_key = fort_key.rest();
            fort_key_$9 = fort_key.first();
        } 
        return arghash;
    }

    public static final SubLObject html_arghash_nl_fort_input_set_fort_alt(SubLObject arghash, SubLObject fort_key, SubLObject fort, SubLObject generation_fn) {
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        {
            SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
            SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt142$_NEW_FORT));
            SubLObject string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt143$_STRING));
            SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt144$_NEW_STRING));
            SubLObject done_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt147$_DONE));
            SubLObject fort_string = funcall(generation_fn, fort);
            set_arghash_value(fort_key, arghash, fort);
            set_arghash_value(string_key, arghash, fort_string);
            set_arghash_value(new_fort_key, arghash, fort);
            set_arghash_value(new_string_key, arghash, fort_string);
            set_arghash_value(done_key, arghash, T);
            return arghash;
        }
    }

    public static SubLObject html_arghash_nl_fort_input_set_fort(final SubLObject arghash, final SubLObject fort_key, final SubLObject fort, SubLObject generation_fn) {
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str144$_NEW_FORT));
        final SubLObject string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str145$_STRING));
        final SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str146$_NEW_STRING));
        final SubLObject done_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str149$_DONE));
        final SubLObject fort_string = funcall(generation_fn, fort);
        set_arghash_value(fort_key, arghash, fort);
        set_arghash_value(string_key, arghash, fort_string);
        set_arghash_value(new_fort_key, arghash, fort);
        set_arghash_value(new_string_key, arghash, fort_string);
        set_arghash_value(done_key, arghash, T);
        return arghash;
    }

    /**
     * Given the results (in an ARGHASH) from a form that had elements created by html-arghash-nl-fort-input on FORT-KEY, validate the form and place the results in ARGHASH.
     */
    @LispMethod(comment = "Given the results (in an ARGHASH) from a form that had elements created by html-arghash-nl-fort-input on FORT-KEY, validate the form and place the results in ARGHASH.")
    public static final SubLObject html_arghash_nl_fort_input_validate_alt(SubLObject arghash, SubLObject fort_key, SubLObject debug, SubLObject generation_fn, SubLObject parse_fn, SubLObject filter_col, SubLObject filter_mt) {
        if (debug == UNPROVIDED) {
            debug = NIL;
        }
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        if (parse_fn == UNPROVIDED) {
            parse_fn = TERMS_FOR_BROWSING;
        }
        if (filter_col == UNPROVIDED) {
            filter_col = NIL;
        }
        if (filter_mt == UNPROVIDED) {
            filter_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
                SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt142$_NEW_FORT));
                SubLObject string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt143$_STRING));
                SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt144$_NEW_STRING));
                SubLObject undo_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt145$_UNDO));
                SubLObject candidates_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt146$_CANDIDATES));
                SubLObject error_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt148$_ERROR));
                SubLObject poss_candidates = NIL;
                if (NIL != debug) {
                    html_princ($str_alt160$_nl_fort_input_validate_);
                    html_princ(fort_key);
                    html_princ($str_alt161$___);
                }
                if (NIL != get_arghash_value(undo_key, arghash)) {
                    if (NIL != debug) {
                        html_princ($str_alt162$Case_1__clicked_undo_button);
                        html_newline(UNPROVIDED);
                    }
                    set_arghash_value(new_string_key, arghash, get_arghash_value(string_key, arghash));
                    rem_arghash_value(string_key, arghash);
                    rem_arghash_value(new_fort_key, arghash);
                    rem_arghash_value(fort_key, arghash);
                    rem_arghash_value(candidates_key, arghash);
                } else {
                    if ((NIL != get_arghash_value(new_fort_key, arghash)) && (!get_arghash_value(new_fort_key, arghash).equal(get_arghash_value(fort_key, arghash)))) {
                        if (NIL != debug) {
                            html_princ($str_alt163$Case_2__chose_fort_from_pulldown);
                            html_newline(UNPROVIDED);
                        }
                        rem_arghash_value(candidates_key, arghash);
                        arghash = html_arghash_nl_fort_input_set_fort(arghash, fort_key, get_arghash_value(new_fort_key, arghash), generation_fn);
                    } else {
                        if ((NIL == get_arghash_value(new_fort_key, arghash)) && (!get_arghash_value(string_key, arghash).equal(get_arghash_value(new_string_key, arghash)))) {
                            if (NIL != debug) {
                                html_princ($str_alt164$Case_3__text_typed_in__);
                            }
                            rem_arghash_value(new_fort_key, arghash);
                            if (!get_arghash_value(new_string_key, arghash).isString()) {
                                set_arghash_value(new_string_key, arghash, $str_alt55$);
                            }
                            poss_candidates = funcall(parse_fn, get_arghash_value(new_string_key, arghash));
                            if ((NIL != poss_candidates) && (NIL != fort_types_interface.collectionP(filter_col))) {
                                if (NIL != fort_types_interface.mtP(filter_mt)) {
                                    poss_candidates = isa.all_instances_among_fast(filter_col, poss_candidates, filter_mt);
                                } else {
                                    {
                                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                            poss_candidates = isa.all_instances_among_fast(filter_col, poss_candidates, UNPROVIDED);
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                            if (NIL == poss_candidates) {
                                if (NIL != debug) {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt167$Case_3a__No_parse_for___A_, get_arghash_value(new_string_key, arghash));
                                    html_newline(UNPROVIDED);
                                }
                                if (NIL == string_utilities.empty_string_p(get_arghash_value(new_string_key, arghash))) {
                                    if (generation_fn.isFunctionSpec() && (NIL != fort_types_interface.collection_in_any_mtP(filter_col))) {
                                        set_arghash_value(error_key, arghash, cconcatenate(funcall(generation_fn, filter_col), new SubLObject[]{ $str_alt168$_called__, get_arghash_value(new_string_key, arghash), $str_alt169$__not_found_ }));
                                    } else {
                                        set_arghash_value(error_key, arghash, cconcatenate($str_alt170$_, new SubLObject[]{ get_arghash_value(new_string_key, arghash), $str_alt169$__not_found_ }));
                                    }
                                }
                            } else {
                                if (NIL != list_utilities.singletonP(poss_candidates)) {
                                    if (NIL != debug) {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt171$Case_3b__One_parse_for___A_____A, get_arghash_value(new_string_key, arghash), poss_candidates.first());
                                        html_newline(UNPROVIDED);
                                    }
                                    arghash = html_arghash_nl_fort_input_set_fort(arghash, fort_key, poss_candidates.first(), generation_fn);
                                    poss_candidates = NIL;
                                } else {
                                    if (NIL != debug) {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt172$Case_3c__Many_parses_for___A_____, get_arghash_value(new_string_key, arghash), poss_candidates);
                                        html_newline(UNPROVIDED);
                                    }
                                    set_arghash_value_list(candidates_key, arghash, poss_candidates);
                                }
                            }
                        } else {
                            if (NIL != string_utilities.empty_string_p(get_arghash_value(new_string_key, arghash))) {
                                if (NIL != debug) {
                                    html_princ($str_alt173$Case_4__no_text_typed_in);
                                    html_newline(UNPROVIDED);
                                }
                            } else {
                                if (NIL != get_arghash_value(fort_key, arghash)) {
                                    if (NIL != debug) {
                                        html_princ($str_alt174$Case_5__fort_set__so_use_fort_as_);
                                        html_newline(UNPROVIDED);
                                    }
                                    arghash = html_arghash_nl_fort_input_set_fort(arghash, fort_key, get_arghash_value(fort_key, arghash), generation_fn);
                                } else {
                                    if (NIL != debug) {
                                        html_princ($str_alt175$Case_6__fallthrough_);
                                        html_newline(UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
                set_arghash_value(fort_key, arghash, get_arghash_value(new_fort_key, arghash));
                return arghash;
            }
        }
    }

    /**
     * Given the results (in an ARGHASH) from a form that had elements created by html-arghash-nl-fort-input on FORT-KEY, validate the form and place the results in ARGHASH.
     */
    @LispMethod(comment = "Given the results (in an ARGHASH) from a form that had elements created by html-arghash-nl-fort-input on FORT-KEY, validate the form and place the results in ARGHASH.")
    public static SubLObject html_arghash_nl_fort_input_validate(SubLObject arghash, final SubLObject fort_key, SubLObject debug, SubLObject generation_fn, SubLObject parse_fn, SubLObject filter_col, SubLObject filter_mt) {
        if (debug == UNPROVIDED) {
            debug = NIL;
        }
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        if (parse_fn == UNPROVIDED) {
            parse_fn = TERMS_FOR_BROWSING;
        }
        if (filter_col == UNPROVIDED) {
            filter_col = NIL;
        }
        if (filter_mt == UNPROVIDED) {
            filter_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_fort_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str144$_NEW_FORT));
        final SubLObject string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str145$_STRING));
        final SubLObject new_string_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str146$_NEW_STRING));
        final SubLObject undo_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str147$_UNDO));
        final SubLObject candidates_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str148$_CANDIDATES));
        final SubLObject error_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str150$_ERROR));
        SubLObject poss_candidates = NIL;
        if (NIL != debug) {
            html_princ($str162$_nl_fort_input_validate_);
            html_princ(fort_key);
            html_princ($str163$___);
        }
        if (NIL != get_arghash_value(undo_key, arghash)) {
            if (NIL != debug) {
                html_princ($str164$Case_1__clicked_undo_button);
                html_newline(UNPROVIDED);
            }
            set_arghash_value(new_string_key, arghash, get_arghash_value(string_key, arghash));
            rem_arghash_value(string_key, arghash);
            rem_arghash_value(new_fort_key, arghash);
            rem_arghash_value(fort_key, arghash);
            rem_arghash_value(candidates_key, arghash);
        } else
            if ((NIL != get_arghash_value(new_fort_key, arghash)) && (!get_arghash_value(new_fort_key, arghash).equal(get_arghash_value(fort_key, arghash)))) {
                if (NIL != debug) {
                    html_princ($str165$Case_2__chose_fort_from_pulldown);
                    html_newline(UNPROVIDED);
                }
                rem_arghash_value(candidates_key, arghash);
                arghash = html_arghash_nl_fort_input_set_fort(arghash, fort_key, get_arghash_value(new_fort_key, arghash), generation_fn);
            } else
                if ((NIL == get_arghash_value(new_fort_key, arghash)) && (!get_arghash_value(string_key, arghash).equal(get_arghash_value(new_string_key, arghash)))) {
                    if (NIL != debug) {
                        html_princ($str166$Case_3__text_typed_in__);
                    }
                    rem_arghash_value(new_fort_key, arghash);
                    if (!get_arghash_value(new_string_key, arghash).isString()) {
                        set_arghash_value(new_string_key, arghash, $str57$);
                    }
                    poss_candidates = funcall(parse_fn, get_arghash_value(new_string_key, arghash));
                    if ((NIL != poss_candidates) && (NIL != fort_types_interface.collectionP(filter_col))) {
                        if (NIL != fort_types_interface.mtP(filter_mt)) {
                            poss_candidates = isa.all_instances_among_fast(filter_col, poss_candidates, filter_mt);
                        } else {
                            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                poss_candidates = isa.all_instances_among_fast(filter_col, poss_candidates, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    if (NIL == poss_candidates) {
                        if (NIL != debug) {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str169$Case_3a__No_parse_for___A_, get_arghash_value(new_string_key, arghash));
                            html_newline(UNPROVIDED);
                        }
                        if (NIL == string_utilities.empty_string_p(get_arghash_value(new_string_key, arghash))) {
                            if (generation_fn.isFunctionSpec() && (NIL != fort_types_interface.collection_in_any_mtP(filter_col))) {
                                set_arghash_value(error_key, arghash, cconcatenate(funcall(generation_fn, filter_col), new SubLObject[]{ $str170$_called__, get_arghash_value(new_string_key, arghash), $str171$__not_found_ }));
                            } else {
                                set_arghash_value(error_key, arghash, cconcatenate($str172$_, new SubLObject[]{ get_arghash_value(new_string_key, arghash), $str171$__not_found_ }));
                            }
                        }
                    } else
                        if (NIL != list_utilities.singletonP(poss_candidates)) {
                            if (NIL != debug) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str173$Case_3b__One_parse_for___A_____A, get_arghash_value(new_string_key, arghash), poss_candidates.first());
                                html_newline(UNPROVIDED);
                            }
                            arghash = html_arghash_nl_fort_input_set_fort(arghash, fort_key, poss_candidates.first(), generation_fn);
                            poss_candidates = NIL;
                        } else {
                            if (NIL != debug) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str174$Case_3c__Many_parses_for___A_____, get_arghash_value(new_string_key, arghash), poss_candidates);
                                html_newline(UNPROVIDED);
                            }
                            set_arghash_value_list(candidates_key, arghash, poss_candidates);
                        }

                } else
                    if (NIL != string_utilities.empty_string_p(get_arghash_value(new_string_key, arghash))) {
                        if (NIL != debug) {
                            html_princ($str175$Case_4__no_text_typed_in);
                            html_newline(UNPROVIDED);
                        }
                    } else
                        if (NIL != get_arghash_value(fort_key, arghash)) {
                            if (NIL != debug) {
                                html_princ($str176$Case_5__fort_set__so_use_fort_as_);
                                html_newline(UNPROVIDED);
                            }
                            arghash = html_arghash_nl_fort_input_set_fort(arghash, fort_key, get_arghash_value(fort_key, arghash), generation_fn);
                        } else
                            if (NIL != debug) {
                                html_princ($str177$Case_6__fallthrough_);
                                html_newline(UNPROVIDED);
                            }





        set_arghash_value(fort_key, arghash, get_arghash_value(new_fort_key, arghash));
        return arghash;
    }

    public static final SubLObject html_arghash_nl_fort_list_input_alt(SubLObject arghash, SubLObject fort_list_key, SubLObject fort_key_list, SubLObject debug, SubLObject generation_fn, SubLObject min_required, SubLObject min_shown, SubLObject complete_buttonP, SubLObject filter_col) {
        if (debug == UNPROVIDED) {
            debug = NIL;
        }
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        if (min_required == UNPROVIDED) {
            min_required = ONE_INTEGER;
        }
        if (min_shown == UNPROVIDED) {
            min_shown = ONE_INTEGER;
        }
        if (complete_buttonP == UNPROVIDED) {
            complete_buttonP = NIL;
        }
        if (filter_col == UNPROVIDED) {
            filter_col = NIL;
        }
        {
            SubLObject max = length(fort_key_list);
            SubLObject num = ZERO_INTEGER;
            SubLObject v_forts = NIL;
            SubLObject unused_fort_keys = NIL;
            SubLObject cdolist_list_var = fort_key_list;
            SubLObject fort_key = NIL;
            for (fort_key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort_key = cdolist_list_var.first()) {
                {
                    SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
                    SubLObject remove_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt176$_REMOVE));
                    SubLObject requiredP = numL(num, min_required);
                    if (NIL != html_arghash_nl_fort_input_activeP(arghash, fort_key)) {
                        num = add(num, ONE_INTEGER);
                        html_arghash_nl_fort_input(arghash, fort_key, debug, generation_fn, requiredP, complete_buttonP, filter_col);
                        html_arghash_submit_input(arghash, $$$Remove, remove_key, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        if (NIL != get_arghash_value(fort_key, arghash)) {
                            v_forts = cons(get_arghash_value(fort_key, arghash), v_forts);
                        }
                    } else {
                        unused_fort_keys = cons(fort_key, unused_fort_keys);
                    }
                }
            }
            v_forts = nreverse(v_forts);
            set_arghash_value_list(fort_list_key, arghash, v_forts);
            unused_fort_keys = nreverse(unused_fort_keys);
            if (num.numE(max)) {
                if (NIL != debug) {
                    html_princ($str_alt178$_max_reached_);
                }
            } else {
                if (num.numG(max)) {
                    if (NIL != debug) {
                        html_princ($str_alt179$_max_exceeded_);
                    }
                } else {
                    if (NIL != unused_fort_keys) {
                        if (subtract(min_required, num).numGE(ZERO_INTEGER) && (NIL != debug)) {
                            html_princ($str_alt74$_);
                            html_princ(subtract(min_required, num));
                            html_princ($str_alt180$_more_required_);
                            html_newline(UNPROVIDED);
                        }
                        {
                            SubLObject doneP = NIL;
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = unused_fort_keys;
                                    SubLObject unused_fort_key = NIL;
                                    for (unused_fort_key = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , unused_fort_key = csome_list_var.first()) {
                                        {
                                            SubLObject requiredP = numL(num, min_required);
                                            num = add(num, ONE_INTEGER);
                                            if (num.numGE(max(min_required, min_shown))) {
                                                doneP = T;
                                            }
                                            html_arghash_nl_fort_input(arghash, unused_fort_key, debug, symbol_function(FORT_NAME), requiredP, complete_buttonP, filter_col);
                                            html_newline(UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        html_princ($str_alt182$_key_list_length_reached_);
                    }
                }
            }
            html_arghash_hidden_input(arghash, $FORTS, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject html_arghash_nl_fort_list_input(final SubLObject arghash, final SubLObject fort_list_key, final SubLObject fort_key_list, SubLObject debug, SubLObject generation_fn, SubLObject min_required, SubLObject min_shown, SubLObject complete_buttonP, SubLObject filter_col) {
        if (debug == UNPROVIDED) {
            debug = NIL;
        }
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        if (min_required == UNPROVIDED) {
            min_required = ONE_INTEGER;
        }
        if (min_shown == UNPROVIDED) {
            min_shown = ONE_INTEGER;
        }
        if (complete_buttonP == UNPROVIDED) {
            complete_buttonP = NIL;
        }
        if (filter_col == UNPROVIDED) {
            filter_col = NIL;
        }
        final SubLObject max = length(fort_key_list);
        SubLObject num = ZERO_INTEGER;
        SubLObject v_forts = NIL;
        SubLObject unused_fort_keys = NIL;
        SubLObject cdolist_list_var = fort_key_list;
        SubLObject fort_key = NIL;
        fort_key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
            final SubLObject remove_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str178$_REMOVE));
            final SubLObject requiredP = numL(num, min_required);
            if (NIL != html_arghash_nl_fort_input_activeP(arghash, fort_key)) {
                num = add(num, ONE_INTEGER);
                html_arghash_nl_fort_input(arghash, fort_key, debug, generation_fn, requiredP, complete_buttonP, filter_col);
                html_arghash_submit_input(arghash, $$$Remove, remove_key, UNPROVIDED);
                html_newline(UNPROVIDED);
                if (NIL != get_arghash_value(fort_key, arghash)) {
                    v_forts = cons(get_arghash_value(fort_key, arghash), v_forts);
                }
            } else {
                unused_fort_keys = cons(fort_key, unused_fort_keys);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort_key = cdolist_list_var.first();
        } 
        v_forts = nreverse(v_forts);
        set_arghash_value_list(fort_list_key, arghash, v_forts);
        unused_fort_keys = nreverse(unused_fort_keys);
        if (num.numE(max)) {
            if (NIL != debug) {
                html_princ($str180$_max_reached_);
            }
        } else
            if (num.numG(max)) {
                if (NIL != debug) {
                    html_princ($str181$_max_exceeded_);
                }
            } else
                if (NIL != unused_fort_keys) {
                    if (subtract(min_required, num).numGE(ZERO_INTEGER) && (NIL != debug)) {
                        html_princ($str76$_);
                        html_princ(subtract(min_required, num));
                        html_princ($str182$_more_required_);
                        html_newline(UNPROVIDED);
                    }
                    SubLObject doneP = NIL;
                    if (NIL == doneP) {
                        SubLObject csome_list_var = unused_fort_keys;
                        SubLObject unused_fort_key = NIL;
                        unused_fort_key = csome_list_var.first();
                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                            final SubLObject requiredP2 = numL(num, min_required);
                            num = add(num, ONE_INTEGER);
                            if (num.numGE(max(min_required, min_shown))) {
                                doneP = T;
                            }
                            html_arghash_nl_fort_input(arghash, unused_fort_key, debug, symbol_function(FORT_NAME), requiredP2, complete_buttonP, filter_col);
                            html_newline(UNPROVIDED);
                            csome_list_var = csome_list_var.rest();
                            unused_fort_key = csome_list_var.first();
                        } 
                    }
                } else {
                    html_princ($str184$_key_list_length_reached_);
                }


        html_arghash_hidden_input(arghash, fort_list_key, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * Given the results (in an ARGHASH) from a form that had elements created by html-arghash-nl-fort-list-input on FORT-KEY-LIST, validate the form and place the results in ARGHASH.
     */
    @LispMethod(comment = "Given the results (in an ARGHASH) from a form that had elements created by html-arghash-nl-fort-list-input on FORT-KEY-LIST, validate the form and place the results in ARGHASH.")
    public static final SubLObject html_arghash_nl_fort_list_input_validate_alt(SubLObject arghash, SubLObject fort_list_key, SubLObject fort_key_list, SubLObject debug, SubLObject generation_fn, SubLObject parse_fn, SubLObject filter_col, SubLObject filter_mt) {
        if (debug == UNPROVIDED) {
            debug = NIL;
        }
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        if (parse_fn == UNPROVIDED) {
            parse_fn = TERMS_FOR_BROWSING;
        }
        if (filter_col == UNPROVIDED) {
            filter_col = NIL;
        }
        if (filter_mt == UNPROVIDED) {
            filter_mt = NIL;
        }
        {
            SubLObject v_forts = NIL;
            SubLObject cdolist_list_var = fort_key_list;
            SubLObject fort_key = NIL;
            for (fort_key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort_key = cdolist_list_var.first()) {
                {
                    SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
                    SubLObject remove_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str_alt176$_REMOVE));
                    if (NIL != get_arghash_value(remove_key, arghash)) {
                        html_arghash_nl_fort_input_clear(arghash, fort_key);
                    }
                    html_arghash_nl_fort_input_validate(arghash, fort_key, debug, generation_fn, parse_fn, filter_col, filter_mt);
                    if (NIL != forts.fort_p(get_arghash_value(fort_key, arghash))) {
                        v_forts = cons(get_arghash_value(fort_key, arghash), v_forts);
                    }
                    v_forts = nreverse(v_forts);
                    set_arghash_value_list(fort_list_key, arghash, v_forts);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Given the results (in an ARGHASH) from a form that had elements created by html-arghash-nl-fort-list-input on FORT-KEY-LIST, validate the form and place the results in ARGHASH.")
    public static SubLObject html_arghash_nl_fort_list_input_validate(final SubLObject arghash, final SubLObject fort_list_key, final SubLObject fort_key_list, SubLObject debug, SubLObject generation_fn, SubLObject parse_fn, SubLObject filter_col, SubLObject filter_mt) {
        if (debug == UNPROVIDED) {
            debug = NIL;
        }
        if (generation_fn == UNPROVIDED) {
            generation_fn = GENERATE_PHRASE;
        }
        if (parse_fn == UNPROVIDED) {
            parse_fn = TERMS_FOR_BROWSING;
        }
        if (filter_col == UNPROVIDED) {
            filter_col = NIL;
        }
        if (filter_mt == UNPROVIDED) {
            filter_mt = NIL;
        }
        SubLObject v_forts = NIL;
        SubLObject cdolist_list_var = fort_key_list;
        SubLObject fort_key = NIL;
        fort_key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
            final SubLObject remove_key = string_utilities.keyword_from_string(cconcatenate(input_prefix_string, $str178$_REMOVE));
            if (NIL != get_arghash_value(remove_key, arghash)) {
                html_arghash_nl_fort_input_clear(arghash, fort_key);
            }
            html_arghash_nl_fort_input_validate(arghash, fort_key, debug, generation_fn, parse_fn, filter_col, filter_mt);
            if (NIL != forts.fort_p(get_arghash_value(fort_key, arghash))) {
                v_forts = cons(get_arghash_value(fort_key, arghash), v_forts);
            }
            v_forts = nreverse(v_forts);
            set_arghash_value_list(fort_list_key, arghash, v_forts);
            cdolist_list_var = cdolist_list_var.rest();
            fort_key = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Given the results (in an ARGHASH) from a form that had elements created by html-arghash-nl-fort-list-input on FORT-KEY-LIST, validate the form and place the results in ARGHASH.
     */


    public static SubLObject arghash_fort_key_list(final SubLObject n) {
        assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
        SubLObject result = NIL;
        SubLObject m;
        for (m = NIL, m = ZERO_INTEGER; m.numL(n); m = add(m, ONE_INTEGER)) {
            result = cons(make_keyword(cconcatenate($$$X, format_nil.format_nil_a_no_copy(m))), result);
        }
        return nreverse(result);
    }

    public static SubLObject declare_html_arghash_file() {
        declareFunction("print_arghash_type", "PRINT-ARGHASH-TYPE", 3, 0, false);
        declareFunction("arghash_type_print_function_trampoline", "ARGHASH-TYPE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("arghash_type_p", "ARGHASH-TYPE-P", 1, 0, false);
        new html_arghash.$arghash_type_p$UnaryFunction();
        declareFunction("arghash_type_name", "ARGHASH-TYPE-NAME", 1, 0, false);
        declareFunction("arghash_type_keyword", "ARGHASH-TYPE-KEYWORD", 1, 0, false);
        declareFunction("arghash_type_character", "ARGHASH-TYPE-CHARACTER", 1, 0, false);
        declareFunction("arghash_type_string_validator", "ARGHASH-TYPE-STRING-VALIDATOR", 1, 0, false);
        declareFunction("arghash_type_string_to_object_fn", "ARGHASH-TYPE-STRING-TO-OBJECT-FN", 1, 0, false);
        declareFunction("arghash_type_object_detector", "ARGHASH-TYPE-OBJECT-DETECTOR", 1, 0, false);
        declareFunction("arghash_type_object_to_string_fn", "ARGHASH-TYPE-OBJECT-TO-STRING-FN", 1, 0, false);
        declareFunction("arghash_type_priority", "ARGHASH-TYPE-PRIORITY", 1, 0, false);
        declareFunction("_csetf_arghash_type_name", "_CSETF-ARGHASH-TYPE-NAME", 2, 0, false);
        declareFunction("_csetf_arghash_type_keyword", "_CSETF-ARGHASH-TYPE-KEYWORD", 2, 0, false);
        declareFunction("_csetf_arghash_type_character", "_CSETF-ARGHASH-TYPE-CHARACTER", 2, 0, false);
        declareFunction("_csetf_arghash_type_string_validator", "_CSETF-ARGHASH-TYPE-STRING-VALIDATOR", 2, 0, false);
        declareFunction("_csetf_arghash_type_string_to_object_fn", "_CSETF-ARGHASH-TYPE-STRING-TO-OBJECT-FN", 2, 0, false);
        declareFunction("_csetf_arghash_type_object_detector", "_CSETF-ARGHASH-TYPE-OBJECT-DETECTOR", 2, 0, false);
        declareFunction("_csetf_arghash_type_object_to_string_fn", "_CSETF-ARGHASH-TYPE-OBJECT-TO-STRING-FN", 2, 0, false);
        declareFunction("_csetf_arghash_type_priority", "_CSETF-ARGHASH-TYPE-PRIORITY", 2, 0, false);
        declareFunction("make_arghash_type", "MAKE-ARGHASH-TYPE", 0, 1, false);
        declareFunction("visit_defstruct_arghash_type", "VISIT-DEFSTRUCT-ARGHASH-TYPE", 2, 0, false);
        declareFunction("visit_defstruct_object_arghash_type_method", "VISIT-DEFSTRUCT-OBJECT-ARGHASH-TYPE-METHOD", 2, 0, false);
        declareMacro("defarghash_type", "DEFARGHASH-TYPE");
        declareFunction("arghash_keyword_to_arghash_type", "ARGHASH-KEYWORD-TO-ARGHASH-TYPE", 1, 0, false);
        declareFunction("arghash_character_to_arghash_type", "ARGHASH-CHARACTER-TO-ARGHASH-TYPE", 1, 0, false);
        declareFunction("arghash_keywordP", "ARGHASH-KEYWORD?", 1, 0, false);
        declareFunction("arghash_types", "ARGHASH-TYPES", 0, 0, false);
        declareFunction("arghash_string_to_keyword", "ARGHASH-STRING-TO-KEYWORD", 1, 0, false);
        declareFunction("arghash_keyword_to_string", "ARGHASH-KEYWORD-TO-STRING", 1, 0, false);
        declareFunction("arghash_fort_to_string", "ARGHASH-FORT-TO-STRING", 1, 0, false);
        declareFunction("arghash_string_to_fort", "ARGHASH-STRING-TO-FORT", 1, 0, false);
        declareFunction("arghash_assertion_to_string", "ARGHASH-ASSERTION-TO-STRING", 1, 0, false);
        declareFunction("arghash_string_to_assertion", "ARGHASH-STRING-TO-ASSERTION", 1, 0, false);
        declareFunction("arghash_string_to_integer", "ARGHASH-STRING-TO-INTEGER", 1, 0, false);
        declareFunction("arghash_integer_to_string", "ARGHASH-INTEGER-TO-STRING", 1, 0, false);
        declareFunction("arghash_boolean_string_to_boolean", "ARGHASH-BOOLEAN-STRING-TO-BOOLEAN", 1, 0, false);
        declareFunction("arghash_boolean_detector", "ARGHASH-BOOLEAN-DETECTOR", 1, 0, false);
        declareFunction("arghash_boolean_to_boolean_string", "ARGHASH-BOOLEAN-TO-BOOLEAN-STRING", 1, 0, false);
        declareFunction("arghash_prefixed_string_to_object", "ARGHASH-PREFIXED-STRING-TO-OBJECT", 1, 0, false);
        declareFunction("arghash_string_to_list", "ARGHASH-STRING-TO-LIST", 1, 0, false);
        declareFunction("arghash_list_to_string", "ARGHASH-LIST-TO-STRING", 1, 0, false);
        declareFunction("arghash_string_to_el_formula", "ARGHASH-STRING-TO-EL-FORMULA", 1, 0, false);
        declareFunction("arghash_el_formula_to_string", "ARGHASH-EL-FORMULA-TO-STRING", 1, 0, false);
        declareFunction("arghash_default_to_string", "ARGHASH-DEFAULT-TO-STRING", 1, 0, false);
        declareFunction("arghash_handle_string", "ARGHASH-HANDLE-STRING", 2, 0, false);
        declareFunction("arghash_parse_key_and_value", "ARGHASH-PARSE-KEY-AND-VALUE", 1, 1, false);
        declareFunction("arghash_get_handler_char_and_string", "ARGHASH-GET-HANDLER-CHAR-AND-STRING", 1, 1, false);
        declareFunction("arghash_get_string", "ARGHASH-GET-STRING", 1, 1, false);
        declareFunction("arghash_make_key_and_value_strings", "ARGHASH-MAKE-KEY-AND-VALUE-STRINGS", 2, 1, false);
        declareFunction("arghash_make_key_string", "ARGHASH-MAKE-KEY-STRING", 1, 1, false);
        declareFunction("exists_arghash_valueP", "EXISTS-ARGHASH-VALUE?", 2, 0, false);
        declareFunction("get_arghash_value", "GET-ARGHASH-VALUE", 2, 0, false);
        declareFunction("get_arghash_value_list", "GET-ARGHASH-VALUE-LIST", 2, 0, false);
        declareFunction("set_arghash_value", "SET-ARGHASH-VALUE", 3, 0, false);
        declareFunction("set_arghash_value_list", "SET-ARGHASH-VALUE-LIST", 3, 0, false);
        declareFunction("push_arghash_value", "PUSH-ARGHASH-VALUE", 3, 0, false);
        declareFunction("pushnew_arghash_value", "PUSHNEW-ARGHASH-VALUE", 3, 0, false);
        declareFunction("rem_arghash_value", "REM-ARGHASH-VALUE", 2, 0, false);
        declareFunction("rem_arghash_values", "REM-ARGHASH-VALUES", 2, 0, false);
        declareFunction("rem_arghash_values_inverse", "REM-ARGHASH-VALUES-INVERSE", 2, 0, false);
        declareFunction("new_arghash", "NEW-ARGHASH", 0, 1, false);
        declareFunction("arghash_p", "ARGHASH-P", 1, 0, false);
        declareFunction("copy_arghash", "COPY-ARGHASH", 1, 0, false);
        declareFunction("get_arghash_keys", "GET-ARGHASH-KEYS", 1, 0, false);
        declareFunction("arglist_to_arghash", "ARGLIST-TO-ARGHASH", 1, 0, false);
        declareFunction("argassoc_to_arghash", "ARGASSOC-TO-ARGHASH", 1, 0, false);
        declareFunction("html_arghash_href", "HTML-ARGHASH-HREF", 2, 0, false);
        declareMacro("html_arghash_fancy_anchor", "HTML-ARGHASH-FANCY-ANCHOR");
        declareFunction("html_arghash_checkbox_input", "HTML-ARGHASH-CHECKBOX-INPUT", 3, 2, false);
        declareFunction("html_arghash_radio_input", "HTML-ARGHASH-RADIO-INPUT", 3, 0, false);
        declareFunction("html_arghash_focus_radio_input", "HTML-ARGHASH-FOCUS-RADIO-INPUT", 5, 1, false);
        declareFunction("html_arghash_clear_radio_input", "HTML-ARGHASH-CLEAR-RADIO-INPUT", 5, 1, false);
        declareFunction("html_arghash_hidden_input", "HTML-ARGHASH-HIDDEN-INPUT", 2, 2, false);
        declareFunction("html_arghash_hidden_input_force", "HTML-ARGHASH-HIDDEN-INPUT-FORCE", 3, 2, false);
        declareMacro("html_arghash_fancy_select", "HTML-ARGHASH-FANCY-SELECT");
        declareMacro("html_arghash_fancy_option", "HTML-ARGHASH-FANCY-OPTION");
        declareMacro("html_arghash_fancy_select_with_options", "HTML-ARGHASH-FANCY-SELECT-WITH-OPTIONS");
        declareFunction("html_arghash_submit_input", "HTML-ARGHASH-SUBMIT-INPUT", 3, 1, false);
        declareFunction("html_arghash_clear_input_button", "HTML-ARGHASH-CLEAR-INPUT-BUTTON", 3, 1, false);
        declareFunction("html_arghash_complete_button", "HTML-ARGHASH-COMPLETE-BUTTON", 3, 3, false);
        declareFunction("html_arghash_text_input", "HTML-ARGHASH-TEXT-INPUT", 2, 3, false);
        declareFunction("html_arghash_textarea_input", "HTML-ARGHASH-TEXTAREA-INPUT", 2, 5, false);
        declareFunction("html_arghash_fort_input", "HTML-ARGHASH-FORT-INPUT", 2, 4, false);
        declareFunction("html_arghash_sentence_input", "HTML-ARGHASH-SENTENCE-INPUT", 2, 6, false);
        declareFunction("html_arghash_nl_fort_input", "HTML-ARGHASH-NL-FORT-INPUT", 2, 5, false);
        declareFunction("html_arghash_nl_fort_input_invisible", "HTML-ARGHASH-NL-FORT-INPUT-INVISIBLE", 2, 0, false);
        declareFunction("html_arghash_nl_fort_input_activeP", "HTML-ARGHASH-NL-FORT-INPUT-ACTIVE?", 2, 0, false);
        declareFunction("html_arghash_nl_fort_input_doneP", "HTML-ARGHASH-NL-FORT-INPUT-DONE?", 2, 0, false);
        declareFunction("html_arghash_nl_fort_input_clear", "HTML-ARGHASH-NL-FORT-INPUT-CLEAR", 2, 0, false);
        declareFunction("html_arghash_nl_fort_input_force_default_if_unset", "HTML-ARGHASH-NL-FORT-INPUT-FORCE-DEFAULT-IF-UNSET", 3, 2, false);
        declareFunction("html_arghash_nl_fort_list_input_set_forts", "HTML-ARGHASH-NL-FORT-LIST-INPUT-SET-FORTS", 4, 1, false);
        declareFunction("html_arghash_nl_fort_input_set_fort", "HTML-ARGHASH-NL-FORT-INPUT-SET-FORT", 3, 1, false);
        declareFunction("html_arghash_nl_fort_input_validate", "HTML-ARGHASH-NL-FORT-INPUT-VALIDATE", 2, 5, false);
        declareFunction("html_arghash_nl_fort_list_input", "HTML-ARGHASH-NL-FORT-LIST-INPUT", 3, 6, false);
        declareFunction("html_arghash_nl_fort_list_input_validate", "HTML-ARGHASH-NL-FORT-LIST-INPUT-VALIDATE", 3, 5, false);
        declareFunction("arghash_fort_key_list", "ARGHASH-FORT-KEY-LIST", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_html_arghash_file() {
        defparameter("*ARGHASH-TYPES*", NIL);
        defparameter("*ARGHASH-TYPES-BY-KEYWORD*", make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*ARGHASH-TYPES-BY-CHARACTER*", make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-ARGHASH-TYPE*", ARGHASH_TYPE);
        return NIL;
    }

    public static final SubLObject setup_html_arghash_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_arghash_type$.getGlobalValue(), symbol_function(ARGHASH_TYPE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(ARGHASH_TYPE_NAME, _CSETF_ARGHASH_TYPE_NAME);
        def_csetf(ARGHASH_TYPE_KEYWORD, _CSETF_ARGHASH_TYPE_KEYWORD);
        def_csetf(ARGHASH_TYPE_CHARACTER, _CSETF_ARGHASH_TYPE_CHARACTER);
        def_csetf(ARGHASH_TYPE_STRING_VALIDATOR, _CSETF_ARGHASH_TYPE_STRING_VALIDATOR);
        def_csetf(ARGHASH_TYPE_STRING_TO_OBJECT_FN, _CSETF_ARGHASH_TYPE_STRING_TO_OBJECT_FN);
        def_csetf(ARGHASH_TYPE_OBJECT_DETECTOR, _CSETF_ARGHASH_TYPE_OBJECT_DETECTOR);
        def_csetf(ARGHASH_TYPE_OBJECT_TO_STRING_FN, _CSETF_ARGHASH_TYPE_OBJECT_TO_STRING_FN);
        def_csetf(ARGHASH_TYPE_PRIORITY, _CSETF_ARGHASH_TYPE_PRIORITY);
        identity(ARGHASH_TYPE);
        {
            SubLObject new_arghash_type = make_arghash_type($list_alt52);
            _csetf_arghash_type_name(new_arghash_type, KEYWORD);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(KEYWORD, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_arghash_type = make_arghash_type($list_alt56);
            _csetf_arghash_type_name(new_arghash_type, FORT);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(FORT, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_arghash_type = make_arghash_type($list_alt58);
            _csetf_arghash_type_name(new_arghash_type, ASSERTION);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(ASSERTION, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_arghash_type = make_arghash_type($list_alt60);
            _csetf_arghash_type_name(new_arghash_type, INTEGER);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(INTEGER, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_arghash_type = make_arghash_type($list_alt62);
            _csetf_arghash_type_name(new_arghash_type, BOOLEAN);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(BOOLEAN, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_arghash_type = make_arghash_type($list_alt67);
            _csetf_arghash_type_name(new_arghash_type, LIST);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(LIST, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_arghash_type = make_arghash_type($list_alt78);
            _csetf_arghash_type_name(new_arghash_type, EL_FORMULA);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(EL_FORMULA, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_arghash_type = make_arghash_type($list_alt80);
            _csetf_arghash_type_name(new_arghash_type, DEFAULT);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(DEFAULT, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject setup_html_arghash_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_arghash_type$.getGlobalValue(), symbol_function(ARGHASH_TYPE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list9);
            def_csetf(ARGHASH_TYPE_NAME, _CSETF_ARGHASH_TYPE_NAME);
            def_csetf(ARGHASH_TYPE_KEYWORD, _CSETF_ARGHASH_TYPE_KEYWORD);
            def_csetf(ARGHASH_TYPE_CHARACTER, _CSETF_ARGHASH_TYPE_CHARACTER);
            def_csetf(ARGHASH_TYPE_STRING_VALIDATOR, _CSETF_ARGHASH_TYPE_STRING_VALIDATOR);
            def_csetf(ARGHASH_TYPE_STRING_TO_OBJECT_FN, _CSETF_ARGHASH_TYPE_STRING_TO_OBJECT_FN);
            def_csetf(ARGHASH_TYPE_OBJECT_DETECTOR, _CSETF_ARGHASH_TYPE_OBJECT_DETECTOR);
            def_csetf(ARGHASH_TYPE_OBJECT_TO_STRING_FN, _CSETF_ARGHASH_TYPE_OBJECT_TO_STRING_FN);
            def_csetf(ARGHASH_TYPE_PRIORITY, _CSETF_ARGHASH_TYPE_PRIORITY);
            identity(ARGHASH_TYPE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_arghash_type$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ARGHASH_TYPE_METHOD));
            SubLObject new_arghash_type = make_arghash_type($list54);
            _csetf_arghash_type_name(new_arghash_type, KEYWORD);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(KEYWORD, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_arghash_type = make_arghash_type($list58);
            _csetf_arghash_type_name(new_arghash_type, FORT);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(FORT, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_arghash_type = make_arghash_type($list60);
            _csetf_arghash_type_name(new_arghash_type, ASSERTION);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(ASSERTION, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_arghash_type = make_arghash_type($list62);
            _csetf_arghash_type_name(new_arghash_type, INTEGER);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(INTEGER, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_arghash_type = make_arghash_type($list64);
            _csetf_arghash_type_name(new_arghash_type, BOOLEAN);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(BOOLEAN, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_arghash_type = make_arghash_type($list69);
            _csetf_arghash_type_name(new_arghash_type, LIST);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(LIST, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_arghash_type = make_arghash_type($list80);
            _csetf_arghash_type_name(new_arghash_type, EL_FORMULA);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(EL_FORMULA, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_arghash_type = make_arghash_type($list82);
            _csetf_arghash_type_name(new_arghash_type, DEFAULT);
            sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
            sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
            $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(DEFAULT, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject new_arghash_type = make_arghash_type($list_alt52);
                _csetf_arghash_type_name(new_arghash_type, KEYWORD);
                sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
                sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
                $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(KEYWORD, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_arghash_type = make_arghash_type($list_alt56);
                _csetf_arghash_type_name(new_arghash_type, FORT);
                sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
                sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
                $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(FORT, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_arghash_type = make_arghash_type($list_alt58);
                _csetf_arghash_type_name(new_arghash_type, ASSERTION);
                sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
                sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
                $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(ASSERTION, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_arghash_type = make_arghash_type($list_alt60);
                _csetf_arghash_type_name(new_arghash_type, INTEGER);
                sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
                sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
                $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(INTEGER, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_arghash_type = make_arghash_type($list_alt62);
                _csetf_arghash_type_name(new_arghash_type, BOOLEAN);
                sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
                sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
                $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(BOOLEAN, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_arghash_type = make_arghash_type($list_alt67);
                _csetf_arghash_type_name(new_arghash_type, LIST);
                sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
                sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
                $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(LIST, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_arghash_type = make_arghash_type($list_alt78);
                _csetf_arghash_type_name(new_arghash_type, EL_FORMULA);
                sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
                sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
                $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(EL_FORMULA, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_arghash_type = make_arghash_type($list_alt80);
                _csetf_arghash_type_name(new_arghash_type, DEFAULT);
                sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
                sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
                $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(DEFAULT, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
        }
        return NIL;
    }

    public static SubLObject setup_html_arghash_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_arghash_type$.getGlobalValue(), symbol_function(ARGHASH_TYPE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(ARGHASH_TYPE_NAME, _CSETF_ARGHASH_TYPE_NAME);
        def_csetf(ARGHASH_TYPE_KEYWORD, _CSETF_ARGHASH_TYPE_KEYWORD);
        def_csetf(ARGHASH_TYPE_CHARACTER, _CSETF_ARGHASH_TYPE_CHARACTER);
        def_csetf(ARGHASH_TYPE_STRING_VALIDATOR, _CSETF_ARGHASH_TYPE_STRING_VALIDATOR);
        def_csetf(ARGHASH_TYPE_STRING_TO_OBJECT_FN, _CSETF_ARGHASH_TYPE_STRING_TO_OBJECT_FN);
        def_csetf(ARGHASH_TYPE_OBJECT_DETECTOR, _CSETF_ARGHASH_TYPE_OBJECT_DETECTOR);
        def_csetf(ARGHASH_TYPE_OBJECT_TO_STRING_FN, _CSETF_ARGHASH_TYPE_OBJECT_TO_STRING_FN);
        def_csetf(ARGHASH_TYPE_PRIORITY, _CSETF_ARGHASH_TYPE_PRIORITY);
        identity(ARGHASH_TYPE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_arghash_type$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ARGHASH_TYPE_METHOD));
        SubLObject new_arghash_type = make_arghash_type($list54);
        _csetf_arghash_type_name(new_arghash_type, KEYWORD);
        sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(KEYWORD, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_arghash_type = make_arghash_type($list58);
        _csetf_arghash_type_name(new_arghash_type, FORT);
        sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(FORT, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_arghash_type = make_arghash_type($list60);
        _csetf_arghash_type_name(new_arghash_type, ASSERTION);
        sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(ASSERTION, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_arghash_type = make_arghash_type($list62);
        _csetf_arghash_type_name(new_arghash_type, INTEGER);
        sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(INTEGER, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_arghash_type = make_arghash_type($list64);
        _csetf_arghash_type_name(new_arghash_type, BOOLEAN);
        sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(BOOLEAN, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_arghash_type = make_arghash_type($list69);
        _csetf_arghash_type_name(new_arghash_type, LIST);
        sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(LIST, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_arghash_type = make_arghash_type($list80);
        _csetf_arghash_type_name(new_arghash_type, EL_FORMULA);
        sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(EL_FORMULA, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_arghash_type = make_arghash_type($list82);
        _csetf_arghash_type_name(new_arghash_type, DEFAULT);
        sethash(arghash_type_keyword(new_arghash_type), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        sethash(arghash_type_character(new_arghash_type), $arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        $arghash_types$.setDynamicValue(cons(new_arghash_type, delete(DEFAULT, $arghash_types$.getDynamicValue(), symbol_function(EQUAL), ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_html_arghash_file();
    }

    @Override
    public void initializeVariables() {
        init_html_arghash_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_html_arghash_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_ = makeString("#");

    static private final SubLString $str_alt1$__ = makeString("#<");

    static private final SubLList $list_alt6 = list(makeSymbol("NAME"), makeSymbol("KEYWORD"), makeSymbol("CHARACTER"), makeSymbol("STRING-VALIDATOR"), makeSymbol("STRING-TO-OBJECT-FN"), makeSymbol("OBJECT-DETECTOR"), makeSymbol("OBJECT-TO-STRING-FN"), makeSymbol("PRIORITY"));

    static private final SubLList $list_alt7 = list($NAME, makeKeyword("KEYWORD"), makeKeyword("CHARACTER"), makeKeyword("STRING-VALIDATOR"), makeKeyword("STRING-TO-OBJECT-FN"), makeKeyword("OBJECT-DETECTOR"), makeKeyword("OBJECT-TO-STRING-FN"), makeKeyword("PRIORITY"));

    static private final SubLList $list_alt8 = list(makeSymbol("ARGHASH-TYPE-NAME"), makeSymbol("ARGHASH-TYPE-KEYWORD"), makeSymbol("ARGHASH-TYPE-CHARACTER"), makeSymbol("ARGHASH-TYPE-STRING-VALIDATOR"), makeSymbol("ARGHASH-TYPE-STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-TYPE-OBJECT-DETECTOR"), makeSymbol("ARGHASH-TYPE-OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-TYPE-PRIORITY"));

    static private final SubLList $list_alt9 = list(makeSymbol("_CSETF-ARGHASH-TYPE-NAME"), makeSymbol("_CSETF-ARGHASH-TYPE-KEYWORD"), makeSymbol("_CSETF-ARGHASH-TYPE-CHARACTER"), makeSymbol("_CSETF-ARGHASH-TYPE-STRING-VALIDATOR"), makeSymbol("_CSETF-ARGHASH-TYPE-STRING-TO-OBJECT-FN"), makeSymbol("_CSETF-ARGHASH-TYPE-OBJECT-DETECTOR"), makeSymbol("_CSETF-ARGHASH-TYPE-OBJECT-TO-STRING-FN"), makeSymbol("_CSETF-ARGHASH-TYPE-PRIORITY"));

    public static final class $arghash_type_p$UnaryFunction extends UnaryFunction {
        public $arghash_type_p$UnaryFunction() {
            super(extractFunctionNamed("ARGHASH-TYPE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return arghash_type_p(arg1);
        }
    }

    static private final SubLString $str_alt36$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt37 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));

    static private final SubLSymbol $sym38$NEW_ARGHASH_TYPE = makeUninternedSymbol("NEW-ARGHASH-TYPE");

    static private final SubLList $list_alt50 = list(makeSymbol("*ARGHASH-TYPES*"), list(makeSymbol("FUNCTION"), EQUAL), list(QUOTE, makeSymbol("ARGHASH-TYPE-NAME")));

    static private final SubLSymbol $sym51$_ = makeSymbol("<");

    static private final SubLList $list_alt52 = list(new SubLObject[]{ $NAME, makeString("keyword"), makeKeyword("KEYWORD"), makeKeyword("KEYWORD"), makeKeyword("CHARACTER"), CHAR_colon, makeKeyword("STRING-VALIDATOR"), makeSymbol("STRINGP"), makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-STRING-TO-KEYWORD"), makeKeyword("OBJECT-DETECTOR"), makeSymbol("KEYWORDP"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-KEYWORD-TO-STRING"), makeKeyword("PRIORITY"), ONE_INTEGER });

    static private final SubLString $str_alt54$_A = makeString("~A");

    static private final SubLList $list_alt56 = list(new SubLObject[]{ $NAME, makeString("fort"), makeKeyword("KEYWORD"), $FORT, makeKeyword("CHARACTER"), CHAR_dollar, makeKeyword("STRING-VALIDATOR"), makeSymbol("STRINGP"), makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-STRING-TO-FORT"), makeKeyword("OBJECT-DETECTOR"), makeSymbol("FORT-P"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-FORT-TO-STRING"), makeKeyword("PRIORITY"), TWO_INTEGER });

    static private final SubLList $list_alt58 = list(new SubLObject[]{ $NAME, makeString("assertion"), makeKeyword("KEYWORD"), makeKeyword("ASSERTION"), makeKeyword("CHARACTER"), CHAR_a, makeKeyword("STRING-VALIDATOR"), makeSymbol("NUMBER-STRING-P"), makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-STRING-TO-ASSERTION"), makeKeyword("OBJECT-DETECTOR"), makeSymbol("ASSERTION-P"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-ASSERTION-TO-STRING"), makeKeyword("PRIORITY"), TWO_INTEGER });

    static private final SubLList $list_alt60 = list(new SubLObject[]{ $NAME, makeString("integer"), makeKeyword("KEYWORD"), makeKeyword("INTEGER"), makeKeyword("CHARACTER"), CHAR_period, makeKeyword("STRING-VALIDATOR"), makeSymbol("NUMBER-STRING-P"), makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-STRING-TO-INTEGER"), makeKeyword("OBJECT-DETECTOR"), makeSymbol("INTEGERP"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-INTEGER-TO-STRING"), makeKeyword("PRIORITY"), THREE_INTEGER });

    static private final SubLList $list_alt62 = list(new SubLObject[]{ $NAME, makeString("boolean"), makeKeyword("KEYWORD"), makeKeyword("BOOLEAN"), makeKeyword("CHARACTER"), CHAR_question, makeKeyword("STRING-VALIDATOR"), NIL, makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-BOOLEAN-STRING-TO-BOOLEAN"), makeKeyword("OBJECT-DETECTOR"), makeSymbol("ARGHASH-BOOLEAN-DETECTOR"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-BOOLEAN-TO-BOOLEAN-STRING"), makeKeyword("PRIORITY"), FOUR_INTEGER });

    static private final SubLList $list_alt67 = list(new SubLObject[]{ $NAME, makeString("list"), makeKeyword("KEYWORD"), $LIST, makeKeyword("CHARACTER"), CHAR_lparen, makeKeyword("STRING-VALIDATOR"), NIL, makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-STRING-TO-LIST"), makeKeyword("OBJECT-DETECTOR"), makeSymbol("CONSP"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-LIST-TO-STRING"), makeKeyword("PRIORITY"), FIVE_INTEGER });

    static private final SubLString $str_alt69$_ = makeString(" ");

    static private final SubLString $str_alt70$_20 = makeString("%20");

    static private final SubLString $str_alt71$_ = makeString("+");

    static private final SubLString $str_alt74$_ = makeString("(");

    static private final SubLString $str_alt75$_ = makeString("_");

    static private final SubLString $str_alt76$_ = makeString(")");

    static private final SubLList $list_alt78 = list(new SubLObject[]{ $NAME, makeString("el-formula"), makeKeyword("KEYWORD"), makeKeyword("EL-FORMULA"), makeKeyword("CHARACTER"), CHAR_lbrace, makeKeyword("STRING-VALIDATOR"), NIL, makeKeyword("STRING-TO-OBJECT-FN"), makeSymbol("ARGHASH-STRING-TO-EL-FORMULA"), makeKeyword("OBJECT-DETECTOR"), NIL, makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-EL-FORMULA-TO-STRING"), makeKeyword("PRIORITY"), makeInteger(888) });

    static private final SubLList $list_alt80 = list(new SubLObject[]{ $NAME, makeString("default"), makeKeyword("KEYWORD"), makeKeyword("DEFAULT"), makeKeyword("CHARACTER"), CHAR_underbar, makeKeyword("STRING-VALIDATOR"), makeSymbol("TRUE"), makeKeyword("STRING-TO-OBJECT-FN"), IDENTITY, makeKeyword("OBJECT-DETECTOR"), makeSymbol("TRUE"), makeKeyword("OBJECT-TO-STRING-FN"), makeSymbol("ARGHASH-DEFAULT-TO-STRING"), makeKeyword("PRIORITY"), makeInteger(999) });

    static private final SubLString $str_alt83$___A = makeString("--~A");

    static private final SubLString $str_alt87$_ = makeString("&");

    static private final SubLString $str_alt88$_ = makeString("=");

    static private final SubLList $list_alt89 = list(list(makeSymbol("ARGHASH"), makeSymbol("HTML-HANDLER-NAME"), makeSymbol("&KEY"), makeSymbol("NAME"), makeSymbol("TARGET"), makeSymbol("SCRIPT"), makeSymbol("STYLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt90 = list($NAME, makeKeyword("TARGET"), makeKeyword("SCRIPT"), makeKeyword("STYLE"));

    static private final SubLSymbol $sym95$HREF = makeUninternedSymbol("HREF");

    static private final SubLString $str_alt97$_A__A = makeString("~A?~A");

    static private final SubLList $list_alt102 = list(NIL);

    static private final SubLList $list_alt103 = list(list(makeSymbol("KEY"), makeSymbol("VALUE-TYPE"), makeSymbol("&KEY"), makeSymbol("MULTIPLE"), makeSymbol("SIZE"), makeSymbol("SCRIPT"), makeSymbol("ONCHANGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt104 = list(makeKeyword("MULTIPLE"), $SIZE, makeKeyword("SCRIPT"), makeKeyword("ONCHANGE"));

    static private final SubLSymbol $sym108$KEY_STRING = makeUninternedSymbol("KEY-STRING");

    static private final SubLList $list_alt111 = list(list(makeSymbol("ARGHASH"), makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("VALUE-TYPE"), makeKeyword("DEFAULT"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym112$VALUE_STRING = makeUninternedSymbol("VALUE-STRING");

    static private final SubLSymbol $sym113$SELECTED = makeUninternedSymbol("SELECTED");

    static private final SubLSymbol $sym114$MEMBER_EQUAL_ = makeSymbol("MEMBER-EQUAL?");

    static private final SubLList $list_alt120 = list(new SubLObject[]{ makeSymbol("ARGHASH"), makeSymbol("KEY"), makeSymbol("VALUE-TYPE"), makeSymbol("VALUES"), makeSymbol("VALUE-STRINGS"), makeSymbol("&KEY"), makeSymbol("MULTIPLE"), makeSymbol("SIZE"), makeSymbol("SCRIPT"), makeSymbol("ONCHANGE") });

    static private final SubLSymbol $sym121$VALUE = makeUninternedSymbol("VALUE");

    static private final SubLSymbol $sym122$VALUE_STRING = makeUninternedSymbol("VALUE-STRING");

    static private final SubLString $str_alt142$_NEW_FORT = makeString("_NEW_FORT");

    static private final SubLString $str_alt143$_STRING = makeString("_STRING");

    static private final SubLString $str_alt144$_NEW_STRING = makeString("_NEW_STRING");

    static private final SubLString $str_alt145$_UNDO = makeString("_UNDO");

    static private final SubLString $str_alt146$_CANDIDATES = makeString("_CANDIDATES");

    static private final SubLString $str_alt147$_DONE = makeString("_DONE");

    static private final SubLString $str_alt148$_ERROR = makeString("_ERROR");

    static private final SubLString $str_alt149$_2 = makeString("+2");

    static private final SubLString $str_alt150$_ = makeString("*");

    static private final SubLString $str_alt151$onChange_javascript_this_form_sub = makeString("onChange=javascript:this.form.submit();");

    static private final SubLString $str_alt152$___ = makeString("???");

    static private final SubLString $str_alt157$_nl_fort_input_force_default_if_u = makeString("(nl-fort-input-force-default-if-unset ");

    static private final SubLString $str_alt158$___setting_to_ = makeString("): setting to ");

    static private final SubLString $str_alt160$_nl_fort_input_validate_ = makeString("(nl-fort-input-validate ");

    static private final SubLString $str_alt161$___ = makeString("): ");

    static private final SubLString $str_alt162$Case_1__clicked_undo_button = makeString("Case 1: clicked undo button");

    static private final SubLString $str_alt163$Case_2__chose_fort_from_pulldown = makeString("Case 2: chose fort from pulldown");

    static private final SubLString $str_alt164$Case_3__text_typed_in__ = makeString("Case 3: text typed in, ");

    static private final SubLString $str_alt167$Case_3a__No_parse_for___A_ = makeString("Case 3a: No parse for \"~A\"");

    static private final SubLString $str_alt168$_called__ = makeString(" called \"");

    static private final SubLString $str_alt169$__not_found_ = makeString("\" not found.");

    static private final SubLString $str_alt170$_ = makeString("\"");

    static private final SubLString $str_alt171$Case_3b__One_parse_for___A_____A = makeString("Case 3b: One parse for \"~A\" = ~A");

    static private final SubLString $str_alt172$Case_3c__Many_parses_for___A_____ = makeString("Case 3c: Many parses for \"~A\" = ~A");

    static private final SubLString $str_alt173$Case_4__no_text_typed_in = makeString("Case 4: no text typed in");

    static private final SubLString $str_alt174$Case_5__fort_set__so_use_fort_as_ = makeString("Case 5: fort set, so use fort as 'new-fort'");

    static private final SubLString $str_alt175$Case_6__fallthrough_ = makeString("Case 6: fallthrough!");

    static private final SubLString $str_alt176$_REMOVE = makeString("_REMOVE");

    static private final SubLString $str_alt178$_max_reached_ = makeString("(max reached)");

    static private final SubLString $str_alt179$_max_exceeded_ = makeString("(max exceeded)");

    static private final SubLString $str_alt180$_more_required_ = makeString(" more required)");

    static private final SubLString $str_alt182$_key_list_length_reached_ = makeString("(key list length reached)");
}

/**
 * Total time: 571 ms
 */
