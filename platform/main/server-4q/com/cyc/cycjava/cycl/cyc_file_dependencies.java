/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYC-FILE-DEPENDENCIES
 * source file: /cyc/top/cycl/cyc-file-dependencies.lisp
 * created:     2019/07/03 17:37:06
 */
public final class cyc_file_dependencies extends SubLTranslatedFile implements V12 {
    public static final SubLObject missing_javascript() {
        return $missing_javascript$.getGlobalValue();
    }

    public static final SubLObject missing_css() {
        return $missing_css$.getGlobalValue();
    }

    public static final SubLObject javascript_existsP(SubLObject javascript_keyword) {
        return string_utilities.non_empty_stringP(com.cyc.cycjava.cycl.cyc_file_dependencies.get_javascript_filename(javascript_keyword));
    }

    public static final SubLObject get_javascript_alt_string(SubLObject javascript_keyword) {
        return second(gethash(javascript_keyword, $javascript_definitions$.getGlobalValue(), UNPROVIDED));
    }

    public static final SubLObject get_css_alt_string(SubLObject css_keyword) {
        return second(gethash(css_keyword, $css_definitions$.getGlobalValue(), UNPROVIDED));
    }

    public static final SubLObject css_existsP(SubLObject css_keyword) {
        return string_utilities.non_empty_stringP(com.cyc.cycjava.cycl.cyc_file_dependencies.get_css_filename(css_keyword));
    }

    static private final SubLString $str_alt36$ = makeString("");

    public static final SubLSymbol $css_definitions$ = makeSymbol("*CSS-DEFINITIONS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $javascript_definitions$ = makeSymbol("*JAVASCRIPT-DEFINITIONS*");

    /**
     * The default css filename when a css is not found.  May or may not actually exist on the web server.
     */
    // deflexical
    @LispMethod(comment = "The default css filename when a css is not found.  May or may not actually exist on the web server.\ndeflexical")
    private static final SubLSymbol $missing_css$ = makeSymbol("*MISSING-CSS*");

    /**
     * The default javascript filename when a javascript is not found.  May or may not actually exist on the web server.
     */
    // deflexical
    @LispMethod(comment = "The default javascript filename when a javascript is not found.  May or may not actually exist on the web server.\ndeflexical")
    private static final SubLSymbol $missing_javascript$ = makeSymbol("*MISSING-JAVASCRIPT*");

    public static final SubLFile me = new cyc_file_dependencies();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_file_dependencies";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $html_emitted_file_dependencies$ = makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*");

    // deflexical
    // The default directory on the web server to look for the java files.
    /**
     * The default directory on the web server to look for the java files.
     */
    @LispMethod(comment = "The default directory on the web server to look for the java files.\ndeflexical")
    private static final SubLSymbol $java_default_directory$ = makeSymbol("*JAVA-DEFAULT-DIRECTORY*");

    // deflexical
    // The default directory on the web server to look for the icon image files.
    /**
     * The default directory on the web server to look for the icon image files.
     */
    @LispMethod(comment = "The default directory on the web server to look for the icon image files.\ndeflexical")
    private static final SubLSymbol $html_icon_default_directory$ = makeSymbol("*HTML-ICON-DEFAULT-DIRECTORY*");

    // deflexical
    /**
     * The default icon filename when an html-icon is not found. May or may not
     * actually exist on the web server.
     */
    @LispMethod(comment = "The default icon filename when an html-icon is not found. May or may not\r\nactually exist on the web server.\ndeflexical\nThe default icon filename when an html-icon is not found. May or may not\nactually exist on the web server.")
    private static final SubLSymbol $html_missing_icon$ = makeSymbol("*HTML-MISSING-ICON*");

    // deflexical
    // The default directory on the web server to look for the help files.
    /**
     * The default directory on the web server to look for the help files.
     */
    @LispMethod(comment = "The default directory on the web server to look for the help files.\ndeflexical")
    private static final SubLSymbol $cb_help_default_directory$ = makeSymbol("*CB-HELP-DEFAULT-DIRECTORY*");

    // deflexical
    // The default directory on the web server to look for the icon image files.
    /**
     * The default directory on the web server to look for the icon image files.
     */
    @LispMethod(comment = "The default directory on the web server to look for the icon image files.\ndeflexical")
    private static final SubLSymbol $cb_icon_default_directory$ = makeSymbol("*CB-ICON-DEFAULT-DIRECTORY*");

    // deflexical
    /**
     * The default icon filename when a cb-icon is not found. May or may not
     * actually exist on the web server.
     */
    @LispMethod(comment = "The default icon filename when a cb-icon is not found. May or may not\r\nactually exist on the web server.\ndeflexical\nThe default icon filename when a cb-icon is not found. May or may not\nactually exist on the web server.")
    private static final SubLSymbol $cb_missing_icon$ = makeSymbol("*CB-MISSING-ICON*");

    public static final SubLSymbol $external_file_definitions$ = makeSymbol("*EXTERNAL-FILE-DEFINITIONS*");

    private static final SubLList $list4 = list(list(makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*"), list(makeSymbol("LIST"))));

    private static final SubLList $list5 = list(list(makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*"), list(makeSymbol("FIF"), list(EQ, makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*"), makeKeyword("UNINITIALIZED")), list(makeSymbol("LIST")), makeSymbol("*HTML-EMITTED-FILE-DEPENDENCIES*"))));

    static private final SubLList $list6 = list(makeSymbol("FILE-KEYWORD"), makeSymbol("DEPENDENCIES"));

    private static final SubLSymbol DEF_EXTERNAL_FILE = makeSymbol("DEF-EXTERNAL-FILE");

    private static final SubLList $list10 = list(makeSymbol("FILE-KEYWORD"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("PATH"), makeString("js")), makeSymbol("DEPENDENCIES"));

    private static final SubLList $list11 = list($PATH, makeKeyword("DEPENDENCIES"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLString $$$js = makeString("js");

    private static final SubLSymbol EXT_DEP_ENDS_WITH = makeSymbol("EXT-DEP-ENDS-WITH");

    static private final SubLList $list18 = list(makeString(".js"));

    private static final SubLString $str20$Defining_javascript_file__S_witho = makeString("Defining javascript file ~S without '.js' as the suffix.");

    private static final SubLList $list22 = list(makeSymbol("FILE-KEYWORD"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("PATH"), makeString("css")), makeSymbol("DEPENDENCIES"));

    private static final SubLString $$$css = makeString("css");

    private static final SubLList $list24 = list(makeString(".css"));

    private static final SubLString $str25$Defining_CSS_file__S_without___cs = makeString("Defining CSS file ~S without '.css' as the suffix.");

    private static final SubLList $list27 = list(makeSymbol("FILE-KEYWORD"), makeSymbol("PATH"), makeSymbol("FILENAME"), makeSymbol("FILE-TYPE"), makeSymbol("&KEY"), makeSymbol("DEPENDENCIES"));

    private static final SubLList $list28 = list(makeKeyword("DEPENDENCIES"));

    private static final SubLSymbol CHECK_EXTERNAL_FILE_DEFINITION = makeSymbol("CHECK-EXTERNAL-FILE-DEFINITION");

    private static final SubLString $str34$Unable_to_define__S_because_of_un = makeString("Unable to define ~S because of undefined dependencies ~S");

    private static final SubLString $str35$Redefinition_of_external_file__S_ = makeString("Redefinition of external file ~S from ~S to ~S (in ~S) of type ~S with dependencies ~S");

    private static final SubLString $str36$Emitting__S_with_no_html_file_dep = makeString("Emitting ~S with no html-file-dependency-space.");

    private static final SubLString $str37$text_javascript = makeString("text/javascript");

    private static final SubLString $$$stylesheet = makeString("stylesheet");

    private static final SubLString $str39$text_css = makeString("text/css");

    private static final SubLString $str40$Unable_to_emit_file__S___S__of_ty = makeString("Unable to emit file ~S (~S) of type ~S");

    private static final SubLSymbol UNDEFINED_EXTERNAL_DEPENDENCIES = makeSymbol("UNDEFINED-EXTERNAL-DEPENDENCIES");

    private static final SubLSymbol $sym42$REDUNDANT_DEPENDENCY_ = makeSymbol("REDUNDANT-DEPENDENCY?");

    private static final SubLList $list43 = list(makeSymbol("DEF-CSS-2"), makeSymbol("DEF-JAVASCRIPT-2"));

    private static final SubLString $str44$java_ = makeString("java/");

    private static final SubLString $str45$_ = makeString("/");

    private static final SubLString $str46$_lib_ = makeString("/lib/");

    private static final SubLString $$$jar = makeString("jar");

    private static final SubLString $str48$lib_ = makeString("lib/");

    public static final SubLSymbol $html_icon_definitions$ = makeSymbol("*HTML-ICON-DEFINITIONS*");

    private static final SubLList $list51 = list(makeSymbol("ICON-KEYWORD"), makeSymbol("FILENAME"), makeSymbol("&OPTIONAL"), makeSymbol("ALT-STRING"));

    private static final SubLString $str52$ = makeString("");

    private static final SubLString $str53$missing_gif = makeString("missing.gif");

    private static final SubLList $list54 = list(new SubLObject[]{ makeSymbol("ICON-KEYWORD"), makeSymbol("&KEY"), makeSymbol("ID"), makeSymbol("NAME"), makeSymbol("ISMAP"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("ALT-OVERRIDE"), makeSymbol("ALIGN-OVERRIDE"), makeSymbol("BORDER-OVERRIDE") });

    static private final SubLList $list55 = list(makeKeyword("ID"), $NAME, makeKeyword("ISMAP"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("ALT-OVERRIDE"), makeKeyword("ALIGN-OVERRIDE"), makeKeyword("BORDER-OVERRIDE"));

    private static final SubLSymbol $sym64$IMAGE_SRC = makeUninternedSymbol("IMAGE-SRC");

    private static final SubLSymbol $sym65$ALIGN = makeUninternedSymbol("ALIGN");

    private static final SubLSymbol $sym66$ALT = makeUninternedSymbol("ALT");

    private static final SubLSymbol $sym67$BORDER = makeUninternedSymbol("BORDER");

    private static final SubLSymbol $html_image_directory$ = makeSymbol("*HTML-IMAGE-DIRECTORY*");

    private static final SubLSymbol HTML_ICON_SRC = makeSymbol("HTML-ICON-SRC");

    private static final SubLList $list72 = list(makeKeyword("CENTER"));

    private static final SubLSymbol GET_HTML_ICON_ALT_STRING = makeSymbol("GET-HTML-ICON-ALT-STRING");

    private static final SubLList $list74 = list(ZERO_INTEGER);

    private static final SubLSymbol HTML_FANCY_IMAGE = makeSymbol("HTML-FANCY-IMAGE");

    public static final SubLSymbol $cb_help_definitions$ = makeSymbol("*CB-HELP-DEFINITIONS*");

    private static final SubLList $list80 = list(makeSymbol("HELP-KEYWORD"), makeSymbol("FILENAME"), makeSymbol("&OPTIONAL"), makeSymbol("DESC-STRING"));

    private static final SubLString $str81$help_ = makeString("help/");

    private static final SubLString $str82$Help_file_not_found_for__A = makeString("Help file not found for ~A");

    public static final SubLSymbol $cb_icon_definitions$ = makeSymbol("*CB-ICON-DEFINITIONS*");

    private static final SubLString $str84$cb_ = makeString("cb/");

    private static final SubLList $list85 = list(new SubLObject[]{ makeSymbol("ICON-KEYWORD"), makeSymbol("&KEY"), makeSymbol("NAME"), makeSymbol("ISMAP"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("ALT-OVERRIDE"), makeSymbol("ALIGN-OVERRIDE"), makeSymbol("BORDER-OVERRIDE") });

    private static final SubLList $list86 = list($NAME, makeKeyword("ISMAP"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("ALT-OVERRIDE"), makeKeyword("ALIGN-OVERRIDE"), makeKeyword("BORDER-OVERRIDE"));

    private static final SubLSymbol $sym87$IMAGE_SRC = makeUninternedSymbol("IMAGE-SRC");

    private static final SubLSymbol $sym88$ALIGN = makeUninternedSymbol("ALIGN");

    private static final SubLSymbol $sym89$ALT = makeUninternedSymbol("ALT");

    private static final SubLSymbol $sym90$BORDER = makeUninternedSymbol("BORDER");

    private static final SubLSymbol CB_ICON_FILE_PATH = makeSymbol("CB-ICON-FILE-PATH");

    private static final SubLList $list92 = list(makeKeyword("TOP"));

    private static final SubLSymbol CB_GET_ICON_ALT_STRING = makeSymbol("CB-GET-ICON-ALT-STRING");

    private static final SubLSymbol COMPILE_CB_BROWSER_DEPENDENCIES = makeSymbol("COMPILE-CB-BROWSER-DEPENDENCIES");

    private static final SubLList $list95 = list(makeSymbol("KEYWORD-PRODUCER"), makeSymbol("KEYWORD-MAPPING-FN"));

    private static final SubLSymbol JAVASCRIPT_KEYWORDS = makeSymbol("JAVASCRIPT-KEYWORDS");

    private static final SubLSymbol JAVASCRIPT_FILE_PATH = makeSymbol("JAVASCRIPT-FILE-PATH");

    private static final SubLSymbol HTML_ICON_KEYWORDS = makeSymbol("HTML-ICON-KEYWORDS");

    private static final SubLSymbol HTML_ICON_FILE_PATH = makeSymbol("HTML-ICON-FILE-PATH");

    private static final SubLSymbol CB_HELP_KEYWORDS = makeSymbol("CB-HELP-KEYWORDS");

    private static final SubLSymbol CB_HELP_FILE_PATH = makeSymbol("CB-HELP-FILE-PATH");

    private static final SubLSymbol CB_ICON_KEYWORDS = makeSymbol("CB-ICON-KEYWORDS");

    private static final SubLSymbol CSS_KEYWORDS = makeSymbol("CSS-KEYWORDS");

    private static final SubLSymbol CSS_FILE_PATH = makeSymbol("CSS-FILE-PATH");

    private static final SubLSymbol CB_BROWSER_DEPENDENCY_MANIFEST = makeSymbol("CB-BROWSER-DEPENDENCY-MANIFEST");

    public static SubLObject with_new_html_file_dependency_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
    }

    public static SubLObject with_possibly_new_html_file_dependency_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list5, append(body, NIL));
    }

    public static SubLObject web_bundle(final SubLObject keyword) {
        return emit_external_file_with_dependencies(keyword);
    }

    public static SubLObject def_web_bundle(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject file_keyword = NIL;
        SubLObject dependencies = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        file_keyword = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        dependencies = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(DEF_EXTERNAL_FILE, file_keyword, NIL, NIL, $BUNDLE, $DEPENDENCIES, dependencies);
        }
        cdestructuring_bind_error(datum, $list6);
        return NIL;
    }

    public static final SubLObject javascript(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject javascript_keyword = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            javascript_keyword = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_1 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt6);
                    current_1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt6);
                    if (NIL == member(current_1, $list_alt7, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt6);
                }
                {
                    SubLObject type_tail = property_list_member($TYPE, current);
                    SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : $str_alt10$text_javascript;
                    SubLObject language_tail = property_list_member($LANGUAGE, current);
                    SubLObject language = (NIL != language_tail) ? ((SubLObject) (cadr(language_tail))) : NIL;
                    SubLObject javascript_src = $sym12$JAVASCRIPT_SRC;
                    return list(CLET, list(list(javascript_src, list(JAVASCRIPT_FILE_PATH, javascript_keyword))), list(HTML_FANCY_SCRIPT, list($TYPE, type, $LANGUAGE, language, $SRC, javascript_src)));
                }
            }
        }
    }

    public static SubLObject javascript(final SubLObject keyword) {
        return emit_external_file_with_dependencies(keyword);
    }

    public static final SubLObject def_javascript_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject javascript_keyword = NIL;
            SubLObject filename = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            javascript_keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            filename = current.first();
            current = current.rest();
            {
                SubLObject alt_string = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt2);
                current = current.rest();
                if (NIL == current) {
                    return list(SETHASH, javascript_keyword, $javascript_definitions$, list(LIST, filename, alt_string));
                } else {
                    cdestructuring_bind_error(datum, $list_alt2);
                }
            }
        }
        return NIL;
    }

    public static SubLObject def_javascript(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject file_keyword = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        file_keyword = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list10);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list10);
            if (NIL == member(current_$1, $list11, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list10);
        }
        final SubLObject path_tail = property_list_member($PATH, current);
        final SubLObject path = (NIL != path_tail) ? cadr(path_tail) : $$$js;
        final SubLObject dependencies_tail = property_list_member($DEPENDENCIES, current);
        final SubLObject dependencies = (NIL != dependencies_tail) ? cadr(dependencies_tail) : NIL;
        return list(PROGN, list(PUNLESS, listS(EXT_DEP_ENDS_WITH, filename, $list18), list(WARN, $str20$Defining_javascript_file__S_witho, filename)), list(DEF_EXTERNAL_FILE, file_keyword, path, filename, $JS, $DEPENDENCIES, dependencies));
    }

    public static final SubLObject javascript_keywords_alt() {
        return hash_table_utilities.hash_table_keys($javascript_definitions$.getGlobalValue());
    }

    public static SubLObject javascript_keywords() {
        return external_dependencies_of_type($JS);
    }

    public static final SubLObject get_javascript_filename_alt(SubLObject javascript_keyword) {
        return gethash(javascript_keyword, $javascript_definitions$.getGlobalValue(), UNPROVIDED).first();
    }

    public static SubLObject get_javascript_filename(final SubLObject keyword) {
        return get_external_dependency_filename(keyword);
    }

    public static final SubLObject javascript_file_path_alt(SubLObject javascript_keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject javascript_filename = com.cyc.cycjava.cycl.cyc_file_dependencies.get_javascript_filename(javascript_keyword);
                return cconcatenate(system_parameters.$html_javascript_directory$.getDynamicValue(thread), javascript_filename);
            }
        }
    }

    public static SubLObject javascript_file_path(final SubLObject keyword) {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), get_external_dependency_data(keyword));
    }

    public static final SubLObject css(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject css_keyword = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            css_keyword = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_2 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt20);
                    current_2 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt20);
                    if (NIL == member(current_2, $list_alt21, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_2 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt20);
                }
                {
                    SubLObject type_tail = property_list_member($TYPE, current);
                    SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : $str_alt22$text_css;
                    SubLObject rel_tail = property_list_member($REL, current);
                    SubLObject rel = (NIL != rel_tail) ? ((SubLObject) (cadr(rel_tail))) : $$$stylesheet;
                    SubLObject css_href = $sym25$CSS_HREF;
                    return list(CLET, list(list(css_href, list(CSS_FILE_PATH, css_keyword))), list(HTML_FANCY_LINK, list($TYPE, type, $HREF, css_href, $REL, rel)));
                }
            }
        }
    }

    public static SubLObject css(final SubLObject keyword) {
        return emit_external_file_with_dependencies(keyword);
    }

    public static final SubLObject def_css_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject css_keyword = NIL;
            SubLObject filename = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt18);
            css_keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt18);
            filename = current.first();
            current = current.rest();
            {
                SubLObject alt_string = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt18);
                current = current.rest();
                if (NIL == current) {
                    return list(SETHASH, css_keyword, $css_definitions$, list(LIST, filename, alt_string));
                } else {
                    cdestructuring_bind_error(datum, $list_alt18);
                }
            }
        }
        return NIL;
    }

    public static SubLObject def_css(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject file_keyword = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        file_keyword = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list22);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list22);
            if (NIL == member(current_$2, $list11, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list22);
        }
        final SubLObject path_tail = property_list_member($PATH, current);
        final SubLObject path = (NIL != path_tail) ? cadr(path_tail) : $$$css;
        final SubLObject dependencies_tail = property_list_member($DEPENDENCIES, current);
        final SubLObject dependencies = (NIL != dependencies_tail) ? cadr(dependencies_tail) : NIL;
        return list(PROGN, list(PUNLESS, listS(EXT_DEP_ENDS_WITH, filename, $list24), list(WARN, $str25$Defining_CSS_file__S_without___cs, filename)), list(DEF_EXTERNAL_FILE, file_keyword, path, filename, $CSS, $DEPENDENCIES, dependencies));
    }

    public static final SubLObject css_keywords_alt() {
        return hash_table_utilities.hash_table_keys($css_definitions$.getGlobalValue());
    }

    public static SubLObject css_keywords() {
        return external_dependencies_of_type($CSS);
    }

    public static final SubLObject get_css_filename_alt(SubLObject css_keyword) {
        return gethash(css_keyword, $css_definitions$.getGlobalValue(), UNPROVIDED).first();
    }

    public static SubLObject get_css_filename(final SubLObject keyword) {
        return get_external_dependency_filename(keyword);
    }

    public static final SubLObject css_file_path_alt(SubLObject css_keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject css_filename = com.cyc.cycjava.cycl.cyc_file_dependencies.get_css_filename(css_keyword);
                return cconcatenate(system_parameters.$html_css_directory$.getDynamicValue(thread), css_filename);
            }
        }
    }

    public static SubLObject css_file_path(final SubLObject keyword) {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), get_external_dependency_data(keyword));
    }

    public static SubLObject def_external_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject file_keyword = NIL;
        SubLObject path = NIL;
        SubLObject filename = NIL;
        SubLObject file_type = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        file_keyword = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        path = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        filename = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        file_type = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list27);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list27);
            if (NIL == member(current_$3, $list28, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list27);
        }
        final SubLObject dependencies_tail = property_list_member($DEPENDENCIES, current);
        final SubLObject dependencies = (NIL != dependencies_tail) ? cadr(dependencies_tail) : NIL;
        return list(PROGN, list(CHECK_EXTERNAL_FILE_DEFINITION, file_keyword, path, filename, file_type, dependencies), list(SETHASH, file_keyword, $external_file_definitions$, list(new SubLObject[]{ LIST, $PATH, path, $FILENAME, filename, $DEPENDENCIES, dependencies, $TYPE, file_type })));
    }

    public static SubLObject check_external_file_definition(final SubLObject file_keyword, final SubLObject path, final SubLObject filename, final SubLObject file_type, final SubLObject dependencies) {
        if (NIL != undefined_external_dependencies(dependencies)) {
            Errors.error($str34$Unable_to_define__S_because_of_un, file_keyword, undefined_external_dependencies(dependencies));
        } else
            if ((NIL != gethash(file_keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED)) && (NIL == redundant_dependencyP(path, filename, dependencies, gethash(file_keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED)))) {
                Errors.warn($str35$Redefinition_of_external_file__S_, new SubLObject[]{ file_keyword, gethash(file_keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED), filename, path, file_type, dependencies });
            }

        return NIL;
    }

    public static SubLObject emit_external_file_with_dependencies(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (($html_emitted_file_dependencies$.getDynamicValue(thread) != $UNINITIALIZED) && (NIL != subl_promotions.memberP(keyword, $html_emitted_file_dependencies$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED))) {
            return NIL;
        }
        if ($html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) {
            Errors.warn($str36$Emitting__S_with_no_html_file_dep, keyword);
        }
        thread.resetMultipleValues();
        final SubLObject file_path = get_external_dependency_data(keyword);
        final SubLObject file_type = thread.secondMultipleValue();
        final SubLObject dependencies = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = dependencies;
        SubLObject d = NIL;
        d = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            emit_external_file_with_dependencies(d);
            cdolist_list_var = cdolist_list_var.rest();
            d = cdolist_list_var.first();
        } 
        final SubLObject _prev_bind_0 = html_macros.$suppress_html_source_readability_terpriP$.currentBinding(thread);
        try {
            html_macros.$suppress_html_source_readability_terpriP$.bind(T, thread);
            final SubLObject pcase_var = file_type;
            if (pcase_var.eql($JS)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_script_head$.getGlobalValue());
                html_markup(html_macros.$html_script_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(file_path);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_script_type$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str37$text_javascript);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_markup(html_macros.$html_script_tail$.getGlobalValue());
            } else
                if (pcase_var.eql($CSS)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_link_head$.getGlobalValue());
                    html_markup(html_macros.$html_link_rel$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$stylesheet);
                    html_char(CHAR_quotation, UNPROVIDED);
                    if (NIL != file_path) {
                        html_markup(html_macros.$html_link_href$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(file_path);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_link_type$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str39$text_css);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                } else
                    if (!pcase_var.eql($BUNDLE)) {
                        Errors.error($str40$Unable_to_emit_file__S___S__of_ty, keyword, file_path, file_type);
                    }


        } finally {
            html_macros.$suppress_html_source_readability_terpriP$.rebind(_prev_bind_0, thread);
        }
        if ($html_emitted_file_dependencies$.getDynamicValue(thread) != $UNINITIALIZED) {
            $html_emitted_file_dependencies$.setDynamicValue(cons(keyword, $html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static SubLObject external_dependencies_of_type(final SubLObject type) {
        SubLObject keywords = NIL;
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($external_file_definitions$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                if (getf(val, $TYPE, UNPROVIDED).eql(type)) {
                    keywords = cons(key, keywords);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return keywords;
    }

    public static SubLObject get_external_dependency_filename(final SubLObject keyword) {
        return getf(gethash(keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED), $FILENAME, UNPROVIDED);
    }

    public static SubLObject undefined_external_dependencies(final SubLObject dependency_list) {
        SubLObject undefined = NIL;
        SubLObject cdolist_list_var = dependency_list;
        SubLObject dependency_keyword = NIL;
        dependency_keyword = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == external_dependency_definedP(dependency_keyword)) {
                undefined = cons(dependency_keyword, undefined);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dependency_keyword = cdolist_list_var.first();
        } 
        return undefined;
    }

    public static SubLObject external_dependency_definedP(final SubLObject keyword) {
        return gethash(keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject redundant_dependencyP(final SubLObject path, final SubLObject filename, final SubLObject dependencies, final SubLObject existing_definition) {
        return makeBoolean((getf(existing_definition, $FILENAME, UNPROVIDED).equal(filename) && getf(existing_definition, $PATH, UNPROVIDED).equal(path)) && getf(existing_definition, $DEPENDENCIES, UNPROVIDED).equal(dependencies));
    }

    public static SubLObject get_external_dependency_data(final SubLObject keyword) {
        final SubLObject file_def = gethash(keyword, $external_file_definitions$.getGlobalValue(), UNPROVIDED);
        final SubLObject path = getf(file_def, $PATH, UNPROVIDED);
        final SubLObject filename = getf(file_def, $FILENAME, UNPROVIDED);
        final SubLObject type = getf(file_def, $TYPE, UNPROVIDED);
        final SubLObject dependencies = getf(file_def, $DEPENDENCIES, UNPROVIDED);
        return values(doc_filepath(path, filename), type, dependencies);
    }

    public static SubLObject doc_filepath(final SubLObject relative_path, final SubLObject filename) {
        if ((!relative_path.isString()) || (!filename.isString())) {
            return NIL;
        }
        return file_utilities.relative_filename(cconcatenate(file_utilities.possibly_append_path_separator_char(system_parameters.cyc_documentation_url()), file_utilities.possibly_append_path_separator_char(relative_path)), filename, UNPROVIDED);
    }

    public static SubLObject ext_dep_ends_with(final SubLObject string, final SubLObject suffix) {
        final SubLObject str_length = length(string);
        final SubLObject suff_length = length(suffix);
        return makeBoolean(str_length.numGE(suff_length) && subseq(string, subtract(str_length, suff_length), UNPROVIDED).equal(suffix));
    }

    public static final SubLObject java_applet_lib_file_path_alt(SubLObject java_applet_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return cconcatenate(system_parameters.$http_htdocs_directory$.getDynamicValue(thread), new SubLObject[]{ $str_alt30$_, $java_default_directory$.getGlobalValue(), java_applet_name, $str_alt31$_lib_ });
        }
    }

    public static SubLObject java_applet_lib_file_path(final SubLObject java_applet_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cconcatenate(system_parameters.$http_htdocs_directory$.getDynamicValue(thread), new SubLObject[]{ $str45$_, $java_default_directory$.getGlobalValue(), java_applet_name, $str46$_lib_ });
    }

    public static final SubLObject java_applet_archive_string_alt(SubLObject java_applet_name) {
        {
            SubLObject jar_directory = com.cyc.cycjava.cycl.cyc_file_dependencies.java_applet_lib_file_path(java_applet_name);
            SubLObject filenames = Filesys.directory(jar_directory, UNPROVIDED);
            SubLObject lib_filenames = NIL;
            SubLObject cdolist_list_var = filenames;
            SubLObject filename = NIL;
            for (filename = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filename = cdolist_list_var.first()) {
                if (NIL != string_utilities.ends_with(filename, $$$jar, UNPROVIDED)) {
                    lib_filenames = cons(cconcatenate($str_alt33$lib_, filename), lib_filenames);
                }
            }
            return string_utilities.bunge(lib_filenames, CHAR_comma);
        }
    }

    public static SubLObject java_applet_archive_string(final SubLObject java_applet_name) {
        final SubLObject jar_directory = java_applet_lib_file_path(java_applet_name);
        final SubLObject filenames = Filesys.directory(jar_directory, UNPROVIDED);
        SubLObject lib_filenames = NIL;
        SubLObject cdolist_list_var = filenames;
        SubLObject filename = NIL;
        filename = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.ends_with(filename, $$$jar, UNPROVIDED)) {
                lib_filenames = cons(cconcatenate($str48$lib_, filename), lib_filenames);
            }
            cdolist_list_var = cdolist_list_var.rest();
            filename = cdolist_list_var.first();
        } 
        return string_utilities.bunge(lib_filenames, CHAR_comma);
    }

    public static final SubLObject html_icon_keywords_alt() {
        return hash_table_utilities.hash_table_keys($html_icon_definitions$.getGlobalValue());
    }

    public static SubLObject html_icon_keywords() {
        return hash_table_utilities.hash_table_keys($html_icon_definitions$.getGlobalValue());
    }

    /**
     *
     *
     * @param ICON-KEYWORD
     * 		;; keywordp; icon designator
     * @param FILENAME
     * 		;; stringp; Filename only (no directory) for graphic file
     * @param ALT-STRING
     * 		;; stringp; Alternate display string if browser can't show image
     * 		Delcares the html idon, ICON-KEYWORD.
     */
    @LispMethod(comment = "@param ICON-KEYWORD\r\n\t\t;; keywordp; icon designator\r\n@param FILENAME\r\n\t\t;; stringp; Filename only (no directory) for graphic file\r\n@param ALT-STRING\r\n\t\t;; stringp; Alternate display string if browser can\'t show image\r\n\t\tDelcares the html idon, ICON-KEYWORD.")
    public static final SubLObject def_html_icon_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject icon_keyword = NIL;
            SubLObject filename = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt35);
            icon_keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt35);
            filename = current.first();
            current = current.rest();
            {
                SubLObject alt_string = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt35);
                current = current.rest();
                if (NIL == current) {
                    return list(SETHASH, icon_keyword, $html_icon_definitions$, list(LIST, filename, alt_string));
                } else {
                    cdestructuring_bind_error(datum, $list_alt35);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param ICON-KEYWORD
     * 		;; keywordp; icon designator
     * @param FILENAME
     * 		;; stringp; Filename only (no directory) for graphic file
     * @param ALT-STRING
     * 		;; stringp; Alternate display string if browser can't show image
     * 		Delcares the html idon, ICON-KEYWORD.
     */
    @LispMethod(comment = "@param ICON-KEYWORD\r\n\t\t;; keywordp; icon designator\r\n@param FILENAME\r\n\t\t;; stringp; Filename only (no directory) for graphic file\r\n@param ALT-STRING\r\n\t\t;; stringp; Alternate display string if browser can\'t show image\r\n\t\tDelcares the html idon, ICON-KEYWORD.")
    public static SubLObject def_html_icon(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject icon_keyword = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list51);
        icon_keyword = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list51);
        filename = current.first();
        current = current.rest();
        final SubLObject alt_string = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list51);
        current = current.rest();
        if (NIL == current) {
            return list(SETHASH, icon_keyword, $html_icon_definitions$, list(LIST, filename, alt_string));
        }
        cdestructuring_bind_error(datum, $list51);
        return NIL;
    }

    public static final SubLObject get_html_icon_filename_alt(SubLObject icon_keyword) {
        return gethash(icon_keyword, $html_icon_definitions$.getGlobalValue(), UNPROVIDED).first();
    }

    public static SubLObject get_html_icon_filename(final SubLObject icon_keyword) {
        return gethash(icon_keyword, $html_icon_definitions$.getGlobalValue(), UNPROVIDED).first();
    }

    public static final SubLObject get_html_icon_alt_string_alt(SubLObject icon_keyword) {
        return second(gethash(icon_keyword, $html_icon_definitions$.getGlobalValue(), UNPROVIDED));
    }

    public static SubLObject get_html_icon_alt_string(final SubLObject icon_keyword) {
        return second(gethash(icon_keyword, $html_icon_definitions$.getGlobalValue(), UNPROVIDED));
    }

    public static final SubLObject html_icon_existsP_alt(SubLObject icon_keyword) {
        return string_utilities.non_empty_stringP(com.cyc.cycjava.cycl.cyc_file_dependencies.get_html_icon_filename(icon_keyword));
    }

    public static SubLObject html_icon_existsP(final SubLObject icon_keyword) {
        return string_utilities.non_empty_stringP(get_html_icon_filename(icon_keyword));
    }

    public static final SubLObject html_missing_icon_alt() {
        return $html_missing_icon$.getGlobalValue();
    }

    public static SubLObject html_missing_icon() {
        return $html_missing_icon$.getGlobalValue();
    }

    public static final SubLObject html_icon_file_path_alt(SubLObject icon_keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject icon_filename = com.cyc.cycjava.cycl.cyc_file_dependencies.get_html_icon_filename(icon_keyword);
                return cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), new SubLObject[]{ $html_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? ((SubLObject) (icon_filename)) : com.cyc.cycjava.cycl.cyc_file_dependencies.html_missing_icon() });
            }
        }
    }

    public static SubLObject html_icon_file_path(final SubLObject icon_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject icon_filename = get_html_icon_filename(icon_keyword);
        return cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), new SubLObject[]{ $html_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : html_missing_icon() });
    }

    /**
     * Returns path to the image source for ICON-KEYWORD, relative to the image
     * root directory.
     */
    @LispMethod(comment = "Returns path to the image source for ICON-KEYWORD, relative to the image\r\nroot directory.\nReturns path to the image source for ICON-KEYWORD, relative to the image\nroot directory.")
    public static final SubLObject html_icon_src_alt(SubLObject icon_keyword) {
        {
            SubLObject icon_filename = com.cyc.cycjava.cycl.cyc_file_dependencies.get_html_icon_filename(icon_keyword);
            return cconcatenate($html_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? ((SubLObject) (icon_filename)) : com.cyc.cycjava.cycl.cyc_file_dependencies.html_missing_icon());
        }
    }

    /**
     * Returns path to the image source for ICON-KEYWORD, relative to the image
     * root directory.
     */
    @LispMethod(comment = "Returns path to the image source for ICON-KEYWORD, relative to the image\r\nroot directory.\nReturns path to the image source for ICON-KEYWORD, relative to the image\nroot directory.")
    public static SubLObject html_icon_src(final SubLObject icon_keyword) {
        final SubLObject icon_filename = get_html_icon_filename(icon_keyword);
        return cconcatenate($html_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : html_missing_icon());
    }

    public static final SubLObject html_icon_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject icon_keyword = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt38);
            icon_keyword = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_3 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt38);
                    current_3 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt38);
                    if (NIL == member(current_3, $list_alt39, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_3 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt38);
                }
                {
                    SubLObject name_tail = property_list_member($NAME, current);
                    SubLObject name = (NIL != name_tail) ? ((SubLObject) (cadr(name_tail))) : NIL;
                    SubLObject ismap_tail = property_list_member($ISMAP, current);
                    SubLObject ismap = (NIL != ismap_tail) ? ((SubLObject) (cadr(ismap_tail))) : NIL;
                    SubLObject height_tail = property_list_member($HEIGHT, current);
                    SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : NIL;
                    SubLObject width_tail = property_list_member($WIDTH, current);
                    SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : NIL;
                    SubLObject alt_override_tail = property_list_member($ALT_OVERRIDE, current);
                    SubLObject alt_override = (NIL != alt_override_tail) ? ((SubLObject) (cadr(alt_override_tail))) : NIL;
                    SubLObject align_override_tail = property_list_member($ALIGN_OVERRIDE, current);
                    SubLObject align_override = (NIL != align_override_tail) ? ((SubLObject) (cadr(align_override_tail))) : NIL;
                    SubLObject border_override_tail = property_list_member($BORDER_OVERRIDE, current);
                    SubLObject border_override = (NIL != border_override_tail) ? ((SubLObject) (cadr(border_override_tail))) : NIL;
                    SubLObject image_src = $sym47$IMAGE_SRC;
                    SubLObject align = $sym48$ALIGN;
                    SubLObject alt = $sym49$ALT;
                    SubLObject border = $sym50$BORDER;
                    return list(CLET, list(list(image_src, list(CCONCATENATE, $html_image_directory$, list(HTML_ICON_SRC, icon_keyword))), list(align, listS(FIF, align_override, align_override, $list_alt55)), list(alt, list(FIF, alt_override, alt_override, list(GET_HTML_ICON_ALT_STRING, icon_keyword))), list(border, listS(FIF, border_override, border_override, $list_alt57))), list(new SubLObject[]{ HTML_FANCY_IMAGE, image_src, $NAME, name, $ISMAP, ismap, $HEIGHT, height, $WIDTH, width, $ALT, alt, $ALIGN, align, $BORDER, border }));
                }
            }
        }
    }

    public static SubLObject html_icon(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject icon_keyword = NIL;
        destructuring_bind_must_consp(current, datum, $list54);
        icon_keyword = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list54);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list54);
            if (NIL == member(current_$5, $list55, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list54);
        }
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject ismap_tail = property_list_member($ISMAP, current);
        final SubLObject ismap = (NIL != ismap_tail) ? cadr(ismap_tail) : NIL;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject alt_override_tail = property_list_member($ALT_OVERRIDE, current);
        final SubLObject alt_override = (NIL != alt_override_tail) ? cadr(alt_override_tail) : NIL;
        final SubLObject align_override_tail = property_list_member($ALIGN_OVERRIDE, current);
        final SubLObject align_override = (NIL != align_override_tail) ? cadr(align_override_tail) : NIL;
        final SubLObject border_override_tail = property_list_member($BORDER_OVERRIDE, current);
        final SubLObject border_override = (NIL != border_override_tail) ? cadr(border_override_tail) : NIL;
        final SubLObject image_src = $sym64$IMAGE_SRC;
        final SubLObject align = $sym65$ALIGN;
        final SubLObject alt = $sym66$ALT;
        final SubLObject border = $sym67$BORDER;
        return list(CLET, list(list(image_src, list(CCONCATENATE, $html_image_directory$, list(HTML_ICON_SRC, icon_keyword))), list(align, listS(FIF, align_override, align_override, $list72)), list(alt, list(FIF, alt_override, alt_override, list(GET_HTML_ICON_ALT_STRING, icon_keyword))), list(border, listS(FIF, border_override, border_override, $list74))), list(new SubLObject[]{ HTML_FANCY_IMAGE, image_src, $ID, id, $NAME, name, $ISMAP, ismap, $HEIGHT, height, $WIDTH, width, $ALT, alt, $ALIGN, align, $BORDER, border }));
    }

    public static final SubLObject cb_help_keywords_alt() {
        return hash_table_utilities.hash_table_keys($cb_help_definitions$.getGlobalValue());
    }

    public static SubLObject cb_help_keywords() {
        return hash_table_utilities.hash_table_keys($cb_help_definitions$.getGlobalValue());
    }

    public static final SubLObject def_cb_help_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject help_keyword = NIL;
            SubLObject filename = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt63);
            help_keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt63);
            filename = current.first();
            current = current.rest();
            {
                SubLObject desc_string = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt63);
                current = current.rest();
                if (NIL == current) {
                    return list(SETHASH, help_keyword, $cb_help_definitions$, list(LIST, filename, desc_string));
                } else {
                    cdestructuring_bind_error(datum, $list_alt63);
                }
            }
        }
        return NIL;
    }

    public static SubLObject def_cb_help(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject help_keyword = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list80);
        help_keyword = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        filename = current.first();
        current = current.rest();
        final SubLObject desc_string = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list80);
        current = current.rest();
        if (NIL == current) {
            return list(SETHASH, help_keyword, $cb_help_definitions$, list(LIST, filename, desc_string));
        }
        cdestructuring_bind_error(datum, $list80);
        return NIL;
    }

    public static final SubLObject cb_get_help_filename_alt(SubLObject help_keyword) {
        return gethash(help_keyword, $cb_help_definitions$.getGlobalValue(), UNPROVIDED).first();
    }

    public static SubLObject cb_get_help_filename(final SubLObject help_keyword) {
        return gethash(help_keyword, $cb_help_definitions$.getGlobalValue(), UNPROVIDED).first();
    }

    public static final SubLObject cb_get_help_desc_string_alt(SubLObject help_keyword) {
        return second(gethash(help_keyword, $cb_help_definitions$.getGlobalValue(), UNPROVIDED));
    }

    public static SubLObject cb_get_help_desc_string(final SubLObject help_keyword) {
        return second(gethash(help_keyword, $cb_help_definitions$.getGlobalValue(), UNPROVIDED));
    }

    public static final SubLObject cb_help_existsP_alt(SubLObject help_keyword) {
        return string_utilities.non_empty_stringP(com.cyc.cycjava.cycl.cyc_file_dependencies.cb_get_help_filename(help_keyword));
    }

    public static SubLObject cb_help_existsP(final SubLObject help_keyword) {
        return string_utilities.non_empty_stringP(cb_get_help_filename(help_keyword));
    }

    public static final SubLObject cb_help_file_path_alt(SubLObject help_keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject help_filename = com.cyc.cycjava.cycl.cyc_file_dependencies.cb_get_help_filename(help_keyword);
                if (!help_filename.isString()) {
                    Errors.warn($str_alt65$Help_file_not_found_for__A, help_keyword);
                }
                return cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), new SubLObject[]{ $str_alt64$help_, format_nil.format_nil_a_no_copy(help_filename) });
            }
        }
    }

    public static SubLObject cb_help_file_path(final SubLObject help_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject help_filename = cb_get_help_filename(help_keyword);
        if (!help_filename.isString()) {
            Errors.warn($str82$Help_file_not_found_for__A, help_keyword);
        }
        return cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), new SubLObject[]{ $str81$help_, format_nil.format_nil_a_no_copy(help_filename) });
    }

    public static final SubLObject cb_icon_keywords_alt() {
        return hash_table_utilities.hash_table_keys($cb_icon_definitions$.getGlobalValue());
    }

    public static SubLObject cb_icon_keywords() {
        return hash_table_utilities.hash_table_keys($cb_icon_definitions$.getGlobalValue());
    }

    public static final SubLObject def_cb_icon_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject icon_keyword = NIL;
            SubLObject filename = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt35);
            icon_keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt35);
            filename = current.first();
            current = current.rest();
            {
                SubLObject alt_string = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt35);
                current = current.rest();
                if (NIL == current) {
                    return list(SETHASH, icon_keyword, $cb_icon_definitions$, list(LIST, filename, alt_string));
                } else {
                    cdestructuring_bind_error(datum, $list_alt35);
                }
            }
        }
        return NIL;
    }

    public static SubLObject def_cb_icon(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject icon_keyword = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list51);
        icon_keyword = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list51);
        filename = current.first();
        current = current.rest();
        final SubLObject alt_string = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list51);
        current = current.rest();
        if (NIL == current) {
            return list(SETHASH, icon_keyword, $cb_icon_definitions$, list(LIST, filename, alt_string));
        }
        cdestructuring_bind_error(datum, $list51);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("JAVASCRIPT-KEYWORD"), makeSymbol("FILENAME"), makeSymbol("&OPTIONAL"), makeSymbol("ALT-STRING"));

    static private final SubLString $str_alt5$missing_js = makeString("missing.js");

    public static final SubLObject cb_get_icon_filename_alt(SubLObject icon_keyword) {
        return gethash(icon_keyword, $cb_icon_definitions$.getGlobalValue(), UNPROVIDED).first();
    }

    public static SubLObject cb_get_icon_filename(final SubLObject icon_keyword) {
        return gethash(icon_keyword, $cb_icon_definitions$.getGlobalValue(), UNPROVIDED).first();
    }

    static private final SubLList $list_alt6 = list(makeSymbol("JAVASCRIPT-KEYWORD"), makeSymbol("&KEY"), list(makeSymbol("TYPE"), makeString("text/javascript")), makeSymbol("LANGUAGE"));

    public static final SubLObject cb_get_icon_alt_string_alt(SubLObject icon_keyword) {
        return second(gethash(icon_keyword, $cb_icon_definitions$.getGlobalValue(), UNPROVIDED));
    }

    public static SubLObject cb_get_icon_alt_string(final SubLObject icon_keyword) {
        return second(gethash(icon_keyword, $cb_icon_definitions$.getGlobalValue(), UNPROVIDED));
    }

    static private final SubLList $list_alt7 = list($TYPE, makeKeyword("LANGUAGE"));

    public static final SubLObject cb_icon_existsP_alt(SubLObject icon_keyword) {
        return string_utilities.non_empty_stringP(com.cyc.cycjava.cycl.cyc_file_dependencies.cb_get_icon_filename(icon_keyword));
    }

    public static SubLObject cb_icon_existsP(final SubLObject icon_keyword) {
        return string_utilities.non_empty_stringP(cb_get_icon_filename(icon_keyword));
    }

    static private final SubLString $str_alt10$text_javascript = makeString("text/javascript");

    static private final SubLSymbol $sym12$JAVASCRIPT_SRC = makeUninternedSymbol("JAVASCRIPT-SRC");

    public static final SubLObject cb_missing_icon_alt() {
        return $cb_missing_icon$.getGlobalValue();
    }

    public static SubLObject cb_missing_icon() {
        return $cb_missing_icon$.getGlobalValue();
    }

    public static final SubLObject cb_icon_file_path_alt(SubLObject icon_keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject icon_filename = com.cyc.cycjava.cycl.cyc_file_dependencies.cb_get_icon_filename(icon_keyword);
                return cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), new SubLObject[]{ $cb_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? ((SubLObject) (icon_filename)) : $cb_missing_icon$.getGlobalValue() });
            }
        }
    }

    public static SubLObject cb_icon_file_path(final SubLObject icon_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject icon_filename = cb_get_icon_filename(icon_keyword);
        return cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), new SubLObject[]{ $cb_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : $cb_missing_icon$.getGlobalValue() });
    }

    private static final SubLSymbol HTML_FANCY_SCRIPT = makeSymbol("HTML-FANCY-SCRIPT");

    static private final SubLList $list_alt18 = list(makeSymbol("CSS-KEYWORD"), makeSymbol("FILENAME"), makeSymbol("&OPTIONAL"), makeSymbol("ALT-STRING"));

    static private final SubLString $str_alt19$missing_css = makeString("missing.css");

    public static final SubLObject cb_icon_src_alt(SubLObject icon_keyword) {
        {
            SubLObject icon_filename = com.cyc.cycjava.cycl.cyc_file_dependencies.cb_get_icon_filename(icon_keyword);
            return cconcatenate($cb_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? ((SubLObject) (icon_filename)) : $cb_missing_icon$.getGlobalValue());
        }
    }

    public static SubLObject cb_icon_src(final SubLObject icon_keyword) {
        final SubLObject icon_filename = cb_get_icon_filename(icon_keyword);
        return cconcatenate($cb_icon_default_directory$.getGlobalValue(), icon_filename.isString() ? icon_filename : $cb_missing_icon$.getGlobalValue());
    }

    static private final SubLList $list_alt20 = list(makeSymbol("CSS-KEYWORD"), makeSymbol("&KEY"), list(makeSymbol("TYPE"), makeString("text/css")), list(makeSymbol("REL"), makeString("stylesheet")));

    static private final SubLList $list_alt21 = list($TYPE, makeKeyword("REL"));

    public static final SubLObject cb_icon_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject icon_keyword = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt38);
            icon_keyword = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_4 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt38);
                    current_4 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt38);
                    if (NIL == member(current_4, $list_alt39, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_4 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt38);
                }
                {
                    SubLObject name_tail = property_list_member($NAME, current);
                    SubLObject name = (NIL != name_tail) ? ((SubLObject) (cadr(name_tail))) : NIL;
                    SubLObject ismap_tail = property_list_member($ISMAP, current);
                    SubLObject ismap = (NIL != ismap_tail) ? ((SubLObject) (cadr(ismap_tail))) : NIL;
                    SubLObject height_tail = property_list_member($HEIGHT, current);
                    SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : NIL;
                    SubLObject width_tail = property_list_member($WIDTH, current);
                    SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : NIL;
                    SubLObject alt_override_tail = property_list_member($ALT_OVERRIDE, current);
                    SubLObject alt_override = (NIL != alt_override_tail) ? ((SubLObject) (cadr(alt_override_tail))) : NIL;
                    SubLObject align_override_tail = property_list_member($ALIGN_OVERRIDE, current);
                    SubLObject align_override = (NIL != align_override_tail) ? ((SubLObject) (cadr(align_override_tail))) : NIL;
                    SubLObject border_override_tail = property_list_member($BORDER_OVERRIDE, current);
                    SubLObject border_override = (NIL != border_override_tail) ? ((SubLObject) (cadr(border_override_tail))) : NIL;
                    SubLObject image_src = $sym68$IMAGE_SRC;
                    SubLObject align = $sym69$ALIGN;
                    SubLObject alt = $sym70$ALT;
                    SubLObject border = $sym71$BORDER;
                    return list(CLET, list(list(image_src, list(CB_ICON_FILE_PATH, icon_keyword)), list(align, listS(FIF, align_override, align_override, $list_alt73)), list(alt, list(FIF, alt_override, alt_override, list(CB_GET_ICON_ALT_STRING, icon_keyword))), list(border, listS(FIF, border_override, border_override, $list_alt57))), list(new SubLObject[]{ HTML_FANCY_IMAGE, image_src, $NAME, name, $ISMAP, ismap, $HEIGHT, height, $WIDTH, width, $ALT, alt, $ALIGN, align, $BORDER, border }));
                }
            }
        }
    }

    public static SubLObject cb_icon(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject icon_keyword = NIL;
        destructuring_bind_must_consp(current, datum, $list85);
        icon_keyword = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list85);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list85);
            if (NIL == member(current_$6, $list86, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list85);
        }
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject ismap_tail = property_list_member($ISMAP, current);
        final SubLObject ismap = (NIL != ismap_tail) ? cadr(ismap_tail) : NIL;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject alt_override_tail = property_list_member($ALT_OVERRIDE, current);
        final SubLObject alt_override = (NIL != alt_override_tail) ? cadr(alt_override_tail) : NIL;
        final SubLObject align_override_tail = property_list_member($ALIGN_OVERRIDE, current);
        final SubLObject align_override = (NIL != align_override_tail) ? cadr(align_override_tail) : NIL;
        final SubLObject border_override_tail = property_list_member($BORDER_OVERRIDE, current);
        final SubLObject border_override = (NIL != border_override_tail) ? cadr(border_override_tail) : NIL;
        final SubLObject image_src = $sym87$IMAGE_SRC;
        final SubLObject align = $sym88$ALIGN;
        final SubLObject alt = $sym89$ALT;
        final SubLObject border = $sym90$BORDER;
        return list(CLET, list(list(image_src, list(CB_ICON_FILE_PATH, icon_keyword)), list(align, listS(FIF, align_override, align_override, $list92)), list(alt, list(FIF, alt_override, alt_override, list(CB_GET_ICON_ALT_STRING, icon_keyword))), list(border, listS(FIF, border_override, border_override, $list74))), list(new SubLObject[]{ HTML_FANCY_IMAGE, image_src, $NAME, name, $ISMAP, ismap, $HEIGHT, height, $WIDTH, width, $ALT, alt, $ALIGN, align, $BORDER, border }));
    }

    static private final SubLString $str_alt22$text_css = makeString("text/css");

    static private final SubLSymbol $sym25$CSS_HREF = makeUninternedSymbol("CSS-HREF");

    private static final SubLSymbol HTML_FANCY_LINK = makeSymbol("HTML-FANCY-LINK");

    static private final SubLString $str_alt29$java_ = makeString("java/");

    static private final SubLString $str_alt30$_ = makeString("/");

    static private final SubLString $str_alt31$_lib_ = makeString("/lib/");

    static private final SubLString $str_alt33$lib_ = makeString("lib/");

    static private final SubLList $list_alt35 = list(makeSymbol("ICON-KEYWORD"), makeSymbol("FILENAME"), makeSymbol("&OPTIONAL"), makeSymbol("ALT-STRING"));

    static private final SubLString $str_alt37$missing_gif = makeString("missing.gif");

    static private final SubLList $list_alt38 = list(new SubLObject[]{ makeSymbol("ICON-KEYWORD"), makeSymbol("&KEY"), makeSymbol("NAME"), makeSymbol("ISMAP"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("ALT-OVERRIDE"), makeSymbol("ALIGN-OVERRIDE"), makeSymbol("BORDER-OVERRIDE") });

    static private final SubLList $list_alt39 = list($NAME, makeKeyword("ISMAP"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("ALT-OVERRIDE"), makeKeyword("ALIGN-OVERRIDE"), makeKeyword("BORDER-OVERRIDE"));

    static private final SubLSymbol $sym47$IMAGE_SRC = makeUninternedSymbol("IMAGE-SRC");

    static private final SubLSymbol $sym48$ALIGN = makeUninternedSymbol("ALIGN");

    static private final SubLSymbol $sym49$ALT = makeUninternedSymbol("ALT");

    static private final SubLSymbol $sym50$BORDER = makeUninternedSymbol("BORDER");

    static private final SubLList $list_alt55 = list(makeKeyword("CENTER"));

    static private final SubLList $list_alt57 = list(ZERO_INTEGER);

    static private final SubLList $list_alt63 = list(makeSymbol("HELP-KEYWORD"), makeSymbol("FILENAME"), makeSymbol("&OPTIONAL"), makeSymbol("DESC-STRING"));

    static private final SubLString $str_alt64$help_ = makeString("help/");

    static private final SubLString $str_alt65$Help_file_not_found_for__A = makeString("Help file not found for ~A");

    /**
     * Compile a list of strings that reflect the CYC browser's dependencies.
     */
    @LispMethod(comment = "Compile a list of strings that reflect the CYC browser\'s dependencies.")
    public static final SubLObject compile_cb_browser_dependencies_alt(SubLObject justify) {
        if (justify == UNPROVIDED) {
            justify = NIL;
        }
        {
            SubLObject keyword_definitions = com.cyc.cycjava.cycl.cyc_file_dependencies.compile_cb_browser_dependency_definitions();
            SubLObject paths = NIL;
            SubLObject cdolist_list_var = keyword_definitions;
            SubLObject keyword_definition = NIL;
            for (keyword_definition = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyword_definition = cdolist_list_var.first()) {
                {
                    SubLObject datum = keyword_definition;
                    SubLObject current = datum;
                    SubLObject keyword_producer = NIL;
                    SubLObject keyword_mapping_fn = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    keyword_producer = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    keyword_mapping_fn = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject keywords = funcall(keyword_producer);
                            SubLObject cdolist_list_var_5 = keywords;
                            SubLObject keyword = NIL;
                            for (keyword = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , keyword = cdolist_list_var_5.first()) {
                                {
                                    SubLObject file_path = com.cyc.cycjava.cycl.cyc_file_dependencies.cb_browser_dependency_map_keyword_to_path(keyword, keyword_mapping_fn);
                                    SubLObject datum_6 = (NIL != justify) ? ((SubLObject) (list(file_path, keyword, keyword_producer))) : file_path;
                                    paths = cons(datum_6, paths);
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt76);
                    }
                }
            }
            return nreverse(paths);
        }
    }

    /**
     * Compile a list of strings that reflect the CYC browser's dependencies.
     */
    @LispMethod(comment = "Compile a list of strings that reflect the CYC browser\'s dependencies.")
    public static SubLObject compile_cb_browser_dependencies(SubLObject justify) {
        if (justify == UNPROVIDED) {
            justify = NIL;
        }
        final SubLObject keyword_definitions = compile_cb_browser_dependency_definitions();
        SubLObject paths = NIL;
        SubLObject cdolist_list_var = keyword_definitions;
        SubLObject keyword_definition = NIL;
        keyword_definition = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = keyword_definition;
            SubLObject keyword_producer = NIL;
            SubLObject keyword_mapping_fn = NIL;
            destructuring_bind_must_consp(current, datum, $list95);
            keyword_producer = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list95);
            keyword_mapping_fn = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$7;
                final SubLObject keywords = cdolist_list_var_$7 = funcall(keyword_producer);
                SubLObject keyword = NIL;
                keyword = cdolist_list_var_$7.first();
                while (NIL != cdolist_list_var_$7) {
                    final SubLObject file_path = cb_browser_dependency_map_keyword_to_path(keyword, keyword_mapping_fn);
                    final SubLObject datum_$8 = (NIL != justify) ? list(file_path, keyword, keyword_producer) : file_path;
                    paths = cons(datum_$8, paths);
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    keyword = cdolist_list_var_$7.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list95);
            }
            cdolist_list_var = cdolist_list_var.rest();
            keyword_definition = cdolist_list_var.first();
        } 
        return nreverse(paths);
    }

    static private final SubLString $str_alt67$cb_ = makeString("cb/");

    static private final SubLSymbol $sym68$IMAGE_SRC = makeUninternedSymbol("IMAGE-SRC");

    static private final SubLSymbol $sym69$ALIGN = makeUninternedSymbol("ALIGN");

    static private final SubLSymbol $sym70$ALT = makeUninternedSymbol("ALT");

    static private final SubLSymbol $sym71$BORDER = makeUninternedSymbol("BORDER");

    static private final SubLList $list_alt73 = list(makeKeyword("TOP"));

    static private final SubLList $list_alt76 = list(makeSymbol("KEYWORD-PRODUCER"), makeSymbol("KEYWORD-MAPPING-FN"));

    public static final SubLObject compile_cb_browser_dependency_definitions_alt() {
        {
            SubLObject keyword_definitions = NIL;
            keyword_definitions = cons(list(JAVASCRIPT_KEYWORDS, JAVASCRIPT_FILE_PATH), keyword_definitions);
            keyword_definitions = cons(list(HTML_ICON_KEYWORDS, HTML_ICON_FILE_PATH), keyword_definitions);
            keyword_definitions = cons(list(CB_HELP_KEYWORDS, CB_HELP_FILE_PATH), keyword_definitions);
            keyword_definitions = cons(list(CB_ICON_KEYWORDS, CB_ICON_FILE_PATH), keyword_definitions);
            return nreverse(keyword_definitions);
        }
    }

    public static SubLObject compile_cb_browser_dependency_definitions() {
        SubLObject keyword_definitions = NIL;
        keyword_definitions = cons(list(JAVASCRIPT_KEYWORDS, JAVASCRIPT_FILE_PATH), keyword_definitions);
        keyword_definitions = cons(list(HTML_ICON_KEYWORDS, HTML_ICON_FILE_PATH), keyword_definitions);
        keyword_definitions = cons(list(CB_HELP_KEYWORDS, CB_HELP_FILE_PATH), keyword_definitions);
        keyword_definitions = cons(list(CB_ICON_KEYWORDS, CB_ICON_FILE_PATH), keyword_definitions);
        keyword_definitions = cons(list(CSS_KEYWORDS, CSS_FILE_PATH), keyword_definitions);
        return nreverse(keyword_definitions);
    }

    public static final SubLObject cb_browser_dependency_map_keyword_to_path_alt(SubLObject keyword, SubLObject mapping_fn) {
        {
            SubLObject file_path = funcall(mapping_fn, keyword);
            if (NIL != charE(CHAR_slash, string_utilities.first_char(file_path))) {
                file_path = string_utilities.strip_first(file_path);
            }
            return file_path;
        }
    }

    public static SubLObject cb_browser_dependency_map_keyword_to_path(final SubLObject keyword, final SubLObject mapping_fn) {
        SubLObject file_path = funcall(mapping_fn, keyword);
        if (NIL != charE(CHAR_slash, string_utilities.first_char(file_path))) {
            file_path = string_utilities.strip_first(file_path);
        }
        return file_path;
    }

    /**
     * Print a list of files that the Cyc browser depends on to STREAM.  This is generally what should be accessible inside the http/htdocs directory inside the run directory.
     */
    @LispMethod(comment = "Print a list of files that the Cyc browser depends on to STREAM.  This is generally what should be accessible inside the http/htdocs directory inside the run directory.")
    public static final SubLObject cb_browser_dependency_manifest_alt(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.cyc_file_dependencies.compile_cb_browser_dependencies(UNPROVIDED);
            SubLObject path = NIL;
            for (path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , path = cdolist_list_var.first()) {
                write_string(path, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
            }
        }
        return NIL;
    }

    /**
     * Print a list of files that the Cyc browser depends on to STREAM.  This is generally what should be accessible inside the http/htdocs directory inside the run directory.
     */
    @LispMethod(comment = "Print a list of files that the Cyc browser depends on to STREAM.  This is generally what should be accessible inside the http/htdocs directory inside the run directory.")
    public static SubLObject cb_browser_dependency_manifest(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = compile_cb_browser_dependencies(UNPROVIDED);
        SubLObject path = NIL;
        path = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_string(path, stream, UNPROVIDED, UNPROVIDED);
            terpri(stream);
            cdolist_list_var = cdolist_list_var.rest();
            path = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject declare_cyc_file_dependencies_file_alt() {
        declareFunction("javascript_keywords", "JAVASCRIPT-KEYWORDS", 0, 0, false);
        declareMacro("def_javascript", "DEF-JAVASCRIPT");
        declareFunction("get_javascript_filename", "GET-JAVASCRIPT-FILENAME", 1, 0, false);
        declareFunction("get_javascript_alt_string", "GET-JAVASCRIPT-ALT-STRING", 1, 0, false);
        declareFunction("javascript_existsP", "JAVASCRIPT-EXISTS?", 1, 0, false);
        declareFunction("missing_javascript", "MISSING-JAVASCRIPT", 0, 0, false);
        declareFunction("javascript_file_path", "JAVASCRIPT-FILE-PATH", 1, 0, false);
        declareMacro("javascript", "JAVASCRIPT");
        declareFunction("css_keywords", "CSS-KEYWORDS", 0, 0, false);
        declareMacro("def_css", "DEF-CSS");
        declareFunction("get_css_filename", "GET-CSS-FILENAME", 1, 0, false);
        declareFunction("get_css_alt_string", "GET-CSS-ALT-STRING", 1, 0, false);
        declareFunction("css_existsP", "CSS-EXISTS?", 1, 0, false);
        declareFunction("missing_css", "MISSING-CSS", 0, 0, false);
        declareFunction("css_file_path", "CSS-FILE-PATH", 1, 0, false);
        declareMacro("css", "CSS");
        declareFunction("java_applet_lib_file_path", "JAVA-APPLET-LIB-FILE-PATH", 1, 0, false);
        declareFunction("java_applet_archive_string", "JAVA-APPLET-ARCHIVE-STRING", 1, 0, false);
        declareFunction("html_icon_keywords", "HTML-ICON-KEYWORDS", 0, 0, false);
        declareMacro("def_html_icon", "DEF-HTML-ICON");
        declareFunction("get_html_icon_filename", "GET-HTML-ICON-FILENAME", 1, 0, false);
        declareFunction("get_html_icon_alt_string", "GET-HTML-ICON-ALT-STRING", 1, 0, false);
        declareFunction("html_icon_existsP", "HTML-ICON-EXISTS?", 1, 0, false);
        declareFunction("html_missing_icon", "HTML-MISSING-ICON", 0, 0, false);
        declareFunction("html_icon_file_path", "HTML-ICON-FILE-PATH", 1, 0, false);
        declareFunction("html_icon_src", "HTML-ICON-SRC", 1, 0, false);
        declareMacro("html_icon", "HTML-ICON");
        declareFunction("cb_help_keywords", "CB-HELP-KEYWORDS", 0, 0, false);
        declareMacro("def_cb_help", "DEF-CB-HELP");
        declareFunction("cb_get_help_filename", "CB-GET-HELP-FILENAME", 1, 0, false);
        declareFunction("cb_get_help_desc_string", "CB-GET-HELP-DESC-STRING", 1, 0, false);
        declareFunction("cb_help_existsP", "CB-HELP-EXISTS?", 1, 0, false);
        declareFunction("cb_help_file_path", "CB-HELP-FILE-PATH", 1, 0, false);
        declareFunction("cb_icon_keywords", "CB-ICON-KEYWORDS", 0, 0, false);
        declareMacro("def_cb_icon", "DEF-CB-ICON");
        declareFunction("cb_get_icon_filename", "CB-GET-ICON-FILENAME", 1, 0, false);
        declareFunction("cb_get_icon_alt_string", "CB-GET-ICON-ALT-STRING", 1, 0, false);
        declareFunction("cb_icon_existsP", "CB-ICON-EXISTS?", 1, 0, false);
        declareFunction("cb_missing_icon", "CB-MISSING-ICON", 0, 0, false);
        declareFunction("cb_icon_file_path", "CB-ICON-FILE-PATH", 1, 0, false);
        declareFunction("cb_icon_src", "CB-ICON-SRC", 1, 0, false);
        declareMacro("cb_icon", "CB-ICON");
        declareFunction("compile_cb_browser_dependencies", "COMPILE-CB-BROWSER-DEPENDENCIES", 0, 1, false);
        declareFunction("compile_cb_browser_dependency_definitions", "COMPILE-CB-BROWSER-DEPENDENCY-DEFINITIONS", 0, 0, false);
        declareFunction("cb_browser_dependency_map_keyword_to_path", "CB-BROWSER-DEPENDENCY-MAP-KEYWORD-TO-PATH", 2, 0, false);
        declareFunction("cb_browser_dependency_manifest", "CB-BROWSER-DEPENDENCY-MANIFEST", 0, 1, false);
        return NIL;
    }

    public static SubLObject declare_cyc_file_dependencies_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("with_new_html_file_dependency_space", "WITH-NEW-HTML-FILE-DEPENDENCY-SPACE");
            declareMacro("with_possibly_new_html_file_dependency_space", "WITH-POSSIBLY-NEW-HTML-FILE-DEPENDENCY-SPACE");
            declareFunction("web_bundle", "WEB-BUNDLE", 1, 0, false);
            declareMacro("def_web_bundle", "DEF-WEB-BUNDLE");
            declareFunction("javascript", "JAVASCRIPT", 1, 0, false);
            declareMacro("def_javascript", "DEF-JAVASCRIPT");
            declareFunction("javascript_keywords", "JAVASCRIPT-KEYWORDS", 0, 0, false);
            declareFunction("get_javascript_filename", "GET-JAVASCRIPT-FILENAME", 1, 0, false);
            declareFunction("javascript_file_path", "JAVASCRIPT-FILE-PATH", 1, 0, false);
            declareFunction("css", "CSS", 1, 0, false);
            declareMacro("def_css", "DEF-CSS");
            declareFunction("css_keywords", "CSS-KEYWORDS", 0, 0, false);
            declareFunction("get_css_filename", "GET-CSS-FILENAME", 1, 0, false);
            declareFunction("css_file_path", "CSS-FILE-PATH", 1, 0, false);
            declareMacro("def_external_file", "DEF-EXTERNAL-FILE");
            declareFunction("check_external_file_definition", "CHECK-EXTERNAL-FILE-DEFINITION", 5, 0, false);
            declareFunction("emit_external_file_with_dependencies", "EMIT-EXTERNAL-FILE-WITH-DEPENDENCIES", 1, 0, false);
            declareFunction("external_dependencies_of_type", "EXTERNAL-DEPENDENCIES-OF-TYPE", 1, 0, false);
            declareFunction("get_external_dependency_filename", "GET-EXTERNAL-DEPENDENCY-FILENAME", 1, 0, false);
            declareFunction("undefined_external_dependencies", "UNDEFINED-EXTERNAL-DEPENDENCIES", 1, 0, false);
            declareFunction("external_dependency_definedP", "EXTERNAL-DEPENDENCY-DEFINED?", 1, 0, false);
            declareFunction("redundant_dependencyP", "REDUNDANT-DEPENDENCY?", 4, 0, false);
            declareFunction("get_external_dependency_data", "GET-EXTERNAL-DEPENDENCY-DATA", 1, 0, false);
            declareFunction("doc_filepath", "DOC-FILEPATH", 2, 0, false);
            declareFunction("ext_dep_ends_with", "EXT-DEP-ENDS-WITH", 2, 0, false);
            declareFunction("java_applet_lib_file_path", "JAVA-APPLET-LIB-FILE-PATH", 1, 0, false);
            declareFunction("java_applet_archive_string", "JAVA-APPLET-ARCHIVE-STRING", 1, 0, false);
            declareFunction("html_icon_keywords", "HTML-ICON-KEYWORDS", 0, 0, false);
            declareMacro("def_html_icon", "DEF-HTML-ICON");
            declareFunction("get_html_icon_filename", "GET-HTML-ICON-FILENAME", 1, 0, false);
            declareFunction("get_html_icon_alt_string", "GET-HTML-ICON-ALT-STRING", 1, 0, false);
            declareFunction("html_icon_existsP", "HTML-ICON-EXISTS?", 1, 0, false);
            declareFunction("html_missing_icon", "HTML-MISSING-ICON", 0, 0, false);
            declareFunction("html_icon_file_path", "HTML-ICON-FILE-PATH", 1, 0, false);
            declareFunction("html_icon_src", "HTML-ICON-SRC", 1, 0, false);
            declareMacro("html_icon", "HTML-ICON");
            declareFunction("cb_help_keywords", "CB-HELP-KEYWORDS", 0, 0, false);
            declareMacro("def_cb_help", "DEF-CB-HELP");
            declareFunction("cb_get_help_filename", "CB-GET-HELP-FILENAME", 1, 0, false);
            declareFunction("cb_get_help_desc_string", "CB-GET-HELP-DESC-STRING", 1, 0, false);
            declareFunction("cb_help_existsP", "CB-HELP-EXISTS?", 1, 0, false);
            declareFunction("cb_help_file_path", "CB-HELP-FILE-PATH", 1, 0, false);
            declareFunction("cb_icon_keywords", "CB-ICON-KEYWORDS", 0, 0, false);
            declareMacro("def_cb_icon", "DEF-CB-ICON");
            declareFunction("cb_get_icon_filename", "CB-GET-ICON-FILENAME", 1, 0, false);
            declareFunction("cb_get_icon_alt_string", "CB-GET-ICON-ALT-STRING", 1, 0, false);
            declareFunction("cb_icon_existsP", "CB-ICON-EXISTS?", 1, 0, false);
            declareFunction("cb_missing_icon", "CB-MISSING-ICON", 0, 0, false);
            declareFunction("cb_icon_file_path", "CB-ICON-FILE-PATH", 1, 0, false);
            declareFunction("cb_icon_src", "CB-ICON-SRC", 1, 0, false);
            declareMacro("cb_icon", "CB-ICON");
            declareFunction("compile_cb_browser_dependencies", "COMPILE-CB-BROWSER-DEPENDENCIES", 0, 1, false);
            declareFunction("compile_cb_browser_dependency_definitions", "COMPILE-CB-BROWSER-DEPENDENCY-DEFINITIONS", 0, 0, false);
            declareFunction("cb_browser_dependency_map_keyword_to_path", "CB-BROWSER-DEPENDENCY-MAP-KEYWORD-TO-PATH", 2, 0, false);
            declareFunction("cb_browser_dependency_manifest", "CB-BROWSER-DEPENDENCY-MANIFEST", 0, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_javascript_alt_string", "GET-JAVASCRIPT-ALT-STRING", 1, 0, false);
            declareFunction("javascript_existsP", "JAVASCRIPT-EXISTS?", 1, 0, false);
            declareFunction("missing_javascript", "MISSING-JAVASCRIPT", 0, 0, false);
            declareMacro("javascript", "JAVASCRIPT");
            declareFunction("get_css_alt_string", "GET-CSS-ALT-STRING", 1, 0, false);
            declareFunction("css_existsP", "CSS-EXISTS?", 1, 0, false);
            declareFunction("missing_css", "MISSING-CSS", 0, 0, false);
            declareMacro("css", "CSS");
        }
        return NIL;
    }

    public static SubLObject declare_cyc_file_dependencies_file_Previous() {
        declareMacro("with_new_html_file_dependency_space", "WITH-NEW-HTML-FILE-DEPENDENCY-SPACE");
        declareMacro("with_possibly_new_html_file_dependency_space", "WITH-POSSIBLY-NEW-HTML-FILE-DEPENDENCY-SPACE");
        declareFunction("web_bundle", "WEB-BUNDLE", 1, 0, false);
        declareMacro("def_web_bundle", "DEF-WEB-BUNDLE");
        declareFunction("javascript", "JAVASCRIPT", 1, 0, false);
        declareMacro("def_javascript", "DEF-JAVASCRIPT");
        declareFunction("javascript_keywords", "JAVASCRIPT-KEYWORDS", 0, 0, false);
        declareFunction("get_javascript_filename", "GET-JAVASCRIPT-FILENAME", 1, 0, false);
        declareFunction("javascript_file_path", "JAVASCRIPT-FILE-PATH", 1, 0, false);
        declareFunction("css", "CSS", 1, 0, false);
        declareMacro("def_css", "DEF-CSS");
        declareFunction("css_keywords", "CSS-KEYWORDS", 0, 0, false);
        declareFunction("get_css_filename", "GET-CSS-FILENAME", 1, 0, false);
        declareFunction("css_file_path", "CSS-FILE-PATH", 1, 0, false);
        declareMacro("def_external_file", "DEF-EXTERNAL-FILE");
        declareFunction("check_external_file_definition", "CHECK-EXTERNAL-FILE-DEFINITION", 5, 0, false);
        declareFunction("emit_external_file_with_dependencies", "EMIT-EXTERNAL-FILE-WITH-DEPENDENCIES", 1, 0, false);
        declareFunction("external_dependencies_of_type", "EXTERNAL-DEPENDENCIES-OF-TYPE", 1, 0, false);
        declareFunction("get_external_dependency_filename", "GET-EXTERNAL-DEPENDENCY-FILENAME", 1, 0, false);
        declareFunction("undefined_external_dependencies", "UNDEFINED-EXTERNAL-DEPENDENCIES", 1, 0, false);
        declareFunction("external_dependency_definedP", "EXTERNAL-DEPENDENCY-DEFINED?", 1, 0, false);
        declareFunction("redundant_dependencyP", "REDUNDANT-DEPENDENCY?", 4, 0, false);
        declareFunction("get_external_dependency_data", "GET-EXTERNAL-DEPENDENCY-DATA", 1, 0, false);
        declareFunction("doc_filepath", "DOC-FILEPATH", 2, 0, false);
        declareFunction("ext_dep_ends_with", "EXT-DEP-ENDS-WITH", 2, 0, false);
        declareFunction("java_applet_lib_file_path", "JAVA-APPLET-LIB-FILE-PATH", 1, 0, false);
        declareFunction("java_applet_archive_string", "JAVA-APPLET-ARCHIVE-STRING", 1, 0, false);
        declareFunction("html_icon_keywords", "HTML-ICON-KEYWORDS", 0, 0, false);
        declareMacro("def_html_icon", "DEF-HTML-ICON");
        declareFunction("get_html_icon_filename", "GET-HTML-ICON-FILENAME", 1, 0, false);
        declareFunction("get_html_icon_alt_string", "GET-HTML-ICON-ALT-STRING", 1, 0, false);
        declareFunction("html_icon_existsP", "HTML-ICON-EXISTS?", 1, 0, false);
        declareFunction("html_missing_icon", "HTML-MISSING-ICON", 0, 0, false);
        declareFunction("html_icon_file_path", "HTML-ICON-FILE-PATH", 1, 0, false);
        declareFunction("html_icon_src", "HTML-ICON-SRC", 1, 0, false);
        declareMacro("html_icon", "HTML-ICON");
        declareFunction("cb_help_keywords", "CB-HELP-KEYWORDS", 0, 0, false);
        declareMacro("def_cb_help", "DEF-CB-HELP");
        declareFunction("cb_get_help_filename", "CB-GET-HELP-FILENAME", 1, 0, false);
        declareFunction("cb_get_help_desc_string", "CB-GET-HELP-DESC-STRING", 1, 0, false);
        declareFunction("cb_help_existsP", "CB-HELP-EXISTS?", 1, 0, false);
        declareFunction("cb_help_file_path", "CB-HELP-FILE-PATH", 1, 0, false);
        declareFunction("cb_icon_keywords", "CB-ICON-KEYWORDS", 0, 0, false);
        declareMacro("def_cb_icon", "DEF-CB-ICON");
        declareFunction("cb_get_icon_filename", "CB-GET-ICON-FILENAME", 1, 0, false);
        declareFunction("cb_get_icon_alt_string", "CB-GET-ICON-ALT-STRING", 1, 0, false);
        declareFunction("cb_icon_existsP", "CB-ICON-EXISTS?", 1, 0, false);
        declareFunction("cb_missing_icon", "CB-MISSING-ICON", 0, 0, false);
        declareFunction("cb_icon_file_path", "CB-ICON-FILE-PATH", 1, 0, false);
        declareFunction("cb_icon_src", "CB-ICON-SRC", 1, 0, false);
        declareMacro("cb_icon", "CB-ICON");
        declareFunction("compile_cb_browser_dependencies", "COMPILE-CB-BROWSER-DEPENDENCIES", 0, 1, false);
        declareFunction("compile_cb_browser_dependency_definitions", "COMPILE-CB-BROWSER-DEPENDENCY-DEFINITIONS", 0, 0, false);
        declareFunction("cb_browser_dependency_map_keyword_to_path", "CB-BROWSER-DEPENDENCY-MAP-KEYWORD-TO-PATH", 2, 0, false);
        declareFunction("cb_browser_dependency_manifest", "CB-BROWSER-DEPENDENCY-MANIFEST", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_cyc_file_dependencies_file_alt() {
        deflexical("*JAVASCRIPT-DEFINITIONS*", NIL != boundp($javascript_definitions$) ? ((SubLObject) ($javascript_definitions$.getGlobalValue())) : make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        deflexical("*MISSING-JAVASCRIPT*", $str_alt5$missing_js);
        deflexical("*CSS-DEFINITIONS*", NIL != boundp($css_definitions$) ? ((SubLObject) ($css_definitions$.getGlobalValue())) : make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        deflexical("*MISSING-CSS*", $str_alt19$missing_css);
        deflexical("*JAVA-DEFAULT-DIRECTORY*", $str_alt29$java_);
        deflexical("*HTML-ICON-DEFINITIONS*", NIL != boundp($html_icon_definitions$) ? ((SubLObject) ($html_icon_definitions$.getGlobalValue())) : make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        deflexical("*HTML-ICON-DEFAULT-DIRECTORY*", $str_alt36$);
        deflexical("*HTML-MISSING-ICON*", $str_alt37$missing_gif);
        deflexical("*CB-HELP-DEFINITIONS*", NIL != boundp($cb_help_definitions$) ? ((SubLObject) ($cb_help_definitions$.getGlobalValue())) : make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        deflexical("*CB-HELP-DEFAULT-DIRECTORY*", $str_alt64$help_);
        deflexical("*CB-ICON-DEFINITIONS*", NIL != boundp($cb_icon_definitions$) ? ((SubLObject) ($cb_icon_definitions$.getGlobalValue())) : make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        deflexical("*CB-ICON-DEFAULT-DIRECTORY*", $str_alt67$cb_);
        deflexical("*CB-MISSING-ICON*", $str_alt37$missing_gif);
        return NIL;
    }

    public static SubLObject init_cyc_file_dependencies_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*EXTERNAL-FILE-DEFINITIONS*", SubLTrampolineFile.maybeDefault($external_file_definitions$, $external_file_definitions$, () -> make_hash_table($int$64, UNPROVIDED, UNPROVIDED)));
            defparameter("*HTML-EMITTED-FILE-DEPENDENCIES*", $UNINITIALIZED);
            deflexical("*JAVA-DEFAULT-DIRECTORY*", $str44$java_);
            deflexical("*HTML-ICON-DEFINITIONS*", SubLTrampolineFile.maybeDefault($html_icon_definitions$, $html_icon_definitions$, () -> make_hash_table($int$32, UNPROVIDED, UNPROVIDED)));
            deflexical("*HTML-ICON-DEFAULT-DIRECTORY*", $str52$);
            deflexical("*HTML-MISSING-ICON*", $str53$missing_gif);
            deflexical("*CB-HELP-DEFINITIONS*", SubLTrampolineFile.maybeDefault($cb_help_definitions$, $cb_help_definitions$, () -> make_hash_table($int$32, UNPROVIDED, UNPROVIDED)));
            deflexical("*CB-HELP-DEFAULT-DIRECTORY*", $str81$help_);
            deflexical("*CB-ICON-DEFINITIONS*", SubLTrampolineFile.maybeDefault($cb_icon_definitions$, $cb_icon_definitions$, () -> make_hash_table($int$32, UNPROVIDED, UNPROVIDED)));
            deflexical("*CB-ICON-DEFAULT-DIRECTORY*", $str84$cb_);
            deflexical("*CB-MISSING-ICON*", $str53$missing_gif);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*JAVASCRIPT-DEFINITIONS*", NIL != boundp($javascript_definitions$) ? ((SubLObject) ($javascript_definitions$.getGlobalValue())) : make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
            deflexical("*MISSING-JAVASCRIPT*", $str_alt5$missing_js);
            deflexical("*CSS-DEFINITIONS*", NIL != boundp($css_definitions$) ? ((SubLObject) ($css_definitions$.getGlobalValue())) : make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
            deflexical("*MISSING-CSS*", $str_alt19$missing_css);
            deflexical("*JAVA-DEFAULT-DIRECTORY*", $str_alt29$java_);
            deflexical("*HTML-ICON-DEFINITIONS*", NIL != boundp($html_icon_definitions$) ? ((SubLObject) ($html_icon_definitions$.getGlobalValue())) : make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
            deflexical("*HTML-ICON-DEFAULT-DIRECTORY*", $str_alt36$);
            deflexical("*HTML-MISSING-ICON*", $str_alt37$missing_gif);
            deflexical("*CB-HELP-DEFINITIONS*", NIL != boundp($cb_help_definitions$) ? ((SubLObject) ($cb_help_definitions$.getGlobalValue())) : make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
            deflexical("*CB-HELP-DEFAULT-DIRECTORY*", $str_alt64$help_);
            deflexical("*CB-ICON-DEFINITIONS*", NIL != boundp($cb_icon_definitions$) ? ((SubLObject) ($cb_icon_definitions$.getGlobalValue())) : make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
            deflexical("*CB-ICON-DEFAULT-DIRECTORY*", $str_alt67$cb_);
            deflexical("*CB-MISSING-ICON*", $str_alt37$missing_gif);
        }
        return NIL;
    }

    public static SubLObject init_cyc_file_dependencies_file_Previous() {
        deflexical("*EXTERNAL-FILE-DEFINITIONS*", SubLTrampolineFile.maybeDefault($external_file_definitions$, $external_file_definitions$, () -> make_hash_table($int$64, UNPROVIDED, UNPROVIDED)));
        defparameter("*HTML-EMITTED-FILE-DEPENDENCIES*", $UNINITIALIZED);
        deflexical("*JAVA-DEFAULT-DIRECTORY*", $str44$java_);
        deflexical("*HTML-ICON-DEFINITIONS*", SubLTrampolineFile.maybeDefault($html_icon_definitions$, $html_icon_definitions$, () -> make_hash_table($int$32, UNPROVIDED, UNPROVIDED)));
        deflexical("*HTML-ICON-DEFAULT-DIRECTORY*", $str52$);
        deflexical("*HTML-MISSING-ICON*", $str53$missing_gif);
        deflexical("*CB-HELP-DEFINITIONS*", SubLTrampolineFile.maybeDefault($cb_help_definitions$, $cb_help_definitions$, () -> make_hash_table($int$32, UNPROVIDED, UNPROVIDED)));
        deflexical("*CB-HELP-DEFAULT-DIRECTORY*", $str81$help_);
        deflexical("*CB-ICON-DEFINITIONS*", SubLTrampolineFile.maybeDefault($cb_icon_definitions$, $cb_icon_definitions$, () -> make_hash_table($int$32, UNPROVIDED, UNPROVIDED)));
        deflexical("*CB-ICON-DEFAULT-DIRECTORY*", $str84$cb_);
        deflexical("*CB-MISSING-ICON*", $str53$missing_gif);
        return NIL;
    }

    public static final SubLObject setup_cyc_file_dependencies_file_alt() {
        declare_defglobal($javascript_definitions$);
        declare_defglobal($css_definitions$);
        declare_defglobal($html_icon_definitions$);
        declare_defglobal($cb_help_definitions$);
        declare_defglobal($cb_icon_definitions$);
        register_external_symbol(COMPILE_CB_BROWSER_DEPENDENCIES);
        register_external_symbol(CB_BROWSER_DEPENDENCY_MANIFEST);
        return NIL;
    }

    public static SubLObject setup_cyc_file_dependencies_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($external_file_definitions$);
            register_macro_helper(CHECK_EXTERNAL_FILE_DEFINITION, DEF_EXTERNAL_FILE);
            register_macro_helper(UNDEFINED_EXTERNAL_DEPENDENCIES, DEF_EXTERNAL_FILE);
            register_macro_helper($sym42$REDUNDANT_DEPENDENCY_, DEF_EXTERNAL_FILE);
            register_macro_helper(EXT_DEP_ENDS_WITH, $list43);
            declare_defglobal($html_icon_definitions$);
            declare_defglobal($cb_help_definitions$);
            declare_defglobal($cb_icon_definitions$);
            register_external_symbol(COMPILE_CB_BROWSER_DEPENDENCIES);
            register_external_symbol(CB_BROWSER_DEPENDENCY_MANIFEST);
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($javascript_definitions$);
            declare_defglobal($css_definitions$);
        }
        return NIL;
    }

    public static SubLObject setup_cyc_file_dependencies_file_Previous() {
        declare_defglobal($external_file_definitions$);
        register_macro_helper(CHECK_EXTERNAL_FILE_DEFINITION, DEF_EXTERNAL_FILE);
        register_macro_helper(UNDEFINED_EXTERNAL_DEPENDENCIES, DEF_EXTERNAL_FILE);
        register_macro_helper($sym42$REDUNDANT_DEPENDENCY_, DEF_EXTERNAL_FILE);
        register_macro_helper(EXT_DEP_ENDS_WITH, $list43);
        declare_defglobal($html_icon_definitions$);
        declare_defglobal($cb_help_definitions$);
        declare_defglobal($cb_icon_definitions$);
        register_external_symbol(COMPILE_CB_BROWSER_DEPENDENCIES);
        register_external_symbol(CB_BROWSER_DEPENDENCY_MANIFEST);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cyc_file_dependencies_file();
    }

    @Override
    public void initializeVariables() {
        init_cyc_file_dependencies_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyc_file_dependencies_file();
    }

    static {
    }
}

/**
 * Total time: 256 ms
 */
