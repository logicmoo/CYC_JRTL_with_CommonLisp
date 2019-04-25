package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ebmt_template_parser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ebmt_template_parser";
    public static final String myFingerPrint = "bf36012842aba91997c6e3e95213470d35d4d0daab9d1371aad605b914a05e9f";
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 3150L)
    public static SubLSymbol $ebmt_exclude_predsP$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 3339L)
    public static SubLSymbol $ebmt_phrase_interp_timeout$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLSymbol $dtp_ebmt_template$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 8223L)
    private static SubLSymbol $ignore_terms_pattern$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLSymbol $dtp_ebmt_template_parsing_info$;
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 43092L)
    private static SubLSymbol $ebmt_cycls_for_phrase_caching_state$;
    private static final SubLInteger $int0$30;
    private static final SubLSymbol $sym1$SEMTRANS_LEXICON;
    private static final SubLSymbol $sym2$SET_CASE_SENSITIVITY;
    private static final SubLSymbol $kw3$OFF;
    private static final SubLSymbol $sym4$GET;
    private static final SubLSymbol $sym5$LEX_ENTRY;
    private static final SubLSymbol $sym6$SET;
    private static final SubLSymbol $kw7$STRING;
    private static final SubLSymbol $sym8$ADD;
    private static final SubLSymbol $kw9$LEXICON;
    private static final SubLString $str10$No_word_linkage_found_for___S;
    private static final SubLString $str11$A_word_linkage_with_unknown_words;
    private static final SubLSymbol $sym12$FORGET;
    private static final SubLSymbol $kw13$CLEARED;
    private static final SubLSymbol $sym14$EBMT_TEMPLATE;
    private static final SubLSymbol $sym15$EBMT_TEMPLATE_P;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$PRINT_EBMT_TEMPLATE;
    private static final SubLSymbol $sym21$EBMT_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$EBMT_TEMPLATE_NL_CYCL_PAIR;
    private static final SubLSymbol $sym24$_CSETF_EBMT_TEMPLATE_NL_CYCL_PAIR;
    private static final SubLSymbol $sym25$EBMT_TEMPLATE_TYPE;
    private static final SubLSymbol $sym26$_CSETF_EBMT_TEMPLATE_TYPE;
    private static final SubLSymbol $sym27$EBMT_TEMPLATE_LINKS;
    private static final SubLSymbol $sym28$_CSETF_EBMT_TEMPLATE_LINKS;
    private static final SubLSymbol $sym29$EBMT_TEMPLATE_CYCL;
    private static final SubLSymbol $sym30$_CSETF_EBMT_TEMPLATE_CYCL;
    private static final SubLSymbol $sym31$EBMT_TEMPLATE_INDEXING_RESULT;
    private static final SubLSymbol $sym32$_CSETF_EBMT_TEMPLATE_INDEXING_RESULT;
    private static final SubLSymbol $sym33$EBMT_TEMPLATE_WEIGHT;
    private static final SubLSymbol $sym34$_CSETF_EBMT_TEMPLATE_WEIGHT;
    private static final SubLSymbol $kw35$NL_CYCL_PAIR;
    private static final SubLSymbol $kw36$TYPE;
    private static final SubLSymbol $kw37$LINKS;
    private static final SubLSymbol $kw38$CYCL;
    private static final SubLSymbol $kw39$INDEXING_RESULT;
    private static final SubLSymbol $kw40$WEIGHT;
    private static final SubLString $str41$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw42$BEGIN;
    private static final SubLSymbol $sym43$MAKE_EBMT_TEMPLATE;
    private static final SubLSymbol $kw44$SLOT;
    private static final SubLSymbol $kw45$END;
    private static final SubLSymbol $sym46$VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_METHOD;
    private static final SubLSymbol $sym47$_;
    private static final SubLString $str48$__TEMPLATE_____Words___S____Links;
    private static final SubLSymbol $kw49$UNINITIALIZED;
    private static final SubLString $str50$______________;
    private static final SubLString $str51$Unable_to_initialize__A__;
    private static final SubLString $str52$_;
    private static final SubLString $str53$_;
    private static final SubLSymbol $sym54$GET_INDEX;
    private static final SubLSymbol $sym55$GET_STRING;
    private static final SubLString $str56$IGNORE_;
    private static final SubLSymbol $sym57$LINKSET_LINK_P;
    private static final SubLSymbol $sym58$EBMT_LINK_NAME_ARGUMENT_P;
    private static final SubLSymbol $sym59$LINKS;
    private static final SubLSymbol $sym60$WORDS;
    private static final SubLString $str61$__A_Za_z0_9__;
    private static final SubLString $str62$___A_Za_z0_9_;
    private static final SubLString $str63$_b_;
    private static final SubLString $str64$__b;
    private static final SubLList $list65;
    private static final SubLString $str66$_VAR;
    private static final SubLSymbol $sym67$EL_VAR_;
    private static final SubLObject $const68$InferencePSC;
    private static final SubLSymbol $sym69$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str70$__;
    private static final SubLString $str71$_;
    private static final SubLSymbol $kw72$GENERAL;
    private static final SubLSymbol $kw73$SPECIFIC;
    private static final SubLSymbol $sym74$STRINGP;
    private static final SubLSymbol $sym75$CYCL_SENTENCE_P;
    private static final SubLString $str76$__NL___S__CycL____S___S__;
    private static final SubLSymbol $kw77$VAR;
    private static final SubLSymbol $sym78$KEYWORDP;
    private static final SubLSymbol $kw79$DEFAULT;
    private static final SubLString $str80$Unknown_EBMT_lexicon___S__;
    private static final SubLSymbol $kw81$APPEND;
    private static final SubLString $str82$Unable_to_open__S;
    private static final SubLString $str83$_A__A__;
    private static final SubLSymbol $kw84$INPUT;
    private static final SubLString $str85$__;
    private static final SubLString $str86$___;
    private static final SubLString $str87$_A_____S__;
    private static final SubLString $str88$Added;
    private static final SubLString $str89$_S__;
    private static final SubLString $str90$Found_;
    private static final SubLString $str91$_templates_for_linkset__;
    private static final SubLSymbol $kw92$DONE;
    private static final SubLString $str93$Deleted;
    private static final SubLString $str94$_A__;
    private static final SubLSymbol $kw95$JUSTIFICATION;
    private static final SubLSymbol $sym96$EBMT_TEMPLATE_PARSING_INFO;
    private static final SubLSymbol $sym97$EBMT_TEMPLATE_PARSING_INFO_P;
    private static final SubLList $list98;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$PRINT_EBMT_TEMPLATE_PARSING_INFO;
    private static final SubLSymbol $sym103$EBMT_TEMPLATE_PARSING_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS;
    private static final SubLSymbol $sym106$_CSETF_EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS;
    private static final SubLSymbol $sym107$EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS;
    private static final SubLSymbol $sym108$_CSETF_EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS;
    private static final SubLSymbol $sym109$EBMT_TEMPLATE_PARSING_INFO_LW;
    private static final SubLSymbol $sym110$_CSETF_EBMT_TEMPLATE_PARSING_INFO_LW;
    private static final SubLSymbol $sym111$EBMT_TEMPLATE_PARSING_INFO_PROCESSED;
    private static final SubLSymbol $sym112$_CSETF_EBMT_TEMPLATE_PARSING_INFO_PROCESSED;
    private static final SubLSymbol $sym113$EBMT_TEMPLATE_PARSING_INFO_CYCL;
    private static final SubLSymbol $sym114$_CSETF_EBMT_TEMPLATE_PARSING_INFO_CYCL;
    private static final SubLSymbol $kw115$KW_LW_PAIRS;
    private static final SubLSymbol $kw116$LW_LINKS_PAIRS;
    private static final SubLSymbol $kw117$LW;
    private static final SubLSymbol $kw118$PROCESSED;
    private static final SubLSymbol $sym119$MAKE_EBMT_TEMPLATE_PARSING_INFO;
    private static final SubLSymbol $sym120$VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_PARSING_INFO_METHOD;
    private static final SubLString $str121$__TEMPLATE_PARSING_INFO______Keyw;
    private static final SubLSymbol $sym122$GET_LINKS;
    private static final SubLSymbol $sym123$LINK_TUPLE_EQUAL;
    private static final SubLString $str124$a;
    private static final SubLString $str125$an;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$EBMT_CYCLS_FOR_PHRASE;
    private static final SubLList $list128;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$EQUALS_EL_;
    private static final SubLList $list131;
    private static final SubLSymbol $kw132$BEST_ONLY;
    private static final SubLObject $const133$familyName;
    private static final SubLObject $const134$PhraseFn;
    private static final SubLSymbol $sym135$_EBMT_CYCLS_FOR_PHRASE_CACHING_STATE_;
    private static final SubLInteger $int136$5000;
    private static final SubLObject $const137$ProperNoun;
    private static final SubLObject $const138$NounPhrase;
    private static final SubLSymbol $kw139$ANY;
    private static final SubLSymbol $sym140$PREPOSITION_LINK_WORD_P;
    private static final SubLSymbol $sym141$GET_MODIFIERS;
    private static final SubLSymbol $sym142$GET_LINK_WORD_ABS_INDEX;
    private static final SubLSymbol $sym143$GET_POS;
    private static final SubLSymbol $sym144$YIELD;
    private static final SubLSymbol $sym145$GET_CATEGORY;
    private static final SubLSymbol $sym146$GET_HEAD_DAUGHTER;
    private static final SubLString $str147$Unable_to_understand_some_of_the_;
    private static final SubLString $str148$No_matching_templates_found_;
    private static final SubLSymbol $sym149$SETS_EQUAL_;
    private static final SubLString $str150$Failed_to_compute_a_linkage_for__;
    private static final SubLSymbol $sym151$VALUES;
    private static final SubLString $str152$Wff_checking_rejected_all_cycl_;
    private static final SubLSymbol $kw153$FAILURE;
    private static final SubLSymbol $kw154$SUCCESS;
    private static final SubLString $str155$__Template_Parse_Result___S___S__;
    private static final SubLList $list156;
    private static final SubLInteger $int157$100;
    private static final SubLString $str158$Populating_EBMT_Template_Index___;
    private static final SubLObject $const159$AllEBMTTrainingExamplesCollectorM;
    private static final SubLList $list160;
    private static final SubLList $list161;
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 3480L)
    public static SubLObject new_ebmt_lexicon(SubLObject case_insensitiveP) {
        if (case_insensitiveP == ebmt_template_parser.UNPROVIDED) {
            case_insensitiveP = (SubLObject)ebmt_template_parser.NIL;
        }
        final SubLObject lexicon = object.new_class_instance((SubLObject)ebmt_template_parser.$sym1$SEMTRANS_LEXICON);
        if (ebmt_template_parser.NIL != case_insensitiveP) {
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)ebmt_template_parser.$sym2$SET_CASE_SENSITIVITY, (SubLObject)ebmt_template_parser.$kw3$OFF);
        }
        return lexicon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 3884L)
    public static SubLObject ebmt_linkage(SubLObject nl_sentence, final SubLObject lexicon, SubLObject error_if_word_linkage_failedP, SubLObject lex_strings) {
        if (error_if_word_linkage_failedP == ebmt_template_parser.UNPROVIDED) {
            error_if_word_linkage_failedP = (SubLObject)ebmt_template_parser.T;
        }
        if (lex_strings == ebmt_template_parser.UNPROVIDED) {
            lex_strings = (SubLObject)ebmt_template_parser.NIL;
        }
        nl_sentence = string_utilities.strip_sentential_punctuation(nl_sentence);
        SubLObject cdolist_list_var = lex_strings;
        SubLObject lex_string = (SubLObject)ebmt_template_parser.NIL;
        lex_string = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            if (ebmt_template_parser.NIL == methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)ebmt_template_parser.$sym4$GET, lex_string)) {
                final SubLObject lex_entry = object.new_class_instance((SubLObject)ebmt_template_parser.$sym5$LEX_ENTRY);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)ebmt_template_parser.$sym6$SET, (SubLObject)ebmt_template_parser.$kw7$STRING, lex_string);
                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)ebmt_template_parser.$sym8$ADD, lex_entry);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex_string = cdolist_list_var.first();
        }
        final SubLObject v_linkage = word_linkage.new_word_linkage(nl_sentence, (SubLObject)ConsesLow.list((SubLObject)ebmt_template_parser.$kw9$LEXICON, lexicon));
        if (ebmt_template_parser.NIL == v_linkage) {
            Errors.error((SubLObject)ebmt_template_parser.$str10$No_word_linkage_found_for___S, nl_sentence);
        }
        if (ebmt_template_parser.NIL != error_if_word_linkage_failedP && ebmt_template_parser.NIL != word_linkage.word_linkage_failedP(v_linkage, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
            Errors.error((SubLObject)ebmt_template_parser.$str11$A_word_linkage_with_unknown_words, nl_sentence);
        }
        methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)ebmt_template_parser.$sym12$FORGET);
        return v_linkage;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5173L)
    public static SubLObject ebmt_clear_caches() {
        clear_ebmt_cycls_for_phrase();
        return (SubLObject)ebmt_template_parser.$kw13$CLEARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject ebmt_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ebmt_template(v_object, stream, (SubLObject)ebmt_template_parser.ZERO_INTEGER);
        return (SubLObject)ebmt_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject ebmt_template_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ebmt_template_native.class) ? ebmt_template_parser.T : ebmt_template_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject ebmt_template_nl_cycl_pair(final SubLObject v_object) {
        assert ebmt_template_parser.NIL != ebmt_template_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject ebmt_template_type(final SubLObject v_object) {
        assert ebmt_template_parser.NIL != ebmt_template_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject ebmt_template_links(final SubLObject v_object) {
        assert ebmt_template_parser.NIL != ebmt_template_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject ebmt_template_cycl(final SubLObject v_object) {
        assert ebmt_template_parser.NIL != ebmt_template_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject ebmt_template_indexing_result(final SubLObject v_object) {
        assert ebmt_template_parser.NIL != ebmt_template_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject ebmt_template_weight(final SubLObject v_object) {
        assert ebmt_template_parser.NIL != ebmt_template_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject _csetf_ebmt_template_nl_cycl_pair(final SubLObject v_object, final SubLObject value) {
        assert ebmt_template_parser.NIL != ebmt_template_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject _csetf_ebmt_template_type(final SubLObject v_object, final SubLObject value) {
        assert ebmt_template_parser.NIL != ebmt_template_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject _csetf_ebmt_template_links(final SubLObject v_object, final SubLObject value) {
        assert ebmt_template_parser.NIL != ebmt_template_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject _csetf_ebmt_template_cycl(final SubLObject v_object, final SubLObject value) {
        assert ebmt_template_parser.NIL != ebmt_template_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject _csetf_ebmt_template_indexing_result(final SubLObject v_object, final SubLObject value) {
        assert ebmt_template_parser.NIL != ebmt_template_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject _csetf_ebmt_template_weight(final SubLObject v_object, final SubLObject value) {
        assert ebmt_template_parser.NIL != ebmt_template_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject make_ebmt_template(SubLObject arglist) {
        if (arglist == ebmt_template_parser.UNPROVIDED) {
            arglist = (SubLObject)ebmt_template_parser.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ebmt_template_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)ebmt_template_parser.NIL, next = arglist; ebmt_template_parser.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)ebmt_template_parser.$kw35$NL_CYCL_PAIR)) {
                _csetf_ebmt_template_nl_cycl_pair(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ebmt_template_parser.$kw36$TYPE)) {
                _csetf_ebmt_template_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ebmt_template_parser.$kw37$LINKS)) {
                _csetf_ebmt_template_links(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ebmt_template_parser.$kw38$CYCL)) {
                _csetf_ebmt_template_cycl(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ebmt_template_parser.$kw39$INDEXING_RESULT)) {
                _csetf_ebmt_template_indexing_result(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ebmt_template_parser.$kw40$WEIGHT)) {
                _csetf_ebmt_template_weight(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)ebmt_template_parser.$str41$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject visit_defstruct_ebmt_template(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw42$BEGIN, (SubLObject)ebmt_template_parser.$sym43$MAKE_EBMT_TEMPLATE, (SubLObject)ebmt_template_parser.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw44$SLOT, (SubLObject)ebmt_template_parser.$kw35$NL_CYCL_PAIR, ebmt_template_nl_cycl_pair(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw44$SLOT, (SubLObject)ebmt_template_parser.$kw36$TYPE, ebmt_template_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw44$SLOT, (SubLObject)ebmt_template_parser.$kw37$LINKS, ebmt_template_links(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw44$SLOT, (SubLObject)ebmt_template_parser.$kw38$CYCL, ebmt_template_cycl(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw44$SLOT, (SubLObject)ebmt_template_parser.$kw39$INDEXING_RESULT, ebmt_template_indexing_result(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw44$SLOT, (SubLObject)ebmt_template_parser.$kw40$WEIGHT, ebmt_template_weight(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw45$END, (SubLObject)ebmt_template_parser.$sym43$MAKE_EBMT_TEMPLATE, (SubLObject)ebmt_template_parser.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5260L)
    public static SubLObject visit_defstruct_object_ebmt_template_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ebmt_template(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 5662L)
    public static SubLObject new_ebmt_template(SubLObject nl_cycl_pair, SubLObject type, SubLObject links, SubLObject cycl, SubLObject indexing_result, SubLObject weight) {
        if (nl_cycl_pair == ebmt_template_parser.UNPROVIDED) {
            nl_cycl_pair = (SubLObject)ebmt_template_parser.NIL;
        }
        if (type == ebmt_template_parser.UNPROVIDED) {
            type = (SubLObject)ebmt_template_parser.NIL;
        }
        if (links == ebmt_template_parser.UNPROVIDED) {
            links = (SubLObject)ebmt_template_parser.NIL;
        }
        if (cycl == ebmt_template_parser.UNPROVIDED) {
            cycl = (SubLObject)ebmt_template_parser.NIL;
        }
        if (indexing_result == ebmt_template_parser.UNPROVIDED) {
            indexing_result = (SubLObject)ebmt_template_parser.NIL;
        }
        if (weight == ebmt_template_parser.UNPROVIDED) {
            weight = (SubLObject)ebmt_template_parser.NIL;
        }
        final SubLObject template = make_ebmt_template((SubLObject)ebmt_template_parser.UNPROVIDED);
        _csetf_ebmt_template_nl_cycl_pair(template, nl_cycl_pair);
        _csetf_ebmt_template_type(template, type);
        _csetf_ebmt_template_links(template, links);
        _csetf_ebmt_template_cycl(template, cycl);
        _csetf_ebmt_template_indexing_result(template, indexing_result);
        _csetf_ebmt_template_weight(template, weight);
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 6194L)
    public static SubLObject ebmt_template_words(final SubLObject template) {
        final SubLObject links = ebmt_template_links(template);
        SubLObject words = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = links;
        SubLObject link = (SubLObject)ebmt_template_parser.NIL;
        link = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            words = list_utilities.alist_enter(words, linkset_link_left_word_index(link), linkset_link_left_word_string(link), Symbols.symbol_function((SubLObject)ebmt_template_parser.EQ));
            words = list_utilities.alist_enter(words, linkset_link_right_word_index(link), linkset_link_right_word_string(link), Symbols.symbol_function((SubLObject)ebmt_template_parser.EQ));
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        words = list_utilities.sort_alist_by_keys(words, (SubLObject)ebmt_template_parser.$sym47$_);
        return list_utilities.alist_values(words);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 6861L)
    public static SubLObject print_ebmt_template(final SubLObject template, SubLObject stream, SubLObject depth) {
        if (stream == ebmt_template_parser.UNPROVIDED) {
            stream = (SubLObject)ebmt_template_parser.T;
        }
        if (depth == ebmt_template_parser.UNPROVIDED) {
            depth = (SubLObject)ebmt_template_parser.NIL;
        }
        PrintLow.format(stream, (SubLObject)ebmt_template_parser.$str48$__TEMPLATE_____Words___S____Links, new SubLObject[] { ebmt_template_words(template), ebmt_template_links(template), ebmt_template_cycl(template), ebmt_template_weight(template) });
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 7197L)
    public static SubLObject ebmt_template_justification(final SubLObject template) {
        return (SubLObject)ConsesLow.list(template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 7278L)
    public static SubLObject ebmt_linkage_and_mapped_terms(final SubLObject nl_sentence, final SubLObject cycl_sentence, final SubLObject lexicon, SubLObject error_if_linkage_incompleteP) {
        if (error_if_linkage_incompleteP == ebmt_template_parser.UNPROVIDED) {
            error_if_linkage_incompleteP = (SubLObject)ebmt_template_parser.T;
        }
        final SubLObject mapped_terms = query_sentence_lexifier.gtqs_find_term_glosses(cycl_sentence, nl_sentence);
        final SubLObject ignorable_terms = ebmt_ignorable_terms_in_training_string(nl_sentence);
        final SubLObject sentence_to_parse = ebmt_remove_ignore_markers(nl_sentence);
        return Values.values(ebmt_linkage(sentence_to_parse, lexicon, error_if_linkage_incompleteP, conses_high.union(list_utilities.alist_values(mapped_terms), ignorable_terms, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQUAL), (SubLObject)ebmt_template_parser.UNPROVIDED)), mapped_terms, ignorable_terms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 8223L)
    public static SubLObject ignore_terms_pattern() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ebmt_template_parser.$ignore_terms_pattern$.getDynamicValue(thread) == ebmt_template_parser.$kw49$UNINITIALIZED) {
            final SubLObject init_value = regular_expressions.compile_regular_expression((SubLObject)ebmt_template_parser.$str50$______________, (SubLObject)ebmt_template_parser.UNPROVIDED);
            if (init_value == ebmt_template_parser.$kw49$UNINITIALIZED) {
                Errors.error((SubLObject)ebmt_template_parser.$str51$Unable_to_initialize__A__, ebmt_template_parser.$ignore_terms_pattern$.getDynamicValue(thread));
            }
            ebmt_template_parser.$ignore_terms_pattern$.setDynamicValue(init_value, thread);
        }
        return ebmt_template_parser.$ignore_terms_pattern$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 8680L)
    public static SubLObject ebmt_ignorable_terms_in_training_string(final SubLObject string) {
        final SubLObject pattern = ignore_terms_pattern();
        return regular_expression_utilities.find_all_captured_matches_for_pattern(pattern, string, (SubLObject)ebmt_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 8860L)
    public static SubLObject ebmt_remove_ignore_markers(final SubLObject string) {
        return string_utilities.remove_substring(string_utilities.remove_substring(string, (SubLObject)ebmt_template_parser.$str52$_), (SubLObject)ebmt_template_parser.$str53$_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 8977L)
    public static SubLObject ebmt_linkset_from_linkage_links(final SubLObject links, SubLObject nl_term_vars) {
        if (nl_term_vars == ebmt_template_parser.UNPROVIDED) {
            nl_term_vars = (SubLObject)ebmt_template_parser.NIL;
        }
        SubLObject linkset = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = links;
        SubLObject link = (SubLObject)ebmt_template_parser.NIL;
        link = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            if (ebmt_template_parser.NIL == linkage.link_contains_wall_word_linkage_wordP(link) && ebmt_template_parser.NIL == linkage.link_contains_wall_link_wordP(link)) {
                final SubLObject left_link_word = linkage.link_left_word(link);
                final SubLObject left_link_word_index = methods.funcall_instance_method_with_0_args(left_link_word, (SubLObject)ebmt_template_parser.$sym54$GET_INDEX);
                SubLObject left_word = (SubLObject)((ebmt_template_parser.NIL != left_link_word) ? methods.funcall_instance_method_with_0_args(left_link_word, (SubLObject)ebmt_template_parser.$sym55$GET_STRING) : ebmt_template_parser.NIL);
                final SubLObject right_link_word = linkage.link_right_word(link);
                final SubLObject right_link_word_index = methods.funcall_instance_method_with_0_args(right_link_word, (SubLObject)ebmt_template_parser.$sym54$GET_INDEX);
                SubLObject right_word = (SubLObject)((ebmt_template_parser.NIL != right_link_word) ? methods.funcall_instance_method_with_0_args(right_link_word, (SubLObject)ebmt_template_parser.$sym55$GET_STRING) : ebmt_template_parser.NIL);
                if (ebmt_template_parser.NIL != nl_term_vars) {
                    left_word = list_utilities.alist_lookup_without_values(nl_term_vars, left_word, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQUAL), left_word);
                    right_word = list_utilities.alist_lookup_without_values(nl_term_vars, right_word, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQUAL), right_word);
                }
                if ((!left_word.isSymbol() || ebmt_template_parser.NIL == string_utilities.starts_with(Symbols.symbol_name(left_word), (SubLObject)ebmt_template_parser.$str56$IGNORE_)) && (!right_word.isSymbol() || ebmt_template_parser.NIL == string_utilities.starts_with(Symbols.symbol_name(right_word), (SubLObject)ebmt_template_parser.$str56$IGNORE_))) {
                    final SubLObject item_var = new_linkset((SubLObject)ConsesLow.list(left_word, left_link_word_index), ebmt_link_name(link), (SubLObject)ConsesLow.list(right_word, right_link_word_index));
                    if (ebmt_template_parser.NIL == conses_high.member(item_var, linkset, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQUAL), Symbols.symbol_function((SubLObject)ebmt_template_parser.IDENTITY))) {
                        linkset = (SubLObject)ConsesLow.cons(item_var, linkset);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        return Sequences.nreverse(linkset);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 10534L)
    public static SubLObject linkset_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isList() && ebmt_template_parser.NIL != list_utilities.every_in_list((SubLObject)ebmt_template_parser.$sym57$LINKSET_LINK_P, obj, (SubLObject)ebmt_template_parser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 10637L)
    public static SubLObject linkset_link_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isList() && ebmt_template_parser.NIL != list_utilities.lengthE(obj, (SubLObject)ebmt_template_parser.THREE_INTEGER, (SubLObject)ebmt_template_parser.UNPROVIDED) && conses_high.second(obj).isString() && obj.first().isList() && conses_high.third(obj).isList() && linkset_link_left_word_string(obj).isString() && linkset_link_right_word_string(obj).isString() && linkset_link_left_word_index(obj).isInteger() && linkset_link_right_word_index(obj).isInteger());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11016L)
    public static SubLObject ebmt_link_name_argument_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(ebmt_template_parser.NIL != Characters.lower_case_p(v_char) || v_char.equal((SubLObject)Characters.CHAR_asterisk) || v_char.equal((SubLObject)Characters.CHAR_hash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11145L)
    public static SubLObject ebmt_link_name(final SubLObject link) {
        final SubLObject link_name = linkage.link_name(link);
        final SubLObject ebmt_link_name = Sequences.remove_if(Symbols.symbol_function((SubLObject)ebmt_template_parser.$sym58$EBMT_LINK_NAME_ARGUMENT_P), link_name, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
        return ebmt_link_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11414L)
    public static SubLObject new_linkset(final SubLObject left_link_word_and_index, final SubLObject link_name, final SubLObject right_link_word_and_index) {
        return (SubLObject)ConsesLow.list(left_link_word_and_index, link_name, right_link_word_and_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11584L)
    public static SubLObject get_linkset_unindexed_links(final SubLObject linkset) {
        SubLObject unindexed_links = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = linkset;
        SubLObject link = (SubLObject)ebmt_template_parser.NIL;
        link = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            unindexed_links = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(link.first().first(), conses_high.second(link), conses_high.third(link).first()), unindexed_links);
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        return unindexed_links;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11817L)
    public static SubLObject get_linkset_indexed_links(final SubLObject linkset) {
        return linkset;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11887L)
    public static SubLObject linkset_link_name(final SubLObject linkset_link) {
        return conses_high.second(linkset_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 11968L)
    public static SubLObject linkset_link_left_word(final SubLObject link) {
        return link.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 12037L)
    public static SubLObject linkset_link_left_word_string(final SubLObject link) {
        return link.first().first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 12121L)
    public static SubLObject linkset_link_left_word_index(final SubLObject link) {
        return conses_high.second(link.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 12205L)
    public static SubLObject linkset_link_right_word(final SubLObject link) {
        return conses_high.third(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 12275L)
    public static SubLObject linkset_link_right_word_string(final SubLObject link) {
        return conses_high.third(link).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 12360L)
    public static SubLObject linkset_link_right_word_index(final SubLObject link) {
        return conses_high.second(conses_high.third(link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 12445L)
    public static SubLObject ebmt_linkset(final SubLObject v_linkage, SubLObject nl_term_vars) {
        if (nl_term_vars == ebmt_template_parser.UNPROVIDED) {
            nl_term_vars = (SubLObject)ebmt_template_parser.NIL;
        }
        return ebmt_linkset_from_linkage_links(Sequences.remove((SubLObject)ebmt_template_parser.NIL, vector_utilities.vector_elements(instances.get_slot(v_linkage, (SubLObject)ebmt_template_parser.$sym59$LINKS), (SubLObject)ebmt_template_parser.UNPROVIDED), (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED), nl_term_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 13088L)
    public static SubLObject ebmt_cycl_with_vars(SubLObject cycl, final SubLObject cycl_term_vars) {
        SubLObject cdolist_list_var = cycl_term_vars;
        SubLObject cycl_term_var = (SubLObject)ebmt_template_parser.NIL;
        cycl_term_var = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            final SubLObject v_term = cycl_term_var.first();
            final SubLObject var = cycl_term_var.rest();
            cycl = cycl_utilities.expression_nsubst(var, v_term, cycl, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQUAL), (SubLObject)ebmt_template_parser.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cycl_term_var = cdolist_list_var.first();
        }
        return cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 13742L)
    public static SubLObject ebmt_link_word(final SubLObject word, final SubLObject v_linkage) {
        SubLObject linkword = (SubLObject)ebmt_template_parser.NIL;
        final SubLObject vector_var = instances.get_slot(v_linkage, (SubLObject)ebmt_template_parser.$sym60$WORDS);
        final SubLObject backwardP_var = (SubLObject)ebmt_template_parser.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        SubLObject lw_string;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)ebmt_template_parser.NIL, v_iteration = (SubLObject)ebmt_template_parser.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)ebmt_template_parser.ONE_INTEGER)) {
            element_num = ((ebmt_template_parser.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)ebmt_template_parser.ONE_INTEGER) : v_iteration);
            w = (linkword = Vectors.aref(vector_var, element_num));
            lw_string = methods.funcall_instance_method_with_0_args(linkword, (SubLObject)ebmt_template_parser.$sym55$GET_STRING);
            if (Strings.string_downcase(word, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED).equal(Strings.string_downcase(lw_string, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED))) {
                return lw_string;
            }
        }
        return (SubLObject)ebmt_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 14170L)
    public static SubLObject ebmt_lw_offsets(final SubLObject lw_string, final SubLObject string) {
        final SubLObject lw_string_with_escaped_chars = regular_expression_utilities.escape_regex_special_chars(lw_string);
        SubLObject cdolist_list_var;
        final SubLObject lw_regexes = cdolist_list_var = (SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)ebmt_template_parser.$str61$__A_Za_z0_9__, new SubLObject[] { format_nil.format_nil_a_no_copy(lw_string_with_escaped_chars), ebmt_template_parser.$str62$___A_Za_z0_9_ }), Sequences.cconcatenate((SubLObject)ebmt_template_parser.$str63$_b_, new SubLObject[] { format_nil.format_nil_a_no_copy(lw_string_with_escaped_chars), ebmt_template_parser.$str62$___A_Za_z0_9_ }), Sequences.cconcatenate((SubLObject)ebmt_template_parser.$str61$__A_Za_z0_9__, new SubLObject[] { format_nil.format_nil_a_no_copy(lw_string_with_escaped_chars), ebmt_template_parser.$str64$__b }), Sequences.cconcatenate((SubLObject)ebmt_template_parser.$str63$_b_, new SubLObject[] { format_nil.format_nil_a_no_copy(lw_string_with_escaped_chars), ebmt_template_parser.$str64$__b }));
        SubLObject lw_regex = (SubLObject)ebmt_template_parser.NIL;
        lw_regex = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            final SubLObject lw_offsets = list_utilities.alist_keys(regular_expression_utilities.offsets_of_regex_capturing_matches(lw_regex, string, (SubLObject)ebmt_template_parser.$list65, (SubLObject)ebmt_template_parser.UNPROVIDED));
            if (ebmt_template_parser.NIL != lw_offsets) {
                return lw_offsets;
            }
            cdolist_list_var = cdolist_list_var.rest();
            lw_regex = cdolist_list_var.first();
        }
        return (SubLObject)ebmt_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 15034L)
    public static SubLObject ebmt_mapped_term_vars(final SubLObject english, final SubLObject cycl, final SubLObject mapped_terms, final SubLObject v_linkage, SubLObject allow_multiple_matchesP) {
        if (allow_multiple_matchesP == ebmt_template_parser.UNPROVIDED) {
            allow_multiple_matchesP = (SubLObject)ebmt_template_parser.NIL;
        }
        SubLObject keyword_counter = (SubLObject)ebmt_template_parser.ONE_INTEGER;
        SubLObject cycl_term_vars = (SubLObject)ebmt_template_parser.NIL;
        SubLObject nl_term_vars = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = conses_high.copy_list(mapped_terms);
        SubLObject mapped_term = (SubLObject)ebmt_template_parser.NIL;
        mapped_term = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            final SubLObject cycl_term = mapped_term.first();
            final SubLObject english_term = mapped_term.rest();
            final SubLObject linkword_english_term = ebmt_link_word(english_term, v_linkage);
            if (ebmt_template_parser.NIL != linkword_english_term) {
                final SubLObject english_term_positions = ebmt_lw_offsets(linkword_english_term, english);
                final SubLObject cycl_term_positions = cycl_utilities.arg_positions_dfs(cycl_term, cycl, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQUAL));
                if (ebmt_template_parser.NIL != english_term_positions && ebmt_template_parser.NIL != cycl_term_positions && (ebmt_template_parser.NIL != allow_multiple_matchesP || ebmt_template_parser.NIL != list_utilities.singletonP(english_term_positions)) && (ebmt_template_parser.NIL != allow_multiple_matchesP || ebmt_template_parser.NIL != list_utilities.singletonP(cycl_term_positions))) {
                    final SubLObject keyword_var = reader.read_from_string(Sequences.cconcatenate((SubLObject)ebmt_template_parser.$str66$_VAR, format_nil.format_nil_a_no_copy(keyword_counter)), (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
                    cycl_term_vars = conses_high.acons(cycl_term, keyword_var, cycl_term_vars);
                    nl_term_vars = conses_high.acons(linkword_english_term, keyword_var, nl_term_vars);
                    keyword_counter = number_utilities.f_1X(keyword_counter);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapped_term = cdolist_list_var.first();
        }
        return Values.values(cycl_term_vars, nl_term_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 17136L)
    public static SubLObject ebmt_canonicalize_el_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject el = (SubLObject)ebmt_template_parser.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$canonicalize_tensed_literalsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = czer_vars.$add_term_of_unit_litsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = czer_vars.$turn_existentials_into_skolemsP$.currentBinding(thread);
        try {
            czer_vars.$expand_el_relationsP$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            czer_vars.$canonicalize_tensed_literalsP$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            czer_vars.$add_term_of_unit_litsP$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            czer_vars.$turn_existentials_into_skolemsP$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            final SubLObject hl = czer_main.el_to_hl(sentence, mt);
            el = uncanonicalizer.cnfs_el_formula(czer_utilities.extract_el_clauses(hl), (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
            SubLObject list_var = (SubLObject)ebmt_template_parser.NIL;
            SubLObject el_var = (SubLObject)ebmt_template_parser.NIL;
            SubLObject num = (SubLObject)ebmt_template_parser.NIL;
            list_var = list_utilities.delete_duplicates_from_start(cycl_utilities.expression_gather_with_duplicates(el, (SubLObject)ebmt_template_parser.$sym67$EL_VAR_, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED), (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
            el_var = list_var.first();
            for (num = (SubLObject)ebmt_template_parser.ZERO_INTEGER; ebmt_template_parser.NIL != list_var; list_var = list_var.rest(), el_var = list_var.first(), num = Numbers.add((SubLObject)ebmt_template_parser.ONE_INTEGER, num)) {
                el = cycl_utilities.expression_subst(variables.get_default_el_var(num), el_var, el, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
            }
        }
        finally {
            czer_vars.$turn_existentials_into_skolemsP$.rebind(_prev_bind_4, thread);
            czer_vars.$add_term_of_unit_litsP$.rebind(_prev_bind_3, thread);
            czer_vars.$canonicalize_tensed_literalsP$.rebind(_prev_bind_2, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_0, thread);
        }
        return el;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 17810L)
    public static SubLObject ebmt_create_template(final SubLObject english, final SubLObject cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = new_ebmt_lexicon((SubLObject)ebmt_template_parser.UNPROVIDED);
        }
        if (allow_multiple_matchesP == ebmt_template_parser.UNPROVIDED) {
            allow_multiple_matchesP = (SubLObject)ebmt_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canonical_cycl = ebmt_canonicalize_el_sentence(cycl, ebmt_template_parser.$const68$InferencePSC);
        SubLObject err_msg = (SubLObject)ebmt_template_parser.NIL;
        SubLObject v_linkage = (SubLObject)ebmt_template_parser.NIL;
        SubLObject mapped_terms = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cycl_term_vars = (SubLObject)ebmt_template_parser.NIL;
        SubLObject nl_term_vars = (SubLObject)ebmt_template_parser.NIL;
        SubLObject ignorable_strings = (SubLObject)ebmt_template_parser.NIL;
        SubLObject template = (SubLObject)ebmt_template_parser.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)ebmt_template_parser.$sym69$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject v_linkage_$1 = ebmt_linkage_and_mapped_terms(english, canonical_cycl, lexicon, (SubLObject)ebmt_template_parser.UNPROVIDED);
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
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)ebmt_template_parser.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (ebmt_template_parser.NIL != err_msg) {
            Errors.warn(string_utilities.string_subst((SubLObject)ebmt_template_parser.$str70$__, (SubLObject)ebmt_template_parser.$str71$_, err_msg, (SubLObject)ebmt_template_parser.UNPROVIDED));
            return (SubLObject)ebmt_template_parser.NIL;
        }
        SubLObject list_var = (SubLObject)ebmt_template_parser.NIL;
        SubLObject ignorable_string = (SubLObject)ebmt_template_parser.NIL;
        SubLObject num = (SubLObject)ebmt_template_parser.NIL;
        list_var = ignorable_strings;
        ignorable_string = list_var.first();
        for (num = (SubLObject)ebmt_template_parser.ZERO_INTEGER; ebmt_template_parser.NIL != list_var; list_var = list_var.rest(), ignorable_string = list_var.first(), num = Numbers.add((SubLObject)ebmt_template_parser.ONE_INTEGER, num)) {
            final SubLObject keyword = Symbols.make_keyword(Sequences.cconcatenate((SubLObject)ebmt_template_parser.$str56$IGNORE_, format_nil.format_nil_s_no_copy(num)));
            nl_term_vars = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(ignorable_string, keyword), nl_term_vars);
        }
        template = new_ebmt_template((SubLObject)ConsesLow.list(english, cycl), (SubLObject)((ebmt_template_parser.NIL != cycl_term_vars) ? ebmt_template_parser.$kw72$GENERAL : ebmt_template_parser.$kw73$SPECIFIC), ebmt_linkset(v_linkage, nl_term_vars), (ebmt_template_parser.NIL != cycl_term_vars) ? ebmt_cycl_with_vars(el_utilities.copy_expression(canonical_cycl), cycl_term_vars) : canonical_cycl, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 19203L)
    public static SubLObject ebmt_create_all_possible_training_examples(final SubLObject nl, final SubLObject cycl) {
        assert ebmt_template_parser.NIL != Types.stringp(nl) : nl;
        assert ebmt_template_parser.NIL != cycl_grammar.cycl_sentence_p(cycl) : cycl;
        SubLObject nl_cycl_pairs = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(nl, cycl));
        final SubLObject ignorable_strings = ebmt_ignorable_terms_in_training_string(nl);
        if (ebmt_template_parser.NIL != ignorable_strings) {
            SubLObject new_nl = ebmt_remove_ignore_markers(nl);
            SubLObject cdolist_list_var = ignorable_strings;
            SubLObject ignorable_term = (SubLObject)ebmt_template_parser.NIL;
            ignorable_term = cdolist_list_var.first();
            while (ebmt_template_parser.NIL != cdolist_list_var) {
                new_nl = string_utilities.remove_substring(new_nl, ignorable_term);
                cdolist_list_var = cdolist_list_var.rest();
                ignorable_term = cdolist_list_var.first();
            }
            final SubLObject item_var = (SubLObject)ConsesLow.list(new_nl, cycl);
            if (ebmt_template_parser.NIL == conses_high.member(item_var, nl_cycl_pairs, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQUAL), Symbols.symbol_function((SubLObject)ebmt_template_parser.IDENTITY))) {
                nl_cycl_pairs = (SubLObject)ConsesLow.cons(item_var, nl_cycl_pairs);
            }
        }
        return nl_cycl_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 19926L)
    public static SubLObject ebmt_create_templates(final SubLObject nl, final SubLObject cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = new_ebmt_lexicon((SubLObject)ebmt_template_parser.UNPROVIDED);
        }
        if (allow_multiple_matchesP == ebmt_template_parser.UNPROVIDED) {
            allow_multiple_matchesP = (SubLObject)ebmt_template_parser.NIL;
        }
        if (verboseP == ebmt_template_parser.UNPROVIDED) {
            verboseP = (SubLObject)ebmt_template_parser.NIL;
        }
        assert ebmt_template_parser.NIL != Types.stringp(nl) : nl;
        assert ebmt_template_parser.NIL != cycl_grammar.cycl_sentence_p(cycl) : cycl;
        final SubLObject nl_cycl_pairs = ebmt_create_all_possible_training_examples(nl, cycl);
        SubLObject templates = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = nl_cycl_pairs;
        SubLObject nl_cycl_pair = (SubLObject)ebmt_template_parser.NIL;
        nl_cycl_pair = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            final SubLObject nl_sent = nl_cycl_pair.first();
            final SubLObject cycl_sent = conses_high.second(nl_cycl_pair);
            final SubLObject template = ebmt_create_template(nl_sent, cycl_sent, lexicon, allow_multiple_matchesP);
            if (ebmt_template_parser.NIL != template) {
                templates = (SubLObject)ConsesLow.cons(template, templates);
            }
            if (ebmt_template_parser.NIL != verboseP) {
                PrintLow.format((SubLObject)ebmt_template_parser.T, (SubLObject)ebmt_template_parser.$str76$__NL___S__CycL____S___S__, new SubLObject[] { nl_sent, cycl_sent, template });
            }
            cdolist_list_var = cdolist_list_var.rest();
            nl_cycl_pair = cdolist_list_var.first();
        }
        return templates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 20796L)
    public static SubLObject ebmt_stringify_list(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = (SubLObject)ebmt_template_parser.NIL;
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            string = format_nil.format_nil_s(list);
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        string = string_utilities.strip_first(string);
        string = string_utilities.strip_final(string, (SubLObject)ebmt_template_parser.UNPROVIDED);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 21230L)
    public static SubLObject ebmt_linkset_string(final SubLObject links, SubLObject with_varsP) {
        if (with_varsP == ebmt_template_parser.UNPROVIDED) {
            with_varsP = (SubLObject)ebmt_template_parser.NIL;
        }
        SubLObject result_links = links;
        if (ebmt_template_parser.NIL != with_varsP) {
            SubLObject cdolist_list_var = links;
            SubLObject link = (SubLObject)ebmt_template_parser.NIL;
            link = cdolist_list_var.first();
            while (ebmt_template_parser.NIL != cdolist_list_var) {
                SubLObject item_var;
                final SubLObject link_first_replaced = item_var = list_utilities.replace_nth((SubLObject)ebmt_template_parser.ZERO_INTEGER, (SubLObject)ebmt_template_parser.$kw77$VAR, link);
                if (ebmt_template_parser.NIL == conses_high.member(item_var, result_links, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.IDENTITY))) {
                    result_links = (SubLObject)ConsesLow.cons(item_var, result_links);
                }
                item_var = list_utilities.replace_last(link, (SubLObject)ebmt_template_parser.$kw77$VAR);
                if (ebmt_template_parser.NIL == conses_high.member(item_var, result_links, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.IDENTITY))) {
                    result_links = (SubLObject)ConsesLow.cons(item_var, result_links);
                }
                item_var = list_utilities.replace_last(link_first_replaced, (SubLObject)ebmt_template_parser.$kw77$VAR);
                if (ebmt_template_parser.NIL == conses_high.member(item_var, result_links, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.IDENTITY))) {
                    result_links = (SubLObject)ConsesLow.cons(item_var, result_links);
                }
                cdolist_list_var = cdolist_list_var.rest();
                link = cdolist_list_var.first();
            }
        }
        return ebmt_stringify_list(result_links);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 22310L)
    public static SubLObject ebmt_index_template_input(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template_links = ebmt_template_links(template);
        SubLObject template_string = (SubLObject)ebmt_template_parser.NIL;
        if (ebmt_template_type(template) == ebmt_template_parser.$kw72$GENERAL) {
            SubLObject links = (SubLObject)ebmt_template_parser.NIL;
            SubLObject cdolist_list_var = template_links;
            SubLObject link = (SubLObject)ebmt_template_parser.NIL;
            link = cdolist_list_var.first();
            while (ebmt_template_parser.NIL != cdolist_list_var) {
                link = conses_high.subst_if((SubLObject)ebmt_template_parser.$kw77$VAR, (SubLObject)ebmt_template_parser.$sym78$KEYWORDP, link, (SubLObject)ebmt_template_parser.UNPROVIDED);
                links = (SubLObject)ConsesLow.cons(link, links);
                cdolist_list_var = cdolist_list_var.rest();
                link = cdolist_list_var.first();
            }
            template_links = Sequences.nreverse(links);
        }
        template_string = ebmt_stringify_list(get_linkset_unindexed_links(template_links));
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            template_string = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(template_string), new SubLObject[] { format_nil.$format_nil_tilde$.getGlobalValue(), format_nil.format_nil_s_no_copy((SubLObject)ConsesLow.list(get_linkset_unindexed_links(ebmt_template_links(template)), ebmt_template_cycl(template), get_linkset_indexed_links(ebmt_template_links(template)))) });
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return template_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 23703L)
    public static SubLObject ebmt_template_index_server_info(SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        lexicon = (SubLObject)ebmt_template_parser.$kw79$DEFAULT;
        SubLObject host = (SubLObject)ebmt_template_parser.NIL;
        SubLObject port = (SubLObject)ebmt_template_parser.NIL;
        SubLObject content = (SubLObject)ebmt_template_parser.NIL;
        SubLObject log = (SubLObject)ebmt_template_parser.NIL;
        final SubLObject pcase_var = lexicon;
        if (pcase_var.eql((SubLObject)ebmt_template_parser.$kw79$DEFAULT)) {
            host = lucene_index.$ebmt_index_host$.getDynamicValue(thread);
            port = lucene_index.$ebmt_index_port$.getDynamicValue(thread);
            content = lucene_index.$ebmt_index_content$.getDynamicValue(thread);
            log = lucene_index.$ebmt_index_log$.getDynamicValue(thread);
        }
        else {
            Errors.error((SubLObject)ebmt_template_parser.$str80$Unknown_EBMT_lexicon___S__, lexicon);
        }
        return Values.values(host, port, content, log);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 24624L)
    public static SubLObject ebmt_update_log(final SubLObject log, final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            SubLObject stream = (SubLObject)ebmt_template_parser.NIL;
            try {
                stream = compatibility.open_text(log, (SubLObject)ebmt_template_parser.$kw81$APPEND);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)ebmt_template_parser.$str82$Unable_to_open__S, log);
                }
                final SubLObject s_out = stream;
                PrintLow.format(s_out, (SubLObject)ebmt_template_parser.$str83$_A__A__, numeric_date_utilities.universal_timestring((SubLObject)ebmt_template_parser.UNPROVIDED), message);
            }
            finally {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_template_parser.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)ebmt_template_parser.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return log;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 24868L)
    public static SubLObject ebmt_delete_example_from_file(final SubLObject file, final SubLObject example) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            final SubLObject example_string = format_nil.format_nil_s(example);
            SubLObject new_lines = (SubLObject)ebmt_template_parser.NIL;
            SubLObject stream = (SubLObject)ebmt_template_parser.NIL;
            try {
                final SubLObject _prev_bind_0_$7 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)ebmt_template_parser.NIL, thread);
                    stream = compatibility.open_text(file, (SubLObject)ebmt_template_parser.$kw84$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$7, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)ebmt_template_parser.$str82$Unable_to_open__S, file);
                }
                final SubLObject infile = stream;
                if (infile.isStream()) {
                    SubLObject line;
                    for (line = (SubLObject)ebmt_template_parser.NIL, line = file_utilities.cdolines_get_next_line(infile); ebmt_template_parser.NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                        if (!line.equal(example_string)) {
                            new_lines = (SubLObject)ConsesLow.cons(line, new_lines);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_template_parser.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)ebmt_template_parser.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
            file_utilities.output_text_file(file, new_lines, (SubLObject)ebmt_template_parser.UNPROVIDED);
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 25258L)
    public static SubLObject ebmt_index_template_int(final SubLObject template, final SubLObject host, final SubLObject port) {
        return (SubLObject)ebmt_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 25439L)
    public static SubLObject ebmt_index_template(final SubLObject template, SubLObject lexicon, SubLObject verboseP) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = (SubLObject)ebmt_template_parser.NIL;
        }
        if (verboseP == ebmt_template_parser.UNPROVIDED) {
            verboseP = (SubLObject)ebmt_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ebmt_template_parser.NIL != ebmt_template_p(template) : template;
        SubLObject result = (SubLObject)ebmt_template_parser.NIL;
        thread.resetMultipleValues();
        final SubLObject host = ebmt_template_index_server_info(lexicon);
        final SubLObject port = thread.secondMultipleValue();
        final SubLObject content = thread.thirdMultipleValue();
        final SubLObject log = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        result = ebmt_index_template_int(template, host, port);
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            final SubLObject nl_cycl_pair = ebmt_template_nl_cycl_pair(template);
            final SubLObject log_message = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(result), new SubLObject[] { ebmt_template_parser.$str85$__, format_nil.format_nil_a_no_copy(ebmt_template_type(template)), ebmt_template_parser.$str86$___, format_nil.format_nil_s_no_copy(nl_cycl_pair) });
            if (ebmt_template_parser.NIL != verboseP) {
                PrintLow.format((SubLObject)ebmt_template_parser.T, (SubLObject)ebmt_template_parser.$str87$_A_____S__, result, template);
            }
            ebmt_update_log(log, log_message);
            if (ebmt_template_parser.NIL != nl_cycl_pair && result.equal((SubLObject)ebmt_template_parser.$str88$Added)) {
                SubLObject stream = (SubLObject)ebmt_template_parser.NIL;
                try {
                    stream = compatibility.open_text(content, (SubLObject)ebmt_template_parser.$kw81$APPEND);
                    if (!stream.isStream()) {
                        Errors.error((SubLObject)ebmt_template_parser.$str82$Unable_to_open__S, content);
                    }
                    final SubLObject s_out = stream;
                    PrintLow.format(s_out, (SubLObject)ebmt_template_parser.$str89$_S__, nl_cycl_pair);
                }
                finally {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_template_parser.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (stream.isStream()) {
                            streams_high.close(stream, (SubLObject)ebmt_template_parser.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 26242L)
    public static SubLObject ebmt_create_and_add_templates(final SubLObject nl, final SubLObject cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = new_ebmt_lexicon((SubLObject)ebmt_template_parser.UNPROVIDED);
        }
        if (allow_multiple_matchesP == ebmt_template_parser.UNPROVIDED) {
            allow_multiple_matchesP = (SubLObject)ebmt_template_parser.NIL;
        }
        if (verboseP == ebmt_template_parser.UNPROVIDED) {
            verboseP = (SubLObject)ebmt_template_parser.NIL;
        }
        assert ebmt_template_parser.NIL != Types.stringp(nl) : nl;
        assert ebmt_template_parser.NIL != cycl_grammar.cycl_sentence_p(cycl) : cycl;
        SubLObject cdolist_list_var;
        final SubLObject templates = cdolist_list_var = ebmt_create_templates(nl, cycl, lexicon, allow_multiple_matchesP, verboseP);
        SubLObject template = (SubLObject)ebmt_template_parser.NIL;
        template = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            _csetf_ebmt_template_indexing_result(template, ebmt_index_template(template, lexicon, verboseP));
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        }
        return templates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 26823L)
    public static SubLObject ebmt_find_templates_for_linkage(final SubLObject v_linkage, final SubLObject with_varsP, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject links = get_linkset_unindexed_links(ebmt_linkset(v_linkage, (SubLObject)ebmt_template_parser.UNPROVIDED));
        final SubLObject linkage_string = ebmt_linkset_string(links, with_varsP);
        SubLObject templates = (SubLObject)ebmt_template_parser.NIL;
        thread.resetMultipleValues();
        final SubLObject host = ebmt_template_index_server_info(lexicon);
        final SubLObject port = thread.secondMultipleValue();
        final SubLObject content = thread.thirdMultipleValue();
        final SubLObject log = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        templates = (SubLObject)ebmt_template_parser.NIL;
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            final SubLObject log_message = Sequences.cconcatenate((SubLObject)ebmt_template_parser.$str90$Found_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(templates)), ebmt_template_parser.$str91$_templates_for_linkset__, format_nil.format_nil_s_no_copy(linkage_string) });
            ebmt_update_log(log, log_message);
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return templates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 27541L)
    public static SubLObject ebmt_find_templates(final SubLObject sent, SubLObject lexicon) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = new_ebmt_lexicon((SubLObject)ebmt_template_parser.UNPROVIDED);
        }
        assert ebmt_template_parser.NIL != Types.stringp(sent) : sent;
        final SubLObject v_linkage = linkage.new_linkage(string_utilities.strip_sentential_punctuation(sent), (SubLObject)ConsesLow.list((SubLObject)ebmt_template_parser.$kw9$LEXICON, lexicon));
        return ebmt_find_templates_for_linkage(v_linkage, (SubLObject)ebmt_template_parser.T, lexicon);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 27891L)
    public static SubLObject ebmt_delete_template_int(final SubLObject template, final SubLObject host, final SubLObject port) {
        return (SubLObject)ebmt_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 28084L)
    public static SubLObject ebmt_delete_template(final SubLObject template, SubLObject lexicon) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = (SubLObject)ebmt_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ebmt_template_parser.NIL != ebmt_template_p(template) : template;
        thread.resetMultipleValues();
        final SubLObject host = ebmt_template_index_server_info(lexicon);
        final SubLObject port = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ebmt_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 28396L)
    public static SubLObject ebmt_delete_template_using_template_string(final SubLObject template_string, SubLObject lexicon) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = (SubLObject)ebmt_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ebmt_template_parser.NIL != Types.stringp(template_string) : template_string;
        thread.resetMultipleValues();
        final SubLObject host = ebmt_template_index_server_info(lexicon);
        final SubLObject port = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ebmt_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 28780L)
    public static SubLObject ebmt_delete_template_using_parse(final SubLObject nl_sent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject interps = ebmt_parse(nl_sent, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
        final SubLObject justs = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = justs;
        SubLObject just = (SubLObject)ebmt_template_parser.NIL;
        just = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10 = just;
            SubLObject just_item = (SubLObject)ebmt_template_parser.NIL;
            just_item = cdolist_list_var_$10.first();
            while (ebmt_template_parser.NIL != cdolist_list_var_$10) {
                if (ebmt_template_parser.NIL != ebmt_template_p(just_item)) {
                    ebmt_delete_template(just_item, (SubLObject)ebmt_template_parser.UNPROVIDED);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                just_item = cdolist_list_var_$10.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            just = cdolist_list_var.first();
        }
        return (SubLObject)ebmt_template_parser.$kw92$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 29195L)
    public static SubLObject ebmt_delete_templates_using_example(final SubLObject nl_sent, final SubLObject cycl_sent, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = (SubLObject)ebmt_template_parser.NIL;
        }
        if (allow_multiple_matchesP == ebmt_template_parser.UNPROVIDED) {
            allow_multiple_matchesP = (SubLObject)ebmt_template_parser.NIL;
        }
        if (verboseP == ebmt_template_parser.UNPROVIDED) {
            verboseP = (SubLObject)ebmt_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ebmt_template_parser.NIL != Types.stringp(nl_sent) : nl_sent;
        assert ebmt_template_parser.NIL != cycl_grammar.cycl_sentence_p(cycl_sent) : cycl_sent;
        final SubLObject templates = ebmt_create_templates(nl_sent, cycl_sent, lexicon, allow_multiple_matchesP, verboseP);
        thread.resetMultipleValues();
        final SubLObject host = ebmt_template_index_server_info(lexicon);
        final SubLObject port = thread.secondMultipleValue();
        final SubLObject content = thread.thirdMultipleValue();
        final SubLObject log = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            SubLObject cdolist_list_var = templates;
            SubLObject template = (SubLObject)ebmt_template_parser.NIL;
            template = cdolist_list_var.first();
            while (ebmt_template_parser.NIL != cdolist_list_var) {
                final SubLObject nl_cycl_pair = ebmt_template_nl_cycl_pair(template);
                final SubLObject result = ebmt_delete_template_int(template, host, port);
                ebmt_update_log(log, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(result), new SubLObject[] { ebmt_template_parser.$str85$__, format_nil.format_nil_a_no_copy(ebmt_template_type(template)), ebmt_template_parser.$str86$___, format_nil.format_nil_s_no_copy(nl_cycl_pair) }));
                if (result.equal((SubLObject)ebmt_template_parser.$str93$Deleted)) {
                    ebmt_delete_example_from_file(content, nl_cycl_pair);
                }
                if (ebmt_template_parser.NIL != verboseP) {
                    PrintLow.format((SubLObject)ebmt_template_parser.T, (SubLObject)ebmt_template_parser.$str94$_A__, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                template = cdolist_list_var.first();
            }
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return templates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 30239L)
    public static SubLObject new_ebmt_cycl(SubLObject cycl, SubLObject justification, SubLObject weight) {
        if (cycl == ebmt_template_parser.UNPROVIDED) {
            cycl = (SubLObject)ebmt_template_parser.NIL;
        }
        if (justification == ebmt_template_parser.UNPROVIDED) {
            justification = (SubLObject)ebmt_template_parser.NIL;
        }
        if (weight == ebmt_template_parser.UNPROVIDED) {
            weight = (SubLObject)ebmt_template_parser.NIL;
        }
        SubLObject result = conses_high.putf((SubLObject)ebmt_template_parser.NIL, (SubLObject)ebmt_template_parser.$kw38$CYCL, cycl);
        result = conses_high.putf(result, (SubLObject)ebmt_template_parser.$kw95$JUSTIFICATION, justification);
        result = conses_high.putf(result, (SubLObject)ebmt_template_parser.$kw40$WEIGHT, weight);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 30829L)
    public static SubLObject copy_ebmt_cycl(final SubLObject ebmt_cycl) {
        return conses_high.copy_list(ebmt_cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 30906L)
    public static SubLObject ebmt_cycl_p(final SubLObject thing) {
        return list_utilities.property_list_p(thing);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 30978L)
    public static SubLObject set_ebmt_cycl_cycl(final SubLObject ebmt_cycl, final SubLObject cycl) {
        return conses_high.putf(ebmt_cycl, (SubLObject)ebmt_template_parser.$kw38$CYCL, cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31070L)
    public static SubLObject get_ebmt_cycl_cycl(final SubLObject ebmt_cycl) {
        return conses_high.getf(ebmt_cycl, (SubLObject)ebmt_template_parser.$kw38$CYCL, (SubLObject)ebmt_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31152L)
    public static SubLObject set_ebmt_cycl_justification(final SubLObject ebmt_cycl, final SubLObject justification) {
        return conses_high.putf(ebmt_cycl, (SubLObject)ebmt_template_parser.$kw95$JUSTIFICATION, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31280L)
    public static SubLObject get_ebmt_cycl_justification(final SubLObject ebmt_cycl) {
        return conses_high.getf(ebmt_cycl, (SubLObject)ebmt_template_parser.$kw95$JUSTIFICATION, (SubLObject)ebmt_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31380L)
    public static SubLObject set_ebmt_cycl_weight(final SubLObject ebmt_cycl, final SubLObject weight) {
        return conses_high.putf(ebmt_cycl, (SubLObject)ebmt_template_parser.$kw40$WEIGHT, weight);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31480L)
    public static SubLObject get_ebmt_cycl_weight(final SubLObject ebmt_cycl) {
        return conses_high.getf(ebmt_cycl, (SubLObject)ebmt_template_parser.$kw40$WEIGHT, (SubLObject)ebmt_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31566L)
    public static SubLObject compose_ebmt_cycl_justifications(final SubLObject ebmt_cycl, final SubLObject new_ebmt_cycl) {
        set_ebmt_cycl_justification(ebmt_cycl, conses_high.union(get_ebmt_cycl_justification(ebmt_cycl), get_ebmt_cycl_justification(new_ebmt_cycl), (SubLObject)ebmt_template_parser.EQUAL, (SubLObject)ebmt_template_parser.UNPROVIDED));
        return ebmt_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 31813L)
    public static SubLObject compose_ebmt_cycl_weight(final SubLObject ebmt_cycl, final SubLObject new_ebmt_cycl) {
        set_ebmt_cycl_weight(ebmt_cycl, conses_high.union(get_ebmt_cycl_weight(ebmt_cycl), get_ebmt_cycl_weight(new_ebmt_cycl), (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED));
        return ebmt_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32024L)
    public static SubLObject ebmt_cycl_subst(final SubLObject new_ebmt_cycl, final SubLObject old_term, final SubLObject old_ebmt_cycl) {
        final SubLObject old_cycl = get_ebmt_cycl_cycl(old_ebmt_cycl);
        final SubLObject new_cycl = get_ebmt_cycl_cycl(new_ebmt_cycl);
        set_ebmt_cycl_cycl(old_ebmt_cycl, cycl_utilities.expression_subst(new_cycl, old_term, old_cycl, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQUAL), (SubLObject)ebmt_template_parser.UNPROVIDED));
        compose_ebmt_cycl_justifications(old_ebmt_cycl, new_ebmt_cycl);
        compose_ebmt_cycl_weight(old_ebmt_cycl, new_ebmt_cycl);
        return old_ebmt_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject ebmt_template_parsing_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ebmt_template_parsing_info(v_object, stream, (SubLObject)ebmt_template_parser.ZERO_INTEGER);
        return (SubLObject)ebmt_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject ebmt_template_parsing_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ebmt_template_parsing_info_native.class) ? ebmt_template_parser.T : ebmt_template_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject ebmt_template_parsing_info_kw_lw_pairs(final SubLObject v_object) {
        assert ebmt_template_parser.NIL != ebmt_template_parsing_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject ebmt_template_parsing_info_lw_links_pairs(final SubLObject v_object) {
        assert ebmt_template_parser.NIL != ebmt_template_parsing_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject ebmt_template_parsing_info_lw(final SubLObject v_object) {
        assert ebmt_template_parser.NIL != ebmt_template_parsing_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject ebmt_template_parsing_info_processed(final SubLObject v_object) {
        assert ebmt_template_parser.NIL != ebmt_template_parsing_info_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject ebmt_template_parsing_info_cycl(final SubLObject v_object) {
        assert ebmt_template_parser.NIL != ebmt_template_parsing_info_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject _csetf_ebmt_template_parsing_info_kw_lw_pairs(final SubLObject v_object, final SubLObject value) {
        assert ebmt_template_parser.NIL != ebmt_template_parsing_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject _csetf_ebmt_template_parsing_info_lw_links_pairs(final SubLObject v_object, final SubLObject value) {
        assert ebmt_template_parser.NIL != ebmt_template_parsing_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject _csetf_ebmt_template_parsing_info_lw(final SubLObject v_object, final SubLObject value) {
        assert ebmt_template_parser.NIL != ebmt_template_parsing_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject _csetf_ebmt_template_parsing_info_processed(final SubLObject v_object, final SubLObject value) {
        assert ebmt_template_parser.NIL != ebmt_template_parsing_info_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject _csetf_ebmt_template_parsing_info_cycl(final SubLObject v_object, final SubLObject value) {
        assert ebmt_template_parser.NIL != ebmt_template_parsing_info_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject make_ebmt_template_parsing_info(SubLObject arglist) {
        if (arglist == ebmt_template_parser.UNPROVIDED) {
            arglist = (SubLObject)ebmt_template_parser.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ebmt_template_parsing_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)ebmt_template_parser.NIL, next = arglist; ebmt_template_parser.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)ebmt_template_parser.$kw115$KW_LW_PAIRS)) {
                _csetf_ebmt_template_parsing_info_kw_lw_pairs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ebmt_template_parser.$kw116$LW_LINKS_PAIRS)) {
                _csetf_ebmt_template_parsing_info_lw_links_pairs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ebmt_template_parser.$kw117$LW)) {
                _csetf_ebmt_template_parsing_info_lw(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ebmt_template_parser.$kw118$PROCESSED)) {
                _csetf_ebmt_template_parsing_info_processed(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)ebmt_template_parser.$kw38$CYCL)) {
                _csetf_ebmt_template_parsing_info_cycl(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)ebmt_template_parser.$str41$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject visit_defstruct_ebmt_template_parsing_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw42$BEGIN, (SubLObject)ebmt_template_parser.$sym119$MAKE_EBMT_TEMPLATE_PARSING_INFO, (SubLObject)ebmt_template_parser.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw44$SLOT, (SubLObject)ebmt_template_parser.$kw115$KW_LW_PAIRS, ebmt_template_parsing_info_kw_lw_pairs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw44$SLOT, (SubLObject)ebmt_template_parser.$kw116$LW_LINKS_PAIRS, ebmt_template_parsing_info_lw_links_pairs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw44$SLOT, (SubLObject)ebmt_template_parser.$kw117$LW, ebmt_template_parsing_info_lw(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw44$SLOT, (SubLObject)ebmt_template_parser.$kw118$PROCESSED, ebmt_template_parsing_info_processed(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw44$SLOT, (SubLObject)ebmt_template_parser.$kw38$CYCL, ebmt_template_parsing_info_cycl(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)ebmt_template_parser.$kw45$END, (SubLObject)ebmt_template_parser.$sym119$MAKE_EBMT_TEMPLATE_PARSING_INFO, (SubLObject)ebmt_template_parser.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32451L)
    public static SubLObject visit_defstruct_object_ebmt_template_parsing_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ebmt_template_parsing_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 32871L)
    public static SubLObject new_ebmt_template_parsing_info(SubLObject kw_lw_pairs, SubLObject lw_links_pairs, SubLObject lw, SubLObject processed, SubLObject cycl) {
        if (kw_lw_pairs == ebmt_template_parser.UNPROVIDED) {
            kw_lw_pairs = (SubLObject)ebmt_template_parser.NIL;
        }
        if (lw_links_pairs == ebmt_template_parser.UNPROVIDED) {
            lw_links_pairs = (SubLObject)ebmt_template_parser.NIL;
        }
        if (lw == ebmt_template_parser.UNPROVIDED) {
            lw = (SubLObject)ebmt_template_parser.NIL;
        }
        if (processed == ebmt_template_parser.UNPROVIDED) {
            processed = (SubLObject)ebmt_template_parser.NIL;
        }
        if (cycl == ebmt_template_parser.UNPROVIDED) {
            cycl = (SubLObject)ebmt_template_parser.NIL;
        }
        final SubLObject template_parsing_info = make_ebmt_template_parsing_info((SubLObject)ebmt_template_parser.UNPROVIDED);
        _csetf_ebmt_template_parsing_info_kw_lw_pairs(template_parsing_info, kw_lw_pairs);
        _csetf_ebmt_template_parsing_info_lw_links_pairs(template_parsing_info, lw_links_pairs);
        _csetf_ebmt_template_parsing_info_lw(template_parsing_info, lw);
        _csetf_ebmt_template_parsing_info_processed(template_parsing_info, processed);
        _csetf_ebmt_template_parsing_info_cycl(template_parsing_info, cycl);
        return template_parsing_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 33563L)
    public static SubLObject print_ebmt_template_parsing_info(final SubLObject template_parsing_info, SubLObject stream, SubLObject depth) {
        if (stream == ebmt_template_parser.UNPROVIDED) {
            stream = (SubLObject)ebmt_template_parser.T;
        }
        if (depth == ebmt_template_parser.UNPROVIDED) {
            depth = (SubLObject)ebmt_template_parser.NIL;
        }
        PrintLow.format(stream, (SubLObject)ebmt_template_parser.$str121$__TEMPLATE_PARSING_INFO______Keyw, new SubLObject[] { ebmt_template_parsing_info_kw_lw_pairs(template_parsing_info), ebmt_template_parsing_info_lw_links_pairs(template_parsing_info), ebmt_template_parsing_info_lw(template_parsing_info), ebmt_template_parsing_info_processed(template_parsing_info), ebmt_template_parsing_info_cycl(template_parsing_info) });
        return template_parsing_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 34193L)
    public static SubLObject ebmt_linkset_linkword_linkset_links_pairs(final SubLObject link_tuples) {
        SubLObject llw_ll_pairs = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = link_tuples;
        SubLObject tuple = (SubLObject)ebmt_template_parser.NIL;
        tuple = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            final SubLObject left_word = linkset_link_left_word(tuple);
            final SubLObject right_word = linkset_link_right_word(tuple);
            llw_ll_pairs = list_utilities.alist_pushnew(llw_ll_pairs, left_word, tuple, (SubLObject)ebmt_template_parser.EQUAL, (SubLObject)ebmt_template_parser.EQUAL);
            llw_ll_pairs = list_utilities.alist_pushnew(llw_ll_pairs, right_word, tuple, (SubLObject)ebmt_template_parser.EQUAL, (SubLObject)ebmt_template_parser.EQUAL);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return llw_ll_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 35554L)
    public static SubLObject ebmt_llw_lw_equalP(final SubLObject linkset_link_word, final SubLObject link_word, final SubLObject linkset_lw_linkset_links_pairs) {
        return conses_high.subsetp(get_linkset_unindexed_links(list_utilities.alist_lookup(linkset_lw_linkset_links_pairs, linkset_link_word, (SubLObject)ebmt_template_parser.EQUAL, (SubLObject)ebmt_template_parser.UNPROVIDED)), get_linkset_unindexed_links(ebmt_linkset_from_linkage_links(methods.funcall_instance_method_with_0_args(link_word, (SubLObject)ebmt_template_parser.$sym122$GET_LINKS), (SubLObject)ebmt_template_parser.UNPROVIDED)), (SubLObject)ebmt_template_parser.$sym123$LINK_TUPLE_EQUAL, (SubLObject)ebmt_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 36000L)
    public static SubLObject link_tuple_equal(final SubLObject tuple1, final SubLObject tuple2) {
        final SubLObject mtuple1 = (SubLObject)ConsesLow.list(tuple1.first(), string_utilities.substring(conses_high.second(tuple1), (SubLObject)ebmt_template_parser.ZERO_INTEGER, (SubLObject)ebmt_template_parser.ONE_INTEGER), conses_high.third(tuple1));
        final SubLObject mtuple2 = (SubLObject)ConsesLow.list(tuple2.first(), string_utilities.substring(conses_high.second(tuple2), (SubLObject)ebmt_template_parser.ZERO_INTEGER, (SubLObject)ebmt_template_parser.ONE_INTEGER), conses_high.third(tuple2));
        SubLObject item1 = (SubLObject)ebmt_template_parser.NIL;
        SubLObject item1_$11 = (SubLObject)ebmt_template_parser.NIL;
        SubLObject item2 = (SubLObject)ebmt_template_parser.NIL;
        SubLObject item2_$12 = (SubLObject)ebmt_template_parser.NIL;
        item1 = mtuple1;
        item1_$11 = item1.first();
        item2 = mtuple2;
        item2_$12 = item2.first();
        while (ebmt_template_parser.NIL != item2 || ebmt_template_parser.NIL != item1) {
            if (!item1_$11.isKeyword() && !item2_$12.isKeyword() && (!item1_$11.equal((SubLObject)ebmt_template_parser.$str124$a) || !item2_$12.equal((SubLObject)ebmt_template_parser.$str125$an)) && (!item1_$11.equal((SubLObject)ebmt_template_parser.$str125$an) || !item2_$12.equal((SubLObject)ebmt_template_parser.$str124$a)) && !item1_$11.equal(item2_$12)) {
                return (SubLObject)ebmt_template_parser.NIL;
            }
            item1 = item1.rest();
            item1_$11 = item1.first();
            item2 = item2.rest();
            item2_$12 = item2.first();
        }
        return (SubLObject)ebmt_template_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 36500L)
    public static SubLObject ebmt_keyword_linkword_pairs(final SubLObject template_links, final SubLObject v_linkage) {
        final SubLObject linkset_lw_linkset_links_pairs = ebmt_linkset_linkword_linkset_links_pairs(template_links);
        SubLObject keyword_linkword_pairs = (SubLObject)ebmt_template_parser.NIL;
        SubLObject linkword_links_pairs = (SubLObject)ebmt_template_parser.NIL;
        SubLObject linkwords = (SubLObject)ebmt_template_parser.NIL;
        SubLObject used_links = (SubLObject)ebmt_template_parser.NIL;
        SubLObject errorP = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = template_links;
        SubLObject link_tuple = (SubLObject)ebmt_template_parser.NIL;
        link_tuple = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            SubLObject doneP = (SubLObject)ebmt_template_parser.NIL;
            SubLObject link = (SubLObject)ebmt_template_parser.NIL;
            final SubLObject vector_var = instances.get_slot(v_linkage, (SubLObject)ebmt_template_parser.$sym59$LINKS);
            final SubLObject backwardP_var = (SubLObject)ebmt_template_parser.NIL;
            final SubLObject length = Sequences.length(vector_var);
            SubLObject current;
            final SubLObject datum = current = (SubLObject)((ebmt_template_parser.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)ebmt_template_parser.ONE_INTEGER), (SubLObject)ebmt_template_parser.MINUS_ONE_INTEGER, (SubLObject)ebmt_template_parser.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)ebmt_template_parser.ZERO_INTEGER, length, (SubLObject)ebmt_template_parser.ONE_INTEGER));
            SubLObject start = (SubLObject)ebmt_template_parser.NIL;
            SubLObject end = (SubLObject)ebmt_template_parser.NIL;
            SubLObject delta = (SubLObject)ebmt_template_parser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_template_parser.$list126);
            start = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_template_parser.$list126);
            end = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ebmt_template_parser.$list126);
            delta = current.first();
            current = current.rest();
            if (ebmt_template_parser.NIL == current) {
                if (ebmt_template_parser.NIL == doneP) {
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
                    for (end_var = end, element_num = (SubLObject)ebmt_template_parser.NIL, element_num = start; ebmt_template_parser.NIL == doneP && ebmt_template_parser.NIL == subl_macros.do_numbers_endtest(element_num, delta, end_var); element_num = Numbers.add(element_num, delta)) {
                        l = Vectors.aref(vector_var, element_num);
                        if (ebmt_template_parser.NIL != l) {
                            link = l;
                            if (ebmt_template_parser.NIL == subl_promotions.memberP(link, used_links, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED) && linkset_link_name(link_tuple).equal(ebmt_link_name(link))) {
                                link_left_word = linkage.link_left_word(link);
                                link_right_word = linkage.link_right_word(link);
                                linkset_link_left_word = linkset_link_left_word(link_tuple);
                                linkset_link_right_word = linkset_link_right_word(link_tuple);
                                tuple_left_word = linkset_link_left_word_string(link_tuple);
                                tuple_right_word = linkset_link_right_word_string(link_tuple);
                                if (tuple_left_word.isKeyword() && tuple_right_word.isKeyword() && ebmt_template_parser.NIL != ebmt_llw_lw_equalP(linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs) && ebmt_template_parser.NIL != ebmt_llw_lw_equalP(linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs)) {
                                    keyword_linkword_pairs = list_utilities.alist_pushnew(keyword_linkword_pairs, tuple_left_word, link_left_word, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL));
                                    keyword_linkword_pairs = list_utilities.alist_pushnew(keyword_linkword_pairs, tuple_right_word, link_right_word, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL));
                                    linkword_links_pairs = list_utilities.alist_pushnew(linkword_links_pairs, link_left_word, link, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL));
                                    linkword_links_pairs = list_utilities.alist_pushnew(linkword_links_pairs, link_right_word, link, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL));
                                    doneP = (SubLObject)ebmt_template_parser.T;
                                }
                                else if (tuple_left_word.isKeyword()) {
                                    if (tuple_right_word.equal(methods.funcall_instance_method_with_0_args(link_right_word, (SubLObject)ebmt_template_parser.$sym55$GET_STRING)) && ebmt_template_parser.NIL != ebmt_llw_lw_equalP(linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs) && ebmt_template_parser.NIL != ebmt_llw_lw_equalP(linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs)) {
                                        keyword_linkword_pairs = list_utilities.alist_pushnew(keyword_linkword_pairs, tuple_left_word, link_left_word, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL));
                                        linkword_links_pairs = list_utilities.alist_pushnew(linkword_links_pairs, link_left_word, link, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL));
                                        doneP = (SubLObject)ebmt_template_parser.T;
                                    }
                                }
                                else if (tuple_right_word.isKeyword()) {
                                    if (tuple_left_word.equal(methods.funcall_instance_method_with_0_args(link_left_word, (SubLObject)ebmt_template_parser.$sym55$GET_STRING)) && ebmt_template_parser.NIL != ebmt_llw_lw_equalP(linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs) && ebmt_template_parser.NIL != ebmt_llw_lw_equalP(linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs)) {
                                        keyword_linkword_pairs = list_utilities.alist_pushnew(keyword_linkword_pairs, tuple_right_word, link_right_word, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL));
                                        linkword_links_pairs = list_utilities.alist_pushnew(linkword_links_pairs, link_right_word, link, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL));
                                        doneP = (SubLObject)ebmt_template_parser.T;
                                    }
                                }
                                else {
                                    errorP = (SubLObject)ebmt_template_parser.T;
                                    if (tuple_left_word.equal(methods.funcall_instance_method_with_0_args(link_left_word, (SubLObject)ebmt_template_parser.$sym55$GET_STRING)) && tuple_right_word.equal(methods.funcall_instance_method_with_0_args(link_right_word, (SubLObject)ebmt_template_parser.$sym55$GET_STRING)) && ebmt_template_parser.NIL != ebmt_llw_lw_equalP(linkset_link_left_word, link_left_word, linkset_lw_linkset_links_pairs) && ebmt_template_parser.NIL != ebmt_llw_lw_equalP(linkset_link_right_word, link_right_word, linkset_lw_linkset_links_pairs)) {
                                        errorP = (SubLObject)ebmt_template_parser.NIL;
                                        doneP = (SubLObject)ebmt_template_parser.T;
                                    }
                                }
                                if (ebmt_template_parser.NIL != doneP) {
                                    used_links = (SubLObject)ConsesLow.cons(link, used_links);
                                    item_var = link_left_word;
                                    if (ebmt_template_parser.NIL == conses_high.member(item_var, linkwords, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.IDENTITY))) {
                                        linkwords = (SubLObject)ConsesLow.cons(item_var, linkwords);
                                    }
                                    item_var = link_right_word;
                                    if (ebmt_template_parser.NIL == conses_high.member(item_var, linkwords, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.IDENTITY))) {
                                        linkwords = (SubLObject)ConsesLow.cons(item_var, linkwords);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ebmt_template_parser.$list126);
            }
            if (ebmt_template_parser.NIL != errorP || ebmt_template_parser.NIL == doneP) {
                return (SubLObject)ebmt_template_parser.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            link_tuple = cdolist_list_var.first();
        }
        return Values.values(keyword_linkword_pairs, linkword_links_pairs, linkwords);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 42048L)
    public static SubLObject ebmt_templates_relevant_to_linkword(final SubLObject linkword, final SubLObject template_parsing_info_alist) {
        SubLObject templates = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = template_parsing_info_alist;
        SubLObject templateXtemplate_parsing_info = (SubLObject)ebmt_template_parser.NIL;
        templateXtemplate_parsing_info = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            final SubLObject template_parsing_info = templateXtemplate_parsing_info.rest();
            if (ebmt_template_parser.NIL == ebmt_template_parsing_info_processed(template_parsing_info) && ebmt_template_parser.NIL != subl_promotions.memberP(linkword, ebmt_template_parsing_info_lw(template_parsing_info), (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
                templates = (SubLObject)ConsesLow.cons(templateXtemplate_parsing_info.first(), templates);
            }
            cdolist_list_var = cdolist_list_var.rest();
            templateXtemplate_parsing_info = cdolist_list_var.first();
        }
        return templates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 42574L)
    public static SubLObject ebmt_used_linkwords(final SubLObject template_parsing_info_alist) {
        SubLObject used_linkwords = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = template_parsing_info_alist;
        SubLObject templateXtemplate_parsing_info = (SubLObject)ebmt_template_parser.NIL;
        templateXtemplate_parsing_info = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            used_linkwords = conses_high.nunion(used_linkwords, ebmt_template_parsing_info_lw(templateXtemplate_parsing_info.rest()), (SubLObject)ebmt_template_parser.EQ, (SubLObject)ebmt_template_parser.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            templateXtemplate_parsing_info = cdolist_list_var.first();
        }
        return used_linkwords;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 42921L)
    public static SubLObject strings_of_linkwords(final SubLObject linkwords) {
        SubLObject strings = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = linkwords;
        SubLObject lw = (SubLObject)ebmt_template_parser.NIL;
        lw = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            strings = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(lw, (SubLObject)ebmt_template_parser.$sym55$GET_STRING), strings);
            cdolist_list_var = cdolist_list_var.rest();
            lw = cdolist_list_var.first();
        }
        return Sequences.nreverse(strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 43092L)
    public static SubLObject clear_ebmt_cycls_for_phrase() {
        final SubLObject cs = ebmt_template_parser.$ebmt_cycls_for_phrase_caching_state$.getGlobalValue();
        if (ebmt_template_parser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)ebmt_template_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 43092L)
    public static SubLObject remove_ebmt_cycls_for_phrase(final SubLObject phrase, final SubLObject category) {
        return memoization_state.caching_state_remove_function_results_with_args(ebmt_template_parser.$ebmt_cycls_for_phrase_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(phrase, category), (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 43092L)
    public static SubLObject ebmt_cycls_for_phrase_internal(final SubLObject phrase, final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycls = (SubLObject)ebmt_template_parser.NIL;
        if (ebmt_template_parser.NIL != subl_promotions.memberP(category, (SubLObject)ebmt_template_parser.$list128, (SubLObject)ebmt_template_parser.EQ, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
            cycls = parsing_utilities.parse_dates_and_numbers(phrase, (SubLObject)ebmt_template_parser.$list129, (SubLObject)ebmt_template_parser.NIL, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
            cycls = conses_high.union(cycls, english_quantity_parser.string_to_quantities(phrase), (SubLObject)ebmt_template_parser.$sym130$EQUALS_EL_, (SubLObject)ebmt_template_parser.UNPROVIDED);
        }
        if (ebmt_template_parser.NIL != ebmt_template_parser.$ebmt_exclude_predsP$.getDynamicValue(thread) && ebmt_template_parser.NIL != subl_promotions.memberP(category, (SubLObject)ebmt_template_parser.$list131, (SubLObject)ebmt_template_parser.EQ, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
            SubLObject np_cycls = (SubLObject)ebmt_template_parser.NIL;
            final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
            final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = parsing_vars.$psp_pos_pred_filterP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = parsing_vars.$psp_pos_pred_filter_preds$.currentBinding(thread);
            try {
                parsing_vars.$psp_return_mode$.bind((SubLObject)ebmt_template_parser.$kw132$BEST_ONLY, thread);
                parsing_vars.$npp_use_nl_tagsP$.bind((SubLObject)ebmt_template_parser.NIL, thread);
                parsing_vars.$psp_pos_pred_filterP$.bind((SubLObject)ebmt_template_parser.T, thread);
                parsing_vars.$psp_pos_pred_filter_preds$.bind((SubLObject)ConsesLow.cons(ebmt_template_parser.$const133$familyName, parsing_vars.$psp_pos_pred_filter_preds$.getDynamicValue(thread)), thread);
                SubLObject timed_outP = (SubLObject)ebmt_template_parser.NIL;
                final SubLObject _prev_bind_0_$13 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                final SubLObject _prev_bind_1_$14 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$15 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                try {
                    parsing_macros.$parsing_timeout_time_check_count$.bind((SubLObject)ebmt_template_parser.ZERO_INTEGER, thread);
                    parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(ebmt_template_parser.$ebmt_phrase_interp_timeout$.getDynamicValue(thread)), thread);
                    parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                    parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                    if (ebmt_template_parser.NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                        np_cycls = psp_main.ps_get_cycls_for_np(phrase, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
                    }
                    timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                }
                finally {
                    parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2_$15, thread);
                    parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1_$14, thread);
                    parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_$13, thread);
                }
            }
            finally {
                parsing_vars.$psp_pos_pred_filter_preds$.rebind(_prev_bind_4, thread);
                parsing_vars.$psp_pos_pred_filterP$.rebind(_prev_bind_3, thread);
                parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
                parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
            }
            if (ebmt_template_parser.NIL != np_cycls) {
                return conses_high.union(cycls, np_cycls, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
            }
        }
        final SubLObject _prev_bind_5 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        final SubLObject _prev_bind_6 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind((SubLObject)ebmt_template_parser.$kw132$BEST_ONLY, thread);
            parsing_vars.$npp_use_nl_tagsP$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            SubLObject timed_outP2 = (SubLObject)ebmt_template_parser.NIL;
            final SubLObject _prev_bind_0_$14 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
            final SubLObject _prev_bind_1_$15 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
            final SubLObject _prev_bind_7 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
            try {
                parsing_macros.$parsing_timeout_time_check_count$.bind((SubLObject)ebmt_template_parser.ZERO_INTEGER, thread);
                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(ebmt_template_parser.$ebmt_phrase_interp_timeout$.getDynamicValue(thread)), thread);
                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                if (ebmt_template_parser.NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                    cycls = conses_high.union(cycls, psp_main.ps_get_cycls_for_phrase(phrase, category, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED), (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
                    if (ebmt_template_parser.NIL == cycls && !lexicon_utilities.bar_level(category, (SubLObject)ebmt_template_parser.UNPROVIDED).eql((SubLObject)ebmt_template_parser.TWO_INTEGER)) {
                        final SubLObject head_cat = lexicon_utilities.pos_of_cat(category, (SubLObject)ebmt_template_parser.UNPROVIDED);
                        final SubLObject phrase_cat = (SubLObject)ConsesLow.list(ebmt_template_parser.$const134$PhraseFn, head_cat);
                        cycls = psp_main.ps_get_cycls_for_phrase(phrase, phrase_cat, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
                    }
                }
                timed_outP2 = parsing_macros.parsing_timeout_time_reachedP();
            }
            finally {
                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_7, thread);
                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1_$15, thread);
                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_$14, thread);
            }
        }
        finally {
            parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_6, thread);
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_5, thread);
        }
        return cycls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 43092L)
    public static SubLObject ebmt_cycls_for_phrase(final SubLObject phrase, final SubLObject category) {
        SubLObject caching_state = ebmt_template_parser.$ebmt_cycls_for_phrase_caching_state$.getGlobalValue();
        if (ebmt_template_parser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)ebmt_template_parser.$sym127$EBMT_CYCLS_FOR_PHRASE, (SubLObject)ebmt_template_parser.$sym135$_EBMT_CYCLS_FOR_PHRASE_CACHING_STATE_, (SubLObject)ebmt_template_parser.$int136$5000, (SubLObject)ebmt_template_parser.EQUAL, (SubLObject)ebmt_template_parser.TWO_INTEGER, (SubLObject)ebmt_template_parser.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(phrase, category);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)ebmt_template_parser.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)ebmt_template_parser.NIL;
            collision = cdolist_list_var.first();
            while (ebmt_template_parser.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (phrase.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (ebmt_template_parser.NIL != cached_args && ebmt_template_parser.NIL == cached_args.rest() && category.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(ebmt_cycls_for_phrase_internal(phrase, category)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(phrase, category));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 45208L)
    public static SubLObject ebmt_penntag_to_cycl_category(final SubLObject penntag) {
        final SubLObject cycl_penntag = parsing_utilities.penntag_to_cycl(print_high.princ_to_string(penntag));
        SubLObject category = (SubLObject)((ebmt_template_parser.NIL != cycl_penntag) ? parsing_utilities.penntag_category(cycl_penntag) : ebmt_template_parser.NIL);
        if (category.eql(ebmt_template_parser.$const137$ProperNoun)) {
            category = ebmt_template_parser.$const138$NounPhrase;
        }
        return (SubLObject)((ebmt_template_parser.NIL != category) ? category : ebmt_template_parser.$kw139$ANY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 45625L)
    public static SubLObject ebmt_cycls_using_link_word_only(final SubLObject link_word, final SubLObject nl_sent, final SubLObject used_lw) {
        SubLObject cycls = (SubLObject)ebmt_template_parser.NIL;
        SubLObject phrase = (SubLObject)ebmt_template_parser.NIL;
        SubLObject category = (SubLObject)ebmt_template_parser.NIL;
        SubLObject lw_used = (SubLObject)ebmt_template_parser.NIL;
        if (ebmt_template_parser.NIL != linkage.noun_link_word_p(link_word)) {
            SubLObject modifiers = Sequences.remove_if((SubLObject)ebmt_template_parser.$sym140$PREPOSITION_LINK_WORD_P, methods.funcall_instance_method_with_0_args(link_word, (SubLObject)ebmt_template_parser.$sym141$GET_MODIFIERS), (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
            modifiers = conses_high.set_difference(modifiers, used_lw, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQ), (SubLObject)ebmt_template_parser.UNPROVIDED);
            if (ebmt_template_parser.NIL != modifiers) {
                lw_used = (SubLObject)ConsesLow.cons(link_word, modifiers);
                phrase = string_utilities.bunge_according_to_string(strings_of_linkwords(Sort.sort(conses_high.copy_list(lw_used), (SubLObject)ebmt_template_parser.$sym47$_, (SubLObject)ebmt_template_parser.$sym142$GET_LINK_WORD_ABS_INDEX)), nl_sent, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
                category = ebmt_template_parser.$const138$NounPhrase;
                cycls = ebmt_cycls_for_phrase(phrase, category);
            }
        }
        if (ebmt_template_parser.NIL == cycls) {
            phrase = methods.funcall_instance_method_with_0_args(link_word, (SubLObject)ebmt_template_parser.$sym55$GET_STRING);
            category = ebmt_penntag_to_cycl_category(methods.funcall_instance_method_with_0_args(link_word, (SubLObject)ebmt_template_parser.$sym143$GET_POS));
            cycls = ebmt_cycls_for_phrase(phrase, category);
            lw_used = (SubLObject)ConsesLow.list(link_word);
        }
        return Values.values(cycls, phrase, category, lw_used);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 46739L)
    public static SubLObject ebmt_cycls_for_link_word(final SubLObject link_word, final SubLObject template_parsing_info_alist, final SubLObject v_linkage, final SubLObject nl_sentence, final SubLObject used_lw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)ebmt_template_parser.NIL;
        SubLObject link_phrase = linkage.get_link_phrase((SubLObject)ConsesLow.list(link_word));
        SubLObject doneP = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cycls = (SubLObject)ebmt_template_parser.NIL;
        while (ebmt_template_parser.NIL == doneP) {
            final SubLObject lp_lw = (SubLObject)((ebmt_template_parser.NIL != link_phrase) ? methods.funcall_instance_method_with_0_args(link_phrase, (SubLObject)ebmt_template_parser.$sym144$YIELD) : ebmt_template_parser.NIL);
            if (ebmt_template_parser.NIL == conses_high.intersection(used_lw, lp_lw, (SubLObject)ebmt_template_parser.EQ, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
                if (ebmt_template_parser.NIL != lp_lw) {
                    if (ebmt_template_parser.NIL == subl_promotions.memberP(link_word, lp_lw, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
                        link_phrase = link_word;
                    }
                }
                else {
                    link_phrase = link_word;
                }
                SubLObject phrase = methods.funcall_instance_method_with_0_args(link_phrase, (SubLObject)ebmt_template_parser.$sym55$GET_STRING);
                SubLObject category = ebmt_penntag_to_cycl_category(methods.funcall_instance_method_with_0_args(link_phrase, (SubLObject)ebmt_template_parser.$sym145$GET_CATEGORY));
                SubLObject lw_used = methods.funcall_instance_method_with_0_args(link_phrase, (SubLObject)ebmt_template_parser.$sym144$YIELD);
                if (ebmt_template_parser.NIL != linkage.link_word_p(link_phrase)) {
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
                    doneP = (SubLObject)ebmt_template_parser.T;
                }
                else {
                    cycls = ebmt_cycls_for_phrase(phrase, category);
                }
                if (ebmt_template_parser.NIL != cycls) {
                    SubLObject cdolist_list_var = cycls;
                    SubLObject cycl = (SubLObject)ebmt_template_parser.NIL;
                    cycl = cdolist_list_var.first();
                    while (ebmt_template_parser.NIL != cdolist_list_var) {
                        final SubLObject item_var = new_ebmt_cycl(cycl, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(phrase, category, cycl)), lw_used);
                        if (ebmt_template_parser.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)ebmt_template_parser.EQL), Symbols.symbol_function((SubLObject)ebmt_template_parser.IDENTITY))) {
                            result = (SubLObject)ConsesLow.cons(item_var, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        cycl = cdolist_list_var.first();
                    }
                    doneP = (SubLObject)ebmt_template_parser.T;
                }
            }
            if (ebmt_template_parser.NIL == doneP) {
                link_phrase = methods.funcall_instance_method_with_0_args(link_phrase, (SubLObject)ebmt_template_parser.$sym146$GET_HEAD_DAUGHTER);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 48764L)
    public static SubLObject ebmt_keyword_cycls_pairs(final SubLObject template, final SubLObject template_parsing_info_alist, final SubLObject v_linkage, final SubLObject nl_sentence) {
        SubLObject keyword_cycls_pairs = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = ebmt_template_parsing_info_kw_lw_pairs(list_utilities.alist_lookup(template_parsing_info_alist, template, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED));
        SubLObject keyword_linkword_pair = (SubLObject)ebmt_template_parser.NIL;
        keyword_linkword_pair = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            final SubLObject keyword = keyword_linkword_pair.first();
            final SubLObject linkwords = keyword_linkword_pair.rest();
            final SubLObject already_used_lw = conses_high.set_difference(ebmt_used_linkwords(template_parsing_info_alist), linkwords, (SubLObject)ebmt_template_parser.EQ, (SubLObject)ebmt_template_parser.UNPROVIDED);
            SubLObject ebmt_cycls = (SubLObject)ebmt_template_parser.NIL;
            SubLObject cdolist_list_var_$22 = linkwords;
            SubLObject link_word = (SubLObject)ebmt_template_parser.NIL;
            link_word = cdolist_list_var_$22.first();
            while (ebmt_template_parser.NIL != cdolist_list_var_$22) {
                ebmt_cycls = conses_high.union(ebmt_cycls, ebmt_cycls_for_link_word(link_word, template_parsing_info_alist, v_linkage, nl_sentence, already_used_lw), (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                link_word = cdolist_list_var_$22.first();
            }
            if (ebmt_template_parser.NIL == ebmt_cycls) {
                return (SubLObject)ebmt_template_parser.NIL;
            }
            keyword_cycls_pairs = conses_high.acons(keyword, (SubLObject)ConsesLow.list(ebmt_cycls), keyword_cycls_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            keyword_linkword_pair = cdolist_list_var.first();
        }
        return keyword_cycls_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 50025L)
    public static SubLObject ebmt_remove_invalid_cycls(final SubLObject ebmt_cycls) {
        SubLObject valid_ebmt_cycls = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = ebmt_cycls;
        SubLObject ebmt_cycl = (SubLObject)ebmt_template_parser.NIL;
        ebmt_cycl = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            final SubLObject cycl = get_ebmt_cycl_cycl(ebmt_cycl);
            if (ebmt_template_parser.NIL == cycl_utilities.expression_find_if((SubLObject)ebmt_template_parser.$sym78$KEYWORDP, cycl, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
                valid_ebmt_cycls = (SubLObject)ConsesLow.cons(ebmt_cycl, valid_ebmt_cycls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ebmt_cycl = cdolist_list_var.first();
        }
        return valid_ebmt_cycls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 50373L)
    public static SubLObject ebmt_parses_using_template(final SubLObject template, final SubLObject template_parsing_info_alist, final SubLObject v_linkage, final SubLObject with_varsP, final SubLObject nl_sentence) {
        final SubLObject template_parsing_info = list_utilities.alist_lookup(template_parsing_info_alist, template, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
        SubLObject ebmt_cycls = (SubLObject)ConsesLow.list(new_ebmt_cycl(ebmt_template_cycl(template), ebmt_template_justification(template), ebmt_template_parsing_info_lw(template_parsing_info)));
        _csetf_ebmt_template_parsing_info_processed(template_parsing_info, (SubLObject)ebmt_template_parser.T);
        if (ebmt_template_parser.NIL != with_varsP && ebmt_template_parser.NIL != ebmt_template_parsing_info_kw_lw_pairs(template_parsing_info)) {
            SubLObject cdolist_list_var;
            final SubLObject keyword_cycls_pairs = cdolist_list_var = ebmt_keyword_cycls_pairs(template, template_parsing_info_alist, v_linkage, nl_sentence);
            SubLObject keyword_cycls_pair = (SubLObject)ebmt_template_parser.NIL;
            keyword_cycls_pair = cdolist_list_var.first();
            while (ebmt_template_parser.NIL != cdolist_list_var) {
                final SubLObject kw_cycls_pair_value = keyword_cycls_pair.rest();
                SubLObject ans_cycls = (SubLObject)ebmt_template_parser.NIL;
                SubLObject cdolist_list_var_$23 = ebmt_cycls;
                SubLObject ebmt_cycl = (SubLObject)ebmt_template_parser.NIL;
                ebmt_cycl = cdolist_list_var_$23.first();
                while (ebmt_template_parser.NIL != cdolist_list_var_$23) {
                    SubLObject cdolist_list_var_$24 = kw_cycls_pair_value.first();
                    SubLObject cycl_subst = (SubLObject)ebmt_template_parser.NIL;
                    cycl_subst = cdolist_list_var_$24.first();
                    while (ebmt_template_parser.NIL != cdolist_list_var_$24) {
                        ans_cycls = (SubLObject)ConsesLow.cons(ebmt_cycl_subst(cycl_subst, keyword_cycls_pair.first(), copy_ebmt_cycl(ebmt_cycl)), ans_cycls);
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
        if (ebmt_template_parser.NIL == ebmt_cycls) {
            Errors.error((SubLObject)ebmt_template_parser.$str147$Unable_to_understand_some_of_the_);
        }
        _csetf_ebmt_template_parsing_info_cycl(template_parsing_info, ebmt_cycls);
        return ebmt_cycls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 52313L)
    public static SubLObject ebmt_template_parsing_info_alist(final SubLObject templates, final SubLObject v_linkage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template_parsing_info_alist = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = templates;
        SubLObject template = (SubLObject)ebmt_template_parser.NIL;
        template = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            final SubLObject template_links = ebmt_template_links(template);
            if (Sequences.length(instances.get_slot(v_linkage, (SubLObject)ebmt_template_parser.$sym59$LINKS)).numGE(Numbers.add(Sequences.length(template_links), (SubLObject)ebmt_template_parser.TWO_INTEGER))) {
                thread.resetMultipleValues();
                final SubLObject keyword_linkword_pairs = ebmt_keyword_linkword_pairs(Sequences.remove_duplicates(template_links, (SubLObject)ebmt_template_parser.EQUAL, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED), v_linkage);
                final SubLObject linkword_links_pairs = thread.secondMultipleValue();
                final SubLObject linkwords = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (ebmt_template_parser.NIL != keyword_linkword_pairs || ebmt_template_parser.NIL == cycl_utilities.expression_find_if((SubLObject)ebmt_template_parser.$sym78$KEYWORDP, ebmt_template_cycl(template), (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
                    template_parsing_info_alist = conses_high.acons(template, new_ebmt_template_parsing_info(keyword_linkword_pairs, linkword_links_pairs, linkwords, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED), template_parsing_info_alist);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        }
        return template_parsing_info_alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 53416L)
    public static SubLObject ebmt_parse_parts(final SubLObject v_linkage, final SubLObject with_varsP, final SubLObject lexicon, final SubLObject nl_sentence) {
        SubLObject templates = ebmt_find_templates_for_linkage(v_linkage, with_varsP, lexicon);
        final SubLObject template_parsing_info_alist = ebmt_template_parsing_info_alist(templates, v_linkage);
        SubLObject all_cycls = (SubLObject)ebmt_template_parser.NIL;
        templates = list_utilities.alist_keys(template_parsing_info_alist);
        if (ebmt_template_parser.NIL != templates) {
            while (ebmt_template_parser.NIL != templates) {
                final SubLObject template = templates.first();
                final SubLObject template_parsing_info = list_utilities.alist_lookup(template_parsing_info_alist, template, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
                SubLObject ebmt_cycls = (SubLObject)ebmt_template_parser.NIL;
                if (ebmt_template_parser.NIL != ebmt_template_parsing_info_processed(template_parsing_info)) {
                    ebmt_cycls = ebmt_template_parsing_info_cycl(template_parsing_info);
                }
                else {
                    ebmt_cycls = ebmt_parses_using_template(template, template_parsing_info_alist, v_linkage, with_varsP, nl_sentence);
                }
                if (ebmt_template_parser.NIL != ebmt_cycls) {
                    all_cycls = Sequences.cconcatenate(all_cycls, ebmt_cycls);
                }
                templates = templates.rest();
            }
            return Values.values(all_cycls, (SubLObject)ebmt_template_parser.NIL);
        }
        return Values.values((SubLObject)ebmt_template_parser.NIL, (SubLObject)ebmt_template_parser.$str148$No_matching_templates_found_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 54767L)
    public static SubLObject ebmt_relevant_cycl_parts(final SubLObject parse_parts, final SubLObject wff_check_mt) {
        SubLObject unique_linkages = (SubLObject)ebmt_template_parser.NIL;
        SubLObject lw_cycl_pairs = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = parse_parts;
        SubLObject part = (SubLObject)ebmt_template_parser.NIL;
        part = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            SubLObject doneP = (SubLObject)ebmt_template_parser.NIL;
            if (ebmt_template_parser.NIL != wff_check_mt && ebmt_template_parser.NIL == cyclifier.cyclifier_wffP(get_ebmt_cycl_cycl(part), (SubLObject)ebmt_template_parser.UNPROVIDED)) {
                doneP = (SubLObject)ebmt_template_parser.T;
            }
            if (ebmt_template_parser.NIL == doneP) {
                final SubLObject v_linkage = get_ebmt_cycl_weight(part);
                if (ebmt_template_parser.NIL == doneP) {
                    SubLObject csome_list_var = unique_linkages;
                    SubLObject unique_linkage = (SubLObject)ebmt_template_parser.NIL;
                    unique_linkage = csome_list_var.first();
                    while (ebmt_template_parser.NIL == doneP && ebmt_template_parser.NIL != csome_list_var) {
                        if (ebmt_template_parser.NIL != conses_high.subsetp(v_linkage, unique_linkage, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
                            if (ebmt_template_parser.NIL != conses_high.subsetp(unique_linkage, v_linkage, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
                                lw_cycl_pairs = list_utilities.alist_push(lw_cycl_pairs, v_linkage, part, (SubLObject)ebmt_template_parser.$sym149$SETS_EQUAL_);
                            }
                            doneP = (SubLObject)ebmt_template_parser.T;
                        }
                        else if (ebmt_template_parser.NIL != conses_high.subsetp(unique_linkage, v_linkage, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
                            lw_cycl_pairs = list_utilities.alist_delete(lw_cycl_pairs, unique_linkage, (SubLObject)ebmt_template_parser.$sym149$SETS_EQUAL_);
                            lw_cycl_pairs = list_utilities.alist_push(lw_cycl_pairs, v_linkage, part, (SubLObject)ebmt_template_parser.$sym149$SETS_EQUAL_);
                            doneP = (SubLObject)ebmt_template_parser.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        unique_linkage = csome_list_var.first();
                    }
                }
                if (ebmt_template_parser.NIL == doneP) {
                    lw_cycl_pairs = list_utilities.alist_push(lw_cycl_pairs, v_linkage, part, (SubLObject)ebmt_template_parser.$sym149$SETS_EQUAL_);
                }
            }
            unique_linkages = list_utilities.alist_keys(lw_cycl_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        return list_utilities.alist_values(lw_cycl_pairs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 56118L)
    public static SubLObject conjoin_ebmt_cycls(final SubLObject ebmt_cycls) {
        final SubLObject final_ebmt_cycl = copy_ebmt_cycl(ebmt_cycls.first());
        SubLObject cdolist_list_var = ebmt_cycls.rest();
        SubLObject ebmt_cycl = (SubLObject)ebmt_template_parser.NIL;
        ebmt_cycl = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            set_ebmt_cycl_cycl(final_ebmt_cycl, simplifier.conjoin((SubLObject)ConsesLow.list(get_ebmt_cycl_cycl(final_ebmt_cycl), get_ebmt_cycl_cycl(ebmt_cycl)), (SubLObject)ebmt_template_parser.T));
            set_ebmt_cycl_justification(final_ebmt_cycl, get_ebmt_cycl_justification(compose_ebmt_cycl_justifications(final_ebmt_cycl, ebmt_cycl)));
            set_ebmt_cycl_weight(final_ebmt_cycl, get_ebmt_cycl_weight(compose_ebmt_cycl_weight(final_ebmt_cycl, ebmt_cycl)));
            cdolist_list_var = cdolist_list_var.rest();
            ebmt_cycl = cdolist_list_var.first();
        }
        return final_ebmt_cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 56742L)
    public static SubLObject ebmt_merge_parse_parts(final SubLObject parse_parts, final SubLObject wff_check_mt) {
        final SubLObject cycl_parts = ebmt_relevant_cycl_parts(parse_parts, wff_check_mt);
        SubLObject parses = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = list_utilities.cross_products(cycl_parts);
        SubLObject cycl = (SubLObject)ebmt_template_parser.NIL;
        cycl = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            final SubLObject parse = (ebmt_template_parser.NIL != list_utilities.singletonP(cycl)) ? cycl.first() : conjoin_ebmt_cycls(cycl);
            if (ebmt_template_parser.NIL != wff_check_mt) {
                if (ebmt_template_parser.NIL != cyclifier.cyclifier_wffP(get_ebmt_cycl_cycl(parse), (SubLObject)ebmt_template_parser.UNPROVIDED)) {
                    parses = (SubLObject)ConsesLow.cons(parse, parses);
                }
            }
            else {
                parses = (SubLObject)ConsesLow.cons(parse, parses);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        }
        return parses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 57262L)
    public static SubLObject ebmt_parse(final SubLObject sent, SubLObject lexicon, SubLObject semantic_mt) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = new_ebmt_lexicon((SubLObject)ebmt_template_parser.UNPROVIDED);
        }
        if (semantic_mt == ebmt_template_parser.UNPROVIDED) {
            semantic_mt = ebmt_template_parser.$const68$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ebmt_template_parser.NIL != Types.stringp(sent) : sent;
        SubLObject err_msg = (SubLObject)ebmt_template_parser.NIL;
        SubLObject v_linkage = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cycls = (SubLObject)ebmt_template_parser.NIL;
        SubLObject justifications = (SubLObject)ebmt_template_parser.NIL;
        SubLObject weights = (SubLObject)ebmt_template_parser.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)ebmt_template_parser.$sym69$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    v_linkage = linkage.new_linkage(string_utilities.strip_sentential_punctuation(sent), (SubLObject)ConsesLow.list((SubLObject)ebmt_template_parser.$kw9$LEXICON, lexicon));
                    if (ebmt_template_parser.NIL == v_linkage) {
                        Errors.error((SubLObject)ebmt_template_parser.$str150$Failed_to_compute_a_linkage_for__, sent);
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
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)ebmt_template_parser.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (ebmt_template_parser.NIL != err_msg) {
            return Values.values((SubLObject)ebmt_template_parser.NIL, (SubLObject)ebmt_template_parser.NIL, (SubLObject)ebmt_template_parser.NIL, err_msg);
        }
        return Values.values(cycls, justifications, weights);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 58105L)
    public static SubLObject ebmt_parse_exclude_preds(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject values = (SubLObject)ebmt_template_parser.NIL;
        final SubLObject _prev_bind_0 = ebmt_template_parser.$ebmt_exclude_predsP$.currentBinding(thread);
        try {
            ebmt_template_parser.$ebmt_exclude_predsP$.bind((SubLObject)ebmt_template_parser.T, thread);
            values = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(ebmt_parse(string, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED)));
        }
        finally {
            ebmt_template_parser.$ebmt_exclude_predsP$.rebind(_prev_bind_0, thread);
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)ebmt_template_parser.$sym151$VALUES), values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 58364L)
    public static SubLObject ebmt_parse_linkage(final SubLObject v_linkage, final SubLObject sent, SubLObject lexicon, SubLObject semantic_mt) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = new_ebmt_lexicon((SubLObject)ebmt_template_parser.UNPROVIDED);
        }
        if (semantic_mt == ebmt_template_parser.UNPROVIDED) {
            semantic_mt = ebmt_template_parser.$const68$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject parse_parts = ebmt_parse_parts(v_linkage, (SubLObject)ebmt_template_parser.T, lexicon, sent);
        SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cycls = (SubLObject)ebmt_template_parser.NIL;
        SubLObject justifications = (SubLObject)ebmt_template_parser.NIL;
        SubLObject weights = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var;
        final SubLObject ebmt_cycls = cdolist_list_var = ebmt_merge_parse_parts(parse_parts, semantic_mt);
        SubLObject ebmt_cycl = (SubLObject)ebmt_template_parser.NIL;
        ebmt_cycl = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            if (ebmt_template_parser.NIL == subl_promotions.memberP(get_ebmt_cycl_cycl(ebmt_cycl), cycls, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED) || ebmt_template_parser.NIL == subl_promotions.memberP(get_ebmt_cycl_justification(ebmt_cycl), justifications, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
                cycls = (SubLObject)ConsesLow.cons(get_ebmt_cycl_cycl(ebmt_cycl), cycls);
                justifications = (SubLObject)ConsesLow.cons(get_ebmt_cycl_justification(ebmt_cycl), justifications);
                weights = (SubLObject)ConsesLow.cons(Numbers.divide(Sequences.length(get_ebmt_cycl_weight(ebmt_cycl)), Numbers.subtract(Sequences.length(instances.get_slot(v_linkage, (SubLObject)ebmt_template_parser.$sym60$WORDS)), (SubLObject)ebmt_template_parser.TWO_INTEGER)), weights);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ebmt_cycl = cdolist_list_var.first();
        }
        if (ebmt_template_parser.NIL == ebmt_cycls && ebmt_template_parser.NIL == error) {
            error = (SubLObject)ebmt_template_parser.$str152$Wff_checking_rejected_all_cycl_;
        }
        return Values.values(cycls, justifications, weights, error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 59296L)
    public static SubLObject ebmt_parse_from_template(final SubLObject nl_sentence, final SubLObject template, SubLObject lexicon, SubLObject semantic_mt, SubLObject with_varsP) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = new_ebmt_lexicon((SubLObject)ebmt_template_parser.UNPROVIDED);
        }
        if (semantic_mt == ebmt_template_parser.UNPROVIDED) {
            semantic_mt = ebmt_template_parser.$const68$InferencePSC;
        }
        if (with_varsP == ebmt_template_parser.UNPROVIDED) {
            with_varsP = (SubLObject)ebmt_template_parser.T;
        }
        final SubLObject v_linkage = linkage.new_linkage(string_utilities.strip_sentential_punctuation(nl_sentence), (SubLObject)ConsesLow.list((SubLObject)ebmt_template_parser.$kw9$LEXICON, lexicon));
        final SubLObject template_parsing_info_alist = ebmt_template_parsing_info_alist((SubLObject)ConsesLow.list(template), v_linkage);
        final SubLObject template_parsing_info = list_utilities.alist_lookup(template_parsing_info_alist, template, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
        final SubLObject ebmt_cycls = (SubLObject)((ebmt_template_parser.NIL != ebmt_template_parsing_info_p(template_parsing_info) && ebmt_template_parser.NIL != ebmt_template_parsing_info_processed(template_parsing_info)) ? ebmt_template_parsing_info_cycl(template_parsing_info) : ((ebmt_template_parser.NIL != list_utilities.non_empty_list_p(template_parsing_info_alist)) ? ebmt_parses_using_template(template, template_parsing_info_alist, v_linkage, with_varsP, nl_sentence) : ebmt_template_parser.NIL));
        return ebmt_cycls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 60201L)
    public static SubLObject ebmt_create_and_test_templates(final SubLObject training_nl, final SubLObject training_cycl, final SubLObject test_nl, SubLObject test_cycl, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject semantic_mt, SubLObject verboseP) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = new_ebmt_lexicon((SubLObject)ebmt_template_parser.UNPROVIDED);
        }
        if (allow_multiple_matchesP == ebmt_template_parser.UNPROVIDED) {
            allow_multiple_matchesP = (SubLObject)ebmt_template_parser.NIL;
        }
        if (semantic_mt == ebmt_template_parser.UNPROVIDED) {
            semantic_mt = ebmt_template_parser.$const68$InferencePSC;
        }
        if (verboseP == ebmt_template_parser.UNPROVIDED) {
            verboseP = (SubLObject)ebmt_template_parser.T;
        }
        assert ebmt_template_parser.NIL != Types.stringp(training_nl) : training_nl;
        assert ebmt_template_parser.NIL != cycl_grammar.cycl_sentence_p(training_cycl) : training_cycl;
        assert ebmt_template_parser.NIL != Types.stringp(test_nl) : test_nl;
        assert ebmt_template_parser.NIL != cycl_grammar.cycl_sentence_p(test_cycl) : test_cycl;
        test_cycl = ebmt_canonicalize_el_sentence(test_cycl, ebmt_template_parser.$const68$InferencePSC);
        final SubLObject templates = ebmt_create_templates(training_nl, training_cycl, lexicon, allow_multiple_matchesP, verboseP);
        SubLObject test_result = (SubLObject)ebmt_template_parser.$kw153$FAILURE;
        SubLObject other_parsesP = (SubLObject)ebmt_template_parser.NIL;
        SubLObject cdolist_list_var = templates;
        SubLObject template = (SubLObject)ebmt_template_parser.NIL;
        template = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            final SubLObject parse_result = ebmt_parse_from_template(test_nl, template, lexicon, semantic_mt, (SubLObject)ebmt_template_parser.UNPROVIDED);
            SubLObject template_test_result = (SubLObject)ebmt_template_parser.$kw153$FAILURE;
            SubLObject cdolist_list_var_$29 = parse_result;
            SubLObject ebmt_cycl = (SubLObject)ebmt_template_parser.NIL;
            ebmt_cycl = cdolist_list_var_$29.first();
            while (ebmt_template_parser.NIL != cdolist_list_var_$29) {
                final SubLObject result_cycl = get_ebmt_cycl_cycl(ebmt_cycl);
                if (result_cycl.equalp(test_cycl)) {
                    test_result = (SubLObject)ebmt_template_parser.$kw154$SUCCESS;
                    template_test_result = (SubLObject)ebmt_template_parser.$kw154$SUCCESS;
                }
                else {
                    other_parsesP = (SubLObject)ebmt_template_parser.T;
                }
                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                ebmt_cycl = cdolist_list_var_$29.first();
            }
            if (ebmt_template_parser.NIL != verboseP) {
                PrintLow.format((SubLObject)ebmt_template_parser.T, (SubLObject)ebmt_template_parser.$str155$__Template_Parse_Result___S___S__, template_test_result, parse_result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        }
        return Values.values(test_result, other_parsesP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 61679L)
    public static SubLObject ebmt_valid_training_cyclP(final SubLObject cycl) {
        if (ebmt_template_parser.NIL == cycl_grammar.cycl_sentence_p(cycl) || ebmt_template_parser.NIL != fort_types_interface.predicate_p(cycl_utilities.formula_arg1(cycl, (SubLObject)ebmt_template_parser.UNPROVIDED)) || ebmt_template_parser.NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(cycl), (SubLObject)ebmt_template_parser.$list156, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED)) {
            return (SubLObject)ebmt_template_parser.NIL;
        }
        return (SubLObject)ebmt_template_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 61912L)
    public static SubLObject ebmt_generate_random_samples_from_kb(SubLObject n, SubLObject verboseP) {
        if (n == ebmt_template_parser.UNPROVIDED) {
            n = (SubLObject)ebmt_template_parser.$int157$100;
        }
        if (verboseP == ebmt_template_parser.UNPROVIDED) {
            verboseP = (SubLObject)ebmt_template_parser.NIL;
        }
        SubLObject num_samples = (SubLObject)ebmt_template_parser.ZERO_INTEGER;
        while (num_samples.numL(n)) {
            final SubLObject cycl = cycl_utilities.hl_to_el(assertions_high.assertion_cons(assertions_high.random_assertion((SubLObject)ebmt_template_parser.UNPROVIDED)));
            if (ebmt_template_parser.NIL != cycl && ebmt_template_parser.NIL != ebmt_valid_training_cyclP(cycl)) {
                SubLObject cdolist_list_var;
                final SubLObject glosses = cdolist_list_var = pph_methods_lexicon.all_phrases_for_formula(cycl, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
                SubLObject gloss = (SubLObject)ebmt_template_parser.NIL;
                gloss = cdolist_list_var.first();
                while (ebmt_template_parser.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$30 = ebmt_create_and_add_templates(gloss, cycl, new_ebmt_lexicon((SubLObject)ebmt_template_parser.UNPROVIDED), (SubLObject)ebmt_template_parser.NIL, verboseP);
                    SubLObject template = (SubLObject)ebmt_template_parser.NIL;
                    template = cdolist_list_var_$30.first();
                    while (ebmt_template_parser.NIL != cdolist_list_var_$30) {
                        if (ebmt_template_indexing_result(template).equal((SubLObject)ebmt_template_parser.$str88$Added)) {
                            num_samples = Numbers.add(num_samples, (SubLObject)ebmt_template_parser.ONE_INTEGER);
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
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 62649L)
    public static SubLObject populate_ebmt_index_using_file(final SubLObject f_in, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = new_ebmt_lexicon((SubLObject)ebmt_template_parser.UNPROVIDED);
        }
        if (allow_multiple_matchesP == ebmt_template_parser.UNPROVIDED) {
            allow_multiple_matchesP = (SubLObject)ebmt_template_parser.NIL;
        }
        if (verboseP == ebmt_template_parser.UNPROVIDED) {
            verboseP = (SubLObject)ebmt_template_parser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template_counter = (SubLObject)ebmt_template_parser.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)ebmt_template_parser.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)ebmt_template_parser.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)ebmt_template_parser.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)ebmt_template_parser.$str158$Populating_EBMT_Template_Index___);
                SubLObject stream = (SubLObject)ebmt_template_parser.NIL;
                try {
                    final SubLObject _prev_bind_0_$31 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)ebmt_template_parser.NIL, thread);
                        stream = compatibility.open_text(f_in, (SubLObject)ebmt_template_parser.$kw84$INPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$31, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error((SubLObject)ebmt_template_parser.$str82$Unable_to_open__S, f_in);
                    }
                    final SubLObject stream_var = stream;
                    if (stream_var.isStream()) {
                        final SubLObject length_var = streams_high.file_length(stream_var);
                        final SubLObject stream_var_$32 = stream_var;
                        SubLObject line_number_var = (SubLObject)ebmt_template_parser.NIL;
                        SubLObject file_line = (SubLObject)ebmt_template_parser.NIL;
                        line_number_var = (SubLObject)ebmt_template_parser.ZERO_INTEGER;
                        for (file_line = file_utilities.do_stream_lines_get_next_line(stream_var_$32); ebmt_template_parser.NIL != file_line; file_line = file_utilities.do_stream_lines_get_next_line(stream_var_$32)) {
                            final SubLObject line = reader.read_from_string(file_line, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED, (SubLObject)ebmt_template_parser.UNPROVIDED);
                            SubLObject cdolist_list_var = ebmt_create_and_add_templates(line.first(), conses_high.second(line), lexicon, allow_multiple_matchesP, verboseP);
                            SubLObject template = (SubLObject)ebmt_template_parser.NIL;
                            template = cdolist_list_var.first();
                            while (ebmt_template_parser.NIL != cdolist_list_var) {
                                if (ebmt_template_indexing_result(template).equal((SubLObject)ebmt_template_parser.$str88$Added)) {
                                    template_counter = Numbers.add(template_counter, (SubLObject)ebmt_template_parser.ONE_INTEGER);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                template = cdolist_list_var.first();
                            }
                            utilities_macros.note_percent_progress(streams_high.file_position(stream_var, (SubLObject)ebmt_template_parser.UNPROVIDED), length_var);
                            line_number_var = number_utilities.f_1X(line_number_var);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_template_parser.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (stream.isStream()) {
                            streams_high.close(stream, (SubLObject)ebmt_template_parser.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ebmt_template_parser.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return template_counter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ebmt-template-parser.lisp", position = 63401L)
    public static SubLObject ebmt_populate_index_from_mt(SubLObject mt, SubLObject lexicon, SubLObject allow_multiple_matchesP, SubLObject verboseP) {
        if (mt == ebmt_template_parser.UNPROVIDED) {
            mt = ebmt_template_parser.$const159$AllEBMTTrainingExamplesCollectorM;
        }
        if (lexicon == ebmt_template_parser.UNPROVIDED) {
            lexicon = new_ebmt_lexicon((SubLObject)ebmt_template_parser.UNPROVIDED);
        }
        if (allow_multiple_matchesP == ebmt_template_parser.UNPROVIDED) {
            allow_multiple_matchesP = (SubLObject)ebmt_template_parser.NIL;
        }
        if (verboseP == ebmt_template_parser.UNPROVIDED) {
            verboseP = (SubLObject)ebmt_template_parser.NIL;
        }
        SubLObject num_templates = (SubLObject)ebmt_template_parser.ZERO_INTEGER;
        SubLObject cdolist_list_var = ask_utilities.query_template((SubLObject)ebmt_template_parser.$list160, (SubLObject)ebmt_template_parser.$list161, mt, (SubLObject)ebmt_template_parser.UNPROVIDED);
        SubLObject example = (SubLObject)ebmt_template_parser.NIL;
        example = cdolist_list_var.first();
        while (ebmt_template_parser.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$35 = ebmt_create_and_add_templates(example.first(), conses_high.second(example), lexicon, allow_multiple_matchesP, verboseP);
            SubLObject template = (SubLObject)ebmt_template_parser.NIL;
            template = cdolist_list_var_$35.first();
            while (ebmt_template_parser.NIL != cdolist_list_var_$35) {
                if (ebmt_template_indexing_result(template).equal((SubLObject)ebmt_template_parser.$str88$Added)) {
                    num_templates = Numbers.add(num_templates, (SubLObject)ebmt_template_parser.ONE_INTEGER);
                }
                cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                template = cdolist_list_var_$35.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            example = cdolist_list_var.first();
        }
        return num_templates;
    }
    
    public static SubLObject declare_ebmt_template_parser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "new_ebmt_lexicon", "NEW-EBMT-LEXICON", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_linkage", "EBMT-LINKAGE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_clear_caches", "EBMT-CLEAR-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_print_function_trampoline", "EBMT-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_p", "EBMT-TEMPLATE-P", 1, 0, false);
        new $ebmt_template_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_nl_cycl_pair", "EBMT-TEMPLATE-NL-CYCL-PAIR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_type", "EBMT-TEMPLATE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_links", "EBMT-TEMPLATE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_cycl", "EBMT-TEMPLATE-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_indexing_result", "EBMT-TEMPLATE-INDEXING-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_weight", "EBMT-TEMPLATE-WEIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "_csetf_ebmt_template_nl_cycl_pair", "_CSETF-EBMT-TEMPLATE-NL-CYCL-PAIR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "_csetf_ebmt_template_type", "_CSETF-EBMT-TEMPLATE-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "_csetf_ebmt_template_links", "_CSETF-EBMT-TEMPLATE-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "_csetf_ebmt_template_cycl", "_CSETF-EBMT-TEMPLATE-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "_csetf_ebmt_template_indexing_result", "_CSETF-EBMT-TEMPLATE-INDEXING-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "_csetf_ebmt_template_weight", "_CSETF-EBMT-TEMPLATE-WEIGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "make_ebmt_template", "MAKE-EBMT-TEMPLATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "visit_defstruct_ebmt_template", "VISIT-DEFSTRUCT-EBMT-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "visit_defstruct_object_ebmt_template_method", "VISIT-DEFSTRUCT-OBJECT-EBMT-TEMPLATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "new_ebmt_template", "NEW-EBMT-TEMPLATE", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_words", "EBMT-TEMPLATE-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "print_ebmt_template", "PRINT-EBMT-TEMPLATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_justification", "EBMT-TEMPLATE-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_linkage_and_mapped_terms", "EBMT-LINKAGE-AND-MAPPED-TERMS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ignore_terms_pattern", "IGNORE-TERMS-PATTERN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_ignorable_terms_in_training_string", "EBMT-IGNORABLE-TERMS-IN-TRAINING-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_remove_ignore_markers", "EBMT-REMOVE-IGNORE-MARKERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_linkset_from_linkage_links", "EBMT-LINKSET-FROM-LINKAGE-LINKS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "linkset_p", "LINKSET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "linkset_link_p", "LINKSET-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_link_name_argument_p", "EBMT-LINK-NAME-ARGUMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_link_name", "EBMT-LINK-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "new_linkset", "NEW-LINKSET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "get_linkset_unindexed_links", "GET-LINKSET-UNINDEXED-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "get_linkset_indexed_links", "GET-LINKSET-INDEXED-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "linkset_link_name", "LINKSET-LINK-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "linkset_link_left_word", "LINKSET-LINK-LEFT-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "linkset_link_left_word_string", "LINKSET-LINK-LEFT-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "linkset_link_left_word_index", "LINKSET-LINK-LEFT-WORD-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "linkset_link_right_word", "LINKSET-LINK-RIGHT-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "linkset_link_right_word_string", "LINKSET-LINK-RIGHT-WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "linkset_link_right_word_index", "LINKSET-LINK-RIGHT-WORD-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_linkset", "EBMT-LINKSET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_cycl_with_vars", "EBMT-CYCL-WITH-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_link_word", "EBMT-LINK-WORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_lw_offsets", "EBMT-LW-OFFSETS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_mapped_term_vars", "EBMT-MAPPED-TERM-VARS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_canonicalize_el_sentence", "EBMT-CANONICALIZE-EL-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_create_template", "EBMT-CREATE-TEMPLATE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_create_all_possible_training_examples", "EBMT-CREATE-ALL-POSSIBLE-TRAINING-EXAMPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_create_templates", "EBMT-CREATE-TEMPLATES", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_stringify_list", "EBMT-STRINGIFY-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_linkset_string", "EBMT-LINKSET-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_index_template_input", "EBMT-INDEX-TEMPLATE-INPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_index_server_info", "EBMT-TEMPLATE-INDEX-SERVER-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_update_log", "EBMT-UPDATE-LOG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_delete_example_from_file", "EBMT-DELETE-EXAMPLE-FROM-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_index_template_int", "EBMT-INDEX-TEMPLATE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_index_template", "EBMT-INDEX-TEMPLATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_create_and_add_templates", "EBMT-CREATE-AND-ADD-TEMPLATES", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_find_templates_for_linkage", "EBMT-FIND-TEMPLATES-FOR-LINKAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_find_templates", "EBMT-FIND-TEMPLATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_delete_template_int", "EBMT-DELETE-TEMPLATE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_delete_template", "EBMT-DELETE-TEMPLATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_delete_template_using_template_string", "EBMT-DELETE-TEMPLATE-USING-TEMPLATE-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_delete_template_using_parse", "EBMT-DELETE-TEMPLATE-USING-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_delete_templates_using_example", "EBMT-DELETE-TEMPLATES-USING-EXAMPLE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "new_ebmt_cycl", "NEW-EBMT-CYCL", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "copy_ebmt_cycl", "COPY-EBMT-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_cycl_p", "EBMT-CYCL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "set_ebmt_cycl_cycl", "SET-EBMT-CYCL-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "get_ebmt_cycl_cycl", "GET-EBMT-CYCL-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "set_ebmt_cycl_justification", "SET-EBMT-CYCL-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "get_ebmt_cycl_justification", "GET-EBMT-CYCL-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "set_ebmt_cycl_weight", "SET-EBMT-CYCL-WEIGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "get_ebmt_cycl_weight", "GET-EBMT-CYCL-WEIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "compose_ebmt_cycl_justifications", "COMPOSE-EBMT-CYCL-JUSTIFICATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "compose_ebmt_cycl_weight", "COMPOSE-EBMT-CYCL-WEIGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_cycl_subst", "EBMT-CYCL-SUBST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_parsing_info_print_function_trampoline", "EBMT-TEMPLATE-PARSING-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_parsing_info_p", "EBMT-TEMPLATE-PARSING-INFO-P", 1, 0, false);
        new $ebmt_template_parsing_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_parsing_info_kw_lw_pairs", "EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_parsing_info_lw_links_pairs", "EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_parsing_info_lw", "EBMT-TEMPLATE-PARSING-INFO-LW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_parsing_info_processed", "EBMT-TEMPLATE-PARSING-INFO-PROCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_parsing_info_cycl", "EBMT-TEMPLATE-PARSING-INFO-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "_csetf_ebmt_template_parsing_info_kw_lw_pairs", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "_csetf_ebmt_template_parsing_info_lw_links_pairs", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "_csetf_ebmt_template_parsing_info_lw", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "_csetf_ebmt_template_parsing_info_processed", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-PROCESSED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "_csetf_ebmt_template_parsing_info_cycl", "_CSETF-EBMT-TEMPLATE-PARSING-INFO-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "make_ebmt_template_parsing_info", "MAKE-EBMT-TEMPLATE-PARSING-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "visit_defstruct_ebmt_template_parsing_info", "VISIT-DEFSTRUCT-EBMT-TEMPLATE-PARSING-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "visit_defstruct_object_ebmt_template_parsing_info_method", "VISIT-DEFSTRUCT-OBJECT-EBMT-TEMPLATE-PARSING-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "new_ebmt_template_parsing_info", "NEW-EBMT-TEMPLATE-PARSING-INFO", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "print_ebmt_template_parsing_info", "PRINT-EBMT-TEMPLATE-PARSING-INFO", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_linkset_linkword_linkset_links_pairs", "EBMT-LINKSET-LINKWORD-LINKSET-LINKS-PAIRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_llw_lw_equalP", "EBMT-LLW-LW-EQUAL?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "link_tuple_equal", "LINK-TUPLE-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_keyword_linkword_pairs", "EBMT-KEYWORD-LINKWORD-PAIRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_templates_relevant_to_linkword", "EBMT-TEMPLATES-RELEVANT-TO-LINKWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_used_linkwords", "EBMT-USED-LINKWORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "strings_of_linkwords", "STRINGS-OF-LINKWORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "clear_ebmt_cycls_for_phrase", "CLEAR-EBMT-CYCLS-FOR-PHRASE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "remove_ebmt_cycls_for_phrase", "REMOVE-EBMT-CYCLS-FOR-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_cycls_for_phrase_internal", "EBMT-CYCLS-FOR-PHRASE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_cycls_for_phrase", "EBMT-CYCLS-FOR-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_penntag_to_cycl_category", "EBMT-PENNTAG-TO-CYCL-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_cycls_using_link_word_only", "EBMT-CYCLS-USING-LINK-WORD-ONLY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_cycls_for_link_word", "EBMT-CYCLS-FOR-LINK-WORD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_keyword_cycls_pairs", "EBMT-KEYWORD-CYCLS-PAIRS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_remove_invalid_cycls", "EBMT-REMOVE-INVALID-CYCLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_parses_using_template", "EBMT-PARSES-USING-TEMPLATE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_template_parsing_info_alist", "EBMT-TEMPLATE-PARSING-INFO-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_parse_parts", "EBMT-PARSE-PARTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_relevant_cycl_parts", "EBMT-RELEVANT-CYCL-PARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "conjoin_ebmt_cycls", "CONJOIN-EBMT-CYCLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_merge_parse_parts", "EBMT-MERGE-PARSE-PARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_parse", "EBMT-PARSE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_parse_exclude_preds", "EBMT-PARSE-EXCLUDE-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_parse_linkage", "EBMT-PARSE-LINKAGE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_parse_from_template", "EBMT-PARSE-FROM-TEMPLATE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_create_and_test_templates", "EBMT-CREATE-AND-TEST-TEMPLATES", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_valid_training_cyclP", "EBMT-VALID-TRAINING-CYCL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_generate_random_samples_from_kb", "EBMT-GENERATE-RANDOM-SAMPLES-FROM-KB", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "populate_ebmt_index_using_file", "POPULATE-EBMT-INDEX-USING-FILE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ebmt_template_parser", "ebmt_populate_index_from_mt", "EBMT-POPULATE-INDEX-FROM-MT", 0, 4, false);
        return (SubLObject)ebmt_template_parser.NIL;
    }
    
    public static SubLObject init_ebmt_template_parser_file() {
        ebmt_template_parser.$ebmt_exclude_predsP$ = SubLFiles.defparameter("*EBMT-EXCLUDE-PREDS?*", (SubLObject)ebmt_template_parser.NIL);
        ebmt_template_parser.$ebmt_phrase_interp_timeout$ = SubLFiles.defparameter("*EBMT-PHRASE-INTERP-TIMEOUT*", (SubLObject)ebmt_template_parser.$int0$30);
        ebmt_template_parser.$dtp_ebmt_template$ = SubLFiles.defconstant("*DTP-EBMT-TEMPLATE*", (SubLObject)ebmt_template_parser.$sym14$EBMT_TEMPLATE);
        ebmt_template_parser.$ignore_terms_pattern$ = SubLFiles.defparameter("*IGNORE-TERMS-PATTERN*", (SubLObject)ebmt_template_parser.$kw49$UNINITIALIZED);
        ebmt_template_parser.$dtp_ebmt_template_parsing_info$ = SubLFiles.defconstant("*DTP-EBMT-TEMPLATE-PARSING-INFO*", (SubLObject)ebmt_template_parser.$sym96$EBMT_TEMPLATE_PARSING_INFO);
        ebmt_template_parser.$ebmt_cycls_for_phrase_caching_state$ = SubLFiles.deflexical("*EBMT-CYCLS-FOR-PHRASE-CACHING-STATE*", (SubLObject)ebmt_template_parser.NIL);
        return (SubLObject)ebmt_template_parser.NIL;
    }
    
    public static SubLObject setup_ebmt_template_parser_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), ebmt_template_parser.$dtp_ebmt_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)ebmt_template_parser.$sym21$EBMT_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)ebmt_template_parser.$list22);
        Structures.def_csetf((SubLObject)ebmt_template_parser.$sym23$EBMT_TEMPLATE_NL_CYCL_PAIR, (SubLObject)ebmt_template_parser.$sym24$_CSETF_EBMT_TEMPLATE_NL_CYCL_PAIR);
        Structures.def_csetf((SubLObject)ebmt_template_parser.$sym25$EBMT_TEMPLATE_TYPE, (SubLObject)ebmt_template_parser.$sym26$_CSETF_EBMT_TEMPLATE_TYPE);
        Structures.def_csetf((SubLObject)ebmt_template_parser.$sym27$EBMT_TEMPLATE_LINKS, (SubLObject)ebmt_template_parser.$sym28$_CSETF_EBMT_TEMPLATE_LINKS);
        Structures.def_csetf((SubLObject)ebmt_template_parser.$sym29$EBMT_TEMPLATE_CYCL, (SubLObject)ebmt_template_parser.$sym30$_CSETF_EBMT_TEMPLATE_CYCL);
        Structures.def_csetf((SubLObject)ebmt_template_parser.$sym31$EBMT_TEMPLATE_INDEXING_RESULT, (SubLObject)ebmt_template_parser.$sym32$_CSETF_EBMT_TEMPLATE_INDEXING_RESULT);
        Structures.def_csetf((SubLObject)ebmt_template_parser.$sym33$EBMT_TEMPLATE_WEIGHT, (SubLObject)ebmt_template_parser.$sym34$_CSETF_EBMT_TEMPLATE_WEIGHT);
        Equality.identity((SubLObject)ebmt_template_parser.$sym14$EBMT_TEMPLATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), ebmt_template_parser.$dtp_ebmt_template$.getGlobalValue(), Symbols.symbol_function((SubLObject)ebmt_template_parser.$sym46$VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), ebmt_template_parser.$dtp_ebmt_template_parsing_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)ebmt_template_parser.$sym103$EBMT_TEMPLATE_PARSING_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)ebmt_template_parser.$list104);
        Structures.def_csetf((SubLObject)ebmt_template_parser.$sym105$EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS, (SubLObject)ebmt_template_parser.$sym106$_CSETF_EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS);
        Structures.def_csetf((SubLObject)ebmt_template_parser.$sym107$EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS, (SubLObject)ebmt_template_parser.$sym108$_CSETF_EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS);
        Structures.def_csetf((SubLObject)ebmt_template_parser.$sym109$EBMT_TEMPLATE_PARSING_INFO_LW, (SubLObject)ebmt_template_parser.$sym110$_CSETF_EBMT_TEMPLATE_PARSING_INFO_LW);
        Structures.def_csetf((SubLObject)ebmt_template_parser.$sym111$EBMT_TEMPLATE_PARSING_INFO_PROCESSED, (SubLObject)ebmt_template_parser.$sym112$_CSETF_EBMT_TEMPLATE_PARSING_INFO_PROCESSED);
        Structures.def_csetf((SubLObject)ebmt_template_parser.$sym113$EBMT_TEMPLATE_PARSING_INFO_CYCL, (SubLObject)ebmt_template_parser.$sym114$_CSETF_EBMT_TEMPLATE_PARSING_INFO_CYCL);
        Equality.identity((SubLObject)ebmt_template_parser.$sym96$EBMT_TEMPLATE_PARSING_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), ebmt_template_parser.$dtp_ebmt_template_parsing_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)ebmt_template_parser.$sym120$VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_PARSING_INFO_METHOD));
        memoization_state.note_globally_cached_function((SubLObject)ebmt_template_parser.$sym127$EBMT_CYCLS_FOR_PHRASE);
        return (SubLObject)ebmt_template_parser.NIL;
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
    
    static {
        me = (SubLFile)new ebmt_template_parser();
        ebmt_template_parser.$ebmt_exclude_predsP$ = null;
        ebmt_template_parser.$ebmt_phrase_interp_timeout$ = null;
        ebmt_template_parser.$dtp_ebmt_template$ = null;
        ebmt_template_parser.$ignore_terms_pattern$ = null;
        ebmt_template_parser.$dtp_ebmt_template_parsing_info$ = null;
        ebmt_template_parser.$ebmt_cycls_for_phrase_caching_state$ = null;
        $int0$30 = SubLObjectFactory.makeInteger(30);
        $sym1$SEMTRANS_LEXICON = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON");
        $sym2$SET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY");
        $kw3$OFF = SubLObjectFactory.makeKeyword("OFF");
        $sym4$GET = SubLObjectFactory.makeSymbol("GET");
        $sym5$LEX_ENTRY = SubLObjectFactory.makeSymbol("LEX-ENTRY");
        $sym6$SET = SubLObjectFactory.makeSymbol("SET");
        $kw7$STRING = SubLObjectFactory.makeKeyword("STRING");
        $sym8$ADD = SubLObjectFactory.makeSymbol("ADD");
        $kw9$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $str10$No_word_linkage_found_for___S = SubLObjectFactory.makeString("No word-linkage found for: ~S");
        $str11$A_word_linkage_with_unknown_words = SubLObjectFactory.makeString("A word-linkage with unknown words was found for: ~S");
        $sym12$FORGET = SubLObjectFactory.makeSymbol("FORGET");
        $kw13$CLEARED = SubLObjectFactory.makeKeyword("CLEARED");
        $sym14$EBMT_TEMPLATE = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE");
        $sym15$EBMT_TEMPLATE_P = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-P");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-CYCL-PAIR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXING-RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("WEIGHT"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NL-CYCL-PAIR"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("LINKS"), (SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("INDEXING-RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("WEIGHT"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-NL-CYCL-PAIR"), (SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-INDEXING-RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-WEIGHT"));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-NL-CYCL-PAIR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-INDEXING-RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-WEIGHT"));
        $sym20$PRINT_EBMT_TEMPLATE = SubLObjectFactory.makeSymbol("PRINT-EBMT-TEMPLATE");
        $sym21$EBMT_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-P"));
        $sym23$EBMT_TEMPLATE_NL_CYCL_PAIR = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-NL-CYCL-PAIR");
        $sym24$_CSETF_EBMT_TEMPLATE_NL_CYCL_PAIR = SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-NL-CYCL-PAIR");
        $sym25$EBMT_TEMPLATE_TYPE = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-TYPE");
        $sym26$_CSETF_EBMT_TEMPLATE_TYPE = SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-TYPE");
        $sym27$EBMT_TEMPLATE_LINKS = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-LINKS");
        $sym28$_CSETF_EBMT_TEMPLATE_LINKS = SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-LINKS");
        $sym29$EBMT_TEMPLATE_CYCL = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-CYCL");
        $sym30$_CSETF_EBMT_TEMPLATE_CYCL = SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-CYCL");
        $sym31$EBMT_TEMPLATE_INDEXING_RESULT = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-INDEXING-RESULT");
        $sym32$_CSETF_EBMT_TEMPLATE_INDEXING_RESULT = SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-INDEXING-RESULT");
        $sym33$EBMT_TEMPLATE_WEIGHT = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-WEIGHT");
        $sym34$_CSETF_EBMT_TEMPLATE_WEIGHT = SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-WEIGHT");
        $kw35$NL_CYCL_PAIR = SubLObjectFactory.makeKeyword("NL-CYCL-PAIR");
        $kw36$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw37$LINKS = SubLObjectFactory.makeKeyword("LINKS");
        $kw38$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw39$INDEXING_RESULT = SubLObjectFactory.makeKeyword("INDEXING-RESULT");
        $kw40$WEIGHT = SubLObjectFactory.makeKeyword("WEIGHT");
        $str41$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw42$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym43$MAKE_EBMT_TEMPLATE = SubLObjectFactory.makeSymbol("MAKE-EBMT-TEMPLATE");
        $kw44$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw45$END = SubLObjectFactory.makeKeyword("END");
        $sym46$VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-EBMT-TEMPLATE-METHOD");
        $sym47$_ = SubLObjectFactory.makeSymbol("<");
        $str48$__TEMPLATE_____Words___S____Links = SubLObjectFactory.makeString("#<TEMPLATE:~%  Words: ~S~%  Links: ~S~%  CycL: ~S~%  Weight: ~S~%>~%");
        $kw49$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str50$______________ = SubLObjectFactory.makeString("\\{([^\\}\\{]*)\\}");
        $str51$Unable_to_initialize__A__ = SubLObjectFactory.makeString("Unable to initialize ~A~%");
        $str52$_ = SubLObjectFactory.makeString("}");
        $str53$_ = SubLObjectFactory.makeString("{");
        $sym54$GET_INDEX = SubLObjectFactory.makeSymbol("GET-INDEX");
        $sym55$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $str56$IGNORE_ = SubLObjectFactory.makeString("IGNORE-");
        $sym57$LINKSET_LINK_P = SubLObjectFactory.makeSymbol("LINKSET-LINK-P");
        $sym58$EBMT_LINK_NAME_ARGUMENT_P = SubLObjectFactory.makeSymbol("EBMT-LINK-NAME-ARGUMENT-P");
        $sym59$LINKS = SubLObjectFactory.makeSymbol("LINKS");
        $sym60$WORDS = SubLObjectFactory.makeSymbol("WORDS");
        $str61$__A_Za_z0_9__ = SubLObjectFactory.makeString("[^A-Za-z0-9](");
        $str62$___A_Za_z0_9_ = SubLObjectFactory.makeString(")[^A-Za-z0-9]");
        $str63$_b_ = SubLObjectFactory.makeString("\\b(");
        $str64$__b = SubLObjectFactory.makeString(")\\b");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CASELESS"));
        $str66$_VAR = SubLObjectFactory.makeString(":VAR");
        $sym67$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $const68$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym69$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str70$__ = SubLObjectFactory.makeString("~~");
        $str71$_ = SubLObjectFactory.makeString("~");
        $kw72$GENERAL = SubLObjectFactory.makeKeyword("GENERAL");
        $kw73$SPECIFIC = SubLObjectFactory.makeKeyword("SPECIFIC");
        $sym74$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym75$CYCL_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P");
        $str76$__NL___S__CycL____S___S__ = SubLObjectFactory.makeString("~%NL: ~S~%CycL:~%~S~%~S~%");
        $kw77$VAR = SubLObjectFactory.makeKeyword("VAR");
        $sym78$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $kw79$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str80$Unknown_EBMT_lexicon___S__ = SubLObjectFactory.makeString("Unknown EBMT lexicon: ~S~%");
        $kw81$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str82$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str83$_A__A__ = SubLObjectFactory.makeString("~A ~A~%");
        $kw84$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str85$__ = SubLObjectFactory.makeString(" (");
        $str86$___ = SubLObjectFactory.makeString("): ");
        $str87$_A_____S__ = SubLObjectFactory.makeString("~A: ~%~S~%");
        $str88$Added = SubLObjectFactory.makeString("Added");
        $str89$_S__ = SubLObjectFactory.makeString("~S~%");
        $str90$Found_ = SubLObjectFactory.makeString("Found ");
        $str91$_templates_for_linkset__ = SubLObjectFactory.makeString(" templates for linkset: ");
        $kw92$DONE = SubLObjectFactory.makeKeyword("DONE");
        $str93$Deleted = SubLObjectFactory.makeString("Deleted");
        $str94$_A__ = SubLObjectFactory.makeString("~A~%");
        $kw95$JUSTIFICATION = SubLObjectFactory.makeKeyword("JUSTIFICATION");
        $sym96$EBMT_TEMPLATE_PARSING_INFO = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO");
        $sym97$EBMT_TEMPLATE_PARSING_INFO_P = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-P");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KW-LW-PAIRS"), (SubLObject)SubLObjectFactory.makeSymbol("LW-LINKS-PAIRS"), (SubLObject)SubLObjectFactory.makeSymbol("LW"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESSED"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"));
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KW-LW-PAIRS"), (SubLObject)SubLObjectFactory.makeKeyword("LW-LINKS-PAIRS"), (SubLObject)SubLObjectFactory.makeKeyword("LW"), (SubLObject)SubLObjectFactory.makeKeyword("PROCESSED"), (SubLObject)SubLObjectFactory.makeKeyword("CYCL"));
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS"), (SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS"), (SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-LW"), (SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-PROCESSED"), (SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-CYCL"));
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-PROCESSED"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-CYCL"));
        $sym102$PRINT_EBMT_TEMPLATE_PARSING_INFO = SubLObjectFactory.makeSymbol("PRINT-EBMT-TEMPLATE-PARSING-INFO");
        $sym103$EBMT_TEMPLATE_PARSING_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-P"));
        $sym105$EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS");
        $sym106$_CSETF_EBMT_TEMPLATE_PARSING_INFO_KW_LW_PAIRS = SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-KW-LW-PAIRS");
        $sym107$EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS");
        $sym108$_CSETF_EBMT_TEMPLATE_PARSING_INFO_LW_LINKS_PAIRS = SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW-LINKS-PAIRS");
        $sym109$EBMT_TEMPLATE_PARSING_INFO_LW = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-LW");
        $sym110$_CSETF_EBMT_TEMPLATE_PARSING_INFO_LW = SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-LW");
        $sym111$EBMT_TEMPLATE_PARSING_INFO_PROCESSED = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-PROCESSED");
        $sym112$_CSETF_EBMT_TEMPLATE_PARSING_INFO_PROCESSED = SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-PROCESSED");
        $sym113$EBMT_TEMPLATE_PARSING_INFO_CYCL = SubLObjectFactory.makeSymbol("EBMT-TEMPLATE-PARSING-INFO-CYCL");
        $sym114$_CSETF_EBMT_TEMPLATE_PARSING_INFO_CYCL = SubLObjectFactory.makeSymbol("_CSETF-EBMT-TEMPLATE-PARSING-INFO-CYCL");
        $kw115$KW_LW_PAIRS = SubLObjectFactory.makeKeyword("KW-LW-PAIRS");
        $kw116$LW_LINKS_PAIRS = SubLObjectFactory.makeKeyword("LW-LINKS-PAIRS");
        $kw117$LW = SubLObjectFactory.makeKeyword("LW");
        $kw118$PROCESSED = SubLObjectFactory.makeKeyword("PROCESSED");
        $sym119$MAKE_EBMT_TEMPLATE_PARSING_INFO = SubLObjectFactory.makeSymbol("MAKE-EBMT-TEMPLATE-PARSING-INFO");
        $sym120$VISIT_DEFSTRUCT_OBJECT_EBMT_TEMPLATE_PARSING_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-EBMT-TEMPLATE-PARSING-INFO-METHOD");
        $str121$__TEMPLATE_PARSING_INFO______Keyw = SubLObjectFactory.makeString("#<TEMPLATE-PARSING-INFO: ~%  Keyword-Linkword pairs: ~S~%  Linkword-Links pairs: ~S~%  Linkwords: ~S~%  Processed: ~S~%  CycL: ~S~%>");
        $sym122$GET_LINKS = SubLObjectFactory.makeSymbol("GET-LINKS");
        $sym123$LINK_TUPLE_EQUAL = SubLObjectFactory.makeSymbol("LINK-TUPLE-EQUAL");
        $str124$a = SubLObjectFactory.makeString("a");
        $str125$an = SubLObjectFactory.makeString("an");
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("START"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("END"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DELTA"));
        $sym127$EBMT_CYCLS_FOR_PHRASE = SubLObjectFactory.makeSymbol("EBMT-CYCLS-FOR-PHRASE");
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SententialConstituent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase")));
        $list129 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScalarInterval")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date")));
        $sym130$EQUALS_EL_ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $list131 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun")));
        $kw132$BEST_ONLY = SubLObjectFactory.makeKeyword("BEST-ONLY");
        $const133$familyName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("familyName"));
        $const134$PhraseFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn"));
        $sym135$_EBMT_CYCLS_FOR_PHRASE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*EBMT-CYCLS-FOR-PHRASE-CACHING-STATE*");
        $int136$5000 = SubLObjectFactory.makeInteger(5000);
        $const137$ProperNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"));
        $const138$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $kw139$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym140$PREPOSITION_LINK_WORD_P = SubLObjectFactory.makeSymbol("PREPOSITION-LINK-WORD-P");
        $sym141$GET_MODIFIERS = SubLObjectFactory.makeSymbol("GET-MODIFIERS");
        $sym142$GET_LINK_WORD_ABS_INDEX = SubLObjectFactory.makeSymbol("GET-LINK-WORD-ABS-INDEX");
        $sym143$GET_POS = SubLObjectFactory.makeSymbol("GET-POS");
        $sym144$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $sym145$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $sym146$GET_HEAD_DAUGHTER = SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTER");
        $str147$Unable_to_understand_some_of_the_ = SubLObjectFactory.makeString("Unable to understand some of the tokens in the sentence.");
        $str148$No_matching_templates_found_ = SubLObjectFactory.makeString("No matching templates found.");
        $sym149$SETS_EQUAL_ = SubLObjectFactory.makeSymbol("SETS-EQUAL?");
        $str150$Failed_to_compute_a_linkage_for__ = SubLObjectFactory.makeString("Failed to compute a linkage for: ~S");
        $sym151$VALUES = SubLObjectFactory.makeSymbol("VALUES");
        $str152$Wff_checking_rejected_all_cycl_ = SubLObjectFactory.makeString("Wff checking rejected all cycl.");
        $kw153$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $kw154$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $str155$__Template_Parse_Result___S___S__ = SubLObjectFactory.makeString("~%Template Parse Result: ~S~%~S~%");
        $list156 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cycSecureDocString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")));
        $int157$100 = SubLObjectFactory.makeInteger(100);
        $str158$Populating_EBMT_Template_Index___ = SubLObjectFactory.makeString("Populating EBMT Template Index ...");
        $const159$AllEBMTTrainingExamplesCollectorM = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllEBMTTrainingExamplesCollectorMt"));
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NL"), (SubLObject)SubLObjectFactory.makeSymbol("?CYCL"));
        $list161 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?QUOTEDCYCL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ebmtNLToCycLTrainingExample")), (SubLObject)SubLObjectFactory.makeSymbol("?NL"), (SubLObject)SubLObjectFactory.makeSymbol("?QUOTEDCYCL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), (SubLObject)SubLObjectFactory.makeSymbol("?QUOTEDCYCL"), (SubLObject)SubLObjectFactory.makeSymbol("?CYCL"))));
    }
    
    public static final class $ebmt_template_native extends SubLStructNative
    {
        public SubLObject $nl_cycl_pair;
        public SubLObject $type;
        public SubLObject $links;
        public SubLObject $cycl;
        public SubLObject $indexing_result;
        public SubLObject $weight;
        private static final SubLStructDeclNative structDecl;
        
        public $ebmt_template_native() {
            this.$nl_cycl_pair = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$links = (SubLObject)CommonSymbols.NIL;
            this.$cycl = (SubLObject)CommonSymbols.NIL;
            this.$indexing_result = (SubLObject)CommonSymbols.NIL;
            this.$weight = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ebmt_template_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$nl_cycl_pair;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$type;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$links;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$cycl;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$indexing_result;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$weight;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$nl_cycl_pair = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$links = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$cycl = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$indexing_result = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$weight = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$ebmt_template_native.class, ebmt_template_parser.$sym14$EBMT_TEMPLATE, ebmt_template_parser.$sym15$EBMT_TEMPLATE_P, ebmt_template_parser.$list16, ebmt_template_parser.$list17, new String[] { "$nl_cycl_pair", "$type", "$links", "$cycl", "$indexing_result", "$weight" }, ebmt_template_parser.$list18, ebmt_template_parser.$list19, ebmt_template_parser.$sym20$PRINT_EBMT_TEMPLATE);
        }
    }
    
    public static final class $ebmt_template_p$UnaryFunction extends UnaryFunction
    {
        public $ebmt_template_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EBMT-TEMPLATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return ebmt_template_parser.ebmt_template_p(arg1);
        }
    }
    
    public static final class $ebmt_template_parsing_info_native extends SubLStructNative
    {
        public SubLObject $kw_lw_pairs;
        public SubLObject $lw_links_pairs;
        public SubLObject $lw;
        public SubLObject $processed;
        public SubLObject $cycl;
        private static final SubLStructDeclNative structDecl;
        
        public $ebmt_template_parsing_info_native() {
            this.$kw_lw_pairs = (SubLObject)CommonSymbols.NIL;
            this.$lw_links_pairs = (SubLObject)CommonSymbols.NIL;
            this.$lw = (SubLObject)CommonSymbols.NIL;
            this.$processed = (SubLObject)CommonSymbols.NIL;
            this.$cycl = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ebmt_template_parsing_info_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$kw_lw_pairs;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$lw_links_pairs;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$lw;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$processed;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$cycl;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$kw_lw_pairs = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$lw_links_pairs = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$lw = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$processed = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$cycl = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$ebmt_template_parsing_info_native.class, ebmt_template_parser.$sym96$EBMT_TEMPLATE_PARSING_INFO, ebmt_template_parser.$sym97$EBMT_TEMPLATE_PARSING_INFO_P, ebmt_template_parser.$list98, ebmt_template_parser.$list99, new String[] { "$kw_lw_pairs", "$lw_links_pairs", "$lw", "$processed", "$cycl" }, ebmt_template_parser.$list100, ebmt_template_parser.$list101, ebmt_template_parser.$sym102$PRINT_EBMT_TEMPLATE_PARSING_INFO);
        }
    }
    
    public static final class $ebmt_template_parsing_info_p$UnaryFunction extends UnaryFunction
    {
        public $ebmt_template_parsing_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EBMT-TEMPLATE-PARSING-INFO-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return ebmt_template_parser.ebmt_template_parsing_info_p(arg1);
        }
    }
}

/*

	Total time: 806 ms
	
*/