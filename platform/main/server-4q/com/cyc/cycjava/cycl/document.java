/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.list_utilities.lengthGE;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_D;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_L;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_M;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_P;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_a;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backquote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_c;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_d;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_e;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_escape;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_exclamation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_f;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_h;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_i;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_l;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbrace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_m;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_n;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_o;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_r;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rbrace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_s;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_t;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_u;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_v;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_w;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.vectorp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.caar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.clear_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.input_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DOCUMENT
 * source file: /cyc/top/cycl/document.lisp
 * created:     2019/07/03 17:38:17
 */
public final class document extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt32$ = makeString("");

    public static final class $paragraph_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.document.$paragraph_native.this.$sentences;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.document.$paragraph_native.this.$mother;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.document.$paragraph_native.this.$sentences = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.document.$paragraph_native.this.$mother = value;
        }

        public SubLObject $sentences = Lisp.NIL;

        public SubLObject $mother = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.document.$paragraph_native.class, PARAGRAPH, PARAGRAPH_P, $list_alt140, $list_alt141, new String[]{ "$sentences", "$mother" }, $list_alt142, $list_alt143, PARAGRAPH_PRINT);
    }

    public static final SubLFile me = new document();

 public static final String myName = "com.cyc.cycjava.cycl.document";


    // defparameter
    // Definitions
    // The maximal number of NL items printed of the various NL text classes
    /**
     * The maximal number of NL items printed of the various NL text classes
     */
    @LispMethod(comment = "The maximal number of NL items printed of the various NL text classes\ndefparameter")
    private static final SubLSymbol $text_class_print_length$ = makeSymbol("*TEXT-CLASS-PRINT-LENGTH*");

    // defconstant
    // the number of spaces an XML level should be indented
    /**
     * the number of spaces an XML level should be indented
     */
    @LispMethod(comment = "the number of spaces an XML level should be indented\ndefconstant")
    private static final SubLSymbol $xml_indent_level$ = makeSymbol("*XML-INDENT-LEVEL*");

    // defconstant
    // an XML indent string
    /**
     * an XML indent string
     */
    @LispMethod(comment = "an XML indent string\ndefconstant")
    private static final SubLSymbol $xml_indent$ = makeSymbol("*XML-INDENT*");

    // defconstant
    // a newline string
    /**
     * a newline string
     */
    @LispMethod(comment = "a newline string\ndefconstant")
    private static final SubLSymbol $newline$ = makeSymbol("*NEWLINE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $xml_string_mapping$ = makeSymbol("*XML-STRING-MAPPING*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sign$ = makeSymbol("*DTP-SIGN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $wordifier$ = makeSymbol("*WORDIFIER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $fst_string_wordify_lock$ = makeSymbol("*FST-STRING-WORDIFY-LOCK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_html_string_wordify_state$ = makeSymbol("*DTP-HTML-STRING-WORDIFY-STATE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_paragraph$ = makeSymbol("*DTP-PARAGRAPH*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_document$ = makeSymbol("*DTP-DOCUMENT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $perform_dot_analysis_on_docs$ = makeSymbol("*PERFORM-DOT-ANALYSIS-ON-DOCS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $wordifier_fst$ = makeSymbol("*WORDIFIER-FST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sentencifier_fst$ = makeSymbol("*SENTENCIFIER-FST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $paragraphier_fst$ = makeSymbol("*PARAGRAPHIER-FST*");

    // defparameter
    // The end of sentence marker
    /**
     * The end of sentence marker
     */
    @LispMethod(comment = "The end of sentence marker\ndefparameter")
    private static final SubLSymbol $eos_char$ = makeSymbol("*EOS-CHAR*");

    // defparameter
    // The end-of-sentence marker
    /**
     * The end-of-sentence marker
     */
    @LispMethod(comment = "The end-of-sentence marker\ndefparameter")
    private static final SubLSymbol $eos$ = makeSymbol("*EOS*");

    // defparameter
    // sentence-ending punctuation
    /**
     * sentence-ending punctuation
     */
    @LispMethod(comment = "sentence-ending punctuation\ndefparameter")
    private static final SubLSymbol $p$ = makeSymbol("*P*");

    // defparameter
    // after-punctuation sentence enders
    /**
     * after-punctuation sentence enders
     */
    @LispMethod(comment = "after-punctuation sentence enders\ndefparameter")
    private static final SubLSymbol $ap$ = makeSymbol("*AP*");

    // defparameter
    // punctuation + after punctuation
    /**
     * punctuation + after punctuation
     */
    @LispMethod(comment = "punctuation + after punctuation\ndefparameter")
    private static final SubLSymbol $pap$ = makeSymbol("*PAP*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $people$ = makeSymbol("*PEOPLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $army$ = makeSymbol("*ARMY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $companies$ = makeSymbol("*COMPANIES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $places$ = makeSymbol("*PLACES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $months$ = makeSymbol("*MONTHS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $misc$ = makeSymbol("*MISC*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $abbreviations$ = makeSymbol("*ABBREVIATIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $mark_eos_regular_expressions$ = makeSymbol("*MARK-EOS-REGULAR-EXPRESSIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $remove_false_eos_regular_expressions1$ = makeSymbol("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS1*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $remove_false_eos_regular_expressions2$ = makeSymbol("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS2*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $split_unsplit_stuff_regular_expressions$ = makeSymbol("*SPLIT-UNSPLIT-STUFF-REGULAR-EXPRESSIONS*");

    // defparameter
    // pattern/substitution pairs to be applied to the input text in sequence
    /**
     * pattern/substitution pairs to be applied to the input text in sequence
     */
    @LispMethod(comment = "pattern/substitution pairs to be applied to the input text in sequence\ndefparameter")
    private static final SubLSymbol $sentencifier_patterns$ = makeSymbol("*SENTENCIFIER-PATTERNS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(cons(makeString("<"), makeString("&lt;")), cons(makeString("&"), makeString("&amp;")), cons(makeString(">"), makeString("&gt;")), cons(makeString("\""), makeString("&quot;")), cons(makeString("'"), makeString("&apos;")));

    private static final SubLSymbol SIGN = makeSymbol("SIGN");

    private static final SubLSymbol SIGN_P = makeSymbol("SIGN-P");

    static private final SubLList $list3 = list(makeSymbol("STRING"), makeSymbol("TYPE"), makeSymbol("INFO"), makeSymbol("CATEGORY"), makeSymbol("CONSTITUENTS"), makeSymbol("OFFSET"), makeSymbol("MOTHER"));

    static private final SubLList $list4 = list(makeKeyword("STRING"), $TYPE, $INFO, makeKeyword("CATEGORY"), makeKeyword("CONSTITUENTS"), makeKeyword("OFFSET"), makeKeyword("MOTHER"));

    static private final SubLList $list5 = list(makeSymbol("SIGN-STRING"), makeSymbol("SIGN-TYPE"), makeSymbol("SIGN-INFO"), makeSymbol("SIGN-CATEGORY"), makeSymbol("SIGN-CONSTITUENTS"), makeSymbol("SIGN-OFFSET"), makeSymbol("SIGN-MOTHER"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-SIGN-STRING"), makeSymbol("_CSETF-SIGN-TYPE"), makeSymbol("_CSETF-SIGN-INFO"), makeSymbol("_CSETF-SIGN-CATEGORY"), makeSymbol("_CSETF-SIGN-CONSTITUENTS"), makeSymbol("_CSETF-SIGN-OFFSET"), makeSymbol("_CSETF-SIGN-MOTHER"));

    private static final SubLSymbol SIGN_PRINT = makeSymbol("SIGN-PRINT");

    private static final SubLSymbol SIGN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SIGN-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SIGN-P"));

    private static final SubLSymbol SIGN_STRING = makeSymbol("SIGN-STRING");

    private static final SubLSymbol _CSETF_SIGN_STRING = makeSymbol("_CSETF-SIGN-STRING");

    private static final SubLSymbol SIGN_TYPE = makeSymbol("SIGN-TYPE");

    private static final SubLSymbol _CSETF_SIGN_TYPE = makeSymbol("_CSETF-SIGN-TYPE");

    private static final SubLSymbol SIGN_INFO = makeSymbol("SIGN-INFO");

    private static final SubLSymbol _CSETF_SIGN_INFO = makeSymbol("_CSETF-SIGN-INFO");

    private static final SubLSymbol SIGN_CATEGORY = makeSymbol("SIGN-CATEGORY");

    private static final SubLSymbol _CSETF_SIGN_CATEGORY = makeSymbol("_CSETF-SIGN-CATEGORY");

    private static final SubLSymbol SIGN_CONSTITUENTS = makeSymbol("SIGN-CONSTITUENTS");

    private static final SubLSymbol _CSETF_SIGN_CONSTITUENTS = makeSymbol("_CSETF-SIGN-CONSTITUENTS");

    private static final SubLSymbol SIGN_OFFSET = makeSymbol("SIGN-OFFSET");

    private static final SubLSymbol _CSETF_SIGN_OFFSET = makeSymbol("_CSETF-SIGN-OFFSET");

    private static final SubLSymbol SIGN_MOTHER = makeSymbol("SIGN-MOTHER");

    private static final SubLSymbol _CSETF_SIGN_MOTHER = makeSymbol("_CSETF-SIGN-MOTHER");

    private static final SubLString $str31$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SIGN = makeSymbol("MAKE-SIGN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SIGN_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SIGN-METHOD");

    private static final SubLString $str38$ = makeString("");

    private static final SubLSymbol SXHASH_SIGN_METHOD = makeSymbol("SXHASH-SIGN-METHOD");

    private static final SubLString $str40$__ = makeString("#<");

    static private final SubLString $str41$_ = makeString("(");

    static private final SubLString $str42$_ = makeString(")");

    private static final SubLString $str43$__ = makeString(": ");

    private static final SubLString $str44$_ = makeString("\"");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str46$____ = makeString(" ...");

    private static final SubLString $str47$_ = makeString("/");

    private static final SubLString $str48$_ = makeString(">");

    private static final SubLString $str52$Attempt_to_set_the_non_existing_s = makeString("Attempt to set the non-existing slot ~a");

    private static final SubLList $list53 = list(list(makeSymbol("CONSTITUENT"), makeSymbol("SIGN")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str58$Unknown_sign_subclass__a = makeString("Unknown sign subclass ~a");

    private static final SubLList $list60 = list(makeKeyword("W"), makeKeyword("XW"));

    private static final SubLSymbol WORD_P = makeSymbol("WORD-P");

    private static final SubLSymbol EXHAUSTIVE_WORD_P = makeSymbol("EXHAUSTIVE-WORD-P");

    private static final SubLSymbol RKF_STANDARD_STRING_WORDIFY = makeSymbol("RKF-STANDARD-STRING-WORDIFY");

    private static final SubLString $str69$fst_string_wordify_lock = makeString("fst-string-wordify-lock");

    private static final SubLSymbol $sym70$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol RKF_CH_STRING_TOKENIZE = makeSymbol("RKF-CH-STRING-TOKENIZE");

    private static final SubLSymbol STANDARD_STRING_TOKENIZE = makeSymbol("STANDARD-STRING-TOKENIZE");

    private static final SubLSymbol SPLIT_STRING = makeSymbol("SPLIT-STRING");

    private static final SubLSymbol HTML_STRING_WORDIFY_PUNCTUATION_CHARS = makeSymbol("HTML-STRING-WORDIFY-PUNCTUATION-CHARS");

    private static final SubLSymbol $html_string_wordify_punctuation_chars_caching_state$ = makeSymbol("*HTML-STRING-WORDIFY-PUNCTUATION-CHARS-CACHING-STATE*");

    private static final SubLSymbol HTML_STRING_WORDIFY_STATE = makeSymbol("HTML-STRING-WORDIFY-STATE");

    private static final SubLSymbol HTML_STRING_WORDIFY_STATE_P = makeSymbol("HTML-STRING-WORDIFY-STATE-P");

    private static final SubLList $list80 = list(makeSymbol("STATE"), makeSymbol("TAG-PIECES"), makeSymbol("STRING-PIECES"), makeSymbol("PUNCTUATION-PIECES"), makeSymbol("LEADING-TAGS"), makeSymbol("FOLLOWING-TAGS"), makeSymbol("CURRENT-OFFSET"));

    private static final SubLList $list81 = list(makeKeyword("STATE"), makeKeyword("TAG-PIECES"), makeKeyword("STRING-PIECES"), makeKeyword("PUNCTUATION-PIECES"), makeKeyword("LEADING-TAGS"), makeKeyword("FOLLOWING-TAGS"), makeKeyword("CURRENT-OFFSET"));

    private static final SubLList $list82 = list(makeSymbol("HSW-STATE-STATE"), makeSymbol("HSW-STATE-TAG-PIECES"), makeSymbol("HSW-STATE-STRING-PIECES"), makeSymbol("HSW-STATE-PUNCTUATION-PIECES"), makeSymbol("HSW-STATE-LEADING-TAGS"), makeSymbol("HSW-STATE-FOLLOWING-TAGS"), makeSymbol("HSW-STATE-CURRENT-OFFSET"));

    private static final SubLList $list83 = list(makeSymbol("_CSETF-HSW-STATE-STATE"), makeSymbol("_CSETF-HSW-STATE-TAG-PIECES"), makeSymbol("_CSETF-HSW-STATE-STRING-PIECES"), makeSymbol("_CSETF-HSW-STATE-PUNCTUATION-PIECES"), makeSymbol("_CSETF-HSW-STATE-LEADING-TAGS"), makeSymbol("_CSETF-HSW-STATE-FOLLOWING-TAGS"), makeSymbol("_CSETF-HSW-STATE-CURRENT-OFFSET"));

    private static final SubLSymbol PRINT_HSW_STATE = makeSymbol("PRINT-HSW-STATE");

    private static final SubLSymbol HTML_STRING_WORDIFY_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HTML-STRING-WORDIFY-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list86 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HTML-STRING-WORDIFY-STATE-P"));

    private static final SubLSymbol HSW_STATE_STATE = makeSymbol("HSW-STATE-STATE");

    private static final SubLSymbol _CSETF_HSW_STATE_STATE = makeSymbol("_CSETF-HSW-STATE-STATE");

    private static final SubLSymbol HSW_STATE_TAG_PIECES = makeSymbol("HSW-STATE-TAG-PIECES");

    private static final SubLSymbol _CSETF_HSW_STATE_TAG_PIECES = makeSymbol("_CSETF-HSW-STATE-TAG-PIECES");

    private static final SubLSymbol HSW_STATE_STRING_PIECES = makeSymbol("HSW-STATE-STRING-PIECES");

    private static final SubLSymbol _CSETF_HSW_STATE_STRING_PIECES = makeSymbol("_CSETF-HSW-STATE-STRING-PIECES");

    private static final SubLSymbol HSW_STATE_PUNCTUATION_PIECES = makeSymbol("HSW-STATE-PUNCTUATION-PIECES");

    private static final SubLSymbol _CSETF_HSW_STATE_PUNCTUATION_PIECES = makeSymbol("_CSETF-HSW-STATE-PUNCTUATION-PIECES");

    private static final SubLSymbol HSW_STATE_LEADING_TAGS = makeSymbol("HSW-STATE-LEADING-TAGS");

    private static final SubLSymbol _CSETF_HSW_STATE_LEADING_TAGS = makeSymbol("_CSETF-HSW-STATE-LEADING-TAGS");

    private static final SubLSymbol HSW_STATE_FOLLOWING_TAGS = makeSymbol("HSW-STATE-FOLLOWING-TAGS");

    private static final SubLSymbol _CSETF_HSW_STATE_FOLLOWING_TAGS = makeSymbol("_CSETF-HSW-STATE-FOLLOWING-TAGS");

    private static final SubLSymbol HSW_STATE_CURRENT_OFFSET = makeSymbol("HSW-STATE-CURRENT-OFFSET");

    private static final SubLSymbol _CSETF_HSW_STATE_CURRENT_OFFSET = makeSymbol("_CSETF-HSW-STATE-CURRENT-OFFSET");

    private static final SubLSymbol MAKE_HTML_STRING_WORDIFY_STATE = makeSymbol("MAKE-HTML-STRING-WORDIFY-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HTML_STRING_WORDIFY_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTML-STRING-WORDIFY-STATE-METHOD");

    private static final SubLString $str110$__S__S_ = makeString("<~S ~S>");

    private static final SubLList $list111 = list(makeKeyword("STATE"), makeKeyword("NORMAL"), makeKeyword("CURRENT-OFFSET"), ZERO_INTEGER);

    private static final SubLSymbol $END_OF_TAG = makeKeyword("END-OF-TAG");

    private static final SubLSymbol $START_OF_TAG = makeKeyword("START-OF-TAG");

    static private final SubLList $list119 = list(makeKeyword("DEFAULT"), makeKeyword("START-OF-TAG"), makeKeyword("SPACE"));

    private static final SubLString $str120$Unknown_state___S = makeString("Unknown state: ~S");

    private static final SubLSymbol HTML_STRING_WORDIFY = makeSymbol("HTML-STRING-WORDIFY");

    private static final SubLSymbol FST_STRING_WORDIFY = makeSymbol("FST-STRING-WORDIFY");

    private static final SubLSymbol FST_WORDIFY_TEST = makeSymbol("FST-WORDIFY-TEST");

    private static final SubLList $list132 = list(new SubLObject[]{ list(list(makeString("2.4 cm")), list(makeString("2.4"), makeString("cm"))), list(list(makeString("Mr. Bill Clinton, president of the Clinton Foundation, met George W. Bush and gave him $400,000.00")), list(new SubLObject[]{ makeString("Mr."), makeString("Bill"), makeString("Clinton"), makeString(","), makeString("president"), makeString("of"), makeString("the"), makeString("Clinton"), makeString("Foundation"), makeString(","), makeString("met"), makeString("George"), makeString("W"), makeString("."), makeString("Bush"), makeString("and"), makeString("gave"), makeString("him"), makeString("$"), makeString("400,000.00"), makeSymbol(">") })), list(list(makeString("C.I.A. director Patrick Henry said, \"Give me liberty or give me death!\"")), list(new SubLObject[]{ makeString("C.I.A."), makeString("director"), makeString("Patrick"), makeString("Henry"), makeString("said"), makeString(","), makeString("\""), makeString("Give"), makeString("me"), makeString("liberty"), makeString("or"), makeString("give"), makeString("me"), makeString("death"), makeString("!"), makeString("\""), makeSymbol(">") })), list(list(makeString("I have -1 apples and 1-4 cats")), list(makeString("I"), makeString("have"), makeString("-"), makeString("1"), makeString("apples"), makeString("and"), makeString("1-4"), makeString("cats"))), list(list(makeString("I like cats.  You like zebras.")), list(new SubLObject[]{ makeString("I"), makeString("like"), makeString("cats"), makeString("."), makeString("You"), makeString("like"), makeString("zebras"), makeString("."), makeSymbol(">") })), list(list(makeString("I work for the C.I.A.  Where do you work?")), list(new SubLObject[]{ makeString("I"), makeString("work"), makeString("for"), makeString("the"), makeString("C.I.A."), makeString("Where"), makeString("do"), makeString("you"), makeString("work"), makeString("?") })), list(list(makeString("couldn't eat")), list(makeString("could"), makeString("n't"), makeString("eat"))), list(list(makeString("3^4")), list(makeString("3"), makeString("^"), makeString("4"))), list(list(makeString("bit-o'-honey")), list(makeString("bit-o"), makeString("'"), makeString("-"), makeString("honey"))), list(list(makeString("can't eat")), list(makeString("ca"), makeString("n't"), makeString("eat"))) });

    private static final SubLString $str133$_a_WRD_a__a__WRD__a = makeString("~a<WRD~a>~a</WRD>~a");

    private static final SubLString $str134$_tag__ = makeString(" tag=\"");

    static private final SubLList $list135 = list(makeString("."), makeString("!"), makeString("?"));

    private static final SubLList $list136 = list(makeString("\""), makeString("'"), makeString("`"));

    private static final SubLString $str137$_ = makeString("\n");

    private static final SubLList $list138 = list(new SubLObject[]{ makeString("."), makeString(","), makeString(";"), makeString(":"), makeString("?"), makeString("!"), makeString("-"), makeString("--"), makeString("---"), makeString("("), makeString(")"), makeString("["), makeString("]"), makeString("{"), makeString("}"), makeString("\""), makeString("'"), makeString("`") });

    private static final SubLList $list139 = list(CHAR_period, CHAR_question, CHAR_exclamation);

    static private final SubLList $list140 = list(new SubLObject[]{ CHAR_comma, CHAR_semicolon, CHAR_colon, CHAR_quote, CHAR_lparen, CHAR_rparen, CHAR_lbrace, CHAR_rbrace, CHAR_lbracket, CHAR_rbracket, CHAR_hyphen });

    static private final SubLList $list141 = list(CHAR_quotation, CHAR_quote, CHAR_backquote);

    private static final SubLSymbol PHRASE_P = makeSymbol("PHRASE-P");

    static private final SubLList $list143 = list(list(makeSymbol("CONSTITUENT"), makeSymbol("PHRASE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol SIGN_DO_CONSTITUENTS = makeSymbol("SIGN-DO-CONSTITUENTS");

    private static final SubLString $str145$_a_PHR_a__a_a_a__PHR__a = makeString("~a<PHR~a>~a~a~a</PHR>~a");

    private static final SubLString $str146$_cat__ = makeString(" cat=\"");

    private static final SubLList $list147 = list(list(makeSymbol("WORD"), makeSymbol("SENTENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol SENTENCE_YIELD_EXHAUSTIVE = makeSymbol("SENTENCE-YIELD-EXHAUSTIVE");

    private static final SubLSymbol SENTENCE_YIELD = makeSymbol("SENTENCE-YIELD");

    static private final SubLList $list152 = list(makeKeyword("OFFSET"), ZERO_INTEGER);

    private static final SubLList $list154 = list(list(makeSymbol("CONSTITUENT"), makeSymbol("SENTENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PUNCTUATION_SIGN_P = makeSymbol("PUNCTUATION-SIGN-P");

    private static final SubLSymbol PARAGRAPH_P = makeSymbol("PARAGRAPH-P");

    private static final SubLList $list159 = list(makeSymbol("SENTENCES"), makeSymbol("MOTHER"));

    private static final SubLList $list160 = list(makeKeyword("SENTENCES"), makeKeyword("MOTHER"));

    static private final SubLList $list161 = list(makeSymbol("PARAGRAPH-SENTENCES"), makeSymbol("PARAGRAPH-MOTHER"));

    static private final SubLList $list162 = list(makeSymbol("_CSETF-PARAGRAPH-SENTENCES"), makeSymbol("_CSETF-PARAGRAPH-MOTHER"));

    private static final SubLSymbol PARAGRAPH_PRINT = makeSymbol("PARAGRAPH-PRINT");

    private static final SubLSymbol PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list165 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PARAGRAPH-P"));

    private static final SubLSymbol PARAGRAPH_SENTENCES = makeSymbol("PARAGRAPH-SENTENCES");

    private static final SubLSymbol _CSETF_PARAGRAPH_SENTENCES = makeSymbol("_CSETF-PARAGRAPH-SENTENCES");

    private static final SubLSymbol PARAGRAPH_MOTHER = makeSymbol("PARAGRAPH-MOTHER");

    private static final SubLSymbol _CSETF_PARAGRAPH_MOTHER = makeSymbol("_CSETF-PARAGRAPH-MOTHER");

    private static final SubLSymbol MAKE_PARAGRAPH = makeSymbol("MAKE-PARAGRAPH");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PARAGRAPH_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARAGRAPH-METHOD");

    private static final SubLList $list173 = list(list(makeSymbol("SENTENCE"), makeSymbol("PARAGRAPH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list174 = list(list(makeSymbol("WORD"), makeSymbol("PARAGRAPH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym175$SENTENCE = makeUninternedSymbol("SENTENCE");

    private static final SubLSymbol PARAGRAPH_DO_SENTENCES = makeSymbol("PARAGRAPH-DO-SENTENCES");

    private static final SubLSymbol SENTENCE_DO_WORDS = makeSymbol("SENTENCE-DO-WORDS");

    private static final SubLSymbol $sym178$SENTENCE = makeUninternedSymbol("SENTENCE");

    private static final SubLSymbol SENTENCE_DO_MINIMAL_WORDS = makeSymbol("SENTENCE-DO-MINIMAL-WORDS");

    private static final SubLString $str180$__PAR_ = makeString("#<PAR:");

    private static final SubLString $str181$_PAR_ = makeString("<PAR>");

    private static final SubLString $str182$__PAR_ = makeString("</PAR>");

    private static final SubLSymbol DOCUMENT_P = makeSymbol("DOCUMENT-P");

    private static final SubLList $list185 = list(makeSymbol("PARAGRAPHS"));

    static private final SubLList $list186 = list(makeKeyword("PARAGRAPHS"));

    static private final SubLList $list187 = list(makeSymbol("DOCUMENT-PARAGRAPHS"));

    private static final SubLList $list188 = list(makeSymbol("_CSETF-DOCUMENT-PARAGRAPHS"));

    private static final SubLSymbol DOCUMENT_PRINT = makeSymbol("DOCUMENT-PRINT");

    private static final SubLSymbol DOCUMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DOCUMENT-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLList $list191 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DOCUMENT-P"));

    private static final SubLSymbol DOCUMENT_PARAGRAPHS = makeSymbol("DOCUMENT-PARAGRAPHS");

    private static final SubLSymbol _CSETF_DOCUMENT_PARAGRAPHS = makeSymbol("_CSETF-DOCUMENT-PARAGRAPHS");

    private static final SubLSymbol MAKE_DOCUMENT = makeSymbol("MAKE-DOCUMENT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DOCUMENT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DOCUMENT-METHOD");

    private static final SubLString $str197$_A_is_neither_a_string_nor_a_stre = makeString("~A is neither a string nor a stream in NEW-DOCUMENT.");

    static private final SubLList $list198 = list(list(makeSymbol("PARAGRAPH"), makeSymbol("DOCUMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list199 = list(list(makeSymbol("SENTENCE"), makeSymbol("DOCUMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym200$PARAGRAPH = makeUninternedSymbol("PARAGRAPH");

    private static final SubLSymbol DOCUMENT_DO_PARAGRAPHS = makeSymbol("DOCUMENT-DO-PARAGRAPHS");

    private static final SubLString $str202$_ = makeString(".");

    static private final SubLList $list203 = list(makeSymbol("FIRST-WORD"), makeSymbol("SECOND-WORD"), makeSymbol("SENT"));

    private static final SubLString $str205$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str207$__DOC_ = makeString("#<DOC:");

    private static final SubLString $str208$Sentence_index__A_out_of_bounds_ = makeString("Sentence index ~A out of bounds.");

    private static final SubLString $str209$_DOC_ = makeString("<DOC>");

    private static final SubLString $str210$__DOC_ = makeString("</DOC>");

    private static final SubLList $list211 = list(list(makeSymbol("WORD"), makeSymbol("DOCUMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym212$SENTENCE = makeUninternedSymbol("SENTENCE");

    private static final SubLSymbol DOCUMENT_DO_SENTENCES = makeSymbol("DOCUMENT-DO-SENTENCES");

    private static final SubLSymbol $sym214$SENTENCE = makeUninternedSymbol("SENTENCE");

    private static final SubLString $str215$can_t_create_sentence_iterator_fo = makeString("can't create sentence iterator for ~a");

    static private final SubLList $list217 = list(makeInteger(247), makeInteger(215));

    private static final SubLInteger $int$192 = makeInteger(192);

    private static final SubLInteger $int$591 = makeInteger(591);

    private static final SubLList $list220 = list(TWO_INTEGER);

    static private final SubLList $list221 = list(ZERO_INTEGER, CHAR_newline, list($EMIT), TWO_INTEGER);

    static private final SubLList $list223 = list(NIL, ZERO_INTEGER);

    static private final SubLList $list224 = list(ZERO_INTEGER, CHAR_M, list($EMIT), ELEVEN_INTEGER);

    static private final SubLList $list225 = list(ZERO_INTEGER, CHAR_D, list($EMIT), FOURTEEN_INTEGER);

    private static final SubLList $list226 = list(ZERO_INTEGER, CHAR_P, list($EMIT), SIXTEEN_INTEGER);

    static private final SubLList $list227 = list(ZERO_INTEGER, CHAR_L, list($EMIT), NINETEEN_INTEGER);

    static private final SubLList $list228 = list(ZERO_INTEGER, CHAR_n, list($EMIT), makeInteger(30));

    private static final SubLList $list229 = list(ZERO_INTEGER, CHAR_w, list($EMIT), makeInteger(32));

    static private final SubLList $list230 = list(ZERO_INTEGER, CHAR_h, list($EMIT), makeInteger(33));

    static private final SubLList $list231 = list(ZERO_INTEGER, CHAR_c, list($EMIT), makeInteger(36));

    static private final SubLList $list232 = list(ZERO_INTEGER, CHAR_i, list($EMIT), makeInteger(40));

    static private final SubLList $list233 = list(ZERO_INTEGER, CHAR_a, list($EMIT), makeInteger(48));

    private static final SubLSymbol ALPHABETIC_CHAR_OR_CHARACTER_CODE_P = makeSymbol("ALPHABETIC-CHAR-OR-CHARACTER-CODE-P");

    static private final SubLList $list235 = list(list($EMIT), ONE_INTEGER);

    private static final SubLSymbol $sym236$ISA_DIGIT_CHAR_ = makeSymbol("ISA-DIGIT-CHAR?");

    static private final SubLList $list237 = list(list($EMIT), makeInteger(44));

    static private final SubLList $list238 = list(ZERO_INTEGER, CHAR_hyphen, list($EMIT), NINE_INTEGER);

    static private final SubLList $list239 = list(ZERO_INTEGER, CHAR_underbar, list($EMIT), NINE_INTEGER);

    static private final SubLList $list240 = list(ZERO_INTEGER, CHAR_quote, list($EMIT), TWENTY_INTEGER);

    static private final SubLList $list241 = list(ZERO_INTEGER, CHAR_quotation, list($EMIT), TWO_INTEGER);

    private static final SubLSymbol $sym242$ANY_PUNCTUATION_CHAR_ = makeSymbol("ANY-PUNCTUATION-CHAR?");

    static private final SubLList $list243 = list(list($EMIT), TWO_INTEGER);

    private static final SubLSymbol $sym244$SENTENCE_INTERNAL_PUNCTUATION_CHAR_ = makeSymbol("SENTENCE-INTERNAL-PUNCTUATION-CHAR?");

    private static final SubLSymbol CHARACTER_OR_CHARACTER_CODE_P = makeSymbol("CHARACTER-OR-CHARACTER-CODE-P");

    private static final SubLSymbol UPPER_CASE_CHAR_P = makeSymbol("UPPER-CASE-CHAR-P");

    static private final SubLList $list247 = list(list($EMIT), makeInteger(51));

    private static final SubLSymbol ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P = makeSymbol("ALPHANUMERIC-CHAR-OR-CHARACTER-CODE-P");

    static private final SubLList $list249 = list(ONE_INTEGER, CHAR_period, list(makeKeyword("REMEMBER")), THREE_INTEGER);

    static private final SubLList $list250 = list(ONE_INTEGER, CHAR_newline, list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list251 = list(NIL, TWO_INTEGER);

    static private final SubLList $list252 = list(ONE_INTEGER, CHAR_hyphen, list(makeKeyword("REMEMBER")), EIGHT_INTEGER);

    static private final SubLList $list253 = list(list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLSymbol $sym254$QUOTE_CHAR_ = makeSymbol("QUOTE-CHAR?");

    static private final SubLList $list255 = list(ONE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list256 = list(list(makeKeyword("BACKUP")), FIVE_INTEGER);

    static private final SubLList $list257 = list(THREE_INTEGER, makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list258 = list(NIL, FOUR_INTEGER);

    static private final SubLList $list259 = list(list(makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLSymbol LOWER_CASE_CHAR_P = makeSymbol("LOWER-CASE-CHAR-P");

    static private final SubLList $list261 = list(list(makeKeyword("BACKUP")), SIX_INTEGER);

    static private final SubLList $list262 = list(FOUR_INTEGER, makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLSymbol $sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_ = makeSymbol("SENTENCE-FINAL-PUNCTUATION-CHAR?");

    static private final SubLList $list264 = list(FIVE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list265 = list(SIX_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list266 = list(EIGHT_INTEGER, CHAR_hyphen, list(makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list267 = list(list(makeKeyword("BACKUP")), TEN_INTEGER);

    static private final SubLList $list268 = list(EIGHT_INTEGER, makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list269 = list(NINE_INTEGER, CHAR_hyphen, list($EMIT), NINE_INTEGER);

    private static final SubLList $list270 = list(NINE_INTEGER, CHAR_underbar, list($EMIT), NINE_INTEGER);

    static private final SubLList $list271 = list(NINE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list272 = list(ELEVEN_INTEGER, CHAR_s, list($EMIT), THIRTEEN_INTEGER);

    private static final SubLList $list273 = list(ELEVEN_INTEGER, CHAR_r, list($EMIT), TWELVE_INTEGER);

    static private final SubLList $list274 = list(list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), ONE_INTEGER);

    static private final SubLList $list275 = list(ELEVEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list276 = list(TWELVE_INTEGER, CHAR_s, list($EMIT), THIRTEEN_INTEGER);

    static private final SubLList $list277 = list(TWELVE_INTEGER, CHAR_period, list($EMIT), ONE_INTEGER);

    static private final SubLList $list278 = list(TWELVE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list279 = list(THIRTEEN_INTEGER, CHAR_period, list($EMIT), ONE_INTEGER);

    static private final SubLList $list280 = list(THIRTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list281 = list(FOURTEEN_INTEGER, CHAR_r, list($EMIT), FIFTEEN_INTEGER);

    static private final SubLList $list282 = list(FOURTEEN_INTEGER, CHAR_o, list($EMIT), makeInteger(25));

    private static final SubLList $list283 = list(FOURTEEN_INTEGER, CHAR_i, list($EMIT), makeInteger(24));

    static private final SubLList $list284 = list(FOURTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list285 = list(FIFTEEN_INTEGER, CHAR_period, list($EMIT), ONE_INTEGER);

    private static final SubLList $list286 = list(FIFTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list287 = list(SIXTEEN_INTEGER, CHAR_r, list($EMIT), SEVENTEEN_INTEGER);

    static private final SubLList $list288 = list(SIXTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list289 = list(SEVENTEEN_INTEGER, CHAR_o, list($EMIT), EIGHTEEN_INTEGER);

    static private final SubLList $list290 = list(SEVENTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list291 = list(EIGHTEEN_INTEGER, CHAR_f, list($EMIT), FIFTEEN_INTEGER);

    static private final SubLList $list292 = list(EIGHTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list293 = list(NINETEEN_INTEGER, CHAR_t, list($EMIT), THIRTEEN_INTEGER);

    static private final SubLList $list294 = list(NINETEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list295 = list(TWENTY_INTEGER, CHAR_t, list($EMIT), makeInteger(21));

    private static final SubLList $list296 = list(TWENTY_INTEGER, CHAR_m, list($EMIT), makeInteger(21));

    static private final SubLList $list297 = list(TWENTY_INTEGER, CHAR_d, list($EMIT), makeInteger(21));

    private static final SubLList $list298 = list(TWENTY_INTEGER, CHAR_s, list($EMIT), makeInteger(21));

    static private final SubLList $list299 = list(TWENTY_INTEGER, CHAR_r, list($EMIT), makeInteger(22));

    static private final SubLList $list300 = list(TWENTY_INTEGER, CHAR_l, list($EMIT), makeInteger(23));

    private static final SubLList $list301 = list(TWENTY_INTEGER, CHAR_v, list($EMIT), makeInteger(47));

    static private final SubLList $list302 = list(TWENTY_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list303 = list(makeInteger(21), CHAR_newline, list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);



    static private final SubLList $list305 = list(makeInteger(21), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list306 = list(makeInteger(22), CHAR_e, list($EMIT), makeInteger(21));



    static private final SubLList $list308 = list(makeInteger(22), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list309 = list(makeInteger(23), CHAR_l, list($EMIT), makeInteger(21));



    static private final SubLList $list311 = list(makeInteger(23), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list312 = list(makeInteger(24), CHAR_d, list($EMIT), makeInteger(25));



    private static final SubLList $list314 = list(makeInteger(24), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list315 = list(makeInteger(25), CHAR_e, list($EMIT), makeInteger(26));

    static private final SubLList $list316 = list(makeInteger(25), CHAR_n, list(makeKeyword("REMEMBER")), makeInteger(27));



    static private final SubLList $list318 = list(makeInteger(25), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list319 = list(makeInteger(26), CHAR_s, list($EMIT), makeInteger(25));



    private static final SubLList $list321 = list(makeInteger(26), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list322 = list(makeInteger(27), CHAR_quote, NIL, makeInteger(28));



    private static final SubLList $list324 = list(list(makeKeyword("BACKUP")), ONE_INTEGER);

    static private final SubLList $list325 = list(makeInteger(27), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list326 = list(makeInteger(28), CHAR_t, list(makeKeyword("BACKUP")), TWO_INTEGER);



    static private final SubLList $list328 = list(list(makeKeyword("BACKUP")), makeInteger(29));

    static private final SubLList $list329 = list(makeInteger(28), makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);



    static private final SubLList $list331 = list(makeInteger(30), CHAR_quote, list($EMIT), makeInteger(31));



    private static final SubLList $list333 = list(makeInteger(30), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list334 = list(makeInteger(31), CHAR_t, list($EMIT), TWO_INTEGER);



    private static final SubLList $list336 = list(makeInteger(31), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list337 = list(makeInteger(32), CHAR_o, list($EMIT), makeInteger(25));

    static private final SubLList $list338 = list(makeInteger(32), CHAR_a, list($EMIT), makeInteger(41));

    private static final SubLList $list339 = list(makeInteger(32), CHAR_e, list($EMIT), makeInteger(42));

    static private final SubLList $list341 = list(makeInteger(32), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list342 = list(makeInteger(33), CHAR_a, list($EMIT), makeInteger(34));



    private static final SubLList $list344 = list(makeInteger(33), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list345 = list(makeInteger(34), CHAR_d, list($EMIT), makeInteger(25));

    static private final SubLList $list346 = list(makeInteger(34), CHAR_s, list($EMIT), makeInteger(25));

    static private final SubLList $list347 = list(makeInteger(34), CHAR_v, list($EMIT), makeInteger(35));



    static private final SubLList $list349 = list(makeInteger(34), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list350 = list(makeInteger(35), CHAR_e, list($EMIT), makeInteger(25));



    static private final SubLList $list352 = list(makeInteger(35), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list353 = list(makeInteger(36), CHAR_a, list($EMIT), makeInteger(25));

    static private final SubLList $list354 = list(makeInteger(36), CHAR_o, list($EMIT), makeInteger(37));



    static private final SubLList $list356 = list(makeInteger(36), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list357 = list(makeInteger(37), CHAR_u, list($EMIT), makeInteger(38));



    static private final SubLList $list359 = list(makeInteger(37), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list360 = list(makeInteger(38), CHAR_l, list($EMIT), makeInteger(39));



    private static final SubLList $list362 = list(makeInteger(38), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list363 = list(makeInteger(39), CHAR_d, list($EMIT), makeInteger(25));



    static private final SubLList $list365 = list(makeInteger(39), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list366 = list(makeInteger(40), CHAR_s, list($EMIT), makeInteger(25));



    private static final SubLList $list368 = list(makeInteger(40), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list369 = list(makeInteger(41), CHAR_s, list($EMIT), makeInteger(25));



    static private final SubLList $list371 = list(makeInteger(41), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list372 = list(makeInteger(42), CHAR_r, list($EMIT), makeInteger(43));



    private static final SubLList $list374 = list(makeInteger(42), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list375 = list(makeInteger(43), CHAR_e, list($EMIT), makeInteger(25));



    private static final SubLList $list377 = list(makeInteger(43), makeKeyword("END"), NIL, TWO_INTEGER);



    static private final SubLList $list379 = list(makeInteger(44), CHAR_period, list(makeKeyword("REMEMBER")), makeInteger(45));

    static private final SubLList $list380 = list(makeInteger(44), CHAR_comma, list(makeKeyword("REMEMBER")), makeInteger(49));

    static private final SubLList $list381 = list(makeInteger(44), makeKeyword("END"), NIL, TWO_INTEGER);



    private static final SubLList $list383 = list(list(makeKeyword("BACKUP")), makeInteger(46));

    private static final SubLList $list384 = list(list(makeKeyword("BACKUP")), THREE_INTEGER);

    private static final SubLList $list385 = list(makeInteger(45), makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list386 = list(makeInteger(46), CHAR_period, list($EMIT), makeInteger(44));



    static private final SubLList $list388 = list(makeInteger(46), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list389 = list(makeInteger(47), CHAR_e, list($EMIT), makeInteger(21));

    private static final SubLList $list390 = list(makeInteger(47), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list391 = list(makeInteger(48), CHAR_i, list($EMIT), makeInteger(25));



    private static final SubLList $list393 = list(makeInteger(48), makeKeyword("END"), NIL, TWO_INTEGER);



    private static final SubLList $list395 = list(list(makeKeyword("BACKUP")), makeInteger(50));

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLInteger $int$51 = makeInteger(51);

    private static final SubLList $list398 = list(makeInteger(51), CHAR_period, list($EMIT), ONE_INTEGER);

    private static final SubLList $list399 = list(makeInteger(51), CHAR_newline, list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLList $list400 = list(makeInteger(51), CHAR_hyphen, list(makeKeyword("REMEMBER")), EIGHT_INTEGER);

    private static final SubLList $list401 = list(makeInteger(51), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLSymbol BUILD_WORD_TOKEN = makeSymbol("BUILD-WORD-TOKEN");

    private static final SubLSymbol NEWLINE_WORD_P = makeSymbol("NEWLINE-WORD-P");

    private static final SubLSymbol END_OF_SENTENCE_WORD_P = makeSymbol("END-OF-SENTENCE-WORD-P");

    private static final SubLList $list405 = list(list(makeKeyword("REMEMBER")), THREE_INTEGER);

    private static final SubLList $list406 = list(list($EMIT), FOUR_INTEGER);

    private static final SubLList $list407 = list(THREE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLSymbol QUOTE_WORD_P = makeSymbol("QUOTE-WORD-P");

    private static final SubLList $list409 = list(FOUR_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLSymbol BUILD_SENTENCE_TOKEN = makeSymbol("BUILD-SENTENCE-TOKEN");

    private static final SubLSymbol NEWLINE_SENTENCE_P = makeSymbol("NEWLINE-SENTENCE-P");

    private static final SubLList $list412 = list(NIL, ONE_INTEGER);

    private static final SubLList $list413 = list(ZERO_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list414 = list(list($EMIT), ZERO_INTEGER);

    private static final SubLList $list415 = list(NIL, THREE_INTEGER);

    private static final SubLSymbol BUILD_PARAGRAPH_TOKEN = makeSymbol("BUILD-PARAGRAPH-TOKEN");

    private static final SubLString $str417$_C = makeString("~C");

    private static final SubLString $str418$______ = makeString("[\\.!?]");

    private static final SubLString $str419$____________________ = makeString("(?:\'|\"|\'\'|\\)|\\]|\\})?");

    private static final SubLList $list420 = list(new SubLObject[]{ makeString("jr"), makeString("mr"), makeString("mrs"), makeString("ms"), makeString("dr"), makeString("prof"), makeString("sr"), makeString("sens?"), makeString("reps?"), makeString("gov"), makeString("attys?"), makeString("supt"), makeString("det"), makeString("rev") });

    private static final SubLList $list421 = list(new SubLObject[]{ makeString("col"), makeString("gen"), makeString("lt"), makeString("cmdr"), makeString("adm"), makeString("capt"), makeString("sgt"), makeString("cpl"), makeString("maj") });

    private static final SubLList $list422 = list(makeString("inc"), makeString("ltd"), makeString("co"), makeString("corp"));

    private static final SubLString $$$arc = makeString("arc");

    private static final SubLString $$$al = makeString("al");

    private static final SubLString $$$ave = makeString("ave");

    private static final SubLString $str426$blv_d = makeString("blv?d");

    private static final SubLString $$$cl = makeString("cl");

    private static final SubLString $$$ct = makeString("ct");

    private static final SubLString $$$cres = makeString("cres");

    private static final SubLString $$$dr = makeString("dr");

    private static final SubLString $str431$expy_ = makeString("expy?");

    private static final SubLString $$$dist = makeString("dist");

    private static final SubLString $$$mt = makeString("mt");

    private static final SubLString $$$ft = makeString("ft");

    private static final SubLString $str435$fw_y = makeString("fw?y");

    private static final SubLString $str436$hwa_y = makeString("hwa?y");

    private static final SubLString $$$la = makeString("la");

    private static final SubLString $str438$pde_ = makeString("pde?");

    private static final SubLString $$$pl = makeString("pl");

    private static final SubLString $$$plz = makeString("plz");

    private static final SubLString $$$rd = makeString("rd");

    private static final SubLString $$$st = makeString("st");

    private static final SubLString $$$tce = makeString("tce");

    private static final SubLString $$$Ala = makeString("Ala");

    private static final SubLString $$$Ariz = makeString("Ariz");

    private static final SubLString $$$Ark = makeString("Ark");

    private static final SubLString $$$Cal = makeString("Cal");

    private static final SubLString $$$Calif = makeString("Calif");

    private static final SubLString $$$Col = makeString("Col");

    private static final SubLString $$$Colo = makeString("Colo");

    private static final SubLString $$$Conn = makeString("Conn");

    private static final SubLString $$$Del = makeString("Del");

    private static final SubLString $$$Fed = makeString("Fed");

    private static final SubLString $$$Fla = makeString("Fla");

    private static final SubLString $$$Ga = makeString("Ga");

    private static final SubLString $$$Ida = makeString("Ida");

    private static final SubLString $$$Id = makeString("Id");

    private static final SubLString $$$Ill = makeString("Ill");

    private static final SubLString $$$Ind = makeString("Ind");

    private static final SubLString $$$Ia = makeString("Ia");

    private static final SubLString $$$Kan = makeString("Kan");

    private static final SubLString $$$Kans = makeString("Kans");

    private static final SubLString $$$Ken = makeString("Ken");

    private static final SubLString $$$Ky = makeString("Ky");

    private static final SubLString $$$La = makeString("La");

    private static final SubLString $$$Me = makeString("Me");

    private static final SubLString $$$Md = makeString("Md");

    private static final SubLString $$$Is = makeString("Is");

    private static final SubLString $$$Mass = makeString("Mass");

    private static final SubLString $$$Mich = makeString("Mich");

    private static final SubLString $$$Minn = makeString("Minn");

    private static final SubLString $$$Miss = makeString("Miss");

    private static final SubLString $$$Mo = makeString("Mo");

    private static final SubLString $$$Mont = makeString("Mont");

    private static final SubLString $$$Neb = makeString("Neb");

    private static final SubLString $$$Nebr = makeString("Nebr");

    private static final SubLString $$$Nev = makeString("Nev");

    private static final SubLString $$$Mex = makeString("Mex");

    private static final SubLString $$$Okla = makeString("Okla");

    private static final SubLString $$$Ok = makeString("Ok");

    private static final SubLString $$$Ore = makeString("Ore");

    private static final SubLString $$$Penna = makeString("Penna");

    private static final SubLString $$$Penn = makeString("Penn");

    private static final SubLString $$$Pa = makeString("Pa");

    private static final SubLString $$$Dak = makeString("Dak");

    private static final SubLString $$$Tenn = makeString("Tenn");

    private static final SubLString $$$Tex = makeString("Tex");

    private static final SubLString $$$Ut = makeString("Ut");

    private static final SubLString $$$Vt = makeString("Vt");

    private static final SubLString $$$Va = makeString("Va");

    private static final SubLString $$$Wash = makeString("Wash");

    private static final SubLString $$$Wis = makeString("Wis");

    private static final SubLString $$$Wisc = makeString("Wisc");

    private static final SubLString $$$Wy = makeString("Wy");

    private static final SubLString $$$Wyo = makeString("Wyo");

    private static final SubLString $$$USAFA = makeString("USAFA");

    private static final SubLString $$$Alta = makeString("Alta");

    private static final SubLString $$$Man = makeString("Man");

    private static final SubLString $$$Ont = makeString("Ont");

    private static final SubLString $$$Sask = makeString("Sask");

    private static final SubLString $$$Yuk = makeString("Yuk");

    private static final SubLList $list502 = list(new SubLObject[]{ makeString("jan"), makeString("feb"), makeString("mar"), makeString("apr"), makeString("may"), makeString("jun"), makeString("jul"), makeString("aug"), makeString("sep"), makeString("oct"), makeString("nov"), makeString("dec"), makeString("sept") });

    private static final SubLList $list503 = list(makeString("vs"), makeString("sec"), makeString("no"), makeString("esp"));

    private static final SubLString $str504$_n_s__n = makeString("\\n\\s*\\n");

    private static final SubLString $str505$_s_ = makeString("\\s)");

    private static final SubLString $str506$_1 = makeString("\\1");

    private static final SubLString $str507$__s_w = makeString("(\\s\\w");

    private static final SubLString $str508$_____w__w = makeString("([^-\\w]\\w");

    private static final SubLString $str509$__s_w___s__ = makeString("(\\s\\w\\.\\s+)");

    private static final SubLString $str510$_________ = makeString("(\\.\\.\\. )");

    private static final SubLString $str511$____lower____ = makeString("([[:lower:]])");

    private static final SubLString $str512$_1_2 = makeString("\\1\\2");

    private static final SubLString $str513$_____ = makeString("([\'\"]");

    private static final SubLString $str514$_____s__ = makeString("[\'\"]\\s+)");

    private static final SubLString $str515$______s__ = makeString("([\"\']\\s*)");

    private static final SubLString $str516$__s____lower____ = makeString("(\\s*[[:lower:]])");

    private static final SubLString $str517$__s___s_ = makeString("(\\s\\.\\s)");

    private static final SubLString $str518$__s__ = makeString("(\\s*)");

    private static final SubLString $str519$__s = makeString("(\\s");

    private static final SubLString $str520$__D_d___ = makeString("(\\D\\d+)(");

    private static final SubLString $str521$___s__ = makeString(")(\\s+)");

    private static final SubLString $str522$_3 = makeString("\\3");

    private static final SubLString $str523$___w = makeString("(\'\\w");

    private static final SubLString $str524$___s_ = makeString(")(\\s)");

    private static final SubLString $str525$_2 = makeString("\\2");

    private static final SubLString $str526$__sno_____s______d_ = makeString("(\\sno\\.)(\\s+)(?!\\d)");

    private static final SubLList $list527 = list(makeKeyword("CASELESS"));

    private static final SubLString $str528$__ap___m___s______upper____ = makeString("([ap]\\.m\\.\\s+)([[:upper:]])");

    private static final SubLList $list529 = cons(makeSymbol("PATTERN"), makeSymbol("SUBSTITUTION"));

    private static final SubLString $str530$Can_t_finalize__a__not_a_regular_ = makeString("Can't finalize ~a: not a regular expression pattern");

    private static final SubLSymbol SENTENCIFY_STRING = makeSymbol("SENTENCIFY-STRING");

    private static final SubLString $str532$__b = makeString("(\\b");

    private static final SubLList $list533 = list(makeSymbol("RE"), makeSymbol("SUBSTITUTION"), makeSymbol("OPTIONS"));

    private static final SubLString $str534$Can_t_compile_regular_expression_ = makeString("Can't compile regular expression ~a: ~a");

    private static final SubLSymbol NEW_DOCUMENT = makeSymbol("NEW-DOCUMENT");

    private static final SubLSymbol $sym536$DOCUMENT_SENTENCE_COUNT_ = makeSymbol("DOCUMENT-SENTENCE-COUNT=");

    private static final SubLList $list538 = list(list(list(makeString("I love Elmer Fudgsicle's suits.  He had wonderful taste."), NIL, makeSymbol("FST-STRING-WORDIFY")), ONE_INTEGER), list(list(makeString("I love Elmer Fudgsicle's suits.  He had wonderful taste.")), TWO_INTEGER));

    private static final SubLSymbol TEST_CONSTRUCT_STRING_FROM_WORDS = makeSymbol("TEST-CONSTRUCT-STRING-FROM-WORDS");

    private static final SubLList $list540 = list(list(list(list(makeSymbol("FIRST-N"), TWO_INTEGER, list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("3.4 billion cats")))))), makeString("3.4 billion")), list(list(list(makeSymbol("LIST"), list(makeSymbol("SECOND"), list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("3.4 billion cats"))))))), makeString("billion")), list(list(list(makeSymbol("LIST"), list(makeSymbol("FIRST"), list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("U.S.")))))), T), makeString("US")), list(list(list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("U.S. Defense")))), T), makeString("US Defense")), list(list(list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("US Defense")))), T), makeString("US Defense")), list(list(list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("US Defense")))), NIL), makeString("US Defense")), list(list(list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("U.S.")))), NIL), makeString("U.S.")));

    public static final SubLObject sign_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        sign_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sign_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sign_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sign_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.document.$sign_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sign_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.document.$sign_native.class ? T : NIL;
    }

    public static final SubLObject sign_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.getField2();
    }

    public static SubLObject sign_string(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sign_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.getField3();
    }

    public static SubLObject sign_type(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject sign_info_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.getField4();
    }

    public static SubLObject sign_info(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject sign_category_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.getField5();
    }

    public static SubLObject sign_category(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject sign_constituents_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.getField6();
    }

    public static SubLObject sign_constituents(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject sign_offset_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.getField7();
    }

    public static SubLObject sign_offset(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject sign_mother_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.getField8();
    }

    public static SubLObject sign_mother(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_sign_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sign_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sign_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sign_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sign_info_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sign_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sign_category_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sign_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sign_constituents_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sign_constituents(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sign_offset_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sign_offset(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sign_mother_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIGN_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sign_mother(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "! document.sign_p(v_object) " + "document.sign_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_sign_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.document.$sign_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($STRING)) {
                        _csetf_sign_string(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TYPE)) {
                            _csetf_sign_type(v_new, current_value);
                        } else {
                            if (pcase_var.eql($INFO)) {
                                _csetf_sign_info(v_new, current_value);
                            } else {
                                if (pcase_var.eql($CATEGORY)) {
                                    _csetf_sign_category(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($CONSTITUENTS)) {
                                        _csetf_sign_constituents(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($OFFSET)) {
                                            _csetf_sign_offset(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($MOTHER)) {
                                                _csetf_sign_mother(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_sign(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.document.$sign_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STRING)) {
                _csetf_sign_string(v_new, current_value);
            } else
                if (pcase_var.eql($TYPE)) {
                    _csetf_sign_type(v_new, current_value);
                } else
                    if (pcase_var.eql($INFO)) {
                        _csetf_sign_info(v_new, current_value);
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            _csetf_sign_category(v_new, current_value);
                        } else
                            if (pcase_var.eql($CONSTITUENTS)) {
                                _csetf_sign_constituents(v_new, current_value);
                            } else
                                if (pcase_var.eql($OFFSET)) {
                                    _csetf_sign_offset(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MOTHER)) {
                                        _csetf_sign_mother(v_new, current_value);
                                    } else {
                                        Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sign(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SIGN, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STRING, sign_string(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE, sign_type(obj));
        funcall(visitor_fn, obj, $SLOT, $INFO, sign_info(obj));
        funcall(visitor_fn, obj, $SLOT, $CATEGORY, sign_category(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTITUENTS, sign_constituents(obj));
        funcall(visitor_fn, obj, $SLOT, $OFFSET, sign_offset(obj));
        funcall(visitor_fn, obj, $SLOT, $MOTHER, sign_mother(obj));
        funcall(visitor_fn, obj, $END, MAKE_SIGN, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sign_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sign(obj, visitor_fn);
    }

    /**
     *
     *
     * @return sign; a newly created sign
     */
    @LispMethod(comment = "@return sign; a newly created sign")
    public static final SubLObject new_sign_alt() {
        {
            SubLObject sign = make_sign(UNPROVIDED);
            _csetf_sign_type(sign, $SIGN);
            _csetf_sign_string(sign, $str_alt32$);
            return sign;
        }
    }

    /**
     *
     *
     * @return sign; a newly created sign
     */
    @LispMethod(comment = "@return sign; a newly created sign")
    public static SubLObject new_sign() {
        final SubLObject sign = make_sign(UNPROVIDED);
        _csetf_sign_type(sign, $SIGN);
        _csetf_sign_string(sign, $str38$);
        return sign;
    }

    public static final SubLObject sxhash_sign_alt(SubLObject sign) {
        {
            SubLObject id = (NIL != pph_phrase.pph_phrase_p(sign, UNPROVIDED)) ? ((SubLObject) (pph_phrase.pph_phrase_suid(sign))) : NIL;
            if (id.isFixnum()) {
                return id;
            } else {
                return Sxhash.sxhash(sign_string(sign));
            }
        }
    }

    public static SubLObject sxhash_sign(final SubLObject sign) {
        final SubLObject id = (NIL != pph_phrase.pph_phrase_p(sign, UNPROVIDED)) ? pph_phrase.pph_phrase_suid(sign) : NIL;
        if (id.isFixnum()) {
            return id;
        }
        return Sxhash.sxhash(sign_string(sign));
    }

    public static final SubLObject sxhash_sign_method_alt(SubLObject v_object) {
        return sxhash_sign(v_object);
    }

    public static SubLObject sxhash_sign_method(final SubLObject v_object) {
        return sxhash_sign(v_object);
    }

    /**
     * Pretty-print SIGN to STREAM
     */
    @LispMethod(comment = "Pretty-print SIGN to STREAM")
    public static final SubLObject sign_print_alt(SubLObject sign, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sign, SIGN_P);
            if (NIL != pph_phrase.pph_phrase_p(sign, UNPROVIDED)) {
                if (NIL != pph_vars.verbose_print_pph_phrasesP()) {
                    pph_phrase.verbose_print_pph_phrase(sign, stream);
                } else {
                    pph_phrase.terse_print_pph_phrase(sign, stream);
                }
            } else {
                write_string($str_alt34$__, stream, UNPROVIDED, UNPROVIDED);
                princ(sign_type(sign), stream);
                if (NIL != sign_category(sign)) {
                    write_string($str_alt35$_, stream, UNPROVIDED, UNPROVIDED);
                    princ(sign_category(sign), stream);
                    write_string($str_alt36$_, stream, UNPROVIDED, UNPROVIDED);
                }
                write_string($str_alt37$__, stream, UNPROVIDED, UNPROVIDED);
                if ((NIL != word_p(sign)) || ((NIL != pph_phrase.pph_phrase_p(sign, UNPROVIDED)) && sign_string(sign).isString())) {
                    write_string(cconcatenate($str_alt38$_, new SubLObject[]{ sign_string(sign), $str_alt38$_ }), stream, UNPROVIDED, UNPROVIDED);
                } else {
                    {
                        SubLObject cdotimes_end_var = min(sign_length(sign), $text_class_print_length$.getDynamicValue(thread));
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                            write_string($str_alt39$_, stream, UNPROVIDED, UNPROVIDED);
                            sign_print(sign_get(sign, i), stream, ZERO_INTEGER);
                        }
                    }
                }
                if ($text_class_print_length$.getDynamicValue(thread).numL(sign_length(sign))) {
                    write_string($str_alt40$____, stream, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != sign_info(sign)) {
                    princ($str_alt41$_, stream);
                    princ(sign_info(sign), stream);
                }
                write_string($str_alt42$_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
            }
            return sign;
        }
    }

    /**
     * Pretty-print SIGN to STREAM
     */
    @LispMethod(comment = "Pretty-print SIGN to STREAM")
    public static SubLObject sign_print(final SubLObject sign, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sign_p(sign) : "! document.sign_p(sign) " + ("document.sign_p(sign) " + "CommonSymbols.NIL != document.sign_p(sign) ") + sign;
        if (NIL != pph_phrase.pph_phrase_p(sign, UNPROVIDED)) {
            if (NIL != pph_vars.verbose_print_pph_phrasesP()) {
                pph_phrase.verbose_print_pph_phrase(sign, stream);
            } else {
                pph_phrase.terse_print_pph_phrase(sign, stream);
            }
        } else {
            write_string($str40$__, stream, UNPROVIDED, UNPROVIDED);
            princ(sign_type(sign), stream);
            if (NIL != sign_category(sign)) {
                write_string($str41$_, stream, UNPROVIDED, UNPROVIDED);
                princ(sign_category(sign), stream);
                write_string($str42$_, stream, UNPROVIDED, UNPROVIDED);
            }
            write_string($str43$__, stream, UNPROVIDED, UNPROVIDED);
            if ((NIL != word_p(sign)) || ((NIL != pph_phrase.pph_phrase_p(sign, UNPROVIDED)) && sign_string(sign).isString())) {
                write_string(cconcatenate($str44$_, new SubLObject[]{ sign_string(sign), $str44$_ }), stream, UNPROVIDED, UNPROVIDED);
            } else {
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = min(sign_length(sign), $text_class_print_length$.getDynamicValue(thread)), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                    sign_print(sign_get(sign, i), stream, ZERO_INTEGER);
                }
            }
            if ($text_class_print_length$.getDynamicValue(thread).numL(sign_length(sign))) {
                write_string($str46$____, stream, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != sign_info(sign)) {
                princ($str47$_, stream);
                princ(sign_info(sign), stream);
            }
            write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
            terpri(stream);
        }
        return sign;
    }

    /**
     *
     *
     * @param SIGN
    sign-p
     * 		
     * @param INDEX
    integerp
     * 		
     * @return object; the INDEXth object of SIGN
     */
    @LispMethod(comment = "@param SIGN\nsign-p\r\n\t\t\r\n@param INDEX\nintegerp\r\n\t\t\r\n@return object; the INDEXth object of SIGN")
    public static final SubLObject sign_get_alt(SubLObject sign, SubLObject index) {
        return aref(sign_constituents(sign), index);
    }

    /**
     *
     *
     * @param SIGN
    sign-p
     * 		
     * @param INDEX
    integerp
     * 		
     * @return object; the INDEXth object of SIGN
     */
    @LispMethod(comment = "@param SIGN\nsign-p\r\n\t\t\r\n@param INDEX\nintegerp\r\n\t\t\r\n@return object; the INDEXth object of SIGN")
    public static SubLObject sign_get(final SubLObject sign, final SubLObject index) {
        return aref(sign_constituents(sign), index);
    }

    /**
     * Destructively set SIGN's INDEXth constituent to OBJECT
     *
     * @param SIGN
    sign-p
     * 		
     * @param INDEX
    integerp
     * 		
     * @return OBJECT; the previous INDEXth object of SIGN
     */
    @LispMethod(comment = "Destructively set SIGN\'s INDEXth constituent to OBJECT\r\n\r\n@param SIGN\nsign-p\r\n\t\t\r\n@param INDEX\nintegerp\r\n\t\t\r\n@return OBJECT; the previous INDEXth object of SIGN")
    public static final SubLObject sign_set_alt(SubLObject sign, SubLObject index, SubLObject v_object) {
        {
            SubLObject old_object = aref(sign_constituents(sign), index);
            set_aref(sign_constituents(sign), index, v_object);
            _csetf_sign_mother(v_object, sign);
            return old_object;
        }
    }

    /**
     * Destructively set SIGN's INDEXth constituent to OBJECT
     *
     * @param SIGN
    		sign-p
     * 		
     * @param INDEX
    		integerp
     * 		
     * @return OBJECT; the previous INDEXth object of SIGN
     */
    @LispMethod(comment = "Destructively set SIGN\'s INDEXth constituent to OBJECT\r\n\r\n@param SIGN\n\t\tsign-p\r\n\t\t\r\n@param INDEX\n\t\tintegerp\r\n\t\t\r\n@return OBJECT; the previous INDEXth object of SIGN")
    public static SubLObject sign_set(final SubLObject sign, final SubLObject index, final SubLObject v_object) {
        final SubLObject old_object = aref(sign_constituents(sign), index);
        set_aref(sign_constituents(sign), index, v_object);
        _csetf_sign_mother(v_object, sign);
        return old_object;
    }

    /**
     *
     *
     * @param sign
    sign-p
     * 		
     * @return integer; the number of constituent in SIGN
     */
    @LispMethod(comment = "@param sign\nsign-p\r\n\t\t\r\n@return integer; the number of constituent in SIGN")
    public static final SubLObject sign_length_alt(SubLObject sign) {
        return length(sign_constituents(sign));
    }

    /**
     *
     *
     * @param sign
    sign-p
     * 		
     * @return integer; the number of constituent in SIGN
     */
    @LispMethod(comment = "@param sign\nsign-p\r\n\t\t\r\n@return integer; the number of constituent in SIGN")
    public static SubLObject sign_length(final SubLObject sign) {
        return length(sign_constituents(sign));
    }

    /**
     *
     *
     * @param SIGN
    sign-p
     * 		
     * @param SLOT-VALUES
     * 		listp; a list in the format (<:slot-name1> <value1> ... <:slot-namen> <valuen>)
     * @return sign; a version of SIGN whose slots has been updated with the appropriate values
     * @unknown SIGN is destructively modified
     */
    @LispMethod(comment = "@param SIGN\nsign-p\r\n\t\t\r\n@param SLOT-VALUES\r\n\t\tlistp; a list in the format (<:slot-name1> <value1> ... <:slot-namen> <valuen>)\r\n@return sign; a version of SIGN whose slots has been updated with the appropriate values\r\n@unknown SIGN is destructively modified")
    public static final SubLObject sign_update_alt(SubLObject sign, SubLObject slot_values) {
        SubLTrampolineFile.checkType(sign, SIGN_P);
        SubLTrampolineFile.checkType(slot_values, LISTP);
        {
            SubLObject remaining_slot_values = NIL;
            SubLObject slot = NIL;
            SubLObject value = NIL;
            for (remaining_slot_values = slot_values, slot = remaining_slot_values.first(), value = second(remaining_slot_values); NIL != slot; remaining_slot_values = remaining_slot_values.rest().rest() , slot = remaining_slot_values.first() , value = second(remaining_slot_values)) {
                {
                    SubLObject pcase_var = slot;
                    if (pcase_var.eql($STRING)) {
                        SubLTrampolineFile.checkType(value, STRINGP);
                        _csetf_sign_string(sign, value);
                    } else {
                        if (pcase_var.eql($CATEGORY)) {
                            _csetf_sign_category(sign, value);
                        } else {
                            if (pcase_var.eql($CONSTITUENTS)) {
                                SubLTrampolineFile.checkType(value, VECTORP);
                                _csetf_sign_constituents(sign, value);
                            } else {
                                if (pcase_var.eql($OFFSET)) {
                                    _csetf_sign_offset(sign, value);
                                } else {
                                    if (pcase_var.eql($INFO)) {
                                        _csetf_sign_info(sign, value);
                                    } else {
                                        if (pcase_var.eql($MOTHER)) {
                                            _csetf_sign_mother(sign, value);
                                        } else {
                                            Errors.error($str_alt46$Attempt_to_set_the_non_existing_s, slot);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return sign;
    }

    /**
     *
     *
     * @param SIGN
    sign-p
     * 		
     * @param SLOT-VALUES
     * 		listp; a list in the format (<:slot-name1> <value1> ... <:slot-namen> <valuen>)
     * @return sign; a version of SIGN whose slots has been updated with the appropriate values
     * @unknown SIGN is destructively modified
     */
    @LispMethod(comment = "@param SIGN\nsign-p\r\n\t\t\r\n@param SLOT-VALUES\r\n\t\tlistp; a list in the format (<:slot-name1> <value1> ... <:slot-namen> <valuen>)\r\n@return sign; a version of SIGN whose slots has been updated with the appropriate values\r\n@unknown SIGN is destructively modified")
    public static SubLObject sign_update(final SubLObject sign, final SubLObject slot_values) {
        assert NIL != sign_p(sign) : "! document.sign_p(sign) " + ("document.sign_p(sign) " + "CommonSymbols.NIL != document.sign_p(sign) ") + sign;
        assert NIL != listp(slot_values) : "! listp(slot_values) " + ("Types.listp(slot_values) " + "CommonSymbols.NIL != Types.listp(slot_values) ") + slot_values;
        SubLObject remaining_slot_values = NIL;
        SubLObject slot = NIL;
        SubLObject value = NIL;
        remaining_slot_values = slot_values;
        slot = remaining_slot_values.first();
        value = second(remaining_slot_values);
        while (NIL != slot) {
            final SubLObject pcase_var = slot;
            if (pcase_var.eql($STRING)) {
                assert NIL != stringp(value) : "! stringp(value) " + ("Types.stringp(value) " + "CommonSymbols.NIL != Types.stringp(value) ") + value;
                _csetf_sign_string(sign, value);
            } else
                if (pcase_var.eql($CATEGORY)) {
                    _csetf_sign_category(sign, value);
                } else
                    if (pcase_var.eql($CONSTITUENTS)) {
                        assert NIL != vectorp(value) : "! vectorp(value) " + ("Types.vectorp(value) " + "CommonSymbols.NIL != Types.vectorp(value) ") + value;
                        _csetf_sign_constituents(sign, value);
                    } else
                        if (pcase_var.eql($OFFSET)) {
                            _csetf_sign_offset(sign, value);
                        } else
                            if (pcase_var.eql($INFO)) {
                                _csetf_sign_info(sign, value);
                            } else
                                if (pcase_var.eql($MOTHER)) {
                                    _csetf_sign_mother(sign, value);
                                } else {
                                    Errors.error($str52$Attempt_to_set_the_non_existing_s, slot);
                                }





            remaining_slot_values = remaining_slot_values.rest().rest();
            slot = remaining_slot_values.first();
            value = second(remaining_slot_values);
        } 
        return sign;
    }

    /**
     *
     *
     * @param CONSTITUENT
    variable
     * 		
     * @param SIGN
     * 		sign-p
     * 		Execute BODY with CONSTITUTENT successively bound to each constituent in SIGN
     */
    @LispMethod(comment = "@param CONSTITUENT\nvariable\r\n\t\t\r\n@param SIGN\r\n\t\tsign-p\r\n\t\tExecute BODY with CONSTITUTENT successively bound to each constituent in SIGN")
    public static final SubLObject sign_do_constituents_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt47);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject constituent = NIL;
                    SubLObject sign = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    constituent = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    sign = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOVECTOR, list(constituent, list(SIGN_CONSTITUENTS, sign)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt47);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param CONSTITUENT
    variable
     * 		
     * @param SIGN
     * 		sign-p
     * 		Execute BODY with CONSTITUTENT successively bound to each constituent in SIGN
     */
    @LispMethod(comment = "@param CONSTITUENT\nvariable\r\n\t\t\r\n@param SIGN\r\n\t\tsign-p\r\n\t\tExecute BODY with CONSTITUTENT successively bound to each constituent in SIGN")
    public static SubLObject sign_do_constituents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constituent = NIL;
        SubLObject sign = NIL;
        destructuring_bind_must_consp(current, datum, $list53);
        constituent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list53);
        sign = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOVECTOR, list(constituent, list(SIGN_CONSTITUENTS, sign)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list53);
        return NIL;
    }

    /**
     *
     *
     * @param SIGN
     * 		sign-p; the sign whose yield is to be computed
     * @return list; a list of all leaves of SIGN
     */
    @LispMethod(comment = "@param SIGN\r\n\t\tsign-p; the sign whose yield is to be computed\r\n@return list; a list of all leaves of SIGN")
    public static final SubLObject sign_yield_alt(SubLObject sign) {
        {
            SubLObject words = NIL;
            if (NIL != word_p(sign)) {
                words = cons(sign, words);
            } else {
                {
                    SubLObject vector_var = sign_constituents(sign);
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject constituent = aref(vector_var, element_num);
                            words = nconc(words, sign_yield(constituent));
                        }
                    }
                }
            }
            return words;
        }
    }

    /**
     *
     *
     * @param SIGN
     * 		sign-p; the sign whose yield is to be computed
     * @return list; a list of all leaves of SIGN
     */
    @LispMethod(comment = "@param SIGN\r\n\t\tsign-p; the sign whose yield is to be computed\r\n@return list; a list of all leaves of SIGN")
    public static SubLObject sign_yield(final SubLObject sign) {
        SubLObject words = NIL;
        if (NIL != word_p(sign)) {
            words = cons(sign, words);
        } else {
            final SubLObject vector_var = sign_constituents(sign);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject constituent;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                constituent = aref(vector_var, element_num);
                words = nconc(words, sign_yield(constituent));
            }
        }
        return words;
    }

    /**
     *
     *
     * @param SIGN
    sign-p
     * 		
     * @return list; a list of interval-tokens <START end node> for each node in SIGN,
    where the longest node is guaranteed to be first in the list
     * @unknown suboptimal implementation; sign shouldn't know about it's inheritors word
    and phrase; we should do this in SubLoops
     */
    @LispMethod(comment = "@param SIGN\nsign-p\r\n\t\t\r\n@return list; a list of interval-tokens <START end node> for each node in SIGN,\r\nwhere the longest node is guaranteed to be first in the list\r\n@unknown suboptimal implementation; sign shouldn\'t know about it\'s inheritors word\r\nand phrase; we should do this in SubLoops")
    public static final SubLObject sign_intervals_alt(SubLObject sign, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        SubLTrampolineFile.checkType(sign, SIGN_P);
        SubLTrampolineFile.checkType(start, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject pcase_var = sign_type(sign);
            if (pcase_var.eql($W)) {
                return word_intervals(sign, start);
            } else {
                if (pcase_var.eql($P)) {
                    return phrase_intervals(sign, start);
                } else {
                    Errors.error($str_alt52$Unknown_sign_subclass__a, sign_type(sign));
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param SIGN
    sign-p
     * 		
     * @return list; a list of interval-tokens <START end node> for each node in SIGN,
    where the longest node is guaranteed to be first in the list
     * @unknown suboptimal implementation; sign shouldn't know about it's inheritors word
    and phrase; we should do this in SubLoops
     */
    @LispMethod(comment = "@param SIGN\nsign-p\r\n\t\t\r\n@return list; a list of interval-tokens <START end node> for each node in SIGN,\r\nwhere the longest node is guaranteed to be first in the list\r\n@unknown suboptimal implementation; sign shouldn\'t know about it\'s inheritors word\r\nand phrase; we should do this in SubLoops")
    public static SubLObject sign_intervals(final SubLObject sign, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        assert NIL != sign_p(sign) : "! document.sign_p(sign) " + ("document.sign_p(sign) " + "CommonSymbols.NIL != document.sign_p(sign) ") + sign;
        assert NIL != subl_promotions.non_negative_integer_p(start) : "! subl_promotions.non_negative_integer_p(start) " + ("subl_promotions.non_negative_integer_p(start) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(start) ") + start;
        final SubLObject pcase_var = sign_type(sign);
        if (pcase_var.eql($W)) {
            return word_intervals(sign, start);
        }
        if (pcase_var.eql($P)) {
            return phrase_intervals(sign, start);
        }
        Errors.error($str58$Unknown_sign_subclass__a, sign_type(sign));
        return NIL;
    }

    public static SubLObject new_exhaustive_word(SubLObject slot_values) {
        if (slot_values == UNPROVIDED) {
            slot_values = NIL;
        }
        final SubLObject word = new_word(slot_values);
        _csetf_sign_type(word, $XW);
        return word;
    }

    public static SubLObject new_exhaustive_word_from_word(final SubLObject original_word) {
        final SubLObject new_word = copy_word(original_word);
        _csetf_sign_type(new_word, $XW);
        return new_word;
    }

    public static SubLObject exhaustive_word_p(final SubLObject v_object) {
        return makeBoolean((NIL != sign_p(v_object)) && (sign_type(v_object) == $XW));
    }

    /**
     *
     *
     * @param STRING
     * 		string; the surface string of this word
     * @return word; a word built from STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the surface string of this word\r\n@return word; a word built from STRING")
    public static final SubLObject new_word_alt(SubLObject slot_values) {
        if (slot_values == UNPROVIDED) {
            slot_values = NIL;
        }
        SubLTrampolineFile.checkType(slot_values, LISTP);
        {
            SubLObject word = make_sign(UNPROVIDED);
            _csetf_sign_type(word, $W);
            word_update(word, slot_values);
            return word;
        }
    }

    /**
     *
     *
     * @param STRING
     * 		string; the surface string of this word
     * @return word; a word built from STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the surface string of this word\r\n@return word; a word built from STRING")
    public static SubLObject new_word(SubLObject slot_values) {
        if (slot_values == UNPROVIDED) {
            slot_values = NIL;
        }
        assert NIL != listp(slot_values) : "! listp(slot_values) " + ("Types.listp(slot_values) " + "CommonSymbols.NIL != Types.listp(slot_values) ") + slot_values;
        final SubLObject word = make_sign(UNPROVIDED);
        _csetf_sign_type(word, $W);
        word_update(word, slot_values);
        return word;
    }

    public static final SubLObject copy_word_alt(SubLObject word) {
        {
            SubLObject new_word = new_word(UNPROVIDED);
            SubLObject values = list(new SubLObject[]{ $STRING, word_string(word), $INFO, word_info(word), $CATEGORY, word_category(word), $OFFSET, word_offset(word), $MOTHER, word_mother(word) });
            sign_update(new_word, values);
            return new_word;
        }
    }

    public static SubLObject copy_word(final SubLObject word) {
        final SubLObject is_exhaustive = exhaustive_word_p(word);
        final SubLObject new_word = (NIL != is_exhaustive) ? new_exhaustive_word(UNPROVIDED) : new_word(UNPROVIDED);
        SubLObject values = list(new SubLObject[]{ $STRING, word_string(word), $INFO, word_info(word), $CATEGORY, word_category(word), $OFFSET, word_offset(word), $MOTHER, word_mother(word) });
        if (NIL != is_exhaustive) {
            values = putf(values, $CONSTITUENTS, word_constituents(word));
        }
        sign_update(new_word, values);
        return new_word;
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a word, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a word, nil otherwise")
    public static final SubLObject word_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != sign_p(v_object)) && (sign_type(v_object) == $W));
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a word, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a word, nil otherwise")
    public static SubLObject word_p(final SubLObject v_object) {
        return makeBoolean((NIL != sign_p(v_object)) && (NIL != member(sign_type(v_object), $list60, symbol_function(EQ), UNPROVIDED)));
    }

    public static final SubLObject set_word_string_alt(SubLObject word, SubLObject string) {
        return word_update(word, list($STRING, string));
    }

    public static SubLObject set_word_string(final SubLObject word, final SubLObject string) {
        return word_update(word, list($STRING, string));
    }

    /**
     *
     *
     * @param WORD
    wordp;
     * 		
     * @return string; the surface string of WORD
     */
    @LispMethod(comment = "@param WORD\nwordp;\r\n\t\t\r\n@return string; the surface string of WORD")
    public static final SubLObject word_string_alt(SubLObject word) {
        SubLTrampolineFile.checkType(word, WORD_P);
        return sign_string(word);
    }

    /**
     *
     *
     * @param WORD
    wordp;
     * 		
     * @return string; the surface string of WORD
     */
    @LispMethod(comment = "@param WORD\nwordp;\r\n\t\t\r\n@return string; the surface string of WORD")
    public static SubLObject word_string(final SubLObject word) {
        assert NIL != word_p(word) : "! document.word_p(word) " + ("document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) ") + word;
        return sign_string(word);
    }

    public static final SubLObject set_word_category_alt(SubLObject word, SubLObject category) {
        return word_update(word, list($CATEGORY, category));
    }

    public static SubLObject set_word_category(final SubLObject word, final SubLObject category) {
        return word_update(word, list($CATEGORY, category));
    }

    /**
     *
     *
     * @param WORD
    wordp;
     * 		
     * @return object; the category of WORD
     */
    @LispMethod(comment = "@param WORD\nwordp;\r\n\t\t\r\n@return object; the category of WORD")
    public static final SubLObject word_category_alt(SubLObject word) {
        SubLTrampolineFile.checkType(word, WORD_P);
        return sign_category(word);
    }

    /**
     *
     *
     * @param WORD
    wordp;
     * 		
     * @return object; the category of WORD
     */
    @LispMethod(comment = "@param WORD\nwordp;\r\n\t\t\r\n@return object; the category of WORD")
    public static SubLObject word_category(final SubLObject word) {
        assert NIL != word_p(word) : "! document.word_p(word) " + ("document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) ") + word;
        return sign_category(word);
    }

    /**
     *
     *
     * @param WORD
    wordp;
     * 		
     * @return integer; the offset of WORD
     */
    @LispMethod(comment = "@param WORD\nwordp;\r\n\t\t\r\n@return integer; the offset of WORD")
    public static final SubLObject word_offset_alt(SubLObject word) {
        SubLTrampolineFile.checkType(word, WORD_P);
        return sign_offset(word);
    }

    /**
     *
     *
     * @param WORD
    wordp;
     * 		
     * @return integer; the offset of WORD
     */
    @LispMethod(comment = "@param WORD\nwordp;\r\n\t\t\r\n@return integer; the offset of WORD")
    public static SubLObject word_offset(final SubLObject word) {
        assert NIL != word_p(word) : "! document.word_p(word) " + ("document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) ") + word;
        return sign_offset(word);
    }

    /**
     *
     *
     * @param WORD
    wordp;
     * 		
     * @return integer; the ending-offset of WORD
     */
    @LispMethod(comment = "@param WORD\nwordp;\r\n\t\t\r\n@return integer; the ending-offset of WORD")
    public static final SubLObject word_length_alt(SubLObject word) {
        SubLTrampolineFile.checkType(word, WORD_P);
        return length(word_string(word));
    }

    /**
     *
     *
     * @param WORD
    wordp;
     * 		
     * @return integer; the ending-offset of WORD
     */
    @LispMethod(comment = "@param WORD\nwordp;\r\n\t\t\r\n@return integer; the ending-offset of WORD")
    public static SubLObject word_length(final SubLObject word) {
        assert NIL != word_p(word) : "! document.word_p(word) " + ("document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) ") + word;
        return length(word_string(word));
    }

    /**
     *
     *
     * @param WORD
    wordp
     * 		
     * @return sentence; the sentence that contains this word
     */
    @LispMethod(comment = "@param WORD\nwordp\r\n\t\t\r\n@return sentence; the sentence that contains this word")
    public static final SubLObject word_mother_alt(SubLObject word) {
        SubLTrampolineFile.checkType(word, WORD_P);
        return sign_mother(word);
    }

    /**
     *
     *
     * @param WORD
    wordp
     * 		
     * @return sentence; the sentence that contains this word
     */
    @LispMethod(comment = "@param WORD\nwordp\r\n\t\t\r\n@return sentence; the sentence that contains this word")
    public static SubLObject word_mother(final SubLObject word) {
        assert NIL != word_p(word) : "! document.word_p(word) " + ("document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) ") + word;
        return sign_mother(word);
    }

    /**
     *
     *
     * @param WORD
    wordp;
     * 		
     * @return object; application dependent information associated with WORD
     */
    @LispMethod(comment = "@param WORD\nwordp;\r\n\t\t\r\n@return object; application dependent information associated with WORD")
    public static final SubLObject word_info_alt(SubLObject word) {
        SubLTrampolineFile.checkType(word, WORD_P);
        return sign_info(word);
    }

    /**
     *
     *
     * @param WORD
    wordp;
     * 		
     * @return object; application dependent information associated with WORD
     */
    @LispMethod(comment = "@param WORD\nwordp;\r\n\t\t\r\n@return object; application dependent information associated with WORD")
    public static SubLObject word_info(final SubLObject word) {
        assert NIL != word_p(word) : "! document.word_p(word) " + ("document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) ") + word;
        return sign_info(word);
    }

    public static SubLObject word_constituents(final SubLObject word) {
        assert NIL != exhaustive_word_p(word) : "! document.exhaustive_word_p(word) " + ("document.exhaustive_word_p(word) " + "CommonSymbols.NIL != document.exhaustive_word_p(word) ") + word;
        return sign_constituents(word);
    }

    /**
     *
     *
     * @param WORD
     * 		wordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,
     * 		NIL will be returned.
     * @return listp; a list of NL-INTERPRETATION-Ps
     */
    @LispMethod(comment = "@param WORD\r\n\t\twordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,\r\n\t\tNIL will be returned.\r\n@return listp; a list of NL-INTERPRETATION-Ps")
    public static final SubLObject word_interps_alt(SubLObject word) {
        return getf(word_info(word), $INTERPS, UNPROVIDED);
    }

    /**
     *
     *
     * @param WORD
     * 		wordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,
     * 		NIL will be returned.
     * @return listp; a list of NL-INTERPRETATION-Ps
     */
    @LispMethod(comment = "@param WORD\r\n\t\twordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,\r\n\t\tNIL will be returned.\r\n@return listp; a list of NL-INTERPRETATION-Ps")
    public static SubLObject word_interps(final SubLObject word) {
        return getf(word_info(word), $INTERPS, UNPROVIDED);
    }

    /**
     *
     *
     * @param WORD
     * 		wordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,
     * 		NIL will be returned.
     * @return listp; a list of ABSTRACT-LEXICON-LEX-ENTRY-Ps
     */
    @LispMethod(comment = "@param WORD\r\n\t\twordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,\r\n\t\tNIL will be returned.\r\n@return listp; a list of ABSTRACT-LEXICON-LEX-ENTRY-Ps")
    public static final SubLObject word_lex_entries_alt(SubLObject word) {
        return getf(word_info(word), $LEX_ENTRIES, UNPROVIDED);
    }

    /**
     *
     *
     * @param WORD
     * 		wordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,
     * 		NIL will be returned.
     * @return listp; a list of ABSTRACT-LEXICON-LEX-ENTRY-Ps
     */
    @LispMethod(comment = "@param WORD\r\n\t\twordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,\r\n\t\tNIL will be returned.\r\n@return listp; a list of ABSTRACT-LEXICON-LEX-ENTRY-Ps")
    public static SubLObject word_lex_entries(final SubLObject word) {
        return getf(word_info(word), $LEX_ENTRIES, UNPROVIDED);
    }

    /**
     *
     *
     * @param WORD
     * 		wordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,
     * 		NIL will be returned.
     * @return listp; a list of CycL interpretations (e.g. denotations) of WORD
     */
    @LispMethod(comment = "@param WORD\r\n\t\twordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,\r\n\t\tNIL will be returned.\r\n@return listp; a list of CycL interpretations (e.g. denotations) of WORD")
    public static final SubLObject word_cycls_alt(SubLObject word) {
        return remove_duplicates(nl_api_datastructures.cycls_from_nl_interps(getf(word_info(word), $INTERPS, UNPROVIDED)), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param WORD
     * 		wordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,
     * 		NIL will be returned.
     * @return listp; a list of CycL interpretations (e.g. denotations) of WORD
     */
    @LispMethod(comment = "@param WORD\r\n\t\twordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,\r\n\t\tNIL will be returned.\r\n@return listp; a list of CycL interpretations (e.g. denotations) of WORD")
    public static SubLObject word_cycls(final SubLObject word) {
        return remove_duplicates(nl_api_datastructures.cycls_from_nl_interps(getf(word_info(word), $INTERPS, UNPROVIDED)), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param WORD
     * 		wordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,
     * 		NIL will be returned.
     * @return speech-part?
     */
    @LispMethod(comment = "@param WORD\r\n\t\twordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,\r\n\t\tNIL will be returned.\r\n@return speech-part?")
    public static final SubLObject word_cyc_pos_alt(SubLObject word) {
        return getf(word_info(word), $CYC_POS, UNPROVIDED);
    }

    /**
     *
     *
     * @param WORD
     * 		wordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,
     * 		NIL will be returned.
     * @return speech-part?
     */
    @LispMethod(comment = "@param WORD\r\n\t\twordp; this function assumes that the word has gone through TAG-CONCEPTS.  If the word has not been concept-tagged,\r\n\t\tNIL will be returned.\r\n@return speech-part?")
    public static SubLObject word_cyc_pos(final SubLObject word) {
        return getf(word_info(word), $CYC_POS, UNPROVIDED);
    }

    /**
     *
     *
     * @param WORD
    word-p
     * 		
     * @param SLOT-VALUES
     * 		listp; a list in the format (<:slot-name1> <value1> ... <:slot-namen> <valuen>)
     * @return word; a version of WORD whose slots has been updated with the appropriate values
     * @unknown WORD is destructively modified
     */
    @LispMethod(comment = "@param WORD\nword-p\r\n\t\t\r\n@param SLOT-VALUES\r\n\t\tlistp; a list in the format (<:slot-name1> <value1> ... <:slot-namen> <valuen>)\r\n@return word; a version of WORD whose slots has been updated with the appropriate values\r\n@unknown WORD is destructively modified")
    public static final SubLObject word_update_alt(SubLObject word, SubLObject slot_values) {
        SubLTrampolineFile.checkType(word, WORD_P);
        SubLTrampolineFile.checkType(slot_values, LISTP);
        return sign_update(word, slot_values);
    }

    /**
     *
     *
     * @param WORD
    word-p
     * 		
     * @param SLOT-VALUES
     * 		listp; a list in the format (<:slot-name1> <value1> ... <:slot-namen> <valuen>)
     * @return word; a version of WORD whose slots has been updated with the appropriate values
     * @unknown WORD is destructively modified
     */
    @LispMethod(comment = "@param WORD\nword-p\r\n\t\t\r\n@param SLOT-VALUES\r\n\t\tlistp; a list in the format (<:slot-name1> <value1> ... <:slot-namen> <valuen>)\r\n@return word; a version of WORD whose slots has been updated with the appropriate values\r\n@unknown WORD is destructively modified")
    public static SubLObject word_update(final SubLObject word, final SubLObject slot_values) {
        assert NIL != word_p(word) : "! document.word_p(word) " + ("document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) ") + word;
        assert NIL != listp(slot_values) : "! listp(slot_values) " + ("Types.listp(slot_values) " + "CommonSymbols.NIL != Types.listp(slot_values) ") + slot_values;
        return sign_update(word, slot_values);
    }

    /**
     *
     *
     * @param WORD
    word-p
     * 		
     * @return the local index of WORD with its sentence
     */
    @LispMethod(comment = "@param WORD\nword-p\r\n\t\t\r\n@return the local index of WORD with its sentence")
    public static final SubLObject word_index_alt(SubLObject word) {
        {
            SubLObject sentence = word_mother(word);
            SubLObject i = ZERO_INTEGER;
            if (NIL != sentence) {
                while (!(i.numG(sentence_length(sentence)) || (word == sentence_get(sentence, i)))) {
                    i = add(i, ONE_INTEGER);
                } 
                return i;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param WORD
    word-p
     * 		
     * @return the local index of WORD with its sentence
     */
    @LispMethod(comment = "@param WORD\nword-p\r\n\t\t\r\n@return the local index of WORD with its sentence")
    public static SubLObject word_index(final SubLObject word) {
        final SubLObject sentence = word_mother(word);
        SubLObject i = ZERO_INTEGER;
        if (NIL != sentence) {
            while ((!i.numG(sentence_length(sentence))) && (!word.eql(sentence_get(sentence, i)))) {
                i = add(i, ONE_INTEGER);
            } 
            return i;
        }
        return NIL;
    }

    /**
     *
     *
     * @param WORD
    word-p
     * 		
     * @return list; a list of a single interval token <START (+ START 1) WORD>
     */
    @LispMethod(comment = "@param WORD\nword-p\r\n\t\t\r\n@return list; a list of a single interval token <START (+ START 1) WORD>")
    public static final SubLObject word_intervals_alt(SubLObject word, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        SubLTrampolineFile.checkType(word, WORD_P);
        SubLTrampolineFile.checkType(start, INTEGERP);
        return list(standard_tokenization.new_interval_token(start, add(start, ONE_INTEGER), word));
    }

    /**
     *
     *
     * @param WORD
    word-p
     * 		
     * @return list; a list of a single interval token <START (+ START 1) WORD>
     */
    @LispMethod(comment = "@param WORD\nword-p\r\n\t\t\r\n@return list; a list of a single interval token <START (+ START 1) WORD>")
    public static SubLObject word_intervals(final SubLObject word, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        assert NIL != word_p(word) : "! document.word_p(word) " + ("document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) ") + word;
        assert NIL != integerp(start) : "! integerp(start) " + ("Types.integerp(start) " + "CommonSymbols.NIL != Types.integerp(start) ") + start;
        return list(standard_tokenization.new_interval_token(start, add(start, ONE_INTEGER), word));
    }

    /**
     *
     *
     * @param WORD
     * 		word; the word to be capitalized
     * @return word; the destructively capitalized WORD
     * @unknown destructively modifies WORD
     */
    @LispMethod(comment = "@param WORD\r\n\t\tword; the word to be capitalized\r\n@return word; the destructively capitalized WORD\r\n@unknown destructively modifies WORD")
    public static final SubLObject word_capitalize_alt(SubLObject word) {
        SubLTrampolineFile.checkType(word, WORD_P);
        string_utilities.nupcase_leading(word_string(word));
        return word;
    }

    /**
     *
     *
     * @param WORD
     * 		word; the word to be capitalized
     * @return word; the destructively capitalized WORD
     * @unknown destructively modifies WORD
     */
    @LispMethod(comment = "@param WORD\r\n\t\tword; the word to be capitalized\r\n@return word; the destructively capitalized WORD\r\n@unknown destructively modifies WORD")
    public static SubLObject word_capitalize(final SubLObject word) {
        assert NIL != word_p(word) : "! document.word_p(word) " + ("document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) ") + word;
        string_utilities.nupcase_leading(word_string(word));
        return word;
    }

    /**
     *
     *
     * @param WORD
     * 		word; the word to be uncapitalized
     * @return word; the destructively uncapitalized WORD
     * @unknown destructively modifies WORD
     */
    @LispMethod(comment = "@param WORD\r\n\t\tword; the word to be uncapitalized\r\n@return word; the destructively uncapitalized WORD\r\n@unknown destructively modifies WORD")
    public static final SubLObject word_uncapitalize_alt(SubLObject word) {
        SubLTrampolineFile.checkType(word, WORD_P);
        string_utilities.ndowncase_leading(word_string(word));
        return word;
    }

    /**
     *
     *
     * @param WORD
     * 		word; the word to be uncapitalized
     * @return word; the destructively uncapitalized WORD
     * @unknown destructively modifies WORD
     */
    @LispMethod(comment = "@param WORD\r\n\t\tword; the word to be uncapitalized\r\n@return word; the destructively uncapitalized WORD\r\n@unknown destructively modifies WORD")
    public static SubLObject word_uncapitalize(final SubLObject word) {
        assert NIL != word_p(word) : "! document.word_p(word) " + ("document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) ") + word;
        string_utilities.ndowncase_leading(word_string(word));
        return word;
    }

    /**
     *
     *
     * @param CHARS
     * 		listp; a list of characters to be wordified
     * @return word; a word build from CHARS
     * @unknown tentative, will probably change
     */
    @LispMethod(comment = "@param CHARS\r\n\t\tlistp; a list of characters to be wordified\r\n@return word; a word build from CHARS\r\n@unknown tentative, will probably change")
    public static final SubLObject build_word_token_alt(SubLObject fst) {
        return new_word(list($STRING, stringify(finite_state_transducer.fst_output(fst)), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $OFFSET, finite_state_transducer.fst_output_start(fst)));
    }

    /**
     *
     *
     * @param CHARS
     * 		listp; a list of characters to be wordified
     * @return word; a word build from CHARS
     * @unknown tentative, will probably change
     */
    @LispMethod(comment = "@param CHARS\r\n\t\tlistp; a list of characters to be wordified\r\n@return word; a word build from CHARS\r\n@unknown tentative, will probably change")
    public static SubLObject build_word_token(final SubLObject fst) {
        return new_word(list($STRING, stringify(finite_state_transducer.fst_output(fst)), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $OFFSET, finite_state_transducer.fst_output_start(fst)));
    }

    /**
     *
     *
     * @param CHARS
     * 		list; a list of characters
     * @return string; a string containing the characters of CHARS
     */
    @LispMethod(comment = "@param CHARS\r\n\t\tlist; a list of characters\r\n@return string; a string containing the characters of CHARS")
    public static final SubLObject stringify_alt(SubLObject chars) {
        {
            SubLObject string = Strings.make_string(length(chars), UNPROVIDED);
            SubLObject i = ZERO_INTEGER;
            SubLObject cdolist_list_var = chars;
            SubLObject v_char = NIL;
            for (v_char = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_char = cdolist_list_var.first()) {
                Strings.set_char(string, i, v_char);
                i = add(i, ONE_INTEGER);
            }
            return string;
        }
    }

    /**
     *
     *
     * @param CHARS
     * 		list; a list of characters
     * @return string; a string containing the characters of CHARS
     */
    @LispMethod(comment = "@param CHARS\r\n\t\tlist; a list of characters\r\n@return string; a string containing the characters of CHARS")
    public static SubLObject stringify(final SubLObject chars) {
        SubLObject string = Strings.make_string(length(chars), UNPROVIDED);
        SubLObject has_unicodeP = NIL;
        SubLObject i = ZERO_INTEGER;
        if (NIL == has_unicodeP) {
            SubLObject csome_list_var = chars;
            SubLObject v_char = NIL;
            v_char = csome_list_var.first();
            while ((NIL == has_unicodeP) && (NIL != csome_list_var)) {
                if (v_char.isString()) {
                    has_unicodeP = T;
                } else {
                    Strings.set_char(string, i, v_char);
                }
                i = add(i, ONE_INTEGER);
                csome_list_var = csome_list_var.rest();
                v_char = csome_list_var.first();
            } 
        }
        if (NIL == has_unicodeP) {
            return string;
        }
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            SubLObject cdolist_list_var = chars;
            SubLObject v_char2 = NIL;
            v_char2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                princ(v_char2, s);
                cdolist_list_var = cdolist_list_var.rest();
                v_char2 = cdolist_list_var.first();
            } 
            string = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return string;
    }

    /**
     *
     *
     * @param WORD
    sign-p
     * 		
     * @return boolean; in the original document, was there a space between WORD and the word following it?
     */
    @LispMethod(comment = "@param WORD\nsign-p\r\n\t\t\r\n@return boolean; in the original document, was there a space between WORD and the word following it?")
    public static final SubLObject no_space_before_following_wordP_alt(SubLObject word) {
        {
            SubLObject word_end = add(word_offset(word), word_length(word));
            SubLObject next_word_offset = next_word_offset(word);
            return makeBoolean(((NIL != next_word_offset) && (NIL != word_end)) && (next_word_offset == word_end));
        }
    }

    /**
     *
     *
     * @param WORD
    sign-p
     * 		
     * @return boolean; in the original document, was there a space between WORD and the word following it?
     */
    @LispMethod(comment = "@param WORD\nsign-p\r\n\t\t\r\n@return boolean; in the original document, was there a space between WORD and the word following it?")
    public static SubLObject no_space_before_following_wordP(final SubLObject word) {
        final SubLObject word_end = add(word_offset(word), word_length(word));
        final SubLObject next_word_offset = next_word_offset(word);
        return makeBoolean(((NIL != next_word_offset) && (NIL != word_end)) && next_word_offset.eql(word_end));
    }

    /**
     *
     *
     * @param WORD
    sign-p
     * 		
     * @return integer or nil; The offset of the next word in the sentence.  Returns
    NIL if the last word of a sentence
     */
    @LispMethod(comment = "@param WORD\nsign-p\r\n\t\t\r\n@return integer or nil; The offset of the next word in the sentence.  Returns\r\nNIL if the last word of a sentence")
    public static final SubLObject next_word_offset_alt(SubLObject word) {
        {
            SubLObject sentence = word_mother(word);
            SubLObject word_index = word_index(word);
            SubLObject next_word = NIL;
            if (word_index.isInteger()) {
                if (!number_utilities.f_1X(word_index).numGE(sentence_length(sentence))) {
                    next_word = sentence_get(sentence, number_utilities.f_1X(word_index));
                }
            }
            if (NIL != next_word) {
                return word_offset(next_word);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param WORD
    sign-p
     * 		
     * @return integer or nil; The offset of the next word in the sentence.  Returns
    NIL if the last word of a sentence
     */
    @LispMethod(comment = "@param WORD\nsign-p\r\n\t\t\r\n@return integer or nil; The offset of the next word in the sentence.  Returns\r\nNIL if the last word of a sentence")
    public static SubLObject next_word_offset(final SubLObject word) {
        final SubLObject sentence = word_mother(word);
        final SubLObject word_index = word_index(word);
        SubLObject next_word = NIL;
        if (word_index.isInteger() && (!number_utilities.f_1X(word_index).numGE(sentence_length(sentence)))) {
            next_word = sentence_get(sentence, number_utilities.f_1X(word_index));
        }
        if (NIL != next_word) {
            return word_offset(next_word);
        }
        return NIL;
    }

    /**
     *
     *
     * @return list; a list of individual token-strings produced from STRING
     */
    @LispMethod(comment = "@return list; a list of individual token-strings produced from STRING")
    public static final SubLObject string_tokenize_via_wordify_alt(SubLObject string) {
        {
            SubLObject word_array = string_wordify(string, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject vector_var = word_array;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    result = cons(word_string(word), result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @return list; a list of individual token-strings produced from STRING
     */
    @LispMethod(comment = "@return list; a list of individual token-strings produced from STRING")
    public static SubLObject string_tokenize_via_wordify(final SubLObject string) {
        final SubLObject word_array = string_wordify(string, UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject vector_var = word_array;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            word = aref(vector_var, element_num);
            result = cons(word_string(word), result);
        }
        return nreverse(result);
    }

    public static final SubLObject string_wordify_alt(SubLObject string, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = $wordifier$.getDynamicValue();
        }
        return funcall(wordifier, string);
    }

    public static SubLObject string_wordify(final SubLObject string, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = $wordifier$.getDynamicValue();
        }
        return funcall(wordifier, string);
    }

    public static final SubLObject fst_string_wordify_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return finite_state_transducer.fst_match_global($wordifier_fst$.getDynamicValue(thread), string);
        }
    }

    public static SubLObject fst_string_wordify(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($fst_string_wordify_lock$.getGlobalValue());
            return finite_state_transducer.fst_match_global($wordifier_fst$.getDynamicValue(thread), unicode_strings.utf8_string_to_unicode_vector(string));
        } finally {
            if (NIL != release) {
                release_lock($fst_string_wordify_lock$.getGlobalValue());
            }
        }
    }

    /**
     *
     *
     * @param STRING
     * 		string; the string from which to create a vector of words
     * @return vector; a vector of words created from source STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the string from which to create a vector of words\r\n@return vector; a vector of words created from source STRING")
    public static final SubLObject rkf_standard_string_wordify_alt(SubLObject string) {
        {
            SubLObject tokens = rkf_concept_harvester.rkf_ch_string_tokenize(string);
            SubLObject words = NIL;
            SubLObject current_offset = ZERO_INTEGER;
            SubLObject cdolist_list_var = tokens;
            SubLObject token = NIL;
            for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                current_offset = search(token, string, EQUAL, IDENTITY, ZERO_INTEGER, NIL, current_offset, UNPROVIDED);
                {
                    SubLObject word_args = list($STRING, token);
                    if (current_offset.isNumber()) {
                        word_args = putf(word_args, $OFFSET, current_offset);
                        current_offset = add(current_offset, length(token));
                    }
                    words = cons(new_word(word_args), words);
                }
            }
            return apply(VECTOR, nreverse(words));
        }
    }

    /**
     *
     *
     * @param STRING
     * 		string; the string from which to create a vector of words
     * @return vector; a vector of words created from source STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the string from which to create a vector of words\r\n@return vector; a vector of words created from source STRING")
    public static SubLObject rkf_standard_string_wordify(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_vector = NIL;
        if (NIL == result_vector) {
            SubLObject csome_list_var = list(RKF_CH_STRING_TOKENIZE, STANDARD_STRING_TOKENIZE, SPLIT_STRING);
            SubLObject tokenizer = NIL;
            tokenizer = csome_list_var.first();
            while ((NIL == result_vector) && (NIL != csome_list_var)) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject tokens = funcall(tokenizer, string);
                            SubLObject words = NIL;
                            SubLObject current_offset = ZERO_INTEGER;
                            SubLObject cdolist_list_var = tokens;
                            SubLObject token = NIL;
                            token = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                current_offset = search(token, string, EQUAL, IDENTITY, ZERO_INTEGER, NIL, current_offset, UNPROVIDED);
                                SubLObject word_args = list($STRING, token);
                                if (current_offset.isNumber()) {
                                    word_args = putf(word_args, $OFFSET, current_offset);
                                    current_offset = add(current_offset, length(token));
                                }
                                words = cons(new_word(word_args), words);
                                cdolist_list_var = cdolist_list_var.rest();
                                token = cdolist_list_var.first();
                            } 
                            result_vector = nreverse(words);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
                csome_list_var = csome_list_var.rest();
                tokenizer = csome_list_var.first();
            } 
        }
        return list_utilities.list2vector(result_vector);
    }

    public static final SubLObject clear_html_string_wordify_punctuation_chars_alt() {
        {
            SubLObject cs = $html_string_wordify_punctuation_chars_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_html_string_wordify_punctuation_chars() {
        final SubLObject cs = $html_string_wordify_punctuation_chars_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_html_string_wordify_punctuation_chars_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($html_string_wordify_punctuation_chars_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_html_string_wordify_punctuation_chars() {
        return memoization_state.caching_state_remove_function_results_with_args($html_string_wordify_punctuation_chars_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject html_string_wordify_punctuation_chars_internal_alt() {
        return cons(CHAR_less, cons(CHAR_greater, cons(CHAR_space, standard_tokenization.standard_punctuation_chars())));
    }

    public static SubLObject html_string_wordify_punctuation_chars_internal() {
        return cons(CHAR_less, cons(CHAR_greater, cons(CHAR_space, standard_tokenization.standard_punctuation_chars())));
    }

    public static final SubLObject html_string_wordify_punctuation_chars_alt() {
        {
            SubLObject caching_state = $html_string_wordify_punctuation_chars_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(HTML_STRING_WORDIFY_PUNCTUATION_CHARS, $html_string_wordify_punctuation_chars_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw62$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(html_string_wordify_punctuation_chars_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject html_string_wordify_punctuation_chars() {
        SubLObject caching_state = $html_string_wordify_punctuation_chars_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(HTML_STRING_WORDIFY_PUNCTUATION_CHARS, $html_string_wordify_punctuation_chars_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(html_string_wordify_punctuation_chars_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject html_string_wordify_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_hsw_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject html_string_wordify_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_hsw_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject html_string_wordify_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.document.$html_string_wordify_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject html_string_wordify_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.document.$html_string_wordify_state_native.class ? T : NIL;
    }

    public static final SubLObject hsw_state_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject hsw_state_state(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject hsw_state_tag_pieces_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject hsw_state_tag_pieces(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject hsw_state_string_pieces_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject hsw_state_string_pieces(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject hsw_state_punctuation_pieces_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject hsw_state_punctuation_pieces(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject hsw_state_leading_tags_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject hsw_state_leading_tags(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject hsw_state_following_tags_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject hsw_state_following_tags(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject hsw_state_current_offset_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject hsw_state_current_offset(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_hsw_state_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_hsw_state_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_hsw_state_tag_pieces_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_hsw_state_tag_pieces(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_hsw_state_string_pieces_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_hsw_state_string_pieces(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_hsw_state_punctuation_pieces_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_hsw_state_punctuation_pieces(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_hsw_state_leading_tags_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_hsw_state_leading_tags(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_hsw_state_following_tags_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_hsw_state_following_tags(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_hsw_state_current_offset_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTML_STRING_WORDIFY_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_hsw_state_current_offset(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "! document.html_string_wordify_state_p(v_object) " + "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_html_string_wordify_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.document.$html_string_wordify_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($STATE)) {
                        _csetf_hsw_state_state(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TAG_PIECES)) {
                            _csetf_hsw_state_tag_pieces(v_new, current_value);
                        } else {
                            if (pcase_var.eql($STRING_PIECES)) {
                                _csetf_hsw_state_string_pieces(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PUNCTUATION_PIECES)) {
                                    _csetf_hsw_state_punctuation_pieces(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($LEADING_TAGS)) {
                                        _csetf_hsw_state_leading_tags(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($FOLLOWING_TAGS)) {
                                            _csetf_hsw_state_following_tags(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($CURRENT_OFFSET)) {
                                                _csetf_hsw_state_current_offset(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_html_string_wordify_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.document.$html_string_wordify_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STATE)) {
                _csetf_hsw_state_state(v_new, current_value);
            } else
                if (pcase_var.eql($TAG_PIECES)) {
                    _csetf_hsw_state_tag_pieces(v_new, current_value);
                } else
                    if (pcase_var.eql($STRING_PIECES)) {
                        _csetf_hsw_state_string_pieces(v_new, current_value);
                    } else
                        if (pcase_var.eql($PUNCTUATION_PIECES)) {
                            _csetf_hsw_state_punctuation_pieces(v_new, current_value);
                        } else
                            if (pcase_var.eql($LEADING_TAGS)) {
                                _csetf_hsw_state_leading_tags(v_new, current_value);
                            } else
                                if (pcase_var.eql($FOLLOWING_TAGS)) {
                                    _csetf_hsw_state_following_tags(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CURRENT_OFFSET)) {
                                        _csetf_hsw_state_current_offset(v_new, current_value);
                                    } else {
                                        Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_html_string_wordify_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HTML_STRING_WORDIFY_STATE, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STATE, hsw_state_state(obj));
        funcall(visitor_fn, obj, $SLOT, $TAG_PIECES, hsw_state_tag_pieces(obj));
        funcall(visitor_fn, obj, $SLOT, $STRING_PIECES, hsw_state_string_pieces(obj));
        funcall(visitor_fn, obj, $SLOT, $PUNCTUATION_PIECES, hsw_state_punctuation_pieces(obj));
        funcall(visitor_fn, obj, $SLOT, $LEADING_TAGS, hsw_state_leading_tags(obj));
        funcall(visitor_fn, obj, $SLOT, $FOLLOWING_TAGS, hsw_state_following_tags(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_OFFSET, hsw_state_current_offset(obj));
        funcall(visitor_fn, obj, $END, MAKE_HTML_STRING_WORDIFY_STATE, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_html_string_wordify_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_html_string_wordify_state(obj, visitor_fn);
    }

    public static final SubLObject print_hsw_state_alt(SubLObject state, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt92$__S__S_, hsw_state_state(state), hsw_state_string_pieces(state));
        return NIL;
    }

    public static SubLObject print_hsw_state(final SubLObject state, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str110$__S__S_, hsw_state_state(state), hsw_state_string_pieces(state));
        return NIL;
    }

    public static final SubLObject new_html_string_wordify_state_alt() {
        return make_html_string_wordify_state($list_alt93);
    }

    public static SubLObject new_html_string_wordify_state() {
        return make_html_string_wordify_state($list111);
    }

    public static final SubLObject classify_html_string_token_alt(SubLObject token, SubLObject punctuation) {
        if (string_utilities.first_char(token) == CHAR_space) {
            return $SPACE;
        } else {
            if (string_utilities.first_char(token) == CHAR_greater) {
                return $END_OF_TAG;
            } else {
                if (string_utilities.first_char(token) == CHAR_less) {
                    return $START_OF_TAG;
                } else {
                    if (NIL != member(string_utilities.first_char(token), punctuation, UNPROVIDED, UNPROVIDED)) {
                        return $PUNCTUATION;
                    } else {
                        return $DEFAULT;
                    }
                }
            }
        }
    }

    public static SubLObject classify_html_string_token(final SubLObject token, final SubLObject punctuation) {
        if (string_utilities.first_char(token).eql(CHAR_space)) {
            return $SPACE;
        }
        if (string_utilities.first_char(token).eql(CHAR_greater)) {
            return $END_OF_TAG;
        }
        if (string_utilities.first_char(token).eql(CHAR_less)) {
            return $START_OF_TAG;
        }
        if (NIL != member(string_utilities.first_char(token), punctuation, UNPROVIDED, UNPROVIDED)) {
            return $PUNCTUATION;
        }
        return $DEFAULT;
    }

    /**
     * Wordifier function that handles HTML by preserving escapes and stashing
     * tags on the words' INFO slots.
     */
    @LispMethod(comment = "Wordifier function that handles HTML by preserving escapes and stashing\r\ntags on the words\' INFO slots.\nWordifier function that handles HTML by preserving escapes and stashing\ntags on the words\' INFO slots.")
    public static final SubLObject html_string_wordify_alt(SubLObject html_string) {
        {
            SubLObject words = NIL;
            SubLObject white_space_chars = NIL;
            SubLObject punctuation = html_string_wordify_punctuation_chars();
            SubLObject raw_tokens = standard_tokenization.tokenize_sentence(html_string, white_space_chars, punctuation, UNPROVIDED);
            SubLObject chunked = raw_tokens;
            SubLObject state = new_html_string_wordify_state();
            SubLObject list_var = NIL;
            SubLObject token = NIL;
            SubLObject i = NIL;
            for (list_var = chunked, token = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , i = add(ONE_INTEGER, i)) {
                {
                    SubLObject v_class = classify_html_string_token(token, punctuation);
                    SubLObject pcase_var = hsw_state_state(state);
                    if (pcase_var.eql($INSIDE_TAG)) {
                        _csetf_hsw_state_tag_pieces(state, cons(token, hsw_state_tag_pieces(state)));
                        if (v_class == $END_OF_TAG) {
                            {
                                SubLObject tag = tag_from_hsw_state(state);
                                if (NIL != hsw_state_string_pieces(state)) {
                                    _csetf_hsw_state_following_tags(state, cons(tag, hsw_state_following_tags(state)));
                                } else {
                                    _csetf_hsw_state_leading_tags(state, cons(tag, hsw_state_leading_tags(state)));
                                }
                            }
                            _csetf_hsw_state_state(state, $NORMAL);
                        }
                    } else {
                        if (pcase_var.eql($NORMAL)) {
                            if (v_class == $START_OF_TAG) {
                                if ((NIL != hsw_state_string_pieces(state)) && (CHAR_slash != string_utilities.first_char(hsw_peek_next_token(i, chunked)))) {
                                    {
                                        SubLObject word = new_word_from_hsw_state(state);
                                        words = cons(word, words);
                                    }
                                }
                                _csetf_hsw_state_tag_pieces(state, list(token));
                                _csetf_hsw_state_state(state, $INSIDE_TAG);
                            } else {
                                if (v_class == $SPACE) {
                                    if (NIL != hsw_state_string_pieces(state)) {
                                        {
                                            SubLObject word = new_word_from_hsw_state(state);
                                            words = cons(word, words);
                                        }
                                    }
                                    _csetf_hsw_state_punctuation_pieces(state, cons(token, hsw_state_punctuation_pieces(state)));
                                } else {
                                    if ((v_class == $PUNCTUATION) && (!(((string_utilities.first_char(token) == CHAR_semicolon) && (NIL != lengthGE(chunked, add(TWO_INTEGER, i), UNPROVIDED))) && (NIL != member(classify_html_string_token(hsw_peek_next_token(i, chunked), punctuation), $list_alt101, UNPROVIDED, UNPROVIDED))))) {
                                        if (NIL != hsw_state_string_pieces(state)) {
                                            {
                                                SubLObject word = new_word_from_hsw_state(state);
                                                words = cons(word, words);
                                            }
                                        }
                                        hsw_state_add_string_piece(state, token);
                                    } else {
                                        hsw_state_add_string_piece(state, token);
                                    }
                                }
                            }
                        } else {
                            Errors.error($str_alt102$Unknown_state___S, hsw_state_state(state));
                        }
                    }
                }
                _csetf_hsw_state_current_offset(state, add(hsw_state_current_offset(state), length(token)));
            }
            if (NIL != hsw_state_string_pieces(state)) {
                {
                    SubLObject word = new_word_from_hsw_state(state);
                    words = cons(word, words);
                }
            } else {
                if (NIL != hsw_state_punctuation_pieces(state)) {
                    {
                        SubLObject word = words.first();
                        SubLObject info = word_info(word);
                        info = putf(info, $FOLLOWING_WHITESPACE, string_utilities.join_strings(nreverse(hsw_state_punctuation_pieces(state)), string_utilities.$empty_string$.getGlobalValue()));
                        word_update(word, list($INFO, info));
                    }
                }
            }
            return nreverse(words);
        }
    }

    /**
     * Wordifier function that handles HTML by preserving escapes and stashing
     * tags on the words' INFO slots.
     */
    @LispMethod(comment = "Wordifier function that handles HTML by preserving escapes and stashing\r\ntags on the words\' INFO slots.\nWordifier function that handles HTML by preserving escapes and stashing\ntags on the words\' INFO slots.")
    public static SubLObject html_string_wordify(final SubLObject html_string) {
        SubLObject words = NIL;
        final SubLObject white_space_chars = NIL;
        final SubLObject punctuation = html_string_wordify_punctuation_chars();
        final SubLObject chunked;
        final SubLObject raw_tokens = chunked = standard_tokenization.tokenize_sentence(html_string, white_space_chars, punctuation, UNPROVIDED);
        final SubLObject state = new_html_string_wordify_state();
        SubLObject list_var = NIL;
        SubLObject token = NIL;
        SubLObject i = NIL;
        list_var = chunked;
        token = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject v_class = classify_html_string_token(token, punctuation);
            final SubLObject pcase_var = hsw_state_state(state);
            if (pcase_var.eql($INSIDE_TAG)) {
                _csetf_hsw_state_tag_pieces(state, cons(token, hsw_state_tag_pieces(state)));
                if (v_class == $END_OF_TAG) {
                    final SubLObject tag = tag_from_hsw_state(state);
                    if (NIL != hsw_state_string_pieces(state)) {
                        _csetf_hsw_state_following_tags(state, cons(tag, hsw_state_following_tags(state)));
                    } else {
                        _csetf_hsw_state_leading_tags(state, cons(tag, hsw_state_leading_tags(state)));
                    }
                    _csetf_hsw_state_state(state, $NORMAL);
                }
            } else
                if (pcase_var.eql($NORMAL)) {
                    if (v_class == $START_OF_TAG) {
                        if ((NIL != hsw_state_string_pieces(state)) && (!CHAR_slash.eql(string_utilities.first_char(hsw_peek_next_token(i, chunked))))) {
                            final SubLObject word = new_word_from_hsw_state(state);
                            words = cons(word, words);
                        }
                        _csetf_hsw_state_tag_pieces(state, list(token));
                        _csetf_hsw_state_state(state, $INSIDE_TAG);
                    } else
                        if (v_class == $SPACE) {
                            if (NIL != hsw_state_string_pieces(state)) {
                                final SubLObject word = new_word_from_hsw_state(state);
                                words = cons(word, words);
                            }
                            _csetf_hsw_state_punctuation_pieces(state, cons(token, hsw_state_punctuation_pieces(state)));
                        } else
                            if ((v_class == $PUNCTUATION) && (((!string_utilities.first_char(token).eql(CHAR_semicolon)) || (NIL == list_utilities.lengthGE(chunked, add(TWO_INTEGER, i), UNPROVIDED))) || (NIL == member(classify_html_string_token(hsw_peek_next_token(i, chunked), punctuation), $list119, UNPROVIDED, UNPROVIDED)))) {
                                if (NIL != hsw_state_string_pieces(state)) {
                                    final SubLObject word = new_word_from_hsw_state(state);
                                    words = cons(word, words);
                                }
                                hsw_state_add_string_piece(state, token);
                            } else {
                                hsw_state_add_string_piece(state, token);
                            }


                } else {
                    Errors.error($str120$Unknown_state___S, hsw_state_state(state));
                }

            _csetf_hsw_state_current_offset(state, add(hsw_state_current_offset(state), length(token)));
        }
        if (NIL != hsw_state_string_pieces(state)) {
            final SubLObject word2 = new_word_from_hsw_state(state);
            words = cons(word2, words);
        } else
            if (NIL != hsw_state_punctuation_pieces(state)) {
                final SubLObject word2 = words.first();
                SubLObject info = word_info(word2);
                info = putf(info, $FOLLOWING_WHITESPACE, string_utilities.join_strings(nreverse(hsw_state_punctuation_pieces(state)), string_utilities.$empty_string$.getGlobalValue()));
                word_update(word2, list($INFO, info));
            }

        return nreverse(words);
    }

    public static final SubLObject hsw_peek_next_token_alt(SubLObject i, SubLObject tokens) {
        return nth(number_utilities.f_1X(i), tokens);
    }

    public static SubLObject hsw_peek_next_token(final SubLObject i, final SubLObject tokens) {
        return nth(number_utilities.f_1X(i), tokens);
    }

    public static final SubLObject hsw_state_add_string_piece_alt(SubLObject state, SubLObject token) {
        _csetf_hsw_state_string_pieces(state, cons(token, hsw_state_string_pieces(state)));
        return state;
    }

    public static SubLObject hsw_state_add_string_piece(final SubLObject state, final SubLObject token) {
        _csetf_hsw_state_string_pieces(state, cons(token, hsw_state_string_pieces(state)));
        return state;
    }

    public static final SubLObject hsw_state_clear_string_pieces_alt(SubLObject state) {
        _csetf_hsw_state_string_pieces(state, NIL);
        return state;
    }

    public static SubLObject hsw_state_clear_string_pieces(final SubLObject state) {
        _csetf_hsw_state_string_pieces(state, NIL);
        return state;
    }

    public static final SubLObject tag_from_hsw_state_alt(SubLObject state) {
        {
            SubLObject tag = string_utilities.join_strings(nreverse(hsw_state_tag_pieces(state)), string_utilities.$empty_string$.getGlobalValue());
            _csetf_hsw_state_tag_pieces(state, NIL);
            return tag;
        }
    }

    public static SubLObject tag_from_hsw_state(final SubLObject state) {
        final SubLObject tag = string_utilities.join_strings(nreverse(hsw_state_tag_pieces(state)), string_utilities.$empty_string$.getGlobalValue());
        _csetf_hsw_state_tag_pieces(state, NIL);
        return tag;
    }

    public static final SubLObject new_word_from_hsw_state_alt(SubLObject state) {
        {
            SubLObject string = string_utilities.join_strings(nreverse(hsw_state_string_pieces(state)), string_utilities.$empty_string$.getGlobalValue());
            SubLObject leading_tag_string = (NIL != hsw_state_leading_tags(state)) ? ((SubLObject) (string_utilities.join_strings(nreverse(hsw_state_leading_tags(state)), string_utilities.$empty_string$.getGlobalValue()))) : NIL;
            SubLObject following_tag_string = (NIL != hsw_state_following_tags(state)) ? ((SubLObject) (string_utilities.join_strings(nreverse(hsw_state_following_tags(state)), string_utilities.$empty_string$.getGlobalValue()))) : NIL;
            SubLObject punctuation_string = (NIL != hsw_state_punctuation_pieces(state)) ? ((SubLObject) (string_utilities.join_strings(nreverse(hsw_state_punctuation_pieces(state)), string_utilities.$empty_string$.getGlobalValue()))) : NIL;
            SubLObject offset = subtract(hsw_state_current_offset(state), length(string), length(following_tag_string));
            SubLObject word = new_word(list($STRING, string, $OFFSET, offset));
            hsw_state_clear_string_pieces(state);
            {
                SubLObject info = word_info(word);
                if (NIL != leading_tag_string) {
                    info = putf(info, $LEADING_TAGS, leading_tag_string);
                    _csetf_hsw_state_leading_tags(state, NIL);
                }
                if (NIL != following_tag_string) {
                    info = putf(info, $FOLLOWING_TAGS, following_tag_string);
                    _csetf_hsw_state_following_tags(state, NIL);
                }
                if (NIL != punctuation_string) {
                    info = putf(info, $LEADING_WHITESPACE, punctuation_string);
                    _csetf_hsw_state_punctuation_pieces(state, NIL);
                }
                word_update(word, list($INFO, info));
            }
            return word;
        }
    }

    public static SubLObject new_word_from_hsw_state(final SubLObject state) {
        final SubLObject string = string_utilities.join_strings(nreverse(hsw_state_string_pieces(state)), string_utilities.$empty_string$.getGlobalValue());
        final SubLObject leading_tag_string = (NIL != hsw_state_leading_tags(state)) ? string_utilities.join_strings(nreverse(hsw_state_leading_tags(state)), string_utilities.$empty_string$.getGlobalValue()) : NIL;
        final SubLObject following_tag_string = (NIL != hsw_state_following_tags(state)) ? string_utilities.join_strings(nreverse(hsw_state_following_tags(state)), string_utilities.$empty_string$.getGlobalValue()) : NIL;
        final SubLObject punctuation_string = (NIL != hsw_state_punctuation_pieces(state)) ? string_utilities.join_strings(nreverse(hsw_state_punctuation_pieces(state)), string_utilities.$empty_string$.getGlobalValue()) : NIL;
        final SubLObject offset = subtract(hsw_state_current_offset(state), length(string), length(following_tag_string));
        final SubLObject word = new_word(list($STRING, string, $OFFSET, offset));
        hsw_state_clear_string_pieces(state);
        SubLObject info = word_info(word);
        if (NIL != leading_tag_string) {
            info = putf(info, $LEADING_TAGS, leading_tag_string);
            _csetf_hsw_state_leading_tags(state, NIL);
        }
        if (NIL != following_tag_string) {
            info = putf(info, $FOLLOWING_TAGS, following_tag_string);
            _csetf_hsw_state_following_tags(state, NIL);
        }
        if (NIL != punctuation_string) {
            info = putf(info, $LEADING_WHITESPACE, punctuation_string);
            _csetf_hsw_state_punctuation_pieces(state, NIL);
        }
        word_update(word, list($INFO, info));
        return word;
    }

    public static final SubLObject fst_wordify_test_alt(SubLObject word_vector, SubLObject expected_tokenization) {
        {
            SubLObject vector_var = word_vector;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    if (!word_string(word).equal(expected_tokenization.first())) {
                        return NIL;
                    }
                    expected_tokenization = expected_tokenization.rest();
                }
            }
        }
        return T;
    }

    public static SubLObject fst_wordify_test(final SubLObject word_vector, SubLObject expected_tokenization) {
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        for (length = length(word_vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            word = aref(word_vector, element_num);
            if (!word_string(word).equal(expected_tokenization.first())) {
                return NIL;
            }
            expected_tokenization = expected_tokenization.rest();
        }
        return T;
    }

    /**
     * Returns the XML string of STRING
     *
     * @param STRING
     * 		
     * @return the XML string of STRING
     */
    @LispMethod(comment = "Returns the XML string of STRING\r\n\r\n@param STRING\r\n\t\t\r\n@return the XML string of STRING")
    public static final SubLObject string_to_xml_alt(SubLObject string) {
        return string_utilities.do_string_substitutions(string, $xml_string_mapping$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Returns the XML string of STRING
     *
     * @param STRING
     * 		
     * @return the XML string of STRING
     */
    @LispMethod(comment = "Returns the XML string of STRING\r\n\r\n@param STRING\r\n\t\t\r\n@return the XML string of STRING")
    public static SubLObject string_to_xml(final SubLObject string) {
        return string_utilities.do_string_substitutions(string, $xml_string_mapping$.getGlobalValue(), UNPROVIDED);
    }

    /**
     * Returns the XML string of WORD
     *
     * @param WORD
    word-p
     * 		
     * @param LEVEL
     * 		integerp; the level of indentation
     * @return the XML string WORD
     */
    @LispMethod(comment = "Returns the XML string of WORD\r\n\r\n@param WORD\nword-p\r\n\t\t\r\n@param LEVEL\r\n\t\tintegerp; the level of indentation\r\n@return the XML string WORD")
    public static final SubLObject word_to_xml_alt(SubLObject word, SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        return format(NIL, $str_alt116$_a_WRD_a__a__WRD__a, new SubLObject[]{ string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), NIL != word_category(word) ? ((SubLObject) (cconcatenate($str_alt117$_tag__, new SubLObject[]{ word_category(word), $str_alt38$_ }))) : string_utilities.$empty_string$.getGlobalValue(), string_to_xml(word_string(word)), $newline$.getGlobalValue() });
    }

    /**
     * Returns the XML string of WORD
     *
     * @param WORD
    		word-p
     * 		
     * @param LEVEL
     * 		integerp; the level of indentation
     * @return the XML string WORD
     */
    @LispMethod(comment = "Returns the XML string of WORD\r\n\r\n@param WORD\n\t\tword-p\r\n\t\t\r\n@param LEVEL\r\n\t\tintegerp; the level of indentation\r\n@return the XML string WORD")
    public static SubLObject word_to_xml(final SubLObject word, SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        return format(NIL, $str133$_a_WRD_a__a__WRD__a, new SubLObject[]{ string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), NIL != word_category(word) ? cconcatenate($str134$_tag__, new SubLObject[]{ word_category(word), $str44$_ }) : string_utilities.$empty_string$.getGlobalValue(), string_to_xml(word_string(word)), $newline$.getGlobalValue() });
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a word encoding the end of a sentence,
    nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a word encoding the end of a sentence,\r\nnil otherwise")
    public static final SubLObject end_of_sentence_word_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != word_p(v_object)) && (NIL != member(word_string(v_object), $list_alt118, EQUALP, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a word encoding the end of a sentence,
    nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a word encoding the end of a sentence,\r\nnil otherwise")
    public static SubLObject end_of_sentence_word_p(final SubLObject v_object) {
        return makeBoolean((NIL != word_p(v_object)) && (NIL != member(word_string(v_object), $list135, EQUALP, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a word encoding a quote, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a word encoding a quote, nil otherwise")
    public static final SubLObject quote_word_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != word_p(v_object)) && (NIL != member(word_string(v_object), $list_alt119, EQUALP, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a word encoding a quote, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a word encoding a quote, nil otherwise")
    public static SubLObject quote_word_p(final SubLObject v_object) {
        return makeBoolean((NIL != word_p(v_object)) && (NIL != member(word_string(v_object), $list136, EQUALP, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a word encoding a newline, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a word encoding a newline, nil otherwise")
    public static final SubLObject newline_word_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != word_p(v_object)) && (NIL != Strings.stringE(word_string(v_object), $str_alt120$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a word encoding a newline, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a word encoding a newline, nil otherwise")
    public static SubLObject newline_word_p(final SubLObject v_object) {
        return makeBoolean((NIL != word_p(v_object)) && (NIL != Strings.stringE(word_string(v_object), $str137$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a word encoding a punctuation, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a word encoding a punctuation, nil otherwise")
    public static final SubLObject punctuation_sign_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != sign_p(v_object)) && (NIL != member(sign_string(v_object), $list_alt121, EQUALP, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a word encoding a punctuation, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a word encoding a punctuation, nil otherwise")
    public static SubLObject punctuation_sign_p(final SubLObject v_object) {
        return makeBoolean((NIL != sign_p(v_object)) && (NIL != member(sign_string(v_object), $list138, EQUALP, UNPROVIDED)));
    }

    public static final SubLObject sentence_final_punctuation_charP_alt(SubLObject v_char) {
        return member(v_char, $list_alt122, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sentence_final_punctuation_charP(final SubLObject v_char) {
        return member(v_char, $list139, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sentence_internal_punctuation_charP_alt(SubLObject v_char) {
        return member(v_char, $list_alt123, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sentence_internal_punctuation_charP(final SubLObject v_char) {
        return member(v_char, $list140, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject any_punctuation_charP_alt(SubLObject v_char) {
        return makeBoolean((NIL != sentence_final_punctuation_charP(v_char)) || (NIL != sentence_internal_punctuation_charP(v_char)));
    }

    public static SubLObject any_punctuation_charP(final SubLObject v_char) {
        return makeBoolean((NIL != sentence_final_punctuation_charP(v_char)) || (NIL != sentence_internal_punctuation_charP(v_char)));
    }

    public static final SubLObject quote_charP_alt(SubLObject v_char) {
        return member(v_char, $list_alt124, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject quote_charP(final SubLObject v_char) {
        return member(v_char, $list141, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param STRING
     * 		string; the surface string of this phrase
     * @return phrase; a newly created phrase with string component STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the surface string of this phrase\r\n@return phrase; a newly created phrase with string component STRING")
    public static final SubLObject new_phrase_alt(SubLObject slot_values) {
        if (slot_values == UNPROVIDED) {
            slot_values = NIL;
        }
        SubLTrampolineFile.checkType(slot_values, LISTP);
        {
            SubLObject phrase = make_sign(UNPROVIDED);
            _csetf_sign_type(phrase, $P);
            phrase_update(phrase, slot_values);
            return phrase;
        }
    }

    /**
     *
     *
     * @param STRING
     * 		string; the surface string of this phrase
     * @return phrase; a newly created phrase with string component STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the surface string of this phrase\r\n@return phrase; a newly created phrase with string component STRING")
    public static SubLObject new_phrase(SubLObject slot_values) {
        if (slot_values == UNPROVIDED) {
            slot_values = NIL;
        }
        assert NIL != listp(slot_values) : "! listp(slot_values) " + ("Types.listp(slot_values) " + "CommonSymbols.NIL != Types.listp(slot_values) ") + slot_values;
        final SubLObject phrase = make_sign(UNPROVIDED);
        _csetf_sign_type(phrase, $P);
        phrase_update(phrase, slot_values);
        return phrase;
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a phrase and nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a phrase and nil otherwise")
    public static final SubLObject phrase_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != sign_p(v_object)) && (sign_type(v_object) == $P));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a phrase and nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a phrase and nil otherwise")
    public static SubLObject phrase_p(final SubLObject v_object) {
        return makeBoolean((NIL != sign_p(v_object)) && (sign_type(v_object) == $P));
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return string; the string of PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return string; the string of PHRASE")
    public static final SubLObject phrase_string_alt(SubLObject phrase) {
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        return sign_string(phrase);
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return string; the string of PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return string; the string of PHRASE")
    public static SubLObject phrase_string(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "! document.phrase_p(phrase) " + ("document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) ") + phrase;
        return sign_string(phrase);
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return string; the category of PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return string; the category of PHRASE")
    public static final SubLObject phrase_category_alt(SubLObject phrase) {
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        return sign_category(phrase);
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return string; the category of PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return string; the category of PHRASE")
    public static SubLObject phrase_category(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "! document.phrase_p(phrase) " + ("document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) ") + phrase;
        return sign_category(phrase);
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return vector; a vector of the yield of PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return vector; a vector of the yield of PHRASE")
    public static final SubLObject phrase_yield_alt(SubLObject phrase) {
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        return apply(VECTOR, sign_yield(phrase));
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return vector; a vector of the yield of PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return vector; a vector of the yield of PHRASE")
    public static SubLObject phrase_yield(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "! document.phrase_p(phrase) " + ("document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) ") + phrase;
        return apply(VECTOR, sign_yield(phrase));
    }

    /**
     *
     *
     * @param CONSTITUENT
    variable
     * 		
     * @param PHRASE
     * 		phrase-p
     * 		Execute BODY with CONSTITUENT successively bound to each constituent in PHRASE
     */
    @LispMethod(comment = "@param CONSTITUENT\nvariable\r\n\t\t\r\n@param PHRASE\r\n\t\tphrase-p\r\n\t\tExecute BODY with CONSTITUENT successively bound to each constituent in PHRASE")
    public static final SubLObject phrase_do_constituents_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt126);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject constituent = NIL;
                    SubLObject phrase = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    constituent = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt126);
                    phrase = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(SIGN_DO_CONSTITUENTS, list(constituent, phrase), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt126);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param CONSTITUENT
    variable
     * 		
     * @param PHRASE
     * 		phrase-p
     * 		Execute BODY with CONSTITUENT successively bound to each constituent in PHRASE
     */
    @LispMethod(comment = "@param CONSTITUENT\nvariable\r\n\t\t\r\n@param PHRASE\r\n\t\tphrase-p\r\n\t\tExecute BODY with CONSTITUENT successively bound to each constituent in PHRASE")
    public static SubLObject phrase_do_constituents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list143);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constituent = NIL;
        SubLObject phrase = NIL;
        destructuring_bind_must_consp(current, datum, $list143);
        constituent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list143);
        phrase = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(SIGN_DO_CONSTITUENTS, list(constituent, phrase), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list143);
        return NIL;
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return string; the constituents of PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return string; the constituents of PHRASE")
    public static final SubLObject phrase_constituents_alt(SubLObject phrase) {
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        return sign_constituents(phrase);
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return string; the constituents of PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return string; the constituents of PHRASE")
    public static SubLObject phrase_constituents(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "! document.phrase_p(phrase) " + ("document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) ") + phrase;
        return sign_constituents(phrase);
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return list; a list of nodes of PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return list; a list of nodes of PHRASE")
    public static final SubLObject phrase_nodes_alt(SubLObject phrase) {
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        {
            SubLObject nodes = list(phrase);
            SubLObject vector_var = sign_constituents(phrase);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject daughter = aref(vector_var, element_num);
                    nodes = nconc(nodes, NIL != phrase_p(daughter) ? ((SubLObject) (phrase_nodes(daughter))) : list(daughter));
                }
            }
            return nodes;
        }
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return list; a list of nodes of PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return list; a list of nodes of PHRASE")
    public static SubLObject phrase_nodes(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "! document.phrase_p(phrase) " + ("document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) ") + phrase;
        SubLObject nodes = list(phrase);
        final SubLObject vector_var = sign_constituents(phrase);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            nodes = nconc(nodes, NIL != phrase_p(daughter) ? phrase_nodes(daughter) : list(daughter));
        }
        return nodes;
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return list; a list of interval-tokens <START end sign> for each node in PHRASE,
    where the longest sign is guaranteed to be first in the list
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return list; a list of interval-tokens <START end sign> for each node in PHRASE,\r\nwhere the longest sign is guaranteed to be first in the list")
    public static final SubLObject phrase_intervals_alt(SubLObject phrase, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        SubLTrampolineFile.checkType(start, INTEGERP);
        {
            SubLObject nodes = NIL;
            SubLObject daughter_index = start;
            SubLObject vector_var = sign_constituents(phrase);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject daughter = aref(vector_var, element_num);
                    nodes = nconc(NIL != phrase_p(daughter) ? ((SubLObject) (phrase_intervals(daughter, daughter_index))) : list(standard_tokenization.new_interval_token(daughter_index, add(daughter_index, ONE_INTEGER), daughter)), nodes);
                    daughter_index = standard_tokenization.interval_token_end(nodes.first());
                }
            }
            nodes = cons(standard_tokenization.new_interval_token(start, standard_tokenization.interval_token_end(nodes.first()), phrase), nodes);
            return nodes;
        }
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return list; a list of interval-tokens <START end sign> for each node in PHRASE,
    where the longest sign is guaranteed to be first in the list
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return list; a list of interval-tokens <START end sign> for each node in PHRASE,\r\nwhere the longest sign is guaranteed to be first in the list")
    public static SubLObject phrase_intervals(final SubLObject phrase, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        assert NIL != phrase_p(phrase) : "! document.phrase_p(phrase) " + ("document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) ") + phrase;
        assert NIL != integerp(start) : "! integerp(start) " + ("Types.integerp(start) " + "CommonSymbols.NIL != Types.integerp(start) ") + start;
        SubLObject nodes = NIL;
        SubLObject daughter_index = start;
        final SubLObject vector_var = sign_constituents(phrase);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            nodes = nconc(NIL != phrase_p(daughter) ? phrase_intervals(daughter, daughter_index) : list(standard_tokenization.new_interval_token(daughter_index, add(daughter_index, ONE_INTEGER), daughter)), nodes);
            daughter_index = standard_tokenization.interval_token_end(nodes.first());
        }
        nodes = cons(standard_tokenization.new_interval_token(start, standard_tokenization.interval_token_end(nodes.first()), phrase), nodes);
        return nodes;
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return string; information about PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return string; information about PHRASE")
    public static final SubLObject phrase_info_alt(SubLObject phrase) {
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        return sign_info(phrase);
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @return string; information about PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@return string; information about PHRASE")
    public static SubLObject phrase_info(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "! document.phrase_p(phrase) " + ("document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) ") + phrase;
        return sign_info(phrase);
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @param SLOT-VALUES
     * 		listp; a list in the format (<:slot-name1> <value1> ... <:slot-namen> <valuen>)
     * @return phrase; a version of PHRASE whose slots has been updated with the appropriate values
     * @unknown PHRASE is destructively modified
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@param SLOT-VALUES\r\n\t\tlistp; a list in the format (<:slot-name1> <value1> ... <:slot-namen> <valuen>)\r\n@return phrase; a version of PHRASE whose slots has been updated with the appropriate values\r\n@unknown PHRASE is destructively modified")
    public static final SubLObject phrase_update_alt(SubLObject phrase, SubLObject slot_values) {
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        SubLTrampolineFile.checkType(slot_values, LISTP);
        return sign_update(phrase, slot_values);
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @param SLOT-VALUES
     * 		listp; a list in the format (<:slot-name1> <value1> ... <:slot-namen> <valuen>)
     * @return phrase; a version of PHRASE whose slots has been updated with the appropriate values
     * @unknown PHRASE is destructively modified
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@param SLOT-VALUES\r\n\t\tlistp; a list in the format (<:slot-name1> <value1> ... <:slot-namen> <valuen>)\r\n@return phrase; a version of PHRASE whose slots has been updated with the appropriate values\r\n@unknown PHRASE is destructively modified")
    public static SubLObject phrase_update(final SubLObject phrase, final SubLObject slot_values) {
        assert NIL != phrase_p(phrase) : "! document.phrase_p(phrase) " + ("document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) ") + phrase;
        assert NIL != listp(slot_values) : "! listp(slot_values) " + ("Types.listp(slot_values) " + "CommonSymbols.NIL != Types.listp(slot_values) ") + slot_values;
        return sign_update(phrase, slot_values);
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @param INDEX
    integerp
     * 		
     * @return sign; the INDEXth sign of PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@param INDEX\nintegerp\r\n\t\t\r\n@return sign; the INDEXth sign of PHRASE")
    public static final SubLObject phrase_get_alt(SubLObject phrase, SubLObject index) {
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        SubLTrampolineFile.checkType(index, INTEGERP);
        return sign_get(phrase, index);
    }

    /**
     *
     *
     * @param PHRASE
    phrase-p
     * 		
     * @param INDEX
    integerp
     * 		
     * @return sign; the INDEXth sign of PHRASE
     */
    @LispMethod(comment = "@param PHRASE\nphrase-p\r\n\t\t\r\n@param INDEX\nintegerp\r\n\t\t\r\n@return sign; the INDEXth sign of PHRASE")
    public static SubLObject phrase_get(final SubLObject phrase, final SubLObject index) {
        assert NIL != phrase_p(phrase) : "! document.phrase_p(phrase) " + ("document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) ") + phrase;
        assert NIL != integerp(index) : "! integerp(index) " + ("Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) ") + index;
        return sign_get(phrase, index);
    }

    /**
     * Destructively set PHRASE's INDEXth sign to SIGN
     *
     * @param PHRASE
    phrasep
     * 		
     * @param INDEX
    integer
     * 		
     * @param SIGN
    sign
     * 		
     * @return sign; the prvious INDEXth sign of PHRASE
     */
    @LispMethod(comment = "Destructively set PHRASE\'s INDEXth sign to SIGN\r\n\r\n@param PHRASE\nphrasep\r\n\t\t\r\n@param INDEX\ninteger\r\n\t\t\r\n@param SIGN\nsign\r\n\t\t\r\n@return sign; the prvious INDEXth sign of PHRASE")
    public static final SubLObject phrase_set_alt(SubLObject phrase, SubLObject index, SubLObject sign) {
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        SubLTrampolineFile.checkType(index, INTEGERP);
        SubLTrampolineFile.checkType(sign, SIGN_P);
        return sign_set(phrase, index, sign);
    }

    /**
     * Destructively set PHRASE's INDEXth sign to SIGN
     *
     * @param PHRASE
    		phrasep
     * 		
     * @param INDEX
    		integer
     * 		
     * @param SIGN
    		sign
     * 		
     * @return sign; the prvious INDEXth sign of PHRASE
     */
    @LispMethod(comment = "Destructively set PHRASE\'s INDEXth sign to SIGN\r\n\r\n@param PHRASE\n\t\tphrasep\r\n\t\t\r\n@param INDEX\n\t\tinteger\r\n\t\t\r\n@param SIGN\n\t\tsign\r\n\t\t\r\n@return sign; the prvious INDEXth sign of PHRASE")
    public static SubLObject phrase_set(final SubLObject phrase, final SubLObject index, final SubLObject sign) {
        assert NIL != phrase_p(phrase) : "! document.phrase_p(phrase) " + ("document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) ") + phrase;
        assert NIL != integerp(index) : "! integerp(index) " + ("Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) ") + index;
        assert NIL != sign_p(sign) : "! document.sign_p(sign) " + ("document.sign_p(sign) " + "CommonSymbols.NIL != document.sign_p(sign) ") + sign;
        return sign_set(phrase, index, sign);
    }

    /**
     *
     *
     * @param phrase
    phrase-p;
     * 		
     * @return integer; the number of constituents of PHRASE
     */
    @LispMethod(comment = "@param phrase\nphrase-p;\r\n\t\t\r\n@return integer; the number of constituents of PHRASE")
    public static final SubLObject phrase_constituent_length_alt(SubLObject phrase) {
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        return sign_length(phrase);
    }

    /**
     *
     *
     * @param phrase
    phrase-p;
     * 		
     * @return integer; the number of constituents of PHRASE
     */
    @LispMethod(comment = "@param phrase\nphrase-p;\r\n\t\t\r\n@return integer; the number of constituents of PHRASE")
    public static SubLObject phrase_constituent_length(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "! document.phrase_p(phrase) " + ("document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) ") + phrase;
        return sign_length(phrase);
    }

    /**
     * Returns the XML string of PHRASE
     *
     * @param PHRASE
    phrase-p;
     * 		
     * @param LEVEL
     * 		integerp; the indentation level
     * @return stringp; the XML string of PHRASE
     */
    @LispMethod(comment = "Returns the XML string of PHRASE\r\n\r\n@param PHRASE\nphrase-p;\r\n\t\t\r\n@param LEVEL\r\n\t\tintegerp; the indentation level\r\n@return stringp; the XML string of PHRASE")
    public static final SubLObject phrase_to_xml_alt(SubLObject phrase, SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        {
            SubLObject daughters_xml = string_utilities.$empty_string$.getGlobalValue();
            SubLObject vector_var = sign_constituents(phrase);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject daughter = aref(vector_var, element_num);
                    daughters_xml = cconcatenate(daughters_xml, sign_to_xml(daughter, add(level, ONE_INTEGER)));
                }
            }
            return format(NIL, $str_alt128$_a_PHR_a__a_a_a__PHR__a, new SubLObject[]{ string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), NIL != phrase_category(phrase) ? ((SubLObject) (cconcatenate($str_alt129$_cat__, new SubLObject[]{ princ_to_string(phrase_category(phrase)), $str_alt38$_ }))) : string_utilities.$empty_string$.getGlobalValue(), $newline$.getGlobalValue(), daughters_xml, string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), $newline$.getGlobalValue() });
        }
    }

    /**
     * Returns the XML string of PHRASE
     *
     * @param PHRASE
    		phrase-p;
     * 		
     * @param LEVEL
     * 		integerp; the indentation level
     * @return stringp; the XML string of PHRASE
     */
    @LispMethod(comment = "Returns the XML string of PHRASE\r\n\r\n@param PHRASE\n\t\tphrase-p;\r\n\t\t\r\n@param LEVEL\r\n\t\tintegerp; the indentation level\r\n@return stringp; the XML string of PHRASE")
    public static SubLObject phrase_to_xml(final SubLObject phrase, SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        SubLObject daughters_xml = string_utilities.$empty_string$.getGlobalValue();
        final SubLObject vector_var = sign_constituents(phrase);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            daughters_xml = cconcatenate(daughters_xml, sign_to_xml(daughter, add(level, ONE_INTEGER)));
        }
        return format(NIL, $str145$_a_PHR_a__a_a_a__PHR__a, new SubLObject[]{ string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), NIL != phrase_category(phrase) ? cconcatenate($str146$_cat__, new SubLObject[]{ princ_to_string(phrase_category(phrase)), $str44$_ }) : string_utilities.$empty_string$.getGlobalValue(), $newline$.getGlobalValue(), daughters_xml, string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), $newline$.getGlobalValue() });
    }

    /**
     * Execute BODY with WORD successively bound to each word in SENTENCE
     */
    @LispMethod(comment = "Execute BODY with WORD successively bound to each word in SENTENCE")
    public static final SubLObject sentence_do_words_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt130);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject word = NIL;
                    SubLObject sentence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt130);
                    word = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt130);
                    sentence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOVECTOR, list(word, list(SENTENCE_YIELD, sentence)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt130);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with WORD successively bound to each word in SENTENCE
     */
    @LispMethod(comment = "Execute BODY with WORD successively bound to each word in SENTENCE")
    public static SubLObject sentence_do_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(word, list(SENTENCE_YIELD_EXHAUSTIVE, sentence)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list147);
        return NIL;
    }

    public static SubLObject sentence_do_minimal_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOVECTOR, list(word, list(SENTENCE_YIELD, sentence)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list147);
        return NIL;
    }

    /**
     *
     *
     * @return sentence; a newly created sentence with string component STRING
     */
    @LispMethod(comment = "@return sentence; a newly created sentence with string component STRING")
    public static final SubLObject new_sentence_alt(SubLObject string, SubLObject wordifier) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        if (NIL != string) {
            SubLTrampolineFile.checkType(string, STRINGP);
        }
        {
            SubLObject sentence = new_phrase(UNPROVIDED);
            if (NIL != string) {
                _csetf_sign_string(sentence, string);
            }
            _csetf_sign_category(sentence, $S);
            if (NIL != string) {
                _csetf_sign_constituents(sentence, string_wordify(string, wordifier));
                {
                    SubLObject vector_var = sentence_yield(sentence);
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject word = aref(vector_var, element_num);
                            _csetf_sign_mother(word, sentence);
                        }
                    }
                }
            }
            sign_update(sentence, $list_alt133);
            return sentence;
        }
    }

    /**
     *
     *
     * @return sentence; a newly created sentence with string component STRING
     */
    @LispMethod(comment = "@return sentence; a newly created sentence with string component STRING")
    public static SubLObject new_sentence(SubLObject string, SubLObject wordifier) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        if (((NIL != string) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(string))) {
            throw new AssertionError(string);
        }
        final SubLObject sentence = new_phrase(UNPROVIDED);
        if (NIL != string) {
            _csetf_sign_string(sentence, string);
        }
        _csetf_sign_category(sentence, $S);
        if (NIL != string) {
            _csetf_sign_constituents(sentence, string_wordify(string, wordifier));
            SubLObject cdolist_list_var = sentence_yield_exhaustive(sentence);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                _csetf_sign_mother(word, sentence);
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        }
        sign_update(sentence, $list152);
        return sentence;
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a sentence, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a sentence, nil otherwise")
    public static final SubLObject sentence_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != phrase_p(v_object)) && (phrase_category(v_object) == $S));
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a sentence, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a sentence, nil otherwise")
    public static SubLObject sentence_p(final SubLObject v_object) {
        return makeBoolean((NIL != phrase_p(v_object)) && (phrase_category(v_object) == $S));
    }

    /**
     * Pretty-print SENTENCE to STREAM
     */
    @LispMethod(comment = "Pretty-print SENTENCE to STREAM")
    public static final SubLObject sentence_print_alt(SubLObject sentence, SubLObject stream, SubLObject depth) {
        return sign_print(sentence, stream, depth);
    }

    /**
     * Pretty-print SENTENCE to STREAM
     */
    @LispMethod(comment = "Pretty-print SENTENCE to STREAM")
    public static SubLObject sentence_print(final SubLObject sentence, final SubLObject stream, final SubLObject depth) {
        return sign_print(sentence, stream, depth);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return string; the string of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return string; the string of SENTENCE")
    public static final SubLObject sentence_string_alt(SubLObject sentence) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        return sign_string(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return string; the string of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return string; the string of SENTENCE")
    public static SubLObject sentence_string(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        return sign_string(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return string; the category of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return string; the category of SENTENCE")
    public static final SubLObject sentence_category_alt(SubLObject sentence) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        return sign_category(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return string; the category of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return string; the category of SENTENCE")
    public static SubLObject sentence_category(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        return sign_category(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return vector; a vector of the yield of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return vector; a vector of the yield of SENTENCE")
    public static final SubLObject sentence_yield_alt(SubLObject sentence) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        return phrase_yield(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return vector; a vector of the yield of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return vector; a vector of the yield of SENTENCE")
    public static SubLObject sentence_yield(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        return phrase_yield(sentence);
    }

    public static SubLObject sentence_yield_exhaustive(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        SubLObject result_yield = NIL;
        final SubLObject vector_var = phrase_yield(sentence);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        SubLObject items_var;
        SubLObject vector_var_$1;
        SubLObject backwardP_var_$2;
        SubLObject length_$3;
        SubLObject v_iteration_$4;
        SubLObject element_num_$5;
        SubLObject item;
        SubLObject cdolist_list_var;
        SubLObject item2;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            word = aref(vector_var, element_num);
            if (NIL != exhaustive_word_p(word)) {
                items_var = word_constituents(word);
                if (items_var.isVector()) {
                    vector_var_$1 = items_var;
                    backwardP_var_$2 = NIL;
                    for (length_$3 = length(vector_var_$1), v_iteration_$4 = NIL, v_iteration_$4 = ZERO_INTEGER; v_iteration_$4.numL(length_$3); v_iteration_$4 = add(v_iteration_$4, ONE_INTEGER)) {
                        element_num_$5 = (NIL != backwardP_var_$2) ? subtract(length_$3, v_iteration_$4, ONE_INTEGER) : v_iteration_$4;
                        item = aref(vector_var_$1, element_num_$5);
                        result_yield = cons(item, result_yield);
                    }
                } else {
                    cdolist_list_var = items_var;
                    item2 = NIL;
                    item2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result_yield = cons(item2, result_yield);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    } 
                }
            } else {
                result_yield = cons(word, result_yield);
            }
        }
        return nreverse(result_yield);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return string; the constituents of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return string; the constituents of SENTENCE")
    public static final SubLObject sentence_constituents_alt(SubLObject sentence) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        return sign_constituents(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return string; the constituents of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return string; the constituents of SENTENCE")
    public static SubLObject sentence_constituents(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        return sign_constituents(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return string; information about SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return string; information about SENTENCE")
    public static final SubLObject sentence_info_alt(SubLObject sentence) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        return sign_info(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return string; information about SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return string; information about SENTENCE")
    public static SubLObject sentence_info(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        return sign_info(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return integer; the character offset of the beginning of this sentence in relation to the document it is part of, if any
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return integer; the character offset of the beginning of this sentence in relation to the document it is part of, if any")
    public static final SubLObject sentence_offset_alt(SubLObject sentence) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        return sign_offset(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return integer; the character offset of the beginning of this sentence in relation to the document it is part of, if any
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return integer; the character offset of the beginning of this sentence in relation to the document it is part of, if any")
    public static SubLObject sentence_offset(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        return sign_offset(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return the local index of SENTENCE with its paragraph
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return the local index of SENTENCE with its paragraph")
    public static final SubLObject sentence_index_alt(SubLObject sentence) {
        {
            SubLObject paragraph = sentence_mother(sentence);
            SubLObject i = ZERO_INTEGER;
            if (NIL != paragraph) {
                while (sentence != paragraph_get(paragraph, i)) {
                    i = add(i, ONE_INTEGER);
                } 
                return i;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return the local index of SENTENCE with its paragraph
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return the local index of SENTENCE with its paragraph")
    public static SubLObject sentence_index(final SubLObject sentence) {
        final SubLObject paragraph = sentence_mother(sentence);
        SubLObject i = ZERO_INTEGER;
        if (NIL != paragraph) {
            while (!sentence.eql(paragraph_get(paragraph, i))) {
                i = add(i, ONE_INTEGER);
            } 
            return i;
        }
        return NIL;
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return sign; the INDEXth sign of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return sign; the INDEXth sign of SENTENCE")
    public static final SubLObject sentence_get_alt(SubLObject sentence, SubLObject index) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        SubLTrampolineFile.checkType(index, INTEGERP);
        return sign_get(sentence, index);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return sign; the INDEXth sign of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return sign; the INDEXth sign of SENTENCE")
    public static SubLObject sentence_get(final SubLObject sentence, final SubLObject index) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        assert NIL != integerp(index) : "! integerp(index) " + ("Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) ") + index;
        return sign_get(sentence, index);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return paragraph; the paragraph that contains this sentence
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return paragraph; the paragraph that contains this sentence")
    public static final SubLObject sentence_mother_alt(SubLObject sentence) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        return sign_mother(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return paragraph; the paragraph that contains this sentence
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return paragraph; the paragraph that contains this sentence")
    public static SubLObject sentence_mother(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        return sign_mother(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @param INDEX
    integerp
     * 		
     * @param SIGN
    sign-p
     * 		
     * @return sentence; a version of SENTENCE whose INDEXth constituent has been set to SIGN
     * @unknown destructively modifies SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@param INDEX\nintegerp\r\n\t\t\r\n@param SIGN\nsign-p\r\n\t\t\r\n@return sentence; a version of SENTENCE whose INDEXth constituent has been set to SIGN\r\n@unknown destructively modifies SENTENCE")
    public static final SubLObject sentence_set_alt(SubLObject sentence, SubLObject index, SubLObject sign) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        SubLTrampolineFile.checkType(index, INTEGERP);
        SubLTrampolineFile.checkType(sign, SIGN_P);
        return sign_set(sentence, index, sign);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @param INDEX
    integerp
     * 		
     * @param SIGN
    sign-p
     * 		
     * @return sentence; a version of SENTENCE whose INDEXth constituent has been set to SIGN
     * @unknown destructively modifies SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@param INDEX\nintegerp\r\n\t\t\r\n@param SIGN\nsign-p\r\n\t\t\r\n@return sentence; a version of SENTENCE whose INDEXth constituent has been set to SIGN\r\n@unknown destructively modifies SENTENCE")
    public static SubLObject sentence_set(final SubLObject sentence, final SubLObject index, final SubLObject sign) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        assert NIL != integerp(index) : "! integerp(index) " + ("Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) ") + index;
        assert NIL != sign_p(sign) : "! document.sign_p(sign) " + ("document.sign_p(sign) " + "CommonSymbols.NIL != document.sign_p(sign) ") + sign;
        return sign_set(sentence, index, sign);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return integer; the number of constituents of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return integer; the number of constituents of SENTENCE")
    public static final SubLObject sentence_length_alt(SubLObject sentence) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        return sign_length(sentence);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return integer; the number of constituents of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return integer; the number of constituents of SENTENCE")
    public static SubLObject sentence_length(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        return sign_length(sentence);
    }

    /**
     * Execute BODY with CONSTITUENT successively bound to each
     * constituent in SENTENCE
     */
    @LispMethod(comment = "Execute BODY with CONSTITUENT successively bound to each\r\nconstituent in SENTENCE\nExecute BODY with CONSTITUENT successively bound to each\nconstituent in SENTENCE")
    public static final SubLObject sentence_do_constituents_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt135);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject constituent = NIL;
                    SubLObject sentence = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt135);
                    constituent = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt135);
                    sentence = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(SIGN_DO_CONSTITUENTS, list(constituent, sentence), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt135);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with CONSTITUENT successively bound to each
     * constituent in SENTENCE
     */
    @LispMethod(comment = "Execute BODY with CONSTITUENT successively bound to each\r\nconstituent in SENTENCE\nExecute BODY with CONSTITUENT successively bound to each\nconstituent in SENTENCE")
    public static SubLObject sentence_do_constituents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constituent = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list154);
        constituent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(SIGN_DO_CONSTITUENTS, list(constituent, sentence), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list154);
        return NIL;
    }

    /**
     *
     *
     * @param START
     * 		integerp (index between the words)
     * @param END
     * 		integerp (index between the words)
     * @return STRINGP; The substring of SENTENCE from START to END.
     * @unknown baxter
     * @unknown (sentence-reconstruct-substring 0 2 (new-sentence '3.4 billion cats')) ->
    '3.4 billion'
     */
    @LispMethod(comment = "@param START\r\n\t\tintegerp (index between the words)\r\n@param END\r\n\t\tintegerp (index between the words)\r\n@return STRINGP; The substring of SENTENCE from START to END.\r\n@unknown baxter\r\n@unknown (sentence-reconstruct-substring 0 2 (new-sentence \'3.4 billion cats\')) ->\r\n\'3.4 billion\'")
    public static final SubLObject sentence_reconstruct_substring_alt(SubLObject start, SubLObject end, SubLObject sentence) {
        {
            SubLObject sentence_string = sentence_string(sentence);
            SubLObject last_index = ZERO_INTEGER;
            SubLObject output_strings = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(end); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject word = sentence_get(sentence, i);
                    SubLObject word_string = word_string(word);
                    SubLObject remaining_sentence_string = string_utilities.substring(sentence_string, last_index, UNPROVIDED);
                    SubLObject word_start = search(word_string, remaining_sentence_string, EQUAL, IDENTITY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject first_space = (NIL != word_start) ? ((SubLObject) (NIL)) : search($str_alt39$_, remaining_sentence_string, EQUAL, IDENTITY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject word_end = (word_start.isInteger()) ? ((SubLObject) (add(word_start, length(word_string)))) : first_space.isInteger() ? ((SubLObject) (first_space)) : ZERO_INTEGER;
                    last_index = add(last_index, word_end);
                    if (i.numGE(start)) {
                        if ((NIL != output_strings) || (NIL == word_start)) {
                            word_string = string_utilities.substring(remaining_sentence_string, ZERO_INTEGER, word_end);
                        }
                        output_strings = cons(word_string, output_strings);
                    }
                }
            }
            return apply(CCONCATENATE, nreverse(output_strings));
        }
    }

    /**
     *
     *
     * @param START
     * 		integerp (index between the words)
     * @param END
     * 		integerp (index between the words)
     * @return STRINGP; The substring of SENTENCE from START to END.
     * @unknown baxter
     * @unknown (sentence-reconstruct-substring 0 2 (new-sentence '3.4 billion cats')) ->
    '3.4 billion'
     */
    @LispMethod(comment = "@param START\r\n\t\tintegerp (index between the words)\r\n@param END\r\n\t\tintegerp (index between the words)\r\n@return STRINGP; The substring of SENTENCE from START to END.\r\n@unknown baxter\r\n@unknown (sentence-reconstruct-substring 0 2 (new-sentence \'3.4 billion cats\')) ->\r\n\'3.4 billion\'")
    public static SubLObject sentence_reconstruct_substring(final SubLObject start, final SubLObject end, final SubLObject sentence) {
        final SubLObject sentence_string = sentence_string(sentence);
        SubLObject last_index = ZERO_INTEGER;
        SubLObject output_strings = NIL;
        SubLObject i;
        SubLObject word;
        SubLObject word_string;
        SubLObject remaining_sentence_string;
        SubLObject word_start;
        SubLObject first_space;
        SubLObject word_end;
        for (i = NIL, i = ZERO_INTEGER; i.numL(end); i = add(i, ONE_INTEGER)) {
            word = sentence_get(sentence, i);
            word_string = word_string(word);
            remaining_sentence_string = string_utilities.substring(sentence_string, last_index, UNPROVIDED);
            word_start = search(word_string, remaining_sentence_string, EQUAL, IDENTITY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            first_space = (NIL != word_start) ? NIL : search($$$_, remaining_sentence_string, EQUAL, IDENTITY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            word_end = (word_start.isInteger()) ? add(word_start, length(word_string)) : first_space.isInteger() ? first_space : ZERO_INTEGER;
            last_index = add(last_index, word_end);
            if (i.numGE(start)) {
                if ((NIL != output_strings) || (NIL == word_start)) {
                    word_string = string_utilities.substring(remaining_sentence_string, ZERO_INTEGER, word_end);
                }
                output_strings = cons(word_string, output_strings);
            }
        }
        return apply(CCONCATENATE, nreverse(output_strings));
    }

    public static SubLObject construct_string_from_words(final SubLObject words, SubLObject standardizeP, SubLObject stream) {
        if (standardizeP == UNPROVIDED) {
            standardizeP = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = make_private_string_output_stream();
        }
        clear_output(stream);
        if (NIL != words) {
            SubLObject current_end = word_offset(words.first());
            SubLObject cdolist_list_var = words;
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (word_offset(word).numG(current_end)) {
                    SubLObject cdotimes_end_var;
                    SubLObject n;
                    for (cdotimes_end_var = subtract(word_offset(word), current_end), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                        write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                        current_end = add(current_end, ONE_INTEGER);
                    }
                }
                if (NIL != standardizeP) {
                    final SubLObject standardized = caar(nl_trie.nl_trie_standardize_strings(list(word_string(word))));
                    write_string(NIL != standardized ? standardized : $str38$, stream, UNPROVIDED, UNPROVIDED);
                } else {
                    write_string(word_string(word), stream, UNPROVIDED, UNPROVIDED);
                }
                current_end = add(current_end, length(word_string(word)));
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        }
        return get_output_stream_string(stream);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return sentence; a version of SENTENCE with all punctuation removed
     * @unknown SENTENCE is possibly destructively modified
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return sentence; a version of SENTENCE with all punctuation removed\r\n@unknown SENTENCE is possibly destructively modified")
    public static final SubLObject sentence_delete_punctuation_alt(SubLObject sentence) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        delete_if(PUNCTUATION_SIGN_P, sentence_constituents(sentence), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return sentence;
    }

    /**
     *
     *
     * @param SENTENCE
    sentence-p
     * 		
     * @return sentence; a version of SENTENCE with all punctuation removed
     * @unknown SENTENCE is possibly destructively modified
     */
    @LispMethod(comment = "@param SENTENCE\nsentence-p\r\n\t\t\r\n@return sentence; a version of SENTENCE with all punctuation removed\r\n@unknown SENTENCE is possibly destructively modified")
    public static SubLObject sentence_delete_punctuation(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        delete_if(PUNCTUATION_SIGN_P, sentence_constituents(sentence), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return sentence;
    }

    /**
     *
     *
     * @param SENTENCE
    sentence
     * 		
     * @return list; the sequence of words in SENTENCE as a list in the same order
     */
    @LispMethod(comment = "@param SENTENCE\nsentence\r\n\t\t\r\n@return list; the sequence of words in SENTENCE as a list in the same order")
    public static final SubLObject sentence_listify_alt(SubLObject sentence) {
        return vector_utilities.vector_elements(sentence_constituents(sentence), UNPROVIDED);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence
     * 		
     * @return list; the sequence of words in SENTENCE as a list in the same order
     */
    @LispMethod(comment = "@param SENTENCE\nsentence\r\n\t\t\r\n@return list; the sequence of words in SENTENCE as a list in the same order")
    public static SubLObject sentence_listify(final SubLObject sentence) {
        return vector_utilities.vector_elements(sentence_constituents(sentence), UNPROVIDED);
    }

    /**
     *
     *
     * @param SENTENCE
    sentence
     * 		
     * @return list; the list of strings of the words of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence\r\n\t\t\r\n@return list; the list of strings of the words of SENTENCE")
    public static final SubLObject sentence_stringify_alt(SubLObject sentence) {
        return Mapping.mapcar(SIGN_STRING, sentence_listify(sentence));
    }

    /**
     *
     *
     * @param SENTENCE
    sentence
     * 		
     * @return list; the list of strings of the words of SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\nsentence\r\n\t\t\r\n@return list; the list of strings of the words of SENTENCE")
    public static SubLObject sentence_stringify(final SubLObject sentence) {
        return Mapping.mapcar(SIGN_STRING, sentence_listify(sentence));
    }

    /**
     *
     *
     * @param FST
     * 		finite-state-transducer; the fst from which to build this sentence
     * @return sentence; a new sentence build from FST
     */
    @LispMethod(comment = "@param FST\r\n\t\tfinite-state-transducer; the fst from which to build this sentence\r\n@return sentence; a new sentence build from FST")
    public static final SubLObject build_sentence_token_alt(SubLObject fst, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = (NIL != $wordifier$.getDynamicValue()) ? ((SubLObject) ($wordifier$.getDynamicValue())) : FST_STRING_WORDIFY;
        }
        {
            SubLObject sentence = new_sentence(NIL, wordifier);
            SubLObject string = $str_alt32$;
            SubLObject current_index = NIL;
            _csetf_sign_constituents(sentence, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)));
            {
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject vector_var = sentence_yield(sentence);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject word = aref(vector_var, element_num);
                                SubLObject word_offset = sign_offset(word);
                                if ((NIL != current_index) && current_index.numL(word_offset)) {
                                    {
                                        SubLObject cdotimes_end_var = subtract(word_offset, current_index);
                                        SubLObject n = NIL;
                                        for (n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                                            princ($str_alt39$_, stream);
                                        }
                                    }
                                }
                                _csetf_sign_mother(word, sentence);
                                princ(word_string(word), stream);
                                current_index = add(word_offset, word_length(word));
                            }
                        }
                    }
                    string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            close(stream, UNPROVIDED);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
            _csetf_sign_offset(sentence, word_offset(sentence_get(sentence, ZERO_INTEGER)));
            _csetf_sign_string(sentence, string);
            return sentence;
        }
    }

    /**
     *
     *
     * @param FST
     * 		finite-state-transducer; the fst from which to build this sentence
     * @return sentence; a new sentence build from FST
     */
    @LispMethod(comment = "@param FST\r\n\t\tfinite-state-transducer; the fst from which to build this sentence\r\n@return sentence; a new sentence build from FST")
    public static SubLObject build_sentence_token(final SubLObject fst, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = (NIL != $wordifier$.getDynamicValue()) ? $wordifier$.getDynamicValue() : FST_STRING_WORDIFY;
        }
        final SubLObject sentence = new_sentence(NIL, wordifier);
        SubLObject string = $str38$;
        SubLObject current_index = NIL;
        _csetf_sign_constituents(sentence, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)));
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject cdolist_list_var = sentence_yield_exhaustive(sentence);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject word_offset = sign_offset(word);
                if ((NIL != current_index) && current_index.numL(word_offset)) {
                    SubLObject cdotimes_end_var;
                    SubLObject n;
                    for (cdotimes_end_var = subtract(word_offset, current_index), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                        princ($$$_, stream);
                    }
                }
                _csetf_sign_mother(word, sentence);
                princ(word_string(word), stream);
                current_index = add(word_offset, word_length(word));
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
            string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        _csetf_sign_offset(sentence, word_offset(sentence_get(sentence, ZERO_INTEGER)));
        _csetf_sign_string(sentence, string);
        return sentence;
    }

    /**
     *
     *
     * @param STRING
     * 		string; the string from which to create a vector of sentences
     * @return vector; a vector of sentences created from source STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the string from which to create a vector of sentences\r\n@return vector; a vector of sentences created from source STRING")
    public static final SubLObject string_sentencify_alt(SubLObject string, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = RKF_STANDARD_STRING_WORDIFY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentences = NIL;
                {
                    SubLObject _prev_bind_0 = $wordifier$.currentBinding(thread);
                    try {
                        $wordifier$.bind(wordifier, thread);
                        sentences = finite_state_transducer.fst_match_global($sentencifier_fst$.getDynamicValue(thread), string_wordify(string, wordifier));
                    } finally {
                        $wordifier$.rebind(_prev_bind_0, thread);
                    }
                }
                return sentences;
            }
        }
    }

    /**
     *
     *
     * @param STRING
     * 		string; the string from which to create a vector of sentences
     * @return vector; a vector of sentences created from source STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the string from which to create a vector of sentences\r\n@return vector; a vector of sentences created from source STRING")
    public static SubLObject string_sentencify(final SubLObject string, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = RKF_STANDARD_STRING_WORDIFY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = NIL;
        final SubLObject _prev_bind_0 = $wordifier$.currentBinding(thread);
        try {
            $wordifier$.bind(wordifier, thread);
            sentences = finite_state_transducer.fst_match_global($sentencifier_fst$.getDynamicValue(thread), string_wordify(string, wordifier));
        } finally {
            $wordifier$.rebind(_prev_bind_0, thread);
        }
        return sentences;
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a sentence starting with a newline, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a sentence starting with a newline, nil otherwise")
    public static final SubLObject newline_sentence_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != sentence_p(v_object)) && (aref(word_string(aref(sign_constituents(v_object), ZERO_INTEGER)), ZERO_INTEGER) == CHAR_newline));
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is a sentence starting with a newline, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is a sentence starting with a newline, nil otherwise")
    public static SubLObject newline_sentence_p(final SubLObject v_object) {
        return makeBoolean((NIL != sentence_p(v_object)) && aref(word_string(aref(sign_constituents(v_object), ZERO_INTEGER)), ZERO_INTEGER).eql(CHAR_newline));
    }

    public static final SubLObject paragraph_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        paragraph_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject paragraph_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        paragraph_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject paragraph_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.document.$paragraph_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject paragraph_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.document.$paragraph_native.class ? T : NIL;
    }

    public static final SubLObject paragraph_sentences_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARAGRAPH_P);
        return v_object.getField2();
    }

    public static SubLObject paragraph_sentences(final SubLObject v_object) {
        assert NIL != paragraph_p(v_object) : "! document.paragraph_p(v_object) " + "document.paragraph_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject paragraph_mother_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PARAGRAPH_P);
        return v_object.getField3();
    }

    public static SubLObject paragraph_mother(final SubLObject v_object) {
        assert NIL != paragraph_p(v_object) : "! document.paragraph_p(v_object) " + "document.paragraph_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_paragraph_sentences_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARAGRAPH_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_paragraph_sentences(final SubLObject v_object, final SubLObject value) {
        assert NIL != paragraph_p(v_object) : "! document.paragraph_p(v_object) " + "document.paragraph_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_paragraph_mother_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PARAGRAPH_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_paragraph_mother(final SubLObject v_object, final SubLObject value) {
        assert NIL != paragraph_p(v_object) : "! document.paragraph_p(v_object) " + "document.paragraph_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_paragraph_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.document.$paragraph_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SENTENCES)) {
                        _csetf_paragraph_sentences(v_new, current_value);
                    } else {
                        if (pcase_var.eql($MOTHER)) {
                            _csetf_paragraph_mother(v_new, current_value);
                        } else {
                            Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_paragraph(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.document.$paragraph_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SENTENCES)) {
                _csetf_paragraph_sentences(v_new, current_value);
            } else
                if (pcase_var.eql($MOTHER)) {
                    _csetf_paragraph_mother(v_new, current_value);
                } else {
                    Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_paragraph(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PARAGRAPH, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SENTENCES, paragraph_sentences(obj));
        funcall(visitor_fn, obj, $SLOT, $MOTHER, paragraph_mother(obj));
        funcall(visitor_fn, obj, $END, MAKE_PARAGRAPH, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_paragraph_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_paragraph(obj, visitor_fn);
    }

    /**
     *
     *
     * @param SENTENCE
    variable
     * 		
     * @param PARAGRAPH
     * 		paragraph
     * 		Execute BODY with SENTENCE successively bound to each sentence in PARAGRAPH
     */
    @LispMethod(comment = "@param SENTENCE\nvariable\r\n\t\t\r\n@param PARAGRAPH\r\n\t\tparagraph\r\n\t\tExecute BODY with SENTENCE successively bound to each sentence in PARAGRAPH")
    public static final SubLObject paragraph_do_sentences_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt151);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sentence = NIL;
                    SubLObject paragraph = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt151);
                    sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt151);
                    paragraph = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOVECTOR, list(sentence, list(PARAGRAPH_SENTENCES, paragraph)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt151);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param SENTENCE
    variable
     * 		
     * @param PARAGRAPH
     * 		paragraph
     * 		Execute BODY with SENTENCE successively bound to each sentence in PARAGRAPH
     */
    @LispMethod(comment = "@param SENTENCE\nvariable\r\n\t\t\r\n@param PARAGRAPH\r\n\t\tparagraph\r\n\t\tExecute BODY with SENTENCE successively bound to each sentence in PARAGRAPH")
    public static SubLObject paragraph_do_sentences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list173);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence = NIL;
        SubLObject paragraph = NIL;
        destructuring_bind_must_consp(current, datum, $list173);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list173);
        paragraph = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOVECTOR, list(sentence, list(PARAGRAPH_SENTENCES, paragraph)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list173);
        return NIL;
    }

    /**
     *
     *
     * @param WORD
    variable
     * 		
     * @param PARAGRAPH
     * 		paragraph
     * 		Execute BODY with WORD successively bound to each word in PARAGRAPH
     */
    @LispMethod(comment = "@param WORD\nvariable\r\n\t\t\r\n@param PARAGRAPH\r\n\t\tparagraph\r\n\t\tExecute BODY with WORD successively bound to each word in PARAGRAPH")
    public static final SubLObject paragraph_do_words_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt152);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject word = NIL;
                    SubLObject paragraph = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    word = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt152);
                    paragraph = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject sentence = $sym153$SENTENCE;
                            return list(PARAGRAPH_DO_SENTENCES, list(sentence, paragraph), listS(SENTENCE_DO_WORDS, list(word, sentence), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt152);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param WORD
    variable
     * 		
     * @param PARAGRAPH
     * 		paragraph
     * 		Execute BODY with WORD successively bound to each word in PARAGRAPH
     */
    @LispMethod(comment = "@param WORD\nvariable\r\n\t\t\r\n@param PARAGRAPH\r\n\t\tparagraph\r\n\t\tExecute BODY with WORD successively bound to each word in PARAGRAPH")
    public static SubLObject paragraph_do_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject paragraph = NIL;
        destructuring_bind_must_consp(current, datum, $list174);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        paragraph = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject sentence = $sym175$SENTENCE;
            return list(PARAGRAPH_DO_SENTENCES, list(sentence, paragraph), listS(SENTENCE_DO_WORDS, list(word, sentence), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list174);
        return NIL;
    }

    public static SubLObject paragraph_do_minimal_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject paragraph = NIL;
        destructuring_bind_must_consp(current, datum, $list174);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        paragraph = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject sentence = $sym178$SENTENCE;
            return list(PARAGRAPH_DO_SENTENCES, list(sentence, paragraph), listS(SENTENCE_DO_MINIMAL_WORDS, list(word, sentence), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list174);
        return NIL;
    }

    /**
     *
     *
     * @param STRING
     * 		string; the string from which to read the paragraph content
     * @return paragraph; a new paragraph containing the sentences in STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the string from which to read the paragraph content\r\n@return paragraph; a new paragraph containing the sentences in STRING")
    public static final SubLObject new_paragraph_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject paragraph = make_paragraph(UNPROVIDED);
            _csetf_paragraph_sentences(paragraph, string_sentencify(string, UNPROVIDED));
            {
                SubLObject vector_var = paragraph_sentences(paragraph);
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject sen = aref(vector_var, element_num);
                        _csetf_sign_mother(sen, paragraph);
                    }
                }
            }
            return paragraph;
        }
    }

    /**
     *
     *
     * @param STRING
     * 		string; the string from which to read the paragraph content
     * @return paragraph; a new paragraph containing the sentences in STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the string from which to read the paragraph content\r\n@return paragraph; a new paragraph containing the sentences in STRING")
    public static SubLObject new_paragraph(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject paragraph = make_paragraph(UNPROVIDED);
        _csetf_paragraph_sentences(paragraph, string_sentencify(string, UNPROVIDED));
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sen;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sen = aref(vector_var, element_num);
            _csetf_sign_mother(sen, paragraph);
        }
        return paragraph;
    }

    /**
     * Pretty-print PARAGRAPH to STREAM
     */
    @LispMethod(comment = "Pretty-print PARAGRAPH to STREAM")
    public static final SubLObject paragraph_print_alt(SubLObject paragraph, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(paragraph, PARAGRAPH_P);
            write_string($str_alt156$__PAR_, stream, UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdotimes_end_var = min(paragraph_sentence_length(paragraph), $text_class_print_length$.getDynamicValue(thread));
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    terpri(stream);
                    sentence_print(paragraph_get(paragraph, i), stream, ZERO_INTEGER);
                }
            }
            if ($text_class_print_length$.getDynamicValue(thread).numL(paragraph_sentence_length(paragraph))) {
                write_string($str_alt40$____, stream, UNPROVIDED, UNPROVIDED);
            }
            write_string($str_alt42$_, stream, UNPROVIDED, UNPROVIDED);
            return paragraph;
        }
    }

    /**
     * Pretty-print PARAGRAPH to STREAM
     */
    @LispMethod(comment = "Pretty-print PARAGRAPH to STREAM")
    public static SubLObject paragraph_print(final SubLObject paragraph, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != paragraph_p(paragraph) : "! document.paragraph_p(paragraph) " + ("document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) ") + paragraph;
        write_string($str180$__PAR_, stream, UNPROVIDED, UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = min(paragraph_sentence_length(paragraph), $text_class_print_length$.getDynamicValue(thread)), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            terpri(stream);
            sentence_print(paragraph_get(paragraph, i), stream, ZERO_INTEGER);
        }
        if ($text_class_print_length$.getDynamicValue(thread).numL(paragraph_sentence_length(paragraph))) {
            write_string($str46$____, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
        return paragraph;
    }

    /**
     *
     *
     * @param PARAGRAPH
    paragraph
     * 		
     * @param INDEX
    integer
     * 		
     * @return sentence; the INDEXth sentence of PARAGRAPH
     */
    @LispMethod(comment = "@param PARAGRAPH\nparagraph\r\n\t\t\r\n@param INDEX\ninteger\r\n\t\t\r\n@return sentence; the INDEXth sentence of PARAGRAPH")
    public static final SubLObject paragraph_get_alt(SubLObject paragraph, SubLObject index) {
        SubLTrampolineFile.checkType(paragraph, PARAGRAPH_P);
        SubLTrampolineFile.checkType(index, INTEGERP);
        return aref(paragraph_sentences(paragraph), index);
    }

    /**
     *
     *
     * @param PARAGRAPH
    paragraph
     * 		
     * @param INDEX
    integer
     * 		
     * @return sentence; the INDEXth sentence of PARAGRAPH
     */
    @LispMethod(comment = "@param PARAGRAPH\nparagraph\r\n\t\t\r\n@param INDEX\ninteger\r\n\t\t\r\n@return sentence; the INDEXth sentence of PARAGRAPH")
    public static SubLObject paragraph_get(final SubLObject paragraph, final SubLObject index) {
        assert NIL != paragraph_p(paragraph) : "! document.paragraph_p(paragraph) " + ("document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) ") + paragraph;
        assert NIL != integerp(index) : "! integerp(index) " + ("Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) ") + index;
        return aref(paragraph_sentences(paragraph), index);
    }

    /**
     * Destructively set PARAGRAPH's INDEXth sentence to SENTENCE
     *
     * @param PARAGRAPH
    paragraph
     * 		
     * @param INDEX
    integer
     * 		
     * @param SENTENCE
    sentence
     * 		
     * @return sentence; the previous INDEXth sentence of PARAGRAPH
     */
    @LispMethod(comment = "Destructively set PARAGRAPH\'s INDEXth sentence to SENTENCE\r\n\r\n@param PARAGRAPH\nparagraph\r\n\t\t\r\n@param INDEX\ninteger\r\n\t\t\r\n@param SENTENCE\nsentence\r\n\t\t\r\n@return sentence; the previous INDEXth sentence of PARAGRAPH")
    public static final SubLObject paragraph_set_alt(SubLObject paragraph, SubLObject index, SubLObject sentence) {
        SubLTrampolineFile.checkType(paragraph, PARAGRAPH_P);
        SubLTrampolineFile.checkType(index, INTEGERP);
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        {
            SubLObject old_sentence = aref(paragraph_sentences(paragraph), index);
            set_aref(paragraph_sentences(paragraph), index, sentence);
            _csetf_sign_mother(sentence, paragraph);
            return old_sentence;
        }
    }

    /**
     * Destructively set PARAGRAPH's INDEXth sentence to SENTENCE
     *
     * @param PARAGRAPH
    		paragraph
     * 		
     * @param INDEX
    		integer
     * 		
     * @param SENTENCE
    		sentence
     * 		
     * @return sentence; the previous INDEXth sentence of PARAGRAPH
     */
    @LispMethod(comment = "Destructively set PARAGRAPH\'s INDEXth sentence to SENTENCE\r\n\r\n@param PARAGRAPH\n\t\tparagraph\r\n\t\t\r\n@param INDEX\n\t\tinteger\r\n\t\t\r\n@param SENTENCE\n\t\tsentence\r\n\t\t\r\n@return sentence; the previous INDEXth sentence of PARAGRAPH")
    public static SubLObject paragraph_set(final SubLObject paragraph, final SubLObject index, final SubLObject sentence) {
        assert NIL != paragraph_p(paragraph) : "! document.paragraph_p(paragraph) " + ("document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) ") + paragraph;
        assert NIL != integerp(index) : "! integerp(index) " + ("Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) ") + index;
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        final SubLObject old_sentence = aref(paragraph_sentences(paragraph), index);
        set_aref(paragraph_sentences(paragraph), index, sentence);
        _csetf_sign_mother(sentence, paragraph);
        return old_sentence;
    }

    /**
     *
     *
     * @param PARAGRAPH
     * 		paragraph; the paragraph whose number of sentences is to be computed
     * @return integer; the number of sentences in PARAGRAPH
     */
    @LispMethod(comment = "@param PARAGRAPH\r\n\t\tparagraph; the paragraph whose number of sentences is to be computed\r\n@return integer; the number of sentences in PARAGRAPH")
    public static final SubLObject paragraph_sentence_length_alt(SubLObject paragraph) {
        SubLTrampolineFile.checkType(paragraph, PARAGRAPH_P);
        return length(paragraph_sentences(paragraph));
    }

    /**
     *
     *
     * @param PARAGRAPH
     * 		paragraph; the paragraph whose number of sentences is to be computed
     * @return integer; the number of sentences in PARAGRAPH
     */
    @LispMethod(comment = "@param PARAGRAPH\r\n\t\tparagraph; the paragraph whose number of sentences is to be computed\r\n@return integer; the number of sentences in PARAGRAPH")
    public static SubLObject paragraph_sentence_length(final SubLObject paragraph) {
        assert NIL != paragraph_p(paragraph) : "! document.paragraph_p(paragraph) " + ("document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) ") + paragraph;
        return length(paragraph_sentences(paragraph));
    }

    /**
     *
     *
     * @param PARAGRAPH
     * 		paragraph; the paragraph whose number of words is to be computed
     * @return integer; the number of words in PARAGRAPH
     */
    @LispMethod(comment = "@param PARAGRAPH\r\n\t\tparagraph; the paragraph whose number of words is to be computed\r\n@return integer; the number of words in PARAGRAPH")
    public static final SubLObject paragraph_word_length_alt(SubLObject paragraph) {
        SubLTrampolineFile.checkType(paragraph, PARAGRAPH_P);
        {
            SubLObject length = ZERO_INTEGER;
            SubLObject vector_var = paragraph_sentences(paragraph);
            SubLObject backwardP_var = NIL;
            SubLObject length_1 = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length_1); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length_1, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject sentence = aref(vector_var, element_num);
                    length = add(length, sentence_length(sentence));
                }
            }
            return length;
        }
    }

    /**
     *
     *
     * @param PARAGRAPH
     * 		paragraph; the paragraph whose number of words is to be computed
     * @return integer; the number of words in PARAGRAPH
     */
    @LispMethod(comment = "@param PARAGRAPH\r\n\t\tparagraph; the paragraph whose number of words is to be computed\r\n@return integer; the number of words in PARAGRAPH")
    public static SubLObject paragraph_word_length(final SubLObject paragraph) {
        assert NIL != paragraph_p(paragraph) : "! document.paragraph_p(paragraph) " + ("document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) ") + paragraph;
        SubLObject length = ZERO_INTEGER;
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = NIL;
        SubLObject length_$6;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        for (length_$6 = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length_$6); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length_$6, v_iteration, ONE_INTEGER) : v_iteration;
            sentence = aref(vector_var, element_num);
            length = add(length, sentence_length(sentence));
        }
        return length;
    }

    public static final SubLObject paragraph_offset_alt(SubLObject paragraph) {
        return sentence_offset(paragraph_get(paragraph, ZERO_INTEGER));
    }

    public static SubLObject paragraph_offset(final SubLObject paragraph) {
        return sentence_offset(paragraph_get(paragraph, ZERO_INTEGER));
    }

    /**
     *
     *
     * @param DOCUMENT
    paragraph-p
     * 		
     * @return string-p; the paragraph as a string.  This will be as close as possible to the input string,
    but may not be identical
     * @unknown This will always put in spaces, when there might other types of whitespace in the original string used
    to build the paragraph...
     */
    @LispMethod(comment = "@param DOCUMENT\nparagraph-p\r\n\t\t\r\n@return string-p; the paragraph as a string.  This will be as close as possible to the input string,\r\nbut may not be identical\r\n@unknown This will always put in spaces, when there might other types of whitespace in the original string used\r\nto build the paragraph...")
    public static final SubLObject paragraph_string_alt(SubLObject paragraph) {
        {
            SubLObject output_string = NIL;
            SubLObject current_end = ZERO_INTEGER;
            SubLObject s = NIL;
            try {
                s = make_private_string_output_stream();
                {
                    SubLObject vector_var = paragraph_sentences(paragraph);
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject sent = aref(vector_var, element_num);
                            if (current_end.numL(sentence_offset(sent))) {
                                {
                                    SubLObject diff = subtract(sentence_offset(sent), current_end);
                                    string_utilities.indent(s, diff);
                                    current_end = add(current_end, diff);
                                }
                            }
                            princ(sentence_string(sent), s);
                            current_end = add(current_end, length(sentence_string(sent)));
                        }
                    }
                }
                output_string = get_output_stream_string(s);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(s, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return output_string;
        }
    }

    /**
     *
     *
     * @param DOCUMENT
    paragraph-p
     * 		
     * @return string-p; the paragraph as a string.  This will be as close as possible to the input string,
    but may not be identical
     * @unknown This will always put in spaces, when there might other types of whitespace in the original string used
    to build the paragraph...
     */
    @LispMethod(comment = "@param DOCUMENT\nparagraph-p\r\n\t\t\r\n@return string-p; the paragraph as a string.  This will be as close as possible to the input string,\r\nbut may not be identical\r\n@unknown This will always put in spaces, when there might other types of whitespace in the original string used\r\nto build the paragraph...")
    public static SubLObject paragraph_string(final SubLObject paragraph) {
        SubLObject output_string = NIL;
        SubLObject current_end = ZERO_INTEGER;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject vector_var = paragraph_sentences(paragraph);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject sent;
            SubLObject diff;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                sent = aref(vector_var, element_num);
                if (current_end.numL(sentence_offset(sent))) {
                    diff = subtract(sentence_offset(sent), current_end);
                    string_utilities.indent(s, diff);
                    current_end = add(current_end, diff);
                }
                princ(sentence_string(sent), s);
                current_end = add(current_end, length(sentence_string(sent)));
            }
            output_string = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return output_string;
    }

    /**
     *
     *
     * @param DOCUMENT
    paragraph-p
     * 		
     * @return stringp; the XML string of this paragraph
     */
    @LispMethod(comment = "@param DOCUMENT\nparagraph-p\r\n\t\t\r\n@return stringp; the XML string of this paragraph")
    public static final SubLObject paragraph_to_xml_alt(SubLObject paragraph, SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        SubLTrampolineFile.checkType(paragraph, PARAGRAPH_P);
        {
            SubLObject xml = NIL;
            xml = cconcatenate(string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), new SubLObject[]{ $str_alt157$_PAR_, $newline$.getGlobalValue() });
            {
                SubLObject vector_var = paragraph_sentences(paragraph);
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject sentence = aref(vector_var, element_num);
                        xml = cconcatenate(xml, sign_to_xml(sentence, add(level, ONE_INTEGER)));
                    }
                }
            }
            xml = cconcatenate(xml, new SubLObject[]{ string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), $str_alt158$__PAR_, $newline$.getGlobalValue() });
            return xml;
        }
    }

    /**
     *
     *
     * @param DOCUMENT
    paragraph-p
     * 		
     * @return stringp; the XML string of this paragraph
     */
    @LispMethod(comment = "@param DOCUMENT\nparagraph-p\r\n\t\t\r\n@return stringp; the XML string of this paragraph")
    public static SubLObject paragraph_to_xml(final SubLObject paragraph, SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        assert NIL != paragraph_p(paragraph) : "! document.paragraph_p(paragraph) " + ("document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) ") + paragraph;
        SubLObject xml = NIL;
        xml = cconcatenate(string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), new SubLObject[]{ $str181$_PAR_, $newline$.getGlobalValue() });
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sentence = aref(vector_var, element_num);
            xml = cconcatenate(xml, sign_to_xml(sentence, add(level, ONE_INTEGER)));
        }
        xml = cconcatenate(xml, new SubLObject[]{ string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), $str182$__PAR_, $newline$.getGlobalValue() });
        return xml;
    }

    /**
     *
     *
     * @param FST
     * 		finite-state-transducer; the fst from which to build this paragraph
     * @return paragraph; a new paragraph built from FST
     */
    @LispMethod(comment = "@param FST\r\n\t\tfinite-state-transducer; the fst from which to build this paragraph\r\n@return paragraph; a new paragraph built from FST")
    public static final SubLObject build_paragraph_token_alt(SubLObject fst) {
        {
            SubLObject paragraph = make_paragraph(UNPROVIDED);
            _csetf_paragraph_sentences(paragraph, apply(VECTOR, finite_state_transducer.fst_output(fst)));
            {
                SubLObject vector_var = paragraph_sentences(paragraph);
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject sen = aref(vector_var, element_num);
                        _csetf_sign_mother(sen, paragraph);
                    }
                }
            }
            return paragraph;
        }
    }

    /**
     *
     *
     * @param FST
     * 		finite-state-transducer; the fst from which to build this paragraph
     * @return paragraph; a new paragraph built from FST
     */
    @LispMethod(comment = "@param FST\r\n\t\tfinite-state-transducer; the fst from which to build this paragraph\r\n@return paragraph; a new paragraph built from FST")
    public static SubLObject build_paragraph_token(final SubLObject fst) {
        final SubLObject paragraph = make_paragraph(UNPROVIDED);
        _csetf_paragraph_sentences(paragraph, apply(VECTOR, finite_state_transducer.fst_output(fst)));
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sen;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sen = aref(vector_var, element_num);
            _csetf_sign_mother(sen, paragraph);
        }
        return paragraph;
    }

    /**
     *
     *
     * @param STRING
     * 		string; the string from which to create a vector of paragraphs
     * @return vector; a vector of paragraphs created from source STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstring; the string from which to create a vector of paragraphs\r\n@return vector; a vector of paragraphs created from source STRING")
    public static final SubLObject string_paragraphize(SubLObject string, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return finite_state_transducer.fst_match_global($paragraphier_fst$.getDynamicValue(thread), string_sentencify(string, wordifier));
        }
    }

    public static SubLObject string_paragraphize(final SubLObject string, SubLObject wordifier, SubLObject sentencifyP) {
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        if (sentencifyP == UNPROVIDED) {
            sentencifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sentencifyP) {
            return finite_state_transducer.fst_match_global($paragraphier_fst$.getDynamicValue(thread), string_sentencify(string, wordifier));
        }
        final SubLObject paragraph = make_paragraph(UNPROVIDED);
        final SubLObject sentence = new_sentence(string, wordifier);
        _csetf_paragraph_sentences(paragraph, make_vector(ONE_INTEGER, sentence));
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sen;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sen = aref(vector_var, element_num);
            _csetf_sign_mother(sen, paragraph);
        }
        return make_vector(ONE_INTEGER, paragraph);
    }

    /**
     *
     *
     * @param SIGN
    sign-p
     * 		
     * @param LEVEL
     * 		integerp; the indentation level
     * @return string; the XML string of SIGN
     */
    @LispMethod(comment = "@param SIGN\nsign-p\r\n\t\t\r\n@param LEVEL\r\n\t\tintegerp; the indentation level\r\n@return string; the XML string of SIGN")
    public static final SubLObject sign_to_xml_alt(SubLObject sign, SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        SubLTrampolineFile.checkType(sign, SIGN_P);
        if (NIL != word_p(sign)) {
            return word_to_xml(sign, level);
        } else {
            return phrase_to_xml(sign, level);
        }
    }

    /**
     *
     *
     * @param SIGN
    sign-p
     * 		
     * @param LEVEL
     * 		integerp; the indentation level
     * @return string; the XML string of SIGN
     */
    @LispMethod(comment = "@param SIGN\nsign-p\r\n\t\t\r\n@param LEVEL\r\n\t\tintegerp; the indentation level\r\n@return string; the XML string of SIGN")
    public static SubLObject sign_to_xml(final SubLObject sign, SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        assert NIL != sign_p(sign) : "! document.sign_p(sign) " + ("document.sign_p(sign) " + "CommonSymbols.NIL != document.sign_p(sign) ") + sign;
        if (NIL != word_p(sign)) {
            return word_to_xml(sign, level);
        }
        return phrase_to_xml(sign, level);
    }

    public static final SubLObject document_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        document_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject document_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        document_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject document_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.document.$document_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject document_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.document.$document_native.class ? T : NIL;
    }

    public static final SubLObject document_paragraphs_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, DOCUMENT_P);
        return v_object.getField2();
    }

    public static SubLObject document_paragraphs(final SubLObject v_object) {
        assert NIL != document_p(v_object) : "! document.document_p(v_object) " + "document.document_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_document_paragraphs_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, DOCUMENT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_document_paragraphs(final SubLObject v_object, final SubLObject value) {
        assert NIL != document_p(v_object) : "! document.document_p(v_object) " + "document.document_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_document_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.document.$document_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PARAGRAPHS)) {
                        _csetf_document_paragraphs(v_new, current_value);
                    } else {
                        Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_document(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.document.$document_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PARAGRAPHS)) {
                _csetf_document_paragraphs(v_new, current_value);
            } else {
                Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_document(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_DOCUMENT, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PARAGRAPHS, document_paragraphs(obj));
        funcall(visitor_fn, obj, $END, MAKE_DOCUMENT, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_document_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_document(obj, visitor_fn);
    }

    /**
     *
     *
     * @param INPUT;
     * 		the object from which to read the document content
     * @return document; a new document containing the paragraphs in INPUT.
    This function trampolines to a more specific function depending on the
    type of INPUT and throws an error if INPUT is not of an appropriate type.
     */
    @LispMethod(comment = "@param INPUT;\r\n\t\tthe object from which to read the document content\r\n@return document; a new document containing the paragraphs in INPUT.\r\nThis function trampolines to a more specific function depending on the\r\ntype of INPUT and throws an error if INPUT is not of an appropriate type.")
    public static final SubLObject new_document(SubLObject input, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        if (input.isString()) {
            return new_document_from_string(input, wordifier);
        } else {
            return new_document_from_stream(input, wordifier);
        }
    }

    public static SubLObject new_document(final SubLObject input, SubLObject sentencifyP, SubLObject wordifier) {
        if (sentencifyP == UNPROVIDED) {
            sentencifyP = T;
        }
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        if (input.isString()) {
            return possibly_perform_document_dot_analysis(new_document_from_string(input, wordifier, sentencifyP));
        }
        if (input.isStream()) {
            return possibly_perform_document_dot_analysis(new_document_from_stream(input, wordifier, sentencifyP));
        }
        Errors.error($str197$_A_is_neither_a_string_nor_a_stre);
        return NIL;
    }

    /**
     *
     *
     * @param PARAGRAPH
    variable
     * 		
     * @param DOCUMENT
     * 		document
     * 		Execute BODY with PARAGRAPH successively bound to each paragraph in DOCUMENT
     */
    @LispMethod(comment = "@param PARAGRAPH\nvariable\r\n\t\t\r\n@param DOCUMENT\r\n\t\tdocument\r\n\t\tExecute BODY with PARAGRAPH successively bound to each paragraph in DOCUMENT")
    public static final SubLObject document_do_paragraphs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt170);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject paragraph = NIL;
                    SubLObject v_document = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt170);
                    paragraph = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt170);
                    v_document = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOVECTOR, list(paragraph, list(DOCUMENT_PARAGRAPHS, v_document)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt170);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param PARAGRAPH
    variable
     * 		
     * @param DOCUMENT
     * 		document
     * 		Execute BODY with PARAGRAPH successively bound to each paragraph in DOCUMENT
     */
    @LispMethod(comment = "@param PARAGRAPH\nvariable\r\n\t\t\r\n@param DOCUMENT\r\n\t\tdocument\r\n\t\tExecute BODY with PARAGRAPH successively bound to each paragraph in DOCUMENT")
    public static SubLObject document_do_paragraphs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list198);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject paragraph = NIL;
        SubLObject v_document = NIL;
        destructuring_bind_must_consp(current, datum, $list198);
        paragraph = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list198);
        v_document = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOVECTOR, list(paragraph, list(DOCUMENT_PARAGRAPHS, v_document)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list198);
        return NIL;
    }

    /**
     *
     *
     * @param SENTENCE
    variable
     * 		
     * @param DOCUMENT
     * 		document
     * 		Execute BODY with SENTENCE successively bound to each sentence in DOCUMENT
     */
    @LispMethod(comment = "@param SENTENCE\nvariable\r\n\t\t\r\n@param DOCUMENT\r\n\t\tdocument\r\n\t\tExecute BODY with SENTENCE successively bound to each sentence in DOCUMENT")
    public static final SubLObject document_do_sentences_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt171);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sentence = NIL;
                    SubLObject v_document = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt171);
                    sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt171);
                    v_document = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject paragraph = $sym172$PARAGRAPH;
                            return list(DOCUMENT_DO_PARAGRAPHS, list(paragraph, v_document), listS(PARAGRAPH_DO_SENTENCES, list(sentence, paragraph), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt171);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param SENTENCE
    variable
     * 		
     * @param DOCUMENT
     * 		document
     * 		Execute BODY with SENTENCE successively bound to each sentence in DOCUMENT
     */
    @LispMethod(comment = "@param SENTENCE\nvariable\r\n\t\t\r\n@param DOCUMENT\r\n\t\tdocument\r\n\t\tExecute BODY with SENTENCE successively bound to each sentence in DOCUMENT")
    public static SubLObject document_do_sentences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list199);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence = NIL;
        SubLObject v_document = NIL;
        destructuring_bind_must_consp(current, datum, $list199);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list199);
        v_document = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject paragraph = $sym200$PARAGRAPH;
            return list(DOCUMENT_DO_PARAGRAPHS, list(paragraph, v_document), listS(PARAGRAPH_DO_SENTENCES, list(sentence, paragraph), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list199);
        return NIL;
    }

    public static SubLObject possibly_perform_document_dot_analysis(final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $perform_dot_analysis_on_docs$.getDynamicValue(thread) ? document_perform_dot_analysis(doc) : doc;
    }

    public static SubLObject document_perform_dot_analysis(final SubLObject doc) {
        final SubLObject vector_var = document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$7;
        SubLObject backwardP_var_$8;
        SubLObject length_$9;
        SubLObject v_iteration_$10;
        SubLObject element_num_$11;
        SubLObject sent;
        SubLObject prev_word;
        SubLObject combinations;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject combo;
        SubLObject current;
        SubLObject datum;
        SubLObject first_word;
        SubLObject second_word;
        SubLObject sent_$12;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$7 = paragraph_sentences(paragraph);
            backwardP_var_$8 = NIL;
            length_$9 = length(vector_var_$7);
            v_iteration_$10 = NIL;
            v_iteration_$10 = ZERO_INTEGER;
            if (v_iteration_$10.numL(length_$9)) {
                element_num_$11 = (NIL != backwardP_var_$8) ? subtract(length_$9, v_iteration_$10, ONE_INTEGER) : v_iteration_$10;
                sent = aref(vector_var_$7, element_num_$11);
                prev_word = NIL;
                combinations = NIL;
                cdolist_list_var = sentence_yield_exhaustive(sent);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((((NIL != prev_word) && (NIL != word)) && ONE_INTEGER.eql(word_length(prev_word))) && $str202$_.equal(word_string(word))) {
                        combinations = cons(list(prev_word, word, sent), combinations);
                    }
                    prev_word = word;
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
                cdolist_list_var = combinations;
                combo = NIL;
                combo = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    datum = current = combo;
                    first_word = NIL;
                    second_word = NIL;
                    sent_$12 = NIL;
                    destructuring_bind_must_consp(current, datum, $list203);
                    first_word = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list203);
                    second_word = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list203);
                    sent_$12 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        set_word_string(first_word, cconcatenate(word_string(first_word), word_string(second_word)));
                        delete(second_word, sign_constituents(sent_$12), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list203);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    combo = cdolist_list_var.first();
                } 
                return doc;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; the string from which to read the document content
     * @return document; a new document containing the paragraphs in STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; the string from which to read the document content\r\n@return document; a new document containing the paragraphs in STRING")
    public static final SubLObject new_document_from_string(SubLObject string, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject doc = make_document(UNPROVIDED);
            _csetf_document_paragraphs(doc, string_paragraphize(string, wordifier));
            {
                SubLObject vector_var = document_paragraphs(doc);
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject par = aref(vector_var, element_num);
                        _csetf_paragraph_mother(par, doc);
                    }
                }
            }
            return doc;
        }
    }

    public static SubLObject new_document_from_string(final SubLObject string, SubLObject wordifier, SubLObject sentencifyP) {
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        if (sentencifyP == UNPROVIDED) {
            sentencifyP = T;
        }
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject doc = make_document(UNPROVIDED);
        _csetf_document_paragraphs(doc, string_paragraphize(string, wordifier, sentencifyP));
        final SubLObject vector_var = document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject par;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            par = aref(vector_var, element_num);
            _csetf_paragraph_mother(par, doc);
        }
        return doc;
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; the string from which to read the document content
     * @return document; a new document containing the paragraphs in STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; the string from which to read the document content\r\n@return document; a new document containing the paragraphs in STRING")
    public static final SubLObject new_document_from_file(SubLObject path, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        SubLTrampolineFile.checkType(path, STRINGP);
        {
            SubLObject doc = make_document(UNPROVIDED);
            if (NIL != Filesys.probe_file(path)) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(path, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt175$Unable_to_open__S, path);
                        }
                        {
                            SubLObject stream_2 = stream;
                            doc = new_document(stream_2, wordifier);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            return doc;
        }
    }

    public static SubLObject new_document_from_file(final SubLObject path, SubLObject sentencifyP, SubLObject wordifier) {
        if (sentencifyP == UNPROVIDED) {
            sentencifyP = T;
        }
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        assert NIL != stringp(path) : "! stringp(path) " + ("Types.stringp(path) " + "CommonSymbols.NIL != Types.stringp(path) ") + path;
        SubLObject doc = make_document(UNPROVIDED);
        if (NIL != Filesys.probe_file(path)) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(path, $INPUT);
                if (!stream.isStream()) {
                    Errors.error($str205$Unable_to_open__S, path);
                }
                final SubLObject stream_$13 = stream;
                doc = new_document(stream_$13, sentencifyP, wordifier);
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return doc;
    }

    /**
     *
     *
     * @param IN-STREAM
     * 		input-stream; the stream from which to read the document content
     * @return document; a new document containing the paragraphs in IN-STREAM
     */
    @LispMethod(comment = "@param IN-STREAM\r\n\t\tinput-stream; the stream from which to read the document content\r\n@return document; a new document containing the paragraphs in IN-STREAM")
    public static final SubLObject new_document_from_stream(SubLObject in_stream, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        SubLTrampolineFile.checkType(in_stream, INPUT_STREAM_P);
        {
            SubLObject doc = make_document(UNPROVIDED);
            _csetf_document_paragraphs(doc, string_paragraphize(stream_stringify(in_stream), wordifier));
            {
                SubLObject vector_var = document_paragraphs(doc);
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject par = aref(vector_var, element_num);
                        _csetf_paragraph_mother(par, doc);
                    }
                }
            }
            return doc;
        }
    }

    public static SubLObject new_document_from_stream(final SubLObject in_stream, SubLObject wordifier, SubLObject sentencifyP) {
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        if (sentencifyP == UNPROVIDED) {
            sentencifyP = T;
        }
        assert NIL != input_stream_p(in_stream) : "! streams_high.input_stream_p(in_stream) " + ("streams_high.input_stream_p(in_stream) " + "CommonSymbols.NIL != streams_high.input_stream_p(in_stream) ") + in_stream;
        final SubLObject doc = make_document(UNPROVIDED);
        _csetf_document_paragraphs(doc, string_paragraphize(stream_stringify(in_stream), wordifier, sentencifyP));
        final SubLObject vector_var = document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject par;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            par = aref(vector_var, element_num);
            _csetf_paragraph_mother(par, doc);
        }
        return doc;
    }

    /**
     * Pretty-print DOCUMENT to STREAM
     */
    @LispMethod(comment = "Pretty-print DOCUMENT to STREAM")
    public static final SubLObject document_print_alt(SubLObject v_document, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_document, DOCUMENT_P);
            write_string($str_alt177$__DOC_, stream, UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdotimes_end_var = min(document_paragraph_length(v_document), $text_class_print_length$.getDynamicValue(thread));
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    terpri(stream);
                    paragraph_print(document_get(v_document, i), stream, ZERO_INTEGER);
                }
            }
            if ($text_class_print_length$.getDynamicValue(thread).numL(document_paragraph_length(v_document))) {
                write_string($str_alt40$____, stream, UNPROVIDED, UNPROVIDED);
            }
            write_string($str_alt42$_, stream, UNPROVIDED, UNPROVIDED);
            return v_document;
        }
    }

    /**
     * Pretty-print DOCUMENT to STREAM
     */
    @LispMethod(comment = "Pretty-print DOCUMENT to STREAM")
    public static SubLObject document_print(final SubLObject v_document, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != document_p(v_document) : "! document.document_p(v_document) " + ("document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) ") + v_document;
        write_string($str207$__DOC_, stream, UNPROVIDED, UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = min(document_paragraph_length(v_document), $text_class_print_length$.getDynamicValue(thread)), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            terpri(stream);
            paragraph_print(document_get(v_document, i), stream, ZERO_INTEGER);
        }
        if ($text_class_print_length$.getDynamicValue(thread).numL(document_paragraph_length(v_document))) {
            write_string($str46$____, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
        return v_document;
    }

    /**
     *
     *
     * @param DOCUMENT
    document
     * 		
     * @param INDEX
    integer
     * 		
     * @return paragraph; the INDEXth paragraph of DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\ndocument\r\n\t\t\r\n@param INDEX\ninteger\r\n\t\t\r\n@return paragraph; the INDEXth paragraph of DOCUMENT")
    public static final SubLObject document_get_alt(SubLObject v_document, SubLObject index) {
        SubLTrampolineFile.checkType(v_document, DOCUMENT_P);
        SubLTrampolineFile.checkType(index, INTEGERP);
        return aref(document_paragraphs(v_document), index);
    }

    /**
     *
     *
     * @param DOCUMENT
    document
     * 		
     * @param INDEX
    integer
     * 		
     * @return paragraph; the INDEXth paragraph of DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\ndocument\r\n\t\t\r\n@param INDEX\ninteger\r\n\t\t\r\n@return paragraph; the INDEXth paragraph of DOCUMENT")
    public static SubLObject document_get(final SubLObject v_document, final SubLObject index) {
        assert NIL != document_p(v_document) : "! document.document_p(v_document) " + ("document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) ") + v_document;
        assert NIL != integerp(index) : "! integerp(index) " + ("Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) ") + index;
        return aref(document_paragraphs(v_document), index);
    }

    /**
     * Destructively set DOCUMENT's INDEXth paragraph to PARAGRAPH
     *
     * @param DOCUMENT
    document
     * 		
     * @param INDEX
    integer
     * 		
     * @param PARAGRAPH
    paragraph
     * 		
     * @return paragraph; the previous INDEXth paragraph of DOCUMENT
     */
    @LispMethod(comment = "Destructively set DOCUMENT\'s INDEXth paragraph to PARAGRAPH\r\n\r\n@param DOCUMENT\ndocument\r\n\t\t\r\n@param INDEX\ninteger\r\n\t\t\r\n@param PARAGRAPH\nparagraph\r\n\t\t\r\n@return paragraph; the previous INDEXth paragraph of DOCUMENT")
    public static final SubLObject document_set_alt(SubLObject v_document, SubLObject index, SubLObject paragraph) {
        SubLTrampolineFile.checkType(v_document, DOCUMENT_P);
        SubLTrampolineFile.checkType(index, INTEGERP);
        SubLTrampolineFile.checkType(paragraph, PARAGRAPH_P);
        {
            SubLObject old_paragraph = aref(document_paragraphs(v_document), index);
            set_aref(document_paragraphs(v_document), index, paragraph);
            _csetf_paragraph_mother(paragraph, v_document);
            return old_paragraph;
        }
    }

    /**
     * Destructively set DOCUMENT's INDEXth paragraph to PARAGRAPH
     *
     * @param DOCUMENT
    		document
     * 		
     * @param INDEX
    		integer
     * 		
     * @param PARAGRAPH
    		paragraph
     * 		
     * @return paragraph; the previous INDEXth paragraph of DOCUMENT
     */
    @LispMethod(comment = "Destructively set DOCUMENT\'s INDEXth paragraph to PARAGRAPH\r\n\r\n@param DOCUMENT\n\t\tdocument\r\n\t\t\r\n@param INDEX\n\t\tinteger\r\n\t\t\r\n@param PARAGRAPH\n\t\tparagraph\r\n\t\t\r\n@return paragraph; the previous INDEXth paragraph of DOCUMENT")
    public static SubLObject document_set(final SubLObject v_document, final SubLObject index, final SubLObject paragraph) {
        assert NIL != document_p(v_document) : "! document.document_p(v_document) " + ("document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) ") + v_document;
        assert NIL != integerp(index) : "! integerp(index) " + ("Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) ") + index;
        assert NIL != paragraph_p(paragraph) : "! document.paragraph_p(paragraph) " + ("document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) ") + paragraph;
        final SubLObject old_paragraph = aref(document_paragraphs(v_document), index);
        set_aref(document_paragraphs(v_document), index, paragraph);
        _csetf_paragraph_mother(paragraph, v_document);
        return old_paragraph;
    }

    /**
     *
     *
     * @param DOCUMENT
    document
     * 		
     * @param INDEX
    integer
     * 		
     * @return sentence; the INDEXth sentence of DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\ndocument\r\n\t\t\r\n@param INDEX\ninteger\r\n\t\t\r\n@return sentence; the INDEXth sentence of DOCUMENT")
    public static final SubLObject document_get_sentence_alt(SubLObject v_document, SubLObject index) {
        SubLTrampolineFile.checkType(v_document, DOCUMENT_P);
        SubLTrampolineFile.checkType(index, INTEGERP);
        {
            SubLObject current = ZERO_INTEGER;
            SubLObject vector_var = document_paragraphs(v_document);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject paragraph = aref(vector_var, element_num);
                    SubLObject vector_var_3 = paragraph_sentences(paragraph);
                    SubLObject backwardP_var_4 = NIL;
                    SubLObject length_5 = length(vector_var_3);
                    SubLObject v_iteration_6 = NIL;
                    for (v_iteration_6 = ZERO_INTEGER; v_iteration_6.numL(length_5); v_iteration_6 = add(v_iteration_6, ONE_INTEGER)) {
                        {
                            SubLObject element_num_7 = (NIL != backwardP_var_4) ? ((SubLObject) (subtract(length_5, v_iteration_6, ONE_INTEGER))) : v_iteration_6;
                            SubLObject sentence = aref(vector_var_3, element_num_7);
                            if (current.numE(index)) {
                                return sentence;
                            }
                            current = add(current, ONE_INTEGER);
                        }
                    }
                }
            }
        }
        return Errors.error(format(NIL, $str_alt178$Sentence_index__A_out_of_bounds_, index));
    }

    /**
     *
     *
     * @param DOCUMENT
    document
     * 		
     * @param INDEX
    integer
     * 		
     * @return sentence; the INDEXth sentence of DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\ndocument\r\n\t\t\r\n@param INDEX\ninteger\r\n\t\t\r\n@return sentence; the INDEXth sentence of DOCUMENT")
    public static SubLObject document_get_sentence(final SubLObject v_document, final SubLObject index) {
        assert NIL != document_p(v_document) : "! document.document_p(v_document) " + ("document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) ") + v_document;
        assert NIL != integerp(index) : "! integerp(index) " + ("Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) ") + index;
        SubLObject current = ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$14;
        SubLObject backwardP_var_$15;
        SubLObject length_$16;
        SubLObject v_iteration_$17;
        SubLObject element_num_$18;
        SubLObject sentence;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$14 = paragraph_sentences(paragraph);
            backwardP_var_$15 = NIL;
            for (length_$16 = length(vector_var_$14), v_iteration_$17 = NIL, v_iteration_$17 = ZERO_INTEGER; v_iteration_$17.numL(length_$16); v_iteration_$17 = add(v_iteration_$17, ONE_INTEGER)) {
                element_num_$18 = (NIL != backwardP_var_$15) ? subtract(length_$16, v_iteration_$17, ONE_INTEGER) : v_iteration_$17;
                sentence = aref(vector_var_$14, element_num_$18);
                if (current.numE(index)) {
                    return sentence;
                }
                current = add(current, ONE_INTEGER);
            }
        }
        return Errors.error(format(NIL, $str208$Sentence_index__A_out_of_bounds_, index));
    }

    /**
     *
     *
     * @param DOCUMENT
    document
     * 		
     * @param INDEX
    integer
     * 		
     * @return word-p; the INDEXth word of DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\ndocument\r\n\t\t\r\n@param INDEX\ninteger\r\n\t\t\r\n@return word-p; the INDEXth word of DOCUMENT")
    public static final SubLObject document_get_word_alt(SubLObject v_document, SubLObject index) {
        SubLTrampolineFile.checkType(v_document, DOCUMENT_P);
        SubLTrampolineFile.checkType(index, INTEGERP);
        {
            SubLObject current_word_index = ZERO_INTEGER;
            SubLObject vector_var = document_paragraphs(v_document);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject paragraph = aref(vector_var, element_num);
                    SubLObject vector_var_8 = paragraph_sentences(paragraph);
                    SubLObject backwardP_var_9 = NIL;
                    SubLObject length_10 = length(vector_var_8);
                    SubLObject v_iteration_11 = NIL;
                    for (v_iteration_11 = ZERO_INTEGER; v_iteration_11.numL(length_10); v_iteration_11 = add(v_iteration_11, ONE_INTEGER)) {
                        {
                            SubLObject element_num_12 = (NIL != backwardP_var_9) ? ((SubLObject) (subtract(length_10, v_iteration_11, ONE_INTEGER))) : v_iteration_11;
                            SubLObject sentence = aref(vector_var_8, element_num_12);
                            if (add(current_word_index, sentence_length(sentence)).numG(index)) {
                                return sentence_get(sentence, subtract(index, current_word_index));
                            }
                            current_word_index = add(current_word_index, sentence_length(sentence));
                        }
                    }
                }
            }
        }
        return Errors.error(format(NIL, $str_alt178$Sentence_index__A_out_of_bounds_, index));
    }

    /**
     *
     *
     * @param DOCUMENT
    document
     * 		
     * @param INDEX
    integer
     * 		
     * @return word-p; the INDEXth word of DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\ndocument\r\n\t\t\r\n@param INDEX\ninteger\r\n\t\t\r\n@return word-p; the INDEXth word of DOCUMENT")
    public static SubLObject document_get_word(final SubLObject v_document, final SubLObject index) {
        assert NIL != document_p(v_document) : "! document.document_p(v_document) " + ("document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) ") + v_document;
        assert NIL != integerp(index) : "! integerp(index) " + ("Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) ") + index;
        SubLObject current_word_index = ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$19;
        SubLObject backwardP_var_$20;
        SubLObject length_$21;
        SubLObject v_iteration_$22;
        SubLObject element_num_$23;
        SubLObject sentence;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$19 = paragraph_sentences(paragraph);
            backwardP_var_$20 = NIL;
            for (length_$21 = length(vector_var_$19), v_iteration_$22 = NIL, v_iteration_$22 = ZERO_INTEGER; v_iteration_$22.numL(length_$21); v_iteration_$22 = add(v_iteration_$22, ONE_INTEGER)) {
                element_num_$23 = (NIL != backwardP_var_$20) ? subtract(length_$21, v_iteration_$22, ONE_INTEGER) : v_iteration_$22;
                sentence = aref(vector_var_$19, element_num_$23);
                if (add(current_word_index, sentence_length(sentence)).numG(index)) {
                    return sentence_get(sentence, subtract(index, current_word_index));
                }
                current_word_index = add(current_word_index, sentence_length(sentence));
            }
        }
        return Errors.error(format(NIL, $str208$Sentence_index__A_out_of_bounds_, index));
    }

    /**
     *
     *
     * @param DOCUMENT
    document-p
     * 		
     * @return stringp; the XML string of this document
     */
    @LispMethod(comment = "@param DOCUMENT\ndocument-p\r\n\t\t\r\n@return stringp; the XML string of this document")
    public static final SubLObject document_to_xml_alt(SubLObject v_document) {
        SubLTrampolineFile.checkType(v_document, DOCUMENT_P);
        {
            SubLObject xml = NIL;
            xml = cconcatenate($str_alt179$_DOC_, $newline$.getGlobalValue());
            {
                SubLObject vector_var = document_paragraphs(v_document);
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject paragraph = aref(vector_var, element_num);
                        xml = cconcatenate(xml, paragraph_to_xml(paragraph, ONE_INTEGER));
                    }
                }
            }
            xml = cconcatenate(xml, new SubLObject[]{ $str_alt180$__DOC_, $newline$.getGlobalValue() });
            return xml;
        }
    }

    /**
     *
     *
     * @param DOCUMENT
    document-p
     * 		
     * @return stringp; the XML string of this document
     */
    @LispMethod(comment = "@param DOCUMENT\ndocument-p\r\n\t\t\r\n@return stringp; the XML string of this document")
    public static SubLObject document_to_xml(final SubLObject v_document) {
        assert NIL != document_p(v_document) : "! document.document_p(v_document) " + ("document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) ") + v_document;
        SubLObject xml = NIL;
        xml = cconcatenate($str209$_DOC_, $newline$.getGlobalValue());
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            xml = cconcatenate(xml, paragraph_to_xml(paragraph, ONE_INTEGER));
        }
        xml = cconcatenate(xml, new SubLObject[]{ $str210$__DOC_, $newline$.getGlobalValue() });
        return xml;
    }

    /**
     *
     *
     * @param DOCUMENT
     * 		document; the document whose number of paragraphs is to be computed
     * @return integer; the number of paragraphs in DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\r\n\t\tdocument; the document whose number of paragraphs is to be computed\r\n@return integer; the number of paragraphs in DOCUMENT")
    public static final SubLObject document_paragraph_length_alt(SubLObject v_document) {
        SubLTrampolineFile.checkType(v_document, DOCUMENT_P);
        return length(document_paragraphs(v_document));
    }

    /**
     *
     *
     * @param DOCUMENT
     * 		document; the document whose number of paragraphs is to be computed
     * @return integer; the number of paragraphs in DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\r\n\t\tdocument; the document whose number of paragraphs is to be computed\r\n@return integer; the number of paragraphs in DOCUMENT")
    public static SubLObject document_paragraph_length(final SubLObject v_document) {
        assert NIL != document_p(v_document) : "! document.document_p(v_document) " + ("document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) ") + v_document;
        return length(document_paragraphs(v_document));
    }

    /**
     *
     *
     * @param DOCUMENT
     * 		document; the document whose number of sentences is to be computed
     * @return integer; the number of sentences in DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\r\n\t\tdocument; the document whose number of sentences is to be computed\r\n@return integer; the number of sentences in DOCUMENT")
    public static final SubLObject document_sentence_length_alt(SubLObject v_document) {
        SubLTrampolineFile.checkType(v_document, DOCUMENT_P);
        {
            SubLObject length = ZERO_INTEGER;
            SubLObject vector_var = document_paragraphs(v_document);
            SubLObject backwardP_var = NIL;
            SubLObject length_13 = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length_13); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length_13, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject paragraph = aref(vector_var, element_num);
                    length = add(length, paragraph_sentence_length(paragraph));
                }
            }
            return length;
        }
    }

    /**
     *
     *
     * @param DOCUMENT
     * 		document; the document whose number of sentences is to be computed
     * @return integer; the number of sentences in DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\r\n\t\tdocument; the document whose number of sentences is to be computed\r\n@return integer; the number of sentences in DOCUMENT")
    public static SubLObject document_sentence_length(final SubLObject v_document) {
        assert NIL != document_p(v_document) : "! document.document_p(v_document) " + ("document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) ") + v_document;
        SubLObject length = ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length_$24;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        for (length_$24 = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length_$24); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length_$24, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            length = add(length, paragraph_sentence_length(paragraph));
        }
        return length;
    }

    /**
     *
     *
     * @param DOCUMENT
     * 		document; the document whose number of words is to be computed
     * @return integer; the number of words in DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\r\n\t\tdocument; the document whose number of words is to be computed\r\n@return integer; the number of words in DOCUMENT")
    public static final SubLObject document_word_length_alt(SubLObject v_document) {
        SubLTrampolineFile.checkType(v_document, DOCUMENT_P);
        {
            SubLObject length = ZERO_INTEGER;
            SubLObject vector_var = document_paragraphs(v_document);
            SubLObject backwardP_var = NIL;
            SubLObject length_14 = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length_14); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length_14, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject paragraph = aref(vector_var, element_num);
                    SubLObject vector_var_15 = paragraph_sentences(paragraph);
                    SubLObject backwardP_var_16 = NIL;
                    SubLObject length_17 = length(vector_var_15);
                    SubLObject v_iteration_18 = NIL;
                    for (v_iteration_18 = ZERO_INTEGER; v_iteration_18.numL(length_17); v_iteration_18 = add(v_iteration_18, ONE_INTEGER)) {
                        {
                            SubLObject element_num_19 = (NIL != backwardP_var_16) ? ((SubLObject) (subtract(length_17, v_iteration_18, ONE_INTEGER))) : v_iteration_18;
                            SubLObject sentence = aref(vector_var_15, element_num_19);
                            length = add(length, sentence_length(sentence));
                        }
                    }
                }
            }
            return length;
        }
    }

    /**
     *
     *
     * @param DOCUMENT
     * 		document; the document whose number of words is to be computed
     * @return integer; the number of words in DOCUMENT
     */
    @LispMethod(comment = "@param DOCUMENT\r\n\t\tdocument; the document whose number of words is to be computed\r\n@return integer; the number of words in DOCUMENT")
    public static SubLObject document_word_length(final SubLObject v_document) {
        assert NIL != document_p(v_document) : "! document.document_p(v_document) " + ("document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) ") + v_document;
        SubLObject length = ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length_$25;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$26;
        SubLObject backwardP_var_$27;
        SubLObject length_$26;
        SubLObject v_iteration_$29;
        SubLObject element_num_$30;
        SubLObject sentence;
        for (length_$25 = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length_$25); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length_$25, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$26 = paragraph_sentences(paragraph);
            backwardP_var_$27 = NIL;
            for (length_$26 = length(vector_var_$26), v_iteration_$29 = NIL, v_iteration_$29 = ZERO_INTEGER; v_iteration_$29.numL(length_$26); v_iteration_$29 = add(v_iteration_$29, ONE_INTEGER)) {
                element_num_$30 = (NIL != backwardP_var_$27) ? subtract(length_$26, v_iteration_$29, ONE_INTEGER) : v_iteration_$29;
                sentence = aref(vector_var_$26, element_num_$30);
                length = add(length, sentence_length(sentence));
            }
        }
        return length;
    }

    public static SubLObject document_do_minimal_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list211);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject v_document = NIL;
        destructuring_bind_must_consp(current, datum, $list211);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list211);
        v_document = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject sentence = $sym212$SENTENCE;
            return list(DOCUMENT_DO_SENTENCES, list(sentence, v_document), listS(SENTENCE_DO_MINIMAL_WORDS, list(word, sentence), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list211);
        return NIL;
    }

    /**
     *
     *
     * @param WORD
    variable
     * 		
     * @param DOCUMENT
     * 		document
     * 		Execute BODY with WORD successively bound to each word in DOCUMENT
     */
    @LispMethod(comment = "@param WORD\nvariable\r\n\t\t\r\n@param DOCUMENT\r\n\t\tdocument\r\n\t\tExecute BODY with WORD successively bound to each word in DOCUMENT")
    public static final SubLObject document_do_words_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt181);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject word = NIL;
                    SubLObject v_document = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt181);
                    word = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt181);
                    v_document = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject sentence = $sym182$SENTENCE;
                            return list(DOCUMENT_DO_SENTENCES, list(sentence, v_document), listS(SENTENCE_DO_WORDS, list(word, sentence), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt181);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param WORD
    variable
     * 		
     * @param DOCUMENT
     * 		document
     * 		Execute BODY with WORD successively bound to each word in DOCUMENT
     */
    @LispMethod(comment = "@param WORD\nvariable\r\n\t\t\r\n@param DOCUMENT\r\n\t\tdocument\r\n\t\tExecute BODY with WORD successively bound to each word in DOCUMENT")
    public static SubLObject document_do_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list211);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject v_document = NIL;
        destructuring_bind_must_consp(current, datum, $list211);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list211);
        v_document = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject sentence = $sym214$SENTENCE;
            return list(DOCUMENT_DO_SENTENCES, list(sentence, v_document), listS(SENTENCE_DO_WORDS, list(word, sentence), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list211);
        return NIL;
    }

    /**
     *
     *
     * @param DOCUMENT
    document-p
     * 		
     * @return string-p; the document as a string.  This will be as close as possible to the input string,
    but may not be identical
     * @unknown This will always put in spaces, when there might other types of whitespace in the original string used
    to build the document...
     */
    @LispMethod(comment = "@param DOCUMENT\ndocument-p\r\n\t\t\r\n@return string-p; the document as a string.  This will be as close as possible to the input string,\r\nbut may not be identical\r\n@unknown This will always put in spaces, when there might other types of whitespace in the original string used\r\nto build the document...")
    public static final SubLObject document_string_alt(SubLObject v_document) {
        {
            SubLObject output_string = NIL;
            SubLObject current_end = ZERO_INTEGER;
            SubLObject s = NIL;
            try {
                s = make_private_string_output_stream();
                {
                    SubLObject vector_var = document_paragraphs(v_document);
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject paragraph = aref(vector_var, element_num);
                            SubLObject vector_var_20 = paragraph_sentences(paragraph);
                            SubLObject backwardP_var_21 = NIL;
                            SubLObject length_22 = length(vector_var_20);
                            SubLObject v_iteration_23 = NIL;
                            for (v_iteration_23 = ZERO_INTEGER; v_iteration_23.numL(length_22); v_iteration_23 = add(v_iteration_23, ONE_INTEGER)) {
                                {
                                    SubLObject element_num_24 = (NIL != backwardP_var_21) ? ((SubLObject) (subtract(length_22, v_iteration_23, ONE_INTEGER))) : v_iteration_23;
                                    SubLObject sent = aref(vector_var_20, element_num_24);
                                    if (current_end.numL(sentence_offset(sent))) {
                                        {
                                            SubLObject diff = subtract(sentence_offset(sent), current_end);
                                            string_utilities.indent(s, diff);
                                            current_end = add(current_end, diff);
                                        }
                                    }
                                    princ(sentence_string(sent), s);
                                    current_end = add(current_end, length(sentence_string(sent)));
                                }
                            }
                        }
                    }
                }
                output_string = get_output_stream_string(s);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(s, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return output_string;
        }
    }

    /**
     *
     *
     * @param DOCUMENT
    document-p
     * 		
     * @return string-p; the document as a string.  This will be as close as possible to the input string,
    but may not be identical
     * @unknown This will always put in spaces, when there might other types of whitespace in the original string used
    to build the document...
     */
    @LispMethod(comment = "@param DOCUMENT\ndocument-p\r\n\t\t\r\n@return string-p; the document as a string.  This will be as close as possible to the input string,\r\nbut may not be identical\r\n@unknown This will always put in spaces, when there might other types of whitespace in the original string used\r\nto build the document...")
    public static SubLObject document_string(final SubLObject v_document) {
        SubLObject output_string = NIL;
        SubLObject current_end = ZERO_INTEGER;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject vector_var = document_paragraphs(v_document);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject paragraph;
            SubLObject vector_var_$31;
            SubLObject backwardP_var_$32;
            SubLObject length_$33;
            SubLObject v_iteration_$34;
            SubLObject element_num_$35;
            SubLObject sent;
            SubLObject diff;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                paragraph = aref(vector_var, element_num);
                vector_var_$31 = paragraph_sentences(paragraph);
                backwardP_var_$32 = NIL;
                for (length_$33 = length(vector_var_$31), v_iteration_$34 = NIL, v_iteration_$34 = ZERO_INTEGER; v_iteration_$34.numL(length_$33); v_iteration_$34 = add(v_iteration_$34, ONE_INTEGER)) {
                    element_num_$35 = (NIL != backwardP_var_$32) ? subtract(length_$33, v_iteration_$34, ONE_INTEGER) : v_iteration_$34;
                    sent = aref(vector_var_$31, element_num_$35);
                    if (current_end.numL(sentence_offset(sent))) {
                        diff = subtract(sentence_offset(sent), current_end);
                        string_utilities.indent(s, diff);
                        current_end = add(current_end, diff);
                    }
                    princ(sentence_string(sent), s);
                    current_end = add(current_end, length(sentence_string(sent)));
                }
            }
            output_string = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return output_string;
    }

    public static final SubLObject new_sentence_iterator_alt(SubLObject v_object) {
        return NIL != document_p(v_object) ? ((SubLObject) (new_document_sentence_iterator(v_object))) : NIL != paragraph_p(v_object) ? ((SubLObject) (new_paragraph_sentence_iterator(v_object))) : NIL != sentence_p(v_object) ? ((SubLObject) (new_sentence_sentence_iterator(v_object))) : NIL != word_p(v_object) ? ((SubLObject) (iteration.new_null_iterator())) : Errors.error($str_alt184$can_t_create_sentence_iterator_fo, v_object);
    }

    public static SubLObject new_sentence_iterator(final SubLObject v_object) {
        return NIL != document_p(v_object) ? new_document_sentence_iterator(v_object) : NIL != paragraph_p(v_object) ? new_paragraph_sentence_iterator(v_object) : NIL != sentence_p(v_object) ? new_sentence_sentence_iterator(v_object) : NIL != word_p(v_object) ? iteration.new_null_iterator() : Errors.error($str215$can_t_create_sentence_iterator_fo, v_object);
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(cons(makeString("<"), makeString("&lt;")), cons(makeString("&"), makeString("&amp;")), cons(makeString(">"), makeString("&gt;")), cons(makeString("\""), makeString("&quot;")), cons(makeString("'"), makeString("&apos;")));

    public static final SubLObject new_document_sentence_iterator_alt(SubLObject doc) {
        {
            SubLObject sentences = NIL;
            SubLObject vector_var = document_paragraphs(doc);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject paragraph = aref(vector_var, element_num);
                    SubLObject vector_var_25 = paragraph_sentences(paragraph);
                    SubLObject backwardP_var_26 = NIL;
                    SubLObject length_27 = length(vector_var_25);
                    SubLObject v_iteration_28 = NIL;
                    for (v_iteration_28 = ZERO_INTEGER; v_iteration_28.numL(length_27); v_iteration_28 = add(v_iteration_28, ONE_INTEGER)) {
                        {
                            SubLObject element_num_29 = (NIL != backwardP_var_26) ? ((SubLObject) (subtract(length_27, v_iteration_28, ONE_INTEGER))) : v_iteration_28;
                            SubLObject s = aref(vector_var_25, element_num_29);
                            sentences = cons(s, sentences);
                        }
                    }
                }
            }
            return iteration.new_list_iterator(nreverse(sentences));
        }
    }

    public static SubLObject new_document_sentence_iterator(final SubLObject doc) {
        SubLObject sentences = NIL;
        final SubLObject vector_var = document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$36;
        SubLObject backwardP_var_$37;
        SubLObject length_$38;
        SubLObject v_iteration_$39;
        SubLObject element_num_$40;
        SubLObject s;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$36 = paragraph_sentences(paragraph);
            backwardP_var_$37 = NIL;
            for (length_$38 = length(vector_var_$36), v_iteration_$39 = NIL, v_iteration_$39 = ZERO_INTEGER; v_iteration_$39.numL(length_$38); v_iteration_$39 = add(v_iteration_$39, ONE_INTEGER)) {
                element_num_$40 = (NIL != backwardP_var_$37) ? subtract(length_$38, v_iteration_$39, ONE_INTEGER) : v_iteration_$39;
                s = aref(vector_var_$36, element_num_$40);
                sentences = cons(s, sentences);
            }
        }
        return iteration.new_list_iterator(nreverse(sentences));
    }

    static private final SubLList $list_alt3 = list(makeSymbol("STRING"), makeSymbol("TYPE"), makeSymbol("INFO"), makeSymbol("CATEGORY"), makeSymbol("CONSTITUENTS"), makeSymbol("OFFSET"), makeSymbol("MOTHER"));

    static private final SubLList $list_alt4 = list(makeKeyword("STRING"), $TYPE, $INFO, makeKeyword("CATEGORY"), makeKeyword("CONSTITUENTS"), makeKeyword("OFFSET"), makeKeyword("MOTHER"));

    static private final SubLList $list_alt5 = list(makeSymbol("SIGN-STRING"), makeSymbol("SIGN-TYPE"), makeSymbol("SIGN-INFO"), makeSymbol("SIGN-CATEGORY"), makeSymbol("SIGN-CONSTITUENTS"), makeSymbol("SIGN-OFFSET"), makeSymbol("SIGN-MOTHER"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-SIGN-STRING"), makeSymbol("_CSETF-SIGN-TYPE"), makeSymbol("_CSETF-SIGN-INFO"), makeSymbol("_CSETF-SIGN-CATEGORY"), makeSymbol("_CSETF-SIGN-CONSTITUENTS"), makeSymbol("_CSETF-SIGN-OFFSET"), makeSymbol("_CSETF-SIGN-MOTHER"));

    public static final SubLObject new_paragraph_sentence_iterator_alt(SubLObject par) {
        return iteration.new_vector_iterator(paragraph_sentences(par));
    }

    public static SubLObject new_paragraph_sentence_iterator(final SubLObject par) {
        return iteration.new_vector_iterator(paragraph_sentences(par));
    }

    public static final SubLObject new_sentence_sentence_iterator_alt(SubLObject sen) {
        return iteration.new_singleton_iterator(sen);
    }

    public static SubLObject new_sentence_sentence_iterator(final SubLObject sen) {
        return iteration.new_singleton_iterator(sen);
    }

    public static final SubLObject stream_stringify_alt(SubLObject in_stream) {
        SubLTrampolineFile.checkType(in_stream, INPUT_STREAM_P);
        {
            SubLObject length = file_length(in_stream);
            SubLObject string = Strings.make_string(length, UNPROVIDED);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject v_char = read_char(in_stream, NIL, $EOF, UNPROVIDED);
                    if (v_char == $EOF) {
                        return string_utilities.substring(string, ZERO_INTEGER, i);
                    } else {
                        Strings.set_char(string, i, v_char);
                    }
                }
            }
            return string;
        }
    }

    public static SubLObject stream_stringify(final SubLObject in_stream) {
        assert NIL != input_stream_p(in_stream) : "! streams_high.input_stream_p(in_stream) " + ("streams_high.input_stream_p(in_stream) " + "CommonSymbols.NIL != streams_high.input_stream_p(in_stream) ") + in_stream;
        final SubLObject length = file_length(in_stream);
        final SubLObject string = Strings.make_string(length, UNPROVIDED);
        SubLObject i;
        SubLObject v_char;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            v_char = read_char(in_stream, NIL, $EOF, UNPROVIDED);
            if (v_char == $EOF) {
                return string_utilities.substring(string, ZERO_INTEGER, i);
            }
            Strings.set_char(string, i, v_char);
        }
        return string;
    }

    public static SubLObject alphanumeric_char_or_character_code_p(final SubLObject obj) {
        return makeBoolean((NIL != string_utilities.alphanumeric_char_p(obj)) || (NIL != latin_alphabetic_character_code_p(obj)));
    }

    static private final SubLString $str_alt30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    public static SubLObject alphabetic_char_or_character_code_p(final SubLObject obj) {
        return makeBoolean((NIL != string_utilities.alphabetic_char_p(obj)) || (NIL != latin_alphabetic_character_code_p(obj)));
    }

    static private final SubLString $str_alt34$__ = makeString("#<");

    public static SubLObject latin_alphabetic_character_code_p(final SubLObject obj) {
        return makeBoolean(((obj.isInteger() && (NIL == subl_promotions.memberP(obj, $list217, UNPROVIDED, UNPROVIDED))) && obj.numGE($int$192)) && obj.numLE($int$591));
    }

    static private final SubLString $str_alt35$_ = makeString("(");

    static private final SubLString $str_alt36$_ = makeString(")");

    static private final SubLString $str_alt37$__ = makeString(": ");

    static private final SubLString $str_alt38$_ = makeString("\"");

    public static SubLObject character_or_character_code_p(final SubLObject obj) {
        return makeBoolean(obj.isChar() || obj.isInteger());
    }

    static private final SubLString $str_alt39$_ = makeString(" ");

    static private final SubLString $str_alt40$____ = makeString(" ...");

    public static final SubLObject sentencifier_initializedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sentencifier_patterns$.getDynamicValue(thread);
        }
    }

    public static SubLObject sentencifier_initializedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sentencifier_patterns$.getDynamicValue(thread);
    }

    static private final SubLString $str_alt41$_ = makeString("/");

    static private final SubLString $str_alt42$_ = makeString(">");

    static private final SubLString $str_alt46$Attempt_to_set_the_non_existing_s = makeString("Attempt to set the non-existing slot ~a");

    /**
     * Get everything ready that the sentencifier needs
     */
    @LispMethod(comment = "Get everything ready that the sentencifier needs")
    public static final SubLObject initialize_sentencifier_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            finalize_sentencifier();
            $sentencifier_patterns$.setDynamicValue(append(new SubLObject[]{ compile_regular_expression_substitutions($mark_eos_regular_expressions$.getDynamicValue(thread)), compile_regular_expression_substitutions($remove_false_eos_regular_expressions1$.getDynamicValue(thread)), compile_regular_expression_substitutions(generate_abbreviation_regular_expressions()), compile_regular_expression_substitutions($remove_false_eos_regular_expressions2$.getDynamicValue(thread)), compile_regular_expression_substitutions($split_unsplit_stuff_regular_expressions$.getDynamicValue(thread)) }), thread);
            return length($sentencifier_patterns$.getDynamicValue(thread));
        }
    }

    /**
     * Get everything ready that the sentencifier needs
     */
    @LispMethod(comment = "Get everything ready that the sentencifier needs")
    public static SubLObject initialize_sentencifier() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        finalize_sentencifier();
        $sentencifier_patterns$.setDynamicValue(append(new SubLObject[]{ compile_regular_expression_substitutions($mark_eos_regular_expressions$.getDynamicValue(thread)), compile_regular_expression_substitutions($remove_false_eos_regular_expressions1$.getDynamicValue(thread)), compile_regular_expression_substitutions(generate_abbreviation_regular_expressions()), compile_regular_expression_substitutions($remove_false_eos_regular_expressions2$.getDynamicValue(thread)), compile_regular_expression_substitutions($split_unsplit_stuff_regular_expressions$.getDynamicValue(thread)) }), thread);
        return length($sentencifier_patterns$.getDynamicValue(thread));
    }

    static private final SubLList $list_alt47 = list(list(makeSymbol("CONSTITUENT"), makeSymbol("SIGN")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt52$Unknown_sign_subclass__a = makeString("Unknown sign subclass ~a");

    /**
     * Clean up all of the sentencifier's resources
     */
    @LispMethod(comment = "Clean up all of the sentencifier\'s resources")
    public static final SubLObject finalize_sentencifier_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = length($sentencifier_patterns$.getDynamicValue(thread));
                SubLObject cdolist_list_var = $sentencifier_patterns$.getDynamicValue(thread);
                SubLObject patternXsubstitution = NIL;
                for (patternXsubstitution = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , patternXsubstitution = cdolist_list_var.first()) {
                    {
                        SubLObject datum = patternXsubstitution;
                        SubLObject current = datum;
                        SubLObject pattern = NIL;
                        SubLObject substitution = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt495);
                        pattern = current.first();
                        current = current.rest();
                        substitution = current;
                        if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                            regular_expressions.discard_regular_expression_pattern(pattern);
                        } else {
                            Errors.warn($str_alt496$Can_t_finalize__a__not_a_regular_, pattern);
                        }
                    }
                }
                $sentencifier_patterns$.setDynamicValue(NIL, thread);
                return count;
            }
        }
    }

    /**
     * Clean up all of the sentencifier's resources
     */
    @LispMethod(comment = "Clean up all of the sentencifier\'s resources")
    public static SubLObject finalize_sentencifier() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = length($sentencifier_patterns$.getDynamicValue(thread));
        SubLObject cdolist_list_var = $sentencifier_patterns$.getDynamicValue(thread);
        SubLObject patternXsubstitution = NIL;
        patternXsubstitution = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = patternXsubstitution;
            SubLObject pattern = NIL;
            SubLObject substitution = NIL;
            destructuring_bind_must_consp(current, datum, $list529);
            pattern = current.first();
            current = substitution = current.rest();
            if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                regular_expressions.discard_regular_expression_pattern(pattern);
            } else {
                Errors.warn($str530$Can_t_finalize__a__not_a_regular_, pattern);
            }
            cdolist_list_var = cdolist_list_var.rest();
            patternXsubstitution = cdolist_list_var.first();
        } 
        $sentencifier_patterns$.setDynamicValue(NIL, thread);
        return count;
    }

    public static final SubLSymbol $kw62$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt65 = list(makeSymbol("STATE"), makeSymbol("TAG-PIECES"), makeSymbol("STRING-PIECES"), makeSymbol("PUNCTUATION-PIECES"), makeSymbol("LEADING-TAGS"), makeSymbol("FOLLOWING-TAGS"), makeSymbol("CURRENT-OFFSET"));

    static private final SubLList $list_alt66 = list(makeKeyword("STATE"), makeKeyword("TAG-PIECES"), makeKeyword("STRING-PIECES"), makeKeyword("PUNCTUATION-PIECES"), makeKeyword("LEADING-TAGS"), makeKeyword("FOLLOWING-TAGS"), makeKeyword("CURRENT-OFFSET"));

    static private final SubLList $list_alt67 = list(makeSymbol("HSW-STATE-STATE"), makeSymbol("HSW-STATE-TAG-PIECES"), makeSymbol("HSW-STATE-STRING-PIECES"), makeSymbol("HSW-STATE-PUNCTUATION-PIECES"), makeSymbol("HSW-STATE-LEADING-TAGS"), makeSymbol("HSW-STATE-FOLLOWING-TAGS"), makeSymbol("HSW-STATE-CURRENT-OFFSET"));

    static private final SubLList $list_alt68 = list(makeSymbol("_CSETF-HSW-STATE-STATE"), makeSymbol("_CSETF-HSW-STATE-TAG-PIECES"), makeSymbol("_CSETF-HSW-STATE-STRING-PIECES"), makeSymbol("_CSETF-HSW-STATE-PUNCTUATION-PIECES"), makeSymbol("_CSETF-HSW-STATE-LEADING-TAGS"), makeSymbol("_CSETF-HSW-STATE-FOLLOWING-TAGS"), makeSymbol("_CSETF-HSW-STATE-CURRENT-OFFSET"));

    /**
     *
     *
     * @param TEXT
     * 		stringp; an English text
     * @return listp; a list of all sentences in TEXT
     */
    @LispMethod(comment = "@param TEXT\r\n\t\tstringp; an English text\r\n@return listp; a list of all sentences in TEXT")
    public static final SubLObject sentencify_string_alt(SubLObject text) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(text, STRINGP);
            if (NIL == sentencifier_initializedP()) {
                initialize_sentencifier();
            }
            {
                SubLObject processed = text;
                SubLObject cdolist_list_var = $sentencifier_patterns$.getDynamicValue(thread);
                SubLObject patternXsubstitution = NIL;
                for (patternXsubstitution = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , patternXsubstitution = cdolist_list_var.first()) {
                    {
                        SubLObject datum = patternXsubstitution;
                        SubLObject current = datum;
                        SubLObject pattern = NIL;
                        SubLObject substitution = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt495);
                        pattern = current.first();
                        current = current.rest();
                        substitution = current;
                        processed = regular_expression_utilities.regex_subst(pattern, substitution, processed, UNPROVIDED);
                    }
                }
                return clean_sentences(string_utilities.split_string(processed, list($eos_char$.getDynamicValue(thread))));
            }
        }
    }

    /**
     *
     *
     * @param TEXT
     * 		stringp; an English text
     * @return listp; a list of all sentences in TEXT
     */
    @LispMethod(comment = "@param TEXT\r\n\t\tstringp; an English text\r\n@return listp; a list of all sentences in TEXT")
    public static SubLObject sentencify_string(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(text) : "! stringp(text) " + ("Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) ") + text;
        if (NIL == sentencifier_initializedP()) {
            initialize_sentencifier();
        }
        SubLObject processed = text;
        SubLObject cdolist_list_var = $sentencifier_patterns$.getDynamicValue(thread);
        SubLObject patternXsubstitution = NIL;
        patternXsubstitution = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = patternXsubstitution;
            SubLObject pattern = NIL;
            SubLObject substitution = NIL;
            destructuring_bind_must_consp(current, datum, $list529);
            pattern = current.first();
            current = substitution = current.rest();
            processed = regular_expression_utilities.regex_subst(pattern, substitution, processed, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            patternXsubstitution = cdolist_list_var.first();
        } 
        return clean_sentences(string_utilities.split_string(processed, list($eos_char$.getDynamicValue(thread))));
    }

    /**
     *
     *
     * @param PATH
     * 		stringp; the location of the file
     * @return listp; all sentences in the file located at PATH
     */
    @LispMethod(comment = "@param PATH\r\n\t\tstringp; the location of the file\r\n@return listp; all sentences in the file located at PATH")
    public static final SubLObject sentencify_file_alt(SubLObject path) {
        return sentencify_string(file_utilities.slurp_file(path));
    }

    /**
     *
     *
     * @param PATH
     * 		stringp; the location of the file
     * @return listp; all sentences in the file located at PATH
     */
    @LispMethod(comment = "@param PATH\r\n\t\tstringp; the location of the file\r\n@return listp; all sentences in the file located at PATH")
    public static SubLObject sentencify_file(final SubLObject path) {
        return sentencify_string(file_utilities.slurp_file(path));
    }

    public static final SubLObject generate_abbreviation_regular_expressions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_regular_expressions = NIL;
                SubLObject cdolist_list_var = $abbreviations$.getDynamicValue(thread);
                SubLObject abrv = NIL;
                for (abrv = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , abrv = cdolist_list_var.first()) {
                    v_regular_expressions = cons(list(cconcatenate($str_alt498$__b, new SubLObject[]{ format_nil.format_nil_a_no_copy(abrv), format_nil.format_nil_a_no_copy($pap$.getDynamicValue(thread)), $str_alt471$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue(thread)) }), $str_alt472$_1, $list_alt493), v_regular_expressions);
                }
                return v_regular_expressions;
            }
        }
    }

    public static SubLObject generate_abbreviation_regular_expressions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_regular_expressions = NIL;
        SubLObject cdolist_list_var = $abbreviations$.getDynamicValue(thread);
        SubLObject abrv = NIL;
        abrv = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_regular_expressions = cons(list(cconcatenate($str532$__b, new SubLObject[]{ format_nil.format_nil_a_no_copy(abrv), format_nil.format_nil_a_no_copy($pap$.getDynamicValue(thread)), $str505$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue(thread)) }), $str506$_1, $list527), v_regular_expressions);
            cdolist_list_var = cdolist_list_var.rest();
            abrv = cdolist_list_var.first();
        } 
        return v_regular_expressions;
    }

    static private final SubLString $str_alt92$__S__S_ = makeString("<~S ~S>");

    static private final SubLList $list_alt93 = list(makeKeyword("STATE"), makeKeyword("NORMAL"), makeKeyword("CURRENT-OFFSET"), ZERO_INTEGER);

    /**
     *
     *
     * @param REGULAR-EXPRESSIONS
    listp;
     * 		
     * @return listp; a list of compiled REGULAR-EXPRESSIONS
     */
    @LispMethod(comment = "@param REGULAR-EXPRESSIONS\nlistp;\r\n\t\t\r\n@return listp; a list of compiled REGULAR-EXPRESSIONS")
    public static final SubLObject compile_regular_expression_substitutions_alt(SubLObject regular_expression_substitutions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern_substitutions = NIL;
                SubLObject cdolist_list_var = regular_expression_substitutions;
                SubLObject regexXsubstitution = NIL;
                for (regexXsubstitution = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , regexXsubstitution = cdolist_list_var.first()) {
                    {
                        SubLObject datum = regexXsubstitution;
                        SubLObject current = datum;
                        SubLObject re = NIL;
                        SubLObject substitution = NIL;
                        SubLObject options = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt499);
                        re = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt499);
                        substitution = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt499);
                        options = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            thread.resetMultipleValues();
                            {
                                SubLObject pattern = regular_expressions.compile_regular_expression(re, options);
                                SubLObject dummy1 = thread.secondMultipleValue();
                                SubLObject dummy2 = thread.thirdMultipleValue();
                                SubLObject error = thread.fourthMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != pattern) {
                                    pattern_substitutions = cons(cons(pattern, substitution), pattern_substitutions);
                                } else {
                                    Errors.error($str_alt500$Can_t_compile_regular_expression_, re, error);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt499);
                        }
                    }
                }
                return nreverse(pattern_substitutions);
            }
        }
    }

    /**
     *
     *
     * @param REGULAR-EXPRESSIONS
    listp;
     * 		
     * @return listp; a list of compiled REGULAR-EXPRESSIONS
     */
    @LispMethod(comment = "@param REGULAR-EXPRESSIONS\nlistp;\r\n\t\t\r\n@return listp; a list of compiled REGULAR-EXPRESSIONS")
    public static SubLObject compile_regular_expression_substitutions(final SubLObject regular_expression_substitutions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern_substitutions = NIL;
        SubLObject cdolist_list_var = regular_expression_substitutions;
        SubLObject regexXsubstitution = NIL;
        regexXsubstitution = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = regexXsubstitution;
            SubLObject re = NIL;
            SubLObject substitution = NIL;
            SubLObject options = NIL;
            destructuring_bind_must_consp(current, datum, $list533);
            re = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list533);
            substitution = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list533);
            options = current.first();
            current = current.rest();
            if (NIL == current) {
                thread.resetMultipleValues();
                final SubLObject pattern = regular_expressions.compile_regular_expression(re, options);
                final SubLObject dummy1 = thread.secondMultipleValue();
                final SubLObject dummy2 = thread.thirdMultipleValue();
                final SubLObject error = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != pattern) {
                    pattern_substitutions = cons(cons(pattern, substitution), pattern_substitutions);
                } else {
                    Errors.error($str534$Can_t_compile_regular_expression_, re, error);
                }
            } else {
                cdestructuring_bind_error(datum, $list533);
            }
            cdolist_list_var = cdolist_list_var.rest();
            regexXsubstitution = cdolist_list_var.first();
        } 
        return nreverse(pattern_substitutions);
    }

    static private final SubLList $list_alt101 = list(makeKeyword("DEFAULT"), makeKeyword("START-OF-TAG"), makeKeyword("SPACE"));

    static private final SubLString $str_alt102$Unknown_state___S = makeString("Unknown state: ~S");

    static private final SubLString $$$daves = makeString("daves");

    static private final SubLList $list_alt115 = list(new SubLObject[]{ list(list(makeString("2.4 cm")), list(makeString("2.4"), makeString("cm"))), list(list(makeString("Mr. Bill Clinton, president of the Clinton Foundation, met George W. Bush and gave him $400,000.00")), list(new SubLObject[]{ makeString("Mr."), makeString("Bill"), makeString("Clinton"), makeString(","), makeString("president"), makeString("of"), makeString("the"), makeString("Clinton"), makeString("Foundation"), makeString(","), makeString("met"), makeString("George"), makeString("W"), makeString("."), makeString("Bush"), makeString("and"), makeString("gave"), makeString("him"), makeString("$"), makeString("400,000.00"), makeSymbol(">") })), list(list(makeString("C.I.A. director Patrick Henry said, \"Give me liberty or give me death!\"")), list(new SubLObject[]{ makeString("C.I.A."), makeString("director"), makeString("Patrick"), makeString("Henry"), makeString("said"), makeString(","), makeString("\""), makeString("Give"), makeString("me"), makeString("liberty"), makeString("or"), makeString("give"), makeString("me"), makeString("death"), makeString("!"), makeString("\""), makeSymbol(">") })), list(list(makeString("I have -1 apples and 1-4 cats")), list(makeString("I"), makeString("have"), makeString("-"), makeString("1"), makeString("apples"), makeString("and"), makeString("1-4"), makeString("cats"))), list(list(makeString("I like cats.  You like zebras.")), list(new SubLObject[]{ makeString("I"), makeString("like"), makeString("cats"), makeString("."), makeString("You"), makeString("like"), makeString("zebras"), makeString("."), makeSymbol(">") })), list(list(makeString("I work for the C.I.A.  Where do you work?")), list(new SubLObject[]{ makeString("I"), makeString("work"), makeString("for"), makeString("the"), makeString("C.I.A."), makeString("Where"), makeString("do"), makeString("you"), makeString("work"), makeString("?") })), list(list(makeString("couldn't eat")), list(makeString("could"), makeString("n't"), makeString("eat"))), list(list(makeString("3^4")), list(makeString("3"), makeString("^"), makeString("4"))), list(list(makeString("bit-o'-honey")), list(makeString("bit-o"), makeString("'"), makeString("-"), makeString("honey"))), list(list(makeString("can't eat")), list(makeString("ca"), makeString("n't"), makeString("eat"))) });

    public static final SubLObject clean_sentences_alt(SubLObject sentences) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                {
                    SubLObject trimmed = string_utilities.trim_whitespace(sentence);
                    if (NIL != string_utilities.non_empty_stringP(trimmed)) {
                        result = cons(trimmed, result);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject clean_sentences(final SubLObject sentences) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject trimmed = string_utilities.trim_whitespace(sentence);
            if (NIL != string_utilities.non_empty_stringP(trimmed)) {
                result = cons(trimmed, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject document_sentence_countE(final SubLObject v_document, final SubLObject count) {
        SubLObject sentence_count = ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$41;
        SubLObject backwardP_var_$42;
        SubLObject length_$43;
        SubLObject v_iteration_$44;
        SubLObject element_num_$45;
        SubLObject s;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$41 = paragraph_sentences(paragraph);
            backwardP_var_$42 = NIL;
            for (length_$43 = length(vector_var_$41), v_iteration_$44 = NIL, v_iteration_$44 = ZERO_INTEGER; v_iteration_$44.numL(length_$43); v_iteration_$44 = add(v_iteration_$44, ONE_INTEGER)) {
                element_num_$45 = (NIL != backwardP_var_$42) ? subtract(length_$43, v_iteration_$44, ONE_INTEGER) : v_iteration_$44;
                s = aref(vector_var_$41, element_num_$45);
                sentence_count = add(sentence_count, ONE_INTEGER);
            }
        }
        return eq(sentence_count, count);
    }

    static private final SubLString $str_alt116$_a_WRD_a__a__WRD__a = makeString("~a<WRD~a>~a</WRD>~a");

    static private final SubLString $str_alt117$_tag__ = makeString(" tag=\"");

    static private final SubLList $list_alt118 = list(makeString("."), makeString("!"), makeString("?"));

    static private final SubLList $list_alt119 = list(makeString("\""), makeString("'"), makeString("`"));

    static private final SubLString $str_alt120$_ = makeString("\n");

    static private final SubLList $list_alt121 = list(new SubLObject[]{ makeString("."), makeString(","), makeString(";"), makeString(":"), makeString("?"), makeString("!"), makeString("-"), makeString("--"), makeString("---"), makeString("("), makeString(")"), makeString("["), makeString("]"), makeString("{"), makeString("}"), makeString("\""), makeString("'"), makeString("`") });

    static private final SubLList $list_alt122 = list(CHAR_period, CHAR_question, CHAR_exclamation);

    static private final SubLList $list_alt123 = list(new SubLObject[]{ CHAR_comma, CHAR_semicolon, CHAR_colon, CHAR_quote, CHAR_lparen, CHAR_rparen, CHAR_lbrace, CHAR_rbrace, CHAR_lbracket, CHAR_rbracket, CHAR_hyphen });

    static private final SubLList $list_alt124 = list(CHAR_quotation, CHAR_quote, CHAR_backquote);

    public static SubLObject test_construct_string_from_words(final SubLObject form, SubLObject standardizeP) {
        if (standardizeP == UNPROVIDED) {
            standardizeP = NIL;
        }
        return construct_string_from_words(eval(form), standardizeP, UNPROVIDED);
    }

    static private final SubLList $list_alt126 = list(list(makeSymbol("CONSTITUENT"), makeSymbol("PHRASE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject declare_document_file_alt() {
        declareFunction("sign_print_function_trampoline", "SIGN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sign_p", "SIGN-P", 1, 0, false);
        new com.cyc.cycjava.cycl.document.$sign_p$UnaryFunction();
        declareFunction("sign_string", "SIGN-STRING", 1, 0, false);
        declareFunction("sign_type", "SIGN-TYPE", 1, 0, false);
        declareFunction("sign_info", "SIGN-INFO", 1, 0, false);
        declareFunction("sign_category", "SIGN-CATEGORY", 1, 0, false);
        declareFunction("sign_constituents", "SIGN-CONSTITUENTS", 1, 0, false);
        declareFunction("sign_offset", "SIGN-OFFSET", 1, 0, false);
        declareFunction("sign_mother", "SIGN-MOTHER", 1, 0, false);
        declareFunction("_csetf_sign_string", "_CSETF-SIGN-STRING", 2, 0, false);
        declareFunction("_csetf_sign_type", "_CSETF-SIGN-TYPE", 2, 0, false);
        declareFunction("_csetf_sign_info", "_CSETF-SIGN-INFO", 2, 0, false);
        declareFunction("_csetf_sign_category", "_CSETF-SIGN-CATEGORY", 2, 0, false);
        declareFunction("_csetf_sign_constituents", "_CSETF-SIGN-CONSTITUENTS", 2, 0, false);
        declareFunction("_csetf_sign_offset", "_CSETF-SIGN-OFFSET", 2, 0, false);
        declareFunction("_csetf_sign_mother", "_CSETF-SIGN-MOTHER", 2, 0, false);
        declareFunction("make_sign", "MAKE-SIGN", 0, 1, false);
        declareFunction("new_sign", "NEW-SIGN", 0, 0, false);
        declareFunction("sxhash_sign", "SXHASH-SIGN", 1, 0, false);
        declareFunction("sxhash_sign_method", "SXHASH-SIGN-METHOD", 1, 0, false);
        declareFunction("sign_print", "SIGN-PRINT", 3, 0, false);
        declareFunction("sign_get", "SIGN-GET", 2, 0, false);
        declareFunction("sign_set", "SIGN-SET", 3, 0, false);
        declareFunction("sign_length", "SIGN-LENGTH", 1, 0, false);
        declareFunction("sign_update", "SIGN-UPDATE", 2, 0, false);
        declareMacro("sign_do_constituents", "SIGN-DO-CONSTITUENTS");
        declareFunction("sign_yield", "SIGN-YIELD", 1, 0, false);
        declareFunction("sign_intervals", "SIGN-INTERVALS", 1, 1, false);
        declareFunction("new_word", "NEW-WORD", 0, 1, false);
        declareFunction("copy_word", "COPY-WORD", 1, 0, false);
        declareFunction("word_p", "WORD-P", 1, 0, false);
        declareFunction("set_word_string", "SET-WORD-STRING", 2, 0, false);
        declareFunction("word_string", "WORD-STRING", 1, 0, false);
        declareFunction("set_word_category", "SET-WORD-CATEGORY", 2, 0, false);
        declareFunction("word_category", "WORD-CATEGORY", 1, 0, false);
        declareFunction("word_offset", "WORD-OFFSET", 1, 0, false);
        declareFunction("word_length", "WORD-LENGTH", 1, 0, false);
        declareFunction("word_mother", "WORD-MOTHER", 1, 0, false);
        declareFunction("word_info", "WORD-INFO", 1, 0, false);
        declareFunction("word_interps", "WORD-INTERPS", 1, 0, false);
        declareFunction("word_lex_entries", "WORD-LEX-ENTRIES", 1, 0, false);
        declareFunction("word_cycls", "WORD-CYCLS", 1, 0, false);
        declareFunction("word_cyc_pos", "WORD-CYC-POS", 1, 0, false);
        declareFunction("word_update", "WORD-UPDATE", 2, 0, false);
        declareFunction("word_index", "WORD-INDEX", 1, 0, false);
        declareFunction("word_intervals", "WORD-INTERVALS", 1, 1, false);
        declareFunction("word_capitalize", "WORD-CAPITALIZE", 1, 0, false);
        declareFunction("word_uncapitalize", "WORD-UNCAPITALIZE", 1, 0, false);
        declareFunction("build_word_token", "BUILD-WORD-TOKEN", 1, 0, false);
        declareFunction("stringify", "STRINGIFY", 1, 0, false);
        declareFunction("no_space_before_following_wordP", "NO-SPACE-BEFORE-FOLLOWING-WORD?", 1, 0, false);
        declareFunction("next_word_offset", "NEXT-WORD-OFFSET", 1, 0, false);
        declareFunction("string_tokenize_via_wordify", "STRING-TOKENIZE-VIA-WORDIFY", 1, 0, false);
        declareFunction("string_wordify", "STRING-WORDIFY", 1, 1, false);
        declareFunction("fst_string_wordify", "FST-STRING-WORDIFY", 1, 0, false);
        declareFunction("rkf_standard_string_wordify", "RKF-STANDARD-STRING-WORDIFY", 1, 0, false);
        declareFunction("clear_html_string_wordify_punctuation_chars", "CLEAR-HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
        declareFunction("remove_html_string_wordify_punctuation_chars", "REMOVE-HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
        declareFunction("html_string_wordify_punctuation_chars_internal", "HTML-STRING-WORDIFY-PUNCTUATION-CHARS-INTERNAL", 0, 0, false);
        declareFunction("html_string_wordify_punctuation_chars", "HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
        declareFunction("html_string_wordify_state_print_function_trampoline", "HTML-STRING-WORDIFY-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("html_string_wordify_state_p", "HTML-STRING-WORDIFY-STATE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.document.$html_string_wordify_state_p$UnaryFunction();
        declareFunction("hsw_state_state", "HSW-STATE-STATE", 1, 0, false);
        declareFunction("hsw_state_tag_pieces", "HSW-STATE-TAG-PIECES", 1, 0, false);
        declareFunction("hsw_state_string_pieces", "HSW-STATE-STRING-PIECES", 1, 0, false);
        declareFunction("hsw_state_punctuation_pieces", "HSW-STATE-PUNCTUATION-PIECES", 1, 0, false);
        declareFunction("hsw_state_leading_tags", "HSW-STATE-LEADING-TAGS", 1, 0, false);
        declareFunction("hsw_state_following_tags", "HSW-STATE-FOLLOWING-TAGS", 1, 0, false);
        declareFunction("hsw_state_current_offset", "HSW-STATE-CURRENT-OFFSET", 1, 0, false);
        declareFunction("_csetf_hsw_state_state", "_CSETF-HSW-STATE-STATE", 2, 0, false);
        declareFunction("_csetf_hsw_state_tag_pieces", "_CSETF-HSW-STATE-TAG-PIECES", 2, 0, false);
        declareFunction("_csetf_hsw_state_string_pieces", "_CSETF-HSW-STATE-STRING-PIECES", 2, 0, false);
        declareFunction("_csetf_hsw_state_punctuation_pieces", "_CSETF-HSW-STATE-PUNCTUATION-PIECES", 2, 0, false);
        declareFunction("_csetf_hsw_state_leading_tags", "_CSETF-HSW-STATE-LEADING-TAGS", 2, 0, false);
        declareFunction("_csetf_hsw_state_following_tags", "_CSETF-HSW-STATE-FOLLOWING-TAGS", 2, 0, false);
        declareFunction("_csetf_hsw_state_current_offset", "_CSETF-HSW-STATE-CURRENT-OFFSET", 2, 0, false);
        declareFunction("make_html_string_wordify_state", "MAKE-HTML-STRING-WORDIFY-STATE", 0, 1, false);
        declareFunction("print_hsw_state", "PRINT-HSW-STATE", 1, 2, false);
        declareFunction("new_html_string_wordify_state", "NEW-HTML-STRING-WORDIFY-STATE", 0, 0, false);
        declareFunction("classify_html_string_token", "CLASSIFY-HTML-STRING-TOKEN", 2, 0, false);
        declareFunction("html_string_wordify", "HTML-STRING-WORDIFY", 1, 0, false);
        declareFunction("hsw_peek_next_token", "HSW-PEEK-NEXT-TOKEN", 2, 0, false);
        declareFunction("hsw_state_add_string_piece", "HSW-STATE-ADD-STRING-PIECE", 2, 0, false);
        declareFunction("hsw_state_clear_string_pieces", "HSW-STATE-CLEAR-STRING-PIECES", 1, 0, false);
        declareFunction("tag_from_hsw_state", "TAG-FROM-HSW-STATE", 1, 0, false);
        declareFunction("new_word_from_hsw_state", "NEW-WORD-FROM-HSW-STATE", 1, 0, false);
        declareFunction("fst_wordify_test", "FST-WORDIFY-TEST", 2, 0, false);
        declareFunction("string_to_xml", "STRING-TO-XML", 1, 0, false);
        declareFunction("word_to_xml", "WORD-TO-XML", 1, 1, false);
        declareFunction("end_of_sentence_word_p", "END-OF-SENTENCE-WORD-P", 1, 0, false);
        declareFunction("quote_word_p", "QUOTE-WORD-P", 1, 0, false);
        declareFunction("newline_word_p", "NEWLINE-WORD-P", 1, 0, false);
        declareFunction("punctuation_sign_p", "PUNCTUATION-SIGN-P", 1, 0, false);
        declareFunction("sentence_final_punctuation_charP", "SENTENCE-FINAL-PUNCTUATION-CHAR?", 1, 0, false);
        declareFunction("sentence_internal_punctuation_charP", "SENTENCE-INTERNAL-PUNCTUATION-CHAR?", 1, 0, false);
        declareFunction("any_punctuation_charP", "ANY-PUNCTUATION-CHAR?", 1, 0, false);
        declareFunction("quote_charP", "QUOTE-CHAR?", 1, 0, false);
        declareFunction("new_phrase", "NEW-PHRASE", 0, 1, false);
        declareFunction("phrase_p", "PHRASE-P", 1, 0, false);
        declareFunction("phrase_string", "PHRASE-STRING", 1, 0, false);
        declareFunction("phrase_category", "PHRASE-CATEGORY", 1, 0, false);
        declareFunction("phrase_yield", "PHRASE-YIELD", 1, 0, false);
        declareMacro("phrase_do_constituents", "PHRASE-DO-CONSTITUENTS");
        declareFunction("phrase_constituents", "PHRASE-CONSTITUENTS", 1, 0, false);
        declareFunction("phrase_nodes", "PHRASE-NODES", 1, 0, false);
        declareFunction("phrase_intervals", "PHRASE-INTERVALS", 1, 1, false);
        declareFunction("phrase_info", "PHRASE-INFO", 1, 0, false);
        declareFunction("phrase_update", "PHRASE-UPDATE", 2, 0, false);
        declareFunction("phrase_get", "PHRASE-GET", 2, 0, false);
        declareFunction("phrase_set", "PHRASE-SET", 3, 0, false);
        declareFunction("phrase_constituent_length", "PHRASE-CONSTITUENT-LENGTH", 1, 0, false);
        declareFunction("phrase_to_xml", "PHRASE-TO-XML", 1, 1, false);
        declareMacro("sentence_do_words", "SENTENCE-DO-WORDS");
        declareFunction("new_sentence", "NEW-SENTENCE", 0, 2, false);
        declareFunction("sentence_p", "SENTENCE-P", 1, 0, false);
        declareFunction("sentence_print", "SENTENCE-PRINT", 3, 0, false);
        declareFunction("sentence_string", "SENTENCE-STRING", 1, 0, false);
        declareFunction("sentence_category", "SENTENCE-CATEGORY", 1, 0, false);
        declareFunction("sentence_yield", "SENTENCE-YIELD", 1, 0, false);
        declareFunction("sentence_constituents", "SENTENCE-CONSTITUENTS", 1, 0, false);
        declareFunction("sentence_info", "SENTENCE-INFO", 1, 0, false);
        declareFunction("sentence_offset", "SENTENCE-OFFSET", 1, 0, false);
        declareFunction("sentence_index", "SENTENCE-INDEX", 1, 0, false);
        declareFunction("sentence_get", "SENTENCE-GET", 2, 0, false);
        declareFunction("sentence_mother", "SENTENCE-MOTHER", 1, 0, false);
        declareFunction("sentence_set", "SENTENCE-SET", 3, 0, false);
        declareFunction("sentence_length", "SENTENCE-LENGTH", 1, 0, false);
        declareMacro("sentence_do_constituents", "SENTENCE-DO-CONSTITUENTS");
        declareFunction("sentence_reconstruct_substring", "SENTENCE-RECONSTRUCT-SUBSTRING", 3, 0, false);
        declareFunction("sentence_delete_punctuation", "SENTENCE-DELETE-PUNCTUATION", 1, 0, false);
        declareFunction("sentence_listify", "SENTENCE-LISTIFY", 1, 0, false);
        declareFunction("sentence_stringify", "SENTENCE-STRINGIFY", 1, 0, false);
        declareFunction("build_sentence_token", "BUILD-SENTENCE-TOKEN", 1, 1, false);
        declareFunction("string_sentencify", "STRING-SENTENCIFY", 1, 1, false);
        declareFunction("newline_sentence_p", "NEWLINE-SENTENCE-P", 1, 0, false);
        declareFunction("paragraph_print_function_trampoline", "PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("paragraph_p", "PARAGRAPH-P", 1, 0, false);
        new com.cyc.cycjava.cycl.document.$paragraph_p$UnaryFunction();
        declareFunction("paragraph_sentences", "PARAGRAPH-SENTENCES", 1, 0, false);
        declareFunction("paragraph_mother", "PARAGRAPH-MOTHER", 1, 0, false);
        declareFunction("_csetf_paragraph_sentences", "_CSETF-PARAGRAPH-SENTENCES", 2, 0, false);
        declareFunction("_csetf_paragraph_mother", "_CSETF-PARAGRAPH-MOTHER", 2, 0, false);
        declareFunction("make_paragraph", "MAKE-PARAGRAPH", 0, 1, false);
        declareMacro("paragraph_do_sentences", "PARAGRAPH-DO-SENTENCES");
        declareMacro("paragraph_do_words", "PARAGRAPH-DO-WORDS");
        declareFunction("new_paragraph", "NEW-PARAGRAPH", 1, 0, false);
        declareFunction("paragraph_print", "PARAGRAPH-PRINT", 3, 0, false);
        declareFunction("paragraph_get", "PARAGRAPH-GET", 2, 0, false);
        declareFunction("paragraph_set", "PARAGRAPH-SET", 3, 0, false);
        declareFunction("paragraph_sentence_length", "PARAGRAPH-SENTENCE-LENGTH", 1, 0, false);
        declareFunction("paragraph_word_length", "PARAGRAPH-WORD-LENGTH", 1, 0, false);
        declareFunction("paragraph_offset", "PARAGRAPH-OFFSET", 1, 0, false);
        declareFunction("paragraph_string", "PARAGRAPH-STRING", 1, 0, false);
        declareFunction("paragraph_to_xml", "PARAGRAPH-TO-XML", 1, 1, false);
        declareFunction("build_paragraph_token", "BUILD-PARAGRAPH-TOKEN", 1, 0, false);
        declareFunction("string_paragraphize", "STRING-PARAGRAPHIZE", 1, 1, false);
        declareFunction("sign_to_xml", "SIGN-TO-XML", 1, 1, false);
        declareFunction("document_print_function_trampoline", "DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("document_p", "DOCUMENT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.document.$document_p$UnaryFunction();
        declareFunction("document_paragraphs", "DOCUMENT-PARAGRAPHS", 1, 0, false);
        declareFunction("_csetf_document_paragraphs", "_CSETF-DOCUMENT-PARAGRAPHS", 2, 0, false);
        declareFunction("make_document", "MAKE-DOCUMENT", 0, 1, false);
        declareFunction("new_document", "NEW-DOCUMENT", 1, 1, false);
        declareMacro("document_do_paragraphs", "DOCUMENT-DO-PARAGRAPHS");
        declareMacro("document_do_sentences", "DOCUMENT-DO-SENTENCES");
        declareFunction("new_document_from_string", "NEW-DOCUMENT-FROM-STRING", 1, 1, false);
        declareFunction("new_document_from_file", "NEW-DOCUMENT-FROM-FILE", 1, 1, false);
        declareFunction("new_document_from_stream", "NEW-DOCUMENT-FROM-STREAM", 1, 1, false);
        declareFunction("document_print", "DOCUMENT-PRINT", 3, 0, false);
        declareFunction("document_get", "DOCUMENT-GET", 2, 0, false);
        declareFunction("document_set", "DOCUMENT-SET", 3, 0, false);
        declareFunction("document_get_sentence", "DOCUMENT-GET-SENTENCE", 2, 0, false);
        declareFunction("document_get_word", "DOCUMENT-GET-WORD", 2, 0, false);
        declareFunction("document_to_xml", "DOCUMENT-TO-XML", 1, 0, false);
        declareFunction("document_paragraph_length", "DOCUMENT-PARAGRAPH-LENGTH", 1, 0, false);
        declareFunction("document_sentence_length", "DOCUMENT-SENTENCE-LENGTH", 1, 0, false);
        declareFunction("document_word_length", "DOCUMENT-WORD-LENGTH", 1, 0, false);
        declareMacro("document_do_words", "DOCUMENT-DO-WORDS");
        declareFunction("document_string", "DOCUMENT-STRING", 1, 0, false);
        declareFunction("new_sentence_iterator", "NEW-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction("new_document_sentence_iterator", "NEW-DOCUMENT-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction("new_paragraph_sentence_iterator", "NEW-PARAGRAPH-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction("new_sentence_sentence_iterator", "NEW-SENTENCE-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction("stream_stringify", "STREAM-STRINGIFY", 1, 0, false);
        declareFunction("sentencifier_initializedP", "SENTENCIFIER-INITIALIZED?", 0, 0, false);
        declareFunction("initialize_sentencifier", "INITIALIZE-SENTENCIFIER", 0, 0, false);
        declareFunction("finalize_sentencifier", "FINALIZE-SENTENCIFIER", 0, 0, false);
        declareFunction("sentencify_string", "SENTENCIFY-STRING", 1, 0, false);
        declareFunction("sentencify_file", "SENTENCIFY-FILE", 1, 0, false);
        declareFunction("generate_abbreviation_regular_expressions", "GENERATE-ABBREVIATION-REGULAR-EXPRESSIONS", 0, 0, false);
        declareFunction("compile_regular_expression_substitutions", "COMPILE-REGULAR-EXPRESSION-SUBSTITUTIONS", 1, 0, false);
        declareFunction("clean_sentences", "CLEAN-SENTENCES", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_document_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("sign_print_function_trampoline", "SIGN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("sign_p", "SIGN-P", 1, 0, false);
            new document.$sign_p$UnaryFunction();
            declareFunction("sign_string", "SIGN-STRING", 1, 0, false);
            declareFunction("sign_type", "SIGN-TYPE", 1, 0, false);
            declareFunction("sign_info", "SIGN-INFO", 1, 0, false);
            declareFunction("sign_category", "SIGN-CATEGORY", 1, 0, false);
            declareFunction("sign_constituents", "SIGN-CONSTITUENTS", 1, 0, false);
            declareFunction("sign_offset", "SIGN-OFFSET", 1, 0, false);
            declareFunction("sign_mother", "SIGN-MOTHER", 1, 0, false);
            declareFunction("_csetf_sign_string", "_CSETF-SIGN-STRING", 2, 0, false);
            declareFunction("_csetf_sign_type", "_CSETF-SIGN-TYPE", 2, 0, false);
            declareFunction("_csetf_sign_info", "_CSETF-SIGN-INFO", 2, 0, false);
            declareFunction("_csetf_sign_category", "_CSETF-SIGN-CATEGORY", 2, 0, false);
            declareFunction("_csetf_sign_constituents", "_CSETF-SIGN-CONSTITUENTS", 2, 0, false);
            declareFunction("_csetf_sign_offset", "_CSETF-SIGN-OFFSET", 2, 0, false);
            declareFunction("_csetf_sign_mother", "_CSETF-SIGN-MOTHER", 2, 0, false);
            declareFunction("make_sign", "MAKE-SIGN", 0, 1, false);
            declareFunction("visit_defstruct_sign", "VISIT-DEFSTRUCT-SIGN", 2, 0, false);
            declareFunction("visit_defstruct_object_sign_method", "VISIT-DEFSTRUCT-OBJECT-SIGN-METHOD", 2, 0, false);
            declareFunction("new_sign", "NEW-SIGN", 0, 0, false);
            declareFunction("sxhash_sign", "SXHASH-SIGN", 1, 0, false);
            declareFunction("sxhash_sign_method", "SXHASH-SIGN-METHOD", 1, 0, false);
            declareFunction("sign_print", "SIGN-PRINT", 3, 0, false);
            declareFunction("sign_get", "SIGN-GET", 2, 0, false);
            declareFunction("sign_set", "SIGN-SET", 3, 0, false);
            declareFunction("sign_length", "SIGN-LENGTH", 1, 0, false);
            declareFunction("sign_update", "SIGN-UPDATE", 2, 0, false);
            declareMacro("sign_do_constituents", "SIGN-DO-CONSTITUENTS");
            declareFunction("sign_yield", "SIGN-YIELD", 1, 0, false);
            declareFunction("sign_intervals", "SIGN-INTERVALS", 1, 1, false);
            declareFunction("new_exhaustive_word", "NEW-EXHAUSTIVE-WORD", 0, 1, false);
            declareFunction("new_exhaustive_word_from_word", "NEW-EXHAUSTIVE-WORD-FROM-WORD", 1, 0, false);
            declareFunction("exhaustive_word_p", "EXHAUSTIVE-WORD-P", 1, 0, false);
            declareFunction("new_word", "NEW-WORD", 0, 1, false);
            declareFunction("copy_word", "COPY-WORD", 1, 0, false);
            declareFunction("word_p", "WORD-P", 1, 0, false);
            declareFunction("set_word_string", "SET-WORD-STRING", 2, 0, false);
            declareFunction("word_string", "WORD-STRING", 1, 0, false);
            declareFunction("set_word_category", "SET-WORD-CATEGORY", 2, 0, false);
            declareFunction("word_category", "WORD-CATEGORY", 1, 0, false);
            declareFunction("word_offset", "WORD-OFFSET", 1, 0, false);
            declareFunction("word_length", "WORD-LENGTH", 1, 0, false);
            declareFunction("word_mother", "WORD-MOTHER", 1, 0, false);
            declareFunction("word_info", "WORD-INFO", 1, 0, false);
            declareFunction("word_constituents", "WORD-CONSTITUENTS", 1, 0, false);
            declareFunction("word_interps", "WORD-INTERPS", 1, 0, false);
            declareFunction("word_lex_entries", "WORD-LEX-ENTRIES", 1, 0, false);
            declareFunction("word_cycls", "WORD-CYCLS", 1, 0, false);
            declareFunction("word_cyc_pos", "WORD-CYC-POS", 1, 0, false);
            declareFunction("word_update", "WORD-UPDATE", 2, 0, false);
            declareFunction("word_index", "WORD-INDEX", 1, 0, false);
            declareFunction("word_intervals", "WORD-INTERVALS", 1, 1, false);
            declareFunction("word_capitalize", "WORD-CAPITALIZE", 1, 0, false);
            declareFunction("word_uncapitalize", "WORD-UNCAPITALIZE", 1, 0, false);
            declareFunction("build_word_token", "BUILD-WORD-TOKEN", 1, 0, false);
            declareFunction("stringify", "STRINGIFY", 1, 0, false);
            declareFunction("no_space_before_following_wordP", "NO-SPACE-BEFORE-FOLLOWING-WORD?", 1, 0, false);
            declareFunction("next_word_offset", "NEXT-WORD-OFFSET", 1, 0, false);
            declareFunction("string_tokenize_via_wordify", "STRING-TOKENIZE-VIA-WORDIFY", 1, 0, false);
            declareFunction("string_wordify", "STRING-WORDIFY", 1, 1, false);
            declareFunction("fst_string_wordify", "FST-STRING-WORDIFY", 1, 0, false);
            declareFunction("rkf_standard_string_wordify", "RKF-STANDARD-STRING-WORDIFY", 1, 0, false);
            declareFunction("clear_html_string_wordify_punctuation_chars", "CLEAR-HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
            declareFunction("remove_html_string_wordify_punctuation_chars", "REMOVE-HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
            declareFunction("html_string_wordify_punctuation_chars_internal", "HTML-STRING-WORDIFY-PUNCTUATION-CHARS-INTERNAL", 0, 0, false);
            declareFunction("html_string_wordify_punctuation_chars", "HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
            declareFunction("html_string_wordify_state_print_function_trampoline", "HTML-STRING-WORDIFY-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("html_string_wordify_state_p", "HTML-STRING-WORDIFY-STATE-P", 1, 0, false);
            new document.$html_string_wordify_state_p$UnaryFunction();
            declareFunction("hsw_state_state", "HSW-STATE-STATE", 1, 0, false);
            declareFunction("hsw_state_tag_pieces", "HSW-STATE-TAG-PIECES", 1, 0, false);
            declareFunction("hsw_state_string_pieces", "HSW-STATE-STRING-PIECES", 1, 0, false);
            declareFunction("hsw_state_punctuation_pieces", "HSW-STATE-PUNCTUATION-PIECES", 1, 0, false);
            declareFunction("hsw_state_leading_tags", "HSW-STATE-LEADING-TAGS", 1, 0, false);
            declareFunction("hsw_state_following_tags", "HSW-STATE-FOLLOWING-TAGS", 1, 0, false);
            declareFunction("hsw_state_current_offset", "HSW-STATE-CURRENT-OFFSET", 1, 0, false);
            declareFunction("_csetf_hsw_state_state", "_CSETF-HSW-STATE-STATE", 2, 0, false);
            declareFunction("_csetf_hsw_state_tag_pieces", "_CSETF-HSW-STATE-TAG-PIECES", 2, 0, false);
            declareFunction("_csetf_hsw_state_string_pieces", "_CSETF-HSW-STATE-STRING-PIECES", 2, 0, false);
            declareFunction("_csetf_hsw_state_punctuation_pieces", "_CSETF-HSW-STATE-PUNCTUATION-PIECES", 2, 0, false);
            declareFunction("_csetf_hsw_state_leading_tags", "_CSETF-HSW-STATE-LEADING-TAGS", 2, 0, false);
            declareFunction("_csetf_hsw_state_following_tags", "_CSETF-HSW-STATE-FOLLOWING-TAGS", 2, 0, false);
            declareFunction("_csetf_hsw_state_current_offset", "_CSETF-HSW-STATE-CURRENT-OFFSET", 2, 0, false);
            declareFunction("make_html_string_wordify_state", "MAKE-HTML-STRING-WORDIFY-STATE", 0, 1, false);
            declareFunction("visit_defstruct_html_string_wordify_state", "VISIT-DEFSTRUCT-HTML-STRING-WORDIFY-STATE", 2, 0, false);
            declareFunction("visit_defstruct_object_html_string_wordify_state_method", "VISIT-DEFSTRUCT-OBJECT-HTML-STRING-WORDIFY-STATE-METHOD", 2, 0, false);
            declareFunction("print_hsw_state", "PRINT-HSW-STATE", 1, 2, false);
            declareFunction("new_html_string_wordify_state", "NEW-HTML-STRING-WORDIFY-STATE", 0, 0, false);
            declareFunction("classify_html_string_token", "CLASSIFY-HTML-STRING-TOKEN", 2, 0, false);
            declareFunction("html_string_wordify", "HTML-STRING-WORDIFY", 1, 0, false);
            declareFunction("hsw_peek_next_token", "HSW-PEEK-NEXT-TOKEN", 2, 0, false);
            declareFunction("hsw_state_add_string_piece", "HSW-STATE-ADD-STRING-PIECE", 2, 0, false);
            declareFunction("hsw_state_clear_string_pieces", "HSW-STATE-CLEAR-STRING-PIECES", 1, 0, false);
            declareFunction("tag_from_hsw_state", "TAG-FROM-HSW-STATE", 1, 0, false);
            declareFunction("new_word_from_hsw_state", "NEW-WORD-FROM-HSW-STATE", 1, 0, false);
            declareFunction("fst_wordify_test", "FST-WORDIFY-TEST", 2, 0, false);
            declareFunction("string_to_xml", "STRING-TO-XML", 1, 0, false);
            declareFunction("word_to_xml", "WORD-TO-XML", 1, 1, false);
            declareFunction("end_of_sentence_word_p", "END-OF-SENTENCE-WORD-P", 1, 0, false);
            declareFunction("quote_word_p", "QUOTE-WORD-P", 1, 0, false);
            declareFunction("newline_word_p", "NEWLINE-WORD-P", 1, 0, false);
            declareFunction("punctuation_sign_p", "PUNCTUATION-SIGN-P", 1, 0, false);
            declareFunction("sentence_final_punctuation_charP", "SENTENCE-FINAL-PUNCTUATION-CHAR?", 1, 0, false);
            declareFunction("sentence_internal_punctuation_charP", "SENTENCE-INTERNAL-PUNCTUATION-CHAR?", 1, 0, false);
            declareFunction("any_punctuation_charP", "ANY-PUNCTUATION-CHAR?", 1, 0, false);
            declareFunction("quote_charP", "QUOTE-CHAR?", 1, 0, false);
            declareFunction("new_phrase", "NEW-PHRASE", 0, 1, false);
            declareFunction("phrase_p", "PHRASE-P", 1, 0, false);
            declareFunction("phrase_string", "PHRASE-STRING", 1, 0, false);
            declareFunction("phrase_category", "PHRASE-CATEGORY", 1, 0, false);
            declareFunction("phrase_yield", "PHRASE-YIELD", 1, 0, false);
            declareMacro("phrase_do_constituents", "PHRASE-DO-CONSTITUENTS");
            declareFunction("phrase_constituents", "PHRASE-CONSTITUENTS", 1, 0, false);
            declareFunction("phrase_nodes", "PHRASE-NODES", 1, 0, false);
            declareFunction("phrase_intervals", "PHRASE-INTERVALS", 1, 1, false);
            declareFunction("phrase_info", "PHRASE-INFO", 1, 0, false);
            declareFunction("phrase_update", "PHRASE-UPDATE", 2, 0, false);
            declareFunction("phrase_get", "PHRASE-GET", 2, 0, false);
            declareFunction("phrase_set", "PHRASE-SET", 3, 0, false);
            declareFunction("phrase_constituent_length", "PHRASE-CONSTITUENT-LENGTH", 1, 0, false);
            declareFunction("phrase_to_xml", "PHRASE-TO-XML", 1, 1, false);
            declareMacro("sentence_do_words", "SENTENCE-DO-WORDS");
            declareMacro("sentence_do_minimal_words", "SENTENCE-DO-MINIMAL-WORDS");
            declareFunction("new_sentence", "NEW-SENTENCE", 0, 2, false);
            declareFunction("sentence_p", "SENTENCE-P", 1, 0, false);
            declareFunction("sentence_print", "SENTENCE-PRINT", 3, 0, false);
            declareFunction("sentence_string", "SENTENCE-STRING", 1, 0, false);
            declareFunction("sentence_category", "SENTENCE-CATEGORY", 1, 0, false);
            declareFunction("sentence_yield", "SENTENCE-YIELD", 1, 0, false);
            declareFunction("sentence_yield_exhaustive", "SENTENCE-YIELD-EXHAUSTIVE", 1, 0, false);
            declareFunction("sentence_constituents", "SENTENCE-CONSTITUENTS", 1, 0, false);
            declareFunction("sentence_info", "SENTENCE-INFO", 1, 0, false);
            declareFunction("sentence_offset", "SENTENCE-OFFSET", 1, 0, false);
            declareFunction("sentence_index", "SENTENCE-INDEX", 1, 0, false);
            declareFunction("sentence_get", "SENTENCE-GET", 2, 0, false);
            declareFunction("sentence_mother", "SENTENCE-MOTHER", 1, 0, false);
            declareFunction("sentence_set", "SENTENCE-SET", 3, 0, false);
            declareFunction("sentence_length", "SENTENCE-LENGTH", 1, 0, false);
            declareMacro("sentence_do_constituents", "SENTENCE-DO-CONSTITUENTS");
            declareFunction("sentence_reconstruct_substring", "SENTENCE-RECONSTRUCT-SUBSTRING", 3, 0, false);
            declareFunction("construct_string_from_words", "CONSTRUCT-STRING-FROM-WORDS", 1, 2, false);
            declareFunction("sentence_delete_punctuation", "SENTENCE-DELETE-PUNCTUATION", 1, 0, false);
            declareFunction("sentence_listify", "SENTENCE-LISTIFY", 1, 0, false);
            declareFunction("sentence_stringify", "SENTENCE-STRINGIFY", 1, 0, false);
            declareFunction("build_sentence_token", "BUILD-SENTENCE-TOKEN", 1, 1, false);
            declareFunction("string_sentencify", "STRING-SENTENCIFY", 1, 1, false);
            declareFunction("newline_sentence_p", "NEWLINE-SENTENCE-P", 1, 0, false);
            declareFunction("paragraph_print_function_trampoline", "PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("paragraph_p", "PARAGRAPH-P", 1, 0, false);
            new document.$paragraph_p$UnaryFunction();
            declareFunction("paragraph_sentences", "PARAGRAPH-SENTENCES", 1, 0, false);
            declareFunction("paragraph_mother", "PARAGRAPH-MOTHER", 1, 0, false);
            declareFunction("_csetf_paragraph_sentences", "_CSETF-PARAGRAPH-SENTENCES", 2, 0, false);
            declareFunction("_csetf_paragraph_mother", "_CSETF-PARAGRAPH-MOTHER", 2, 0, false);
            declareFunction("make_paragraph", "MAKE-PARAGRAPH", 0, 1, false);
            declareFunction("visit_defstruct_paragraph", "VISIT-DEFSTRUCT-PARAGRAPH", 2, 0, false);
            declareFunction("visit_defstruct_object_paragraph_method", "VISIT-DEFSTRUCT-OBJECT-PARAGRAPH-METHOD", 2, 0, false);
            declareMacro("paragraph_do_sentences", "PARAGRAPH-DO-SENTENCES");
            declareMacro("paragraph_do_words", "PARAGRAPH-DO-WORDS");
            declareMacro("paragraph_do_minimal_words", "PARAGRAPH-DO-MINIMAL-WORDS");
            declareFunction("new_paragraph", "NEW-PARAGRAPH", 1, 0, false);
            declareFunction("paragraph_print", "PARAGRAPH-PRINT", 3, 0, false);
            declareFunction("paragraph_get", "PARAGRAPH-GET", 2, 0, false);
            declareFunction("paragraph_set", "PARAGRAPH-SET", 3, 0, false);
            declareFunction("paragraph_sentence_length", "PARAGRAPH-SENTENCE-LENGTH", 1, 0, false);
            declareFunction("paragraph_word_length", "PARAGRAPH-WORD-LENGTH", 1, 0, false);
            declareFunction("paragraph_offset", "PARAGRAPH-OFFSET", 1, 0, false);
            declareFunction("paragraph_string", "PARAGRAPH-STRING", 1, 0, false);
            declareFunction("paragraph_to_xml", "PARAGRAPH-TO-XML", 1, 1, false);
            declareFunction("build_paragraph_token", "BUILD-PARAGRAPH-TOKEN", 1, 0, false);
            declareFunction("string_paragraphize", "STRING-PARAGRAPHIZE", 1, 2, false);
            declareFunction("sign_to_xml", "SIGN-TO-XML", 1, 1, false);
            declareFunction("document_print_function_trampoline", "DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("document_p", "DOCUMENT-P", 1, 0, false);
            new document.$document_p$UnaryFunction();
            declareFunction("document_paragraphs", "DOCUMENT-PARAGRAPHS", 1, 0, false);
            declareFunction("_csetf_document_paragraphs", "_CSETF-DOCUMENT-PARAGRAPHS", 2, 0, false);
            declareFunction("make_document", "MAKE-DOCUMENT", 0, 1, false);
            declareFunction("visit_defstruct_document", "VISIT-DEFSTRUCT-DOCUMENT", 2, 0, false);
            declareFunction("visit_defstruct_object_document_method", "VISIT-DEFSTRUCT-OBJECT-DOCUMENT-METHOD", 2, 0, false);
            declareFunction("new_document", "NEW-DOCUMENT", 1, 2, false);
            declareMacro("document_do_paragraphs", "DOCUMENT-DO-PARAGRAPHS");
            declareMacro("document_do_sentences", "DOCUMENT-DO-SENTENCES");
            declareFunction("possibly_perform_document_dot_analysis", "POSSIBLY-PERFORM-DOCUMENT-DOT-ANALYSIS", 1, 0, false);
            declareFunction("document_perform_dot_analysis", "DOCUMENT-PERFORM-DOT-ANALYSIS", 1, 0, false);
            declareFunction("new_document_from_string", "NEW-DOCUMENT-FROM-STRING", 1, 2, false);
            declareFunction("new_document_from_file", "NEW-DOCUMENT-FROM-FILE", 1, 2, false);
            declareFunction("new_document_from_stream", "NEW-DOCUMENT-FROM-STREAM", 1, 2, false);
            declareFunction("document_print", "DOCUMENT-PRINT", 3, 0, false);
            declareFunction("document_get", "DOCUMENT-GET", 2, 0, false);
            declareFunction("document_set", "DOCUMENT-SET", 3, 0, false);
            declareFunction("document_get_sentence", "DOCUMENT-GET-SENTENCE", 2, 0, false);
            declareFunction("document_get_word", "DOCUMENT-GET-WORD", 2, 0, false);
            declareFunction("document_to_xml", "DOCUMENT-TO-XML", 1, 0, false);
            declareFunction("document_paragraph_length", "DOCUMENT-PARAGRAPH-LENGTH", 1, 0, false);
            declareFunction("document_sentence_length", "DOCUMENT-SENTENCE-LENGTH", 1, 0, false);
            declareFunction("document_word_length", "DOCUMENT-WORD-LENGTH", 1, 0, false);
            declareMacro("document_do_minimal_words", "DOCUMENT-DO-MINIMAL-WORDS");
            declareMacro("document_do_words", "DOCUMENT-DO-WORDS");
            declareFunction("document_string", "DOCUMENT-STRING", 1, 0, false);
            declareFunction("new_sentence_iterator", "NEW-SENTENCE-ITERATOR", 1, 0, false);
            declareFunction("new_document_sentence_iterator", "NEW-DOCUMENT-SENTENCE-ITERATOR", 1, 0, false);
            declareFunction("new_paragraph_sentence_iterator", "NEW-PARAGRAPH-SENTENCE-ITERATOR", 1, 0, false);
            declareFunction("new_sentence_sentence_iterator", "NEW-SENTENCE-SENTENCE-ITERATOR", 1, 0, false);
            declareFunction("stream_stringify", "STREAM-STRINGIFY", 1, 0, false);
            declareFunction("alphanumeric_char_or_character_code_p", "ALPHANUMERIC-CHAR-OR-CHARACTER-CODE-P", 1, 0, false);
            declareFunction("alphabetic_char_or_character_code_p", "ALPHABETIC-CHAR-OR-CHARACTER-CODE-P", 1, 0, false);
            declareFunction("latin_alphabetic_character_code_p", "LATIN-ALPHABETIC-CHARACTER-CODE-P", 1, 0, false);
            declareFunction("character_or_character_code_p", "CHARACTER-OR-CHARACTER-CODE-P", 1, 0, false);
            declareFunction("sentencifier_initializedP", "SENTENCIFIER-INITIALIZED?", 0, 0, false);
            declareFunction("initialize_sentencifier", "INITIALIZE-SENTENCIFIER", 0, 0, false);
            declareFunction("finalize_sentencifier", "FINALIZE-SENTENCIFIER", 0, 0, false);
            declareFunction("sentencify_string", "SENTENCIFY-STRING", 1, 0, false);
            declareFunction("sentencify_file", "SENTENCIFY-FILE", 1, 0, false);
            declareFunction("generate_abbreviation_regular_expressions", "GENERATE-ABBREVIATION-REGULAR-EXPRESSIONS", 0, 0, false);
            declareFunction("compile_regular_expression_substitutions", "COMPILE-REGULAR-EXPRESSION-SUBSTITUTIONS", 1, 0, false);
            declareFunction("clean_sentences", "CLEAN-SENTENCES", 1, 0, false);
            declareFunction("document_sentence_countE", "DOCUMENT-SENTENCE-COUNT=", 2, 0, false);
            declareFunction("test_construct_string_from_words", "TEST-CONSTRUCT-STRING-FROM-WORDS", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("string_paragraphize", "STRING-PARAGRAPHIZE", 1, 1, false);
            declareFunction("new_document", "NEW-DOCUMENT", 1, 1, false);
            declareFunction("new_document_from_string", "NEW-DOCUMENT-FROM-STRING", 1, 1, false);
            declareFunction("new_document_from_file", "NEW-DOCUMENT-FROM-FILE", 1, 1, false);
            declareFunction("new_document_from_stream", "NEW-DOCUMENT-FROM-STREAM", 1, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_document_file_Previous() {
        declareFunction("sign_print_function_trampoline", "SIGN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sign_p", "SIGN-P", 1, 0, false);
        new document.$sign_p$UnaryFunction();
        declareFunction("sign_string", "SIGN-STRING", 1, 0, false);
        declareFunction("sign_type", "SIGN-TYPE", 1, 0, false);
        declareFunction("sign_info", "SIGN-INFO", 1, 0, false);
        declareFunction("sign_category", "SIGN-CATEGORY", 1, 0, false);
        declareFunction("sign_constituents", "SIGN-CONSTITUENTS", 1, 0, false);
        declareFunction("sign_offset", "SIGN-OFFSET", 1, 0, false);
        declareFunction("sign_mother", "SIGN-MOTHER", 1, 0, false);
        declareFunction("_csetf_sign_string", "_CSETF-SIGN-STRING", 2, 0, false);
        declareFunction("_csetf_sign_type", "_CSETF-SIGN-TYPE", 2, 0, false);
        declareFunction("_csetf_sign_info", "_CSETF-SIGN-INFO", 2, 0, false);
        declareFunction("_csetf_sign_category", "_CSETF-SIGN-CATEGORY", 2, 0, false);
        declareFunction("_csetf_sign_constituents", "_CSETF-SIGN-CONSTITUENTS", 2, 0, false);
        declareFunction("_csetf_sign_offset", "_CSETF-SIGN-OFFSET", 2, 0, false);
        declareFunction("_csetf_sign_mother", "_CSETF-SIGN-MOTHER", 2, 0, false);
        declareFunction("make_sign", "MAKE-SIGN", 0, 1, false);
        declareFunction("visit_defstruct_sign", "VISIT-DEFSTRUCT-SIGN", 2, 0, false);
        declareFunction("visit_defstruct_object_sign_method", "VISIT-DEFSTRUCT-OBJECT-SIGN-METHOD", 2, 0, false);
        declareFunction("new_sign", "NEW-SIGN", 0, 0, false);
        declareFunction("sxhash_sign", "SXHASH-SIGN", 1, 0, false);
        declareFunction("sxhash_sign_method", "SXHASH-SIGN-METHOD", 1, 0, false);
        declareFunction("sign_print", "SIGN-PRINT", 3, 0, false);
        declareFunction("sign_get", "SIGN-GET", 2, 0, false);
        declareFunction("sign_set", "SIGN-SET", 3, 0, false);
        declareFunction("sign_length", "SIGN-LENGTH", 1, 0, false);
        declareFunction("sign_update", "SIGN-UPDATE", 2, 0, false);
        declareMacro("sign_do_constituents", "SIGN-DO-CONSTITUENTS");
        declareFunction("sign_yield", "SIGN-YIELD", 1, 0, false);
        declareFunction("sign_intervals", "SIGN-INTERVALS", 1, 1, false);
        declareFunction("new_exhaustive_word", "NEW-EXHAUSTIVE-WORD", 0, 1, false);
        declareFunction("new_exhaustive_word_from_word", "NEW-EXHAUSTIVE-WORD-FROM-WORD", 1, 0, false);
        declareFunction("exhaustive_word_p", "EXHAUSTIVE-WORD-P", 1, 0, false);
        declareFunction("new_word", "NEW-WORD", 0, 1, false);
        declareFunction("copy_word", "COPY-WORD", 1, 0, false);
        declareFunction("word_p", "WORD-P", 1, 0, false);
        declareFunction("set_word_string", "SET-WORD-STRING", 2, 0, false);
        declareFunction("word_string", "WORD-STRING", 1, 0, false);
        declareFunction("set_word_category", "SET-WORD-CATEGORY", 2, 0, false);
        declareFunction("word_category", "WORD-CATEGORY", 1, 0, false);
        declareFunction("word_offset", "WORD-OFFSET", 1, 0, false);
        declareFunction("word_length", "WORD-LENGTH", 1, 0, false);
        declareFunction("word_mother", "WORD-MOTHER", 1, 0, false);
        declareFunction("word_info", "WORD-INFO", 1, 0, false);
        declareFunction("word_constituents", "WORD-CONSTITUENTS", 1, 0, false);
        declareFunction("word_interps", "WORD-INTERPS", 1, 0, false);
        declareFunction("word_lex_entries", "WORD-LEX-ENTRIES", 1, 0, false);
        declareFunction("word_cycls", "WORD-CYCLS", 1, 0, false);
        declareFunction("word_cyc_pos", "WORD-CYC-POS", 1, 0, false);
        declareFunction("word_update", "WORD-UPDATE", 2, 0, false);
        declareFunction("word_index", "WORD-INDEX", 1, 0, false);
        declareFunction("word_intervals", "WORD-INTERVALS", 1, 1, false);
        declareFunction("word_capitalize", "WORD-CAPITALIZE", 1, 0, false);
        declareFunction("word_uncapitalize", "WORD-UNCAPITALIZE", 1, 0, false);
        declareFunction("build_word_token", "BUILD-WORD-TOKEN", 1, 0, false);
        declareFunction("stringify", "STRINGIFY", 1, 0, false);
        declareFunction("no_space_before_following_wordP", "NO-SPACE-BEFORE-FOLLOWING-WORD?", 1, 0, false);
        declareFunction("next_word_offset", "NEXT-WORD-OFFSET", 1, 0, false);
        declareFunction("string_tokenize_via_wordify", "STRING-TOKENIZE-VIA-WORDIFY", 1, 0, false);
        declareFunction("string_wordify", "STRING-WORDIFY", 1, 1, false);
        declareFunction("fst_string_wordify", "FST-STRING-WORDIFY", 1, 0, false);
        declareFunction("rkf_standard_string_wordify", "RKF-STANDARD-STRING-WORDIFY", 1, 0, false);
        declareFunction("clear_html_string_wordify_punctuation_chars", "CLEAR-HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
        declareFunction("remove_html_string_wordify_punctuation_chars", "REMOVE-HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
        declareFunction("html_string_wordify_punctuation_chars_internal", "HTML-STRING-WORDIFY-PUNCTUATION-CHARS-INTERNAL", 0, 0, false);
        declareFunction("html_string_wordify_punctuation_chars", "HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
        declareFunction("html_string_wordify_state_print_function_trampoline", "HTML-STRING-WORDIFY-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("html_string_wordify_state_p", "HTML-STRING-WORDIFY-STATE-P", 1, 0, false);
        new document.$html_string_wordify_state_p$UnaryFunction();
        declareFunction("hsw_state_state", "HSW-STATE-STATE", 1, 0, false);
        declareFunction("hsw_state_tag_pieces", "HSW-STATE-TAG-PIECES", 1, 0, false);
        declareFunction("hsw_state_string_pieces", "HSW-STATE-STRING-PIECES", 1, 0, false);
        declareFunction("hsw_state_punctuation_pieces", "HSW-STATE-PUNCTUATION-PIECES", 1, 0, false);
        declareFunction("hsw_state_leading_tags", "HSW-STATE-LEADING-TAGS", 1, 0, false);
        declareFunction("hsw_state_following_tags", "HSW-STATE-FOLLOWING-TAGS", 1, 0, false);
        declareFunction("hsw_state_current_offset", "HSW-STATE-CURRENT-OFFSET", 1, 0, false);
        declareFunction("_csetf_hsw_state_state", "_CSETF-HSW-STATE-STATE", 2, 0, false);
        declareFunction("_csetf_hsw_state_tag_pieces", "_CSETF-HSW-STATE-TAG-PIECES", 2, 0, false);
        declareFunction("_csetf_hsw_state_string_pieces", "_CSETF-HSW-STATE-STRING-PIECES", 2, 0, false);
        declareFunction("_csetf_hsw_state_punctuation_pieces", "_CSETF-HSW-STATE-PUNCTUATION-PIECES", 2, 0, false);
        declareFunction("_csetf_hsw_state_leading_tags", "_CSETF-HSW-STATE-LEADING-TAGS", 2, 0, false);
        declareFunction("_csetf_hsw_state_following_tags", "_CSETF-HSW-STATE-FOLLOWING-TAGS", 2, 0, false);
        declareFunction("_csetf_hsw_state_current_offset", "_CSETF-HSW-STATE-CURRENT-OFFSET", 2, 0, false);
        declareFunction("make_html_string_wordify_state", "MAKE-HTML-STRING-WORDIFY-STATE", 0, 1, false);
        declareFunction("visit_defstruct_html_string_wordify_state", "VISIT-DEFSTRUCT-HTML-STRING-WORDIFY-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_html_string_wordify_state_method", "VISIT-DEFSTRUCT-OBJECT-HTML-STRING-WORDIFY-STATE-METHOD", 2, 0, false);
        declareFunction("print_hsw_state", "PRINT-HSW-STATE", 1, 2, false);
        declareFunction("new_html_string_wordify_state", "NEW-HTML-STRING-WORDIFY-STATE", 0, 0, false);
        declareFunction("classify_html_string_token", "CLASSIFY-HTML-STRING-TOKEN", 2, 0, false);
        declareFunction("html_string_wordify", "HTML-STRING-WORDIFY", 1, 0, false);
        declareFunction("hsw_peek_next_token", "HSW-PEEK-NEXT-TOKEN", 2, 0, false);
        declareFunction("hsw_state_add_string_piece", "HSW-STATE-ADD-STRING-PIECE", 2, 0, false);
        declareFunction("hsw_state_clear_string_pieces", "HSW-STATE-CLEAR-STRING-PIECES", 1, 0, false);
        declareFunction("tag_from_hsw_state", "TAG-FROM-HSW-STATE", 1, 0, false);
        declareFunction("new_word_from_hsw_state", "NEW-WORD-FROM-HSW-STATE", 1, 0, false);
        declareFunction("fst_wordify_test", "FST-WORDIFY-TEST", 2, 0, false);
        declareFunction("string_to_xml", "STRING-TO-XML", 1, 0, false);
        declareFunction("word_to_xml", "WORD-TO-XML", 1, 1, false);
        declareFunction("end_of_sentence_word_p", "END-OF-SENTENCE-WORD-P", 1, 0, false);
        declareFunction("quote_word_p", "QUOTE-WORD-P", 1, 0, false);
        declareFunction("newline_word_p", "NEWLINE-WORD-P", 1, 0, false);
        declareFunction("punctuation_sign_p", "PUNCTUATION-SIGN-P", 1, 0, false);
        declareFunction("sentence_final_punctuation_charP", "SENTENCE-FINAL-PUNCTUATION-CHAR?", 1, 0, false);
        declareFunction("sentence_internal_punctuation_charP", "SENTENCE-INTERNAL-PUNCTUATION-CHAR?", 1, 0, false);
        declareFunction("any_punctuation_charP", "ANY-PUNCTUATION-CHAR?", 1, 0, false);
        declareFunction("quote_charP", "QUOTE-CHAR?", 1, 0, false);
        declareFunction("new_phrase", "NEW-PHRASE", 0, 1, false);
        declareFunction("phrase_p", "PHRASE-P", 1, 0, false);
        declareFunction("phrase_string", "PHRASE-STRING", 1, 0, false);
        declareFunction("phrase_category", "PHRASE-CATEGORY", 1, 0, false);
        declareFunction("phrase_yield", "PHRASE-YIELD", 1, 0, false);
        declareMacro("phrase_do_constituents", "PHRASE-DO-CONSTITUENTS");
        declareFunction("phrase_constituents", "PHRASE-CONSTITUENTS", 1, 0, false);
        declareFunction("phrase_nodes", "PHRASE-NODES", 1, 0, false);
        declareFunction("phrase_intervals", "PHRASE-INTERVALS", 1, 1, false);
        declareFunction("phrase_info", "PHRASE-INFO", 1, 0, false);
        declareFunction("phrase_update", "PHRASE-UPDATE", 2, 0, false);
        declareFunction("phrase_get", "PHRASE-GET", 2, 0, false);
        declareFunction("phrase_set", "PHRASE-SET", 3, 0, false);
        declareFunction("phrase_constituent_length", "PHRASE-CONSTITUENT-LENGTH", 1, 0, false);
        declareFunction("phrase_to_xml", "PHRASE-TO-XML", 1, 1, false);
        declareMacro("sentence_do_words", "SENTENCE-DO-WORDS");
        declareMacro("sentence_do_minimal_words", "SENTENCE-DO-MINIMAL-WORDS");
        declareFunction("new_sentence", "NEW-SENTENCE", 0, 2, false);
        declareFunction("sentence_p", "SENTENCE-P", 1, 0, false);
        declareFunction("sentence_print", "SENTENCE-PRINT", 3, 0, false);
        declareFunction("sentence_string", "SENTENCE-STRING", 1, 0, false);
        declareFunction("sentence_category", "SENTENCE-CATEGORY", 1, 0, false);
        declareFunction("sentence_yield", "SENTENCE-YIELD", 1, 0, false);
        declareFunction("sentence_yield_exhaustive", "SENTENCE-YIELD-EXHAUSTIVE", 1, 0, false);
        declareFunction("sentence_constituents", "SENTENCE-CONSTITUENTS", 1, 0, false);
        declareFunction("sentence_info", "SENTENCE-INFO", 1, 0, false);
        declareFunction("sentence_offset", "SENTENCE-OFFSET", 1, 0, false);
        declareFunction("sentence_index", "SENTENCE-INDEX", 1, 0, false);
        declareFunction("sentence_get", "SENTENCE-GET", 2, 0, false);
        declareFunction("sentence_mother", "SENTENCE-MOTHER", 1, 0, false);
        declareFunction("sentence_set", "SENTENCE-SET", 3, 0, false);
        declareFunction("sentence_length", "SENTENCE-LENGTH", 1, 0, false);
        declareMacro("sentence_do_constituents", "SENTENCE-DO-CONSTITUENTS");
        declareFunction("sentence_reconstruct_substring", "SENTENCE-RECONSTRUCT-SUBSTRING", 3, 0, false);
        declareFunction("construct_string_from_words", "CONSTRUCT-STRING-FROM-WORDS", 1, 2, false);
        declareFunction("sentence_delete_punctuation", "SENTENCE-DELETE-PUNCTUATION", 1, 0, false);
        declareFunction("sentence_listify", "SENTENCE-LISTIFY", 1, 0, false);
        declareFunction("sentence_stringify", "SENTENCE-STRINGIFY", 1, 0, false);
        declareFunction("build_sentence_token", "BUILD-SENTENCE-TOKEN", 1, 1, false);
        declareFunction("string_sentencify", "STRING-SENTENCIFY", 1, 1, false);
        declareFunction("newline_sentence_p", "NEWLINE-SENTENCE-P", 1, 0, false);
        declareFunction("paragraph_print_function_trampoline", "PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("paragraph_p", "PARAGRAPH-P", 1, 0, false);
        new document.$paragraph_p$UnaryFunction();
        declareFunction("paragraph_sentences", "PARAGRAPH-SENTENCES", 1, 0, false);
        declareFunction("paragraph_mother", "PARAGRAPH-MOTHER", 1, 0, false);
        declareFunction("_csetf_paragraph_sentences", "_CSETF-PARAGRAPH-SENTENCES", 2, 0, false);
        declareFunction("_csetf_paragraph_mother", "_CSETF-PARAGRAPH-MOTHER", 2, 0, false);
        declareFunction("make_paragraph", "MAKE-PARAGRAPH", 0, 1, false);
        declareFunction("visit_defstruct_paragraph", "VISIT-DEFSTRUCT-PARAGRAPH", 2, 0, false);
        declareFunction("visit_defstruct_object_paragraph_method", "VISIT-DEFSTRUCT-OBJECT-PARAGRAPH-METHOD", 2, 0, false);
        declareMacro("paragraph_do_sentences", "PARAGRAPH-DO-SENTENCES");
        declareMacro("paragraph_do_words", "PARAGRAPH-DO-WORDS");
        declareMacro("paragraph_do_minimal_words", "PARAGRAPH-DO-MINIMAL-WORDS");
        declareFunction("new_paragraph", "NEW-PARAGRAPH", 1, 0, false);
        declareFunction("paragraph_print", "PARAGRAPH-PRINT", 3, 0, false);
        declareFunction("paragraph_get", "PARAGRAPH-GET", 2, 0, false);
        declareFunction("paragraph_set", "PARAGRAPH-SET", 3, 0, false);
        declareFunction("paragraph_sentence_length", "PARAGRAPH-SENTENCE-LENGTH", 1, 0, false);
        declareFunction("paragraph_word_length", "PARAGRAPH-WORD-LENGTH", 1, 0, false);
        declareFunction("paragraph_offset", "PARAGRAPH-OFFSET", 1, 0, false);
        declareFunction("paragraph_string", "PARAGRAPH-STRING", 1, 0, false);
        declareFunction("paragraph_to_xml", "PARAGRAPH-TO-XML", 1, 1, false);
        declareFunction("build_paragraph_token", "BUILD-PARAGRAPH-TOKEN", 1, 0, false);
        declareFunction("string_paragraphize", "STRING-PARAGRAPHIZE", 1, 2, false);
        declareFunction("sign_to_xml", "SIGN-TO-XML", 1, 1, false);
        declareFunction("document_print_function_trampoline", "DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("document_p", "DOCUMENT-P", 1, 0, false);
        new document.$document_p$UnaryFunction();
        declareFunction("document_paragraphs", "DOCUMENT-PARAGRAPHS", 1, 0, false);
        declareFunction("_csetf_document_paragraphs", "_CSETF-DOCUMENT-PARAGRAPHS", 2, 0, false);
        declareFunction("make_document", "MAKE-DOCUMENT", 0, 1, false);
        declareFunction("visit_defstruct_document", "VISIT-DEFSTRUCT-DOCUMENT", 2, 0, false);
        declareFunction("visit_defstruct_object_document_method", "VISIT-DEFSTRUCT-OBJECT-DOCUMENT-METHOD", 2, 0, false);
        declareFunction("new_document", "NEW-DOCUMENT", 1, 2, false);
        declareMacro("document_do_paragraphs", "DOCUMENT-DO-PARAGRAPHS");
        declareMacro("document_do_sentences", "DOCUMENT-DO-SENTENCES");
        declareFunction("possibly_perform_document_dot_analysis", "POSSIBLY-PERFORM-DOCUMENT-DOT-ANALYSIS", 1, 0, false);
        declareFunction("document_perform_dot_analysis", "DOCUMENT-PERFORM-DOT-ANALYSIS", 1, 0, false);
        declareFunction("new_document_from_string", "NEW-DOCUMENT-FROM-STRING", 1, 2, false);
        declareFunction("new_document_from_file", "NEW-DOCUMENT-FROM-FILE", 1, 2, false);
        declareFunction("new_document_from_stream", "NEW-DOCUMENT-FROM-STREAM", 1, 2, false);
        declareFunction("document_print", "DOCUMENT-PRINT", 3, 0, false);
        declareFunction("document_get", "DOCUMENT-GET", 2, 0, false);
        declareFunction("document_set", "DOCUMENT-SET", 3, 0, false);
        declareFunction("document_get_sentence", "DOCUMENT-GET-SENTENCE", 2, 0, false);
        declareFunction("document_get_word", "DOCUMENT-GET-WORD", 2, 0, false);
        declareFunction("document_to_xml", "DOCUMENT-TO-XML", 1, 0, false);
        declareFunction("document_paragraph_length", "DOCUMENT-PARAGRAPH-LENGTH", 1, 0, false);
        declareFunction("document_sentence_length", "DOCUMENT-SENTENCE-LENGTH", 1, 0, false);
        declareFunction("document_word_length", "DOCUMENT-WORD-LENGTH", 1, 0, false);
        declareMacro("document_do_minimal_words", "DOCUMENT-DO-MINIMAL-WORDS");
        declareMacro("document_do_words", "DOCUMENT-DO-WORDS");
        declareFunction("document_string", "DOCUMENT-STRING", 1, 0, false);
        declareFunction("new_sentence_iterator", "NEW-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction("new_document_sentence_iterator", "NEW-DOCUMENT-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction("new_paragraph_sentence_iterator", "NEW-PARAGRAPH-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction("new_sentence_sentence_iterator", "NEW-SENTENCE-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction("stream_stringify", "STREAM-STRINGIFY", 1, 0, false);
        declareFunction("alphanumeric_char_or_character_code_p", "ALPHANUMERIC-CHAR-OR-CHARACTER-CODE-P", 1, 0, false);
        declareFunction("alphabetic_char_or_character_code_p", "ALPHABETIC-CHAR-OR-CHARACTER-CODE-P", 1, 0, false);
        declareFunction("latin_alphabetic_character_code_p", "LATIN-ALPHABETIC-CHARACTER-CODE-P", 1, 0, false);
        declareFunction("character_or_character_code_p", "CHARACTER-OR-CHARACTER-CODE-P", 1, 0, false);
        declareFunction("sentencifier_initializedP", "SENTENCIFIER-INITIALIZED?", 0, 0, false);
        declareFunction("initialize_sentencifier", "INITIALIZE-SENTENCIFIER", 0, 0, false);
        declareFunction("finalize_sentencifier", "FINALIZE-SENTENCIFIER", 0, 0, false);
        declareFunction("sentencify_string", "SENTENCIFY-STRING", 1, 0, false);
        declareFunction("sentencify_file", "SENTENCIFY-FILE", 1, 0, false);
        declareFunction("generate_abbreviation_regular_expressions", "GENERATE-ABBREVIATION-REGULAR-EXPRESSIONS", 0, 0, false);
        declareFunction("compile_regular_expression_substitutions", "COMPILE-REGULAR-EXPRESSION-SUBSTITUTIONS", 1, 0, false);
        declareFunction("clean_sentences", "CLEAN-SENTENCES", 1, 0, false);
        declareFunction("document_sentence_countE", "DOCUMENT-SENTENCE-COUNT=", 2, 0, false);
        declareFunction("test_construct_string_from_words", "TEST-CONSTRUCT-STRING-FROM-WORDS", 1, 1, false);
        return NIL;
    }

    static private final SubLString $str_alt128$_a_PHR_a__a_a_a__PHR__a = makeString("~a<PHR~a>~a~a~a</PHR>~a");

    static private final SubLString $str_alt129$_cat__ = makeString(" cat=\"");

    static private final SubLList $list_alt130 = list(list(makeSymbol("WORD"), makeSymbol("SENTENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt133 = list(makeKeyword("OFFSET"), ZERO_INTEGER);

    static private final SubLList $list_alt135 = list(list(makeSymbol("CONSTITUENT"), makeSymbol("SENTENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt140 = list(makeSymbol("SENTENCES"), makeSymbol("MOTHER"));

    static private final SubLList $list_alt141 = list(makeKeyword("SENTENCES"), makeKeyword("MOTHER"));

    static private final SubLList $list_alt142 = list(makeSymbol("PARAGRAPH-SENTENCES"), makeSymbol("PARAGRAPH-MOTHER"));

    static private final SubLList $list_alt143 = list(makeSymbol("_CSETF-PARAGRAPH-SENTENCES"), makeSymbol("_CSETF-PARAGRAPH-MOTHER"));

    static private final SubLList $list_alt151 = list(list(makeSymbol("SENTENCE"), makeSymbol("PARAGRAPH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt152 = list(list(makeSymbol("WORD"), makeSymbol("PARAGRAPH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym153$SENTENCE = makeUninternedSymbol("SENTENCE");

    static private final SubLString $str_alt156$__PAR_ = makeString("#<PAR:");

    static private final SubLString $str_alt157$_PAR_ = makeString("<PAR>");

    static private final SubLString $str_alt158$__PAR_ = makeString("</PAR>");

    static private final SubLList $list_alt161 = list(makeSymbol("PARAGRAPHS"));

    static private final SubLList $list_alt162 = list(makeKeyword("PARAGRAPHS"));

    static private final SubLList $list_alt163 = list(makeSymbol("DOCUMENT-PARAGRAPHS"));

    static private final SubLList $list_alt164 = list(makeSymbol("_CSETF-DOCUMENT-PARAGRAPHS"));

    static private final SubLList $list_alt170 = list(list(makeSymbol("PARAGRAPH"), makeSymbol("DOCUMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt171 = list(list(makeSymbol("SENTENCE"), makeSymbol("DOCUMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym172$PARAGRAPH = makeUninternedSymbol("PARAGRAPH");

    static private final SubLString $str_alt175$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt177$__DOC_ = makeString("#<DOC:");

    static private final SubLString $str_alt178$Sentence_index__A_out_of_bounds_ = makeString("Sentence index ~A out of bounds.");

    static private final SubLString $str_alt179$_DOC_ = makeString("<DOC>");

    static private final SubLString $str_alt180$__DOC_ = makeString("</DOC>");

    static private final SubLList $list_alt181 = list(list(makeSymbol("WORD"), makeSymbol("DOCUMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym182$SENTENCE = makeUninternedSymbol("SENTENCE");

    static private final SubLString $str_alt184$can_t_create_sentence_iterator_fo = makeString("can't create sentence iterator for ~a");

    static private final SubLList $list_alt186 = list(TWO_INTEGER);

    static private final SubLList $list_alt187 = list(ZERO_INTEGER, CHAR_newline, list($EMIT), TWO_INTEGER);

    static private final SubLList $list_alt189 = list(NIL, ZERO_INTEGER);

    static private final SubLList $list_alt190 = list(ZERO_INTEGER, CHAR_M, list($EMIT), ELEVEN_INTEGER);

    static private final SubLList $list_alt191 = list(ZERO_INTEGER, CHAR_D, list($EMIT), FOURTEEN_INTEGER);

    static private final SubLList $list_alt192 = list(ZERO_INTEGER, CHAR_P, list($EMIT), SIXTEEN_INTEGER);

    static private final SubLList $list_alt193 = list(ZERO_INTEGER, CHAR_L, list($EMIT), NINETEEN_INTEGER);

    static private final SubLList $list_alt194 = list(ZERO_INTEGER, CHAR_n, list($EMIT), makeInteger(30));

    static private final SubLList $list_alt195 = list(ZERO_INTEGER, CHAR_w, list($EMIT), makeInteger(32));

    static private final SubLList $list_alt196 = list(ZERO_INTEGER, CHAR_h, list($EMIT), makeInteger(33));

    static private final SubLList $list_alt197 = list(ZERO_INTEGER, CHAR_c, list($EMIT), makeInteger(36));

    static private final SubLList $list_alt198 = list(ZERO_INTEGER, CHAR_i, list($EMIT), makeInteger(40));

    static private final SubLList $list_alt199 = list(ZERO_INTEGER, CHAR_a, list($EMIT), makeInteger(48));

    static private final SubLList $list_alt201 = list(list($EMIT), ONE_INTEGER);

    static private final SubLList $list_alt203 = list(list($EMIT), makeInteger(44));

    static private final SubLList $list_alt204 = list(ZERO_INTEGER, CHAR_hyphen, list($EMIT), NINE_INTEGER);

    static private final SubLList $list_alt205 = list(ZERO_INTEGER, CHAR_underbar, list($EMIT), NINE_INTEGER);

    static private final SubLList $list_alt206 = list(ZERO_INTEGER, CHAR_quote, list($EMIT), TWENTY_INTEGER);

    static private final SubLList $list_alt207 = list(ZERO_INTEGER, CHAR_quotation, list($EMIT), TWO_INTEGER);

    static private final SubLSymbol $sym208$ANY_PUNCTUATION_CHAR_ = makeSymbol("ANY-PUNCTUATION-CHAR?");

    static private final SubLList $list_alt209 = list(list($EMIT), TWO_INTEGER);

    static private final SubLSymbol $sym210$SENTENCE_INTERNAL_PUNCTUATION_CHAR_ = makeSymbol("SENTENCE-INTERNAL-PUNCTUATION-CHAR?");

    static private final SubLList $list_alt213 = list(list($EMIT), makeInteger(51));

    static private final SubLList $list_alt215 = list(ONE_INTEGER, CHAR_period, list(makeKeyword("REMEMBER")), THREE_INTEGER);

    static private final SubLList $list_alt216 = list(ONE_INTEGER, CHAR_newline, list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list_alt217 = list(NIL, TWO_INTEGER);

    static private final SubLList $list_alt218 = list(ONE_INTEGER, CHAR_hyphen, list(makeKeyword("REMEMBER")), EIGHT_INTEGER);

    static private final SubLList $list_alt219 = list(list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLSymbol $sym220$QUOTE_CHAR_ = makeSymbol("QUOTE-CHAR?");

    static private final SubLList $list_alt221 = list(ONE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt222 = list(list(makeKeyword("BACKUP")), FIVE_INTEGER);

    static private final SubLList $list_alt223 = list(THREE_INTEGER, makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list_alt224 = list(NIL, FOUR_INTEGER);

    static private final SubLList $list_alt225 = list(list(makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLSymbol LOWER_CASE_P = makeSymbol("LOWER-CASE-P");

    static private final SubLList $list_alt227 = list(list(makeKeyword("BACKUP")), SIX_INTEGER);

    static private final SubLList $list_alt228 = list(FOUR_INTEGER, makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLSymbol $sym229$SENTENCE_FINAL_PUNCTUATION_CHAR_ = makeSymbol("SENTENCE-FINAL-PUNCTUATION-CHAR?");

    static private final SubLList $list_alt230 = list(FIVE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt231 = list(SIX_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt232 = list(EIGHT_INTEGER, CHAR_hyphen, list(makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list_alt233 = list(list(makeKeyword("BACKUP")), TEN_INTEGER);

    static private final SubLList $list_alt234 = list(EIGHT_INTEGER, makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list_alt235 = list(NINE_INTEGER, CHAR_hyphen, list($EMIT), NINE_INTEGER);

    static private final SubLList $list_alt236 = list(NINE_INTEGER, CHAR_underbar, list($EMIT), NINE_INTEGER);

    static private final SubLList $list_alt237 = list(NINE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt238 = list(ELEVEN_INTEGER, CHAR_s, list($EMIT), THIRTEEN_INTEGER);

    static private final SubLList $list_alt239 = list(ELEVEN_INTEGER, CHAR_r, list($EMIT), TWELVE_INTEGER);

    static private final SubLList $list_alt240 = list(list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), ONE_INTEGER);

    static private final SubLList $list_alt241 = list(ELEVEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt242 = list(TWELVE_INTEGER, CHAR_s, list($EMIT), THIRTEEN_INTEGER);

    static private final SubLList $list_alt243 = list(TWELVE_INTEGER, CHAR_period, list($EMIT), ONE_INTEGER);

    static private final SubLList $list_alt244 = list(TWELVE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt245 = list(THIRTEEN_INTEGER, CHAR_period, list($EMIT), ONE_INTEGER);

    static private final SubLList $list_alt246 = list(THIRTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt247 = list(FOURTEEN_INTEGER, CHAR_r, list($EMIT), FIFTEEN_INTEGER);

    static private final SubLList $list_alt248 = list(FOURTEEN_INTEGER, CHAR_o, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt249 = list(FOURTEEN_INTEGER, CHAR_i, list($EMIT), makeInteger(24));

    static private final SubLList $list_alt250 = list(FOURTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt251 = list(FIFTEEN_INTEGER, CHAR_period, list($EMIT), ONE_INTEGER);

    static private final SubLList $list_alt252 = list(FIFTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt253 = list(SIXTEEN_INTEGER, CHAR_r, list($EMIT), SEVENTEEN_INTEGER);

    static private final SubLList $list_alt254 = list(SIXTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt255 = list(SEVENTEEN_INTEGER, CHAR_o, list($EMIT), EIGHTEEN_INTEGER);

    static private final SubLList $list_alt256 = list(SEVENTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt257 = list(EIGHTEEN_INTEGER, CHAR_f, list($EMIT), FIFTEEN_INTEGER);

    static private final SubLList $list_alt258 = list(EIGHTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt259 = list(NINETEEN_INTEGER, CHAR_t, list($EMIT), THIRTEEN_INTEGER);

    static private final SubLList $list_alt260 = list(NINETEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt261 = list(TWENTY_INTEGER, CHAR_t, list($EMIT), makeInteger(21));

    static private final SubLList $list_alt262 = list(TWENTY_INTEGER, CHAR_m, list($EMIT), makeInteger(21));

    static private final SubLList $list_alt263 = list(TWENTY_INTEGER, CHAR_d, list($EMIT), makeInteger(21));

    static private final SubLList $list_alt264 = list(TWENTY_INTEGER, CHAR_s, list($EMIT), makeInteger(21));

    static private final SubLList $list_alt265 = list(TWENTY_INTEGER, CHAR_r, list($EMIT), makeInteger(22));

    static private final SubLList $list_alt266 = list(TWENTY_INTEGER, CHAR_l, list($EMIT), makeInteger(23));

    static private final SubLList $list_alt267 = list(TWENTY_INTEGER, CHAR_v, list($EMIT), makeInteger(47));

    static private final SubLList $list_alt268 = list(TWENTY_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt269 = list(makeInteger(21), CHAR_newline, list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list_alt271 = list(makeInteger(21), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt272 = list(makeInteger(22), CHAR_e, list($EMIT), makeInteger(21));

    static private final SubLList $list_alt274 = list(makeInteger(22), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt275 = list(makeInteger(23), CHAR_l, list($EMIT), makeInteger(21));

    static private final SubLList $list_alt277 = list(makeInteger(23), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt278 = list(makeInteger(24), CHAR_d, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt280 = list(makeInteger(24), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt281 = list(makeInteger(25), CHAR_e, list($EMIT), makeInteger(26));

    static private final SubLList $list_alt282 = list(makeInteger(25), CHAR_n, list(makeKeyword("REMEMBER")), makeInteger(27));

    static private final SubLList $list_alt284 = list(makeInteger(25), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt285 = list(makeInteger(26), CHAR_s, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt287 = list(makeInteger(26), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt288 = list(makeInteger(27), CHAR_quote, NIL, makeInteger(28));

    static private final SubLList $list_alt290 = list(list(makeKeyword("BACKUP")), ONE_INTEGER);

    static private final SubLList $list_alt291 = list(makeInteger(27), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt292 = list(makeInteger(28), CHAR_t, list(makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list_alt294 = list(list(makeKeyword("BACKUP")), makeInteger(29));

    static private final SubLList $list_alt295 = list(makeInteger(28), makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list_alt297 = list(makeInteger(30), CHAR_quote, list($EMIT), makeInteger(31));

    static private final SubLList $list_alt299 = list(makeInteger(30), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt300 = list(makeInteger(31), CHAR_t, list($EMIT), TWO_INTEGER);

    static private final SubLList $list_alt302 = list(makeInteger(31), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt303 = list(makeInteger(32), CHAR_o, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt304 = list(makeInteger(32), CHAR_a, list($EMIT), makeInteger(41));

    static private final SubLList $list_alt305 = list(makeInteger(32), CHAR_e, list($EMIT), makeInteger(42));

    static private final SubLList $list_alt307 = list(makeInteger(32), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt308 = list(makeInteger(33), CHAR_a, list($EMIT), makeInteger(34));

    static private final SubLList $list_alt310 = list(makeInteger(33), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt311 = list(makeInteger(34), CHAR_d, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt312 = list(makeInteger(34), CHAR_s, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt313 = list(makeInteger(34), CHAR_v, list($EMIT), makeInteger(35));

    public static final SubLObject init_document_file_alt() {
        defparameter("*TEXT-CLASS-PRINT-LENGTH*", TEN_INTEGER);
        defconstant("*XML-INDENT-LEVEL*", THREE_INTEGER);
        defconstant("*XML-INDENT*", Strings.make_string($xml_indent_level$.getGlobalValue(), CHAR_space));
        defconstant("*NEWLINE*", Strings.make_string(ONE_INTEGER, CHAR_newline));
        defconstant("*XML-STRING-MAPPING*", $list_alt0);
        defconstant("*DTP-SIGN*", SIGN);
        defparameter("*WORDIFIER*", RKF_STANDARD_STRING_WORDIFY);
        deflexical("*HTML-STRING-WORDIFY-PUNCTUATION-CHARS-CACHING-STATE*", NIL);
        defconstant("*DTP-HTML-STRING-WORDIFY-STATE*", HTML_STRING_WORDIFY_STATE);
        defconstant("*DTP-PARAGRAPH*", PARAGRAPH);
        defconstant("*DTP-DOCUMENT*", DOCUMENT);
        defparameter("*WORDIFIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt186, list(new SubLObject[]{ $list_alt187, listS(ZERO_INTEGER, symbol_function(WHITESPACEP), $list_alt189), $list_alt190, $list_alt191, $list_alt192, $list_alt193, $list_alt194, $list_alt195, $list_alt196, $list_alt197, $list_alt198, $list_alt199, listS(ZERO_INTEGER, symbol_function(ALPHA_CHAR_P), $list_alt201), listS(ZERO_INTEGER, symbol_function(DIGIT_CHAR_P), $list_alt203), $list_alt204, $list_alt205, $list_alt206, $list_alt207, listS(ZERO_INTEGER, symbol_function($sym208$ANY_PUNCTUATION_CHAR_), $list_alt209), listS(ZERO_INTEGER, symbol_function($sym210$SENTENCE_INTERNAL_PUNCTUATION_CHAR_), $list_alt201), listS(ZERO_INTEGER, symbol_function(CHARACTERP), $list_alt209), listS(ONE_INTEGER, symbol_function(UPPER_CASE_P), $list_alt213), listS(ONE_INTEGER, symbol_function(ALPHANUMERICP), $list_alt201), $list_alt215, $list_alt216, listS(ONE_INTEGER, symbol_function(WHITESPACEP), $list_alt217), $list_alt218, listS(ONE_INTEGER, symbol_function($sym208$ANY_PUNCTUATION_CHAR_), $list_alt219), listS(ONE_INTEGER, symbol_function($sym220$QUOTE_CHAR_), $list_alt219), $list_alt221, listS(ONE_INTEGER, symbol_function(CHARACTERP), $list_alt219), listS(THREE_INTEGER, symbol_function(ALPHANUMERICP), $list_alt222), $list_alt223, listS(THREE_INTEGER, symbol_function(CHARACTERP), $list_alt224), listS(FOUR_INTEGER, symbol_function(UPPER_CASE_P), $list_alt225), listS(FOUR_INTEGER, symbol_function(LOWER_CASE_P), $list_alt227), $list_alt228, listS(FOUR_INTEGER, symbol_function(CHARACTERP), $list_alt224), listS(FIVE_INTEGER, symbol_function($sym229$SENTENCE_FINAL_PUNCTUATION_CHAR_), $list_alt201), $list_alt230, listS(SIX_INTEGER, symbol_function($sym229$SENTENCE_FINAL_PUNCTUATION_CHAR_), $list_alt209), $list_alt231, $list_alt232, listS(EIGHT_INTEGER, symbol_function(CHARACTERP), $list_alt233), $list_alt234, $list_alt235, $list_alt236, listS(NINE_INTEGER, symbol_function(CHARACTERP), $list_alt219), $list_alt237, listS(TEN_INTEGER, symbol_function(CHARACTERP), $list_alt201), $list_alt238, $list_alt239, listS(ELEVEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt241, $list_alt242, $list_alt243, listS(TWELVE_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt244, $list_alt245, listS(THIRTEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt246, $list_alt247, $list_alt248, $list_alt249, listS(FOURTEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt250, $list_alt251, listS(FIFTEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt252, $list_alt253, listS(SIXTEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt254, $list_alt255, listS(SEVENTEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt256, $list_alt257, listS(EIGHTEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt258, $list_alt259, listS(NINETEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt260, $list_alt261, $list_alt262, $list_alt263, $list_alt264, $list_alt265, $list_alt266, $list_alt267, listS(TWENTY_INTEGER, symbol_function(CHARACTERP), $list_alt219), $list_alt268, $list_alt269, listS($int$21, symbol_function(WHITESPACEP), $list_alt217), listS($int$21, symbol_function(CHARACTERP), $list_alt201), $list_alt271, $list_alt272, listS($int$22, symbol_function(WHITESPACEP), $list_alt217), listS($int$22, symbol_function(CHARACTERP), $list_alt201), $list_alt274, $list_alt275, listS($int$23, symbol_function(CHARACTERP), $list_alt201), $list_alt277, $list_alt278, listS($int$24, symbol_function(CHARACTERP), $list_alt240), $list_alt280, $list_alt281, $list_alt282, listS($int$25, symbol_function(CHARACTERP), $list_alt240), $list_alt284, $list_alt285, listS($int$26, symbol_function(CHARACTERP), $list_alt240), $list_alt287, $list_alt288, listS($int$27, symbol_function(CHARACTERP), $list_alt290), $list_alt291, $list_alt292, listS($int$28, symbol_function(CHARACTERP), $list_alt294), $list_alt295, listS($int$29, symbol_function(CHARACTERP), $list_alt209), $list_alt260, $list_alt297, listS($int$30, symbol_function(CHARACTERP), $list_alt240), $list_alt299, $list_alt300, listS($int$31, symbol_function(CHARACTERP), $list_alt240), $list_alt302, $list_alt303, $list_alt304, $list_alt305, listS($int$32, symbol_function(CHARACTERP), $list_alt240), $list_alt307, $list_alt308, listS($int$33, symbol_function(CHARACTERP), $list_alt240), $list_alt310, $list_alt311, $list_alt312, $list_alt313, listS($int$34, symbol_function(CHARACTERP), $list_alt240), $list_alt315, $list_alt316, listS($int$35, symbol_function(CHARACTERP), $list_alt240), $list_alt318, $list_alt319, $list_alt320, listS($int$36, symbol_function(CHARACTERP), $list_alt240), $list_alt322, $list_alt323, listS($int$37, symbol_function(CHARACTERP), $list_alt240), $list_alt325, $list_alt326, listS($int$38, symbol_function(CHARACTERP), $list_alt240), $list_alt328, $list_alt329, listS($int$39, symbol_function(CHARACTERP), $list_alt240), $list_alt331, $list_alt332, listS($int$40, symbol_function(CHARACTERP), $list_alt240), $list_alt334, $list_alt335, listS($int$41, symbol_function(CHARACTERP), $list_alt240), $list_alt337, $list_alt338, listS($int$42, symbol_function(CHARACTERP), $list_alt240), $list_alt340, $list_alt341, listS($int$43, symbol_function(CHARACTERP), $list_alt240), $list_alt343, listS($int$44, symbol_function(DIGIT_CHAR_P), $list_alt203), $list_alt345, $list_alt346, listS($int$44, symbol_function(CHARACTERP), $list_alt240), $list_alt347, listS($int$45, symbol_function(DIGIT_CHAR_P), $list_alt349), listS($int$45, symbol_function(CHARACTERP), $list_alt350), $list_alt351, $list_alt352, listS($int$46, symbol_function(CHARACTERP), $list_alt209), $list_alt354, $list_alt355, $list_alt356, $list_alt357, listS($int$48, symbol_function(CHARACTERP), $list_alt240), $list_alt359, listS($int$49, symbol_function(DIGIT_CHAR_P), $list_alt361), listS($int$49, symbol_function(WHITESPACEP), $list_alt225), listS($int$49, symbol_function($sym220$QUOTE_CHAR_), $list_alt225), listS($int$50, symbol_function(CHARACTERP), $list_alt203), listS($int$51, symbol_function(ALPHANUMERICP), $list_alt201), $list_alt364, $list_alt365, listS($int$51, symbol_function(WHITESPACEP), $list_alt217), $list_alt366, listS($int$51, symbol_function($sym208$ANY_PUNCTUATION_CHAR_), $list_alt219), listS($int$51, symbol_function($sym220$QUOTE_CHAR_), $list_alt219), $list_alt367, listS($int$51, symbol_function(CHARACTERP), $list_alt219) }), BUILD_WORD_TOKEN));
        defparameter("*SENTENCIFIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt186, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function(NEWLINE_WORD_P), $list_alt209), listS(ZERO_INTEGER, symbol_function(END_OF_SENTENCE_WORD_P), $list_alt209), listS(ZERO_INTEGER, symbol_function(WORD_P), $list_alt201), listS(ONE_INTEGER, symbol_function(NEWLINE_WORD_P), $list_alt371), listS(ONE_INTEGER, symbol_function(END_OF_SENTENCE_WORD_P), $list_alt372), listS(ONE_INTEGER, symbol_function(WORD_P), $list_alt201), $list_alt221, listS(THREE_INTEGER, symbol_function(NEWLINE_WORD_P), $list_alt225), $list_alt373, listS(THREE_INTEGER, symbol_function(WORD_P), $list_alt201), listS(FOUR_INTEGER, symbol_function(QUOTE_WORD_P), $list_alt209), $list_alt375, listS(FOUR_INTEGER, symbol_function(WORD_P), $list_alt219) }), BUILD_SENTENCE_TOKEN));
        defparameter("*PARAGRAPHIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt186, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list_alt378), $list_alt379, listS(ZERO_INTEGER, symbol_function(SENTENCE_P), $list_alt380), listS(ONE_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list_alt381), $list_alt221, listS(ONE_INTEGER, symbol_function(SENTENCE_P), $list_alt380), listS(THREE_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list_alt381), $list_alt373, listS(THREE_INTEGER, symbol_function(SENTENCE_P), $list_alt219) }), BUILD_PARAGRAPH_TOKEN));
        defparameter("*EOS-CHAR*", CHAR_escape);
        defparameter("*EOS*", format(NIL, $str_alt383$_C, $eos_char$.getDynamicValue()));
        defparameter("*P*", $str_alt384$______);
        defparameter("*AP*", $str_alt385$____________________);
        defparameter("*PAP*", cconcatenate($p$.getDynamicValue(), $ap$.getDynamicValue()));
        defparameter("*PEOPLE*", $list_alt386);
        defparameter("*ARMY*", $list_alt387);
        defparameter("*COMPANIES*", $list_alt388);
        defparameter("*PLACES*", list(new SubLObject[]{ $$$arc, $$$al, $$$ave, $str_alt392$blv_d, $$$cl, $$$ct, $$$cres, $$$dr, $str_alt397$expy_, $$$dist, $$$mt, $$$ft, $str_alt401$fw_y, $str_alt402$hwa_y, $$$la, $str_alt404$pde_, $$$pl, $$$plz, $$$rd, $$$st, $$$tce, $$$Ala, $$$Ariz, $$$Ark, $$$Cal, $$$Calif, $$$Col, $$$Colo, $$$Conn, $$$Del, $$$Fed, $$$Fla, $$$Ga, $$$Ida, $$$Id, $$$Ill, $$$Ind, $$$Ia, $$$Kan, $$$Kans, $$$Ken, $$$Ky, $$$La, $$$Me, $$$Md, $$$Is, $$$Mass, $$$Mich, $$$Minn, $$$Miss, $$$Mo, $$$Mont, $$$Neb, $$$Nebr, $$$Nev, $$$Mex, $$$Okla, $$$Ok, $$$Ore, $$$Penna, $$$Penn, $$$Pa, $$$Dak, $$$Tenn, $$$Tex, $$$Ut, $$$Vt, $$$Va, $$$Wash, $$$Wis, $$$Wisc, $$$Wy, $$$Wyo, $$$USAFA, $$$Alta, $$$Man, $$$Ont, $$$Sask, $$$Yuk }));
        defparameter("*MONTHS*", $list_alt468);
        defparameter("*MISC*", $list_alt469);
        defparameter("*ABBREVIATIONS*", append(new SubLObject[]{ $people$.getDynamicValue(), $army$.getDynamicValue(), $companies$.getDynamicValue(), $places$.getDynamicValue(), $months$.getDynamicValue(), $misc$.getDynamicValue() }));
        defparameter("*MARK-EOS-REGULAR-EXPRESSIONS*", list(list($str_alt470$_n_s__n, $eos$.getDynamicValue(), NIL), list(cconcatenate($str_alt35$_, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str_alt471$_s_ }), cconcatenate($str_alt472$_1, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), NIL), list(cconcatenate($str_alt473$__s_w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str_alt36$_ }), cconcatenate($str_alt472$_1, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), NIL)));
        defparameter("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS1*", list(list(cconcatenate($str_alt474$_____w__w, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str_alt471$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str_alt472$_1, NIL), list(cconcatenate($str_alt474$_____w__w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str_alt36$_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str_alt472$_1, NIL), list(cconcatenate($str_alt475$__s_w___s__, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), $str_alt472$_1, NIL), list(cconcatenate($str_alt476$_________, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt477$____lower____ }), $str_alt478$_1_2, NIL), list(cconcatenate($str_alt479$_____, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str_alt480$_____s__, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str_alt472$_1, NIL)));
        defparameter("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS2*", list(list(cconcatenate($str_alt481$______s__, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt482$__s____lower____ }), $str_alt478$_1_2, NIL), list(cconcatenate($str_alt483$__s___s_, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt484$__s__ }), $str_alt478$_1_2, NIL), list(cconcatenate($str_alt485$__s, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str_alt471$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str_alt472$_1, NIL)));
        defparameter("*SPLIT-UNSPLIT-STUFF-REGULAR-EXPRESSIONS*", list(list(cconcatenate($str_alt486$__D_d___, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str_alt487$___s__ }), cconcatenate($str_alt478$_1_2, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt488$_3 }), NIL), list(cconcatenate($str_alt489$___w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str_alt490$___s_ }), cconcatenate($str_alt472$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt491$_2 }), NIL), list($str_alt492$__sno_____s______d_, cconcatenate($str_alt472$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt491$_2 }), $list_alt493), list($str_alt494$__ap___m___s______upper____, cconcatenate($str_alt472$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt491$_2 }), NIL)));
        defparameter("*SENTENCIFIER-PATTERNS*", NIL);
        return NIL;
    }

    public static SubLObject init_document_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*TEXT-CLASS-PRINT-LENGTH*", TEN_INTEGER);
            defconstant("*XML-INDENT-LEVEL*", THREE_INTEGER);
            defconstant("*XML-INDENT*", Strings.make_string($xml_indent_level$.getGlobalValue(), CHAR_space));
            defconstant("*NEWLINE*", Strings.make_string(ONE_INTEGER, CHAR_newline));
            defconstant("*XML-STRING-MAPPING*", $list0);
            defconstant("*DTP-SIGN*", SIGN);
            defparameter("*WORDIFIER*", RKF_STANDARD_STRING_WORDIFY);
            deflexical("*FST-STRING-WORDIFY-LOCK*", make_lock($str69$fst_string_wordify_lock));
            deflexical("*HTML-STRING-WORDIFY-PUNCTUATION-CHARS-CACHING-STATE*", NIL);
            defconstant("*DTP-HTML-STRING-WORDIFY-STATE*", HTML_STRING_WORDIFY_STATE);
            defconstant("*DTP-PARAGRAPH*", PARAGRAPH);
            defconstant("*DTP-DOCUMENT*", DOCUMENT);
            defparameter("*PERFORM-DOT-ANALYSIS-ON-DOCS*", NIL);
            defparameter("*WORDIFIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list220, list(new SubLObject[]{ $list221, listS(ZERO_INTEGER, symbol_function(WHITESPACEP), $list223), $list224, $list225, $list226, $list227, $list228, $list229, $list230, $list231, $list232, $list233, listS(ZERO_INTEGER, symbol_function(ALPHABETIC_CHAR_OR_CHARACTER_CODE_P), $list235), listS(ZERO_INTEGER, symbol_function($sym236$ISA_DIGIT_CHAR_), $list237), $list238, $list239, $list240, $list241, listS(ZERO_INTEGER, symbol_function($sym242$ANY_PUNCTUATION_CHAR_), $list243), listS(ZERO_INTEGER, symbol_function($sym244$SENTENCE_INTERNAL_PUNCTUATION_CHAR_), $list235), listS(ZERO_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list243), listS(ONE_INTEGER, symbol_function(UPPER_CASE_CHAR_P), $list247), listS(ONE_INTEGER, symbol_function(ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P), $list235), $list249, $list250, listS(ONE_INTEGER, symbol_function(WHITESPACEP), $list251), $list252, listS(ONE_INTEGER, symbol_function($sym242$ANY_PUNCTUATION_CHAR_), $list253), listS(ONE_INTEGER, symbol_function($sym254$QUOTE_CHAR_), $list253), $list255, listS(ONE_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list253), listS(THREE_INTEGER, symbol_function(ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P), $list256), $list257, listS(THREE_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list258), listS(FOUR_INTEGER, symbol_function(UPPER_CASE_CHAR_P), $list259), listS(FOUR_INTEGER, symbol_function(LOWER_CASE_CHAR_P), $list261), $list262, listS(FOUR_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list258), listS(FIVE_INTEGER, symbol_function($sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_), $list235), $list264, listS(SIX_INTEGER, symbol_function($sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_), $list243), $list265, $list266, listS(EIGHT_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list267), $list268, $list269, $list270, listS(NINE_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list253), $list271, listS(TEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list235), $list272, $list273, listS(ELEVEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list275, $list276, $list277, listS(TWELVE_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list278, $list279, listS(THIRTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list280, $list281, $list282, $list283, listS(FOURTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list284, $list285, listS(FIFTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list286, $list287, listS(SIXTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list288, $list289, listS(SEVENTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list290, $list291, listS(EIGHTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list292, $list293, listS(NINETEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list294, $list295, $list296, $list297, $list298, $list299, $list300, $list301, listS(TWENTY_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list253), $list302, $list303, listS($int$21, symbol_function(WHITESPACEP), $list251), listS($int$21, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list235), $list305, $list306, listS($int$22, symbol_function(WHITESPACEP), $list251), listS($int$22, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list235), $list308, $list309, listS($int$23, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list235), $list311, $list312, listS($int$24, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list314, $list315, $list316, listS($int$25, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list318, $list319, listS($int$26, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list321, $list322, listS($int$27, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list324), $list325, $list326, listS($int$28, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list328), $list329, listS($int$29, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list243), $list294, $list331, listS($int$30, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list333, $list334, listS($int$31, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list336, $list337, $list338, $list339, listS($int$32, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list341, $list342, listS($int$33, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list344, $list345, $list346, $list347, listS($int$34, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list349, $list350, listS($int$35, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list352, $list353, $list354, listS($int$36, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list356, $list357, listS($int$37, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list359, $list360, listS($int$38, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list362, $list363, listS($int$39, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list365, $list366, listS($int$40, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list368, $list369, listS($int$41, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list371, $list372, listS($int$42, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list374, $list375, listS($int$43, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list377, listS($int$44, symbol_function($sym236$ISA_DIGIT_CHAR_), $list237), $list379, $list380, listS($int$44, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list381, listS($int$45, symbol_function($sym236$ISA_DIGIT_CHAR_), $list383), listS($int$45, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list384), $list385, $list386, listS($int$46, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list243), $list388, $list389, $list390, $list391, listS($int$48, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list393, listS($int$49, symbol_function($sym236$ISA_DIGIT_CHAR_), $list395), listS($int$49, symbol_function(WHITESPACEP), $list259), listS($int$49, symbol_function($sym254$QUOTE_CHAR_), $list259), listS($int$50, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list237), listS($int$51, symbol_function(ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P), $list235), $list398, $list399, listS($int$51, symbol_function(WHITESPACEP), $list251), $list400, listS($int$51, symbol_function($sym242$ANY_PUNCTUATION_CHAR_), $list253), listS($int$51, symbol_function($sym254$QUOTE_CHAR_), $list253), $list401, listS($int$51, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list253) }), BUILD_WORD_TOKEN));
            defparameter("*SENTENCIFIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list220, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function(NEWLINE_WORD_P), $list243), listS(ZERO_INTEGER, symbol_function(END_OF_SENTENCE_WORD_P), $list243), listS(ZERO_INTEGER, symbol_function(WORD_P), $list235), listS(ONE_INTEGER, symbol_function(NEWLINE_WORD_P), $list405), listS(ONE_INTEGER, symbol_function(END_OF_SENTENCE_WORD_P), $list406), listS(ONE_INTEGER, symbol_function(WORD_P), $list235), $list255, listS(THREE_INTEGER, symbol_function(NEWLINE_WORD_P), $list259), $list407, listS(THREE_INTEGER, symbol_function(WORD_P), $list235), listS(FOUR_INTEGER, symbol_function(QUOTE_WORD_P), $list243), $list409, listS(FOUR_INTEGER, symbol_function(WORD_P), $list253) }), BUILD_SENTENCE_TOKEN));
            defparameter("*PARAGRAPHIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list220, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list412), $list413, listS(ZERO_INTEGER, symbol_function(SENTENCE_P), $list414), listS(ONE_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list415), $list255, listS(ONE_INTEGER, symbol_function(SENTENCE_P), $list414), listS(THREE_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list415), $list407, listS(THREE_INTEGER, symbol_function(SENTENCE_P), $list253) }), BUILD_PARAGRAPH_TOKEN));
            defparameter("*EOS-CHAR*", CHAR_escape);
            defparameter("*EOS*", format(NIL, $str417$_C, $eos_char$.getDynamicValue()));
            defparameter("*P*", $str418$______);
            defparameter("*AP*", $str419$____________________);
            defparameter("*PAP*", cconcatenate($p$.getDynamicValue(), $ap$.getDynamicValue()));
            defparameter("*PEOPLE*", $list420);
            defparameter("*ARMY*", $list421);
            defparameter("*COMPANIES*", $list422);
            defparameter("*PLACES*", list(new SubLObject[]{ $$$arc, $$$al, $$$ave, $str426$blv_d, $$$cl, $$$ct, $$$cres, $$$dr, $str431$expy_, $$$dist, $$$mt, $$$ft, $str435$fw_y, $str436$hwa_y, $$$la, $str438$pde_, $$$pl, $$$plz, $$$rd, $$$st, $$$tce, $$$Ala, $$$Ariz, $$$Ark, $$$Cal, $$$Calif, $$$Col, $$$Colo, $$$Conn, $$$Del, $$$Fed, $$$Fla, $$$Ga, $$$Ida, $$$Id, $$$Ill, $$$Ind, $$$Ia, $$$Kan, $$$Kans, $$$Ken, $$$Ky, $$$La, $$$Me, $$$Md, $$$Is, $$$Mass, $$$Mich, $$$Minn, $$$Miss, $$$Mo, $$$Mont, $$$Neb, $$$Nebr, $$$Nev, $$$Mex, $$$Okla, $$$Ok, $$$Ore, $$$Penna, $$$Penn, $$$Pa, $$$Dak, $$$Tenn, $$$Tex, $$$Ut, $$$Vt, $$$Va, $$$Wash, $$$Wis, $$$Wisc, $$$Wy, $$$Wyo, $$$USAFA, $$$Alta, $$$Man, $$$Ont, $$$Sask, $$$Yuk }));
            defparameter("*MONTHS*", $list502);
            defparameter("*MISC*", $list503);
            defparameter("*ABBREVIATIONS*", append(new SubLObject[]{ $people$.getDynamicValue(), $army$.getDynamicValue(), $companies$.getDynamicValue(), $places$.getDynamicValue(), $months$.getDynamicValue(), $misc$.getDynamicValue() }));
            defparameter("*MARK-EOS-REGULAR-EXPRESSIONS*", list(list($str504$_n_s__n, $eos$.getDynamicValue(), NIL), list(cconcatenate($str41$_, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str505$_s_ }), cconcatenate($str506$_1, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), NIL), list(cconcatenate($str507$__s_w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str42$_ }), cconcatenate($str506$_1, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), NIL)));
            defparameter("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS1*", list(list(cconcatenate($str508$_____w__w, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str505$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str506$_1, NIL), list(cconcatenate($str508$_____w__w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str42$_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str506$_1, NIL), list(cconcatenate($str509$__s_w___s__, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), $str506$_1, NIL), list(cconcatenate($str510$_________, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str511$____lower____ }), $str512$_1_2, NIL), list(cconcatenate($str513$_____, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str514$_____s__, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str506$_1, NIL)));
            defparameter("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS2*", list(list(cconcatenate($str515$______s__, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str516$__s____lower____ }), $str512$_1_2, NIL), list(cconcatenate($str517$__s___s_, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str518$__s__ }), $str512$_1_2, NIL), list(cconcatenate($str519$__s, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str505$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str506$_1, NIL)));
            defparameter("*SPLIT-UNSPLIT-STUFF-REGULAR-EXPRESSIONS*", list(list(cconcatenate($str520$__D_d___, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str521$___s__ }), cconcatenate($str512$_1_2, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str522$_3 }), NIL), list(cconcatenate($str523$___w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str524$___s_ }), cconcatenate($str506$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str525$_2 }), NIL), list($str526$__sno_____s______d_, cconcatenate($str506$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str525$_2 }), $list527), list($str528$__ap___m___s______upper____, cconcatenate($str506$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str525$_2 }), NIL)));
            defparameter("*SENTENCIFIER-PATTERNS*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*WORDIFIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt186, list(new SubLObject[]{ $list_alt187, listS(ZERO_INTEGER, symbol_function(WHITESPACEP), $list_alt189), $list_alt190, $list_alt191, $list_alt192, $list_alt193, $list_alt194, $list_alt195, $list_alt196, $list_alt197, $list_alt198, $list_alt199, listS(ZERO_INTEGER, symbol_function(ALPHA_CHAR_P), $list_alt201), listS(ZERO_INTEGER, symbol_function(DIGIT_CHAR_P), $list_alt203), $list_alt204, $list_alt205, $list_alt206, $list_alt207, listS(ZERO_INTEGER, symbol_function($sym208$ANY_PUNCTUATION_CHAR_), $list_alt209), listS(ZERO_INTEGER, symbol_function($sym210$SENTENCE_INTERNAL_PUNCTUATION_CHAR_), $list_alt201), listS(ZERO_INTEGER, symbol_function(CHARACTERP), $list_alt209), listS(ONE_INTEGER, symbol_function(UPPER_CASE_P), $list_alt213), listS(ONE_INTEGER, symbol_function(ALPHANUMERICP), $list_alt201), $list_alt215, $list_alt216, listS(ONE_INTEGER, symbol_function(WHITESPACEP), $list_alt217), $list_alt218, listS(ONE_INTEGER, symbol_function($sym208$ANY_PUNCTUATION_CHAR_), $list_alt219), listS(ONE_INTEGER, symbol_function($sym220$QUOTE_CHAR_), $list_alt219), $list_alt221, listS(ONE_INTEGER, symbol_function(CHARACTERP), $list_alt219), listS(THREE_INTEGER, symbol_function(ALPHANUMERICP), $list_alt222), $list_alt223, listS(THREE_INTEGER, symbol_function(CHARACTERP), $list_alt224), listS(FOUR_INTEGER, symbol_function(UPPER_CASE_P), $list_alt225), listS(FOUR_INTEGER, symbol_function(LOWER_CASE_P), $list_alt227), $list_alt228, listS(FOUR_INTEGER, symbol_function(CHARACTERP), $list_alt224), listS(FIVE_INTEGER, symbol_function($sym229$SENTENCE_FINAL_PUNCTUATION_CHAR_), $list_alt201), $list_alt230, listS(SIX_INTEGER, symbol_function($sym229$SENTENCE_FINAL_PUNCTUATION_CHAR_), $list_alt209), $list_alt231, $list_alt232, listS(EIGHT_INTEGER, symbol_function(CHARACTERP), $list_alt233), $list_alt234, $list_alt235, $list_alt236, listS(NINE_INTEGER, symbol_function(CHARACTERP), $list_alt219), $list_alt237, listS(TEN_INTEGER, symbol_function(CHARACTERP), $list_alt201), $list_alt238, $list_alt239, listS(ELEVEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt241, $list_alt242, $list_alt243, listS(TWELVE_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt244, $list_alt245, listS(THIRTEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt246, $list_alt247, $list_alt248, $list_alt249, listS(FOURTEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt250, $list_alt251, listS(FIFTEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt252, $list_alt253, listS(SIXTEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt254, $list_alt255, listS(SEVENTEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt256, $list_alt257, listS(EIGHTEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt258, $list_alt259, listS(NINETEEN_INTEGER, symbol_function(CHARACTERP), $list_alt240), $list_alt260, $list_alt261, $list_alt262, $list_alt263, $list_alt264, $list_alt265, $list_alt266, $list_alt267, listS(TWENTY_INTEGER, symbol_function(CHARACTERP), $list_alt219), $list_alt268, $list_alt269, listS($int$21, symbol_function(WHITESPACEP), $list_alt217), listS($int$21, symbol_function(CHARACTERP), $list_alt201), $list_alt271, $list_alt272, listS($int$22, symbol_function(WHITESPACEP), $list_alt217), listS($int$22, symbol_function(CHARACTERP), $list_alt201), $list_alt274, $list_alt275, listS($int$23, symbol_function(CHARACTERP), $list_alt201), $list_alt277, $list_alt278, listS($int$24, symbol_function(CHARACTERP), $list_alt240), $list_alt280, $list_alt281, $list_alt282, listS($int$25, symbol_function(CHARACTERP), $list_alt240), $list_alt284, $list_alt285, listS($int$26, symbol_function(CHARACTERP), $list_alt240), $list_alt287, $list_alt288, listS($int$27, symbol_function(CHARACTERP), $list_alt290), $list_alt291, $list_alt292, listS($int$28, symbol_function(CHARACTERP), $list_alt294), $list_alt295, listS($int$29, symbol_function(CHARACTERP), $list_alt209), $list_alt260, $list_alt297, listS($int$30, symbol_function(CHARACTERP), $list_alt240), $list_alt299, $list_alt300, listS($int$31, symbol_function(CHARACTERP), $list_alt240), $list_alt302, $list_alt303, $list_alt304, $list_alt305, listS($int$32, symbol_function(CHARACTERP), $list_alt240), $list_alt307, $list_alt308, listS($int$33, symbol_function(CHARACTERP), $list_alt240), $list_alt310, $list_alt311, $list_alt312, $list_alt313, listS($int$34, symbol_function(CHARACTERP), $list_alt240), $list_alt315, $list_alt316, listS($int$35, symbol_function(CHARACTERP), $list_alt240), $list_alt318, $list_alt319, $list_alt320, listS($int$36, symbol_function(CHARACTERP), $list_alt240), $list_alt322, $list_alt323, listS($int$37, symbol_function(CHARACTERP), $list_alt240), $list_alt325, $list_alt326, listS($int$38, symbol_function(CHARACTERP), $list_alt240), $list_alt328, $list_alt329, listS($int$39, symbol_function(CHARACTERP), $list_alt240), $list_alt331, $list_alt332, listS($int$40, symbol_function(CHARACTERP), $list_alt240), $list_alt334, $list_alt335, listS($int$41, symbol_function(CHARACTERP), $list_alt240), $list_alt337, $list_alt338, listS($int$42, symbol_function(CHARACTERP), $list_alt240), $list_alt340, $list_alt341, listS($int$43, symbol_function(CHARACTERP), $list_alt240), $list_alt343, listS($int$44, symbol_function(DIGIT_CHAR_P), $list_alt203), $list_alt345, $list_alt346, listS($int$44, symbol_function(CHARACTERP), $list_alt240), $list_alt347, listS($int$45, symbol_function(DIGIT_CHAR_P), $list_alt349), listS($int$45, symbol_function(CHARACTERP), $list_alt350), $list_alt351, $list_alt352, listS($int$46, symbol_function(CHARACTERP), $list_alt209), $list_alt354, $list_alt355, $list_alt356, $list_alt357, listS($int$48, symbol_function(CHARACTERP), $list_alt240), $list_alt359, listS($int$49, symbol_function(DIGIT_CHAR_P), $list_alt361), listS($int$49, symbol_function(WHITESPACEP), $list_alt225), listS($int$49, symbol_function($sym220$QUOTE_CHAR_), $list_alt225), listS($int$50, symbol_function(CHARACTERP), $list_alt203), listS($int$51, symbol_function(ALPHANUMERICP), $list_alt201), $list_alt364, $list_alt365, listS($int$51, symbol_function(WHITESPACEP), $list_alt217), $list_alt366, listS($int$51, symbol_function($sym208$ANY_PUNCTUATION_CHAR_), $list_alt219), listS($int$51, symbol_function($sym220$QUOTE_CHAR_), $list_alt219), $list_alt367, listS($int$51, symbol_function(CHARACTERP), $list_alt219) }), BUILD_WORD_TOKEN));
            defparameter("*SENTENCIFIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt186, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function(NEWLINE_WORD_P), $list_alt209), listS(ZERO_INTEGER, symbol_function(END_OF_SENTENCE_WORD_P), $list_alt209), listS(ZERO_INTEGER, symbol_function(WORD_P), $list_alt201), listS(ONE_INTEGER, symbol_function(NEWLINE_WORD_P), $list_alt371), listS(ONE_INTEGER, symbol_function(END_OF_SENTENCE_WORD_P), $list_alt372), listS(ONE_INTEGER, symbol_function(WORD_P), $list_alt201), $list_alt221, listS(THREE_INTEGER, symbol_function(NEWLINE_WORD_P), $list_alt225), $list_alt373, listS(THREE_INTEGER, symbol_function(WORD_P), $list_alt201), listS(FOUR_INTEGER, symbol_function(QUOTE_WORD_P), $list_alt209), $list_alt375, listS(FOUR_INTEGER, symbol_function(WORD_P), $list_alt219) }), BUILD_SENTENCE_TOKEN));
            defparameter("*PARAGRAPHIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list_alt186, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list_alt378), $list_alt379, listS(ZERO_INTEGER, symbol_function(SENTENCE_P), $list_alt380), listS(ONE_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list_alt381), $list_alt221, listS(ONE_INTEGER, symbol_function(SENTENCE_P), $list_alt380), listS(THREE_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list_alt381), $list_alt373, listS(THREE_INTEGER, symbol_function(SENTENCE_P), $list_alt219) }), BUILD_PARAGRAPH_TOKEN));
            defparameter("*EOS*", format(NIL, $str_alt383$_C, $eos_char$.getDynamicValue()));
            defparameter("*P*", $str_alt384$______);
            defparameter("*AP*", $str_alt385$____________________);
            defparameter("*PEOPLE*", $list_alt386);
            defparameter("*ARMY*", $list_alt387);
            defparameter("*COMPANIES*", $list_alt388);
            defparameter("*PLACES*", list(new SubLObject[]{ $$$arc, $$$al, $$$ave, $str_alt392$blv_d, $$$cl, $$$ct, $$$cres, $$$dr, $str_alt397$expy_, $$$dist, $$$mt, $$$ft, $str_alt401$fw_y, $str_alt402$hwa_y, $$$la, $str_alt404$pde_, $$$pl, $$$plz, $$$rd, $$$st, $$$tce, $$$Ala, $$$Ariz, $$$Ark, $$$Cal, $$$Calif, $$$Col, $$$Colo, $$$Conn, $$$Del, $$$Fed, $$$Fla, $$$Ga, $$$Ida, $$$Id, $$$Ill, $$$Ind, $$$Ia, $$$Kan, $$$Kans, $$$Ken, $$$Ky, $$$La, $$$Me, $$$Md, $$$Is, $$$Mass, $$$Mich, $$$Minn, $$$Miss, $$$Mo, $$$Mont, $$$Neb, $$$Nebr, $$$Nev, $$$Mex, $$$Okla, $$$Ok, $$$Ore, $$$Penna, $$$Penn, $$$Pa, $$$Dak, $$$Tenn, $$$Tex, $$$Ut, $$$Vt, $$$Va, $$$Wash, $$$Wis, $$$Wisc, $$$Wy, $$$Wyo, $$$USAFA, $$$Alta, $$$Man, $$$Ont, $$$Sask, $$$Yuk }));
            defparameter("*MONTHS*", $list_alt468);
            defparameter("*MISC*", $list_alt469);
            defparameter("*MARK-EOS-REGULAR-EXPRESSIONS*", list(list($str_alt470$_n_s__n, $eos$.getDynamicValue(), NIL), list(cconcatenate($str_alt35$_, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str_alt471$_s_ }), cconcatenate($str_alt472$_1, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), NIL), list(cconcatenate($str_alt473$__s_w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str_alt36$_ }), cconcatenate($str_alt472$_1, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), NIL)));
            defparameter("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS1*", list(list(cconcatenate($str_alt474$_____w__w, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str_alt471$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str_alt472$_1, NIL), list(cconcatenate($str_alt474$_____w__w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str_alt36$_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str_alt472$_1, NIL), list(cconcatenate($str_alt475$__s_w___s__, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), $str_alt472$_1, NIL), list(cconcatenate($str_alt476$_________, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt477$____lower____ }), $str_alt478$_1_2, NIL), list(cconcatenate($str_alt479$_____, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str_alt480$_____s__, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str_alt472$_1, NIL)));
            defparameter("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS2*", list(list(cconcatenate($str_alt481$______s__, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt482$__s____lower____ }), $str_alt478$_1_2, NIL), list(cconcatenate($str_alt483$__s___s_, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt484$__s__ }), $str_alt478$_1_2, NIL), list(cconcatenate($str_alt485$__s, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str_alt471$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str_alt472$_1, NIL)));
            defparameter("*SPLIT-UNSPLIT-STUFF-REGULAR-EXPRESSIONS*", list(list(cconcatenate($str_alt486$__D_d___, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str_alt487$___s__ }), cconcatenate($str_alt478$_1_2, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt488$_3 }), NIL), list(cconcatenate($str_alt489$___w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str_alt490$___s_ }), cconcatenate($str_alt472$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt491$_2 }), NIL), list($str_alt492$__sno_____s______d_, cconcatenate($str_alt472$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt491$_2 }), $list_alt493), list($str_alt494$__ap___m___s______upper____, cconcatenate($str_alt472$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str_alt491$_2 }), NIL)));
        }
        return NIL;
    }

    public static SubLObject init_document_file_Previous() {
        defparameter("*TEXT-CLASS-PRINT-LENGTH*", TEN_INTEGER);
        defconstant("*XML-INDENT-LEVEL*", THREE_INTEGER);
        defconstant("*XML-INDENT*", Strings.make_string($xml_indent_level$.getGlobalValue(), CHAR_space));
        defconstant("*NEWLINE*", Strings.make_string(ONE_INTEGER, CHAR_newline));
        defconstant("*XML-STRING-MAPPING*", $list0);
        defconstant("*DTP-SIGN*", SIGN);
        defparameter("*WORDIFIER*", RKF_STANDARD_STRING_WORDIFY);
        deflexical("*FST-STRING-WORDIFY-LOCK*", make_lock($str69$fst_string_wordify_lock));
        deflexical("*HTML-STRING-WORDIFY-PUNCTUATION-CHARS-CACHING-STATE*", NIL);
        defconstant("*DTP-HTML-STRING-WORDIFY-STATE*", HTML_STRING_WORDIFY_STATE);
        defconstant("*DTP-PARAGRAPH*", PARAGRAPH);
        defconstant("*DTP-DOCUMENT*", DOCUMENT);
        defparameter("*PERFORM-DOT-ANALYSIS-ON-DOCS*", NIL);
        defparameter("*WORDIFIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list220, list(new SubLObject[]{ $list221, listS(ZERO_INTEGER, symbol_function(WHITESPACEP), $list223), $list224, $list225, $list226, $list227, $list228, $list229, $list230, $list231, $list232, $list233, listS(ZERO_INTEGER, symbol_function(ALPHABETIC_CHAR_OR_CHARACTER_CODE_P), $list235), listS(ZERO_INTEGER, symbol_function($sym236$ISA_DIGIT_CHAR_), $list237), $list238, $list239, $list240, $list241, listS(ZERO_INTEGER, symbol_function($sym242$ANY_PUNCTUATION_CHAR_), $list243), listS(ZERO_INTEGER, symbol_function($sym244$SENTENCE_INTERNAL_PUNCTUATION_CHAR_), $list235), listS(ZERO_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list243), listS(ONE_INTEGER, symbol_function(UPPER_CASE_CHAR_P), $list247), listS(ONE_INTEGER, symbol_function(ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P), $list235), $list249, $list250, listS(ONE_INTEGER, symbol_function(WHITESPACEP), $list251), $list252, listS(ONE_INTEGER, symbol_function($sym242$ANY_PUNCTUATION_CHAR_), $list253), listS(ONE_INTEGER, symbol_function($sym254$QUOTE_CHAR_), $list253), $list255, listS(ONE_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list253), listS(THREE_INTEGER, symbol_function(ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P), $list256), $list257, listS(THREE_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list258), listS(FOUR_INTEGER, symbol_function(UPPER_CASE_CHAR_P), $list259), listS(FOUR_INTEGER, symbol_function(LOWER_CASE_CHAR_P), $list261), $list262, listS(FOUR_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list258), listS(FIVE_INTEGER, symbol_function($sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_), $list235), $list264, listS(SIX_INTEGER, symbol_function($sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_), $list243), $list265, $list266, listS(EIGHT_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list267), $list268, $list269, $list270, listS(NINE_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list253), $list271, listS(TEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list235), $list272, $list273, listS(ELEVEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list275, $list276, $list277, listS(TWELVE_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list278, $list279, listS(THIRTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list280, $list281, $list282, $list283, listS(FOURTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list284, $list285, listS(FIFTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list286, $list287, listS(SIXTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list288, $list289, listS(SEVENTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list290, $list291, listS(EIGHTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list292, $list293, listS(NINETEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list294, $list295, $list296, $list297, $list298, $list299, $list300, $list301, listS(TWENTY_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list253), $list302, $list303, listS($int$21, symbol_function(WHITESPACEP), $list251), listS($int$21, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list235), $list305, $list306, listS($int$22, symbol_function(WHITESPACEP), $list251), listS($int$22, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list235), $list308, $list309, listS($int$23, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list235), $list311, $list312, listS($int$24, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list314, $list315, $list316, listS($int$25, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list318, $list319, listS($int$26, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list321, $list322, listS($int$27, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list324), $list325, $list326, listS($int$28, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list328), $list329, listS($int$29, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list243), $list294, $list331, listS($int$30, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list333, $list334, listS($int$31, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list336, $list337, $list338, $list339, listS($int$32, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list341, $list342, listS($int$33, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list344, $list345, $list346, $list347, listS($int$34, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list349, $list350, listS($int$35, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list352, $list353, $list354, listS($int$36, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list356, $list357, listS($int$37, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list359, $list360, listS($int$38, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list362, $list363, listS($int$39, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list365, $list366, listS($int$40, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list368, $list369, listS($int$41, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list371, $list372, listS($int$42, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list374, $list375, listS($int$43, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list377, listS($int$44, symbol_function($sym236$ISA_DIGIT_CHAR_), $list237), $list379, $list380, listS($int$44, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list381, listS($int$45, symbol_function($sym236$ISA_DIGIT_CHAR_), $list383), listS($int$45, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list384), $list385, $list386, listS($int$46, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list243), $list388, $list389, $list390, $list391, listS($int$48, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list393, listS($int$49, symbol_function($sym236$ISA_DIGIT_CHAR_), $list395), listS($int$49, symbol_function(WHITESPACEP), $list259), listS($int$49, symbol_function($sym254$QUOTE_CHAR_), $list259), listS($int$50, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list237), listS($int$51, symbol_function(ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P), $list235), $list398, $list399, listS($int$51, symbol_function(WHITESPACEP), $list251), $list400, listS($int$51, symbol_function($sym242$ANY_PUNCTUATION_CHAR_), $list253), listS($int$51, symbol_function($sym254$QUOTE_CHAR_), $list253), $list401, listS($int$51, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list253) }), BUILD_WORD_TOKEN));
        defparameter("*SENTENCIFIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list220, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function(NEWLINE_WORD_P), $list243), listS(ZERO_INTEGER, symbol_function(END_OF_SENTENCE_WORD_P), $list243), listS(ZERO_INTEGER, symbol_function(WORD_P), $list235), listS(ONE_INTEGER, symbol_function(NEWLINE_WORD_P), $list405), listS(ONE_INTEGER, symbol_function(END_OF_SENTENCE_WORD_P), $list406), listS(ONE_INTEGER, symbol_function(WORD_P), $list235), $list255, listS(THREE_INTEGER, symbol_function(NEWLINE_WORD_P), $list259), $list407, listS(THREE_INTEGER, symbol_function(WORD_P), $list235), listS(FOUR_INTEGER, symbol_function(QUOTE_WORD_P), $list243), $list409, listS(FOUR_INTEGER, symbol_function(WORD_P), $list253) }), BUILD_SENTENCE_TOKEN));
        defparameter("*PARAGRAPHIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list220, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list412), $list413, listS(ZERO_INTEGER, symbol_function(SENTENCE_P), $list414), listS(ONE_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list415), $list255, listS(ONE_INTEGER, symbol_function(SENTENCE_P), $list414), listS(THREE_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list415), $list407, listS(THREE_INTEGER, symbol_function(SENTENCE_P), $list253) }), BUILD_PARAGRAPH_TOKEN));
        defparameter("*EOS-CHAR*", CHAR_escape);
        defparameter("*EOS*", format(NIL, $str417$_C, $eos_char$.getDynamicValue()));
        defparameter("*P*", $str418$______);
        defparameter("*AP*", $str419$____________________);
        defparameter("*PAP*", cconcatenate($p$.getDynamicValue(), $ap$.getDynamicValue()));
        defparameter("*PEOPLE*", $list420);
        defparameter("*ARMY*", $list421);
        defparameter("*COMPANIES*", $list422);
        defparameter("*PLACES*", list(new SubLObject[]{ $$$arc, $$$al, $$$ave, $str426$blv_d, $$$cl, $$$ct, $$$cres, $$$dr, $str431$expy_, $$$dist, $$$mt, $$$ft, $str435$fw_y, $str436$hwa_y, $$$la, $str438$pde_, $$$pl, $$$plz, $$$rd, $$$st, $$$tce, $$$Ala, $$$Ariz, $$$Ark, $$$Cal, $$$Calif, $$$Col, $$$Colo, $$$Conn, $$$Del, $$$Fed, $$$Fla, $$$Ga, $$$Ida, $$$Id, $$$Ill, $$$Ind, $$$Ia, $$$Kan, $$$Kans, $$$Ken, $$$Ky, $$$La, $$$Me, $$$Md, $$$Is, $$$Mass, $$$Mich, $$$Minn, $$$Miss, $$$Mo, $$$Mont, $$$Neb, $$$Nebr, $$$Nev, $$$Mex, $$$Okla, $$$Ok, $$$Ore, $$$Penna, $$$Penn, $$$Pa, $$$Dak, $$$Tenn, $$$Tex, $$$Ut, $$$Vt, $$$Va, $$$Wash, $$$Wis, $$$Wisc, $$$Wy, $$$Wyo, $$$USAFA, $$$Alta, $$$Man, $$$Ont, $$$Sask, $$$Yuk }));
        defparameter("*MONTHS*", $list502);
        defparameter("*MISC*", $list503);
        defparameter("*ABBREVIATIONS*", append(new SubLObject[]{ $people$.getDynamicValue(), $army$.getDynamicValue(), $companies$.getDynamicValue(), $places$.getDynamicValue(), $months$.getDynamicValue(), $misc$.getDynamicValue() }));
        defparameter("*MARK-EOS-REGULAR-EXPRESSIONS*", list(list($str504$_n_s__n, $eos$.getDynamicValue(), NIL), list(cconcatenate($str41$_, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str505$_s_ }), cconcatenate($str506$_1, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), NIL), list(cconcatenate($str507$__s_w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str42$_ }), cconcatenate($str506$_1, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), NIL)));
        defparameter("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS1*", list(list(cconcatenate($str508$_____w__w, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str505$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str506$_1, NIL), list(cconcatenate($str508$_____w__w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str42$_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str506$_1, NIL), list(cconcatenate($str509$__s_w___s__, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), $str506$_1, NIL), list(cconcatenate($str510$_________, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str511$____lower____ }), $str512$_1_2, NIL), list(cconcatenate($str513$_____, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str514$_____s__, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str506$_1, NIL)));
        defparameter("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS2*", list(list(cconcatenate($str515$______s__, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str516$__s____lower____ }), $str512$_1_2, NIL), list(cconcatenate($str517$__s___s_, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str518$__s__ }), $str512$_1_2, NIL), list(cconcatenate($str519$__s, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str505$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str506$_1, NIL)));
        defparameter("*SPLIT-UNSPLIT-STUFF-REGULAR-EXPRESSIONS*", list(list(cconcatenate($str520$__D_d___, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str521$___s__ }), cconcatenate($str512$_1_2, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str522$_3 }), NIL), list(cconcatenate($str523$___w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str524$___s_ }), cconcatenate($str506$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str525$_2 }), NIL), list($str526$__sno_____s______d_, cconcatenate($str506$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str525$_2 }), $list527), list($str528$__ap___m___s______upper____, cconcatenate($str506$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str525$_2 }), NIL)));
        defparameter("*SENTENCIFIER-PATTERNS*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt315 = list(makeInteger(34), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt316 = list(makeInteger(35), CHAR_e, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt318 = list(makeInteger(35), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt319 = list(makeInteger(36), CHAR_a, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt320 = list(makeInteger(36), CHAR_o, list($EMIT), makeInteger(37));

    static private final SubLList $list_alt322 = list(makeInteger(36), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt323 = list(makeInteger(37), CHAR_u, list($EMIT), makeInteger(38));

    static private final SubLList $list_alt325 = list(makeInteger(37), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt326 = list(makeInteger(38), CHAR_l, list($EMIT), makeInteger(39));

    static private final SubLList $list_alt328 = list(makeInteger(38), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt329 = list(makeInteger(39), CHAR_d, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt331 = list(makeInteger(39), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt332 = list(makeInteger(40), CHAR_s, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt334 = list(makeInteger(40), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt335 = list(makeInteger(41), CHAR_s, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt337 = list(makeInteger(41), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt338 = list(makeInteger(42), CHAR_r, list($EMIT), makeInteger(43));

    static private final SubLList $list_alt340 = list(makeInteger(42), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt341 = list(makeInteger(43), CHAR_e, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt343 = list(makeInteger(43), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt345 = list(makeInteger(44), CHAR_period, list(makeKeyword("REMEMBER")), makeInteger(45));

    static private final SubLList $list_alt346 = list(makeInteger(44), CHAR_comma, list(makeKeyword("REMEMBER")), makeInteger(49));

    static private final SubLList $list_alt347 = list(makeInteger(44), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt349 = list(list(makeKeyword("BACKUP")), makeInteger(46));

    static private final SubLList $list_alt350 = list(list(makeKeyword("BACKUP")), THREE_INTEGER);

    static private final SubLList $list_alt351 = list(makeInteger(45), makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list_alt352 = list(makeInteger(46), CHAR_period, list($EMIT), makeInteger(44));

    static private final SubLList $list_alt354 = list(makeInteger(46), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt355 = list(makeInteger(47), CHAR_e, list($EMIT), makeInteger(21));

    static private final SubLList $list_alt356 = list(makeInteger(47), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt357 = list(makeInteger(48), CHAR_i, list($EMIT), makeInteger(25));

    static private final SubLList $list_alt359 = list(makeInteger(48), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt361 = list(list(makeKeyword("BACKUP")), makeInteger(50));

    static private final SubLList $list_alt364 = list(makeInteger(51), CHAR_period, list($EMIT), ONE_INTEGER);

    static private final SubLList $list_alt365 = list(makeInteger(51), CHAR_newline, list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    static private final SubLList $list_alt366 = list(makeInteger(51), CHAR_hyphen, list(makeKeyword("REMEMBER")), EIGHT_INTEGER);

    static private final SubLList $list_alt367 = list(makeInteger(51), makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt371 = list(list(makeKeyword("REMEMBER")), THREE_INTEGER);

    static private final SubLList $list_alt372 = list(list($EMIT), FOUR_INTEGER);

    static private final SubLList $list_alt373 = list(THREE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt375 = list(FOUR_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt378 = list(NIL, ONE_INTEGER);

    static private final SubLList $list_alt379 = list(ZERO_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    static private final SubLList $list_alt380 = list(list($EMIT), ZERO_INTEGER);

    static private final SubLList $list_alt381 = list(NIL, THREE_INTEGER);

    static private final SubLString $str_alt383$_C = makeString("~C");

    static private final SubLString $str_alt384$______ = makeString("[\\.!?]");

    static private final SubLString $str_alt385$____________________ = makeString("(?:\'|\"|\'\'|\\)|\\]|\\})?");

    static private final SubLList $list_alt386 = list(new SubLObject[]{ makeString("jr"), makeString("mr"), makeString("mrs"), makeString("ms"), makeString("dr"), makeString("prof"), makeString("sr"), makeString("sens?"), makeString("reps?"), makeString("gov"), makeString("attys?"), makeString("supt"), makeString("det"), makeString("rev") });

    static private final SubLList $list_alt387 = list(new SubLObject[]{ makeString("col"), makeString("gen"), makeString("lt"), makeString("cmdr"), makeString("adm"), makeString("capt"), makeString("sgt"), makeString("cpl"), makeString("maj") });

    static private final SubLList $list_alt388 = list(makeString("inc"), makeString("ltd"), makeString("co"), makeString("corp"));

    static private final SubLString $str_alt392$blv_d = makeString("blv?d");

    static private final SubLString $str_alt397$expy_ = makeString("expy?");

    static private final SubLString $str_alt401$fw_y = makeString("fw?y");

    static private final SubLString $str_alt402$hwa_y = makeString("hwa?y");

    static private final SubLString $str_alt404$pde_ = makeString("pde?");

    static private final SubLList $list_alt468 = list(new SubLObject[]{ makeString("jan"), makeString("feb"), makeString("mar"), makeString("apr"), makeString("may"), makeString("jun"), makeString("jul"), makeString("aug"), makeString("sep"), makeString("oct"), makeString("nov"), makeString("dec"), makeString("sept") });

    static private final SubLList $list_alt469 = list(makeString("vs"), makeString("sec"), makeString("no"), makeString("esp"));

    static private final SubLString $str_alt470$_n_s__n = makeString("\\n\\s*\\n");

    public static final SubLObject setup_document_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), symbol_function(SIGN_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SIGN_STRING, _CSETF_SIGN_STRING);
        def_csetf(SIGN_TYPE, _CSETF_SIGN_TYPE);
        def_csetf(SIGN_INFO, _CSETF_SIGN_INFO);
        def_csetf(SIGN_CATEGORY, _CSETF_SIGN_CATEGORY);
        def_csetf(SIGN_CONSTITUENTS, _CSETF_SIGN_CONSTITUENTS);
        def_csetf(SIGN_OFFSET, _CSETF_SIGN_OFFSET);
        def_csetf(SIGN_MOTHER, _CSETF_SIGN_MOTHER);
        identity(SIGN);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), symbol_function(SXHASH_SIGN_METHOD));
        memoization_state.note_globally_cached_function(HTML_STRING_WORDIFY_PUNCTUATION_CHARS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_html_string_wordify_state$.getGlobalValue(), symbol_function(HTML_STRING_WORDIFY_STATE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(HSW_STATE_STATE, _CSETF_HSW_STATE_STATE);
        def_csetf(HSW_STATE_TAG_PIECES, _CSETF_HSW_STATE_TAG_PIECES);
        def_csetf(HSW_STATE_STRING_PIECES, _CSETF_HSW_STATE_STRING_PIECES);
        def_csetf(HSW_STATE_PUNCTUATION_PIECES, _CSETF_HSW_STATE_PUNCTUATION_PIECES);
        def_csetf(HSW_STATE_LEADING_TAGS, _CSETF_HSW_STATE_LEADING_TAGS);
        def_csetf(HSW_STATE_FOLLOWING_TAGS, _CSETF_HSW_STATE_FOLLOWING_TAGS);
        def_csetf(HSW_STATE_CURRENT_OFFSET, _CSETF_HSW_STATE_CURRENT_OFFSET);
        identity(HTML_STRING_WORDIFY_STATE);
        note_funcall_helper_function(PRINT_HSW_STATE);
        note_funcall_helper_function(HTML_STRING_WORDIFY);
        define_test_case_table_int(FST_STRING_WORDIFY, list(new SubLObject[]{ $TEST, FST_WORDIFY_TEST, $OWNER, $$$daves, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt115);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_paragraph$.getGlobalValue(), symbol_function(PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PARAGRAPH_SENTENCES, _CSETF_PARAGRAPH_SENTENCES);
        def_csetf(PARAGRAPH_MOTHER, _CSETF_PARAGRAPH_MOTHER);
        identity(PARAGRAPH);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_document$.getGlobalValue(), symbol_function(DOCUMENT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(DOCUMENT_PARAGRAPHS, _CSETF_DOCUMENT_PARAGRAPHS);
        identity(DOCUMENT);
        register_external_symbol(SENTENCIFY_STRING);
        return NIL;
    }

    public static SubLObject setup_document_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), symbol_function(SIGN_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list9);
            def_csetf(SIGN_STRING, _CSETF_SIGN_STRING);
            def_csetf(SIGN_TYPE, _CSETF_SIGN_TYPE);
            def_csetf(SIGN_INFO, _CSETF_SIGN_INFO);
            def_csetf(SIGN_CATEGORY, _CSETF_SIGN_CATEGORY);
            def_csetf(SIGN_CONSTITUENTS, _CSETF_SIGN_CONSTITUENTS);
            def_csetf(SIGN_OFFSET, _CSETF_SIGN_OFFSET);
            def_csetf(SIGN_MOTHER, _CSETF_SIGN_MOTHER);
            identity(SIGN);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SIGN_METHOD));
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), symbol_function(SXHASH_SIGN_METHOD));
            memoization_state.note_globally_cached_function(HTML_STRING_WORDIFY_PUNCTUATION_CHARS);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_html_string_wordify_state$.getGlobalValue(), symbol_function(HTML_STRING_WORDIFY_STATE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list86);
            def_csetf(HSW_STATE_STATE, _CSETF_HSW_STATE_STATE);
            def_csetf(HSW_STATE_TAG_PIECES, _CSETF_HSW_STATE_TAG_PIECES);
            def_csetf(HSW_STATE_STRING_PIECES, _CSETF_HSW_STATE_STRING_PIECES);
            def_csetf(HSW_STATE_PUNCTUATION_PIECES, _CSETF_HSW_STATE_PUNCTUATION_PIECES);
            def_csetf(HSW_STATE_LEADING_TAGS, _CSETF_HSW_STATE_LEADING_TAGS);
            def_csetf(HSW_STATE_FOLLOWING_TAGS, _CSETF_HSW_STATE_FOLLOWING_TAGS);
            def_csetf(HSW_STATE_CURRENT_OFFSET, _CSETF_HSW_STATE_CURRENT_OFFSET);
            identity(HTML_STRING_WORDIFY_STATE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_html_string_wordify_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HTML_STRING_WORDIFY_STATE_METHOD));
            note_funcall_helper_function(PRINT_HSW_STATE);
            note_funcall_helper_function(HTML_STRING_WORDIFY);
            define_test_case_table_int(FST_STRING_WORDIFY, list(new SubLObject[]{ $TEST, FST_WORDIFY_TEST, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list132);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_paragraph$.getGlobalValue(), symbol_function(PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list165);
            def_csetf(PARAGRAPH_SENTENCES, _CSETF_PARAGRAPH_SENTENCES);
            def_csetf(PARAGRAPH_MOTHER, _CSETF_PARAGRAPH_MOTHER);
            identity(PARAGRAPH);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_paragraph$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARAGRAPH_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_document$.getGlobalValue(), symbol_function(DOCUMENT_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list191);
            def_csetf(DOCUMENT_PARAGRAPHS, _CSETF_DOCUMENT_PARAGRAPHS);
            identity(DOCUMENT);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_document$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DOCUMENT_METHOD));
            register_external_symbol(SENTENCIFY_STRING);
            define_test_case_table_int(NEW_DOCUMENT, list(new SubLObject[]{ $TEST, $sym536$DOCUMENT_SENTENCE_COUNT_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list538);
            define_test_case_table_int(TEST_CONSTRUCT_STRING_FROM_WORDS, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list540);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(FST_STRING_WORDIFY, list(new SubLObject[]{ $TEST, FST_WORDIFY_TEST, $OWNER, $$$daves, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt115);
        }
        return NIL;
    }

    public static SubLObject setup_document_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), symbol_function(SIGN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(SIGN_STRING, _CSETF_SIGN_STRING);
        def_csetf(SIGN_TYPE, _CSETF_SIGN_TYPE);
        def_csetf(SIGN_INFO, _CSETF_SIGN_INFO);
        def_csetf(SIGN_CATEGORY, _CSETF_SIGN_CATEGORY);
        def_csetf(SIGN_CONSTITUENTS, _CSETF_SIGN_CONSTITUENTS);
        def_csetf(SIGN_OFFSET, _CSETF_SIGN_OFFSET);
        def_csetf(SIGN_MOTHER, _CSETF_SIGN_MOTHER);
        identity(SIGN);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SIGN_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), symbol_function(SXHASH_SIGN_METHOD));
        memoization_state.note_globally_cached_function(HTML_STRING_WORDIFY_PUNCTUATION_CHARS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_html_string_wordify_state$.getGlobalValue(), symbol_function(HTML_STRING_WORDIFY_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list86);
        def_csetf(HSW_STATE_STATE, _CSETF_HSW_STATE_STATE);
        def_csetf(HSW_STATE_TAG_PIECES, _CSETF_HSW_STATE_TAG_PIECES);
        def_csetf(HSW_STATE_STRING_PIECES, _CSETF_HSW_STATE_STRING_PIECES);
        def_csetf(HSW_STATE_PUNCTUATION_PIECES, _CSETF_HSW_STATE_PUNCTUATION_PIECES);
        def_csetf(HSW_STATE_LEADING_TAGS, _CSETF_HSW_STATE_LEADING_TAGS);
        def_csetf(HSW_STATE_FOLLOWING_TAGS, _CSETF_HSW_STATE_FOLLOWING_TAGS);
        def_csetf(HSW_STATE_CURRENT_OFFSET, _CSETF_HSW_STATE_CURRENT_OFFSET);
        identity(HTML_STRING_WORDIFY_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_html_string_wordify_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HTML_STRING_WORDIFY_STATE_METHOD));
        note_funcall_helper_function(PRINT_HSW_STATE);
        note_funcall_helper_function(HTML_STRING_WORDIFY);
        define_test_case_table_int(FST_STRING_WORDIFY, list(new SubLObject[]{ $TEST, FST_WORDIFY_TEST, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list132);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_paragraph$.getGlobalValue(), symbol_function(PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list165);
        def_csetf(PARAGRAPH_SENTENCES, _CSETF_PARAGRAPH_SENTENCES);
        def_csetf(PARAGRAPH_MOTHER, _CSETF_PARAGRAPH_MOTHER);
        identity(PARAGRAPH);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_paragraph$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARAGRAPH_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_document$.getGlobalValue(), symbol_function(DOCUMENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list191);
        def_csetf(DOCUMENT_PARAGRAPHS, _CSETF_DOCUMENT_PARAGRAPHS);
        identity(DOCUMENT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_document$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DOCUMENT_METHOD));
        register_external_symbol(SENTENCIFY_STRING);
        define_test_case_table_int(NEW_DOCUMENT, list(new SubLObject[]{ $TEST, $sym536$DOCUMENT_SENTENCE_COUNT_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list538);
        define_test_case_table_int(TEST_CONSTRUCT_STRING_FROM_WORDS, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list540);
        return NIL;
    }

    static private final SubLString $str_alt471$_s_ = makeString("\\s)");

    static private final SubLString $str_alt472$_1 = makeString("\\1");

    static private final SubLString $str_alt473$__s_w = makeString("(\\s\\w");

    static private final SubLString $str_alt474$_____w__w = makeString("([^-\\w]\\w");

    static private final SubLString $str_alt475$__s_w___s__ = makeString("(\\s\\w\\.\\s+)");

    static private final SubLString $str_alt476$_________ = makeString("(\\.\\.\\. )");

    static private final SubLString $str_alt477$____lower____ = makeString("([[:lower:]])");

    static private final SubLString $str_alt478$_1_2 = makeString("\\1\\2");

    static private final SubLString $str_alt479$_____ = makeString("([\'\"]");

    static private final SubLString $str_alt480$_____s__ = makeString("[\'\"]\\s+)");

    static private final SubLString $str_alt481$______s__ = makeString("([\"\']\\s*)");

    static private final SubLString $str_alt482$__s____lower____ = makeString("(\\s*[[:lower:]])");

    static private final SubLString $str_alt483$__s___s_ = makeString("(\\s\\.\\s)");

    static private final SubLString $str_alt484$__s__ = makeString("(\\s*)");

    static private final SubLString $str_alt485$__s = makeString("(\\s");

    static private final SubLString $str_alt486$__D_d___ = makeString("(\\D\\d+)(");

    static private final SubLString $str_alt487$___s__ = makeString(")(\\s+)");

    static private final SubLString $str_alt488$_3 = makeString("\\3");

    static private final SubLString $str_alt489$___w = makeString("(\'\\w");

    static private final SubLString $str_alt490$___s_ = makeString(")(\\s)");

    static private final SubLString $str_alt491$_2 = makeString("\\2");

    static private final SubLString $str_alt492$__sno_____s______d_ = makeString("(\\sno\\.)(\\s+)(?!\\d)");

    static private final SubLList $list_alt493 = list(makeKeyword("CASELESS"));

    static private final SubLString $str_alt494$__ap___m___s______upper____ = makeString("([ap]\\.m\\.\\s+)([[:upper:]])");

    static private final SubLList $list_alt495 = cons(makeSymbol("PATTERN"), makeSymbol("SUBSTITUTION"));

    static private final SubLString $str_alt496$Can_t_finalize__a__not_a_regular_ = makeString("Can't finalize ~a: not a regular expression pattern");

    static private final SubLString $str_alt498$__b = makeString("(\\b");

    static private final SubLList $list_alt499 = list(makeSymbol("RE"), makeSymbol("SUBSTITUTION"), makeSymbol("OPTIONS"));

    static private final SubLString $str_alt500$Can_t_compile_regular_expression_ = makeString("Can't compile regular expression ~a: ~a");

    @Override
    public void declareFunctions() {
        declare_document_file();
    }

    @Override
    public void initializeVariables() {
        init_document_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_document_file();
    }

    static {
    }

    public static final class $sign_native extends SubLStructNative {
        public SubLObject $string;

        public SubLObject $type;

        public SubLObject $info;

        public SubLObject $category;

        public SubLObject $constituents;

        public SubLObject $offset;

        public SubLObject $mother;

        private static final SubLStructDeclNative structDecl;

        public $sign_native() {
            document.$sign_native.this.$string = Lisp.NIL;
            document.$sign_native.this.$type = Lisp.NIL;
            document.$sign_native.this.$info = Lisp.NIL;
            document.$sign_native.this.$category = Lisp.NIL;
            document.$sign_native.this.$constituents = Lisp.NIL;
            document.$sign_native.this.$offset = Lisp.NIL;
            document.$sign_native.this.$mother = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return document.$sign_native.this.$string;
        }

        @Override
        public SubLObject getField3() {
            return document.$sign_native.this.$type;
        }

        @Override
        public SubLObject getField4() {
            return document.$sign_native.this.$info;
        }

        @Override
        public SubLObject getField5() {
            return document.$sign_native.this.$category;
        }

        @Override
        public SubLObject getField6() {
            return document.$sign_native.this.$constituents;
        }

        @Override
        public SubLObject getField7() {
            return document.$sign_native.this.$offset;
        }

        @Override
        public SubLObject getField8() {
            return document.$sign_native.this.$mother;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return document.$sign_native.this.$string = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return document.$sign_native.this.$type = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return document.$sign_native.this.$info = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return document.$sign_native.this.$category = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return document.$sign_native.this.$constituents = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return document.$sign_native.this.$offset = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return document.$sign_native.this.$mother = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.document.$sign_native.class, SIGN, SIGN_P, $list3, $list4, new String[]{ "$string", "$type", "$info", "$category", "$constituents", "$offset", "$mother" }, $list5, $list6, SIGN_PRINT);
        }
    }

    public static final class $sign_p$UnaryFunction extends UnaryFunction {
        public $sign_p$UnaryFunction() {
            super(extractFunctionNamed("SIGN-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sign_p(arg1);
        }
    }

    public static final class $html_string_wordify_state_native extends SubLStructNative {
        public SubLObject $state;

        public SubLObject $tag_pieces;

        public SubLObject $string_pieces;

        public SubLObject $punctuation_pieces;

        public SubLObject $leading_tags;

        public SubLObject $following_tags;

        public SubLObject $current_offset;

        private static final SubLStructDeclNative structDecl;

        public $html_string_wordify_state_native() {
            document.$html_string_wordify_state_native.this.$state = Lisp.NIL;
            document.$html_string_wordify_state_native.this.$tag_pieces = Lisp.NIL;
            document.$html_string_wordify_state_native.this.$string_pieces = Lisp.NIL;
            document.$html_string_wordify_state_native.this.$punctuation_pieces = Lisp.NIL;
            document.$html_string_wordify_state_native.this.$leading_tags = Lisp.NIL;
            document.$html_string_wordify_state_native.this.$following_tags = Lisp.NIL;
            document.$html_string_wordify_state_native.this.$current_offset = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return document.$html_string_wordify_state_native.this.$state;
        }

        @Override
        public SubLObject getField3() {
            return document.$html_string_wordify_state_native.this.$tag_pieces;
        }

        @Override
        public SubLObject getField4() {
            return document.$html_string_wordify_state_native.this.$string_pieces;
        }

        @Override
        public SubLObject getField5() {
            return document.$html_string_wordify_state_native.this.$punctuation_pieces;
        }

        @Override
        public SubLObject getField6() {
            return document.$html_string_wordify_state_native.this.$leading_tags;
        }

        @Override
        public SubLObject getField7() {
            return document.$html_string_wordify_state_native.this.$following_tags;
        }

        @Override
        public SubLObject getField8() {
            return document.$html_string_wordify_state_native.this.$current_offset;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return document.$html_string_wordify_state_native.this.$state = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return document.$html_string_wordify_state_native.this.$tag_pieces = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return document.$html_string_wordify_state_native.this.$string_pieces = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return document.$html_string_wordify_state_native.this.$punctuation_pieces = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return document.$html_string_wordify_state_native.this.$leading_tags = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return document.$html_string_wordify_state_native.this.$following_tags = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return document.$html_string_wordify_state_native.this.$current_offset = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.document.$html_string_wordify_state_native.class, HTML_STRING_WORDIFY_STATE, HTML_STRING_WORDIFY_STATE_P, $list80, $list81, new String[]{ "$state", "$tag_pieces", "$string_pieces", "$punctuation_pieces", "$leading_tags", "$following_tags", "$current_offset" }, $list82, $list83, PRINT_HSW_STATE);
        }
    }

    public static final class $html_string_wordify_state_p$UnaryFunction extends UnaryFunction {
        public $html_string_wordify_state_p$UnaryFunction() {
            super(extractFunctionNamed("HTML-STRING-WORDIFY-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return html_string_wordify_state_p(arg1);
        }
    }

    public static final class $paragraph_p$UnaryFunction extends UnaryFunction {
        public $paragraph_p$UnaryFunction() {
            super(extractFunctionNamed("PARAGRAPH-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return paragraph_p(arg1);
        }
    }

    public static final class $document_native extends SubLStructNative {
        public SubLObject $paragraphs;

        private static final SubLStructDeclNative structDecl;

        public $document_native() {
            document.$document_native.this.$paragraphs = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return document.$document_native.this.$paragraphs;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return document.$document_native.this.$paragraphs = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.document.$document_native.class, DOCUMENT, DOCUMENT_P, $list185, $list186, new String[]{ "$paragraphs" }, $list187, $list188, DOCUMENT_PRINT);
        }
    }

    public static final class $document_p$UnaryFunction extends UnaryFunction {
        public $document_p$UnaryFunction() {
            super(extractFunctionNamed("DOCUMENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return document_p(arg1);
        }
    }
}

/**
 * Total time: 1754 ms synthetic
 */
