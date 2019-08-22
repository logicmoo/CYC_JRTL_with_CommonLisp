package com.cyc.cycjava.cycl.leader;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cyclifier;
import com.cyc.cycjava.cycl.cycml_generator;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.semtrans_lexicon;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.xml_vars;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class parse_tree_gui extends SubLTranslatedFile {
    public static final SubLFile me = new parse_tree_gui();

    public static final String myName = "com.cyc.cycjava.cycl.leader.parse_tree_gui";

    public static final String myFingerPrint = "cd4fbe8fb6c82aafdd1bd49ea6b597ac886c03ffc26440f6e8b4968deb80bef6";

    // defparameter
    // Definitions
    private static final SubLSymbol $stop_word_categories$ = makeSymbol("*STOP-WORD-CATEGORIES*");

    // defconstant
    public static final SubLSymbol $dtp_gui_enabled_document$ = makeSymbol("*DTP-GUI-ENABLED-DOCUMENT*");

    // defconstant
    public static final SubLSymbol $dtp_gui_enabled_sentence$ = makeSymbol("*DTP-GUI-ENABLED-SENTENCE*");

    // defvar
    private static final SubLSymbol $token_index$ = makeSymbol("*TOKEN-INDEX*");

    // Internal Constants
    public static final SubLList $list0 = list(new SubLObject[]{ makeKeyword("DT"), makeKeyword("CC"), makeKeyword("PRP"), makeKeyword("."), makeKeyword(","), makeKeyword(":"), makeKeyword("''"), makeKeyword("``"), makeKeyword("'"), makeKeyword("`"), makeKeyword("("), makeKeyword(")"), makeKeyword("-LRB-"), makeKeyword("-RRB-"), makeKeyword("LS") });

    public static final SubLSymbol GUI_ENABLED_DOCUMENT = makeSymbol("GUI-ENABLED-DOCUMENT");

    public static final SubLSymbol GUI_ENABLED_DOCUMENT_P = makeSymbol("GUI-ENABLED-DOCUMENT-P");

    public static final SubLList $list3 = list(makeSymbol("SENTENCES"), makeSymbol("PARSER"), makeSymbol("LEXICON"));

    public static final SubLList $list4 = list(makeKeyword("SENTENCES"), makeKeyword("PARSER"), makeKeyword("LEXICON"));

    public static final SubLList $list5 = list(makeSymbol("GED-SENTENCES"), makeSymbol("GED-PARSER"), makeSymbol("GED-LEXICON"));

    public static final SubLList $list6 = list(makeSymbol("_CSETF-GED-SENTENCES"), makeSymbol("_CSETF-GED-PARSER"), makeSymbol("_CSETF-GED-LEXICON"));

    public static final SubLSymbol PPRINT_GED = makeSymbol("PPRINT-GED");

    public static final SubLSymbol GUI_ENABLED_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GUI-ENABLED-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE");

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

    private static final SubLList $list95 = list(list(makeSymbol("CLET"), list(list(makeSymbol("*XML-STREAM*"), list(makeSymbol("GET-SLOT"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("OUTSTREAM")))), list(makeSymbol("ATTRIBUTES"), list(makeSymbol("LIST"), makeString("pos"), makeSymbol("CATEGORY"), makeString("token"), makeSymbol("STRING"))), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("LEXEME"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("LEXEME"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS"))), makeSymbol("TERM")), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("SEMTRANS")), list(makeSymbol("PIF"), list(makeSymbol("MEMBER?"), list(makeSymbol("FIRST"), makeSymbol("SEMTRANS")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("equals"))))), list(makeSymbol("CSETQ"), makeSymbol("TERM"), list(makeSymbol("THIRD"), makeSymbol("SEMTRANS"))), list(makeSymbol("CSOME"), list(makeSymbol("CLAUSE"), makeSymbol("SEMTRANS"), makeSymbol("TERM")), list(makeSymbol("PWHEN"), list(makeSymbol("LISTP"), makeSymbol("CLAUSE")), list(makeSymbol("PWHEN"), list(EQ, reader_make_constant_shell(makeString("isa")), list(makeSymbol("FIRST"), makeSymbol("CLAUSE"))), list(makeSymbol("CSETQ"), makeSymbol("TERM"), list(makeSymbol("THIRD"), makeSymbol("CLAUSE")))))))), list(makeSymbol("PWHEN"), list(makeSymbol("FORT-P"), makeSymbol("TERM")), list(makeSymbol("CPUSH"), makeSymbol("TERM"), makeSymbol("CYCLS"))))), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("START-TAG")), makeString("token"), makeSymbol("ATTRIBUTES"), NIL, T), list(makeSymbol("CDOLIST"), list(makeSymbol("CYCL"), makeSymbol("CYCLS")), list(makeSymbol("CYCML-SERIALIZE-OBJECT"), makeSymbol("CYCL"))), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("END-TAG")), makeString("token"), NIL, T)));

    private static final SubLSymbol $sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLString $$$pos = makeString("pos");

    private static final SubLString $$$token = makeString("token");





    private static final SubLList $list101 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("equals")));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



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



    private static final SubLList $list134 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PARSES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY")), list(makeSymbol("QUOTE"), list(makeKeyword("LEXICON"), NIL)))), list(makeSymbol("WFF-TERMS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("PARSE"), makeSymbol("PARSES")), list(makeSymbol("CLET"), list(list(makeSymbol("TERMS"), list(makeSymbol("FLATTEN"), makeSymbol("PARSE")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TERM"), makeSymbol("TERMS")), list(makeSymbol("PWHEN"), list(makeSymbol("FORT-P"), makeSymbol("TERM")), list(makeSymbol("CPUSHNEW"), makeSymbol("TERM"), makeSymbol("WFF-TERMS")))))), list(makeSymbol("PWHEN"), makeSymbol("WFF-TERMS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PRUNE-LEXES")), makeSymbol("WFF-TERMS"))), list(makeSymbol("RET"), makeSymbol("SELF"))));

    private static final SubLSymbol PRUNE_LEXES = makeSymbol("PRUNE-LEXES");

    private static final SubLSymbol PARSE_TREE_NAIVE_WFF_SELF_PRUNE_METHOD = makeSymbol("PARSE-TREE-NAIVE-WFF-SELF-PRUNE-METHOD");

    private static final SubLList $list137 = list(makeSymbol("WFF-TERMS"));

    public static final SubLList $list138 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ACCEPTED"), NIL), list(makeSymbol("REJECTED"), NIL), list(makeSymbol("TO-REDISTRIBUTE"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS-TERMS"), list(makeSymbol("FLATTEN"), list(makeSymbol("EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")))))), list(makeSymbol("PCOND"), list(list(makeSymbol("INTERSECTION"), makeSymbol("SEMTRANS-TERMS"), makeSymbol("WFF-TERMS")), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("ACCEPTED"))), list(T, list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("REJECTED")), list(makeSymbol("CINC"), makeSymbol("TO-REDISTRIBUTE"), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("RLE"))))))), list(makeSymbol("PUNLESS"), list(makeSymbol("NULL"), makeSymbol("ACCEPTED")), list(makeSymbol("CLET"), list(list(makeSymbol("ADDENDUM"), list(makeSymbol("/"), makeSymbol("TO-REDISTRIBUTE"), list(makeSymbol("LENGTH"), makeSymbol("ACCEPTED"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("A"), makeSymbol("ACCEPTED")), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("A"), list(makeSymbol("+"), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("A")), makeSymbol("ADDENDUM")))))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("ACCEPTED")), list(makeSymbol("RET"), makeSymbol("REJECTED"))));

    public static final SubLSymbol $sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol WORD_TREE_PRUNE_LEXES_METHOD = makeSymbol("WORD-TREE-PRUNE-LEXES-METHOD");

    private static final SubLList $list141 = list(makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC"));

    private static final SubLList $list142 = list(list(makeSymbol("DO-PARSE-TREE-SUBTREES"), list(makeSymbol("DAUGHTER"), makeSymbol("SELF")), list(makeSymbol("PWHEN"), list(makeSymbol("WORD-TREE-P"), makeSymbol("DAUGHTER")), list(makeSymbol("FIM"), makeSymbol("DAUGHTER"), list(makeSymbol("QUOTE"), makeSymbol("REMOVE-REDUNDANT-LEXES"))))), list(makeSymbol("RET"), makeSymbol("SELF")));





    private static final SubLString $str145$_S_is_not_one_of__S = makeString("~S is not one of ~S");

    private static final SubLSymbol PARSE_TREE_REMOVE_REDUNDANT_LEXES_METHOD = makeSymbol("PARSE-TREE-REMOVE-REDUNDANT-LEXES-METHOD");

    public static final SubLList $list147 = list(list(makeSymbol("PIF"), list(EQ, makeKeyword("TO"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY")))), list(makeSymbol("CLET"), list(list(makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MOTHER"))))), list(makeSymbol("PWHEN"), list(EQ, makeKeyword("VP"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY")))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), NIL))), list(makeSymbol("CLET"), list(list(makeSymbol("NON-REDUNDANT"), NIL), list(makeSymbol("TO-REDISTRIBUTE"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS"), list(makeSymbol("HL-TO-EL"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS")))), makeSymbol("FAIL")), list(makeSymbol("CSOME"), list(makeSymbol("OLD-RLE"), makeSymbol("NON-REDUNDANT"), makeSymbol("FAIL")), list(makeSymbol("CLET"), list(list(makeSymbol("OLD-SEMTRANS"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("OLD-RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS")))), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), list(EQUALP, makeSymbol("SEMTRANS"), makeSymbol("OLD-SEMTRANS"))))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("NON-REDUNDANT"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("NULL"), makeSymbol("NON-REDUNDANT")), list(makeSymbol("CLET"), list(list(makeSymbol("ADDENDUM"), list(makeSymbol("/"), makeSymbol("TO-REDISTRIBUTE"), list(makeSymbol("LENGTH"), makeSymbol("NON-REDUNDANT"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("NR"), makeSymbol("NON-REDUNDANT")), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("NR"), list(makeSymbol("+"), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("NR")), makeSymbol("ADDENDUM")))))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("NON-REDUNDANT")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");







    private static final SubLSymbol WORD_TREE_REMOVE_REDUNDANT_LEXES_METHOD = makeSymbol("WORD-TREE-REMOVE-REDUNDANT-LEXES-METHOD");

    private static final SubLSymbol PHRASE_TREE = makeSymbol("PHRASE-TREE");

    private static final SubLList $list154 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("YIELD")))), list(makeSymbol("FIM"), makeSymbol("WORD"), list(makeSymbol("QUOTE"), makeSymbol("PRUNE-LEXES")), makeSymbol("WFF-TERMS"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol PHRASE_TREE_PRUNE_LEXES_METHOD = makeSymbol("PHRASE-TREE-PRUNE-LEXES-METHOD");

    private static final SubLList $list156 = list(makeSymbol("INTEGER"));

    private static final SubLList $list157 = list(list(makeSymbol("CLET"), list(list(makeSymbol("YIELD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("YIELD"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("INTEGER"), list(makeSymbol("LENGTH"), makeSymbol("YIELD"))), list(makeSymbol("WARN"), makeString("Attempted to get the ~A word, but there are only ~A words."), makeSymbol("INTEGER"), list(makeSymbol("LENGTH"), makeSymbol("YIELD"))), list(makeSymbol("RET"), NIL)), list(makeSymbol("RET"), list(makeSymbol("NTH"), makeSymbol("INTEGER"), makeSymbol("YIELD")))));

    private static final SubLString $str158$Attempted_to_get_the__A_word__but = makeString("Attempted to get the ~A word, but there are only ~A words.");

    private static final SubLSymbol PHRASE_TREE_GET_NTH_WORD_METHOD = makeSymbol("PHRASE-TREE-GET-NTH-WORD-METHOD");

    public static SubLObject stop_word_p(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(category, $stop_word_categories$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject gui_enabled_document_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_ged(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject gui_enabled_document_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$gui_enabled_document_native.class ? T : NIL;
    }

    public static SubLObject ged_sentences(final SubLObject v_object) {
        assert NIL != gui_enabled_document_p(v_object) : "parse_tree_gui.gui_enabled_document_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject ged_parser(final SubLObject v_object) {
        assert NIL != gui_enabled_document_p(v_object) : "parse_tree_gui.gui_enabled_document_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject ged_lexicon(final SubLObject v_object) {
        assert NIL != gui_enabled_document_p(v_object) : "parse_tree_gui.gui_enabled_document_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_ged_sentences(final SubLObject v_object, final SubLObject value) {
        assert NIL != gui_enabled_document_p(v_object) : "parse_tree_gui.gui_enabled_document_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ged_parser(final SubLObject v_object, final SubLObject value) {
        assert NIL != gui_enabled_document_p(v_object) : "parse_tree_gui.gui_enabled_document_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ged_lexicon(final SubLObject v_object, final SubLObject value) {
        assert NIL != gui_enabled_document_p(v_object) : "parse_tree_gui.gui_enabled_document_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_gui_enabled_document(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $gui_enabled_document_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SENTENCES)) {
                _csetf_ged_sentences(v_new, current_value);
            } else
                if (pcase_var.eql($PARSER)) {
                    _csetf_ged_parser(v_new, current_value);
                } else
                    if (pcase_var.eql($LEXICON)) {
                        _csetf_ged_lexicon(v_new, current_value);
                    } else {
                        Errors.error($str19$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_gui_enabled_document(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GUI_ENABLED_DOCUMENT, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SENTENCES, ged_sentences(obj));
        funcall(visitor_fn, obj, $SLOT, $PARSER, ged_parser(obj));
        funcall(visitor_fn, obj, $SLOT, $LEXICON, ged_lexicon(obj));
        funcall(visitor_fn, obj, $END, MAKE_GUI_ENABLED_DOCUMENT, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_gui_enabled_document_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_gui_enabled_document(obj, visitor_fn);
    }

    public static SubLObject new_gui_enabled_document(final SubLObject size, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = object.new_class_instance(CYCLIFIER_LEXICON);
        }
        final SubLObject ged = make_gui_enabled_document(UNPROVIDED);
        final SubLObject v_parser = parser.new_stanford_parser(UNPROVIDED, UNPROVIDED);
        final SubLObject sentence_vector = make_vector(size, UNPROVIDED);
        _csetf_ged_sentences(ged, sentence_vector);
        _csetf_ged_parser(ged, v_parser);
        _csetf_ged_lexicon(ged, lexicon);
        return ged;
    }

    public static SubLObject add_sentence_to_ged(final SubLObject ged, final SubLObject sentence_string, final SubLObject index) {
        final SubLObject ges = new_gui_enabled_sentence(sentence_string, ged, ged_parser(ged));
        final SubLObject sentence_vector = ged_sentences(ged);
        SubLObject successP = NIL;
        set_aref(sentence_vector, index, ges);
        if ((NIL != gui_enabled_sentence_p(ges)) && (NIL != parse_tree.parse_tree_p(ges_full_parse_tree(ges)))) {
            successP = T;
        }
        return successP;
    }

    public static SubLObject ged_sentence_number(final SubLObject ged) {
        return length(ged_sentences(ged));
    }

    public static SubLObject gui_enabled_sentence_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_ges(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject gui_enabled_sentence_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$gui_enabled_sentence_native.class ? T : NIL;
    }

    public static SubLObject ges_surface_string(final SubLObject v_object) {
        assert NIL != gui_enabled_sentence_p(v_object) : "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject ges_gui_tokens(final SubLObject v_object) {
        assert NIL != gui_enabled_sentence_p(v_object) : "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject ges_full_parse_tree(final SubLObject v_object) {
        assert NIL != gui_enabled_sentence_p(v_object) : "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject ges_current_parse_tree(final SubLObject v_object) {
        assert NIL != gui_enabled_sentence_p(v_object) : "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject ges_token_mapping(final SubLObject v_object) {
        assert NIL != gui_enabled_sentence_p(v_object) : "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject ges_parent_document(final SubLObject v_object) {
        assert NIL != gui_enabled_sentence_p(v_object) : "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_ges_surface_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != gui_enabled_sentence_p(v_object) : "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ges_gui_tokens(final SubLObject v_object, final SubLObject value) {
        assert NIL != gui_enabled_sentence_p(v_object) : "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ges_full_parse_tree(final SubLObject v_object, final SubLObject value) {
        assert NIL != gui_enabled_sentence_p(v_object) : "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ges_current_parse_tree(final SubLObject v_object, final SubLObject value) {
        assert NIL != gui_enabled_sentence_p(v_object) : "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ges_token_mapping(final SubLObject v_object, final SubLObject value) {
        assert NIL != gui_enabled_sentence_p(v_object) : "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ges_parent_document(final SubLObject v_object, final SubLObject value) {
        assert NIL != gui_enabled_sentence_p(v_object) : "parse_tree_gui.gui_enabled_sentence_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_gui_enabled_sentence(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $gui_enabled_sentence_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SURFACE_STRING)) {
                _csetf_ges_surface_string(v_new, current_value);
            } else
                if (pcase_var.eql($GUI_TOKENS)) {
                    _csetf_ges_gui_tokens(v_new, current_value);
                } else
                    if (pcase_var.eql($FULL_PARSE_TREE)) {
                        _csetf_ges_full_parse_tree(v_new, current_value);
                    } else
                        if (pcase_var.eql($CURRENT_PARSE_TREE)) {
                            _csetf_ges_current_parse_tree(v_new, current_value);
                        } else
                            if (pcase_var.eql($TOKEN_MAPPING)) {
                                _csetf_ges_token_mapping(v_new, current_value);
                            } else
                                if (pcase_var.eql($PARENT_DOCUMENT)) {
                                    _csetf_ges_parent_document(v_new, current_value);
                                } else {
                                    Errors.error($str19$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_gui_enabled_sentence(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GUI_ENABLED_SENTENCE, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SURFACE_STRING, ges_surface_string(obj));
        funcall(visitor_fn, obj, $SLOT, $GUI_TOKENS, ges_gui_tokens(obj));
        funcall(visitor_fn, obj, $SLOT, $FULL_PARSE_TREE, ges_full_parse_tree(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_PARSE_TREE, ges_current_parse_tree(obj));
        funcall(visitor_fn, obj, $SLOT, $TOKEN_MAPPING, ges_token_mapping(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT_DOCUMENT, ges_parent_document(obj));
        funcall(visitor_fn, obj, $END, MAKE_GUI_ENABLED_SENTENCE, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_gui_enabled_sentence_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_gui_enabled_sentence(obj, visitor_fn);
    }

    public static SubLObject new_gui_enabled_sentence(final SubLObject sentence_string, final SubLObject v_document, final SubLObject v_parser) {
        final SubLObject ges = make_gui_enabled_sentence(UNPROVIDED);
        final SubLObject full_tree = methods.funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
        final SubLObject current_tree = methods.funcall_instance_method_with_1_args(v_parser, PARSE, sentence_string);
        final SubLObject lexicon = ged_lexicon(v_document);
        methods.funcall_instance_method_with_1_args(lexicon, LEARN, sentence_string);
        if (NIL != parse_tree.parse_tree_p(full_tree)) {
            methods.funcall_instance_method_with_1_args(full_tree, LEXIFY, lexicon);
            methods.funcall_instance_method_with_0_args(full_tree, REMOVE_REDUNDANT_LEXES);
            methods.funcall_instance_method_with_1_args(current_tree, LEXIFY, lexicon);
            methods.funcall_instance_method_with_0_args(current_tree, REMOVE_REDUNDANT_LEXES);
        }
        _csetf_ges_parent_document(ges, v_document);
        _csetf_ges_surface_string(ges, sentence_string);
        _csetf_ges_full_parse_tree(ges, full_tree);
        _csetf_ges_current_parse_tree(ges, current_tree);
        _csetf_ges_gui_tokens(ges, create_token_list(ges));
        _csetf_ges_token_mapping(ges, create_ges_token_mapping(ges));
        return ges;
    }

    public static SubLObject ges_lexicon(final SubLObject ges) {
        final SubLObject parent = ges_parent_document(ges);
        if (NIL != parent) {
            return ged_lexicon(parent);
        }
        return NIL;
    }

    public static SubLObject pprint_ged(final SubLObject ged, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str63$__GED___S_sentences_, length(ged_sentences(ged)));
        return ged;
    }

    public static SubLObject pprint_ges(final SubLObject ges, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject string = ges_surface_string(ges);
        SubLObject print_string = string_utilities.string_first_n(TWENTY_INTEGER, string);
        if (length(string).numG(TWENTY_INTEGER)) {
            print_string = cconcatenate(print_string, $str64$___);
        }
        format(stream, $str65$__GES___S_, print_string);
        return ges;
    }

    public static SubLObject new_gui_enabled_document_from_stream(final SubLObject stream) {
        final SubLObject string = document.stream_stringify(stream);
        final SubLObject sentences = document.sentencify_string(string);
        final SubLObject ged = new_gui_enabled_document(length(sentences), UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject sentence = NIL;
        SubLObject i = NIL;
        list_var = sentences;
        sentence = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , i = add(ONE_INTEGER, i)) {
            add_sentence_to_ged(ged, sentence, i);
        }
        return ged;
    }

    public static SubLObject sentencify_remotely(final SubLObject string, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str68$_sentencify_cgi);
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
        final SubLObject safe_string = string_utilities.string_substitute($str70$_, $str71$_, string, UNPROVIDED);
        final SubLObject query = list(list($$$string, safe_string));
        final SubLObject safe_sentences = read_from_string(web_utilities.http_retrieve(query, path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return safe_sentences;
    }

    public static SubLObject new_gui_enabled_document_from_file(final SubLObject filepath) {
        SubLObject ged = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filepath, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str74$Unable_to_open__S, filepath);
            }
            final SubLObject stream_$1 = stream;
            ged = new_gui_enabled_document_from_stream(stream_$1);
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

    public static SubLObject new_gui_enabled_document_from_string(final SubLObject string) {
        return new_gui_enabled_document(string, UNPROVIDED);
    }

    public static SubLObject gui_enabled_sentence_to_xml(final SubLObject ges, final SubLObject v_xml_writer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != gui_enabled_sentence_p(ges) : "parse_tree_gui.gui_enabled_sentence_p(ges) " + "CommonSymbols.NIL != parse_tree_gui.gui_enabled_sentence_p(ges) " + ges;
        methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $$$sentence, NIL, NIL, T);
        final SubLObject tree = ges_current_parse_tree(ges);
        final SubLObject words = (NIL != parse_tree.parse_tree_p(tree)) ? methods.funcall_instance_method_with_0_args(tree, YIELD) : NIL;
        final SubLObject parses = methods.funcall_instance_method_with_1_args(tree, CYCLIFY, $list79);
        methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $$$tokens, NIL, NIL, T);
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != word_tree.word_tree_p(word)) {
                methods.funcall_instance_method_with_1_args(word, TO_XML, v_xml_writer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        methods.funcall_instance_method_with_3_args(v_xml_writer, END_TAG, $$$tokens, NIL, T);
        methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $$$parses, NIL, NIL, T);
        cdolist_list_var = parses;
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(instances.get_slot(v_xml_writer, OUTSTREAM), thread);
                SubLObject error = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            cycml_generator.cycml_serialize_object(parse);
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
                    Errors.warn($str86$___S, error);
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        methods.funcall_instance_method_with_3_args(v_xml_writer, END_TAG, $$$parses, NIL, T);
        methods.funcall_instance_method_with_3_args(v_xml_writer, END_TAG, $$$sentence, NIL, T);
        return T;
    }

    public static SubLObject ged_to_xml_string(final SubLObject ged) {
        final SubLObject v_xml_writer = object.new_class_instance(XML_WRITER);
        final SubLObject stream = make_string_output_stream();
        SubLObject string = NIL;
        methods.funcall_instance_method_with_1_args(v_xml_writer, SET_STREAM, stream);
        methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $str89$cycl_annotated_document, NIL, NIL, T);
        final SubLObject vector_var = ged_sentences(ged);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject ges;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            ges = aref(vector_var, element_num);
            if (NIL != gui_enabled_sentence_p(ges)) {
                gui_enabled_sentence_to_xml(ges, v_xml_writer);
            }
        }
        methods.funcall_instance_method_with_3_args(v_xml_writer, END_TAG, $str89$cycl_annotated_document, NIL, T);
        methods.funcall_instance_method_with_0_args(v_xml_writer, FLUSH);
        string = get_output_stream_string(stream);
        methods.funcall_instance_method_with_0_args(v_xml_writer, CLOSE);
        return string;
    }

    public static SubLObject word_tree_to_xml_method(final SubLObject self, final SubLObject v_xml_writer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = NIL;
        final SubLObject category = parse_tree.get_parse_tree_category(self);
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push($sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(instances.get_slot(v_xml_writer, OUTSTREAM), thread);
                    final SubLObject attributes = list($$$pos, category, $$$token, string);
                    SubLObject cycls = NIL;
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_LEXES);
                    SubLObject lexeme = NIL;
                    lexeme = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject semtrans = methods.funcall_instance_method_with_1_args(lexeme, GET, $SEMTRANS);
                        SubLObject v_term = NIL;
                        if (semtrans.isCons()) {
                            if (NIL != subl_promotions.memberP(semtrans.first(), $list101, UNPROVIDED, UNPROVIDED)) {
                                v_term = third(semtrans);
                            } else
                                if (NIL == v_term) {
                                    SubLObject csome_list_var = semtrans;
                                    SubLObject clause = NIL;
                                    clause = csome_list_var.first();
                                    while ((NIL == v_term) && (NIL != csome_list_var)) {
                                        if (clause.isList() && $$isa.eql(clause.first())) {
                                            v_term = third(clause);
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        clause = csome_list_var.first();
                                    } 
                                }

                        }
                        if (NIL != forts.fort_p(v_term)) {
                            cycls = cons(v_term, cycls);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        lexeme = cdolist_list_var.first();
                    } 
                    methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, $$$token, attributes, NIL, T);
                    cdolist_list_var = cycls;
                    SubLObject cycl = NIL;
                    cycl = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cycml_generator.cycml_serialize_object(cycl);
                        cdolist_list_var = cdolist_list_var.rest();
                        cycl = cdolist_list_var.first();
                    } 
                    methods.funcall_instance_method_with_3_args(v_xml_writer, END_TAG, $$$token, NIL, T);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    parse_tree.set_parse_tree_category(self, category);
                    parse_tree.set_parse_tree_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }

    public static SubLObject removal_lambda(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numE(v_object, $token_index$.getDynamicValue(thread));
    }

    public static SubLObject get_ges_annotated_leaves(final SubLObject ges) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokens = ges_gui_tokens(ges);
        final SubLObject token_mapping = ges_token_mapping(ges);
        final SubLObject words = methods.funcall_instance_method_with_0_args(ges_full_parse_tree(ges), YIELD);
        final SubLObject lexicon = ges_lexicon(ges);
        SubLObject annotated_words = NIL;
        SubLObject list_var = NIL;
        SubLObject token = NIL;
        SubLObject i = NIL;
        list_var = tokens;
        token = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject _prev_bind_0 = $token_index$.currentBinding(thread);
            try {
                $token_index$.bind(i, thread);
                final SubLObject indices = Mapping.mapcar(symbol_function(CAR), list_utilities.remove_if_not(symbol_function(REMOVAL_LAMBDA), token_mapping, symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject category = T;
                SubLObject lexes = NIL;
                SubLObject cycls = NIL;
                SubLObject cdolist_list_var = indices;
                SubLObject index = NIL;
                index = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject word = nth(index, words);
                    lexes = cconcatenate(lexes, methods.funcall_instance_method_with_0_args(word, GET_LEXES));
                    category = makeBoolean((NIL != category) && (NIL != stop_word_p(methods.funcall_instance_method_with_0_args(word, GET_CATEGORY))));
                    cdolist_list_var = cdolist_list_var.rest();
                    index = cdolist_list_var.first();
                } 
                cdolist_list_var = lexes;
                SubLObject lex = NIL;
                lex = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject extracted = semtrans_lexicon.extract_cycl_from_semtrans_lex_entry(lex, lexicon);
                    if (NIL != extracted) {
                        cycls = cons(extracted, cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    lex = cdolist_list_var.first();
                } 
                cycls = list_utilities.fast_delete_duplicates(cycls, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                annotated_words = cons(list(token, cycls, category), annotated_words);
            } finally {
                $token_index$.rebind(_prev_bind_0, thread);
            }
        }
        return nreverse(annotated_words);
    }

    public static SubLObject get_ged_annotated_tree(final SubLObject ged, final SubLObject ges_idx) {
        final SubLObject ges = aref(ged_sentences(ged), ges_idx);
        return get_ges_annotated_tree(ges);
    }

    public static SubLObject get_ges_annotated_tree(final SubLObject ges) {
        final SubLObject tree = ges_full_parse_tree(ges);
        final SubLObject lexicon = ges_lexicon(ges);
        return annotate_parse_tree(tree, lexicon);
    }

    public static SubLObject annotate_parse_tree(final SubLObject v_parse_tree, final SubLObject lexicon) {
        if (NIL != parse_tree.phrase_tree_p(v_parse_tree)) {
            return annotate_phrase_tree(v_parse_tree, lexicon);
        }
        if (NIL != word_tree.word_tree_p(v_parse_tree)) {
            return annotate_word_tree(v_parse_tree, lexicon);
        }
        return NIL;
    }

    public static SubLObject annotate_phrase_tree(final SubLObject phrase_tree, final SubLObject lexicon) {
        final SubLObject category = parse_tree.get_parse_tree_category(phrase_tree);
        SubLObject result = NIL;
        result = cons(list($PHRASE_TREE, category, methods.funcall_instance_method_with_0_args(phrase_tree, GET_STRING), methods.funcall_instance_method_with_0_args(phrase_tree, GET_PATH)), result);
        final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(phrase_tree);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            result = cons(annotate_parse_tree(daughter, lexicon), result);
        }
        return nreverse(result);
    }

    public static SubLObject annotate_word_tree(final SubLObject v_word_tree, final SubLObject lexicon) {
        final SubLObject category = parse_tree.get_parse_tree_category(v_word_tree);
        final SubLObject lexes = methods.funcall_instance_method_with_0_args(v_word_tree, GET_LEXES);
        SubLObject cycls = NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject extracted = semtrans_lexicon.extract_cycl_from_semtrans_lex_entry(lex, lexicon);
            if (NIL != extracted) {
                cycls = cons(extracted, cycls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        } 
        return list($WORD_TREE, category, methods.funcall_instance_method_with_0_args(v_word_tree, GET_STRING), methods.funcall_instance_method_with_0_args(v_word_tree, GET_PATH), cycls);
    }

    public static SubLObject create_ges_token_mapping(final SubLObject ges) {
        final SubLObject token_list = ges_gui_tokens(ges);
        final SubLObject full_tree = ges_full_parse_tree(ges);
        final SubLObject words = methods.funcall_instance_method_with_0_args(full_tree, YIELD);
        return parsing_utilities.create_token_mapping(token_list, words, symbol_function(IDENTITY), symbol_function(GES_WORD_STRING));
    }

    public static SubLObject ges_word_string(final SubLObject word) {
        return methods.funcall_instance_method_with_0_args(word, GET_STRING);
    }

    public static SubLObject create_token_list(final SubLObject ges) {
        final SubLObject token_list = delete_if(symbol_function(EMPTY_STRING_P), Mapping.mapcar(symbol_function(TRIM_WHITESPACE), string_utilities.split_string(ges_surface_string(ges), UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject words = methods.funcall_instance_method_with_0_args(ges_full_parse_tree(ges), YIELD);
        SubLObject word_strings = NIL;
        SubLObject word_lists = NIL;
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            word_strings = cons(methods.funcall_instance_method_with_0_args(word, GET_STRING), word_strings);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        cdolist_list_var = word_strings;
        SubLObject word_string = NIL;
        word_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject word_list = string_utilities.split_string(word_string, UNPROVIDED);
            if (length(word_list).numG(ONE_INTEGER)) {
                word_lists = cons(word_list, word_lists);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word_string = cdolist_list_var.first();
        } 
        if (NIL != word_lists) {
            return nmerge_words(word_lists, token_list);
        }
        return token_list;
    }

    public static SubLObject nmerge_words(final SubLObject word_lists, final SubLObject string_list) {
        SubLObject cdolist_list_var = word_lists;
        SubLObject word_list = NIL;
        word_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            reattach_word(word_list, string_list, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            word_list = cdolist_list_var.first();
        } 
        return string_list;
    }

    public static SubLObject add_spaces(final SubLObject word_list) {
        SubLObject string = $str119$;
        SubLObject list_var = NIL;
        SubLObject word = NIL;
        SubLObject i = NIL;
        list_var = word_list;
        word = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (i.numG(ZERO_INTEGER)) {
                string = cconcatenate(string, $$$_);
            }
            string = cconcatenate(string, word);
        }
        return string;
    }

    public static SubLObject reattach_word(final SubLObject word_list, final SubLObject string_list, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        final SubLObject index = search(word_list, string_list, symbol_function($sym121$SUBSTRING_), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, UNPROVIDED);
        if (NIL != index) {
            final SubLObject newtoken = add_spaces(subseq(string_list, index, add(index, length(word_list))));
            list_utilities.ncollapse_n_from_pos(length(word_list), index, newtoken, string_list);
            reattach_word(word_list, string_list, add(index, ONE_INTEGER));
            return T;
        }
        return NIL;
    }

    public static SubLObject get_ged_annotated_leaves(final SubLObject ged, final SubLObject ges_idx) {
        final SubLObject ges = aref(ged_sentences(ged), ges_idx);
        return get_ges_annotated_leaves(ges);
    }

    public static SubLObject select_sense_for_word(final SubLObject ged, final SubLObject ges_idx, final SubLObject word_num, final SubLObject sense_num) {
        final SubLObject ges = aref(ged_sentences(ged), ges_idx);
        final SubLObject full_tree = ges_full_parse_tree(ges);
        final SubLObject all_lexes = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(full_tree, GET_NTH_WORD, word_num), GET_LEXES);
        SubLObject target = NIL;
        if (length(all_lexes).numGE(sense_num)) {
            target = nth(sense_num, all_lexes);
        } else {
            Errors.warn($str125$Attempted_to_set_sense__A__but_on, sense_num, length(all_lexes));
        }
        if (NIL != target) {
            final SubLObject current_tree = ges_current_parse_tree(ges);
            final SubLObject word = methods.funcall_instance_method_with_1_args(current_tree, GET_NTH_WORD, word_num);
            instances.set_slot(word, LEXES, list(cons(target, ONE_INTEGER)));
        }
        return T;
    }

    public static SubLObject find_word_index_from_path(final SubLObject ged, final SubLObject ges_idx, final SubLObject path) {
        final SubLObject ges = aref(ged_sentences(ged), ges_idx);
        SubLObject tree = ges_full_parse_tree(ges);
        final SubLObject yield = methods.funcall_instance_method_with_0_args(tree, YIELD);
        SubLObject cdolist_list_var = path;
        SubLObject index = NIL;
        index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            tree = aref(parse_tree.get_phrase_tree_daughters(tree), index);
            cdolist_list_var = cdolist_list_var.rest();
            index = cdolist_list_var.first();
        } 
        return list_utilities.list_position(tree, yield, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject prune_ges_by_wff_checking(final SubLObject ges) {
        final SubLObject full_tree = ges_full_parse_tree(ges);
        final SubLObject current_tree = ges_current_parse_tree(ges);
        final SubLObject full_yield = methods.funcall_instance_method_with_0_args(full_tree, YIELD);
        final SubLObject current_yield = methods.funcall_instance_method_with_0_args(current_tree, YIELD);
        SubLObject message = NIL;
        methods.funcall_instance_method_with_0_args(current_tree, NAIVE_WFF_SELF_PRUNE);
        SubLObject full_word = NIL;
        SubLObject full_word_$3 = NIL;
        SubLObject current_word = NIL;
        SubLObject current_word_$4 = NIL;
        full_word = full_yield;
        full_word_$3 = full_word.first();
        current_word = current_yield;
        current_word_$4 = current_word.first();
        while ((NIL != current_word) || (NIL != full_word)) {
            final SubLObject full_lexes = methods.funcall_instance_method_with_0_args(full_word_$3, GET_LEXES);
            final SubLObject current_lexes = methods.funcall_instance_method_with_0_args(current_word_$4, GET_LEXES);
            SubLObject word_message = NIL;
            SubLObject cdolist_list_var = full_lexes;
            SubLObject lex = NIL;
            lex = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != subl_promotions.memberP(lex, current_lexes, symbol_function(LEX_ENTRY_EQUALP), UNPROVIDED)) {
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
        SubLObject cdolist_list_var2 = reverse(ges_token_mapping(ges));
        SubLObject mapping = NIL;
        mapping = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject full_parse_position = mapping.first();
            final SubLObject annotated_position = mapping.rest();
            if (!full_parse_position.eql(annotated_position)) {
                list_utilities.delete_nth(full_parse_position, message);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            mapping = cdolist_list_var2.first();
        } 
        return message;
    }

    public static SubLObject prune_ged_sentence_by_wff_checking(final SubLObject ged, final SubLObject ges_idx) {
        final SubLObject ges = aref(ged_sentences(ged), ges_idx);
        return prune_ges_by_wff_checking(ges);
    }

    public static SubLObject cyclify_ged_sentence(final SubLObject ged, final SubLObject ges_idx) {
        final SubLObject ges = aref(ged_sentences(ged), ges_idx);
        final SubLObject current_tree = ges_current_parse_tree(ges);
        if (NIL != parse_tree.parse_tree_p(current_tree)) {
            return methods.funcall_instance_method_with_1_args(current_tree, CYCLIFY, $list79);
        }
        return NIL;
    }

    public static SubLObject parse_tree_naive_wff_self_prune_method(final SubLObject self) {
        final SubLObject parses = methods.funcall_instance_method_with_1_args(self, CYCLIFY, $list79);
        SubLObject wff_terms = NIL;
        SubLObject cdolist_list_var = parses;
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5;
            final SubLObject terms = cdolist_list_var_$5 = list_utilities.flatten(parse);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                if (NIL != forts.fort_p(v_term)) {
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
            methods.funcall_instance_method_with_1_args(self, PRUNE_LEXES, wff_terms);
        }
        return self;
    }

    public static SubLObject word_tree_prune_lexes_method(final SubLObject self, final SubLObject wff_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = NIL;
        SubLObject lexes = word_tree.get_word_tree_lexes(self);
        try {
            thread.throwStack.push($sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                SubLObject accepted = NIL;
                SubLObject rejected = NIL;
                SubLObject to_redistribute = ZERO_INTEGER;
                SubLObject cdolist_list_var = lexes;
                SubLObject rle = NIL;
                rle = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject semtrans_terms = list_utilities.flatten(semtrans_lexicon.extract_cycl_from_semtrans_lex_entry(cyclifier.rle_lex(rle), UNPROVIDED));
                    if (NIL != intersection(semtrans_terms, wff_terms, UNPROVIDED, UNPROVIDED)) {
                        accepted = cons(rle, accepted);
                    } else {
                        rejected = cons(rle, rejected);
                        to_redistribute = add(to_redistribute, cyclifier.rle_confidence(rle));
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
                        cyclifier.rle_set_confidence(a, add(cyclifier.rle_confidence(a), addendum));
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        a = cdolist_list_var2.first();
                    } 
                }
                lexes = accepted;
                sublisp_throw($sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD, rejected);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    word_tree.set_word_tree_lexes(self, lexes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }

    public static SubLObject parse_tree_remove_redundant_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = $DFR2L;
        final SubLObject possible_orders = list($DFL2R, $DFR2L);
        SubLObject daughter = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED))) {
            Errors.error($str145$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(self, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            daughter = stacks.stack_pop(stack);
            if (NIL != word_tree.word_tree_p(daughter)) {
                methods.funcall_instance_method_with_0_args(daughter, REMOVE_REDUNDANT_LEXES);
            }
            if (NIL != parse_tree.phrase_tree_p(daughter)) {
                final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(daughter);
                final SubLObject backwardP_var = eq(order_var, $DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter_$6;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    daughter_$6 = aref(vector_var, element_num);
                    stacks.stack_push(daughter_$6, stack);
                }
            }
        } 
        return self;
    }

    public static SubLObject word_tree_remove_redundant_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = NIL;
        SubLObject lexes = word_tree.get_word_tree_lexes(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push($sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                if ($TO == methods.funcall_instance_method_with_0_args(self, GET_CATEGORY)) {
                    final SubLObject mother_$7 = methods.funcall_instance_method_with_0_args(self, GET_MOTHER);
                    if ($VP == methods.funcall_instance_method_with_0_args(mother_$7, GET_CATEGORY)) {
                        lexes = NIL;
                    }
                } else {
                    SubLObject non_redundant = NIL;
                    final SubLObject to_redistribute = ZERO_INTEGER;
                    SubLObject cdolist_list_var = lexes;
                    SubLObject rle = NIL;
                    rle = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject semtrans = cycl_utilities.hl_to_el(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $SEMTRANS));
                        SubLObject fail = NIL;
                        if (NIL == fail) {
                            SubLObject csome_list_var = non_redundant;
                            SubLObject old_rle = NIL;
                            old_rle = csome_list_var.first();
                            while ((NIL == fail) && (NIL != csome_list_var)) {
                                final SubLObject old_semtrans = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(old_rle), GET, $SEMTRANS);
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
                            cyclifier.rle_set_confidence(nr, add(cyclifier.rle_confidence(nr), addendum));
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            nr = cdolist_list_var2.first();
                        } 
                    }
                    lexes = non_redundant;
                }
                sublisp_throw($sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    word_tree.set_word_tree_lexes(self, lexes);
                    parse_tree.set_parse_tree_mother(self, mother);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }

    public static SubLObject phrase_tree_prune_lexes_method(final SubLObject self, final SubLObject wff_terms) {
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, YIELD);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            methods.funcall_instance_method_with_1_args(word, PRUNE_LEXES, wff_terms);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return self;
    }

    public static SubLObject phrase_tree_get_nth_word_method(final SubLObject self, final SubLObject integer) {
        final SubLObject yield = methods.funcall_instance_method_with_0_args(self, YIELD);
        if (integer.numG(length(yield))) {
            Errors.warn($str158$Attempted_to_get_the__A_word__but, integer, length(yield));
            return NIL;
        }
        return nth(integer, yield);
    }

    public static SubLObject lex_entry_equalp(final SubLObject lex1, final SubLObject lex2) {
        return equalp(methods.funcall_instance_method_with_1_args(lex1, GET, $SEMTRANS), methods.funcall_instance_method_with_1_args(lex2, GET, $SEMTRANS));
    }

    public static SubLObject declare_parse_tree_gui_file() {
        declareFunction(me, "stop_word_p", "STOP-WORD-P", 1, 0, false);
        declareFunction(me, "gui_enabled_document_print_function_trampoline", "GUI-ENABLED-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "gui_enabled_document_p", "GUI-ENABLED-DOCUMENT-P", 1, 0, false);
        new parse_tree_gui.$gui_enabled_document_p$UnaryFunction();
        declareFunction(me, "ged_sentences", "GED-SENTENCES", 1, 0, false);
        declareFunction(me, "ged_parser", "GED-PARSER", 1, 0, false);
        declareFunction(me, "ged_lexicon", "GED-LEXICON", 1, 0, false);
        declareFunction(me, "_csetf_ged_sentences", "_CSETF-GED-SENTENCES", 2, 0, false);
        declareFunction(me, "_csetf_ged_parser", "_CSETF-GED-PARSER", 2, 0, false);
        declareFunction(me, "_csetf_ged_lexicon", "_CSETF-GED-LEXICON", 2, 0, false);
        declareFunction(me, "make_gui_enabled_document", "MAKE-GUI-ENABLED-DOCUMENT", 0, 1, false);
        declareFunction(me, "visit_defstruct_gui_enabled_document", "VISIT-DEFSTRUCT-GUI-ENABLED-DOCUMENT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_gui_enabled_document_method", "VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-DOCUMENT-METHOD", 2, 0, false);
        declareFunction(me, "new_gui_enabled_document", "NEW-GUI-ENABLED-DOCUMENT", 1, 1, false);
        declareFunction(me, "add_sentence_to_ged", "ADD-SENTENCE-TO-GED", 3, 0, false);
        declareFunction(me, "ged_sentence_number", "GED-SENTENCE-NUMBER", 1, 0, false);
        declareFunction(me, "gui_enabled_sentence_print_function_trampoline", "GUI-ENABLED-SENTENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "gui_enabled_sentence_p", "GUI-ENABLED-SENTENCE-P", 1, 0, false);
        new parse_tree_gui.$gui_enabled_sentence_p$UnaryFunction();
        declareFunction(me, "ges_surface_string", "GES-SURFACE-STRING", 1, 0, false);
        declareFunction(me, "ges_gui_tokens", "GES-GUI-TOKENS", 1, 0, false);
        declareFunction(me, "ges_full_parse_tree", "GES-FULL-PARSE-TREE", 1, 0, false);
        declareFunction(me, "ges_current_parse_tree", "GES-CURRENT-PARSE-TREE", 1, 0, false);
        declareFunction(me, "ges_token_mapping", "GES-TOKEN-MAPPING", 1, 0, false);
        declareFunction(me, "ges_parent_document", "GES-PARENT-DOCUMENT", 1, 0, false);
        declareFunction(me, "_csetf_ges_surface_string", "_CSETF-GES-SURFACE-STRING", 2, 0, false);
        declareFunction(me, "_csetf_ges_gui_tokens", "_CSETF-GES-GUI-TOKENS", 2, 0, false);
        declareFunction(me, "_csetf_ges_full_parse_tree", "_CSETF-GES-FULL-PARSE-TREE", 2, 0, false);
        declareFunction(me, "_csetf_ges_current_parse_tree", "_CSETF-GES-CURRENT-PARSE-TREE", 2, 0, false);
        declareFunction(me, "_csetf_ges_token_mapping", "_CSETF-GES-TOKEN-MAPPING", 2, 0, false);
        declareFunction(me, "_csetf_ges_parent_document", "_CSETF-GES-PARENT-DOCUMENT", 2, 0, false);
        declareFunction(me, "make_gui_enabled_sentence", "MAKE-GUI-ENABLED-SENTENCE", 0, 1, false);
        declareFunction(me, "visit_defstruct_gui_enabled_sentence", "VISIT-DEFSTRUCT-GUI-ENABLED-SENTENCE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_gui_enabled_sentence_method", "VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-SENTENCE-METHOD", 2, 0, false);
        declareFunction(me, "new_gui_enabled_sentence", "NEW-GUI-ENABLED-SENTENCE", 3, 0, false);
        declareFunction(me, "ges_lexicon", "GES-LEXICON", 1, 0, false);
        declareFunction(me, "pprint_ged", "PPRINT-GED", 1, 2, false);
        declareFunction(me, "pprint_ges", "PPRINT-GES", 1, 2, false);
        declareFunction(me, "new_gui_enabled_document_from_stream", "NEW-GUI-ENABLED-DOCUMENT-FROM-STREAM", 1, 0, false);
        declareFunction(me, "sentencify_remotely", "SENTENCIFY-REMOTELY", 1, 4, false);
        declareFunction(me, "new_gui_enabled_document_from_file", "NEW-GUI-ENABLED-DOCUMENT-FROM-FILE", 1, 0, false);
        declareFunction(me, "new_gui_enabled_document_from_string", "NEW-GUI-ENABLED-DOCUMENT-FROM-STRING", 1, 0, false);
        declareFunction(me, "gui_enabled_sentence_to_xml", "GUI-ENABLED-SENTENCE-TO-XML", 2, 0, false);
        declareFunction(me, "ged_to_xml_string", "GED-TO-XML-STRING", 1, 0, false);
        declareFunction(me, "word_tree_to_xml_method", "WORD-TREE-TO-XML-METHOD", 2, 0, false);
        declareFunction(me, "removal_lambda", "REMOVAL-LAMBDA", 1, 0, false);
        declareFunction(me, "get_ges_annotated_leaves", "GET-GES-ANNOTATED-LEAVES", 1, 0, false);
        declareFunction(me, "get_ged_annotated_tree", "GET-GED-ANNOTATED-TREE", 2, 0, false);
        declareFunction(me, "get_ges_annotated_tree", "GET-GES-ANNOTATED-TREE", 1, 0, false);
        declareFunction(me, "annotate_parse_tree", "ANNOTATE-PARSE-TREE", 2, 0, false);
        declareFunction(me, "annotate_phrase_tree", "ANNOTATE-PHRASE-TREE", 2, 0, false);
        declareFunction(me, "annotate_word_tree", "ANNOTATE-WORD-TREE", 2, 0, false);
        declareFunction(me, "create_ges_token_mapping", "CREATE-GES-TOKEN-MAPPING", 1, 0, false);
        declareFunction(me, "ges_word_string", "GES-WORD-STRING", 1, 0, false);
        declareFunction(me, "create_token_list", "CREATE-TOKEN-LIST", 1, 0, false);
        declareFunction(me, "nmerge_words", "NMERGE-WORDS", 2, 0, false);
        declareFunction(me, "add_spaces", "ADD-SPACES", 1, 0, false);
        declareFunction(me, "reattach_word", "REATTACH-WORD", 2, 1, false);
        declareFunction(me, "get_ged_annotated_leaves", "GET-GED-ANNOTATED-LEAVES", 2, 0, false);
        declareFunction(me, "select_sense_for_word", "SELECT-SENSE-FOR-WORD", 4, 0, false);
        declareFunction(me, "find_word_index_from_path", "FIND-WORD-INDEX-FROM-PATH", 3, 0, false);
        declareFunction(me, "prune_ges_by_wff_checking", "PRUNE-GES-BY-WFF-CHECKING", 1, 0, false);
        declareFunction(me, "prune_ged_sentence_by_wff_checking", "PRUNE-GED-SENTENCE-BY-WFF-CHECKING", 2, 0, false);
        declareFunction(me, "cyclify_ged_sentence", "CYCLIFY-GED-SENTENCE", 2, 0, false);
        declareFunction(me, "parse_tree_naive_wff_self_prune_method", "PARSE-TREE-NAIVE-WFF-SELF-PRUNE-METHOD", 1, 0, false);
        declareFunction(me, "word_tree_prune_lexes_method", "WORD-TREE-PRUNE-LEXES-METHOD", 2, 0, false);
        declareFunction(me, "parse_tree_remove_redundant_lexes_method", "PARSE-TREE-REMOVE-REDUNDANT-LEXES-METHOD", 1, 0, false);
        declareFunction(me, "word_tree_remove_redundant_lexes_method", "WORD-TREE-REMOVE-REDUNDANT-LEXES-METHOD", 1, 0, false);
        declareFunction(me, "phrase_tree_prune_lexes_method", "PHRASE-TREE-PRUNE-LEXES-METHOD", 2, 0, false);
        declareFunction(me, "phrase_tree_get_nth_word_method", "PHRASE-TREE-GET-NTH-WORD-METHOD", 2, 0, false);
        declareFunction(me, "lex_entry_equalp", "LEX-ENTRY-EQUALP", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_parse_tree_gui_file() {
        defparameter("*STOP-WORD-CATEGORIES*", $list0);
        defconstant("*DTP-GUI-ENABLED-DOCUMENT*", GUI_ENABLED_DOCUMENT);
        defconstant("*DTP-GUI-ENABLED-SENTENCE*", GUI_ENABLED_SENTENCE);
        defvar("*TOKEN-INDEX*", ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_parse_tree_gui_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_gui_enabled_document$.getGlobalValue(), symbol_function(GUI_ENABLED_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(GED_SENTENCES, _CSETF_GED_SENTENCES);
        def_csetf(GED_PARSER, _CSETF_GED_PARSER);
        def_csetf(GED_LEXICON, _CSETF_GED_LEXICON);
        identity(GUI_ENABLED_DOCUMENT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_gui_enabled_document$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_DOCUMENT_METHOD));
        register_external_symbol(NEW_GUI_ENABLED_DOCUMENT);
        register_external_symbol(ADD_SENTENCE_TO_GED);
        register_external_symbol(GED_SENTENCE_NUMBER);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_gui_enabled_sentence$.getGlobalValue(), symbol_function(GUI_ENABLED_SENTENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list37);
        def_csetf(GES_SURFACE_STRING, _CSETF_GES_SURFACE_STRING);
        def_csetf(GES_GUI_TOKENS, _CSETF_GES_GUI_TOKENS);
        def_csetf(GES_FULL_PARSE_TREE, _CSETF_GES_FULL_PARSE_TREE);
        def_csetf(GES_CURRENT_PARSE_TREE, _CSETF_GES_CURRENT_PARSE_TREE);
        def_csetf(GES_TOKEN_MAPPING, _CSETF_GES_TOKEN_MAPPING);
        def_csetf(GES_PARENT_DOCUMENT, _CSETF_GES_PARENT_DOCUMENT);
        identity(GUI_ENABLED_SENTENCE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_gui_enabled_sentence$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_SENTENCE_METHOD));
        register_external_symbol(NEW_GUI_ENABLED_SENTENCE);
        define_obsolete_register(SENTENCIFY_REMOTELY, $list67);
        methods.methods_incorporate_instance_method(TO_XML, WORD_TREE, $list93, $list94, $list95);
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
        methods.methods_incorporate_instance_method(NAIVE_WFF_SELF_PRUNE, PARSE_TREE, $list93, NIL, $list134);
        methods.subloop_register_instance_method(PARSE_TREE, NAIVE_WFF_SELF_PRUNE, PARSE_TREE_NAIVE_WFF_SELF_PRUNE_METHOD);
        methods.methods_incorporate_instance_method(PRUNE_LEXES, WORD_TREE, $list93, $list137, $list138);
        methods.subloop_register_instance_method(WORD_TREE, PRUNE_LEXES, WORD_TREE_PRUNE_LEXES_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_REDUNDANT_LEXES, PARSE_TREE, $list141, NIL, $list142);
        methods.subloop_register_instance_method(PARSE_TREE, REMOVE_REDUNDANT_LEXES, PARSE_TREE_REMOVE_REDUNDANT_LEXES_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_REDUNDANT_LEXES, WORD_TREE, $list141, NIL, $list147);
        methods.subloop_register_instance_method(WORD_TREE, REMOVE_REDUNDANT_LEXES, WORD_TREE_REMOVE_REDUNDANT_LEXES_METHOD);
        methods.methods_incorporate_instance_method(PRUNE_LEXES, PHRASE_TREE, $list93, $list137, $list154);
        methods.subloop_register_instance_method(PHRASE_TREE, PRUNE_LEXES, PHRASE_TREE_PRUNE_LEXES_METHOD);
        methods.methods_incorporate_instance_method(GET_NTH_WORD, PHRASE_TREE, $list93, $list156, $list157);
        methods.subloop_register_instance_method(PHRASE_TREE, GET_NTH_WORD, PHRASE_TREE_GET_NTH_WORD_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_parse_tree_gui_file();
    }

    @Override
    public void initializeVariables() {
        init_parse_tree_gui_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_parse_tree_gui_file();
    }

    

    public static final class $gui_enabled_document_native extends SubLStructNative {
        public SubLObject $sentences;

        public SubLObject $parser;

        public SubLObject $lexicon;

        private static final SubLStructDeclNative structDecl;

        private $gui_enabled_document_native() {
            this.$sentences = Lisp.NIL;
            this.$parser = Lisp.NIL;
            this.$lexicon = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$sentences;
        }

        @Override
        public SubLObject getField3() {
            return this.$parser;
        }

        @Override
        public SubLObject getField4() {
            return this.$lexicon;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$sentences = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$parser = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$lexicon = value;
        }

        static {
            structDecl = makeStructDeclNative($gui_enabled_document_native.class, GUI_ENABLED_DOCUMENT, GUI_ENABLED_DOCUMENT_P, $list3, $list4, new String[]{ "$sentences", "$parser", "$lexicon" }, $list5, $list6, PPRINT_GED);
        }
    }

    public static final class $gui_enabled_document_p$UnaryFunction extends UnaryFunction {
        public $gui_enabled_document_p$UnaryFunction() {
            super(extractFunctionNamed("GUI-ENABLED-DOCUMENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return gui_enabled_document_p(arg1);
        }
    }

    public static final class $gui_enabled_sentence_native extends SubLStructNative {
        public SubLObject $surface_string;

        public SubLObject $gui_tokens;

        public SubLObject $full_parse_tree;

        public SubLObject $current_parse_tree;

        public SubLObject $token_mapping;

        public SubLObject $parent_document;

        private static final SubLStructDeclNative structDecl;

        private $gui_enabled_sentence_native() {
            this.$surface_string = Lisp.NIL;
            this.$gui_tokens = Lisp.NIL;
            this.$full_parse_tree = Lisp.NIL;
            this.$current_parse_tree = Lisp.NIL;
            this.$token_mapping = Lisp.NIL;
            this.$parent_document = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$surface_string;
        }

        @Override
        public SubLObject getField3() {
            return this.$gui_tokens;
        }

        @Override
        public SubLObject getField4() {
            return this.$full_parse_tree;
        }

        @Override
        public SubLObject getField5() {
            return this.$current_parse_tree;
        }

        @Override
        public SubLObject getField6() {
            return this.$token_mapping;
        }

        @Override
        public SubLObject getField7() {
            return this.$parent_document;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$surface_string = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$gui_tokens = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$full_parse_tree = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$current_parse_tree = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$token_mapping = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$parent_document = value;
        }

        static {
            structDecl = makeStructDeclNative($gui_enabled_sentence_native.class, GUI_ENABLED_SENTENCE, GUI_ENABLED_SENTENCE_P, $list31, $list32, new String[]{ "$surface_string", "$gui_tokens", "$full_parse_tree", "$current_parse_tree", "$token_mapping", "$parent_document" }, $list33, $list34, PPRINT_GES);
        }
    }

    public static final class $gui_enabled_sentence_p$UnaryFunction extends UnaryFunction {
        public $gui_enabled_sentence_p$UnaryFunction() {
            super(extractFunctionNamed("GUI-ENABLED-SENTENCE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return gui_enabled_sentence_p(arg1);
        }
    }
}

/**
 * Total time: 529 ms
 */
