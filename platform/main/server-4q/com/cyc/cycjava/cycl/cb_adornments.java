/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-ADORNMENTS
 * source file: /cyc/top/cycl/cb-adornments.lisp
 * created:     2019/07/03 17:38:03
 */
public final class cb_adornments extends SubLTranslatedFile implements V12 {
    public static final SubLSymbol $cb_adornment_table$ = makeSymbol("*CB-ADORNMENT-TABLE*");

    public static final SubLSymbol $debug_adornments_p$ = makeSymbol("*DEBUG-ADORNMENTS-P*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_adornment$ = makeSymbol("*DTP-ADORNMENT*");

    static private final SubLList $list_alt1 = list(new SubLObject[] { makeSymbol("ALPHABETICAL-SEARCH"), makeSymbol("VFACETS"), makeSymbol("WORDNET-SYNSET"), makeSymbol("HIERARCHY-DEFAULT"), makeSymbol("HIERARCHY-LINK"), makeSymbol("LITERAL-QUERY-INDEX-DISPLAY"), makeSymbol("LITERAL-QUERY-NORMAL"),
	    makeSymbol("LITERAL-QUERY-INDEX"), makeSymbol("CONSTANT-REVIEW"), makeSymbol("ASSERTION-REVIEW"), makeSymbol("META-AXIOMS"), makeSymbol("DEDUCED-ASSERTION"), makeSymbol("ASSERTED-ASSERTION") });

    static private final SubLList $list_alt10 = list(
	    new SubLObject[] { makeSymbol("ADORNMENT-NAME"), makeSymbol("ADORNMENT-TYPE"), makeSymbol("ADORNMENT-ACTIVE-P"), makeSymbol("ADORNMENT-IMAGE"), makeSymbol("ADORNMENT-IMAGE-DISABLED"), makeSymbol("ADORNMENT-IMAGE-ALT"), makeSymbol("ADORNMENT-DYNAMIC-TAGFN"), makeSymbol("ADORNMENT-COLOR"),
		    makeSymbol("ADORNMENT-LETTER"), makeSymbol("ADORNMENT-EFFECTIVE-FN"), makeSymbol("ADORNMENT-HANDLER"), makeSymbol("ADORNMENT-TOOL"), makeSymbol("ADORNMENT-COMMENT"), makeSymbol("ADORNMENT-DYNAMIC-COMMENT"), makeSymbol("ADORNMENT-TITLE") });

    static private final SubLList $list_alt103 = list(new SubLObject[] { $TYPE, makeKeyword("CONSTANT"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("IMAGE"), makeKeyword("BL-MENU"), makeKeyword("IMAGE-ALT"), makeString("[KE Term Review]"), makeKeyword("EFFECTIVE-FN"),
	    makeSymbol("CONSTANT-NEEDS-REVIEW-P"), makeKeyword("HANDLER"), makeString("cb-tcf"), $TOOL, makeKeyword("KE-REVIEW"), makeKeyword("COMMENT"), makeString("Links to a special page for reviewing this constant (support of #$MyReviewer).") });

    static private final SubLList $list_alt105 = list(ONE_INTEGER, TWO_INTEGER);

    static private final SubLList $list_alt11 = list(new SubLObject[] { makeSymbol("_CSETF-ADORNMENT-NAME"), makeSymbol("_CSETF-ADORNMENT-TYPE"), makeSymbol("_CSETF-ADORNMENT-ACTIVE-P"), makeSymbol("_CSETF-ADORNMENT-IMAGE"), makeSymbol("_CSETF-ADORNMENT-IMAGE-DISABLED"),
	    makeSymbol("_CSETF-ADORNMENT-IMAGE-ALT"), makeSymbol("_CSETF-ADORNMENT-DYNAMIC-TAGFN"), makeSymbol("_CSETF-ADORNMENT-COLOR"), makeSymbol("_CSETF-ADORNMENT-LETTER"), makeSymbol("_CSETF-ADORNMENT-EFFECTIVE-FN"), makeSymbol("_CSETF-ADORNMENT-HANDLER"), makeSymbol("_CSETF-ADORNMENT-TOOL"),
	    makeSymbol("_CSETF-ADORNMENT-COMMENT"), makeSymbol("_CSETF-ADORNMENT-DYNAMIC-COMMENT"), makeSymbol("_CSETF-ADORNMENT-TITLE") });

    static private final SubLList $list_alt110 = list(new SubLObject[] { $TYPE, makeKeyword("GAF-ARG-PREDICATE"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("RED-DIAMOND"), makeKeyword("IMAGE-ALT"), makeString("[Hier]"), makeKeyword("EFFECTIVE-FN"),
	    makeSymbol("HIERARCHY-LINK-EFFECTIVE-FN"), makeKeyword("HANDLER"), makeString("cb-hier"), $TOOL, makeKeyword("HIERARCHY-BROWSER"), makeKeyword("TITLE"), makeString("Hierarchy Browser"), makeKeyword("COMMENT"), makeString("Lets you browse the isa hierarchy.") });

    static private final SubLList $list_alt116 = list(new SubLObject[] { $TYPE, makeKeyword("INDEX-CONSTANT"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("HIERARCHY-BROWSER"), makeKeyword("IMAGE-DISABLED"), makeKeyword("HIERARCHY-BROWSER-DISABLED"),
	    makeKeyword("IMAGE-ALT"), makeString("[Hier]"), makeKeyword("EFFECTIVE-FN"), makeSymbol("HB-DEFAULT-METHOD-AVAILABLE?"), makeKeyword("HANDLER"), makeString("cb-hier-default"), $TOOL, makeKeyword("HIERARCHY-BROWSER"), makeKeyword("TITLE"), makeString("Hierarchy Browser"),
	    makeKeyword("COMMENT"), makeString("Lets you browse the isa hierarchy.") });

    static private final SubLList $list_alt122 = list(new SubLObject[] { $TYPE, makeKeyword("INDEX-CONSTANT-NAME"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("ALPHA-BROWSER"), makeKeyword("IMAGE-DISABLED"), makeKeyword("ALPHA-BROWSER-DISABLED"),
	    makeKeyword("IMAGE-ALT"), makeString("[Alpha]"), makeKeyword("EFFECTIVE-FN"), makeSymbol("CB-SHOW-ALPHABETIC-SEARCH?"), makeKeyword("HANDLER"), makeString("cb-ad"), $TOOL, makeKeyword("ALPHA-TOP"), makeKeyword("TITLE"), makeString("Alphabetical Browser"),
	    makeKeyword("COMMENT"), makeString("Links you to the alphabetical list of FORTs") });

    static private final SubLList $list_alt135 = list(new SubLObject[] { $TYPE, makeKeyword("GAF-ARG-PREDICATE-CONTENT"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeSymbol("LITERAL-QUERY-MARKER-ELSE-GREEN"), makeKeyword("IMAGE-ALT"), makeString("[LitQ]"),
	    makeKeyword("EFFECTIVE-FN"), makeSymbol("LITERAL-QUERY-INDEX-EFFECTIVE-FN"), makeKeyword("HANDLER"), makeString("cb-lq"), $TOOL, makeKeyword("ASK"), makeKeyword("COMMENT"), makeString("There are likely to be some additional derivable relations; this establishes them.") });

    static private final SubLList $list_alt138 = list(new SubLObject[] { $TYPE, makeKeyword("GAF-ARG-PREDICATEX"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeSymbol("LITERAL-QUERY-MARKER-ELSE-YELLOW"), makeKeyword("IMAGE-ALT"), makeString("[LitQ]"),
	    makeKeyword("EFFECTIVE-FN"), makeSymbol("LITERAL-QUERY-NORMAL-EFFECTIVE-FN"), makeKeyword("HANDLER"), makeString("cb-lq"), $TOOL, makeKeyword("ASK"), makeKeyword("COMMENT"),
	    makeString("If Green, there are likely to be some additional derivable relations; if yellow, it is possible there are additional relations. This establishes them.") });

    static private final SubLList $list_alt141 = list(new SubLObject[] { $TYPE, makeKeyword("GAF-ARG-PREDICATEX"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeSymbol("LITERAL-QUERY-MARKER-ELSE-PURPLE"), makeKeyword("IMAGE-ALT"), makeString("[LitQ]"),
	    makeKeyword("EFFECTIVE-FN"), makeSymbol("LITERAL-QUERY-INDEX-DISPLAY-EFFECTIVE-FN"), makeKeyword("HANDLER"), makeString("cb-lq"), $TOOL, makeKeyword("ASK"), makeKeyword("COMMENT"),
	    makeString("If Green, there are likely to be some additional derivable relations; if yellow, it is possible there are additional relations. If purple, additional relations are unlikely to be found (but you won't know until you try). This establishes them.") });

    static private final SubLList $list_alt148 = list(new SubLObject[] { $TYPE, makeKeyword("ASSERTION"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("IMAGE"), makeKeyword("BL-SDI"), makeKeyword("DYNAMIC-TAGFN"), makeSymbol("CB-GET-ASSERTED-ARGUMENT"), makeKeyword("IMAGE-ALT"),
	    makeSymbol("CB-GET-ASSERTED-ARGUMENT"), makeKeyword("EFFECTIVE-FN"), makeSymbol("ASSERTED-ASSERTION?"), makeKeyword("COMMENT"), makeString("effective when the assertion has some asserted argument."), makeKeyword("DYNAMIC-COMMENT"), makeString("The asserted argument") });

    static private final SubLList $list_alt152 = list(new SubLObject[] { $TYPE, makeKeyword("ASSERTION"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("IMAGE"), makeKeyword("GR-SDI"), makeKeyword("DYNAMIC-TAGFN"), makeSymbol("CB-ASSERTION-DEDUCTIONS"), makeKeyword("IMAGE-ALT"),
	    makeSymbol("CB-ASSERTION-DEDUCTIONS"), makeKeyword("EFFECTIVE-FN"), makeSymbol("DEDUCED-ASSERTION?"), makeKeyword("COMMENT"), makeString("effective when the assertion has some deduced argument."), makeKeyword("DYNAMIC-COMMENT"), makeString("List of deduced formulas") });

    static private final SubLList $list_alt157 = list(makeSymbol("INDEX-SPEC"));

    static private final SubLList $list_alt61 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));

    static private final SubLList $list_alt65 = list(makeSymbol("*CB-ADORNMENT-TABLE*"));

    static private final SubLList $list_alt72 = list(list(makeSymbol("FUNCTION"), EQUAL), list(makeSymbol("FUNCTION"), makeSymbol("ADORNMENT-NAME")));

    static private final SubLList $list_alt8 = list(new SubLObject[] { makeSymbol("NAME"), makeSymbol("TYPE"), makeSymbol("ACTIVE-P"), makeSymbol("IMAGE"), makeSymbol("IMAGE-DISABLED"), makeSymbol("IMAGE-ALT"), makeSymbol("DYNAMIC-TAGFN"), makeSymbol("COLOR"), makeSymbol("LETTER"),
	    makeSymbol("EFFECTIVE-FN"), makeSymbol("HANDLER"), makeSymbol("TOOL"), makeSymbol("COMMENT"), makeSymbol("DYNAMIC-COMMENT"), makeSymbol("TITLE") });

    static private final SubLList $list_alt9 = list(new SubLObject[] { $NAME, $TYPE, makeKeyword("ACTIVE-P"), makeKeyword("IMAGE"), makeKeyword("IMAGE-DISABLED"), makeKeyword("IMAGE-ALT"), makeKeyword("DYNAMIC-TAGFN"), makeKeyword("COLOR"), makeKeyword("LETTER"),
	    makeKeyword("EFFECTIVE-FN"), makeKeyword("HANDLER"), $TOOL, makeKeyword("COMMENT"), makeKeyword("DYNAMIC-COMMENT"), makeKeyword("TITLE") });

    static private final SubLList $list_alt93 = list(new SubLObject[] { $TYPE, makeKeyword("INDEX-TERM"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("INDEX-BROWSER"), makeKeyword("IMAGE-DISABLED"), makeKeyword("INDEX-BROWSER-DISABLED"), makeKeyword("IMAGE-ALT"),
	    makeString("[Indices]"), makeKeyword("EFFECTIVE-FN"), makeSymbol("CYC-TERM"), makeKeyword("HANDLER"), makeString("cb-cf"), makeKeyword("TITLE"), makeString("Index Browser"), makeKeyword("COMMENT"), makeString("Links you to the index view for a term.") });

    static private final SubLList $list_alt95 = list(new SubLObject[] { $TYPE, makeKeyword("ASSERTION"), makeKeyword("ACTIVE-P"), T, makeKeyword("COLOR"), makeKeyword("YELLOW"), makeKeyword("LETTER"), makeString("M"), makeKeyword("EFFECTIVE-FN"),
	    makeSymbol("ASSERTION-HAS-META-ASSERTIONS?"), makeKeyword("COMMENT"), makeString("Indicates that some meta-assertion has been made, that is, an assertion where one of the arguments is this assertion.") });

    static private final SubLList $list_alt99 = list(new SubLObject[] { $TYPE, makeKeyword("ASSERTION"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("IMAGE"), makeKeyword("CY-MENU"), makeKeyword("IMAGE-ALT"), makeString("[KE Assertion Review]"), makeKeyword("EFFECTIVE-FN"),
	    makeSymbol("ASSERTION-NEEDS-REVIEW-P"), makeKeyword("HANDLER"), makeString("cb-taf"), $TOOL, makeKeyword("KE-REVIEW"), makeKeyword("COMMENT"), makeString("Links to a special page for reviewing this assertion (support of #$MyReviewer).") });

    static private final SubLList $list1 = list(new SubLObject[] { makeSymbol("ALPHABETICAL-SEARCH"), makeSymbol("VFACETS"), makeSymbol("WORDNET-SYNSET"), makeSymbol("HIERARCHY-DEFAULT"), makeSymbol("HIERARCHY-LINK"), makeSymbol("LITERAL-QUERY-INDEX-DISPLAY"), makeSymbol("LITERAL-QUERY-NORMAL"),
	    makeSymbol("LITERAL-QUERY-INDEX"), makeSymbol("CONSTANT-REVIEW"), makeSymbol("ASSERTION-REVIEW"), makeSymbol("META-AXIOMS"), makeSymbol("DEDUCED-ASSERTION"), makeSymbol("ASSERTED-ASSERTION") });

    static private final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ADORNMENT-P"));

    static private final SubLList $list8 = list(new SubLObject[] { makeSymbol("_CSETF-ADORNMENT-NAME"), makeSymbol("_CSETF-ADORNMENT-TYPE"), makeSymbol("_CSETF-ADORNMENT-ACTIVE-P"), makeSymbol("_CSETF-ADORNMENT-IMAGE"), makeSymbol("_CSETF-ADORNMENT-IMAGE-DISABLED"),
	    makeSymbol("_CSETF-ADORNMENT-IMAGE-ALT"), makeSymbol("_CSETF-ADORNMENT-DYNAMIC-TAGFN"), makeSymbol("_CSETF-ADORNMENT-COLOR"), makeSymbol("_CSETF-ADORNMENT-LETTER"), makeSymbol("_CSETF-ADORNMENT-EFFECTIVE-FN"), makeSymbol("_CSETF-ADORNMENT-HANDLER"), makeSymbol("_CSETF-ADORNMENT-TOOL"),
	    makeSymbol("_CSETF-ADORNMENT-COMMENT"), makeSymbol("_CSETF-ADORNMENT-DYNAMIC-COMMENT"), makeSymbol("_CSETF-ADORNMENT-TITLE") });

    static private final SubLString $str_alt102$bl_menu_gif = makeString("bl_menu.gif");

    static private final SubLString $str_alt109$red_diam_gif = makeString("red_diam.gif");

    static private final SubLString $str_alt113$hierarchy_browser_gif = makeString("hierarchy-browser.gif");

    static private final SubLString $str_alt115$hierarchy_browser_disabled_gif = makeString("hierarchy-browser-disabled.gif");

    static private final SubLString $str_alt119$alpha_browser_gif = makeString("alpha-browser.gif");

    static private final SubLString $str_alt121$alpha_browser_disabled_gif = makeString("alpha-browser-disabled.gif");

    static private final SubLString $str_alt125$plus_green_gif = makeString("plus-green.gif");

    static private final SubLString $str_alt126$_LitQ_ = makeString("[LitQ]");

    static private final SubLString $str_alt128$plus_yellow_gif = makeString("plus-yellow.gif");

    static private final SubLString $str_alt130$plus_purple_gif = makeString("plus-purple.gif");

    static private final SubLString $str_alt143$_Asserted_Argument_ = makeString("[Asserted Argument]");

    static private final SubLString $str_alt145$_Assertion_Deductions_ = makeString("[Assertion Deductions]");

    static private final SubLString $str_alt147$bl_sdi_gif = makeString("bl_sdi.gif");

    static private final SubLString $str_alt151$gr_sdi_gif = makeString("gr_sdi.gif");

    static private final SubLString $str_alt156$cb_view_adorn_html = makeString("cb-view-adorn.html");

    static private final SubLString $str_alt158$_a_does_not_specify_an_index = makeString("~a does not specify an index");

    static private final SubLString $str_alt161$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt162$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt163$cb_adornment_handler = makeString("cb-adornment-handler");

    static private final SubLString $str_alt167$Debug_adornments_ = makeString("Debug adornments?");

    static private final SubLString $str_alt168$Currently_Active_Adornments__ = makeString("Currently Active Adornments: ");

    static private final SubLString $str_alt172$Active_ = makeString("Active?");

    static private final SubLString $str_alt175$Dynamic_ = makeString("Dynamic?");

    static private final SubLString $str_alt176$Has_Link_ = makeString("Has Link?");

    static private final SubLString $str_alt179$effective_fn = makeString("effective-fn");

    static private final SubLString $str_alt180$_cccccc = makeString("#cccccc");

    static private final SubLString $str_alt182$_dddddd = makeString("#dddddd");

    static private final SubLString $str_alt183$_A_dynamic = makeString("~A-dynamic");

    static private final SubLString $str_alt184$_ = makeString("?");

    static private final SubLString $str_alt189$__A_ = makeString("[~A]");

    static private final SubLString $str_alt190$Active_adornments_have_been_chang = makeString("Active adornments have been changed");

    static private final SubLString $str_alt192$_View_Adornments_ = makeString("[View Adornments]");

    static private final SubLString $str_alt194$cb_view_adorn__A = makeString("cb-view-adorn&~A");

    static private final SubLString $str_alt197$___ = makeString(" : ");

    static private final SubLString $str_alt2$_ = makeString("#");

    static private final SubLString $str_alt3$__ = makeString("#<");

    static private final SubLString $str_alt59$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt82$cb_start_ = makeString("cb-start|");

    static private final SubLString $str_alt83$_a__a = makeString("~a&~a");

    static private final SubLString $str_alt84$_a__a__a__a = makeString("~a&~a&~a&~a");

    static private final SubLString $str_alt85$_a__a__a = makeString("~a&~a&~a");

    static private final SubLString $str_alt90$index_browser_gif = makeString("index-browser.gif");

    static private final SubLString $str_alt92$index_browser_disabled_gif = makeString("index-browser-disabled.gif");

    static private final SubLString $str_alt98$cy_menu_gif = makeString("cy_menu.gif");

    static private final SubLString $str2$_ = makeString("#");

    static private final SubLSymbol $sym181$ADORNMENT_ = makeSymbol("ADORNMENT<");

    static private final SubLSymbol $sym62$OLD = makeUninternedSymbol("OLD");

    static private final SubLSymbol $sym63$NEW = makeUninternedSymbol("NEW");

    private static final SubLSymbol CONSTANT_REVIEW = makeSymbol("CONSTANT-REVIEW");

    public static final SubLFile me = new cb_adornments();


 public static final String myName = "com.cyc.cycjava.cycl.cb_adornments";

    private static final SubLSymbol _CSETF_ADORNMENT_ACTIVE_P = makeSymbol("_CSETF-ADORNMENT-ACTIVE-P");

    private static final SubLSymbol _CSETF_ADORNMENT_COLOR = makeSymbol("_CSETF-ADORNMENT-COLOR");

    private static final SubLSymbol _CSETF_ADORNMENT_COMMENT = makeSymbol("_CSETF-ADORNMENT-COMMENT");

    private static final SubLSymbol _CSETF_ADORNMENT_DYNAMIC_COMMENT = makeSymbol("_CSETF-ADORNMENT-DYNAMIC-COMMENT");

    private static final SubLSymbol _CSETF_ADORNMENT_DYNAMIC_TAGFN = makeSymbol("_CSETF-ADORNMENT-DYNAMIC-TAGFN");

    private static final SubLSymbol _CSETF_ADORNMENT_EFFECTIVE_FN = makeSymbol("_CSETF-ADORNMENT-EFFECTIVE-FN");

    private static final SubLSymbol _CSETF_ADORNMENT_HANDLER = makeSymbol("_CSETF-ADORNMENT-HANDLER");

    private static final SubLSymbol _CSETF_ADORNMENT_IMAGE = makeSymbol("_CSETF-ADORNMENT-IMAGE");

    private static final SubLSymbol _CSETF_ADORNMENT_IMAGE_ALT = makeSymbol("_CSETF-ADORNMENT-IMAGE-ALT");

    private static final SubLSymbol _CSETF_ADORNMENT_IMAGE_DISABLED = makeSymbol("_CSETF-ADORNMENT-IMAGE-DISABLED");

    private static final SubLSymbol _CSETF_ADORNMENT_LETTER = makeSymbol("_CSETF-ADORNMENT-LETTER");

    private static final SubLSymbol _CSETF_ADORNMENT_NAME = makeSymbol("_CSETF-ADORNMENT-NAME");

    private static final SubLSymbol _CSETF_ADORNMENT_TITLE = makeSymbol("_CSETF-ADORNMENT-TITLE");

    private static final SubLSymbol _CSETF_ADORNMENT_TOOL = makeSymbol("_CSETF-ADORNMENT-TOOL");

    private static final SubLSymbol _CSETF_ADORNMENT_TYPE = makeSymbol("_CSETF-ADORNMENT-TYPE");

    private static final SubLString $$$Adornment_Associations = makeString("Adornment Associations");

    private static final SubLString $$$Adornments = makeString("Adornments");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$Current_Values = makeString("Current Values");

    private static final SubLString $$$debug = makeString("debug");

    private static final SubLString $$$Icon = makeString("Icon");

    private static final SubLString $$$Name = makeString("Name");

    private static final SubLString $$$No = makeString("No");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$Tool = makeString("Tool");

    private static final SubLString $$$Type = makeString("Type");

    private static final SubLString $$$Update_Adornment_Settings = makeString("Update Adornment Settings");

    private static final SubLString $$$Yes = makeString("Yes");

    // defparameter
    @LispMethod(comment = "For passing an arg (type :gaf-arg-predicate) between mappable functions\ndefparameter")
    private static final SubLSymbol $adorn_arg$ = makeSymbol("*ADORN-ARG*");

    // defparameter
    @LispMethod(comment = "For passing an mt (type :gaf-arg-predicate) between mappable functions\ndefparameter")
    private static final SubLSymbol $adorn_mt$ = makeSymbol("*ADORN-MT*");

    // defparameter
    @LispMethod(comment = "For passing a pred (type :gaf-arg-predicate) between mappable functions\ndefparameter")
    private static final SubLSymbol $adorn_pred$ = makeSymbol("*ADORN-PRED*");

    // defparameter
    @LispMethod(comment = "For passing between mappable functions\ndefparameter")
    private static final SubLSymbol $adorn_thingo$ = makeSymbol("*ADORN-THINGO*");

    // defparameter
    @LispMethod(comment = "Where adornments should be displayed\ndefparameter")
    private static final SubLSymbol $adornment_display$ = makeSymbol("*ADORNMENT-DISPLAY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $adornment_sorted_list$ = makeSymbol("*ADORNMENT-SORTED-LIST*");

    // defparameter
    // Binding for the type of adornment (when we limit them)
    /**
     * Binding for the type of adornment (when we limit them)
     */
    @LispMethod(comment = "Binding for the type of adornment (when we limit them)\ndefparameter")
    private static final SubLSymbol $adornment_type$ = makeSymbol("*ADORNMENT-TYPE*");

    private static final SubLSymbol $ALPHA_BROWSER_DISABLED = makeKeyword("ALPHA-BROWSER-DISABLED");

    private static final SubLSymbol $CB_VIEW_ADORN = makeKeyword("CB-VIEW-ADORN");

    private static final SubLSymbol $GAF_ARG_PREDICATE = makeKeyword("GAF-ARG-PREDICATE");

    private static final SubLSymbol $HIERARCHY_BROWSER_DISABLED = makeKeyword("HIERARCHY-BROWSER-DISABLED");

    private static final SubLSymbol $INDEX_BROWSER_DISABLED = makeKeyword("INDEX-BROWSER-DISABLED");

    private static final SubLSymbol $INDEX_CONSTANT_NAME = makeKeyword("INDEX-CONSTANT-NAME");

    private static final SubLList $list100 = list(new SubLObject[] { $TYPE, makeKeyword("ASSERTION"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("IMAGE"), makeKeyword("CY-MENU"), makeKeyword("IMAGE-ALT"), makeString("[KE Assertion Review]"), makeKeyword("EFFECTIVE-FN"),
	    makeSymbol("ASSERTION-NEEDS-REVIEW-P"), makeKeyword("HANDLER"), makeString("cb-taf"), $TOOL, makeKeyword("KE-REVIEW"), makeKeyword("COMMENT"), makeString("Links to a special page for reviewing this assertion (support of #$MyReviewer).") });

    private static final SubLList $list104 = list(ONE_INTEGER, TWO_INTEGER);

    private static final SubLList $list109 = list(new SubLObject[] { $TYPE, makeKeyword("GAF-ARG-PREDICATE"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("RED-DIAMOND"), makeKeyword("IMAGE-ALT"), makeString("[Hier]"), makeKeyword("EFFECTIVE-FN"),
	    makeSymbol("HIERARCHY-LINK-EFFECTIVE-FN"), makeKeyword("HANDLER"), makeString("cb-hier"), $TOOL, makeKeyword("HIERARCHY-BROWSER"), makeKeyword("TITLE"), makeString("Hierarchy Browser"), makeKeyword("COMMENT"), makeString("Lets you browse the isa hierarchy.") });

    private static final SubLList $list115 = list(new SubLObject[] { $TYPE, makeKeyword("INDEX-CONSTANT"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("HIERARCHY-BROWSER"), makeKeyword("IMAGE-DISABLED"), makeKeyword("HIERARCHY-BROWSER-DISABLED"),
	    makeKeyword("IMAGE-ALT"), makeString("[Hier]"), makeKeyword("EFFECTIVE-FN"), makeSymbol("HB-DEFAULT-METHOD-AVAILABLE?"), makeKeyword("HANDLER"), makeString("cb-hier-default"), $TOOL, makeKeyword("HIERARCHY-BROWSER"), makeKeyword("TITLE"), makeString("Hierarchy Browser"),
	    makeKeyword("COMMENT"), makeString("Lets you browse the isa hierarchy.") });

    private static final SubLList $list121 = list(new SubLObject[] { $TYPE, makeKeyword("INDEX-CONSTANT-NAME"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("ALPHA-BROWSER"), makeKeyword("IMAGE-DISABLED"), makeKeyword("ALPHA-BROWSER-DISABLED"),
	    makeKeyword("IMAGE-ALT"), makeString("[Alpha]"), makeKeyword("EFFECTIVE-FN"), makeSymbol("CB-SHOW-ALPHABETIC-SEARCH?"), makeKeyword("HANDLER"), makeString("cb-ad"), $TOOL, makeKeyword("ALPHA-TOP"), makeKeyword("TITLE"), makeString("Alphabetical Browser"),
	    makeKeyword("COMMENT"), makeString("Links you to the alphabetical list of FORTs") });

    private static final SubLList $list134 = list(new SubLObject[] { $TYPE, makeKeyword("GAF-ARG-PREDICATE-CONTENT"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeSymbol("LITERAL-QUERY-MARKER-ELSE-GREEN"), makeKeyword("IMAGE-ALT"), makeString("[LitQ]"),
	    makeKeyword("EFFECTIVE-FN"), makeSymbol("LITERAL-QUERY-INDEX-EFFECTIVE-FN"), makeKeyword("HANDLER"), makeString("cb-lq"), $TOOL, makeKeyword("ASK"), makeKeyword("COMMENT"), makeString("There are likely to be some additional derivable relations; this establishes them.") });

    private static final SubLList $list137 = list(new SubLObject[] { $TYPE, makeKeyword("GAF-ARG-PREDICATEX"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeSymbol("LITERAL-QUERY-MARKER-ELSE-YELLOW"), makeKeyword("IMAGE-ALT"), makeString("[LitQ]"), makeKeyword("EFFECTIVE-FN"),
	    makeSymbol("LITERAL-QUERY-NORMAL-EFFECTIVE-FN"), makeKeyword("HANDLER"), makeString("cb-lq"), $TOOL, makeKeyword("ASK"), makeKeyword("COMMENT"),
	    makeString("If Green, there are likely to be some additional derivable relations; if yellow, it is possible there are additional relations. This establishes them.") });

    private static final SubLList $list140 = list(new SubLObject[] { $TYPE, makeKeyword("GAF-ARG-PREDICATEX"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeSymbol("LITERAL-QUERY-MARKER-ELSE-PURPLE"), makeKeyword("IMAGE-ALT"), makeString("[LitQ]"), makeKeyword("EFFECTIVE-FN"),
	    makeSymbol("LITERAL-QUERY-INDEX-DISPLAY-EFFECTIVE-FN"), makeKeyword("HANDLER"), makeString("cb-lq"), $TOOL, makeKeyword("ASK"), makeKeyword("COMMENT"),
	    makeString("If Green, there are likely to be some additional derivable relations; if yellow, it is possible there are additional relations. If purple, additional relations are unlikely to be found (but you won't know until you try). This establishes them.") });

    private static final SubLList $list147 = list(new SubLObject[] { $TYPE, makeKeyword("ASSERTION"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("IMAGE"), makeKeyword("BL-SDI"), makeKeyword("DYNAMIC-TAGFN"), makeSymbol("CB-GET-ASSERTED-ARGUMENT"), makeKeyword("IMAGE-ALT"),
	    makeSymbol("CB-GET-ASSERTED-ARGUMENT"), makeKeyword("EFFECTIVE-FN"), makeSymbol("ASSERTED-ASSERTION?"), makeKeyword("COMMENT"), makeString("effective when the assertion has some asserted argument."), makeKeyword("DYNAMIC-COMMENT"), makeString("The asserted argument") });

    private static final SubLList $list151 = list(new SubLObject[] { $TYPE, makeKeyword("ASSERTION"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("IMAGE"), makeKeyword("GR-SDI"), makeKeyword("DYNAMIC-TAGFN"), makeSymbol("CB-ASSERTION-DEDUCTIONS"), makeKeyword("IMAGE-ALT"),
	    makeSymbol("CB-ASSERTION-DEDUCTIONS"), makeKeyword("EFFECTIVE-FN"), makeSymbol("DEDUCED-ASSERTION?"), makeKeyword("COMMENT"), makeString("effective when the assertion has some deduced argument."), makeKeyword("DYNAMIC-COMMENT"), makeString("List of deduced formulas") });

    private static final SubLList $list156 = list(makeSymbol("INDEX-SPEC"));

    private static final SubLList $list5 = list(new SubLObject[] { makeSymbol("NAME"), makeSymbol("TYPE"), makeSymbol("ACTIVE-P"), makeSymbol("IMAGE"), makeSymbol("IMAGE-DISABLED"), makeSymbol("IMAGE-ALT"), makeSymbol("DYNAMIC-TAGFN"), makeSymbol("COLOR"), makeSymbol("LETTER"),
	    makeSymbol("EFFECTIVE-FN"), makeSymbol("HANDLER"), makeSymbol("TOOL"), makeSymbol("COMMENT"), makeSymbol("DYNAMIC-COMMENT"), makeSymbol("TITLE") });

    private static final SubLList $list6 = list(new SubLObject[] { $NAME, $TYPE, makeKeyword("ACTIVE-P"), makeKeyword("IMAGE"), makeKeyword("IMAGE-DISABLED"), makeKeyword("IMAGE-ALT"), makeKeyword("DYNAMIC-TAGFN"), makeKeyword("COLOR"), makeKeyword("LETTER"),
	    makeKeyword("EFFECTIVE-FN"), makeKeyword("HANDLER"), $TOOL, makeKeyword("COMMENT"), makeKeyword("DYNAMIC-COMMENT"), makeKeyword("TITLE") });

    private static final SubLList $list64 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));

    private static final SubLList $list68 = list(makeSymbol("*CB-ADORNMENT-TABLE*"));

    private static final SubLList $list7 = list(
	    new SubLObject[] { makeSymbol("ADORNMENT-NAME"), makeSymbol("ADORNMENT-TYPE"), makeSymbol("ADORNMENT-ACTIVE-P"), makeSymbol("ADORNMENT-IMAGE"), makeSymbol("ADORNMENT-IMAGE-DISABLED"), makeSymbol("ADORNMENT-IMAGE-ALT"), makeSymbol("ADORNMENT-DYNAMIC-TAGFN"), makeSymbol("ADORNMENT-COLOR"),
		    makeSymbol("ADORNMENT-LETTER"), makeSymbol("ADORNMENT-EFFECTIVE-FN"), makeSymbol("ADORNMENT-HANDLER"), makeSymbol("ADORNMENT-TOOL"), makeSymbol("ADORNMENT-COMMENT"), makeSymbol("ADORNMENT-DYNAMIC-COMMENT"), makeSymbol("ADORNMENT-TITLE") });

    private static final SubLList $list74 = list(list(makeSymbol("FUNCTION"), EQUAL), list(makeSymbol("FUNCTION"), makeSymbol("ADORNMENT-NAME")));

    private static final SubLList $list94 = list(new SubLObject[] { $TYPE, makeKeyword("INDEX-TERM"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("INDEX-BROWSER"), makeKeyword("IMAGE-DISABLED"), makeKeyword("INDEX-BROWSER-DISABLED"), makeKeyword("IMAGE-ALT"),
	    makeString("[Indices]"), makeKeyword("EFFECTIVE-FN"), makeSymbol("CYC-TERM"), makeKeyword("HANDLER"), makeString("cb-cf"), makeKeyword("TITLE"), makeString("Index Browser"), makeKeyword("COMMENT"), makeString("Links you to the index view for a term.") });

    private static final SubLList $list96 = list(new SubLObject[] { $TYPE, makeKeyword("ASSERTION"), makeKeyword("ACTIVE-P"), T, makeKeyword("COLOR"), makeKeyword("YELLOW"), makeKeyword("LETTER"), makeString("M"), makeKeyword("EFFECTIVE-FN"),
	    makeSymbol("ASSERTION-HAS-META-ASSERTIONS?"), makeKeyword("COMMENT"), makeString("Indicates that some meta-assertion has been made, that is, an assertion where one of the arguments is this assertion.") });

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str103$bl_menu_gif = makeString("bl_menu.gif");

    private static final SubLString $str108$red_diam_gif = makeString("red_diam.gif");

    private static final SubLString $str112$hierarchy_browser_gif = makeString("hierarchy-browser.gif");

    private static final SubLString $str114$hierarchy_browser_disabled_gif = makeString("hierarchy-browser-disabled.gif");

    private static final SubLString $str118$alpha_browser_gif = makeString("alpha-browser.gif");

    private static final SubLString $str120$alpha_browser_disabled_gif = makeString("alpha-browser-disabled.gif");

    private static final SubLString $str124$plus_green_gif = makeString("plus-green.gif");

    private static final SubLString $str125$_LitQ_ = makeString("[LitQ]");

    private static final SubLString $str127$plus_yellow_gif = makeString("plus-yellow.gif");

    private static final SubLString $str129$plus_purple_gif = makeString("plus-purple.gif");

    private static final SubLString $str142$_Asserted_Argument_ = makeString("[Asserted Argument]");

    private static final SubLString $str144$_Assertion_Deductions_ = makeString("[Assertion Deductions]");

    private static final SubLString $str146$bl_sdi_gif = makeString("bl_sdi.gif");

    private static final SubLString $str150$gr_sdi_gif = makeString("gr_sdi.gif");

    private static final SubLString $str155$cb_view_adorn_html = makeString("cb-view-adorn.html");

    private static final SubLString $str157$_a_does_not_specify_an_index = makeString("~a does not specify an index");

    private static final SubLString $str159$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str160$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $str165$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $str171$cb_adornment_handler = makeString("cb-adornment-handler");

    private static final SubLString $str174$Currently_Active_Adornments__ = makeString("Currently Active Adornments: ");

    private static final SubLString $str178$Active_ = makeString("Active?");

    private static final SubLString $str181$Dynamic_ = makeString("Dynamic?");

    private static final SubLString $str182$Has_Link_ = makeString("Has Link?");

    private static final SubLString $str185$effective_fn = makeString("effective-fn");

    private static final SubLString $str187$_dddddd = makeString("#dddddd");

    private static final SubLString $str188$_cccccc = makeString("#cccccc");

    private static final SubLString $str189$_dynamic = makeString("-dynamic");

    private static final SubLString $str190$_ = makeString("?");

    private static final SubLString $str197$_ = makeString("[");

    private static final SubLString $str198$_ = makeString("]");

    private static final SubLString $str199$Active_adornments_have_been_chang = makeString("Active adornments have been changed");

    private static final SubLString $str201$_View_Adornments_ = makeString("[View Adornments]");

    private static final SubLString $str202$cb_view_adorn__A = makeString("cb-view-adorn&~A");

    private static final SubLString $str205$___ = makeString(" : ");

    private static final SubLString $str57$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLString $str85$cb_start_ = makeString("cb-start|");

    private static final SubLString $str86$_ = makeString("&");

    private static final SubLString $str91$index_browser_gif = makeString("index-browser.gif");

    private static final SubLString $str93$index_browser_disabled_gif = makeString("index-browser-disabled.gif");

    private static final SubLString $str99$cy_menu_gif = makeString("cy_menu.gif");

    private static final SubLSymbol $sym186$ADORNMENT_ = makeSymbol("ADORNMENT<");

    private static final SubLSymbol $sym65$OLD = makeUninternedSymbol("OLD");

    private static final SubLSymbol $sym66$NEW = makeUninternedSymbol("NEW");

    private static final SubLSymbol ACTIVATE_ADORNMENT = makeSymbol("ACTIVATE-ADORNMENT");

    private static final SubLSymbol ACTIVE_ADORNMENT_STRUCT_P = makeSymbol("ACTIVE-ADORNMENT-STRUCT-P");

    private static final SubLSymbol ADORNMENT = makeSymbol("ADORNMENT");

    private static final SubLSymbol ADORNMENT_ACTIVE_P = makeSymbol("ADORNMENT-ACTIVE-P");

    private static final SubLSymbol ADORNMENT_COLOR = makeSymbol("ADORNMENT-COLOR");

    private static final SubLSymbol ADORNMENT_COMMENT = makeSymbol("ADORNMENT-COMMENT");

    private static final SubLSymbol ADORNMENT_DYNAMIC_COMMENT = makeSymbol("ADORNMENT-DYNAMIC-COMMENT");

    private static final SubLSymbol ADORNMENT_DYNAMIC_TAGFN = makeSymbol("ADORNMENT-DYNAMIC-TAGFN");

    private static final SubLSymbol ADORNMENT_EFFECTIVE_FN = makeSymbol("ADORNMENT-EFFECTIVE-FN");

    private static final SubLSymbol ADORNMENT_HANDLER = makeSymbol("ADORNMENT-HANDLER");

    private static final SubLSymbol ADORNMENT_IMAGE = makeSymbol("ADORNMENT-IMAGE");

    private static final SubLSymbol ADORNMENT_IMAGE_ALT = makeSymbol("ADORNMENT-IMAGE-ALT");

    private static final SubLSymbol ADORNMENT_IMAGE_DISABLED = makeSymbol("ADORNMENT-IMAGE-DISABLED");

    private static final SubLSymbol ADORNMENT_LETTER = makeSymbol("ADORNMENT-LETTER");

    private static final SubLSymbol ADORNMENT_NAME = makeSymbol("ADORNMENT-NAME");

    private static final SubLSymbol ADORNMENT_P = makeSymbol("ADORNMENT-P");

    private static final SubLSymbol ADORNMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ADORNMENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol ADORNMENT_TITLE = makeSymbol("ADORNMENT-TITLE");
    private static final SubLSymbol ADORNMENT_TOOL = makeSymbol("ADORNMENT-TOOL");

    private static final SubLSymbol ADORNMENT_TYPE = makeSymbol("ADORNMENT-TYPE");

    private static final SubLSymbol ALPHABETICAL_SEARCH = makeSymbol("ALPHABETICAL-SEARCH");

    private static final SubLSymbol ASSERTED_ASSERTION = makeSymbol("ASSERTED-ASSERTION");

    private static final SubLSymbol ASSERTION_REVIEW = makeSymbol("ASSERTION-REVIEW");

    private static final SubLSymbol CB_ADORNMENT_HANDLER = makeSymbol("CB-ADORNMENT-HANDLER");

    private static final SubLSymbol CB_LINK_VIEW_ADORN = makeSymbol("CB-LINK-VIEW-ADORN");

    private static final SubLSymbol CB_VIEW_ADORN = makeSymbol("CB-VIEW-ADORN");

    private static final SubLSymbol CONVERT_DEDUCTION_TO_FORMULA = makeSymbol("CONVERT-DEDUCTION-TO-FORMULA");

    private static final SubLSymbol DEDUCED_ASSERTION = makeSymbol("DEDUCED-ASSERTION");

    private static final SubLSymbol DISPLAY_ADORNMENT = makeSymbol("DISPLAY-ADORNMENT");

    private static final SubLSymbol HIERARCHY_DEFAULT = makeSymbol("HIERARCHY-DEFAULT");

    private static final SubLSymbol HIERARCHY_LINK = makeSymbol("HIERARCHY-LINK");

    private static final SubLSymbol INDEX_BROWSER = makeSymbol("INDEX-BROWSER");

    private static final SubLSymbol LITERAL_QUERY_INDEX = makeSymbol("LITERAL-QUERY-INDEX");

    private static final SubLSymbol LITERAL_QUERY_INDEX_DISPLAY = makeSymbol("LITERAL-QUERY-INDEX-DISPLAY");

    private static final SubLSymbol LITERAL_QUERY_NORMAL = makeSymbol("LITERAL-QUERY-NORMAL");

    private static final SubLSymbol MAKE_ADORNMENT = makeSymbol("MAKE-ADORNMENT");

    private static final SubLSymbol META_AXIOMS = makeSymbol("META-AXIOMS");

    private static final SubLSymbol PRINT_ADORNMENT = makeSymbol("PRINT-ADORNMENT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ADORNMENT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ADORNMENT-METHOD");

    public static SubLObject _csetf_adornment_active_p(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_adornment_active_p_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_adornment_color(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField9(value);
    }

    public static final SubLObject _csetf_adornment_color_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField9(value);
    }

    public static SubLObject _csetf_adornment_comment(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField14(value);
    }

    public static final SubLObject _csetf_adornment_comment_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField14(value);
    }

    public static SubLObject _csetf_adornment_dynamic_comment(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField15(value);
    }

    public static final SubLObject _csetf_adornment_dynamic_comment_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField15(value);
    }

    public static SubLObject _csetf_adornment_dynamic_tagfn(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField8(value);
    }

    public static final SubLObject _csetf_adornment_dynamic_tagfn_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField8(value);
    }

    public static SubLObject _csetf_adornment_effective_fn(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField11(value);
    }

    public static final SubLObject _csetf_adornment_effective_fn_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField11(value);
    }

    public static SubLObject _csetf_adornment_handler(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField12(value);
    }

    public static final SubLObject _csetf_adornment_handler_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField12(value);
    }

    public static SubLObject _csetf_adornment_image(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_adornment_image_alt(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_adornment_image_disabled(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static final SubLObject _csetf_adornment_image_disabled_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_adornment_letter(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField10(value);
    }

    public static final SubLObject _csetf_adornment_letter_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField10(value);
    }

    public static SubLObject _csetf_adornment_name(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_adornment_name_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_adornment_title(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField16(value);
    }

    public static final SubLObject _csetf_adornment_title_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField16(value);
    }

    public static SubLObject _csetf_adornment_tool(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField13(value);
    }

    public static final SubLObject _csetf_adornment_tool_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField13(value);
    }

    public static SubLObject _csetf_adornment_type(final SubLObject v_object, final SubLObject value) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_adornment_type_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.setField3(value);
    }

    public static SubLObject activate_adornment(final SubLObject adornment) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject thingo = $adorn_thingo$.getDynamicValue(thread);
	final SubLObject arg = $adorn_arg$.getDynamicValue(thread);
	final SubLObject pred = $adorn_pred$.getDynamicValue(thread);
	final SubLObject mt = $adorn_mt$.getDynamicValue(thread);
	final SubLObject type = $adornment_type$.getDynamicValue(thread);
	if (NIL != adorn_thingo_p(adornment, thingo, arg, pred)) {
	    display_adornment(adornment, type, thingo, arg, pred, mt);
	    return T;
	}
	return NIL;
    }

    public static final SubLObject activate_adornment_alt(SubLObject adornment) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject thingo = $adorn_thingo$.getDynamicValue(thread);
		SubLObject arg = $adorn_arg$.getDynamicValue(thread);
		SubLObject pred = $adorn_pred$.getDynamicValue(thread);
		SubLObject mt = $adorn_mt$.getDynamicValue(thread);
		SubLObject type = $adornment_type$.getDynamicValue(thread);
		if (NIL != adorn_thingo_p(adornment, thingo, arg, pred)) {
		    display_adornment(adornment, type, thingo, arg, pred, mt);
		    return T;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject active_adornment_p(final SubLObject adornment) {
	final SubLObject active_p = adornment_active_p(adornment);
	if (active_p.isFunctionSpec()) {
	    return funcall(active_p);
	}
	return active_p;
    }

    public static final SubLObject active_adornment_p_alt(SubLObject adornment) {
	{
	    SubLObject active_p = adornment_active_p(adornment);
	    if (active_p.isFunctionSpec()) {
		return funcall(active_p);
	    } else {
		return active_p;
	    }
	}
    }

    public static SubLObject active_adornment_struct_p(final SubLObject adornment, SubLObject type) {
	if (type == UNPROVIDED) {
	    type = $adornment_type$.getDynamicValue();
	}
	if (NIL != type) {
	    if (adornment_type(adornment).eql(type) && (NIL != active_adornment_p(adornment))) {
		return list(adornment);
	    }
	} else if (NIL != active_adornment_p(adornment)) {
	    return list(adornment);
	}

	return NIL;
    }

    public static final SubLObject active_adornment_struct_p_alt(SubLObject adornment, SubLObject type) {
	if (type == UNPROVIDED) {
	    type = $adornment_type$.getDynamicValue();
	}
	if (NIL != type) {
	    if (adornment_type(adornment).eql(type) && (NIL != active_adornment_p(adornment))) {
		return list(adornment);
	    }
	} else {
	    if (NIL != active_adornment_p(adornment)) {
		return list(adornment);
	    }
	}
	return NIL;
    }

    public static SubLObject active_adornments(final SubLObject type) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject result = NIL;
	final SubLObject _prev_bind_0 = $adornment_type$.currentBinding(thread);
	try {
	    $adornment_type$.bind(type, thread);
	    result = Mapping.mapcan(symbol_function(ACTIVE_ADORNMENT_STRUCT_P), $cb_adornment_table$.getGlobalValue(), EMPTY_SUBL_OBJECT_ARRAY);
	} finally {
	    $adornment_type$.rebind(_prev_bind_0, thread);
	}
	return result;
    }

    public static final SubLObject active_adornments_alt(SubLObject type) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject result = NIL;
		{
		    SubLObject _prev_bind_0 = $adornment_type$.currentBinding(thread);
		    try {
			$adornment_type$.bind(type, thread);
			result = Mapping.mapcan(symbol_function(ACTIVE_ADORNMENT_STRUCT_P), $cb_adornment_table$.getGlobalValue(), EMPTY_SUBL_OBJECT_ARRAY);
		    } finally {
			$adornment_type$.rebind(_prev_bind_0, thread);
		    }
		}
		return result;
	    }
	}
    }

    public static SubLObject adorn_thingo_p(final SubLObject adornment, final SubLObject thingo, SubLObject arg, SubLObject pred) {
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (!adornment_effective_fn(adornment).isFunctionSpec()) {
	    return NIL;
	}
	if (NIL != arg) {
	    return funcall(adornment_effective_fn(adornment), thingo, arg, pred);
	}
	return funcall(adornment_effective_fn(adornment), thingo);
    }

    public static final SubLObject adorn_thingo_p_alt(SubLObject adornment, SubLObject thingo, SubLObject arg, SubLObject pred) {
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (!adornment_effective_fn(adornment).isFunctionSpec()) {
	    return NIL;
	} else {
	    if (NIL != arg) {
		return funcall(adornment_effective_fn(adornment), thingo, arg, pred);
	    } else {
		return funcall(adornment_effective_fn(adornment), thingo);
	    }
	}
    }

    public static SubLObject adornment_active_p(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField4();
    }

    public static final SubLObject adornment_active_p_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField4();
    }

    public static SubLObject adornment_color(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField9();
    }

    public static final SubLObject adornment_color_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField9();
    }

    public static SubLObject adornment_comment(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField14();
    }

    public static final SubLObject adornment_comment_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField14();
    }

    public static SubLObject adornment_dynamic_comment(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField15();
    }

    public static final SubLObject adornment_dynamic_comment_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField15();
    }

    public static SubLObject adornment_dynamic_tagfn(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField8();
    }

    public static final SubLObject adornment_dynamic_tagfn_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField8();
    }

    public static SubLObject adornment_effective_fn(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField11();
    }

    public static final SubLObject adornment_effective_fn_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField11();
    }

    public static SubLObject adornment_handler(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField12();
    }

    public static final SubLObject adornment_handler_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField12();
    }

    public static SubLObject adornment_image(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField5();
    }

    public static SubLObject adornment_image_alt(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField7();
    }

    public static final SubLObject adornment_image_alt_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField7();
    }

    public static SubLObject adornment_image_disabled(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField6();
    }

    public static final SubLObject adornment_image_disabled_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField6();
    }

    public static SubLObject adornment_letter(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField10();
    }

    public static final SubLObject adornment_letter_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField10();
    }

    public static SubLObject adornment_name(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject adornment_name_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField2();
    }

    public static SubLObject adornment_p(final SubLObject v_object) {
	return v_object.getClass() == $adornment_native.class ? T : NIL;
    }

    public static final SubLObject adornment_p_alt(SubLObject v_object) {
	return v_object.getClass() == $adornment_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject adornment_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	print_adornment(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject adornment_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	print_adornment(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject adornment_title(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField16();
    }

    public static final SubLObject adornment_title_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField16();
    }

    public static SubLObject adornment_tool(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField13();
    }

    public static final SubLObject adornment_tool_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField13();
    }

    public static SubLObject adornment_type(final SubLObject v_object) {
	assert NIL != adornment_p(v_object) : "! cb_adornments.adornment_p(v_object) " + "cb_adornments.adornment_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject adornment_type_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, ADORNMENT_P);
	return v_object.getField3();
    }

    public static SubLObject adornmentL(final SubLObject adornment1, final SubLObject adornment2) {
	final SubLObject pos1 = position(adornment_name(adornment1), $adornment_sorted_list$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	final SubLObject pos2 = position(adornment_name(adornment2), $adornment_sorted_list$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	if ((NIL == pos1) || (NIL == pos2)) {
	    return NIL;
	}
	return numL(pos1, pos2);
    }

    public static final SubLObject adornmentL_alt(SubLObject adornment1, SubLObject adornment2) {
	{
	    SubLObject pos1 = position(adornment_name(adornment1), $adornment_sorted_list$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    SubLObject pos2 = position(adornment_name(adornment2), $adornment_sorted_list$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if ((NIL == pos1) || (NIL == pos2)) {
		return NIL;
	    }
	    return numL(pos1, pos2);
	}
    }

    /**
     * assumes all bookkeeping assertions are gafs
     */
    @LispMethod(comment = "assumes all bookkeeping assertions are gafs")
    public static SubLObject bookkeeping_assertion_p(final SubLObject assertion) {
	return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != fort_types_interface.bookkeeping_predicate_p(assertions_high.gaf_predicate(assertion))));
    }

    /**
     * assumes all bookkeeping assertions are gafs
     */
    @LispMethod(comment = "assumes all bookkeeping assertions are gafs")
    public static final SubLObject bookkeeping_assertion_p_alt(SubLObject assertion) {
	return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != fort_types_interface.bookkeeping_predicate_p(assertions_high.gaf_predicate(assertion))));
    }

    public static SubLObject calc_adornment_image_alt(final SubLObject adornment, final SubLObject thingo, SubLObject arg, SubLObject pred) {
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	final SubLObject image_alt = adornment_image_alt(adornment);
	if ((NIL == image_alt) || image_alt.isString()) {
	    return image_alt;
	}
	if (NIL != arg) {
	    return funcall(adornment_image_alt(adornment), thingo, arg, pred);
	}
	return funcall(adornment_image_alt(adornment), thingo);
    }

    public static final SubLObject calc_adornment_image_alt_alt(SubLObject adornment, SubLObject thingo, SubLObject arg, SubLObject pred) {
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	{
	    SubLObject image_alt = adornment_image_alt(adornment);
	    if ((NIL == image_alt) || image_alt.isString()) {
		return image_alt;
	    } else {
		if (NIL != arg) {
		    return funcall(adornment_image_alt(adornment), thingo, arg, pred);
		} else {
		    return funcall(adornment_image_alt(adornment), thingo);
		}
	    }
	}
    }

    /**
     * Handles the selection that the user has made about their new MT or other filters.
     */
    @LispMethod(comment = "Handles the selection that the user has made about their new MT or other filters.")
    public static SubLObject cb_adornment_handler(final SubLObject args) {
	$debug_adornments_p$.setDynamicValue(makeBoolean(NIL != html_extract_input($$$debug, args)));
	SubLObject cdolist_list_var = Mapping.mapcar(symbol_function(ADORNMENT_NAME), $cb_adornment_table$.getGlobalValue());
	SubLObject name = NIL;
	name = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject dynamic_tag = cconcatenate(format_nil.format_nil_a_no_copy(name), $str189$_dynamic);
	    final SubLObject adornment = find_adornment(name);
	    if (NIL != html_extract_input(Strings.string(name), args)) {
		enable_adornment(name, T);
	    } else {
		enable_adornment(name, NIL);
	    }
	    if (NIL != html_extract_input(dynamic_tag, args)) {
		_csetf_adornment_image_alt(adornment, adornment_dynamic_tagfn(adornment));
	    } else {
		_csetf_adornment_image_alt(adornment, cconcatenate($str197$_, new SubLObject[] { format_nil.format_nil_a_no_copy(adornment_name(adornment)), $str198$_ }));
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    name = cdolist_list_var.first();
	}
	cb_message_page_with_history($str199$Active_adornments_have_been_chang, UNPROVIDED);
	return NIL;
    }

    /**
     * Handles the selection that the user has made about their new MT or other filters.
     */
    @LispMethod(comment = "Handles the selection that the user has made about their new MT or other filters.")
    public static final SubLObject cb_adornment_handler_alt(SubLObject args) {
	$debug_adornments_p$.setDynamicValue(makeBoolean(NIL != html_extract_input($$$debug, args)));
	{
	    SubLObject cdolist_list_var = Mapping.mapcar(symbol_function(ADORNMENT_NAME), $cb_adornment_table$.getGlobalValue());
	    SubLObject name = NIL;
	    for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), name = cdolist_list_var.first()) {
		{
		    SubLObject dynamic_tag = format(NIL, $str_alt183$_A_dynamic, name);
		    SubLObject adornment = find_adornment(name);
		    if (NIL != html_extract_input(Strings.string(name), args)) {
			enable_adornment(name, T);
		    } else {
			enable_adornment(name, NIL);
		    }
		    if (NIL != html_extract_input(dynamic_tag, args)) {
			_csetf_adornment_image_alt(adornment, adornment_dynamic_tagfn(adornment));
		    } else {
			_csetf_adornment_image_alt(adornment, format(NIL, $str_alt189$__A_, adornment_name(adornment)));
		    }
		}
	    }
	}
	cb_message_page_with_history($str_alt190$Active_adornments_have_been_chang, UNPROVIDED);
	return NIL;
    }

    public static SubLObject cb_assertion_deductions(final SubLObject assertion) {
	if (NIL != assertion) {
	    return Mapping.mapcar(symbol_function(CONVERT_DEDUCTION_TO_FORMULA), assertions_high.assertion_deductions(assertion));
	}
	return $str144$_Assertion_Deductions_;
    }

    public static final SubLObject cb_assertion_deductions_alt(SubLObject assertion) {
	if (NIL != assertion) {
	    return Mapping.mapcar(symbol_function(CONVERT_DEDUCTION_TO_FORMULA), assertions_high.assertion_deductions(assertion));
	}
	return $str_alt145$_Assertion_Deductions_;
    }

    public static SubLObject cb_c_index_adornments(final SubLObject index_hook) {
	html_markup(html_macros.$html_bold_head$.getGlobalValue());
	cb_link($VIEW_ADORN, index_hook, $$$Adornments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	html_princ($str205$___);
	html_markup(html_macros.$html_bold_tail$.getGlobalValue());
	display_active_adornments(UNPROVIDED);
	html_newline(TWO_INTEGER);
	return NIL;
    }

    public static final SubLObject cb_c_index_adornments_alt(SubLObject index_hook) {
	html_markup(html_macros.$html_bold_head$.getGlobalValue());
	cb_link($VIEW_ADORN, index_hook, $$$Adornments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	html_princ($str_alt197$___);
	html_markup(html_macros.$html_bold_tail$.getGlobalValue());
	display_active_adornments(UNPROVIDED);
	html_newline(TWO_INTEGER);
	return NIL;
    }

    public static SubLObject cb_get_asserted_argument(final SubLObject assertion) {
	if (NIL != assertion) {
	    return assertions_high.get_asserted_argument(assertion);
	}
	return $str142$_Asserted_Argument_;
    }

    public static final SubLObject cb_get_asserted_argument_alt(SubLObject assertion) {
	if (NIL != assertion) {
	    return assertions_high.get_asserted_argument(assertion);
	}
	return $str_alt143$_Asserted_Argument_;
    }

    /**
     * Should we include a link to the hierarchy browser for this ARG PREDICATE combination
     */
    @LispMethod(comment = "Should we include a link to the hierarchy browser for this ARG PREDICATE combination")
    public static SubLObject cb_include_hierarchy_linkP(final SubLObject arg, final SubLObject predicate) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != subl_promotions.memberP(arg, $list104, UNPROVIDED, UNPROVIDED)) {
	    SubLObject transitiveP = NIL;
	    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
	    try {
		mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
		mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
		transitiveP = kb_accessors.transitive_predicateP(predicate);
	    } finally {
		mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
		mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
	    }
	    return transitiveP;
	}
	return NIL;
    }

    /**
     * Should we include a link to the hierarchy browser for this ARG PREDICATE combination
     */
    @LispMethod(comment = "Should we include a link to the hierarchy browser for this ARG PREDICATE combination")
    public static final SubLObject cb_include_hierarchy_linkP_alt(SubLObject arg, SubLObject predicate) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != subl_promotions.memberP(arg, $list_alt105, UNPROVIDED, UNPROVIDED)) {
		{
		    SubLObject transitiveP = NIL;
		    {
			SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
			    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			    transitiveP = kb_accessors.transitive_predicateP(predicate);
			} finally {
			    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
		    }
		    return transitiveP;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject cb_link_view_adorn(final SubLObject index_hook, SubLObject linktext) {
	if (linktext == UNPROVIDED) {
	    linktext = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == linktext) {
	    linktext = $str201$_View_Adornments_;
	}
	final SubLObject frame_name_var = cb_frame_name($MAIN);
	html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	html_char(CHAR_quotation, UNPROVIDED);
	cyc_cgi_url_int();
	format(html_macros.$html_stream$.getDynamicValue(thread), $str202$cb_view_adorn__A, cb_index_identifier(index_hook));
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
	return index_hook;
    }

    /**
     * Handles the selection that the user has made about their new MT or other filters.
     */

    public static final SubLObject cb_link_view_adorn_alt(SubLObject index_hook, SubLObject linktext) {
	if (linktext == UNPROVIDED) {
	    linktext = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == linktext) {
		linktext = $str_alt192$_View_Adornments_;
	    }
	    {
		SubLObject frame_name_var = cb_frame_name($MAIN);
		html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		cyc_cgi_url_int();
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt194$cb_view_adorn__A, cb_index_identifier(index_hook));
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
	    return index_hook;
	}
    }

    public static SubLObject cb_show_alphabetic_searchP(final SubLObject fort) {
	return constant_p(fort);
    }

    public static final SubLObject cb_show_alphabetic_searchP_alt(SubLObject fort) {
	return constant_p(fort);
    }

    /**
     * Displays an HTML page that allows the user to change the current adornments.
     */
    @LispMethod(comment = "Displays an HTML page that allows the user to change the current adornments.")
    public static SubLObject cb_view_adorn(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject current;
	final SubLObject datum = current = args;
	SubLObject index_spec = NIL;
	destructuring_bind_must_consp(current, datum, $list156);
	index_spec = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject index_hook = cb_guess_index(index_spec);
	    if (NIL == cb_index_hook_p(index_hook)) {
		cb_error($str157$_a_does_not_specify_an_index, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return NIL;
	    }
	    final SubLObject title_var = $$$Adornments;
	    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
	    try {
		html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread)
			: integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
		html_markup($str159$__DOCTYPE_html_PUBLIC_____W3C__DT);
		if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
		    html_source_readability_terpri(UNPROVIDED);
		    html_markup($str160$_meta_http_equiv__X_UA_Compatible);
		}
		html_source_readability_terpri(UNPROVIDED);
		final SubLObject _prev_bind_0_$2 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
		    final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
			html_markup($str165$yui_skin_sam);
			html_char(CHAR_quotation, UNPROVIDED);
			html_char(CHAR_greater, UNPROVIDED);
			final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
			try {
			    html_macros.$html_safe_print$.bind(T, thread);
			    html_markup(html_macros.$html_div_head$.getGlobalValue());
			    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
			    html_char(CHAR_quotation, UNPROVIDED);
			    html_markup($$$reloadFrameButton);
			    html_char(CHAR_quotation, UNPROVIDED);
			    html_char(CHAR_greater, UNPROVIDED);
			    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
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
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
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
			    final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
			    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
			    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_macros.$within_html_form$.bind(T, thread);
				html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
				html_hidden_input($str171$cb_adornment_handler, T, UNPROVIDED);
				cb_help_preamble($CB_VIEW_ADORN, UNPROVIDED, UNPROVIDED);
				html_newline(TWO_INTEGER);
				html_reset_input($$$Current_Values);
				html_indent(UNPROVIDED);
				html_submit_input($$$Update_Adornment_Settings, UNPROVIDED, UNPROVIDED);
				html_newline(UNPROVIDED);
				html_hr(UNPROVIDED, UNPROVIDED);
				html_newline(UNPROVIDED);
				html_markup(html_macros.$html_strong_head$.getGlobalValue());
				html_princ($str174$Currently_Active_Adornments__);
				html_markup(html_macros.$html_strong_tail$.getGlobalValue());
				display_active_adornments(UNPROVIDED);
				html_newline(TWO_INTEGER);
				html_markup(html_macros.$html_strong_head$.getGlobalValue());
				html_princ($$$Adornment_Associations);
				html_markup(html_macros.$html_strong_tail$.getGlobalValue());
				html_newline(UNPROVIDED);
				html_markup(html_macros.$html_table_head$.getGlobalValue());
				html_markup(html_macros.$html_table_border$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(TWO_INTEGER);
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
				final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
				    html_char(CHAR_greater, UNPROVIDED);
				    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					html_char(CHAR_greater, UNPROVIDED);
					final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_markup(html_macros.$html_table_head$.getGlobalValue());
					    html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
					    html_markup(html_macros.$html_table_border$.getGlobalValue());
					    html_char(CHAR_quotation, UNPROVIDED);
					    html_markup(ZERO_INTEGER);
					    html_char(CHAR_quotation, UNPROVIDED);
					    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
					    html_char(CHAR_quotation, UNPROVIDED);
					    html_markup(THREE_INTEGER);
					    html_char(CHAR_quotation, UNPROVIDED);
					    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
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
						    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
						    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($MIDDLE));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($TOP));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_char(CHAR_greater, UNPROVIDED);
						    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($$$Icon);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
						    }
						    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
						    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
						    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($MIDDLE));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($TOP));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_char(CHAR_greater, UNPROVIDED);
						    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($str178$Active_);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
						    }
						    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
						    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
						    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($LEFT));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($TOP));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_char(CHAR_greater, UNPROVIDED);
						    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($$$Name);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
						    }
						    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
						    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
						    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($LEFT));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($TOP));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_char(CHAR_greater, UNPROVIDED);
						    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($str181$Dynamic_);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
						    }
						    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
						    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
						    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($LEFT));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($TOP));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_char(CHAR_greater, UNPROVIDED);
						    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($str182$Has_Link_);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
						    }
						    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
						    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
						    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($LEFT));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($TOP));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_char(CHAR_greater, UNPROVIDED);
						    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($$$Type);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
						    }
						    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
						    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
						    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($LEFT));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_markup(html_align($TOP));
						    html_char(CHAR_quotation, UNPROVIDED);
						    html_char(CHAR_greater, UNPROVIDED);
						    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_strong_head$.getGlobalValue());
							html_princ($$$Tool);
							html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
						    }
						    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
						    if (NIL != $debug_adornments_p$.getDynamicValue(thread)) {
							html_markup(html_macros.$html_table_header_head$.getGlobalValue());
							html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($MIDDLE));
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($TOP));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_markup(html_macros.$html_strong_head$.getGlobalValue());
							    html_princ($str185$effective_fn);
							    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
							}
							html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
						    }
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
						}
						html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
						html_source_readability_terpri(UNPROVIDED);
						SubLObject bgcolor = NIL;
						SubLObject color_toggle = NIL;
						SubLObject list_var = NIL;
						SubLObject entry = NIL;
						SubLObject ignore_me = NIL;
						list_var = Sort.sort(copy_list($cb_adornment_table$.getGlobalValue()), symbol_function($sym186$ADORNMENT_), UNPROVIDED);
						entry = list_var.first();
						for (ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), entry = list_var.first(), ignore_me = add(ONE_INTEGER, ignore_me)) {
						    if (NIL != color_toggle) {
							color_toggle = NIL;
						    } else {
							color_toggle = T;
						    }
						    bgcolor = (NIL != color_toggle) ? $str187$_dddddd : $str188$_cccccc;
						    final SubLObject name = Strings.string(adornment_name(entry));
						    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
						    if (NIL != bgcolor) {
							html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(bgcolor);
							html_char(CHAR_quotation, UNPROVIDED);
						    }
						    html_char(CHAR_greater, UNPROVIDED);
						    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
							html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($MIDDLE));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    display_adornment(entry, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
							html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($MIDDLE));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_checkbox_input(Strings.string(name), Strings.string(name), adornment_active_p(entry), UNPROVIDED, UNPROVIDED, UNPROVIDED);
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
							html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($LEFT));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_markup(html_macros.$html_bold_head$.getGlobalValue());
							    html_princ(Strings.string_downcase(name, UNPROVIDED, UNPROVIDED));
							    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
							html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($LEFT));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    if (NIL != adornment_dynamic_tagfn(entry)) {
								html_checkbox_input(cconcatenate(format_nil.format_nil_a_no_copy(name), $str189$_dynamic), cconcatenate(format_nil.format_nil_a_no_copy(name), $str189$_dynamic),
									makeBoolean((NIL != adornment_image_alt(entry)) && (!adornment_image_alt(entry).isString())), UNPROVIDED, UNPROVIDED, UNPROVIDED);
								html_indent(UNPROVIDED);
								if (NIL != adornment_dynamic_comment(entry)) {
								    html_princ(adornment_dynamic_comment(entry));
								} else {
								    html_princ($str190$_);
								}
							    } else {
								html_princ($$$No);
							    }
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
							html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($LEFT));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_princ(NIL != adornment_handler(entry) ? $$$Yes : $$$No);
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
							html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($LEFT));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_princ(Strings.string_downcase(Strings.string(adornment_type(entry)), UNPROVIDED, UNPROVIDED));
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($LEFT));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    final SubLObject tool = adornment_tool(entry);
							    if ((NIL != tool) && (NIL != cb_link_method(tool))) {
								cb_link(tool, cb_tool_abbreviation(tool), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
							    } else {
								html_glyph($NBSP, UNPROVIDED);
							    }
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							if (NIL != $debug_adornments_p$.getDynamicValue(thread)) {
							    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
							    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							    html_char(CHAR_quotation, UNPROVIDED);
							    html_markup(html_align($LEFT));
							    html_char(CHAR_quotation, UNPROVIDED);
							    html_char(CHAR_greater, UNPROVIDED);
							    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_princ(Strings.string(adornment_effective_fn(entry)));
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
							    }
							    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							}
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
						    }
						    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
						    html_source_readability_terpri(UNPROVIDED);
						    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
						    if (NIL != bgcolor) {
							html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(bgcolor);
							html_char(CHAR_quotation, UNPROVIDED);
						    }
						    html_char(CHAR_greater, UNPROVIDED);
						    final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(TWO_INTEGER);
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_br();
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(FIVE_INTEGER);
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_macros.$html_table_data_align$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(html_align($LEFT));
							html_char(CHAR_quotation, UNPROVIDED);
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    if (NIL != adornment_comment(entry)) {
								html_princ(adornment_comment(entry));
							    } else {
								html_princ($str190$_);
							    }
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
							}
							html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							if (NIL != bgcolor) {
							    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
							    html_char(CHAR_quotation, UNPROVIDED);
							    html_markup(bgcolor);
							    html_char(CHAR_quotation, UNPROVIDED);
							}
							html_char(CHAR_greater, UNPROVIDED);
							final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
							    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
							    html_char(CHAR_quotation, UNPROVIDED);
							    html_markup(SEVEN_INTEGER);
							    html_char(CHAR_quotation, UNPROVIDED);
							    html_char(CHAR_greater, UNPROVIDED);
							    final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_br();
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
							    }
							    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
							}
							html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_source_readability_terpri(UNPROVIDED);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
						    }
						    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
						    html_source_readability_terpri(UNPROVIDED);
						}
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
					    }
					    html_markup(html_macros.$html_table_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
					}
					html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
				    }
				    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
				    html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
				}
				html_markup(html_macros.$html_table_tail$.getGlobalValue());
				html_newline(UNPROVIDED);
				html_reset_input($$$Current_Values);
				html_indent(UNPROVIDED);
				html_submit_input($$$Update_Adornment_Settings, UNPROVIDED, UNPROVIDED);
				html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
			    } finally {
				html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
				html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
				html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
			    }
			    html_markup(html_macros.$html_form_tail$.getGlobalValue());
			    html_source_readability_terpri(UNPROVIDED);
			    html_copyright_notice();
			} finally {
			    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
			}
			html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$3, thread);
		    }
		    html_markup(html_macros.$html_html_tail$.getGlobalValue());
		} finally {
		    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$2, thread);
		}
		html_source_readability_terpri(UNPROVIDED);
	    } finally {
		html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
	    }
	} else {
	    cdestructuring_bind_error(datum, $list156);
	}
	return NIL;
    }

    /**
     * Displays an HTML page that allows the user to change the current adornments.
     */
    @LispMethod(comment = "Displays an HTML page that allows the user to change the current adornments.")
    public static final SubLObject cb_view_adorn_alt(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject datum = args;
		SubLObject current = datum;
		SubLObject index_spec = NIL;
		destructuring_bind_must_consp(current, datum, $list_alt157);
		index_spec = current.first();
		current = current.rest();
		if (NIL == current) {
		    {
			SubLObject index_hook = cb_guess_index(index_spec);
			if (NIL == cb_index_hook_p(index_hook)) {
			    cb_error($str_alt158$_a_does_not_specify_an_index, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    return NIL;
			}
			{
			    SubLObject title_var = $$$Adornments;
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
						html_markup($str_alt162$yui_skin_sam);
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
						    {
							SubLObject frame_name_var = cb_frame_name(NIL);
							html_markup(html_macros.$html_form_head$.getGlobalValue());
							html_markup(html_macros.$html_form_action$.getGlobalValue());
							html_char(CHAR_quotation, UNPROVIDED);
							html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
							html_char(CHAR_quotation, UNPROVIDED);
							if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
							    html_markup(html_macros.$html_form_method$.getGlobalValue());
							    html_char(CHAR_quotation, UNPROVIDED);
							    html_markup(html_macros.$html_form_method_post$.getGlobalValue());
							    html_char(CHAR_quotation, UNPROVIDED);
							}
							if (NIL != frame_name_var) {
							    html_markup(html_macros.$html_form_target$.getGlobalValue());
							    html_char(CHAR_quotation, UNPROVIDED);
							    html_markup(frame_name_var);
							    html_char(CHAR_quotation, UNPROVIDED);
							}
							html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
							    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
							    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_macros.$within_html_form$.bind(T, thread);
								html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
								html_hidden_input($str_alt163$cb_adornment_handler, T, UNPROVIDED);
								cb_help_preamble($CB_VIEW_ADORN, UNPROVIDED, UNPROVIDED);
								html_newline(TWO_INTEGER);
								html_reset_input($$$Current_Values);
								html_indent(UNPROVIDED);
								html_submit_input($$$Update_Adornment_Settings, UNPROVIDED, UNPROVIDED);
								html_newline(UNPROVIDED);
								html_checkbox_input($$$debug, $$$debug, $debug_adornments_p$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
								html_princ($str_alt167$Debug_adornments_);
								html_hr(UNPROVIDED, UNPROVIDED);
								html_newline(UNPROVIDED);
								html_markup(html_macros.$html_strong_head$.getGlobalValue());
								html_princ($str_alt168$Currently_Active_Adornments__);
								html_markup(html_macros.$html_strong_tail$.getGlobalValue());
								display_active_adornments(UNPROVIDED);
								html_newline(TWO_INTEGER);
								html_markup(html_macros.$html_strong_head$.getGlobalValue());
								html_princ($$$Adornment_Associations);
								html_markup(html_macros.$html_strong_tail$.getGlobalValue());
								html_newline(UNPROVIDED);
								html_markup(html_macros.$html_table_head$.getGlobalValue());
								if (true) {
								    html_markup(html_macros.$html_table_border$.getGlobalValue());
								    html_char(CHAR_quotation, UNPROVIDED);
								    html_markup(TWO_INTEGER);
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
								    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_markup(html_macros.$html_table_row_head$.getGlobalValue());
									html_char(CHAR_greater, UNPROVIDED);
									{
									    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
									    try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_markup(html_macros.$html_table_data_head$.getGlobalValue());
										html_char(CHAR_greater, UNPROVIDED);
										{
										    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
										    try {
											html_macros.$html_safe_print$.bind(T, thread);
											html_markup(html_macros.$html_table_head$.getGlobalValue());
											html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
											if (true) {
											    html_markup(html_macros.$html_table_border$.getGlobalValue());
											    html_char(CHAR_quotation, UNPROVIDED);
											    html_markup(ZERO_INTEGER);
											    html_char(CHAR_quotation, UNPROVIDED);
											}
											if (true) {
											    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
											    html_char(CHAR_quotation, UNPROVIDED);
											    html_markup(THREE_INTEGER);
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
											    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												html_markup(html_macros.$html_table_row_head$.getGlobalValue());
												html_char(CHAR_greater, UNPROVIDED);
												{
												    SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
												    try {
													html_macros.$html_safe_print$.bind(T, thread);
													html_markup(html_macros.$html_table_header_head$.getGlobalValue());
													if (true) {
													    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
													    html_char(CHAR_quotation, UNPROVIDED);
													    html_markup(html_align($MIDDLE));
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
													    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
													    try {
														html_macros.$html_safe_print$.bind(T, thread);
														html_markup(html_macros.$html_strong_head$.getGlobalValue());
														html_princ($$$Icon);
														html_markup(html_macros.$html_strong_tail$.getGlobalValue());
													    } finally {
														html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
													    }
													}
													html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
													html_markup(html_macros.$html_table_header_head$.getGlobalValue());
													if (true) {
													    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
													    html_char(CHAR_quotation, UNPROVIDED);
													    html_markup(html_align($MIDDLE));
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
													    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
													    try {
														html_macros.$html_safe_print$.bind(T, thread);
														html_markup(html_macros.$html_strong_head$.getGlobalValue());
														html_princ($str_alt172$Active_);
														html_markup(html_macros.$html_strong_tail$.getGlobalValue());
													    } finally {
														html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
													    }
													}
													html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
													html_markup(html_macros.$html_table_header_head$.getGlobalValue());
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
													    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
													    try {
														html_macros.$html_safe_print$.bind(T, thread);
														html_markup(html_macros.$html_strong_head$.getGlobalValue());
														html_princ($$$Name);
														html_markup(html_macros.$html_strong_tail$.getGlobalValue());
													    } finally {
														html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
													    }
													}
													html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
													html_markup(html_macros.$html_table_header_head$.getGlobalValue());
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
													    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
													    try {
														html_macros.$html_safe_print$.bind(T, thread);
														html_markup(html_macros.$html_strong_head$.getGlobalValue());
														html_princ($str_alt175$Dynamic_);
														html_markup(html_macros.$html_strong_tail$.getGlobalValue());
													    } finally {
														html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
													    }
													}
													html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
													html_markup(html_macros.$html_table_header_head$.getGlobalValue());
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
													    SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
													    try {
														html_macros.$html_safe_print$.bind(T, thread);
														html_markup(html_macros.$html_strong_head$.getGlobalValue());
														html_princ($str_alt176$Has_Link_);
														html_markup(html_macros.$html_strong_tail$.getGlobalValue());
													    } finally {
														html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
													    }
													}
													html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
													html_markup(html_macros.$html_table_header_head$.getGlobalValue());
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
													    SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
													    try {
														html_macros.$html_safe_print$.bind(T, thread);
														html_markup(html_macros.$html_strong_head$.getGlobalValue());
														html_princ($$$Type);
														html_markup(html_macros.$html_strong_tail$.getGlobalValue());
													    } finally {
														html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
													    }
													}
													html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
													html_markup(html_macros.$html_table_header_head$.getGlobalValue());
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
													    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
													    try {
														html_macros.$html_safe_print$.bind(T, thread);
														html_markup(html_macros.$html_strong_head$.getGlobalValue());
														html_princ($$$Tool);
														html_markup(html_macros.$html_strong_tail$.getGlobalValue());
													    } finally {
														html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
													    }
													}
													html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
													if (NIL != $debug_adornments_p$.getDynamicValue(thread)) {
													    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
													    if (true) {
														html_markup(html_macros.$html_table_data_align$.getGlobalValue());
														html_char(CHAR_quotation, UNPROVIDED);
														html_markup(html_align($MIDDLE));
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
														SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
														try {
														    html_macros.$html_safe_print$.bind(T, thread);
														    html_markup(html_macros.$html_strong_head$.getGlobalValue());
														    html_princ($str_alt179$effective_fn);
														    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
														} finally {
														    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
														}
													    }
													    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
													}
												    } finally {
													html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
												    }
												}
												html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
												html_source_readability_terpri(UNPROVIDED);
												{
												    SubLObject bgcolor = NIL;
												    if (NIL == $cb_show_enhanced_tables$.getDynamicValue(thread)) {
													bgcolor = $str_alt180$_cccccc;
												    }
												    {
													SubLObject color_toggle = NIL;
													SubLObject list_var = NIL;
													SubLObject entry = NIL;
													SubLObject ignore_me = NIL;
													for (list_var = Sort.sort(copy_list($cb_adornment_table$.getGlobalValue()), symbol_function($sym181$ADORNMENT_),
														UNPROVIDED), entry = list_var.first(), ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), entry = list_var.first(), ignore_me = add(ONE_INTEGER, ignore_me)) {
													    if (NIL != $cb_show_enhanced_tables$.getDynamicValue(thread)) {
														if (NIL != color_toggle) {
														    color_toggle = NIL;
														} else {
														    color_toggle = T;
														}
														bgcolor = (NIL != color_toggle) ? ((SubLObject) ($str_alt182$_dddddd)) : $str_alt180$_cccccc;
													    }
													    {
														SubLObject name = Strings.string(adornment_name(entry));
														html_markup(html_macros.$html_table_row_head$.getGlobalValue());
														if (NIL != bgcolor) {
														    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
														    html_char(CHAR_quotation, UNPROVIDED);
														    html_markup(bgcolor);
														    html_char(CHAR_quotation, UNPROVIDED);
														}
														html_char(CHAR_greater, UNPROVIDED);
														{
														    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
														    try {
															html_macros.$html_safe_print$.bind(T, thread);
															html_markup(html_macros.$html_table_data_head$.getGlobalValue());
															html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
															if (true) {
															    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
															    html_char(CHAR_quotation, UNPROVIDED);
															    html_markup(html_align($MIDDLE));
															    html_char(CHAR_quotation, UNPROVIDED);
															}
															html_char(CHAR_greater, UNPROVIDED);
															{
															    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
															    try {
																html_macros.$html_safe_print$.bind(T, thread);
																display_adornment(entry, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
															    } finally {
																html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
															    }
															}
															html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
															html_markup(html_macros.$html_table_data_head$.getGlobalValue());
															html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
															if (true) {
															    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
															    html_char(CHAR_quotation, UNPROVIDED);
															    html_markup(html_align($MIDDLE));
															    html_char(CHAR_quotation, UNPROVIDED);
															}
															html_char(CHAR_greater, UNPROVIDED);
															{
															    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
															    try {
																html_macros.$html_safe_print$.bind(T, thread);
																html_checkbox_input(Strings.string(name), Strings.string(name), adornment_active_p(entry), UNPROVIDED, UNPROVIDED, UNPROVIDED);
															    } finally {
																html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
															    }
															}
															html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
															html_markup(html_macros.$html_table_data_head$.getGlobalValue());
															html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
															if (true) {
															    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
															    html_char(CHAR_quotation, UNPROVIDED);
															    html_markup(html_align($LEFT));
															    html_char(CHAR_quotation, UNPROVIDED);
															}
															html_char(CHAR_greater, UNPROVIDED);
															{
															    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
															    try {
																html_macros.$html_safe_print$.bind(T, thread);
																html_markup(html_macros.$html_bold_head$.getGlobalValue());
																html_princ(Strings.string_downcase(name, UNPROVIDED, UNPROVIDED));
																html_markup(html_macros.$html_bold_tail$.getGlobalValue());
															    } finally {
																html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
															    }
															}
															html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
															html_markup(html_macros.$html_table_data_head$.getGlobalValue());
															html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
															if (true) {
															    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
															    html_char(CHAR_quotation, UNPROVIDED);
															    html_markup(html_align($LEFT));
															    html_char(CHAR_quotation, UNPROVIDED);
															}
															html_char(CHAR_greater, UNPROVIDED);
															{
															    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
															    try {
																html_macros.$html_safe_print$.bind(T, thread);
																if (NIL != adornment_dynamic_tagfn(entry)) {
																    html_checkbox_input(format(NIL, $str_alt183$_A_dynamic, name), format(NIL, $str_alt183$_A_dynamic, name),
																	    makeBoolean((NIL != adornment_image_alt(entry)) && (!adornment_image_alt(entry).isString())), UNPROVIDED, UNPROVIDED, UNPROVIDED);
																    html_indent(UNPROVIDED);
																    if (NIL != adornment_dynamic_comment(entry)) {
																	html_princ(adornment_dynamic_comment(entry));
																    } else {
																	html_princ($str_alt184$_);
																    }
																} else {
																    html_princ($$$No);
																}
															    } finally {
																html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
															    }
															}
															html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
															html_markup(html_macros.$html_table_data_head$.getGlobalValue());
															html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
															if (true) {
															    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
															    html_char(CHAR_quotation, UNPROVIDED);
															    html_markup(html_align($LEFT));
															    html_char(CHAR_quotation, UNPROVIDED);
															}
															html_char(CHAR_greater, UNPROVIDED);
															{
															    SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
															    try {
																html_macros.$html_safe_print$.bind(T, thread);
																html_princ(NIL != adornment_handler(entry) ? ((SubLObject) ($$$Yes)) : $$$No);
															    } finally {
																html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
															    }
															}
															html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
															html_markup(html_macros.$html_table_data_head$.getGlobalValue());
															html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
															if (true) {
															    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
															    html_char(CHAR_quotation, UNPROVIDED);
															    html_markup(html_align($LEFT));
															    html_char(CHAR_quotation, UNPROVIDED);
															}
															html_char(CHAR_greater, UNPROVIDED);
															{
															    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
															    try {
																html_macros.$html_safe_print$.bind(T, thread);
																html_princ(Strings.string_downcase(Strings.string(adornment_type(entry)), UNPROVIDED, UNPROVIDED));
															    } finally {
																html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
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
															html_char(CHAR_greater, UNPROVIDED);
															{
															    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
															    try {
																html_macros.$html_safe_print$.bind(T, thread);
																{
																    SubLObject tool = adornment_tool(entry);
																    if ((NIL != tool) && (NIL != cb_link_method(tool))) {
																	cb_link(tool, cb_tool_abbreviation(tool), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																    } else {
																	html_glyph($NBSP, UNPROVIDED);
																    }
																}
															    } finally {
																html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
															    }
															}
															html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
															if (NIL != $debug_adornments_p$.getDynamicValue(thread)) {
															    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
															    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
															    if (true) {
																html_markup(html_macros.$html_table_data_align$.getGlobalValue());
																html_char(CHAR_quotation, UNPROVIDED);
																html_markup(html_align($LEFT));
																html_char(CHAR_quotation, UNPROVIDED);
															    }
															    html_char(CHAR_greater, UNPROVIDED);
															    {
																SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
																try {
																    html_macros.$html_safe_print$.bind(T, thread);
																    html_princ(Strings.string(adornment_effective_fn(entry)));
																} finally {
																    html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
																}
															    }
															    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
															}
														    } finally {
															html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
														    }
														}
														html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
														html_source_readability_terpri(UNPROVIDED);
														html_markup(html_macros.$html_table_row_head$.getGlobalValue());
														if (NIL != bgcolor) {
														    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
														    html_char(CHAR_quotation, UNPROVIDED);
														    html_markup(bgcolor);
														    html_char(CHAR_quotation, UNPROVIDED);
														}
														html_char(CHAR_greater, UNPROVIDED);
														{
														    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
														    try {
															html_macros.$html_safe_print$.bind(T, thread);
															html_markup(html_macros.$html_table_data_head$.getGlobalValue());
															if (true) {
															    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
															    html_char(CHAR_quotation, UNPROVIDED);
															    html_markup(TWO_INTEGER);
															    html_char(CHAR_quotation, UNPROVIDED);
															}
															html_char(CHAR_greater, UNPROVIDED);
															{
															    SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
															    try {
																html_macros.$html_safe_print$.bind(T, thread);
																html_br();
															    } finally {
																html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
															    }
															}
															html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
															html_markup(html_macros.$html_table_data_head$.getGlobalValue());
															if (true) {
															    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
															    html_char(CHAR_quotation, UNPROVIDED);
															    html_markup(FIVE_INTEGER);
															    html_char(CHAR_quotation, UNPROVIDED);
															}
															if (true) {
															    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
															    html_char(CHAR_quotation, UNPROVIDED);
															    html_markup(html_align($LEFT));
															    html_char(CHAR_quotation, UNPROVIDED);
															}
															html_char(CHAR_greater, UNPROVIDED);
															{
															    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
															    try {
																html_macros.$html_safe_print$.bind(T, thread);
																if (NIL != adornment_comment(entry)) {
																    html_princ(adornment_comment(entry));
																} else {
																    html_princ($str_alt184$_);
																}
															    } finally {
																html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
															    }
															}
															html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
															html_markup(html_macros.$html_table_row_head$.getGlobalValue());
															if (NIL != bgcolor) {
															    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
															    html_char(CHAR_quotation, UNPROVIDED);
															    html_markup(bgcolor);
															    html_char(CHAR_quotation, UNPROVIDED);
															}
															html_char(CHAR_greater, UNPROVIDED);
															{
															    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
															    try {
																html_macros.$html_safe_print$.bind(T, thread);
																html_markup(html_macros.$html_table_data_head$.getGlobalValue());
																if (true) {
																    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
																    html_char(CHAR_quotation, UNPROVIDED);
																    html_markup(SEVEN_INTEGER);
																    html_char(CHAR_quotation, UNPROVIDED);
																}
																html_char(CHAR_greater, UNPROVIDED);
																{
																    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
																    try {
																	html_macros.$html_safe_print$.bind(T, thread);
																	html_br();
																    } finally {
																	html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
																    }
																}
																html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
															    } finally {
																html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
															    }
															}
															html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
															html_source_readability_terpri(UNPROVIDED);
														    } finally {
															html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
														    }
														}
														html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
														html_source_readability_terpri(UNPROVIDED);
													    }
													}
												    }
												}
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
											    }
											}
											html_markup(html_macros.$html_table_tail$.getGlobalValue());
										    } finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
										    }
										}
										html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
									    } finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
									    }
									}
									html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
									html_source_readability_terpri(UNPROVIDED);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
								    }
								}
								html_markup(html_macros.$html_table_tail$.getGlobalValue());
								html_newline(UNPROVIDED);
								html_reset_input($$$Current_Values);
								html_indent(UNPROVIDED);
								html_submit_input($$$Update_Adornment_Settings, UNPROVIDED, UNPROVIDED);
								html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
							    } finally {
								html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
								html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
								html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
							    }
							}
							html_markup(html_macros.$html_form_tail$.getGlobalValue());
						    }
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
		    }
		} else {
		    cdestructuring_bind_error(datum, $list_alt157);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject convert_deduction_to_formula(final SubLObject deduction) {
	final SubLObject assertion = deductions_high.deduction_assertion(deduction);
	return uncanonicalizer.assertion_el_formula(assertion);
    }

    public static final SubLObject convert_deduction_to_formula_alt(SubLObject deduction) {
	{
	    SubLObject assertion = deductions_high.deduction_assertion(deduction);
	    return uncanonicalizer.assertion_el_formula(assertion);
	}
    }

    public static SubLObject declare_cb_adornments_file() {
	declareFunction("bookkeeping_assertion_p", "BOOKKEEPING-ASSERTION-P", 1, 0, false);
	declareFunction("documentation_assertion_p", "DOCUMENTATION-ASSERTION-P", 1, 0, false);
	declareFunction("print_adornment", "PRINT-ADORNMENT", 3, 0, false);
	declareFunction("adornment_print_function_trampoline", "ADORNMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("adornment_p", "ADORNMENT-P", 1, 0, false);
	new cb_adornments.$adornment_p$UnaryFunction();
	declareFunction("adornment_name", "ADORNMENT-NAME", 1, 0, false);
	declareFunction("adornment_type", "ADORNMENT-TYPE", 1, 0, false);
	declareFunction("adornment_active_p", "ADORNMENT-ACTIVE-P", 1, 0, false);
	declareFunction("adornment_image", "ADORNMENT-IMAGE", 1, 0, false);
	declareFunction("adornment_image_disabled", "ADORNMENT-IMAGE-DISABLED", 1, 0, false);
	declareFunction("adornment_image_alt", "ADORNMENT-IMAGE-ALT", 1, 0, false);
	declareFunction("adornment_dynamic_tagfn", "ADORNMENT-DYNAMIC-TAGFN", 1, 0, false);
	declareFunction("adornment_color", "ADORNMENT-COLOR", 1, 0, false);
	declareFunction("adornment_letter", "ADORNMENT-LETTER", 1, 0, false);
	declareFunction("adornment_effective_fn", "ADORNMENT-EFFECTIVE-FN", 1, 0, false);
	declareFunction("adornment_handler", "ADORNMENT-HANDLER", 1, 0, false);
	declareFunction("adornment_tool", "ADORNMENT-TOOL", 1, 0, false);
	declareFunction("adornment_comment", "ADORNMENT-COMMENT", 1, 0, false);
	declareFunction("adornment_dynamic_comment", "ADORNMENT-DYNAMIC-COMMENT", 1, 0, false);
	declareFunction("adornment_title", "ADORNMENT-TITLE", 1, 0, false);
	declareFunction("_csetf_adornment_name", "_CSETF-ADORNMENT-NAME", 2, 0, false);
	declareFunction("_csetf_adornment_type", "_CSETF-ADORNMENT-TYPE", 2, 0, false);
	declareFunction("_csetf_adornment_active_p", "_CSETF-ADORNMENT-ACTIVE-P", 2, 0, false);
	declareFunction("_csetf_adornment_image", "_CSETF-ADORNMENT-IMAGE", 2, 0, false);
	declareFunction("_csetf_adornment_image_disabled", "_CSETF-ADORNMENT-IMAGE-DISABLED", 2, 0, false);
	declareFunction("_csetf_adornment_image_alt", "_CSETF-ADORNMENT-IMAGE-ALT", 2, 0, false);
	declareFunction("_csetf_adornment_dynamic_tagfn", "_CSETF-ADORNMENT-DYNAMIC-TAGFN", 2, 0, false);
	declareFunction("_csetf_adornment_color", "_CSETF-ADORNMENT-COLOR", 2, 0, false);
	declareFunction("_csetf_adornment_letter", "_CSETF-ADORNMENT-LETTER", 2, 0, false);
	declareFunction("_csetf_adornment_effective_fn", "_CSETF-ADORNMENT-EFFECTIVE-FN", 2, 0, false);
	declareFunction("_csetf_adornment_handler", "_CSETF-ADORNMENT-HANDLER", 2, 0, false);
	declareFunction("_csetf_adornment_tool", "_CSETF-ADORNMENT-TOOL", 2, 0, false);
	declareFunction("_csetf_adornment_comment", "_CSETF-ADORNMENT-COMMENT", 2, 0, false);
	declareFunction("_csetf_adornment_dynamic_comment", "_CSETF-ADORNMENT-DYNAMIC-COMMENT", 2, 0, false);
	declareFunction("_csetf_adornment_title", "_CSETF-ADORNMENT-TITLE", 2, 0, false);
	declareFunction("make_adornment", "MAKE-ADORNMENT", 0, 1, false);
	declareFunction("visit_defstruct_adornment", "VISIT-DEFSTRUCT-ADORNMENT", 2, 0, false);
	declareFunction("visit_defstruct_object_adornment_method", "VISIT-DEFSTRUCT-OBJECT-ADORNMENT-METHOD", 2, 0, false);
	declareFunction("active_adornment_struct_p", "ACTIVE-ADORNMENT-STRUCT-P", 1, 1, false);
	declareFunction("active_adornment_p", "ACTIVE-ADORNMENT-P", 1, 0, false);
	declareFunction("enable_adornment", "ENABLE-ADORNMENT", 1, 1, false);
	declareMacro("defadornment", "DEFADORNMENT");
	declareFunction("find_adornment", "FIND-ADORNMENT", 1, 0, false);
	declareFunction("active_adornments", "ACTIVE-ADORNMENTS", 1, 0, false);
	declareFunction("id_for_type", "ID-FOR-TYPE", 2, 0, false);
	declareFunction("calc_adornment_image_alt", "CALC-ADORNMENT-IMAGE-ALT", 2, 2, false);
	declareFunction("display_linked_adornment", "DISPLAY-LINKED-ADORNMENT", 6, 0, false);
	declareFunction("display_adornment_disabled", "DISPLAY-ADORNMENT-DISABLED", 1, 5, false);
	declareFunction("display_adornment", "DISPLAY-ADORNMENT", 1, 5, false);
	declareFunction("display_active_adornments", "DISPLAY-ACTIVE-ADORNMENTS", 0, 1, false);
	declareFunction("resolved_adornment_image", "RESOLVED-ADORNMENT-IMAGE", 1, 4, false);
	declareFunction("adorn_thingo_p", "ADORN-THINGO-P", 2, 2, false);
	declareFunction("activate_adornment", "ACTIVATE-ADORNMENT", 1, 0, false);
	declareFunction("handle_adornments", "HANDLE-ADORNMENTS", 3, 3, false);
	declareFunction("handle_specific_adornment", "HANDLE-SPECIFIC-ADORNMENT", 4, 3, false);
	declareFunction("cb_include_hierarchy_linkP", "CB-INCLUDE-HIERARCHY-LINK?", 2, 0, false);
	declareFunction("hierarchy_link_effective_fn", "HIERARCHY-LINK-EFFECTIVE-FN", 3, 0, false);
	declareFunction("cb_show_alphabetic_searchP", "CB-SHOW-ALPHABETIC-SEARCH?", 1, 0, false);
	declareFunction("literal_query_index_effective_fn", "LITERAL-QUERY-INDEX-EFFECTIVE-FN", 3, 1, false);
	declareFunction("literal_query_normal_effective_fn", "LITERAL-QUERY-NORMAL-EFFECTIVE-FN", 3, 0, false);
	declareFunction("literal_query_marker_else_green", "LITERAL-QUERY-MARKER-ELSE-GREEN", 1, 0, false);
	declareFunction("literal_query_marker_else_yellow", "LITERAL-QUERY-MARKER-ELSE-YELLOW", 1, 0, false);
	declareFunction("literal_query_marker_else_purple", "LITERAL-QUERY-MARKER-ELSE-PURPLE", 1, 0, false);
	declareFunction("literal_query_index_display_effective_fn", "LITERAL-QUERY-INDEX-DISPLAY-EFFECTIVE-FN", 3, 0, false);
	declareFunction("cb_get_asserted_argument", "CB-GET-ASSERTED-ARGUMENT", 1, 0, false);
	declareFunction("convert_deduction_to_formula", "CONVERT-DEDUCTION-TO-FORMULA", 1, 0, false);
	declareFunction("cb_assertion_deductions", "CB-ASSERTION-DEDUCTIONS", 1, 0, false);
	declareFunction("adornmentL", "ADORNMENT<", 2, 0, false);
	declareFunction("cb_view_adorn", "CB-VIEW-ADORN", 0, 1, false);
	declareFunction("cb_adornment_handler", "CB-ADORNMENT-HANDLER", 1, 0, false);
	declareFunction("cb_link_view_adorn", "CB-LINK-VIEW-ADORN", 1, 1, false);
	declareFunction("cb_c_index_adornments", "CB-C-INDEX-ADORNMENTS", 1, 0, false);
	return NIL;
    }

    /**
     * Define new adornments. keyword args include :name :type :active-p :image :color :letter :effective-fn and :handler
     */
    @LispMethod(comment = "Define new adornments. keyword args include :name :type :active-p :image :color :letter :effective-fn and :handler")
    public static SubLObject defadornment(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject name = NIL;
	destructuring_bind_must_consp(current, datum, $list64);
	name = current.first();
	final SubLObject arglist;
	current = arglist = current.rest();
	final SubLObject old = $sym65$OLD;
	final SubLObject v_new = $sym66$NEW;
	return list(CLET, list(bq_cons(old, $list68), list(v_new, list(MAKE_ADORNMENT, list(QUOTE, arglist)))), list(CSETF, list(ADORNMENT_NAME, v_new), list(QUOTE, name)), list(CSETQ, $cb_adornment_table$, list(CONS, v_new, listS(DELETE, list(QUOTE, name), old, $list74))));
    }

    /**
     * Define new adornments. keyword args include :name :type :active-p :image :color :letter :effective-fn and :handler
     */
    @LispMethod(comment = "Define new adornments. keyword args include :name :type :active-p :image :color :letter :effective-fn and :handler")
    public static final SubLObject defadornment_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject name = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt61);
	    name = current.first();
	    current = current.rest();
	    {
		SubLObject arglist = current;
		SubLObject old = $sym62$OLD;
		SubLObject v_new = $sym63$NEW;
		return list(CLET, list(bq_cons(old, $list_alt65), list(v_new, list(MAKE_ADORNMENT, list(QUOTE, arglist)))), list(CSETF, list(ADORNMENT_NAME, v_new), list(QUOTE, name)), list(CSETQ, $cb_adornment_table$, list(CONS, v_new, listS(DELETE, list(QUOTE, name), old, $list_alt72))));
	    }
	}
    }

    public static SubLObject display_active_adornments(SubLObject type) {
	if (type == UNPROVIDED) {
	    type = NIL;
	}
	Mapping.mapc(symbol_function(DISPLAY_ADORNMENT), active_adornments(type), EMPTY_SUBL_OBJECT_ARRAY);
	return NIL;
    }

    public static final SubLObject display_active_adornments_alt(SubLObject type) {
	if (type == UNPROVIDED) {
	    type = NIL;
	}
	Mapping.mapc(symbol_function(DISPLAY_ADORNMENT), active_adornments(type), EMPTY_SUBL_OBJECT_ARRAY);
	return NIL;
    }

    public static SubLObject display_adornment(final SubLObject adornment, SubLObject type, SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
	if (type == UNPROVIDED) {
	    type = NIL;
	}
	if (thingo == UNPROVIDED) {
	    thingo = NIL;
	}
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject image = adornment_image(adornment);
	if ((NIL != adornment_handler(adornment)) && (NIL != thingo)) {
	    display_linked_adornment(adornment, type, thingo, arg, pred, mt);
	} else if (NIL != image) {
	    final SubLObject resolved_image = resolved_adornment_image(image, adornment, thingo, arg, pred);
	    html_basic_image(resolved_image, calc_adornment_image_alt(adornment, thingo, arg, pred), $TOP, UNPROVIDED);
	} else {
	    final SubLObject color = adornment_color(adornment);
	    html_markup(html_macros.$html_font_head$.getGlobalValue());
	    if (NIL != color) {
		html_markup(html_macros.$html_font_color$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(html_color(color));
		html_char(CHAR_quotation, UNPROVIDED);
	    }
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		html_princ(adornment_letter(adornment));
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	    }
	    html_markup(html_macros.$html_font_tail$.getGlobalValue());
	}

	return thingo;
    }

    public static final SubLObject display_adornment_alt(SubLObject adornment, SubLObject type, SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
	if (type == UNPROVIDED) {
	    type = NIL;
	}
	if (thingo == UNPROVIDED) {
	    thingo = NIL;
	}
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject image = adornment_image(adornment);
		if ((NIL != adornment_handler(adornment)) && (NIL != thingo)) {
		    display_linked_adornment(adornment, type, thingo, arg, pred, mt);
		} else {
		    if (NIL != image) {
			{
			    SubLObject resolved_image = resolved_adornment_image(image, adornment, thingo, arg, pred);
			    html_basic_image(resolved_image, calc_adornment_image_alt(adornment, thingo, arg, pred), $TOP, UNPROVIDED);
			}
		    } else {
			{
			    SubLObject color = adornment_color(adornment);
			    html_markup(html_macros.$html_font_head$.getGlobalValue());
			    if (NIL != color) {
				html_markup(html_macros.$html_font_color$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(html_color(color));
				html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_princ(adornment_letter(adornment));
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
				}
			    }
			    html_markup(html_macros.$html_font_tail$.getGlobalValue());
			}
		    }
		}
	    }
	    return thingo;
	}
    }

    public static SubLObject display_adornment_disabled(final SubLObject adornment, SubLObject type, SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
	if (type == UNPROVIDED) {
	    type = NIL;
	}
	if (thingo == UNPROVIDED) {
	    thingo = NIL;
	}
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	final SubLObject image = resolved_adornment_image(adornment_image_disabled(adornment), adornment, thingo, arg, pred);
	html_basic_image(image, calc_adornment_image_alt(adornment, thingo, arg, pred), $TOP, UNPROVIDED);
	return NIL;
    }

    public static final SubLObject display_adornment_disabled_alt(SubLObject adornment, SubLObject type, SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
	if (type == UNPROVIDED) {
	    type = NIL;
	}
	if (thingo == UNPROVIDED) {
	    thingo = NIL;
	}
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	{
	    SubLObject image = resolved_adornment_image(adornment_image_disabled(adornment), adornment, thingo, arg, pred);
	    html_basic_image(image, calc_adornment_image_alt(adornment, thingo, arg, pred), $TOP, UNPROVIDED);
	}
	return NIL;
    }

    public static SubLObject display_linked_adornment(final SubLObject adornment, final SubLObject type, final SubLObject thingo, final SubLObject arg, final SubLObject pred, final SubLObject mt) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject handler = adornment_handler(adornment);
	final SubLObject id = id_for_type(type, thingo);
	final SubLObject image = adornment_image(adornment);
	final SubLObject alt = calc_adornment_image_alt(adornment, thingo, arg, pred);
	if ($adornment_display$.getDynamicValue(thread).eql($TOP)) {
	    handler = cconcatenate($str85$cb_start_, handler);
	}
	SubLObject handler_string = cconcatenate(format_nil.format_nil_a_no_copy(handler), new SubLObject[] { $str86$_, format_nil.format_nil_a_no_copy(id) });
	final SubLObject title = adornment_title(adornment);
	if (NIL != arg) {
	    if (NIL != mt) {
		handler_string = cconcatenate(format_nil.format_nil_a_no_copy(handler_string), new SubLObject[] { $str86$_, format_nil.format_nil_a_no_copy(arg), $str86$_, format_nil.format_nil_a_no_copy(cb_fort_identifier(pred)), $str86$_, format_nil.format_nil_a_no_copy(cb_fort_identifier(mt)) });
	    } else {
		handler_string = cconcatenate(format_nil.format_nil_a_no_copy(handler_string), new SubLObject[] { $str86$_, format_nil.format_nil_a_no_copy(arg), $str86$_, format_nil.format_nil_a_no_copy(cb_fort_identifier(pred)) });
	    }
	}
	if (NIL != image) {
	    final SubLObject resolved_image = resolved_adornment_image(image, adornment, thingo, arg, pred);
	    final SubLObject frame_name_var = cb_frame_name($adornment_display$.getDynamicValue(thread));
	    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    cyc_cgi_url_int();
	    html_princ(handler_string);
	    html_char(CHAR_quotation, UNPROVIDED);
	    if (NIL != title) {
		html_markup(html_macros.$html_anchor_title$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(title);
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
		html_basic_image(resolved_image, alt, $CENTER, UNPROVIDED);
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
	    }
	    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	} else {
	    final SubLObject frame_name_var2 = cb_frame_name($adornment_display$.getDynamicValue(thread));
	    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
	    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
	    html_char(CHAR_quotation, UNPROVIDED);
	    cyc_cgi_url_int();
	    html_princ(handler_string);
	    html_char(CHAR_quotation, UNPROVIDED);
	    if (NIL != title) {
		html_markup(html_macros.$html_anchor_title$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(title);
		html_char(CHAR_quotation, UNPROVIDED);
	    }
	    if (NIL != frame_name_var2) {
		html_markup(html_macros.$html_anchor_target$.getGlobalValue());
		html_char(CHAR_quotation, UNPROVIDED);
		html_markup(frame_name_var2);
		html_char(CHAR_quotation, UNPROVIDED);
	    }
	    html_char(CHAR_greater, UNPROVIDED);
	    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
	    try {
		html_macros.$html_safe_print$.bind(T, thread);
		final SubLObject color = adornment_color(adornment);
		html_markup(html_macros.$html_font_head$.getGlobalValue());
		if (NIL != color) {
		    html_markup(html_macros.$html_font_color$.getGlobalValue());
		    html_char(CHAR_quotation, UNPROVIDED);
		    html_markup(html_color(color));
		    html_char(CHAR_quotation, UNPROVIDED);
		}
		html_char(CHAR_greater, UNPROVIDED);
		final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    html_princ(adornment_letter(adornment));
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
		}
		html_markup(html_macros.$html_font_tail$.getGlobalValue());
	    } finally {
		html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
	    }
	    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	}
	return thingo;
    }

    public static final SubLObject display_linked_adornment_alt(SubLObject adornment, SubLObject type, SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject handler = adornment_handler(adornment);
		SubLObject id = id_for_type(type, thingo);
		SubLObject image = adornment_image(adornment);
		SubLObject alt = calc_adornment_image_alt(adornment, thingo, arg, pred);
		if ($adornment_display$.getDynamicValue(thread).eql($TOP)) {
		    handler = cconcatenate($str_alt82$cb_start_, handler);
		}
		{
		    SubLObject handler_string = format(NIL, $str_alt83$_a__a, handler, id);
		    SubLObject title = adornment_title(adornment);
		    if (NIL != arg) {
			if (NIL != mt) {
			    handler_string = format(NIL, $str_alt84$_a__a__a__a, new SubLObject[] { handler_string, arg, cb_fort_identifier(pred), cb_fort_identifier(mt) });
			} else {
			    handler_string = format(NIL, $str_alt85$_a__a__a, new SubLObject[] { handler_string, arg, cb_fort_identifier(pred) });
			}
		    }
		    if (NIL != image) {
			{
			    SubLObject resolved_image = resolved_adornment_image(image, adornment, thingo, arg, pred);
			    SubLObject frame_name_var = cb_frame_name($adornment_display$.getDynamicValue(thread));
			    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			    html_char(CHAR_quotation, UNPROVIDED);
			    cyc_cgi_url_int();
			    html_princ(handler_string);
			    html_char(CHAR_quotation, UNPROVIDED);
			    if (NIL != title) {
				html_markup(html_macros.$html_anchor_title$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(title);
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
				    html_basic_image(resolved_image, alt, $CENTER, UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
				}
			    }
			    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			}
		    } else {
			{
			    SubLObject frame_name_var = cb_frame_name($adornment_display$.getDynamicValue(thread));
			    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
			    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
			    html_char(CHAR_quotation, UNPROVIDED);
			    cyc_cgi_url_int();
			    html_princ(handler_string);
			    html_char(CHAR_quotation, UNPROVIDED);
			    if (NIL != title) {
				html_markup(html_macros.$html_anchor_title$.getGlobalValue());
				html_char(CHAR_quotation, UNPROVIDED);
				html_markup(title);
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
				    {
					SubLObject color = adornment_color(adornment);
					html_markup(html_macros.$html_font_head$.getGlobalValue());
					if (NIL != color) {
					    html_markup(html_macros.$html_font_color$.getGlobalValue());
					    html_char(CHAR_quotation, UNPROVIDED);
					    html_markup(html_color(color));
					    html_char(CHAR_quotation, UNPROVIDED);
					}
					html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_princ(adornment_letter(adornment));
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
					    }
					}
					html_markup(html_macros.$html_font_tail$.getGlobalValue());
				    }
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
				}
			    }
			    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
			}
		    }
		}
	    }
	    return thingo;
	}
    }

    /**
     * assumes all documentation assertions are gafs
     */
    @LispMethod(comment = "assumes all documentation assertions are gafs")
    public static SubLObject documentation_assertion_p(final SubLObject assertion) {
	return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != kb_accessors.documentation_predicate_in_any_mt_p(assertions_high.gaf_predicate(assertion))));
    }

    /**
     * assumes all documentation assertions are gafs
     */
    @LispMethod(comment = "assumes all documentation assertions are gafs")
    public static final SubLObject documentation_assertion_p_alt(SubLObject assertion) {
	return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != kb_accessors.documentation_predicate_in_any_mt_p(assertions_high.gaf_predicate(assertion))));
    }

    public static SubLObject enable_adornment(final SubLObject adornment_name, SubLObject enable_p) {
	if (enable_p == UNPROVIDED) {
	    enable_p = T;
	}
	final SubLObject adornment = find_adornment(adornment_name);
	if (NIL != adornment) {
	    _csetf_adornment_active_p(adornment, enable_p);
	    return enable_p;
	}
	return NIL;
    }

    public static final SubLObject enable_adornment_alt(SubLObject adornment_name, SubLObject enable_p) {
	if (enable_p == UNPROVIDED) {
	    enable_p = T;
	}
	{
	    SubLObject adornment = find_adornment(adornment_name);
	    if (NIL != adornment) {
		_csetf_adornment_active_p(adornment, enable_p);
		return enable_p;
	    } else {
		return NIL;
	    }
	}
    }

    public static SubLObject find_adornment(final SubLObject name) {
	return find(name, $cb_adornment_table$.getGlobalValue(), symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject find_adornment_alt(SubLObject name) {
	return find(name, $cb_adornment_table$.getGlobalValue(), symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject handle_adornments(final SubLObject type, final SubLObject adornment_display, final SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject active_adornments = active_adornments(type);
	final SubLObject _prev_bind_0 = $adornment_display$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $adorn_thingo$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $adorn_arg$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $adorn_pred$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $adorn_mt$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $adornment_type$.currentBinding(thread);
	try {
	    $adornment_display$.bind(adornment_display, thread);
	    $adorn_thingo$.bind(thingo, thread);
	    $adorn_arg$.bind(arg, thread);
	    $adorn_pred$.bind(pred, thread);
	    $adorn_mt$.bind(mt, thread);
	    $adornment_type$.bind(type, thread);
	    Mapping.mapc(ACTIVATE_ADORNMENT, active_adornments, EMPTY_SUBL_OBJECT_ARRAY);
	} finally {
	    $adornment_type$.rebind(_prev_bind_6, thread);
	    $adorn_mt$.rebind(_prev_bind_5, thread);
	    $adorn_pred$.rebind(_prev_bind_4, thread);
	    $adorn_arg$.rebind(_prev_bind_3, thread);
	    $adorn_thingo$.rebind(_prev_bind_2, thread);
	    $adornment_display$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static final SubLObject handle_adornments_alt(SubLObject type, SubLObject adornment_display, SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject active_adornments = active_adornments(type);
		{
		    SubLObject _prev_bind_0 = $adornment_display$.currentBinding(thread);
		    SubLObject _prev_bind_1 = $adorn_thingo$.currentBinding(thread);
		    SubLObject _prev_bind_2 = $adorn_arg$.currentBinding(thread);
		    SubLObject _prev_bind_3 = $adorn_pred$.currentBinding(thread);
		    SubLObject _prev_bind_4 = $adorn_mt$.currentBinding(thread);
		    SubLObject _prev_bind_5 = $adornment_type$.currentBinding(thread);
		    try {
			$adornment_display$.bind(adornment_display, thread);
			$adorn_thingo$.bind(thingo, thread);
			$adorn_arg$.bind(arg, thread);
			$adorn_pred$.bind(pred, thread);
			$adorn_mt$.bind(mt, thread);
			$adornment_type$.bind(type, thread);
			Mapping.mapc(ACTIVATE_ADORNMENT, active_adornments, EMPTY_SUBL_OBJECT_ARRAY);
		    } finally {
			$adornment_type$.rebind(_prev_bind_5, thread);
			$adorn_mt$.rebind(_prev_bind_4, thread);
			$adorn_pred$.rebind(_prev_bind_3, thread);
			$adorn_arg$.rebind(_prev_bind_2, thread);
			$adorn_thingo$.rebind(_prev_bind_1, thread);
			$adornment_display$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject handle_specific_adornment(final SubLObject type, final SubLObject name, final SubLObject adornment_display, final SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $adornment_display$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $adorn_thingo$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $adorn_arg$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $adorn_pred$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $adorn_mt$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $adornment_type$.currentBinding(thread);
	try {
	    $adornment_display$.bind(adornment_display, thread);
	    $adorn_thingo$.bind(thingo, thread);
	    $adorn_arg$.bind(arg, thread);
	    $adorn_pred$.bind(pred, thread);
	    $adorn_mt$.bind(mt, thread);
	    $adornment_type$.bind(type, thread);
	    final SubLObject adornment = find_adornment(name);
	    if (NIL != active_adornment_struct_p(adornment, type)) {
		activate_adornment(adornment);
	    }
	} finally {
	    $adornment_type$.rebind(_prev_bind_6, thread);
	    $adorn_mt$.rebind(_prev_bind_5, thread);
	    $adorn_pred$.rebind(_prev_bind_4, thread);
	    $adorn_arg$.rebind(_prev_bind_3, thread);
	    $adorn_thingo$.rebind(_prev_bind_2, thread);
	    $adornment_display$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static final SubLObject handle_specific_adornment_alt(SubLObject type, SubLObject name, SubLObject adornment_display, SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $adornment_display$.currentBinding(thread);
		SubLObject _prev_bind_1 = $adorn_thingo$.currentBinding(thread);
		SubLObject _prev_bind_2 = $adorn_arg$.currentBinding(thread);
		SubLObject _prev_bind_3 = $adorn_pred$.currentBinding(thread);
		SubLObject _prev_bind_4 = $adorn_mt$.currentBinding(thread);
		SubLObject _prev_bind_5 = $adornment_type$.currentBinding(thread);
		try {
		    $adornment_display$.bind(adornment_display, thread);
		    $adorn_thingo$.bind(thingo, thread);
		    $adorn_arg$.bind(arg, thread);
		    $adorn_pred$.bind(pred, thread);
		    $adorn_mt$.bind(mt, thread);
		    $adornment_type$.bind(type, thread);
		    {
			SubLObject adornment = find_adornment(name);
			if (NIL != active_adornment_struct_p(adornment, type)) {
			    activate_adornment(adornment);
			}
		    }
		} finally {
		    $adornment_type$.rebind(_prev_bind_5, thread);
		    $adorn_mt$.rebind(_prev_bind_4, thread);
		    $adorn_pred$.rebind(_prev_bind_3, thread);
		    $adorn_arg$.rebind(_prev_bind_2, thread);
		    $adorn_thingo$.rebind(_prev_bind_1, thread);
		    $adornment_display$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject hierarchy_link_effective_fn(final SubLObject index_hook, final SubLObject arg, final SubLObject pred) {
	return makeBoolean((NIL != forts.fort_p(index_hook)) && (NIL != cb_include_hierarchy_linkP(arg, pred)));
    }

    public static final SubLObject hierarchy_link_effective_fn_alt(SubLObject index_hook, SubLObject arg, SubLObject pred) {
	return makeBoolean((NIL != forts.fort_p(index_hook)) && (NIL != cb_include_hierarchy_linkP(arg, pred)));
    }

    public static SubLObject id_for_type(final SubLObject type, final SubLObject thingo) {
	if (type.eql($ASSERTION)) {
	    return assertion_handles.assertion_id(thingo);
	}
	if (type.eql($DEDUCTION)) {
	    return deduction_handles.deduction_id(thingo);
	}
	if (type.eql($INDEX_CONSTANT_NAME)) {
	    return constants_high.constant_name(thingo);
	}
	if (((type.eql($INDEX_FORT) || type.eql($INDEX_CONSTANT)) || type.eql($CONSTANT)) || type.eql($GAF_ARG_PREDICATE)) {
	    return cb_fort_identifier(thingo);
	}
	if (type.eql($INDEX_TERM)) {
	    return cb_term_identifier(thingo);
	}
	return cb_term_identifier(thingo);
    }

    public static final SubLObject id_for_type_alt(SubLObject type, SubLObject thingo) {
	{
	    SubLObject pcase_var = type;
	    if (pcase_var.eql($ASSERTION)) {
		return assertion_handles.assertion_id(thingo);
	    } else {
		if (pcase_var.eql($DEDUCTION)) {
		    return deduction_handles.deduction_id(thingo);
		} else {
		    if (pcase_var.eql($INDEX_CONSTANT_NAME)) {
			return constants_high.constant_name(thingo);
		    } else {
			if (((pcase_var.eql($INDEX_FORT) || pcase_var.eql($INDEX_CONSTANT)) || pcase_var.eql($CONSTANT)) || pcase_var.eql($GAF_ARG_PREDICATE)) {
			    return cb_fort_identifier(thingo);
			} else {
			    if (pcase_var.eql($INDEX_TERM)) {
				return cb_term_identifier(thingo);
			    } else {
				return cb_term_identifier(thingo);
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject init_cb_adornments_file() {
	if (SubLFiles.USE_V1) {
	    defparameter("*ADORNMENT-DISPLAY*", $MAIN);
	    defparameter("*ADORN-THINGO*", NIL);
	    defparameter("*ADORN-ARG*", NIL);
	    defparameter("*ADORN-PRED*", NIL);
	    defparameter("*ADORN-MT*", NIL);
	    defparameter("*ADORNMENT-TYPE*", NIL);
	    deflexical("*ADORNMENT-SORTED-LIST*", $list1);
	    defconstant("*DTP-ADORNMENT*", ADORNMENT);
	    deflexical("*CB-ADORNMENT-TABLE*", SubLTrampolineFile.maybeDefault($cb_adornment_table$, $cb_adornment_table$, NIL));
	    defparameter("*DEBUG-ADORNMENTS-P*", NIL);
	}
	if (SubLFiles.USE_V2) {
	    defparameter("*ADORNMENT-DISPLAY*", $TOP);
	    deflexical("*CB-ADORNMENT-TABLE*", NIL != boundp($cb_adornment_table$) ? ((SubLObject) ($cb_adornment_table$.getGlobalValue())) : NIL);
	}
	return NIL;
    }

    public static final SubLObject init_cb_adornments_file_alt() {
	defparameter("*ADORNMENT-DISPLAY*", $TOP);
	defparameter("*ADORN-THINGO*", NIL);
	defparameter("*ADORN-ARG*", NIL);
	defparameter("*ADORN-PRED*", NIL);
	defparameter("*ADORN-MT*", NIL);
	defparameter("*ADORNMENT-TYPE*", NIL);
	deflexical("*ADORNMENT-SORTED-LIST*", $list_alt1);
	defconstant("*DTP-ADORNMENT*", ADORNMENT);
	deflexical("*CB-ADORNMENT-TABLE*", NIL != boundp($cb_adornment_table$) ? ((SubLObject) ($cb_adornment_table$.getGlobalValue())) : NIL);
	defparameter("*DEBUG-ADORNMENTS-P*", NIL);
	return NIL;
    }

    public static SubLObject init_cb_adornments_file_Previous() {
	defparameter("*ADORNMENT-DISPLAY*", $MAIN);
	defparameter("*ADORN-THINGO*", NIL);
	defparameter("*ADORN-ARG*", NIL);
	defparameter("*ADORN-PRED*", NIL);
	defparameter("*ADORN-MT*", NIL);
	defparameter("*ADORNMENT-TYPE*", NIL);
	deflexical("*ADORNMENT-SORTED-LIST*", $list1);
	defconstant("*DTP-ADORNMENT*", ADORNMENT);
	deflexical("*CB-ADORNMENT-TABLE*", SubLTrampolineFile.maybeDefault($cb_adornment_table$, $cb_adornment_table$, NIL));
	defparameter("*DEBUG-ADORNMENTS-P*", NIL);
	return NIL;
    }

    public static SubLObject literal_query_index_display_effective_fn(final SubLObject index_hook, final SubLObject arg, final SubLObject pred) {
	if (NIL != forts.fort_p(index_hook)) {
	    return cb_query.cb_include_literal_query_linkP(index_hook, arg, pred, $INDEX_DISPLAY);
	}
	return NIL;
    }

    public static final SubLObject literal_query_index_display_effective_fn_alt(SubLObject index_hook, SubLObject arg, SubLObject pred) {
	if (NIL != forts.fort_p(index_hook)) {
	    return cb_query.cb_include_literal_query_linkP(index_hook, arg, pred, $INDEX_DISPLAY);
	}
	return NIL;
    }

    public static SubLObject literal_query_index_effective_fn(final SubLObject index_hook, final SubLObject arg, final SubLObject pred, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	if (NIL != forts.fort_p(index_hook)) {
	    return cb_query.cb_include_literal_query_linkP(index_hook, arg, pred, $INDEX);
	}
	return NIL;
    }

    public static final SubLObject literal_query_index_effective_fn_alt(SubLObject index_hook, SubLObject arg, SubLObject pred, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = NIL;
	}
	if (NIL != forts.fort_p(index_hook)) {
	    return cb_query.cb_include_literal_query_linkP(index_hook, arg, pred, $INDEX);
	}
	return NIL;
    }

    public static SubLObject literal_query_marker_else_green(final SubLObject type) {
	if (NIL != type) {
	    return type;
	}
	return $PLUS_GREEN;
    }

    public static final SubLObject literal_query_marker_else_green_alt(SubLObject type) {
	if (NIL != type) {
	    return type;
	} else {
	    return $PLUS_GREEN;
	}
    }

    public static SubLObject literal_query_marker_else_purple(final SubLObject type) {
	if (NIL != type) {
	    return type;
	}
	return $PLUS_PURPLE;
    }

    public static final SubLObject literal_query_marker_else_purple_alt(SubLObject type) {
	if (NIL != type) {
	    return type;
	} else {
	    return $PLUS_PURPLE;
	}
    }

    public static SubLObject literal_query_marker_else_yellow(final SubLObject type) {
	if (NIL != type) {
	    return type;
	}
	return $PLUS_YELLOW;
    }

    public static final SubLObject literal_query_marker_else_yellow_alt(SubLObject type) {
	if (NIL != type) {
	    return type;
	} else {
	    return $PLUS_YELLOW;
	}
    }

    public static SubLObject literal_query_normal_effective_fn(final SubLObject index_hook, final SubLObject arg, final SubLObject pred) {
	if (NIL != forts.fort_p(index_hook)) {
	    return cb_query.cb_include_literal_query_linkP(index_hook, arg, pred, $NORMAL);
	}
	return NIL;
    }

    public static final SubLObject literal_query_normal_effective_fn_alt(SubLObject index_hook, SubLObject arg, SubLObject pred) {
	if (NIL != forts.fort_p(index_hook)) {
	    return cb_query.cb_include_literal_query_linkP(index_hook, arg, pred, $NORMAL);
	}
	return NIL;
    }

    public static SubLObject make_adornment(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $adornment_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($NAME)) {
		_csetf_adornment_name(v_new, current_value);
	    } else if (pcase_var.eql($TYPE)) {
		_csetf_adornment_type(v_new, current_value);
	    } else if (pcase_var.eql($ACTIVE_P)) {
		_csetf_adornment_active_p(v_new, current_value);
	    } else if (pcase_var.eql($IMAGE)) {
		_csetf_adornment_image(v_new, current_value);
	    } else if (pcase_var.eql($IMAGE_DISABLED)) {
		_csetf_adornment_image_disabled(v_new, current_value);
	    } else if (pcase_var.eql($IMAGE_ALT)) {
		_csetf_adornment_image_alt(v_new, current_value);
	    } else if (pcase_var.eql($DYNAMIC_TAGFN)) {
		_csetf_adornment_dynamic_tagfn(v_new, current_value);
	    } else if (pcase_var.eql($COLOR)) {
		_csetf_adornment_color(v_new, current_value);
	    } else if (pcase_var.eql($LETTER)) {
		_csetf_adornment_letter(v_new, current_value);
	    } else if (pcase_var.eql($EFFECTIVE_FN)) {
		_csetf_adornment_effective_fn(v_new, current_value);
	    } else if (pcase_var.eql($HANDLER)) {
		_csetf_adornment_handler(v_new, current_value);
	    } else if (pcase_var.eql($TOOL)) {
		_csetf_adornment_tool(v_new, current_value);
	    } else if (pcase_var.eql($COMMENT)) {
		_csetf_adornment_comment(v_new, current_value);
	    } else if (pcase_var.eql($DYNAMIC_COMMENT)) {
		_csetf_adornment_dynamic_comment(v_new, current_value);
	    } else if (pcase_var.eql($TITLE)) {
		_csetf_adornment_title(v_new, current_value);
	    } else {
		Errors.error($str57$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static final SubLObject make_adornment_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new $adornment_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($NAME)) {
			_csetf_adornment_name(v_new, current_value);
		    } else {
			if (pcase_var.eql($TYPE)) {
			    _csetf_adornment_type(v_new, current_value);
			} else {
			    if (pcase_var.eql($ACTIVE_P)) {
				_csetf_adornment_active_p(v_new, current_value);
			    } else {
				if (pcase_var.eql($IMAGE)) {
				    _csetf_adornment_image(v_new, current_value);
				} else {
				    if (pcase_var.eql($IMAGE_DISABLED)) {
					_csetf_adornment_image_disabled(v_new, current_value);
				    } else {
					if (pcase_var.eql($IMAGE_ALT)) {
					    _csetf_adornment_image_alt(v_new, current_value);
					} else {
					    if (pcase_var.eql($DYNAMIC_TAGFN)) {
						_csetf_adornment_dynamic_tagfn(v_new, current_value);
					    } else {
						if (pcase_var.eql($COLOR)) {
						    _csetf_adornment_color(v_new, current_value);
						} else {
						    if (pcase_var.eql($LETTER)) {
							_csetf_adornment_letter(v_new, current_value);
						    } else {
							if (pcase_var.eql($EFFECTIVE_FN)) {
							    _csetf_adornment_effective_fn(v_new, current_value);
							} else {
							    if (pcase_var.eql($HANDLER)) {
								_csetf_adornment_handler(v_new, current_value);
							    } else {
								if (pcase_var.eql($TOOL)) {
								    _csetf_adornment_tool(v_new, current_value);
								} else {
								    if (pcase_var.eql($COMMENT)) {
									_csetf_adornment_comment(v_new, current_value);
								    } else {
									if (pcase_var.eql($DYNAMIC_COMMENT)) {
									    _csetf_adornment_dynamic_comment(v_new, current_value);
									} else {
									    if (pcase_var.eql($TITLE)) {
										_csetf_adornment_title(v_new, current_value);
									    } else {
										Errors.error($str_alt59$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject print_adornment(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
	    princ($str2$_, stream);
	} else if (NIL != $print_readably$.getDynamicValue(thread)) {
	    print_not_readable(v_object, stream);
	} else {
	    print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
	    princ(adornment_name(v_object), stream);
	    print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
	}

	return v_object;
    }

    public static final SubLObject print_adornment_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
		princ($str_alt2$_, stream);
	    } else {
		if (NIL != $print_readably$.getDynamicValue(thread)) {
		    print_not_readable(v_object, stream);
		} else {
		    {
			SubLObject v_object_1 = v_object;
			SubLObject stream_2 = stream;
			write_string($str_alt3$__, stream_2, UNPROVIDED, UNPROVIDED);
			write(type_of(v_object_1), new SubLObject[] { $STREAM, stream_2 });
			write_char(CHAR_space, stream_2);
			princ(adornment_name(v_object), stream);
			write_char(CHAR_greater, stream_2);
		    }
		}
	    }
	    return v_object;
	}
    }

    /**
     * DWIM the content od an adornments image slot.
     */
    @LispMethod(comment = "DWIM the content od an adornments image slot.")
    public static SubLObject resolved_adornment_image(final SubLObject image, SubLObject adornment, SubLObject thingo, SubLObject arg, SubLObject pred) {
	if (adornment == UNPROVIDED) {
	    adornment = NIL;
	}
	if (thingo == UNPROVIDED) {
	    thingo = NIL;
	}
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (((NIL != adornment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == adornment_p(adornment))) {
	    throw new AssertionError(adornment);
	}
	if (image.isKeyword()) {
	    return cyc_file_dependencies.cb_icon_src(image);
	}
	if (image.isString()) {
	    return image;
	}
	if (image.isFunctionSpec()) {
	    return resolved_adornment_image(funcall(image, NIL != thingo ? adorn_thingo_p(adornment, thingo, arg, pred) : NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}
	return cyc_file_dependencies.cb_missing_icon();
    }

    /**
     * DWIM the content od an adornments image slot.
     */
    @LispMethod(comment = "DWIM the content od an adornments image slot.")
    public static final SubLObject resolved_adornment_image_alt(SubLObject image, SubLObject adornment, SubLObject thingo, SubLObject arg, SubLObject pred) {
	if (adornment == UNPROVIDED) {
	    adornment = NIL;
	}
	if (thingo == UNPROVIDED) {
	    thingo = NIL;
	}
	if (arg == UNPROVIDED) {
	    arg = NIL;
	}
	if (pred == UNPROVIDED) {
	    pred = NIL;
	}
	if (NIL != adornment) {
	    SubLTrampolineFile.checkType(adornment, ADORNMENT_P);
	}
	if (image.isKeyword()) {
	    return cyc_file_dependencies.cb_icon_src(image);
	} else {
	    if (image.isString()) {
		return image;
	    } else {
		if (image.isFunctionSpec()) {
		    return resolved_adornment_image(funcall(image, NIL != thingo ? ((SubLObject) (adorn_thingo_p(adornment, thingo, arg, pred))) : NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} else {
		    return cyc_file_dependencies.cb_missing_icon();
		}
	    }
	}
    }

    public static SubLObject setup_cb_adornments_file() {
	if (SubLFiles.USE_V1) {
	    register_method($print_object_method_table$.getGlobalValue(), $dtp_adornment$.getGlobalValue(), symbol_function(ADORNMENT_PRINT_FUNCTION_TRAMPOLINE));
	    SubLSpecialOperatorDeclarations.proclaim($list11);
	    def_csetf(ADORNMENT_NAME, _CSETF_ADORNMENT_NAME);
	    def_csetf(ADORNMENT_TYPE, _CSETF_ADORNMENT_TYPE);
	    def_csetf(ADORNMENT_ACTIVE_P, _CSETF_ADORNMENT_ACTIVE_P);
	    def_csetf(ADORNMENT_IMAGE, _CSETF_ADORNMENT_IMAGE);
	    def_csetf(ADORNMENT_IMAGE_DISABLED, _CSETF_ADORNMENT_IMAGE_DISABLED);
	    def_csetf(ADORNMENT_IMAGE_ALT, _CSETF_ADORNMENT_IMAGE_ALT);
	    def_csetf(ADORNMENT_DYNAMIC_TAGFN, _CSETF_ADORNMENT_DYNAMIC_TAGFN);
	    def_csetf(ADORNMENT_COLOR, _CSETF_ADORNMENT_COLOR);
	    def_csetf(ADORNMENT_LETTER, _CSETF_ADORNMENT_LETTER);
	    def_csetf(ADORNMENT_EFFECTIVE_FN, _CSETF_ADORNMENT_EFFECTIVE_FN);
	    def_csetf(ADORNMENT_HANDLER, _CSETF_ADORNMENT_HANDLER);
	    def_csetf(ADORNMENT_TOOL, _CSETF_ADORNMENT_TOOL);
	    def_csetf(ADORNMENT_COMMENT, _CSETF_ADORNMENT_COMMENT);
	    def_csetf(ADORNMENT_DYNAMIC_COMMENT, _CSETF_ADORNMENT_DYNAMIC_COMMENT);
	    def_csetf(ADORNMENT_TITLE, _CSETF_ADORNMENT_TITLE);
	    identity(ADORNMENT);
	    register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_adornment$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ADORNMENT_METHOD));
	    declare_defglobal($cb_adornment_table$);
	    sethash($INDEX_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str91$index_browser_gif, NIL));
	    sethash($INDEX_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str93$index_browser_disabled_gif, NIL));
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list94);
	    _csetf_adornment_name(v_new, INDEX_BROWSER);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(INDEX_BROWSER, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    old = $cb_adornment_table$.getGlobalValue();
	    v_new = make_adornment($list96);
	    _csetf_adornment_name(v_new, META_AXIOMS);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(META_AXIOMS, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    sethash($CY_MENU, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str99$cy_menu_gif, NIL));
	    old = $cb_adornment_table$.getGlobalValue();
	    v_new = make_adornment($list100);
	    _csetf_adornment_name(v_new, ASSERTION_REVIEW);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(ASSERTION_REVIEW, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    sethash($BL_MENU, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str103$bl_menu_gif, NIL));
	    sethash($RED_DIAMOND, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str108$red_diam_gif, NIL));
	    old = $cb_adornment_table$.getGlobalValue();
	    v_new = make_adornment($list109);
	    _csetf_adornment_name(v_new, HIERARCHY_LINK);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(HIERARCHY_LINK, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    sethash($HIERARCHY_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str112$hierarchy_browser_gif, NIL));
	    sethash($HIERARCHY_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str114$hierarchy_browser_disabled_gif, NIL));
	    old = $cb_adornment_table$.getGlobalValue();
	    v_new = make_adornment($list115);
	    _csetf_adornment_name(v_new, HIERARCHY_DEFAULT);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(HIERARCHY_DEFAULT, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    sethash($ALPHA_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str118$alpha_browser_gif, NIL));
	    sethash($ALPHA_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str120$alpha_browser_disabled_gif, NIL));
	    old = $cb_adornment_table$.getGlobalValue();
	    v_new = make_adornment($list121);
	    _csetf_adornment_name(v_new, ALPHABETICAL_SEARCH);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(ALPHABETICAL_SEARCH, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    sethash($PLUS_GREEN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str124$plus_green_gif, $str125$_LitQ_));
	    sethash($PLUS_YELLOW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str127$plus_yellow_gif, $str125$_LitQ_));
	    sethash($PLUS_PURPLE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str129$plus_purple_gif, $str125$_LitQ_));
	    sethash($LIKELY, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str124$plus_green_gif, $str125$_LitQ_));
	    sethash($KNOWN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str127$plus_yellow_gif, $str125$_LitQ_));
	    sethash($POSSIBLE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str129$plus_purple_gif, $str125$_LitQ_));
	    old = $cb_adornment_table$.getGlobalValue();
	    v_new = make_adornment($list134);
	    _csetf_adornment_name(v_new, LITERAL_QUERY_INDEX);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(LITERAL_QUERY_INDEX, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    old = $cb_adornment_table$.getGlobalValue();
	    v_new = make_adornment($list137);
	    _csetf_adornment_name(v_new, LITERAL_QUERY_NORMAL);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(LITERAL_QUERY_NORMAL, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    old = $cb_adornment_table$.getGlobalValue();
	    v_new = make_adornment($list140);
	    _csetf_adornment_name(v_new, LITERAL_QUERY_INDEX_DISPLAY);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(LITERAL_QUERY_INDEX_DISPLAY, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    sethash($BL_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str146$bl_sdi_gif, NIL));
	    old = $cb_adornment_table$.getGlobalValue();
	    v_new = make_adornment($list147);
	    _csetf_adornment_name(v_new, ASSERTED_ASSERTION);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(ASSERTED_ASSERTION, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    sethash($GR_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str150$gr_sdi_gif, NIL));
	    old = $cb_adornment_table$.getGlobalValue();
	    v_new = make_adornment($list151);
	    _csetf_adornment_name(v_new, DEDUCED_ASSERTION);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(DEDUCED_ASSERTION, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    register_html_state_variable($debug_adornments_p$);
	    sethash($CB_VIEW_ADORN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str155$cb_view_adorn_html, NIL));
	    html_macros.note_cgi_handler_function(CB_VIEW_ADORN, $HTML_HANDLER);
	    html_macros.note_cgi_handler_function(CB_ADORNMENT_HANDLER, $HTML_HANDLER);
	    setup_cb_link_method($VIEW_ADORN, CB_LINK_VIEW_ADORN, TWO_INTEGER);
	}
	if (SubLFiles.USE_V2) {
	    sethash($INDEX_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt90$index_browser_gif, NIL));
	    sethash($INDEX_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt92$index_browser_disabled_gif, NIL));
	    {
		SubLObject old = $cb_adornment_table$.getGlobalValue();
		SubLObject v_new = make_adornment($list_alt93);
		_csetf_adornment_name(v_new, INDEX_BROWSER);
		$cb_adornment_table$.setGlobalValue(cons(v_new, delete(INDEX_BROWSER, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    }
	    {
		SubLObject old = $cb_adornment_table$.getGlobalValue();
		SubLObject v_new = make_adornment($list_alt95);
		_csetf_adornment_name(v_new, META_AXIOMS);
		$cb_adornment_table$.setGlobalValue(cons(v_new, delete(META_AXIOMS, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    }
	    sethash($CY_MENU, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt98$cy_menu_gif, NIL));
	    {
		SubLObject old = $cb_adornment_table$.getGlobalValue();
		SubLObject v_new = make_adornment($list_alt99);
		_csetf_adornment_name(v_new, ASSERTION_REVIEW);
		$cb_adornment_table$.setGlobalValue(cons(v_new, delete(ASSERTION_REVIEW, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    }
	    sethash($BL_MENU, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt102$bl_menu_gif, NIL));
	    {
		SubLObject old = $cb_adornment_table$.getGlobalValue();
		SubLObject v_new = make_adornment($list_alt103);
		_csetf_adornment_name(v_new, CONSTANT_REVIEW);
		$cb_adornment_table$.setGlobalValue(cons(v_new, delete(CONSTANT_REVIEW, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    }
	    sethash($RED_DIAMOND, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt109$red_diam_gif, NIL));
	    {
		SubLObject old = $cb_adornment_table$.getGlobalValue();
		SubLObject v_new = make_adornment($list_alt110);
		_csetf_adornment_name(v_new, HIERARCHY_LINK);
		$cb_adornment_table$.setGlobalValue(cons(v_new, delete(HIERARCHY_LINK, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    }
	    sethash($HIERARCHY_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt113$hierarchy_browser_gif, NIL));
	    sethash($HIERARCHY_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt115$hierarchy_browser_disabled_gif, NIL));
	    {
		SubLObject old = $cb_adornment_table$.getGlobalValue();
		SubLObject v_new = make_adornment($list_alt116);
		_csetf_adornment_name(v_new, HIERARCHY_DEFAULT);
		$cb_adornment_table$.setGlobalValue(cons(v_new, delete(HIERARCHY_DEFAULT, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    }
	    sethash($ALPHA_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt119$alpha_browser_gif, NIL));
	    sethash($ALPHA_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt121$alpha_browser_disabled_gif, NIL));
	    {
		SubLObject old = $cb_adornment_table$.getGlobalValue();
		SubLObject v_new = make_adornment($list_alt122);
		_csetf_adornment_name(v_new, ALPHABETICAL_SEARCH);
		$cb_adornment_table$.setGlobalValue(cons(v_new, delete(ALPHABETICAL_SEARCH, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    }
	    sethash($PLUS_GREEN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt125$plus_green_gif, $str_alt126$_LitQ_));
	    sethash($PLUS_YELLOW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt128$plus_yellow_gif, $str_alt126$_LitQ_));
	    sethash($PLUS_PURPLE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt130$plus_purple_gif, $str_alt126$_LitQ_));
	    sethash($LIKELY, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt125$plus_green_gif, $str_alt126$_LitQ_));
	    sethash($KNOWN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt128$plus_yellow_gif, $str_alt126$_LitQ_));
	    sethash($POSSIBLE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt130$plus_purple_gif, $str_alt126$_LitQ_));
	    {
		SubLObject old = $cb_adornment_table$.getGlobalValue();
		SubLObject v_new = make_adornment($list_alt135);
		_csetf_adornment_name(v_new, LITERAL_QUERY_INDEX);
		$cb_adornment_table$.setGlobalValue(cons(v_new, delete(LITERAL_QUERY_INDEX, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    }
	    {
		SubLObject old = $cb_adornment_table$.getGlobalValue();
		SubLObject v_new = make_adornment($list_alt138);
		_csetf_adornment_name(v_new, LITERAL_QUERY_NORMAL);
		$cb_adornment_table$.setGlobalValue(cons(v_new, delete(LITERAL_QUERY_NORMAL, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    }
	    {
		SubLObject old = $cb_adornment_table$.getGlobalValue();
		SubLObject v_new = make_adornment($list_alt141);
		_csetf_adornment_name(v_new, LITERAL_QUERY_INDEX_DISPLAY);
		$cb_adornment_table$.setGlobalValue(cons(v_new, delete(LITERAL_QUERY_INDEX_DISPLAY, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    }
	    sethash($BL_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt147$bl_sdi_gif, NIL));
	    {
		SubLObject old = $cb_adornment_table$.getGlobalValue();
		SubLObject v_new = make_adornment($list_alt148);
		_csetf_adornment_name(v_new, ASSERTED_ASSERTION);
		$cb_adornment_table$.setGlobalValue(cons(v_new, delete(ASSERTED_ASSERTION, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    }
	    sethash($GR_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt151$gr_sdi_gif, NIL));
	    {
		SubLObject old = $cb_adornment_table$.getGlobalValue();
		SubLObject v_new = make_adornment($list_alt152);
		_csetf_adornment_name(v_new, DEDUCED_ASSERTION);
		$cb_adornment_table$.setGlobalValue(cons(v_new, delete(DEDUCED_ASSERTION, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	    }
	    sethash($CB_VIEW_ADORN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str_alt156$cb_view_adorn_html, NIL));
	    html_macros.note_html_handler_function(CB_VIEW_ADORN);
	    html_macros.note_html_handler_function(CB_ADORNMENT_HANDLER);
	}
	return NIL;
    }

    public static final SubLObject setup_cb_adornments_file_alt() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_adornment$.getGlobalValue(), symbol_function(ADORNMENT_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(ADORNMENT_NAME, _CSETF_ADORNMENT_NAME);
	def_csetf(ADORNMENT_TYPE, _CSETF_ADORNMENT_TYPE);
	def_csetf(ADORNMENT_ACTIVE_P, _CSETF_ADORNMENT_ACTIVE_P);
	def_csetf(ADORNMENT_IMAGE, _CSETF_ADORNMENT_IMAGE);
	def_csetf(ADORNMENT_IMAGE_DISABLED, _CSETF_ADORNMENT_IMAGE_DISABLED);
	def_csetf(ADORNMENT_IMAGE_ALT, _CSETF_ADORNMENT_IMAGE_ALT);
	def_csetf(ADORNMENT_DYNAMIC_TAGFN, _CSETF_ADORNMENT_DYNAMIC_TAGFN);
	def_csetf(ADORNMENT_COLOR, _CSETF_ADORNMENT_COLOR);
	def_csetf(ADORNMENT_LETTER, _CSETF_ADORNMENT_LETTER);
	def_csetf(ADORNMENT_EFFECTIVE_FN, _CSETF_ADORNMENT_EFFECTIVE_FN);
	def_csetf(ADORNMENT_HANDLER, _CSETF_ADORNMENT_HANDLER);
	def_csetf(ADORNMENT_TOOL, _CSETF_ADORNMENT_TOOL);
	def_csetf(ADORNMENT_COMMENT, _CSETF_ADORNMENT_COMMENT);
	def_csetf(ADORNMENT_DYNAMIC_COMMENT, _CSETF_ADORNMENT_DYNAMIC_COMMENT);
	def_csetf(ADORNMENT_TITLE, _CSETF_ADORNMENT_TITLE);
	identity(ADORNMENT);
	declare_defglobal($cb_adornment_table$);
	sethash($INDEX_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt90$index_browser_gif, NIL));
	sethash($INDEX_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt92$index_browser_disabled_gif, NIL));
	{
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list_alt93);
	    _csetf_adornment_name(v_new, INDEX_BROWSER);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(INDEX_BROWSER, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}
	{
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list_alt95);
	    _csetf_adornment_name(v_new, META_AXIOMS);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(META_AXIOMS, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}
	sethash($CY_MENU, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt98$cy_menu_gif, NIL));
	{
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list_alt99);
	    _csetf_adornment_name(v_new, ASSERTION_REVIEW);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(ASSERTION_REVIEW, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}
	sethash($BL_MENU, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt102$bl_menu_gif, NIL));
	{
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list_alt103);
	    _csetf_adornment_name(v_new, CONSTANT_REVIEW);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(CONSTANT_REVIEW, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}
	sethash($RED_DIAMOND, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt109$red_diam_gif, NIL));
	{
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list_alt110);
	    _csetf_adornment_name(v_new, HIERARCHY_LINK);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(HIERARCHY_LINK, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}
	sethash($HIERARCHY_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt113$hierarchy_browser_gif, NIL));
	sethash($HIERARCHY_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt115$hierarchy_browser_disabled_gif, NIL));
	{
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list_alt116);
	    _csetf_adornment_name(v_new, HIERARCHY_DEFAULT);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(HIERARCHY_DEFAULT, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}
	sethash($ALPHA_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt119$alpha_browser_gif, NIL));
	sethash($ALPHA_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt121$alpha_browser_disabled_gif, NIL));
	{
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list_alt122);
	    _csetf_adornment_name(v_new, ALPHABETICAL_SEARCH);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(ALPHABETICAL_SEARCH, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}
	sethash($PLUS_GREEN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt125$plus_green_gif, $str_alt126$_LitQ_));
	sethash($PLUS_YELLOW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt128$plus_yellow_gif, $str_alt126$_LitQ_));
	sethash($PLUS_PURPLE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt130$plus_purple_gif, $str_alt126$_LitQ_));
	sethash($LIKELY, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt125$plus_green_gif, $str_alt126$_LitQ_));
	sethash($KNOWN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt128$plus_yellow_gif, $str_alt126$_LitQ_));
	sethash($POSSIBLE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt130$plus_purple_gif, $str_alt126$_LitQ_));
	{
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list_alt135);
	    _csetf_adornment_name(v_new, LITERAL_QUERY_INDEX);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(LITERAL_QUERY_INDEX, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}
	{
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list_alt138);
	    _csetf_adornment_name(v_new, LITERAL_QUERY_NORMAL);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(LITERAL_QUERY_NORMAL, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}
	{
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list_alt141);
	    _csetf_adornment_name(v_new, LITERAL_QUERY_INDEX_DISPLAY);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(LITERAL_QUERY_INDEX_DISPLAY, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}
	sethash($BL_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt147$bl_sdi_gif, NIL));
	{
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list_alt148);
	    _csetf_adornment_name(v_new, ASSERTED_ASSERTION);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(ASSERTED_ASSERTION, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}
	sethash($GR_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt151$gr_sdi_gif, NIL));
	{
	    SubLObject old = $cb_adornment_table$.getGlobalValue();
	    SubLObject v_new = make_adornment($list_alt152);
	    _csetf_adornment_name(v_new, DEDUCED_ASSERTION);
	    $cb_adornment_table$.setGlobalValue(cons(v_new, delete(DEDUCED_ASSERTION, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}
	register_html_state_variable($debug_adornments_p$);
	sethash($CB_VIEW_ADORN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str_alt156$cb_view_adorn_html, NIL));
	html_macros.note_html_handler_function(CB_VIEW_ADORN);
	html_macros.note_html_handler_function(CB_ADORNMENT_HANDLER);
	setup_cb_link_method($VIEW_ADORN, CB_LINK_VIEW_ADORN, TWO_INTEGER);
	return NIL;
    }

    public static SubLObject setup_cb_adornments_file_Previous() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_adornment$.getGlobalValue(), symbol_function(ADORNMENT_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list11);
	def_csetf(ADORNMENT_NAME, _CSETF_ADORNMENT_NAME);
	def_csetf(ADORNMENT_TYPE, _CSETF_ADORNMENT_TYPE);
	def_csetf(ADORNMENT_ACTIVE_P, _CSETF_ADORNMENT_ACTIVE_P);
	def_csetf(ADORNMENT_IMAGE, _CSETF_ADORNMENT_IMAGE);
	def_csetf(ADORNMENT_IMAGE_DISABLED, _CSETF_ADORNMENT_IMAGE_DISABLED);
	def_csetf(ADORNMENT_IMAGE_ALT, _CSETF_ADORNMENT_IMAGE_ALT);
	def_csetf(ADORNMENT_DYNAMIC_TAGFN, _CSETF_ADORNMENT_DYNAMIC_TAGFN);
	def_csetf(ADORNMENT_COLOR, _CSETF_ADORNMENT_COLOR);
	def_csetf(ADORNMENT_LETTER, _CSETF_ADORNMENT_LETTER);
	def_csetf(ADORNMENT_EFFECTIVE_FN, _CSETF_ADORNMENT_EFFECTIVE_FN);
	def_csetf(ADORNMENT_HANDLER, _CSETF_ADORNMENT_HANDLER);
	def_csetf(ADORNMENT_TOOL, _CSETF_ADORNMENT_TOOL);
	def_csetf(ADORNMENT_COMMENT, _CSETF_ADORNMENT_COMMENT);
	def_csetf(ADORNMENT_DYNAMIC_COMMENT, _CSETF_ADORNMENT_DYNAMIC_COMMENT);
	def_csetf(ADORNMENT_TITLE, _CSETF_ADORNMENT_TITLE);
	identity(ADORNMENT);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_adornment$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ADORNMENT_METHOD));
	declare_defglobal($cb_adornment_table$);
	sethash($INDEX_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str91$index_browser_gif, NIL));
	sethash($INDEX_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str93$index_browser_disabled_gif, NIL));
	SubLObject old = $cb_adornment_table$.getGlobalValue();
	SubLObject v_new = make_adornment($list94);
	_csetf_adornment_name(v_new, INDEX_BROWSER);
	$cb_adornment_table$.setGlobalValue(cons(v_new, delete(INDEX_BROWSER, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	old = $cb_adornment_table$.getGlobalValue();
	v_new = make_adornment($list96);
	_csetf_adornment_name(v_new, META_AXIOMS);
	$cb_adornment_table$.setGlobalValue(cons(v_new, delete(META_AXIOMS, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	sethash($CY_MENU, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str99$cy_menu_gif, NIL));
	old = $cb_adornment_table$.getGlobalValue();
	v_new = make_adornment($list100);
	_csetf_adornment_name(v_new, ASSERTION_REVIEW);
	$cb_adornment_table$.setGlobalValue(cons(v_new, delete(ASSERTION_REVIEW, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	sethash($BL_MENU, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str103$bl_menu_gif, NIL));
	sethash($RED_DIAMOND, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str108$red_diam_gif, NIL));
	old = $cb_adornment_table$.getGlobalValue();
	v_new = make_adornment($list109);
	_csetf_adornment_name(v_new, HIERARCHY_LINK);
	$cb_adornment_table$.setGlobalValue(cons(v_new, delete(HIERARCHY_LINK, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	sethash($HIERARCHY_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str112$hierarchy_browser_gif, NIL));
	sethash($HIERARCHY_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str114$hierarchy_browser_disabled_gif, NIL));
	old = $cb_adornment_table$.getGlobalValue();
	v_new = make_adornment($list115);
	_csetf_adornment_name(v_new, HIERARCHY_DEFAULT);
	$cb_adornment_table$.setGlobalValue(cons(v_new, delete(HIERARCHY_DEFAULT, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	sethash($ALPHA_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str118$alpha_browser_gif, NIL));
	sethash($ALPHA_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str120$alpha_browser_disabled_gif, NIL));
	old = $cb_adornment_table$.getGlobalValue();
	v_new = make_adornment($list121);
	_csetf_adornment_name(v_new, ALPHABETICAL_SEARCH);
	$cb_adornment_table$.setGlobalValue(cons(v_new, delete(ALPHABETICAL_SEARCH, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	sethash($PLUS_GREEN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str124$plus_green_gif, $str125$_LitQ_));
	sethash($PLUS_YELLOW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str127$plus_yellow_gif, $str125$_LitQ_));
	sethash($PLUS_PURPLE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str129$plus_purple_gif, $str125$_LitQ_));
	sethash($LIKELY, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str124$plus_green_gif, $str125$_LitQ_));
	sethash($KNOWN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str127$plus_yellow_gif, $str125$_LitQ_));
	sethash($POSSIBLE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str129$plus_purple_gif, $str125$_LitQ_));
	old = $cb_adornment_table$.getGlobalValue();
	v_new = make_adornment($list134);
	_csetf_adornment_name(v_new, LITERAL_QUERY_INDEX);
	$cb_adornment_table$.setGlobalValue(cons(v_new, delete(LITERAL_QUERY_INDEX, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	old = $cb_adornment_table$.getGlobalValue();
	v_new = make_adornment($list137);
	_csetf_adornment_name(v_new, LITERAL_QUERY_NORMAL);
	$cb_adornment_table$.setGlobalValue(cons(v_new, delete(LITERAL_QUERY_NORMAL, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	old = $cb_adornment_table$.getGlobalValue();
	v_new = make_adornment($list140);
	_csetf_adornment_name(v_new, LITERAL_QUERY_INDEX_DISPLAY);
	$cb_adornment_table$.setGlobalValue(cons(v_new, delete(LITERAL_QUERY_INDEX_DISPLAY, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	sethash($BL_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str146$bl_sdi_gif, NIL));
	old = $cb_adornment_table$.getGlobalValue();
	v_new = make_adornment($list147);
	_csetf_adornment_name(v_new, ASSERTED_ASSERTION);
	$cb_adornment_table$.setGlobalValue(cons(v_new, delete(ASSERTED_ASSERTION, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	sethash($GR_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str150$gr_sdi_gif, NIL));
	old = $cb_adornment_table$.getGlobalValue();
	v_new = make_adornment($list151);
	_csetf_adornment_name(v_new, DEDUCED_ASSERTION);
	$cb_adornment_table$.setGlobalValue(cons(v_new, delete(DEDUCED_ASSERTION, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	register_html_state_variable($debug_adornments_p$);
	sethash($CB_VIEW_ADORN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str155$cb_view_adorn_html, NIL));
	html_macros.note_cgi_handler_function(CB_VIEW_ADORN, $HTML_HANDLER);
	html_macros.note_cgi_handler_function(CB_ADORNMENT_HANDLER, $HTML_HANDLER);
	setup_cb_link_method($VIEW_ADORN, CB_LINK_VIEW_ADORN, TWO_INTEGER);
	return NIL;
    }

    public static SubLObject visit_defstruct_adornment(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_ADORNMENT, FIFTEEN_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $NAME, adornment_name(obj));
	funcall(visitor_fn, obj, $SLOT, $TYPE, adornment_type(obj));
	funcall(visitor_fn, obj, $SLOT, $ACTIVE_P, adornment_active_p(obj));
	funcall(visitor_fn, obj, $SLOT, $IMAGE, adornment_image(obj));
	funcall(visitor_fn, obj, $SLOT, $IMAGE_DISABLED, adornment_image_disabled(obj));
	funcall(visitor_fn, obj, $SLOT, $IMAGE_ALT, adornment_image_alt(obj));
	funcall(visitor_fn, obj, $SLOT, $DYNAMIC_TAGFN, adornment_dynamic_tagfn(obj));
	funcall(visitor_fn, obj, $SLOT, $COLOR, adornment_color(obj));
	funcall(visitor_fn, obj, $SLOT, $LETTER, adornment_letter(obj));
	funcall(visitor_fn, obj, $SLOT, $EFFECTIVE_FN, adornment_effective_fn(obj));
	funcall(visitor_fn, obj, $SLOT, $HANDLER, adornment_handler(obj));
	funcall(visitor_fn, obj, $SLOT, $TOOL, adornment_tool(obj));
	funcall(visitor_fn, obj, $SLOT, $COMMENT, adornment_comment(obj));
	funcall(visitor_fn, obj, $SLOT, $DYNAMIC_COMMENT, adornment_dynamic_comment(obj));
	funcall(visitor_fn, obj, $SLOT, $TITLE, adornment_title(obj));
	funcall(visitor_fn, obj, $END, MAKE_ADORNMENT, FIFTEEN_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_adornment_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_adornment(obj, visitor_fn);
    }

    @Override
    public void declareFunctions() {
	declare_cb_adornments_file();
    }

    @Override
    public void initializeVariables() {
	init_cb_adornments_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_cb_adornments_file();
    }

    static {
    }

    public static final class $adornment_native extends SubLStructNative {
	private static final SubLStructDeclNative structDecl;

	public SubLObject $active_p;

	public SubLObject $color;

	public SubLObject $comment;

	public SubLObject $dynamic_comment;

	public SubLObject $dynamic_tagfn;

	public SubLObject $effective_fn;

	public SubLObject $handler;

	public SubLObject $image;

	public SubLObject $image_alt;

	public SubLObject $image_disabled;

	public SubLObject $letter;

	public SubLObject $name;

	public SubLObject $title;

	public SubLObject $tool;

	public SubLObject $type;

	public $adornment_native() {
	    $name = Lisp.NIL;
	    $type = Lisp.NIL;
	    $active_p = Lisp.NIL;
	    $image = Lisp.NIL;
	    $image_disabled = Lisp.NIL;
	    $image_alt = Lisp.NIL;
	    $dynamic_tagfn = Lisp.NIL;
	    $color = Lisp.NIL;
	    $letter = Lisp.NIL;
	    $effective_fn = Lisp.NIL;
	    $handler = Lisp.NIL;
	    $tool = Lisp.NIL;
	    $comment = Lisp.NIL;
	    $dynamic_comment = Lisp.NIL;
	    $title = Lisp.NIL;
	}

	@Override
	public SubLObject getField2() {
	    return $name;
	}

	@Override
	public SubLObject getField3() {
	    return $type;
	}

	@Override
	public SubLObject getField4() {
	    return $active_p;
	}

	@Override
	public SubLObject getField5() {
	    return $image;
	}

	@Override
	public SubLObject getField6() {
	    return $image_disabled;
	}

	@Override
	public SubLObject getField7() {
	    return $image_alt;
	}

	@Override
	public SubLObject getField8() {
	    return $dynamic_tagfn;
	}

	@Override
	public SubLObject getField9() {
	    return $color;
	}

	@Override
	public SubLObject getField10() {
	    return $letter;
	}

	@Override
	public SubLObject getField11() {
	    return $effective_fn;
	}

	@Override
	public SubLObject getField12() {
	    return $handler;
	}

	@Override
	public SubLObject getField13() {
	    return $tool;
	}

	@Override
	public SubLObject getField14() {
	    return $comment;
	}

	@Override
	public SubLObject getField15() {
	    return $dynamic_comment;
	}

	@Override
	public SubLObject getField16() {
	    return $title;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return $name = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return $type = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return $active_p = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return $image = value;
	}

	@Override
	public SubLObject setField6(final SubLObject value) {
	    return $image_disabled = value;
	}

	@Override
	public SubLObject setField7(final SubLObject value) {
	    return $image_alt = value;
	}

	@Override
	public SubLObject setField8(final SubLObject value) {
	    return $dynamic_tagfn = value;
	}

	@Override
	public SubLObject setField9(final SubLObject value) {
	    return $color = value;
	}

	@Override
	public SubLObject setField10(final SubLObject value) {
	    return $letter = value;
	}

	@Override
	public SubLObject setField11(final SubLObject value) {
	    return $effective_fn = value;
	}

	@Override
	public SubLObject setField12(final SubLObject value) {
	    return $handler = value;
	}

	@Override
	public SubLObject setField13(final SubLObject value) {
	    return $tool = value;
	}

	@Override
	public SubLObject setField14(final SubLObject value) {
	    return $comment = value;
	}

	@Override
	public SubLObject setField15(final SubLObject value) {
	    return $dynamic_comment = value;
	}

	@Override
	public SubLObject setField16(final SubLObject value) {
	    return $title = value;
	}

	static {
	    structDecl = makeStructDeclNative($adornment_native.class, ADORNMENT, ADORNMENT_P, $list5, $list6,
		    new String[] { "$name", "$type", "$active_p", "$image", "$image_disabled", "$image_alt", "$dynamic_tagfn", "$color", "$letter", "$effective_fn", "$handler", "$tool", "$comment", "$dynamic_comment", "$title" }, $list7, $list8, PRINT_ADORNMENT);
	}
    }

    public static final class $adornment_p$UnaryFunction extends UnaryFunction {
	public $adornment_p$UnaryFunction() {
	    super(extractFunctionNamed("ADORNMENT-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return adornment_p(arg1);
	}
    }
}

/**
 * Total time: 1444 ms synthetic
 */
