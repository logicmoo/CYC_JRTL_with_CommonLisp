/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_utilities.$cb_default_fort_handler$;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_icon_definitions$;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_flush;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-FACETS
 * source file: /cyc/top/cycl/cb-facets.lisp
 * created:     2019/07/03 17:38:14
 */
public final class cb_facets extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt192$ = makeString("");

    public static final class $perspective_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.cb_facets.$perspective_native.this.$name;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.cb_facets.$perspective_native.this.$keyword;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.cb_facets.$perspective_native.this.$displayP_fn;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.cb_facets.$perspective_native.this.$display_fn;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.cb_facets.$perspective_native.this.$display_string;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_facets.$perspective_native.this.$name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_facets.$perspective_native.this.$keyword = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_facets.$perspective_native.this.$displayP_fn = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_facets.$perspective_native.this.$display_fn = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.cb_facets.$perspective_native.this.$display_string = value;
        }

        public SubLObject $name = Lisp.NIL;

        public SubLObject $keyword = Lisp.NIL;

        public SubLObject $displayP_fn = Lisp.NIL;

        public SubLObject $display_fn = Lisp.NIL;

        public SubLObject $display_string = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cb_facets.$perspective_native.class, PERSPECTIVE, PERSPECTIVE_P, $list_alt26, $list_alt27, new String[]{ "$name", "$keyword", "$displayP_fn", "$display_fn", "$display_string" }, $list_alt28, $list_alt29, PRINT_PERSPECTIVE);
    }

    public static final SubLFile me = new cb_facets();



    // deflexical
    @LispMethod(comment = "The default microtheory for the facet tool\ndeflexical")
    private static final SubLSymbol $default_facet_tool_mt$ = makeSymbol("*DEFAULT-FACET-TOOL-MT*");

    // deflexical
    @LispMethod(comment = "The name of the facet tool.\ndeflexical")
    private static final SubLSymbol $cb_facet_tool_name$ = makeSymbol("*CB-FACET-TOOL-NAME*");

    // deflexical
    /**
     * The name of the facet tool's html handler.
     */
    @LispMethod(comment = "The name of the facet tool\'s html handler.\ndeflexical")
    private static final SubLSymbol $cb_facet_tool_handler$ = makeSymbol("*CB-FACET-TOOL-HANDLER*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_perspective$ = makeSymbol("*DTP-PERSPECTIVE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $perspective_type_sort$ = makeSymbol("*PERSPECTIVE-TYPE-SORT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_perspective_action$ = makeSymbol("*DTP-PERSPECTIVE-ACTION*");



    public static final SubLSymbol $facet_tool_mt$ = makeSymbol("*FACET-TOOL-MT*");

    static private final SubLString $$$Facets_Browser = makeString("Facets Browser");

    static private final SubLString $str3$cb_facet = makeString("cb-facet");

    static private final SubLString $str5$facet_browser_gif = makeString("facet-browser.gif");

    static private final SubLString $str6$_Facets_ = makeString("[Facets]");

    private static final SubLSymbol $FACET_BROWSER_DISABLED = makeKeyword("FACET-BROWSER-DISABLED");

    static private final SubLString $str8$facet_browser_disabled_gif = makeString("facet-browser-disabled.gif");

    static private final SubLList $list9 = list(new SubLObject[]{ $TYPE, makeKeyword("INDEX-FORT"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("FACET-BROWSER"), makeKeyword("IMAGE-DISABLED"), makeKeyword("FACET-BROWSER-DISABLED"), makeKeyword("IMAGE-ALT"), makeString("[Facets]"), makeKeyword("EFFECTIVE-FN"), makeSymbol("FORT-P"), makeKeyword("HANDLER"), makeString("cb-facet"), $TOOL, NIL, makeKeyword("TITLE"), makeString("Facets Browser"), makeKeyword("COMMENT"), makeString("Link to the faceting information for FORT") });

    private static final SubLSymbol VFACETS = makeSymbol("VFACETS");

    private static final SubLSymbol ADORNMENT_NAME = makeSymbol("ADORNMENT-NAME");

    static private final SubLString $str14$No_term_provided_ = makeString("No term provided!");

    private static final SubLString $str15$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str16$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str21$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str26$WARNING__You_are_transmitting_ope = makeString("WARNING: You are transmitting operations  Be very careful.");

    private static final SubLSymbol CB_FACET = makeSymbol("CB-FACET");

    private static final SubLSymbol PERSPECTIVE = makeSymbol("PERSPECTIVE");

    private static final SubLSymbol PERSPECTIVE_P = makeSymbol("PERSPECTIVE-P");

    private static final SubLList $list35 = list(makeSymbol("NAME"), makeSymbol("KEYWORD"), makeSymbol("DISPLAY?-FN"), makeSymbol("DISPLAY-FN"), makeSymbol("DISPLAY-STRING"));

    private static final SubLList $list36 = list($NAME, makeKeyword("KEYWORD"), makeKeyword("DISPLAY?-FN"), makeKeyword("DISPLAY-FN"), makeKeyword("DISPLAY-STRING"));

    private static final SubLList $list37 = list(makeSymbol("PERSPECTIVE-NAME"), makeSymbol("PERSPECTIVE-KEYWORD"), makeSymbol("PERSPECTIVE-DISPLAY?-FN"), makeSymbol("PERSPECTIVE-DISPLAY-FN"), makeSymbol("PERSPECTIVE-DISPLAY-STRING"));

    private static final SubLList $list38 = list(makeSymbol("_CSETF-PERSPECTIVE-NAME"), makeSymbol("_CSETF-PERSPECTIVE-KEYWORD"), makeSymbol("_CSETF-PERSPECTIVE-DISPLAY?-FN"), makeSymbol("_CSETF-PERSPECTIVE-DISPLAY-FN"), makeSymbol("_CSETF-PERSPECTIVE-DISPLAY-STRING"));

    private static final SubLSymbol PRINT_PERSPECTIVE = makeSymbol("PRINT-PERSPECTIVE");

    private static final SubLSymbol PERSPECTIVE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PERSPECTIVE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list41 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PERSPECTIVE-P"));

    private static final SubLSymbol PERSPECTIVE_NAME = makeSymbol("PERSPECTIVE-NAME");

    private static final SubLSymbol _CSETF_PERSPECTIVE_NAME = makeSymbol("_CSETF-PERSPECTIVE-NAME");

    private static final SubLSymbol PERSPECTIVE_KEYWORD = makeSymbol("PERSPECTIVE-KEYWORD");

    private static final SubLSymbol _CSETF_PERSPECTIVE_KEYWORD = makeSymbol("_CSETF-PERSPECTIVE-KEYWORD");

    private static final SubLSymbol $sym46$PERSPECTIVE_DISPLAY__FN = makeSymbol("PERSPECTIVE-DISPLAY?-FN");

    private static final SubLSymbol $sym47$_CSETF_PERSPECTIVE_DISPLAY__FN = makeSymbol("_CSETF-PERSPECTIVE-DISPLAY?-FN");

    private static final SubLSymbol PERSPECTIVE_DISPLAY_FN = makeSymbol("PERSPECTIVE-DISPLAY-FN");

    private static final SubLSymbol _CSETF_PERSPECTIVE_DISPLAY_FN = makeSymbol("_CSETF-PERSPECTIVE-DISPLAY-FN");

    private static final SubLSymbol PERSPECTIVE_DISPLAY_STRING = makeSymbol("PERSPECTIVE-DISPLAY-STRING");

    private static final SubLSymbol _CSETF_PERSPECTIVE_DISPLAY_STRING = makeSymbol("_CSETF-PERSPECTIVE-DISPLAY-STRING");

    private static final SubLSymbol $kw54$DISPLAY__FN = makeKeyword("DISPLAY?-FN");

    private static final SubLString $str57$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PERSPECTIVE = makeSymbol("MAKE-PERSPECTIVE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PERSPECTIVE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PERSPECTIVE-METHOD");

    private static final SubLString $str64$_ = makeString("#");

    static private final SubLList $list65 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));

    private static final SubLSymbol $sym66$NEW_PERSPECTIVE = makeUninternedSymbol("NEW-PERSPECTIVE");

    private static final SubLSymbol $perspectives_by_keyword$ = makeSymbol("*PERSPECTIVES-BY-KEYWORD*");

    private static final SubLSymbol $perspectives$ = makeSymbol("*PERSPECTIVES*");

    private static final SubLList $list76 = list(makeSymbol("*PERSPECTIVES*"), list(makeSymbol("FUNCTION"), EQUAL), list(makeSymbol("FUNCTION"), makeSymbol("PERSPECTIVE-NAME")));

    private static final SubLList $list77 = list(makeKeyword("DISPLAY"), list(makeKeyword("AS-INDIVIDUAL"), makeKeyword("AS-COLLECTION")), makeKeyword("DEFAULT"), list(makeKeyword("AS-COLLECTION"), makeKeyword("AS-INDIVIDUAL")));

    private static final SubLList $list78 = list(makeKeyword("KEYWORD"), makeKeyword("AS-INDIVIDUAL"), makeKeyword("DISPLAY?-FN"), makeSymbol("SHOW-AS-INDIVIDUAL?"), makeKeyword("DISPLAY-FN"), makeSymbol("HTML-SHOW-AS-INDIVIDUAL"), makeKeyword("DISPLAY-STRING"), makeString("Individual"));

    private static final SubLSymbol AS_INDIVIDUAL = makeSymbol("AS-INDIVIDUAL");

    private static final SubLString $str80$100_ = makeString("100%");

    private static final SubLSymbol $sym82$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE>");

    private static final SubLSymbol $sym83$FORT_NAME_ = makeSymbol("FORT-NAME<");

    private static final SubLString $str84$6_ = makeString("6%");



    private static final SubLString $$$i_ = makeString("i ");

    private static final SubLSymbol $ADD_SUP_FROM = makeKeyword("ADD-SUP-FROM");

    private static final SubLString $$$x_ = makeString("x ");

    private static final SubLList $list94 = list(makeKeyword("KEYWORD"), makeKeyword("AS-COLLECTION"), makeKeyword("DISPLAY?-FN"), makeSymbol("SHOW-AS-COLLECTION?"), makeKeyword("DISPLAY-FN"), makeSymbol("HTML-SHOW-AS-COLLECTION"), makeKeyword("DISPLAY-STRING"), makeString("Collection"));

    private static final SubLSymbol AS_COLLECTION = makeSymbol("AS-COLLECTION");



    private static final SubLString $str99$__genls__ = makeString("* genls: ");

    private static final SubLString $$$in_Mt = makeString("in Mt");

    private static final SubLString $$$Unassert = makeString("Unassert");

    private static final SubLString $str103$__coextensional_ = makeString(" (coextensional)");

    private static final SubLString $str108$__faceted_specs__ = makeString("* faceted specs: ");

    private static final SubLSymbol $FACET_ID_SELECTED = makeKeyword("FACET-ID-SELECTED");

    private static final SubLString $str111$_A_SPEC = makeString("~A-SPEC");

    private static final SubLString $str112$_A_SPEC_SELECTED = makeString("~A-SPEC-SELECTED");

    private static final SubLSymbol $kw113$SPECS_FACETED_ = makeKeyword("SPECS-FACETED?");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLSymbol $kw116$SPECS_UNFACETED_ = makeKeyword("SPECS-UNFACETED?");

    private static final SubLString $str117$__unfaceted_specs__ = makeString("* unfaceted specs: ");

    private static final SubLString $str119$____ = makeString("|__ ");

    private static final SubLString $str120$_unfaceted_specs_not_shown_ = makeString(" unfaceted specs not shown.");



    private static final SubLString $str123$__instances__ = makeString("* instances: ");

    private static final SubLString $str125$_instances_not_shown_ = makeString(" instances not shown.");

    private static final SubLSymbol PERSPECTIVE_ACTION = makeSymbol("PERSPECTIVE-ACTION");

    private static final SubLSymbol PERSPECTIVE_ACTION_P = makeSymbol("PERSPECTIVE-ACTION-P");

    private static final SubLList $list128 = list(makeSymbol("NAME"), makeSymbol("KEYWORD"), makeSymbol("ORDER-NUM"), makeSymbol("PERSPECTIVE"), makeSymbol("DISPLAY?-FN"), makeSymbol("DISPLAY-FN"), makeSymbol("HANDLER?-FN"), makeSymbol("HANDLER-FN"));

    private static final SubLList $list129 = list($NAME, makeKeyword("KEYWORD"), makeKeyword("ORDER-NUM"), makeKeyword("PERSPECTIVE"), makeKeyword("DISPLAY?-FN"), makeKeyword("DISPLAY-FN"), makeKeyword("HANDLER?-FN"), makeKeyword("HANDLER-FN"));

    private static final SubLList $list130 = list(makeSymbol("PERSPECTIVE-ACTION-NAME"), makeSymbol("PERSPECTIVE-ACTION-KEYWORD"), makeSymbol("PERSPECTIVE-ACTION-ORDER-NUM"), makeSymbol("PERSPECTIVE-ACTION-PERSPECTIVE"), makeSymbol("PERSPECTIVE-ACTION-DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-HANDLER-FN"));

    private static final SubLList $list131 = list(makeSymbol("_CSETF-PERSPECTIVE-ACTION-NAME"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-KEYWORD"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-ORDER-NUM"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-PERSPECTIVE"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-DISPLAY?-FN"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-DISPLAY-FN"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-HANDLER?-FN"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-HANDLER-FN"));

    private static final SubLSymbol PRINT_PERSPECTIVE_ACTION = makeSymbol("PRINT-PERSPECTIVE-ACTION");

    private static final SubLSymbol PERSPECTIVE_ACTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PERSPECTIVE-ACTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list134 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PERSPECTIVE-ACTION-P"));

    private static final SubLSymbol PERSPECTIVE_ACTION_NAME = makeSymbol("PERSPECTIVE-ACTION-NAME");

    private static final SubLSymbol _CSETF_PERSPECTIVE_ACTION_NAME = makeSymbol("_CSETF-PERSPECTIVE-ACTION-NAME");

    private static final SubLSymbol PERSPECTIVE_ACTION_KEYWORD = makeSymbol("PERSPECTIVE-ACTION-KEYWORD");

    private static final SubLSymbol _CSETF_PERSPECTIVE_ACTION_KEYWORD = makeSymbol("_CSETF-PERSPECTIVE-ACTION-KEYWORD");

    private static final SubLSymbol PERSPECTIVE_ACTION_ORDER_NUM = makeSymbol("PERSPECTIVE-ACTION-ORDER-NUM");

    private static final SubLSymbol _CSETF_PERSPECTIVE_ACTION_ORDER_NUM = makeSymbol("_CSETF-PERSPECTIVE-ACTION-ORDER-NUM");

    private static final SubLSymbol PERSPECTIVE_ACTION_PERSPECTIVE = makeSymbol("PERSPECTIVE-ACTION-PERSPECTIVE");

    private static final SubLSymbol _CSETF_PERSPECTIVE_ACTION_PERSPECTIVE = makeSymbol("_CSETF-PERSPECTIVE-ACTION-PERSPECTIVE");

    private static final SubLSymbol $sym143$PERSPECTIVE_ACTION_DISPLAY__FN = makeSymbol("PERSPECTIVE-ACTION-DISPLAY?-FN");

    private static final SubLSymbol $sym144$_CSETF_PERSPECTIVE_ACTION_DISPLAY__FN = makeSymbol("_CSETF-PERSPECTIVE-ACTION-DISPLAY?-FN");

    private static final SubLSymbol PERSPECTIVE_ACTION_DISPLAY_FN = makeSymbol("PERSPECTIVE-ACTION-DISPLAY-FN");

    private static final SubLSymbol _CSETF_PERSPECTIVE_ACTION_DISPLAY_FN = makeSymbol("_CSETF-PERSPECTIVE-ACTION-DISPLAY-FN");

    private static final SubLSymbol $sym147$PERSPECTIVE_ACTION_HANDLER__FN = makeSymbol("PERSPECTIVE-ACTION-HANDLER?-FN");

    private static final SubLSymbol $sym148$_CSETF_PERSPECTIVE_ACTION_HANDLER__FN = makeSymbol("_CSETF-PERSPECTIVE-ACTION-HANDLER?-FN");

    private static final SubLSymbol PERSPECTIVE_ACTION_HANDLER_FN = makeSymbol("PERSPECTIVE-ACTION-HANDLER-FN");

    private static final SubLSymbol _CSETF_PERSPECTIVE_ACTION_HANDLER_FN = makeSymbol("_CSETF-PERSPECTIVE-ACTION-HANDLER-FN");

    private static final SubLSymbol $kw152$HANDLER__FN = makeKeyword("HANDLER?-FN");

    private static final SubLSymbol MAKE_PERSPECTIVE_ACTION = makeSymbol("MAKE-PERSPECTIVE-ACTION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PERSPECTIVE_ACTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PERSPECTIVE-ACTION-METHOD");

    private static final SubLSymbol $sym156$NEW_PERSPECTIVE_ACTION = makeUninternedSymbol("NEW-PERSPECTIVE-ACTION");

    private static final SubLSymbol $perspective_actions$ = makeSymbol("*PERSPECTIVE-ACTIONS*");

    private static final SubLList $list158 = list(makeSymbol("*PERSPECTIVE-ACTIONS*"), list(makeSymbol("FUNCTION"), EQUAL), list(makeSymbol("FUNCTION"), makeSymbol("PERSPECTIVE-ACTION-NAME")));

    private static final SubLSymbol $sym159$_ = makeSymbol("<");

    private static final SubLList $list160 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("CHANGE-PERSPECTIVE"), makeKeyword("ORDER-NUM"), TEN_INTEGER, makeKeyword("PERSPECTIVE"), makeKeyword("GLOBAL-TOP"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-HANDLER") });

    private static final SubLSymbol CHANGE_PERSPECTIVE = makeSymbol("CHANGE-PERSPECTIVE");

    private static final SubLString $str162$__A_ = makeString("[~A]");

    private static final SubLString $str163$_A__A = makeString("~A?~A");

    private static final SubLList $list166 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("SHOW-DEFINITION"), makeKeyword("ORDER-NUM"), TWENTY_INTEGER, makeKeyword("PERSPECTIVE"), makeKeyword("GLOBAL-TOP"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-SHOW-DEFINITION-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-SHOW-DEFINITION-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-SHOW-DEFINITION-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-SHOW-DEFINITION-HANDLER") });

    private static final SubLSymbol SHOW_DEFINITION = makeSymbol("SHOW-DEFINITION");

    private static final SubLString $str169$_Show_ = makeString("(Show ");

    private static final SubLString $str170$_in_Index_Browser_ = makeString(" in Index Browser)");



    private static final SubLString $$$Defined_in_ = makeString("Defined in ");

    private static final SubLString $$$_ = makeString(" ");



    private static final SubLString $str178$No_comment_ = makeString("No comment.");

    private static final SubLString $str179$__isa__ = makeString("* isa: ");

    private static final SubLString $str180$Undefined_in_current_Mt_ = makeString("Undefined in current Mt.");

    static private final SubLList $list182 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("ADD-FORT-TO-CHOSEN-COLS"), makeKeyword("ORDER-NUM"), makeInteger(30), makeKeyword("PERSPECTIVE"), makeKeyword("AS-INDIVIDUAL"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-HANDLER") });

    private static final SubLSymbol ADD_FORT_TO_CHOSEN_COLS = makeSymbol("ADD-FORT-TO-CHOSEN-COLS");

    private static final SubLString $str184$__Make_ = makeString("* Make ");

    private static final SubLString $str185$_a_direct_instance_of_selected_co = makeString(" a direct instance of selected collections. ");

    private static final SubLString $$$Go = makeString("Go");

    private static final SubLSymbol $ADD_FORT_TO_CHOSEN_COLS_GO = makeKeyword("ADD-FORT-TO-CHOSEN-COLS-GO");

    private static final SubLList $list189 = list(makeKeyword("NO-COLLECTIONS-CHOSEN"));

    private static final SubLList $list190 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("ADD-SPECS-TO-FACET"), makeKeyword("ORDER-NUM"), makeInteger(40), makeKeyword("PERSPECTIVE"), makeKeyword("AS-COLLECTION"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-HANDLER") });

    private static final SubLSymbol ADD_SPECS_TO_FACET = makeSymbol("ADD-SPECS-TO-FACET");

    private static final SubLString $str192$__Add_selected_spec_s__to_selecte = makeString("* Add selected spec(s) to selected facet ");

    private static final SubLSymbol $ADD_SPECS_TO_FACET_GO = makeKeyword("ADD-SPECS-TO-FACET-GO");

    private static final SubLList $list194 = list(makeKeyword("NO-SPEC-CHOSEN"));

    private static final SubLList $list195 = list(makeKeyword("NO-FACET-CHOSEN"));

    private static final SubLSymbol $UNSUPPORTED_FACET_CHOSEN = makeKeyword("UNSUPPORTED-FACET-CHOSEN");

    private static final SubLString $str197$_A_assertions_must_currently_be_h = makeString("~A assertions must currently be hand edited.");

    private static final SubLList $list198 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("ADD-SPECS-TO-NEW-FACET"), makeKeyword("ORDER-NUM"), makeInteger(50), makeKeyword("PERSPECTIVE"), makeKeyword("AS-COLLECTION"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-HANDLER") });

    private static final SubLSymbol ADD_SPECS_TO_NEW_FACET = makeSymbol("ADD-SPECS-TO-NEW-FACET");

    private static final SubLString $str200$__Make_a_new_facet_with_selected_ = makeString("* Make a new facet with selected spec(s) as instances ");

    private static final SubLSymbol $ADD_SPECS_TO_NEW_FACET_GO = makeKeyword("ADD-SPECS-TO-NEW-FACET-GO");

    private static final SubLString $str202$New_facet_name__ = makeString("New facet name: ");

    private static final SubLString $$$TypeBy = makeString("TypeBy");

    private static final SubLSymbol $NEW_FACET_NAME = makeKeyword("NEW-FACET-NAME");

    private static final SubLString $str205$ = makeString("");

    private static final SubLString $str206$New_facet_type__ = makeString("New facet type: ");

    private static final SubLSymbol $NEW_FACET_TYPE = makeKeyword("NEW-FACET-TYPE");

    private static final SubLObject $$facets_Generic = reader_make_constant_shell("facets-Generic");

    private static final SubLString $$$_generic_ = makeString(" generic ");

    private static final SubLObject $$facets_Strict = reader_make_constant_shell("facets-Strict");

    private static final SubLString $$$_strict_ = makeString(" strict ");

    private static final SubLObject $$facets_Covering = reader_make_constant_shell("facets-Covering");

    private static final SubLString $$$_covering_ = makeString(" covering ");

    private static final SubLObject $$facets_Partition = reader_make_constant_shell("facets-Partition");

    private static final SubLString $$$_partition_ = makeString(" partition ");

    static private final SubLList $list216 = list(makeKeyword("NO-FACET-TYPE-CHOSEN"));

    static private final SubLList $list217 = list(makeKeyword("NO-FACET-NAME-CHOSEN"));

    private static final SubLString $str218$_ATypeBy_A = makeString("~ATypeBy~A");

    private static final SubLList $list219 = list(reader_make_constant_shell("DisjointCollectionType"));

    private static final SubLList $list220 = list(reader_make_constant_shell("CollectionType"));

    private static final SubLList $list221 = list(reader_make_constant_shell("ConventionalClassificationType"));

    private static final SubLString $str222$A_collection_of_collections__Each = makeString("A collection of collections. Each instance is a spec of ~A whose instances are all of the same ~A.");

    static private final SubLList $list223 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC"), makeKeyword("ORDER-NUM"), makeInteger(60), makeKeyword("PERSPECTIVE"), makeKeyword("AS-COLLECTION"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-HANDLER") });

    private static final SubLSymbol MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC = makeSymbol("MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC");

    private static final SubLString $str225$__Make_selected_spec_s__direct_sp = makeString("* Make selected spec(s) direct specs of specified collection or new spec");

    private static final SubLSymbol $MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC_GO = makeKeyword("MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-GO");

    private static final SubLString $str227$Collection_or_new_spec_name__ = makeString("Collection or new spec name: ");

    private static final SubLSymbol $NEW_SPEC_NAME = makeKeyword("NEW-SPEC-NAME");

    static private final SubLList $list229 = list(makeKeyword("INVALID-SPEC-NAME"));

    static private final SubLList $list230 = list(reader_make_constant_shell("Collection"));

    private static final SubLList $list231 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS"), makeKeyword("ORDER-NUM"), makeInteger(60), makeKeyword("PERSPECTIVE"), makeKeyword("AS-COLLECTION"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-HANDLER") });

    private static final SubLSymbol MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS = makeSymbol("MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS");

    private static final SubLString $str233$__Make_selected_unfaceted_spec_s_ = makeString("* Make selected unfaceted spec(s) direct specs of selected faceted spec(s)");

    private static final SubLSymbol $MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS_GO = makeKeyword("MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-GO");

    private static final SubLList $list235 = list(makeKeyword("NO-UNFACETED-SPECS-CHOSEN"));

    private static final SubLList $list236 = list(makeKeyword("NO-FACETED-SPECS-CHOSEN"));

    static private final SubLList $list237 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("ADD-INSTANCES-TO-SPECS"), makeKeyword("ORDER-NUM"), makeInteger(70), makeKeyword("PERSPECTIVE"), makeKeyword("AS-COLLECTION"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-HANDLER") });

    private static final SubLSymbol ADD_INSTANCES_TO_SPECS = makeSymbol("ADD-INSTANCES-TO-SPECS");

    private static final SubLString $str239$__Add_selected_instance_s__to_sel = makeString("* Add selected instance(s) to selected spec(s)");

    private static final SubLSymbol $ADD_INSTANCES_TO_SPECS_GO = makeKeyword("ADD-INSTANCES-TO-SPECS-GO");

    private static final SubLList $list241 = list(makeKeyword("NO-SPECS-CHOSEN"));

    private static final SubLList $list242 = list(makeKeyword("NO-INSTANCES-CHOSEN"));

    private static final SubLList $list243 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("UNASSERT"), makeKeyword("ORDER-NUM"), ZERO_INTEGER, makeKeyword("PERSPECTIVE"), NIL, makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-UNASSERT-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-UNASSERT-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-UNASSERT-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-UNASSERT-HANDLER") });

    private static final SubLSymbol UNASSERT = makeSymbol("UNASSERT");

    private static final SubLList $list245 = list(reader_make_constant_shell("Thing"));

    private static final SubLList $list246 = list(reader_make_constant_shell("CollectionTypeType"));







    private static final SubLList $list250 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("CHANGE-MT"), makeKeyword("ORDER-NUM"), makeInteger(100), makeKeyword("PERSPECTIVE"), makeKeyword("GLOBAL-BOTTOM"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-MT-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-MT-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-MT-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-MT-HANDLER") });

    private static final SubLSymbol CHANGE_MT = makeSymbol("CHANGE-MT");

    private static final SubLString $str253$__Change_current_Mt_from_ = makeString("* Change current Mt from ");

    private static final SubLSymbol $CHANGE_MT_GO = makeKeyword("CHANGE-MT-GO");

    private static final SubLString $str255$_New_Mt_name__ = makeString(" New Mt name: ");



    private static final SubLString $$$Complete = makeString("Complete");



    private static final SubLList $list260 = list(makeString("-"));

    private static final SubLString $str261$_A___A = makeString("~A: ~A");

    private static final SubLString $str262$Errors_found_ = makeString("Errors found:");

    private static final SubLString $str264$Actions_taken_ = makeString("Actions taken:");

    private static final SubLString $str266$_A_in__A = makeString("~A in ~A");

    private static final SubLString $str268$_A_from__A = makeString("~A from ~A");

    /**
     * Show the facet tool page.  This is the only html-handler for the facet tool, and is it's own HTML form handler.
     */
    @LispMethod(comment = "Show the facet tool page.  This is the only html-handler for the facet tool, and is it\'s own HTML form handler.")
    public static final SubLObject cb_facet_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject arghash = html_arghash.arglist_to_arghash(args);
                if (NIL == forts.fort_p(html_arghash.get_arghash_value($FORT, arghash))) {
                    html_arghash.set_arghash_value($FORT, arghash, html_arghash.get_arghash_value($JUST_FORT, arghash));
                }
                if (NIL == forts.fort_p(html_arghash.get_arghash_value($FORT, arghash))) {
                    html_princ($str_alt14$No_term_provided_);
                    html_newline(UNPROVIDED);
                    return NIL;
                }
                arghash = perspective_actions_handler(arghash);
                {
                    SubLObject title_var = $cb_facet_tool_name$.getGlobalValue();
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
                                SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                        html_markup($str_alt17$yui_skin_sam);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            dhtml_macros.dhtml_with_toggle_visibility_support();
                                            dhtml_macros.dhtml_with_dom_script();
                                            html_arghash_possibly_show_errors(arghash);
                                            html_arghash_possibly_show_successes(arghash);
                                            cb_browser.cb_term_page_heading(html_arghash.get_arghash_value($FORT, arghash), VFACETS);
                                            html_hr(UNPROVIDED, UNPROVIDED);
                                            if (NIL != operation_communication.transmittingP()) {
                                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                if (NIL != html_macros.$html_color_sat_red$.getDynamicValue(thread)) {
                                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_color(html_macros.$html_color_sat_red$.getDynamicValue(thread)));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_princ($str_alt18$WARNING__You_are_transmitting_ope);
                                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                html_newline(TWO_INTEGER);
                                            }
                                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            if (true) {
                                                html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($POST);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($cb_facet_tool_handler$.getGlobalValue(), T, UNPROVIDED);
                                                    html_arghash.html_arghash_hidden_input(arghash, $FORT, UNPROVIDED, UNPROVIDED);
                                                    html_arghash.html_arghash_hidden_input(arghash, $PERSPECTIVE, UNPROVIDED, UNPROVIDED);
                                                    arghash = display_perspective_actions_for_perspective($GLOBAL_TOP, arghash);
                                                    {
                                                        SubLObject perspective = html_arghash.get_arghash_value($PERSPECTIVE, arghash);
                                                        if (NIL != perspective) {
                                                            {
                                                                SubLObject display_fn = perspective_display_fn(gethash(perspective, $perspectives_by_keyword$.getDynamicValue(thread), UNPROVIDED));
                                                                if (NIL != display_fn) {
                                                                    arghash = funcall(display_fn, arghash);
                                                                }
                                                            }
                                                            arghash = display_perspective_actions_for_perspective(perspective, arghash);
                                                        }
                                                    }
                                                    arghash = display_perspective_actions_for_perspective($GLOBAL_BOTTOM, arghash);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                            html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
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
    }

    /**
     * Show the facet tool page.  This is the only html-handler for the facet tool, and is it's own HTML form handler.
     */
    @LispMethod(comment = "Show the facet tool page.  This is the only html-handler for the facet tool, and is it\'s own HTML form handler.")
    public static SubLObject cb_facet(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arghash = html_arghash.arglist_to_arghash(args);
        if (NIL == forts.fort_p(html_arghash.get_arghash_value($FORT, arghash))) {
            html_arghash.set_arghash_value($FORT, arghash, html_arghash.get_arghash_value($JUST_FORT, arghash));
        }
        if (NIL == forts.fort_p(html_arghash.get_arghash_value($FORT, arghash))) {
            html_princ($str14$No_term_provided_);
            html_newline(UNPROVIDED);
            return NIL;
        }
        arghash = perspective_actions_handler(arghash);
        final SubLObject title_var = $cb_facet_tool_name$.getGlobalValue();
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str15$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str16$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str21$yui_skin_sam);
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
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        dhtml_macros.dhtml_with_dom_script();
                        html_arghash_possibly_show_errors(arghash);
                        html_arghash_possibly_show_successes(arghash);
                        cb_browser.cb_term_page_heading(html_arghash.get_arghash_value($FORT, arghash), VFACETS);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        if (NIL != operation_communication.transmittingP()) {
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($str26$WARNING__You_are_transmitting_ope);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                        }
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($POST);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($cb_facet_tool_handler$.getGlobalValue(), T, UNPROVIDED);
                            html_arghash.html_arghash_hidden_input(arghash, $FORT, UNPROVIDED, UNPROVIDED);
                            html_arghash.html_arghash_hidden_input(arghash, $PERSPECTIVE, UNPROVIDED, UNPROVIDED);
                            arghash = display_perspective_actions_for_perspective($GLOBAL_TOP, arghash);
                            final SubLObject perspective = html_arghash.get_arghash_value($PERSPECTIVE, arghash);
                            if (NIL != perspective) {
                                final SubLObject display_fn = perspective_display_fn(gethash(perspective, $perspectives_by_keyword$.getDynamicValue(thread), UNPROVIDED));
                                if (NIL != display_fn) {
                                    arghash = funcall(display_fn, arghash);
                                }
                                arghash = display_perspective_actions_for_perspective(perspective, arghash);
                            }
                            arghash = display_perspective_actions_for_perspective($GLOBAL_BOTTOM, arghash);
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

    public static final SubLObject cb_facet_form_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $cb_default_fort_handler$.currentBinding(thread);
                try {
                    $cb_default_fort_handler$.bind($cb_facet_tool_handler$.getGlobalValue(), thread);
                    cb_form(v_object, UNPROVIDED, UNPROVIDED);
                } finally {
                    $cb_default_fort_handler$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_facet_form(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_default_fort_handler$.currentBinding(thread);
        try {
            $cb_default_fort_handler$.bind($cb_facet_tool_handler$.getGlobalValue(), thread);
            cb_form(v_object, UNPROVIDED, UNPROVIDED);
        } finally {
            $cb_default_fort_handler$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject perspective_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_perspective(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject perspective_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_perspective(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject perspective_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cb_facets.$perspective_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject perspective_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cb_facets.$perspective_native.class ? T : NIL;
    }

    public static final SubLObject perspective_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_P);
        return v_object.getField2();
    }

    public static SubLObject perspective_name(final SubLObject v_object) {
        assert NIL != perspective_p(v_object) : "! cb_facets.perspective_p(v_object) " + "cb_facets.perspective_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject perspective_keyword_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_P);
        return v_object.getField3();
    }

    public static SubLObject perspective_keyword(final SubLObject v_object) {
        assert NIL != perspective_p(v_object) : "! cb_facets.perspective_p(v_object) " + "cb_facets.perspective_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject perspective_displayP_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_P);
        return v_object.getField4();
    }

    public static SubLObject perspective_displayP_fn(final SubLObject v_object) {
        assert NIL != perspective_p(v_object) : "! cb_facets.perspective_p(v_object) " + "cb_facets.perspective_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject perspective_display_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_P);
        return v_object.getField5();
    }

    public static SubLObject perspective_display_fn(final SubLObject v_object) {
        assert NIL != perspective_p(v_object) : "! cb_facets.perspective_p(v_object) " + "cb_facets.perspective_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject perspective_display_string_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_P);
        return v_object.getField6();
    }

    public static SubLObject perspective_display_string(final SubLObject v_object) {
        assert NIL != perspective_p(v_object) : "! cb_facets.perspective_p(v_object) " + "cb_facets.perspective_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_perspective_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_perspective_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_p(v_object) : "! cb_facets.perspective_p(v_object) " + "cb_facets.perspective_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_perspective_keyword_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_perspective_keyword(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_p(v_object) : "! cb_facets.perspective_p(v_object) " + "cb_facets.perspective_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_perspective_displayP_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_perspective_displayP_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_p(v_object) : "! cb_facets.perspective_p(v_object) " + "cb_facets.perspective_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_perspective_display_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_perspective_display_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_p(v_object) : "! cb_facets.perspective_p(v_object) " + "cb_facets.perspective_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_perspective_display_string_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_perspective_display_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_p(v_object) : "! cb_facets.perspective_p(v_object) " + "cb_facets.perspective_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_perspective_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cb_facets.$perspective_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_perspective_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($KEYWORD)) {
                            _csetf_perspective_keyword(v_new, current_value);
                        } else {
                            if (pcase_var.eql($kw44$DISPLAY__FN)) {
                                _csetf_perspective_displayP_fn(v_new, current_value);
                            } else {
                                if (pcase_var.eql($DISPLAY_FN)) {
                                    _csetf_perspective_display_fn(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($DISPLAY_STRING)) {
                                        _csetf_perspective_display_string(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_perspective(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cb_facets.$perspective_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_perspective_name(v_new, current_value);
            } else
                if (pcase_var.eql($KEYWORD)) {
                    _csetf_perspective_keyword(v_new, current_value);
                } else
                    if (pcase_var.eql($kw54$DISPLAY__FN)) {
                        _csetf_perspective_displayP_fn(v_new, current_value);
                    } else
                        if (pcase_var.eql($DISPLAY_FN)) {
                            _csetf_perspective_display_fn(v_new, current_value);
                        } else
                            if (pcase_var.eql($DISPLAY_STRING)) {
                                _csetf_perspective_display_string(v_new, current_value);
                            } else {
                                Errors.error($str57$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_perspective(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PERSPECTIVE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, perspective_name(obj));
        funcall(visitor_fn, obj, $SLOT, $KEYWORD, perspective_keyword(obj));
        funcall(visitor_fn, obj, $SLOT, $kw54$DISPLAY__FN, perspective_displayP_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $DISPLAY_FN, perspective_display_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $DISPLAY_STRING, perspective_display_string(obj));
        funcall(visitor_fn, obj, $END, MAKE_PERSPECTIVE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_perspective_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_perspective(obj, visitor_fn);
    }

    public static final SubLObject print_perspective_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
                princ($str_alt49$_, stream);
            } else {
                if (NIL != $print_readably$.getDynamicValue(thread)) {
                    print_not_readable(v_object, stream);
                } else {
                    {
                        SubLObject v_object_5 = v_object;
                        SubLObject stream_6 = stream;
                        write_string($str_alt50$__, stream_6, UNPROVIDED, UNPROVIDED);
                        write(type_of(v_object_5), new SubLObject[]{ $STREAM, stream_6 });
                        write_char(CHAR_space, stream_6);
                        princ(perspective_name(v_object), stream);
                        write_char(CHAR_greater, stream_6);
                    }
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_perspective(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
            princ($str64$_, stream);
        } else
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
                princ(perspective_name(v_object), stream);
                print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
            }

        return v_object;
    }

    /**
     * Define a new perspective.
     */
    @LispMethod(comment = "Define a new perspective.")
    public static final SubLObject defperspective_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt53);
            name = current.first();
            current = current.rest();
            {
                SubLObject arglist = current;
                SubLObject new_perspective = $sym54$NEW_PERSPECTIVE;
                return list(CLET, list(list(new_perspective, list(MAKE_PERSPECTIVE, list(QUOTE, arglist)))), list(CSETF, list(PERSPECTIVE_NAME, new_perspective), list(QUOTE, name)), list(SETHASH, list(PERSPECTIVE_KEYWORD, new_perspective), $perspectives_by_keyword$, new_perspective), list(CSETQ, $perspectives$, list(CONS, new_perspective, listS(DELETE, list(QUOTE, name), $list_alt65))));
            }
        }
    }

    /**
     * Define a new perspective.
     */
    @LispMethod(comment = "Define a new perspective.")
    public static SubLObject defperspective(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list65);
        name = current.first();
        final SubLObject arglist;
        current = arglist = current.rest();
        final SubLObject new_perspective = $sym66$NEW_PERSPECTIVE;
        return list(CLET, list(list(new_perspective, list(MAKE_PERSPECTIVE, list(QUOTE, arglist)))), list(CSETF, list(PERSPECTIVE_NAME, new_perspective), list(QUOTE, name)), list(SETHASH, list(PERSPECTIVE_KEYWORD, new_perspective), $perspectives_by_keyword$, new_perspective), list(CSETQ, $perspectives$, list(CONS, new_perspective, listS(DELETE, list(QUOTE, name), $list76))));
    }

    public static final SubLObject perspective_from_keyword_alt(SubLObject perspective_keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject perspective = gethash(perspective_keyword, $perspectives_by_keyword$.getDynamicValue(thread), UNPROVIDED);
                return perspective;
            }
        }
    }

    public static SubLObject perspective_from_keyword(final SubLObject perspective_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject perspective = gethash(perspective_keyword, $perspectives_by_keyword$.getDynamicValue(thread), UNPROVIDED);
        return perspective;
    }

    public static final SubLObject relevant_perspectives_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relevant_perspectives = NIL;
                SubLObject cdolist_list_var = $perspectives$.getDynamicValue(thread);
                SubLObject perspective = NIL;
                for (perspective = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , perspective = cdolist_list_var.first()) {
                    {
                        SubLObject perspective_test = perspective_displayP_fn(perspective);
                        if (NIL != funcall(perspective_test, arghash)) {
                            relevant_perspectives = cons(perspective, relevant_perspectives);
                        }
                    }
                }
                return nreverse(relevant_perspectives);
            }
        }
    }

    public static SubLObject relevant_perspectives(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relevant_perspectives = NIL;
        SubLObject cdolist_list_var = $perspectives$.getDynamicValue(thread);
        SubLObject perspective = NIL;
        perspective = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject perspective_test = perspective_displayP_fn(perspective);
            if (NIL != funcall(perspective_test, arghash)) {
                relevant_perspectives = cons(perspective, relevant_perspectives);
            }
            cdolist_list_var = cdolist_list_var.rest();
            perspective = cdolist_list_var.first();
        } 
        return nreverse(relevant_perspectives);
    }

    public static final SubLObject perspective_from_keyword_relevantP_alt(SubLObject perspective_keyword, SubLObject arghash) {
        {
            SubLObject perspective = perspective_from_keyword(perspective_keyword);
            if (NIL == perspective_p(perspective)) {
                return NIL;
            }
            {
                SubLObject perspective_displayP_fn = perspective_displayP_fn(perspective);
                return funcall(perspective_displayP_fn, arghash);
            }
        }
    }

    public static SubLObject perspective_from_keyword_relevantP(final SubLObject perspective_keyword, final SubLObject arghash) {
        final SubLObject perspective = perspective_from_keyword(perspective_keyword);
        if (NIL == perspective_p(perspective)) {
            return NIL;
        }
        final SubLObject perspective_displayP_fn = perspective_displayP_fn(perspective);
        return funcall(perspective_displayP_fn, arghash);
    }

    public static final SubLObject show_as_individualP_alt(SubLObject arghash) {
        return T;
    }

    public static SubLObject show_as_individualP(final SubLObject arghash) {
        return T;
    }

    public static final SubLObject html_show_as_individual_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
                SubLObject v_facets = facets.all_facets_with_mt(fort, $facet_tool_mt$.getDynamicValue(thread));
                if (NIL != v_facets) {
                    {
                        SubLObject cdolist_list_var = v_facets;
                        SubLObject facet = NIL;
                        for (facet = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , facet = cdolist_list_var.first()) {
                            html_flush();
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
                            if (NIL != html_macros.$html_color_light_purple$.getDynamicValue(thread)) {
                                html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_color_light_purple$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str_alt69$100_);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_print_facet_block(fort, facet, arghash);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                        }
                    }
                }
            }
            return arghash;
        }
    }

    public static SubLObject html_show_as_individual(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
        final SubLObject v_facets = facets.all_facets_with_mt(fort, $facet_tool_mt$.getDynamicValue(thread));
        if (NIL != v_facets) {
            SubLObject cdolist_list_var = v_facets;
            SubLObject facet = NIL;
            facet = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_flush();
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
                if (NIL != html_macros.$html_color_light_purple$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_light_purple$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_markup(html_macros.$html_table_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str80$100_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_print_facet_block(fort, facet, arghash);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                facet = cdolist_list_var.first();
            } 
        }
        return arghash;
    }

    public static final SubLObject html_print_facet_block_alt(SubLObject fort, SubLObject facet, SubLObject arghash) {
        if (arghash == UNPROVIDED) {
            arghash = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject facet_instances = facets.facet_instances(facet, $facet_tool_mt$.getDynamicValue(thread));
                SubLObject facet_strength = facets.facet_strength(facet);
                SubLObject facet_col_type = facets.facet_col_type(facet);
                SubLObject facet_id = facets.facet_id(facet);
                html_arghash.html_arghash_hidden_input_force(arghash, $A_FACET, facet_id, UNPROVIDED, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject sup_facet_cols = facets.current_fort_faceting(fort, facet, $facet_tool_mt$.getDynamicValue(thread));
                    SubLObject not_sup_facet_cols = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (length(facet_instances).numL(TWENTY_INTEGER)) {
                        facet_instances = Sort.sort(facet_instances, symbol_function($sym71$GENERALITY_ESTIMATE_), UNPROVIDED);
                    } else {
                        facet_instances = Sort.sort(facet_instances, symbol_function($sym72$FORT_NAME_), UNPROVIDED);
                    }
                    {
                        SubLObject unknown_facet_cols = nreverse(set_difference(facet_instances, append(sup_facet_cols, not_sup_facet_cols), UNPROVIDED, UNPROVIDED));
                        SubLObject more_cols = NIL;
                        SubLObject col_1_width = $str_alt73$6_;
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != unknown_facet_cols) {
                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            cb_facet_form(facet);
                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        } else {
                                            cb_facet_form(facet);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = sup_facet_cols;
                            SubLObject sup_facet_col = NIL;
                            for (sup_facet_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sup_facet_col = cdolist_list_var.first()) {
                                {
                                    SubLObject isa_assertion = kb_indexing.find_gaf_any_mt(list($$isa, fort, sup_facet_col));
                                    if (NIL != isa_assertion) {
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (NIL != html_macros.$html_color_lighter_purple$.getDynamicValue(thread)) {
                                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_color_lighter_purple$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($RIGHT));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != col_1_width) {
                                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(col_1_width);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_link($ASSERTION, isa_assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_glyph($NBSP, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_facet_form(sup_facet_col);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } else {
                                        more_cols = cons(sup_facet_col, more_cols);
                                    }
                                }
                            }
                        }
                        more_cols = nreverse(more_cols);
                        {
                            SubLObject cdolist_list_var = more_cols;
                            SubLObject more_col = NIL;
                            for (more_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , more_col = cdolist_list_var.first()) {
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                if (NIL != html_macros.$html_color_lighter_purple$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_color_lighter_purple$.getDynamicValue(thread));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($RIGHT));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (NIL != col_1_width) {
                                            html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(col_1_width);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                html_princ($str_alt78$i_);
                                                html_glyph($NBSP, UNPROVIDED);
                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_facet_form(more_col);
                                                html_glyph($NBSP, UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                        if (TEN_INTEGER.numGE(length(unknown_facet_cols))) {
                            {
                                SubLObject disjoint_facetP = member(facet_strength, facets.$facet_predicates_disjoint$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                                SubLObject cdolist_list_var = unknown_facet_cols;
                                SubLObject unknown_facet_col = NIL;
                                for (unknown_facet_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unknown_facet_col = cdolist_list_var.first()) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_color_lighter_purple$.getDynamicValue(thread)) {
                                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_color_lighter_purple$.getDynamicValue(thread));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($RIGHT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != col_1_width) {
                                                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(col_1_width);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    if (NIL != disjoint_facetP) {
                                                        html_arghash.html_arghash_radio_input(arghash, facet_id, unknown_facet_col);
                                                    } else {
                                                        html_arghash.html_arghash_checkbox_input(arghash, $ADD_SUP, unknown_facet_col, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    html_glyph($NBSP, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_facet_form(unknown_facet_col);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                            }
                        } else {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (NIL != html_macros.$html_color_lighter_purple$.getDynamicValue(thread)) {
                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_color_lighter_purple$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (NIL != col_1_width) {
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(col_1_width);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_arghash.html_arghash_checkbox_input(arghash, $ADD_SUP_FROM, facet_col_type, UNPROVIDED, UNPROVIDED);
                                            html_glyph($NBSP, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject key_string = html_arghash.arghash_make_key_string(facet_col_type, $FORT);
                                                html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(key_string);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = unknown_facet_cols;
                                                            SubLObject unknown_facet_col = NIL;
                                                            for (unknown_facet_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unknown_facet_col = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject selected = list_utilities.member_equalP(unknown_facet_col, html_arghash.get_arghash_value_list(facet_col_type, arghash));
                                                                    SubLObject value_string = html_arghash.arghash_get_string(unknown_facet_col, $DEFAULT);
                                                                    html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    if (NIL != selected) {
                                                                        html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                                    }
                                                                    if (NIL != value_string) {
                                                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(value_string);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_princ(kb_paths.fort_name(unknown_facet_col));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                        more_cols = NIL;
                        {
                            SubLObject cdolist_list_var = not_sup_facet_cols;
                            SubLObject not_sup_facet_col = NIL;
                            for (not_sup_facet_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , not_sup_facet_col = cdolist_list_var.first()) {
                                {
                                    SubLObject not_isa_assertion = kb_indexing.find_gaf_any_mt(list($$isa, fort, not_sup_facet_col));
                                    if (NIL != not_isa_assertion) {
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (NIL != html_macros.$html_color_lighter_purple$.getDynamicValue(thread)) {
                                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_color_lighter_purple$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($RIGHT));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != col_1_width) {
                                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(col_1_width);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_link($ASSERTION, not_isa_assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_glyph($NBSP, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_strikethrough_head$.getGlobalValue());
                                                        cb_facet_form(not_sup_facet_col);
                                                        html_markup(html_macros.$html_strikethrough_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } else {
                                        more_cols = cons(not_sup_facet_col, more_cols);
                                    }
                                }
                            }
                        }
                        more_cols = nreverse(more_cols);
                        if (TEN_INTEGER.numGE(length(more_cols))) {
                            {
                                SubLObject cdolist_list_var = more_cols;
                                SubLObject more_col = NIL;
                                for (more_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , more_col = cdolist_list_var.first()) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_color_lighter_purple$.getDynamicValue(thread)) {
                                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_color_lighter_purple$.getDynamicValue(thread));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($RIGHT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != col_1_width) {
                                                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(col_1_width);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ($str_alt82$x_);
                                                    html_glyph($NBSP, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_strikethrough_head$.getGlobalValue());
                                                    cb_facet_form(more_col);
                                                    html_markup(html_macros.$html_strikethrough_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                }
                            }
                        } else {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (NIL != html_macros.$html_color_lighter_purple$.getDynamicValue(thread)) {
                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_color_lighter_purple$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (NIL != col_1_width) {
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(col_1_width);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str_alt82$x_);
                                            html_glyph($NBSP, UNPROVIDED);
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
                                            {
                                                SubLObject select_name = cb_fort_identifier(facet_col_type);
                                                html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(select_name);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = more_cols;
                                                            SubLObject more_col = NIL;
                                                            for (more_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , more_col = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject select_value = cb_fort_identifier(more_col);
                                                                    html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                    if (NIL != select_value) {
                                                                        html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(select_value);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_princ(kb_paths.fort_name(more_col));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject html_print_facet_block(final SubLObject fort, final SubLObject facet, SubLObject arghash) {
        if (arghash == UNPROVIDED) {
            arghash = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject facet_instances = facets.facet_instances(facet, $facet_tool_mt$.getDynamicValue(thread));
        final SubLObject facet_strength = facets.facet_strength(facet);
        final SubLObject facet_col_type = facets.facet_col_type(facet);
        final SubLObject facet_id = facets.facet_id(facet);
        html_arghash.html_arghash_hidden_input_force(arghash, $A_FACET, facet_id, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject sup_facet_cols = facets.current_fort_faceting(fort, facet, $facet_tool_mt$.getDynamicValue(thread));
        final SubLObject not_sup_facet_cols = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (length(facet_instances).numL(TWENTY_INTEGER)) {
            facet_instances = Sort.sort(facet_instances, symbol_function($sym82$GENERALITY_ESTIMATE_), UNPROVIDED);
        } else {
            facet_instances = Sort.sort(facet_instances, symbol_function($sym83$FORT_NAME_), UNPROVIDED);
        }
        final SubLObject unknown_facet_cols = nreverse(set_difference(facet_instances, append(sup_facet_cols, not_sup_facet_cols), UNPROVIDED, UNPROVIDED));
        SubLObject more_cols = NIL;
        final SubLObject col_1_width = $str84$6_;
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(TWO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                if (NIL != unknown_facet_cols) {
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    cb_facet_form(facet);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } else {
                    cb_facet_form(facet);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        SubLObject cdolist_list_var = sup_facet_cols;
        SubLObject sup_facet_col = NIL;
        sup_facet_col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject isa_assertion = kb_indexing.find_gaf_any_mt(list($$isa, fort, sup_facet_col));
            if (NIL != isa_assertion) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != col_1_width) {
                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(col_1_width);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_link($ASSERTION, isa_assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_glyph($NBSP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_facet_form(sup_facet_col);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } else {
                more_cols = cons(sup_facet_col, more_cols);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sup_facet_col = cdolist_list_var.first();
        } 
        more_cols = cdolist_list_var = nreverse(more_cols);
        SubLObject more_col = NIL;
        more_col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != col_1_width) {
                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(col_1_width);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($$$i_);
                    html_glyph($NBSP, UNPROVIDED);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_facet_form(more_col);
                    html_glyph($NBSP, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            more_col = cdolist_list_var.first();
        } 
        if (TEN_INTEGER.numGE(length(unknown_facet_cols))) {
            final SubLObject disjoint_facetP = member(facet_strength, facets.$facet_predicates_disjoint$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var2 = unknown_facet_cols;
            SubLObject unknown_facet_col = NIL;
            unknown_facet_col = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != col_1_width) {
                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(col_1_width);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != disjoint_facetP) {
                            html_arghash.html_arghash_radio_input(arghash, facet_id, unknown_facet_col);
                        } else {
                            html_arghash.html_arghash_checkbox_input(arghash, $ADD_SUP, unknown_facet_col, UNPROVIDED, UNPROVIDED);
                        }
                        html_glyph($NBSP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_facet_form(unknown_facet_col);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var2 = cdolist_list_var2.rest();
                unknown_facet_col = cdolist_list_var2.first();
            } 
        } else {
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != col_1_width) {
                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(col_1_width);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_arghash.html_arghash_checkbox_input(arghash, $ADD_SUP_FROM, facet_col_type, UNPROVIDED, UNPROVIDED);
                    html_glyph($NBSP, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject key_string = html_arghash.arghash_make_key_string(facet_col_type, $FORT);
                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                    html_markup(html_macros.$html_select_name$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(key_string);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject cdolist_list_var3 = unknown_facet_cols;
                        SubLObject unknown_facet_col2 = NIL;
                        unknown_facet_col2 = cdolist_list_var3.first();
                        while (NIL != cdolist_list_var3) {
                            final SubLObject selected = list_utilities.member_equalP(unknown_facet_col2, html_arghash.get_arghash_value_list(facet_col_type, arghash));
                            final SubLObject value_string = html_arghash.arghash_get_string(unknown_facet_col2, $DEFAULT);
                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                            if (NIL != selected) {
                                html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                            }
                            if (NIL != value_string) {
                                html_markup(html_macros.$html_option_value$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(value_string);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(kb_paths.fort_name(unknown_facet_col2));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            unknown_facet_col2 = cdolist_list_var3.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                    }
                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        }
        more_cols = NIL;
        cdolist_list_var = not_sup_facet_cols;
        SubLObject not_sup_facet_col = NIL;
        not_sup_facet_col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject not_isa_assertion = kb_indexing.find_gaf_any_mt(list($$isa, fort, not_sup_facet_col));
            if (NIL != not_isa_assertion) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != col_1_width) {
                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(col_1_width);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_link($ASSERTION, not_isa_assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_glyph($NBSP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strikethrough_head$.getGlobalValue());
                        cb_facet_form(not_sup_facet_col);
                        html_markup(html_macros.$html_strikethrough_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } else {
                more_cols = cons(not_sup_facet_col, more_cols);
            }
            cdolist_list_var = cdolist_list_var.rest();
            not_sup_facet_col = cdolist_list_var.first();
        } 
        more_cols = nreverse(more_cols);
        if (TEN_INTEGER.numGE(length(more_cols))) {
            cdolist_list_var = more_cols;
            more_col = NIL;
            more_col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != col_1_width) {
                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(col_1_width);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$x_);
                        html_glyph($NBSP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strikethrough_head$.getGlobalValue());
                        cb_facet_form(more_col);
                        html_markup(html_macros.$html_strikethrough_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                more_col = cdolist_list_var.first();
            } 
        } else {
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != col_1_width) {
                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(col_1_width);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$x_);
                    html_glyph($NBSP, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject select_name = cb_fort_identifier(facet_col_type);
                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                    html_markup(html_macros.$html_select_name$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(select_name);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject cdolist_list_var3 = more_cols;
                        SubLObject more_col2 = NIL;
                        more_col2 = cdolist_list_var3.first();
                        while (NIL != cdolist_list_var3) {
                            final SubLObject select_value = cb_fort_identifier(more_col2);
                            html_markup(html_macros.$html_option_head$.getGlobalValue());
                            if (NIL != select_value) {
                                html_markup(html_macros.$html_option_value$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(select_value);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(kb_paths.fort_name(more_col2));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                            }
                            html_markup(html_macros.$html_option_tail$.getGlobalValue());
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            more_col2 = cdolist_list_var3.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject show_as_collectionP_alt(SubLObject arghash) {
        return fort_types_interface.collectionP(html_arghash.get_arghash_value($FORT, arghash));
    }

    public static SubLObject show_as_collectionP(final SubLObject arghash) {
        return fort_types_interface.collectionP(html_arghash.get_arghash_value($FORT, arghash));
    }

    public static final SubLObject html_show_as_collection_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
                SubLObject asserted_genls_links = facets.asserted_links(fort, $$genls, NIL, $facet_tool_mt$.getDynamicValue(thread));
                SubLObject asserted_genls = getf(asserted_genls_links, $ASSERTED_TRUE, UNPROVIDED);
                SubLObject coextensional = getf(asserted_genls_links, $COEXTENSIONAL, UNPROVIDED);
                if (NIL != asserted_genls) {
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
                    if (NIL != html_macros.$html_color_light_green$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_color_light_green$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str_alt69$100_);
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
                                SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            html_princ($str_alt88$__genls__);
                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            html_princ($$$in_Mt);
                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_arghash.html_arghash_submit_input(arghash, $$$Unassert, $UNASSERT_GO, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = asserted_genls;
                                SubLObject asserted_genl = NIL;
                                for (asserted_genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asserted_genl = cdolist_list_var.first()) {
                                    {
                                        SubLObject genls_assertion = kb_indexing.find_gaf_possibly_in_mt(list($$genls, fort, asserted_genl), $facet_tool_mt$.getDynamicValue(thread));
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (NIL != html_macros.$html_color_lighter_green$.getDynamicValue(thread)) {
                                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_color_lighter_green$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($str_alt69$100_);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_indent(FIVE_INTEGER);
                                                        if (NIL != genls_assertion) {
                                                            cb_link($ASSERTION, genls_assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_indent(ONE_INTEGER);
                                                        }
                                                        cb_facet_form(asserted_genl);
                                                        if (NIL != subl_promotions.memberP(asserted_genl, coextensional, UNPROVIDED, UNPROVIDED)) {
                                                            html_princ($str_alt92$__coextensional_);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_facet_form(assertions_high.assertion_mt(genls_assertion));
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($CENTER));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (NIL != assertion_handles.assertion_p(genls_assertion)) {
                                                            html_arghash.html_arghash_checkbox_input(arghash, $UNASSERT_ID, assertion_handles.assertion_id(genls_assertion), UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                }
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind($facet_tool_mt$.getDynamicValue(thread), thread);
                        {
                            SubLObject v_facets = facets.facets_from_cols(list(fort), $facet_tool_mt$.getDynamicValue(thread));
                            SubLObject specs_faceted = NIL;
                            SubLObject specs_unfaceted = NIL;
                            SubLObject num_specs_unfaceted_not_shown = ZERO_INTEGER;
                            SubLObject asserted_specs = genls.asserted_specs(fort, $facet_tool_mt$.getDynamicValue(thread));
                            if (NIL != v_facets) {
                                html_arghash.set_arghash_value($FACETS_, arghash, T);
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
                                if (NIL != html_macros.$html_color_light_purple$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_color_light_purple$.getDynamicValue(thread));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_table_width$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt69$100_);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($str_alt69$100_);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_princ($str_alt97$__faceted_specs__);
                                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_princ($$$in_Mt);
                                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_arghash.html_arghash_submit_input(arghash, $$$Unassert, $UNASSERT_GO, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = v_facets;
                                            SubLObject facet = NIL;
                                            for (facet = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , facet = cdolist_list_var.first()) {
                                                {
                                                    SubLObject facet_col_type = facets.facet_col_type(facet);
                                                    SubLObject facet_instances = facets.facet_instances(facet, $facet_tool_mt$.getDynamicValue(thread));
                                                    SubLObject facet_id = facets.facet_id(facet);
                                                    SubLObject facet_mt = facets.facet_mt(facet);
                                                    SubLObject facet_assertion = facets.facet_assertion(facet);
                                                    specs_faceted = append(specs_faceted, copy_list(facet_instances));
                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    if (NIL != html_macros.$html_color_lighter_purple$.getDynamicValue(thread)) {
                                                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_macros.$html_color_lighter_purple$.getDynamicValue(thread));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_arghash.html_arghash_hidden_input_force(arghash, $FACET_ID, facet_id, UNPROVIDED, UNPROVIDED);
                                                                    html_arghash.html_arghash_radio_input(arghash, $FACET_ID_SELECTED, facet_id);
                                                                    html_indent(UNPROVIDED);
                                                                    cb_facet_form(facet);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_facet_form(facet_mt);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(html_align($CENTER));
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    if (NIL != assertion_handles.assertion_p(facet_assertion)) {
                                                                        html_arghash.html_arghash_checkbox_input(arghash, $UNASSERT_ID, assertion_handles.assertion_id(facet_assertion), UNPROVIDED, UNPROVIDED);
                                                                        html_glyph($NBSP, THREE_INTEGER);
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    {
                                                        SubLObject cdolist_list_var_43 = Sort.sort(facet_instances, symbol_function($sym71$GENERALITY_ESTIMATE_), UNPROVIDED);
                                                        SubLObject facet_instance = NIL;
                                                        for (facet_instance = cdolist_list_var_43.first(); NIL != cdolist_list_var_43; cdolist_list_var_43 = cdolist_list_var_43.rest() , facet_instance = cdolist_list_var_43.first()) {
                                                            {
                                                                SubLObject isa_assertion = kb_indexing.find_gaf_possibly_in_mt(list($$isa, facet_instance, facet_col_type), $facet_tool_mt$.getDynamicValue(thread));
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                if (NIL != html_macros.$html_color_lighter_purple$.getDynamicValue(thread)) {
                                                                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_macros.$html_color_lighter_purple$.getDynamicValue(thread));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_indent(FIVE_INTEGER);
                                                                                html_arghash.html_arghash_hidden_input(arghash, make_keyword(format(NIL, $str_alt100$_A_SPEC, facet_id)), facet_instance, UNPROVIDED);
                                                                                html_arghash.html_arghash_checkbox_input(arghash, make_keyword(format(NIL, $str_alt101$_A_SPEC_SELECTED, facet_id)), facet_instance, UNPROVIDED, UNPROVIDED);
                                                                                html_glyph($NBSP, UNPROVIDED);
                                                                                if (NIL != assertion_handles.assertion_p(isa_assertion)) {
                                                                                    cb_link($ASSERTION, isa_assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                }
                                                                                cb_facet_form(facet_instance);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                if (NIL != assertion_handles.assertion_p(isa_assertion)) {
                                                                                    html_glyph($NBSP, TWO_INTEGER);
                                                                                    cb_facet_form(assertions_high.assertion_mt(isa_assertion));
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        if (true) {
                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup(html_align($CENTER));
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                        }
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                if (NIL != assertion_handles.assertion_p(isa_assertion)) {
                                                                                    html_glyph($NBSP, THREE_INTEGER);
                                                                                    html_arghash.html_arghash_checkbox_input(arghash, $UNASSERT_ID, assertion_handles.assertion_id(isa_assertion), UNPROVIDED, UNPROVIDED);
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                            }
                            if (NIL != specs_faceted) {
                                html_arghash.set_arghash_value($kw102$SPECS_FACETED_, arghash, T);
                            }
                            html_flush();
                            specs_unfaceted = set_difference(asserted_specs, specs_faceted, UNPROVIDED, UNPROVIDED);
                            if (NIL != specs_unfaceted) {
                                specs_unfaceted = Sort.sort(specs_unfaceted, symbol_function($sym71$GENERALITY_ESTIMATE_), UNPROVIDED);
                                {
                                    SubLObject num_specs_unfaceted = length(specs_unfaceted);
                                    if (num_specs_unfaceted.numG($int$200)) {
                                        num_specs_unfaceted_not_shown = subtract(num_specs_unfaceted, $int$200);
                                        specs_unfaceted = list_utilities.first_n($int$100, specs_unfaceted);
                                    }
                                }
                                html_arghash.set_arghash_value($kw105$SPECS_UNFACETED_, arghash, T);
                                {
                                    SubLObject show_next_levelP = numL(length(specs_unfaceted), TWENTY_INTEGER);
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
                                    if (NIL != html_macros.$html_color_light_purple$.getDynamicValue(thread)) {
                                        html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_color_light_purple$.getDynamicValue(thread));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str_alt69$100_);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup($str_alt69$100_);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                            html_princ($str_alt106$__unfaceted_specs__);
                                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                            html_princ($$$in_Mt);
                                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_arghash.html_arghash_submit_input(arghash, $$$Unassert, $UNASSERT_GO, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                            {
                                                SubLObject cdolist_list_var = specs_unfaceted;
                                                SubLObject spec_unfaceted = NIL;
                                                for (spec_unfaceted = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_unfaceted = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject possible_gaf = kb_indexing.find_gaf_possibly_in_mt(list($$genls, spec_unfaceted, fort), $facet_tool_mt$.getDynamicValue(thread));
                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        if (NIL != html_macros.$html_color_lighter_purple$.getDynamicValue(thread)) {
                                                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_macros.$html_color_lighter_purple$.getDynamicValue(thread));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_indent(FIVE_INTEGER);
                                                                        html_arghash.html_arghash_checkbox_input(arghash, $SPEC_UNFACETED, spec_unfaceted, UNPROVIDED, UNPROVIDED);
                                                                        html_indent(UNPROVIDED);
                                                                        if (NIL != assertion_handles.assertion_p(possible_gaf)) {
                                                                            cb_link($ASSERTION, possible_gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            html_indent(UNPROVIDED);
                                                                        }
                                                                        cb_facet_form(spec_unfaceted);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (NIL != assertion_handles.assertion_p(possible_gaf)) {
                                                                            cb_facet_form(assertions_high.assertion_mt(possible_gaf));
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(html_align($CENTER));
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        if (NIL != assertion_handles.assertion_p(possible_gaf)) {
                                                                            html_arghash.html_arghash_checkbox_input(arghash, $UNASSERT_ID, assertion_handles.assertion_id(possible_gaf), UNPROVIDED, UNPROVIDED);
                                                                            html_glyph($NBSP, THREE_INTEGER);
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_source_readability_terpri(UNPROVIDED);
                                                    }
                                                    if (NIL != show_next_levelP) {
                                                        {
                                                            SubLObject sub_specs = genls.asserted_specs(spec_unfaceted, $facet_tool_mt$.getDynamicValue(thread));
                                                            if (length(sub_specs).numL(TWENTY_INTEGER)) {
                                                                sub_specs = Sort.sort(sub_specs, symbol_function($sym71$GENERALITY_ESTIMATE_), UNPROVIDED);
                                                                {
                                                                    SubLObject cdolist_list_var_57 = sub_specs;
                                                                    SubLObject sub_spec = NIL;
                                                                    for (sub_spec = cdolist_list_var_57.first(); NIL != cdolist_list_var_57; cdolist_list_var_57 = cdolist_list_var_57.rest() , sub_spec = cdolist_list_var_57.first()) {
                                                                        {
                                                                            SubLObject possible_gaf = kb_indexing.find_gaf_possibly_in_mt(list($$genls, sub_spec, spec_unfaceted), $facet_tool_mt$.getDynamicValue(thread));
                                                                            if (NIL == subl_promotions.memberP(sub_spec, specs_faceted, UNPROVIDED, UNPROVIDED)) {
                                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                if (NIL != html_macros.$html_color_lighter_purple$.getDynamicValue(thread)) {
                                                                                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup(html_macros.$html_color_lighter_purple$.getDynamicValue(thread));
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                html_indent(EIGHT_INTEGER);
                                                                                                html_princ($str_alt108$____);
                                                                                                html_arghash.html_arghash_checkbox_input(arghash, $SPEC_UNFACETED, sub_spec, UNPROVIDED, UNPROVIDED);
                                                                                                if (NIL != assertion_handles.assertion_p(possible_gaf)) {
                                                                                                    cb_link($ASSERTION, possible_gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    html_indent(UNPROVIDED);
                                                                                                }
                                                                                                html_indent(UNPROVIDED);
                                                                                                cb_facet_form(sub_spec);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                                                                                            }
                                                                                        }
                                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                if (NIL != assertion_handles.assertion_p(possible_gaf)) {
                                                                                                    html_glyph($NBSP, TWO_INTEGER);
                                                                                                    cb_facet_form(assertions_high.assertion_mt(possible_gaf));
                                                                                                }
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                                                            }
                                                                                        }
                                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                        if (true) {
                                                                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                                            html_markup(html_align($CENTER));
                                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                                        }
                                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                if (NIL != assertion_handles.assertion_p(possible_gaf)) {
                                                                                                    html_glyph($NBSP, THREE_INTEGER);
                                                                                                    html_arghash.html_arghash_checkbox_input(arghash, $UNASSERT_ID, assertion_handles.assertion_id(possible_gaf), UNPROVIDED, UNPROVIDED);
                                                                                                }
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                                                            }
                                                                                        }
                                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                html_source_readability_terpri(UNPROVIDED);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (num_specs_unfaceted_not_shown.numG(ZERO_INTEGER)) {
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(THREE_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_indent(FIVE_INTEGER);
                                                                html_princ(num_specs_unfaceted_not_shown);
                                                                html_princ($str_alt109$_unfaceted_specs_not_shown_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                }
                            }
                            html_flush();
                            if (NIL != isa.isaP(fort, $$Collection, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject v_instances = isa.instances(fort, $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED);
                                    SubLObject cols_per_row = FOUR_INTEGER;
                                    SubLObject ok_instances = NIL;
                                    SubLObject cdolist_list_var = v_instances;
                                    SubLObject i = NIL;
                                    for (i = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , i = cdolist_list_var.first()) {
                                        if (NIL != forts.fort_p(i)) {
                                            ok_instances = cons(i, ok_instances);
                                        }
                                    }
                                    v_instances = nreverse(ok_instances);
                                    if (NIL != v_instances) {
                                        html_arghash.set_arghash_value($INSTANCES_, arghash, T);
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
                                        if (NIL != html_macros.$html_color_light_yellow$.getDynamicValue(thread)) {
                                            html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_color_light_yellow$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_table_width$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($str_alt69$100_);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (NIL != cols_per_row) {
                                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(cols_per_row);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                html_princ($str_alt112$__instances__);
                                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                {
                                                    SubLObject sorted_instances = Sort.sort(v_instances, symbol_function($sym71$GENERALITY_ESTIMATE_), UNPROVIDED);
                                                    SubLObject num_instances = length(sorted_instances);
                                                    SubLObject max_instances_shown = multiply(TWENTY_INTEGER, subtract(cols_per_row, ONE_INTEGER));
                                                    SubLObject cur_instances_shown = ZERO_INTEGER;
                                                    SubLObject doneP = NIL;
                                                    while (NIL == doneP) {
                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        if (NIL != html_macros.$html_color_lighter_yellow$.getDynamicValue(thread)) {
                                                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(html_macros.$html_color_lighter_yellow$.getDynamicValue(thread));
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_glyph($NBSP, FIVE_INTEGER);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                {
                                                                    SubLObject cols_left = subtract(cols_per_row, ONE_INTEGER);
                                                                    while (ZERO_INTEGER.numL(cols_left)) {
                                                                        cols_left = subtract(cols_left, ONE_INTEGER);
                                                                        if (NIL == doneP) {
                                                                            {
                                                                                SubLObject instance = sorted_instances.first();
                                                                                sorted_instances = sorted_instances.rest();
                                                                                cur_instances_shown = add(cur_instances_shown, ONE_INTEGER);
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_arghash.html_arghash_checkbox_input(arghash, $INSTANCE, instance, UNPROVIDED, UNPROVIDED);
                                                                                        html_glyph($NBSP, UNPROVIDED);
                                                                                        cb_facet_form(instance);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            }
                                                                        } else {
                                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    html_glyph($NBSP, UNPROVIDED);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        }
                                                                        if (cur_instances_shown.numGE(max_instances_shown) || cur_instances_shown.numGE(num_instances)) {
                                                                            doneP = T;
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_source_readability_terpri(UNPROVIDED);
                                                    } 
                                                    {
                                                        SubLObject num_instances_not_shown = subtract(num_instances, max_instances_shown);
                                                        if (ZERO_INTEGER.numL(num_instances_not_shown)) {
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (NIL != cols_per_row) {
                                                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(cols_per_row);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_indent(FIVE_INTEGER);
                                                                    html_princ(num_instances_not_shown);
                                                                    html_princ($str_alt114$_instances_not_shown_);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        }
                                                    }
                                                }
                                                html_newline(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    }
                                }
                            }
                            html_newline(UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return arghash;
        }
    }

    public static SubLObject html_show_as_collection(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
        final SubLObject asserted_genls_links = facets.asserted_links(fort, $$genls, NIL, $facet_tool_mt$.getDynamicValue(thread));
        final SubLObject asserted_genls = getf(asserted_genls_links, $ASSERTED_TRUE, UNPROVIDED);
        final SubLObject coextensional = getf(asserted_genls_links, $COEXTENSIONAL, UNPROVIDED);
        if (NIL != asserted_genls) {
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
            if (NIL != html_macros.$html_color_light_green$.getGlobalValue()) {
                html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_color_light_green$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_table_width$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str80$100_);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ($str99$__genls__);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ($$$in_Mt);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_arghash.html_arghash_submit_input(arghash, $$$Unassert, $UNASSERT_GO, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                SubLObject cdolist_list_var = asserted_genls;
                SubLObject asserted_genl = NIL;
                asserted_genl = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject genls_assertion = kb_indexing.find_gaf_possibly_in_mt(list($$genls, fort, asserted_genl), $facet_tool_mt$.getDynamicValue(thread));
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (NIL != html_macros.$html_color_lighter_green$.getGlobalValue()) {
                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_color_lighter_green$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str80$100_);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_indent(FIVE_INTEGER);
                            if (NIL != genls_assertion) {
                                cb_link($ASSERTION, genls_assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_indent(ONE_INTEGER);
                            }
                            cb_facet_form(asserted_genl);
                            if (NIL != subl_promotions.memberP(asserted_genl, coextensional, UNPROVIDED, UNPROVIDED)) {
                                html_princ($str103$__coextensional_);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_facet_form(assertions_high.assertion_mt(genls_assertion));
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != assertion_handles.assertion_p(genls_assertion)) {
                                html_arghash.html_arghash_checkbox_input(arghash, $UNASSERT_ID, assertion_handles.assertion_id(genls_assertion), UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    asserted_genl = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind($facet_tool_mt$.getDynamicValue(thread), thread);
            final SubLObject v_facets = facets.facets_from_cols(list(fort), $facet_tool_mt$.getDynamicValue(thread));
            SubLObject specs_faceted = NIL;
            SubLObject specs_unfaceted = NIL;
            SubLObject num_specs_unfaceted_not_shown = ZERO_INTEGER;
            final SubLObject asserted_specs = genls.asserted_specs(fort, $facet_tool_mt$.getDynamicValue(thread));
            if (NIL != v_facets) {
                html_arghash.set_arghash_value($FACETS_, arghash, T);
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
                if (NIL != html_macros.$html_color_light_purple$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_light_purple$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_markup(html_macros.$html_table_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str80$100_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str80$100_);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str108$__faceted_specs__);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($$$in_Mt);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_arghash.html_arghash_submit_input(arghash, $$$Unassert, $UNASSERT_GO, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    SubLObject cdolist_list_var2 = v_facets;
                    SubLObject facet = NIL;
                    facet = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject facet_col_type = facets.facet_col_type(facet);
                        final SubLObject facet_instances = facets.facet_instances(facet, $facet_tool_mt$.getDynamicValue(thread));
                        final SubLObject facet_id = facets.facet_id(facet);
                        final SubLObject facet_mt = facets.facet_mt(facet);
                        final SubLObject facet_assertion = facets.facet_assertion(facet);
                        specs_faceted = append(specs_faceted, copy_list(facet_instances));
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_arghash.html_arghash_hidden_input_force(arghash, $FACET_ID, facet_id, UNPROVIDED, UNPROVIDED);
                                html_arghash.html_arghash_radio_input(arghash, $FACET_ID_SELECTED, facet_id);
                                html_indent(UNPROVIDED);
                                cb_facet_form(facet);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_facet_form(facet_mt);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($CENTER));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != assertion_handles.assertion_p(facet_assertion)) {
                                    html_arghash.html_arghash_checkbox_input(arghash, $UNASSERT_ID, assertion_handles.assertion_id(facet_assertion), UNPROVIDED, UNPROVIDED);
                                    html_glyph($NBSP, THREE_INTEGER);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        SubLObject cdolist_list_var_$43 = Sort.sort(facet_instances, symbol_function($sym82$GENERALITY_ESTIMATE_), UNPROVIDED);
                        SubLObject facet_instance = NIL;
                        facet_instance = cdolist_list_var_$43.first();
                        while (NIL != cdolist_list_var_$43) {
                            final SubLObject isa_assertion = kb_indexing.find_gaf_possibly_in_mt(list($$isa, facet_instance, facet_col_type), $facet_tool_mt$.getDynamicValue(thread));
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent(FIVE_INTEGER);
                                    html_arghash.html_arghash_hidden_input(arghash, make_keyword(format(NIL, $str111$_A_SPEC, facet_id)), facet_instance, UNPROVIDED);
                                    html_arghash.html_arghash_checkbox_input(arghash, make_keyword(format(NIL, $str112$_A_SPEC_SELECTED, facet_id)), facet_instance, UNPROVIDED, UNPROVIDED);
                                    html_glyph($NBSP, UNPROVIDED);
                                    if (NIL != assertion_handles.assertion_p(isa_assertion)) {
                                        cb_link($ASSERTION, isa_assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    cb_facet_form(facet_instance);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != assertion_handles.assertion_p(isa_assertion)) {
                                        html_glyph($NBSP, TWO_INTEGER);
                                        cb_facet_form(assertions_high.assertion_mt(isa_assertion));
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != assertion_handles.assertion_p(isa_assertion)) {
                                        html_glyph($NBSP, THREE_INTEGER);
                                        html_arghash.html_arghash_checkbox_input(arghash, $UNASSERT_ID, assertion_handles.assertion_id(isa_assertion), UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                            facet_instance = cdolist_list_var_$43.first();
                        } 
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        facet = cdolist_list_var2.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
            }
            if (NIL != specs_faceted) {
                html_arghash.set_arghash_value($kw113$SPECS_FACETED_, arghash, T);
            }
            html_flush();
            specs_unfaceted = set_difference(asserted_specs, specs_faceted, UNPROVIDED, UNPROVIDED);
            if (NIL != specs_unfaceted) {
                specs_unfaceted = Sort.sort(specs_unfaceted, symbol_function($sym82$GENERALITY_ESTIMATE_), UNPROVIDED);
                final SubLObject num_specs_unfaceted = length(specs_unfaceted);
                if (num_specs_unfaceted.numG($int$200)) {
                    num_specs_unfaceted_not_shown = subtract(num_specs_unfaceted, $int$200);
                    specs_unfaceted = list_utilities.first_n($int$100, specs_unfaceted);
                }
                html_arghash.set_arghash_value($kw116$SPECS_UNFACETED_, arghash, T);
                final SubLObject show_next_levelP = numL(length(specs_unfaceted), TWENTY_INTEGER);
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
                if (NIL != html_macros.$html_color_light_purple$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_light_purple$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_markup(html_macros.$html_table_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str80$100_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str80$100_);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str117$__unfaceted_specs__);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($$$in_Mt);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_arghash.html_arghash_submit_input(arghash, $$$Unassert, $UNASSERT_GO, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    SubLObject cdolist_list_var3 = specs_unfaceted;
                    SubLObject spec_unfaceted = NIL;
                    spec_unfaceted = cdolist_list_var3.first();
                    while (NIL != cdolist_list_var3) {
                        final SubLObject possible_gaf = kb_indexing.find_gaf_possibly_in_mt(list($$genls, spec_unfaceted, fort), $facet_tool_mt$.getDynamicValue(thread));
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_indent(FIVE_INTEGER);
                                html_arghash.html_arghash_checkbox_input(arghash, $SPEC_UNFACETED, spec_unfaceted, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                if (NIL != assertion_handles.assertion_p(possible_gaf)) {
                                    cb_link($ASSERTION, possible_gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_indent(UNPROVIDED);
                                }
                                cb_facet_form(spec_unfaceted);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != assertion_handles.assertion_p(possible_gaf)) {
                                    cb_facet_form(assertions_high.assertion_mt(possible_gaf));
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($CENTER));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (NIL != assertion_handles.assertion_p(possible_gaf)) {
                                    html_arghash.html_arghash_checkbox_input(arghash, $UNASSERT_ID, assertion_handles.assertion_id(possible_gaf), UNPROVIDED, UNPROVIDED);
                                    html_glyph($NBSP, THREE_INTEGER);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        if (NIL != show_next_levelP) {
                            SubLObject sub_specs = genls.asserted_specs(spec_unfaceted, $facet_tool_mt$.getDynamicValue(thread));
                            if (length(sub_specs).numL(TWENTY_INTEGER)) {
                                SubLObject cdolist_list_var_$44;
                                sub_specs = cdolist_list_var_$44 = Sort.sort(sub_specs, symbol_function($sym82$GENERALITY_ESTIMATE_), UNPROVIDED);
                                SubLObject sub_spec = NIL;
                                sub_spec = cdolist_list_var_$44.first();
                                while (NIL != cdolist_list_var_$44) {
                                    final SubLObject possible_gaf2 = kb_indexing.find_gaf_possibly_in_mt(list($$genls, sub_spec, spec_unfaceted), $facet_tool_mt$.getDynamicValue(thread));
                                    if (NIL == subl_promotions.memberP(sub_spec, specs_faceted, UNPROVIDED, UNPROVIDED)) {
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_indent(EIGHT_INTEGER);
                                                html_princ($str119$____);
                                                html_arghash.html_arghash_checkbox_input(arghash, $SPEC_UNFACETED, sub_spec, UNPROVIDED, UNPROVIDED);
                                                if (NIL != assertion_handles.assertion_p(possible_gaf2)) {
                                                    cb_link($ASSERTION, possible_gaf2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_indent(UNPROVIDED);
                                                }
                                                html_indent(UNPROVIDED);
                                                cb_facet_form(sub_spec);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != assertion_handles.assertion_p(possible_gaf2)) {
                                                    html_glyph($NBSP, TWO_INTEGER);
                                                    cb_facet_form(assertions_high.assertion_mt(possible_gaf2));
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($CENTER));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != assertion_handles.assertion_p(possible_gaf2)) {
                                                    html_glyph($NBSP, THREE_INTEGER);
                                                    html_arghash.html_arghash_checkbox_input(arghash, $UNASSERT_ID, assertion_handles.assertion_id(possible_gaf2), UNPROVIDED, UNPROVIDED);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    }
                                    cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                                    sub_spec = cdolist_list_var_$44.first();
                                } 
                            }
                        }
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        spec_unfaceted = cdolist_list_var3.first();
                    } 
                    if (num_specs_unfaceted_not_shown.numG(ZERO_INTEGER)) {
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(THREE_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_indent(FIVE_INTEGER);
                                html_princ(num_specs_unfaceted_not_shown);
                                html_princ($str120$_unfaceted_specs_not_shown_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            html_flush();
            if (NIL != isa.isaP(fort, $$Collection, UNPROVIDED, UNPROVIDED)) {
                SubLObject v_instances = isa.instances(fort, $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED);
                final SubLObject cols_per_row = FOUR_INTEGER;
                SubLObject ok_instances = NIL;
                SubLObject cdolist_list_var4 = v_instances;
                SubLObject i = NIL;
                i = cdolist_list_var4.first();
                while (NIL != cdolist_list_var4) {
                    if (NIL != forts.fort_p(i)) {
                        ok_instances = cons(i, ok_instances);
                    }
                    cdolist_list_var4 = cdolist_list_var4.rest();
                    i = cdolist_list_var4.first();
                } 
                v_instances = nreverse(ok_instances);
                if (NIL != v_instances) {
                    html_arghash.set_arghash_value($INSTANCES_, arghash, T);
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
                    if (NIL != html_macros.$html_color_light_yellow$.getGlobalValue()) {
                        html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_color_light_yellow$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_table_width$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str80$100_);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != cols_per_row) {
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(cols_per_row);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($str123$__instances__);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        SubLObject sorted_instances = Sort.sort(v_instances, symbol_function($sym82$GENERALITY_ESTIMATE_), UNPROVIDED);
                        final SubLObject num_instances = length(sorted_instances);
                        final SubLObject max_instances_shown = multiply(TWENTY_INTEGER, subtract(cols_per_row, ONE_INTEGER));
                        SubLObject cur_instances_shown = ZERO_INTEGER;
                        SubLObject doneP = NIL;
                        while (NIL == doneP) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (NIL != html_macros.$html_color_lighter_yellow$.getGlobalValue()) {
                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_color_lighter_yellow$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, FIVE_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                SubLObject cols_left = subtract(cols_per_row, ONE_INTEGER);
                                while (ZERO_INTEGER.numL(cols_left)) {
                                    cols_left = subtract(cols_left, ONE_INTEGER);
                                    if (NIL == doneP) {
                                        final SubLObject instance = sorted_instances.first();
                                        sorted_instances = sorted_instances.rest();
                                        cur_instances_shown = add(cur_instances_shown, ONE_INTEGER);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_arghash.html_arghash_checkbox_input(arghash, $INSTANCE, instance, UNPROVIDED, UNPROVIDED);
                                            html_glyph($NBSP, UNPROVIDED);
                                            cb_facet_form(instance);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } else {
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_glyph($NBSP, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    if (cur_instances_shown.numGE(max_instances_shown) || cur_instances_shown.numGE(num_instances)) {
                                        doneP = T;
                                    }
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } 
                        final SubLObject num_instances_not_shown = subtract(num_instances, max_instances_shown);
                        if (ZERO_INTEGER.numL(num_instances_not_shown)) {
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != cols_per_row) {
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(cols_per_row);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_indent(FIVE_INTEGER);
                                html_princ(num_instances_not_shown);
                                html_princ($str125$_instances_not_shown_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        html_newline(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
            }
            html_newline(UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return arghash;
    }

    public static final SubLObject perspective_action_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_perspective_action(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject perspective_action_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_perspective_action(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject perspective_action_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cb_facets.$perspective_action_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject perspective_action_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cb_facets.$perspective_action_native.class ? T : NIL;
    }

    public static final SubLObject perspective_action_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.getField2();
    }

    public static SubLObject perspective_action_name(final SubLObject v_object) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject perspective_action_keyword_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.getField3();
    }

    public static SubLObject perspective_action_keyword(final SubLObject v_object) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject perspective_action_order_num_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.getField4();
    }

    public static SubLObject perspective_action_order_num(final SubLObject v_object) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject perspective_action_perspective_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.getField5();
    }

    public static SubLObject perspective_action_perspective(final SubLObject v_object) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject perspective_action_displayP_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.getField6();
    }

    public static SubLObject perspective_action_displayP_fn(final SubLObject v_object) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject perspective_action_display_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.getField7();
    }

    public static SubLObject perspective_action_display_fn(final SubLObject v_object) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject perspective_action_handlerP_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.getField8();
    }

    public static SubLObject perspective_action_handlerP_fn(final SubLObject v_object) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject perspective_action_handler_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.getField9();
    }

    public static SubLObject perspective_action_handler_fn(final SubLObject v_object) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject _csetf_perspective_action_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_perspective_action_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_perspective_action_keyword_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_perspective_action_keyword(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_perspective_action_order_num_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_perspective_action_order_num(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_perspective_action_perspective_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_perspective_action_perspective(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_perspective_action_displayP_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_perspective_action_displayP_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_perspective_action_display_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_perspective_action_display_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_perspective_action_handlerP_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_perspective_action_handlerP_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_perspective_action_handler_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PERSPECTIVE_ACTION_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_perspective_action_handler_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != perspective_action_p(v_object) : "! cb_facets.perspective_action_p(v_object) " + "cb_facets.perspective_action_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject make_perspective_action_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cb_facets.$perspective_action_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_perspective_action_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($KEYWORD)) {
                            _csetf_perspective_action_keyword(v_new, current_value);
                        } else {
                            if (pcase_var.eql($ORDER_NUM)) {
                                _csetf_perspective_action_order_num(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PERSPECTIVE)) {
                                    _csetf_perspective_action_perspective(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($kw44$DISPLAY__FN)) {
                                        _csetf_perspective_action_displayP_fn(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($DISPLAY_FN)) {
                                            _csetf_perspective_action_display_fn(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($kw140$HANDLER__FN)) {
                                                _csetf_perspective_action_handlerP_fn(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($HANDLER_FN)) {
                                                    _csetf_perspective_action_handler_fn(v_new, current_value);
                                                } else {
                                                    Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_perspective_action(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cb_facets.$perspective_action_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_perspective_action_name(v_new, current_value);
            } else
                if (pcase_var.eql($KEYWORD)) {
                    _csetf_perspective_action_keyword(v_new, current_value);
                } else
                    if (pcase_var.eql($ORDER_NUM)) {
                        _csetf_perspective_action_order_num(v_new, current_value);
                    } else
                        if (pcase_var.eql($PERSPECTIVE)) {
                            _csetf_perspective_action_perspective(v_new, current_value);
                        } else
                            if (pcase_var.eql($kw54$DISPLAY__FN)) {
                                _csetf_perspective_action_displayP_fn(v_new, current_value);
                            } else
                                if (pcase_var.eql($DISPLAY_FN)) {
                                    _csetf_perspective_action_display_fn(v_new, current_value);
                                } else
                                    if (pcase_var.eql($kw152$HANDLER__FN)) {
                                        _csetf_perspective_action_handlerP_fn(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($HANDLER_FN)) {
                                            _csetf_perspective_action_handler_fn(v_new, current_value);
                                        } else {
                                            Errors.error($str57$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_perspective_action(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PERSPECTIVE_ACTION, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, perspective_action_name(obj));
        funcall(visitor_fn, obj, $SLOT, $KEYWORD, perspective_action_keyword(obj));
        funcall(visitor_fn, obj, $SLOT, $ORDER_NUM, perspective_action_order_num(obj));
        funcall(visitor_fn, obj, $SLOT, $PERSPECTIVE, perspective_action_perspective(obj));
        funcall(visitor_fn, obj, $SLOT, $kw54$DISPLAY__FN, perspective_action_displayP_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $DISPLAY_FN, perspective_action_display_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $kw152$HANDLER__FN, perspective_action_handlerP_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $HANDLER_FN, perspective_action_handler_fn(obj));
        funcall(visitor_fn, obj, $END, MAKE_PERSPECTIVE_ACTION, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_perspective_action_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_perspective_action(obj, visitor_fn);
    }

    public static final SubLObject print_perspective_action_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
                princ($str_alt49$_, stream);
            } else {
                if (NIL != $print_readably$.getDynamicValue(thread)) {
                    print_not_readable(v_object, stream);
                } else {
                    {
                        SubLObject v_object_72 = v_object;
                        SubLObject stream_73 = stream;
                        write_string($str_alt50$__, stream_73, UNPROVIDED, UNPROVIDED);
                        write(type_of(v_object_72), new SubLObject[]{ $STREAM, stream_73 });
                        write_char(CHAR_space, stream_73);
                        princ(perspective_action_name(v_object), stream);
                        write_char(CHAR_greater, stream_73);
                    }
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_perspective_action(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $print_level$.getDynamicValue(thread)) && depth.numG($print_level$.getDynamicValue(thread))) {
            princ($str64$_, stream);
        } else
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
                princ(perspective_action_name(v_object), stream);
                print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
            }

        return v_object;
    }

    /**
     * Define a new perspective-action.
     */
    @LispMethod(comment = "Define a new perspective-action.")
    public static final SubLObject defperspective_action_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt53);
            name = current.first();
            current = current.rest();
            {
                SubLObject arglist = current;
                SubLObject new_perspective_action = $sym142$NEW_PERSPECTIVE_ACTION;
                return list(CLET, list(list(new_perspective_action, list(MAKE_PERSPECTIVE_ACTION, list(QUOTE, arglist)))), list(CSETF, list(PERSPECTIVE_ACTION_NAME, new_perspective_action), list(QUOTE, name)), list(CSETQ, $perspective_actions$, list(CONS, new_perspective_action, listS(DELETE, list(QUOTE, name), $list_alt145))));
            }
        }
    }

    /**
     * Define a new perspective-action.
     */
    @LispMethod(comment = "Define a new perspective-action.")
    public static SubLObject defperspective_action(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list65);
        name = current.first();
        final SubLObject arglist;
        current = arglist = current.rest();
        final SubLObject new_perspective_action = $sym156$NEW_PERSPECTIVE_ACTION;
        return list(CLET, list(list(new_perspective_action, list(MAKE_PERSPECTIVE_ACTION, list(QUOTE, arglist)))), list(CSETF, list(PERSPECTIVE_ACTION_NAME, new_perspective_action), list(QUOTE, name)), list(CSETQ, $perspective_actions$, list(CONS, new_perspective_action, listS(DELETE, list(QUOTE, name), $list158))));
    }/**
     * Define a new perspective-action.
     */


    public static final SubLObject perspective_actions_alt() {
        return $perspective_actions$.getGlobalValue();
    }

    public static SubLObject perspective_actions() {
        return $perspective_actions$.getGlobalValue();
    }

    public static final SubLObject sort_perspective_actions_alt(SubLObject perspective_actions) {
        return Sort.sort(perspective_actions, symbol_function($sym146$_), symbol_function(PERSPECTIVE_ACTION_ORDER_NUM));
    }

    public static SubLObject sort_perspective_actions(final SubLObject perspective_actions) {
        return Sort.sort(perspective_actions, symbol_function($sym159$_), symbol_function(PERSPECTIVE_ACTION_ORDER_NUM));
    }

    public static final SubLObject sorted_perspective_actions_for_perspective_alt(SubLObject perspective) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = perspective_actions();
            SubLObject poss_perspective_action = NIL;
            for (poss_perspective_action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , poss_perspective_action = cdolist_list_var.first()) {
                {
                    SubLObject perspective_action_perspective = perspective_action_perspective(poss_perspective_action);
                    if (perspective == perspective_action_perspective) {
                        result = cons(poss_perspective_action, result);
                    }
                }
            }
            return sort_perspective_actions(result);
        }
    }

    public static SubLObject sorted_perspective_actions_for_perspective(final SubLObject perspective) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = perspective_actions();
        SubLObject poss_perspective_action = NIL;
        poss_perspective_action = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject perspective_action_perspective = perspective_action_perspective(poss_perspective_action);
            if (perspective.eql(perspective_action_perspective)) {
                result = cons(poss_perspective_action, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            poss_perspective_action = cdolist_list_var.first();
        } 
        return sort_perspective_actions(result);
    }

    /**
     * Display perspective-actions for PERSPECTIVE by calling the perspective-action-display-fn iff perspective-action-display?-fn.
     */
    @LispMethod(comment = "Display perspective-actions for PERSPECTIVE by calling the perspective-action-display-fn iff perspective-action-display?-fn.")
    public static final SubLObject display_perspective_actions_for_perspective_alt(SubLObject perspective, SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject perspective_actions = sorted_perspective_actions_for_perspective(perspective);
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
                if (NIL != html_macros.$html_color_light_grey$.getDynamicValue(thread)) {
                    html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_light_grey$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_width$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str_alt69$100_);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject cdolist_list_var = perspective_actions;
                            SubLObject perspective_action = NIL;
                            for (perspective_action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , perspective_action = cdolist_list_var.first()) {
                                if (NIL != perspective_action_p(perspective_action)) {
                                    {
                                        SubLObject perspective_action_displayP_fn = perspective_action_displayP_fn(perspective_action);
                                        SubLObject perspective_action_display_fn = perspective_action_display_fn(perspective_action);
                                        if ((perspective_action_displayP_fn.isFunctionSpec() && perspective_action_display_fn.isFunctionSpec()) && (NIL != funcall(perspective_action_displayP_fn, arghash))) {
                                            arghash = funcall(perspective_action_display_fn, arghash);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return arghash;
        }
    }

    /**
     * Display perspective-actions for PERSPECTIVE by calling the perspective-action-display-fn iff perspective-action-display?-fn.
     */
    @LispMethod(comment = "Display perspective-actions for PERSPECTIVE by calling the perspective-action-display-fn iff perspective-action-display?-fn.")
    public static SubLObject display_perspective_actions_for_perspective(final SubLObject perspective, SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject perspective_actions = sorted_perspective_actions_for_perspective(perspective);
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
        if (NIL != html_macros.$html_color_light_grey$.getGlobalValue()) {
            html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_color_light_grey$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str80$100_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cdolist_list_var = perspective_actions;
            SubLObject perspective_action = NIL;
            perspective_action = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != perspective_action_p(perspective_action)) {
                    final SubLObject perspective_action_displayP_fn = perspective_action_displayP_fn(perspective_action);
                    final SubLObject perspective_action_display_fn = perspective_action_display_fn(perspective_action);
                    if ((perspective_action_displayP_fn.isFunctionSpec() && perspective_action_display_fn.isFunctionSpec()) && (NIL != funcall(perspective_action_displayP_fn, arghash))) {
                        arghash = funcall(perspective_action_display_fn, arghash);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                perspective_action = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return arghash;
    }/**
     * Display perspective-actions for PERSPECTIVE by calling the perspective-action-display-fn iff perspective-action-display?-fn.
     */


    /**
     * Handle all perspective-actions by calling the perspective-action-handler-fn iff perspective-action-handler?-fn.
     */
    @LispMethod(comment = "Handle all perspective-actions by calling the perspective-action-handler-fn iff perspective-action-handler?-fn.")
    public static final SubLObject perspective_actions_handler_alt(SubLObject arghash) {
        {
            SubLObject cdolist_list_var = $perspective_actions$.getGlobalValue();
            SubLObject perspective_action = NIL;
            for (perspective_action = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , perspective_action = cdolist_list_var.first()) {
                {
                    SubLObject perspective_action_handlerP_fn = perspective_action_handlerP_fn(perspective_action);
                    SubLObject perspective_action_handler_fn = perspective_action_handler_fn(perspective_action);
                    if ((perspective_action_handlerP_fn.isFunctionSpec() && perspective_action_handler_fn.isFunctionSpec()) && (NIL != funcall(perspective_action_handlerP_fn, arghash))) {
                        arghash = funcall(perspective_action_handler_fn, arghash);
                    }
                }
            }
        }
        return arghash;
    }

    /**
     * Handle all perspective-actions by calling the perspective-action-handler-fn iff perspective-action-handler?-fn.
     */
    @LispMethod(comment = "Handle all perspective-actions by calling the perspective-action-handler-fn iff perspective-action-handler?-fn.")
    public static SubLObject perspective_actions_handler(SubLObject arghash) {
        SubLObject cdolist_list_var = $perspective_actions$.getGlobalValue();
        SubLObject perspective_action = NIL;
        perspective_action = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject perspective_action_handlerP_fn = perspective_action_handlerP_fn(perspective_action);
            final SubLObject perspective_action_handler_fn = perspective_action_handler_fn(perspective_action);
            if ((perspective_action_handlerP_fn.isFunctionSpec() && perspective_action_handler_fn.isFunctionSpec()) && (NIL != funcall(perspective_action_handlerP_fn, arghash))) {
                arghash = funcall(perspective_action_handler_fn, arghash);
            }
            cdolist_list_var = cdolist_list_var.rest();
            perspective_action = cdolist_list_var.first();
        } 
        return arghash;
    }/**
     * Handle all perspective-actions by calling the perspective-action-handler-fn iff perspective-action-handler?-fn.
     */


    public static final SubLObject perspective_action_change_perspective_displayP_alt(SubLObject arghash) {
        return T;
    }

    public static SubLObject perspective_action_change_perspective_displayP(final SubLObject arghash) {
        return T;
    }

    public static final SubLObject perspective_action_change_perspective_display_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
            if (NIL != html_macros.$html_color_light_grey$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_color_light_grey$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt69$100_);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject shown_perspective_keywords = NIL;
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = getf($perspective_type_sort$.getDynamicValue(thread), $DISPLAY, UNPROVIDED);
                                            SubLObject perspective_keyword = NIL;
                                            for (perspective_keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , perspective_keyword = cdolist_list_var.first()) {
                                                {
                                                    SubLObject item_var = perspective_keyword;
                                                    if (NIL == member(item_var, shown_perspective_keywords, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        shown_perspective_keywords = cons(item_var, shown_perspective_keywords);
                                                    }
                                                }
                                                {
                                                    SubLObject perspective = gethash(perspective_keyword, $perspectives_by_keyword$.getDynamicValue(thread), UNPROVIDED);
                                                    if (NIL != perspective) {
                                                        {
                                                            SubLObject perspective_display_string = format(NIL, $str_alt149$__A_, perspective_display_string(perspective));
                                                            SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
                                                            SubLObject perspective_relevantP = funcall(perspective_displayP_fn(perspective), arghash);
                                                            if (NIL != perspective_relevantP) {
                                                                if (perspective_keyword == html_arghash.get_arghash_value($PERSPECTIVE, arghash)) {
                                                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                    html_princ(perspective_display_string);
                                                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                } else {
                                                                    {
                                                                        SubLObject href = format(NIL, $str_alt150$_A__A, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), html_arghash.html_arghash_href(html_arghash.argassoc_to_arghash(list(list($FORT, fort), list($NEW_PERSPECTIVE, perspective_keyword))), $cb_facet_tool_handler$.getGlobalValue()));
                                                                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(href);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_princ(perspective_display_string);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                    }
                                                                }
                                                                html_indent(UNPROVIDED);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            return arghash;
        }
    }

    public static SubLObject perspective_action_change_perspective_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
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
        if (NIL != html_macros.$html_color_light_grey$.getGlobalValue()) {
            html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_color_light_grey$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str80$100_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject shown_perspective_keywords = NIL;
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject cdolist_list_var = getf($perspective_type_sort$.getDynamicValue(thread), $DISPLAY, UNPROVIDED);
                    SubLObject perspective_keyword = NIL;
                    perspective_keyword = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject item_var = perspective_keyword;
                        if (NIL == member(item_var, shown_perspective_keywords, symbol_function(EQL), symbol_function(IDENTITY))) {
                            shown_perspective_keywords = cons(item_var, shown_perspective_keywords);
                        }
                        final SubLObject perspective = gethash(perspective_keyword, $perspectives_by_keyword$.getDynamicValue(thread), UNPROVIDED);
                        if (NIL != perspective) {
                            final SubLObject perspective_display_string = format(NIL, $str162$__A_, perspective_display_string(perspective));
                            final SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
                            final SubLObject perspective_relevantP = funcall(perspective_displayP_fn(perspective), arghash);
                            if (NIL != perspective_relevantP) {
                                if (perspective_keyword.eql(html_arghash.get_arghash_value($PERSPECTIVE, arghash))) {
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ(perspective_display_string);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } else {
                                    final SubLObject href = format(NIL, $str163$_A__A, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), html_arghash.html_arghash_href(html_arghash.argassoc_to_arghash(list(list($FORT, fort), list($NEW_PERSPECTIVE, perspective_keyword))), $cb_facet_tool_handler$.getGlobalValue()));
                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(href);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(perspective_display_string);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                                    }
                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_indent(UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        perspective_keyword = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        return arghash;
    }

    public static final SubLObject perspective_action_change_perspective_handlerP_alt(SubLObject arghash) {
        return T;
    }

    public static SubLObject perspective_action_change_perspective_handlerP(final SubLObject arghash) {
        return T;
    }

    public static final SubLObject perspective_action_change_perspective_handler_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_perspective = html_arghash.get_arghash_value($NEW_PERSPECTIVE, arghash);
                if (NIL != new_perspective) {
                    html_arghash.set_arghash_value($PERSPECTIVE, arghash, new_perspective);
                }
            }
            {
                SubLObject have_perspectiveP = NIL;
                if (NIL == have_perspectiveP) {
                    {
                        SubLObject csome_list_var = cons(html_arghash.get_arghash_value($PERSPECTIVE, arghash), getf($perspective_type_sort$.getDynamicValue(thread), $DEFAULT, UNPROVIDED));
                        SubLObject perspective_keyword = NIL;
                        for (perspective_keyword = csome_list_var.first(); !((NIL != have_perspectiveP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , perspective_keyword = csome_list_var.first()) {
                            {
                                SubLObject perspective_relevantP = perspective_from_keyword_relevantP(perspective_keyword, arghash);
                                if (NIL != perspective_relevantP) {
                                    have_perspectiveP = T;
                                    html_arghash.set_arghash_value($PERSPECTIVE, arghash, perspective_keyword);
                                }
                            }
                        }
                    }
                }
            }
            return arghash;
        }
    }

    public static SubLObject perspective_action_change_perspective_handler(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_perspective = html_arghash.get_arghash_value($NEW_PERSPECTIVE, arghash);
        if (NIL != new_perspective) {
            html_arghash.set_arghash_value($PERSPECTIVE, arghash, new_perspective);
        }
        SubLObject have_perspectiveP = NIL;
        if (NIL == have_perspectiveP) {
            SubLObject csome_list_var = cons(html_arghash.get_arghash_value($PERSPECTIVE, arghash), getf($perspective_type_sort$.getDynamicValue(thread), $DEFAULT, UNPROVIDED));
            SubLObject perspective_keyword = NIL;
            perspective_keyword = csome_list_var.first();
            while ((NIL == have_perspectiveP) && (NIL != csome_list_var)) {
                final SubLObject perspective_relevantP = perspective_from_keyword_relevantP(perspective_keyword, arghash);
                if (NIL != perspective_relevantP) {
                    have_perspectiveP = T;
                    html_arghash.set_arghash_value($PERSPECTIVE, arghash, perspective_keyword);
                }
                csome_list_var = csome_list_var.rest();
                perspective_keyword = csome_list_var.first();
            } 
        }
        return arghash;
    }

    public static final SubLObject perspective_action_show_definition_displayP_alt(SubLObject arghash) {
        return T;
    }

    public static SubLObject perspective_action_show_definition_displayP(final SubLObject arghash) {
        return T;
    }

    public static final SubLObject perspective_action_show_definition_display_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
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
                if (NIL != html_macros.$html_color_light_blue$.getDynamicValue(thread)) {
                    html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_light_blue$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_width$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str_alt69$100_);
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
                            SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($MIDDLE));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(FIVE_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                cb_facet_form(fort);
                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($MIDDLE));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(THREE_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str_alt156$_Show_);
                                                cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                html_princ($str_alt157$_in_Index_Browser_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != html_macros.$html_color_light_blue$.getDynamicValue(thread)) {
                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_color_light_blue$.getDynamicValue(thread));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        {
                                            SubLObject defining_mts = Sort.sort(remove_duplicates(Mapping.mapcar(symbol_function(ASSERTION_MT), kb_mapping.gather_gaf_arg_index(fort, ONE_INTEGER, $$isa, UNPROVIDED, UNPROVIDED)), symbol_function(HLMT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym71$GENERALITY_ESTIMATE_), UNPROVIDED);
                                            if (NIL != list_utilities.sublisp_boolean(defining_mts)) {
                                                html_princ($str_alt162$Defined_in_);
                                                {
                                                    SubLObject cdolist_list_var = defining_mts;
                                                    SubLObject defining_mt = NIL;
                                                    for (defining_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defining_mt = cdolist_list_var.first()) {
                                                        cb_facet_form(defining_mt);
                                                        html_princ($str_alt163$_);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != html_macros.$html_color_lighter_blue$.getDynamicValue(thread)) {
                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_color_lighter_blue$.getDynamicValue(thread));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject comments = kb_mapping_utilities.pred_values_in_any_mt(fort, $$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (NIL != comments) {
                                                {
                                                    SubLObject cdolist_list_var = comments;
                                                    SubLObject comment = NIL;
                                                    for (comment = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , comment = cdolist_list_var.first()) {
                                                        cb_facet_form(comment);
                                                    }
                                                }
                                            } else {
                                                html_princ($str_alt165$No_comment_);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                {
                    SubLObject asserted_isa = isa.asserted_isa(fort, $facet_tool_mt$.getDynamicValue(thread));
                    SubLObject min_isa = isa.min_isa(fort, $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED);
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
                    if (NIL != html_macros.$html_color_light_yellow$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_color_light_yellow$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (true) {
                        html_markup(html_macros.$html_table_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str_alt69$100_);
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
                                SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str_alt69$100_);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            html_princ($str_alt166$__isa__);
                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            html_princ($$$in_Mt);
                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_arghash.html_arghash_submit_input(arghash, $$$Unassert, $UNASSERT_GO, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            if (NIL == min_isa) {
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                if (NIL != html_macros.$html_color_lighter_yellow$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_color_lighter_yellow$.getDynamicValue(thread));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_indent(FIVE_INTEGER);
                                                html_princ($str_alt167$Undefined_in_current_Mt_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                            {
                                SubLObject cdolist_list_var = cardinality_estimates.sort_by_generality_estimate(asserted_isa, $DESCENDING);
                                SubLObject an_isa = NIL;
                                for (an_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , an_isa = cdolist_list_var.first()) {
                                    {
                                        SubLObject isa_assertions = kb_indexing.find_all_gafs(list($$isa, fort, an_isa));
                                        SubLObject cdolist_list_var_92 = isa_assertions;
                                        SubLObject isa_assertion = NIL;
                                        for (isa_assertion = cdolist_list_var_92.first(); NIL != cdolist_list_var_92; cdolist_list_var_92 = cdolist_list_var_92.rest() , isa_assertion = cdolist_list_var_92.first()) {
                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            if (NIL != html_macros.$html_color_lighter_yellow$.getDynamicValue(thread)) {
                                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_macros.$html_color_lighter_yellow$.getDynamicValue(thread));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_indent(FIVE_INTEGER);
                                                            if (NIL != isa_assertion) {
                                                                cb_link($ASSERTION, isa_assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                html_indent(UNPROVIDED);
                                                            }
                                                            cb_facet_form(an_isa);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            cb_facet_form(assertions_high.assertion_mt(isa_assertion));
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align($CENTER));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_arghash.html_arghash_checkbox_input(arghash, $UNASSERT_ID, assertion_handles.assertion_id(isa_assertion), UNPROVIDED, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                html_newline(UNPROVIDED);
            }
            return arghash;
        }
    }

    public static SubLObject perspective_action_show_definition_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
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
        if (NIL != html_macros.$html_color_light_blue$.getGlobalValue()) {
            html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_color_light_blue$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str80$100_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($MIDDLE));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(FIVE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        cb_facet_form(fort);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($MIDDLE));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(THREE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str169$_Show_);
                        cb_form(fort, UNPROVIDED, UNPROVIDED);
                        html_princ($str170$_in_Index_Browser_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (NIL != html_macros.$html_color_light_blue$.getGlobalValue()) {
                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_color_light_blue$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject defining_mts = Sort.sort(remove_duplicates(Mapping.mapcar(symbol_function(ASSERTION_MT), kb_mapping.gather_gaf_arg_index(fort, ONE_INTEGER, $$isa, UNPROVIDED, UNPROVIDED)), symbol_function(HLMT_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym82$GENERALITY_ESTIMATE_), UNPROVIDED);
                    if (NIL != list_utilities.sublisp_boolean(defining_mts)) {
                        html_princ($$$Defined_in_);
                        SubLObject cdolist_list_var = defining_mts;
                        SubLObject defining_mt = NIL;
                        defining_mt = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cb_facet_form(defining_mt);
                            html_princ($$$_);
                            cdolist_list_var = cdolist_list_var.rest();
                            defining_mt = cdolist_list_var.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
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
            final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject comments = kb_mapping_utilities.pred_values_in_any_mt(fort, $$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != comments) {
                        SubLObject cdolist_list_var2 = comments;
                        SubLObject comment = NIL;
                        comment = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            cb_facet_form(comment);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            comment = cdolist_list_var2.first();
                        } 
                    } else {
                        html_princ($str178$No_comment_);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        final SubLObject asserted_isa = isa.asserted_isa(fort, $facet_tool_mt$.getDynamicValue(thread));
        final SubLObject min_isa = isa.min_isa(fort, $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED);
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
        if (NIL != html_macros.$html_color_light_yellow$.getGlobalValue()) {
            html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_color_light_yellow$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str80$100_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_4 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str80$100_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($str179$__isa__);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($$$in_Mt);
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_arghash.html_arghash_submit_input(arghash, $$$Unassert, $UNASSERT_GO, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if (NIL == min_isa) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_lighter_yellow$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_lighter_yellow$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(FIVE_INTEGER);
                        html_princ($str180$Undefined_in_current_Mt_);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            SubLObject cdolist_list_var3 = cardinality_estimates.sort_by_generality_estimate(asserted_isa, $DESCENDING);
            SubLObject an_isa = NIL;
            an_isa = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                SubLObject cdolist_list_var_$90;
                final SubLObject isa_assertions = cdolist_list_var_$90 = kb_indexing.find_all_gafs(list($$isa, fort, an_isa));
                SubLObject isa_assertion = NIL;
                isa_assertion = cdolist_list_var_$90.first();
                while (NIL != cdolist_list_var_$90) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (NIL != html_macros.$html_color_lighter_yellow$.getGlobalValue()) {
                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_color_lighter_yellow$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_indent(FIVE_INTEGER);
                            if (NIL != isa_assertion) {
                                cb_link($ASSERTION, isa_assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                            }
                            cb_facet_form(an_isa);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_facet_form(assertions_high.assertion_mt(isa_assertion));
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_arghash.html_arghash_checkbox_input(arghash, $UNASSERT_ID, assertion_handles.assertion_id(isa_assertion), UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                    isa_assertion = cdolist_list_var_$90.first();
                } 
                cdolist_list_var3 = cdolist_list_var3.rest();
                an_isa = cdolist_list_var3.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_4, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        return arghash;
    }

    public static final SubLObject perspective_action_show_definition_handlerP_alt(SubLObject arghash) {
        return NIL;
    }

    public static SubLObject perspective_action_show_definition_handlerP(final SubLObject arghash) {
        return NIL;
    }

    public static final SubLObject perspective_action_show_definition_handler_alt(SubLObject arghash) {
        return arghash;
    }

    public static SubLObject perspective_action_show_definition_handler(final SubLObject arghash) {
        return arghash;
    }

    public static final SubLObject perspective_action_add_fort_to_chosen_cols_displayP_alt(SubLObject arghash) {
        return T;
    }

    public static SubLObject perspective_action_add_fort_to_chosen_cols_displayP(final SubLObject arghash) {
        return T;
    }

    public static final SubLObject perspective_action_add_fort_to_chosen_cols_display_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str_alt171$__Make_);
                            cb_facet_form(html_arghash.get_arghash_value($FORT, arghash));
                            html_princ($str_alt172$_a_direct_instance_of_selected_co);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_arghash.html_arghash_submit_input(arghash, $$$Go, $ADD_FORT_TO_CHOSEN_COLS_GO, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return arghash;
        }
    }

    public static SubLObject perspective_action_add_fort_to_chosen_cols_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($str184$__Make_);
                cb_facet_form(html_arghash.get_arghash_value($FORT, arghash));
                html_princ($str185$_a_direct_instance_of_selected_co);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_arghash.html_arghash_submit_input(arghash, $$$Go, $ADD_FORT_TO_CHOSEN_COLS_GO, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return arghash;
    }

    public static final SubLObject perspective_action_add_fort_to_chosen_cols_handlerP_alt(SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($ADD_FORT_TO_CHOSEN_COLS_GO, arghash));
    }

    public static SubLObject perspective_action_add_fort_to_chosen_cols_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($ADD_FORT_TO_CHOSEN_COLS_GO, arghash));
    }

    public static final SubLObject perspective_action_add_fort_to_chosen_cols_handler_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
                SubLObject add_sups = html_arghash.get_arghash_value_list($ADD_SUP, arghash);
                SubLObject add_sup_froms = html_arghash.get_arghash_value_list($ADD_SUP_FROM, arghash);
                SubLObject all_sups = add_sups;
                {
                    SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($A_FACET, arghash);
                    SubLObject facet_id = NIL;
                    for (facet_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , facet_id = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_98 = html_arghash.get_arghash_value_list(facet_id, arghash);
                            SubLObject the_sup = NIL;
                            for (the_sup = cdolist_list_var_98.first(); NIL != cdolist_list_var_98; cdolist_list_var_98 = cdolist_list_var_98.rest() , the_sup = cdolist_list_var_98.first()) {
                                if (NIL != forts.fort_p(the_sup)) {
                                    {
                                        SubLObject item_var = the_sup;
                                        if (NIL == member(item_var, all_sups, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            all_sups = cons(item_var, all_sups);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = add_sup_froms;
                    SubLObject add_sup_from = NIL;
                    for (add_sup_from = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , add_sup_from = cdolist_list_var.first()) {
                        {
                            SubLObject the_sups = html_arghash.get_arghash_value_list(add_sup_from, arghash);
                            SubLObject cdolist_list_var_99 = the_sups;
                            SubLObject the_sup = NIL;
                            for (the_sup = cdolist_list_var_99.first(); NIL != cdolist_list_var_99; cdolist_list_var_99 = cdolist_list_var_99.rest() , the_sup = cdolist_list_var_99.first()) {
                                if (NIL != forts.fort_p(the_sup)) {
                                    {
                                        SubLObject item_var = the_sup;
                                        if (NIL == member(item_var, all_sups, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            all_sups = cons(item_var, all_sups);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == all_sups) {
                    html_arghash.push_arghash_value($ERRORS, $list_alt176, arghash);
                    return arghash;
                }
                {
                    SubLObject cdolist_list_var = all_sups;
                    SubLObject sup = NIL;
                    for (sup = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sup = cdolist_list_var.first()) {
                        {
                            SubLObject abortP = NIL;
                            thread.resetMultipleValues();
                            {
                                SubLObject arghash_100 = arghash_assert_now(arghash, list($$isa, fort, sup), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                SubLObject abortP_101 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                arghash = arghash_100;
                                abortP = abortP_101;
                            }
                        }
                    }
                }
            }
            return arghash;
        }
    }

    public static SubLObject perspective_action_add_fort_to_chosen_cols_handler(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
        final SubLObject add_sups = html_arghash.get_arghash_value_list($ADD_SUP, arghash);
        final SubLObject add_sup_froms = html_arghash.get_arghash_value_list($ADD_SUP_FROM, arghash);
        SubLObject all_sups = add_sups;
        SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($A_FACET, arghash);
        SubLObject facet_id = NIL;
        facet_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$96 = html_arghash.get_arghash_value_list(facet_id, arghash);
            SubLObject the_sup = NIL;
            the_sup = cdolist_list_var_$96.first();
            while (NIL != cdolist_list_var_$96) {
                if (NIL != forts.fort_p(the_sup)) {
                    final SubLObject item_var = the_sup;
                    if (NIL == member(item_var, all_sups, symbol_function(EQL), symbol_function(IDENTITY))) {
                        all_sups = cons(item_var, all_sups);
                    }
                }
                cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                the_sup = cdolist_list_var_$96.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            facet_id = cdolist_list_var.first();
        } 
        cdolist_list_var = add_sup_froms;
        SubLObject add_sup_from = NIL;
        add_sup_from = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$97;
            final SubLObject the_sups = cdolist_list_var_$97 = html_arghash.get_arghash_value_list(add_sup_from, arghash);
            SubLObject the_sup2 = NIL;
            the_sup2 = cdolist_list_var_$97.first();
            while (NIL != cdolist_list_var_$97) {
                if (NIL != forts.fort_p(the_sup2)) {
                    final SubLObject item_var2 = the_sup2;
                    if (NIL == member(item_var2, all_sups, symbol_function(EQL), symbol_function(IDENTITY))) {
                        all_sups = cons(item_var2, all_sups);
                    }
                }
                cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                the_sup2 = cdolist_list_var_$97.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            add_sup_from = cdolist_list_var.first();
        } 
        if (NIL == all_sups) {
            html_arghash.push_arghash_value($ERRORS, $list189, arghash);
            return arghash;
        }
        cdolist_list_var = all_sups;
        SubLObject sup = NIL;
        sup = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject abortP = NIL;
            thread.resetMultipleValues();
            final SubLObject arghash_$98 = arghash_assert_now(arghash, list($$isa, fort, sup), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            final SubLObject abortP_$99 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$98;
            abortP = abortP_$99;
            cdolist_list_var = cdolist_list_var.rest();
            sup = cdolist_list_var.first();
        } 
        return arghash;
    }

    public static final SubLObject perspective_action_add_specs_to_facet_displayP_alt(SubLObject arghash) {
        return makeBoolean((NIL != html_arghash.get_arghash_value($FACETS_, arghash)) && ((NIL != html_arghash.get_arghash_value($kw102$SPECS_FACETED_, arghash)) || (NIL != html_arghash.get_arghash_value($kw105$SPECS_UNFACETED_, arghash))));
    }

    public static SubLObject perspective_action_add_specs_to_facet_displayP(final SubLObject arghash) {
        return makeBoolean((NIL != html_arghash.get_arghash_value($FACETS_, arghash)) && ((NIL != html_arghash.get_arghash_value($kw113$SPECS_FACETED_, arghash)) || (NIL != html_arghash.get_arghash_value($kw116$SPECS_UNFACETED_, arghash))));
    }

    public static final SubLObject perspective_action_add_specs_to_facet_display_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str_alt179$__Add_selected_spec_s__to_selecte);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_arghash.html_arghash_submit_input(arghash, $$$Go, $ADD_SPECS_TO_FACET_GO, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return arghash;
        }
    }

    public static SubLObject perspective_action_add_specs_to_facet_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($str192$__Add_selected_spec_s__to_selecte);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_arghash.html_arghash_submit_input(arghash, $$$Go, $ADD_SPECS_TO_FACET_GO, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return arghash;
    }

    public static final SubLObject perspective_action_add_specs_to_facet_handlerP_alt(SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($ADD_SPECS_TO_FACET_GO, arghash));
    }

    public static SubLObject perspective_action_add_specs_to_facet_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($ADD_SPECS_TO_FACET_GO, arghash));
    }

    public static final SubLObject perspective_action_add_specs_to_facet_handler_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject selected_specs = get_selected_specs(arghash);
                if (NIL == selected_specs) {
                    html_arghash.push_arghash_value($ERRORS, $list_alt181, arghash);
                } else {
                    {
                        SubLObject facet_id_selected = html_arghash.get_arghash_value($FACET_ID_SELECTED, arghash);
                        if (!facet_id_selected.isNumber()) {
                            html_arghash.push_arghash_value($ERRORS, $list_alt182, arghash);
                            return arghash;
                        }
                        {
                            SubLObject facet = facets.find_facet_by_id(facet_id_selected);
                            if (NIL == facets.facet_p(facet)) {
                                html_arghash.push_arghash_value($ERRORS, $list_alt182, arghash);
                                return arghash;
                            }
                            {
                                SubLObject facet_col_type = facets.facet_col_type(facet);
                                if (NIL == fort_types_interface.collectionP(facet_col_type)) {
                                    html_arghash.push_arghash_value($ERRORS, list($UNSUPPORTED_FACET_CHOSEN, $str_alt184$_A_assertions_must_currently_be_h, facets.facet_strength(facet)), arghash);
                                    return arghash;
                                }
                                {
                                    SubLObject cdolist_list_var = selected_specs;
                                    SubLObject spec = NIL;
                                    for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                                        {
                                            SubLObject the_formula = list($$isa, spec, facet_col_type);
                                            arghash_assert_now(arghash, the_formula, $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return arghash;
        }
    }

    public static SubLObject perspective_action_add_specs_to_facet_handler(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject selected_specs = get_selected_specs(arghash);
        if (NIL == selected_specs) {
            html_arghash.push_arghash_value($ERRORS, $list194, arghash);
        } else {
            final SubLObject facet_id_selected = html_arghash.get_arghash_value($FACET_ID_SELECTED, arghash);
            if (!facet_id_selected.isNumber()) {
                html_arghash.push_arghash_value($ERRORS, $list195, arghash);
                return arghash;
            }
            final SubLObject facet = facets.find_facet_by_id(facet_id_selected);
            if (NIL == facets.facet_p(facet)) {
                html_arghash.push_arghash_value($ERRORS, $list195, arghash);
                return arghash;
            }
            final SubLObject facet_col_type = facets.facet_col_type(facet);
            if (NIL == fort_types_interface.collectionP(facet_col_type)) {
                html_arghash.push_arghash_value($ERRORS, list($UNSUPPORTED_FACET_CHOSEN, $str197$_A_assertions_must_currently_be_h, facets.facet_strength(facet)), arghash);
                return arghash;
            }
            SubLObject cdolist_list_var = selected_specs;
            SubLObject spec = NIL;
            spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject the_formula = list($$isa, spec, facet_col_type);
                arghash_assert_now(arghash, the_formula, $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            } 
        }
        return arghash;
    }

    public static final SubLObject perspective_action_add_specs_to_new_facet_displayP_alt(SubLObject arghash) {
        return makeBoolean((NIL != html_arghash.get_arghash_value($kw102$SPECS_FACETED_, arghash)) || (NIL != html_arghash.get_arghash_value($kw105$SPECS_UNFACETED_, arghash)));
    }

    public static SubLObject perspective_action_add_specs_to_new_facet_displayP(final SubLObject arghash) {
        return makeBoolean((NIL != html_arghash.get_arghash_value($kw113$SPECS_FACETED_, arghash)) || (NIL != html_arghash.get_arghash_value($kw116$SPECS_UNFACETED_, arghash)));
    }

    public static final SubLObject perspective_action_add_specs_to_new_facet_display_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($str_alt187$__Make_a_new_facet_with_selected_);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_arghash.html_arghash_submit_input(arghash, $$$Go, $ADD_SPECS_TO_NEW_FACET_GO, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_lighter_grey$.getDynamicValue(thread)) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_lighter_grey$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_indent(FIVE_INTEGER);
                                html_princ($str_alt189$New_facet_name__);
                                html_princ(string_utilities.make_valid_constant_name(kb_paths.fort_name(fort), UNPROVIDED));
                                html_princ($$$TypeBy);
                                html_arghash.html_arghash_text_input(arghash, $NEW_FACET_NAME, $str_alt192$, TWENTY_INTEGER, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                html_indent(FIVE_INTEGER);
                                html_princ($str_alt193$New_facet_type__);
                                html_arghash.html_arghash_radio_input(arghash, $NEW_FACET_TYPE, $$facets_Generic);
                                html_princ($str_alt196$_generic_);
                                html_arghash.html_arghash_radio_input(arghash, $NEW_FACET_TYPE, $$facets_Strict);
                                html_princ($str_alt198$_strict_);
                                html_arghash.html_arghash_radio_input(arghash, $NEW_FACET_TYPE, $$facets_Covering);
                                html_princ($str_alt200$_covering_);
                                html_arghash.html_arghash_radio_input(arghash, $NEW_FACET_TYPE, $$facets_Partition);
                                html_princ($str_alt202$_partition_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return arghash;
        }
    }

    public static SubLObject perspective_action_add_specs_to_new_facet_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($str200$__Make_a_new_facet_with_selected_);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_arghash.html_arghash_submit_input(arghash, $$$Go, $ADD_SPECS_TO_NEW_FACET_GO, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
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
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_indent(FIVE_INTEGER);
                html_princ($str202$New_facet_name__);
                html_princ(string_utilities.make_valid_constant_name(kb_paths.fort_name(fort), UNPROVIDED));
                html_princ($$$TypeBy);
                html_arghash.html_arghash_text_input(arghash, $NEW_FACET_NAME, $str205$, TWENTY_INTEGER, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_indent(FIVE_INTEGER);
                html_princ($str206$New_facet_type__);
                html_arghash.html_arghash_radio_input(arghash, $NEW_FACET_TYPE, $$facets_Generic);
                html_princ($$$_generic_);
                html_arghash.html_arghash_radio_input(arghash, $NEW_FACET_TYPE, $$facets_Strict);
                html_princ($$$_strict_);
                html_arghash.html_arghash_radio_input(arghash, $NEW_FACET_TYPE, $$facets_Covering);
                html_princ($$$_covering_);
                html_arghash.html_arghash_radio_input(arghash, $NEW_FACET_TYPE, $$facets_Partition);
                html_princ($$$_partition_);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return arghash;
    }

    public static final SubLObject perspective_action_add_specs_to_new_facet_handlerP_alt(SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($ADD_SPECS_TO_NEW_FACET_GO, arghash));
    }

    public static SubLObject perspective_action_add_specs_to_new_facet_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($ADD_SPECS_TO_NEW_FACET_GO, arghash));
    }

    public static final SubLObject perspective_action_add_specs_to_new_facet_handler_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_facet_name = html_arghash.get_arghash_value($NEW_FACET_NAME, arghash);
                SubLObject new_facet_type = html_arghash.get_arghash_value($NEW_FACET_TYPE, arghash);
                SubLObject specs = get_selected_specs(arghash);
                SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
                SubLObject abortP = NIL;
                {
                    SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($FACET_ID, arghash);
                    SubLObject facet_id = NIL;
                    for (facet_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , facet_id = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_105 = html_arghash.get_arghash_value_list(facet_id, arghash);
                            SubLObject the_spec = NIL;
                            for (the_spec = cdolist_list_var_105.first(); NIL != cdolist_list_var_105; cdolist_list_var_105 = cdolist_list_var_105.rest() , the_spec = cdolist_list_var_105.first()) {
                                if (NIL != forts.fort_p(the_spec)) {
                                    {
                                        SubLObject item_var = the_spec;
                                        if (NIL == member(item_var, specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            specs = cons(item_var, specs);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == specs) {
                    html_arghash.push_arghash_value($ERRORS, $list_alt181, arghash);
                    abortP = T;
                }
                if (NIL == subl_promotions.memberP(new_facet_type, facets.$facet_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                    html_arghash.push_arghash_value($ERRORS, $list_alt203, arghash);
                    abortP = T;
                }
                if (NIL == string_utilities.non_empty_stringP(new_facet_name)) {
                    html_arghash.push_arghash_value($ERRORS, $list_alt204, arghash);
                    abortP = T;
                }
                if (NIL != abortP) {
                    return arghash;
                }
                {
                    SubLObject facet_col_name = string_utilities.make_valid_constant_name(format(NIL, $str_alt205$_ATypeBy_A, string_utilities.make_valid_constant_name(kb_paths.fort_name(fort), UNPROVIDED), new_facet_name), UNPROVIDED);
                    SubLObject facet_col = ke.ke_create_now(facet_col_name, UNPROVIDED);
                    if (NIL != subl_promotions.memberP(new_facet_type, facets.$facet_predicates_disjoint$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject arghash_106 = arghash_assert_now(arghash, listS($$isa, facet_col, $list_alt206), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            SubLObject abortP_107 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            arghash = arghash_106;
                            abortP = abortP_107;
                        }
                    } else {
                        thread.resetMultipleValues();
                        {
                            SubLObject arghash_108 = arghash_assert_now(arghash, listS($$isa, facet_col, $list_alt207), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            SubLObject abortP_109 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            arghash = arghash_108;
                            abortP = abortP_109;
                        }
                    }
                    if (NIL != abortP) {
                        return arghash;
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject arghash_110 = arghash_assert_now(arghash, listS($$genls, facet_col, $list_alt208), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        SubLObject abortP_111 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        arghash = arghash_110;
                        abortP = abortP_111;
                    }
                    if (NIL != abortP) {
                        return arghash;
                    }
                    {
                        SubLObject facet_col_comment = format(NIL, $str_alt209$A_collection_of_collections__Each, string_utilities.object_to_string(fort), string_utilities.bunge(string_utilities.relevant_substrings(new_facet_name), UNPROVIDED));
                        thread.resetMultipleValues();
                        {
                            SubLObject arghash_112 = arghash_assert_now(arghash, list($$comment, facet_col, facet_col_comment), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            SubLObject abortP_113 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            arghash = arghash_112;
                            abortP = abortP_113;
                        }
                        if (NIL != abortP) {
                            return arghash;
                        }
                        {
                            SubLObject cdolist_list_var = specs;
                            SubLObject spec = NIL;
                            for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject arghash_114 = arghash_assert_now(arghash, list($$isa, spec, facet_col), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                    SubLObject abortP_115 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    arghash = arghash_114;
                                    abortP = abortP_115;
                                }
                                if (NIL != abortP) {
                                    return arghash;
                                }
                            }
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject arghash_116 = arghash_assert_now(arghash, list(new_facet_type, fort, facet_col), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            SubLObject abortP_117 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            arghash = arghash_116;
                            abortP = abortP_117;
                        }
                    }
                }
            }
            return arghash;
        }
    }

    public static SubLObject perspective_action_add_specs_to_new_facet_handler(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_facet_name = html_arghash.get_arghash_value($NEW_FACET_NAME, arghash);
        final SubLObject new_facet_type = html_arghash.get_arghash_value($NEW_FACET_TYPE, arghash);
        SubLObject specs = get_selected_specs(arghash);
        final SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
        SubLObject abortP = NIL;
        SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($FACET_ID, arghash);
        SubLObject facet_id = NIL;
        facet_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$103 = html_arghash.get_arghash_value_list(facet_id, arghash);
            SubLObject the_spec = NIL;
            the_spec = cdolist_list_var_$103.first();
            while (NIL != cdolist_list_var_$103) {
                if (NIL != forts.fort_p(the_spec)) {
                    final SubLObject item_var = the_spec;
                    if (NIL == member(item_var, specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                        specs = cons(item_var, specs);
                    }
                }
                cdolist_list_var_$103 = cdolist_list_var_$103.rest();
                the_spec = cdolist_list_var_$103.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            facet_id = cdolist_list_var.first();
        } 
        if (NIL == specs) {
            html_arghash.push_arghash_value($ERRORS, $list194, arghash);
            abortP = T;
        }
        if (NIL == subl_promotions.memberP(new_facet_type, facets.$facet_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            html_arghash.push_arghash_value($ERRORS, $list216, arghash);
            abortP = T;
        }
        if (NIL == string_utilities.non_empty_stringP(new_facet_name)) {
            html_arghash.push_arghash_value($ERRORS, $list217, arghash);
            abortP = T;
        }
        if (NIL != abortP) {
            return arghash;
        }
        final SubLObject facet_col_name = string_utilities.make_valid_constant_name(format(NIL, $str218$_ATypeBy_A, string_utilities.make_valid_constant_name(kb_paths.fort_name(fort), UNPROVIDED), new_facet_name), UNPROVIDED);
        final SubLObject facet_col = ke.ke_create_now(facet_col_name, UNPROVIDED);
        if (NIL != subl_promotions.memberP(new_facet_type, facets.$facet_predicates_disjoint$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject arghash_$104 = arghash_assert_now(arghash, listS($$isa, facet_col, $list219), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            final SubLObject abortP_$105 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$104;
            abortP = abortP_$105;
        } else {
            thread.resetMultipleValues();
            final SubLObject arghash_$105 = arghash_assert_now(arghash, listS($$isa, facet_col, $list220), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            final SubLObject abortP_$106 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$105;
            abortP = abortP_$106;
        }
        if (NIL != abortP) {
            return arghash;
        }
        thread.resetMultipleValues();
        final SubLObject arghash_$106 = arghash_assert_now(arghash, listS($$genls, facet_col, $list221), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        final SubLObject abortP_$107 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        arghash = arghash_$106;
        abortP = abortP_$107;
        if (NIL != abortP) {
            return arghash;
        }
        final SubLObject facet_col_comment = format(NIL, $str222$A_collection_of_collections__Each, string_utilities.object_to_string(fort), string_utilities.bunge(string_utilities.relevant_substrings(new_facet_name), UNPROVIDED));
        thread.resetMultipleValues();
        final SubLObject arghash_$107 = arghash_assert_now(arghash, list($$comment, facet_col, facet_col_comment), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        final SubLObject abortP_$108 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        arghash = arghash_$107;
        abortP = abortP_$108;
        if (NIL != abortP) {
            return arghash;
        }
        SubLObject cdolist_list_var2 = specs;
        SubLObject spec = NIL;
        spec = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            final SubLObject arghash_$108 = arghash_assert_now(arghash, list($$isa, spec, facet_col), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            final SubLObject abortP_$109 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$108;
            abortP = abortP_$109;
            if (NIL != abortP) {
                return arghash;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            spec = cdolist_list_var2.first();
        } 
        thread.resetMultipleValues();
        final SubLObject arghash_$109 = arghash_assert_now(arghash, list(new_facet_type, fort, facet_col), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        final SubLObject abortP_$110 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        arghash = arghash_$109;
        abortP = abortP_$110;
        return arghash;
    }

    public static final SubLObject perspective_action_make_specs_instances_of_col_or_new_spec_displayP_alt(SubLObject arghash) {
        return makeBoolean((NIL != html_arghash.get_arghash_value($kw102$SPECS_FACETED_, arghash)) || (NIL != html_arghash.get_arghash_value($kw105$SPECS_UNFACETED_, arghash)));
    }

    public static SubLObject perspective_action_make_specs_instances_of_col_or_new_spec_displayP(final SubLObject arghash) {
        return makeBoolean((NIL != html_arghash.get_arghash_value($kw113$SPECS_FACETED_, arghash)) || (NIL != html_arghash.get_arghash_value($kw116$SPECS_UNFACETED_, arghash)));
    }

    public static final SubLObject perspective_action_make_specs_instances_of_col_or_new_spec_display_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_118 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str_alt212$__Make_selected_spec_s__direct_sp);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_arghash.html_arghash_submit_input(arghash, $$$Go, $MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC_GO, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_118, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (NIL != html_macros.$html_color_lighter_grey$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_color_lighter_grey$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_119 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_indent(FIVE_INTEGER);
                            html_princ($str_alt214$Collection_or_new_spec_name__);
                            html_arghash.html_arghash_text_input(arghash, $NEW_SPEC_NAME, $str_alt192$, TWENTY_INTEGER, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_119, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return arghash;
        }
    }

    public static SubLObject perspective_action_make_specs_instances_of_col_or_new_spec_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($str225$__Make_selected_spec_s__direct_sp);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_arghash.html_arghash_submit_input(arghash, $$$Go, $MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC_GO, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
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
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_indent(FIVE_INTEGER);
                html_princ($str227$Collection_or_new_spec_name__);
                html_arghash.html_arghash_text_input(arghash, $NEW_SPEC_NAME, $str205$, TWENTY_INTEGER, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return arghash;
    }

    public static final SubLObject perspective_action_make_specs_instances_of_col_or_new_spec_handlerP_alt(SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC_GO, arghash));
    }

    public static SubLObject perspective_action_make_specs_instances_of_col_or_new_spec_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC_GO, arghash));
    }

    public static final SubLObject perspective_action_make_specs_instances_of_col_or_new_spec_handler_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_spec_name = string_utilities.string_remove_constant_reader_prefix(html_arghash.get_arghash_value($NEW_SPEC_NAME, arghash));
                SubLObject specs = get_selected_specs(arghash);
                SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
                SubLObject abortP = NIL;
                {
                    SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($FACET_ID, arghash);
                    SubLObject facet_id = NIL;
                    for (facet_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , facet_id = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_120 = html_arghash.get_arghash_value_list(facet_id, arghash);
                            SubLObject the_spec = NIL;
                            for (the_spec = cdolist_list_var_120.first(); NIL != cdolist_list_var_120; cdolist_list_var_120 = cdolist_list_var_120.rest() , the_spec = cdolist_list_var_120.first()) {
                                if (NIL != forts.fort_p(the_spec)) {
                                    {
                                        SubLObject item_var = the_spec;
                                        if (NIL == member(item_var, specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            specs = cons(item_var, specs);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == specs) {
                    html_arghash.push_arghash_value($ERRORS, $list_alt181, arghash);
                    abortP = T;
                }
                if (NIL == constant_completion_high.valid_constant_name_p(new_spec_name)) {
                    html_arghash.push_arghash_value($ERRORS, $list_alt216, arghash);
                    abortP = T;
                }
                if (NIL != abortP) {
                    return arghash;
                }
                {
                    SubLObject new_col = constants_high.find_constant(new_spec_name);
                    if (NIL == new_col) {
                        new_col = ke.ke_create_now(new_spec_name, UNPROVIDED);
                        thread.resetMultipleValues();
                        {
                            SubLObject arghash_121 = arghash_assert_now(arghash, listS($$isa, new_col, $list_alt217), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            SubLObject abortP_122 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            arghash = arghash_121;
                            abortP = abortP_122;
                        }
                        if (NIL != abortP) {
                            return arghash;
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject arghash_123 = arghash_assert_now(arghash, list($$genls, new_col, fort), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            SubLObject abortP_124 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            arghash = arghash_123;
                            abortP = abortP_124;
                        }
                        if (NIL != abortP) {
                            return arghash;
                        }
                    }
                    {
                        SubLObject cdolist_list_var = specs;
                        SubLObject spec = NIL;
                        for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject arghash_125 = arghash_assert_now(arghash, list($$genls, spec, new_col), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                SubLObject abortP_126 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                arghash = arghash_125;
                                abortP = abortP_126;
                            }
                            if (NIL != abortP) {
                                return arghash;
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = specs;
                        SubLObject spec = NIL;
                        for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject arghash_127 = arghash_unassert_now(arghash, list($$genls, spec, fort), $facet_tool_mt$.getDynamicValue(thread));
                                SubLObject abortP_128 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                arghash = arghash_127;
                                abortP = abortP_128;
                            }
                            if (NIL != abortP) {
                                return arghash;
                            }
                        }
                    }
                }
            }
            return arghash;
        }
    }

    public static SubLObject perspective_action_make_specs_instances_of_col_or_new_spec_handler(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_spec_name = string_utilities.string_remove_constant_reader_prefix(html_arghash.get_arghash_value($NEW_SPEC_NAME, arghash));
        SubLObject specs = get_selected_specs(arghash);
        final SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
        SubLObject abortP = NIL;
        SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($FACET_ID, arghash);
        SubLObject facet_id = NIL;
        facet_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$118 = html_arghash.get_arghash_value_list(facet_id, arghash);
            SubLObject the_spec = NIL;
            the_spec = cdolist_list_var_$118.first();
            while (NIL != cdolist_list_var_$118) {
                if (NIL != forts.fort_p(the_spec)) {
                    final SubLObject item_var = the_spec;
                    if (NIL == member(item_var, specs, symbol_function(EQL), symbol_function(IDENTITY))) {
                        specs = cons(item_var, specs);
                    }
                }
                cdolist_list_var_$118 = cdolist_list_var_$118.rest();
                the_spec = cdolist_list_var_$118.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            facet_id = cdolist_list_var.first();
        } 
        if (NIL == specs) {
            html_arghash.push_arghash_value($ERRORS, $list194, arghash);
            abortP = T;
        }
        if (NIL == constant_completion_high.valid_constant_name_p(new_spec_name)) {
            html_arghash.push_arghash_value($ERRORS, $list229, arghash);
            abortP = T;
        }
        if (NIL != abortP) {
            return arghash;
        }
        SubLObject new_col = constants_high.find_constant(new_spec_name);
        if (NIL == new_col) {
            new_col = ke.ke_create_now(new_spec_name, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject arghash_$119 = arghash_assert_now(arghash, listS($$isa, new_col, $list230), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            final SubLObject abortP_$120 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$119;
            abortP = abortP_$120;
            if (NIL != abortP) {
                return arghash;
            }
            thread.resetMultipleValues();
            final SubLObject arghash_$120 = arghash_assert_now(arghash, list($$genls, new_col, fort), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            final SubLObject abortP_$121 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$120;
            abortP = abortP_$121;
            if (NIL != abortP) {
                return arghash;
            }
        }
        SubLObject cdolist_list_var2 = specs;
        SubLObject spec = NIL;
        spec = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            final SubLObject arghash_$121 = arghash_assert_now(arghash, list($$genls, spec, new_col), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            final SubLObject abortP_$122 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$121;
            abortP = abortP_$122;
            if (NIL != abortP) {
                return arghash;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            spec = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = specs;
        spec = NIL;
        spec = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            final SubLObject arghash_$122 = arghash_unassert_now(arghash, list($$genls, spec, fort), $facet_tool_mt$.getDynamicValue(thread));
            final SubLObject abortP_$123 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$122;
            abortP = abortP_$123;
            if (NIL != abortP) {
                return arghash;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            spec = cdolist_list_var2.first();
        } 
        return arghash;
    }

    public static final SubLObject perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_displayP_alt(SubLObject arghash) {
        return makeBoolean((NIL != html_arghash.get_arghash_value($kw102$SPECS_FACETED_, arghash)) && (NIL != html_arghash.get_arghash_value($kw105$SPECS_UNFACETED_, arghash)));
    }

    public static SubLObject perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_displayP(final SubLObject arghash) {
        return makeBoolean((NIL != html_arghash.get_arghash_value($kw113$SPECS_FACETED_, arghash)) && (NIL != html_arghash.get_arghash_value($kw116$SPECS_UNFACETED_, arghash)));
    }

    public static final SubLObject perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_display_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_129 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str_alt220$__Make_selected_unfaceted_spec_s_);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_arghash.html_arghash_submit_input(arghash, $$$Go, $MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS_GO, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_129, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return arghash;
        }
    }

    public static SubLObject perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($str233$__Make_selected_unfaceted_spec_s_);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_arghash.html_arghash_submit_input(arghash, $$$Go, $MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS_GO, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return arghash;
    }

    public static final SubLObject perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_handlerP_alt(SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS_GO, arghash));
    }

    public static SubLObject perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS_GO, arghash));
    }

    public static final SubLObject perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_handler_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject specs_unfaceted = get_selected_specs_unfaceted(arghash);
                SubLObject specs_faceted = get_selected_specs_faceted(arghash);
                SubLObject abortP = NIL;
                if (NIL == specs_unfaceted) {
                    html_arghash.push_arghash_value($ERRORS, $list_alt222, arghash);
                    abortP = T;
                }
                if (NIL == specs_faceted) {
                    html_arghash.push_arghash_value($ERRORS, $list_alt223, arghash);
                    abortP = T;
                }
                if (NIL != abortP) {
                    return arghash;
                }
                {
                    SubLObject cdolist_list_var = specs_unfaceted;
                    SubLObject spec_unfaceted = NIL;
                    for (spec_unfaceted = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_unfaceted = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_130 = specs_faceted;
                            SubLObject spec_faceted = NIL;
                            for (spec_faceted = cdolist_list_var_130.first(); NIL != cdolist_list_var_130; cdolist_list_var_130 = cdolist_list_var_130.rest() , spec_faceted = cdolist_list_var_130.first()) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject arghash_131 = arghash_assert_now(arghash, list($$genls, spec_unfaceted, spec_faceted), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                    SubLObject abortP_132 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    arghash = arghash_131;
                                    abortP = abortP_132;
                                }
                            }
                        }
                    }
                }
            }
            return arghash;
        }
    }

    public static SubLObject perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_handler(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject specs_unfaceted = get_selected_specs_unfaceted(arghash);
        final SubLObject specs_faceted = get_selected_specs_faceted(arghash);
        SubLObject abortP = NIL;
        if (NIL == specs_unfaceted) {
            html_arghash.push_arghash_value($ERRORS, $list235, arghash);
            abortP = T;
        }
        if (NIL == specs_faceted) {
            html_arghash.push_arghash_value($ERRORS, $list236, arghash);
            abortP = T;
        }
        if (NIL != abortP) {
            return arghash;
        }
        SubLObject cdolist_list_var = specs_unfaceted;
        SubLObject spec_unfaceted = NIL;
        spec_unfaceted = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$128 = specs_faceted;
            SubLObject spec_faceted = NIL;
            spec_faceted = cdolist_list_var_$128.first();
            while (NIL != cdolist_list_var_$128) {
                thread.resetMultipleValues();
                final SubLObject arghash_$129 = arghash_assert_now(arghash, list($$genls, spec_unfaceted, spec_faceted), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                final SubLObject abortP_$130 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                arghash = arghash_$129;
                abortP = abortP_$130;
                cdolist_list_var_$128 = cdolist_list_var_$128.rest();
                spec_faceted = cdolist_list_var_$128.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            spec_unfaceted = cdolist_list_var.first();
        } 
        return arghash;
    }

    public static final SubLObject perspective_action_add_instances_to_specs_displayP_alt(SubLObject arghash) {
        return makeBoolean(((NIL != html_arghash.get_arghash_value($kw102$SPECS_FACETED_, arghash)) || (NIL != html_arghash.get_arghash_value($kw105$SPECS_UNFACETED_, arghash))) && (NIL != html_arghash.get_arghash_value($INSTANCES_, arghash)));
    }

    public static SubLObject perspective_action_add_instances_to_specs_displayP(final SubLObject arghash) {
        return makeBoolean(((NIL != html_arghash.get_arghash_value($kw113$SPECS_FACETED_, arghash)) || (NIL != html_arghash.get_arghash_value($kw116$SPECS_UNFACETED_, arghash))) && (NIL != html_arghash.get_arghash_value($INSTANCES_, arghash)));
    }

    public static final SubLObject perspective_action_add_instances_to_specs_display_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_133 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str_alt226$__Add_selected_instance_s__to_sel);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_arghash.html_arghash_submit_input(arghash, $$$Go, $ADD_INSTANCES_TO_SPECS_GO, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_133, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return arghash;
        }
    }

    public static SubLObject perspective_action_add_instances_to_specs_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($str239$__Add_selected_instance_s__to_sel);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_arghash.html_arghash_submit_input(arghash, $$$Go, $ADD_INSTANCES_TO_SPECS_GO, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return arghash;
    }

    public static final SubLObject perspective_action_add_instances_to_specs_handlerP_alt(SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($ADD_INSTANCES_TO_SPECS_GO, arghash));
    }

    public static SubLObject perspective_action_add_instances_to_specs_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($ADD_INSTANCES_TO_SPECS_GO, arghash));
    }

    public static final SubLObject perspective_action_add_instances_to_specs_handler_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
                SubLObject specs = get_selected_specs(arghash);
                SubLObject v_instances = get_selected_instances(arghash);
                SubLObject abortP = NIL;
                if (NIL == specs) {
                    html_arghash.push_arghash_value($ERRORS, $list_alt228, arghash);
                    abortP = T;
                }
                if (NIL == v_instances) {
                    html_arghash.push_arghash_value($ERRORS, $list_alt229, arghash);
                    abortP = T;
                }
                if (NIL != abortP) {
                    return arghash;
                }
                {
                    SubLObject cdolist_list_var = v_instances;
                    SubLObject instance = NIL;
                    for (instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance = cdolist_list_var.first()) {
                        {
                            SubLObject poss_assertion = kb_indexing.find_gaf_any_mt(list($$isa, instance, fort));
                            SubLObject strength = NIL;
                            SubLObject direction = NIL;
                            if (NIL != assertion_handles.assertion_p(poss_assertion)) {
                                strength = assertions_high.assertion_strength(poss_assertion);
                                direction = assertions_high.assertion_direction(poss_assertion);
                            }
                            {
                                SubLObject cdolist_list_var_134 = specs;
                                SubLObject spec = NIL;
                                for (spec = cdolist_list_var_134.first(); NIL != cdolist_list_var_134; cdolist_list_var_134 = cdolist_list_var_134.rest() , spec = cdolist_list_var_134.first()) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject arghash_135 = arghash_assert_now(arghash, list($$isa, instance, spec), $facet_tool_mt$.getDynamicValue(thread), strength, direction);
                                        SubLObject abortP_136 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        arghash = arghash_135;
                                        abortP = abortP_136;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return arghash;
        }
    }

    public static SubLObject perspective_action_add_instances_to_specs_handler(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
        final SubLObject specs = get_selected_specs(arghash);
        final SubLObject v_instances = get_selected_instances(arghash);
        SubLObject abortP = NIL;
        if (NIL == specs) {
            html_arghash.push_arghash_value($ERRORS, $list241, arghash);
            abortP = T;
        }
        if (NIL == v_instances) {
            html_arghash.push_arghash_value($ERRORS, $list242, arghash);
            abortP = T;
        }
        if (NIL != abortP) {
            return arghash;
        }
        SubLObject cdolist_list_var = v_instances;
        SubLObject instance = NIL;
        instance = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject poss_assertion = kb_indexing.find_gaf_any_mt(list($$isa, instance, fort));
            SubLObject strength = NIL;
            SubLObject direction = NIL;
            if (NIL != assertion_handles.assertion_p(poss_assertion)) {
                strength = assertions_high.assertion_strength(poss_assertion);
                direction = assertions_high.assertion_direction(poss_assertion);
            }
            SubLObject cdolist_list_var_$132 = specs;
            SubLObject spec = NIL;
            spec = cdolist_list_var_$132.first();
            while (NIL != cdolist_list_var_$132) {
                thread.resetMultipleValues();
                final SubLObject arghash_$133 = arghash_assert_now(arghash, list($$isa, instance, spec), $facet_tool_mt$.getDynamicValue(thread), strength, direction);
                final SubLObject abortP_$134 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                arghash = arghash_$133;
                abortP = abortP_$134;
                cdolist_list_var_$132 = cdolist_list_var_$132.rest();
                spec = cdolist_list_var_$132.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            instance = cdolist_list_var.first();
        } 
        return arghash;
    }

    public static final SubLObject perspective_action_unassert_displayP_alt(SubLObject arghash) {
        return NIL;
    }

    public static SubLObject perspective_action_unassert_displayP(final SubLObject arghash) {
        return NIL;
    }

    public static final SubLObject perspective_action_unassert_display_alt(SubLObject arghash) {
        return arghash;
    }

    public static SubLObject perspective_action_unassert_display(final SubLObject arghash) {
        return arghash;
    }

    public static final SubLObject perspective_action_unassert_handlerP_alt(SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($UNASSERT_GO, arghash));
    }

    public static SubLObject perspective_action_unassert_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value($UNASSERT_GO, arghash));
    }

    public static final SubLObject perspective_action_unassert_handler_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion_ids = html_arghash.get_arghash_value_list($UNASSERT_ID, arghash);
                SubLObject cdolist_list_var = assertion_ids;
                SubLObject assertion_id = NIL;
                for (assertion_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_id = cdolist_list_var.first()) {
                    {
                        SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
                        SubLObject assertion_gaf = assertions_high.gaf_formula(assertion);
                        SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
                        SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
                        SubLObject fort_order = fort_order(fort, UNPROVIDED);
                        SubLObject abortP = NIL;
                        thread.resetMultipleValues();
                        {
                            SubLObject arghash_137 = arghash_unassert_now(arghash, assertion_gaf, assertion_mt);
                            SubLObject abortP_138 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            arghash = arghash_137;
                            abortP = abortP_138;
                        }
                        if (NIL != abortP) {
                            return arghash;
                        }
                        if (NIL == isa.all_isa(fort, $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED)) {
                            {
                                SubLObject pcase_var = fort_order;
                                if (pcase_var.eql(ZERO_INTEGER)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject arghash_139 = arghash_assert_now(arghash, listS($$isa, fort, $list_alt232), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                        SubLObject abortP_140 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        arghash = arghash_139;
                                        abortP = abortP_140;
                                    }
                                } else {
                                    if (pcase_var.eql(ONE_INTEGER)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject arghash_141 = arghash_assert_now(arghash, listS($$isa, fort, $list_alt217), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                            SubLObject abortP_142 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            arghash = arghash_141;
                                            abortP = abortP_142;
                                        }
                                    } else {
                                        if (pcase_var.eql(TWO_INTEGER)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject arghash_143 = arghash_assert_now(arghash, listS($$isa, fort, $list_alt207), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                SubLObject abortP_144 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                arghash = arghash_143;
                                                abortP = abortP_144;
                                            }
                                        } else {
                                            if (pcase_var.eql(THREE_INTEGER)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject arghash_145 = arghash_assert_now(arghash, listS($$isa, fort, $list_alt233), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                    SubLObject abortP_146 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    arghash = arghash_145;
                                                    abortP = abortP_146;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL == genls.all_genls(fort, $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED)) {
                            {
                                SubLObject pcase_var = fort_order;
                                if (pcase_var.eql(ONE_INTEGER)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject arghash_147 = arghash_assert_now(arghash, listS($$genls, fort, $list_alt232), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                        SubLObject abortP_148 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        arghash = arghash_147;
                                        abortP = abortP_148;
                                    }
                                } else {
                                    if (pcase_var.eql(TWO_INTEGER)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject arghash_149 = arghash_assert_now(arghash, listS($$genls, fort, $list_alt217), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                            SubLObject abortP_150 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            arghash = arghash_149;
                                            abortP = abortP_150;
                                        }
                                    } else {
                                        if (pcase_var.eql(THREE_INTEGER)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject arghash_151 = arghash_assert_now(arghash, listS($$genls, fort, $list_alt207), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                SubLObject abortP_152 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                arghash = arghash_151;
                                                abortP = abortP_152;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            html_arghash.rem_arghash_value($UNASSERT_ID, arghash);
            return arghash;
        }
    }

    public static SubLObject perspective_action_unassert_handler(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject assertion_ids = cdolist_list_var = html_arghash.get_arghash_value_list($UNASSERT_ID, arghash);
        SubLObject assertion_id = NIL;
        assertion_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
            final SubLObject assertion_gaf = assertions_high.gaf_formula(assertion);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject fort = html_arghash.get_arghash_value($FORT, arghash);
            final SubLObject fort_order = fort_order(fort, UNPROVIDED);
            SubLObject abortP = NIL;
            thread.resetMultipleValues();
            final SubLObject arghash_$135 = arghash_unassert_now(arghash, assertion_gaf, assertion_mt);
            final SubLObject abortP_$136 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$135;
            abortP = abortP_$136;
            if (NIL != abortP) {
                return arghash;
            }
            if (NIL == isa.all_isa(fort, $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED)) {
                final SubLObject pcase_var = fort_order;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    thread.resetMultipleValues();
                    final SubLObject arghash_$136 = arghash_assert_now(arghash, listS($$isa, fort, $list245), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    final SubLObject abortP_$137 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    arghash = arghash_$136;
                    abortP = abortP_$137;
                } else
                    if (pcase_var.eql(ONE_INTEGER)) {
                        thread.resetMultipleValues();
                        final SubLObject arghash_$137 = arghash_assert_now(arghash, listS($$isa, fort, $list230), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        final SubLObject abortP_$138 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        arghash = arghash_$137;
                        abortP = abortP_$138;
                    } else
                        if (pcase_var.eql(TWO_INTEGER)) {
                            thread.resetMultipleValues();
                            final SubLObject arghash_$138 = arghash_assert_now(arghash, listS($$isa, fort, $list220), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            final SubLObject abortP_$139 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            arghash = arghash_$138;
                            abortP = abortP_$139;
                        } else
                            if (pcase_var.eql(THREE_INTEGER)) {
                                thread.resetMultipleValues();
                                final SubLObject arghash_$139 = arghash_assert_now(arghash, listS($$isa, fort, $list246), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                final SubLObject abortP_$140 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                arghash = arghash_$139;
                                abortP = abortP_$140;
                            }



            }
            if (NIL == genls.all_genls(fort, $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED)) {
                final SubLObject pcase_var = fort_order;
                if (pcase_var.eql(ONE_INTEGER)) {
                    thread.resetMultipleValues();
                    final SubLObject arghash_$140 = arghash_assert_now(arghash, listS($$genls, fort, $list245), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    final SubLObject abortP_$141 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    arghash = arghash_$140;
                    abortP = abortP_$141;
                } else
                    if (pcase_var.eql(TWO_INTEGER)) {
                        thread.resetMultipleValues();
                        final SubLObject arghash_$141 = arghash_assert_now(arghash, listS($$genls, fort, $list230), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        final SubLObject abortP_$142 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        arghash = arghash_$141;
                        abortP = abortP_$142;
                    } else
                        if (pcase_var.eql(THREE_INTEGER)) {
                            thread.resetMultipleValues();
                            final SubLObject arghash_$142 = arghash_assert_now(arghash, listS($$genls, fort, $list220), $facet_tool_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            final SubLObject abortP_$143 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            arghash = arghash_$142;
                            abortP = abortP_$143;
                        }


            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion_id = cdolist_list_var.first();
        } 
        html_arghash.rem_arghash_value($UNASSERT_ID, arghash);
        return arghash;
    }

    /**
     * Return the order of a fort.  Individuals are order 0, 1st order collections are order 1, etc.
     *
     * @unknown jantos
     */
    @LispMethod(comment = "Return the order of a fort.  Individuals are order 0, 1st order collections are order 1, etc.\r\n\r\n@unknown jantos")
    public static final SubLObject fort_order_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        if (NIL != isa.isaP(fort, $$CollectionTypeType, UNPROVIDED, UNPROVIDED)) {
                            result = THREE_INTEGER;
                        } else {
                            if (NIL != isa.isaP(fort, $$CollectionType, UNPROVIDED, UNPROVIDED)) {
                                result = TWO_INTEGER;
                            } else {
                                if (NIL != isa.isaP(fort, $$Collection, UNPROVIDED, UNPROVIDED)) {
                                    result = ONE_INTEGER;
                                } else {
                                    if (NIL != isa.isaP(fort, $$Individual, UNPROVIDED, UNPROVIDED)) {
                                        result = ZERO_INTEGER;
                                    } else {
                                        result = NIL;
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Return the order of a fort.  Individuals are order 0, 1st order collections are order 1, etc.\r\n\r\n@unknown jantos")
    public static SubLObject fort_order(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL != isa.isaP(fort, $$CollectionTypeType, UNPROVIDED, UNPROVIDED)) {
                result = THREE_INTEGER;
            } else
                if (NIL != isa.isaP(fort, $$CollectionType, UNPROVIDED, UNPROVIDED)) {
                    result = TWO_INTEGER;
                } else
                    if (NIL != isa.isaP(fort, $$Collection, UNPROVIDED, UNPROVIDED)) {
                        result = ONE_INTEGER;
                    } else
                        if (NIL != isa.isaP(fort, $$Individual, UNPROVIDED, UNPROVIDED)) {
                            result = ZERO_INTEGER;
                        } else {
                            result = NIL;
                        }



        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Return the order of a fort.  Individuals are order 0, 1st order collections are order 1, etc.
     *
     * @unknown jantos
     */


    public static final SubLObject perspective_action_change_mt_displayP_alt(SubLObject arghash) {
        return T;
    }

    public static SubLObject perspective_action_change_mt_displayP(final SubLObject arghash) {
        return T;
    }

    public static final SubLObject perspective_action_change_mt_display_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_arghash.rem_arghash_value($MT, arghash);
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
            if (NIL != html_macros.$html_color_light_grey$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_color_light_grey$.getDynamicValue(thread));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt69$100_);
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
                        SubLObject _prev_bind_0_153 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_154 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str_alt240$__Change_current_Mt_from_);
                                    cb_facet_form($facet_tool_mt$.getDynamicValue(thread));
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    html_glyph($NBSP, UNPROVIDED);
                                    html_arghash.html_arghash_submit_input(arghash, $$$Go, $CHANGE_MT_GO, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_154, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_153, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (NIL != html_macros.$html_color_lighter_grey$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_color_lighter_grey$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_155 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_156 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent(FIVE_INTEGER);
                                    html_princ($str_alt242$_New_Mt_name__);
                                    html_arghash.html_arghash_fort_input(arghash, $MT, NIL, $int$30, $$$Complete, $$Microtheory);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_156, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_155, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return arghash;
        }
    }

    public static SubLObject perspective_action_change_mt_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.rem_arghash_value($MT, arghash);
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
        if (NIL != html_macros.$html_color_light_grey$.getGlobalValue()) {
            html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_color_light_grey$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str80$100_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$152 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_princ($str253$__Change_current_Mt_from_);
                    cb_facet_form($facet_tool_mt$.getDynamicValue(thread));
                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    html_glyph($NBSP, UNPROVIDED);
                    html_arghash.html_arghash_submit_input(arghash, $$$Go, $CHANGE_MT_GO, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$152, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$151, thread);
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
            final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(FIVE_INTEGER);
                    html_princ($str255$_New_Mt_name__);
                    html_arghash.html_arghash_fort_input(arghash, $MT, NIL, $int$30, $$$Complete, $$Microtheory);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$154, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$153, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return arghash;
    }

    public static final SubLObject perspective_action_change_mt_handlerP_alt(SubLObject arghash) {
        return T;
    }

    public static SubLObject perspective_action_change_mt_handlerP(final SubLObject arghash) {
        return T;
    }

    public static final SubLObject perspective_action_change_mt_handler_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != fort_types_interface.microtheory_p(html_arghash.get_arghash_value($MT, arghash))) && ($facet_tool_mt$.getDynamicValue(thread) != html_arghash.get_arghash_value($MT, arghash))) {
                $facet_tool_mt$.setDynamicValue(html_arghash.get_arghash_value($MT, arghash), thread);
            }
            if (NIL == fort_types_interface.microtheory_p($facet_tool_mt$.getDynamicValue(thread))) {
                $facet_tool_mt$.setDynamicValue($default_facet_tool_mt$.getGlobalValue(), thread);
            }
            html_arghash.rem_arghash_value($MT, arghash);
            return arghash;
        }
    }

    public static SubLObject perspective_action_change_mt_handler(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != fort_types_interface.microtheory_p(html_arghash.get_arghash_value($MT, arghash))) && (!$facet_tool_mt$.getDynamicValue(thread).eql(html_arghash.get_arghash_value($MT, arghash)))) {
            $facet_tool_mt$.setDynamicValue(html_arghash.get_arghash_value($MT, arghash), thread);
        }
        if (NIL == fort_types_interface.microtheory_p($facet_tool_mt$.getDynamicValue(thread))) {
            $facet_tool_mt$.setDynamicValue($default_facet_tool_mt$.getGlobalValue(), thread);
        }
        html_arghash.rem_arghash_value($MT, arghash);
        return arghash;
    }

    public static final SubLObject get_selected_specs_faceted_alt(SubLObject arghash) {
        {
            SubLObject specs = NIL;
            SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($FACET_ID, arghash);
            SubLObject facet_id = NIL;
            for (facet_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , facet_id = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_157 = html_arghash.get_arghash_value_list(make_keyword(format(NIL, $str_alt101$_A_SPEC_SELECTED, facet_id)), arghash);
                    SubLObject spec = NIL;
                    for (spec = cdolist_list_var_157.first(); NIL != cdolist_list_var_157; cdolist_list_var_157 = cdolist_list_var_157.rest() , spec = cdolist_list_var_157.first()) {
                        specs = cons(spec, specs);
                    }
                }
            }
            return specs;
        }
    }

    public static SubLObject get_selected_specs_faceted(final SubLObject arghash) {
        SubLObject specs = NIL;
        SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($FACET_ID, arghash);
        SubLObject facet_id = NIL;
        facet_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$155 = html_arghash.get_arghash_value_list(make_keyword(format(NIL, $str112$_A_SPEC_SELECTED, facet_id)), arghash);
            SubLObject spec = NIL;
            spec = cdolist_list_var_$155.first();
            while (NIL != cdolist_list_var_$155) {
                specs = cons(spec, specs);
                cdolist_list_var_$155 = cdolist_list_var_$155.rest();
                spec = cdolist_list_var_$155.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            facet_id = cdolist_list_var.first();
        } 
        return specs;
    }

    public static final SubLObject get_selected_specs_unfaceted_alt(SubLObject arghash) {
        {
            SubLObject specs = NIL;
            SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($SPEC_UNFACETED, arghash);
            SubLObject spec = NIL;
            for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                specs = cons(spec, specs);
            }
            return specs;
        }
    }

    public static SubLObject get_selected_specs_unfaceted(final SubLObject arghash) {
        SubLObject specs = NIL;
        SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($SPEC_UNFACETED, arghash);
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            specs = cons(spec, specs);
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        return specs;
    }

    public static final SubLObject get_selected_specs_alt(SubLObject arghash) {
        return append(get_selected_specs_faceted(arghash), get_selected_specs_unfaceted(arghash));
    }

    public static SubLObject get_selected_specs(final SubLObject arghash) {
        return append(get_selected_specs_faceted(arghash), get_selected_specs_unfaceted(arghash));
    }

    public static final SubLObject get_selected_instances_alt(SubLObject arghash) {
        return html_arghash.get_arghash_value_list($INSTANCE, arghash);
    }

    public static SubLObject get_selected_instances(final SubLObject arghash) {
        return html_arghash.get_arghash_value_list($INSTANCE, arghash);
    }

    public static final SubLObject error_keyword_to_string_alt(SubLObject error_keyword) {
        {
            SubLObject string_tokens = Mapping.mapcar(symbol_function(STRING_DOWNCASE), string_utilities.string_tokenize(string_utilities.string_from_keyword(error_keyword), $list_alt247, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            string_tokens = cons(string_utilities.nupcase_leading(string_tokens.first()), string_tokens.rest());
            return string_utilities.bunge(string_tokens, UNPROVIDED);
        }
    }

    public static SubLObject error_keyword_to_string(final SubLObject error_keyword) {
        SubLObject string_tokens = Mapping.mapcar(symbol_function(STRING_DOWNCASE), string_utilities.string_tokenize(string_utilities.string_from_keyword(error_keyword), $list260, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        string_tokens = cons(string_utilities.nupcase_leading(string_tokens.first()), string_tokens.rest());
        return string_utilities.bunge(string_tokens, UNPROVIDED);
    }

    public static final SubLObject arghash_status_string_alt(SubLObject error_list) {
        {
            SubLObject error_keyword_string = error_keyword_to_string(error_list.first());
            SubLObject error_format_control = cadr(error_list);
            SubLObject error_format_arguments = cddr(error_list);
            SubLObject error_string = NIL;
            if (error_format_control.isString()) {
                error_string = format(NIL, $str_alt248$_A___A, error_keyword_string, format(NIL, error_format_control, new SubLObject[]{ error_format_arguments.first(), second(error_format_arguments), third(error_format_arguments), fourth(error_format_arguments), fifth(error_format_arguments) }));
            } else {
                error_string = error_keyword_string;
            }
            return error_string;
        }
    }

    public static SubLObject arghash_status_string(final SubLObject error_list) {
        final SubLObject error_keyword_string = error_keyword_to_string(error_list.first());
        final SubLObject error_format_control = cadr(error_list);
        final SubLObject error_format_arguments = cddr(error_list);
        SubLObject error_string = NIL;
        if (error_format_control.isString()) {
            error_string = format(NIL, $str261$_A___A, error_keyword_string, format(NIL, error_format_control, new SubLObject[]{ error_format_arguments.first(), second(error_format_arguments), third(error_format_arguments), fourth(error_format_arguments), fifth(error_format_arguments) }));
        } else {
            error_string = error_keyword_string;
        }
        return error_string;
    }

    public static final SubLObject html_arghash_possibly_show_errors_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != html_arghash.get_arghash_value_list($ERRORS, arghash)) {
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_sat_red$.getDynamicValue(thread)) {
                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(html_macros.$html_color_sat_red$.getDynamicValue(thread)));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str_alt249$Errors_found_);
                        html_newline(UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($ERRORS, arghash);
                            SubLObject error_list = NIL;
                            for (error_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , error_list = cdolist_list_var.first()) {
                                {
                                    SubLObject error_string = arghash_status_string(error_list);
                                    if (NIL != error_string) {
                                        html_indent(FIVE_INTEGER);
                                        html_princ(error_string);
                                        html_newline(UNPROVIDED);
                                    }
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject html_arghash_possibly_show_errors(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != html_arghash.get_arghash_value_list($ERRORS, arghash)) {
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($str262$Errors_found_);
                html_newline(UNPROVIDED);
                SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($ERRORS, arghash);
                SubLObject error_list = NIL;
                error_list = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject error_string = arghash_status_string(error_list);
                    if (NIL != error_string) {
                        html_indent(FIVE_INTEGER);
                        html_princ(error_string);
                        html_newline(UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    error_list = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject html_arghash_possibly_show_successes_alt(SubLObject arghash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != html_arghash.get_arghash_value_list($SUCCESSES, arghash)) {
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_sat_red$.getDynamicValue(thread)) {
                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(html_macros.$html_color_sat_red$.getDynamicValue(thread)));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str_alt251$Actions_taken_);
                        html_newline(UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($SUCCESSES, arghash);
                            SubLObject success_list = NIL;
                            for (success_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , success_list = cdolist_list_var.first()) {
                                {
                                    SubLObject success_string = arghash_status_string(success_list);
                                    if (NIL != success_string) {
                                        html_indent(FIVE_INTEGER);
                                        html_princ(success_string);
                                        html_newline(UNPROVIDED);
                                    }
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject html_arghash_possibly_show_successes(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != html_arghash.get_arghash_value_list($SUCCESSES, arghash)) {
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($str264$Actions_taken_);
                html_newline(UNPROVIDED);
                SubLObject cdolist_list_var = html_arghash.get_arghash_value_list($SUCCESSES, arghash);
                SubLObject success_list = NIL;
                success_list = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject success_string = arghash_status_string(success_list);
                    if (NIL != success_string) {
                        html_indent(FIVE_INTEGER);
                        html_princ(success_string);
                        html_newline(UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    success_list = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject arghash_assert_now_alt(SubLObject arghash, SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject errorP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject result = ke.ke_assert_now(formula, mt, strength, direction);
                    SubLObject error_list = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == result) {
                        html_arghash.push_arghash_value($ERRORS, error_list, arghash);
                        errorP = T;
                    } else {
                        html_arghash.push_arghash_value($SUCCESSES, list($ASSERTED, $str_alt253$_A_in__A, formula, mt), arghash);
                    }
                }
                return values(arghash, errorP);
            }
        }
    }

    public static SubLObject arghash_assert_now(final SubLObject arghash, final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject errorP = NIL;
        thread.resetMultipleValues();
        final SubLObject result = ke.ke_assert_now(formula, mt, strength, direction);
        final SubLObject error_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == result) {
            html_arghash.push_arghash_value($ERRORS, error_list, arghash);
            errorP = T;
        } else {
            html_arghash.push_arghash_value($SUCCESSES, list($ASSERTED, $str266$_A_in__A, formula, mt), arghash);
        }
        return values(arghash, errorP);
    }

    public static final SubLObject arghash_unassert_now_alt(SubLObject arghash, SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject errorP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject result = ke.ke_unassert_now(formula, mt);
                    SubLObject error_list = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == result) {
                        html_arghash.push_arghash_value($ERRORS, error_list, arghash);
                        errorP = T;
                    } else {
                        html_arghash.push_arghash_value($SUCCESSES, list($UNASSERTED, $str_alt255$_A_from__A, formula, mt), arghash);
                    }
                }
                return values(arghash, errorP);
            }
        }
    }

    public static SubLObject arghash_unassert_now(final SubLObject arghash, final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject errorP = NIL;
        thread.resetMultipleValues();
        final SubLObject result = ke.ke_unassert_now(formula, mt);
        final SubLObject error_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == result) {
            html_arghash.push_arghash_value($ERRORS, error_list, arghash);
            errorP = T;
        } else {
            html_arghash.push_arghash_value($SUCCESSES, list($UNASSERTED, $str268$_A_from__A, formula, mt), arghash);
        }
        return values(arghash, errorP);
    }

    public static SubLObject declare_cb_facets_file() {
        declareFunction("cb_facet", "CB-FACET", 1, 0, false);
        declareFunction("cb_facet_form", "CB-FACET-FORM", 1, 0, false);
        declareFunction("perspective_print_function_trampoline", "PERSPECTIVE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("perspective_p", "PERSPECTIVE-P", 1, 0, false);
        new cb_facets.$perspective_p$UnaryFunction();
        declareFunction("perspective_name", "PERSPECTIVE-NAME", 1, 0, false);
        declareFunction("perspective_keyword", "PERSPECTIVE-KEYWORD", 1, 0, false);
        declareFunction("perspective_displayP_fn", "PERSPECTIVE-DISPLAY?-FN", 1, 0, false);
        declareFunction("perspective_display_fn", "PERSPECTIVE-DISPLAY-FN", 1, 0, false);
        declareFunction("perspective_display_string", "PERSPECTIVE-DISPLAY-STRING", 1, 0, false);
        declareFunction("_csetf_perspective_name", "_CSETF-PERSPECTIVE-NAME", 2, 0, false);
        declareFunction("_csetf_perspective_keyword", "_CSETF-PERSPECTIVE-KEYWORD", 2, 0, false);
        declareFunction("_csetf_perspective_displayP_fn", "_CSETF-PERSPECTIVE-DISPLAY?-FN", 2, 0, false);
        declareFunction("_csetf_perspective_display_fn", "_CSETF-PERSPECTIVE-DISPLAY-FN", 2, 0, false);
        declareFunction("_csetf_perspective_display_string", "_CSETF-PERSPECTIVE-DISPLAY-STRING", 2, 0, false);
        declareFunction("make_perspective", "MAKE-PERSPECTIVE", 0, 1, false);
        declareFunction("visit_defstruct_perspective", "VISIT-DEFSTRUCT-PERSPECTIVE", 2, 0, false);
        declareFunction("visit_defstruct_object_perspective_method", "VISIT-DEFSTRUCT-OBJECT-PERSPECTIVE-METHOD", 2, 0, false);
        declareFunction("print_perspective", "PRINT-PERSPECTIVE", 3, 0, false);
        declareMacro("defperspective", "DEFPERSPECTIVE");
        declareFunction("perspective_from_keyword", "PERSPECTIVE-FROM-KEYWORD", 1, 0, false);
        declareFunction("relevant_perspectives", "RELEVANT-PERSPECTIVES", 1, 0, false);
        declareFunction("perspective_from_keyword_relevantP", "PERSPECTIVE-FROM-KEYWORD-RELEVANT?", 2, 0, false);
        declareFunction("show_as_individualP", "SHOW-AS-INDIVIDUAL?", 1, 0, false);
        declareFunction("html_show_as_individual", "HTML-SHOW-AS-INDIVIDUAL", 1, 0, false);
        declareFunction("html_print_facet_block", "HTML-PRINT-FACET-BLOCK", 2, 1, false);
        declareFunction("show_as_collectionP", "SHOW-AS-COLLECTION?", 1, 0, false);
        declareFunction("html_show_as_collection", "HTML-SHOW-AS-COLLECTION", 1, 0, false);
        declareFunction("perspective_action_print_function_trampoline", "PERSPECTIVE-ACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("perspective_action_p", "PERSPECTIVE-ACTION-P", 1, 0, false);
        new cb_facets.$perspective_action_p$UnaryFunction();
        declareFunction("perspective_action_name", "PERSPECTIVE-ACTION-NAME", 1, 0, false);
        declareFunction("perspective_action_keyword", "PERSPECTIVE-ACTION-KEYWORD", 1, 0, false);
        declareFunction("perspective_action_order_num", "PERSPECTIVE-ACTION-ORDER-NUM", 1, 0, false);
        declareFunction("perspective_action_perspective", "PERSPECTIVE-ACTION-PERSPECTIVE", 1, 0, false);
        declareFunction("perspective_action_displayP_fn", "PERSPECTIVE-ACTION-DISPLAY?-FN", 1, 0, false);
        declareFunction("perspective_action_display_fn", "PERSPECTIVE-ACTION-DISPLAY-FN", 1, 0, false);
        declareFunction("perspective_action_handlerP_fn", "PERSPECTIVE-ACTION-HANDLER?-FN", 1, 0, false);
        declareFunction("perspective_action_handler_fn", "PERSPECTIVE-ACTION-HANDLER-FN", 1, 0, false);
        declareFunction("_csetf_perspective_action_name", "_CSETF-PERSPECTIVE-ACTION-NAME", 2, 0, false);
        declareFunction("_csetf_perspective_action_keyword", "_CSETF-PERSPECTIVE-ACTION-KEYWORD", 2, 0, false);
        declareFunction("_csetf_perspective_action_order_num", "_CSETF-PERSPECTIVE-ACTION-ORDER-NUM", 2, 0, false);
        declareFunction("_csetf_perspective_action_perspective", "_CSETF-PERSPECTIVE-ACTION-PERSPECTIVE", 2, 0, false);
        declareFunction("_csetf_perspective_action_displayP_fn", "_CSETF-PERSPECTIVE-ACTION-DISPLAY?-FN", 2, 0, false);
        declareFunction("_csetf_perspective_action_display_fn", "_CSETF-PERSPECTIVE-ACTION-DISPLAY-FN", 2, 0, false);
        declareFunction("_csetf_perspective_action_handlerP_fn", "_CSETF-PERSPECTIVE-ACTION-HANDLER?-FN", 2, 0, false);
        declareFunction("_csetf_perspective_action_handler_fn", "_CSETF-PERSPECTIVE-ACTION-HANDLER-FN", 2, 0, false);
        declareFunction("make_perspective_action", "MAKE-PERSPECTIVE-ACTION", 0, 1, false);
        declareFunction("visit_defstruct_perspective_action", "VISIT-DEFSTRUCT-PERSPECTIVE-ACTION", 2, 0, false);
        declareFunction("visit_defstruct_object_perspective_action_method", "VISIT-DEFSTRUCT-OBJECT-PERSPECTIVE-ACTION-METHOD", 2, 0, false);
        declareFunction("print_perspective_action", "PRINT-PERSPECTIVE-ACTION", 3, 0, false);
        declareMacro("defperspective_action", "DEFPERSPECTIVE-ACTION");
        declareFunction("perspective_actions", "PERSPECTIVE-ACTIONS", 0, 0, false);
        declareFunction("sort_perspective_actions", "SORT-PERSPECTIVE-ACTIONS", 1, 0, false);
        declareFunction("sorted_perspective_actions_for_perspective", "SORTED-PERSPECTIVE-ACTIONS-FOR-PERSPECTIVE", 1, 0, false);
        declareFunction("display_perspective_actions_for_perspective", "DISPLAY-PERSPECTIVE-ACTIONS-FOR-PERSPECTIVE", 2, 0, false);
        declareFunction("perspective_actions_handler", "PERSPECTIVE-ACTIONS-HANDLER", 1, 0, false);
        declareFunction("perspective_action_change_perspective_displayP", "PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-DISPLAY?", 1, 0, false);
        declareFunction("perspective_action_change_perspective_display", "PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-DISPLAY", 1, 0, false);
        declareFunction("perspective_action_change_perspective_handlerP", "PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-HANDLER?", 1, 0, false);
        declareFunction("perspective_action_change_perspective_handler", "PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-HANDLER", 1, 0, false);
        declareFunction("perspective_action_show_definition_displayP", "PERSPECTIVE-ACTION-SHOW-DEFINITION-DISPLAY?", 1, 0, false);
        declareFunction("perspective_action_show_definition_display", "PERSPECTIVE-ACTION-SHOW-DEFINITION-DISPLAY", 1, 0, false);
        declareFunction("perspective_action_show_definition_handlerP", "PERSPECTIVE-ACTION-SHOW-DEFINITION-HANDLER?", 1, 0, false);
        declareFunction("perspective_action_show_definition_handler", "PERSPECTIVE-ACTION-SHOW-DEFINITION-HANDLER", 1, 0, false);
        declareFunction("perspective_action_add_fort_to_chosen_cols_displayP", "PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-DISPLAY?", 1, 0, false);
        declareFunction("perspective_action_add_fort_to_chosen_cols_display", "PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-DISPLAY", 1, 0, false);
        declareFunction("perspective_action_add_fort_to_chosen_cols_handlerP", "PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-HANDLER?", 1, 0, false);
        declareFunction("perspective_action_add_fort_to_chosen_cols_handler", "PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-HANDLER", 1, 0, false);
        declareFunction("perspective_action_add_specs_to_facet_displayP", "PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-DISPLAY?", 1, 0, false);
        declareFunction("perspective_action_add_specs_to_facet_display", "PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-DISPLAY", 1, 0, false);
        declareFunction("perspective_action_add_specs_to_facet_handlerP", "PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-HANDLER?", 1, 0, false);
        declareFunction("perspective_action_add_specs_to_facet_handler", "PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-HANDLER", 1, 0, false);
        declareFunction("perspective_action_add_specs_to_new_facet_displayP", "PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-DISPLAY?", 1, 0, false);
        declareFunction("perspective_action_add_specs_to_new_facet_display", "PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-DISPLAY", 1, 0, false);
        declareFunction("perspective_action_add_specs_to_new_facet_handlerP", "PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-HANDLER?", 1, 0, false);
        declareFunction("perspective_action_add_specs_to_new_facet_handler", "PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-HANDLER", 1, 0, false);
        declareFunction("perspective_action_make_specs_instances_of_col_or_new_spec_displayP", "PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-DISPLAY?", 1, 0, false);
        declareFunction("perspective_action_make_specs_instances_of_col_or_new_spec_display", "PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-DISPLAY", 1, 0, false);
        declareFunction("perspective_action_make_specs_instances_of_col_or_new_spec_handlerP", "PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-HANDLER?", 1, 0, false);
        declareFunction("perspective_action_make_specs_instances_of_col_or_new_spec_handler", "PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-HANDLER", 1, 0, false);
        declareFunction("perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_displayP", "PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-DISPLAY?", 1, 0, false);
        declareFunction("perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_display", "PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-DISPLAY", 1, 0, false);
        declareFunction("perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_handlerP", "PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-HANDLER?", 1, 0, false);
        declareFunction("perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_handler", "PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-HANDLER", 1, 0, false);
        declareFunction("perspective_action_add_instances_to_specs_displayP", "PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-DISPLAY?", 1, 0, false);
        declareFunction("perspective_action_add_instances_to_specs_display", "PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-DISPLAY", 1, 0, false);
        declareFunction("perspective_action_add_instances_to_specs_handlerP", "PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-HANDLER?", 1, 0, false);
        declareFunction("perspective_action_add_instances_to_specs_handler", "PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-HANDLER", 1, 0, false);
        declareFunction("perspective_action_unassert_displayP", "PERSPECTIVE-ACTION-UNASSERT-DISPLAY?", 1, 0, false);
        declareFunction("perspective_action_unassert_display", "PERSPECTIVE-ACTION-UNASSERT-DISPLAY", 1, 0, false);
        declareFunction("perspective_action_unassert_handlerP", "PERSPECTIVE-ACTION-UNASSERT-HANDLER?", 1, 0, false);
        declareFunction("perspective_action_unassert_handler", "PERSPECTIVE-ACTION-UNASSERT-HANDLER", 1, 0, false);
        declareFunction("fort_order", "FORT-ORDER", 1, 1, false);
        declareFunction("perspective_action_change_mt_displayP", "PERSPECTIVE-ACTION-CHANGE-MT-DISPLAY?", 1, 0, false);
        declareFunction("perspective_action_change_mt_display", "PERSPECTIVE-ACTION-CHANGE-MT-DISPLAY", 1, 0, false);
        declareFunction("perspective_action_change_mt_handlerP", "PERSPECTIVE-ACTION-CHANGE-MT-HANDLER?", 1, 0, false);
        declareFunction("perspective_action_change_mt_handler", "PERSPECTIVE-ACTION-CHANGE-MT-HANDLER", 1, 0, false);
        declareFunction("get_selected_specs_faceted", "GET-SELECTED-SPECS-FACETED", 1, 0, false);
        declareFunction("get_selected_specs_unfaceted", "GET-SELECTED-SPECS-UNFACETED", 1, 0, false);
        declareFunction("get_selected_specs", "GET-SELECTED-SPECS", 1, 0, false);
        declareFunction("get_selected_instances", "GET-SELECTED-INSTANCES", 1, 0, false);
        declareFunction("error_keyword_to_string", "ERROR-KEYWORD-TO-STRING", 1, 0, false);
        declareFunction("arghash_status_string", "ARGHASH-STATUS-STRING", 1, 0, false);
        declareFunction("html_arghash_possibly_show_errors", "HTML-ARGHASH-POSSIBLY-SHOW-ERRORS", 1, 0, false);
        declareFunction("html_arghash_possibly_show_successes", "HTML-ARGHASH-POSSIBLY-SHOW-SUCCESSES", 1, 0, false);
        declareFunction("arghash_assert_now", "ARGHASH-ASSERT-NOW", 3, 2, false);
        declareFunction("arghash_unassert_now", "ARGHASH-UNASSERT-NOW", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_facets_file_alt() {
        deflexical("*DEFAULT-FACET-TOOL-MT*", $$CyclistsMt);
        defparameter("*FACET-TOOL-MT*", $default_facet_tool_mt$.getGlobalValue());
        deflexical("*CB-FACET-TOOL-NAME*", $$$Facets_Browser);
        deflexical("*CB-FACET-TOOL-HANDLER*", $str_alt3$cb_facet);
        defconstant("*DTP-PERSPECTIVE*", PERSPECTIVE);
        defparameter("*PERSPECTIVES*", NIL);
        defparameter("*PERSPECTIVES-BY-KEYWORD*", make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        defparameter("*PERSPECTIVE-TYPE-SORT*", $list_alt66);
        defconstant("*DTP-PERSPECTIVE-ACTION*", PERSPECTIVE_ACTION);
        deflexical("*PERSPECTIVE-ACTIONS*", NIL);
        return NIL;
    }

    public static SubLObject init_cb_facets_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*DEFAULT-FACET-TOOL-MT*", $$UniversalVocabularyMt);
            defparameter("*FACET-TOOL-MT*", $default_facet_tool_mt$.getGlobalValue());
            deflexical("*CB-FACET-TOOL-NAME*", $$$Facets_Browser);
            deflexical("*CB-FACET-TOOL-HANDLER*", $str3$cb_facet);
            defconstant("*DTP-PERSPECTIVE*", PERSPECTIVE);
            defparameter("*PERSPECTIVES*", NIL);
            defparameter("*PERSPECTIVES-BY-KEYWORD*", make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
            defparameter("*PERSPECTIVE-TYPE-SORT*", $list77);
            defconstant("*DTP-PERSPECTIVE-ACTION*", PERSPECTIVE_ACTION);
            deflexical("*PERSPECTIVE-ACTIONS*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*DEFAULT-FACET-TOOL-MT*", $$CyclistsMt);
            defparameter("*PERSPECTIVE-TYPE-SORT*", $list_alt66);
        }
        return NIL;
    }

    public static SubLObject init_cb_facets_file_Previous() {
        deflexical("*DEFAULT-FACET-TOOL-MT*", $$UniversalVocabularyMt);
        defparameter("*FACET-TOOL-MT*", $default_facet_tool_mt$.getGlobalValue());
        deflexical("*CB-FACET-TOOL-NAME*", $$$Facets_Browser);
        deflexical("*CB-FACET-TOOL-HANDLER*", $str3$cb_facet);
        defconstant("*DTP-PERSPECTIVE*", PERSPECTIVE);
        defparameter("*PERSPECTIVES*", NIL);
        defparameter("*PERSPECTIVES-BY-KEYWORD*", make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        defparameter("*PERSPECTIVE-TYPE-SORT*", $list77);
        defconstant("*DTP-PERSPECTIVE-ACTION*", PERSPECTIVE_ACTION);
        deflexical("*PERSPECTIVE-ACTIONS*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_facets_file_alt() {
        register_html_state_variable($facet_tool_mt$);
        sethash($FACET_BROWSER, $cb_icon_definitions$.getGlobalValue(), list($str_alt5$facet_browser_gif, $str_alt6$_Facets_));
        sethash($FACET_BROWSER_DISABLED, $cb_icon_definitions$.getGlobalValue(), list($str_alt8$facet_browser_disabled_gif, $str_alt6$_Facets_));
        {
            SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
            SubLObject v_new = cb_adornments.make_adornment($list_alt9);
            cb_adornments._csetf_adornment_name(v_new, VFACETS);
            cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(VFACETS, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        html_macros.note_html_handler_function(CB_FACET);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_perspective$.getGlobalValue(), symbol_function(PERSPECTIVE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PERSPECTIVE_NAME, _CSETF_PERSPECTIVE_NAME);
        def_csetf(PERSPECTIVE_KEYWORD, _CSETF_PERSPECTIVE_KEYWORD);
        def_csetf($sym36$PERSPECTIVE_DISPLAY__FN, $sym37$_CSETF_PERSPECTIVE_DISPLAY__FN);
        def_csetf(PERSPECTIVE_DISPLAY_FN, _CSETF_PERSPECTIVE_DISPLAY_FN);
        def_csetf(PERSPECTIVE_DISPLAY_STRING, _CSETF_PERSPECTIVE_DISPLAY_STRING);
        identity(PERSPECTIVE);
        {
            SubLObject new_perspective = make_perspective($list_alt67);
            _csetf_perspective_name(new_perspective, AS_INDIVIDUAL);
            sethash(perspective_keyword(new_perspective), $perspectives_by_keyword$.getDynamicValue(), new_perspective);
            $perspectives$.setDynamicValue(cons(new_perspective, delete(AS_INDIVIDUAL, $perspectives$.getDynamicValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_perspective = make_perspective($list_alt83);
            _csetf_perspective_name(new_perspective, AS_COLLECTION);
            sethash(perspective_keyword(new_perspective), $perspectives_by_keyword$.getDynamicValue(), new_perspective);
            $perspectives$.setDynamicValue(cons(new_perspective, delete(AS_COLLECTION, $perspectives$.getDynamicValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        register_method($print_object_method_table$.getGlobalValue(), $dtp_perspective_action$.getGlobalValue(), symbol_function(PERSPECTIVE_ACTION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PERSPECTIVE_ACTION_NAME, _CSETF_PERSPECTIVE_ACTION_NAME);
        def_csetf(PERSPECTIVE_ACTION_KEYWORD, _CSETF_PERSPECTIVE_ACTION_KEYWORD);
        def_csetf(PERSPECTIVE_ACTION_ORDER_NUM, _CSETF_PERSPECTIVE_ACTION_ORDER_NUM);
        def_csetf(PERSPECTIVE_ACTION_PERSPECTIVE, _CSETF_PERSPECTIVE_ACTION_PERSPECTIVE);
        def_csetf($sym131$PERSPECTIVE_ACTION_DISPLAY__FN, $sym132$_CSETF_PERSPECTIVE_ACTION_DISPLAY__FN);
        def_csetf(PERSPECTIVE_ACTION_DISPLAY_FN, _CSETF_PERSPECTIVE_ACTION_DISPLAY_FN);
        def_csetf($sym135$PERSPECTIVE_ACTION_HANDLER__FN, $sym136$_CSETF_PERSPECTIVE_ACTION_HANDLER__FN);
        def_csetf(PERSPECTIVE_ACTION_HANDLER_FN, _CSETF_PERSPECTIVE_ACTION_HANDLER_FN);
        identity(PERSPECTIVE_ACTION);
        {
            SubLObject new_perspective_action = make_perspective_action($list_alt147);
            _csetf_perspective_action_name(new_perspective_action, CHANGE_PERSPECTIVE);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(CHANGE_PERSPECTIVE, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_perspective_action = make_perspective_action($list_alt153);
            _csetf_perspective_action_name(new_perspective_action, SHOW_DEFINITION);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(SHOW_DEFINITION, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_perspective_action = make_perspective_action($list_alt169);
            _csetf_perspective_action_name(new_perspective_action, ADD_FORT_TO_CHOSEN_COLS);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_FORT_TO_CHOSEN_COLS, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_perspective_action = make_perspective_action($list_alt177);
            _csetf_perspective_action_name(new_perspective_action, ADD_SPECS_TO_FACET);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_SPECS_TO_FACET, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_perspective_action = make_perspective_action($list_alt185);
            _csetf_perspective_action_name(new_perspective_action, ADD_SPECS_TO_NEW_FACET);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_SPECS_TO_NEW_FACET, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_perspective_action = make_perspective_action($list_alt210);
            _csetf_perspective_action_name(new_perspective_action, MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_perspective_action = make_perspective_action($list_alt218);
            _csetf_perspective_action_name(new_perspective_action, MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_perspective_action = make_perspective_action($list_alt224);
            _csetf_perspective_action_name(new_perspective_action, ADD_INSTANCES_TO_SPECS);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_INSTANCES_TO_SPECS, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_perspective_action = make_perspective_action($list_alt230);
            _csetf_perspective_action_name(new_perspective_action, UNASSERT);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(UNASSERT, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        {
            SubLObject new_perspective_action = make_perspective_action($list_alt237);
            _csetf_perspective_action_name(new_perspective_action, CHANGE_MT);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(CHANGE_MT, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject setup_cb_facets_file() {
        if (SubLFiles.USE_V1) {
            register_html_state_variable($facet_tool_mt$);
            sethash($FACET_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str5$facet_browser_gif, $str6$_Facets_));
            sethash($FACET_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str8$facet_browser_disabled_gif, $str6$_Facets_));
            final SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
            final SubLObject v_new = cb_adornments.make_adornment($list9);
            cb_adornments._csetf_adornment_name(v_new, VFACETS);
            cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(VFACETS, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            html_macros.note_cgi_handler_function(CB_FACET, $HTML_HANDLER);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_perspective$.getGlobalValue(), symbol_function(PERSPECTIVE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list41);
            def_csetf(PERSPECTIVE_NAME, _CSETF_PERSPECTIVE_NAME);
            def_csetf(PERSPECTIVE_KEYWORD, _CSETF_PERSPECTIVE_KEYWORD);
            def_csetf($sym46$PERSPECTIVE_DISPLAY__FN, $sym47$_CSETF_PERSPECTIVE_DISPLAY__FN);
            def_csetf(PERSPECTIVE_DISPLAY_FN, _CSETF_PERSPECTIVE_DISPLAY_FN);
            def_csetf(PERSPECTIVE_DISPLAY_STRING, _CSETF_PERSPECTIVE_DISPLAY_STRING);
            identity(PERSPECTIVE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_perspective$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PERSPECTIVE_METHOD));
            SubLObject new_perspective = make_perspective($list78);
            _csetf_perspective_name(new_perspective, AS_INDIVIDUAL);
            sethash(perspective_keyword(new_perspective), $perspectives_by_keyword$.getDynamicValue(), new_perspective);
            $perspectives$.setDynamicValue(cons(new_perspective, delete(AS_INDIVIDUAL, $perspectives$.getDynamicValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_perspective = make_perspective($list94);
            _csetf_perspective_name(new_perspective, AS_COLLECTION);
            sethash(perspective_keyword(new_perspective), $perspectives_by_keyword$.getDynamicValue(), new_perspective);
            $perspectives$.setDynamicValue(cons(new_perspective, delete(AS_COLLECTION, $perspectives$.getDynamicValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_perspective_action$.getGlobalValue(), symbol_function(PERSPECTIVE_ACTION_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list134);
            def_csetf(PERSPECTIVE_ACTION_NAME, _CSETF_PERSPECTIVE_ACTION_NAME);
            def_csetf(PERSPECTIVE_ACTION_KEYWORD, _CSETF_PERSPECTIVE_ACTION_KEYWORD);
            def_csetf(PERSPECTIVE_ACTION_ORDER_NUM, _CSETF_PERSPECTIVE_ACTION_ORDER_NUM);
            def_csetf(PERSPECTIVE_ACTION_PERSPECTIVE, _CSETF_PERSPECTIVE_ACTION_PERSPECTIVE);
            def_csetf($sym143$PERSPECTIVE_ACTION_DISPLAY__FN, $sym144$_CSETF_PERSPECTIVE_ACTION_DISPLAY__FN);
            def_csetf(PERSPECTIVE_ACTION_DISPLAY_FN, _CSETF_PERSPECTIVE_ACTION_DISPLAY_FN);
            def_csetf($sym147$PERSPECTIVE_ACTION_HANDLER__FN, $sym148$_CSETF_PERSPECTIVE_ACTION_HANDLER__FN);
            def_csetf(PERSPECTIVE_ACTION_HANDLER_FN, _CSETF_PERSPECTIVE_ACTION_HANDLER_FN);
            identity(PERSPECTIVE_ACTION);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_perspective_action$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PERSPECTIVE_ACTION_METHOD));
            SubLObject new_perspective_action = make_perspective_action($list160);
            _csetf_perspective_action_name(new_perspective_action, CHANGE_PERSPECTIVE);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(CHANGE_PERSPECTIVE, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_perspective_action = make_perspective_action($list166);
            _csetf_perspective_action_name(new_perspective_action, SHOW_DEFINITION);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(SHOW_DEFINITION, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_perspective_action = make_perspective_action($list182);
            _csetf_perspective_action_name(new_perspective_action, ADD_FORT_TO_CHOSEN_COLS);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_FORT_TO_CHOSEN_COLS, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_perspective_action = make_perspective_action($list190);
            _csetf_perspective_action_name(new_perspective_action, ADD_SPECS_TO_FACET);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_SPECS_TO_FACET, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_perspective_action = make_perspective_action($list198);
            _csetf_perspective_action_name(new_perspective_action, ADD_SPECS_TO_NEW_FACET);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_SPECS_TO_NEW_FACET, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_perspective_action = make_perspective_action($list223);
            _csetf_perspective_action_name(new_perspective_action, MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_perspective_action = make_perspective_action($list231);
            _csetf_perspective_action_name(new_perspective_action, MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_perspective_action = make_perspective_action($list237);
            _csetf_perspective_action_name(new_perspective_action, ADD_INSTANCES_TO_SPECS);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_INSTANCES_TO_SPECS, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_perspective_action = make_perspective_action($list243);
            _csetf_perspective_action_name(new_perspective_action, UNASSERT);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(UNASSERT, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            new_perspective_action = make_perspective_action($list250);
            _csetf_perspective_action_name(new_perspective_action, CHANGE_MT);
            $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(CHANGE_MT, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
                SubLObject v_new = cb_adornments.make_adornment($list_alt9);
                cb_adornments._csetf_adornment_name(v_new, VFACETS);
                cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(VFACETS, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            html_macros.note_html_handler_function(CB_FACET);
            def_csetf($sym36$PERSPECTIVE_DISPLAY__FN, $sym37$_CSETF_PERSPECTIVE_DISPLAY__FN);
            {
                SubLObject new_perspective = make_perspective($list_alt67);
                _csetf_perspective_name(new_perspective, AS_INDIVIDUAL);
                sethash(perspective_keyword(new_perspective), $perspectives_by_keyword$.getDynamicValue(), new_perspective);
                $perspectives$.setDynamicValue(cons(new_perspective, delete(AS_INDIVIDUAL, $perspectives$.getDynamicValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_perspective = make_perspective($list_alt83);
                _csetf_perspective_name(new_perspective, AS_COLLECTION);
                sethash(perspective_keyword(new_perspective), $perspectives_by_keyword$.getDynamicValue(), new_perspective);
                $perspectives$.setDynamicValue(cons(new_perspective, delete(AS_COLLECTION, $perspectives$.getDynamicValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            def_csetf($sym131$PERSPECTIVE_ACTION_DISPLAY__FN, $sym132$_CSETF_PERSPECTIVE_ACTION_DISPLAY__FN);
            def_csetf($sym135$PERSPECTIVE_ACTION_HANDLER__FN, $sym136$_CSETF_PERSPECTIVE_ACTION_HANDLER__FN);
            {
                SubLObject new_perspective_action = make_perspective_action($list_alt147);
                _csetf_perspective_action_name(new_perspective_action, CHANGE_PERSPECTIVE);
                $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(CHANGE_PERSPECTIVE, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_perspective_action = make_perspective_action($list_alt153);
                _csetf_perspective_action_name(new_perspective_action, SHOW_DEFINITION);
                $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(SHOW_DEFINITION, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_perspective_action = make_perspective_action($list_alt169);
                _csetf_perspective_action_name(new_perspective_action, ADD_FORT_TO_CHOSEN_COLS);
                $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_FORT_TO_CHOSEN_COLS, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_perspective_action = make_perspective_action($list_alt177);
                _csetf_perspective_action_name(new_perspective_action, ADD_SPECS_TO_FACET);
                $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_SPECS_TO_FACET, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_perspective_action = make_perspective_action($list_alt185);
                _csetf_perspective_action_name(new_perspective_action, ADD_SPECS_TO_NEW_FACET);
                $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_SPECS_TO_NEW_FACET, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_perspective_action = make_perspective_action($list_alt210);
                _csetf_perspective_action_name(new_perspective_action, MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC);
                $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_perspective_action = make_perspective_action($list_alt218);
                _csetf_perspective_action_name(new_perspective_action, MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS);
                $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_perspective_action = make_perspective_action($list_alt224);
                _csetf_perspective_action_name(new_perspective_action, ADD_INSTANCES_TO_SPECS);
                $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_INSTANCES_TO_SPECS, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_perspective_action = make_perspective_action($list_alt230);
                _csetf_perspective_action_name(new_perspective_action, UNASSERT);
                $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(UNASSERT, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            {
                SubLObject new_perspective_action = make_perspective_action($list_alt237);
                _csetf_perspective_action_name(new_perspective_action, CHANGE_MT);
                $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(CHANGE_MT, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
        }
        return NIL;
    }

    public static SubLObject setup_cb_facets_file_Previous() {
        register_html_state_variable($facet_tool_mt$);
        sethash($FACET_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str5$facet_browser_gif, $str6$_Facets_));
        sethash($FACET_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str8$facet_browser_disabled_gif, $str6$_Facets_));
        final SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        final SubLObject v_new = cb_adornments.make_adornment($list9);
        cb_adornments._csetf_adornment_name(v_new, VFACETS);
        cb_adornments.$cb_adornment_table$.setGlobalValue(cons(v_new, delete(VFACETS, old, symbol_function(EQUAL), symbol_function(ADORNMENT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        html_macros.note_cgi_handler_function(CB_FACET, $HTML_HANDLER);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_perspective$.getGlobalValue(), symbol_function(PERSPECTIVE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list41);
        def_csetf(PERSPECTIVE_NAME, _CSETF_PERSPECTIVE_NAME);
        def_csetf(PERSPECTIVE_KEYWORD, _CSETF_PERSPECTIVE_KEYWORD);
        def_csetf($sym46$PERSPECTIVE_DISPLAY__FN, $sym47$_CSETF_PERSPECTIVE_DISPLAY__FN);
        def_csetf(PERSPECTIVE_DISPLAY_FN, _CSETF_PERSPECTIVE_DISPLAY_FN);
        def_csetf(PERSPECTIVE_DISPLAY_STRING, _CSETF_PERSPECTIVE_DISPLAY_STRING);
        identity(PERSPECTIVE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_perspective$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PERSPECTIVE_METHOD));
        SubLObject new_perspective = make_perspective($list78);
        _csetf_perspective_name(new_perspective, AS_INDIVIDUAL);
        sethash(perspective_keyword(new_perspective), $perspectives_by_keyword$.getDynamicValue(), new_perspective);
        $perspectives$.setDynamicValue(cons(new_perspective, delete(AS_INDIVIDUAL, $perspectives$.getDynamicValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_perspective = make_perspective($list94);
        _csetf_perspective_name(new_perspective, AS_COLLECTION);
        sethash(perspective_keyword(new_perspective), $perspectives_by_keyword$.getDynamicValue(), new_perspective);
        $perspectives$.setDynamicValue(cons(new_perspective, delete(AS_COLLECTION, $perspectives$.getDynamicValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_perspective_action$.getGlobalValue(), symbol_function(PERSPECTIVE_ACTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list134);
        def_csetf(PERSPECTIVE_ACTION_NAME, _CSETF_PERSPECTIVE_ACTION_NAME);
        def_csetf(PERSPECTIVE_ACTION_KEYWORD, _CSETF_PERSPECTIVE_ACTION_KEYWORD);
        def_csetf(PERSPECTIVE_ACTION_ORDER_NUM, _CSETF_PERSPECTIVE_ACTION_ORDER_NUM);
        def_csetf(PERSPECTIVE_ACTION_PERSPECTIVE, _CSETF_PERSPECTIVE_ACTION_PERSPECTIVE);
        def_csetf($sym143$PERSPECTIVE_ACTION_DISPLAY__FN, $sym144$_CSETF_PERSPECTIVE_ACTION_DISPLAY__FN);
        def_csetf(PERSPECTIVE_ACTION_DISPLAY_FN, _CSETF_PERSPECTIVE_ACTION_DISPLAY_FN);
        def_csetf($sym147$PERSPECTIVE_ACTION_HANDLER__FN, $sym148$_CSETF_PERSPECTIVE_ACTION_HANDLER__FN);
        def_csetf(PERSPECTIVE_ACTION_HANDLER_FN, _CSETF_PERSPECTIVE_ACTION_HANDLER_FN);
        identity(PERSPECTIVE_ACTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_perspective_action$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PERSPECTIVE_ACTION_METHOD));
        SubLObject new_perspective_action = make_perspective_action($list160);
        _csetf_perspective_action_name(new_perspective_action, CHANGE_PERSPECTIVE);
        $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(CHANGE_PERSPECTIVE, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_perspective_action = make_perspective_action($list166);
        _csetf_perspective_action_name(new_perspective_action, SHOW_DEFINITION);
        $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(SHOW_DEFINITION, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_perspective_action = make_perspective_action($list182);
        _csetf_perspective_action_name(new_perspective_action, ADD_FORT_TO_CHOSEN_COLS);
        $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_FORT_TO_CHOSEN_COLS, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_perspective_action = make_perspective_action($list190);
        _csetf_perspective_action_name(new_perspective_action, ADD_SPECS_TO_FACET);
        $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_SPECS_TO_FACET, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_perspective_action = make_perspective_action($list198);
        _csetf_perspective_action_name(new_perspective_action, ADD_SPECS_TO_NEW_FACET);
        $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_SPECS_TO_NEW_FACET, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_perspective_action = make_perspective_action($list223);
        _csetf_perspective_action_name(new_perspective_action, MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC);
        $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_perspective_action = make_perspective_action($list231);
        _csetf_perspective_action_name(new_perspective_action, MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS);
        $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_perspective_action = make_perspective_action($list237);
        _csetf_perspective_action_name(new_perspective_action, ADD_INSTANCES_TO_SPECS);
        $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(ADD_INSTANCES_TO_SPECS, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_perspective_action = make_perspective_action($list243);
        _csetf_perspective_action_name(new_perspective_action, UNASSERT);
        $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(UNASSERT, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        new_perspective_action = make_perspective_action($list250);
        _csetf_perspective_action_name(new_perspective_action, CHANGE_MT);
        $perspective_actions$.setGlobalValue(cons(new_perspective_action, delete(CHANGE_MT, $perspective_actions$.getGlobalValue(), symbol_function(EQUAL), symbol_function(PERSPECTIVE_ACTION_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_facets_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_facets_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_facets_file();
    }

    static {
    }

    public static final class $perspective_p$UnaryFunction extends UnaryFunction {
        public $perspective_p$UnaryFunction() {
            super(extractFunctionNamed("PERSPECTIVE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return perspective_p(arg1);
        }
    }

    public static final class $perspective_action_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $keyword;

        public SubLObject $order_num;

        public SubLObject $perspective;

        public SubLObject $displayP_fn;

        public SubLObject $display_fn;

        public SubLObject $handlerP_fn;

        public SubLObject $handler_fn;

        private static final SubLStructDeclNative structDecl;

        public $perspective_action_native() {
            cb_facets.$perspective_action_native.this.$name = Lisp.NIL;
            cb_facets.$perspective_action_native.this.$keyword = Lisp.NIL;
            cb_facets.$perspective_action_native.this.$order_num = Lisp.NIL;
            cb_facets.$perspective_action_native.this.$perspective = Lisp.NIL;
            cb_facets.$perspective_action_native.this.$displayP_fn = Lisp.NIL;
            cb_facets.$perspective_action_native.this.$display_fn = Lisp.NIL;
            cb_facets.$perspective_action_native.this.$handlerP_fn = Lisp.NIL;
            cb_facets.$perspective_action_native.this.$handler_fn = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return cb_facets.$perspective_action_native.this.$name;
        }

        @Override
        public SubLObject getField3() {
            return cb_facets.$perspective_action_native.this.$keyword;
        }

        @Override
        public SubLObject getField4() {
            return cb_facets.$perspective_action_native.this.$order_num;
        }

        @Override
        public SubLObject getField5() {
            return cb_facets.$perspective_action_native.this.$perspective;
        }

        @Override
        public SubLObject getField6() {
            return cb_facets.$perspective_action_native.this.$displayP_fn;
        }

        @Override
        public SubLObject getField7() {
            return cb_facets.$perspective_action_native.this.$display_fn;
        }

        @Override
        public SubLObject getField8() {
            return cb_facets.$perspective_action_native.this.$handlerP_fn;
        }

        @Override
        public SubLObject getField9() {
            return cb_facets.$perspective_action_native.this.$handler_fn;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return cb_facets.$perspective_action_native.this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return cb_facets.$perspective_action_native.this.$keyword = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return cb_facets.$perspective_action_native.this.$order_num = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return cb_facets.$perspective_action_native.this.$perspective = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return cb_facets.$perspective_action_native.this.$displayP_fn = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return cb_facets.$perspective_action_native.this.$display_fn = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return cb_facets.$perspective_action_native.this.$handlerP_fn = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return cb_facets.$perspective_action_native.this.$handler_fn = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cb_facets.$perspective_action_native.class, PERSPECTIVE_ACTION, PERSPECTIVE_ACTION_P, $list128, $list129, new String[]{ "$name", "$keyword", "$order_num", "$perspective", "$displayP_fn", "$display_fn", "$handlerP_fn", "$handler_fn" }, $list130, $list131, PRINT_PERSPECTIVE_ACTION);
        }
    }

    public static final class $perspective_action_p$UnaryFunction extends UnaryFunction {
        public $perspective_action_p$UnaryFunction() {
            super(extractFunctionNamed("PERSPECTIVE-ACTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return perspective_action_p(arg1);
        }
    }



    static private final SubLString $str_alt3$cb_facet = makeString("cb-facet");

    static private final SubLString $str_alt5$facet_browser_gif = makeString("facet-browser.gif");

    static private final SubLString $str_alt6$_Facets_ = makeString("[Facets]");

    static private final SubLString $str_alt8$facet_browser_disabled_gif = makeString("facet-browser-disabled.gif");

    static private final SubLList $list_alt9 = list(new SubLObject[]{ $TYPE, makeKeyword("INDEX-FORT"), makeKeyword("ACTIVE-P"), T, makeKeyword("IMAGE"), makeKeyword("FACET-BROWSER"), makeKeyword("IMAGE-DISABLED"), makeKeyword("FACET-BROWSER-DISABLED"), makeKeyword("IMAGE-ALT"), makeString("[Facets]"), makeKeyword("EFFECTIVE-FN"), makeSymbol("FORT-P"), makeKeyword("HANDLER"), makeString("cb-facet"), $TOOL, NIL, makeKeyword("TITLE"), makeString("Facets Browser"), makeKeyword("COMMENT"), makeString("Link to the faceting information for FORT") });

    static private final SubLString $str_alt14$No_term_provided_ = makeString("No term provided!");

    static private final SubLString $str_alt16$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt17$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt18$WARNING__You_are_transmitting_ope = makeString("WARNING: You are transmitting operations  Be very careful.");

    static private final SubLList $list_alt26 = list(makeSymbol("NAME"), makeSymbol("KEYWORD"), makeSymbol("DISPLAY?-FN"), makeSymbol("DISPLAY-FN"), makeSymbol("DISPLAY-STRING"));

    static private final SubLList $list_alt27 = list($NAME, makeKeyword("KEYWORD"), makeKeyword("DISPLAY?-FN"), makeKeyword("DISPLAY-FN"), makeKeyword("DISPLAY-STRING"));

    static private final SubLList $list_alt28 = list(makeSymbol("PERSPECTIVE-NAME"), makeSymbol("PERSPECTIVE-KEYWORD"), makeSymbol("PERSPECTIVE-DISPLAY?-FN"), makeSymbol("PERSPECTIVE-DISPLAY-FN"), makeSymbol("PERSPECTIVE-DISPLAY-STRING"));

    static private final SubLList $list_alt29 = list(makeSymbol("_CSETF-PERSPECTIVE-NAME"), makeSymbol("_CSETF-PERSPECTIVE-KEYWORD"), makeSymbol("_CSETF-PERSPECTIVE-DISPLAY?-FN"), makeSymbol("_CSETF-PERSPECTIVE-DISPLAY-FN"), makeSymbol("_CSETF-PERSPECTIVE-DISPLAY-STRING"));

    static private final SubLSymbol $sym36$PERSPECTIVE_DISPLAY__FN = makeSymbol("PERSPECTIVE-DISPLAY?-FN");

    static private final SubLSymbol $sym37$_CSETF_PERSPECTIVE_DISPLAY__FN = makeSymbol("_CSETF-PERSPECTIVE-DISPLAY?-FN");

    public static final SubLSymbol $kw44$DISPLAY__FN = makeKeyword("DISPLAY?-FN");

    static private final SubLString $str_alt47$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt49$_ = makeString("#");

    static private final SubLString $str_alt50$__ = makeString("#<");

    static private final SubLList $list_alt53 = list(makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGLIST"));

    static private final SubLSymbol $sym54$NEW_PERSPECTIVE = makeUninternedSymbol("NEW-PERSPECTIVE");

    static private final SubLList $list_alt65 = list(makeSymbol("*PERSPECTIVES*"), list(makeSymbol("FUNCTION"), EQUAL), list(makeSymbol("FUNCTION"), makeSymbol("PERSPECTIVE-NAME")));

    static private final SubLList $list_alt66 = list(makeKeyword("DISPLAY"), list(makeKeyword("AS-INDIVIDUAL"), makeKeyword("AS-COLLECTION")), makeKeyword("DEFAULT"), list(makeKeyword("AS-COLLECTION"), makeKeyword("AS-INDIVIDUAL")));

    static private final SubLList $list_alt67 = list(makeKeyword("KEYWORD"), makeKeyword("AS-INDIVIDUAL"), makeKeyword("DISPLAY?-FN"), makeSymbol("SHOW-AS-INDIVIDUAL?"), makeKeyword("DISPLAY-FN"), makeSymbol("HTML-SHOW-AS-INDIVIDUAL"), makeKeyword("DISPLAY-STRING"), makeString("Individual"));

    static private final SubLString $str_alt69$100_ = makeString("100%");

    static private final SubLSymbol $sym71$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE>");

    static private final SubLSymbol $sym72$FORT_NAME_ = makeSymbol("FORT-NAME<");

    static private final SubLString $str_alt73$6_ = makeString("6%");

    static private final SubLString $str_alt78$i_ = makeString("i ");

    static private final SubLString $str_alt82$x_ = makeString("x ");

    static private final SubLList $list_alt83 = list(makeKeyword("KEYWORD"), makeKeyword("AS-COLLECTION"), makeKeyword("DISPLAY?-FN"), makeSymbol("SHOW-AS-COLLECTION?"), makeKeyword("DISPLAY-FN"), makeSymbol("HTML-SHOW-AS-COLLECTION"), makeKeyword("DISPLAY-STRING"), makeString("Collection"));

    static private final SubLString $str_alt88$__genls__ = makeString("* genls: ");

    static private final SubLString $str_alt92$__coextensional_ = makeString(" (coextensional)");

    static private final SubLString $str_alt97$__faceted_specs__ = makeString("* faceted specs: ");

    static private final SubLString $str_alt100$_A_SPEC = makeString("~A-SPEC");

    static private final SubLString $str_alt101$_A_SPEC_SELECTED = makeString("~A-SPEC-SELECTED");

    public static final SubLSymbol $kw102$SPECS_FACETED_ = makeKeyword("SPECS-FACETED?");

    public static final SubLSymbol $kw105$SPECS_UNFACETED_ = makeKeyword("SPECS-UNFACETED?");

    static private final SubLString $str_alt106$__unfaceted_specs__ = makeString("* unfaceted specs: ");

    static private final SubLString $str_alt108$____ = makeString("|__ ");

    static private final SubLString $str_alt109$_unfaceted_specs_not_shown_ = makeString(" unfaceted specs not shown.");

    static private final SubLString $str_alt112$__instances__ = makeString("* instances: ");

    static private final SubLString $str_alt114$_instances_not_shown_ = makeString(" instances not shown.");

    static private final SubLList $list_alt117 = list(makeSymbol("NAME"), makeSymbol("KEYWORD"), makeSymbol("ORDER-NUM"), makeSymbol("PERSPECTIVE"), makeSymbol("DISPLAY?-FN"), makeSymbol("DISPLAY-FN"), makeSymbol("HANDLER?-FN"), makeSymbol("HANDLER-FN"));

    static private final SubLList $list_alt118 = list($NAME, makeKeyword("KEYWORD"), makeKeyword("ORDER-NUM"), makeKeyword("PERSPECTIVE"), makeKeyword("DISPLAY?-FN"), makeKeyword("DISPLAY-FN"), makeKeyword("HANDLER?-FN"), makeKeyword("HANDLER-FN"));

    static private final SubLList $list_alt119 = list(makeSymbol("PERSPECTIVE-ACTION-NAME"), makeSymbol("PERSPECTIVE-ACTION-KEYWORD"), makeSymbol("PERSPECTIVE-ACTION-ORDER-NUM"), makeSymbol("PERSPECTIVE-ACTION-PERSPECTIVE"), makeSymbol("PERSPECTIVE-ACTION-DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-HANDLER-FN"));

    static private final SubLList $list_alt120 = list(makeSymbol("_CSETF-PERSPECTIVE-ACTION-NAME"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-KEYWORD"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-ORDER-NUM"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-PERSPECTIVE"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-DISPLAY?-FN"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-DISPLAY-FN"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-HANDLER?-FN"), makeSymbol("_CSETF-PERSPECTIVE-ACTION-HANDLER-FN"));

    static private final SubLSymbol $sym131$PERSPECTIVE_ACTION_DISPLAY__FN = makeSymbol("PERSPECTIVE-ACTION-DISPLAY?-FN");

    static private final SubLSymbol $sym132$_CSETF_PERSPECTIVE_ACTION_DISPLAY__FN = makeSymbol("_CSETF-PERSPECTIVE-ACTION-DISPLAY?-FN");

    static private final SubLSymbol $sym135$PERSPECTIVE_ACTION_HANDLER__FN = makeSymbol("PERSPECTIVE-ACTION-HANDLER?-FN");

    static private final SubLSymbol $sym136$_CSETF_PERSPECTIVE_ACTION_HANDLER__FN = makeSymbol("_CSETF-PERSPECTIVE-ACTION-HANDLER?-FN");

    public static final SubLSymbol $kw140$HANDLER__FN = makeKeyword("HANDLER?-FN");

    static private final SubLSymbol $sym142$NEW_PERSPECTIVE_ACTION = makeUninternedSymbol("NEW-PERSPECTIVE-ACTION");

    static private final SubLList $list_alt145 = list(makeSymbol("*PERSPECTIVE-ACTIONS*"), list(makeSymbol("FUNCTION"), EQUAL), list(makeSymbol("FUNCTION"), makeSymbol("PERSPECTIVE-ACTION-NAME")));

    static private final SubLSymbol $sym146$_ = makeSymbol("<");

    static private final SubLList $list_alt147 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("CHANGE-PERSPECTIVE"), makeKeyword("ORDER-NUM"), TEN_INTEGER, makeKeyword("PERSPECTIVE"), makeKeyword("GLOBAL-TOP"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-HANDLER") });

    static private final SubLString $str_alt149$__A_ = makeString("[~A]");

    static private final SubLString $str_alt150$_A__A = makeString("~A?~A");

    static private final SubLList $list_alt153 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("SHOW-DEFINITION"), makeKeyword("ORDER-NUM"), TWENTY_INTEGER, makeKeyword("PERSPECTIVE"), makeKeyword("GLOBAL-TOP"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-SHOW-DEFINITION-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-SHOW-DEFINITION-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-SHOW-DEFINITION-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-SHOW-DEFINITION-HANDLER") });

    static private final SubLString $str_alt156$_Show_ = makeString("(Show ");

    static private final SubLString $str_alt157$_in_Index_Browser_ = makeString(" in Index Browser)");

    static private final SubLString $str_alt162$Defined_in_ = makeString("Defined in ");

    static private final SubLString $str_alt163$_ = makeString(" ");

    static private final SubLString $str_alt165$No_comment_ = makeString("No comment.");

    static private final SubLString $str_alt166$__isa__ = makeString("* isa: ");

    static private final SubLString $str_alt167$Undefined_in_current_Mt_ = makeString("Undefined in current Mt.");

    static private final SubLList $list_alt169 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("ADD-FORT-TO-CHOSEN-COLS"), makeKeyword("ORDER-NUM"), makeInteger(30), makeKeyword("PERSPECTIVE"), makeKeyword("AS-INDIVIDUAL"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-HANDLER") });

    static private final SubLString $str_alt171$__Make_ = makeString("* Make ");

    static private final SubLString $str_alt172$_a_direct_instance_of_selected_co = makeString(" a direct instance of selected collections. ");

    static private final SubLList $list_alt176 = list(makeKeyword("NO-COLLECTIONS-CHOSEN"));

    static private final SubLList $list_alt177 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("ADD-SPECS-TO-FACET"), makeKeyword("ORDER-NUM"), makeInteger(40), makeKeyword("PERSPECTIVE"), makeKeyword("AS-COLLECTION"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-HANDLER") });

    static private final SubLString $str_alt179$__Add_selected_spec_s__to_selecte = makeString("* Add selected spec(s) to selected facet ");

    static private final SubLList $list_alt181 = list(makeKeyword("NO-SPEC-CHOSEN"));

    static private final SubLList $list_alt182 = list(makeKeyword("NO-FACET-CHOSEN"));

    static private final SubLString $str_alt184$_A_assertions_must_currently_be_h = makeString("~A assertions must currently be hand edited.");

    static private final SubLList $list_alt185 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("ADD-SPECS-TO-NEW-FACET"), makeKeyword("ORDER-NUM"), makeInteger(50), makeKeyword("PERSPECTIVE"), makeKeyword("AS-COLLECTION"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-HANDLER") });

    static private final SubLString $str_alt187$__Make_a_new_facet_with_selected_ = makeString("* Make a new facet with selected spec(s) as instances ");

    static private final SubLString $str_alt189$New_facet_name__ = makeString("New facet name: ");

    static private final SubLString $str_alt193$New_facet_type__ = makeString("New facet type: ");

    static private final SubLString $str_alt196$_generic_ = makeString(" generic ");

    static private final SubLString $str_alt198$_strict_ = makeString(" strict ");

    static private final SubLString $str_alt200$_covering_ = makeString(" covering ");

    static private final SubLString $str_alt202$_partition_ = makeString(" partition ");

    static private final SubLList $list_alt203 = list(makeKeyword("NO-FACET-TYPE-CHOSEN"));

    static private final SubLList $list_alt204 = list(makeKeyword("NO-FACET-NAME-CHOSEN"));

    static private final SubLString $str_alt205$_ATypeBy_A = makeString("~ATypeBy~A");

    static private final SubLList $list_alt206 = list(reader_make_constant_shell("DisjointCollectionType"));

    static private final SubLList $list_alt207 = list(reader_make_constant_shell("CollectionType"));

    static private final SubLList $list_alt208 = list(reader_make_constant_shell("ConventionalClassificationType"));

    static private final SubLString $str_alt209$A_collection_of_collections__Each = makeString("A collection of collections. Each instance is a spec of ~A whose instances are all of the same ~A.");

    static private final SubLList $list_alt210 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC"), makeKeyword("ORDER-NUM"), makeInteger(60), makeKeyword("PERSPECTIVE"), makeKeyword("AS-COLLECTION"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-HANDLER") });

    static private final SubLString $str_alt212$__Make_selected_spec_s__direct_sp = makeString("* Make selected spec(s) direct specs of specified collection or new spec");

    static private final SubLString $str_alt214$Collection_or_new_spec_name__ = makeString("Collection or new spec name: ");

    static private final SubLList $list_alt216 = list(makeKeyword("INVALID-SPEC-NAME"));

    static private final SubLList $list_alt217 = list(reader_make_constant_shell("Collection"));

    static private final SubLList $list_alt218 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS"), makeKeyword("ORDER-NUM"), makeInteger(60), makeKeyword("PERSPECTIVE"), makeKeyword("AS-COLLECTION"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-HANDLER") });

    static private final SubLString $str_alt220$__Make_selected_unfaceted_spec_s_ = makeString("* Make selected unfaceted spec(s) direct specs of selected faceted spec(s)");

    static private final SubLList $list_alt222 = list(makeKeyword("NO-UNFACETED-SPECS-CHOSEN"));

    static private final SubLList $list_alt223 = list(makeKeyword("NO-FACETED-SPECS-CHOSEN"));

    static private final SubLList $list_alt224 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("ADD-INSTANCES-TO-SPECS"), makeKeyword("ORDER-NUM"), makeInteger(70), makeKeyword("PERSPECTIVE"), makeKeyword("AS-COLLECTION"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-HANDLER") });

    static private final SubLString $str_alt226$__Add_selected_instance_s__to_sel = makeString("* Add selected instance(s) to selected spec(s)");

    static private final SubLList $list_alt228 = list(makeKeyword("NO-SPECS-CHOSEN"));

    static private final SubLList $list_alt229 = list(makeKeyword("NO-INSTANCES-CHOSEN"));

    static private final SubLList $list_alt230 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("UNASSERT"), makeKeyword("ORDER-NUM"), ZERO_INTEGER, makeKeyword("PERSPECTIVE"), NIL, makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-UNASSERT-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-UNASSERT-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-UNASSERT-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-UNASSERT-HANDLER") });

    static private final SubLList $list_alt232 = list(reader_make_constant_shell("Thing"));

    static private final SubLList $list_alt233 = list(reader_make_constant_shell("CollectionTypeType"));

    static private final SubLList $list_alt237 = list(new SubLObject[]{ makeKeyword("KEYWORD"), makeKeyword("CHANGE-MT"), makeKeyword("ORDER-NUM"), makeInteger(100), makeKeyword("PERSPECTIVE"), makeKeyword("GLOBAL-BOTTOM"), makeKeyword("DISPLAY?-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-MT-DISPLAY?"), makeKeyword("DISPLAY-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-MT-DISPLAY"), makeKeyword("HANDLER?-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-MT-HANDLER?"), makeKeyword("HANDLER-FN"), makeSymbol("PERSPECTIVE-ACTION-CHANGE-MT-HANDLER") });

    static private final SubLString $str_alt240$__Change_current_Mt_from_ = makeString("* Change current Mt from ");

    static private final SubLString $str_alt242$_New_Mt_name__ = makeString(" New Mt name: ");

    static private final SubLList $list_alt247 = list(makeString("-"));

    static private final SubLString $str_alt248$_A___A = makeString("~A: ~A");

    static private final SubLString $str_alt249$Errors_found_ = makeString("Errors found:");

    static private final SubLString $str_alt251$Actions_taken_ = makeString("Actions taken:");

    static private final SubLString $str_alt253$_A_in__A = makeString("~A in ~A");

    static private final SubLString $str_alt255$_A_from__A = makeString("~A from ~A");
}

/**
 * Total time: 3522 ms
 */
