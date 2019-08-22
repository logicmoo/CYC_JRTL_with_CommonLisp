package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_wrap_interactor$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_utilities.cb_decode_fort_list_selector_result;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_list_none_selected_p;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_list_selector;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input_values;
import static com.cyc.cycjava.cycl.html_utilities.html_format_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_radio_input;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class cb_formula_templates extends SubLTranslatedFile {
    public static final SubLFile me = new cb_formula_templates();

    public static final String myName = "com.cyc.cycjava.cycl.cb_formula_templates";

    public static final String myFingerPrint = "2e8d2a7f8fea1cd4b0dfc8a4fab93b710885ecf56c8a0ced3cbfa9b3f2379296";

    // defconstant
    public static final SubLSymbol $dtp_formula_template_editing_state$ = makeSymbol("*DTP-FORMULA-TEMPLATE-EDITING-STATE*");







    // Internal Constants
    public static final SubLSymbol FORMULA_TEMPLATE_EDITING_STATE = makeSymbol("FORMULA-TEMPLATE-EDITING-STATE");

    public static final SubLSymbol FORMULA_TEMPLATE_EDITING_STATE_P = makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-P");

    public static final SubLList $list2 = list(makeSymbol("PHASE"), makeSymbol("FORMULA-TEMPLATE"), makeSymbol("BASE-ASSERTION"), makeSymbol("CURRENT-EDIT-PROBLEMS"), makeSymbol("TARGET-MT"), makeSymbol("HIGHER-PRIORITY-TEMPLATE"), makeSymbol("BASE-FORMULA"));

    public static final SubLList $list3 = list(makeKeyword("PHASE"), makeKeyword("FORMULA-TEMPLATE"), makeKeyword("BASE-ASSERTION"), makeKeyword("CURRENT-EDIT-PROBLEMS"), makeKeyword("TARGET-MT"), makeKeyword("HIGHER-PRIORITY-TEMPLATE"), makeKeyword("BASE-FORMULA"));

    public static final SubLList $list4 = list(makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-PHASE"), makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-FORMULA-TEMPLATE"), makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-BASE-ASSERTION"), makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-CURRENT-EDIT-PROBLEMS"), makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-TARGET-MT"), makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-HIGHER-PRIORITY-TEMPLATE"), makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-BASE-FORMULA"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-PHASE"), makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-FORMULA-TEMPLATE"), makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-BASE-ASSERTION"), makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-CURRENT-EDIT-PROBLEMS"), makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-TARGET-MT"), makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-HIGHER-PRIORITY-TEMPLATE"), makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-BASE-FORMULA"));



    public static final SubLSymbol FORMULA_TEMPLATE_EDITING_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-P"));

    private static final SubLSymbol FORMULA_TEMPLATE_EDITING_STATE_PHASE = makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-PHASE");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_EDITING_STATE_PHASE = makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-PHASE");

    private static final SubLSymbol FORMULA_TEMPLATE_EDITING_STATE_FORMULA_TEMPLATE = makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-FORMULA-TEMPLATE");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_EDITING_STATE_FORMULA_TEMPLATE = makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-FORMULA-TEMPLATE");

    private static final SubLSymbol FORMULA_TEMPLATE_EDITING_STATE_BASE_ASSERTION = makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-BASE-ASSERTION");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_EDITING_STATE_BASE_ASSERTION = makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-BASE-ASSERTION");

    private static final SubLSymbol FORMULA_TEMPLATE_EDITING_STATE_CURRENT_EDIT_PROBLEMS = makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-CURRENT-EDIT-PROBLEMS");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_EDITING_STATE_CURRENT_EDIT_PROBLEMS = makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-CURRENT-EDIT-PROBLEMS");

    private static final SubLSymbol FORMULA_TEMPLATE_EDITING_STATE_TARGET_MT = makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-TARGET-MT");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_EDITING_STATE_TARGET_MT = makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-TARGET-MT");

    private static final SubLSymbol FORMULA_TEMPLATE_EDITING_STATE_HIGHER_PRIORITY_TEMPLATE = makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-HIGHER-PRIORITY-TEMPLATE");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_EDITING_STATE_HIGHER_PRIORITY_TEMPLATE = makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-HIGHER-PRIORITY-TEMPLATE");

    private static final SubLSymbol FORMULA_TEMPLATE_EDITING_STATE_BASE_FORMULA = makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-BASE-FORMULA");

    private static final SubLSymbol _CSETF_FORMULA_TEMPLATE_EDITING_STATE_BASE_FORMULA = makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-BASE-FORMULA");







    private static final SubLSymbol $CURRENT_EDIT_PROBLEMS = makeKeyword("CURRENT-EDIT-PROBLEMS");



    private static final SubLSymbol $HIGHER_PRIORITY_TEMPLATE = makeKeyword("HIGHER-PRIORITY-TEMPLATE");



    private static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_FORMULA_TEMPLATE_EDITING_STATE = makeSymbol("MAKE-FORMULA-TEMPLATE-EDITING-STATE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FORMULA_TEMPLATE_EDITING_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORMULA-TEMPLATE-EDITING-STATE-METHOD");



    public static final SubLSymbol $cb_current_formula_template_editing_state$ = makeSymbol("*CB-CURRENT-FORMULA-TEMPLATE-EDITING-STATE*");

    public static final SubLSymbol $cb_current_formula_template_subtopic$ = makeSymbol("*CB-CURRENT-FORMULA-TEMPLATE-SUBTOPIC*");

    public static final SubLSymbol $cb_current_formula_template_parent_mt$ = makeSymbol("*CB-CURRENT-FORMULA-TEMPLATE-PARENT-MT*");

    private static final SubLString $$$Formula_Template_Editor = makeString("Formula Template Editor");

    private static final SubLString $str41$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str42$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str47$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");





    private static final SubLSymbol CB_FORMULA_TEMPLATES = makeSymbol("CB-FORMULA-TEMPLATES");



    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str57$cb_formula_template_restart_with_ = makeString("cb-formula-template-restart-with-clean-state");

    private static final SubLString $$$Restart = makeString("Restart");

    private static final SubLString $str59$cb_build_formula_template_basics = makeString("cb-build-formula-template-basics");

    private static final SubLString $$$Create = makeString("Create");

    private static final SubLString $str61$Please_select_the_assertion_you_w = makeString("Please select the assertion you wish to use as the basis for the formula template,\n      or enter an EL formula that you wish to use instead. Choose ONE focal term by \n      clicking the appropriate radio button under the argument position.\n      Check any of the arguments you wish to be editable in the final template.");





    private static final SubLString $str64$assertion_id = makeString("assertion_id");





    private static final SubLString $str67$Enter_a_formula_to_use_as_the_bas = makeString("Enter a formula to use as the basis: ");

    private static final SubLString $str68$base_el_formula = makeString("base_el_formula");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $str70$cb_formula_template_use_base_el_f = makeString("cb-formula-template-use-base-el-formula");

    private static final SubLString $$$Use_Formula = makeString("Use Formula");

    private static final SubLSymbol CB_FORMULA_TEMPLATE_USE_BASE_EL_FORMULA = makeSymbol("CB-FORMULA-TEMPLATE-USE-BASE-EL-FORMULA");

    private static final SubLString $str73$Assertion__ = makeString("Assertion: ");



    private static final SubLString $str75$Focal_Term__ = makeString("Focal Term: ");

    private static final SubLString $str76$focal_term_argnum = makeString("focal_term_argnum");

    private static final SubLString $str77$Replacable_Position__ = makeString("Replacable Position: ");

    private static final SubLString $str78$editable_argnum = makeString("editable_argnum");

    private static final SubLString $str79$Require_Validation__ = makeString("Require Validation: ");

    private static final SubLString $str80$validreq_argnum = makeString("validreq_argnum");

    private static final SubLString $str81$Hide_Replacements__ = makeString("Hide Replacements: ");

    private static final SubLString $str82$replaceinvis_argnum = makeString("replaceinvis_argnum");

    private static final SubLString $str83$Template_Name_ = makeString("Template Name:");

    private static final SubLString $str84$template_name = makeString("template_name");

    private static final SubLString $str85$Template_id_is_a__A_ = makeString("Template id is a ~A.");

    private static final SubLString $str86$ = makeString("");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $str88$Parent_Subtopic_ = makeString("Parent Subtopic:");

    private static final SubLString $str89$parent_topic_id = makeString("parent_topic_id");

    private static final SubLString $str90$Create_Template_in_ELMt__ = makeString("Create Template in ELMt: ");

    private static final SubLString $str91$target_elmt = makeString("target_elmt");

    private static final SubLSymbol CB_BUILD_FORMULA_TEMPLATE_BASICS = makeSymbol("CB-BUILD-FORMULA-TEMPLATE-BASICS");

    private static final SubLString $str93$Update_Error_s_ = makeString("Update Error(s)");

    private static final SubLString $str94$The_following_error_s__occurred_d = makeString("The following error(s) occurred during the update:");

    private static final SubLString $str95$cb_edit_formula_template_contents = makeString("cb-edit-formula-template-contents");

    private static final SubLString $str96$Update_or_edit_any_of_the_formula = makeString("Update or edit any of the formula template properties below; use the ");

    private static final SubLString $str97$_Change_ = makeString("[Change]");

    private static final SubLString $str98$_button_to_update_the_fields__Onc = makeString(" button to update the fields. Once you are ready, hit ");

    private static final SubLString $str99$_Assert_ = makeString("[Assert]");

    private static final SubLString $str100$_to_put_the_information_into_the_ = makeString(" to put the information into the KB.");

    private static final SubLString $$$Change = makeString("Change");

    private static final SubLString $$$change = makeString("change");

    private static final SubLString $$$Start_Over = makeString("Start Over");

    private static final SubLString $str104$start_over = makeString("start_over");

    private static final SubLString $$$Assert = makeString("Assert");

    private static final SubLString $$$assert = makeString("assert");

    private static final SubLSymbol CB_EDIT_FORMULA_TEMPLATE_CONTENTS = makeSymbol("CB-EDIT-FORMULA-TEMPLATE-CONTENTS");

    private static final SubLString $str108$The_template_must_have_a_name_ = makeString("The template must have a name.");

    private static final SubLString $str109$formula_arg__D = makeString("formula_arg_~D");



    private static final SubLString $str111$Cannot_parse_formula_template_arg = makeString("Cannot parse formula template argument ");

    private static final SubLString $str112$_ = makeString(":");

    private static final SubLString $$$elmt = makeString("elmt");

    private static final SubLString $str114$Cannot_interpret_template_ELMt__ = makeString("Cannot interpret template ELMt: ");

    private static final SubLString $str115$single_entry = makeString("single_entry");

    private static final SubLObject $$SingleAssertionEntry = reader_make_constant_shell(makeString("SingleAssertionEntry"));

    private static final SubLObject $$MultipleAssertionEntry = reader_make_constant_shell(makeString("MultipleAssertionEntry"));

    private static final SubLString $str118$higher_priority = makeString("higher_priority");

    private static final SubLString $str119$template_example = makeString("template_example");

    private static final SubLString $str120$argpos__D = makeString("argpos_~D");

    private static final SubLString $str121$Cannot_interpret_formula_argument = makeString("Cannot interpret formula argument position expression ");

    private static final SubLString $str122$__ = makeString(": ");

    private static final SubLObject $$FormulaArgPositionFn = reader_make_constant_shell(makeString("FormulaArgPositionFn"));

    private static final SubLString $str124$argpos_order__D = makeString("argpos_order_~D");

    private static final SubLString $str125$Invalid_ordering_value_specified_ = makeString("Invalid ordering value specified for argument position ");

    private static final SubLString $str126$argpos_explanation__D = makeString("argpos_explanation_~D");

    private static final SubLString $str127$argpos_gloss__D = makeString("argpos_gloss_~D");

    private static final SubLString $str128$argpos_candidate_replacement__D_ = makeString("argpos_candidate_replacement_~D_");

    private static final SubLString $str129$Cannot_interpret_candidate_replac = makeString("Cannot interpret candidate replacement number ");

    private static final SubLString $$$_for_argument_position_ = makeString(" for argument position ");

    private static final SubLString $str131$___ = makeString(" : ");

    private static final SubLString $str132$Original_Assertion__ = makeString("Original Assertion: ");

    private static final SubLString $str133$Formula__ = makeString("Formula: ");

    private static final SubLString $str134$Argument__ = makeString("Argument #");

    private static final SubLString $str135$formula_arg_ = makeString("formula_arg_");

    private static final SubLString $str136$Assert_Mt__ = makeString("Assert Mt: ");

    private static final SubLString $str137$Single_Entry__ = makeString("Single Entry: ");

    private static final SubLString $str138$Appears_after_this_template__ = makeString("Appears after this template: ");

    private static final SubLString $str139$Template_Example__ = makeString("Template Example: ");

    private static final SubLString $$$virtual = makeString("virtual");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $$$Argument_Position_Details = makeString("Argument Position Details");

    private static final SubLString $str143$Argument_Position_ = makeString("Argument Position:");

    private static final SubLString $$$This_corresponds_to_ = makeString("This corresponds to ");

    private static final SubLString $str145$__and_to_ = makeString(" (and to ");

    private static final SubLString $str146$_in_the_base_formula_ = makeString(" in the base formula)");

    private static final SubLString $str147$Ordering__ = makeString("Ordering: ");

    private static final SubLString $str148$Gloss__ = makeString("Gloss: ");

    private static final SubLString $str149$Explanation__ = makeString("Explanation: ");

    private static final SubLString $str150$Candidate_Replacements__ = makeString("Candidate Replacements: ");

    private static final SubLString $str151$argpos_candidate_replacement__D_0 = makeString("argpos_candidate_replacement_~D_0");

    private static final SubLString $str152$candidate_replacement__D__D = makeString("candidate_replacement_~D_~D");



    private static final SubLString $str154$red_diam_gif = makeString("red_diam.gif");



    private static final SubLString $str156$green_gif = makeString("green.gif");

    private static final SubLList $list157 = list(list(makeSymbol("MESSAGE"), makeSymbol("SUCCESS?")), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLList $list160 = list(makeKeyword("VALIGN"), makeKeyword("TOP"), makeKeyword("ALIGN"), makeKeyword("RIGHT"));



    private static final SubLList $list162 = list(makeKeyword("VALIGN"), makeKeyword("TOP"), makeKeyword("ALIGN"), makeKeyword("LEFT"));



    private static final SubLSymbol CB_ASSERT_FTEMPLATE_DRAW_STATUS_DATACELL = makeSymbol("CB-ASSERT-FTEMPLATE-DRAW-STATUS-DATACELL");

    private static final SubLString $$$Asserting_Formula_Template = makeString("Asserting Formula Template");

    private static final SubLString $str166$Putting_assertions_into_KB_____ = makeString("Putting assertions into KB ....");

    private static final SubLString $$$Creating_or_finding_constant = makeString("Creating or finding constant");

    private static final SubLString $$$Making_a_TKB_template = makeString("Making a TKB template");

    private static final SubLString $$$Asserting_template_formula = makeString("Asserting template formula");

    private static final SubLString $$$Asserting_template_Mt = makeString("Asserting template Mt");

    private static final SubLString $$$Asserting_focal_term_for_template = makeString("Asserting focal term for template");

    private static final SubLString $$$Asserting_template_entry_format = makeString("Asserting template entry format");

    private static final SubLString $$$Asserting_template_glosses = makeString("Asserting template glosses");

    private static final SubLString $$$Asserting_template_explanations = makeString("Asserting template explanations");

    private static final SubLString $str175$Asserting_template_candidate_repl = makeString("Asserting template candidate replacement information");

    private static final SubLString $str176$Asserting_any_validation_required = makeString("Asserting any validation required information");

    private static final SubLString $str177$Asserting_any_invisible_replaceme = makeString("Asserting any invisible replacement information");

    private static final SubLString $$$Asserting_any_example_information = makeString("Asserting any example information");

    private static final SubLString $str179$Asserting_template_ordering_infor = makeString("Asserting template ordering information");

    private static final SubLString $str180$To_inspect_the_new_template__clic = makeString("To inspect the new template, click here: ");

    private static final SubLString $str181$To_create_a_new_template__click_h = makeString("To create a new template, click here: ");

    private static final SubLString $$$Start_New = makeString("Start New");

    private static final SubLSymbol CB_ASSERT_FORMULA_TEMPLATES_CONTENTS = makeSymbol("CB-ASSERT-FORMULA-TEMPLATES-CONTENTS");

    private static final SubLSymbol CB_FORMULA_TEMPLATE_RESTART_WITH_CLEAN_STATE = makeSymbol("CB-FORMULA-TEMPLATE-RESTART-WITH-CLEAN-STATE");

    public static SubLObject formula_template_editing_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject formula_template_editing_state_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$formula_template_editing_state_native.class ? T : NIL;
    }

    public static SubLObject formula_template_editing_state_phase(final SubLObject v_object) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject formula_template_editing_state_formula_template(final SubLObject v_object) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject formula_template_editing_state_base_assertion(final SubLObject v_object) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject formula_template_editing_state_current_edit_problems(final SubLObject v_object) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject formula_template_editing_state_target_mt(final SubLObject v_object) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject formula_template_editing_state_higher_priority_template(final SubLObject v_object) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject formula_template_editing_state_base_formula(final SubLObject v_object) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_formula_template_editing_state_phase(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_formula_template_editing_state_formula_template(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_formula_template_editing_state_base_assertion(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_formula_template_editing_state_current_edit_problems(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_formula_template_editing_state_target_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_formula_template_editing_state_higher_priority_template(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_formula_template_editing_state_base_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != formula_template_editing_state_p(v_object) : "cb_formula_templates.formula_template_editing_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_formula_template_editing_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $formula_template_editing_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PHASE)) {
                _csetf_formula_template_editing_state_phase(v_new, current_value);
            } else
                if (pcase_var.eql($FORMULA_TEMPLATE)) {
                    _csetf_formula_template_editing_state_formula_template(v_new, current_value);
                } else
                    if (pcase_var.eql($BASE_ASSERTION)) {
                        _csetf_formula_template_editing_state_base_assertion(v_new, current_value);
                    } else
                        if (pcase_var.eql($CURRENT_EDIT_PROBLEMS)) {
                            _csetf_formula_template_editing_state_current_edit_problems(v_new, current_value);
                        } else
                            if (pcase_var.eql($TARGET_MT)) {
                                _csetf_formula_template_editing_state_target_mt(v_new, current_value);
                            } else
                                if (pcase_var.eql($HIGHER_PRIORITY_TEMPLATE)) {
                                    _csetf_formula_template_editing_state_higher_priority_template(v_new, current_value);
                                } else
                                    if (pcase_var.eql($BASE_FORMULA)) {
                                        _csetf_formula_template_editing_state_base_formula(v_new, current_value);
                                    } else {
                                        Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_formula_template_editing_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FORMULA_TEMPLATE_EDITING_STATE, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PHASE, formula_template_editing_state_phase(obj));
        funcall(visitor_fn, obj, $SLOT, $FORMULA_TEMPLATE, formula_template_editing_state_formula_template(obj));
        funcall(visitor_fn, obj, $SLOT, $BASE_ASSERTION, formula_template_editing_state_base_assertion(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_EDIT_PROBLEMS, formula_template_editing_state_current_edit_problems(obj));
        funcall(visitor_fn, obj, $SLOT, $TARGET_MT, formula_template_editing_state_target_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $HIGHER_PRIORITY_TEMPLATE, formula_template_editing_state_higher_priority_template(obj));
        funcall(visitor_fn, obj, $SLOT, $BASE_FORMULA, formula_template_editing_state_base_formula(obj));
        funcall(visitor_fn, obj, $END, MAKE_FORMULA_TEMPLATE_EDITING_STATE, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_formula_template_editing_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_formula_template_editing_state(obj, visitor_fn);
    }

    public static SubLObject new_formula_template_editing_state() {
        final SubLObject state = make_formula_template_editing_state(UNPROVIDED);
        _csetf_formula_template_editing_state_phase(state, $CREATE);
        return state;
    }

    public static SubLObject get_formula_template_editing_state_base_el_formula(final SubLObject state) {
        if (NIL != assertion_handles.assertion_p(formula_template_editing_state_base_assertion(state))) {
            return uncanonicalizer.assertion_el_formula(formula_template_editing_state_base_assertion(state));
        }
        return formula_template_editing_state_base_formula(state);
    }

    public static SubLObject cb_reset_current_formula_template_editing_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_current_formula_template_editing_state$.setDynamicValue(new_formula_template_editing_state(), thread);
        return $cb_current_formula_template_editing_state$.getDynamicValue(thread);
    }

    public static SubLObject cb_formula_templates(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Formula_Template_Editor;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str41$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str42$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str47$yui_skin_sam);
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
                        if (NIL == $cb_current_formula_template_editing_state$.getDynamicValue(thread)) {
                            $cb_current_formula_template_editing_state$.setDynamicValue(new_formula_template_editing_state(), thread);
                        }
                        final SubLObject state = $cb_current_formula_template_editing_state$.getDynamicValue(thread);
                        final SubLObject pcase_var = formula_template_editing_state_phase(state);
                        if (pcase_var.eql($CREATE)) {
                            cb_create_new_formula_template(state);
                        } else
                            if (pcase_var.eql($EDIT)) {
                                cb_allow_formula_template_info_editing(state);
                            } else
                                if (pcase_var.eql($DONE)) {
                                    $cb_current_formula_template_editing_state$.setDynamicValue(NIL, thread);
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
        return NIL;
    }

    public static SubLObject cb_create_new_formula_template(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject frame_name_var = cb_frame_name(NIL);
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
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_macros.$within_html_form$.bind(T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_hidden_input($str57$cb_formula_template_restart_with_, T, UNPROVIDED);
            html_submit_input($$$Restart, UNPROVIDED, UNPROVIDED);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_form_tail$.getGlobalValue());
        frame_name_var = cb_frame_name(NIL);
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
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_macros.$within_html_form$.bind(T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_hidden_input($str59$cb_build_formula_template_basics, T, UNPROVIDED);
            cb_draw_formula_template_selection_header(state);
            html_newline(TWO_INTEGER);
            cb_draw_formula_template_base_assertion(state);
            html_newline(TWO_INTEGER);
            html_submit_input($$$Create, UNPROVIDED, UNPROVIDED);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_form_tail$.getGlobalValue());
        frame_name_var = cb_frame_name(NIL);
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
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_macros.$within_html_form$.bind(T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_hidden_input($str57$cb_formula_template_restart_with_, T, UNPROVIDED);
            html_submit_input($$$Restart, UNPROVIDED, UNPROVIDED);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return state;
    }

    public static SubLObject cb_draw_formula_template_base_assertion(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertions = cb_tools.cb_assertion_history_items();
        html_princ($str61$Please_select_the_assertion_you_w);
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ONE_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject counter = ZERO_INTEGER;
            cb_draw_formula_template_base_formula_editor(state);
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                    cb_draw_formula_template_from_assertion(state, assertion, counter);
                    counter = add(counter, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return state;
    }

    public static SubLObject cb_draw_formula_template_base_formula_editor(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($RIGHT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($CENTER));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_radio_input($str64$assertion_id, MINUS_ONE_INTEGER, NIL, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            final SubLObject base_el_formula = formula_template_editing_state_base_formula(state);
            if (NIL != el_formula_p(base_el_formula)) {
                cb_draw_formula_template_base_el_formula(state, base_el_formula, UNPROVIDED);
            } else {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($CENTER));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($str67$Enter_a_formula_to_use_as_the_bas);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str68$base_el_formula);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($int$60);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(THREE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
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
                                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_hidden_input($str70$cb_formula_template_use_base_el_f, T, UNPROVIDED);
                                    html_submit_input($$$Use_Formula, UNPROVIDED, UNPROVIDED);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return state;
    }

    public static SubLObject cb_formula_template_use_base_el_formula(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = $cb_current_formula_template_editing_state$.getDynamicValue(thread);
        final SubLObject base_el_formula_string = html_extract_input($str68$base_el_formula, args);
        if (NIL != formula_template_editing_state_p(state)) {
            thread.resetMultipleValues();
            final SubLObject string = string_utilities.cyclify_string(base_el_formula_string);
            final SubLObject base_el_formula = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != el_formula_p(base_el_formula)) {
                _csetf_formula_template_editing_state_base_formula(state, base_el_formula);
            }
        }
        return cb_formula_templates(UNPROVIDED);
    }

    public static SubLObject cb_draw_formula_template_from_assertion(final SubLObject state, final SubLObject assertion, final SubLObject counter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject el_formula = uncanonicalizer.assertion_el_formula(assertion);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($RIGHT));
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($CENTER));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject as_id = assertion_handles.assertion_id(assertion);
                final SubLObject checkedP = zerop(counter);
                html_radio_input($str64$assertion_id, as_id, checkedP, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            cb_draw_formula_template_base_el_formula(state, el_formula, assertion);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return state;
    }

    public static SubLObject cb_draw_formula_template_base_el_formula(final SubLObject state, final SubLObject el_formula, SubLObject assertion) {
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($LEFT));
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
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ($str73$Assertion__);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    final SubLObject size = length(el_formula);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != size) {
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(size);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                            cb_form(assertion, UNPROVIDED, UNPROVIDED);
                        } else {
                            cb_form(el_formula, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    SubLObject cdolist_list_var;
                    final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(el_formula, $IGNORE);
                    SubLObject v_term = NIL;
                    v_term = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_form(v_term, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_lighter_blue$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_lighter_blue$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ($str75$Focal_Term__);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    final SubLObject terms = cycl_utilities.formula_terms(el_formula, $IGNORE);
                    SubLObject list_var = NIL;
                    SubLObject v_term = NIL;
                    SubLObject argnum = NIL;
                    list_var = terms;
                    v_term = list_var.first();
                    for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_radio_input($str76$focal_term_argnum, argnum, NIL, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ($str77$Replacable_Position__);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    final SubLObject terms = cycl_utilities.formula_terms(el_formula, $IGNORE);
                    SubLObject list_var = NIL;
                    SubLObject v_term = NIL;
                    SubLObject argnum = NIL;
                    list_var = terms;
                    v_term = list_var.first();
                    for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_checkbox_input($str78$editable_argnum, argnum, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_lighter_grey$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_lighter_grey$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ($str79$Require_Validation__);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    final SubLObject terms = cycl_utilities.formula_terms(el_formula, $IGNORE);
                    SubLObject list_var = NIL;
                    SubLObject v_term = NIL;
                    SubLObject argnum = NIL;
                    list_var = terms;
                    v_term = list_var.first();
                    for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_checkbox_input($str80$validreq_argnum, argnum, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ($str81$Hide_Replacements__);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    final SubLObject terms = cycl_utilities.formula_terms(el_formula, $IGNORE);
                    SubLObject list_var = NIL;
                    SubLObject v_term = NIL;
                    SubLObject argnum = NIL;
                    list_var = terms;
                    v_term = list_var.first();
                    for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_checkbox_input($str82$replaceinvis_argnum, argnum, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_draw_formula_template_selection_header(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula_template = formula_template_editing_state_formula_template(state);
        final SubLObject template = (NIL != formula_template) ? formula_templates.formula_template_id(formula_template) : NIL;
        final SubLObject topic = (NIL != formula_template) ? formula_templates.formula_template_topic(formula_template) : $cb_current_formula_template_subtopic$.getDynamicValue(thread);
        final SubLObject target_elmt = (NIL != formula_template) ? formula_template_editing_state_target_mt(state) : $cb_current_formula_template_parent_mt$.getDynamicValue(thread);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($str83$Template_Name_);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != forts.fort_p(template)) {
                        cb_form(template, UNPROVIDED, UNPROVIDED);
                    } else
                        if (template.isString()) {
                            html_text_input($str84$template_name, template, $int$60);
                        } else {
                            Errors.warn($str85$Template_id_is_a__A_, template);
                            html_text_input($str84$template_name, $str86$, $int$60);
                        }

                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_reset_input($$$Clear);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($str88$Parent_Subtopic_);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_fort_list_selector($str89$parent_topic_id, formula_template_utilities.get_all_formula_template_subtopics(), topic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($str90$Create_Template_in_ELMt__);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_fort_list_selector($str91$target_elmt, formula_template_utilities.get_all_formula_template_definition_mts(), target_elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return state;
    }

    public static SubLObject cb_build_formula_template_basics(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = $cb_current_formula_template_editing_state$.getDynamicValue(thread);
        if (NIL != state) {
            if (html_extract_input($str68$base_el_formula, args).isString()) {
                return cb_formula_template_use_base_el_formula(args);
            }
            final SubLObject base_assertion_id_string = html_extract_input($str64$assertion_id, args);
            final SubLObject base_assertion_id = (NIL != number_utilities.number_string_p(base_assertion_id_string)) ? parse_integer(base_assertion_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
            final SubLObject base_assertion = (base_assertion_id.isFixnum()) ? assertion_handles.find_assertion_by_id(base_assertion_id) : NIL;
            final SubLObject new_term_name = html_extract_input($str84$template_name, args);
            final SubLObject parent_topic = cb_decode_fort_list_selector_result($str89$parent_topic_id, args);
            final SubLObject target_elmt = cb_decode_fort_list_selector_result($str91$target_elmt, args);
            final SubLObject focal_term_pos_string = html_extract_input($str76$focal_term_argnum, args);
            final SubLObject focal_term_pos = parse_integer(focal_term_pos_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject editable_argnum_strings = html_extract_input_values($str78$editable_argnum, args);
            final SubLObject validation_required_strings = html_extract_input_values($str80$validreq_argnum, args);
            final SubLObject replacements_invisible_strings = html_extract_input_values($str82$replaceinvis_argnum, args);
            final SubLObject editable_positions = cb_formula_template_convert_argnum_positions(editable_argnum_strings);
            final SubLObject validation_positions = cb_formula_template_convert_argnum_positions(validation_required_strings);
            final SubLObject replacement_positions = cb_formula_template_convert_argnum_positions(replacements_invisible_strings);
            cb_formula_template_editing_state_update_target_elmt(target_elmt);
            _csetf_formula_template_editing_state_base_assertion(state, base_assertion);
            if (NIL != assertion_handles.assertion_p(base_assertion)) {
                _csetf_formula_template_editing_state_formula_template(state, formula_template_utilities.formula_template_prototype_from_assertion(new_term_name, parent_topic, base_assertion, focal_term_pos, editable_positions, validation_positions, replacement_positions));
            } else {
                _csetf_formula_template_editing_state_formula_template(state, formula_template_utilities.formula_template_prototype_from_el_formula(new_term_name, parent_topic, formula_template_editing_state_base_formula(state), focal_term_pos, editable_positions, validation_positions, replacement_positions, UNPROVIDED));
            }
            $cb_current_formula_template_subtopic$.setDynamicValue(parent_topic, thread);
            _csetf_formula_template_editing_state_phase(state, $EDIT);
        }
        return cb_formula_templates(UNPROVIDED);
    }

    public static SubLObject cb_formula_template_convert_argnum_positions(final SubLObject argnum_strings) {
        SubLObject positions = NIL;
        SubLObject cdolist_list_var = argnum_strings;
        SubLObject argnum_string = NIL;
        argnum_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject argnum = parse_integer(argnum_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            positions = cons(argnum, positions);
            cdolist_list_var = cdolist_list_var.rest();
            argnum_string = cdolist_list_var.first();
        } 
        return positions;
    }

    public static SubLObject cb_formula_template_editing_state_update_target_elmt(final SubLObject target_elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(target_elmt)) {
            final SubLObject state = $cb_current_formula_template_editing_state$.getDynamicValue(thread);
            _csetf_formula_template_editing_state_target_mt(state, target_elmt);
            $cb_current_formula_template_parent_mt$.setDynamicValue(target_elmt, thread);
            return state;
        }
        return NIL;
    }

    public static SubLObject cb_record_current_formula_template_editing_problem(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = $cb_current_formula_template_editing_state$.getDynamicValue(thread);
        SubLObject problems = formula_template_editing_state_current_edit_problems(state);
        problems = cons(problem, problems);
        _csetf_formula_template_editing_state_current_edit_problems(state, problems);
        return problem;
    }

    public static SubLObject cb_get_current_formula_template_editing_problems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = $cb_current_formula_template_editing_state$.getDynamicValue(thread);
        final SubLObject problems = formula_template_editing_state_current_edit_problems(state);
        return problems;
    }

    public static SubLObject cb_clear_current_formula_template_editing_problems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = $cb_current_formula_template_editing_state$.getDynamicValue(thread);
        _csetf_formula_template_editing_state_current_edit_problems(state, NIL);
        return NIL;
    }

    public static SubLObject cb_enumerate_current_formula_template_editing_problems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    final SubLObject color_val = html_macros.$html_color_dark_red$.getGlobalValue();
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != color_val) {
                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(color_val));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str93$Update_Error_s_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str94$The_following_error_s__occurred_d);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            SubLObject cdolist_list_var = cb_get_current_formula_template_editing_problems();
            SubLObject problem = NIL;
            problem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(problem);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                problem = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_allow_formula_template_info_editing(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
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
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_macros.$within_html_form$.bind(T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_hidden_input($str95$cb_edit_formula_template_contents, T, UNPROVIDED);
            cb_draw_formula_template_selection_header(state);
            html_newline(TWO_INTEGER);
            if (NIL != cb_get_current_formula_template_editing_problems()) {
                cb_enumerate_current_formula_template_editing_problems();
                html_newline(TWO_INTEGER);
            }
            html_princ($str96$Update_or_edit_any_of_the_formula);
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ($str97$_Change_);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_princ($str98$_button_to_update_the_fields__Onc);
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ($str99$_Assert_);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_princ($str100$_to_put_the_information_into_the_);
            html_newline(TWO_INTEGER);
            cb_draw_current_formula_template_from_state(state);
            html_newline(TWO_INTEGER);
            html_submit_input($$$Change, $$$change, UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_submit_input($$$Start_Over, $str104$start_over, UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_submit_input($$$Assert, $$$assert, UNPROVIDED);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return state;
    }

    public static SubLObject cb_edit_formula_template_contents(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject start_overP = list_utilities.sublisp_boolean(html_extract_input($str104$start_over, args));
        final SubLObject assertP = list_utilities.sublisp_boolean(html_extract_input($$$assert, args));
        if (NIL != start_overP) {
            $cb_current_formula_template_editing_state$.setDynamicValue(NIL, thread);
            return cb_formula_templates(UNPROVIDED);
        }
        final SubLObject state = $cb_current_formula_template_editing_state$.getDynamicValue(thread);
        final SubLObject formula_template = formula_template_editing_state_formula_template(state);
        cb_clear_current_formula_template_editing_problems();
        cb_verify_formula_template_header_information(state, args);
        cb_update_formula_template_formula(formula_template, args);
        cb_update_formula_template_elmt(formula_template, args);
        cb_update_formula_template_single_entry(formula_template, args);
        cb_update_formula_template_ordering(formula_template, args);
        cb_update_formula_template_example(formula_template, args);
        SubLObject number = ZERO_INTEGER;
        SubLObject cdolist_list_var = formula_templates.formula_template_argpos_ordering(formula_template);
        SubLObject argpos_detail = NIL;
        argpos_detail = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!argpos_detail.eql(formula_templates.formula_template_focal_term(formula_template))) {
                cb_update_formula_template_argpos_details(argpos_detail, number, args);
                number = add(number, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argpos_detail = cdolist_list_var.first();
        } 
        cb_recompute_formula_template_argpos_ordering(formula_template);
        if ((NIL == cb_get_current_formula_template_editing_problems()) && (NIL != assertP)) {
            return cb_assert_formula_templates_contents(state);
        }
        return cb_formula_templates(UNPROVIDED);
    }

    public static SubLObject cb_verify_formula_template_header_information(final SubLObject state, final SubLObject args) {
        final SubLObject formula_template = formula_template_editing_state_formula_template(state);
        final SubLObject term_name = formula_templates.formula_template_id(formula_template);
        if (((!term_name.isString()) || (NIL != string_utilities.empty_string_p(term_name))) && (NIL == forts.fort_p(term_name))) {
            final SubLObject new_term_name = html_extract_input($str84$template_name, args);
            if (NIL != string_utilities.empty_string_p(new_term_name)) {
                cb_record_current_formula_template_editing_problem($str108$The_template_must_have_a_name_);
            } else {
                formula_templates._csetf_formula_template_id(formula_template, new_term_name);
            }
        }
        cb_formula_template_editing_state_update_target_elmt(html_extract_input($str91$target_elmt, args));
        return state;
    }

    public static SubLObject cb_update_formula_template_formula(final SubLObject formula_template, final SubLObject args) {
        final SubLObject old_formula = formula_templates.formula_template_formula(formula_template);
        SubLObject formula_elements = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject field_name;
        SubLObject value_encoding;
        SubLObject value;
        for (cdotimes_end_var = length(old_formula), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            field_name = format(NIL, $str109$formula_arg__D, i);
            value_encoding = html_extract_input(field_name, args);
            value = NIL;
            value = constants_high.find_constant(value_encoding);
            if (NIL == value) {
                value = read_from_string_ignoring_errors(value_encoding, NIL, $EOF, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != cycl_grammar.cycl_represented_term_p(value)) {
                formula_elements = cons(value, formula_elements);
            } else {
                cb_record_current_formula_template_editing_problem(cconcatenate($str111$Cannot_parse_formula_template_arg, new SubLObject[]{ string_utilities.to_string(i), $str112$_, value_encoding }));
                formula_elements = cons(cycl_utilities.formula_arg(old_formula, i, UNPROVIDED), formula_elements);
            }
        }
        formula_elements = nreverse(formula_elements);
        formula_templates._csetf_formula_template_formula(formula_template, make_el_formula(formula_elements.first(), formula_elements.rest(), UNPROVIDED));
        return formula_template;
    }

    public static SubLObject cb_update_formula_template_elmt(final SubLObject formula_template, final SubLObject args) {
        final SubLObject value_encoding = html_extract_input($$$elmt, args);
        SubLObject value = NIL;
        value = constants_high.find_constant(value_encoding);
        if (NIL == value) {
            value = read_from_string_ignoring_errors(value_encoding, NIL, $EOF, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != cycl_grammar.cycl_represented_term_p(value)) {
            formula_templates._csetf_formula_template_elmt(formula_template, value);
        } else {
            cb_record_current_formula_template_editing_problem(cconcatenate($str114$Cannot_interpret_template_ELMt__, value_encoding));
        }
        return formula_template;
    }

    public static SubLObject cb_update_formula_template_single_entry(final SubLObject formula_template, final SubLObject args) {
        if (NIL != html_extract_input($str115$single_entry, args)) {
            formula_templates._csetf_formula_template_entry_format(formula_template, $$SingleAssertionEntry);
        } else {
            formula_templates._csetf_formula_template_entry_format(formula_template, $$MultipleAssertionEntry);
        }
        return formula_template;
    }

    public static SubLObject cb_update_formula_template_ordering(final SubLObject formula_template, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predecessor = cb_decode_fort_list_selector_result($str118$higher_priority, args);
        final SubLObject state = $cb_current_formula_template_editing_state$.getDynamicValue(thread);
        if (NIL != cb_fort_list_none_selected_p(predecessor)) {
            _csetf_formula_template_editing_state_higher_priority_template(state, NIL);
        } else {
            _csetf_formula_template_editing_state_higher_priority_template(state, predecessor);
        }
        return formula_template;
    }

    public static SubLObject cb_update_formula_template_example(final SubLObject formula_template, final SubLObject args) {
        final SubLObject formula_text = html_extract_input($str119$template_example, args);
        final SubLObject formula = read_from_string_ignoring_errors(formula_text, NIL, $EOF, UNPROVIDED, UNPROVIDED);
        if (NIL != el_formula_p(formula)) {
            formula_templates._csetf_formula_template_examples(formula_template, list(formula));
        } else {
            formula_templates._csetf_formula_template_examples(formula_template, NIL);
        }
        return formula_template;
    }

    public static SubLObject cb_recompute_formula_template_argpos_ordering(final SubLObject formula_template) {
        formula_templates.update_ftemplate_argpos_detail_ordering_information(formula_template);
        return formula_template;
    }

    public static SubLObject cb_update_formula_template_argpos_details(final SubLObject argpos_detail, final SubLObject number, final SubLObject args) {
        formula_templates._csetf_arg_position_details_argument_position(argpos_detail, cb_update_ftemplate_argpos_details_argument_position(number, args));
        formula_templates._csetf_arg_position_details_ordering(argpos_detail, cb_update_ftemplate_argpos_details_ordering(number, args));
        formula_templates._csetf_arg_position_details_explanation(argpos_detail, cb_update_ftemplate_argpos_details_explanation(number, args));
        formula_templates._csetf_arg_position_details_gloss(argpos_detail, cb_update_ftemplate_argpos_details_gloss(number, args));
        formula_templates._csetf_arg_position_details_candidate_replacements(argpos_detail, cb_update_ftemplate_argpos_details_candidate_replacements(number, args));
        return argpos_detail;
    }

    public static SubLObject cb_update_ftemplate_argpos_details_argument_position(final SubLObject number, final SubLObject args) {
        final SubLObject argpos_number = add(ONE_INTEGER, number);
        final SubLObject fieldname = format(NIL, $str120$argpos__D, number);
        final SubLObject value_encoding = html_extract_input(fieldname, args);
        SubLObject value = read_from_string_ignoring_errors(value_encoding, NIL, $EOF, UNPROVIDED, UNPROVIDED);
        if (NIL == cycl_grammar.cycl_represented_term_p(value)) {
            cb_record_current_formula_template_editing_problem(cconcatenate($str121$Cannot_interpret_formula_argument, new SubLObject[]{ string_utilities.to_string(argpos_number), $str122$__, value_encoding }));
            value = make_unary_formula($$FormulaArgPositionFn, argpos_number);
        }
        return value;
    }

    public static SubLObject cb_update_ftemplate_argpos_details_ordering(final SubLObject number, final SubLObject args) {
        final SubLObject argpos_number = add(ONE_INTEGER, number);
        final SubLObject fieldname = format(NIL, $str124$argpos_order__D, number);
        final SubLObject value_encoding = html_extract_input(fieldname, args);
        SubLObject value = argpos_number;
        if (NIL != number_utilities.number_string_p(value_encoding)) {
            value = parse_integer(value_encoding, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            cb_record_current_formula_template_editing_problem(cconcatenate($str125$Invalid_ordering_value_specified_, new SubLObject[]{ string_utilities.to_string(argpos_number), $str122$__, value_encoding }));
        }
        return value;
    }

    public static SubLObject cb_update_ftemplate_argpos_details_explanation(final SubLObject number, final SubLObject args) {
        final SubLObject argpos_number = add(ONE_INTEGER, number);
        final SubLObject fieldname = format(NIL, $str126$argpos_explanation__D, number);
        final SubLObject value;
        final SubLObject value_encoding = value = html_extract_input(fieldname, args);
        return value;
    }

    public static SubLObject cb_update_ftemplate_argpos_details_gloss(final SubLObject number, final SubLObject args) {
        final SubLObject argpos_number = add(ONE_INTEGER, number);
        final SubLObject fieldname = format(NIL, $str127$argpos_gloss__D, number);
        final SubLObject value;
        final SubLObject value_encoding = value = html_extract_input(fieldname, args);
        return value;
    }

    public static SubLObject cb_update_ftemplate_argpos_details_candidate_replacements(final SubLObject number, final SubLObject args) {
        final SubLObject argpos_number = add(ONE_INTEGER, number);
        final SubLObject fieldname_stem = format(NIL, $str128$argpos_candidate_replacement__D_, number);
        SubLObject counter = ZERO_INTEGER;
        SubLObject value = NIL;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            final SubLObject fieldname = cconcatenate(fieldname_stem, string_utilities.to_string(counter));
            final SubLObject value_encoding = html_extract_input(fieldname, args);
            if ((NIL == value_encoding) || (NIL != string_utilities.empty_string_p(value_encoding))) {
                doneP = T;
            } else {
                final SubLObject candidate_replacement = read_from_string_ignoring_errors(value_encoding, NIL, $EOF, UNPROVIDED, UNPROVIDED);
                if (NIL != cycl_grammar.cycl_represented_term_p(candidate_replacement)) {
                    value = cons(candidate_replacement, value);
                } else {
                    cb_record_current_formula_template_editing_problem(cconcatenate($str129$Cannot_interpret_candidate_replac, new SubLObject[]{ string_utilities.to_string(add(counter, ONE_INTEGER)), $$$_for_argument_position_, string_utilities.to_string(argpos_number), $str131$___, value_encoding }));
                }
            }
            counter = add(counter, ONE_INTEGER);
        } 
        return nreverse(value);
    }

    public static SubLObject cb_draw_current_formula_template_from_state(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula_template = formula_template_editing_state_formula_template(state);
        final SubLObject base_assertion = formula_template_editing_state_base_assertion(state);
        final SubLObject base_el_formula = get_formula_template_editing_state_base_el_formula(state);
        final SubLObject higher_priority = formula_template_editing_state_higher_priority_template(state);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != assertion_handles.assertion_p(base_assertion)) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ($str132$Original_Assertion__);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_form(base_assertion, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($str133$Formula__);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject terms = cycl_utilities.formula_terms(formula_templates.formula_template_formula(formula_template), $IGNORE);
                        SubLObject list_var = NIL;
                        SubLObject v_term = NIL;
                        SubLObject counter = NIL;
                        list_var = terms;
                        v_term = list_var.first();
                        for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , counter = number_utilities.f_1X(counter)) {
                            final SubLObject argpos_detail = formula_template_utilities.find_matching_formula_template_argpos_details(formula_template, counter);
                            SubLObject color = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                            if (NIL == argpos_detail) {
                                color = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                            } else
                                if (argpos_detail.eql(formula_templates.formula_template_focal_term(formula_template))) {
                                    color = html_macros.$html_color_lighter_blue$.getGlobalValue();
                                } else
                                    if (NIL != formula_templates.arg_position_details_is_editable(argpos_detail)) {
                                        color = html_macros.$html_color_lighter_grey$.getGlobalValue();
                                    } else {
                                        color = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                                    }


                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != color) {
                                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(color);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str134$Argument__);
                                    html_princ(counter);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    final SubLObject fieldname = cconcatenate($str135$formula_arg_, string_utilities.to_string(counter));
                                    if (NIL == argpos_detail) {
                                        cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                        html_hidden_input(fieldname, v_term, UNPROVIDED);
                                    } else
                                        if (NIL != formula_templates.arg_position_details_is_editable(argpos_detail)) {
                                            html_text_input(fieldname, v_term, $int$60);
                                        } else {
                                            cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                            html_hidden_input(fieldname, v_term, UNPROVIDED);
                                        }

                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($str136$Assert_Mt__);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_text_input($$$elmt, formula_templates.formula_template_elmt(formula_template), $int$60);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($str137$Single_Entry__);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_checkbox_input($str115$single_entry, T, formula_templates.formula_template_is_single_entryP(formula_template), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($str138$Appears_after_this_template__);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_fort_list_selector($str118$higher_priority, isa.all_fort_instances(formula_templates.formula_template_topic(formula_template), UNPROVIDED, UNPROVIDED), higher_priority, ONE_INTEGER, symbol_function(IDENTITY), T, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($str139$Template_Example__);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject example_formula = base_el_formula;
                    final SubLObject current_example = formula_templates.formula_template_examples(formula_template).first();
                    if (NIL != el_formula_p(current_example)) {
                        example_formula = current_example;
                    }
                    if (NIL != $cb_wrap_interactor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str119$template_example);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($int$60);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(THREE_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$virtual);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(example_formula);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                        }
                        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                    } else {
                        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str119$template_example);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($int$80);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(THREE_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(example_formula);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                        }
                        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($$$Argument_Position_Details);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            cb_draw_argpos_details_for_current_formula_template(state, formula_template, base_el_formula);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return state;
    }

    public static SubLObject cb_draw_argpos_details_for_current_formula_template(final SubLObject state, final SubLObject formula_template, final SubLObject base_el_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject number = ZERO_INTEGER;
        SubLObject cdolist_list_var = formula_templates.formula_template_argpos_ordering(formula_template);
        SubLObject argpos_detail = NIL;
        argpos_detail = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!argpos_detail.eql(formula_templates.formula_template_focal_term(formula_template))) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject color = html_macros.$html_color_lighter_grey$.getGlobalValue();
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != color) {
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(color);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ($str143$Argument_Position_);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject argpos = formula_templates.arg_position_details_argument_position(argpos_detail);
                        html_format_input(argpos, $int$60, $str120$argpos__D, number, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject argpos2 = formula_templates.arg_position_details_argument_position(argpos_detail);
                        final SubLObject formula = formula_templates.formula_template_formula(formula_template);
                        SubLObject base_element = base_el_formula;
                        SubLObject curr_element = formula;
                        SubLObject cdolist_list_var_$82 = argpos2.rest();
                        SubLObject argnum = NIL;
                        argnum = cdolist_list_var_$82.first();
                        while (NIL != cdolist_list_var_$82) {
                            curr_element = nth(argnum, curr_element);
                            base_element = nth(argnum, base_element);
                            cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                            argnum = cdolist_list_var_$82.first();
                        } 
                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_princ($$$This_corresponds_to_);
                        cb_form(curr_element, UNPROVIDED, UNPROVIDED);
                        html_princ($str145$__and_to_);
                        cb_form(base_element, UNPROVIDED, UNPROVIDED);
                        html_princ($str146$_in_the_base_formula_);
                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($str147$Ordering__);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject ordering = formula_templates.arg_position_details_ordering(argpos_detail);
                        html_format_input(ordering, $int$60, $str124$argpos_order__D, number, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($str148$Gloss__);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject gloss = formula_templates.arg_position_details_gloss(argpos_detail);
                        if (!gloss.isString()) {
                            gloss = $str86$;
                        }
                        html_format_input(gloss, $int$80, $str127$argpos_gloss__D, number, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($str149$Explanation__);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject explanation = formula_templates.arg_position_details_explanation(argpos_detail);
                        if (!explanation.isString()) {
                            explanation = $str86$;
                        }
                        html_format_input(explanation, $int$80, $str126$argpos_explanation__D, number, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_princ($str150$Candidate_Replacements__);
                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject candidate_replacements = formula_templates.arg_position_details_candidate_replacements(argpos_detail);
                        if (NIL == candidate_replacements) {
                            final SubLObject fieldname = format(NIL, $str151$argpos_candidate_replacement__D_0, number);
                            html_text_input(fieldname, $str86$, $int$80);
                        }
                        SubLObject list_var = NIL;
                        SubLObject candidate_replacement = NIL;
                        SubLObject count = NIL;
                        list_var = candidate_replacements;
                        candidate_replacement = list_var.first();
                        for (count = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , candidate_replacement = list_var.first() , count = add(ONE_INTEGER, count)) {
                            html_format_input(candidate_replacement, $int$80, $str152$candidate_replacement__D__D, number, count, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                number = add(number, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argpos_detail = cdolist_list_var.first();
        } 
        return state;
    }

    public static SubLObject cb_assert_ftemplate_generate_status_gif(final SubLObject successP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != successP) {
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($TEMPLATE_SUCCESS);
            final SubLObject align = $TOP;
            final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($TEMPLATE_SUCCESS);
            final SubLObject border = ZERO_INTEGER;
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(image_src);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != alt) {
                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(alt);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != align) {
                html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align(align));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != border) {
                html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(border);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
        } else {
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($TEMPLATE_FAILURE);
            final SubLObject align = $TOP;
            final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($TEMPLATE_FAILURE);
            final SubLObject border = ZERO_INTEGER;
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(image_src);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != alt) {
                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(alt);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != align) {
                html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align(align));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != border) {
                html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(border);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        return successP;
    }

    public static SubLObject cb_assert_ftemplate_draw_status_datacell(final SubLObject successP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($CENTER));
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($TOP));
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_assert_ftemplate_generate_status_gif(successP);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_assert_ftemplate_action_row(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list157);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject message = NIL;
        SubLObject successP = NIL;
        destructuring_bind_must_consp(current, datum, $list157);
        message = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list157);
        successP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(HTML_TABLE_ROW, list(HTML_FANCY_TABLE_DATA, $list160, list(HTML_PRINC, message)), list(HTML_FANCY_TABLE_DATA, $list162, bq_cons(PROGN, append(body, NIL))), list(CB_ASSERT_FTEMPLATE_DRAW_STATUS_DATACELL, successP));
        }
        cdestructuring_bind_error(datum, $list157);
        return NIL;
    }

    public static SubLObject cb_assert_formula_templates_contents(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula_template = formula_template_editing_state_formula_template(state);
        final SubLObject predecessor = formula_template_editing_state_higher_priority_template(state);
        final SubLObject target_mt = formula_template_editing_state_target_mt(state);
        final SubLObject title_var = $$$Asserting_Formula_Template;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str41$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str42$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$91 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$92 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str47$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
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
                        html_newline(UNPROVIDED);
                        html_princ($str166$Putting_assertions_into_KB_____);
                        html_newline(TWO_INTEGER);
                        SubLObject successP = NIL;
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Creating_or_finding_constant);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    successP = formula_template_utilities.reify_formula_template_description(formula_template);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Making_a_TKB_template);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    successP = formula_template_utilities.make_formula_template_type_assertions(formula_template);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Asserting_template_formula);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    successP = formula_template_utilities.assert_formula_template_formula(formula_template, target_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Asserting_template_Mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    successP = formula_template_utilities.assert_formula_template_elmt(formula_template, target_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Asserting_focal_term_for_template);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    successP = formula_template_utilities.assert_formula_template_focal_term_position(formula_template, target_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Asserting_template_entry_format);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    successP = formula_template_utilities.assert_formula_template_assertion_format(formula_template, target_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Asserting_template_glosses);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    successP = formula_template_utilities.assert_formula_template_assertion_glosses(formula_template, target_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Asserting_template_explanations);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    successP = formula_template_utilities.assert_formula_template_assertion_explanations(formula_template, target_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str175$Asserting_template_candidate_repl);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    successP = formula_template_utilities.assert_formula_template_candidate_replacements(formula_template, target_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str176$Asserting_any_validation_required);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    successP = formula_template_utilities.assert_formula_template_assertion_validation_required(formula_template, target_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str177$Asserting_any_invisible_replaceme);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    successP = formula_template_utilities.assert_formula_template_assertion_replacements_invisible(formula_template, target_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Asserting_any_example_information);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    successP = formula_template_utilities.assert_formula_template_examples(formula_template, target_mt);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            if (NIL != forts.fort_p(predecessor)) {
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str179$Asserting_template_ordering_infor);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        successP = formula_template_utilities.assert_formula_template_priority_ordering(formula_template, target_mt, predecessor);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    cb_assert_ftemplate_draw_status_datacell(successP);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_newline(TWO_INTEGER);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$135 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str180$To_inspect_the_new_template__clic);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_form(formula_templates.formula_template_id(formula_template), UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$139 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$140 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str181$To_create_a_new_template__click_h);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$140, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
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
                                    final SubLObject _prev_bind_0_$142 = html_macros.$html_safe_print$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_hidden_input($str57$cb_formula_template_restart_with_, T, UNPROVIDED);
                                        html_submit_input($$$Start_New, UNPROVIDED, UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$142, thread);
                                    }
                                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$141, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$139, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$135, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$92, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$91, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return state;
    }

    public static SubLObject cb_formula_template_restart_with_clean_state(final SubLObject args) {
        cb_reset_current_formula_template_editing_state();
        return cb_formula_templates(UNPROVIDED);
    }

    public static SubLObject declare_cb_formula_templates_file() {
        declareFunction(me, "formula_template_editing_state_print_function_trampoline", "FORMULA-TEMPLATE-EDITING-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "formula_template_editing_state_p", "FORMULA-TEMPLATE-EDITING-STATE-P", 1, 0, false);
        new cb_formula_templates.$formula_template_editing_state_p$UnaryFunction();
        declareFunction(me, "formula_template_editing_state_phase", "FORMULA-TEMPLATE-EDITING-STATE-PHASE", 1, 0, false);
        declareFunction(me, "formula_template_editing_state_formula_template", "FORMULA-TEMPLATE-EDITING-STATE-FORMULA-TEMPLATE", 1, 0, false);
        declareFunction(me, "formula_template_editing_state_base_assertion", "FORMULA-TEMPLATE-EDITING-STATE-BASE-ASSERTION", 1, 0, false);
        declareFunction(me, "formula_template_editing_state_current_edit_problems", "FORMULA-TEMPLATE-EDITING-STATE-CURRENT-EDIT-PROBLEMS", 1, 0, false);
        declareFunction(me, "formula_template_editing_state_target_mt", "FORMULA-TEMPLATE-EDITING-STATE-TARGET-MT", 1, 0, false);
        declareFunction(me, "formula_template_editing_state_higher_priority_template", "FORMULA-TEMPLATE-EDITING-STATE-HIGHER-PRIORITY-TEMPLATE", 1, 0, false);
        declareFunction(me, "formula_template_editing_state_base_formula", "FORMULA-TEMPLATE-EDITING-STATE-BASE-FORMULA", 1, 0, false);
        declareFunction(me, "_csetf_formula_template_editing_state_phase", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-PHASE", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_editing_state_formula_template", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-FORMULA-TEMPLATE", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_editing_state_base_assertion", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-BASE-ASSERTION", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_editing_state_current_edit_problems", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-CURRENT-EDIT-PROBLEMS", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_editing_state_target_mt", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-TARGET-MT", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_editing_state_higher_priority_template", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-HIGHER-PRIORITY-TEMPLATE", 2, 0, false);
        declareFunction(me, "_csetf_formula_template_editing_state_base_formula", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-BASE-FORMULA", 2, 0, false);
        declareFunction(me, "make_formula_template_editing_state", "MAKE-FORMULA-TEMPLATE-EDITING-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_formula_template_editing_state", "VISIT-DEFSTRUCT-FORMULA-TEMPLATE-EDITING-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_formula_template_editing_state_method", "VISIT-DEFSTRUCT-OBJECT-FORMULA-TEMPLATE-EDITING-STATE-METHOD", 2, 0, false);
        declareFunction(me, "new_formula_template_editing_state", "NEW-FORMULA-TEMPLATE-EDITING-STATE", 0, 0, false);
        declareFunction(me, "get_formula_template_editing_state_base_el_formula", "GET-FORMULA-TEMPLATE-EDITING-STATE-BASE-EL-FORMULA", 1, 0, false);
        declareFunction(me, "cb_reset_current_formula_template_editing_state", "CB-RESET-CURRENT-FORMULA-TEMPLATE-EDITING-STATE", 0, 0, false);
        declareFunction(me, "cb_formula_templates", "CB-FORMULA-TEMPLATES", 0, 1, false);
        declareFunction(me, "cb_create_new_formula_template", "CB-CREATE-NEW-FORMULA-TEMPLATE", 1, 0, false);
        declareFunction(me, "cb_draw_formula_template_base_assertion", "CB-DRAW-FORMULA-TEMPLATE-BASE-ASSERTION", 1, 0, false);
        declareFunction(me, "cb_draw_formula_template_base_formula_editor", "CB-DRAW-FORMULA-TEMPLATE-BASE-FORMULA-EDITOR", 1, 0, false);
        declareFunction(me, "cb_formula_template_use_base_el_formula", "CB-FORMULA-TEMPLATE-USE-BASE-EL-FORMULA", 1, 0, false);
        declareFunction(me, "cb_draw_formula_template_from_assertion", "CB-DRAW-FORMULA-TEMPLATE-FROM-ASSERTION", 3, 0, false);
        declareFunction(me, "cb_draw_formula_template_base_el_formula", "CB-DRAW-FORMULA-TEMPLATE-BASE-EL-FORMULA", 2, 1, false);
        declareFunction(me, "cb_draw_formula_template_selection_header", "CB-DRAW-FORMULA-TEMPLATE-SELECTION-HEADER", 1, 0, false);
        declareFunction(me, "cb_build_formula_template_basics", "CB-BUILD-FORMULA-TEMPLATE-BASICS", 1, 0, false);
        declareFunction(me, "cb_formula_template_convert_argnum_positions", "CB-FORMULA-TEMPLATE-CONVERT-ARGNUM-POSITIONS", 1, 0, false);
        declareFunction(me, "cb_formula_template_editing_state_update_target_elmt", "CB-FORMULA-TEMPLATE-EDITING-STATE-UPDATE-TARGET-ELMT", 1, 0, false);
        declareFunction(me, "cb_record_current_formula_template_editing_problem", "CB-RECORD-CURRENT-FORMULA-TEMPLATE-EDITING-PROBLEM", 1, 0, false);
        declareFunction(me, "cb_get_current_formula_template_editing_problems", "CB-GET-CURRENT-FORMULA-TEMPLATE-EDITING-PROBLEMS", 0, 0, false);
        declareFunction(me, "cb_clear_current_formula_template_editing_problems", "CB-CLEAR-CURRENT-FORMULA-TEMPLATE-EDITING-PROBLEMS", 0, 0, false);
        declareFunction(me, "cb_enumerate_current_formula_template_editing_problems", "CB-ENUMERATE-CURRENT-FORMULA-TEMPLATE-EDITING-PROBLEMS", 0, 0, false);
        declareFunction(me, "cb_allow_formula_template_info_editing", "CB-ALLOW-FORMULA-TEMPLATE-INFO-EDITING", 1, 0, false);
        declareFunction(me, "cb_edit_formula_template_contents", "CB-EDIT-FORMULA-TEMPLATE-CONTENTS", 1, 0, false);
        declareFunction(me, "cb_verify_formula_template_header_information", "CB-VERIFY-FORMULA-TEMPLATE-HEADER-INFORMATION", 2, 0, false);
        declareFunction(me, "cb_update_formula_template_formula", "CB-UPDATE-FORMULA-TEMPLATE-FORMULA", 2, 0, false);
        declareFunction(me, "cb_update_formula_template_elmt", "CB-UPDATE-FORMULA-TEMPLATE-ELMT", 2, 0, false);
        declareFunction(me, "cb_update_formula_template_single_entry", "CB-UPDATE-FORMULA-TEMPLATE-SINGLE-ENTRY", 2, 0, false);
        declareFunction(me, "cb_update_formula_template_ordering", "CB-UPDATE-FORMULA-TEMPLATE-ORDERING", 2, 0, false);
        declareFunction(me, "cb_update_formula_template_example", "CB-UPDATE-FORMULA-TEMPLATE-EXAMPLE", 2, 0, false);
        declareFunction(me, "cb_recompute_formula_template_argpos_ordering", "CB-RECOMPUTE-FORMULA-TEMPLATE-ARGPOS-ORDERING", 1, 0, false);
        declareFunction(me, "cb_update_formula_template_argpos_details", "CB-UPDATE-FORMULA-TEMPLATE-ARGPOS-DETAILS", 3, 0, false);
        declareFunction(me, "cb_update_ftemplate_argpos_details_argument_position", "CB-UPDATE-FTEMPLATE-ARGPOS-DETAILS-ARGUMENT-POSITION", 2, 0, false);
        declareFunction(me, "cb_update_ftemplate_argpos_details_ordering", "CB-UPDATE-FTEMPLATE-ARGPOS-DETAILS-ORDERING", 2, 0, false);
        declareFunction(me, "cb_update_ftemplate_argpos_details_explanation", "CB-UPDATE-FTEMPLATE-ARGPOS-DETAILS-EXPLANATION", 2, 0, false);
        declareFunction(me, "cb_update_ftemplate_argpos_details_gloss", "CB-UPDATE-FTEMPLATE-ARGPOS-DETAILS-GLOSS", 2, 0, false);
        declareFunction(me, "cb_update_ftemplate_argpos_details_candidate_replacements", "CB-UPDATE-FTEMPLATE-ARGPOS-DETAILS-CANDIDATE-REPLACEMENTS", 2, 0, false);
        declareFunction(me, "cb_draw_current_formula_template_from_state", "CB-DRAW-CURRENT-FORMULA-TEMPLATE-FROM-STATE", 1, 0, false);
        declareFunction(me, "cb_draw_argpos_details_for_current_formula_template", "CB-DRAW-ARGPOS-DETAILS-FOR-CURRENT-FORMULA-TEMPLATE", 3, 0, false);
        declareFunction(me, "cb_assert_ftemplate_generate_status_gif", "CB-ASSERT-FTEMPLATE-GENERATE-STATUS-GIF", 1, 0, false);
        declareFunction(me, "cb_assert_ftemplate_draw_status_datacell", "CB-ASSERT-FTEMPLATE-DRAW-STATUS-DATACELL", 1, 0, false);
        declareMacro(me, "cb_assert_ftemplate_action_row", "CB-ASSERT-FTEMPLATE-ACTION-ROW");
        declareFunction(me, "cb_assert_formula_templates_contents", "CB-ASSERT-FORMULA-TEMPLATES-CONTENTS", 1, 0, false);
        declareFunction(me, "cb_formula_template_restart_with_clean_state", "CB-FORMULA-TEMPLATE-RESTART-WITH-CLEAN-STATE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_formula_templates_file() {
        defconstant("*DTP-FORMULA-TEMPLATE-EDITING-STATE*", FORMULA_TEMPLATE_EDITING_STATE);
        defparameter("*CB-CURRENT-FORMULA-TEMPLATE-EDITING-STATE*", NIL);
        defparameter("*CB-CURRENT-FORMULA-TEMPLATE-SUBTOPIC*", NIL);
        defparameter("*CB-CURRENT-FORMULA-TEMPLATE-PARENT-MT*", NIL);
        return NIL;
    }

    public static SubLObject setup_cb_formula_templates_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_formula_template_editing_state$.getGlobalValue(), symbol_function(FORMULA_TEMPLATE_EDITING_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(FORMULA_TEMPLATE_EDITING_STATE_PHASE, _CSETF_FORMULA_TEMPLATE_EDITING_STATE_PHASE);
        def_csetf(FORMULA_TEMPLATE_EDITING_STATE_FORMULA_TEMPLATE, _CSETF_FORMULA_TEMPLATE_EDITING_STATE_FORMULA_TEMPLATE);
        def_csetf(FORMULA_TEMPLATE_EDITING_STATE_BASE_ASSERTION, _CSETF_FORMULA_TEMPLATE_EDITING_STATE_BASE_ASSERTION);
        def_csetf(FORMULA_TEMPLATE_EDITING_STATE_CURRENT_EDIT_PROBLEMS, _CSETF_FORMULA_TEMPLATE_EDITING_STATE_CURRENT_EDIT_PROBLEMS);
        def_csetf(FORMULA_TEMPLATE_EDITING_STATE_TARGET_MT, _CSETF_FORMULA_TEMPLATE_EDITING_STATE_TARGET_MT);
        def_csetf(FORMULA_TEMPLATE_EDITING_STATE_HIGHER_PRIORITY_TEMPLATE, _CSETF_FORMULA_TEMPLATE_EDITING_STATE_HIGHER_PRIORITY_TEMPLATE);
        def_csetf(FORMULA_TEMPLATE_EDITING_STATE_BASE_FORMULA, _CSETF_FORMULA_TEMPLATE_EDITING_STATE_BASE_FORMULA);
        identity(FORMULA_TEMPLATE_EDITING_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_formula_template_editing_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FORMULA_TEMPLATE_EDITING_STATE_METHOD));
        register_html_state_variable($cb_current_formula_template_editing_state$);
        register_html_state_variable($cb_current_formula_template_subtopic$);
        register_html_state_variable($cb_current_formula_template_parent_mt$);
        html_macros.note_cgi_handler_function(CB_FORMULA_TEMPLATES, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_FORMULA_TEMPLATE_USE_BASE_EL_FORMULA, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_BUILD_FORMULA_TEMPLATE_BASICS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_EDIT_FORMULA_TEMPLATE_CONTENTS, $HTML_HANDLER);
        sethash($TEMPLATE_FAILURE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str154$red_diam_gif, NIL));
        sethash($TEMPLATE_SUCCESS, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str156$green_gif, NIL));
        html_macros.note_cgi_handler_function(CB_ASSERT_FORMULA_TEMPLATES_CONTENTS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_FORMULA_TEMPLATE_RESTART_WITH_CLEAN_STATE, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_formula_templates_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_formula_templates_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_formula_templates_file();
    }

    

    public static final class $formula_template_editing_state_native extends SubLStructNative {
        public SubLObject $phase;

        public SubLObject $formula_template;

        public SubLObject $base_assertion;

        public SubLObject $current_edit_problems;

        public SubLObject $target_mt;

        public SubLObject $higher_priority_template;

        public SubLObject $base_formula;

        private static final SubLStructDeclNative structDecl;

        private $formula_template_editing_state_native() {
            this.$phase = Lisp.NIL;
            this.$formula_template = Lisp.NIL;
            this.$base_assertion = Lisp.NIL;
            this.$current_edit_problems = Lisp.NIL;
            this.$target_mt = Lisp.NIL;
            this.$higher_priority_template = Lisp.NIL;
            this.$base_formula = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$phase;
        }

        @Override
        public SubLObject getField3() {
            return this.$formula_template;
        }

        @Override
        public SubLObject getField4() {
            return this.$base_assertion;
        }

        @Override
        public SubLObject getField5() {
            return this.$current_edit_problems;
        }

        @Override
        public SubLObject getField6() {
            return this.$target_mt;
        }

        @Override
        public SubLObject getField7() {
            return this.$higher_priority_template;
        }

        @Override
        public SubLObject getField8() {
            return this.$base_formula;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$phase = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$formula_template = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$base_assertion = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$current_edit_problems = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$target_mt = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$higher_priority_template = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$base_formula = value;
        }

        static {
            structDecl = makeStructDeclNative($formula_template_editing_state_native.class, FORMULA_TEMPLATE_EDITING_STATE, FORMULA_TEMPLATE_EDITING_STATE_P, $list2, $list3, new String[]{ "$phase", "$formula_template", "$base_assertion", "$current_edit_problems", "$target_mt", "$higher_priority_template", "$base_formula" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $formula_template_editing_state_p$UnaryFunction extends UnaryFunction {
        public $formula_template_editing_state_p$UnaryFunction() {
            super(extractFunctionNamed("FORMULA-TEMPLATE-EDITING-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return formula_template_editing_state_p(arg1);
        }
    }
}

/**
 * Total time: 4103 ms
 */
