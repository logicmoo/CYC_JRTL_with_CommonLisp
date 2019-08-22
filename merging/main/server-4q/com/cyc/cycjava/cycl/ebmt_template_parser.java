/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cycl_grammar.cycl_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_asterisk;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.lower_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst_if;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      EBMT-TEMPLATE-PARSER
 * source file: /cyc/top/cycl/ebmt-template-parser.lisp
 * created:     2019/07/03 17:38:59
 */
public final class ebmt_template_parser extends SubLTranslatedFile implements V12 {
    public static final class $ebmt_template_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.this.$nl_cycl_pair;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.this.$type;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.this.$links;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.this.$cycl;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.this.$indexing_result;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.this.$weight;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.this.$nl_cycl_pair = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.this.$type = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.this.$links = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.this.$cycl = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.this.$indexing_result = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.this.$weight = value;
        }

        public SubLObject $nl_cycl_pair = Lisp.NIL;

        public SubLObject $type = Lisp.NIL;

        public SubLObject $links = Lisp.NIL;

        public SubLObject $cycl = Lisp.NIL;

        public SubLObject $indexing_result = Lisp.NIL;

        public SubLObject $weight = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.class, EBMT_TEMPLATE, EBMT_TEMPLATE_P, $list_alt16, $list_alt17, new String[]{ "$nl_cycl_pair", "$type", "$links", "$cycl", "$indexing_result", "$weight" }, $list_alt18, $list_alt19, PRINT_EBMT_TEMPLATE);
    }

    public static final SubLFile me = new ebmt_template_parser();

 public static final String myName = "com.cyc.cycjava.cycl.ebmt_template_parser";


    // defparameter
    @LispMethod(comment = "booleanp. If set to T, certain preds will be excluded from the PSP\ndefparameter")
    public static final SubLSymbol $ebmt_exclude_predsP$ = makeSymbol("*EBMT-EXCLUDE-PREDS?*");

    // defparameter
    @LispMethod(comment = "after how many seconds should be give up on interpreting an individual phrase?\ndefparameter")
    public static final SubLSymbol $ebmt_phrase_interp_timeout$ = makeSymbol("*EBMT-PHRASE-INTERP-TIMEOUT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_ebmt_template$ = makeSymbol("*DTP-EBMT-TEMPLATE*");

    // defparameter
    /**
     * The regular expression pattern that is used to find the portions of an EBMT
     * example string that should be ignored
     */
    @LispMethod(comment = "The regular expression pattern that is used to find the portions of an EBMT\r\nexample string that should be ignored\ndefparameter\nThe regular expression pattern that is used to find the portions of an EBMT\nexample string that should be ignored")
    private static final SubLSymbol $ignore_terms_pattern$ = makeSymbol("*IGNORE-TERMS-PATTERN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_ebmt_template_parsing_info$ = makeSymbol("*DTP-EBMT-TEMPLATE-PARSING-INFO*");



    static private final SubLString $str10$No_word_linkage_found_for___S = makeString("No word-linkage found for: ~S");

    static private final SubLString $str11$A_word_linkage_with_unknown_words = makeString("A word-linkage with unknown words was found for: ~S");

    private static final SubLSymbol FORGET = makeSymbol("FORGET");

    private static final SubLSymbol EBMT_TEMPLATE = makeSymbol("EBMT-TEMPLATE");

    private static final SubLSymbol EBMT_TEMPLATE_P = makeSymbol("EBMT-TEMPLATE-P");

    static private final SubLList $list16 = list(makeSymbol("NL-CYCL-PAIR"), makeSymbol("TYPE"), makeSymbol("LINKS"), makeSymbol("CYCL"), makeSymbol("INDEXING-RESULT"), makeSymbol("WEIGHT"));

    static private final SubLList $list17 = list(makeKeyword("NL-CYCL-PAIR"), $TYPE, makeKeyword("LINKS"), $CYCL, makeKeyword("INDEXING-RESULT"), makeKeyword("WEIGHT"));

    static private final SubLList $list18 = list(makeSymbol("EBMT-TEMPLATE-NL-CYCL-PAIR"), makeSymbol("EBMT-TEMPLATE-TYPE"), makeSymbol("EBMT-TEMPLATE-LINKS"), makeSymbol("EBMT-TEMPLATE-CYCL"), makeSymbol("EBMT-TEMPLATE-INDEXING-RESULT"), makeSymbol("EBMT-TEMPLATE-WEIGHT"));

    static private final SubLList $list19 = list(makeSymbol("_CSETF-EBMT-TEMPLATE-NL-CYCL-PAIR"), makeSymbol("_CSETF-EBMT-TEMPLATE-TYPE"), makeSymbol("_CSETF-EBMT-TEMPLATE-LINKS"), makeSymbol("_CSETF-EBMT-TEMPLATE-CYCL"), makeSymbol("_CSETF-EBMT-TEMPLATE-INDEXING-RESULT"), makeSymbol("_CSETF-EBMT-TEMPLATE-WEIGHT"));

    private static final SubLSymbol PRINT_EBMT_TEMPLATE = makeSymbol("PRINT-EBMT-TEMPLATE");

    private static final SubLSymbol EBMT_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EBMT-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list22 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EBMT-TEMPLATE-P"));

    private static final SubLSymbol EBMT_TEMPLATE_NL_CYCL_PAIR = makeSymbol("EBMT-TEMPLATE-NL-CYCL-PAIR");

    private static final SubLSymbol _CSETF_EBMT_TEMPLATE_NL_CYCL_PAIR = makeSymbol("_CSETF-EBMT-TEMPLATE-NL-CYCL-PAIR");

    private static final SubLSymbol EBMT_TEMPLATE_TYPE = makeSymbol("EBMT-TEMPLATE-TYPE");

    private static final SubLSymbol _CSETF_EBMT_TEMPLATE_TYPE = makeSymbol("_CSETF-EBMT-TEMPLATE-TYPE");

    private static final SubLSymbol EBMT_TEMPLATE_LINKS = makeSymbol("EBMT-TEMPLATE-LINKS");

    private static final SubLSymbol _CSETF_EBMT_TEMPLATE_LINKS = makeSymbol("_CSETF-EBMT-TEMPLATE-LINKS");

    private static final SubLSymbol EBMT_TEMPLATE_CYCL = makeSymbol("EBMT-TEMPLATE-CYCL");

    private static final SubLSymbol _CSETF_EBMT_TEMPLATE_CYCL = makeSymbol("_CSETF-EBMT-TEMPLATE-CYCL");

    private static final SubLSymbol EBMT_TEMPLATE_INDEXING_RESULT = makeSymbol("EBMT-TEMPLATE-INDEXING-RESULT");

    private static final SubLSymbol _CSETF_EBMT_TEMPLATE_INDEXING_RESULT = makeSymbol("_CSETF-EBMT-TEMPLATE-INDEXING-RESULT");

    private static final SubLSymbol EBMT_TEMPLATE_WEIGHT = makeSymbol("EBMT-TEMPLATE-WEIGHT");

    private static final SubLSymbol _CSETF_EBMT_TEMPLATE_WEIGHT = makeSymbol("_CSETF-EBMT-TEMPLATE-WEIGHT");

    private static final SubLSymbol $NL_CYCL_PAIR = makeKeyword("NL-CYCL-PAIR");

    private static final SubLString $str41$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_EBMT_TEMPLATE = makeSymbol("MAKE-EBMT-TEMPLATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EBMT-TEMPLATE-METHOD");

    private static final SubLSymbol $sym47$_ = makeSymbol("<");

    private static final SubLString $str48$__TEMPLATE_____Words___S____Links = makeString("#<TEMPLATE:~%  Words: ~S~%  Links: ~S~%  CycL: ~S~%  Weight: ~S~%>~%");

    private static final SubLString $str50$______________ = makeString("\\{([^\\}\\{]*)\\}");

    private static final SubLString $str51$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    private static final SubLString $str52$_ = makeString("}");

    private static final SubLString $str53$_ = makeString("{");

    private static final SubLString $str56$IGNORE_ = makeString("IGNORE-");

    private static final SubLSymbol LINKSET_LINK_P = makeSymbol("LINKSET-LINK-P");

    private static final SubLSymbol EBMT_LINK_NAME_ARGUMENT_P = makeSymbol("EBMT-LINK-NAME-ARGUMENT-P");

    private static final SubLString $str61$__A_Za_z0_9__ = makeString("[^A-Za-z0-9](");

    private static final SubLString $str62$___A_Za_z0_9_ = makeString(")[^A-Za-z0-9]");

    private static final SubLString $str63$_b_ = makeString("\\b(");

    private static final SubLString $str64$__b = makeString(")\\b");

    private static final SubLList $list65 = list(makeKeyword("CASELESS"));

    private static final SubLString $str66$_VAR = makeString(":VAR");

    private static final SubLSymbol $sym67$EL_VAR_ = makeSymbol("EL-VAR?");



    private static final SubLString $str70$__ = makeString("~~");

    private static final SubLString $str71$_ = makeString("~");

    private static final SubLString $str76$__NL___S__CycL____S___S__ = makeString("~%NL: ~S~%CycL:~%~S~%~S~%");

    private static final SubLString $str80$Unknown_EBMT_lexicon___S__ = makeString("Unknown EBMT lexicon: ~S~%");

    private static final SubLString $str82$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str83$_A__A__ = makeString("~A ~A~%");

    private static final SubLString $str85$__ = makeString(" (");

    private static final SubLString $str86$___ = makeString("): ");

    private static final SubLString $str87$_A_____S__ = makeString("~A: ~%~S~%");

    private static final SubLString $$$Added = makeString("Added");

    private static final SubLString $str89$_S__ = makeString("~S~%");

    private static final SubLString $$$Found_ = makeString("Found ");

    private static final SubLString $str91$_templates_for_linkset__ = makeString(" templates for linkset: ");

    private static final SubLString $$$Deleted = makeString("Deleted");

    private static final SubLString $str94$_A__ = makeString("~A~%");

    private static final SubLSymbol EBMT_TEMPLATE_PARSING_INFO = makeSymbol("EBMT-TEMPLATE-PARSING-INFO");

    private static final SubLSymbol EBMT_TEMPLATE_PARSING_INFO_P = makeSymbol("EBMT-TEMPLATE-PARSING-INFO-P");

    private static final SubLList $list98 = list(makeSymbol("KW-LW-PAIRS"), makeSymbol("LW-LINKS-PAIRS"), makeSymbol("LW"), makeSymbol("PROCESSED"), makeSymbol("CYCL"));

    private static final SubLList $list99 = list(makeKeyword("KW-LW-PAIRS"), makeKeyword("LW-LINKS-PAIRS"), makeKeyword("LW"), makeKeyword("PROCESSED"), $CYCL);

    private static final SubLList $list100 = list(makeSymbol("EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS"), makeSymbol("EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS"), makeSymbol("EBMT-TEMPLATE-PARSING-INFO-LW"), makeSymbol("EBMT-TEMPLATE-PARSING-INFO-PROCESSED"), makeSymbol("EBMT-TEMPLATE-PARSING-INFO-CYCL"));

    private static final SubLList $list101 = list(makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS"), makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS"), makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW"), makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-PROCESSED"), makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-CYCL"));

    private static final SubLSymbol PRINT_EBMT_TEMPLATE_PARSING_INFO = makeSymbol("PRINT-EBMT-TEMPLATE-PARSING-INFO");

    private static final SubLSymbol EBMT_TEMPLATE_PARSING_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EBMT-TEMPLATE-PARSING-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list104 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EBMT-TEMPLATE-PARSING-INFO-P"));

    private static final SubLSymbol EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS = makeSymbol("EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS");

    private static final SubLSymbol _CSETF_EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS = makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS");

    private static final SubLSymbol EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS = makeSymbol("EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS");

    private static final SubLSymbol _CSETF_EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS = makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS");

    private static final SubLSymbol EBMT_TEMPLATE_PARSING_INFO_LW = makeSymbol("EBMT-TEMPLATE-PARSING-INFO-LW");

    private static final SubLSymbol _CSETF_EBMT_TEMPLATE_PARSING_INFO_LW = makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW");

    private static final SubLSymbol EBMT_TEMPLATE_PARSING_INFO_PROCESSED = makeSymbol("EBMT-TEMPLATE-PARSING-INFO-PROCESSED");

    private static final SubLSymbol _CSETF_EBMT_TEMPLATE_PARSING_INFO_PROCESSED = makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-PROCESSED");

    private static final SubLSymbol EBMT_TEMPLATE_PARSING_INFO_CYCL = makeSymbol("EBMT-TEMPLATE-PARSING-INFO-CYCL");

    private static final SubLSymbol _CSETF_EBMT_TEMPLATE_PARSING_INFO_CYCL = makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-CYCL");

    private static final SubLSymbol $KW_LW_PAIRS = makeKeyword("KW-LW-PAIRS");

    private static final SubLSymbol $LW_LINKS_PAIRS = makeKeyword("LW-LINKS-PAIRS");

    private static final SubLSymbol MAKE_EBMT_TEMPLATE_PARSING_INFO = makeSymbol("MAKE-EBMT-TEMPLATE-PARSING-INFO");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_PARSING_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EBMT-TEMPLATE-PARSING-INFO-METHOD");

    private static final SubLString $str121$__TEMPLATE_PARSING_INFO______Keyw = makeString("#<TEMPLATE-PARSING-INFO: ~%  Keyword-Linkword pairs: ~S~%  Linkword-Links pairs: ~S~%  Linkwords: ~S~%  Processed: ~S~%  CycL: ~S~%>");

    private static final SubLSymbol GET_LINKS = makeSymbol("GET-LINKS");

    private static final SubLSymbol LINK_TUPLE_EQUAL = makeSymbol("LINK-TUPLE-EQUAL");

    private static final SubLString $$$a = makeString("a");

    private static final SubLString $$$an = makeString("an");

    private static final SubLList $list126 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    private static final SubLSymbol EBMT_CYCLS_FOR_PHRASE = makeSymbol("EBMT-CYCLS-FOR-PHRASE");

    private static final SubLList $list128 = list(makeKeyword("ANY"), reader_make_constant_shell("SententialConstituent"), reader_make_constant_shell("NounPhrase"));

    private static final SubLList $list129 = list(reader_make_constant_shell("ScalarInterval"), reader_make_constant_shell("Date"));

    private static final SubLSymbol $sym130$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLList $list131 = list(reader_make_constant_shell("NounPhrase"), reader_make_constant_shell("ProperNoun"));





    private static final SubLSymbol $ebmt_cycls_for_phrase_caching_state$ = makeSymbol("*EBMT-CYCLS-FOR-PHRASE-CACHING-STATE*");

    private static final SubLInteger $int$5000 = makeInteger(5000);





    private static final SubLSymbol PREPOSITION_LINK_WORD_P = makeSymbol("PREPOSITION-LINK-WORD-P");

    private static final SubLSymbol GET_LINK_WORD_ABS_INDEX = makeSymbol("GET-LINK-WORD-ABS-INDEX");

    private static final SubLSymbol GET_POS = makeSymbol("GET-POS");

    private static final SubLString $str147$Unable_to_understand_some_of_the_ = makeString("Unable to understand some of the tokens in the sentence.");

    private static final SubLString $str148$No_matching_templates_found_ = makeString("No matching templates found.");

    private static final SubLSymbol $sym149$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

    private static final SubLString $str150$Failed_to_compute_a_linkage_for__ = makeString("Failed to compute a linkage for: ~S");

    private static final SubLString $str152$Wff_checking_rejected_all_cycl_ = makeString("Wff checking rejected all cycl.");

    private static final SubLString $str155$__Template_Parse_Result___S___S__ = makeString("~%Template Parse Result: ~S~%~S~%");

    private static final SubLList $list156 = list(reader_make_constant_shell("cycSecureDocString"), reader_make_constant_shell("comment"));

    private static final SubLString $str158$Populating_EBMT_Template_Index___ = makeString("Populating EBMT Template Index ...");

    private static final SubLObject $const159$AllEBMTTrainingExamplesCollectorM = reader_make_constant_shell("AllEBMTTrainingExamplesCollectorMt");

    private static final SubLList $list160 = list(makeSymbol("?NL"), makeSymbol("?CYCL"));

    private static final SubLList $list161 = list(reader_make_constant_shell("thereExists"), makeSymbol("?QUOTEDCYCL"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("ebmtNLToCycLTrainingExample"), makeSymbol("?NL"), makeSymbol("?QUOTEDCYCL")), list(reader_make_constant_shell("means"), makeSymbol("?QUOTEDCYCL"), makeSymbol("?CYCL"))));

    /**
     *
     *
     * @param CASE-INSENSITIVE?
    booleanp
     * 		
     * @return semtrans-lexicon-p
     */
    @LispMethod(comment = "@param CASE-INSENSITIVE?\nbooleanp\r\n\t\t\r\n@return semtrans-lexicon-p")
    public static final SubLObject new_ebmt_lexicon_alt(SubLObject case_insensitiveP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = NIL;
        }
        {
            SubLObject lexicon = object.new_class_instance(SEMTRANS_LEXICON);
            if (NIL != case_insensitiveP) {
                methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, $OFF);
            }
            return lexicon;
        }
    }

    /**
     *
     *
     * @param CASE-INSENSITIVE?
    booleanp
     * 		
     * @return semtrans-lexicon-p
     */
    @LispMethod(comment = "@param CASE-INSENSITIVE?\nbooleanp\r\n\t\t\r\n@return semtrans-lexicon-p")
    public static SubLObject new_ebmt_lexicon(SubLObject case_insensitiveP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = NIL;
        }
        final SubLObject lexicon = object.new_class_instance(SEMTRANS_LEXICON);
        if (NIL != case_insensitiveP) {
            methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, $OFF);
        }
        return lexicon;
    }

    /**
     * Returns a completely-connected linkage of NL-SENTENCE, or causes an error in
     * case it failed to find one.  If ERROR-IF-WORD-LINKAGE-FAILED? is non-NIL,
     * then it will cause an error if an incomplete word-linkage is found.  If there
     * are any strings in LEX-STRINGS, then it ensures that these strings are known
     * to the lexicon that gets used while creating a linkage for NL-SENTENCE.
     *
     * @param NL-SENTENCE
    stringp
     * 		
     */
    @LispMethod(comment = "Returns a completely-connected linkage of NL-SENTENCE, or causes an error in\r\ncase it failed to find one.  If ERROR-IF-WORD-LINKAGE-FAILED? is non-NIL,\r\nthen it will cause an error if an incomplete word-linkage is found.  If there\r\nare any strings in LEX-STRINGS, then it ensures that these strings are known\r\nto the lexicon that gets used while creating a linkage for NL-SENTENCE.\r\n\r\n@param NL-SENTENCE\nstringp\nReturns a completely-connected linkage of NL-SENTENCE, or causes an error in\ncase it failed to find one.  If ERROR-IF-WORD-LINKAGE-FAILED? is non-NIL,\nthen it will cause an error if an incomplete word-linkage is found.  If there\nare any strings in LEX-STRINGS, then it ensures that these strings are known\nto the lexicon that gets used while creating a linkage for NL-SENTENCE.")
    public static final SubLObject ebmt_linkage_alt(SubLObject nl_sentence, SubLObject lexicon, SubLObject error_if_word_linkage_failedP, SubLObject lex_strings) {
        if (error_if_word_linkage_failedP == UNPROVIDED) {
            error_if_word_linkage_failedP = T;
        }
        if (lex_strings == UNPROVIDED) {
            lex_strings = NIL;
        }
        nl_sentence = string_utilities.strip_sentential_punctuation(nl_sentence);
        {
            SubLObject cdolist_list_var = lex_strings;
            SubLObject lex_string = NIL;
            for (lex_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex_string = cdolist_list_var.first()) {
                if (NIL == methods.funcall_instance_method_with_1_args(lexicon, GET, lex_string)) {
                    {
                        SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, lex_string);
                        methods.funcall_instance_method_with_1_args(lexicon, ADD, lex_entry);
                    }
                }
            }
        }
        {
            SubLObject v_linkage = word_linkage.new_word_linkage(nl_sentence, list($LEXICON, lexicon));
            if (NIL == v_linkage) {
                Errors.error($str_alt10$No_word_linkage_found_for___S, nl_sentence);
            }
            if ((NIL != error_if_word_linkage_failedP) && (NIL != word_linkage.word_linkage_failedP(v_linkage, UNPROVIDED))) {
                Errors.error($str_alt11$A_word_linkage_with_unknown_words, nl_sentence);
            }
            methods.funcall_instance_method_with_0_args(lexicon, FORGET);
            return v_linkage;
        }
    }

    /**
     * Returns a completely-connected linkage of NL-SENTENCE, or causes an error in
     * case it failed to find one.  If ERROR-IF-WORD-LINKAGE-FAILED? is non-NIL,
     * then it will cause an error if an incomplete word-linkage is found.  If there
     * are any strings in LEX-STRINGS, then it ensures that these strings are known
     * to the lexicon that gets used while creating a linkage for NL-SENTENCE.
     *
     * @param NL-SENTENCE
    		stringp
     * 		
     */
    @LispMethod(comment = "Returns a completely-connected linkage of NL-SENTENCE, or causes an error in\r\ncase it failed to find one.  If ERROR-IF-WORD-LINKAGE-FAILED? is non-NIL,\r\nthen it will cause an error if an incomplete word-linkage is found.  If there\r\nare any strings in LEX-STRINGS, then it ensures that these strings are known\r\nto the lexicon that gets used while creating a linkage for NL-SENTENCE.\r\n\r\n@param NL-SENTENCE\n\t\tstringp\nReturns a completely-connected linkage of NL-SENTENCE, or causes an error in\ncase it failed to find one.  If ERROR-IF-WORD-LINKAGE-FAILED? is non-NIL,\nthen it will cause an error if an incomplete word-linkage is found.  If there\nare any strings in LEX-STRINGS, then it ensures that these strings are known\nto the lexicon that gets used while creating a linkage for NL-SENTENCE.")
    public static SubLObject ebmt_linkage(SubLObject nl_sentence, final SubLObject lexicon, SubLObject error_if_word_linkage_failedP, SubLObject lex_strings) {
        if (error_if_word_linkage_failedP == UNPROVIDED) {
            error_if_word_linkage_failedP = T;
        }
        if (lex_strings == UNPROVIDED) {
            lex_strings = NIL;
        }
        nl_sentence = string_utilities.strip_sentential_punctuation(nl_sentence);
        SubLObject cdolist_list_var = lex_strings;
        SubLObject lex_string = NIL;
        lex_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == methods.funcall_instance_method_with_1_args(lexicon, GET, lex_string)) {
                final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, lex_string);
                methods.funcall_instance_method_with_1_args(lexicon, ADD, lex_entry);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex_string = cdolist_list_var.first();
        } 
        final SubLObject v_linkage = word_linkage.new_word_linkage(nl_sentence, list($LEXICON, lexicon));
        if (NIL == v_linkage) {
            Errors.error($str10$No_word_linkage_found_for___S, nl_sentence);
        }
        if ((NIL != error_if_word_linkage_failedP) && (NIL != word_linkage.word_linkage_failedP(v_linkage, UNPROVIDED))) {
            Errors.error($str11$A_word_linkage_with_unknown_words, nl_sentence);
        }
        methods.funcall_instance_method_with_0_args(lexicon, FORGET);
        return v_linkage;
    }

    public static final SubLObject ebmt_clear_caches_alt() {
        clear_ebmt_cycls_for_phrase();
        return $CLEARED;
    }

    public static SubLObject ebmt_clear_caches() {
        clear_ebmt_cycls_for_phrase();
        return $CLEARED;
    }

    public static final SubLObject ebmt_template_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_ebmt_template(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ebmt_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ebmt_template(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ebmt_template_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject ebmt_template_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native.class ? T : NIL;
    }

    public static final SubLObject ebmt_template_nl_cycl_pair_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_P);
        return v_object.getField2();
    }

    public static SubLObject ebmt_template_nl_cycl_pair(final SubLObject v_object) {
        assert NIL != ebmt_template_p(v_object) : "! ebmt_template_parser.ebmt_template_p(v_object) " + "ebmt_template_parser.ebmt_template_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ebmt_template_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_P);
        return v_object.getField3();
    }

    public static SubLObject ebmt_template_type(final SubLObject v_object) {
        assert NIL != ebmt_template_p(v_object) : "! ebmt_template_parser.ebmt_template_p(v_object) " + "ebmt_template_parser.ebmt_template_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ebmt_template_links_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_P);
        return v_object.getField4();
    }

    public static SubLObject ebmt_template_links(final SubLObject v_object) {
        assert NIL != ebmt_template_p(v_object) : "! ebmt_template_parser.ebmt_template_p(v_object) " + "ebmt_template_parser.ebmt_template_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ebmt_template_cycl_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_P);
        return v_object.getField5();
    }

    public static SubLObject ebmt_template_cycl(final SubLObject v_object) {
        assert NIL != ebmt_template_p(v_object) : "! ebmt_template_parser.ebmt_template_p(v_object) " + "ebmt_template_parser.ebmt_template_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject ebmt_template_indexing_result_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_P);
        return v_object.getField6();
    }

    public static SubLObject ebmt_template_indexing_result(final SubLObject v_object) {
        assert NIL != ebmt_template_p(v_object) : "! ebmt_template_parser.ebmt_template_p(v_object) " + "ebmt_template_parser.ebmt_template_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject ebmt_template_weight_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_P);
        return v_object.getField7();
    }

    public static SubLObject ebmt_template_weight(final SubLObject v_object) {
        assert NIL != ebmt_template_p(v_object) : "! ebmt_template_parser.ebmt_template_p(v_object) " + "ebmt_template_parser.ebmt_template_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_ebmt_template_nl_cycl_pair_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ebmt_template_nl_cycl_pair(final SubLObject v_object, final SubLObject value) {
        assert NIL != ebmt_template_p(v_object) : "! ebmt_template_parser.ebmt_template_p(v_object) " + "ebmt_template_parser.ebmt_template_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ebmt_template_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ebmt_template_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != ebmt_template_p(v_object) : "! ebmt_template_parser.ebmt_template_p(v_object) " + "ebmt_template_parser.ebmt_template_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ebmt_template_links_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ebmt_template_links(final SubLObject v_object, final SubLObject value) {
        assert NIL != ebmt_template_p(v_object) : "! ebmt_template_parser.ebmt_template_p(v_object) " + "ebmt_template_parser.ebmt_template_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ebmt_template_cycl_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ebmt_template_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != ebmt_template_p(v_object) : "! ebmt_template_parser.ebmt_template_p(v_object) " + "ebmt_template_parser.ebmt_template_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ebmt_template_indexing_result_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ebmt_template_indexing_result(final SubLObject v_object, final SubLObject value) {
        assert NIL != ebmt_template_p(v_object) : "! ebmt_template_parser.ebmt_template_p(v_object) " + "ebmt_template_parser.ebmt_template_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_ebmt_template_weight_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_ebmt_template_weight(final SubLObject v_object, final SubLObject value) {
        assert NIL != ebmt_template_p(v_object) : "! ebmt_template_parser.ebmt_template_p(v_object) " + "ebmt_template_parser.ebmt_template_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_ebmt_template_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NL_CYCL_PAIR)) {
                        _csetf_ebmt_template_nl_cycl_pair(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TYPE)) {
                            _csetf_ebmt_template_type(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LINKS)) {
                                _csetf_ebmt_template_links(v_new, current_value);
                            } else {
                                if (pcase_var.eql($CYCL)) {
                                    _csetf_ebmt_template_cycl(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($INDEXING_RESULT)) {
                                        _csetf_ebmt_template_indexing_result(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($WEIGHT)) {
                                            _csetf_ebmt_template_weight(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt40$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_ebmt_template(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NL_CYCL_PAIR)) {
                _csetf_ebmt_template_nl_cycl_pair(v_new, current_value);
            } else
                if (pcase_var.eql($TYPE)) {
                    _csetf_ebmt_template_type(v_new, current_value);
                } else
                    if (pcase_var.eql($LINKS)) {
                        _csetf_ebmt_template_links(v_new, current_value);
                    } else
                        if (pcase_var.eql($CYCL)) {
                            _csetf_ebmt_template_cycl(v_new, current_value);
                        } else
                            if (pcase_var.eql($INDEXING_RESULT)) {
                                _csetf_ebmt_template_indexing_result(v_new, current_value);
                            } else
                                if (pcase_var.eql($WEIGHT)) {
                                    _csetf_ebmt_template_weight(v_new, current_value);
                                } else {
                                    Errors.error($str41$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ebmt_template(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EBMT_TEMPLATE, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NL_CYCL_PAIR, ebmt_template_nl_cycl_pair(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE, ebmt_template_type(obj));
        funcall(visitor_fn, obj, $SLOT, $LINKS, ebmt_template_links(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCL, ebmt_template_cycl(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEXING_RESULT, ebmt_template_indexing_result(obj));
        funcall(visitor_fn, obj, $SLOT, $WEIGHT, ebmt_template_weight(obj));
        funcall(visitor_fn, obj, $END, MAKE_EBMT_TEMPLATE, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ebmt_template_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ebmt_template(obj, visitor_fn);
    }

    public static final SubLObject new_ebmt_template_alt(SubLObject nl_cycl_pair, SubLObject type, SubLObject links, SubLObject cycl, SubLObject indexing_result, SubLObject weight) {
        if (nl_cycl_pair == UNPROVIDED) {
            nl_cycl_pair = NIL;
        }
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (links == UNPROVIDED) {
            links = NIL;
        }
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (indexing_result == UNPROVIDED) {
            indexing_result = NIL;
        }
        if (weight == UNPROVIDED) {
            weight = NIL;
        }
        {
            SubLObject template = make_ebmt_template(UNPROVIDED);
            _csetf_ebmt_template_nl_cycl_pair(template, nl_cycl_pair);
            _csetf_ebmt_template_type(template, type);
            _csetf_ebmt_template_links(template, links);
            _csetf_ebmt_template_cycl(template, cycl);
            _csetf_ebmt_template_indexing_result(template, indexing_result);
            _csetf_ebmt_template_weight(template, weight);
            return template;
        }
    }

    public static SubLObject new_ebmt_template(SubLObject nl_cycl_pair, SubLObject type, SubLObject links, SubLObject cycl, SubLObject indexing_result, SubLObject weight) {
        if (nl_cycl_pair == UNPROVIDED) {
            nl_cycl_pair = NIL;
        }
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (links == UNPROVIDED) {
            links = NIL;
        }
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (indexing_result == UNPROVIDED) {
            indexing_result = NIL;
        }
        if (weight == UNPROVIDED) {
            weight = NIL;
        }
        final SubLObject template = make_ebmt_template(UNPROVIDED);
        _csetf_ebmt_template_nl_cycl_pair(template, nl_cycl_pair);
        _csetf_ebmt_template_type(template, type);
        _csetf_ebmt_template_links(template, links);
        _csetf_ebmt_template_cycl(template, cycl);
        _csetf_ebmt_template_indexing_result(template, indexing_result);
        _csetf_ebmt_template_weight(template, weight);
        return template;
    }

    /**
     * Returns the tokens of the sentence used to create the input EBMT template.
     *
     * @param TEMPLATE
    ebmt-template-p
     * 		
     * @return listp; a list of strings and/or keywords
     */
    @LispMethod(comment = "Returns the tokens of the sentence used to create the input EBMT template.\r\n\r\n@param TEMPLATE\nebmt-template-p\r\n\t\t\r\n@return listp; a list of strings and/or keywords")
    public static final SubLObject ebmt_template_words_alt(SubLObject template) {
        {
            SubLObject links = ebmt_template_links(template);
            SubLObject words = NIL;
            SubLObject cdolist_list_var = links;
            SubLObject link = NIL;
            for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                words = list_utilities.alist_enter(words, linkset_link_left_word_index(link), linkset_link_left_word_string(link), symbol_function(EQ));
                words = list_utilities.alist_enter(words, linkset_link_right_word_index(link), linkset_link_right_word_string(link), symbol_function(EQ));
            }
            words = list_utilities.sort_alist_by_keys(words, $sym41$_);
            return list_utilities.alist_values(words);
        }
    }

    /**
     * Returns the tokens of the sentence used to create the input EBMT template.
     *
     * @param TEMPLATE
    		ebmt-template-p
     * 		
     * @return listp; a list of strings and/or keywords
     */
    @LispMethod(comment = "Returns the tokens of the sentence used to create the input EBMT template.\r\n\r\n@param TEMPLATE\n\t\tebmt-template-p\r\n\t\t\r\n@return listp; a list of strings and/or keywords")
    public static SubLObject ebmt_template_words(final SubLObject template) {
        final SubLObject links = ebmt_template_links(template);
        SubLObject words = NIL;
        SubLObject cdolist_list_var = links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            words = list_utilities.alist_enter(words, linkset_link_left_word_index(link), linkset_link_left_word_string(link), symbol_function(EQ));
            words = list_utilities.alist_enter(words, linkset_link_right_word_index(link), linkset_link_right_word_string(link), symbol_function(EQ));
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        words = list_utilities.sort_alist_by_keys(words, $sym47$_);
        return list_utilities.alist_values(words);
    }

    public static final SubLObject print_ebmt_template_alt(SubLObject template, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt42$__TEMPLATE_____Words___S____Links, new SubLObject[]{ ebmt_template_words(template), ebmt_template_links(template), ebmt_template_cycl(template), ebmt_template_weight(template) });
        return template;
    }

    public static SubLObject print_ebmt_template(final SubLObject template, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str48$__TEMPLATE_____Words___S____Links, new SubLObject[]{ ebmt_template_words(template), ebmt_template_links(template), ebmt_template_cycl(template), ebmt_template_weight(template) });
        return template;
    }

    public static final SubLObject ebmt_template_justification_alt(SubLObject template) {
        return list(template);
    }

    public static SubLObject ebmt_template_justification(final SubLObject template) {
        return list(template);
    }

    /**
     *
     *
     * @unknown the linkage
     * @unknown an alist of CycL terms from CYCL-SENTENCE mapped to NL terms from
    NL-SENTENCE
     * @unknown listp; a list strings that don't need to match exactly for future
    parsing.
    If the linkage is incomplete and ERROR-IF-LINKAGE-INCOMPLETE? is T, then it
    errors out.
     */
    @LispMethod(comment = "@unknown the linkage\r\n@unknown an alist of CycL terms from CYCL-SENTENCE mapped to NL terms from\r\nNL-SENTENCE\r\n@unknown listp; a list strings that don\'t need to match exactly for future\r\nparsing.\r\nIf the linkage is incomplete and ERROR-IF-LINKAGE-INCOMPLETE? is T, then it\r\nerrors out.")
    public static final SubLObject ebmt_linkage_and_mapped_terms_alt(SubLObject nl_sentence, SubLObject cycl_sentence, SubLObject lexicon, SubLObject error_if_linkage_incompleteP) {
        if (error_if_linkage_incompleteP == UNPROVIDED) {
            error_if_linkage_incompleteP = T;
        }
        {
            SubLObject mapped_terms = query_sentence_lexifier.gtqs_find_term_glosses(cycl_sentence, nl_sentence);
            SubLObject ignorable_terms = ebmt_ignorable_terms_in_training_string(nl_sentence);
            SubLObject sentence_to_parse = ebmt_remove_ignore_markers(nl_sentence);
            return values(ebmt_linkage(sentence_to_parse, lexicon, error_if_linkage_incompleteP, union(list_utilities.alist_values(mapped_terms), ignorable_terms, symbol_function(EQUAL), UNPROVIDED)), mapped_terms, ignorable_terms);
        }
    }

    /**
     *
     *
     * @unknown the linkage
     * @unknown an alist of CycL terms from CYCL-SENTENCE mapped to NL terms from
    NL-SENTENCE
     * @unknown listp; a list strings that don't need to match exactly for future
    parsing.
    If the linkage is incomplete and ERROR-IF-LINKAGE-INCOMPLETE? is T, then it
    errors out.
     */
    @LispMethod(comment = "@unknown the linkage\r\n@unknown an alist of CycL terms from CYCL-SENTENCE mapped to NL terms from\r\nNL-SENTENCE\r\n@unknown listp; a list strings that don\'t need to match exactly for future\r\nparsing.\r\nIf the linkage is incomplete and ERROR-IF-LINKAGE-INCOMPLETE? is T, then it\r\nerrors out.")
    public static SubLObject ebmt_linkage_and_mapped_terms(final SubLObject nl_sentence, final SubLObject cycl_sentence, final SubLObject lexicon, SubLObject error_if_linkage_incompleteP) {
        if (error_if_linkage_incompleteP == UNPROVIDED) {
            error_if_linkage_incompleteP = T;
        }
        final SubLObject mapped_terms = query_sentence_lexifier.gtqs_find_term_glosses(cycl_sentence, nl_sentence);
        final SubLObject ignorable_terms = ebmt_ignorable_terms_in_training_string(nl_sentence);
        final SubLObject sentence_to_parse = ebmt_remove_ignore_markers(nl_sentence);
        return values(ebmt_linkage(sentence_to_parse, lexicon, error_if_linkage_incompleteP, union(list_utilities.alist_values(mapped_terms), ignorable_terms, symbol_function(EQUAL), UNPROVIDED)), mapped_terms, ignorable_terms);
    }

    public static final SubLObject ignore_terms_pattern_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($ignore_terms_pattern$.getDynamicValue(thread) == $UNINITIALIZED) {
                {
                    SubLObject init_value = eval(regular_expressions.compile_regular_expression($str_alt44$______________, UNPROVIDED));
                    if (init_value == $UNINITIALIZED) {
                        Errors.error($str_alt45$Unable_to_initialize__A__, $ignore_terms_pattern$.getDynamicValue(thread));
                    }
                    $ignore_terms_pattern$.setDynamicValue(eval(init_value), thread);
                }
            }
            return $ignore_terms_pattern$.getDynamicValue(thread);
        }
    }

    public static SubLObject ignore_terms_pattern() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($ignore_terms_pattern$.getDynamicValue(thread) == $UNINITIALIZED) {
            final SubLObject init_value = regular_expressions.compile_regular_expression($str50$______________, UNPROVIDED);
            if (init_value == $UNINITIALIZED) {
                Errors.error($str51$Unable_to_initialize__A__, $ignore_terms_pattern$.getDynamicValue(thread));
            }
            $ignore_terms_pattern$.setDynamicValue(init_value, thread);
        }
        return $ignore_terms_pattern$.getDynamicValue(thread);
    }

    public static final SubLObject ebmt_ignorable_terms_in_training_string_alt(SubLObject string) {
        {
            SubLObject pattern = ignore_terms_pattern();
            return regular_expression_utilities.find_all_captured_matches_for_pattern(pattern, string, UNPROVIDED);
        }
    }

    public static SubLObject ebmt_ignorable_terms_in_training_string(final SubLObject string) {
        final SubLObject pattern = ignore_terms_pattern();
        return regular_expression_utilities.find_all_captured_matches_for_pattern(pattern, string, UNPROVIDED);
    }

    public static final SubLObject ebmt_remove_ignore_markers_alt(SubLObject string) {
        return string_utilities.remove_substring(string_utilities.remove_substring(string, $str_alt46$_), $str_alt47$_);
    }

    public static SubLObject ebmt_remove_ignore_markers(final SubLObject string) {
        return string_utilities.remove_substring(string_utilities.remove_substring(string, $str52$_), $str53$_);
    }

    /**
     * Returns a linkset, relevant to the EBMT Template Parser, from linkage-links
     * LINKS.
     *
     * @param LINKS
     * 		listp of links (objects, not linkset-links)
     * @return linkset-p; e.g. (((:|Bill Clinton| 2) "Ss" ("likes" 5))
    (("likes" 5) "Op" (:|cars| 12)))
     */
    @LispMethod(comment = "Returns a linkset, relevant to the EBMT Template Parser, from linkage-links\r\nLINKS.\r\n\r\n@param LINKS\r\n\t\tlistp of links (objects, not linkset-links)\r\n@return linkset-p; e.g. (((:|Bill Clinton| 2) \"Ss\" (\"likes\" 5))\r\n((\"likes\" 5) \"Op\" (:|cars| 12)))\nReturns a linkset, relevant to the EBMT Template Parser, from linkage-links\nLINKS.")
    public static final SubLObject ebmt_linkset_from_linkage_links_alt(SubLObject links, SubLObject nl_term_vars) {
        if (nl_term_vars == UNPROVIDED) {
            nl_term_vars = NIL;
        }
        {
            SubLObject linkset = NIL;
            SubLObject cdolist_list_var = links;
            SubLObject link = NIL;
            for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                if (!((NIL != linkage.link_contains_wall_word_linkage_wordP(link)) || (NIL != linkage.link_contains_wall_link_wordP(link)))) {
                    {
                        SubLObject left_link_word = linkage.link_left_word(link);
                        SubLObject left_link_word_index = methods.funcall_instance_method_with_0_args(left_link_word, GET_INDEX);
                        SubLObject left_word = (NIL != left_link_word) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(left_link_word, GET_STRING))) : NIL;
                        SubLObject right_link_word = linkage.link_right_word(link);
                        SubLObject right_link_word_index = methods.funcall_instance_method_with_0_args(right_link_word, GET_INDEX);
                        SubLObject right_word = (NIL != right_link_word) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(right_link_word, GET_STRING))) : NIL;
                        if (NIL != nl_term_vars) {
                            left_word = list_utilities.alist_lookup_without_values(nl_term_vars, left_word, symbol_function(EQUAL), left_word);
                            right_word = list_utilities.alist_lookup_without_values(nl_term_vars, right_word, symbol_function(EQUAL), right_word);
                        }
                        if (!((left_word.isSymbol() && (NIL != string_utilities.starts_with(symbol_name(left_word), $str_alt50$IGNORE_))) || (right_word.isSymbol() && (NIL != string_utilities.starts_with(symbol_name(right_word), $str_alt50$IGNORE_))))) {
                            {
                                SubLObject item_var = new_linkset(list(left_word, left_link_word_index), ebmt_link_name(link), list(right_word, right_link_word_index));
                                if (NIL == member(item_var, linkset, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    linkset = cons(item_var, linkset);
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(linkset);
        }
    }

    /**
     * Returns a linkset, relevant to the EBMT Template Parser, from linkage-links
     * LINKS.
     *
     * @param LINKS
     * 		listp of links (objects, not linkset-links)
     * @return linkset-p; e.g. (((:|Bill Clinton| 2) "Ss" ("likes" 5))
    (("likes" 5) "Op" (:|cars| 12)))
     */
    @LispMethod(comment = "Returns a linkset, relevant to the EBMT Template Parser, from linkage-links\r\nLINKS.\r\n\r\n@param LINKS\r\n\t\tlistp of links (objects, not linkset-links)\r\n@return linkset-p; e.g. (((:|Bill Clinton| 2) \"Ss\" (\"likes\" 5))\r\n((\"likes\" 5) \"Op\" (:|cars| 12)))\nReturns a linkset, relevant to the EBMT Template Parser, from linkage-links\nLINKS.")
    public static SubLObject ebmt_linkset_from_linkage_links(final SubLObject links, SubLObject nl_term_vars) {
        if (nl_term_vars == UNPROVIDED) {
            nl_term_vars = NIL;
        }
        SubLObject linkset = NIL;
        SubLObject cdolist_list_var = links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == linkage.link_contains_wall_word_linkage_wordP(link)) && (NIL == linkage.link_contains_wall_link_wordP(link))) {
                final SubLObject left_link_word = linkage.link_left_word(link);
                final SubLObject left_link_word_index = methods.funcall_instance_method_with_0_args(left_link_word, GET_INDEX);
                SubLObject left_word = (NIL != left_link_word) ? methods.funcall_instance_method_with_0_args(left_link_word, GET_STRING) : NIL;
                final SubLObject right_link_word = linkage.link_right_word(link);
                final SubLObject right_link_word_index = methods.funcall_instance_method_with_0_args(right_link_word, GET_INDEX);
                SubLObject right_word = (NIL != right_link_word) ? methods.funcall_instance_method_with_0_args(right_link_word, GET_STRING) : NIL;
                if (NIL != nl_term_vars) {
                    left_word = list_utilities.alist_lookup_without_values(nl_term_vars, left_word, symbol_function(EQUAL), left_word);
                    right_word = list_utilities.alist_lookup_without_values(nl_term_vars, right_word, symbol_function(EQUAL), right_word);
                }
                if (((!left_word.isSymbol()) || (NIL == string_utilities.starts_with(symbol_name(left_word), $str56$IGNORE_))) && ((!right_word.isSymbol()) || (NIL == string_utilities.starts_with(symbol_name(right_word), $str56$IGNORE_)))) {
                    final SubLObject item_var = new_linkset(list(left_word, left_link_word_index), ebmt_link_name(link), list(right_word, right_link_word_index));
                    if (NIL == member(item_var, linkset, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        linkset = cons(item_var, linkset);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return nreverse(linkset);
    }

    public static final SubLObject linkset_p_alt(SubLObject obj) {
        return makeBoolean(obj.isList() && (NIL != list_utilities.every_in_list(LINKSET_LINK_P, obj, UNPROVIDED)));
    }

    public static SubLObject linkset_p(final SubLObject obj) {
        return makeBoolean(obj.isList() && (NIL != list_utilities.every_in_list(LINKSET_LINK_P, obj, UNPROVIDED)));
    }

    public static final SubLObject linkset_link_p_alt(SubLObject obj) {
        return makeBoolean((((((((obj.isList() && (NIL != list_utilities.lengthE(obj, THREE_INTEGER, UNPROVIDED))) && second(obj).isString()) && obj.first().isList()) && third(obj).isList()) && linkset_link_left_word_string(obj).isString()) && linkset_link_right_word_string(obj).isString()) && linkset_link_left_word_index(obj).isInteger()) && linkset_link_right_word_index(obj).isInteger());
    }

    public static SubLObject linkset_link_p(final SubLObject obj) {
        return makeBoolean((((((((obj.isList() && (NIL != list_utilities.lengthE(obj, THREE_INTEGER, UNPROVIDED))) && second(obj).isString()) && obj.first().isList()) && third(obj).isList()) && linkset_link_left_word_string(obj).isString()) && linkset_link_right_word_string(obj).isString()) && linkset_link_left_word_index(obj).isInteger()) && linkset_link_right_word_index(obj).isInteger());
    }

    public static final SubLObject ebmt_link_name_argument_p_alt(SubLObject v_char) {
        return makeBoolean(((NIL != lower_case_p(v_char)) || v_char.equal(CHAR_asterisk)) || v_char.equal(CHAR_hash));
    }

    public static SubLObject ebmt_link_name_argument_p(final SubLObject v_char) {
        return makeBoolean(((NIL != lower_case_p(v_char)) || v_char.equal(CHAR_asterisk)) || v_char.equal(CHAR_hash));
    }

    /**
     * given a LINK object, return the name of the link type that is appropriate for use in EBMT.
     */
    @LispMethod(comment = "given a LINK object, return the name of the link type that is appropriate for use in EBMT.")
    public static final SubLObject ebmt_link_name_alt(SubLObject link) {
        {
            SubLObject link_name = linkage.link_name(link);
            SubLObject ebmt_link_name = remove_if(symbol_function(EBMT_LINK_NAME_ARGUMENT_P), link_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return ebmt_link_name;
        }
    }

    /**
     * given a LINK object, return the name of the link type that is appropriate for use in EBMT.
     */
    @LispMethod(comment = "given a LINK object, return the name of the link type that is appropriate for use in EBMT.")
    public static SubLObject ebmt_link_name(final SubLObject link) {
        final SubLObject link_name = linkage.link_name(link);
        final SubLObject ebmt_link_name = remove_if(symbol_function(EBMT_LINK_NAME_ARGUMENT_P), link_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return ebmt_link_name;
    }

    public static final SubLObject new_linkset_alt(SubLObject left_link_word_and_index, SubLObject link_name, SubLObject right_link_word_and_index) {
        return list(left_link_word_and_index, link_name, right_link_word_and_index);
    }

    public static SubLObject new_linkset(final SubLObject left_link_word_and_index, final SubLObject link_name, final SubLObject right_link_word_and_index) {
        return list(left_link_word_and_index, link_name, right_link_word_and_index);
    }

    public static final SubLObject get_linkset_unindexed_links_alt(SubLObject linkset) {
        {
            SubLObject unindexed_links = NIL;
            SubLObject cdolist_list_var = linkset;
            SubLObject link = NIL;
            for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                unindexed_links = cons(list(link.first().first(), second(link), third(link).first()), unindexed_links);
            }
            return unindexed_links;
        }
    }

    public static SubLObject get_linkset_unindexed_links(final SubLObject linkset) {
        SubLObject unindexed_links = NIL;
        SubLObject cdolist_list_var = linkset;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            unindexed_links = cons(list(link.first().first(), second(link), third(link).first()), unindexed_links);
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return unindexed_links;
    }

    public static final SubLObject get_linkset_indexed_links_alt(SubLObject linkset) {
        return linkset;
    }

    public static SubLObject get_linkset_indexed_links(final SubLObject linkset) {
        return linkset;
    }

    public static final SubLObject linkset_link_name_alt(SubLObject linkset_link) {
        return second(linkset_link);
    }

    public static SubLObject linkset_link_name(final SubLObject linkset_link) {
        return second(linkset_link);
    }

    public static final SubLObject linkset_link_left_word_alt(SubLObject link) {
        return link.first();
    }

    public static SubLObject linkset_link_left_word(final SubLObject link) {
        return link.first();
    }

    public static final SubLObject linkset_link_left_word_string_alt(SubLObject link) {
        return link.first().first();
    }

    public static SubLObject linkset_link_left_word_string(final SubLObject link) {
        return link.first().first();
    }

    public static final SubLObject linkset_link_left_word_index_alt(SubLObject link) {
        return second(link.first());
    }

    public static SubLObject linkset_link_left_word_index(final SubLObject link) {
        return second(link.first());
    }

    public static final SubLObject linkset_link_right_word_alt(SubLObject link) {
        return third(link);
    }

    public static SubLObject linkset_link_right_word(final SubLObject link) {
        return third(link);
    }

    public static final SubLObject linkset_link_right_word_string_alt(SubLObject link) {
        return third(link).first();
    }

    public static SubLObject linkset_link_right_word_string(final SubLObject link) {
        return third(link).first();
    }

    public static final SubLObject linkset_link_right_word_index_alt(SubLObject link) {
        return second(third(link));
    }

    public static SubLObject linkset_link_right_word_index(final SubLObject link) {
        return second(third(link));
    }

    /**
     * Returns a linkset, relevant to the EBMT Template Parser, from LINKAGE.  The
     * linkset may have some terms replaced by keywords depending upon NL-TERM-VARS.
     *
     * @param LINKAGE
    linkage-p;
     * 		
     * @param NL-TERM-VARS
     * 		alist-p; e.g. (("Bill Clinton" . :|Bill Clinton|)
     * 		("cars" . :|cars|))
     * @return linksetp; e.g. (((:|Bill Clinton| 2) "Ss" ("likes" 5))
    (("likes" 5) "Op" (:|cars| 12)))
     */
    @LispMethod(comment = "Returns a linkset, relevant to the EBMT Template Parser, from LINKAGE.  The\r\nlinkset may have some terms replaced by keywords depending upon NL-TERM-VARS.\r\n\r\n@param LINKAGE\nlinkage-p;\r\n\t\t\r\n@param NL-TERM-VARS\r\n\t\talist-p; e.g. ((\"Bill Clinton\" . :|Bill Clinton|)\r\n\t\t(\"cars\" . :|cars|))\r\n@return linksetp; e.g. (((:|Bill Clinton| 2) \"Ss\" (\"likes\" 5))\r\n((\"likes\" 5) \"Op\" (:|cars| 12)))\nReturns a linkset, relevant to the EBMT Template Parser, from LINKAGE.  The\nlinkset may have some terms replaced by keywords depending upon NL-TERM-VARS.")
    public static final SubLObject ebmt_linkset_alt(SubLObject v_linkage, SubLObject nl_term_vars) {
        if (nl_term_vars == UNPROVIDED) {
            nl_term_vars = NIL;
        }
        return ebmt_linkset_from_linkage_links(remove(NIL, vector_utilities.vector_elements(instances.get_slot(v_linkage, LINKS), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), nl_term_vars);
    }

    /**
     * Returns a linkset, relevant to the EBMT Template Parser, from LINKAGE.  The
     * linkset may have some terms replaced by keywords depending upon NL-TERM-VARS.
     *
     * @param LINKAGE
    		linkage-p;
     * 		
     * @param NL-TERM-VARS
     * 		alist-p; e.g. (("Bill Clinton" . :|Bill Clinton|)
     * 		("cars" . :|cars|))
     * @return linksetp; e.g. (((:|Bill Clinton| 2) "Ss" ("likes" 5))
    (("likes" 5) "Op" (:|cars| 12)))
     */
    @LispMethod(comment = "Returns a linkset, relevant to the EBMT Template Parser, from LINKAGE.  The\r\nlinkset may have some terms replaced by keywords depending upon NL-TERM-VARS.\r\n\r\n@param LINKAGE\n\t\tlinkage-p;\r\n\t\t\r\n@param NL-TERM-VARS\r\n\t\talist-p; e.g. ((\"Bill Clinton\" . :|Bill Clinton|)\r\n\t\t(\"cars\" . :|cars|))\r\n@return linksetp; e.g. (((:|Bill Clinton| 2) \"Ss\" (\"likes\" 5))\r\n((\"likes\" 5) \"Op\" (:|cars| 12)))\nReturns a linkset, relevant to the EBMT Template Parser, from LINKAGE.  The\nlinkset may have some terms replaced by keywords depending upon NL-TERM-VARS.")
    public static SubLObject ebmt_linkset(final SubLObject v_linkage, SubLObject nl_term_vars) {
        if (nl_term_vars == UNPROVIDED) {
            nl_term_vars = NIL;
        }
        return ebmt_linkset_from_linkage_links(remove(NIL, vector_utilities.vector_elements(instances.get_slot(v_linkage, LINKS), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), nl_term_vars);
    }

    /**
     * Returns the CycL expression where the mapped terms are replaced by the
     * corresponding keyword variables.
     *
     * @param CYCL
     * 		cycl-sentence-p; e.g. (#$likesType #$BillClinton #$Automobile)
     * @param CYCL-TERM-VARS
     * 		alist-p; e.g. ((#$BillClinton . :BILLCLINTON)
     * 		(#$Automobile . :AUTOMOBILE))
     * @return cycl-sentence-p; e.g. (#$likesType :BILLCLINTON :AUTOMOBILE)
     */
    @LispMethod(comment = "Returns the CycL expression where the mapped terms are replaced by the\r\ncorresponding keyword variables.\r\n\r\n@param CYCL\r\n\t\tcycl-sentence-p; e.g. (#$likesType #$BillClinton #$Automobile)\r\n@param CYCL-TERM-VARS\r\n\t\talist-p; e.g. ((#$BillClinton . :BILLCLINTON)\r\n\t\t(#$Automobile . :AUTOMOBILE))\r\n@return cycl-sentence-p; e.g. (#$likesType :BILLCLINTON :AUTOMOBILE)\nReturns the CycL expression where the mapped terms are replaced by the\ncorresponding keyword variables.")
    public static final SubLObject ebmt_cycl_with_vars_alt(SubLObject cycl, SubLObject cycl_term_vars) {
        {
            SubLObject cdolist_list_var = cycl_term_vars;
            SubLObject cycl_term_var = NIL;
            for (cycl_term_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_term_var = cdolist_list_var.first()) {
                {
                    SubLObject v_term = cycl_term_var.first();
                    SubLObject var = cycl_term_var.rest();
                    cycl = cycl_utilities.expression_nsubst(var, v_term, cycl, symbol_function(EQUAL), UNPROVIDED);
                }
            }
        }
        return cycl;
    }

    /**
     * Returns the CycL expression where the mapped terms are replaced by the
     * corresponding keyword variables.
     *
     * @param CYCL
     * 		cycl-sentence-p; e.g. (#$likesType #$BillClinton #$Automobile)
     * @param CYCL-TERM-VARS
     * 		alist-p; e.g. ((#$BillClinton . :BILLCLINTON)
     * 		(#$Automobile . :AUTOMOBILE))
     * @return cycl-sentence-p; e.g. (#$likesType :BILLCLINTON :AUTOMOBILE)
     */
    @LispMethod(comment = "Returns the CycL expression where the mapped terms are replaced by the\r\ncorresponding keyword variables.\r\n\r\n@param CYCL\r\n\t\tcycl-sentence-p; e.g. (#$likesType #$BillClinton #$Automobile)\r\n@param CYCL-TERM-VARS\r\n\t\talist-p; e.g. ((#$BillClinton . :BILLCLINTON)\r\n\t\t(#$Automobile . :AUTOMOBILE))\r\n@return cycl-sentence-p; e.g. (#$likesType :BILLCLINTON :AUTOMOBILE)\nReturns the CycL expression where the mapped terms are replaced by the\ncorresponding keyword variables.")
    public static SubLObject ebmt_cycl_with_vars(SubLObject cycl, final SubLObject cycl_term_vars) {
        SubLObject cdolist_list_var = cycl_term_vars;
        SubLObject cycl_term_var = NIL;
        cycl_term_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_term = cycl_term_var.first();
            final SubLObject var = cycl_term_var.rest();
            cycl = cycl_utilities.expression_nsubst(var, v_term, cycl, symbol_function(EQUAL), UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cycl_term_var = cdolist_list_var.first();
        } 
        return cycl;
    }

    /**
     * Returns the string value of the link-word of the LINKAGE that is the same as
     * WORD; NIL otherwise.
     *
     * @param WORD
    stringp;
     * 		
     * @param LINKAGE
    linkage-p;
     * 		
     * @return stringp OR NIL
     */
    @LispMethod(comment = "Returns the string value of the link-word of the LINKAGE that is the same as\r\nWORD; NIL otherwise.\r\n\r\n@param WORD\nstringp;\r\n\t\t\r\n@param LINKAGE\nlinkage-p;\r\n\t\t\r\n@return stringp OR NIL\nReturns the string value of the link-word of the LINKAGE that is the same as\nWORD; NIL otherwise.")
    public static final SubLObject ebmt_link_word_alt(SubLObject word, SubLObject v_linkage) {
        {
            SubLObject linkword = NIL;
            SubLObject vector_var = instances.get_slot(v_linkage, WORDS);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject w = aref(vector_var, element_num);
                    linkword = w;
                    {
                        SubLObject lw_string = methods.funcall_instance_method_with_0_args(linkword, GET_STRING);
                        if (Strings.string_downcase(word, UNPROVIDED, UNPROVIDED).equal(Strings.string_downcase(lw_string, UNPROVIDED, UNPROVIDED))) {
                            return lw_string;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Returns the string value of the link-word of the LINKAGE that is the same as
     * WORD; NIL otherwise.
     *
     * @param WORD
    		stringp;
     * 		
     * @param LINKAGE
    		linkage-p;
     * 		
     * @return stringp OR NIL
     */
    @LispMethod(comment = "Returns the string value of the link-word of the LINKAGE that is the same as\r\nWORD; NIL otherwise.\r\n\r\n@param WORD\n\t\tstringp;\r\n\t\t\r\n@param LINKAGE\n\t\tlinkage-p;\r\n\t\t\r\n@return stringp OR NIL\nReturns the string value of the link-word of the LINKAGE that is the same as\nWORD; NIL otherwise.")
    public static SubLObject ebmt_link_word(final SubLObject word, final SubLObject v_linkage) {
        SubLObject linkword = NIL;
        final SubLObject vector_var = instances.get_slot(v_linkage, WORDS);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        SubLObject lw_string;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            w = linkword = aref(vector_var, element_num);
            lw_string = methods.funcall_instance_method_with_0_args(linkword, GET_STRING);
            if (Strings.string_downcase(word, UNPROVIDED, UNPROVIDED).equal(Strings.string_downcase(lw_string, UNPROVIDED, UNPROVIDED))) {
                return lw_string;
            }
        }
        return NIL;
    }

    /**
     * Returns the offsets of the input linkword string LW-STRING in STRING.
     *
     * @param LW-STRING
    stringp
     * 		
     * @param STRING
    stringp
     * 		
     * @return listp; a list of offsets
     */
    @LispMethod(comment = "Returns the offsets of the input linkword string LW-STRING in STRING.\r\n\r\n@param LW-STRING\nstringp\r\n\t\t\r\n@param STRING\nstringp\r\n\t\t\r\n@return listp; a list of offsets")
    public static final SubLObject ebmt_lw_offsets_alt(SubLObject lw_string, SubLObject string) {
        {
            SubLObject lw_string_with_escaped_chars = regular_expression_utilities.escape_regex_special_chars(lw_string);
            SubLObject lw_regexes = list(cconcatenate($str_alt55$__A_Za_z0_9__, new SubLObject[]{ format_nil.format_nil_a_no_copy(lw_string_with_escaped_chars), $str_alt56$___A_Za_z0_9_ }), cconcatenate($str_alt57$_b_, new SubLObject[]{ format_nil.format_nil_a_no_copy(lw_string_with_escaped_chars), $str_alt56$___A_Za_z0_9_ }), cconcatenate($str_alt55$__A_Za_z0_9__, new SubLObject[]{ format_nil.format_nil_a_no_copy(lw_string_with_escaped_chars), $str_alt58$__b }), cconcatenate($str_alt57$_b_, new SubLObject[]{ format_nil.format_nil_a_no_copy(lw_string_with_escaped_chars), $str_alt58$__b }));
            SubLObject cdolist_list_var = lw_regexes;
            SubLObject lw_regex = NIL;
            for (lw_regex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lw_regex = cdolist_list_var.first()) {
                {
                    SubLObject lw_offsets = list_utilities.alist_keys(regular_expression_utilities.offsets_of_regex_capturing_matches(lw_regex, string, $list_alt59, UNPROVIDED));
                    if (NIL != lw_offsets) {
                        return lw_offsets;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Returns the offsets of the input linkword string LW-STRING in STRING.
     *
     * @param LW-STRING
    		stringp
     * 		
     * @param STRING
    		stringp
     * 		
     * @return listp; a list of offsets
     */
    @LispMethod(comment = "Returns the offsets of the input linkword string LW-STRING in STRING.\r\n\r\n@param LW-STRING\n\t\tstringp\r\n\t\t\r\n@param STRING\n\t\tstringp\r\n\t\t\r\n@return listp; a list of offsets")
    public static SubLObject ebmt_lw_offsets(final SubLObject lw_string, final SubLObject string) {
        final SubLObject lw_string_with_escaped_chars = regular_expression_utilities.escape_regex_special_chars(lw_string);
        SubLObject cdolist_list_var;
        final SubLObject lw_regexes = cdolist_list_var = list(cconcatenate($str61$__A_Za_z0_9__, new SubLObject[]{ format_nil.format_nil_a_no_copy(lw_string_with_escaped_chars), $str62$___A_Za_z0_9_ }), cconcatenate($str63$_b_, new SubLObject[]{ format_nil.format_nil_a_no_copy(lw_string_with_escaped_chars), $str62$___A_Za_z0_9_ }), cconcatenate($str61$__A_Za_z0_9__, new SubLObject[]{ format_nil.format_nil_a_no_copy(lw_string_with_escaped_chars), $str64$__b }), cconcatenate($str63$_b_, new SubLObject[]{ format_nil.format_nil_a_no_copy(lw_string_with_escaped_chars), $str64$__b }));
        SubLObject lw_regex = NIL;
        lw_regex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lw_offsets = list_utilities.alist_keys(regular_expression_utilities.offsets_of_regex_capturing_matches(lw_regex, string, $list65, UNPROVIDED));
            if (NIL != lw_offsets) {
                return lw_offsets;
            }
            cdolist_list_var = cdolist_list_var.rest();
            lw_regex = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Returns two alists of term-keyword pairs where the term is a CycL or English
     * term that can be replaced using the corresponding keyword.
     *
     * @param ENGLISH
     * 		stringp; e.g. "Bill Clinton likes cars"
     * @param CYCL
     * 		cycl-sentence-p; e.g. (#$likesType #$BillClinton #$Automobile)
     * @param LINKAGE
    linkage-p;
     * 		
     * @param ALLOW-MULTIPLE-MATCHES?
     * 		boolean, should a string be allowed to map to
     * 		multiple locations in the CYCL?
     * @return 1. CYCL-TERM-VARS alist-p; e.g. ((#$BillClinton . :BILLCLINTON)
    (#$Automobile . :AUTOMOBILE))
    2. NL-TERM-VARS alist-p; e.g. (("Bill Clinton" . :BILLCLINTON)
    ("cars" . :AUTOMOBILE))
     */
    @LispMethod(comment = "Returns two alists of term-keyword pairs where the term is a CycL or English\r\nterm that can be replaced using the corresponding keyword.\r\n\r\n@param ENGLISH\r\n\t\tstringp; e.g. \"Bill Clinton likes cars\"\r\n@param CYCL\r\n\t\tcycl-sentence-p; e.g. (#$likesType #$BillClinton #$Automobile)\r\n@param LINKAGE\nlinkage-p;\r\n\t\t\r\n@param ALLOW-MULTIPLE-MATCHES?\r\n\t\tboolean, should a string be allowed to map to\r\n\t\tmultiple locations in the CYCL?\r\n@return 1. CYCL-TERM-VARS alist-p; e.g. ((#$BillClinton . :BILLCLINTON)\r\n(#$Automobile . :AUTOMOBILE))\r\n2. NL-TERM-VARS alist-p; e.g. ((\"Bill Clinton\" . :BILLCLINTON)\r\n(\"cars\" . :AUTOMOBILE))\nReturns two alists of term-keyword pairs where the term is a CycL or English\nterm that can be replaced using the corresponding keyword.")
    public static final SubLObject ebmt_mapped_term_vars_alt(SubLObject english, SubLObject cycl, SubLObject mapped_terms, SubLObject v_linkage, SubLObject allow_multiple_matchesP) {
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        {
            SubLObject keyword_counter = ONE_INTEGER;
            SubLObject cycl_term_vars = NIL;
            SubLObject nl_term_vars = NIL;
            SubLObject cdolist_list_var = copy_list(mapped_terms);
            SubLObject mapped_term = NIL;
            for (mapped_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapped_term = cdolist_list_var.first()) {
                {
                    SubLObject cycl_term = mapped_term.first();
                    SubLObject english_term = mapped_term.rest();
                    SubLObject linkword_english_term = ebmt_link_word(english_term, v_linkage);
                    if (NIL != linkword_english_term) {
                        {
                            SubLObject english_term_positions = ebmt_lw_offsets(linkword_english_term, english);
                            SubLObject cycl_term_positions = cycl_utilities.arg_positions_dfs(cycl_term, cycl, symbol_function(EQUAL));
                            if (!((((NIL == english_term_positions) || (NIL == cycl_term_positions)) || ((NIL == allow_multiple_matchesP) && (NIL == list_utilities.singletonP(english_term_positions)))) || ((NIL == allow_multiple_matchesP) && (NIL == list_utilities.singletonP(cycl_term_positions))))) {
                                {
                                    SubLObject keyword_var = read_from_string(cconcatenate($str_alt60$_VAR, format_nil.format_nil_a_no_copy(keyword_counter)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    cycl_term_vars = acons(cycl_term, keyword_var, cycl_term_vars);
                                    nl_term_vars = acons(linkword_english_term, keyword_var, nl_term_vars);
                                    keyword_counter = number_utilities.f_1X(keyword_counter);
                                }
                            }
                        }
                    }
                }
            }
            return values(cycl_term_vars, nl_term_vars);
        }
    }

    /**
     * Returns two alists of term-keyword pairs where the term is a CycL or English
     * term that can be replaced using the corresponding keyword.
     *
     * @param ENGLISH
     * 		stringp; e.g. "Bill Clinton likes cars"
     * @param CYCL
     * 		cycl-sentence-p; e.g. (#$likesType #$BillClinton #$Automobile)
     * @param LINKAGE
    		linkage-p;
     * 		
     * @param ALLOW-MULTIPLE-MATCHES?
     * 		boolean, should a string be allowed to map to
     * 		multiple locations in the CYCL?
     * @return 1. CYCL-TERM-VARS alist-p; e.g. ((#$BillClinton . :BILLCLINTON)
    (#$Automobile . :AUTOMOBILE))
    2. NL-TERM-VARS alist-p; e.g. (("Bill Clinton" . :BILLCLINTON)
    ("cars" . :AUTOMOBILE))
     */
    @LispMethod(comment = "Returns two alists of term-keyword pairs where the term is a CycL or English\r\nterm that can be replaced using the corresponding keyword.\r\n\r\n@param ENGLISH\r\n\t\tstringp; e.g. \"Bill Clinton likes cars\"\r\n@param CYCL\r\n\t\tcycl-sentence-p; e.g. (#$likesType #$BillClinton #$Automobile)\r\n@param LINKAGE\n\t\tlinkage-p;\r\n\t\t\r\n@param ALLOW-MULTIPLE-MATCHES?\r\n\t\tboolean, should a string be allowed to map to\r\n\t\tmultiple locations in the CYCL?\r\n@return 1. CYCL-TERM-VARS alist-p; e.g. ((#$BillClinton . :BILLCLINTON)\r\n(#$Automobile . :AUTOMOBILE))\r\n2. NL-TERM-VARS alist-p; e.g. ((\"Bill Clinton\" . :BILLCLINTON)\r\n(\"cars\" . :AUTOMOBILE))\nReturns two alists of term-keyword pairs where the term is a CycL or English\nterm that can be replaced using the corresponding keyword.")
    public static SubLObject ebmt_mapped_term_vars(final SubLObject english, final SubLObject cycl, final SubLObject mapped_terms, final SubLObject v_linkage, SubLObject allow_multiple_matchesP) {
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        SubLObject keyword_counter = ONE_INTEGER;
        SubLObject cycl_term_vars = NIL;
        SubLObject nl_term_vars = NIL;
        SubLObject cdolist_list_var = copy_list(mapped_terms);
        SubLObject mapped_term = NIL;
        mapped_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cycl_term = mapped_term.first();
            final SubLObject english_term = mapped_term.rest();
            final SubLObject linkword_english_term = ebmt_link_word(english_term, v_linkage);
            if (NIL != linkword_english_term) {
                final SubLObject english_term_positions = ebmt_lw_offsets(linkword_english_term, english);
                final SubLObject cycl_term_positions = cycl_utilities.arg_positions_dfs(cycl_term, cycl, symbol_function(EQUAL));
                if ((((NIL != english_term_positions) && (NIL != cycl_term_positions)) && ((NIL != allow_multiple_matchesP) || (NIL != list_utilities.singletonP(english_term_positions)))) && ((NIL != allow_multiple_matchesP) || (NIL != list_utilities.singletonP(cycl_term_positions)))) {
                    final SubLObject keyword_var = read_from_string(cconcatenate($str66$_VAR, format_nil.format_nil_a_no_copy(keyword_counter)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cycl_term_vars = acons(cycl_term, keyword_var, cycl_term_vars);
                    nl_term_vars = acons(linkword_english_term, keyword_var, nl_term_vars);
                    keyword_counter = number_utilities.f_1X(keyword_counter);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapped_term = cdolist_list_var.first();
        } 
        return values(cycl_term_vars, nl_term_vars);
    }

    /**
     * use canonical order for the clauses, and use canonical variable names
     */
    @LispMethod(comment = "use canonical order for the clauses, and use canonical variable names")
    public static final SubLObject ebmt_canonicalize_el_sentence_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$canonicalize_tensed_literalsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = czer_vars.$add_term_of_unit_litsP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = czer_vars.$turn_existentials_into_skolemsP$.currentBinding(thread);
                    try {
                        czer_vars.$expand_el_relationsP$.bind(NIL, thread);
                        czer_vars.$canonicalize_tensed_literalsP$.bind(NIL, thread);
                        czer_vars.$add_term_of_unit_litsP$.bind(NIL, thread);
                        czer_vars.$turn_existentials_into_skolemsP$.bind(NIL, thread);
                        {
                            SubLObject hl = czer_main.el_to_hl(sentence, mt);
                            el = uncanonicalizer.cnfs_el_formula(czer_utilities.extract_el_clauses(hl), UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject list_var = NIL;
                                SubLObject el_var = NIL;
                                SubLObject num = NIL;
                                for (list_var = list_utilities.delete_duplicates_from_start(cycl_utilities.expression_gather_with_duplicates(el, $sym61$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), el_var = list_var.first(), num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , num = add(ONE_INTEGER, num)) {
                                    el = cycl_utilities.expression_subst(variables.get_default_el_var(num), el_var, el, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                    } finally {
                        czer_vars.$turn_existentials_into_skolemsP$.rebind(_prev_bind_3, thread);
                        czer_vars.$add_term_of_unit_litsP$.rebind(_prev_bind_2, thread);
                        czer_vars.$canonicalize_tensed_literalsP$.rebind(_prev_bind_1, thread);
                        czer_vars.$expand_el_relationsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return el;
            }
        }
    }

    /**
     * use canonical order for the clauses, and use canonical variable names
     */
    @LispMethod(comment = "use canonical order for the clauses, and use canonical variable names")
    public static SubLObject ebmt_canonicalize_el_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$canonicalize_tensed_literalsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$add_term_of_unit_litsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = czer_vars.$turn_existentials_into_skolemsP$.currentBinding(thread);
        try {
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            czer_vars.$canonicalize_tensed_literalsP$.bind(NIL, thread);
            czer_vars.$add_term_of_unit_litsP$.bind(NIL, thread);
            czer_vars.$turn_existentials_into_skolemsP$.bind(NIL, thread);
            final SubLObject hl = czer_main.el_to_hl(sentence, mt);
            el = uncanonicalizer.cnfs_el_formula(czer_utilities.extract_el_clauses(hl), UNPROVIDED, UNPROVIDED);
            SubLObject list_var = NIL;
            SubLObject el_var = NIL;
            SubLObject num = NIL;
            list_var = list_utilities.delete_duplicates_from_start(cycl_utilities.expression_gather_with_duplicates(el, $sym67$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            el_var = list_var.first();
            for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , num = add(ONE_INTEGER, num)) {
                el = cycl_utilities.expression_subst(variables.get_default_el_var(num), el_var, el, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            czer_vars.$turn_existentials_into_skolemsP$.rebind(_prev_bind_4, thread);
            czer_vars.$add_term_of_unit_litsP$.rebind(_prev_bind_3, thread);
            czer_vars.$canonicalize_tensed_literalsP$.rebind(_prev_bind_2, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_0, thread);
        }
        return el;
    }

    /**
     * Returns the parsing-templates generated based on the English
     * sentence/question ENGLISH and the corresponding CycL representation CYCL.
     */
    @LispMethod(comment = "Returns the parsing-templates generated based on the English\r\nsentence/question ENGLISH and the corresponding CycL representation CYCL.\nReturns the parsing-templates generated based on the English\nsentence/question ENGLISH and the corresponding CycL representation CYCL.")
    public static final SubLObject ebmt_create_template_alt(SubLObject english, SubLObject cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject canonical_cycl = ebmt_canonicalize_el_sentence(cycl, $$InferencePSC);
                SubLObject err_msg = NIL;
                SubLObject v_linkage = NIL;
                SubLObject mapped_terms = NIL;
                SubLObject cycl_term_vars = NIL;
                SubLObject nl_term_vars = NIL;
                SubLObject ignorable_strings = NIL;
                SubLObject template = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_linkage_1 = ebmt_linkage_and_mapped_terms(english, canonical_cycl, lexicon, UNPROVIDED);
                                    SubLObject mapped_terms_2 = thread.secondMultipleValue();
                                    SubLObject ignorable_strings_3 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    v_linkage = v_linkage_1;
                                    mapped_terms = mapped_terms_2;
                                    ignorable_strings = ignorable_strings_3;
                                }
                                thread.resetMultipleValues();
                                {
                                    SubLObject cycl_term_vars_4 = ebmt_mapped_term_vars(english, canonical_cycl, mapped_terms, v_linkage, allow_multiple_matchesP);
                                    SubLObject nl_term_vars_5 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    cycl_term_vars = cycl_term_vars_4;
                                    nl_term_vars = nl_term_vars_5;
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != err_msg) {
                    Errors.warn(string_utilities.string_subst($str_alt64$__, $str_alt65$_, err_msg, UNPROVIDED));
                    return NIL;
                }
                {
                    SubLObject list_var = NIL;
                    SubLObject ignorable_string = NIL;
                    SubLObject num = NIL;
                    for (list_var = ignorable_strings, ignorable_string = list_var.first(), num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , ignorable_string = list_var.first() , num = add(ONE_INTEGER, num)) {
                        {
                            SubLObject keyword = make_keyword(cconcatenate($str_alt50$IGNORE_, format_nil.format_nil_s_no_copy(num)));
                            nl_term_vars = cons(cons(ignorable_string, keyword), nl_term_vars);
                        }
                    }
                }
                template = new_ebmt_template(list(english, cycl), NIL != cycl_term_vars ? ((SubLObject) ($GENERAL)) : $SPECIFIC, ebmt_linkset(v_linkage, nl_term_vars), NIL != cycl_term_vars ? ((SubLObject) (ebmt_cycl_with_vars(copy_expression(canonical_cycl), cycl_term_vars))) : canonical_cycl, UNPROVIDED, UNPROVIDED);
                return template;
            }
        }
    }

    /**
     * Returns the parsing-templates generated based on the English
     * sentence/question ENGLISH and the corresponding CycL representation CYCL.
     */
    @LispMethod(comment = "Returns the parsing-templates generated based on the English\r\nsentence/question ENGLISH and the corresponding CycL representation CYCL.\nReturns the parsing-templates generated based on the English\nsentence/question ENGLISH and the corresponding CycL representation CYCL.")
    public static SubLObject ebmt_create_template(final SubLObject english, final SubLObject cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canonical_cycl = ebmt_canonicalize_el_sentence(cycl, $$InferencePSC);
        SubLObject err_msg = NIL;
        SubLObject v_linkage = NIL;
        SubLObject mapped_terms = NIL;
        SubLObject cycl_term_vars = NIL;
        SubLObject nl_term_vars = NIL;
        SubLObject ignorable_strings = NIL;
        SubLObject template = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject v_linkage_$1 = ebmt_linkage_and_mapped_terms(english, canonical_cycl, lexicon, UNPROVIDED);
                    final SubLObject mapped_terms_$2 = thread.secondMultipleValue();
                    final SubLObject ignorable_strings_$3 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    v_linkage = v_linkage_$1;
                    mapped_terms = mapped_terms_$2;
                    ignorable_strings = ignorable_strings_$3;
                    thread.resetMultipleValues();
                    final SubLObject cycl_term_vars_$4 = ebmt_mapped_term_vars(english, canonical_cycl, mapped_terms, v_linkage, allow_multiple_matchesP);
                    final SubLObject nl_term_vars_$5 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    cycl_term_vars = cycl_term_vars_$4;
                    nl_term_vars = nl_term_vars_$5;
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != err_msg) {
            Errors.warn(string_utilities.string_subst($str70$__, $str71$_, err_msg, UNPROVIDED));
            return NIL;
        }
        SubLObject list_var = NIL;
        SubLObject ignorable_string = NIL;
        SubLObject num = NIL;
        list_var = ignorable_strings;
        ignorable_string = list_var.first();
        for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , ignorable_string = list_var.first() , num = add(ONE_INTEGER, num)) {
            final SubLObject keyword = make_keyword(cconcatenate($str56$IGNORE_, format_nil.format_nil_s_no_copy(num)));
            nl_term_vars = cons(cons(ignorable_string, keyword), nl_term_vars);
        }
        template = new_ebmt_template(list(english, cycl), NIL != cycl_term_vars ? $GENERAL : $SPECIFIC, ebmt_linkset(v_linkage, nl_term_vars), NIL != cycl_term_vars ? ebmt_cycl_with_vars(copy_expression(canonical_cycl), cycl_term_vars) : canonical_cycl, UNPROVIDED, UNPROVIDED);
        return template;
    }

    /**
     * Returns all possible EBMT training examples, i.e. NL-CycL pairs that can be
     * generated from the input training example (NL and CYCL).
     */
    @LispMethod(comment = "Returns all possible EBMT training examples, i.e. NL-CycL pairs that can be\r\ngenerated from the input training example (NL and CYCL).\nReturns all possible EBMT training examples, i.e. NL-CycL pairs that can be\ngenerated from the input training example (NL and CYCL).")
    public static final SubLObject ebmt_create_all_possible_training_examples_alt(SubLObject nl, SubLObject cycl) {
        SubLTrampolineFile.checkType(nl, STRINGP);
        SubLTrampolineFile.checkType(cycl, CYCL_SENTENCE_P);
        {
            SubLObject nl_cycl_pairs = list(list(nl, cycl));
            SubLObject ignorable_strings = ebmt_ignorable_terms_in_training_string(nl);
            if (NIL != ignorable_strings) {
                {
                    SubLObject new_nl = ebmt_remove_ignore_markers(nl);
                    SubLObject cdolist_list_var = ignorable_strings;
                    SubLObject ignorable_term = NIL;
                    for (ignorable_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ignorable_term = cdolist_list_var.first()) {
                        new_nl = string_utilities.remove_substring(new_nl, ignorable_term);
                    }
                    {
                        SubLObject item_var = list(new_nl, cycl);
                        if (NIL == member(item_var, nl_cycl_pairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            nl_cycl_pairs = cons(item_var, nl_cycl_pairs);
                        }
                    }
                }
            }
            return nl_cycl_pairs;
        }
    }

    /**
     * Returns all possible EBMT training examples, i.e. NL-CycL pairs that can be
     * generated from the input training example (NL and CYCL).
     */
    @LispMethod(comment = "Returns all possible EBMT training examples, i.e. NL-CycL pairs that can be\r\ngenerated from the input training example (NL and CYCL).\nReturns all possible EBMT training examples, i.e. NL-CycL pairs that can be\ngenerated from the input training example (NL and CYCL).")
    public static SubLObject ebmt_create_all_possible_training_examples(final SubLObject nl, final SubLObject cycl) {
        assert NIL != stringp(nl) : "! stringp(nl) " + ("Types.stringp(nl) " + "CommonSymbols.NIL != Types.stringp(nl) ") + nl;
        assert NIL != cycl_grammar.cycl_sentence_p(cycl) : "! cycl_grammar.cycl_sentence_p(cycl) " + ("cycl_grammar.cycl_sentence_p(cycl) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(cycl) ") + cycl;
        SubLObject nl_cycl_pairs = list(list(nl, cycl));
        final SubLObject ignorable_strings = ebmt_ignorable_terms_in_training_string(nl);
        if (NIL != ignorable_strings) {
            SubLObject new_nl = ebmt_remove_ignore_markers(nl);
            SubLObject cdolist_list_var = ignorable_strings;
            SubLObject ignorable_term = NIL;
            ignorable_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                new_nl = string_utilities.remove_substring(new_nl, ignorable_term);
                cdolist_list_var = cdolist_list_var.rest();
                ignorable_term = cdolist_list_var.first();
            } 
            final SubLObject item_var = list(new_nl, cycl);
            if (NIL == member(item_var, nl_cycl_pairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                nl_cycl_pairs = cons(item_var, nl_cycl_pairs);
            }
        }
        return nl_cycl_pairs;
    }

    /**
     * Returns a list of EBMT templates that have been created using the input
     * NL-CycL pair and the NL-CycL pairs that are synthesized from it.
     */
    @LispMethod(comment = "Returns a list of EBMT templates that have been created using the input\r\nNL-CycL pair and the NL-CycL pairs that are synthesized from it.\nReturns a list of EBMT templates that have been created using the input\nNL-CycL pair and the NL-CycL pairs that are synthesized from it.")
    public static final SubLObject ebmt_create_templates_alt(SubLObject nl, SubLObject cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        SubLTrampolineFile.checkType(nl, STRINGP);
        SubLTrampolineFile.checkType(cycl, CYCL_SENTENCE_P);
        {
            SubLObject nl_cycl_pairs = ebmt_create_all_possible_training_examples(nl, cycl);
            SubLObject templates = NIL;
            SubLObject cdolist_list_var = nl_cycl_pairs;
            SubLObject nl_cycl_pair = NIL;
            for (nl_cycl_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nl_cycl_pair = cdolist_list_var.first()) {
                {
                    SubLObject nl_sent = nl_cycl_pair.first();
                    SubLObject cycl_sent = second(nl_cycl_pair);
                    SubLObject template = ebmt_create_template(nl_sent, cycl_sent, lexicon, allow_multiple_matchesP);
                    if (NIL != template) {
                        templates = cons(template, templates);
                    }
                    if (NIL != verboseP) {
                        format(T, $str_alt70$__NL___S__CycL____S___S__, new SubLObject[]{ nl_sent, cycl_sent, template });
                    }
                }
            }
            return templates;
        }
    }

    /**
     * Returns a list of EBMT templates that have been created using the input
     * NL-CycL pair and the NL-CycL pairs that are synthesized from it.
     */
    @LispMethod(comment = "Returns a list of EBMT templates that have been created using the input\r\nNL-CycL pair and the NL-CycL pairs that are synthesized from it.\nReturns a list of EBMT templates that have been created using the input\nNL-CycL pair and the NL-CycL pairs that are synthesized from it.")
    public static SubLObject ebmt_create_templates(final SubLObject nl, final SubLObject cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        assert NIL != stringp(nl) : "! stringp(nl) " + ("Types.stringp(nl) " + "CommonSymbols.NIL != Types.stringp(nl) ") + nl;
        assert NIL != cycl_grammar.cycl_sentence_p(cycl) : "! cycl_grammar.cycl_sentence_p(cycl) " + ("cycl_grammar.cycl_sentence_p(cycl) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(cycl) ") + cycl;
        final SubLObject nl_cycl_pairs = ebmt_create_all_possible_training_examples(nl, cycl);
        SubLObject templates = NIL;
        SubLObject cdolist_list_var = nl_cycl_pairs;
        SubLObject nl_cycl_pair = NIL;
        nl_cycl_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject nl_sent = nl_cycl_pair.first();
            final SubLObject cycl_sent = second(nl_cycl_pair);
            final SubLObject template = ebmt_create_template(nl_sent, cycl_sent, lexicon, allow_multiple_matchesP);
            if (NIL != template) {
                templates = cons(template, templates);
            }
            if (NIL != verboseP) {
                format(T, $str76$__NL___S__CycL____S___S__, new SubLObject[]{ nl_sent, cycl_sent, template });
            }
            cdolist_list_var = cdolist_list_var.rest();
            nl_cycl_pair = cdolist_list_var.first();
        } 
        return templates;
    }

    /**
     * Returns a string-encoding of a list with the first and last parenthesis
     * removed.
     * e.g. ((1) (2)) -> "(1) (2)"
     */
    @LispMethod(comment = "Returns a string-encoding of a list with the first and last parenthesis\r\nremoved.\r\ne.g. ((1) (2)) -> \"(1) (2)\"\nReturns a string-encoding of a list with the first and last parenthesis\nremoved.\ne.g. ((1) (2)) -> \"(1) (2)\"")
    public static final SubLObject ebmt_stringify_list_alt(SubLObject list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = NIL;
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        string = format_nil.format_nil_s(list);
                    } finally {
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
                string = string_utilities.strip_first(string);
                string = string_utilities.strip_final(string, UNPROVIDED);
                return string;
            }
        }
    }

    /**
     * Returns a string-encoding of a list with the first and last parenthesis
     * removed.
     * e.g. ((1) (2)) -> "(1) (2)"
     */
    @LispMethod(comment = "Returns a string-encoding of a list with the first and last parenthesis\r\nremoved.\r\ne.g. ((1) (2)) -> \"(1) (2)\"\nReturns a string-encoding of a list with the first and last parenthesis\nremoved.\ne.g. ((1) (2)) -> \"(1) (2)\"")
    public static SubLObject ebmt_stringify_list(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            string = format_nil.format_nil_s(list);
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        string = string_utilities.strip_first(string);
        string = string_utilities.strip_final(string, UNPROVIDED);
        return string;
    }

    /**
     * Returns the list of links as a string that can be input to the EBMT Template
     * Index Server to find the applicable templates.
     *
     * @param LINKS
     * 		listp;  e.g. (("Bill Clinton" "Ss" "likes")
     * 		("likes" "Op" "cars"))
     * @param WITH-VARS?
    booleanp;
     * 		
     * @return LINKS-STRING stringp; e.g.
    - if WITH-VARS? is T: "(:VAR "Op" :VAR) ("likes" "Op" :VAR) (:VAR "Op" "cars") (:VAR "Ss" :VAR) ("Bill Clinton" "Ss" :VAR) (:VAR "Ss" "likes") ("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars")"
    - if WITH-VARS? is NIL: "("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars")"
     */
    @LispMethod(comment = "Returns the list of links as a string that can be input to the EBMT Template\r\nIndex Server to find the applicable templates.\r\n\r\n@param LINKS\r\n\t\tlistp;  e.g. ((\"Bill Clinton\" \"Ss\" \"likes\")\r\n\t\t(\"likes\" \"Op\" \"cars\"))\r\n@param WITH-VARS?\nbooleanp;\r\n\t\t\r\n@return LINKS-STRING stringp; e.g.\r\n- if WITH-VARS? is T: \"(:VAR \"Op\" :VAR) (\"likes\" \"Op\" :VAR) (:VAR \"Op\" \"cars\") (:VAR \"Ss\" :VAR) (\"Bill Clinton\" \"Ss\" :VAR) (:VAR \"Ss\" \"likes\") (\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\")\"\r\n- if WITH-VARS? is NIL: \"(\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\")\"\nReturns the list of links as a string that can be input to the EBMT Template\nIndex Server to find the applicable templates.")
    public static final SubLObject ebmt_linkset_string_alt(SubLObject links, SubLObject with_varsP) {
        if (with_varsP == UNPROVIDED) {
            with_varsP = NIL;
        }
        {
            SubLObject result_links = links;
            if (NIL != with_varsP) {
                {
                    SubLObject cdolist_list_var = links;
                    SubLObject link = NIL;
                    for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                        {
                            SubLObject link_first_replaced = list_utilities.replace_nth(ZERO_INTEGER, $VAR, link);
                            {
                                SubLObject item_var = link_first_replaced;
                                if (NIL == member(item_var, result_links, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    result_links = cons(item_var, result_links);
                                }
                            }
                            {
                                SubLObject item_var = list_utilities.replace_last(link, $VAR);
                                if (NIL == member(item_var, result_links, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    result_links = cons(item_var, result_links);
                                }
                            }
                            {
                                SubLObject item_var = list_utilities.replace_last(link_first_replaced, $VAR);
                                if (NIL == member(item_var, result_links, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    result_links = cons(item_var, result_links);
                                }
                            }
                        }
                    }
                }
            }
            return ebmt_stringify_list(result_links);
        }
    }

    /**
     * Returns the list of links as a string that can be input to the EBMT Template
     * Index Server to find the applicable templates.
     *
     * @param LINKS
     * 		listp;  e.g. (("Bill Clinton" "Ss" "likes")
     * 		("likes" "Op" "cars"))
     * @param WITH-VARS?
    		booleanp;
     * 		
     * @return LINKS-STRING stringp; e.g.
    - if WITH-VARS? is T: "(:VAR "Op" :VAR) ("likes" "Op" :VAR) (:VAR "Op" "cars") (:VAR "Ss" :VAR) ("Bill Clinton" "Ss" :VAR) (:VAR "Ss" "likes") ("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars")"
    - if WITH-VARS? is NIL: "("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars")"
     */
    @LispMethod(comment = "Returns the list of links as a string that can be input to the EBMT Template\r\nIndex Server to find the applicable templates.\r\n\r\n@param LINKS\r\n\t\tlistp;  e.g. ((\"Bill Clinton\" \"Ss\" \"likes\")\r\n\t\t(\"likes\" \"Op\" \"cars\"))\r\n@param WITH-VARS?\n\t\tbooleanp;\r\n\t\t\r\n@return LINKS-STRING stringp; e.g.\r\n- if WITH-VARS? is T: \"(:VAR \"Op\" :VAR) (\"likes\" \"Op\" :VAR) (:VAR \"Op\" \"cars\") (:VAR \"Ss\" :VAR) (\"Bill Clinton\" \"Ss\" :VAR) (:VAR \"Ss\" \"likes\") (\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\")\"\r\n- if WITH-VARS? is NIL: \"(\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\")\"\nReturns the list of links as a string that can be input to the EBMT Template\nIndex Server to find the applicable templates.")
    public static SubLObject ebmt_linkset_string(final SubLObject links, SubLObject with_varsP) {
        if (with_varsP == UNPROVIDED) {
            with_varsP = NIL;
        }
        SubLObject result_links = links;
        if (NIL != with_varsP) {
            SubLObject cdolist_list_var = links;
            SubLObject link = NIL;
            link = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject item_var;
                final SubLObject link_first_replaced = item_var = list_utilities.replace_nth(ZERO_INTEGER, $VAR, link);
                if (NIL == member(item_var, result_links, symbol_function(EQL), symbol_function(IDENTITY))) {
                    result_links = cons(item_var, result_links);
                }
                item_var = list_utilities.replace_last(link, $VAR);
                if (NIL == member(item_var, result_links, symbol_function(EQL), symbol_function(IDENTITY))) {
                    result_links = cons(item_var, result_links);
                }
                item_var = list_utilities.replace_last(link_first_replaced, $VAR);
                if (NIL == member(item_var, result_links, symbol_function(EQL), symbol_function(IDENTITY))) {
                    result_links = cons(item_var, result_links);
                }
                cdolist_list_var = cdolist_list_var.rest();
                link = cdolist_list_var.first();
            } 
        }
        return ebmt_stringify_list(result_links);
    }

    /**
     * Create the template-string that is used to query the EBMT Template Index
     * Server in order to add the template to the index.
     *
     * @param template
     * 		ebmt-template-p; e.g.
     * 		#<TEMPLATE:
     * 		Type: SPECIFIC
     * 		Links: (("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars"))
     * 		CycL: (#$likesType #$BillClinton #$Automobile)
     * 		>
     * @return TEMPLATE-STRING stringp; e.g. "("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars")~((("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars")) (#$likesType #$BillClinton #$Automobile))"
     */
    @LispMethod(comment = "Create the template-string that is used to query the EBMT Template Index\r\nServer in order to add the template to the index.\r\n\r\n@param template\r\n\t\tebmt-template-p; e.g.\r\n\t\t#<TEMPLATE:\r\n\t\tType: SPECIFIC\r\n\t\tLinks: ((\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\"))\r\n\t\tCycL: (#$likesType #$BillClinton #$Automobile)\r\n\t\t>\r\n@return TEMPLATE-STRING stringp; e.g. \"(\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\")~(((\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\")) (#$likesType #$BillClinton #$Automobile))\"\nCreate the template-string that is used to query the EBMT Template Index\nServer in order to add the template to the index.")
    public static final SubLObject ebmt_index_template_input_alt(SubLObject template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_links = ebmt_template_links(template);
                SubLObject template_string = NIL;
                if (ebmt_template_type(template) == $GENERAL) {
                    {
                        SubLObject links = NIL;
                        SubLObject cdolist_list_var = template_links;
                        SubLObject link = NIL;
                        for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                            link = subst_if($VAR, KEYWORDP, link, UNPROVIDED);
                            links = cons(link, links);
                        }
                        template_links = nreverse(links);
                    }
                }
                template_string = ebmt_stringify_list(get_linkset_unindexed_links(template_links));
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        template_string = cconcatenate(format_nil.format_nil_a_no_copy(template_string), new SubLObject[]{ format_nil.$format_nil_tilde$.getGlobalValue(), format_nil.format_nil_s_no_copy(list(get_linkset_unindexed_links(ebmt_template_links(template)), ebmt_template_cycl(template), get_linkset_indexed_links(ebmt_template_links(template)))) });
                    } finally {
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
                return template_string;
            }
        }
    }

    /**
     * Create the template-string that is used to query the EBMT Template Index
     * Server in order to add the template to the index.
     *
     * @param template
     * 		ebmt-template-p; e.g.
     * 		#<TEMPLATE:
     * 		Type: SPECIFIC
     * 		Links: (("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars"))
     * 		CycL: (#$likesType #$BillClinton #$Automobile)
     * 		>
     * @return TEMPLATE-STRING stringp; e.g. "("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars")~((("Bill Clinton" "Ss" "likes") ("likes" "Op" "cars")) (#$likesType #$BillClinton #$Automobile))"
     */
    @LispMethod(comment = "Create the template-string that is used to query the EBMT Template Index\r\nServer in order to add the template to the index.\r\n\r\n@param template\r\n\t\tebmt-template-p; e.g.\r\n\t\t#<TEMPLATE:\r\n\t\tType: SPECIFIC\r\n\t\tLinks: ((\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\"))\r\n\t\tCycL: (#$likesType #$BillClinton #$Automobile)\r\n\t\t>\r\n@return TEMPLATE-STRING stringp; e.g. \"(\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\")~(((\"Bill Clinton\" \"Ss\" \"likes\") (\"likes\" \"Op\" \"cars\")) (#$likesType #$BillClinton #$Automobile))\"\nCreate the template-string that is used to query the EBMT Template Index\nServer in order to add the template to the index.")
    public static SubLObject ebmt_index_template_input(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template_links = ebmt_template_links(template);
        SubLObject template_string = NIL;
        if (ebmt_template_type(template) == $GENERAL) {
            SubLObject links = NIL;
            SubLObject cdolist_list_var = template_links;
            SubLObject link = NIL;
            link = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                link = subst_if($VAR, KEYWORDP, link, UNPROVIDED);
                links = cons(link, links);
                cdolist_list_var = cdolist_list_var.rest();
                link = cdolist_list_var.first();
            } 
            template_links = nreverse(links);
        }
        template_string = ebmt_stringify_list(get_linkset_unindexed_links(template_links));
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            template_string = cconcatenate(format_nil.format_nil_a_no_copy(template_string), new SubLObject[]{ format_nil.$format_nil_tilde$.getGlobalValue(), format_nil.format_nil_s_no_copy(list(get_linkset_unindexed_links(ebmt_template_links(template)), ebmt_template_cycl(template), get_linkset_indexed_links(ebmt_template_links(template)))) });
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return template_string;
    }

    /**
     * Determine the host, port, index-content, and log of the EBMT Index Server
     * that corresponds to the LEXICON.
     *
     * @param LEXICON
     * 		abstract-lexicon-p OR NIL;
     * @return - HOST stringp
    - PORT integerp
    - CONTENT stringp
    - LOG stringp
     */
    @LispMethod(comment = "Determine the host, port, index-content, and log of the EBMT Index Server\r\nthat corresponds to the LEXICON.\r\n\r\n@param LEXICON\r\n\t\tabstract-lexicon-p OR NIL;\r\n@return - HOST stringp\r\n- PORT integerp\r\n- CONTENT stringp\r\n- LOG stringp\nDetermine the host, port, index-content, and log of the EBMT Index Server\nthat corresponds to the LEXICON.")
    public static final SubLObject ebmt_template_index_server_info_alt(SubLObject lexicon) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            lexicon = $DEFAULT;
            {
                SubLObject host = NIL;
                SubLObject port = NIL;
                SubLObject content = NIL;
                SubLObject log = NIL;
                SubLObject pcase_var = lexicon;
                if (pcase_var.eql($DEFAULT)) {
                    host = lucene_index.$ebmt_index_host$.getDynamicValue(thread);
                    port = lucene_index.$ebmt_index_port$.getDynamicValue(thread);
                    content = lucene_index.$ebmt_index_content$.getDynamicValue(thread);
                    log = lucene_index.$ebmt_index_log$.getDynamicValue(thread);
                } else {
                    Errors.error($str_alt74$Unknown_EBMT_lexicon___S__, lexicon);
                }
                return values(host, port, content, log);
            }
        }
    }

    /**
     * Determine the host, port, index-content, and log of the EBMT Index Server
     * that corresponds to the LEXICON.
     *
     * @param LEXICON
     * 		abstract-lexicon-p OR NIL;
     * @return - HOST stringp
    - PORT integerp
    - CONTENT stringp
    - LOG stringp
     */
    @LispMethod(comment = "Determine the host, port, index-content, and log of the EBMT Index Server\r\nthat corresponds to the LEXICON.\r\n\r\n@param LEXICON\r\n\t\tabstract-lexicon-p OR NIL;\r\n@return - HOST stringp\r\n- PORT integerp\r\n- CONTENT stringp\r\n- LOG stringp\nDetermine the host, port, index-content, and log of the EBMT Index Server\nthat corresponds to the LEXICON.")
    public static SubLObject ebmt_template_index_server_info(SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        lexicon = $DEFAULT;
        SubLObject host = NIL;
        SubLObject port = NIL;
        SubLObject content = NIL;
        SubLObject log = NIL;
        final SubLObject pcase_var = lexicon;
        if (pcase_var.eql($DEFAULT)) {
            host = lucene_index.$ebmt_index_host$.getDynamicValue(thread);
            port = lucene_index.$ebmt_index_port$.getDynamicValue(thread);
            content = lucene_index.$ebmt_index_content$.getDynamicValue(thread);
            log = lucene_index.$ebmt_index_log$.getDynamicValue(thread);
        } else {
            Errors.error($str80$Unknown_EBMT_lexicon___S__, lexicon);
        }
        return values(host, port, content, log);
    }

    /**
     *
     *
     * @param LOG
    stringp
     * 		
     * @param MESSAGE
    stringp
     * 		
     */
    @LispMethod(comment = "@param LOG\nstringp\r\n\t\t\r\n@param MESSAGE\nstringp")
    public static final SubLObject ebmt_update_log_alt(SubLObject log, SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                try {
                    $print_pretty$.bind(NIL, thread);
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(log, $APPEND, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt76$Unable_to_open__S, log);
                            }
                            {
                                SubLObject s_out = stream;
                                format(s_out, $str_alt77$_A__A__, numeric_date_utilities.universal_timestring(UNPROVIDED), message);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                }
                            }
                        }
                    }
                } finally {
                    $print_pretty$.rebind(_prev_bind_0, thread);
                }
            }
            return log;
        }
    }

    /**
     *
     *
     * @param LOG
    stringp
     * 		
     * @param MESSAGE
    stringp
     * 		
     */
    @LispMethod(comment = "@param LOG\nstringp\r\n\t\t\r\n@param MESSAGE\nstringp")
    public static SubLObject ebmt_update_log(final SubLObject log, final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(log, $APPEND);
                if (!stream.isStream()) {
                    Errors.error($str82$Unable_to_open__S, log);
                }
                final SubLObject s_out = stream;
                format(s_out, $str83$_A__A__, numeric_date_utilities.universal_timestring(UNPROVIDED), message);
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return log;
    }

    /**
     *
     *
     * @param FILE-PATH
    stringp
     * 		
     * @param EXAMPLE
     * 		listp; list of nl-sentence and cycl-sentence
     */
    @LispMethod(comment = "@param FILE-PATH\nstringp\r\n\t\t\r\n@param EXAMPLE\r\n\t\tlistp; list of nl-sentence and cycl-sentence")
    public static final SubLObject ebmt_delete_example_from_file_alt(SubLObject file, SubLObject example) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                try {
                    $print_pretty$.bind(NIL, thread);
                    {
                        SubLObject example_string = format_nil.format_nil_s(example);
                        SubLObject new_lines = NIL;
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(file, $INPUT, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt76$Unable_to_open__S, file);
                            }
                            {
                                SubLObject infile = stream;
                                if (infile.isStream()) {
                                    {
                                        SubLObject line = NIL;
                                        for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                            if (!line.equal(example_string)) {
                                                new_lines = cons(line, new_lines);
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                }
                            }
                        }
                        file_utilities.output_text_file(file, new_lines, UNPROVIDED);
                    }
                } finally {
                    $print_pretty$.rebind(_prev_bind_0, thread);
                }
            }
            return file;
        }
    }

    /**
     *
     *
     * @param FILE-PATH
    stringp
     * 		
     * @param EXAMPLE
     * 		listp; list of nl-sentence and cycl-sentence
     */
    @LispMethod(comment = "@param FILE-PATH\nstringp\r\n\t\t\r\n@param EXAMPLE\r\n\t\tlistp; list of nl-sentence and cycl-sentence")
    public static SubLObject ebmt_delete_example_from_file(final SubLObject file, final SubLObject example) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            final SubLObject example_string = format_nil.format_nil_s(example);
            SubLObject new_lines = NIL;
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$7 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(file, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$7, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str82$Unable_to_open__S, file);
                }
                final SubLObject infile = stream;
                if (infile.isStream()) {
                    SubLObject line;
                    for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                        if (!line.equal(example_string)) {
                            new_lines = cons(line, new_lines);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
            file_utilities.output_text_file(file, new_lines, UNPROVIDED);
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return file;
    }

    public static final SubLObject ebmt_index_template_int_alt(SubLObject template, SubLObject host, SubLObject port) {
        return lucene_index.ebmt_index_add_template(ebmt_index_template_input(template), host, port);
    }

    public static SubLObject ebmt_index_template_int(final SubLObject template, final SubLObject host, final SubLObject port) {
        return NIL;
    }

    /**
     * Adds TEMPLATE to the EBMT Template Index.
     */
    @LispMethod(comment = "Adds TEMPLATE to the EBMT Template Index.")
    public static final SubLObject ebmt_index_template_alt(SubLObject template, SubLObject lexicon, SubLObject verboseP) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(template, EBMT_TEMPLATE_P);
            {
                SubLObject result = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject host = ebmt_template_index_server_info(lexicon);
                    SubLObject port = thread.secondMultipleValue();
                    SubLObject content = thread.thirdMultipleValue();
                    SubLObject log = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    result = ebmt_index_template_int(template, host, port);
                    {
                        SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                        try {
                            $print_pretty$.bind(NIL, thread);
                            {
                                SubLObject nl_cycl_pair = ebmt_template_nl_cycl_pair(template);
                                SubLObject log_message = cconcatenate(format_nil.format_nil_a_no_copy(result), new SubLObject[]{ $str_alt79$__, format_nil.format_nil_a_no_copy(ebmt_template_type(template)), $str_alt80$___, format_nil.format_nil_s_no_copy(nl_cycl_pair) });
                                if (NIL != verboseP) {
                                    format(T, $str_alt81$_A_____S__, result, template);
                                }
                                ebmt_update_log(log, log_message);
                                if ((NIL != nl_cycl_pair) && result.equal($$$Added)) {
                                    {
                                        SubLObject stream = NIL;
                                        try {
                                            stream = compatibility.open_text(content, $APPEND, NIL);
                                            if (!stream.isStream()) {
                                                Errors.error($str_alt76$Unable_to_open__S, content);
                                            }
                                            {
                                                SubLObject s_out = stream;
                                                format(s_out, $str_alt83$_S__, nl_cycl_pair);
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (stream.isStream()) {
                                                        close(stream, UNPROVIDED);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            $print_pretty$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Adds TEMPLATE to the EBMT Template Index.")
    public static SubLObject ebmt_index_template(final SubLObject template, SubLObject lexicon, SubLObject verboseP) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != ebmt_template_p(template) : "! ebmt_template_parser.ebmt_template_p(template) " + ("ebmt_template_parser.ebmt_template_p(template) " + "CommonSymbols.NIL != ebmt_template_parser.ebmt_template_p(template) ") + template;
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject host = ebmt_template_index_server_info(lexicon);
        final SubLObject port = thread.secondMultipleValue();
        final SubLObject content = thread.thirdMultipleValue();
        final SubLObject log = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        result = ebmt_index_template_int(template, host, port);
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            final SubLObject nl_cycl_pair = ebmt_template_nl_cycl_pair(template);
            final SubLObject log_message = cconcatenate(format_nil.format_nil_a_no_copy(result), new SubLObject[]{ $str85$__, format_nil.format_nil_a_no_copy(ebmt_template_type(template)), $str86$___, format_nil.format_nil_s_no_copy(nl_cycl_pair) });
            if (NIL != verboseP) {
                format(T, $str87$_A_____S__, result, template);
            }
            ebmt_update_log(log, log_message);
            if ((NIL != nl_cycl_pair) && result.equal($$$Added)) {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(content, $APPEND);
                    if (!stream.isStream()) {
                        Errors.error($str82$Unable_to_open__S, content);
                    }
                    final SubLObject s_out = stream;
                    format(s_out, $str89$_S__, nl_cycl_pair);
                } finally {
                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Creates EBMT templates using the input example, and then adds them to the
     * Lucene index.
     */
    @LispMethod(comment = "Creates EBMT templates using the input example, and then adds them to the\r\nLucene index.\nCreates EBMT templates using the input example, and then adds them to the\nLucene index.")
    public static final SubLObject ebmt_create_and_add_templates_alt(SubLObject nl, SubLObject cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        SubLTrampolineFile.checkType(nl, STRINGP);
        SubLTrampolineFile.checkType(cycl, CYCL_SENTENCE_P);
        {
            SubLObject templates = ebmt_create_templates(nl, cycl, lexicon, allow_multiple_matchesP, verboseP);
            SubLObject cdolist_list_var = templates;
            SubLObject template = NIL;
            for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                _csetf_ebmt_template_indexing_result(template, ebmt_index_template(template, lexicon, verboseP));
            }
            return templates;
        }
    }

    @LispMethod(comment = "Creates EBMT templates using the input example, and then adds them to the\r\nLucene index.\nCreates EBMT templates using the input example, and then adds them to the\nLucene index.")
    public static SubLObject ebmt_create_and_add_templates(final SubLObject nl, final SubLObject cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        assert NIL != stringp(nl) : "! stringp(nl) " + ("Types.stringp(nl) " + "CommonSymbols.NIL != Types.stringp(nl) ") + nl;
        assert NIL != cycl_grammar.cycl_sentence_p(cycl) : "! cycl_grammar.cycl_sentence_p(cycl) " + ("cycl_grammar.cycl_sentence_p(cycl) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(cycl) ") + cycl;
        SubLObject cdolist_list_var;
        final SubLObject templates = cdolist_list_var = ebmt_create_templates(nl, cycl, lexicon, allow_multiple_matchesP, verboseP);
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            _csetf_ebmt_template_indexing_result(template, ebmt_index_template(template, lexicon, verboseP));
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        return templates;
    }

    /**
     * Find the templates that are applicable to LINKAGE.
     */
    @LispMethod(comment = "Find the templates that are applicable to LINKAGE.")
    public static final SubLObject ebmt_find_templates_for_linkage_alt(SubLObject v_linkage, SubLObject with_varsP, SubLObject lexicon) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject links = get_linkset_unindexed_links(ebmt_linkset(v_linkage, UNPROVIDED));
                SubLObject linkage_string = ebmt_linkset_string(links, with_varsP);
                SubLObject templates = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject host = ebmt_template_index_server_info(lexicon);
                    SubLObject port = thread.secondMultipleValue();
                    SubLObject content = thread.thirdMultipleValue();
                    SubLObject log = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    templates = lucene_index.ebmt_index_find_templates(linkage_string, host, port);
                    {
                        SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                        try {
                            $print_pretty$.bind(NIL, thread);
                            {
                                SubLObject log_message = cconcatenate($str_alt84$Found_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(templates)), $str_alt85$_templates_for_linkset__, format_nil.format_nil_s_no_copy(linkage_string) });
                                ebmt_update_log(log, log_message);
                            }
                        } finally {
                            $print_pretty$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return templates;
            }
        }
    }

    @LispMethod(comment = "Find the templates that are applicable to LINKAGE.")
    public static SubLObject ebmt_find_templates_for_linkage(final SubLObject v_linkage, final SubLObject with_varsP, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject links = get_linkset_unindexed_links(ebmt_linkset(v_linkage, UNPROVIDED));
        final SubLObject linkage_string = ebmt_linkset_string(links, with_varsP);
        SubLObject templates = NIL;
        thread.resetMultipleValues();
        final SubLObject host = ebmt_template_index_server_info(lexicon);
        final SubLObject port = thread.secondMultipleValue();
        final SubLObject content = thread.thirdMultipleValue();
        final SubLObject log = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        templates = NIL;
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            final SubLObject log_message = cconcatenate($$$Found_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(templates)), $str91$_templates_for_linkset__, format_nil.format_nil_s_no_copy(linkage_string) });
            ebmt_update_log(log, log_message);
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return templates;
    }

    /**
     * Find the templates that are applicable to the English sentence NL.
     */
    @LispMethod(comment = "Find the templates that are applicable to the English sentence NL.")
    public static final SubLObject ebmt_find_templates_alt(SubLObject sent, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        SubLTrampolineFile.checkType(sent, STRINGP);
        {
            SubLObject v_linkage = linkage.new_linkage(string_utilities.strip_sentential_punctuation(sent), list($LEXICON, lexicon));
            return ebmt_find_templates_for_linkage(v_linkage, T, lexicon);
        }
    }

    @LispMethod(comment = "Find the templates that are applicable to the English sentence NL.")
    public static SubLObject ebmt_find_templates(final SubLObject sent, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        assert NIL != stringp(sent) : "! stringp(sent) " + ("Types.stringp(sent) " + "CommonSymbols.NIL != Types.stringp(sent) ") + sent;
        final SubLObject v_linkage = linkage.new_linkage(string_utilities.strip_sentential_punctuation(sent), list($LEXICON, lexicon));
        return ebmt_find_templates_for_linkage(v_linkage, T, lexicon);
    }

    public static final SubLObject ebmt_delete_template_int_alt(SubLObject template, SubLObject host, SubLObject port) {
        return lucene_index.ebmt_index_delete_template(ebmt_index_template_input(template), host, port);
    }

    public static SubLObject ebmt_delete_template_int(final SubLObject template, final SubLObject host, final SubLObject port) {
        return NIL;
    }

    /**
     * Removes TEMPLATE from the EBMT Template Index.
     */
    @LispMethod(comment = "Removes TEMPLATE from the EBMT Template Index.")
    public static final SubLObject ebmt_delete_template_alt(SubLObject template, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(template, EBMT_TEMPLATE_P);
            thread.resetMultipleValues();
            {
                SubLObject host = ebmt_template_index_server_info(lexicon);
                SubLObject port = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return ebmt_delete_template_int(template, host, port);
            }
        }
    }

    @LispMethod(comment = "Removes TEMPLATE from the EBMT Template Index.")
    public static SubLObject ebmt_delete_template(final SubLObject template, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != ebmt_template_p(template) : "! ebmt_template_parser.ebmt_template_p(template) " + ("ebmt_template_parser.ebmt_template_p(template) " + "CommonSymbols.NIL != ebmt_template_parser.ebmt_template_p(template) ") + template;
        thread.resetMultipleValues();
        final SubLObject host = ebmt_template_index_server_info(lexicon);
        final SubLObject port = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return NIL;
    }

    /**
     * Removes template represented by TEMPLATE-STRING from the EBMT Template Index
     */
    @LispMethod(comment = "Removes template represented by TEMPLATE-STRING from the EBMT Template Index")
    public static final SubLObject ebmt_delete_template_using_template_string_alt(SubLObject template_string, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(template_string, STRINGP);
            thread.resetMultipleValues();
            {
                SubLObject host = ebmt_template_index_server_info(lexicon);
                SubLObject port = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return lucene_index.ebmt_index_delete_template(template_string, host, port);
            }
        }
    }

    @LispMethod(comment = "Removes template represented by TEMPLATE-STRING from the EBMT Template Index")
    public static SubLObject ebmt_delete_template_using_template_string(final SubLObject template_string, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(template_string) : "! stringp(template_string) " + ("Types.stringp(template_string) " + "CommonSymbols.NIL != Types.stringp(template_string) ") + template_string;
        thread.resetMultipleValues();
        final SubLObject host = ebmt_template_index_server_info(lexicon);
        final SubLObject port = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return NIL;
    }

    /**
     * Parse the sentence, and remove all the templates in the justification for it.
     *
     * @unknown use with extreme caution!
     */
    @LispMethod(comment = "Parse the sentence, and remove all the templates in the justification for it.\r\n\r\n@unknown use with extreme caution!")
    public static final SubLObject ebmt_delete_template_using_parse_alt(SubLObject nl_sent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject interps = ebmt_parse(nl_sent, UNPROVIDED, UNPROVIDED);
                SubLObject justs = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject cdolist_list_var = justs;
                    SubLObject just = NIL;
                    for (just = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , just = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_9 = just;
                            SubLObject just_item = NIL;
                            for (just_item = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , just_item = cdolist_list_var_9.first()) {
                                if (NIL != ebmt_template_p(just_item)) {
                                    ebmt_delete_template(just_item, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
            return $DONE;
        }
    }

    @LispMethod(comment = "Parse the sentence, and remove all the templates in the justification for it.\r\n\r\n@unknown use with extreme caution!")
    public static SubLObject ebmt_delete_template_using_parse(final SubLObject nl_sent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject interps = ebmt_parse(nl_sent, UNPROVIDED, UNPROVIDED);
        final SubLObject justs = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = justs;
        SubLObject just = NIL;
        just = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10 = just;
            SubLObject just_item = NIL;
            just_item = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                if (NIL != ebmt_template_p(just_item)) {
                    ebmt_delete_template(just_item, UNPROVIDED);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                just_item = cdolist_list_var_$10.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        } 
        return $DONE;
    }

    /**
     * Create EBMT template(s) from NL-SENT and CYCL-SENT, and then delete the EBMT
     * template from the EBMT Template Index specified by LEXICON.
     */
    @LispMethod(comment = "Create EBMT template(s) from NL-SENT and CYCL-SENT, and then delete the EBMT\r\ntemplate from the EBMT Template Index specified by LEXICON.\nCreate EBMT template(s) from NL-SENT and CYCL-SENT, and then delete the EBMT\ntemplate from the EBMT Template Index specified by LEXICON.")
    public static final SubLObject ebmt_delete_templates_using_example_alt(SubLObject nl_sent, SubLObject cycl_sent, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(nl_sent, STRINGP);
            SubLTrampolineFile.checkType(cycl_sent, CYCL_SENTENCE_P);
            {
                SubLObject templates = ebmt_create_templates(nl_sent, cycl_sent, lexicon, allow_multiple_matchesP, verboseP);
                thread.resetMultipleValues();
                {
                    SubLObject host = ebmt_template_index_server_info(lexicon);
                    SubLObject port = thread.secondMultipleValue();
                    SubLObject content = thread.thirdMultipleValue();
                    SubLObject log = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                        try {
                            $print_pretty$.bind(NIL, thread);
                            {
                                SubLObject cdolist_list_var = templates;
                                SubLObject template = NIL;
                                for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                                    {
                                        SubLObject nl_cycl_pair = ebmt_template_nl_cycl_pair(template);
                                        SubLObject result = ebmt_delete_template_int(template, host, port);
                                        ebmt_update_log(log, cconcatenate(format_nil.format_nil_a_no_copy(result), new SubLObject[]{ $str_alt79$__, format_nil.format_nil_a_no_copy(ebmt_template_type(template)), $str_alt80$___, format_nil.format_nil_s_no_copy(nl_cycl_pair) }));
                                        if (result.equal($$$Deleted)) {
                                            ebmt_delete_example_from_file(content, nl_cycl_pair);
                                        }
                                        if (NIL != verboseP) {
                                            format(T, $str_alt88$_A__, result);
                                        }
                                    }
                                }
                            }
                        } finally {
                            $print_pretty$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return templates;
            }
        }
    }

    @LispMethod(comment = "Create EBMT template(s) from NL-SENT and CYCL-SENT, and then delete the EBMT\r\ntemplate from the EBMT Template Index specified by LEXICON.\nCreate EBMT template(s) from NL-SENT and CYCL-SENT, and then delete the EBMT\ntemplate from the EBMT Template Index specified by LEXICON.")
    public static SubLObject ebmt_delete_templates_using_example(final SubLObject nl_sent, final SubLObject cycl_sent, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(nl_sent) : "! stringp(nl_sent) " + ("Types.stringp(nl_sent) " + "CommonSymbols.NIL != Types.stringp(nl_sent) ") + nl_sent;
        assert NIL != cycl_grammar.cycl_sentence_p(cycl_sent) : "! cycl_grammar.cycl_sentence_p(cycl_sent) " + ("cycl_grammar.cycl_sentence_p(cycl_sent) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(cycl_sent) ") + cycl_sent;
        final SubLObject templates = ebmt_create_templates(nl_sent, cycl_sent, lexicon, allow_multiple_matchesP, verboseP);
        thread.resetMultipleValues();
        final SubLObject host = ebmt_template_index_server_info(lexicon);
        final SubLObject port = thread.secondMultipleValue();
        final SubLObject content = thread.thirdMultipleValue();
        final SubLObject log = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            SubLObject cdolist_list_var = templates;
            SubLObject template = NIL;
            template = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject nl_cycl_pair = ebmt_template_nl_cycl_pair(template);
                final SubLObject result = ebmt_delete_template_int(template, host, port);
                ebmt_update_log(log, cconcatenate(format_nil.format_nil_a_no_copy(result), new SubLObject[]{ $str85$__, format_nil.format_nil_a_no_copy(ebmt_template_type(template)), $str86$___, format_nil.format_nil_s_no_copy(nl_cycl_pair) }));
                if (result.equal($$$Deleted)) {
                    ebmt_delete_example_from_file(content, nl_cycl_pair);
                }
                if (NIL != verboseP) {
                    format(T, $str94$_A__, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                template = cdolist_list_var.first();
            } 
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return templates;
    }

    public static final SubLObject new_ebmt_cycl_alt(SubLObject cycl, SubLObject justification, SubLObject weight) {
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (justification == UNPROVIDED) {
            justification = NIL;
        }
        if (weight == UNPROVIDED) {
            weight = NIL;
        }
        {
            SubLObject result = putf(NIL, $CYCL, cycl);
            result = putf(result, $JUSTIFICATION, justification);
            result = putf(result, $WEIGHT, weight);
            return result;
        }
    }

    public static SubLObject new_ebmt_cycl(SubLObject cycl, SubLObject justification, SubLObject weight) {
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (justification == UNPROVIDED) {
            justification = NIL;
        }
        if (weight == UNPROVIDED) {
            weight = NIL;
        }
        SubLObject result = putf(NIL, $CYCL, cycl);
        result = putf(result, $JUSTIFICATION, justification);
        result = putf(result, $WEIGHT, weight);
        return result;
    }

    public static final SubLObject copy_ebmt_cycl_alt(SubLObject ebmt_cycl) {
        return copy_list(ebmt_cycl);
    }

    public static SubLObject copy_ebmt_cycl(final SubLObject ebmt_cycl) {
        return copy_list(ebmt_cycl);
    }

    public static final SubLObject ebmt_cycl_p_alt(SubLObject thing) {
        return list_utilities.property_list_p(thing);
    }

    public static SubLObject ebmt_cycl_p(final SubLObject thing) {
        return list_utilities.property_list_p(thing);
    }

    public static final SubLObject set_ebmt_cycl_cycl_alt(SubLObject ebmt_cycl, SubLObject cycl) {
        return putf(ebmt_cycl, $CYCL, cycl);
    }

    public static SubLObject set_ebmt_cycl_cycl(final SubLObject ebmt_cycl, final SubLObject cycl) {
        return putf(ebmt_cycl, $CYCL, cycl);
    }

    public static final SubLObject get_ebmt_cycl_cycl_alt(SubLObject ebmt_cycl) {
        return getf(ebmt_cycl, $CYCL, UNPROVIDED);
    }

    public static SubLObject get_ebmt_cycl_cycl(final SubLObject ebmt_cycl) {
        return getf(ebmt_cycl, $CYCL, UNPROVIDED);
    }

    public static final SubLObject set_ebmt_cycl_justification_alt(SubLObject ebmt_cycl, SubLObject justification) {
        return putf(ebmt_cycl, $JUSTIFICATION, justification);
    }

    public static SubLObject set_ebmt_cycl_justification(final SubLObject ebmt_cycl, final SubLObject justification) {
        return putf(ebmt_cycl, $JUSTIFICATION, justification);
    }

    public static final SubLObject get_ebmt_cycl_justification_alt(SubLObject ebmt_cycl) {
        return getf(ebmt_cycl, $JUSTIFICATION, UNPROVIDED);
    }

    public static SubLObject get_ebmt_cycl_justification(final SubLObject ebmt_cycl) {
        return getf(ebmt_cycl, $JUSTIFICATION, UNPROVIDED);
    }

    public static final SubLObject set_ebmt_cycl_weight_alt(SubLObject ebmt_cycl, SubLObject weight) {
        return putf(ebmt_cycl, $WEIGHT, weight);
    }

    public static SubLObject set_ebmt_cycl_weight(final SubLObject ebmt_cycl, final SubLObject weight) {
        return putf(ebmt_cycl, $WEIGHT, weight);
    }

    public static final SubLObject get_ebmt_cycl_weight_alt(SubLObject ebmt_cycl) {
        return getf(ebmt_cycl, $WEIGHT, UNPROVIDED);
    }

    public static SubLObject get_ebmt_cycl_weight(final SubLObject ebmt_cycl) {
        return getf(ebmt_cycl, $WEIGHT, UNPROVIDED);
    }

    public static final SubLObject compose_ebmt_cycl_justifications_alt(SubLObject ebmt_cycl, SubLObject new_ebmt_cycl) {
        set_ebmt_cycl_justification(ebmt_cycl, union(get_ebmt_cycl_justification(ebmt_cycl), get_ebmt_cycl_justification(new_ebmt_cycl), EQUAL, UNPROVIDED));
        return ebmt_cycl;
    }

    public static SubLObject compose_ebmt_cycl_justifications(final SubLObject ebmt_cycl, final SubLObject new_ebmt_cycl) {
        set_ebmt_cycl_justification(ebmt_cycl, union(get_ebmt_cycl_justification(ebmt_cycl), get_ebmt_cycl_justification(new_ebmt_cycl), EQUAL, UNPROVIDED));
        return ebmt_cycl;
    }

    public static final SubLObject compose_ebmt_cycl_weight_alt(SubLObject ebmt_cycl, SubLObject new_ebmt_cycl) {
        set_ebmt_cycl_weight(ebmt_cycl, union(get_ebmt_cycl_weight(ebmt_cycl), get_ebmt_cycl_weight(new_ebmt_cycl), UNPROVIDED, UNPROVIDED));
        return ebmt_cycl;
    }

    public static SubLObject compose_ebmt_cycl_weight(final SubLObject ebmt_cycl, final SubLObject new_ebmt_cycl) {
        set_ebmt_cycl_weight(ebmt_cycl, union(get_ebmt_cycl_weight(ebmt_cycl), get_ebmt_cycl_weight(new_ebmt_cycl), UNPROVIDED, UNPROVIDED));
        return ebmt_cycl;
    }

    public static final SubLObject ebmt_cycl_subst_alt(SubLObject new_ebmt_cycl, SubLObject old_term, SubLObject old_ebmt_cycl) {
        {
            SubLObject old_cycl = get_ebmt_cycl_cycl(old_ebmt_cycl);
            SubLObject new_cycl = get_ebmt_cycl_cycl(new_ebmt_cycl);
            set_ebmt_cycl_cycl(old_ebmt_cycl, cycl_utilities.expression_subst(new_cycl, old_term, old_cycl, symbol_function(EQUAL), UNPROVIDED));
            compose_ebmt_cycl_justifications(old_ebmt_cycl, new_ebmt_cycl);
            compose_ebmt_cycl_weight(old_ebmt_cycl, new_ebmt_cycl);
        }
        return old_ebmt_cycl;
    }

    public static SubLObject ebmt_cycl_subst(final SubLObject new_ebmt_cycl, final SubLObject old_term, final SubLObject old_ebmt_cycl) {
        final SubLObject old_cycl = get_ebmt_cycl_cycl(old_ebmt_cycl);
        final SubLObject new_cycl = get_ebmt_cycl_cycl(new_ebmt_cycl);
        set_ebmt_cycl_cycl(old_ebmt_cycl, cycl_utilities.expression_subst(new_cycl, old_term, old_cycl, symbol_function(EQUAL), UNPROVIDED));
        compose_ebmt_cycl_justifications(old_ebmt_cycl, new_ebmt_cycl);
        compose_ebmt_cycl_weight(old_ebmt_cycl, new_ebmt_cycl);
        return old_ebmt_cycl;
    }

    public static final SubLObject ebmt_template_parsing_info_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_ebmt_template_parsing_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ebmt_template_parsing_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ebmt_template_parsing_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ebmt_template_parsing_info_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_parsing_info_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject ebmt_template_parsing_info_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_parsing_info_native.class ? T : NIL;
    }

    public static final SubLObject ebmt_template_parsing_info_kw_lw_pairs_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_PARSING_INFO_P);
        return v_object.getField2();
    }

    public static SubLObject ebmt_template_parsing_info_kw_lw_pairs(final SubLObject v_object) {
        assert NIL != ebmt_template_parsing_info_p(v_object) : "! ebmt_template_parser.ebmt_template_parsing_info_p(v_object) " + "ebmt_template_parser.ebmt_template_parsing_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ebmt_template_parsing_info_lw_links_pairs_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_PARSING_INFO_P);
        return v_object.getField3();
    }

    public static SubLObject ebmt_template_parsing_info_lw_links_pairs(final SubLObject v_object) {
        assert NIL != ebmt_template_parsing_info_p(v_object) : "! ebmt_template_parser.ebmt_template_parsing_info_p(v_object) " + "ebmt_template_parser.ebmt_template_parsing_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ebmt_template_parsing_info_lw_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_PARSING_INFO_P);
        return v_object.getField4();
    }

    public static SubLObject ebmt_template_parsing_info_lw(final SubLObject v_object) {
        assert NIL != ebmt_template_parsing_info_p(v_object) : "! ebmt_template_parser.ebmt_template_parsing_info_p(v_object) " + "ebmt_template_parser.ebmt_template_parsing_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ebmt_template_parsing_info_processed_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_PARSING_INFO_P);
        return v_object.getField5();
    }

    public static SubLObject ebmt_template_parsing_info_processed(final SubLObject v_object) {
        assert NIL != ebmt_template_parsing_info_p(v_object) : "! ebmt_template_parser.ebmt_template_parsing_info_p(v_object) " + "ebmt_template_parser.ebmt_template_parsing_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject ebmt_template_parsing_info_cycl_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_PARSING_INFO_P);
        return v_object.getField6();
    }

    public static SubLObject ebmt_template_parsing_info_cycl(final SubLObject v_object) {
        assert NIL != ebmt_template_parsing_info_p(v_object) : "! ebmt_template_parser.ebmt_template_parsing_info_p(v_object) " + "ebmt_template_parser.ebmt_template_parsing_info_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_ebmt_template_parsing_info_kw_lw_pairs_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_PARSING_INFO_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ebmt_template_parsing_info_kw_lw_pairs(final SubLObject v_object, final SubLObject value) {
        assert NIL != ebmt_template_parsing_info_p(v_object) : "! ebmt_template_parser.ebmt_template_parsing_info_p(v_object) " + "ebmt_template_parser.ebmt_template_parsing_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ebmt_template_parsing_info_lw_links_pairs_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_PARSING_INFO_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ebmt_template_parsing_info_lw_links_pairs(final SubLObject v_object, final SubLObject value) {
        assert NIL != ebmt_template_parsing_info_p(v_object) : "! ebmt_template_parser.ebmt_template_parsing_info_p(v_object) " + "ebmt_template_parser.ebmt_template_parsing_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ebmt_template_parsing_info_lw_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_PARSING_INFO_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ebmt_template_parsing_info_lw(final SubLObject v_object, final SubLObject value) {
        assert NIL != ebmt_template_parsing_info_p(v_object) : "! ebmt_template_parser.ebmt_template_parsing_info_p(v_object) " + "ebmt_template_parser.ebmt_template_parsing_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ebmt_template_parsing_info_processed_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_PARSING_INFO_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ebmt_template_parsing_info_processed(final SubLObject v_object, final SubLObject value) {
        assert NIL != ebmt_template_parsing_info_p(v_object) : "! ebmt_template_parser.ebmt_template_parsing_info_p(v_object) " + "ebmt_template_parser.ebmt_template_parsing_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ebmt_template_parsing_info_cycl_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EBMT_TEMPLATE_PARSING_INFO_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ebmt_template_parsing_info_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != ebmt_template_parsing_info_p(v_object) : "! ebmt_template_parser.ebmt_template_parsing_info_p(v_object) " + "ebmt_template_parser.ebmt_template_parsing_info_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_ebmt_template_parsing_info_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_parsing_info_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($KW_LW_PAIRS)) {
                        _csetf_ebmt_template_parsing_info_kw_lw_pairs(v_new, current_value);
                    } else {
                        if (pcase_var.eql($LW_LINKS_PAIRS)) {
                            _csetf_ebmt_template_parsing_info_lw_links_pairs(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LW)) {
                                _csetf_ebmt_template_parsing_info_lw(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PROCESSED)) {
                                    _csetf_ebmt_template_parsing_info_processed(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($CYCL)) {
                                        _csetf_ebmt_template_parsing_info_cycl(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt40$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_ebmt_template_parsing_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_parsing_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($KW_LW_PAIRS)) {
                _csetf_ebmt_template_parsing_info_kw_lw_pairs(v_new, current_value);
            } else
                if (pcase_var.eql($LW_LINKS_PAIRS)) {
                    _csetf_ebmt_template_parsing_info_lw_links_pairs(v_new, current_value);
                } else
                    if (pcase_var.eql($LW)) {
                        _csetf_ebmt_template_parsing_info_lw(v_new, current_value);
                    } else
                        if (pcase_var.eql($PROCESSED)) {
                            _csetf_ebmt_template_parsing_info_processed(v_new, current_value);
                        } else
                            if (pcase_var.eql($CYCL)) {
                                _csetf_ebmt_template_parsing_info_cycl(v_new, current_value);
                            } else {
                                Errors.error($str41$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ebmt_template_parsing_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EBMT_TEMPLATE_PARSING_INFO, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $KW_LW_PAIRS, ebmt_template_parsing_info_kw_lw_pairs(obj));
        funcall(visitor_fn, obj, $SLOT, $LW_LINKS_PAIRS, ebmt_template_parsing_info_lw_links_pairs(obj));
        funcall(visitor_fn, obj, $SLOT, $LW, ebmt_template_parsing_info_lw(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESSED, ebmt_template_parsing_info_processed(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCL, ebmt_template_parsing_info_cycl(obj));
        funcall(visitor_fn, obj, $END, MAKE_EBMT_TEMPLATE_PARSING_INFO, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ebmt_template_parsing_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ebmt_template_parsing_info(obj, visitor_fn);
    }

    public static final SubLObject new_ebmt_template_parsing_info_alt(SubLObject kw_lw_pairs, SubLObject lw_links_pairs, SubLObject lw, SubLObject processed, SubLObject cycl) {
        if (kw_lw_pairs == UNPROVIDED) {
            kw_lw_pairs = NIL;
        }
        if (lw_links_pairs == UNPROVIDED) {
            lw_links_pairs = NIL;
        }
        if (lw == UNPROVIDED) {
            lw = NIL;
        }
        if (processed == UNPROVIDED) {
            processed = NIL;
        }
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        {
            SubLObject template_parsing_info = make_ebmt_template_parsing_info(UNPROVIDED);
            _csetf_ebmt_template_parsing_info_kw_lw_pairs(template_parsing_info, kw_lw_pairs);
            _csetf_ebmt_template_parsing_info_lw_links_pairs(template_parsing_info, lw_links_pairs);
            _csetf_ebmt_template_parsing_info_lw(template_parsing_info, lw);
            _csetf_ebmt_template_parsing_info_processed(template_parsing_info, processed);
            _csetf_ebmt_template_parsing_info_cycl(template_parsing_info, cycl);
            return template_parsing_info;
        }
    }

    public static SubLObject new_ebmt_template_parsing_info(SubLObject kw_lw_pairs, SubLObject lw_links_pairs, SubLObject lw, SubLObject processed, SubLObject cycl) {
        if (kw_lw_pairs == UNPROVIDED) {
            kw_lw_pairs = NIL;
        }
        if (lw_links_pairs == UNPROVIDED) {
            lw_links_pairs = NIL;
        }
        if (lw == UNPROVIDED) {
            lw = NIL;
        }
        if (processed == UNPROVIDED) {
            processed = NIL;
        }
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        final SubLObject template_parsing_info = make_ebmt_template_parsing_info(UNPROVIDED);
        _csetf_ebmt_template_parsing_info_kw_lw_pairs(template_parsing_info, kw_lw_pairs);
        _csetf_ebmt_template_parsing_info_lw_links_pairs(template_parsing_info, lw_links_pairs);
        _csetf_ebmt_template_parsing_info_lw(template_parsing_info, lw);
        _csetf_ebmt_template_parsing_info_processed(template_parsing_info, processed);
        _csetf_ebmt_template_parsing_info_cycl(template_parsing_info, cycl);
        return template_parsing_info;
    }

    public static final SubLObject print_ebmt_template_parsing_info_alt(SubLObject template_parsing_info, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt112$__TEMPLATE_PARSING_INFO______Keyw, new SubLObject[]{ ebmt_template_parsing_info_kw_lw_pairs(template_parsing_info), ebmt_template_parsing_info_lw_links_pairs(template_parsing_info), ebmt_template_parsing_info_lw(template_parsing_info), ebmt_template_parsing_info_processed(template_parsing_info), ebmt_template_parsing_info_cycl(template_parsing_info) });
        return template_parsing_info;
    }

    public static SubLObject print_ebmt_template_parsing_info(final SubLObject template_parsing_info, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str121$__TEMPLATE_PARSING_INFO______Keyw, new SubLObject[]{ ebmt_template_parsing_info_kw_lw_pairs(template_parsing_info), ebmt_template_parsing_info_lw_links_pairs(template_parsing_info), ebmt_template_parsing_info_lw(template_parsing_info), ebmt_template_parsing_info_processed(template_parsing_info), ebmt_template_parsing_info_cycl(template_parsing_info) });
        return template_parsing_info;
    }

    /**
     * Returns an alist where the linkset linkwords are the keys and the linkset
     * links in which they occur are the values.
     *
     * @param LINK-TUPLES
     * 		listp; e.g. (((:VAR1 1) "Ss" ("works" 2))
     * 		(("works" 2) "MVp" ("as" 3))
     * 		(("as" 3) "Js" (:VAR2 5))
     * 		(("a" 4) "Ds" (:VAR2 5)))
     * @return LLW-LL-PAIRS alist-p;
    e.g. ((("a" 4) (("a" 4) "Ds" (:VAR2 5)))
    ((:VAR2 5) (("a" 4) "Ds" (:VAR2 5))
    (("as" 3) "Js" (:VAR2 5)))
    (("as" 3) (("as" 3) "Js" (:VAR2 5))
    (("works" 2) "MVp" ("as" 3)))
    (("works" 2) (("works" 2) "MVp" ("as" 3))
    ((:VAR1 1) "Ss" ("works" 2)))
    ((:VAR1 1) ((:VAR1 1) "Ss" ("works" 2))))
     */
    @LispMethod(comment = "Returns an alist where the linkset linkwords are the keys and the linkset\r\nlinks in which they occur are the values.\r\n\r\n@param LINK-TUPLES\r\n\t\tlistp; e.g. (((:VAR1 1) \"Ss\" (\"works\" 2))\r\n\t\t((\"works\" 2) \"MVp\" (\"as\" 3))\r\n\t\t((\"as\" 3) \"Js\" (:VAR2 5))\r\n\t\t((\"a\" 4) \"Ds\" (:VAR2 5)))\r\n@return LLW-LL-PAIRS alist-p;\r\ne.g. (((\"a\" 4) ((\"a\" 4) \"Ds\" (:VAR2 5)))\r\n((:VAR2 5) ((\"a\" 4) \"Ds\" (:VAR2 5))\r\n((\"as\" 3) \"Js\" (:VAR2 5)))\r\n((\"as\" 3) ((\"as\" 3) \"Js\" (:VAR2 5))\r\n((\"works\" 2) \"MVp\" (\"as\" 3)))\r\n((\"works\" 2) ((\"works\" 2) \"MVp\" (\"as\" 3))\r\n((:VAR1 1) \"Ss\" (\"works\" 2)))\r\n((:VAR1 1) ((:VAR1 1) \"Ss\" (\"works\" 2))))\nReturns an alist where the linkset linkwords are the keys and the linkset\nlinks in which they occur are the values.")
    public static final SubLObject ebmt_linkset_linkword_linkset_links_pairs_alt(SubLObject link_tuples) {
        {
            SubLObject llw_ll_pairs = NIL;
            SubLObject cdolist_list_var = link_tuples;
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject left_word = linkset_link_left_word(tuple);
                    SubLObject right_word = linkset_link_right_word(tuple);
                    llw_ll_pairs = list_utilities.alist_pushnew(llw_ll_pairs, left_word, tuple, EQUAL, EQUAL);
                    llw_ll_pairs = list_utilities.alist_pushnew(llw_ll_pairs, right_word, tuple, EQUAL, EQUAL);
                }
            }
            return llw_ll_pairs;
        }
    }

    @LispMethod(comment = "Returns an alist where the linkset linkwords are the keys and the linkset\r\nlinks in which they occur are the values.\r\n\r\n@param LINK-TUPLES\r\n\t\tlistp; e.g. (((:VAR1 1) \"Ss\" (\"works\" 2))\r\n\t\t((\"works\" 2) \"MVp\" (\"as\" 3))\r\n\t\t((\"as\" 3) \"Js\" (:VAR2 5))\r\n\t\t((\"a\" 4) \"Ds\" (:VAR2 5)))\r\n@return LLW-LL-PAIRS alist-p;\r\ne.g. (((\"a\" 4) ((\"a\" 4) \"Ds\" (:VAR2 5)))\r\n((:VAR2 5) ((\"a\" 4) \"Ds\" (:VAR2 5))\r\n((\"as\" 3) \"Js\" (:VAR2 5)))\r\n((\"as\" 3) ((\"as\" 3) \"Js\" (:VAR2 5))\r\n((\"works\" 2) \"MVp\" (\"as\" 3)))\r\n((\"works\" 2) ((\"works\" 2) \"MVp\" (\"as\" 3))\r\n((:VAR1 1) \"Ss\" (\"works\" 2)))\r\n((:VAR1 1) ((:VAR1 1) \"Ss\" (\"works\" 2))))\nReturns an alist where the linkset linkwords are the keys and the linkset\nlinks in which they occur are the values.")
    public static SubLObject ebmt_linkset_linkword_linkset_links_pairs(final SubLObject link_tuples) {
        SubLObject llw_ll_pairs = NIL;
        SubLObject cdolist_list_var = link_tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject left_word = linkset_link_left_word(tuple);
            final SubLObject right_word = linkset_link_right_word(tuple);
            llw_ll_pairs = list_utilities.alist_pushnew(llw_ll_pairs, left_word, tuple, EQUAL, EQUAL);
            llw_ll_pairs = list_utilities.alist_pushnew(llw_ll_pairs, right_word, tuple, EQUAL, EQUAL);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return llw_ll_pairs;
    }/**
     * Returns an alist where the linkset linkwords are the keys and the linkset
     * links in which they occur are the values.
     *
     * @param LINK-TUPLES
     * 		listp; e.g. (((:VAR1 1) "Ss" ("works" 2))
     * 		(("works" 2) "MVp" ("as" 3))
     * 		(("as" 3) "Js" (:VAR2 5))
     * 		(("a" 4) "Ds" (:VAR2 5)))
     * @return LLW-LL-PAIRS alist-p;
    e.g. ((("a" 4) (("a" 4) "Ds" (:VAR2 5)))
    ((:VAR2 5) (("a" 4) "Ds" (:VAR2 5))
    (("as" 3) "Js" (:VAR2 5)))
    (("as" 3) (("as" 3) "Js" (:VAR2 5))
    (("works" 2) "MVp" ("as" 3)))
    (("works" 2) (("works" 2) "MVp" ("as" 3))
    ((:VAR1 1) "Ss" ("works" 2)))
    ((:VAR1 1) ((:VAR1 1) "Ss" ("works" 2))))
     */


    /**
     * Checks if the input LINKSET-LINK-WORD is more or less equal to LINK-WORD.
     */
    @LispMethod(comment = "Checks if the input LINKSET-LINK-WORD is more or less equal to LINK-WORD.")
    public static final SubLObject ebmt_llw_lw_equalP_alt(SubLObject linkset_link_word, SubLObject link_word, SubLObject linkset_lw_linkset_links_pairs) {
        return subsetp(get_linkset_unindexed_links(list_utilities.alist_lookup(linkset_lw_linkset_links_pairs, linkset_link_word, EQUAL, UNPROVIDED)), get_linkset_unindexed_links(ebmt_linkset_from_linkage_links(methods.funcall_instance_method_with_0_args(link_word, GET_LINKS), UNPROVIDED)), LINK_TUPLE_EQUAL, UNPROVIDED);
    }

    @LispMethod(comment = "Checks if the input LINKSET-LINK-WORD is more or less equal to LINK-WORD.")
    public static SubLObject ebmt_llw_lw_equalP(final SubLObject linkset_link_word, final SubLObject link_word, final SubLObject linkset_lw_linkset_links_pairs) {
        return subsetp(get_linkset_unindexed_links(list_utilities.alist_lookup(linkset_lw_linkset_links_pairs, linkset_link_word, EQUAL, UNPROVIDED)), get_linkset_unindexed_links(ebmt_linkset_from_linkage_links(methods.funcall_instance_method_with_0_args(link_word, GET_LINKS), UNPROVIDED)), LINK_TUPLE_EQUAL, UNPROVIDED);
    }/**
     * Checks if the input LINKSET-LINK-WORD is more or less equal to LINK-WORD.
     */


    public static final SubLObject link_tuple_equal_alt(SubLObject tuple1, SubLObject tuple2) {
        {
            SubLObject mtuple1 = list(tuple1.first(), string_utilities.substring(second(tuple1), ZERO_INTEGER, ONE_INTEGER), third(tuple1));
            SubLObject mtuple2 = list(tuple2.first(), string_utilities.substring(second(tuple2), ZERO_INTEGER, ONE_INTEGER), third(tuple2));
            SubLObject item1 = NIL;
            SubLObject item1_10 = NIL;
            SubLObject item2 = NIL;
            SubLObject item2_11 = NIL;
            for (item1 = mtuple1, item1_10 = item1.first(), item2 = mtuple2, item2_11 = item2.first(); !((NIL == item2) && (NIL == item1)); item1 = item1.rest() , item1_10 = item1.first() , item2 = item2.rest() , item2_11 = item2.first()) {
                if (!((((item1_10.isKeyword() || item2_11.isKeyword()) || (item1_10.equal($$$a) && item2_11.equal($$$an))) || (item1_10.equal($$$an) && item2_11.equal($$$a))) || item1_10.equal(item2_11))) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject link_tuple_equal(final SubLObject tuple1, final SubLObject tuple2) {
        final SubLObject mtuple1 = list(tuple1.first(), string_utilities.substring(second(tuple1), ZERO_INTEGER, ONE_INTEGER), third(tuple1));
        final SubLObject mtuple2 = list(tuple2.first(), string_utilities.substring(second(tuple2), ZERO_INTEGER, ONE_INTEGER), third(tuple2));
        SubLObject item1 = NIL;
        SubLObject item1_$11 = NIL;
        SubLObject item2 = NIL;
        SubLObject item2_$12 = NIL;
        item1 = mtuple1;
        item1_$11 = item1.first();
        item2 = mtuple2;
        item2_$12 = item2.first();
        while ((NIL != item2) || (NIL != item1)) {
            if (((((!item1_$11.isKeyword()) && (!item2_$12.isKeyword())) && ((!item1_$11.equal($$$a)) || (!item2_$12.equal($$$an)))) && ((!item1_$11.equal($$$an)) || (!item2_$12.equal($$$a)))) && (!item1_$11.equal(item2_$12))) {
                return NIL;
            }
            item1 = item1.rest();
            item1_$11 = item1.first();
            item2 = item2.rest();
            item2_$12 = item2.first();
        } 
        return T;
    }

    /**
     * Returns the following:
     * 1. An alist where the keys are keywords (from TEMPLATE-LINKS) and values
     * are corresponding link-words (from LINKAGE).
     * 2. An alist where the keys are link-words (from LINKAGE) and values are the
     * links that should be removed while looking for a phrase that should be
     * parsed to get CycL
     * 3. Error
     *
     * @param TEMPLATE-LINKS
    listp
     * 		
     * @param LINKAGE
    word-linkage-p
     * 		
     */
    @LispMethod(comment = "Returns the following:\r\n1. An alist where the keys are keywords (from TEMPLATE-LINKS) and values\r\nare corresponding link-words (from LINKAGE).\r\n2. An alist where the keys are link-words (from LINKAGE) and values are the\r\nlinks that should be removed while looking for a phrase that should be\r\nparsed to get CycL\r\n3. Error\r\n\r\n@param TEMPLATE-LINKS\nlistp\r\n\t\t\r\n@param LINKAGE\nword-linkage-p\nReturns the following:\n1. An alist where the keys are keywords (from TEMPLATE-LINKS) and values\nare corresponding link-words (from LINKAGE).\n2. An alist where the keys are link-words (from LINKAGE) and values are the\nlinks that should be removed while looking for a phrase that should be\nparsed to get CycL\n3. Error")
    public static final SubLObject ebmt_keyword_linkword_pairs_alt(SubLObject template_links, SubLObject v_linkage) {
        {
            SubLObject link_tuples = template_links;
            SubLObject linkset_lw_linkset_links_pairs = ebmt_linkset_linkword_linkset_links_pairs(link_tuples);
            SubLObject keyword_linkword_pairs = NIL;
            SubLObject linkword_links_pairs = NIL;
            SubLObject linkwords = NIL;
            SubLObject used_links = NIL;
            SubLObject errorP = NIL;
            SubLObject cdolist_list_var = link_tuples;
            SubLObject link_tuple = NIL;
            for (link_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link_tuple = cdolist_list_var.first()) {
                {
                    SubLObject doneP = NIL;
                    SubLObject link = NIL;
                    SubLObject vector_var = instances.get_slot(v_linkage, LINKS);
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject datum = (NIL != backwardP_var) ? ((SubLObject) (list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER))) : list(ZERO_INTEGER, length, ONE_INTEGER);
                    SubLObject current = datum;
                    SubLObject start = NIL;
                    SubLObject end = NIL;
                    SubLObject delta = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    start = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    end = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    delta = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL == doneP) {
                            {
                                SubLObject end_var = end;
                                SubLObject element_num = NIL;
                                for (element_num = start; !((NIL != doneP) || (NIL != subl_macros.do_numbers_endtest(element_num, delta, end_var))); element_num = add(element_num, delta)) {
                                    {
                                        SubLObject l = aref(vector_var, element_num);
                                        if (NIL != l) {
                                            link = l;
                                            if ((NIL == subl_promotions.memberP(link, used_links, UNPROVIDED, UNPROVIDED)) && linkset_link_name(link_tuple).equal(ebmt_link_name(link))) {
                                                {
                                                    SubLObject link_left_word = linkage.link_left_word(link);
                                                    SubLObject link_right_word = linkage.link_right_word(link);
                                                    SubLObject linkset_link_left_word = linkset_link_left_word(link_tuple);
                                                    SubLObject linkset_link_right_word = linkset_link_right_word(link_tuple);
                                                    SubLObject tuple_left_word = linkset_link_left_word_string(link_tuple);
                                                    SubLObject tuple_right_word = linkset_link_right_word_string(link_tuple);
                                                    if (((tuple_left_word.isKeyword() && tuple_right_word.isKeyword()) && (NIL != ebmt_llw_lw_equalP(linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs))) && (NIL != ebmt_llw_lw_equalP(linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs))) {
                                                        keyword_linkword_pairs = list_utilities.alist_pushnew(keyword_linkword_pairs, tuple_left_word, link_left_word, symbol_function(EQL), symbol_function(EQL));
                                                        keyword_linkword_pairs = list_utilities.alist_pushnew(keyword_linkword_pairs, tuple_right_word, link_right_word, symbol_function(EQL), symbol_function(EQL));
                                                        linkword_links_pairs = list_utilities.alist_pushnew(linkword_links_pairs, link_left_word, link, symbol_function(EQL), symbol_function(EQL));
                                                        linkword_links_pairs = list_utilities.alist_pushnew(linkword_links_pairs, link_right_word, link, symbol_function(EQL), symbol_function(EQL));
                                                        doneP = T;
                                                    } else {
                                                        if (tuple_left_word.isKeyword()) {
                                                            if ((tuple_right_word.equal(methods.funcall_instance_method_with_0_args(link_right_word, GET_STRING)) && (NIL != ebmt_llw_lw_equalP(linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs))) && (NIL != ebmt_llw_lw_equalP(linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs))) {
                                                                keyword_linkword_pairs = list_utilities.alist_pushnew(keyword_linkword_pairs, tuple_left_word, link_left_word, symbol_function(EQL), symbol_function(EQL));
                                                                linkword_links_pairs = list_utilities.alist_pushnew(linkword_links_pairs, link_left_word, link, symbol_function(EQL), symbol_function(EQL));
                                                                doneP = T;
                                                            }
                                                        } else {
                                                            if (tuple_right_word.isKeyword()) {
                                                                if ((tuple_left_word.equal(methods.funcall_instance_method_with_0_args(link_left_word, GET_STRING)) && (NIL != ebmt_llw_lw_equalP(linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs))) && (NIL != ebmt_llw_lw_equalP(linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs))) {
                                                                    keyword_linkword_pairs = list_utilities.alist_pushnew(keyword_linkword_pairs, tuple_right_word, link_right_word, symbol_function(EQL), symbol_function(EQL));
                                                                    linkword_links_pairs = list_utilities.alist_pushnew(linkword_links_pairs, link_right_word, link, symbol_function(EQL), symbol_function(EQL));
                                                                    doneP = T;
                                                                }
                                                            } else {
                                                                errorP = T;
                                                                if (((tuple_left_word.equal(methods.funcall_instance_method_with_0_args(link_left_word, GET_STRING)) && tuple_right_word.equal(methods.funcall_instance_method_with_0_args(link_right_word, GET_STRING))) && (NIL != ebmt_llw_lw_equalP(linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs))) && (NIL != ebmt_llw_lw_equalP(linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs))) {
                                                                    errorP = NIL;
                                                                    doneP = T;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (NIL != doneP) {
                                                        used_links = cons(link, used_links);
                                                        {
                                                            SubLObject item_var = link_left_word;
                                                            if (NIL == member(item_var, linkwords, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                linkwords = cons(item_var, linkwords);
                                                            }
                                                        }
                                                        {
                                                            SubLObject item_var = link_right_word;
                                                            if (NIL == member(item_var, linkwords, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                linkwords = cons(item_var, linkwords);
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
                    } else {
                        cdestructuring_bind_error(datum, $list_alt117);
                    }
                    if ((NIL != errorP) || (NIL == doneP)) {
                        return NIL;
                    }
                }
            }
            return values(keyword_linkword_pairs, linkword_links_pairs, linkwords);
        }
    }

    /**
     * Returns the following:
     * 1. An alist where the keys are keywords (from TEMPLATE-LINKS) and values
     * are corresponding link-words (from LINKAGE).
     * 2. An alist where the keys are link-words (from LINKAGE) and values are the
     * links that should be removed while looking for a phrase that should be
     * parsed to get CycL
     * 3. Error
     *
     * @param TEMPLATE-LINKS
    		listp
     * 		
     * @param LINKAGE
    		word-linkage-p
     * 		
     */
    @LispMethod(comment = "Returns the following:\r\n1. An alist where the keys are keywords (from TEMPLATE-LINKS) and values\r\nare corresponding link-words (from LINKAGE).\r\n2. An alist where the keys are link-words (from LINKAGE) and values are the\r\nlinks that should be removed while looking for a phrase that should be\r\nparsed to get CycL\r\n3. Error\r\n\r\n@param TEMPLATE-LINKS\n\t\tlistp\r\n\t\t\r\n@param LINKAGE\n\t\tword-linkage-p\nReturns the following:\n1. An alist where the keys are keywords (from TEMPLATE-LINKS) and values\nare corresponding link-words (from LINKAGE).\n2. An alist where the keys are link-words (from LINKAGE) and values are the\nlinks that should be removed while looking for a phrase that should be\nparsed to get CycL\n3. Error")
    public static SubLObject ebmt_keyword_linkword_pairs(final SubLObject template_links, final SubLObject v_linkage) {
        final SubLObject linkset_lw_linkset_links_pairs = ebmt_linkset_linkword_linkset_links_pairs(template_links);
        SubLObject keyword_linkword_pairs = NIL;
        SubLObject linkword_links_pairs = NIL;
        SubLObject linkwords = NIL;
        SubLObject used_links = NIL;
        SubLObject errorP = NIL;
        SubLObject cdolist_list_var = template_links;
        SubLObject link_tuple = NIL;
        link_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject doneP = NIL;
            SubLObject link = NIL;
            final SubLObject vector_var = instances.get_slot(v_linkage, LINKS);
            final SubLObject backwardP_var = NIL;
            final SubLObject length = length(vector_var);
            SubLObject current;
            final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
            SubLObject start = NIL;
            SubLObject end = NIL;
            SubLObject delta = NIL;
            destructuring_bind_must_consp(current, datum, $list126);
            start = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list126);
            end = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list126);
            delta = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == doneP) {
                    SubLObject end_var;
                    SubLObject element_num;
                    SubLObject l;
                    SubLObject link_left_word;
                    SubLObject link_right_word;
                    SubLObject linkset_link_left_word;
                    SubLObject linkset_link_right_word;
                    SubLObject tuple_left_word;
                    SubLObject tuple_right_word;
                    SubLObject item_var;
                    for (end_var = end, element_num = NIL, element_num = start; (NIL == doneP) && (NIL == subl_macros.do_numbers_endtest(element_num, delta, end_var)); element_num = add(element_num, delta)) {
                        l = aref(vector_var, element_num);
                        if (NIL != l) {
                            link = l;
                            if ((NIL == subl_promotions.memberP(link, used_links, UNPROVIDED, UNPROVIDED)) && linkset_link_name(link_tuple).equal(ebmt_link_name(link))) {
                                link_left_word = linkage.link_left_word(link);
                                link_right_word = linkage.link_right_word(link);
                                linkset_link_left_word = linkset_link_left_word(link_tuple);
                                linkset_link_right_word = linkset_link_right_word(link_tuple);
                                tuple_left_word = linkset_link_left_word_string(link_tuple);
                                tuple_right_word = linkset_link_right_word_string(link_tuple);
                                if (((tuple_left_word.isKeyword() && tuple_right_word.isKeyword()) && (NIL != ebmt_llw_lw_equalP(linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs))) && (NIL != ebmt_llw_lw_equalP(linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs))) {
                                    keyword_linkword_pairs = list_utilities.alist_pushnew(keyword_linkword_pairs, tuple_left_word, link_left_word, symbol_function(EQL), symbol_function(EQL));
                                    keyword_linkword_pairs = list_utilities.alist_pushnew(keyword_linkword_pairs, tuple_right_word, link_right_word, symbol_function(EQL), symbol_function(EQL));
                                    linkword_links_pairs = list_utilities.alist_pushnew(linkword_links_pairs, link_left_word, link, symbol_function(EQL), symbol_function(EQL));
                                    linkword_links_pairs = list_utilities.alist_pushnew(linkword_links_pairs, link_right_word, link, symbol_function(EQL), symbol_function(EQL));
                                    doneP = T;
                                } else
                                    if (tuple_left_word.isKeyword()) {
                                        if ((tuple_right_word.equal(methods.funcall_instance_method_with_0_args(link_right_word, GET_STRING)) && (NIL != ebmt_llw_lw_equalP(linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs))) && (NIL != ebmt_llw_lw_equalP(linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs))) {
                                            keyword_linkword_pairs = list_utilities.alist_pushnew(keyword_linkword_pairs, tuple_left_word, link_left_word, symbol_function(EQL), symbol_function(EQL));
                                            linkword_links_pairs = list_utilities.alist_pushnew(linkword_links_pairs, link_left_word, link, symbol_function(EQL), symbol_function(EQL));
                                            doneP = T;
                                        }
                                    } else
                                        if (tuple_right_word.isKeyword()) {
                                            if ((tuple_left_word.equal(methods.funcall_instance_method_with_0_args(link_left_word, GET_STRING)) && (NIL != ebmt_llw_lw_equalP(linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs))) && (NIL != ebmt_llw_lw_equalP(linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs))) {
                                                keyword_linkword_pairs = list_utilities.alist_pushnew(keyword_linkword_pairs, tuple_right_word, link_right_word, symbol_function(EQL), symbol_function(EQL));
                                                linkword_links_pairs = list_utilities.alist_pushnew(linkword_links_pairs, link_right_word, link, symbol_function(EQL), symbol_function(EQL));
                                                doneP = T;
                                            }
                                        } else {
                                            errorP = T;
                                            if (((tuple_left_word.equal(methods.funcall_instance_method_with_0_args(link_left_word, GET_STRING)) && tuple_right_word.equal(methods.funcall_instance_method_with_0_args(link_right_word, GET_STRING))) && (NIL != ebmt_llw_lw_equalP(linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs))) && (NIL != ebmt_llw_lw_equalP(linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs))) {
                                                errorP = NIL;
                                                doneP = T;
                                            }
                                        }


                                if (NIL != doneP) {
                                    used_links = cons(link, used_links);
                                    item_var = link_left_word;
                                    if (NIL == member(item_var, linkwords, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        linkwords = cons(item_var, linkwords);
                                    }
                                    item_var = link_right_word;
                                    if (NIL == member(item_var, linkwords, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        linkwords = cons(item_var, linkwords);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list126);
            }
            if ((NIL != errorP) || (NIL == doneP)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            link_tuple = cdolist_list_var.first();
        } 
        return values(keyword_linkword_pairs, linkword_links_pairs, linkwords);
    }

    public static final SubLObject ebmt_templates_relevant_to_linkword_alt(SubLObject linkword, SubLObject template_parsing_info_alist) {
        {
            SubLObject templates = NIL;
            SubLObject cdolist_list_var = template_parsing_info_alist;
            SubLObject templateXtemplate_parsing_info = NIL;
            for (templateXtemplate_parsing_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , templateXtemplate_parsing_info = cdolist_list_var.first()) {
                {
                    SubLObject template_parsing_info = templateXtemplate_parsing_info.rest();
                    if ((NIL == ebmt_template_parsing_info_processed(template_parsing_info)) && (NIL != subl_promotions.memberP(linkword, ebmt_template_parsing_info_lw(template_parsing_info), UNPROVIDED, UNPROVIDED))) {
                        templates = cons(templateXtemplate_parsing_info.first(), templates);
                    }
                }
            }
            return templates;
        }
    }

    public static SubLObject ebmt_templates_relevant_to_linkword(final SubLObject linkword, final SubLObject template_parsing_info_alist) {
        SubLObject templates = NIL;
        SubLObject cdolist_list_var = template_parsing_info_alist;
        SubLObject templateXtemplate_parsing_info = NIL;
        templateXtemplate_parsing_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject template_parsing_info = templateXtemplate_parsing_info.rest();
            if ((NIL == ebmt_template_parsing_info_processed(template_parsing_info)) && (NIL != subl_promotions.memberP(linkword, ebmt_template_parsing_info_lw(template_parsing_info), UNPROVIDED, UNPROVIDED))) {
                templates = cons(templateXtemplate_parsing_info.first(), templates);
            }
            cdolist_list_var = cdolist_list_var.rest();
            templateXtemplate_parsing_info = cdolist_list_var.first();
        } 
        return templates;
    }

    public static final SubLObject ebmt_used_linkwords_alt(SubLObject template_parsing_info_alist) {
        {
            SubLObject used_linkwords = NIL;
            SubLObject cdolist_list_var = template_parsing_info_alist;
            SubLObject templateXtemplate_parsing_info = NIL;
            for (templateXtemplate_parsing_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , templateXtemplate_parsing_info = cdolist_list_var.first()) {
                used_linkwords = nunion(used_linkwords, ebmt_template_parsing_info_lw(templateXtemplate_parsing_info.rest()), EQ, UNPROVIDED);
            }
            return used_linkwords;
        }
    }

    public static SubLObject ebmt_used_linkwords(final SubLObject template_parsing_info_alist) {
        SubLObject used_linkwords = NIL;
        SubLObject cdolist_list_var = template_parsing_info_alist;
        SubLObject templateXtemplate_parsing_info = NIL;
        templateXtemplate_parsing_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            used_linkwords = nunion(used_linkwords, ebmt_template_parsing_info_lw(templateXtemplate_parsing_info.rest()), EQ, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            templateXtemplate_parsing_info = cdolist_list_var.first();
        } 
        return used_linkwords;
    }

    public static final SubLObject strings_of_linkwords_alt(SubLObject linkwords) {
        {
            SubLObject strings = NIL;
            SubLObject cdolist_list_var = linkwords;
            SubLObject lw = NIL;
            for (lw = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lw = cdolist_list_var.first()) {
                strings = cons(methods.funcall_instance_method_with_0_args(lw, GET_STRING), strings);
            }
            return nreverse(strings);
        }
    }

    public static SubLObject strings_of_linkwords(final SubLObject linkwords) {
        SubLObject strings = NIL;
        SubLObject cdolist_list_var = linkwords;
        SubLObject lw = NIL;
        lw = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            strings = cons(methods.funcall_instance_method_with_0_args(lw, GET_STRING), strings);
            cdolist_list_var = cdolist_list_var.rest();
            lw = cdolist_list_var.first();
        } 
        return nreverse(strings);
    }

    public static final SubLObject clear_ebmt_cycls_for_phrase_alt() {
        {
            SubLObject cs = $ebmt_cycls_for_phrase_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_ebmt_cycls_for_phrase() {
        final SubLObject cs = $ebmt_cycls_for_phrase_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_ebmt_cycls_for_phrase_alt(SubLObject phrase, SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($ebmt_cycls_for_phrase_caching_state$.getGlobalValue(), list(phrase, category), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_ebmt_cycls_for_phrase(final SubLObject phrase, final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args($ebmt_cycls_for_phrase_caching_state$.getGlobalValue(), list(phrase, category), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ebmt_cycls_for_phrase_internal_alt(SubLObject phrase, SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycls = NIL;
                if (NIL != subl_promotions.memberP(category, $list_alt119, EQ, UNPROVIDED)) {
                    cycls = parsing_utilities.parse_dates_and_numbers(phrase, $list_alt120, NIL, UNPROVIDED, UNPROVIDED);
                    cycls = union(cycls, english_quantity_parser.string_to_quantities(phrase), $sym121$EQUALS_EL_, UNPROVIDED);
                }
                if ((NIL != $ebmt_exclude_predsP$.getDynamicValue(thread)) && (NIL != subl_promotions.memberP(category, $list_alt122, EQ, UNPROVIDED))) {
                    {
                        SubLObject np_cycls = NIL;
                        {
                            SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                            SubLObject _prev_bind_1 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = parsing_vars.$psp_pos_pred_filterP$.currentBinding(thread);
                            SubLObject _prev_bind_3 = parsing_vars.$psp_pos_pred_filter_preds$.currentBinding(thread);
                            try {
                                parsing_vars.$psp_return_mode$.bind($BEST_ONLY, thread);
                                parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
                                parsing_vars.$psp_pos_pred_filterP$.bind(T, thread);
                                parsing_vars.$psp_pos_pred_filter_preds$.bind(cons($$familyName, parsing_vars.$psp_pos_pred_filter_preds$.getDynamicValue(thread)), thread);
                                {
                                    SubLObject timed_outP = NIL;
                                    {
                                        SubLObject _prev_bind_0_12 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                        SubLObject _prev_bind_1_13 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                        SubLObject _prev_bind_2_14 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                        try {
                                            parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                            parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time($ebmt_phrase_interp_timeout$.getDynamicValue(thread)), thread);
                                            parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                            if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                                np_cycls = psp_main.ps_get_cycls_for_np(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                                        } finally {
                                            parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2_14, thread);
                                            parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1_13, thread);
                                            parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_12, thread);
                                        }
                                    }
                                }
                            } finally {
                                parsing_vars.$psp_pos_pred_filter_preds$.rebind(_prev_bind_3, thread);
                                parsing_vars.$psp_pos_pred_filterP$.rebind(_prev_bind_2, thread);
                                parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_1, thread);
                                parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL != np_cycls) {
                            return union(cycls, np_cycls, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                {
                    SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
                    SubLObject _prev_bind_1 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_return_mode$.bind($BEST_ONLY, thread);
                        parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
                        {
                            SubLObject timed_outP = NIL;
                            {
                                SubLObject _prev_bind_0_15 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                SubLObject _prev_bind_1_16 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                try {
                                    parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                    parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time($ebmt_phrase_interp_timeout$.getDynamicValue(thread)), thread);
                                    parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                    parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                    if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                        cycls = union(cycls, psp_main.ps_get_cycls_for_phrase(phrase, category, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                        if (!((NIL != cycls) || (lexicon_utilities.bar_level(category, UNPROVIDED) == TWO_INTEGER))) {
                                            {
                                                SubLObject head_cat = lexicon_utilities.pos_of_cat(category, UNPROVIDED);
                                                SubLObject phrase_cat = list($$PhraseFn, head_cat);
                                                cycls = psp_main.ps_get_cycls_for_phrase(phrase, phrase_cat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                    }
                                    timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                                } finally {
                                    parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2, thread);
                                    parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1_16, thread);
                                    parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_15, thread);
                                }
                            }
                        }
                    } finally {
                        parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_1, thread);
                        parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                return cycls;
            }
        }
    }

    public static SubLObject ebmt_cycls_for_phrase_internal(final SubLObject phrase, final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycls = NIL;
        if (NIL != subl_promotions.memberP(category, $list128, EQ, UNPROVIDED)) {
            cycls = parsing_utilities.parse_dates_and_numbers(phrase, $list129, NIL, UNPROVIDED, UNPROVIDED);
            cycls = union(cycls, english_quantity_parser.string_to_quantities(phrase), $sym130$EQUALS_EL_, UNPROVIDED);
        }
        if ((NIL != $ebmt_exclude_predsP$.getDynamicValue(thread)) && (NIL != subl_promotions.memberP(category, $list131, EQ, UNPROVIDED))) {
            SubLObject np_cycls = NIL;
            final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
            final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = parsing_vars.$psp_pos_pred_filterP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = parsing_vars.$psp_pos_pred_filter_preds$.currentBinding(thread);
            try {
                parsing_vars.$psp_return_mode$.bind($BEST_ONLY, thread);
                parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
                parsing_vars.$psp_pos_pred_filterP$.bind(T, thread);
                parsing_vars.$psp_pos_pred_filter_preds$.bind(cons($$familyName, parsing_vars.$psp_pos_pred_filter_preds$.getDynamicValue(thread)), thread);
                SubLObject timed_outP = NIL;
                final SubLObject _prev_bind_0_$13 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                final SubLObject _prev_bind_1_$14 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$15 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                try {
                    parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                    parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time($ebmt_phrase_interp_timeout$.getDynamicValue(thread)), thread);
                    parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                    parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                    if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                        np_cycls = psp_main.ps_get_cycls_for_np(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                } finally {
                    parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2_$15, thread);
                    parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1_$14, thread);
                    parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_$13, thread);
                }
            } finally {
                parsing_vars.$psp_pos_pred_filter_preds$.rebind(_prev_bind_4, thread);
                parsing_vars.$psp_pos_pred_filterP$.rebind(_prev_bind_3, thread);
                parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
                parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
            }
            if (NIL != np_cycls) {
                return union(cycls, np_cycls, UNPROVIDED, UNPROVIDED);
            }
        }
        final SubLObject _prev_bind_5 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        final SubLObject _prev_bind_6 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind($BEST_ONLY, thread);
            parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
            SubLObject timed_outP2 = NIL;
            final SubLObject _prev_bind_0_$14 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
            final SubLObject _prev_bind_1_$15 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
            try {
                parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time($ebmt_phrase_interp_timeout$.getDynamicValue(thread)), thread);
                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                    cycls = union(cycls, psp_main.ps_get_cycls_for_phrase(phrase, category, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    if ((NIL == cycls) && (!lexicon_utilities.bar_level(category, UNPROVIDED).eql(TWO_INTEGER))) {
                        final SubLObject head_cat = lexicon_utilities.pos_of_cat(category, UNPROVIDED);
                        final SubLObject phrase_cat = list($$PhraseFn, head_cat);
                        cycls = psp_main.ps_get_cycls_for_phrase(phrase, phrase_cat, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                timed_outP2 = parsing_macros.parsing_timeout_time_reachedP();
            } finally {
                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_7, thread);
                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1_$15, thread);
                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_$14, thread);
            }
        } finally {
            parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_6, thread);
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_5, thread);
        }
        return cycls;
    }

    public static final SubLObject ebmt_cycls_for_phrase_alt(SubLObject phrase, SubLObject category) {
        {
            SubLObject caching_state = $ebmt_cycls_for_phrase_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(EBMT_CYCLS_FOR_PHRASE, $ebmt_cycls_for_phrase_caching_state$, $int$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(phrase, category);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw128$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (phrase.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && category.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(ebmt_cycls_for_phrase_internal(phrase, category)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(phrase, category));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject ebmt_cycls_for_phrase(final SubLObject phrase, final SubLObject category) {
        SubLObject caching_state = $ebmt_cycls_for_phrase_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(EBMT_CYCLS_FOR_PHRASE, $ebmt_cycls_for_phrase_caching_state$, $int$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(phrase, category);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (phrase.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && category.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(ebmt_cycls_for_phrase_internal(phrase, category)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(phrase, category));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject ebmt_penntag_to_cycl_category_alt(SubLObject penntag) {
        {
            SubLObject cycl_penntag = parsing_utilities.penntag_to_cycl(princ_to_string(penntag));
            SubLObject category = (NIL != cycl_penntag) ? ((SubLObject) (parsing_utilities.penntag_category(cycl_penntag))) : NIL;
            if (category == $$ProperNoun) {
                category = $$NounPhrase;
            }
            return NIL != category ? ((SubLObject) (category)) : $ANY;
        }
    }

    public static SubLObject ebmt_penntag_to_cycl_category(final SubLObject penntag) {
        final SubLObject cycl_penntag = parsing_utilities.penntag_to_cycl(princ_to_string(penntag));
        SubLObject category = (NIL != cycl_penntag) ? parsing_utilities.penntag_category(cycl_penntag) : NIL;
        if (category.eql($$ProperNoun)) {
            category = $$NounPhrase;
        }
        return NIL != category ? category : $ANY;
    }

    public static final SubLObject ebmt_cycls_using_link_word_only_alt(SubLObject link_word, SubLObject nl_sent, SubLObject used_lw) {
        {
            SubLObject cycls = NIL;
            SubLObject phrase = NIL;
            SubLObject category = NIL;
            SubLObject lw_used = NIL;
            if (NIL != linkage.noun_link_word_p(link_word)) {
                {
                    SubLObject modifiers = remove_if(PREPOSITION_LINK_WORD_P, methods.funcall_instance_method_with_0_args(link_word, GET_MODIFIERS), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    modifiers = set_difference(modifiers, used_lw, symbol_function(EQ), UNPROVIDED);
                    if (NIL != modifiers) {
                        lw_used = cons(link_word, modifiers);
                        phrase = string_utilities.bunge_according_to_string(strings_of_linkwords(Sort.sort(copy_list(lw_used), $sym41$_, GET_LINK_WORD_ABS_INDEX)), nl_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        category = $$NounPhrase;
                        cycls = ebmt_cycls_for_phrase(phrase, category);
                    }
                }
            }
            if (NIL == cycls) {
                phrase = methods.funcall_instance_method_with_0_args(link_word, GET_STRING);
                category = ebmt_penntag_to_cycl_category(methods.funcall_instance_method_with_0_args(link_word, GET_POS));
                cycls = ebmt_cycls_for_phrase(phrase, category);
                lw_used = list(link_word);
            }
            return values(cycls, phrase, category, lw_used);
        }
    }

    public static SubLObject ebmt_cycls_using_link_word_only(final SubLObject link_word, final SubLObject nl_sent, final SubLObject used_lw) {
        SubLObject cycls = NIL;
        SubLObject phrase = NIL;
        SubLObject category = NIL;
        SubLObject lw_used = NIL;
        if (NIL != linkage.noun_link_word_p(link_word)) {
            SubLObject modifiers = remove_if(PREPOSITION_LINK_WORD_P, methods.funcall_instance_method_with_0_args(link_word, GET_MODIFIERS), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            modifiers = set_difference(modifiers, used_lw, symbol_function(EQ), UNPROVIDED);
            if (NIL != modifiers) {
                lw_used = cons(link_word, modifiers);
                phrase = string_utilities.bunge_according_to_string(strings_of_linkwords(Sort.sort(copy_list(lw_used), $sym47$_, GET_LINK_WORD_ABS_INDEX)), nl_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                category = $$NounPhrase;
                cycls = ebmt_cycls_for_phrase(phrase, category);
            }
        }
        if (NIL == cycls) {
            phrase = methods.funcall_instance_method_with_0_args(link_word, GET_STRING);
            category = ebmt_penntag_to_cycl_category(methods.funcall_instance_method_with_0_args(link_word, GET_POS));
            cycls = ebmt_cycls_for_phrase(phrase, category);
            lw_used = list(link_word);
        }
        return values(cycls, phrase, category, lw_used);
    }

    /**
     * Returns a list of EBMT CycLs that represent the link-word LINK-WORD.
     *
     * @param LINK-WORD
    link-word-p;
     * 		
     */
    @LispMethod(comment = "Returns a list of EBMT CycLs that represent the link-word LINK-WORD.\r\n\r\n@param LINK-WORD\nlink-word-p;")
    public static final SubLObject ebmt_cycls_for_link_word_alt(SubLObject link_word, SubLObject template_parsing_info_alist, SubLObject v_linkage, SubLObject nl_sentence, SubLObject used_lw) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject link_phrase = linkage.get_link_phrase(list(link_word));
                SubLObject doneP = NIL;
                SubLObject cycls = NIL;
                while (NIL == doneP) {
                    {
                        SubLObject lp_lw = (NIL != link_phrase) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(link_phrase, YIELD))) : NIL;
                        if (NIL == intersection(used_lw, lp_lw, EQ, UNPROVIDED)) {
                            if (NIL != lp_lw) {
                                if (NIL == subl_promotions.memberP(link_word, lp_lw, UNPROVIDED, UNPROVIDED)) {
                                    link_phrase = link_word;
                                }
                            } else {
                                link_phrase = link_word;
                            }
                            {
                                SubLObject phrase = methods.funcall_instance_method_with_0_args(link_phrase, GET_STRING);
                                SubLObject category = ebmt_penntag_to_cycl_category(methods.funcall_instance_method_with_0_args(link_phrase, GET_CATEGORY));
                                SubLObject lw_used = methods.funcall_instance_method_with_0_args(link_phrase, YIELD);
                                if (NIL != linkage.link_word_p(link_phrase)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject cycls_17 = ebmt_cycls_using_link_word_only(link_word, nl_sentence, used_lw);
                                        SubLObject phrase_18 = thread.secondMultipleValue();
                                        SubLObject category_19 = thread.thirdMultipleValue();
                                        SubLObject lw_used_20 = thread.fourthMultipleValue();
                                        thread.resetMultipleValues();
                                        cycls = cycls_17;
                                        phrase = phrase_18;
                                        category = category_19;
                                        lw_used = lw_used_20;
                                    }
                                    doneP = T;
                                } else {
                                    cycls = ebmt_cycls_for_phrase(phrase, category);
                                }
                                if (NIL != cycls) {
                                    {
                                        SubLObject cdolist_list_var = cycls;
                                        SubLObject cycl = NIL;
                                        for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                                            {
                                                SubLObject item_var = new_ebmt_cycl(cycl, list(list(phrase, category, cycl)), lw_used);
                                                if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    result = cons(item_var, result);
                                                }
                                            }
                                        }
                                    }
                                    doneP = T;
                                }
                            }
                        }
                        if (NIL == doneP) {
                            link_phrase = methods.funcall_instance_method_with_0_args(link_phrase, GET_HEAD_DAUGHTER);
                        }
                    }
                } 
                return result;
            }
        }
    }

    @LispMethod(comment = "Returns a list of EBMT CycLs that represent the link-word LINK-WORD.\r\n\r\n@param LINK-WORD\n\t\tlink-word-p;")
    public static SubLObject ebmt_cycls_for_link_word(final SubLObject link_word, final SubLObject template_parsing_info_alist, final SubLObject v_linkage, final SubLObject nl_sentence, final SubLObject used_lw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject link_phrase = linkage.get_link_phrase(list(link_word));
        SubLObject doneP = NIL;
        SubLObject cycls = NIL;
        while (NIL == doneP) {
            final SubLObject lp_lw = (NIL != link_phrase) ? methods.funcall_instance_method_with_0_args(link_phrase, YIELD) : NIL;
            if (NIL == intersection(used_lw, lp_lw, EQ, UNPROVIDED)) {
                if (NIL != lp_lw) {
                    if (NIL == subl_promotions.memberP(link_word, lp_lw, UNPROVIDED, UNPROVIDED)) {
                        link_phrase = link_word;
                    }
                } else {
                    link_phrase = link_word;
                }
                SubLObject phrase = methods.funcall_instance_method_with_0_args(link_phrase, GET_STRING);
                SubLObject category = ebmt_penntag_to_cycl_category(methods.funcall_instance_method_with_0_args(link_phrase, GET_CATEGORY));
                SubLObject lw_used = methods.funcall_instance_method_with_0_args(link_phrase, YIELD);
                if (NIL != linkage.link_word_p(link_phrase)) {
                    thread.resetMultipleValues();
                    final SubLObject cycls_$18 = ebmt_cycls_using_link_word_only(link_word, nl_sentence, used_lw);
                    final SubLObject phrase_$19 = thread.secondMultipleValue();
                    final SubLObject category_$20 = thread.thirdMultipleValue();
                    final SubLObject lw_used_$21 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    cycls = cycls_$18;
                    phrase = phrase_$19;
                    category = category_$20;
                    lw_used = lw_used_$21;
                    doneP = T;
                } else {
                    cycls = ebmt_cycls_for_phrase(phrase, category);
                }
                if (NIL != cycls) {
                    SubLObject cdolist_list_var = cycls;
                    SubLObject cycl = NIL;
                    cycl = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject item_var = new_ebmt_cycl(cycl, list(list(phrase, category, cycl)), lw_used);
                        if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                            result = cons(item_var, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        cycl = cdolist_list_var.first();
                    } 
                    doneP = T;
                }
            }
            if (NIL == doneP) {
                link_phrase = methods.funcall_instance_method_with_0_args(link_phrase, GET_HEAD_DAUGHTER);
            }
        } 
        return result;
    }/**
     * Returns a list of EBMT CycLs that represent the link-word LINK-WORD.
     *
     * @param LINK-WORD
    		link-word-p;
     * 		
     */


    /**
     * Returns an alist where the keys are keywords and the values are the
     * corresponding CycL terms (generated from the link-word that corresponds to
     * the same keyword)
     *
     * @param KEYWORD-LINKWORD-PAIRS
     * 		alist-p;
     * 		e.g. ((:|Doug Lenat| . #<LW(NNP): Al Gore>)
     * 		(:|Bill Clinton| . #<LW(NNP): George Bush>))
     * @return keyword-cycls-pairs alist-p;
     */
    @LispMethod(comment = "Returns an alist where the keys are keywords and the values are the\r\ncorresponding CycL terms (generated from the link-word that corresponds to\r\nthe same keyword)\r\n\r\n@param KEYWORD-LINKWORD-PAIRS\r\n\t\talist-p;\r\n\t\te.g. ((:|Doug Lenat| . #<LW(NNP): Al Gore>)\r\n\t\t(:|Bill Clinton| . #<LW(NNP): George Bush>))\r\n@return keyword-cycls-pairs alist-p;\nReturns an alist where the keys are keywords and the values are the\ncorresponding CycL terms (generated from the link-word that corresponds to\nthe same keyword)")
    public static final SubLObject ebmt_keyword_cycls_pairs_alt(SubLObject template, SubLObject template_parsing_info_alist, SubLObject v_linkage, SubLObject nl_sentence) {
        {
            SubLObject keyword_cycls_pairs = NIL;
            SubLObject cdolist_list_var = ebmt_template_parsing_info_kw_lw_pairs(list_utilities.alist_lookup(template_parsing_info_alist, template, UNPROVIDED, UNPROVIDED));
            SubLObject keyword_linkword_pair = NIL;
            for (keyword_linkword_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyword_linkword_pair = cdolist_list_var.first()) {
                {
                    SubLObject keyword = keyword_linkword_pair.first();
                    SubLObject linkwords = keyword_linkword_pair.rest();
                    SubLObject already_used_lw = set_difference(ebmt_used_linkwords(template_parsing_info_alist), linkwords, EQ, UNPROVIDED);
                    SubLObject ebmt_cycls = NIL;
                    SubLObject cdolist_list_var_21 = linkwords;
                    SubLObject link_word = NIL;
                    for (link_word = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , link_word = cdolist_list_var_21.first()) {
                        ebmt_cycls = union(ebmt_cycls, ebmt_cycls_for_link_word(link_word, template_parsing_info_alist, v_linkage, nl_sentence, already_used_lw), UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL == ebmt_cycls) {
                        return NIL;
                    }
                    keyword_cycls_pairs = acons(keyword, list(ebmt_cycls), keyword_cycls_pairs);
                }
            }
            return keyword_cycls_pairs;
        }
    }

    @LispMethod(comment = "Returns an alist where the keys are keywords and the values are the\r\ncorresponding CycL terms (generated from the link-word that corresponds to\r\nthe same keyword)\r\n\r\n@param KEYWORD-LINKWORD-PAIRS\r\n\t\talist-p;\r\n\t\te.g. ((:|Doug Lenat| . #<LW(NNP): Al Gore>)\r\n\t\t(:|Bill Clinton| . #<LW(NNP): George Bush>))\r\n@return keyword-cycls-pairs alist-p;\nReturns an alist where the keys are keywords and the values are the\ncorresponding CycL terms (generated from the link-word that corresponds to\nthe same keyword)")
    public static SubLObject ebmt_keyword_cycls_pairs(final SubLObject template, final SubLObject template_parsing_info_alist, final SubLObject v_linkage, final SubLObject nl_sentence) {
        SubLObject keyword_cycls_pairs = NIL;
        SubLObject cdolist_list_var = ebmt_template_parsing_info_kw_lw_pairs(list_utilities.alist_lookup(template_parsing_info_alist, template, UNPROVIDED, UNPROVIDED));
        SubLObject keyword_linkword_pair = NIL;
        keyword_linkword_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject keyword = keyword_linkword_pair.first();
            final SubLObject linkwords = keyword_linkword_pair.rest();
            final SubLObject already_used_lw = set_difference(ebmt_used_linkwords(template_parsing_info_alist), linkwords, EQ, UNPROVIDED);
            SubLObject ebmt_cycls = NIL;
            SubLObject cdolist_list_var_$22 = linkwords;
            SubLObject link_word = NIL;
            link_word = cdolist_list_var_$22.first();
            while (NIL != cdolist_list_var_$22) {
                ebmt_cycls = union(ebmt_cycls, ebmt_cycls_for_link_word(link_word, template_parsing_info_alist, v_linkage, nl_sentence, already_used_lw), UNPROVIDED, UNPROVIDED);
                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                link_word = cdolist_list_var_$22.first();
            } 
            if (NIL == ebmt_cycls) {
                return NIL;
            }
            keyword_cycls_pairs = acons(keyword, list(ebmt_cycls), keyword_cycls_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            keyword_linkword_pair = cdolist_list_var.first();
        } 
        return keyword_cycls_pairs;
    }/**
     * Returns an alist where the keys are keywords and the values are the
     * corresponding CycL terms (generated from the link-word that corresponds to
     * the same keyword)
     *
     * @param KEYWORD-LINKWORD-PAIRS
     * 		alist-p;
     * 		e.g. ((:|Doug Lenat| . #<LW(NNP): Al Gore>)
     * 		(:|Bill Clinton| . #<LW(NNP): George Bush>))
     * @return keyword-cycls-pairs alist-p;
     */


    /**
     * Removes CycL expressions that contain keywords
     */
    @LispMethod(comment = "Removes CycL expressions that contain keywords")
    public static final SubLObject ebmt_remove_invalid_cycls_alt(SubLObject ebmt_cycls) {
        {
            SubLObject valid_ebmt_cycls = NIL;
            SubLObject cdolist_list_var = ebmt_cycls;
            SubLObject ebmt_cycl = NIL;
            for (ebmt_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ebmt_cycl = cdolist_list_var.first()) {
                {
                    SubLObject cycl = get_ebmt_cycl_cycl(ebmt_cycl);
                    if (NIL == cycl_utilities.expression_find_if(KEYWORDP, cycl, UNPROVIDED, UNPROVIDED)) {
                        valid_ebmt_cycls = cons(ebmt_cycl, valid_ebmt_cycls);
                    }
                }
            }
            return valid_ebmt_cycls;
        }
    }

    @LispMethod(comment = "Removes CycL expressions that contain keywords")
    public static SubLObject ebmt_remove_invalid_cycls(final SubLObject ebmt_cycls) {
        SubLObject valid_ebmt_cycls = NIL;
        SubLObject cdolist_list_var = ebmt_cycls;
        SubLObject ebmt_cycl = NIL;
        ebmt_cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cycl = get_ebmt_cycl_cycl(ebmt_cycl);
            if (NIL == cycl_utilities.expression_find_if(KEYWORDP, cycl, UNPROVIDED, UNPROVIDED)) {
                valid_ebmt_cycls = cons(ebmt_cycl, valid_ebmt_cycls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ebmt_cycl = cdolist_list_var.first();
        } 
        return valid_ebmt_cycls;
    }/**
     * Removes CycL expressions that contain keywords
     */


    /**
     * Returns the various parses (or parts of parses) along with the corresponding
     * list of link-words that are used to get that particular parse(-part), using a
     * particular TEMPLATE.
     *
     * @param TEMPLATE
    ebmt-template-p;
     * 		
     * @param LINKAGE
    linkage-p;
     * 		
     * @param WITH-VARS?
    booleanp;
     * 		
     * @param NL-SENTENCE
    stringp;
     * 		
     */
    @LispMethod(comment = "Returns the various parses (or parts of parses) along with the corresponding\r\nlist of link-words that are used to get that particular parse(-part), using a\r\nparticular TEMPLATE.\r\n\r\n@param TEMPLATE\nebmt-template-p;\r\n\t\t\r\n@param LINKAGE\nlinkage-p;\r\n\t\t\r\n@param WITH-VARS?\nbooleanp;\r\n\t\t\r\n@param NL-SENTENCE\nstringp;\nReturns the various parses (or parts of parses) along with the corresponding\nlist of link-words that are used to get that particular parse(-part), using a\nparticular TEMPLATE.")
    public static final SubLObject ebmt_parses_using_template_alt(SubLObject template, SubLObject template_parsing_info_alist, SubLObject v_linkage, SubLObject with_varsP, SubLObject nl_sentence) {
        {
            SubLObject template_parsing_info = list_utilities.alist_lookup(template_parsing_info_alist, template, UNPROVIDED, UNPROVIDED);
            SubLObject ebmt_cycls = list(new_ebmt_cycl(ebmt_template_cycl(template), ebmt_template_justification(template), ebmt_template_parsing_info_lw(template_parsing_info)));
            _csetf_ebmt_template_parsing_info_processed(template_parsing_info, T);
            if ((NIL != with_varsP) && (NIL != ebmt_template_parsing_info_kw_lw_pairs(template_parsing_info))) {
                {
                    SubLObject keyword_cycls_pairs = ebmt_keyword_cycls_pairs(template, template_parsing_info_alist, v_linkage, nl_sentence);
                    SubLObject cdolist_list_var = keyword_cycls_pairs;
                    SubLObject keyword_cycls_pair = NIL;
                    for (keyword_cycls_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyword_cycls_pair = cdolist_list_var.first()) {
                        {
                            SubLObject kw_cycls_pair_value = keyword_cycls_pair.rest();
                            SubLObject ans_cycls = NIL;
                            SubLObject cdolist_list_var_22 = ebmt_cycls;
                            SubLObject ebmt_cycl = NIL;
                            for (ebmt_cycl = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , ebmt_cycl = cdolist_list_var_22.first()) {
                                {
                                    SubLObject cdolist_list_var_23 = kw_cycls_pair_value.first();
                                    SubLObject cycl_subst = NIL;
                                    for (cycl_subst = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest() , cycl_subst = cdolist_list_var_23.first()) {
                                        ans_cycls = cons(ebmt_cycl_subst(cycl_subst, keyword_cycls_pair.first(), copy_ebmt_cycl(ebmt_cycl)), ans_cycls);
                                    }
                                }
                            }
                            ebmt_cycls = ans_cycls;
                        }
                    }
                }
            }
            ebmt_cycls = ebmt_remove_invalid_cycls(ebmt_cycls);
            if (NIL == ebmt_cycls) {
                Errors.error($str_alt139$Unable_to_understand_some_of_the_);
            }
            _csetf_ebmt_template_parsing_info_cycl(template_parsing_info, ebmt_cycls);
            return ebmt_cycls;
        }
    }

    @LispMethod(comment = "Returns the various parses (or parts of parses) along with the corresponding\r\nlist of link-words that are used to get that particular parse(-part), using a\r\nparticular TEMPLATE.\r\n\r\n@param TEMPLATE\n\t\tebmt-template-p;\r\n\t\t\r\n@param LINKAGE\n\t\tlinkage-p;\r\n\t\t\r\n@param WITH-VARS?\n\t\tbooleanp;\r\n\t\t\r\n@param NL-SENTENCE\n\t\tstringp;\nReturns the various parses (or parts of parses) along with the corresponding\nlist of link-words that are used to get that particular parse(-part), using a\nparticular TEMPLATE.")
    public static SubLObject ebmt_parses_using_template(final SubLObject template, final SubLObject template_parsing_info_alist, final SubLObject v_linkage, final SubLObject with_varsP, final SubLObject nl_sentence) {
        final SubLObject template_parsing_info = list_utilities.alist_lookup(template_parsing_info_alist, template, UNPROVIDED, UNPROVIDED);
        SubLObject ebmt_cycls = list(new_ebmt_cycl(ebmt_template_cycl(template), ebmt_template_justification(template), ebmt_template_parsing_info_lw(template_parsing_info)));
        _csetf_ebmt_template_parsing_info_processed(template_parsing_info, T);
        if ((NIL != with_varsP) && (NIL != ebmt_template_parsing_info_kw_lw_pairs(template_parsing_info))) {
            SubLObject cdolist_list_var;
            final SubLObject keyword_cycls_pairs = cdolist_list_var = ebmt_keyword_cycls_pairs(template, template_parsing_info_alist, v_linkage, nl_sentence);
            SubLObject keyword_cycls_pair = NIL;
            keyword_cycls_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject kw_cycls_pair_value = keyword_cycls_pair.rest();
                SubLObject ans_cycls = NIL;
                SubLObject cdolist_list_var_$23 = ebmt_cycls;
                SubLObject ebmt_cycl = NIL;
                ebmt_cycl = cdolist_list_var_$23.first();
                while (NIL != cdolist_list_var_$23) {
                    SubLObject cdolist_list_var_$24 = kw_cycls_pair_value.first();
                    SubLObject cycl_subst = NIL;
                    cycl_subst = cdolist_list_var_$24.first();
                    while (NIL != cdolist_list_var_$24) {
                        ans_cycls = cons(ebmt_cycl_subst(cycl_subst, keyword_cycls_pair.first(), copy_ebmt_cycl(ebmt_cycl)), ans_cycls);
                        cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                        cycl_subst = cdolist_list_var_$24.first();
                    } 
                    cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                    ebmt_cycl = cdolist_list_var_$23.first();
                } 
                ebmt_cycls = ans_cycls;
                cdolist_list_var = cdolist_list_var.rest();
                keyword_cycls_pair = cdolist_list_var.first();
            } 
        }
        ebmt_cycls = ebmt_remove_invalid_cycls(ebmt_cycls);
        if (NIL == ebmt_cycls) {
            Errors.error($str147$Unable_to_understand_some_of_the_);
        }
        _csetf_ebmt_template_parsing_info_cycl(template_parsing_info, ebmt_cycls);
        return ebmt_cycls;
    }/**
     * Returns the various parses (or parts of parses) along with the corresponding
     * list of link-words that are used to get that particular parse(-part), using a
     * particular TEMPLATE.
     *
     * @param TEMPLATE
    		ebmt-template-p;
     * 		
     * @param LINKAGE
    		linkage-p;
     * 		
     * @param WITH-VARS?
    		booleanp;
     * 		
     * @param NL-SENTENCE
    		stringp;
     * 		
     */


    public static final SubLObject ebmt_template_parsing_info_alist_alt(SubLObject templates, SubLObject v_linkage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_parsing_info_alist = NIL;
                SubLObject cdolist_list_var = templates;
                SubLObject template = NIL;
                for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                    {
                        SubLObject template_links = ebmt_template_links(template);
                        if (length(instances.get_slot(v_linkage, LINKS)).numGE(add(length(template_links), TWO_INTEGER))) {
                            thread.resetMultipleValues();
                            {
                                SubLObject keyword_linkword_pairs = ebmt_keyword_linkword_pairs(remove_duplicates(template_links, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED), v_linkage);
                                SubLObject linkword_links_pairs = thread.secondMultipleValue();
                                SubLObject linkwords = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if ((NIL != keyword_linkword_pairs) || (NIL == cycl_utilities.expression_find_if(KEYWORDP, ebmt_template_cycl(template), UNPROVIDED, UNPROVIDED))) {
                                    template_parsing_info_alist = acons(template, new_ebmt_template_parsing_info(keyword_linkword_pairs, linkword_links_pairs, linkwords, UNPROVIDED, UNPROVIDED), template_parsing_info_alist);
                                }
                            }
                        }
                    }
                }
                return template_parsing_info_alist;
            }
        }
    }

    public static SubLObject ebmt_template_parsing_info_alist(final SubLObject templates, final SubLObject v_linkage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template_parsing_info_alist = NIL;
        SubLObject cdolist_list_var = templates;
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject template_links = ebmt_template_links(template);
            if (length(instances.get_slot(v_linkage, LINKS)).numGE(add(length(template_links), TWO_INTEGER))) {
                thread.resetMultipleValues();
                final SubLObject keyword_linkword_pairs = ebmt_keyword_linkword_pairs(remove_duplicates(template_links, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED), v_linkage);
                final SubLObject linkword_links_pairs = thread.secondMultipleValue();
                final SubLObject linkwords = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != keyword_linkword_pairs) || (NIL == cycl_utilities.expression_find_if(KEYWORDP, ebmt_template_cycl(template), UNPROVIDED, UNPROVIDED))) {
                    template_parsing_info_alist = acons(template, new_ebmt_template_parsing_info(keyword_linkword_pairs, linkword_links_pairs, linkwords, UNPROVIDED, UNPROVIDED), template_parsing_info_alist);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        return template_parsing_info_alist;
    }

    /**
     * Returns the various parses (or parts of parses) along with the corresponding
     * list of link-words that are used to get that particular parse(-part).
     *
     * @param LINKAGE
    linkage-p;
     * 		
     * @param WITH-VARS?
    booleanp;
     * 		
     */
    @LispMethod(comment = "Returns the various parses (or parts of parses) along with the corresponding\r\nlist of link-words that are used to get that particular parse(-part).\r\n\r\n@param LINKAGE\nlinkage-p;\r\n\t\t\r\n@param WITH-VARS?\nbooleanp;\nReturns the various parses (or parts of parses) along with the corresponding\nlist of link-words that are used to get that particular parse(-part).")
    public static final SubLObject ebmt_parse_parts_alt(SubLObject v_linkage, SubLObject with_varsP, SubLObject lexicon, SubLObject nl_sentence) {
        {
            SubLObject templates = ebmt_find_templates_for_linkage(v_linkage, with_varsP, lexicon);
            SubLObject template_parsing_info_alist = ebmt_template_parsing_info_alist(templates, v_linkage);
            SubLObject all_cycls = NIL;
            templates = list_utilities.alist_keys(template_parsing_info_alist);
            if (NIL != templates) {
                while (NIL != templates) {
                    {
                        SubLObject template = templates.first();
                        SubLObject template_parsing_info = list_utilities.alist_lookup(template_parsing_info_alist, template, UNPROVIDED, UNPROVIDED);
                        SubLObject ebmt_cycls = NIL;
                        if (NIL != ebmt_template_parsing_info_processed(template_parsing_info)) {
                            ebmt_cycls = ebmt_template_parsing_info_cycl(template_parsing_info);
                        } else {
                            ebmt_cycls = ebmt_parses_using_template(template, template_parsing_info_alist, v_linkage, with_varsP, nl_sentence);
                        }
                        if (NIL != ebmt_cycls) {
                            all_cycls = cconcatenate(all_cycls, ebmt_cycls);
                        }
                    }
                    templates = templates.rest();
                } 
                return values(all_cycls, NIL);
            }
        }
        return values(NIL, $str_alt140$No_matching_templates_found_);
    }

    @LispMethod(comment = "Returns the various parses (or parts of parses) along with the corresponding\r\nlist of link-words that are used to get that particular parse(-part).\r\n\r\n@param LINKAGE\n\t\tlinkage-p;\r\n\t\t\r\n@param WITH-VARS?\n\t\tbooleanp;\nReturns the various parses (or parts of parses) along with the corresponding\nlist of link-words that are used to get that particular parse(-part).")
    public static SubLObject ebmt_parse_parts(final SubLObject v_linkage, final SubLObject with_varsP, final SubLObject lexicon, final SubLObject nl_sentence) {
        SubLObject templates = ebmt_find_templates_for_linkage(v_linkage, with_varsP, lexicon);
        final SubLObject template_parsing_info_alist = ebmt_template_parsing_info_alist(templates, v_linkage);
        SubLObject all_cycls = NIL;
        templates = list_utilities.alist_keys(template_parsing_info_alist);
        if (NIL != templates) {
            while (NIL != templates) {
                final SubLObject template = templates.first();
                final SubLObject template_parsing_info = list_utilities.alist_lookup(template_parsing_info_alist, template, UNPROVIDED, UNPROVIDED);
                SubLObject ebmt_cycls = NIL;
                if (NIL != ebmt_template_parsing_info_processed(template_parsing_info)) {
                    ebmt_cycls = ebmt_template_parsing_info_cycl(template_parsing_info);
                } else {
                    ebmt_cycls = ebmt_parses_using_template(template, template_parsing_info_alist, v_linkage, with_varsP, nl_sentence);
                }
                if (NIL != ebmt_cycls) {
                    all_cycls = cconcatenate(all_cycls, ebmt_cycls);
                }
                templates = templates.rest();
            } 
            return values(all_cycls, NIL);
        }
        return values(NIL, $str148$No_matching_templates_found_);
    }/**
     * Returns the various parses (or parts of parses) along with the corresponding
     * list of link-words that are used to get that particular parse(-part).
     *
     * @param LINKAGE
    		linkage-p;
     * 		
     * @param WITH-VARS?
    		booleanp;
     * 		
     */


    /**
     * Returns the various CycL parts that should be combined to get the final
     * parses.  All the CycL parts that have corresponding link-word sets that are
     * subsumed by some other link-word set are removed.
     */
    @LispMethod(comment = "Returns the various CycL parts that should be combined to get the final\r\nparses.  All the CycL parts that have corresponding link-word sets that are\r\nsubsumed by some other link-word set are removed.\nReturns the various CycL parts that should be combined to get the final\nparses.  All the CycL parts that have corresponding link-word sets that are\nsubsumed by some other link-word set are removed.")
    public static final SubLObject ebmt_relevant_cycl_parts_alt(SubLObject parse_parts, SubLObject wff_check_mt) {
        {
            SubLObject unique_linkages = NIL;
            SubLObject lw_cycl_pairs = NIL;
            SubLObject cdolist_list_var = parse_parts;
            SubLObject part = NIL;
            for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                {
                    SubLObject doneP = NIL;
                    if (NIL != wff_check_mt) {
                        if (NIL == cyclifier.cyclifier_wffP(get_ebmt_cycl_cycl(part), UNPROVIDED)) {
                            doneP = T;
                        }
                    }
                    if (NIL == doneP) {
                        {
                            SubLObject v_linkage = get_ebmt_cycl_weight(part);
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = unique_linkages;
                                    SubLObject unique_linkage = NIL;
                                    for (unique_linkage = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , unique_linkage = csome_list_var.first()) {
                                        if (NIL != subsetp(v_linkage, unique_linkage, UNPROVIDED, UNPROVIDED)) {
                                            if (NIL != subsetp(unique_linkage, v_linkage, UNPROVIDED, UNPROVIDED)) {
                                                lw_cycl_pairs = list_utilities.alist_push(lw_cycl_pairs, v_linkage, part, $sym141$SETS_EQUAL_);
                                            }
                                            doneP = T;
                                        } else {
                                            if (NIL != subsetp(unique_linkage, v_linkage, UNPROVIDED, UNPROVIDED)) {
                                                lw_cycl_pairs = list_utilities.alist_delete(lw_cycl_pairs, unique_linkage, $sym141$SETS_EQUAL_);
                                                lw_cycl_pairs = list_utilities.alist_push(lw_cycl_pairs, v_linkage, part, $sym141$SETS_EQUAL_);
                                                doneP = T;
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL == doneP) {
                                lw_cycl_pairs = list_utilities.alist_push(lw_cycl_pairs, v_linkage, part, $sym141$SETS_EQUAL_);
                            }
                        }
                    }
                }
                unique_linkages = list_utilities.alist_keys(lw_cycl_pairs);
            }
            return list_utilities.alist_values(lw_cycl_pairs);
        }
    }

    @LispMethod(comment = "Returns the various CycL parts that should be combined to get the final\r\nparses.  All the CycL parts that have corresponding link-word sets that are\r\nsubsumed by some other link-word set are removed.\nReturns the various CycL parts that should be combined to get the final\nparses.  All the CycL parts that have corresponding link-word sets that are\nsubsumed by some other link-word set are removed.")
    public static SubLObject ebmt_relevant_cycl_parts(final SubLObject parse_parts, final SubLObject wff_check_mt) {
        SubLObject unique_linkages = NIL;
        SubLObject lw_cycl_pairs = NIL;
        SubLObject cdolist_list_var = parse_parts;
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject doneP = NIL;
            if ((NIL != wff_check_mt) && (NIL == cyclifier.cyclifier_wffP(get_ebmt_cycl_cycl(part), UNPROVIDED))) {
                doneP = T;
            }
            if (NIL == doneP) {
                final SubLObject v_linkage = get_ebmt_cycl_weight(part);
                if (NIL == doneP) {
                    SubLObject csome_list_var = unique_linkages;
                    SubLObject unique_linkage = NIL;
                    unique_linkage = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        if (NIL != subsetp(v_linkage, unique_linkage, UNPROVIDED, UNPROVIDED)) {
                            if (NIL != subsetp(unique_linkage, v_linkage, UNPROVIDED, UNPROVIDED)) {
                                lw_cycl_pairs = list_utilities.alist_push(lw_cycl_pairs, v_linkage, part, $sym149$SETS_EQUAL_);
                            }
                            doneP = T;
                        } else
                            if (NIL != subsetp(unique_linkage, v_linkage, UNPROVIDED, UNPROVIDED)) {
                                lw_cycl_pairs = list_utilities.alist_delete(lw_cycl_pairs, unique_linkage, $sym149$SETS_EQUAL_);
                                lw_cycl_pairs = list_utilities.alist_push(lw_cycl_pairs, v_linkage, part, $sym149$SETS_EQUAL_);
                                doneP = T;
                            }

                        csome_list_var = csome_list_var.rest();
                        unique_linkage = csome_list_var.first();
                    } 
                }
                if (NIL == doneP) {
                    lw_cycl_pairs = list_utilities.alist_push(lw_cycl_pairs, v_linkage, part, $sym149$SETS_EQUAL_);
                }
            }
            unique_linkages = list_utilities.alist_keys(lw_cycl_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        return list_utilities.alist_values(lw_cycl_pairs);
    }/**
     * Returns the various CycL parts that should be combined to get the final
     * parses.  All the CycL parts that have corresponding link-word sets that are
     * subsumed by some other link-word set are removed.
     */


    public static final SubLObject conjoin_ebmt_cycls_alt(SubLObject ebmt_cycls) {
        {
            SubLObject final_ebmt_cycl = copy_ebmt_cycl(ebmt_cycls.first());
            SubLObject cdolist_list_var = ebmt_cycls.rest();
            SubLObject ebmt_cycl = NIL;
            for (ebmt_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ebmt_cycl = cdolist_list_var.first()) {
                set_ebmt_cycl_cycl(final_ebmt_cycl, simplifier.conjoin(list(get_ebmt_cycl_cycl(final_ebmt_cycl), get_ebmt_cycl_cycl(ebmt_cycl)), T));
                set_ebmt_cycl_justification(final_ebmt_cycl, get_ebmt_cycl_justification(compose_ebmt_cycl_justifications(final_ebmt_cycl, ebmt_cycl)));
                set_ebmt_cycl_weight(final_ebmt_cycl, get_ebmt_cycl_weight(compose_ebmt_cycl_weight(final_ebmt_cycl, ebmt_cycl)));
            }
            return final_ebmt_cycl;
        }
    }

    public static SubLObject conjoin_ebmt_cycls(final SubLObject ebmt_cycls) {
        final SubLObject final_ebmt_cycl = copy_ebmt_cycl(ebmt_cycls.first());
        SubLObject cdolist_list_var = ebmt_cycls.rest();
        SubLObject ebmt_cycl = NIL;
        ebmt_cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set_ebmt_cycl_cycl(final_ebmt_cycl, simplifier.conjoin(list(get_ebmt_cycl_cycl(final_ebmt_cycl), get_ebmt_cycl_cycl(ebmt_cycl)), T));
            set_ebmt_cycl_justification(final_ebmt_cycl, get_ebmt_cycl_justification(compose_ebmt_cycl_justifications(final_ebmt_cycl, ebmt_cycl)));
            set_ebmt_cycl_weight(final_ebmt_cycl, get_ebmt_cycl_weight(compose_ebmt_cycl_weight(final_ebmt_cycl, ebmt_cycl)));
            cdolist_list_var = cdolist_list_var.rest();
            ebmt_cycl = cdolist_list_var.first();
        } 
        return final_ebmt_cycl;
    }

    /**
     * The parses that are obtained by merging the various parse-parts.
     */
    @LispMethod(comment = "The parses that are obtained by merging the various parse-parts.")
    public static final SubLObject ebmt_merge_parse_parts_alt(SubLObject parse_parts, SubLObject wff_check_mt) {
        {
            SubLObject cycl_parts = ebmt_relevant_cycl_parts(parse_parts, wff_check_mt);
            SubLObject parses = NIL;
            SubLObject cdolist_list_var = list_utilities.cross_products(cycl_parts);
            SubLObject cycl = NIL;
            for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                {
                    SubLObject parse = (NIL != list_utilities.singletonP(cycl)) ? ((SubLObject) (cycl.first())) : conjoin_ebmt_cycls(cycl);
                    if (NIL != wff_check_mt) {
                        if (NIL != cyclifier.cyclifier_wffP(get_ebmt_cycl_cycl(parse), UNPROVIDED)) {
                            parses = cons(parse, parses);
                        }
                    } else {
                        parses = cons(parse, parses);
                    }
                }
            }
            return parses;
        }
    }

    @LispMethod(comment = "The parses that are obtained by merging the various parse-parts.")
    public static SubLObject ebmt_merge_parse_parts(final SubLObject parse_parts, final SubLObject wff_check_mt) {
        final SubLObject cycl_parts = ebmt_relevant_cycl_parts(parse_parts, wff_check_mt);
        SubLObject parses = NIL;
        SubLObject cdolist_list_var = list_utilities.cross_products(cycl_parts);
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject parse = (NIL != list_utilities.singletonP(cycl)) ? cycl.first() : conjoin_ebmt_cycls(cycl);
            if (NIL != wff_check_mt) {
                if (NIL != cyclifier.cyclifier_wffP(get_ebmt_cycl_cycl(parse), UNPROVIDED)) {
                    parses = cons(parse, parses);
                }
            } else {
                parses = cons(parse, parses);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        return parses;
    }/**
     * The parses that are obtained by merging the various parse-parts.
     */


    /**
     * Parse the string SENT using EBMT Cyclification.  Returns the following:
     * - List of CycL parses
     * - List of justifications
     * - List of weights (coverage info)
     * - Error message, if any
     */
    @LispMethod(comment = "Parse the string SENT using EBMT Cyclification.  Returns the following:\r\n- List of CycL parses\r\n- List of justifications\r\n- List of weights (coverage info)\r\n- Error message, if any\nParse the string SENT using EBMT Cyclification.  Returns the following:\n- List of CycL parses\n- List of justifications\n- List of weights (coverage info)\n- Error message, if any")
    public static final SubLObject ebmt_parse_alt(SubLObject sent, SubLObject lexicon, SubLObject semantic_mt) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = $$InferencePSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sent, STRINGP);
            {
                SubLObject err_msg = NIL;
                SubLObject v_linkage = NIL;
                SubLObject cycls = NIL;
                SubLObject justifications = NIL;
                SubLObject weights = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                v_linkage = linkage.new_linkage(string_utilities.strip_sentential_punctuation(sent), list($LEXICON, lexicon));
                                if (NIL == v_linkage) {
                                    Errors.error($str_alt142$Failed_to_compute_a_linkage_for__, sent);
                                }
                                thread.resetMultipleValues();
                                {
                                    SubLObject cycls_24 = ebmt_parse_linkage(v_linkage, sent, lexicon, semantic_mt);
                                    SubLObject justifications_25 = thread.secondMultipleValue();
                                    SubLObject weights_26 = thread.thirdMultipleValue();
                                    SubLObject err_msg_27 = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    cycls = cycls_24;
                                    justifications = justifications_25;
                                    weights = weights_26;
                                    err_msg = err_msg_27;
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != err_msg) {
                    return values(NIL, NIL, NIL, err_msg);
                }
                return values(cycls, justifications, weights);
            }
        }
    }

    @LispMethod(comment = "Parse the string SENT using EBMT Cyclification.  Returns the following:\r\n- List of CycL parses\r\n- List of justifications\r\n- List of weights (coverage info)\r\n- Error message, if any\nParse the string SENT using EBMT Cyclification.  Returns the following:\n- List of CycL parses\n- List of justifications\n- List of weights (coverage info)\n- Error message, if any")
    public static SubLObject ebmt_parse(final SubLObject sent, SubLObject lexicon, SubLObject semantic_mt) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(sent) : "! stringp(sent) " + ("Types.stringp(sent) " + "CommonSymbols.NIL != Types.stringp(sent) ") + sent;
        SubLObject err_msg = NIL;
        SubLObject v_linkage = NIL;
        SubLObject cycls = NIL;
        SubLObject justifications = NIL;
        SubLObject weights = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    v_linkage = linkage.new_linkage(string_utilities.strip_sentential_punctuation(sent), list($LEXICON, lexicon));
                    if (NIL == v_linkage) {
                        Errors.error($str150$Failed_to_compute_a_linkage_for__, sent);
                    }
                    thread.resetMultipleValues();
                    final SubLObject cycls_$25 = ebmt_parse_linkage(v_linkage, sent, lexicon, semantic_mt);
                    final SubLObject justifications_$26 = thread.secondMultipleValue();
                    final SubLObject weights_$27 = thread.thirdMultipleValue();
                    final SubLObject err_msg_$28 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    cycls = cycls_$25;
                    justifications = justifications_$26;
                    weights = weights_$27;
                    err_msg = err_msg_$28;
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != err_msg) {
            return values(NIL, NIL, NIL, err_msg);
        }
        return values(cycls, justifications, weights);
    }/**
     * Parse the string SENT using EBMT Cyclification.  Returns the following:
     * - List of CycL parses
     * - List of justifications
     * - List of weights (coverage info)
     * - Error message, if any
     */


    public static final SubLObject ebmt_parse_exclude_preds_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject values = NIL;
                {
                    SubLObject _prev_bind_0 = $ebmt_exclude_predsP$.currentBinding(thread);
                    try {
                        $ebmt_exclude_predsP$.bind(T, thread);
                        values = arg2(thread.resetMultipleValues(), multiple_value_list(ebmt_parse(string, UNPROVIDED, UNPROVIDED)));
                    } finally {
                        $ebmt_exclude_predsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return apply(symbol_function(VALUES), values);
            }
        }
    }

    public static SubLObject ebmt_parse_exclude_preds(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject values = NIL;
        final SubLObject _prev_bind_0 = $ebmt_exclude_predsP$.currentBinding(thread);
        try {
            $ebmt_exclude_predsP$.bind(T, thread);
            values = arg2(thread.resetMultipleValues(), multiple_value_list(ebmt_parse(string, UNPROVIDED, UNPROVIDED)));
        } finally {
            $ebmt_exclude_predsP$.rebind(_prev_bind_0, thread);
        }
        return apply(symbol_function(VALUES), values);
    }

    public static final SubLObject ebmt_parse_linkage_alt(SubLObject v_linkage, SubLObject sent, SubLObject lexicon, SubLObject semantic_mt) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = $$InferencePSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject parse_parts = ebmt_parse_parts(v_linkage, T, lexicon, sent);
                SubLObject error = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject cycls = NIL;
                    SubLObject justifications = NIL;
                    SubLObject weights = NIL;
                    SubLObject ebmt_cycls = ebmt_merge_parse_parts(parse_parts, semantic_mt);
                    SubLObject cdolist_list_var = ebmt_cycls;
                    SubLObject ebmt_cycl = NIL;
                    for (ebmt_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ebmt_cycl = cdolist_list_var.first()) {
                        if (!((NIL != subl_promotions.memberP(get_ebmt_cycl_cycl(ebmt_cycl), cycls, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(get_ebmt_cycl_justification(ebmt_cycl), justifications, UNPROVIDED, UNPROVIDED)))) {
                            cycls = cons(get_ebmt_cycl_cycl(ebmt_cycl), cycls);
                            justifications = cons(get_ebmt_cycl_justification(ebmt_cycl), justifications);
                            weights = cons(divide(length(get_ebmt_cycl_weight(ebmt_cycl)), subtract(length(instances.get_slot(v_linkage, WORDS)), TWO_INTEGER)), weights);
                        }
                    }
                    if (NIL == ebmt_cycls) {
                        if (NIL == error) {
                            error = $str_alt144$Wff_checking_rejected_all_cycl_;
                        }
                    }
                    return values(cycls, justifications, weights, error);
                }
            }
        }
    }

    public static SubLObject ebmt_parse_linkage(final SubLObject v_linkage, final SubLObject sent, SubLObject lexicon, SubLObject semantic_mt) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject parse_parts = ebmt_parse_parts(v_linkage, T, lexicon, sent);
        SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cycls = NIL;
        SubLObject justifications = NIL;
        SubLObject weights = NIL;
        SubLObject cdolist_list_var;
        final SubLObject ebmt_cycls = cdolist_list_var = ebmt_merge_parse_parts(parse_parts, semantic_mt);
        SubLObject ebmt_cycl = NIL;
        ebmt_cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == subl_promotions.memberP(get_ebmt_cycl_cycl(ebmt_cycl), cycls, UNPROVIDED, UNPROVIDED)) || (NIL == subl_promotions.memberP(get_ebmt_cycl_justification(ebmt_cycl), justifications, UNPROVIDED, UNPROVIDED))) {
                cycls = cons(get_ebmt_cycl_cycl(ebmt_cycl), cycls);
                justifications = cons(get_ebmt_cycl_justification(ebmt_cycl), justifications);
                weights = cons(divide(length(get_ebmt_cycl_weight(ebmt_cycl)), subtract(length(instances.get_slot(v_linkage, WORDS)), TWO_INTEGER)), weights);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ebmt_cycl = cdolist_list_var.first();
        } 
        if ((NIL == ebmt_cycls) && (NIL == error)) {
            error = $str152$Wff_checking_rejected_all_cycl_;
        }
        return values(cycls, justifications, weights, error);
    }

    public static final SubLObject ebmt_parse_from_template_alt(SubLObject nl_sentence, SubLObject template, SubLObject lexicon, SubLObject semantic_mt, SubLObject with_varsP) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = $$InferencePSC;
        }
        if (with_varsP == UNPROVIDED) {
            with_varsP = T;
        }
        {
            SubLObject v_linkage = linkage.new_linkage(string_utilities.strip_sentential_punctuation(nl_sentence), list($LEXICON, lexicon));
            SubLObject template_parsing_info_alist = ebmt_template_parsing_info_alist(list(template), v_linkage);
            SubLObject template_parsing_info = list_utilities.alist_lookup(template_parsing_info_alist, template, UNPROVIDED, UNPROVIDED);
            SubLObject ebmt_cycls = ((NIL != ebmt_template_parsing_info_p(template_parsing_info)) && (NIL != ebmt_template_parsing_info_processed(template_parsing_info))) ? ((SubLObject) (ebmt_template_parsing_info_cycl(template_parsing_info))) : NIL != list_utilities.non_empty_list_p(template_parsing_info_alist) ? ((SubLObject) (ebmt_parses_using_template(template, template_parsing_info_alist, v_linkage, with_varsP, nl_sentence))) : NIL;
            return ebmt_cycls;
        }
    }

    public static SubLObject ebmt_parse_from_template(final SubLObject nl_sentence, final SubLObject template, SubLObject lexicon, SubLObject semantic_mt, SubLObject with_varsP) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = $$InferencePSC;
        }
        if (with_varsP == UNPROVIDED) {
            with_varsP = T;
        }
        final SubLObject v_linkage = linkage.new_linkage(string_utilities.strip_sentential_punctuation(nl_sentence), list($LEXICON, lexicon));
        final SubLObject template_parsing_info_alist = ebmt_template_parsing_info_alist(list(template), v_linkage);
        final SubLObject template_parsing_info = list_utilities.alist_lookup(template_parsing_info_alist, template, UNPROVIDED, UNPROVIDED);
        final SubLObject ebmt_cycls = ((NIL != ebmt_template_parsing_info_p(template_parsing_info)) && (NIL != ebmt_template_parsing_info_processed(template_parsing_info))) ? ebmt_template_parsing_info_cycl(template_parsing_info) : NIL != list_utilities.non_empty_list_p(template_parsing_info_alist) ? ebmt_parses_using_template(template, template_parsing_info_alist, v_linkage, with_varsP, nl_sentence) : NIL;
        return ebmt_cycls;
    }

    /**
     * Creates EBMT template(s) using TRAINING-NL and TRAINING-CYCL, and then checks
     * if any of these templates can parse TEST-NL to TEST-CYCL.
     */
    @LispMethod(comment = "Creates EBMT template(s) using TRAINING-NL and TRAINING-CYCL, and then checks\r\nif any of these templates can parse TEST-NL to TEST-CYCL.\nCreates EBMT template(s) using TRAINING-NL and TRAINING-CYCL, and then checks\nif any of these templates can parse TEST-NL to TEST-CYCL.")
    public static final SubLObject ebmt_create_and_test_templates_alt(SubLObject training_nl, SubLObject training_cycl, SubLObject test_nl, SubLObject test_cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject semantic_mt, SubLObject verboseP) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = $$InferencePSC;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        SubLTrampolineFile.checkType(training_nl, STRINGP);
        SubLTrampolineFile.checkType(training_cycl, CYCL_SENTENCE_P);
        SubLTrampolineFile.checkType(test_nl, STRINGP);
        SubLTrampolineFile.checkType(test_cycl, CYCL_SENTENCE_P);
        test_cycl = ebmt_canonicalize_el_sentence(test_cycl, $$InferencePSC);
        {
            SubLObject templates = ebmt_create_templates(training_nl, training_cycl, lexicon, allow_multiple_matchesP, verboseP);
            SubLObject test_result = $FAILURE;
            SubLObject other_parsesP = NIL;
            SubLObject cdolist_list_var = templates;
            SubLObject template = NIL;
            for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                {
                    SubLObject parse_result = ebmt_parse_from_template(test_nl, template, lexicon, semantic_mt, UNPROVIDED);
                    SubLObject template_test_result = $FAILURE;
                    SubLObject cdolist_list_var_28 = parse_result;
                    SubLObject ebmt_cycl = NIL;
                    for (ebmt_cycl = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , ebmt_cycl = cdolist_list_var_28.first()) {
                        {
                            SubLObject result_cycl = get_ebmt_cycl_cycl(ebmt_cycl);
                            if (result_cycl.equalp(test_cycl)) {
                                test_result = $SUCCESS;
                                template_test_result = $SUCCESS;
                            } else {
                                other_parsesP = T;
                            }
                        }
                    }
                    if (NIL != verboseP) {
                        format(T, $str_alt147$__Template_Parse_Result___S___S__, template_test_result, parse_result);
                    }
                }
            }
            return values(test_result, other_parsesP);
        }
    }

    @LispMethod(comment = "Creates EBMT template(s) using TRAINING-NL and TRAINING-CYCL, and then checks\r\nif any of these templates can parse TEST-NL to TEST-CYCL.\nCreates EBMT template(s) using TRAINING-NL and TRAINING-CYCL, and then checks\nif any of these templates can parse TEST-NL to TEST-CYCL.")
    public static SubLObject ebmt_create_and_test_templates(final SubLObject training_nl, final SubLObject training_cycl, final SubLObject test_nl, SubLObject test_cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject semantic_mt, SubLObject verboseP) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = $$InferencePSC;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        assert NIL != stringp(training_nl) : "! stringp(training_nl) " + ("Types.stringp(training_nl) " + "CommonSymbols.NIL != Types.stringp(training_nl) ") + training_nl;
        assert NIL != cycl_grammar.cycl_sentence_p(training_cycl) : "! cycl_grammar.cycl_sentence_p(training_cycl) " + ("cycl_grammar.cycl_sentence_p(training_cycl) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(training_cycl) ") + training_cycl;
        assert NIL != stringp(test_nl) : "! stringp(test_nl) " + ("Types.stringp(test_nl) " + "CommonSymbols.NIL != Types.stringp(test_nl) ") + test_nl;
        assert NIL != cycl_grammar.cycl_sentence_p(test_cycl) : "! cycl_grammar.cycl_sentence_p(test_cycl) " + ("cycl_grammar.cycl_sentence_p(test_cycl) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(test_cycl) ") + test_cycl;
        test_cycl = ebmt_canonicalize_el_sentence(test_cycl, $$InferencePSC);
        final SubLObject templates = ebmt_create_templates(training_nl, training_cycl, lexicon, allow_multiple_matchesP, verboseP);
        SubLObject test_result = $FAILURE;
        SubLObject other_parsesP = NIL;
        SubLObject cdolist_list_var = templates;
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject parse_result = ebmt_parse_from_template(test_nl, template, lexicon, semantic_mt, UNPROVIDED);
            SubLObject template_test_result = $FAILURE;
            SubLObject cdolist_list_var_$29 = parse_result;
            SubLObject ebmt_cycl = NIL;
            ebmt_cycl = cdolist_list_var_$29.first();
            while (NIL != cdolist_list_var_$29) {
                final SubLObject result_cycl = get_ebmt_cycl_cycl(ebmt_cycl);
                if (result_cycl.equalp(test_cycl)) {
                    test_result = $SUCCESS;
                    template_test_result = $SUCCESS;
                } else {
                    other_parsesP = T;
                }
                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                ebmt_cycl = cdolist_list_var_$29.first();
            } 
            if (NIL != verboseP) {
                format(T, $str155$__Template_Parse_Result___S___S__, template_test_result, parse_result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        return values(test_result, other_parsesP);
    }/**
     * Creates EBMT template(s) using TRAINING-NL and TRAINING-CYCL, and then checks
     * if any of these templates can parse TEST-NL to TEST-CYCL.
     */


    public static final SubLObject ebmt_valid_training_cyclP_alt(SubLObject cycl) {
        if (((NIL == cycl_sentence_p(cycl)) || (NIL != fort_types_interface.predicate_p(cycl_utilities.formula_arg1(cycl, UNPROVIDED)))) || (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(cycl), $list_alt148, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject ebmt_valid_training_cyclP(final SubLObject cycl) {
        if (((NIL == cycl_grammar.cycl_sentence_p(cycl)) || (NIL != fort_types_interface.predicate_p(cycl_utilities.formula_arg1(cycl, UNPROVIDED)))) || (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(cycl), $list156, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        return T;
    }

    /**
     * Generate atleast N number of English-CycL pairs that can be used to create
     * EBMT templates.  Also, adds these templates to the EBMT Lucene index.
     */
    @LispMethod(comment = "Generate atleast N number of English-CycL pairs that can be used to create\r\nEBMT templates.  Also, adds these templates to the EBMT Lucene index.\nGenerate atleast N number of English-CycL pairs that can be used to create\nEBMT templates.  Also, adds these templates to the EBMT Lucene index.")
    public static final SubLObject ebmt_generate_random_samples_from_kb_alt(SubLObject n, SubLObject verboseP) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            SubLObject num_samples = ZERO_INTEGER;
            while (num_samples.numL(n)) {
                {
                    SubLObject cycl = cycl_utilities.hl_to_el(assertions_high.assertion_cons(assertions_high.random_assertion(UNPROVIDED)));
                    if ((NIL != cycl) && (NIL != ebmt_valid_training_cyclP(cycl))) {
                        {
                            SubLObject glosses = pph_methods_lexicon.all_phrases_for_formula(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = glosses;
                            SubLObject gloss = NIL;
                            for (gloss = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gloss = cdolist_list_var.first()) {
                                {
                                    SubLObject cdolist_list_var_29 = ebmt_create_and_add_templates(gloss, cycl, new_ebmt_lexicon(UNPROVIDED), NIL, verboseP);
                                    SubLObject template = NIL;
                                    for (template = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest() , template = cdolist_list_var_29.first()) {
                                        if (ebmt_template_indexing_result(template).equal($$$Added)) {
                                            num_samples = add(num_samples, ONE_INTEGER);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } 
            return num_samples;
        }
    }

    @LispMethod(comment = "Generate atleast N number of English-CycL pairs that can be used to create\r\nEBMT templates.  Also, adds these templates to the EBMT Lucene index.\nGenerate atleast N number of English-CycL pairs that can be used to create\nEBMT templates.  Also, adds these templates to the EBMT Lucene index.")
    public static SubLObject ebmt_generate_random_samples_from_kb(SubLObject n, SubLObject verboseP) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        SubLObject num_samples = ZERO_INTEGER;
        while (num_samples.numL(n)) {
            final SubLObject cycl = cycl_utilities.hl_to_el(assertions_high.assertion_cons(assertions_high.random_assertion(UNPROVIDED)));
            if ((NIL != cycl) && (NIL != ebmt_valid_training_cyclP(cycl))) {
                SubLObject cdolist_list_var;
                final SubLObject glosses = cdolist_list_var = pph_methods_lexicon.all_phrases_for_formula(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject gloss = NIL;
                gloss = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$30 = ebmt_create_and_add_templates(gloss, cycl, new_ebmt_lexicon(UNPROVIDED), NIL, verboseP);
                    SubLObject template = NIL;
                    template = cdolist_list_var_$30.first();
                    while (NIL != cdolist_list_var_$30) {
                        if (ebmt_template_indexing_result(template).equal($$$Added)) {
                            num_samples = add(num_samples, ONE_INTEGER);
                        }
                        cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                        template = cdolist_list_var_$30.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    gloss = cdolist_list_var.first();
                } 
            }
        } 
        return num_samples;
    }/**
     * Generate atleast N number of English-CycL pairs that can be used to create
     * EBMT templates.  Also, adds these templates to the EBMT Lucene index.
     */


    /**
     * Adds EBMT templates to the Lucene index.  The input file F-IN should contain
     * a list (first member: NL Sentence, second member: CycL sentence) on each
     * line.
     */
    @LispMethod(comment = "Adds EBMT templates to the Lucene index.  The input file F-IN should contain\r\na list (first member: NL Sentence, second member: CycL sentence) on each\r\nline.\nAdds EBMT templates to the Lucene index.  The input file F-IN should contain\na list (first member: NL Sentence, second member: CycL sentence) on each\nline.")
    public static final SubLObject populate_ebmt_index_using_file_alt(SubLObject f_in, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_counter = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($str_alt150$Populating_EBMT_Template_Index___);
                        {
                            SubLObject file_var = f_in;
                            SubLObject stream = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0_30 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream = compatibility.open_text(file_var, $INPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_30, thread);
                                    }
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str_alt76$Unable_to_open__S, file_var);
                                }
                                {
                                    SubLObject stream_var = stream;
                                    if (stream_var.isStream()) {
                                        {
                                            SubLObject length_var = file_length(stream_var);
                                            SubLObject stream_var_31 = stream_var;
                                            SubLObject line_number_var = NIL;
                                            SubLObject file_line = NIL;
                                            for (line_number_var = ZERO_INTEGER, file_line = read_line(stream_var_31, NIL, NIL, UNPROVIDED); NIL != file_line; line_number_var = number_utilities.f_1X(line_number_var) , file_line = read_line(stream_var_31, NIL, NIL, UNPROVIDED)) {
                                                {
                                                    SubLObject line = read_from_string(file_line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject cdolist_list_var = ebmt_create_and_add_templates(line.first(), second(line), lexicon, allow_multiple_matchesP, verboseP);
                                                    SubLObject template = NIL;
                                                    for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                                                        if (ebmt_template_indexing_result(template).equal($$$Added)) {
                                                            template_counter = add(template_counter, ONE_INTEGER);
                                                        }
                                                    }
                                                }
                                                note_percent_progress(file_position(stream_var, UNPROVIDED), length_var);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_32, thread);
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return template_counter;
            }
        }
    }

    @LispMethod(comment = "Adds EBMT templates to the Lucene index.  The input file F-IN should contain\r\na list (first member: NL Sentence, second member: CycL sentence) on each\r\nline.\nAdds EBMT templates to the Lucene index.  The input file F-IN should contain\na list (first member: NL Sentence, second member: CycL sentence) on each\nline.")
    public static SubLObject populate_ebmt_index_using_file(final SubLObject f_in, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template_counter = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str158$Populating_EBMT_Template_Index___);
                SubLObject stream = NIL;
                try {
                    final SubLObject _prev_bind_0_$31 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream = compatibility.open_text(f_in, $INPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$31, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error($str82$Unable_to_open__S, f_in);
                    }
                    final SubLObject stream_var = stream;
                    if (stream_var.isStream()) {
                        final SubLObject length_var = file_length(stream_var);
                        final SubLObject stream_var_$32 = stream_var;
                        SubLObject line_number_var = NIL;
                        SubLObject file_line = NIL;
                        line_number_var = ZERO_INTEGER;
                        for (file_line = file_utilities.do_stream_lines_get_next_line(stream_var_$32); NIL != file_line; file_line = file_utilities.do_stream_lines_get_next_line(stream_var_$32)) {
                            final SubLObject line = read_from_string(file_line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = ebmt_create_and_add_templates(line.first(), second(line), lexicon, allow_multiple_matchesP, verboseP);
                            SubLObject template = NIL;
                            template = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                if (ebmt_template_indexing_result(template).equal($$$Added)) {
                                    template_counter = add(template_counter, ONE_INTEGER);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                template = cdolist_list_var.first();
                            } 
                            note_percent_progress(file_position(stream_var, UNPROVIDED), length_var);
                            line_number_var = number_utilities.f_1X(line_number_var);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return template_counter;
    }/**
     * Adds EBMT templates to the Lucene index.  The input file F-IN should contain
     * a list (first member: NL Sentence, second member: CycL sentence) on each
     * line.
     */


    /**
     * Creates and adds templates (whenever possible) to an EBMT Template Index
     * specified by LEXICON, using #$ebmtNLToCycLTrainingExample
     * assertions in MT.
     */
    @LispMethod(comment = "Creates and adds templates (whenever possible) to an EBMT Template Index\r\nspecified by LEXICON, using #$ebmtNLToCycLTrainingExample\r\nassertions in MT.\nCreates and adds templates (whenever possible) to an EBMT Template Index\nspecified by LEXICON, using #$ebmtNLToCycLTrainingExample\nassertions in MT.")
    public static final SubLObject ebmt_populate_index_from_mt_alt(SubLObject mt, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (mt == UNPROVIDED) {
            mt = $const151$AllEBMTTrainingExamplesCollectorM;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            SubLObject num_templates = ZERO_INTEGER;
            SubLObject cdolist_list_var = ask_utilities.query_template($list_alt152, $list_alt153, mt, UNPROVIDED);
            SubLObject example = NIL;
            for (example = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , example = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_33 = ebmt_create_and_add_templates(example.first(), second(example), lexicon, allow_multiple_matchesP, verboseP);
                    SubLObject template = NIL;
                    for (template = cdolist_list_var_33.first(); NIL != cdolist_list_var_33; cdolist_list_var_33 = cdolist_list_var_33.rest() , template = cdolist_list_var_33.first()) {
                        if (ebmt_template_indexing_result(template).equal($$$Added)) {
                            num_templates = add(num_templates, ONE_INTEGER);
                        }
                    }
                }
            }
            return num_templates;
        }
    }

    @LispMethod(comment = "Creates and adds templates (whenever possible) to an EBMT Template Index\r\nspecified by LEXICON, using #$ebmtNLToCycLTrainingExample\r\nassertions in MT.\nCreates and adds templates (whenever possible) to an EBMT Template Index\nspecified by LEXICON, using #$ebmtNLToCycLTrainingExample\nassertions in MT.")
    public static SubLObject ebmt_populate_index_from_mt(SubLObject mt, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (mt == UNPROVIDED) {
            mt = $const159$AllEBMTTrainingExamplesCollectorM;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = new_ebmt_lexicon(UNPROVIDED);
        }
        if (allow_multiple_matchesP == UNPROVIDED) {
            allow_multiple_matchesP = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        SubLObject num_templates = ZERO_INTEGER;
        SubLObject cdolist_list_var = ask_utilities.query_template($list160, $list161, mt, UNPROVIDED);
        SubLObject example = NIL;
        example = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$35 = ebmt_create_and_add_templates(example.first(), second(example), lexicon, allow_multiple_matchesP, verboseP);
            SubLObject template = NIL;
            template = cdolist_list_var_$35.first();
            while (NIL != cdolist_list_var_$35) {
                if (ebmt_template_indexing_result(template).equal($$$Added)) {
                    num_templates = add(num_templates, ONE_INTEGER);
                }
                cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                template = cdolist_list_var_$35.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            example = cdolist_list_var.first();
        } 
        return num_templates;
    }/**
     * Creates and adds templates (whenever possible) to an EBMT Template Index
     * specified by LEXICON, using #$ebmtNLToCycLTrainingExample
     * assertions in MT.
     */


    public static SubLObject declare_ebmt_template_parser_file() {
        declareFunction("new_ebmt_lexicon", "NEW-EBMT-LEXICON", 0, 1, false);
        declareFunction("ebmt_linkage", "EBMT-LINKAGE", 2, 2, false);
        declareFunction("ebmt_clear_caches", "EBMT-CLEAR-CACHES", 0, 0, false);
        declareFunction("ebmt_template_print_function_trampoline", "EBMT-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ebmt_template_p", "EBMT-TEMPLATE-P", 1, 0, false);
        new ebmt_template_parser.$ebmt_template_p$UnaryFunction();
        declareFunction("ebmt_template_nl_cycl_pair", "EBMT-TEMPLATE-NL-CYCL-PAIR", 1, 0, false);
        declareFunction("ebmt_template_type", "EBMT-TEMPLATE-TYPE", 1, 0, false);
        declareFunction("ebmt_template_links", "EBMT-TEMPLATE-LINKS", 1, 0, false);
        declareFunction("ebmt_template_cycl", "EBMT-TEMPLATE-CYCL", 1, 0, false);
        declareFunction("ebmt_template_indexing_result", "EBMT-TEMPLATE-INDEXING-RESULT", 1, 0, false);
        declareFunction("ebmt_template_weight", "EBMT-TEMPLATE-WEIGHT", 1, 0, false);
        declareFunction("_csetf_ebmt_template_nl_cycl_pair", "_CSETF-EBMT-TEMPLATE-NL-CYCL-PAIR", 2, 0, false);
        declareFunction("_csetf_ebmt_template_type", "_CSETF-EBMT-TEMPLATE-TYPE", 2, 0, false);
        declareFunction("_csetf_ebmt_template_links", "_CSETF-EBMT-TEMPLATE-LINKS", 2, 0, false);
        declareFunction("_csetf_ebmt_template_cycl", "_CSETF-EBMT-TEMPLATE-CYCL", 2, 0, false);
        declareFunction("_csetf_ebmt_template_indexing_result", "_CSETF-EBMT-TEMPLATE-INDEXING-RESULT", 2, 0, false);
        declareFunction("_csetf_ebmt_template_weight", "_CSETF-EBMT-TEMPLATE-WEIGHT", 2, 0, false);
        declareFunction("make_ebmt_template", "MAKE-EBMT-TEMPLATE", 0, 1, false);
        declareFunction("visit_defstruct_ebmt_template", "VISIT-DEFSTRUCT-EBMT-TEMPLATE", 2, 0, false);
        declareFunction("visit_defstruct_object_ebmt_template_method", "VISIT-DEFSTRUCT-OBJECT-EBMT-TEMPLATE-METHOD", 2, 0, false);
        declareFunction("new_ebmt_template", "NEW-EBMT-TEMPLATE", 0, 6, false);
        declareFunction("ebmt_template_words", "EBMT-TEMPLATE-WORDS", 1, 0, false);
        declareFunction("print_ebmt_template", "PRINT-EBMT-TEMPLATE", 1, 2, false);
        declareFunction("ebmt_template_justification", "EBMT-TEMPLATE-JUSTIFICATION", 1, 0, false);
        declareFunction("ebmt_linkage_and_mapped_terms", "EBMT-LINKAGE-AND-MAPPED-TERMS", 3, 1, false);
        declareFunction("ignore_terms_pattern", "IGNORE-TERMS-PATTERN", 0, 0, false);
        declareFunction("ebmt_ignorable_terms_in_training_string", "EBMT-IGNORABLE-TERMS-IN-TRAINING-STRING", 1, 0, false);
        declareFunction("ebmt_remove_ignore_markers", "EBMT-REMOVE-IGNORE-MARKERS", 1, 0, false);
        declareFunction("ebmt_linkset_from_linkage_links", "EBMT-LINKSET-FROM-LINKAGE-LINKS", 1, 1, false);
        declareFunction("linkset_p", "LINKSET-P", 1, 0, false);
        declareFunction("linkset_link_p", "LINKSET-LINK-P", 1, 0, false);
        declareFunction("ebmt_link_name_argument_p", "EBMT-LINK-NAME-ARGUMENT-P", 1, 0, false);
        declareFunction("ebmt_link_name", "EBMT-LINK-NAME", 1, 0, false);
        declareFunction("new_linkset", "NEW-LINKSET", 3, 0, false);
        declareFunction("get_linkset_unindexed_links", "GET-LINKSET-UNINDEXED-LINKS", 1, 0, false);
        declareFunction("get_linkset_indexed_links", "GET-LINKSET-INDEXED-LINKS", 1, 0, false);
        declareFunction("linkset_link_name", "LINKSET-LINK-NAME", 1, 0, false);
        declareFunction("linkset_link_left_word", "LINKSET-LINK-LEFT-WORD", 1, 0, false);
        declareFunction("linkset_link_left_word_string", "LINKSET-LINK-LEFT-WORD-STRING", 1, 0, false);
        declareFunction("linkset_link_left_word_index", "LINKSET-LINK-LEFT-WORD-INDEX", 1, 0, false);
        declareFunction("linkset_link_right_word", "LINKSET-LINK-RIGHT-WORD", 1, 0, false);
        declareFunction("linkset_link_right_word_string", "LINKSET-LINK-RIGHT-WORD-STRING", 1, 0, false);
        declareFunction("linkset_link_right_word_index", "LINKSET-LINK-RIGHT-WORD-INDEX", 1, 0, false);
        declareFunction("ebmt_linkset", "EBMT-LINKSET", 1, 1, false);
        declareFunction("ebmt_cycl_with_vars", "EBMT-CYCL-WITH-VARS", 2, 0, false);
        declareFunction("ebmt_link_word", "EBMT-LINK-WORD", 2, 0, false);
        declareFunction("ebmt_lw_offsets", "EBMT-LW-OFFSETS", 2, 0, false);
        declareFunction("ebmt_mapped_term_vars", "EBMT-MAPPED-TERM-VARS", 4, 1, false);
        declareFunction("ebmt_canonicalize_el_sentence", "EBMT-CANONICALIZE-EL-SENTENCE", 2, 0, false);
        declareFunction("ebmt_create_template", "EBMT-CREATE-TEMPLATE", 2, 2, false);
        declareFunction("ebmt_create_all_possible_training_examples", "EBMT-CREATE-ALL-POSSIBLE-TRAINING-EXAMPLES", 2, 0, false);
        declareFunction("ebmt_create_templates", "EBMT-CREATE-TEMPLATES", 2, 3, false);
        declareFunction("ebmt_stringify_list", "EBMT-STRINGIFY-LIST", 1, 0, false);
        declareFunction("ebmt_linkset_string", "EBMT-LINKSET-STRING", 1, 1, false);
        declareFunction("ebmt_index_template_input", "EBMT-INDEX-TEMPLATE-INPUT", 1, 0, false);
        declareFunction("ebmt_template_index_server_info", "EBMT-TEMPLATE-INDEX-SERVER-INFO", 1, 0, false);
        declareFunction("ebmt_update_log", "EBMT-UPDATE-LOG", 2, 0, false);
        declareFunction("ebmt_delete_example_from_file", "EBMT-DELETE-EXAMPLE-FROM-FILE", 2, 0, false);
        declareFunction("ebmt_index_template_int", "EBMT-INDEX-TEMPLATE-INT", 3, 0, false);
        declareFunction("ebmt_index_template", "EBMT-INDEX-TEMPLATE", 1, 2, false);
        declareFunction("ebmt_create_and_add_templates", "EBMT-CREATE-AND-ADD-TEMPLATES", 2, 3, false);
        declareFunction("ebmt_find_templates_for_linkage", "EBMT-FIND-TEMPLATES-FOR-LINKAGE", 3, 0, false);
        declareFunction("ebmt_find_templates", "EBMT-FIND-TEMPLATES", 1, 1, false);
        declareFunction("ebmt_delete_template_int", "EBMT-DELETE-TEMPLATE-INT", 3, 0, false);
        declareFunction("ebmt_delete_template", "EBMT-DELETE-TEMPLATE", 1, 1, false);
        declareFunction("ebmt_delete_template_using_template_string", "EBMT-DELETE-TEMPLATE-USING-TEMPLATE-STRING", 1, 1, false);
        declareFunction("ebmt_delete_template_using_parse", "EBMT-DELETE-TEMPLATE-USING-PARSE", 1, 0, false);
        declareFunction("ebmt_delete_templates_using_example", "EBMT-DELETE-TEMPLATES-USING-EXAMPLE", 2, 3, false);
        declareFunction("new_ebmt_cycl", "NEW-EBMT-CYCL", 0, 3, false);
        declareFunction("copy_ebmt_cycl", "COPY-EBMT-CYCL", 1, 0, false);
        declareFunction("ebmt_cycl_p", "EBMT-CYCL-P", 1, 0, false);
        declareFunction("set_ebmt_cycl_cycl", "SET-EBMT-CYCL-CYCL", 2, 0, false);
        declareFunction("get_ebmt_cycl_cycl", "GET-EBMT-CYCL-CYCL", 1, 0, false);
        declareFunction("set_ebmt_cycl_justification", "SET-EBMT-CYCL-JUSTIFICATION", 2, 0, false);
        declareFunction("get_ebmt_cycl_justification", "GET-EBMT-CYCL-JUSTIFICATION", 1, 0, false);
        declareFunction("set_ebmt_cycl_weight", "SET-EBMT-CYCL-WEIGHT", 2, 0, false);
        declareFunction("get_ebmt_cycl_weight", "GET-EBMT-CYCL-WEIGHT", 1, 0, false);
        declareFunction("compose_ebmt_cycl_justifications", "COMPOSE-EBMT-CYCL-JUSTIFICATIONS", 2, 0, false);
        declareFunction("compose_ebmt_cycl_weight", "COMPOSE-EBMT-CYCL-WEIGHT", 2, 0, false);
        declareFunction("ebmt_cycl_subst", "EBMT-CYCL-SUBST", 3, 0, false);
        declareFunction("ebmt_template_parsing_info_print_function_trampoline", "EBMT-TEMPLATE-PARSING-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ebmt_template_parsing_info_p", "EBMT-TEMPLATE-PARSING-INFO-P", 1, 0, false);
        new ebmt_template_parser.$ebmt_template_parsing_info_p$UnaryFunction();
        declareFunction("ebmt_template_parsing_info_kw_lw_pairs", "EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS", 1, 0, false);
        declareFunction("ebmt_template_parsing_info_lw_links_pairs", "EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS", 1, 0, false);
        declareFunction("ebmt_template_parsing_info_lw", "EBMT-TEMPLATE-PARSING-INFO-LW", 1, 0, false);
        declareFunction("ebmt_template_parsing_info_processed", "EBMT-TEMPLATE-PARSING-INFO-PROCESSED", 1, 0, false);
        declareFunction("ebmt_template_parsing_info_cycl", "EBMT-TEMPLATE-PARSING-INFO-CYCL", 1, 0, false);
        declareFunction("_csetf_ebmt_template_parsing_info_kw_lw_pairs", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS", 2, 0, false);
        declareFunction("_csetf_ebmt_template_parsing_info_lw_links_pairs", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS", 2, 0, false);
        declareFunction("_csetf_ebmt_template_parsing_info_lw", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW", 2, 0, false);
        declareFunction("_csetf_ebmt_template_parsing_info_processed", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-PROCESSED", 2, 0, false);
        declareFunction("_csetf_ebmt_template_parsing_info_cycl", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-CYCL", 2, 0, false);
        declareFunction("make_ebmt_template_parsing_info", "MAKE-EBMT-TEMPLATE-PARSING-INFO", 0, 1, false);
        declareFunction("visit_defstruct_ebmt_template_parsing_info", "VISIT-DEFSTRUCT-EBMT-TEMPLATE-PARSING-INFO", 2, 0, false);
        declareFunction("visit_defstruct_object_ebmt_template_parsing_info_method", "VISIT-DEFSTRUCT-OBJECT-EBMT-TEMPLATE-PARSING-INFO-METHOD", 2, 0, false);
        declareFunction("new_ebmt_template_parsing_info", "NEW-EBMT-TEMPLATE-PARSING-INFO", 0, 5, false);
        declareFunction("print_ebmt_template_parsing_info", "PRINT-EBMT-TEMPLATE-PARSING-INFO", 1, 2, false);
        declareFunction("ebmt_linkset_linkword_linkset_links_pairs", "EBMT-LINKSET-LINKWORD-LINKSET-LINKS-PAIRS", 1, 0, false);
        declareFunction("ebmt_llw_lw_equalP", "EBMT-LLW-LW-EQUAL?", 3, 0, false);
        declareFunction("link_tuple_equal", "LINK-TUPLE-EQUAL", 2, 0, false);
        declareFunction("ebmt_keyword_linkword_pairs", "EBMT-KEYWORD-LINKWORD-PAIRS", 2, 0, false);
        declareFunction("ebmt_templates_relevant_to_linkword", "EBMT-TEMPLATES-RELEVANT-TO-LINKWORD", 2, 0, false);
        declareFunction("ebmt_used_linkwords", "EBMT-USED-LINKWORDS", 1, 0, false);
        declareFunction("strings_of_linkwords", "STRINGS-OF-LINKWORDS", 1, 0, false);
        declareFunction("clear_ebmt_cycls_for_phrase", "CLEAR-EBMT-CYCLS-FOR-PHRASE", 0, 0, false);
        declareFunction("remove_ebmt_cycls_for_phrase", "REMOVE-EBMT-CYCLS-FOR-PHRASE", 2, 0, false);
        declareFunction("ebmt_cycls_for_phrase_internal", "EBMT-CYCLS-FOR-PHRASE-INTERNAL", 2, 0, false);
        declareFunction("ebmt_cycls_for_phrase", "EBMT-CYCLS-FOR-PHRASE", 2, 0, false);
        declareFunction("ebmt_penntag_to_cycl_category", "EBMT-PENNTAG-TO-CYCL-CATEGORY", 1, 0, false);
        declareFunction("ebmt_cycls_using_link_word_only", "EBMT-CYCLS-USING-LINK-WORD-ONLY", 3, 0, false);
        declareFunction("ebmt_cycls_for_link_word", "EBMT-CYCLS-FOR-LINK-WORD", 5, 0, false);
        declareFunction("ebmt_keyword_cycls_pairs", "EBMT-KEYWORD-CYCLS-PAIRS", 4, 0, false);
        declareFunction("ebmt_remove_invalid_cycls", "EBMT-REMOVE-INVALID-CYCLS", 1, 0, false);
        declareFunction("ebmt_parses_using_template", "EBMT-PARSES-USING-TEMPLATE", 5, 0, false);
        declareFunction("ebmt_template_parsing_info_alist", "EBMT-TEMPLATE-PARSING-INFO-ALIST", 2, 0, false);
        declareFunction("ebmt_parse_parts", "EBMT-PARSE-PARTS", 4, 0, false);
        declareFunction("ebmt_relevant_cycl_parts", "EBMT-RELEVANT-CYCL-PARTS", 2, 0, false);
        declareFunction("conjoin_ebmt_cycls", "CONJOIN-EBMT-CYCLS", 1, 0, false);
        declareFunction("ebmt_merge_parse_parts", "EBMT-MERGE-PARSE-PARTS", 2, 0, false);
        declareFunction("ebmt_parse", "EBMT-PARSE", 1, 2, false);
        declareFunction("ebmt_parse_exclude_preds", "EBMT-PARSE-EXCLUDE-PREDS", 1, 0, false);
        declareFunction("ebmt_parse_linkage", "EBMT-PARSE-LINKAGE", 2, 2, false);
        declareFunction("ebmt_parse_from_template", "EBMT-PARSE-FROM-TEMPLATE", 2, 3, false);
        declareFunction("ebmt_create_and_test_templates", "EBMT-CREATE-AND-TEST-TEMPLATES", 4, 4, false);
        declareFunction("ebmt_valid_training_cyclP", "EBMT-VALID-TRAINING-CYCL?", 1, 0, false);
        declareFunction("ebmt_generate_random_samples_from_kb", "EBMT-GENERATE-RANDOM-SAMPLES-FROM-KB", 0, 2, false);
        declareFunction("populate_ebmt_index_using_file", "POPULATE-EBMT-INDEX-USING-FILE", 1, 3, false);
        declareFunction("ebmt_populate_index_from_mt", "EBMT-POPULATE-INDEX-FROM-MT", 0, 4, false);
        return NIL;
    }

    public static SubLObject init_ebmt_template_parser_file() {
        defparameter("*EBMT-EXCLUDE-PREDS?*", NIL);
        defparameter("*EBMT-PHRASE-INTERP-TIMEOUT*", $int$30);
        defconstant("*DTP-EBMT-TEMPLATE*", EBMT_TEMPLATE);
        defparameter("*IGNORE-TERMS-PATTERN*", $UNINITIALIZED);
        defconstant("*DTP-EBMT-TEMPLATE-PARSING-INFO*", EBMT_TEMPLATE_PARSING_INFO);
        deflexical("*EBMT-CYCLS-FOR-PHRASE-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_ebmt_template_parser_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ebmt_template$.getGlobalValue(), symbol_function(EBMT_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list22);
        def_csetf(EBMT_TEMPLATE_NL_CYCL_PAIR, _CSETF_EBMT_TEMPLATE_NL_CYCL_PAIR);
        def_csetf(EBMT_TEMPLATE_TYPE, _CSETF_EBMT_TEMPLATE_TYPE);
        def_csetf(EBMT_TEMPLATE_LINKS, _CSETF_EBMT_TEMPLATE_LINKS);
        def_csetf(EBMT_TEMPLATE_CYCL, _CSETF_EBMT_TEMPLATE_CYCL);
        def_csetf(EBMT_TEMPLATE_INDEXING_RESULT, _CSETF_EBMT_TEMPLATE_INDEXING_RESULT);
        def_csetf(EBMT_TEMPLATE_WEIGHT, _CSETF_EBMT_TEMPLATE_WEIGHT);
        identity(EBMT_TEMPLATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ebmt_template$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ebmt_template_parsing_info$.getGlobalValue(), symbol_function(EBMT_TEMPLATE_PARSING_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list104);
        def_csetf(EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS, _CSETF_EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS);
        def_csetf(EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS, _CSETF_EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS);
        def_csetf(EBMT_TEMPLATE_PARSING_INFO_LW, _CSETF_EBMT_TEMPLATE_PARSING_INFO_LW);
        def_csetf(EBMT_TEMPLATE_PARSING_INFO_PROCESSED, _CSETF_EBMT_TEMPLATE_PARSING_INFO_PROCESSED);
        def_csetf(EBMT_TEMPLATE_PARSING_INFO_CYCL, _CSETF_EBMT_TEMPLATE_PARSING_INFO_CYCL);
        identity(EBMT_TEMPLATE_PARSING_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ebmt_template_parsing_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_PARSING_INFO_METHOD));
        memoization_state.note_globally_cached_function(EBMT_CYCLS_FOR_PHRASE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ebmt_template_parser_file();
    }

    @Override
    public void initializeVariables() {
        init_ebmt_template_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ebmt_template_parser_file();
    }

    

    public static final class $ebmt_template_p$UnaryFunction extends UnaryFunction {
        public $ebmt_template_p$UnaryFunction() {
            super(extractFunctionNamed("EBMT-TEMPLATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ebmt_template_p(arg1);
        }
    }

    public static final class $ebmt_template_parsing_info_native extends SubLStructNative {
        public SubLObject $kw_lw_pairs;

        public SubLObject $lw_links_pairs;

        public SubLObject $lw;

        public SubLObject $processed;

        public SubLObject $cycl;

        private static final SubLStructDeclNative structDecl;

        public $ebmt_template_parsing_info_native() {
            ebmt_template_parser.$ebmt_template_parsing_info_native.this.$kw_lw_pairs = Lisp.NIL;
            ebmt_template_parser.$ebmt_template_parsing_info_native.this.$lw_links_pairs = Lisp.NIL;
            ebmt_template_parser.$ebmt_template_parsing_info_native.this.$lw = Lisp.NIL;
            ebmt_template_parser.$ebmt_template_parsing_info_native.this.$processed = Lisp.NIL;
            ebmt_template_parser.$ebmt_template_parsing_info_native.this.$cycl = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return ebmt_template_parser.$ebmt_template_parsing_info_native.this.$kw_lw_pairs;
        }

        @Override
        public SubLObject getField3() {
            return ebmt_template_parser.$ebmt_template_parsing_info_native.this.$lw_links_pairs;
        }

        @Override
        public SubLObject getField4() {
            return ebmt_template_parser.$ebmt_template_parsing_info_native.this.$lw;
        }

        @Override
        public SubLObject getField5() {
            return ebmt_template_parser.$ebmt_template_parsing_info_native.this.$processed;
        }

        @Override
        public SubLObject getField6() {
            return ebmt_template_parser.$ebmt_template_parsing_info_native.this.$cycl;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return ebmt_template_parser.$ebmt_template_parsing_info_native.this.$kw_lw_pairs = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return ebmt_template_parser.$ebmt_template_parsing_info_native.this.$lw_links_pairs = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return ebmt_template_parser.$ebmt_template_parsing_info_native.this.$lw = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return ebmt_template_parser.$ebmt_template_parsing_info_native.this.$processed = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return ebmt_template_parser.$ebmt_template_parsing_info_native.this.$cycl = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.ebmt_template_parser.$ebmt_template_parsing_info_native.class, EBMT_TEMPLATE_PARSING_INFO, EBMT_TEMPLATE_PARSING_INFO_P, $list98, $list99, new String[]{ "$kw_lw_pairs", "$lw_links_pairs", "$lw", "$processed", "$cycl" }, $list100, $list101, PRINT_EBMT_TEMPLATE_PARSING_INFO);
        }
    }

    public static final class $ebmt_template_parsing_info_p$UnaryFunction extends UnaryFunction {
        public $ebmt_template_parsing_info_p$UnaryFunction() {
            super(extractFunctionNamed("EBMT-TEMPLATE-PARSING-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ebmt_template_parsing_info_p(arg1);
        }
    }

    static private final SubLString $str_alt10$No_word_linkage_found_for___S = makeString("No word-linkage found for: ~S");

    static private final SubLString $str_alt11$A_word_linkage_with_unknown_words = makeString("A word-linkage with unknown words was found for: ~S");

    static private final SubLList $list_alt16 = list(makeSymbol("NL-CYCL-PAIR"), makeSymbol("TYPE"), makeSymbol("LINKS"), makeSymbol("CYCL"), makeSymbol("INDEXING-RESULT"), makeSymbol("WEIGHT"));

    static private final SubLList $list_alt17 = list(makeKeyword("NL-CYCL-PAIR"), $TYPE, makeKeyword("LINKS"), $CYCL, makeKeyword("INDEXING-RESULT"), makeKeyword("WEIGHT"));

    static private final SubLList $list_alt18 = list(makeSymbol("EBMT-TEMPLATE-NL-CYCL-PAIR"), makeSymbol("EBMT-TEMPLATE-TYPE"), makeSymbol("EBMT-TEMPLATE-LINKS"), makeSymbol("EBMT-TEMPLATE-CYCL"), makeSymbol("EBMT-TEMPLATE-INDEXING-RESULT"), makeSymbol("EBMT-TEMPLATE-WEIGHT"));

    static private final SubLList $list_alt19 = list(makeSymbol("_CSETF-EBMT-TEMPLATE-NL-CYCL-PAIR"), makeSymbol("_CSETF-EBMT-TEMPLATE-TYPE"), makeSymbol("_CSETF-EBMT-TEMPLATE-LINKS"), makeSymbol("_CSETF-EBMT-TEMPLATE-CYCL"), makeSymbol("_CSETF-EBMT-TEMPLATE-INDEXING-RESULT"), makeSymbol("_CSETF-EBMT-TEMPLATE-WEIGHT"));

    static private final SubLString $str_alt40$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLSymbol $sym41$_ = makeSymbol("<");

    static private final SubLString $str_alt42$__TEMPLATE_____Words___S____Links = makeString("#<TEMPLATE:~%  Words: ~S~%  Links: ~S~%  CycL: ~S~%  Weight: ~S~%>~%");

    static private final SubLString $str_alt44$______________ = makeString("\\{([^\\}\\{]*)\\}");

    static private final SubLString $str_alt45$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    static private final SubLString $str_alt46$_ = makeString("}");

    static private final SubLString $str_alt47$_ = makeString("{");

    static private final SubLString $str_alt50$IGNORE_ = makeString("IGNORE-");

    static private final SubLString $str_alt55$__A_Za_z0_9__ = makeString("[^A-Za-z0-9](");

    static private final SubLString $str_alt56$___A_Za_z0_9_ = makeString(")[^A-Za-z0-9]");

    static private final SubLString $str_alt57$_b_ = makeString("\\b(");

    static private final SubLString $str_alt58$__b = makeString(")\\b");

    static private final SubLList $list_alt59 = list(makeKeyword("CASELESS"));

    static private final SubLString $str_alt60$_VAR = makeString(":VAR");

    static private final SubLSymbol $sym61$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLString $str_alt64$__ = makeString("~~");

    static private final SubLString $str_alt65$_ = makeString("~");

    static private final SubLString $str_alt70$__NL___S__CycL____S___S__ = makeString("~%NL: ~S~%CycL:~%~S~%~S~%");

    static private final SubLString $str_alt74$Unknown_EBMT_lexicon___S__ = makeString("Unknown EBMT lexicon: ~S~%");

    static private final SubLString $str_alt76$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt77$_A__A__ = makeString("~A ~A~%");

    static private final SubLString $str_alt79$__ = makeString(" (");

    static private final SubLString $str_alt80$___ = makeString("): ");

    static private final SubLString $str_alt81$_A_____S__ = makeString("~A: ~%~S~%");

    static private final SubLString $str_alt83$_S__ = makeString("~S~%");

    static private final SubLString $str_alt84$Found_ = makeString("Found ");

    static private final SubLString $str_alt85$_templates_for_linkset__ = makeString(" templates for linkset: ");

    static private final SubLString $str_alt88$_A__ = makeString("~A~%");

    static private final SubLList $list_alt92 = list(makeSymbol("KW-LW-PAIRS"), makeSymbol("LW-LINKS-PAIRS"), makeSymbol("LW"), makeSymbol("PROCESSED"), makeSymbol("CYCL"));

    static private final SubLList $list_alt93 = list(makeKeyword("KW-LW-PAIRS"), makeKeyword("LW-LINKS-PAIRS"), makeKeyword("LW"), makeKeyword("PROCESSED"), $CYCL);

    static private final SubLList $list_alt94 = list(makeSymbol("EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS"), makeSymbol("EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS"), makeSymbol("EBMT-TEMPLATE-PARSING-INFO-LW"), makeSymbol("EBMT-TEMPLATE-PARSING-INFO-PROCESSED"), makeSymbol("EBMT-TEMPLATE-PARSING-INFO-CYCL"));

    static private final SubLList $list_alt95 = list(makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS"), makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS"), makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW"), makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-PROCESSED"), makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-CYCL"));

    static private final SubLString $str_alt112$__TEMPLATE_PARSING_INFO______Keyw = makeString("#<TEMPLATE-PARSING-INFO: ~%  Keyword-Linkword pairs: ~S~%  Linkword-Links pairs: ~S~%  Linkwords: ~S~%  Processed: ~S~%  CycL: ~S~%>");

    static private final SubLList $list_alt117 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    static private final SubLList $list_alt119 = list(makeKeyword("ANY"), reader_make_constant_shell("SententialConstituent"), reader_make_constant_shell("NounPhrase"));

    static private final SubLList $list_alt120 = list(reader_make_constant_shell("ScalarInterval"), reader_make_constant_shell("Date"));

    static private final SubLSymbol $sym121$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    static private final SubLList $list_alt122 = list(reader_make_constant_shell("NounPhrase"), reader_make_constant_shell("ProperNoun"));

    public static final SubLSymbol $kw128$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt139$Unable_to_understand_some_of_the_ = makeString("Unable to understand some of the tokens in the sentence.");

    static private final SubLString $str_alt140$No_matching_templates_found_ = makeString("No matching templates found.");

    static private final SubLSymbol $sym141$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

    static private final SubLString $str_alt142$Failed_to_compute_a_linkage_for__ = makeString("Failed to compute a linkage for: ~S");

    static private final SubLString $str_alt144$Wff_checking_rejected_all_cycl_ = makeString("Wff checking rejected all cycl.");

    static private final SubLString $str_alt147$__Template_Parse_Result___S___S__ = makeString("~%Template Parse Result: ~S~%~S~%");

    static private final SubLList $list_alt148 = list(reader_make_constant_shell("cycSecureDocString"), reader_make_constant_shell("comment"));

    static private final SubLString $str_alt150$Populating_EBMT_Template_Index___ = makeString("Populating EBMT Template Index ...");

    public static final SubLObject $const151$AllEBMTTrainingExamplesCollectorM = reader_make_constant_shell("AllEBMTTrainingExamplesCollectorMt");

    static private final SubLList $list_alt152 = list(makeSymbol("?NL"), makeSymbol("?CYCL"));

    static private final SubLList $list_alt153 = list(reader_make_constant_shell("thereExists"), makeSymbol("?QUOTEDCYCL"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("ebmtNLToCycLTrainingExample"), makeSymbol("?NL"), makeSymbol("?QUOTEDCYCL")), list(reader_make_constant_shell("means"), makeSymbol("?QUOTEDCYCL"), makeSymbol("?CYCL"))));
}

/**
 * Total time: 806 ms
 */
