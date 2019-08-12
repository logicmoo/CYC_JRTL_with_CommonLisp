/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.arguments.*;
import static com.cyc.cycjava.cycl.assertions_high.*;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_fastP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_ke_text_mode$;
import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_tools.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$assume_cyc_cyclist_dialogP$;
import static com.cyc.cycjava.cycl.control_vars.$show_assertions_in_english$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.cycl_utilities.*;
import static com.cyc.cycjava.cycl.date_utilities.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.string_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.subl_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_fractions;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-UTILITIES
 * source file: /cyc/top/cycl/cb-utilities.lisp
 * created:     2019/07/03 17:38:03
 */
public final class cb_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject mt_starts_before_starting_ofP(SubLObject mt1, SubLObject mt2) {
	{
	    SubLObject time1 = nth_value_step_2(nth_value_step_1(ZERO_INTEGER), hlmt.explode_hlmt_temporal_facets_with_defaults(mt1));
	    SubLObject time2 = nth_value_step_2(nth_value_step_1(ZERO_INTEGER), hlmt.explode_hlmt_temporal_facets_with_defaults(mt2));
	    return sbhl_time_modules.starts_after_starting_ofP(time2, time1, UNPROVIDED);
	}
    }

    public static final SubLObject mt_ends_before_ending_ofP(SubLObject mt1, SubLObject mt2) {
	{
	    SubLObject time1 = nth_value_step_2(nth_value_step_1(ZERO_INTEGER), hlmt.explode_hlmt_temporal_facets_with_defaults(mt1));
	    SubLObject time2 = nth_value_step_2(nth_value_step_1(ZERO_INTEGER), hlmt.explode_hlmt_temporal_facets_with_defaults(mt2));
	    return sbhl_time_modules.ends_after_ending_ofP(time2, time1, UNPROVIDED);
	}
    }

    static private final SubLString $str_alt68$ = makeString("");

    public static final class $cb_form_cons_method_native extends SubLStructNative {
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	public SubLObject getField2() {
	    return com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native.this.$name;
	}

	public SubLObject getField3() {
	    return com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native.this.$keyword;
	}

	public SubLObject getField4() {
	    return com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native.this.$applicability_test_fn;
	}

	public SubLObject getField5() {
	    return com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native.this.$html_output_fn;
	}

	public SubLObject setField2(SubLObject value) {
	    return com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native.this.$name = value;
	}

	public SubLObject setField3(SubLObject value) {
	    return com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native.this.$keyword = value;
	}

	public SubLObject setField4(SubLObject value) {
	    return com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native.this.$applicability_test_fn = value;
	}

	public SubLObject setField5(SubLObject value) {
	    return com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native.this.$html_output_fn = value;
	}

	public SubLObject $name = Lisp.NIL;

	public SubLObject $keyword = Lisp.NIL;

	public SubLObject $applicability_test_fn = Lisp.NIL;

	public SubLObject $html_output_fn = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native.class, CB_FORM_CONS_METHOD, CB_FORM_CONS_METHOD_P, $list_alt215, $list_alt216,
		new String[] { "$name", "$keyword", "$applicability_test_fn", "$html_output_fn" }, $list_alt217, $list_alt218, PRINT_CB_FORM_CONS_METHODS);
    }

    public static final SubLFile me = new cb_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.cb_utilities";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_c_definitional_type_pred_map$ = makeSymbol("*CB-C-DEFINITIONAL-TYPE-PRED-MAP*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_max_mts_to_sort_temporally$ = makeSymbol("*CB-MAX-MTS-TO-SORT-TEMPORALLY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_back_button_predefined_script$ = makeSymbol("*CB-BACK-BUTTON-PREDEFINED-SCRIPT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_back_button_script$ = makeSymbol("*CB-BACK-BUTTON-SCRIPT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $max_cb_link_arg_count$ = makeSymbol("*MAX-CB-LINK-ARG-COUNT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_default_fort_handler$ = makeSymbol("*CB-DEFAULT-FORT-HANDLER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_default_fort_link_emitter$ = makeSymbol("*CB-DEFAULT-FORT-LINK-EMITTER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_term_id$ = makeSymbol("*CB-TERM-ID*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_default_naut_handler$ = makeSymbol("*CB-DEFAULT-NAUT-HANDLER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_just_did_nat$ = makeSymbol("*CB-JUST-DID-NAT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_just_did_quote$ = makeSymbol("*CB-JUST-DID-QUOTE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_inside_quoteP$ = makeSymbol("*CB-INSIDE-QUOTE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_inside_naut$ = makeSymbol("*CB-INSIDE-NAUT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_inside_naut_support_enabledP$ = makeSymbol("*CB-INSIDE-NAUT-SUPPORT-ENABLED?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_form_cons_suppress_newline$ = makeSymbol("*CB-FORM-CONS-SUPPRESS-NEWLINE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_form_method_table$ = makeSymbol("*CB-FORM-METHOD-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rule_unlabelled_dont_care_variables$ = makeSymbol("*RULE-UNLABELLED-DONT-CARE-VARIABLES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cb_assertion_for_the_assertion_sentence_replacement$ = makeSymbol("*CB-ASSERTION-FOR-THE-ASSERTION-SENTENCE-REPLACEMENT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_string_length_wrap$ = makeSymbol("*CB-STRING-LENGTH-WRAP*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_wrap_after_arg_1$ = makeSymbol("*CB-WRAP-AFTER-ARG-1*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_cb_form_cons_method$ = makeSymbol("*DTP-CB-FORM-CONS-METHOD*");

    // defparameter
    /**
     * LISTP of cb form cons methods that should *always* be active. Registered via
     * DECLARE-CB-FORM-CONS-METHOD-ALWAYS-ACTIVE.
     */
    @LispMethod(comment = "LISTP of cb form cons methods that should *always* be active. Registered via\r\nDECLARE-CB-FORM-CONS-METHOD-ALWAYS-ACTIVE.\ndefparameter\nLISTP of cb form cons methods that should *always* be active. Registered via\nDECLARE-CB-FORM-CONS-METHOD-ALWAYS-ACTIVE.")
    private static final SubLSymbol $always_active_cb_form_cons_methods$ = makeSymbol("*ALWAYS-ACTIVE-CB-FORM-CONS-METHODS*");

    // defvar
    /**
     * Functions which (pragmatically) are not work generating NAUT links when
     * displaying.
     */
    @LispMethod(comment = "Functions which (pragmatically) are not work generating NAUT links when\r\ndisplaying.\ndefvar\nFunctions which (pragmatically) are not work generating NAUT links when\ndisplaying.")
    private static final SubLSymbol $cb_form_suppress_naut_link_functions$ = makeSymbol("*CB-FORM-SUPPRESS-NAUT-LINK-FUNCTIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_just_did_naut$ = makeSymbol("*CB-JUST-DID-NAUT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_constant_id_prefix$ = makeSymbol("*CB-CONSTANT-ID-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_nart_id_prefix$ = makeSymbol("*CB-NART-ID-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_assertion_id_prefix$ = makeSymbol("*CB-ASSERTION-ID-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_assertion_id_prefix_length$ = makeSymbol("*CB-ASSERTION-ID-PREFIX-LENGTH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_image_independent_id_marker$ = makeSymbol("*CB-IMAGE-INDEPENDENT-ID-MARKER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_image_independent_constant_id_prefix$ = makeSymbol("*CB-IMAGE-INDEPENDENT-CONSTANT-ID-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_image_independent_nart_id_prefix$ = makeSymbol("*CB-IMAGE-INDEPENDENT-NART-ID-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_naut_id_prefix$ = makeSymbol("*CB-NAUT-ID-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_naut_id_prefix_length$ = makeSymbol("*CB-NAUT-ID-PREFIX-LENGTH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_sentence_id_prefix$ = makeSymbol("*CB-SENTENCE-ID-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_sentence_id_prefix_length$ = makeSymbol("*CB-SENTENCE-ID-PREFIX-LENGTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $html_unmatched_parenthesis_color$ = makeSymbol("*HTML-UNMATCHED-PARENTHESIS-COLOR*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$_a__a = makeString("~a?~a");

    private static final SubLString $str1$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str2$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $$$Cyc_error = makeString("Cyc error");

    private static final SubLString $str5$_A = makeString("~A");

    private static final SubLInteger $int$2000 = makeInteger(2000);

    static private final SubLString $str8$Back_to_previous__stale__page = makeString("Back to previous (stale) page");

    static private final SubLString $$$Back_to_previous_page = makeString("Back to previous page");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str13$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str18$Back_to__stale__ = makeString("Back to (stale) ");

    private static final SubLString $$$_page = makeString(" page");

    private static final SubLString $$$True = makeString("True");

    private static final SubLString $$$False = makeString("False");

    private static final SubLString $$$Unknown = makeString("Unknown");

    private static final SubLString $str26$___ = makeString("???");

    private static final SubLString $$$Default = makeString("Default");

    private static final SubLString $$$Monotonic = makeString("Monotonic");

    private static final SubLString $$$Forward = makeString("Forward");

    private static final SubLString $$$Backward = makeString("Backward");

    private static final SubLString $$$Code = makeString("Code");

    private static final SubLString $str37$_S = makeString("~S");

    private static final SubLString $str39$_A__A___A = makeString("~A ~A, ~A");

    private static final SubLSymbol CB_HTML_FOR_CYCLIST_IN_NL = makeSymbol("CB-HTML-FOR-CYCLIST-IN-NL");

    private static final SubLSymbol HTML_GENERATE_PHRASE = makeSymbol("HTML-GENERATE-PHRASE");

    private static final SubLSymbol $cb_html_for_cyclist_in_nl_caching_state$ = makeSymbol("*CB-HTML-FOR-CYCLIST-IN-NL-CACHING-STATE*");

    private static final SubLString $str43$ref_renames_kills_html = makeString("ref/renames-kills.html");

    private static final SubLString $str44$ref_cycl_syntax_html_naming_conve = makeString("ref/cycl-syntax.html#naming conventions");

    private static final SubLString $str45$toc_html = makeString("toc.html");

    private static final SubLString $str46$__For_detailed_help_and_warnings_ = makeString("--For detailed help and warnings about ~A, please read the ");

    private static final SubLString $str47$_ = makeString("#");

    private static final SubLString $str48$_documentation_ = makeString(" documentation.");

    private static final SubLString $$$Yes = makeString("Yes");

    private static final SubLString $$$No = makeString("No");

    private static final SubLSymbol $cb_available_tools$ = makeSymbol("*CB-AVAILABLE-TOOLS*");

    private static final SubLSymbol NOT_EQL = makeSymbol("NOT-EQL");

    private static final SubLList $list57 = list(
	    list(new SubLObject[] { reader_make_constant_shell("Collection"), reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("genls"), reader_make_constant_shell("disjointWith"), reader_make_constant_shell("defnIff"),
		    reader_make_constant_shell("quotedDefnIff"), reader_make_constant_shell("defnSufficient"), reader_make_constant_shell("quotedDefnSufficient"), reader_make_constant_shell("defnNecessary"), reader_make_constant_shell("quotedDefnNecessary"), reader_make_constant_shell("comment"),
		    reader_make_constant_shell("cyclistNotes"), reader_make_constant_shell("sharedNotes"), reader_make_constant_shell("userDocComment") }),
	    list(new SubLObject[] { reader_make_constant_shell("Predicate"), reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genlInverse"), reader_make_constant_shell("negationPreds"),
		    reader_make_constant_shell("negationInverse"), reader_make_constant_shell("arity"), reader_make_constant_shell("arityMin"), reader_make_constant_shell("argsIsa"), reader_make_constant_shell("argAndRestIsa"), reader_make_constant_shell("argsQuotedIsa"),
		    reader_make_constant_shell("argAndRestQuotedIsa"), reader_make_constant_shell("argsGenl"), reader_make_constant_shell("argAndRestGenl"), reader_make_constant_shell("argIsa"), reader_make_constant_shell("argGenl"), reader_make_constant_shell("argQuotedIsa"),
		    reader_make_constant_shell("arg1Isa"), reader_make_constant_shell("arg1QuotedIsa"), reader_make_constant_shell("arg1Genl"), reader_make_constant_shell("arg2Isa"), reader_make_constant_shell("arg2QuotedIsa"), reader_make_constant_shell("arg2Genl"),
		    reader_make_constant_shell("arg3Isa"), reader_make_constant_shell("arg3QuotedIsa"), reader_make_constant_shell("arg3Genl"), reader_make_constant_shell("arg4Isa"), reader_make_constant_shell("arg4QuotedIsa"), reader_make_constant_shell("arg4Genl"),
		    reader_make_constant_shell("arg5Isa"), reader_make_constant_shell("arg5QuotedIsa"), reader_make_constant_shell("arg5Genl"), reader_make_constant_shell("arg6Isa"), reader_make_constant_shell("arg6QuotedIsa"), reader_make_constant_shell("arg6Genl"),
		    reader_make_constant_shell("arg7Isa"), reader_make_constant_shell("arg7QuotedIsa"), reader_make_constant_shell("arg7Genl"), reader_make_constant_shell("arg8Isa"), reader_make_constant_shell("arg8QuotedIsa"), reader_make_constant_shell("arg8Genl"),
		    reader_make_constant_shell("arg9Isa"), reader_make_constant_shell("arg9QuotedIsa"), reader_make_constant_shell("arg9Genl"), reader_make_constant_shell("arg10Isa"), reader_make_constant_shell("arg10QuotedIsa"), reader_make_constant_shell("arg10Genl"),
		    reader_make_constant_shell("arg11Isa"), reader_make_constant_shell("arg11QuotedIsa"), reader_make_constant_shell("arg11Genl"), reader_make_constant_shell("arg12Isa"), reader_make_constant_shell("arg12QuotedIsa"), reader_make_constant_shell("arg12Genl"),
		    reader_make_constant_shell("fanOutArg"), reader_make_constant_shell("evaluationDefn"), reader_make_constant_shell("afterAdding"), reader_make_constant_shell("afterRemoving"), reader_make_constant_shell("comment"), reader_make_constant_shell("cyclistNotes"),
		    reader_make_constant_shell("sharedNotes"), reader_make_constant_shell("userDocComment") }),
	    list(NIL, reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("comment"), reader_make_constant_shell("cyclistNotes"), reader_make_constant_shell("sharedNotes"), reader_make_constant_shell("userDocComment")),
	    list(reader_make_constant_shell("Microtheory"), reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("genlMt"), reader_make_constant_shell("comment"), reader_make_constant_shell("cyclistNotes"), reader_make_constant_shell("sharedNotes"),
		    reader_make_constant_shell("userDocComment")),
	    list(new SubLObject[] { reader_make_constant_shell("Function-Denotational"), reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("genlFuncs"), reader_make_constant_shell("genlFunctions"), reader_make_constant_shell("resultIsa"),
		    reader_make_constant_shell("resultIsaArg"), reader_make_constant_shell("resultIsaArgIsa"), reader_make_constant_shell("resultGenl"), reader_make_constant_shell("resultGenlArg"), reader_make_constant_shell("arity"), reader_make_constant_shell("arityMin"),
		    reader_make_constant_shell("argsIsa"), reader_make_constant_shell("argAndRestIsa"), reader_make_constant_shell("argsQuotedIsa"), reader_make_constant_shell("argAndRestQuotedIsa"), reader_make_constant_shell("argsGenl"), reader_make_constant_shell("argAndRestGenl"),
		    reader_make_constant_shell("argIsa"), reader_make_constant_shell("argGenl"), reader_make_constant_shell("argQuotedIsa"), reader_make_constant_shell("arg1Isa"), reader_make_constant_shell("arg1QuotedIsa"), reader_make_constant_shell("arg1Genl"),
		    reader_make_constant_shell("arg2Isa"), reader_make_constant_shell("arg2QuotedIsa"), reader_make_constant_shell("arg2Genl"), reader_make_constant_shell("arg3Isa"), reader_make_constant_shell("arg3QuotedIsa"), reader_make_constant_shell("arg3Genl"),
		    reader_make_constant_shell("arg4Isa"), reader_make_constant_shell("arg4QuotedIsa"), reader_make_constant_shell("arg4Genl"), reader_make_constant_shell("arg5Isa"), reader_make_constant_shell("arg5QuotedIsa"), reader_make_constant_shell("arg5Genl"),
		    reader_make_constant_shell("comment"), reader_make_constant_shell("cyclistNotes"), reader_make_constant_shell("sharedNotes"), reader_make_constant_shell("userDocComment") }));

    private static final SubLSymbol $sym60$VALID_FORT_ = makeSymbol("VALID-FORT?");

    private static final SubLSymbol $sym61$POTENTIALLY_INFINITE_INTEGER__ = makeSymbol("POTENTIALLY-INFINITE-INTEGER-<");

    private static final SubLSymbol MT_START_UNIVERSAL_TIME_EXTENDED = makeSymbol("MT-START-UNIVERSAL-TIME-EXTENDED");

    private static final SubLSymbol MT_END_UNIVERSAL_TIME_EXTENDED = makeSymbol("MT-END-UNIVERSAL-TIME-EXTENDED");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $sym66$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol GET_MT_TIME_INTERVAL_MEMOIZED = makeSymbol("GET-MT-TIME-INTERVAL-MEMOIZED");

    private static final SubLSymbol MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED = makeSymbol("MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED");

    private static final SubLList $list70 = list(reader_make_constant_shell("YearFn"), makeInteger(1900));

    private static final SubLSymbol $sym72$_ = makeSymbol("<");

    private static final SubLString $str73$onClick___A_history_back____ = makeString("onClick=\"~A.history.back();\"");

    private static final SubLString $str74$onClick__var_frame_name_____A___i = makeString("onClick=\"var frame_name = \'~A\'; if (top.frames[frame_name]) top.frames[frame_name].history.back();\"");

    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $$$top = makeString("top");

    private static final SubLString $$$parent = makeString("parent");

    private static final SubLSymbol $cb_frame_table$ = makeSymbol("*CB-FRAME-TABLE*");

    private static final SubLString $$$no = makeString("no");

    private static final SubLString $str86$cb_login = makeString("cb-login");

    private static final SubLString $str87$cb_history = makeString("cb-history");

    private static final SubLString $str88$ = makeString("");

    private static final SubLList $list89 = cons(makeSymbol("INDIRECT-HANDLER"), makeSymbol("INDIRECT-ARGS"));

    private static final SubLString $str90$_ = makeString("&");

    private static final SubLString $str91$_ = makeString("=");

    private static final SubLList $list92 = list(makeSymbol("KEYWORD"), makeSymbol("NAME"), makeSymbol("HANDLER"), makeSymbol("CONTROL-STRING"), makeSymbol("NORESIZE"), makeSymbol("SCROLLING"));

    private static final SubLString $str93$_self = makeString("_self");

    private static final SubLString $str94$_parent = makeString("_parent");

    private static final SubLString $str95$_top = makeString("_top");

    private static final SubLString $str97$_blank = makeString("_blank");

    private static final SubLString $str99$_new = makeString("_new");

    private static final SubLString $$$doc = makeString("doc");

    private static final SubLString $$$completion = makeString("completion");

    private static final SubLString $$$toolbar = makeString("toolbar");

    private static final SubLString $str106$cb_toolbar_frame = makeString("cb-toolbar-frame");

    private static final SubLString $str107$cyc_main = makeString("cyc-main");

    private static final SubLString $str108$cb_main_frame = makeString("cb-main-frame");

    private static final SubLString $str109$__a = makeString("&~a");

    private static final SubLString $$$status = makeString("status");

    private static final SubLString $str112$cb_status_frame = makeString("cb-status-frame");

    private static final SubLString $$$index = makeString("index");

    private static final SubLString $str115$cb_index_frame = makeString("cb-index-frame");

    private static final SubLString $$$content = makeString("content");

    private static final SubLString $str118$cb_content_frame = makeString("cb-content-frame");

    private static final SubLString $$$empty = makeString("empty");

    private static final SubLString $str121$cb_empty_frame = makeString("cb-empty-frame");

    private static final SubLString $$$setup = makeString("setup");

    private static final SubLString $str124$cb_setup_frame = makeString("cb-setup-frame");

    private static final SubLString $str126$inf_index = makeString("inf-index");

    private static final SubLString $str127$cb_inf_index_frame = makeString("cb-inf-index-frame");

    private static final SubLString $str129$inf_content = makeString("inf-content");

    private static final SubLString $str130$cb_inf_content_frame = makeString("cb-inf-content-frame");

    private static final SubLString $str131$No_cb_link_method_for__S_defined = makeString("No cb-link method for ~S defined");

    private static final SubLString $str134$Too_many_args_in__S___max_of__S_a = makeString("Too many args in ~S:  max of ~S allowed");

    private static final SubLSymbol $CB_LINK_METHOD = makeKeyword("CB-LINK-METHOD");

    private static final SubLSymbol $CB_LINK_MAX_ARGS = makeKeyword("CB-LINK-MAX-ARGS");

    private static final SubLString $str137$cb_cf = makeString("cb-cf");

    public static final SubLSymbol $cb_show_constant_hash_dollar_prefixP$ = makeSymbol("*CB-SHOW-CONSTANT-HASH-DOLLAR-PREFIX?*");

    private static final SubLString $$$const = makeString("const");

    private static final SubLString $str142$cb_start_ = makeString("cb-start|");

    private static final SubLString $str143$_a__a = makeString("~a&~a");

    private static final SubLString $$$obsolete = makeString("obsolete");

    private static final SubLString $str145$__ = makeString("#$");

    private static final SubLSymbol $TERM_CONTEXT_MENU = makeKeyword("TERM-CONTEXT-MENU");

    private static final SubLSymbol CB_LINK_CONSTANT = makeSymbol("CB-LINK-CONSTANT");

    private static final SubLString $str149$nat_png = makeString("nat.png");

    private static final SubLString $str151$nart_png = makeString("nart.png");

    private static final SubLString $str152$_ = makeString("-");

    private static final SubLString $str153$_ = makeString("(");

    private static final SubLString $$$absmiddle = makeString("absmiddle");

    private static final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol CB_LINK_NART = makeSymbol("CB-LINK-NART");

    private static final SubLSymbol CB_LINK_NAT = makeSymbol("CB-LINK-NAT");

    private static final SubLString $str158$cb_naut_frame = makeString("cb-naut-frame");

    private static final SubLSymbol CB_LINK_NAUT = makeSymbol("CB-LINK-NAUT");

    private static final SubLString $$$href = makeString("href");

    private static final SubLSymbol CB_LINK_LEXICON = makeSymbol("CB-LINK-LEXICON");

    private static final SubLString $str164$_NART_ = makeString("<NART>");

    private static final SubLString $str165$_NART_ = makeString("<NART ");

    private static final SubLString $str166$_ = makeString(">");

    private static final SubLSymbol CB_LINK_UNNAMED = makeSymbol("CB-LINK-UNNAMED");

    private static final SubLString $str169$cb_af = makeString("cb-af");

    private static final SubLString $str170$cb_start_cb_af = makeString("cb-start|cb-af");

    private static final SubLSymbol CB_LINK_ASSERTION = makeSymbol("CB-LINK-ASSERTION");

    private static final SubLString $str173$_cycid_ = makeString(" cycid=");

    private static final SubLString $str174$_id_ = makeString(" id=");

    private static final SubLInteger $int$_30 = makeInteger(-30);

    private static final SubLSymbol HTML_SATURATED_RED_COLOR = makeSymbol("HTML-SATURATED-RED-COLOR");

    private static final SubLString $str180$_C_C0000 = makeString("~C~C0000");

    private static final SubLSymbol $html_saturated_red_color_caching_state$ = makeSymbol("*HTML-SATURATED-RED-COLOR-CACHING-STATE*");

    private static final SubLSymbol HTML_SATURATED_GREEN_COLOR = makeSymbol("HTML-SATURATED-GREEN-COLOR");

    private static final SubLString $str183$00_C_C00 = makeString("00~C~C00");

    private static final SubLSymbol $html_saturated_green_color_caching_state$ = makeSymbol("*HTML-SATURATED-GREEN-COLOR-CACHING-STATE*");

    private static final SubLString $str185$yellow_gif = makeString("yellow.gif");

    private static final SubLString $str186$_Def_ = makeString("[Def]");

    private static final SubLString $str187$white_gif = makeString("white.gif");

    private static final SubLString $str188$_Mon_ = makeString("[Mon]");

    private static final SubLString $str190$green_gif = makeString("green.gif");

    private static final SubLString $str191$_Inf_ = makeString("[Inf]");

    private static final SubLString $str192$purple_gif = makeString("purple.gif");

    private static final SubLString $str193$_B_ = makeString("[B]");

    private static final SubLString $str194$blue_gif = makeString("blue.gif");

    private static final SubLString $str195$_F_ = makeString("[F]");

    private static final SubLString $str197$cyan_gif = makeString("cyan.gif");

    private static final SubLString $str198$_R_ = makeString("[R]");

    private static final SubLString $str199$red_gif = makeString("red.gif");

    private static final SubLString $str200$_False_ = makeString("[False]");

    private static final SubLString $str201$pink_gif = makeString("pink.gif");

    private static final SubLString $str202$_Code_ = makeString("[Code]");

    private static final SubLString $str203$gray_gif = makeString("gray.gif");

    private static final SubLString $str204$_Unknown_ = makeString("[Unknown]");

    private static final SubLString $str206$orange_gif = makeString("orange.gif");

    private static final SubLString $str207$_BackwardGAF_ = makeString("[BackwardGAF]");

    private static final SubLString $$$_monotonic = makeString(" monotonic");

    private static final SubLString $$$_forward = makeString(" forward");

    private static final SubLString $$$_backward = makeString(" backward");

    private static final SubLString $$$_rule = makeString(" rule");

    private static final SubLString $$$_GAF = makeString(" GAF");

    private static final SubLString $$$_asserted_locally_in_ = makeString(" asserted locally in ");

    private static final SubLString $$$_by_ = makeString(" by ");

    private static final SubLString $$$_on_ = makeString(" on ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str217$__ = makeString(", ");

    private static final SubLString $$$_at_ = makeString(" at ");

    private static final SubLString $$$_for_ = makeString(" for ");

    private static final SubLString $$$_and_inferred_by_Cyc = makeString(" and inferred by Cyc");

    private static final SubLString $$$_inferred_in_ = makeString(" inferred in ");

    private static final SubLSymbol GENERATE_PHRASE_FOR_CYCLIST = makeSymbol("GENERATE-PHRASE-FOR-CYCLIST");

    private static final SubLSymbol $generate_phrase_for_cyclist_caching_state$ = makeSymbol("*GENERATE-PHRASE-FOR-CYCLIST-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GENERATE_PHRASE_FOR_CYCLIST = makeSymbol("CLEAR-GENERATE-PHRASE-FOR-CYCLIST");

    private static final SubLString $str226$cb_sentence = makeString("cb-sentence");

    private static final SubLString $str227$cb_start_cb_sentence = makeString("cb-start|cb-sentence");

    private static final SubLString $str228$_a__a_t = makeString("~a&~a&t");

    private static final SubLSymbol CB_LINK_SENTENCE = makeSymbol("CB-LINK-SENTENCE");

    private static final SubLString $str232$cyc_logo_3_t_gif = makeString("cyc-logo-3-t.gif");

    private static final SubLString $str233$_CycL_ = makeString("[CycL]");

    private static final SubLString $str235$help_btn_s_gif = makeString("help_btn_s.gif");

    private static final SubLString $str236$_Help_ = makeString("[Help]");

    private static final SubLString $str237$Use_of_unsupported_legacy_help_sy = makeString("Use of unsupported legacy help system for ~A.  Add and use def-cb-help definition.");

    private static final SubLString $str238$dont_care = makeString("dont-care");

    private static final SubLString $str239$hl_var_dont_care = makeString("hl-var dont-care");

    private static final SubLString $str240$hl_var = makeString("hl-var");

    private static final SubLSymbol CB_FORM_VARIABLE_METHOD = makeSymbol("CB-FORM-VARIABLE-METHOD");

    private static final SubLString $str242$el_var_dont_care = makeString("el-var dont-care");

    private static final SubLString $str243$el_var = makeString("el-var");

    private static final SubLString $$$keyword = makeString("keyword");

    private static final SubLString $$$symbol = makeString("symbol");

    private static final SubLSymbol CB_FORM_SYMBOL_METHOD = makeSymbol("CB-FORM-SYMBOL-METHOD");

    private static final SubLSymbol CB_FORM_CONSTANT_METHOD = makeSymbol("CB-FORM-CONSTANT-METHOD");

    private static final SubLSymbol CB_FORM_NART_METHOD = makeSymbol("CB-FORM-NART-METHOD");

    public static final SubLSymbol $allow_cb_assertion_for_the_assertion_sentence_replacementP$ = makeSymbol("*ALLOW-CB-ASSERTION-FOR-THE-ASSERTION-SENTENCE-REPLACEMENT?*");

    private static final SubLSymbol CB_FORM_ASSERTION_METHOD = makeSymbol("CB-FORM-ASSERTION-METHOD");

    private static final SubLString $str252$__INVALID_ASSERTION_ = makeString("#<INVALID ASSERTION>");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLSymbol CB_FORM_STRING_METHOD = makeSymbol("CB-FORM-STRING-METHOD");

    private static final SubLList $list255 = list(reader_make_constant_shell("holdsIn"));

    private static final SubLSymbol $cb_form_cons_methods$ = makeSymbol("*CB-FORM-CONS-METHODS*");

    private static final SubLSymbol $cb_form_cons_methods_by_keyword$ = makeSymbol("*CB-FORM-CONS-METHODS-BY-KEYWORD*");

    private static final SubLSymbol CB_FORM_CONS_METHOD = makeSymbol("CB-FORM-CONS-METHOD");

    private static final SubLSymbol CB_FORM_CONS_METHOD_P = makeSymbol("CB-FORM-CONS-METHOD-P");

    private static final SubLList $list260 = list(makeSymbol("NAME"), makeSymbol("KEYWORD"), makeSymbol("APPLICABILITY-TEST-FN"), makeSymbol("HTML-OUTPUT-FN"));

    private static final SubLList $list261 = list($NAME, makeKeyword("KEYWORD"), makeKeyword("APPLICABILITY-TEST-FN"), makeKeyword("HTML-OUTPUT-FN"));

    static private final SubLList $list262 = list(makeSymbol("CB-FORM-CONS-METHOD-NAME"), makeSymbol("CB-FORM-CONS-METHOD-KEYWORD"), makeSymbol("CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN"), makeSymbol("CB-FORM-CONS-METHOD-HTML-OUTPUT-FN"));

    private static final SubLList $list263 = list(makeSymbol("_CSETF-CB-FORM-CONS-METHOD-NAME"), makeSymbol("_CSETF-CB-FORM-CONS-METHOD-KEYWORD"), makeSymbol("_CSETF-CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN"), makeSymbol("_CSETF-CB-FORM-CONS-METHOD-HTML-OUTPUT-FN"));

    private static final SubLSymbol PRINT_CB_FORM_CONS_METHODS = makeSymbol("PRINT-CB-FORM-CONS-METHODS");

    private static final SubLSymbol CB_FORM_CONS_METHOD_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CB-FORM-CONS-METHOD-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list266 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CB-FORM-CONS-METHOD-P"));

    private static final SubLSymbol CB_FORM_CONS_METHOD_NAME = makeSymbol("CB-FORM-CONS-METHOD-NAME");

    private static final SubLSymbol _CSETF_CB_FORM_CONS_METHOD_NAME = makeSymbol("_CSETF-CB-FORM-CONS-METHOD-NAME");

    private static final SubLSymbol CB_FORM_CONS_METHOD_KEYWORD = makeSymbol("CB-FORM-CONS-METHOD-KEYWORD");

    private static final SubLSymbol _CSETF_CB_FORM_CONS_METHOD_KEYWORD = makeSymbol("_CSETF-CB-FORM-CONS-METHOD-KEYWORD");

    private static final SubLSymbol CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN = makeSymbol("CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN");

    private static final SubLSymbol _CSETF_CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN = makeSymbol("_CSETF-CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN");

    private static final SubLSymbol CB_FORM_CONS_METHOD_HTML_OUTPUT_FN = makeSymbol("CB-FORM-CONS-METHOD-HTML-OUTPUT-FN");

    private static final SubLSymbol _CSETF_CB_FORM_CONS_METHOD_HTML_OUTPUT_FN = makeSymbol("_CSETF-CB-FORM-CONS-METHOD-HTML-OUTPUT-FN");

    private static final SubLSymbol $APPLICABILITY_TEST_FN = makeKeyword("APPLICABILITY-TEST-FN");

    private static final SubLSymbol $HTML_OUTPUT_FN = makeKeyword("HTML-OUTPUT-FN");

    private static final SubLString $str279$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_CB_FORM_CONS_METHOD = makeSymbol("MAKE-CB-FORM-CONS-METHOD");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CB_FORM_CONS_METHOD_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CB-FORM-CONS-METHOD-METHOD");

    private static final SubLList $list285 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));

    private static final SubLSymbol REGISTER_CB_FORM_CONS_METHOD = makeSymbol("REGISTER-CB-FORM-CONS-METHOD");

    private static final SubLSymbol DEFCB_FORM_CONS_METHOD = makeSymbol("DEFCB-FORM-CONS-METHOD");

    private static final SubLList $list289 = list(list(makeSymbol("METHOD-KEYWORDS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $cb_form_cons_methods_active$ = makeSymbol("*CB-FORM-CONS-METHODS-ACTIVE*");

    private static final SubLSymbol COMPUTE_CB_FORM_CONS_METHODS_ACTIVE = makeSymbol("COMPUTE-CB-FORM-CONS-METHODS-ACTIVE");

    private static final SubLSymbol WITH_CB_FORM_CONS_METHODS = makeSymbol("WITH-CB-FORM-CONS-METHODS");

    private static final SubLString $str294$cg_cb_start_ = makeString("cg?cb-start|");

    private static final SubLSymbol CYC_CGI_RELATIVE_URL = makeSymbol("CYC-CGI-RELATIVE-URL");

    private static final SubLSymbol CYC_CGI_KEA_URL = makeSymbol("CYC-CGI-KEA-URL");

    private static final SubLSymbol CYC_CGI_ABSOLUTE_CB_FRAMED_URL = makeSymbol("CYC-CGI-ABSOLUTE-CB-FRAMED-URL");

    public static final SubLSymbol $cb_formula_argument_limit$ = makeSymbol("*CB-FORMULA-ARGUMENT-LIMIT*");

    private static final SubLString $str302$_ = makeString("'");

    private static final SubLString $str303$____ = makeString(" ...");

    private static final SubLString $str304$___ = makeString(" . ");

    private static final SubLString $str305$font_weight_900 = makeString("font-weight:900");

    private static final SubLString $str306$_ = makeString(")");

    private static final SubLList $list308 = list($NAME, makeString("date"), makeKeyword("KEYWORD"), $DATE, makeKeyword("APPLICABILITY-TEST-FN"), makeSymbol("CB-DATE-TO-OPTIMIZE-FOR-DISPLAY?"), makeKeyword("HTML-OUTPUT-FN"),
	    makeSymbol("CB-SHOW-DATE-OPTIMIZED-FOR-DISPLAY"));

    public static final SubLSymbol $cb_display_dates_as_stringsP$ = makeSymbol("*CB-DISPLAY-DATES-AS-STRINGS?*");

    private static final SubLSymbol $sym311$CB_DATE_TO_OPTIMIZE_FOR_DISPLAY_ = makeSymbol("CB-DATE-TO-OPTIMIZE-FOR-DISPLAY?");

    private static final SubLSymbol CB_SHOW_DATE_OPTIMIZED_FOR_DISPLAY = makeSymbol("CB-SHOW-DATE-OPTIMIZED-FOR-DISPLAY");

    private static final SubLString $str313$DateFromStringFn_datetime = makeString("DateFromStringFn-datetime");

    private static final SubLSymbol DECIMAL = makeSymbol("DECIMAL");

    private static final SubLList $list316 = list($NAME, makeString("decimal"), makeKeyword("KEYWORD"), makeKeyword("DECIMAL"), makeKeyword("APPLICABILITY-TEST-FN"), makeSymbol("CB-DECIMAL-TO-OPTIMIZE-FOR-DISPLAY?"), makeKeyword("HTML-OUTPUT-FN"),
	    makeSymbol("CB-SHOW-DECIMAL-OPTIMIZED-FOR-DISPLAY"));

    public static final SubLSymbol $cb_display_decimals_as_decimalsP$ = makeSymbol("*CB-DISPLAY-DECIMALS-AS-DECIMALS?*");

    private static final SubLSymbol $sym319$CB_DECIMAL_TO_OPTIMIZE_FOR_DISPLAY_ = makeSymbol("CB-DECIMAL-TO-OPTIMIZE-FOR-DISPLAY?");

    private static final SubLSymbol CB_SHOW_DECIMAL_OPTIMIZED_FOR_DISPLAY = makeSymbol("CB-SHOW-DECIMAL-OPTIMIZED-FOR-DISPLAY");

    static private final SubLList $list322 = list($NAME, makeString("fraction"), makeKeyword("KEYWORD"), makeKeyword("FRACTION"), makeKeyword("APPLICABILITY-TEST-FN"), makeSymbol("CB-FRACTION-TO-OPTIMIZE-FOR-DISPLAY?"), makeKeyword("HTML-OUTPUT-FN"),
	    makeSymbol("CB-SHOW-FRACTION-OPTIMIZED-FOR-DISPLAY"));

    public static final SubLSymbol $cb_display_fractions_as_fractionsP$ = makeSymbol("*CB-DISPLAY-FRACTIONS-AS-FRACTIONS?*");

    private static final SubLSymbol $sym325$CB_FRACTION_TO_OPTIMIZE_FOR_DISPLAY_ = makeSymbol("CB-FRACTION-TO-OPTIMIZE-FOR-DISPLAY?");

    private static final SubLSymbol CB_SHOW_FRACTION_OPTIMIZED_FOR_DISPLAY = makeSymbol("CB-SHOW-FRACTION-OPTIMIZED-FOR-DISPLAY");

    private static final SubLSymbol $sym330$CB_HL_SUPPORT_TO_DISPLAY_ = makeSymbol("CB-HL-SUPPORT-TO-DISPLAY?");

    private static final SubLSymbol CB_SHOW_HL_SUPPORT_FOR_CONS_METHOD = makeSymbol("CB-SHOW-HL-SUPPORT-FOR-CONS-METHOD");

    private static final SubLList $list332 = list(makeSymbol("ARG"));

    private static final SubLString $$$Unimplemented_Link = makeString("Unimplemented Link");

    private static final SubLString $$$The_page_for_ = makeString("The page for ");

    private static final SubLString $str335$_has_not_yet_been_implemented_ = makeString(" has not yet been implemented.");

    private static final SubLSymbol CB_UNIMPLEMENTED = makeSymbol("CB-UNIMPLEMENTED");

    private static final SubLString $str338$cb_unimplemented__A = makeString("cb-unimplemented&~A");

    private static final SubLSymbol CB_LINK_UNIMPLEMENTED = makeSymbol("CB-LINK-UNIMPLEMENTED");

    private static final SubLString $$$_and_ = makeString(" and ");

    private static final SubLString $$$and_ = makeString("and ");

    private static final SubLSymbol HTML_GENERATE_TEXT = makeSymbol("HTML-GENERATE-TEXT");

    private static final SubLSymbol HTML_GENERATE_QUESTION = makeSymbol("HTML-GENERATE-QUESTION");

    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLSymbol CB_CF = makeSymbol("CB-CF");

    private static final SubLString $str350$f__ = makeString("f: ");

    private static final SubLString $str351$__ = makeString(" .");

    private static final SubLString $str352$___ = makeString(" ;;");

    private static final SubLString $$$_in_ = makeString(" in ");

    private static final SubLList $list354 = list(makeSymbol("ASSERTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list357 = list(makeSymbol("NULL"), makeSymbol("*ASSERTION-FILTER-HOOK*"));

    public static final SubLSymbol $assertion_filter_hook$ = makeSymbol("*ASSERTION-FILTER-HOOK*");

    private static final SubLList $list360 = list(list(makeSymbol("*ASSERTION-FILTER-HOOK*"), NIL));

    private static final SubLString $str364$__claimed_by_ = makeString(" (claimed by ");

    private static final SubLString $str366$_module_ = makeString(" module)");

    private static final SubLString $$$claimed_by_ = makeString("claimed by ");

    private static final SubLString $str372$EL_Formula___Mt_Identical_to_Asse = makeString("EL Formula & Mt Identical to Assertion Above");

    private static final SubLString $str373$EL_Formula_Identical_to_Assertion = makeString("EL Formula Identical to Assertion Above");

    private static final SubLString $$$c = makeString("c");

    private static final SubLString $$$nart = makeString("nart");

    private static final SubLString $$$a = makeString("a");

    public static final SubLSymbol $cb_image_independent_fort_identifiersP$ = makeSymbol("*CB-IMAGE-INDEPENDENT-FORT-IDENTIFIERS?*");

    private static final SubLString $$$NIL = makeString("NIL");

    private static final SubLSymbol CB_GUESS_NAT = makeSymbol("CB-GUESS-NAT");

    private static final SubLList $list381 = list(makeSymbol("CB-GUESS-NART"));

    private static final SubLString $str384$_ = makeString(";");

    private static final SubLString $$$naut = makeString("naut");

    private static final SubLString $$$sentence = makeString("sentence");

    private static final SubLString $str387$_day = makeString("-day");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLString $str389$_month = makeString("-month");

    private static final SubLString $str390$_year = makeString("-year");

    private static final SubLString $$$Month = makeString("Month");

    private static final SubLString $$$Day = makeString("Day");

    private static final SubLString $$$Year = makeString("Year");

    private static final SubLString $str399$The_following_parentheses_are_unm = makeString("The following parentheses are unmatched:");

    private static final SubLString $str400$The_following_constants_are_inval = makeString("The following constants are invalid:");

    private static final SubLString $str401$This_is_unreadable__because_more_ = makeString("This is unreadable, because more was expected at the end :");

    private static final SubLString $str402$Trying_to_read_this_generated_an_ = makeString("Trying to read this generated an internal error :");

    private static final SubLSymbol SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P = makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");

    private static final SubLString $str404$The_following_references_to_const = makeString("The following references to constants are invalid:");

    private static final SubLString $str406$in_the_following_string__ = makeString("in the following string :");

    private static final SubLString $str407$Also__the_following_extra_string_ = makeString("Also, the following extra string at the end was ignored :");

    private static final SubLString $str408$The_following_string_did_not_spec = makeString("The following string did not specify a sentence :");

    private static final SubLString $str409$because__ = makeString("because: ");

    private static final SubLString $str410$____none_selected____ = makeString(" -- none selected -- ");

    private static final SubLSymbol $the_cyclist$ = makeSymbol("*THE-CYCLIST*");

    private static final SubLSymbol $cb_nat_history$ = makeSymbol("*CB-NAT-HISTORY*");

    private static final SubLSymbol $cb_constant_history$ = makeSymbol("*CB-CONSTANT-HISTORY*");

    private static final SubLSymbol $ACTIVE_LEFT_ARROW = makeKeyword("ACTIVE-LEFT-ARROW");

    private static final SubLString $str415$back_12_png = makeString("back-12.png");

    private static final SubLString $$$Active_left_arrow = makeString("Active left arrow");

    private static final SubLSymbol $INACTIVE_LEFT_ARROW = makeKeyword("INACTIVE-LEFT-ARROW");

    private static final SubLString $str418$back_12_disabled_png = makeString("back-12-disabled.png");

    private static final SubLString $$$Inactive_left_arrow = makeString("Inactive left arrow");

    private static final SubLSymbol $ACTIVE_RIGHT_ARROW = makeKeyword("ACTIVE-RIGHT-ARROW");

    private static final SubLString $str421$forward_12_png = makeString("forward-12.png");

    private static final SubLString $$$Active_right_arrow = makeString("Active right arrow");

    private static final SubLSymbol $INACTIVE_RIGHT_ARROW = makeKeyword("INACTIVE-RIGHT-ARROW");

    private static final SubLString $str424$forward_12_disabled_png = makeString("forward-12-disabled.png");

    private static final SubLString $$$Inactive_right_arrow = makeString("Inactive right arrow");

    private static final SubLString $str426$_a = makeString("~a");

    private static final SubLSymbol CB_GUESS_CONSTANT = makeSymbol("CB-GUESS-CONSTANT");

    private static final SubLList $list434 = list(new SubLObject[] { list(list(makeString("isa")), reader_make_constant_shell("isa")), list(list(reader_make_constant_shell("isa")), reader_make_constant_shell("isa")),
	    list(list(makeString("bd588104-9c29-11b1-9dad-c379636f7270")), reader_make_constant_shell("isa")), list(list(makeString("Mx4rvViBBJwpEbGdrcN5Y29ycA")), reader_make_constant_shell("isa")), list(list(makeString("331E2BBD5881049C2911B19DADC379636F7270")), reader_make_constant_shell("isa")),
	    list(list(NIL), NIL), list(list(list(makeString("isa"))), reader_make_constant_shell("isa")), list(list(list(NIL)), NIL), list(list(list(makeString("bd588104-9c29-11b1-9dad-c379636f7270"))), reader_make_constant_shell("isa")),
	    list(list(list(makeString("Mx4rvViBBJwpEbGdrcN5Y29ycA"))), reader_make_constant_shell("isa")), list(list(list(makeString("331E2BBD5881049C2911B19DADC379636F7270"))), reader_make_constant_shell("isa")) });

    private static final SubLSymbol CB_GUESS_DATE = makeSymbol("CB-GUESS-DATE");

    private static final SubLList $list437 = list(new SubLObject[] { list(list(makeString("2064")), list(reader_make_constant_shell("YearFn"), makeInteger(2064))),
	    list(list(makeString("from October 1977 to February 2064")),
		    list(reader_make_constant_shell("TimeIntervalInclusiveFn"), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("October"), list(reader_make_constant_shell("YearFn"), makeInteger(1977))),
			    list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))),
	    list(list(makeString("from 1977 to February 2064")),
		    list(reader_make_constant_shell("TimeIntervalInclusiveFn"), list(reader_make_constant_shell("YearFn"), makeInteger(1977)), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))),
	    list(list(makeString("from 1977 to 2064")), list(reader_make_constant_shell("TimeIntervalInclusiveFn"), list(reader_make_constant_shell("YearFn"), makeInteger(1977)), list(reader_make_constant_shell("YearFn"), makeInteger(2064)))),
	    list(list(makeString("February 2064")), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064)))),
	    list(list(makeString("February, 2064")), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064)))),
	    list(list(makeString("February 29, 2064")), list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))),
	    list(list(makeString("February 29th, 2064")), list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))),
	    list(list(makeString("February 29xx, 2064")), NIL), list(list(makeString("February 29foo, 2064")), NIL),
	    list(list(makeString("2/29/2064")), list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))),
	    list(list(makeString("2-29-2064")), list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))),
	    list(list(makeString("2:12 2-29-2064")),
		    list(reader_make_constant_shell("MinuteFn"), TWELVE_INTEGER,
			    list(reader_make_constant_shell("HourFn"), TWO_INTEGER, list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))))),
	    list(list(makeString("2-29-2064 2:12")),
		    list(reader_make_constant_shell("MinuteFn"), TWELVE_INTEGER,
			    list(reader_make_constant_shell("HourFn"), TWO_INTEGER, list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))))),
	    list(list(makeString("2-29-2064, 2:12")), list(reader_make_constant_shell("MinuteFn"), TWELVE_INTEGER,
		    list(reader_make_constant_shell("HourFn"), TWO_INTEGER, list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))))) });

    // Definitions
    public static final SubLObject cb_url_alt(SubLObject handler, SubLObject control_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
	if (control_string == UNPROVIDED) {
	    control_string = NIL;
	}
	if (arg1 == UNPROVIDED) {
	    arg1 = NIL;
	}
	if (arg2 == UNPROVIDED) {
	    arg2 = NIL;
	}
	if (arg3 == UNPROVIDED) {
	    arg3 = NIL;
	}
	if (arg4 == UNPROVIDED) {
	    arg4 = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt0$_a__a, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), handler);
	    if (NIL != control_string) {
		format(html_macros.$html_stream$.getDynamicValue(thread), control_string, new SubLObject[] { arg1, arg2, arg3, arg4 });
	    }
	    return NIL;
	}
    }

    // Definitions
    public static SubLObject cb_url(final SubLObject handler, SubLObject control_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
	if (control_string == UNPROVIDED) {
	    control_string = NIL;
	}
	if (arg1 == UNPROVIDED) {
	    arg1 = NIL;
	}
	if (arg2 == UNPROVIDED) {
	    arg2 = NIL;
	}
	if (arg3 == UNPROVIDED) {
	    arg3 = NIL;
	}
	if (arg4 == UNPROVIDED) {
	    arg4 = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	format(html_macros.$html_stream$.getDynamicValue(thread), $str0$_a__a, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), handler);
	if (NIL != control_string) {
	    format(html_macros.$html_stream$.getDynamicValue(thread), control_string, new SubLObject[] { arg1, arg2, arg3, arg4 });
	}
	return NIL;
    }

    public static final SubLObject cb_error_alt(SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
	if (arg1 == UNPROVIDED) {
	    arg1 = NIL;
	}
	if (arg2 == UNPROVIDED) {
	    arg2 = NIL;
	}
	if (arg3 == UNPROVIDED) {
	    arg3 = NIL;
	}
	if (arg4 == UNPROVIDED) {
	    arg4 = NIL;
	}
	if (arg5 == UNPROVIDED) {
	    arg5 = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_markup(html_macros.$html_html_head$.getGlobalValue());
	    html_markup(html_macros.$html_head_head$.getGlobalValue());
	    html_macros.html_head_content_type();
	    html_source_readability_terpri(UNPROVIDED);
	    html_markup(html_macros.$html_title_head$.getGlobalValue());
	    html_princ($$$Cyc_error);
	    html_markup(html_macros.$html_title_tail$.getGlobalValue());
	    html_markup(html_macros.$html_head_tail$.getGlobalValue());
	    html_source_readability_terpri(UNPROVIDED);
	    {
		SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_char(CHAR_quotation, UNPROVIDED);
			    html_markup(html_color(color_value));
			    html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_markup(TWO_INTEGER);
				html_char(CHAR_greater, UNPROVIDED);
				html_princ($$$Cyc_error);
				html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_markup(TWO_INTEGER);
				html_char(CHAR_greater, UNPROVIDED);
				html_macros.verify_not_within_html_pre();
				html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
				{
				    SubLObject _prev_bind_0_2 = html_macros.$within_html_pre$.currentBinding(thread);
				    try {
					html_macros.$within_html_pre$.bind(T, thread);
					format(html_macros.$html_stream$.getDynamicValue(thread), format_string, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
				    } finally {
					html_macros.$within_html_pre$.rebind(_prev_bind_0_2, thread);
				    }
				}
				html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
				cb_back_button(UNPROVIDED, UNPROVIDED);
				html_source_readability_terpri(UNPROVIDED);
				html_copyright_notice();
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
			    }
			}
			html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    html_markup(html_macros.$html_html_tail$.getGlobalValue());
	    html_source_readability_terpri(UNPROVIDED);
	    return NIL;
	}
    }

    public static SubLObject cb_error(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
	if (arg1 == UNPROVIDED) {
	    arg1 = NIL;
	}
	if (arg2 == UNPROVIDED) {
	    arg2 = NIL;
	}
	if (arg3 == UNPROVIDED) {
	    arg3 = NIL;
	}
	if (arg4 == UNPROVIDED) {
	    arg4 = NIL;
	}
	if (arg5 == UNPROVIDED) {
	    arg5 = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
	if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
	    html_source_readability_terpri(UNPROVIDED);
	    html_markup($str2$_meta_http_equiv__X_UA_Compatible);
	}
	html_source_readability_terpri(UNPROVIDED);
	final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
	try {
	    cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
	    html_markup(html_macros.$html_html_head$.getGlobalValue());
	    html_markup(html_macros.$html_head_head$.getGlobalValue());
	    html_macros.html_head_content_type();
	    html_source_readability_terpri(UNPROVIDED);
	    html_markup(html_macros.$html_title_head$.getGlobalValue());
	    html_princ($$$Cyc_error);
	    html_markup(html_macros.$html_title_tail$.getGlobalValue());
	    html_markup(html_macros.$html_head_tail$.getGlobalValue());
	    html_source_readability_terpri(UNPROVIDED);
	    final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
	    final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
	    try {
		html_macros.$html_inside_bodyP$.bind(T, thread);
		html_markup(html_macros.$html_body_head$.getGlobalValue());
		if (NIL != color_value) {
		    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_markup(html_color(color_value));
		    html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    html_markup(html_macros.$html_heading_head$.getGlobalValue());
		    html_markup(TWO_INTEGER);
		    html_char(CHAR_greater, UNPROVIDED);
		    html_princ($$$Cyc_error);
		    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
		    html_markup(TWO_INTEGER);
		    html_char(CHAR_greater, UNPROVIDED);
		    html_macros.verify_not_within_html_pre();
		    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
		    final SubLObject _prev_bind_0_$3 = html_macros.$within_html_pre$.currentBinding(thread);
		    try {
			html_macros.$within_html_pre$.bind(T, thread);
			format(html_macros.$html_stream$.getDynamicValue(thread), format_string, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
		    } finally {
			html_macros.$within_html_pre$.rebind(_prev_bind_0_$3, thread);
		    }
		    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
		    cb_back_button(UNPROVIDED, UNPROVIDED);
		    html_source_readability_terpri(UNPROVIDED);
		    html_copyright_notice();
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
		}
		html_markup(html_macros.$html_body_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
	    } finally {
		html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
	    }
	    html_markup(html_macros.$html_html_tail$.getGlobalValue());
	} finally {
	    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
	}
	html_source_readability_terpri(UNPROVIDED);
	return NIL;
    }

    public static final SubLObject cb_show_fi_error_alt(SubLObject fi_error) {
	{
	    SubLObject error_string = fi.fi_error_string(fi_error);
	    return cb_error($str_alt2$_A, error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}
    }

    public static SubLObject cb_show_fi_error(final SubLObject fi_error) {
	final SubLObject error_string = fi.fi_error_string(fi_error);
	return cb_error($str5$_A, error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_simple_message_page_alt(SubLObject message, SubLObject back, SubLObject delay) {
	if (back == UNPROVIDED) {
	    back = ONE_INTEGER;
	}
	if (delay == UNPROVIDED) {
	    delay = $int$2000;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_markup(html_macros.$html_html_head$.getGlobalValue());
	    {
		SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		try {
		    html_macros.$html_inside_bodyP$.bind(T, thread);
		    html_markup(html_macros.$html_body_head$.getGlobalValue());
		    html_indent(ONE_INTEGER);
		    if (back.isInteger()) {
			html_script_utilities.html_back_onload_script(delay);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    {
			SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_markup(html_macros.$html_big_head$.getGlobalValue());
			    html_markup(html_macros.$html_strong_head$.getGlobalValue());
			    html_princ(message);
			    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			    html_markup(html_macros.$html_big_tail$.getGlobalValue());
			    html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
			}
		    }
		    html_markup(html_macros.$html_body_tail$.getGlobalValue());
		    html_source_readability_terpri(UNPROVIDED);
		} finally {
		    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		}
	    }
	    html_markup(html_macros.$html_html_tail$.getGlobalValue());
	    html_source_readability_terpri(UNPROVIDED);
	    return NIL;
	}
    }

    public static SubLObject cb_simple_message_page(final SubLObject message, SubLObject back, SubLObject delay) {
	if (back == UNPROVIDED) {
	    back = ONE_INTEGER;
	}
	if (delay == UNPROVIDED) {
	    delay = $int$2000;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
	if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
	    html_source_readability_terpri(UNPROVIDED);
	    html_markup($str2$_meta_http_equiv__X_UA_Compatible);
	}
	html_source_readability_terpri(UNPROVIDED);
	final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
	try {
	    cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
	    html_markup(html_macros.$html_html_head$.getGlobalValue());
	    final SubLObject _prev_bind_0_$4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
	    try {
		html_macros.$html_inside_bodyP$.bind(T, thread);
		html_markup(html_macros.$html_body_head$.getGlobalValue());
		html_char(CHAR_space, UNPROVIDED);
		if (back.isInteger()) {
		    html_script_utilities.html_back_onload_script(delay);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    html_markup(html_macros.$html_big_head$.getGlobalValue());
		    html_markup(html_macros.$html_strong_head$.getGlobalValue());
		    html_princ(message);
		    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		    html_markup(html_macros.$html_big_tail$.getGlobalValue());
		    html_source_readability_terpri(UNPROVIDED);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
		}
		html_markup(html_macros.$html_body_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
	    } finally {
		html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$4, thread);
	    }
	    html_markup(html_macros.$html_html_tail$.getGlobalValue());
	} finally {
	    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
	}
	html_source_readability_terpri(UNPROVIDED);
	return NIL;
    }

    public static SubLObject cb_history_with_back_link(SubLObject back_staleP) {
	if (back_staleP == UNPROVIDED) {
	    back_staleP = T;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_markup(html_macros.$html_form_head$.getGlobalValue());
	html_markup(html_macros.$html_form_action$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
	html_char(CHAR_quotation, UNPROVIDED);
	html_char(CHAR_greater, UNPROVIDED);
	final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
	final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    html_macros.$within_html_form$.bind(T, thread);
	    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
	    if (NIL != back_staleP) {
		cb_back_button($SELF, $str8$Back_to_previous__stale__page);
	    } else {
		cb_back_button($SELF, $$$Back_to_previous_page);
	    }
	    html_hr(UNPROVIDED, UNPROVIDED);
	    cb_tools.cb_show_history_info(UNPROVIDED);
	    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
	} finally {
	    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
	    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_form_tail$.getGlobalValue());
	return NIL;
    }

    public static final SubLObject cb_message_page_with_history_alt(SubLObject message, SubLObject back_staleP) {
	if (back_staleP == UNPROVIDED) {
	    back_staleP = T;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject title_var = message;
		{
		    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
		    try {
			html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread)))
				: integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
			html_markup(html_macros.$html_html_head$.getGlobalValue());
			html_markup(html_macros.$html_head_head$.getGlobalValue());
			html_macros.html_head_content_type();
			cb_head_shortcut_icon();
			html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
			if (NIL != title_var) {
			    html_source_readability_terpri(UNPROVIDED);
			    html_markup(html_macros.$html_title_head$.getGlobalValue());
			    html_princ(title_var);
			    html_markup(html_macros.$html_title_tail$.getGlobalValue());
			}
			html_markup(html_macros.$html_head_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
			{
			    SubLObject _prev_bind_0_4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			    try {
				html_macros.$html_inside_bodyP$.bind(T, thread);
				html_markup(html_macros.$html_body_head$.getGlobalValue());
				if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
				    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				    html_char(CHAR_quotation, UNPROVIDED);
				    html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
				    html_char(CHAR_quotation, UNPROVIDED);
				}
				if (true) {
				    html_markup(html_macros.$html_body_class$.getGlobalValue());
				    html_char(CHAR_quotation, UNPROVIDED);
				    html_markup($str_alt6$yui_skin_sam);
				    html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					if (NIL != title_var) {
					    html_markup(html_macros.$html_heading_head$.getGlobalValue());
					    html_markup(TWO_INTEGER);
					    html_char(CHAR_greater, UNPROVIDED);
					    html_princ(title_var);
					    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
					    html_markup(TWO_INTEGER);
					    html_char(CHAR_greater, UNPROVIDED);
					}
					html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_char(CHAR_quotation, UNPROVIDED);
					html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						if (NIL != back_staleP) {
						    cb_back_button($SELF, $str_alt8$Back_to_previous__stale__page);
						} else {
						    cb_back_button($SELF, $$$Back_to_previous_page);
						}
						html_hr(UNPROVIDED, UNPROVIDED);
						cb_show_recent_history();
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
					    }
					}
					html_markup(html_macros.$html_form_tail$.getGlobalValue());
					html_source_readability_terpri(UNPROVIDED);
					html_copyright_notice();
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
				    }
				}
				html_markup(html_macros.$html_body_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_4, thread);
			    }
			}
			html_markup(html_macros.$html_html_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_message_page_with_history(final SubLObject message, SubLObject back_staleP) {
	if (back_staleP == UNPROVIDED) {
	    back_staleP = T;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
	try {
	    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread)
		    : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
	    html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
	    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
		html_source_readability_terpri(UNPROVIDED);
		html_markup($str2$_meta_http_equiv__X_UA_Compatible);
	    }
	    html_source_readability_terpri(UNPROVIDED);
	    final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
	    try {
		cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
		html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		cb_head_shortcut_icon();
		html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
		cyc_file_dependencies.css($CB_CYC);
		dhtml_macros.html_basic_cb_scripts();
		if (NIL != message) {
		    html_source_readability_terpri(UNPROVIDED);
		    html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_princ(message);
		    html_markup(html_macros.$html_title_tail$.getGlobalValue());
		}
		html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
		    html_markup($str13$yui_skin_sam);
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_char(CHAR_greater, UNPROVIDED);
		    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($$$reloadFrameButton);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
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
			    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			if (NIL != message) {
			    html_markup(html_macros.$html_heading_head$.getGlobalValue());
			    html_markup(TWO_INTEGER);
			    html_char(CHAR_greater, UNPROVIDED);
			    html_princ(message);
			    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
			    html_markup(TWO_INTEGER);
			    html_char(CHAR_greater, UNPROVIDED);
			}
			cb_history_with_back_link(back_staleP);
			html_source_readability_terpri(UNPROVIDED);
			html_copyright_notice();
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
		    }
		    html_markup(html_macros.$html_body_tail$.getGlobalValue());
		    html_source_readability_terpri(UNPROVIDED);
		} finally {
		    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
		}
		html_markup(html_macros.$html_html_tail$.getGlobalValue());
	    } finally {
		cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$6, thread);
	    }
	    html_source_readability_terpri(UNPROVIDED);
	} finally {
	    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static SubLObject cb_titled_message_page_with_history(final SubLObject title, final SubLObject messages, SubLObject back_staleP) {
	if (back_staleP == UNPROVIDED) {
	    back_staleP = T;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
	try {
	    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread)
		    : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
	    html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
	    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
		html_source_readability_terpri(UNPROVIDED);
		html_markup($str2$_meta_http_equiv__X_UA_Compatible);
	    }
	    html_source_readability_terpri(UNPROVIDED);
	    final SubLObject _prev_bind_0_$10 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
	    try {
		cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
		html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		cb_head_shortcut_icon();
		html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
		cyc_file_dependencies.css($CB_CYC);
		dhtml_macros.html_basic_cb_scripts();
		if (NIL != title) {
		    html_source_readability_terpri(UNPROVIDED);
		    html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_princ(title);
		    html_markup(html_macros.$html_title_tail$.getGlobalValue());
		}
		html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
		    html_markup($str13$yui_skin_sam);
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_char(CHAR_greater, UNPROVIDED);
		    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_div_head$.getGlobalValue());
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($$$reloadFrameButton);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
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
			    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
			}
			html_markup(html_macros.$html_div_tail$.getGlobalValue());
			if (NIL != title) {
			    html_markup(html_macros.$html_heading_head$.getGlobalValue());
			    html_markup(TWO_INTEGER);
			    html_char(CHAR_greater, UNPROVIDED);
			    html_princ(title);
			    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
			    html_markup(TWO_INTEGER);
			    html_char(CHAR_greater, UNPROVIDED);
			}
			html_macros.verify_not_within_html_pre();
			html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
			final SubLObject _prev_bind_0_$14 = html_macros.$within_html_pre$.currentBinding(thread);
			try {
			    html_macros.$within_html_pre$.bind(T, thread);
			    SubLObject cdolist_list_var = messages;
			    SubLObject message = NIL;
			    message = cdolist_list_var.first();
			    while (NIL != cdolist_list_var) {
				html_princ(message);
				html_terpri(UNPROVIDED);
				cdolist_list_var = cdolist_list_var.rest();
				message = cdolist_list_var.first();
			    }
			} finally {
			    html_macros.$within_html_pre$.rebind(_prev_bind_0_$14, thread);
			}
			html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
			cb_history_with_back_link(back_staleP);
			html_source_readability_terpri(UNPROVIDED);
			html_copyright_notice();
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
		    }
		    html_markup(html_macros.$html_body_tail$.getGlobalValue());
		    html_source_readability_terpri(UNPROVIDED);
		} finally {
		    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$11, thread);
		}
		html_markup(html_macros.$html_html_tail$.getGlobalValue());
	    } finally {
		cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$10, thread);
	    }
	    html_source_readability_terpri(UNPROVIDED);
	} finally {
	    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static final SubLObject cb_frame_update_message_page_info_alt(SubLObject page_name) {
	html_newline(TWO_INTEGER);
	{
	    SubLObject message = cconcatenate($str_alt10$Back_to__stale__, new SubLObject[] { format_nil.format_nil_a_no_copy(page_name), $str_alt11$_page });
	    cb_back_button($SELF, message);
	}
	html_hr(UNPROVIDED, UNPROVIDED);
	cb_show_recent_history();
	return NIL;
    }

    public static SubLObject cb_frame_update_message_page_info(final SubLObject page_name) {
	html_newline(TWO_INTEGER);
	final SubLObject message = cconcatenate($str18$Back_to__stale__, new SubLObject[] { format_nil.format_nil_a_no_copy(page_name), $$$_page });
	cb_back_button($SELF, message);
	html_hr(UNPROVIDED, UNPROVIDED);
	cb_tools.cb_show_history_info(UNPROVIDED);
	return NIL;
    }

    public static final SubLObject cb_show_truth_alt(SubLObject truth) {
	{
	    SubLObject pcase_var = truth;
	    if (pcase_var.eql($TRUE)) {
		html_princ($$$True);
	    } else {
		if (pcase_var.eql($FALSE)) {
		    html_princ($$$False);
		} else {
		    if (pcase_var.eql($UNKNOWN)) {
			html_princ($$$Unknown);
		    } else {
			html_princ($str_alt18$___);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject cb_show_truth(final SubLObject truth) {
	if (truth.eql($TRUE)) {
	    html_princ($$$True);
	} else if (truth.eql($FALSE)) {
	    html_princ($$$False);
	} else if (truth.eql($UNKNOWN)) {
	    html_princ($$$Unknown);
	} else {
	    html_princ($str26$___);
	}

	return NIL;
    }

    public static final SubLObject cb_show_strength_alt(SubLObject strength) {
	{
	    SubLObject pcase_var = strength;
	    if (pcase_var.eql($DEFAULT)) {
		html_princ($$$Default);
	    } else {
		if (pcase_var.eql($MONOTONIC)) {
		    html_princ($$$Monotonic);
		} else {
		    if (pcase_var.eql($UNKNOWN)) {
			html_princ($$$Unknown);
		    } else {
			html_princ($str_alt18$___);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject cb_show_strength(final SubLObject strength) {
	if (strength.eql($DEFAULT)) {
	    html_princ($$$Default);
	} else if (strength.eql($MONOTONIC)) {
	    html_princ($$$Monotonic);
	} else if (strength.eql($UNKNOWN)) {
	    html_princ($$$Unknown);
	} else {
	    html_princ($str26$___);
	}

	return NIL;
    }

    public static final SubLObject cb_show_direction_alt(SubLObject direction) {
	{
	    SubLObject pcase_var = direction;
	    if (pcase_var.eql($FORWARD)) {
		html_princ($$$Forward);
	    } else {
		if (pcase_var.eql($BACKWARD)) {
		    html_princ($$$Backward);
		} else {
		    if (pcase_var.eql($CODE)) {
			html_princ($$$Code);
		    } else {
			html_princ($str_alt18$___);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject cb_show_direction(final SubLObject direction) {
	if (direction.eql($FORWARD)) {
	    html_princ($$$Forward);
	} else if (direction.eql($BACKWARD)) {
	    html_princ($$$Backward);
	} else if (direction.eql($CODE)) {
	    html_princ($$$Code);
	} else {
	    html_princ($str26$___);
	}

	return NIL;
    }

    public static final SubLObject cb_show_support_module_alt(SubLObject module) {
	html_markup(html_macros.$html_teletype_head$.getGlobalValue());
	html_princ(module);
	html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
	return NIL;
    }

    public static SubLObject cb_show_support_module(final SubLObject module) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_markup(html_macros.$html_teletype_head$.getGlobalValue());
	format(html_macros.$html_stream$.getDynamicValue(thread), $str37$_S, module);
	html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
	return NIL;
    }

    /**
     * Return a suggested font size for displaying TERM given that
     * BASELINE is the normal font size to use for things that will
     * fit in ALLOWED-WIDTH characters.
     */
    @LispMethod(comment = "Return a suggested font size for displaying TERM given that\r\nBASELINE is the normal font size to use for things that will\r\nfit in ALLOWED-WIDTH characters.\nReturn a suggested font size for displaying TERM given that\nBASELINE is the normal font size to use for things that will\nfit in ALLOWED-WIDTH characters.")
    public static final SubLObject cb_term_font_size_alt(SubLObject v_term, SubLObject baseline, SubLObject allowed_width) {
	if (baseline == UNPROVIDED) {
	    baseline = THREE_INTEGER;
	}
	if (allowed_width == UNPROVIDED) {
	    allowed_width = $int$30;
	}
	if (NIL != nart_handles.nart_p(v_term)) {
	    return number_utilities.f_1_(baseline);
	} else {
	    if ((NIL != constant_p(v_term)) && length(constants_high.constant_name(v_term)).numG(allowed_width)) {
		return number_utilities.f_1_(baseline);
	    } else {
		if (NIL != constant_p(v_term)) {
		    return baseline;
		} else {
		    if (v_term.isString() && length(v_term).numG(allowed_width)) {
			return number_utilities.f_1_(baseline);
		    } else {
			if (v_term.isString()) {
			    return baseline;
			} else {
			    return baseline;
			}
		    }
		}
	    }
	}
    }

    /**
     * Return a suggested font size for displaying TERM given that
     * BASELINE is the normal font size to use for things that will
     * fit in ALLOWED-WIDTH characters.
     */
    @LispMethod(comment = "Return a suggested font size for displaying TERM given that\r\nBASELINE is the normal font size to use for things that will\r\nfit in ALLOWED-WIDTH characters.\nReturn a suggested font size for displaying TERM given that\nBASELINE is the normal font size to use for things that will\nfit in ALLOWED-WIDTH characters.")
    public static SubLObject cb_term_font_size(final SubLObject v_term, SubLObject baseline, SubLObject allowed_width) {
	if (baseline == UNPROVIDED) {
	    baseline = THREE_INTEGER;
	}
	if (allowed_width == UNPROVIDED) {
	    allowed_width = $int$30;
	}
	if (NIL != nart_handles.nart_p(v_term)) {
	    return number_utilities.f_1_(baseline);
	}
	if ((NIL != constant_p(v_term)) && length(constants_high.constant_name(v_term)).numG(allowed_width)) {
	    return number_utilities.f_1_(baseline);
	}
	if (NIL != constant_p(v_term)) {
	    return baseline;
	}
	if (v_term.isString() && length(v_term).numG(allowed_width)) {
	    return number_utilities.f_1_(baseline);
	}
	if (v_term.isString()) {
	    return baseline;
	}
	return baseline;
    }

    public static final SubLObject cb_show_date_alt(SubLObject universal_date) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject day = numeric_date_utilities.decode_universal_date(universal_date);
		SubLObject month = thread.secondMultipleValue();
		SubLObject year = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		month = numeric_date_utilities.abbreviation_for_month_number(month);
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt30$_A__A___A, new SubLObject[] { month, day, year });
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_show_date(final SubLObject universal_date) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	thread.resetMultipleValues();
	final SubLObject day = numeric_date_utilities.decode_universal_date(universal_date);
	SubLObject month = thread.secondMultipleValue();
	final SubLObject year = thread.thirdMultipleValue();
	thread.resetMultipleValues();
	month = numeric_date_utilities.abbreviation_for_month_number(month);
	format(html_macros.$html_stream$.getDynamicValue(thread), $str39$_A__A___A, new SubLObject[] { month, day, year });
	return NIL;
    }

    public static final SubLObject cb_show_second_alt(SubLObject universal_second) {
	html_princ(numeric_date_utilities.secondstring(universal_second));
	return NIL;
    }

    public static SubLObject cb_show_second(final SubLObject universal_second) {
	html_princ(numeric_date_utilities.secondstring(universal_second));
	return NIL;
    }

    public static final SubLObject cb_show_cyclist_alt(SubLObject cyclist) {
	if (NIL != kb_control_vars.lexicon_kb_loaded_p()) {
	    {
		SubLObject html = cb_html_for_cyclist_in_nl(cyclist, UNPROVIDED, UNPROVIDED);
		return html_markup(html);
	    }
	}
	return cb_form(cyclist, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_show_cyclist(final SubLObject cyclist) {
	if (NIL != kb_control_vars.lexicon_kb_loaded_p()) {
	    final SubLObject html = cb_html_for_cyclist_in_nl(cyclist, UNPROVIDED, UNPROVIDED);
	    return html_markup(html);
	}
	return cb_form(cyclist, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject clear_cb_html_for_cyclist_in_nl_alt() {
	{
	    SubLObject cs = $cb_html_for_cyclist_in_nl_caching_state$.getGlobalValue();
	    if (NIL != cs) {
		memoization_state.caching_state_clear(cs);
	    }
	}
	return NIL;
    }

    public static SubLObject clear_cb_html_for_cyclist_in_nl() {
	final SubLObject cs = $cb_html_for_cyclist_in_nl_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static final SubLObject remove_cb_html_for_cyclist_in_nl_alt(SubLObject cyclist, SubLObject addressee, SubLObject domain_mt) {
	if (addressee == UNPROVIDED) {
	    addressee = operation_communication.the_cyclist();
	}
	if (domain_mt == UNPROVIDED) {
	    domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	return memoization_state.caching_state_remove_function_results_with_args($cb_html_for_cyclist_in_nl_caching_state$.getGlobalValue(), list(cyclist, addressee, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cb_html_for_cyclist_in_nl(final SubLObject cyclist, SubLObject addressee, SubLObject domain_mt) {
	if (addressee == UNPROVIDED) {
	    addressee = operation_communication.the_cyclist();
	}
	if (domain_mt == UNPROVIDED) {
	    domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	return memoization_state.caching_state_remove_function_results_with_args($cb_html_for_cyclist_in_nl_caching_state$.getGlobalValue(), list(cyclist, addressee, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_html_for_cyclist_in_nl_internal_alt(SubLObject cyclist, SubLObject addressee, SubLObject domain_mt) {
	return cb_html_for_obj_in_nl(cyclist, domain_mt, HTML_GENERATE_PHRASE, addressee);
    }

    public static SubLObject cb_html_for_cyclist_in_nl_internal(final SubLObject cyclist, final SubLObject addressee, final SubLObject domain_mt) {
	return cb_html_for_obj_in_nl(cyclist, domain_mt, HTML_GENERATE_PHRASE, addressee);
    }

    public static final SubLObject cb_html_for_cyclist_in_nl_alt(SubLObject cyclist, SubLObject addressee, SubLObject domain_mt) {
	if (addressee == UNPROVIDED) {
	    addressee = operation_communication.the_cyclist();
	}
	if (domain_mt == UNPROVIDED) {
	    domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	{
	    SubLObject caching_state = $cb_html_for_cyclist_in_nl_caching_state$.getGlobalValue();
	    if (NIL == caching_state) {
		caching_state = memoization_state.create_global_caching_state_for_name(CB_HTML_FOR_CYCLIST_IN_NL, $cb_html_for_cyclist_in_nl_caching_state$, TWENTY_INTEGER, EQL, THREE_INTEGER, ZERO_INTEGER);
	    }
	    {
		SubLObject sxhash = memoization_state.sxhash_calc_3(cyclist, addressee, domain_mt);
		SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (collisions != $kw34$_MEMOIZED_ITEM_NOT_FOUND_) {
		    {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
			    {
				SubLObject cached_args = collision.first();
				SubLObject results2 = second(collision);
				if (cyclist.eql(cached_args.first())) {
				    cached_args = cached_args.rest();
				    if (addressee.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
					    return memoization_state.caching_results(results2);
					}
				    }
				}
			    }
			}
		    }
		}
		{
		    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(cb_html_for_cyclist_in_nl_internal(cyclist, addressee, domain_mt)));
		    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(cyclist, addressee, domain_mt));
		    return memoization_state.caching_results(results);
		}
	    }
	}
    }

    public static SubLObject cb_html_for_cyclist_in_nl(final SubLObject cyclist, SubLObject addressee, SubLObject domain_mt) {
	if (addressee == UNPROVIDED) {
	    addressee = operation_communication.the_cyclist();
	}
	if (domain_mt == UNPROVIDED) {
	    domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	SubLObject caching_state = $cb_html_for_cyclist_in_nl_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name(CB_HTML_FOR_CYCLIST_IN_NL, $cb_html_for_cyclist_in_nl_caching_state$, TWENTY_INTEGER, EQL, THREE_INTEGER, ZERO_INTEGER);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_3(cyclist, addressee, domain_mt);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (cyclist.eql(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (addressee.eql(cached_args.first())) {
			cached_args = cached_args.rest();
			if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
			    return memoization_state.caching_results(results2);
			}
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cb_html_for_cyclist_in_nl_internal(cyclist, addressee, domain_mt)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cyclist, addressee, domain_mt));
	return memoization_state.caching_results(results3);
    }

    /**
     * The documentation url where renaming and killing are described.
     */
    @LispMethod(comment = "The documentation url where renaming and killing are described.")
    public static final SubLObject cyc_system_doc_rename_kill_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), $str_alt35$ref_renames_kills_html);
	}
    }

    /**
     * The documentation url where renaming and killing are described.
     */
    @LispMethod(comment = "The documentation url where renaming and killing are described.")
    public static SubLObject cyc_system_doc_rename_kill() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), $str43$ref_renames_kills_html);
    }

    /**
     * The documentation url where the naming conventions are described.
     */
    @LispMethod(comment = "The documentation url where the naming conventions are described.")
    public static final SubLObject cyc_system_doc_naming_conventions_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), $str_alt36$ref_cycl_syntax_html_naming_conve);
	}
    }

    /**
     * The documentation url where the naming conventions are described.
     */
    @LispMethod(comment = "The documentation url where the naming conventions are described.")
    public static SubLObject cyc_system_doc_naming_conventions() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), $str44$ref_cycl_syntax_html_naming_conve);
    }

    public static final SubLObject cyc_documentation_toc_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), $str_alt37$toc_html);
	}
    }

    public static SubLObject cyc_documentation_toc() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), $str45$toc_html);
    }

    /**
     * Generalized way to provide a link to documentation.
     * Assumes:
     * Called inside an html document.
     * Input:
     * about       The information that this help page will describe
     * (creating links, for example).
     * link-text   The text that will be highlight as a link.  Example:
     * Cyc Rename/Kill Documentation.
     * html-file   The name of the doc file.
     * anchor      An anchor within that doc file to jump to.
     */
    @LispMethod(comment = "Generalized way to provide a link to documentation.\r\nAssumes:\r\nCalled inside an html document.\r\nInput:\r\nabout       The information that this help page will describe\r\n(creating links, for example).\r\nlink-text   The text that will be highlight as a link.  Example:\r\nCyc Rename/Kill Documentation.\r\nhtml-file   The name of the doc file.\r\nanchor      An anchor within that doc file to jump to.\nGeneralized way to provide a link to documentation.\nAssumes:\nCalled inside an html document.\nInput:\nabout       The information that this help page will describe\n(creating links, for example).\nlink-text   The text that will be highlight as a link.  Example:\nCyc Rename/Kill Documentation.\nhtml-file   The name of the doc file.\nanchor      An anchor within that doc file to jump to.")
    public static final SubLObject cb_doc_link_alt(SubLObject about, SubLObject link_text, SubLObject html_file, SubLObject anchor) {
	if (anchor == UNPROVIDED) {
	    anchor = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_indent(THREE_INTEGER);
	    html_markup(html_macros.$html_italic_head$.getGlobalValue());
	    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt38$__For_detailed_help_and_warnings_, about);
	    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_princ(html_file);
	    if (NIL != anchor) {
		html_princ($str_alt39$_);
		html_princ(anchor);
	    }
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_char(CHAR_greater, UNPROVIDED);
	    {
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    html_princ(link_text);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
	    }
	    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	    html_princ($str_alt40$_documentation_);
	    html_markup(html_macros.$html_italic_tail$.getGlobalValue());
	    return NIL;
	}
    }

    /**
     * Generalized way to provide a link to documentation.
     * Assumes:
     * Called inside an html document.
     * Input:
     * about       The information that this help page will describe
     * (creating links, for example).
     * link-text   The text that will be highlight as a link.  Example:
     * Cyc Rename/Kill Documentation.
     * html-file   The name of the doc file.
     * anchor      An anchor within that doc file to jump to.
     */
    @LispMethod(comment = "Generalized way to provide a link to documentation.\r\nAssumes:\r\nCalled inside an html document.\r\nInput:\r\nabout       The information that this help page will describe\r\n(creating links, for example).\r\nlink-text   The text that will be highlight as a link.  Example:\r\nCyc Rename/Kill Documentation.\r\nhtml-file   The name of the doc file.\r\nanchor      An anchor within that doc file to jump to.\nGeneralized way to provide a link to documentation.\nAssumes:\nCalled inside an html document.\nInput:\nabout       The information that this help page will describe\n(creating links, for example).\nlink-text   The text that will be highlight as a link.  Example:\nCyc Rename/Kill Documentation.\nhtml-file   The name of the doc file.\nanchor      An anchor within that doc file to jump to.")
    public static SubLObject cb_doc_link(final SubLObject about, final SubLObject link_text, final SubLObject html_file, SubLObject anchor) {
	if (anchor == UNPROVIDED) {
	    anchor = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_indent(THREE_INTEGER);
	html_markup(html_macros.$html_italic_head$.getGlobalValue());
	format(html_macros.$html_stream$.getDynamicValue(thread), $str46$__For_detailed_help_and_warnings_, about);
	html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	html_princ(html_file);
	if (NIL != anchor) {
	    html_princ($str47$_);
	    html_princ(anchor);
	}
	html_char(CHAR_quotation, UNPROVIDED);
	html_char(CHAR_greater, UNPROVIDED);
	final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    html_princ(link_text);
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	html_princ($str48$_documentation_);
	html_markup(html_macros.$html_italic_tail$.getGlobalValue());
	return NIL;
    }

    public static final SubLObject cb_show_boolean_alt(SubLObject v_boolean) {
	return html_princ(NIL != list_utilities.sublisp_boolean(v_boolean) ? ((SubLObject) ($$$Yes)) : $$$No);
    }

    public static SubLObject cb_show_boolean(final SubLObject v_boolean) {
	return html_princ(boolean_yes_no_string(v_boolean));
    }

    public static SubLObject boolean_yes_no_string(final SubLObject v_boolean) {
	return NIL != v_boolean ? $$$Yes : $$$No;
    }

    public static final SubLObject cb_available_tools_alt() {
	return copy_list($cb_available_tools$.getGlobalValue());
    }

    public static SubLObject cb_available_tools() {
	return copy_list($cb_available_tools$.getGlobalValue());
    }

    public static SubLObject cb_standard_tools() {
	return set_difference(cb_available_tools(), cb_deprecated_tools(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_deprecated_tools() {
	return remove($DEPRECATED, $cb_available_tools$.getGlobalValue(), symbol_function(NOT_EQL), symbol_function(FIFTH), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_clear_available_tools_alt() {
	$cb_available_tools$.setGlobalValue(NIL);
	return NIL;
    }

    public static SubLObject cb_clear_available_tools() {
	$cb_available_tools$.setGlobalValue(NIL);
	return NIL;
    }

    /**
     * Declare that TOOL is an available tool for the HTML toolbar.
     * DESCRIPTION is a verbose description of the tool for the Tool display.
     * PRETTY-NAME is a readable name for the tool for the Tool display.
     * ABBREVIATION, if present, is a short name for the tool to appear in the toolbar.
     * If not given, PRETTY-NAME is used to generate the abbreviation.
     */
    @LispMethod(comment = "Declare that TOOL is an available tool for the HTML toolbar.\r\nDESCRIPTION is a verbose description of the tool for the Tool display.\r\nPRETTY-NAME is a readable name for the tool for the Tool display.\r\nABBREVIATION, if present, is a short name for the tool to appear in the toolbar.\r\nIf not given, PRETTY-NAME is used to generate the abbreviation.\nDeclare that TOOL is an available tool for the HTML toolbar.\nDESCRIPTION is a verbose description of the tool for the Tool display.\nPRETTY-NAME is a readable name for the tool for the Tool display.\nABBREVIATION, if present, is a short name for the tool to appear in the toolbar.\nIf not given, PRETTY-NAME is used to generate the abbreviation.")
    public static final SubLObject declare_cb_tool_alt(SubLObject tool, SubLObject pretty_name, SubLObject abbreviation, SubLObject description) {
	undeclare_cb_tool(tool);
	$cb_available_tools$.setGlobalValue(cons(list(tool, pretty_name, abbreviation, description), $cb_available_tools$.getGlobalValue()));
	return NIL;
    }

    /**
     * Declare that TOOL is an available tool for the HTML toolbar.
     * DESCRIPTION is a verbose description of the tool for the Tool display.
     * PRETTY-NAME is a readable name for the tool for the Tool display.
     * ABBREVIATION, if present, is a short name for the tool to appear in the toolbar.
     * If not given, PRETTY-NAME is used to generate the abbreviation.
     */
    @LispMethod(comment = "Declare that TOOL is an available tool for the HTML toolbar.\r\nDESCRIPTION is a verbose description of the tool for the Tool display.\r\nPRETTY-NAME is a readable name for the tool for the Tool display.\r\nABBREVIATION, if present, is a short name for the tool to appear in the toolbar.\r\nIf not given, PRETTY-NAME is used to generate the abbreviation.\nDeclare that TOOL is an available tool for the HTML toolbar.\nDESCRIPTION is a verbose description of the tool for the Tool display.\nPRETTY-NAME is a readable name for the tool for the Tool display.\nABBREVIATION, if present, is a short name for the tool to appear in the toolbar.\nIf not given, PRETTY-NAME is used to generate the abbreviation.")
    public static SubLObject declare_cb_tool(final SubLObject tool, final SubLObject pretty_name, final SubLObject abbreviation, final SubLObject description) {
	undeclare_cb_tool(tool);
	$cb_available_tools$.setGlobalValue(cons(list(tool, pretty_name, abbreviation, description, $STANDARD), $cb_available_tools$.getGlobalValue()));
	return NIL;
    }

    public static SubLObject declare_deprecated_cb_tool(final SubLObject tool, final SubLObject pretty_name, final SubLObject abbreviation, final SubLObject description) {
	undeclare_cb_tool(tool);
	$cb_available_tools$.setGlobalValue(cons(list(tool, pretty_name, abbreviation, description, $DEPRECATED), $cb_available_tools$.getGlobalValue()));
	return NIL;
    }

    public static final SubLObject undeclare_cb_tool_alt(SubLObject tool) {
	$cb_available_tools$.setGlobalValue(delete(tool, $cb_available_tools$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
	return tool;
    }

    public static SubLObject undeclare_cb_tool(final SubLObject tool) {
	$cb_available_tools$.setGlobalValue(delete(tool, $cb_available_tools$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
	return tool;
    }

    public static final SubLObject cb_tool_name_alt(SubLObject tool) {
	return second(assoc(tool, $cb_available_tools$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cb_tool_name(final SubLObject tool) {
	return second(assoc(tool, $cb_available_tools$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_tool_abbreviation_alt(SubLObject tool) {
	return third(assoc(tool, $cb_available_tools$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cb_tool_abbreviation(final SubLObject tool) {
	return third(assoc(tool, $cb_available_tools$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_definitional_preds_for_type_alt(SubLObject type) {
	return assoc(type, $cb_c_definitional_type_pred_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject cb_definitional_preds_for_type(final SubLObject type) {
	return assoc(type, $cb_c_definitional_type_pred_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
    }

    public static final SubLObject cb_definitional_preds_for_fort_alt(SubLObject fort) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject preds = NIL;
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		    try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			{
			    SubLObject type = fort_types_interface.definitional_fort_type(fort, NIL);
			    preds = cb_definitional_preds_for_type(type);
			}
		    } finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		    }
		}
		return preds;
	    }
	}
    }

    public static SubLObject cb_definitional_preds_for_fort(final SubLObject fort) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject preds = NIL;
	final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
	try {
	    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
	    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
	    final SubLObject type = fort_types_interface.definitional_fort_type(fort, NIL);
	    preds = cb_definitional_preds_for_type(type);
	} finally {
	    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
	    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
	}
	return preds;
    }

    public static final SubLObject cb_sort_preds_for_display_alt(SubLObject fort, SubLObject predicates, SubLObject key) {
	if (key == UNPROVIDED) {
	    key = symbol_function(IDENTITY);
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    predicates = list_utilities.delete_if_not(symbol_function($sym48$VALID_FORT_), predicates, key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    predicates = kb_utilities.sort_terms(predicates, NIL, NIL, T, T, key, UNPROVIDED);
	    if (NIL == forts.fort_p(fort)) {
		return predicates;
	    }
	    {
		SubLObject type = NIL;
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		    try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			type = fort_types_interface.definitional_fort_type(fort, NIL);
		    } finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		    }
		}
		{
		    SubLObject guide_seq = assoc(type, $cb_c_definitional_type_pred_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
		    return list_utilities.stable_sort_via_position(predicates, guide_seq, symbol_function(EQ), key);
		}
	    }
	}
    }

    public static SubLObject cb_sort_preds_for_display(final SubLObject fort, SubLObject predicates, SubLObject key) {
	if (key == UNPROVIDED) {
	    key = symbol_function(IDENTITY);
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	predicates = list_utilities.delete_if_not(symbol_function($sym60$VALID_FORT_), predicates, key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	predicates = kb_utilities.sort_terms(predicates, NIL, NIL, T, T, key, UNPROVIDED);
	if (NIL == forts.fort_p(fort)) {
	    return predicates;
	}
	SubLObject type = NIL;
	final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
	try {
	    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
	    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
	    type = fort_types_interface.definitional_fort_type(fort, NIL);
	} finally {
	    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
	    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
	}
	final SubLObject guide_seq = cb_definitional_preds_for_type(type);
	return list_utilities.stable_sort_via_position(predicates, guide_seq, symbol_function(EQL), key);
    }

    public static final SubLObject cb_sort_mts_for_display(SubLObject mts) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    mts = list_utilities.delete_if_not(symbol_function(VALID_HLMT_P), mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    mts = kb_utilities.sort_terms(mts, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (NIL == $cb_fastP$.getDynamicValue(thread)) {
		{
		    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
		    {
			SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
			SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
			SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
			try {
			    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
			    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
			    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
			    mts = Sort.stable_sort(mts, $sym50$MT_STARTS_BEFORE_STARTING_OF_, UNPROVIDED);
			    mts = Sort.stable_sort(mts, $sym51$MT_ENDS_BEFORE_ENDING_OF_, UNPROVIDED);
			} finally {
			    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
			    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
			    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
			}
		    }
		}
	    }
	    mts = mt_vars.push_core_mts_to_beginning(mts);
	    return mts;
	}
    }

    public static SubLObject cb_sort_mts_for_display(SubLObject mts, SubLObject max_to_temporally_sort) {
	if (max_to_temporally_sort == UNPROVIDED) {
	    max_to_temporally_sort = $cb_max_mts_to_sort_temporally$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	mts = kb_utilities.sort_terms(mts, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	mts = kb_utilities.sort_terms(mts, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	if ((NIL == $cb_fastP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthG(mts, max_to_temporally_sort, UNPROVIDED))) {
	    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
	    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
	    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
	    try {
		sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
		sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
		sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
		final SubLObject local_state;
		final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
		final SubLObject _prev_bind_0_$15 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
		    memoization_state.$memoization_state$.bind(local_state, thread);
		    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
		    try {
			mts = Sort.stable_sort(mts, $sym61$POTENTIALLY_INFINITE_INTEGER__, MT_START_UNIVERSAL_TIME_EXTENDED);
			mts = Sort.stable_sort(mts, $sym61$POTENTIALLY_INFINITE_INTEGER__, MT_END_UNIVERSAL_TIME_EXTENDED);
		    } finally {
			final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
			    $is_thread_performing_cleanupP$.bind(T, thread);
			    final SubLObject _values = getValuesAsVector();
			    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
			    restoreValuesFromVector(_values);
			} finally {
			    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
			}
		    }
		} finally {
		    memoization_state.$memoization_state$.rebind(_prev_bind_0_$15, thread);
		}
	    } finally {
		sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
		sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
		sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
	    }
	}
	mts = mt_vars.push_core_mts_to_beginning(mts);
	return mts;
    }

    public static SubLObject mt_start_universal_time_extended(final SubLObject mt, SubLObject default_value) {
	if (default_value == UNPROVIDED) {
	    default_value = ZERO_INTEGER;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject ignore_errors_tag = NIL;
	try {
	    thread.throwStack.push($IGNORE_ERRORS_TARGET);
	    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
	    try {
		Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
		try {
		    final SubLObject time_interval = get_mt_time_interval_memoized(mt);
		    return maybe_cycl_second_to_universal_time_extended(time_interval_utilities.cycl_interval_initial_second(time_interval), default_value);
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
	return default_value;
    }

    public static SubLObject mt_end_universal_time_extended(final SubLObject mt, SubLObject default_value) {
	if (default_value == UNPROVIDED) {
	    default_value = ZERO_INTEGER;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject ignore_errors_tag = NIL;
	try {
	    thread.throwStack.push($IGNORE_ERRORS_TARGET);
	    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
	    try {
		Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
		try {
		    final SubLObject time_interval = get_mt_time_interval_memoized(mt);
		    return maybe_cycl_second_to_universal_time_extended(time_interval_utilities.cycl_interval_final_second(time_interval), default_value);
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
	return default_value;
    }

    public static SubLObject get_mt_time_interval_memoized_internal(final SubLObject mt) {
	return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), hlmt.explode_hlmt_temporal_facets_with_defaults(mt));
    }

    public static SubLObject get_mt_time_interval_memoized(final SubLObject mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return get_mt_time_interval_memoized_internal(mt);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_MT_TIME_INTERVAL_MEMOIZED, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_MT_TIME_INTERVAL_MEMOIZED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, GET_MT_TIME_INTERVAL_MEMOIZED, caching_state);
	}
	SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(thread.resetMultipleValues(), multiple_value_list(get_mt_time_interval_memoized_internal(mt)));
	    memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    public static SubLObject maybe_cycl_second_to_universal_time_extended_internal(final SubLObject second, SubLObject default_value) {
	if (default_value == UNPROVIDED) {
	    default_value = ZERO_INTEGER;
	}
	SubLObject utx = maybe_cycl_second_to_universal_time_extended_low(second, default_value);
	if (NIL == number_utilities.potentially_infinite_integer_p(utx)) {
	    utx = default_value;
	}
	return utx;
    }

    public static SubLObject maybe_cycl_second_to_universal_time_extended(final SubLObject second, SubLObject default_value) {
	if (default_value == UNPROVIDED) {
	    default_value = ZERO_INTEGER;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return maybe_cycl_second_to_universal_time_extended_internal(second, default_value);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED, caching_state);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(second, default_value);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (second.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && default_value.equal(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(maybe_cycl_second_to_universal_time_extended_internal(second, default_value)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(second, default_value));
	return memoization_state.caching_results(results3);
    }

    public static SubLObject maybe_cycl_second_to_universal_time_extended_low(final SubLObject second, SubLObject default_value) {
	if (default_value == UNPROVIDED) {
	    default_value = ZERO_INTEGER;
	}
	if (NIL == second) {
	    return default_value;
	}
	if (second.eql($$Now)) {
	    return get_universal_time();
	}
	if (NIL != date_utilities.beginning_of_timeP(second)) {
	    return number_utilities.negative_infinity();
	}
	if (NIL != date_utilities.end_of_timeP(second)) {
	    return number_utilities.positive_infinity();
	}
	if (NIL != sbhl_time_modules.starts_after_starting_ofP($list70, second, UNPROVIDED)) {
	    return minus(date_utilities.convert_time_quant_to_seconds(date_utilities.time_elapsed(second, $list70, $$SecondsDuration)));
	}
	if (NIL != date_utilities.date_p(second)) {
	    return date_utilities.cycl_date_to_universal_time(second);
	}
	return default_value;
    }

    public static final SubLObject cb_sort_args_for_display_alt(SubLObject args) {
	return Sort.sort(args, symbol_function($sym52$_), UNPROVIDED);
    }

    public static SubLObject cb_sort_args_for_display(final SubLObject args) {
	return Sort.sort(args, symbol_function($sym72$_), UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; a list of lists of HLMTS.
    Each list of hlmts contains a subset of HLMTS, each with the same monad mt.
    The top-level returned list is sorted alphabetically by monad mt.
     */
    @LispMethod(comment = "@return listp; a list of lists of HLMTS.\r\nEach list of hlmts contains a subset of HLMTS, each with the same monad mt.\r\nThe top-level returned list is sorted alphabetically by monad mt.")
    public static final SubLObject cb_group_hlmts_by_monad_mt_alt(SubLObject hlmts) {
	{
	    SubLObject groups = NIL;
	    SubLObject dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
	    {
		SubLObject cdolist_list_var = hlmts;
		SubLObject v_hlmt = NIL;
		for (v_hlmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_hlmt = cdolist_list_var.first()) {
		    {
			SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
			dictionary_utilities.dictionary_push(dict, monad_mt, v_hlmt);
		    }
		}
	    }
	    {
		SubLObject monad_mts = dictionary.dictionary_keys(dict);
		SubLObject sorted_monad_mts = cb_sort_mts_for_display(monad_mts);
		SubLObject cdolist_list_var = sorted_monad_mts;
		SubLObject monad_mt = NIL;
		for (monad_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), monad_mt = cdolist_list_var.first()) {
		    {
			SubLObject hlmt_list = dictionary.dictionary_lookup(dict, monad_mt, UNPROVIDED);
			groups = cons(hlmt_list, groups);
		    }
		}
	    }
	    return nreverse(groups);
	}
    }

    /**
     *
     *
     * @return listp; a list of lists of HLMTS.
    Each list of hlmts contains a subset of HLMTS, each with the same monad mt.
    The top-level returned list is sorted alphabetically by monad mt.
     */
    @LispMethod(comment = "@return listp; a list of lists of HLMTS.\r\nEach list of hlmts contains a subset of HLMTS, each with the same monad mt.\r\nThe top-level returned list is sorted alphabetically by monad mt.")
    public static SubLObject cb_group_hlmts_by_monad_mt(final SubLObject hlmts) {
	SubLObject groups = NIL;
	final SubLObject dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
	SubLObject cdolist_list_var = hlmts;
	SubLObject v_hlmt = NIL;
	v_hlmt = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
	    dictionary_utilities.dictionary_push(dict, monad_mt, v_hlmt);
	    cdolist_list_var = cdolist_list_var.rest();
	    v_hlmt = cdolist_list_var.first();
	}
	final SubLObject monad_mts = dictionary.dictionary_keys(dict);
	SubLObject cdolist_list_var2;
	final SubLObject sorted_monad_mts = cdolist_list_var2 = cb_sort_mts_for_display(monad_mts, UNPROVIDED);
	SubLObject monad_mt2 = NIL;
	monad_mt2 = cdolist_list_var2.first();
	while (NIL != cdolist_list_var2) {
	    final SubLObject hlmt_list = dictionary.dictionary_lookup(dict, monad_mt2, UNPROVIDED);
	    groups = cons(hlmt_list, groups);
	    cdolist_list_var2 = cdolist_list_var2.rest();
	    monad_mt2 = cdolist_list_var2.first();
	}
	return nreverse(groups);
    }

    public static final SubLObject cb_back_button_alt(SubLObject target, SubLObject value) {
	if (target == UNPROVIDED) {
	    target = $SELF;
	}
	if (value == UNPROVIDED) {
	    value = $$$Back;
	}
	if (target.eql($SELF)) {
	    return html_script_utilities.html_back_button(value);
	} else {
	    {
		SubLObject pcase_var = target;
		if (pcase_var.eql($TOP)) {
		    return html_script_utilities.html_simple_script_button(value, $cb_back_button_predefined_script$.getGlobalValue(), $$$top, UNPROVIDED);
		} else {
		    if (pcase_var.eql($PARENT)) {
			return html_script_utilities.html_simple_script_button(value, $cb_back_button_predefined_script$.getGlobalValue(), $$$parent, UNPROVIDED);
		    } else {
			{
			    SubLObject frame = cb_frame_name(target);
			    if (NIL != frame) {
				return html_script_utilities.html_simple_script_button(value, $cb_back_button_script$.getGlobalValue(), frame, UNPROVIDED);
			    }
			}
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject cb_back_button(SubLObject target, SubLObject value) {
	if (target == UNPROVIDED) {
	    target = $SELF;
	}
	if (value == UNPROVIDED) {
	    value = $$$Back;
	}
	if (target.eql($SELF)) {
	    return html_script_utilities.html_back_button(value);
	}
	final SubLObject pcase_var = target;
	if (pcase_var.eql($TOP)) {
	    return html_script_utilities.html_simple_script_button(value, $cb_back_button_predefined_script$.getGlobalValue(), $$$top, UNPROVIDED);
	}
	if (pcase_var.eql($PARENT)) {
	    return html_script_utilities.html_simple_script_button(value, $cb_back_button_predefined_script$.getGlobalValue(), $$$parent, UNPROVIDED);
	}
	final SubLObject frame = cb_frame_name(target);
	if (NIL != frame) {
	    return html_script_utilities.html_simple_script_button(value, $cb_back_button_script$.getGlobalValue(), frame, UNPROVIDED);
	}
	return NIL;
    }

    /**
     * Register FRAME-SPEC as a browser frame called NAME.
     * SRC is an optional string which is the URL of the frame.
     * SRC-FORMAT is an optional arg format string.
     * NORESIZE disables resizing of the frame when non-null.
     * SCROLLING disable scrolling in the frame when null.
     */
    @LispMethod(comment = "Register FRAME-SPEC as a browser frame called NAME.\r\nSRC is an optional string which is the URL of the frame.\r\nSRC-FORMAT is an optional arg format string.\r\nNORESIZE disables resizing of the frame when non-null.\r\nSCROLLING disable scrolling in the frame when null.\nRegister FRAME-SPEC as a browser frame called NAME.\nSRC is an optional string which is the URL of the frame.\nSRC-FORMAT is an optional arg format string.\nNORESIZE disables resizing of the frame when non-null.\nSCROLLING disable scrolling in the frame when null.")
    public static final SubLObject register_cb_frame_alt(SubLObject frame_spec, SubLObject name, SubLObject src, SubLObject src_format, SubLObject noresize, SubLObject scrolling) {
	if (src == UNPROVIDED) {
	    src = NIL;
	}
	if (src_format == UNPROVIDED) {
	    src_format = NIL;
	}
	if (noresize == UNPROVIDED) {
	    noresize = NIL;
	}
	if (scrolling == UNPROVIDED) {
	    scrolling = T;
	}
	SubLTrampolineFile.checkType(frame_spec, KEYWORDP);
	SubLTrampolineFile.checkType(name, STRINGP);
	if (NIL != src) {
	    SubLTrampolineFile.checkType(src, STRINGP);
	}
	if (NIL != src_format) {
	    SubLTrampolineFile.checkType(src_format, STRINGP);
	}
	{
	    SubLObject existing = cb_frame_info(frame_spec);
	    if (NIL == existing) {
		existing = list(frame_spec, NIL, NIL, NIL, NIL, NIL);
		$cb_frame_table$.setGlobalValue(cons(existing, $cb_frame_table$.getGlobalValue()));
	    }
	    set_nth(ONE_INTEGER, existing, name);
	    set_nth(TWO_INTEGER, existing, src);
	    set_nth(THREE_INTEGER, existing, src_format);
	    set_nth(FOUR_INTEGER, existing, list_utilities.sublisp_boolean(noresize));
	    if (NIL != scrolling) {
		set_nth(FIVE_INTEGER, existing, NIL);
	    } else {
		set_nth(FIVE_INTEGER, existing, $$$no);
	    }
	}
	return frame_spec;
    }

    /**
     * Register FRAME-SPEC as a browser frame called NAME.
     * SRC is an optional string which is the URL of the frame.
     * SRC-FORMAT is an optional arg format string.
     * NORESIZE disables resizing of the frame when non-null.
     * SCROLLING disable scrolling in the frame when null.
     */
    @LispMethod(comment = "Register FRAME-SPEC as a browser frame called NAME.\r\nSRC is an optional string which is the URL of the frame.\r\nSRC-FORMAT is an optional arg format string.\r\nNORESIZE disables resizing of the frame when non-null.\r\nSCROLLING disable scrolling in the frame when null.\nRegister FRAME-SPEC as a browser frame called NAME.\nSRC is an optional string which is the URL of the frame.\nSRC-FORMAT is an optional arg format string.\nNORESIZE disables resizing of the frame when non-null.\nSCROLLING disable scrolling in the frame when null.")
    public static SubLObject register_cb_frame(final SubLObject frame_spec, final SubLObject name, SubLObject src, SubLObject src_format, SubLObject noresize, SubLObject scrolling) {
	if (src == UNPROVIDED) {
	    src = NIL;
	}
	if (src_format == UNPROVIDED) {
	    src_format = NIL;
	}
	if (noresize == UNPROVIDED) {
	    noresize = NIL;
	}
	if (scrolling == UNPROVIDED) {
	    scrolling = T;
	}
	assert NIL != keywordp(frame_spec) : "! keywordp(frame_spec) " + ("Types.keywordp(frame_spec) " + "CommonSymbols.NIL != Types.keywordp(frame_spec) ") + frame_spec;
	assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
	if (((NIL != src) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(src))) {
	    throw new AssertionError(src);
	}
	if (((NIL != src_format) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(src_format))) {
	    throw new AssertionError(src_format);
	}
	SubLObject existing = cb_frame_info(frame_spec);
	if (NIL == existing) {
	    existing = list(frame_spec, NIL, NIL, NIL, NIL, NIL);
	    $cb_frame_table$.setGlobalValue(cons(existing, $cb_frame_table$.getGlobalValue()));
	}
	set_nth(ONE_INTEGER, existing, name);
	set_nth(TWO_INTEGER, existing, src);
	set_nth(THREE_INTEGER, existing, src_format);
	set_nth(FOUR_INTEGER, existing, list_utilities.sublisp_boolean(noresize));
	if (NIL != scrolling) {
	    set_nth(FIVE_INTEGER, existing, NIL);
	} else {
	    set_nth(FIVE_INTEGER, existing, $$$no);
	}
	return frame_spec;
    }

    /**
     * Deregister FRAME-SPEC as a browser frame.
     */
    @LispMethod(comment = "Deregister FRAME-SPEC as a browser frame.")
    public static final SubLObject deregister_cb_frame_alt(SubLObject frame_spec) {
	SubLTrampolineFile.checkType(frame_spec, KEYWORDP);
	$cb_frame_table$.setGlobalValue(delete(frame_spec, $cb_frame_table$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
	return frame_spec;
    }

    /**
     * Deregister FRAME-SPEC as a browser frame.
     */
    @LispMethod(comment = "Deregister FRAME-SPEC as a browser frame.")
    public static SubLObject deregister_cb_frame(final SubLObject frame_spec) {
	assert NIL != keywordp(frame_spec) : "! keywordp(frame_spec) " + ("Types.keywordp(frame_spec) " + "CommonSymbols.NIL != Types.keywordp(frame_spec) ") + frame_spec;
	$cb_frame_table$.setGlobalValue(delete(frame_spec, $cb_frame_table$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
	return frame_spec;
    }

    public static final SubLObject cb_frame_info_alt(SubLObject frame_spec) {
	SubLTrampolineFile.checkType(frame_spec, KEYWORDP);
	return assoc(frame_spec, $cb_frame_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_frame_info(final SubLObject frame_spec) {
	assert NIL != keywordp(frame_spec) : "! keywordp(frame_spec) " + ("Types.keywordp(frame_spec) " + "CommonSymbols.NIL != Types.keywordp(frame_spec) ") + frame_spec;
	return assoc(frame_spec, $cb_frame_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_frame_name_alt(SubLObject frame_spec) {
	if (frame_spec.isKeyword()) {
	    return second(cb_frame_info(frame_spec));
	}
	if (frame_spec.isString()) {
	    return frame_spec;
	}
	return NIL;
    }

    public static SubLObject cb_frame_name(final SubLObject frame_spec) {
	if (frame_spec.isKeyword()) {
	    return second(cb_frame_info(frame_spec));
	}
	if (frame_spec.isString()) {
	    return frame_spec;
	}
	return NIL;
    }

    public static final SubLObject cb_frame_alt(SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
	if (arg1 == UNPROVIDED) {
	    arg1 = NIL;
	}
	if (arg2 == UNPROVIDED) {
	    arg2 = NIL;
	}
	if (arg3 == UNPROVIDED) {
	    arg3 = NIL;
	}
	if (arg4 == UNPROVIDED) {
	    arg4 = NIL;
	}
	{
	    SubLObject pcase_var = type;
	    if (pcase_var.eql($MAIN)) {
		{
		    SubLObject name = cb_frame_name($MAIN);
		    SubLObject handler = (NIL != ke.cyclist_is_guest()) ? ((SubLObject) ($str_alt66$cb_login)) : $str_alt67$cb_history;
		    SubLObject new_arg_string = $str_alt68$;
		    if (arg1.isCons()) {
			{
			    SubLObject datum = arg1;
			    SubLObject current = datum;
			    SubLObject indirect_handler = NIL;
			    SubLObject indirect_args = NIL;
			    destructuring_bind_must_consp(current, datum, $list_alt69);
			    indirect_handler = current.first();
			    current = current.rest();
			    indirect_args = current;
			    if (indirect_handler.isString()) {
				{
				    SubLObject function_symbol = find_symbol(Strings.string_upcase(indirect_handler, UNPROVIDED, UNPROVIDED), UNPROVIDED);
				    if ((function_symbol.isSymbol() && (NIL != fboundp(function_symbol))) && (NIL != html_macros.html_handler_functionP(function_symbol))) {
					handler = indirect_handler;
					{
					    SubLObject cdolist_list_var = indirect_args;
					    SubLObject indirect_arg = NIL;
					    for (indirect_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), indirect_arg = cdolist_list_var.first()) {
						if (indirect_arg.isCons()) {
						    new_arg_string = cconcatenate(new_arg_string, cconcatenate($str_alt70$_, new SubLObject[] { format_nil.format_nil_a_no_copy(indirect_arg.first()), $str_alt71$_, format_nil.format_nil_a_no_copy(second(indirect_arg)) }));
						} else {
						    new_arg_string = cconcatenate(new_arg_string, cconcatenate($str_alt70$_, format_nil.format_nil_a_no_copy(indirect_arg)));
						}
					    }
					}
				    }
				}
			    }
			}
		    }
		    html_source_readability_terpri(UNPROVIDED);
		    html_markup(html_macros.$html_frame_head$.getGlobalValue());
		    html_markup(html_macros.$html_frame_name$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_markup(name);
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_markup(html_macros.$html_frame_src$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    cb_url(handler, $str_alt2$_A, new_arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_char(CHAR_greater, UNPROVIDED);
		}
	    } else {
		{
		    SubLObject simple_info = cb_frame_info(type);
		    if (NIL != simple_info) {
			{
			    SubLObject datum = simple_info;
			    SubLObject current = datum;
			    SubLObject keyword = NIL;
			    SubLObject name = NIL;
			    SubLObject handler = NIL;
			    SubLObject control_string = NIL;
			    SubLObject noresize = NIL;
			    SubLObject scrolling = NIL;
			    destructuring_bind_must_consp(current, datum, $list_alt72);
			    keyword = current.first();
			    current = current.rest();
			    destructuring_bind_must_consp(current, datum, $list_alt72);
			    name = current.first();
			    current = current.rest();
			    destructuring_bind_must_consp(current, datum, $list_alt72);
			    handler = current.first();
			    current = current.rest();
			    destructuring_bind_must_consp(current, datum, $list_alt72);
			    control_string = current.first();
			    current = current.rest();
			    destructuring_bind_must_consp(current, datum, $list_alt72);
			    noresize = current.first();
			    current = current.rest();
			    destructuring_bind_must_consp(current, datum, $list_alt72);
			    scrolling = current.first();
			    current = current.rest();
			    if (NIL == current) {
				html_source_readability_terpri(UNPROVIDED);
				html_markup(html_macros.$html_frame_head$.getGlobalValue());
				html_markup(html_macros.$html_frame_name$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(name);
				html_char(CHAR_quotation, UNPROVIDED);
				if (NIL != noresize) {
				    html_simple_attribute(html_macros.$html_frame_noresize$.getGlobalValue());
				}
				html_markup(html_macros.$html_frame_src$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				cb_url(handler, control_string, arg1, arg2, arg3, arg4);
				html_char(CHAR_quotation, UNPROVIDED);
				if (NIL != scrolling) {
				    html_markup(html_macros.$html_frame_scrolling$.getGlobalValue());
				    html_char(CHAR_quotation, UNPROVIDED);
				    html_markup(scrolling);
				    html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
			    } else {
				cdestructuring_bind_error(datum, $list_alt72);
			    }
			}
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject cb_frame(final SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
	if (arg1 == UNPROVIDED) {
	    arg1 = NIL;
	}
	if (arg2 == UNPROVIDED) {
	    arg2 = NIL;
	}
	if (arg3 == UNPROVIDED) {
	    arg3 = NIL;
	}
	if (arg4 == UNPROVIDED) {
	    arg4 = NIL;
	}
	if (type.eql($MAIN)) {
	    final SubLObject name = cb_frame_name($MAIN);
	    SubLObject handler = (NIL != ke.cyclist_is_guest()) ? $str86$cb_login : $str87$cb_history;
	    SubLObject new_arg_string = $str88$;
	    if (arg1.isCons()) {
		SubLObject current;
		final SubLObject datum = current = arg1;
		SubLObject indirect_handler = NIL;
		SubLObject indirect_args = NIL;
		destructuring_bind_must_consp(current, datum, $list89);
		indirect_handler = current.first();
		current = indirect_args = current.rest();
		if (indirect_handler.isString()) {
		    final SubLObject function_symbol = find_symbol(Strings.string_upcase(indirect_handler, UNPROVIDED, UNPROVIDED), UNPROVIDED);
		    if ((function_symbol.isSymbol() && (NIL != fboundp(function_symbol))) && (NIL != html_macros.html_handler_functionP(function_symbol))) {
			handler = indirect_handler;
			SubLObject cdolist_list_var = indirect_args;
			SubLObject indirect_arg = NIL;
			indirect_arg = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
			    if (indirect_arg.isCons()) {
				new_arg_string = cconcatenate(new_arg_string, cconcatenate($str90$_, new SubLObject[] { format_nil.format_nil_a_no_copy(indirect_arg.first()), $str91$_, format_nil.format_nil_a_no_copy(second(indirect_arg)) }));
			    } else {
				new_arg_string = cconcatenate(new_arg_string, cconcatenate($str90$_, format_nil.format_nil_a_no_copy(indirect_arg)));
			    }
			    cdolist_list_var = cdolist_list_var.rest();
			    indirect_arg = cdolist_list_var.first();
			}
		    }
		}
	    }
	    html_source_readability_terpri(UNPROVIDED);
	    html_markup(html_macros.$html_frame_head$.getGlobalValue());
	    html_markup(html_macros.$html_frame_name$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(name);
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(html_macros.$html_frame_src$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    cb_url(handler, $str5$_A, new_arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_char(CHAR_greater, UNPROVIDED);
	} else {
	    final SubLObject simple_info = cb_frame_info(type);
	    if (NIL != simple_info) {
		SubLObject current2;
		final SubLObject datum2 = current2 = simple_info;
		SubLObject keyword = NIL;
		SubLObject name2 = NIL;
		SubLObject handler2 = NIL;
		SubLObject control_string = NIL;
		SubLObject noresize = NIL;
		SubLObject scrolling = NIL;
		destructuring_bind_must_consp(current2, datum2, $list92);
		keyword = current2.first();
		current2 = current2.rest();
		destructuring_bind_must_consp(current2, datum2, $list92);
		name2 = current2.first();
		current2 = current2.rest();
		destructuring_bind_must_consp(current2, datum2, $list92);
		handler2 = current2.first();
		current2 = current2.rest();
		destructuring_bind_must_consp(current2, datum2, $list92);
		control_string = current2.first();
		current2 = current2.rest();
		destructuring_bind_must_consp(current2, datum2, $list92);
		noresize = current2.first();
		current2 = current2.rest();
		destructuring_bind_must_consp(current2, datum2, $list92);
		scrolling = current2.first();
		current2 = current2.rest();
		if (NIL == current2) {
		    html_source_readability_terpri(UNPROVIDED);
		    html_markup(html_macros.$html_frame_head$.getGlobalValue());
		    html_markup(html_macros.$html_frame_name$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_markup(name2);
		    html_char(CHAR_quotation, UNPROVIDED);
		    if (NIL != noresize) {
			html_simple_attribute(html_macros.$html_frame_noresize$.getGlobalValue());
		    }
		    html_markup(html_macros.$html_frame_src$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    cb_url(handler2, control_string, arg1, arg2, arg3, arg4);
		    html_char(CHAR_quotation, UNPROVIDED);
		    if (NIL != scrolling) {
			html_markup(html_macros.$html_frame_scrolling$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(scrolling);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		} else {
		    cdestructuring_bind_error(datum2, $list92);
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject cb_link_alt(SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
	if (arg1 == UNPROVIDED) {
	    arg1 = NIL;
	}
	if (arg2 == UNPROVIDED) {
	    arg2 = NIL;
	}
	if (arg3 == UNPROVIDED) {
	    arg3 = NIL;
	}
	if (arg4 == UNPROVIDED) {
	    arg4 = NIL;
	}
	if (arg5 == UNPROVIDED) {
	    arg5 = NIL;
	}
	{
	    SubLObject method = cb_link_method(type);
	    if (NIL != method) {
		{
		    SubLObject max_args = cb_link_max_args(type);
		    SubLObject pcase_var = max_args;
		    if (pcase_var.eql(ZERO_INTEGER)) {
			funcall(method);
		    } else {
			if (pcase_var.eql(ONE_INTEGER)) {
			    funcall(method, arg1);
			} else {
			    if (pcase_var.eql(TWO_INTEGER)) {
				funcall(method, arg1, arg2);
			    } else {
				if (pcase_var.eql(THREE_INTEGER)) {
				    funcall(method, arg1, arg2, arg3);
				} else {
				    if (pcase_var.eql(FOUR_INTEGER)) {
					funcall(method, arg1, arg2, arg3, arg4);
				    } else {
					funcall(method, arg1, arg2, arg3, arg4, arg5);
				    }
				}
			    }
			}
		    }
		}
	    } else {
		Errors.error($str_alt111$No_cb_link_method_for__S_defined, type);
	    }
	}
	return NIL;
    }

    public static SubLObject cb_link(final SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
	if (arg1 == UNPROVIDED) {
	    arg1 = NIL;
	}
	if (arg2 == UNPROVIDED) {
	    arg2 = NIL;
	}
	if (arg3 == UNPROVIDED) {
	    arg3 = NIL;
	}
	if (arg4 == UNPROVIDED) {
	    arg4 = NIL;
	}
	if (arg5 == UNPROVIDED) {
	    arg5 = NIL;
	}
	final SubLObject method = cb_link_method(type);
	if (NIL != method) {
	    final SubLObject pcase_var;
	    final SubLObject max_args = pcase_var = cb_link_max_args(type);
	    if (pcase_var.eql(ZERO_INTEGER)) {
		funcall(method);
	    } else if (pcase_var.eql(ONE_INTEGER)) {
		funcall(method, arg1);
	    } else if (pcase_var.eql(TWO_INTEGER)) {
		funcall(method, arg1, arg2);
	    } else if (pcase_var.eql(THREE_INTEGER)) {
		funcall(method, arg1, arg2, arg3);
	    } else if (pcase_var.eql(FOUR_INTEGER)) {
		funcall(method, arg1, arg2, arg3, arg4);
	    } else {
		funcall(method, arg1, arg2, arg3, arg4, arg5);
	    }

	} else {
	    Errors.error($str131$No_cb_link_method_for__S_defined, type);
	}
	return NIL;
    }

    public static final SubLObject setup_cb_link_method_alt(SubLObject type, SubLObject method_func, SubLObject max_args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(type, KEYWORDP);
	    SubLTrampolineFile.checkType(method_func, SYMBOLP);
	    SubLTrampolineFile.checkType(max_args, FIXNUMP);
	    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		if (!max_args.numLE($max_cb_link_arg_count$.getGlobalValue())) {
		    Errors.error($str_alt114$Too_many_args_in__S___max_of__S_a, method_func, max_args);
		}
	    }
	    put(type, $CB_LINK_METHOD, method_func);
	    put(type, $CB_LINK_MAX_ARGS, max_args);
	    return type;
	}
    }

    public static SubLObject setup_cb_link_method(final SubLObject type, final SubLObject method_func, final SubLObject max_args) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != keywordp(type) : "! keywordp(type) " + ("Types.keywordp(type) " + "CommonSymbols.NIL != Types.keywordp(type) ") + type;
	assert NIL != symbolp(method_func) : "! symbolp(method_func) " + ("Types.symbolp(method_func) " + "CommonSymbols.NIL != Types.symbolp(method_func) ") + method_func;
	assert NIL != fixnump(max_args) : "! fixnump(max_args) " + ("Types.fixnump(max_args) " + "CommonSymbols.NIL != Types.fixnump(max_args) ") + max_args;
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!max_args.numLE($max_cb_link_arg_count$.getGlobalValue()))) {
	    Errors.error($str134$Too_many_args_in__S___max_of__S_a, method_func, max_args);
	}
	put(type, $CB_LINK_METHOD, method_func);
	put(type, $CB_LINK_MAX_ARGS, max_args);
	return type;
    }

    public static final SubLObject cb_link_method_alt(SubLObject type) {
	return get(type, $CB_LINK_METHOD, UNPROVIDED);
    }

    public static SubLObject cb_link_method(final SubLObject type) {
	return get(type, $CB_LINK_METHOD, UNPROVIDED);
    }

    public static final SubLObject cb_link_max_args_alt(SubLObject type) {
	return get(type, $CB_LINK_MAX_ARGS, UNPROVIDED);
    }

    public static SubLObject cb_link_max_args(final SubLObject type) {
	return get(type, $CB_LINK_MAX_ARGS, UNPROVIDED);
    }

    public static final SubLObject cb_link_constant_alt(SubLObject constant, SubLObject linktext, SubLObject image_keyword) {
	if (linktext == UNPROVIDED) {
	    linktext = NIL;
	}
	if (image_keyword == UNPROVIDED) {
	    image_keyword = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == linktext) {
		linktext = constants_high.constant_name(constant);
	    }
	    {
		SubLObject handler = $cb_default_fort_handler$.getDynamicValue(thread);
		SubLObject frame = $cb_default_term_frame$.getDynamicValue(thread);
		cb_adornments.handle_adornments($FORT, frame, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		cb_adornments.handle_adornments($CONSTANT, frame, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (frame == $TOP) {
		    handler = cconcatenate($str_alt120$cb_start_, format_nil.format_nil_a_no_copy($cb_default_fort_handler$.getDynamicValue(thread)));
		}
		{
		    SubLObject frame_name_var = cb_frame_name(frame);
		    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    cyc_cgi_url_int();
		    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt121$_a__a, handler, cb_fort_identifier(constant));
		    html_char(CHAR_quotation, UNPROVIDED);
		    if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    if (NIL != image_keyword) {
				{
				    SubLObject image_src = cb_icon_file_path(image_keyword);
				    SubLObject align = $TOP;
				    SubLObject alt = (NIL != linktext) ? ((SubLObject) (linktext)) : cb_get_icon_alt_string(image_keyword);
				    SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
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
				    {
					SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
					}
				    }
				    html_markup(html_macros.$html_image_tail$.getGlobalValue());
				}
			    } else {
				if (NIL != valid_constantP(constant, UNPROVIDED)) {
				    html_princ(linktext);
				} else {
				    html_stale_constant_reference(linktext, UNPROVIDED, UNPROVIDED);
				}
			    }
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		}
	    }
	    return constant;
	}
    }

    public static SubLObject cb_link_constant(final SubLObject constant, SubLObject linktext, SubLObject image_keyword) {
	if (linktext == UNPROVIDED) {
	    linktext = NIL;
	}
	if (image_keyword == UNPROVIDED) {
	    image_keyword = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject constant_name = constants_high.constant_name(constant);
	if (NIL == linktext) {
	    linktext = constant_name;
	}
	SubLObject handler = $cb_default_fort_handler$.getDynamicValue(thread);
	final SubLObject frame = $cb_default_term_frame$.getDynamicValue(thread);
	final SubLObject html_class = $$$const;
	cb_adornments.handle_adornments($FORT, frame, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	cb_adornments.handle_adornments($CONSTANT, frame, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	if ((NIL != $cb_default_fort_link_emitter$.getDynamicValue(thread)) && (NIL != fboundp($cb_default_fort_link_emitter$.getDynamicValue(thread)))) {
	    funcall($cb_default_fort_link_emitter$.getDynamicValue(thread), constant, linktext, frame);
	    return constant;
	}
	if (frame == $TOP) {
	    handler = cconcatenate($str142$cb_start_, format_nil.format_nil_a_no_copy($cb_default_fort_handler$.getDynamicValue(thread)));
	}
	final SubLObject frame_name_var = cb_frame_name(frame);
	html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	cyc_cgi_url_int();
	format(html_macros.$html_stream$.getDynamicValue(thread), $str143$_a__a, handler, cb_fort_identifier(constant));
	html_char(CHAR_quotation, UNPROVIDED);
	if (NIL != constant_name) {
	    html_markup(html_macros.$html_anchor_title$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(constant_name);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	if (NIL != frame_name_var) {
	    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(frame_name_var);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	if (NIL != html_class) {
	    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(html_class);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	html_char(CHAR_greater, UNPROVIDED);
	final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    if (NIL != image_keyword) {
		final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(image_keyword);
		final SubLObject align = $TOP;
		final SubLObject alt = (NIL != linktext) ? linktext : cyc_file_dependencies.cb_get_icon_alt_string(image_keyword);
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
		final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
		}
		html_markup(html_macros.$html_image_tail$.getGlobalValue());
	    } else if (NIL != valid_constantP(constant, UNPROVIDED)) {
		if (NIL != fort_types_interface.obsolete_constantP(constant)) {
		    html_markup(html_macros.$html_span_head$.getGlobalValue());
		    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_markup($$$obsolete);
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_char(CHAR_greater, UNPROVIDED);
		    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			if (NIL != $cb_show_constant_hash_dollar_prefixP$.getDynamicValue(thread)) {
			    html_princ($str145$__);
			}
			html_princ(linktext);
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
		    }
		    html_markup(html_macros.$html_span_tail$.getGlobalValue());
		} else {
		    if (NIL != $cb_show_constant_hash_dollar_prefixP$.getDynamicValue(thread)) {
			html_princ($str145$__);
		    }
		    html_princ(linktext);
		}
	    } else {
		html_stale_constant_reference(linktext, UNPROVIDED, UNPROVIDED);
	    }

	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	cyc_file_dependencies.javascript($TERM_CONTEXT_MENU);
	return constant;
    }

    public static SubLObject cb_nat_span_id(final SubLObject nat, SubLObject uniquifier) {
	if (uniquifier == UNPROVIDED) {
	    uniquifier = $cb_term_id$.getDynamicValue();
	}
	return cconcatenate(format_nil.format_nil_a_no_copy(cb_naut_identifier(cycl_utilities.hl_to_el(nat))), new SubLObject[] { $str152$_, format_nil.format_nil_a_no_copy(uniquifier) });
    }

    public static final SubLObject cb_link_nart_alt(SubLObject nart, SubLObject linktext, SubLObject image_keyword) {
	if (linktext == UNPROVIDED) {
	    linktext = NIL;
	}
	if (image_keyword == UNPROVIDED) {
	    image_keyword = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == linktext) {
		linktext = $str_alt123$_;
	    }
	    {
		SubLObject handler = $cb_default_fort_handler$.getDynamicValue(thread);
		SubLObject frame = $cb_default_term_frame$.getDynamicValue(thread);
		cb_adornments.handle_adornments($FORT, frame, nart, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		cb_adornments.handle_adornments($NART, frame, nart, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (frame == $TOP) {
		    handler = cconcatenate($str_alt120$cb_start_, format_nil.format_nil_a_no_copy($cb_default_fort_handler$.getDynamicValue(thread)));
		}
		{
		    SubLObject frame_name_var = cb_frame_name(frame);
		    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    cyc_cgi_url_int();
		    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt121$_a__a, handler, cb_fort_identifier(nart));
		    html_char(CHAR_quotation, UNPROVIDED);
		    if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    if (NIL != image_keyword) {
				{
				    SubLObject image_src = cb_icon_file_path(image_keyword);
				    SubLObject align = $TOP;
				    SubLObject alt = (NIL != linktext) ? ((SubLObject) (linktext)) : cb_get_icon_alt_string(image_keyword);
				    SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
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
				    {
					SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
					}
				    }
				    html_markup(html_macros.$html_image_tail$.getGlobalValue());
				}
			    } else {
				html_princ(linktext);
			    }
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		}
	    }
	    return nart;
	}
    }

    public static SubLObject cb_link_nart(final SubLObject nart, SubLObject linktext, SubLObject image_keyword) {
	if (linktext == UNPROVIDED) {
	    linktext = NIL;
	}
	if (image_keyword == UNPROVIDED) {
	    image_keyword = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == linktext) {
	    linktext = $str153$_;
	}
	SubLObject handler = $cb_default_fort_handler$.getDynamicValue(thread);
	final SubLObject frame = $cb_default_term_frame$.getDynamicValue(thread);
	final SubLObject v_class = cconcatenate(format_nil.format_nil_a_no_copy(cb_html_parameters.$cb_html_nat_class$.getDynamicValue(thread)), format_nil.format_nil_a_no_copy(cb_nat_span_id(nart, UNPROVIDED)));
	cb_adornments.handle_adornments($FORT, frame, nart, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	cb_adornments.handle_adornments($NART, frame, nart, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	if (frame == $TOP) {
	    handler = cconcatenate($str142$cb_start_, format_nil.format_nil_a_no_copy($cb_default_fort_handler$.getDynamicValue(thread)));
	}
	final SubLObject frame_name_var = cb_frame_name(frame);
	html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	cyc_cgi_url_int();
	format(html_macros.$html_stream$.getDynamicValue(thread), $str143$_a__a, handler, cb_fort_identifier(nart));
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup(html_macros.$html_anchor_title$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup($str88$);
	html_char(CHAR_quotation, UNPROVIDED);
	if (NIL != frame_name_var) {
	    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(frame_name_var);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	if (NIL != v_class) {
	    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(v_class);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	html_char(CHAR_greater, UNPROVIDED);
	final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    if (NIL != image_keyword) {
		html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(image_keyword);
		final SubLObject align = $$$absmiddle;
		final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(image_keyword);
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
		final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
		}
		html_markup(html_macros.$html_image_tail$.getGlobalValue());
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($$$cycl);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    html_princ(linktext);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
	    } else {
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($$$cycl);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    html_princ(linktext);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
	    }
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	cyc_file_dependencies.javascript($TERM_CONTEXT_MENU);
	return nart;
    }

    /**
     * obsolete
     */
    @LispMethod(comment = "obsolete")
    public static final SubLObject cb_link_nat_alt(SubLObject nart, SubLObject linktext) {
	if (linktext == UNPROVIDED) {
	    linktext = NIL;
	}
	return cb_link($NART, nart, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * obsolete
     */
    @LispMethod(comment = "obsolete")
    public static SubLObject cb_link_nat(final SubLObject nart, SubLObject linktext) {
	if (linktext == UNPROVIDED) {
	    linktext = NIL;
	}
	return cb_link($NART, nart, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_link_naut_alt(SubLObject naut, SubLObject linktext, SubLObject image_keyword) {
	if (linktext == UNPROVIDED) {
	    linktext = NIL;
	}
	if (image_keyword == UNPROVIDED) {
	    image_keyword = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == linktext) {
		linktext = $str_alt123$_;
	    }
	    {
		SubLObject handler = $cb_default_naut_handler$.getDynamicValue(thread);
		SubLObject frame = $cb_default_term_frame$.getDynamicValue(thread);
		cb_adornments.handle_adornments($NAUT, frame, naut, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (frame == $TOP) {
		    handler = cconcatenate($str_alt120$cb_start_, format_nil.format_nil_a_no_copy($cb_default_naut_handler$.getDynamicValue(thread)));
		}
		{
		    SubLObject frame_name_var = cb_frame_name(frame);
		    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    cyc_cgi_url_int();
		    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt121$_a__a, handler, cb_naut_identifier(naut));
		    html_char(CHAR_quotation, UNPROVIDED);
		    if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    if (NIL != image_keyword) {
				{
				    SubLObject image_src = cb_icon_file_path(image_keyword);
				    SubLObject align = $TOP;
				    SubLObject alt = (NIL != linktext) ? ((SubLObject) (linktext)) : cb_get_icon_alt_string(image_keyword);
				    SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
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
				    {
					SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
					}
				    }
				    html_markup(html_macros.$html_image_tail$.getGlobalValue());
				}
			    } else {
				html_princ(linktext);
			    }
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		}
	    }
	    return naut;
	}
    }

    public static SubLObject cb_link_naut(final SubLObject naut, SubLObject linktext, SubLObject image_keyword) {
	if (linktext == UNPROVIDED) {
	    linktext = NIL;
	}
	if (image_keyword == UNPROVIDED) {
	    image_keyword = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == linktext) {
	    linktext = $str153$_;
	}
	SubLObject handler = $cb_default_naut_handler$.getDynamicValue(thread);
	final SubLObject frame = $cb_default_term_frame$.getDynamicValue(thread);
	final SubLObject v_class = cconcatenate(format_nil.format_nil_a_no_copy(cb_html_parameters.$cb_html_nat_class$.getDynamicValue(thread)), format_nil.format_nil_a_no_copy(cb_nat_span_id(naut, UNPROVIDED)));
	cb_adornments.handle_adornments($NAUT, frame, naut, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	if (frame == $TOP) {
	    handler = cconcatenate($str142$cb_start_, format_nil.format_nil_a_no_copy($cb_default_naut_handler$.getDynamicValue(thread)));
	}
	final SubLObject frame_name_var = cb_frame_name(frame);
	html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	cyc_cgi_url_int();
	format(html_macros.$html_stream$.getDynamicValue(thread), $str143$_a__a, handler, cb_naut_identifier(naut));
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup(html_macros.$html_anchor_title$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup($str88$);
	html_char(CHAR_quotation, UNPROVIDED);
	if (NIL != frame_name_var) {
	    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(frame_name_var);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	if (NIL != v_class) {
	    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(v_class);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	html_char(CHAR_greater, UNPROVIDED);
	final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    if (NIL != image_keyword) {
		html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(image_keyword);
		final SubLObject align = $$$absmiddle;
		final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(image_keyword);
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
		final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
		}
		html_markup(html_macros.$html_image_tail$.getGlobalValue());
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($$$cycl);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    html_markup(linktext);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
	    } else {
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup($$$cycl);
		html_char(CHAR_quotation, UNPROVIDED);
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    html_markup(linktext);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
	    }
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	return naut;
    }

    public static SubLObject cb_naut_href(final SubLObject naut) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject html = NIL;
	SubLObject stream = NIL;
	try {
	    stream = make_private_string_output_stream();
	    final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
	    try {
		html_macros.$html_stream$.bind(stream, thread);
		cb_link_naut(naut, UNPROVIDED, UNPROVIDED);
	    } finally {
		html_macros.$html_stream$.rebind(_prev_bind_0, thread);
	    }
	    html = get_output_stream_string(stream);
	} finally {
	    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values = getValuesAsVector();
		close(stream, UNPROVIDED);
		restoreValuesFromVector(_values);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
	    }
	}
	final SubLObject start = number_utilities.f_1X(position(CHAR_quotation, html, symbol_function(EQL), symbol_function(IDENTITY), search($$$href, html, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED));
	final SubLObject end = position(CHAR_quotation, html, symbol_function(EQL), symbol_function(IDENTITY), start, UNPROVIDED);
	return string_utilities.substring(html, start, end);
    }

    public static final SubLObject cb_link_lexicon_alt(SubLObject constant) {
	{
	    SubLObject linktext = pph_main.generate_phrase(constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    return cb_link($CONSTANT, constant, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}
    }

    public static SubLObject cb_link_lexicon(final SubLObject constant) {
	final SubLObject linktext = pph_main.generate_phrase(constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	return cb_link($CONSTANT, constant, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_link_unnamed_alt(SubLObject nart) {
	{
	    SubLObject id = nart_handles.nart_id(nart);
	    if (!id.isInteger()) {
		return html_princ($str_alt133$_NART_);
	    }
	    {
		SubLObject linktext = cconcatenate($str_alt134$_NART_, new SubLObject[] { format_nil.format_nil_s_no_copy(id), $str_alt135$_ });
		return cb_link($NART, nart, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	}
    }

    public static SubLObject cb_link_unnamed(final SubLObject nart) {
	final SubLObject id = nart_handles.nart_id(nart);
	if (!id.isInteger()) {
	    return html_princ($str164$_NART_);
	}
	final SubLObject linktext = cconcatenate($str165$_NART_, new SubLObject[] { format_nil.format_nil_s_no_copy(id), $str166$_ });
	return cb_link($NART, nart, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_link_assertion_alt(SubLObject assertion) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $cb_assertion_link_hook$.getDynamicValue(thread)) {
		funcall($cb_assertion_link_hook$.getDynamicValue(thread), assertion);
	    }
	    {
		SubLObject handler = $str_alt138$cb_af;
		SubLObject frame = $cb_default_assertion_frame$.getDynamicValue(thread);
		SubLObject tooltip_text = NIL;
		if (frame == $TOP) {
		    handler = $str_alt139$cb_start_cb_af;
		}
		if (NIL != $cb_more_assertion_marker_image_text$.getDynamicValue(thread)) {
		    tooltip_text = html_assertion_marker_tooltip_text(assertion);
		}
		cb_link_method_assertion_internal(assertion, handler, frame, tooltip_text);
	    }
	    return assertion;
	}
    }

    public static SubLObject cb_link_assertion(final SubLObject assertion) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $cb_assertion_link_hook$.getDynamicValue(thread)) {
	    funcall($cb_assertion_link_hook$.getDynamicValue(thread), assertion);
	}
	SubLObject handler = $str169$cb_af;
	final SubLObject frame = $cb_default_assertion_frame$.getDynamicValue(thread);
	SubLObject tooltip_text = NIL;
	if (frame == $TOP) {
	    handler = $str170$cb_start_cb_af;
	}
	if (NIL != $cb_more_assertion_marker_image_text$.getDynamicValue(thread)) {
	    tooltip_text = html_assertion_marker_tooltip_text(assertion);
	}
	cb_link_method_assertion_internal(assertion, handler, frame, tooltip_text);
	return assertion;
    }

    public static final SubLObject cb_link_method_assertion_internal_alt(SubLObject assertion, SubLObject handler, SubLObject frame, SubLObject tooltip_text) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject frame_name_var = cb_frame_name(frame);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt121$_a__a, handler, assertion_handles.assertion_id(assertion));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != tooltip_text) {
		    html_markup(html_macros.$html_anchor_title$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_markup(tooltip_text);
		    html_char(CHAR_quotation, UNPROVIDED);
		}
		if (NIL != frame_name_var) {
		    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_markup(frame_name_var);
		    html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_assertion_marker(assertion, UNPROVIDED);
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	    }
	    cb_adornments.handle_adornments($ASSERTION, frame, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    return NIL;
	}
    }

    public static SubLObject cb_link_method_assertion_internal(final SubLObject assertion, final SubLObject handler, final SubLObject frame, final SubLObject tooltip_text) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject assertion_id = assertion_handles.assertion_id(assertion);
	final SubLObject editability = ((NIL != assertions_high.asserted_assertionP(assertion)) && (NIL != cb_assertion_editor.assertion_modification_permittedP(assertion))) ? cb_html_parameters.$cb_html_edit_class$.getDynamicValue(thread)
		: NIL != cb_assertion_editor.assertion_modification_permittedP(assertion) ? cb_html_parameters.$cb_html_no_edit_class$.getDynamicValue(thread) : cb_html_parameters.$cb_html_no_modification_class$.getDynamicValue(thread);
	final SubLObject rule_class = (NIL != assertions_high.rule_assertionP(assertion)) ? cb_html_parameters.$cb_html_rule_class$.getDynamicValue(thread) : $str88$;
	final SubLObject v_class = cconcatenate(cb_html_parameters.$cb_html_assert_class$.getDynamicValue(thread), new SubLObject[] { editability, rule_class });
	final SubLObject clean_tooltip = (NIL != tooltip_text) ? html_escape(tooltip_text, T) : NIL;
	final SubLObject elt_id = (NIL != html_macros.next_html_id_definedP(UNPROVIDED)) ? html_macros.next_html_id(UNPROVIDED) : $str88$;
	final SubLObject frame_name_var = cb_frame_name(frame);
	html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	cyc_cgi_url_int();
	format(html_macros.$html_stream$.getDynamicValue(thread), $str143$_a__a, handler, assertion_id);
	html_char(CHAR_quotation, UNPROVIDED);
	if (NIL != clean_tooltip) {
	    html_markup(html_macros.$html_anchor_title$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(clean_tooltip);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	if (NIL != frame_name_var) {
	    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(frame_name_var);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	if (NIL != v_class) {
	    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(v_class);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	html_markup($str173$_cycid_);
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup(assertion_id);
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup($str174$_id_);
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup(elt_id);
	html_char(CHAR_quotation, UNPROVIDED);
	html_char(CHAR_greater, UNPROVIDED);
	final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    html_assertion_marker(assertion, UNPROVIDED);
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	cb_adornments.handle_adornments($ASSERTION, frame, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	return NIL;
    }

    public static final SubLObject cb_assertion_utility_color_alt(SubLObject assertion) {
	if (NIL != rule_assertionP(assertion)) {
	    {
		SubLObject utility = inference_analysis.transformation_rule_historical_utility(assertion);
		if (utility.numLE($int$_30)) {
		    return html_saturated_red_color(minus(utility), $int$100);
		} else {
		    if (utility.numGE($int$30)) {
			return html_saturated_green_color(utility, $int$100);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject cb_assertion_utility_color(final SubLObject assertion) {
	if (NIL != assertions_high.rule_assertionP(assertion)) {
	    final SubLObject utility = inference_analysis.transformation_rule_historical_utility(assertion);
	    if (utility.numLE($int$_30)) {
		return html_saturated_red_color(minus(utility), $int$100);
	    }
	    if (utility.numGE($int$30)) {
		return html_saturated_green_color(utility, $int$100);
	    }
	}
	return NIL;
    }

    public static final SubLObject clear_html_saturated_red_color_alt() {
	{
	    SubLObject cs = $html_saturated_red_color_caching_state$.getGlobalValue();
	    if (NIL != cs) {
		memoization_state.caching_state_clear(cs);
	    }
	}
	return NIL;
    }

    public static SubLObject clear_html_saturated_red_color() {
	final SubLObject cs = $html_saturated_red_color_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static final SubLObject remove_html_saturated_red_color_alt(SubLObject value, SubLObject max) {
	if (max == UNPROVIDED) {
	    max = $int$256;
	}
	return memoization_state.caching_state_remove_function_results_with_args($html_saturated_red_color_caching_state$.getGlobalValue(), list(value, max), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_html_saturated_red_color(final SubLObject value, SubLObject max) {
	if (max == UNPROVIDED) {
	    max = $int$256;
	}
	return memoization_state.caching_state_remove_function_results_with_args($html_saturated_red_color_caching_state$.getGlobalValue(), list(value, max), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject html_saturated_red_color_internal_alt(SubLObject value, SubLObject max) {
	{
	    SubLObject red_level = min($int$255, integerDivide(multiply($int$256, value), max));
	    SubLObject color = format(NIL, $str_alt147$_C_C0000, hex_char(integerDivide(red_level, SIXTEEN_INTEGER)), hex_char(mod(red_level, SIXTEEN_INTEGER)));
	    return color;
	}
    }

    public static SubLObject html_saturated_red_color_internal(final SubLObject value, final SubLObject max) {
	final SubLObject red_level = min($int$255, integerDivide(multiply($int$256, value), max));
	final SubLObject color = format(NIL, $str180$_C_C0000, string_utilities.hex_char(integerDivide(red_level, SIXTEEN_INTEGER)), string_utilities.hex_char(mod(red_level, SIXTEEN_INTEGER)));
	return color;
    }

    public static final SubLObject html_saturated_red_color_alt(SubLObject value, SubLObject max) {
	if (max == UNPROVIDED) {
	    max = $int$256;
	}
	{
	    SubLObject caching_state = $html_saturated_red_color_caching_state$.getGlobalValue();
	    if (NIL == caching_state) {
		caching_state = memoization_state.create_global_caching_state_for_name(HTML_SATURATED_RED_COLOR, $html_saturated_red_color_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
	    }
	    {
		SubLObject sxhash = memoization_state.sxhash_calc_2(value, max);
		SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (collisions != $kw34$_MEMOIZED_ITEM_NOT_FOUND_) {
		    {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
			    {
				SubLObject cached_args = collision.first();
				SubLObject results2 = second(collision);
				if (value.equal(cached_args.first())) {
				    cached_args = cached_args.rest();
				    if (((NIL != cached_args) && (NIL == cached_args.rest())) && max.equal(cached_args.first())) {
					return memoization_state.caching_results(results2);
				    }
				}
			    }
			}
		    }
		}
		{
		    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(html_saturated_red_color_internal(value, max)));
		    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(value, max));
		    return memoization_state.caching_results(results);
		}
	    }
	}
    }

    public static SubLObject html_saturated_red_color(final SubLObject value, SubLObject max) {
	if (max == UNPROVIDED) {
	    max = $int$256;
	}
	SubLObject caching_state = $html_saturated_red_color_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name(HTML_SATURATED_RED_COLOR, $html_saturated_red_color_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(value, max);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (value.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && max.equal(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(html_saturated_red_color_internal(value, max)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(value, max));
	return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_html_saturated_green_color_alt() {
	{
	    SubLObject cs = $html_saturated_green_color_caching_state$.getGlobalValue();
	    if (NIL != cs) {
		memoization_state.caching_state_clear(cs);
	    }
	}
	return NIL;
    }

    public static SubLObject clear_html_saturated_green_color() {
	final SubLObject cs = $html_saturated_green_color_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static final SubLObject remove_html_saturated_green_color_alt(SubLObject value, SubLObject max) {
	if (max == UNPROVIDED) {
	    max = $int$256;
	}
	return memoization_state.caching_state_remove_function_results_with_args($html_saturated_green_color_caching_state$.getGlobalValue(), list(value, max), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_html_saturated_green_color(final SubLObject value, SubLObject max) {
	if (max == UNPROVIDED) {
	    max = $int$256;
	}
	return memoization_state.caching_state_remove_function_results_with_args($html_saturated_green_color_caching_state$.getGlobalValue(), list(value, max), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject html_saturated_green_color_internal_alt(SubLObject value, SubLObject max) {
	{
	    SubLObject green_level = min($int$255, integerDivide(multiply($int$256, value), max));
	    SubLObject color = format(NIL, $str_alt150$00_C_C00, hex_char(integerDivide(green_level, SIXTEEN_INTEGER)), hex_char(mod(green_level, SIXTEEN_INTEGER)));
	    return color;
	}
    }

    public static SubLObject html_saturated_green_color_internal(final SubLObject value, final SubLObject max) {
	final SubLObject green_level = min($int$255, integerDivide(multiply($int$256, value), max));
	final SubLObject color = format(NIL, $str183$00_C_C00, string_utilities.hex_char(integerDivide(green_level, SIXTEEN_INTEGER)), string_utilities.hex_char(mod(green_level, SIXTEEN_INTEGER)));
	return color;
    }

    public static final SubLObject html_saturated_green_color_alt(SubLObject value, SubLObject max) {
	if (max == UNPROVIDED) {
	    max = $int$256;
	}
	{
	    SubLObject caching_state = $html_saturated_green_color_caching_state$.getGlobalValue();
	    if (NIL == caching_state) {
		caching_state = memoization_state.create_global_caching_state_for_name(HTML_SATURATED_GREEN_COLOR, $html_saturated_green_color_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
	    }
	    {
		SubLObject sxhash = memoization_state.sxhash_calc_2(value, max);
		SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (collisions != $kw34$_MEMOIZED_ITEM_NOT_FOUND_) {
		    {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
			    {
				SubLObject cached_args = collision.first();
				SubLObject results2 = second(collision);
				if (value.equal(cached_args.first())) {
				    cached_args = cached_args.rest();
				    if (((NIL != cached_args) && (NIL == cached_args.rest())) && max.equal(cached_args.first())) {
					return memoization_state.caching_results(results2);
				    }
				}
			    }
			}
		    }
		}
		{
		    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(html_saturated_green_color_internal(value, max)));
		    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(value, max));
		    return memoization_state.caching_results(results);
		}
	    }
	}
    }

    public static SubLObject html_saturated_green_color(final SubLObject value, SubLObject max) {
	if (max == UNPROVIDED) {
	    max = $int$256;
	}
	SubLObject caching_state = $html_saturated_green_color_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name(HTML_SATURATED_GREEN_COLOR, $html_saturated_green_color_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
	}
	final SubLObject sxhash = memoization_state.sxhash_calc_2(value, max);
	final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
	if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    SubLObject cdolist_list_var = collisions;
	    SubLObject collision = NIL;
	    collision = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject cached_args = collision.first();
		final SubLObject results2 = second(collision);
		if (value.equal(cached_args.first())) {
		    cached_args = cached_args.rest();
		    if (((NIL != cached_args) && (NIL == cached_args.rest())) && max.equal(cached_args.first())) {
			return memoization_state.caching_results(results2);
		    }
		}
		cdolist_list_var = cdolist_list_var.rest();
		collision = cdolist_list_var.first();
	    }
	}
	final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(html_saturated_green_color_internal(value, max)));
	memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(value, max));
	return memoization_state.caching_results(results3);
    }

    /**
     * Print out only the ball image and link it to the assertion page.
     */
    @LispMethod(comment = "Print out only the ball image and link it to the assertion page.")
    public static final SubLObject cb_assertion_ball_alt(SubLObject assertion, SubLObject align) {
	if (align == UNPROVIDED) {
	    align = $TOP;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $cb_assertion_link_hook$.getDynamicValue(thread)) {
		funcall($cb_assertion_link_hook$.getDynamicValue(thread), assertion);
	    }
	    {
		SubLObject handler = $str_alt138$cb_af;
		SubLObject frame = $cb_default_assertion_frame$.getDynamicValue(thread);
		SubLObject tooltip_text = NIL;
		if (frame == $TOP) {
		    handler = $str_alt139$cb_start_cb_af;
		}
		if (NIL != $cb_more_assertion_marker_image_text$.getDynamicValue(thread)) {
		    tooltip_text = html_assertion_marker_tooltip_text(assertion);
		}
		{
		    SubLObject frame_name_var = cb_frame_name(frame);
		    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    cyc_cgi_url_int();
		    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt121$_a__a, handler, assertion_handles.assertion_id(assertion));
		    html_char(CHAR_quotation, UNPROVIDED);
		    if (NIL != tooltip_text) {
			html_markup(html_macros.$html_anchor_title$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(tooltip_text);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_assertion_marker(assertion, align);
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		}
	    }
	    return assertion;
	}
    }

    /**
     * Print out only the ball image and link it to the assertion page.
     */
    @LispMethod(comment = "Print out only the ball image and link it to the assertion page.")
    public static SubLObject cb_assertion_ball(final SubLObject assertion, SubLObject align) {
	if (align == UNPROVIDED) {
	    align = $TOP;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $cb_assertion_link_hook$.getDynamicValue(thread)) {
	    funcall($cb_assertion_link_hook$.getDynamicValue(thread), assertion);
	}
	SubLObject handler = $str169$cb_af;
	final SubLObject frame = $cb_default_assertion_frame$.getDynamicValue(thread);
	SubLObject tooltip_text = NIL;
	if (frame == $TOP) {
	    handler = $str170$cb_start_cb_af;
	}
	if (NIL != $cb_more_assertion_marker_image_text$.getDynamicValue(thread)) {
	    tooltip_text = html_assertion_marker_tooltip_text(assertion);
	}
	final SubLObject frame_name_var = cb_frame_name(frame);
	html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	cyc_cgi_url_int();
	format(html_macros.$html_stream$.getDynamicValue(thread), $str143$_a__a, handler, assertion_handles.assertion_id(assertion));
	html_char(CHAR_quotation, UNPROVIDED);
	if (NIL != tooltip_text) {
	    html_markup(html_macros.$html_anchor_title$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(tooltip_text);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
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
	    html_assertion_marker(assertion, align);
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	return assertion;
    }

    public static final SubLObject assertion_marker_alt(SubLObject assertion) {
	{
	    SubLObject marker_type = NIL;
	    if (NIL != code_assertionP(assertion)) {
		marker_type = $CODE;
	    } else {
		if (NIL != rule_assertionP(assertion)) {
		    if (NIL != forward_assertionP(assertion)) {
			marker_type = $FORWARD;
		    } else {
			marker_type = $BACKWARD;
		    }
		} else {
		    if (NIL != assertion_has_truth(assertion, $FALSE)) {
			marker_type = $FALSE;
		    } else {
			if ($UNKNOWN == assertion_truth(assertion)) {
			    marker_type = $UNKNOWN;
			} else {
			    if (NIL == asserted_assertionP(assertion)) {
				marker_type = $DERIVED;
			    } else {
				if (NIL == list_utilities.singletonP(assertion_arguments(assertion))) {
				    marker_type = $REDUNDANT;
				} else {
				    if (assertion_strength(assertion) == $MONOTONIC) {
					marker_type = $MONOTONIC;
				    } else {
					marker_type = $DEFAULT;
				    }
				}
			    }
			}
		    }
		}
	    }
	    return marker_type;
	}
    }

    public static SubLObject assertion_marker(final SubLObject assertion) {
	SubLObject marker_type = NIL;
	if (NIL != assertions_high.code_assertionP(assertion)) {
	    marker_type = $CODE;
	} else if (NIL != assertions_high.rule_assertionP(assertion)) {
	    if (NIL != assertions_high.forward_assertionP(assertion)) {
		marker_type = $FORWARD;
	    } else {
		marker_type = $BACKWARD;
	    }
	} else if (NIL != assertions_high.backward_assertionP(assertion)) {
	    marker_type = $BACKWARD_GAF;
	} else if (NIL != assertions_high.assertion_has_truth(assertion, $FALSE)) {
	    marker_type = $FALSE;
	} else if ($UNKNOWN == assertions_high.assertion_truth(assertion)) {
	    marker_type = $UNKNOWN;
	} else if (NIL == assertions_high.asserted_assertionP(assertion)) {
	    marker_type = $DERIVED;
	} else if (NIL == list_utilities.singletonP(assertions_high.assertion_arguments(assertion))) {
	    marker_type = $REDUNDANT;
	} else if (assertions_high.assertion_strength(assertion) == $MONOTONIC) {
	    marker_type = $MONOTONIC;
	} else {
	    marker_type = $DEFAULT;
	}

	return marker_type;
    }

    public static final SubLObject html_assertion_marker_alt(SubLObject assertion, SubLObject align) {
	if (align == UNPROVIDED) {
	    align = $TOP;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject marker_type = assertion_marker(assertion);
		if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
		    {
			SubLObject image_src = cb_icon_file_path(marker_type);
			SubLObject align_10 = (NIL != align) ? ((SubLObject) (align)) : $TOP;
			SubLObject alt = (true) ? ((SubLObject) ($str_alt68$)) : cb_get_icon_alt_string(marker_type);
			SubLObject border = ZERO_INTEGER;
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
			if (NIL != align_10) {
			    html_markup(html_macros.$html_image_align$.getGlobalValue());
			    html_char(CHAR_quotation, UNPROVIDED);
			    html_markup(html_align(align_10));
			    html_char(CHAR_quotation, UNPROVIDED);
			}
			if (NIL != border) {
			    html_markup(html_macros.$html_image_border$.getGlobalValue());
			    html_char(CHAR_quotation, UNPROVIDED);
			    html_markup(border);
			    html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			    }
			}
			html_markup(html_macros.$html_image_tail$.getGlobalValue());
		    }
		} else {
		    {
			SubLObject image_src = cb_icon_file_path(marker_type);
			SubLObject align_11 = (NIL != align) ? ((SubLObject) (align)) : $TOP;
			SubLObject alt = cb_get_icon_alt_string(marker_type);
			SubLObject border = ZERO_INTEGER;
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
			if (NIL != align_11) {
			    html_markup(html_macros.$html_image_align$.getGlobalValue());
			    html_char(CHAR_quotation, UNPROVIDED);
			    html_markup(html_align(align_11));
			    html_char(CHAR_quotation, UNPROVIDED);
			}
			if (NIL != border) {
			    html_markup(html_macros.$html_image_border$.getGlobalValue());
			    html_char(CHAR_quotation, UNPROVIDED);
			    html_markup(border);
			    html_char(CHAR_quotation, UNPROVIDED);
			}
			html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			    }
			}
			html_markup(html_macros.$html_image_tail$.getGlobalValue());
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject html_assertion_marker(final SubLObject assertion, SubLObject align) {
	if (align == UNPROVIDED) {
	    align = $TOP;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject marker_type = assertion_marker(assertion);
	if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
	    final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(marker_type);
	    final SubLObject align_$25 = (NIL != align) ? align : $TOP;
	    final SubLObject alt = $str88$;
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
	    if (NIL != align_$25) {
		html_markup(html_macros.$html_image_align$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_align(align_$25));
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
	    final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(marker_type);
	    final SubLObject align_$26 = (NIL != align) ? align : $TOP;
	    final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(marker_type);
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
	    if (NIL != align_$26) {
		html_markup(html_macros.$html_image_align$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_align(align_$26));
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
	return NIL;
    }

    public static final SubLObject html_assertion_marker_tooltip_text_alt(SubLObject assertion) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject cyclist = asserted_by(assertion);
		SubLObject date = asserted_when(assertion);
		SubLObject purpose = asserted_why(assertion);
		SubLObject second = asserted_second(assertion);
		SubLObject assertedP = asserted_assertionP(assertion);
		SubLObject ruleP = rule_assertionP(assertion);
		SubLObject forwardP = forward_assertionP(assertion);
		SubLObject monotonicP = eq(assertion_strength(assertion), $MONOTONIC);
		SubLObject tooltip_text_list = NIL;
		if (NIL != monotonicP) {
		    tooltip_text_list = cons($str_alt172$_monotonic, tooltip_text_list);
		}
		if (NIL != forwardP) {
		    tooltip_text_list = cons($str_alt173$_forward, tooltip_text_list);
		} else {
		    tooltip_text_list = cons($str_alt174$_backward, tooltip_text_list);
		}
		if (NIL != ruleP) {
		    tooltip_text_list = cons($str_alt175$_rule, tooltip_text_list);
		} else {
		    tooltip_text_list = cons($str_alt176$_GAF, tooltip_text_list);
		}
		if (NIL != assertedP) {
		    tooltip_text_list = cons($str_alt177$_asserted_locally, tooltip_text_list);
		    if (NIL != forts.valid_fortP(cyclist)) {
			tooltip_text_list = cons($str_alt178$_by_, tooltip_text_list);
			tooltip_text_list = cons(NIL != kb_control_vars.lexicon_kb_loaded_p() ? ((SubLObject) (pph_main.generate_phrase(cyclist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : constants_high.constant_name(cyclist), tooltip_text_list);
			if (NIL != date) {
			    tooltip_text_list = cons($str_alt179$_on_, tooltip_text_list);
			    thread.resetMultipleValues();
			    {
				SubLObject day = numeric_date_utilities.decode_universal_date(date);
				SubLObject month = thread.secondMultipleValue();
				SubLObject year = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				month = numeric_date_utilities.abbreviation_for_month_number(month);
				tooltip_text_list = cons(cconcatenate(format_nil.format_nil_a_no_copy(month), new SubLObject[] { $str_alt180$_, format_nil.format_nil_a_no_copy(day), $str_alt181$__, format_nil.format_nil_a_no_copy(year) }), tooltip_text_list);
			    }
			}
			if (NIL != second) {
			    tooltip_text_list = cons($str_alt182$_at_, tooltip_text_list);
			    tooltip_text_list = cons(numeric_date_utilities.secondstring(second), tooltip_text_list);
			}
			if (NIL != forts.valid_fortP(purpose)) {
			    tooltip_text_list = cons($str_alt183$_for_, tooltip_text_list);
			    tooltip_text_list = cons(constants_high.constant_name(purpose), tooltip_text_list);
			}
			if (NIL != deduced_assertionP(assertion)) {
			    tooltip_text_list = cons($str_alt184$_and_inferred_by_Cyc, tooltip_text_list);
			}
		    }
		} else {
		    tooltip_text_list = cons($str_alt185$_inferred_by_Cyc, tooltip_text_list);
		}
		return upcase_leading(trim_whitespace(apply(symbol_function(CCONCATENATE), nreverse(tooltip_text_list))));
	    }
	}
    }

    public static SubLObject html_assertion_marker_tooltip_text(final SubLObject assertion) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject cyclist = assertions_high.asserted_by(assertion);
	final SubLObject date = assertions_high.asserted_when(assertion);
	final SubLObject purpose = assertions_high.asserted_why(assertion);
	final SubLObject second = assertions_high.asserted_second(assertion);
	final SubLObject assertedP = assertions_high.asserted_assertionP(assertion);
	final SubLObject mt = assertions_high.assertion_mt(assertion);
	final SubLObject ruleP = assertions_high.rule_assertionP(assertion);
	final SubLObject forwardP = assertions_high.forward_assertionP(assertion);
	final SubLObject monotonicP = eq(assertions_high.assertion_strength(assertion), $MONOTONIC);
	SubLObject tooltip_text_list = NIL;
	if (NIL != monotonicP) {
	    tooltip_text_list = cons($$$_monotonic, tooltip_text_list);
	}
	if (NIL != forwardP) {
	    tooltip_text_list = cons($$$_forward, tooltip_text_list);
	} else {
	    tooltip_text_list = cons($$$_backward, tooltip_text_list);
	}
	if (NIL != ruleP) {
	    tooltip_text_list = cons($$$_rule, tooltip_text_list);
	} else {
	    tooltip_text_list = cons($$$_GAF, tooltip_text_list);
	}
	if (NIL != assertedP) {
	    tooltip_text_list = cons($$$_asserted_locally_in_, tooltip_text_list);
	    tooltip_text_list = cons(cb_term_display_string(mt), tooltip_text_list);
	    if (NIL != forts.valid_fortP(cyclist)) {
		tooltip_text_list = cons($$$_by_, tooltip_text_list);
		tooltip_text_list = cons(NIL != kb_control_vars.lexicon_kb_loaded_p() ? generate_phrase_for_cyclist(cyclist) : constants_high.constant_name(cyclist), tooltip_text_list);
		if (NIL != date) {
		    tooltip_text_list = cons($$$_on_, tooltip_text_list);
		    thread.resetMultipleValues();
		    final SubLObject day = numeric_date_utilities.decode_universal_date(date);
		    SubLObject month = thread.secondMultipleValue();
		    final SubLObject year = thread.thirdMultipleValue();
		    thread.resetMultipleValues();
		    month = numeric_date_utilities.abbreviation_for_month_number(month);
		    tooltip_text_list = cons(cconcatenate(format_nil.format_nil_a_no_copy(month), new SubLObject[] { $$$_, format_nil.format_nil_a_no_copy(day), $str217$__, format_nil.format_nil_a_no_copy(year) }), tooltip_text_list);
		}
		if (NIL != second) {
		    tooltip_text_list = cons($$$_at_, tooltip_text_list);
		    tooltip_text_list = cons(numeric_date_utilities.secondstring(second), tooltip_text_list);
		}
		if (NIL != forts.valid_fortP(purpose)) {
		    tooltip_text_list = cons($$$_for_, tooltip_text_list);
		    tooltip_text_list = cons(constants_high.constant_name(purpose), tooltip_text_list);
		}
		if (NIL != assertions_high.deduced_assertionP(assertion)) {
		    tooltip_text_list = cons($$$_and_inferred_by_Cyc, tooltip_text_list);
		}
	    }
	} else {
	    tooltip_text_list = cons($$$_inferred_in_, tooltip_text_list);
	    tooltip_text_list = cons(cb_term_display_string(mt), tooltip_text_list);
	}
	return string_utilities.upcase_leading(string_utilities.trim_whitespace(apply(symbol_function(CCONCATENATE), unicode_nauts.convert_unicode_nauts_to_utf8_strings(nreverse(tooltip_text_list)))));
    }

    public static SubLObject clear_generate_phrase_for_cyclist() {
	final SubLObject cs = $generate_phrase_for_cyclist_caching_state$.getGlobalValue();
	if (NIL != cs) {
	    memoization_state.caching_state_clear(cs);
	}
	return NIL;
    }

    public static SubLObject remove_generate_phrase_for_cyclist(final SubLObject cyclist) {
	return memoization_state.caching_state_remove_function_results_with_args($generate_phrase_for_cyclist_caching_state$.getGlobalValue(), list(cyclist), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_phrase_for_cyclist_internal(final SubLObject cyclist) {
	return pph_main.generate_phrase(cyclist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_phrase_for_cyclist(final SubLObject cyclist) {
	SubLObject caching_state = $generate_phrase_for_cyclist_caching_state$.getGlobalValue();
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_global_caching_state_for_name(GENERATE_PHRASE_FOR_CYCLIST, $generate_phrase_for_cyclist_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
	    memoization_state.register_hl_store_cache_clear_callback(CLEAR_GENERATE_PHRASE_FOR_CYCLIST);
	}
	SubLObject results = memoization_state.caching_state_lookup(caching_state, cyclist, memoization_state.$memoized_item_not_found$.getGlobalValue());
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(resetMultipleValues(), multiple_value_list(generate_phrase_for_cyclist_internal(cyclist)));
	    memoization_state.caching_state_put(caching_state, cyclist, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    public static final SubLObject cb_link_sentence_alt(SubLObject sentence, SubLObject justifyP) {
	if (justifyP == UNPROVIDED) {
	    justifyP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject handler = $str_alt187$cb_sentence;
		SubLObject frame = $cb_default_assertion_frame$.getDynamicValue(thread);
		if (frame == $TOP) {
		    handler = $str_alt188$cb_start_cb_sentence;
		}
		{
		    SubLObject frame_name_var = cb_frame_name(frame);
		    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    cyc_cgi_url_int();
		    format(html_macros.$html_stream$.getDynamicValue(thread), NIL != justifyP ? ((SubLObject) ($str_alt189$_a__a_t)) : $str_alt121$_a__a, handler, cb_glob_id(sentence));
		    html_char(CHAR_quotation, UNPROVIDED);
		    if (NIL != frame_name_var) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name_var);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_sentence_marker(sentence);
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		}
	    }
	    return sentence;
	}
    }

    public static SubLObject cb_link_sentence(final SubLObject sentence, SubLObject justifyP) {
	if (justifyP == UNPROVIDED) {
	    justifyP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject handler = $str226$cb_sentence;
	final SubLObject frame = $cb_default_assertion_frame$.getDynamicValue(thread);
	if (frame == $TOP) {
	    handler = $str227$cb_start_cb_sentence;
	}
	final SubLObject frame_name_var = cb_frame_name(frame);
	html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	cyc_cgi_url_int();
	format(html_macros.$html_stream$.getDynamicValue(thread), NIL != justifyP ? $str228$_a__a_t : $str143$_a__a, handler, cb_glob_id(sentence));
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
	    html_sentence_marker(sentence);
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	return sentence;
    }

    public static final SubLObject html_sentence_marker_alt(SubLObject sentence) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject image_src = cb_icon_file_path($SENTENCE_MARKER);
		SubLObject align = $TOP;
		SubLObject alt = cb_get_icon_alt_string($SENTENCE_MARKER);
		SubLObject border = ZERO_INTEGER;
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
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_markup(html_macros.$html_image_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    public static SubLObject html_sentence_marker(final SubLObject sentence) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($SENTENCE_MARKER);
	final SubLObject align = $TOP;
	final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($SENTENCE_MARKER);
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
	return NIL;
    }

    public static final SubLObject cb_determine_help_target_alt(SubLObject target) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == target) {
		if (NIL != $cb_separate_doc_frame$.getDynamicValue(thread)) {
		    target = $DOC;
		} else {
		    target = $MAIN;
		}
	    }
	    return target;
	}
    }

    public static SubLObject cb_determine_help_target(SubLObject target) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == target) {
	    if (NIL != $cb_separate_doc_frame$.getDynamicValue(thread)) {
		target = $DOC;
	    } else {
		target = $MAIN;
	    }
	}
	return target;
    }

    public static final SubLObject cb_help_alt(SubLObject help_keyword, SubLObject target, SubLObject desc_override) {
	if (target == UNPROVIDED) {
	    target = NIL;
	}
	if (desc_override == UNPROVIDED) {
	    desc_override = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $cb_include_help$.getDynamicValue(thread)) {
		{
		    SubLObject target_var = cb_determine_help_target(target);
		    SubLObject frame_name = cb_frame_name(target_var);
		    SubLObject help_file_path = cb_help_file_path(help_keyword);
		    SubLObject desc_string = (NIL != desc_override) ? ((SubLObject) (desc_override)) : cb_get_help_desc_string(help_keyword);
		    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_markup(help_file_path);
		    html_char(CHAR_quotation, UNPROVIDED);
		    if (NIL != frame_name) {
			html_markup(html_macros.$html_anchor_target$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(frame_name);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    {
				SubLObject image_src = cb_icon_file_path($HELP);
				SubLObject align = $TOP;
				SubLObject alt = cb_get_icon_alt_string($HELP);
				SubLObject border = ZERO_INTEGER;
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
				{
				    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
				    }
				}
				html_markup(html_macros.$html_image_tail$.getGlobalValue());
			    }
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_help(final SubLObject help_keyword, SubLObject target, SubLObject desc_override) {
	if (target == UNPROVIDED) {
	    target = NIL;
	}
	if (desc_override == UNPROVIDED) {
	    desc_override = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $cb_include_help$.getDynamicValue(thread)) {
	    final SubLObject target_var = cb_determine_help_target(target);
	    final SubLObject frame_name = cb_frame_name(target_var);
	    final SubLObject help_file_path = cyc_file_dependencies.cb_help_file_path(help_keyword);
	    final SubLObject desc_string = (NIL != desc_override) ? desc_override : cyc_file_dependencies.cb_get_help_desc_string(help_keyword);
	    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(help_file_path);
	    html_char(CHAR_quotation, UNPROVIDED);
	    if (NIL != frame_name) {
		html_markup(html_macros.$html_anchor_target$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(frame_name);
		html_char(CHAR_quotation, UNPROVIDED);
	    }
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path($HELP);
		final SubLObject align = $TOP;
		final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string($HELP);
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
		final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
		}
		html_markup(html_macros.$html_image_tail$.getGlobalValue());
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	    }
	    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	}
	return NIL;
    }

    public static final SubLObject cb_help_preamble_alt(SubLObject help, SubLObject back_target, SubLObject message) {
	if (back_target == UNPROVIDED) {
	    back_target = $SELF;
	}
	if (message == UNPROVIDED) {
	    message = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $cb_include_help$.getDynamicValue(thread)) {
		if (help.isKeyword()) {
		    cb_help(help, UNPROVIDED, UNPROVIDED);
		} else {
		    Errors.warn($str_alt198$Use_of_unsupported_legacy_help_sy, help);
		}
		html_indent(UNPROVIDED);
	    }
	    if (NIL != message) {
		html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_princ(message);
		html_markup(html_macros.$html_strong_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_help_preamble(final SubLObject help, SubLObject back_target, SubLObject message) {
	if (back_target == UNPROVIDED) {
	    back_target = $SELF;
	}
	if (message == UNPROVIDED) {
	    message = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $cb_include_help$.getDynamicValue(thread)) {
	    if (help.isKeyword()) {
		cb_help(help, UNPROVIDED, UNPROVIDED);
	    } else {
		Errors.warn($str237$Use_of_unsupported_legacy_help_sy, help);
	    }
	    html_indent(UNPROVIDED);
	}
	if (NIL != message) {
	    html_markup(html_macros.$html_strong_head$.getGlobalValue());
	    html_princ(message);
	    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
	}
	return NIL;
    }

    public static final SubLObject cb_form_alt(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	{
	    SubLObject method_function = method_func(v_object, $cb_form_method_table$.getGlobalValue());
	    if (NIL != method_function) {
		return funcall(method_function, v_object, depth, wrap_axiomsP);
	    }
	    html_prin1(v_object);
	    return NIL;
	}
    }

    public static SubLObject cb_form(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject method_function = method_func(v_object, $cb_form_method_table$.getGlobalValue());
	if (NIL != method_function) {
	    return funcall(method_function, v_object, depth, wrap_axiomsP);
	}
	html_markup(html_macros.$html_no_break_head$.getGlobalValue());
	if (NIL != subl_promotions.memberP(v_object, $rule_unlabelled_dont_care_variables$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
	    html_markup(html_macros.$html_span_head$.getGlobalValue());
	    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup($str238$dont_care);
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		html_prin1(v_object);
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	    }
	    html_markup(html_macros.$html_span_tail$.getGlobalValue());
	} else {
	    html_prin1(v_object);
	}
	html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
	return NIL;
    }

    public static final SubLObject cb_form_variable_method_alt(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != list_utilities.member_eqP(v_object, $rule_unlabelled_dont_care_variables$.getDynamicValue(thread))) {
		{
		    SubLObject color_val = $RED;
		    html_markup(html_macros.$html_font_head$.getGlobalValue());
		    if (NIL != color_val) {
			html_markup(html_macros.$html_font_color$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_color(color_val));
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_prin1(v_object);
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_markup(html_macros.$html_font_tail$.getGlobalValue());
		}
	    } else {
		html_prin1(v_object);
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_form_variable_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_markup(html_macros.$html_no_break_head$.getGlobalValue());
	final SubLObject v_class = (NIL != subl_promotions.memberP(v_object, $rule_unlabelled_dont_care_variables$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) ? $str239$hl_var_dont_care : $str240$hl_var;
	html_markup(html_macros.$html_span_head$.getGlobalValue());
	if (NIL != v_class) {
	    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(v_class);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	html_char(CHAR_greater, UNPROVIDED);
	final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    html_prin1(v_object);
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_span_tail$.getGlobalValue());
	html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
	return NIL;
    }

    public static SubLObject cb_form_symbol_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_markup(html_macros.$html_no_break_head$.getGlobalValue());
	if (NIL != cycl_grammar.el_variable_p(v_object)) {
	    final SubLObject v_class = (NIL != subl_promotions.memberP(v_object, $rule_unlabelled_dont_care_variables$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) ? $str242$el_var_dont_care : $str243$el_var;
	    html_markup(html_macros.$html_span_head$.getGlobalValue());
	    if (NIL != v_class) {
		html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(v_class);
		html_char(CHAR_quotation, UNPROVIDED);
	    }
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		html_prin1(v_object);
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	    }
	    html_markup(html_macros.$html_span_tail$.getGlobalValue());
	} else if (v_object.isKeyword()) {
	    html_markup(html_macros.$html_span_head$.getGlobalValue());
	    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup($$$keyword);
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		html_prin1(v_object);
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
	    }
	    html_markup(html_macros.$html_span_tail$.getGlobalValue());
	} else {
	    html_markup(html_macros.$html_span_head$.getGlobalValue());
	    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup($$$symbol);
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		html_prin1(v_object);
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
	    }
	    html_markup(html_macros.$html_span_tail$.getGlobalValue());
	}

	html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
	return NIL;
    }

    public static final SubLObject cb_form_constant_method_alt(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	cb_link($CONSTANT, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	return NIL;
    }

    public static SubLObject cb_form_constant_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	cb_link($CONSTANT, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	return NIL;
    }

    public static final SubLObject cb_form_nart_method_alt(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == depth) {
		depth = ZERO_INTEGER;
	    }
	    {
		SubLObject nart_hl_formula = narts_high.nart_hl_formula(v_object);
		if (NIL != nart_hl_formula) {
		    {
			SubLObject _prev_bind_0 = $cb_just_did_nat$.currentBinding(thread);
			try {
			    $cb_just_did_nat$.bind(v_object, thread);
			    cb_form(nart_hl_formula, depth, wrap_axiomsP);
			} finally {
			    $cb_just_did_nat$.rebind(_prev_bind_0, thread);
			}
		    }
		} else {
		    cb_link($UNNAMED, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_form_nart_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == depth) {
	    depth = ZERO_INTEGER;
	}
	final SubLObject nart_hl_formula = narts_high.nart_hl_formula(v_object);
	if (NIL != nart_hl_formula) {
	    final SubLObject _prev_bind_0 = $cb_just_did_nat$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = $cb_term_id$.currentBinding(thread);
	    try {
		$cb_just_did_nat$.bind(v_object, thread);
		$cb_term_id$.bind(NIL != html_macros.next_html_id_definedP(UNPROVIDED) ? html_macros.next_html_id(UNPROVIDED) : NIL, thread);
		final SubLObject span_id = cb_nat_span_id(v_object, UNPROVIDED);
		if (NIL != $cb_term_id$.getDynamicValue(thread)) {
		    html_markup(html_macros.$html_span_head$.getGlobalValue());
		    if (NIL != span_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(span_id);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    if (NIL != cb_html_parameters.$cb_html_nat_class$.getDynamicValue(thread)) {
			html_markup(html_macros.$html_attribute_class$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(cb_html_parameters.$cb_html_nat_class$.getDynamicValue(thread));
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			cb_form(nart_hl_formula, depth, wrap_axiomsP);
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
		    }
		    html_markup(html_macros.$html_span_tail$.getGlobalValue());
		} else {
		    cb_form(nart_hl_formula, depth, wrap_axiomsP);
		}
	    } finally {
		$cb_term_id$.rebind(_prev_bind_2, thread);
		$cb_just_did_nat$.rebind(_prev_bind_0, thread);
	    }
	} else {
	    cb_link($UNNAMED, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}
	return NIL;
    }

    public static final SubLObject cb_form_assertion_method_alt(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	if (NIL == depth) {
	    depth = ZERO_INTEGER;
	}
	if (NIL != wrap_axiomsP) {
	    if (!depth.numE(ZERO_INTEGER)) {
		html_newline(UNPROVIDED);
	    }
	    html_indent(multiply(TWO_INTEGER, depth));
	}
	if (NIL != valid_assertion(v_object, UNPROVIDED)) {
	    cb_form_assertion_hl_formula(v_object, depth, wrap_axiomsP);
	} else {
	    cb_form_invalid_assertion(v_object, depth, wrap_axiomsP);
	}
	return NIL;
    }

    public static SubLObject cb_form_assertion_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == depth) {
	    depth = ZERO_INTEGER;
	}
	if ((NIL != $allow_cb_assertion_for_the_assertion_sentence_replacementP$.getDynamicValue(thread)) && (NIL != kb_utilities.kbeq(v_object, $cb_assertion_for_the_assertion_sentence_replacement$.getDynamicValue(thread)))) {
	    return cb_form($$TheAssertionSentence, depth, NIL);
	}
	if (NIL != wrap_axiomsP) {
	    if (!depth.numE(ZERO_INTEGER)) {
		html_newline(UNPROVIDED);
	    }
	    html_indent(depth);
	}
	if (NIL != assertions_high.valid_assertion(v_object, UNPROVIDED)) {
	    cb_form_assertion_hl_formula(v_object, depth, wrap_axiomsP);
	} else {
	    cb_form_invalid_assertion(v_object, depth, wrap_axiomsP);
	}
	return NIL;
    }

    public static final SubLObject cb_form_assertion_hl_formula_alt(SubLObject assertion, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $variable_names$.currentBinding(thread);
		SubLObject _prev_bind_1 = $rule_unlabelled_dont_care_variables$.currentBinding(thread);
		try {
		    $variable_names$.bind(assertion_variable_names(assertion), thread);
		    $rule_unlabelled_dont_care_variables$.bind(NIL != rule_assertionP(assertion) ? ((SubLObject) (assertion_utilities.rule_unlabelled_dont_care_variables(assertion))) : NIL, thread);
		    cb_form_assertion_formula(assertion, assertion_formula(assertion), depth, wrap_axiomsP);
		} finally {
		    $rule_unlabelled_dont_care_variables$.rebind(_prev_bind_1, thread);
		    $variable_names$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_form_assertion_hl_formula(final SubLObject assertion, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $variable_names$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $rule_unlabelled_dont_care_variables$.currentBinding(thread);
	try {
	    $variable_names$.bind(assertions_high.assertion_variable_names(assertion), thread);
	    $rule_unlabelled_dont_care_variables$.bind(NIL != assertions_high.rule_assertionP(assertion) ? assertion_utilities.rule_unlabelled_dont_care_variables(assertion) : NIL, thread);
	    final SubLObject additional_class_string = (NIL != assertion_utilities.obsolete_ruleP(assertion)) ? cb_html_parameters.$cb_html_obsolete_class$.getDynamicValue(thread) : $str88$;
	    cb_form_assertion_formula(assertion, assertions_high.assertion_formula(assertion), depth, wrap_axiomsP, additional_class_string);
	} finally {
	    $rule_unlabelled_dont_care_variables$.rebind(_prev_bind_2, thread);
	    $variable_names$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static final SubLObject cb_form_invalid_assertion_alt(SubLObject assertion, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	html_princ($str_alt204$__INVALID_ASSERTION_);
	return NIL;
    }

    public static SubLObject cb_form_invalid_assertion(final SubLObject assertion, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	html_princ($str252$__INVALID_ASSERTION_);
	return NIL;
    }

    /**
     * Display FORMULA preceded by a link to ASSERTION
     */
    @LispMethod(comment = "Display FORMULA preceded by a link to ASSERTION")
    public static final SubLObject cb_form_assertion_formula(SubLObject assertion, SubLObject formula, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    {
		SubLObject _prev_bind_0 = $cb_just_did_quote$.currentBinding(thread);
		try {
		    $cb_just_did_quote$.bind(T, thread);
		    {
			SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertion_mt(assertion));
			{
			    SubLObject _prev_bind_0_13 = mt_relevance_macros.$mt$.currentBinding(thread);
			    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			    try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				cb_form(formula, add(depth, ONE_INTEGER), wrap_axiomsP);
			    } finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0_13, thread);
			    }
			}
		    }
		} finally {
		    $cb_just_did_quote$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_form_assertion_formula(final SubLObject assertion, final SubLObject formula, SubLObject depth, SubLObject wrap_axiomsP, SubLObject additional_class_string) {
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	if (additional_class_string == UNPROVIDED) {
	    additional_class_string = $str88$;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_class = cconcatenate(additional_class_string, cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue(thread));
	html_markup(html_macros.$html_span_head$.getGlobalValue());
	if (NIL != v_class) {
	    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(v_class);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	html_char(CHAR_greater, UNPROVIDED);
	final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    final SubLObject _prev_bind_0_$29 = $cb_just_did_quote$.currentBinding(thread);
	    try {
		$cb_just_did_quote$.bind(T, thread);
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(assertion));
		final SubLObject _prev_bind_0_$30 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
		    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
		    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
		    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
		    cb_form(formula, add(depth, ONE_INTEGER), wrap_axiomsP);
		} finally {
		    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
		    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$30, thread);
		}
	    } finally {
		$cb_just_did_quote$.rebind(_prev_bind_0_$29, thread);
	    }
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_span_tail$.getGlobalValue());
	return NIL;
    }

    public static final SubLObject cb_form_assertion_edit_formula_alt(SubLObject assertion, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	return cb_form_assertion_formula(assertion, ke.ke_assertion_edit_formula(assertion), depth, wrap_axiomsP);
    }

    public static SubLObject cb_form_assertion_edit_formula(final SubLObject assertion, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	return cb_form_assertion_formula(assertion, ke.ke_assertion_edit_formula(assertion), depth, wrap_axiomsP, UNPROVIDED);
    }

    public static final SubLObject cb_form_string_method_alt(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (((NIL != wrap_axiomsP) && (NIL != html_macros.$within_html_pre$.getDynamicValue(thread))) && length(v_object).numG($cb_string_length_wrap$.getDynamicValue(thread))) {
		html_macros.verify_within_html_pre();
		html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
		{
		    SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
		    try {
			html_macros.$within_html_pre$.bind(NIL, thread);
			html_source_readability_terpri(UNPROVIDED);
			{
			    SubLObject _prev_bind_0_14 = html_macros.$html_preserve_breaks$.currentBinding(thread);
			    try {
				html_macros.$html_preserve_breaks$.bind(T, thread);
				html_print_doc_string(v_object);
			    } finally {
				html_macros.$html_preserve_breaks$.rebind(_prev_bind_0_14, thread);
			    }
			}
			html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
		    }
		}
		html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	    } else {
		html_print_doc_string(v_object);
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_form_string_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_markup(html_macros.$html_span_head$.getGlobalValue());
	if (NIL != cb_html_parameters.$cb_html_string_class$.getDynamicValue(thread)) {
	    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(cb_html_parameters.$cb_html_string_class$.getDynamicValue(thread));
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	html_char(CHAR_greater, UNPROVIDED);
	final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    if (((NIL != wrap_axiomsP) && (NIL != html_macros.$within_html_pre$.getDynamicValue(thread))) && length(v_object).numG($cb_string_length_wrap$.getDynamicValue(thread))) {
		html_macros.verify_within_html_pre();
		html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
		final SubLObject _prev_bind_0_$31 = html_macros.$within_html_pre$.currentBinding(thread);
		try {
		    html_macros.$within_html_pre$.bind(NIL, thread);
		    html_source_readability_terpri(UNPROVIDED);
		    final SubLObject _prev_bind_0_$32 = html_macros.$html_preserve_breaks$.currentBinding(thread);
		    try {
			html_macros.$html_preserve_breaks$.bind(T, thread);
			html_print_doc_string(v_object);
		    } finally {
			html_macros.$html_preserve_breaks$.rebind(_prev_bind_0_$32, thread);
		    }
		    html_source_readability_terpri(UNPROVIDED);
		} finally {
		    html_macros.$within_html_pre$.rebind(_prev_bind_0_$31, thread);
		}
		html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	    } else {
		html_print_doc_string(v_object);
	    }
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_span_tail$.getGlobalValue());
	return NIL;
    }

    public static final SubLObject print_cb_form_cons_methods_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
		princ($str_alt39$_, stream);
	    } else {
		if (NIL != $print_readably$.getDynamicValue(thread)) {
		    print_not_readable(v_object, stream);
		} else {
		    {
			SubLObject v_object_15 = v_object;
			SubLObject stream_16 = stream;
			write_string($str_alt210$__, stream_16, UNPROVIDED, UNPROVIDED);
			write(type_of(v_object_15), new SubLObject[] { $STREAM, stream_16 });
			write_char(CHAR_space, stream_16);
			princ(cb_form_cons_method_name(v_object), stream);
			write_char(CHAR_greater, stream_16);
		    }
		}
	    }
	    return v_object;
	}
    }

    public static SubLObject print_cb_form_cons_methods(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
	    princ($str47$_, stream);
	} else if (NIL != $print_readably$.getDynamicValue(thread)) {
	    print_not_readable(v_object, stream);
	} else {
	    print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
	    princ(cb_form_cons_method_name(v_object), stream);
	    print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
	}

	return v_object;
    }

    public static final SubLObject cb_form_cons_method_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	print_cb_form_cons_methods(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject cb_form_cons_method_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	print_cb_form_cons_methods(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject cb_form_cons_method_p_alt(SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject cb_form_cons_method_p(final SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native.class ? T : NIL;
    }

    public static final SubLObject cb_form_cons_method_name_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, CB_FORM_CONS_METHOD_P);
	return v_object.getField2();
    }

    public static SubLObject cb_form_cons_method_name(final SubLObject v_object) {
	assert NIL != cb_form_cons_method_p(v_object) : "! cb_utilities.cb_form_cons_method_p(v_object) " + "cb_utilities.cb_form_cons_method_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject cb_form_cons_method_keyword_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, CB_FORM_CONS_METHOD_P);
	return v_object.getField3();
    }

    public static SubLObject cb_form_cons_method_keyword(final SubLObject v_object) {
	assert NIL != cb_form_cons_method_p(v_object) : "! cb_utilities.cb_form_cons_method_p(v_object) " + "cb_utilities.cb_form_cons_method_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject cb_form_cons_method_applicability_test_fn_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, CB_FORM_CONS_METHOD_P);
	return v_object.getField4();
    }

    public static SubLObject cb_form_cons_method_applicability_test_fn(final SubLObject v_object) {
	assert NIL != cb_form_cons_method_p(v_object) : "! cb_utilities.cb_form_cons_method_p(v_object) " + "cb_utilities.cb_form_cons_method_p error :" + v_object;
	return v_object.getField4();
    }

    public static final SubLObject cb_form_cons_method_html_output_fn_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, CB_FORM_CONS_METHOD_P);
	return v_object.getField5();
    }

    public static SubLObject cb_form_cons_method_html_output_fn(final SubLObject v_object) {
	assert NIL != cb_form_cons_method_p(v_object) : "! cb_utilities.cb_form_cons_method_p(v_object) " + "cb_utilities.cb_form_cons_method_p error :" + v_object;
	return v_object.getField5();
    }

    public static final SubLObject _csetf_cb_form_cons_method_name_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, CB_FORM_CONS_METHOD_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_cb_form_cons_method_name(final SubLObject v_object, final SubLObject value) {
	assert NIL != cb_form_cons_method_p(v_object) : "! cb_utilities.cb_form_cons_method_p(v_object) " + "cb_utilities.cb_form_cons_method_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_cb_form_cons_method_keyword_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, CB_FORM_CONS_METHOD_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_cb_form_cons_method_keyword(final SubLObject v_object, final SubLObject value) {
	assert NIL != cb_form_cons_method_p(v_object) : "! cb_utilities.cb_form_cons_method_p(v_object) " + "cb_utilities.cb_form_cons_method_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_cb_form_cons_method_applicability_test_fn_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, CB_FORM_CONS_METHOD_P);
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_cb_form_cons_method_applicability_test_fn(final SubLObject v_object, final SubLObject value) {
	assert NIL != cb_form_cons_method_p(v_object) : "! cb_utilities.cb_form_cons_method_p(v_object) " + "cb_utilities.cb_form_cons_method_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_cb_form_cons_method_html_output_fn_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, CB_FORM_CONS_METHOD_P);
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_cb_form_cons_method_html_output_fn(final SubLObject v_object, final SubLObject value) {
	assert NIL != cb_form_cons_method_p(v_object) : "! cb_utilities.cb_form_cons_method_p(v_object) " + "cb_utilities.cb_form_cons_method_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static final SubLObject make_cb_form_cons_method_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($NAME)) {
			_csetf_cb_form_cons_method_name(v_new, current_value);
		    } else {
			if (pcase_var.eql($KEYWORD)) {
			    _csetf_cb_form_cons_method_keyword(v_new, current_value);
			} else {
			    if (pcase_var.eql($APPLICABILITY_TEST_FN)) {
				_csetf_cb_form_cons_method_applicability_test_fn(v_new, current_value);
			    } else {
				if (pcase_var.eql($HTML_OUTPUT_FN)) {
				    _csetf_cb_form_cons_method_html_output_fn(v_new, current_value);
				} else {
				    Errors.error($str_alt233$Invalid_slot__S_for_construction_, current_arg);
				}
			    }
			}
		    }
		}
	    }
	    return v_new;
	}
    }

    public static SubLObject make_cb_form_cons_method(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($NAME)) {
		_csetf_cb_form_cons_method_name(v_new, current_value);
	    } else if (pcase_var.eql($KEYWORD)) {
		_csetf_cb_form_cons_method_keyword(v_new, current_value);
	    } else if (pcase_var.eql($APPLICABILITY_TEST_FN)) {
		_csetf_cb_form_cons_method_applicability_test_fn(v_new, current_value);
	    } else if (pcase_var.eql($HTML_OUTPUT_FN)) {
		_csetf_cb_form_cons_method_html_output_fn(v_new, current_value);
	    } else {
		Errors.error($str279$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_cb_form_cons_method(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_CB_FORM_CONS_METHOD, FOUR_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $NAME, cb_form_cons_method_name(obj));
	funcall(visitor_fn, obj, $SLOT, $KEYWORD, cb_form_cons_method_keyword(obj));
	funcall(visitor_fn, obj, $SLOT, $APPLICABILITY_TEST_FN, cb_form_cons_method_applicability_test_fn(obj));
	funcall(visitor_fn, obj, $SLOT, $HTML_OUTPUT_FN, cb_form_cons_method_html_output_fn(obj));
	funcall(visitor_fn, obj, $END, MAKE_CB_FORM_CONS_METHOD, FOUR_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_cb_form_cons_method_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_cb_form_cons_method(obj, visitor_fn);
    }

    /**
     * Define a new cb-form-cons-method
     */
    @LispMethod(comment = "Define a new cb-form-cons-method")
    public static final SubLObject defcb_form_cons_method_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject name = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt234);
	    name = current.first();
	    current = current.rest();
	    {
		SubLObject arglist = current;
		return list(REGISTER_CB_FORM_CONS_METHOD, list(QUOTE, name), list(QUOTE, arglist));
	    }
	}
    }

    /**
     * Define a new cb-form-cons-method
     */
    @LispMethod(comment = "Define a new cb-form-cons-method")
    public static SubLObject defcb_form_cons_method(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject name = NIL;
	destructuring_bind_must_consp(current, datum, $list285);
	name = current.first();
	final SubLObject arglist;
	current = arglist = current.rest();
	return list(REGISTER_CB_FORM_CONS_METHOD, list(QUOTE, name), list(QUOTE, arglist));
    }

    public static final SubLObject register_cb_form_cons_method_alt(SubLObject name, SubLObject arglist) {
	{
	    SubLObject new_cb_form_cons_method = make_cb_form_cons_method(arglist);
	    _csetf_cb_form_cons_method_name(new_cb_form_cons_method, name);
	    sethash(cb_form_cons_method_keyword(new_cb_form_cons_method), $cb_form_cons_methods_by_keyword$.getGlobalValue(), new_cb_form_cons_method);
	    $cb_form_cons_methods$.setGlobalValue(cons(new_cb_form_cons_method, delete(name, $cb_form_cons_methods$.getGlobalValue(), symbol_function(EQUAL), symbol_function(CB_FORM_CONS_METHOD_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    return new_cb_form_cons_method;
	}
    }

    public static SubLObject register_cb_form_cons_method(final SubLObject name, final SubLObject arglist) {
	final SubLObject new_cb_form_cons_method = make_cb_form_cons_method(arglist);
	_csetf_cb_form_cons_method_name(new_cb_form_cons_method, name);
	sethash(cb_form_cons_method_keyword(new_cb_form_cons_method), $cb_form_cons_methods_by_keyword$.getGlobalValue(), new_cb_form_cons_method);
	$cb_form_cons_methods$.setGlobalValue(cons(new_cb_form_cons_method, delete(name, $cb_form_cons_methods$.getGlobalValue(), symbol_function(EQUAL), symbol_function(CB_FORM_CONS_METHOD_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	return new_cb_form_cons_method;
    }

    public static final SubLObject with_cb_form_cons_methods_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt238);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject method_keywords = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt238);
		    method_keywords = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    return listS(CLET, list(list($cb_form_cons_methods_active$, list(COMPUTE_CB_FORM_CONS_METHODS_ACTIVE, method_keywords))), append(body, NIL));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt238);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject with_cb_form_cons_methods(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list289);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject method_keywords = NIL;
	destructuring_bind_must_consp(current, datum, $list289);
	method_keywords = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    return listS(CLET, list(list($cb_form_cons_methods_active$, list(COMPUTE_CB_FORM_CONS_METHODS_ACTIVE, method_keywords))), append(body, NIL));
	}
	cdestructuring_bind_error(datum, $list289);
	return NIL;
    }

    public static final SubLObject compute_cb_form_cons_methods_active_alt(SubLObject method_keywords) {
	{
	    SubLObject v_methods = NIL;
	    SubLObject cdolist_list_var = method_keywords;
	    SubLObject method_keyword = NIL;
	    for (method_keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), method_keyword = cdolist_list_var.first()) {
		{
		    SubLObject method = cb_form_cons_method_keyword_to_cb_form_cons_method(method_keyword);
		    if (NIL != method) {
			v_methods = cons(method, v_methods);
		    }
		}
	    }
	    return v_methods;
	}
    }

    public static SubLObject compute_cb_form_cons_methods_active(final SubLObject method_keywords) {
	SubLObject v_methods = NIL;
	SubLObject cdolist_list_var = method_keywords;
	SubLObject method_keyword = NIL;
	method_keyword = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject method = cb_form_cons_method_keyword_to_cb_form_cons_method(method_keyword);
	    if (NIL != method) {
		v_methods = cons(method, v_methods);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    method_keyword = cdolist_list_var.first();
	}
	return v_methods;
    }

    public static final SubLObject cb_form_cons_methods_active_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return append($cb_form_cons_methods_active$.getDynamicValue(thread), always_active_cb_form_cons_methods());
	}
    }

    public static SubLObject cb_form_cons_methods_active() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return append($cb_form_cons_methods_active$.getDynamicValue(thread), always_active_cb_form_cons_methods());
    }

    public static final SubLObject declare_cb_form_cons_method_always_active_alt(SubLObject method_keyword) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject method = cb_form_cons_method_keyword_to_cb_form_cons_method(method_keyword);
		if (NIL != method) {
		    $always_active_cb_form_cons_methods$.setDynamicValue(cons(method, $always_active_cb_form_cons_methods$.getDynamicValue(thread)), thread);
		}
	    }
	    return $always_active_cb_form_cons_methods$.getDynamicValue(thread);
	}
    }

    public static SubLObject declare_cb_form_cons_method_always_active(final SubLObject method_keyword) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject method = cb_form_cons_method_keyword_to_cb_form_cons_method(method_keyword);
	if (NIL != method) {
	    $always_active_cb_form_cons_methods$.setDynamicValue(cons(method, $always_active_cb_form_cons_methods$.getDynamicValue(thread)), thread);
	}
	return $always_active_cb_form_cons_methods$.getDynamicValue(thread);
    }

    public static final SubLObject always_active_cb_form_cons_methods_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return $always_active_cb_form_cons_methods$.getDynamicValue(thread);
	}
    }

    public static SubLObject always_active_cb_form_cons_methods() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return $always_active_cb_form_cons_methods$.getDynamicValue(thread);
    }

    public static final SubLObject cb_form_cons_method_keyword_to_cb_form_cons_method_alt(SubLObject keyword) {
	return gethash(keyword, $cb_form_cons_methods_by_keyword$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject cb_form_cons_method_keyword_to_cb_form_cons_method(final SubLObject keyword) {
	return gethash(keyword, $cb_form_cons_methods_by_keyword$.getGlobalValue(), UNPROVIDED);
    }

    /**
     *
     *
     * @return stringp; a URL to get to bring up the standard browser frameset with TERM
    as the focussed term
     */
    @LispMethod(comment = "@return stringp; a URL to get to bring up the standard browser frameset with TERM\r\nas the focussed term")
    public static final SubLObject top_level_cb_form_url_alt(SubLObject v_term) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject base_url = cconcatenate(http_kernel.http_server_cgi_base_url(), $str_alt243$cg_cb_start_);
		SubLObject fortified_term = narts_high.nart_substitute(v_term);
		SubLObject fortP = forts.fort_p(fortified_term);
		SubLObject handler = (NIL != fortP) ? ((SubLObject) ($cb_default_fort_handler$.getDynamicValue(thread))) : $cb_default_naut_handler$.getDynamicValue(thread);
		SubLObject term_identifier = (NIL != fortP) ? ((SubLObject) (cb_fort_identifier(fortified_term))) : cb_naut_identifier(fortified_term);
		return cconcatenate(base_url, new SubLObject[] { handler, $str_alt70$_, term_identifier });
	    }
	}
    }

    /**
     *
     *
     * @return stringp; a URL to get to bring up the standard browser frameset with TERM
    as the focussed term
     */
    @LispMethod(comment = "@return stringp; a URL to get to bring up the standard browser frameset with TERM\r\nas the focussed term")
    public static SubLObject top_level_cb_form_url(final SubLObject v_term) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject base_url = cconcatenate(http_kernel.http_server_cgi_base_url(), $str294$cg_cb_start_);
	final SubLObject fortified_term = narts_high.nart_substitute(v_term);
	final SubLObject fortP = forts.fort_p(fortified_term);
	final SubLObject handler = (NIL != fortP) ? $cb_default_fort_handler$.getDynamicValue(thread) : $cb_default_naut_handler$.getDynamicValue(thread);
	final SubLObject term_identifier = (NIL != fortP) ? cb_fort_identifier(fortified_term) : cb_naut_identifier(fortified_term);
	return cconcatenate(base_url, new SubLObject[] { handler, $str90$_, term_identifier });
    }

    public static SubLObject cb_form_string(final SubLObject obj, SubLObject url_type) {
	if (url_type == UNPROVIDED) {
	    url_type = $RELATIVE;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject cb_form_string = NIL;
	final SubLObject _prev_bind_0 = $cb_form_url_prefix_print$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $cb_default_term_frame$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $cb_default_assertion_frame$.currentBinding(thread);
	try {
	    $cb_form_url_prefix_print$.bind(get_url_prefix_for_url_type(url_type), thread);
	    $cb_default_term_frame$.bind($str97$_blank, thread);
	    $cb_default_assertion_frame$.bind($str97$_blank, thread);
	    SubLObject stream = NIL;
	    try {
		stream = make_private_string_output_stream();
		final SubLObject _prev_bind_0_$33 = html_macros.$html_stream$.currentBinding(thread);
		try {
		    html_macros.$html_stream$.bind(stream, thread);
		    cb_form(obj, UNPROVIDED, UNPROVIDED);
		} finally {
		    html_macros.$html_stream$.rebind(_prev_bind_0_$33, thread);
		}
		cb_form_string = get_output_stream_string(stream);
	    } finally {
		final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    close(stream, UNPROVIDED);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
		}
	    }
	    return cb_form_string;
	} finally {
	    $cb_default_assertion_frame$.rebind(_prev_bind_3, thread);
	    $cb_default_term_frame$.rebind(_prev_bind_2, thread);
	    $cb_form_url_prefix_print$.rebind(_prev_bind_0, thread);
	}
    }

    public static SubLObject get_url_prefix_for_url_type(final SubLObject url_type) {
	if (url_type.eql($RELATIVE)) {
	    return CYC_CGI_RELATIVE_URL;
	}
	if (url_type.eql($KEA)) {
	    return CYC_CGI_KEA_URL;
	}
	if (url_type.eql($CB)) {
	    return CYC_CGI_ABSOLUTE_CB_FRAMED_URL;
	}
	return CYC_CGI_RELATIVE_URL;
    }

    public static SubLObject cb_formula_argument_limit_exceededP(final SubLObject argnum) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $cb_formula_argument_limit$.getDynamicValue(thread)) {
	    return numG(argnum, $cb_formula_argument_limit$.getDynamicValue(thread));
	}
	return NIL;
    }

    public static final SubLObject cb_form_cons_method_alt(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == depth) {
		depth = ZERO_INTEGER;
	    }
	    if ((NIL != term.closed_nautP(v_object, UNPROVIDED)) && (NIL == $cb_just_did_naut$.getDynamicValue(thread))) {
		{
		    SubLObject _prev_bind_0 = $cb_just_did_naut$.currentBinding(thread);
		    try {
			$cb_just_did_naut$.bind(v_object, thread);
			cb_form(v_object, depth, wrap_axiomsP);
		    } finally {
			$cb_just_did_naut$.rebind(_prev_bind_0, thread);
		    }
		}
		return NIL;
	    }
	    if (v_object.first() == QUOTE) {
		if ((NIL != wrap_axiomsP) && (!second(v_object).isAtom())) {
		    html_newline(UNPROVIDED);
		    html_indent(depth);
		}
		html_princ($str_alt244$_);
		{
		    SubLObject _prev_bind_0 = $cb_just_did_quote$.currentBinding(thread);
		    try {
			$cb_just_did_quote$.bind(T, thread);
			cb_form(second(v_object), depth, wrap_axiomsP);
		    } finally {
			$cb_just_did_quote$.rebind(_prev_bind_0, thread);
		    }
		}
	    } else {
		{
		    SubLObject used_cb_form_cons_methodP = NIL;
		    SubLObject close_paren_is_for_nartP = NIL;
		    if (NIL == used_cb_form_cons_methodP) {
			{
			    SubLObject csome_list_var = cb_form_cons_methods_active();
			    SubLObject cb_form_cons_method = NIL;
			    for (cb_form_cons_method = csome_list_var.first(); !((NIL != used_cb_form_cons_methodP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), cb_form_cons_method = csome_list_var.first()) {
				{
				    SubLObject cb_form_cons_method_applicability_test_fn = cb_form_cons_method_applicability_test_fn(cb_form_cons_method);
				    SubLObject cb_form_cons_method_html_output_fn = cb_form_cons_method_html_output_fn(cb_form_cons_method);
				    if (cb_form_cons_method_applicability_test_fn.isFunctionSpec()) {
					if (NIL != funcall(cb_form_cons_method_applicability_test_fn, v_object)) {
					    if (cb_form_cons_method_html_output_fn.isFunctionSpec()) {
						funcall(cb_form_cons_method_html_output_fn, v_object);
						used_cb_form_cons_methodP = T;
					    }
					}
				    }
				}
			    }
			}
		    }
		    if (NIL == used_cb_form_cons_methodP) {
			if (NIL == $cb_form_cons_suppress_newline$.getDynamicValue(thread)) {
			    if ((NIL != wrap_axiomsP) && (NIL == $cb_just_did_quote$.getDynamicValue(thread))) {
				if (!depth.numE(ZERO_INTEGER)) {
				    html_newline(UNPROVIDED);
				}
				html_indent(multiply(TWO_INTEGER, depth));
			    }
			}
			$cb_just_did_quote$.setDynamicValue(NIL, thread);
			if (NIL != list_utilities.member_eqP(v_object.first(), $cb_form_suppress_naut_link_functions$.getDynamicValue(thread))) {
			    html_princ($str_alt123$_);
			} else {
			    if (NIL != $cb_just_did_nat$.getDynamicValue(thread)) {
				close_paren_is_for_nartP = T;
				html_markup(html_macros.$html_bold_head$.getGlobalValue());
				cb_link($NART, $cb_just_did_nat$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				html_markup(html_macros.$html_bold_tail$.getGlobalValue());
				$cb_just_did_nat$.setDynamicValue(NIL, thread);
			    } else {
				if (NIL != $cb_just_did_naut$.getDynamicValue(thread)) {
				    cb_link($NAUT, $cb_just_did_naut$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				    $cb_just_did_naut$.setDynamicValue(NIL, thread);
				} else {
				    html_princ($str_alt123$_);
				}
			    }
			}
			{
			    SubLObject _prev_bind_0 = $cb_form_cons_suppress_newline$.currentBinding(thread);
			    try {
				$cb_form_cons_suppress_newline$.bind(T, thread);
				cb_form(v_object.first(), depth, wrap_axiomsP);
			    } finally {
				$cb_form_cons_suppress_newline$.rebind(_prev_bind_0, thread);
			    }
			}
			if (NIL != $cb_form_cons_suppress_newline$.getDynamicValue(thread)) {
			    $cb_form_cons_suppress_newline$.setDynamicValue(NIL, thread);
			}
			if (NIL != memberP(v_object.first(), $cb_wrap_after_arg_1$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
			    html_princ($str_alt180$_);
			    cb_form(second(v_object), depth, NIL);
			    v_object = v_object.rest();
			}
			{
			    SubLObject rest = NIL;
			    for (rest = v_object.rest(); rest.isCons(); rest = rest.rest()) {
				html_princ($str_alt180$_);
				cb_form(rest.first(), add(depth, ONE_INTEGER), wrap_axiomsP);
			    }
			    if (NIL != rest) {
				html_princ($str_alt245$___);
				cb_form(rest, add(depth, ONE_INTEGER), wrap_axiomsP);
			    }
			    if (NIL != close_paren_is_for_nartP) {
				html_markup(html_macros.$html_bold_head$.getGlobalValue());
				html_princ($str_alt246$_);
				html_markup(html_macros.$html_bold_tail$.getGlobalValue());
			    } else {
				html_princ($str_alt246$_);
			    }
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_form_cons_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = NIL;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_markup(html_macros.$html_span_head$.getGlobalValue());
	if (NIL != cb_html_parameters.$cb_html_cons_class$.getDynamicValue(thread)) {
	    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(cb_html_parameters.$cb_html_cons_class$.getDynamicValue(thread));
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	html_char(CHAR_greater, UNPROVIDED);
	final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    cb_form_cons_internal(v_object, depth, wrap_axiomsP);
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_span_tail$.getGlobalValue());
	return v_object;
    }

    public static SubLObject cb_form_cons_internal(SubLObject v_object, SubLObject depth, final SubLObject wrap_axiomsP) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == depth) {
	    depth = ZERO_INTEGER;
	}
	if ((NIL != term.closed_nautP(v_object, UNPROVIDED)) && (!v_object.equal($cb_just_did_naut$.getDynamicValue(thread)))) {
	    final SubLObject _prev_bind_0 = $cb_inside_naut$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = $cb_inside_quoteP$.currentBinding(thread);
	    final SubLObject _prev_bind_3 = $cb_just_did_naut$.currentBinding(thread);
	    final SubLObject _prev_bind_4 = $cb_term_id$.currentBinding(thread);
	    try {
		$cb_inside_naut$.bind($cb_inside_naut$.getDynamicValue(thread), thread);
		$cb_inside_quoteP$.bind(NIL != cycl_grammar.fast_cycl_quoted_term_p(v_object) ? T : NIL != cycl_grammar.fast_escape_quote_term_p(v_object) ? NIL : $cb_inside_quoteP$.getDynamicValue(thread), thread);
		$cb_just_did_naut$.bind(v_object, thread);
		$cb_term_id$.bind(NIL != html_macros.next_html_id_definedP(UNPROVIDED) ? html_macros.next_html_id(UNPROVIDED) : NIL, thread);
		final SubLObject span_id = cb_nat_span_id(v_object, UNPROVIDED);
		if (NIL != $cb_term_id$.getDynamicValue(thread)) {
		    html_markup(html_macros.$html_span_head$.getGlobalValue());
		    if (NIL != span_id) {
			html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(span_id);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    if (NIL != cb_html_parameters.$cb_html_nat_class$.getDynamicValue(thread)) {
			html_markup(html_macros.$html_attribute_class$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(cb_html_parameters.$cb_html_nat_class$.getDynamicValue(thread));
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			cb_form_cons_internal(v_object, depth, wrap_axiomsP);
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
		    }
		    html_markup(html_macros.$html_span_tail$.getGlobalValue());
		} else {
		    cb_form_cons_internal(v_object, depth, wrap_axiomsP);
		}
	    } finally {
		$cb_term_id$.rebind(_prev_bind_4, thread);
		$cb_just_did_naut$.rebind(_prev_bind_3, thread);
		$cb_inside_quoteP$.rebind(_prev_bind_2, thread);
		$cb_inside_naut$.rebind(_prev_bind_0, thread);
	    }
	} else if (v_object.first().eql(QUOTE)) {
	    if ((NIL != wrap_axiomsP) && (!second(v_object).isAtom())) {
		html_newline(UNPROVIDED);
		html_indent(depth);
	    }
	    html_princ($str302$_);
	    final SubLObject _prev_bind_0 = $cb_just_did_quote$.currentBinding(thread);
	    try {
		$cb_just_did_quote$.bind(T, thread);
		cb_form(second(v_object), depth, wrap_axiomsP);
	    } finally {
		$cb_just_did_quote$.rebind(_prev_bind_0, thread);
	    }
	} else {
	    final SubLObject _prev_bind_0 = $cb_inside_naut$.currentBinding(thread);
	    try {
		$cb_inside_naut$.bind($cb_inside_naut$.getDynamicValue(thread), thread);
		SubLObject used_cb_form_cons_methodP = NIL;
		SubLObject close_paren_is_for_nartP = NIL;
		if (NIL == used_cb_form_cons_methodP) {
		    SubLObject csome_list_var = cb_form_cons_methods_active();
		    SubLObject cb_form_cons_method = NIL;
		    cb_form_cons_method = csome_list_var.first();
		    while ((NIL == used_cb_form_cons_methodP) && (NIL != csome_list_var)) {
			final SubLObject cb_form_cons_method_applicability_test_fn = cb_form_cons_method_applicability_test_fn(cb_form_cons_method);
			final SubLObject cb_form_cons_method_html_output_fn = cb_form_cons_method_html_output_fn(cb_form_cons_method);
			if ((cb_form_cons_method_applicability_test_fn.isFunctionSpec() && (NIL != funcall(cb_form_cons_method_applicability_test_fn, v_object))) && cb_form_cons_method_html_output_fn.isFunctionSpec()) {
			    funcall(cb_form_cons_method_html_output_fn, v_object, depth, wrap_axiomsP);
			    used_cb_form_cons_methodP = T;
			}
			csome_list_var = csome_list_var.rest();
			cb_form_cons_method = csome_list_var.first();
		    }
		}
		if (NIL == used_cb_form_cons_methodP) {
		    if (((NIL == $cb_form_cons_suppress_newline$.getDynamicValue(thread)) && (NIL != wrap_axiomsP)) && (NIL == $cb_just_did_quote$.getDynamicValue(thread))) {
			if (!depth.numE(ZERO_INTEGER)) {
			    html_newline(UNPROVIDED);
			}
			html_indent(depth);
		    }
		    $cb_just_did_quote$.setDynamicValue(NIL, thread);
		    if ((NIL != $cb_inside_naut$.getDynamicValue(thread)) || (NIL != subl_promotions.memberP(v_object.first(), $cb_form_suppress_naut_link_functions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
			html_markup(html_macros.$html_span_head$.getGlobalValue());
			html_markup(html_macros.$html_attribute_class$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($$$cycl);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_princ($str153$_);
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
			}
			html_markup(html_macros.$html_span_tail$.getGlobalValue());
		    } else if (NIL != $cb_just_did_nat$.getDynamicValue(thread)) {
			close_paren_is_for_nartP = T;
			html_markup(html_macros.$html_bold_head$.getGlobalValue());
			cb_link($NART, $cb_just_did_nat$.getDynamicValue(thread), $str153$_, $NART, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_bold_tail$.getGlobalValue());
			$cb_inside_naut$.setDynamicValue(NIL, thread);
			$cb_just_did_nat$.setDynamicValue(NIL, thread);
		    } else if (NIL != $cb_just_did_naut$.getDynamicValue(thread)) {
			cb_link($NAUT, $cb_just_did_naut$.getDynamicValue(thread), $str153$_, $NAT, UNPROVIDED, UNPROVIDED);
			if (NIL != $cb_inside_naut_support_enabledP$.getDynamicValue(thread)) {
			    $cb_inside_naut$.setDynamicValue(T, thread);
			}
			$cb_just_did_naut$.setDynamicValue(NIL, thread);
		    } else {
			html_markup(html_macros.$html_span_head$.getGlobalValue());
			html_markup(html_macros.$html_attribute_class$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($$$cycl);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_princ($str153$_);
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
			}
			html_markup(html_macros.$html_span_tail$.getGlobalValue());
		    }

		    SubLObject argnum = ZERO_INTEGER;
		    final SubLObject _prev_bind_0_$38 = $cb_form_cons_suppress_newline$.currentBinding(thread);
		    try {
			$cb_form_cons_suppress_newline$.bind(T, thread);
			cb_form(v_object.first(), depth, wrap_axiomsP);
			argnum = add(argnum, ONE_INTEGER);
		    } finally {
			$cb_form_cons_suppress_newline$.rebind(_prev_bind_0_$38, thread);
		    }
		    if (NIL != $cb_form_cons_suppress_newline$.getDynamicValue(thread)) {
			$cb_form_cons_suppress_newline$.setDynamicValue(NIL, thread);
		    }
		    if (NIL != subl_promotions.memberP(v_object.first(), $cb_wrap_after_arg_1$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
			cb_form_cons_inter_arg_space();
			cb_form(second(v_object), depth, NIL);
			v_object = v_object.rest();
			argnum = add(argnum, ONE_INTEGER);
		    }
		    SubLObject rest;
		    for (rest = NIL, rest = v_object.rest(); (NIL == cb_formula_argument_limit_exceededP(argnum)) && rest.isCons(); argnum = add(argnum, ONE_INTEGER), rest = rest.rest()) {
			cb_form_cons_inter_arg_space();
			cb_form(rest.first(), add(depth, ONE_INTEGER), wrap_axiomsP);
		    }
		    if (NIL != cb_formula_argument_limit_exceededP(argnum)) {
			html_princ_strong($str303$____);
		    } else if (NIL != rest) {
			html_princ($str304$___);
			cb_form(rest, add(depth, ONE_INTEGER), wrap_axiomsP);
		    }

		    if (NIL != close_paren_is_for_nartP) {
			html_markup(html_macros.$html_span_head$.getGlobalValue());
			html_markup(html_macros.$html_attribute_class$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($$$cycl);
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_macros.$html_span_style$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($str305$font_weight_900);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_princ($str306$_);
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
			}
			html_markup(html_macros.$html_span_tail$.getGlobalValue());
		    } else {
			html_markup(html_macros.$html_span_head$.getGlobalValue());
			html_markup(html_macros.$html_attribute_class$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup($$$cycl);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_princ($str306$_);
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
			}
			html_markup(html_macros.$html_span_tail$.getGlobalValue());
		    }
		}
	    } finally {
		$cb_inside_naut$.rebind(_prev_bind_0, thread);
	    }
	}

	return NIL;
    }

    public static SubLObject cb_form_cons_inter_arg_space() {
	html_princ($$$_);
	return NIL;
    }

    public static SubLObject cb_date_to_optimize_for_displayP(final SubLObject cons) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean((((NIL != $cb_display_dates_as_stringsP$.getDynamicValue(thread)) && (NIL == $cb_inside_quoteP$.getDynamicValue(thread))) && (NIL != date_utilities.simple_el_date_p(cons))) && (NIL == date_utilities.el_date_year_p(cons)));
    }

    public static SubLObject cb_show_date_optimized_for_display(final SubLObject simple_date, final SubLObject depth, final SubLObject wrap_axiomsP) {
	final SubLObject optimized_date = cb_optimize_date_for_display(simple_date);
	return cb_form(optimized_date, depth, wrap_axiomsP);
    }

    public static SubLObject cb_possibly_optimize_date_for_display(SubLObject date) {
	if (NIL != cb_date_to_optimize_for_displayP(date)) {
	    date = cb_optimize_date_for_display(date);
	}
	return date;
    }

    public static SubLObject cb_optimize_date_for_display(final SubLObject simple_date) {
	final SubLObject date_as_string = date_utilities.cyc_date_encode_string_internal($str313$DateFromStringFn_datetime, simple_date);
	return make_unary_formula($$DateFromStringFn, date_as_string);
    }

    public static SubLObject cb_decimal_to_optimize_for_displayP(final SubLObject cons) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean((((NIL != $cb_display_decimals_as_decimalsP$.getDynamicValue(thread)) && (NIL == $cb_ke_text_mode$.getDynamicValue(thread))) && (NIL != kb_control_vars.fraction_kb_loaded_p())) && (NIL != simple_el_decimal_p(cons)));
    }

    public static SubLObject cb_show_decimal_optimized_for_display(final SubLObject simple_decimal, final SubLObject depth, final SubLObject wrap_axiomsP) {
	final SubLObject optimized_decimal = cb_optimize_decimal_for_display(simple_decimal);
	return cb_link_naut(simple_decimal, string_utilities.to_string(optimized_decimal), UNPROVIDED);
    }

    public static SubLObject cb_optimize_decimal_for_display(final SubLObject simple_decimal) {
	return extended_numbers.extended_number_to_subl_real(simple_decimal);
    }

    public static SubLObject simple_el_decimal_p(final SubLObject obj) {
	return makeBoolean((((NIL != el_formula_p(obj)) && (NIL != groundP(obj, UNPROVIDED))) && (NIL != formula_arityE(obj, TWO_INTEGER, UNPROVIDED))) && (NIL != collection_defns.decimal_fractionP(obj, UNPROVIDED)));
    }

    public static SubLObject cb_fraction_to_optimize_for_displayP(final SubLObject cons) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean(
		(((((NIL != $cb_display_fractions_as_fractionsP$.getDynamicValue(thread)) && (NIL == $cb_ke_text_mode$.getDynamicValue(thread))) && (NIL != kb_control_vars.fraction_kb_loaded_p())) && (NIL != collection_defns.fractionP(cons, UNPROVIDED))) && (NIL != groundP(cons, UNPROVIDED)))
			&& (NIL == collection_defns.decimal_fractionP(cons, UNPROVIDED)));
    }

    public static SubLObject cb_show_fraction_optimized_for_display(final SubLObject fraction, final SubLObject depth, final SubLObject wrap_axiomsP) {
	final SubLObject linktext = optimized_html_for_fraction(fraction);
	cb_link_naut(fraction, linktext, UNPROVIDED);
	return fraction;
    }

    public static SubLObject optimized_html_for_fraction(final SubLObject fraction) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject linktext = NIL;
	SubLObject stream = NIL;
	try {
	    stream = make_private_string_output_stream();
	    final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
	    try {
		html_macros.$html_stream$.bind(stream, thread);
		html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		if (NIL != collection_defns.mixed_fractionP(fraction, UNPROVIDED)) {
		    html_princ(cycl_utilities.nat_arg1(fraction, UNPROVIDED));
		    html_glyph($THIN_SPACE, UNPROVIDED);
		} else if (NIL != collection_defns.negative_mixed_fractionP(fraction, UNPROVIDED)) {
		    html_glyph($MINUS, UNPROVIDED);
		    html_princ(cycl_utilities.nat_arg1(fraction, UNPROVIDED));
		    html_glyph($THIN_SPACE, UNPROVIDED);
		}

		html_markup(html_macros.$html_superscript_head$.getGlobalValue());
		html_princ(removal_modules_fractions.el_fraction_numerator(fraction, UNPROVIDED));
		html_markup(html_macros.$html_superscript_tail$.getGlobalValue());
		html_glyph($FRASL, UNPROVIDED);
		html_markup(html_macros.$html_subscript_head$.getGlobalValue());
		html_princ(removal_modules_fractions.el_fraction_denominator(fraction, UNPROVIDED));
		html_markup(html_macros.$html_subscript_tail$.getGlobalValue());
		html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
	    } finally {
		html_macros.$html_stream$.rebind(_prev_bind_0, thread);
	    }
	    linktext = get_output_stream_string(stream);
	} finally {
	    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values = getValuesAsVector();
		close(stream, UNPROVIDED);
		restoreValuesFromVector(_values);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
	    }
	}
	return linktext;
    }

    public static SubLObject cb_hl_support_to_displayP(final SubLObject cons) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean((NIL == $cb_inside_quoteP$.getDynamicValue(thread)) && (NIL != arguments.hl_support_p(cons)));
    }

    public static SubLObject cb_show_hl_support_for_cons_method(final SubLObject hl_support, final SubLObject depth, final SubLObject wrap_axiomsP) {
	return cb_show_hl_support_readably(hl_support, UNPROVIDED);
    }

    public static final SubLObject cb_unimplemented_alt(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject datum = args;
		SubLObject current = datum;
		SubLObject arg = NIL;
		destructuring_bind_must_consp(current, datum, $list_alt247);
		arg = current.first();
		current = current.rest();
		if (NIL == current) {
		    html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_source_readability_terpri(UNPROVIDED);
		    html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_princ($$$Unimplemented_Link);
		    html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
			{
			    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			    try {
				html_macros.$html_inside_bodyP$.bind(T, thread);
				html_markup(html_macros.$html_body_head$.getGlobalValue());
				if (NIL != color_value) {
				    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				    html_char(CHAR_quotation, UNPROVIDED);
				    html_markup(html_color(color_value));
				    html_char(CHAR_quotation, UNPROVIDED);
				}
				html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_heading_head$.getGlobalValue());
					html_markup(TWO_INTEGER);
					html_char(CHAR_greater, UNPROVIDED);
					html_princ($$$Unimplemented_Link);
					html_markup(html_macros.$html_heading_tail$.getGlobalValue());
					html_markup(TWO_INTEGER);
					html_char(CHAR_greater, UNPROVIDED);
					html_princ($str_alt249$The_page_for_);
					html_princ_strong(arg);
					html_princ($str_alt250$_has_not_yet_been_implemented_);
					html_source_readability_terpri(UNPROVIDED);
					html_copyright_notice();
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
				    }
				}
				html_markup(html_macros.$html_body_tail$.getGlobalValue());
				html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		    html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_source_readability_terpri(UNPROVIDED);
		} else {
		    cdestructuring_bind_error(datum, $list_alt247);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_unimplemented(final SubLObject args) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject arg = NIL;
	destructuring_bind_must_consp(args, args, $list332);
	arg = args.first();
	final SubLObject current = args.rest();
	if (NIL == current) {
	    html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
	    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
		html_source_readability_terpri(UNPROVIDED);
		html_markup($str2$_meta_http_equiv__X_UA_Compatible);
	    }
	    html_source_readability_terpri(UNPROVIDED);
	    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
	    try {
		cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
		html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_source_readability_terpri(UNPROVIDED);
		html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_princ($$$Unimplemented_Link);
		html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
		final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
		final SubLObject _prev_bind_0_$41 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		try {
		    html_macros.$html_inside_bodyP$.bind(T, thread);
		    html_markup(html_macros.$html_body_head$.getGlobalValue());
		    if (NIL != color_value) {
			html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_color(color_value));
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_markup(html_macros.$html_heading_head$.getGlobalValue());
			html_markup(TWO_INTEGER);
			html_char(CHAR_greater, UNPROVIDED);
			html_princ($$$Unimplemented_Link);
			html_markup(html_macros.$html_heading_tail$.getGlobalValue());
			html_markup(TWO_INTEGER);
			html_char(CHAR_greater, UNPROVIDED);
			html_princ($$$The_page_for_);
			html_princ_strong(arg);
			html_princ($str335$_has_not_yet_been_implemented_);
			html_source_readability_terpri(UNPROVIDED);
			html_copyright_notice();
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
		    }
		    html_markup(html_macros.$html_body_tail$.getGlobalValue());
		    html_source_readability_terpri(UNPROVIDED);
		} finally {
		    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$41, thread);
		}
		html_markup(html_macros.$html_html_tail$.getGlobalValue());
	    } finally {
		cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
	    }
	    html_source_readability_terpri(UNPROVIDED);
	} else {
	    cdestructuring_bind_error(args, $list332);
	}
	return NIL;
    }

    public static final SubLObject cb_link_unimplemented_alt(SubLObject linktext) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(linktext, STRINGP);
	    {
		SubLObject frame_name_var = cb_frame_name($SELF);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt252$cb_unimplemented__A, web_utilities.html_url_encode(linktext, UNPROVIDED));
		html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != frame_name_var) {
		    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_markup(frame_name_var);
		    html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(linktext);
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_link_unimplemented(final SubLObject linktext) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != stringp(linktext) : "! stringp(linktext) " + ("Types.stringp(linktext) " + "CommonSymbols.NIL != Types.stringp(linktext) ") + linktext;
	final SubLObject frame_name_var = cb_frame_name($SELF);
	html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	cyc_cgi_url_int();
	format(html_macros.$html_stream$.getDynamicValue(thread), $str338$cb_unimplemented__A, web_utilities.html_url_encode(linktext, UNPROVIDED));
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

    public static final SubLObject cb_form_item_list_alt(SubLObject list) {
	{
	    SubLObject pcase_var = length(list);
	    if (pcase_var.eql(ZERO_INTEGER)) {
	    } else {
		if (pcase_var.eql(ONE_INTEGER)) {
		    cb_form(list.first(), UNPROVIDED, UNPROVIDED);
		} else {
		    if (pcase_var.eql(TWO_INTEGER)) {
			cb_form(list.first(), UNPROVIDED, UNPROVIDED);
			html_princ($str_alt255$_and_);
			cb_form(second(list), UNPROVIDED, UNPROVIDED);
		    } else {
			{
			    SubLObject last = list_utilities.last_one(list);
			    SubLObject butlast = butlast(list, UNPROVIDED);
			    SubLObject cdolist_list_var = butlast;
			    SubLObject item = NIL;
			    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
				cb_form(item, UNPROVIDED, UNPROVIDED);
				html_princ($str_alt181$__);
			    }
			    html_princ($str_alt256$and_);
			    cb_form(last, UNPROVIDED, UNPROVIDED);
			}
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject cb_form_item_list(final SubLObject list) {
	final SubLObject pcase_var = length(list);
	if (!pcase_var.eql(ZERO_INTEGER)) {
	    if (pcase_var.eql(ONE_INTEGER)) {
		cb_form(list.first(), UNPROVIDED, UNPROVIDED);
	    } else if (pcase_var.eql(TWO_INTEGER)) {
		cb_form(list.first(), UNPROVIDED, UNPROVIDED);
		html_princ($$$_and_);
		cb_form(second(list), UNPROVIDED, UNPROVIDED);
	    } else {
		final SubLObject last = list_utilities.last_one(list);
		SubLObject cdolist_list_var;
		final SubLObject butlast = cdolist_list_var = butlast(list, UNPROVIDED);
		SubLObject item = NIL;
		item = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    cb_form(item, UNPROVIDED, UNPROVIDED);
		    html_princ($str217$__);
		    cdolist_list_var = cdolist_list_var.rest();
		    item = cdolist_list_var.first();
		}
		html_princ($$$and_);
		cb_form(last, UNPROVIDED, UNPROVIDED);
	    }

	}
	return NIL;
    }

    public static final SubLObject cb_show_assertion_in_nl_alt(SubLObject assertion) {
	{
	    SubLObject domain_mt = assertion_mt(assertion);
	    cb_show_in_nl_int(assertion, domain_mt, HTML_GENERATE_TEXT);
	}
	return NIL;
    }

    public static SubLObject cb_show_assertion_in_nl(final SubLObject assertion) {
	final SubLObject domain_mt = assertions_high.assertion_mt(assertion);
	cb_show_in_nl_int(assertion, domain_mt, HTML_GENERATE_TEXT);
	return NIL;
    }

    public static final SubLObject cb_show_sentence_in_nl_alt(SubLObject sentence, SubLObject domain_mt) {
	if (domain_mt == UNPROVIDED) {
	    domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	cb_show_in_nl_int(sentence, domain_mt, HTML_GENERATE_TEXT);
	return NIL;
    }

    public static SubLObject cb_show_sentence_in_nl(final SubLObject sentence, SubLObject domain_mt) {
	if (domain_mt == UNPROVIDED) {
	    domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	cb_show_in_nl_int(sentence, domain_mt, HTML_GENERATE_TEXT);
	return NIL;
    }

    public static final SubLObject cb_show_question_in_nl_alt(SubLObject sentence, SubLObject domain_mt) {
	if (domain_mt == UNPROVIDED) {
	    domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	cb_show_in_nl_int(sentence, domain_mt, HTML_GENERATE_QUESTION);
	return NIL;
    }

    public static SubLObject cb_show_question_in_nl(final SubLObject sentence, SubLObject domain_mt) {
	if (domain_mt == UNPROVIDED) {
	    domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	cb_show_in_nl_int(sentence, domain_mt, HTML_GENERATE_QUESTION);
	return NIL;
    }

    public static final SubLObject cb_show_term_in_nl_alt(SubLObject v_term, SubLObject domain_mt) {
	if (domain_mt == UNPROVIDED) {
	    domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	cb_show_in_nl_int(v_term, domain_mt, HTML_GENERATE_PHRASE);
	return NIL;
    }

    public static SubLObject cb_show_term_in_nl(final SubLObject v_term, SubLObject domain_mt) {
	if (domain_mt == UNPROVIDED) {
	    domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
	}
	cb_show_in_nl_int(v_term, domain_mt, HTML_GENERATE_PHRASE);
	return NIL;
    }

    public static final SubLObject cb_show_in_nl_int_alt(SubLObject obj, SubLObject domain_mt, SubLObject paraphrase_fn) {
	html_markup(cb_html_for_obj_in_nl(obj, domain_mt, paraphrase_fn, UNPROVIDED));
	return NIL;
    }

    public static SubLObject cb_show_in_nl_int(final SubLObject obj, final SubLObject domain_mt, final SubLObject paraphrase_fn) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject old_grace_period = delayed_processor.delayed_processor_get_delay_seconds(pph_phrase.pph_phrase_destroyer());
	pph_phrase.set_pph_phrase_destruction_grace_period(max(old_grace_period, $int$300));
	final SubLObject _prev_bind_0 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
	try {
	    pph_vars.$bypass_pph_phrase_destroyerP$.bind(NIL, thread);
	    thread.resetMultipleValues();
	    final SubLObject html = cb_html_for_obj_in_nl(obj, domain_mt, paraphrase_fn, UNPROVIDED);
	    final SubLObject v_pph_phrase = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    if ((NIL != v_pph_phrase) && (NIL != $generated_phrases_browsableP$.getDynamicValue(thread))) {
		cb_form(v_pph_phrase, UNPROVIDED, UNPROVIDED);
	    } else {
		html_markup(html);
	    }
	} finally {
	    pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_0, thread);
	}
	pph_phrase.set_pph_phrase_destruction_grace_period(old_grace_period);
	return NIL;
    }

    public static final SubLObject cb_html_for_obj_in_nl_alt(SubLObject obj, SubLObject domain_mt, SubLObject paraphrase_fn, SubLObject addressee) {
	if (addressee == UNPROVIDED) {
	    addressee = operation_communication.the_cyclist();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject paraphrase = NIL;
		{
		    SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
		    try {
			pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
			{
			    SubLObject target = cb_frame_name($MAIN);
			    {
				SubLObject _prev_bind_0_18 = pph_vars.$constant_link_function$.currentBinding(thread);
				SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
				try {
				    pph_vars.$constant_link_function$.bind(true ? ((SubLObject) (CB_CF)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
				    pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
				    if (NIL != $assume_cyc_cyclist_dialogP$.getDynamicValue(thread)) {
					{
					    SubLObject _prev_bind_0_19 = pph_vars.$pph_speaker$.currentBinding(thread);
					    SubLObject _prev_bind_1_20 = pph_vars.$pph_addressee$.currentBinding(thread);
					    try {
						pph_vars.$pph_speaker$.bind($$Cyc, thread);
						pph_vars.$pph_addressee$.bind(addressee, thread);
						paraphrase = funcall(paraphrase_fn, obj);
					    } finally {
						pph_vars.$pph_addressee$.rebind(_prev_bind_1_20, thread);
						pph_vars.$pph_speaker$.rebind(_prev_bind_0_19, thread);
					    }
					}
				    } else {
					paraphrase = funcall(paraphrase_fn, obj);
				    }
				} finally {
				    pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
				    pph_vars.$constant_link_function$.rebind(_prev_bind_0_18, thread);
				}
			    }
			}
		    } finally {
			pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
		    }
		}
		return paraphrase;
	    }
	}
    }

    public static SubLObject cb_html_for_obj_in_nl(final SubLObject obj, final SubLObject domain_mt, final SubLObject paraphrase_fn, SubLObject addressee) {
	if (addressee == UNPROVIDED) {
	    addressee = operation_communication.the_cyclist();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject paraphrase = NIL;
	SubLObject v_pph_phrase = NIL;
	final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
	try {
	    pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
	    final SubLObject target = cb_frame_name($MAIN);
	    final SubLObject _prev_bind_0_$43 = pph_vars.$constant_link_function$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
	    try {
		pph_vars.$constant_link_function$.bind(CB_CF, thread);
		pph_vars.$html_generation_target$.bind(NIL != target ? target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
		if (NIL != $assume_cyc_cyclist_dialogP$.getDynamicValue(thread)) {
		    final SubLObject _prev_bind_0_$44 = pph_vars.$pph_speaker$.currentBinding(thread);
		    final SubLObject _prev_bind_1_$45 = pph_vars.$pph_addressee$.currentBinding(thread);
		    try {
			pph_vars.$pph_speaker$.bind($$Cyc, thread);
			pph_vars.$pph_addressee$.bind(addressee, thread);
			thread.resetMultipleValues();
			final SubLObject paraphrase_$46 = cb_html_for_obj_in_nl_values(paraphrase_fn, obj);
			final SubLObject v_pph_phrase_$47 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			paraphrase = paraphrase_$46;
			v_pph_phrase = v_pph_phrase_$47;
		    } finally {
			pph_vars.$pph_addressee$.rebind(_prev_bind_1_$45, thread);
			pph_vars.$pph_speaker$.rebind(_prev_bind_0_$44, thread);
		    }
		} else {
		    thread.resetMultipleValues();
		    final SubLObject paraphrase_$47 = cb_html_for_obj_in_nl_values(paraphrase_fn, obj);
		    final SubLObject v_pph_phrase_$48 = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    paraphrase = paraphrase_$47;
		    v_pph_phrase = v_pph_phrase_$48;
		}
	    } finally {
		pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
		pph_vars.$constant_link_function$.rebind(_prev_bind_0_$43, thread);
	    }
	} finally {
	    pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
	}
	return values(paraphrase, v_pph_phrase);
    }

    public static SubLObject cb_html_for_obj_in_nl_values(final SubLObject paraphrase_fn, final SubLObject obj) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
	try {
	    pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
	    thread.resetMultipleValues();
	    final SubLObject ret_string = funcall(paraphrase_fn, obj);
	    final SubLObject pred = thread.secondMultipleValue();
	    final SubLObject justifications = thread.thirdMultipleValue();
	    final SubLObject output_list = thread.fourthMultipleValue();
	    final SubLObject demerits = thread.fifthMultipleValue();
	    final SubLObject v_pph_phrase = thread.sixthMultipleValue();
	    thread.resetMultipleValues();
	    return values(ret_string, v_pph_phrase);
	} finally {
	    pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
	}
    }

    public static SubLObject cb_show_term(final SubLObject v_term, SubLObject depth, SubLObject wrap_axiomsP) {
	if (depth == UNPROVIDED) {
	    depth = ZERO_INTEGER;
	}
	if (wrap_axiomsP == UNPROVIDED) {
	    wrap_axiomsP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ($NL == $cb_major_presentation_language$.getDynamicValue(thread)) {
	    return cb_show_term_in_nl(v_term, UNPROVIDED);
	}
	return cb_form(v_term, depth, wrap_axiomsP);
    }

    /**
     * Verbosely show assertion by itself in a readable fashion
     */
    @LispMethod(comment = "Verbosely show assertion by itself in a readable fashion")
    public static final SubLObject cb_show_assertion_readably_alt(SubLObject assertion, SubLObject wrap, SubLObject include_mtP) {
	if (wrap == UNPROVIDED) {
	    wrap = $cb_c_wrap_assertions$.getDynamicValue();
	}
	if (include_mtP == UNPROVIDED) {
	    include_mtP = T;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $show_assertions_in_english$.getDynamicValue(thread)) {
		cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		cb_show_assertion_in_nl(assertion);
	    } else {
		if (NIL != wrap) {
		    cb_form(assertion, ZERO_INTEGER, T);
		    if (NIL != include_mtP) {
			{
			    SubLObject mt = assertion_mt(assertion);
			    if (NIL == constant_p(mt)) {
				html_newline(UNPROVIDED);
			    }
			    html_princ($str_alt261$_in_);
			    if (NIL != constant_p(mt)) {
				cb_form(mt, UNPROVIDED, UNPROVIDED);
			    } else {
				html_markup(html_macros.$html_small_head$.getGlobalValue());
				cb_form(mt, UNPROVIDED, UNPROVIDED);
				html_markup(html_macros.$html_small_tail$.getGlobalValue());
			    }
			}
		    }
		} else {
		    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		    cb_form(assertion, ZERO_INTEGER, NIL);
		    if (NIL != include_mtP) {
			html_princ($str_alt261$_in_);
			cb_form(assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
		    }
		    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		}
	    }
	    return assertion;
	}
    }

    /**
     * Verbosely show assertion by itself in a readable fashion
     */
    @LispMethod(comment = "Verbosely show assertion by itself in a readable fashion")
    public static SubLObject cb_show_assertion_readably(final SubLObject assertion, SubLObject wrap, SubLObject include_mtP) {
	if (wrap == UNPROVIDED) {
	    wrap = $cb_c_wrap_assertions$.getDynamicValue();
	}
	if (include_mtP == UNPROVIDED) {
	    include_mtP = T;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ($NL == $cb_major_presentation_language$.getDynamicValue(thread)) {
	    cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    cb_show_assertion_in_nl(assertion);
	} else if ((NIL != wrap) && ($CYCL == $cb_major_presentation_language$.getDynamicValue(thread))) {
	    html_markup(html_macros.$html_span_head$.getGlobalValue());
	    if (NIL != cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread)) {
		html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread));
		html_char(CHAR_quotation, UNPROVIDED);
	    }
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
		    html_princ($str350$f__);
		}
		cb_form(assertion, ZERO_INTEGER, T);
		if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
		    html_princ($str351$__);
		}
		if (NIL != include_mtP) {
		    final SubLObject mt = assertions_high.assertion_mt(assertion);
		    if (NIL == constant_p(mt)) {
			html_newline(UNPROVIDED);
		    }
		    if (NIL != $cb_ke_text_mode$.getDynamicValue(thread)) {
			html_princ($str352$___);
		    }
		    html_princ($$$_in_);
		    html_markup(html_macros.$html_bold_head$.getGlobalValue());
		    if (NIL != constant_p(mt)) {
			cb_form(mt, UNPROVIDED, UNPROVIDED);
		    } else {
			html_markup(html_macros.$html_small_head$.getGlobalValue());
			cb_form(mt, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_small_tail$.getGlobalValue());
		    }
		    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
		}
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	    }
	    html_markup(html_macros.$html_span_tail$.getGlobalValue());
	} else {
	    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
	    html_markup(html_macros.$html_span_head$.getGlobalValue());
	    if (NIL != cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread)) {
		html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread));
		html_char(CHAR_quotation, UNPROVIDED);
	    }
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		cb_form(assertion, ZERO_INTEGER, NIL);
		if (NIL != include_mtP) {
		    html_princ($$$_in_);
		    html_markup(html_macros.$html_bold_head$.getGlobalValue());
		    cb_form(assertions_high.assertion_mt(assertion), UNPROVIDED, UNPROVIDED);
		    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
		}
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	    }
	    html_markup(html_macros.$html_span_tail$.getGlobalValue());
	    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
	}

	return assertion;
    }

    public static final SubLObject when_filtered_assertion_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject assertion = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt262);
	    assertion = current.first();
	    current = current.rest();
	    {
		SubLObject body = current;
		return listS(PWHEN, list(COR, $list_alt265, list(FUNCALL, $assertion_filter_hook$, assertion)), append(body, NIL));
	    }
	}
    }

    public static SubLObject when_filtered_assertion(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject assertion = NIL;
	destructuring_bind_must_consp(current, datum, $list354);
	assertion = current.first();
	final SubLObject body;
	current = body = current.rest();
	return listS(PWHEN, list(COR, $list357, list(FUNCALL, $assertion_filter_hook$, assertion)), append(body, NIL));
    }

    public static final SubLObject without_assertion_filters_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject body = current;
	    return list(CLET, $list_alt268, bq_cons(PROGN, append(body, NIL)));
	}
    }

    public static SubLObject without_assertion_filters(final SubLObject macroform, final SubLObject environment) {
	final SubLObject datum = macroform.rest();
	final SubLObject body;
	final SubLObject current = body = datum;
	return list(CLET, $list360, bq_cons(PROGN, append(body, NIL)));
    }

    public static final SubLObject cb_assertion_link_alt(SubLObject assertion, SubLObject wrap) {
	if (wrap == UNPROVIDED) {
	    wrap = $cb_c_wrap_assertions$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
		cb_show_assertion_readably(assertion, wrap, NIL);
		html_newline(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_assertion_link(final SubLObject assertion, SubLObject wrap) {
	if (wrap == UNPROVIDED) {
	    wrap = $cb_c_wrap_assertions$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
	    cb_show_assertion_readably(assertion, wrap, NIL);
	    html_newline(UNPROVIDED);
	}
	return NIL;
    }

    public static final SubLObject cb_assertion_link_with_mt_alt(SubLObject assertion, SubLObject wrap) {
	if (wrap == UNPROVIDED) {
	    wrap = $cb_c_wrap_assertions$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
		cb_show_assertion_readably(assertion, wrap, T);
	    }
	    html_newline(UNPROVIDED);
	    return NIL;
	}
    }

    public static SubLObject cb_assertion_link_with_mt(final SubLObject assertion, SubLObject wrap) {
	if (wrap == UNPROVIDED) {
	    wrap = $cb_c_wrap_assertions$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
	    cb_show_assertion_readably(assertion, wrap, T);
	}
	html_newline(UNPROVIDED);
	return NIL;
    }

    public static final SubLObject cb_assertion_link_binary_alt(SubLObject assertion, SubLObject show_negatedP) {
	if (show_negatedP == UNPROVIDED) {
	    show_negatedP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
		if ((NIL == show_negatedP) && ($FALSE == assertion_truth(assertion))) {
		    return cb_browser.cb_c_gaf_arg_rec_arg_pred_mt_binary_note_negated(assertion);
		}
		{
		    SubLObject arg2 = gaf_arg2(assertion);
		    SubLObject depth = ZERO_INTEGER;
		    SubLObject wrapP = NIL;
		    SubLObject newlineP = NIL;
		    if (NIL != constant_p(arg2)) {
			wrapP = NIL;
		    } else {
			if (NIL != nart_handles.nart_p(arg2)) {
			    wrapP = T;
			} else {
			    if (NIL != assertion_handles.assertion_p(arg2)) {
				wrapP = T;
				newlineP = T;
			    } else {
				if (arg2.isString() && length(arg2).numG($int$40)) {
				    wrapP = $cb_c_wrap_assertions$.getDynamicValue(thread);
				} else {
				    if (arg2.isAtom()) {
					wrapP = NIL;
				    } else {
					wrapP = $cb_c_wrap_assertions$.getDynamicValue(thread);
					newlineP = T;
				    }
				}
			    }
			}
		    }
		    if (NIL != wrapP) {
			cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			cb_form(arg2, depth, wrapP);
		    } else {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			cb_form(arg2, depth, wrapP);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		    }
		    if (NIL != newlineP) {
			html_newline(UNPROVIDED);
		    }
		    html_indent(ONE_INTEGER);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_assertion_link_binary(final SubLObject assertion, SubLObject show_negatedP) {
	if (show_negatedP == UNPROVIDED) {
	    show_negatedP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
	    if ((NIL == show_negatedP) && ($FALSE == assertions_high.assertion_truth(assertion))) {
		return cb_browser.cb_c_gaf_arg_rec_arg_pred_mt_binary_note_negated(assertion);
	    }
	    final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
	    final SubLObject depth = ZERO_INTEGER;
	    SubLObject wrapP = NIL;
	    SubLObject newlineP = NIL;
	    if (NIL != constant_p(arg2)) {
		wrapP = NIL;
	    } else if (NIL != nart_handles.nart_p(arg2)) {
		wrapP = T;
	    } else if (NIL != assertion_handles.assertion_p(arg2)) {
		wrapP = T;
		newlineP = T;
	    } else if (arg2.isString() && length(arg2).numG($int$40)) {
		wrapP = $cb_c_wrap_assertions$.getDynamicValue(thread);
	    } else if (arg2.isAtom()) {
		wrapP = NIL;
	    } else {
		wrapP = $cb_c_wrap_assertions$.getDynamicValue(thread);
		newlineP = T;
	    }

	    if (NIL != wrapP) {
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue(thread)) {
		    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_markup(cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue(thread));
		    html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    cb_show_term(arg2, depth, wrapP);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
	    } else {
		html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		html_markup(html_macros.$html_span_head$.getGlobalValue());
		if (NIL != cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue(thread)) {
		    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_markup(cb_html_parameters.$cb_html_assertion_sentence_class$.getDynamicValue(thread));
		    html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    cb_show_term(arg2, depth, wrapP);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
		html_markup(html_macros.$html_span_tail$.getGlobalValue());
		html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
	    }
	    if (NIL != newlineP) {
		html_newline(UNPROVIDED);
	    }
	    html_indent(ONE_INTEGER);
	}
	return NIL;
    }

    /**
     * Verbosely show support by itself in a readable fashion
     */
    @LispMethod(comment = "Verbosely show support by itself in a readable fashion")
    public static final SubLObject cb_show_hl_support_readably_alt(SubLObject support, SubLObject validation_level) {
	if (validation_level == UNPROVIDED) {
	    validation_level = $NONE;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject module = support_module(support);
		SubLObject formula = support_formula(support);
		SubLObject mt = support_mt(support);
		if (NIL != $show_assertions_in_english$.getDynamicValue(thread)) {
		    cb_show_hl_support_formula_readably(formula);
		    html_princ($str_alt272$__claimed_by_);
		    html_markup(html_macros.$html_strong_head$.getGlobalValue());
		    html_markup(html_macros.$html_teletype_head$.getGlobalValue());
		    cb_link($HL_SUPPORT, support, validation_level, module, UNPROVIDED, UNPROVIDED);
		    html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
		    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		    html_princ($str_alt274$_module_);
		} else {
		    html_markup(html_macros.$html_table_head$.getGlobalValue());
		    if (true) {
			html_markup(html_macros.$html_table_border$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    if (true) {
			html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    if (true) {
			html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(ZERO_INTEGER);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    if (true) {
					html_markup(html_macros.$html_table_data_align$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($LEFT));
					html_char(CHAR_quotation, UNPROVIDED);
				    }
				    if (true) {
					html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($TOP));
					html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_markup(html_macros.$html_strong_head$.getGlobalValue());
					    cb_link($HL_SUPPORT, support, validation_level, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
					}
				    }
				    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_glyph($NBSP, UNPROVIDED);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
					}
				    }
				    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    if (true) {
					html_markup(html_macros.$html_table_data_align$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($LEFT));
					html_char(CHAR_quotation, UNPROVIDED);
				    }
				    if (true) {
					html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(html_align($TOP));
					html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    cb_form(formula, ZERO_INTEGER, T);
					    if (NIL == constant_p(mt)) {
						html_newline(UNPROVIDED);
					    }
					    html_princ($str_alt261$_in_);
					    if (NIL != constant_p(mt)) {
						cb_form(mt, UNPROVIDED, UNPROVIDED);
					    } else {
						html_markup(html_macros.$html_small_head$.getGlobalValue());
						cb_form(mt, UNPROVIDED, UNPROVIDED);
						html_markup(html_macros.$html_small_tail$.getGlobalValue());
					    }
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
					}
				    }
				    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
				}
			    }
			    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			    html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_markup(html_macros.$html_table_tail$.getGlobalValue());
		}
	    }
	    return support;
	}
    }

    /**
     * Verbosely show support by itself in a readable fashion
     */
    @LispMethod(comment = "Verbosely show support by itself in a readable fashion")
    public static SubLObject cb_show_hl_support_readably(final SubLObject support, SubLObject validation_level) {
	if (validation_level == UNPROVIDED) {
	    validation_level = $NONE;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject module = arguments.support_module(support);
	final SubLObject formula = arguments.support_formula(support);
	final SubLObject mt = arguments.support_mt(support);
	if ($NL == $cb_major_presentation_language$.getDynamicValue(thread)) {
	    cb_show_hl_support_formula_readably(formula);
	    html_princ($str364$__claimed_by_);
	    html_markup(html_macros.$html_strong_head$.getGlobalValue());
	    html_markup(html_macros.$html_teletype_head$.getGlobalValue());
	    cb_link($HL_SUPPORT, support, validation_level, module, UNPROVIDED, UNPROVIDED);
	    html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
	    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
	    html_princ($str366$_module_);
	} else {
	    html_markup(html_macros.$html_table_head$.getGlobalValue());
	    html_markup(html_macros.$html_table_border$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(ZERO_INTEGER);
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(ZERO_INTEGER);
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(ZERO_INTEGER);
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
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
			html_markup(html_macros.$html_strong_head$.getGlobalValue());
			cb_link($HL_SUPPORT, support, validation_level, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
		    }
		    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
		    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
		    html_char(CHAR_greater, UNPROVIDED);
		    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_glyph($NBSP, UNPROVIDED);
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
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
		    final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			cb_form(formula, ZERO_INTEGER, T);
			if (NIL == constant_p(mt)) {
			    html_newline(UNPROVIDED);
			}
			html_princ($$$_in_);
			if (NIL != constant_p(mt)) {
			    cb_form(mt, UNPROVIDED, UNPROVIDED);
			} else {
			    html_markup(html_macros.$html_small_head$.getGlobalValue());
			    cb_form(mt, UNPROVIDED, UNPROVIDED);
			    html_markup(html_macros.$html_small_tail$.getGlobalValue());
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
		    }
		    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
		}
		html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
		html_source_readability_terpri(UNPROVIDED);
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	    }
	    html_markup(html_macros.$html_table_tail$.getGlobalValue());
	}
	return support;
    }

    public static final SubLObject cb_show_hl_support_formula_readably_alt(SubLObject formula) {
	return cb_show_sentence_in_nl(formula, UNPROVIDED);
    }

    public static SubLObject cb_show_hl_support_formula_readably(final SubLObject formula) {
	return cb_show_sentence_in_nl(formula, UNPROVIDED);
    }

    /**
     * Verbosely show EL form of assertion by itself in a readable fashion.
     */
    @LispMethod(comment = "Verbosely show EL form of assertion by itself in a readable fashion.")
    public static final SubLObject cb_show_el_assertion_readably_alt(SubLObject assertion, SubLObject wrap, SubLObject include_mtP, SubLObject check_for_redundant_el_formulasP) {
	if (wrap == UNPROVIDED) {
	    wrap = $cb_c_wrap_assertions$.getDynamicValue();
	}
	if (include_mtP == UNPROVIDED) {
	    include_mtP = T;
	}
	if (check_for_redundant_el_formulasP == UNPROVIDED) {
	    check_for_redundant_el_formulasP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $show_assertions_in_english$.getDynamicValue(thread)) {
		cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		cb_show_assertion_in_nl(assertion);
		return assertion;
	    }
	    {
		SubLObject mt = assertion_mt(assertion);
		SubLObject hl_formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
		SubLObject formula = NIL;
		SubLObject already_shownP = NIL;
		thread.resetMultipleValues();
		{
		    SubLObject el_formula = cb_assertion_el_formula(assertion, hl_formula);
		    SubLObject el_mt = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if (fi.assertion_expand(narts_high.nart_expand(el_formula)).equal(fi.assertion_expand(narts_high.nart_expand(hl_formula)))) {
			formula = hl_formula;
		    } else {
			if (((NIL != check_for_redundant_el_formulasP) && el_formula.equal($cb_show_el_assertion_readably_last_formula$.getDynamicValue(thread))) && ((NIL == include_mtP) || (NIL != hlmt.hlmt_equal(mt, $cb_show_el_assertion_readably_last_mt$.getDynamicValue(thread))))) {
			    already_shownP = T;
			} else {
			    if ((NIL != hlmt.hlmt_equalP(mt, el_mt)) || (NIL != include_mtP)) {
				formula = el_formula;
			    } else {
				formula = make_ist_sentence(el_mt, el_formula);
			    }
			}
		    }
		    if (NIL != check_for_redundant_el_formulasP) {
			if (NIL == already_shownP) {
			    $cb_show_el_assertion_readably_last_formula$.setDynamicValue(formula, thread);
			    if (NIL != include_mtP) {
				$cb_show_el_assertion_readably_last_mt$.setDynamicValue(mt, thread);
			    }
			}
		    }
		    if (NIL != already_shownP) {
			cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			if (NIL != include_mtP) {
			    html_princ($str_alt277$EL_Formula___Mt_Identical_to_Asse);
			} else {
			    html_princ($str_alt278$EL_Formula_Identical_to_Assertion);
			}
		    } else {
			if (NIL != wrap) {
			    cb_form_assertion_formula(assertion, formula, ZERO_INTEGER, T);
			    if (NIL != include_mtP) {
				html_princ($str_alt261$_in_);
				cb_form(el_mt, UNPROVIDED, UNPROVIDED);
			    }
			} else {
			    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			    cb_form_assertion_formula(assertion, formula, ZERO_INTEGER, NIL);
			    if (NIL != include_mtP) {
				html_princ($str_alt261$_in_);
				cb_form(el_mt, UNPROVIDED, UNPROVIDED);
			    }
			    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			}
		    }
		}
	    }
	    return assertion;
	}
    }

    /**
     * Verbosely show EL form of assertion by itself in a readable fashion.
     */
    @LispMethod(comment = "Verbosely show EL form of assertion by itself in a readable fashion.")
    public static SubLObject cb_show_el_assertion_readably(final SubLObject assertion, SubLObject wrap, SubLObject include_mtP, SubLObject check_for_redundant_el_formulasP) {
	if (wrap == UNPROVIDED) {
	    wrap = $cb_c_wrap_assertions$.getDynamicValue();
	}
	if (include_mtP == UNPROVIDED) {
	    include_mtP = T;
	}
	if (check_for_redundant_el_formulasP == UNPROVIDED) {
	    check_for_redundant_el_formulasP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ($NL == $cb_major_presentation_language$.getDynamicValue(thread)) {
	    cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    cb_show_assertion_in_nl(assertion);
	    return assertion;
	}
	final SubLObject mt = assertions_high.assertion_mt(assertion);
	final SubLObject hl_formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
	SubLObject formula = NIL;
	SubLObject already_shownP = NIL;
	thread.resetMultipleValues();
	final SubLObject el_formula = cb_assertion_el_formula(assertion, hl_formula);
	final SubLObject el_mt = thread.secondMultipleValue();
	thread.resetMultipleValues();
	if (fi.assertion_expand(narts_high.nart_expand(el_formula)).equal(fi.assertion_expand(narts_high.nart_expand(hl_formula)))) {
	    formula = hl_formula;
	} else if (((NIL != check_for_redundant_el_formulasP) && el_formula.equal($cb_show_el_assertion_readably_last_formula$.getDynamicValue(thread))) && ((NIL == include_mtP) || (NIL != hlmt.hlmt_equal(mt, $cb_show_el_assertion_readably_last_mt$.getDynamicValue(thread))))) {
	    already_shownP = T;
	} else if ((NIL != hlmt.hlmt_equalP(mt, el_mt)) || (NIL != include_mtP)) {
	    formula = el_formula;
	} else {
	    formula = make_ist_sentence(el_mt, el_formula);
	}

	if ((NIL != check_for_redundant_el_formulasP) && (NIL == already_shownP)) {
	    $cb_show_el_assertion_readably_last_formula$.setDynamicValue(formula, thread);
	    if (NIL != include_mtP) {
		$cb_show_el_assertion_readably_last_mt$.setDynamicValue(mt, thread);
	    }
	}
	if (NIL != already_shownP) {
	    cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (NIL != include_mtP) {
		html_princ($str372$EL_Formula___Mt_Identical_to_Asse);
	    } else {
		html_princ($str373$EL_Formula_Identical_to_Assertion);
	    }
	} else if (NIL != wrap) {
	    html_markup(html_macros.$html_span_head$.getGlobalValue());
	    if (NIL != cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread)) {
		html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread));
		html_char(CHAR_quotation, UNPROVIDED);
	    }
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		cb_form_assertion_formula(assertion, formula, ZERO_INTEGER, T, UNPROVIDED);
		if (NIL != include_mtP) {
		    html_princ($$$_in_);
		    cb_form(el_mt, UNPROVIDED, UNPROVIDED);
		}
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	    }
	    html_markup(html_macros.$html_span_tail$.getGlobalValue());
	} else {
	    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
	    html_markup(html_macros.$html_span_head$.getGlobalValue());
	    if (NIL != cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread)) {
		html_markup(html_macros.$html_attribute_class$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(cb_html_parameters.$cb_html_assertion_class$.getDynamicValue(thread));
		html_char(CHAR_quotation, UNPROVIDED);
	    }
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		cb_form_assertion_formula(assertion, formula, ZERO_INTEGER, NIL, UNPROVIDED);
		if (NIL != include_mtP) {
		    html_princ($$$_in_);
		    cb_form(el_mt, UNPROVIDED, UNPROVIDED);
		}
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	    }
	    html_markup(html_macros.$html_span_tail$.getGlobalValue());
	    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
	}

	return assertion;
    }

    /**
     * If the EL formula of ASSERTION has been cached in *cb-assertion-el-formula-cache*,
     * it is retrieved and returned; otherwise, the EL formula is calculated, cached in
     * cb-assertion-el-formula-cache* if different from the HL formula, and returned.
     */
    @LispMethod(comment = "If the EL formula of ASSERTION has been cached in *cb-assertion-el-formula-cache*,\r\nit is retrieved and returned; otherwise, the EL formula is calculated, cached in\r\ncb-assertion-el-formula-cache* if different from the HL formula, and returned.\nIf the EL formula of ASSERTION has been cached in *cb-assertion-el-formula-cache*,\nit is retrieved and returned; otherwise, the EL formula is calculated, cached in\ncb-assertion-el-formula-cache* if different from the HL formula, and returned.")
    public static final SubLObject cb_assertion_el_formula_alt(SubLObject assertion, SubLObject hl_formula) {
	if (hl_formula == UNPROVIDED) {
	    hl_formula = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(assertion, ASSERTION_P);
	    if (NIL == dictionary.dictionary_p($cb_assertion_el_formula_cache$.getDynamicValue(thread))) {
		$cb_assertion_el_formula_cache$.setDynamicValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
	    }
	    {
		SubLObject el_formula_mt_pair = dictionary.dictionary_lookup($cb_assertion_el_formula_cache$.getDynamicValue(thread), assertion, UNPROVIDED);
		SubLObject el_formula = el_formula_mt_pair.first();
		SubLObject el_mt = second(el_formula_mt_pair);
		if (NIL != el_formula) {
		    return values(el_formula, el_mt);
		} else {
		    thread.resetMultipleValues();
		    {
			SubLObject el_formula_25 = uncanonicalizer.assertion_el_formula(assertion);
			SubLObject el_mt_26 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			el_formula = el_formula_25;
			el_mt = el_mt_26;
		    }
		    if (NIL == hl_formula) {
			hl_formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
		    }
		    if (!el_formula.equal(hl_formula)) {
			dictionary.dictionary_enter($cb_assertion_el_formula_cache$.getDynamicValue(thread), assertion, list(el_formula, el_mt));
		    }
		    return values(el_formula, el_mt);
		}
	    }
	}
    }

    /**
     * If the EL formula of ASSERTION has been cached in *cb-assertion-el-formula-cache*,
     * it is retrieved and returned; otherwise, the EL formula is calculated, cached in
     * cb-assertion-el-formula-cache* if different from the HL formula, and returned.
     */
    @LispMethod(comment = "If the EL formula of ASSERTION has been cached in *cb-assertion-el-formula-cache*,\r\nit is retrieved and returned; otherwise, the EL formula is calculated, cached in\r\ncb-assertion-el-formula-cache* if different from the HL formula, and returned.\nIf the EL formula of ASSERTION has been cached in *cb-assertion-el-formula-cache*,\nit is retrieved and returned; otherwise, the EL formula is calculated, cached in\ncb-assertion-el-formula-cache* if different from the HL formula, and returned.")
    public static SubLObject cb_assertion_el_formula(final SubLObject assertion, SubLObject hl_formula) {
	if (hl_formula == UNPROVIDED) {
	    hl_formula = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
	if (NIL == dictionary.dictionary_p($cb_assertion_el_formula_cache$.getDynamicValue(thread))) {
	    $cb_assertion_el_formula_cache$.setDynamicValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
	}
	final SubLObject el_formula_mt_pair = dictionary.dictionary_lookup($cb_assertion_el_formula_cache$.getDynamicValue(thread), assertion, UNPROVIDED);
	SubLObject el_formula = el_formula_mt_pair.first();
	SubLObject el_mt = second(el_formula_mt_pair);
	if (NIL != el_formula) {
	    return values(el_formula, el_mt);
	}
	thread.resetMultipleValues();
	final SubLObject el_formula_$54 = uncanonicalizer.assertion_el_formula(assertion);
	final SubLObject el_mt_$55 = thread.secondMultipleValue();
	thread.resetMultipleValues();
	el_formula = el_formula_$54;
	el_mt = el_mt_$55;
	if (NIL == hl_formula) {
	    hl_formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
	}
	if (!el_formula.equal(hl_formula)) {
	    dictionary.dictionary_enter($cb_assertion_el_formula_cache$.getDynamicValue(thread), assertion, list(el_formula, el_mt));
	}
	return values(el_formula, el_mt);
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_a__a = makeString("~a?~a");

    static private final SubLString $str_alt2$_A = makeString("~A");

    static private final SubLString $str_alt5$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt6$yui_skin_sam = makeString("yui-skin-sam");

    /**
     * Displays link to browser page for ASSERTION, followed by the EL formula of ASSERTION or when
     * applicable a statement to the effect that an assertion with the same EL formula has been
     * displayed immediately previously, followed by a new-line.
     */
    @LispMethod(comment = "Displays link to browser page for ASSERTION, followed by the EL formula of ASSERTION or when\r\napplicable a statement to the effect that an assertion with the same EL formula has been\r\ndisplayed immediately previously, followed by a new-line.\nDisplays link to browser page for ASSERTION, followed by the EL formula of ASSERTION or when\napplicable a statement to the effect that an assertion with the same EL formula has been\ndisplayed immediately previously, followed by a new-line.")
    public static final SubLObject cb_el_assertion_link_checking_redundancy_alt(SubLObject assertion, SubLObject wrap) {
	if (wrap == UNPROVIDED) {
	    wrap = $cb_c_wrap_assertions$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
		cb_show_el_assertion_readably(assertion, wrap, NIL, T);
		html_newline(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    /**
     * Displays link to browser page for ASSERTION, followed by the EL formula of ASSERTION or when
     * applicable a statement to the effect that an assertion with the same EL formula has been
     * displayed immediately previously, followed by a new-line.
     */
    @LispMethod(comment = "Displays link to browser page for ASSERTION, followed by the EL formula of ASSERTION or when\r\napplicable a statement to the effect that an assertion with the same EL formula has been\r\ndisplayed immediately previously, followed by a new-line.\nDisplays link to browser page for ASSERTION, followed by the EL formula of ASSERTION or when\napplicable a statement to the effect that an assertion with the same EL formula has been\ndisplayed immediately previously, followed by a new-line.")
    public static SubLObject cb_el_assertion_link_checking_redundancy(final SubLObject assertion, SubLObject wrap) {
	if (wrap == UNPROVIDED) {
	    wrap = $cb_c_wrap_assertions$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
	    cb_show_el_assertion_readably(assertion, wrap, NIL, T);
	    html_newline(UNPROVIDED);
	}
	return NIL;
    }

    static private final SubLString $str_alt8$Back_to_previous__stale__page = makeString("Back to previous (stale) page");

    static private final SubLString $str_alt10$Back_to__stale__ = makeString("Back to (stale) ");

    static private final SubLString $str_alt11$_page = makeString(" page");

    /**
     * Displays link to browser page for ASSERTION, followed by the EL formula of ASSERTION or when
     * applicable a statement to the effect that an assertion with the same EL formula and mt has
     * been displayed immediately previously, followed by mt of ASSERTION, followed by a new-line.
     */
    @LispMethod(comment = "Displays link to browser page for ASSERTION, followed by the EL formula of ASSERTION or when\r\napplicable a statement to the effect that an assertion with the same EL formula and mt has\r\nbeen displayed immediately previously, followed by mt of ASSERTION, followed by a new-line.\nDisplays link to browser page for ASSERTION, followed by the EL formula of ASSERTION or when\napplicable a statement to the effect that an assertion with the same EL formula and mt has\nbeen displayed immediately previously, followed by mt of ASSERTION, followed by a new-line.")
    public static final SubLObject cb_el_assertion_link_with_mt_checking_redundancy_alt(SubLObject assertion, SubLObject wrap) {
	if (wrap == UNPROVIDED) {
	    wrap = $cb_c_wrap_assertions$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
		cb_show_el_assertion_readably(assertion, wrap, T, T);
		html_newline(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    /**
     * Displays link to browser page for ASSERTION, followed by the EL formula of ASSERTION or when
     * applicable a statement to the effect that an assertion with the same EL formula and mt has
     * been displayed immediately previously, followed by mt of ASSERTION, followed by a new-line.
     */
    @LispMethod(comment = "Displays link to browser page for ASSERTION, followed by the EL formula of ASSERTION or when\r\napplicable a statement to the effect that an assertion with the same EL formula and mt has\r\nbeen displayed immediately previously, followed by mt of ASSERTION, followed by a new-line.\nDisplays link to browser page for ASSERTION, followed by the EL formula of ASSERTION or when\napplicable a statement to the effect that an assertion with the same EL formula and mt has\nbeen displayed immediately previously, followed by mt of ASSERTION, followed by a new-line.")
    public static SubLObject cb_el_assertion_link_with_mt_checking_redundancy(final SubLObject assertion, SubLObject wrap) {
	if (wrap == UNPROVIDED) {
	    wrap = $cb_c_wrap_assertions$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
	    cb_show_el_assertion_readably(assertion, wrap, T, T);
	    html_newline(UNPROVIDED);
	}
	return NIL;
    }

    static private final SubLString $str_alt18$___ = makeString("???");

    /**
     * Displays link to browser page for gaf ASSERTION, followed by arg2 of ASSERTION.
     * When arg2 is an assertion, displays a link to its browser page, followed by its
     * EL formula or when applicable a statement to the effect that an assertion with the
     * same EL formula has been displayed immediately previously, followed by a new-line.
     */
    @LispMethod(comment = "Displays link to browser page for gaf ASSERTION, followed by arg2 of ASSERTION.\r\nWhen arg2 is an assertion, displays a link to its browser page, followed by its\r\nEL formula or when applicable a statement to the effect that an assertion with the\r\nsame EL formula has been displayed immediately previously, followed by a new-line.\nDisplays link to browser page for gaf ASSERTION, followed by arg2 of ASSERTION.\nWhen arg2 is an assertion, displays a link to its browser page, followed by its\nEL formula or when applicable a statement to the effect that an assertion with the\nsame EL formula has been displayed immediately previously, followed by a new-line.")
    public static final SubLObject cb_el_assertion_link_binary_checking_redundancy_alt(SubLObject assertion, SubLObject show_negatedP) {
	if (show_negatedP == UNPROVIDED) {
	    show_negatedP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
		cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		{
		    SubLObject arg2 = gaf_arg2(assertion);
		    if (NIL != assertion_handles.assertion_p(arg2)) {
			html_markup(html_macros.$html_no_break_head$.getGlobalValue());
			cb_show_el_assertion_readably(arg2, T, NIL, T);
			html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			html_newline(UNPROVIDED);
		    } else {
			$cb_show_el_assertion_readably_last_formula$.setDynamicValue(NIL, thread);
			$cb_show_el_assertion_readably_last_mt$.setDynamicValue(NIL, thread);
			if (NIL != constant_p(arg2)) {
			    cb_form(arg2, ZERO_INTEGER, NIL);
			} else {
			    if (NIL != nart_handles.nart_p(arg2)) {
				html_markup(html_macros.$html_no_break_head$.getGlobalValue());
				cb_form(arg2, ZERO_INTEGER, T);
				html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
			    } else {
				if (arg2.isString()) {
				    cb_form(arg2, ZERO_INTEGER, NIL);
				} else {
				    if (arg2.isAtom()) {
					cb_form(arg2, ZERO_INTEGER, NIL);
				    } else {
					html_markup(html_macros.$html_no_break_head$.getGlobalValue());
					cb_form(arg2, ZERO_INTEGER, $cb_c_wrap_assertions$.getDynamicValue(thread));
					html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
					html_newline(UNPROVIDED);
				    }
				}
			    }
			}
		    }
		}
		html_indent(ONE_INTEGER);
	    }
	    return NIL;
	}
    }

    /**
     * Displays link to browser page for gaf ASSERTION, followed by arg2 of ASSERTION.
     * When arg2 is an assertion, displays a link to its browser page, followed by its
     * EL formula or when applicable a statement to the effect that an assertion with the
     * same EL formula has been displayed immediately previously, followed by a new-line.
     */
    @LispMethod(comment = "Displays link to browser page for gaf ASSERTION, followed by arg2 of ASSERTION.\r\nWhen arg2 is an assertion, displays a link to its browser page, followed by its\r\nEL formula or when applicable a statement to the effect that an assertion with the\r\nsame EL formula has been displayed immediately previously, followed by a new-line.\nDisplays link to browser page for gaf ASSERTION, followed by arg2 of ASSERTION.\nWhen arg2 is an assertion, displays a link to its browser page, followed by its\nEL formula or when applicable a statement to the effect that an assertion with the\nsame EL formula has been displayed immediately previously, followed by a new-line.")
    public static SubLObject cb_el_assertion_link_binary_checking_redundancy(final SubLObject assertion, SubLObject show_negatedP) {
	if (show_negatedP == UNPROVIDED) {
	    show_negatedP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == $assertion_filter_hook$.getDynamicValue(thread)) || (NIL != funcall($assertion_filter_hook$.getDynamicValue(thread), assertion))) {
	    cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
	    if (NIL != assertion_handles.assertion_p(arg2)) {
		html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		cb_show_el_assertion_readably(arg2, T, NIL, T);
		html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		html_newline(UNPROVIDED);
	    } else {
		$cb_show_el_assertion_readably_last_formula$.setDynamicValue(NIL, thread);
		$cb_show_el_assertion_readably_last_mt$.setDynamicValue(NIL, thread);
		if (NIL != constant_p(arg2)) {
		    cb_form(arg2, ZERO_INTEGER, NIL);
		} else if (NIL != nart_handles.nart_p(arg2)) {
		    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		    cb_form(arg2, ZERO_INTEGER, T);
		    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		} else if (arg2.isString()) {
		    cb_form(arg2, ZERO_INTEGER, NIL);
		} else if (arg2.isAtom()) {
		    cb_form(arg2, ZERO_INTEGER, NIL);
		} else {
		    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
		    cb_form(arg2, ZERO_INTEGER, $cb_c_wrap_assertions$.getDynamicValue(thread));
		    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
		    html_newline(UNPROVIDED);
		}

	    }
	    html_indent(ONE_INTEGER);
	}
	return NIL;
    }

    static private final SubLString $str_alt30$_A__A___A = makeString("~A ~A, ~A");

    public static final SubLSymbol $kw34$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt35$ref_renames_kills_html = makeString("ref/renames-kills.html");

    static private final SubLString $str_alt36$ref_cycl_syntax_html_naming_conve = makeString("ref/cycl-syntax.html#naming conventions");

    static private final SubLString $str_alt37$toc_html = makeString("toc.html");

    static private final SubLString $str_alt38$__For_detailed_help_and_warnings_ = makeString("--For detailed help and warnings about ~A, please read the ");

    static private final SubLString $str_alt39$_ = makeString("#");

    static private final SubLString $str_alt40$_documentation_ = makeString(" documentation.");

    static private final SubLList $list_alt45 = list(
	    list(new SubLObject[] { reader_make_constant_shell("Collection"), reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("genls"), reader_make_constant_shell("disjointWith"), reader_make_constant_shell("defnIff"),
		    reader_make_constant_shell("quotedDefnIff"), reader_make_constant_shell("defnSufficient"), reader_make_constant_shell("quotedDefnSufficient"), reader_make_constant_shell("defnNecessary"), reader_make_constant_shell("quotedDefnNecessary") }),
	    list(new SubLObject[] { reader_make_constant_shell("Predicate"), reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genlInverse"), reader_make_constant_shell("negationPreds"),
		    reader_make_constant_shell("negationInverse"), reader_make_constant_shell("arity"), reader_make_constant_shell("arityMin"), reader_make_constant_shell("argsIsa"), reader_make_constant_shell("argAndRestIsa"), reader_make_constant_shell("argsQuotedIsa"),
		    reader_make_constant_shell("argAndRestQuotedIsa"), reader_make_constant_shell("argsGenl"), reader_make_constant_shell("argAndRestGenl"), reader_make_constant_shell("argIsa"), reader_make_constant_shell("argGenl"), reader_make_constant_shell("argQuotedIsa"),
		    reader_make_constant_shell("arg1Isa"), reader_make_constant_shell("arg1QuotedIsa"), reader_make_constant_shell("arg1Genl"), reader_make_constant_shell("arg2Isa"), reader_make_constant_shell("arg2QuotedIsa"), reader_make_constant_shell("arg2Genl"),
		    reader_make_constant_shell("arg3Isa"), reader_make_constant_shell("arg3QuotedIsa"), reader_make_constant_shell("arg3Genl"), reader_make_constant_shell("arg4Isa"), reader_make_constant_shell("arg4QuotedIsa"), reader_make_constant_shell("arg4Genl"),
		    reader_make_constant_shell("arg5Isa"), reader_make_constant_shell("arg5QuotedIsa"), reader_make_constant_shell("arg5Genl"), reader_make_constant_shell("fanOutArg"), reader_make_constant_shell("evaluationDefn"), reader_make_constant_shell("afterAdding"),
		    reader_make_constant_shell("afterRemoving") }),
	    list(NIL, reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa")), list(reader_make_constant_shell("Microtheory"), reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("genlMt")),
	    list(new SubLObject[] { reader_make_constant_shell("Function-Denotational"), reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("genlFuncs"), reader_make_constant_shell("genlFunctions"), reader_make_constant_shell("resultIsa"),
		    reader_make_constant_shell("resultIsaArg"), reader_make_constant_shell("resultIsaArgIsa"), reader_make_constant_shell("resultGenl"), reader_make_constant_shell("resultGenlArg"), reader_make_constant_shell("arity"), reader_make_constant_shell("arityMin"),
		    reader_make_constant_shell("argsIsa"), reader_make_constant_shell("argAndRestIsa"), reader_make_constant_shell("argsQuotedIsa"), reader_make_constant_shell("argAndRestQuotedIsa"), reader_make_constant_shell("argsGenl"), reader_make_constant_shell("argAndRestGenl"),
		    reader_make_constant_shell("argIsa"), reader_make_constant_shell("argGenl"), reader_make_constant_shell("argQuotedIsa"), reader_make_constant_shell("arg1Isa"), reader_make_constant_shell("arg1QuotedIsa"), reader_make_constant_shell("arg1Genl"),
		    reader_make_constant_shell("arg2Isa"), reader_make_constant_shell("arg2QuotedIsa"), reader_make_constant_shell("arg2Genl"), reader_make_constant_shell("arg3Isa"), reader_make_constant_shell("arg3QuotedIsa"), reader_make_constant_shell("arg3Genl"),
		    reader_make_constant_shell("arg4Isa"), reader_make_constant_shell("arg4QuotedIsa"), reader_make_constant_shell("arg4Genl"), reader_make_constant_shell("arg5Isa"), reader_make_constant_shell("arg5QuotedIsa"), reader_make_constant_shell("arg5Genl") }));

    public static final SubLObject cb_term_of_unit_link_alt(SubLObject assertion, SubLObject wrapP) {
	if (wrapP == UNPROVIDED) {
	    wrapP = NIL;
	}
	cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	cb_form(sentence_arg1(assertion, UNPROVIDED), NIL, wrapP);
	html_newline(UNPROVIDED);
	return NIL;
    }

    public static SubLObject cb_term_of_unit_link(final SubLObject assertion, SubLObject wrapP) {
	if (wrapP == UNPROVIDED) {
	    wrapP = NIL;
	}
	cb_link($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	cb_form(cycl_utilities.sentence_arg1(assertion, UNPROVIDED), NIL, wrapP);
	html_newline(UNPROVIDED);
	return NIL;
    }

    public static final SubLObject cb_index_hook_p_alt(SubLObject v_object) {
	return makeBoolean(((NIL != forts.fort_p(v_object)) || (NIL != assertion_handles.assertion_p(v_object))) || (NIL != auxiliary_indexing.auxiliary_index_p(v_object)));
    }

    public static SubLObject cb_index_hook_p(final SubLObject v_object) {
	return makeBoolean(((NIL != forts.fort_p(v_object)) || (NIL != assertion_handles.assertion_p(v_object))) || (NIL != auxiliary_indexing.auxiliary_index_p(v_object)));
    }

    public static final SubLObject cb_index_identifier_alt(SubLObject index_hook) {
	if (NIL != forts.fort_p(index_hook)) {
	    return cb_fort_identifier(index_hook);
	} else {
	    if (NIL != auxiliary_indexing.auxiliary_index_p(index_hook)) {
		return index_hook;
	    } else {
		if (NIL != term.closed_nautP(index_hook, UNPROVIDED)) {
		    return cb_naut_identifier(index_hook);
		} else {
		    return NIL;
		}
	    }
	}
    }

    public static SubLObject cb_index_identifier(final SubLObject index_hook) {
	if (NIL != forts.fort_p(index_hook)) {
	    return cb_fort_identifier(index_hook);
	}
	if (NIL != auxiliary_indexing.auxiliary_index_p(index_hook)) {
	    return index_hook;
	}
	if (NIL != term.closed_nautP(index_hook, UNPROVIDED)) {
	    return cb_naut_identifier(index_hook);
	}
	return NIL;
    }

    public static final SubLObject cb_fort_identifier_alt(SubLObject fort) {
	if (NIL != constant_p(fort)) {
	    return cconcatenate(format_nil.format_nil_a_no_copy($cb_constant_id_prefix$.getGlobalValue()), format_nil.format_nil_a_no_copy(constants_high.constant_internal_id(fort)));
	} else {
	    if (NIL != nart_handles.nart_p(fort)) {
		return cconcatenate(format_nil.format_nil_a_no_copy($cb_nart_id_prefix$.getGlobalValue()), format_nil.format_nil_a_no_copy(nart_handles.nart_id(fort)));
	    } else {
		return NIL;
	    }
	}
    }

    public static SubLObject cb_fort_identifier(final SubLObject fort) {
	if (NIL != constant_p(fort)) {
	    return cconcatenate(format_nil.format_nil_a_no_copy($cb_constant_id_prefix$.getGlobalValue()),
		    format_nil.format_nil_a_no_copy(NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue() ? kb_utilities.cached_compact_hl_external_id_string(fort) : constants_high.constant_internal_id(fort)));
	}
	if (NIL != nart_handles.nart_p(fort)) {
	    return cconcatenate(format_nil.format_nil_a_no_copy($cb_nart_id_prefix$.getGlobalValue()), format_nil.format_nil_a_no_copy(NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue() ? kb_utilities.cached_compact_hl_external_id_string(fort) : nart_handles.nart_id(fort)));
	}
	return NIL;
    }

    public static SubLObject cb_assertion_identifier(final SubLObject v_assert) {
	return cconcatenate(format_nil.format_nil_a_no_copy($cb_assertion_id_prefix$.getGlobalValue()),
		format_nil.format_nil_a_no_copy(NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue() ? kb_utilities.cached_compact_hl_external_id_string(v_assert) : assertion_handles.assertion_id(v_assert)));
    }

    public static final SubLObject cb_term_identifier_alt(SubLObject v_term) {
	if (NIL != forts.fort_p(v_term)) {
	    return cb_fort_identifier(v_term);
	} else {
	    if (NIL != term.closed_nautP(v_term, UNPROVIDED)) {
		return cb_naut_identifier(v_term);
	    } else {
		if (NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
		    return prin1_to_string(v_term);
		} else {
		    return NIL;
		}
	    }
	}
    }

    public static SubLObject cb_term_identifier(final SubLObject v_term) {
	if (NIL != forts.fort_p(v_term)) {
	    return cb_fort_identifier(v_term);
	}
	if (NIL != term.closed_nautP(v_term, UNPROVIDED)) {
	    return cb_naut_identifier(v_term);
	}
	if (NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
	    return prin1_to_string(v_term);
	}
	if (NIL != assertion_handles.assertion_p(v_term)) {
	    return cb_assertion_identifier(v_term);
	}
	return NIL;
    }

    public static final SubLObject cb_valid_fort_identifierP_alt(SubLObject v_object) {
	return makeBoolean(v_object.isString() && (((NIL != starts_with(v_object, $cb_constant_id_prefix$.getGlobalValue())) && (NIL != integer_string_p(pre_remove(v_object, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED))))
		|| ((NIL != starts_with(v_object, $cb_nart_id_prefix$.getGlobalValue())) && (NIL != integer_string_p(pre_remove(v_object, $cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED))))));
    }

    public static SubLObject cb_valid_fort_identifierP(final SubLObject v_object) {
	return makeBoolean(v_object.isString() && (((NIL != string_utilities.starts_with(v_object, $cb_constant_id_prefix$.getGlobalValue()))
		&& (NIL != (NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue() ? kb_utilities.compact_hl_external_id_string_p(string_utilities.pre_remove(v_object, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED))
			: string_utilities.integer_string_p(string_utilities.pre_remove(v_object, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED)))))
		|| ((NIL != string_utilities.starts_with(v_object, $cb_nart_id_prefix$.getGlobalValue()))
			&& (NIL != (NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue() ? kb_utilities.compact_hl_external_id_string_p(string_utilities.pre_remove(v_object, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED))
				: string_utilities.integer_string_p(string_utilities.pre_remove(v_object, $cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED)))))));
    }

    public static final SubLObject cb_hlmt_identifier_alt(SubLObject v_hlmt) {
	if (NIL != forts.fort_p(v_hlmt)) {
	    return cb_fort_identifier(v_hlmt);
	} else {
	    return cb_string_for_hlmt(v_hlmt);
	}
    }

    public static SubLObject cb_hlmt_identifier(final SubLObject v_hlmt) {
	if (NIL != forts.fort_p(v_hlmt)) {
	    return cb_fort_identifier(v_hlmt);
	}
	return cb_string_for_hlmt(v_hlmt);
    }

    public static final SubLObject cb_valid_hlmt_identifierP_alt(SubLObject v_object) {
	return makeBoolean((NIL != cb_valid_fort_identifierP(v_object)) || v_object.isString());
    }

    public static SubLObject cb_valid_hlmt_identifierP(final SubLObject v_object) {
	return makeBoolean((NIL != cb_valid_fort_identifierP(v_object)) || v_object.isString());
    }

    public static final SubLObject cb_guess_constant_alt(SubLObject args) {
	if (args.isInteger()) {
	    return constants_high.find_constant_by_internal_id(args);
	} else {
	    if (NIL != constant_p(args)) {
		return args;
	    } else {
		if (NIL == args) {
		    return NIL;
		} else {
		    if (args.isString()) {
			return cb_guess_constant_from_string(args);
		    } else {
			if (args.isCons() && (NIL != forts.fort_p(args.first()))) {
			    return narts_high.find_nart(args);
			} else {
			    if (args.isCons()) {
				return cb_guess_constant(args.first());
			    } else {
				return NIL;
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject cb_guess_constant(final SubLObject args) {
	if (args.isInteger()) {
	    return constants_high.find_constant_by_internal_id(args);
	}
	if (NIL != constant_p(args)) {
	    return args;
	}
	if (NIL == args) {
	    return NIL;
	}
	if (args.isString()) {
	    return cb_guess_constant_from_string(args);
	}
	if (args.isCons() && (NIL != forts.fort_p(args.first()))) {
	    return narts_high.find_nart(args);
	}
	if (args.isCons()) {
	    return cb_guess_constant(args.first());
	}
	return NIL;
    }

    static private final SubLSymbol $sym48$VALID_FORT_ = makeSymbol("VALID-FORT?");

    private static final SubLSymbol VALID_HLMT_P = makeSymbol("VALID-HLMT-P");

    static private final SubLSymbol $sym50$MT_STARTS_BEFORE_STARTING_OF_ = makeSymbol("MT-STARTS-BEFORE-STARTING-OF?");

    public static final SubLObject cb_guess_constant_from_string_alt(SubLObject args) {
	{
	    SubLObject constant = NIL;
	    if (!args.equalp($$$NIL)) {
		constant = ke_utilities.fort_from_string(args);
		if (NIL == constant_p(constant)) {
		    if (NIL != starts_with(args, $cb_constant_id_prefix$.getGlobalValue())) {
			constant = cb_guess_constant(read_from_string_ignoring_errors(pre_remove(args, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED), NIL, NIL, UNPROVIDED, UNPROVIDED));
		    }
		}
		if (NIL == constant) {
		    if (NIL != digit_stringP(args)) {
			constant = cb_guess_constant(read_from_string_ignoring_errors(args, NIL, NIL, UNPROVIDED, UNPROVIDED));
		    }
		}
	    }
	    return constant;
	}
    }

    public static SubLObject cb_guess_constant_from_string(final SubLObject args) {
	SubLObject constant = NIL;
	if (!args.equalp($$$NIL)) {
	    constant = ke_utilities.fort_from_string(args);
	    if ((NIL == constant_p(constant)) && (NIL != string_utilities.starts_with(args, $cb_constant_id_prefix$.getGlobalValue()))) {
		constant = cb_guess_constant(read_from_string_ignoring_errors(string_utilities.pre_remove(args, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED), NIL, NIL, UNPROVIDED, UNPROVIDED));
	    }
	    if ((NIL == constant) && (NIL != string_utilities.digit_stringP(args))) {
		constant = cb_guess_constant(read_from_string_ignoring_errors(args, NIL, NIL, UNPROVIDED, UNPROVIDED));
	    }
	}
	return constant;
    }

    static private final SubLSymbol $sym51$MT_ENDS_BEFORE_ENDING_OF_ = makeSymbol("MT-ENDS-BEFORE-ENDING-OF?");

    static private final SubLSymbol $sym52$_ = makeSymbol("<");

    static private final SubLString $str_alt53$onClick___A_history_back____ = makeString("onClick=\"~A.history.back();\"");

    static private final SubLString $str_alt54$onClick__var_frame_name_____A___i = makeString("onClick=\"var frame_name = \'~A\'; if (top.frames[frame_name]) top.frames[frame_name].history.back();\"");

    public static final SubLObject cb_guess_nart_alt(SubLObject args) {
	if (args.isInteger()) {
	    return nart_handles.find_nart_by_id(args);
	} else {
	    if (NIL != nart_handles.nart_p(args)) {
		return args;
	    } else {
		if (NIL == args) {
		    return NIL;
		} else {
		    if (args.isString() && (NIL != starts_with(args, $cb_nart_id_prefix$.getGlobalValue()))) {
			return cb_guess_nart(read_from_string_ignoring_errors(pre_remove(args, $cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED), NIL, NIL, UNPROVIDED, UNPROVIDED));
		    } else {
			if (NIL != digit_stringP(args)) {
			    return cb_guess_nart(read_from_string_ignoring_errors(args, NIL, NIL, UNPROVIDED, UNPROVIDED));
			} else {
			    if (args.isString() && args.equalp($$$NIL)) {
				return NIL;
			    } else {
				if (args.isString()) {
				    {
					SubLObject v_term = ke_utilities.fort_from_string(args);
					return NIL != nart_handles.nart_p(v_term) ? ((SubLObject) (v_term)) : NIL;
				    }
				} else {
				    if (args.isCons() && (NIL != forts.fort_p(args.first()))) {
					return narts_high.find_nart(args);
				    } else {
					if (args.isCons()) {
					    return cb_guess_nart(args.first());
					} else {
					    return NIL;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject cb_guess_nart(final SubLObject args) {
	if (args.isInteger()) {
	    return nart_handles.find_nart_by_id(args);
	}
	if (NIL != nart_handles.nart_p(args)) {
	    return args;
	}
	if (NIL == args) {
	    return NIL;
	}
	if (args.isString() && (NIL != string_utilities.starts_with(args, $cb_nart_id_prefix$.getGlobalValue()))) {
	    return cb_guess_nart(read_from_string_ignoring_errors(string_utilities.pre_remove(args, $cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED), NIL, NIL, UNPROVIDED, UNPROVIDED));
	}
	if (NIL != string_utilities.digit_stringP(args)) {
	    return cb_guess_nart(read_from_string_ignoring_errors(args, NIL, NIL, UNPROVIDED, UNPROVIDED));
	}
	if (args.isString() && args.equalp($$$NIL)) {
	    return NIL;
	}
	if (args.isString()) {
	    final SubLObject v_term = ke_utilities.fort_from_string(args);
	    return NIL != nart_handles.nart_p(v_term) ? v_term : NIL;
	}
	if (args.isCons() && (NIL != forts.fort_p(args.first()))) {
	    return narts_high.find_nart(args);
	}
	if (args.isCons()) {
	    return cb_guess_nart(args.first());
	}
	return NIL;
    }

    static private final SubLString $str_alt66$cb_login = makeString("cb-login");

    static private final SubLString $str_alt67$cb_history = makeString("cb-history");

    static private final SubLList $list_alt69 = cons(makeSymbol("INDIRECT-HANDLER"), makeSymbol("INDIRECT-ARGS"));

    static private final SubLString $str_alt70$_ = makeString("&");

    static private final SubLString $str_alt71$_ = makeString("=");

    static private final SubLList $list_alt72 = list(makeSymbol("KEYWORD"), makeSymbol("NAME"), makeSymbol("HANDLER"), makeSymbol("CONTROL-STRING"), makeSymbol("NORESIZE"), makeSymbol("SCROLLING"));

    static private final SubLString $str_alt73$_self = makeString("_self");

    static private final SubLString $str_alt74$_parent = makeString("_parent");

    static private final SubLString $str_alt75$_top = makeString("_top");

    static private final SubLString $str_alt77$_blank = makeString("_blank");

    static private final SubLString $str_alt79$_new = makeString("_new");

    public static final SubLObject cb_guess_nat_alt(SubLObject args) {
	return cb_guess_nart(args);
    }

    public static SubLObject cb_guess_nat(final SubLObject args) {
	return cb_guess_nart(args);
    }

    static private final SubLString $str_alt86$cb_toolbar_frame = makeString("cb-toolbar-frame");

    /**
     * Produce a string for fort suitable for display to the user.
     */
    @LispMethod(comment = "Produce a string for fort suitable for display to the user.")
    public static final SubLObject cb_fort_display_string_alt(SubLObject fort) {
	SubLTrampolineFile.checkType(fort, FORT_P);
	if (NIL != constant_p(fort)) {
	    return constants_high.constant_name(fort);
	} else {
	    return string_remove_constant_reader_prefixes(cb_string_for_fort(fort));
	}
    }

    /**
     * Produce a string for fort suitable for display to the user.
     */
    @LispMethod(comment = "Produce a string for fort suitable for display to the user.")
    public static SubLObject cb_fort_display_string(final SubLObject fort) {
	assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
	if (NIL != constant_p(fort)) {
	    return constants_high.constant_name(fort);
	}
	return string_utilities.string_remove_constant_reader_prefixes(cb_string_for_fort(fort));
    }

    static private final SubLString $str_alt87$cyc_main = makeString("cyc-main");

    static private final SubLString $str_alt88$cb_main_frame = makeString("cb-main-frame");

    static private final SubLString $str_alt89$__a = makeString("&~a");

    static private final SubLString $str_alt92$cb_status_frame = makeString("cb-status-frame");

    /**
     * Produce a readable string representing FORT which CB-GUESS-FORT can handle
     */
    @LispMethod(comment = "Produce a readable string representing FORT which CB-GUESS-FORT can handle")
    public static final SubLObject cb_string_for_fort_alt(SubLObject fort) {
	SubLTrampolineFile.checkType(fort, FORT_P);
	{
	    SubLObject el_formula = forts.fort_el_formula(fort);
	    if (NIL != constant_p(el_formula)) {
		{
		    SubLObject name = constants_high.constant_name(el_formula);
		    if (name.isString()) {
			return name;
		    }
		}
	    }
	    return format_nil.format_nil_s(el_formula);
	}
    }

    /**
     * Produce a readable string representing FORT which CB-GUESS-FORT can handle
     */
    @LispMethod(comment = "Produce a readable string representing FORT which CB-GUESS-FORT can handle")
    public static SubLObject cb_string_for_fort(final SubLObject fort) {
	assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
	final SubLObject el_formula = forts.fort_el_formula(fort);
	if (NIL != constant_p(el_formula)) {
	    final SubLObject name = constants_high.constant_name(el_formula);
	    if (name.isString()) {
		return name;
	    }
	}
	return format_nil.format_nil_s(el_formula);
    }

    static private final SubLString $str_alt95$cb_index_frame = makeString("cb-index-frame");

    static private final SubLString $str_alt98$cb_content_frame = makeString("cb-content-frame");

    static private final SubLString $str_alt101$cb_empty_frame = makeString("cb-empty-frame");

    public static final SubLObject cb_guess_fort_alt(SubLObject args, SubLObject interpret_idsP) {
	if (interpret_idsP == UNPROVIDED) {
	    interpret_idsP = T;
	}
	if (NIL != interpret_idsP) {
	    {
		SubLObject fort = cb_guess_fort_from_id(args);
		if (NIL != fort) {
		    return fort;
		}
	    }
	}
	return cb_guess_fort_from_non_id(args);
    }

    public static SubLObject cb_guess_fort(final SubLObject args, SubLObject interpret_idsP) {
	if (interpret_idsP == UNPROVIDED) {
	    interpret_idsP = T;
	}
	if (NIL != interpret_idsP) {
	    final SubLObject fort = cb_guess_fort_from_id(args);
	    if (NIL != fort) {
		return fort;
	    }
	}
	return cb_guess_fort_from_non_id(args);
    }

    static private final SubLString $str_alt104$cb_setup_frame = makeString("cb-setup-frame");

    static private final SubLString $str_alt106$inf_index = makeString("inf-index");

    static private final SubLString $str_alt107$cb_inf_index_frame = makeString("cb-inf-index-frame");

    static private final SubLString $str_alt109$inf_content = makeString("inf-content");

    public static final SubLObject cb_guess_fort_from_id_alt(SubLObject args) {
	if (args.isInteger() && (!args.isNegative())) {
	    return constants_high.find_constant_by_internal_id(args);
	} else {
	    if (args.isInteger() && args.isNegative()) {
		return nart_handles.find_nart_by_id(minus(args));
	    } else {
		if (args.isString() && (NIL != starts_with(args, $cb_constant_id_prefix$.getGlobalValue()))) {
		    return cb_guess_constant(read_from_string_ignoring_errors(pre_remove(args, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED), NIL, NIL, UNPROVIDED, UNPROVIDED));
		} else {
		    if (args.isString() && (NIL != starts_with(args, $cb_nart_id_prefix$.getGlobalValue()))) {
			return cb_guess_nart(read_from_string_ignoring_errors(pre_remove(args, $cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED), NIL, NIL, UNPROVIDED, UNPROVIDED));
		    } else {
			if (NIL != digit_stringP(args)) {
			    return cb_guess_fort_from_id(read_from_string_ignoring_errors(args, NIL, NIL, UNPROVIDED, UNPROVIDED));
			} else {
			    if (((args.isString() && length(args).numG(ONE_INTEGER)) && (NIL != charE(Strings.sublisp_char(args, ZERO_INTEGER), CHAR_hyphen))) && (NIL == list_utilities.find_if_not(symbol_function(DIGIT_CHAR_P), args, symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED))) {
				return cb_guess_fort_from_id(read_from_string_ignoring_errors(args, NIL, NIL, UNPROVIDED, UNPROVIDED));
			    }
			}
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject cb_guess_fort_from_id(final SubLObject args) {
	if (args.isInteger() && (!args.isNegative())) {
	    return constants_high.find_constant_by_internal_id(args);
	}
	if (args.isInteger() && args.isNegative()) {
	    return nart_handles.find_nart_by_id(minus(args));
	}
	if (((NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue()) && args.isString()) && (NIL != string_utilities.starts_with(args, $cb_image_independent_constant_id_prefix$.getGlobalValue()))) {
	    return cb_guess_constant(string_utilities.pre_remove(args, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED));
	}
	if (args.isString() && (NIL != string_utilities.starts_with(args, $cb_constant_id_prefix$.getGlobalValue()))) {
	    return cb_guess_constant(read_from_string_ignoring_errors(args, NIL, NIL, length($cb_constant_id_prefix$.getGlobalValue()), UNPROVIDED));
	}
	if (((NIL != $cb_image_independent_fort_identifiersP$.getGlobalValue()) && args.isString()) && (NIL != string_utilities.starts_with(args, $cb_image_independent_nart_id_prefix$.getGlobalValue()))) {
	    return cb_guess_constant(string_utilities.pre_remove(args, $cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED));
	}
	if (args.isString() && (NIL != string_utilities.starts_with(args, $cb_nart_id_prefix$.getGlobalValue()))) {
	    return cb_guess_nart(read_from_string_ignoring_errors(args, NIL, NIL, length($cb_nart_id_prefix$.getGlobalValue()), UNPROVIDED));
	}
	if (NIL != string_utilities.digit_stringP(args)) {
	    return cb_guess_fort_from_id(read_from_string_ignoring_errors(args, NIL, NIL, UNPROVIDED, UNPROVIDED));
	}
	if (((args.isString() && length(args).numG(ONE_INTEGER)) && (NIL != charE(Strings.sublisp_char(args, ZERO_INTEGER), CHAR_hyphen))) && (NIL == list_utilities.find_if_not(symbol_function(DIGIT_CHAR_P), args, symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED))) {
	    return cb_guess_fort_from_id(read_from_string_ignoring_errors(args, NIL, NIL, UNPROVIDED, UNPROVIDED));
	}
	return NIL;
    }

    static private final SubLString $str_alt110$cb_inf_content_frame = makeString("cb-inf-content-frame");

    static private final SubLString $str_alt111$No_cb_link_method_for__S_defined = makeString("No cb-link method for ~S defined");

    static private final SubLString $str_alt114$Too_many_args_in__S___max_of__S_a = makeString("Too many args in ~S:  max of ~S allowed");

    static private final SubLString $str_alt117$cb_cf = makeString("cb-cf");

    static private final SubLString $str_alt120$cb_start_ = makeString("cb-start|");

    static private final SubLString $str_alt121$_a__a = makeString("~a&~a");

    static private final SubLString $str_alt123$_ = makeString("(");

    static private final SubLString $str_alt128$cb_naut_frame = makeString("cb-naut-frame");

    static private final SubLString $str_alt133$_NART_ = makeString("<NART>");

    static private final SubLString $str_alt134$_NART_ = makeString("<NART ");

    static private final SubLString $str_alt135$_ = makeString(">");

    static private final SubLString $str_alt138$cb_af = makeString("cb-af");

    static private final SubLString $str_alt139$cb_start_cb_af = makeString("cb-start|cb-af");

    public static final SubLObject cb_guess_fort_from_non_id_alt(SubLObject args) {
	if (NIL != constant_p(args)) {
	    return args;
	} else {
	    if (NIL != nart_handles.nart_p(args)) {
		return args;
	    } else {
		if (NIL == args) {
		    return NIL;
		} else {
		    if (args.isString() && args.equalp($$$NIL)) {
			return NIL;
		    } else {
			if (args.isString()) {
			    return ke_utilities.fort_from_string(args);
			} else {
			    if (args.isCons() && (NIL != forts.fort_p(args.first()))) {
				return narts_high.find_nart(args);
			    } else {
				if (args.isCons()) {
				    return cb_guess_fort(args.first(), UNPROVIDED);
				} else {
				    return NIL;
				}
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject cb_guess_fort_from_non_id(final SubLObject args) {
	if (NIL != constant_p(args)) {
	    return args;
	}
	if (NIL != nart_handles.nart_p(args)) {
	    return args;
	}
	if (NIL == args) {
	    return NIL;
	}
	if (args.isString() && args.equalp($$$NIL)) {
	    return NIL;
	}
	if (args.isString()) {
	    return ke_utilities.fort_from_string(args);
	}
	if (args.isCons() && (NIL != forts.fort_p(args.first()))) {
	    return narts_high.find_nart(args);
	}
	if (args.isCons()) {
	    return cb_guess_fort(args.first(), UNPROVIDED);
	}
	return NIL;
    }

    static private final SubLString $str_alt147$_C_C0000 = makeString("~C~C0000");

    static private final SubLString $str_alt150$00_C_C00 = makeString("00~C~C00");

    static private final SubLString $str_alt152$yellow_gif = makeString("yellow.gif");

    static private final SubLString $str_alt153$_Def_ = makeString("[Def]");

    public static final SubLObject cb_naut_identifierP_alt(SubLObject string) {
	return makeBoolean((NIL != list_utilities.lengthG(string, $cb_naut_id_prefix_length$.getGlobalValue(), UNPROVIDED))
		&& (NIL != Strings.stringE($cb_naut_id_prefix$.getGlobalValue(), substring(string, ZERO_INTEGER, $cb_naut_id_prefix_length$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject cb_naut_identifierP(final SubLObject string) {
	return makeBoolean((NIL != list_utilities.lengthG(string, $cb_naut_id_prefix_length$.getGlobalValue(), UNPROVIDED))
		&& (NIL != Strings.stringE($cb_naut_id_prefix$.getGlobalValue(), string_utilities.substring(string, ZERO_INTEGER, $cb_naut_id_prefix_length$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    static private final SubLString $str_alt154$white_gif = makeString("white.gif");

    static private final SubLString $str_alt155$_Mon_ = makeString("[Mon]");

    static private final SubLString $str_alt157$green_gif = makeString("green.gif");

    static private final SubLString $str_alt158$_Inf_ = makeString("[Inf]");

    static private final SubLString $str_alt159$purple_gif = makeString("purple.gif");

    public static final SubLObject cb_naut_identifier_alt(SubLObject naut) {
	return cb_string_for_naut(naut);
    }

    public static SubLObject cb_naut_identifier(final SubLObject naut) {
	return cb_string_for_naut(naut);
    }

    static private final SubLString $str_alt160$_B_ = makeString("[B]");

    public static final SubLObject cb_naut_identifier_string_alt(SubLObject string) {
	return substring(string, $cb_naut_id_prefix_length$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject cb_naut_identifier_string(final SubLObject string) {
	return string_utilities.substring(string, $cb_naut_id_prefix_length$.getGlobalValue(), UNPROVIDED);
    }

    static private final SubLString $str_alt161$blue_gif = makeString("blue.gif");

    static private final SubLString $str_alt162$_F_ = makeString("[F]");

    static private final SubLString $str_alt164$cyan_gif = makeString("cyan.gif");

    public static final SubLObject cb_naut_display_string_alt(SubLObject naut) {
	return string_remove_constant_reader_prefixes(to_lisp_string(hl_to_el(naut)));
    }

    public static SubLObject cb_naut_display_string(final SubLObject naut) {
	return string_utilities.string_remove_constant_reader_prefixes(string_utilities.to_lisp_string(cycl_utilities.hl_to_el(naut)));
    }

    static private final SubLString $str_alt165$_R_ = makeString("[R]");

    static private final SubLString $str_alt166$red_gif = makeString("red.gif");

    static private final SubLString $str_alt167$_False_ = makeString("[False]");

    public static final SubLObject cb_string_for_naut_alt(SubLObject naut) {
	return cconcatenate($cb_naut_id_prefix$.getGlobalValue(), str(cb_glob_id(naut)));
    }

    public static SubLObject cb_string_for_naut(final SubLObject naut) {
	return cconcatenate($cb_naut_id_prefix$.getGlobalValue(), string_utilities.str(cb_glob_id(naut)));
    }

    static private final SubLString $str_alt168$pink_gif = makeString("pink.gif");

    static private final SubLString $str_alt169$_Code_ = makeString("[Code]");

    public static final SubLObject cb_guess_naut_alt(SubLObject args, SubLObject interpret_idsP) {
	if (interpret_idsP == UNPROVIDED) {
	    interpret_idsP = T;
	}
	if (NIL != term.closed_nautP(args, UNPROVIDED)) {
	    return args;
	} else {
	    if ((args.isString() && (NIL != interpret_idsP)) && (NIL != cb_naut_identifierP(args))) {
		return cb_glob_lookup_by_string(cb_naut_identifier_string(args));
	    } else {
		if ((NIL != interpret_idsP) && (NIL != kb_utilities.hl_external_id_string_p(args))) {
		    return kb_utilities.find_object_by_hl_external_id_string(args);
		} else {
		    if (args.isCons()) {
			return cb_guess_naut(args.first(), interpret_idsP);
		    } else {
			return ke_utilities.cycl_from_string(args);
		    }
		}
	    }
	}
    }

    public static SubLObject cb_guess_naut(final SubLObject args, SubLObject interpret_idsP) {
	if (interpret_idsP == UNPROVIDED) {
	    interpret_idsP = T;
	}
	SubLObject result = NIL;
	if (NIL != term.closed_nautP(args, UNPROVIDED)) {
	    result = args;
	} else if ((args.isString() && (NIL != interpret_idsP)) && (NIL != cb_naut_identifierP(args))) {
	    result = cb_glob_lookup_by_string(cb_naut_identifier_string(args));
	} else if ((NIL != interpret_idsP) && (NIL != kb_utilities.hl_external_id_string_p(args))) {
	    result = kb_utilities.find_object_by_hl_external_id_string(args);
	} else if (args.isCons()) {
	    result = cb_guess_naut(args.first(), interpret_idsP);
	} else {
	    result = ke_utilities.cycl_from_string(args);
	}

	return czer_main.canonicalize_term(result, UNPROVIDED);
    }

    static private final SubLString $str_alt170$gray_gif = makeString("gray.gif");

    static private final SubLString $str_alt171$_Unknown_ = makeString("[Unknown]");

    static private final SubLString $str_alt172$_monotonic = makeString(" monotonic");

    static private final SubLString $str_alt173$_forward = makeString(" forward");

    static private final SubLString $str_alt174$_backward = makeString(" backward");

    static private final SubLString $str_alt175$_rule = makeString(" rule");

    static private final SubLString $str_alt176$_GAF = makeString(" GAF");

    static private final SubLString $str_alt177$_asserted_locally = makeString(" asserted locally");

    static private final SubLString $str_alt178$_by_ = makeString(" by ");

    static private final SubLString $str_alt179$_on_ = makeString(" on ");

    static private final SubLString $str_alt180$_ = makeString(" ");

    static private final SubLString $str_alt181$__ = makeString(", ");

    static private final SubLString $str_alt182$_at_ = makeString(" at ");

    public static final SubLObject cb_guess_naut_spec_alt(SubLObject naut_spec) {
	return NIL != term.closed_nautP(naut_spec, UNPROVIDED) ? ((SubLObject) (naut_spec)) : cb_guess_naut(naut_spec, UNPROVIDED);
    }

    public static SubLObject cb_guess_naut_spec(final SubLObject naut_spec) {
	return NIL != term.closed_nautP(naut_spec, UNPROVIDED) ? naut_spec : cb_guess_naut(naut_spec, UNPROVIDED);
    }

    static private final SubLString $str_alt183$_for_ = makeString(" for ");

    static private final SubLString $str_alt184$_and_inferred_by_Cyc = makeString(" and inferred by Cyc");

    public static final SubLObject cb_sentence_identifierP_alt(SubLObject string) {
	return makeBoolean((NIL != list_utilities.lengthG(string, $cb_sentence_id_prefix_length$.getGlobalValue(), UNPROVIDED))
		&& (NIL != Strings.stringE($cb_sentence_id_prefix$.getGlobalValue(), substring(string, ZERO_INTEGER, $cb_sentence_id_prefix_length$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject cb_sentence_identifierP(final SubLObject string) {
	return makeBoolean((NIL != list_utilities.lengthG(string, $cb_sentence_id_prefix_length$.getGlobalValue(), UNPROVIDED))
		&& (NIL != Strings.stringE($cb_sentence_id_prefix$.getGlobalValue(), string_utilities.substring(string, ZERO_INTEGER, $cb_sentence_id_prefix_length$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    static private final SubLString $str_alt185$_inferred_by_Cyc = makeString(" inferred by Cyc");

    static private final SubLString $str_alt187$cb_sentence = makeString("cb-sentence");

    static private final SubLString $str_alt188$cb_start_cb_sentence = makeString("cb-start|cb-sentence");

    static private final SubLString $str_alt189$_a__a_t = makeString("~a&~a&t");

    public static final SubLObject cb_sentence_identifier_string_alt(SubLObject string) {
	return substring(string, $cb_sentence_id_prefix_length$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject cb_sentence_identifier_string(final SubLObject string) {
	return string_utilities.substring(string, $cb_sentence_id_prefix_length$.getGlobalValue(), UNPROVIDED);
    }

    static private final SubLString $str_alt193$cyc_logo_3_t_gif = makeString("cyc-logo-3-t.gif");

    static private final SubLString $str_alt194$_CycL_ = makeString("[CycL]");

    public static final SubLObject cb_string_for_sentence_alt(SubLObject sentence) {
	return cconcatenate($cb_sentence_id_prefix$.getGlobalValue(), str(cb_glob_id(sentence)));
    }

    public static SubLObject cb_string_for_sentence(final SubLObject sentence) {
	return cconcatenate($cb_sentence_id_prefix$.getGlobalValue(), string_utilities.str(cb_glob_id(sentence)));
    }

    static private final SubLString $str_alt196$help_btn_s_gif = makeString("help_btn_s.gif");

    static private final SubLString $str_alt197$_Help_ = makeString("[Help]");

    public static final SubLObject cb_guess_sentence_alt(SubLObject args) {
	if (NIL != cb_sentence_identifierP(args)) {
	    return cb_glob_lookup_by_string(cb_sentence_identifier_string(args));
	} else {
	    return ke_utilities.cycl_from_string(args);
	}
    }

    public static SubLObject cb_guess_sentence(final SubLObject args) {
	if (NIL != cb_sentence_identifierP(args)) {
	    return cb_glob_lookup_by_string(cb_sentence_identifier_string(args));
	}
	return ke_utilities.cycl_from_string(args);
    }

    static private final SubLString $str_alt198$Use_of_unsupported_legacy_help_sy = makeString("Use of unsupported legacy help system for ~A.  Add and use def-cb-help definition.");

    public static SubLObject cb_assertion_identifierP(final SubLObject string) {
	return makeBoolean((NIL != list_utilities.lengthG(string, $cb_assertion_id_prefix_length$.getGlobalValue(), UNPROVIDED))
		&& (NIL != Strings.stringE($cb_assertion_id_prefix$.getGlobalValue(), string_utilities.substring(string, ZERO_INTEGER, $cb_assertion_id_prefix_length$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    static private final SubLString $str_alt204$__INVALID_ASSERTION_ = makeString("#<INVALID ASSERTION>");

    public static SubLObject cb_assertion_identifier_string(final SubLObject string) {
	return string_utilities.substring(string, $cb_assertion_id_prefix_length$.getGlobalValue(), UNPROVIDED);
    }

    static private final SubLList $list_alt207 = list(reader_make_constant_shell("holdsIn"));

    public static SubLObject cb_string_for_assertion(final SubLObject assertion) {
	return cb_assertion_identifier_string(assertion);
    }

    public static final SubLObject cb_term_display_string_alt(SubLObject v_term) {
	if (NIL != forts.fort_p(v_term)) {
	    return cb_fort_display_string(v_term);
	} else {
	    return cb_naut_display_string(v_term);
	}
    }

    public static SubLObject cb_term_display_string(final SubLObject v_term) {
	if (NIL != forts.fort_p(v_term)) {
	    return cb_fort_display_string(v_term);
	}
	return cb_naut_display_string(v_term);
    }

    static private final SubLString $str_alt210$__ = makeString("#<");

    /**
     * Produce a string representing TERM which CB-GUESS-TERM can handle
     */
    @LispMethod(comment = "Produce a string representing TERM which CB-GUESS-TERM can handle")
    public static final SubLObject cb_string_for_term_alt(SubLObject v_term) {
	if (NIL != forts.fort_p(v_term)) {
	    return cb_string_for_fort(v_term);
	} else {
	    return cb_string_for_naut(v_term);
	}
    }

    /**
     * Produce a string representing TERM which CB-GUESS-TERM can handle
     */
    @LispMethod(comment = "Produce a string representing TERM which CB-GUESS-TERM can handle")
    public static SubLObject cb_string_for_term(final SubLObject v_term) {
	if (NIL != assertion_handles.assertion_p(v_term)) {
	    return cb_string_for_assertion(v_term);
	}
	if (NIL != forts.fort_p(v_term)) {
	    return cb_string_for_fort(v_term);
	}
	return cb_string_for_naut(v_term);
    }

    static private final SubLList $list_alt215 = list(makeSymbol("NAME"), makeSymbol("KEYWORD"), makeSymbol("APPLICABILITY-TEST-FN"), makeSymbol("HTML-OUTPUT-FN"));

    static private final SubLList $list_alt216 = list($NAME, makeKeyword("KEYWORD"), makeKeyword("APPLICABILITY-TEST-FN"), makeKeyword("HTML-OUTPUT-FN"));

    public static final SubLObject cb_guess_term_alt(SubLObject args, SubLObject interpret_idsP) {
	if (interpret_idsP == UNPROVIDED) {
	    interpret_idsP = T;
	}
	{
	    SubLObject v_term = cb_guess_fort(args, interpret_idsP);
	    if (NIL != v_term) {
		return v_term;
	    }
	}
	return cb_guess_naut(args, interpret_idsP);
    }

    public static SubLObject cb_guess_term(final SubLObject args, SubLObject interpret_idsP) {
	if (interpret_idsP == UNPROVIDED) {
	    interpret_idsP = T;
	}
	if (NIL != cb_guess_fort(args, interpret_idsP)) {
	    return cb_guess_fort(args, interpret_idsP);
	}
	if (NIL != cb_assertion_identifierP(args)) {
	    return cb_guess_assertion(args);
	}
	return cb_guess_naut(args, interpret_idsP);
    }

    static private final SubLList $list_alt217 = list(makeSymbol("CB-FORM-CONS-METHOD-NAME"), makeSymbol("CB-FORM-CONS-METHOD-KEYWORD"), makeSymbol("CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN"), makeSymbol("CB-FORM-CONS-METHOD-HTML-OUTPUT-FN"));

    static private final SubLList $list_alt218 = list(makeSymbol("_CSETF-CB-FORM-CONS-METHOD-NAME"), makeSymbol("_CSETF-CB-FORM-CONS-METHOD-KEYWORD"), makeSymbol("_CSETF-CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN"), makeSymbol("_CSETF-CB-FORM-CONS-METHOD-HTML-OUTPUT-FN"));

    public static final SubLObject cb_hlmt_display_string_alt(SubLObject v_hlmt) {
	return cb_term_display_string(v_hlmt);
    }

    public static SubLObject cb_hlmt_display_string(final SubLObject v_hlmt) {
	return cb_term_display_string(v_hlmt);
    }

    public static final SubLObject cb_string_for_hlmt_alt(SubLObject v_hlmt) {
	return cb_string_for_term(v_hlmt);
    }

    public static SubLObject cb_string_for_hlmt(final SubLObject v_hlmt) {
	return cb_string_for_term(v_hlmt);
    }

    public static final SubLObject cb_guess_hlmt_alt(SubLObject args) {
	return cb_guess_term(args, UNPROVIDED);
    }

    public static SubLObject cb_guess_hlmt(final SubLObject args) {
	return cb_guess_term(args, UNPROVIDED);
    }

    /**
     * Tries to interpret ARGS as a CycL temporal object.  First tries to interpret
     * STRING as a CycL date, then tries date templates, then tries parsing.
     */
    @LispMethod(comment = "Tries to interpret ARGS as a CycL temporal object.  First tries to interpret\r\nSTRING as a CycL date, then tries date templates, then tries parsing.\nTries to interpret ARGS as a CycL temporal object.  First tries to interpret\nSTRING as a CycL date, then tries date templates, then tries parsing.")
    public static final SubLObject cb_guess_date_alt(SubLObject string) {
	if (NIL != empty_stringP(string)) {
	    return hlmt.$default_mt_time_interval$.getGlobalValue();
	}
	return temporal_object_from_string(string);
    }

    /**
     * Tries to interpret ARGS as a CycL temporal object.  First tries to interpret
     * STRING as a CycL date, then tries date templates, then tries parsing.
     */
    @LispMethod(comment = "Tries to interpret ARGS as a CycL temporal object.  First tries to interpret\r\nSTRING as a CycL date, then tries date templates, then tries parsing.\nTries to interpret ARGS as a CycL temporal object.  First tries to interpret\nSTRING as a CycL date, then tries date templates, then tries parsing.")
    public static SubLObject cb_guess_date(final SubLObject string) {
	if (NIL != string_utilities.empty_stringP(string)) {
	    return hlmt.$default_mt_time_interval$.getGlobalValue();
	}
	return date_utilities.temporal_object_from_string(string);
    }

    public static final SubLObject cb_guess_time_parameter_alt(SubLObject string) {
	if (NIL != empty_stringP(string)) {
	    return hlmt.$default_atemporal_time_parameter$.getGlobalValue();
	}
	return cb_guess_term(string, UNPROVIDED);
    }

    public static SubLObject cb_guess_time_parameter(final SubLObject string) {
	if (NIL != string_utilities.empty_stringP(string)) {
	    return hlmt.$default_atemporal_time_parameter$.getGlobalValue();
	}
	return cb_guess_term(string, UNPROVIDED);
    }

    public static final SubLObject cb_time_interval_display_string_alt(SubLObject time_interval) {
	return NIL != time_interval ? ((SubLObject) (string_remove_constant_reader_prefixes(format_cycl_expression.format_cycl_expression_to_string(time_interval, UNPROVIDED)))) : $str_alt68$;
    }

    public static SubLObject cb_time_interval_display_string(final SubLObject time_interval) {
	return NIL != time_interval ? string_utilities.string_remove_constant_reader_prefixes(format_cycl_expression.format_cycl_expression_to_string(time_interval, UNPROVIDED)) : $str88$;
    }

    public static final SubLObject cb_time_parameter_display_string_alt(SubLObject time_parameter) {
	return NIL != time_parameter ? ((SubLObject) (cb_term_display_string(time_parameter))) : $str_alt68$;
    }

    public static SubLObject cb_time_parameter_display_string(final SubLObject time_parameter) {
	return NIL != time_parameter ? cb_term_display_string(time_parameter) : $str88$;
    }

    public static final SubLObject cb_show_assertion_hlmt_readably_alt(SubLObject v_hlmt) {
	{
	    SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
	    html_princ(cb_fort_display_string(monad_mt));
	    if (NIL != hlmt.interesting_hlmtP(v_hlmt)) {
		html_princ($str_alt181$__);
		cb_show_assertion_hlmt_time_interval_and_parameter(v_hlmt);
	    }
	}
	return NIL;
    }

    public static SubLObject cb_show_assertion_hlmt_readably(final SubLObject v_hlmt) {
	final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
	html_princ(cb_fort_display_string(monad_mt));
	if (NIL != hlmt.interesting_hlmtP(v_hlmt)) {
	    html_princ($str217$__);
	    cb_show_assertion_hlmt_time_interval_and_parameter(v_hlmt);
	}
	return NIL;
    }

    static private final SubLString $str_alt233$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt234 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));

    public static final SubLObject cb_show_assertion_hlmt_time_interval_and_parameter_alt(SubLObject v_hlmt) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
		SubLObject time_interval = NIL;
		SubLObject time_parameter = NIL;
		thread.resetMultipleValues();
		{
		    SubLObject time_interval_27 = hlmt.explode_hlmt_temporal_facets_with_defaults(v_hlmt);
		    SubLObject time_parameter_28 = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    time_interval = time_interval_27;
		    time_parameter = time_parameter_28;
		}
		html_princ(cb_time_interval_display_string(time_interval));
		html_princ($str_alt181$__);
		html_princ(cb_time_parameter_display_string(time_parameter));
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_show_assertion_hlmt_time_interval_and_parameter(final SubLObject v_hlmt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
	SubLObject time_interval = NIL;
	SubLObject time_parameter = NIL;
	thread.resetMultipleValues();
	final SubLObject time_interval_$56 = hlmt.explode_hlmt_temporal_facets_with_defaults(v_hlmt);
	final SubLObject time_parameter_$57 = thread.secondMultipleValue();
	thread.resetMultipleValues();
	time_interval = time_interval_$56;
	time_parameter = time_parameter_$57;
	html_princ(cb_time_interval_display_string(time_interval));
	html_princ($str217$__);
	html_princ(cb_time_parameter_display_string(time_parameter));
	return NIL;
    }

    static private final SubLList $list_alt238 = list(list(makeSymbol("METHOD-KEYWORDS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt243$cg_cb_start_ = makeString("cg?cb-start|");

    static private final SubLString $str_alt244$_ = makeString("'");

    public static final SubLObject cb_mt_display_string_alt(SubLObject mt) {
	return cb_term_display_string(mt);
    }

    public static SubLObject cb_mt_display_string(final SubLObject mt) {
	return cb_term_display_string(mt);
    }

    static private final SubLString $str_alt245$___ = makeString(" . ");

    static private final SubLString $str_alt246$_ = makeString(")");

    public static final SubLObject cb_string_for_mt_alt(SubLObject mt) {
	return cb_string_for_term(mt);
    }

    public static SubLObject cb_string_for_mt(final SubLObject mt) {
	return cb_string_for_term(mt);
    }

    static private final SubLList $list_alt247 = list(makeSymbol("ARG"));

    public static final SubLObject cb_guess_mt_alt(SubLObject args) {
	return cb_guess_term(args, UNPROVIDED);
    }

    public static SubLObject cb_guess_mt(final SubLObject args) {
	return cb_guess_term(args, UNPROVIDED);
    }

    static private final SubLString $str_alt249$The_page_for_ = makeString("The page for ");

    public static SubLObject cb_guess_index(SubLObject args) {
	final SubLObject fort = cb_guess_fort(args, UNPROVIDED);
	if (NIL != forts.fort_p(fort)) {
	    return fort;
	}
	if (args.isCons()) {
	    args = args.first();
	}
	if (args.isString()) {
	    args = find_symbol(args, reader.$keyword_package$.getGlobalValue());
	}
	if (!args.isSymbol()) {
	    return NIL;
	}
	if (NIL == args) {
	    return NIL;
	}
	if (kb_indexing.num_index(args).numG(ZERO_INTEGER)) {
	    return args;
	}
	return NIL;
    }

    static private final SubLString $str_alt250$_has_not_yet_been_implemented_ = makeString(" has not yet been implemented.");

    static private final SubLString $str_alt252$cb_unimplemented__A = makeString("cb-unimplemented&~A");

    static private final SubLString $str_alt255$_and_ = makeString(" and ");

    static private final SubLString $str_alt256$and_ = makeString("and ");

    public static final SubLObject cb_guess_assertion_alt(SubLObject args) {
	if (args.isInteger()) {
	    return assertion_handles.find_assertion_by_id(args);
	} else {
	    if (NIL != assertion_handles.assertion_p(args)) {
		return args;
	    } else {
		if (NIL == args) {
		    return NIL;
		} else {
		    if (args.isString()) {
			{
			    SubLObject id = read_from_string_ignoring_errors(args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    if (id.isInteger()) {
				return assertion_handles.find_assertion_by_id(id);
			    }
			}
			return NIL;
		    } else {
			if (args.isCons()) {
			    return cb_guess_assertion(args.first());
			} else {
			    return NIL;
			}
		    }
		}
	    }
	}
    }

    public static SubLObject cb_guess_assertion(final SubLObject args) {
	if (args.isInteger()) {
	    return assertion_handles.find_assertion_by_id(args);
	}
	if (NIL != assertion_handles.assertion_p(args)) {
	    return args;
	}
	if ((NIL != cb_assertion_identifierP(args)) && read_from_string_ignoring_errors(cb_assertion_identifier_string(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isInteger()) {
	    return assertion_handles.find_assertion_by_id(read_from_string_ignoring_errors(cb_assertion_identifier_string(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
	}
	if ((NIL != cb_assertion_identifierP(args)) && (NIL != kb_utilities.compact_hl_external_id_string_p(cb_assertion_identifier_string(args)))) {
	    return kb_utilities.find_object_by_compact_hl_external_id_string(cb_assertion_identifier_string(args));
	}
	if (NIL == args) {
	    return NIL;
	}
	if (args.isString()) {
	    final SubLObject id = read_from_string_ignoring_errors(args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (id.isInteger()) {
		return assertion_handles.find_assertion_by_id(id);
	    }
	    return NIL;
	} else {
	    if (args.isCons()) {
		return cb_guess_assertion(args.first());
	    }
	    return NIL;
	}
    }

    static private final SubLString $str_alt261$_in_ = makeString(" in ");

    static private final SubLList $list_alt262 = list(makeSymbol("ASSERTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt265 = list(makeSymbol("NULL"), makeSymbol("*ASSERTION-FILTER-HOOK*"));

    static private final SubLList $list_alt268 = list(list(makeSymbol("*ASSERTION-FILTER-HOOK*"), NIL));

    static private final SubLString $str_alt272$__claimed_by_ = makeString(" (claimed by ");

    static private final SubLString $str_alt274$_module_ = makeString(" module)");

    static private final SubLString $str_alt277$EL_Formula___Mt_Identical_to_Asse = makeString("EL Formula & Mt Identical to Assertion Above");

    static private final SubLString $str_alt278$EL_Formula_Identical_to_Assertion = makeString("EL Formula Identical to Assertion Above");

    public static final SubLObject cb_guess_deduction_alt(SubLObject args) {
	if (args.isInteger()) {
	    return deduction_handles.find_deduction_by_id(args);
	} else {
	    if (NIL != deduction_handles.deduction_p(args)) {
		return args;
	    } else {
		if (NIL == args) {
		    return NIL;
		} else {
		    if (args.isString()) {
			{
			    SubLObject id = read_from_string_ignoring_errors(args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    if (id.isInteger()) {
				return deduction_handles.find_deduction_by_id(id);
			    }
			}
			return NIL;
		    } else {
			if (args.isCons()) {
			    return cb_guess_deduction(args.first());
			} else {
			    return NIL;
			}
		    }
		}
	    }
	}
    }

    public static SubLObject cb_guess_deduction(final SubLObject args) {
	if (args.isInteger()) {
	    return deduction_handles.find_deduction_by_id(args);
	}
	if (NIL != deduction_handles.deduction_p(args)) {
	    return args;
	}
	if (NIL == args) {
	    return NIL;
	}
	if (args.isString()) {
	    final SubLObject id = read_from_string_ignoring_errors(args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (id.isInteger()) {
		return deduction_handles.find_deduction_by_id(id);
	    }
	    return NIL;
	} else {
	    if (args.isCons()) {
		return cb_guess_deduction(args.first());
	    }
	    return NIL;
	}
    }

    static private final SubLList $list_alt284 = list(makeSymbol("CB-GUESS-NART"));

    static private final SubLString $str_alt289$_day = makeString("-day");

    static private final SubLString $str_alt291$_month = makeString("-month");

    static private final SubLString $str_alt292$_year = makeString("-year");

    /**
     * For dates of the form MMDDYYYY, e.g. #$myCreationTime
     */
    @LispMethod(comment = "For dates of the form MMDDYYYY, e.g. #$myCreationTime")
    public static final SubLObject prompt_for_simple_date_alt(SubLObject date, SubLObject data_prefix) {
	{
	    SubLObject day = mod(date, $int$100);
	    SubLObject dayprompt = cconcatenate(data_prefix, $str_alt289$_day);
	    SubLObject month = floor(divide(mod(date, $int$10000), $int$100), UNPROVIDED);
	    SubLObject monthprompt = cconcatenate(data_prefix, $str_alt291$_month);
	    SubLObject year = floor(divide(date, $int$10000), UNPROVIDED);
	    SubLObject yearprompt = cconcatenate(data_prefix, $str_alt292$_year);
	    html_indent(THREE_INTEGER);
	    html_princ($$$Month);
	    html_text_input(monthprompt, month, TWO_INTEGER);
	    html_indent(THREE_INTEGER);
	    html_princ($$$Day);
	    html_text_input(dayprompt, day, TWO_INTEGER);
	    html_indent(THREE_INTEGER);
	    html_princ($$$Year);
	    html_text_input(yearprompt, year, FOUR_INTEGER);
	}
	return NIL;
    }

    /**
     * For dates of the form MMDDYYYY, e.g. #$myCreationTime
     */
    @LispMethod(comment = "For dates of the form MMDDYYYY, e.g. #$myCreationTime")
    public static SubLObject prompt_for_simple_date(final SubLObject date, final SubLObject data_prefix) {
	final SubLObject day = mod(date, $int$100);
	final SubLObject dayprompt = cconcatenate(data_prefix, $str387$_day);
	final SubLObject month = floor(divide(mod(date, $int$10000), $int$100), UNPROVIDED);
	final SubLObject monthprompt = cconcatenate(data_prefix, $str389$_month);
	final SubLObject year = floor(divide(date, $int$10000), UNPROVIDED);
	final SubLObject yearprompt = cconcatenate(data_prefix, $str390$_year);
	html_indent(THREE_INTEGER);
	html_princ($$$Month);
	html_text_input(monthprompt, month, TWO_INTEGER);
	html_indent(THREE_INTEGER);
	html_princ($$$Day);
	html_text_input(dayprompt, day, TWO_INTEGER);
	html_indent(THREE_INTEGER);
	html_princ($$$Year);
	html_text_input(yearprompt, year, FOUR_INTEGER);
	return NIL;
    }

    static private final SubLString $str_alt298$The_following_parentheses_are_unm = makeString("The following parentheses are unmatched:");

    static private final SubLString $str_alt299$The_following_constants_are_inval = makeString("The following constants are invalid:");

    static private final SubLString $str_alt300$This_is_unreadable__because_more_ = makeString("This is unreadable, because more was expected at the end :");

    static private final SubLString $str_alt301$Trying_to_read_this_generated_an_ = makeString("Trying to read this generated an internal error :");

    public static final SubLObject read_args_for_simple_date_alt(SubLObject data_prefix, SubLObject args) {
	{
	    SubLObject dayprompt = cconcatenate(data_prefix, $str_alt289$_day);
	    SubLObject monthprompt = cconcatenate(data_prefix, $str_alt291$_month);
	    SubLObject yearprompt = cconcatenate(data_prefix, $str_alt292$_year);
	    SubLObject day = read_from_string_ignoring_errors(html_extract_input(dayprompt, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    SubLObject month = read_from_string_ignoring_errors(html_extract_input(monthprompt, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    SubLObject year = read_from_string_ignoring_errors(html_extract_input(yearprompt, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    return add(multiply($int$10000, year), multiply($int$100, month), day);
	}
    }

    public static SubLObject read_args_for_simple_date(final SubLObject data_prefix, final SubLObject args) {
	final SubLObject dayprompt = cconcatenate(data_prefix, $str387$_day);
	final SubLObject monthprompt = cconcatenate(data_prefix, $str389$_month);
	final SubLObject yearprompt = cconcatenate(data_prefix, $str390$_year);
	final SubLObject day = read_from_string_ignoring_errors(html_extract_input(dayprompt, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	final SubLObject month = read_from_string_ignoring_errors(html_extract_input(monthprompt, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	final SubLObject year = read_from_string_ignoring_errors(html_extract_input(yearprompt, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	return add(multiply($int$10000, year), multiply($int$100, month), day);
    }

    static private final SubLString $str_alt304$The_following_references_to_const = makeString("The following references to constants are invalid:");

    static private final SubLString $str_alt306$in_the_following_string__ = makeString("in the following string :");

    static private final SubLString $str_alt307$Also__the_following_extra_string_ = makeString("Also, the following extra string at the end was ignored :");

    static private final SubLString $str_alt308$The_following_string_did_not_spec = makeString("The following string did not specify a sentence :");

    static private final SubLString $str_alt309$because__ = makeString("because: ");

    static private final SubLString $str_alt310$____none_selected____ = makeString(" -- none selected -- ");

    public static SubLObject read_multiple_terms_from_string(final SubLObject str) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject terms = NIL;
	SubLObject index = ZERO_INTEGER;
	while (index.numL(length(str))) {
	    thread.resetMultipleValues();
	    SubLObject v_object = read_from_string_ignoring_errors(str, NIL, $EOF, index, UNPROVIDED);
	    final SubLObject next_index = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    if (v_object == $EOF) {
		index = length(str);
	    } else {
		if (next_index == $ERROR) {
		    return values(NIL, $ERROR);
		}
		if (v_object.isSymbol()) {
		    v_object = constant_completion_high.constant_complete(symbol_name(v_object), NIL, T, UNPROVIDED, UNPROVIDED).first();
		}
		if (NIL != constant_p(v_object)) {
		    final SubLObject item_var = v_object;
		    if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
			terms = cons(item_var, terms);
		    }
		}
		if (next_index.isInteger()) {
		    index = next_index;
		} else {
		    index = length(str);
		}
	    }
	}
	return values(terms, NIL);
    }

    static private final SubLString $$$baxter = makeString("baxter");

    static private final SubLList $list_alt322 = list(new SubLObject[] { list(list(makeString("isa")), reader_make_constant_shell("isa")), list(list(reader_make_constant_shell("isa")), reader_make_constant_shell("isa")),
	    list(list(makeString("bd588104-9c29-11b1-9dad-c379636f7270")), reader_make_constant_shell("isa")), list(list(makeString("Mx4rvViBBJwpEbGdrcN5Y29ycA")), reader_make_constant_shell("isa")), list(list(makeString("331E2BBD5881049C2911B19DADC379636F7270")), reader_make_constant_shell("isa")),
	    list(list(NIL), NIL), list(list(list(makeString("isa"))), reader_make_constant_shell("isa")), list(list(list(NIL)), NIL), list(list(list(makeString("bd588104-9c29-11b1-9dad-c379636f7270"))), reader_make_constant_shell("isa")),
	    list(list(list(makeString("Mx4rvViBBJwpEbGdrcN5Y29ycA"))), reader_make_constant_shell("isa")), list(list(list(makeString("331E2BBD5881049C2911B19DADC379636F7270"))), reader_make_constant_shell("isa")) });

    public static final SubLObject asserted_reviewer_alt(SubLObject assertion) {
	SubLTrampolineFile.checkType(assertion, ASSERTION_P);
	return kb_mapping_utilities.pred_values_in_mt(assertion, $$myReviewer, $$BookkeepingMt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject asserted_reviewer(final SubLObject assertion) {
	assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
	return kb_mapping_utilities.pred_values_in_mt(assertion, $$myReviewer, $$BookkeepingMt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt326 = list(new SubLObject[] { list(list(makeString("2064")), list(reader_make_constant_shell("YearFn"), makeInteger(2064))),
	    list(list(makeString("from October 1977 to February 2064")),
		    list(reader_make_constant_shell("TimeIntervalInclusiveFn"), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("October"), list(reader_make_constant_shell("YearFn"), makeInteger(1977))),
			    list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))),
	    list(list(makeString("from 1977 to February 2064")),
		    list(reader_make_constant_shell("TimeIntervalInclusiveFn"), list(reader_make_constant_shell("YearFn"), makeInteger(1977)), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))),
	    list(list(makeString("from 1977 to 2064")), list(reader_make_constant_shell("TimeIntervalInclusiveFn"), list(reader_make_constant_shell("YearFn"), makeInteger(1977)), list(reader_make_constant_shell("YearFn"), makeInteger(2064)))),
	    list(list(makeString("February 2064")), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064)))),
	    list(list(makeString("February, 2064")), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064)))),
	    list(list(makeString("February 29, 2064")), list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))),
	    list(list(makeString("February 29th, 2064")), list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))),
	    list(list(makeString("February 29xx, 2064")), NIL), list(list(makeString("February 29foo, 2064")), NIL),
	    list(list(makeString("2/29/2064")), list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))),
	    list(list(makeString("2-29-2064")), list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))),
	    list(list(makeString("2:12 2-29-2064")),
		    list(reader_make_constant_shell("MinuteFn"), TWELVE_INTEGER,
			    list(reader_make_constant_shell("HourFn"), TWO_INTEGER, list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))))),
	    list(list(makeString("2-29-2064 2:12")),
		    list(reader_make_constant_shell("MinuteFn"), TWELVE_INTEGER,
			    list(reader_make_constant_shell("HourFn"), TWO_INTEGER, list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))))),
	    list(list(makeString("2-29-2064, 2:12")), list(reader_make_constant_shell("MinuteFn"), TWELVE_INTEGER,
		    list(reader_make_constant_shell("HourFn"), TWO_INTEGER, list(reader_make_constant_shell("DayFn"), makeInteger(29), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("February"), list(reader_make_constant_shell("YearFn"), makeInteger(2064))))))) });

    /**
     *
     *
     * @see unmatched-parentheses
    Assumes that there are unmatched parentheses in STRING.
     */
    @LispMethod(comment = "@see unmatched-parentheses\r\nAssumes that there are unmatched parentheses in STRING.")
    public static final SubLObject cb_show_unmatched_parentheses_alt(SubLObject string) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject unmatched_paren_positions = unmatched_parentheses(string, UNPROVIDED, UNPROVIDED);
		html_princ_strong($str_alt298$The_following_parentheses_are_unm);
		html_newline(UNPROVIDED);
		html_macros.verify_not_within_html_pre();
		html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
		{
		    SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
		    try {
			html_macros.$within_html_pre$.bind(T, thread);
			{
			    SubLObject string_var = string;
			    SubLObject end_var = length(string_var);
			    SubLObject end_var_29 = end_var;
			    SubLObject char_num = NIL;
			    for (char_num = ZERO_INTEGER; !char_num.numGE(end_var_29); char_num = number_utilities.f_1X(char_num)) {
				{
				    SubLObject v_char = Strings.sublisp_char(string_var, char_num);
				    if (NIL != memberP(char_num, unmatched_paren_positions, UNPROVIDED, UNPROVIDED)) {
					html_markup(html_macros.$html_big_head$.getGlobalValue());
					{
					    SubLObject color_val = $html_unmatched_parenthesis_color$.getDynamicValue(thread);
					    html_markup(html_macros.$html_font_head$.getGlobalValue());
					    if (NIL != color_val) {
						html_markup(html_macros.$html_font_color$.getGlobalValue());
						html_char(CHAR_quotation, UNPROVIDED);
						html_markup(html_color(color_val));
						html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						    html_princ_strong(v_char);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
						}
					    }
					    html_markup(html_macros.$html_font_tail$.getGlobalValue());
					}
					html_markup(html_macros.$html_big_tail$.getGlobalValue());
				    } else {
					html_princ(v_char);
				    }
				}
			    }
			    html_newline(UNPROVIDED);
			}
		    } finally {
			html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
		    }
		}
		html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    /**
     *
     *
     * @see unmatched-parentheses
    Assumes that there are unmatched parentheses in STRING.
     */
    @LispMethod(comment = "@see unmatched-parentheses\r\nAssumes that there are unmatched parentheses in STRING.")
    public static SubLObject cb_show_unmatched_parentheses(final SubLObject string) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject unmatched_paren_positions = string_utilities.unmatched_parentheses(string, UNPROVIDED, UNPROVIDED);
	html_princ_strong($str399$The_following_parentheses_are_unm);
	html_newline(UNPROVIDED);
	html_macros.verify_not_within_html_pre();
	html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
	try {
	    html_macros.$within_html_pre$.bind(T, thread);
	    SubLObject end_var_$58;
	    SubLObject end_var;
	    SubLObject char_num;
	    SubLObject v_char;
	    SubLObject color_val;
	    SubLObject _prev_bind_0_$59;
	    for (end_var = end_var_$58 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$58); char_num = number_utilities.f_1X(char_num)) {
		v_char = Strings.sublisp_char(string, char_num);
		if (NIL != subl_promotions.memberP(char_num, unmatched_paren_positions, UNPROVIDED, UNPROVIDED)) {
		    html_markup(html_macros.$html_big_head$.getGlobalValue());
		    color_val = $html_unmatched_parenthesis_color$.getDynamicValue(thread);
		    html_markup(html_macros.$html_font_head$.getGlobalValue());
		    if (NIL != color_val) {
			html_markup(html_macros.$html_font_color$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(html_color(color_val));
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ_strong(v_char);
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
		    }
		    html_markup(html_macros.$html_font_tail$.getGlobalValue());
		    html_markup(html_macros.$html_big_tail$.getGlobalValue());
		} else {
		    html_princ(v_char);
		}
	    }
	    html_newline(UNPROVIDED);
	} finally {
	    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	return NIL;
    }

    /**
     *
     *
     * @see invalid-constant-names-in-string
    Assumes there are invalid constant names in STRING
     * @param REQUIRE-EXACT?;
     * 		if NIL, suffixes like -s and -es are allowed and
     * 		the constant name is still considered valid.
     */
    @LispMethod(comment = "@see invalid-constant-names-in-string\r\nAssumes there are invalid constant names in STRING\r\n@param REQUIRE-EXACT?;\r\n\t\tif NIL, suffixes like -s and -es are allowed and\r\n\t\tthe constant name is still considered valid.")
    public static final SubLObject cb_show_invalid_constants_alt(SubLObject string, SubLObject require_exactP) {
	if (require_exactP == UNPROVIDED) {
	    require_exactP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_princ_strong($str_alt299$The_following_constants_are_inval);
	    html_newline(UNPROVIDED);
	    html_macros.verify_not_within_html_pre();
	    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	    {
		SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
		try {
		    html_macros.$within_html_pre$.bind(T, thread);
		    html_show_string_with_invalid_constants_highlighted(string, require_exactP);
		    html_newline(UNPROVIDED);
		} finally {
		    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
		}
	    }
	    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	    return NIL;
	}
    }

    /**
     *
     *
     * @see invalid-constant-names-in-string
    Assumes there are invalid constant names in STRING
     * @param REQUIRE-EXACT?;
     * 		if NIL, suffixes like -s and -es are allowed and
     * 		the constant name is still considered valid.
     */
    @LispMethod(comment = "@see invalid-constant-names-in-string\r\nAssumes there are invalid constant names in STRING\r\n@param REQUIRE-EXACT?;\r\n\t\tif NIL, suffixes like -s and -es are allowed and\r\n\t\tthe constant name is still considered valid.")
    public static SubLObject cb_show_invalid_constants(final SubLObject string, SubLObject require_exactP) {
	if (require_exactP == UNPROVIDED) {
	    require_exactP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_princ_strong($str400$The_following_constants_are_inval);
	html_newline(UNPROVIDED);
	html_macros.verify_not_within_html_pre();
	html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
	try {
	    html_macros.$within_html_pre$.bind(T, thread);
	    html_show_string_with_invalid_constants_highlighted(string, require_exactP);
	    html_newline(UNPROVIDED);
	} finally {
	    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	return NIL;
    }

    public static final SubLObject cb_show_eof_explanation_alt(SubLObject string) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_princ_strong($str_alt300$This_is_unreadable__because_more_);
	    html_newline(UNPROVIDED);
	    html_macros.verify_not_within_html_pre();
	    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	    {
		SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
		try {
		    html_macros.$within_html_pre$.bind(T, thread);
		    html_princ(string);
		} finally {
		    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
		}
	    }
	    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	    return NIL;
	}
    }

    public static SubLObject cb_show_eof_explanation(final SubLObject string) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_princ_strong($str401$This_is_unreadable__because_more_);
	html_newline(UNPROVIDED);
	html_macros.verify_not_within_html_pre();
	html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
	try {
	    html_macros.$within_html_pre$.bind(T, thread);
	    html_princ(string);
	} finally {
	    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	return NIL;
    }

    public static final SubLObject cb_show_reader_error_explanation_alt(SubLObject string) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_princ_strong($str_alt301$Trying_to_read_this_generated_an_);
	    html_newline(UNPROVIDED);
	    html_macros.verify_not_within_html_pre();
	    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	    {
		SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
		try {
		    html_macros.$within_html_pre$.bind(T, thread);
		    html_princ(string);
		} finally {
		    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
		}
	    }
	    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	    return NIL;
	}
    }

    public static SubLObject cb_show_reader_error_explanation(final SubLObject string) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_princ_strong($str402$Trying_to_read_this_generated_an_);
	html_newline(UNPROVIDED);
	html_macros.verify_not_within_html_pre();
	html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
	try {
	    html_macros.$within_html_pre$.bind(T, thread);
	    html_princ(string);
	} finally {
	    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	return NIL;
    }

    /**
     *
     *
     * @see invalid-constant-names-in-string
    Assumes that, when read, SENTENCE-STRING will contain symbols that were intended to be constants.
     */
    @LispMethod(comment = "@see invalid-constant-names-in-string\r\nAssumes that, when read, SENTENCE-STRING will contain symbols that were intended to be constants.")
    public static final SubLObject cb_show_symbols_for_invalid_constants_alt(SubLObject sentence_string) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    sentence_string = trim_whitespace(sentence_string);
	    thread.resetMultipleValues();
	    {
		SubLObject sentence = read_from_string_ignoring_errors(sentence_string, NIL, $EOF, UNPROVIDED, UNPROVIDED);
		SubLObject end = thread.secondMultipleValue();
		thread.resetMultipleValues();
		{
		    SubLObject read_sequence = substring(sentence_string, ZERO_INTEGER, end);
		    SubLObject unread_sequence = substring(sentence_string, end, length(sentence_string));
		    SubLObject symbols_for_invalid_constants = expression_gather(sentence, SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    html_princ_strong($str_alt304$The_following_references_to_const);
		    html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
		    {
			SubLObject cdolist_list_var = symbols_for_invalid_constants;
			SubLObject symbol = NIL;
			for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
			    {
				SubLObject invalid_name = symbol_name(symbol);
				SubLObject position = search(invalid_name, sentence_string, symbol_function(CHAR_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				SubLObject invalid_constant_name = subseq(sentence_string, position, add(position, length(invalid_name)));
				if (symbol != symbols_for_invalid_constants.first()) {
				    html_newline(UNPROVIDED);
				}
				html_princ(invalid_constant_name);
			    }
			}
		    }
		    html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
		    html_princ_strong($str_alt306$in_the_following_string__);
		    html_newline(UNPROVIDED);
		    html_macros.verify_not_within_html_pre();
		    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
		    {
			SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
			try {
			    html_macros.$within_html_pre$.bind(T, thread);
			    html_show_string_with_invalid_constants_highlighted(read_sequence, T);
			} finally {
			    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
		    if (NIL == empty_stringP(unread_sequence)) {
			html_newline(TWO_INTEGER);
			html_princ_strong($str_alt307$Also__the_following_extra_string_);
			html_newline(UNPROVIDED);
			html_macros.verify_not_within_html_pre();
			html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
			{
			    SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
			    try {
				html_macros.$within_html_pre$.bind(T, thread);
				html_princ(unread_sequence);
			    } finally {
				html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
			    }
			}
			html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
		    }
		}
	    }
	    return NIL;
	}
    }

    /**
     *
     *
     * @see invalid-constant-names-in-string
    Assumes that, when read, SENTENCE-STRING will contain symbols that were intended to be constants.
     */
    @LispMethod(comment = "@see invalid-constant-names-in-string\r\nAssumes that, when read, SENTENCE-STRING will contain symbols that were intended to be constants.")
    public static SubLObject cb_show_symbols_for_invalid_constants(SubLObject sentence_string) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	sentence_string = string_utilities.trim_whitespace(sentence_string);
	thread.resetMultipleValues();
	final SubLObject sentence = read_from_string_ignoring_errors(sentence_string, NIL, $EOF, UNPROVIDED, UNPROVIDED);
	final SubLObject end = thread.secondMultipleValue();
	thread.resetMultipleValues();
	final SubLObject read_sequence = string_utilities.substring(sentence_string, ZERO_INTEGER, end);
	final SubLObject unread_sequence = string_utilities.substring(sentence_string, end, length(sentence_string));
	final SubLObject symbols_for_invalid_constants = cycl_utilities.expression_gather(sentence, SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	html_princ_strong($str404$The_following_references_to_const);
	html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
	SubLObject cdolist_list_var = symbols_for_invalid_constants;
	SubLObject symbol = NIL;
	symbol = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject invalid_name = symbol_name(symbol);
	    final SubLObject position = search(invalid_name, sentence_string, symbol_function(CHAR_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    final SubLObject invalid_constant_name = subseq(sentence_string, position, add(position, length(invalid_name)));
	    if (!symbol.eql(symbols_for_invalid_constants.first())) {
		html_newline(UNPROVIDED);
	    }
	    html_princ(invalid_constant_name);
	    cdolist_list_var = cdolist_list_var.rest();
	    symbol = cdolist_list_var.first();
	}
	html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
	html_princ_strong($str406$in_the_following_string__);
	html_newline(UNPROVIDED);
	html_macros.verify_not_within_html_pre();
	html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
	try {
	    html_macros.$within_html_pre$.bind(T, thread);
	    html_show_string_with_invalid_constants_highlighted(read_sequence, T);
	} finally {
	    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	if (NIL == string_utilities.empty_stringP(unread_sequence)) {
	    html_newline(TWO_INTEGER);
	    html_princ_strong($str407$Also__the_following_extra_string_);
	    html_newline(UNPROVIDED);
	    html_macros.verify_not_within_html_pre();
	    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	    _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
	    try {
		html_macros.$within_html_pre$.bind(T, thread);
		html_princ(unread_sequence);
	    } finally {
		html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
	    }
	    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	}
	return NIL;
    }

    public static final SubLObject cb_show_non_sentence_explanation_alt(SubLObject sentence_string) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    sentence_string = trim_whitespace(sentence_string);
	    thread.resetMultipleValues();
	    {
		SubLObject sentence = read_from_string_ignoring_errors(sentence_string, NIL, $EOF, UNPROVIDED, UNPROVIDED);
		SubLObject end = thread.secondMultipleValue();
		thread.resetMultipleValues();
		{
		    SubLObject read_sequence = substring(sentence_string, ZERO_INTEGER, end);
		    SubLObject unread_sequence = substring(sentence_string, end, length(sentence_string));
		    html_princ_strong($str_alt308$The_following_string_did_not_spec);
		    html_newline(UNPROVIDED);
		    html_macros.verify_not_within_html_pre();
		    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
		    {
			SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
			try {
			    html_macros.$within_html_pre$.bind(T, thread);
			    html_princ(read_sequence);
			} finally {
			    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
		    html_princ_strong($str_alt309$because__);
		    html_newline(UNPROVIDED);
		    html_macros.verify_not_within_html_pre();
		    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
		    {
			SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
			try {
			    html_macros.$within_html_pre$.bind(T, thread);
			    html_princ(el_grammar.why_not_el_sentence(sentence));
			} finally {
			    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
		    if (NIL == empty_stringP(unread_sequence)) {
			html_newline(TWO_INTEGER);
			html_princ_strong($str_alt307$Also__the_following_extra_string_);
			html_newline(UNPROVIDED);
			html_macros.verify_not_within_html_pre();
			html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
			{
			    SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
			    try {
				html_macros.$within_html_pre$.bind(T, thread);
				html_princ(unread_sequence);
			    } finally {
				html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
			    }
			}
			html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_show_non_sentence_explanation(SubLObject sentence_string) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	sentence_string = string_utilities.trim_whitespace(sentence_string);
	thread.resetMultipleValues();
	final SubLObject sentence = read_from_string_ignoring_errors(sentence_string, NIL, $EOF, UNPROVIDED, UNPROVIDED);
	final SubLObject end = thread.secondMultipleValue();
	thread.resetMultipleValues();
	final SubLObject read_sequence = string_utilities.substring(sentence_string, ZERO_INTEGER, end);
	final SubLObject unread_sequence = string_utilities.substring(sentence_string, end, length(sentence_string));
	html_princ_strong($str408$The_following_string_did_not_spec);
	html_newline(UNPROVIDED);
	html_macros.verify_not_within_html_pre();
	html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
	try {
	    html_macros.$within_html_pre$.bind(T, thread);
	    html_princ(read_sequence);
	} finally {
	    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	html_princ_strong($str409$because__);
	html_newline(UNPROVIDED);
	html_macros.verify_not_within_html_pre();
	html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	_prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
	try {
	    html_macros.$within_html_pre$.bind(T, thread);
	    html_princ(el_grammar.why_not_el_sentence(sentence));
	} finally {
	    html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	if (NIL == string_utilities.empty_stringP(unread_sequence)) {
	    html_newline(TWO_INTEGER);
	    html_princ_strong($str407$Also__the_following_extra_string_);
	    html_newline(UNPROVIDED);
	    html_macros.verify_not_within_html_pre();
	    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
	    _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
	    try {
		html_macros.$within_html_pre$.bind(T, thread);
		html_princ(unread_sequence);
	    } finally {
		html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
	    }
	    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
	}
	return NIL;
    }

    public static final SubLObject cb_fort_encoding_id_alt(SubLObject fort) {
	return cb_fort_identifier(fort);
    }

    public static SubLObject cb_fort_encoding_id(final SubLObject fort) {
	return cb_fort_identifier(fort);
    }

    /**
     * Produce a select menu of height SIZE presenting FORTS for selection.  The selected
     * fort can be extracted using LABEL.  If SELECTED-INSTANCE is non-NIL, that fort will
     * be the default selection.  Only forts satisfying FILTERFN are presented.
     * If CHOICE-NOT-REQUIRED is non-NIL, the first choice in the list will refer to
     * the null choice, and will print with NONE-SELECTED-TEXT.
     */
    @LispMethod(comment = "Produce a select menu of height SIZE presenting FORTS for selection.  The selected\r\nfort can be extracted using LABEL.  If SELECTED-INSTANCE is non-NIL, that fort will\r\nbe the default selection.  Only forts satisfying FILTERFN are presented.\r\nIf CHOICE-NOT-REQUIRED is non-NIL, the first choice in the list will refer to\r\nthe null choice, and will print with NONE-SELECTED-TEXT.\nProduce a select menu of height SIZE presenting FORTS for selection.  The selected\nfort can be extracted using LABEL.  If SELECTED-INSTANCE is non-NIL, that fort will\nbe the default selection.  Only forts satisfying FILTERFN are presented.\nIf CHOICE-NOT-REQUIRED is non-NIL, the first choice in the list will refer to\nthe null choice, and will print with NONE-SELECTED-TEXT.")
    public static final SubLObject cb_fort_list_selector_alt(SubLObject label, SubLObject v_forts, SubLObject selected_instance, SubLObject size, SubLObject filterfn, SubLObject choice_not_required, SubLObject none_selected_text) {
	if (selected_instance == UNPROVIDED) {
	    selected_instance = NIL;
	}
	if (size == UNPROVIDED) {
	    size = ONE_INTEGER;
	}
	if (filterfn == UNPROVIDED) {
	    filterfn = symbol_function(IDENTITY);
	}
	if (choice_not_required == UNPROVIDED) {
	    choice_not_required = NIL;
	}
	if (none_selected_text == UNPROVIDED) {
	    none_selected_text = $str_alt310$____none_selected____;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_markup(html_macros.$html_select_head$.getGlobalValue());
	    html_markup(html_macros.$html_select_name$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(label);
	    html_char(CHAR_quotation, UNPROVIDED);
	    if (NIL != size) {
		html_markup(html_macros.$html_select_size$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(size);
		html_char(CHAR_quotation, UNPROVIDED);
	    }
	    html_char(CHAR_greater, UNPROVIDED);
	    {
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    if (NIL != choice_not_required) {
			html_markup(html_macros.$html_option_head$.getGlobalValue());
			html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_princ(none_selected_text);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
			    }
			}
			html_markup(html_macros.$html_option_tail$.getGlobalValue());
		    }
		    {
			SubLObject cdolist_list_var = v_forts;
			SubLObject curr = NIL;
			for (curr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), curr = cdolist_list_var.first()) {
			    if (NIL != funcall(filterfn, curr)) {
				{
				    SubLObject encoding_id = cb_fort_encoding_id(curr);
				    SubLObject selectedP = eq(curr, selected_instance);
				    html_markup(html_macros.$html_option_head$.getGlobalValue());
				    if (NIL != selectedP) {
					html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
				    }
				    if (NIL != encoding_id) {
					html_markup(html_macros.$html_option_value$.getGlobalValue());
					html_char(CHAR_quotation, UNPROVIDED);
					html_markup(encoding_id);
					html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_princ(kb_paths.fort_name(curr));
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
					}
				    }
				    html_markup(html_macros.$html_option_tail$.getGlobalValue());
				}
			    }
			}
		    }
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
	    }
	    html_markup(html_macros.$html_select_tail$.getGlobalValue());
	    return v_forts;
	}
    }

    /**
     * Produce a select menu of height SIZE presenting FORTS for selection.  The selected
     * fort can be extracted using LABEL.  If SELECTED-INSTANCE is non-NIL, that fort will
     * be the default selection.  Only forts satisfying FILTERFN are presented.
     * If CHOICE-NOT-REQUIRED is non-NIL, the first choice in the list will refer to
     * the null choice, and will print with NONE-SELECTED-TEXT.
     */
    @LispMethod(comment = "Produce a select menu of height SIZE presenting FORTS for selection.  The selected\r\nfort can be extracted using LABEL.  If SELECTED-INSTANCE is non-NIL, that fort will\r\nbe the default selection.  Only forts satisfying FILTERFN are presented.\r\nIf CHOICE-NOT-REQUIRED is non-NIL, the first choice in the list will refer to\r\nthe null choice, and will print with NONE-SELECTED-TEXT.\nProduce a select menu of height SIZE presenting FORTS for selection.  The selected\nfort can be extracted using LABEL.  If SELECTED-INSTANCE is non-NIL, that fort will\nbe the default selection.  Only forts satisfying FILTERFN are presented.\nIf CHOICE-NOT-REQUIRED is non-NIL, the first choice in the list will refer to\nthe null choice, and will print with NONE-SELECTED-TEXT.")
    public static SubLObject cb_fort_list_selector(final SubLObject label, final SubLObject v_forts, SubLObject selected_instance, SubLObject size, SubLObject filterfn, SubLObject choice_not_required, SubLObject none_selected_text) {
	if (selected_instance == UNPROVIDED) {
	    selected_instance = NIL;
	}
	if (size == UNPROVIDED) {
	    size = ONE_INTEGER;
	}
	if (filterfn == UNPROVIDED) {
	    filterfn = symbol_function(IDENTITY);
	}
	if (choice_not_required == UNPROVIDED) {
	    choice_not_required = NIL;
	}
	if (none_selected_text == UNPROVIDED) {
	    none_selected_text = $str410$____none_selected____;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	html_markup(html_macros.$html_select_head$.getGlobalValue());
	html_markup(html_macros.$html_select_name$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	html_markup(label);
	html_char(CHAR_quotation, UNPROVIDED);
	if (NIL != size) {
	    html_markup(html_macros.$html_select_size$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(size);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
	if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
	    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
	}
	html_char(CHAR_greater, UNPROVIDED);
	final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	try {
	    html_macros.$html_safe_print$.bind(T, thread);
	    if (NIL != choice_not_required) {
		html_markup(html_macros.$html_option_head$.getGlobalValue());
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    html_princ(none_selected_text);
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
		}
		html_markup(html_macros.$html_option_tail$.getGlobalValue());
	    }
	    SubLObject cdolist_list_var = v_forts;
	    SubLObject curr = NIL;
	    curr = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != funcall(filterfn, curr)) {
		    final SubLObject encoding_id = cb_fort_encoding_id(curr);
		    final SubLObject selectedP = eql(curr, selected_instance);
		    html_markup(html_macros.$html_option_head$.getGlobalValue());
		    if (NIL != selectedP) {
			html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
		    }
		    if (NIL != encoding_id) {
			html_markup(html_macros.$html_option_value$.getGlobalValue());
			html_char(CHAR_quotation, UNPROVIDED);
			html_markup(encoding_id);
			html_char(CHAR_quotation, UNPROVIDED);
		    }
		    html_char(CHAR_greater, UNPROVIDED);
		    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_princ(kb_paths.fort_name(curr));
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
		    }
		    html_markup(html_macros.$html_option_tail$.getGlobalValue());
		}
		cdolist_list_var = cdolist_list_var.rest();
		curr = cdolist_list_var.first();
	    }
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_select_tail$.getGlobalValue());
	return v_forts;
    }

    /**
     * Decode the results of CB-FORT-LIST-SELECTOR.
     *
     * @return FORT-P or NIL
     */
    @LispMethod(comment = "Decode the results of CB-FORT-LIST-SELECTOR.\r\n\r\n@return FORT-P or NIL")
    public static final SubLObject cb_decode_fort_list_selector_result_alt(SubLObject label, SubLObject html_args) {
	return cb_guess_fort(html_extract_input(label, html_args), UNPROVIDED);
    }

    /**
     * Decode the results of CB-FORT-LIST-SELECTOR.
     *
     * @return FORT-P or NIL
     */
    @LispMethod(comment = "Decode the results of CB-FORT-LIST-SELECTOR.\r\n\r\n@return FORT-P or NIL")
    public static SubLObject cb_decode_fort_list_selector_result(final SubLObject label, final SubLObject html_args) {
	return cb_guess_fort(html_extract_input(label, html_args), UNPROVIDED);
    }

    /**
     * Predicate to test whether the value from CB-DECODE-FORT-LIST-SELECTOR-RESULT is
     * the no-fort-selected result.  Returns T IFF it is.
     */
    @LispMethod(comment = "Predicate to test whether the value from CB-DECODE-FORT-LIST-SELECTOR-RESULT is\r\nthe no-fort-selected result.  Returns T IFF it is.\nPredicate to test whether the value from CB-DECODE-FORT-LIST-SELECTOR-RESULT is\nthe no-fort-selected result.  Returns T IFF it is.")
    public static final SubLObject cb_fort_list_none_selected_p_alt(SubLObject v_object) {
	return sublisp_null(v_object);
    }

    /**
     * Predicate to test whether the value from CB-DECODE-FORT-LIST-SELECTOR-RESULT is
     * the no-fort-selected result.  Returns T IFF it is.
     */
    @LispMethod(comment = "Predicate to test whether the value from CB-DECODE-FORT-LIST-SELECTOR-RESULT is\r\nthe no-fort-selected result.  Returns T IFF it is.\nPredicate to test whether the value from CB-DECODE-FORT-LIST-SELECTOR-RESULT is\nthe no-fort-selected result.  Returns T IFF it is.")
    public static SubLObject cb_fort_list_none_selected_p(final SubLObject v_object) {
	return sublisp_null(v_object);
    }

    /**
     * Display a selection box that allows picking the members of a collection.
     */
    @LispMethod(comment = "Display a selection box that allows picking the members of a collection.")
    public static final SubLObject cb_instances_of_collection_selector_alt(SubLObject label, SubLObject collection, SubLObject selected_instance, SubLObject size, SubLObject filterfn) {
	if (selected_instance == UNPROVIDED) {
	    selected_instance = NIL;
	}
	if (size == UNPROVIDED) {
	    size = ONE_INTEGER;
	}
	if (filterfn == UNPROVIDED) {
	    filterfn = symbol_function(IDENTITY);
	}
	return cb_fort_list_selector(label, isa.all_fort_instances(collection, UNPROVIDED, UNPROVIDED), selected_instance, size, filterfn, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Display a selection box that allows picking the members of a collection.
     */
    @LispMethod(comment = "Display a selection box that allows picking the members of a collection.")
    public static SubLObject cb_instances_of_collection_selector(final SubLObject label, final SubLObject collection, SubLObject selected_instance, SubLObject size, SubLObject filterfn) {
	if (selected_instance == UNPROVIDED) {
	    selected_instance = NIL;
	}
	if (size == UNPROVIDED) {
	    size = ONE_INTEGER;
	}
	if (filterfn == UNPROVIDED) {
	    filterfn = symbol_function(IDENTITY);
	}
	return cb_fort_list_selector(label, isa.all_fort_instances(collection, UNPROVIDED, UNPROVIDED), selected_instance, size, filterfn, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Decode the results of CB-INSTANCES-OF-COLLECTION-SELECTOR.
     *
     * @return FORT-P
     */
    @LispMethod(comment = "Decode the results of CB-INSTANCES-OF-COLLECTION-SELECTOR.\r\n\r\n@return FORT-P")
    public static final SubLObject cb_decode_instances_of_collection_selector_alt(SubLObject label, SubLObject html_args) {
	return cb_decode_fort_list_selector_result(label, html_args);
    }

    /**
     * Decode the results of CB-INSTANCES-OF-COLLECTION-SELECTOR.
     *
     * @return FORT-P
     */
    @LispMethod(comment = "Decode the results of CB-INSTANCES-OF-COLLECTION-SELECTOR.\r\n\r\n@return FORT-P")
    public static SubLObject cb_decode_instances_of_collection_selector(final SubLObject label, final SubLObject html_args) {
	return cb_decode_fort_list_selector_result(label, html_args);
    }

    /**
     * return a list of terms recently broswed by the given CYCLIST.
     */
    @LispMethod(comment = "return a list of terms recently broswed by the given CYCLIST.")
    public static final SubLObject cyclist_recent_terms_alt(SubLObject cyclist) {
	{
	    SubLObject machines = html_kernel.machines_with_html_state();
	    SubLObject result = NIL;
	    SubLObject cdolist_list_var = machines;
	    SubLObject machine = NIL;
	    for (machine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), machine = cdolist_list_var.first()) {
		{
		    SubLObject this_cyclist = html_kernel.html_var_value($the_cyclist$, machine);
		    if (this_cyclist == cyclist) {
			result = cons(html_kernel.html_var_value($cb_nat_history$, machine), result);
			result = cons(html_kernel.html_var_value($cb_constant_history$, machine), result);
		    }
		}
	    }
	    if (NIL != result) {
		result = apply(symbol_function(CCONCATENATE), nreverse(result));
	    }
	    return list_utilities.hash_remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}
    }

    /**
     * return a list of terms recently broswed by the given CYCLIST.
     */
    @LispMethod(comment = "return a list of terms recently broswed by the given CYCLIST.")
    public static SubLObject cyclist_recent_terms(final SubLObject cyclist) {
	final SubLObject machines = html_kernel.machines_with_html_state();
	SubLObject result = NIL;
	SubLObject cdolist_list_var = machines;
	SubLObject machine = NIL;
	machine = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject this_cyclist = html_kernel.html_var_value($the_cyclist$, machine);
	    if (this_cyclist.eql(cyclist)) {
		result = cons(html_kernel.html_var_value($cb_nat_history$, machine), result);
		result = cons(html_kernel.html_var_value($cb_constant_history$, machine), result);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    machine = cdolist_list_var.first();
	}
	if (NIL != result) {
	    result = apply(symbol_function(CCONCATENATE), nreverse(result));
	}
	return list_utilities.hash_remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_inactive_left_arrow() {
	return cb_directional_arrow_marker($INACTIVE_LEFT_ARROW);
    }

    public static SubLObject cb_inactive_right_arrow() {
	return cb_directional_arrow_marker($INACTIVE_RIGHT_ARROW);
    }

    public static SubLObject cb_left_arrow(final SubLObject url, final SubLObject link_text, SubLObject frame) {
	if (frame == UNPROVIDED) {
	    frame = $TOP;
	}
	return cb_directional_arrow($ACTIVE_LEFT_ARROW, url, link_text, frame);
    }

    public static SubLObject cb_right_arrow(final SubLObject url, final SubLObject link_text, SubLObject frame) {
	if (frame == UNPROVIDED) {
	    frame = $TOP;
	}
	return cb_directional_arrow($ACTIVE_RIGHT_ARROW, url, link_text, frame);
    }

    public static SubLObject cb_directional_arrow(final SubLObject arrow_icon, SubLObject url, final SubLObject link_text, final SubLObject frame) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ($TOP == frame) {
	    url = cconcatenate($str142$cb_start_, url);
	}
	final SubLObject frame_name_var = cb_frame_name(frame);
	html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	cyc_cgi_url_int();
	format(html_macros.$html_stream$.getDynamicValue(thread), $str426$_a, url);
	html_char(CHAR_quotation, UNPROVIDED);
	if (NIL != link_text) {
	    html_markup(html_macros.$html_anchor_title$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    html_markup(link_text);
	    html_char(CHAR_quotation, UNPROVIDED);
	}
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
	    cb_directional_arrow_marker(arrow_icon);
	} finally {
	    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	}
	html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	return NIL;
    }

    public static SubLObject cb_directional_arrow_marker(final SubLObject arrow_icon) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(arrow_icon);
	final SubLObject align = $TOP;
	final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(arrow_icon);
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
	return NIL;
    }

    public static final SubLObject declare_cb_utilities_file_alt() {
	declareFunction("cb_url", "CB-URL", 1, 5, false);
	declareFunction("cb_error", "CB-ERROR", 1, 5, false);
	declareFunction("cb_show_fi_error", "CB-SHOW-FI-ERROR", 1, 0, false);
	declareFunction("cb_simple_message_page", "CB-SIMPLE-MESSAGE-PAGE", 1, 2, false);
	declareFunction("cb_message_page_with_history", "CB-MESSAGE-PAGE-WITH-HISTORY", 1, 1, false);
	declareFunction("cb_frame_update_message_page_info", "CB-FRAME-UPDATE-MESSAGE-PAGE-INFO", 1, 0, false);
	declareFunction("cb_show_truth", "CB-SHOW-TRUTH", 1, 0, false);
	declareFunction("cb_show_strength", "CB-SHOW-STRENGTH", 1, 0, false);
	declareFunction("cb_show_direction", "CB-SHOW-DIRECTION", 1, 0, false);
	declareFunction("cb_show_support_module", "CB-SHOW-SUPPORT-MODULE", 1, 0, false);
	declareFunction("cb_term_font_size", "CB-TERM-FONT-SIZE", 1, 2, false);
	declareFunction("cb_show_date", "CB-SHOW-DATE", 1, 0, false);
	declareFunction("cb_show_second", "CB-SHOW-SECOND", 1, 0, false);
	declareFunction("cb_show_cyclist", "CB-SHOW-CYCLIST", 1, 0, false);
	declareFunction("clear_cb_html_for_cyclist_in_nl", "CLEAR-CB-HTML-FOR-CYCLIST-IN-NL", 0, 0, false);
	declareFunction("remove_cb_html_for_cyclist_in_nl", "REMOVE-CB-HTML-FOR-CYCLIST-IN-NL", 1, 2, false);
	declareFunction("cb_html_for_cyclist_in_nl_internal", "CB-HTML-FOR-CYCLIST-IN-NL-INTERNAL", 3, 0, false);
	declareFunction("cb_html_for_cyclist_in_nl", "CB-HTML-FOR-CYCLIST-IN-NL", 1, 2, false);
	declareFunction("cyc_system_doc_rename_kill", "CYC-SYSTEM-DOC-RENAME-KILL", 0, 0, false);
	declareFunction("cyc_system_doc_naming_conventions", "CYC-SYSTEM-DOC-NAMING-CONVENTIONS", 0, 0, false);
	declareFunction("cyc_documentation_toc", "CYC-DOCUMENTATION-TOC", 0, 0, false);
	declareFunction("cb_doc_link", "CB-DOC-LINK", 3, 1, false);
	declareFunction("cb_show_boolean", "CB-SHOW-BOOLEAN", 1, 0, false);
	declareFunction("cb_available_tools", "CB-AVAILABLE-TOOLS", 0, 0, false);
	declareFunction("cb_clear_available_tools", "CB-CLEAR-AVAILABLE-TOOLS", 0, 0, false);
	declareFunction("declare_cb_tool", "DECLARE-CB-TOOL", 4, 0, false);
	declareFunction("undeclare_cb_tool", "UNDECLARE-CB-TOOL", 1, 0, false);
	declareFunction("cb_tool_name", "CB-TOOL-NAME", 1, 0, false);
	declareFunction("cb_tool_abbreviation", "CB-TOOL-ABBREVIATION", 1, 0, false);
	declareFunction("cb_definitional_preds_for_type", "CB-DEFINITIONAL-PREDS-FOR-TYPE", 1, 0, false);
	declareFunction("cb_definitional_preds_for_fort", "CB-DEFINITIONAL-PREDS-FOR-FORT", 1, 0, false);
	declareFunction("cb_sort_preds_for_display", "CB-SORT-PREDS-FOR-DISPLAY", 2, 1, false);
	declareFunction("cb_sort_mts_for_display", "CB-SORT-MTS-FOR-DISPLAY", 1, 0, false);
	declareFunction("mt_starts_before_starting_ofP", "MT-STARTS-BEFORE-STARTING-OF?", 2, 0, false);
	declareFunction("mt_ends_before_ending_ofP", "MT-ENDS-BEFORE-ENDING-OF?", 2, 0, false);
	declareFunction("cb_sort_args_for_display", "CB-SORT-ARGS-FOR-DISPLAY", 1, 0, false);
	declareFunction("cb_group_hlmts_by_monad_mt", "CB-GROUP-HLMTS-BY-MONAD-MT", 1, 0, false);
	declareFunction("cb_back_button", "CB-BACK-BUTTON", 0, 2, false);
	declareFunction("register_cb_frame", "REGISTER-CB-FRAME", 2, 4, false);
	declareFunction("deregister_cb_frame", "DEREGISTER-CB-FRAME", 1, 0, false);
	declareFunction("cb_frame_info", "CB-FRAME-INFO", 1, 0, false);
	declareFunction("cb_frame_name", "CB-FRAME-NAME", 1, 0, false);
	declareFunction("cb_frame", "CB-FRAME", 1, 4, false);
	declareFunction("cb_link", "CB-LINK", 1, 5, false);
	declareFunction("setup_cb_link_method", "SETUP-CB-LINK-METHOD", 3, 0, false);
	declareFunction("cb_link_method", "CB-LINK-METHOD", 1, 0, false);
	declareFunction("cb_link_max_args", "CB-LINK-MAX-ARGS", 1, 0, false);
	declareFunction("cb_link_constant", "CB-LINK-CONSTANT", 1, 2, false);
	declareFunction("cb_link_nart", "CB-LINK-NART", 1, 2, false);
	declareFunction("cb_link_nat", "CB-LINK-NAT", 1, 1, false);
	declareFunction("cb_link_naut", "CB-LINK-NAUT", 1, 2, false);
	declareFunction("cb_link_lexicon", "CB-LINK-LEXICON", 1, 0, false);
	declareFunction("cb_link_unnamed", "CB-LINK-UNNAMED", 1, 0, false);
	declareFunction("cb_link_assertion", "CB-LINK-ASSERTION", 1, 0, false);
	declareFunction("cb_link_method_assertion_internal", "CB-LINK-METHOD-ASSERTION-INTERNAL", 4, 0, false);
	declareFunction("cb_assertion_utility_color", "CB-ASSERTION-UTILITY-COLOR", 1, 0, false);
	declareFunction("clear_html_saturated_red_color", "CLEAR-HTML-SATURATED-RED-COLOR", 0, 0, false);
	declareFunction("remove_html_saturated_red_color", "REMOVE-HTML-SATURATED-RED-COLOR", 1, 1, false);
	declareFunction("html_saturated_red_color_internal", "HTML-SATURATED-RED-COLOR-INTERNAL", 2, 0, false);
	declareFunction("html_saturated_red_color", "HTML-SATURATED-RED-COLOR", 1, 1, false);
	declareFunction("clear_html_saturated_green_color", "CLEAR-HTML-SATURATED-GREEN-COLOR", 0, 0, false);
	declareFunction("remove_html_saturated_green_color", "REMOVE-HTML-SATURATED-GREEN-COLOR", 1, 1, false);
	declareFunction("html_saturated_green_color_internal", "HTML-SATURATED-GREEN-COLOR-INTERNAL", 2, 0, false);
	declareFunction("html_saturated_green_color", "HTML-SATURATED-GREEN-COLOR", 1, 1, false);
	declareFunction("cb_assertion_ball", "CB-ASSERTION-BALL", 1, 1, false);
	declareFunction("assertion_marker", "ASSERTION-MARKER", 1, 0, false);
	declareFunction("html_assertion_marker", "HTML-ASSERTION-MARKER", 1, 1, false);
	declareFunction("html_assertion_marker_tooltip_text", "HTML-ASSERTION-MARKER-TOOLTIP-TEXT", 1, 0, false);
	declareFunction("cb_link_sentence", "CB-LINK-SENTENCE", 1, 1, false);
	declareFunction("html_sentence_marker", "HTML-SENTENCE-MARKER", 1, 0, false);
	declareFunction("cb_determine_help_target", "CB-DETERMINE-HELP-TARGET", 1, 0, false);
	declareFunction("cb_help", "CB-HELP", 1, 2, false);
	declareFunction("cb_help_preamble", "CB-HELP-PREAMBLE", 1, 2, false);
	declareFunction("cb_form", "CB-FORM", 1, 2, false);
	declareFunction("cb_form_variable_method", "CB-FORM-VARIABLE-METHOD", 1, 2, false);
	declareFunction("cb_form_constant_method", "CB-FORM-CONSTANT-METHOD", 1, 2, false);
	declareFunction("cb_form_nart_method", "CB-FORM-NART-METHOD", 1, 2, false);
	declareFunction("cb_form_assertion_method", "CB-FORM-ASSERTION-METHOD", 1, 2, false);
	declareFunction("cb_form_assertion_hl_formula", "CB-FORM-ASSERTION-HL-FORMULA", 1, 2, false);
	declareFunction("cb_form_invalid_assertion", "CB-FORM-INVALID-ASSERTION", 1, 2, false);
	declareFunction("cb_form_assertion_formula", "CB-FORM-ASSERTION-FORMULA", 2, 2, false);
	declareFunction("cb_form_assertion_edit_formula", "CB-FORM-ASSERTION-EDIT-FORMULA", 1, 2, false);
	declareFunction("cb_form_string_method", "CB-FORM-STRING-METHOD", 1, 2, false);
	declareFunction("print_cb_form_cons_methods", "PRINT-CB-FORM-CONS-METHODS", 3, 0, false);
	declareFunction("cb_form_cons_method_print_function_trampoline", "CB-FORM-CONS-METHOD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("cb_form_cons_method_p", "CB-FORM-CONS-METHOD-P", 1, 0, false);
	new com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_method_p$UnaryFunction();
	declareFunction("cb_form_cons_method_name", "CB-FORM-CONS-METHOD-NAME", 1, 0, false);
	declareFunction("cb_form_cons_method_keyword", "CB-FORM-CONS-METHOD-KEYWORD", 1, 0, false);
	declareFunction("cb_form_cons_method_applicability_test_fn", "CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN", 1, 0, false);
	declareFunction("cb_form_cons_method_html_output_fn", "CB-FORM-CONS-METHOD-HTML-OUTPUT-FN", 1, 0, false);
	declareFunction("_csetf_cb_form_cons_method_name", "_CSETF-CB-FORM-CONS-METHOD-NAME", 2, 0, false);
	declareFunction("_csetf_cb_form_cons_method_keyword", "_CSETF-CB-FORM-CONS-METHOD-KEYWORD", 2, 0, false);
	declareFunction("_csetf_cb_form_cons_method_applicability_test_fn", "_CSETF-CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN", 2, 0, false);
	declareFunction("_csetf_cb_form_cons_method_html_output_fn", "_CSETF-CB-FORM-CONS-METHOD-HTML-OUTPUT-FN", 2, 0, false);
	declareFunction("make_cb_form_cons_method", "MAKE-CB-FORM-CONS-METHOD", 0, 1, false);
	declareMacro("defcb_form_cons_method", "DEFCB-FORM-CONS-METHOD");
	declareFunction("register_cb_form_cons_method", "REGISTER-CB-FORM-CONS-METHOD", 2, 0, false);
	declareMacro("with_cb_form_cons_methods", "WITH-CB-FORM-CONS-METHODS");
	declareFunction("compute_cb_form_cons_methods_active", "COMPUTE-CB-FORM-CONS-METHODS-ACTIVE", 1, 0, false);
	declareFunction("cb_form_cons_methods_active", "CB-FORM-CONS-METHODS-ACTIVE", 0, 0, false);
	declareFunction("declare_cb_form_cons_method_always_active", "DECLARE-CB-FORM-CONS-METHOD-ALWAYS-ACTIVE", 1, 0, false);
	declareFunction("always_active_cb_form_cons_methods", "ALWAYS-ACTIVE-CB-FORM-CONS-METHODS", 0, 0, false);
	declareFunction("cb_form_cons_method_keyword_to_cb_form_cons_method", "CB-FORM-CONS-METHOD-KEYWORD-TO-CB-FORM-CONS-METHOD", 1, 0, false);
	declareFunction("top_level_cb_form_url", "TOP-LEVEL-CB-FORM-URL", 1, 0, false);
	declareFunction("cb_form_cons_method", "CB-FORM-CONS-METHOD", 1, 2, false);
	declareFunction("cb_unimplemented", "CB-UNIMPLEMENTED", 1, 0, false);
	declareFunction("cb_link_unimplemented", "CB-LINK-UNIMPLEMENTED", 1, 0, false);
	declareFunction("cb_form_item_list", "CB-FORM-ITEM-LIST", 1, 0, false);
	declareFunction("cb_show_assertion_in_nl", "CB-SHOW-ASSERTION-IN-NL", 1, 0, false);
	declareFunction("cb_show_sentence_in_nl", "CB-SHOW-SENTENCE-IN-NL", 1, 1, false);
	declareFunction("cb_show_question_in_nl", "CB-SHOW-QUESTION-IN-NL", 1, 1, false);
	declareFunction("cb_show_term_in_nl", "CB-SHOW-TERM-IN-NL", 1, 1, false);
	declareFunction("cb_show_in_nl_int", "CB-SHOW-IN-NL-INT", 3, 0, false);
	declareFunction("cb_html_for_obj_in_nl", "CB-HTML-FOR-OBJ-IN-NL", 3, 1, false);
	declareFunction("cb_show_assertion_readably", "CB-SHOW-ASSERTION-READABLY", 1, 2, false);
	declareMacro("when_filtered_assertion", "WHEN-FILTERED-ASSERTION");
	declareMacro("without_assertion_filters", "WITHOUT-ASSERTION-FILTERS");
	declareFunction("cb_assertion_link", "CB-ASSERTION-LINK", 1, 1, false);
	declareFunction("cb_assertion_link_with_mt", "CB-ASSERTION-LINK-WITH-MT", 1, 1, false);
	declareFunction("cb_assertion_link_binary", "CB-ASSERTION-LINK-BINARY", 1, 1, false);
	declareFunction("cb_show_hl_support_readably", "CB-SHOW-HL-SUPPORT-READABLY", 1, 1, false);
	declareFunction("cb_show_hl_support_formula_readably", "CB-SHOW-HL-SUPPORT-FORMULA-READABLY", 1, 0, false);
	declareFunction("cb_show_el_assertion_readably", "CB-SHOW-EL-ASSERTION-READABLY", 1, 3, false);
	declareFunction("cb_assertion_el_formula", "CB-ASSERTION-EL-FORMULA", 1, 1, false);
	declareFunction("cb_el_assertion_link_checking_redundancy", "CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY", 1, 1, false);
	declareFunction("cb_el_assertion_link_with_mt_checking_redundancy", "CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY", 1, 1, false);
	declareFunction("cb_el_assertion_link_binary_checking_redundancy", "CB-EL-ASSERTION-LINK-BINARY-CHECKING-REDUNDANCY", 1, 1, false);
	declareFunction("cb_term_of_unit_link", "CB-TERM-OF-UNIT-LINK", 1, 1, false);
	declareFunction("cb_index_hook_p", "CB-INDEX-HOOK-P", 1, 0, false);
	declareFunction("cb_index_identifier", "CB-INDEX-IDENTIFIER", 1, 0, false);
	declareFunction("cb_fort_identifier", "CB-FORT-IDENTIFIER", 1, 0, false);
	declareFunction("cb_term_identifier", "CB-TERM-IDENTIFIER", 1, 0, false);
	declareFunction("cb_valid_fort_identifierP", "CB-VALID-FORT-IDENTIFIER?", 1, 0, false);
	declareFunction("cb_hlmt_identifier", "CB-HLMT-IDENTIFIER", 1, 0, false);
	declareFunction("cb_valid_hlmt_identifierP", "CB-VALID-HLMT-IDENTIFIER?", 1, 0, false);
	declareFunction("cb_guess_constant", "CB-GUESS-CONSTANT", 1, 0, false);
	declareFunction("cb_guess_constant_from_string", "CB-GUESS-CONSTANT-FROM-STRING", 1, 0, false);
	declareFunction("cb_guess_nart", "CB-GUESS-NART", 1, 0, false);
	declareFunction("cb_guess_nat", "CB-GUESS-NAT", 1, 0, false);
	declareFunction("cb_fort_display_string", "CB-FORT-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_string_for_fort", "CB-STRING-FOR-FORT", 1, 0, false);
	declareFunction("cb_guess_fort", "CB-GUESS-FORT", 1, 1, false);
	declareFunction("cb_guess_fort_from_id", "CB-GUESS-FORT-FROM-ID", 1, 0, false);
	declareFunction("cb_guess_fort_from_non_id", "CB-GUESS-FORT-FROM-NON-ID", 1, 0, false);
	declareFunction("cb_naut_identifierP", "CB-NAUT-IDENTIFIER?", 1, 0, false);
	declareFunction("cb_naut_identifier", "CB-NAUT-IDENTIFIER", 1, 0, false);
	declareFunction("cb_naut_identifier_string", "CB-NAUT-IDENTIFIER-STRING", 1, 0, false);
	declareFunction("cb_naut_display_string", "CB-NAUT-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_string_for_naut", "CB-STRING-FOR-NAUT", 1, 0, false);
	declareFunction("cb_guess_naut", "CB-GUESS-NAUT", 1, 1, false);
	declareFunction("cb_guess_naut_spec", "CB-GUESS-NAUT-SPEC", 1, 0, false);
	declareFunction("cb_sentence_identifierP", "CB-SENTENCE-IDENTIFIER?", 1, 0, false);
	declareFunction("cb_sentence_identifier_string", "CB-SENTENCE-IDENTIFIER-STRING", 1, 0, false);
	declareFunction("cb_string_for_sentence", "CB-STRING-FOR-SENTENCE", 1, 0, false);
	declareFunction("cb_guess_sentence", "CB-GUESS-SENTENCE", 1, 0, false);
	declareFunction("cb_term_display_string", "CB-TERM-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_string_for_term", "CB-STRING-FOR-TERM", 1, 0, false);
	declareFunction("cb_guess_term", "CB-GUESS-TERM", 1, 1, false);
	declareFunction("cb_hlmt_display_string", "CB-HLMT-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_string_for_hlmt", "CB-STRING-FOR-HLMT", 1, 0, false);
	declareFunction("cb_guess_hlmt", "CB-GUESS-HLMT", 1, 0, false);
	declareFunction("cb_guess_date", "CB-GUESS-DATE", 1, 0, false);
	declareFunction("cb_guess_time_parameter", "CB-GUESS-TIME-PARAMETER", 1, 0, false);
	declareFunction("cb_time_interval_display_string", "CB-TIME-INTERVAL-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_time_parameter_display_string", "CB-TIME-PARAMETER-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_show_assertion_hlmt_readably", "CB-SHOW-ASSERTION-HLMT-READABLY", 1, 0, false);
	declareFunction("cb_show_assertion_hlmt_time_interval_and_parameter", "CB-SHOW-ASSERTION-HLMT-TIME-INTERVAL-AND-PARAMETER", 1, 0, false);
	declareFunction("cb_mt_display_string", "CB-MT-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_string_for_mt", "CB-STRING-FOR-MT", 1, 0, false);
	declareFunction("cb_guess_mt", "CB-GUESS-MT", 1, 0, false);
	declareFunction("cb_guess_index", "CB-GUESS-INDEX", 1, 0, false);
	declareFunction("cb_guess_assertion", "CB-GUESS-ASSERTION", 1, 0, false);
	declareFunction("cb_guess_deduction", "CB-GUESS-DEDUCTION", 1, 0, false);
	declareFunction("prompt_for_simple_date", "PROMPT-FOR-SIMPLE-DATE", 2, 0, false);
	declareFunction("read_args_for_simple_date", "READ-ARGS-FOR-SIMPLE-DATE", 2, 0, false);
	declareFunction("asserted_reviewer", "ASSERTED-REVIEWER", 1, 0, false);
	declareFunction("cb_show_unmatched_parentheses", "CB-SHOW-UNMATCHED-PARENTHESES", 1, 0, false);
	declareFunction("cb_show_invalid_constants", "CB-SHOW-INVALID-CONSTANTS", 1, 1, false);
	declareFunction("cb_show_eof_explanation", "CB-SHOW-EOF-EXPLANATION", 1, 0, false);
	declareFunction("cb_show_reader_error_explanation", "CB-SHOW-READER-ERROR-EXPLANATION", 1, 0, false);
	declareFunction("cb_show_symbols_for_invalid_constants", "CB-SHOW-SYMBOLS-FOR-INVALID-CONSTANTS", 1, 0, false);
	declareFunction("cb_show_non_sentence_explanation", "CB-SHOW-NON-SENTENCE-EXPLANATION", 1, 0, false);
	declareFunction("cb_fort_encoding_id", "CB-FORT-ENCODING-ID", 1, 0, false);
	declareFunction("cb_fort_list_selector", "CB-FORT-LIST-SELECTOR", 2, 5, false);
	declareFunction("cb_decode_fort_list_selector_result", "CB-DECODE-FORT-LIST-SELECTOR-RESULT", 2, 0, false);
	declareFunction("cb_fort_list_none_selected_p", "CB-FORT-LIST-NONE-SELECTED-P", 1, 0, false);
	declareFunction("cb_instances_of_collection_selector", "CB-INSTANCES-OF-COLLECTION-SELECTOR", 2, 3, false);
	declareFunction("cb_decode_instances_of_collection_selector", "CB-DECODE-INSTANCES-OF-COLLECTION-SELECTOR", 2, 0, false);
	declareFunction("cyclist_recent_terms", "CYCLIST-RECENT-TERMS", 1, 0, false);
	return NIL;
    }

    public static SubLObject declare_cb_utilities_file() {
	if (SubLFiles.USE_V1) {
	    declareFunction("cb_url", "CB-URL", 1, 5, false);
	    declareFunction("cb_error", "CB-ERROR", 1, 5, false);
	    declareFunction("cb_show_fi_error", "CB-SHOW-FI-ERROR", 1, 0, false);
	    declareFunction("cb_simple_message_page", "CB-SIMPLE-MESSAGE-PAGE", 1, 2, false);
	    declareFunction("cb_history_with_back_link", "CB-HISTORY-WITH-BACK-LINK", 0, 1, false);
	    declareFunction("cb_message_page_with_history", "CB-MESSAGE-PAGE-WITH-HISTORY", 1, 1, false);
	    declareFunction("cb_titled_message_page_with_history", "CB-TITLED-MESSAGE-PAGE-WITH-HISTORY", 2, 1, false);
	    declareFunction("cb_frame_update_message_page_info", "CB-FRAME-UPDATE-MESSAGE-PAGE-INFO", 1, 0, false);
	    declareFunction("cb_show_truth", "CB-SHOW-TRUTH", 1, 0, false);
	    declareFunction("cb_show_strength", "CB-SHOW-STRENGTH", 1, 0, false);
	    declareFunction("cb_show_direction", "CB-SHOW-DIRECTION", 1, 0, false);
	    declareFunction("cb_show_support_module", "CB-SHOW-SUPPORT-MODULE", 1, 0, false);
	    declareFunction("cb_term_font_size", "CB-TERM-FONT-SIZE", 1, 2, false);
	    declareFunction("cb_show_date", "CB-SHOW-DATE", 1, 0, false);
	    declareFunction("cb_show_second", "CB-SHOW-SECOND", 1, 0, false);
	    declareFunction("cb_show_cyclist", "CB-SHOW-CYCLIST", 1, 0, false);
	    declareFunction("clear_cb_html_for_cyclist_in_nl", "CLEAR-CB-HTML-FOR-CYCLIST-IN-NL", 0, 0, false);
	    declareFunction("remove_cb_html_for_cyclist_in_nl", "REMOVE-CB-HTML-FOR-CYCLIST-IN-NL", 1, 2, false);
	    declareFunction("cb_html_for_cyclist_in_nl_internal", "CB-HTML-FOR-CYCLIST-IN-NL-INTERNAL", 3, 0, false);
	    declareFunction("cb_html_for_cyclist_in_nl", "CB-HTML-FOR-CYCLIST-IN-NL", 1, 2, false);
	    declareFunction("cyc_system_doc_rename_kill", "CYC-SYSTEM-DOC-RENAME-KILL", 0, 0, false);
	    declareFunction("cyc_system_doc_naming_conventions", "CYC-SYSTEM-DOC-NAMING-CONVENTIONS", 0, 0, false);
	    declareFunction("cyc_documentation_toc", "CYC-DOCUMENTATION-TOC", 0, 0, false);
	    declareFunction("cb_doc_link", "CB-DOC-LINK", 3, 1, false);
	    declareFunction("cb_show_boolean", "CB-SHOW-BOOLEAN", 1, 0, false);
	    declareFunction("boolean_yes_no_string", "BOOLEAN-YES-NO-STRING", 1, 0, false);
	    declareFunction("cb_available_tools", "CB-AVAILABLE-TOOLS", 0, 0, false);
	    declareFunction("cb_standard_tools", "CB-STANDARD-TOOLS", 0, 0, false);
	    declareFunction("cb_deprecated_tools", "CB-DEPRECATED-TOOLS", 0, 0, false);
	    declareFunction("cb_clear_available_tools", "CB-CLEAR-AVAILABLE-TOOLS", 0, 0, false);
	    declareFunction("declare_cb_tool", "DECLARE-CB-TOOL", 4, 0, false);
	    declareFunction("declare_deprecated_cb_tool", "DECLARE-DEPRECATED-CB-TOOL", 4, 0, false);
	    declareFunction("undeclare_cb_tool", "UNDECLARE-CB-TOOL", 1, 0, false);
	    declareFunction("cb_tool_name", "CB-TOOL-NAME", 1, 0, false);
	    declareFunction("cb_tool_abbreviation", "CB-TOOL-ABBREVIATION", 1, 0, false);
	    declareFunction("cb_definitional_preds_for_type", "CB-DEFINITIONAL-PREDS-FOR-TYPE", 1, 0, false);
	    declareFunction("cb_definitional_preds_for_fort", "CB-DEFINITIONAL-PREDS-FOR-FORT", 1, 0, false);
	    declareFunction("cb_sort_preds_for_display", "CB-SORT-PREDS-FOR-DISPLAY", 2, 1, false);
	    declareFunction("cb_sort_mts_for_display", "CB-SORT-MTS-FOR-DISPLAY", 1, 1, false);
	    declareFunction("mt_start_universal_time_extended", "MT-START-UNIVERSAL-TIME-EXTENDED", 1, 1, false);
	    declareFunction("mt_end_universal_time_extended", "MT-END-UNIVERSAL-TIME-EXTENDED", 1, 1, false);
	    declareFunction("get_mt_time_interval_memoized_internal", "GET-MT-TIME-INTERVAL-MEMOIZED-INTERNAL", 1, 0, false);
	    declareFunction("get_mt_time_interval_memoized", "GET-MT-TIME-INTERVAL-MEMOIZED", 1, 0, false);
	    declareFunction("maybe_cycl_second_to_universal_time_extended_internal", "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED-INTERNAL", 1, 1, false);
	    declareFunction("maybe_cycl_second_to_universal_time_extended", "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED", 1, 1, false);
	    declareFunction("maybe_cycl_second_to_universal_time_extended_low", "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED-LOW", 1, 1, false);
	    declareFunction("cb_sort_args_for_display", "CB-SORT-ARGS-FOR-DISPLAY", 1, 0, false);
	    declareFunction("cb_group_hlmts_by_monad_mt", "CB-GROUP-HLMTS-BY-MONAD-MT", 1, 0, false);
	    declareFunction("cb_back_button", "CB-BACK-BUTTON", 0, 2, false);
	    declareFunction("register_cb_frame", "REGISTER-CB-FRAME", 2, 4, false);
	    declareFunction("deregister_cb_frame", "DEREGISTER-CB-FRAME", 1, 0, false);
	    declareFunction("cb_frame_info", "CB-FRAME-INFO", 1, 0, false);
	    declareFunction("cb_frame_name", "CB-FRAME-NAME", 1, 0, false);
	    declareFunction("cb_frame", "CB-FRAME", 1, 4, false);
	    declareFunction("cb_link", "CB-LINK", 1, 5, false);
	    declareFunction("setup_cb_link_method", "SETUP-CB-LINK-METHOD", 3, 0, false);
	    declareFunction("cb_link_method", "CB-LINK-METHOD", 1, 0, false);
	    declareFunction("cb_link_max_args", "CB-LINK-MAX-ARGS", 1, 0, false);
	    declareFunction("cb_link_constant", "CB-LINK-CONSTANT", 1, 2, false);
	    declareFunction("cb_nat_span_id", "CB-NAT-SPAN-ID", 1, 1, false);
	    declareFunction("cb_link_nart", "CB-LINK-NART", 1, 2, false);
	    declareFunction("cb_link_nat", "CB-LINK-NAT", 1, 1, false);
	    declareFunction("cb_link_naut", "CB-LINK-NAUT", 1, 2, false);
	    declareFunction("cb_naut_href", "CB-NAUT-HREF", 1, 0, false);
	    declareFunction("cb_link_lexicon", "CB-LINK-LEXICON", 1, 0, false);
	    declareFunction("cb_link_unnamed", "CB-LINK-UNNAMED", 1, 0, false);
	    declareFunction("cb_link_assertion", "CB-LINK-ASSERTION", 1, 0, false);
	    declareFunction("cb_link_method_assertion_internal", "CB-LINK-METHOD-ASSERTION-INTERNAL", 4, 0, false);
	    declareFunction("cb_assertion_utility_color", "CB-ASSERTION-UTILITY-COLOR", 1, 0, false);
	    declareFunction("clear_html_saturated_red_color", "CLEAR-HTML-SATURATED-RED-COLOR", 0, 0, false);
	    declareFunction("remove_html_saturated_red_color", "REMOVE-HTML-SATURATED-RED-COLOR", 1, 1, false);
	    declareFunction("html_saturated_red_color_internal", "HTML-SATURATED-RED-COLOR-INTERNAL", 2, 0, false);
	    declareFunction("html_saturated_red_color", "HTML-SATURATED-RED-COLOR", 1, 1, false);
	    declareFunction("clear_html_saturated_green_color", "CLEAR-HTML-SATURATED-GREEN-COLOR", 0, 0, false);
	    declareFunction("remove_html_saturated_green_color", "REMOVE-HTML-SATURATED-GREEN-COLOR", 1, 1, false);
	    declareFunction("html_saturated_green_color_internal", "HTML-SATURATED-GREEN-COLOR-INTERNAL", 2, 0, false);
	    declareFunction("html_saturated_green_color", "HTML-SATURATED-GREEN-COLOR", 1, 1, false);
	    declareFunction("cb_assertion_ball", "CB-ASSERTION-BALL", 1, 1, false);
	    declareFunction("assertion_marker", "ASSERTION-MARKER", 1, 0, false);
	    declareFunction("html_assertion_marker", "HTML-ASSERTION-MARKER", 1, 1, false);
	    declareFunction("html_assertion_marker_tooltip_text", "HTML-ASSERTION-MARKER-TOOLTIP-TEXT", 1, 0, false);
	    declareFunction("clear_generate_phrase_for_cyclist", "CLEAR-GENERATE-PHRASE-FOR-CYCLIST", 0, 0, false);
	    declareFunction("remove_generate_phrase_for_cyclist", "REMOVE-GENERATE-PHRASE-FOR-CYCLIST", 1, 0, false);
	    declareFunction("generate_phrase_for_cyclist_internal", "GENERATE-PHRASE-FOR-CYCLIST-INTERNAL", 1, 0, false);
	    declareFunction("generate_phrase_for_cyclist", "GENERATE-PHRASE-FOR-CYCLIST", 1, 0, false);
	    declareFunction("cb_link_sentence", "CB-LINK-SENTENCE", 1, 1, false);
	    declareFunction("html_sentence_marker", "HTML-SENTENCE-MARKER", 1, 0, false);
	    declareFunction("cb_determine_help_target", "CB-DETERMINE-HELP-TARGET", 1, 0, false);
	    declareFunction("cb_help", "CB-HELP", 1, 2, false);
	    declareFunction("cb_help_preamble", "CB-HELP-PREAMBLE", 1, 2, false);
	    declareFunction("cb_form", "CB-FORM", 1, 2, false);
	    declareFunction("cb_form_variable_method", "CB-FORM-VARIABLE-METHOD", 1, 2, false);
	    declareFunction("cb_form_symbol_method", "CB-FORM-SYMBOL-METHOD", 1, 2, false);
	    declareFunction("cb_form_constant_method", "CB-FORM-CONSTANT-METHOD", 1, 2, false);
	    declareFunction("cb_form_nart_method", "CB-FORM-NART-METHOD", 1, 2, false);
	    declareFunction("cb_form_assertion_method", "CB-FORM-ASSERTION-METHOD", 1, 2, false);
	    declareFunction("cb_form_assertion_hl_formula", "CB-FORM-ASSERTION-HL-FORMULA", 1, 2, false);
	    declareFunction("cb_form_invalid_assertion", "CB-FORM-INVALID-ASSERTION", 1, 2, false);
	    declareFunction("cb_form_assertion_formula", "CB-FORM-ASSERTION-FORMULA", 2, 3, false);
	    declareFunction("cb_form_assertion_edit_formula", "CB-FORM-ASSERTION-EDIT-FORMULA", 1, 2, false);
	    declareFunction("cb_form_string_method", "CB-FORM-STRING-METHOD", 1, 2, false);
	    declareFunction("print_cb_form_cons_methods", "PRINT-CB-FORM-CONS-METHODS", 3, 0, false);
	    declareFunction("cb_form_cons_method_print_function_trampoline", "CB-FORM-CONS-METHOD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("cb_form_cons_method_p", "CB-FORM-CONS-METHOD-P", 1, 0, false);
	    new cb_utilities.$cb_form_cons_method_p$UnaryFunction();
	    declareFunction("cb_form_cons_method_name", "CB-FORM-CONS-METHOD-NAME", 1, 0, false);
	    declareFunction("cb_form_cons_method_keyword", "CB-FORM-CONS-METHOD-KEYWORD", 1, 0, false);
	    declareFunction("cb_form_cons_method_applicability_test_fn", "CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN", 1, 0, false);
	    declareFunction("cb_form_cons_method_html_output_fn", "CB-FORM-CONS-METHOD-HTML-OUTPUT-FN", 1, 0, false);
	    declareFunction("_csetf_cb_form_cons_method_name", "_CSETF-CB-FORM-CONS-METHOD-NAME", 2, 0, false);
	    declareFunction("_csetf_cb_form_cons_method_keyword", "_CSETF-CB-FORM-CONS-METHOD-KEYWORD", 2, 0, false);
	    declareFunction("_csetf_cb_form_cons_method_applicability_test_fn", "_CSETF-CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN", 2, 0, false);
	    declareFunction("_csetf_cb_form_cons_method_html_output_fn", "_CSETF-CB-FORM-CONS-METHOD-HTML-OUTPUT-FN", 2, 0, false);
	    declareFunction("make_cb_form_cons_method", "MAKE-CB-FORM-CONS-METHOD", 0, 1, false);
	    declareFunction("visit_defstruct_cb_form_cons_method", "VISIT-DEFSTRUCT-CB-FORM-CONS-METHOD", 2, 0, false);
	    declareFunction("visit_defstruct_object_cb_form_cons_method_method", "VISIT-DEFSTRUCT-OBJECT-CB-FORM-CONS-METHOD-METHOD", 2, 0, false);
	    declareMacro("defcb_form_cons_method", "DEFCB-FORM-CONS-METHOD");
	    declareFunction("register_cb_form_cons_method", "REGISTER-CB-FORM-CONS-METHOD", 2, 0, false);
	    declareMacro("with_cb_form_cons_methods", "WITH-CB-FORM-CONS-METHODS");
	    declareFunction("compute_cb_form_cons_methods_active", "COMPUTE-CB-FORM-CONS-METHODS-ACTIVE", 1, 0, false);
	    declareFunction("cb_form_cons_methods_active", "CB-FORM-CONS-METHODS-ACTIVE", 0, 0, false);
	    declareFunction("declare_cb_form_cons_method_always_active", "DECLARE-CB-FORM-CONS-METHOD-ALWAYS-ACTIVE", 1, 0, false);
	    declareFunction("always_active_cb_form_cons_methods", "ALWAYS-ACTIVE-CB-FORM-CONS-METHODS", 0, 0, false);
	    declareFunction("cb_form_cons_method_keyword_to_cb_form_cons_method", "CB-FORM-CONS-METHOD-KEYWORD-TO-CB-FORM-CONS-METHOD", 1, 0, false);
	    declareFunction("top_level_cb_form_url", "TOP-LEVEL-CB-FORM-URL", 1, 0, false);
	    declareFunction("cb_form_string", "CB-FORM-STRING", 1, 1, false);
	    declareFunction("get_url_prefix_for_url_type", "GET-URL-PREFIX-FOR-URL-TYPE", 1, 0, false);
	    declareFunction("cb_formula_argument_limit_exceededP", "CB-FORMULA-ARGUMENT-LIMIT-EXCEEDED?", 1, 0, false);
	    declareFunction("cb_form_cons_method", "CB-FORM-CONS-METHOD", 1, 2, false);
	    declareFunction("cb_form_cons_internal", "CB-FORM-CONS-INTERNAL", 3, 0, false);
	    declareFunction("cb_form_cons_inter_arg_space", "CB-FORM-CONS-INTER-ARG-SPACE", 0, 0, false);
	    declareFunction("cb_date_to_optimize_for_displayP", "CB-DATE-TO-OPTIMIZE-FOR-DISPLAY?", 1, 0, false);
	    declareFunction("cb_show_date_optimized_for_display", "CB-SHOW-DATE-OPTIMIZED-FOR-DISPLAY", 3, 0, false);
	    declareFunction("cb_possibly_optimize_date_for_display", "CB-POSSIBLY-OPTIMIZE-DATE-FOR-DISPLAY", 1, 0, false);
	    declareFunction("cb_optimize_date_for_display", "CB-OPTIMIZE-DATE-FOR-DISPLAY", 1, 0, false);
	    declareFunction("cb_decimal_to_optimize_for_displayP", "CB-DECIMAL-TO-OPTIMIZE-FOR-DISPLAY?", 1, 0, false);
	    declareFunction("cb_show_decimal_optimized_for_display", "CB-SHOW-DECIMAL-OPTIMIZED-FOR-DISPLAY", 3, 0, false);
	    declareFunction("cb_optimize_decimal_for_display", "CB-OPTIMIZE-DECIMAL-FOR-DISPLAY", 1, 0, false);
	    declareFunction("simple_el_decimal_p", "SIMPLE-EL-DECIMAL-P", 1, 0, false);
	    declareFunction("cb_fraction_to_optimize_for_displayP", "CB-FRACTION-TO-OPTIMIZE-FOR-DISPLAY?", 1, 0, false);
	    declareFunction("cb_show_fraction_optimized_for_display", "CB-SHOW-FRACTION-OPTIMIZED-FOR-DISPLAY", 3, 0, false);
	    declareFunction("optimized_html_for_fraction", "OPTIMIZED-HTML-FOR-FRACTION", 1, 0, false);
	    declareFunction("cb_hl_support_to_displayP", "CB-HL-SUPPORT-TO-DISPLAY?", 1, 0, false);
	    declareFunction("cb_show_hl_support_for_cons_method", "CB-SHOW-HL-SUPPORT-FOR-CONS-METHOD", 3, 0, false);
	    declareFunction("cb_unimplemented", "CB-UNIMPLEMENTED", 1, 0, false);
	    declareFunction("cb_link_unimplemented", "CB-LINK-UNIMPLEMENTED", 1, 0, false);
	    declareFunction("cb_form_item_list", "CB-FORM-ITEM-LIST", 1, 0, false);
	    declareFunction("cb_show_assertion_in_nl", "CB-SHOW-ASSERTION-IN-NL", 1, 0, false);
	    declareFunction("cb_show_sentence_in_nl", "CB-SHOW-SENTENCE-IN-NL", 1, 1, false);
	    declareFunction("cb_show_question_in_nl", "CB-SHOW-QUESTION-IN-NL", 1, 1, false);
	    declareFunction("cb_show_term_in_nl", "CB-SHOW-TERM-IN-NL", 1, 1, false);
	    declareFunction("cb_show_in_nl_int", "CB-SHOW-IN-NL-INT", 3, 0, false);
	    declareFunction("cb_html_for_obj_in_nl", "CB-HTML-FOR-OBJ-IN-NL", 3, 1, false);
	    declareFunction("cb_html_for_obj_in_nl_values", "CB-HTML-FOR-OBJ-IN-NL-VALUES", 2, 0, false);
	    declareFunction("cb_show_term", "CB-SHOW-TERM", 1, 2, false);
	    declareFunction("cb_show_assertion_readably", "CB-SHOW-ASSERTION-READABLY", 1, 2, false);
	    declareMacro("when_filtered_assertion", "WHEN-FILTERED-ASSERTION");
	    declareMacro("without_assertion_filters", "WITHOUT-ASSERTION-FILTERS");
	    declareFunction("cb_assertion_link", "CB-ASSERTION-LINK", 1, 1, false);
	    declareFunction("cb_assertion_link_with_mt", "CB-ASSERTION-LINK-WITH-MT", 1, 1, false);
	    declareFunction("cb_assertion_link_binary", "CB-ASSERTION-LINK-BINARY", 1, 1, false);
	    declareFunction("cb_show_hl_support_readably", "CB-SHOW-HL-SUPPORT-READABLY", 1, 1, false);
	    declareFunction("cb_show_hl_support_formula_readably", "CB-SHOW-HL-SUPPORT-FORMULA-READABLY", 1, 0, false);
	    declareFunction("cb_show_el_assertion_readably", "CB-SHOW-EL-ASSERTION-READABLY", 1, 3, false);
	    declareFunction("cb_assertion_el_formula", "CB-ASSERTION-EL-FORMULA", 1, 1, false);
	    declareFunction("cb_el_assertion_link_checking_redundancy", "CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY", 1, 1, false);
	    declareFunction("cb_el_assertion_link_with_mt_checking_redundancy", "CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY", 1, 1, false);
	    declareFunction("cb_el_assertion_link_binary_checking_redundancy", "CB-EL-ASSERTION-LINK-BINARY-CHECKING-REDUNDANCY", 1, 1, false);
	    declareFunction("cb_term_of_unit_link", "CB-TERM-OF-UNIT-LINK", 1, 1, false);
	    declareFunction("cb_index_hook_p", "CB-INDEX-HOOK-P", 1, 0, false);
	    declareFunction("cb_index_identifier", "CB-INDEX-IDENTIFIER", 1, 0, false);
	    declareFunction("cb_fort_identifier", "CB-FORT-IDENTIFIER", 1, 0, false);
	    declareFunction("cb_assertion_identifier", "CB-ASSERTION-IDENTIFIER", 1, 0, false);
	    declareFunction("cb_term_identifier", "CB-TERM-IDENTIFIER", 1, 0, false);
	    declareFunction("cb_valid_fort_identifierP", "CB-VALID-FORT-IDENTIFIER?", 1, 0, false);
	    declareFunction("cb_hlmt_identifier", "CB-HLMT-IDENTIFIER", 1, 0, false);
	    declareFunction("cb_valid_hlmt_identifierP", "CB-VALID-HLMT-IDENTIFIER?", 1, 0, false);
	    declareFunction("cb_guess_constant", "CB-GUESS-CONSTANT", 1, 0, false);
	    declareFunction("cb_guess_constant_from_string", "CB-GUESS-CONSTANT-FROM-STRING", 1, 0, false);
	    declareFunction("cb_guess_nart", "CB-GUESS-NART", 1, 0, false);
	    declareFunction("cb_guess_nat", "CB-GUESS-NAT", 1, 0, false);
	    declareFunction("cb_fort_display_string", "CB-FORT-DISPLAY-STRING", 1, 0, false);
	    declareFunction("cb_string_for_fort", "CB-STRING-FOR-FORT", 1, 0, false);
	    declareFunction("cb_guess_fort", "CB-GUESS-FORT", 1, 1, false);
	    declareFunction("cb_guess_fort_from_id", "CB-GUESS-FORT-FROM-ID", 1, 0, false);
	    declareFunction("cb_guess_fort_from_non_id", "CB-GUESS-FORT-FROM-NON-ID", 1, 0, false);
	    declareFunction("cb_naut_identifierP", "CB-NAUT-IDENTIFIER?", 1, 0, false);
	    declareFunction("cb_naut_identifier", "CB-NAUT-IDENTIFIER", 1, 0, false);
	    declareFunction("cb_naut_identifier_string", "CB-NAUT-IDENTIFIER-STRING", 1, 0, false);
	    declareFunction("cb_naut_display_string", "CB-NAUT-DISPLAY-STRING", 1, 0, false);
	    declareFunction("cb_string_for_naut", "CB-STRING-FOR-NAUT", 1, 0, false);
	    declareFunction("cb_guess_naut", "CB-GUESS-NAUT", 1, 1, false);
	    declareFunction("cb_guess_naut_spec", "CB-GUESS-NAUT-SPEC", 1, 0, false);
	    declareFunction("cb_sentence_identifierP", "CB-SENTENCE-IDENTIFIER?", 1, 0, false);
	    declareFunction("cb_sentence_identifier_string", "CB-SENTENCE-IDENTIFIER-STRING", 1, 0, false);
	    declareFunction("cb_string_for_sentence", "CB-STRING-FOR-SENTENCE", 1, 0, false);
	    declareFunction("cb_guess_sentence", "CB-GUESS-SENTENCE", 1, 0, false);
	    declareFunction("cb_assertion_identifierP", "CB-ASSERTION-IDENTIFIER?", 1, 0, false);
	    declareFunction("cb_assertion_identifier_string", "CB-ASSERTION-IDENTIFIER-STRING", 1, 0, false);
	    declareFunction("cb_string_for_assertion", "CB-STRING-FOR-ASSERTION", 1, 0, false);
	    declareFunction("cb_term_display_string", "CB-TERM-DISPLAY-STRING", 1, 0, false);
	    declareFunction("cb_string_for_term", "CB-STRING-FOR-TERM", 1, 0, false);
	    declareFunction("cb_guess_term", "CB-GUESS-TERM", 1, 1, false);
	    declareFunction("cb_hlmt_display_string", "CB-HLMT-DISPLAY-STRING", 1, 0, false);
	    declareFunction("cb_string_for_hlmt", "CB-STRING-FOR-HLMT", 1, 0, false);
	    declareFunction("cb_guess_hlmt", "CB-GUESS-HLMT", 1, 0, false);
	    declareFunction("cb_guess_date", "CB-GUESS-DATE", 1, 0, false);
	    declareFunction("cb_guess_time_parameter", "CB-GUESS-TIME-PARAMETER", 1, 0, false);
	    declareFunction("cb_time_interval_display_string", "CB-TIME-INTERVAL-DISPLAY-STRING", 1, 0, false);
	    declareFunction("cb_time_parameter_display_string", "CB-TIME-PARAMETER-DISPLAY-STRING", 1, 0, false);
	    declareFunction("cb_show_assertion_hlmt_readably", "CB-SHOW-ASSERTION-HLMT-READABLY", 1, 0, false);
	    declareFunction("cb_show_assertion_hlmt_time_interval_and_parameter", "CB-SHOW-ASSERTION-HLMT-TIME-INTERVAL-AND-PARAMETER", 1, 0, false);
	    declareFunction("cb_mt_display_string", "CB-MT-DISPLAY-STRING", 1, 0, false);
	    declareFunction("cb_string_for_mt", "CB-STRING-FOR-MT", 1, 0, false);
	    declareFunction("cb_guess_mt", "CB-GUESS-MT", 1, 0, false);
	    declareFunction("cb_guess_index", "CB-GUESS-INDEX", 1, 0, false);
	    declareFunction("cb_guess_assertion", "CB-GUESS-ASSERTION", 1, 0, false);
	    declareFunction("cb_guess_deduction", "CB-GUESS-DEDUCTION", 1, 0, false);
	    declareFunction("prompt_for_simple_date", "PROMPT-FOR-SIMPLE-DATE", 2, 0, false);
	    declareFunction("read_args_for_simple_date", "READ-ARGS-FOR-SIMPLE-DATE", 2, 0, false);
	    declareFunction("read_multiple_terms_from_string", "READ-MULTIPLE-TERMS-FROM-STRING", 1, 0, false);
	    declareFunction("asserted_reviewer", "ASSERTED-REVIEWER", 1, 0, false);
	    declareFunction("cb_show_unmatched_parentheses", "CB-SHOW-UNMATCHED-PARENTHESES", 1, 0, false);
	    declareFunction("cb_show_invalid_constants", "CB-SHOW-INVALID-CONSTANTS", 1, 1, false);
	    declareFunction("cb_show_eof_explanation", "CB-SHOW-EOF-EXPLANATION", 1, 0, false);
	    declareFunction("cb_show_reader_error_explanation", "CB-SHOW-READER-ERROR-EXPLANATION", 1, 0, false);
	    declareFunction("cb_show_symbols_for_invalid_constants", "CB-SHOW-SYMBOLS-FOR-INVALID-CONSTANTS", 1, 0, false);
	    declareFunction("cb_show_non_sentence_explanation", "CB-SHOW-NON-SENTENCE-EXPLANATION", 1, 0, false);
	    declareFunction("cb_fort_encoding_id", "CB-FORT-ENCODING-ID", 1, 0, false);
	    declareFunction("cb_fort_list_selector", "CB-FORT-LIST-SELECTOR", 2, 5, false);
	    declareFunction("cb_decode_fort_list_selector_result", "CB-DECODE-FORT-LIST-SELECTOR-RESULT", 2, 0, false);
	    declareFunction("cb_fort_list_none_selected_p", "CB-FORT-LIST-NONE-SELECTED-P", 1, 0, false);
	    declareFunction("cb_instances_of_collection_selector", "CB-INSTANCES-OF-COLLECTION-SELECTOR", 2, 3, false);
	    declareFunction("cb_decode_instances_of_collection_selector", "CB-DECODE-INSTANCES-OF-COLLECTION-SELECTOR", 2, 0, false);
	    declareFunction("cyclist_recent_terms", "CYCLIST-RECENT-TERMS", 1, 0, false);
	    declareFunction("cb_inactive_left_arrow", "CB-INACTIVE-LEFT-ARROW", 0, 0, false);
	    declareFunction("cb_inactive_right_arrow", "CB-INACTIVE-RIGHT-ARROW", 0, 0, false);
	    declareFunction("cb_left_arrow", "CB-LEFT-ARROW", 2, 1, false);
	    declareFunction("cb_right_arrow", "CB-RIGHT-ARROW", 2, 1, false);
	    declareFunction("cb_directional_arrow", "CB-DIRECTIONAL-ARROW", 4, 0, false);
	    declareFunction("cb_directional_arrow_marker", "CB-DIRECTIONAL-ARROW-MARKER", 1, 0, false);
	}
	if (SubLFiles.USE_V2) {
	    declareFunction("cb_sort_mts_for_display", "CB-SORT-MTS-FOR-DISPLAY", 1, 0, false);
	    declareFunction("mt_starts_before_starting_ofP", "MT-STARTS-BEFORE-STARTING-OF?", 2, 0, false);
	    declareFunction("mt_ends_before_ending_ofP", "MT-ENDS-BEFORE-ENDING-OF?", 2, 0, false);
	    declareFunction("cb_form_assertion_formula", "CB-FORM-ASSERTION-FORMULA", 2, 2, false);
	}
	return NIL;
    }

    public static SubLObject declare_cb_utilities_file_Previous() {
	declareFunction("cb_url", "CB-URL", 1, 5, false);
	declareFunction("cb_error", "CB-ERROR", 1, 5, false);
	declareFunction("cb_show_fi_error", "CB-SHOW-FI-ERROR", 1, 0, false);
	declareFunction("cb_simple_message_page", "CB-SIMPLE-MESSAGE-PAGE", 1, 2, false);
	declareFunction("cb_history_with_back_link", "CB-HISTORY-WITH-BACK-LINK", 0, 1, false);
	declareFunction("cb_message_page_with_history", "CB-MESSAGE-PAGE-WITH-HISTORY", 1, 1, false);
	declareFunction("cb_titled_message_page_with_history", "CB-TITLED-MESSAGE-PAGE-WITH-HISTORY", 2, 1, false);
	declareFunction("cb_frame_update_message_page_info", "CB-FRAME-UPDATE-MESSAGE-PAGE-INFO", 1, 0, false);
	declareFunction("cb_show_truth", "CB-SHOW-TRUTH", 1, 0, false);
	declareFunction("cb_show_strength", "CB-SHOW-STRENGTH", 1, 0, false);
	declareFunction("cb_show_direction", "CB-SHOW-DIRECTION", 1, 0, false);
	declareFunction("cb_show_support_module", "CB-SHOW-SUPPORT-MODULE", 1, 0, false);
	declareFunction("cb_term_font_size", "CB-TERM-FONT-SIZE", 1, 2, false);
	declareFunction("cb_show_date", "CB-SHOW-DATE", 1, 0, false);
	declareFunction("cb_show_second", "CB-SHOW-SECOND", 1, 0, false);
	declareFunction("cb_show_cyclist", "CB-SHOW-CYCLIST", 1, 0, false);
	declareFunction("clear_cb_html_for_cyclist_in_nl", "CLEAR-CB-HTML-FOR-CYCLIST-IN-NL", 0, 0, false);
	declareFunction("remove_cb_html_for_cyclist_in_nl", "REMOVE-CB-HTML-FOR-CYCLIST-IN-NL", 1, 2, false);
	declareFunction("cb_html_for_cyclist_in_nl_internal", "CB-HTML-FOR-CYCLIST-IN-NL-INTERNAL", 3, 0, false);
	declareFunction("cb_html_for_cyclist_in_nl", "CB-HTML-FOR-CYCLIST-IN-NL", 1, 2, false);
	declareFunction("cyc_system_doc_rename_kill", "CYC-SYSTEM-DOC-RENAME-KILL", 0, 0, false);
	declareFunction("cyc_system_doc_naming_conventions", "CYC-SYSTEM-DOC-NAMING-CONVENTIONS", 0, 0, false);
	declareFunction("cyc_documentation_toc", "CYC-DOCUMENTATION-TOC", 0, 0, false);
	declareFunction("cb_doc_link", "CB-DOC-LINK", 3, 1, false);
	declareFunction("cb_show_boolean", "CB-SHOW-BOOLEAN", 1, 0, false);
	declareFunction("boolean_yes_no_string", "BOOLEAN-YES-NO-STRING", 1, 0, false);
	declareFunction("cb_available_tools", "CB-AVAILABLE-TOOLS", 0, 0, false);
	declareFunction("cb_standard_tools", "CB-STANDARD-TOOLS", 0, 0, false);
	declareFunction("cb_deprecated_tools", "CB-DEPRECATED-TOOLS", 0, 0, false);
	declareFunction("cb_clear_available_tools", "CB-CLEAR-AVAILABLE-TOOLS", 0, 0, false);
	declareFunction("declare_cb_tool", "DECLARE-CB-TOOL", 4, 0, false);
	declareFunction("declare_deprecated_cb_tool", "DECLARE-DEPRECATED-CB-TOOL", 4, 0, false);
	declareFunction("undeclare_cb_tool", "UNDECLARE-CB-TOOL", 1, 0, false);
	declareFunction("cb_tool_name", "CB-TOOL-NAME", 1, 0, false);
	declareFunction("cb_tool_abbreviation", "CB-TOOL-ABBREVIATION", 1, 0, false);
	declareFunction("cb_definitional_preds_for_type", "CB-DEFINITIONAL-PREDS-FOR-TYPE", 1, 0, false);
	declareFunction("cb_definitional_preds_for_fort", "CB-DEFINITIONAL-PREDS-FOR-FORT", 1, 0, false);
	declareFunction("cb_sort_preds_for_display", "CB-SORT-PREDS-FOR-DISPLAY", 2, 1, false);
	declareFunction("cb_sort_mts_for_display", "CB-SORT-MTS-FOR-DISPLAY", 1, 1, false);
	declareFunction("mt_start_universal_time_extended", "MT-START-UNIVERSAL-TIME-EXTENDED", 1, 1, false);
	declareFunction("mt_end_universal_time_extended", "MT-END-UNIVERSAL-TIME-EXTENDED", 1, 1, false);
	declareFunction("get_mt_time_interval_memoized_internal", "GET-MT-TIME-INTERVAL-MEMOIZED-INTERNAL", 1, 0, false);
	declareFunction("get_mt_time_interval_memoized", "GET-MT-TIME-INTERVAL-MEMOIZED", 1, 0, false);
	declareFunction("maybe_cycl_second_to_universal_time_extended_internal", "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED-INTERNAL", 1, 1, false);
	declareFunction("maybe_cycl_second_to_universal_time_extended", "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED", 1, 1, false);
	declareFunction("maybe_cycl_second_to_universal_time_extended_low", "MAYBE-CYCL-SECOND-TO-UNIVERSAL-TIME-EXTENDED-LOW", 1, 1, false);
	declareFunction("cb_sort_args_for_display", "CB-SORT-ARGS-FOR-DISPLAY", 1, 0, false);
	declareFunction("cb_group_hlmts_by_monad_mt", "CB-GROUP-HLMTS-BY-MONAD-MT", 1, 0, false);
	declareFunction("cb_back_button", "CB-BACK-BUTTON", 0, 2, false);
	declareFunction("register_cb_frame", "REGISTER-CB-FRAME", 2, 4, false);
	declareFunction("deregister_cb_frame", "DEREGISTER-CB-FRAME", 1, 0, false);
	declareFunction("cb_frame_info", "CB-FRAME-INFO", 1, 0, false);
	declareFunction("cb_frame_name", "CB-FRAME-NAME", 1, 0, false);
	declareFunction("cb_frame", "CB-FRAME", 1, 4, false);
	declareFunction("cb_link", "CB-LINK", 1, 5, false);
	declareFunction("setup_cb_link_method", "SETUP-CB-LINK-METHOD", 3, 0, false);
	declareFunction("cb_link_method", "CB-LINK-METHOD", 1, 0, false);
	declareFunction("cb_link_max_args", "CB-LINK-MAX-ARGS", 1, 0, false);
	declareFunction("cb_link_constant", "CB-LINK-CONSTANT", 1, 2, false);
	declareFunction("cb_nat_span_id", "CB-NAT-SPAN-ID", 1, 1, false);
	declareFunction("cb_link_nart", "CB-LINK-NART", 1, 2, false);
	declareFunction("cb_link_nat", "CB-LINK-NAT", 1, 1, false);
	declareFunction("cb_link_naut", "CB-LINK-NAUT", 1, 2, false);
	declareFunction("cb_naut_href", "CB-NAUT-HREF", 1, 0, false);
	declareFunction("cb_link_lexicon", "CB-LINK-LEXICON", 1, 0, false);
	declareFunction("cb_link_unnamed", "CB-LINK-UNNAMED", 1, 0, false);
	declareFunction("cb_link_assertion", "CB-LINK-ASSERTION", 1, 0, false);
	declareFunction("cb_link_method_assertion_internal", "CB-LINK-METHOD-ASSERTION-INTERNAL", 4, 0, false);
	declareFunction("cb_assertion_utility_color", "CB-ASSERTION-UTILITY-COLOR", 1, 0, false);
	declareFunction("clear_html_saturated_red_color", "CLEAR-HTML-SATURATED-RED-COLOR", 0, 0, false);
	declareFunction("remove_html_saturated_red_color", "REMOVE-HTML-SATURATED-RED-COLOR", 1, 1, false);
	declareFunction("html_saturated_red_color_internal", "HTML-SATURATED-RED-COLOR-INTERNAL", 2, 0, false);
	declareFunction("html_saturated_red_color", "HTML-SATURATED-RED-COLOR", 1, 1, false);
	declareFunction("clear_html_saturated_green_color", "CLEAR-HTML-SATURATED-GREEN-COLOR", 0, 0, false);
	declareFunction("remove_html_saturated_green_color", "REMOVE-HTML-SATURATED-GREEN-COLOR", 1, 1, false);
	declareFunction("html_saturated_green_color_internal", "HTML-SATURATED-GREEN-COLOR-INTERNAL", 2, 0, false);
	declareFunction("html_saturated_green_color", "HTML-SATURATED-GREEN-COLOR", 1, 1, false);
	declareFunction("cb_assertion_ball", "CB-ASSERTION-BALL", 1, 1, false);
	declareFunction("assertion_marker", "ASSERTION-MARKER", 1, 0, false);
	declareFunction("html_assertion_marker", "HTML-ASSERTION-MARKER", 1, 1, false);
	declareFunction("html_assertion_marker_tooltip_text", "HTML-ASSERTION-MARKER-TOOLTIP-TEXT", 1, 0, false);
	declareFunction("clear_generate_phrase_for_cyclist", "CLEAR-GENERATE-PHRASE-FOR-CYCLIST", 0, 0, false);
	declareFunction("remove_generate_phrase_for_cyclist", "REMOVE-GENERATE-PHRASE-FOR-CYCLIST", 1, 0, false);
	declareFunction("generate_phrase_for_cyclist_internal", "GENERATE-PHRASE-FOR-CYCLIST-INTERNAL", 1, 0, false);
	declareFunction("generate_phrase_for_cyclist", "GENERATE-PHRASE-FOR-CYCLIST", 1, 0, false);
	declareFunction("cb_link_sentence", "CB-LINK-SENTENCE", 1, 1, false);
	declareFunction("html_sentence_marker", "HTML-SENTENCE-MARKER", 1, 0, false);
	declareFunction("cb_determine_help_target", "CB-DETERMINE-HELP-TARGET", 1, 0, false);
	declareFunction("cb_help", "CB-HELP", 1, 2, false);
	declareFunction("cb_help_preamble", "CB-HELP-PREAMBLE", 1, 2, false);
	declareFunction("cb_form", "CB-FORM", 1, 2, false);
	declareFunction("cb_form_variable_method", "CB-FORM-VARIABLE-METHOD", 1, 2, false);
	declareFunction("cb_form_symbol_method", "CB-FORM-SYMBOL-METHOD", 1, 2, false);
	declareFunction("cb_form_constant_method", "CB-FORM-CONSTANT-METHOD", 1, 2, false);
	declareFunction("cb_form_nart_method", "CB-FORM-NART-METHOD", 1, 2, false);
	declareFunction("cb_form_assertion_method", "CB-FORM-ASSERTION-METHOD", 1, 2, false);
	declareFunction("cb_form_assertion_hl_formula", "CB-FORM-ASSERTION-HL-FORMULA", 1, 2, false);
	declareFunction("cb_form_invalid_assertion", "CB-FORM-INVALID-ASSERTION", 1, 2, false);
	declareFunction("cb_form_assertion_formula", "CB-FORM-ASSERTION-FORMULA", 2, 3, false);
	declareFunction("cb_form_assertion_edit_formula", "CB-FORM-ASSERTION-EDIT-FORMULA", 1, 2, false);
	declareFunction("cb_form_string_method", "CB-FORM-STRING-METHOD", 1, 2, false);
	declareFunction("print_cb_form_cons_methods", "PRINT-CB-FORM-CONS-METHODS", 3, 0, false);
	declareFunction("cb_form_cons_method_print_function_trampoline", "CB-FORM-CONS-METHOD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("cb_form_cons_method_p", "CB-FORM-CONS-METHOD-P", 1, 0, false);
	new cb_utilities.$cb_form_cons_method_p$UnaryFunction();
	declareFunction("cb_form_cons_method_name", "CB-FORM-CONS-METHOD-NAME", 1, 0, false);
	declareFunction("cb_form_cons_method_keyword", "CB-FORM-CONS-METHOD-KEYWORD", 1, 0, false);
	declareFunction("cb_form_cons_method_applicability_test_fn", "CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN", 1, 0, false);
	declareFunction("cb_form_cons_method_html_output_fn", "CB-FORM-CONS-METHOD-HTML-OUTPUT-FN", 1, 0, false);
	declareFunction("_csetf_cb_form_cons_method_name", "_CSETF-CB-FORM-CONS-METHOD-NAME", 2, 0, false);
	declareFunction("_csetf_cb_form_cons_method_keyword", "_CSETF-CB-FORM-CONS-METHOD-KEYWORD", 2, 0, false);
	declareFunction("_csetf_cb_form_cons_method_applicability_test_fn", "_CSETF-CB-FORM-CONS-METHOD-APPLICABILITY-TEST-FN", 2, 0, false);
	declareFunction("_csetf_cb_form_cons_method_html_output_fn", "_CSETF-CB-FORM-CONS-METHOD-HTML-OUTPUT-FN", 2, 0, false);
	declareFunction("make_cb_form_cons_method", "MAKE-CB-FORM-CONS-METHOD", 0, 1, false);
	declareFunction("visit_defstruct_cb_form_cons_method", "VISIT-DEFSTRUCT-CB-FORM-CONS-METHOD", 2, 0, false);
	declareFunction("visit_defstruct_object_cb_form_cons_method_method", "VISIT-DEFSTRUCT-OBJECT-CB-FORM-CONS-METHOD-METHOD", 2, 0, false);
	declareMacro("defcb_form_cons_method", "DEFCB-FORM-CONS-METHOD");
	declareFunction("register_cb_form_cons_method", "REGISTER-CB-FORM-CONS-METHOD", 2, 0, false);
	declareMacro("with_cb_form_cons_methods", "WITH-CB-FORM-CONS-METHODS");
	declareFunction("compute_cb_form_cons_methods_active", "COMPUTE-CB-FORM-CONS-METHODS-ACTIVE", 1, 0, false);
	declareFunction("cb_form_cons_methods_active", "CB-FORM-CONS-METHODS-ACTIVE", 0, 0, false);
	declareFunction("declare_cb_form_cons_method_always_active", "DECLARE-CB-FORM-CONS-METHOD-ALWAYS-ACTIVE", 1, 0, false);
	declareFunction("always_active_cb_form_cons_methods", "ALWAYS-ACTIVE-CB-FORM-CONS-METHODS", 0, 0, false);
	declareFunction("cb_form_cons_method_keyword_to_cb_form_cons_method", "CB-FORM-CONS-METHOD-KEYWORD-TO-CB-FORM-CONS-METHOD", 1, 0, false);
	declareFunction("top_level_cb_form_url", "TOP-LEVEL-CB-FORM-URL", 1, 0, false);
	declareFunction("cb_form_string", "CB-FORM-STRING", 1, 1, false);
	declareFunction("get_url_prefix_for_url_type", "GET-URL-PREFIX-FOR-URL-TYPE", 1, 0, false);
	declareFunction("cb_formula_argument_limit_exceededP", "CB-FORMULA-ARGUMENT-LIMIT-EXCEEDED?", 1, 0, false);
	declareFunction("cb_form_cons_method", "CB-FORM-CONS-METHOD", 1, 2, false);
	declareFunction("cb_form_cons_internal", "CB-FORM-CONS-INTERNAL", 3, 0, false);
	declareFunction("cb_form_cons_inter_arg_space", "CB-FORM-CONS-INTER-ARG-SPACE", 0, 0, false);
	declareFunction("cb_date_to_optimize_for_displayP", "CB-DATE-TO-OPTIMIZE-FOR-DISPLAY?", 1, 0, false);
	declareFunction("cb_show_date_optimized_for_display", "CB-SHOW-DATE-OPTIMIZED-FOR-DISPLAY", 3, 0, false);
	declareFunction("cb_possibly_optimize_date_for_display", "CB-POSSIBLY-OPTIMIZE-DATE-FOR-DISPLAY", 1, 0, false);
	declareFunction("cb_optimize_date_for_display", "CB-OPTIMIZE-DATE-FOR-DISPLAY", 1, 0, false);
	declareFunction("cb_decimal_to_optimize_for_displayP", "CB-DECIMAL-TO-OPTIMIZE-FOR-DISPLAY?", 1, 0, false);
	declareFunction("cb_show_decimal_optimized_for_display", "CB-SHOW-DECIMAL-OPTIMIZED-FOR-DISPLAY", 3, 0, false);
	declareFunction("cb_optimize_decimal_for_display", "CB-OPTIMIZE-DECIMAL-FOR-DISPLAY", 1, 0, false);
	declareFunction("simple_el_decimal_p", "SIMPLE-EL-DECIMAL-P", 1, 0, false);
	declareFunction("cb_fraction_to_optimize_for_displayP", "CB-FRACTION-TO-OPTIMIZE-FOR-DISPLAY?", 1, 0, false);
	declareFunction("cb_show_fraction_optimized_for_display", "CB-SHOW-FRACTION-OPTIMIZED-FOR-DISPLAY", 3, 0, false);
	declareFunction("optimized_html_for_fraction", "OPTIMIZED-HTML-FOR-FRACTION", 1, 0, false);
	declareFunction("cb_hl_support_to_displayP", "CB-HL-SUPPORT-TO-DISPLAY?", 1, 0, false);
	declareFunction("cb_show_hl_support_for_cons_method", "CB-SHOW-HL-SUPPORT-FOR-CONS-METHOD", 3, 0, false);
	declareFunction("cb_unimplemented", "CB-UNIMPLEMENTED", 1, 0, false);
	declareFunction("cb_link_unimplemented", "CB-LINK-UNIMPLEMENTED", 1, 0, false);
	declareFunction("cb_form_item_list", "CB-FORM-ITEM-LIST", 1, 0, false);
	declareFunction("cb_show_assertion_in_nl", "CB-SHOW-ASSERTION-IN-NL", 1, 0, false);
	declareFunction("cb_show_sentence_in_nl", "CB-SHOW-SENTENCE-IN-NL", 1, 1, false);
	declareFunction("cb_show_question_in_nl", "CB-SHOW-QUESTION-IN-NL", 1, 1, false);
	declareFunction("cb_show_term_in_nl", "CB-SHOW-TERM-IN-NL", 1, 1, false);
	declareFunction("cb_show_in_nl_int", "CB-SHOW-IN-NL-INT", 3, 0, false);
	declareFunction("cb_html_for_obj_in_nl", "CB-HTML-FOR-OBJ-IN-NL", 3, 1, false);
	declareFunction("cb_html_for_obj_in_nl_values", "CB-HTML-FOR-OBJ-IN-NL-VALUES", 2, 0, false);
	declareFunction("cb_show_term", "CB-SHOW-TERM", 1, 2, false);
	declareFunction("cb_show_assertion_readably", "CB-SHOW-ASSERTION-READABLY", 1, 2, false);
	declareMacro("when_filtered_assertion", "WHEN-FILTERED-ASSERTION");
	declareMacro("without_assertion_filters", "WITHOUT-ASSERTION-FILTERS");
	declareFunction("cb_assertion_link", "CB-ASSERTION-LINK", 1, 1, false);
	declareFunction("cb_assertion_link_with_mt", "CB-ASSERTION-LINK-WITH-MT", 1, 1, false);
	declareFunction("cb_assertion_link_binary", "CB-ASSERTION-LINK-BINARY", 1, 1, false);
	declareFunction("cb_show_hl_support_readably", "CB-SHOW-HL-SUPPORT-READABLY", 1, 1, false);
	declareFunction("cb_show_hl_support_formula_readably", "CB-SHOW-HL-SUPPORT-FORMULA-READABLY", 1, 0, false);
	declareFunction("cb_show_el_assertion_readably", "CB-SHOW-EL-ASSERTION-READABLY", 1, 3, false);
	declareFunction("cb_assertion_el_formula", "CB-ASSERTION-EL-FORMULA", 1, 1, false);
	declareFunction("cb_el_assertion_link_checking_redundancy", "CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY", 1, 1, false);
	declareFunction("cb_el_assertion_link_with_mt_checking_redundancy", "CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY", 1, 1, false);
	declareFunction("cb_el_assertion_link_binary_checking_redundancy", "CB-EL-ASSERTION-LINK-BINARY-CHECKING-REDUNDANCY", 1, 1, false);
	declareFunction("cb_term_of_unit_link", "CB-TERM-OF-UNIT-LINK", 1, 1, false);
	declareFunction("cb_index_hook_p", "CB-INDEX-HOOK-P", 1, 0, false);
	declareFunction("cb_index_identifier", "CB-INDEX-IDENTIFIER", 1, 0, false);
	declareFunction("cb_fort_identifier", "CB-FORT-IDENTIFIER", 1, 0, false);
	declareFunction("cb_assertion_identifier", "CB-ASSERTION-IDENTIFIER", 1, 0, false);
	declareFunction("cb_term_identifier", "CB-TERM-IDENTIFIER", 1, 0, false);
	declareFunction("cb_valid_fort_identifierP", "CB-VALID-FORT-IDENTIFIER?", 1, 0, false);
	declareFunction("cb_hlmt_identifier", "CB-HLMT-IDENTIFIER", 1, 0, false);
	declareFunction("cb_valid_hlmt_identifierP", "CB-VALID-HLMT-IDENTIFIER?", 1, 0, false);
	declareFunction("cb_guess_constant", "CB-GUESS-CONSTANT", 1, 0, false);
	declareFunction("cb_guess_constant_from_string", "CB-GUESS-CONSTANT-FROM-STRING", 1, 0, false);
	declareFunction("cb_guess_nart", "CB-GUESS-NART", 1, 0, false);
	declareFunction("cb_guess_nat", "CB-GUESS-NAT", 1, 0, false);
	declareFunction("cb_fort_display_string", "CB-FORT-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_string_for_fort", "CB-STRING-FOR-FORT", 1, 0, false);
	declareFunction("cb_guess_fort", "CB-GUESS-FORT", 1, 1, false);
	declareFunction("cb_guess_fort_from_id", "CB-GUESS-FORT-FROM-ID", 1, 0, false);
	declareFunction("cb_guess_fort_from_non_id", "CB-GUESS-FORT-FROM-NON-ID", 1, 0, false);
	declareFunction("cb_naut_identifierP", "CB-NAUT-IDENTIFIER?", 1, 0, false);
	declareFunction("cb_naut_identifier", "CB-NAUT-IDENTIFIER", 1, 0, false);
	declareFunction("cb_naut_identifier_string", "CB-NAUT-IDENTIFIER-STRING", 1, 0, false);
	declareFunction("cb_naut_display_string", "CB-NAUT-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_string_for_naut", "CB-STRING-FOR-NAUT", 1, 0, false);
	declareFunction("cb_guess_naut", "CB-GUESS-NAUT", 1, 1, false);
	declareFunction("cb_guess_naut_spec", "CB-GUESS-NAUT-SPEC", 1, 0, false);
	declareFunction("cb_sentence_identifierP", "CB-SENTENCE-IDENTIFIER?", 1, 0, false);
	declareFunction("cb_sentence_identifier_string", "CB-SENTENCE-IDENTIFIER-STRING", 1, 0, false);
	declareFunction("cb_string_for_sentence", "CB-STRING-FOR-SENTENCE", 1, 0, false);
	declareFunction("cb_guess_sentence", "CB-GUESS-SENTENCE", 1, 0, false);
	declareFunction("cb_assertion_identifierP", "CB-ASSERTION-IDENTIFIER?", 1, 0, false);
	declareFunction("cb_assertion_identifier_string", "CB-ASSERTION-IDENTIFIER-STRING", 1, 0, false);
	declareFunction("cb_string_for_assertion", "CB-STRING-FOR-ASSERTION", 1, 0, false);
	declareFunction("cb_term_display_string", "CB-TERM-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_string_for_term", "CB-STRING-FOR-TERM", 1, 0, false);
	declareFunction("cb_guess_term", "CB-GUESS-TERM", 1, 1, false);
	declareFunction("cb_hlmt_display_string", "CB-HLMT-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_string_for_hlmt", "CB-STRING-FOR-HLMT", 1, 0, false);
	declareFunction("cb_guess_hlmt", "CB-GUESS-HLMT", 1, 0, false);
	declareFunction("cb_guess_date", "CB-GUESS-DATE", 1, 0, false);
	declareFunction("cb_guess_time_parameter", "CB-GUESS-TIME-PARAMETER", 1, 0, false);
	declareFunction("cb_time_interval_display_string", "CB-TIME-INTERVAL-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_time_parameter_display_string", "CB-TIME-PARAMETER-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_show_assertion_hlmt_readably", "CB-SHOW-ASSERTION-HLMT-READABLY", 1, 0, false);
	declareFunction("cb_show_assertion_hlmt_time_interval_and_parameter", "CB-SHOW-ASSERTION-HLMT-TIME-INTERVAL-AND-PARAMETER", 1, 0, false);
	declareFunction("cb_mt_display_string", "CB-MT-DISPLAY-STRING", 1, 0, false);
	declareFunction("cb_string_for_mt", "CB-STRING-FOR-MT", 1, 0, false);
	declareFunction("cb_guess_mt", "CB-GUESS-MT", 1, 0, false);
	declareFunction("cb_guess_index", "CB-GUESS-INDEX", 1, 0, false);
	declareFunction("cb_guess_assertion", "CB-GUESS-ASSERTION", 1, 0, false);
	declareFunction("cb_guess_deduction", "CB-GUESS-DEDUCTION", 1, 0, false);
	declareFunction("prompt_for_simple_date", "PROMPT-FOR-SIMPLE-DATE", 2, 0, false);
	declareFunction("read_args_for_simple_date", "READ-ARGS-FOR-SIMPLE-DATE", 2, 0, false);
	declareFunction("read_multiple_terms_from_string", "READ-MULTIPLE-TERMS-FROM-STRING", 1, 0, false);
	declareFunction("asserted_reviewer", "ASSERTED-REVIEWER", 1, 0, false);
	declareFunction("cb_show_unmatched_parentheses", "CB-SHOW-UNMATCHED-PARENTHESES", 1, 0, false);
	declareFunction("cb_show_invalid_constants", "CB-SHOW-INVALID-CONSTANTS", 1, 1, false);
	declareFunction("cb_show_eof_explanation", "CB-SHOW-EOF-EXPLANATION", 1, 0, false);
	declareFunction("cb_show_reader_error_explanation", "CB-SHOW-READER-ERROR-EXPLANATION", 1, 0, false);
	declareFunction("cb_show_symbols_for_invalid_constants", "CB-SHOW-SYMBOLS-FOR-INVALID-CONSTANTS", 1, 0, false);
	declareFunction("cb_show_non_sentence_explanation", "CB-SHOW-NON-SENTENCE-EXPLANATION", 1, 0, false);
	declareFunction("cb_fort_encoding_id", "CB-FORT-ENCODING-ID", 1, 0, false);
	declareFunction("cb_fort_list_selector", "CB-FORT-LIST-SELECTOR", 2, 5, false);
	declareFunction("cb_decode_fort_list_selector_result", "CB-DECODE-FORT-LIST-SELECTOR-RESULT", 2, 0, false);
	declareFunction("cb_fort_list_none_selected_p", "CB-FORT-LIST-NONE-SELECTED-P", 1, 0, false);
	declareFunction("cb_instances_of_collection_selector", "CB-INSTANCES-OF-COLLECTION-SELECTOR", 2, 3, false);
	declareFunction("cb_decode_instances_of_collection_selector", "CB-DECODE-INSTANCES-OF-COLLECTION-SELECTOR", 2, 0, false);
	declareFunction("cyclist_recent_terms", "CYCLIST-RECENT-TERMS", 1, 0, false);
	declareFunction("cb_inactive_left_arrow", "CB-INACTIVE-LEFT-ARROW", 0, 0, false);
	declareFunction("cb_inactive_right_arrow", "CB-INACTIVE-RIGHT-ARROW", 0, 0, false);
	declareFunction("cb_left_arrow", "CB-LEFT-ARROW", 2, 1, false);
	declareFunction("cb_right_arrow", "CB-RIGHT-ARROW", 2, 1, false);
	declareFunction("cb_directional_arrow", "CB-DIRECTIONAL-ARROW", 4, 0, false);
	declareFunction("cb_directional_arrow_marker", "CB-DIRECTIONAL-ARROW-MARKER", 1, 0, false);
	return NIL;
    }

    public static final SubLObject init_cb_utilities_file_alt() {
	deflexical("*CB-HTML-FOR-CYCLIST-IN-NL-CACHING-STATE*", NIL);
	deflexical("*CB-AVAILABLE-TOOLS*", NIL != boundp($cb_available_tools$) ? ((SubLObject) ($cb_available_tools$.getGlobalValue())) : NIL);
	deflexical("*CB-C-DEFINITIONAL-TYPE-PRED-MAP*", $list_alt45);
	deflexical("*CB-BACK-BUTTON-PREDEFINED-SCRIPT*", $str_alt53$onClick___A_history_back____);
	deflexical("*CB-BACK-BUTTON-SCRIPT*", $str_alt54$onClick__var_frame_name_____A___i);
	deflexical("*CB-FRAME-TABLE*", NIL != boundp($cb_frame_table$) ? ((SubLObject) ($cb_frame_table$.getGlobalValue())) : NIL);
	deflexical("*MAX-CB-LINK-ARG-COUNT*", FIVE_INTEGER);
	defparameter("*CB-DEFAULT-FORT-HANDLER*", $str_alt117$cb_cf);
	defparameter("*CB-DEFAULT-NAUT-HANDLER*", $str_alt128$cb_naut_frame);
	deflexical("*HTML-SATURATED-RED-COLOR-CACHING-STATE*", NIL);
	deflexical("*HTML-SATURATED-GREEN-COLOR-CACHING-STATE*", NIL);
	defparameter("*CB-JUST-DID-NAT*", NIL);
	defparameter("*CB-JUST-DID-QUOTE*", NIL);
	defparameter("*CB-FORM-CONS-SUPPRESS-NEWLINE*", NIL);
	deflexical("*CB-FORM-METHOD-TABLE*", make_vector($int$256, NIL));
	defparameter("*RULE-UNLABELLED-DONT-CARE-VARIABLES*", NIL);
	defparameter("*CB-STRING-LENGTH-WRAP*", $int$60);
	defparameter("*CB-WRAP-AFTER-ARG-1*", $list_alt207);
	defparameter("*CB-FORM-CONS-METHODS-ACTIVE*", NIL);
	deflexical("*CB-FORM-CONS-METHODS*", NIL != boundp($cb_form_cons_methods$) ? ((SubLObject) ($cb_form_cons_methods$.getGlobalValue())) : NIL);
	deflexical("*CB-FORM-CONS-METHODS-BY-KEYWORD*", NIL != boundp($cb_form_cons_methods_by_keyword$) ? ((SubLObject) ($cb_form_cons_methods_by_keyword$.getGlobalValue())) : make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
	defconstant("*DTP-CB-FORM-CONS-METHOD*", CB_FORM_CONS_METHOD);
	defparameter("*ALWAYS-ACTIVE-CB-FORM-CONS-METHODS*", NIL);
	defvar("*CB-FORM-SUPPRESS-NAUT-LINK-FUNCTIONS*", NIL);
	defparameter("*CB-JUST-DID-NAUT*", NIL);
	defparameter("*ASSERTION-FILTER-HOOK*", NIL);
	deflexical("*CB-CONSTANT-ID-PREFIX*", $$$c);
	deflexical("*CB-NART-ID-PREFIX*", $$$nart);
	deflexical("*CB-NAUT-ID-PREFIX*", $$$naut);
	deflexical("*CB-NAUT-ID-PREFIX-LENGTH*", length($cb_naut_id_prefix$.getGlobalValue()));
	deflexical("*CB-SENTENCE-ID-PREFIX*", $$$sentence);
	deflexical("*CB-SENTENCE-ID-PREFIX-LENGTH*", length($cb_sentence_id_prefix$.getGlobalValue()));
	defparameter("*HTML-UNMATCHED-PARENTHESIS-COLOR*", $RED);
	return NIL;
    }

    public static SubLObject init_cb_utilities_file() {
	if (SubLFiles.USE_V1) {
	    deflexical("*CB-HTML-FOR-CYCLIST-IN-NL-CACHING-STATE*", NIL);
	    deflexical("*CB-AVAILABLE-TOOLS*", SubLTrampolineFile.maybeDefault($cb_available_tools$, $cb_available_tools$, NIL));
	    deflexical("*CB-C-DEFINITIONAL-TYPE-PRED-MAP*", $list57);
	    defparameter("*CB-MAX-MTS-TO-SORT-TEMPORALLY*", $int$2000);
	    deflexical("*CB-BACK-BUTTON-PREDEFINED-SCRIPT*", $str73$onClick___A_history_back____);
	    deflexical("*CB-BACK-BUTTON-SCRIPT*", $str74$onClick__var_frame_name_____A___i);
	    deflexical("*CB-FRAME-TABLE*", SubLTrampolineFile.maybeDefault($cb_frame_table$, $cb_frame_table$, NIL));
	    deflexical("*MAX-CB-LINK-ARG-COUNT*", FIVE_INTEGER);
	    defparameter("*CB-DEFAULT-FORT-HANDLER*", $str137$cb_cf);
	    defparameter("*CB-DEFAULT-FORT-LINK-EMITTER*", NIL);
	    defparameter("*CB-SHOW-CONSTANT-HASH-DOLLAR-PREFIX?*", NIL);
	    defparameter("*CB-TERM-ID*", NIL);
	    defparameter("*CB-DEFAULT-NAUT-HANDLER*", $str158$cb_naut_frame);
	    deflexical("*HTML-SATURATED-RED-COLOR-CACHING-STATE*", NIL);
	    deflexical("*HTML-SATURATED-GREEN-COLOR-CACHING-STATE*", NIL);
	    deflexical("*GENERATE-PHRASE-FOR-CYCLIST-CACHING-STATE*", NIL);
	    defparameter("*CB-JUST-DID-NAT*", NIL);
	    defparameter("*CB-JUST-DID-QUOTE*", NIL);
	    defparameter("*CB-INSIDE-QUOTE?*", NIL);
	    defparameter("*CB-INSIDE-NAUT*", NIL);
	    defparameter("*CB-INSIDE-NAUT-SUPPORT-ENABLED?*", NIL);
	    defparameter("*CB-FORM-CONS-SUPPRESS-NEWLINE*", NIL);
	    deflexical("*CB-FORM-METHOD-TABLE*", make_vector($int$256, NIL));
	    defparameter("*RULE-UNLABELLED-DONT-CARE-VARIABLES*", NIL);
	    defparameter("*ALLOW-CB-ASSERTION-FOR-THE-ASSERTION-SENTENCE-REPLACEMENT?*", NIL);
	    defparameter("*CB-ASSERTION-FOR-THE-ASSERTION-SENTENCE-REPLACEMENT*", NIL);
	    defparameter("*CB-STRING-LENGTH-WRAP*", $int$60);
	    defparameter("*CB-WRAP-AFTER-ARG-1*", $list255);
	    defparameter("*CB-FORM-CONS-METHODS-ACTIVE*", NIL);
	    deflexical("*CB-FORM-CONS-METHODS*", SubLTrampolineFile.maybeDefault($cb_form_cons_methods$, $cb_form_cons_methods$, NIL));
	    deflexical("*CB-FORM-CONS-METHODS-BY-KEYWORD*", SubLTrampolineFile.maybeDefault($cb_form_cons_methods_by_keyword$, $cb_form_cons_methods_by_keyword$, () -> make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED)));
	    defconstant("*DTP-CB-FORM-CONS-METHOD*", CB_FORM_CONS_METHOD);
	    defparameter("*ALWAYS-ACTIVE-CB-FORM-CONS-METHODS*", NIL);
	    defvar("*CB-FORM-SUPPRESS-NAUT-LINK-FUNCTIONS*", NIL);
	    defparameter("*CB-JUST-DID-NAUT*", NIL);
	    defparameter("*CB-FORMULA-ARGUMENT-LIMIT*", NIL);
	    defparameter("*CB-DISPLAY-DATES-AS-STRINGS?*", T);
	    defparameter("*CB-DISPLAY-DECIMALS-AS-DECIMALS?*", T);
	    defparameter("*CB-DISPLAY-FRACTIONS-AS-FRACTIONS?*", T);
	    defparameter("*ASSERTION-FILTER-HOOK*", NIL);
	    deflexical("*CB-CONSTANT-ID-PREFIX*", $$$c);
	    deflexical("*CB-NART-ID-PREFIX*", $$$nart);
	    deflexical("*CB-ASSERTION-ID-PREFIX*", $$$a);
	    deflexical("*CB-ASSERTION-ID-PREFIX-LENGTH*", length($cb_assertion_id_prefix$.getGlobalValue()));
	    deflexical("*CB-IMAGE-INDEPENDENT-FORT-IDENTIFIERS?*", SubLTrampolineFile.maybeDefault($cb_image_independent_fort_identifiersP$, $cb_image_independent_fort_identifiersP$, NIL));
	    deflexical("*CB-IMAGE-INDEPENDENT-ID-MARKER*", string_utilities.substring(kb_utilities.compact_hl_external_id_string(ONE_INTEGER), ZERO_INTEGER, ONE_INTEGER));
	    deflexical("*CB-IMAGE-INDEPENDENT-CONSTANT-ID-PREFIX*", cconcatenate($cb_constant_id_prefix$.getGlobalValue(), $cb_image_independent_id_marker$.getGlobalValue()));
	    deflexical("*CB-IMAGE-INDEPENDENT-NART-ID-PREFIX*", cconcatenate($cb_nart_id_prefix$.getGlobalValue(), $cb_image_independent_id_marker$.getGlobalValue()));
	    deflexical("*CB-NAUT-ID-PREFIX*", $$$naut);
	    deflexical("*CB-NAUT-ID-PREFIX-LENGTH*", length($cb_naut_id_prefix$.getGlobalValue()));
	    deflexical("*CB-SENTENCE-ID-PREFIX*", $$$sentence);
	    deflexical("*CB-SENTENCE-ID-PREFIX-LENGTH*", length($cb_sentence_id_prefix$.getGlobalValue()));
	    defparameter("*HTML-UNMATCHED-PARENTHESIS-COLOR*", $RED);
	}
	if (SubLFiles.USE_V2) {
	    deflexical("*CB-AVAILABLE-TOOLS*", NIL != boundp($cb_available_tools$) ? ((SubLObject) ($cb_available_tools$.getGlobalValue())) : NIL);
	    deflexical("*CB-C-DEFINITIONAL-TYPE-PRED-MAP*", $list_alt45);
	    deflexical("*CB-BACK-BUTTON-PREDEFINED-SCRIPT*", $str_alt53$onClick___A_history_back____);
	    deflexical("*CB-BACK-BUTTON-SCRIPT*", $str_alt54$onClick__var_frame_name_____A___i);
	    deflexical("*CB-FRAME-TABLE*", NIL != boundp($cb_frame_table$) ? ((SubLObject) ($cb_frame_table$.getGlobalValue())) : NIL);
	    defparameter("*CB-DEFAULT-FORT-HANDLER*", $str_alt117$cb_cf);
	    defparameter("*CB-DEFAULT-NAUT-HANDLER*", $str_alt128$cb_naut_frame);
	    defparameter("*CB-WRAP-AFTER-ARG-1*", $list_alt207);
	    deflexical("*CB-FORM-CONS-METHODS*", NIL != boundp($cb_form_cons_methods$) ? ((SubLObject) ($cb_form_cons_methods$.getGlobalValue())) : NIL);
	    deflexical("*CB-FORM-CONS-METHODS-BY-KEYWORD*", NIL != boundp($cb_form_cons_methods_by_keyword$) ? ((SubLObject) ($cb_form_cons_methods_by_keyword$.getGlobalValue())) : make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
	}
	return NIL;
    }

    public static SubLObject init_cb_utilities_file_Previous() {
	deflexical("*CB-HTML-FOR-CYCLIST-IN-NL-CACHING-STATE*", NIL);
	deflexical("*CB-AVAILABLE-TOOLS*", SubLTrampolineFile.maybeDefault($cb_available_tools$, $cb_available_tools$, NIL));
	deflexical("*CB-C-DEFINITIONAL-TYPE-PRED-MAP*", $list57);
	defparameter("*CB-MAX-MTS-TO-SORT-TEMPORALLY*", $int$2000);
	deflexical("*CB-BACK-BUTTON-PREDEFINED-SCRIPT*", $str73$onClick___A_history_back____);
	deflexical("*CB-BACK-BUTTON-SCRIPT*", $str74$onClick__var_frame_name_____A___i);
	deflexical("*CB-FRAME-TABLE*", SubLTrampolineFile.maybeDefault($cb_frame_table$, $cb_frame_table$, NIL));
	deflexical("*MAX-CB-LINK-ARG-COUNT*", FIVE_INTEGER);
	defparameter("*CB-DEFAULT-FORT-HANDLER*", $str137$cb_cf);
	defparameter("*CB-DEFAULT-FORT-LINK-EMITTER*", NIL);
	defparameter("*CB-SHOW-CONSTANT-HASH-DOLLAR-PREFIX?*", NIL);
	defparameter("*CB-TERM-ID*", NIL);
	defparameter("*CB-DEFAULT-NAUT-HANDLER*", $str158$cb_naut_frame);
	deflexical("*HTML-SATURATED-RED-COLOR-CACHING-STATE*", NIL);
	deflexical("*HTML-SATURATED-GREEN-COLOR-CACHING-STATE*", NIL);
	deflexical("*GENERATE-PHRASE-FOR-CYCLIST-CACHING-STATE*", NIL);
	defparameter("*CB-JUST-DID-NAT*", NIL);
	defparameter("*CB-JUST-DID-QUOTE*", NIL);
	defparameter("*CB-INSIDE-QUOTE?*", NIL);
	defparameter("*CB-INSIDE-NAUT*", NIL);
	defparameter("*CB-INSIDE-NAUT-SUPPORT-ENABLED?*", NIL);
	defparameter("*CB-FORM-CONS-SUPPRESS-NEWLINE*", NIL);
	deflexical("*CB-FORM-METHOD-TABLE*", make_vector($int$256, NIL));
	defparameter("*RULE-UNLABELLED-DONT-CARE-VARIABLES*", NIL);
	defparameter("*ALLOW-CB-ASSERTION-FOR-THE-ASSERTION-SENTENCE-REPLACEMENT?*", NIL);
	defparameter("*CB-ASSERTION-FOR-THE-ASSERTION-SENTENCE-REPLACEMENT*", NIL);
	defparameter("*CB-STRING-LENGTH-WRAP*", $int$60);
	defparameter("*CB-WRAP-AFTER-ARG-1*", $list255);
	defparameter("*CB-FORM-CONS-METHODS-ACTIVE*", NIL);
	deflexical("*CB-FORM-CONS-METHODS*", SubLTrampolineFile.maybeDefault($cb_form_cons_methods$, $cb_form_cons_methods$, NIL));
	deflexical("*CB-FORM-CONS-METHODS-BY-KEYWORD*", SubLTrampolineFile.maybeDefault($cb_form_cons_methods_by_keyword$, $cb_form_cons_methods_by_keyword$, () -> make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED)));
	defconstant("*DTP-CB-FORM-CONS-METHOD*", CB_FORM_CONS_METHOD);
	defparameter("*ALWAYS-ACTIVE-CB-FORM-CONS-METHODS*", NIL);
	defvar("*CB-FORM-SUPPRESS-NAUT-LINK-FUNCTIONS*", NIL);
	defparameter("*CB-JUST-DID-NAUT*", NIL);
	defparameter("*CB-FORMULA-ARGUMENT-LIMIT*", NIL);
	defparameter("*CB-DISPLAY-DATES-AS-STRINGS?*", T);
	defparameter("*CB-DISPLAY-DECIMALS-AS-DECIMALS?*", T);
	defparameter("*CB-DISPLAY-FRACTIONS-AS-FRACTIONS?*", T);
	defparameter("*ASSERTION-FILTER-HOOK*", NIL);
	deflexical("*CB-CONSTANT-ID-PREFIX*", $$$c);
	deflexical("*CB-NART-ID-PREFIX*", $$$nart);
	deflexical("*CB-ASSERTION-ID-PREFIX*", $$$a);
	deflexical("*CB-ASSERTION-ID-PREFIX-LENGTH*", length($cb_assertion_id_prefix$.getGlobalValue()));
	deflexical("*CB-IMAGE-INDEPENDENT-FORT-IDENTIFIERS?*", SubLTrampolineFile.maybeDefault($cb_image_independent_fort_identifiersP$, $cb_image_independent_fort_identifiersP$, NIL));
	deflexical("*CB-IMAGE-INDEPENDENT-ID-MARKER*", string_utilities.substring(kb_utilities.compact_hl_external_id_string(ONE_INTEGER), ZERO_INTEGER, ONE_INTEGER));
	deflexical("*CB-IMAGE-INDEPENDENT-CONSTANT-ID-PREFIX*", cconcatenate($cb_constant_id_prefix$.getGlobalValue(), $cb_image_independent_id_marker$.getGlobalValue()));
	deflexical("*CB-IMAGE-INDEPENDENT-NART-ID-PREFIX*", cconcatenate($cb_nart_id_prefix$.getGlobalValue(), $cb_image_independent_id_marker$.getGlobalValue()));
	deflexical("*CB-NAUT-ID-PREFIX*", $$$naut);
	deflexical("*CB-NAUT-ID-PREFIX-LENGTH*", length($cb_naut_id_prefix$.getGlobalValue()));
	deflexical("*CB-SENTENCE-ID-PREFIX*", $$$sentence);
	deflexical("*CB-SENTENCE-ID-PREFIX-LENGTH*", length($cb_sentence_id_prefix$.getGlobalValue()));
	defparameter("*HTML-UNMATCHED-PARENTHESIS-COLOR*", $RED);
	return NIL;
    }

    public static final SubLObject setup_cb_utilities_file_alt() {
	memoization_state.note_globally_cached_function(CB_HTML_FOR_CYCLIST_IN_NL);
	declare_defglobal($cb_available_tools$);
	declare_defglobal($cb_frame_table$);
	register_cb_frame($SELF, $str_alt73$_self, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($PARENT, $str_alt74$_parent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($TOP, $str_alt75$_top, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($BLANK, $str_alt77$_blank, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($NEW, $str_alt79$_new, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($DOC, $$$doc, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($COMPLETION, $$$completion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($TOOLBAR, $$$toolbar, $str_alt86$cb_toolbar_frame, NIL, NIL, NIL);
	register_cb_frame($MAIN, $str_alt87$cyc_main, $str_alt88$cb_main_frame, $str_alt89$__a, UNPROVIDED, UNPROVIDED);
	register_cb_frame($STATUS, $$$status, $str_alt92$cb_status_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($INDEX, $$$index, $str_alt95$cb_index_frame, $str_alt89$__a, UNPROVIDED, UNPROVIDED);
	register_cb_frame($CONTENT, $$$content, $str_alt98$cb_content_frame, $str_alt89$__a, UNPROVIDED, UNPROVIDED);
	register_cb_frame($EMPTY, $$$empty, $str_alt101$cb_empty_frame, NIL, T, NIL);
	register_cb_frame($SETUP, $$$setup, $str_alt104$cb_setup_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($INF_INDEX, $str_alt106$inf_index, $str_alt107$cb_inf_index_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($INF_CONTENT, $str_alt109$inf_content, $str_alt110$cb_inf_content_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	setup_cb_link_method($CONSTANT, CB_LINK_CONSTANT, THREE_INTEGER);
	setup_cb_link_method($NART, CB_LINK_NART, THREE_INTEGER);
	setup_cb_link_method($NAT, CB_LINK_NAT, TWO_INTEGER);
	setup_cb_link_method($NAUT, CB_LINK_NAUT, THREE_INTEGER);
	setup_cb_link_method($LEXICON, CB_LINK_LEXICON, ONE_INTEGER);
	setup_cb_link_method($UNNAMED, CB_LINK_UNNAMED, ONE_INTEGER);
	setup_cb_link_method($ASSERTION, CB_LINK_ASSERTION, ONE_INTEGER);
	memoization_state.note_globally_cached_function(HTML_SATURATED_RED_COLOR);
	memoization_state.note_globally_cached_function(HTML_SATURATED_GREEN_COLOR);
	sethash($DEFAULT, $cb_icon_definitions$.getGlobalValue(), list($str_alt152$yellow_gif, $str_alt153$_Def_));
	sethash($MONOTONIC, $cb_icon_definitions$.getGlobalValue(), list($str_alt154$white_gif, $str_alt155$_Mon_));
	sethash($DERIVED, $cb_icon_definitions$.getGlobalValue(), list($str_alt157$green_gif, $str_alt158$_Inf_));
	sethash($BACKWARD, $cb_icon_definitions$.getGlobalValue(), list($str_alt159$purple_gif, $str_alt160$_B_));
	sethash($FORWARD, $cb_icon_definitions$.getGlobalValue(), list($str_alt161$blue_gif, $str_alt162$_F_));
	sethash($REDUNDANT, $cb_icon_definitions$.getGlobalValue(), list($str_alt164$cyan_gif, $str_alt165$_R_));
	sethash($FALSE, $cb_icon_definitions$.getGlobalValue(), list($str_alt166$red_gif, $str_alt167$_False_));
	sethash($CODE, $cb_icon_definitions$.getGlobalValue(), list($str_alt168$pink_gif, $str_alt169$_Code_));
	sethash($UNKNOWN, $cb_icon_definitions$.getGlobalValue(), list($str_alt170$gray_gif, $str_alt171$_Unknown_));
	setup_cb_link_method($SENTENCE, CB_LINK_SENTENCE, TWO_INTEGER);
	sethash($SENTENCE_MARKER, $cb_icon_definitions$.getGlobalValue(), list($str_alt193$cyc_logo_3_t_gif, $str_alt194$_CycL_));
	sethash($HELP, $cb_icon_definitions$.getGlobalValue(), list($str_alt196$help_btn_s_gif, $str_alt197$_Help_));
	register_method($cb_form_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), symbol_function(CB_FORM_VARIABLE_METHOD));
	register_method($cb_form_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(CB_FORM_CONSTANT_METHOD));
	register_method($cb_form_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(CB_FORM_NART_METHOD));
	register_method($cb_form_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), symbol_function(CB_FORM_ASSERTION_METHOD));
	register_method($cb_form_method_table$.getGlobalValue(), $dtp_string$.getGlobalValue(), symbol_function(CB_FORM_STRING_METHOD));
	declare_defglobal($cb_form_cons_methods$);
	declare_defglobal($cb_form_cons_methods_by_keyword$);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_cb_form_cons_method$.getGlobalValue(), symbol_function(CB_FORM_CONS_METHOD_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(CB_FORM_CONS_METHOD_NAME, _CSETF_CB_FORM_CONS_METHOD_NAME);
	def_csetf(CB_FORM_CONS_METHOD_KEYWORD, _CSETF_CB_FORM_CONS_METHOD_KEYWORD);
	def_csetf(CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN, _CSETF_CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN);
	def_csetf(CB_FORM_CONS_METHOD_HTML_OUTPUT_FN, _CSETF_CB_FORM_CONS_METHOD_HTML_OUTPUT_FN);
	identity(CB_FORM_CONS_METHOD);
	register_macro_helper(REGISTER_CB_FORM_CONS_METHOD, DEFCB_FORM_CONS_METHOD);
	register_macro_helper(COMPUTE_CB_FORM_CONS_METHODS_ACTIVE, WITH_CB_FORM_CONS_METHODS);
	register_method($cb_form_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(CB_FORM_CONS_METHOD));
	html_macros.note_html_handler_function(CB_UNIMPLEMENTED);
	setup_cb_link_method($UNIMPLEMENTED, CB_LINK_UNIMPLEMENTED, ONE_INTEGER);
	define_obsolete_register(CB_GUESS_NAT, $list_alt284);
	define_test_case_table_int(CB_GUESS_CONSTANT, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt322);
	define_test_case_table_int(CB_GUESS_DATE, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt326);
	return NIL;
    }

    public static SubLObject setup_cb_utilities_file() {
	if (SubLFiles.USE_V1) {
	    memoization_state.note_globally_cached_function(CB_HTML_FOR_CYCLIST_IN_NL);
	    declare_defglobal($cb_available_tools$);
	    memoization_state.note_memoized_function(GET_MT_TIME_INTERVAL_MEMOIZED);
	    memoization_state.note_memoized_function(MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED);
	    declare_defglobal($cb_frame_table$);
	    register_cb_frame($SELF, $str93$_self, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($PARENT, $str94$_parent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($TOP, $str95$_top, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($BLANK, $str97$_blank, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($NEW, $str99$_new, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($DOC, $$$doc, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($COMPLETION, $$$completion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($TOOLBAR, $$$toolbar, $str106$cb_toolbar_frame, NIL, NIL, NIL);
	    register_cb_frame($MAIN, $str107$cyc_main, $str108$cb_main_frame, $str109$__a, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($STATUS, $$$status, $str112$cb_status_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($INDEX, $$$index, $str115$cb_index_frame, $str109$__a, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($CONTENT, $$$content, $str118$cb_content_frame, $str109$__a, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($EMPTY, $$$empty, $str121$cb_empty_frame, NIL, T, NIL);
	    register_cb_frame($SETUP, $$$setup, $str124$cb_setup_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($INF_INDEX, $str126$inf_index, $str127$cb_inf_index_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($INF_CONTENT, $str129$inf_content, $str130$cb_inf_content_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_html_state_variable($cb_show_constant_hash_dollar_prefixP$);
	    register_html_interface_variable($cb_show_constant_hash_dollar_prefixP$);
	    setup_cb_link_method($CONSTANT, CB_LINK_CONSTANT, THREE_INTEGER);
	    sethash($NAT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str149$nat_png, $str88$));
	    sethash($NART, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str151$nart_png, $str88$));
	    setup_cb_link_method($NART, CB_LINK_NART, THREE_INTEGER);
	    setup_cb_link_method($NAT, CB_LINK_NAT, TWO_INTEGER);
	    setup_cb_link_method($NAUT, CB_LINK_NAUT, THREE_INTEGER);
	    setup_cb_link_method($LEXICON, CB_LINK_LEXICON, ONE_INTEGER);
	    setup_cb_link_method($UNNAMED, CB_LINK_UNNAMED, ONE_INTEGER);
	    setup_cb_link_method($ASSERTION, CB_LINK_ASSERTION, ONE_INTEGER);
	    memoization_state.note_globally_cached_function(HTML_SATURATED_RED_COLOR);
	    memoization_state.note_globally_cached_function(HTML_SATURATED_GREEN_COLOR);
	    sethash($DEFAULT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str185$yellow_gif, $str186$_Def_));
	    sethash($MONOTONIC, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str187$white_gif, $str188$_Mon_));
	    sethash($DERIVED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str190$green_gif, $str191$_Inf_));
	    sethash($BACKWARD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str192$purple_gif, $str193$_B_));
	    sethash($FORWARD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str194$blue_gif, $str195$_F_));
	    sethash($REDUNDANT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str197$cyan_gif, $str198$_R_));
	    sethash($FALSE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str199$red_gif, $str200$_False_));
	    sethash($CODE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str201$pink_gif, $str202$_Code_));
	    sethash($UNKNOWN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str203$gray_gif, $str204$_Unknown_));
	    sethash($BACKWARD_GAF, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str206$orange_gif, $str207$_BackwardGAF_));
	    memoization_state.note_globally_cached_function(GENERATE_PHRASE_FOR_CYCLIST);
	    setup_cb_link_method($SENTENCE, CB_LINK_SENTENCE, TWO_INTEGER);
	    sethash($SENTENCE_MARKER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str232$cyc_logo_3_t_gif, $str233$_CycL_));
	    sethash($HELP, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str235$help_btn_s_gif, $str236$_Help_));
	    register_method($cb_form_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), symbol_function(CB_FORM_VARIABLE_METHOD));
	    register_method($cb_form_method_table$.getGlobalValue(), $dtp_symbol$.getGlobalValue(), symbol_function(CB_FORM_SYMBOL_METHOD));
	    register_method($cb_form_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(CB_FORM_CONSTANT_METHOD));
	    register_method($cb_form_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(CB_FORM_NART_METHOD));
	    register_html_state_variable($allow_cb_assertion_for_the_assertion_sentence_replacementP$);
	    register_html_interface_variable($allow_cb_assertion_for_the_assertion_sentence_replacementP$);
	    register_method($cb_form_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), symbol_function(CB_FORM_ASSERTION_METHOD));
	    register_method($cb_form_method_table$.getGlobalValue(), $dtp_string$.getGlobalValue(), symbol_function(CB_FORM_STRING_METHOD));
	    declare_defglobal($cb_form_cons_methods$);
	    declare_defglobal($cb_form_cons_methods_by_keyword$);
	    register_method($print_object_method_table$.getGlobalValue(), $dtp_cb_form_cons_method$.getGlobalValue(), symbol_function(CB_FORM_CONS_METHOD_PRINT_FUNCTION_TRAMPOLINE));
	    SubLSpecialOperatorDeclarations.proclaim($list266);
	    def_csetf(CB_FORM_CONS_METHOD_NAME, _CSETF_CB_FORM_CONS_METHOD_NAME);
	    def_csetf(CB_FORM_CONS_METHOD_KEYWORD, _CSETF_CB_FORM_CONS_METHOD_KEYWORD);
	    def_csetf(CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN, _CSETF_CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN);
	    def_csetf(CB_FORM_CONS_METHOD_HTML_OUTPUT_FN, _CSETF_CB_FORM_CONS_METHOD_HTML_OUTPUT_FN);
	    identity(CB_FORM_CONS_METHOD);
	    register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cb_form_cons_method$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CB_FORM_CONS_METHOD_METHOD));
	    register_macro_helper(REGISTER_CB_FORM_CONS_METHOD, DEFCB_FORM_CONS_METHOD);
	    register_macro_helper(COMPUTE_CB_FORM_CONS_METHODS_ACTIVE, WITH_CB_FORM_CONS_METHODS);
	    register_html_state_variable($cb_formula_argument_limit$);
	    register_html_interface_variable($cb_formula_argument_limit$);
	    register_method($cb_form_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(CB_FORM_CONS_METHOD));
	    register_cb_form_cons_method(DATE, $list308);
	    declare_cb_form_cons_method_always_active($DATE);
	    register_html_state_variable($cb_display_dates_as_stringsP$);
	    register_html_interface_variable($cb_display_dates_as_stringsP$);
	    note_funcall_helper_function($sym311$CB_DATE_TO_OPTIMIZE_FOR_DISPLAY_);
	    note_funcall_helper_function(CB_SHOW_DATE_OPTIMIZED_FOR_DISPLAY);
	    register_cb_form_cons_method(DECIMAL, $list316);
	    declare_cb_form_cons_method_always_active($DECIMAL);
	    register_html_state_variable($cb_display_decimals_as_decimalsP$);
	    register_html_interface_variable($cb_display_decimals_as_decimalsP$);
	    note_funcall_helper_function($sym319$CB_DECIMAL_TO_OPTIMIZE_FOR_DISPLAY_);
	    note_funcall_helper_function(CB_SHOW_DECIMAL_OPTIMIZED_FOR_DISPLAY);
	    register_cb_form_cons_method(FRACTION, $list322);
	    declare_cb_form_cons_method_always_active($FRACTION);
	    register_html_state_variable($cb_display_fractions_as_fractionsP$);
	    register_html_interface_variable($cb_display_fractions_as_fractionsP$);
	    note_funcall_helper_function($sym325$CB_FRACTION_TO_OPTIMIZE_FOR_DISPLAY_);
	    note_funcall_helper_function(CB_SHOW_FRACTION_OPTIMIZED_FOR_DISPLAY);
	    note_funcall_helper_function($sym330$CB_HL_SUPPORT_TO_DISPLAY_);
	    note_funcall_helper_function(CB_SHOW_HL_SUPPORT_FOR_CONS_METHOD);
	    html_macros.note_cgi_handler_function(CB_UNIMPLEMENTED, $HTML_HANDLER);
	    setup_cb_link_method($UNIMPLEMENTED, CB_LINK_UNIMPLEMENTED, ONE_INTEGER);
	    declare_defglobal($cb_image_independent_fort_identifiersP$);
	    define_obsolete_register(CB_GUESS_NAT, $list381);
	    sethash($ACTIVE_LEFT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str415$back_12_png, $$$Active_left_arrow));
	    sethash($INACTIVE_LEFT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str418$back_12_disabled_png, $$$Inactive_left_arrow));
	    sethash($ACTIVE_RIGHT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str421$forward_12_png, $$$Active_right_arrow));
	    sethash($INACTIVE_RIGHT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str424$forward_12_disabled_png, $$$Inactive_right_arrow));
	    define_test_case_table_int(CB_GUESS_CONSTANT, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list434);
	    define_test_case_table_int(CB_GUESS_DATE, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list437);
	}
	if (SubLFiles.USE_V2) {
	    register_cb_frame($SELF, $str_alt73$_self, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($PARENT, $str_alt74$_parent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($TOP, $str_alt75$_top, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($BLANK, $str_alt77$_blank, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($NEW, $str_alt79$_new, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($TOOLBAR, $$$toolbar, $str_alt86$cb_toolbar_frame, NIL, NIL, NIL);
	    register_cb_frame($MAIN, $str_alt87$cyc_main, $str_alt88$cb_main_frame, $str_alt89$__a, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($STATUS, $$$status, $str_alt92$cb_status_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($INDEX, $$$index, $str_alt95$cb_index_frame, $str_alt89$__a, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($CONTENT, $$$content, $str_alt98$cb_content_frame, $str_alt89$__a, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($EMPTY, $$$empty, $str_alt101$cb_empty_frame, NIL, T, NIL);
	    register_cb_frame($SETUP, $$$setup, $str_alt104$cb_setup_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($INF_INDEX, $str_alt106$inf_index, $str_alt107$cb_inf_index_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    register_cb_frame($INF_CONTENT, $str_alt109$inf_content, $str_alt110$cb_inf_content_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    sethash($DEFAULT, $cb_icon_definitions$.getGlobalValue(), list($str_alt152$yellow_gif, $str_alt153$_Def_));
	    sethash($MONOTONIC, $cb_icon_definitions$.getGlobalValue(), list($str_alt154$white_gif, $str_alt155$_Mon_));
	    sethash($DERIVED, $cb_icon_definitions$.getGlobalValue(), list($str_alt157$green_gif, $str_alt158$_Inf_));
	    sethash($BACKWARD, $cb_icon_definitions$.getGlobalValue(), list($str_alt159$purple_gif, $str_alt160$_B_));
	    sethash($FORWARD, $cb_icon_definitions$.getGlobalValue(), list($str_alt161$blue_gif, $str_alt162$_F_));
	    sethash($REDUNDANT, $cb_icon_definitions$.getGlobalValue(), list($str_alt164$cyan_gif, $str_alt165$_R_));
	    sethash($FALSE, $cb_icon_definitions$.getGlobalValue(), list($str_alt166$red_gif, $str_alt167$_False_));
	    sethash($CODE, $cb_icon_definitions$.getGlobalValue(), list($str_alt168$pink_gif, $str_alt169$_Code_));
	    sethash($UNKNOWN, $cb_icon_definitions$.getGlobalValue(), list($str_alt170$gray_gif, $str_alt171$_Unknown_));
	    sethash($SENTENCE_MARKER, $cb_icon_definitions$.getGlobalValue(), list($str_alt193$cyc_logo_3_t_gif, $str_alt194$_CycL_));
	    sethash($HELP, $cb_icon_definitions$.getGlobalValue(), list($str_alt196$help_btn_s_gif, $str_alt197$_Help_));
	    html_macros.note_html_handler_function(CB_UNIMPLEMENTED);
	    define_obsolete_register(CB_GUESS_NAT, $list_alt284);
	    define_test_case_table_int(CB_GUESS_CONSTANT, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt322);
	    define_test_case_table_int(CB_GUESS_DATE, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt326);
	}
	return NIL;
    }

    public static SubLObject setup_cb_utilities_file_Previous() {
	memoization_state.note_globally_cached_function(CB_HTML_FOR_CYCLIST_IN_NL);
	declare_defglobal($cb_available_tools$);
	memoization_state.note_memoized_function(GET_MT_TIME_INTERVAL_MEMOIZED);
	memoization_state.note_memoized_function(MAYBE_CYCL_SECOND_TO_UNIVERSAL_TIME_EXTENDED);
	declare_defglobal($cb_frame_table$);
	register_cb_frame($SELF, $str93$_self, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($PARENT, $str94$_parent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($TOP, $str95$_top, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($BLANK, $str97$_blank, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($NEW, $str99$_new, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($DOC, $$$doc, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($COMPLETION, $$$completion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($TOOLBAR, $$$toolbar, $str106$cb_toolbar_frame, NIL, NIL, NIL);
	register_cb_frame($MAIN, $str107$cyc_main, $str108$cb_main_frame, $str109$__a, UNPROVIDED, UNPROVIDED);
	register_cb_frame($STATUS, $$$status, $str112$cb_status_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($INDEX, $$$index, $str115$cb_index_frame, $str109$__a, UNPROVIDED, UNPROVIDED);
	register_cb_frame($CONTENT, $$$content, $str118$cb_content_frame, $str109$__a, UNPROVIDED, UNPROVIDED);
	register_cb_frame($EMPTY, $$$empty, $str121$cb_empty_frame, NIL, T, NIL);
	register_cb_frame($SETUP, $$$setup, $str124$cb_setup_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($INF_INDEX, $str126$inf_index, $str127$cb_inf_index_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_cb_frame($INF_CONTENT, $str129$inf_content, $str130$cb_inf_content_frame, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	register_html_state_variable($cb_show_constant_hash_dollar_prefixP$);
	register_html_interface_variable($cb_show_constant_hash_dollar_prefixP$);
	setup_cb_link_method($CONSTANT, CB_LINK_CONSTANT, THREE_INTEGER);
	sethash($NAT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str149$nat_png, $str88$));
	sethash($NART, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str151$nart_png, $str88$));
	setup_cb_link_method($NART, CB_LINK_NART, THREE_INTEGER);
	setup_cb_link_method($NAT, CB_LINK_NAT, TWO_INTEGER);
	setup_cb_link_method($NAUT, CB_LINK_NAUT, THREE_INTEGER);
	setup_cb_link_method($LEXICON, CB_LINK_LEXICON, ONE_INTEGER);
	setup_cb_link_method($UNNAMED, CB_LINK_UNNAMED, ONE_INTEGER);
	setup_cb_link_method($ASSERTION, CB_LINK_ASSERTION, ONE_INTEGER);
	memoization_state.note_globally_cached_function(HTML_SATURATED_RED_COLOR);
	memoization_state.note_globally_cached_function(HTML_SATURATED_GREEN_COLOR);
	sethash($DEFAULT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str185$yellow_gif, $str186$_Def_));
	sethash($MONOTONIC, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str187$white_gif, $str188$_Mon_));
	sethash($DERIVED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str190$green_gif, $str191$_Inf_));
	sethash($BACKWARD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str192$purple_gif, $str193$_B_));
	sethash($FORWARD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str194$blue_gif, $str195$_F_));
	sethash($REDUNDANT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str197$cyan_gif, $str198$_R_));
	sethash($FALSE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str199$red_gif, $str200$_False_));
	sethash($CODE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str201$pink_gif, $str202$_Code_));
	sethash($UNKNOWN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str203$gray_gif, $str204$_Unknown_));
	sethash($BACKWARD_GAF, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str206$orange_gif, $str207$_BackwardGAF_));
	memoization_state.note_globally_cached_function(GENERATE_PHRASE_FOR_CYCLIST);
	setup_cb_link_method($SENTENCE, CB_LINK_SENTENCE, TWO_INTEGER);
	sethash($SENTENCE_MARKER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str232$cyc_logo_3_t_gif, $str233$_CycL_));
	sethash($HELP, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str235$help_btn_s_gif, $str236$_Help_));
	register_method($cb_form_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), symbol_function(CB_FORM_VARIABLE_METHOD));
	register_method($cb_form_method_table$.getGlobalValue(), $dtp_symbol$.getGlobalValue(), symbol_function(CB_FORM_SYMBOL_METHOD));
	register_method($cb_form_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(CB_FORM_CONSTANT_METHOD));
	register_method($cb_form_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(CB_FORM_NART_METHOD));
	register_html_state_variable($allow_cb_assertion_for_the_assertion_sentence_replacementP$);
	register_html_interface_variable($allow_cb_assertion_for_the_assertion_sentence_replacementP$);
	register_method($cb_form_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), symbol_function(CB_FORM_ASSERTION_METHOD));
	register_method($cb_form_method_table$.getGlobalValue(), $dtp_string$.getGlobalValue(), symbol_function(CB_FORM_STRING_METHOD));
	declare_defglobal($cb_form_cons_methods$);
	declare_defglobal($cb_form_cons_methods_by_keyword$);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_cb_form_cons_method$.getGlobalValue(), symbol_function(CB_FORM_CONS_METHOD_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list266);
	def_csetf(CB_FORM_CONS_METHOD_NAME, _CSETF_CB_FORM_CONS_METHOD_NAME);
	def_csetf(CB_FORM_CONS_METHOD_KEYWORD, _CSETF_CB_FORM_CONS_METHOD_KEYWORD);
	def_csetf(CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN, _CSETF_CB_FORM_CONS_METHOD_APPLICABILITY_TEST_FN);
	def_csetf(CB_FORM_CONS_METHOD_HTML_OUTPUT_FN, _CSETF_CB_FORM_CONS_METHOD_HTML_OUTPUT_FN);
	identity(CB_FORM_CONS_METHOD);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cb_form_cons_method$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CB_FORM_CONS_METHOD_METHOD));
	register_macro_helper(REGISTER_CB_FORM_CONS_METHOD, DEFCB_FORM_CONS_METHOD);
	register_macro_helper(COMPUTE_CB_FORM_CONS_METHODS_ACTIVE, WITH_CB_FORM_CONS_METHODS);
	register_html_state_variable($cb_formula_argument_limit$);
	register_html_interface_variable($cb_formula_argument_limit$);
	register_method($cb_form_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(CB_FORM_CONS_METHOD));
	register_cb_form_cons_method(DATE, $list308);
	declare_cb_form_cons_method_always_active($DATE);
	register_html_state_variable($cb_display_dates_as_stringsP$);
	register_html_interface_variable($cb_display_dates_as_stringsP$);
	note_funcall_helper_function($sym311$CB_DATE_TO_OPTIMIZE_FOR_DISPLAY_);
	note_funcall_helper_function(CB_SHOW_DATE_OPTIMIZED_FOR_DISPLAY);
	register_cb_form_cons_method(DECIMAL, $list316);
	declare_cb_form_cons_method_always_active($DECIMAL);
	register_html_state_variable($cb_display_decimals_as_decimalsP$);
	register_html_interface_variable($cb_display_decimals_as_decimalsP$);
	note_funcall_helper_function($sym319$CB_DECIMAL_TO_OPTIMIZE_FOR_DISPLAY_);
	note_funcall_helper_function(CB_SHOW_DECIMAL_OPTIMIZED_FOR_DISPLAY);
	register_cb_form_cons_method(FRACTION, $list322);
	declare_cb_form_cons_method_always_active($FRACTION);
	register_html_state_variable($cb_display_fractions_as_fractionsP$);
	register_html_interface_variable($cb_display_fractions_as_fractionsP$);
	note_funcall_helper_function($sym325$CB_FRACTION_TO_OPTIMIZE_FOR_DISPLAY_);
	note_funcall_helper_function(CB_SHOW_FRACTION_OPTIMIZED_FOR_DISPLAY);
	note_funcall_helper_function($sym330$CB_HL_SUPPORT_TO_DISPLAY_);
	note_funcall_helper_function(CB_SHOW_HL_SUPPORT_FOR_CONS_METHOD);
	html_macros.note_cgi_handler_function(CB_UNIMPLEMENTED, $HTML_HANDLER);
	setup_cb_link_method($UNIMPLEMENTED, CB_LINK_UNIMPLEMENTED, ONE_INTEGER);
	declare_defglobal($cb_image_independent_fort_identifiersP$);
	define_obsolete_register(CB_GUESS_NAT, $list381);
	sethash($ACTIVE_LEFT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str415$back_12_png, $$$Active_left_arrow));
	sethash($INACTIVE_LEFT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str418$back_12_disabled_png, $$$Inactive_left_arrow));
	sethash($ACTIVE_RIGHT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str421$forward_12_png, $$$Active_right_arrow));
	sethash($INACTIVE_RIGHT_ARROW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str424$forward_12_disabled_png, $$$Inactive_right_arrow));
	define_test_case_table_int(CB_GUESS_CONSTANT, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list434);
	define_test_case_table_int(CB_GUESS_DATE, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list437);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_cb_utilities_file();
    }

    @Override
    public void initializeVariables() {
	init_cb_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_cb_utilities_file();
    }

    static {
    }

    public static final class $cb_form_cons_method_p$UnaryFunction extends UnaryFunction {
	public $cb_form_cons_method_p$UnaryFunction() {
	    super(extractFunctionNamed("CB-FORM-CONS-METHOD-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return cb_form_cons_method_p(arg1);
	}
    }
}

/**
 * Total time: 2563 ms synthetic
 */
