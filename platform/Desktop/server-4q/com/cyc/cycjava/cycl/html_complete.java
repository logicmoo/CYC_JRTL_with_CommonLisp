package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_complete extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.html_complete";
    public static final String myFingerPrint = "f202f7e30f10925923ab306fac88cc9184a5f4f2aeac700c734a03736e0210f4";
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 916L)
    public static SubLSymbol $cb_enable_constant_completion$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 1041L)
    public static SubLSymbol $cb_pop_up_constant_completion$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 1163L)
    public static SubLSymbol $cb_constant_completion_target$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 1300L)
    private static SubLSymbol $html_complete_button_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 3140L)
    private static SubLSymbol $html_cyclify_button_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 3827L)
    private static SubLSymbol $html_complete_script_parameters$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 4228L)
    private static SubLSymbol $html_intial_focus_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 4513L)
    private static SubLSymbol $html_opener_message_on_load_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 4777L)
    private static SubLSymbol $html_handle_complete_script_parameters$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 5030L)
    private static SubLSymbol $html_handle_complete_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 7388L)
    public static SubLSymbol $html_immediate_complete_extend_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 7626L)
    public static SubLSymbol $html_immediate_complete_choose_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 15585L)
    private static SubLSymbol $html_complete_insert_choice_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 16069L)
    public static SubLSymbol $js_autocomplete_setup$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 19154L)
    private static SubLSymbol $autocomplete_default_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 23510L)
    private static SubLSymbol $get_isa_restrictions_from_sentence_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 23874L)
    private static SubLSymbol $get_genls_restrictions_from_sentence_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 24404L)
    private static SubLSymbol $get_arg_constraints_for_arg_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 24926L)
    private static SubLSymbol $get_arg_constraints_for_var_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 27364L)
    private static SubLSymbol $completion_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 38666L)
    private static SubLSymbol $term_passes_arg_restrictions_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 41028L)
    private static SubLSymbol $autocomplete_isa_cache_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 41122L)
    private static SubLSymbol $autocomplete_genls_cache_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 41219L)
    private static SubLSymbol $autocomplete_isa_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 41290L)
    private static SubLSymbol $autocomplete_genls_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 48181L)
    private static SubLSymbol $html_handle_cyclify_script_parameters$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 48397L)
    private static SubLSymbol $html_handle_cyclify_script$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 49892L)
    private static SubLSymbol $html_immediate_perform_cyclify_script_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 49990L)
    private static SubLSymbol $html_immediate_perform_cyclify_script_postfix$;
    private static final SubLString $str0$completions;
    private static final SubLString $str1$onClick__constant_complete___A___;
    private static final SubLString $str2$Complete;
    private static final SubLString $str3$;
    private static final SubLSymbol $sym4$STRINGP;
    private static final SubLObject $const5$Thing;
    private static final SubLSymbol $sym6$FORT_P;
    private static final SubLString $str7$true;
    private static final SubLString $str8$false;
    private static final SubLString $str9$constant_complete__;
    private static final SubLString $str10$___;
    private static final SubLString $str11$___;
    private static final SubLString $str12$__;
    private static final SubLString $str13$__;
    private static final SubLString $str14$onClick__cyclify___A____;
    private static final SubLString $str15$Cyclify;
    private static final SubLString $str16$javascript_void____;
    private static final SubLString $str17$_var_cgi_program_____A___var_comp;
    private static final SubLSymbol $kw18$CONSTANT_COMPLETION;
    private static final SubLString $str19$_if__window_focus__window_focus__;
    private static final SubLString $str20$_if__window_opener__window_opener;
    private static final SubLString $str21$_var_form_number____A__var_elemen;
    private static final SubLString $str22$_var_old_length____1___function_c;
    private static final SubLString $str23$_complete_extend___A____;
    private static final SubLString $str24$_complete_choose___A____A___;
    private static final SubLString $str25$form;
    private static final SubLString $str26$input;
    private static final SubLString $str27$prefix;
    private static final SubLString $str28$submit;
    private static final SubLString $str29$filter;
    private static final SubLString $str30$choices;
    private static final SubLString $str31$case_insensitive;
    private static final SubLString $str32$lexical;
    private static final SubLSymbol $sym33$CB_COMPLETE;
    private static final SubLSymbol $kw34$HTML_HANDLER;
    private static final SubLSymbol $sym35$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const36$EverythingPSC;
    private static final SubLInteger $int37$50;
    private static final SubLSymbol $sym38$CONSTANT_P;
    private static final SubLSymbol $sym39$STRING_;
    private static final SubLSymbol $sym40$CONSTANT_NAME;
    private static final SubLSymbol $sym41$STRING_LESSP;
    private static final SubLSymbol $sym42$COMPLETION_STRING;
    private static final SubLString $str43$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str44$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw45$UNINITIALIZED;
    private static final SubLString $str46$Exact_match_plus_one_longer_compl;
    private static final SubLString $str47$Exact_match_plus__S_longer_comple;
    private static final SubLString $str48$_S_possible__A_;
    private static final SubLString $str49$suggestions;
    private static final SubLString $str50$Extension__;
    private static final SubLSymbol $kw51$RED;
    private static final SubLString $str52$_Suggestions_;
    private static final SubLString $str53$_Completions_;
    private static final SubLString $str54$Constants___A__;
    private static final SubLString $str55$Lexical_Strings___A__;
    private static final SubLString $str56$Sole_completion__already_complete;
    private static final SubLString $str57$Sole_completion_;
    private static final SubLString $str58$Already_completed_;
    private static final SubLString $str59$Sole_completion_;
    private static final SubLString $str60$No_completions_;
    private static final SubLString $str61$No_suggestions_;
    private static final SubLString $str62$No_completions;
    private static final SubLString $str63$No_suggestions;
    private static final SubLString $str64$Suggestions;
    private static final SubLString $str65$Completions;
    private static final SubLString $str66$Machine__;
    private static final SubLString $str67$Prefix__;
    private static final SubLString $str68$Filter__;
    private static final SubLString $str69$onClick__complete_choose___A____A;
    private static final SubLString $str70$complete;
    private static final SubLString $str71$var_constantCompleteDataSource___;
    private static final SubLSymbol $sym72$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT;
    private static final SubLSymbol $sym73$HTML_PRINT_JS_AUTOCOMPLETE_SETUP;
    private static final SubLString $str74$_filter_;
    private static final SubLSymbol $kw75$AUTOCOMPLETE;
    private static final SubLString $str76$text_javascript;
    private static final SubLSymbol $sym77$XML_TERM_SEARCH;
    private static final SubLString $str78$searchString;
    private static final SubLString $str79$caseSensitive;
    private static final SubLString $str80$return_attrs;
    private static final SubLList $list81;
    private static final SubLString $str82$timeout;
    private static final SubLString $str83$count;
    private static final SubLList $list84;
    private static final SubLSymbol $kw85$DEFAULT;
    private static final SubLSymbol $sym86$_EXIT;
    private static final SubLSymbol $kw87$XML_HANDLER;
    private static final SubLSymbol $sym88$XML_COMPLETE;
    private static final SubLSymbol $kw89$COMPLETE_ON_CONSTANTS_;
    private static final SubLSymbol $kw90$PREFER_HISTORY_TERMS_;
    private static final SubLString $str91$preferHistory;
    private static final SubLSymbol $kw92$LEXICON;
    private static final SubLSymbol $kw93$CASE_SENSITIVE_;
    private static final SubLSymbol $kw94$RETURN_ATTRS;
    private static final SubLList $list95;
    private static final SubLSymbol $kw96$TIMEOUT;
    private static final SubLSymbol $kw97$LIMIT;
    private static final SubLSymbol $kw98$MT;
    private static final SubLString $str99$mt;
    private static final SubLObject $const100$InferencePSC;
    private static final SubLSymbol $kw101$ISA_FILTER;
    private static final SubLSymbol $kw102$GENLS_FILTER;
    private static final SubLSymbol $kw103$ISA_RESTRICTIONS;
    private static final SubLSymbol $kw104$GENLS_RESTRICTIONS;
    private static final SubLObject $const105$BaseKB;
    private static final SubLSymbol $kw106$TERM_TO_REPLACE;
    private static final SubLObject $const107$UniversalVocabularyMt;
    private static final SubLSymbol $sym108$GET_ISA_RESTRICTIONS_FROM_SENTENCE;
    private static final SubLObject $const109$isa;
    private static final SubLSymbol $sym110$_GET_ISA_RESTRICTIONS_FROM_SENTENCE_CACHING_STATE_;
    private static final SubLInteger $int111$1024;
    private static final SubLSymbol $sym112$CLEAR_GET_ISA_RESTRICTIONS_FROM_SENTENCE;
    private static final SubLSymbol $sym113$GET_GENLS_RESTRICTIONS_FROM_SENTENCE;
    private static final SubLObject $const114$genls;
    private static final SubLSymbol $sym115$_GET_GENLS_RESTRICTIONS_FROM_SENTENCE_CACHING_STATE_;
    private static final SubLSymbol $sym116$CLEAR_GET_GENLS_RESTRICTIONS_FROM_SENTENCE;
    private static final SubLSymbol $sym117$GET_ARG_CONSTRAINTS_FOR_ARG;
    private static final SubLSymbol $sym118$_GET_ARG_CONSTRAINTS_FOR_ARG_CACHING_STATE_;
    private static final SubLSymbol $sym119$CLEAR_GET_ARG_CONSTRAINTS_FOR_ARG;
    private static final SubLSymbol $sym120$GET_ARG_CONSTRAINTS_FOR_VAR;
    private static final SubLSymbol $kw121$ISA;
    private static final SubLSymbol $kw122$GENLS;
    private static final SubLSymbol $sym123$_GET_ARG_CONSTRAINTS_FOR_VAR_CACHING_STATE_;
    private static final SubLSymbol $sym124$CLEAR_GET_ARG_CONSTRAINTS_FOR_VAR;
    private static final SubLObject $const125$CollectionIntersectionFn;
    private static final SubLObject $const126$TheSet;
    private static final SubLString $str127$constrainingSentence;
    private static final SubLSymbol $kw128$EOF;
    private static final SubLSymbol $sym129$NON_CYCL_SYMBOL_;
    private static final SubLSymbol $sym130$CONVERT_TO_KEYWORD;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$COMPLETION_PROPERTIES_P;
    private static final SubLList $list133;
    private static final SubLString $str134$__;
    private static final SubLSymbol $sym135$COMPLETION_DENOTS_OF_STRING;
    private static final SubLSymbol $kw136$DENOT;
    private static final SubLSymbol $kw137$NEVER;
    private static final SubLSymbol $sym138$COMPLETION_LEXICON;
    private static final SubLList $list139;
    private static final SubLSymbol $kw140$ON;
    private static final SubLSymbol $kw141$OFF;
    private static final SubLSymbol $sym142$NUM_INDEX_;
    private static final SubLString $str143$__xml_version__1_0__encoding__UTF;
    private static final SubLList $list144;
    private static final SubLString $str145$ResultSet;
    private static final SubLList $list146;
    private static final SubLSymbol $kw147$CYCL;
    private static final SubLString $str148$cycl;
    private static final SubLSymbol $kw149$NL;
    private static final SubLString $str150$nl;
    private static final SubLSymbol $kw151$DISAMBIG_STRING;
    private static final SubLString $str152$disambigString;
    private static final SubLSymbol $kw153$HL_ID;
    private static final SubLString $str154$hlId;
    private static final SubLString $str155$Term;
    private static final SubLSymbol $sym156$FIRST;
    private static final SubLSymbol $sym157$TERM_PASSES_ARG_RESTRICTIONS;
    private static final SubLSymbol $sym158$_TERM_PASSES_ARG_RESTRICTIONS_CACHING_STATE_;
    private static final SubLSymbol $sym159$CLEAR_TERM_PASSES_ARG_RESTRICTIONS;
    private static final SubLString $str160$Autocomplete_isa_cache_lock;
    private static final SubLString $str161$Autocomplete_genls_cache_lock;
    private static final SubLInteger $int162$128;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$CLEAR_AUTOCOMPLETE_GENLS_CACHE;
    private static final SubLSymbol $sym165$CLEAR_AUTOCOMPLETE_ISA_CACHE;
    private static final SubLObject $const166$Collection;
    private static final SubLObject $const167$PhysiologicalCondition;
    private static final SubLSymbol $sym168$FI_EVAL;
    private static final SubLSymbol $sym169$QUOTE;
    private static final SubLSymbol $sym170$PRECACHE_ISA_CONSTRAINT_GUTS;
    private static final SubLSymbol $sym171$PRECACHE_GENLS_CONSTRAINT_GUTS;
    private static final SubLInteger $int172$1000;
    private static final SubLString $str173$_var_form_number____A__var_elemen;
    private static final SubLString $str174$_function_cyclify_error_message__;
    private static final SubLString $str175$_handle_cyclify_unescape__;
    private static final SubLString $str176$_____;
    private static final SubLString $str177$string;
    private static final SubLString $str178$All_valid____references_have_been;
    private static final SubLString $str179$Invalid_references__;
    private static final SubLString $str180$Added_references__;
    private static final SubLString $str181$No_references_added;
    private static final SubLSymbol $sym182$CB_CYCLIFY;
    private static final SubLString $str183$_Term_;
    private static final SubLSymbol $sym184$XML_COMPLETE_RESULT_COUNT_MIN;
    private static final SubLSymbol $kw185$TEST;
    private static final SubLSymbol $sym186$_;
    private static final SubLSymbol $kw187$OWNER;
    private static final SubLSymbol $kw188$CLASSES;
    private static final SubLSymbol $kw189$KB;
    private static final SubLSymbol $kw190$FULL;
    private static final SubLSymbol $kw191$WORKING_;
    private static final SubLList $list192;
    private static final SubLSymbol $sym193$XML_COMPLETE_RESULT_COUNT_MAX;
    private static final SubLSymbol $sym194$__;
    private static final SubLList $list195;
    private static final SubLSymbol $sym196$XML_COMPLETE_INT_RESULT_COUNT_MIN;
    private static final SubLList $list197;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 1489L)
    public static SubLObject html_complete_button(final SubLObject name, SubLObject value, SubLObject filter_type, SubLObject auto_submit, SubLObject include_lexical_stringsP, SubLObject standard_choices, SubLObject v_class) {
        if (value == html_complete.UNPROVIDED) {
            value = (SubLObject)html_complete.$str2$Complete;
        }
        if (filter_type == html_complete.UNPROVIDED) {
            filter_type = (SubLObject)html_complete.NIL;
        }
        if (auto_submit == html_complete.UNPROVIDED) {
            auto_submit = (SubLObject)html_complete.NIL;
        }
        if (include_lexical_stringsP == html_complete.UNPROVIDED) {
            include_lexical_stringsP = (SubLObject)html_complete.NIL;
        }
        if (standard_choices == html_complete.UNPROVIDED) {
            standard_choices = (SubLObject)html_complete.NIL;
        }
        if (v_class == html_complete.UNPROVIDED) {
            v_class = (SubLObject)html_complete.$str3$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_complete.NIL != Types.stringp(name) : name;
        if (html_complete.NIL == filter_type) {
            filter_type = html_complete.$const5$Thing;
        }
        assert html_complete.NIL != forts.fort_p(filter_type) : filter_type;
        if (html_complete.NIL != html_complete.$cb_enable_constant_completion$.getDynamicValue(thread)) {
            final SubLObject choices_id = cb_parameters.cb_glob_id(standard_choices);
            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_input_button$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
            if (html_complete.NIL != value) {
                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                html_utilities.html_princ(value);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_complete.UNPROVIDED);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_complete.$html_complete_button_script$.getGlobalValue(), new SubLObject[] { name, (html_complete.NIL != auto_submit) ? html_complete.$str7$true : html_complete.$str8$false, cb_utilities.cb_fort_identifier(filter_type), choices_id, (html_complete.NIL != include_lexical_stringsP) ? html_complete.$str7$true : html_complete.$str8$false });
            if (html_complete.NIL != v_class) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                html_utilities.html_markup(v_class);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
            }
            if (html_complete.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 2436L)
    public static SubLObject html_complete_link(final SubLObject name, SubLObject linktext, SubLObject filter_type, SubLObject auto_submit, SubLObject include_lexical_stringsP, SubLObject standard_choices) {
        if (linktext == html_complete.UNPROVIDED) {
            linktext = (SubLObject)html_complete.$str2$Complete;
        }
        if (filter_type == html_complete.UNPROVIDED) {
            filter_type = (SubLObject)html_complete.NIL;
        }
        if (auto_submit == html_complete.UNPROVIDED) {
            auto_submit = (SubLObject)html_complete.NIL;
        }
        if (include_lexical_stringsP == html_complete.UNPROVIDED) {
            include_lexical_stringsP = (SubLObject)html_complete.NIL;
        }
        if (standard_choices == html_complete.UNPROVIDED) {
            standard_choices = (SubLObject)html_complete.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_complete.NIL != Types.stringp(name) : name;
        if (html_complete.NIL == filter_type) {
            filter_type = html_complete.$const5$Thing;
        }
        assert html_complete.NIL != forts.fort_p(filter_type) : filter_type;
        if (html_complete.NIL != html_complete.$cb_enable_constant_completion$.getDynamicValue(thread)) {
            final SubLObject choices_id = cb_parameters.cb_glob_id(standard_choices);
            final SubLObject onclick = Sequences.cconcatenate((SubLObject)html_complete.$str9$constant_complete__, new SubLObject[] { format_nil.format_nil_a_no_copy(name), html_complete.$str10$___, format_nil.format_nil_a_no_copy((SubLObject)((html_complete.NIL != auto_submit) ? html_complete.$str7$true : html_complete.$str8$false)), html_complete.$str11$___, format_nil.format_nil_a_no_copy(cb_utilities.cb_fort_identifier(filter_type)), html_complete.$str10$___, format_nil.format_nil_a_no_copy(choices_id), html_complete.$str12$__, format_nil.format_nil_a_no_copy((SubLObject)((html_complete.NIL != include_lexical_stringsP) ? html_complete.$str7$true : html_complete.$str8$false)), html_complete.$str13$__ });
            final SubLObject url = javascript_void_url();
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup(url);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup(onclick);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 3298L)
    public static SubLObject html_cyclify_button(final SubLObject name, SubLObject value, SubLObject v_class) {
        if (value == html_complete.UNPROVIDED) {
            value = (SubLObject)html_complete.$str15$Cyclify;
        }
        if (v_class == html_complete.UNPROVIDED) {
            v_class = (SubLObject)html_complete.$str3$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_complete.NIL != Types.stringp(name) : name;
        if (html_complete.NIL != html_complete.$cb_enable_constant_completion$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_input_button$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
            if (html_complete.NIL != value) {
                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                html_utilities.html_princ(value);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_complete.UNPROVIDED);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_complete.$html_cyclify_button_script$.getGlobalValue(), name);
            if (html_complete.NIL != v_class) {
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                html_utilities.html_markup(v_class);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
            }
            if (html_complete.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 3618L)
    public static SubLObject javascript_void_url() {
        return (SubLObject)html_complete.$str16$javascript_void____;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 3945L)
    public static SubLObject html_complete_script() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_complete.$html_complete_script_parameters$.getGlobalValue(), system_parameters.$cyc_cgi_program$.getDynamicValue(thread), (SubLObject)((html_complete.NIL == html_complete.$cb_pop_up_constant_completion$.getDynamicValue(thread)) ? html_complete.$cb_constant_completion_target$.getDynamicValue(thread) : html_complete.$str3$));
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        cyc_file_dependencies.javascript((SubLObject)html_complete.$kw18$CONSTANT_COMPLETION);
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 4387L)
    public static SubLObject html_initial_focus_script() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_complete.$html_intial_focus_script$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 4624L)
    public static SubLObject html_opener_message_on_load(final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_complete.$html_opener_message_on_load_script$.getGlobalValue(), message);
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 7096L)
    public static SubLObject html_handle_complete_script(final SubLObject form, final SubLObject input, final SubLObject prefix) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_complete.$html_handle_complete_script_parameters$.getGlobalValue(), new SubLObject[] { form, input, prefix, (html_complete.NIL != html_complete.$cb_pop_up_constant_completion$.getDynamicValue(thread)) ? html_complete.$str7$true : html_complete.$str8$false });
            html_utilities.html_terpri((SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup(html_complete.$html_handle_complete_script$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 7472L)
    public static SubLObject html_immediate_complete_extend_script(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_complete.$html_immediate_complete_extend_script$.getDynamicValue(thread), string);
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 7715L)
    public static SubLObject html_immediate_complete_choose_script(final SubLObject string, final SubLObject submit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_complete.$html_immediate_complete_choose_script$.getDynamicValue(thread), string, submit);
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 7883L)
    public static SubLObject cb_complete(final SubLObject args) {
        final SubLObject form = html_utilities.html_extract_input((SubLObject)html_complete.$str25$form, args);
        final SubLObject input = html_utilities.html_extract_input((SubLObject)html_complete.$str26$input, args);
        final SubLObject prefix = html_utilities.html_extract_input((SubLObject)html_complete.$str27$prefix, args);
        final SubLObject submit = html_utilities.html_extract_input((SubLObject)html_complete.$str28$submit, args);
        SubLObject filter = html_utilities.html_extract_input((SubLObject)html_complete.$str29$filter, args);
        SubLObject choices = html_utilities.html_extract_input((SubLObject)html_complete.$str30$choices, args);
        final SubLObject case_sensitiveP = (SubLObject)SubLObjectFactory.makeBoolean(html_complete.NIL == html_utilities.html_extract_input((SubLObject)html_complete.$str31$case_insensitive, args));
        final SubLObject include_lexical_stringsP = Equality.equal((SubLObject)html_complete.$str7$true, html_utilities.html_extract_input((SubLObject)html_complete.$str32$lexical, args));
        SubLObject completions = (SubLObject)html_complete.NIL;
        if (html_complete.NIL != filter) {
            filter = cb_utilities.cb_guess_fort(filter, (SubLObject)html_complete.UNPROVIDED);
        }
        if (html_complete.NIL != kb_utilities.kbeq(filter, html_complete.$const5$Thing)) {
            filter = (SubLObject)html_complete.NIL;
        }
        if (html_complete.NIL != choices) {
            choices = cb_parameters.cb_glob_lookup_by_string(choices);
        }
        completions = cb_completions(prefix, filter, choices, include_lexical_stringsP, case_sensitiveP, (SubLObject)html_complete.UNPROVIDED);
        if (html_complete.NIL != completions) {
            if (html_complete.NIL != list_utilities.singletonP(completions)) {
                cb_complete_one(form, input, prefix, completions.first(), submit, filter);
            }
            else {
                cb_complete_choose(form, input, prefix, choices, completions, submit, filter);
            }
        }
        else {
            cb_complete_none(prefix, filter);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 9147L)
    public static SubLObject cb_completions(final SubLObject string, final SubLObject filter, final SubLObject choices, SubLObject include_lexical_stringsP, SubLObject case_sensitiveP, SubLObject constant_completionsP) {
        if (include_lexical_stringsP == html_complete.UNPROVIDED) {
            include_lexical_stringsP = (SubLObject)html_complete.NIL;
        }
        if (case_sensitiveP == html_complete.UNPROVIDED) {
            case_sensitiveP = (SubLObject)html_complete.T;
        }
        if (constant_completionsP == html_complete.UNPROVIDED) {
            constant_completionsP = (SubLObject)html_complete.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject completions = (SubLObject)html_complete.NIL;
        if (html_complete.NIL != string_utilities.empty_string_p(string)) {
            SubLObject suggestions = (SubLObject)html_complete.NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)html_complete.$sym35$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(html_complete.$const36$EverythingPSC, thread);
                if (html_complete.NIL == filter) {
                    suggestions = cb_tools.cb_constant_history_items();
                }
                else if (cardinality_estimates.instance_cardinality(filter).numLE((SubLObject)html_complete.$int37$50)) {
                    suggestions = list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)html_complete.$sym38$CONSTANT_P), isa.all_fort_instances(filter, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
                }
                else {
                    suggestions = isa.all_instances_among_fast(filter, cb_tools.cb_constant_history_items(), (SubLObject)html_complete.UNPROVIDED);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            completions = conses_high.nunion(conses_high.copy_list(choices), suggestions, Symbols.symbol_function((SubLObject)html_complete.EQ), (SubLObject)html_complete.UNPROVIDED);
        }
        else if (html_complete.NIL != constant_completionsP) {
            completions = constant_completion_high.constant_complete(string, case_sensitiveP, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
            if (html_complete.NIL != filter) {
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)html_complete.$sym35$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(html_complete.$const36$EverythingPSC, thread);
                    completions = isa.all_instances_among_fast(filter, completions, (SubLObject)html_complete.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                }
            }
        }
        completions = Sort.sort(completions, Symbols.symbol_function((SubLObject)html_complete.$sym39$STRING_), Symbols.symbol_function((SubLObject)html_complete.$sym40$CONSTANT_NAME));
        if (html_complete.NIL != choices) {
            completions = list_utilities.stable_sort_via_position(completions, choices, Symbols.symbol_function((SubLObject)html_complete.EQ), (SubLObject)html_complete.UNPROVIDED);
        }
        if (html_complete.NIL != string_utilities.non_empty_stringP(string) && html_complete.NIL != include_lexical_stringsP) {
            SubLObject nl_trie_completions = (html_complete.NIL != fort_types_interface.collectionP(filter) && html_complete.NIL == kb_utilities.kbeq(html_complete.$const5$Thing, filter)) ? nl_trie_completion.nl_trie_completions_with_denot_filter_collection(string, filter, case_sensitiveP, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED) : nl_trie_completion.nl_trie_completions(string, case_sensitiveP);
            nl_trie_completions = Sort.sort(nl_trie_completions, Symbols.symbol_function((SubLObject)html_complete.$sym41$STRING_LESSP), (SubLObject)html_complete.UNPROVIDED);
            completions = ConsesLow.append(completions, nl_trie_completions);
        }
        return completions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 10792L)
    public static SubLObject cb_complete_choose(final SubLObject form, final SubLObject input, final SubLObject prefix, final SubLObject choices, final SubLObject completions, final SubLObject submit, final SubLObject filter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = Sequences.length(completions);
        final SubLObject common_extention = string_utilities.strings_common_prefix(completions, Symbols.symbol_function((SubLObject)html_complete.$sym42$COMPLETION_STRING), Sequences.length(prefix));
        final SubLObject extended_prefix = Sequences.cconcatenate(prefix, common_extention);
        final SubLObject exact_matchP = Sequences.find(extended_prefix, completions, Symbols.symbol_function((SubLObject)html_complete.EQUAL), Symbols.symbol_function((SubLObject)html_complete.$sym42$COMPLETION_STRING), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject extensionP = Numbers.numG(Sequences.length(common_extention), (SubLObject)html_complete.ZERO_INTEGER);
        html_utilities.html_markup((SubLObject)html_complete.$str43$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (html_complete.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_complete.$str44$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_complete.$kw45$UNINITIALIZED) ? ConsesLow.list(html_complete.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_complete_title(prefix);
            html_handle_complete_script(form, input, prefix);
            if (html_complete.NIL != extensionP) {
                html_immediate_complete_extend_script(extended_prefix);
            }
            html_initial_focus_script();
            html_opener_message_on_load((SubLObject)((html_complete.NIL != exact_matchP) ? (total.numE((SubLObject)html_complete.TWO_INTEGER) ? html_complete.$str46$Exact_match_plus_one_longer_compl : PrintLow.format((SubLObject)html_complete.NIL, (SubLObject)html_complete.$str47$Exact_match_plus__S_longer_comple, Numbers.subtract(total, (SubLObject)html_complete.ONE_INTEGER))) : PrintLow.format((SubLObject)html_complete.NIL, (SubLObject)html_complete.$str48$_S_possible__A_, total, (SubLObject)((html_complete.NIL != string_utilities.empty_string_p(prefix)) ? html_complete.$str49$suggestions : html_complete.$str0$completions))));
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
            if (html_complete.NIL == html_complete.$cb_pop_up_constant_completion$.getDynamicValue(thread) || html_complete.NIL == extensionP) {
                final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)html_complete.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
                    final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
                        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)html_complete.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_complete_preamble(prefix, filter);
                            html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
                            if (html_complete.NIL != extensionP) {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)html_complete.$str50$Extension__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_prin1(common_extention);
                                html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            final SubLObject color_val = (SubLObject)html_complete.$kw51$RED;
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (html_complete.NIL != color_val) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
                            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
                                html_utilities.html_princ(total);
                                if (html_complete.NIL != string_utilities.empty_string_p(prefix)) {
                                    html_utilities.html_princ((SubLObject)html_complete.$str52$_Suggestions_);
                                }
                                else {
                                    html_utilities.html_princ((SubLObject)html_complete.$str53$_Completions_);
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            final SubLObject constant_count = Sequences.count_if((SubLObject)html_complete.$sym38$CONSTANT_P, completions, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
                            final SubLObject string_count = Sequences.count_if((SubLObject)html_complete.$sym4$STRINGP, completions, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
                            SubLObject seen_constantsP = (SubLObject)html_complete.NIL;
                            SubLObject seen_stringsP = (SubLObject)html_complete.NIL;
                            SubLObject previous_completion = (SubLObject)html_complete.NIL;
                            SubLObject cdolist_list_var = completions;
                            SubLObject completion = (SubLObject)html_complete.NIL;
                            completion = cdolist_list_var.first();
                            while (html_complete.NIL != cdolist_list_var) {
                                if (html_complete.NIL != constant_handles.constant_p(completion) && html_complete.NIL == seen_constantsP) {
                                    html_utilities.html_hr((SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_complete.$str54$Constants___A__, constant_count);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    seen_constantsP = (SubLObject)html_complete.T;
                                }
                                else if (completion.isString() && html_complete.NIL == seen_stringsP) {
                                    html_utilities.html_hr((SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_complete.$str55$Lexical_Strings___A__, string_count);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    seen_stringsP = (SubLObject)html_complete.T;
                                }
                                html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
                                if (html_complete.NIL != constant_handles.constant_p(previous_completion) && html_complete.NIL != constant_handles.constant_p(completion) && html_complete.NIL != subl_promotions.memberP(previous_completion, choices, Symbols.symbol_function((SubLObject)html_complete.EQ), (SubLObject)html_complete.UNPROVIDED) && html_complete.NIL == subl_promotions.memberP(completion, choices, Symbols.symbol_function((SubLObject)html_complete.EQ), (SubLObject)html_complete.UNPROVIDED)) {
                                    html_utilities.html_hr((SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
                                }
                                html_complete_insert_choice(completion, submit);
                                previous_completion = completion;
                                cdolist_list_var = cdolist_list_var.rest();
                                completion = cdolist_list_var.first();
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 13177L)
    public static SubLObject completion_string(final SubLObject completion) {
        if (html_complete.NIL != constant_handles.constant_p(completion)) {
            return constants_high.constant_name(completion);
        }
        if (completion.isString()) {
            return completion;
        }
        return print_high.princ_to_string(completion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 13391L)
    public static SubLObject cb_complete_one(final SubLObject form, final SubLObject input, final SubLObject prefix, final SubLObject completion, final SubLObject submit, final SubLObject filter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = completion_string(completion);
        final SubLObject completeP = Equality.equal(prefix, name);
        html_utilities.html_markup((SubLObject)html_complete.$str43$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (html_complete.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_complete.$str44$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_complete.$kw45$UNINITIALIZED) ? ConsesLow.list(html_complete.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_complete_title(prefix);
            html_handle_complete_script(form, input, prefix);
            html_immediate_complete_choose_script(name, submit);
            html_opener_message_on_load((SubLObject)((html_complete.NIL != completeP) ? html_complete.$str56$Sole_completion__already_complete : html_complete.$str57$Sole_completion_));
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
            if (html_complete.NIL == html_complete.$cb_pop_up_constant_completion$.getDynamicValue(thread)) {
                final SubLObject _prev_bind_0_$5 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)html_complete.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
                    final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)html_complete.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_complete_preamble(prefix, filter);
                            html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
                            if (html_complete.NIL != completeP) {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)html_complete.$str58$Already_completed_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            else {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)html_complete.$str59$Sole_completion_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
                                html_utilities.html_princ(name);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$5, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 14215L)
    public static SubLObject cb_complete_none(final SubLObject prefix, final SubLObject filter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)html_complete.$str43$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (html_complete.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_complete.$str44$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_complete.$kw45$UNINITIALIZED) ? ConsesLow.list(html_complete.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_complete_title(prefix);
            if (html_complete.NIL == string_utilities.empty_string_p(prefix)) {
                html_opener_message_on_load((SubLObject)html_complete.$str60$No_completions_);
            }
            else {
                html_opener_message_on_load((SubLObject)html_complete.$str61$No_suggestions_);
            }
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
            if (html_complete.NIL == html_complete.$cb_pop_up_constant_completion$.getDynamicValue(thread)) {
                final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)html_complete.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)html_complete.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_complete_preamble(prefix, filter);
                            html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            if (html_complete.NIL == string_utilities.empty_string_p(prefix)) {
                                html_utilities.html_princ((SubLObject)html_complete.$str62$No_completions);
                            }
                            else {
                                html_utilities.html_princ((SubLObject)html_complete.$str63$No_suggestions);
                            }
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 14837L)
    public static SubLObject cb_complete_title(final SubLObject prefix) {
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
        if (html_complete.NIL != string_utilities.empty_string_p(prefix)) {
            html_utilities.html_princ((SubLObject)html_complete.$str64$Suggestions);
        }
        else {
            html_utilities.html_princ((SubLObject)html_complete.$str65$Completions);
        }
        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 15015L)
    public static SubLObject cb_complete_preamble(final SubLObject prefix, final SubLObject filter) {
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        if (html_complete.NIL != string_utilities.empty_string_p(prefix)) {
            html_utilities.html_princ((SubLObject)html_complete.$str64$Suggestions);
        }
        else {
            html_utilities.html_princ((SubLObject)html_complete.$str65$Completions);
        }
        html_utilities.html_indent((SubLObject)html_complete.TWO_INTEGER);
        html_script_utilities.html_dismiss_button((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)html_complete.$str66$Machine__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_princ(Environment.get_machine_name((SubLObject)html_complete.UNPROVIDED));
        if (html_complete.NIL == string_utilities.empty_string_p(prefix)) {
            html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)html_complete.$str67$Prefix__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_princ(prefix);
        }
        if (html_complete.NIL != filter) {
            html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)html_complete.$str68$Filter__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_princ(filter);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 15689L)
    public static SubLObject html_complete_insert_choice(final SubLObject choice, final SubLObject submit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!choice.isString() && !html_complete.assertionsDisabledInClass && html_complete.NIL == constant_handles.constant_p(choice)) {
            throw new AssertionError(choice);
        }
        final SubLObject name = completion_string(choice);
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_radio$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup((SubLObject)html_complete.$str70$complete);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_complete.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_complete.$html_complete_insert_choice_script$.getGlobalValue(), name, submit);
        if (html_complete.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_indent((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_princ(completion_string(choice));
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 18459L)
    public static SubLObject html_print_js_autocomplete_setup_int(final SubLObject input_elt_name, final SubLObject container_elt_name, final SubLObject max_results, final SubLObject min_query_length, final SubLObject embedded_in_toolbar_frameP, SubLObject filter_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_complete.NIL == filter_term) {
            filter_term = html_complete.$const5$Thing;
        }
        final SubLObject toolbar_value = (SubLObject)((html_complete.NIL != embedded_in_toolbar_frameP) ? html_complete.$str7$true : html_complete.$str8$false);
        final SubLObject filter_term_id = cb_utilities.cb_term_identifier(filter_term);
        final SubLObject filter_param = Sequences.cconcatenate((SubLObject)html_complete.$str74$_filter_, web_utilities.html_url_encode(filter_term_id, (SubLObject)html_complete.UNPROVIDED));
        cyc_file_dependencies.javascript((SubLObject)html_complete.$kw75$AUTOCOMPLETE);
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup((SubLObject)html_complete.$str76$text_javascript);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_complete.$js_autocomplete_setup$.getDynamicValue(thread), new SubLObject[] { filter_param, input_elt_name, container_elt_name, min_query_length, max_results, toolbar_value });
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 19868L)
    public static SubLObject xml_term_search(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject search_string = html_utilities.html_extract_input((SubLObject)html_complete.$str78$searchString, args);
        final SubLObject case_sensitiveP = html_utilities.html_extract_sexpr((SubLObject)html_complete.$str79$caseSensitive, args, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject return_attrs = html_utilities.html_extract_sexpr((SubLObject)html_complete.$str80$return_attrs, args, (SubLObject)html_complete.$list81);
        final SubLObject timeout = html_utilities.html_extract_sexpr((SubLObject)html_complete.$str82$timeout, args, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject limit = html_utilities.html_extract_sexpr((SubLObject)html_complete.$str83$count, args, html_complete.$autocomplete_default_limit$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            SubLObject current;
            final SubLObject datum = current = get_constraint_filters_from_html_args(args);
            SubLObject isa_filter = (SubLObject)html_complete.NIL;
            SubLObject genls_filter = (SubLObject)html_complete.NIL;
            SubLObject isa_restrictions = (SubLObject)html_complete.NIL;
            SubLObject genls_restrictions = (SubLObject)html_complete.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list84);
            isa_filter = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list84);
            genls_filter = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list84);
            isa_restrictions = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list84);
            genls_restrictions = current.first();
            current = current.rest();
            if (html_complete.NIL == current) {
                final SubLObject terms = cb_frames.terms_for_browsing(search_string, case_sensitiveP, (SubLObject)html_complete.NIL);
                final SubLObject term_dict = dictionary.new_dictionary((SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = (SubLObject)html_complete.NIL;
                v_term = cdolist_list_var.first();
                while (html_complete.NIL != cdolist_list_var) {
                    if (html_complete.NIL != term_passes_arg_filters(v_term, isa_filter, genls_filter, (SubLObject)html_complete.$kw85$DEFAULT) && html_complete.NIL != term_passes_arg_restrictions(v_term, isa_restrictions, genls_restrictions, (SubLObject)html_complete.$kw85$DEFAULT)) {
                        dictionary_utilities.dictionary_pushnew(term_dict, v_term, pph_main.generate_phrase(v_term, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                }
                stream_xml_term_result_set(term_dict, return_attrs, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_complete.$list84);
            }
            return (SubLObject)html_complete.NIL;
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 21022L)
    public static SubLObject xml_complete(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prefix = html_utilities.html_extract_input((SubLObject)html_complete.$str27$prefix, args);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            SubLObject v_properties = (SubLObject)ConsesLow.list(new SubLObject[] { html_complete.$kw89$COMPLETE_ON_CONSTANTS_, html_complete.T, html_complete.$kw90$PREFER_HISTORY_TERMS_, html_utilities.html_extract_sexpr((SubLObject)html_complete.$str91$preferHistory, args, (SubLObject)html_complete.T), html_complete.$kw92$LEXICON, html_complete.NIL, html_complete.$kw93$CASE_SENSITIVE_, html_utilities.html_extract_sexpr((SubLObject)html_complete.$str79$caseSensitive, args, (SubLObject)html_complete.NIL), html_complete.$kw94$RETURN_ATTRS, html_utilities.html_extract_sexpr((SubLObject)html_complete.$str80$return_attrs, args, (SubLObject)html_complete.$list95), html_complete.$kw96$TIMEOUT, html_utilities.html_extract_sexpr((SubLObject)html_complete.$str82$timeout, args, (SubLObject)html_complete.UNPROVIDED), html_complete.$kw97$LIMIT, html_utilities.html_extract_sexpr((SubLObject)html_complete.$str83$count, args, html_complete.$autocomplete_default_limit$.getDynamicValue(thread)), html_complete.$kw98$MT, html_utilities.html_extract_cyclified_sexpr((SubLObject)html_complete.$str99$mt, args, html_complete.$const100$InferencePSC) });
            SubLObject current;
            final SubLObject datum = current = get_constraint_filters_from_html_args(args);
            SubLObject isa_filter = (SubLObject)html_complete.NIL;
            SubLObject genls_filter = (SubLObject)html_complete.NIL;
            SubLObject isa_restrictions = (SubLObject)html_complete.NIL;
            SubLObject genls_restrictions = (SubLObject)html_complete.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list84);
            isa_filter = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list84);
            genls_filter = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list84);
            isa_restrictions = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list84);
            genls_restrictions = current.first();
            current = current.rest();
            if (html_complete.NIL == current) {
                v_properties = conses_high.putf(v_properties, (SubLObject)html_complete.$kw101$ISA_FILTER, isa_filter);
                v_properties = conses_high.putf(v_properties, (SubLObject)html_complete.$kw102$GENLS_FILTER, genls_filter);
                v_properties = conses_high.putf(v_properties, (SubLObject)html_complete.$kw103$ISA_RESTRICTIONS, isa_restrictions);
                v_properties = conses_high.putf(v_properties, (SubLObject)html_complete.$kw104$GENLS_RESTRICTIONS, genls_restrictions);
                xml_complete_int(prefix, v_properties);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_complete.$list84);
            }
            return (SubLObject)html_complete.NIL;
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 22176L)
    public static SubLObject get_constraint_filters_from_html_args(final SubLObject args) {
        final SubLObject filter_provided = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)html_complete.$str29$filter, args), (SubLObject)html_complete.UNPROVIDED);
        SubLObject isa_filter = (html_complete.NIL != filter_provided) ? filter_provided : html_complete.$const5$Thing;
        SubLObject genls_filter = (SubLObject)html_complete.NIL;
        SubLObject isa_restrictions = (SubLObject)html_complete.NIL;
        SubLObject genls_restrictions = (SubLObject)html_complete.NIL;
        final SubLObject mt = html_utilities.html_extract_cyclified_sexpr((SubLObject)html_complete.$str99$mt, args, html_complete.$const105$BaseKB);
        final SubLObject constraining_sentence = get_constraining_sentence_from_html_args(args);
        final SubLObject arg_position = cycl_utilities.formula_arg_positions(constraining_sentence, (SubLObject)html_complete.$kw106$TERM_TO_REPLACE, (SubLObject)html_complete.UNPROVIDED);
        if (html_complete.NIL != constraining_sentence) {
            final SubLObject arg_constraints = (SubLObject)((html_complete.NIL != constraining_sentence) ? get_arg_constraints_for_arg(constraining_sentence, arg_position, mt) : html_complete.NIL);
            isa_filter = get_isa_filter_from_arg_constraints(arg_constraints);
            genls_filter = get_genls_filter_from_arg_constraints(arg_constraints);
            isa_restrictions = get_isa_restrictions_from_sentence(constraining_sentence, mt);
            genls_restrictions = get_genls_restrictions_from_sentence(constraining_sentence, mt);
        }
        else if (html_complete.NIL == forts.fort_p(isa_filter)) {
            if (html_complete.NIL != pph_utilities.specs_fn_natP(isa_filter)) {
                genls_filter = cycl_utilities.nat_arg1(isa_filter, (SubLObject)html_complete.UNPROVIDED);
                isa_filter = html_complete.$const5$Thing;
            }
            else {
                isa_filter = html_complete.$const5$Thing;
            }
        }
        return (SubLObject)ConsesLow.list(isa_filter, genls_filter, isa_restrictions, genls_restrictions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 23510L)
    public static SubLObject clear_get_isa_restrictions_from_sentence() {
        final SubLObject cs = html_complete.$get_isa_restrictions_from_sentence_caching_state$.getGlobalValue();
        if (html_complete.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 23510L)
    public static SubLObject remove_get_isa_restrictions_from_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == html_complete.UNPROVIDED) {
            mt = html_complete.$const107$UniversalVocabularyMt;
        }
        return memoization_state.caching_state_remove_function_results_with_args(html_complete.$get_isa_restrictions_from_sentence_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sentence, mt), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 23510L)
    public static SubLObject get_isa_restrictions_from_sentence_internal(final SubLObject sentence, final SubLObject mt) {
        if (cycl_utilities.formula_arg2(sentence, (SubLObject)html_complete.UNPROVIDED) == html_complete.$kw106$TERM_TO_REPLACE && html_complete.NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), html_complete.$const109$isa, mt, (SubLObject)html_complete.UNPROVIDED)) {
            return genls.min_genls(cycl_utilities.formula_arg1(sentence, (SubLObject)html_complete.UNPROVIDED), mt, (SubLObject)html_complete.UNPROVIDED);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 23510L)
    public static SubLObject get_isa_restrictions_from_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == html_complete.UNPROVIDED) {
            mt = html_complete.$const107$UniversalVocabularyMt;
        }
        SubLObject caching_state = html_complete.$get_isa_restrictions_from_sentence_caching_state$.getGlobalValue();
        if (html_complete.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)html_complete.$sym108$GET_ISA_RESTRICTIONS_FROM_SENTENCE, (SubLObject)html_complete.$sym110$_GET_ISA_RESTRICTIONS_FROM_SENTENCE_CACHING_STATE_, (SubLObject)html_complete.$int111$1024, (SubLObject)html_complete.EQUAL, (SubLObject)html_complete.TWO_INTEGER, (SubLObject)html_complete.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)html_complete.$sym112$CLEAR_GET_ISA_RESTRICTIONS_FROM_SENTENCE);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)html_complete.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)html_complete.NIL;
            collision = cdolist_list_var.first();
            while (html_complete.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (html_complete.NIL != cached_args && html_complete.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_isa_restrictions_from_sentence_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 23874L)
    public static SubLObject clear_get_genls_restrictions_from_sentence() {
        final SubLObject cs = html_complete.$get_genls_restrictions_from_sentence_caching_state$.getGlobalValue();
        if (html_complete.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 23874L)
    public static SubLObject remove_get_genls_restrictions_from_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == html_complete.UNPROVIDED) {
            mt = html_complete.$const107$UniversalVocabularyMt;
        }
        return memoization_state.caching_state_remove_function_results_with_args(html_complete.$get_genls_restrictions_from_sentence_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sentence, mt), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 23874L)
    public static SubLObject get_genls_restrictions_from_sentence_internal(final SubLObject sentence, final SubLObject mt) {
        if (cycl_utilities.formula_arg2(sentence, (SubLObject)html_complete.UNPROVIDED) == html_complete.$kw106$TERM_TO_REPLACE && html_complete.NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), html_complete.$const109$isa, mt, (SubLObject)html_complete.UNPROVIDED)) {
            return isa.min_isa(cycl_utilities.formula_arg1(sentence, (SubLObject)html_complete.UNPROVIDED), mt, (SubLObject)html_complete.UNPROVIDED);
        }
        if (cycl_utilities.formula_arg2(sentence, (SubLObject)html_complete.UNPROVIDED) == html_complete.$kw106$TERM_TO_REPLACE && html_complete.NIL != genl_predicates.genl_predP(cycl_utilities.formula_arg0(sentence), html_complete.$const114$genls, mt, (SubLObject)html_complete.UNPROVIDED)) {
            return genls.min_genls(cycl_utilities.formula_arg1(sentence, (SubLObject)html_complete.UNPROVIDED), mt, (SubLObject)html_complete.UNPROVIDED);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 23874L)
    public static SubLObject get_genls_restrictions_from_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == html_complete.UNPROVIDED) {
            mt = html_complete.$const107$UniversalVocabularyMt;
        }
        SubLObject caching_state = html_complete.$get_genls_restrictions_from_sentence_caching_state$.getGlobalValue();
        if (html_complete.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)html_complete.$sym113$GET_GENLS_RESTRICTIONS_FROM_SENTENCE, (SubLObject)html_complete.$sym115$_GET_GENLS_RESTRICTIONS_FROM_SENTENCE_CACHING_STATE_, (SubLObject)html_complete.$int111$1024, (SubLObject)html_complete.EQUAL, (SubLObject)html_complete.TWO_INTEGER, (SubLObject)html_complete.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)html_complete.$sym116$CLEAR_GET_GENLS_RESTRICTIONS_FROM_SENTENCE);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)html_complete.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)html_complete.NIL;
            collision = cdolist_list_var.first();
            while (html_complete.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (html_complete.NIL != cached_args && html_complete.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_genls_restrictions_from_sentence_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 24404L)
    public static SubLObject clear_get_arg_constraints_for_arg() {
        final SubLObject cs = html_complete.$get_arg_constraints_for_arg_caching_state$.getGlobalValue();
        if (html_complete.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 24404L)
    public static SubLObject remove_get_arg_constraints_for_arg(final SubLObject cycl_sentence, final SubLObject arg_pos, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(html_complete.$get_arg_constraints_for_arg_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(cycl_sentence, arg_pos, mt), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 24404L)
    public static SubLObject get_arg_constraints_for_arg_internal(final SubLObject cycl_sentence, final SubLObject arg_pos, final SubLObject mt) {
        final SubLObject arg = cycl_utilities.formula_arg_position(cycl_sentence, arg_pos, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject var = (html_complete.NIL != cycl_grammar.cycl_variable_p(arg)) ? arg : czer_utilities.unique_el_var_wrt_expression(cycl_sentence, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject cycl_sentence_with_var = (html_complete.NIL != cycl_grammar.cycl_variable_p(arg)) ? cycl_sentence : cycl_utilities.formula_subst(var, arg, cycl_sentence, (SubLObject)html_complete.EQUAL, (SubLObject)html_complete.UNPROVIDED);
        return get_arg_constraints_for_var(cycl_sentence_with_var, var, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 24404L)
    public static SubLObject get_arg_constraints_for_arg(final SubLObject cycl_sentence, final SubLObject arg_pos, final SubLObject mt) {
        SubLObject caching_state = html_complete.$get_arg_constraints_for_arg_caching_state$.getGlobalValue();
        if (html_complete.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)html_complete.$sym117$GET_ARG_CONSTRAINTS_FOR_ARG, (SubLObject)html_complete.$sym118$_GET_ARG_CONSTRAINTS_FOR_ARG_CACHING_STATE_, (SubLObject)html_complete.$int111$1024, (SubLObject)html_complete.EQUAL, (SubLObject)html_complete.THREE_INTEGER, (SubLObject)html_complete.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)html_complete.$sym119$CLEAR_GET_ARG_CONSTRAINTS_FOR_ARG);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(cycl_sentence, arg_pos, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)html_complete.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)html_complete.NIL;
            collision = cdolist_list_var.first();
            while (html_complete.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cycl_sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (arg_pos.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (html_complete.NIL != cached_args && html_complete.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_arg_constraints_for_arg_internal(cycl_sentence, arg_pos, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cycl_sentence, arg_pos, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 24926L)
    public static SubLObject clear_get_arg_constraints_for_var() {
        final SubLObject cs = html_complete.$get_arg_constraints_for_var_caching_state$.getGlobalValue();
        if (html_complete.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 24926L)
    public static SubLObject remove_get_arg_constraints_for_var(final SubLObject cycl_sentence_with_var, final SubLObject var, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(html_complete.$get_arg_constraints_for_var_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(cycl_sentence_with_var, var, mt), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 24926L)
    public static SubLObject get_arg_constraints_for_var_internal(final SubLObject cycl_sentence_with_var, final SubLObject var, final SubLObject mt) {
        final SubLObject isa_constraints = at_var_types.formula_variable_isa_constraints(var, cycl_sentence_with_var, mt, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject genls_constraints = at_var_types.formula_variable_genl_constraints(var, cycl_sentence_with_var, mt, (SubLObject)html_complete.UNPROVIDED);
        SubLObject arg_constraints = (SubLObject)html_complete.NIL;
        if (html_complete.NIL != isa_constraints) {
            arg_constraints = (SubLObject)ConsesLow.list((SubLObject)html_complete.$kw121$ISA, isa_constraints);
        }
        if (html_complete.NIL != genls_constraints) {
            arg_constraints = conses_high.putf(arg_constraints, (SubLObject)html_complete.$kw122$GENLS, genls_constraints);
        }
        return arg_constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 24926L)
    public static SubLObject get_arg_constraints_for_var(final SubLObject cycl_sentence_with_var, final SubLObject var, final SubLObject mt) {
        SubLObject caching_state = html_complete.$get_arg_constraints_for_var_caching_state$.getGlobalValue();
        if (html_complete.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)html_complete.$sym120$GET_ARG_CONSTRAINTS_FOR_VAR, (SubLObject)html_complete.$sym123$_GET_ARG_CONSTRAINTS_FOR_VAR_CACHING_STATE_, (SubLObject)html_complete.$int111$1024, (SubLObject)html_complete.EQUAL, (SubLObject)html_complete.THREE_INTEGER, (SubLObject)html_complete.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)html_complete.$sym124$CLEAR_GET_ARG_CONSTRAINTS_FOR_VAR);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(cycl_sentence_with_var, var, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)html_complete.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)html_complete.NIL;
            collision = cdolist_list_var.first();
            while (html_complete.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cycl_sentence_with_var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (var.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (html_complete.NIL != cached_args && html_complete.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_arg_constraints_for_var_internal(cycl_sentence_with_var, var, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cycl_sentence_with_var, var, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 25642L)
    public static SubLObject get_genls_filter_from_arg_constraints(final SubLObject arg_constraints) {
        final SubLObject genls_terms = conses_high.getf(arg_constraints, (SubLObject)html_complete.$kw122$GENLS, (SubLObject)html_complete.UNPROVIDED);
        if (html_complete.NIL != list_utilities.lengthE(genls_terms, (SubLObject)html_complete.ONE_INTEGER, (SubLObject)html_complete.UNPROVIDED)) {
            return genls_terms.first();
        }
        if (html_complete.NIL != genls_terms) {
            return el_utilities.make_formula(html_complete.$const125$CollectionIntersectionFn, (SubLObject)ConsesLow.list(el_utilities.make_formula(html_complete.$const126$TheSet, genls_terms, (SubLObject)html_complete.UNPROVIDED)), (SubLObject)html_complete.UNPROVIDED);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 26074L)
    public static SubLObject get_isa_filter_from_arg_constraints(final SubLObject arg_constraints) {
        final SubLObject isa_terms = conses_high.getf(arg_constraints, (SubLObject)html_complete.$kw121$ISA, (SubLObject)html_complete.UNPROVIDED);
        if (html_complete.NIL != list_utilities.lengthE(isa_terms, (SubLObject)html_complete.ONE_INTEGER, (SubLObject)html_complete.UNPROVIDED)) {
            return isa_terms.first();
        }
        if (html_complete.NIL != isa_terms) {
            return el_utilities.make_formula(html_complete.$const125$CollectionIntersectionFn, (SubLObject)ConsesLow.list(el_utilities.make_formula(html_complete.$const126$TheSet, isa_terms, (SubLObject)html_complete.UNPROVIDED)), (SubLObject)html_complete.UNPROVIDED);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 26490L)
    public static SubLObject get_constraining_sentence_from_html_args(final SubLObject args) {
        final SubLObject constraining_sentence_string = html_utilities.html_extract_input((SubLObject)html_complete.$str127$constrainingSentence, args);
        final SubLObject raw_constraining_sentence = (SubLObject)((html_complete.NIL != constraining_sentence_string) ? reader.read_from_string_ignoring_errors(string_utilities.cyclify_string(constraining_sentence_string), (SubLObject)html_complete.NIL, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED) : html_complete.NIL);
        SubLObject constraining_sentence = clean_up_non_constant_symbols(raw_constraining_sentence);
        if (constraining_sentence == html_complete.$kw128$EOF) {
            constraining_sentence = (SubLObject)html_complete.NIL;
        }
        return constraining_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 27011L)
    public static SubLObject clean_up_non_constant_symbols(final SubLObject sexpr) {
        return cycl_utilities.expression_transform(sexpr, (SubLObject)html_complete.$sym129$NON_CYCL_SYMBOL_, (SubLObject)html_complete.$sym130$CONVERT_TO_KEYWORD, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 27142L)
    public static SubLObject non_cycl_symbolP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isSymbol() && html_complete.NIL == Eval.constantp(obj, (SubLObject)html_complete.UNPROVIDED) && html_complete.NIL == cycl_grammar.cycl_variable_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 27276L)
    public static SubLObject convert_to_keyword(final SubLObject symbol) {
        return Symbols.make_keyword(string_utilities.to_string(symbol));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 28662L)
    public static SubLObject completion_properties_p(final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)html_complete.NIL, remainder = v_properties; html_complete.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            if (html_complete.NIL == subl_promotions.memberP(property, html_complete.$completion_properties$.getDynamicValue(thread), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED)) {
                return (SubLObject)html_complete.NIL;
            }
        }
        return (SubLObject)html_complete.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 28846L)
    public static SubLObject native_complete_int(final SubLObject prefix, SubLObject v_properties) {
        if (v_properties == html_complete.UNPROVIDED) {
            v_properties = (SubLObject)html_complete.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_complete.NIL != completion_properties_p(v_properties) : v_properties;
        thread.resetMultipleValues();
        final SubLObject completion_dictionary = get_xml_completion_data(prefix, v_properties);
        final SubLObject preferred_terms = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return term_result_set_as_list(completion_dictionary, conses_high.getf(v_properties, (SubLObject)html_complete.$kw94$RETURN_ATTRS, (SubLObject)html_complete.UNPROVIDED), (SubLObject)html_complete.$kw85$DEFAULT, preferred_terms);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 29197L)
    public static SubLObject xml_complete_int(final SubLObject prefix, SubLObject v_properties) {
        if (v_properties == html_complete.UNPROVIDED) {
            v_properties = (SubLObject)html_complete.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_complete.NIL != completion_properties_p(v_properties) : v_properties;
        thread.resetMultipleValues();
        final SubLObject completion_dictionary = get_xml_completion_data(prefix, v_properties);
        final SubLObject preferred_terms = thread.secondMultipleValue();
        thread.resetMultipleValues();
        stream_xml_term_result_set(completion_dictionary, conses_high.getf(v_properties, (SubLObject)html_complete.$kw94$RETURN_ATTRS, (SubLObject)html_complete.UNPROVIDED), (SubLObject)html_complete.$kw85$DEFAULT, preferred_terms);
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 29554L)
    public static SubLObject get_xml_completion_data(final SubLObject prefix, SubLObject v_properties) {
        if (v_properties == html_complete.UNPROVIDED) {
            v_properties = (SubLObject)html_complete.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        v_properties = list_utilities.augment_plist_with_defaults(v_properties, (SubLObject)html_complete.$list133);
        final SubLObject mt = conses_high.getf(v_properties, (SubLObject)html_complete.$kw98$MT, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject cyc_terms_only = string_utilities.starts_with(prefix, (SubLObject)html_complete.$str134$__);
        final SubLObject clean_prefix = string_utilities.pre_remove(prefix, (SubLObject)html_complete.$str134$__, Symbols.symbol_function((SubLObject)html_complete.EQUAL));
        SubLObject completions = cb_completions(clean_prefix, html_complete.$const5$Thing, (SubLObject)html_complete.NIL, (SubLObject)html_complete.T, conses_high.getf(v_properties, (SubLObject)html_complete.$kw93$CASE_SENSITIVE_, (SubLObject)html_complete.UNPROVIDED), conses_high.getf(v_properties, (SubLObject)html_complete.$kw89$COMPLETE_ON_CONSTANTS_, (SubLObject)html_complete.UNPROVIDED));
        final SubLObject completion_dict = dictionary.new_dictionary((SubLObject)html_complete.EQUAL, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject preferred_terms = (SubLObject)((html_complete.NIL != conses_high.getf(v_properties, (SubLObject)html_complete.$kw90$PREFER_HISTORY_TERMS_, (SubLObject)html_complete.UNPROVIDED)) ? cb_tools.cb_current_relevant_terms() : html_complete.NIL);
        final SubLObject isa_filter = conses_high.getf(v_properties, (SubLObject)html_complete.$kw101$ISA_FILTER, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject genls_filter = conses_high.getf(v_properties, (SubLObject)html_complete.$kw102$GENLS_FILTER, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject isa_restrictions = conses_high.getf(v_properties, (SubLObject)html_complete.$kw103$ISA_RESTRICTIONS, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject genls_restrictions = conses_high.getf(v_properties, (SubLObject)html_complete.$kw104$GENLS_RESTRICTIONS, (SubLObject)html_complete.UNPROVIDED);
        SubLObject term_list = (SubLObject)html_complete.NIL;
        SubLObject current_count = (SubLObject)html_complete.ZERO_INTEGER;
        SubLObject timed_outP = (SubLObject)html_complete.NIL;
        SubLObject doneP = (SubLObject)html_complete.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$11 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)html_complete.SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)html_complete.T, thread);
                    final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                    try {
                        thread.throwStack.push(tag);
                        final SubLObject _prev_bind_0_$12 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                        try {
                            subl_macro_promotions.$within_with_timeout$.bind((SubLObject)html_complete.T, thread);
                            SubLObject timer = (SubLObject)html_complete.NIL;
                            try {
                                final SubLObject _prev_bind_0_$13 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)html_complete.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                    timer = subl_macro_promotions.with_timeout_start_timer(conses_high.getf(v_properties, (SubLObject)html_complete.$kw96$TIMEOUT, (SubLObject)html_complete.UNPROVIDED), tag);
                                    if (html_complete.NIL == conses_high.getf(v_properties, (SubLObject)html_complete.$kw93$CASE_SENSITIVE_, (SubLObject)html_complete.UNPROVIDED)) {
                                        completions = Sequences.delete_duplicates(completions, Symbols.symbol_function((SubLObject)html_complete.EQUAL), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
                                    }
                                    if (html_complete.NIL == doneP) {
                                        SubLObject csome_list_var = completions;
                                        SubLObject completion = (SubLObject)html_complete.NIL;
                                        completion = csome_list_var.first();
                                        while (html_complete.NIL == doneP && html_complete.NIL != csome_list_var) {
                                            if (html_complete.NIL != constant_handles.constant_p(completion) && html_complete.NIL != term_passes_arg_filters(completion, isa_filter, genls_filter, mt) && html_complete.NIL != term_passes_arg_restrictions(completion, isa_restrictions, genls_restrictions, mt)) {
                                                add_completion_to_dict(completion, prefix, constants_high.constant_name(completion), completion_dict);
                                                current_count = Numbers.add(current_count, (SubLObject)html_complete.ONE_INTEGER);
                                            }
                                            if (html_complete.NIL == cyc_terms_only && html_complete.NIL == constant_handles.constant_p(completion)) {
                                                SubLObject cdolist_list_var = completion_denots_of_string(completion, conses_high.getf(v_properties, (SubLObject)html_complete.$kw93$CASE_SENSITIVE_, (SubLObject)html_complete.UNPROVIDED), conses_high.getf(v_properties, (SubLObject)html_complete.$kw92$LEXICON, (SubLObject)html_complete.UNPROVIDED));
                                                SubLObject v_term = (SubLObject)html_complete.NIL;
                                                v_term = cdolist_list_var.first();
                                                while (html_complete.NIL != cdolist_list_var) {
                                                    if (html_complete.NIL != term_passes_arg_filters(v_term, isa_filter, genls_filter, mt) && html_complete.NIL != term_passes_arg_restrictions(v_term, isa_restrictions, genls_restrictions, mt)) {
                                                        current_count = Numbers.add(current_count, (SubLObject)html_complete.ONE_INTEGER);
                                                        term_list = (SubLObject)ConsesLow.cons(v_term, term_list);
                                                        add_completion_to_dict(v_term, prefix, completion, completion_dict);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    v_term = cdolist_list_var.first();
                                                }
                                            }
                                            if (current_count.numG(conses_high.getf(v_properties, (SubLObject)html_complete.$kw97$LIMIT, (SubLObject)html_complete.UNPROVIDED))) {
                                                doneP = (SubLObject)html_complete.T;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            completion = csome_list_var.first();
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$13, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_complete.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    subl_macro_promotions.with_timeout_stop_timer(timer);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                }
                            }
                        }
                        finally {
                            subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    return Values.values(completion_dict, preferred_terms);
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$11, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_complete.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 31834L)
    public static SubLObject add_completion_to_dict(final SubLObject completion, final SubLObject prefix, final SubLObject matched_string, final SubLObject completion_dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject display_string = display_string_for_completion(completion, prefix, matched_string);
        final SubLObject preferredP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (html_complete.NIL != preferredP) {
            dictionary_utilities.dictionary_push(completion_dict, completion, display_string);
        }
        else {
            dictionary.dictionary_enter(completion_dict, completion, list_utilities.add_to_end(display_string, dictionary.dictionary_lookup_without_values(completion_dict, completion, (SubLObject)html_complete.NIL)));
        }
        return completion_dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 32316L)
    public static SubLObject completion_denots_of_string_internal(final SubLObject string, SubLObject case_sensitiveP, SubLObject lexicon) {
        if (case_sensitiveP == html_complete.UNPROVIDED) {
            case_sensitiveP = (SubLObject)html_complete.NIL;
        }
        if (lexicon == html_complete.UNPROVIDED) {
            lexicon = (SubLObject)html_complete.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = (SubLObject)html_complete.NIL;
        final SubLObject lexicon_to_use = (html_complete.NIL != lexicon) ? lexicon : completion_lexicon(case_sensitiveP);
        denots = lexicon_accessors.denots_of_string(string, (SubLObject)html_complete.NIL, (SubLObject)html_complete.$kw136$DENOT, (SubLObject)html_complete.T, (SubLObject)html_complete.NIL, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), (SubLObject)html_complete.$kw137$NEVER, (SubLObject)html_complete.NIL, lexicon_to_use);
        return denots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 32316L)
    public static SubLObject completion_denots_of_string(final SubLObject string, SubLObject case_sensitiveP, SubLObject lexicon) {
        if (case_sensitiveP == html_complete.UNPROVIDED) {
            case_sensitiveP = (SubLObject)html_complete.NIL;
        }
        if (lexicon == html_complete.UNPROVIDED) {
            lexicon = (SubLObject)html_complete.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)html_complete.NIL;
        if (html_complete.NIL == v_memoization_state) {
            return completion_denots_of_string_internal(string, case_sensitiveP, lexicon);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)html_complete.$sym135$COMPLETION_DENOTS_OF_STRING, (SubLObject)html_complete.UNPROVIDED);
        if (html_complete.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)html_complete.$sym135$COMPLETION_DENOTS_OF_STRING, (SubLObject)html_complete.THREE_INTEGER, (SubLObject)html_complete.NIL, (SubLObject)html_complete.EQUAL, (SubLObject)html_complete.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)html_complete.$sym135$COMPLETION_DENOTS_OF_STRING, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(string, case_sensitiveP, lexicon);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)html_complete.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)html_complete.NIL;
            collision = cdolist_list_var.first();
            while (html_complete.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (case_sensitiveP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (html_complete.NIL != cached_args && html_complete.NIL == cached_args.rest() && lexicon.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(completion_denots_of_string_internal(string, case_sensitiveP, lexicon)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(string, case_sensitiveP, lexicon));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 32827L)
    public static SubLObject completion_lexicon_internal(final SubLObject case_sensitiveP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return denots_of_string_lexicon.lexicon_for_denots_of_string((SubLObject)html_complete.$list139, (SubLObject)html_complete.$kw136$DENOT, (SubLObject)html_complete.T, (SubLObject)html_complete.NIL, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), (SubLObject)((html_complete.NIL != case_sensitiveP) ? html_complete.$kw140$ON : html_complete.$kw141$OFF));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 32827L)
    public static SubLObject completion_lexicon(final SubLObject case_sensitiveP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)html_complete.NIL;
        if (html_complete.NIL == v_memoization_state) {
            return completion_lexicon_internal(case_sensitiveP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)html_complete.$sym138$COMPLETION_LEXICON, (SubLObject)html_complete.UNPROVIDED);
        if (html_complete.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)html_complete.$sym138$COMPLETION_LEXICON, (SubLObject)html_complete.ONE_INTEGER, (SubLObject)html_complete.NIL, (SubLObject)html_complete.EQL, (SubLObject)html_complete.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)html_complete.$sym138$COMPLETION_LEXICON, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, case_sensitiveP, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(completion_lexicon_internal(case_sensitiveP)));
            memoization_state.caching_state_put(caching_state, case_sensitiveP, results, (SubLObject)html_complete.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 33038L)
    public static SubLObject display_string_for_completion(final SubLObject v_term, final SubLObject prefix, final SubLObject matched_string) {
        if (html_complete.NIL != forts.fort_p(v_term)) {
            final SubLObject preferred_paraphrase = preferred_paraphrase_for_completion_term(v_term);
            final SubLObject utf_8 = (SubLObject)((html_complete.NIL != preferred_paraphrase) ? cycl_string.cycl_string_to_utf8_string(preferred_paraphrase) : html_complete.NIL);
            if (html_complete.NIL != utf_8 && html_complete.NIL != string_utilities.starts_with_by_test(utf_8, prefix, Symbols.symbol_function((SubLObject)html_complete.EQUALP))) {
                return Values.values(utf_8, (SubLObject)html_complete.T);
            }
        }
        final SubLObject preferredP = (SubLObject)SubLObjectFactory.makeBoolean((html_complete.NIL != constant_handles.constant_p(v_term) && matched_string.equal(constants_high.constant_name(v_term))) || html_complete.NIL != subl_promotions.memberP(v_term, completion_denots_of_string(matched_string, (SubLObject)html_complete.T, (SubLObject)html_complete.UNPROVIDED), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED));
        return Values.values(matched_string, preferredP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 33825L)
    public static SubLObject select_display_string_for_completion_term(SubLObject strings, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var;
        final SubLObject orig_length = pcase_var = Sequences.length(strings);
        if (pcase_var.eql((SubLObject)html_complete.ZERO_INTEGER)) {
            return (SubLObject)html_complete.NIL;
        }
        if (pcase_var.eql((SubLObject)html_complete.ONE_INTEGER)) {
            return strings.first();
        }
        strings = Sequences.delete_duplicates(strings, Symbols.symbol_function((SubLObject)html_complete.EQUAL), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
        if (html_complete.NIL != list_utilities.lengthL(strings, orig_length, (SubLObject)html_complete.UNPROVIDED)) {
            return select_display_string_for_completion_term(strings, v_term);
        }
        final SubLObject preferred_paraphrase = preferred_paraphrase_for_completion_term(v_term);
        final SubLObject utf_8 = (SubLObject)((html_complete.NIL != preferred_paraphrase) ? cycl_string.cycl_string_to_utf8_string(preferred_paraphrase) : html_complete.NIL);
        if (html_complete.NIL != Sequences.find(utf_8, strings, Symbols.symbol_function((SubLObject)html_complete.EQUAL), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED)) {
            return utf_8;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)html_complete.$sym35$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(html_complete.$const36$EverythingPSC, thread);
            SubLObject cdolist_list_var = strings;
            SubLObject string = (SubLObject)html_complete.NIL;
            string = cdolist_list_var.first();
            while (html_complete.NIL != cdolist_list_var) {
                if (virtual_indexing.num_overlap_index((SubLObject)ConsesLow.list(v_term, string), (SubLObject)html_complete.UNPROVIDED).isPositive()) {
                    return string;
                }
                cdolist_list_var = cdolist_list_var.rest();
                string = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return strings.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 34788L)
    public static SubLObject preferred_paraphrase_for_completion_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_complete.NIL == forts.fort_p(v_term)) {
            return (SubLObject)html_complete.NIL;
        }
        thread.resetMultipleValues();
        SubLObject preferred_paraphrase = nl_generation_fort_cache.nl_generation_cache_lookup(v_term, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
        SubLObject agr_pred = thread.secondMultipleValue();
        SubLObject demerits = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (html_complete.NIL == preferred_paraphrase) {
            thread.resetMultipleValues();
            final SubLObject preferred_paraphrase_$16 = nl_generation_fort_cache.paraphrase_fort_for_cache(v_term, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
            final SubLObject agr_pred_$17 = thread.secondMultipleValue();
            final SubLObject demerits_$18 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            preferred_paraphrase = preferred_paraphrase_$16;
            agr_pred = agr_pred_$17;
            demerits = demerits_$18;
        }
        if (html_complete.NIL != preferred_paraphrase && demerits.isNumber() && demerits.numLE((SubLObject)html_complete.ONE_INTEGER)) {
            return preferred_paraphrase;
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 35305L)
    public static SubLObject stream_xml_term_result_set(final SubLObject term_dictionary, SubLObject return_attrs, SubLObject term_list, SubLObject preferred_terms) {
        if (return_attrs == html_complete.UNPROVIDED) {
            return_attrs = (SubLObject)html_complete.$list81;
        }
        if (term_list == html_complete.UNPROVIDED) {
            term_list = (SubLObject)html_complete.$kw85$DEFAULT;
        }
        if (preferred_terms == html_complete.UNPROVIDED) {
            preferred_terms = (SubLObject)html_complete.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sorted_term_alist_1 = dictionary_utilities.sort_dictionary_by_keys(term_dictionary, (SubLObject)html_complete.$sym142$NUM_INDEX_);
        final SubLObject sorted_term_alist = sort_preferred_completions_to_front(sorted_term_alist_1, set_utilities.construct_set_from_list(preferred_terms, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED));
        if (term_list == html_complete.$kw85$DEFAULT) {
            term_list = dictionary.dictionary_keys(term_dictionary);
        }
        xml_utilities.xml_markup((SubLObject)html_complete.$str143$__xml_version__1_0__encoding__UTF);
        xml_utilities.xml_terpri();
        final SubLObject attrs = (SubLObject)html_complete.$list144;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal((SubLObject)html_complete.$str145$ResultSet, attrs, (SubLObject)html_complete.NIL, (SubLObject)html_complete.T, (SubLObject)html_complete.$kw45$UNINITIALIZED);
                final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind((SubLObject)html_complete.$kw45$UNINITIALIZED, thread);
                    SubLObject cdolist_list_var = sorted_term_alist;
                    SubLObject cons = (SubLObject)html_complete.NIL;
                    cons = cdolist_list_var.first();
                    while (html_complete.NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = cons;
                        SubLObject constant = (SubLObject)html_complete.NIL;
                        SubLObject completion_strings = (SubLObject)html_complete.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list146);
                        constant = current.first();
                        current = (completion_strings = current.rest());
                        SubLObject attrs_$20 = (SubLObject)html_complete.NIL;
                        if (html_complete.NIL != subl_promotions.memberP((SubLObject)html_complete.$kw147$CYCL, return_attrs, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED)) {
                            attrs_$20 = (SubLObject)ConsesLow.cons((SubLObject)html_complete.$str148$cycl, (SubLObject)ConsesLow.cons(format_nil.format_nil_s(cycl_utilities.hl_to_el(constant)), attrs_$20));
                        }
                        if (html_complete.NIL != subl_promotions.memberP((SubLObject)html_complete.$kw149$NL, return_attrs, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED)) {
                            attrs_$20 = (SubLObject)ConsesLow.cons((SubLObject)html_complete.$str150$nl, (SubLObject)ConsesLow.cons(select_display_string_for_completion_term(completion_strings, constant), attrs_$20));
                        }
                        if (html_complete.NIL != subl_promotions.memberP((SubLObject)html_complete.$kw151$DISAMBIG_STRING, return_attrs, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED)) {
                            final SubLObject disambig_terms = pph_disambiguation.clarification_terms_wrt(constant, term_list, (SubLObject)html_complete.ONE_INTEGER, (SubLObject)html_complete.UNPROVIDED);
                            if (html_complete.NIL != disambig_terms) {
                                attrs_$20 = (SubLObject)ConsesLow.cons((SubLObject)html_complete.$str152$disambigString, (SubLObject)ConsesLow.cons(pph_main.generate_phrase(disambig_terms.first(), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED), attrs_$20));
                            }
                        }
                        if (html_complete.NIL != subl_promotions.memberP((SubLObject)html_complete.$kw153$HL_ID, return_attrs, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED)) {
                            attrs_$20 = (SubLObject)ConsesLow.cons((SubLObject)html_complete.$str154$hlId, (SubLObject)ConsesLow.cons(kb_utilities.compact_hl_external_id_string(constant), attrs_$20));
                        }
                        final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)html_complete.$str155$Term, attrs_$20, (SubLObject)html_complete.T, (SubLObject)html_complete.NIL, (SubLObject)html_complete.$kw45$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)html_complete.$kw45$UNINITIALIZED, thread);
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$22, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$20, thread);
                        }
                        xml_utilities.xml_terpri();
                        cdolist_list_var = cdolist_list_var.rest();
                        cons = cdolist_list_var.first();
                    }
                }
                finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$19, thread);
                }
            }
            finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_complete.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal((SubLObject)html_complete.$str145$ResultSet);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 37280L)
    public static SubLObject term_result_set_as_list(final SubLObject term_dictionary, SubLObject return_attrs, SubLObject term_list, SubLObject preferred_terms) {
        if (return_attrs == html_complete.UNPROVIDED) {
            return_attrs = (SubLObject)html_complete.$list81;
        }
        if (term_list == html_complete.UNPROVIDED) {
            term_list = (SubLObject)html_complete.$kw85$DEFAULT;
        }
        if (preferred_terms == html_complete.UNPROVIDED) {
            preferred_terms = (SubLObject)html_complete.NIL;
        }
        final SubLObject term_alist = dictionary_utilities.dictionary_to_alist(term_dictionary);
        final SubLObject sorted_term_alist_1 = Sort.sort(term_alist, (SubLObject)html_complete.$sym142$NUM_INDEX_, (SubLObject)html_complete.$sym156$FIRST);
        final SubLObject sorted_term_alist = sort_preferred_completions_to_front(sorted_term_alist_1, set_utilities.construct_set_from_list(preferred_terms, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED));
        SubLObject result = (SubLObject)html_complete.NIL;
        if (term_list == html_complete.$kw85$DEFAULT) {
            term_list = dictionary.dictionary_keys(term_dictionary);
        }
        SubLObject cdolist_list_var = sorted_term_alist;
        SubLObject cons = (SubLObject)html_complete.NIL;
        cons = cdolist_list_var.first();
        while (html_complete.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject constant = (SubLObject)html_complete.NIL;
            SubLObject completion_strings = (SubLObject)html_complete.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list146);
            constant = current.first();
            current = (completion_strings = current.rest());
            final SubLObject attrs = (SubLObject)html_complete.NIL;
            SubLObject item = (SubLObject)html_complete.NIL;
            if (html_complete.NIL != subl_promotions.memberP((SubLObject)html_complete.$kw147$CYCL, return_attrs, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED)) {
                item = (SubLObject)ConsesLow.cons(constant, item);
                item = (SubLObject)ConsesLow.cons((SubLObject)html_complete.$kw147$CYCL, item);
            }
            if (html_complete.NIL != subl_promotions.memberP((SubLObject)html_complete.$kw149$NL, return_attrs, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED)) {
                item = (SubLObject)ConsesLow.cons(completion_strings.first(), item);
                item = (SubLObject)ConsesLow.cons((SubLObject)html_complete.$kw149$NL, item);
            }
            if (html_complete.NIL != subl_promotions.memberP((SubLObject)html_complete.$kw151$DISAMBIG_STRING, return_attrs, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED)) {
                final SubLObject disambig_terms = pph_disambiguation.clarification_terms_wrt(constant, term_list, (SubLObject)html_complete.ONE_INTEGER, (SubLObject)html_complete.UNPROVIDED);
                if (html_complete.NIL != disambig_terms) {
                    item = (SubLObject)ConsesLow.cons(pph_main.generate_phrase(disambig_terms.first(), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED), item);
                    item = (SubLObject)ConsesLow.cons((SubLObject)html_complete.$kw151$DISAMBIG_STRING, item);
                }
            }
            if (html_complete.NIL != subl_promotions.memberP((SubLObject)html_complete.$kw153$HL_ID, return_attrs, (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED)) {
                item = (SubLObject)ConsesLow.cons(kb_utilities.compact_hl_external_id_string(constant), item);
                item = (SubLObject)ConsesLow.cons((SubLObject)html_complete.$kw153$HL_ID, item);
            }
            result = (SubLObject)ConsesLow.cons(item, result);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 38499L)
    public static SubLObject sort_preferred_completions_to_front(final SubLObject completion_items, final SubLObject preferred) {
        return list_utilities.sort_preferred_to_front(conses_high.copy_list(completion_items), preferred, Symbols.symbol_function((SubLObject)html_complete.$sym156$FIRST));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 38666L)
    public static SubLObject clear_term_passes_arg_restrictions() {
        final SubLObject cs = html_complete.$term_passes_arg_restrictions_caching_state$.getGlobalValue();
        if (html_complete.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 38666L)
    public static SubLObject remove_term_passes_arg_restrictions(final SubLObject v_term, final SubLObject isa_restrictions, final SubLObject genls_restrictions, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(html_complete.$term_passes_arg_restrictions_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, isa_restrictions, genls_restrictions, mt), (SubLObject)html_complete.UNPROVIDED, (SubLObject)html_complete.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 38666L)
    public static SubLObject term_passes_arg_restrictions_internal(final SubLObject v_term, final SubLObject isa_restrictions, final SubLObject genls_restrictions, SubLObject mt) {
        if (mt == html_complete.$kw85$DEFAULT) {
            mt = html_complete.$const105$BaseKB;
        }
        SubLObject cdolist_list_var = isa_restrictions;
        SubLObject isa_restriction = (SubLObject)html_complete.NIL;
        isa_restriction = cdolist_list_var.first();
        while (html_complete.NIL != cdolist_list_var) {
            if (html_complete.NIL != isa.not_isaP(v_term, isa_restriction, mt, (SubLObject)html_complete.UNPROVIDED)) {
                return (SubLObject)html_complete.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            isa_restriction = cdolist_list_var.first();
        }
        cdolist_list_var = genls_restrictions;
        SubLObject genls_restriction = (SubLObject)html_complete.NIL;
        genls_restriction = cdolist_list_var.first();
        while (html_complete.NIL != cdolist_list_var) {
            cdolist_list_var = cdolist_list_var.rest();
            genls_restriction = cdolist_list_var.first();
        }
        return (SubLObject)html_complete.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 38666L)
    public static SubLObject term_passes_arg_restrictions(final SubLObject v_term, final SubLObject isa_restrictions, final SubLObject genls_restrictions, final SubLObject mt) {
        SubLObject caching_state = html_complete.$term_passes_arg_restrictions_caching_state$.getGlobalValue();
        if (html_complete.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)html_complete.$sym157$TERM_PASSES_ARG_RESTRICTIONS, (SubLObject)html_complete.$sym158$_TERM_PASSES_ARG_RESTRICTIONS_CACHING_STATE_, (SubLObject)html_complete.NIL, (SubLObject)html_complete.EQUALP, (SubLObject)html_complete.FOUR_INTEGER, (SubLObject)html_complete.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)html_complete.$sym159$CLEAR_TERM_PASSES_ARG_RESTRICTIONS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, isa_restrictions, genls_restrictions, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)html_complete.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)html_complete.NIL;
            collision = cdolist_list_var.first();
            while (html_complete.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (isa_restrictions.equalp(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (genls_restrictions.equalp(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (html_complete.NIL != cached_args && html_complete.NIL == cached_args.rest() && mt.equalp(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(term_passes_arg_restrictions_internal(v_term, isa_restrictions, genls_restrictions, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, isa_restrictions, genls_restrictions, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 39374L)
    public static SubLObject term_passes_arg_filters(final SubLObject v_term, final SubLObject isa_filter, final SubLObject genls_filter, SubLObject mt) {
        if (mt == html_complete.$kw85$DEFAULT) {
            mt = html_complete.$const100$InferencePSC;
        }
        final SubLObject isa_filter_terms = get_constraints_from_filter(isa_filter);
        SubLObject failP = (SubLObject)html_complete.NIL;
        if (html_complete.NIL == failP) {
            SubLObject csome_list_var;
            SubLObject isa_constraint;
            for (csome_list_var = isa_filter_terms, isa_constraint = (SubLObject)html_complete.NIL, isa_constraint = csome_list_var.first(); html_complete.NIL == failP && html_complete.NIL != csome_list_var; failP = (SubLObject)SubLObjectFactory.makeBoolean(html_complete.NIL == autocomplete_instance_ofP(v_term, isa_constraint, mt)), csome_list_var = csome_list_var.rest(), isa_constraint = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(html_complete.NIL == failP && html_complete.NIL != term_passes_genls_filter(v_term, genls_filter, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 40180L)
    public static SubLObject term_passes_genls_filter(final SubLObject v_term, final SubLObject genls_filter, final SubLObject mt) {
        final SubLObject genls_filter_terms = get_constraints_from_filter(genls_filter);
        SubLObject failP = (SubLObject)html_complete.NIL;
        if (html_complete.NIL == failP) {
            SubLObject csome_list_var;
            SubLObject genls_constraint;
            for (csome_list_var = genls_filter_terms, genls_constraint = (SubLObject)html_complete.NIL, genls_constraint = csome_list_var.first(); html_complete.NIL == failP && html_complete.NIL != csome_list_var; failP = (SubLObject)SubLObjectFactory.makeBoolean(html_complete.NIL == autocomplete_spec_ofP(v_term, genls_constraint, mt)), csome_list_var = csome_list_var.rest(), genls_constraint = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(html_complete.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 40718L)
    public static SubLObject get_constraints_from_filter(final SubLObject filter) {
        if (cycl_utilities.formula_arg0(filter).equal(html_complete.$const125$CollectionIntersectionFn)) {
            return cycl_utilities.formula_args(cycl_utilities.formula_arg1(filter, (SubLObject)html_complete.UNPROVIDED), (SubLObject)html_complete.UNPROVIDED);
        }
        return (SubLObject)((html_complete.NIL != filter) ? ConsesLow.list(filter) : html_complete.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 41363L)
    public static SubLObject clear_autocomplete_isa_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject keys = (SubLObject)html_complete.NIL;
        SubLObject release = (SubLObject)html_complete.NIL;
        try {
            release = Locks.seize_lock(html_complete.$autocomplete_isa_cache_lock$.getGlobalValue());
            keys = cache.cache_keys(html_complete.$autocomplete_isa_cache$.getDynamicValue(thread));
            cache.cache_clear(html_complete.$autocomplete_isa_cache$.getDynamicValue(thread));
        }
        finally {
            if (html_complete.NIL != release) {
                Locks.release_lock(html_complete.$autocomplete_isa_cache_lock$.getGlobalValue());
            }
        }
        SubLObject cdolist_list_var = keys;
        SubLObject key = (SubLObject)html_complete.NIL;
        key = cdolist_list_var.first();
        while (html_complete.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = key;
            SubLObject constraint = (SubLObject)html_complete.NIL;
            SubLObject mt = (SubLObject)html_complete.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list163);
            constraint = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list163);
            mt = current.first();
            current = current.rest();
            if (html_complete.NIL != current) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_complete.$list163);
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 41719L)
    public static SubLObject clear_autocomplete_genls_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject keys = (SubLObject)html_complete.NIL;
        SubLObject release = (SubLObject)html_complete.NIL;
        try {
            release = Locks.seize_lock(html_complete.$autocomplete_genls_cache_lock$.getGlobalValue());
            keys = cache.cache_keys(html_complete.$autocomplete_genls_cache$.getDynamicValue(thread));
            cache.cache_clear(html_complete.$autocomplete_genls_cache$.getDynamicValue(thread));
        }
        finally {
            if (html_complete.NIL != release) {
                Locks.release_lock(html_complete.$autocomplete_genls_cache_lock$.getGlobalValue());
            }
        }
        SubLObject cdolist_list_var = keys;
        SubLObject key = (SubLObject)html_complete.NIL;
        key = cdolist_list_var.first();
        while (html_complete.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = key;
            SubLObject constraint = (SubLObject)html_complete.NIL;
            SubLObject mt = (SubLObject)html_complete.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list163);
            constraint = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_complete.$list163);
            mt = current.first();
            current = current.rest();
            if (html_complete.NIL != current) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_complete.$list163);
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 42242L)
    public static SubLObject instance_of_precachedP(final SubLObject v_term, final SubLObject isa_constraint, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_complete.NIL != narts_high.naut_p(v_term)) {
            return Values.values((SubLObject)html_complete.NIL, (SubLObject)html_complete.NIL);
        }
        SubLObject instance_ofP = (SubLObject)html_complete.NIL;
        SubLObject instance_set = (SubLObject)html_complete.NIL;
        SubLObject cached = (SubLObject)html_complete.NIL;
        SubLObject release = (SubLObject)html_complete.NIL;
        try {
            release = Locks.seize_lock(html_complete.$autocomplete_isa_cache_lock$.getGlobalValue());
            thread.resetMultipleValues();
            final SubLObject instance_set_$24 = cache.cache_get(html_complete.$autocomplete_isa_cache$.getDynamicValue(thread), (SubLObject)ConsesLow.list(isa_constraint, mt));
            final SubLObject cached_$25 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            instance_set = instance_set_$24;
            cached = cached_$25;
        }
        finally {
            if (html_complete.NIL != release) {
                Locks.release_lock(html_complete.$autocomplete_isa_cache_lock$.getGlobalValue());
            }
        }
        if (html_complete.NIL != cached) {
            instance_ofP = set.set_memberP(v_term, instance_set);
        }
        return Values.values(instance_ofP, cached);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 42818L)
    public static SubLObject spec_of_precachedP(final SubLObject v_term, final SubLObject genls_constraint, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_complete.NIL != narts_high.naut_p(v_term)) {
            return Values.values((SubLObject)html_complete.NIL, (SubLObject)html_complete.NIL);
        }
        SubLObject spec_ofP = (SubLObject)html_complete.NIL;
        SubLObject spec_set = (SubLObject)html_complete.NIL;
        SubLObject cached = (SubLObject)html_complete.NIL;
        SubLObject release = (SubLObject)html_complete.NIL;
        try {
            release = Locks.seize_lock(html_complete.$autocomplete_genls_cache_lock$.getGlobalValue());
            thread.resetMultipleValues();
            final SubLObject spec_set_$26 = cache.cache_get(html_complete.$autocomplete_genls_cache$.getDynamicValue(thread), (SubLObject)ConsesLow.list(genls_constraint, mt));
            final SubLObject cached_$27 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            spec_set = spec_set_$26;
            cached = cached_$27;
        }
        finally {
            if (html_complete.NIL != release) {
                Locks.release_lock(html_complete.$autocomplete_genls_cache_lock$.getGlobalValue());
            }
        }
        if (html_complete.NIL != cached) {
            spec_ofP = set.set_memberP(v_term, spec_set);
        }
        return Values.values(spec_ofP, cached);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 43370L)
    public static SubLObject autocomplete_instance_ofP(final SubLObject v_term, final SubLObject isa_constraint, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject passes_constraint = instance_of_precachedP(v_term, isa_constraint, mt);
        final SubLObject cachedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (html_complete.NIL != cachedP) {
            return passes_constraint;
        }
        if (html_complete.NIL != kb_utilities.kbeq(isa_constraint, html_complete.$const5$Thing)) {
            return (SubLObject)html_complete.T;
        }
        if (html_complete.NIL != kb_utilities.kbeq(isa_constraint, html_complete.$const166$Collection)) {
            return fort_types_interface.fort_has_typeP(v_term, isa_constraint, mt);
        }
        if (html_complete.NIL != narts_high.naut_p(v_term)) {
            return isa.isaP(v_term, isa_constraint, mt, (SubLObject)html_complete.UNPROVIDED);
        }
        if (html_complete.NIL == cardinality_estimates.generality_estimateL(isa_constraint, html_complete.$const167$PhysiologicalCondition)) {
            precache_isa_constraint(isa_constraint, mt);
            return isa.isaP(v_term, isa_constraint, mt, (SubLObject)html_complete.UNPROVIDED);
        }
        precache_isa_constraint_guts(isa_constraint, mt);
        return instance_of_precachedP(v_term, isa_constraint, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 44638L)
    public static SubLObject autocomplete_spec_ofP(final SubLObject v_term, final SubLObject genls_constraint, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject passes_constraint = spec_of_precachedP(v_term, genls_constraint, mt);
        final SubLObject cachedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (html_complete.NIL != cachedP) {
            return passes_constraint;
        }
        if (html_complete.NIL != narts_high.naut_p(v_term)) {
            return genls.genlsP(v_term, genls_constraint, mt, (SubLObject)html_complete.UNPROVIDED);
        }
        if (html_complete.NIL != kb_utilities.kbeq(genls_constraint, html_complete.$const5$Thing)) {
            return fort_types_interface.fort_has_typeP(v_term, html_complete.$const166$Collection, mt);
        }
        if (html_complete.NIL == cardinality_estimates.generality_estimateL(genls_constraint, html_complete.$const167$PhysiologicalCondition)) {
            precache_genls_constraint(genls_constraint, mt);
            return genls.genlsP(v_term, genls_constraint, mt, (SubLObject)html_complete.UNPROVIDED);
        }
        precache_genls_constraint_guts(genls_constraint, mt);
        return spec_of_precachedP(v_term, genls_constraint, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 45720L)
    public static SubLObject precache_isa_constraint(final SubLObject constraint, final SubLObject mt) {
        return operation_queues.auxiliary_queue_enqueue((SubLObject)ConsesLow.list((SubLObject)html_complete.$sym168$FI_EVAL, (SubLObject)ConsesLow.list((SubLObject)html_complete.$sym169$QUOTE, (SubLObject)ConsesLow.list((SubLObject)html_complete.$sym170$PRECACHE_ISA_CONSTRAINT_GUTS, constraint, mt))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 45871L)
    public static SubLObject precache_genls_constraint(final SubLObject constraint, final SubLObject mt) {
        return fi.fi_local_eval((SubLObject)ConsesLow.list((SubLObject)html_complete.$sym171$PRECACHE_GENLS_CONSTRAINT_GUTS, constraint, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 46005L)
    public static SubLObject precache_isa_constraint_guts(final SubLObject constraint, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = (SubLObject)html_complete.NIL;
        final SubLObject key = (SubLObject)ConsesLow.list(constraint, mt);
        SubLObject release = (SubLObject)html_complete.NIL;
        try {
            release = Locks.seize_lock(html_complete.$autocomplete_isa_cache_lock$.getGlobalValue());
            if (html_complete.NIL != cache.cache_get(html_complete.$autocomplete_isa_cache$.getDynamicValue(thread), key)) {
                doneP = (SubLObject)html_complete.T;
            }
        }
        finally {
            if (html_complete.NIL != release) {
                Locks.release_lock(html_complete.$autocomplete_isa_cache_lock$.getGlobalValue());
            }
        }
        if (html_complete.NIL == doneP) {
            final SubLObject instance_set = set_utilities.construct_set_from_list(isa.all_instances(constraint, mt, (SubLObject)html_complete.UNPROVIDED), (SubLObject)html_complete.EQUAL, (SubLObject)html_complete.UNPROVIDED);
            SubLObject release_$28 = (SubLObject)html_complete.NIL;
            try {
                release_$28 = Locks.seize_lock(html_complete.$autocomplete_isa_cache_lock$.getGlobalValue());
                cache.cache_set(html_complete.$autocomplete_isa_cache$.getDynamicValue(thread), key, instance_set);
            }
            finally {
                if (html_complete.NIL != release_$28) {
                    Locks.release_lock(html_complete.$autocomplete_isa_cache_lock$.getGlobalValue());
                }
            }
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 46471L)
    public static SubLObject precache_genls_constraint_guts(final SubLObject constraint, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = (SubLObject)html_complete.NIL;
        final SubLObject key = (SubLObject)ConsesLow.list(constraint, mt);
        final SubLObject my_id = random.random((SubLObject)html_complete.$int172$1000);
        SubLObject release = (SubLObject)html_complete.NIL;
        try {
            release = Locks.seize_lock(html_complete.$autocomplete_genls_cache_lock$.getGlobalValue());
            thread.resetMultipleValues();
            final SubLObject value = cache.cache_get(html_complete.$autocomplete_genls_cache$.getDynamicValue(thread), key);
            final SubLObject presentP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (html_complete.NIL != presentP) {
                doneP = (SubLObject)html_complete.T;
            }
        }
        finally {
            if (html_complete.NIL != release) {
                Locks.release_lock(html_complete.$autocomplete_genls_cache_lock$.getGlobalValue());
            }
        }
        if (html_complete.NIL == doneP) {
            final SubLObject spec_set = set_utilities.construct_set_from_list(genls.all_specs(constraint, mt, (SubLObject)html_complete.UNPROVIDED), (SubLObject)html_complete.EQUAL, (SubLObject)html_complete.UNPROVIDED);
            SubLObject release_$29 = (SubLObject)html_complete.NIL;
            try {
                release_$29 = Locks.seize_lock(html_complete.$autocomplete_genls_cache_lock$.getGlobalValue());
                cache.cache_set(html_complete.$autocomplete_genls_cache$.getDynamicValue(thread), key, spec_set);
            }
            finally {
                if (html_complete.NIL != release_$29) {
                    Locks.release_lock(html_complete.$autocomplete_genls_cache_lock$.getGlobalValue());
                }
            }
        }
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 47009L)
    public static SubLObject genlsPX(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == html_complete.UNPROVIDED) {
            mt = (SubLObject)html_complete.NIL;
        }
        if (tv == html_complete.UNPROVIDED) {
            tv = (SubLObject)html_complete.NIL;
        }
        if (html_complete.NIL != function_terms.nat_formula_p(genl) && cycl_utilities.formula_operator(genl).equal(html_complete.$const125$CollectionIntersectionFn)) {
            SubLObject cdolist_list_var;
            final SubLObject v_genls = cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg1(genl, (SubLObject)html_complete.UNPROVIDED), (SubLObject)html_complete.UNPROVIDED);
            SubLObject sub_genl = (SubLObject)html_complete.NIL;
            sub_genl = cdolist_list_var.first();
            while (html_complete.NIL != cdolist_list_var) {
                if (html_complete.NIL == genlsPX(spec, sub_genl, mt, tv)) {
                    return (SubLObject)html_complete.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_genl = cdolist_list_var.first();
            }
            if (html_complete.NIL != v_genls) {
                return (SubLObject)html_complete.T;
            }
        }
        return genls.genlsP(spec, genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 47455L)
    public static SubLObject num_indexG(final SubLObject a, final SubLObject b) {
        return Numbers.numG(kb_indexing.num_index(a), kb_indexing.num_index(b));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 49609L)
    public static SubLObject html_handle_cyclify_script(final SubLObject form, final SubLObject input) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), html_complete.$html_handle_cyclify_script_parameters$.getGlobalValue(), new SubLObject[] { form, input, (html_complete.NIL != html_complete.$cb_pop_up_constant_completion$.getDynamicValue(thread)) ? html_complete.$str7$true : html_complete.$str8$false });
            html_utilities.html_terpri((SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup(html_complete.$html_handle_cyclify_script$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 50068L)
    public static SubLObject html_immediate_perform_cyclify_script(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
            html_utilities.html_princ(html_complete.$html_immediate_perform_cyclify_script_prefix$.getGlobalValue());
            final SubLObject _prev_bind_0_$30 = html_utilities.$html_url_princ_escape_spaces$.currentBinding(thread);
            try {
                html_utilities.$html_url_princ_escape_spaces$.bind((SubLObject)html_complete.NIL, thread);
                html_utilities.html_url_princ(string);
            }
            finally {
                html_utilities.$html_url_princ_escape_spaces$.rebind(_prev_bind_0_$30, thread);
            }
            html_utilities.html_princ(html_complete.$html_immediate_perform_cyclify_script_postfix$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 50374L)
    public static SubLObject cb_cyclify(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject form = html_utilities.html_extract_input((SubLObject)html_complete.$str25$form, args);
        final SubLObject input = html_utilities.html_extract_input((SubLObject)html_complete.$str26$input, args);
        final SubLObject string = string_utilities.subst_whitespace(html_utilities.html_extract_input((SubLObject)html_complete.$str177$string, args));
        thread.resetMultipleValues();
        final SubLObject new_string = string_utilities.cyclify_string(string);
        final SubLObject added_references = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject valid_references = string_utilities.constant_names_in_string(new_string, (SubLObject)html_complete.UNPROVIDED);
        final SubLObject invalid_references = thread.secondMultipleValue();
        thread.resetMultipleValues();
        html_utilities.html_markup((SubLObject)html_complete.$str43$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (html_complete.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_complete.$str44$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_complete.$kw45$UNINITIALIZED) ? ConsesLow.list(html_complete.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)html_complete.$str15$Cyclify);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_handle_cyclify_script(form, input);
            html_immediate_perform_cyclify_script(new_string);
            html_opener_message_on_load((SubLObject)html_complete.$str178$All_valid____references_have_been);
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
            final SubLObject _prev_bind_0_$31 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)html_complete.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
                    final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)html_complete.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)html_complete.$str15$Cyclify);
                        html_utilities.html_indent((SubLObject)html_complete.TWO_INTEGER);
                        html_script_utilities.html_dismiss_button((SubLObject)html_complete.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)html_complete.$str66$Machine__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_princ(Environment.get_machine_name((SubLObject)html_complete.UNPROVIDED));
                        if (html_complete.NIL != invalid_references) {
                            html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            final SubLObject color_val = (SubLObject)html_complete.$kw51$RED;
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (html_complete.NIL != color_val) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_complete.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_complete.UNPROVIDED);
                            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)html_complete.T, thread);
                                html_utilities.html_princ((SubLObject)html_complete.$str179$Invalid_references__);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            SubLObject cdolist_list_var = invalid_references;
                            SubLObject invalid_reference = (SubLObject)html_complete.NIL;
                            invalid_reference = cdolist_list_var.first();
                            while (html_complete.NIL != cdolist_list_var) {
                                html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)html_complete.TWO_INTEGER);
                                html_utilities.html_princ(invalid_reference);
                                cdolist_list_var = cdolist_list_var.rest();
                                invalid_reference = cdolist_list_var.first();
                            }
                        }
                        html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
                        if (html_complete.NIL != added_references) {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_complete.$str180$Added_references__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            SubLObject cdolist_list_var = added_references;
                            SubLObject added_reference = (SubLObject)html_complete.NIL;
                            added_reference = cdolist_list_var.first();
                            while (html_complete.NIL != cdolist_list_var) {
                                html_utilities.html_newline((SubLObject)html_complete.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)html_complete.TWO_INTEGER);
                                html_utilities.html_princ(added_reference);
                                cdolist_list_var = cdolist_list_var.rest();
                                added_reference = cdolist_list_var.first();
                            }
                        }
                        else {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)html_complete.$str181$No_references_added);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$31, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_complete.UNPROVIDED);
        return (SubLObject)html_complete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 51999L)
    public static SubLObject xml_complete_result_count_min(final SubLObject args) {
        return xml_complete_result_count(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 51999L)
    public static SubLObject xml_complete_result_count_max(final SubLObject args) {
        return xml_complete_result_count(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 51999L)
    public static SubLObject xml_complete_result_count(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_string = (SubLObject)html_complete.NIL;
        SubLObject result_count = (SubLObject)html_complete.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
        try {
            html_macros.$html_stream$.bind((SubLObject)html_complete.NIL, thread);
            try {
                html_macros.$html_stream$.setDynamicValue(streams_high.make_private_string_output_stream(), thread);
                xml_complete(args);
                result_string = streams_high.get_output_stream_string(html_macros.$html_stream$.getDynamicValue(thread));
            }
            finally {
                final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_complete.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_complete.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                }
            }
        }
        finally {
            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
        }
        result_count = string_utilities.count_matches((SubLObject)html_complete.$str183$_Term_, result_string, Symbols.symbol_function((SubLObject)html_complete.EQUAL), (SubLObject)html_complete.UNPROVIDED);
        return result_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 51999L)
    public static SubLObject xml_complete_int_result_count_min(final SubLObject prefix, final SubLObject v_properties) {
        return xml_complete_int_result_count(prefix, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-complete.lisp", position = 51999L)
    public static SubLObject xml_complete_int_result_count(final SubLObject prefix, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_string = (SubLObject)html_complete.NIL;
        SubLObject result_count = (SubLObject)html_complete.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind((SubLObject)html_complete.NIL, thread);
            try {
                xml_vars.$xml_stream$.setDynamicValue(streams_high.make_private_string_output_stream(), thread);
                xml_complete_int(prefix, v_properties);
                result_string = streams_high.get_output_stream_string(xml_vars.$xml_stream$.getDynamicValue(thread));
            }
            finally {
                final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_complete.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)html_complete.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        result_count = string_utilities.count_matches((SubLObject)html_complete.$str183$_Term_, result_string, Symbols.symbol_function((SubLObject)html_complete.EQUAL), (SubLObject)html_complete.UNPROVIDED);
        return result_count;
    }
    
    public static SubLObject declare_html_complete_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_complete_button", "HTML-COMPLETE-BUTTON", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_complete_link", "HTML-COMPLETE-LINK", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_cyclify_button", "HTML-CYCLIFY-BUTTON", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "javascript_void_url", "JAVASCRIPT-VOID-URL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_complete_script", "HTML-COMPLETE-SCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_initial_focus_script", "HTML-INITIAL-FOCUS-SCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_opener_message_on_load", "HTML-OPENER-MESSAGE-ON-LOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_handle_complete_script", "HTML-HANDLE-COMPLETE-SCRIPT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_immediate_complete_extend_script", "HTML-IMMEDIATE-COMPLETE-EXTEND-SCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_immediate_complete_choose_script", "HTML-IMMEDIATE-COMPLETE-CHOOSE-SCRIPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "cb_complete", "CB-COMPLETE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "cb_completions", "CB-COMPLETIONS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "cb_complete_choose", "CB-COMPLETE-CHOOSE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "completion_string", "COMPLETION-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "cb_complete_one", "CB-COMPLETE-ONE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "cb_complete_none", "CB-COMPLETE-NONE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "cb_complete_title", "CB-COMPLETE-TITLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "cb_complete_preamble", "CB-COMPLETE-PREAMBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_complete_insert_choice", "HTML-COMPLETE-INSERT-CHOICE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_print_js_autocomplete_setup_int", "HTML-PRINT-JS-AUTOCOMPLETE-SETUP-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "xml_term_search", "XML-TERM-SEARCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "xml_complete", "XML-COMPLETE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_constraint_filters_from_html_args", "GET-CONSTRAINT-FILTERS-FROM-HTML-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "clear_get_isa_restrictions_from_sentence", "CLEAR-GET-ISA-RESTRICTIONS-FROM-SENTENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "remove_get_isa_restrictions_from_sentence", "REMOVE-GET-ISA-RESTRICTIONS-FROM-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_isa_restrictions_from_sentence_internal", "GET-ISA-RESTRICTIONS-FROM-SENTENCE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_isa_restrictions_from_sentence", "GET-ISA-RESTRICTIONS-FROM-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "clear_get_genls_restrictions_from_sentence", "CLEAR-GET-GENLS-RESTRICTIONS-FROM-SENTENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "remove_get_genls_restrictions_from_sentence", "REMOVE-GET-GENLS-RESTRICTIONS-FROM-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_genls_restrictions_from_sentence_internal", "GET-GENLS-RESTRICTIONS-FROM-SENTENCE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_genls_restrictions_from_sentence", "GET-GENLS-RESTRICTIONS-FROM-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "clear_get_arg_constraints_for_arg", "CLEAR-GET-ARG-CONSTRAINTS-FOR-ARG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "remove_get_arg_constraints_for_arg", "REMOVE-GET-ARG-CONSTRAINTS-FOR-ARG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_arg_constraints_for_arg_internal", "GET-ARG-CONSTRAINTS-FOR-ARG-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_arg_constraints_for_arg", "GET-ARG-CONSTRAINTS-FOR-ARG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "clear_get_arg_constraints_for_var", "CLEAR-GET-ARG-CONSTRAINTS-FOR-VAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "remove_get_arg_constraints_for_var", "REMOVE-GET-ARG-CONSTRAINTS-FOR-VAR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_arg_constraints_for_var_internal", "GET-ARG-CONSTRAINTS-FOR-VAR-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_arg_constraints_for_var", "GET-ARG-CONSTRAINTS-FOR-VAR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_genls_filter_from_arg_constraints", "GET-GENLS-FILTER-FROM-ARG-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_isa_filter_from_arg_constraints", "GET-ISA-FILTER-FROM-ARG-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_constraining_sentence_from_html_args", "GET-CONSTRAINING-SENTENCE-FROM-HTML-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "clean_up_non_constant_symbols", "CLEAN-UP-NON-CONSTANT-SYMBOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "non_cycl_symbolP", "NON-CYCL-SYMBOL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "convert_to_keyword", "CONVERT-TO-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "completion_properties_p", "COMPLETION-PROPERTIES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "native_complete_int", "NATIVE-COMPLETE-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "xml_complete_int", "XML-COMPLETE-INT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_xml_completion_data", "GET-XML-COMPLETION-DATA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "add_completion_to_dict", "ADD-COMPLETION-TO-DICT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "completion_denots_of_string_internal", "COMPLETION-DENOTS-OF-STRING-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "completion_denots_of_string", "COMPLETION-DENOTS-OF-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "completion_lexicon_internal", "COMPLETION-LEXICON-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "completion_lexicon", "COMPLETION-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "display_string_for_completion", "DISPLAY-STRING-FOR-COMPLETION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "select_display_string_for_completion_term", "SELECT-DISPLAY-STRING-FOR-COMPLETION-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "preferred_paraphrase_for_completion_term", "PREFERRED-PARAPHRASE-FOR-COMPLETION-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "stream_xml_term_result_set", "STREAM-XML-TERM-RESULT-SET", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "term_result_set_as_list", "TERM-RESULT-SET-AS-LIST", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "sort_preferred_completions_to_front", "SORT-PREFERRED-COMPLETIONS-TO-FRONT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "clear_term_passes_arg_restrictions", "CLEAR-TERM-PASSES-ARG-RESTRICTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "remove_term_passes_arg_restrictions", "REMOVE-TERM-PASSES-ARG-RESTRICTIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "term_passes_arg_restrictions_internal", "TERM-PASSES-ARG-RESTRICTIONS-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "term_passes_arg_restrictions", "TERM-PASSES-ARG-RESTRICTIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "term_passes_arg_filters", "TERM-PASSES-ARG-FILTERS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "term_passes_genls_filter", "TERM-PASSES-GENLS-FILTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "get_constraints_from_filter", "GET-CONSTRAINTS-FROM-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "clear_autocomplete_isa_cache", "CLEAR-AUTOCOMPLETE-ISA-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "clear_autocomplete_genls_cache", "CLEAR-AUTOCOMPLETE-GENLS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "instance_of_precachedP", "INSTANCE-OF-PRECACHED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "spec_of_precachedP", "SPEC-OF-PRECACHED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "autocomplete_instance_ofP", "AUTOCOMPLETE-INSTANCE-OF?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "autocomplete_spec_ofP", "AUTOCOMPLETE-SPEC-OF?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "precache_isa_constraint", "PRECACHE-ISA-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "precache_genls_constraint", "PRECACHE-GENLS-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "precache_isa_constraint_guts", "PRECACHE-ISA-CONSTRAINT-GUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "precache_genls_constraint_guts", "PRECACHE-GENLS-CONSTRAINT-GUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "genlsPX", "GENLS?+", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "num_indexG", "NUM-INDEX>", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_handle_cyclify_script", "HTML-HANDLE-CYCLIFY-SCRIPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "html_immediate_perform_cyclify_script", "HTML-IMMEDIATE-PERFORM-CYCLIFY-SCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "cb_cyclify", "CB-CYCLIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "xml_complete_result_count_min", "XML-COMPLETE-RESULT-COUNT-MIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "xml_complete_result_count_max", "XML-COMPLETE-RESULT-COUNT-MAX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "xml_complete_result_count", "XML-COMPLETE-RESULT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "xml_complete_int_result_count_min", "XML-COMPLETE-INT-RESULT-COUNT-MIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_complete", "xml_complete_int_result_count", "XML-COMPLETE-INT-RESULT-COUNT", 2, 0, false);
        return (SubLObject)html_complete.NIL;
    }
    
    public static SubLObject init_html_complete_file() {
        html_complete.$cb_enable_constant_completion$ = SubLFiles.defparameter("*CB-ENABLE-CONSTANT-COMPLETION*", (SubLObject)html_complete.T);
        html_complete.$cb_pop_up_constant_completion$ = SubLFiles.defparameter("*CB-POP-UP-CONSTANT-COMPLETION*", (SubLObject)html_complete.NIL);
        html_complete.$cb_constant_completion_target$ = SubLFiles.defparameter("*CB-CONSTANT-COMPLETION-TARGET*", (SubLObject)html_complete.$str0$completions);
        html_complete.$html_complete_button_script$ = SubLFiles.deflexical("*HTML-COMPLETE-BUTTON-SCRIPT*", (SubLObject)html_complete.$str1$onClick__constant_complete___A___);
        html_complete.$html_cyclify_button_script$ = SubLFiles.deflexical("*HTML-CYCLIFY-BUTTON-SCRIPT*", (SubLObject)html_complete.$str14$onClick__cyclify___A____);
        html_complete.$html_complete_script_parameters$ = SubLFiles.deflexical("*HTML-COMPLETE-SCRIPT-PARAMETERS*", (SubLObject)html_complete.$str17$_var_cgi_program_____A___var_comp);
        html_complete.$html_intial_focus_script$ = SubLFiles.deflexical("*HTML-INTIAL-FOCUS-SCRIPT*", (SubLObject)html_complete.$str19$_if__window_focus__window_focus__);
        html_complete.$html_opener_message_on_load_script$ = SubLFiles.deflexical("*HTML-OPENER-MESSAGE-ON-LOAD-SCRIPT*", (SubLObject)html_complete.$str20$_if__window_opener__window_opener);
        html_complete.$html_handle_complete_script_parameters$ = SubLFiles.deflexical("*HTML-HANDLE-COMPLETE-SCRIPT-PARAMETERS*", (SubLObject)html_complete.$str21$_var_form_number____A__var_elemen);
        html_complete.$html_handle_complete_script$ = SubLFiles.deflexical("*HTML-HANDLE-COMPLETE-SCRIPT*", (SubLObject)html_complete.$str22$_var_old_length____1___function_c);
        html_complete.$html_immediate_complete_extend_script$ = SubLFiles.defparameter("*HTML-IMMEDIATE-COMPLETE-EXTEND-SCRIPT*", (SubLObject)html_complete.$str23$_complete_extend___A____);
        html_complete.$html_immediate_complete_choose_script$ = SubLFiles.defparameter("*HTML-IMMEDIATE-COMPLETE-CHOOSE-SCRIPT*", (SubLObject)html_complete.$str24$_complete_choose___A____A___);
        html_complete.$html_complete_insert_choice_script$ = SubLFiles.deflexical("*HTML-COMPLETE-INSERT-CHOICE-SCRIPT*", (SubLObject)html_complete.$str69$onClick__complete_choose___A____A);
        html_complete.$js_autocomplete_setup$ = SubLFiles.defparameter("*JS-AUTOCOMPLETE-SETUP*", (SubLObject)html_complete.$str71$var_constantCompleteDataSource___);
        html_complete.$autocomplete_default_limit$ = SubLFiles.defparameter("*AUTOCOMPLETE-DEFAULT-LIMIT*", (SubLObject)html_complete.$int37$50);
        html_complete.$get_isa_restrictions_from_sentence_caching_state$ = SubLFiles.deflexical("*GET-ISA-RESTRICTIONS-FROM-SENTENCE-CACHING-STATE*", (SubLObject)html_complete.NIL);
        html_complete.$get_genls_restrictions_from_sentence_caching_state$ = SubLFiles.deflexical("*GET-GENLS-RESTRICTIONS-FROM-SENTENCE-CACHING-STATE*", (SubLObject)html_complete.NIL);
        html_complete.$get_arg_constraints_for_arg_caching_state$ = SubLFiles.deflexical("*GET-ARG-CONSTRAINTS-FOR-ARG-CACHING-STATE*", (SubLObject)html_complete.NIL);
        html_complete.$get_arg_constraints_for_var_caching_state$ = SubLFiles.deflexical("*GET-ARG-CONSTRAINTS-FOR-VAR-CACHING-STATE*", (SubLObject)html_complete.NIL);
        html_complete.$completion_properties$ = SubLFiles.defparameter("*COMPLETION-PROPERTIES*", (SubLObject)html_complete.$list131);
        html_complete.$term_passes_arg_restrictions_caching_state$ = SubLFiles.deflexical("*TERM-PASSES-ARG-RESTRICTIONS-CACHING-STATE*", (SubLObject)html_complete.NIL);
        html_complete.$autocomplete_isa_cache_lock$ = SubLFiles.deflexical("*AUTOCOMPLETE-ISA-CACHE-LOCK*", Locks.make_lock((SubLObject)html_complete.$str160$Autocomplete_isa_cache_lock));
        html_complete.$autocomplete_genls_cache_lock$ = SubLFiles.deflexical("*AUTOCOMPLETE-GENLS-CACHE-LOCK*", Locks.make_lock((SubLObject)html_complete.$str161$Autocomplete_genls_cache_lock));
        html_complete.$autocomplete_isa_cache$ = SubLFiles.defparameter("*AUTOCOMPLETE-ISA-CACHE*", cache.new_cache((SubLObject)html_complete.$int162$128, (SubLObject)html_complete.EQUAL));
        html_complete.$autocomplete_genls_cache$ = SubLFiles.defparameter("*AUTOCOMPLETE-GENLS-CACHE*", cache.new_cache((SubLObject)html_complete.$int162$128, (SubLObject)html_complete.EQUAL));
        html_complete.$html_handle_cyclify_script_parameters$ = SubLFiles.deflexical("*HTML-HANDLE-CYCLIFY-SCRIPT-PARAMETERS*", (SubLObject)html_complete.$str173$_var_form_number____A__var_elemen);
        html_complete.$html_handle_cyclify_script$ = SubLFiles.deflexical("*HTML-HANDLE-CYCLIFY-SCRIPT*", (SubLObject)html_complete.$str174$_function_cyclify_error_message__);
        html_complete.$html_immediate_perform_cyclify_script_prefix$ = SubLFiles.deflexical("*HTML-IMMEDIATE-PERFORM-CYCLIFY-SCRIPT-PREFIX*", (SubLObject)html_complete.$str175$_handle_cyclify_unescape__);
        html_complete.$html_immediate_perform_cyclify_script_postfix$ = SubLFiles.deflexical("*HTML-IMMEDIATE-PERFORM-CYCLIFY-SCRIPT-POSTFIX*", (SubLObject)html_complete.$str176$_____);
        return (SubLObject)html_complete.NIL;
    }
    
    public static SubLObject setup_html_complete_file() {
        html_macros.note_cgi_handler_function((SubLObject)html_complete.$sym33$CB_COMPLETE, (SubLObject)html_complete.$kw34$HTML_HANDLER);
        access_macros.register_macro_helper((SubLObject)html_complete.$sym72$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT, (SubLObject)html_complete.$sym73$HTML_PRINT_JS_AUTOCOMPLETE_SETUP);
        access_macros.register_external_symbol((SubLObject)html_complete.$sym77$XML_TERM_SEARCH);
        html_macros.note_cgi_handler_function((SubLObject)html_complete.$sym77$XML_TERM_SEARCH, (SubLObject)html_complete.$kw87$XML_HANDLER);
        access_macros.register_external_symbol((SubLObject)html_complete.$sym88$XML_COMPLETE);
        html_macros.note_cgi_handler_function((SubLObject)html_complete.$sym88$XML_COMPLETE, (SubLObject)html_complete.$kw87$XML_HANDLER);
        memoization_state.note_globally_cached_function((SubLObject)html_complete.$sym108$GET_ISA_RESTRICTIONS_FROM_SENTENCE);
        memoization_state.note_globally_cached_function((SubLObject)html_complete.$sym113$GET_GENLS_RESTRICTIONS_FROM_SENTENCE);
        memoization_state.note_globally_cached_function((SubLObject)html_complete.$sym117$GET_ARG_CONSTRAINTS_FOR_ARG);
        memoization_state.note_globally_cached_function((SubLObject)html_complete.$sym120$GET_ARG_CONSTRAINTS_FOR_VAR);
        memoization_state.note_memoized_function((SubLObject)html_complete.$sym135$COMPLETION_DENOTS_OF_STRING);
        memoization_state.note_memoized_function((SubLObject)html_complete.$sym138$COMPLETION_LEXICON);
        memoization_state.note_globally_cached_function((SubLObject)html_complete.$sym157$TERM_PASSES_ARG_RESTRICTIONS);
        memoization_state.register_genls_dependent_cache_clear_callback((SubLObject)html_complete.$sym164$CLEAR_AUTOCOMPLETE_GENLS_CACHE);
        memoization_state.register_isa_dependent_cache_clear_callback((SubLObject)html_complete.$sym165$CLEAR_AUTOCOMPLETE_ISA_CACHE);
        html_macros.note_cgi_handler_function((SubLObject)html_complete.$sym182$CB_CYCLIFY, (SubLObject)html_complete.$kw34$HTML_HANDLER);
        generic_testing.define_test_case_table_int((SubLObject)html_complete.$sym184$XML_COMPLETE_RESULT_COUNT_MIN, (SubLObject)ConsesLow.list(new SubLObject[] { html_complete.$kw185$TEST, Symbols.symbol_function((SubLObject)html_complete.$sym186$_), html_complete.$kw187$OWNER, html_complete.NIL, html_complete.$kw188$CLASSES, html_complete.NIL, html_complete.$kw189$KB, html_complete.$kw190$FULL, html_complete.$kw191$WORKING_, html_complete.T }), (SubLObject)html_complete.$list192);
        generic_testing.define_test_case_table_int((SubLObject)html_complete.$sym193$XML_COMPLETE_RESULT_COUNT_MAX, (SubLObject)ConsesLow.list(new SubLObject[] { html_complete.$kw185$TEST, Symbols.symbol_function((SubLObject)html_complete.$sym194$__), html_complete.$kw187$OWNER, html_complete.NIL, html_complete.$kw188$CLASSES, html_complete.NIL, html_complete.$kw189$KB, html_complete.$kw190$FULL, html_complete.$kw191$WORKING_, html_complete.T }), (SubLObject)html_complete.$list195);
        generic_testing.define_test_case_table_int((SubLObject)html_complete.$sym196$XML_COMPLETE_INT_RESULT_COUNT_MIN, (SubLObject)ConsesLow.list(new SubLObject[] { html_complete.$kw185$TEST, Symbols.symbol_function((SubLObject)html_complete.$sym186$_), html_complete.$kw187$OWNER, html_complete.NIL, html_complete.$kw188$CLASSES, html_complete.NIL, html_complete.$kw189$KB, html_complete.$kw190$FULL, html_complete.$kw191$WORKING_, html_complete.T }), (SubLObject)html_complete.$list197);
        return (SubLObject)html_complete.NIL;
    }
    
    public void declareFunctions() {
        declare_html_complete_file();
    }
    
    public void initializeVariables() {
        init_html_complete_file();
    }
    
    public void runTopLevelForms() {
        setup_html_complete_file();
    }
    
    static {
        me = (SubLFile)new html_complete();
        html_complete.$cb_enable_constant_completion$ = null;
        html_complete.$cb_pop_up_constant_completion$ = null;
        html_complete.$cb_constant_completion_target$ = null;
        html_complete.$html_complete_button_script$ = null;
        html_complete.$html_cyclify_button_script$ = null;
        html_complete.$html_complete_script_parameters$ = null;
        html_complete.$html_intial_focus_script$ = null;
        html_complete.$html_opener_message_on_load_script$ = null;
        html_complete.$html_handle_complete_script_parameters$ = null;
        html_complete.$html_handle_complete_script$ = null;
        html_complete.$html_immediate_complete_extend_script$ = null;
        html_complete.$html_immediate_complete_choose_script$ = null;
        html_complete.$html_complete_insert_choice_script$ = null;
        html_complete.$js_autocomplete_setup$ = null;
        html_complete.$autocomplete_default_limit$ = null;
        html_complete.$get_isa_restrictions_from_sentence_caching_state$ = null;
        html_complete.$get_genls_restrictions_from_sentence_caching_state$ = null;
        html_complete.$get_arg_constraints_for_arg_caching_state$ = null;
        html_complete.$get_arg_constraints_for_var_caching_state$ = null;
        html_complete.$completion_properties$ = null;
        html_complete.$term_passes_arg_restrictions_caching_state$ = null;
        html_complete.$autocomplete_isa_cache_lock$ = null;
        html_complete.$autocomplete_genls_cache_lock$ = null;
        html_complete.$autocomplete_isa_cache$ = null;
        html_complete.$autocomplete_genls_cache$ = null;
        html_complete.$html_handle_cyclify_script_parameters$ = null;
        html_complete.$html_handle_cyclify_script$ = null;
        html_complete.$html_immediate_perform_cyclify_script_prefix$ = null;
        html_complete.$html_immediate_perform_cyclify_script_postfix$ = null;
        $str0$completions = SubLObjectFactory.makeString("completions");
        $str1$onClick__constant_complete___A___ = SubLObjectFactory.makeString("onClick=\"constant_complete('~A', ~A, '~A', ~A, ~A);\"");
        $str2$Complete = SubLObjectFactory.makeString("Complete");
        $str3$ = SubLObjectFactory.makeString("");
        $sym4$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $const5$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $sym6$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str7$true = SubLObjectFactory.makeString("true");
        $str8$false = SubLObjectFactory.makeString("false");
        $str9$constant_complete__ = SubLObjectFactory.makeString("constant_complete('");
        $str10$___ = SubLObjectFactory.makeString("', ");
        $str11$___ = SubLObjectFactory.makeString(", '");
        $str12$__ = SubLObjectFactory.makeString(", ");
        $str13$__ = SubLObjectFactory.makeString(");");
        $str14$onClick__cyclify___A____ = SubLObjectFactory.makeString("onClick=\"cyclify('~A');\"");
        $str15$Cyclify = SubLObjectFactory.makeString("Cyclify");
        $str16$javascript_void____ = SubLObjectFactory.makeString("javascript:void('')");
        $str17$_var_cgi_program_____A___var_comp = SubLObjectFactory.makeString("\nvar cgi_program = '~A';\nvar completion_frame_name = '~A';\n");
        $kw18$CONSTANT_COMPLETION = SubLObjectFactory.makeKeyword("CONSTANT-COMPLETION");
        $str19$_if__window_focus__window_focus__ = SubLObjectFactory.makeString("\nif (window.focus) window.focus();");
        $str20$_if__window_opener__window_opener = SubLObjectFactory.makeString("\nif (window.opener) window.opener.status = '~A';\n");
        $str21$_var_form_number____A__var_elemen = SubLObjectFactory.makeString("\nvar form_number = ~A;\nvar element_number = ~A;\nvar prefix = '~A';\nvar close_window = ~A;\n");
        $str22$_var_old_length____1___function_c = SubLObjectFactory.makeString("\nvar old_length = -1;\n\nfunction complete_error(message) {\n  document.open();\n  document.writeln('Error ' + message);\n  document.writeln('Completion links only apply to the page which originally generated them.<p>');\n  document.writeln('That page is no longer available.');\n  document.close();\n  return false;\n}\n\nfunction complete_insert(full_string, submit, chosen) {\n  // defensive programming to prevent script errors\n  if (!window.opener) \n    return complete_error(1);\n  if (!window.opener.document) \n    return complete_error(2);\n  if (!window.opener.document.forms) \n    return complete_error(3);\n  if (!window.opener.document.forms.length) \n    return complete_error(4);\n  if (window.opener.document.forms.length < form_number) \n    return complete_error(5);\n  \n  if (window.opener.focus && chosen) window.opener.focus();\n\n  var form = window.opener.document.forms[form_number];\n\n  if (!form.elements) \n    return complete_error(6);\n  if (!form.elements.length) \n    return complete_error(7);\n  if (form.elements.length < element_number) \n    return complete_error(8);\n\n  var element = form.elements[element_number];\n\n  // @todo remove this\n  //if (!element.value) \n  //  return complete_error(9);\n\n  var old_value = element.value;\n  if (old_length < 0) old_length = old_value.length;\n\n  // now actually do the completion\n  var prefix_length = prefix.length;\n  var full_length = full_string.length;\n  var completion = full_string.substring(prefix_length, full_length);\n  var preamble = old_value.substring(0, (old_length - prefix_length));\n  element.value = preamble + full_string;\n  // if (element.focus) element.focus();\n\n  // submit the form if we are supposed to\n  if (submit)\n    form.submit();\n\n  // close the window if we are supposed to\n  if (close_window)\n    self.close();\n\n  return false;\n}\n\nfunction complete_extend(full_string) {\n  return complete_insert(full_string, false, false);\n}\n\nfunction complete_choose(full_string, submit) {\n  return complete_insert(full_string, submit, true);\n}");
        $str23$_complete_extend___A____ = SubLObjectFactory.makeString("\ncomplete_extend('~A');\n");
        $str24$_complete_choose___A____A___ = SubLObjectFactory.makeString("\ncomplete_choose('~A', ~A);\n");
        $str25$form = SubLObjectFactory.makeString("form");
        $str26$input = SubLObjectFactory.makeString("input");
        $str27$prefix = SubLObjectFactory.makeString("prefix");
        $str28$submit = SubLObjectFactory.makeString("submit");
        $str29$filter = SubLObjectFactory.makeString("filter");
        $str30$choices = SubLObjectFactory.makeString("choices");
        $str31$case_insensitive = SubLObjectFactory.makeString("case-insensitive");
        $str32$lexical = SubLObjectFactory.makeString("lexical");
        $sym33$CB_COMPLETE = SubLObjectFactory.makeSymbol("CB-COMPLETE");
        $kw34$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym35$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const36$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $int37$50 = SubLObjectFactory.makeInteger(50);
        $sym38$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym39$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym40$CONSTANT_NAME = SubLObjectFactory.makeSymbol("CONSTANT-NAME");
        $sym41$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $sym42$COMPLETION_STRING = SubLObjectFactory.makeSymbol("COMPLETION-STRING");
        $str43$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str44$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw45$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str46$Exact_match_plus_one_longer_compl = SubLObjectFactory.makeString("Exact match plus one longer completion.");
        $str47$Exact_match_plus__S_longer_comple = SubLObjectFactory.makeString("Exact match plus ~S longer completions.");
        $str48$_S_possible__A_ = SubLObjectFactory.makeString("~S possible ~A.");
        $str49$suggestions = SubLObjectFactory.makeString("suggestions");
        $str50$Extension__ = SubLObjectFactory.makeString("Extension: ");
        $kw51$RED = SubLObjectFactory.makeKeyword("RED");
        $str52$_Suggestions_ = SubLObjectFactory.makeString(" Suggestions:");
        $str53$_Completions_ = SubLObjectFactory.makeString(" Completions:");
        $str54$Constants___A__ = SubLObjectFactory.makeString("Constants (~A):");
        $str55$Lexical_Strings___A__ = SubLObjectFactory.makeString("Lexical Strings (~A):");
        $str56$Sole_completion__already_complete = SubLObjectFactory.makeString("Sole completion (already completed).");
        $str57$Sole_completion_ = SubLObjectFactory.makeString("Sole completion.");
        $str58$Already_completed_ = SubLObjectFactory.makeString("Already completed.");
        $str59$Sole_completion_ = SubLObjectFactory.makeString("Sole completion:");
        $str60$No_completions_ = SubLObjectFactory.makeString("No completions.");
        $str61$No_suggestions_ = SubLObjectFactory.makeString("No suggestions.");
        $str62$No_completions = SubLObjectFactory.makeString("No completions");
        $str63$No_suggestions = SubLObjectFactory.makeString("No suggestions");
        $str64$Suggestions = SubLObjectFactory.makeString("Suggestions");
        $str65$Completions = SubLObjectFactory.makeString("Completions");
        $str66$Machine__ = SubLObjectFactory.makeString("Machine: ");
        $str67$Prefix__ = SubLObjectFactory.makeString("Prefix: ");
        $str68$Filter__ = SubLObjectFactory.makeString("Filter: ");
        $str69$onClick__complete_choose___A____A = SubLObjectFactory.makeString("onClick=\"complete_choose('~A', ~A);\"");
        $str70$complete = SubLObjectFactory.makeString("complete");
        $str71$var_constantCompleteDataSource___ = SubLObjectFactory.makeString("var constantCompleteDataSource = new YAHOO.widget.DS_XHR('./cg', ['Term', 'cycl', 'nl']);\n constantCompleteDataSource.scriptQueryParam = 'xml-complete~A&prefix';  \n constantCompleteDataSource.responseType = YAHOO.widget.DS_XHR.TYPE_XML;\n var constantComplete = new YAHOO.widget.AutoComplete('~A', '~A', constantCompleteDataSource);\n constantComplete.allowBrowserAutocomplete = true;  \n constantComplete.autoHighlight = false;\n constantComplete.minQueryLength = ~A;\n constantComplete.animSpeed = 0.1;\n// constantComplete.delimChar = ' '; //this would be good if we were working in just CycL (no lexical completions)\n constantComplete.maxResultsDisplayed=~A;\n constantComplete.queryDelay=0.3;\n constantComplete.embeddedInToolbar=~A;\n\n if (constantComplete.embeddedInToolbar) {\n   constantComplete.itemSelectEvent.subscribe(function (sType, aArgs) { document.getElementById('inputBox').form.submit();}); \n}\n \n constantComplete.formatResult = function(oResultItem, sQuery) {\n   var thisConst = oResultItem[0];\n   var string = oResultItem[1];\n   var sMarkup = string + ' <span class=\"autoCompCycL\">' + thisConst + '</span>'; \n   return (sMarkup);\n };\n if (constantComplete.embeddedInToolbar) {\n   constantComplete.containerExpandEvent.subscribe(function() {\n    if (!this.expandedRows) {\n      this.expandedRows=parent.document.body.rows;\n      var rows = parent.document.body.rows;\n      rows = rows.replace(/.*,.*,/, YAHOO.util.Dom.getDocumentHeight() + ',*,');\n      parent.document.body.rows=rows;\n    }\n   });\n   constantComplete.containerCollapseEvent.subscribe(function() {\n    if (this.expandedRows) { parent.document.body.rows=this.expandedRows; }\n    this.expandedRows = null;\n   });\n }\n");
        $sym72$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT = SubLObjectFactory.makeSymbol("HTML-PRINT-JS-AUTOCOMPLETE-SETUP-INT");
        $sym73$HTML_PRINT_JS_AUTOCOMPLETE_SETUP = SubLObjectFactory.makeSymbol("HTML-PRINT-JS-AUTOCOMPLETE-SETUP");
        $str74$_filter_ = SubLObjectFactory.makeString("&filter=");
        $kw75$AUTOCOMPLETE = SubLObjectFactory.makeKeyword("AUTOCOMPLETE");
        $str76$text_javascript = SubLObjectFactory.makeString("text/javascript");
        $sym77$XML_TERM_SEARCH = SubLObjectFactory.makeSymbol("XML-TERM-SEARCH");
        $str78$searchString = SubLObjectFactory.makeString("searchString");
        $str79$caseSensitive = SubLObjectFactory.makeString("caseSensitive");
        $str80$return_attrs = SubLObjectFactory.makeString("return-attrs");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("NL"), (SubLObject)SubLObjectFactory.makeKeyword("HL-ID"));
        $str82$timeout = SubLObjectFactory.makeString("timeout");
        $str83$count = SubLObjectFactory.makeString("count");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS-FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-RESTRICTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS-RESTRICTIONS"));
        $kw85$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym86$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw87$XML_HANDLER = SubLObjectFactory.makeKeyword("XML-HANDLER");
        $sym88$XML_COMPLETE = SubLObjectFactory.makeSymbol("XML-COMPLETE");
        $kw89$COMPLETE_ON_CONSTANTS_ = SubLObjectFactory.makeKeyword("COMPLETE-ON-CONSTANTS?");
        $kw90$PREFER_HISTORY_TERMS_ = SubLObjectFactory.makeKeyword("PREFER-HISTORY-TERMS?");
        $str91$preferHistory = SubLObjectFactory.makeString("preferHistory");
        $kw92$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $kw93$CASE_SENSITIVE_ = SubLObjectFactory.makeKeyword("CASE-SENSITIVE?");
        $kw94$RETURN_ATTRS = SubLObjectFactory.makeKeyword("RETURN-ATTRS");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("NL"));
        $kw96$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
        $kw97$LIMIT = SubLObjectFactory.makeKeyword("LIMIT");
        $kw98$MT = SubLObjectFactory.makeKeyword("MT");
        $str99$mt = SubLObjectFactory.makeString("mt");
        $const100$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw101$ISA_FILTER = SubLObjectFactory.makeKeyword("ISA-FILTER");
        $kw102$GENLS_FILTER = SubLObjectFactory.makeKeyword("GENLS-FILTER");
        $kw103$ISA_RESTRICTIONS = SubLObjectFactory.makeKeyword("ISA-RESTRICTIONS");
        $kw104$GENLS_RESTRICTIONS = SubLObjectFactory.makeKeyword("GENLS-RESTRICTIONS");
        $const105$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw106$TERM_TO_REPLACE = SubLObjectFactory.makeKeyword("TERM-TO-REPLACE");
        $const107$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $sym108$GET_ISA_RESTRICTIONS_FROM_SENTENCE = SubLObjectFactory.makeSymbol("GET-ISA-RESTRICTIONS-FROM-SENTENCE");
        $const109$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym110$_GET_ISA_RESTRICTIONS_FROM_SENTENCE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-ISA-RESTRICTIONS-FROM-SENTENCE-CACHING-STATE*");
        $int111$1024 = SubLObjectFactory.makeInteger(1024);
        $sym112$CLEAR_GET_ISA_RESTRICTIONS_FROM_SENTENCE = SubLObjectFactory.makeSymbol("CLEAR-GET-ISA-RESTRICTIONS-FROM-SENTENCE");
        $sym113$GET_GENLS_RESTRICTIONS_FROM_SENTENCE = SubLObjectFactory.makeSymbol("GET-GENLS-RESTRICTIONS-FROM-SENTENCE");
        $const114$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym115$_GET_GENLS_RESTRICTIONS_FROM_SENTENCE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-GENLS-RESTRICTIONS-FROM-SENTENCE-CACHING-STATE*");
        $sym116$CLEAR_GET_GENLS_RESTRICTIONS_FROM_SENTENCE = SubLObjectFactory.makeSymbol("CLEAR-GET-GENLS-RESTRICTIONS-FROM-SENTENCE");
        $sym117$GET_ARG_CONSTRAINTS_FOR_ARG = SubLObjectFactory.makeSymbol("GET-ARG-CONSTRAINTS-FOR-ARG");
        $sym118$_GET_ARG_CONSTRAINTS_FOR_ARG_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-ARG-CONSTRAINTS-FOR-ARG-CACHING-STATE*");
        $sym119$CLEAR_GET_ARG_CONSTRAINTS_FOR_ARG = SubLObjectFactory.makeSymbol("CLEAR-GET-ARG-CONSTRAINTS-FOR-ARG");
        $sym120$GET_ARG_CONSTRAINTS_FOR_VAR = SubLObjectFactory.makeSymbol("GET-ARG-CONSTRAINTS-FOR-VAR");
        $kw121$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw122$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $sym123$_GET_ARG_CONSTRAINTS_FOR_VAR_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-ARG-CONSTRAINTS-FOR-VAR-CACHING-STATE*");
        $sym124$CLEAR_GET_ARG_CONSTRAINTS_FOR_VAR = SubLObjectFactory.makeSymbol("CLEAR-GET-ARG-CONSTRAINTS-FOR-VAR");
        $const125$CollectionIntersectionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
        $const126$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $str127$constrainingSentence = SubLObjectFactory.makeString("constrainingSentence");
        $kw128$EOF = SubLObjectFactory.makeKeyword("EOF");
        $sym129$NON_CYCL_SYMBOL_ = SubLObjectFactory.makeSymbol("NON-CYCL-SYMBOL?");
        $sym130$CONVERT_TO_KEYWORD = SubLObjectFactory.makeSymbol("CONVERT-TO-KEYWORD");
        $list131 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("COMPLETE-ON-CONSTANTS?"), SubLObjectFactory.makeKeyword("PREFER-HISTORY-TERMS?"), SubLObjectFactory.makeKeyword("LEXICON"), SubLObjectFactory.makeKeyword("CASE-SENSITIVE?"), SubLObjectFactory.makeKeyword("RETURN-ATTRS"), SubLObjectFactory.makeKeyword("TIMEOUT"), SubLObjectFactory.makeKeyword("LIMIT"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("ISA-FILTER"), SubLObjectFactory.makeKeyword("GENLS-FILTER"), SubLObjectFactory.makeKeyword("ISA-RESTRICTIONS"), SubLObjectFactory.makeKeyword("GENLS-RESTRICTIONS") });
        $sym132$COMPLETION_PROPERTIES_P = SubLObjectFactory.makeSymbol("COMPLETION-PROPERTIES-P");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"));
        $str134$__ = SubLObjectFactory.makeString("#$");
        $sym135$COMPLETION_DENOTS_OF_STRING = SubLObjectFactory.makeSymbol("COMPLETION-DENOTS-OF-STRING");
        $kw136$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $kw137$NEVER = SubLObjectFactory.makeKeyword("NEVER");
        $sym138$COMPLETION_LEXICON = SubLObjectFactory.makeSymbol("COMPLETION-LEXICON");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABBREVS"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"));
        $kw140$ON = SubLObjectFactory.makeKeyword("ON");
        $kw141$OFF = SubLObjectFactory.makeKeyword("OFF");
        $sym142$NUM_INDEX_ = SubLObjectFactory.makeSymbol("NUM-INDEX>");
        $str143$__xml_version__1_0__encoding__UTF = SubLObjectFactory.makeString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xmlns:xsi"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema-instance"), (SubLObject)SubLObjectFactory.makeString("xsi:schemaLocation"), (SubLObject)SubLObjectFactory.makeString("http://ws.opencyc.org/xsd/LightWeightResultSet http://ws.opencyc.org/xsd/LightWeightResultSet.xsd"), (SubLObject)SubLObjectFactory.makeString("xmlns:concepts"), (SubLObject)SubLObjectFactory.makeString("http://ws.opencyc.org/xsd/CycConcepts"), (SubLObject)SubLObjectFactory.makeString("xmlns"), (SubLObject)SubLObjectFactory.makeString("http://ws.opencyc.org/xsd/LightWeightResultSet"));
        $str145$ResultSet = SubLObjectFactory.makeString("ResultSet");
        $list146 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETION-STRINGS"));
        $kw147$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $str148$cycl = SubLObjectFactory.makeString("cycl");
        $kw149$NL = SubLObjectFactory.makeKeyword("NL");
        $str150$nl = SubLObjectFactory.makeString("nl");
        $kw151$DISAMBIG_STRING = SubLObjectFactory.makeKeyword("DISAMBIG-STRING");
        $str152$disambigString = SubLObjectFactory.makeString("disambigString");
        $kw153$HL_ID = SubLObjectFactory.makeKeyword("HL-ID");
        $str154$hlId = SubLObjectFactory.makeString("hlId");
        $str155$Term = SubLObjectFactory.makeString("Term");
        $sym156$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym157$TERM_PASSES_ARG_RESTRICTIONS = SubLObjectFactory.makeSymbol("TERM-PASSES-ARG-RESTRICTIONS");
        $sym158$_TERM_PASSES_ARG_RESTRICTIONS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TERM-PASSES-ARG-RESTRICTIONS-CACHING-STATE*");
        $sym159$CLEAR_TERM_PASSES_ARG_RESTRICTIONS = SubLObjectFactory.makeSymbol("CLEAR-TERM-PASSES-ARG-RESTRICTIONS");
        $str160$Autocomplete_isa_cache_lock = SubLObjectFactory.makeString("Autocomplete isa cache lock");
        $str161$Autocomplete_genls_cache_lock = SubLObjectFactory.makeString("Autocomplete genls cache lock");
        $int162$128 = SubLObjectFactory.makeInteger(128);
        $list163 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $sym164$CLEAR_AUTOCOMPLETE_GENLS_CACHE = SubLObjectFactory.makeSymbol("CLEAR-AUTOCOMPLETE-GENLS-CACHE");
        $sym165$CLEAR_AUTOCOMPLETE_ISA_CACHE = SubLObjectFactory.makeSymbol("CLEAR-AUTOCOMPLETE-ISA-CACHE");
        $const166$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $const167$PhysiologicalCondition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysiologicalCondition"));
        $sym168$FI_EVAL = SubLObjectFactory.makeSymbol("FI-EVAL");
        $sym169$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym170$PRECACHE_ISA_CONSTRAINT_GUTS = SubLObjectFactory.makeSymbol("PRECACHE-ISA-CONSTRAINT-GUTS");
        $sym171$PRECACHE_GENLS_CONSTRAINT_GUTS = SubLObjectFactory.makeSymbol("PRECACHE-GENLS-CONSTRAINT-GUTS");
        $int172$1000 = SubLObjectFactory.makeInteger(1000);
        $str173$_var_form_number____A__var_elemen = SubLObjectFactory.makeString("\nvar form_number = ~A;\nvar element_number = ~A;\nvar close_window = ~A;\n\n");
        $str174$_function_cyclify_error_message__ = SubLObjectFactory.makeString("\nfunction cyclify_error(message) {\n  document.open();\n  document.writeln('Unable to cyclify the input field.<p>');\n  document.writeln('Error: ' + message);\n  document.close();\n  return false;\n}\n\nfunction handle_cyclify(new_string) {\n  // defensive programming to prevent script errors\n  if (!window.opener) \n    return cyclify_error(1);\n  if (!window.opener.document) \n    return cyclify_error(2);\n  if (!window.opener.document.forms) \n    return cyclify_error(3);\n  if (!window.opener.document.forms.length) \n    return cyclify_error(4);\n  if (window.opener.document.forms.length < form_number) \n    return cyclify_error(5);\n  \n  if (window.opener.focus) window.opener.focus();\n\n  var form = window.opener.document.forms[form_number];\n\n  if (!form.elements) \n    return cyclify_error(6);\n  if (!form.elements.length) \n    return cyclify_error(7);\n  if (form.elements.length < element_number) \n    return cyclify_error(8);\n\n  var element = form.elements[element_number];\n\n  if (!element.value) \n    return cyclify_error(9);\n\n  element.value = new_string;\n\n  // close the window if we are supposed to\n  if (close_window)\n    self.close();\n\n  return false;\n}\n\n");
        $str175$_handle_cyclify_unescape__ = SubLObjectFactory.makeString("\nhandle_cyclify(unescape('");
        $str176$_____ = SubLObjectFactory.makeString("'));\n");
        $str177$string = SubLObjectFactory.makeString("string");
        $str178$All_valid____references_have_been = SubLObjectFactory.makeString("All valid #$ references have been added.");
        $str179$Invalid_references__ = SubLObjectFactory.makeString("Invalid references :");
        $str180$Added_references__ = SubLObjectFactory.makeString("Added references :");
        $str181$No_references_added = SubLObjectFactory.makeString("No references added");
        $sym182$CB_CYCLIFY = SubLObjectFactory.makeSymbol("CB-CYCLIFY");
        $str183$_Term_ = SubLObjectFactory.makeString("<Term ");
        $sym184$XML_COMPLETE_RESULT_COUNT_MIN = SubLObjectFactory.makeSymbol("XML-COMPLETE-RESULT-COUNT-MIN");
        $kw185$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym186$_ = SubLObjectFactory.makeSymbol(">");
        $kw187$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw188$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw189$KB = SubLObjectFactory.makeKeyword("KB");
        $kw190$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw191$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list192 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("constrainingSentence"), (SubLObject)SubLObjectFactory.makeString("(argIsa COPY_OF_cblSendMessageNamed  2  :term-to-replace)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("caseSensitive"), (SubLObject)SubLObjectFactory.makeString("nil")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("prefix"), (SubLObject)SubLObjectFactory.makeString("Progra")))), (SubLObject)html_complete.TWENTY_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("constrainingSentence"), (SubLObject)SubLObjectFactory.makeString("(genlPreds COPY_OF_cblSendMessageNamed :term-to-replace)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("caseSensitive"), (SubLObject)SubLObjectFactory.makeString("nil")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("prefix"), (SubLObject)SubLObjectFactory.makeString("Progra")))), (SubLObject)html_complete.TWENTY_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("constrainingSentence"), (SubLObject)SubLObjectFactory.makeString("(isa :term-to-replace GeographicalRegion)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("caseSensitive"), (SubLObject)SubLObjectFactory.makeString("t")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("prefix"), (SubLObject)SubLObjectFactory.makeString("Canad")))), (SubLObject)html_complete.ONE_INTEGER));
        $sym193$XML_COMPLETE_RESULT_COUNT_MAX = SubLObjectFactory.makeSymbol("XML-COMPLETE-RESULT-COUNT-MAX");
        $sym194$__ = SubLObjectFactory.makeSymbol("<=");
        $list195 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("filter"), (SubLObject)SubLObjectFactory.makeString("Thing")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("constrainingSentence"), (SubLObject)SubLObjectFactory.makeString("(argIsa COPY_OF_cblSendMessageNamed  2  :term-to-replace)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("caseSensitive"), (SubLObject)SubLObjectFactory.makeString("nil")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("prefix"), (SubLObject)SubLObjectFactory.makeString("genlI")))), (SubLObject)html_complete.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("filter"), (SubLObject)SubLObjectFactory.makeString("Thing")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("constrainingSentence"), (SubLObject)SubLObjectFactory.makeString("(genlPreds COPY_OF_cblSendMessageNamed :term-to-replace)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("caseSensitive"), (SubLObject)SubLObjectFactory.makeString("T")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("prefix"), (SubLObject)SubLObjectFactory.makeString("ProgRa")))), (SubLObject)html_complete.ZERO_INTEGER));
        $sym196$XML_COMPLETE_INT_RESULT_COUNT_MIN = SubLObjectFactory.makeSymbol("XML-COMPLETE-INT-RESULT-COUNT-MIN");
        $list197 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Canad"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("RETURN-ATTRS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("NL"), (SubLObject)SubLObjectFactory.makeKeyword("HL-ID"), (SubLObject)SubLObjectFactory.makeKeyword("DISAMBIG-STRING")), SubLObjectFactory.makeKeyword("ISA-FILTER"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeographicalRegion")), SubLObjectFactory.makeKeyword("LIMIT"), html_complete.TWENTY_INTEGER, SubLObjectFactory.makeKeyword("TIMEOUT"), html_complete.TWENTY_INTEGER, SubLObjectFactory.makeKeyword("CASE-SENSITIVE?"), html_complete.NIL, SubLObjectFactory.makeKeyword("COMPLETE-ON-CONSTANTS?"), html_complete.NIL })), (SubLObject)html_complete.ONE_INTEGER));
    }
}

/*

	Total time: 849 ms
	 synthetic 
*/