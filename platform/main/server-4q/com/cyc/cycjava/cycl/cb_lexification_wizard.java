package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cb_lexification_wizard;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.cb_lexification_wizard.*;
import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cb_lexification_wizard extends SubLTranslatedFile {
    public static final SubLFile me = new cb_lexification_wizard();

    public static final String myName = "com.cyc.cycjava.cycl.cb_lexification_wizard";

    public static final String myFingerPrint = "b984ac18e9df545bd01b85a95f9491a8d67884254d33377d24dcace5b777b7a0";



    // deflexical
    public static final SubLSymbol $streamlined_lexwizP$ = makeSymbol("*STREAMLINED-LEXWIZ?*");



    private static final SubLSymbol $skipped_lexwiz_terms$ = makeSymbol("*SKIPPED-LEXWIZ-TERMS*");

    private static final SubLSymbol $sym1$_STREAMLINED_LEXWIZ__ = makeSymbol("*STREAMLINED-LEXWIZ?*");

    private static final SubLString $str2$lexification_wizard = makeString("lexification-wizard");



    private static final SubLString $str4$cb_invoke_oe_lexification_wizard = makeString("cb-invoke-oe-lexification-wizard");



    private static final SubLSymbol CB_LINK_LEXIFICATION_WIZARD = makeSymbol("CB-LINK-LEXIFICATION-WIZARD");



    private static final SubLString $str8$lexwiz_html = makeString("lexwiz.html");

    private static final SubLList $list9 = list(list(makeSymbol("COLOR")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list11 = list(makeSymbol("CNOT"), makeSymbol("*HTML-INPUT-DISABLED?*"));

    private static final SubLSymbol HTML_FONT_COLOR = makeSymbol("HTML-FONT-COLOR");



    private static final SubLString $$$the_Lexification_Assistant = makeString("the Lexification Assistant");

    private static final SubLString $str15$_id = makeString(":id");

    private static final SubLString $str16$ = makeString("");

    private static final SubLString $str17$color_gray = makeString("color:gray");

    private static final SubLString $$$Cycorp_Lexification_Assistant = makeString("Cycorp Lexification Assistant");

    private static final SubLString $str19$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str20$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str25$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str31$cb_handle_oe_lexification_wizard = makeString("cb-handle-oe-lexification-wizard");

    private static final SubLString $str32$_Specify_the_parameters_needed_fo = makeString(" Specify the parameters needed for lexification");

    private static final SubLString $$$Reset_All = makeString("Reset All");

    private static final SubLString $str34$_reset = makeString(":reset");

    private static final SubLString $str35$lexwiz_main_params = makeString("lexwiz-main-params");

    private static final SubLString $str36$basic_info = makeString("basic-info");

    private static final SubLString $str37$Basic_Information___ = makeString("Basic Information : ");





    private static final SubLString $str40$formula_info = makeString("formula-info");

    private static final SubLString $str41$Formula___ = makeString("Formula : ");



    public static final SubLString $str43$Status___OK = makeString("Status : OK");



    public static final SubLString $str45$Error__ = makeString("Error :");

    public static final SubLString $str46$Next__ = makeString("Next->");





    private static final SubLString $$$Lexify = makeString("Lexify");

    private static final SubLString $$$Assert = makeString("Assert");

    private static final SubLString $$$Assert_and_Relexify = makeString("Assert and Relexify");

    private static final SubLString $str52$_relexify = makeString(":relexify");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLString $$$Get_Next_Lexification = makeString("Get Next Lexification");

    private static final SubLString $str55$_next_action = makeString(":next-action");

    private static final SubLString $$$Skip_Lexification = makeString("Skip Lexification");

    private static final SubLString $str57$_skip_action = makeString(":skip-action");

    private static final SubLString $str58$Reason__optional___ = makeString("Reason (optional): ");

    private static final SubLString $str59$_comment = makeString(":comment");

    private static final SubLString $str60$_Invoke_Dictionary_Assistant_ = makeString("[Invoke Dictionary Assistant]");

    private static final SubLString $str61$Note__For_guided_lexification__us = makeString("Note: For guided lexification, use the SME lexwiz instead: ");

    private static final SubLSymbol $SME_LEXIFY_TERM = makeKeyword("SME-LEXIFY-TERM");

    private static final SubLString $str63$edit_formula = makeString("edit-formula");



    private static final SubLSymbol CB_INVOKE_OE_LEXIFICATION_WIZARD = makeSymbol("CB-INVOKE-OE-LEXIFICATION-WIZARD");



    private static final SubLString $str67$lexwiz_stages = makeString("lexwiz-stages");

    private static final SubLString $str68$font_family__sans_serif__color__D = makeString("font-family: sans-serif; color: DimGray");

    private static final SubLString $str69$_87CEFA = makeString("#87CEFA");

    private static final SubLString $str70$_B0C4DE = makeString("#B0C4DE");

    private static final SubLString $str71$padding__5___outline_darkblue_sol = makeString("padding: 5%; outline:darkblue solid thin;");



    private static final SubLString $str73$color_DimGray = makeString("color:DimGray");

    private static final SubLString $str74$Stages_ = makeString("Stages:");

    private static final SubLString $$$Gathering = makeString("Gathering");

    private static final SubLString $str76$__x2009___x2009_ = makeString("&#x2009;&#x2009;");

    private static final SubLString $str77$font_size__large = makeString("font-size: large");

    private static final SubLString $str78$__x21E8_ = makeString("&#x21E8;");

    private static final SubLString $$$Reviewing = makeString("Reviewing");

    private static final SubLString $$$Asserting = makeString("Asserting");

    private static final SubLString $str81$_cyc_term = makeString(":cyc-term");

    private static final SubLString $$$Complete = makeString("Complete");





    private static final SubLString $str85$Term__ = makeString("Term :");

    private static final SubLString $$$Clear_Term = makeString("Clear Term");

    private static final SubLString $str87$_create_term = makeString(":create-term");

    private static final SubLString $str88$Create_Term_ = makeString("Create Term?");

    private static final SubLString $str89$Phrase__ = makeString("Phrase :");

    private static final SubLString $str90$_phrase = makeString(":phrase");

    private static final SubLString $$$Clear_Phrase = makeString("Clear Phrase");

    private static final SubLString $str92$_is_preferred = makeString(":is-preferred");

    private static final SubLString $str93$Is_preferred_ = makeString("Is preferred?");



    private static final SubLString $str95$_is_precise = makeString(":is-precise");

    private static final SubLString $str96$Is_precise_ = makeString("Is precise?");

    private static final SubLString $str97$_is_proper_name = makeString(":is-proper-name");

    private static final SubLString $str98$Is_proper_name_ = makeString("Is proper name?");

    private static final SubLString $str99$_nonrelational = makeString(":nonrelational");

    private static final SubLString $str100$Nonrelational_lexification_ = makeString("Nonrelational lexification?");

    private static final SubLString $str101$Mt__ = makeString("Mt :");

    private static final SubLString $str102$_lexification_mt = makeString(":lexification-mt");

    private static final SubLString $str103$Assertion_Editor___ = makeString("Assertion Editor : ");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $str105$Formula_for_editor___A__ = makeString("Formula for editor: ~A~%");



    private static final SubLString $str107$_user_formula = makeString(":user-formula");





    private static final SubLString $$$Cyclify = makeString("Cyclify");



    private static final SubLString $$$Clear = makeString("Clear");





    private static final SubLString $str115$_user_formula_copy = makeString(":user-formula-copy");

    private static final SubLString $str116$Proper_name_predicate__ = makeString("Proper name predicate :");

    private static final SubLString $str117$_lexification_predicate = makeString(":lexification-predicate");



    private static final SubLString $str119$arg_spec = makeString("arg-spec");

    private static final SubLString $str120$pred_arg_info = makeString("pred-arg-info");

    private static final SubLString $str121$Argument_specification__ = makeString("Argument specification :");

    private static final SubLString $str122$Arg___A__ = makeString("Arg. ~A :");

    private static final SubLSymbol STRING_TO_INTEGER = makeSymbol("STRING-TO-INTEGER");

    private static final SubLString $str124$_arg_offset__A = makeString(":arg-offset-~A");

    private static final SubLSymbol STRING_FOR_FORT = makeSymbol("STRING-FOR-FORT");

    private static final SubLString $str126$_arg_speech_part__A = makeString(":arg-speech-part-~A");

    private static final SubLString $$$Parse_Template_Specification = makeString("Parse Template Specification");

    private static final SubLString $str128$_parse_template_mt = makeString(":parse-template-mt");

    private static final SubLString $str129$_parse_template = makeString(":parse-template");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $$$virtual = makeString("virtual");

    private static final SubLString $str132$Headword_position__ = makeString("Headword position :");

    private static final SubLString $str133$_headword_position = makeString(":headword-position");

    private static final SubLString $$$First = makeString("First");

    private static final SubLString $$$Last = makeString("Last");

    private static final SubLString $$$Other = makeString("Other");

    private static final SubLString $str137$Other___a__a__ = makeString("Other (~a-~a) ");

    private static final SubLString $str138$_other_position = makeString(":other-position");

    private static final SubLString $str139$Headword_part_of_speech__ = makeString("Headword part of speech :");

    private static final SubLString $str140$_headword_part_of_speech = makeString(":headword-part-of-speech");

    private static final SubLString $str141$_choose_part_of_speech = makeString(":choose-part-of-speech");

    private static final SubLString $str142$_add_syntactic_mapping = makeString(":add-syntactic-mapping");

    private static final SubLString $str143$_Add_mapping_ = makeString(" Add mapping?");

    private static final SubLString $str144$Mapping_Mt__ = makeString("Mapping Mt: ");

    private static final SubLString $str145$_syntactic_mt = makeString(":syntactic-mt");

    private static final SubLString $str146$cb_handle_oe_lexification_wizard_ = makeString("cb-handle-oe-lexification-wizard(~A)~%");

    private static final SubLObject $$cyclistNotes = reader_make_constant_shell(makeString("cyclistNotes"));

    private static final SubLObject $$needsHandLexification = reader_make_constant_shell(makeString("needsHandLexification"));

    private static final SubLObject $$termStrings = reader_make_constant_shell(makeString("termStrings"));

    private static final SubLString $str150$Missing_information__see_blue_hig = makeString("Missing information (see blue highlights)");

    private static final SubLString $$$Invalid_Cyc_term = makeString("Invalid Cyc term");

    private static final SubLString $$$Invalid_Cyc_MT = makeString("Invalid Cyc MT");

    private static final SubLList $list153 = list(makeKeyword("FRESH"), makeKeyword("NEED-INPUT"));

    private static final SubLString $str154$Warning__ = makeString("Warning: ");

    private static final SubLString $str155$____assertion_failed___a______ = makeString("*** assertion failed: ~a ***~%");

    private static final SubLList $list156 = list(makeSymbol("COR"), makeSymbol("READY?"), list(makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("OBJECT")), list(makeSymbol("MEMBER"), list(makeSymbol("LEXWIZ-STATE"), makeSymbol("OBJECT")), list(makeSymbol("QUOTE"), list(makeKeyword("FRESH"), makeKeyword("NEED-INPUT")))));

    private static final SubLSymbol CB_HANDLE_OE_LEXIFICATION_WIZARD = makeSymbol("CB-HANDLE-OE-LEXIFICATION-WIZARD");

    private static final SubLString $str158$Post_lexification_error = makeString("Post-lexification error");



    private static final SubLString $str160$Lexification_successful_for__a = makeString("Lexification successful for ~a");

    private static final SubLString $str161$Added__s_ = makeString("Added ~s.");

    private static final SubLString $str162$Other_ways_of_referring_to__a_ = makeString("Other ways of referring to ~a:");

    private static final SubLString $str163$_____a = makeString("    ~a");

    private static final SubLString $str164$No_other_ways_of_referring_to__a = makeString("No other ways of referring to ~a");

    private static final SubLString $str165$Unable_to_confirm_lexification___ = makeString("Unable to confirm lexification: ~S for ~S");

    private static final SubLString $str166$Internal_error_during_lexificatio = makeString("Internal error during lexification confirmation:");

    private static final SubLSymbol $sym167$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str168$_arg_offset_ = makeString(":arg-offset-");

    private static final SubLSymbol WORD_OFFSETS_TO_SPAN = makeSymbol("WORD-OFFSETS-TO-SPAN");

    private static final SubLString $str170$_arg_speech_part_ = makeString(":arg-speech-part-");

    private static final SubLSymbol FORT_FOR_STRING = makeSymbol("FORT-FOR-STRING");

    private static final SubLString $str172$The_relation_arguments_must_be_sp = makeString("The relation arguments must be specified");

    private static final SubLString $str173$_A_A = makeString("~A~A");

    private static final SubLSymbol EXTRACT_INTEGER = makeSymbol("EXTRACT-INTEGER");

    private static final SubLSymbol $sym175$_ = makeSymbol("<");

    private static final SubLString $str176$Problem_deriving_relation_templat = makeString("Problem deriving relation template: ~A~%");

    private static final SubLString $$$1 = makeString("1");

    private static final SubLSymbol USER_FORMULA = makeSymbol("USER-FORMULA");

    private static final SubLList $list179 = list(makeKeyword("INPUT-NAME"), makeString(":user-formula"));

    private static final SubLString $str180$Error_in_formula___a__ = makeString("Error in formula: ~a~%");

    private static final SubLString $str181$_a_in__a = makeString("~a in ~a");

    private static final SubLSymbol $sym182$_TERM = makeSymbol("?TERM");

    private static final SubLObject $$myCreationPurpose = reader_make_constant_shell(makeString("myCreationPurpose"));

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

    private static final SubLSymbol $sym185$_ = makeSymbol(">");

    private static final SubLSymbol FACT_SHEET_TERM_GAF_PRIORITY = makeSymbol("FACT-SHEET-TERM-GAF-PRIORITY");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLList $list188 = list(makeSymbol("CYCL-TERM"), makeSymbol("STRING"));

    private static final SubLSymbol $known_lexified_terms$ = makeSymbol("*KNOWN-LEXIFIED-TERMS*");

    private static final SubLObject $$synonymousExternalConcept = reader_make_constant_shell(makeString("synonymousExternalConcept"));

    private static final SubLList $list191 = list(reader_make_constant_shell(makeString("ContextOfPCWFn")), reader_make_constant_shell(makeString("CCF-SemanticDBOntology")));

    private static final SubLString $str192$Mt__ = makeString("Mt: ");

    public static SubLObject cb_link_lexification_wizard(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str2$lexification_wizard;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str4$cb_invoke_oe_lexification_wizard);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cond_html_font_color(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject color = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        color = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PIF, $list11, listS(HTML_FONT_COLOR, list(color), append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    public static SubLObject cb_invoke_oe_lexification_wizard(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        lexification_wizard.init_lexification_wizard(UNPROVIDED);
        if ((NIL == lexification_wizard.lexwiz_term(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread))) && (NIL == lexification_reminders.lexification_user_actions(UNPROVIDED))) {
            lex_loop(UNPROVIDED);
            if (NIL != lexification_reminders.lexification_user_actions(UNPROVIDED)) {
                cb_invoke_oe_lexification_wizard(UNPROVIDED);
            }
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Lexification_Assistant);
            return NIL;
        }
        final SubLObject old_id = html_extract_input($str15$_id, args);
        final SubLObject old_object = lexification_wizard.get_lexification_object(old_id);
        final SubLObject v_object = (NIL != old_object) ? lexification_wizard.copy_lexification_parameters(old_object) : lexification_wizard.copy_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread));
        final SubLObject id = lexification_wizard.lexwiz_id(v_object);
        final SubLObject lex_term = misc_kb_utilities.coerce_name(lexification_wizard.lexwiz_term(v_object));
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lex_term);
        final SubLObject nonrelationalP = lexification_wizard.lexwiz_nonrelationalP(v_object);
        final SubLObject relationalP = makeBoolean((NIL != lexification_utilities.is_relationalP(cyc_term)) && (NIL == nonrelationalP));
        final SubLObject lex_mt = lexification_utilities.string_for_field(lexification_wizard.lexwiz_mt(v_object));
        final SubLObject lex_phrase = lexification_utilities.string_for_field(lexification_wizard.lexwiz_phrase(v_object));
        final SubLObject comment = $str16$;
        final SubLObject main_disabledP;
        final SubLObject user_editedP = main_disabledP = lexification_wizard.lexwiz_user_editedP(v_object);
        final SubLObject disabled_style = (NIL != main_disabledP) ? $str17$color_gray : $str16$;
        final SubLObject title_var = $$$Cycorp_Lexification_Assistant;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str19$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str20$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
                dhtml_macros.dhtml_with_toggle_visibility_support();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str25$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str31$cb_handle_oe_lexification_wizard, T, UNPROVIDED);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(FOUR_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_help_preamble($LEXWIZ, UNPROVIDED, UNPROVIDED);
                            html_princ($str32$_Specify_the_parameters_needed_fo);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(FOUR_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            show_lexwiz_stages_diagram(v_object);
                            html_submit_input($$$Reset_All, $str34$_reset, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_hidden_input($str15$_id, id, UNPROVIDED);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str35$lexwiz_main_params);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_div_style$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(disabled_style);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$7 = html_macros.$html_input_disabledP$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$html_input_disabledP$.bind(main_disabledP, thread);
                                dhtml_macros.dhtml_switch_visibility_links_arrows($str36$basic_info, $str37$Basic_Information___);
                                dhtml_macros.dhtml_set_switched_visibility($str36$basic_info, $VISIBLE, $PARAGRAPH);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str36$basic_info);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    init_basic_lexification(v_object, lex_term, lex_phrase, lex_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_newline(UNPROVIDED);
                                if (NIL == user_editedP) {
                                    if (NIL != lexification_wizard.lexwiz_is_properP(v_object)) {
                                        init_name_lexification(v_object, lex_term, lex_phrase, lex_mt);
                                    } else
                                        if (NIL != relationalP) {
                                            init_relation_lexification(v_object, lex_term, lex_phrase, lex_mt);
                                        } else {
                                            init_denotation_lexification(v_object, lex_term, lex_phrase, lex_mt);
                                        }

                                }
                                if (NIL != lexification_wizard.lexwiz_formula(v_object)) {
                                    dhtml_macros.dhtml_switch_visibility_links_arrows($str40$formula_info, $str41$Formula___);
                                    dhtml_macros.dhtml_set_switched_visibility($str40$formula_info, $VISIBLE, $PARAGRAPH);
                                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str40$formula_info);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_newline(UNPROVIDED);
                                        cb_form(lexification_wizard.lexwiz_formula(v_object), NIL, T);
                                        html_newline(UNPROVIDED);
                                        if (lexification_wizard.lexwiz_state(v_object) == $DONE) {
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str43$Status___OK);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                            } finally {
                                html_macros.$html_input_disabledP$.rebind(_prev_bind_1_$7, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (NIL != lexification_wizard.lexwiz_error_message(v_object)) {
                                html_newline(UNPROVIDED);
                                final SubLObject color_val = $RED;
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != color_val) {
                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(color_val));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str45$Error__);
                                    html_indent(ONE_INTEGER);
                                    html_princ(lexification_wizard.lexwiz_error_message(v_object));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                            }
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject submit_label = $str46$Next__;
                                    if ((NIL == lexification_wizard.lexwiz_error_message(v_object)) && (lexification_wizard.lexwiz_state(v_object) != $FRESH)) {
                                        if ((lexification_wizard.lexwiz_state(v_object) == $NEED_APPROVAL) && ((NIL == lexification_wizard.lexwiz_formula(v_object)) || (NIL != lexification_wizard.lexwiz_user_formula(v_object)))) {
                                            submit_label = $$$Lexify;
                                        }
                                        if (lexification_wizard.lexwiz_state(v_object) == $DONE) {
                                            submit_label = $$$Assert;
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_submit_input(submit_label, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    if (lexification_wizard.lexwiz_state(v_object) == $DONE) {
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_indent(UNPROVIDED);
                                            html_submit_input($$$Assert_and_Relexify, $str52$_relexify, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    if (lexification_wizard.lexwiz_state(v_object) == $FRESH) {
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_indent($int$40);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        if ((NIL != lexification_utilities.lex_empty_stringP(lex_term)) && (NIL != lexification_reminders.lexification_user_actions(UNPROVIDED))) {
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_submit_input($$$Get_Next_Lexification, $str55$_next_action, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                        if (NIL != lexification_wizard.lexwiz_user_action(v_object)) {
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_submit_input($$$Skip_Lexification, $str57$_skip_action, UNPROVIDED);
                                                html_newline(UNPROVIDED);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str58$Reason__optional___);
                                                html_text_input($str59$_comment, comment, $int$40);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                    }
                                    html_newline(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            init_formula_lexification(v_object);
                            final SubLObject lexwiz_link_text = $str60$_Invoke_Dictionary_Assistant_;
                            html_newline(UNPROVIDED);
                            html_princ($str61$Note__For_guided_lexification__us);
                            cb_link($SME_LEXIFY_TERM, id, lexwiz_link_text, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            if (NIL != cyc_term) {
                                html_hr(UNPROVIDED, UNPROVIDED);
                                if (NIL != lexification_wizard.$lexwiz_show_term_informationP$.getGlobalValue()) {
                                    cb_browser.cb_print_documentation_information(cyc_term, T);
                                    html_newline(UNPROVIDED);
                                    cb_browser.cb_print_definitional_information(cyc_term);
                                    html_newline(UNPROVIDED);
                                    cb_print_sec_assertions(cyc_term);
                                    html_newline(UNPROVIDED);
                                }
                                cb_lexical_info.cb_print_lexical_information(cyc_term, UNPROVIDED);
                                html_newline(UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        if ((NIL != lexification_wizard.lexwiz_user_editedP(v_object)) || ((NIL != lexification_wizard.lexwiz_formula(v_object)) && (NIL != lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue(thread)))) {
                            dhtml_macros.dhtml_set_switched_visibility($str63$edit_formula, $VISIBLE, UNPROVIDED);
                            dhtml_macros.dhtml_set_switched_visibility($str36$basic_info, $INVISIBLE, UNPROVIDED);
                            dhtml_macros.dhtml_set_switched_visibility($str40$formula_info, $INVISIBLE, UNPROVIDED);
                        }
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        lexification_wizard.trace_lexification_parameters(v_object, lexification_utilities.$lex_very_verbose$.getGlobalValue());
        return T;
    }

    public static SubLObject show_lexwiz_stages_diagram(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str67$lexwiz_stages);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str68$font_family__sans_serif__color__D);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject highlight_color = $str69$_87CEFA;
                final SubLObject background_color = $str70$_B0C4DE;
                final SubLObject box_style = $str71$padding__5___outline_darkblue_sol;
                SubLObject gathering_color = background_color;
                SubLObject reviewing_color = background_color;
                SubLObject asserting_color = background_color;
                final SubLObject pcase_var = lexification_wizard.lexwiz_state(v_object);
                if (!pcase_var.eql($FRESH)) {
                    if (pcase_var.eql($NEED_INPUT)) {
                        gathering_color = highlight_color;
                    } else
                        if (pcase_var.eql($NEED_APPROVAL)) {
                            reviewing_color = highlight_color;
                        } else
                            if (pcase_var.eql($DONE)) {
                                asserting_color = highlight_color;
                            }


                }
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($str73$color_DimGray));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(TEN_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str74$Stages_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != gathering_color) {
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(gathering_color);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(box_style);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($$$Gathering);
                            html_markup($str76$__x2009___x2009_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    if (NIL == $streamlined_lexwizP$.getGlobalValue()) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_div_style$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str77$font_size__large);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup($str78$__x21E8_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (NIL != reviewing_color) {
                            html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(reviewing_color);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_div_style$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(box_style);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($$$Reviewing);
                                html_markup($str76$__x2009___x2009_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str77$font_size__large);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup($str78$__x21E8_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != asserting_color) {
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(asserting_color);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(box_style);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($$$Asserting);
                            html_markup($str76$__x2009___x2009_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject init_basic_lexification(final SubLObject v_object, final SubLObject lex_term, final SubLObject lex_phrase, SubLObject lex_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lex_term);
        final SubLObject nonrelationalP = lexification_wizard.lexwiz_nonrelationalP(v_object);
        final SubLObject relationalP = makeBoolean((NIL != lexification_utilities.is_relationalP(cyc_term)) && (NIL == nonrelationalP));
        final SubLObject default_lex_mt = (NIL != relationalP) ? lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread) : lexicon_vars.$default_lexification_mt$.getDynamicValue(thread);
        html_complete.html_complete_button($str81$_cyc_term, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(ONE_INTEGER);
        if (NIL == html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            final SubLObject color_val = (NIL != cyc_term) ? $BLACK : $BLUE;
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != color_val) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(color_val));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str85$Term__);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
        } else {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str85$Term__);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        html_indent(ONE_INTEGER);
        html_text_input($str81$_cyc_term, lex_term, $int$40);
        html_indent(ONE_INTEGER);
        html_script_utilities.html_clear_input_button($str81$_cyc_term, $$$Clear_Term, UNPROVIDED);
        if ((NIL == cyc_term) && string_utilities.char_at(lex_term, ZERO_INTEGER).eql(CHAR_lparen)) {
            html_checkbox_input($str87$_create_term, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(ONE_INTEGER);
            html_princ($str88$Create_Term_);
        }
        html_newline(UNPROVIDED);
        final SubLObject phrase_label = $str89$Phrase__;
        if (NIL == html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            final SubLObject color_val2 = (NIL != string_utilities.non_empty_stringP(lex_phrase)) ? $BLACK : $BLUE;
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != color_val2) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(color_val2));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ(phrase_label);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
        } else {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ(phrase_label);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        html_indent(ONE_INTEGER);
        html_text_input($str90$_phrase, lex_phrase, $int$40);
        html_indent(ONE_INTEGER);
        html_script_utilities.html_clear_input_button($str90$_phrase, $$$Clear_Phrase, UNPROVIDED);
        html_newline(UNPROVIDED);
        final SubLObject is_preferredP = eq(lexification_wizard.lexwiz_is_preferredP(v_object), T);
        html_indent(add(ONE_INTEGER, length(phrase_label)));
        html_checkbox_input($str92$_is_preferred, is_preferredP, is_preferredP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(ONE_INTEGER);
        html_princ($str93$Is_preferred_);
        final SubLObject is_preciseP = eq(lexification_wizard.lexwiz_is_preferredP(v_object), $PRECISE);
        html_indent(ONE_INTEGER);
        html_checkbox_input($str95$_is_precise, is_preciseP, is_preciseP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(ONE_INTEGER);
        html_princ($str96$Is_precise_);
        if ((NIL != lexification_utilities.cyc_individual_constantP(cyc_term)) || (NIL != lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue(thread))) {
            final SubLObject is_properP = lexification_wizard.lexwiz_is_properP(v_object);
            html_indent(TWO_INTEGER);
            html_checkbox_input($str97$_is_proper_name, is_properP, is_properP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(ONE_INTEGER);
            html_princ($str98$Is_proper_name_);
        }
        if ((NIL != lexification_utilities.is_relationalP(cyc_term)) && (NIL != lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue(thread))) {
            html_indent(TWO_INTEGER);
            html_checkbox_input($str99$_nonrelational, nonrelationalP, nonrelationalP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(ONE_INTEGER);
            html_princ($str100$Nonrelational_lexification_);
        }
        html_newline(UNPROVIDED);
        if (NIL == string_utilities.non_empty_stringP(lex_mt)) {
            lex_mt = default_lex_mt;
        }
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str101$Mt__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        create_simple_dropdown_list($str102$_lexification_mt, lexification_wizard.$lexification_mts$.getGlobalValue(), misc_kb_utilities.coerce_name(lex_mt));
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject init_formula_lexification(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != lexification_wizard.lexwiz_formula(v_object)) || (NIL != lexification_wizard.lexwiz_user_formula(v_object))) {
            dhtml_macros.dhtml_switch_visibility_links_arrows($str63$edit_formula, $str103$Assertion_Editor___);
            final SubLObject formula_text = or2(lexification_wizard.lexwiz_user_formula(v_object), format_cycl_expression.format_cycl_expression_to_string(lexification_wizard.lexwiz_formula(v_object), UNPROVIDED));
            final SubLObject is_visibleP = makeBoolean((NIL != lexification_wizard.lexwiz_user_formula(v_object)) || (NIL != lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue(thread)));
            final SubLObject edit_box_visibility = (NIL != is_visibleP) ? $VISIBLE : $INVISIBLE;
            final SubLObject formula_len = max($int$60, length(formula_text));
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), $str105$Formula_for_editor___A__, formula_text);
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            dhtml_macros.dhtml_set_switched_visibility($str63$edit_formula, $VISIBLE, $PARAGRAPH);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str63$edit_formula);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_form_widgets.cb_el_sentence_input_section(formula_text, list(new SubLObject[]{ $INPUT_NAME, $str107$_user_formula, $PRETTY_NAME, NIL, $CYCLIFY_LABEL, $$$Cyclify, $CLEAR_LABEL, $$$Clear, $HEIGHT, FIVE_INTEGER, $WIDTH, formula_len }));
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_hidden_input($str115$_user_formula_copy, formula_text, UNPROVIDED);
            html_newline(UNPROVIDED);
            return NIL;
        }
        return NIL;
    }

    public static SubLObject init_name_lexification(final SubLObject v_object, final SubLObject lex_term, final SubLObject lex_phrase, final SubLObject lex_mt) {
        final SubLObject lex_pred = lexification_utilities.string_for_field(lexification_wizard.lexwiz_proper_name_pred(v_object));
        final SubLObject proper_name_pred_names = lexification_wizard.filter_proper_name_predicates(lex_term);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str116$Proper_name_predicate__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_indent(ONE_INTEGER);
        create_simple_dropdown_list($str117$_lexification_predicate, proper_name_pred_names, lex_pred);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject init_relation_lexification(final SubLObject v_object, final SubLObject lex_term, final SubLObject lex_phrase, final SubLObject lex_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lex_args = lexification_wizard.lexwiz_template_args(v_object);
        final SubLObject lex_speech_parts = lexification_wizard.lexwiz_template_speech_parts(v_object);
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lex_term);
        final SubLObject v_arity = (NIL != cyc_term) ? lexification_utilities.lex_arity_in_any_mt(cyc_term) : ZERO_INTEGER;
        if (lexification_wizard.lexwiz_lexical_mt(v_object).equal(misc_kb_utilities.fort_for_string(lexicon_vars.$default_lexification_mt$.getDynamicValue(thread)))) {
            lexification_wizard._csetf_lexwiz_lexical_mt(v_object, misc_kb_utilities.fort_for_string(lexicon_vars.$default_predicate_lexification_mt$.getDynamicValue(thread)));
        }
        final SubLObject word_choices = lexification_utilities.lex_string_tokenize(lex_phrase, T);
        final SubLObject num_words = length(word_choices);
        final SubLObject word_offsets = Mapping.mapcar(symbol_function(TO_STRING), list_utilities.num_list(num_words, UNPROVIDED));
        final SubLObject default_all_speech_parts = sme_lexification_wizard.rtp_parts_of_speech(word_choices);
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str119$arg_spec);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            dhtml_macros.dhtml_switch_visibility_links_arrows($str120$pred_arg_info, $str121$Argument_specification__);
            dhtml_macros.dhtml_set_switched_visibility($str120$pred_arg_info, $VISIBLE, $PARAGRAPH);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str120$pred_arg_info);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject i;
                        SubLObject arg_num;
                        SubLObject v_arg_type;
                        SubLObject arg_type_description;
                        SubLObject _prev_bind_0_$37;
                        SubLObject _prev_bind_0_$38;
                        for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                            arg_num = add(i, ONE_INTEGER);
                            v_arg_type = lexification_utilities.get_relation_argument_type(cyc_term, arg_num);
                            arg_type_description = lexification_utilities.lex_describe_term(v_arg_type, UNPROVIDED);
                            if (i.numG(ZERO_INTEGER)) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup($str76$__x2009___x2009_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(format(NIL, $str122$Arg___A__, arg_num));
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_princ(arg_type_description);
                                html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject i;
                        SubLObject arg_num;
                        SubLObject default_arg_offsets;
                        SubLObject field_name;
                        SubLObject _prev_bind_0_$40;
                        SubLObject _prev_bind_0_$41;
                        for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                            arg_num = add(i, ONE_INTEGER);
                            default_arg_offsets = (NIL != lex_args) ? Mapping.mapcar(symbol_function(STRING_TO_INTEGER), elt(lex_args, i)) : NIL;
                            field_name = format(NIL, $str124$_arg_offset__A, arg_num);
                            if (i.numG(ZERO_INTEGER)) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup($str76$__x2009___x2009_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_create_multiple_selection_listbox(field_name, word_choices, word_offsets, min(TEN_INTEGER, num_words), default_arg_offsets);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject i;
                        SubLObject arg_num;
                        SubLObject arg_offsets;
                        SubLObject span;
                        SubLObject start;
                        SubLObject end;
                        SubLObject arg_phrase;
                        SubLObject all_speech_parts;
                        SubLObject lex_all_speech_parts;
                        SubLObject lex_default_speech_part;
                        SubLObject choice_offset;
                        SubLObject field_name2;
                        SubLObject _prev_bind_0_$43;
                        SubLObject _prev_bind_0_$44;
                        for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                            arg_num = add(i, ONE_INTEGER);
                            arg_offsets = (NIL != lex_args) ? elt(lex_args, i) : NIL;
                            span = (NIL != arg_offsets) ? word_offsets_to_span(arg_offsets) : NIL;
                            start = span.first();
                            end = second(span);
                            arg_phrase = ((NIL != start) && (NIL != end)) ? lexification_utilities.join_words(subseq(word_choices, start, end)) : NIL;
                            all_speech_parts = (NIL != arg_phrase) ? sme_lexification_wizard.rtp_phrase_parts_of_speech(arg_phrase) : default_all_speech_parts;
                            lex_all_speech_parts = Mapping.mapcar(symbol_function(STRING_FOR_FORT), all_speech_parts);
                            lex_default_speech_part = (NIL != lex_speech_parts) ? elt(lex_speech_parts, i) : lex_all_speech_parts.first();
                            choice_offset = position(lex_default_speech_part, lex_all_speech_parts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            field_name2 = format(NIL, $str126$_arg_speech_part__A, arg_num);
                            if (i.numG(ZERO_INTEGER)) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup($str76$__x2009___x2009_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_create_listbox(field_name2, lex_all_speech_parts, lex_all_speech_parts, ONE_INTEGER, choice_offset, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_newline(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject init_parsing_template_lexification(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lex_parse_template_mt = lexification_utilities.string_for_field(lexification_wizard.lexwiz_parse_template_mt(v_object));
        final SubLObject lex_parse_template = lexification_utilities.string_for_field(lexification_wizard.lexwiz_parse_template(v_object));
        html_princ($$$Parse_Template_Specification);
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str101$Mt__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        create_simple_dropdown_list($str128$_parse_template_mt, lexification_wizard.$lexification_template_mts$.getGlobalValue(), lex_parse_template_mt);
        if (NIL != $cb_wrap_interactor$.getDynamicValue(thread)) {
            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str129$_parse_template);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($int$80);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(FIVE_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_wrap$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$virtual);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(lex_parse_template);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        } else {
            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str129$_parse_template);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($int$80);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(FIVE_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(lex_parse_template);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        }
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject init_denotation_lexification(final SubLObject v_object, SubLObject lex_term, SubLObject lex_phrase, SubLObject lex_mt) {
        if (lex_term == UNPROVIDED) {
            lex_term = NIL;
        }
        if (lex_phrase == UNPROVIDED) {
            lex_phrase = NIL;
        }
        if (lex_mt == UNPROVIDED) {
            lex_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lex_words = (NIL != string_utilities.non_empty_stringP(lex_phrase)) ? lexification_utilities.lex_string_tokenize(lex_phrase, NIL) : NIL;
        final SubLObject lex_phrase_len = length(lex_words);
        final SubLObject lex_position = lexification_utilities.string_for_field(lexification_wizard.lexwiz_headword_position(v_object));
        final SubLObject position = lexification_wizard.convert_position(lex_position, lex_phrase_len);
        final SubLObject lex_headword = (position.numG(ZERO_INTEGER)) ? elt(lex_words, subtract(position, ONE_INTEGER)) : $str16$;
        final SubLObject lex_part_of_speech = lexification_utilities.string_for_field(lexification_wizard.lexwiz_headword_part_of_speech(v_object));
        final SubLObject cyc_part_of_speech = misc_kb_utilities.fort_for_string(lex_part_of_speech);
        final SubLObject lex_syntactic_mt = lexification_wizard.lexwiz_syntactic_mt(v_object);
        if (lex_phrase_len.numE(ZERO_INTEGER)) {
            return NIL;
        }
        if (lex_phrase_len.numG(ONE_INTEGER)) {
            final SubLObject is_first = numE(position, ONE_INTEGER);
            final SubLObject is_last = makeBoolean((NIL == is_first) && position.numE(lex_phrase_len));
            final SubLObject is_other = makeBoolean(((NIL != string_utilities.non_empty_stringP(lex_position)) && (NIL == is_first)) && (NIL == is_last));
            if (NIL == html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                final SubLObject color_val = (NIL != string_utilities.non_empty_stringP(lex_position)) ? $BLACK : $BLUE;
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != color_val) {
                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_val));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str132$Headword_position__);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_indent(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
            } else {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str132$Headword_position__);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_indent(UNPROVIDED);
            }
            html_radio_input($str133$_headword_position, $$$First, is_first, UNPROVIDED);
            html_indent(UNPROVIDED);
            html_princ($$$First);
            html_indent(UNPROVIDED);
            html_radio_input($str133$_headword_position, $$$Last, is_last, UNPROVIDED);
            html_indent(UNPROVIDED);
            html_princ($$$Last);
            html_indent(UNPROVIDED);
            if (lex_phrase_len.numG(TWO_INTEGER)) {
                html_radio_input($str133$_headword_position, $$$Other, is_other, UNPROVIDED);
                html_indent(UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str137$Other___a__a__, ONE_INTEGER, lex_phrase_len);
                html_indent(UNPROVIDED);
                html_text_input($str138$_other_position, NIL != is_other ? lex_position : NIL, TWO_INTEGER);
            }
            html_newline(UNPROVIDED);
        }
        if (NIL == html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            final SubLObject color_val2 = (NIL != string_utilities.non_empty_stringP(lex_part_of_speech)) ? $BLACK : $BLUE;
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != color_val2) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(color_val2));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str139$Headword_part_of_speech__);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_indent(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
        } else {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str139$Headword_part_of_speech__);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_indent(UNPROVIDED);
        }
        final SubLObject known_headP = string_utilities.non_empty_stringP(lex_headword);
        final SubLObject head_pos_list = (NIL != known_headP) ? lexicon_accessors.pos_of_string(lex_headword, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        SubLObject cdolist_list_var;
        final SubLObject main_pos_list = cdolist_list_var = (NIL != known_headP) ? head_pos_list : lexification_wizard.$main_lexification_parts_of_speech$.getGlobalValue();
        SubLObject cyc_pos = NIL;
        cyc_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == known_headP) || (NIL != member(cyc_pos, head_pos_list, UNPROVIDED, UNPROVIDED))) {
                final SubLObject pos_name = lexification_utilities.string_for_fort(cyc_pos);
                final SubLObject selected = equal(pos_name, lex_part_of_speech);
                html_radio_input($str140$_headword_part_of_speech, pos_name, selected, UNPROVIDED);
                html_indent(UNPROVIDED);
                html_princ(pos_name);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cyc_pos = cdolist_list_var.first();
        } 
        final SubLObject is_main_posP = member(cyc_part_of_speech, main_pos_list, UNPROVIDED, UNPROVIDED);
        final SubLObject is_other_posP = makeBoolean((NIL != cyc_part_of_speech) && (NIL == is_main_posP));
        html_radio_input($str140$_headword_part_of_speech, $$$Other, is_other_posP, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_princ($$$Other);
        html_indent(UNPROVIDED);
        create_simple_dropdown_list($str141$_choose_part_of_speech, lexification_wizard.$all_lexification_parts_of_speech_labels$.getGlobalValue(), lex_part_of_speech);
        if (NIL != cyc_part_of_speech) {
            final SubLObject is_mappedP = member(cyc_part_of_speech, head_pos_list, UNPROVIDED, UNPROVIDED);
            if (NIL == is_mappedP) {
                html_checkbox_input($str142$_add_syntactic_mapping, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_princ($str143$_Add_mapping_);
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($str144$Mapping_Mt__);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                create_simple_dropdown_list($str145$_syntactic_mt, lexification_wizard.$lexification_mts$.getGlobalValue(), misc_kb_utilities.coerce_name(lex_syntactic_mt));
            }
        }
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject or2(final SubLObject v1, final SubLObject v2) {
        return NIL != v1 ? v1 : v2;
    }

    public static SubLObject or3(final SubLObject v1, final SubLObject v2, final SubLObject v3) {
        return NIL != v1 ? v1 : NIL != v2 ? v2 : NIL != v3 ? v3 : NIL;
    }

    public static SubLObject cb_handle_oe_lexification_wizard(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = html_extract_input($str15$_id, args);
        final SubLObject v_object = lexification_wizard.get_lexification_object(id);
        final SubLObject settings_before = lexification_wizard.copy_lexification_parameters(v_object);
        final SubLObject lex_term = html_extract_input($str81$_cyc_term, args);
        final SubLObject create_termP = html_extract_input($str87$_create_term, args);
        SubLObject cyc_term = or2(misc_kb_utilities.fort_for_string(lex_term), misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(v_object)));
        final SubLObject lex_mt = html_extract_input($str102$_lexification_mt, args);
        final SubLObject mt = or2(misc_kb_utilities.fort_for_string(lex_mt), misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_mt(v_object)));
        final SubLObject raw_lex_phrase = html_extract_input($str90$_phrase, args);
        final SubLObject lex_phrase = string_utilities.trim_whitespace(or3(html_extract_input($str90$_phrase, args), lexification_wizard.lexwiz_phrase(v_object), $str16$));
        final SubLObject lex_is_preferredP = html_extract_boolean($str92$_is_preferred, args, UNPROVIDED);
        final SubLObject lex_is_preciseP = html_extract_input($str95$_is_precise, args);
        final SubLObject lex_is_properP = html_extract_input($str97$_is_proper_name, args);
        final SubLObject nonrelationalP = html_extract_input($str99$_nonrelational, args);
        final SubLObject relationalP = makeBoolean((NIL != lexification_utilities.is_relationalP(cyc_term)) && (NIL == nonrelationalP));
        final SubLObject user_formula = html_extract_input($str107$_user_formula, args);
        final SubLObject user_formula_copy = html_extract_input($str115$_user_formula_copy, args);
        final SubLObject new_user_formula_editP = makeBoolean(((NIL != user_formula) && (NIL != user_formula_copy)) && (!string_utilities.trim_whitespace(user_formula).equal(string_utilities.trim_whitespace(user_formula_copy))));
        final SubLObject resetP = html_extract_input($str34$_reset, args);
        final SubLObject next_actionP = html_extract_input($str55$_next_action, args);
        final SubLObject skip_actionP = html_extract_input($str57$_skip_action, args);
        final SubLObject skip_comment = html_extract_input($str59$_comment, args);
        final SubLObject relexifyP = html_extract_input($str52$_relexify, args);
        SubLObject settings_changedP = NIL;
        SubLObject readyP = NIL;
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(lexification_utilities.$lex_very_detailed$.getGlobalValue())) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str146$cb_handle_oe_lexification_wizard_, args);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        lexification_wizard.trace_lexification_parameters(v_object, lexification_utilities.$lex_very_detailed$.getGlobalValue());
        if (NIL != resetP) {
            lexification_wizard.reset_lexification_parameters(UNPROVIDED);
            return cb_invoke_oe_lexification_wizard(UNPROVIDED);
        }
        if (NIL != next_actionP) {
            return oe_lexify_next_user_action();
        }
        if (NIL != skip_actionP) {
            if (NIL != string_utilities.non_empty_stringP(skip_comment)) {
                ke.ke_assert(list($$cyclistNotes, list($$needsHandLexification, list($$termStrings, cycl_utilities.hl_to_el(cyc_term), lex_phrase)), skip_comment), mt, UNPROVIDED, UNPROVIDED);
            }
            dictionary_utilities.dictionary_push($skipped_lexwiz_terms$.getGlobalValue(), operation_communication.the_cyclist(), cyc_term);
            lexification_reminders.remove_lexification_user_action(v_object, lexification_wizard.lexwiz_user_action(v_object));
            if (NIL == lexification_reminders.valid_lexification_user_actions(UNPROVIDED)) {
                lex_loop(TEN_INTEGER);
            }
            final SubLObject result = oe_lexify_next_user_action();
            return NIL != result ? result : cb_invoke_oe_lexification_wizard(UNPROVIDED);
        }
        lexification_wizard._csetf_lexwiz_error_message(v_object, NIL);
        if (NIL != lex_term) {
            lexification_wizard._csetf_lexwiz_term(v_object, lex_term);
        }
        if (NIL != raw_lex_phrase) {
            lexification_wizard._csetf_lexwiz_phrase(v_object, lex_phrase);
        }
        if (NIL != lex_mt) {
            lexification_wizard._csetf_lexwiz_mt(v_object, lex_mt);
        }
        if (NIL != lex_is_preferredP) {
            lexification_wizard._csetf_lexwiz_is_preferredP(v_object, lex_is_preferredP);
        }
        if (NIL != lex_is_preciseP) {
            lexification_wizard._csetf_lexwiz_is_preferredP(v_object, $PRECISE);
        }
        if (NIL != lex_is_properP) {
            lexification_wizard._csetf_lexwiz_is_properP(v_object, lex_is_properP);
        }
        lexification_wizard._csetf_lexwiz_nonrelationalP(v_object, nonrelationalP);
        if (NIL != create_termP) {
            cyc_term = misc_kb_utilities.find_or_create_nart_from_text(lex_term);
        }
        readyP = lexification_utilities.all_specifiedP(list(lex_term, lex_mt, lex_phrase));
        if ((NIL == readyP) && (lexification_wizard.lexwiz_state(v_object) == $NEED_INPUT)) {
            lexification_wizard._csetf_lexwiz_error_message(v_object, $str150$Missing_information__see_blue_hig);
        } else
            if ((NIL != string_utilities.non_empty_stringP(lex_term)) && (NIL == cyc_term)) {
                lexification_wizard._csetf_lexwiz_error_message(v_object, $$$Invalid_Cyc_term);
            } else
                if ((NIL != string_utilities.non_empty_stringP(lex_mt)) && (NIL == mt)) {
                    lexification_wizard._csetf_lexwiz_error_message(v_object, $$$Invalid_Cyc_MT);
                } else
                    if ((NIL != new_user_formula_editP) || (NIL != lexification_wizard.lexwiz_user_editedP(v_object))) {
                        readyP = handle_user_lexification(v_object, user_formula, args);
                    } else
                        if (NIL != lex_is_properP) {
                            readyP = handle_name_lexification(v_object, cyc_term, lex_phrase, args);
                        } else
                            if (NIL != relationalP) {
                                readyP = handle_relation_lexification(v_object, cyc_term, lex_phrase, args);
                            } else {
                                readyP = handle_denotation_lexification(v_object, cyc_term, lex_phrase, args);
                            }





        if ((((NIL == readyP) && (NIL == lexification_wizard.lexwiz_error_message(v_object))) && (NIL == member(lexification_wizard.lexwiz_state(v_object), $list153, UNPROVIDED, UNPROVIDED))) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str154$Warning__, $str155$____assertion_failed___a______), $list156);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        lexification_wizard._csetf_lexwiz_readyP(v_object, readyP);
        if (NIL != lexification_wizard.lexwiz_settings_changedP(settings_before, v_object)) {
            settings_changedP = T;
        }
        SubLObject doneP = NIL;
        final SubLObject pcase_var = lexification_wizard.lexwiz_state(v_object);
        if (pcase_var.eql($FRESH) || pcase_var.eql($NEED_INPUT)) {
            if ((NIL != lexification_wizard.lexwiz_readyP(v_object)) && (NIL == lexification_wizard.lexwiz_error_message(v_object))) {
                lexification_wizard._csetf_lexwiz_state(v_object, $NEED_APPROVAL);
            } else {
                lexification_wizard._csetf_lexwiz_state(v_object, $NEED_INPUT);
            }
        } else
            if (pcase_var.eql($NEED_APPROVAL)) {
                if (NIL == settings_changedP) {
                    lexification_wizard._csetf_lexwiz_state(v_object, $DONE);
                }
            } else
                if (pcase_var.eql($DONE)) {
                    if (NIL != settings_changedP) {
                        lexification_wizard._csetf_lexwiz_state(v_object, $NEED_APPROVAL);
                    } else {
                        doneP = lexification_wizard.perform_lexification(v_object);
                    }
                }


        if ((NIL == lexification_wizard.lexwiz_error_message(v_object)) && (NIL != lexification_wizard.lexwiz_formula(v_object))) {
            lexification_wizard._csetf_lexwiz_error_message(v_object, lexification_utilities.invalid_lexificationP(lexification_wizard.lexwiz_formula(v_object), mt));
        }
        if ((NIL != $streamlined_lexwizP$.getGlobalValue()) && (lexification_wizard.lexwiz_state(v_object) == $NEED_APPROVAL)) {
            lexification_wizard._csetf_lexwiz_state(v_object, $DONE);
        }
        if (NIL != lexification_wizard.lexwiz_error_message(v_object)) {
            lexification_wizard._csetf_lexwiz_state(v_object, $NEED_APPROVAL);
        }
        lexification_wizard.trace_lexification_parameters(v_object, lexification_utilities.$lex_verbose$.getGlobalValue());
        if (NIL != doneP) {
            report_lexification_result(v_object, cyc_term, lex_phrase, mt, relexifyP);
            lexification_wizard.reset_lexification_parameters(v_object);
            lexification_wizard.reset_lexification_parameters(UNPROVIDED);
        } else {
            cb_invoke_oe_lexification_wizard(args);
        }
        return T;
    }

    public static SubLObject report_lexification_result(final SubLObject v_object, final SubLObject cyc_term, final SubLObject lex_phrase, final SubLObject lex_mt, final SubLObject relexifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constant_p(cyc_term)) {
            cb_tools.cb_add_to_constant_history(cyc_term);
        } else
            if (NIL != nart_handles.nart_p(cyc_term)) {
                cb_tools.cb_add_to_nat_history(cyc_term);
            }

        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lex_mt, thread);
            final SubLObject lex_term = misc_kb_utilities.coerce_name(lexification_wizard.lexwiz_term(v_object));
            SubLObject display_phrase = lex_phrase;
            SubLObject title = $str158$Post_lexification_error;
            SubLObject messages = NIL;
            SubLObject error_msg = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0_$45 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (NIL != lexification_wizard.lexwiz_user_formula(v_object)) {
                            display_phrase = lexification_utilities.phrases_from_lexification_sentence(lexification_wizard.lexwiz_formula(v_object), UNPROVIDED);
                        }
                        final SubLObject confirmedP = makeBoolean((NIL != lexification_utilities.is_relationalP(cyc_term)) || (NIL != subl_promotions.memberP(cyc_term, lexicon_accessors.denots_of_string(display_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)));
                        if (NIL != confirmedP) {
                            final SubLObject other_ways = lexification_utilities.other_lexified_phrases_for_term(cyc_term, display_phrase);
                            title = format(NIL, $str160$Lexification_successful_for__a, lex_term);
                            messages = list(format(NIL, $str161$Added__s_, display_phrase), $str16$);
                            if (NIL != other_ways) {
                                nconc(messages, list(format(NIL, $str162$Other_ways_of_referring_to__a_, lex_term)));
                                SubLObject cdolist_list_var = other_ways;
                                SubLObject other_way = NIL;
                                other_way = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    nconc(messages, list(format(NIL, $str163$_____a, other_way)));
                                    cdolist_list_var = cdolist_list_var.rest();
                                    other_way = cdolist_list_var.first();
                                } 
                            } else {
                                nconc(messages, list(format(NIL, $str164$No_other_ways_of_referring_to__a, lex_term)));
                            }
                        } else {
                            messages = list(format(NIL, $str165$Unable_to_confirm_lexification___, display_phrase, cyc_term));
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$45, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != error_msg) {
                messages = list($str166$Internal_error_during_lexificatio, error_msg);
            }
            if (NIL != relexifyP) {
                lexification_reminders.add_lexification_todo(cyc_term, api_control_vars.$the_cyclist$.getDynamicValue(thread), display_phrase, UNPROVIDED);
            } else {
                mark_term_lexified(cyc_term);
                if (NIL == lexification_reminders.valid_lexification_user_actions(UNPROVIDED)) {
                    lex_loop(UNPROVIDED);
                }
            }
            if (NIL != lexification_reminders.lexification_user_actions(UNPROVIDED)) {
                oe_lexify_next_user_action();
            } else {
                cb_titled_message_page_with_history(title, messages, T);
            }
            return NIL;
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject handle_name_lexification(final SubLObject v_object, final SubLObject cyc_term, final SubLObject lex_phrase, final SubLObject args) {
        final SubLObject lex_predicate = html_extract_string($str117$_lexification_predicate, args, lexification_wizard.lexwiz_proper_name_pred(v_object));
        final SubLObject cyc_predicate = misc_kb_utilities.fort_for_string(lex_predicate);
        final SubLObject all_readyP = lexification_utilities.all_specifiedP(list(cyc_term, lex_phrase, cyc_predicate));
        lexification_wizard._csetf_lexwiz_proper_name_pred(v_object, lex_predicate);
        if (NIL != all_readyP) {
            lexification_wizard.derive_proper_name_formula(v_object);
        }
        return all_readyP;
    }

    public static SubLObject handle_relation_lexification(final SubLObject v_object, final SubLObject cyc_term, final SubLObject lex_phrase, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arity = (NIL != cyc_term) ? lexification_utilities.lex_arity_in_any_mt(cyc_term) : ZERO_INTEGER;
        final SubLObject lex_arg_offsets = extract_arg_specs(v_arity, $str168$_arg_offset_, args, T);
        final SubLObject lex_arg_spans = Mapping.mapcar(symbol_function(WORD_OFFSETS_TO_SPAN), lex_arg_offsets);
        final SubLObject lex_arg_speech_parts = extract_arg_specs(v_arity, $str170$_arg_speech_part_, args, UNPROVIDED);
        final SubLObject arg_speech_parts = Mapping.mapcar(symbol_function(FORT_FOR_STRING), lex_arg_speech_parts);
        final SubLObject lex_template = (lexification_wizard.lexwiz_state(v_object) == $FRESH) ? NIL : derive_relational_template(v_object, lex_arg_spans, arg_speech_parts);
        final SubLObject all_readyP = lexification_utilities.all_specifiedP(list(cyc_term, lex_phrase, lex_template, lex_arg_offsets, lex_arg_speech_parts));
        if (lexification_wizard.lexwiz_mt(v_object).equal(lexicon_vars.$default_lexification_mt$.getDynamicValue(thread)) && (lexification_wizard.lexwiz_state(v_object) == $FRESH)) {
            lexification_wizard._csetf_lexwiz_mt(v_object, lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread));
        }
        lexification_wizard._csetf_lexwiz_template(v_object, lex_template);
        lexification_wizard._csetf_lexwiz_template_args(v_object, lex_arg_offsets);
        lexification_wizard._csetf_lexwiz_template_speech_parts(v_object, lex_arg_speech_parts);
        if ((lexification_wizard.lexwiz_state(v_object) != $FRESH) && (NIL == list_utilities.flatten(lex_arg_offsets))) {
            lexification_wizard._csetf_lexwiz_error_message(v_object, $str172$The_relation_arguments_must_be_sp);
        }
        if ((NIL != all_readyP) && (NIL == lexification_wizard.lexwiz_error_message(v_object))) {
            lexification_wizard.derive_relation_formula(v_object);
        }
        return all_readyP;
    }

    public static SubLObject extract_arg_specs(final SubLObject num, final SubLObject field_basename, final SubLObject args, SubLObject multipleP) {
        if (multipleP == UNPROVIDED) {
            multipleP = NIL;
        }
        SubLObject arg_specs = NIL;
        SubLObject i;
        SubLObject arg_num;
        SubLObject field_name;
        SubLObject field_values;
        SubLObject field_value;
        for (i = NIL, i = ZERO_INTEGER; i.numL(num); i = add(i, ONE_INTEGER)) {
            arg_num = add(i, ONE_INTEGER);
            field_name = format(NIL, $str173$_A_A, field_basename, arg_num);
            field_values = html_extract_input_values(field_name, args);
            field_value = (NIL != multipleP) ? field_values : field_values.first();
            arg_specs = cons(field_value, arg_specs);
        }
        return nreverse(arg_specs);
    }

    public static SubLObject word_offsets_to_span(final SubLObject word_offsets) {
        SubLObject start = NIL;
        SubLObject end = NIL;
        if (NIL != word_offsets) {
            final SubLObject offsets = Sort.sort(Mapping.mapcar(symbol_function(EXTRACT_INTEGER), word_offsets), symbol_function($sym175$_), UNPROVIDED);
            start = offsets.first();
            end = number_utilities.f_1X(list_utilities.last_one(offsets));
        }
        return list(start, end);
    }

    public static SubLObject derive_relational_template(final SubLObject v_object, final SubLObject arg_spans, final SubLObject arg_speech_parts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(v_object));
        final SubLObject sentence_words = lexification_utilities.lex_string_tokenize(lexification_wizard.lexwiz_phrase(v_object), T);
        SubLObject generation_template = NIL;
        SubLObject error_msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject parse_template = relation_lexifier.lexify_relation(cyc_term, arg_spans, sentence_words, arg_speech_parts, UNPROVIDED, UNPROVIDED);
                    final SubLObject new_generation_template = thread.secondMultipleValue();
                    final SubLObject old_generation_template = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    generation_template = new_generation_template;
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if ((NIL != error_msg) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str176$Problem_deriving_relation_templat, error_msg);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        lexification_wizard._csetf_lexwiz_error_message(v_object, error_msg);
        return generation_template;
    }

    public static SubLObject handle_parsing_template_lexification(final SubLObject v_object, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lex_parse_template_mt = html_extract_string($str128$_parse_template_mt, args, lexicon_vars.$default_lexification_template_mt$.getDynamicValue(thread));
        final SubLObject lex_parse_template = html_extract_string($str129$_parse_template, args, UNPROVIDED);
        lexification_wizard.trace_lexification_parameters(v_object, UNPROVIDED);
        lexification_wizard._csetf_lexwiz_parse_template_mt(v_object, lex_parse_template_mt);
        lexification_wizard._csetf_lexwiz_parse_template(v_object, lex_parse_template);
        lexification_wizard.trace_lexification_parameters(v_object, UNPROVIDED);
        if (NIL != string_utilities.non_empty_stringP(lex_parse_template)) {
            lexification_wizard.derive_parse_template_formula(v_object);
        }
        return T;
    }

    public static SubLObject handle_denotation_lexification(final SubLObject v_object, final SubLObject cyc_term, final SubLObject lex_phrase, final SubLObject args) {
        final SubLObject lex_words = (NIL != string_utilities.non_empty_stringP(lex_phrase)) ? lexification_utilities.lex_string_tokenize(lex_phrase, NIL) : NIL;
        final SubLObject lex_phrase_len = length(lex_words);
        SubLObject lex_position = html_extract_string($str133$_headword_position, args, UNPROVIDED);
        SubLObject lex_part_of_speech = html_extract_string($str140$_headword_part_of_speech, args, UNPROVIDED);
        final SubLObject other_part_of_speech = html_extract_string($str141$_choose_part_of_speech, args, UNPROVIDED);
        final SubLObject add_syntactic_mappingP = html_extract_input($str142$_add_syntactic_mapping, args);
        final SubLObject syntactic_mt = misc_kb_utilities.fort_for_string(html_extract_input($str145$_syntactic_mt, args));
        SubLObject all_readyP = NIL;
        if (lex_position.equal($$$Other) || (NIL != lexification_utilities.lex_empty_stringP(lex_position))) {
            lex_position = html_extract_string($str138$_other_position, args, UNPROVIDED);
        }
        if (lex_position.equal($str16$) && lex_phrase_len.numE(ONE_INTEGER)) {
            lex_position = $$$1;
        }
        final SubLObject position = lexification_wizard.convert_position(lex_position, lex_phrase_len);
        final SubLObject lex_headword = (position.numG(ZERO_INTEGER)) ? elt(lex_words, subtract(position, ONE_INTEGER)) : $str16$;
        if (lex_part_of_speech.equal($$$Other) || (NIL != lexification_utilities.lex_empty_stringP(lex_part_of_speech))) {
            lex_part_of_speech = other_part_of_speech;
        }
        if (position.numG(MINUS_ONE_INTEGER)) {
            lexification_wizard._csetf_lexwiz_headword_position(v_object, position);
        }
        lexification_wizard._csetf_lexwiz_headword_part_of_speech(v_object, lex_part_of_speech);
        if ((NIL != add_syntactic_mappingP) && (NIL != string_utilities.non_empty_stringP(lex_headword))) {
            lexification_wizard.add_lexical_mapping(lex_headword, misc_kb_utilities.fort_for_string(lex_part_of_speech), syntactic_mt, UNPROVIDED);
        }
        all_readyP = lexification_utilities.all_specifiedP(list(lex_position, lex_part_of_speech));
        if (NIL != all_readyP) {
            lexification_wizard.derive_denotation_formula(v_object);
        }
        return all_readyP;
    }

    public static SubLObject handle_user_lexification(final SubLObject v_object, SubLObject user_formula, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == user_formula) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str154$Warning__, $str155$____assertion_failed___a______), USER_FORMULA);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        SubLObject readyP = NIL;
        if (NIL != string_utilities.empty_stringP(string_utilities.trim_whitespace(user_formula))) {
            user_formula = NIL;
            lexification_wizard._csetf_lexwiz_user_editedP(v_object, NIL);
            lexification_wizard._csetf_lexwiz_user_formula(v_object, NIL);
            lexification_wizard._csetf_lexwiz_formula(v_object, NIL);
            lexification_wizard._csetf_lexwiz_state(v_object, $NEED_APPROVAL);
        }
        if (NIL != user_formula) {
            thread.resetMultipleValues();
            final SubLObject new_formula = cb_form_widgets.cb_extract_el_formula_input(args, $list179);
            final SubLObject formula_error = thread.secondMultipleValue();
            final SubLObject formula_error_string = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != formula_error) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), $str180$Error_in_formula___a__, formula_error);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
                lexification_wizard._csetf_lexwiz_user_editedP(v_object, T);
                lexification_wizard._csetf_lexwiz_user_formula(v_object, user_formula);
                lexification_wizard._csetf_lexwiz_formula(v_object, NIL);
                lexification_wizard._csetf_lexwiz_error_message(v_object, format(NIL, $str181$_a_in__a, formula_error, formula_error_string));
            } else {
                if (!lexification_wizard.lexwiz_formula(v_object).equalp(new_formula)) {
                    lexification_wizard._csetf_lexwiz_user_editedP(v_object, T);
                    lexification_wizard._csetf_lexwiz_user_formula(v_object, user_formula);
                    lexification_wizard._csetf_lexwiz_formula(v_object, new_formula);
                }
                readyP = T;
            }
        }
        return readyP;
    }

    public static SubLObject oe_lexify_next_user_action() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$use_sme_lexwiz$.currentBinding(thread);
        try {
            lexicon_vars.$use_sme_lexwiz$.bind(NIL, thread);
            if (NIL == lexification_reminders.valid_lexification_user_actions(UNPROVIDED)) {
                lex_loop(UNPROVIDED);
            }
            result = lexification_reminders.lexify_next_user_action(UNPROVIDED);
        } finally {
            lexicon_vars.$use_sme_lexwiz$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject lex_loop(SubLObject number_of_terms) {
        if (number_of_terms == UNPROVIDED) {
            number_of_terms = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == lexification_reminders.lexification_user_actions(api_control_vars.$the_cyclist$.getDynamicValue(thread))) {
            SubLObject cdolist_list_var;
            final SubLObject list_of_terms = cdolist_list_var = query_for_terms(number_of_terms);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                lexification_reminders.add_lexification_todo(v_term.first(), api_control_vars.$the_cyclist$.getDynamicValue(thread), second(v_term), UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject query_for_terms(final SubLObject number_of_results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_terms = ask_utilities.query_variable($sym182$_TERM, list($$myCreationPurpose, $sym182$_TERM, fi.ke_purpose()), $$BookkeepingMt, UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return filter_lexification_terms(Sort.sort(raw_terms, symbol_function($sym185$_), FACT_SHEET_TERM_GAF_PRIORITY), number_of_results, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject filter_lexification_terms(final SubLObject raw_terms, final SubLObject desired_count, SubLObject ignore_need_lex_flagP) {
        if (ignore_need_lex_flagP == UNPROVIDED) {
            ignore_need_lex_flagP = NIL;
        }
        lexicon_utilities.clear_cached_lexifications_for_term();
        SubLObject unlexified_terms = NIL;
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = raw_terms;
            SubLObject v_term = NIL;
            v_term = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if ((NIL != lexification_utilities.unlexifiedP(v_term, UNPROVIDED)) && (NIL == subl_promotions.memberP(v_term, dictionary.dictionary_lookup_without_values($skipped_lexwiz_terms$.getGlobalValue(), operation_communication.the_cyclist(), NIL), UNPROVIDED, UNPROVIDED))) {
                    final SubLObject term_string = pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    unlexified_terms = cons(list(v_term, term_string), unlexified_terms);
                    if ((desired_count != NIL) && length(unlexified_terms).numGE(desired_count)) {
                        doneP = T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            } 
        }
        return unlexified_terms;
    }

    public static SubLObject add_terms_of_type(final SubLObject type, SubLObject ignore_need_lex_flagP) {
        if (ignore_need_lex_flagP == UNPROVIDED) {
            ignore_need_lex_flagP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_terms = isa.all_fort_instances(type, $$InferencePSC, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject filtered_terms_and_strings = cdolist_list_var = filter_lexification_terms(raw_terms, NIL, ignore_need_lex_flagP);
        SubLObject term_and_string = NIL;
        term_and_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = term_and_string;
            SubLObject cycl_term = NIL;
            SubLObject string = NIL;
            destructuring_bind_must_consp(current, datum, $list188);
            cycl_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list188);
            string = current.first();
            current = current.rest();
            if (NIL == current) {
                lexification_reminders.add_lexification_todo(cycl_term, api_control_vars.$the_cyclist$.getDynamicValue(thread), string, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list188);
            }
            cdolist_list_var = cdolist_list_var.rest();
            term_and_string = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject mark_term_lexified(final SubLObject v_term) {
        if (NIL == set.set_p($known_lexified_terms$.getGlobalValue())) {
            $known_lexified_terms$.setGlobalValue(set.new_set(EQUAL, UNPROVIDED));
        }
        return set.set_add(v_term, $known_lexified_terms$.getGlobalValue());
    }

    public static SubLObject term_known_lexifiedP(final SubLObject v_term) {
        return set.set_memberP(v_term, $known_lexified_terms$.getGlobalValue());
    }

    public static SubLObject cb_print_sec_assertions(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sec_assertions = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, $$synonymousExternalConcept, narts_high.nart_substitute($list191), UNPROVIDED);
        if (NIL != sec_assertions) {
            SubLObject cdolist_list_var = sec_assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($str192$Mt__);
                cb_form(assertions_high.assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                cb_show_assertion_readably(assertion, $cb_c_wrap_assertions$.getDynamicValue(thread), NIL);
                html_newline(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject declare_cb_lexification_wizard_file() {
        declareFunction(me, "cb_link_lexification_wizard", "CB-LINK-LEXIFICATION-WIZARD", 0, 1, false);
        declareMacro(me, "cond_html_font_color", "COND-HTML-FONT-COLOR");
        declareFunction(me, "cb_invoke_oe_lexification_wizard", "CB-INVOKE-OE-LEXIFICATION-WIZARD", 0, 1, false);
        declareFunction(me, "show_lexwiz_stages_diagram", "SHOW-LEXWIZ-STAGES-DIAGRAM", 1, 0, false);
        declareFunction(me, "init_basic_lexification", "INIT-BASIC-LEXIFICATION", 4, 0, false);
        declareFunction(me, "init_formula_lexification", "INIT-FORMULA-LEXIFICATION", 1, 0, false);
        declareFunction(me, "init_name_lexification", "INIT-NAME-LEXIFICATION", 4, 0, false);
        declareFunction(me, "init_relation_lexification", "INIT-RELATION-LEXIFICATION", 4, 0, false);
        declareFunction(me, "init_parsing_template_lexification", "INIT-PARSING-TEMPLATE-LEXIFICATION", 1, 0, false);
        declareFunction(me, "init_denotation_lexification", "INIT-DENOTATION-LEXIFICATION", 1, 3, false);
        declareFunction(me, "or2", "OR2", 2, 0, false);
        declareFunction(me, "or3", "OR3", 3, 0, false);
        declareFunction(me, "cb_handle_oe_lexification_wizard", "CB-HANDLE-OE-LEXIFICATION-WIZARD", 1, 0, false);
        declareFunction(me, "report_lexification_result", "REPORT-LEXIFICATION-RESULT", 5, 0, false);
        declareFunction(me, "handle_name_lexification", "HANDLE-NAME-LEXIFICATION", 4, 0, false);
        declareFunction(me, "handle_relation_lexification", "HANDLE-RELATION-LEXIFICATION", 4, 0, false);
        declareFunction(me, "extract_arg_specs", "EXTRACT-ARG-SPECS", 3, 1, false);
        declareFunction(me, "word_offsets_to_span", "WORD-OFFSETS-TO-SPAN", 1, 0, false);
        declareFunction(me, "derive_relational_template", "DERIVE-RELATIONAL-TEMPLATE", 3, 0, false);
        declareFunction(me, "handle_parsing_template_lexification", "HANDLE-PARSING-TEMPLATE-LEXIFICATION", 2, 0, false);
        declareFunction(me, "handle_denotation_lexification", "HANDLE-DENOTATION-LEXIFICATION", 4, 0, false);
        declareFunction(me, "handle_user_lexification", "HANDLE-USER-LEXIFICATION", 3, 0, false);
        declareFunction(me, "oe_lexify_next_user_action", "OE-LEXIFY-NEXT-USER-ACTION", 0, 0, false);
        declareFunction(me, "lex_loop", "LEX-LOOP", 0, 1, false);
        declareFunction(me, "query_for_terms", "QUERY-FOR-TERMS", 1, 0, false);
        declareFunction(me, "filter_lexification_terms", "FILTER-LEXIFICATION-TERMS", 2, 1, false);
        declareFunction(me, "add_terms_of_type", "ADD-TERMS-OF-TYPE", 1, 1, false);
        declareFunction(me, "mark_term_lexified", "MARK-TERM-LEXIFIED", 1, 0, false);
        declareFunction(me, "term_known_lexifiedP", "TERM-KNOWN-LEXIFIED?", 1, 0, false);
        declareFunction(me, "cb_print_sec_assertions", "CB-PRINT-SEC-ASSERTIONS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_lexification_wizard_file() {
        deflexical("*SKIPPED-LEXWIZ-TERMS*", SubLTrampolineFile.maybeDefault($skipped_lexwiz_terms$, $skipped_lexwiz_terms$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
        deflexical("*STREAMLINED-LEXWIZ?*", SubLTrampolineFile.maybeDefault($sym1$_STREAMLINED_LEXWIZ__, $streamlined_lexwizP$, NIL));
        deflexical("*KNOWN-LEXIFIED-TERMS*", SubLTrampolineFile.maybeDefault($known_lexified_terms$, $known_lexified_terms$, () -> set.new_set(EQUAL, UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_cb_lexification_wizard_file() {
        declare_defglobal($skipped_lexwiz_terms$);
        declare_defglobal($sym1$_STREAMLINED_LEXWIZ__);
        setup_cb_link_method($LEXIFICATION_WIZARD, CB_LINK_LEXIFICATION_WIZARD, ONE_INTEGER);
        sethash($LEXWIZ, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str8$lexwiz_html, NIL));
        html_macros.note_cgi_handler_function(CB_INVOKE_OE_LEXIFICATION_WIZARD, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_OE_LEXIFICATION_WIZARD, $HTML_HANDLER);
        declare_defglobal($known_lexified_terms$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_lexification_wizard_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_lexification_wizard_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_lexification_wizard_file();
    }

    static {





































































































































































































    }
}

/**
 * Total time: 979 ms
 */
