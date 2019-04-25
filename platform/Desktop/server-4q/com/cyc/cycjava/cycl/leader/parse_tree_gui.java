package com.cyc.cycjava.cycl.leader;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.cycjava.cycl.cyclifier;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.semtrans_lexicon;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cycml_generator;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parse_tree_gui extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.leader.parse_tree_gui";
    public static final String myFingerPrint = "cd4fbe8fb6c82aafdd1bd49ea6b597ac886c03ffc26440f6e8b4968deb80bef6";
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 921L)
    private static SubLSymbol $stop_word_categories$;
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
    public static SubLSymbol $dtp_gui_enabled_document$;
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLSymbol $dtp_gui_enabled_sentence$;
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 7041L)
    private static SubLSymbol $token_index$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$GUI_ENABLED_DOCUMENT;
    private static final SubLSymbol $sym2$GUI_ENABLED_DOCUMENT_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PPRINT_GED;
    private static final SubLSymbol $sym8$GUI_ENABLED_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$GED_SENTENCES;
    private static final SubLSymbol $sym11$_CSETF_GED_SENTENCES;
    private static final SubLSymbol $sym12$GED_PARSER;
    private static final SubLSymbol $sym13$_CSETF_GED_PARSER;
    private static final SubLSymbol $sym14$GED_LEXICON;
    private static final SubLSymbol $sym15$_CSETF_GED_LEXICON;
    private static final SubLSymbol $kw16$SENTENCES;
    private static final SubLSymbol $kw17$PARSER;
    private static final SubLSymbol $kw18$LEXICON;
    private static final SubLString $str19$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw20$BEGIN;
    private static final SubLSymbol $sym21$MAKE_GUI_ENABLED_DOCUMENT;
    private static final SubLSymbol $kw22$SLOT;
    private static final SubLSymbol $kw23$END;
    private static final SubLSymbol $sym24$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_DOCUMENT_METHOD;
    private static final SubLSymbol $sym25$NEW_GUI_ENABLED_DOCUMENT;
    private static final SubLSymbol $sym26$CYCLIFIER_LEXICON;
    private static final SubLSymbol $sym27$ADD_SENTENCE_TO_GED;
    private static final SubLSymbol $sym28$GED_SENTENCE_NUMBER;
    private static final SubLSymbol $sym29$GUI_ENABLED_SENTENCE;
    private static final SubLSymbol $sym30$GUI_ENABLED_SENTENCE_P;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$PPRINT_GES;
    private static final SubLSymbol $sym36$GUI_ENABLED_SENTENCE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$GES_SURFACE_STRING;
    private static final SubLSymbol $sym39$_CSETF_GES_SURFACE_STRING;
    private static final SubLSymbol $sym40$GES_GUI_TOKENS;
    private static final SubLSymbol $sym41$_CSETF_GES_GUI_TOKENS;
    private static final SubLSymbol $sym42$GES_FULL_PARSE_TREE;
    private static final SubLSymbol $sym43$_CSETF_GES_FULL_PARSE_TREE;
    private static final SubLSymbol $sym44$GES_CURRENT_PARSE_TREE;
    private static final SubLSymbol $sym45$_CSETF_GES_CURRENT_PARSE_TREE;
    private static final SubLSymbol $sym46$GES_TOKEN_MAPPING;
    private static final SubLSymbol $sym47$_CSETF_GES_TOKEN_MAPPING;
    private static final SubLSymbol $sym48$GES_PARENT_DOCUMENT;
    private static final SubLSymbol $sym49$_CSETF_GES_PARENT_DOCUMENT;
    private static final SubLSymbol $kw50$SURFACE_STRING;
    private static final SubLSymbol $kw51$GUI_TOKENS;
    private static final SubLSymbol $kw52$FULL_PARSE_TREE;
    private static final SubLSymbol $kw53$CURRENT_PARSE_TREE;
    private static final SubLSymbol $kw54$TOKEN_MAPPING;
    private static final SubLSymbol $kw55$PARENT_DOCUMENT;
    private static final SubLSymbol $sym56$MAKE_GUI_ENABLED_SENTENCE;
    private static final SubLSymbol $sym57$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_SENTENCE_METHOD;
    private static final SubLSymbol $sym58$NEW_GUI_ENABLED_SENTENCE;
    private static final SubLSymbol $sym59$PARSE;
    private static final SubLSymbol $sym60$LEARN;
    private static final SubLSymbol $sym61$LEXIFY;
    private static final SubLSymbol $sym62$REMOVE_REDUNDANT_LEXES;
    private static final SubLString $str63$__GED___S_sentences_;
    private static final SubLString $str64$___;
    private static final SubLString $str65$__GES___S_;
    private static final SubLSymbol $sym66$SENTENCIFY_REMOTELY;
    private static final SubLList $list67;
    private static final SubLString $str68$_sentencify_cgi;
    private static final SubLSymbol $kw69$POST;
    private static final SubLString $str70$_;
    private static final SubLString $str71$_;
    private static final SubLString $str72$string;
    private static final SubLSymbol $kw73$INPUT;
    private static final SubLString $str74$Unable_to_open__S;
    private static final SubLSymbol $sym75$START_TAG;
    private static final SubLString $str76$sentence;
    private static final SubLSymbol $sym77$YIELD;
    private static final SubLSymbol $sym78$CYCLIFY;
    private static final SubLList $list79;
    private static final SubLString $str80$tokens;
    private static final SubLSymbol $sym81$TO_XML;
    private static final SubLSymbol $sym82$END_TAG;
    private static final SubLString $str83$parses;
    private static final SubLSymbol $sym84$OUTSTREAM;
    private static final SubLSymbol $sym85$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str86$___S;
    private static final SubLSymbol $sym87$XML_WRITER;
    private static final SubLSymbol $sym88$SET_STREAM;
    private static final SubLString $str89$cycl_annotated_document;
    private static final SubLSymbol $sym90$FLUSH;
    private static final SubLSymbol $sym91$CLOSE;
    private static final SubLSymbol $sym92$WORD_TREE;
    private static final SubLList $list93;
    private static final SubLList $list94;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLString $str97$pos;
    private static final SubLString $str98$token;
    private static final SubLSymbol $sym99$GET;
    private static final SubLSymbol $kw100$SEMTRANS;
    private static final SubLList $list101;
    private static final SubLObject $const102$isa;
    private static final SubLSymbol $sym103$GET_LEXES;
    private static final SubLSymbol $sym104$WORD_TREE_TO_XML_METHOD;
    private static final SubLSymbol $sym105$GET_GES_ANNOTATED_LEAVES;
    private static final SubLSymbol $sym106$CAR;
    private static final SubLSymbol $sym107$REMOVAL_LAMBDA;
    private static final SubLSymbol $sym108$CDR;
    private static final SubLSymbol $sym109$GET_CATEGORY;
    private static final SubLSymbol $sym110$GET_GED_ANNOTATED_TREE;
    private static final SubLSymbol $sym111$GET_GES_ANNOTATED_TREE;
    private static final SubLSymbol $kw112$PHRASE_TREE;
    private static final SubLSymbol $sym113$GET_STRING;
    private static final SubLSymbol $sym114$GET_PATH;
    private static final SubLSymbol $kw115$WORD_TREE;
    private static final SubLSymbol $sym116$GES_WORD_STRING;
    private static final SubLSymbol $sym117$EMPTY_STRING_P;
    private static final SubLSymbol $sym118$TRIM_WHITESPACE;
    private static final SubLString $str119$;
    private static final SubLString $str120$_;
    private static final SubLSymbol $sym121$SUBSTRING_;
    private static final SubLSymbol $sym122$GET_GED_ANNOTATED_LEAVES;
    private static final SubLSymbol $sym123$SELECT_SENSE_FOR_WORD;
    private static final SubLSymbol $sym124$GET_NTH_WORD;
    private static final SubLString $str125$Attempted_to_set_sense__A__but_on;
    private static final SubLSymbol $sym126$LEXES;
    private static final SubLSymbol $sym127$FIND_WORD_INDEX_FROM_PATH;
    private static final SubLSymbol $sym128$PRUNE_GES_BY_WFF_CHECKING;
    private static final SubLSymbol $sym129$NAIVE_WFF_SELF_PRUNE;
    private static final SubLSymbol $sym130$LEX_ENTRY_EQUALP;
    private static final SubLSymbol $sym131$PRUNE_GED_SENTENCE_BY_WFF_CHECKING;
    private static final SubLSymbol $sym132$CYCLIFY_GED_SENTENCE;
    private static final SubLSymbol $sym133$PARSE_TREE;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$PRUNE_LEXES;
    private static final SubLSymbol $sym136$PARSE_TREE_NAIVE_WFF_SELF_PRUNE_METHOD;
    private static final SubLList $list137;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $sym140$WORD_TREE_PRUNE_LEXES_METHOD;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLSymbol $kw143$DFR2L;
    private static final SubLSymbol $kw144$DFL2R;
    private static final SubLString $str145$_S_is_not_one_of__S;
    private static final SubLSymbol $sym146$PARSE_TREE_REMOVE_REDUNDANT_LEXES_METHOD;
    private static final SubLList $list147;
    private static final SubLSymbol $sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD;
    private static final SubLSymbol $kw149$TO;
    private static final SubLSymbol $sym150$GET_MOTHER;
    private static final SubLSymbol $kw151$VP;
    private static final SubLSymbol $sym152$WORD_TREE_REMOVE_REDUNDANT_LEXES_METHOD;
    private static final SubLSymbol $sym153$PHRASE_TREE;
    private static final SubLList $list154;
    private static final SubLSymbol $sym155$PHRASE_TREE_PRUNE_LEXES_METHOD;
    private static final SubLList $list156;
    private static final SubLList $list157;
    private static final SubLString $str158$Attempted_to_get_the__A_word__but;
    private static final SubLSymbol $sym159$PHRASE_TREE_GET_NTH_WORD_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1049L)
    public static SubLObject stop_word_p(final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parse_tree_gui.NIL != subl_promotions.memberP(category, parse_tree_gui.$stop_word_categories$.getDynamicValue(thread), (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED)) {
            return (SubLObject)parse_tree_gui.T;
        }
        return (SubLObject)parse_tree_gui.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
    public static SubLObject gui_enabled_document_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_ged(v_object, stream, (SubLObject)parse_tree_gui.ZERO_INTEGER);
        return (SubLObject)parse_tree_gui.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
    public static SubLObject gui_enabled_document_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $gui_enabled_document_native.class) ? parse_tree_gui.T : parse_tree_gui.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
    public static SubLObject ged_sentences(final SubLObject v_object) {
        assert parse_tree_gui.NIL != gui_enabled_document_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
    public static SubLObject ged_parser(final SubLObject v_object) {
        assert parse_tree_gui.NIL != gui_enabled_document_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
    public static SubLObject ged_lexicon(final SubLObject v_object) {
        assert parse_tree_gui.NIL != gui_enabled_document_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
    public static SubLObject _csetf_ged_sentences(final SubLObject v_object, final SubLObject value) {
        assert parse_tree_gui.NIL != gui_enabled_document_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
    public static SubLObject _csetf_ged_parser(final SubLObject v_object, final SubLObject value) {
        assert parse_tree_gui.NIL != gui_enabled_document_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
    public static SubLObject _csetf_ged_lexicon(final SubLObject v_object, final SubLObject value) {
        assert parse_tree_gui.NIL != gui_enabled_document_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
    public static SubLObject make_gui_enabled_document(SubLObject arglist) {
        if (arglist == parse_tree_gui.UNPROVIDED) {
            arglist = (SubLObject)parse_tree_gui.NIL;
        }
        final SubLObject v_new = (SubLObject)new $gui_enabled_document_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)parse_tree_gui.NIL, next = arglist; parse_tree_gui.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)parse_tree_gui.$kw16$SENTENCES)) {
                _csetf_ged_sentences(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)parse_tree_gui.$kw17$PARSER)) {
                _csetf_ged_parser(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)parse_tree_gui.$kw18$LEXICON)) {
                _csetf_ged_lexicon(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)parse_tree_gui.$str19$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
    public static SubLObject visit_defstruct_gui_enabled_document(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw20$BEGIN, (SubLObject)parse_tree_gui.$sym21$MAKE_GUI_ENABLED_DOCUMENT, (SubLObject)parse_tree_gui.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw22$SLOT, (SubLObject)parse_tree_gui.$kw16$SENTENCES, ged_sentences(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw22$SLOT, (SubLObject)parse_tree_gui.$kw17$PARSER, ged_parser(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw22$SLOT, (SubLObject)parse_tree_gui.$kw18$LEXICON, ged_lexicon(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw23$END, (SubLObject)parse_tree_gui.$sym21$MAKE_GUI_ENABLED_DOCUMENT, (SubLObject)parse_tree_gui.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1171L)
    public static SubLObject visit_defstruct_object_gui_enabled_document_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_gui_enabled_document(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1295L)
    public static SubLObject new_gui_enabled_document(final SubLObject size, SubLObject lexicon) {
        if (lexicon == parse_tree_gui.UNPROVIDED) {
            lexicon = object.new_class_instance((SubLObject)parse_tree_gui.$sym26$CYCLIFIER_LEXICON);
        }
        final SubLObject ged = make_gui_enabled_document((SubLObject)parse_tree_gui.UNPROVIDED);
        final SubLObject v_parser = parser.new_stanford_parser((SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED);
        final SubLObject sentence_vector = Vectors.make_vector(size, (SubLObject)parse_tree_gui.UNPROVIDED);
        _csetf_ged_sentences(ged, sentence_vector);
        _csetf_ged_parser(ged, v_parser);
        _csetf_ged_lexicon(ged, lexicon);
        return ged;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 1659L)
    public static SubLObject add_sentence_to_ged(final SubLObject ged, final SubLObject sentence_string, final SubLObject index) {
        final SubLObject ges = new_gui_enabled_sentence(sentence_string, ged, ged_parser(ged));
        final SubLObject sentence_vector = ged_sentences(ged);
        SubLObject successP = (SubLObject)parse_tree_gui.NIL;
        Vectors.set_aref(sentence_vector, index, ges);
        if (parse_tree_gui.NIL != gui_enabled_sentence_p(ges) && parse_tree_gui.NIL != parse_tree.parse_tree_p(ges_full_parse_tree(ges))) {
            successP = (SubLObject)parse_tree_gui.T;
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2046L)
    public static SubLObject ged_sentence_number(final SubLObject ged) {
        return Sequences.length(ged_sentences(ged));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject gui_enabled_sentence_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_ges(v_object, stream, (SubLObject)parse_tree_gui.ZERO_INTEGER);
        return (SubLObject)parse_tree_gui.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject gui_enabled_sentence_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $gui_enabled_sentence_native.class) ? parse_tree_gui.T : parse_tree_gui.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject ges_surface_string(final SubLObject v_object) {
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject ges_gui_tokens(final SubLObject v_object) {
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject ges_full_parse_tree(final SubLObject v_object) {
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject ges_current_parse_tree(final SubLObject v_object) {
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject ges_token_mapping(final SubLObject v_object) {
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject ges_parent_document(final SubLObject v_object) {
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject _csetf_ges_surface_string(final SubLObject v_object, final SubLObject value) {
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject _csetf_ges_gui_tokens(final SubLObject v_object, final SubLObject value) {
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject _csetf_ges_full_parse_tree(final SubLObject v_object, final SubLObject value) {
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject _csetf_ges_current_parse_tree(final SubLObject v_object, final SubLObject value) {
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject _csetf_ges_token_mapping(final SubLObject v_object, final SubLObject value) {
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject _csetf_ges_parent_document(final SubLObject v_object, final SubLObject value) {
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject make_gui_enabled_sentence(SubLObject arglist) {
        if (arglist == parse_tree_gui.UNPROVIDED) {
            arglist = (SubLObject)parse_tree_gui.NIL;
        }
        final SubLObject v_new = (SubLObject)new $gui_enabled_sentence_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)parse_tree_gui.NIL, next = arglist; parse_tree_gui.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)parse_tree_gui.$kw50$SURFACE_STRING)) {
                _csetf_ges_surface_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)parse_tree_gui.$kw51$GUI_TOKENS)) {
                _csetf_ges_gui_tokens(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)parse_tree_gui.$kw52$FULL_PARSE_TREE)) {
                _csetf_ges_full_parse_tree(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)parse_tree_gui.$kw53$CURRENT_PARSE_TREE)) {
                _csetf_ges_current_parse_tree(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)parse_tree_gui.$kw54$TOKEN_MAPPING)) {
                _csetf_ges_token_mapping(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)parse_tree_gui.$kw55$PARENT_DOCUMENT)) {
                _csetf_ges_parent_document(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)parse_tree_gui.$str19$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject visit_defstruct_gui_enabled_sentence(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw20$BEGIN, (SubLObject)parse_tree_gui.$sym56$MAKE_GUI_ENABLED_SENTENCE, (SubLObject)parse_tree_gui.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw22$SLOT, (SubLObject)parse_tree_gui.$kw50$SURFACE_STRING, ges_surface_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw22$SLOT, (SubLObject)parse_tree_gui.$kw51$GUI_TOKENS, ges_gui_tokens(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw22$SLOT, (SubLObject)parse_tree_gui.$kw52$FULL_PARSE_TREE, ges_full_parse_tree(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw22$SLOT, (SubLObject)parse_tree_gui.$kw53$CURRENT_PARSE_TREE, ges_current_parse_tree(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw22$SLOT, (SubLObject)parse_tree_gui.$kw54$TOKEN_MAPPING, ges_token_mapping(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw22$SLOT, (SubLObject)parse_tree_gui.$kw55$PARENT_DOCUMENT, ges_parent_document(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)parse_tree_gui.$kw23$END, (SubLObject)parse_tree_gui.$sym56$MAKE_GUI_ENABLED_SENTENCE, (SubLObject)parse_tree_gui.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2130L)
    public static SubLObject visit_defstruct_object_gui_enabled_sentence_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_gui_enabled_sentence(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 2326L)
    public static SubLObject new_gui_enabled_sentence(final SubLObject sentence_string, final SubLObject v_document, final SubLObject v_parser) {
        final SubLObject ges = make_gui_enabled_sentence((SubLObject)parse_tree_gui.UNPROVIDED);
        final SubLObject full_tree = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)parse_tree_gui.$sym59$PARSE, sentence_string);
        final SubLObject current_tree = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)parse_tree_gui.$sym59$PARSE, sentence_string);
        final SubLObject lexicon = ged_lexicon(v_document);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)parse_tree_gui.$sym60$LEARN, sentence_string);
        if (parse_tree_gui.NIL != parse_tree.parse_tree_p(full_tree)) {
            methods.funcall_instance_method_with_1_args(full_tree, (SubLObject)parse_tree_gui.$sym61$LEXIFY, lexicon);
            methods.funcall_instance_method_with_0_args(full_tree, (SubLObject)parse_tree_gui.$sym62$REMOVE_REDUNDANT_LEXES);
            methods.funcall_instance_method_with_1_args(current_tree, (SubLObject)parse_tree_gui.$sym61$LEXIFY, lexicon);
            methods.funcall_instance_method_with_0_args(current_tree, (SubLObject)parse_tree_gui.$sym62$REMOVE_REDUNDANT_LEXES);
        }
        _csetf_ges_parent_document(ges, v_document);
        _csetf_ges_surface_string(ges, sentence_string);
        _csetf_ges_full_parse_tree(ges, full_tree);
        _csetf_ges_current_parse_tree(ges, current_tree);
        _csetf_ges_gui_tokens(ges, create_token_list(ges));
        _csetf_ges_token_mapping(ges, create_ges_token_mapping(ges));
        return ges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 3186L)
    public static SubLObject ges_lexicon(final SubLObject ges) {
        final SubLObject parent = ges_parent_document(ges);
        if (parse_tree_gui.NIL != parent) {
            return ged_lexicon(parent);
        }
        return (SubLObject)parse_tree_gui.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 3320L)
    public static SubLObject pprint_ged(final SubLObject ged, SubLObject stream, SubLObject depth) {
        if (stream == parse_tree_gui.UNPROVIDED) {
            stream = (SubLObject)parse_tree_gui.NIL;
        }
        if (depth == parse_tree_gui.UNPROVIDED) {
            depth = (SubLObject)parse_tree_gui.NIL;
        }
        PrintLow.format(stream, (SubLObject)parse_tree_gui.$str63$__GED___S_sentences_, Sequences.length(ged_sentences(ged)));
        return ged;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 3477L)
    public static SubLObject pprint_ges(final SubLObject ges, SubLObject stream, SubLObject depth) {
        if (stream == parse_tree_gui.UNPROVIDED) {
            stream = (SubLObject)parse_tree_gui.NIL;
        }
        if (depth == parse_tree_gui.UNPROVIDED) {
            depth = (SubLObject)parse_tree_gui.NIL;
        }
        final SubLObject string = ges_surface_string(ges);
        SubLObject print_string = string_utilities.string_first_n((SubLObject)parse_tree_gui.TWENTY_INTEGER, string);
        if (Sequences.length(string).numG((SubLObject)parse_tree_gui.TWENTY_INTEGER)) {
            print_string = Sequences.cconcatenate(print_string, (SubLObject)parse_tree_gui.$str64$___);
        }
        PrintLow.format(stream, (SubLObject)parse_tree_gui.$str65$__GES___S_, print_string);
        return ges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 3789L)
    public static SubLObject new_gui_enabled_document_from_stream(final SubLObject stream) {
        final SubLObject string = document.stream_stringify(stream);
        final SubLObject sentences = document.sentencify_string(string);
        final SubLObject ged = new_gui_enabled_document(Sequences.length(sentences), (SubLObject)parse_tree_gui.UNPROVIDED);
        SubLObject list_var = (SubLObject)parse_tree_gui.NIL;
        SubLObject sentence = (SubLObject)parse_tree_gui.NIL;
        SubLObject i = (SubLObject)parse_tree_gui.NIL;
        list_var = sentences;
        sentence = list_var.first();
        for (i = (SubLObject)parse_tree_gui.ZERO_INTEGER; parse_tree_gui.NIL != list_var; list_var = list_var.rest(), sentence = list_var.first(), i = Numbers.add((SubLObject)parse_tree_gui.ONE_INTEGER, i)) {
            add_sentence_to_ged(ged, sentence, i);
        }
        return ged;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 4097L)
    public static SubLObject sentencify_remotely(final SubLObject string, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (path == parse_tree_gui.UNPROVIDED) {
            path = Sequences.cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), (SubLObject)parse_tree_gui.$str68$_sentencify_cgi);
        }
        if (host == parse_tree_gui.UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == parse_tree_gui.UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == parse_tree_gui.UNPROVIDED) {
            method = (SubLObject)parse_tree_gui.$kw69$POST;
        }
        final SubLObject safe_string = string_utilities.string_substitute((SubLObject)parse_tree_gui.$str70$_, (SubLObject)parse_tree_gui.$str71$_, string, (SubLObject)parse_tree_gui.UNPROVIDED);
        final SubLObject query = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parse_tree_gui.$str72$string, safe_string));
        final SubLObject safe_sentences = reader.read_from_string(web_utilities.http_retrieve(query, path, host, port, method, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED), (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED);
        return safe_sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 4535L)
    public static SubLObject new_gui_enabled_document_from_file(final SubLObject filepath) {
        SubLObject ged = (SubLObject)parse_tree_gui.NIL;
        SubLObject stream = (SubLObject)parse_tree_gui.NIL;
        try {
            stream = compatibility.open_text(filepath, (SubLObject)parse_tree_gui.$kw73$INPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)parse_tree_gui.$str74$Unable_to_open__S, filepath);
            }
            final SubLObject stream_$1 = stream;
            ged = new_gui_enabled_document_from_stream(stream_$1);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)parse_tree_gui.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)parse_tree_gui.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ged;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 4738L)
    public static SubLObject new_gui_enabled_document_from_string(final SubLObject string) {
        return new_gui_enabled_document(string, (SubLObject)parse_tree_gui.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 4844L)
    public static SubLObject gui_enabled_sentence_to_xml(final SubLObject ges, final SubLObject v_xml_writer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert parse_tree_gui.NIL != gui_enabled_sentence_p(ges) : ges;
        methods.funcall_instance_method_with_4_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym75$START_TAG, (SubLObject)parse_tree_gui.$str76$sentence, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.T);
        final SubLObject tree = ges_current_parse_tree(ges);
        final SubLObject words = (SubLObject)((parse_tree_gui.NIL != parse_tree.parse_tree_p(tree)) ? methods.funcall_instance_method_with_0_args(tree, (SubLObject)parse_tree_gui.$sym77$YIELD) : parse_tree_gui.NIL);
        final SubLObject parses = methods.funcall_instance_method_with_1_args(tree, (SubLObject)parse_tree_gui.$sym78$CYCLIFY, (SubLObject)parse_tree_gui.$list79);
        methods.funcall_instance_method_with_4_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym75$START_TAG, (SubLObject)parse_tree_gui.$str80$tokens, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.T);
        SubLObject cdolist_list_var = words;
        SubLObject word = (SubLObject)parse_tree_gui.NIL;
        word = cdolist_list_var.first();
        while (parse_tree_gui.NIL != cdolist_list_var) {
            if (parse_tree_gui.NIL != word_tree.word_tree_p(word)) {
                methods.funcall_instance_method_with_1_args(word, (SubLObject)parse_tree_gui.$sym81$TO_XML, v_xml_writer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        methods.funcall_instance_method_with_3_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym82$END_TAG, (SubLObject)parse_tree_gui.$str80$tokens, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.T);
        methods.funcall_instance_method_with_4_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym75$START_TAG, (SubLObject)parse_tree_gui.$str83$parses, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.T);
        cdolist_list_var = parses;
        SubLObject parse = (SubLObject)parse_tree_gui.NIL;
        parse = cdolist_list_var.first();
        while (parse_tree_gui.NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(instances.get_slot(v_xml_writer, (SubLObject)parse_tree_gui.$sym84$OUTSTREAM), thread);
                SubLObject error = (SubLObject)parse_tree_gui.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)parse_tree_gui.$sym85$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            cycml_generator.cycml_serialize_object(parse);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)parse_tree_gui.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (parse_tree_gui.NIL != error) {
                    Errors.warn((SubLObject)parse_tree_gui.$str86$___S, error);
                }
            }
            finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        }
        methods.funcall_instance_method_with_3_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym82$END_TAG, (SubLObject)parse_tree_gui.$str83$parses, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.T);
        methods.funcall_instance_method_with_3_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym82$END_TAG, (SubLObject)parse_tree_gui.$str76$sentence, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.T);
        return (SubLObject)parse_tree_gui.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 5709L)
    public static SubLObject ged_to_xml_string(final SubLObject ged) {
        final SubLObject v_xml_writer = object.new_class_instance((SubLObject)parse_tree_gui.$sym87$XML_WRITER);
        final SubLObject stream = streams_high.make_string_output_stream();
        SubLObject string = (SubLObject)parse_tree_gui.NIL;
        methods.funcall_instance_method_with_1_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym88$SET_STREAM, stream);
        methods.funcall_instance_method_with_4_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym75$START_TAG, (SubLObject)parse_tree_gui.$str89$cycl_annotated_document, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.T);
        final SubLObject vector_var = ged_sentences(ged);
        final SubLObject backwardP_var = (SubLObject)parse_tree_gui.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject ges;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree_gui.NIL, v_iteration = (SubLObject)parse_tree_gui.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree_gui.ONE_INTEGER)) {
            element_num = ((parse_tree_gui.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree_gui.ONE_INTEGER) : v_iteration);
            ges = Vectors.aref(vector_var, element_num);
            if (parse_tree_gui.NIL != gui_enabled_sentence_p(ges)) {
                gui_enabled_sentence_to_xml(ges, v_xml_writer);
            }
        }
        methods.funcall_instance_method_with_3_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym82$END_TAG, (SubLObject)parse_tree_gui.$str89$cycl_annotated_document, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.T);
        methods.funcall_instance_method_with_0_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym90$FLUSH);
        string = streams_high.get_output_stream_string(stream);
        methods.funcall_instance_method_with_0_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym91$CLOSE);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 6275L)
    public static SubLObject word_tree_to_xml_method(final SubLObject self, final SubLObject v_xml_writer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)parse_tree_gui.NIL;
        final SubLObject category = parse_tree.get_parse_tree_category(self);
        final SubLObject string = parse_tree.get_parse_tree_string(self);
        try {
            thread.throwStack.push(parse_tree_gui.$sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(instances.get_slot(v_xml_writer, (SubLObject)parse_tree_gui.$sym84$OUTSTREAM), thread);
                    final SubLObject attributes = (SubLObject)ConsesLow.list((SubLObject)parse_tree_gui.$str97$pos, category, (SubLObject)parse_tree_gui.$str98$token, string);
                    SubLObject cycls = (SubLObject)parse_tree_gui.NIL;
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree_gui.$sym103$GET_LEXES);
                    SubLObject lexeme = (SubLObject)parse_tree_gui.NIL;
                    lexeme = cdolist_list_var.first();
                    while (parse_tree_gui.NIL != cdolist_list_var) {
                        final SubLObject semtrans = methods.funcall_instance_method_with_1_args(lexeme, (SubLObject)parse_tree_gui.$sym99$GET, (SubLObject)parse_tree_gui.$kw100$SEMTRANS);
                        SubLObject v_term = (SubLObject)parse_tree_gui.NIL;
                        if (semtrans.isCons()) {
                            if (parse_tree_gui.NIL != subl_promotions.memberP(semtrans.first(), (SubLObject)parse_tree_gui.$list101, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED)) {
                                v_term = conses_high.third(semtrans);
                            }
                            else if (parse_tree_gui.NIL == v_term) {
                                SubLObject csome_list_var = semtrans;
                                SubLObject clause = (SubLObject)parse_tree_gui.NIL;
                                clause = csome_list_var.first();
                                while (parse_tree_gui.NIL == v_term && parse_tree_gui.NIL != csome_list_var) {
                                    if (clause.isList() && parse_tree_gui.$const102$isa.eql(clause.first())) {
                                        v_term = conses_high.third(clause);
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    clause = csome_list_var.first();
                                }
                            }
                        }
                        if (parse_tree_gui.NIL != forts.fort_p(v_term)) {
                            cycls = (SubLObject)ConsesLow.cons(v_term, cycls);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        lexeme = cdolist_list_var.first();
                    }
                    methods.funcall_instance_method_with_4_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym75$START_TAG, (SubLObject)parse_tree_gui.$str98$token, attributes, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.T);
                    cdolist_list_var = cycls;
                    SubLObject cycl = (SubLObject)parse_tree_gui.NIL;
                    cycl = cdolist_list_var.first();
                    while (parse_tree_gui.NIL != cdolist_list_var) {
                        cycml_generator.cycml_serialize_object(cycl);
                        cdolist_list_var = cdolist_list_var.rest();
                        cycl = cdolist_list_var.first();
                    }
                    methods.funcall_instance_method_with_3_args(v_xml_writer, (SubLObject)parse_tree_gui.$sym82$END_TAG, (SubLObject)parse_tree_gui.$str98$token, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.T);
                }
                finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree_gui.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    parse_tree.set_parse_tree_category(self, category);
                    parse_tree.set_parse_tree_string(self, string);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree_gui.$sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 7075L)
    public static SubLObject removal_lambda(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.numE(v_object, parse_tree_gui.$token_index$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 7182L)
    public static SubLObject get_ges_annotated_leaves(final SubLObject ges) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokens = ges_gui_tokens(ges);
        final SubLObject token_mapping = ges_token_mapping(ges);
        final SubLObject words = methods.funcall_instance_method_with_0_args(ges_full_parse_tree(ges), (SubLObject)parse_tree_gui.$sym77$YIELD);
        final SubLObject lexicon = ges_lexicon(ges);
        SubLObject annotated_words = (SubLObject)parse_tree_gui.NIL;
        SubLObject list_var = (SubLObject)parse_tree_gui.NIL;
        SubLObject token = (SubLObject)parse_tree_gui.NIL;
        SubLObject i = (SubLObject)parse_tree_gui.NIL;
        list_var = tokens;
        token = list_var.first();
        for (i = (SubLObject)parse_tree_gui.ZERO_INTEGER; parse_tree_gui.NIL != list_var; list_var = list_var.rest(), token = list_var.first(), i = Numbers.add((SubLObject)parse_tree_gui.ONE_INTEGER, i)) {
            final SubLObject _prev_bind_0 = parse_tree_gui.$token_index$.currentBinding(thread);
            try {
                parse_tree_gui.$token_index$.bind(i, thread);
                final SubLObject indices = Mapping.mapcar(Symbols.symbol_function((SubLObject)parse_tree_gui.$sym106$CAR), list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)parse_tree_gui.$sym107$REMOVAL_LAMBDA), token_mapping, Symbols.symbol_function((SubLObject)parse_tree_gui.$sym108$CDR), (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED));
                SubLObject category = (SubLObject)parse_tree_gui.T;
                SubLObject lexes = (SubLObject)parse_tree_gui.NIL;
                SubLObject cycls = (SubLObject)parse_tree_gui.NIL;
                SubLObject cdolist_list_var = indices;
                SubLObject index = (SubLObject)parse_tree_gui.NIL;
                index = cdolist_list_var.first();
                while (parse_tree_gui.NIL != cdolist_list_var) {
                    final SubLObject word = ConsesLow.nth(index, words);
                    lexes = Sequences.cconcatenate(lexes, methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree_gui.$sym103$GET_LEXES));
                    category = (SubLObject)SubLObjectFactory.makeBoolean(parse_tree_gui.NIL != category && parse_tree_gui.NIL != stop_word_p(methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree_gui.$sym109$GET_CATEGORY)));
                    cdolist_list_var = cdolist_list_var.rest();
                    index = cdolist_list_var.first();
                }
                cdolist_list_var = lexes;
                SubLObject lex = (SubLObject)parse_tree_gui.NIL;
                lex = cdolist_list_var.first();
                while (parse_tree_gui.NIL != cdolist_list_var) {
                    final SubLObject extracted = semtrans_lexicon.extract_cycl_from_semtrans_lex_entry(lex, lexicon);
                    if (parse_tree_gui.NIL != extracted) {
                        cycls = (SubLObject)ConsesLow.cons(extracted, cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    lex = cdolist_list_var.first();
                }
                cycls = list_utilities.fast_delete_duplicates(cycls, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED);
                annotated_words = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(token, cycls, category), annotated_words);
            }
            finally {
                parse_tree_gui.$token_index$.rebind(_prev_bind_0, thread);
            }
        }
        return Sequences.nreverse(annotated_words);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 8116L)
    public static SubLObject get_ged_annotated_tree(final SubLObject ged, final SubLObject ges_idx) {
        final SubLObject ges = Vectors.aref(ged_sentences(ged), ges_idx);
        return get_ges_annotated_tree(ges);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 8263L)
    public static SubLObject get_ges_annotated_tree(final SubLObject ges) {
        final SubLObject tree = ges_full_parse_tree(ges);
        final SubLObject lexicon = ges_lexicon(ges);
        return annotate_parse_tree(tree, lexicon);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 8430L)
    public static SubLObject annotate_parse_tree(final SubLObject v_parse_tree, final SubLObject lexicon) {
        if (parse_tree_gui.NIL != parse_tree.phrase_tree_p(v_parse_tree)) {
            return annotate_phrase_tree(v_parse_tree, lexicon);
        }
        if (parse_tree_gui.NIL != word_tree.word_tree_p(v_parse_tree)) {
            return annotate_word_tree(v_parse_tree, lexicon);
        }
        return (SubLObject)parse_tree_gui.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 8685L)
    public static SubLObject annotate_phrase_tree(final SubLObject phrase_tree, final SubLObject lexicon) {
        final SubLObject category = parse_tree.get_parse_tree_category(phrase_tree);
        SubLObject result = (SubLObject)parse_tree_gui.NIL;
        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)parse_tree_gui.$kw112$PHRASE_TREE, category, methods.funcall_instance_method_with_0_args(phrase_tree, (SubLObject)parse_tree_gui.$sym113$GET_STRING), methods.funcall_instance_method_with_0_args(phrase_tree, (SubLObject)parse_tree_gui.$sym114$GET_PATH)), result);
        final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(phrase_tree);
        final SubLObject backwardP_var = (SubLObject)parse_tree_gui.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree_gui.NIL, v_iteration = (SubLObject)parse_tree_gui.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree_gui.ONE_INTEGER)) {
            element_num = ((parse_tree_gui.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree_gui.ONE_INTEGER) : v_iteration);
            daughter = Vectors.aref(vector_var, element_num);
            result = (SubLObject)ConsesLow.cons(annotate_parse_tree(daughter, lexicon), result);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 9077L)
    public static SubLObject annotate_word_tree(final SubLObject v_word_tree, final SubLObject lexicon) {
        final SubLObject category = parse_tree.get_parse_tree_category(v_word_tree);
        final SubLObject lexes = methods.funcall_instance_method_with_0_args(v_word_tree, (SubLObject)parse_tree_gui.$sym103$GET_LEXES);
        SubLObject cycls = (SubLObject)parse_tree_gui.NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject lex = (SubLObject)parse_tree_gui.NIL;
        lex = cdolist_list_var.first();
        while (parse_tree_gui.NIL != cdolist_list_var) {
            final SubLObject extracted = semtrans_lexicon.extract_cycl_from_semtrans_lex_entry(lex, lexicon);
            if (parse_tree_gui.NIL != extracted) {
                cycls = (SubLObject)ConsesLow.cons(extracted, cycls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)parse_tree_gui.$kw115$WORD_TREE, category, methods.funcall_instance_method_with_0_args(v_word_tree, (SubLObject)parse_tree_gui.$sym113$GET_STRING), methods.funcall_instance_method_with_0_args(v_word_tree, (SubLObject)parse_tree_gui.$sym114$GET_PATH), cycls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 9483L)
    public static SubLObject create_ges_token_mapping(final SubLObject ges) {
        final SubLObject token_list = ges_gui_tokens(ges);
        final SubLObject full_tree = ges_full_parse_tree(ges);
        final SubLObject words = methods.funcall_instance_method_with_0_args(full_tree, (SubLObject)parse_tree_gui.$sym77$YIELD);
        return parsing_utilities.create_token_mapping(token_list, words, Symbols.symbol_function((SubLObject)parse_tree_gui.IDENTITY), Symbols.symbol_function((SubLObject)parse_tree_gui.$sym116$GES_WORD_STRING));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 9729L)
    public static SubLObject ges_word_string(final SubLObject word) {
        return methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree_gui.$sym113$GET_STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 9801L)
    public static SubLObject create_token_list(final SubLObject ges) {
        final SubLObject token_list = Sequences.delete_if(Symbols.symbol_function((SubLObject)parse_tree_gui.$sym117$EMPTY_STRING_P), Mapping.mapcar(Symbols.symbol_function((SubLObject)parse_tree_gui.$sym118$TRIM_WHITESPACE), string_utilities.split_string(ges_surface_string(ges), (SubLObject)parse_tree_gui.UNPROVIDED)), (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED);
        final SubLObject words = methods.funcall_instance_method_with_0_args(ges_full_parse_tree(ges), (SubLObject)parse_tree_gui.$sym77$YIELD);
        SubLObject word_strings = (SubLObject)parse_tree_gui.NIL;
        SubLObject word_lists = (SubLObject)parse_tree_gui.NIL;
        SubLObject cdolist_list_var = words;
        SubLObject word = (SubLObject)parse_tree_gui.NIL;
        word = cdolist_list_var.first();
        while (parse_tree_gui.NIL != cdolist_list_var) {
            word_strings = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(word, (SubLObject)parse_tree_gui.$sym113$GET_STRING), word_strings);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        cdolist_list_var = word_strings;
        SubLObject word_string = (SubLObject)parse_tree_gui.NIL;
        word_string = cdolist_list_var.first();
        while (parse_tree_gui.NIL != cdolist_list_var) {
            final SubLObject word_list = string_utilities.split_string(word_string, (SubLObject)parse_tree_gui.UNPROVIDED);
            if (Sequences.length(word_list).numG((SubLObject)parse_tree_gui.ONE_INTEGER)) {
                word_lists = (SubLObject)ConsesLow.cons(word_list, word_lists);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word_string = cdolist_list_var.first();
        }
        if (parse_tree_gui.NIL != word_lists) {
            return nmerge_words(word_lists, token_list);
        }
        return token_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 10374L)
    public static SubLObject nmerge_words(final SubLObject word_lists, final SubLObject string_list) {
        SubLObject cdolist_list_var = word_lists;
        SubLObject word_list = (SubLObject)parse_tree_gui.NIL;
        word_list = cdolist_list_var.first();
        while (parse_tree_gui.NIL != cdolist_list_var) {
            reattach_word(word_list, string_list, (SubLObject)parse_tree_gui.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            word_list = cdolist_list_var.first();
        }
        return string_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 10645L)
    public static SubLObject add_spaces(final SubLObject word_list) {
        SubLObject string = (SubLObject)parse_tree_gui.$str119$;
        SubLObject list_var = (SubLObject)parse_tree_gui.NIL;
        SubLObject word = (SubLObject)parse_tree_gui.NIL;
        SubLObject i = (SubLObject)parse_tree_gui.NIL;
        list_var = word_list;
        word = list_var.first();
        for (i = (SubLObject)parse_tree_gui.ZERO_INTEGER; parse_tree_gui.NIL != list_var; list_var = list_var.rest(), word = list_var.first(), i = Numbers.add((SubLObject)parse_tree_gui.ONE_INTEGER, i)) {
            if (i.numG((SubLObject)parse_tree_gui.ZERO_INTEGER)) {
                string = Sequences.cconcatenate(string, (SubLObject)parse_tree_gui.$str120$_);
            }
            string = Sequences.cconcatenate(string, word);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 10945L)
    public static SubLObject reattach_word(final SubLObject word_list, final SubLObject string_list, SubLObject start) {
        if (start == parse_tree_gui.UNPROVIDED) {
            start = (SubLObject)parse_tree_gui.ZERO_INTEGER;
        }
        final SubLObject index = Sequences.search(word_list, string_list, Symbols.symbol_function((SubLObject)parse_tree_gui.$sym121$SUBSTRING_), Symbols.symbol_function((SubLObject)parse_tree_gui.IDENTITY), (SubLObject)parse_tree_gui.ZERO_INTEGER, (SubLObject)parse_tree_gui.NIL, start, (SubLObject)parse_tree_gui.UNPROVIDED);
        if (parse_tree_gui.NIL != index) {
            final SubLObject newtoken = add_spaces(Sequences.subseq(string_list, index, Numbers.add(index, Sequences.length(word_list))));
            list_utilities.ncollapse_n_from_pos(Sequences.length(word_list), index, newtoken, string_list);
            reattach_word(word_list, string_list, Numbers.add(index, (SubLObject)parse_tree_gui.ONE_INTEGER));
            return (SubLObject)parse_tree_gui.T;
        }
        return (SubLObject)parse_tree_gui.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 11374L)
    public static SubLObject get_ged_annotated_leaves(final SubLObject ged, final SubLObject ges_idx) {
        final SubLObject ges = Vectors.aref(ged_sentences(ged), ges_idx);
        return get_ges_annotated_leaves(ges);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 11525L)
    public static SubLObject select_sense_for_word(final SubLObject ged, final SubLObject ges_idx, final SubLObject word_num, final SubLObject sense_num) {
        final SubLObject ges = Vectors.aref(ged_sentences(ged), ges_idx);
        final SubLObject full_tree = ges_full_parse_tree(ges);
        final SubLObject all_lexes = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(full_tree, (SubLObject)parse_tree_gui.$sym124$GET_NTH_WORD, word_num), (SubLObject)parse_tree_gui.$sym103$GET_LEXES);
        SubLObject target = (SubLObject)parse_tree_gui.NIL;
        if (Sequences.length(all_lexes).numGE(sense_num)) {
            target = ConsesLow.nth(sense_num, all_lexes);
        }
        else {
            Errors.warn((SubLObject)parse_tree_gui.$str125$Attempted_to_set_sense__A__but_on, sense_num, Sequences.length(all_lexes));
        }
        if (parse_tree_gui.NIL != target) {
            final SubLObject current_tree = ges_current_parse_tree(ges);
            final SubLObject word = methods.funcall_instance_method_with_1_args(current_tree, (SubLObject)parse_tree_gui.$sym124$GET_NTH_WORD, word_num);
            instances.set_slot(word, (SubLObject)parse_tree_gui.$sym126$LEXES, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(target, (SubLObject)parse_tree_gui.ONE_INTEGER)));
        }
        return (SubLObject)parse_tree_gui.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 12134L)
    public static SubLObject find_word_index_from_path(final SubLObject ged, final SubLObject ges_idx, final SubLObject path) {
        final SubLObject ges = Vectors.aref(ged_sentences(ged), ges_idx);
        SubLObject tree = ges_full_parse_tree(ges);
        final SubLObject yield = methods.funcall_instance_method_with_0_args(tree, (SubLObject)parse_tree_gui.$sym77$YIELD);
        SubLObject cdolist_list_var = path;
        SubLObject index = (SubLObject)parse_tree_gui.NIL;
        index = cdolist_list_var.first();
        while (parse_tree_gui.NIL != cdolist_list_var) {
            tree = Vectors.aref(parse_tree.get_phrase_tree_daughters(tree), index);
            cdolist_list_var = cdolist_list_var.rest();
            index = cdolist_list_var.first();
        }
        return list_utilities.list_position(tree, yield, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 12548L)
    public static SubLObject prune_ges_by_wff_checking(final SubLObject ges) {
        final SubLObject full_tree = ges_full_parse_tree(ges);
        final SubLObject current_tree = ges_current_parse_tree(ges);
        final SubLObject full_yield = methods.funcall_instance_method_with_0_args(full_tree, (SubLObject)parse_tree_gui.$sym77$YIELD);
        final SubLObject current_yield = methods.funcall_instance_method_with_0_args(current_tree, (SubLObject)parse_tree_gui.$sym77$YIELD);
        SubLObject message = (SubLObject)parse_tree_gui.NIL;
        methods.funcall_instance_method_with_0_args(current_tree, (SubLObject)parse_tree_gui.$sym129$NAIVE_WFF_SELF_PRUNE);
        SubLObject full_word = (SubLObject)parse_tree_gui.NIL;
        SubLObject full_word_$3 = (SubLObject)parse_tree_gui.NIL;
        SubLObject current_word = (SubLObject)parse_tree_gui.NIL;
        SubLObject current_word_$4 = (SubLObject)parse_tree_gui.NIL;
        full_word = full_yield;
        full_word_$3 = full_word.first();
        current_word = current_yield;
        current_word_$4 = current_word.first();
        while (parse_tree_gui.NIL != current_word || parse_tree_gui.NIL != full_word) {
            final SubLObject full_lexes = methods.funcall_instance_method_with_0_args(full_word_$3, (SubLObject)parse_tree_gui.$sym103$GET_LEXES);
            final SubLObject current_lexes = methods.funcall_instance_method_with_0_args(current_word_$4, (SubLObject)parse_tree_gui.$sym103$GET_LEXES);
            SubLObject word_message = (SubLObject)parse_tree_gui.NIL;
            SubLObject cdolist_list_var = full_lexes;
            SubLObject lex = (SubLObject)parse_tree_gui.NIL;
            lex = cdolist_list_var.first();
            while (parse_tree_gui.NIL != cdolist_list_var) {
                if (parse_tree_gui.NIL != subl_promotions.memberP(lex, current_lexes, Symbols.symbol_function((SubLObject)parse_tree_gui.$sym130$LEX_ENTRY_EQUALP), (SubLObject)parse_tree_gui.UNPROVIDED)) {
                    word_message = (SubLObject)ConsesLow.cons((SubLObject)parse_tree_gui.ONE_INTEGER, word_message);
                }
                else {
                    word_message = (SubLObject)ConsesLow.cons((SubLObject)parse_tree_gui.ZERO_INTEGER, word_message);
                }
                cdolist_list_var = cdolist_list_var.rest();
                lex = cdolist_list_var.first();
            }
            message = (SubLObject)ConsesLow.cons(Sequences.nreverse(word_message), message);
            full_word = full_word.rest();
            full_word_$3 = full_word.first();
            current_word = current_word.rest();
            current_word_$4 = current_word.first();
        }
        message = Sequences.nreverse(message);
        SubLObject cdolist_list_var2 = Sequences.reverse(ges_token_mapping(ges));
        SubLObject mapping = (SubLObject)parse_tree_gui.NIL;
        mapping = cdolist_list_var2.first();
        while (parse_tree_gui.NIL != cdolist_list_var2) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 13528L)
    public static SubLObject prune_ged_sentence_by_wff_checking(final SubLObject ged, final SubLObject ges_idx) {
        final SubLObject ges = Vectors.aref(ged_sentences(ged), ges_idx);
        return prune_ges_by_wff_checking(ges);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 13690L)
    public static SubLObject cyclify_ged_sentence(final SubLObject ged, final SubLObject ges_idx) {
        final SubLObject ges = Vectors.aref(ged_sentences(ged), ges_idx);
        final SubLObject current_tree = ges_current_parse_tree(ges);
        if (parse_tree_gui.NIL != parse_tree.parse_tree_p(current_tree)) {
            return methods.funcall_instance_method_with_1_args(current_tree, (SubLObject)parse_tree_gui.$sym78$CYCLIFY, (SubLObject)parse_tree_gui.$list79);
        }
        return (SubLObject)parse_tree_gui.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 13938L)
    public static SubLObject parse_tree_naive_wff_self_prune_method(final SubLObject self) {
        final SubLObject parses = methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree_gui.$sym78$CYCLIFY, (SubLObject)parse_tree_gui.$list79);
        SubLObject wff_terms = (SubLObject)parse_tree_gui.NIL;
        SubLObject cdolist_list_var = parses;
        SubLObject parse = (SubLObject)parse_tree_gui.NIL;
        parse = cdolist_list_var.first();
        while (parse_tree_gui.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5;
            final SubLObject terms = cdolist_list_var_$5 = list_utilities.flatten(parse);
            SubLObject v_term = (SubLObject)parse_tree_gui.NIL;
            v_term = cdolist_list_var_$5.first();
            while (parse_tree_gui.NIL != cdolist_list_var_$5) {
                if (parse_tree_gui.NIL != forts.fort_p(v_term)) {
                    final SubLObject item_var = v_term;
                    if (parse_tree_gui.NIL == conses_high.member(item_var, wff_terms, Symbols.symbol_function((SubLObject)parse_tree_gui.EQL), Symbols.symbol_function((SubLObject)parse_tree_gui.IDENTITY))) {
                        wff_terms = (SubLObject)ConsesLow.cons(item_var, wff_terms);
                    }
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                v_term = cdolist_list_var_$5.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        }
        if (parse_tree_gui.NIL != wff_terms) {
            methods.funcall_instance_method_with_1_args(self, (SubLObject)parse_tree_gui.$sym135$PRUNE_LEXES, wff_terms);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 14301L)
    public static SubLObject word_tree_prune_lexes_method(final SubLObject self, final SubLObject wff_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)parse_tree_gui.NIL;
        SubLObject lexes = word_tree.get_word_tree_lexes(self);
        try {
            thread.throwStack.push(parse_tree_gui.$sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                SubLObject accepted = (SubLObject)parse_tree_gui.NIL;
                SubLObject rejected = (SubLObject)parse_tree_gui.NIL;
                SubLObject to_redistribute = (SubLObject)parse_tree_gui.ZERO_INTEGER;
                SubLObject cdolist_list_var = lexes;
                SubLObject rle = (SubLObject)parse_tree_gui.NIL;
                rle = cdolist_list_var.first();
                while (parse_tree_gui.NIL != cdolist_list_var) {
                    final SubLObject semtrans_terms = list_utilities.flatten(semtrans_lexicon.extract_cycl_from_semtrans_lex_entry(cyclifier.rle_lex(rle), (SubLObject)parse_tree_gui.UNPROVIDED));
                    if (parse_tree_gui.NIL != conses_high.intersection(semtrans_terms, wff_terms, (SubLObject)parse_tree_gui.UNPROVIDED, (SubLObject)parse_tree_gui.UNPROVIDED)) {
                        accepted = (SubLObject)ConsesLow.cons(rle, accepted);
                    }
                    else {
                        rejected = (SubLObject)ConsesLow.cons(rle, rejected);
                        to_redistribute = Numbers.add(to_redistribute, cyclifier.rle_confidence(rle));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                }
                if (parse_tree_gui.NIL != accepted) {
                    final SubLObject addendum = Numbers.divide(to_redistribute, Sequences.length(accepted));
                    SubLObject cdolist_list_var2 = accepted;
                    SubLObject a = (SubLObject)parse_tree_gui.NIL;
                    a = cdolist_list_var2.first();
                    while (parse_tree_gui.NIL != cdolist_list_var2) {
                        cyclifier.rle_set_confidence(a, Numbers.add(cyclifier.rle_confidence(a), addendum));
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        a = cdolist_list_var2.first();
                    }
                }
                lexes = accepted;
                Dynamic.sublisp_throw((SubLObject)parse_tree_gui.$sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD, rejected);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree_gui.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    word_tree.set_word_tree_lexes(self, lexes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree_gui.$sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 14927L)
    public static SubLObject parse_tree_remove_redundant_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stack = stacks.create_stack();
        final SubLObject order_var = (SubLObject)parse_tree_gui.$kw143$DFR2L;
        final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)parse_tree_gui.$kw144$DFL2R, (SubLObject)parse_tree_gui.$kw143$DFR2L);
        SubLObject daughter = (SubLObject)parse_tree_gui.NIL;
        if (parse_tree_gui.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parse_tree_gui.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)parse_tree_gui.EQ), (SubLObject)parse_tree_gui.UNPROVIDED)) {
            Errors.error((SubLObject)parse_tree_gui.$str145$_S_is_not_one_of__S, order_var, possible_orders);
        }
        stacks.stack_push(self, stack);
        while (parse_tree_gui.NIL == stacks.stack_empty_p(stack)) {
            daughter = stacks.stack_pop(stack);
            if (parse_tree_gui.NIL != word_tree.word_tree_p(daughter)) {
                methods.funcall_instance_method_with_0_args(daughter, (SubLObject)parse_tree_gui.$sym62$REMOVE_REDUNDANT_LEXES);
            }
            if (parse_tree_gui.NIL != parse_tree.phrase_tree_p(daughter)) {
                final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(daughter);
                final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)parse_tree_gui.$kw144$DFL2R);
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter_$6;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree_gui.NIL, v_iteration = (SubLObject)parse_tree_gui.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree_gui.ONE_INTEGER)) {
                    element_num = ((parse_tree_gui.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree_gui.ONE_INTEGER) : v_iteration);
                    daughter_$6 = Vectors.aref(vector_var, element_num);
                    stacks.stack_push(daughter_$6, stack);
                }
            }
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 15149L)
    public static SubLObject word_tree_remove_redundant_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_word_tree_method = (SubLObject)parse_tree_gui.NIL;
        SubLObject lexes = word_tree.get_word_tree_lexes(self);
        final SubLObject mother = parse_tree.get_parse_tree_mother(self);
        try {
            thread.throwStack.push(parse_tree_gui.$sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD);
            try {
                if (parse_tree_gui.$kw149$TO == methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree_gui.$sym109$GET_CATEGORY)) {
                    final SubLObject mother_$7 = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree_gui.$sym150$GET_MOTHER);
                    if (parse_tree_gui.$kw151$VP == methods.funcall_instance_method_with_0_args(mother_$7, (SubLObject)parse_tree_gui.$sym109$GET_CATEGORY)) {
                        lexes = (SubLObject)parse_tree_gui.NIL;
                    }
                }
                else {
                    SubLObject non_redundant = (SubLObject)parse_tree_gui.NIL;
                    final SubLObject to_redistribute = (SubLObject)parse_tree_gui.ZERO_INTEGER;
                    SubLObject cdolist_list_var = lexes;
                    SubLObject rle = (SubLObject)parse_tree_gui.NIL;
                    rle = cdolist_list_var.first();
                    while (parse_tree_gui.NIL != cdolist_list_var) {
                        final SubLObject semtrans = cycl_utilities.hl_to_el(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), (SubLObject)parse_tree_gui.$sym99$GET, (SubLObject)parse_tree_gui.$kw100$SEMTRANS));
                        SubLObject fail = (SubLObject)parse_tree_gui.NIL;
                        if (parse_tree_gui.NIL == fail) {
                            SubLObject csome_list_var = non_redundant;
                            SubLObject old_rle = (SubLObject)parse_tree_gui.NIL;
                            old_rle = csome_list_var.first();
                            while (parse_tree_gui.NIL == fail && parse_tree_gui.NIL != csome_list_var) {
                                final SubLObject old_semtrans = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(old_rle), (SubLObject)parse_tree_gui.$sym99$GET, (SubLObject)parse_tree_gui.$kw100$SEMTRANS);
                                fail = Equality.equalp(semtrans, old_semtrans);
                                csome_list_var = csome_list_var.rest();
                                old_rle = csome_list_var.first();
                            }
                        }
                        if (parse_tree_gui.NIL == fail) {
                            non_redundant = (SubLObject)ConsesLow.cons(rle, non_redundant);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        rle = cdolist_list_var.first();
                    }
                    if (parse_tree_gui.NIL != non_redundant) {
                        final SubLObject addendum = Numbers.divide(to_redistribute, Sequences.length(non_redundant));
                        SubLObject cdolist_list_var2 = non_redundant;
                        SubLObject nr = (SubLObject)parse_tree_gui.NIL;
                        nr = cdolist_list_var2.first();
                        while (parse_tree_gui.NIL != cdolist_list_var2) {
                            cyclifier.rle_set_confidence(nr, Numbers.add(cyclifier.rle_confidence(nr), addendum));
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            nr = cdolist_list_var2.first();
                        }
                    }
                    lexes = non_redundant;
                }
                Dynamic.sublisp_throw((SubLObject)parse_tree_gui.$sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)parse_tree_gui.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    word_tree.set_word_tree_lexes(self, lexes);
                    parse_tree.set_parse_tree_mother(self, mother);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree_gui.$sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_word_tree_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 16015L)
    public static SubLObject phrase_tree_prune_lexes_method(final SubLObject self, final SubLObject wff_terms) {
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree_gui.$sym77$YIELD);
        SubLObject word = (SubLObject)parse_tree_gui.NIL;
        word = cdolist_list_var.first();
        while (parse_tree_gui.NIL != cdolist_list_var) {
            methods.funcall_instance_method_with_1_args(word, (SubLObject)parse_tree_gui.$sym135$PRUNE_LEXES, wff_terms);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 16177L)
    public static SubLObject phrase_tree_get_nth_word_method(final SubLObject self, final SubLObject integer) {
        final SubLObject yield = methods.funcall_instance_method_with_0_args(self, (SubLObject)parse_tree_gui.$sym77$YIELD);
        if (integer.numG(Sequences.length(yield))) {
            Errors.warn((SubLObject)parse_tree_gui.$str158$Attempted_to_get_the__A_word__but, integer, Sequences.length(yield));
            return (SubLObject)parse_tree_gui.NIL;
        }
        return ConsesLow.nth(integer, yield);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/leader/parse-tree-gui.lisp", position = 16464L)
    public static SubLObject lex_entry_equalp(final SubLObject lex1, final SubLObject lex2) {
        return Equality.equalp(methods.funcall_instance_method_with_1_args(lex1, (SubLObject)parse_tree_gui.$sym99$GET, (SubLObject)parse_tree_gui.$kw100$SEMTRANS), methods.funcall_instance_method_with_1_args(lex2, (SubLObject)parse_tree_gui.$sym99$GET, (SubLObject)parse_tree_gui.$kw100$SEMTRANS));
    }
    
    public static SubLObject declare_parse_tree_gui_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "stop_word_p", "STOP-WORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "gui_enabled_document_print_function_trampoline", "GUI-ENABLED-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "gui_enabled_document_p", "GUI-ENABLED-DOCUMENT-P", 1, 0, false);
        new $gui_enabled_document_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ged_sentences", "GED-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ged_parser", "GED-PARSER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ged_lexicon", "GED-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "_csetf_ged_sentences", "_CSETF-GED-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "_csetf_ged_parser", "_CSETF-GED-PARSER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "_csetf_ged_lexicon", "_CSETF-GED-LEXICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "make_gui_enabled_document", "MAKE-GUI-ENABLED-DOCUMENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "visit_defstruct_gui_enabled_document", "VISIT-DEFSTRUCT-GUI-ENABLED-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "visit_defstruct_object_gui_enabled_document_method", "VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-DOCUMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "new_gui_enabled_document", "NEW-GUI-ENABLED-DOCUMENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "add_sentence_to_ged", "ADD-SENTENCE-TO-GED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ged_sentence_number", "GED-SENTENCE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "gui_enabled_sentence_print_function_trampoline", "GUI-ENABLED-SENTENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "gui_enabled_sentence_p", "GUI-ENABLED-SENTENCE-P", 1, 0, false);
        new $gui_enabled_sentence_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ges_surface_string", "GES-SURFACE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ges_gui_tokens", "GES-GUI-TOKENS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ges_full_parse_tree", "GES-FULL-PARSE-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ges_current_parse_tree", "GES-CURRENT-PARSE-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ges_token_mapping", "GES-TOKEN-MAPPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ges_parent_document", "GES-PARENT-DOCUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "_csetf_ges_surface_string", "_CSETF-GES-SURFACE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "_csetf_ges_gui_tokens", "_CSETF-GES-GUI-TOKENS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "_csetf_ges_full_parse_tree", "_CSETF-GES-FULL-PARSE-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "_csetf_ges_current_parse_tree", "_CSETF-GES-CURRENT-PARSE-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "_csetf_ges_token_mapping", "_CSETF-GES-TOKEN-MAPPING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "_csetf_ges_parent_document", "_CSETF-GES-PARENT-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "make_gui_enabled_sentence", "MAKE-GUI-ENABLED-SENTENCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "visit_defstruct_gui_enabled_sentence", "VISIT-DEFSTRUCT-GUI-ENABLED-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "visit_defstruct_object_gui_enabled_sentence_method", "VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-SENTENCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "new_gui_enabled_sentence", "NEW-GUI-ENABLED-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ges_lexicon", "GES-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "pprint_ged", "PPRINT-GED", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "pprint_ges", "PPRINT-GES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "new_gui_enabled_document_from_stream", "NEW-GUI-ENABLED-DOCUMENT-FROM-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "sentencify_remotely", "SENTENCIFY-REMOTELY", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "new_gui_enabled_document_from_file", "NEW-GUI-ENABLED-DOCUMENT-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "new_gui_enabled_document_from_string", "NEW-GUI-ENABLED-DOCUMENT-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "gui_enabled_sentence_to_xml", "GUI-ENABLED-SENTENCE-TO-XML", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ged_to_xml_string", "GED-TO-XML-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "word_tree_to_xml_method", "WORD-TREE-TO-XML-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "removal_lambda", "REMOVAL-LAMBDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "get_ges_annotated_leaves", "GET-GES-ANNOTATED-LEAVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "get_ged_annotated_tree", "GET-GED-ANNOTATED-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "get_ges_annotated_tree", "GET-GES-ANNOTATED-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "annotate_parse_tree", "ANNOTATE-PARSE-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "annotate_phrase_tree", "ANNOTATE-PHRASE-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "annotate_word_tree", "ANNOTATE-WORD-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "create_ges_token_mapping", "CREATE-GES-TOKEN-MAPPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "ges_word_string", "GES-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "create_token_list", "CREATE-TOKEN-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "nmerge_words", "NMERGE-WORDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "add_spaces", "ADD-SPACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "reattach_word", "REATTACH-WORD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "get_ged_annotated_leaves", "GET-GED-ANNOTATED-LEAVES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "select_sense_for_word", "SELECT-SENSE-FOR-WORD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "find_word_index_from_path", "FIND-WORD-INDEX-FROM-PATH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "prune_ges_by_wff_checking", "PRUNE-GES-BY-WFF-CHECKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "prune_ged_sentence_by_wff_checking", "PRUNE-GED-SENTENCE-BY-WFF-CHECKING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "cyclify_ged_sentence", "CYCLIFY-GED-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "parse_tree_naive_wff_self_prune_method", "PARSE-TREE-NAIVE-WFF-SELF-PRUNE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "word_tree_prune_lexes_method", "WORD-TREE-PRUNE-LEXES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "parse_tree_remove_redundant_lexes_method", "PARSE-TREE-REMOVE-REDUNDANT-LEXES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "word_tree_remove_redundant_lexes_method", "WORD-TREE-REMOVE-REDUNDANT-LEXES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "phrase_tree_prune_lexes_method", "PHRASE-TREE-PRUNE-LEXES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "phrase_tree_get_nth_word_method", "PHRASE-TREE-GET-NTH-WORD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.leader.parse_tree_gui", "lex_entry_equalp", "LEX-ENTRY-EQUALP", 2, 0, false);
        return (SubLObject)parse_tree_gui.NIL;
    }
    
    public static SubLObject init_parse_tree_gui_file() {
        parse_tree_gui.$stop_word_categories$ = SubLFiles.defparameter("*STOP-WORD-CATEGORIES*", (SubLObject)parse_tree_gui.$list0);
        parse_tree_gui.$dtp_gui_enabled_document$ = SubLFiles.defconstant("*DTP-GUI-ENABLED-DOCUMENT*", (SubLObject)parse_tree_gui.$sym1$GUI_ENABLED_DOCUMENT);
        parse_tree_gui.$dtp_gui_enabled_sentence$ = SubLFiles.defconstant("*DTP-GUI-ENABLED-SENTENCE*", (SubLObject)parse_tree_gui.$sym29$GUI_ENABLED_SENTENCE);
        parse_tree_gui.$token_index$ = SubLFiles.defvar("*TOKEN-INDEX*", (SubLObject)parse_tree_gui.ZERO_INTEGER);
        return (SubLObject)parse_tree_gui.NIL;
    }
    
    public static SubLObject setup_parse_tree_gui_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), parse_tree_gui.$dtp_gui_enabled_document$.getGlobalValue(), Symbols.symbol_function((SubLObject)parse_tree_gui.$sym8$GUI_ENABLED_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)parse_tree_gui.$list9);
        Structures.def_csetf((SubLObject)parse_tree_gui.$sym10$GED_SENTENCES, (SubLObject)parse_tree_gui.$sym11$_CSETF_GED_SENTENCES);
        Structures.def_csetf((SubLObject)parse_tree_gui.$sym12$GED_PARSER, (SubLObject)parse_tree_gui.$sym13$_CSETF_GED_PARSER);
        Structures.def_csetf((SubLObject)parse_tree_gui.$sym14$GED_LEXICON, (SubLObject)parse_tree_gui.$sym15$_CSETF_GED_LEXICON);
        Equality.identity((SubLObject)parse_tree_gui.$sym1$GUI_ENABLED_DOCUMENT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), parse_tree_gui.$dtp_gui_enabled_document$.getGlobalValue(), Symbols.symbol_function((SubLObject)parse_tree_gui.$sym24$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_DOCUMENT_METHOD));
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym25$NEW_GUI_ENABLED_DOCUMENT);
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym27$ADD_SENTENCE_TO_GED);
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym28$GED_SENTENCE_NUMBER);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), parse_tree_gui.$dtp_gui_enabled_sentence$.getGlobalValue(), Symbols.symbol_function((SubLObject)parse_tree_gui.$sym36$GUI_ENABLED_SENTENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)parse_tree_gui.$list37);
        Structures.def_csetf((SubLObject)parse_tree_gui.$sym38$GES_SURFACE_STRING, (SubLObject)parse_tree_gui.$sym39$_CSETF_GES_SURFACE_STRING);
        Structures.def_csetf((SubLObject)parse_tree_gui.$sym40$GES_GUI_TOKENS, (SubLObject)parse_tree_gui.$sym41$_CSETF_GES_GUI_TOKENS);
        Structures.def_csetf((SubLObject)parse_tree_gui.$sym42$GES_FULL_PARSE_TREE, (SubLObject)parse_tree_gui.$sym43$_CSETF_GES_FULL_PARSE_TREE);
        Structures.def_csetf((SubLObject)parse_tree_gui.$sym44$GES_CURRENT_PARSE_TREE, (SubLObject)parse_tree_gui.$sym45$_CSETF_GES_CURRENT_PARSE_TREE);
        Structures.def_csetf((SubLObject)parse_tree_gui.$sym46$GES_TOKEN_MAPPING, (SubLObject)parse_tree_gui.$sym47$_CSETF_GES_TOKEN_MAPPING);
        Structures.def_csetf((SubLObject)parse_tree_gui.$sym48$GES_PARENT_DOCUMENT, (SubLObject)parse_tree_gui.$sym49$_CSETF_GES_PARENT_DOCUMENT);
        Equality.identity((SubLObject)parse_tree_gui.$sym29$GUI_ENABLED_SENTENCE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), parse_tree_gui.$dtp_gui_enabled_sentence$.getGlobalValue(), Symbols.symbol_function((SubLObject)parse_tree_gui.$sym57$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_SENTENCE_METHOD));
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym58$NEW_GUI_ENABLED_SENTENCE);
        access_macros.define_obsolete_register((SubLObject)parse_tree_gui.$sym66$SENTENCIFY_REMOTELY, (SubLObject)parse_tree_gui.$list67);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree_gui.$sym81$TO_XML, (SubLObject)parse_tree_gui.$sym92$WORD_TREE, (SubLObject)parse_tree_gui.$list93, (SubLObject)parse_tree_gui.$list94, (SubLObject)parse_tree_gui.$list95);
        methods.subloop_register_instance_method((SubLObject)parse_tree_gui.$sym92$WORD_TREE, (SubLObject)parse_tree_gui.$sym81$TO_XML, (SubLObject)parse_tree_gui.$sym104$WORD_TREE_TO_XML_METHOD);
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym105$GET_GES_ANNOTATED_LEAVES);
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym110$GET_GED_ANNOTATED_TREE);
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym111$GET_GES_ANNOTATED_TREE);
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym122$GET_GED_ANNOTATED_LEAVES);
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym123$SELECT_SENSE_FOR_WORD);
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym127$FIND_WORD_INDEX_FROM_PATH);
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym128$PRUNE_GES_BY_WFF_CHECKING);
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym131$PRUNE_GED_SENTENCE_BY_WFF_CHECKING);
        access_macros.register_external_symbol((SubLObject)parse_tree_gui.$sym132$CYCLIFY_GED_SENTENCE);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree_gui.$sym129$NAIVE_WFF_SELF_PRUNE, (SubLObject)parse_tree_gui.$sym133$PARSE_TREE, (SubLObject)parse_tree_gui.$list93, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.$list134);
        methods.subloop_register_instance_method((SubLObject)parse_tree_gui.$sym133$PARSE_TREE, (SubLObject)parse_tree_gui.$sym129$NAIVE_WFF_SELF_PRUNE, (SubLObject)parse_tree_gui.$sym136$PARSE_TREE_NAIVE_WFF_SELF_PRUNE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree_gui.$sym135$PRUNE_LEXES, (SubLObject)parse_tree_gui.$sym92$WORD_TREE, (SubLObject)parse_tree_gui.$list93, (SubLObject)parse_tree_gui.$list137, (SubLObject)parse_tree_gui.$list138);
        methods.subloop_register_instance_method((SubLObject)parse_tree_gui.$sym92$WORD_TREE, (SubLObject)parse_tree_gui.$sym135$PRUNE_LEXES, (SubLObject)parse_tree_gui.$sym140$WORD_TREE_PRUNE_LEXES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree_gui.$sym62$REMOVE_REDUNDANT_LEXES, (SubLObject)parse_tree_gui.$sym133$PARSE_TREE, (SubLObject)parse_tree_gui.$list141, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.$list142);
        methods.subloop_register_instance_method((SubLObject)parse_tree_gui.$sym133$PARSE_TREE, (SubLObject)parse_tree_gui.$sym62$REMOVE_REDUNDANT_LEXES, (SubLObject)parse_tree_gui.$sym146$PARSE_TREE_REMOVE_REDUNDANT_LEXES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree_gui.$sym62$REMOVE_REDUNDANT_LEXES, (SubLObject)parse_tree_gui.$sym92$WORD_TREE, (SubLObject)parse_tree_gui.$list141, (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.$list147);
        methods.subloop_register_instance_method((SubLObject)parse_tree_gui.$sym92$WORD_TREE, (SubLObject)parse_tree_gui.$sym62$REMOVE_REDUNDANT_LEXES, (SubLObject)parse_tree_gui.$sym152$WORD_TREE_REMOVE_REDUNDANT_LEXES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree_gui.$sym135$PRUNE_LEXES, (SubLObject)parse_tree_gui.$sym153$PHRASE_TREE, (SubLObject)parse_tree_gui.$list93, (SubLObject)parse_tree_gui.$list137, (SubLObject)parse_tree_gui.$list154);
        methods.subloop_register_instance_method((SubLObject)parse_tree_gui.$sym153$PHRASE_TREE, (SubLObject)parse_tree_gui.$sym135$PRUNE_LEXES, (SubLObject)parse_tree_gui.$sym155$PHRASE_TREE_PRUNE_LEXES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)parse_tree_gui.$sym124$GET_NTH_WORD, (SubLObject)parse_tree_gui.$sym153$PHRASE_TREE, (SubLObject)parse_tree_gui.$list93, (SubLObject)parse_tree_gui.$list156, (SubLObject)parse_tree_gui.$list157);
        methods.subloop_register_instance_method((SubLObject)parse_tree_gui.$sym153$PHRASE_TREE, (SubLObject)parse_tree_gui.$sym124$GET_NTH_WORD, (SubLObject)parse_tree_gui.$sym159$PHRASE_TREE_GET_NTH_WORD_METHOD);
        return (SubLObject)parse_tree_gui.NIL;
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
    
    static {
        me = (SubLFile)new parse_tree_gui();
        parse_tree_gui.$stop_word_categories$ = null;
        parse_tree_gui.$dtp_gui_enabled_document$ = null;
        parse_tree_gui.$dtp_gui_enabled_sentence$ = null;
        parse_tree_gui.$token_index$ = null;
        $list0 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("DT"), SubLObjectFactory.makeKeyword("CC"), SubLObjectFactory.makeKeyword("PRP"), SubLObjectFactory.makeKeyword("."), SubLObjectFactory.makeKeyword(","), SubLObjectFactory.makeKeyword(":"), SubLObjectFactory.makeKeyword("''"), SubLObjectFactory.makeKeyword("``"), SubLObjectFactory.makeKeyword("'"), SubLObjectFactory.makeKeyword("`"), SubLObjectFactory.makeKeyword("("), SubLObjectFactory.makeKeyword(")"), SubLObjectFactory.makeKeyword("-LRB-"), SubLObjectFactory.makeKeyword("-RRB-"), SubLObjectFactory.makeKeyword("LS") });
        $sym1$GUI_ENABLED_DOCUMENT = SubLObjectFactory.makeSymbol("GUI-ENABLED-DOCUMENT");
        $sym2$GUI_ENABLED_DOCUMENT_P = SubLObjectFactory.makeSymbol("GUI-ENABLED-DOCUMENT-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCES"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCES"), (SubLObject)SubLObjectFactory.makeKeyword("PARSER"), (SubLObject)SubLObjectFactory.makeKeyword("LEXICON"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GED-SENTENCES"), (SubLObject)SubLObjectFactory.makeSymbol("GED-PARSER"), (SubLObject)SubLObjectFactory.makeSymbol("GED-LEXICON"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GED-SENTENCES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GED-PARSER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GED-LEXICON"));
        $sym7$PPRINT_GED = SubLObjectFactory.makeSymbol("PPRINT-GED");
        $sym8$GUI_ENABLED_DOCUMENT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GUI-ENABLED-DOCUMENT-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GUI-ENABLED-DOCUMENT-P"));
        $sym10$GED_SENTENCES = SubLObjectFactory.makeSymbol("GED-SENTENCES");
        $sym11$_CSETF_GED_SENTENCES = SubLObjectFactory.makeSymbol("_CSETF-GED-SENTENCES");
        $sym12$GED_PARSER = SubLObjectFactory.makeSymbol("GED-PARSER");
        $sym13$_CSETF_GED_PARSER = SubLObjectFactory.makeSymbol("_CSETF-GED-PARSER");
        $sym14$GED_LEXICON = SubLObjectFactory.makeSymbol("GED-LEXICON");
        $sym15$_CSETF_GED_LEXICON = SubLObjectFactory.makeSymbol("_CSETF-GED-LEXICON");
        $kw16$SENTENCES = SubLObjectFactory.makeKeyword("SENTENCES");
        $kw17$PARSER = SubLObjectFactory.makeKeyword("PARSER");
        $kw18$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $str19$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw20$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym21$MAKE_GUI_ENABLED_DOCUMENT = SubLObjectFactory.makeSymbol("MAKE-GUI-ENABLED-DOCUMENT");
        $kw22$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw23$END = SubLObjectFactory.makeKeyword("END");
        $sym24$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_DOCUMENT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-DOCUMENT-METHOD");
        $sym25$NEW_GUI_ENABLED_DOCUMENT = SubLObjectFactory.makeSymbol("NEW-GUI-ENABLED-DOCUMENT");
        $sym26$CYCLIFIER_LEXICON = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON");
        $sym27$ADD_SENTENCE_TO_GED = SubLObjectFactory.makeSymbol("ADD-SENTENCE-TO-GED");
        $sym28$GED_SENTENCE_NUMBER = SubLObjectFactory.makeSymbol("GED-SENTENCE-NUMBER");
        $sym29$GUI_ENABLED_SENTENCE = SubLObjectFactory.makeSymbol("GUI-ENABLED-SENTENCE");
        $sym30$GUI_ENABLED_SENTENCE_P = SubLObjectFactory.makeSymbol("GUI-ENABLED-SENTENCE-P");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SURFACE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("GUI-TOKENS"), (SubLObject)SubLObjectFactory.makeSymbol("FULL-PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("TOKEN-MAPPING"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-DOCUMENT"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SURFACE-STRING"), (SubLObject)SubLObjectFactory.makeKeyword("GUI-TOKENS"), (SubLObject)SubLObjectFactory.makeKeyword("FULL-PARSE-TREE"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT-PARSE-TREE"), (SubLObject)SubLObjectFactory.makeKeyword("TOKEN-MAPPING"), (SubLObject)SubLObjectFactory.makeKeyword("PARENT-DOCUMENT"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GES-SURFACE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("GES-GUI-TOKENS"), (SubLObject)SubLObjectFactory.makeSymbol("GES-FULL-PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("GES-CURRENT-PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("GES-TOKEN-MAPPING"), (SubLObject)SubLObjectFactory.makeSymbol("GES-PARENT-DOCUMENT"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GES-SURFACE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GES-GUI-TOKENS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GES-FULL-PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GES-CURRENT-PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GES-TOKEN-MAPPING"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-GES-PARENT-DOCUMENT"));
        $sym35$PPRINT_GES = SubLObjectFactory.makeSymbol("PPRINT-GES");
        $sym36$GUI_ENABLED_SENTENCE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GUI-ENABLED-SENTENCE-PRINT-FUNCTION-TRAMPOLINE");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GUI-ENABLED-SENTENCE-P"));
        $sym38$GES_SURFACE_STRING = SubLObjectFactory.makeSymbol("GES-SURFACE-STRING");
        $sym39$_CSETF_GES_SURFACE_STRING = SubLObjectFactory.makeSymbol("_CSETF-GES-SURFACE-STRING");
        $sym40$GES_GUI_TOKENS = SubLObjectFactory.makeSymbol("GES-GUI-TOKENS");
        $sym41$_CSETF_GES_GUI_TOKENS = SubLObjectFactory.makeSymbol("_CSETF-GES-GUI-TOKENS");
        $sym42$GES_FULL_PARSE_TREE = SubLObjectFactory.makeSymbol("GES-FULL-PARSE-TREE");
        $sym43$_CSETF_GES_FULL_PARSE_TREE = SubLObjectFactory.makeSymbol("_CSETF-GES-FULL-PARSE-TREE");
        $sym44$GES_CURRENT_PARSE_TREE = SubLObjectFactory.makeSymbol("GES-CURRENT-PARSE-TREE");
        $sym45$_CSETF_GES_CURRENT_PARSE_TREE = SubLObjectFactory.makeSymbol("_CSETF-GES-CURRENT-PARSE-TREE");
        $sym46$GES_TOKEN_MAPPING = SubLObjectFactory.makeSymbol("GES-TOKEN-MAPPING");
        $sym47$_CSETF_GES_TOKEN_MAPPING = SubLObjectFactory.makeSymbol("_CSETF-GES-TOKEN-MAPPING");
        $sym48$GES_PARENT_DOCUMENT = SubLObjectFactory.makeSymbol("GES-PARENT-DOCUMENT");
        $sym49$_CSETF_GES_PARENT_DOCUMENT = SubLObjectFactory.makeSymbol("_CSETF-GES-PARENT-DOCUMENT");
        $kw50$SURFACE_STRING = SubLObjectFactory.makeKeyword("SURFACE-STRING");
        $kw51$GUI_TOKENS = SubLObjectFactory.makeKeyword("GUI-TOKENS");
        $kw52$FULL_PARSE_TREE = SubLObjectFactory.makeKeyword("FULL-PARSE-TREE");
        $kw53$CURRENT_PARSE_TREE = SubLObjectFactory.makeKeyword("CURRENT-PARSE-TREE");
        $kw54$TOKEN_MAPPING = SubLObjectFactory.makeKeyword("TOKEN-MAPPING");
        $kw55$PARENT_DOCUMENT = SubLObjectFactory.makeKeyword("PARENT-DOCUMENT");
        $sym56$MAKE_GUI_ENABLED_SENTENCE = SubLObjectFactory.makeSymbol("MAKE-GUI-ENABLED-SENTENCE");
        $sym57$VISIT_DEFSTRUCT_OBJECT_GUI_ENABLED_SENTENCE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GUI-ENABLED-SENTENCE-METHOD");
        $sym58$NEW_GUI_ENABLED_SENTENCE = SubLObjectFactory.makeSymbol("NEW-GUI-ENABLED-SENTENCE");
        $sym59$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym60$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $sym61$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
        $sym62$REMOVE_REDUNDANT_LEXES = SubLObjectFactory.makeSymbol("REMOVE-REDUNDANT-LEXES");
        $str63$__GED___S_sentences_ = SubLObjectFactory.makeString("#<GED: ~S sentences>");
        $str64$___ = SubLObjectFactory.makeString("...");
        $str65$__GES___S_ = SubLObjectFactory.makeString("#<GES: ~S>");
        $sym66$SENTENCIFY_REMOTELY = SubLObjectFactory.makeSymbol("SENTENCIFY-REMOTELY");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCIFY-STRING"));
        $str68$_sentencify_cgi = SubLObjectFactory.makeString("/sentencify.cgi");
        $kw69$POST = SubLObjectFactory.makeKeyword("POST");
        $str70$_ = SubLObjectFactory.makeString("'");
        $str71$_ = SubLObjectFactory.makeString("\"");
        $str72$string = SubLObjectFactory.makeString("string");
        $kw73$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str74$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym75$START_TAG = SubLObjectFactory.makeSymbol("START-TAG");
        $str76$sentence = SubLObjectFactory.makeString("sentence");
        $sym77$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $sym78$CYCLIFY = SubLObjectFactory.makeSymbol("CYCLIFY");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LEXICON"), (SubLObject)parse_tree_gui.NIL);
        $str80$tokens = SubLObjectFactory.makeString("tokens");
        $sym81$TO_XML = SubLObjectFactory.makeSymbol("TO-XML");
        $sym82$END_TAG = SubLObjectFactory.makeSymbol("END-TAG");
        $str83$parses = SubLObjectFactory.makeString("parses");
        $sym84$OUTSTREAM = SubLObjectFactory.makeSymbol("OUTSTREAM");
        $sym85$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str86$___S = SubLObjectFactory.makeString("~%~S");
        $sym87$XML_WRITER = SubLObjectFactory.makeSymbol("XML-WRITER");
        $sym88$SET_STREAM = SubLObjectFactory.makeSymbol("SET-STREAM");
        $str89$cycl_annotated_document = SubLObjectFactory.makeString("cycl-annotated-document");
        $sym90$FLUSH = SubLObjectFactory.makeSymbol("FLUSH");
        $sym91$CLOSE = SubLObjectFactory.makeSymbol("CLOSE");
        $sym92$WORD_TREE = SubLObjectFactory.makeSymbol("WORD-TREE");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"));
        $list95 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*XML-STREAM*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OUTSTREAM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeString("pos"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeString("token"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLS"), (SubLObject)parse_tree_gui.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXEME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEXES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXEME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"))), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIRD"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)parse_tree_gui.EQ, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIRD"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("START-TAG")), (SubLObject)SubLObjectFactory.makeString("token"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-SERIALIZE-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("XML-WRITER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("END-TAG")), (SubLObject)SubLObjectFactory.makeString("token"), (SubLObject)parse_tree_gui.NIL, (SubLObject)parse_tree_gui.T)));
        $sym96$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $str97$pos = SubLObjectFactory.makeString("pos");
        $str98$token = SubLObjectFactory.makeString("token");
        $sym99$GET = SubLObjectFactory.makeSymbol("GET");
        $kw100$SEMTRANS = SubLObjectFactory.makeKeyword("SEMTRANS");
        $list101 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")));
        $const102$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym103$GET_LEXES = SubLObjectFactory.makeSymbol("GET-LEXES");
        $sym104$WORD_TREE_TO_XML_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-TO-XML-METHOD");
        $sym105$GET_GES_ANNOTATED_LEAVES = SubLObjectFactory.makeSymbol("GET-GES-ANNOTATED-LEAVES");
        $sym106$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym107$REMOVAL_LAMBDA = SubLObjectFactory.makeSymbol("REMOVAL-LAMBDA");
        $sym108$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym109$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $sym110$GET_GED_ANNOTATED_TREE = SubLObjectFactory.makeSymbol("GET-GED-ANNOTATED-TREE");
        $sym111$GET_GES_ANNOTATED_TREE = SubLObjectFactory.makeSymbol("GET-GES-ANNOTATED-TREE");
        $kw112$PHRASE_TREE = SubLObjectFactory.makeKeyword("PHRASE-TREE");
        $sym113$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $sym114$GET_PATH = SubLObjectFactory.makeSymbol("GET-PATH");
        $kw115$WORD_TREE = SubLObjectFactory.makeKeyword("WORD-TREE");
        $sym116$GES_WORD_STRING = SubLObjectFactory.makeSymbol("GES-WORD-STRING");
        $sym117$EMPTY_STRING_P = SubLObjectFactory.makeSymbol("EMPTY-STRING-P");
        $sym118$TRIM_WHITESPACE = SubLObjectFactory.makeSymbol("TRIM-WHITESPACE");
        $str119$ = SubLObjectFactory.makeString("");
        $str120$_ = SubLObjectFactory.makeString(" ");
        $sym121$SUBSTRING_ = SubLObjectFactory.makeSymbol("SUBSTRING?");
        $sym122$GET_GED_ANNOTATED_LEAVES = SubLObjectFactory.makeSymbol("GET-GED-ANNOTATED-LEAVES");
        $sym123$SELECT_SENSE_FOR_WORD = SubLObjectFactory.makeSymbol("SELECT-SENSE-FOR-WORD");
        $sym124$GET_NTH_WORD = SubLObjectFactory.makeSymbol("GET-NTH-WORD");
        $str125$Attempted_to_set_sense__A__but_on = SubLObjectFactory.makeString("Attempted to set sense ~A, but only ~A lexes");
        $sym126$LEXES = SubLObjectFactory.makeSymbol("LEXES");
        $sym127$FIND_WORD_INDEX_FROM_PATH = SubLObjectFactory.makeSymbol("FIND-WORD-INDEX-FROM-PATH");
        $sym128$PRUNE_GES_BY_WFF_CHECKING = SubLObjectFactory.makeSymbol("PRUNE-GES-BY-WFF-CHECKING");
        $sym129$NAIVE_WFF_SELF_PRUNE = SubLObjectFactory.makeSymbol("NAIVE-WFF-SELF-PRUNE");
        $sym130$LEX_ENTRY_EQUALP = SubLObjectFactory.makeSymbol("LEX-ENTRY-EQUALP");
        $sym131$PRUNE_GED_SENTENCE_BY_WFF_CHECKING = SubLObjectFactory.makeSymbol("PRUNE-GED-SENTENCE-BY-WFF-CHECKING");
        $sym132$CYCLIFY_GED_SENTENCE = SubLObjectFactory.makeSymbol("CYCLIFY-GED-SENTENCE");
        $sym133$PARSE_TREE = SubLObjectFactory.makeSymbol("PARSE-TREE");
        $list134 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LEXICON"), (SubLObject)parse_tree_gui.NIL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-TERMS"), (SubLObject)parse_tree_gui.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLATTEN"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("WFF-TERMS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("WFF-TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRUNE-LEXES")), (SubLObject)SubLObjectFactory.makeSymbol("WFF-TERMS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym135$PRUNE_LEXES = SubLObjectFactory.makeSymbol("PRUNE-LEXES");
        $sym136$PARSE_TREE_NAIVE_WFF_SELF_PRUNE_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-NAIVE-WFF-SELF-PRUNE-METHOD");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-TERMS"));
        $list138 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACCEPTED"), (SubLObject)parse_tree_gui.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REJECTED"), (SubLObject)parse_tree_gui.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-REDISTRIBUTE"), (SubLObject)parse_tree_gui.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLATTEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERSECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("WFF-TERMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPTED"))), (SubLObject)ConsesLow.list((SubLObject)parse_tree_gui.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("REJECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("TO-REDISTRIBUTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADDENDUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)SubLObjectFactory.makeSymbol("TO-REDISTRIBUTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPTED"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-SET-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("A")), (SubLObject)SubLObjectFactory.makeSymbol("ADDENDUM")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("REJECTED"))));
        $sym139$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $sym140$WORD_TREE_PRUNE_LEXES_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-PRUNE-LEXES-METHOD");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list142 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-PARSE-TREE-SUBTREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-REDUNDANT-LEXES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $kw143$DFR2L = SubLObjectFactory.makeKeyword("DFR2L");
        $kw144$DFL2R = SubLObjectFactory.makeKeyword("DFL2R");
        $str145$_S_is_not_one_of__S = SubLObjectFactory.makeString("~S is not one of ~S");
        $sym146$PARSE_TREE_REMOVE_REDUNDANT_LEXES_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-REMOVE-REDUNDANT-LEXES-METHOD");
        $list147 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)parse_tree_gui.EQ, (SubLObject)SubLObjectFactory.makeKeyword("TO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MOTHER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)parse_tree_gui.EQ, (SubLObject)SubLObjectFactory.makeKeyword("VP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)parse_tree_gui.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-REDUNDANT"), (SubLObject)parse_tree_gui.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TO-REDISTRIBUTE"), (SubLObject)parse_tree_gui.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-TO-EL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS")))), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-RLE"), (SubLObject)SubLObjectFactory.makeSymbol("NON-REDUNDANT"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-RLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)parse_tree_gui.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-SEMTRANS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("RLE"), (SubLObject)SubLObjectFactory.makeSymbol("NON-REDUNDANT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-REDUNDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADDENDUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)SubLObjectFactory.makeSymbol("TO-REDISTRIBUTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("NON-REDUNDANT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NR"), (SubLObject)SubLObjectFactory.makeSymbol("NON-REDUNDANT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-SET-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("NR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RLE-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("NR")), (SubLObject)SubLObjectFactory.makeSymbol("ADDENDUM")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)SubLObjectFactory.makeSymbol("NON-REDUNDANT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym148$OUTER_CATCH_FOR_WORD_TREE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");
        $kw149$TO = SubLObjectFactory.makeKeyword("TO");
        $sym150$GET_MOTHER = SubLObjectFactory.makeSymbol("GET-MOTHER");
        $kw151$VP = SubLObjectFactory.makeKeyword("VP");
        $sym152$WORD_TREE_REMOVE_REDUNDANT_LEXES_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-REMOVE-REDUNDANT-LEXES-METHOD");
        $sym153$PHRASE_TREE = SubLObjectFactory.makeSymbol("PHRASE-TREE");
        $list154 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRUNE-LEXES")), (SubLObject)SubLObjectFactory.makeSymbol("WFF-TERMS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym155$PHRASE_TREE_PRUNE_LEXES_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-PRUNE-LEXES-METHOD");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER"));
        $list157 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Attempted to get the ~A word, but there are only ~A words."), (SubLObject)SubLObjectFactory.makeSymbol("INTEGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)parse_tree_gui.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGER"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")))));
        $str158$Attempted_to_get_the__A_word__but = SubLObjectFactory.makeString("Attempted to get the ~A word, but there are only ~A words.");
        $sym159$PHRASE_TREE_GET_NTH_WORD_METHOD = SubLObjectFactory.makeSymbol("PHRASE-TREE-GET-NTH-WORD-METHOD");
    }
    
    public static final class $gui_enabled_document_native extends SubLStructNative
    {
        public SubLObject $sentences;
        public SubLObject $parser;
        public SubLObject $lexicon;
        private static final SubLStructDeclNative structDecl;
        
        public $gui_enabled_document_native() {
            this.$sentences = (SubLObject)CommonSymbols.NIL;
            this.$parser = (SubLObject)CommonSymbols.NIL;
            this.$lexicon = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$gui_enabled_document_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$gui_enabled_document_native.class, parse_tree_gui.$sym1$GUI_ENABLED_DOCUMENT, parse_tree_gui.$sym2$GUI_ENABLED_DOCUMENT_P, parse_tree_gui.$list3, parse_tree_gui.$list4, new String[] { "$sentences", "$parser", "$lexicon" }, parse_tree_gui.$list5, parse_tree_gui.$list6, parse_tree_gui.$sym7$PPRINT_GED);
        }
    }
    
    public static final class $gui_enabled_document_p$UnaryFunction extends UnaryFunction
    {
        public $gui_enabled_document_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GUI-ENABLED-DOCUMENT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return parse_tree_gui.gui_enabled_document_p(arg1);
        }
    }
    
    public static final class $gui_enabled_sentence_native extends SubLStructNative
    {
        public SubLObject $surface_string;
        public SubLObject $gui_tokens;
        public SubLObject $full_parse_tree;
        public SubLObject $current_parse_tree;
        public SubLObject $token_mapping;
        public SubLObject $parent_document;
        private static final SubLStructDeclNative structDecl;
        
        public $gui_enabled_sentence_native() {
            this.$surface_string = (SubLObject)CommonSymbols.NIL;
            this.$gui_tokens = (SubLObject)CommonSymbols.NIL;
            this.$full_parse_tree = (SubLObject)CommonSymbols.NIL;
            this.$current_parse_tree = (SubLObject)CommonSymbols.NIL;
            this.$token_mapping = (SubLObject)CommonSymbols.NIL;
            this.$parent_document = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$gui_enabled_sentence_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$gui_enabled_sentence_native.class, parse_tree_gui.$sym29$GUI_ENABLED_SENTENCE, parse_tree_gui.$sym30$GUI_ENABLED_SENTENCE_P, parse_tree_gui.$list31, parse_tree_gui.$list32, new String[] { "$surface_string", "$gui_tokens", "$full_parse_tree", "$current_parse_tree", "$token_mapping", "$parent_document" }, parse_tree_gui.$list33, parse_tree_gui.$list34, parse_tree_gui.$sym35$PPRINT_GES);
        }
    }
    
    public static final class $gui_enabled_sentence_p$UnaryFunction extends UnaryFunction
    {
        public $gui_enabled_sentence_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GUI-ENABLED-SENTENCE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return parse_tree_gui.gui_enabled_sentence_p(arg1);
        }
    }
}

/*

	Total time: 529 ms
	
*/