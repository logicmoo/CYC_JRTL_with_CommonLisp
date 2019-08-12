/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.leader;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cycl_utilities.*;
import static com.cyc.cycjava.cycl.cyclifier.*;
import static com.cyc.cycjava.cycl.cycml_generator.*;
import static com.cyc.cycjava.cycl.document.*;
import static com.cyc.cycjava.cycl.forts.*;
import static com.cyc.cycjava.cycl.instances.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.methods.*;
import static com.cyc.cycjava.cycl.object.*;
import static com.cyc.cycjava.cycl.parse_tree.*;
import static com.cyc.cycjava.cycl.parser.*;
import static com.cyc.cycjava.cycl.parsing_utilities.*;
import static com.cyc.cycjava.cycl.semtrans_lexicon.*;
import static com.cyc.cycjava.cycl.stacks.*;
import static com.cyc.cycjava.cycl.string_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.subl_promotions.*;
import static com.cyc.cycjava.cycl.web_utilities.*;
import static com.cyc.cycjava.cycl.word_tree.*;
import static com.cyc.cycjava.cycl.xml_vars.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PARSE-TREE-GUI
 * source file: /cyc/top/cycl/leader/parse-tree-gui.lisp
 * created:     2019/07/03 17:38:56
 */
public final class parse_tree_gui extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt110$ = makeString("");

    public static final class $gui_enabled_sentence_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.this.$surface_string;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.this.$gui_tokens;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.this.$full_parse_tree;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.this.$current_parse_tree;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.this.$token_mapping;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.this.$parent_document;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.this.$surface_string = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.this.$gui_tokens = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.this.$full_parse_tree = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.this.$current_parse_tree = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.this.$token_mapping = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.this.$parent_document = value;
        }

        public SubLObject $surface_string = Lisp.NIL;

        public SubLObject $gui_tokens = Lisp.NIL;

        public SubLObject $full_parse_tree = Lisp.NIL;

        public SubLObject $current_parse_tree = Lisp.NIL;

        public SubLObject $token_mapping = Lisp.NIL;

        public SubLObject $parent_document = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.class, GUI_ENABLED_SENTENCE, GUI_ENABLED_SENTENCE_P, $list_alt25, $list_alt26, new String[]{ "$surface_string", "$gui_tokens", "$full_parse_tree", "$current_parse_tree", "$token_mapping", "$parent_document" }, $list_alt27, $list_alt28, PPRINT_GES);
    }

    public static final class $gui_enabled_document_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_document_native.this.$sentences;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_document_native.this.$parser;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_document_native.this.$lexicon;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_document_native.this.$sentences = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_document_native.this.$parser = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_document_native.this.$lexicon = value;
        }

        public SubLObject $sentences = Lisp.NIL;

        public SubLObject $parser = Lisp.NIL;

        public SubLObject $lexicon = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_document_native.class, GUI_ENABLED_DOCUMENT, GUI_ENABLED_DOCUMENT_P, $list_alt3, $list_alt4, new String[]{ "$sentences", "$parser", "$lexicon" }, $list_alt5, $list_alt6, PPRINT_GED);
    }

    public static final SubLFile me = new parse_tree_gui();

 public static final String myName = "com.cyc.cycjava.cycl.leader.parse_tree_gui";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $stop_word_categories$ = makeSymbol("*STOP-WORD-CATEGORIES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_gui_enabled_document$ = makeSymbol("*DTP-GUI-ENABLED-DOCUMENT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_gui_enabled_sentence$ = makeSymbol("*DTP-GUI-ENABLED-SENTENCE*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $token_index$ = makeSymbol("*TOKEN-INDEX*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(new SubLObject[]{ makeKeyword("DT"), makeKeyword("CC"), makeKeyword("PRP"), makeKeyword("."), makeKeyword(","), makeKeyword(":"), makeKeyword("''"), makeKeyword("``"), makeKeyword("'"), makeKeyword("`"), makeKeyword("("), makeKeyword(")"), makeKeyword("-LRB-"), makeKeyword("-RRB-"), makeKeyword("LS") });

    private static final SubLSymbol GUI_ENABLED_DOCUMENT = makeSymbol("GUI-ENABLED-DOCUMENT");

    private static final SubLSymbol GUI_ENABLED_DOCUMENT_P = makeSymbol("GUI-ENABLED-DOCUMENT-P");

    static private final SubLList $list3 = list(makeSymbol("SENTENCES"), makeSymbol("PARSER"), makeSymbol("LEXICON"));

    static private final SubLList $list4 = list(makeKeyword("SENTENCES"), makeKeyword("PARSER"), makeKeyword("LEXICON"));

    static private final SubLList $list5 = list(makeSymbol("GED-SENTENCES"), makeSymbol("GED-PARSER"), makeSymbol("GED-LEXICON"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-GED-SENTENCES"), makeSymbol("_CSETF-GED-PARSER"), makeSymbol("_CSETF-GED-LEXICON"));

    private static final SubLSymbol PPRINT_GED = makeSymbol("PPRINT-GED");

    private static final SubLSymbol GUI_ENABLED_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GUI-ENABLED-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GUI-ENABLED-DOCUMENT-P"));

    private static final SubLSymbol GED_SENTENCES = makeSymbol("GED-SENTENCES");

    private static final SubLSymbol _CSETF_GED_SENTENCES = makeSymbol("_CSETF-GED-SENTENCES");

    private static final SubLSymbol GED_PARSER = makeSymbol("GED-PARSER");

    private static final SubLSymbol _CSETF_GED_PARSER = makeSymbol("_CSETF-GED-PARSER");

    private static final SubLSymbol GED_LEXICON = makeSymbol("GED-LEXICON");

    private static final SubLSymbol _CSETF_GED_LEXICON = makeSymbol("_CSETF-GED-LEXICON");

    private static final SubLString $str19$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_GUI_ENABLED_DOCUMENT = makeSymbol("MAKE-GUI-ENABLED-DOCUMENT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_DOCUMENT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-DOCUMENT-METHOD");

    private static final SubLSymbol NEW_GUI_ENABLED_DOCUMENT = makeSymbol("NEW-GUI-ENABLED-DOCUMENT");

    private static final SubLSymbol ADD_SENTENCE_TO_GED = makeSymbol("ADD-SENTENCE-TO-GED");

    private static final SubLSymbol GED_SENTENCE_NUMBER = makeSymbol("GED-SENTENCE-NUMBER");

    private static final SubLSymbol GUI_ENABLED_SENTENCE = makeSymbol("GUI-ENABLED-SENTENCE");

    private static final SubLSymbol GUI_ENABLED_SENTENCE_P = makeSymbol("GUI-ENABLED-SENTENCE-P");

    private static final SubLList $list31 = list(makeSymbol("SURFACE-STRING"), makeSymbol("GUI-TOKENS"), makeSymbol("FULL-PARSE-TREE"), makeSymbol("CURRENT-PARSE-TREE"), makeSymbol("TOKEN-MAPPING"), makeSymbol("PARENT-DOCUMENT"));

    private static final SubLList $list32 = list(makeKeyword("SURFACE-STRING"), makeKeyword("GUI-TOKENS"), makeKeyword("FULL-PARSE-TREE"), makeKeyword("CURRENT-PARSE-TREE"), makeKeyword("TOKEN-MAPPING"), makeKeyword("PARENT-DOCUMENT"));

    private static final SubLList $list33 = list(makeSymbol("GES-SURFACE-STRING"), makeSymbol("GES-GUI-TOKENS"), makeSymbol("GES-FULL-PARSE-TREE"), makeSymbol("GES-CURRENT-PARSE-TREE"), makeSymbol("GES-TOKEN-MAPPING"), makeSymbol("GES-PARENT-DOCUMENT"));

    private static final SubLList $list34 = list(makeSymbol("_CSETF-GES-SURFACE-STRING"), makeSymbol("_CSETF-GES-GUI-TOKENS"), makeSymbol("_CSETF-GES-FULL-PARSE-TREE"), makeSymbol("_CSETF-GES-CURRENT-PARSE-TREE"), makeSymbol("_CSETF-GES-TOKEN-MAPPING"), makeSymbol("_CSETF-GES-PARENT-DOCUMENT"));

    private static final SubLSymbol PPRINT_GES = makeSymbol("PPRINT-GES");

    private static final SubLSymbol GUI_ENABLED_SENTENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GUI-ENABLED-SENTENCE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list37 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GUI-ENABLED-SENTENCE-P"));

    private static final SubLSymbol GES_SURFACE_STRING = makeSymbol("GES-SURFACE-STRING");

    private static final SubLSymbol _CSETF_GES_SURFACE_STRING = makeSymbol("_CSETF-GES-SURFACE-STRING");

    private static final SubLSymbol GES_GUI_TOKENS = makeSymbol("GES-GUI-TOKENS");

    private static final SubLSymbol _CSETF_GES_GUI_TOKENS = makeSymbol("_CSETF-GES-GUI-TOKENS");

    private static final SubLSymbol GES_FULL_PARSE_TREE = makeSymbol("GES-FULL-PARSE-TREE");

    private static final SubLSymbol _CSETF_GES_FULL_PARSE_TREE = makeSymbol("_CSETF-GES-FULL-PARSE-TREE");

    private static final SubLSymbol GES_CURRENT_PARSE_TREE = makeSymbol("GES-CURRENT-PARSE-TREE");

    private static final SubLSymbol _CSETF_GES_CURRENT_PARSE_TREE = makeSymbol("_CSETF-GES-CURRENT-PARSE-TREE");

    private static final SubLSymbol GES_TOKEN_MAPPING = makeSymbol("GES-TOKEN-MAPPING");

    private static final SubLSymbol _CSETF_GES_TOKEN_MAPPING = makeSymbol("_CSETF-GES-TOKEN-MAPPING");

    private static final SubLSymbol GES_PARENT_DOCUMENT = makeSymbol("GES-PARENT-DOCUMENT");

    private static final SubLSymbol _CSETF_GES_PARENT_DOCUMENT = makeSymbol("_CSETF-GES-PARENT-DOCUMENT");

    private static final SubLSymbol $FULL_PARSE_TREE = makeKeyword("FULL-PARSE-TREE");

    private static final SubLSymbol $CURRENT_PARSE_TREE = makeKeyword("CURRENT-PARSE-TREE");

    private static final SubLSymbol MAKE_GUI_ENABLED_SENTENCE = makeSymbol("MAKE-GUI-ENABLED-SENTENCE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_SENTENCE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-SENTENCE-METHOD");

    private static final SubLSymbol NEW_GUI_ENABLED_SENTENCE = makeSymbol("NEW-GUI-ENABLED-SENTENCE");

    private static final SubLSymbol REMOVE_REDUNDANT_LEXES = makeSymbol("REMOVE-REDUNDANT-LEXES");

    private static final SubLString $str63$__GED___S_sentences_ = makeString("#<GED: ~S sentences>");

    private static final SubLString $str64$___ = makeString("...");

    private static final SubLString $str65$__GES___S_ = makeString("#<GES: ~S>");

    private static final SubLSymbol SENTENCIFY_REMOTELY = makeSymbol("SENTENCIFY-REMOTELY");

    private static final SubLList $list67 = list(makeSymbol("SENTENCIFY-STRING"));

    private static final SubLString $str68$_sentencify_cgi = makeString("/sentencify.cgi");

    private static final SubLString $str70$_ = makeString("'");

    private static final SubLString $str71$_ = makeString("\"");

    private static final SubLString $$$string = makeString("string");

    private static final SubLString $str74$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$sentence = makeString("sentence");

    private static final SubLList $list79 = list(makeKeyword("LEXICON"), NIL);

    private static final SubLString $$$tokens = makeString("tokens");

    private static final SubLSymbol TO_XML = makeSymbol("TO-XML");

    private static final SubLString $$$parses = makeString("parses");

    private static final SubLString $str86$___S = makeString("~%~S");

    private static final SubLString $str89$cycl_annotated_document = makeString("cycl-annotated-document");

    private static final SubLSymbol FLUSH = makeSymbol("FLUSH");

    private static final SubLSymbol WORD_TREE = makeSymbol("WORD-TREE");

    private static final SubLList $list93 = list(makeKeyword("PUBLIC"));

    private static final SubLList $list94 = list(makeSymbol("XML-WRITER"));

    private static final SubLList $list95 = list(list(makeSymbol("CLET"), list(list(makeSymbol("*XML-STREAM*"), list(makeSymbol("GET-SLOT"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("OUTSTREAM")))), list(makeSymbol("ATTRIBUTES"), list(makeSymbol("LIST"), makeString("pos"), makeSymbol("CATEGORY"), makeString("token"), makeSymbol("STRING"))), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("LEXEME"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("LEXEME"), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS"))), makeSymbol("TERM")), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("SEMTRANS")), list(makeSymbol("PIF"), list(makeSymbol("MEMBER?"), list(makeSymbol("FIRST"), makeSymbol("SEMTRANS")), list(QUOTE, list(reader_make_constant_shell("isa"), reader_make_constant_shell("equals")))), list(makeSymbol("CSETQ"), makeSymbol("TERM"), list(makeSymbol("THIRD"), makeSymbol("SEMTRANS"))), list(makeSymbol("CSOME"), list(makeSymbol("CLAUSE"), makeSymbol("SEMTRANS"), makeSymbol("TERM")), list(makeSymbol("PWHEN"), list(makeSymbol("LISTP"), makeSymbol("CLAUSE")), list(makeSymbol("PWHEN"), list(EQ, reader_make_constant_shell("isa"), list(makeSymbol("FIRST"), makeSymbol("CLAUSE"))), list(makeSymbol("CSETQ"), makeSymbol("TERM"), list(makeSymbol("THIRD"), makeSymbol("CLAUSE")))))))), list(makeSymbol("PWHEN"), list(makeSymbol("FORT-P"), makeSymbol("TERM")), list(makeSymbol("CPUSH"), makeSymbol("TERM"), makeSymbol("CYCLS"))))), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("START-TAG")), makeString("token"), makeSymbol("ATTRIBUTES"), NIL, T), list(makeSymbol("CDOLIST"), list(makeSymbol("CYCL"), makeSymbol("CYCLS")), list(makeSymbol("CYCML-SERIALIZE-OBJECT"), makeSymbol("CYCL"))), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("END-TAG")), makeString("token"), NIL, T)));

    private static final SubLSymbol $sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLString $$$pos = makeString("pos");

    private static final SubLString $$$token = makeString("token");

    private static final SubLList $list101 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("equals"));



    private static final SubLSymbol WORD_TREE_TO_XML_METHOD = makeSymbol("WORD-TREE-TO-XML-METHOD");

    private static final SubLSymbol GET_GES_ANNOTATED_LEAVES = makeSymbol("GET-GES-ANNOTATED-LEAVES");

    private static final SubLSymbol REMOVAL_LAMBDA = makeSymbol("REMOVAL-LAMBDA");

    private static final SubLSymbol GET_GED_ANNOTATED_TREE = makeSymbol("GET-GED-ANNOTATED-TREE");

    private static final SubLSymbol GET_GES_ANNOTATED_TREE = makeSymbol("GET-GES-ANNOTATED-TREE");

    private static final SubLSymbol GET_PATH = makeSymbol("GET-PATH");

    private static final SubLSymbol GES_WORD_STRING = makeSymbol("GES-WORD-STRING");

    private static final SubLSymbol TRIM_WHITESPACE = makeSymbol("TRIM-WHITESPACE");

    private static final SubLString $str119$ = makeString("");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol $sym121$SUBSTRING_ = makeSymbol("SUBSTRING?");

    private static final SubLSymbol GET_GED_ANNOTATED_LEAVES = makeSymbol("GET-GED-ANNOTATED-LEAVES");

    private static final SubLSymbol SELECT_SENSE_FOR_WORD = makeSymbol("SELECT-SENSE-FOR-WORD");

    private static final SubLSymbol GET_NTH_WORD = makeSymbol("GET-NTH-WORD");

    private static final SubLString $str125$Attempted_to_set_sense__A__but_on = makeString("Attempted to set sense ~A, but only ~A lexes");

    private static final SubLSymbol FIND_WORD_INDEX_FROM_PATH = makeSymbol("FIND-WORD-INDEX-FROM-PATH");

    private static final SubLSymbol PRUNE_GES_BY_WFF_CHECKING = makeSymbol("PRUNE-GES-BY-WFF-CHECKING");

    private static final SubLSymbol NAIVE_WFF_SELF_PRUNE = makeSymbol("NAIVE-WFF-SELF-PRUNE");

    private static final SubLSymbol LEX_ENTRY_EQUALP = makeSymbol("LEX-ENTRY-EQUALP");

    private static final SubLSymbol PRUNE_GED_SENTENCE_BY_WFF_CHECKING = makeSymbol("PRUNE-GED-SENTENCE-BY-WFF-CHECKING");

    private static final SubLSymbol CYCLIFY_GED_SENTENCE = makeSymbol("CYCLIFY-GED-SENTENCE");

    private static final SubLList $list134 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PARSES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCLIFY")), list(QUOTE, list(makeKeyword("LEXICON"), NIL)))), list(makeSymbol("WFF-TERMS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("PARSE"), makeSymbol("PARSES")), list(makeSymbol("CLET"), list(list(makeSymbol("TERMS"), list(makeSymbol("FLATTEN"), makeSymbol("PARSE")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TERM"), makeSymbol("TERMS")), list(makeSymbol("PWHEN"), list(makeSymbol("FORT-P"), makeSymbol("TERM")), list(makeSymbol("CPUSHNEW"), makeSymbol("TERM"), makeSymbol("WFF-TERMS")))))), list(makeSymbol("PWHEN"), makeSymbol("WFF-TERMS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PRUNE-LEXES")), makeSymbol("WFF-TERMS"))), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol PRUNE_LEXES = makeSymbol("PRUNE-LEXES");

    private static final SubLSymbol PARSE_TREE_NAIVE_WFF_SELF_PRUNE_METHOD = makeSymbol("PARSE-TREE-NAIVE-WFF-SELF-PRUNE-METHOD");

    private static final SubLList $list137 = list(makeSymbol("WFF-TERMS"));

    static private final SubLList $list138 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ACCEPTED"), NIL), list(makeSymbol("REJECTED"), NIL), list(makeSymbol("TO-REDISTRIBUTE"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS-TERMS"), list(makeSymbol("FLATTEN"), list(makeSymbol("EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")))))), list(makeSymbol("PCOND"), list(list(makeSymbol("INTERSECTION"), makeSymbol("SEMTRANS-TERMS"), makeSymbol("WFF-TERMS")), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("ACCEPTED"))), list(T, list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("REJECTED")), list(makeSymbol("CINC"), makeSymbol("TO-REDISTRIBUTE"), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("RLE"))))))), list(makeSymbol("PUNLESS"), list(makeSymbol("NULL"), makeSymbol("ACCEPTED")), list(makeSymbol("CLET"), list(list(makeSymbol("ADDENDUM"), list(makeSymbol("/"), makeSymbol("TO-REDISTRIBUTE"), list(makeSymbol("LENGTH"), makeSymbol("ACCEPTED"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("A"), makeSymbol("ACCEPTED")), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("A"), list(makeSymbol("+"), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("A")), makeSymbol("ADDENDUM")))))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("ACCEPTED")), list(RET, makeSymbol("REJECTED"))));

    static private final SubLSymbol $sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol WORD_TREE_PRUNE_LEXES_METHOD = makeSymbol("WORD-TREE-PRUNE-LEXES-METHOD");

    private static final SubLList $list141 = list(makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC"));

    private static final SubLList $list142 = list(list(makeSymbol("DO-PARSE-TREE-SUBTREES"), list(makeSymbol("DAUGHTER"), makeSymbol("SELF")), list(makeSymbol("PWHEN"), list(makeSymbol("WORD-TREE-P"), makeSymbol("DAUGHTER")), list(makeSymbol("FIM"), makeSymbol("DAUGHTER"), list(QUOTE, makeSymbol("REMOVE-REDUNDANT-LEXES"))))), list(RET, makeSymbol("SELF")));

    private static final SubLString $str145$_S_is_not_one_of__S = makeString("~S is not one of ~S");

    private static final SubLSymbol PARSE_TREE_REMOVE_REDUNDANT_LEXES_METHOD = makeSymbol("PARSE-TREE-REMOVE-REDUNDANT-LEXES-METHOD");

    static private final SubLList $list147 = list(list(makeSymbol("PIF"), list(EQ, makeKeyword("TO"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CATEGORY")))), list(makeSymbol("CLET"), list(list(makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MOTHER"))))), list(makeSymbol("PWHEN"), list(EQ, makeKeyword("VP"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-CATEGORY")))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), NIL))), list(makeSymbol("CLET"), list(list(makeSymbol("NON-REDUNDANT"), NIL), list(makeSymbol("TO-REDISTRIBUTE"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS"), list(makeSymbol("HL-TO-EL"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS")))), makeSymbol("FAIL")), list(makeSymbol("CSOME"), list(makeSymbol("OLD-RLE"), makeSymbol("NON-REDUNDANT"), makeSymbol("FAIL")), list(makeSymbol("CLET"), list(list(makeSymbol("OLD-SEMTRANS"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("OLD-RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS")))), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), list(EQUALP, makeSymbol("SEMTRANS"), makeSymbol("OLD-SEMTRANS"))))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("NON-REDUNDANT"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("NULL"), makeSymbol("NON-REDUNDANT")), list(makeSymbol("CLET"), list(list(makeSymbol("ADDENDUM"), list(makeSymbol("/"), makeSymbol("TO-REDISTRIBUTE"), list(makeSymbol("LENGTH"), makeSymbol("NON-REDUNDANT"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("NR"), makeSymbol("NON-REDUNDANT")), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("NR"), list(makeSymbol("+"), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("NR")), makeSymbol("ADDENDUM")))))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("NON-REDUNDANT")))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol $sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol WORD_TREE_REMOVE_REDUNDANT_LEXES_METHOD = makeSymbol("WORD-TREE-REMOVE-REDUNDANT-LEXES-METHOD");

    private static final SubLSymbol PHRASE_TREE = makeSymbol("PHRASE-TREE");

    private static final SubLList $list154 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("YIELD")))), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("PRUNE-LEXES")), makeSymbol("WFF-TERMS"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol PHRASE_TREE_PRUNE_LEXES_METHOD = makeSymbol("PHRASE-TREE-PRUNE-LEXES-METHOD");

    private static final SubLList $list156 = list(makeSymbol("INTEGER"));

    private static final SubLList $list157 = list(list(makeSymbol("CLET"), list(list(makeSymbol("YIELD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("YIELD"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("INTEGER"), list(makeSymbol("LENGTH"), makeSymbol("YIELD"))), list(makeSymbol("WARN"), makeString("Attempted to get the ~A word, but there are only ~A words."), makeSymbol("INTEGER"), list(makeSymbol("LENGTH"), makeSymbol("YIELD"))), list(RET, NIL)), list(RET, list(makeSymbol("NTH"), makeSymbol("INTEGER"), makeSymbol("YIELD")))));

    private static final SubLString $str158$Attempted_to_get_the__A_word__but = makeString("Attempted to get the ~A word, but there are only ~A words.");

    private static final SubLSymbol PHRASE_TREE_GET_NTH_WORD_METHOD = makeSymbol("PHRASE-TREE-GET-NTH-WORD-METHOD");

    public static final SubLObject stop_word_p_alt(SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_promotions.memberP(category, $stop_word_categories$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject stop_word_p(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != memberP(category, parse_tree_gui.$stop_word_categories$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject gui_enabled_document_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.leader.parse_tree_gui.pprint_ged(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject gui_enabled_document_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        parse_tree_gui.pprint_ged(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject gui_enabled_document_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_document_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject gui_enabled_document_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_document_native.class ? T : NIL;
    }

    public static final SubLObject ged_sentences_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_DOCUMENT_P);
        return v_object.getField2();
    }

    public static SubLObject ged_sentences(final SubLObject v_object) {
        assert NIL != parse_tree_gui.gui_enabled_document_p(v_object) : "! parse_tree_gui.gui_enabled_document_p(v_object) " + "parse_tree_gui.gui_enabled_document_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ged_parser_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_DOCUMENT_P);
        return v_object.getField3();
    }

    public static SubLObject ged_parser(final SubLObject v_object) {
        assert NIL != parse_tree_gui.gui_enabled_document_p(v_object) : "! parse_tree_gui.gui_enabled_document_p(v_object) " + "parse_tree_gui.gui_enabled_document_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ged_lexicon_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_DOCUMENT_P);
        return v_object.getField4();
    }

    public static SubLObject ged_lexicon(final SubLObject v_object) {
        assert NIL != parse_tree_gui.gui_enabled_document_p(v_object) : "! parse_tree_gui.gui_enabled_document_p(v_object) " + "parse_tree_gui.gui_enabled_document_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_ged_sentences_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_DOCUMENT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ged_sentences(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_tree_gui.gui_enabled_document_p(v_object) : "! parse_tree_gui.gui_enabled_document_p(v_object) " + "parse_tree_gui.gui_enabled_document_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ged_parser_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_DOCUMENT_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ged_parser(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_tree_gui.gui_enabled_document_p(v_object) : "! parse_tree_gui.gui_enabled_document_p(v_object) " + "parse_tree_gui.gui_enabled_document_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ged_lexicon_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_DOCUMENT_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ged_lexicon(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_tree_gui.gui_enabled_document_p(v_object) : "! parse_tree_gui.gui_enabled_document_p(v_object) " + "parse_tree_gui.gui_enabled_document_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_gui_enabled_document_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_document_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SENTENCES)) {
                        com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ged_sentences(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PARSER)) {
                            com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ged_parser(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LEXICON)) {
                                com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ged_lexicon(v_new, current_value);
                            } else {
                                Errors.error($str_alt18$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_gui_enabled_document(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_document_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SENTENCES)) {
                parse_tree_gui._csetf_ged_sentences(v_new, current_value);
            } else
                if (pcase_var.eql($PARSER)) {
                    parse_tree_gui._csetf_ged_parser(v_new, current_value);
                } else
                    if (pcase_var.eql($LEXICON)) {
                        parse_tree_gui._csetf_ged_lexicon(v_new, current_value);
                    } else {
                        Errors.error(parse_tree_gui.$str19$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_gui_enabled_document(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, parse_tree_gui.MAKE_GUI_ENABLED_DOCUMENT, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SENTENCES, parse_tree_gui.ged_sentences(obj));
        funcall(visitor_fn, obj, $SLOT, $PARSER, parse_tree_gui.ged_parser(obj));
        funcall(visitor_fn, obj, $SLOT, $LEXICON, parse_tree_gui.ged_lexicon(obj));
        funcall(visitor_fn, obj, $END, parse_tree_gui.MAKE_GUI_ENABLED_DOCUMENT, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_gui_enabled_document_method(final SubLObject obj, final SubLObject visitor_fn) {
        return parse_tree_gui.visit_defstruct_gui_enabled_document(obj, visitor_fn);
    }

    public static final SubLObject new_gui_enabled_document_alt(SubLObject size, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = object.new_class_instance(CYCLIFIER_LEXICON);
        }
        {
            SubLObject ged = com.cyc.cycjava.cycl.leader.parse_tree_gui.make_gui_enabled_document(UNPROVIDED);
            SubLObject v_parser = parser.new_stanford_parser(UNPROVIDED, UNPROVIDED);
            SubLObject sentence_vector = make_vector(size, UNPROVIDED);
            com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ged_sentences(ged, sentence_vector);
            com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ged_parser(ged, v_parser);
            com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ged_lexicon(ged, lexicon);
            return ged;
        }
    }

    public static SubLObject new_gui_enabled_document(final SubLObject size, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = new_class_instance(CYCLIFIER_LEXICON);
        }
        final SubLObject ged = parse_tree_gui.make_gui_enabled_document(UNPROVIDED);
        final SubLObject v_parser = new_stanford_parser(UNPROVIDED, UNPROVIDED);
        final SubLObject sentence_vector = make_vector(size, UNPROVIDED);
        parse_tree_gui._csetf_ged_sentences(ged, sentence_vector);
        parse_tree_gui._csetf_ged_parser(ged, v_parser);
        parse_tree_gui._csetf_ged_lexicon(ged, lexicon);
        return ged;
    }

    public static final SubLObject add_sentence_to_ged_alt(SubLObject ged, SubLObject sentence_string, SubLObject index) {
        {
            SubLObject ges = com.cyc.cycjava.cycl.leader.parse_tree_gui.new_gui_enabled_sentence(sentence_string, ged, com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_parser(ged));
            SubLObject sentence_vector = com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_sentences(ged);
            SubLObject successP = NIL;
            set_aref(sentence_vector, index, ges);
            if ((NIL != com.cyc.cycjava.cycl.leader.parse_tree_gui.gui_enabled_sentence_p(ges)) && (NIL != parse_tree.parse_tree_p(com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_full_parse_tree(ges)))) {
                successP = T;
            }
            return successP;
        }
    }

    public static SubLObject add_sentence_to_ged(final SubLObject ged, final SubLObject sentence_string, final SubLObject index) {
        final SubLObject ges = parse_tree_gui.new_gui_enabled_sentence(sentence_string, ged, parse_tree_gui.ged_parser(ged));
        final SubLObject sentence_vector = parse_tree_gui.ged_sentences(ged);
        SubLObject successP = NIL;
        set_aref(sentence_vector, index, ges);
        if ((NIL != parse_tree_gui.gui_enabled_sentence_p(ges)) && (NIL != parse_tree_p(parse_tree_gui.ges_full_parse_tree(ges)))) {
            successP = T;
        }
        return successP;
    }

    public static final SubLObject ged_sentence_number_alt(SubLObject ged) {
        return length(com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_sentences(ged));
    }

    public static SubLObject ged_sentence_number(final SubLObject ged) {
        return length(parse_tree_gui.ged_sentences(ged));
    }

    public static final SubLObject gui_enabled_sentence_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.leader.parse_tree_gui.pprint_ges(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject gui_enabled_sentence_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        parse_tree_gui.pprint_ges(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject gui_enabled_sentence_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject gui_enabled_sentence_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native.class ? T : NIL;
    }

    public static final SubLObject ges_surface_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_SENTENCE_P);
        return v_object.getField2();
    }

    public static SubLObject ges_surface_string(final SubLObject v_object) {
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(v_object) : "! parse_tree_gui.gui_enabled_sentence_p(v_object) " + "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ges_gui_tokens_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_SENTENCE_P);
        return v_object.getField3();
    }

    public static SubLObject ges_gui_tokens(final SubLObject v_object) {
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(v_object) : "! parse_tree_gui.gui_enabled_sentence_p(v_object) " + "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ges_full_parse_tree_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_SENTENCE_P);
        return v_object.getField4();
    }

    public static SubLObject ges_full_parse_tree(final SubLObject v_object) {
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(v_object) : "! parse_tree_gui.gui_enabled_sentence_p(v_object) " + "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ges_current_parse_tree_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_SENTENCE_P);
        return v_object.getField5();
    }

    public static SubLObject ges_current_parse_tree(final SubLObject v_object) {
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(v_object) : "! parse_tree_gui.gui_enabled_sentence_p(v_object) " + "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject ges_token_mapping_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_SENTENCE_P);
        return v_object.getField6();
    }

    public static SubLObject ges_token_mapping(final SubLObject v_object) {
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(v_object) : "! parse_tree_gui.gui_enabled_sentence_p(v_object) " + "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject ges_parent_document_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_SENTENCE_P);
        return v_object.getField7();
    }

    public static SubLObject ges_parent_document(final SubLObject v_object) {
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(v_object) : "! parse_tree_gui.gui_enabled_sentence_p(v_object) " + "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_ges_surface_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_SENTENCE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ges_surface_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(v_object) : "! parse_tree_gui.gui_enabled_sentence_p(v_object) " + "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ges_gui_tokens_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_SENTENCE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ges_gui_tokens(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(v_object) : "! parse_tree_gui.gui_enabled_sentence_p(v_object) " + "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ges_full_parse_tree_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_SENTENCE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ges_full_parse_tree(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(v_object) : "! parse_tree_gui.gui_enabled_sentence_p(v_object) " + "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ges_current_parse_tree_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_SENTENCE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ges_current_parse_tree(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(v_object) : "! parse_tree_gui.gui_enabled_sentence_p(v_object) " + "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ges_token_mapping_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_SENTENCE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ges_token_mapping(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(v_object) : "! parse_tree_gui.gui_enabled_sentence_p(v_object) " + "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_ges_parent_document_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GUI_ENABLED_SENTENCE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_ges_parent_document(final SubLObject v_object, final SubLObject value) {
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(v_object) : "! parse_tree_gui.gui_enabled_sentence_p(v_object) " + "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_gui_enabled_sentence_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SURFACE_STRING)) {
                        com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ges_surface_string(v_new, current_value);
                    } else {
                        if (pcase_var.eql($GUI_TOKENS)) {
                            com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ges_gui_tokens(v_new, current_value);
                        } else {
                            if (pcase_var.eql($FULL_PARSE_TREE)) {
                                com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ges_full_parse_tree(v_new, current_value);
                            } else {
                                if (pcase_var.eql($CURRENT_PARSE_TREE)) {
                                    com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ges_current_parse_tree(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($TOKEN_MAPPING)) {
                                        com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ges_token_mapping(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PARENT_DOCUMENT)) {
                                            com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ges_parent_document(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt18$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_gui_enabled_sentence(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.leader.parse_tree_gui.$gui_enabled_sentence_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SURFACE_STRING)) {
                parse_tree_gui._csetf_ges_surface_string(v_new, current_value);
            } else
                if (pcase_var.eql($GUI_TOKENS)) {
                    parse_tree_gui._csetf_ges_gui_tokens(v_new, current_value);
                } else
                    if (pcase_var.eql(parse_tree_gui.$FULL_PARSE_TREE)) {
                        parse_tree_gui._csetf_ges_full_parse_tree(v_new, current_value);
                    } else
                        if (pcase_var.eql(parse_tree_gui.$CURRENT_PARSE_TREE)) {
                            parse_tree_gui._csetf_ges_current_parse_tree(v_new, current_value);
                        } else
                            if (pcase_var.eql($TOKEN_MAPPING)) {
                                parse_tree_gui._csetf_ges_token_mapping(v_new, current_value);
                            } else
                                if (pcase_var.eql($PARENT_DOCUMENT)) {
                                    parse_tree_gui._csetf_ges_parent_document(v_new, current_value);
                                } else {
                                    Errors.error(parse_tree_gui.$str19$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_gui_enabled_sentence(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, parse_tree_gui.MAKE_GUI_ENABLED_SENTENCE, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SURFACE_STRING, parse_tree_gui.ges_surface_string(obj));
        funcall(visitor_fn, obj, $SLOT, $GUI_TOKENS, parse_tree_gui.ges_gui_tokens(obj));
        funcall(visitor_fn, obj, $SLOT, parse_tree_gui.$FULL_PARSE_TREE, parse_tree_gui.ges_full_parse_tree(obj));
        funcall(visitor_fn, obj, $SLOT, parse_tree_gui.$CURRENT_PARSE_TREE, parse_tree_gui.ges_current_parse_tree(obj));
        funcall(visitor_fn, obj, $SLOT, $TOKEN_MAPPING, parse_tree_gui.ges_token_mapping(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT_DOCUMENT, parse_tree_gui.ges_parent_document(obj));
        funcall(visitor_fn, obj, $END, parse_tree_gui.MAKE_GUI_ENABLED_SENTENCE, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_gui_enabled_sentence_method(final SubLObject obj, final SubLObject visitor_fn) {
        return parse_tree_gui.visit_defstruct_gui_enabled_sentence(obj, visitor_fn);
    }

    public static final SubLObject new_gui_enabled_sentence_alt(SubLObject sentence_string, SubLObject v_document, SubLObject v_parser) {
        {
            SubLObject ges = com.cyc.cycjava.cycl.leader.parse_tree_gui.make_gui_enabled_sentence(UNPROVIDED);
            SubLObject full_tree = methods.funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
            SubLObject current_tree = methods.funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
            SubLObject lexicon = com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_lexicon(v_document);
            methods.funcall_instance_method_with_1_args(lexicon, LEARN, sentence_string);
            if (NIL != parse_tree.parse_tree_p(full_tree)) {
                methods.funcall_instance_method_with_1_args(full_tree, LEXIFY, lexicon);
                methods.funcall_instance_method_with_0_args(full_tree, REMOVE_REDUNDANT_LEXES);
                methods.funcall_instance_method_with_1_args(current_tree, LEXIFY, lexicon);
                methods.funcall_instance_method_with_0_args(current_tree, REMOVE_REDUNDANT_LEXES);
            }
            com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ges_parent_document(ges, v_document);
            com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ges_surface_string(ges, sentence_string);
            com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ges_full_parse_tree(ges, full_tree);
            com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ges_current_parse_tree(ges, current_tree);
            com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ges_gui_tokens(ges, com.cyc.cycjava.cycl.leader.parse_tree_gui.create_token_list(ges));
            com.cyc.cycjava.cycl.leader.parse_tree_gui._csetf_ges_token_mapping(ges, com.cyc.cycjava.cycl.leader.parse_tree_gui.create_ges_token_mapping(ges));
            return ges;
        }
    }

    public static SubLObject new_gui_enabled_sentence(final SubLObject sentence_string, final SubLObject v_document, final SubLObject v_parser) {
        final SubLObject ges = parse_tree_gui.make_gui_enabled_sentence(UNPROVIDED);
        final SubLObject full_tree = funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
        final SubLObject current_tree = funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
        final SubLObject lexicon = parse_tree_gui.ged_lexicon(v_document);
        funcall_instance_method_with_1_args(lexicon, LEARN, sentence_string);
        if (NIL != parse_tree_p(full_tree)) {
            funcall_instance_method_with_1_args(full_tree, LEXIFY, lexicon);
            funcall_instance_method_with_0_args(full_tree, parse_tree_gui.REMOVE_REDUNDANT_LEXES);
            funcall_instance_method_with_1_args(current_tree, LEXIFY, lexicon);
            funcall_instance_method_with_0_args(current_tree, parse_tree_gui.REMOVE_REDUNDANT_LEXES);
        }
        parse_tree_gui._csetf_ges_parent_document(ges, v_document);
        parse_tree_gui._csetf_ges_surface_string(ges, sentence_string);
        parse_tree_gui._csetf_ges_full_parse_tree(ges, full_tree);
        parse_tree_gui._csetf_ges_current_parse_tree(ges, current_tree);
        parse_tree_gui._csetf_ges_gui_tokens(ges, parse_tree_gui.create_token_list(ges));
        parse_tree_gui._csetf_ges_token_mapping(ges, parse_tree_gui.create_ges_token_mapping(ges));
        return ges;
    }

    public static final SubLObject ges_lexicon_alt(SubLObject ges) {
        {
            SubLObject parent = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_parent_document(ges);
            if (NIL != parent) {
                return com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_lexicon(parent);
            }
        }
        return NIL;
    }

    public static SubLObject ges_lexicon(final SubLObject ges) {
        final SubLObject parent = parse_tree_gui.ges_parent_document(ges);
        if (NIL != parent) {
            return parse_tree_gui.ged_lexicon(parent);
        }
        return NIL;
    }

    public static final SubLObject pprint_ged_alt(SubLObject ged, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt54$__GED___S_sentences_, length(com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_sentences(ged)));
        return ged;
    }

    public static SubLObject pprint_ged(final SubLObject ged, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, parse_tree_gui.$str63$__GED___S_sentences_, length(parse_tree_gui.ged_sentences(ged)));
        return ged;
    }

    public static final SubLObject pprint_ges_alt(SubLObject ges, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            SubLObject string = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_surface_string(ges);
            SubLObject print_string = string_utilities.string_first_n(TWENTY_INTEGER, string);
            if (length(string).numG(TWENTY_INTEGER)) {
                print_string = cconcatenate(print_string, $str_alt55$___);
            }
            format(stream, $str_alt56$__GES___S_, print_string);
        }
        return ges;
    }

    public static SubLObject pprint_ges(final SubLObject ges, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject string = parse_tree_gui.ges_surface_string(ges);
        SubLObject print_string = string_first_n(TWENTY_INTEGER, string);
        if (length(string).numG(TWENTY_INTEGER)) {
            print_string = cconcatenate(print_string, parse_tree_gui.$str64$___);
        }
        format(stream, parse_tree_gui.$str65$__GES___S_, print_string);
        return ges;
    }

    public static final SubLObject new_gui_enabled_document_from_stream_alt(SubLObject stream) {
        {
            SubLObject string = document.stream_stringify(stream);
            SubLObject sentences = document.sentencify_string(string);
            SubLObject ged = com.cyc.cycjava.cycl.leader.parse_tree_gui.new_gui_enabled_document(length(sentences), UNPROVIDED);
            SubLObject list_var = NIL;
            SubLObject sentence = NIL;
            SubLObject i = NIL;
            for (list_var = sentences, sentence = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , i = add(ONE_INTEGER, i)) {
                com.cyc.cycjava.cycl.leader.parse_tree_gui.add_sentence_to_ged(ged, sentence, i);
            }
            return ged;
        }
    }

    public static SubLObject new_gui_enabled_document_from_stream(final SubLObject stream) {
        final SubLObject string = stream_stringify(stream);
        final SubLObject sentences = sentencify_string(string);
        final SubLObject ged = parse_tree_gui.new_gui_enabled_document(length(sentences), UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject sentence = NIL;
        SubLObject i = NIL;
        list_var = sentences;
        sentence = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , i = add(ONE_INTEGER, i)) {
            parse_tree_gui.add_sentence_to_ged(ged, sentence, i);
        }
        return ged;
    }

    public static final SubLObject sentencify_remotely_alt(SubLObject string, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str_alt59$_sentencify_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        {
            SubLObject safe_string = string_utilities.string_substitute($str_alt61$_, $str_alt62$_, string, UNPROVIDED);
            SubLObject query = list(list($$$string, safe_string));
            SubLObject safe_sentences = read_from_string(web_utilities.http_retrieve(query, path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return safe_sentences;
        }
    }

    public static SubLObject sentencify_remotely(final SubLObject string, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate($cgi_path$.getDynamicValue(), parse_tree_gui.$str68$_sentencify_cgi);
        }
        if (host == UNPROVIDED) {
            host = $cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        final SubLObject safe_string = string_substitute(parse_tree_gui.$str70$_, parse_tree_gui.$str71$_, string, UNPROVIDED);
        final SubLObject query = list(list(parse_tree_gui.$$$string, safe_string));
        final SubLObject safe_sentences = read_from_string(http_retrieve(query, path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return safe_sentences;
    }

    public static final SubLObject new_gui_enabled_document_from_file_alt(SubLObject filepath) {
        {
            SubLObject ged = NIL;
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filepath, $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt65$Unable_to_open__S, filepath);
                }
                {
                    SubLObject stream_1 = stream;
                    ged = com.cyc.cycjava.cycl.leader.parse_tree_gui.new_gui_enabled_document_from_stream(stream_1);
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
            return ged;
        }
    }

    public static SubLObject new_gui_enabled_document_from_file(final SubLObject filepath) {
        SubLObject ged = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filepath, $INPUT);
            if (!stream.isStream()) {
                Errors.error(parse_tree_gui.$str74$Unable_to_open__S, filepath);
            }
            final SubLObject stream_$1 = stream;
            ged = parse_tree_gui.new_gui_enabled_document_from_stream(stream_$1);
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
        return ged;
    }

    public static final SubLObject new_gui_enabled_document_from_string_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.leader.parse_tree_gui.new_gui_enabled_document(string, UNPROVIDED);
    }

    public static SubLObject new_gui_enabled_document_from_string(final SubLObject string) {
        return parse_tree_gui.new_gui_enabled_document(string, UNPROVIDED);
    }

    public static final SubLObject gui_enabled_sentence_to_xml_alt(SubLObject ges, SubLObject v_xml_writer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(ges, GUI_ENABLED_SENTENCE_P);
            methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $$$sentence, NIL, NIL, T);
            {
                SubLObject tree = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_current_parse_tree(ges);
                SubLObject words = (NIL != parse_tree.parse_tree_p(tree)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(tree, YIELD))) : NIL;
                SubLObject parses = methods.funcall_instance_method_with_1_args(tree, CYCLIFY, $list_alt70);
                methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $$$tokens, NIL, NIL, T);
                {
                    SubLObject cdolist_list_var = words;
                    SubLObject word = NIL;
                    for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                        if (NIL != word_tree.word_tree_p(word)) {
                            methods.funcall_instance_method_with_1_args(word, TO_XML, v_xml_writer);
                        }
                    }
                }
                methods.funcall_instance_method_with_3_args(v_xml_writer, END_TAG, $$$tokens, NIL, T);
                methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $$$parses, NIL, NIL, T);
                {
                    SubLObject cdolist_list_var = parses;
                    SubLObject parse = NIL;
                    for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                        {
                            SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                            try {
                                xml_vars.$xml_stream$.bind(instances.get_slot(v_xml_writer, OUTSTREAM), thread);
                                {
                                    SubLObject error = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_2 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    cycml_generator.cycml_serialize_object(parse);
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error) {
                                        Errors.warn($str_alt77$___S, error);
                                    }
                                }
                            } finally {
                                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                methods.funcall_instance_method_with_3_args(v_xml_writer, END_TAG, $$$parses, NIL, T);
                methods.funcall_instance_method_with_3_args(v_xml_writer, END_TAG, $$$sentence, NIL, T);
                return T;
            }
        }
    }

    public static SubLObject gui_enabled_sentence_to_xml(final SubLObject ges, final SubLObject v_xml_writer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != parse_tree_gui.gui_enabled_sentence_p(ges) : "! parse_tree_gui.gui_enabled_sentence_p(ges) " + ("parse_tree_gui.gui_enabled_sentence_p(ges) " + "CommonSymbols.NIL != parse_tree_gui.gui_enabled_sentence_p(ges) ") + ges;
        funcall_instance_method_with_4_args(v_xml_writer, START_TAG, parse_tree_gui.$$$sentence, NIL, NIL, T);
        final SubLObject tree = parse_tree_gui.ges_current_parse_tree(ges);
        final SubLObject words = (NIL != parse_tree_p(tree)) ? funcall_instance_method_with_0_args(tree, YIELD) : NIL;
        final SubLObject parses = funcall_instance_method_with_1_args(tree, CYCLIFY, parse_tree_gui.$list79);
        funcall_instance_method_with_4_args(v_xml_writer, START_TAG, parse_tree_gui.$$$tokens, NIL, NIL, T);
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != word_tree_p(word)) {
                funcall_instance_method_with_1_args(word, parse_tree_gui.TO_XML, v_xml_writer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        funcall_instance_method_with_3_args(v_xml_writer, END_TAG, parse_tree_gui.$$$tokens, NIL, T);
        funcall_instance_method_with_4_args(v_xml_writer, START_TAG, parse_tree_gui.$$$parses, NIL, NIL, T);
        cdolist_list_var = parses;
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = $xml_stream$.currentBinding(thread);
            try {
                $xml_stream$.bind(get_slot(v_xml_writer, OUTSTREAM), thread);
                SubLObject error = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            cycml_serialize_object(parse);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error) {
                    Errors.warn(parse_tree_gui.$str86$___S, error);
                }
            } finally {
                $xml_stream$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        funcall_instance_method_with_3_args(v_xml_writer, END_TAG, parse_tree_gui.$$$parses, NIL, T);
        funcall_instance_method_with_3_args(v_xml_writer, END_TAG, parse_tree_gui.$$$sentence, NIL, T);
        return T;
    }

    public static final SubLObject ged_to_xml_string_alt(SubLObject ged) {
        {
            SubLObject v_xml_writer = object.new_class_instance(XML_WRITER);
            SubLObject stream = make_string_output_stream();
            SubLObject string = NIL;
            methods.funcall_instance_method_with_1_args(v_xml_writer, SET_STREAM, stream);
            methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $str_alt80$cycl_annotated_document, NIL, NIL, T);
            {
                SubLObject vector_var = com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_sentences(ged);
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject ges = aref(vector_var, element_num);
                        if (NIL != com.cyc.cycjava.cycl.leader.parse_tree_gui.gui_enabled_sentence_p(ges)) {
                            com.cyc.cycjava.cycl.leader.parse_tree_gui.gui_enabled_sentence_to_xml(ges, v_xml_writer);
                        }
                    }
                }
            }
            methods.funcall_instance_method_with_3_args(v_xml_writer, END_TAG, $str_alt80$cycl_annotated_document, NIL, T);
            methods.funcall_instance_method_with_0_args(v_xml_writer, FLUSH);
            string = get_output_stream_string(stream);
            methods.funcall_instance_method_with_0_args(v_xml_writer, CLOSE);
            return string;
        }
    }

    public static SubLObject ged_to_xml_string(final SubLObject ged) {
        final SubLObject v_xml_writer = new_class_instance(XML_WRITER);
        final SubLObject stream = make_string_output_stream();
        SubLObject string = NIL;
        funcall_instance_method_with_1_args(v_xml_writer, SET_STREAM, stream);
        funcall_instance_method_with_4_args(v_xml_writer, START_TAG, parse_tree_gui.$str89$cycl_annotated_document, NIL, NIL, T);
        final SubLObject vector_var = parse_tree_gui.ged_sentences(ged);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject ges;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            ges = aref(vector_var, element_num);
            if (NIL != parse_tree_gui.gui_enabled_sentence_p(ges)) {
                parse_tree_gui.gui_enabled_sentence_to_xml(ges, v_xml_writer);
            }
        }
        funcall_instance_method_with_3_args(v_xml_writer, END_TAG, parse_tree_gui.$str89$cycl_annotated_document, NIL, T);
        funcall_instance_method_with_0_args(v_xml_writer, parse_tree_gui.FLUSH);
        string = get_output_stream_string(stream);
        funcall_instance_method_with_0_args(v_xml_writer, CLOSE);
        return string;
    }

    public static final SubLObject word_tree_to_xml_method_alt(SubLObject self, SubLObject v_xml_writer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_word_tree_method = NIL;
                SubLObject category = parse_tree.get_parse_tree_category(self);
                SubLObject string = parse_tree.get_parse_tree_string(self);
                try {
                    try {
                        {
                            SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                            try {
                                xml_vars.$xml_stream$.bind(instances.get_slot(v_xml_writer, OUTSTREAM), thread);
                                {
                                    SubLObject attributes = list($$$pos, category, $$$token, string);
                                    SubLObject cycls = NIL;
                                    {
                                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_LEXES);
                                        SubLObject lexeme = NIL;
                                        for (lexeme = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexeme = cdolist_list_var.first()) {
                                            {
                                                SubLObject semtrans = methods.funcall_instance_method_with_1_args(lexeme, GET, $SEMTRANS);
                                                SubLObject v_term = NIL;
                                                if (semtrans.isCons()) {
                                                    if (NIL != subl_promotions.memberP(semtrans.first(), $list_alt92, UNPROVIDED, UNPROVIDED)) {
                                                        v_term = third(semtrans);
                                                    } else {
                                                        if (NIL == v_term) {
                                                            {
                                                                SubLObject csome_list_var = semtrans;
                                                                SubLObject clause = NIL;
                                                                for (clause = csome_list_var.first(); !((NIL != v_term) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , clause = csome_list_var.first()) {
                                                                    if (clause.isList()) {
                                                                        if ($$isa == clause.first()) {
                                                                            v_term = third(clause);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if (NIL != forts.fort_p(v_term)) {
                                                    cycls = cons(v_term, cycls);
                                                }
                                            }
                                        }
                                    }
                                    methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $$$token, attributes, NIL, T);
                                    {
                                        SubLObject cdolist_list_var = cycls;
                                        SubLObject cycl = NIL;
                                        for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                                            cycml_generator.cycml_serialize_object(cycl);
                                        }
                                    }
                                    methods.funcall_instance_method_with_3_args(v_xml_writer, END_TAG, $$$token, NIL, T);
                                }
                            } finally {
                                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                parse_tree.set_parse_tree_category(self, category);
                                parse_tree.set_parse_tree_string(self, string);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_WORD_TREE_METHOD);
                }
                return catch_var_for_word_tree_method;
            }
        }
    }

    public static SubLObject word_tree_to_xml_method(final SubLObject self, final SubLObject v_xml_writer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = NIL;
        final SubLObject category = get_parse_tree_category(self);
        final SubLObject string = get_parse_tree_string(self);
        try {
            thread.throwStack.push(parse_tree_gui.$sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                final SubLObject _prev_bind_0 = $xml_stream$.currentBinding(thread);
                try {
                    $xml_stream$.bind(get_slot(v_xml_writer, OUTSTREAM), thread);
                    final SubLObject attributes = list(parse_tree_gui.$$$pos, category, parse_tree_gui.$$$token, string);
                    SubLObject cycls = NIL;
                    SubLObject cdolist_list_var = funcall_instance_method_with_0_args(self, GET_LEXES);
                    SubLObject lexeme = NIL;
                    lexeme = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject semtrans = funcall_instance_method_with_1_args(lexeme, GET, $SEMTRANS);
                        SubLObject v_term = NIL;
                        if (semtrans.isCons()) {
                            if (NIL != memberP(semtrans.first(), parse_tree_gui.$list101, UNPROVIDED, UNPROVIDED)) {
                                v_term = third(semtrans);
                            } else
                                if (NIL == v_term) {
                                    SubLObject csome_list_var = semtrans;
                                    SubLObject clause = NIL;
                                    clause = csome_list_var.first();
                                    while ((NIL == v_term) && (NIL != csome_list_var)) {
                                        if (clause.isList() && parse_tree_gui.$$isa.eql(clause.first())) {
                                            v_term = third(clause);
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        clause = csome_list_var.first();
                                    } 
                                }

                        }
                        if (NIL != fort_p(v_term)) {
                            cycls = cons(v_term, cycls);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        lexeme = cdolist_list_var.first();
                    } 
                    funcall_instance_method_with_4_args(v_xml_writer, START_TAG, parse_tree_gui.$$$token, attributes, NIL, T);
                    cdolist_list_var = cycls;
                    SubLObject cycl = NIL;
                    cycl = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cycml_serialize_object(cycl);
                        cdolist_list_var = cdolist_list_var.rest();
                        cycl = cdolist_list_var.first();
                    } 
                    funcall_instance_method_with_3_args(v_xml_writer, END_TAG, parse_tree_gui.$$$token, NIL, T);
                } finally {
                    $xml_stream$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parse_tree_category(self, category);
                    set_parse_tree_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, parse_tree_gui.$sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }

    public static final SubLObject removal_lambda_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return numE(v_object, $token_index$.getDynamicValue(thread));
        }
    }

    public static SubLObject removal_lambda(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numE(v_object, parse_tree_gui.$token_index$.getDynamicValue(thread));
    }

    public static final SubLObject get_ges_annotated_leaves_alt(SubLObject ges) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tokens = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_gui_tokens(ges);
                SubLObject token_mapping = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_token_mapping(ges);
                SubLObject words = methods.funcall_instance_method_with_0_args(com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_full_parse_tree(ges), YIELD);
                SubLObject lexicon = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_lexicon(ges);
                SubLObject annotated_words = NIL;
                SubLObject list_var = NIL;
                SubLObject token = NIL;
                SubLObject i = NIL;
                for (list_var = tokens, token = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , i = add(ONE_INTEGER, i)) {
                    {
                        SubLObject _prev_bind_0 = $token_index$.currentBinding(thread);
                        try {
                            $token_index$.bind(i, thread);
                            {
                                SubLObject indices = Mapping.mapcar(symbol_function(CAR), list_utilities.remove_if_not(symbol_function(REMOVAL_LAMBDA), token_mapping, symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                SubLObject category = T;
                                SubLObject lexes = NIL;
                                SubLObject cycls = NIL;
                                {
                                    SubLObject cdolist_list_var = indices;
                                    SubLObject index = NIL;
                                    for (index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index = cdolist_list_var.first()) {
                                        {
                                            SubLObject word = nth(index, words);
                                            lexes = cconcatenate(lexes, methods.funcall_instance_method_with_0_args(word, GET_LEXES));
                                            category = makeBoolean((NIL != category) && (NIL != com.cyc.cycjava.cycl.leader.parse_tree_gui.stop_word_p(methods.funcall_instance_method_with_0_args(word, GET_CATEGORY))));
                                        }
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var = lexes;
                                    SubLObject lex = NIL;
                                    for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex = cdolist_list_var.first()) {
                                        {
                                            SubLObject extracted = semtrans_lexicon.extract_cycl_from_semtrans_lex_entry(lex, lexicon);
                                            if (NIL != extracted) {
                                                cycls = cons(extracted, cycls);
                                            }
                                        }
                                    }
                                }
                                cycls = list_utilities.fast_delete_duplicates(cycls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                annotated_words = cons(list(token, cycls, category), annotated_words);
                            }
                        } finally {
                            $token_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(annotated_words);
            }
        }
    }

    public static SubLObject get_ges_annotated_leaves(final SubLObject ges) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokens = parse_tree_gui.ges_gui_tokens(ges);
        final SubLObject token_mapping = parse_tree_gui.ges_token_mapping(ges);
        final SubLObject words = funcall_instance_method_with_0_args(parse_tree_gui.ges_full_parse_tree(ges), YIELD);
        final SubLObject lexicon = parse_tree_gui.ges_lexicon(ges);
        SubLObject annotated_words = NIL;
        SubLObject list_var = NIL;
        SubLObject token = NIL;
        SubLObject i = NIL;
        list_var = tokens;
        token = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject _prev_bind_0 = parse_tree_gui.$token_index$.currentBinding(thread);
            try {
                parse_tree_gui.$token_index$.bind(i, thread);
                final SubLObject indices = Mapping.mapcar(symbol_function(CAR), remove_if_not(symbol_function(parse_tree_gui.REMOVAL_LAMBDA), token_mapping, symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject category = T;
                SubLObject lexes = NIL;
                SubLObject cycls = NIL;
                SubLObject cdolist_list_var = indices;
                SubLObject index = NIL;
                index = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject word = nth(index, words);
                    lexes = cconcatenate(lexes, funcall_instance_method_with_0_args(word, GET_LEXES));
                    category = makeBoolean((NIL != category) && (NIL != parse_tree_gui.stop_word_p(funcall_instance_method_with_0_args(word, GET_CATEGORY))));
                    cdolist_list_var = cdolist_list_var.rest();
                    index = cdolist_list_var.first();
                } 
                cdolist_list_var = lexes;
                SubLObject lex = NIL;
                lex = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject extracted = extract_cycl_from_semtrans_lex_entry(lex, lexicon);
                    if (NIL != extracted) {
                        cycls = cons(extracted, cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    lex = cdolist_list_var.first();
                } 
                cycls = fast_delete_duplicates(cycls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                annotated_words = cons(list(token, cycls, category), annotated_words);
            } finally {
                parse_tree_gui.$token_index$.rebind(_prev_bind_0, thread);
            }
        }
        return nreverse(annotated_words);
    }

    public static final SubLObject get_ged_annotated_tree_alt(SubLObject ged, SubLObject ges_idx) {
        {
            SubLObject ges = aref(com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_sentences(ged), ges_idx);
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.get_ges_annotated_tree(ges);
        }
    }

    public static SubLObject get_ged_annotated_tree(final SubLObject ged, final SubLObject ges_idx) {
        final SubLObject ges = aref(parse_tree_gui.ged_sentences(ged), ges_idx);
        return parse_tree_gui.get_ges_annotated_tree(ges);
    }

    public static final SubLObject get_ges_annotated_tree_alt(SubLObject ges) {
        {
            SubLObject tree = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_full_parse_tree(ges);
            SubLObject lexicon = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_lexicon(ges);
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.annotate_parse_tree(tree, lexicon);
        }
    }

    public static SubLObject get_ges_annotated_tree(final SubLObject ges) {
        final SubLObject tree = parse_tree_gui.ges_full_parse_tree(ges);
        final SubLObject lexicon = parse_tree_gui.ges_lexicon(ges);
        return parse_tree_gui.annotate_parse_tree(tree, lexicon);
    }

    public static final SubLObject annotate_parse_tree_alt(SubLObject v_parse_tree, SubLObject lexicon) {
        if (NIL != parse_tree.phrase_tree_p(v_parse_tree)) {
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.annotate_phrase_tree(v_parse_tree, lexicon);
        } else {
            if (NIL != word_tree.word_tree_p(v_parse_tree)) {
                return com.cyc.cycjava.cycl.leader.parse_tree_gui.annotate_word_tree(v_parse_tree, lexicon);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject annotate_parse_tree(final SubLObject v_parse_tree, final SubLObject lexicon) {
        if (NIL != phrase_tree_p(v_parse_tree)) {
            return parse_tree_gui.annotate_phrase_tree(v_parse_tree, lexicon);
        }
        if (NIL != word_tree_p(v_parse_tree)) {
            return parse_tree_gui.annotate_word_tree(v_parse_tree, lexicon);
        }
        return NIL;
    }

    public static final SubLObject annotate_phrase_tree_alt(SubLObject phrase_tree, SubLObject lexicon) {
        {
            SubLObject category = parse_tree.get_parse_tree_category(phrase_tree);
            SubLObject result = NIL;
            result = cons(list($PHRASE_TREE, category, methods.funcall_instance_method_with_0_args(phrase_tree, GET_STRING), methods.funcall_instance_method_with_0_args(phrase_tree, GET_PATH)), result);
            {
                SubLObject vector_var = parse_tree.get_phrase_tree_daughters(phrase_tree);
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject daughter = aref(vector_var, element_num);
                        result = cons(com.cyc.cycjava.cycl.leader.parse_tree_gui.annotate_parse_tree(daughter, lexicon), result);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject annotate_phrase_tree(final SubLObject phrase_tree, final SubLObject lexicon) {
        final SubLObject category = get_parse_tree_category(phrase_tree);
        SubLObject result = NIL;
        result = cons(list($PHRASE_TREE, category, funcall_instance_method_with_0_args(phrase_tree, GET_STRING), funcall_instance_method_with_0_args(phrase_tree, parse_tree_gui.GET_PATH)), result);
        final SubLObject vector_var = get_phrase_tree_daughters(phrase_tree);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            result = cons(parse_tree_gui.annotate_parse_tree(daughter, lexicon), result);
        }
        return nreverse(result);
    }

    public static final SubLObject annotate_word_tree_alt(SubLObject v_word_tree, SubLObject lexicon) {
        {
            SubLObject category = parse_tree.get_parse_tree_category(v_word_tree);
            SubLObject lexes = methods.funcall_instance_method_with_0_args(v_word_tree, GET_LEXES);
            SubLObject cycls = NIL;
            SubLObject cdolist_list_var = lexes;
            SubLObject lex = NIL;
            for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex = cdolist_list_var.first()) {
                {
                    SubLObject extracted = semtrans_lexicon.extract_cycl_from_semtrans_lex_entry(lex, lexicon);
                    if (NIL != extracted) {
                        cycls = cons(extracted, cycls);
                    }
                }
            }
            return list($WORD_TREE, category, methods.funcall_instance_method_with_0_args(v_word_tree, GET_STRING), methods.funcall_instance_method_with_0_args(v_word_tree, GET_PATH), cycls);
        }
    }

    public static SubLObject annotate_word_tree(final SubLObject v_word_tree, final SubLObject lexicon) {
        final SubLObject category = get_parse_tree_category(v_word_tree);
        final SubLObject lexes = funcall_instance_method_with_0_args(v_word_tree, GET_LEXES);
        SubLObject cycls = NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject extracted = extract_cycl_from_semtrans_lex_entry(lex, lexicon);
            if (NIL != extracted) {
                cycls = cons(extracted, cycls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        } 
        return list($WORD_TREE, category, funcall_instance_method_with_0_args(v_word_tree, GET_STRING), funcall_instance_method_with_0_args(v_word_tree, parse_tree_gui.GET_PATH), cycls);
    }

    public static final SubLObject create_ges_token_mapping_alt(SubLObject ges) {
        {
            SubLObject token_list = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_gui_tokens(ges);
            SubLObject full_tree = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_full_parse_tree(ges);
            SubLObject words = methods.funcall_instance_method_with_0_args(full_tree, YIELD);
            return parsing_utilities.create_token_mapping(token_list, words, symbol_function(IDENTITY), symbol_function(GES_WORD_STRING));
        }
    }

    public static SubLObject create_ges_token_mapping(final SubLObject ges) {
        final SubLObject token_list = parse_tree_gui.ges_gui_tokens(ges);
        final SubLObject full_tree = parse_tree_gui.ges_full_parse_tree(ges);
        final SubLObject words = funcall_instance_method_with_0_args(full_tree, YIELD);
        return create_token_mapping(token_list, words, symbol_function(IDENTITY), symbol_function(parse_tree_gui.GES_WORD_STRING));
    }

    public static final SubLObject ges_word_string_alt(SubLObject word) {
        return methods.funcall_instance_method_with_0_args(word, GET_STRING);
    }

    public static SubLObject ges_word_string(final SubLObject word) {
        return funcall_instance_method_with_0_args(word, GET_STRING);
    }

    public static final SubLObject create_token_list_alt(SubLObject ges) {
        {
            SubLObject token_list = delete_if(symbol_function(EMPTY_STRING_P), Mapping.mapcar(symbol_function(TRIM_WHITESPACE), string_utilities.split_string(com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_surface_string(ges), UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject words = methods.funcall_instance_method_with_0_args(com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_full_parse_tree(ges), YIELD);
            SubLObject word_strings = NIL;
            SubLObject word_lists = NIL;
            {
                SubLObject cdolist_list_var = words;
                SubLObject word = NIL;
                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                    word_strings = cons(methods.funcall_instance_method_with_0_args(word, GET_STRING), word_strings);
                }
            }
            {
                SubLObject cdolist_list_var = word_strings;
                SubLObject word_string = NIL;
                for (word_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word_string = cdolist_list_var.first()) {
                    {
                        SubLObject word_list = string_utilities.split_string(word_string, UNPROVIDED);
                        if (length(word_list).numG(ONE_INTEGER)) {
                            word_lists = cons(word_list, word_lists);
                        }
                    }
                }
            }
            if (NIL != word_lists) {
                return com.cyc.cycjava.cycl.leader.parse_tree_gui.nmerge_words(word_lists, token_list);
            } else {
                return token_list;
            }
        }
    }

    public static SubLObject create_token_list(final SubLObject ges) {
        final SubLObject token_list = delete_if(symbol_function(EMPTY_STRING_P), Mapping.mapcar(symbol_function(parse_tree_gui.TRIM_WHITESPACE), split_string(parse_tree_gui.ges_surface_string(ges), UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject words = funcall_instance_method_with_0_args(parse_tree_gui.ges_full_parse_tree(ges), YIELD);
        SubLObject word_strings = NIL;
        SubLObject word_lists = NIL;
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            word_strings = cons(funcall_instance_method_with_0_args(word, GET_STRING), word_strings);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        cdolist_list_var = word_strings;
        SubLObject word_string = NIL;
        word_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject word_list = split_string(word_string, UNPROVIDED);
            if (length(word_list).numG(ONE_INTEGER)) {
                word_lists = cons(word_list, word_lists);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word_string = cdolist_list_var.first();
        } 
        if (NIL != word_lists) {
            return parse_tree_gui.nmerge_words(word_lists, token_list);
        }
        return token_list;
    }

    /**
     * iterate through word-lists finding whenever they occur in sequence
     * in string-list and make one string out of them
     */
    @LispMethod(comment = "iterate through word-lists finding whenever they occur in sequence\r\nin string-list and make one string out of them\niterate through word-lists finding whenever they occur in sequence\nin string-list and make one string out of them")
    public static final SubLObject nmerge_words_alt(SubLObject word_lists, SubLObject string_list) {
        {
            SubLObject cdolist_list_var = word_lists;
            SubLObject word_list = NIL;
            for (word_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word_list = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.leader.parse_tree_gui.reattach_word(word_list, string_list, UNPROVIDED);
            }
        }
        return string_list;
    }

    /**
     * iterate through word-lists finding whenever they occur in sequence
     * in string-list and make one string out of them
     */
    @LispMethod(comment = "iterate through word-lists finding whenever they occur in sequence\r\nin string-list and make one string out of them\niterate through word-lists finding whenever they occur in sequence\nin string-list and make one string out of them")
    public static SubLObject nmerge_words(final SubLObject word_lists, final SubLObject string_list) {
        SubLObject cdolist_list_var = word_lists;
        SubLObject word_list = NIL;
        word_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            parse_tree_gui.reattach_word(word_list, string_list, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            word_list = cdolist_list_var.first();
        } 
        return string_list;
    }

    /**
     * add spaces between words in word-list and return the string
     */
    @LispMethod(comment = "add spaces between words in word-list and return the string")
    public static final SubLObject add_spaces_alt(SubLObject word_list) {
        {
            SubLObject string = $str_alt110$;
            SubLObject list_var = NIL;
            SubLObject word = NIL;
            SubLObject i = NIL;
            for (list_var = word_list, word = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
                if (i.numG(ZERO_INTEGER)) {
                    string = cconcatenate(string, $str_alt111$_);
                }
                string = cconcatenate(string, word);
            }
            return string;
        }
    }

    /**
     * add spaces between words in word-list and return the string
     */
    @LispMethod(comment = "add spaces between words in word-list and return the string")
    public static SubLObject add_spaces(final SubLObject word_list) {
        SubLObject string = parse_tree_gui.$str119$;
        SubLObject list_var = NIL;
        SubLObject word = NIL;
        SubLObject i = NIL;
        list_var = word_list;
        word = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (i.numG(ZERO_INTEGER)) {
                string = cconcatenate(string, parse_tree_gui.$$$_);
            }
            string = cconcatenate(string, word);
        }
        return string;
    }

    public static final SubLObject reattach_word_alt(SubLObject word_list, SubLObject string_list, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        {
            SubLObject index = search(word_list, string_list, symbol_function($sym112$SUBSTRING_), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, UNPROVIDED);
            if (NIL != index) {
                {
                    SubLObject newtoken = com.cyc.cycjava.cycl.leader.parse_tree_gui.add_spaces(subseq(string_list, index, add(index, length(word_list))));
                    list_utilities.ncollapse_n_from_pos(length(word_list), index, newtoken, string_list);
                }
                com.cyc.cycjava.cycl.leader.parse_tree_gui.reattach_word(word_list, string_list, add(index, ONE_INTEGER));
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject reattach_word(final SubLObject word_list, final SubLObject string_list, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        final SubLObject index = search(word_list, string_list, symbol_function(parse_tree_gui.$sym121$SUBSTRING_), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, UNPROVIDED);
        if (NIL != index) {
            final SubLObject newtoken = parse_tree_gui.add_spaces(subseq(string_list, index, add(index, length(word_list))));
            ncollapse_n_from_pos(length(word_list), index, newtoken, string_list);
            parse_tree_gui.reattach_word(word_list, string_list, add(index, ONE_INTEGER));
            return T;
        }
        return NIL;
    }

    public static final SubLObject get_ged_annotated_leaves_alt(SubLObject ged, SubLObject ges_idx) {
        {
            SubLObject ges = aref(com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_sentences(ged), ges_idx);
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.get_ges_annotated_leaves(ges);
        }
    }

    public static SubLObject get_ged_annotated_leaves(final SubLObject ged, final SubLObject ges_idx) {
        final SubLObject ges = aref(parse_tree_gui.ged_sentences(ged), ges_idx);
        return parse_tree_gui.get_ges_annotated_leaves(ges);
    }

    public static final SubLObject select_sense_for_word_alt(SubLObject ged, SubLObject ges_idx, SubLObject word_num, SubLObject sense_num) {
        {
            SubLObject ges = aref(com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_sentences(ged), ges_idx);
            SubLObject full_tree = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_full_parse_tree(ges);
            SubLObject all_lexes = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(full_tree, GET_NTH_WORD, word_num), GET_LEXES);
            SubLObject target = NIL;
            if (length(all_lexes).numGE(sense_num)) {
                target = nth(sense_num, all_lexes);
            } else {
                Errors.warn($str_alt116$Attempted_to_set_sense__A__but_on, sense_num, length(all_lexes));
            }
            if (NIL != target) {
                {
                    SubLObject current_tree = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_current_parse_tree(ges);
                    SubLObject word = methods.funcall_instance_method_with_1_args(current_tree, GET_NTH_WORD, word_num);
                    instances.set_slot(word, LEXES, list(cons(target, ONE_INTEGER)));
                }
            }
            return T;
        }
    }

    public static SubLObject select_sense_for_word(final SubLObject ged, final SubLObject ges_idx, final SubLObject word_num, final SubLObject sense_num) {
        final SubLObject ges = aref(parse_tree_gui.ged_sentences(ged), ges_idx);
        final SubLObject full_tree = parse_tree_gui.ges_full_parse_tree(ges);
        final SubLObject all_lexes = funcall_instance_method_with_0_args(funcall_instance_method_with_1_args(full_tree, parse_tree_gui.GET_NTH_WORD, word_num), GET_LEXES);
        SubLObject target = NIL;
        if (length(all_lexes).numGE(sense_num)) {
            target = nth(sense_num, all_lexes);
        } else {
            Errors.warn(parse_tree_gui.$str125$Attempted_to_set_sense__A__but_on, sense_num, length(all_lexes));
        }
        if (NIL != target) {
            final SubLObject current_tree = parse_tree_gui.ges_current_parse_tree(ges);
            final SubLObject word = funcall_instance_method_with_1_args(current_tree, parse_tree_gui.GET_NTH_WORD, word_num);
            set_slot(word, LEXES, list(cons(target, ONE_INTEGER)));
        }
        return T;
    }

    /**
     * Given a list of indices in path, return the word index.
     * Returns nil if path is not to a word tree.
     */
    @LispMethod(comment = "Given a list of indices in path, return the word index.\r\nReturns nil if path is not to a word tree.\nGiven a list of indices in path, return the word index.\nReturns nil if path is not to a word tree.")
    public static final SubLObject find_word_index_from_path_alt(SubLObject ged, SubLObject ges_idx, SubLObject path) {
        {
            SubLObject ges = aref(com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_sentences(ged), ges_idx);
            SubLObject tree = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_full_parse_tree(ges);
            SubLObject yield = methods.funcall_instance_method_with_0_args(tree, YIELD);
            SubLObject cdolist_list_var = path;
            SubLObject index = NIL;
            for (index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index = cdolist_list_var.first()) {
                tree = aref(parse_tree.get_phrase_tree_daughters(tree), index);
            }
            return list_utilities.list_position(tree, yield, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Given a list of indices in path, return the word index.
     * Returns nil if path is not to a word tree.
     */
    @LispMethod(comment = "Given a list of indices in path, return the word index.\r\nReturns nil if path is not to a word tree.\nGiven a list of indices in path, return the word index.\nReturns nil if path is not to a word tree.")
    public static SubLObject find_word_index_from_path(final SubLObject ged, final SubLObject ges_idx, final SubLObject path) {
        final SubLObject ges = aref(parse_tree_gui.ged_sentences(ged), ges_idx);
        SubLObject tree = parse_tree_gui.ges_full_parse_tree(ges);
        final SubLObject yield = funcall_instance_method_with_0_args(tree, YIELD);
        SubLObject cdolist_list_var = path;
        SubLObject index = NIL;
        index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            tree = aref(get_phrase_tree_daughters(tree), index);
            cdolist_list_var = cdolist_list_var.rest();
            index = cdolist_list_var.first();
        } 
        return list_position(tree, yield, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject prune_ges_by_wff_checking_alt(SubLObject ges) {
        {
            SubLObject full_tree = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_full_parse_tree(ges);
            SubLObject current_tree = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_current_parse_tree(ges);
            SubLObject full_yield = methods.funcall_instance_method_with_0_args(full_tree, YIELD);
            SubLObject current_yield = methods.funcall_instance_method_with_0_args(current_tree, YIELD);
            SubLObject message = NIL;
            methods.funcall_instance_method_with_0_args(current_tree, NAIVE_WFF_SELF_PRUNE);
            {
                SubLObject full_word = NIL;
                SubLObject full_word_3 = NIL;
                SubLObject current_word = NIL;
                SubLObject current_word_4 = NIL;
                for (full_word = full_yield, full_word_3 = full_word.first(), current_word = current_yield, current_word_4 = current_word.first(); !((NIL == current_word) && (NIL == full_word)); full_word = full_word.rest() , full_word_3 = full_word.first() , current_word = current_word.rest() , current_word_4 = current_word.first()) {
                    {
                        SubLObject full_lexes = methods.funcall_instance_method_with_0_args(full_word_3, GET_LEXES);
                        SubLObject current_lexes = methods.funcall_instance_method_with_0_args(current_word_4, GET_LEXES);
                        SubLObject word_message = NIL;
                        SubLObject cdolist_list_var = full_lexes;
                        SubLObject lex = NIL;
                        for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex = cdolist_list_var.first()) {
                            if (NIL != subl_promotions.memberP(lex, current_lexes, symbol_function(LEX_ENTRY_EQUALP), UNPROVIDED)) {
                                word_message = cons(ONE_INTEGER, word_message);
                            } else {
                                word_message = cons(ZERO_INTEGER, word_message);
                            }
                        }
                        message = cons(nreverse(word_message), message);
                    }
                }
            }
            message = nreverse(message);
            {
                SubLObject cdolist_list_var = reverse(com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_token_mapping(ges));
                SubLObject mapping = NIL;
                for (mapping = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapping = cdolist_list_var.first()) {
                    {
                        SubLObject full_parse_position = mapping.first();
                        SubLObject annotated_position = mapping.rest();
                        if (full_parse_position != annotated_position) {
                            list_utilities.delete_nth(full_parse_position, message);
                        }
                    }
                }
            }
            return message;
        }
    }

    public static SubLObject prune_ges_by_wff_checking(final SubLObject ges) {
        final SubLObject full_tree = parse_tree_gui.ges_full_parse_tree(ges);
        final SubLObject current_tree = parse_tree_gui.ges_current_parse_tree(ges);
        final SubLObject full_yield = funcall_instance_method_with_0_args(full_tree, YIELD);
        final SubLObject current_yield = funcall_instance_method_with_0_args(current_tree, YIELD);
        SubLObject message = NIL;
        funcall_instance_method_with_0_args(current_tree, parse_tree_gui.NAIVE_WFF_SELF_PRUNE);
        SubLObject full_word = NIL;
        SubLObject full_word_$3 = NIL;
        SubLObject current_word = NIL;
        SubLObject current_word_$4 = NIL;
        full_word = full_yield;
        full_word_$3 = full_word.first();
        current_word = current_yield;
        current_word_$4 = current_word.first();
        while ((NIL != current_word) || (NIL != full_word)) {
            final SubLObject full_lexes = funcall_instance_method_with_0_args(full_word_$3, GET_LEXES);
            final SubLObject current_lexes = funcall_instance_method_with_0_args(current_word_$4, GET_LEXES);
            SubLObject word_message = NIL;
            SubLObject cdolist_list_var = full_lexes;
            SubLObject lex = NIL;
            lex = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != memberP(lex, current_lexes, symbol_function(parse_tree_gui.LEX_ENTRY_EQUALP), UNPROVIDED)) {
                    word_message = cons(ONE_INTEGER, word_message);
                } else {
                    word_message = cons(ZERO_INTEGER, word_message);
                }
                cdolist_list_var = cdolist_list_var.rest();
                lex = cdolist_list_var.first();
            } 
            message = cons(nreverse(word_message), message);
            full_word = full_word.rest();
            full_word_$3 = full_word.first();
            current_word = current_word.rest();
            current_word_$4 = current_word.first();
        } 
        message = nreverse(message);
        SubLObject cdolist_list_var2 = reverse(parse_tree_gui.ges_token_mapping(ges));
        SubLObject mapping = NIL;
        mapping = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject full_parse_position = mapping.first();
            final SubLObject annotated_position = mapping.rest();
            if (!full_parse_position.eql(annotated_position)) {
                delete_nth(full_parse_position, message);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            mapping = cdolist_list_var2.first();
        } 
        return message;
    }

    public static final SubLObject prune_ged_sentence_by_wff_checking_alt(SubLObject ged, SubLObject ges_idx) {
        {
            SubLObject ges = aref(com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_sentences(ged), ges_idx);
            return com.cyc.cycjava.cycl.leader.parse_tree_gui.prune_ges_by_wff_checking(ges);
        }
    }

    public static SubLObject prune_ged_sentence_by_wff_checking(final SubLObject ged, final SubLObject ges_idx) {
        final SubLObject ges = aref(parse_tree_gui.ged_sentences(ged), ges_idx);
        return parse_tree_gui.prune_ges_by_wff_checking(ges);
    }

    public static final SubLObject cyclify_ged_sentence_alt(SubLObject ged, SubLObject ges_idx) {
        {
            SubLObject ges = aref(com.cyc.cycjava.cycl.leader.parse_tree_gui.ged_sentences(ged), ges_idx);
            SubLObject current_tree = com.cyc.cycjava.cycl.leader.parse_tree_gui.ges_current_parse_tree(ges);
            if (NIL != parse_tree.parse_tree_p(current_tree)) {
                return methods.funcall_instance_method_with_1_args(current_tree, CYCLIFY, $list_alt70);
            }
        }
        return NIL;
    }

    public static SubLObject cyclify_ged_sentence(final SubLObject ged, final SubLObject ges_idx) {
        final SubLObject ges = aref(parse_tree_gui.ged_sentences(ged), ges_idx);
        final SubLObject current_tree = parse_tree_gui.ges_current_parse_tree(ges);
        if (NIL != parse_tree_p(current_tree)) {
            return funcall_instance_method_with_1_args(current_tree, CYCLIFY, parse_tree_gui.$list79);
        }
        return NIL;
    }

    public static final SubLObject parse_tree_naive_wff_self_prune_method_alt(SubLObject self) {
        {
            SubLObject parses = methods.funcall_instance_method_with_1_args(self, CYCLIFY, $list_alt70);
            SubLObject wff_terms = NIL;
            SubLObject cdolist_list_var = parses;
            SubLObject parse = NIL;
            for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                {
                    SubLObject terms = list_utilities.flatten(parse);
                    SubLObject cdolist_list_var_5 = terms;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , v_term = cdolist_list_var_5.first()) {
                        if (NIL != forts.fort_p(v_term)) {
                            {
                                SubLObject item_var = v_term;
                                if (NIL == member(item_var, wff_terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    wff_terms = cons(item_var, wff_terms);
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != wff_terms) {
                methods.funcall_instance_method_with_1_args(self, PRUNE_LEXES, wff_terms);
            }
            return self;
        }
    }

    public static SubLObject parse_tree_naive_wff_self_prune_method(final SubLObject self) {
        final SubLObject parses = funcall_instance_method_with_1_args(self, CYCLIFY, parse_tree_gui.$list79);
        SubLObject wff_terms = NIL;
        SubLObject cdolist_list_var = parses;
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5;
            final SubLObject terms = cdolist_list_var_$5 = flatten(parse);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                if (NIL != fort_p(v_term)) {
                    final SubLObject item_var = v_term;
                    if (NIL == member(item_var, wff_terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                        wff_terms = cons(item_var, wff_terms);
                    }
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                v_term = cdolist_list_var_$5.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        if (NIL != wff_terms) {
            funcall_instance_method_with_1_args(self, parse_tree_gui.PRUNE_LEXES, wff_terms);
        }
        return self;
    }

    public static final SubLObject word_tree_prune_lexes_method_alt(SubLObject self, SubLObject wff_terms) {
        {
            SubLObject catch_var_for_word_tree_method = NIL;
            SubLObject lexes = word_tree.get_word_tree_lexes(self);
            try {
                try {
                    {
                        SubLObject accepted = NIL;
                        SubLObject rejected = NIL;
                        SubLObject to_redistribute = ZERO_INTEGER;
                        {
                            SubLObject cdolist_list_var = lexes;
                            SubLObject rle = NIL;
                            for (rle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rle = cdolist_list_var.first()) {
                                {
                                    SubLObject semtrans_terms = list_utilities.flatten(semtrans_lexicon.extract_cycl_from_semtrans_lex_entry(cyclifier.rle_lex(rle), UNPROVIDED));
                                    if (NIL != intersection(semtrans_terms, wff_terms, UNPROVIDED, UNPROVIDED)) {
                                        accepted = cons(rle, accepted);
                                    } else {
                                        rejected = cons(rle, rejected);
                                        to_redistribute = add(to_redistribute, cyclifier.rle_confidence(rle));
                                    }
                                }
                            }
                        }
                        if (NIL != accepted) {
                            {
                                SubLObject addendum = divide(to_redistribute, length(accepted));
                                SubLObject cdolist_list_var = accepted;
                                SubLObject a = NIL;
                                for (a = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , a = cdolist_list_var.first()) {
                                    cyclifier.rle_set_confidence(a, add(cyclifier.rle_confidence(a), addendum));
                                }
                            }
                        }
                        lexes = accepted;
                        sublisp_throw($sym130$OUTER_CATCH_FOR_WORD_TREE_METHOD, rejected);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            word_tree.set_word_tree_lexes(self, lexes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym130$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            }
            return catch_var_for_word_tree_method;
        }
    }

    public static SubLObject word_tree_prune_lexes_method(final SubLObject self, final SubLObject wff_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = NIL;
        SubLObject lexes = get_word_tree_lexes(self);
        try {
            thread.throwStack.push(parse_tree_gui.$sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                SubLObject accepted = NIL;
                SubLObject rejected = NIL;
                SubLObject to_redistribute = ZERO_INTEGER;
                SubLObject cdolist_list_var = lexes;
                SubLObject rle = NIL;
                rle = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject semtrans_terms = flatten(extract_cycl_from_semtrans_lex_entry(rle_lex(rle), UNPROVIDED));
                    if (NIL != intersection(semtrans_terms, wff_terms, UNPROVIDED, UNPROVIDED)) {
                        accepted = cons(rle, accepted);
                    } else {
                        rejected = cons(rle, rejected);
                        to_redistribute = add(to_redistribute, rle_confidence(rle));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                } 
                if (NIL != accepted) {
                    final SubLObject addendum = divide(to_redistribute, length(accepted));
                    SubLObject cdolist_list_var2 = accepted;
                    SubLObject a = NIL;
                    a = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        rle_set_confidence(a, add(rle_confidence(a), addendum));
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        a = cdolist_list_var2.first();
                    } 
                }
                lexes = accepted;
                sublisp_throw(parse_tree_gui.$sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD, rejected);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_tree_lexes(self, lexes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, parse_tree_gui.$sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }

    public static final SubLObject parse_tree_remove_redundant_lexes_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stack = stacks.create_stack();
                SubLObject order_var = $DFR2L;
                SubLObject possible_orders = list($DFL2R, $DFR2L);
                SubLObject daughter = NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED)) {
                        Errors.error($str_alt136$_S_is_not_one_of__S, order_var, possible_orders);
                    }
                }
                stacks.stack_push(self, stack);
                while (NIL == stacks.stack_empty_p(stack)) {
                    daughter = stacks.stack_pop(stack);
                    if (NIL != word_tree.word_tree_p(daughter)) {
                        methods.funcall_instance_method_with_0_args(daughter, REMOVE_REDUNDANT_LEXES);
                    }
                    if (NIL != parse_tree.phrase_tree_p(daughter)) {
                        {
                            SubLObject vector_var = parse_tree.get_phrase_tree_daughters(daughter);
                            SubLObject backwardP_var = eq(order_var, $DFL2R);
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject daughter_6 = aref(vector_var, element_num);
                                    stacks.stack_push(daughter_6, stack);
                                }
                            }
                        }
                    }
                } 
                return self;
            }
        }
    }

    public static SubLObject parse_tree_remove_redundant_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stack = create_stack();
        final SubLObject order_var = $DFR2L;
        final SubLObject possible_orders = list($DFL2R, $DFR2L);
        SubLObject daughter = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED))) {
            Errors.error(parse_tree_gui.$str145$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stack_push(self, stack);
        while (NIL == stack_empty_p(stack)) {
            daughter = stack_pop(stack);
            if (NIL != word_tree_p(daughter)) {
                funcall_instance_method_with_0_args(daughter, parse_tree_gui.REMOVE_REDUNDANT_LEXES);
            }
            if (NIL != phrase_tree_p(daughter)) {
                final SubLObject vector_var = get_phrase_tree_daughters(daughter);
                final SubLObject backwardP_var = eq(order_var, $DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter_$6;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    daughter_$6 = aref(vector_var, element_num);
                    stack_push(daughter_$6, stack);
                }
            }
        } 
        return self;
    }

    public static final SubLObject word_tree_remove_redundant_lexes_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_word_tree_method = NIL;
            SubLObject lexes = word_tree.get_word_tree_lexes(self);
            SubLObject mother = parse_tree.get_parse_tree_mother(self);
            try {
                try {
                    if ($TO == methods.funcall_instance_method_with_0_args(self, GET_CATEGORY)) {
                        {
                            SubLObject mother_7 = methods.funcall_instance_method_with_0_args(self, GET_MOTHER);
                            if ($VP == methods.funcall_instance_method_with_0_args(mother_7, GET_CATEGORY)) {
                                lexes = NIL;
                            }
                        }
                    } else {
                        {
                            SubLObject non_redundant = NIL;
                            SubLObject to_redistribute = ZERO_INTEGER;
                            {
                                SubLObject cdolist_list_var = lexes;
                                SubLObject rle = NIL;
                                for (rle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rle = cdolist_list_var.first()) {
                                    {
                                        SubLObject semtrans = cycl_utilities.hl_to_el(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $SEMTRANS));
                                        SubLObject fail = NIL;
                                        if (NIL == fail) {
                                            {
                                                SubLObject csome_list_var = non_redundant;
                                                SubLObject old_rle = NIL;
                                                for (old_rle = csome_list_var.first(); !((NIL != fail) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , old_rle = csome_list_var.first()) {
                                                    {
                                                        SubLObject old_semtrans = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(old_rle), GET, $SEMTRANS);
                                                        fail = equalp(semtrans, old_semtrans);
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL == fail) {
                                            non_redundant = cons(rle, non_redundant);
                                        }
                                    }
                                }
                            }
                            if (NIL != non_redundant) {
                                {
                                    SubLObject addendum = divide(to_redistribute, length(non_redundant));
                                    SubLObject cdolist_list_var = non_redundant;
                                    SubLObject nr = NIL;
                                    for (nr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nr = cdolist_list_var.first()) {
                                        cyclifier.rle_set_confidence(nr, add(cyclifier.rle_confidence(nr), addendum));
                                    }
                                }
                            }
                            lexes = non_redundant;
                        }
                    }
                    sublisp_throw($sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            word_tree.set_word_tree_lexes(self, lexes);
                            parse_tree.set_parse_tree_mother(self, mother);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            }
            return catch_var_for_word_tree_method;
        }
    }

    public static SubLObject word_tree_remove_redundant_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = NIL;
        SubLObject lexes = get_word_tree_lexes(self);
        final SubLObject mother = get_parse_tree_mother(self);
        try {
            thread.throwStack.push(parse_tree_gui.$sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                if ($TO == funcall_instance_method_with_0_args(self, GET_CATEGORY)) {
                    final SubLObject mother_$7 = funcall_instance_method_with_0_args(self, GET_MOTHER);
                    if ($VP == funcall_instance_method_with_0_args(mother_$7, GET_CATEGORY)) {
                        lexes = NIL;
                    }
                } else {
                    SubLObject non_redundant = NIL;
                    final SubLObject to_redistribute = ZERO_INTEGER;
                    SubLObject cdolist_list_var = lexes;
                    SubLObject rle = NIL;
                    rle = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject semtrans = hl_to_el(funcall_instance_method_with_1_args(rle_lex(rle), GET, $SEMTRANS));
                        SubLObject fail = NIL;
                        if (NIL == fail) {
                            SubLObject csome_list_var = non_redundant;
                            SubLObject old_rle = NIL;
                            old_rle = csome_list_var.first();
                            while ((NIL == fail) && (NIL != csome_list_var)) {
                                final SubLObject old_semtrans = funcall_instance_method_with_1_args(rle_lex(old_rle), GET, $SEMTRANS);
                                fail = equalp(semtrans, old_semtrans);
                                csome_list_var = csome_list_var.rest();
                                old_rle = csome_list_var.first();
                            } 
                        }
                        if (NIL == fail) {
                            non_redundant = cons(rle, non_redundant);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        rle = cdolist_list_var.first();
                    } 
                    if (NIL != non_redundant) {
                        final SubLObject addendum = divide(to_redistribute, length(non_redundant));
                        SubLObject cdolist_list_var2 = non_redundant;
                        SubLObject nr = NIL;
                        nr = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            rle_set_confidence(nr, add(rle_confidence(nr), addendum));
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            nr = cdolist_list_var2.first();
                        } 
                    }
                    lexes = non_redundant;
                }
                sublisp_throw(parse_tree_gui.$sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_word_tree_lexes(self, lexes);
                    set_parse_tree_mother(self, mother);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, parse_tree_gui.$sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }

    public static final SubLObject phrase_tree_prune_lexes_method_alt(SubLObject self, SubLObject wff_terms) {
        {
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, YIELD);
            SubLObject word = NIL;
            for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                methods.funcall_instance_method_with_1_args(word, PRUNE_LEXES, wff_terms);
            }
            return self;
        }
    }

    public static SubLObject phrase_tree_prune_lexes_method(final SubLObject self, final SubLObject wff_terms) {
        SubLObject cdolist_list_var = funcall_instance_method_with_0_args(self, YIELD);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            funcall_instance_method_with_1_args(word, parse_tree_gui.PRUNE_LEXES, wff_terms);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return self;
    }

    public static final SubLObject phrase_tree_get_nth_word_method_alt(SubLObject self, SubLObject integer) {
        {
            SubLObject yield = methods.funcall_instance_method_with_0_args(self, YIELD);
            if (integer.numG(length(yield))) {
                Errors.warn($str_alt149$Attempted_to_get_the__A_word__but, integer, length(yield));
                return NIL;
            }
            return nth(integer, yield);
        }
    }

    public static SubLObject phrase_tree_get_nth_word_method(final SubLObject self, final SubLObject integer) {
        final SubLObject yield = funcall_instance_method_with_0_args(self, YIELD);
        if (integer.numG(length(yield))) {
            Errors.warn(parse_tree_gui.$str158$Attempted_to_get_the__A_word__but, integer, length(yield));
            return NIL;
        }
        return nth(integer, yield);
    }

    public static final SubLObject lex_entry_equalp_alt(SubLObject lex1, SubLObject lex2) {
        return equalp(methods.funcall_instance_method_with_1_args(lex1, GET, $SEMTRANS), methods.funcall_instance_method_with_1_args(lex2, GET, $SEMTRANS));
    }

    public static SubLObject lex_entry_equalp(final SubLObject lex1, final SubLObject lex2) {
        return equalp(funcall_instance_method_with_1_args(lex1, GET, $SEMTRANS), funcall_instance_method_with_1_args(lex2, GET, $SEMTRANS));
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(new SubLObject[]{ makeKeyword("DT"), makeKeyword("CC"), makeKeyword("PRP"), makeKeyword("."), makeKeyword(","), makeKeyword(":"), makeKeyword("''"), makeKeyword("``"), makeKeyword("'"), makeKeyword("`"), makeKeyword("("), makeKeyword(")"), makeKeyword("-LRB-"), makeKeyword("-RRB-"), makeKeyword("LS") });

    public static SubLObject declare_parse_tree_gui_file() {
        declareFunction("stop_word_p", "STOP-WORD-P", 1, 0, false);
        declareFunction("gui_enabled_document_print_function_trampoline", "GUI-ENABLED-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("gui_enabled_document_p", "GUI-ENABLED-DOCUMENT-P", 1, 0, false);
        new parse_tree_gui.$gui_enabled_document_p$UnaryFunction();
        declareFunction("ged_sentences", "GED-SENTENCES", 1, 0, false);
        declareFunction("ged_parser", "GED-PARSER", 1, 0, false);
        declareFunction("ged_lexicon", "GED-LEXICON", 1, 0, false);
        declareFunction("_csetf_ged_sentences", "_CSETF-GED-SENTENCES", 2, 0, false);
        declareFunction("_csetf_ged_parser", "_CSETF-GED-PARSER", 2, 0, false);
        declareFunction("_csetf_ged_lexicon", "_CSETF-GED-LEXICON", 2, 0, false);
        declareFunction("make_gui_enabled_document", "MAKE-GUI-ENABLED-DOCUMENT", 0, 1, false);
        declareFunction("visit_defstruct_gui_enabled_document", "VISIT-DEFSTRUCT-GUI-ENABLED-DOCUMENT", 2, 0, false);
        declareFunction("visit_defstruct_object_gui_enabled_document_method", "VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-DOCUMENT-METHOD", 2, 0, false);
        declareFunction("new_gui_enabled_document", "NEW-GUI-ENABLED-DOCUMENT", 1, 1, false);
        declareFunction("add_sentence_to_ged", "ADD-SENTENCE-TO-GED", 3, 0, false);
        declareFunction("ged_sentence_number", "GED-SENTENCE-NUMBER", 1, 0, false);
        declareFunction("gui_enabled_sentence_print_function_trampoline", "GUI-ENABLED-SENTENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("gui_enabled_sentence_p", "GUI-ENABLED-SENTENCE-P", 1, 0, false);
        new parse_tree_gui.$gui_enabled_sentence_p$UnaryFunction();
        declareFunction("ges_surface_string", "GES-SURFACE-STRING", 1, 0, false);
        declareFunction("ges_gui_tokens", "GES-GUI-TOKENS", 1, 0, false);
        declareFunction("ges_full_parse_tree", "GES-FULL-PARSE-TREE", 1, 0, false);
        declareFunction("ges_current_parse_tree", "GES-CURRENT-PARSE-TREE", 1, 0, false);
        declareFunction("ges_token_mapping", "GES-TOKEN-MAPPING", 1, 0, false);
        declareFunction("ges_parent_document", "GES-PARENT-DOCUMENT", 1, 0, false);
        declareFunction("_csetf_ges_surface_string", "_CSETF-GES-SURFACE-STRING", 2, 0, false);
        declareFunction("_csetf_ges_gui_tokens", "_CSETF-GES-GUI-TOKENS", 2, 0, false);
        declareFunction("_csetf_ges_full_parse_tree", "_CSETF-GES-FULL-PARSE-TREE", 2, 0, false);
        declareFunction("_csetf_ges_current_parse_tree", "_CSETF-GES-CURRENT-PARSE-TREE", 2, 0, false);
        declareFunction("_csetf_ges_token_mapping", "_CSETF-GES-TOKEN-MAPPING", 2, 0, false);
        declareFunction("_csetf_ges_parent_document", "_CSETF-GES-PARENT-DOCUMENT", 2, 0, false);
        declareFunction("make_gui_enabled_sentence", "MAKE-GUI-ENABLED-SENTENCE", 0, 1, false);
        declareFunction("visit_defstruct_gui_enabled_sentence", "VISIT-DEFSTRUCT-GUI-ENABLED-SENTENCE", 2, 0, false);
        declareFunction("visit_defstruct_object_gui_enabled_sentence_method", "VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-SENTENCE-METHOD", 2, 0, false);
        declareFunction("new_gui_enabled_sentence", "NEW-GUI-ENABLED-SENTENCE", 3, 0, false);
        declareFunction("ges_lexicon", "GES-LEXICON", 1, 0, false);
        declareFunction("pprint_ged", "PPRINT-GED", 1, 2, false);
        declareFunction("pprint_ges", "PPRINT-GES", 1, 2, false);
        declareFunction("new_gui_enabled_document_from_stream", "NEW-GUI-ENABLED-DOCUMENT-FROM-STREAM", 1, 0, false);
        declareFunction("sentencify_remotely", "SENTENCIFY-REMOTELY", 1, 4, false);
        declareFunction("new_gui_enabled_document_from_file", "NEW-GUI-ENABLED-DOCUMENT-FROM-FILE", 1, 0, false);
        declareFunction("new_gui_enabled_document_from_string", "NEW-GUI-ENABLED-DOCUMENT-FROM-STRING", 1, 0, false);
        declareFunction("gui_enabled_sentence_to_xml", "GUI-ENABLED-SENTENCE-TO-XML", 2, 0, false);
        declareFunction("ged_to_xml_string", "GED-TO-XML-STRING", 1, 0, false);
        declareFunction("word_tree_to_xml_method", "WORD-TREE-TO-XML-METHOD", 2, 0, false);
        declareFunction("removal_lambda", "REMOVAL-LAMBDA", 1, 0, false);
        declareFunction("get_ges_annotated_leaves", "GET-GES-ANNOTATED-LEAVES", 1, 0, false);
        declareFunction("get_ged_annotated_tree", "GET-GED-ANNOTATED-TREE", 2, 0, false);
        declareFunction("get_ges_annotated_tree", "GET-GES-ANNOTATED-TREE", 1, 0, false);
        declareFunction("annotate_parse_tree", "ANNOTATE-PARSE-TREE", 2, 0, false);
        declareFunction("annotate_phrase_tree", "ANNOTATE-PHRASE-TREE", 2, 0, false);
        declareFunction("annotate_word_tree", "ANNOTATE-WORD-TREE", 2, 0, false);
        declareFunction("create_ges_token_mapping", "CREATE-GES-TOKEN-MAPPING", 1, 0, false);
        declareFunction("ges_word_string", "GES-WORD-STRING", 1, 0, false);
        declareFunction("create_token_list", "CREATE-TOKEN-LIST", 1, 0, false);
        declareFunction("nmerge_words", "NMERGE-WORDS", 2, 0, false);
        declareFunction("add_spaces", "ADD-SPACES", 1, 0, false);
        declareFunction("reattach_word", "REATTACH-WORD", 2, 1, false);
        declareFunction("get_ged_annotated_leaves", "GET-GED-ANNOTATED-LEAVES", 2, 0, false);
        declareFunction("select_sense_for_word", "SELECT-SENSE-FOR-WORD", 4, 0, false);
        declareFunction("find_word_index_from_path", "FIND-WORD-INDEX-FROM-PATH", 3, 0, false);
        declareFunction("prune_ges_by_wff_checking", "PRUNE-GES-BY-WFF-CHECKING", 1, 0, false);
        declareFunction("prune_ged_sentence_by_wff_checking", "PRUNE-GED-SENTENCE-BY-WFF-CHECKING", 2, 0, false);
        declareFunction("cyclify_ged_sentence", "CYCLIFY-GED-SENTENCE", 2, 0, false);
        declareFunction("parse_tree_naive_wff_self_prune_method", "PARSE-TREE-NAIVE-WFF-SELF-PRUNE-METHOD", 1, 0, false);
        declareFunction("word_tree_prune_lexes_method", "WORD-TREE-PRUNE-LEXES-METHOD", 2, 0, false);
        declareFunction("parse_tree_remove_redundant_lexes_method", "PARSE-TREE-REMOVE-REDUNDANT-LEXES-METHOD", 1, 0, false);
        declareFunction("word_tree_remove_redundant_lexes_method", "WORD-TREE-REMOVE-REDUNDANT-LEXES-METHOD", 1, 0, false);
        declareFunction("phrase_tree_prune_lexes_method", "PHRASE-TREE-PRUNE-LEXES-METHOD", 2, 0, false);
        declareFunction("phrase_tree_get_nth_word_method", "PHRASE-TREE-GET-NTH-WORD-METHOD", 2, 0, false);
        declareFunction("lex_entry_equalp", "LEX-ENTRY-EQUALP", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt3 = list(makeSymbol("SENTENCES"), makeSymbol("PARSER"), makeSymbol("LEXICON"));

    static private final SubLList $list_alt4 = list(makeKeyword("SENTENCES"), makeKeyword("PARSER"), makeKeyword("LEXICON"));

    static private final SubLList $list_alt5 = list(makeSymbol("GED-SENTENCES"), makeSymbol("GED-PARSER"), makeSymbol("GED-LEXICON"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-GED-SENTENCES"), makeSymbol("_CSETF-GED-PARSER"), makeSymbol("_CSETF-GED-LEXICON"));

    static private final SubLString $str_alt18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt25 = list(makeSymbol("SURFACE-STRING"), makeSymbol("GUI-TOKENS"), makeSymbol("FULL-PARSE-TREE"), makeSymbol("CURRENT-PARSE-TREE"), makeSymbol("TOKEN-MAPPING"), makeSymbol("PARENT-DOCUMENT"));

    static private final SubLList $list_alt26 = list(makeKeyword("SURFACE-STRING"), makeKeyword("GUI-TOKENS"), makeKeyword("FULL-PARSE-TREE"), makeKeyword("CURRENT-PARSE-TREE"), makeKeyword("TOKEN-MAPPING"), makeKeyword("PARENT-DOCUMENT"));

    static private final SubLList $list_alt27 = list(makeSymbol("GES-SURFACE-STRING"), makeSymbol("GES-GUI-TOKENS"), makeSymbol("GES-FULL-PARSE-TREE"), makeSymbol("GES-CURRENT-PARSE-TREE"), makeSymbol("GES-TOKEN-MAPPING"), makeSymbol("GES-PARENT-DOCUMENT"));

    static private final SubLList $list_alt28 = list(makeSymbol("_CSETF-GES-SURFACE-STRING"), makeSymbol("_CSETF-GES-GUI-TOKENS"), makeSymbol("_CSETF-GES-FULL-PARSE-TREE"), makeSymbol("_CSETF-GES-CURRENT-PARSE-TREE"), makeSymbol("_CSETF-GES-TOKEN-MAPPING"), makeSymbol("_CSETF-GES-PARENT-DOCUMENT"));

    static private final SubLString $str_alt54$__GED___S_sentences_ = makeString("#<GED: ~S sentences>");

    static private final SubLString $str_alt55$___ = makeString("...");

    static private final SubLString $str_alt56$__GES___S_ = makeString("#<GES: ~S>");

    static private final SubLList $list_alt58 = list(makeSymbol("SENTENCIFY-STRING"));

    static private final SubLString $str_alt59$_sentencify_cgi = makeString("/sentencify.cgi");

    static private final SubLString $str_alt61$_ = makeString("'");

    static private final SubLString $str_alt62$_ = makeString("\"");

    static private final SubLString $str_alt65$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list_alt70 = list(makeKeyword("LEXICON"), NIL);

    static private final SubLString $str_alt77$___S = makeString("~%~S");

    static private final SubLString $str_alt80$cycl_annotated_document = makeString("cycl-annotated-document");

    public static SubLObject init_parse_tree_gui_file() {
        defparameter("*STOP-WORD-CATEGORIES*", parse_tree_gui.$list0);
        defconstant("*DTP-GUI-ENABLED-DOCUMENT*", parse_tree_gui.GUI_ENABLED_DOCUMENT);
        defconstant("*DTP-GUI-ENABLED-SENTENCE*", parse_tree_gui.GUI_ENABLED_SENTENCE);
        defvar("*TOKEN-INDEX*", ZERO_INTEGER);
        return NIL;
    }

    static private final SubLList $list_alt84 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt85 = list(makeSymbol("XML-WRITER"));

    public static final SubLObject setup_parse_tree_gui_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_gui_enabled_document$.getGlobalValue(), symbol_function(GUI_ENABLED_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(GED_SENTENCES, _CSETF_GED_SENTENCES);
        def_csetf(GED_PARSER, _CSETF_GED_PARSER);
        def_csetf(GED_LEXICON, _CSETF_GED_LEXICON);
        identity(GUI_ENABLED_DOCUMENT);
        register_external_symbol(NEW_GUI_ENABLED_DOCUMENT);
        register_external_symbol(ADD_SENTENCE_TO_GED);
        register_external_symbol(GED_SENTENCE_NUMBER);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_gui_enabled_sentence$.getGlobalValue(), symbol_function(GUI_ENABLED_SENTENCE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(GES_SURFACE_STRING, _CSETF_GES_SURFACE_STRING);
        def_csetf(GES_GUI_TOKENS, _CSETF_GES_GUI_TOKENS);
        def_csetf(GES_FULL_PARSE_TREE, _CSETF_GES_FULL_PARSE_TREE);
        def_csetf(GES_CURRENT_PARSE_TREE, _CSETF_GES_CURRENT_PARSE_TREE);
        def_csetf(GES_TOKEN_MAPPING, _CSETF_GES_TOKEN_MAPPING);
        def_csetf(GES_PARENT_DOCUMENT, _CSETF_GES_PARENT_DOCUMENT);
        identity(GUI_ENABLED_SENTENCE);
        register_external_symbol(NEW_GUI_ENABLED_SENTENCE);
        define_obsolete_register(SENTENCIFY_REMOTELY, $list_alt58);
        methods.methods_incorporate_instance_method(TO_XML, WORD_TREE, $list_alt84, $list_alt85, $list_alt86);
        methods.subloop_register_instance_method(WORD_TREE, TO_XML, WORD_TREE_TO_XML_METHOD);
        register_external_symbol(GET_GES_ANNOTATED_LEAVES);
        register_external_symbol(GET_GED_ANNOTATED_TREE);
        register_external_symbol(GET_GES_ANNOTATED_TREE);
        register_external_symbol(GET_GED_ANNOTATED_LEAVES);
        register_external_symbol(SELECT_SENSE_FOR_WORD);
        register_external_symbol(FIND_WORD_INDEX_FROM_PATH);
        register_external_symbol(PRUNE_GES_BY_WFF_CHECKING);
        register_external_symbol(PRUNE_GED_SENTENCE_BY_WFF_CHECKING);
        register_external_symbol(CYCLIFY_GED_SENTENCE);
        methods.methods_incorporate_instance_method(NAIVE_WFF_SELF_PRUNE, PARSE_TREE, $list_alt84, NIL, $list_alt125);
        methods.subloop_register_instance_method(PARSE_TREE, NAIVE_WFF_SELF_PRUNE, PARSE_TREE_NAIVE_WFF_SELF_PRUNE_METHOD);
        methods.methods_incorporate_instance_method(PRUNE_LEXES, WORD_TREE, $list_alt84, $list_alt128, $list_alt129);
        methods.subloop_register_instance_method(WORD_TREE, PRUNE_LEXES, WORD_TREE_PRUNE_LEXES_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_REDUNDANT_LEXES, PARSE_TREE, $list_alt132, NIL, $list_alt133);
        methods.subloop_register_instance_method(PARSE_TREE, REMOVE_REDUNDANT_LEXES, PARSE_TREE_REMOVE_REDUNDANT_LEXES_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_REDUNDANT_LEXES, WORD_TREE, $list_alt132, NIL, $list_alt138);
        methods.subloop_register_instance_method(WORD_TREE, REMOVE_REDUNDANT_LEXES, WORD_TREE_REMOVE_REDUNDANT_LEXES_METHOD);
        methods.methods_incorporate_instance_method(PRUNE_LEXES, PHRASE_TREE, $list_alt84, $list_alt128, $list_alt145);
        methods.subloop_register_instance_method(PHRASE_TREE, PRUNE_LEXES, PHRASE_TREE_PRUNE_LEXES_METHOD);
        methods.methods_incorporate_instance_method(GET_NTH_WORD, PHRASE_TREE, $list_alt84, $list_alt147, $list_alt148);
        methods.subloop_register_instance_method(PHRASE_TREE, GET_NTH_WORD, PHRASE_TREE_GET_NTH_WORD_METHOD);
        return NIL;
    }

    public static SubLObject setup_parse_tree_gui_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), parse_tree_gui.$dtp_gui_enabled_document$.getGlobalValue(), symbol_function(parse_tree_gui.GUI_ENABLED_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(parse_tree_gui.$list9);
            def_csetf(parse_tree_gui.GED_SENTENCES, parse_tree_gui._CSETF_GED_SENTENCES);
            def_csetf(parse_tree_gui.GED_PARSER, parse_tree_gui._CSETF_GED_PARSER);
            def_csetf(parse_tree_gui.GED_LEXICON, parse_tree_gui._CSETF_GED_LEXICON);
            identity(parse_tree_gui.GUI_ENABLED_DOCUMENT);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), parse_tree_gui.$dtp_gui_enabled_document$.getGlobalValue(), symbol_function(parse_tree_gui.VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_DOCUMENT_METHOD));
            register_external_symbol(parse_tree_gui.NEW_GUI_ENABLED_DOCUMENT);
            register_external_symbol(parse_tree_gui.ADD_SENTENCE_TO_GED);
            register_external_symbol(parse_tree_gui.GED_SENTENCE_NUMBER);
            register_method($print_object_method_table$.getGlobalValue(), parse_tree_gui.$dtp_gui_enabled_sentence$.getGlobalValue(), symbol_function(parse_tree_gui.GUI_ENABLED_SENTENCE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(parse_tree_gui.$list37);
            def_csetf(parse_tree_gui.GES_SURFACE_STRING, parse_tree_gui._CSETF_GES_SURFACE_STRING);
            def_csetf(parse_tree_gui.GES_GUI_TOKENS, parse_tree_gui._CSETF_GES_GUI_TOKENS);
            def_csetf(parse_tree_gui.GES_FULL_PARSE_TREE, parse_tree_gui._CSETF_GES_FULL_PARSE_TREE);
            def_csetf(parse_tree_gui.GES_CURRENT_PARSE_TREE, parse_tree_gui._CSETF_GES_CURRENT_PARSE_TREE);
            def_csetf(parse_tree_gui.GES_TOKEN_MAPPING, parse_tree_gui._CSETF_GES_TOKEN_MAPPING);
            def_csetf(parse_tree_gui.GES_PARENT_DOCUMENT, parse_tree_gui._CSETF_GES_PARENT_DOCUMENT);
            identity(parse_tree_gui.GUI_ENABLED_SENTENCE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), parse_tree_gui.$dtp_gui_enabled_sentence$.getGlobalValue(), symbol_function(parse_tree_gui.VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_SENTENCE_METHOD));
            register_external_symbol(parse_tree_gui.NEW_GUI_ENABLED_SENTENCE);
            define_obsolete_register(parse_tree_gui.SENTENCIFY_REMOTELY, parse_tree_gui.$list67);
            methods_incorporate_instance_method(parse_tree_gui.TO_XML, parse_tree_gui.WORD_TREE, parse_tree_gui.$list93, parse_tree_gui.$list94, parse_tree_gui.$list95);
            subloop_register_instance_method(parse_tree_gui.WORD_TREE, parse_tree_gui.TO_XML, parse_tree_gui.WORD_TREE_TO_XML_METHOD);
            register_external_symbol(parse_tree_gui.GET_GES_ANNOTATED_LEAVES);
            register_external_symbol(parse_tree_gui.GET_GED_ANNOTATED_TREE);
            register_external_symbol(parse_tree_gui.GET_GES_ANNOTATED_TREE);
            register_external_symbol(parse_tree_gui.GET_GED_ANNOTATED_LEAVES);
            register_external_symbol(parse_tree_gui.SELECT_SENSE_FOR_WORD);
            register_external_symbol(parse_tree_gui.FIND_WORD_INDEX_FROM_PATH);
            register_external_symbol(parse_tree_gui.PRUNE_GES_BY_WFF_CHECKING);
            register_external_symbol(parse_tree_gui.PRUNE_GED_SENTENCE_BY_WFF_CHECKING);
            register_external_symbol(parse_tree_gui.CYCLIFY_GED_SENTENCE);
            methods_incorporate_instance_method(parse_tree_gui.NAIVE_WFF_SELF_PRUNE, PARSE_TREE, parse_tree_gui.$list93, NIL, parse_tree_gui.$list134);
            subloop_register_instance_method(PARSE_TREE, parse_tree_gui.NAIVE_WFF_SELF_PRUNE, parse_tree_gui.PARSE_TREE_NAIVE_WFF_SELF_PRUNE_METHOD);
            methods_incorporate_instance_method(parse_tree_gui.PRUNE_LEXES, parse_tree_gui.WORD_TREE, parse_tree_gui.$list93, parse_tree_gui.$list137, parse_tree_gui.$list138);
            subloop_register_instance_method(parse_tree_gui.WORD_TREE, parse_tree_gui.PRUNE_LEXES, parse_tree_gui.WORD_TREE_PRUNE_LEXES_METHOD);
            methods_incorporate_instance_method(parse_tree_gui.REMOVE_REDUNDANT_LEXES, PARSE_TREE, parse_tree_gui.$list141, NIL, parse_tree_gui.$list142);
            subloop_register_instance_method(PARSE_TREE, parse_tree_gui.REMOVE_REDUNDANT_LEXES, parse_tree_gui.PARSE_TREE_REMOVE_REDUNDANT_LEXES_METHOD);
            methods_incorporate_instance_method(parse_tree_gui.REMOVE_REDUNDANT_LEXES, parse_tree_gui.WORD_TREE, parse_tree_gui.$list141, NIL, parse_tree_gui.$list147);
            subloop_register_instance_method(parse_tree_gui.WORD_TREE, parse_tree_gui.REMOVE_REDUNDANT_LEXES, parse_tree_gui.WORD_TREE_REMOVE_REDUNDANT_LEXES_METHOD);
            methods_incorporate_instance_method(parse_tree_gui.PRUNE_LEXES, parse_tree_gui.PHRASE_TREE, parse_tree_gui.$list93, parse_tree_gui.$list137, parse_tree_gui.$list154);
            subloop_register_instance_method(parse_tree_gui.PHRASE_TREE, parse_tree_gui.PRUNE_LEXES, parse_tree_gui.PHRASE_TREE_PRUNE_LEXES_METHOD);
            methods_incorporate_instance_method(parse_tree_gui.GET_NTH_WORD, parse_tree_gui.PHRASE_TREE, parse_tree_gui.$list93, parse_tree_gui.$list156, parse_tree_gui.$list157);
            subloop_register_instance_method(parse_tree_gui.PHRASE_TREE, parse_tree_gui.GET_NTH_WORD, parse_tree_gui.PHRASE_TREE_GET_NTH_WORD_METHOD);
        }
        if (SubLFiles.USE_V2) {
            define_obsolete_register(SENTENCIFY_REMOTELY, $list_alt58);
            methods.methods_incorporate_instance_method(TO_XML, WORD_TREE, $list_alt84, $list_alt85, $list_alt86);
            methods.methods_incorporate_instance_method(NAIVE_WFF_SELF_PRUNE, PARSE_TREE, $list_alt84, NIL, $list_alt125);
            methods.methods_incorporate_instance_method(PRUNE_LEXES, WORD_TREE, $list_alt84, $list_alt128, $list_alt129);
            methods.methods_incorporate_instance_method(REMOVE_REDUNDANT_LEXES, PARSE_TREE, $list_alt132, NIL, $list_alt133);
            methods.methods_incorporate_instance_method(REMOVE_REDUNDANT_LEXES, WORD_TREE, $list_alt132, NIL, $list_alt138);
            methods.methods_incorporate_instance_method(PRUNE_LEXES, PHRASE_TREE, $list_alt84, $list_alt128, $list_alt145);
            methods.methods_incorporate_instance_method(GET_NTH_WORD, PHRASE_TREE, $list_alt84, $list_alt147, $list_alt148);
        }
        return NIL;
    }

    public static SubLObject setup_parse_tree_gui_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), parse_tree_gui.$dtp_gui_enabled_document$.getGlobalValue(), symbol_function(parse_tree_gui.GUI_ENABLED_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(parse_tree_gui.$list9);
        def_csetf(parse_tree_gui.GED_SENTENCES, parse_tree_gui._CSETF_GED_SENTENCES);
        def_csetf(parse_tree_gui.GED_PARSER, parse_tree_gui._CSETF_GED_PARSER);
        def_csetf(parse_tree_gui.GED_LEXICON, parse_tree_gui._CSETF_GED_LEXICON);
        identity(parse_tree_gui.GUI_ENABLED_DOCUMENT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), parse_tree_gui.$dtp_gui_enabled_document$.getGlobalValue(), symbol_function(parse_tree_gui.VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_DOCUMENT_METHOD));
        register_external_symbol(parse_tree_gui.NEW_GUI_ENABLED_DOCUMENT);
        register_external_symbol(parse_tree_gui.ADD_SENTENCE_TO_GED);
        register_external_symbol(parse_tree_gui.GED_SENTENCE_NUMBER);
        register_method($print_object_method_table$.getGlobalValue(), parse_tree_gui.$dtp_gui_enabled_sentence$.getGlobalValue(), symbol_function(parse_tree_gui.GUI_ENABLED_SENTENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(parse_tree_gui.$list37);
        def_csetf(parse_tree_gui.GES_SURFACE_STRING, parse_tree_gui._CSETF_GES_SURFACE_STRING);
        def_csetf(parse_tree_gui.GES_GUI_TOKENS, parse_tree_gui._CSETF_GES_GUI_TOKENS);
        def_csetf(parse_tree_gui.GES_FULL_PARSE_TREE, parse_tree_gui._CSETF_GES_FULL_PARSE_TREE);
        def_csetf(parse_tree_gui.GES_CURRENT_PARSE_TREE, parse_tree_gui._CSETF_GES_CURRENT_PARSE_TREE);
        def_csetf(parse_tree_gui.GES_TOKEN_MAPPING, parse_tree_gui._CSETF_GES_TOKEN_MAPPING);
        def_csetf(parse_tree_gui.GES_PARENT_DOCUMENT, parse_tree_gui._CSETF_GES_PARENT_DOCUMENT);
        identity(parse_tree_gui.GUI_ENABLED_SENTENCE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), parse_tree_gui.$dtp_gui_enabled_sentence$.getGlobalValue(), symbol_function(parse_tree_gui.VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_SENTENCE_METHOD));
        register_external_symbol(parse_tree_gui.NEW_GUI_ENABLED_SENTENCE);
        define_obsolete_register(parse_tree_gui.SENTENCIFY_REMOTELY, parse_tree_gui.$list67);
        methods_incorporate_instance_method(parse_tree_gui.TO_XML, parse_tree_gui.WORD_TREE, parse_tree_gui.$list93, parse_tree_gui.$list94, parse_tree_gui.$list95);
        subloop_register_instance_method(parse_tree_gui.WORD_TREE, parse_tree_gui.TO_XML, parse_tree_gui.WORD_TREE_TO_XML_METHOD);
        register_external_symbol(parse_tree_gui.GET_GES_ANNOTATED_LEAVES);
        register_external_symbol(parse_tree_gui.GET_GED_ANNOTATED_TREE);
        register_external_symbol(parse_tree_gui.GET_GES_ANNOTATED_TREE);
        register_external_symbol(parse_tree_gui.GET_GED_ANNOTATED_LEAVES);
        register_external_symbol(parse_tree_gui.SELECT_SENSE_FOR_WORD);
        register_external_symbol(parse_tree_gui.FIND_WORD_INDEX_FROM_PATH);
        register_external_symbol(parse_tree_gui.PRUNE_GES_BY_WFF_CHECKING);
        register_external_symbol(parse_tree_gui.PRUNE_GED_SENTENCE_BY_WFF_CHECKING);
        register_external_symbol(parse_tree_gui.CYCLIFY_GED_SENTENCE);
        methods_incorporate_instance_method(parse_tree_gui.NAIVE_WFF_SELF_PRUNE, PARSE_TREE, parse_tree_gui.$list93, NIL, parse_tree_gui.$list134);
        subloop_register_instance_method(PARSE_TREE, parse_tree_gui.NAIVE_WFF_SELF_PRUNE, parse_tree_gui.PARSE_TREE_NAIVE_WFF_SELF_PRUNE_METHOD);
        methods_incorporate_instance_method(parse_tree_gui.PRUNE_LEXES, parse_tree_gui.WORD_TREE, parse_tree_gui.$list93, parse_tree_gui.$list137, parse_tree_gui.$list138);
        subloop_register_instance_method(parse_tree_gui.WORD_TREE, parse_tree_gui.PRUNE_LEXES, parse_tree_gui.WORD_TREE_PRUNE_LEXES_METHOD);
        methods_incorporate_instance_method(parse_tree_gui.REMOVE_REDUNDANT_LEXES, PARSE_TREE, parse_tree_gui.$list141, NIL, parse_tree_gui.$list142);
        subloop_register_instance_method(PARSE_TREE, parse_tree_gui.REMOVE_REDUNDANT_LEXES, parse_tree_gui.PARSE_TREE_REMOVE_REDUNDANT_LEXES_METHOD);
        methods_incorporate_instance_method(parse_tree_gui.REMOVE_REDUNDANT_LEXES, parse_tree_gui.WORD_TREE, parse_tree_gui.$list141, NIL, parse_tree_gui.$list147);
        subloop_register_instance_method(parse_tree_gui.WORD_TREE, parse_tree_gui.REMOVE_REDUNDANT_LEXES, parse_tree_gui.WORD_TREE_REMOVE_REDUNDANT_LEXES_METHOD);
        methods_incorporate_instance_method(parse_tree_gui.PRUNE_LEXES, parse_tree_gui.PHRASE_TREE, parse_tree_gui.$list93, parse_tree_gui.$list137, parse_tree_gui.$list154);
        subloop_register_instance_method(parse_tree_gui.PHRASE_TREE, parse_tree_gui.PRUNE_LEXES, parse_tree_gui.PHRASE_TREE_PRUNE_LEXES_METHOD);
        methods_incorporate_instance_method(parse_tree_gui.GET_NTH_WORD, parse_tree_gui.PHRASE_TREE, parse_tree_gui.$list93, parse_tree_gui.$list156, parse_tree_gui.$list157);
        subloop_register_instance_method(parse_tree_gui.PHRASE_TREE, parse_tree_gui.GET_NTH_WORD, parse_tree_gui.PHRASE_TREE_GET_NTH_WORD_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt86 = list(list(makeSymbol("CLET"), list(list(makeSymbol("*XML-STREAM*"), list(makeSymbol("GET-SLOT"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("OUTSTREAM")))), list(makeSymbol("ATTRIBUTES"), list(makeSymbol("LIST"), makeString("pos"), makeSymbol("CATEGORY"), makeString("token"), makeSymbol("STRING"))), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("LEXEME"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("LEXEME"), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS"))), makeSymbol("TERM")), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("SEMTRANS")), list(makeSymbol("PIF"), list(makeSymbol("MEMBER?"), list(makeSymbol("FIRST"), makeSymbol("SEMTRANS")), list(QUOTE, list(reader_make_constant_shell("isa"), reader_make_constant_shell("equals")))), list(makeSymbol("CSETQ"), makeSymbol("TERM"), list(makeSymbol("THIRD"), makeSymbol("SEMTRANS"))), list(makeSymbol("CSOME"), list(makeSymbol("CLAUSE"), makeSymbol("SEMTRANS"), makeSymbol("TERM")), list(makeSymbol("PWHEN"), list(makeSymbol("LISTP"), makeSymbol("CLAUSE")), list(makeSymbol("PWHEN"), list(EQ, reader_make_constant_shell("isa"), list(makeSymbol("FIRST"), makeSymbol("CLAUSE"))), list(makeSymbol("CSETQ"), makeSymbol("TERM"), list(makeSymbol("THIRD"), makeSymbol("CLAUSE")))))))), list(makeSymbol("PWHEN"), list(makeSymbol("FORT-P"), makeSymbol("TERM")), list(makeSymbol("CPUSH"), makeSymbol("TERM"), makeSymbol("CYCLS"))))), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("START-TAG")), makeString("token"), makeSymbol("ATTRIBUTES"), NIL, T), list(makeSymbol("CDOLIST"), list(makeSymbol("CYCL"), makeSymbol("CYCLS")), list(makeSymbol("CYCML-SERIALIZE-OBJECT"), makeSymbol("CYCL"))), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("END-TAG")), makeString("token"), NIL, T)));

    static private final SubLSymbol $sym87$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    static private final SubLList $list_alt92 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("equals"));

    static private final SubLString $str_alt111$_ = makeString(" ");

    static private final SubLSymbol $sym112$SUBSTRING_ = makeSymbol("SUBSTRING?");

    @Override
    public void declareFunctions() {
        parse_tree_gui.declare_parse_tree_gui_file();
    }

    static private final SubLString $str_alt116$Attempted_to_set_sense__A__but_on = makeString("Attempted to set sense ~A, but only ~A lexes");

    @Override
    public void initializeVariables() {
        parse_tree_gui.init_parse_tree_gui_file();
    }

    @Override
    public void runTopLevelForms() {
        parse_tree_gui.setup_parse_tree_gui_file();
    }

    static {
    }

    static private final SubLList $list_alt125 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PARSES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCLIFY")), list(QUOTE, list(makeKeyword("LEXICON"), NIL)))), list(makeSymbol("WFF-TERMS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("PARSE"), makeSymbol("PARSES")), list(makeSymbol("CLET"), list(list(makeSymbol("TERMS"), list(makeSymbol("FLATTEN"), makeSymbol("PARSE")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TERM"), makeSymbol("TERMS")), list(makeSymbol("PWHEN"), list(makeSymbol("FORT-P"), makeSymbol("TERM")), list(makeSymbol("CPUSHNEW"), makeSymbol("TERM"), makeSymbol("WFF-TERMS")))))), list(makeSymbol("PWHEN"), makeSymbol("WFF-TERMS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PRUNE-LEXES")), makeSymbol("WFF-TERMS"))), list(RET, makeSymbol("SELF"))));

    static private final SubLList $list_alt128 = list(makeSymbol("WFF-TERMS"));

    static private final SubLList $list_alt129 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ACCEPTED"), NIL), list(makeSymbol("REJECTED"), NIL), list(makeSymbol("TO-REDISTRIBUTE"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS-TERMS"), list(makeSymbol("FLATTEN"), list(makeSymbol("EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")))))), list(makeSymbol("PCOND"), list(list(makeSymbol("INTERSECTION"), makeSymbol("SEMTRANS-TERMS"), makeSymbol("WFF-TERMS")), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("ACCEPTED"))), list(T, list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("REJECTED")), list(makeSymbol("CINC"), makeSymbol("TO-REDISTRIBUTE"), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("RLE"))))))), list(makeSymbol("PUNLESS"), list(makeSymbol("NULL"), makeSymbol("ACCEPTED")), list(makeSymbol("CLET"), list(list(makeSymbol("ADDENDUM"), list(makeSymbol("/"), makeSymbol("TO-REDISTRIBUTE"), list(makeSymbol("LENGTH"), makeSymbol("ACCEPTED"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("A"), makeSymbol("ACCEPTED")), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("A"), list(makeSymbol("+"), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("A")), makeSymbol("ADDENDUM")))))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("ACCEPTED")), list(RET, makeSymbol("REJECTED"))));

    public static final class $gui_enabled_document_p$UnaryFunction extends UnaryFunction {
        public $gui_enabled_document_p$UnaryFunction() {
            super(extractFunctionNamed("GUI-ENABLED-DOCUMENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return parse_tree_gui.gui_enabled_document_p(arg1);
        }
    }

    static private final SubLSymbol $sym130$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    static private final SubLList $list_alt132 = list(makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt133 = list(list(makeSymbol("DO-PARSE-TREE-SUBTREES"), list(makeSymbol("DAUGHTER"), makeSymbol("SELF")), list(makeSymbol("PWHEN"), list(makeSymbol("WORD-TREE-P"), makeSymbol("DAUGHTER")), list(makeSymbol("FIM"), makeSymbol("DAUGHTER"), list(QUOTE, makeSymbol("REMOVE-REDUNDANT-LEXES"))))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt136$_S_is_not_one_of__S = makeString("~S is not one of ~S");

    static private final SubLList $list_alt138 = list(list(makeSymbol("PIF"), list(EQ, makeKeyword("TO"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CATEGORY")))), list(makeSymbol("CLET"), list(list(makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MOTHER"))))), list(makeSymbol("PWHEN"), list(EQ, makeKeyword("VP"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-CATEGORY")))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), NIL))), list(makeSymbol("CLET"), list(list(makeSymbol("NON-REDUNDANT"), NIL), list(makeSymbol("TO-REDISTRIBUTE"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS"), list(makeSymbol("HL-TO-EL"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS")))), makeSymbol("FAIL")), list(makeSymbol("CSOME"), list(makeSymbol("OLD-RLE"), makeSymbol("NON-REDUNDANT"), makeSymbol("FAIL")), list(makeSymbol("CLET"), list(list(makeSymbol("OLD-SEMTRANS"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("OLD-RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS")))), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), list(EQUALP, makeSymbol("SEMTRANS"), makeSymbol("OLD-SEMTRANS"))))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("NON-REDUNDANT"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("NULL"), makeSymbol("NON-REDUNDANT")), list(makeSymbol("CLET"), list(list(makeSymbol("ADDENDUM"), list(makeSymbol("/"), makeSymbol("TO-REDISTRIBUTE"), list(makeSymbol("LENGTH"), makeSymbol("NON-REDUNDANT"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("NR"), makeSymbol("NON-REDUNDANT")), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("NR"), list(makeSymbol("+"), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("NR")), makeSymbol("ADDENDUM")))))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("NON-REDUNDANT")))), list(RET, makeSymbol("SELF")));

    public static final class $gui_enabled_sentence_p$UnaryFunction extends UnaryFunction {
        public $gui_enabled_sentence_p$UnaryFunction() {
            super(extractFunctionNamed("GUI-ENABLED-SENTENCE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return parse_tree_gui.gui_enabled_sentence_p(arg1);
        }
    }

    static private final SubLList $list_alt145 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("YIELD")))), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("PRUNE-LEXES")), makeSymbol("WFF-TERMS"))), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt147 = list(makeSymbol("INTEGER"));

    static private final SubLList $list_alt148 = list(list(makeSymbol("CLET"), list(list(makeSymbol("YIELD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("YIELD"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("INTEGER"), list(makeSymbol("LENGTH"), makeSymbol("YIELD"))), list(makeSymbol("WARN"), makeString("Attempted to get the ~A word, but there are only ~A words."), makeSymbol("INTEGER"), list(makeSymbol("LENGTH"), makeSymbol("YIELD"))), list(RET, NIL)), list(RET, list(makeSymbol("NTH"), makeSymbol("INTEGER"), makeSymbol("YIELD")))));

    static private final SubLString $str_alt149$Attempted_to_get_the__A_word__but = makeString("Attempted to get the ~A word, but there are only ~A words.");
}

/**
 * Total time: 529 ms
 */
