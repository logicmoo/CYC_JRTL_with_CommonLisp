/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
 * module:      CB-VIEWPOINT
 * source file: /cyc/top/cycl/cb-viewpoint.lisp
 * created:     2019/07/03 17:38:03
 */
public final class cb_viewpoint extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt84$ = makeString("");

    public static final class $viewpoint_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$name;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$summary_name;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$linkable_name;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$linkname_prefix;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$filter_getter;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$filter_setter;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$type;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$active_p;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$effective_fn;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$value_prompt_fn;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$value_update_fn;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$initial_filter_value;
        }

        public SubLObject getField14() {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$effective_fn_slotname;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$summary_name = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$linkable_name = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$linkname_prefix = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$filter_getter = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$filter_setter = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$type = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$active_p = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$effective_fn = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$value_prompt_fn = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$value_update_fn = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$initial_filter_value = value;
        }

        public SubLObject setField14(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.this.$effective_fn_slotname = value;
        }

        public SubLObject $name = Lisp.NIL;

        public SubLObject $summary_name = Lisp.NIL;

        public SubLObject $linkable_name = Lisp.NIL;

        public SubLObject $linkname_prefix = Lisp.NIL;

        public SubLObject $filter_getter = Lisp.NIL;

        public SubLObject $filter_setter = Lisp.NIL;

        public SubLObject $type = Lisp.NIL;

        public SubLObject $active_p = Lisp.NIL;

        public SubLObject $effective_fn = Lisp.NIL;

        public SubLObject $value_prompt_fn = Lisp.NIL;

        public SubLObject $value_update_fn = Lisp.NIL;

        public SubLObject $initial_filter_value = Lisp.NIL;

        public SubLObject $effective_fn_slotname = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.class, VIEWPOINT, VIEWPOINT_P, $list_alt6, $list_alt7, new String[]{ "$name", "$summary_name", "$linkable_name", "$linkname_prefix", "$filter_getter", "$filter_setter", "$type", "$active_p", "$effective_fn", "$value_prompt_fn", "$value_update_fn", "$initial_filter_value", "$effective_fn_slotname" }, $list_alt8, $list_alt9, PRINT_VIEWPOINT);
    }

    public static final SubLFile me = new cb_viewpoint();

 public static final String myName = "com.cyc.cycjava.cycl.cb_viewpoint";


    // defparameter
    @LispMethod(comment = "Binding for the type of viewpoint (when we limit them)\ndefparameter")
    private static final SubLSymbol $viewpoint_type$ = makeSymbol("*VIEWPOINT-TYPE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_viewpoint$ = makeSymbol("*DTP-VIEWPOINT*");

    // defparameter
    // Used to pass between handlers
    /**
     * Used to pass between handlers
     */
    @LispMethod(comment = "Used to pass between handlers\ndefparameter")
    private static final SubLSymbol $index_hook$ = makeSymbol("*INDEX-HOOK*");

    // deflexical
    // cache of active filters
    /**
     * cache of active filters
     */
    @LispMethod(comment = "cache of active filters\ndeflexical")
    private static final SubLSymbol $viewpoint_cache$ = makeSymbol("*VIEWPOINT-CACHE*");

    // deflexical
    // So we can deal with having dashes in the list display, and delete it here
    /**
     * So we can deal with having dashes in the list display, and delete it here
     */
    @LispMethod(comment = "So we can deal with having dashes in the list display, and delete it here\ndeflexical")
    private static final SubLSymbol $dash_nil$ = makeSymbol("*DASH-NIL*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$_ = makeString("#");

    private static final SubLSymbol VIEWPOINT = makeSymbol("VIEWPOINT");

    private static final SubLSymbol VIEWPOINT_P = makeSymbol("VIEWPOINT-P");

    private static final SubLList $list3 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("SUMMARY-NAME"), makeSymbol("LINKABLE-NAME"), makeSymbol("LINKNAME-PREFIX"), makeSymbol("FILTER-GETTER"), makeSymbol("FILTER-SETTER"), makeSymbol("TYPE"), makeSymbol("ACTIVE-P"), makeSymbol("EFFECTIVE-FN"), makeSymbol("VALUE-PROMPT-FN"), makeSymbol("VALUE-UPDATE-FN"), makeSymbol("INITIAL-FILTER-VALUE"), makeSymbol("EFFECTIVE-FN-SLOTNAME") });

    private static final SubLList $list4 = list(new SubLObject[]{ $NAME, makeKeyword("SUMMARY-NAME"), makeKeyword("LINKABLE-NAME"), makeKeyword("LINKNAME-PREFIX"), makeKeyword("FILTER-GETTER"), makeKeyword("FILTER-SETTER"), $TYPE, makeKeyword("ACTIVE-P"), makeKeyword("EFFECTIVE-FN"), makeKeyword("VALUE-PROMPT-FN"), makeKeyword("VALUE-UPDATE-FN"), makeKeyword("INITIAL-FILTER-VALUE"), makeKeyword("EFFECTIVE-FN-SLOTNAME") });

    private static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("VIEWPOINT-NAME"), makeSymbol("VIEWPOINT-SUMMARY-NAME"), makeSymbol("VIEWPOINT-LINKABLE-NAME"), makeSymbol("VIEWPOINT-LINKNAME-PREFIX"), makeSymbol("VIEWPOINT-FILTER-GETTER"), makeSymbol("VIEWPOINT-FILTER-SETTER"), makeSymbol("VIEWPOINT-TYPE"), makeSymbol("VIEWPOINT-ACTIVE-P"), makeSymbol("VIEWPOINT-EFFECTIVE-FN"), makeSymbol("VIEWPOINT-VALUE-PROMPT-FN"), makeSymbol("VIEWPOINT-VALUE-UPDATE-FN"), makeSymbol("VIEWPOINT-INITIAL-FILTER-VALUE"), makeSymbol("VIEWPOINT-EFFECTIVE-FN-SLOTNAME") });

    static private final SubLList $list6 = list(new SubLObject[]{ makeSymbol("_CSETF-VIEWPOINT-NAME"), makeSymbol("_CSETF-VIEWPOINT-SUMMARY-NAME"), makeSymbol("_CSETF-VIEWPOINT-LINKABLE-NAME"), makeSymbol("_CSETF-VIEWPOINT-LINKNAME-PREFIX"), makeSymbol("_CSETF-VIEWPOINT-FILTER-GETTER"), makeSymbol("_CSETF-VIEWPOINT-FILTER-SETTER"), makeSymbol("_CSETF-VIEWPOINT-TYPE"), makeSymbol("_CSETF-VIEWPOINT-ACTIVE-P"), makeSymbol("_CSETF-VIEWPOINT-EFFECTIVE-FN"), makeSymbol("_CSETF-VIEWPOINT-VALUE-PROMPT-FN"), makeSymbol("_CSETF-VIEWPOINT-VALUE-UPDATE-FN"), makeSymbol("_CSETF-VIEWPOINT-INITIAL-FILTER-VALUE"), makeSymbol("_CSETF-VIEWPOINT-EFFECTIVE-FN-SLOTNAME") });

    private static final SubLSymbol PRINT_VIEWPOINT = makeSymbol("PRINT-VIEWPOINT");

    private static final SubLSymbol VIEWPOINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("VIEWPOINT-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("VIEWPOINT-P"));

    private static final SubLSymbol VIEWPOINT_NAME = makeSymbol("VIEWPOINT-NAME");

    private static final SubLSymbol _CSETF_VIEWPOINT_NAME = makeSymbol("_CSETF-VIEWPOINT-NAME");

    private static final SubLSymbol VIEWPOINT_SUMMARY_NAME = makeSymbol("VIEWPOINT-SUMMARY-NAME");

    private static final SubLSymbol _CSETF_VIEWPOINT_SUMMARY_NAME = makeSymbol("_CSETF-VIEWPOINT-SUMMARY-NAME");

    private static final SubLSymbol VIEWPOINT_LINKABLE_NAME = makeSymbol("VIEWPOINT-LINKABLE-NAME");

    private static final SubLSymbol _CSETF_VIEWPOINT_LINKABLE_NAME = makeSymbol("_CSETF-VIEWPOINT-LINKABLE-NAME");

    private static final SubLSymbol VIEWPOINT_LINKNAME_PREFIX = makeSymbol("VIEWPOINT-LINKNAME-PREFIX");

    private static final SubLSymbol _CSETF_VIEWPOINT_LINKNAME_PREFIX = makeSymbol("_CSETF-VIEWPOINT-LINKNAME-PREFIX");

    private static final SubLSymbol VIEWPOINT_FILTER_GETTER = makeSymbol("VIEWPOINT-FILTER-GETTER");

    private static final SubLSymbol _CSETF_VIEWPOINT_FILTER_GETTER = makeSymbol("_CSETF-VIEWPOINT-FILTER-GETTER");

    private static final SubLSymbol VIEWPOINT_FILTER_SETTER = makeSymbol("VIEWPOINT-FILTER-SETTER");

    private static final SubLSymbol _CSETF_VIEWPOINT_FILTER_SETTER = makeSymbol("_CSETF-VIEWPOINT-FILTER-SETTER");

    private static final SubLSymbol VIEWPOINT_TYPE = makeSymbol("VIEWPOINT-TYPE");

    private static final SubLSymbol _CSETF_VIEWPOINT_TYPE = makeSymbol("_CSETF-VIEWPOINT-TYPE");

    private static final SubLSymbol VIEWPOINT_ACTIVE_P = makeSymbol("VIEWPOINT-ACTIVE-P");

    private static final SubLSymbol _CSETF_VIEWPOINT_ACTIVE_P = makeSymbol("_CSETF-VIEWPOINT-ACTIVE-P");

    private static final SubLSymbol VIEWPOINT_EFFECTIVE_FN = makeSymbol("VIEWPOINT-EFFECTIVE-FN");

    private static final SubLSymbol _CSETF_VIEWPOINT_EFFECTIVE_FN = makeSymbol("_CSETF-VIEWPOINT-EFFECTIVE-FN");

    private static final SubLSymbol VIEWPOINT_VALUE_PROMPT_FN = makeSymbol("VIEWPOINT-VALUE-PROMPT-FN");

    private static final SubLSymbol _CSETF_VIEWPOINT_VALUE_PROMPT_FN = makeSymbol("_CSETF-VIEWPOINT-VALUE-PROMPT-FN");

    private static final SubLSymbol VIEWPOINT_VALUE_UPDATE_FN = makeSymbol("VIEWPOINT-VALUE-UPDATE-FN");

    private static final SubLSymbol _CSETF_VIEWPOINT_VALUE_UPDATE_FN = makeSymbol("_CSETF-VIEWPOINT-VALUE-UPDATE-FN");

    private static final SubLSymbol VIEWPOINT_INITIAL_FILTER_VALUE = makeSymbol("VIEWPOINT-INITIAL-FILTER-VALUE");

    private static final SubLSymbol _CSETF_VIEWPOINT_INITIAL_FILTER_VALUE = makeSymbol("_CSETF-VIEWPOINT-INITIAL-FILTER-VALUE");

    private static final SubLSymbol VIEWPOINT_EFFECTIVE_FN_SLOTNAME = makeSymbol("VIEWPOINT-EFFECTIVE-FN-SLOTNAME");

    private static final SubLSymbol _CSETF_VIEWPOINT_EFFECTIVE_FN_SLOTNAME = makeSymbol("_CSETF-VIEWPOINT-EFFECTIVE-FN-SLOTNAME");

    private static final SubLSymbol $VALUE_PROMPT_FN = makeKeyword("VALUE-PROMPT-FN");

    private static final SubLSymbol $VALUE_UPDATE_FN = makeKeyword("VALUE-UPDATE-FN");

    private static final SubLSymbol $INITIAL_FILTER_VALUE = makeKeyword("INITIAL-FILTER-VALUE");

    private static final SubLSymbol $EFFECTIVE_FN_SLOTNAME = makeKeyword("EFFECTIVE-FN-SLOTNAME");

    private static final SubLString $str49$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_VIEWPOINT = makeSymbol("MAKE-VIEWPOINT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_VIEWPOINT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-VIEWPOINT-METHOD");

    public static final SubLSymbol $cb_viewpoint_table$ = makeSymbol("*CB-VIEWPOINT-TABLE*");

    public static final SubLSymbol $cb_viewpoint_summary_alist$ = makeSymbol("*CB-VIEWPOINT-SUMMARY-ALIST*");

    private static final SubLSymbol ACTIVE_VIEWPOINT_STRUCT_P = makeSymbol("ACTIVE-VIEWPOINT-STRUCT-P");

    private static final SubLList $list58 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));

    private static final SubLString $str59$_A_FILTER = makeString("~A-FILTER");

    private static final SubLString $str60$CB__A = makeString("CB-~A");

    private static final SubLString $str61$SET__A = makeString("SET-~A");

    private static final SubLString $str62$_A_EFFECTIVE_FN = makeString("~A-EFFECTIVE-FN");

    private static final SubLSymbol DEFFILTERSET = makeSymbol("DEFFILTERSET");

    private static final SubLList $list65 = list(NIL, makeString("Automatically generated filter"));

    private static final SubLSymbol $LIST_OF_FORMS = makeKeyword("LIST-OF-FORMS");

    private static final SubLSymbol DEFVIEWPOINT_INTERNAL = makeSymbol("DEFVIEWPOINT-INTERNAL");

    private static final SubLList $list70 = list(makeSymbol("ASSERTION"));

    private static final SubLList $list71 = list(makeSymbol("PUNLESS"), list(makeSymbol("ASSERTION-P"), makeSymbol("ASSERTION")), list(makeSymbol("BREAK"), makeString("not an assertion")));

    static private final SubLList $list72 = list(makeSymbol("PWHEN"), list(makeSymbol("DOC-PREDICATE-P"), makeSymbol("ASSERTION")), list(RET, T));

    private static final SubLSymbol FIND_VIEWPOINT = makeSymbol("FIND-VIEWPOINT");

    private static final SubLList $list75 = list(list(RET, list(makeSymbol("MEMBER"), list(makeSymbol("FUNCALL"), list(makeSymbol("VIEWPOINT-EFFECTIVE-FN-SLOTNAME"), makeSymbol("VIEWPOINT")), makeSymbol("ASSERTION")), list(makeSymbol("FUNCALL"), list(makeSymbol("VIEWPOINT-FILTER-GETTER"), makeSymbol("VIEWPOINT"))))));

    private static final SubLList $list76 = list(NIL);

    private static final SubLString $str78$activate__A = makeString("activate-~A");

    private static final SubLString $str79$_ = makeString(":");

    private static final SubLSymbol $SINGLE_SIMPLE_DATE = makeKeyword("SINGLE-SIMPLE-DATE");

    private static final SubLString $str82$_D = makeString("~D");

    private static final SubLString $$$Edit = makeString("Edit");

    private static final SubLSymbol DISPLAY_VIEWPOINT = makeSymbol("DISPLAY-VIEWPOINT");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLString $str87$ = makeString("");

    private static final SubLString $str88$cb_show_cyclist__A = makeString("cb-show-cyclist-~A");





    private static final SubLString $str91$cb_show_cyclist1__A = makeString("cb-show-cyclist1-~A");

    private static final SubLString $str92$cb_show_cyclist2__A = makeString("cb-show-cyclist2-~A");

    private static final SubLString $str93$________ = makeString("--------");

    private static final SubLString $str94$Unknown__A___S = makeString("Unknown ~A: ~S");

    private static final SubLString $$$cyclist = makeString("cyclist");

    private static final SubLObject $$Cyc_BasedProject = reader_make_constant_shell("Cyc-BasedProject");



    private static final SubLString $str98$project1__A = makeString("project1-~A");

    private static final SubLString $str99$project2__A = makeString("project2-~A");

    private static final SubLString $str100$project3__A = makeString("project3-~A");

    private static final SubLString $$$project = makeString("project");

    private static final SubLString $str103$cb_viewpoint_html = makeString("cb-viewpoint.html");

    private static final SubLList $list104 = list(makeSymbol("INDEX-SPEC"));

    private static final SubLString $str105$_a_does_not_specify_an_index = makeString("~a does not specify an index");

    private static final SubLString $$$Viewpoint_Filter_Summary = makeString("Viewpoint Filter Summary");

    private static final SubLString $str107$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str108$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str113$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str119$cb_viewpoint_summary_handler = makeString("cb-viewpoint-summary-handler");

    private static final SubLString $$$Current_Values = makeString("Current Values");

    private static final SubLString $$$Update_Filter_Settings = makeString("Update Filter Settings");

    private static final SubLString $str122$always_show_comments = makeString("always-show-comments");

    private static final SubLString $str123$Always_show_comments__regardless_ = makeString("Always show comments, regardless of other filter settings.");

    private static final SubLString $str124$always_show_bookkeeping = makeString("always-show-bookkeeping");

    private static final SubLString $str125$Always_show_bookkeeping_predicate = makeString("Always show bookkeeping predicates, regardless of other filter settings.");

    private static final SubLSymbol DISPLAY_VIEWPOINT_1 = makeSymbol("DISPLAY-VIEWPOINT-1");

    private static final SubLSymbol CB_VIEWPOINT = makeSymbol("CB-VIEWPOINT");

    private static final SubLList $list129 = list(makeSymbol("SUMMARY-NAME"), makeSymbol("INDEX-SPEC"));

    private static final SubLString $$$Viewpoint_Filters = makeString("Viewpoint Filters");

    private static final SubLString $str131$cb_viewpoint_handler = makeString("cb-viewpoint-handler");

    private static final SubLSymbol CB_EV = makeSymbol("CB-EV");

    private static final SubLString $$$Summary_filters_have_been_changed = makeString("Summary filters have been changed");

    private static final SubLSymbol CB_VIEWPOINT_SUMMARY_HANDLER = makeSymbol("CB-VIEWPOINT-SUMMARY-HANDLER");

    private static final SubLSymbol CB_VIEWPOINT_HANDLER = makeSymbol("CB-VIEWPOINT-HANDLER");

    private static final SubLString $str136$_Viewpoint_ = makeString("[Viewpoint]");

    private static final SubLString $str138$cb_viewpoint__A = makeString("cb-viewpoint&~A");

    private static final SubLSymbol CB_LINK_VIEWPOINT = makeSymbol("CB-LINK-VIEWPOINT");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$_Filter = makeString(" Filter");

    private static final SubLString $str143$_Only_those_terms_whose_ = makeString("(Only those terms whose ");

    private static final SubLString $str144$_field_has_a_value_equal_to_a_ter = makeString(" field has a value equal to a term below will be presented. Leave blank to disable this filter.)");

    private static final SubLSymbol CB_PROMPT_CYCLISTS = makeSymbol("CB-PROMPT-CYCLISTS");

    private static final SubLString $$$Activate_Filter = makeString("Activate Filter");

    private static final SubLString $str147$all_dates__A = makeString("all-dates-~A");

    private static final SubLString $$$no = makeString("no");

    private static final SubLString $str149$cb_show_start__A = makeString("cb-show-start-~A");

    private static final SubLString $$$all = makeString("all");

    private static final SubLString $$$yes = makeString("yes");

    private static final SubLString $$$All_Mts = makeString("All Mts");

    private static final SubLString $$$Specify_Mts = makeString("Specify Mts");

    private static final SubLString $str155$use_genl_mt = makeString("use-genl-mt");

    private static final SubLString $$$Include_All_Genl_Mts = makeString("Include All Genl Mts");

    private static final SubLString $str157$new_mt = makeString("new-mt");

    private static final SubLSymbol CB_PROMPT_PROJECTS = makeSymbol("CB-PROMPT-PROJECTS");



    public static final SubLSymbol $cb_use_mycreator_filter$ = makeSymbol("*CB-USE-MYCREATOR-FILTER*");

    public static final SubLSymbol $cb_mycreator_filter$ = makeSymbol("*CB-MYCREATOR-FILTER*");

    private static final SubLSymbol MYCREATOR = makeSymbol("MYCREATOR");

    private static final SubLList $list163 = list(new SubLObject[]{ makeKeyword("LINKABLE-NAME"), reader_make_constant_shell("myCreator"), $TYPE, makeKeyword("LIST-OF-FORMS"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("VALUE-PROMPT-FN"), makeSymbol("PROMPT-FOR-LIST-OF-CYCLISTS"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("RECEIVE-LIST-OF-CYCLISTS"), makeKeyword("EFFECTIVE-FN-SLOTNAME"), makeSymbol("ASSERTED-BY") });

    private static final SubLSymbol CB_MYCREATOR_FILTER = makeSymbol("CB-MYCREATOR-FILTER");

    private static final SubLSymbol SET_CB_MYCREATOR_FILTER = makeSymbol("SET-CB-MYCREATOR-FILTER");

    private static final SubLSymbol MYCREATOR_EFFECTIVE_FN = makeSymbol("MYCREATOR-EFFECTIVE-FN");

    private static final SubLString $$$not_an_assertion = makeString("not an assertion");

    public static final SubLSymbol $cb_use_myreviewer_filter$ = makeSymbol("*CB-USE-MYREVIEWER-FILTER*");

    public static final SubLSymbol $cb_myreviewer_filter$ = makeSymbol("*CB-MYREVIEWER-FILTER*");

    private static final SubLSymbol MYREVIEWER = makeSymbol("MYREVIEWER");

    private static final SubLList $list171 = list(new SubLObject[]{ makeKeyword("LINKABLE-NAME"), reader_make_constant_shell("myReviewer"), $TYPE, makeKeyword("LIST-OF-FORMS"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("EFFECTIVE-FN-SLOTNAME"), makeSymbol("ASSERTED-REVIEWER"), makeKeyword("VALUE-PROMPT-FN"), makeSymbol("PROMPT-FOR-LIST-OF-CYCLISTS"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("RECEIVE-LIST-OF-CYCLISTS") });

    private static final SubLSymbol CB_MYREVIEWER_FILTER = makeSymbol("CB-MYREVIEWER-FILTER");

    private static final SubLSymbol SET_CB_MYREVIEWER_FILTER = makeSymbol("SET-CB-MYREVIEWER-FILTER");

    private static final SubLSymbol MYREVIEWER_EFFECTIVE_FN = makeSymbol("MYREVIEWER-EFFECTIVE-FN");

    public static final SubLSymbol $cb_use_assertion_start_date_filter$ = makeSymbol("*CB-USE-ASSERTION-START-DATE-FILTER*");

    public static final SubLSymbol $cb_assertion_start_date_filter$ = makeSymbol("*CB-ASSERTION-START-DATE-FILTER*");

    private static final SubLSymbol ASSERTION_START_DATE = makeSymbol("ASSERTION-START-DATE");

    private static final SubLList $list178 = list(new SubLObject[]{ makeKeyword("LINKNAME-PREFIX"), makeString("After "), makeKeyword("LINKABLE-NAME"), reader_make_constant_shell("myCreationTime"), $TYPE, makeKeyword("SINGLE-SIMPLE-DATE"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("EFFECTIVE-FN"), makeSymbol("ASSERTION-AFTER-DATE"), makeKeyword("VALUE-PROMPT-FN"), makeSymbol("PROMPT-FOR-DATE"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("RECEIVE-DATE"), makeKeyword("INITIAL-FILTER-VALUE"), makeInteger(19800101) });

    private static final SubLSymbol CB_ASSERTION_START_DATE_FILTER = makeSymbol("CB-ASSERTION-START-DATE-FILTER");

    private static final SubLSymbol SET_CB_ASSERTION_START_DATE_FILTER = makeSymbol("SET-CB-ASSERTION-START-DATE-FILTER");

    public static final SubLSymbol $cb_use_assertion_end_date_filter$ = makeSymbol("*CB-USE-ASSERTION-END-DATE-FILTER*");

    public static final SubLSymbol $cb_assertion_end_date_filter$ = makeSymbol("*CB-ASSERTION-END-DATE-FILTER*");

    private static final SubLSymbol ASSERTION_END_DATE = makeSymbol("ASSERTION-END-DATE");

    private static final SubLList $list184 = list(new SubLObject[]{ makeKeyword("LINKNAME-PREFIX"), makeString("Before "), makeKeyword("LINKABLE-NAME"), reader_make_constant_shell("myCreationTime"), $TYPE, makeKeyword("SINGLE-SIMPLE-DATE"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("EFFECTIVE-FN"), makeSymbol("ASSERTION-BEFORE-DATE"), makeKeyword("VALUE-PROMPT-FN"), makeSymbol("PROMPT-FOR-DATE"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("RECEIVE-DATE"), makeKeyword("INITIAL-FILTER-VALUE"), makeInteger(29991231) });

    private static final SubLSymbol CB_ASSERTION_END_DATE_FILTER = makeSymbol("CB-ASSERTION-END-DATE-FILTER");

    private static final SubLSymbol SET_CB_ASSERTION_END_DATE_FILTER = makeSymbol("SET-CB-ASSERTION-END-DATE-FILTER");

    public static final SubLSymbol $cb_use_mts_filter$ = makeSymbol("*CB-USE-MTS-FILTER*");

    public static final SubLSymbol $cb_mts_filter$ = makeSymbol("*CB-MTS-FILTER*");

    private static final SubLList $list189 = list(new SubLObject[]{ makeKeyword("LINKABLE-NAME"), reader_make_constant_shell("Microtheory"), $TYPE, makeKeyword("LIST-OF-FORMS"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("EFFECTIVE-FN"), NIL, makeKeyword("VALUE-PROMPT-FN"), makeSymbol("PROMPT-FOR-MT"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("RECEIVE-MT") });

    private static final SubLSymbol CB_MTS_FILTER = makeSymbol("CB-MTS-FILTER");

    private static final SubLSymbol SET_CB_MTS_FILTER = makeSymbol("SET-CB-MTS-FILTER");

    public static final SubLSymbol $cb_use_mycreationpurpose_filter$ = makeSymbol("*CB-USE-MYCREATIONPURPOSE-FILTER*");

    public static final SubLSymbol $cb_mycreationpurpose_filter$ = makeSymbol("*CB-MYCREATIONPURPOSE-FILTER*");

    private static final SubLSymbol MYCREATIONPURPOSE = makeSymbol("MYCREATIONPURPOSE");

    private static final SubLList $list195 = list(new SubLObject[]{ makeKeyword("LINKABLE-NAME"), reader_make_constant_shell("myCreationPurpose"), $TYPE, makeKeyword("LIST-OF-FORMS"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("VALUE-PROMPT-FN"), makeSymbol("PROMPT-FOR-CYCBASEDPROJECT"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("RECEIVE-LIST-OF-PROJECTS"), makeKeyword("EFFECTIVE-FN-SLOTNAME"), makeSymbol("ASSERTED-WHY") });

    private static final SubLSymbol CB_MYCREATIONPURPOSE_FILTER = makeSymbol("CB-MYCREATIONPURPOSE-FILTER");

    private static final SubLSymbol SET_CB_MYCREATIONPURPOSE_FILTER = makeSymbol("SET-CB-MYCREATIONPURPOSE-FILTER");

    private static final SubLSymbol MYCREATIONPURPOSE_EFFECTIVE_FN = makeSymbol("MYCREATIONPURPOSE-EFFECTIVE-FN");

    private static final SubLSymbol CB_ONLINE_FILTER_HOOKS = makeSymbol("CB-ONLINE-FILTER-HOOKS");

    private static final SubLList $list200 = list(list(makeSymbol("*ASSERTION-FILTER-HOOK*"), list(makeSymbol("CB-CALC-FILTER-HOOKS"))));

    private static final SubLList $list201 = list(makeSymbol("ANSWER-LIST"), makeSymbol("MT-GETTER"), makeSymbol("GETTER"), makeSymbol("&KEY"), makeSymbol("SPECIFIED-MT"));

    static private final SubLList $list202 = list(makeKeyword("SPECIFIED-MT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol WITH_ASSERTION_FILTERS = makeSymbol("WITH-ASSERTION-FILTERS");

    private static final SubLList $list208 = list(makeSymbol("ACTIVE-FILTER-P"), list(QUOTE, makeSymbol("MTS")));

    private static final SubLList $list211 = list(makeSymbol("CB-MTS-FILTER-USE-GENLMT"));

    private static final SubLSymbol WITH_MT_LIST_AND_GENL_MTS = makeSymbol("WITH-MT-LIST-AND-GENL-MTS");

    private static final SubLList $list213 = list(makeSymbol("CB-MTS-FILTER"));

    private static final SubLList $list216 = list(makeSymbol("FILTERED"), makeSymbol("UNFILTERED"));

    private static final SubLSymbol $sym217$RESULT = makeUninternedSymbol("RESULT");

    private static final SubLString $str219$cb_ev = makeString("cb-ev");

    private static final SubLString $str221$cb_start_cb_ev = makeString("cb-start|cb-ev");

    private static final SubLString $str222$_a__a__a = makeString("~a&~a&~a");

    private static final SubLString $str223$_a__a = makeString("~a&~a");

    private static final SubLSymbol CB_LINK_EDIT_VIEWPOINT = makeSymbol("CB-LINK-EDIT-VIEWPOINT");

    public static final SubLObject print_viewpoint_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
                princ($str_alt0$_, stream);
            } else {
                if (NIL != $print_readably$.getDynamicValue(thread)) {
                    print_not_readable(v_object, stream);
                } else {
                    {
                        SubLObject v_object_1 = v_object;
                        SubLObject stream_2 = stream;
                        write_string($str_alt1$__, stream_2, UNPROVIDED, UNPROVIDED);
                        write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                        write_char(CHAR_space, stream_2);
                        princ(viewpoint_name(v_object), stream);
                        write_char(CHAR_greater, stream_2);
                    }
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_viewpoint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
            princ($str0$_, stream);
        } else
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
                princ(viewpoint_name(v_object), stream);
                print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
            }

        return v_object;
    }

    public static final SubLObject viewpoint_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_viewpoint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject viewpoint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_viewpoint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject viewpoint_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject viewpoint_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native.class ? T : NIL;
    }

    public static final SubLObject viewpoint_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField2();
    }

    public static SubLObject viewpoint_name(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject viewpoint_summary_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField3();
    }

    public static SubLObject viewpoint_summary_name(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject viewpoint_linkable_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField4();
    }

    public static SubLObject viewpoint_linkable_name(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject viewpoint_linkname_prefix_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField5();
    }

    public static SubLObject viewpoint_linkname_prefix(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject viewpoint_filter_getter_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField6();
    }

    public static SubLObject viewpoint_filter_getter(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject viewpoint_filter_setter_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField7();
    }

    public static SubLObject viewpoint_filter_setter(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject viewpoint_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField8();
    }

    public static SubLObject viewpoint_type(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject viewpoint_active_p_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField9();
    }

    public static SubLObject viewpoint_active_p(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject viewpoint_effective_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField10();
    }

    public static SubLObject viewpoint_effective_fn(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject viewpoint_value_prompt_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField11();
    }

    public static SubLObject viewpoint_value_prompt_fn(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject viewpoint_value_update_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField12();
    }

    public static SubLObject viewpoint_value_update_fn(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject viewpoint_initial_filter_value_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField13();
    }

    public static SubLObject viewpoint_initial_filter_value(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject viewpoint_effective_fn_slotname_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.getField14();
    }

    public static SubLObject viewpoint_effective_fn_slotname(final SubLObject v_object) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject _csetf_viewpoint_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_viewpoint_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_viewpoint_summary_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_viewpoint_summary_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_viewpoint_linkable_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_viewpoint_linkable_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_viewpoint_linkname_prefix_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_viewpoint_linkname_prefix(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_viewpoint_filter_getter_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_viewpoint_filter_getter(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_viewpoint_filter_setter_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_viewpoint_filter_setter(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_viewpoint_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_viewpoint_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_viewpoint_active_p_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_viewpoint_active_p(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_viewpoint_effective_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_viewpoint_effective_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_viewpoint_value_prompt_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_viewpoint_value_prompt_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_viewpoint_value_update_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_viewpoint_value_update_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_viewpoint_initial_filter_value_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_viewpoint_initial_filter_value(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_viewpoint_effective_fn_slotname_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, VIEWPOINT_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_viewpoint_effective_fn_slotname(final SubLObject v_object, final SubLObject value) {
        assert NIL != viewpoint_p(v_object) : "! cb_viewpoint.viewpoint_p(v_object) " + "cb_viewpoint.viewpoint_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject make_viewpoint_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_viewpoint_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SUMMARY_NAME)) {
                            _csetf_viewpoint_summary_name(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LINKABLE_NAME)) {
                                _csetf_viewpoint_linkable_name(v_new, current_value);
                            } else {
                                if (pcase_var.eql($LINKNAME_PREFIX)) {
                                    _csetf_viewpoint_linkname_prefix(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($FILTER_GETTER)) {
                                        _csetf_viewpoint_filter_getter(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($FILTER_SETTER)) {
                                            _csetf_viewpoint_filter_setter(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($TYPE)) {
                                                _csetf_viewpoint_type(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($ACTIVE_P)) {
                                                    _csetf_viewpoint_active_p(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($EFFECTIVE_FN)) {
                                                        _csetf_viewpoint_effective_fn(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($VALUE_PROMPT_FN)) {
                                                            _csetf_viewpoint_value_prompt_fn(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($VALUE_UPDATE_FN)) {
                                                                _csetf_viewpoint_value_update_fn(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($INITIAL_FILTER_VALUE)) {
                                                                    _csetf_viewpoint_initial_filter_value(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($EFFECTIVE_FN_SLOTNAME)) {
                                                                        _csetf_viewpoint_effective_fn_slotname(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str_alt51$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_viewpoint(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cb_viewpoint.$viewpoint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_viewpoint_name(v_new, current_value);
            } else
                if (pcase_var.eql($SUMMARY_NAME)) {
                    _csetf_viewpoint_summary_name(v_new, current_value);
                } else
                    if (pcase_var.eql($LINKABLE_NAME)) {
                        _csetf_viewpoint_linkable_name(v_new, current_value);
                    } else
                        if (pcase_var.eql($LINKNAME_PREFIX)) {
                            _csetf_viewpoint_linkname_prefix(v_new, current_value);
                        } else
                            if (pcase_var.eql($FILTER_GETTER)) {
                                _csetf_viewpoint_filter_getter(v_new, current_value);
                            } else
                                if (pcase_var.eql($FILTER_SETTER)) {
                                    _csetf_viewpoint_filter_setter(v_new, current_value);
                                } else
                                    if (pcase_var.eql($TYPE)) {
                                        _csetf_viewpoint_type(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($ACTIVE_P)) {
                                            _csetf_viewpoint_active_p(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($EFFECTIVE_FN)) {
                                                _csetf_viewpoint_effective_fn(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($VALUE_PROMPT_FN)) {
                                                    _csetf_viewpoint_value_prompt_fn(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($VALUE_UPDATE_FN)) {
                                                        _csetf_viewpoint_value_update_fn(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($INITIAL_FILTER_VALUE)) {
                                                            _csetf_viewpoint_initial_filter_value(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($EFFECTIVE_FN_SLOTNAME)) {
                                                                _csetf_viewpoint_effective_fn_slotname(v_new, current_value);
                                                            } else {
                                                                Errors.error($str49$Invalid_slot__S_for_construction_, current_arg);
                                                            }












        }
        return v_new;
    }

    public static SubLObject visit_defstruct_viewpoint(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_VIEWPOINT, THIRTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, viewpoint_name(obj));
        funcall(visitor_fn, obj, $SLOT, $SUMMARY_NAME, viewpoint_summary_name(obj));
        funcall(visitor_fn, obj, $SLOT, $LINKABLE_NAME, viewpoint_linkable_name(obj));
        funcall(visitor_fn, obj, $SLOT, $LINKNAME_PREFIX, viewpoint_linkname_prefix(obj));
        funcall(visitor_fn, obj, $SLOT, $FILTER_GETTER, viewpoint_filter_getter(obj));
        funcall(visitor_fn, obj, $SLOT, $FILTER_SETTER, viewpoint_filter_setter(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE, viewpoint_type(obj));
        funcall(visitor_fn, obj, $SLOT, $ACTIVE_P, viewpoint_active_p(obj));
        funcall(visitor_fn, obj, $SLOT, $EFFECTIVE_FN, viewpoint_effective_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $VALUE_PROMPT_FN, viewpoint_value_prompt_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $VALUE_UPDATE_FN, viewpoint_value_update_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $INITIAL_FILTER_VALUE, viewpoint_initial_filter_value(obj));
        funcall(visitor_fn, obj, $SLOT, $EFFECTIVE_FN_SLOTNAME, viewpoint_effective_fn_slotname(obj));
        funcall(visitor_fn, obj, $END, MAKE_VIEWPOINT, THIRTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_viewpoint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_viewpoint(obj, visitor_fn);
    }

    public static final SubLObject find_viewpoint_alt(SubLObject name) {
        return find(name, $cb_viewpoint_table$.getGlobalValue(), symbol_function(EQUAL), symbol_function(VIEWPOINT_NAME), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject find_viewpoint(final SubLObject name) {
        return find(name, $cb_viewpoint_table$.getGlobalValue(), symbol_function(EQUAL), symbol_function(VIEWPOINT_NAME), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject active_filter_p_alt(SubLObject viewpoint_name) {
        {
            SubLObject viewpoint = find_viewpoint(viewpoint_name);
            if (NIL != viewpoint) {
                return viewpoint_active_p(viewpoint);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject active_filter_p(final SubLObject viewpoint_name) {
        final SubLObject viewpoint = find_viewpoint(viewpoint_name);
        if (NIL != viewpoint) {
            return viewpoint_active_p(viewpoint);
        }
        return NIL;
    }

    public static final SubLObject active_viewpoint_struct_p_alt(SubLObject viewpoint, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $viewpoint_type$.getDynamicValue();
        }
        if (NIL != type) {
            if ((NIL != active_filter_p(viewpoint)) && viewpoint_type(viewpoint).eql(type)) {
                return list(viewpoint);
            }
        } else {
            if (NIL != viewpoint_active_p(viewpoint)) {
                return list(viewpoint);
            }
        }
        return NIL;
    }

    public static SubLObject active_viewpoint_struct_p(final SubLObject viewpoint, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $viewpoint_type$.getDynamicValue();
        }
        if (NIL != type) {
            if ((NIL != active_filter_p(viewpoint)) && viewpoint_type(viewpoint).eql(type)) {
                return list(viewpoint);
            }
        } else
            if (NIL != viewpoint_active_p(viewpoint)) {
                return list(viewpoint);
            }

        return NIL;
    }

    public static final SubLObject clear_viewpoint_cache_alt() {
        $viewpoint_cache$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject clear_viewpoint_cache() {
        $viewpoint_cache$.setGlobalValue(NIL);
        return NIL;
    }

    public static final SubLObject active_filters_alt(SubLObject type) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cache_hit = assoc(type, $viewpoint_cache$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
                if (NIL != cache_hit) {
                    return cache_hit;
                } else {
                    {
                        SubLObject result = NIL;
                        {
                            SubLObject _prev_bind_0 = $viewpoint_type$.currentBinding(thread);
                            try {
                                $viewpoint_type$.bind(type, thread);
                                result = Mapping.mapcan(symbol_function(ACTIVE_VIEWPOINT_STRUCT_P), $cb_viewpoint_table$.getGlobalValue(), EMPTY_SUBL_OBJECT_ARRAY);
                            } finally {
                                $viewpoint_type$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL != result) {
                            $viewpoint_cache$.setGlobalValue(acons(type, result, $viewpoint_cache$.getGlobalValue()));
                        }
                        return result;
                    }
                }
            }
        }
    }

    public static SubLObject active_filters(SubLObject type) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cache_hit = assoc(type, $viewpoint_cache$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
        if (NIL != cache_hit) {
            return cache_hit;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $viewpoint_type$.currentBinding(thread);
        try {
            $viewpoint_type$.bind(type, thread);
            result = Mapping.mapcan(symbol_function(ACTIVE_VIEWPOINT_STRUCT_P), $cb_viewpoint_table$.getGlobalValue(), EMPTY_SUBL_OBJECT_ARRAY);
        } finally {
            $viewpoint_type$.rebind(_prev_bind_0, thread);
        }
        if (NIL != result) {
            $viewpoint_cache$.setGlobalValue(acons(type, result, $viewpoint_cache$.getGlobalValue()));
        }
        return result;
    }

    public static final SubLObject enable_filter_alt(SubLObject filter_name, SubLObject enable_p) {
        if (enable_p == UNPROVIDED) {
            enable_p = T;
        }
        clear_viewpoint_cache();
        {
            SubLObject viewpoint = find_viewpoint(filter_name);
            if (NIL != viewpoint) {
                _csetf_viewpoint_active_p(viewpoint, enable_p);
                return enable_p;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject enable_filter(final SubLObject filter_name, SubLObject enable_p) {
        if (enable_p == UNPROVIDED) {
            enable_p = T;
        }
        clear_viewpoint_cache();
        final SubLObject viewpoint = find_viewpoint(filter_name);
        if (NIL != viewpoint) {
            _csetf_viewpoint_active_p(viewpoint, enable_p);
            return enable_p;
        }
        return NIL;
    }

    public static final SubLObject doc_predicate_p_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != $cb_viewpoint_show_doc_preds$.getDynamicValue(thread)) && (NIL != cb_adornments.documentation_assertion_p(assertion))) || ((NIL != $cb_viewpoint_show_book_preds$.getDynamicValue(thread)) && (NIL != cb_adornments.bookkeeping_assertion_p(assertion))));
        }
    }

    public static SubLObject doc_predicate_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != $cb_viewpoint_show_doc_preds$.getDynamicValue(thread)) && (NIL != cb_adornments.documentation_assertion_p(assertion))) || ((NIL != $cb_viewpoint_show_book_preds$.getDynamicValue(thread)) && (NIL != cb_adornments.bookkeeping_assertion_p(assertion))));
    }

    /**
     * Define new viewpoint filters. keyword args include :name :type :active-p :effective-fn :value-prompt-fn and :value-update-fn
     */
    @LispMethod(comment = "Define new viewpoint filters. keyword args include :name :type :active-p :effective-fn :value-prompt-fn and :value-update-fn")
    public static final SubLObject defviewpoint_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt55);
            name = current.first();
            current = current.rest();
            {
                SubLObject arglist = current;
                SubLObject filtername = intern(format(NIL, $str_alt56$_A_FILTER, Strings.string_upcase(Strings.string(name), UNPROVIDED, UNPROVIDED)), UNPROVIDED);
                SubLObject gettername = intern(format(NIL, $str_alt57$CB__A, filtername), UNPROVIDED);
                SubLObject settername = intern(format(NIL, $str_alt58$SET__A, gettername), UNPROVIDED);
                SubLObject effective_fn_name = intern(format(NIL, $str_alt59$_A_EFFECTIVE_FN, name), UNPROVIDED);
                SubLObject type = cb_macros.extract_keyword($TYPE, arglist, UNPROVIDED);
                return list(PROGN, listS(DEFFILTERSET, filtername, $list_alt62), NIL != cb_macros.extract_keyword($EFFECTIVE_FN_SLOTNAME, arglist, UNPROVIDED) ? ((SubLObject) (type == $LIST_OF_FORMS ? ((SubLObject) (list(PROGN, list(DEFVIEWPOINT_INTERNAL, list(QUOTE, name), list(QUOTE, arglist), list(QUOTE, gettername), list(QUOTE, settername), list(QUOTE, effective_fn_name)), list(DEFINE, effective_fn_name, $list_alt67, $list_alt68, $list_alt69, listS(CLET, list(list(VIEWPOINT, list(FIND_VIEWPOINT, list(QUOTE, name)))), $list_alt72))))) : listS(DEFVIEWPOINT_INTERNAL, list(QUOTE, name), list(QUOTE, arglist), list(QUOTE, gettername), list(QUOTE, settername), $list_alt73))) : listS(DEFVIEWPOINT_INTERNAL, list(QUOTE, name), list(QUOTE, arglist), list(QUOTE, gettername), list(QUOTE, settername), $list_alt73));
            }
        }
    }

    /**
     * Define new viewpoint filters. keyword args include :name :type :active-p :effective-fn :value-prompt-fn and :value-update-fn
     */
    @LispMethod(comment = "Define new viewpoint filters. keyword args include :name :type :active-p :effective-fn :value-prompt-fn and :value-update-fn")
    public static SubLObject defviewpoint(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        name = current.first();
        final SubLObject arglist;
        current = arglist = current.rest();
        final SubLObject filtername = intern(format(NIL, $str59$_A_FILTER, Strings.string_upcase(Strings.string(name), UNPROVIDED, UNPROVIDED)), UNPROVIDED);
        final SubLObject gettername = intern(format(NIL, $str60$CB__A, filtername), UNPROVIDED);
        final SubLObject settername = intern(format(NIL, $str61$SET__A, gettername), UNPROVIDED);
        final SubLObject effective_fn_name = intern(format(NIL, $str62$_A_EFFECTIVE_FN, name), UNPROVIDED);
        final SubLObject type = cb_macros.extract_keyword($TYPE, arglist, UNPROVIDED);
        return list(PROGN, listS(DEFFILTERSET, filtername, $list65), NIL != cb_macros.extract_keyword($EFFECTIVE_FN_SLOTNAME, arglist, UNPROVIDED) ? type == $LIST_OF_FORMS ? list(PROGN, list(DEFVIEWPOINT_INTERNAL, list(QUOTE, name), list(QUOTE, arglist), list(QUOTE, gettername), list(QUOTE, settername), list(QUOTE, effective_fn_name)), list(DEFINE, effective_fn_name, $list70, $list71, $list72, listS(CLET, list(list(VIEWPOINT, list(FIND_VIEWPOINT, list(QUOTE, name)))), $list75))) : listS(DEFVIEWPOINT_INTERNAL, list(QUOTE, name), list(QUOTE, arglist), list(QUOTE, gettername), list(QUOTE, settername), $list76) : listS(DEFVIEWPOINT_INTERNAL, list(QUOTE, name), list(QUOTE, arglist), list(QUOTE, gettername), list(QUOTE, settername), $list76));
    }

    public static final SubLObject defviewpoint_internal_alt(SubLObject name, SubLObject arglist, SubLObject gettername, SubLObject settername, SubLObject effective_fn_name) {
        clear_viewpoint_cache();
        {
            SubLObject old = $cb_viewpoint_table$.getGlobalValue();
            SubLObject v_new = make_viewpoint(arglist);
            _csetf_viewpoint_name(v_new, name);
            if (NIL == viewpoint_summary_name(v_new)) {
                _csetf_viewpoint_summary_name(v_new, name);
            }
            _csetf_viewpoint_filter_getter(v_new, gettername);
            _csetf_viewpoint_filter_setter(v_new, settername);
            funcall(settername, viewpoint_initial_filter_value(v_new));
            $cb_viewpoint_table$.setGlobalValue(cons(v_new, delete(name, old, symbol_function(EQUAL), symbol_function(VIEWPOINT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            $cb_viewpoint_summary_alist$.setGlobalValue(acons(viewpoint_summary_name(v_new), cons(v_new, delete(name, assoc(viewpoint_summary_name(v_new), $cb_viewpoint_summary_alist$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest(), symbol_function(EQUAL), symbol_function(VIEWPOINT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)), delete(viewpoint_summary_name(v_new), $cb_viewpoint_summary_alist$.getGlobalValue(), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            if (NIL != effective_fn_name) {
                _csetf_viewpoint_effective_fn(v_new, effective_fn_name);
            }
        }
        return NIL;
    }

    public static SubLObject defviewpoint_internal(final SubLObject name, final SubLObject arglist, final SubLObject gettername, final SubLObject settername, final SubLObject effective_fn_name) {
        clear_viewpoint_cache();
        final SubLObject old = $cb_viewpoint_table$.getGlobalValue();
        final SubLObject v_new = make_viewpoint(arglist);
        _csetf_viewpoint_name(v_new, name);
        if (NIL == viewpoint_summary_name(v_new)) {
            _csetf_viewpoint_summary_name(v_new, name);
        }
        _csetf_viewpoint_filter_getter(v_new, gettername);
        _csetf_viewpoint_filter_setter(v_new, settername);
        funcall(settername, viewpoint_initial_filter_value(v_new));
        $cb_viewpoint_table$.setGlobalValue(cons(v_new, delete(name, old, symbol_function(EQUAL), symbol_function(VIEWPOINT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        $cb_viewpoint_summary_alist$.setGlobalValue(acons(viewpoint_summary_name(v_new), cons(v_new, delete(name, assoc(viewpoint_summary_name(v_new), $cb_viewpoint_summary_alist$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest(), symbol_function(EQUAL), symbol_function(VIEWPOINT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)), delete(viewpoint_summary_name(v_new), $cb_viewpoint_summary_alist$.getGlobalValue(), symbol_function(EQUAL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        if (NIL != effective_fn_name) {
            _csetf_viewpoint_effective_fn(v_new, effective_fn_name);
        }
        return NIL;
    }

    /**
     * call only on active viewpoints.
     */
    @LispMethod(comment = "call only on active viewpoints.")
    public static final SubLObject display_viewpoint_alt(SubLObject viewpoint, SubLObject for_summary) {
        if (for_summary == UNPROVIDED) {
            for_summary = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != for_summary) {
                {
                    SubLObject checkbox_name = format(NIL, $str_alt75$activate__A, viewpoint_name(viewpoint));
                    html_checkbox_input(checkbox_name, checkbox_name, active_viewpoint_struct_p(viewpoint, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                }
            } else {
                html_newline(UNPROVIDED);
                html_indent(TWO_INTEGER);
            }
            if (NIL != viewpoint_linkname_prefix(viewpoint)) {
                html_princ(viewpoint_linkname_prefix(viewpoint));
            }
            cb_form(viewpoint_linkable_name(viewpoint), UNPROVIDED, UNPROVIDED);
            html_princ($str_alt76$_);
            {
                SubLObject type = viewpoint_type(viewpoint);
                SubLObject pcase_var = type;
                if (pcase_var.eql($LIST_OF_FORMS)) {
                    {
                        SubLObject cdolist_list_var = funcall(viewpoint_filter_getter(viewpoint));
                        SubLObject thingy = NIL;
                        for (thingy = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thingy = cdolist_list_var.first()) {
                            html_glyph($NBSP, UNPROVIDED);
                            cb_form(thingy, UNPROVIDED, UNPROVIDED);
                            if (NIL != for_summary) {
                                html_newline(UNPROVIDED);
                            } else {
                                html_indent(UNPROVIDED);
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($SINGLE_SIMPLE_DATE)) {
                        html_glyph($NBSP, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt79$_D, funcall(viewpoint_filter_getter(viewpoint)));
                    }
                }
            }
            if (NIL != for_summary) {
                html_indent(TWO_INTEGER);
                cb_link($EDIT_VIEWPOINT, viewpoint, $$$Edit, cb_index_identifier($index_hook$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
            }
            if (NIL != for_summary) {
                html_newline(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * call only on active viewpoints.
     */
    @LispMethod(comment = "call only on active viewpoints.")
    public static SubLObject display_viewpoint(final SubLObject viewpoint, SubLObject for_summary) {
        if (for_summary == UNPROVIDED) {
            for_summary = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != for_summary) {
            final SubLObject checkbox_name = format(NIL, $str78$activate__A, viewpoint_name(viewpoint));
            html_checkbox_input(checkbox_name, checkbox_name, active_viewpoint_struct_p(viewpoint, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
        } else {
            html_newline(UNPROVIDED);
            html_indent(TWO_INTEGER);
        }
        if (NIL != viewpoint_linkname_prefix(viewpoint)) {
            html_princ(viewpoint_linkname_prefix(viewpoint));
        }
        cb_form(viewpoint_linkable_name(viewpoint), UNPROVIDED, UNPROVIDED);
        html_princ($str79$_);
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = viewpoint_type(viewpoint);
        if (pcase_var.eql($LIST_OF_FORMS)) {
            SubLObject cdolist_list_var = funcall(viewpoint_filter_getter(viewpoint));
            SubLObject thingy = NIL;
            thingy = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_glyph($NBSP, UNPROVIDED);
                cb_form(thingy, UNPROVIDED, UNPROVIDED);
                if (NIL != for_summary) {
                    html_newline(UNPROVIDED);
                } else {
                    html_indent(UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                thingy = cdolist_list_var.first();
            } 
        } else
            if (pcase_var.eql($SINGLE_SIMPLE_DATE)) {
                html_glyph($NBSP, UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str82$_D, funcall(viewpoint_filter_getter(viewpoint)));
            }

        if (NIL != for_summary) {
            html_indent(TWO_INTEGER);
            cb_link($EDIT_VIEWPOINT, viewpoint, $$$Edit, cb_index_identifier($index_hook$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
        }
        if (NIL != for_summary) {
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Puts up the viewpoint filters in the index
     */
    @LispMethod(comment = "Puts up the viewpoint filters in the index")
    public static final SubLObject cb_display_viewpoint_filters_alt() {
        if (NIL != active_filters(UNPROVIDED)) {
            html_princ($str_alt76$_);
            Mapping.mapc(symbol_function(DISPLAY_VIEWPOINT), active_filters(UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY);
        }
        return NIL;
    }

    /**
     * Puts up the viewpoint filters in the index
     */
    @LispMethod(comment = "Puts up the viewpoint filters in the index")
    public static SubLObject cb_display_viewpoint_filters() {
        if (NIL != active_filters(UNPROVIDED)) {
            html_princ($str79$_);
            Mapping.mapc(symbol_function(DISPLAY_VIEWPOINT), active_filters(UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY);
        }
        return NIL;
    }

    public static final SubLObject prompt_with_completion_alt(SubLObject button, SubLObject type, SubLObject v_default, SubLObject size) {
        html_newline(UNPROVIDED);
        html_indent(THREE_INTEGER);
        html_complete.html_complete_button(button, $$$Complete, type, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_text_input(button, v_default, size);
        html_indent(UNPROVIDED);
        html_script_utilities.html_clear_input_button(button, UNPROVIDED);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject prompt_with_completion(final SubLObject button, final SubLObject type, final SubLObject v_default, final SubLObject size) {
        html_newline(UNPROVIDED);
        html_indent(THREE_INTEGER);
        html_complete.html_complete_button(button, $$$Complete, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_text_input(button, v_default, size);
        html_indent(UNPROVIDED);
        html_script_utilities.html_clear_input_button(button, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        return NIL;
    }

    /**
     * Use from within a main document that offers completion!
     */
    @LispMethod(comment = "Use from within a main document that offers completion!")
    public static final SubLObject cb_prompt_cyclists_alt(SubLObject id, SubLObject default1, SubLObject default2, SubLObject default3) {
        if (default1 == UNPROVIDED) {
            default1 = $str_alt84$;
        }
        if (default2 == UNPROVIDED) {
            default2 = $str_alt84$;
        }
        if (default3 == UNPROVIDED) {
            default3 = $str_alt84$;
        }
        prompt_with_completion(format(NIL, $str_alt85$cb_show_cyclist__A, id), $$Cyclist, default1, $int$24);
        prompt_with_completion(format(NIL, $str_alt88$cb_show_cyclist1__A, id), $$Cyclist, default2, $int$24);
        prompt_with_completion(format(NIL, $str_alt89$cb_show_cyclist2__A, id), $$Cyclist, default3, $int$24);
        return NIL;
    }

    /**
     * Use from within a main document that offers completion!
     */
    @LispMethod(comment = "Use from within a main document that offers completion!")
    public static SubLObject cb_prompt_cyclists(final SubLObject id, SubLObject default1, SubLObject default2, SubLObject default3) {
        if (default1 == UNPROVIDED) {
            default1 = $str87$;
        }
        if (default2 == UNPROVIDED) {
            default2 = $str87$;
        }
        if (default3 == UNPROVIDED) {
            default3 = $str87$;
        }
        prompt_with_completion(format(NIL, $str88$cb_show_cyclist__A, id), $$Cyclist, default1, $int$24);
        prompt_with_completion(format(NIL, $str91$cb_show_cyclist1__A, id), $$Cyclist, default2, $int$24);
        prompt_with_completion(format(NIL, $str92$cb_show_cyclist2__A, id), $$Cyclist, default3, $int$24);
        return NIL;
    }

    public static final SubLObject extract_fort_input_alt(SubLObject key, SubLObject args, SubLObject typestring) {
        {
            SubLObject value = string_utilities.trim_whitespace(html_extract_input(key, args));
            if ($str_alt84$.equalp(value) || $dash_nil$.getGlobalValue().equalp(value)) {
                value = NIL;
            } else {
                value = cb_guess_fort(value, UNPROVIDED);
                if (NIL == forts.fort_p(value)) {
                    cb_error($str_alt91$Unknown__A___S, typestring, value, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
            }
            return value;
        }
    }

    public static SubLObject extract_fort_input(final SubLObject key, final SubLObject args, final SubLObject typestring) {
        SubLObject value = string_utilities.trim_whitespace(html_extract_input(key, args));
        if ($str87$.equalp(value) || $dash_nil$.getGlobalValue().equalp(value)) {
            value = NIL;
        } else {
            value = cb_guess_fort(value, UNPROVIDED);
            if (NIL == forts.fort_p(value)) {
                cb_error($str94$Unknown__A___S, typestring, value, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
        }
        return value;
    }

    /**
     * retrive the info prompted for above; call in the handler function.
     */
    @LispMethod(comment = "retrive the info prompted for above; call in the handler function.")
    public static final SubLObject cb_get_cyclists_alt(SubLObject id, SubLObject args) {
        return delete(NIL, list(extract_fort_input(format(NIL, $str_alt85$cb_show_cyclist__A, id), args, $$$cyclist), extract_fort_input(format(NIL, $str_alt88$cb_show_cyclist1__A, id), args, $$$cyclist), extract_fort_input(format(NIL, $str_alt89$cb_show_cyclist2__A, id), args, $$$cyclist)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * retrive the info prompted for above; call in the handler function.
     */
    @LispMethod(comment = "retrive the info prompted for above; call in the handler function.")
    public static SubLObject cb_get_cyclists(final SubLObject id, final SubLObject args) {
        return delete(NIL, list(extract_fort_input(format(NIL, $str88$cb_show_cyclist__A, id), args, $$$cyclist), extract_fort_input(format(NIL, $str91$cb_show_cyclist1__A, id), args, $$$cyclist), extract_fort_input(format(NIL, $str92$cb_show_cyclist2__A, id), args, $$$cyclist)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Use from within a main document that offers completion!
     */
    @LispMethod(comment = "Use from within a main document that offers completion!")
    public static final SubLObject cb_prompt_projects_alt(SubLObject id, SubLObject default1, SubLObject default2, SubLObject default3) {
        if (default1 == UNPROVIDED) {
            default1 = $dash_nil$.getGlobalValue();
        }
        if (default2 == UNPROVIDED) {
            default2 = $dash_nil$.getGlobalValue();
        }
        if (default3 == UNPROVIDED) {
            default3 = $dash_nil$.getGlobalValue();
        }
        {
            SubLObject all_projects = cons($dash_nil$.getGlobalValue(), kb_mapping_utilities.pred_values_in_any_mt($$Cyc_BasedProject, $$isa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
            html_select_from_list(format(NIL, $str_alt95$project1__A, id), default1, all_projects, UNPROVIDED);
            html_select_from_list(format(NIL, $str_alt96$project2__A, id), default2, all_projects, UNPROVIDED);
            html_select_from_list(format(NIL, $str_alt97$project3__A, id), default3, all_projects, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Use from within a main document that offers completion!
     */
    @LispMethod(comment = "Use from within a main document that offers completion!")
    public static SubLObject cb_prompt_projects(final SubLObject id, SubLObject default1, SubLObject default2, SubLObject default3) {
        if (default1 == UNPROVIDED) {
            default1 = $dash_nil$.getGlobalValue();
        }
        if (default2 == UNPROVIDED) {
            default2 = $dash_nil$.getGlobalValue();
        }
        if (default3 == UNPROVIDED) {
            default3 = $dash_nil$.getGlobalValue();
        }
        final SubLObject all_projects = cons($dash_nil$.getGlobalValue(), kb_mapping_utilities.pred_values_in_any_mt($$Cyc_BasedProject, $$isa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
        html_select_from_list(format(NIL, $str98$project1__A, id), default1, all_projects, UNPROVIDED);
        html_select_from_list(format(NIL, $str99$project2__A, id), default2, all_projects, UNPROVIDED);
        html_select_from_list(format(NIL, $str100$project3__A, id), default3, all_projects, UNPROVIDED);
        return NIL;
    }

    /**
     * retrive the info prompted for above; call in the handler function.
     */
    @LispMethod(comment = "retrive the info prompted for above; call in the handler function.")
    public static final SubLObject cb_get_projects_alt(SubLObject id, SubLObject args) {
        return delete(NIL, list(extract_fort_input(format(NIL, $str_alt95$project1__A, id), args, $$$project), extract_fort_input(format(NIL, $str_alt96$project2__A, id), args, $$$project), extract_fort_input(format(NIL, $str_alt97$project3__A, id), args, $$$project)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * retrive the info prompted for above; call in the handler function.
     */
    @LispMethod(comment = "retrive the info prompted for above; call in the handler function.")
    public static SubLObject cb_get_projects(final SubLObject id, final SubLObject args) {
        return delete(NIL, list(extract_fort_input(format(NIL, $str98$project1__A, id), args, $$$project), extract_fort_input(format(NIL, $str99$project2__A, id), args, $$$project), extract_fort_input(format(NIL, $str100$project3__A, id), args, $$$project)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject display_viewpoint_1_alt(SubLObject arg) {
        return display_viewpoint(arg, T);
    }

    public static SubLObject display_viewpoint_1(final SubLObject arg) {
        return display_viewpoint(arg, T);
    }

    /**
     * Displays an HTML page that allows the user to change the current MT and other filters.
     */
    @LispMethod(comment = "Displays an HTML page that allows the user to change the current MT and other filters.")
    public static final SubLObject cb_viewpoint_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject index_spec = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt101);
                index_spec = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject index_hook = cb_guess_index(index_spec);
                        if (NIL == cb_index_hook_p(index_hook)) {
                            cb_error($str_alt102$_a_does_not_specify_an_index, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            return NIL;
                        }
                        {
                            SubLObject title_var = $$$Viewpoint_Filter_Summary;
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                                try {
                                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
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
                                        SubLObject _prev_bind_0_3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                                html_markup($str_alt106$yui_skin_sam);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_hidden_input($str_alt107$cb_viewpoint_summary_handler, T, UNPROVIDED);
                                                                cb_help_preamble($CB_VIEWPOINT, UNPROVIDED, UNPROVIDED);
                                                                html_newline(TWO_INTEGER);
                                                                html_reset_input($$$Current_Values);
                                                                html_indent(UNPROVIDED);
                                                                html_submit_input($$$Update_Filter_Settings, UNPROVIDED, UNPROVIDED);
                                                                html_newline(UNPROVIDED);
                                                                cb_adornments.cb_c_index_adornments(index_hook);
                                                                html_newline(UNPROVIDED);
                                                                html_checkbox_input($str_alt110$always_show_comments, $str_alt110$always_show_comments, $cb_viewpoint_show_doc_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                html_glyph($NBSP, UNPROVIDED);
                                                                html_princ($str_alt111$Always_show_comments__regardless_);
                                                                html_newline(UNPROVIDED);
                                                                html_checkbox_input($str_alt112$always_show_bookkeeping, $str_alt112$always_show_bookkeeping, $cb_viewpoint_show_book_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                html_glyph($NBSP, UNPROVIDED);
                                                                html_princ($str_alt113$Always_show_bookkeeping_predicate);
                                                                html_newline(TWO_INTEGER);
                                                                {
                                                                    SubLObject cdolist_list_var = $cb_viewpoint_summary_alist$.getGlobalValue();
                                                                    SubLObject viewpoint_summaries = NIL;
                                                                    for (viewpoint_summaries = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , viewpoint_summaries = cdolist_list_var.first()) {
                                                                        {
                                                                            SubLObject _prev_bind_0_6 = $index_hook$.currentBinding(thread);
                                                                            try {
                                                                                $index_hook$.bind(index_hook, thread);
                                                                                if (NIL != endp(cddr(viewpoint_summaries))) {
                                                                                    display_viewpoint(cadr(viewpoint_summaries), T);
                                                                                } else {
                                                                                    Mapping.mapc(symbol_function(DISPLAY_VIEWPOINT_1), viewpoint_summaries.rest(), EMPTY_SUBL_OBJECT_ARRAY);
                                                                                }
                                                                            } finally {
                                                                                $index_hook$.rebind(_prev_bind_0_6, thread);
                                                                            }
                                                                        }
                                                                        html_newline(UNPROVIDED);
                                                                    }
                                                                }
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    }
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    html_copyright_notice();
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_3, thread);
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
                    cdestructuring_bind_error(datum, $list_alt101);
                }
            }
            return NIL;
        }
    }

    /**
     * Displays an HTML page that allows the user to change the current MT and other filters.
     */
    @LispMethod(comment = "Displays an HTML page that allows the user to change the current MT and other filters.")
    public static SubLObject cb_viewpoint(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = args;
        SubLObject index_spec = NIL;
        destructuring_bind_must_consp(current, datum, $list104);
        index_spec = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject index_hook = cb_guess_index(index_spec);
            if (NIL == cb_index_hook_p(index_hook)) {
                cb_error($str105$_a_does_not_specify_an_index, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            final SubLObject title_var = $$$Viewpoint_Filter_Summary;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str107$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str108$_meta_http_equiv__X_UA_Compatible);
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
                        html_markup($str113$yui_skin_sam);
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
                                html_hidden_input($str119$cb_viewpoint_summary_handler, T, UNPROVIDED);
                                cb_help_preamble($CB_VIEWPOINT, UNPROVIDED, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                html_reset_input($$$Current_Values);
                                html_indent(UNPROVIDED);
                                html_submit_input($$$Update_Filter_Settings, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                cb_adornments.cb_c_index_adornments(index_hook);
                                html_newline(UNPROVIDED);
                                html_checkbox_input($str122$always_show_comments, $str122$always_show_comments, $cb_viewpoint_show_doc_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_glyph($NBSP, UNPROVIDED);
                                html_princ($str123$Always_show_comments__regardless_);
                                html_newline(UNPROVIDED);
                                html_checkbox_input($str124$always_show_bookkeeping, $str124$always_show_bookkeeping, $cb_viewpoint_show_book_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_glyph($NBSP, UNPROVIDED);
                                html_princ($str125$Always_show_bookkeeping_predicate);
                                html_newline(TWO_INTEGER);
                                SubLObject cdolist_list_var = $cb_viewpoint_summary_alist$.getGlobalValue();
                                SubLObject viewpoint_summaries = NIL;
                                viewpoint_summaries = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject _prev_bind_0_$6 = $index_hook$.currentBinding(thread);
                                    try {
                                        $index_hook$.bind(index_hook, thread);
                                        if (NIL != endp(cddr(viewpoint_summaries))) {
                                            display_viewpoint(cadr(viewpoint_summaries), T);
                                        } else {
                                            Mapping.mapc(symbol_function(DISPLAY_VIEWPOINT_1), viewpoint_summaries.rest(), EMPTY_SUBL_OBJECT_ARRAY);
                                        }
                                    } finally {
                                        $index_hook$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    html_newline(UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    viewpoint_summaries = cdolist_list_var.first();
                                } 
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
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
        } else {
            cdestructuring_bind_error(datum, $list104);
        }
        return NIL;
    }

    /**
     * Edit a specific summary
     */
    @LispMethod(comment = "Edit a specific summary")
    public static final SubLObject cb_ev_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject summary_name = NIL;
                SubLObject index_spec = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt116);
                summary_name = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt116);
                index_spec = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject index_hook = cb_guess_index(index_spec);
                        SubLObject viewpoints = assoc(intern(summary_name, UNPROVIDED), $cb_viewpoint_summary_alist$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
                        if (NIL == cb_index_hook_p(index_hook)) {
                            cb_error($str_alt102$_a_does_not_specify_an_index, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            return NIL;
                        }
                        {
                            SubLObject title_var = $$$Viewpoint_Filters;
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                                try {
                                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
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
                                    html_complete.html_complete_script();
                                    html_complete.html_autocomplete_css();
                                    html_complete.html_autocomplete_scripts();
                                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                                html_markup($str_alt106$yui_skin_sam);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_hidden_input($str_alt118$cb_viewpoint_handler, list(summary_name, index_spec), UNPROVIDED);
                                                                cb_back_button(UNPROVIDED, UNPROVIDED);
                                                                html_indent(UNPROVIDED);
                                                                html_reset_input($$$Current_Values);
                                                                html_indent(UNPROVIDED);
                                                                html_submit_input($$$Update_Filter_Settings, UNPROVIDED, UNPROVIDED);
                                                                html_newline(UNPROVIDED);
                                                                {
                                                                    SubLObject cdolist_list_var = viewpoints;
                                                                    SubLObject viewpoint = NIL;
                                                                    for (viewpoint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , viewpoint = cdolist_list_var.first()) {
                                                                        if (NIL != viewpoint_value_prompt_fn(viewpoint)) {
                                                                            funcall(viewpoint_value_prompt_fn(viewpoint), viewpoint, index_hook);
                                                                        }
                                                                    }
                                                                }
                                                                html_newline(UNPROVIDED);
                                                                html_hr(UNPROVIDED, UNPROVIDED);
                                                                html_newline(UNPROVIDED);
                                                                html_reset_input($$$Current_Values);
                                                                html_indent(UNPROVIDED);
                                                                html_submit_input($$$Update_Filter_Settings, UNPROVIDED, UNPROVIDED);
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    }
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    html_copyright_notice();
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_7, thread);
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
                    cdestructuring_bind_error(datum, $list_alt116);
                }
            }
            return NIL;
        }
    }

    /**
     * Edit a specific summary
     */
    @LispMethod(comment = "Edit a specific summary")
    public static SubLObject cb_ev(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = args;
        SubLObject summary_name = NIL;
        SubLObject index_spec = NIL;
        destructuring_bind_must_consp(current, datum, $list129);
        summary_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list129);
        index_spec = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject index_hook = cb_guess_index(index_spec);
            final SubLObject viewpoints = assoc(intern(summary_name, UNPROVIDED), $cb_viewpoint_summary_alist$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
            if (NIL == cb_index_hook_p(index_hook)) {
                cb_error($str105$_a_does_not_specify_an_index, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            final SubLObject title_var = $$$Viewpoint_Filters;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str107$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str108$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str113$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
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
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str131$cb_viewpoint_handler, list(summary_name, index_spec), UNPROVIDED);
                                cb_back_button(UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_reset_input($$$Current_Values);
                                html_indent(UNPROVIDED);
                                html_submit_input($$$Update_Filter_Settings, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                SubLObject cdolist_list_var = viewpoints;
                                SubLObject viewpoint = NIL;
                                viewpoint = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (NIL != viewpoint_value_prompt_fn(viewpoint)) {
                                        funcall(viewpoint_value_prompt_fn(viewpoint), viewpoint, index_hook);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    viewpoint = cdolist_list_var.first();
                                } 
                                html_newline(UNPROVIDED);
                                html_hr(UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                html_reset_input($$$Current_Values);
                                html_indent(UNPROVIDED);
                                html_submit_input($$$Update_Filter_Settings, UNPROVIDED, UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(datum, $list129);
        }
        return NIL;
    }

    public static final SubLObject cb_viewpoint_summary_handler_alt(SubLObject args) {
        $cb_viewpoint_show_doc_preds$.setDynamicValue(makeBoolean(NIL != html_extract_input($str_alt110$always_show_comments, args)));
        $cb_viewpoint_show_book_preds$.setDynamicValue(makeBoolean(NIL != html_extract_input($str_alt112$always_show_bookkeeping, args)));
        {
            SubLObject cdolist_list_var = $cb_viewpoint_table$.getGlobalValue();
            SubLObject viewpoint = NIL;
            for (viewpoint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , viewpoint = cdolist_list_var.first()) {
                _csetf_viewpoint_active_p(viewpoint, makeBoolean(NIL != html_extract_input(format(NIL, $str_alt75$activate__A, viewpoint_name(viewpoint)), args)));
            }
        }
        clear_viewpoint_cache();
        cb_message_page_with_history($$$Summary_filters_have_been_changed, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_viewpoint_summary_handler(final SubLObject args) {
        $cb_viewpoint_show_doc_preds$.setDynamicValue(makeBoolean(NIL != html_extract_input($str122$always_show_comments, args)));
        $cb_viewpoint_show_book_preds$.setDynamicValue(makeBoolean(NIL != html_extract_input($str124$always_show_bookkeeping, args)));
        SubLObject cdolist_list_var = $cb_viewpoint_table$.getGlobalValue();
        SubLObject viewpoint = NIL;
        viewpoint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            _csetf_viewpoint_active_p(viewpoint, makeBoolean(NIL != html_extract_input(format(NIL, $str78$activate__A, viewpoint_name(viewpoint)), args)));
            cdolist_list_var = cdolist_list_var.rest();
            viewpoint = cdolist_list_var.first();
        } 
        clear_viewpoint_cache();
        cb_message_page_with_history($$$Summary_filters_have_been_changed, UNPROVIDED);
        return NIL;
    }

    /**
     * Handles the selection that the user has made about their new MT or other filters.
     */
    @LispMethod(comment = "Handles the selection that the user has made about their new MT or other filters.")
    public static final SubLObject cb_viewpoint_handler_alt(SubLObject args) {
        {
            SubLObject input = read_from_string(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject summary_name = Strings.string(input.first());
            SubLObject index_spec = cadr(input);
            SubLObject viewpoints = assoc(intern(summary_name, UNPROVIDED), $cb_viewpoint_summary_alist$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
            SubLObject cdolist_list_var = viewpoints;
            SubLObject viewpoint = NIL;
            for (viewpoint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , viewpoint = cdolist_list_var.first()) {
                if (NIL != viewpoint_value_update_fn(viewpoint)) {
                    funcall(viewpoint_value_update_fn(viewpoint), viewpoint, args);
                }
            }
            clear_viewpoint_cache();
            cb_viewpoint(list(index_spec));
        }
        return NIL;
    }

    /**
     * Handles the selection that the user has made about their new MT or other filters.
     */
    @LispMethod(comment = "Handles the selection that the user has made about their new MT or other filters.")
    public static SubLObject cb_viewpoint_handler(final SubLObject args) {
        final SubLObject input = read_from_string(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject summary_name = Strings.string(input.first());
        final SubLObject index_spec = cadr(input);
        SubLObject cdolist_list_var;
        final SubLObject viewpoints = cdolist_list_var = assoc(intern(summary_name, UNPROVIDED), $cb_viewpoint_summary_alist$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
        SubLObject viewpoint = NIL;
        viewpoint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != viewpoint_value_update_fn(viewpoint)) {
                funcall(viewpoint_value_update_fn(viewpoint), viewpoint, args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            viewpoint = cdolist_list_var.first();
        } 
        clear_viewpoint_cache();
        cb_viewpoint(list(index_spec));
        return NIL;
    }

    public static final SubLObject cb_link_viewpoint_alt(SubLObject index_hook, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt123$_Viewpoint_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt125$cb_viewpoint__A, cb_index_identifier(index_hook));
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

    public static SubLObject cb_link_viewpoint(final SubLObject index_hook, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str136$_Viewpoint_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str138$cb_viewpoint__A, cb_index_identifier(index_hook));
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

    public static final SubLObject common_prompt_prefix_alt(SubLObject viewpoint, SubLObject index_hook) {
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        if (NIL != viewpoint_linkname_prefix(viewpoint)) {
            html_princ(viewpoint_linkname_prefix(viewpoint));
        }
        html_princ($str_alt128$_);
        cb_form(viewpoint_linkable_name(viewpoint), UNPROVIDED, UNPROVIDED);
        html_princ($str_alt129$_Filter);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject common_prompt_prefix(final SubLObject viewpoint, final SubLObject index_hook) {
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        if (NIL != viewpoint_linkname_prefix(viewpoint)) {
            html_princ(viewpoint_linkname_prefix(viewpoint));
        }
        html_princ($$$_);
        cb_form(viewpoint_linkable_name(viewpoint), UNPROVIDED, UNPROVIDED);
        html_princ($$$_Filter);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject prompt_for_list_of_cyclists_alt(SubLObject viewpoint, SubLObject index_hook) {
        common_prompt_prefix(viewpoint, index_hook);
        html_indent(TWO_INTEGER);
        html_princ($str_alt130$_Only_those_terms_whose_);
        cb_form(viewpoint_linkable_name(viewpoint), UNPROVIDED, UNPROVIDED);
        html_princ($str_alt131$_field_has_a_value_equal_to_a_ter);
        html_newline(UNPROVIDED);
        apply(symbol_function(CB_PROMPT_CYCLISTS), cons(viewpoint_name(viewpoint), funcall(viewpoint_filter_getter(viewpoint))));
        return NIL;
    }

    public static SubLObject prompt_for_list_of_cyclists(final SubLObject viewpoint, final SubLObject index_hook) {
        common_prompt_prefix(viewpoint, index_hook);
        html_indent(TWO_INTEGER);
        html_princ($str143$_Only_those_terms_whose_);
        cb_form(viewpoint_linkable_name(viewpoint), UNPROVIDED, UNPROVIDED);
        html_princ($str144$_field_has_a_value_equal_to_a_ter);
        html_newline(UNPROVIDED);
        apply(symbol_function(CB_PROMPT_CYCLISTS), cons(viewpoint_name(viewpoint), funcall(viewpoint_filter_getter(viewpoint))));
        return NIL;
    }

    public static final SubLObject prompt_for_date_alt(SubLObject viewpoint, SubLObject index_hook) {
        common_prompt_prefix(viewpoint, index_hook);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($$$Activate_Filter);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_indent(SIX_INTEGER);
        html_checkbox_input(format(NIL, $str_alt134$all_dates__A, viewpoint_name(viewpoint)), $$$no, viewpoint_active_p(viewpoint), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(FOUR_INTEGER);
        prompt_for_simple_date(funcall(viewpoint_filter_getter(viewpoint)), format(NIL, $str_alt136$cb_show_start__A, viewpoint_name(viewpoint)));
        return NIL;
    }

    public static SubLObject prompt_for_date(final SubLObject viewpoint, final SubLObject index_hook) {
        common_prompt_prefix(viewpoint, index_hook);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($$$Activate_Filter);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_indent(SIX_INTEGER);
        html_checkbox_input(format(NIL, $str147$all_dates__A, viewpoint_name(viewpoint)), $$$no, viewpoint_active_p(viewpoint), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(FOUR_INTEGER);
        prompt_for_simple_date(funcall(viewpoint_filter_getter(viewpoint)), format(NIL, $str149$cb_show_start__A, viewpoint_name(viewpoint)));
        return NIL;
    }

    public static final SubLObject prompt_for_mt_alt(SubLObject viewpoint, SubLObject index_hook) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            common_prompt_prefix(viewpoint, index_hook);
            html_newline(UNPROVIDED);
            {
                SubLObject relevant_mts = kb_indexing.mts_of_indexed_term(index_hook);
                SubLObject temp_list = copy_list(relevant_mts);
                SubLObject mts_list = kb_utilities.sort_terms(union(temp_list, copy_list(cb_mts_filter()), UNPROVIDED, UNPROVIDED), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                    SubLObject _prev_bind_1 = html_macros.$html_indent_table_max$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$html_indent_table_max$.bind(THREE_INTEGER, thread);
                        {
                            SubLObject indent = ZERO_INTEGER;
                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent_row_internal(indent);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (NIL != span) {
                                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(span);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_radio_input($$$all, $$$yes, makeBoolean(NIL == active_filter_p(MTS)));
                                            html_indent(UNPROVIDED);
                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_princ($$$All_Mts);
                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_newline(UNPROVIDED);
                                            html_radio_input($$$all, $$$no, active_filter_p(MTS));
                                            html_indent(UNPROVIDED);
                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_princ($$$Specify_Mts);
                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                        {
                            SubLObject indent = ONE_INTEGER;
                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent_row_internal(indent);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (NIL != span) {
                                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(span);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_checkbox_input($str_alt142$use_genl_mt, $$$yes, cb_mts_filter_use_genlmt(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_indent(UNPROVIDED);
                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            html_princ($$$Include_All_Genl_Mts);
                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            html_newline(UNPROVIDED);
                                            {
                                                SubLObject cdolist_list_var = mts_list;
                                                SubLObject mt = NIL;
                                                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                                                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                                    html_checkbox_input($str_alt144$new_mt, mt, member(mt, cb_mts_filter(), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                                    if (NIL != subl_promotions.memberP(mt, relevant_mts, UNPROVIDED, UNPROVIDED)) {
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    } else {
                                                        cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    html_indent(TWO_INTEGER);
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                        html_indent_table_internal(THREE_INTEGER);
                    } finally {
                        html_macros.$html_indent_table_max$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject prompt_for_mt(final SubLObject viewpoint, final SubLObject index_hook) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        common_prompt_prefix(viewpoint, index_hook);
        html_newline(UNPROVIDED);
        final SubLObject relevant_mts = kb_indexing.mts_of_indexed_term(index_hook);
        final SubLObject temp_list = copy_list(relevant_mts);
        final SubLObject mts_list = kb_utilities.sort_terms(union(temp_list, copy_list(cb_mts_filter()), UNPROVIDED, UNPROVIDED), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
        final SubLObject _prev_bind_2 = html_macros.$html_indent_table_max$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_macros.$html_indent_table_max$.bind(THREE_INTEGER, thread);
            SubLObject indent = ZERO_INTEGER;
            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_indent_row_internal(indent);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (NIL != span) {
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(span);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_radio_input($$$all, $$$yes, makeBoolean(NIL == active_filter_p(MTS)), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$All_Mts);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    html_radio_input($$$all, $$$no, active_filter_p(MTS), UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$Specify_Mts);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            indent = ONE_INTEGER;
            span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_indent_row_internal(indent);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (NIL != span) {
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(span);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_checkbox_input($str155$use_genl_mt, $$$yes, cb_mts_filter_use_genlmt(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($$$Include_All_Genl_Mts);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    SubLObject cdolist_list_var = mts_list;
                    SubLObject mt = NIL;
                    mt = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_checkbox_input($str157$new_mt, mt, member(mt, cb_mts_filter(), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        if (NIL != subl_promotions.memberP(mt, relevant_mts, UNPROVIDED, UNPROVIDED)) {
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_form(mt, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } else {
                            cb_form(mt, UNPROVIDED, UNPROVIDED);
                        }
                        html_indent(TWO_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        mt = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_indent_table_internal(THREE_INTEGER);
        } finally {
            html_macros.$html_indent_table_max$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject prompt_for_cycbasedproject_alt(SubLObject viewpoint, SubLObject index_hook) {
        common_prompt_prefix(viewpoint, index_hook);
        html_newline(UNPROVIDED);
        html_princ($str_alt130$_Only_those_terms_whose_);
        cb_form(viewpoint_linkable_name(viewpoint), UNPROVIDED, UNPROVIDED);
        html_princ($str_alt131$_field_has_a_value_equal_to_a_ter);
        html_newline(UNPROVIDED);
        apply(symbol_function(CB_PROMPT_PROJECTS), cons(viewpoint_name(viewpoint), funcall(viewpoint_filter_getter(viewpoint))));
        return NIL;
    }

    public static SubLObject prompt_for_cycbasedproject(final SubLObject viewpoint, final SubLObject index_hook) {
        common_prompt_prefix(viewpoint, index_hook);
        html_newline(UNPROVIDED);
        html_princ($str143$_Only_those_terms_whose_);
        cb_form(viewpoint_linkable_name(viewpoint), UNPROVIDED, UNPROVIDED);
        html_princ($str144$_field_has_a_value_equal_to_a_ter);
        html_newline(UNPROVIDED);
        apply(symbol_function(CB_PROMPT_PROJECTS), cons(viewpoint_name(viewpoint), funcall(viewpoint_filter_getter(viewpoint))));
        return NIL;
    }

    public static final SubLObject receive_list_of_cyclists_alt(SubLObject viewpoint, SubLObject args) {
        {
            SubLObject v_new = cb_get_cyclists(viewpoint_name(viewpoint), args);
            funcall(viewpoint_filter_setter(viewpoint), v_new);
            _csetf_viewpoint_active_p(viewpoint, makeBoolean(NIL != v_new));
        }
        return NIL;
    }

    public static SubLObject receive_list_of_cyclists(final SubLObject viewpoint, final SubLObject args) {
        final SubLObject v_new = cb_get_cyclists(viewpoint_name(viewpoint), args);
        funcall(viewpoint_filter_setter(viewpoint), v_new);
        _csetf_viewpoint_active_p(viewpoint, makeBoolean(NIL != v_new));
        return NIL;
    }

    public static final SubLObject receive_list_of_projects_alt(SubLObject viewpoint, SubLObject args) {
        {
            SubLObject v_new = cb_get_projects(viewpoint_name(viewpoint), args);
            funcall(viewpoint_filter_setter(viewpoint), v_new);
            _csetf_viewpoint_active_p(viewpoint, makeBoolean(NIL != v_new));
        }
        return NIL;
    }

    public static SubLObject receive_list_of_projects(final SubLObject viewpoint, final SubLObject args) {
        final SubLObject v_new = cb_get_projects(viewpoint_name(viewpoint), args);
        funcall(viewpoint_filter_setter(viewpoint), v_new);
        _csetf_viewpoint_active_p(viewpoint, makeBoolean(NIL != v_new));
        return NIL;
    }

    public static final SubLObject receive_date_alt(SubLObject viewpoint, SubLObject args) {
        {
            SubLObject all_datesP = html_extract_input(format(NIL, $str_alt134$all_dates__A, viewpoint_name(viewpoint)), args);
            if (all_datesP.equal($$$no)) {
                _csetf_viewpoint_active_p(viewpoint, T);
                funcall(viewpoint_filter_setter(viewpoint), read_args_for_simple_date(format(NIL, $str_alt136$cb_show_start__A, viewpoint_name(viewpoint)), args));
            } else {
                _csetf_viewpoint_active_p(viewpoint, NIL);
            }
        }
        return NIL;
    }

    public static SubLObject receive_date(final SubLObject viewpoint, final SubLObject args) {
        final SubLObject all_datesP = html_extract_input(format(NIL, $str147$all_dates__A, viewpoint_name(viewpoint)), args);
        if (all_datesP.equal($$$no)) {
            _csetf_viewpoint_active_p(viewpoint, T);
            funcall(viewpoint_filter_setter(viewpoint), read_args_for_simple_date(format(NIL, $str149$cb_show_start__A, viewpoint_name(viewpoint)), args));
        } else {
            _csetf_viewpoint_active_p(viewpoint, NIL);
        }
        return NIL;
    }

    public static final SubLObject receive_mt_alt(SubLObject viewpoint, SubLObject args) {
        {
            SubLObject selected_allP = html_extract_input($$$all, args);
            SubLObject selected_use_genlsP = html_extract_input($str_alt142$use_genl_mt, args);
            SubLObject selections = html_extract_input_values($str_alt144$new_mt, args);
            if (NIL != selected_use_genlsP) {
                set_cb_mts_filter_use_genlmt(T);
            } else {
                set_cb_mts_filter_use_genlmt(NIL);
            }
            if (selected_allP.equal($$$yes)) {
                _csetf_viewpoint_active_p(viewpoint, NIL);
                funcall(viewpoint_filter_setter(viewpoint), NIL);
            } else {
                _csetf_viewpoint_active_p(viewpoint, T);
                funcall(viewpoint_filter_setter(viewpoint), NIL);
                {
                    SubLObject cdolist_list_var = selections;
                    SubLObject new_mt = NIL;
                    for (new_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_mt = cdolist_list_var.first()) {
                        funcall(viewpoint_filter_setter(viewpoint), cons(cb_guess_fort(new_mt, UNPROVIDED), funcall(viewpoint_filter_getter(viewpoint))));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject receive_mt(final SubLObject viewpoint, final SubLObject args) {
        final SubLObject selected_allP = html_extract_input($$$all, args);
        final SubLObject selected_use_genlsP = html_extract_input($str155$use_genl_mt, args);
        final SubLObject selections = html_extract_input_values($str157$new_mt, args);
        if (NIL != selected_use_genlsP) {
            set_cb_mts_filter_use_genlmt(T);
        } else {
            set_cb_mts_filter_use_genlmt(NIL);
        }
        if (selected_allP.equal($$$yes)) {
            _csetf_viewpoint_active_p(viewpoint, NIL);
            funcall(viewpoint_filter_setter(viewpoint), NIL);
        } else {
            _csetf_viewpoint_active_p(viewpoint, T);
            funcall(viewpoint_filter_setter(viewpoint), NIL);
            SubLObject cdolist_list_var = selections;
            SubLObject new_mt = NIL;
            new_mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                funcall(viewpoint_filter_setter(viewpoint), cons(cb_guess_fort(new_mt, UNPROVIDED), funcall(viewpoint_filter_getter(viewpoint))));
                cdolist_list_var = cdolist_list_var.rest();
                new_mt = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject cb_set_microtheory_browsing_filter_viewpoint(final SubLObject mt) {
        final SubLObject viewpoint = find_viewpoint(MTS);
        if (NIL != kb_utilities.kbeq(mt, $$EverythingPSC)) {
            _csetf_viewpoint_active_p(viewpoint, NIL);
            set_cb_mts_filter_use_genlmt(NIL);
            funcall(viewpoint_filter_setter(viewpoint), NIL);
        } else {
            _csetf_viewpoint_active_p(viewpoint, T);
            set_cb_mts_filter_use_genlmt(T);
            funcall(viewpoint_filter_setter(viewpoint), list(mt));
        }
        return NIL;
    }

    public static final SubLObject assertion_before_date_alt(SubLObject assertion) {
        return makeBoolean(((NIL != doc_predicate_p(assertion)) || (NIL == assertions_high.asserted_when(assertion))) || assertions_high.asserted_when(assertion).numLE(cb_assertion_end_date_filter()));
    }

    public static SubLObject assertion_before_date(final SubLObject assertion) {
        return makeBoolean(((NIL != doc_predicate_p(assertion)) || (NIL == assertions_high.asserted_when(assertion))) || assertions_high.asserted_when(assertion).numLE(cb_assertion_end_date_filter()));
    }

    public static final SubLObject assertion_after_date_alt(SubLObject assertion) {
        return makeBoolean(((NIL != doc_predicate_p(assertion)) || (NIL == assertions_high.asserted_when(assertion))) || cb_assertion_start_date_filter().numLE(assertions_high.asserted_when(assertion)));
    }

    public static SubLObject assertion_after_date(final SubLObject assertion) {
        return makeBoolean(((NIL != doc_predicate_p(assertion)) || (NIL == assertions_high.asserted_when(assertion))) || cb_assertion_start_date_filter().numLE(assertions_high.asserted_when(assertion)));
    }

    /**
     * Accessor for *CB-USE-MYCREATOR-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-USE-MYCREATOR-FILTER*")
    public static final SubLObject cb_use_mycreator_filter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_use_mycreator_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-USE-MYCREATOR-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-USE-MYCREATOR-FILTER*")
    public static SubLObject cb_use_mycreator_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_use_mycreator_filter$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-USE-MYCREATOR-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-USE-MYCREATOR-FILTER*")
    public static final SubLObject set_cb_use_mycreator_filter_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_use_mycreator_filter$.setDynamicValue(new_value, thread);
            return $cb_use_mycreator_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-USE-MYCREATOR-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-USE-MYCREATOR-FILTER*")
    public static SubLObject set_cb_use_mycreator_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_use_mycreator_filter$.setDynamicValue(new_value, thread);
        return $cb_use_mycreator_filter$.getDynamicValue(thread);
    }

    /**
     * Accessor for *CB-MYCREATOR-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-MYCREATOR-FILTER*")
    public static final SubLObject cb_mycreator_filter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_mycreator_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-MYCREATOR-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-MYCREATOR-FILTER*")
    public static SubLObject cb_mycreator_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_mycreator_filter$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-MYCREATOR-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-MYCREATOR-FILTER*")
    public static final SubLObject set_cb_mycreator_filter_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_mycreator_filter$.setDynamicValue(new_value, thread);
            return $cb_mycreator_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-MYCREATOR-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-MYCREATOR-FILTER*")
    public static SubLObject set_cb_mycreator_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_mycreator_filter$.setDynamicValue(new_value, thread);
        return $cb_mycreator_filter$.getDynamicValue(thread);
    }

    public static final SubLObject mycreator_effective_fn_alt(SubLObject assertion) {
        if (NIL == assertion_handles.assertion_p(assertion)) {
            Errors.sublisp_break($$$not_an_assertion, EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (NIL != doc_predicate_p(assertion)) {
            return T;
        }
        {
            SubLObject viewpoint = find_viewpoint(MYCREATOR);
            return member(funcall(viewpoint_effective_fn_slotname(viewpoint), assertion), funcall(viewpoint_filter_getter(viewpoint)), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject mycreator_effective_fn(final SubLObject assertion) {
        if (NIL == assertion_handles.assertion_p(assertion)) {
            Errors.sublisp_break($$$not_an_assertion, EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (NIL != doc_predicate_p(assertion)) {
            return T;
        }
        final SubLObject viewpoint = find_viewpoint(MYCREATOR);
        return member(funcall(viewpoint_effective_fn_slotname(viewpoint), assertion), funcall(viewpoint_filter_getter(viewpoint)), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Accessor for *CB-USE-MYREVIEWER-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-USE-MYREVIEWER-FILTER*")
    public static final SubLObject cb_use_myreviewer_filter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_use_myreviewer_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-USE-MYREVIEWER-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-USE-MYREVIEWER-FILTER*")
    public static SubLObject cb_use_myreviewer_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_use_myreviewer_filter$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-USE-MYREVIEWER-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-USE-MYREVIEWER-FILTER*")
    public static final SubLObject set_cb_use_myreviewer_filter_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_use_myreviewer_filter$.setDynamicValue(new_value, thread);
            return $cb_use_myreviewer_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-USE-MYREVIEWER-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-USE-MYREVIEWER-FILTER*")
    public static SubLObject set_cb_use_myreviewer_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_use_myreviewer_filter$.setDynamicValue(new_value, thread);
        return $cb_use_myreviewer_filter$.getDynamicValue(thread);
    }

    /**
     * Accessor for *CB-MYREVIEWER-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-MYREVIEWER-FILTER*")
    public static final SubLObject cb_myreviewer_filter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_myreviewer_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-MYREVIEWER-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-MYREVIEWER-FILTER*")
    public static SubLObject cb_myreviewer_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_myreviewer_filter$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-MYREVIEWER-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-MYREVIEWER-FILTER*")
    public static final SubLObject set_cb_myreviewer_filter_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_myreviewer_filter$.setDynamicValue(new_value, thread);
            return $cb_myreviewer_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-MYREVIEWER-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-MYREVIEWER-FILTER*")
    public static SubLObject set_cb_myreviewer_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_myreviewer_filter$.setDynamicValue(new_value, thread);
        return $cb_myreviewer_filter$.getDynamicValue(thread);
    }

    public static final SubLObject myreviewer_effective_fn_alt(SubLObject assertion) {
        if (NIL == assertion_handles.assertion_p(assertion)) {
            Errors.sublisp_break($$$not_an_assertion, EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (NIL != doc_predicate_p(assertion)) {
            return T;
        }
        {
            SubLObject viewpoint = find_viewpoint(MYREVIEWER);
            return member(funcall(viewpoint_effective_fn_slotname(viewpoint), assertion), funcall(viewpoint_filter_getter(viewpoint)), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject myreviewer_effective_fn(final SubLObject assertion) {
        if (NIL == assertion_handles.assertion_p(assertion)) {
            Errors.sublisp_break($$$not_an_assertion, EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (NIL != doc_predicate_p(assertion)) {
            return T;
        }
        final SubLObject viewpoint = find_viewpoint(MYREVIEWER);
        return member(funcall(viewpoint_effective_fn_slotname(viewpoint), assertion), funcall(viewpoint_filter_getter(viewpoint)), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Accessor for *CB-USE-ASSERTION-START-DATE-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-USE-ASSERTION-START-DATE-FILTER*")
    public static final SubLObject cb_use_assertion_start_date_filter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_use_assertion_start_date_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-USE-ASSERTION-START-DATE-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-USE-ASSERTION-START-DATE-FILTER*")
    public static SubLObject cb_use_assertion_start_date_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_use_assertion_start_date_filter$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-USE-ASSERTION-START-DATE-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-USE-ASSERTION-START-DATE-FILTER*")
    public static final SubLObject set_cb_use_assertion_start_date_filter_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_use_assertion_start_date_filter$.setDynamicValue(new_value, thread);
            return $cb_use_assertion_start_date_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-USE-ASSERTION-START-DATE-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-USE-ASSERTION-START-DATE-FILTER*")
    public static SubLObject set_cb_use_assertion_start_date_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_use_assertion_start_date_filter$.setDynamicValue(new_value, thread);
        return $cb_use_assertion_start_date_filter$.getDynamicValue(thread);
    }

    /**
     * Accessor for *CB-ASSERTION-START-DATE-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-ASSERTION-START-DATE-FILTER*")
    public static final SubLObject cb_assertion_start_date_filter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_assertion_start_date_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-ASSERTION-START-DATE-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-ASSERTION-START-DATE-FILTER*")
    public static SubLObject cb_assertion_start_date_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_assertion_start_date_filter$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-ASSERTION-START-DATE-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-ASSERTION-START-DATE-FILTER*")
    public static final SubLObject set_cb_assertion_start_date_filter_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_assertion_start_date_filter$.setDynamicValue(new_value, thread);
            return $cb_assertion_start_date_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-ASSERTION-START-DATE-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-ASSERTION-START-DATE-FILTER*")
    public static SubLObject set_cb_assertion_start_date_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_assertion_start_date_filter$.setDynamicValue(new_value, thread);
        return $cb_assertion_start_date_filter$.getDynamicValue(thread);
    }

    /**
     * Accessor for *CB-USE-ASSERTION-END-DATE-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-USE-ASSERTION-END-DATE-FILTER*")
    public static final SubLObject cb_use_assertion_end_date_filter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_use_assertion_end_date_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-USE-ASSERTION-END-DATE-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-USE-ASSERTION-END-DATE-FILTER*")
    public static SubLObject cb_use_assertion_end_date_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_use_assertion_end_date_filter$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-USE-ASSERTION-END-DATE-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-USE-ASSERTION-END-DATE-FILTER*")
    public static final SubLObject set_cb_use_assertion_end_date_filter_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_use_assertion_end_date_filter$.setDynamicValue(new_value, thread);
            return $cb_use_assertion_end_date_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-USE-ASSERTION-END-DATE-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-USE-ASSERTION-END-DATE-FILTER*")
    public static SubLObject set_cb_use_assertion_end_date_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_use_assertion_end_date_filter$.setDynamicValue(new_value, thread);
        return $cb_use_assertion_end_date_filter$.getDynamicValue(thread);
    }

    /**
     * Accessor for *CB-ASSERTION-END-DATE-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-ASSERTION-END-DATE-FILTER*")
    public static final SubLObject cb_assertion_end_date_filter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_assertion_end_date_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-ASSERTION-END-DATE-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-ASSERTION-END-DATE-FILTER*")
    public static SubLObject cb_assertion_end_date_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_assertion_end_date_filter$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-ASSERTION-END-DATE-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-ASSERTION-END-DATE-FILTER*")
    public static final SubLObject set_cb_assertion_end_date_filter_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_assertion_end_date_filter$.setDynamicValue(new_value, thread);
            return $cb_assertion_end_date_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-ASSERTION-END-DATE-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-ASSERTION-END-DATE-FILTER*")
    public static SubLObject set_cb_assertion_end_date_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_assertion_end_date_filter$.setDynamicValue(new_value, thread);
        return $cb_assertion_end_date_filter$.getDynamicValue(thread);
    }

    /**
     * Accessor for *CB-USE-MTS-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-USE-MTS-FILTER*")
    public static final SubLObject cb_use_mts_filter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_use_mts_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-USE-MTS-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-USE-MTS-FILTER*")
    public static SubLObject cb_use_mts_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_use_mts_filter$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-USE-MTS-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-USE-MTS-FILTER*")
    public static final SubLObject set_cb_use_mts_filter_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_use_mts_filter$.setDynamicValue(new_value, thread);
            return $cb_use_mts_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-USE-MTS-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-USE-MTS-FILTER*")
    public static SubLObject set_cb_use_mts_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_use_mts_filter$.setDynamicValue(new_value, thread);
        return $cb_use_mts_filter$.getDynamicValue(thread);
    }

    /**
     * Accessor for *CB-MTS-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-MTS-FILTER*")
    public static final SubLObject cb_mts_filter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_mts_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-MTS-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-MTS-FILTER*")
    public static SubLObject cb_mts_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_mts_filter$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-MTS-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-MTS-FILTER*")
    public static final SubLObject set_cb_mts_filter_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_mts_filter$.setDynamicValue(new_value, thread);
            return $cb_mts_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-MTS-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-MTS-FILTER*")
    public static SubLObject set_cb_mts_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_mts_filter$.setDynamicValue(new_value, thread);
        return $cb_mts_filter$.getDynamicValue(thread);
    }

    /**
     * Accessor for *CB-USE-MYCREATIONPURPOSE-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-USE-MYCREATIONPURPOSE-FILTER*")
    public static final SubLObject cb_use_mycreationpurpose_filter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_use_mycreationpurpose_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-USE-MYCREATIONPURPOSE-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-USE-MYCREATIONPURPOSE-FILTER*")
    public static SubLObject cb_use_mycreationpurpose_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_use_mycreationpurpose_filter$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-USE-MYCREATIONPURPOSE-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-USE-MYCREATIONPURPOSE-FILTER*")
    public static final SubLObject set_cb_use_mycreationpurpose_filter_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_use_mycreationpurpose_filter$.setDynamicValue(new_value, thread);
            return $cb_use_mycreationpurpose_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-USE-MYCREATIONPURPOSE-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-USE-MYCREATIONPURPOSE-FILTER*")
    public static SubLObject set_cb_use_mycreationpurpose_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_use_mycreationpurpose_filter$.setDynamicValue(new_value, thread);
        return $cb_use_mycreationpurpose_filter$.getDynamicValue(thread);
    }

    /**
     * Accessor for *CB-MYCREATIONPURPOSE-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-MYCREATIONPURPOSE-FILTER*")
    public static final SubLObject cb_mycreationpurpose_filter_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cb_mycreationpurpose_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for *CB-MYCREATIONPURPOSE-FILTER*
     */
    @LispMethod(comment = "Accessor for *CB-MYCREATIONPURPOSE-FILTER*")
    public static SubLObject cb_mycreationpurpose_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cb_mycreationpurpose_filter$.getDynamicValue(thread);
    }

    /**
     * Set function for *CB-MYCREATIONPURPOSE-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-MYCREATIONPURPOSE-FILTER*")
    public static final SubLObject set_cb_mycreationpurpose_filter_alt(SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cb_mycreationpurpose_filter$.setDynamicValue(new_value, thread);
            return $cb_mycreationpurpose_filter$.getDynamicValue(thread);
        }
    }

    /**
     * Set function for *CB-MYCREATIONPURPOSE-FILTER*
     */
    @LispMethod(comment = "Set function for *CB-MYCREATIONPURPOSE-FILTER*")
    public static SubLObject set_cb_mycreationpurpose_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_mycreationpurpose_filter$.setDynamicValue(new_value, thread);
        return $cb_mycreationpurpose_filter$.getDynamicValue(thread);
    }

    public static final SubLObject mycreationpurpose_effective_fn_alt(SubLObject assertion) {
        if (NIL == assertion_handles.assertion_p(assertion)) {
            Errors.sublisp_break($$$not_an_assertion, EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (NIL != doc_predicate_p(assertion)) {
            return T;
        }
        {
            SubLObject viewpoint = find_viewpoint(MYCREATIONPURPOSE);
            return member(funcall(viewpoint_effective_fn_slotname(viewpoint), assertion), funcall(viewpoint_filter_getter(viewpoint)), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject mycreationpurpose_effective_fn(final SubLObject assertion) {
        if (NIL == assertion_handles.assertion_p(assertion)) {
            Errors.sublisp_break($$$not_an_assertion, EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (NIL != doc_predicate_p(assertion)) {
            return T;
        }
        final SubLObject viewpoint = find_viewpoint(MYCREATIONPURPOSE);
        return member(funcall(viewpoint_effective_fn_slotname(viewpoint), assertion), funcall(viewpoint_filter_getter(viewpoint)), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_calc_filter_hooks_alt() {
        {
            SubLObject active = active_filters(UNPROVIDED);
            if (NIL == active) {
                return NIL;
            } else {
                if (NIL != endp(active.rest())) {
                    return viewpoint_effective_fn(active.first());
                } else {
                    return CB_ONLINE_FILTER_HOOKS;
                }
            }
        }
    }

    public static SubLObject cb_calc_filter_hooks() {
        final SubLObject active = active_filters(UNPROVIDED);
        if (NIL == active) {
            return NIL;
        }
        if (NIL != endp(active.rest())) {
            return viewpoint_effective_fn(active.first());
        }
        return CB_ONLINE_FILTER_HOOKS;
    }

    public static final SubLObject cb_online_filter_hooks_alt(SubLObject assertion) {
        {
            SubLObject active = active_filters(UNPROVIDED);
            SubLObject cdolist_list_var = active;
            SubLObject filter = NIL;
            for (filter = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filter = cdolist_list_var.first()) {
                if (NIL == funcall(viewpoint_effective_fn(filter), assertion)) {
                    return NIL;
                }
            }
            return T;
        }
    }

    public static SubLObject cb_online_filter_hooks(final SubLObject assertion) {
        SubLObject cdolist_list_var;
        final SubLObject active = cdolist_list_var = active_filters(UNPROVIDED);
        SubLObject filter = NIL;
        filter = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == funcall(viewpoint_effective_fn(filter), assertion)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            filter = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject with_assertion_filters_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt186, bq_cons(PROGN, append(body, NIL)));
        }
    }

    public static SubLObject with_assertion_filters(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list200, bq_cons(PROGN, append(body, NIL)));
    }

    public static final SubLObject find_relevant_key_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject answer_list = NIL;
            SubLObject mt_getter = NIL;
            SubLObject getter = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt187);
            answer_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt187);
            mt_getter = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt187);
            getter = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_14 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt187);
                    current_14 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt187);
                    if (NIL == member(current_14, $list_alt188, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_14 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt187);
                }
                {
                    SubLObject specified_mt_tail = property_list_member($SPECIFIED_MT, current);
                    SubLObject specified_mt = (NIL != specified_mt_tail) ? ((SubLObject) (cadr(specified_mt_tail))) : NIL;
                    return list(WITH_ASSERTION_FILTERS, list(PCOND, list(list(CAND, $list_alt194, list(CNOT, specified_mt)), list(PIF, $list_alt197, list(WITH_MT_LIST_AND_GENL_MTS, $list_alt199, list(CSETQ, answer_list, mt_getter)), list(WITH_MT_LIST, $list_alt199, list(CSETQ, answer_list, mt_getter)))), list(T, list(CSETQ, answer_list, getter))));
                }
            }
        }
    }

    public static SubLObject find_relevant_key(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject answer_list = NIL;
        SubLObject mt_getter = NIL;
        SubLObject getter = NIL;
        destructuring_bind_must_consp(current, datum, $list201);
        answer_list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list201);
        mt_getter = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list201);
        getter = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$16 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list201);
            current_$16 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list201);
            if (NIL == member(current_$16, $list202, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$16 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list201);
        }
        final SubLObject specified_mt_tail = property_list_member($SPECIFIED_MT, current);
        final SubLObject specified_mt = (NIL != specified_mt_tail) ? cadr(specified_mt_tail) : NIL;
        return list(WITH_ASSERTION_FILTERS, list(PCOND, list(list(CAND, $list208, list(CNOT, specified_mt)), list(PIF, $list211, list(WITH_MT_LIST_AND_GENL_MTS, $list213, list(CSETQ, answer_list, mt_getter)), list(WITH_MT_LIST, $list213, list(CSETQ, answer_list, mt_getter)))), list(T, list(CSETQ, answer_list, getter))));
    }

    public static final SubLObject count_relevant_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject filtered = NIL;
            SubLObject unfiltered = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt202);
            filtered = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt202);
            unfiltered = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject result = $sym203$RESULT;
                    return list(CLET, list(result), list(WITH_ASSERTION_FILTERS, list(PIF, $list_alt194, list(CSETQ, result, filtered), list(CSETQ, result, unfiltered))), list(RET, result));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt202);
            }
        }
        return NIL;
    }

    public static SubLObject count_relevant(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filtered = NIL;
        SubLObject unfiltered = NIL;
        destructuring_bind_must_consp(current, datum, $list216);
        filtered = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list216);
        unfiltered = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject result = $sym217$RESULT;
            return list(CLET, list(result), list(WITH_ASSERTION_FILTERS, list(PIF, $list208, list(CSETQ, result, filtered), list(CSETQ, result, unfiltered))), list(RET, result));
        }
        cdestructuring_bind_error(datum, $list216);
        return NIL;
    }

    public static final SubLObject cb_link_edit_viewpoint_alt(SubLObject viewpoint, SubLObject linktext, SubLObject index_hook) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (index_hook == UNPROVIDED) {
            index_hook = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = viewpoint_name(viewpoint);
            }
            {
                SubLObject handler = $str_alt205$cb_ev;
                SubLObject frame = $cb_default_term_frame$.getDynamicValue(thread);
                if (frame == $TOP) {
                    handler = $str_alt207$cb_start_cb_ev;
                }
                {
                    SubLObject frame_name_var = cb_frame_name(frame);
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    cyc_cgi_url_int();
                    if (NIL != index_hook) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt208$_a__a__a, new SubLObject[]{ handler, viewpoint_summary_name(viewpoint), index_hook });
                    } else {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt209$_a__a, handler, viewpoint_summary_name(viewpoint));
                    }
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
            }
            return viewpoint;
        }
    }

    public static SubLObject cb_link_edit_viewpoint(final SubLObject viewpoint, SubLObject linktext, SubLObject index_hook) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (index_hook == UNPROVIDED) {
            index_hook = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = viewpoint_name(viewpoint);
        }
        SubLObject handler = $str219$cb_ev;
        final SubLObject frame = $cb_default_term_frame$.getDynamicValue(thread);
        if (frame == $TOP) {
            handler = $str221$cb_start_cb_ev;
        }
        final SubLObject frame_name_var = cb_frame_name(frame);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        if (NIL != index_hook) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str222$_a__a__a, new SubLObject[]{ handler, viewpoint_summary_name(viewpoint), index_hook });
        } else {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str223$_a__a, handler, viewpoint_summary_name(viewpoint));
        }
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
        return viewpoint;
    }

    public static SubLObject declare_cb_viewpoint_file() {
        declareFunction("print_viewpoint", "PRINT-VIEWPOINT", 3, 0, false);
        declareFunction("viewpoint_print_function_trampoline", "VIEWPOINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("viewpoint_p", "VIEWPOINT-P", 1, 0, false);
        new cb_viewpoint.$viewpoint_p$UnaryFunction();
        declareFunction("viewpoint_name", "VIEWPOINT-NAME", 1, 0, false);
        declareFunction("viewpoint_summary_name", "VIEWPOINT-SUMMARY-NAME", 1, 0, false);
        declareFunction("viewpoint_linkable_name", "VIEWPOINT-LINKABLE-NAME", 1, 0, false);
        declareFunction("viewpoint_linkname_prefix", "VIEWPOINT-LINKNAME-PREFIX", 1, 0, false);
        declareFunction("viewpoint_filter_getter", "VIEWPOINT-FILTER-GETTER", 1, 0, false);
        declareFunction("viewpoint_filter_setter", "VIEWPOINT-FILTER-SETTER", 1, 0, false);
        declareFunction("viewpoint_type", "VIEWPOINT-TYPE", 1, 0, false);
        declareFunction("viewpoint_active_p", "VIEWPOINT-ACTIVE-P", 1, 0, false);
        declareFunction("viewpoint_effective_fn", "VIEWPOINT-EFFECTIVE-FN", 1, 0, false);
        declareFunction("viewpoint_value_prompt_fn", "VIEWPOINT-VALUE-PROMPT-FN", 1, 0, false);
        declareFunction("viewpoint_value_update_fn", "VIEWPOINT-VALUE-UPDATE-FN", 1, 0, false);
        declareFunction("viewpoint_initial_filter_value", "VIEWPOINT-INITIAL-FILTER-VALUE", 1, 0, false);
        declareFunction("viewpoint_effective_fn_slotname", "VIEWPOINT-EFFECTIVE-FN-SLOTNAME", 1, 0, false);
        declareFunction("_csetf_viewpoint_name", "_CSETF-VIEWPOINT-NAME", 2, 0, false);
        declareFunction("_csetf_viewpoint_summary_name", "_CSETF-VIEWPOINT-SUMMARY-NAME", 2, 0, false);
        declareFunction("_csetf_viewpoint_linkable_name", "_CSETF-VIEWPOINT-LINKABLE-NAME", 2, 0, false);
        declareFunction("_csetf_viewpoint_linkname_prefix", "_CSETF-VIEWPOINT-LINKNAME-PREFIX", 2, 0, false);
        declareFunction("_csetf_viewpoint_filter_getter", "_CSETF-VIEWPOINT-FILTER-GETTER", 2, 0, false);
        declareFunction("_csetf_viewpoint_filter_setter", "_CSETF-VIEWPOINT-FILTER-SETTER", 2, 0, false);
        declareFunction("_csetf_viewpoint_type", "_CSETF-VIEWPOINT-TYPE", 2, 0, false);
        declareFunction("_csetf_viewpoint_active_p", "_CSETF-VIEWPOINT-ACTIVE-P", 2, 0, false);
        declareFunction("_csetf_viewpoint_effective_fn", "_CSETF-VIEWPOINT-EFFECTIVE-FN", 2, 0, false);
        declareFunction("_csetf_viewpoint_value_prompt_fn", "_CSETF-VIEWPOINT-VALUE-PROMPT-FN", 2, 0, false);
        declareFunction("_csetf_viewpoint_value_update_fn", "_CSETF-VIEWPOINT-VALUE-UPDATE-FN", 2, 0, false);
        declareFunction("_csetf_viewpoint_initial_filter_value", "_CSETF-VIEWPOINT-INITIAL-FILTER-VALUE", 2, 0, false);
        declareFunction("_csetf_viewpoint_effective_fn_slotname", "_CSETF-VIEWPOINT-EFFECTIVE-FN-SLOTNAME", 2, 0, false);
        declareFunction("make_viewpoint", "MAKE-VIEWPOINT", 0, 1, false);
        declareFunction("visit_defstruct_viewpoint", "VISIT-DEFSTRUCT-VIEWPOINT", 2, 0, false);
        declareFunction("visit_defstruct_object_viewpoint_method", "VISIT-DEFSTRUCT-OBJECT-VIEWPOINT-METHOD", 2, 0, false);
        declareFunction("find_viewpoint", "FIND-VIEWPOINT", 1, 0, false);
        declareFunction("active_filter_p", "ACTIVE-FILTER-P", 1, 0, false);
        declareFunction("active_viewpoint_struct_p", "ACTIVE-VIEWPOINT-STRUCT-P", 1, 1, false);
        declareFunction("clear_viewpoint_cache", "CLEAR-VIEWPOINT-CACHE", 0, 0, false);
        declareFunction("active_filters", "ACTIVE-FILTERS", 0, 1, false);
        declareFunction("enable_filter", "ENABLE-FILTER", 1, 1, false);
        declareFunction("doc_predicate_p", "DOC-PREDICATE-P", 1, 0, false);
        declareMacro("defviewpoint", "DEFVIEWPOINT");
        declareFunction("defviewpoint_internal", "DEFVIEWPOINT-INTERNAL", 5, 0, false);
        declareFunction("display_viewpoint", "DISPLAY-VIEWPOINT", 1, 1, false);
        declareFunction("cb_display_viewpoint_filters", "CB-DISPLAY-VIEWPOINT-FILTERS", 0, 0, false);
        declareFunction("prompt_with_completion", "PROMPT-WITH-COMPLETION", 4, 0, false);
        declareFunction("cb_prompt_cyclists", "CB-PROMPT-CYCLISTS", 1, 3, false);
        declareFunction("extract_fort_input", "EXTRACT-FORT-INPUT", 3, 0, false);
        declareFunction("cb_get_cyclists", "CB-GET-CYCLISTS", 2, 0, false);
        declareFunction("cb_prompt_projects", "CB-PROMPT-PROJECTS", 1, 3, false);
        declareFunction("cb_get_projects", "CB-GET-PROJECTS", 2, 0, false);
        declareFunction("display_viewpoint_1", "DISPLAY-VIEWPOINT-1", 1, 0, false);
        declareFunction("cb_viewpoint", "CB-VIEWPOINT", 0, 1, false);
        declareFunction("cb_ev", "CB-EV", 0, 1, false);
        declareFunction("cb_viewpoint_summary_handler", "CB-VIEWPOINT-SUMMARY-HANDLER", 1, 0, false);
        declareFunction("cb_viewpoint_handler", "CB-VIEWPOINT-HANDLER", 1, 0, false);
        declareFunction("cb_link_viewpoint", "CB-LINK-VIEWPOINT", 1, 1, false);
        declareFunction("common_prompt_prefix", "COMMON-PROMPT-PREFIX", 2, 0, false);
        declareFunction("prompt_for_list_of_cyclists", "PROMPT-FOR-LIST-OF-CYCLISTS", 2, 0, false);
        declareFunction("prompt_for_date", "PROMPT-FOR-DATE", 2, 0, false);
        declareFunction("prompt_for_mt", "PROMPT-FOR-MT", 2, 0, false);
        declareFunction("prompt_for_cycbasedproject", "PROMPT-FOR-CYCBASEDPROJECT", 2, 0, false);
        declareFunction("receive_list_of_cyclists", "RECEIVE-LIST-OF-CYCLISTS", 2, 0, false);
        declareFunction("receive_list_of_projects", "RECEIVE-LIST-OF-PROJECTS", 2, 0, false);
        declareFunction("receive_date", "RECEIVE-DATE", 2, 0, false);
        declareFunction("receive_mt", "RECEIVE-MT", 2, 0, false);
        declareFunction("cb_set_microtheory_browsing_filter_viewpoint", "CB-SET-MICROTHEORY-BROWSING-FILTER-VIEWPOINT", 1, 0, false);
        declareFunction("assertion_before_date", "ASSERTION-BEFORE-DATE", 1, 0, false);
        declareFunction("assertion_after_date", "ASSERTION-AFTER-DATE", 1, 0, false);
        declareFunction("cb_use_mycreator_filter", "CB-USE-MYCREATOR-FILTER", 0, 0, false);
        declareFunction("set_cb_use_mycreator_filter", "SET-CB-USE-MYCREATOR-FILTER", 1, 0, false);
        declareFunction("cb_mycreator_filter", "CB-MYCREATOR-FILTER", 0, 0, false);
        declareFunction("set_cb_mycreator_filter", "SET-CB-MYCREATOR-FILTER", 1, 0, false);
        declareFunction("mycreator_effective_fn", "MYCREATOR-EFFECTIVE-FN", 1, 0, false);
        declareFunction("cb_use_myreviewer_filter", "CB-USE-MYREVIEWER-FILTER", 0, 0, false);
        declareFunction("set_cb_use_myreviewer_filter", "SET-CB-USE-MYREVIEWER-FILTER", 1, 0, false);
        declareFunction("cb_myreviewer_filter", "CB-MYREVIEWER-FILTER", 0, 0, false);
        declareFunction("set_cb_myreviewer_filter", "SET-CB-MYREVIEWER-FILTER", 1, 0, false);
        declareFunction("myreviewer_effective_fn", "MYREVIEWER-EFFECTIVE-FN", 1, 0, false);
        declareFunction("cb_use_assertion_start_date_filter", "CB-USE-ASSERTION-START-DATE-FILTER", 0, 0, false);
        declareFunction("set_cb_use_assertion_start_date_filter", "SET-CB-USE-ASSERTION-START-DATE-FILTER", 1, 0, false);
        declareFunction("cb_assertion_start_date_filter", "CB-ASSERTION-START-DATE-FILTER", 0, 0, false);
        declareFunction("set_cb_assertion_start_date_filter", "SET-CB-ASSERTION-START-DATE-FILTER", 1, 0, false);
        declareFunction("cb_use_assertion_end_date_filter", "CB-USE-ASSERTION-END-DATE-FILTER", 0, 0, false);
        declareFunction("set_cb_use_assertion_end_date_filter", "SET-CB-USE-ASSERTION-END-DATE-FILTER", 1, 0, false);
        declareFunction("cb_assertion_end_date_filter", "CB-ASSERTION-END-DATE-FILTER", 0, 0, false);
        declareFunction("set_cb_assertion_end_date_filter", "SET-CB-ASSERTION-END-DATE-FILTER", 1, 0, false);
        declareFunction("cb_use_mts_filter", "CB-USE-MTS-FILTER", 0, 0, false);
        declareFunction("set_cb_use_mts_filter", "SET-CB-USE-MTS-FILTER", 1, 0, false);
        declareFunction("cb_mts_filter", "CB-MTS-FILTER", 0, 0, false);
        declareFunction("set_cb_mts_filter", "SET-CB-MTS-FILTER", 1, 0, false);
        declareFunction("cb_use_mycreationpurpose_filter", "CB-USE-MYCREATIONPURPOSE-FILTER", 0, 0, false);
        declareFunction("set_cb_use_mycreationpurpose_filter", "SET-CB-USE-MYCREATIONPURPOSE-FILTER", 1, 0, false);
        declareFunction("cb_mycreationpurpose_filter", "CB-MYCREATIONPURPOSE-FILTER", 0, 0, false);
        declareFunction("set_cb_mycreationpurpose_filter", "SET-CB-MYCREATIONPURPOSE-FILTER", 1, 0, false);
        declareFunction("mycreationpurpose_effective_fn", "MYCREATIONPURPOSE-EFFECTIVE-FN", 1, 0, false);
        declareFunction("cb_calc_filter_hooks", "CB-CALC-FILTER-HOOKS", 0, 0, false);
        declareFunction("cb_online_filter_hooks", "CB-ONLINE-FILTER-HOOKS", 1, 0, false);
        declareMacro("with_assertion_filters", "WITH-ASSERTION-FILTERS");
        declareMacro("find_relevant_key", "FIND-RELEVANT-KEY");
        declareMacro("count_relevant", "COUNT-RELEVANT");
        declareFunction("cb_link_edit_viewpoint", "CB-LINK-EDIT-VIEWPOINT", 1, 2, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_ = makeString("#");

    static private final SubLString $str_alt1$__ = makeString("#<");

    static private final SubLList $list_alt6 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("SUMMARY-NAME"), makeSymbol("LINKABLE-NAME"), makeSymbol("LINKNAME-PREFIX"), makeSymbol("FILTER-GETTER"), makeSymbol("FILTER-SETTER"), makeSymbol("TYPE"), makeSymbol("ACTIVE-P"), makeSymbol("EFFECTIVE-FN"), makeSymbol("VALUE-PROMPT-FN"), makeSymbol("VALUE-UPDATE-FN"), makeSymbol("INITIAL-FILTER-VALUE"), makeSymbol("EFFECTIVE-FN-SLOTNAME") });

    static private final SubLList $list_alt7 = list(new SubLObject[]{ $NAME, makeKeyword("SUMMARY-NAME"), makeKeyword("LINKABLE-NAME"), makeKeyword("LINKNAME-PREFIX"), makeKeyword("FILTER-GETTER"), makeKeyword("FILTER-SETTER"), $TYPE, makeKeyword("ACTIVE-P"), makeKeyword("EFFECTIVE-FN"), makeKeyword("VALUE-PROMPT-FN"), makeKeyword("VALUE-UPDATE-FN"), makeKeyword("INITIAL-FILTER-VALUE"), makeKeyword("EFFECTIVE-FN-SLOTNAME") });

    public static final SubLObject init_cb_viewpoint_file_alt() {
        defparameter("*VIEWPOINT-TYPE*", NIL);
        defconstant("*DTP-VIEWPOINT*", VIEWPOINT);
        deflexical("*CB-VIEWPOINT-TABLE*", NIL != boundp($cb_viewpoint_table$) ? ((SubLObject) ($cb_viewpoint_table$.getGlobalValue())) : NIL);
        deflexical("*CB-VIEWPOINT-SUMMARY-ALIST*", NIL != boundp($cb_viewpoint_summary_alist$) ? ((SubLObject) ($cb_viewpoint_summary_alist$.getGlobalValue())) : NIL);
        defparameter("*INDEX-HOOK*", NIL);
        deflexical("*VIEWPOINT-CACHE*", NIL);
        deflexical("*DASH-NIL*", $str_alt90$________);
        defparameter("*CB-USE-MYCREATOR-FILTER*", NIL);
        defparameter("*CB-MYCREATOR-FILTER*", NIL);
        defparameter("*CB-USE-MYREVIEWER-FILTER*", NIL);
        defparameter("*CB-MYREVIEWER-FILTER*", NIL);
        defparameter("*CB-USE-ASSERTION-START-DATE-FILTER*", NIL);
        defparameter("*CB-ASSERTION-START-DATE-FILTER*", NIL);
        defparameter("*CB-USE-ASSERTION-END-DATE-FILTER*", NIL);
        defparameter("*CB-ASSERTION-END-DATE-FILTER*", NIL);
        defparameter("*CB-USE-MTS-FILTER*", NIL);
        defparameter("*CB-MTS-FILTER*", NIL);
        defparameter("*CB-USE-MYCREATIONPURPOSE-FILTER*", NIL);
        defparameter("*CB-MYCREATIONPURPOSE-FILTER*", NIL);
        return NIL;
    }

    public static SubLObject init_cb_viewpoint_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*VIEWPOINT-TYPE*", NIL);
            defconstant("*DTP-VIEWPOINT*", VIEWPOINT);
            deflexical("*CB-VIEWPOINT-TABLE*", SubLTrampolineFile.maybeDefault($cb_viewpoint_table$, $cb_viewpoint_table$, NIL));
            deflexical("*CB-VIEWPOINT-SUMMARY-ALIST*", SubLTrampolineFile.maybeDefault($cb_viewpoint_summary_alist$, $cb_viewpoint_summary_alist$, NIL));
            defparameter("*INDEX-HOOK*", NIL);
            deflexical("*VIEWPOINT-CACHE*", NIL);
            deflexical("*DASH-NIL*", $str93$________);
            defparameter("*CB-USE-MYCREATOR-FILTER*", NIL);
            defparameter("*CB-MYCREATOR-FILTER*", NIL);
            defparameter("*CB-USE-MYREVIEWER-FILTER*", NIL);
            defparameter("*CB-MYREVIEWER-FILTER*", NIL);
            defparameter("*CB-USE-ASSERTION-START-DATE-FILTER*", NIL);
            defparameter("*CB-ASSERTION-START-DATE-FILTER*", NIL);
            defparameter("*CB-USE-ASSERTION-END-DATE-FILTER*", NIL);
            defparameter("*CB-ASSERTION-END-DATE-FILTER*", NIL);
            defparameter("*CB-USE-MTS-FILTER*", NIL);
            defparameter("*CB-MTS-FILTER*", NIL);
            defparameter("*CB-USE-MYCREATIONPURPOSE-FILTER*", NIL);
            defparameter("*CB-MYCREATIONPURPOSE-FILTER*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CB-VIEWPOINT-TABLE*", NIL != boundp($cb_viewpoint_table$) ? ((SubLObject) ($cb_viewpoint_table$.getGlobalValue())) : NIL);
            deflexical("*CB-VIEWPOINT-SUMMARY-ALIST*", NIL != boundp($cb_viewpoint_summary_alist$) ? ((SubLObject) ($cb_viewpoint_summary_alist$.getGlobalValue())) : NIL);
            deflexical("*DASH-NIL*", $str_alt90$________);
        }
        return NIL;
    }

    public static SubLObject init_cb_viewpoint_file_Previous() {
        defparameter("*VIEWPOINT-TYPE*", NIL);
        defconstant("*DTP-VIEWPOINT*", VIEWPOINT);
        deflexical("*CB-VIEWPOINT-TABLE*", SubLTrampolineFile.maybeDefault($cb_viewpoint_table$, $cb_viewpoint_table$, NIL));
        deflexical("*CB-VIEWPOINT-SUMMARY-ALIST*", SubLTrampolineFile.maybeDefault($cb_viewpoint_summary_alist$, $cb_viewpoint_summary_alist$, NIL));
        defparameter("*INDEX-HOOK*", NIL);
        deflexical("*VIEWPOINT-CACHE*", NIL);
        deflexical("*DASH-NIL*", $str93$________);
        defparameter("*CB-USE-MYCREATOR-FILTER*", NIL);
        defparameter("*CB-MYCREATOR-FILTER*", NIL);
        defparameter("*CB-USE-MYREVIEWER-FILTER*", NIL);
        defparameter("*CB-MYREVIEWER-FILTER*", NIL);
        defparameter("*CB-USE-ASSERTION-START-DATE-FILTER*", NIL);
        defparameter("*CB-ASSERTION-START-DATE-FILTER*", NIL);
        defparameter("*CB-USE-ASSERTION-END-DATE-FILTER*", NIL);
        defparameter("*CB-ASSERTION-END-DATE-FILTER*", NIL);
        defparameter("*CB-USE-MTS-FILTER*", NIL);
        defparameter("*CB-MTS-FILTER*", NIL);
        defparameter("*CB-USE-MYCREATIONPURPOSE-FILTER*", NIL);
        defparameter("*CB-MYCREATIONPURPOSE-FILTER*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeSymbol("VIEWPOINT-NAME"), makeSymbol("VIEWPOINT-SUMMARY-NAME"), makeSymbol("VIEWPOINT-LINKABLE-NAME"), makeSymbol("VIEWPOINT-LINKNAME-PREFIX"), makeSymbol("VIEWPOINT-FILTER-GETTER"), makeSymbol("VIEWPOINT-FILTER-SETTER"), makeSymbol("VIEWPOINT-TYPE"), makeSymbol("VIEWPOINT-ACTIVE-P"), makeSymbol("VIEWPOINT-EFFECTIVE-FN"), makeSymbol("VIEWPOINT-VALUE-PROMPT-FN"), makeSymbol("VIEWPOINT-VALUE-UPDATE-FN"), makeSymbol("VIEWPOINT-INITIAL-FILTER-VALUE"), makeSymbol("VIEWPOINT-EFFECTIVE-FN-SLOTNAME") });

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeSymbol("_CSETF-VIEWPOINT-NAME"), makeSymbol("_CSETF-VIEWPOINT-SUMMARY-NAME"), makeSymbol("_CSETF-VIEWPOINT-LINKABLE-NAME"), makeSymbol("_CSETF-VIEWPOINT-LINKNAME-PREFIX"), makeSymbol("_CSETF-VIEWPOINT-FILTER-GETTER"), makeSymbol("_CSETF-VIEWPOINT-FILTER-SETTER"), makeSymbol("_CSETF-VIEWPOINT-TYPE"), makeSymbol("_CSETF-VIEWPOINT-ACTIVE-P"), makeSymbol("_CSETF-VIEWPOINT-EFFECTIVE-FN"), makeSymbol("_CSETF-VIEWPOINT-VALUE-PROMPT-FN"), makeSymbol("_CSETF-VIEWPOINT-VALUE-UPDATE-FN"), makeSymbol("_CSETF-VIEWPOINT-INITIAL-FILTER-VALUE"), makeSymbol("_CSETF-VIEWPOINT-EFFECTIVE-FN-SLOTNAME") });

    public static final SubLObject setup_cb_viewpoint_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_viewpoint$.getGlobalValue(), symbol_function(VIEWPOINT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(VIEWPOINT_NAME, _CSETF_VIEWPOINT_NAME);
        def_csetf(VIEWPOINT_SUMMARY_NAME, _CSETF_VIEWPOINT_SUMMARY_NAME);
        def_csetf(VIEWPOINT_LINKABLE_NAME, _CSETF_VIEWPOINT_LINKABLE_NAME);
        def_csetf(VIEWPOINT_LINKNAME_PREFIX, _CSETF_VIEWPOINT_LINKNAME_PREFIX);
        def_csetf(VIEWPOINT_FILTER_GETTER, _CSETF_VIEWPOINT_FILTER_GETTER);
        def_csetf(VIEWPOINT_FILTER_SETTER, _CSETF_VIEWPOINT_FILTER_SETTER);
        def_csetf(VIEWPOINT_TYPE, _CSETF_VIEWPOINT_TYPE);
        def_csetf(VIEWPOINT_ACTIVE_P, _CSETF_VIEWPOINT_ACTIVE_P);
        def_csetf(VIEWPOINT_EFFECTIVE_FN, _CSETF_VIEWPOINT_EFFECTIVE_FN);
        def_csetf(VIEWPOINT_VALUE_PROMPT_FN, _CSETF_VIEWPOINT_VALUE_PROMPT_FN);
        def_csetf(VIEWPOINT_VALUE_UPDATE_FN, _CSETF_VIEWPOINT_VALUE_UPDATE_FN);
        def_csetf(VIEWPOINT_INITIAL_FILTER_VALUE, _CSETF_VIEWPOINT_INITIAL_FILTER_VALUE);
        def_csetf(VIEWPOINT_EFFECTIVE_FN_SLOTNAME, _CSETF_VIEWPOINT_EFFECTIVE_FN_SLOTNAME);
        identity(VIEWPOINT);
        declare_defglobal($cb_viewpoint_table$);
        declare_defglobal($cb_viewpoint_summary_alist$);
        sethash($CB_VIEWPOINT, $cb_help_definitions$.getGlobalValue(), list($str_alt100$cb_viewpoint_html, NIL));
        html_macros.note_html_handler_function(CB_VIEWPOINT);
        html_macros.note_html_handler_function(CB_EV);
        html_macros.note_html_handler_function(CB_VIEWPOINT_SUMMARY_HANDLER);
        html_macros.note_html_handler_function(CB_VIEWPOINT_HANDLER);
        setup_cb_link_method($VIEWPOINT, CB_LINK_VIEWPOINT, TWO_INTEGER);
        register_html_state_variable($cb_use_mycreator_filter$);
        register_html_state_variable($cb_mycreator_filter$);
        defviewpoint_internal(MYCREATOR, $list_alt149, CB_MYCREATOR_FILTER, SET_CB_MYCREATOR_FILTER, MYCREATOR_EFFECTIVE_FN);
        register_html_state_variable($cb_use_myreviewer_filter$);
        register_html_state_variable($cb_myreviewer_filter$);
        defviewpoint_internal(MYREVIEWER, $list_alt157, CB_MYREVIEWER_FILTER, SET_CB_MYREVIEWER_FILTER, MYREVIEWER_EFFECTIVE_FN);
        register_html_state_variable($cb_use_assertion_start_date_filter$);
        register_html_state_variable($cb_assertion_start_date_filter$);
        defviewpoint_internal(ASSERTION_START_DATE, $list_alt164, CB_ASSERTION_START_DATE_FILTER, SET_CB_ASSERTION_START_DATE_FILTER, NIL);
        register_html_state_variable($cb_use_assertion_end_date_filter$);
        register_html_state_variable($cb_assertion_end_date_filter$);
        defviewpoint_internal(ASSERTION_END_DATE, $list_alt170, CB_ASSERTION_END_DATE_FILTER, SET_CB_ASSERTION_END_DATE_FILTER, NIL);
        register_html_state_variable($cb_use_mts_filter$);
        register_html_state_variable($cb_mts_filter$);
        defviewpoint_internal(MTS, $list_alt175, CB_MTS_FILTER, SET_CB_MTS_FILTER, NIL);
        register_html_state_variable($cb_use_mycreationpurpose_filter$);
        register_html_state_variable($cb_mycreationpurpose_filter$);
        defviewpoint_internal(MYCREATIONPURPOSE, $list_alt181, CB_MYCREATIONPURPOSE_FILTER, SET_CB_MYCREATIONPURPOSE_FILTER, MYCREATIONPURPOSE_EFFECTIVE_FN);
        setup_cb_link_method($EDIT_VIEWPOINT, CB_LINK_EDIT_VIEWPOINT, THREE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_cb_viewpoint_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_viewpoint$.getGlobalValue(), symbol_function(VIEWPOINT_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list9);
            def_csetf(VIEWPOINT_NAME, _CSETF_VIEWPOINT_NAME);
            def_csetf(VIEWPOINT_SUMMARY_NAME, _CSETF_VIEWPOINT_SUMMARY_NAME);
            def_csetf(VIEWPOINT_LINKABLE_NAME, _CSETF_VIEWPOINT_LINKABLE_NAME);
            def_csetf(VIEWPOINT_LINKNAME_PREFIX, _CSETF_VIEWPOINT_LINKNAME_PREFIX);
            def_csetf(VIEWPOINT_FILTER_GETTER, _CSETF_VIEWPOINT_FILTER_GETTER);
            def_csetf(VIEWPOINT_FILTER_SETTER, _CSETF_VIEWPOINT_FILTER_SETTER);
            def_csetf(VIEWPOINT_TYPE, _CSETF_VIEWPOINT_TYPE);
            def_csetf(VIEWPOINT_ACTIVE_P, _CSETF_VIEWPOINT_ACTIVE_P);
            def_csetf(VIEWPOINT_EFFECTIVE_FN, _CSETF_VIEWPOINT_EFFECTIVE_FN);
            def_csetf(VIEWPOINT_VALUE_PROMPT_FN, _CSETF_VIEWPOINT_VALUE_PROMPT_FN);
            def_csetf(VIEWPOINT_VALUE_UPDATE_FN, _CSETF_VIEWPOINT_VALUE_UPDATE_FN);
            def_csetf(VIEWPOINT_INITIAL_FILTER_VALUE, _CSETF_VIEWPOINT_INITIAL_FILTER_VALUE);
            def_csetf(VIEWPOINT_EFFECTIVE_FN_SLOTNAME, _CSETF_VIEWPOINT_EFFECTIVE_FN_SLOTNAME);
            identity(VIEWPOINT);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_viewpoint$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_VIEWPOINT_METHOD));
            declare_defglobal($cb_viewpoint_table$);
            declare_defglobal($cb_viewpoint_summary_alist$);
            sethash($CB_VIEWPOINT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str103$cb_viewpoint_html, NIL));
            html_macros.note_cgi_handler_function(CB_VIEWPOINT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_EV, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_VIEWPOINT_SUMMARY_HANDLER, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_VIEWPOINT_HANDLER, $HTML_HANDLER);
            setup_cb_link_method($VIEWPOINT, CB_LINK_VIEWPOINT, TWO_INTEGER);
            register_html_state_variable($cb_use_mycreator_filter$);
            register_html_state_variable($cb_mycreator_filter$);
            defviewpoint_internal(MYCREATOR, $list163, CB_MYCREATOR_FILTER, SET_CB_MYCREATOR_FILTER, MYCREATOR_EFFECTIVE_FN);
            register_html_state_variable($cb_use_myreviewer_filter$);
            register_html_state_variable($cb_myreviewer_filter$);
            defviewpoint_internal(MYREVIEWER, $list171, CB_MYREVIEWER_FILTER, SET_CB_MYREVIEWER_FILTER, MYREVIEWER_EFFECTIVE_FN);
            register_html_state_variable($cb_use_assertion_start_date_filter$);
            register_html_state_variable($cb_assertion_start_date_filter$);
            defviewpoint_internal(ASSERTION_START_DATE, $list178, CB_ASSERTION_START_DATE_FILTER, SET_CB_ASSERTION_START_DATE_FILTER, NIL);
            register_html_state_variable($cb_use_assertion_end_date_filter$);
            register_html_state_variable($cb_assertion_end_date_filter$);
            defviewpoint_internal(ASSERTION_END_DATE, $list184, CB_ASSERTION_END_DATE_FILTER, SET_CB_ASSERTION_END_DATE_FILTER, NIL);
            register_html_state_variable($cb_use_mts_filter$);
            register_html_state_variable($cb_mts_filter$);
            defviewpoint_internal(MTS, $list189, CB_MTS_FILTER, SET_CB_MTS_FILTER, NIL);
            register_html_state_variable($cb_use_mycreationpurpose_filter$);
            register_html_state_variable($cb_mycreationpurpose_filter$);
            defviewpoint_internal(MYCREATIONPURPOSE, $list195, CB_MYCREATIONPURPOSE_FILTER, SET_CB_MYCREATIONPURPOSE_FILTER, MYCREATIONPURPOSE_EFFECTIVE_FN);
            setup_cb_link_method($EDIT_VIEWPOINT, CB_LINK_EDIT_VIEWPOINT, THREE_INTEGER);
        }
        if (SubLFiles.USE_V2) {
            sethash($CB_VIEWPOINT, $cb_help_definitions$.getGlobalValue(), list($str_alt100$cb_viewpoint_html, NIL));
            html_macros.note_html_handler_function(CB_VIEWPOINT);
            html_macros.note_html_handler_function(CB_EV);
            html_macros.note_html_handler_function(CB_VIEWPOINT_SUMMARY_HANDLER);
            html_macros.note_html_handler_function(CB_VIEWPOINT_HANDLER);
            defviewpoint_internal(MYCREATOR, $list_alt149, CB_MYCREATOR_FILTER, SET_CB_MYCREATOR_FILTER, MYCREATOR_EFFECTIVE_FN);
            defviewpoint_internal(MYREVIEWER, $list_alt157, CB_MYREVIEWER_FILTER, SET_CB_MYREVIEWER_FILTER, MYREVIEWER_EFFECTIVE_FN);
            defviewpoint_internal(ASSERTION_START_DATE, $list_alt164, CB_ASSERTION_START_DATE_FILTER, SET_CB_ASSERTION_START_DATE_FILTER, NIL);
            defviewpoint_internal(ASSERTION_END_DATE, $list_alt170, CB_ASSERTION_END_DATE_FILTER, SET_CB_ASSERTION_END_DATE_FILTER, NIL);
            defviewpoint_internal(MTS, $list_alt175, CB_MTS_FILTER, SET_CB_MTS_FILTER, NIL);
            defviewpoint_internal(MYCREATIONPURPOSE, $list_alt181, CB_MYCREATIONPURPOSE_FILTER, SET_CB_MYCREATIONPURPOSE_FILTER, MYCREATIONPURPOSE_EFFECTIVE_FN);
        }
        return NIL;
    }

    public static SubLObject setup_cb_viewpoint_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_viewpoint$.getGlobalValue(), symbol_function(VIEWPOINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(VIEWPOINT_NAME, _CSETF_VIEWPOINT_NAME);
        def_csetf(VIEWPOINT_SUMMARY_NAME, _CSETF_VIEWPOINT_SUMMARY_NAME);
        def_csetf(VIEWPOINT_LINKABLE_NAME, _CSETF_VIEWPOINT_LINKABLE_NAME);
        def_csetf(VIEWPOINT_LINKNAME_PREFIX, _CSETF_VIEWPOINT_LINKNAME_PREFIX);
        def_csetf(VIEWPOINT_FILTER_GETTER, _CSETF_VIEWPOINT_FILTER_GETTER);
        def_csetf(VIEWPOINT_FILTER_SETTER, _CSETF_VIEWPOINT_FILTER_SETTER);
        def_csetf(VIEWPOINT_TYPE, _CSETF_VIEWPOINT_TYPE);
        def_csetf(VIEWPOINT_ACTIVE_P, _CSETF_VIEWPOINT_ACTIVE_P);
        def_csetf(VIEWPOINT_EFFECTIVE_FN, _CSETF_VIEWPOINT_EFFECTIVE_FN);
        def_csetf(VIEWPOINT_VALUE_PROMPT_FN, _CSETF_VIEWPOINT_VALUE_PROMPT_FN);
        def_csetf(VIEWPOINT_VALUE_UPDATE_FN, _CSETF_VIEWPOINT_VALUE_UPDATE_FN);
        def_csetf(VIEWPOINT_INITIAL_FILTER_VALUE, _CSETF_VIEWPOINT_INITIAL_FILTER_VALUE);
        def_csetf(VIEWPOINT_EFFECTIVE_FN_SLOTNAME, _CSETF_VIEWPOINT_EFFECTIVE_FN_SLOTNAME);
        identity(VIEWPOINT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_viewpoint$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_VIEWPOINT_METHOD));
        declare_defglobal($cb_viewpoint_table$);
        declare_defglobal($cb_viewpoint_summary_alist$);
        sethash($CB_VIEWPOINT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str103$cb_viewpoint_html, NIL));
        html_macros.note_cgi_handler_function(CB_VIEWPOINT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_EV, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_VIEWPOINT_SUMMARY_HANDLER, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_VIEWPOINT_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($VIEWPOINT, CB_LINK_VIEWPOINT, TWO_INTEGER);
        register_html_state_variable($cb_use_mycreator_filter$);
        register_html_state_variable($cb_mycreator_filter$);
        defviewpoint_internal(MYCREATOR, $list163, CB_MYCREATOR_FILTER, SET_CB_MYCREATOR_FILTER, MYCREATOR_EFFECTIVE_FN);
        register_html_state_variable($cb_use_myreviewer_filter$);
        register_html_state_variable($cb_myreviewer_filter$);
        defviewpoint_internal(MYREVIEWER, $list171, CB_MYREVIEWER_FILTER, SET_CB_MYREVIEWER_FILTER, MYREVIEWER_EFFECTIVE_FN);
        register_html_state_variable($cb_use_assertion_start_date_filter$);
        register_html_state_variable($cb_assertion_start_date_filter$);
        defviewpoint_internal(ASSERTION_START_DATE, $list178, CB_ASSERTION_START_DATE_FILTER, SET_CB_ASSERTION_START_DATE_FILTER, NIL);
        register_html_state_variable($cb_use_assertion_end_date_filter$);
        register_html_state_variable($cb_assertion_end_date_filter$);
        defviewpoint_internal(ASSERTION_END_DATE, $list184, CB_ASSERTION_END_DATE_FILTER, SET_CB_ASSERTION_END_DATE_FILTER, NIL);
        register_html_state_variable($cb_use_mts_filter$);
        register_html_state_variable($cb_mts_filter$);
        defviewpoint_internal(MTS, $list189, CB_MTS_FILTER, SET_CB_MTS_FILTER, NIL);
        register_html_state_variable($cb_use_mycreationpurpose_filter$);
        register_html_state_variable($cb_mycreationpurpose_filter$);
        defviewpoint_internal(MYCREATIONPURPOSE, $list195, CB_MYCREATIONPURPOSE_FILTER, SET_CB_MYCREATIONPURPOSE_FILTER, MYCREATIONPURPOSE_EFFECTIVE_FN);
        setup_cb_link_method($EDIT_VIEWPOINT, CB_LINK_EDIT_VIEWPOINT, THREE_INTEGER);
        return NIL;
    }

    static private final SubLString $str_alt51$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    @Override
    public void declareFunctions() {
        declare_cb_viewpoint_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_viewpoint_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_viewpoint_file();
    }

    static private final SubLList $list_alt55 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));

    static {
    }

    static private final SubLString $str_alt56$_A_FILTER = makeString("~A-FILTER");

    static private final SubLString $str_alt57$CB__A = makeString("CB-~A");

    static private final SubLString $str_alt58$SET__A = makeString("SET-~A");

    static private final SubLString $str_alt59$_A_EFFECTIVE_FN = makeString("~A-EFFECTIVE-FN");

    static private final SubLList $list_alt62 = list(NIL, makeString("Automatically generated filter"));

    static private final SubLList $list_alt67 = list(makeSymbol("ASSERTION"));

    static private final SubLList $list_alt68 = list(makeSymbol("PUNLESS"), list(makeSymbol("ASSERTION-P"), makeSymbol("ASSERTION")), list(makeSymbol("BREAK"), makeString("not an assertion")));

    static private final SubLList $list_alt69 = list(makeSymbol("PWHEN"), list(makeSymbol("DOC-PREDICATE-P"), makeSymbol("ASSERTION")), list(RET, T));

    static private final SubLList $list_alt72 = list(list(RET, list(makeSymbol("MEMBER"), list(makeSymbol("FUNCALL"), list(makeSymbol("VIEWPOINT-EFFECTIVE-FN-SLOTNAME"), makeSymbol("VIEWPOINT")), makeSymbol("ASSERTION")), list(makeSymbol("FUNCALL"), list(makeSymbol("VIEWPOINT-FILTER-GETTER"), makeSymbol("VIEWPOINT"))))));

    static private final SubLList $list_alt73 = list(NIL);

    static private final SubLString $str_alt75$activate__A = makeString("activate-~A");

    static private final SubLString $str_alt76$_ = makeString(":");

    static private final SubLString $str_alt79$_D = makeString("~D");

    static private final SubLString $str_alt85$cb_show_cyclist__A = makeString("cb-show-cyclist-~A");

    static private final SubLString $str_alt88$cb_show_cyclist1__A = makeString("cb-show-cyclist1-~A");

    static private final SubLString $str_alt89$cb_show_cyclist2__A = makeString("cb-show-cyclist2-~A");

    static private final SubLString $str_alt90$________ = makeString("--------");

    static private final SubLString $str_alt91$Unknown__A___S = makeString("Unknown ~A: ~S");

    static private final SubLString $str_alt95$project1__A = makeString("project1-~A");

    static private final SubLString $str_alt96$project2__A = makeString("project2-~A");

    static private final SubLString $str_alt97$project3__A = makeString("project3-~A");

    static private final SubLString $str_alt100$cb_viewpoint_html = makeString("cb-viewpoint.html");

    static private final SubLList $list_alt101 = list(makeSymbol("INDEX-SPEC"));

    static private final SubLString $str_alt102$_a_does_not_specify_an_index = makeString("~a does not specify an index");

    static private final SubLString $str_alt105$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt106$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt107$cb_viewpoint_summary_handler = makeString("cb-viewpoint-summary-handler");

    static private final SubLString $str_alt110$always_show_comments = makeString("always-show-comments");

    static private final SubLString $str_alt111$Always_show_comments__regardless_ = makeString("Always show comments, regardless of other filter settings.");

    static private final SubLString $str_alt112$always_show_bookkeeping = makeString("always-show-bookkeeping");

    static private final SubLString $str_alt113$Always_show_bookkeeping_predicate = makeString("Always show bookkeeping predicates, regardless of other filter settings.");

    static private final SubLList $list_alt116 = list(makeSymbol("SUMMARY-NAME"), makeSymbol("INDEX-SPEC"));

    static private final SubLString $str_alt118$cb_viewpoint_handler = makeString("cb-viewpoint-handler");

    public static final class $viewpoint_p$UnaryFunction extends UnaryFunction {
        public $viewpoint_p$UnaryFunction() {
            super(extractFunctionNamed("VIEWPOINT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return viewpoint_p(arg1);
        }
    }

    static private final SubLString $str_alt123$_Viewpoint_ = makeString("[Viewpoint]");

    static private final SubLString $str_alt125$cb_viewpoint__A = makeString("cb-viewpoint&~A");

    static private final SubLString $str_alt128$_ = makeString(" ");

    static private final SubLString $str_alt129$_Filter = makeString(" Filter");

    static private final SubLString $str_alt130$_Only_those_terms_whose_ = makeString("(Only those terms whose ");

    static private final SubLString $str_alt131$_field_has_a_value_equal_to_a_ter = makeString(" field has a value equal to a term below will be presented. Leave blank to disable this filter.)");

    static private final SubLString $str_alt134$all_dates__A = makeString("all-dates-~A");

    static private final SubLString $str_alt136$cb_show_start__A = makeString("cb-show-start-~A");

    static private final SubLString $str_alt142$use_genl_mt = makeString("use-genl-mt");

    static private final SubLString $str_alt144$new_mt = makeString("new-mt");

    static private final SubLList $list_alt149 = list(new SubLObject[]{ makeKeyword("LINKABLE-NAME"), reader_make_constant_shell("myCreator"), $TYPE, makeKeyword("LIST-OF-FORMS"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("VALUE-PROMPT-FN"), makeSymbol("PROMPT-FOR-LIST-OF-CYCLISTS"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("RECEIVE-LIST-OF-CYCLISTS"), makeKeyword("EFFECTIVE-FN-SLOTNAME"), makeSymbol("ASSERTED-BY") });

    static private final SubLList $list_alt157 = list(new SubLObject[]{ makeKeyword("LINKABLE-NAME"), reader_make_constant_shell("myReviewer"), $TYPE, makeKeyword("LIST-OF-FORMS"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("EFFECTIVE-FN-SLOTNAME"), makeSymbol("ASSERTED-REVIEWER"), makeKeyword("VALUE-PROMPT-FN"), makeSymbol("PROMPT-FOR-LIST-OF-CYCLISTS"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("RECEIVE-LIST-OF-CYCLISTS") });

    static private final SubLList $list_alt164 = list(new SubLObject[]{ makeKeyword("LINKNAME-PREFIX"), makeString("After "), makeKeyword("LINKABLE-NAME"), reader_make_constant_shell("myCreationTime"), $TYPE, makeKeyword("SINGLE-SIMPLE-DATE"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("EFFECTIVE-FN"), makeSymbol("ASSERTION-AFTER-DATE"), makeKeyword("VALUE-PROMPT-FN"), makeSymbol("PROMPT-FOR-DATE"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("RECEIVE-DATE"), makeKeyword("INITIAL-FILTER-VALUE"), makeInteger(19800101) });

    static private final SubLList $list_alt170 = list(new SubLObject[]{ makeKeyword("LINKNAME-PREFIX"), makeString("Before "), makeKeyword("LINKABLE-NAME"), reader_make_constant_shell("myCreationTime"), $TYPE, makeKeyword("SINGLE-SIMPLE-DATE"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("EFFECTIVE-FN"), makeSymbol("ASSERTION-BEFORE-DATE"), makeKeyword("VALUE-PROMPT-FN"), makeSymbol("PROMPT-FOR-DATE"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("RECEIVE-DATE"), makeKeyword("INITIAL-FILTER-VALUE"), makeInteger(29991231) });

    static private final SubLList $list_alt175 = list(new SubLObject[]{ makeKeyword("LINKABLE-NAME"), reader_make_constant_shell("Microtheory"), $TYPE, makeKeyword("LIST-OF-FORMS"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("EFFECTIVE-FN"), NIL, makeKeyword("VALUE-PROMPT-FN"), makeSymbol("PROMPT-FOR-MT"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("RECEIVE-MT") });

    static private final SubLList $list_alt181 = list(new SubLObject[]{ makeKeyword("LINKABLE-NAME"), reader_make_constant_shell("myCreationPurpose"), $TYPE, makeKeyword("LIST-OF-FORMS"), makeKeyword("ACTIVE-P"), NIL, makeKeyword("VALUE-PROMPT-FN"), makeSymbol("PROMPT-FOR-CYCBASEDPROJECT"), makeKeyword("VALUE-UPDATE-FN"), makeSymbol("RECEIVE-LIST-OF-PROJECTS"), makeKeyword("EFFECTIVE-FN-SLOTNAME"), makeSymbol("ASSERTED-WHY") });

    static private final SubLList $list_alt186 = list(list(makeSymbol("*ASSERTION-FILTER-HOOK*"), list(makeSymbol("CB-CALC-FILTER-HOOKS"))));

    static private final SubLList $list_alt187 = list(makeSymbol("ANSWER-LIST"), makeSymbol("MT-GETTER"), makeSymbol("GETTER"), makeSymbol("&KEY"), makeSymbol("SPECIFIED-MT"));

    static private final SubLList $list_alt188 = list(makeKeyword("SPECIFIED-MT"));

    static private final SubLList $list_alt194 = list(makeSymbol("ACTIVE-FILTER-P"), list(QUOTE, makeSymbol("MTS")));

    static private final SubLList $list_alt197 = list(makeSymbol("CB-MTS-FILTER-USE-GENLMT"));

    static private final SubLList $list_alt199 = list(makeSymbol("CB-MTS-FILTER"));

    static private final SubLList $list_alt202 = list(makeSymbol("FILTERED"), makeSymbol("UNFILTERED"));

    static private final SubLSymbol $sym203$RESULT = makeUninternedSymbol("RESULT");

    static private final SubLString $str_alt205$cb_ev = makeString("cb-ev");

    static private final SubLString $str_alt207$cb_start_cb_ev = makeString("cb-start|cb-ev");

    static private final SubLString $str_alt208$_a__a__a = makeString("~a&~a&~a");

    static private final SubLString $str_alt209$_a__a = makeString("~a&~a");
}

/**
 * Total time: 662 ms
 */
