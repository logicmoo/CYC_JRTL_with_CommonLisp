package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_formula_templates extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_formula_templates";
    public static final String myFingerPrint = "2e8d2a7f8fea1cd4b0dfc8a4fab93b710885ecf56c8a0ced3cbfa9b3f2379296";
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLSymbol $dtp_formula_template_editing_state$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 1705L)
    public static SubLSymbol $cb_current_formula_template_editing_state$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 1998L)
    public static SubLSymbol $cb_current_formula_template_subtopic$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 2062L)
    public static SubLSymbol $cb_current_formula_template_parent_mt$;
    private static final SubLSymbol $sym0$FORMULA_TEMPLATE_EDITING_STATE;
    private static final SubLSymbol $sym1$FORMULA_TEMPLATE_EDITING_STATE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$FORMULA_TEMPLATE_EDITING_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$FORMULA_TEMPLATE_EDITING_STATE_PHASE;
    private static final SubLSymbol $sym10$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_PHASE;
    private static final SubLSymbol $sym11$FORMULA_TEMPLATE_EDITING_STATE_FORMULA_TEMPLATE;
    private static final SubLSymbol $sym12$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_FORMULA_TEMPLATE;
    private static final SubLSymbol $sym13$FORMULA_TEMPLATE_EDITING_STATE_BASE_ASSERTION;
    private static final SubLSymbol $sym14$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_BASE_ASSERTION;
    private static final SubLSymbol $sym15$FORMULA_TEMPLATE_EDITING_STATE_CURRENT_EDIT_PROBLEMS;
    private static final SubLSymbol $sym16$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_CURRENT_EDIT_PROBLEMS;
    private static final SubLSymbol $sym17$FORMULA_TEMPLATE_EDITING_STATE_TARGET_MT;
    private static final SubLSymbol $sym18$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_TARGET_MT;
    private static final SubLSymbol $sym19$FORMULA_TEMPLATE_EDITING_STATE_HIGHER_PRIORITY_TEMPLATE;
    private static final SubLSymbol $sym20$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_HIGHER_PRIORITY_TEMPLATE;
    private static final SubLSymbol $sym21$FORMULA_TEMPLATE_EDITING_STATE_BASE_FORMULA;
    private static final SubLSymbol $sym22$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_BASE_FORMULA;
    private static final SubLSymbol $kw23$PHASE;
    private static final SubLSymbol $kw24$FORMULA_TEMPLATE;
    private static final SubLSymbol $kw25$BASE_ASSERTION;
    private static final SubLSymbol $kw26$CURRENT_EDIT_PROBLEMS;
    private static final SubLSymbol $kw27$TARGET_MT;
    private static final SubLSymbol $kw28$HIGHER_PRIORITY_TEMPLATE;
    private static final SubLSymbol $kw29$BASE_FORMULA;
    private static final SubLString $str30$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw31$BEGIN;
    private static final SubLSymbol $sym32$MAKE_FORMULA_TEMPLATE_EDITING_STATE;
    private static final SubLSymbol $kw33$SLOT;
    private static final SubLSymbol $kw34$END;
    private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_FORMULA_TEMPLATE_EDITING_STATE_METHOD;
    private static final SubLSymbol $kw36$CREATE;
    private static final SubLSymbol $sym37$_CB_CURRENT_FORMULA_TEMPLATE_EDITING_STATE_;
    private static final SubLSymbol $sym38$_CB_CURRENT_FORMULA_TEMPLATE_SUBTOPIC_;
    private static final SubLSymbol $sym39$_CB_CURRENT_FORMULA_TEMPLATE_PARENT_MT_;
    private static final SubLString $str40$Formula_Template_Editor;
    private static final SubLString $str41$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str42$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw43$UNINITIALIZED;
    private static final SubLSymbol $kw44$CB_CYC;
    private static final SubLSymbol $kw45$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw46$SHA1;
    private static final SubLString $str47$yui_skin_sam;
    private static final SubLString $str48$reloadFrameButton;
    private static final SubLString $str49$button;
    private static final SubLString $str50$reload;
    private static final SubLString $str51$Refresh_Frames;
    private static final SubLSymbol $kw52$EDIT;
    private static final SubLSymbol $kw53$DONE;
    private static final SubLSymbol $sym54$CB_FORMULA_TEMPLATES;
    private static final SubLSymbol $kw55$HTML_HANDLER;
    private static final SubLString $str56$post;
    private static final SubLString $str57$cb_formula_template_restart_with_;
    private static final SubLString $str58$Restart;
    private static final SubLString $str59$cb_build_formula_template_basics;
    private static final SubLString $str60$Create;
    private static final SubLString $str61$Please_select_the_assertion_you_w;
    private static final SubLSymbol $kw62$RIGHT;
    private static final SubLSymbol $kw63$CENTER;
    private static final SubLString $str64$assertion_id;
    private static final SubLSymbol $kw65$LEFT;
    private static final SubLSymbol $kw66$TOP;
    private static final SubLString $str67$Enter_a_formula_to_use_as_the_bas;
    private static final SubLString $str68$base_el_formula;
    private static final SubLInteger $int69$60;
    private static final SubLString $str70$cb_formula_template_use_base_el_f;
    private static final SubLString $str71$Use_Formula;
    private static final SubLSymbol $sym72$CB_FORMULA_TEMPLATE_USE_BASE_EL_FORMULA;
    private static final SubLString $str73$Assertion__;
    private static final SubLSymbol $kw74$IGNORE;
    private static final SubLString $str75$Focal_Term__;
    private static final SubLString $str76$focal_term_argnum;
    private static final SubLString $str77$Replacable_Position__;
    private static final SubLString $str78$editable_argnum;
    private static final SubLString $str79$Require_Validation__;
    private static final SubLString $str80$validreq_argnum;
    private static final SubLString $str81$Hide_Replacements__;
    private static final SubLString $str82$replaceinvis_argnum;
    private static final SubLString $str83$Template_Name_;
    private static final SubLString $str84$template_name;
    private static final SubLString $str85$Template_id_is_a__A_;
    private static final SubLString $str86$;
    private static final SubLString $str87$Clear;
    private static final SubLString $str88$Parent_Subtopic_;
    private static final SubLString $str89$parent_topic_id;
    private static final SubLString $str90$Create_Template_in_ELMt__;
    private static final SubLString $str91$target_elmt;
    private static final SubLSymbol $sym92$CB_BUILD_FORMULA_TEMPLATE_BASICS;
    private static final SubLString $str93$Update_Error_s_;
    private static final SubLString $str94$The_following_error_s__occurred_d;
    private static final SubLString $str95$cb_edit_formula_template_contents;
    private static final SubLString $str96$Update_or_edit_any_of_the_formula;
    private static final SubLString $str97$_Change_;
    private static final SubLString $str98$_button_to_update_the_fields__Onc;
    private static final SubLString $str99$_Assert_;
    private static final SubLString $str100$_to_put_the_information_into_the_;
    private static final SubLString $str101$Change;
    private static final SubLString $str102$change;
    private static final SubLString $str103$Start_Over;
    private static final SubLString $str104$start_over;
    private static final SubLString $str105$Assert;
    private static final SubLString $str106$assert;
    private static final SubLSymbol $sym107$CB_EDIT_FORMULA_TEMPLATE_CONTENTS;
    private static final SubLString $str108$The_template_must_have_a_name_;
    private static final SubLString $str109$formula_arg__D;
    private static final SubLSymbol $kw110$EOF;
    private static final SubLString $str111$Cannot_parse_formula_template_arg;
    private static final SubLString $str112$_;
    private static final SubLString $str113$elmt;
    private static final SubLString $str114$Cannot_interpret_template_ELMt__;
    private static final SubLString $str115$single_entry;
    private static final SubLObject $const116$SingleAssertionEntry;
    private static final SubLObject $const117$MultipleAssertionEntry;
    private static final SubLString $str118$higher_priority;
    private static final SubLString $str119$template_example;
    private static final SubLString $str120$argpos__D;
    private static final SubLString $str121$Cannot_interpret_formula_argument;
    private static final SubLString $str122$__;
    private static final SubLObject $const123$FormulaArgPositionFn;
    private static final SubLString $str124$argpos_order__D;
    private static final SubLString $str125$Invalid_ordering_value_specified_;
    private static final SubLString $str126$argpos_explanation__D;
    private static final SubLString $str127$argpos_gloss__D;
    private static final SubLString $str128$argpos_candidate_replacement__D_;
    private static final SubLString $str129$Cannot_interpret_candidate_replac;
    private static final SubLString $str130$_for_argument_position_;
    private static final SubLString $str131$___;
    private static final SubLString $str132$Original_Assertion__;
    private static final SubLString $str133$Formula__;
    private static final SubLString $str134$Argument__;
    private static final SubLString $str135$formula_arg_;
    private static final SubLString $str136$Assert_Mt__;
    private static final SubLString $str137$Single_Entry__;
    private static final SubLString $str138$Appears_after_this_template__;
    private static final SubLString $str139$Template_Example__;
    private static final SubLString $str140$virtual;
    private static final SubLInteger $int141$80;
    private static final SubLString $str142$Argument_Position_Details;
    private static final SubLString $str143$Argument_Position_;
    private static final SubLString $str144$This_corresponds_to_;
    private static final SubLString $str145$__and_to_;
    private static final SubLString $str146$_in_the_base_formula_;
    private static final SubLString $str147$Ordering__;
    private static final SubLString $str148$Gloss__;
    private static final SubLString $str149$Explanation__;
    private static final SubLString $str150$Candidate_Replacements__;
    private static final SubLString $str151$argpos_candidate_replacement__D_0;
    private static final SubLString $str152$candidate_replacement__D__D;
    private static final SubLSymbol $kw153$TEMPLATE_FAILURE;
    private static final SubLString $str154$red_diam_gif;
    private static final SubLSymbol $kw155$TEMPLATE_SUCCESS;
    private static final SubLString $str156$green_gif;
    private static final SubLList $list157;
    private static final SubLSymbol $sym158$HTML_TABLE_ROW;
    private static final SubLSymbol $sym159$HTML_FANCY_TABLE_DATA;
    private static final SubLList $list160;
    private static final SubLSymbol $sym161$HTML_PRINC;
    private static final SubLList $list162;
    private static final SubLSymbol $sym163$PROGN;
    private static final SubLSymbol $sym164$CB_ASSERT_FTEMPLATE_DRAW_STATUS_DATACELL;
    private static final SubLString $str165$Asserting_Formula_Template;
    private static final SubLString $str166$Putting_assertions_into_KB_____;
    private static final SubLString $str167$Creating_or_finding_constant;
    private static final SubLString $str168$Making_a_TKB_template;
    private static final SubLString $str169$Asserting_template_formula;
    private static final SubLString $str170$Asserting_template_Mt;
    private static final SubLString $str171$Asserting_focal_term_for_template;
    private static final SubLString $str172$Asserting_template_entry_format;
    private static final SubLString $str173$Asserting_template_glosses;
    private static final SubLString $str174$Asserting_template_explanations;
    private static final SubLString $str175$Asserting_template_candidate_repl;
    private static final SubLString $str176$Asserting_any_validation_required;
    private static final SubLString $str177$Asserting_any_invisible_replaceme;
    private static final SubLString $str178$Asserting_any_example_information;
    private static final SubLString $str179$Asserting_template_ordering_infor;
    private static final SubLString $str180$To_inspect_the_new_template__clic;
    private static final SubLString $str181$To_create_a_new_template__click_h;
    private static final SubLString $str182$Start_New;
    private static final SubLSymbol $sym183$CB_ASSERT_FORMULA_TEMPLATES_CONTENTS;
    private static final SubLSymbol $sym184$CB_FORMULA_TEMPLATE_RESTART_WITH_CLEAN_STATE;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject formula_template_editing_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)cb_formula_templates.ZERO_INTEGER);
        return (SubLObject)cb_formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject formula_template_editing_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $formula_template_editing_state_native.class) ? cb_formula_templates.T : cb_formula_templates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject formula_template_editing_state_phase(final SubLObject v_object) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject formula_template_editing_state_formula_template(final SubLObject v_object) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject formula_template_editing_state_base_assertion(final SubLObject v_object) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject formula_template_editing_state_current_edit_problems(final SubLObject v_object) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject formula_template_editing_state_target_mt(final SubLObject v_object) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject formula_template_editing_state_higher_priority_template(final SubLObject v_object) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject formula_template_editing_state_base_formula(final SubLObject v_object) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject _csetf_formula_template_editing_state_phase(final SubLObject v_object, final SubLObject value) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject _csetf_formula_template_editing_state_formula_template(final SubLObject v_object, final SubLObject value) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject _csetf_formula_template_editing_state_base_assertion(final SubLObject v_object, final SubLObject value) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject _csetf_formula_template_editing_state_current_edit_problems(final SubLObject v_object, final SubLObject value) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject _csetf_formula_template_editing_state_target_mt(final SubLObject v_object, final SubLObject value) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject _csetf_formula_template_editing_state_higher_priority_template(final SubLObject v_object, final SubLObject value) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject _csetf_formula_template_editing_state_base_formula(final SubLObject v_object, final SubLObject value) {
        assert cb_formula_templates.NIL != formula_template_editing_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject make_formula_template_editing_state(SubLObject arglist) {
        if (arglist == cb_formula_templates.UNPROVIDED) {
            arglist = (SubLObject)cb_formula_templates.NIL;
        }
        final SubLObject v_new = (SubLObject)new $formula_template_editing_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cb_formula_templates.NIL, next = arglist; cb_formula_templates.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cb_formula_templates.$kw23$PHASE)) {
                _csetf_formula_template_editing_state_phase(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_formula_templates.$kw24$FORMULA_TEMPLATE)) {
                _csetf_formula_template_editing_state_formula_template(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_formula_templates.$kw25$BASE_ASSERTION)) {
                _csetf_formula_template_editing_state_base_assertion(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_formula_templates.$kw26$CURRENT_EDIT_PROBLEMS)) {
                _csetf_formula_template_editing_state_current_edit_problems(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_formula_templates.$kw27$TARGET_MT)) {
                _csetf_formula_template_editing_state_target_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_formula_templates.$kw28$HIGHER_PRIORITY_TEMPLATE)) {
                _csetf_formula_template_editing_state_higher_priority_template(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_formula_templates.$kw29$BASE_FORMULA)) {
                _csetf_formula_template_editing_state_base_formula(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cb_formula_templates.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject visit_defstruct_formula_template_editing_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_formula_templates.$kw31$BEGIN, (SubLObject)cb_formula_templates.$sym32$MAKE_FORMULA_TEMPLATE_EDITING_STATE, (SubLObject)cb_formula_templates.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_formula_templates.$kw33$SLOT, (SubLObject)cb_formula_templates.$kw23$PHASE, formula_template_editing_state_phase(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_formula_templates.$kw33$SLOT, (SubLObject)cb_formula_templates.$kw24$FORMULA_TEMPLATE, formula_template_editing_state_formula_template(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_formula_templates.$kw33$SLOT, (SubLObject)cb_formula_templates.$kw25$BASE_ASSERTION, formula_template_editing_state_base_assertion(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_formula_templates.$kw33$SLOT, (SubLObject)cb_formula_templates.$kw26$CURRENT_EDIT_PROBLEMS, formula_template_editing_state_current_edit_problems(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_formula_templates.$kw33$SLOT, (SubLObject)cb_formula_templates.$kw27$TARGET_MT, formula_template_editing_state_target_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_formula_templates.$kw33$SLOT, (SubLObject)cb_formula_templates.$kw28$HIGHER_PRIORITY_TEMPLATE, formula_template_editing_state_higher_priority_template(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_formula_templates.$kw33$SLOT, (SubLObject)cb_formula_templates.$kw29$BASE_FORMULA, formula_template_editing_state_base_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_formula_templates.$kw34$END, (SubLObject)cb_formula_templates.$sym32$MAKE_FORMULA_TEMPLATE_EDITING_STATE, (SubLObject)cb_formula_templates.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 815L)
    public static SubLObject visit_defstruct_object_formula_template_editing_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_formula_template_editing_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 1201L)
    public static SubLObject new_formula_template_editing_state() {
        final SubLObject state = make_formula_template_editing_state((SubLObject)cb_formula_templates.UNPROVIDED);
        _csetf_formula_template_editing_state_phase(state, (SubLObject)cb_formula_templates.$kw36$CREATE);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 1396L)
    public static SubLObject get_formula_template_editing_state_base_el_formula(final SubLObject state) {
        if (cb_formula_templates.NIL != assertion_handles.assertion_p(formula_template_editing_state_base_assertion(state))) {
            return uncanonicalizer.assertion_el_formula(formula_template_editing_state_base_assertion(state));
        }
        return formula_template_editing_state_base_formula(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 1777L)
    public static SubLObject cb_reset_current_formula_template_editing_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_formula_templates.$cb_current_formula_template_editing_state$.setDynamicValue(new_formula_template_editing_state(), thread);
        return cb_formula_templates.$cb_current_formula_template_editing_state$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 2126L)
    public static SubLObject cb_formula_templates(SubLObject args) {
        if (args == cb_formula_templates.UNPROVIDED) {
            args = (SubLObject)cb_formula_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_formula_templates.$str40$Formula_Template_Editor;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_formula_templates.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_formula_templates.$str41$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_formula_templates.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_formula_templates.$str42$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_formula_templates.$kw43$UNINITIALIZED) ? ConsesLow.list(cb_formula_templates.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_formula_templates.$kw44$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_formula_templates.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_formula_templates.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_formula_templates.$str47$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_formula_templates.$str48$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_formula_templates.$str49$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_formula_templates.$str50$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_formula_templates.$str51$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            if (cb_formula_templates.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_formula_templates.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_formula_templates.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_formula_templates.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                        if (cb_formula_templates.NIL == cb_formula_templates.$cb_current_formula_template_editing_state$.getDynamicValue(thread)) {
                            cb_formula_templates.$cb_current_formula_template_editing_state$.setDynamicValue(new_formula_template_editing_state(), thread);
                        }
                        final SubLObject state = cb_formula_templates.$cb_current_formula_template_editing_state$.getDynamicValue(thread);
                        final SubLObject pcase_var = formula_template_editing_state_phase(state);
                        if (pcase_var.eql((SubLObject)cb_formula_templates.$kw36$CREATE)) {
                            cb_create_new_formula_template(state);
                        }
                        else if (pcase_var.eql((SubLObject)cb_formula_templates.$kw52$EDIT)) {
                            cb_allow_formula_template_info_editing(state);
                        }
                        else if (pcase_var.eql((SubLObject)cb_formula_templates.$kw53$DONE)) {
                            cb_formula_templates.$cb_current_formula_template_editing_state$.setDynamicValue((SubLObject)cb_formula_templates.NIL, thread);
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 3280L)
    public static SubLObject cb_create_new_formula_template(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_formula_templates.NIL);
        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_formula_templates.$str56$post);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        if (cb_formula_templates.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            html_macros.$within_html_form$.bind((SubLObject)cb_formula_templates.T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_utilities.html_hidden_input((SubLObject)cb_formula_templates.$str57$cb_formula_template_restart_with_, (SubLObject)cb_formula_templates.T, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_submit_input((SubLObject)cb_formula_templates.$str58$Restart, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_formula_templates.NIL);
        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_formula_templates.$str56$post);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        if (cb_formula_templates.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            html_macros.$within_html_form$.bind((SubLObject)cb_formula_templates.T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_utilities.html_hidden_input((SubLObject)cb_formula_templates.$str59$cb_build_formula_template_basics, (SubLObject)cb_formula_templates.T, (SubLObject)cb_formula_templates.UNPROVIDED);
            cb_draw_formula_template_selection_header(state);
            html_utilities.html_newline((SubLObject)cb_formula_templates.TWO_INTEGER);
            cb_draw_formula_template_base_assertion(state);
            html_utilities.html_newline((SubLObject)cb_formula_templates.TWO_INTEGER);
            html_utilities.html_submit_input((SubLObject)cb_formula_templates.$str60$Create, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_formula_templates.NIL);
        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_formula_templates.$str56$post);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        if (cb_formula_templates.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            html_macros.$within_html_form$.bind((SubLObject)cb_formula_templates.T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_utilities.html_hidden_input((SubLObject)cb_formula_templates.$str57$cb_formula_template_restart_with_, (SubLObject)cb_formula_templates.T, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_submit_input((SubLObject)cb_formula_templates.$str58$Restart, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 3898L)
    public static SubLObject cb_draw_formula_template_base_assertion(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertions = cb_tools.cb_assertion_history_items();
        html_utilities.html_princ((SubLObject)cb_formula_templates.$str61$Please_select_the_assertion_you_w);
        html_utilities.html_newline((SubLObject)cb_formula_templates.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_formula_templates.ONE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            SubLObject counter = (SubLObject)cb_formula_templates.ZERO_INTEGER;
            cb_draw_formula_template_base_formula_editor(state);
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = (SubLObject)cb_formula_templates.NIL;
            assertion = cdolist_list_var.first();
            while (cb_formula_templates.NIL != cdolist_list_var) {
                if (cb_formula_templates.NIL != assertions_high.valid_assertion(assertion, (SubLObject)cb_formula_templates.UNPROVIDED)) {
                    cb_draw_formula_template_from_assertion(state, assertion, counter);
                    counter = Numbers.add(counter, (SubLObject)cb_formula_templates.ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 4714L)
    public static SubLObject cb_draw_formula_template_base_formula_editor(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_radio_input((SubLObject)cb_formula_templates.$str64$assertion_id, (SubLObject)cb_formula_templates.MINUS_ONE_INTEGER, (SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            final SubLObject base_el_formula = formula_template_editing_state_base_formula(state);
            if (cb_formula_templates.NIL != el_utilities.el_formula_p(base_el_formula)) {
                cb_draw_formula_template_base_el_formula(state, base_el_formula, (SubLObject)cb_formula_templates.UNPROVIDED);
            }
            else {
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_formula_templates.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_formula_templates.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_princ((SubLObject)cb_formula_templates.$str67$Enter_a_formula_to_use_as_the_bas);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_formula_templates.$str68$base_el_formula);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_formula_templates.$int69$60);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_formula_templates.THREE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_formula_templates.NIL);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_formula_templates.$str56$post);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                if (cb_formula_templates.NIL != frame_name_var) {
                                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_markup(frame_name_var);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_macros.$within_html_form$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_utilities.html_hidden_input((SubLObject)cb_formula_templates.$str70$cb_formula_template_use_base_el_f, (SubLObject)cb_formula_templates.T, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_submit_input((SubLObject)cb_formula_templates.$str71$Use_Formula, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                }
                                finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 5786L)
    public static SubLObject cb_formula_template_use_base_el_formula(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = cb_formula_templates.$cb_current_formula_template_editing_state$.getDynamicValue(thread);
        final SubLObject base_el_formula_string = html_utilities.html_extract_input((SubLObject)cb_formula_templates.$str68$base_el_formula, args);
        if (cb_formula_templates.NIL != formula_template_editing_state_p(state)) {
            thread.resetMultipleValues();
            final SubLObject string = string_utilities.cyclify_string(base_el_formula_string);
            final SubLObject base_el_formula = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (cb_formula_templates.NIL != el_utilities.el_formula_p(base_el_formula)) {
                _csetf_formula_template_editing_state_base_formula(state, base_el_formula);
            }
        }
        return cb_formula_templates((SubLObject)cb_formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 6345L)
    public static SubLObject cb_draw_formula_template_from_assertion(final SubLObject state, final SubLObject assertion, final SubLObject counter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            final SubLObject el_formula = uncanonicalizer.assertion_el_formula(assertion);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                final SubLObject as_id = assertion_handles.assertion_id(assertion);
                final SubLObject checkedP = Numbers.zerop(counter);
                html_utilities.html_radio_input((SubLObject)cb_formula_templates.$str64$assertion_id, as_id, checkedP, (SubLObject)cb_formula_templates.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            cb_draw_formula_template_base_el_formula(state, el_formula, assertion);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 6818L)
    public static SubLObject cb_draw_formula_template_base_el_formula(final SubLObject state, final SubLObject el_formula, SubLObject assertion) {
        if (assertion == cb_formula_templates.UNPROVIDED) {
            assertion = (SubLObject)cb_formula_templates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_formula_templates.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str73$Assertion__);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    final SubLObject size = Sequences.length(el_formula);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (cb_formula_templates.NIL != size) {
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(size);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        if (cb_formula_templates.NIL != assertions_high.valid_assertion(assertion, (SubLObject)cb_formula_templates.UNPROVIDED)) {
                            cb_utilities.cb_form(assertion, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                        else {
                            cb_utilities.cb_form(el_formula, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    SubLObject cdolist_list_var;
                    final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(el_formula, (SubLObject)cb_formula_templates.$kw74$IGNORE);
                    SubLObject v_term = (SubLObject)cb_formula_templates.NIL;
                    v_term = cdolist_list_var.first();
                    while (cb_formula_templates.NIL != cdolist_list_var) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            cb_utilities.cb_form(v_term, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_formula_templates.NIL != html_macros.$html_color_lighter_blue$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_lighter_blue$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str75$Focal_Term__);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    final SubLObject terms = cycl_utilities.formula_terms(el_formula, (SubLObject)cb_formula_templates.$kw74$IGNORE);
                    SubLObject list_var = (SubLObject)cb_formula_templates.NIL;
                    SubLObject v_term = (SubLObject)cb_formula_templates.NIL;
                    SubLObject argnum = (SubLObject)cb_formula_templates.NIL;
                    list_var = terms;
                    v_term = list_var.first();
                    for (argnum = (SubLObject)cb_formula_templates.ZERO_INTEGER; cb_formula_templates.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            html_utilities.html_radio_input((SubLObject)cb_formula_templates.$str76$focal_term_argnum, argnum, (SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str77$Replacable_Position__);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    final SubLObject terms = cycl_utilities.formula_terms(el_formula, (SubLObject)cb_formula_templates.$kw74$IGNORE);
                    SubLObject list_var = (SubLObject)cb_formula_templates.NIL;
                    SubLObject v_term = (SubLObject)cb_formula_templates.NIL;
                    SubLObject argnum = (SubLObject)cb_formula_templates.NIL;
                    list_var = terms;
                    v_term = list_var.first();
                    for (argnum = (SubLObject)cb_formula_templates.ZERO_INTEGER; cb_formula_templates.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            html_utilities.html_checkbox_input((SubLObject)cb_formula_templates.$str78$editable_argnum, argnum, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_formula_templates.NIL != html_macros.$html_color_lighter_grey$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str79$Require_Validation__);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    final SubLObject terms = cycl_utilities.formula_terms(el_formula, (SubLObject)cb_formula_templates.$kw74$IGNORE);
                    SubLObject list_var = (SubLObject)cb_formula_templates.NIL;
                    SubLObject v_term = (SubLObject)cb_formula_templates.NIL;
                    SubLObject argnum = (SubLObject)cb_formula_templates.NIL;
                    list_var = terms;
                    v_term = list_var.first();
                    for (argnum = (SubLObject)cb_formula_templates.ZERO_INTEGER; cb_formula_templates.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            html_utilities.html_checkbox_input((SubLObject)cb_formula_templates.$str80$validreq_argnum, argnum, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_formula_templates.NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str81$Hide_Replacements__);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    final SubLObject terms = cycl_utilities.formula_terms(el_formula, (SubLObject)cb_formula_templates.$kw74$IGNORE);
                    SubLObject list_var = (SubLObject)cb_formula_templates.NIL;
                    SubLObject v_term = (SubLObject)cb_formula_templates.NIL;
                    SubLObject argnum = (SubLObject)cb_formula_templates.NIL;
                    list_var = terms;
                    v_term = list_var.first();
                    for (argnum = (SubLObject)cb_formula_templates.ZERO_INTEGER; cb_formula_templates.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            html_utilities.html_checkbox_input((SubLObject)cb_formula_templates.$str82$replaceinvis_argnum, argnum, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return (SubLObject)cb_formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 9137L)
    public static SubLObject cb_draw_formula_template_selection_header(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula_template = formula_template_editing_state_formula_template(state);
        final SubLObject template = (SubLObject)((cb_formula_templates.NIL != formula_template) ? formula_templates.formula_template_id(formula_template) : cb_formula_templates.NIL);
        final SubLObject topic = (cb_formula_templates.NIL != formula_template) ? formula_templates.formula_template_topic(formula_template) : cb_formula_templates.$cb_current_formula_template_subtopic$.getDynamicValue(thread);
        final SubLObject target_elmt = (cb_formula_templates.NIL != formula_template) ? formula_template_editing_state_target_mt(state) : cb_formula_templates.$cb_current_formula_template_parent_mt$.getDynamicValue(thread);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_formula_templates.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str83$Template_Name_);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    if (cb_formula_templates.NIL != forts.fort_p(template)) {
                        cb_utilities.cb_form(template, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                    }
                    else if (template.isString()) {
                        html_utilities.html_text_input((SubLObject)cb_formula_templates.$str84$template_name, template, (SubLObject)cb_formula_templates.$int69$60);
                    }
                    else {
                        Errors.warn((SubLObject)cb_formula_templates.$str85$Template_id_is_a__A_, template);
                        html_utilities.html_text_input((SubLObject)cb_formula_templates.$str84$template_name, (SubLObject)cb_formula_templates.$str86$, (SubLObject)cb_formula_templates.$int69$60);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_reset_input((SubLObject)cb_formula_templates.$str87$Clear);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str88$Parent_Subtopic_);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    cb_utilities.cb_fort_list_selector((SubLObject)cb_formula_templates.$str89$parent_topic_id, formula_template_utilities.get_all_formula_template_subtopics(), topic, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str90$Create_Template_in_ELMt__);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    cb_utilities.cb_fort_list_selector((SubLObject)cb_formula_templates.$str91$target_elmt, formula_template_utilities.get_all_formula_template_definition_mts(), target_elmt, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 11143L)
    public static SubLObject cb_build_formula_template_basics(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = cb_formula_templates.$cb_current_formula_template_editing_state$.getDynamicValue(thread);
        if (cb_formula_templates.NIL != state) {
            if (html_utilities.html_extract_input((SubLObject)cb_formula_templates.$str68$base_el_formula, args).isString()) {
                return cb_formula_template_use_base_el_formula(args);
            }
            final SubLObject base_assertion_id_string = html_utilities.html_extract_input((SubLObject)cb_formula_templates.$str64$assertion_id, args);
            final SubLObject base_assertion_id = (SubLObject)((cb_formula_templates.NIL != number_utilities.number_string_p(base_assertion_id_string)) ? reader.parse_integer(base_assertion_id_string, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED) : cb_formula_templates.NIL);
            final SubLObject base_assertion = (SubLObject)(base_assertion_id.isFixnum() ? assertion_handles.find_assertion_by_id(base_assertion_id) : cb_formula_templates.NIL);
            final SubLObject new_term_name = html_utilities.html_extract_input((SubLObject)cb_formula_templates.$str84$template_name, args);
            final SubLObject parent_topic = cb_utilities.cb_decode_fort_list_selector_result((SubLObject)cb_formula_templates.$str89$parent_topic_id, args);
            final SubLObject target_elmt = cb_utilities.cb_decode_fort_list_selector_result((SubLObject)cb_formula_templates.$str91$target_elmt, args);
            final SubLObject focal_term_pos_string = html_utilities.html_extract_input((SubLObject)cb_formula_templates.$str76$focal_term_argnum, args);
            final SubLObject focal_term_pos = reader.parse_integer(focal_term_pos_string, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject editable_argnum_strings = html_utilities.html_extract_input_values((SubLObject)cb_formula_templates.$str78$editable_argnum, args);
            final SubLObject validation_required_strings = html_utilities.html_extract_input_values((SubLObject)cb_formula_templates.$str80$validreq_argnum, args);
            final SubLObject replacements_invisible_strings = html_utilities.html_extract_input_values((SubLObject)cb_formula_templates.$str82$replaceinvis_argnum, args);
            final SubLObject editable_positions = cb_formula_template_convert_argnum_positions(editable_argnum_strings);
            final SubLObject validation_positions = cb_formula_template_convert_argnum_positions(validation_required_strings);
            final SubLObject replacement_positions = cb_formula_template_convert_argnum_positions(replacements_invisible_strings);
            cb_formula_template_editing_state_update_target_elmt(target_elmt);
            _csetf_formula_template_editing_state_base_assertion(state, base_assertion);
            if (cb_formula_templates.NIL != assertion_handles.assertion_p(base_assertion)) {
                _csetf_formula_template_editing_state_formula_template(state, formula_template_utilities.formula_template_prototype_from_assertion(new_term_name, parent_topic, base_assertion, focal_term_pos, editable_positions, validation_positions, replacement_positions));
            }
            else {
                _csetf_formula_template_editing_state_formula_template(state, formula_template_utilities.formula_template_prototype_from_el_formula(new_term_name, parent_topic, formula_template_editing_state_base_formula(state), focal_term_pos, editable_positions, validation_positions, replacement_positions, (SubLObject)cb_formula_templates.UNPROVIDED));
            }
            cb_formula_templates.$cb_current_formula_template_subtopic$.setDynamicValue(parent_topic, thread);
            _csetf_formula_template_editing_state_phase(state, (SubLObject)cb_formula_templates.$kw52$EDIT);
        }
        return cb_formula_templates((SubLObject)cb_formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 14095L)
    public static SubLObject cb_formula_template_convert_argnum_positions(final SubLObject argnum_strings) {
        SubLObject positions = (SubLObject)cb_formula_templates.NIL;
        SubLObject cdolist_list_var = argnum_strings;
        SubLObject argnum_string = (SubLObject)cb_formula_templates.NIL;
        argnum_string = cdolist_list_var.first();
        while (cb_formula_templates.NIL != cdolist_list_var) {
            final SubLObject argnum = reader.parse_integer(argnum_string, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
            positions = (SubLObject)ConsesLow.cons(argnum, positions);
            cdolist_list_var = cdolist_list_var.rest();
            argnum_string = cdolist_list_var.first();
        }
        return positions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 14351L)
    public static SubLObject cb_formula_template_editing_state_update_target_elmt(final SubLObject target_elmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_formula_templates.NIL != forts.fort_p(target_elmt)) {
            final SubLObject state = cb_formula_templates.$cb_current_formula_template_editing_state$.getDynamicValue(thread);
            _csetf_formula_template_editing_state_target_mt(state, target_elmt);
            cb_formula_templates.$cb_current_formula_template_parent_mt$.setDynamicValue(target_elmt, thread);
            return state;
        }
        return (SubLObject)cb_formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 14691L)
    public static SubLObject cb_record_current_formula_template_editing_problem(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = cb_formula_templates.$cb_current_formula_template_editing_state$.getDynamicValue(thread);
        SubLObject problems = formula_template_editing_state_current_edit_problems(state);
        problems = (SubLObject)ConsesLow.cons(problem, problems);
        _csetf_formula_template_editing_state_current_edit_problems(state, problems);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 15093L)
    public static SubLObject cb_get_current_formula_template_editing_problems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = cb_formula_templates.$cb_current_formula_template_editing_state$.getDynamicValue(thread);
        final SubLObject problems = formula_template_editing_state_current_edit_problems(state);
        return problems;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 15326L)
    public static SubLObject cb_clear_current_formula_template_editing_problems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = cb_formula_templates.$cb_current_formula_template_editing_state$.getDynamicValue(thread);
        _csetf_formula_template_editing_state_current_edit_problems(state, (SubLObject)cb_formula_templates.NIL);
        return (SubLObject)cb_formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 15550L)
    public static SubLObject cb_enumerate_current_formula_template_editing_problems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_formula_templates.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    final SubLObject color_val = html_macros.$html_color_dark_red$.getGlobalValue();
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (cb_formula_templates.NIL != color_val) {
                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(color_val));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str93$Update_Error_s_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str94$The_following_error_s__occurred_d);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            SubLObject cdolist_list_var = cb_get_current_formula_template_editing_problems();
            SubLObject problem = (SubLObject)cb_formula_templates.NIL;
            problem = cdolist_list_var.first();
            while (cb_formula_templates.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_princ(problem);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                problem = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
        return (SubLObject)cb_formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 16257L)
    public static SubLObject cb_allow_formula_template_info_editing(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_formula_templates.NIL);
        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_formula_templates.$str56$post);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        if (cb_formula_templates.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            html_macros.$within_html_form$.bind((SubLObject)cb_formula_templates.T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_utilities.html_hidden_input((SubLObject)cb_formula_templates.$str95$cb_edit_formula_template_contents, (SubLObject)cb_formula_templates.T, (SubLObject)cb_formula_templates.UNPROVIDED);
            cb_draw_formula_template_selection_header(state);
            html_utilities.html_newline((SubLObject)cb_formula_templates.TWO_INTEGER);
            if (cb_formula_templates.NIL != cb_get_current_formula_template_editing_problems()) {
                cb_enumerate_current_formula_template_editing_problems();
                html_utilities.html_newline((SubLObject)cb_formula_templates.TWO_INTEGER);
            }
            html_utilities.html_princ((SubLObject)cb_formula_templates.$str96$Update_or_edit_any_of_the_formula);
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_formula_templates.$str97$_Change_);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_formula_templates.$str98$_button_to_update_the_fields__Onc);
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_formula_templates.$str99$_Assert_);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_formula_templates.$str100$_to_put_the_information_into_the_);
            html_utilities.html_newline((SubLObject)cb_formula_templates.TWO_INTEGER);
            cb_draw_current_formula_template_from_state(state);
            html_utilities.html_newline((SubLObject)cb_formula_templates.TWO_INTEGER);
            html_utilities.html_submit_input((SubLObject)cb_formula_templates.$str101$Change, (SubLObject)cb_formula_templates.$str102$change, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_formula_templates.TWO_INTEGER);
            html_utilities.html_submit_input((SubLObject)cb_formula_templates.$str103$Start_Over, (SubLObject)cb_formula_templates.$str104$start_over, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_formula_templates.TWO_INTEGER);
            html_utilities.html_submit_input((SubLObject)cb_formula_templates.$str105$Assert, (SubLObject)cb_formula_templates.$str106$assert, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 17250L)
    public static SubLObject cb_edit_formula_template_contents(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject start_overP = list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_formula_templates.$str104$start_over, args));
        final SubLObject assertP = list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_formula_templates.$str106$assert, args));
        if (cb_formula_templates.NIL != start_overP) {
            cb_formula_templates.$cb_current_formula_template_editing_state$.setDynamicValue((SubLObject)cb_formula_templates.NIL, thread);
            return cb_formula_templates((SubLObject)cb_formula_templates.UNPROVIDED);
        }
        final SubLObject state = cb_formula_templates.$cb_current_formula_template_editing_state$.getDynamicValue(thread);
        final SubLObject formula_template = formula_template_editing_state_formula_template(state);
        cb_clear_current_formula_template_editing_problems();
        cb_verify_formula_template_header_information(state, args);
        cb_update_formula_template_formula(formula_template, args);
        cb_update_formula_template_elmt(formula_template, args);
        cb_update_formula_template_single_entry(formula_template, args);
        cb_update_formula_template_ordering(formula_template, args);
        cb_update_formula_template_example(formula_template, args);
        SubLObject number = (SubLObject)cb_formula_templates.ZERO_INTEGER;
        SubLObject cdolist_list_var = formula_templates.formula_template_argpos_ordering(formula_template);
        SubLObject argpos_detail = (SubLObject)cb_formula_templates.NIL;
        argpos_detail = cdolist_list_var.first();
        while (cb_formula_templates.NIL != cdolist_list_var) {
            if (!argpos_detail.eql(formula_templates.formula_template_focal_term(formula_template))) {
                cb_update_formula_template_argpos_details(argpos_detail, number, args);
                number = Numbers.add(number, (SubLObject)cb_formula_templates.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argpos_detail = cdolist_list_var.first();
        }
        cb_recompute_formula_template_argpos_ordering(formula_template);
        if (cb_formula_templates.NIL == cb_get_current_formula_template_editing_problems() && cb_formula_templates.NIL != assertP) {
            return cb_assert_formula_templates_contents(state);
        }
        return cb_formula_templates((SubLObject)cb_formula_templates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 18750L)
    public static SubLObject cb_verify_formula_template_header_information(final SubLObject state, final SubLObject args) {
        final SubLObject formula_template = formula_template_editing_state_formula_template(state);
        final SubLObject term_name = formula_templates.formula_template_id(formula_template);
        if ((!term_name.isString() || cb_formula_templates.NIL != string_utilities.empty_string_p(term_name)) && cb_formula_templates.NIL == forts.fort_p(term_name)) {
            final SubLObject new_term_name = html_utilities.html_extract_input((SubLObject)cb_formula_templates.$str84$template_name, args);
            if (cb_formula_templates.NIL != string_utilities.empty_string_p(new_term_name)) {
                cb_record_current_formula_template_editing_problem((SubLObject)cb_formula_templates.$str108$The_template_must_have_a_name_);
            }
            else {
                formula_templates._csetf_formula_template_id(formula_template, new_term_name);
            }
        }
        cb_formula_template_editing_state_update_target_elmt(html_utilities.html_extract_input((SubLObject)cb_formula_templates.$str91$target_elmt, args));
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 19541L)
    public static SubLObject cb_update_formula_template_formula(final SubLObject formula_template, final SubLObject args) {
        final SubLObject old_formula = formula_templates.formula_template_formula(formula_template);
        SubLObject formula_elements = (SubLObject)cb_formula_templates.NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject field_name;
        SubLObject value_encoding;
        SubLObject value;
        for (cdotimes_end_var = Sequences.length(old_formula), i = (SubLObject)cb_formula_templates.NIL, i = (SubLObject)cb_formula_templates.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)cb_formula_templates.ONE_INTEGER)) {
            field_name = PrintLow.format((SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.$str109$formula_arg__D, i);
            value_encoding = html_utilities.html_extract_input(field_name, args);
            value = (SubLObject)cb_formula_templates.NIL;
            value = constants_high.find_constant(value_encoding);
            if (cb_formula_templates.NIL == value) {
                value = reader.read_from_string_ignoring_errors(value_encoding, (SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.$kw110$EOF, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
            }
            if (cb_formula_templates.NIL != cycl_grammar.cycl_represented_term_p(value)) {
                formula_elements = (SubLObject)ConsesLow.cons(value, formula_elements);
            }
            else {
                cb_record_current_formula_template_editing_problem(Sequences.cconcatenate((SubLObject)cb_formula_templates.$str111$Cannot_parse_formula_template_arg, new SubLObject[] { string_utilities.to_string(i), cb_formula_templates.$str112$_, value_encoding }));
                formula_elements = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg(old_formula, i, (SubLObject)cb_formula_templates.UNPROVIDED), formula_elements);
            }
        }
        formula_elements = Sequences.nreverse(formula_elements);
        formula_templates._csetf_formula_template_formula(formula_template, el_utilities.make_el_formula(formula_elements.first(), formula_elements.rest(), (SubLObject)cb_formula_templates.UNPROVIDED));
        return formula_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 20699L)
    public static SubLObject cb_update_formula_template_elmt(final SubLObject formula_template, final SubLObject args) {
        final SubLObject value_encoding = html_utilities.html_extract_input((SubLObject)cb_formula_templates.$str113$elmt, args);
        SubLObject value = (SubLObject)cb_formula_templates.NIL;
        value = constants_high.find_constant(value_encoding);
        if (cb_formula_templates.NIL == value) {
            value = reader.read_from_string_ignoring_errors(value_encoding, (SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.$kw110$EOF, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
        }
        if (cb_formula_templates.NIL != cycl_grammar.cycl_represented_term_p(value)) {
            formula_templates._csetf_formula_template_elmt(formula_template, value);
        }
        else {
            cb_record_current_formula_template_editing_problem(Sequences.cconcatenate((SubLObject)cb_formula_templates.$str114$Cannot_interpret_template_ELMt__, value_encoding));
        }
        return formula_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 21282L)
    public static SubLObject cb_update_formula_template_single_entry(final SubLObject formula_template, final SubLObject args) {
        if (cb_formula_templates.NIL != html_utilities.html_extract_input((SubLObject)cb_formula_templates.$str115$single_entry, args)) {
            formula_templates._csetf_formula_template_entry_format(formula_template, cb_formula_templates.$const116$SingleAssertionEntry);
        }
        else {
            formula_templates._csetf_formula_template_entry_format(formula_template, cb_formula_templates.$const117$MultipleAssertionEntry);
        }
        return formula_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 21615L)
    public static SubLObject cb_update_formula_template_ordering(final SubLObject formula_template, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predecessor = cb_utilities.cb_decode_fort_list_selector_result((SubLObject)cb_formula_templates.$str118$higher_priority, args);
        final SubLObject state = cb_formula_templates.$cb_current_formula_template_editing_state$.getDynamicValue(thread);
        if (cb_formula_templates.NIL != cb_utilities.cb_fort_list_none_selected_p(predecessor)) {
            _csetf_formula_template_editing_state_higher_priority_template(state, (SubLObject)cb_formula_templates.NIL);
        }
        else {
            _csetf_formula_template_editing_state_higher_priority_template(state, predecessor);
        }
        return formula_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 22132L)
    public static SubLObject cb_update_formula_template_example(final SubLObject formula_template, final SubLObject args) {
        final SubLObject formula_text = html_utilities.html_extract_input((SubLObject)cb_formula_templates.$str119$template_example, args);
        final SubLObject formula = reader.read_from_string_ignoring_errors(formula_text, (SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.$kw110$EOF, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
        if (cb_formula_templates.NIL != el_utilities.el_formula_p(formula)) {
            formula_templates._csetf_formula_template_examples(formula_template, (SubLObject)ConsesLow.list(formula));
        }
        else {
            formula_templates._csetf_formula_template_examples(formula_template, (SubLObject)cb_formula_templates.NIL);
        }
        return formula_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 22558L)
    public static SubLObject cb_recompute_formula_template_argpos_ordering(final SubLObject formula_template) {
        formula_templates.update_ftemplate_argpos_detail_ordering_information(formula_template);
        return formula_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 22795L)
    public static SubLObject cb_update_formula_template_argpos_details(final SubLObject argpos_detail, final SubLObject number, final SubLObject args) {
        formula_templates._csetf_arg_position_details_argument_position(argpos_detail, cb_update_ftemplate_argpos_details_argument_position(number, args));
        formula_templates._csetf_arg_position_details_ordering(argpos_detail, cb_update_ftemplate_argpos_details_ordering(number, args));
        formula_templates._csetf_arg_position_details_explanation(argpos_detail, cb_update_ftemplate_argpos_details_explanation(number, args));
        formula_templates._csetf_arg_position_details_gloss(argpos_detail, cb_update_ftemplate_argpos_details_gloss(number, args));
        formula_templates._csetf_arg_position_details_candidate_replacements(argpos_detail, cb_update_ftemplate_argpos_details_candidate_replacements(number, args));
        return argpos_detail;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 23706L)
    public static SubLObject cb_update_ftemplate_argpos_details_argument_position(final SubLObject number, final SubLObject args) {
        final SubLObject argpos_number = Numbers.add((SubLObject)cb_formula_templates.ONE_INTEGER, number);
        final SubLObject fieldname = PrintLow.format((SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.$str120$argpos__D, number);
        final SubLObject value_encoding = html_utilities.html_extract_input(fieldname, args);
        SubLObject value = reader.read_from_string_ignoring_errors(value_encoding, (SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.$kw110$EOF, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
        if (cb_formula_templates.NIL == cycl_grammar.cycl_represented_term_p(value)) {
            cb_record_current_formula_template_editing_problem(Sequences.cconcatenate((SubLObject)cb_formula_templates.$str121$Cannot_interpret_formula_argument, new SubLObject[] { string_utilities.to_string(argpos_number), cb_formula_templates.$str122$__, value_encoding }));
            value = el_utilities.make_unary_formula(cb_formula_templates.$const123$FormulaArgPositionFn, argpos_number);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 24377L)
    public static SubLObject cb_update_ftemplate_argpos_details_ordering(final SubLObject number, final SubLObject args) {
        final SubLObject argpos_number = Numbers.add((SubLObject)cb_formula_templates.ONE_INTEGER, number);
        final SubLObject fieldname = PrintLow.format((SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.$str124$argpos_order__D, number);
        final SubLObject value_encoding = html_utilities.html_extract_input(fieldname, args);
        SubLObject value = argpos_number;
        if (cb_formula_templates.NIL != number_utilities.number_string_p(value_encoding)) {
            value = reader.parse_integer(value_encoding, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
        }
        else {
            cb_record_current_formula_template_editing_problem(Sequences.cconcatenate((SubLObject)cb_formula_templates.$str125$Invalid_ordering_value_specified_, new SubLObject[] { string_utilities.to_string(argpos_number), cb_formula_templates.$str122$__, value_encoding }));
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 24974L)
    public static SubLObject cb_update_ftemplate_argpos_details_explanation(final SubLObject number, final SubLObject args) {
        final SubLObject argpos_number = Numbers.add((SubLObject)cb_formula_templates.ONE_INTEGER, number);
        final SubLObject fieldname = PrintLow.format((SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.$str126$argpos_explanation__D, number);
        final SubLObject value;
        final SubLObject value_encoding = value = html_utilities.html_extract_input(fieldname, args);
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 25295L)
    public static SubLObject cb_update_ftemplate_argpos_details_gloss(final SubLObject number, final SubLObject args) {
        final SubLObject argpos_number = Numbers.add((SubLObject)cb_formula_templates.ONE_INTEGER, number);
        final SubLObject fieldname = PrintLow.format((SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.$str127$argpos_gloss__D, number);
        final SubLObject value;
        final SubLObject value_encoding = value = html_utilities.html_extract_input(fieldname, args);
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 25603L)
    public static SubLObject cb_update_ftemplate_argpos_details_candidate_replacements(final SubLObject number, final SubLObject args) {
        final SubLObject argpos_number = Numbers.add((SubLObject)cb_formula_templates.ONE_INTEGER, number);
        final SubLObject fieldname_stem = PrintLow.format((SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.$str128$argpos_candidate_replacement__D_, number);
        SubLObject counter = (SubLObject)cb_formula_templates.ZERO_INTEGER;
        SubLObject value = (SubLObject)cb_formula_templates.NIL;
        SubLObject doneP = (SubLObject)cb_formula_templates.NIL;
        while (cb_formula_templates.NIL == doneP) {
            final SubLObject fieldname = Sequences.cconcatenate(fieldname_stem, string_utilities.to_string(counter));
            final SubLObject value_encoding = html_utilities.html_extract_input(fieldname, args);
            if (cb_formula_templates.NIL == value_encoding || cb_formula_templates.NIL != string_utilities.empty_string_p(value_encoding)) {
                doneP = (SubLObject)cb_formula_templates.T;
            }
            else {
                final SubLObject candidate_replacement = reader.read_from_string_ignoring_errors(value_encoding, (SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.$kw110$EOF, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                if (cb_formula_templates.NIL != cycl_grammar.cycl_represented_term_p(candidate_replacement)) {
                    value = (SubLObject)ConsesLow.cons(candidate_replacement, value);
                }
                else {
                    cb_record_current_formula_template_editing_problem(Sequences.cconcatenate((SubLObject)cb_formula_templates.$str129$Cannot_interpret_candidate_replac, new SubLObject[] { string_utilities.to_string(Numbers.add(counter, (SubLObject)cb_formula_templates.ONE_INTEGER)), cb_formula_templates.$str130$_for_argument_position_, string_utilities.to_string(argpos_number), cb_formula_templates.$str131$___, value_encoding }));
                }
            }
            counter = Numbers.add(counter, (SubLObject)cb_formula_templates.ONE_INTEGER);
        }
        return Sequences.nreverse(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 26772L)
    public static SubLObject cb_draw_current_formula_template_from_state(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula_template = formula_template_editing_state_formula_template(state);
        final SubLObject base_assertion = formula_template_editing_state_base_assertion(state);
        final SubLObject base_el_formula = get_formula_template_editing_state_base_el_formula(state);
        final SubLObject higher_priority = formula_template_editing_state_higher_priority_template(state);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_formula_templates.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            if (cb_formula_templates.NIL != assertion_handles.assertion_p(base_assertion)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str132$Original_Assertion__);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        cb_utilities.cb_form(base_assertion, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str133$Formula__);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        final SubLObject terms = cycl_utilities.formula_terms(formula_templates.formula_template_formula(formula_template), (SubLObject)cb_formula_templates.$kw74$IGNORE);
                        SubLObject list_var = (SubLObject)cb_formula_templates.NIL;
                        SubLObject v_term = (SubLObject)cb_formula_templates.NIL;
                        SubLObject counter = (SubLObject)cb_formula_templates.NIL;
                        list_var = terms;
                        v_term = list_var.first();
                        for (counter = (SubLObject)cb_formula_templates.ZERO_INTEGER; cb_formula_templates.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), counter = number_utilities.f_1X(counter)) {
                            final SubLObject argpos_detail = formula_template_utilities.find_matching_formula_template_argpos_details(formula_template, counter);
                            SubLObject color = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                            if (cb_formula_templates.NIL == argpos_detail) {
                                color = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                            }
                            else if (argpos_detail.eql(formula_templates.formula_template_focal_term(formula_template))) {
                                color = html_macros.$html_color_lighter_blue$.getGlobalValue();
                            }
                            else if (cb_formula_templates.NIL != formula_templates.arg_position_details_is_editable(argpos_detail)) {
                                color = html_macros.$html_color_lighter_grey$.getGlobalValue();
                            }
                            else {
                                color = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                if (cb_formula_templates.NIL != color) {
                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_markup(color);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str134$Argument__);
                                    html_utilities.html_princ(counter);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    final SubLObject fieldname = Sequences.cconcatenate((SubLObject)cb_formula_templates.$str135$formula_arg_, string_utilities.to_string(counter));
                                    if (cb_formula_templates.NIL == argpos_detail) {
                                        cb_utilities.cb_form(v_term, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                                        html_utilities.html_hidden_input(fieldname, v_term, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    }
                                    else if (cb_formula_templates.NIL != formula_templates.arg_position_details_is_editable(argpos_detail)) {
                                        html_utilities.html_text_input(fieldname, v_term, (SubLObject)cb_formula_templates.$int69$60);
                                    }
                                    else {
                                        cb_utilities.cb_form(v_term, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                                        html_utilities.html_hidden_input(fieldname, v_term, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str136$Assert_Mt__);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_text_input((SubLObject)cb_formula_templates.$str113$elmt, formula_templates.formula_template_elmt(formula_template), (SubLObject)cb_formula_templates.$int69$60);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str137$Single_Entry__);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_checkbox_input((SubLObject)cb_formula_templates.$str115$single_entry, (SubLObject)cb_formula_templates.T, formula_templates.formula_template_is_single_entryP(formula_template), (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str138$Appears_after_this_template__);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    cb_utilities.cb_fort_list_selector((SubLObject)cb_formula_templates.$str118$higher_priority, isa.all_fort_instances(formula_templates.formula_template_topic(formula_template), (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED), higher_priority, (SubLObject)cb_formula_templates.ONE_INTEGER, Symbols.symbol_function((SubLObject)cb_formula_templates.IDENTITY), (SubLObject)cb_formula_templates.T, (SubLObject)cb_formula_templates.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str139$Template_Example__);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    SubLObject example_formula = base_el_formula;
                    final SubLObject current_example = formula_templates.formula_template_examples(formula_template).first();
                    if (cb_formula_templates.NIL != el_utilities.el_formula_p(current_example)) {
                        example_formula = current_example;
                    }
                    if (cb_formula_templates.NIL != cb_parameters.$cb_wrap_interactor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_formula_templates.$str119$template_example);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_formula_templates.$int69$60);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_formula_templates.THREE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_formula_templates.$str140$virtual);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            html_utilities.html_princ(example_formula);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                    }
                    else {
                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_formula_templates.$str119$template_example);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_formula_templates.$int141$80);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_formula_templates.THREE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            html_utilities.html_princ(example_formula);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_formula_templates.TWO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str142$Argument_Position_Details);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            cb_draw_argpos_details_for_current_formula_template(state, formula_template, base_el_formula);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 31407L)
    public static SubLObject cb_draw_argpos_details_for_current_formula_template(final SubLObject state, final SubLObject formula_template, final SubLObject base_el_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject number = (SubLObject)cb_formula_templates.ZERO_INTEGER;
        SubLObject cdolist_list_var = formula_templates.formula_template_argpos_ordering(formula_template);
        SubLObject argpos_detail = (SubLObject)cb_formula_templates.NIL;
        argpos_detail = cdolist_list_var.first();
        while (cb_formula_templates.NIL != cdolist_list_var) {
            if (!argpos_detail.eql(formula_templates.formula_template_focal_term(formula_template))) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    final SubLObject color = html_macros.$html_color_lighter_grey$.getGlobalValue();
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    if (cb_formula_templates.NIL != color) {
                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(color);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str143$Argument_Position_);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        final SubLObject argpos = formula_templates.arg_position_details_argument_position(argpos_detail);
                        html_utilities.html_format_input(argpos, (SubLObject)cb_formula_templates.$int69$60, (SubLObject)cb_formula_templates.$str120$argpos__D, number, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        final SubLObject argpos2 = formula_templates.arg_position_details_argument_position(argpos_detail);
                        final SubLObject formula = formula_templates.formula_template_formula(formula_template);
                        SubLObject base_element = base_el_formula;
                        SubLObject curr_element = formula;
                        SubLObject cdolist_list_var_$82 = argpos2.rest();
                        SubLObject argnum = (SubLObject)cb_formula_templates.NIL;
                        argnum = cdolist_list_var_$82.first();
                        while (cb_formula_templates.NIL != cdolist_list_var_$82) {
                            curr_element = ConsesLow.nth(argnum, curr_element);
                            base_element = ConsesLow.nth(argnum, base_element);
                            cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                            argnum = cdolist_list_var_$82.first();
                        }
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str144$This_corresponds_to_);
                        cb_utilities.cb_form(curr_element, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str145$__and_to_);
                        cb_utilities.cb_form(base_element, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str146$_in_the_base_formula_);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str147$Ordering__);
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        final SubLObject ordering = formula_templates.arg_position_details_ordering(argpos_detail);
                        html_utilities.html_format_input(ordering, (SubLObject)cb_formula_templates.$int69$60, (SubLObject)cb_formula_templates.$str124$argpos_order__D, number, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str148$Gloss__);
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        SubLObject gloss = formula_templates.arg_position_details_gloss(argpos_detail);
                        if (!gloss.isString()) {
                            gloss = (SubLObject)cb_formula_templates.$str86$;
                        }
                        html_utilities.html_format_input(gloss, (SubLObject)cb_formula_templates.$int141$80, (SubLObject)cb_formula_templates.$str127$argpos_gloss__D, number, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str149$Explanation__);
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        SubLObject explanation = formula_templates.arg_position_details_explanation(argpos_detail);
                        if (!explanation.isString()) {
                            explanation = (SubLObject)cb_formula_templates.$str86$;
                        }
                        html_utilities.html_format_input(explanation, (SubLObject)cb_formula_templates.$int141$80, (SubLObject)cb_formula_templates.$str126$argpos_explanation__D, number, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str150$Candidate_Replacements__);
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        final SubLObject candidate_replacements = formula_templates.arg_position_details_candidate_replacements(argpos_detail);
                        if (cb_formula_templates.NIL == candidate_replacements) {
                            final SubLObject fieldname = PrintLow.format((SubLObject)cb_formula_templates.NIL, (SubLObject)cb_formula_templates.$str151$argpos_candidate_replacement__D_0, number);
                            html_utilities.html_text_input(fieldname, (SubLObject)cb_formula_templates.$str86$, (SubLObject)cb_formula_templates.$int141$80);
                        }
                        SubLObject list_var = (SubLObject)cb_formula_templates.NIL;
                        SubLObject candidate_replacement = (SubLObject)cb_formula_templates.NIL;
                        SubLObject count = (SubLObject)cb_formula_templates.NIL;
                        list_var = candidate_replacements;
                        candidate_replacement = list_var.first();
                        for (count = (SubLObject)cb_formula_templates.ZERO_INTEGER; cb_formula_templates.NIL != list_var; list_var = list_var.rest(), candidate_replacement = list_var.first(), count = Numbers.add((SubLObject)cb_formula_templates.ONE_INTEGER, count)) {
                            html_utilities.html_format_input(candidate_replacement, (SubLObject)cb_formula_templates.$int141$80, (SubLObject)cb_formula_templates.$str152$candidate_replacement__D__D, number, count, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                number = Numbers.add(number, (SubLObject)cb_formula_templates.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argpos_detail = cdolist_list_var.first();
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 35198L)
    public static SubLObject cb_assert_ftemplate_generate_status_gif(final SubLObject successP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_formula_templates.NIL != successP) {
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path((SubLObject)cb_formula_templates.$kw155$TEMPLATE_SUCCESS);
            final SubLObject align = (SubLObject)cb_formula_templates.$kw66$TOP;
            final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_formula_templates.$kw155$TEMPLATE_SUCCESS);
            final SubLObject border = (SubLObject)cb_formula_templates.ZERO_INTEGER;
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(image_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            if (cb_formula_templates.NIL != alt) {
                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(alt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            }
            if (cb_formula_templates.NIL != align) {
                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(align));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            }
            if (cb_formula_templates.NIL != border) {
                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(border);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        else {
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path((SubLObject)cb_formula_templates.$kw153$TEMPLATE_FAILURE);
            final SubLObject align = (SubLObject)cb_formula_templates.$kw66$TOP;
            final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_formula_templates.$kw153$TEMPLATE_FAILURE);
            final SubLObject border = (SubLObject)cb_formula_templates.ZERO_INTEGER;
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            html_utilities.html_markup(image_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            if (cb_formula_templates.NIL != alt) {
                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(alt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            }
            if (cb_formula_templates.NIL != align) {
                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(align));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            }
            if (cb_formula_templates.NIL != border) {
                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup(border);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 35371L)
    public static SubLObject cb_assert_ftemplate_draw_status_datacell(final SubLObject successP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw63$CENTER));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
            cb_assert_ftemplate_generate_status_gif(successP);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return (SubLObject)cb_formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 35564L)
    public static SubLObject cb_assert_ftemplate_action_row(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_formula_templates.$list157);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject message = (SubLObject)cb_formula_templates.NIL;
        SubLObject successP = (SubLObject)cb_formula_templates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_formula_templates.$list157);
        message = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_formula_templates.$list157);
        successP = current.first();
        current = current.rest();
        if (cb_formula_templates.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)cb_formula_templates.$sym158$HTML_TABLE_ROW, (SubLObject)ConsesLow.list((SubLObject)cb_formula_templates.$sym159$HTML_FANCY_TABLE_DATA, (SubLObject)cb_formula_templates.$list160, (SubLObject)ConsesLow.list((SubLObject)cb_formula_templates.$sym161$HTML_PRINC, message)), (SubLObject)ConsesLow.list((SubLObject)cb_formula_templates.$sym159$HTML_FANCY_TABLE_DATA, (SubLObject)cb_formula_templates.$list162, reader.bq_cons((SubLObject)cb_formula_templates.$sym163$PROGN, ConsesLow.append(body, (SubLObject)cb_formula_templates.NIL))), (SubLObject)ConsesLow.list((SubLObject)cb_formula_templates.$sym164$CB_ASSERT_FTEMPLATE_DRAW_STATUS_DATACELL, successP));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_formula_templates.$list157);
        return (SubLObject)cb_formula_templates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 35949L)
    public static SubLObject cb_assert_formula_templates_contents(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula_template = formula_template_editing_state_formula_template(state);
        final SubLObject predecessor = formula_template_editing_state_higher_priority_template(state);
        final SubLObject target_mt = formula_template_editing_state_target_mt(state);
        final SubLObject title_var = (SubLObject)cb_formula_templates.$str165$Asserting_Formula_Template;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_formula_templates.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_formula_templates.$str41$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_formula_templates.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_formula_templates.$str42$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
            final SubLObject _prev_bind_0_$91 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_formula_templates.$kw43$UNINITIALIZED) ? ConsesLow.list(cb_formula_templates.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_formula_templates.$kw44$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_formula_templates.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                final SubLObject _prev_bind_0_$92 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_formula_templates.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_formula_templates.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_formula_templates.$str47$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_formula_templates.$str48$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_formula_templates.$str49$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_formula_templates.$str50$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_formula_templates.$str51$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                            if (cb_formula_templates.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_formula_templates.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_formula_templates.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_formula_templates.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                        html_utilities.html_newline((SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str166$Putting_assertions_into_KB_____);
                        html_utilities.html_newline((SubLObject)cb_formula_templates.TWO_INTEGER);
                        SubLObject successP = (SubLObject)cb_formula_templates.NIL;
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_formula_templates.ZERO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str167$Creating_or_finding_constant);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    successP = formula_template_utilities.reify_formula_template_description(formula_template);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str168$Making_a_TKB_template);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    successP = formula_template_utilities.make_formula_template_type_assertions(formula_template);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str169$Asserting_template_formula);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    successP = formula_template_utilities.assert_formula_template_formula(formula_template, target_mt);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str170$Asserting_template_Mt);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    successP = formula_template_utilities.assert_formula_template_elmt(formula_template, target_mt);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str171$Asserting_focal_term_for_template);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    successP = formula_template_utilities.assert_formula_template_focal_term_position(formula_template, target_mt);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str172$Asserting_template_entry_format);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    successP = formula_template_utilities.assert_formula_template_assertion_format(formula_template, target_mt);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str173$Asserting_template_glosses);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    successP = formula_template_utilities.assert_formula_template_assertion_glosses(formula_template, target_mt);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str174$Asserting_template_explanations);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    successP = formula_template_utilities.assert_formula_template_assertion_explanations(formula_template, target_mt);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str175$Asserting_template_candidate_repl);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    successP = formula_template_utilities.assert_formula_template_candidate_replacements(formula_template, target_mt);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str176$Asserting_any_validation_required);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    successP = formula_template_utilities.assert_formula_template_assertion_validation_required(formula_template, target_mt);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str177$Asserting_any_invisible_replaceme);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    successP = formula_template_utilities.assert_formula_template_assertion_replacements_invisible(formula_template, target_mt);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str178$Asserting_any_example_information);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    successP = formula_template_utilities.assert_formula_template_examples(formula_template, target_mt);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cb_assert_ftemplate_draw_status_datacell(successP);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            if (cb_formula_templates.NIL != forts.fort_p(predecessor)) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw62$RIGHT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_formula_templates.$str179$Asserting_template_ordering_infor);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw65$LEFT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_formula_templates.$kw66$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                        successP = formula_template_utilities.assert_formula_template_priority_ordering(formula_template, target_mt, predecessor);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    cb_assert_ftemplate_draw_status_datacell(successP);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_formula_templates.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_formula_templates.ZERO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                        final SubLObject _prev_bind_0_$135 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str180$To_inspect_the_new_template__clic);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    cb_utilities.cb_form(formula_templates.formula_template_id(formula_template), (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                            final SubLObject _prev_bind_0_$139 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$140 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_formula_templates.$str181$To_create_a_new_template__click_h);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$140, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                    final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_formula_templates.NIL);
                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_formula_templates.$str56$post);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    if (cb_formula_templates.NIL != frame_name_var) {
                                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                        html_utilities.html_markup(frame_name_var);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_formula_templates.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$142 = html_macros.$html_safe_print$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_formula_templates.T, thread);
                                        html_macros.$within_html_form$.bind((SubLObject)cb_formula_templates.T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_utilities.html_hidden_input((SubLObject)cb_formula_templates.$str57$cb_formula_template_restart_with_, (SubLObject)cb_formula_templates.T, (SubLObject)cb_formula_templates.UNPROVIDED);
                                        html_utilities.html_submit_input((SubLObject)cb_formula_templates.$str182$Start_New, (SubLObject)cb_formula_templates.UNPROVIDED, (SubLObject)cb_formula_templates.UNPROVIDED);
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    }
                                    finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$142, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$141, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$139, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$135, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$92, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$91, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_formula_templates.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-formula-templates.lisp", position = 39898L)
    public static SubLObject cb_formula_template_restart_with_clean_state(final SubLObject args) {
        cb_reset_current_formula_template_editing_state();
        return cb_formula_templates((SubLObject)cb_formula_templates.UNPROVIDED);
    }
    
    public static SubLObject declare_cb_formula_templates_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "formula_template_editing_state_print_function_trampoline", "FORMULA-TEMPLATE-EDITING-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "formula_template_editing_state_p", "FORMULA-TEMPLATE-EDITING-STATE-P", 1, 0, false);
        new $formula_template_editing_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "formula_template_editing_state_phase", "FORMULA-TEMPLATE-EDITING-STATE-PHASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "formula_template_editing_state_formula_template", "FORMULA-TEMPLATE-EDITING-STATE-FORMULA-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "formula_template_editing_state_base_assertion", "FORMULA-TEMPLATE-EDITING-STATE-BASE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "formula_template_editing_state_current_edit_problems", "FORMULA-TEMPLATE-EDITING-STATE-CURRENT-EDIT-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "formula_template_editing_state_target_mt", "FORMULA-TEMPLATE-EDITING-STATE-TARGET-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "formula_template_editing_state_higher_priority_template", "FORMULA-TEMPLATE-EDITING-STATE-HIGHER-PRIORITY-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "formula_template_editing_state_base_formula", "FORMULA-TEMPLATE-EDITING-STATE-BASE-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "_csetf_formula_template_editing_state_phase", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-PHASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "_csetf_formula_template_editing_state_formula_template", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-FORMULA-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "_csetf_formula_template_editing_state_base_assertion", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-BASE-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "_csetf_formula_template_editing_state_current_edit_problems", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-CURRENT-EDIT-PROBLEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "_csetf_formula_template_editing_state_target_mt", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-TARGET-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "_csetf_formula_template_editing_state_higher_priority_template", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-HIGHER-PRIORITY-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "_csetf_formula_template_editing_state_base_formula", "_CSETF-FORMULA-TEMPLATE-EDITING-STATE-BASE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "make_formula_template_editing_state", "MAKE-FORMULA-TEMPLATE-EDITING-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "visit_defstruct_formula_template_editing_state", "VISIT-DEFSTRUCT-FORMULA-TEMPLATE-EDITING-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "visit_defstruct_object_formula_template_editing_state_method", "VISIT-DEFSTRUCT-OBJECT-FORMULA-TEMPLATE-EDITING-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "new_formula_template_editing_state", "NEW-FORMULA-TEMPLATE-EDITING-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "get_formula_template_editing_state_base_el_formula", "GET-FORMULA-TEMPLATE-EDITING-STATE-BASE-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_reset_current_formula_template_editing_state", "CB-RESET-CURRENT-FORMULA-TEMPLATE-EDITING-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_formula_templates", "CB-FORMULA-TEMPLATES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_create_new_formula_template", "CB-CREATE-NEW-FORMULA-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_draw_formula_template_base_assertion", "CB-DRAW-FORMULA-TEMPLATE-BASE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_draw_formula_template_base_formula_editor", "CB-DRAW-FORMULA-TEMPLATE-BASE-FORMULA-EDITOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_formula_template_use_base_el_formula", "CB-FORMULA-TEMPLATE-USE-BASE-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_draw_formula_template_from_assertion", "CB-DRAW-FORMULA-TEMPLATE-FROM-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_draw_formula_template_base_el_formula", "CB-DRAW-FORMULA-TEMPLATE-BASE-EL-FORMULA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_draw_formula_template_selection_header", "CB-DRAW-FORMULA-TEMPLATE-SELECTION-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_build_formula_template_basics", "CB-BUILD-FORMULA-TEMPLATE-BASICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_formula_template_convert_argnum_positions", "CB-FORMULA-TEMPLATE-CONVERT-ARGNUM-POSITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_formula_template_editing_state_update_target_elmt", "CB-FORMULA-TEMPLATE-EDITING-STATE-UPDATE-TARGET-ELMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_record_current_formula_template_editing_problem", "CB-RECORD-CURRENT-FORMULA-TEMPLATE-EDITING-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_get_current_formula_template_editing_problems", "CB-GET-CURRENT-FORMULA-TEMPLATE-EDITING-PROBLEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_clear_current_formula_template_editing_problems", "CB-CLEAR-CURRENT-FORMULA-TEMPLATE-EDITING-PROBLEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_enumerate_current_formula_template_editing_problems", "CB-ENUMERATE-CURRENT-FORMULA-TEMPLATE-EDITING-PROBLEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_allow_formula_template_info_editing", "CB-ALLOW-FORMULA-TEMPLATE-INFO-EDITING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_edit_formula_template_contents", "CB-EDIT-FORMULA-TEMPLATE-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_verify_formula_template_header_information", "CB-VERIFY-FORMULA-TEMPLATE-HEADER-INFORMATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_update_formula_template_formula", "CB-UPDATE-FORMULA-TEMPLATE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_update_formula_template_elmt", "CB-UPDATE-FORMULA-TEMPLATE-ELMT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_update_formula_template_single_entry", "CB-UPDATE-FORMULA-TEMPLATE-SINGLE-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_update_formula_template_ordering", "CB-UPDATE-FORMULA-TEMPLATE-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_update_formula_template_example", "CB-UPDATE-FORMULA-TEMPLATE-EXAMPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_recompute_formula_template_argpos_ordering", "CB-RECOMPUTE-FORMULA-TEMPLATE-ARGPOS-ORDERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_update_formula_template_argpos_details", "CB-UPDATE-FORMULA-TEMPLATE-ARGPOS-DETAILS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_update_ftemplate_argpos_details_argument_position", "CB-UPDATE-FTEMPLATE-ARGPOS-DETAILS-ARGUMENT-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_update_ftemplate_argpos_details_ordering", "CB-UPDATE-FTEMPLATE-ARGPOS-DETAILS-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_update_ftemplate_argpos_details_explanation", "CB-UPDATE-FTEMPLATE-ARGPOS-DETAILS-EXPLANATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_update_ftemplate_argpos_details_gloss", "CB-UPDATE-FTEMPLATE-ARGPOS-DETAILS-GLOSS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_update_ftemplate_argpos_details_candidate_replacements", "CB-UPDATE-FTEMPLATE-ARGPOS-DETAILS-CANDIDATE-REPLACEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_draw_current_formula_template_from_state", "CB-DRAW-CURRENT-FORMULA-TEMPLATE-FROM-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_draw_argpos_details_for_current_formula_template", "CB-DRAW-ARGPOS-DETAILS-FOR-CURRENT-FORMULA-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_assert_ftemplate_generate_status_gif", "CB-ASSERT-FTEMPLATE-GENERATE-STATUS-GIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_assert_ftemplate_draw_status_datacell", "CB-ASSERT-FTEMPLATE-DRAW-STATUS-DATACELL", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_formula_templates", "cb_assert_ftemplate_action_row", "CB-ASSERT-FTEMPLATE-ACTION-ROW");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_assert_formula_templates_contents", "CB-ASSERT-FORMULA-TEMPLATES-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_formula_templates", "cb_formula_template_restart_with_clean_state", "CB-FORMULA-TEMPLATE-RESTART-WITH-CLEAN-STATE", 1, 0, false);
        return (SubLObject)cb_formula_templates.NIL;
    }
    
    public static SubLObject init_cb_formula_templates_file() {
        cb_formula_templates.$dtp_formula_template_editing_state$ = SubLFiles.defconstant("*DTP-FORMULA-TEMPLATE-EDITING-STATE*", (SubLObject)cb_formula_templates.$sym0$FORMULA_TEMPLATE_EDITING_STATE);
        cb_formula_templates.$cb_current_formula_template_editing_state$ = SubLFiles.defparameter("*CB-CURRENT-FORMULA-TEMPLATE-EDITING-STATE*", (SubLObject)cb_formula_templates.NIL);
        cb_formula_templates.$cb_current_formula_template_subtopic$ = SubLFiles.defparameter("*CB-CURRENT-FORMULA-TEMPLATE-SUBTOPIC*", (SubLObject)cb_formula_templates.NIL);
        cb_formula_templates.$cb_current_formula_template_parent_mt$ = SubLFiles.defparameter("*CB-CURRENT-FORMULA-TEMPLATE-PARENT-MT*", (SubLObject)cb_formula_templates.NIL);
        return (SubLObject)cb_formula_templates.NIL;
    }
    
    public static SubLObject setup_cb_formula_templates_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cb_formula_templates.$dtp_formula_template_editing_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_formula_templates.$sym7$FORMULA_TEMPLATE_EDITING_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cb_formula_templates.$list8);
        Structures.def_csetf((SubLObject)cb_formula_templates.$sym9$FORMULA_TEMPLATE_EDITING_STATE_PHASE, (SubLObject)cb_formula_templates.$sym10$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_PHASE);
        Structures.def_csetf((SubLObject)cb_formula_templates.$sym11$FORMULA_TEMPLATE_EDITING_STATE_FORMULA_TEMPLATE, (SubLObject)cb_formula_templates.$sym12$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_FORMULA_TEMPLATE);
        Structures.def_csetf((SubLObject)cb_formula_templates.$sym13$FORMULA_TEMPLATE_EDITING_STATE_BASE_ASSERTION, (SubLObject)cb_formula_templates.$sym14$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_BASE_ASSERTION);
        Structures.def_csetf((SubLObject)cb_formula_templates.$sym15$FORMULA_TEMPLATE_EDITING_STATE_CURRENT_EDIT_PROBLEMS, (SubLObject)cb_formula_templates.$sym16$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_CURRENT_EDIT_PROBLEMS);
        Structures.def_csetf((SubLObject)cb_formula_templates.$sym17$FORMULA_TEMPLATE_EDITING_STATE_TARGET_MT, (SubLObject)cb_formula_templates.$sym18$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_TARGET_MT);
        Structures.def_csetf((SubLObject)cb_formula_templates.$sym19$FORMULA_TEMPLATE_EDITING_STATE_HIGHER_PRIORITY_TEMPLATE, (SubLObject)cb_formula_templates.$sym20$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_HIGHER_PRIORITY_TEMPLATE);
        Structures.def_csetf((SubLObject)cb_formula_templates.$sym21$FORMULA_TEMPLATE_EDITING_STATE_BASE_FORMULA, (SubLObject)cb_formula_templates.$sym22$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_BASE_FORMULA);
        Equality.identity((SubLObject)cb_formula_templates.$sym0$FORMULA_TEMPLATE_EDITING_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cb_formula_templates.$dtp_formula_template_editing_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_formula_templates.$sym35$VISIT_DEFSTRUCT_OBJECT_FORMULA_TEMPLATE_EDITING_STATE_METHOD));
        utilities_macros.register_html_state_variable((SubLObject)cb_formula_templates.$sym37$_CB_CURRENT_FORMULA_TEMPLATE_EDITING_STATE_);
        utilities_macros.register_html_state_variable((SubLObject)cb_formula_templates.$sym38$_CB_CURRENT_FORMULA_TEMPLATE_SUBTOPIC_);
        utilities_macros.register_html_state_variable((SubLObject)cb_formula_templates.$sym39$_CB_CURRENT_FORMULA_TEMPLATE_PARENT_MT_);
        html_macros.note_cgi_handler_function((SubLObject)cb_formula_templates.$sym54$CB_FORMULA_TEMPLATES, (SubLObject)cb_formula_templates.$kw55$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_formula_templates.$sym72$CB_FORMULA_TEMPLATE_USE_BASE_EL_FORMULA, (SubLObject)cb_formula_templates.$kw55$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_formula_templates.$sym92$CB_BUILD_FORMULA_TEMPLATE_BASICS, (SubLObject)cb_formula_templates.$kw55$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_formula_templates.$sym107$CB_EDIT_FORMULA_TEMPLATE_CONTENTS, (SubLObject)cb_formula_templates.$kw55$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_formula_templates.$kw153$TEMPLATE_FAILURE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_formula_templates.$str154$red_diam_gif, (SubLObject)cb_formula_templates.NIL));
        Hashtables.sethash((SubLObject)cb_formula_templates.$kw155$TEMPLATE_SUCCESS, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_formula_templates.$str156$green_gif, (SubLObject)cb_formula_templates.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_formula_templates.$sym183$CB_ASSERT_FORMULA_TEMPLATES_CONTENTS, (SubLObject)cb_formula_templates.$kw55$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_formula_templates.$sym184$CB_FORMULA_TEMPLATE_RESTART_WITH_CLEAN_STATE, (SubLObject)cb_formula_templates.$kw55$HTML_HANDLER);
        return (SubLObject)cb_formula_templates.NIL;
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
    
    static {
        me = (SubLFile)new cb_formula_templates();
        cb_formula_templates.$dtp_formula_template_editing_state$ = null;
        cb_formula_templates.$cb_current_formula_template_editing_state$ = null;
        cb_formula_templates.$cb_current_formula_template_subtopic$ = null;
        cb_formula_templates.$cb_current_formula_template_parent_mt$ = null;
        $sym0$FORMULA_TEMPLATE_EDITING_STATE = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE");
        $sym1$FORMULA_TEMPLATE_EDITING_STATE_P = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHASE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-EDIT-PROBLEMS"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-MT"), (SubLObject)SubLObjectFactory.makeSymbol("HIGHER-PRIORITY-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-FORMULA"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PHASE"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("BASE-ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT-EDIT-PROBLEMS"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET-MT"), (SubLObject)SubLObjectFactory.makeKeyword("HIGHER-PRIORITY-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("BASE-FORMULA"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-PHASE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-FORMULA-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-BASE-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-CURRENT-EDIT-PROBLEMS"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-TARGET-MT"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-HIGHER-PRIORITY-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-BASE-FORMULA"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-PHASE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-FORMULA-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-BASE-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-CURRENT-EDIT-PROBLEMS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-TARGET-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-HIGHER-PRIORITY-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-BASE-FORMULA"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$FORMULA_TEMPLATE_EDITING_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-P"));
        $sym9$FORMULA_TEMPLATE_EDITING_STATE_PHASE = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-PHASE");
        $sym10$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_PHASE = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-PHASE");
        $sym11$FORMULA_TEMPLATE_EDITING_STATE_FORMULA_TEMPLATE = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-FORMULA-TEMPLATE");
        $sym12$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_FORMULA_TEMPLATE = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-FORMULA-TEMPLATE");
        $sym13$FORMULA_TEMPLATE_EDITING_STATE_BASE_ASSERTION = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-BASE-ASSERTION");
        $sym14$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_BASE_ASSERTION = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-BASE-ASSERTION");
        $sym15$FORMULA_TEMPLATE_EDITING_STATE_CURRENT_EDIT_PROBLEMS = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-CURRENT-EDIT-PROBLEMS");
        $sym16$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_CURRENT_EDIT_PROBLEMS = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-CURRENT-EDIT-PROBLEMS");
        $sym17$FORMULA_TEMPLATE_EDITING_STATE_TARGET_MT = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-TARGET-MT");
        $sym18$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_TARGET_MT = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-TARGET-MT");
        $sym19$FORMULA_TEMPLATE_EDITING_STATE_HIGHER_PRIORITY_TEMPLATE = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-HIGHER-PRIORITY-TEMPLATE");
        $sym20$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_HIGHER_PRIORITY_TEMPLATE = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-HIGHER-PRIORITY-TEMPLATE");
        $sym21$FORMULA_TEMPLATE_EDITING_STATE_BASE_FORMULA = SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-EDITING-STATE-BASE-FORMULA");
        $sym22$_CSETF_FORMULA_TEMPLATE_EDITING_STATE_BASE_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-FORMULA-TEMPLATE-EDITING-STATE-BASE-FORMULA");
        $kw23$PHASE = SubLObjectFactory.makeKeyword("PHASE");
        $kw24$FORMULA_TEMPLATE = SubLObjectFactory.makeKeyword("FORMULA-TEMPLATE");
        $kw25$BASE_ASSERTION = SubLObjectFactory.makeKeyword("BASE-ASSERTION");
        $kw26$CURRENT_EDIT_PROBLEMS = SubLObjectFactory.makeKeyword("CURRENT-EDIT-PROBLEMS");
        $kw27$TARGET_MT = SubLObjectFactory.makeKeyword("TARGET-MT");
        $kw28$HIGHER_PRIORITY_TEMPLATE = SubLObjectFactory.makeKeyword("HIGHER-PRIORITY-TEMPLATE");
        $kw29$BASE_FORMULA = SubLObjectFactory.makeKeyword("BASE-FORMULA");
        $str30$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw31$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym32$MAKE_FORMULA_TEMPLATE_EDITING_STATE = SubLObjectFactory.makeSymbol("MAKE-FORMULA-TEMPLATE-EDITING-STATE");
        $kw33$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw34$END = SubLObjectFactory.makeKeyword("END");
        $sym35$VISIT_DEFSTRUCT_OBJECT_FORMULA_TEMPLATE_EDITING_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORMULA-TEMPLATE-EDITING-STATE-METHOD");
        $kw36$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $sym37$_CB_CURRENT_FORMULA_TEMPLATE_EDITING_STATE_ = SubLObjectFactory.makeSymbol("*CB-CURRENT-FORMULA-TEMPLATE-EDITING-STATE*");
        $sym38$_CB_CURRENT_FORMULA_TEMPLATE_SUBTOPIC_ = SubLObjectFactory.makeSymbol("*CB-CURRENT-FORMULA-TEMPLATE-SUBTOPIC*");
        $sym39$_CB_CURRENT_FORMULA_TEMPLATE_PARENT_MT_ = SubLObjectFactory.makeSymbol("*CB-CURRENT-FORMULA-TEMPLATE-PARENT-MT*");
        $str40$Formula_Template_Editor = SubLObjectFactory.makeString("Formula Template Editor");
        $str41$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str42$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw43$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw44$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw45$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw46$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str47$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str48$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str49$button = SubLObjectFactory.makeString("button");
        $str50$reload = SubLObjectFactory.makeString("reload");
        $str51$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $kw52$EDIT = SubLObjectFactory.makeKeyword("EDIT");
        $kw53$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym54$CB_FORMULA_TEMPLATES = SubLObjectFactory.makeSymbol("CB-FORMULA-TEMPLATES");
        $kw55$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str56$post = SubLObjectFactory.makeString("post");
        $str57$cb_formula_template_restart_with_ = SubLObjectFactory.makeString("cb-formula-template-restart-with-clean-state");
        $str58$Restart = SubLObjectFactory.makeString("Restart");
        $str59$cb_build_formula_template_basics = SubLObjectFactory.makeString("cb-build-formula-template-basics");
        $str60$Create = SubLObjectFactory.makeString("Create");
        $str61$Please_select_the_assertion_you_w = SubLObjectFactory.makeString("Please select the assertion you wish to use as the basis for the formula template,\n      or enter an EL formula that you wish to use instead. Choose ONE focal term by \n      clicking the appropriate radio button under the argument position.\n      Check any of the arguments you wish to be editable in the final template.");
        $kw62$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $kw63$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str64$assertion_id = SubLObjectFactory.makeString("assertion_id");
        $kw65$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw66$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str67$Enter_a_formula_to_use_as_the_bas = SubLObjectFactory.makeString("Enter a formula to use as the basis: ");
        $str68$base_el_formula = SubLObjectFactory.makeString("base_el_formula");
        $int69$60 = SubLObjectFactory.makeInteger(60);
        $str70$cb_formula_template_use_base_el_f = SubLObjectFactory.makeString("cb-formula-template-use-base-el-formula");
        $str71$Use_Formula = SubLObjectFactory.makeString("Use Formula");
        $sym72$CB_FORMULA_TEMPLATE_USE_BASE_EL_FORMULA = SubLObjectFactory.makeSymbol("CB-FORMULA-TEMPLATE-USE-BASE-EL-FORMULA");
        $str73$Assertion__ = SubLObjectFactory.makeString("Assertion: ");
        $kw74$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str75$Focal_Term__ = SubLObjectFactory.makeString("Focal Term: ");
        $str76$focal_term_argnum = SubLObjectFactory.makeString("focal_term_argnum");
        $str77$Replacable_Position__ = SubLObjectFactory.makeString("Replacable Position: ");
        $str78$editable_argnum = SubLObjectFactory.makeString("editable_argnum");
        $str79$Require_Validation__ = SubLObjectFactory.makeString("Require Validation: ");
        $str80$validreq_argnum = SubLObjectFactory.makeString("validreq_argnum");
        $str81$Hide_Replacements__ = SubLObjectFactory.makeString("Hide Replacements: ");
        $str82$replaceinvis_argnum = SubLObjectFactory.makeString("replaceinvis_argnum");
        $str83$Template_Name_ = SubLObjectFactory.makeString("Template Name:");
        $str84$template_name = SubLObjectFactory.makeString("template_name");
        $str85$Template_id_is_a__A_ = SubLObjectFactory.makeString("Template id is a ~A.");
        $str86$ = SubLObjectFactory.makeString("");
        $str87$Clear = SubLObjectFactory.makeString("Clear");
        $str88$Parent_Subtopic_ = SubLObjectFactory.makeString("Parent Subtopic:");
        $str89$parent_topic_id = SubLObjectFactory.makeString("parent_topic_id");
        $str90$Create_Template_in_ELMt__ = SubLObjectFactory.makeString("Create Template in ELMt: ");
        $str91$target_elmt = SubLObjectFactory.makeString("target_elmt");
        $sym92$CB_BUILD_FORMULA_TEMPLATE_BASICS = SubLObjectFactory.makeSymbol("CB-BUILD-FORMULA-TEMPLATE-BASICS");
        $str93$Update_Error_s_ = SubLObjectFactory.makeString("Update Error(s)");
        $str94$The_following_error_s__occurred_d = SubLObjectFactory.makeString("The following error(s) occurred during the update:");
        $str95$cb_edit_formula_template_contents = SubLObjectFactory.makeString("cb-edit-formula-template-contents");
        $str96$Update_or_edit_any_of_the_formula = SubLObjectFactory.makeString("Update or edit any of the formula template properties below; use the ");
        $str97$_Change_ = SubLObjectFactory.makeString("[Change]");
        $str98$_button_to_update_the_fields__Onc = SubLObjectFactory.makeString(" button to update the fields. Once you are ready, hit ");
        $str99$_Assert_ = SubLObjectFactory.makeString("[Assert]");
        $str100$_to_put_the_information_into_the_ = SubLObjectFactory.makeString(" to put the information into the KB.");
        $str101$Change = SubLObjectFactory.makeString("Change");
        $str102$change = SubLObjectFactory.makeString("change");
        $str103$Start_Over = SubLObjectFactory.makeString("Start Over");
        $str104$start_over = SubLObjectFactory.makeString("start_over");
        $str105$Assert = SubLObjectFactory.makeString("Assert");
        $str106$assert = SubLObjectFactory.makeString("assert");
        $sym107$CB_EDIT_FORMULA_TEMPLATE_CONTENTS = SubLObjectFactory.makeSymbol("CB-EDIT-FORMULA-TEMPLATE-CONTENTS");
        $str108$The_template_must_have_a_name_ = SubLObjectFactory.makeString("The template must have a name.");
        $str109$formula_arg__D = SubLObjectFactory.makeString("formula_arg_~D");
        $kw110$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str111$Cannot_parse_formula_template_arg = SubLObjectFactory.makeString("Cannot parse formula template argument ");
        $str112$_ = SubLObjectFactory.makeString(":");
        $str113$elmt = SubLObjectFactory.makeString("elmt");
        $str114$Cannot_interpret_template_ELMt__ = SubLObjectFactory.makeString("Cannot interpret template ELMt: ");
        $str115$single_entry = SubLObjectFactory.makeString("single_entry");
        $const116$SingleAssertionEntry = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingleAssertionEntry"));
        $const117$MultipleAssertionEntry = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultipleAssertionEntry"));
        $str118$higher_priority = SubLObjectFactory.makeString("higher_priority");
        $str119$template_example = SubLObjectFactory.makeString("template_example");
        $str120$argpos__D = SubLObjectFactory.makeString("argpos_~D");
        $str121$Cannot_interpret_formula_argument = SubLObjectFactory.makeString("Cannot interpret formula argument position expression ");
        $str122$__ = SubLObjectFactory.makeString(": ");
        $const123$FormulaArgPositionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgPositionFn"));
        $str124$argpos_order__D = SubLObjectFactory.makeString("argpos_order_~D");
        $str125$Invalid_ordering_value_specified_ = SubLObjectFactory.makeString("Invalid ordering value specified for argument position ");
        $str126$argpos_explanation__D = SubLObjectFactory.makeString("argpos_explanation_~D");
        $str127$argpos_gloss__D = SubLObjectFactory.makeString("argpos_gloss_~D");
        $str128$argpos_candidate_replacement__D_ = SubLObjectFactory.makeString("argpos_candidate_replacement_~D_");
        $str129$Cannot_interpret_candidate_replac = SubLObjectFactory.makeString("Cannot interpret candidate replacement number ");
        $str130$_for_argument_position_ = SubLObjectFactory.makeString(" for argument position ");
        $str131$___ = SubLObjectFactory.makeString(" : ");
        $str132$Original_Assertion__ = SubLObjectFactory.makeString("Original Assertion: ");
        $str133$Formula__ = SubLObjectFactory.makeString("Formula: ");
        $str134$Argument__ = SubLObjectFactory.makeString("Argument #");
        $str135$formula_arg_ = SubLObjectFactory.makeString("formula_arg_");
        $str136$Assert_Mt__ = SubLObjectFactory.makeString("Assert Mt: ");
        $str137$Single_Entry__ = SubLObjectFactory.makeString("Single Entry: ");
        $str138$Appears_after_this_template__ = SubLObjectFactory.makeString("Appears after this template: ");
        $str139$Template_Example__ = SubLObjectFactory.makeString("Template Example: ");
        $str140$virtual = SubLObjectFactory.makeString("virtual");
        $int141$80 = SubLObjectFactory.makeInteger(80);
        $str142$Argument_Position_Details = SubLObjectFactory.makeString("Argument Position Details");
        $str143$Argument_Position_ = SubLObjectFactory.makeString("Argument Position:");
        $str144$This_corresponds_to_ = SubLObjectFactory.makeString("This corresponds to ");
        $str145$__and_to_ = SubLObjectFactory.makeString(" (and to ");
        $str146$_in_the_base_formula_ = SubLObjectFactory.makeString(" in the base formula)");
        $str147$Ordering__ = SubLObjectFactory.makeString("Ordering: ");
        $str148$Gloss__ = SubLObjectFactory.makeString("Gloss: ");
        $str149$Explanation__ = SubLObjectFactory.makeString("Explanation: ");
        $str150$Candidate_Replacements__ = SubLObjectFactory.makeString("Candidate Replacements: ");
        $str151$argpos_candidate_replacement__D_0 = SubLObjectFactory.makeString("argpos_candidate_replacement_~D_0");
        $str152$candidate_replacement__D__D = SubLObjectFactory.makeString("candidate_replacement_~D_~D");
        $kw153$TEMPLATE_FAILURE = SubLObjectFactory.makeKeyword("TEMPLATE-FAILURE");
        $str154$red_diam_gif = SubLObjectFactory.makeString("red_diam.gif");
        $kw155$TEMPLATE_SUCCESS = SubLObjectFactory.makeKeyword("TEMPLATE-SUCCESS");
        $str156$green_gif = SubLObjectFactory.makeString("green.gif");
        $list157 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym158$HTML_TABLE_ROW = SubLObjectFactory.makeSymbol("HTML-TABLE-ROW");
        $sym159$HTML_FANCY_TABLE_DATA = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA");
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("TOP"), (SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT"));
        $sym161$HTML_PRINC = SubLObjectFactory.makeSymbol("HTML-PRINC");
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("TOP"), (SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("LEFT"));
        $sym163$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym164$CB_ASSERT_FTEMPLATE_DRAW_STATUS_DATACELL = SubLObjectFactory.makeSymbol("CB-ASSERT-FTEMPLATE-DRAW-STATUS-DATACELL");
        $str165$Asserting_Formula_Template = SubLObjectFactory.makeString("Asserting Formula Template");
        $str166$Putting_assertions_into_KB_____ = SubLObjectFactory.makeString("Putting assertions into KB ....");
        $str167$Creating_or_finding_constant = SubLObjectFactory.makeString("Creating or finding constant");
        $str168$Making_a_TKB_template = SubLObjectFactory.makeString("Making a TKB template");
        $str169$Asserting_template_formula = SubLObjectFactory.makeString("Asserting template formula");
        $str170$Asserting_template_Mt = SubLObjectFactory.makeString("Asserting template Mt");
        $str171$Asserting_focal_term_for_template = SubLObjectFactory.makeString("Asserting focal term for template");
        $str172$Asserting_template_entry_format = SubLObjectFactory.makeString("Asserting template entry format");
        $str173$Asserting_template_glosses = SubLObjectFactory.makeString("Asserting template glosses");
        $str174$Asserting_template_explanations = SubLObjectFactory.makeString("Asserting template explanations");
        $str175$Asserting_template_candidate_repl = SubLObjectFactory.makeString("Asserting template candidate replacement information");
        $str176$Asserting_any_validation_required = SubLObjectFactory.makeString("Asserting any validation required information");
        $str177$Asserting_any_invisible_replaceme = SubLObjectFactory.makeString("Asserting any invisible replacement information");
        $str178$Asserting_any_example_information = SubLObjectFactory.makeString("Asserting any example information");
        $str179$Asserting_template_ordering_infor = SubLObjectFactory.makeString("Asserting template ordering information");
        $str180$To_inspect_the_new_template__clic = SubLObjectFactory.makeString("To inspect the new template, click here: ");
        $str181$To_create_a_new_template__click_h = SubLObjectFactory.makeString("To create a new template, click here: ");
        $str182$Start_New = SubLObjectFactory.makeString("Start New");
        $sym183$CB_ASSERT_FORMULA_TEMPLATES_CONTENTS = SubLObjectFactory.makeSymbol("CB-ASSERT-FORMULA-TEMPLATES-CONTENTS");
        $sym184$CB_FORMULA_TEMPLATE_RESTART_WITH_CLEAN_STATE = SubLObjectFactory.makeSymbol("CB-FORMULA-TEMPLATE-RESTART-WITH-CLEAN-STATE");
    }
    
    public static final class $formula_template_editing_state_native extends SubLStructNative
    {
        public SubLObject $phase;
        public SubLObject $formula_template;
        public SubLObject $base_assertion;
        public SubLObject $current_edit_problems;
        public SubLObject $target_mt;
        public SubLObject $higher_priority_template;
        public SubLObject $base_formula;
        private static final SubLStructDeclNative structDecl;
        
        public $formula_template_editing_state_native() {
            this.$phase = (SubLObject)CommonSymbols.NIL;
            this.$formula_template = (SubLObject)CommonSymbols.NIL;
            this.$base_assertion = (SubLObject)CommonSymbols.NIL;
            this.$current_edit_problems = (SubLObject)CommonSymbols.NIL;
            this.$target_mt = (SubLObject)CommonSymbols.NIL;
            this.$higher_priority_template = (SubLObject)CommonSymbols.NIL;
            this.$base_formula = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$formula_template_editing_state_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$formula_template_editing_state_native.class, cb_formula_templates.$sym0$FORMULA_TEMPLATE_EDITING_STATE, cb_formula_templates.$sym1$FORMULA_TEMPLATE_EDITING_STATE_P, cb_formula_templates.$list2, cb_formula_templates.$list3, new String[] { "$phase", "$formula_template", "$base_assertion", "$current_edit_problems", "$target_mt", "$higher_priority_template", "$base_formula" }, cb_formula_templates.$list4, cb_formula_templates.$list5, cb_formula_templates.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $formula_template_editing_state_p$UnaryFunction extends UnaryFunction
    {
        public $formula_template_editing_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORMULA-TEMPLATE-EDITING-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cb_formula_templates.formula_template_editing_state_p(arg1);
        }
    }
}

/*

	Total time: 4103 ms
	
*/