package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities;
import com.cyc.cycjava.cycl.wordnet_import.wordnet_import;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_lexical_info extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_lexical_info";
    public static final String myFingerPrint = "596f0d82210a7e378c6d0ff82c689151436651b7088b9847f486a3d7c25f9b12";
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 1191L)
    public static SubLSymbol $verbose_lexical_infoP$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 12238L)
    private static SubLSymbol $lexical_strength_to_next_string$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 12529L)
    private static SubLSymbol $lexical_strength_to_next_title$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 13086L)
    private static SubLSymbol $lexical_strength_img$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 25906L)
    public static SubLSymbol $cb_show_nl_trie_filter_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 26052L)
    public static SubLSymbol $cb_nl_trie_keylist_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 26190L)
    public static SubLSymbol $cb_nl_trie_null_entry_background_color_pair$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 30085L)
    private static SubLSymbol $cb_show_nl_trie_prefix_newline_before_list$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 30232L)
    private static SubLSymbol $cb_show_nl_trie_prefix_newline_after_list$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 43494L)
    public static SubLSymbol $lexicon_webservice_host$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 43545L)
    public static SubLSymbol $lexicon_webservice_port$;
    private static final SubLSymbol $sym0$_VERBOSE_LEXICAL_INFO__;
    private static final SubLList $list1;
    private static final SubLString $str2$Could_not_determine_a_term_from__;
    private static final SubLSymbol $sym3$CB_C_LEXICAL;
    private static final SubLSymbol $kw4$HTML_HANDLER;
    private static final SubLString $str5$Lexical_Info;
    private static final SubLSymbol $kw6$CONTENT;
    private static final SubLString $str7$cb_c_lexical__A;
    private static final SubLString $str8$___a__;
    private static final SubLString $str9$___a_;
    private static final SubLSymbol $kw10$LEXICAL;
    private static final SubLSymbol $sym11$CB_LINK_LEXICAL;
    private static final SubLSymbol $sym12$_EXIT;
    private static final SubLSymbol $sym13$CB_C_VERBOSE_LEXICAL;
    private static final SubLString $str14$cb_c_verbose_lexical__A;
    private static final SubLString $str15$_Verbose_Lexical_Info_;
    private static final SubLSymbol $kw16$VERBOSE_LEXICAL;
    private static final SubLSymbol $sym17$CB_LINK_VERBOSE_LEXICAL;
    private static final SubLString $str18$No_lexical_information_found_;
    private static final SubLSymbol $sym19$HLMT_EQUAL_;
    private static final SubLSymbol $sym20$STRING_;
    private static final SubLSymbol $sym21$STR_ASSERTION_ARG0;
    private static final SubLSymbol $sym22$STR_ASSERTION_MT;
    private static final SubLSymbol $sym23$STR_META_ASSERTION_P;
    private static final SubLString $str24$_ALexical_info_for__S;
    private static final SubLString $str25$Verbose_;
    private static final SubLString $str26$;
    private static final SubLString $str27$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str28$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw29$UNINITIALIZED;
    private static final SubLSymbol $kw30$CB_CYC;
    private static final SubLString $str31$yui_skin_sam;
    private static final SubLString $str32$reloadFrameButton;
    private static final SubLString $str33$button;
    private static final SubLString $str34$reload;
    private static final SubLString $str35$Refresh;
    private static final SubLString $str36$reloadCurrentFrame__reloadFrameBu;
    private static final SubLString $str37$Additional_lexical_links_;
    private static final SubLString $str38$To_see_documentation_on_NL_genera;
    private static final SubLSymbol $kw39$GEN_FUNCTION_DOCUMENTATION;
    private static final SubLString $str40$This_term_is_not_sufficiently_lex;
    private static final SubLString $str41$To_add_more_lexical_assertions__;
    private static final SubLSymbol $kw42$LEXIFY_TERM;
    private static final SubLString $str43$To_clear_lexical_caches_for_this_;
    private static final SubLSymbol $kw44$CLEAR_LEXICAL_CACHES;
    private static final SubLString $str45$To_see_more__;
    private static final SubLString $str46$_Clear_Lexical_Caches_;
    private static final SubLString $str47$clear_lexical_caches_for_term_wit;
    private static final SubLSymbol $sym48$CB_LINK_CLEAR_LEXICAL_CACHES;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$CLEAR_LEXICAL_CACHES_FOR_TERM_WITH_ID;
    private static final SubLString $str51$_Function_Documentation_;
    private static final SubLSymbol $kw52$MAIN;
    private static final SubLString $str53$show_generation_function_document;
    private static final SubLSymbol $sym54$CB_LINK_GEN_FUNCTION_DOCUMENTATION;
    private static final SubLString $str55$NL_Generation_Function_Documentat;
    private static final SubLList $list56;
    private static final SubLString $str57$_A;
    private static final SubLString $str58$__lang_mentioned_in_code_rang_;
    private static final SubLSymbol $kw59$RIGHT;
    private static final SubLSymbol $kw60$TOP;
    private static final SubLInteger $int61$80;
    private static final SubLString $str62$_;
    private static final SubLList $list63;
    private static final SubLSymbol $kw64$SELF;
    private static final SubLSymbol $sym65$SHOW_GENERATION_FUNCTION_DOCUMENTATION;
    private static final SubLObject $const66$NLGenerationFunction;
    private static final SubLObject $const67$isa;
    private static final SubLSymbol $kw68$BREADTH;
    private static final SubLSymbol $kw69$QUEUE;
    private static final SubLSymbol $kw70$STACK;
    private static final SubLSymbol $sym71$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw72$ERROR;
    private static final SubLString $str73$_A_is_not_a__A;
    private static final SubLSymbol $sym74$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw75$CERROR;
    private static final SubLString $str76$continue_anyway;
    private static final SubLSymbol $kw77$WARN;
    private static final SubLString $str78$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str79$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str80$attempting_to_bind_direction_link;
    private static final SubLList $list81;
    private static final SubLString $str82$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym83$TERM__;
    private static final SubLSymbol $sym84$CAR;
    private static final SubLSymbol $sym85$SPEC_;
    private static final SubLSymbol $sym86$CONSTANT_NAME;
    private static final SubLString $str87$Table_of_Contents;
    private static final SubLString $str88$Click_to_go_to_functions_denoting;
    private static final SubLString $str89$__A;
    private static final SubLSymbol $sym90$NL_PHRASE_TYPE_;
    private static final SubLSymbol $sym91$GENLS_;
    private static final SubLSymbol $kw92$NEW;
    private static final SubLList $list93;
    private static final SubLList $list94;
    private static final SubLList $list95;
    private static final SubLString $str96$javascript_setStrength__;
    private static final SubLString $str97$____;
    private static final SubLString $str98$___this__;
    private static final SubLString $str99$padding_right__5px;
    private static final SubLSymbol $kw100$CENTER;
    private static final SubLString $str101$remove;
    private static final SubLString $str102$add;
    private static final SubLString $str103$This_assertion_will_be_used_prefe;
    private static final SubLString $str104$Click_here_to_prefer_this_asserti;
    private static final SubLString $str105$javascript_setGenString__;
    private static final SubLSymbol $kw106$HTML_GENSTRING_IMG;
    private static final SubLSymbol $kw107$HTML_NOT_GENSTRING_IMG;
    private static final SubLSymbol $sym108$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const109$EverythingPSC;
    private static final SubLObject $const110$strengthOfLexicalMapping;
    private static final SubLSymbol $kw111$DEFAULT;
    private static final SubLObject $const112$ContextuallyDependentLexicalMappi;
    private static final SubLObject $const113$PrimaryLexicalMapping;
    private static final SubLObject $const114$VanishinglyRareLexicalMapping;
    private static final SubLObject $const115$genStringAssertion;
    private static final SubLString $str116$genstring_gray_20x20_png;
    private static final SubLString $str117$_Add_genStringAssertion_;
    private static final SubLString $str118$genstring_purple_20x20_png;
    private static final SubLString $str119$_Has_a_genStringAssert_;
    private static final SubLSymbol $kw120$HTML_NOT_CONTEXTUAL_LEXICAL_IMG;
    private static final SubLString $str121$graycaution_19x19_png;
    private static final SubLString $str122$_Make_Contextually_Dependent_;
    private static final SubLSymbol $kw123$HTML_CONTEXTUAL_LEXICAL_IMG;
    private static final SubLString $str124$caution_19x19_png;
    private static final SubLString $str125$_Assertion_Contextually_Dependent;
    private static final SubLSymbol $kw126$HTML_VANISHING_LEXICAL_IMG;
    private static final SubLString $str127$redcaution_19x19_png;
    private static final SubLString $str128$_Assertion_Vanishingly_Rare_;
    private static final SubLSymbol $kw129$HTML_PRIMARY_LEXICAL_IMG;
    private static final SubLString $str130$yellowstar_19x19_png;
    private static final SubLString $str131$_Primary_Lexical_Assertion_;
    private static final SubLSymbol $kw132$HTML_NOT_PRIMARY_LEXICAL_IMG;
    private static final SubLString $str133$graystar_19x19_gif;
    private static final SubLString $str134$_Make_Primary_;
    private static final SubLString $str135$Mt__;
    private static final SubLSymbol $kw136$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym137$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw138$NONE;
    private static final SubLSymbol $kw139$HTML;
    private static final SubLString $str140$generated_phrases_;
    private static final SubLString $str141$_n_a;
    private static final SubLString $str142$_S;
    private static final SubLString $str143$Lexical_Info_for_;
    private static final SubLString $str144$WordNet_Synset_;
    private static final SubLObject $const145$InferencePSC;
    private static final SubLSymbol $kw146$ALL;
    private static final SubLList $list147;
    private static final SubLString $str148$Default_generated_phrase;
    private static final SubLString $str149$n_a;
    private static final SubLString $str150$Other_generated_phrases__;
    private static final SubLString $str151$__;
    private static final SubLString $str152$_A__;
    private static final SubLString $str153$_;
    private static final SubLString $str154$_;
    private static final SubLInteger $int155$32;
    private static final SubLString $str156$___A_;
    private static final SubLString $str157$unknown_agreement;
    private static final SubLString $str158$Generated_based_on_;
    private static final SubLString $str159$This_paraphrase_is_cached_;
    private static final SubLString $str160$Default_generation_template;
    private static final SubLSymbol $sym161$ASSERTION_P;
    private static final SubLString $str162$Other_generation_templates_;
    private static final SubLSymbol $kw163$NL_TRIE_BROWSE;
    private static final SubLString $str164$NL_Trie_Browser;
    private static final SubLString $str165$NLTrie;
    private static final SubLString $str166$Browse_the_NL_Trie;
    private static final SubLString $str167$_NL_Trie_Browser_;
    private static final SubLString $str168$cb_show_nl_trie;
    private static final SubLSymbol $sym169$CB_LINK_NL_TRIE_BROWSE;
    private static final SubLSymbol $sym170$_CB_SHOW_NL_TRIE_FILTER_PREFIX_;
    private static final SubLInteger $int171$1000;
    private static final SubLSymbol $sym172$_CB_NL_TRIE_KEYLIST_CUTOFF_;
    private static final SubLString $str173$_e0eeee;
    private static final SubLString $str174$_f0ffff;
    private static final SubLSymbol $sym175$_CB_NL_TRIE_NULL_ENTRY_BACKGROUND_COLOR_PAIR_;
    private static final SubLSymbol $sym176$CB_SHOW_NL_TRIE;
    private static final SubLSymbol $kw177$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw178$SHA1;
    private static final SubLString $str179$Refresh_Frames;
    private static final SubLString $str180$No_NL_trie_loaded_;
    private static final SubLSymbol $sym181$STRING_LESSP;
    private static final SubLString $str182$Sub_Entry_Clusters;
    private static final SubLString $str183$This_section_of_the_trie_is_too_b;
    private static final SubLString $str184$_The_keys_have_been_clustered_int;
    private static final SubLString $str185$_Use_the_prefix_short_cuts_to_nav;
    private static final SubLString $str186$Prefix_Shortcuts;
    private static final SubLSymbol $kw187$PREFIX;
    private static final SubLSymbol $kw188$WIDTH;
    private static final SubLString $str189$Entries_starting_with___A_;
    private static final SubLString $str190$_see_;
    private static final SubLString $str191$all_prefix_groups;
    private static final SubLString $str192$below;
    private static final SubLString $str193$_for_all_prefix_groups_;
    private static final SubLString $str194$Groups_by_Prefixes;
    private static final SubLString $str195$0;
    private static final SubLString $str196$A;
    private static final SubLString $str197$Z;
    private static final SubLSymbol $sym198$STRING_;
    private static final SubLString $str199$_;
    private static final SubLString $str200$__;
    private static final SubLSymbol $kw201$MEMBERS;
    private static final SubLSymbol $kw202$CB_SHOW_NL_TRIE_SET_PREFIX;
    private static final SubLString $str203$_;
    private static final SubLString $str204$_A_sub_entries;
    private static final SubLString $str205$_Set_Prefix_Filter_;
    private static final SubLString $str206$cb_show_nl_trie_set_prefix__A;
    private static final SubLSymbol $kw207$PATH;
    private static final SubLSymbol $sym208$CB_LINK_CB_SHOW_NL_TRIE_SET_PREFIX;
    private static final SubLList $list209;
    private static final SubLList $list210;
    private static final SubLSymbol $kw211$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $sym212$CB_SHOW_NL_TRIE_SET_PREFIX;
    private static final SubLString $str213$Sub_Entries;
    private static final SubLSymbol $kw214$LEFT;
    private static final SubLSymbol $kw215$SHOW_NL_TRIE_SPECIFIC;
    private static final SubLString $str216$Entry_for_;
    private static final SubLString $str217$_Root_;
    private static final SubLString $str218$____;
    private static final SubLString $str219$post;
    private static final SubLString $str220$cb_show_nl_trie_starting_at_entry;
    private static final SubLString $str221$Go_to_entry_;
    private static final SubLString $str222$specification;
    private static final SubLInteger $int223$50;
    private static final SubLSymbol $kw224$RAW_PATH;
    private static final SubLSymbol $kw225$VALID_PATH;
    private static final SubLString $str226$The_entry_specification;
    private static final SubLString $str227$returned_no_NL_trie_entries__Plea;
    private static final SubLString $str228$is_ambiguous_between_the_followin;
    private static final SubLList $list229;
    private static final SubLList $list230;
    private static final SubLString $str231$_Go_;
    private static final SubLSymbol $sym232$CB_SHOW_NL_TRIE_STARTING_AT_ENTRY;
    private static final SubLString $str233$Dont_know_how_to_interpret__A_as_;
    private static final SubLSymbol $sym234$STRINGP;
    private static final SubLString $str235$_;
    private static final SubLString $str236$_sub_key_A_;
    private static final SubLString $str237$s;
    private static final SubLString $str238$background_color___;
    private static final SubLString $str239$Syntactic__;
    private static final SubLString $str240$Semantic__;
    private static final SubLSymbol $sym241$CB_SHOW_NL_TRIE_SPECIFIC;
    private static final SubLString $str242$_Show_in_NL_Trie_;
    private static final SubLString $str243$cb_show_nl_trie_specific__A;
    private static final SubLSymbol $sym244$CB_LINK_SHOW_NL_TRIE_SPECIFIC;
    private static final SubLSymbol $sym245$_LEXICON_WEBSERVICE_HOST_;
    private static final SubLInteger $int246$8080;
    private static final SubLSymbol $sym247$_LEXICON_WEBSERVICE_PORT_;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 1359L)
    public static SubLObject cb_c_lexical(final SubLObject args) {
        SubLObject fort_spec = (SubLObject)cb_lexical_info.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_lexical_info.$list1);
        fort_spec = args.first();
        final SubLObject current = args.rest();
        if (cb_lexical_info.NIL == current) {
            final SubLObject fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)cb_lexical_info.UNPROVIDED);
            if (cb_lexical_info.NIL == forts.fort_p(fort)) {
                return cb_utilities.cb_error((SubLObject)cb_lexical_info.$str2$Could_not_determine_a_term_from__, fort_spec, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
            }
            cb_c_lexical_internal(fort, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_lexical_info.$list1);
        }
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 1708L)
    public static SubLObject cb_link_lexical(final SubLObject fort, SubLObject count, SubLObject linktext, SubLObject estimateP) {
        if (count == cb_lexical_info.UNPROVIDED) {
            count = (SubLObject)cb_lexical_info.NIL;
        }
        if (linktext == cb_lexical_info.UNPROVIDED) {
            linktext = (SubLObject)cb_lexical_info.NIL;
        }
        if (estimateP == cb_lexical_info.UNPROVIDED) {
            estimateP = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexical_info.NIL == linktext) {
            linktext = (SubLObject)cb_lexical_info.$str5$Lexical_Info;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_lexical_info.$kw6$CONTENT);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str7$cb_c_lexical__A, cb_utilities.cb_fort_identifier(fort));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        if (cb_lexical_info.NIL != count) {
            if (cb_lexical_info.NIL != estimateP) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str8$___a__, count);
            }
            else {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str9$___a_, count);
            }
        }
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 2064L)
    public static SubLObject cb_c_verbose_lexical(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fort_spec = (SubLObject)cb_lexical_info.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_lexical_info.$list1);
        fort_spec = args.first();
        final SubLObject current = args.rest();
        if (cb_lexical_info.NIL == current) {
            final SubLObject fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_0 = control_vars.$generated_phrases_browsableP$.currentBinding(thread);
            try {
                control_vars.$generated_phrases_browsableP$.bind((SubLObject)cb_lexical_info.T, thread);
                if (cb_lexical_info.NIL == forts.fort_p(fort)) {
                    return cb_utilities.cb_error((SubLObject)cb_lexical_info.$str2$Could_not_determine_a_term_from__, fort_spec, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                }
                cb_c_lexical_internal(fort, (SubLObject)cb_lexical_info.T, (SubLObject)cb_lexical_info.UNPROVIDED);
            }
            finally {
                control_vars.$generated_phrases_browsableP$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_lexical_info.$list1);
        }
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 2385L)
    public static SubLObject cb_link_verbose_lexical(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_lexical_info.$kw6$CONTENT);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str14$cb_c_verbose_lexical__A, cb_utilities.cb_fort_identifier(fort));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str15$_Verbose_Lexical_Info_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 2587L)
    public static SubLObject cb_print_lexical_information(final SubLObject fort, SubLObject verboseP) {
        if (verboseP == cb_lexical_info.UNPROVIDED) {
            verboseP = (SubLObject)cb_lexical_info.NIL;
        }
        cb_c_lexical_internal_print_header(fort, verboseP);
        SubLObject lexical_assertions = cb_lexical_information(fort, verboseP, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != lexical_assertions) {
            lexical_assertions = cb_sort_lexical_information(lexical_assertions);
            cb_c_lexical_internal_print_assertions(lexical_assertions, verboseP);
        }
        else {
            html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_lexical_info.THREE_INTEGER);
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str18$No_lexical_information_found_);
            html_utilities.html_newline((SubLObject)cb_lexical_info.TWO_INTEGER);
        }
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 3341L)
    public static SubLObject cb_lexical_information(final SubLObject fort, SubLObject verboseP, SubLObject index_limit) {
        if (verboseP == cb_lexical_info.UNPROVIDED) {
            verboseP = (SubLObject)cb_lexical_info.NIL;
        }
        if (index_limit == cb_lexical_info.UNPROVIDED) {
            index_limit = (SubLObject)cb_lexical_info.NIL;
        }
        return (cb_lexical_info.NIL != lexicon_accessors.quick_lexical_wordP(fort, (SubLObject)cb_lexical_info.UNPROVIDED)) ? cb_lexical_information_for_word_unit(fort, verboseP) : cb_lexical_information_default(fort, (SubLObject)cb_lexical_info.NIL, index_limit);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 3586L)
    public static SubLObject cb_lexical_information_for_word_unit(final SubLObject wu, SubLObject verboseP) {
        if (verboseP == cb_lexical_info.UNPROVIDED) {
            verboseP = (SubLObject)cb_lexical_info.NIL;
        }
        SubLObject semtrans = (SubLObject)cb_lexical_info.NIL;
        SubLObject cdolist_list_var = lexicon_accessors.pos_of_word(wu, (SubLObject)cb_lexical_info.UNPROVIDED);
        SubLObject pos = (SubLObject)cb_lexical_info.NIL;
        pos = cdolist_list_var.first();
        while (cb_lexical_info.NIL != cdolist_list_var) {
            final SubLObject asserted_pos_semtrans = lexicon_accessors.semtrans_assertion_lookup(wu, pos, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject pos_semtrans = (SubLObject)((cb_lexical_info.NIL != asserted_pos_semtrans) ? asserted_pos_semtrans : ((cb_lexical_info.NIL != verboseP) ? lexicon_accessors.semtrans_sentence_infer(wu, pos) : cb_lexical_info.NIL));
            semtrans = ConsesLow.nconc(semtrans, pos_semtrans);
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        }
        return semtrans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 4070L)
    public static SubLObject cb_lexical_information_default(final SubLObject fort, SubLObject filter_mtsP, SubLObject index_limit) {
        if (filter_mtsP == cb_lexical_info.UNPROVIDED) {
            filter_mtsP = (SubLObject)cb_lexical_info.NIL;
        }
        if (index_limit == cb_lexical_info.UNPROVIDED) {
            index_limit = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject display_list = lexicon_utilities.lexifications_for_term(fort, (SubLObject)cb_lexical_info.T, (SubLObject)cb_lexical_info.NIL, index_limit);
        final SubLObject incompleteP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_lexical_info.NIL != filter_mtsP && cb_lexical_info.NIL != cb_viewpoint.cb_use_mts_filter()) {
            SubLObject display_list_pruned = (SubLObject)cb_lexical_info.NIL;
            final SubLObject filter_mts = (cb_lexical_info.NIL != cb_parameters.cb_mts_filter_use_genlmt()) ? genl_mts.union_all_genl_mts(cb_viewpoint.cb_mts_filter(), (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED) : cb_viewpoint.cb_mts_filter();
            SubLObject cdolist_list_var = display_list;
            SubLObject as = (SubLObject)cb_lexical_info.NIL;
            as = cdolist_list_var.first();
            while (cb_lexical_info.NIL != cdolist_list_var) {
                if (cb_lexical_info.NIL != Sequences.find(assertions_high.assertion_mt(as), filter_mts, (SubLObject)cb_lexical_info.$sym19$HLMT_EQUAL_, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                    display_list_pruned = (SubLObject)ConsesLow.cons(as, display_list_pruned);
                }
                cdolist_list_var = cdolist_list_var.rest();
                as = cdolist_list_var.first();
            }
            return Values.values(display_list_pruned, incompleteP);
        }
        return Values.values(display_list, incompleteP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 4817L)
    public static SubLObject cb_sort_lexical_information(final SubLObject lexical_info) {
        SubLObject asserted = (SubLObject)cb_lexical_info.NIL;
        SubLObject inferred = (SubLObject)cb_lexical_info.NIL;
        SubLObject cdolist_list_var = lexical_info;
        SubLObject item = (SubLObject)cb_lexical_info.NIL;
        item = cdolist_list_var.first();
        while (cb_lexical_info.NIL != cdolist_list_var) {
            if (cb_lexical_info.NIL != assertion_handles.assertion_p(item)) {
                asserted = (SubLObject)ConsesLow.cons(item, asserted);
            }
            else {
                inferred = (SubLObject)ConsesLow.cons(item, inferred);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        asserted = Sort.sort(asserted, Symbols.symbol_function((SubLObject)cb_lexical_info.$sym20$STRING_), Symbols.symbol_function((SubLObject)cb_lexical_info.$sym21$STR_ASSERTION_ARG0));
        asserted = Sort.sort(asserted, Symbols.symbol_function((SubLObject)cb_lexical_info.$sym20$STRING_), Symbols.symbol_function((SubLObject)cb_lexical_info.$sym22$STR_ASSERTION_MT));
        asserted = Sort.sort(asserted, Symbols.symbol_function((SubLObject)cb_lexical_info.$sym20$STRING_), Symbols.symbol_function((SubLObject)cb_lexical_info.$sym23$STR_META_ASSERTION_P));
        return ConsesLow.append(asserted, inferred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 5530L)
    public static SubLObject cb_c_lexical_internal(final SubLObject fort, SubLObject verboseP, SubLObject clear_cachesP) {
        if (verboseP == cb_lexical_info.UNPROVIDED) {
            verboseP = (SubLObject)cb_lexical_info.NIL;
        }
        if (clear_cachesP == cb_lexical_info.UNPROVIDED) {
            clear_cachesP = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexical_info.NIL != clear_cachesP) {
            lexicon_utilities.clear_lexical_info_caches(fort);
        }
        final SubLObject title_var;
        final SubLObject title = title_var = PrintLow.format((SubLObject)cb_lexical_info.NIL, (SubLObject)cb_lexical_info.$str24$_ALexical_info_for__S, (SubLObject)((cb_lexical_info.NIL != verboseP) ? cb_lexical_info.$str25$Verbose_ : cb_lexical_info.$str26$), fort);
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_lexical_info.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_lexical_info.$str27$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_lexical_info.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_lexical_info.$str28$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_lexical_info.$kw29$UNINITIALIZED) ? ConsesLow.list(cb_lexical_info.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_lexical_info.$kw30$CB_CYC);
                if (cb_lexical_info.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                dhtml_macros.html_basic_cb_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_lexical_info.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_lexical_info.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_lexical_info.$str31$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_lexical_info.$str32$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_lexical_info.$str33$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_lexical_info.$str34$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_lexical_info.$str35$Refresh);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_lexical_info.$str36$reloadCurrentFrame__reloadFrameBu);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            if (cb_lexical_info.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        dhtml_macros.basic_ajax_scripts();
                        dhtml_macros.dhtml_lexical_scripts();
                        cb_print_lexical_information(fort, verboseP);
                        html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
                        cb_c_lexical_internal_links(fort, verboseP);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 6069L)
    public static SubLObject cb_c_lexical_internal_links(final SubLObject fort, SubLObject verboseP) {
        if (verboseP == cb_lexical_info.UNPROVIDED) {
            verboseP = (SubLObject)cb_lexical_info.NIL;
        }
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_lexical_info.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_lexical_info.$str37$Additional_lexical_links_);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_lexical_info.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != kb_accessors.relationP(fort)) {
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str38$To_see_documentation_on_NL_genera);
            cb_utilities.cb_link((SubLObject)cb_lexical_info.$kw39$GEN_FUNCTION_DOCUMENTATION, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
        }
        if (cb_lexical_info.NIL != lexification_utilities.unlexifiedP(fort, (SubLObject)cb_lexical_info.UNPROVIDED)) {
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str40$This_term_is_not_sufficiently_lex);
        }
        else {
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str41$To_add_more_lexical_assertions__);
        }
        cb_utilities.cb_link((SubLObject)cb_lexical_info.$kw42$LEXIFY_TERM, fort, (SubLObject)cb_lexical_info.NIL, (SubLObject)cb_lexical_info.T, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_lexical_info.$str43$To_clear_lexical_caches_for_this_);
        cb_utilities.cb_link((SubLObject)cb_lexical_info.$kw44$CLEAR_LEXICAL_CACHES, fort, verboseP, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL == verboseP) {
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str45$To_see_more__);
            cb_utilities.cb_link((SubLObject)cb_lexical_info.$kw16$VERBOSE_LEXICAL, fort, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
        }
        return (SubLObject)cb_lexical_info.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 7069L)
    public static SubLObject cb_link_clear_lexical_caches(final SubLObject v_term, SubLObject verboseP, SubLObject linktext) {
        if (verboseP == cb_lexical_info.UNPROVIDED) {
            verboseP = (SubLObject)cb_lexical_info.NIL;
        }
        if (linktext == cb_lexical_info.UNPROVIDED) {
            linktext = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexical_info.NIL == linktext) {
            linktext = (SubLObject)cb_lexical_info.$str46$_Clear_Lexical_Caches_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_lexical_info.$kw6$CONTENT);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str47$clear_lexical_caches_for_term_wit, cb_utilities.cb_fort_identifier(v_term), verboseP);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 7444L)
    public static SubLObject clear_lexical_caches_for_term_with_id(final SubLObject args) {
        SubLObject fort_spec = (SubLObject)cb_lexical_info.NIL;
        SubLObject verbose = (SubLObject)cb_lexical_info.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_lexical_info.$list49);
        fort_spec = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_lexical_info.$list49);
        verbose = current.first();
        current = current.rest();
        if (cb_lexical_info.NIL == current) {
            final SubLObject fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject verboseP = reader.read_from_string(verbose, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
            if (cb_lexical_info.NIL == forts.fort_p(fort)) {
                return cb_utilities.cb_error((SubLObject)cb_lexical_info.$str2$Could_not_determine_a_term_from__, fort_spec, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
            }
            cb_c_lexical_internal(fort, verboseP, (SubLObject)cb_lexical_info.T);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_lexical_info.$list49);
        }
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 7802L)
    public static SubLObject cb_link_gen_function_documentation(SubLObject linktext) {
        if (linktext == cb_lexical_info.UNPROVIDED) {
            linktext = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!linktext.isString()) {
            linktext = (SubLObject)cb_lexical_info.$str51$_Function_Documentation_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_lexical_info.$kw52$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str53$show_generation_function_document);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 8131L)
    public static SubLObject show_generation_function_documentation(SubLObject args) {
        if (args == cb_lexical_info.UNPROVIDED) {
            args = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table_entries = generation_function_alist();
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_lexical_info.ONE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_lexical_info.$str55$NL_Generation_Function_Documentat);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_lexical_info.ONE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        generation_function_toc(table_entries);
        html_utilities.html_hr((SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
        SubLObject cdolist_list_var = table_entries;
        SubLObject cons = (SubLObject)cb_lexical_info.NIL;
        cons = cdolist_list_var.first();
        while (cb_lexical_info.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject phrase_type = (SubLObject)cb_lexical_info.NIL;
            SubLObject functions = (SubLObject)cb_lexical_info.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_lexical_info.$list56);
            phrase_type = current.first();
            current = (functions = current.rest());
            final SubLObject name = PrintLow.format((SubLObject)cb_lexical_info.NIL, (SubLObject)cb_lexical_info.$str57$_A, cb_utilities.cb_string_for_fort(phrase_type));
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            if (cb_lexical_info.NIL != name) {
                html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(name);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_lexical_info.TWO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            cb_utilities.cb_form(phrase_type, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_lexical_info.TWO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexical_info.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                SubLObject list_var = (SubLObject)cb_lexical_info.NIL;
                SubLObject function = (SubLObject)cb_lexical_info.NIL;
                SubLObject n = (SubLObject)cb_lexical_info.NIL;
                list_var = functions;
                function = list_var.first();
                for (n = (SubLObject)cb_lexical_info.ZERO_INTEGER; cb_lexical_info.NIL != list_var; list_var = list_var.rest(), function = list_var.first(), n = Numbers.add((SubLObject)cb_lexical_info.ONE_INTEGER, n)) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_lexical_info.TEN_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_lexical_info.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_lexical_info.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                            cb_utilities.cb_form(function, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                            if (cb_lexical_info.NIL != constant_completion.constant_mentioned_in_codeP(function)) {
                                html_utilities.html_markup((SubLObject)cb_lexical_info.$str58$__lang_mentioned_in_code_rang_);
                            }
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_lexical_info.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                    SubLObject cdolist_list_var_$8 = (SubLObject)cb_lexical_info.$list63;
                    SubLObject doc_pred = (SubLObject)cb_lexical_info.NIL;
                    doc_pred = cdolist_list_var_$8.first();
                    while (cb_lexical_info.NIL != cdolist_list_var_$8) {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(cb_tools.cb_paraphrase_mt());
                        final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject doc_assertions = kb_mapping.gather_gaf_arg_index(function, (SubLObject)cb_lexical_info.ONE_INTEGER, doc_pred, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                            if (cb_lexical_info.NIL != doc_assertions) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_lexical_info.TEN_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw59$RIGHT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw60$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_lexical_info.$int61$80);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        cb_utilities.cb_form(doc_pred, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                                        html_utilities.html_princ((SubLObject)cb_lexical_info.$str62$_);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    SubLObject cdolist_list_var_$9 = doc_assertions;
                                    SubLObject doc_as = (SubLObject)cb_lexical_info.NIL;
                                    doc_as = cdolist_list_var_$9.first();
                                    while (cb_lexical_info.NIL != cdolist_list_var_$9) {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                                            cb_utilities.cb_assertion_link_binary(doc_as, (SubLObject)cb_lexical_info.T);
                                            html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                                        doc_as = cdolist_list_var_$9.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_4, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$8, thread);
                        }
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        doc_pred = cdolist_list_var_$8.first();
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_lexical_info.THREE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                            html_utilities.html_hr((SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_lexical_info.THREE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        html_utilities.html_hr((SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        cb_utilities.cb_back_button((SubLObject)cb_lexical_info.$kw64$SELF, (SubLObject)cb_lexical_info.UNPROVIDED);
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 10081L)
    public static SubLObject generation_function_alist() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = dictionary.new_dictionary((SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject pph_mt = cb_tools.cb_paraphrase_mt();
        SubLObject table_entries = (SubLObject)cb_lexical_info.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject node_var = cb_lexical_info.$const66$NLGenerationFunction;
            final SubLObject _prev_bind_0_$19 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$20 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(cb_lexical_info.$const67$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$21 = node_var;
                    final SubLObject deck_type = (SubLObject)cb_lexical_info.$kw70$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$20 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var_$23 = pph_mt;
                            final SubLObject _prev_bind_0_$21 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$21 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$26 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$23), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$23), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$23), thread);
                                final SubLObject tv_var = (SubLObject)cb_lexical_info.NIL;
                                final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((cb_lexical_info.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((cb_lexical_info.NIL != tv_var) ? cb_lexical_info.$sym71$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (cb_lexical_info.NIL != tv_var && cb_lexical_info.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && cb_lexical_info.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)cb_lexical_info.$kw72$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)cb_lexical_info.ONE_INTEGER, (SubLObject)cb_lexical_info.$str73$_A_is_not_a__A, tv_var, (SubLObject)cb_lexical_info.$sym74$SBHL_TRUE_TV_P, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)cb_lexical_info.$kw75$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)cb_lexical_info.ONE_INTEGER, (SubLObject)cb_lexical_info.$str76$continue_anyway, (SubLObject)cb_lexical_info.$str73$_A_is_not_a__A, tv_var, (SubLObject)cb_lexical_info.$sym74$SBHL_TRUE_TV_P, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)cb_lexical_info.$kw77$WARN)) {
                                            Errors.warn((SubLObject)cb_lexical_info.$str73$_A_is_not_a__A, tv_var, (SubLObject)cb_lexical_info.$sym74$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)cb_lexical_info.$str78$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)cb_lexical_info.$str76$continue_anyway, (SubLObject)cb_lexical_info.$str73$_A_is_not_a__A, tv_var, (SubLObject)cb_lexical_info.$sym74$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$27 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(cb_lexical_info.$const67$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(cb_lexical_info.$const67$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(cb_lexical_info.$const67$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)cb_lexical_info.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(cb_lexical_info.$const67$isa)), thread);
                                        if (cb_lexical_info.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || cb_lexical_info.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)cb_lexical_info.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$24 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(cb_lexical_info.$const67$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)cb_lexical_info.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$21, (SubLObject)cb_lexical_info.UNPROVIDED);
                                                while (cb_lexical_info.NIL != node_var_$21) {
                                                    final SubLObject tt_node_var = node_var_$21;
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(cb_lexical_info.$const67$isa));
                                                    SubLObject module_var = (SubLObject)cb_lexical_info.NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (cb_lexical_info.NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$25 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((cb_lexical_info.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(cb_lexical_info.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (cb_lexical_info.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)cb_lexical_info.UNPROVIDED));
                                                                if (cb_lexical_info.NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(cb_lexical_info.$const67$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)cb_lexical_info.UNPROVIDED));
                                                                    if (cb_lexical_info.NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); cb_lexical_info.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (cb_lexical_info.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$38;
                                                                                    for (iteration_state_$38 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); cb_lexical_info.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$38); iteration_state_$38 = dictionary_contents.do_dictionary_contents_next(iteration_state_$38)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$38);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (cb_lexical_info.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (cb_lexical_info.NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject function;
                                                                                                    SubLObject cdolist_list_var_$40;
                                                                                                    SubLObject minimal_result_types;
                                                                                                    SubLObject min_result_type;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_lexical_info.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_lexical_info.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        function = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (cb_lexical_info.NIL != set_contents.do_set_contents_element_validP(state, function) && cb_lexical_info.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(function, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(function, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (cb_lexical_info.NIL != forts.fort_p(function)) {
                                                                                                                minimal_result_types = (cdolist_list_var_$40 = generation_function_result_isas(function, pph_mt));
                                                                                                                min_result_type = (SubLObject)cb_lexical_info.NIL;
                                                                                                                min_result_type = cdolist_list_var_$40.first();
                                                                                                                while (cb_lexical_info.NIL != cdolist_list_var_$40) {
                                                                                                                    dictionary_utilities.dictionary_push(table, min_result_type, function);
                                                                                                                    cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                                                                                                                    min_result_type = cdolist_list_var_$40.first();
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject function2 = (SubLObject)cb_lexical_info.NIL;
                                                                                                    function2 = csome_list_var.first();
                                                                                                    while (cb_lexical_info.NIL != csome_list_var) {
                                                                                                        if (cb_lexical_info.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(function2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(function2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (cb_lexical_info.NIL != forts.fort_p(function2)) {
                                                                                                                SubLObject cdolist_list_var_$41;
                                                                                                                final SubLObject minimal_result_types2 = cdolist_list_var_$41 = generation_function_result_isas(function2, pph_mt);
                                                                                                                SubLObject min_result_type2 = (SubLObject)cb_lexical_info.NIL;
                                                                                                                min_result_type2 = cdolist_list_var_$41.first();
                                                                                                                while (cb_lexical_info.NIL != cdolist_list_var_$41) {
                                                                                                                    dictionary_utilities.dictionary_push(table, min_result_type2, function2);
                                                                                                                    cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                                                                                                                    min_result_type2 = cdolist_list_var_$41.first();
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        function2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)cb_lexical_info.$str79$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$27, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$38);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$26, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)cb_lexical_info.FIVE_INTEGER, (SubLObject)cb_lexical_info.$str80$attempting_to_bind_direction_link, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                                                                }
                                                                if (cb_lexical_info.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)cb_lexical_info.UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = (SubLObject)cb_lexical_info.NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (cb_lexical_info.NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = (SubLObject)cb_lexical_info.NIL;
                                                                        SubLObject mt2 = (SubLObject)cb_lexical_info.NIL;
                                                                        SubLObject tv2 = (SubLObject)cb_lexical_info.NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_lexical_info.$list81);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_lexical_info.$list81);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_lexical_info.$list81);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (cb_lexical_info.NIL == current) {
                                                                            if (cb_lexical_info.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (cb_lexical_info.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                            if (cb_lexical_info.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject function;
                                                                                                SubLObject minimal_result_types;
                                                                                                SubLObject min_result_type;
                                                                                                SubLObject cdolist_list_var_$42;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_lexical_info.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_lexical_info.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    function = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (cb_lexical_info.NIL != set_contents.do_set_contents_element_validP(state, function) && cb_lexical_info.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(function, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(function, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (cb_lexical_info.NIL != forts.fort_p(function)) {
                                                                                                            minimal_result_types = (cdolist_list_var_$42 = generation_function_result_isas(function, pph_mt));
                                                                                                            min_result_type = (SubLObject)cb_lexical_info.NIL;
                                                                                                            min_result_type = cdolist_list_var_$42.first();
                                                                                                            while (cb_lexical_info.NIL != cdolist_list_var_$42) {
                                                                                                                dictionary_utilities.dictionary_push(table, min_result_type, function);
                                                                                                                cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                                                                                                                min_result_type = cdolist_list_var_$42.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$45 = sol;
                                                                                                SubLObject function2 = (SubLObject)cb_lexical_info.NIL;
                                                                                                function2 = csome_list_var_$45.first();
                                                                                                while (cb_lexical_info.NIL != csome_list_var_$45) {
                                                                                                    if (cb_lexical_info.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(function2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(function2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (cb_lexical_info.NIL != forts.fort_p(function2)) {
                                                                                                            SubLObject cdolist_list_var_$43;
                                                                                                            final SubLObject minimal_result_types2 = cdolist_list_var_$43 = generation_function_result_isas(function2, pph_mt);
                                                                                                            SubLObject min_result_type2 = (SubLObject)cb_lexical_info.NIL;
                                                                                                            min_result_type2 = cdolist_list_var_$43.first();
                                                                                                            while (cb_lexical_info.NIL != cdolist_list_var_$43) {
                                                                                                                dictionary_utilities.dictionary_push(table, min_result_type2, function2);
                                                                                                                cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                                                                                                                min_result_type2 = cdolist_list_var_$43.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$45 = csome_list_var_$45.rest();
                                                                                                    function2 = csome_list_var_$45.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)cb_lexical_info.$str79$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$29, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$28, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_lexical_info.$list81);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    }
                                                                }
                                                            }
                                                            else if (cb_lexical_info.NIL != obsolete.cnat_p(node, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$44;
                                                                final SubLObject new_list = cdolist_list_var_$44 = ((cb_lexical_info.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(cb_lexical_info.$const67$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)cb_lexical_info.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(cb_lexical_info.$const67$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)cb_lexical_info.UNPROVIDED)));
                                                                SubLObject generating_fn = (SubLObject)cb_lexical_info.NIL;
                                                                generating_fn = cdolist_list_var_$44.first();
                                                                while (cb_lexical_info.NIL != cdolist_list_var_$44) {
                                                                    final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                        if (cb_lexical_info.NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject function3;
                                                                            SubLObject cdolist_list_var_$45;
                                                                            SubLObject minimal_result_types3;
                                                                            SubLObject min_result_type3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)cb_lexical_info.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); cb_lexical_info.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                function3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (cb_lexical_info.NIL != set_contents.do_set_contents_element_validP(state2, function3) && cb_lexical_info.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(function3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(function3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (cb_lexical_info.NIL != forts.fort_p(function3)) {
                                                                                        minimal_result_types3 = (cdolist_list_var_$45 = generation_function_result_isas(function3, pph_mt));
                                                                                        min_result_type3 = (SubLObject)cb_lexical_info.NIL;
                                                                                        min_result_type3 = cdolist_list_var_$45.first();
                                                                                        while (cb_lexical_info.NIL != cdolist_list_var_$45) {
                                                                                            dictionary_utilities.dictionary_push(table, min_result_type3, function3);
                                                                                            cdolist_list_var_$45 = cdolist_list_var_$45.rest();
                                                                                            min_result_type3 = cdolist_list_var_$45.first();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject function4 = (SubLObject)cb_lexical_info.NIL;
                                                                            function4 = csome_list_var3.first();
                                                                            while (cb_lexical_info.NIL != csome_list_var3) {
                                                                                if (cb_lexical_info.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(function4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(function4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (cb_lexical_info.NIL != forts.fort_p(function4)) {
                                                                                        SubLObject cdolist_list_var_$46;
                                                                                        final SubLObject minimal_result_types4 = cdolist_list_var_$46 = generation_function_result_isas(function4, pph_mt);
                                                                                        SubLObject min_result_type4 = (SubLObject)cb_lexical_info.NIL;
                                                                                        min_result_type4 = cdolist_list_var_$46.first();
                                                                                        while (cb_lexical_info.NIL != cdolist_list_var_$46) {
                                                                                            dictionary_utilities.dictionary_push(table, min_result_type4, function4);
                                                                                            cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                                                                                            min_result_type4 = cdolist_list_var_$46.first();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                function4 = csome_list_var3.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)cb_lexical_info.$str79$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$30, thread);
                                                                    }
                                                                    cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                                                                    generating_fn = cdolist_list_var_$44.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$25, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$25, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    }
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(cb_lexical_info.$const67$isa)));
                                                    SubLObject module_var2 = (SubLObject)cb_lexical_info.NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (cb_lexical_info.NIL != cdolist_list_var2) {
                                                        final SubLObject _prev_bind_0_$31 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((cb_lexical_info.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(cb_lexical_info.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$21);
                                                            if (cb_lexical_info.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)cb_lexical_info.UNPROVIDED));
                                                                if (cb_lexical_info.NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)cb_lexical_info.UNPROVIDED));
                                                                    if (cb_lexical_info.NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); cb_lexical_info.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (cb_lexical_info.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$39;
                                                                                    for (iteration_state_$39 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); cb_lexical_info.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$39); iteration_state_$39 = dictionary_contents.do_dictionary_contents_next(iteration_state_$39)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$39);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (cb_lexical_info.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (cb_lexical_info.NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)cb_lexical_info.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); cb_lexical_info.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if (cb_lexical_info.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && cb_lexical_info.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)cb_lexical_info.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = (SubLObject)cb_lexical_info.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (cb_lexical_info.NIL != csome_list_var4) {
                                                                                                        if (cb_lexical_info.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)cb_lexical_info.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)cb_lexical_info.$str79$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$33, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$39);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$32, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)cb_lexical_info.FIVE_INTEGER, (SubLObject)cb_lexical_info.$str80$attempting_to_bind_direction_link, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (cb_lexical_info.NIL != obsolete.cnat_p(node2, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$47;
                                                                final SubLObject new_list2 = cdolist_list_var_$47 = ((cb_lexical_info.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)cb_lexical_info.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)cb_lexical_info.UNPROVIDED)));
                                                                SubLObject generating_fn2 = (SubLObject)cb_lexical_info.NIL;
                                                                generating_fn2 = cdolist_list_var_$47.first();
                                                                while (cb_lexical_info.NIL != cdolist_list_var_$47) {
                                                                    final SubLObject _prev_bind_0_$34 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                        if (cb_lexical_info.NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)cb_lexical_info.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); cb_lexical_info.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if (cb_lexical_info.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && cb_lexical_info.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)cb_lexical_info.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = (SubLObject)cb_lexical_info.NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (cb_lexical_info.NIL != csome_list_var5) {
                                                                                if (cb_lexical_info.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)cb_lexical_info.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)cb_lexical_info.$str79$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$34, thread);
                                                                    }
                                                                    cdolist_list_var_$47 = cdolist_list_var_$47.rest();
                                                                    generating_fn2 = cdolist_list_var_$47.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$26, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$31, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    }
                                                    node_var_$21 = deck.deck_pop(recur_deck);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$28, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$24, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$24, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)cb_lexical_info.TWO_INTEGER, (SubLObject)cb_lexical_info.$str82$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)cb_lexical_info.UNPROVIDED)), (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$27, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$23, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$23, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$22, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$22, thread);
                                }
                            }
                            finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$26, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$21, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_lexical_info.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$20, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_lexical_info.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$20, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$19, thread);
            }
            table_entries = Sort.sort(dictionary_utilities.dictionary_to_alist(table), (SubLObject)cb_lexical_info.$sym83$TERM__, Symbols.symbol_function((SubLObject)cb_lexical_info.$sym84$CAR));
            table_entries = Sort.stable_sort(table_entries, (SubLObject)cb_lexical_info.$sym85$SPEC_, Symbols.symbol_function((SubLObject)cb_lexical_info.$sym84$CAR));
            SubLObject list_var = (SubLObject)cb_lexical_info.NIL;
            SubLObject item = (SubLObject)cb_lexical_info.NIL;
            SubLObject n = (SubLObject)cb_lexical_info.NIL;
            list_var = table_entries;
            item = list_var.first();
            for (n = (SubLObject)cb_lexical_info.ZERO_INTEGER; cb_lexical_info.NIL != list_var; list_var = list_var.rest(), item = list_var.first(), n = Numbers.add((SubLObject)cb_lexical_info.ONE_INTEGER, n)) {
                ConsesLow.set_nth(n, table_entries, (SubLObject)ConsesLow.cons(item.first(), Sort.sort(item.rest(), (SubLObject)cb_lexical_info.$sym20$STRING_, (SubLObject)cb_lexical_info.$sym86$CONSTANT_NAME)));
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return table_entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 10845L)
    public static SubLObject generation_function_toc(final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_princ_strong((SubLObject)cb_lexical_info.$str87$Table_of_Contents);
        html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_lexical_info.$str88$Click_to_go_to_functions_denoting);
        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        SubLObject cdolist_list_var = alist;
        SubLObject cons = (SubLObject)cb_lexical_info.NIL;
        cons = cdolist_list_var.first();
        while (cb_lexical_info.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject phrase_type = (SubLObject)cb_lexical_info.NIL;
            SubLObject functions = (SubLObject)cb_lexical_info.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_lexical_info.$list56);
            phrase_type = current.first();
            current = (functions = current.rest());
            final SubLObject name = PrintLow.format((SubLObject)cb_lexical_info.NIL, (SubLObject)cb_lexical_info.$str89$__A, cb_utilities.cb_string_for_fort(phrase_type));
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(name);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                html_utilities.html_princ(phrase_type);
                html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 11278L)
    public static SubLObject generation_function_result_isas(final SubLObject function, SubLObject mt) {
        if (mt == cb_lexical_info.UNPROVIDED) {
            mt = cb_tools.cb_paraphrase_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result_types = kb_accessors.result_isa(function, mt);
        SubLObject ans = (SubLObject)cb_lexical_info.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            pph_vars.$pph_language_mt$.bind(mt, thread);
            ans = list_utilities.remove_if_not((SubLObject)cb_lexical_info.$sym90$NL_PHRASE_TYPE_, result_types, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
            ans = list_utilities.remove_subsumed_items(ans, (SubLObject)cb_lexical_info.$sym91$GENLS_, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 11627L)
    public static SubLObject cb_c_lexical_internal_print_assertions(final SubLObject as_list, SubLObject verboseP) {
        if (verboseP == cb_lexical_info.UNPROVIDED) {
            verboseP = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject currmt = (SubLObject)cb_lexical_info.NIL;
        SubLObject new_mtP = (SubLObject)cb_lexical_info.NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)cb_lexical_info.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$60 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$61 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$62 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$63 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    SubLObject cdolist_list_var = as_list;
                                    SubLObject as = (SubLObject)cb_lexical_info.NIL;
                                    as = cdolist_list_var.first();
                                    while (cb_lexical_info.NIL != cdolist_list_var) {
                                        if (cb_lexical_info.NIL != assertion_handles.assertion_p(as)) {
                                            new_mtP = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexical_info.NIL == hlmt.hlmt_equalP(assertions_high.assertion_mt(as), currmt));
                                            if (cb_lexical_info.NIL != new_mtP) {
                                                currmt = assertions_high.assertion_mt(as);
                                            }
                                            cb_c_lexical_internal_print_assertion(as, verboseP, new_mtP);
                                        }
                                        else {
                                            cb_utilities.cb_form(as, (SubLObject)cb_lexical_info.NIL, (SubLObject)cb_lexical_info.T);
                                            html_utilities.html_newline((SubLObject)cb_lexical_info.TWO_INTEGER);
                                            currmt = (SubLObject)cb_lexical_info.NIL;
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        as = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_lexical_info.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$63, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$62, thread);
                        }
                        if (new_or_reused == cb_lexical_info.$kw92$NEW && cb_lexical_info.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$61, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_lexical_info.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (cb_lexical_info.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$60, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_lexical_info.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 13440L)
    public static SubLObject cb_lexical_strength_links(final SubLObject v_assert) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_lexical_strength = lexical_assertion_strength(v_assert);
        final SubLObject next_strength_as_string = list_utilities.alist_lookup(cb_lexical_info.$lexical_strength_to_next_string$.getGlobalValue(), current_lexical_strength, (SubLObject)cb_lexical_info.EQL, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject url = Sequences.cconcatenate((SubLObject)cb_lexical_info.$str96$javascript_setStrength__, new SubLObject[] { format_nil.format_nil_a_no_copy(assertion_handles.assertion_id(v_assert)), cb_lexical_info.$str97$____, format_nil.format_nil_a_no_copy(next_strength_as_string), cb_lexical_info.$str98$___this__ });
        final SubLObject title = list_utilities.alist_lookup(cb_lexical_info.$lexical_strength_to_next_title$.getGlobalValue(), current_lexical_strength, (SubLObject)cb_lexical_info.EQL, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject img = list_utilities.alist_lookup(cb_lexical_info.$lexical_strength_img$.getGlobalValue(), current_lexical_strength, (SubLObject)cb_lexical_info.EQL, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_markup(url);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != title) {
            html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(title);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_anchor_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_lexical_info.$str99$padding_right__5px);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(img));
            final SubLObject align = (SubLObject)cb_lexical_info.$kw60$TOP;
            final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(img);
            final SubLObject border = (SubLObject)cb_lexical_info.ZERO_INTEGER;
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(image_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            if (cb_lexical_info.NIL != alt) {
                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(alt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            }
            if (cb_lexical_info.NIL != align) {
                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(align));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            }
            if (cb_lexical_info.NIL != border) {
                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(border);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_assert;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 14128L)
    public static SubLObject cb_genstringassertion_link(final SubLObject v_assert) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject genstringP = has_genstring_assertionP(v_assert);
        final SubLObject genstring_action = (SubLObject)((cb_lexical_info.NIL != genstringP) ? cb_lexical_info.$str101$remove : cb_lexical_info.$str102$add);
        final SubLObject genstring_title = (SubLObject)((cb_lexical_info.NIL != genstringP) ? cb_lexical_info.$str103$This_assertion_will_be_used_prefe : cb_lexical_info.$str104$Click_here_to_prefer_this_asserti);
        final SubLObject genstring_ws_url = Sequences.cconcatenate((SubLObject)cb_lexical_info.$str105$javascript_setGenString__, new SubLObject[] { format_nil.format_nil_a_no_copy(assertion_handles.assertion_id(v_assert)), cb_lexical_info.$str97$____, format_nil.format_nil_a_no_copy(genstring_action), cb_lexical_info.$str98$___this__ });
        final SubLObject genstring_img_url = (SubLObject)((cb_lexical_info.NIL != genstringP) ? cb_lexical_info.$kw106$HTML_GENSTRING_IMG : cb_lexical_info.$kw107$HTML_NOT_GENSTRING_IMG);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_markup(genstring_ws_url);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != genstring_title) {
            html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(genstring_title);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(genstring_img_url));
            final SubLObject align = (SubLObject)cb_lexical_info.$kw60$TOP;
            final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(genstring_img_url);
            final SubLObject border = (SubLObject)cb_lexical_info.ZERO_INTEGER;
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(image_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            if (cb_lexical_info.NIL != alt) {
                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(alt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            }
            if (cb_lexical_info.NIL != align) {
                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(align));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            }
            if (cb_lexical_info.NIL != border) {
                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(border);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_assert;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 14862L)
    public static SubLObject lexical_assertion_strength(final SubLObject v_assert) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_lexical_info.$sym108$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_lexical_info.$const109$EverythingPSC, thread);
            if (cb_lexical_info.NIL != kb_mapping_macros.do_term_index_key_validator(v_assert, (SubLObject)cb_lexical_info.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_assert, (SubLObject)cb_lexical_info.NIL);
                SubLObject done_var = (SubLObject)cb_lexical_info.NIL;
                final SubLObject token_var = (SubLObject)cb_lexical_info.NIL;
                while (cb_lexical_info.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (cb_lexical_info.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)cb_lexical_info.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)cb_lexical_info.NIL, (SubLObject)cb_lexical_info.NIL, (SubLObject)cb_lexical_info.NIL);
                            SubLObject done_var_$68 = (SubLObject)cb_lexical_info.NIL;
                            final SubLObject token_var_$69 = (SubLObject)cb_lexical_info.NIL;
                            while (cb_lexical_info.NIL == done_var_$68) {
                                final SubLObject meta = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$69);
                                final SubLObject valid_$70 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$69.eql(meta));
                                if (cb_lexical_info.NIL != valid_$70 && cb_lexical_info.NIL != kb_mapping_macros.do_term_index_assertion_match_p(meta, final_index_spec) && cycl_utilities.formula_arg0(meta).eql(cb_lexical_info.$const110$strengthOfLexicalMapping)) {
                                    return cycl_utilities.formula_arg2(meta, (SubLObject)cb_lexical_info.UNPROVIDED);
                                }
                                done_var_$68 = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexical_info.NIL == valid_$70);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_lexical_info.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (cb_lexical_info.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexical_info.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_lexical_info.$kw111$DEFAULT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 15143L)
    public static SubLObject contextually_dependent_lexical_assertionP(final SubLObject v_assert) {
        return Equality.eql(lexical_assertion_strength(v_assert), cb_lexical_info.$const112$ContextuallyDependentLexicalMappi);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 15302L)
    public static SubLObject primary_lexical_assertionP(final SubLObject v_assert) {
        return Equality.eql(lexical_assertion_strength(v_assert), cb_lexical_info.$const113$PrimaryLexicalMapping);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 15432L)
    public static SubLObject default_strength_lexical_assertionP(final SubLObject v_assert) {
        return Equality.eql(lexical_assertion_strength(v_assert), (SubLObject)cb_lexical_info.$kw111$DEFAULT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 15556L)
    public static SubLObject vanishingly_rare_lexical_assertionP(final SubLObject v_assert) {
        return Equality.eql(lexical_assertion_strength(v_assert), cb_lexical_info.$const114$VanishinglyRareLexicalMapping);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 15703L)
    public static SubLObject has_genstring_assertionP(final SubLObject v_assert) {
        return list_utilities.sublisp_boolean(kb_mapping.gather_gaf_arg_index(v_assert, (SubLObject)cb_lexical_info.TWO_INTEGER, cb_lexical_info.$const115$genStringAssertion, assertions_high.assertion_mt(v_assert), (SubLObject)cb_lexical_info.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 16522L)
    public static SubLObject cb_c_lexical_internal_print_assertion(final SubLObject assertion, final SubLObject verboseP, SubLObject new_mtP) {
        if (new_mtP == cb_lexical_info.UNPROVIDED) {
            new_mtP = (SubLObject)cb_lexical_info.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexical_info.NIL != new_mtP) {
            html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str135$Mt__);
            cb_utilities.cb_form(assertions_high.assertion_mt(assertion), (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
        }
        cb_utilities.cb_show_assertion_readably(assertion, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread), (SubLObject)cb_lexical_info.NIL);
        html_utilities.html_indent((SubLObject)cb_lexical_info.ONE_INTEGER);
        if (cb_lexical_info.NIL != assertion_utilities.nl_semantic_assertionP(assertion)) {
            cb_lexical_strength_links(assertion);
        }
        if (cb_lexical_info.NIL != lexicon_accessors.assertion_denotation(assertion)) {
            cb_genstringassertion_link(assertion);
        }
        html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != verboseP && cb_lexical_info.NIL != assertion_utilities.nl_semantic_assertionP(assertion)) {
            SubLObject ignore_errors_tag = (SubLObject)cb_lexical_info.NIL;
            try {
                thread.throwStack.push(cb_lexical_info.$kw136$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)cb_lexical_info.$sym137$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$72 = pph_vars.$constant_link_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                        try {
                            pph_vars.$constant_link_function$.bind((SubLObject)cb_lexical_info.$kw138$NONE, thread);
                            pph_vars.$paraphrase_mode$.bind((SubLObject)cb_lexical_info.$kw139$HTML, thread);
                            final SubLObject phrases = lexification_utilities.phrases_from_semantic_assertion(assertion, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_lexical_info.$str140$generated_phrases_);
                            if (cb_lexical_info.NIL == phrases) {
                                html_utilities.html_princ((SubLObject)cb_lexical_info.$str141$_n_a);
                            }
                            else {
                                SubLObject cdolist_list_var = phrases;
                                SubLObject phrase = (SubLObject)cb_lexical_info.NIL;
                                phrase = cdolist_list_var.first();
                                while (cb_lexical_info.NIL != cdolist_list_var) {
                                    html_utilities.html_indent((SubLObject)cb_lexical_info.UNPROVIDED);
                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str142$_S, phrase);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    phrase = cdolist_list_var.first();
                                }
                            }
                            html_utilities.html_newline((SubLObject)cb_lexical_info.TWO_INTEGER);
                        }
                        finally {
                            pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
                            pph_vars.$constant_link_function$.rebind(_prev_bind_0_$72, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)cb_lexical_info.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)cb_lexical_info.$kw136$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 20874L)
    public static SubLObject cb_c_lexical_internal_print_header(final SubLObject fort, SubLObject verboseP) {
        if (verboseP == cb_lexical_info.UNPROVIDED) {
            verboseP = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_lexical_info.FIVE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            if (cb_lexical_info.NIL != verboseP) {
                html_utilities.html_princ((SubLObject)cb_lexical_info.$str25$Verbose_);
            }
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str143$Lexical_Info_for_);
            cb_utilities.cb_form(fort, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str62$_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_lexical_info.TWO_INTEGER);
        if (cb_lexical_info.NIL != kb_control_vars.nl_kb_loaded_p() && cb_lexical_info.NIL != kb_control_vars.wordnet_import_kb_loaded_p()) {
            final SubLObject synsets = wordnet_import.wni_terms_synsets(fort);
            if (cb_lexical_info.NIL != synsets) {
                SubLObject cdolist_list_var = synsets;
                SubLObject synset = (SubLObject)cb_lexical_info.NIL;
                synset = cdolist_list_var.first();
                while (cb_lexical_info.NIL != cdolist_list_var) {
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_lexical_info.$str144$WordNet_Synset_);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    cb_wordnet_utilities.wni_html_synset_words_gloss_examples(synset, (SubLObject)cb_lexical_info.NIL, (SubLObject)cb_lexical_info.T);
                    cdolist_list_var = cdolist_list_var.rest();
                    synset = cdolist_list_var.first();
                }
            }
        }
        cb_show_default_generated_phrase(fort, verboseP);
        _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_lexical_info.$sym108$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_lexical_info.$const109$EverythingPSC, thread);
            if (cb_lexical_info.NIL != fort_types_interface.predicateP(fort) || cb_lexical_info.NIL != fort_types_interface.functionP(fort)) {
                cb_print_dummy_formula_paraphrase(fort, verboseP);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_lexical_info.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 21724L)
    public static SubLObject cb_generate_phrase(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)cb_lexical_info.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$73 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$74 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$75 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$76 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$77 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                        pph_vars.$paraphrase_mode$.bind((SubLObject)cb_lexical_info.$kw139$HTML, thread);
                                        return pph_main.generate_phrase(v_term, (SubLObject)cb_lexical_info.$kw111$DEFAULT, (SubLObject)cb_lexical_info.NIL, cb_tools.cb_paraphrase_mt(), cb_lexical_info.$const145$InferencePSC, (SubLObject)cb_lexical_info.$kw139$HTML, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    }
                                    finally {
                                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$77, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$78 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_lexical_info.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$78, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$76, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$75, thread);
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$74, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$79 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_lexical_info.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (cb_lexical_info.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$79, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$73, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 21882L)
    public static SubLObject cb_all_phrases_for_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)cb_lexical_info.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$80 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$81 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$82 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$83 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$84 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                        pph_vars.$paraphrase_mode$.bind((SubLObject)cb_lexical_info.$kw139$HTML, thread);
                                        return pph_methods_lexicon.all_phrases_for_term(v_term, (SubLObject)cb_lexical_info.$kw146$ALL, (SubLObject)cb_lexical_info.$list147, (SubLObject)cb_lexical_info.$kw139$HTML, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    }
                                    finally {
                                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$84, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_lexical_info.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$83, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$82, thread);
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$81, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$86 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_lexical_info.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (cb_lexical_info.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$80, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 22030L)
    public static SubLObject cb_show_default_generated_phrase(final SubLObject v_term, SubLObject verboseP) {
        if (verboseP == cb_lexical_info.UNPROVIDED) {
            verboseP = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
        try {
            pph_vars.$constant_link_function$.bind((SubLObject)cb_lexical_info.$kw138$NONE, thread);
            thread.resetMultipleValues();
            final SubLObject phrase = cb_generate_phrase(v_term);
            final SubLObject pred = thread.secondMultipleValue();
            final SubLObject justifications = thread.thirdMultipleValue();
            final SubLObject olist = thread.fourthMultipleValue();
            final SubLObject demerits = thread.fifthMultipleValue();
            final SubLObject v_pph_phrase = thread.sixthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject from_cacheP = conses_high.member(pph_phrase.pph_nl_generation_cache_justification(), justifications, Symbols.symbol_function((SubLObject)cb_lexical_info.EQUAL), (SubLObject)cb_lexical_info.UNPROVIDED);
            cb_print_paraphrase((SubLObject)cb_lexical_info.$str148$Default_generated_phrase, phrase, pred, v_term, verboseP, from_cacheP, (SubLObject)cb_lexical_info.NIL, v_pph_phrase);
            html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
            if (cb_lexical_info.NIL != verboseP) {
                final SubLObject all_phrases = cb_all_phrases_for_term(v_term);
                SubLObject other_phrases = Sequences.remove(phrase, all_phrases, Symbols.symbol_function((SubLObject)cb_lexical_info.EQUALP), (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                if (cb_lexical_info.NIL == other_phrases) {
                    other_phrases = (SubLObject)ConsesLow.cons((SubLObject)cb_lexical_info.$str149$n_a, other_phrases);
                }
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_lexical_info.$str150$Other_generated_phrases__);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                final SubLObject total = Sequences.length(other_phrases);
                SubLObject list_var = (SubLObject)cb_lexical_info.NIL;
                SubLObject phrase_$87 = (SubLObject)cb_lexical_info.NIL;
                SubLObject i = (SubLObject)cb_lexical_info.NIL;
                list_var = other_phrases;
                phrase_$87 = list_var.first();
                for (i = (SubLObject)cb_lexical_info.ZERO_INTEGER; cb_lexical_info.NIL != list_var; list_var = list_var.rest(), phrase_$87 = list_var.first(), i = Numbers.add((SubLObject)cb_lexical_info.ONE_INTEGER, i)) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str142$_S, phrase_$87);
                    if (!i.numGE(number_utilities.f_1_(total))) {
                        html_utilities.html_princ((SubLObject)cb_lexical_info.$str151$__);
                    }
                }
                html_utilities.html_newline((SubLObject)cb_lexical_info.TWO_INTEGER);
            }
            return Values.values(phrase, pred);
        }
        finally {
            pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 23122L)
    public static SubLObject cb_print_paraphrase(final SubLObject label, SubLObject phrase, final SubLObject pred, final SubLObject fort, final SubLObject verboseP, SubLObject from_cacheP, SubLObject supports, SubLObject v_pph_phrase) {
        if (from_cacheP == cb_lexical_info.UNPROVIDED) {
            from_cacheP = (SubLObject)cb_lexical_info.NIL;
        }
        if (supports == cb_lexical_info.UNPROVIDED) {
            supports = (SubLObject)cb_lexical_info.NIL;
        }
        if (v_pph_phrase == cb_lexical_info.UNPROVIDED) {
            v_pph_phrase = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str152$_A__, label);
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        if (cb_lexical_info.NIL != v_pph_phrase && cb_lexical_info.NIL != control_vars.$generated_phrases_browsableP$.getDynamicValue(thread)) {
            cb_utilities.cb_form(v_pph_phrase, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        else {
            phrase = string_utilities.replace_substring(phrase, (SubLObject)cb_lexical_info.$str153$_, (SubLObject)cb_lexical_info.$str154$_);
            final SubLObject long_stringP = list_utilities.lengthG(phrase, (SubLObject)cb_lexical_info.$int155$32, (SubLObject)cb_lexical_info.UNPROVIDED);
            if (cb_lexical_info.NIL != long_stringP) {
                html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_lexical_info.THREE_INTEGER);
            }
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str142$_S, phrase);
            if (cb_lexical_info.NIL != long_stringP) {
                html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_lexical_info.THREE_INTEGER);
            }
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str156$___A_, (SubLObject)((cb_lexical_info.NIL != pred) ? pred : cb_lexical_info.$str157$unknown_agreement));
        }
        if (cb_lexical_info.NIL != verboseP && cb_lexical_info.NIL != list_utilities.non_empty_list_p(supports)) {
            html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str158$Generated_based_on_);
            SubLObject cdolist_list_var = supports;
            SubLObject support = (SubLObject)cb_lexical_info.NIL;
            support = cdolist_list_var.first();
            while (cb_lexical_info.NIL != cdolist_list_var) {
                cb_utilities.cb_form(support, (SubLObject)cb_lexical_info.ONE_INTEGER, (SubLObject)cb_lexical_info.T);
                html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != from_cacheP) {
            html_utilities.html_indent((SubLObject)cb_lexical_info.THREE_INTEGER);
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str159$This_paraphrase_is_cached_);
            html_utilities.html_indent((SubLObject)cb_lexical_info.UNPROVIDED);
            cb_utilities.cb_link((SubLObject)cb_lexical_info.$kw44$CLEAR_LEXICAL_CACHES, fort, verboseP, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 24124L)
    public static SubLObject cb_print_dummy_formula_paraphrase(final SubLObject fort, final SubLObject verboseP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(fort, (SubLObject)cb_lexical_info.T);
        if (cb_lexical_info.NIL != cycl_grammar.cycl_expression_p(dummy_formula)) {
            final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
            try {
                pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)cb_lexical_info.NIL, thread);
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$88 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$89 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                            final SubLObject new_or_reused = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$90 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                            try {
                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$91 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        final SubLObject _prev_bind_0_$92 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                        final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                            pph_vars.$paraphrase_mode$.bind((SubLObject)cb_lexical_info.$kw139$HTML, thread);
                                            thread.resetMultipleValues();
                                            final SubLObject dummy_paraphrase = cb_generate_phrase(dummy_formula);
                                            final SubLObject pred = thread.secondMultipleValue();
                                            final SubLObject justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            cb_print_paraphrase((SubLObject)cb_lexical_info.$str160$Default_generation_template, dummy_paraphrase, pred, fort, verboseP, (SubLObject)cb_lexical_info.NIL, list_utilities.remove_if_not((SubLObject)cb_lexical_info.$sym161$ASSERTION_P, justification, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED), (SubLObject)cb_lexical_info.UNPROVIDED);
                                            if (cb_lexical_info.NIL != verboseP) {
                                                final SubLObject other_paraphrases = Sequences.remove(dummy_paraphrase, pph_methods_lexicon.all_phrases_for_term(dummy_formula, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED), Symbols.symbol_function((SubLObject)cb_lexical_info.EQUAL), (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                                                if (cb_lexical_info.NIL != list_utilities.non_empty_list_p(other_paraphrases)) {
                                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                    html_utilities.html_princ((SubLObject)cb_lexical_info.$str162$Other_generation_templates_);
                                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    SubLObject cdolist_list_var = other_paraphrases;
                                                    SubLObject other_paraphrase = (SubLObject)cb_lexical_info.NIL;
                                                    other_paraphrase = cdolist_list_var.first();
                                                    while (cb_lexical_info.NIL != cdolist_list_var) {
                                                        html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
                                                        html_utilities.html_indent((SubLObject)cb_lexical_info.THREE_INTEGER);
                                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str142$_S, cycl_string.cycl_string_to_utf8_string(other_paraphrase));
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        other_paraphrase = cdolist_list_var.first();
                                                    }
                                                    html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
                                                }
                                            }
                                        }
                                        finally {
                                            pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
                                            pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$92, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$93 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_lexical_info.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
                                        }
                                    }
                                }
                                finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$91, thread);
                                }
                            }
                            finally {
                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$90, thread);
                            }
                            if (new_or_reused == cb_lexical_info.$kw92$NEW && cb_lexical_info.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                            }
                        }
                        finally {
                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$89, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_lexical_info.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (cb_lexical_info.NIL == reuseP) {
                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                        }
                    }
                }
                finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$88, thread);
                }
            }
            finally {
                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 25006L)
    public static SubLObject str_assertion_mt(final SubLObject as) {
        return string_utilities.str(assertions_high.assertion_mt(as));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 25162L)
    public static SubLObject str_assertion_arg0(final SubLObject as) {
        return string_utilities.str(cycl_utilities.formula_arg0(assertions_high.assertion_formula(as)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 25346L)
    public static SubLObject str_meta_assertion_p(final SubLObject as) {
        return string_utilities.str(assertion_utilities.meta_assertion_p(as));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 25652L)
    public static SubLObject cb_link_nl_trie_browse(SubLObject linktext) {
        if (linktext == cb_lexical_info.UNPROVIDED) {
            linktext = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexical_info.NIL == linktext) {
            linktext = (SubLObject)cb_lexical_info.$str167$_NL_Trie_Browser_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_lexical_info.$kw52$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_lexical_info.$str168$cb_show_nl_trie);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return linktext;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 26397L)
    public static SubLObject cb_show_nl_trie(SubLObject args) {
        if (args == cb_lexical_info.UNPROVIDED) {
            args = (SubLObject)cb_lexical_info.NIL;
        }
        SubLObject path = (SubLObject)cb_lexical_info.NIL;
        if (cb_lexical_info.NIL != args) {
            path = kb_utilities.find_object_by_compact_hl_external_id_string(args.first());
        }
        cb_show_nl_trie_for_path(path);
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 26753L)
    public static SubLObject cb_show_nl_trie_for_path(final SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_lexical_info.$str164$NL_Trie_Browser;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_lexical_info.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_lexical_info.$str27$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_lexical_info.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_lexical_info.$str28$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_0_$95 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_lexical_info.$kw29$UNINITIALIZED) ? ConsesLow.list(cb_lexical_info.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_lexical_info.$kw30$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_lexical_info.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject _prev_bind_0_$96 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_lexical_info.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_lexical_info.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_lexical_info.$str31$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_lexical_info.$str32$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                        final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_lexical_info.$str33$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_lexical_info.$str34$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_lexical_info.$str179$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            if (cb_lexical_info.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_lexical_info.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_lexical_info.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_lexical_info.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                        }
                        thread.resetMultipleValues();
                        final SubLObject map = cb_show_nl_trie_get_subtrie_for_path(path);
                        final SubLObject valid_path = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (cb_lexical_info.NIL != map_utilities.map_p(map)) {
                            cb_show_nl_trie_implementation(valid_path, map);
                        }
                        else {
                            cb_no_nl_trie_loaded();
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$96, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$95, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 27078L)
    public static SubLObject cb_show_nl_trie_get_subtrie_for_path(final SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject map = (SubLObject)cb_lexical_info.NIL;
        SubLObject sofar = (SubLObject)cb_lexical_info.NIL;
        map = nl_trie.get_nl_trie();
        SubLObject cdolist_list_var = path;
        SubLObject path_element = (SubLObject)cb_lexical_info.NIL;
        path_element = cdolist_list_var.first();
        while (cb_lexical_info.NIL != cdolist_list_var) {
            SubLObject sub_map = (SubLObject)cb_lexical_info.NIL;
            SubLObject release = (SubLObject)cb_lexical_info.NIL;
            try {
                release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                    sub_map = map_utilities.map_get(map, path_element, (SubLObject)cb_lexical_info.UNPROVIDED);
                }
                finally {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                if (cb_lexical_info.NIL != release) {
                    Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                }
            }
            if (cb_lexical_info.NIL == map_utilities.map_p(sub_map)) {
                return Values.values(map, Sequences.nreverse(sofar));
            }
            map = sub_map;
            sofar = (SubLObject)ConsesLow.cons(path_element, sofar);
            cdolist_list_var = cdolist_list_var.rest();
            path_element = cdolist_list_var.first();
        }
        return Values.values(map, Sequences.nreverse(sofar));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 27623L)
    public static SubLObject cb_no_nl_trie_loaded() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        final SubLObject color_val = html_macros.$html_color_sat_red$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_lexical_info.NIL != color_val) {
            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_color(color_val));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str180$No_NL_trie_loaded_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 27776L)
    public static SubLObject cb_show_nl_trie_implementation(final SubLObject path, final SubLObject current) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject raw_keys = (SubLObject)cb_lexical_info.NIL;
        SubLObject release = (SubLObject)cb_lexical_info.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                raw_keys = map_utilities.map_keys(current);
            }
            finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (cb_lexical_info.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        final SubLObject keys = cb_show_nl_trie_preprocess_keys(raw_keys);
        final SubLObject sorted_key_list = Sort.sort(keys, (SubLObject)cb_lexical_info.$sym181$STRING_LESSP, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != list_utilities.lengthG(sorted_key_list, cb_lexical_info.$cb_nl_trie_keylist_cutoff$.getDynamicValue(thread), (SubLObject)cb_lexical_info.UNPROVIDED)) {
            return cb_show_nl_trie_clustered_keys(path, current, cb_show_nl_trie_cluster_keys(sorted_key_list, (SubLObject)cb_lexical_info.ONE_INTEGER));
        }
        return cb_show_nl_trie_unclustered_keys(path, current, sorted_key_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 28429L)
    public static SubLObject cb_show_nl_trie_clustered_keys(final SubLObject path, final SubLObject current, final SubLObject clusters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_show_nl_trie_render_header(path);
        cb_show_nl_trie_maybe_render_null_key(current);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_lexical_info.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_lexical_info.$str182$Sub_Entry_Clusters);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_lexical_info.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_lexical_info.$str183$This_section_of_the_trie_is_too_b);
        html_utilities.html_princ((SubLObject)cb_lexical_info.$str184$_The_keys_have_been_clustered_int);
        html_utilities.html_princ((SubLObject)cb_lexical_info.$str185$_Use_the_prefix_short_cuts_to_nav);
        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_lexical_info.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_lexical_info.$str186$Prefix_Shortcuts);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_lexical_info.FOUR_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        cb_show_nl_trie_prefix_shortcuts(clusters);
        if (cb_lexical_info.NIL != cb_lexical_info.$cb_show_nl_trie_filter_prefix$.getDynamicValue(thread)) {
            final SubLObject prefix = conses_high.getf(cb_lexical_info.$cb_show_nl_trie_filter_prefix$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$kw187$PREFIX, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject width = conses_high.getf(cb_lexical_info.$cb_show_nl_trie_filter_prefix$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$kw188$WIDTH, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject members = show_nl_trie_find_matching_cluster_members(clusters, prefix, width);
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_lexical_info.FOUR_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str189$Entries_starting_with___A_, cb_show_nl_trie_pad_key_to_width(prefix, width));
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_lexical_info.FOUR_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str190$_see_);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_hash, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexical_info.$str191$all_prefix_groups);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                html_utilities.html_princ((SubLObject)cb_lexical_info.$str192$below);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str193$_for_all_prefix_groups_);
            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
            cb_show_nl_trie_unclustered_subentries(path, current, members);
        }
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_lexical_info.$str191$all_prefix_groups);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_lexical_info.FOUR_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str194$Groups_by_Prefixes);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_lexical_info.FOUR_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        cb_show_nl_trie_render_clusters(path, current, clusters);
        return path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 30372L)
    public static SubLObject cb_show_nl_trie_prefix_shortcuts(final SubLObject clusters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        SubLObject cdolist_list_var = clusters;
        SubLObject cluster = (SubLObject)cb_lexical_info.NIL;
        cluster = cdolist_list_var.first();
        while (cb_lexical_info.NIL != cdolist_list_var) {
            final SubLObject prefix = conses_high.getf(cluster, (SubLObject)cb_lexical_info.$kw187$PREFIX, (SubLObject)cb_lexical_info.UNPROVIDED);
            if (cb_lexical_info.NIL != subl_promotions.memberP(prefix, cb_lexical_info.$cb_show_nl_trie_prefix_newline_before_list$.getGlobalValue(), (SubLObject)cb_lexical_info.$sym198$STRING_, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_hash, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(prefix);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                html_utilities.html_princ((SubLObject)cb_lexical_info.$str199$_);
                html_utilities.html_princ(prefix);
                html_utilities.html_princ((SubLObject)cb_lexical_info.$str200$__);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            if (cb_lexical_info.NIL != subl_promotions.memberP(prefix, cb_lexical_info.$cb_show_nl_trie_prefix_newline_after_list$.getGlobalValue(), (SubLObject)cb_lexical_info.$sym198$STRING_, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cluster = cdolist_list_var.first();
        }
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        return clusters;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 30937L)
    public static SubLObject show_nl_trie_find_matching_cluster_members(final SubLObject clusters, final SubLObject spec_prefix, final SubLObject spec_width) {
        SubLObject cdolist_list_var = clusters;
        SubLObject cluster = (SubLObject)cb_lexical_info.NIL;
        cluster = cdolist_list_var.first();
        while (cb_lexical_info.NIL != cdolist_list_var) {
            final SubLObject prefix = conses_high.getf(cluster, (SubLObject)cb_lexical_info.$kw187$PREFIX, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject width = conses_high.getf(cluster, (SubLObject)cb_lexical_info.$kw188$WIDTH, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject members = conses_high.getf(cluster, (SubLObject)cb_lexical_info.$kw201$MEMBERS, (SubLObject)cb_lexical_info.UNPROVIDED);
            if (spec_width.numL(width)) {
                return (SubLObject)cb_lexical_info.NIL;
            }
            if (cb_lexical_info.NIL != Strings.stringL(spec_prefix, prefix, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                return (SubLObject)cb_lexical_info.NIL;
            }
            if (spec_width.numE(width) && cb_lexical_info.NIL != Strings.stringE(spec_prefix, prefix, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                return members;
            }
            if (members.first().isCons()) {
                final SubLObject result = show_nl_trie_find_matching_cluster_members(members, spec_prefix, spec_width);
                if (cb_lexical_info.NIL != result) {
                    return result;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cluster = cdolist_list_var.first();
        }
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 31741L)
    public static SubLObject cb_show_nl_trie_render_clusters(final SubLObject path, final SubLObject current, final SubLObject clusters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_ordered_list_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            SubLObject cdolist_list_var = clusters;
            SubLObject cluster = (SubLObject)cb_lexical_info.NIL;
            cluster = cdolist_list_var.first();
            while (cb_lexical_info.NIL != cdolist_list_var) {
                final SubLObject prefix = conses_high.getf(cluster, (SubLObject)cb_lexical_info.$kw187$PREFIX, (SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject width = conses_high.getf(cluster, (SubLObject)cb_lexical_info.$kw188$WIDTH, (SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject members = conses_high.getf(cluster, (SubLObject)cb_lexical_info.$kw201$MEMBERS, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                    if (cb_lexical_info.ONE_INTEGER.numE(width)) {
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        if (cb_lexical_info.NIL != prefix) {
                            html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup(prefix);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                        final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    }
                    cb_utilities.cb_link((SubLObject)cb_lexical_info.$kw202$CB_SHOW_NL_TRIE_SET_PREFIX, path, prefix, width, Sequences.cconcatenate((SubLObject)cb_lexical_info.$str199$_, new SubLObject[] { format_nil.format_nil_a_no_copy(prefix), cb_lexical_info.$str203$_ }), (SubLObject)cb_lexical_info.UNPROVIDED);
                    if (members.first().isString()) {
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str204$_A_sub_entries, Sequences.length(members));
                    }
                    else if (members.first().isCons()) {
                        cb_show_nl_trie_render_clusters(path, current, members);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                }
                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                cluster = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_ordered_list_tail$.getGlobalValue());
        return clusters;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 32515L)
    public static SubLObject cb_link_cb_show_nl_trie_set_prefix(final SubLObject path, final SubLObject prefix, final SubLObject width, SubLObject linktext) {
        if (linktext == cb_lexical_info.UNPROVIDED) {
            linktext = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexical_info.NIL == linktext) {
            linktext = (SubLObject)cb_lexical_info.$str205$_Set_Prefix_Filter_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_lexical_info.$kw52$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str206$cb_show_nl_trie_set_prefix__A, kb_utilities.compact_hl_external_id_string((SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$kw207$PATH, path, (SubLObject)cb_lexical_info.$kw187$PREFIX, prefix, (SubLObject)cb_lexical_info.$kw188$WIDTH, width)));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return prefix;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 32885L)
    public static SubLObject cb_show_nl_trie_set_prefix(final SubLObject args) {
        final SubLObject raw_filter_prefix = args.first();
        final SubLObject filter_prefix = kb_utilities.find_object_by_compact_hl_external_id_string(raw_filter_prefix);
        final SubLObject current;
        final SubLObject datum = current = filter_prefix;
        SubLObject allow_other_keys_p = (SubLObject)cb_lexical_info.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cb_lexical_info.NIL;
        SubLObject current_$101 = (SubLObject)cb_lexical_info.NIL;
        while (cb_lexical_info.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_lexical_info.$list209);
            current_$101 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_lexical_info.$list209);
            if (cb_lexical_info.NIL == conses_high.member(current_$101, (SubLObject)cb_lexical_info.$list210, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                bad = (SubLObject)cb_lexical_info.T;
            }
            if (current_$101 == cb_lexical_info.$kw211$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cb_lexical_info.NIL != bad && cb_lexical_info.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_lexical_info.$list209);
        }
        final SubLObject path_tail = cdestructuring_bind.property_list_member((SubLObject)cb_lexical_info.$kw207$PATH, current);
        final SubLObject path = (SubLObject)((cb_lexical_info.NIL != path_tail) ? conses_high.cadr(path_tail) : cb_lexical_info.NIL);
        final SubLObject prefix_tail = cdestructuring_bind.property_list_member((SubLObject)cb_lexical_info.$kw187$PREFIX, current);
        final SubLObject prefix = (SubLObject)((cb_lexical_info.NIL != prefix_tail) ? conses_high.cadr(prefix_tail) : cb_lexical_info.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)cb_lexical_info.$kw188$WIDTH, current);
        final SubLObject width = (SubLObject)((cb_lexical_info.NIL != width_tail) ? conses_high.cadr(width_tail) : cb_lexical_info.NIL);
        cb_lexical_info.$cb_show_nl_trie_filter_prefix$.setDynamicValue(filter_prefix);
        return cb_show_nl_trie_for_path(path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 33316L)
    public static SubLObject cb_show_nl_trie_unclustered_keys(final SubLObject path, final SubLObject current, final SubLObject sorted_key_list) {
        cb_show_nl_trie_render_header(path);
        cb_show_nl_trie_maybe_render_null_key(current);
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_lexical_info.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_lexical_info.$str213$Sub_Entries);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_lexical_info.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        cb_show_nl_trie_unclustered_subentries(path, current, sorted_key_list);
        return current;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 33728L)
    public static SubLObject cb_show_nl_trie_unclustered_subentries(final SubLObject path, final SubLObject current, final SubLObject sorted_key_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject values = (SubLObject)cb_lexical_info.NIL;
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_lexical_info.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            SubLObject cdolist_list_var = sorted_key_list;
            SubLObject key = (SubLObject)cb_lexical_info.NIL;
            key = cdolist_list_var.first();
            while (cb_lexical_info.NIL != cdolist_list_var) {
                SubLObject release = (SubLObject)cb_lexical_info.NIL;
                try {
                    release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    final SubLObject _prev_bind_0_$102 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                        values = map_utilities.map_get(current, key, (SubLObject)cb_lexical_info.UNPROVIDED);
                    }
                    finally {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$102, thread);
                    }
                }
                finally {
                    if (cb_lexical_info.NIL != release) {
                        Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    }
                }
                final SubLObject terminalP = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexical_info.NIL == map_utilities.map_p(values));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw214$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw60$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        if (cb_lexical_info.NIL != terminalP) {
                            final SubLObject sub_path = values.first();
                            cb_show_nl_trie_render_path_elements(sub_path);
                        }
                        else {
                            final SubLObject sub_path = Sequences.cconcatenate(path, (SubLObject)ConsesLow.list(key));
                            cb_utilities.cb_link((SubLObject)cb_lexical_info.$kw215$SHOW_NL_TRIE_SPECIFIC, sub_path, Sequences.cconcatenate((SubLObject)cb_lexical_info.$str199$_, new SubLObject[] { format_nil.format_nil_a_no_copy(key), cb_lexical_info.$str203$_ }), (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw214$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw60$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        if (cb_lexical_info.NIL != terminalP) {
                            cb_show_nl_trie_render_terminal_values(values, (SubLObject)cb_lexical_info.UNPROVIDED);
                        }
                        else {
                            cb_show_nl_trie_render_drill_down(key, values);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 34786L)
    public static SubLObject cb_show_nl_trie_maybe_render_null_key(final SubLObject current) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject values = (SubLObject)cb_lexical_info.NIL;
        SubLObject release = (SubLObject)cb_lexical_info.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                values = map_utilities.map_get(current, strie.$strie_null_key$.getGlobalValue(), (SubLObject)cb_lexical_info.NIL);
            }
            finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (cb_lexical_info.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        if (cb_lexical_info.NIL != list_utilities.sublisp_boolean(values)) {
            final SubLObject path = values.first();
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_lexical_info.THREE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str216$Entry_for_);
            cb_show_nl_trie_render_path_elements(path);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_lexical_info.THREE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
            cb_show_nl_trie_render_terminal_values(values, cb_lexical_info.$cb_nl_trie_null_entry_background_color_pair$.getDynamicValue(thread));
            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        }
        return current;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 35363L)
    public static SubLObject cb_show_nl_trie_render_header(final SubLObject path) {
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_lexical_info.TWO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        cb_utilities.cb_link((SubLObject)cb_lexical_info.$kw163$NL_TRIE_BROWSE, (SubLObject)cb_lexical_info.$str217$_Root_, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
        SubLObject list_var = (SubLObject)cb_lexical_info.NIL;
        SubLObject item = (SubLObject)cb_lexical_info.NIL;
        SubLObject index = (SubLObject)cb_lexical_info.NIL;
        list_var = path;
        item = list_var.first();
        for (index = (SubLObject)cb_lexical_info.ZERO_INTEGER; cb_lexical_info.NIL != list_var; list_var = list_var.rest(), item = list_var.first(), index = Numbers.add((SubLObject)cb_lexical_info.ONE_INTEGER, index)) {
            html_utilities.html_princ((SubLObject)cb_lexical_info.$str218$____);
            final SubLObject path_prefix = Sequences.subseq(path, (SubLObject)cb_lexical_info.ZERO_INTEGER, Numbers.add((SubLObject)cb_lexical_info.ONE_INTEGER, index));
            cb_utilities.cb_link((SubLObject)cb_lexical_info.$kw215$SHOW_NL_TRIE_SPECIFIC, path_prefix, item, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)cb_lexical_info.TWO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        cb_show_nl_trie_get_starting_entry_specification();
        return path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 35726L)
    public static SubLObject cb_show_nl_trie_get_starting_entry_specification() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_lexical_info.NIL);
        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_lexical_info.$str219$post);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            html_macros.$within_html_form$.bind((SubLObject)cb_lexical_info.T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_utilities.html_hidden_input((SubLObject)cb_lexical_info.$str220$cb_show_nl_trie_starting_at_entry, (SubLObject)cb_lexical_info.T, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw100$CENTER));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexical_info.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw100$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw60$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_lexical_info.$str221$Go_to_entry_);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw100$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw60$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        html_utilities.html_text_input((SubLObject)cb_lexical_info.$str222$specification, (SubLObject)cb_lexical_info.$str26$, (SubLObject)cb_lexical_info.$int223$50);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw100$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw60$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        html_utilities.html_submit_input((SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 36274L)
    public static SubLObject cb_show_nl_trie_starting_at_entry(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entry = html_utilities.html_extract_string((SubLObject)cb_lexical_info.$str222$specification, args, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject raw_paths = nl_trie.nl_trie_string_tokenize_multiple(entry);
        SubLObject paths = (SubLObject)cb_lexical_info.NIL;
        SubLObject cdolist_list_var = raw_paths;
        SubLObject raw_path = (SubLObject)cb_lexical_info.NIL;
        raw_path = cdolist_list_var.first();
        while (cb_lexical_info.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject map = cb_show_nl_trie_get_subtrie_for_path(raw_path);
            final SubLObject valid_path = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (cb_lexical_info.NIL != map_utilities.map_p(map) && cb_lexical_info.NIL != valid_path) {
                paths = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$kw224$RAW_PATH, raw_path, (SubLObject)cb_lexical_info.$kw225$VALID_PATH, valid_path), paths);
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_path = cdolist_list_var.first();
        }
        if (cb_lexical_info.NIL == paths) {
            final SubLObject title_var = (SubLObject)cb_lexical_info.$str164$NL_Trie_Browser;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_lexical_info.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_lexical_info.$str27$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_lexical_info.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_lexical_info.$str28$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject _prev_bind_0_$111 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_lexical_info.$kw29$UNINITIALIZED) ? ConsesLow.list(cb_lexical_info.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_lexical_info.$kw30$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_lexical_info.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$112 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_lexical_info.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_lexical_info.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_lexical_info.$str31$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                        final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_lexical_info.$str32$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                            final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_lexical_info.$str33$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_lexical_info.$str34$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_lexical_info.$str179$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                if (cb_lexical_info.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_lexical_info.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_lexical_info.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_lexical_info.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_lexical_info.$str226$The_entry_specification);
                            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                            html_utilities.html_princ(entry);
                            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_lexical_info.$str227$returned_no_NL_trie_entries__Plea);
                            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_lexical_info.UNPROVIDED);
                            cb_show_nl_trie_get_starting_entry_specification();
                            html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$112, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$111, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            if (cb_lexical_info.NIL != list_utilities.lengthE(paths, (SubLObject)cb_lexical_info.ONE_INTEGER, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                final SubLObject path_spec = paths.first();
                final SubLObject valid_path2 = conses_high.getf(path_spec, (SubLObject)cb_lexical_info.$kw225$VALID_PATH, (SubLObject)cb_lexical_info.UNPROVIDED);
                return cb_show_nl_trie_for_path(valid_path2);
            }
            final SubLObject title_var = (SubLObject)cb_lexical_info.$str164$NL_Trie_Browser;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_lexical_info.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_lexical_info.$str27$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_lexical_info.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_lexical_info.$str28$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject _prev_bind_0_$115 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_lexical_info.$kw29$UNINITIALIZED) ? ConsesLow.list(cb_lexical_info.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_lexical_info.$kw30$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_lexical_info.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$116 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_lexical_info.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_lexical_info.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_lexical_info.$str31$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                        final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_lexical_info.$str32$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                            final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_lexical_info.$str33$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_lexical_info.$str34$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_lexical_info.$str179$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                                if (cb_lexical_info.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_lexical_info.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_lexical_info.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_lexical_info.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_lexical_info.$str226$The_entry_specification);
                            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                            html_utilities.html_princ(entry);
                            html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_lexical_info.$str228$is_ambiguous_between_the_followin);
                            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                            final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                                SubLObject cdolist_list_var2 = paths;
                                SubLObject path_spec2 = (SubLObject)cb_lexical_info.NIL;
                                path_spec2 = cdolist_list_var2.first();
                                while (cb_lexical_info.NIL != cdolist_list_var2) {
                                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                                        final SubLObject current;
                                        final SubLObject datum = current = path_spec2;
                                        SubLObject allow_other_keys_p = (SubLObject)cb_lexical_info.NIL;
                                        SubLObject rest = current;
                                        SubLObject bad = (SubLObject)cb_lexical_info.NIL;
                                        SubLObject current_$121 = (SubLObject)cb_lexical_info.NIL;
                                        while (cb_lexical_info.NIL != rest) {
                                            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_lexical_info.$list229);
                                            current_$121 = rest.first();
                                            rest = rest.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_lexical_info.$list229);
                                            if (cb_lexical_info.NIL == conses_high.member(current_$121, (SubLObject)cb_lexical_info.$list230, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                                                bad = (SubLObject)cb_lexical_info.T;
                                            }
                                            if (current_$121 == cb_lexical_info.$kw211$ALLOW_OTHER_KEYS) {
                                                allow_other_keys_p = rest.first();
                                            }
                                            rest = rest.rest();
                                        }
                                        if (cb_lexical_info.NIL != bad && cb_lexical_info.NIL == allow_other_keys_p) {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_lexical_info.$list229);
                                        }
                                        final SubLObject raw_path_tail = cdestructuring_bind.property_list_member((SubLObject)cb_lexical_info.$kw224$RAW_PATH, current);
                                        final SubLObject raw_path2 = (SubLObject)((cb_lexical_info.NIL != raw_path_tail) ? conses_high.cadr(raw_path_tail) : cb_lexical_info.NIL);
                                        final SubLObject valid_path_tail = cdestructuring_bind.property_list_member((SubLObject)cb_lexical_info.$kw225$VALID_PATH, current);
                                        final SubLObject valid_path3 = (SubLObject)((cb_lexical_info.NIL != valid_path_tail) ? conses_high.cadr(valid_path_tail) : cb_lexical_info.NIL);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        cb_show_nl_trie_render_path_elements(valid_path3);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        final SubLObject delta_wrt_raw = Numbers.subtract(Sequences.length(raw_path2), Sequences.length(valid_path3));
                                        final SubLObject path_delta = conses_high.last(raw_path2, delta_wrt_raw);
                                        cb_show_nl_trie_render_path_elements(path_delta);
                                        html_utilities.html_indent((SubLObject)cb_lexical_info.UNPROVIDED);
                                        cb_utilities.cb_link((SubLObject)cb_lexical_info.$kw215$SHOW_NL_TRIE_SPECIFIC, valid_path3, (SubLObject)cb_lexical_info.$str231$_Go_, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    path_spec2 = cdolist_list_var2.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$116, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$115, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 38455L)
    public static SubLObject cb_show_nl_trie_render_path_elements(final SubLObject path) {
        SubLObject cdolist_list_var = path;
        SubLObject path_element = (SubLObject)cb_lexical_info.NIL;
        path_element = cdolist_list_var.first();
        while (cb_lexical_info.NIL != cdolist_list_var) {
            html_utilities.html_princ((SubLObject)Characters.CHAR_quotation);
            html_utilities.html_princ(path_element);
            html_utilities.html_princ((SubLObject)Characters.CHAR_quotation);
            html_utilities.html_indent((SubLObject)cb_lexical_info.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            path_element = cdolist_list_var.first();
        }
        return path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 38641L)
    public static SubLObject cb_show_nl_trie_cluster_keys(final SubLObject sorted_key_list, SubLObject width) {
        if (width == cb_lexical_info.UNPROVIDED) {
            width = (SubLObject)cb_lexical_info.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject prev_key = sorted_key_list.first();
        final SubLObject key_list = sorted_key_list.rest();
        SubLObject cluster = (SubLObject)ConsesLow.list(prev_key);
        SubLObject clusters = (SubLObject)cb_lexical_info.NIL;
        SubLObject cdolist_list_var = key_list;
        SubLObject key = (SubLObject)cb_lexical_info.NIL;
        key = cdolist_list_var.first();
        while (cb_lexical_info.NIL != cdolist_list_var) {
            if (cb_lexical_info.NIL != cb_show_nl_trie_keys_share_prefix_of_widthP(prev_key, key, width)) {
                cluster = (SubLObject)ConsesLow.cons(key, cluster);
            }
            else {
                if (cb_lexical_info.NIL != cluster) {
                    cluster = Sequences.nreverse(cluster);
                    if (cb_lexical_info.NIL != list_utilities.lengthG(cluster, cb_lexical_info.$cb_nl_trie_keylist_cutoff$.getDynamicValue(thread), (SubLObject)cb_lexical_info.UNPROVIDED)) {
                        cluster = cb_show_nl_trie_cluster_keys(cluster, Numbers.add(width, (SubLObject)cb_lexical_info.ONE_INTEGER));
                    }
                    final SubLObject leader = cb_show_nl_trie_first_key_from_cluster(cluster);
                    final SubLObject size = Numbers.min(Sequences.length(leader), width);
                    final SubLObject prefix = Strings.string_upcase(string_utilities.substring(leader, (SubLObject)cb_lexical_info.ZERO_INTEGER, size), (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
                    clusters = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$kw187$PREFIX, prefix, (SubLObject)cb_lexical_info.$kw188$WIDTH, width, (SubLObject)cb_lexical_info.$kw201$MEMBERS, cluster), clusters);
                }
                cluster = (SubLObject)ConsesLow.list(key);
            }
            prev_key = key;
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return Sequences.nreverse(clusters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 39670L)
    public static SubLObject cb_show_nl_trie_first_key_from_cluster(final SubLObject cluster) {
        final SubLObject leader = cluster.first();
        if (leader.isString()) {
            return leader;
        }
        if (cb_lexical_info.$kw187$PREFIX == leader) {
            return cb_show_nl_trie_first_key_from_cluster(conses_high.getf(cluster, (SubLObject)cb_lexical_info.$kw201$MEMBERS, (SubLObject)cb_lexical_info.UNPROVIDED));
        }
        if (leader.isCons()) {
            return cb_show_nl_trie_first_key_from_cluster(cluster.first());
        }
        Errors.error((SubLObject)cb_lexical_info.$str233$Dont_know_how_to_interpret__A_as_, cluster);
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 40099L)
    public static SubLObject cb_show_nl_trie_keys_share_prefix_of_widthP(final SubLObject prev_key, final SubLObject key, final SubLObject width) {
        final SubLObject previous = cb_show_nl_trie_pad_key_to_width(prev_key, width);
        final SubLObject current = cb_show_nl_trie_pad_key_to_width(key, width);
        return Strings.string_equal(previous, current, (SubLObject)cb_lexical_info.ZERO_INTEGER, width, (SubLObject)cb_lexical_info.ZERO_INTEGER, width);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 40382L)
    public static SubLObject cb_show_nl_trie_pad_key_to_width(final SubLObject key, final SubLObject width) {
        final SubLObject missing = Numbers.subtract(Sequences.length(key), width);
        if (missing.isNegative()) {
            final SubLObject padded = Strings.make_string(width, (SubLObject)Characters.CHAR_space);
            SubLObject index = (SubLObject)cb_lexical_info.ZERO_INTEGER;
            SubLObject end_var_$122;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var = (end_var_$122 = Sequences.length(key)), char_num = (SubLObject)cb_lexical_info.NIL, char_num = (SubLObject)cb_lexical_info.ZERO_INTEGER; !char_num.numGE(end_var_$122); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(key, char_num);
                Strings.set_char(padded, index, v_char);
                index = Numbers.add(index, (SubLObject)cb_lexical_info.ONE_INTEGER);
            }
            return padded;
        }
        return key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 40721L)
    public static SubLObject cb_show_nl_trie_preprocess_keys(final SubLObject key_list) {
        return list_utilities.delete_if_not((SubLObject)cb_lexical_info.$sym234$STRINGP, key_list, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 40825L)
    public static SubLObject cb_show_nl_trie_render_drill_down(final SubLObject key, final SubLObject values) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject size = (SubLObject)cb_lexical_info.MINUS_ONE_INTEGER;
        SubLObject release = (SubLObject)cb_lexical_info.NIL;
        try {
            release = Locks.seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                size = map_utilities.map_size(values);
            }
            finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (cb_lexical_info.NIL != release) {
                Locks.release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_lexical_info.$str235$_);
        html_utilities.html_princ(size);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str236$_sub_key_A_, (SubLObject)(cb_lexical_info.ONE_INTEGER.numE(size) ? cb_lexical_info.$str26$ : cb_lexical_info.$str237$s));
        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        return key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 41171L)
    public static SubLObject cb_show_nl_trie_render_terminal_values(final SubLObject values, SubLObject color_pair) {
        if (color_pair == cb_lexical_info.UNPROVIDED) {
            color_pair = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data = values.rest();
        final SubLObject curr_color = color_pair.first();
        SubLObject curr_style = (SubLObject)(curr_color.isString() ? Sequences.cconcatenate((SubLObject)cb_lexical_info.$str238$background_color___, format_nil.format_nil_a_no_copy(curr_color)) : cb_lexical_info.$str26$);
        final SubLObject next_color = conses_high.second(color_pair);
        SubLObject next_style = (SubLObject)(next_color.isString() ? Sequences.cconcatenate((SubLObject)cb_lexical_info.$str238$background_color___, format_nil.format_nil_a_no_copy(next_color)) : cb_lexical_info.$str26$);
        SubLObject list_var = (SubLObject)cb_lexical_info.NIL;
        SubLObject datum = (SubLObject)cb_lexical_info.NIL;
        SubLObject count = (SubLObject)cb_lexical_info.NIL;
        list_var = data;
        datum = list_var.first();
        for (count = (SubLObject)cb_lexical_info.ZERO_INTEGER; cb_lexical_info.NIL != list_var; list_var = list_var.rest(), datum = list_var.first(), count = Numbers.add((SubLObject)cb_lexical_info.ONE_INTEGER, count)) {
            if (count.isPositive()) {
                html_utilities.html_hr((SubLObject)cb_lexical_info.UNPROVIDED, (SubLObject)cb_lexical_info.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(curr_style);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                if (cb_lexical_info.NIL != nl_trie.nl_trie_word_p(datum, (SubLObject)cb_lexical_info.UNPROVIDED)) {
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_lexical_info.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        final SubLObject syntactic_set = nl_trie.nl_trie_word_syntactic_support_set(datum);
                        final SubLObject semantic_set = nl_trie.nl_trie_word_semantic_support_set(datum);
                        cb_show_nl_trie_word_support_set(syntactic_set, (SubLObject)cb_lexical_info.$str239$Syntactic__);
                        cb_show_nl_trie_word_support_set(semantic_set, (SubLObject)cb_lexical_info.$str240$Semantic__);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                else {
                    cb_form_with_assertion_bias(datum);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            final SubLObject swap_var = curr_style;
            curr_style = next_style;
            next_style = swap_var;
        }
        return values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 42202L)
    public static SubLObject cb_show_nl_trie_word_support_set(final SubLObject v_set, final SubLObject set_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexical_info.NIL != set.set_p(v_set) && cb_lexical_info.NIL == set.empty_set_p(v_set)) {
            SubLObject supports = set.set_element_list(v_set);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw214$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw60$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    html_utilities.html_princ(set_type);
                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw214$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw60$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                    cb_form_with_assertion_bias(supports.first());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
            SubLObject cdolist_list_var;
            supports = (cdolist_list_var = supports.rest());
            SubLObject support = (SubLObject)cb_lexical_info.NIL;
            support = cdolist_list_var.first();
            while (cb_lexical_info.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw214$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexical_info.$kw60$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
                    final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
                        cb_form_with_assertion_bias(support);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexical_info.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 42894L)
    public static SubLObject cb_form_with_assertion_bias(final SubLObject datum) {
        if (cb_lexical_info.NIL != assertion_handles.assertion_p(datum)) {
            cb_utilities.cb_show_assertion_readably(datum, (SubLObject)cb_lexical_info.T, (SubLObject)cb_lexical_info.T);
        }
        else {
            cb_utilities.cb_form(datum, (SubLObject)cb_lexical_info.ZERO_INTEGER, (SubLObject)cb_lexical_info.T);
        }
        return datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 43074L)
    public static SubLObject cb_show_nl_trie_specific(final SubLObject args) {
        cb_lexical_info.$cb_show_nl_trie_filter_prefix$.setDynamicValue((SubLObject)cb_lexical_info.NIL);
        return cb_show_nl_trie(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexical-info.lisp", position = 43207L)
    public static SubLObject cb_link_show_nl_trie_specific(final SubLObject path, SubLObject linktext) {
        if (linktext == cb_lexical_info.UNPROVIDED) {
            linktext = (SubLObject)cb_lexical_info.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexical_info.NIL == linktext) {
            linktext = (SubLObject)cb_lexical_info.$str242$_Show_in_NL_Trie_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_lexical_info.$kw52$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexical_info.$str243$cb_show_nl_trie_specific__A, kb_utilities.compact_hl_external_id_string(path));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        if (cb_lexical_info.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexical_info.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexical_info.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexical_info.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return path;
    }
    
    public static SubLObject declare_cb_lexical_info_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_c_lexical", "CB-C-LEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_link_lexical", "CB-LINK-LEXICAL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_c_verbose_lexical", "CB-C-VERBOSE-LEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_link_verbose_lexical", "CB-LINK-VERBOSE-LEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_print_lexical_information", "CB-PRINT-LEXICAL-INFORMATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_lexical_information", "CB-LEXICAL-INFORMATION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_lexical_information_for_word_unit", "CB-LEXICAL-INFORMATION-FOR-WORD-UNIT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_lexical_information_default", "CB-LEXICAL-INFORMATION-DEFAULT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_sort_lexical_information", "CB-SORT-LEXICAL-INFORMATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_c_lexical_internal", "CB-C-LEXICAL-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_c_lexical_internal_links", "CB-C-LEXICAL-INTERNAL-LINKS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_link_clear_lexical_caches", "CB-LINK-CLEAR-LEXICAL-CACHES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "clear_lexical_caches_for_term_with_id", "CLEAR-LEXICAL-CACHES-FOR-TERM-WITH-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_link_gen_function_documentation", "CB-LINK-GEN-FUNCTION-DOCUMENTATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "show_generation_function_documentation", "SHOW-GENERATION-FUNCTION-DOCUMENTATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "generation_function_alist", "GENERATION-FUNCTION-ALIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "generation_function_toc", "GENERATION-FUNCTION-TOC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "generation_function_result_isas", "GENERATION-FUNCTION-RESULT-ISAS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_c_lexical_internal_print_assertions", "CB-C-LEXICAL-INTERNAL-PRINT-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_lexical_strength_links", "CB-LEXICAL-STRENGTH-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_genstringassertion_link", "CB-GENSTRINGASSERTION-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "lexical_assertion_strength", "LEXICAL-ASSERTION-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "contextually_dependent_lexical_assertionP", "CONTEXTUALLY-DEPENDENT-LEXICAL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "primary_lexical_assertionP", "PRIMARY-LEXICAL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "default_strength_lexical_assertionP", "DEFAULT-STRENGTH-LEXICAL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "vanishingly_rare_lexical_assertionP", "VANISHINGLY-RARE-LEXICAL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "has_genstring_assertionP", "HAS-GENSTRING-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_c_lexical_internal_print_assertion", "CB-C-LEXICAL-INTERNAL-PRINT-ASSERTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_c_lexical_internal_print_header", "CB-C-LEXICAL-INTERNAL-PRINT-HEADER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_generate_phrase", "CB-GENERATE-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_all_phrases_for_term", "CB-ALL-PHRASES-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_default_generated_phrase", "CB-SHOW-DEFAULT-GENERATED-PHRASE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_print_paraphrase", "CB-PRINT-PARAPHRASE", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_print_dummy_formula_paraphrase", "CB-PRINT-DUMMY-FORMULA-PARAPHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "str_assertion_mt", "STR-ASSERTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "str_assertion_arg0", "STR-ASSERTION-ARG0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "str_meta_assertion_p", "STR-META-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_link_nl_trie_browse", "CB-LINK-NL-TRIE-BROWSE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie", "CB-SHOW-NL-TRIE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_for_path", "CB-SHOW-NL-TRIE-FOR-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_get_subtrie_for_path", "CB-SHOW-NL-TRIE-GET-SUBTRIE-FOR-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_no_nl_trie_loaded", "CB-NO-NL-TRIE-LOADED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_implementation", "CB-SHOW-NL-TRIE-IMPLEMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_clustered_keys", "CB-SHOW-NL-TRIE-CLUSTERED-KEYS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_prefix_shortcuts", "CB-SHOW-NL-TRIE-PREFIX-SHORTCUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "show_nl_trie_find_matching_cluster_members", "SHOW-NL-TRIE-FIND-MATCHING-CLUSTER-MEMBERS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_render_clusters", "CB-SHOW-NL-TRIE-RENDER-CLUSTERS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_link_cb_show_nl_trie_set_prefix", "CB-LINK-CB-SHOW-NL-TRIE-SET-PREFIX", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_set_prefix", "CB-SHOW-NL-TRIE-SET-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_unclustered_keys", "CB-SHOW-NL-TRIE-UNCLUSTERED-KEYS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_unclustered_subentries", "CB-SHOW-NL-TRIE-UNCLUSTERED-SUBENTRIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_maybe_render_null_key", "CB-SHOW-NL-TRIE-MAYBE-RENDER-NULL-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_render_header", "CB-SHOW-NL-TRIE-RENDER-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_get_starting_entry_specification", "CB-SHOW-NL-TRIE-GET-STARTING-ENTRY-SPECIFICATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_starting_at_entry", "CB-SHOW-NL-TRIE-STARTING-AT-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_render_path_elements", "CB-SHOW-NL-TRIE-RENDER-PATH-ELEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_cluster_keys", "CB-SHOW-NL-TRIE-CLUSTER-KEYS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_first_key_from_cluster", "CB-SHOW-NL-TRIE-FIRST-KEY-FROM-CLUSTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_keys_share_prefix_of_widthP", "CB-SHOW-NL-TRIE-KEYS-SHARE-PREFIX-OF-WIDTH?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_pad_key_to_width", "CB-SHOW-NL-TRIE-PAD-KEY-TO-WIDTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_preprocess_keys", "CB-SHOW-NL-TRIE-PREPROCESS-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_render_drill_down", "CB-SHOW-NL-TRIE-RENDER-DRILL-DOWN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_render_terminal_values", "CB-SHOW-NL-TRIE-RENDER-TERMINAL-VALUES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_word_support_set", "CB-SHOW-NL-TRIE-WORD-SUPPORT-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_form_with_assertion_bias", "CB-FORM-WITH-ASSERTION-BIAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_show_nl_trie_specific", "CB-SHOW-NL-TRIE-SPECIFIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexical_info", "cb_link_show_nl_trie_specific", "CB-LINK-SHOW-NL-TRIE-SPECIFIC", 1, 1, false);
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    public static SubLObject init_cb_lexical_info_file() {
        cb_lexical_info.$verbose_lexical_infoP$ = SubLFiles.defvar("*VERBOSE-LEXICAL-INFO?*", (SubLObject)cb_lexical_info.NIL);
        cb_lexical_info.$lexical_strength_to_next_string$ = SubLFiles.deflexical("*LEXICAL-STRENGTH-TO-NEXT-STRING*", (SubLObject)cb_lexical_info.$list93);
        cb_lexical_info.$lexical_strength_to_next_title$ = SubLFiles.deflexical("*LEXICAL-STRENGTH-TO-NEXT-TITLE*", (SubLObject)cb_lexical_info.$list94);
        cb_lexical_info.$lexical_strength_img$ = SubLFiles.deflexical("*LEXICAL-STRENGTH-IMG*", (SubLObject)cb_lexical_info.$list95);
        cb_lexical_info.$cb_show_nl_trie_filter_prefix$ = SubLFiles.defparameter("*CB-SHOW-NL-TRIE-FILTER-PREFIX*", (SubLObject)cb_lexical_info.NIL);
        cb_lexical_info.$cb_nl_trie_keylist_cutoff$ = SubLFiles.defparameter("*CB-NL-TRIE-KEYLIST-CUTOFF*", (SubLObject)cb_lexical_info.$int171$1000);
        cb_lexical_info.$cb_nl_trie_null_entry_background_color_pair$ = SubLFiles.defparameter("*CB-NL-TRIE-NULL-ENTRY-BACKGROUND-COLOR-PAIR*", (SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$str173$_e0eeee, (SubLObject)cb_lexical_info.$str174$_f0ffff));
        cb_lexical_info.$cb_show_nl_trie_prefix_newline_before_list$ = SubLFiles.deflexical("*CB-SHOW-NL-TRIE-PREFIX-NEWLINE-BEFORE-LIST*", (SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$str195$0, (SubLObject)cb_lexical_info.$str196$A));
        cb_lexical_info.$cb_show_nl_trie_prefix_newline_after_list$ = SubLFiles.deflexical("*CB-SHOW-NL-TRIE-PREFIX-NEWLINE-AFTER-LIST*", (SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$str197$Z));
        cb_lexical_info.$lexicon_webservice_host$ = SubLFiles.defparameter("*LEXICON-WEBSERVICE-HOST*", (SubLObject)cb_lexical_info.$str26$);
        cb_lexical_info.$lexicon_webservice_port$ = SubLFiles.defparameter("*LEXICON-WEBSERVICE-PORT*", (SubLObject)cb_lexical_info.$int246$8080);
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    public static SubLObject setup_cb_lexical_info_file() {
        utilities_macros.register_html_state_variable((SubLObject)cb_lexical_info.$sym0$_VERBOSE_LEXICAL_INFO__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_lexical_info.$sym0$_VERBOSE_LEXICAL_INFO__);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexical_info.$sym3$CB_C_LEXICAL, (SubLObject)cb_lexical_info.$kw4$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_lexical_info.$kw10$LEXICAL, (SubLObject)cb_lexical_info.$sym11$CB_LINK_LEXICAL, (SubLObject)cb_lexical_info.FOUR_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexical_info.$sym13$CB_C_VERBOSE_LEXICAL, (SubLObject)cb_lexical_info.$kw4$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_lexical_info.$kw16$VERBOSE_LEXICAL, (SubLObject)cb_lexical_info.$sym17$CB_LINK_VERBOSE_LEXICAL, (SubLObject)cb_lexical_info.ONE_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_lexical_info.$kw44$CLEAR_LEXICAL_CACHES, (SubLObject)cb_lexical_info.$sym48$CB_LINK_CLEAR_LEXICAL_CACHES, (SubLObject)cb_lexical_info.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexical_info.$sym50$CLEAR_LEXICAL_CACHES_FOR_TERM_WITH_ID, (SubLObject)cb_lexical_info.$kw4$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_lexical_info.$kw39$GEN_FUNCTION_DOCUMENTATION, (SubLObject)cb_lexical_info.$sym54$CB_LINK_GEN_FUNCTION_DOCUMENTATION, (SubLObject)cb_lexical_info.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexical_info.$sym65$SHOW_GENERATION_FUNCTION_DOCUMENTATION, (SubLObject)cb_lexical_info.$kw4$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_lexical_info.$kw107$HTML_NOT_GENSTRING_IMG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$str116$genstring_gray_20x20_png, (SubLObject)cb_lexical_info.$str117$_Add_genStringAssertion_));
        Hashtables.sethash((SubLObject)cb_lexical_info.$kw106$HTML_GENSTRING_IMG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$str118$genstring_purple_20x20_png, (SubLObject)cb_lexical_info.$str119$_Has_a_genStringAssert_));
        Hashtables.sethash((SubLObject)cb_lexical_info.$kw120$HTML_NOT_CONTEXTUAL_LEXICAL_IMG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$str121$graycaution_19x19_png, (SubLObject)cb_lexical_info.$str122$_Make_Contextually_Dependent_));
        Hashtables.sethash((SubLObject)cb_lexical_info.$kw123$HTML_CONTEXTUAL_LEXICAL_IMG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$str124$caution_19x19_png, (SubLObject)cb_lexical_info.$str125$_Assertion_Contextually_Dependent));
        Hashtables.sethash((SubLObject)cb_lexical_info.$kw126$HTML_VANISHING_LEXICAL_IMG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$str127$redcaution_19x19_png, (SubLObject)cb_lexical_info.$str128$_Assertion_Vanishingly_Rare_));
        Hashtables.sethash((SubLObject)cb_lexical_info.$kw129$HTML_PRIMARY_LEXICAL_IMG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$str130$yellowstar_19x19_png, (SubLObject)cb_lexical_info.$str131$_Primary_Lexical_Assertion_));
        Hashtables.sethash((SubLObject)cb_lexical_info.$kw132$HTML_NOT_PRIMARY_LEXICAL_IMG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_lexical_info.$str133$graystar_19x19_gif, (SubLObject)cb_lexical_info.$str134$_Make_Primary_));
        cb_utilities.declare_cb_tool((SubLObject)cb_lexical_info.$kw163$NL_TRIE_BROWSE, (SubLObject)cb_lexical_info.$str164$NL_Trie_Browser, (SubLObject)cb_lexical_info.$str165$NLTrie, (SubLObject)cb_lexical_info.$str166$Browse_the_NL_Trie);
        cb_utilities.setup_cb_link_method((SubLObject)cb_lexical_info.$kw163$NL_TRIE_BROWSE, (SubLObject)cb_lexical_info.$sym169$CB_LINK_NL_TRIE_BROWSE, (SubLObject)cb_lexical_info.ONE_INTEGER);
        utilities_macros.register_html_state_variable((SubLObject)cb_lexical_info.$sym170$_CB_SHOW_NL_TRIE_FILTER_PREFIX_);
        utilities_macros.register_html_state_variable((SubLObject)cb_lexical_info.$sym172$_CB_NL_TRIE_KEYLIST_CUTOFF_);
        utilities_macros.register_html_state_variable((SubLObject)cb_lexical_info.$sym175$_CB_NL_TRIE_NULL_ENTRY_BACKGROUND_COLOR_PAIR_);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexical_info.$sym176$CB_SHOW_NL_TRIE, (SubLObject)cb_lexical_info.$kw4$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_lexical_info.$kw202$CB_SHOW_NL_TRIE_SET_PREFIX, (SubLObject)cb_lexical_info.$sym208$CB_LINK_CB_SHOW_NL_TRIE_SET_PREFIX, (SubLObject)cb_lexical_info.FOUR_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexical_info.$sym212$CB_SHOW_NL_TRIE_SET_PREFIX, (SubLObject)cb_lexical_info.$kw4$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexical_info.$sym232$CB_SHOW_NL_TRIE_STARTING_AT_ENTRY, (SubLObject)cb_lexical_info.$kw4$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexical_info.$sym241$CB_SHOW_NL_TRIE_SPECIFIC, (SubLObject)cb_lexical_info.$kw4$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_lexical_info.$kw215$SHOW_NL_TRIE_SPECIFIC, (SubLObject)cb_lexical_info.$sym244$CB_LINK_SHOW_NL_TRIE_SPECIFIC, (SubLObject)cb_lexical_info.TWO_INTEGER);
        utilities_macros.register_html_state_variable((SubLObject)cb_lexical_info.$sym245$_LEXICON_WEBSERVICE_HOST_);
        utilities_macros.register_html_state_variable((SubLObject)cb_lexical_info.$sym247$_LEXICON_WEBSERVICE_PORT_);
        return (SubLObject)cb_lexical_info.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_lexical_info_file();
    }
    
    public void initializeVariables() {
        init_cb_lexical_info_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_lexical_info_file();
    }
    
    static {
        me = (SubLFile)new cb_lexical_info();
        cb_lexical_info.$verbose_lexical_infoP$ = null;
        cb_lexical_info.$lexical_strength_to_next_string$ = null;
        cb_lexical_info.$lexical_strength_to_next_title$ = null;
        cb_lexical_info.$lexical_strength_img$ = null;
        cb_lexical_info.$cb_show_nl_trie_filter_prefix$ = null;
        cb_lexical_info.$cb_nl_trie_keylist_cutoff$ = null;
        cb_lexical_info.$cb_nl_trie_null_entry_background_color_pair$ = null;
        cb_lexical_info.$cb_show_nl_trie_prefix_newline_before_list$ = null;
        cb_lexical_info.$cb_show_nl_trie_prefix_newline_after_list$ = null;
        cb_lexical_info.$lexicon_webservice_host$ = null;
        cb_lexical_info.$lexicon_webservice_port$ = null;
        $sym0$_VERBOSE_LEXICAL_INFO__ = SubLObjectFactory.makeSymbol("*VERBOSE-LEXICAL-INFO?*");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-SPEC"));
        $str2$Could_not_determine_a_term_from__ = SubLObjectFactory.makeString("Could not determine a term from ~a");
        $sym3$CB_C_LEXICAL = SubLObjectFactory.makeSymbol("CB-C-LEXICAL");
        $kw4$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str5$Lexical_Info = SubLObjectFactory.makeString("Lexical Info");
        $kw6$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $str7$cb_c_lexical__A = SubLObjectFactory.makeString("cb-c-lexical&~A");
        $str8$___a__ = SubLObjectFactory.makeString(" (~a+)");
        $str9$___a_ = SubLObjectFactory.makeString(" (~a)");
        $kw10$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $sym11$CB_LINK_LEXICAL = SubLObjectFactory.makeSymbol("CB-LINK-LEXICAL");
        $sym12$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym13$CB_C_VERBOSE_LEXICAL = SubLObjectFactory.makeSymbol("CB-C-VERBOSE-LEXICAL");
        $str14$cb_c_verbose_lexical__A = SubLObjectFactory.makeString("cb-c-verbose-lexical&~A");
        $str15$_Verbose_Lexical_Info_ = SubLObjectFactory.makeString("[Verbose Lexical Info]");
        $kw16$VERBOSE_LEXICAL = SubLObjectFactory.makeKeyword("VERBOSE-LEXICAL");
        $sym17$CB_LINK_VERBOSE_LEXICAL = SubLObjectFactory.makeSymbol("CB-LINK-VERBOSE-LEXICAL");
        $str18$No_lexical_information_found_ = SubLObjectFactory.makeString("No lexical information found.");
        $sym19$HLMT_EQUAL_ = SubLObjectFactory.makeSymbol("HLMT-EQUAL?");
        $sym20$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym21$STR_ASSERTION_ARG0 = SubLObjectFactory.makeSymbol("STR-ASSERTION-ARG0");
        $sym22$STR_ASSERTION_MT = SubLObjectFactory.makeSymbol("STR-ASSERTION-MT");
        $sym23$STR_META_ASSERTION_P = SubLObjectFactory.makeSymbol("STR-META-ASSERTION-P");
        $str24$_ALexical_info_for__S = SubLObjectFactory.makeString("~ALexical info for ~S");
        $str25$Verbose_ = SubLObjectFactory.makeString("Verbose ");
        $str26$ = SubLObjectFactory.makeString("");
        $str27$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str28$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw29$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw30$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str31$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str32$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str33$button = SubLObjectFactory.makeString("button");
        $str34$reload = SubLObjectFactory.makeString("reload");
        $str35$Refresh = SubLObjectFactory.makeString("Refresh");
        $str36$reloadCurrentFrame__reloadFrameBu = SubLObjectFactory.makeString("reloadCurrentFrame('reloadFrameButton');");
        $str37$Additional_lexical_links_ = SubLObjectFactory.makeString("Additional lexical links:");
        $str38$To_see_documentation_on_NL_genera = SubLObjectFactory.makeString("To see documentation on NL generation functions: ");
        $kw39$GEN_FUNCTION_DOCUMENTATION = SubLObjectFactory.makeKeyword("GEN-FUNCTION-DOCUMENTATION");
        $str40$This_term_is_not_sufficiently_lex = SubLObjectFactory.makeString("This term is not sufficiently lexified: ");
        $str41$To_add_more_lexical_assertions__ = SubLObjectFactory.makeString("To add more lexical assertions: ");
        $kw42$LEXIFY_TERM = SubLObjectFactory.makeKeyword("LEXIFY-TERM");
        $str43$To_clear_lexical_caches_for_this_ = SubLObjectFactory.makeString("To clear lexical caches for this term: ");
        $kw44$CLEAR_LEXICAL_CACHES = SubLObjectFactory.makeKeyword("CLEAR-LEXICAL-CACHES");
        $str45$To_see_more__ = SubLObjectFactory.makeString("To see more: ");
        $str46$_Clear_Lexical_Caches_ = SubLObjectFactory.makeString("[Clear Lexical Caches]");
        $str47$clear_lexical_caches_for_term_wit = SubLObjectFactory.makeString("clear-lexical-caches-for-term-with-id&~A&~A");
        $sym48$CB_LINK_CLEAR_LEXICAL_CACHES = SubLObjectFactory.makeSymbol("CB-LINK-CLEAR-LEXICAL-CACHES");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSE"));
        $sym50$CLEAR_LEXICAL_CACHES_FOR_TERM_WITH_ID = SubLObjectFactory.makeSymbol("CLEAR-LEXICAL-CACHES-FOR-TERM-WITH-ID");
        $str51$_Function_Documentation_ = SubLObjectFactory.makeString("[Function Documentation]");
        $kw52$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str53$show_generation_function_document = SubLObjectFactory.makeString("show-generation-function-documentation");
        $sym54$CB_LINK_GEN_FUNCTION_DOCUMENTATION = SubLObjectFactory.makeSymbol("CB-LINK-GEN-FUNCTION-DOCUMENTATION");
        $str55$NL_Generation_Function_Documentat = SubLObjectFactory.makeString("NL Generation Function Documentation");
        $list56 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTIONS"));
        $str57$_A = SubLObjectFactory.makeString("~A");
        $str58$__lang_mentioned_in_code_rang_ = SubLObjectFactory.makeString(" &lang;mentioned in code&rang;");
        $kw59$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $kw60$TOP = SubLObjectFactory.makeKeyword("TOP");
        $int61$80 = SubLObjectFactory.makeInteger(80);
        $str62$_ = SubLObjectFactory.makeString(":");
        $list63 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exampleAssertions")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exampleSentences")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exampleNATs")));
        $kw64$SELF = SubLObjectFactory.makeKeyword("SELF");
        $sym65$SHOW_GENERATION_FUNCTION_DOCUMENTATION = SubLObjectFactory.makeSymbol("SHOW-GENERATION-FUNCTION-DOCUMENTATION");
        $const66$NLGenerationFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLGenerationFunction"));
        $const67$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw68$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw69$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw70$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym71$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw72$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str73$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym74$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw75$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str76$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw77$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str78$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str79$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str80$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str82$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym83$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym84$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym85$SPEC_ = SubLObjectFactory.makeSymbol("SPEC?");
        $sym86$CONSTANT_NAME = SubLObjectFactory.makeSymbol("CONSTANT-NAME");
        $str87$Table_of_Contents = SubLObjectFactory.makeString("Table of Contents");
        $str88$Click_to_go_to_functions_denoting = SubLObjectFactory.makeString("Click to go to functions denoting a phrase type.");
        $str89$__A = SubLObjectFactory.makeString("#~A");
        $sym90$NL_PHRASE_TYPE_ = SubLObjectFactory.makeSymbol("NL-PHRASE-TYPE?");
        $sym91$GENLS_ = SubLObjectFactory.makeSymbol("GENLS?");
        $kw92$NEW = SubLObjectFactory.makeKeyword("NEW");
        $list93 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrimaryLexicalMapping")), (SubLObject)SubLObjectFactory.makeString("default")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeString("context")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContextuallyDependentLexicalMapping")), (SubLObject)SubLObjectFactory.makeString("vanishing")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VanishinglyRareLexicalMapping")), (SubLObject)SubLObjectFactory.makeString("primary")));
        $list94 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrimaryLexicalMapping")), (SubLObject)SubLObjectFactory.makeString("Primary lexical mapping.  Click to weaken to default strength.")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeString("Default strength mapping. Click to make this a contextually dependent mapping.")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContextuallyDependentLexicalMapping")), (SubLObject)SubLObjectFactory.makeString("Contextually dependent lexical mapping. Click to make this a vanishingly rare mapping.")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VanishinglyRareLexicalMapping")), (SubLObject)SubLObjectFactory.makeString("Vanishingly rare lexical mapping. Click to make this a primary mapping.")));
        $list95 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrimaryLexicalMapping")), (SubLObject)SubLObjectFactory.makeKeyword("HTML-PRIMARY-LEXICAL-IMG")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-NOT-CONTEXTUAL-LEXICAL-IMG")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContextuallyDependentLexicalMapping")), (SubLObject)SubLObjectFactory.makeKeyword("HTML-CONTEXTUAL-LEXICAL-IMG")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VanishinglyRareLexicalMapping")), (SubLObject)SubLObjectFactory.makeKeyword("HTML-VANISHING-LEXICAL-IMG")));
        $str96$javascript_setStrength__ = SubLObjectFactory.makeString("javascript:setStrength('");
        $str97$____ = SubLObjectFactory.makeString("', '");
        $str98$___this__ = SubLObjectFactory.makeString("', this);");
        $str99$padding_right__5px = SubLObjectFactory.makeString("padding-right: 5px");
        $kw100$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str101$remove = SubLObjectFactory.makeString("remove");
        $str102$add = SubLObjectFactory.makeString("add");
        $str103$This_assertion_will_be_used_prefe = SubLObjectFactory.makeString("This assertion will be used preferentially for NL generation.  Click to remove genStringAssertion preference.");
        $str104$Click_here_to_prefer_this_asserti = SubLObjectFactory.makeString("Click here to prefer this assertion in NL generation.");
        $str105$javascript_setGenString__ = SubLObjectFactory.makeString("javascript:setGenString('");
        $kw106$HTML_GENSTRING_IMG = SubLObjectFactory.makeKeyword("HTML-GENSTRING-IMG");
        $kw107$HTML_NOT_GENSTRING_IMG = SubLObjectFactory.makeKeyword("HTML-NOT-GENSTRING-IMG");
        $sym108$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const109$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const110$strengthOfLexicalMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strengthOfLexicalMapping"));
        $kw111$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $const112$ContextuallyDependentLexicalMappi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContextuallyDependentLexicalMapping"));
        $const113$PrimaryLexicalMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrimaryLexicalMapping"));
        $const114$VanishinglyRareLexicalMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VanishinglyRareLexicalMapping"));
        $const115$genStringAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genStringAssertion"));
        $str116$genstring_gray_20x20_png = SubLObjectFactory.makeString("genstring-gray-20x20.png");
        $str117$_Add_genStringAssertion_ = SubLObjectFactory.makeString("[Add genStringAssertion]");
        $str118$genstring_purple_20x20_png = SubLObjectFactory.makeString("genstring-purple-20x20.png");
        $str119$_Has_a_genStringAssert_ = SubLObjectFactory.makeString("[Has a genStringAssert]");
        $kw120$HTML_NOT_CONTEXTUAL_LEXICAL_IMG = SubLObjectFactory.makeKeyword("HTML-NOT-CONTEXTUAL-LEXICAL-IMG");
        $str121$graycaution_19x19_png = SubLObjectFactory.makeString("graycaution-19x19.png");
        $str122$_Make_Contextually_Dependent_ = SubLObjectFactory.makeString("[Make Contextually Dependent]");
        $kw123$HTML_CONTEXTUAL_LEXICAL_IMG = SubLObjectFactory.makeKeyword("HTML-CONTEXTUAL-LEXICAL-IMG");
        $str124$caution_19x19_png = SubLObjectFactory.makeString("caution-19x19.png");
        $str125$_Assertion_Contextually_Dependent = SubLObjectFactory.makeString("[Assertion Contextually Dependent]");
        $kw126$HTML_VANISHING_LEXICAL_IMG = SubLObjectFactory.makeKeyword("HTML-VANISHING-LEXICAL-IMG");
        $str127$redcaution_19x19_png = SubLObjectFactory.makeString("redcaution-19x19.png");
        $str128$_Assertion_Vanishingly_Rare_ = SubLObjectFactory.makeString("[Assertion Vanishingly Rare]");
        $kw129$HTML_PRIMARY_LEXICAL_IMG = SubLObjectFactory.makeKeyword("HTML-PRIMARY-LEXICAL-IMG");
        $str130$yellowstar_19x19_png = SubLObjectFactory.makeString("yellowstar-19x19.png");
        $str131$_Primary_Lexical_Assertion_ = SubLObjectFactory.makeString("[Primary Lexical Assertion]");
        $kw132$HTML_NOT_PRIMARY_LEXICAL_IMG = SubLObjectFactory.makeKeyword("HTML-NOT-PRIMARY-LEXICAL-IMG");
        $str133$graystar_19x19_gif = SubLObjectFactory.makeString("graystar-19x19.gif");
        $str134$_Make_Primary_ = SubLObjectFactory.makeString("[Make Primary]");
        $str135$Mt__ = SubLObjectFactory.makeString("Mt: ");
        $kw136$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym137$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw138$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw139$HTML = SubLObjectFactory.makeKeyword("HTML");
        $str140$generated_phrases_ = SubLObjectFactory.makeString("generated phrases:");
        $str141$_n_a = SubLObjectFactory.makeString(" n/a");
        $str142$_S = SubLObjectFactory.makeString("~S");
        $str143$Lexical_Info_for_ = SubLObjectFactory.makeString("Lexical Info for ");
        $str144$WordNet_Synset_ = SubLObjectFactory.makeString("WordNet Synset:");
        $const145$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw146$ALL = SubLObjectFactory.makeKeyword("ALL");
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABBREVS"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"));
        $str148$Default_generated_phrase = SubLObjectFactory.makeString("Default generated phrase");
        $str149$n_a = SubLObjectFactory.makeString("n/a");
        $str150$Other_generated_phrases__ = SubLObjectFactory.makeString("Other generated phrases: ");
        $str151$__ = SubLObjectFactory.makeString(", ");
        $str152$_A__ = SubLObjectFactory.makeString("~A: ");
        $str153$_ = SubLObjectFactory.makeString("\"");
        $str154$_ = SubLObjectFactory.makeString("'");
        $int155$32 = SubLObjectFactory.makeInteger(32);
        $str156$___A_ = SubLObjectFactory.makeString(" (~A)");
        $str157$unknown_agreement = SubLObjectFactory.makeString("unknown agreement");
        $str158$Generated_based_on_ = SubLObjectFactory.makeString("Generated based on:");
        $str159$This_paraphrase_is_cached_ = SubLObjectFactory.makeString("This paraphrase is cached.");
        $str160$Default_generation_template = SubLObjectFactory.makeString("Default generation template");
        $sym161$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str162$Other_generation_templates_ = SubLObjectFactory.makeString("Other generation templates:");
        $kw163$NL_TRIE_BROWSE = SubLObjectFactory.makeKeyword("NL-TRIE-BROWSE");
        $str164$NL_Trie_Browser = SubLObjectFactory.makeString("NL Trie Browser");
        $str165$NLTrie = SubLObjectFactory.makeString("NLTrie");
        $str166$Browse_the_NL_Trie = SubLObjectFactory.makeString("Browse the NL Trie");
        $str167$_NL_Trie_Browser_ = SubLObjectFactory.makeString("[NL Trie Browser]");
        $str168$cb_show_nl_trie = SubLObjectFactory.makeString("cb-show-nl-trie");
        $sym169$CB_LINK_NL_TRIE_BROWSE = SubLObjectFactory.makeSymbol("CB-LINK-NL-TRIE-BROWSE");
        $sym170$_CB_SHOW_NL_TRIE_FILTER_PREFIX_ = SubLObjectFactory.makeSymbol("*CB-SHOW-NL-TRIE-FILTER-PREFIX*");
        $int171$1000 = SubLObjectFactory.makeInteger(1000);
        $sym172$_CB_NL_TRIE_KEYLIST_CUTOFF_ = SubLObjectFactory.makeSymbol("*CB-NL-TRIE-KEYLIST-CUTOFF*");
        $str173$_e0eeee = SubLObjectFactory.makeString("#e0eeee");
        $str174$_f0ffff = SubLObjectFactory.makeString("#f0ffff");
        $sym175$_CB_NL_TRIE_NULL_ENTRY_BACKGROUND_COLOR_PAIR_ = SubLObjectFactory.makeSymbol("*CB-NL-TRIE-NULL-ENTRY-BACKGROUND-COLOR-PAIR*");
        $sym176$CB_SHOW_NL_TRIE = SubLObjectFactory.makeSymbol("CB-SHOW-NL-TRIE");
        $kw177$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw178$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str179$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str180$No_NL_trie_loaded_ = SubLObjectFactory.makeString("No NL trie loaded.");
        $sym181$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $str182$Sub_Entry_Clusters = SubLObjectFactory.makeString("Sub-Entry Clusters");
        $str183$This_section_of_the_trie_is_too_b = SubLObjectFactory.makeString("This section of the trie is too big to show in one page.");
        $str184$_The_keys_have_been_clustered_int = SubLObjectFactory.makeString(" The keys have been clustered into more manageable sub-entry groups.");
        $str185$_Use_the_prefix_short_cuts_to_nav = SubLObjectFactory.makeString(" Use the prefix short cuts to navigate to a sub-entry group.");
        $str186$Prefix_Shortcuts = SubLObjectFactory.makeString("Prefix Shortcuts");
        $kw187$PREFIX = SubLObjectFactory.makeKeyword("PREFIX");
        $kw188$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $str189$Entries_starting_with___A_ = SubLObjectFactory.makeString("Entries starting with '~A'");
        $str190$_see_ = SubLObjectFactory.makeString("(see ");
        $str191$all_prefix_groups = SubLObjectFactory.makeString("all_prefix_groups");
        $str192$below = SubLObjectFactory.makeString("below");
        $str193$_for_all_prefix_groups_ = SubLObjectFactory.makeString(" for all prefix groups)");
        $str194$Groups_by_Prefixes = SubLObjectFactory.makeString("Groups by Prefixes");
        $str195$0 = SubLObjectFactory.makeString("0");
        $str196$A = SubLObjectFactory.makeString("A");
        $str197$Z = SubLObjectFactory.makeString("Z");
        $sym198$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $str199$_ = SubLObjectFactory.makeString("[");
        $str200$__ = SubLObjectFactory.makeString("] ");
        $kw201$MEMBERS = SubLObjectFactory.makeKeyword("MEMBERS");
        $kw202$CB_SHOW_NL_TRIE_SET_PREFIX = SubLObjectFactory.makeKeyword("CB-SHOW-NL-TRIE-SET-PREFIX");
        $str203$_ = SubLObjectFactory.makeString("]");
        $str204$_A_sub_entries = SubLObjectFactory.makeString("~A sub-entries");
        $str205$_Set_Prefix_Filter_ = SubLObjectFactory.makeString("[Set Prefix Filter]");
        $str206$cb_show_nl_trie_set_prefix__A = SubLObjectFactory.makeString("cb-show-nl-trie-set-prefix&~A");
        $kw207$PATH = SubLObjectFactory.makeKeyword("PATH");
        $sym208$CB_LINK_CB_SHOW_NL_TRIE_SET_PREFIX = SubLObjectFactory.makeSymbol("CB-LINK-CB-SHOW-NL-TRIE-SET-PREFIX");
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PATH"), (SubLObject)SubLObjectFactory.makeSymbol("PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("WIDTH"));
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PATH"), (SubLObject)SubLObjectFactory.makeKeyword("PREFIX"), (SubLObject)SubLObjectFactory.makeKeyword("WIDTH"));
        $kw211$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $sym212$CB_SHOW_NL_TRIE_SET_PREFIX = SubLObjectFactory.makeSymbol("CB-SHOW-NL-TRIE-SET-PREFIX");
        $str213$Sub_Entries = SubLObjectFactory.makeString("Sub-Entries");
        $kw214$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw215$SHOW_NL_TRIE_SPECIFIC = SubLObjectFactory.makeKeyword("SHOW-NL-TRIE-SPECIFIC");
        $str216$Entry_for_ = SubLObjectFactory.makeString("Entry for ");
        $str217$_Root_ = SubLObjectFactory.makeString("(Root)");
        $str218$____ = SubLObjectFactory.makeString(" >> ");
        $str219$post = SubLObjectFactory.makeString("post");
        $str220$cb_show_nl_trie_starting_at_entry = SubLObjectFactory.makeString("cb-show-nl-trie-starting-at-entry");
        $str221$Go_to_entry_ = SubLObjectFactory.makeString("Go to entry:");
        $str222$specification = SubLObjectFactory.makeString("specification");
        $int223$50 = SubLObjectFactory.makeInteger(50);
        $kw224$RAW_PATH = SubLObjectFactory.makeKeyword("RAW-PATH");
        $kw225$VALID_PATH = SubLObjectFactory.makeKeyword("VALID-PATH");
        $str226$The_entry_specification = SubLObjectFactory.makeString("The entry specification");
        $str227$returned_no_NL_trie_entries__Plea = SubLObjectFactory.makeString("returned no NL trie entries. Please try again");
        $str228$is_ambiguous_between_the_followin = SubLObjectFactory.makeString("is ambiguous between the following NL trie entries:");
        $list229 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-PATH"));
        $list230 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RAW-PATH"), (SubLObject)SubLObjectFactory.makeKeyword("VALID-PATH"));
        $str231$_Go_ = SubLObjectFactory.makeString("[Go]");
        $sym232$CB_SHOW_NL_TRIE_STARTING_AT_ENTRY = SubLObjectFactory.makeSymbol("CB-SHOW-NL-TRIE-STARTING-AT-ENTRY");
        $str233$Dont_know_how_to_interpret__A_as_ = SubLObjectFactory.makeString("Dont know how to interpret ~A as cluster.");
        $sym234$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str235$_ = SubLObjectFactory.makeString("(");
        $str236$_sub_key_A_ = SubLObjectFactory.makeString(" sub-key~A)");
        $str237$s = SubLObjectFactory.makeString("s");
        $str238$background_color___ = SubLObjectFactory.makeString("background-color : ");
        $str239$Syntactic__ = SubLObjectFactory.makeString("Syntactic: ");
        $str240$Semantic__ = SubLObjectFactory.makeString("Semantic: ");
        $sym241$CB_SHOW_NL_TRIE_SPECIFIC = SubLObjectFactory.makeSymbol("CB-SHOW-NL-TRIE-SPECIFIC");
        $str242$_Show_in_NL_Trie_ = SubLObjectFactory.makeString("[Show in NL Trie]");
        $str243$cb_show_nl_trie_specific__A = SubLObjectFactory.makeString("cb-show-nl-trie-specific&~A");
        $sym244$CB_LINK_SHOW_NL_TRIE_SPECIFIC = SubLObjectFactory.makeSymbol("CB-LINK-SHOW-NL-TRIE-SPECIFIC");
        $sym245$_LEXICON_WEBSERVICE_HOST_ = SubLObjectFactory.makeSymbol("*LEXICON-WEBSERVICE-HOST*");
        $int246$8080 = SubLObjectFactory.makeInteger(8080);
        $sym247$_LEXICON_WEBSERVICE_PORT_ = SubLObjectFactory.makeSymbol("*LEXICON-WEBSERVICE-PORT*");
    }
}

/*

	Total time: 2678 ms
	
*/